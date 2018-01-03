package com.dw.api.automation.TestScripts;

import java.util.HashMap;

import javax.ws.rs.core.NewCookie;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dw.api.automation.extent.ExtentManager;
import com.dw.api.automation.libs.FilloExcelUtility;
import com.dw.api.automation.libs.Get;
import com.dw.api.automation.pagefactory.ApiLoginPF;
import com.dw.api.automation.pagefactory.CustomerPF;
import com.dw.api.automation.pagefactory.OrderProvisonPF;
import com.dw.api.automation.pagefactory.OrganisationPF;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jersey.api.client.ClientResponse;

public class OrderProvisonTest {
	
	
	static NewCookie cook;
	ApiLoginPF login=new ApiLoginPF();
	ExtentReports extent;
	static ExtentTest test;
	ClientResponse response = null;
	HashMap<String, String> testdatamap = null;
	OrderProvisonPF order=new OrderProvisonPF();
	String testColomName="OrderProvisonTest";
	String depdentTestColomName1="CustomerOnBoardingTest";
	String depdentTestColomName2="MarketPlaceAndContractManagementTest";
	
	@BeforeClass
	public void initateExtentManager() {
		extent = ExtentManager.Instance();
	}
	/*Login to Application as Site Admin*/
	@Test(priority = 1)
	public void loginAsPm()
	{
		test = ExtentManager.loggerInstance(extent, " Use Case: Order Provision");
		testdatamap = FilloExcelUtility.readExcelWithTestName("login");
		 String posturl = testdatamap.get("testurl");
		System.out.println("Login Url=" + posturl);
		String username = testdatamap.get("username");
		System.out.println("User name==" + username);
		String password = testdatamap.get("password");
		System.out.println("Password==" + password);
		String postparm = "{\"username\":\"" + username + "\",\"password\":\"" + password + "\"}";
		System.out.println("postparm="+postparm);
		cook = login.login(posturl, postparm);
		logPassStatus("login to Application  as P.M with <br/> Userid="+username+"<br/>Password="+password);
	}
	
	@Test(priority = 2)
	public void orderProvisionForBaseProduct()
	{
		order.orderProvisionForBaseProduct(testColomName, depdentTestColomName1,depdentTestColomName2);
	}
	
	@Test(priority = 3)
	public void orderProvisionForAddOnProduct()
	{
		order.orderProvsionForAddOnProduct(testColomName, depdentTestColomName1,depdentTestColomName2);
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
		if (result.getStatus() == ITestResult.FAILURE) 
		{
			test.log(LogStatus.FAIL, result.getThrowable());
		}

	}
}
