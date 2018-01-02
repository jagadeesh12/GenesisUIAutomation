package com.dw.api.automation.pagefactory;

import java.util.HashMap;

import javax.ws.rs.core.NewCookie;

import com.dw.api.automation.libs.FilloExcelUtility;
import com.dw.api.automation.libs.Get;
import com.dw.api.automation.libs.ParseJsonArray;
import com.dw.api.automation.libs.Post;
import com.sun.jersey.api.client.ClientResponse;

public class OrderProvisonPF {
	Get get = new Get();
	Post post=new Post();
	static NewCookie cook;
	ClientResponse response = null;
	ApiLoginPF login=new ApiLoginPF();
	HashMap<String, String> testdatamap = null;
	
public void orderProvisionForBaseProduct(String testColomName,String depdentTestColomName1,String depdentTestColomName2)
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
    
    //Get Company Name
    testdatamap = FilloExcelUtility.readExcelWithTestName(depdentTestColomName1);
    String companyName=testdatamap.get("companyName");
    System.out.println("companyName="+companyName);

    
    testdatamap = FilloExcelUtility.readExcelWithTestName(depdentTestColomName2);
    String baseSkuId=testdatamap.get("baseSkuId");
    System.out.println("baseSkuId="+baseSkuId);
    
    //Get OrderNumber
 //   String getOrderUrl="https://test.redington.market/api/v1/product?filterBy=countryCode:KWT&searchKey=";
	String getOrderUrl="https://test.redington.market/api/v1/orders?page=1&pageSize=10&sortBy=modifiedOn&sortOrder=desc&filterBy=period:6Months&searchKey=";

    System.out.println("getOrderUrl="+getOrderUrl);
    String baseOrderUrl=getOrderUrl+companyName;
    System.out.println("baseOrderUrl="+baseOrderUrl);
    res = get.getRestServiceMethod2(baseOrderUrl, cook);
    
    Object orderNumber = ParseJsonArray.parseJsonArray(res,"data","docs","id");
	System.out.println("orderNumber="+orderNumber);
	FilloExcelUtility.replaceRowPartnereEntity("orderNumber", (String) orderNumber, testColomName);
	String orderProvisionBaseProductUrl="https://test.redington.market/api/v1/orders/fulfill/"+orderNumber+"";
	System.out.println("orderProvisionBaseProductUrl="+orderProvisionBaseProductUrl);
	String orderProvisionBaseProducPayload="{\"sku\":\""+baseSkuId+"\"}"; 
	System.out.println("orderProvisionBaseProducPayload="+orderProvisionBaseProducPayload);
	post.getPostByJersey(orderProvisionBaseProductUrl, orderProvisionBaseProducPayload, cook);
    
    
    
    

    
}
	
	
}
