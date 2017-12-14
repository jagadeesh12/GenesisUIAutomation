package com.dw.api.automation.steps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.NewCookie;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
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

public class OrganizationCreditRequestTest {
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
		System.out.println("*************Organization Credit Request and Approval Flow Started*************");		
		test = ExtentManager.loggerInstance(extent, " Test Case: Organization Credit request and Approval");
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
	public void orgCreditRequestPM(){
		
		String orgCreditRequestParams="{\"comment\": \"Please Approve 1000 dollars\",\"credit\": \"1000\",\"partnerEntityId\":\""+partnerEntityId+"\"}";
		System.out.println("Org Credit Request Parameters" + orgCreditRequestParams);
		Put p = new Put();
		String orgCreditRequestUrl = "https://test.redington.market/api/v1/partnerEntity/"+partnerEntityId+"/creditLimitRequest";
		System.out.println("Org Credit Request Approval URL" + orgCreditRequestUrl);
		System.out.println("PARTNER ENTITY ID DURING PM CREDIT REQUEST =" +partnerEntityId);
		response=p.put(orgCreditRequestUrl, orgCreditRequestParams, cook);
		System.out.println("Response after PM Credit Request" +response);
	//	Assert.assertEquals(response.getStatus(), 200, "Valid Response");
		logPassStatus(" Organisation Credit Request has been raised to 1000 <br/>"+"Response Status="+response.getStatus());
		
	}
	
	@Test(priority = 4)
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
	
	@Test(priority = 5)
	public void orgCreditApproveCA(){
		
		String orgCreditApproveParams="{\"credit\":\"1000\",\"status\":\"APPROVED\"}";
		System.out.println("Org Credit Approve Parameters" + orgCreditApproveParams);
		Put p = new Put();
		String orgCreditApprovalUrl = "https://test.redington.market/api/v1/partnerEntity/"+partnerEntityId+"/creditLimitApproval";
		System.out.println("Organization Credit Approval URL" +orgCreditApprovalUrl);
		System.out.println("PARTNER ENTITY ID DURING CA CREDIT APPROVAL =" +partnerEntityId);
		response=p.put(orgCreditApprovalUrl, orgCreditApproveParams, cook);
		System.out.println("Response after CA Credit Approval" +response);
	//	Assert.assertEquals(response.getStatus(), 200, "Valid Response");
		logPassStatus(" Organisation Credit Request has been Approved to 1000 for Organization <br/>"+"Response Status="+response.getStatus() );
		System.out.println("*************Organization Credit Request and Approval Flow Ended*************");
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