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
	public void addBaseProductWithFourLicenses(String testColomName)
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
		
	}
	
	public void placeOrder(String testColomName)
	{
		
	}
	
	public void orderProvision(String testColomName)
	{
		
	}
	
	
}
