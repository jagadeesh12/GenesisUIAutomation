package com.dw.api.automation.TestScripts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.ws.rs.core.NewCookie;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dw.api.automation.extent.ExtentManager;
import com.dw.api.automation.libs.FilloExcelUtility;
import com.dw.api.automation.pagefactory.ApiLoginPF;
import com.dw.api.automation.pagefactory.MarketPlaceAndContractManagementPF;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jersey.api.client.ClientResponse;

public class MarketPlaceAndContractManagementTest {
	static ExtentTest test;
	ClientResponse response = null;
	ExtentReports extent;
	HashMap<String, String> testdatamap = null;
	String testColomName="MarketPlaceAndContractManagementTest";
	MarketPlaceAndContractManagementPF baseproduct=new MarketPlaceAndContractManagementPF();
	static NewCookie cook;
	ApiLoginPF login=new ApiLoginPF();
	@BeforeClass
	public void initateExtentManager() {
		extent = ExtentManager.Instance();
	}
	
	@Test(priority = 1)
	public void loginAsPm()
	{
		test = ExtentManager.loggerInstance(extent, " Use Case: Customer OnBoarding");
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
	
	
	
	@Test(priority =2)
	public void addBaseProductWithFourLicenses()
	{
		baseproduct.addBaseProductWithFourLicenses(testColomName);
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
		test.log(LogStatus.FAIL, result.getThrowable());
		}
	}
}
