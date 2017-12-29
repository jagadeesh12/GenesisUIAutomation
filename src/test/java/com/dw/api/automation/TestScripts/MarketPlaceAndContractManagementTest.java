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
	String depdentTestColomName="CustomerOnBoardingTest";
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
		test = ExtentManager.loggerInstance(extent, " Use Case: Market Place And Contract Management");
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
	public void addBaseProductWithTwoLicenses()
	{
		baseproduct.addBaseProductWithTwoLicenses(testColomName);
		
		testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
		String baseProductName=testdatamap.get("baseProductName");
		System.out.println("baseProductName="+baseProductName);
		String baseSkuId=testdatamap.get("baseSkuId");
		System.out.println("baseSkuId="+baseSkuId);
		logPassStatus("Add Base Product With Two Licenses<br/>"+"Base Product Name="+baseProductName+"<br/>BaseProduct SkuId="+baseSkuId);

	}
	
	@Test(priority =3)
	public void addAddOnProductWithOneLicenses()
	{
		baseproduct.addAddOnwithOneLicenses(testColomName);
		testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
		String addOnProductName=testdatamap.get("addOnProductName");
		System.out.println("addOnProductName="+addOnProductName);
		String addOnSKuId=testdatamap.get("addOnSKuId");
		System.out.println("addOnSKuId="+addOnSKuId);
		logPassStatus("Add On Product With One License<br/>"+"Base Product Name="+addOnProductName+"<br/>BaseProduct SkuId="+addOnSKuId);

	}
	
	@Test(priority =4)
	public void placeOrder()
	{
		baseproduct.placeOrder(testColomName, depdentTestColomName);
		logPassStatus("Order Placed Successfully");

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
