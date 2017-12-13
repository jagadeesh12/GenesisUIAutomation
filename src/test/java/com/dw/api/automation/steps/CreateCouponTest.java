package com.dw.api.automation.steps;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
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
import com.dw.api.automation.libs.ParseJsonArray;
import com.dw.api.automation.libs.Post;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jersey.api.client.ClientResponse;

public class CreateCouponTest {
	
	static NewCookie cook;
	LoginPost lgoin = new LoginPost();
	Get get = new Get();
	Post post = new Post();
	ExtentReports extent;
	static ExtentTest test;
	ClientResponse response = null;
	HashMap<String, String> testdatamap = null;
	Object partnerEntityId = null;
	Object customerId = null;
	Object sku = null;

	@BeforeClass
	public void initateExtentManager() {
		extent = ExtentManager.Instance();
	}

	@Test(priority = 1)
	public void login_to_application() {
		test = ExtentManager.loggerInstance(extent, " Test Case: Coupon Create by BAM");
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

		logPassStatus("Login to Application with Userid=pm6.qa@mailinator.com Password=Pass@123");
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
	// Login as Bam
	public void getCustomerId() {
		testdatamap = FilloExcelUtility.readExcel();
		String companyName = testdatamap.get("companyName");
		System.out.println("companyName=" + companyName);
		/*String getCustomerIdUrl = "https://test.redington.market/api/v1/endcustomer/approvalList?page=1&pageSize=10&sortBy=ModifiedOn&sortOrder=desc&searchKey="
				+ companyName + "";*/
		String getCustomerIdUrl = "https://test.redington.market/api/v1/endcustomers?page=1&pageSize=10&sortBy=ModifiedOn&sortOrder=desc&searchKey="
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
		customerId = obj2.get("_id");
		logPassStatus("Get Customer id " + "<br/> Customer id=" + customerId);

	}
	@Test(priority = 4)
	public void searchBaseProduct()
	{
		testdatamap = FilloExcelUtility.readExcel();
		String marketPlaceBaseUrl=testdatamap.get("marketPlaceBaseUrl");
		System.out.println("marketPlaceBaseUrl=" + marketPlaceBaseUrl);
		System.out.println("Cookie as Token paramter=" + cook);
		String res = get.getRestServiceMethod2(marketPlaceBaseUrl, cook);
				
		 sku = ParseJsonArray.parseJsonArray(res, "data", "items", "sku");
		System.out.println("sku id="+sku);
		//logPassStatus("login to Application with Userid=pm6.qa@mailinator.com Password=Pass@123");
		logPassStatus("Search for Base Product Office-365-Enterprise-E3  is  sucessfull  "+"<br/> sku-id="+sku);
	
	}
	
	@Test(priority = 5)
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
		logPassStatus("Login to Application with with BAM Userid=bam@axsup.net Password=Pass@123");

	}
	
	@Test(priority = 6)
	public void createCoupon(){
		Date date = new Date();
		String currentDate= new SimpleDateFormat("yyyy-MM-dd").format(date);
		System.out.println("Todays date is " + currentDate); 
		//+ "\"startsFrom\": \"2017-12-13\","
		
		String couponCreateURL="https://test.redington.market/api/v1/coupon";
		String coupondetailparams="{\"rules\": { \"products\": [ {"
				+ "\"productId\": \""+sku+"\","
				+ "\"quantity\": \"2\","
				+ "\"discount\": \"10\","
				+ "\"sku\": \""+sku+"\","
				+ "\"price\": \"18.18\","
				+ "\"Addproduct\": \"12\","
				+ "\"actualPrice\": 18.18}],"
				+ "\"country\": \"ARE\","
				+ "\"currencyCode\": \"USD\","
				+ "\"entity\": \""+partnerEntityId+"\","
				+ "\"endCustomer\": \""+customerId+"\","
				+ "\"product\": \"\","
				+ "\"push\": \"ARE\","
				+ "\"startsFrom\": \""+currentDate+"\","
				+ "\"expiresOn\": \"2019-12-12\"},"
				+ "\"type\": \"USER\"}";
		System.out.println(" Coupon Parameters" + coupondetailparams);
		//response = post.getPostByJersey("https://test.redington.market/api/v1/endcustomer", newCustomerpayload, cook);
	    response=post.getPostByJersey(couponCreateURL, coupondetailparams, cook);
		System.out.println("Cookie as Token paramter for Coupon create=" + cook);
		System.out.println("Coupon create Response code=" + response.getStatus());
		
	}
	
	@Test(priority = 7)	
	public void getCouponCode() {
		testdatamap = FilloExcelUtility.readExcel();
		String companyName = testdatamap.get("companyName");
		System.out.println("companyName=" + companyName);
		String getCouponCodeUrl = "https://test.redington.market/api/v1/coupon?page=1&pageSize=10&sortOrder=desc&sortBy=modifiedOn&searchKey="
		+ companyName + "";
		System.out.println("getCouponCodeUrl=" + getCouponCodeUrl);

		String res = get.getRestServiceMethod2(getCouponCodeUrl, cook);

		JSONObject obj = new JSONObject(res);
		JSONArray docsArray = new JSONObject(res).getJSONObject("data").getJSONArray("docs");
		JSONObject obj2 = null;
		List li = new ArrayList();
		for (Object object : docsArray) {
			obj2 = new JSONObject(object.toString());
			// System.out.println("The id is ========="+ obj2.get("_id"));
		}
		System.out.println("The Coupon code id is =========" + obj2.get("couponCode"));
		Object couponCode = obj2.get("couponCode");
		logPassStatus("Coupon Code is created sucessfully " + "<br/> Coupon Code is=" + couponCode);

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
