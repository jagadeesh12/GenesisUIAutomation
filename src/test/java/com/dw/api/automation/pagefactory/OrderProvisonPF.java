package com.dw.api.automation.pagefactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.NewCookie;

import org.json.JSONArray;
import org.json.JSONObject;

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
	
	//Order Provision for AddOnProduct
public void orderProvsionForAddOnProduct(String testColomName,String depdentTestColomName1,String depdentTestColomName2)
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
   
    //Get AddOn SkuId
    testdatamap = FilloExcelUtility.readExcelWithTestName(depdentTestColomName2);
    String addOnSKuId=testdatamap.get("addOnSKuId");
    System.out.println("addOnSKuId="+addOnSKuId);
    
    //Get Order Number
    testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
    String orderNumber=testdatamap.get("orderNumber");
    System.out.println("orderNumber="+orderNumber);
    
	//Add Parameter URL for parentSubscriptionId,vendorId
    String getaddonParametersUrl="https://test.redington.market/api/v1/orders/"+orderNumber+"";
    System.out.println("getaddonParametersUrl="+getaddonParametersUrl);
    res=get.getRestServiceMethod2(getaddonParametersUrl, cook);
   
    //Get Subscription Id
  JSONObject   subscriptionId=null;
    JSONObject reqid=null;
	JSONObject obj = new JSONObject(res);
	JSONArray docsArray = new JSONObject(res).getJSONObject("data").getJSONArray("orderProducts");
List li = new ArrayList();
for (Object object : docsArray) {
		JSONObject obj2 = new JSONObject(object.toString());
	//	reqid=(JSONObject)obj2.get("subscriptionId");
		
		System.out.println("The subscriptionId is ========="+obj2.get("subscriptionId"));
	//	subscriptionId	=(JSONObject) obj2.get("subscriptionId");
		//JSONObject subscriptionId1 = obj2;
		FilloExcelUtility.replaceRow("subscriptionId", (String) obj2.get("subscriptionId"), testColomName);
		testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
		System.out.println("subscriptionId="+testdatamap.get("subscriptionId"));
		break;
	}



//Get VendorId 
Object vendorId = null;

JSONObject reqid2=null;
JSONObject obj1 = new JSONObject(res);
JSONArray docsArray1 = new JSONObject(res).getJSONObject("data").getJSONArray("orderProducts");
List li1 = new ArrayList();
for (Object object : docsArray1) {
	JSONObject obj2 = new JSONObject(object.toString());
	reqid2=(JSONObject)obj2.get("botResponse");
	 vendorId = reqid2.get("id");
   System.out.println("The vendor id is ========="+reqid2.get("id"));
   FilloExcelUtility.replaceRow("vendorId", (String)vendorId, testColomName);
	testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
	System.out.println("vendorId="+testdatamap.get("vendorId"));
   	break;
}

testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);

String vendorIdParm=testdatamap.get("vendorId");
System.out.println("The vendorId is ========="+vendorIdParm);
String subscriptionIdParm=testdatamap.get("subscriptionId");
System.out.println("The id is ========="+subscriptionIdParm);
String addOnFullfillRequest="https://test.redington.market/api/v1/orders/fulfill/"+orderNumber+"";
System.out.println("addOnFullfillRequest ========="+addOnFullfillRequest);
//String addOnFullfillPayload="{\"parentSubscriptionId\":\""+subscriptionIdParm+"\",\"sku\": \""+addOnSKuId+"\",\"OrderId\": \""+orderNumber+"\",\"vendorId\": \""+vendorIdParm+"\"}";
String addOnFullfillPayload2="{\"OrderId\": \""+orderNumber+"\",\"parentSubscriptionId\":\""+subscriptionIdParm+"\",\"sku\": \""+addOnSKuId+"\",\"vendorId\": \""+vendorIdParm+"\"}";

System.out.println("addOnFullfillPayload ========="+addOnFullfillPayload2);
post.getPostByJersey(addOnFullfillRequest, addOnFullfillPayload2, cook);

}



}
