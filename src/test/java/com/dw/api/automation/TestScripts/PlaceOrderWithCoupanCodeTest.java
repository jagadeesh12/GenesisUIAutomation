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
import com.dw.api.automation.libs.Get;
import com.dw.api.automation.pagefactory.ApiLoginPF;
import com.dw.api.automation.pagefactory.CoupanPF;
import com.dw.api.automation.pagefactory.CustomerPF;
import com.dw.api.automation.pagefactory.MarketPlaceAndContractManagementPF;
import com.dw.api.automation.pagefactory.OrderProvisonPF;
import com.dw.api.automation.pagefactory.OrganisationPF;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jersey.api.client.ClientResponse;

public class PlaceOrderWithCoupanCodeTest {
	ExtentReports extent;
	static ExtentTest test;
	
	
	static NewCookie cook;
	ApiLoginPF login=new ApiLoginPF();
	Get get = new Get();
	ClientResponse response = null;
	HashMap<String, String> testdatamap = null;
	Object partnerEntityId;
	OrganisationPF org=new OrganisationPF();
	CoupanPF coupan=new CoupanPF();
	OrderProvisonPF order=new OrderProvisonPF();
	String testColomName="PlaceOrderWithCoupanCodeTest";
	MarketPlaceAndContractManagementPF product=new MarketPlaceAndContractManagementPF();

	CustomerPF customer=new CustomerPF();
	
	@BeforeClass
	public void initateExtentManager() {
		extent = ExtentManager.Instance();
	}
	/*Login to Application as Site Admin*/
	@Test(priority = 1)
	public void loginAsPm()
	{
		test = ExtentManager.loggerInstance(extent, " Use Case: Place Order With Coupan Code");
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
	public void addNewPartnerOrganisation()  {
	
		
		try {
			response=org.addNewPartnerOrganisation(testColomName);
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
	public void approveNewOrgByCA()
	{
		
		org.approveNewOrganisationByCA(testColomName);
		testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
		String entityName=testdatamap.get("entityName");
		System.out.println("entityName="+entityName);	
		logPassStatus("Partner Organization Approved From C.A<br/>"+"Partner Organizatio name="+entityName);

	}
	
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
	
	@Test(priority =9)
	public void createCoupan()
	{
		
		coupan.createCoupanForBaseProduct(testColomName);
	//	testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
		//String baseCouponCode=testdatamap.get("baseCouponCode");
		logPassStatus("New Coupan Created");
	}
	
	@Test(priority =10)
	public void getCouponCode()
	{
		coupan.getCouponCode(testColomName);
	}
	
	//Do Market Place
	@Test(priority =11)
	public void addBaseProductWithTwoLicenses()
	{
		product.addBaseProductWithTwoLicenses(testColomName);
		
		testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
		String baseProductName=testdatamap.get("baseProductName");
		System.out.println("baseProductName="+baseProductName);
		String baseSkuId=testdatamap.get("baseSkuId");
		System.out.println("baseSkuId="+baseSkuId);
		logPassStatus("Add Base Product With Two Licenses<br/>"+"Base Product Name="+baseProductName+"<br/>BaseProduct SkuId="+baseSkuId);

	}
	
	@Test(priority =12)
	public void addAddOnProductWithOneLicenses()
	{
		product.addAddOnwithOneLicenses(testColomName);
		testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
		String addOnProductName=testdatamap.get("addOnProductName");
		System.out.println("addOnProductName="+addOnProductName);
		String addOnSKuId=testdatamap.get("addOnSKuId");
		System.out.println("addOnSKuId="+addOnSKuId);
		logPassStatus("Add On Product With One License<br/>"+"Base Product Name="+addOnProductName+"<br/>BaseProduct SkuId="+addOnSKuId);

	}
	
	
	
	
	/*@Test(priority =11)
	public void orderProvisionForBaseProduct()
	{
		order.orderProvisionForBaseProduct1(testColomName);
	}
	
	@Test(priority =12)
	public void orderProvsionForAddOnProduct()
	{
		order.orderProvsionForAddOnProduct1(testColomName);
	}*/
	
	
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
