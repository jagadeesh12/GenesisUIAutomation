package com.dw.api.automation.pagefactory;

import java.util.HashMap;

import javax.ws.rs.core.NewCookie;

import com.dw.api.automation.libs.FilloExcelUtility;
import com.dw.api.automation.libs.Get;
import com.dw.api.automation.libs.Post;
import com.dw.api.automation.utils.Configurations;
import com.sun.jersey.api.client.ClientResponse;

public class MarketPlaceAndContractManagementPF {

	Get get = new Get();
	Post post=new Post();
	static NewCookie cook;
	ClientResponse response = null;
	ApiLoginPF login=new ApiLoginPF();
	HashMap<String, String> testdatamap = null;
	Configurations config=new Configurations();
	
	/*Office 365 Enterprise E3*/
	public void addBaseProductWithTwoLicenses(String testColomName)
	{
	cook=login.loginAsPM();
	//Switch to Kuwait
	testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
	System.out.println("testNameColom="+testColomName);
	String db=config.getProperty("db");
	System.out.println("dbloc="+db);
	String marketPlaceBaseUrl ="redington.market/api/v1/marketPlace/keywordSearch?countryCode=";
	marketPlaceBaseUrl=db+marketPlaceBaseUrl;
	System.out.println("marketPlaceBaseUrl="+marketPlaceBaseUrl);
	String marketCountryCode= testdatamap.get("marketCountryCode");
	System.out.println("marketCountryCode="+marketCountryCode);
    String locationBaseurl=marketPlaceBaseUrl+marketCountryCode;
    System.out.println("marketCountryCode="+locationBaseurl);
    String res = get.getRestServiceMethod2(locationBaseurl, cook);
    
    testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
    String baseProduct="redington.market/api/v1/basket";
    baseProduct=db+baseProduct;
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
		String db=config.getProperty("db");
		System.out.println("dbloc="+db);
		String marketPlaceBaseUrl ="redington.market/api/v1/marketPlace/keywordSearch?countryCode=";
		marketPlaceBaseUrl=db+marketPlaceBaseUrl;
		System.out.println("marketPlaceBaseUrl="+marketPlaceBaseUrl);
		String marketCountryCode= testdatamap.get("marketCountryCode");
		System.out.println("marketCountryCode="+marketCountryCode);
	    String locationBaseurl=marketPlaceBaseUrl+marketCountryCode;
	    System.out.println("marketCountryCode="+locationBaseurl);
	    String res = get.getRestServiceMethod2(locationBaseurl, cook);
	    testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
		System.out.println("testNameColom="+testColomName);
		db=config.getProperty("db");
		System.out.println("dbloc="+db);
		
		String addonProductUrl="redington.market/api/v1/basket";
		addonProductUrl=db+addonProductUrl;
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
	
	  /*******************Place Order with dependent Tests********************/
	public void placeOrder(String testColomName,String depdentTestColomName)
	{
		cook=login.loginAsPM();
		//Switch to Kuwait
		testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
		System.out.println("testNameColom="+testColomName);
		String	db=config.getProperty("db");
		System.out.println("dbloc="+db);
		String marketPlaceBaseUrl ="redington.market/api/v1/marketPlace/keywordSearch?countryCode=";
		marketPlaceBaseUrl=db+marketPlaceBaseUrl;
		System.out.println("marketPlaceBaseUrl="+marketPlaceBaseUrl);
		String marketCountryCode= testdatamap.get("marketCountryCode");
		System.out.println("marketCountryCode="+marketCountryCode);
	    String locationBaseurl=marketPlaceBaseUrl+marketCountryCode;
	    System.out.println("marketCountryCode="+locationBaseurl);
	    String res = get.getRestServiceMethod2(locationBaseurl, cook);
	    
	    testdatamap = FilloExcelUtility.readExcelWithTestName(depdentTestColomName);
	    String customerId=testdatamap.get("customerId");
	    System.out.println("customerId="+customerId);
	    String placeOrderReqUrl="redington.market/api/v1/orders";
	    placeOrderReqUrl=db+placeOrderReqUrl;
	    System.out.println("orderPlaceUrl="+placeOrderReqUrl);
		String placeOrderPayload="{\"order\":{\"customerId\": \""+customerId+"\",\"couponCode\": \"\",\"purchageOrderNumber\": \"abc123\"}}";
	    System.out.println("placeOrderPayload="+placeOrderPayload);
	    post.getPostByJersey(placeOrderReqUrl, placeOrderPayload, cook);
			
	}
	
	/*******************Place Order with Independent Tests********************/
	public void placeOrder(String testColomName)
	{
		cook=login.loginAsPM();
		//Switch to Kuwait
		testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
		System.out.println("testNameColom="+testColomName);
		String	db=config.getProperty("db");
		System.out.println("dbloc="+db);
		String marketPlaceBaseUrl ="redington.market/api/v1/marketPlace/keywordSearch?countryCode=";
		marketPlaceBaseUrl=db+marketPlaceBaseUrl;
		System.out.println("marketPlaceBaseUrl="+marketPlaceBaseUrl);
		String marketCountryCode= testdatamap.get("marketCountryCode");
		System.out.println("marketCountryCode="+marketCountryCode);
	    String locationBaseurl=marketPlaceBaseUrl+marketCountryCode;
	    System.out.println("marketCountryCode="+locationBaseurl);
	    String res = get.getRestServiceMethod2(locationBaseurl, cook);
	    
	    testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
	    String customerId=testdatamap.get("customerId");
	    System.out.println("customerId="+customerId);
	    String placeOrderReqUrl="redington.market/api/v1/orders";
	    placeOrderReqUrl=db+placeOrderReqUrl;
	    System.out.println("orderPlaceUrl="+placeOrderReqUrl);
		String placeOrderPayload="{\"order\":{\"customerId\": \""+customerId+"\",\"couponCode\": \"\",\"purchageOrderNumber\": \"abc123\"}}";
	    System.out.println("placeOrderPayload="+placeOrderPayload);
	    post.getPostByJersey(placeOrderReqUrl, placeOrderPayload, cook);
			
	}
	
	
	
	public void orderProvision(String testColomName)
	{
		
	}
	
	
}
