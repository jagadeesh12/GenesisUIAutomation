package com.dw.api.automation.steps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
import com.dw.api.automation.libs.ExcelReader;
import com.dw.api.automation.libs.FilloExcelUtility;
import com.dw.api.automation.libs.Get;
import com.dw.api.automation.libs.LoginPost;
import com.dw.api.automation.libs.Post;
import com.dw.api.automation.libs.Put;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import junit.framework.Assert;

public class AddNewPartnerOrganisationTest {
	static NewCookie cook;
	LoginPost lgoin = new LoginPost();
	Get get = new Get();
	ExtentReports extent;
	static ExtentTest test;
	ClientResponse response = null;
	HashMap<String, LinkedHashMap<Integer, List>> outerMap = new LinkedHashMap<String, LinkedHashMap<Integer, List>>();
	HashMap<String, String> testdatamap = null;
	Object partnerEntityId;
	private List li;

	@BeforeClass
	public void initateExtentManager() {
		extent = ExtentManager.Instance();
	}

	@Test(priority = 1)
	public void login_to_application() {
		testdatamap = FilloExcelUtility.readExcel();
		test = ExtentManager.loggerInstance(extent, " Test case: Add NewPartnerOrganisation");

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
	public void enter_mpn_id() {

		testdatamap = FilloExcelUtility.readExcel();
		// String
		// verifyMPNidUrl="https://test.redington.market/api/v1/partnerEntity/verifyMPN/991450";
		String verifyMPNidUrl = testdatamap.get("verifyMPNidUrl");
		System.out.println("verifyMPNidUrl=" + verifyMPNidUrl);
		System.out.println("cookie=" + cook);

		response = get.getRestServiceMethod(verifyMPNidUrl, cook);

	//	Assert.assertEquals(200, 200);
		logPassStatus("Validate MPN id" + "<br/>rep" + response.getStatus());

	}

	@Test(priority = 3)
	public void addNewPartnerOrganisation() throws FileNotFoundException {
		testdatamap = FilloExcelUtility.readExcel();
		String addNewPartnerOrganisationUrl = testdatamap.get("addNewPartnerOrganisationUrl");
		System.out.println("addNewPartnerOrganisationUrl=" + addNewPartnerOrganisationUrl);
		// multivalued form data call
		
		//for windows
		//File initialFile = new File("C:/Users/rle0517/Desktop/6.jpg");
		
		//for linux
		File initialFile = new File("/var/lib/jenkins/jobs/Genesis_API_Automation/workspace/src/test/resources/files/6.jpg");
		InputStream targetStream1 = new FileInputStream(initialFile);
		InputStream targetStream2 = new FileInputStream(initialFile);
		InputStream targetStream3 = new FileInputStream(initialFile);
		InputStream targetStream4 = new FileInputStream(initialFile);
		InputStream targetStream5 = new FileInputStream(initialFile);
		HashMap<String, InputStream> fileloc = new HashMap<String, InputStream>();
		fileloc.put("f1", targetStream1);
		fileloc.put("f2", targetStream2);
		fileloc.put("f3", targetStream3);
		fileloc.put("f4", targetStream4);
		fileloc.put("f5", targetStream5);
		FormDataMultiPart formData = new FormDataMultiPart();
		formData.bodyPart(new FileDataBodyPart("logo", initialFile));
		formData.bodyPart(new FileDataBodyPart("Trade License Copy with Partners Page", initialFile));
		formData.bodyPart(new FileDataBodyPart("MOA / Shareholding letter (whichever is applicable)", initialFile));
		formData.bodyPart(new FileDataBodyPart("Trade License Copy with Share Certificate", initialFile));
		formData.bodyPart(new FileDataBodyPart("Owner/Decision Maker/Authorized Signatory Passport Copy with Visa Page",
				initialFile));
		formData.field("tradeLicenseValidityFrom", "2017-11-04");
		formData.field("tradeLicenseValidityTo", "2018-11-26");
		formData.field("existingType", "New");
		String entityName = testdatamap.get("entityName");
		System.out.println("entityName=" + entityName);
		formData.field("entityName", entityName);
		String mpnId = testdatamap.get("mpnId");
		formData.field("mpnId", mpnId);
		formData.field("addressLine1", "addressLine1");
		formData.field("addressLine2", "addressLine2");
		formData.field("addressLine3", "addressLine3");

		formData.field("pinCode", "60254");
		formData.field("countryCode", "ARE");
		formData.field("region", "008");
		formData.field("city", "dubai");
		formData.field("contactMobile", "3424242424243");
		formData.field("phoneNumber", "2323232323233");
		formData.field("signingAuthorityName", "signingAuthority");
		formData.field("signingAuthorityEmail", "signingAuthority@fff.com");
		formData.field("financeApproval", "false");
		formData.field("partnerSegment", "Advisor & Consulting Services");
		FilloExcelUtility.updateRow("domainName", "AddNewPartnerOrganisationTest");
		testdatamap = FilloExcelUtility.readExcel();
		String domainName = testdatamap.get("domainName");

		domainName = "www." + domainName + ".com";
		System.out.println("Domain name=" + domainName);
		formData.field("fqdn", domainName);
		FilloExcelUtility.updateRow("tradeLicenseNo", "AddNewPartnerOrganisationTest");
		testdatamap = FilloExcelUtility.readExcel();
		String tradeLicenseNo = testdatamap.get("tradeLicenseNo");
		System.out.println("tradeLicenseNo=" + tradeLicenseNo);
		formData.field("tradeLicenseNo", tradeLicenseNo);
		FilloExcelUtility.updateRow("vatId", "AddNewPartnerOrganisationTest");
		testdatamap = FilloExcelUtility.readExcel();
		String vatId = testdatamap.get("vatId");
		System.out.println("vatId=" + vatId);
		formData.field("vatId", vatId);
		formData.field("termsAndConditions", "on");
		Post postcall = new Post();

		response = postcall.postMultiValuedWithAttachments(addNewPartnerOrganisationUrl, fileloc, formData, cook);
		// Assert.assertEquals("Partner organization with these details already exits in
		// the system",200 , response.getStatus());

		// System.out.println(response.toString());
		// logPassStatus("New Partner created "+"<br/>Response=" +response.toString());
		logPassStatus("New Partner created");
	}

	@Test(priority = 4)
	public void orgApproveByBaM() {
		try {
			CertificateHandle.IgnoreSSLClient();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String bamSignInUrl = "https://test.redington.market/api/v1/auth/signIn";
		String postparm = "{\"username\":\"bam@axsup.net\",\"password\":\"Pass@123\"}";
		cook = lgoin.loginGetPostByJersey(bamSignInUrl, postparm);
		System.out.println("Cookie as Token paramter=" + cook);
		logPassStatus("login to Application with Userid=pm6.qa@mailinator.com Password=Pass@123");

	}

	// org search by BAN
	@Test(priority = 5)
	public void orgBamSearch() {
		testdatamap = FilloExcelUtility.readExcel();
		String domainName = testdatamap.get("domainName");
		domainName = "www." + domainName + ".com";
		System.out.println("Domain name=" + domainName);

		// autoupdate domain nmae

		String orgBamSearchGetUrl = "https://test.redington.market/api/v1/partnerEntity/approvalList?page=1&pageSize=10&sortBy=modifiedOn&sortOrder=desc&searchKey="
				+ domainName + "";
		System.out.println("orgBamSearchGetUrl=" + orgBamSearchGetUrl);
		System.out.println("Cookie as Token paramter=" + cook);
		String res = get.getRestServiceMethod2(orgBamSearchGetUrl, cook);

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

		// details get method
		String approvePartnerOrgUrl = "https://test.redington.market/api/v1/partnerEntity/" + partnerEntityId + "";

		System.out.println("approvePartnerOrgUrl=" + approvePartnerOrgUrl);
		get.getRestServiceMethod(approvePartnerOrgUrl, cook);

		System.out.println("Cookie====" + cook);

		String put = "{\"status\": \"APPROVED\",\"comment\": \"done\",\"credit\":\"500\",\"financeApproval\": \"false\",\"financeEmail\":\"null\",\"partnerEntityId\":\""
				+ partnerEntityId + "\"}";
		System.out.println("put=" + put);
		// String put2 =
		// "{\"comment\":\"yes\",\"credit\":\"500\",\"financeApproval\":\"true\",\"financeEmail\":\"fm6.qa@mailinator.com\",\"partnerEntityId\":\"5a24e4b018a0d83986279e35\",\"status\":\"APPROVED\"}";

		Put p = new Put();
		String orgBamApprovalUrl = "https://test.redington.market/api/v1/partnerEntity/" + partnerEntityId
				+ "/changeStatus";
		System.out.println("orgBamApprovalUrl=" + orgBamApprovalUrl);
		p.put(orgBamApprovalUrl, put, cook);

		logPassStatus(" Organisation Search Sucessfull ");

	}

	@Test(priority = 6)
	public void loginToCAuser() {
		testdatamap = FilloExcelUtility.readExcel();
		

		try {
			CertificateHandle.IgnoreSSLClient();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String p = null;
		String posturl = testdatamap.get("testurl");
		System.out.println("Login Url=" + posturl);
		String username = testdatamap.get("causername");
		System.out.println("CA User name==" + username);
		String password = testdatamap.get("capassword");
		System.out.println("CA Password==" + password);
		String postparm = "{\"username\":\"" + username + "\",\"password\":\"" + password + "\"}";
		cook = lgoin.loginGetPostByJersey(posturl, postparm);
		System.out.println("Cookie as Token paramter=" + cook);
		logPassStatus("login to C.A Application with Userid=ca@nezdiro.org Password=Pass@123");
	}
	
	@Test(priority =7)
	public void orgApprovalByCA()
	{
		testdatamap = FilloExcelUtility.readExcel();
		System.out.println("partnerEntityId="+partnerEntityId);
	String vatid=testdatamap.get("vatId");
	System.out.println("vatid="+vatid);
		String orgApprovalByCAUrl="https://test.redington.market/api/v1/partnerEntity/"+partnerEntityId+"/changeStatus";
		String orgApprovalParms= "{\"VATClass\":\"0\",\"billingCurrency\":\"USD\",\"comment\":\"Approved from CA\",\"companyCode\":\"9110/Redn Saudi Arabia Co\",\"credit\":\"500\",\"partnerEntityId\":\""+partnerEntityId+"\",\"paymentTerm\":\"Advance payment\",\"status\":\"APPROVED\",\"vatId\":\""+vatid+"\"}";
		System.out.println("orgApprovalByCAUrl="+orgApprovalByCAUrl);
		System.out.println("orgApprovalParms="+orgApprovalParms);
		
		Put p = new Put();
		p.put(orgApprovalByCAUrl, orgApprovalParms, cook);
		logPassStatus(" Organisation Approval Sucess " );
		
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