package com.dw.api.automation.pagefactory;

import java.util.HashMap;

import javax.ws.rs.core.NewCookie;

import com.dw.api.automation.libs.FilloExcelUtility;
import com.dw.api.automation.libs.Get;
import com.dw.api.automation.libs.Post;
import com.sun.jersey.api.client.ClientResponse;

public class MarketPlaceAndContractManagementPF {

	Get get = new Get();
	Post post=new Post();
	static NewCookie cook;
	ClientResponse response = null;
	ApiLoginPF login=new ApiLoginPF();
	HashMap<String, String> testdatamap = null;
	
	
	/*Office 365 Enterprise E3*/
	public void addBaseProductWithTwoLicenses(String testColomName)
	{
	cook=login.loginAsPM();
	//Switch to Kuwait
	testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
	System.out.println("testNameColom="+testColomName);
	String marketPlaceBaseUrl = testdatamap.get("marketPlaceBaseUrl");
	System.out.println("marketPlaceBaseUrl="+marketPlaceBaseUrl);
	String marketCountryCode= testdatamap.get("marketCountryCode");
	System.out.println("marketCountryCode="+marketCountryCode);
    String locationBaseurl=marketPlaceBaseUrl+marketCountryCode;
    System.out.println("marketCountryCode="+locationBaseurl);
    String res = get.getRestServiceMethod2(locationBaseurl, cook);
    
    testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
    String baseProduct="https://test.redington.market/api/v1/basket";
    System.out.println("Base product url="+baseProduct);
    String baseProductName=testdatamap.get("baseProductName");
    System.out.println("baseProductName="+baseProductName);
	String baseSkuId=testdatamap.get("baseSkuId");
	System.out.println("baseSkuId="+baseSkuId);
	String baseProductPayload="{\"basket\":{\"sku\":\""+baseSkuId+"\",\"productQuantity\":\"2\",\"planType\":\"monthly\",\"countryCode\":\""+marketCountryCode+"\"}}";
	response = post.getPostByJersey(baseProduct, baseProductPayload, cook);		
    
		
	}
	
	public void addAddOnwithOneLicenses(String testColomName)
	{
		cook=login.loginAsPM();
		//Switch to Kuwait
		testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
		System.out.println("testNameColom="+testColomName);
		String marketPlaceBaseUrl = testdatamap.get("marketPlaceBaseUrl");
		System.out.println("marketPlaceBaseUrl="+marketPlaceBaseUrl);
		String marketCountryCode= testdatamap.get("marketCountryCode");
		System.out.println("marketCountryCode="+marketCountryCode);
	    String locationBaseurl=marketPlaceBaseUrl+marketCountryCode;
	    System.out.println("marketCountryCode="+locationBaseurl);
	    String res = get.getRestServiceMethod2(locationBaseurl, cook);
		
	    testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
		System.out.println("testNameColom="+testColomName);
		String addonProductUrl="https://test.redington.market/api/v1/basket";
		System.out.println("addonProductUrl="+addonProductUrl);
		
		String addOnProductName=testdatamap.get("addOnProductName");
		System.out.println("Add On Product Name="+addOnProductName);
		String addOnSKuId=testdatamap.get("addOnSKuId");
		System.out.println("Add On SKuId="+addOnSKuId);
		String  addOnPayload="{\"basket\":{\"sku\":\""+addOnSKuId+"\",\"productQuantity\":1,\"planType\":\"monthly\",\"countryCode\":\""+marketCountryCode+"\"}}";
		response = post.getPostByJersey(addonProductUrl, addOnPayload, cook);
		
	}
	
		/*Future Implementation*/
		/*Validate Basket aganist base product quantity v/s addon product quantity */
	  public void validateBasketBaseAddOnProductQunatity(String testColomName)
	{
		  
	}
	
	public void placeOrder(String testColomName,String depdentTestColomName)
	{
		cook=login.loginAsPM();
		//Switch to Kuwait
		testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
		System.out.println("testNameColom="+testColomName);
		String marketPlaceBaseUrl = testdatamap.get("marketPlaceBaseUrl");
		System.out.println("marketPlaceBaseUrl="+marketPlaceBaseUrl);
		String marketCountryCode= testdatamap.get("marketCountryCode");
		System.out.println("marketCountryCode="+marketCountryCode);
	    String locationBaseurl=marketPlaceBaseUrl+marketCountryCode;
	    System.out.println("marketCountryCode="+locationBaseurl);
	    String res = get.getRestServiceMethod2(locationBaseurl, cook);
	    
	    testdatamap = FilloExcelUtility.readExcelWithTestName(depdentTestColomName);
	    String customerId=testdatamap.get("customerId");
	    System.out.println("customerId="+customerId);
	    String placeOrderReqUrl="https://test.redington.market/api/v1/orders";
	    System.out.println("orderPlaceUrl="+placeOrderReqUrl);
		String placeOrderPayload="{\"order\":{\"customerId\": \""+customerId+"\",\"couponCode\": \"\",\"purchageOrderNumber\": \"abc123\"}}";
	    System.out.println("placeOrderPayload="+placeOrderPayload);
	    post.getPostByJersey(placeOrderReqUrl, placeOrderPayload, cook);
	
		
	}
	
	public void orderProvision(String testColomName)
	{
		
	}
	
	
}
