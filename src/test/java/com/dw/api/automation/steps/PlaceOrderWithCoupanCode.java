package com.dw.api.automation.steps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
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

public class PlaceOrderWithCoupanCode {
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
	Object customerId=null;
	Object vendorId=null;
	Object parentSubscriptionId=null;
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
	
	/*Test case : Add Office 365 Enterprise E3 Base product with 2 licenses monthly */
	@Test(priority =3)
	public void addBaseProductWithFourLicenses()
	{
		String baseProductUrl="https://test.redington.market/api/v1/marketPlace/products/"+sku+"?countryCode=ARE";
		System.out.println("baseProductUrl="+baseProductUrl);
		get.getRestServiceMethod(baseProductUrl,cook);
		
		String baseProduct="https://test.redington.market/api/v1/basket";
		System.out.println("Base product url="+baseProduct);
		String baseProductPayload="{\"basket\":{\"sku\":\""+sku+"\",\"productQuantity\":\"2\",\"planType\":\"monthly\",\"countryCode\":\"ARE\"}}";
		response = post.getPostByJersey(baseProduct, baseProductPayload, cook);		
		logPassStatus(" Base Product Office-365-Enterprise-E3  with  2 Licenses added to the Basket");	
	}
	
	/*Test case : Add AddOn Office 365 Extra File Storage with 1 licenses monthly  */
	@Test(priority =4)
	public void addAddOnwithOneLicenses()
	{
		String addOnSearchUrl="https://test.redington.market/api/v1/marketPlace/keywordSearch?q=Office%20365%20Extra%20File%20Storage&countryCode=ARE";
		System.out.println("addOnSearchUrl="+addOnSearchUrl);
		/*String res = get.getRestServiceMethod2(addOnSearchUrl, cook);
	    skuAddon = ParseJsonArray.parseJsonArray(res, "data", "items", "sku");
		System.out.println("skuAddon="+skuAddon);
		
		String addonProductUrl="https://test.redington.market/api/v1/basket";
		System.out.println("addonProductUrl="+addonProductUrl);
		String  addOnPayload="{\"basket\":{\"sku\":\""+skuAddon+"\",\"productQuantity\":1,\"planType\":\"monthly\",\"countryCode\":\"ARE\"}}";
		response = post.getPostByJersey(addonProductUrl, addOnPayload, cook);*/	
		logPassStatus(" Add AddOn Office 365 Extra File Storage with 1  licenses monthly to the Basket");	
	}
	
	
/*Future Implementation*/
	
	/*Validate Basket aganist base product quantity v/s addon product quantity */
	/*Base quantity=3*/
	/*Add on Quantity=4*/
	/*@Test(priority =5)
	public void validateBasketBaseAddOnProductQunatity()
	{
		//Get Company id
		String getCompanyIdUrl="https://test.redington.market/api/v1/endcustomers?page=1&pageSize=10&sortBy=ModifiedOn&sortOrder=desc&searchKey=";
		testdatamap = FilloExcelUtility.readExcel();
		String companyName = testdatamap.get("companyName");
		System.out.println("companyName=" + companyName);
		getCompanyIdUrl=getCompanyIdUrl+companyName;
		System.out.println("getCompanyIdUrl complete url="+getCompanyIdUrl);
		String res = get.getRestServiceMethod2(getCompanyIdUrl, cook);
		 customerId= ParseJsonArray.parseJsonArray(res, "data", "docs", "_id");
		 System.out.println("company_id="+customerId);
		 
		 Validate Basket based on product quantity (Base_Quantity < AddOn_Quantity)
		 String validateOrderUrl="https://test.redington.market/api/v1/orders";
		String  validateOrderUrlPayload="{\"order\":{\"customerId\": \""+customerId+"\",\"couponCode\": \"\"}}";
		System.out.println("validateOrderUrl="+validateOrderUrl);
		System.out.println("validateOrderUrlPayload="+validateOrderUrlPayload);
		response=post.getPostByJersey(validateOrderUrl, validateOrderUrlPayload, cook);
		System.out.println("Response Status Code="+response.getStatus());
		Assert.assertEquals(500, response.getStatus(), "Validation Sucessfull");
		logPassStatus(" Validating sucessfully for Place order :<br/>Base product quantity v/s addon product quantity<br/>Base quantity=3  Add on Quantity=4"); 
			}
	*/
	
	
	/*Place Order by updating baseproduct and addon product size*/
	@Test(priority =6)
	public void placeOrder()
	{
		//Get Customer  id
		
			testdatamap = FilloExcelUtility.readExcel();
			String companyName = testdatamap.get("companyName");
			System.out.println("companyName=" + companyName);
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
		//	partnerEntityId = obj2.get("_id");
			//logPassStatus("Get Customer id " + "<br/> Customer id=" + partnerEntityId);

			Object _id = obj2.get("_id");
		
		System.out.println("CustomerId="+ _id);
		String placeOrderPayload="{\"order\":{\"customerId\": \""+_id+"\",\"couponCode\": \"\",\"purchageOrderNumber\": \"1000\"}}";
		String placeOrderReqUrl="https://test.redington.market/api/v1/orders";
		System.out.println("placeOrderReqUrl="+ placeOrderReqUrl);
	//	post.getPostByJersey(placeOrderReqUrl, placeOrderPayload, cook);
	//	logPassStatus("Order Placed SucessFully");	

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
