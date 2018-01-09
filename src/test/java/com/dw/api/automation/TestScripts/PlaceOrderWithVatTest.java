package com.dw.api.automation.TestScripts;

import java.io.FileNotFoundException;
import java.util.HashMap;

import javax.ws.rs.core.NewCookie;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dw.api.automation.extent.ExtentManager;
import com.dw.api.automation.libs.FilloExcelUtility;
import com.dw.api.automation.pagefactory.ApiLoginPF;
import com.dw.api.automation.pagefactory.CoupanPF;
import com.dw.api.automation.pagefactory.CustomerPF;
import com.dw.api.automation.pagefactory.MarketPlaceAndContractManagementPF;
import com.dw.api.automation.pagefactory.OrganisationPF;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jersey.api.client.ClientResponse;

public class PlaceOrderWithVatTest {
	ExtentReports extent;
	static ExtentTest test;
	
	
	static NewCookie cook;
	ApiLoginPF login=new ApiLoginPF();
	HashMap<String, String> testdatamap = null;
	String testColomName="PlaceOrderWithVatTest";
	ClientResponse response;
	
	
	OrganisationPF org=new OrganisationPF();
	CustomerPF customer=new CustomerPF();
	MarketPlaceAndContractManagementPF baseproduct=new MarketPlaceAndContractManagementPF();
	CoupanPF coupan=new CoupanPF();
	/************Login as P.M*****************/
	@BeforeClass
	public void initateExtentManager() {
		extent = ExtentManager.Instance();
	}
	/*Login to Application as Site Admin*/
	@Test(priority = 1)
	public void loginAsPm()
	{
		test = ExtentManager.loggerInstance(extent, " Use Case: Place Order With V.A.T & Coupan Code");
		testdatamap = FilloExcelUtility.readExcelWithTestName("login");
		 String posturl = testdatamap.get("testurl");
		System.out.println("Login Url=" + posturl);
		String username = testdatamap.get("username");
		System.out.println("User name==" + username);
		String password = testdatamap.get("password");
		System.out.println("Password==" + password);
		String postparm = "{\"username\":\"" + username + "\",\"password\":\"" + password + "\"}";
		System.out.println("postparm="+postparm);
		/*cook = login.login(posturl, postparm);*/
		cook = login.loginAsPM();
		logPassStatus("login to Application  as P.M with <br/> Userid="+username+"<br/>Password="+password);
	}
	
	
	
	/*********************Add Organisation with Vat*****************/
	/*Verify MPN Id*/
	@Test(priority =2)
	public void verifyMpnId()
	{
		org.verifyMPN(testColomName);
		testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
		String mpnId=testdatamap.get("mpnId");
		System.out.println("mpnId="+mpnId);
		logPassStatus("Validate MPN id="+mpnId);
	}
	
	@Test(priority = 3)
	public void addNewPartnerOrganisationWithVat()  {
	
		
		try {
			response = org.addNewPartnerOrganisationWithVat(testColomName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
		String entityName=testdatamap.get("entityName");
		System.out.println("entityName="+entityName);
		logPassStatus("Partner Organization created successfully. You will receive Email notification once approval process is completed<br/>"+"Partner Organizatio name="+entityName);
		
	}
	
	@Test(priority =4)
	public void approveNewOrgByBAM()
	{
		org.approveNewOrganisationByBam(testColomName);
		testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
		String entityName=testdatamap.get("entityName");
		System.out.println("entityName="+entityName);	
		logPassStatus("Partner Organization Approved From B.A.M<br/>"+"Partner Organizatio name="+entityName);
	}
	
	
	@Test(priority =5)
	public void approveNewOrganisationByCAwithVAT()
	{
		
		org.approveNewOrganisationByCAwithVAT(testColomName);
		testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
		String entityName=testdatamap.get("entityName");
		System.out.println("entityName="+entityName);	
		logPassStatus("Partner Organization Approved From C.A<br/>"+"Partner Organizatio name="+entityName);

	}
	
	/*************Create Customer*******************/
	//Create Customer
	
		@Test(priority =6)
		public void createNewCustomer()
		{
			customer.createNewCustomer(testColomName);
			testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
			String customername=testdatamap.get("companyName");
			System.out.println("customername="+customername);
			
			logPassStatus("New Customer Created<br/>"+"CustomerName="+customername);
		}
		
		@Test(priority =7)
		public void getCustomerId()
		{
			
			customer.getCustomerId(testColomName);
			testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
			String customerId=testdatamap.get("customerId");
			System.out.println("customerId="+customerId);
			logPassStatus("New CustomerId="+customerId);
		}
		
		@Test(priority =8)
		public void approveNewCustomerFromBam()
		{
			customer.approveNewCustomerFromBam(testColomName);
			logPassStatus("Approve Customer from BAM");
		}
		
	
	/***************Add Base Product****************/
		@Test(priority =9)
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
		
		
		/*******************Place Order*********************/
		@Test(priority =10)
		public void placeOrder()
		{
		//	baseproduct.placeOrder(testColomName);
			logPassStatus("Order Placed Successfully");

		}
		
		@Test(priority =11)
		public void createCoupan()
		{
			
			coupan.createCoupanForBaseProduct(testColomName);
		//	testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
			//String baseCouponCode=testdatamap.get("baseCouponCode");
			logPassStatus("New Coupan Created");
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
