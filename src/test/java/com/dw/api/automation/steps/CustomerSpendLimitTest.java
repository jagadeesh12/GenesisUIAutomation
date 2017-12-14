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

public class CustomerSpendLimitTest {
	
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
		System.out.println("*************Customer Spend limit Update Flow Started*************");
		test = ExtentManager.loggerInstance(extent, " Test Case: Customer Spend Limit Approval");
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
	// Login as PM
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
	
	@Test(priority = 3)
	public void updateCustomerSpendlimit(){
		String customerSpendLimitParams="{\"availableCredit\":\"100.00\",\"comment\":\"CustomerSpendlimitIncreased\",\"credit\":\"500\"}";
		System.out.println("Customer Spend limit Parameters" + customerSpendLimitParams);
		Put p = new Put();
		String customerSpendLimitUrl = "https://test.redington.market/api/v1/endCustomer/"+customerId+"/creditLimitRequest";
		System.out.println("Customer Spend Limit URL is "+customerSpendLimitUrl);
		response=p.put(customerSpendLimitUrl, customerSpendLimitParams, cook);
		Assert.assertEquals(response.getStatus(), 200, "Valid Response");
		logPassStatus(" Customer Spend limit has been updated to 500 <br/>"+"Response Status="+response.getStatus() );
		System.out.println("*************Customer Spend limit Update Flow Ended*************");
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