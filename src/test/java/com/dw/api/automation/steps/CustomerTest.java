package com.dw.api.automation.steps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.NewCookie;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dw.api.automation.extent.ExtentManager;
import com.dw.api.automation.libs.CertificateHandle;
import com.dw.api.automation.libs.FilloExcelUtility;
import com.dw.api.automation.libs.Get;
import com.dw.api.automation.libs.LoginPost;
import com.dw.api.automation.libs.Post;
import com.dw.api.automation.libs.Put;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jersey.api.client.ClientResponse;

public class CustomerTest {

	static NewCookie cook;
	LoginPost lgoin = new LoginPost();
	Get get = new Get();
	Post post = new Post();
	ExtentReports extent;
	static ExtentTest test;
	ClientResponse response = null;
	HashMap<String, String> testdatamap = null;
	Object partnerEntityId = null;

	@BeforeClass
	public void initateExtentManager() {
		extent = ExtentManager.Instance();
	}

	@Test(priority = 1)
	public void login_to_application() {
		test = ExtentManager.loggerInstance(extent, " Test Case: Customer OnBoarding");
		testdatamap = FilloExcelUtility.readExcel();
		try {
			CertificateHandle.IgnoreSSLClient();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String p = null;

		// String posturl="https://test.redington.market/api/v1/auth/signIn";
		// String
		// postparmdup="{\"username\":\"pm6.qa@mailinator.com\",\"'"+p+"'\":\"Pass@123\"}";

		String posturl = testdatamap.get("testurl");
		System.out.println("Login Url=" + posturl);
		String username = testdatamap.get("username");
		System.out.println("User name==" + username);
		String password = testdatamap.get("password");
		System.out.println("Password==" + password);

		String postparm = "{\"username\":\"" + username + "\",\"password\":\"" + password + "\"}";
		// String
		// postparm="{\"username\":\"pm6.qa@mailinator.com\",\"password\":\"Pass@123\"}";

		cook = lgoin.loginGetPostByJersey(posturl, postparm);
		System.out.println("Cookie as Token paramter=" + cook);

		logPassStatus("login to Application with Userid=pm6.qa@mailinator.com Password=Pass@123");
	}

	@Test(priority = 2)
	public void getPartnerEntityid() {
		FilloExcelUtility.updateRow("customerdomainName", "CustomerTest");
		testdatamap = FilloExcelUtility.readExcel();
		String domainName = testdatamap.get("domainName");
		System.out.println("domainName=" + domainName);
		String getPartnerEntityidUrl = "https://test.redington.market/api/v1/partnerEntity?page=1&pageSize=10&sortBy=modifiedOn&sortOrder=desc&searchKey="
				+ domainName + "";
		System.out.println("getPartnerEntityidUrl=" + getPartnerEntityidUrl);
		String res = get.getRestServiceMethod2(getPartnerEntityidUrl, cook);
		JSONObject obj = new JSONObject(res);
		JSONArray docsArray = new JSONObject(res).getJSONObject("data").getJSONArray("docs");
		JSONObject obj2 = null;
		List li = new ArrayList();
		for (Object object : docsArray) {
			obj2 = new JSONObject(object.toString());
			// System.out.println("The id is ========="+ obj2.get("_id"));
		}
		System.out.println("The id is =========" + obj2.get("_id"));
		partnerEntityId = obj2.get("_id");
		logPassStatus("Get PartnerEntityid=" + "<br/>partnerEntityId=" + partnerEntityId);
	}

	@Test(priority = 3)
	public void createNewCustomer() {
		/* verify Existing customer API */
		FilloExcelUtility.updateRow("customerdomainName", "CustomerTest");

		testdatamap = FilloExcelUtility.readExcel();
		String domainName = testdatamap.get("domainName");
		String customerdomainName = testdatamap.get("customerdomainName");
		customerdomainName = customerdomainName + ".onmicrosoft.com";
		System.out.println("customerdomainName=" + customerdomainName);

		FilloExcelUtility.updateRow("companyName", "CustomerTest");
		testdatamap = FilloExcelUtility.readExcel();
		String companyName = testdatamap.get("companyName");
		System.out.println("companyName=" + companyName);
		String newCustGetUrl = "https://test.redington.market/api/v1/endCustomers/domainCheck?countryCode=are&domain="
				+ customerdomainName + "";
		System.out.println("newCustGetUrl=" + newCustGetUrl);
		System.out.println("cookie" + cook);
		response = get.getRestServiceMethod(newCustGetUrl, cook);
		System.out.println("Create New Customr Response code=" + response.getStatus());
		System.out.println("Create New Customr Response=" + response.getHeaders().toString());

		String newCustPostUrl = "https://test.redington.market/api/v1/endcustomer";

		String newCustomerpayload = "{\"endCustomerType\": \"New\",\"CompanyName\": \"" + companyName + "\","
				+ "\"ContactFirstName\": \"ApiFirstname\"," + " \"ContactLastName\": \"ApiLastName\","
				+ "\"Address\": {" + "\"Address1\": \"Address1\"," + "\"Address2\": \"Address2\","
				+ "\"Address3\": \"Address3\"}," + "\"City\": \"kuwait\"," + "\"Entity\": \"" + partnerEntityId + "\","
				+ "\"pinCode\": \"75001\"," + "\"CountryId\": \"KWT\"," + "\"PhoneNumber\": \"9008252576\","
				+ "\"MobileNumber\": \"9008252576\"," + "\"Email\": \"checkmail@gmail.com\","
				+ "\"ManagementTypeId\": \"Billing-Only\"," + "\"SpendLimit\": \"100\"," + "\"Department\": \"cse\","
				+ "\"Function\": \"devops\"," + "\"PaymentTypeId\": \"Monthly-Invoice\","
				+ "\"termsAndConditions\": true," + "\"DomainName\": \"" + customerdomainName + "\","
				+ "\"PartnerEntityId\": \"" + partnerEntityId + "\"}";
		System.out.println("newCustomerpayload=" + newCustomerpayload);
		response = post.getPostByJersey("https://test.redington.market/api/v1/endcustomer", newCustomerpayload, cook);
		System.out.println("Cookie as Token paramter=" + cook);
		System.out.println("Create New Customr Response code=" + response.getStatus());
		System.out.println("Create New Customr Response=" + response.toString());
		logPassStatus("New Customer Created Sucessfuly   CustomerName=" + "<br/>companyName=" + companyName);
	}

	@Test(priority = 4)
	// Login as Bam
	public void loginByBaM() {
		try {
			CertificateHandle.IgnoreSSLClient();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		testdatamap = FilloExcelUtility.readExcel();

		String bamUrl = testdatamap.get("bamUrl");
		System.out.println("bamUrl=" + bamUrl);
		String bamusername = testdatamap.get("bamusername");
		System.out.println("bamusername=" + bamusername);
		String bampassword = testdatamap.get("bampassword");
		System.out.println("bampassword=" + bampassword);

		String postparm = "{\"username\":\"" + bamusername + "\",\"password\":\"" + bampassword + "\"}";
		cook = lgoin.loginGetPostByJersey(bamUrl, postparm);
		System.out.println("Cookie as Token paramter=" + cook);
		logPassStatus("login to Application with with BAM Userid=bam@axsup.net Password=Pass@123");

	}

	@Test(priority = 5)
	// Login as Bam
	public void getCustomerId() {
		testdatamap = FilloExcelUtility.readExcel();
		String companyName = testdatamap.get("companyName");
		System.out.println("companyName=" + companyName);
		String getCustomerIdUrl = "https://test.redington.market/api/v1/endcustomer/approvalList?page=1&pageSize=10&sortBy=ModifiedOn&sortOrder=desc&searchKey="
				+ companyName + "";
		System.out.println("getCustomerIdUrl=" + getCustomerIdUrl);

		String res = get.getRestServiceMethod2(getCustomerIdUrl, cook);

		JSONObject obj = new JSONObject(res);
		JSONArray docsArray = new JSONObject(res).getJSONObject("data").getJSONArray("docs");
		JSONObject obj2 = null;
		List li = new ArrayList();
		for (Object object : docsArray) {
			obj2 = new JSONObject(object.toString());
			// System.out.println("The id is ========="+ obj2.get("_id"));
		}
		System.out.println("The id is =========" + obj2.get("_id"));
		partnerEntityId = obj2.get("_id");
		logPassStatus("Get Customer id " + "<br/> Customer id=" + partnerEntityId);

	}

	@Test(priority = 6)
	public void approveCustomerFromBam() 
	{
		System.out.println("The id is =========" + partnerEntityId);
		String approveCustomerFrmBamUrl="https://test.redington.market/api/v1/endCustomer/"+partnerEntityId+"/changeStatus";
		System.out.println("approveCustomerFrmBamUrl="+approveCustomerFrmBamUrl);
		String put ="{\"comment\":\"Done\",\"status\":\"APPROVED\"}";
		System.out.println("approvalParamters="+put); 
		Put p = new Put();
		p.put(approveCustomerFrmBamUrl, put, cook);
		testdatamap = FilloExcelUtility.readExcel();
		String companyName = testdatamap.get("companyName");
		logPassStatus("Customer has been Approved " + "<br/> Customer name=" + companyName);
	}
	public void logPassStatus(String statusMsg) {
		test.log(LogStatus.PASS, statusMsg);

	}

	@AfterClass
	public void tear() {
		extent.endTest(test);
		extent.flush();
	}

	@AfterMethod
	public synchronized void afterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			// test.log(LogStatus.FAIL,result.getThrowable()+
			// test.addScreenCapture(ExtentManager.CaprtureScreenshot(driver,result.getInstanceName())));
			test.log(LogStatus.FAIL, result.getThrowable());
		}
	}

}
