package com.dw.api.automation.steps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.ws.rs.core.NewCookie;

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
import com.dw.api.automation.libs.ParseJsonArray;
import com.dw.api.automation.libs.Post;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jersey.api.client.ClientResponse;

/*
 * 
 * Test Case for Market place
 * 
 * 
 */
public class MarketPlaceTest {

	/* Login to Application */
	static NewCookie cook;
	LoginPost lgoin = new LoginPost();
	Get get = new Get();
	Post post=new Post();
	ExtentReports extent;
	static ExtentTest test;
	ClientResponse response = null;
	HashMap<String, LinkedHashMap<Integer, List>> outerMap = new LinkedHashMap<String, LinkedHashMap<Integer, List>>();
	HashMap<String, String> testdatamap = null;
	
	private List li;
	Object sku=null;
	Object skuAddon=null;
	@BeforeClass
	public void initateExtentManager() {
		extent = ExtentManager.Instance();
	}

	@Test(priority = 1)
	public void login_to_application() {
		testdatamap = FilloExcelUtility.readExcel();
		test = ExtentManager.loggerInstance(extent, " Test case: Market Place");
		try {
			CertificateHandle.IgnoreSSLClient();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String posturl = testdatamap.get("testurl");
		System.out.println("Login Url=" + posturl);
		String username = testdatamap.get("username");
		System.out.println("User name==" + username);
		String password = testdatamap.get("password");
		System.out.println("Password==" + password);
		String postparm = "{\"username\":\"" + username + "\",\"password\":\"" + password + "\"}";
		cook = lgoin.loginGetPostByJersey(posturl, postparm);
		System.out.println("Cookie as Token paramter=" + cook);
		logPassStatus("login to Application with Userid=pm6.qa@mailinator.com Password=Pass@123");

	}

	/*Search Product --Office 365 Enterprise E3 and get sku-id "796b6b5f-613c-4e24-a17c-eba730d49c02" */
	@Test(priority = 2)
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
	
	/*Test case : Add Office 365 Enterprise E3 Base product with three licenses monthly */
	@Test(priority =3)
	public void addBaseProductWithThreeLicenses()
	{
		String baseProductUrl="https://test.redington.market/api/v1/marketPlace/products/"+sku+"?countryCode=ARE";
		System.out.println("baseProductUrl="+baseProductUrl);
		get.getRestServiceMethod(baseProductUrl,cook);
		
		String baseProduct="https://test.redington.market/api/v1/basket";
		System.out.println("Base product url="+baseProduct);
		String baseProductPayload="{\"basket\":{\"sku\":\""+sku+"\",\"productQuantity\":\"3\",\"planType\":\"monthly\",\"countryCode\":\"ARE\"}}";
		response = post.getPostByJersey(baseProduct, baseProductPayload, cook);		
		logPassStatus(" Base Product Office-365-Enterprise-E3  with  3 Licenses added to the Basket");	
	}
	/*Test case : Add AddOn Office 365 Extra File Storage with 4  licenses monthly  */
	@Test(priority =4)
	public void addAddOnwithFourLicenses()
	{
		String addOnSearchUrl="https://test.redington.market/api/v1/marketPlace/keywordSearch?q=Office%20365%20Extra%20File%20Storage&countryCode=ARE";
		System.out.println("addOnSearchUrl="+addOnSearchUrl);
		String res = get.getRestServiceMethod2(addOnSearchUrl, cook);
	    skuAddon = ParseJsonArray.parseJsonArray(res, "data", "items", "sku");
		System.out.println("skuAddon="+skuAddon);
		
		String addonProductUrl="https://test.redington.market/api/v1/basket";
		System.out.println("addonProductUrl="+addonProductUrl);
		String  addOnPayload="{\"basket\":{\"sku\":\""+skuAddon+"\",\"productQuantity\":4,\"planType\":\"monthly\",\"countryCode\":\"ARE\"}}";
		response = post.getPostByJersey(addonProductUrl, addOnPayload, cook);	
		logPassStatus(" Add AddOn Office 365 Extra File Storage with 4  licenses monthly to the Basket");	
	}
	
	/*Validate Basket aganist base product quantity v/s addon product quantity */
	/*Base quantity=3*/
	/*Add on Quantity=4*/
	
	public void validateBasketBaseAddOnProductQunatity()
	{
		
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
