package com.dw.api.automation.pagefactory;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.NewCookie;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.dw.api.automation.libs.FilloExcelUtility;
import com.dw.api.automation.libs.Get;
import com.dw.api.automation.libs.Post;
import com.dw.api.automation.utils.Configurations;
import com.sun.jersey.api.client.ClientResponse;

public class CoupanPF 
{
	Get get = new Get();
	Post post=new Post();
	static NewCookie cook;
	ClientResponse response = null;
	ApiLoginPF login=new ApiLoginPF();
	HashMap<String, String> testdatamap = null;
	Configurations config=new Configurations();
	//Create coupan  code and add it into excel
	public void createCoupanForBaseProduct(String testNameColom)
	{
		System.out.println("testNameColom="+testNameColom);
		
		//login as BAM
		cook=login.loginAsBAM();
		testdatamap = FilloExcelUtility.readExcelWithTestName(testNameColom);
		Date date = new Date();
		String currentDate= new SimpleDateFormat("yyyy-MM-dd").format(date);
		System.out.println("Todays date is " + currentDate); 
		//+ "\"startsFrom\": \"2017-12-13\","
		
		String baseSkuId=testdatamap.get("baseSkuId");
		System.out.println("baseSkuId="+baseSkuId);
		
		String bquantity=testdatamap.get("bquantity");
		System.out.println("bquantity="+bquantity);
		
		String bdiscount=testdatamap.get("bdiscount");
		System.out.println("bdiscount="+bdiscount);
		
		String bprice=testdatamap.get("bprice");
		System.out.println("bprice="+bprice);
		
		String addproduct=testdatamap.get("addproduct");
		System.out.println("Addproduct="+addproduct);
		
		String countryCode=testdatamap.get("countryCode");
		System.out.println("countryCode="+countryCode);
		
		String currencyCode=testdatamap.get("currencyCode");
		System.out.println("currencyCode="+currencyCode);
		
		String partnerEntityId=testdatamap.get("partnerEntityId");
		System.out.println("partnerEntityId="+partnerEntityId);
		
		String customerId=testdatamap.get("customerId");
		System.out.println("customerId="+customerId);
		String db=config.getProperty("db");
		System.out.println("dbloc="+db);
		
		String couponCreateURL="redington.market/api/v1/coupon";
		couponCreateURL=db+couponCreateURL;
		System.out.println("couponCreateURL="+couponCreateURL);
		
		/*Exeute get url to add coupan paramaters*/
		String uIcoupanGetUrl="redington.market/api/v1/endCustomers/entityId/";
		uIcoupanGetUrl=db+uIcoupanGetUrl;
		uIcoupanGetUrl=uIcoupanGetUrl+partnerEntityId;
		System.out.println("uIcoupanGetUrl="+uIcoupanGetUrl);
		get.getRestServiceMethod(uIcoupanGetUrl, cook);
		
		String coupondetailparams="{\"rules\": { \"products\": [ {"
				+ "\"productId\": \""+baseSkuId+"\","
				+ "\"quantity\": \""+bquantity+"\","
				+ "\"discount\": \""+bdiscount+"\","
				+ "\"sku\": \""+baseSkuId+"\","
				+ "\"price\": \""+bprice+"\","
				+ "\"Addproduct\": \""+addproduct+"\","
				+ "\"actualPrice\": "+bprice+"}],"
				+ "\"country\": \""+countryCode+"\","
				+ "\"currencyCode\": \""+currencyCode+"\","
				+ "\"entity\": \""+partnerEntityId+"\","
				+ "\"endCustomer\": \""+customerId+"\","
				+ "\"product\": \"\","
				+ "\"push\": \""+countryCode+"\","
				+ "\"startsFrom\": \""+currentDate+"\","
				+ "\"expiresOn\": \"2019-12-12\"},"
				+ "\"type\": \"USER\"}";
		System.out.println(" Coupon Parameters" + coupondetailparams);
		//response = post.getPostByJersey("https://test.redington.market/api/v1/endcustomer", newCustomerpayload, cook);
	    response=post.getPostByJersey(couponCreateURL, coupondetailparams, cook);
		System.out.println("Cookie as Token paramter for Coupon create=" + cook);
		System.out.println("Coupon create Response code=" + response.getStatus());
		
	}
	
	/*
	public void  getAddOnCoupanId(String testColomName)
	{
		
		//login as BAM
				cook=login.loginAsBAM();
		 String getAddon_idURL="https://test.redington.market/api/v1/coupon?page=1&pageSize=10&sortOrder=desc&sortBy=modifiedOn";
		    System.out.println("getAddon_idURL="+getAddon_idURL);
		    String res = get.getRestServiceMethod2(getAddon_idURL, cook);
		    //Get Subscription Id
		    JSONObject   subscriptionId=null;
		      JSONObject reqid=null;
		  	JSONObject obj = new JSONObject(res);
		  	JSONArray docsArray = new JSONObject(res).getJSONObject("data").getJSONArray("docs");
		  	docsArray.
		  	
		  	List li = new ArrayList();
		  for (Object object : docsArray) {
		  		JSONObject obj2 = new JSONObject(object.toString());
		  		reqid=(JSONObject)obj2.get("_id");
		  		System.out.println("The products is ========="+obj2.get("products"));
		  	//	subscriptionId	=(JSONObject) obj2.get("subscriptionId");
		  		//JSONObject subscriptionId1 = obj2;
		  	//	FilloExcelUtility.replaceRow("subscriptionId", (String) obj2.get("subscriptionId"), testColomName);
		  	//	testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
		  	//	System.out.println("subscriptionId="+testdatamap.get("subscriptionId"));
		  	//	break;
		  	}

		   
	}
	*/
	
	
	
	public void getCouponCode(String testNameColom) {
		testdatamap = FilloExcelUtility.readExcelWithTestName(testNameColom);
		String companyName = testdatamap.get("companyName");
		System.out.println("companyName=" + companyName);
		String db=config.getProperty("db");
		System.out.println("dbloc="+db);
		
		String getCouponCodeUrl = "redington.market/api/v1/coupon?page=1&pageSize=10&sortOrder=desc&sortBy=modifiedOn&searchKey="
		+ companyName + "";
		getCouponCodeUrl=db+getCouponCodeUrl;
		System.out.println("getCouponCodeUrl=" + getCouponCodeUrl);

		String res = get.getRestServiceMethod2(getCouponCodeUrl, cook);

		JSONObject obj = new JSONObject(res);
		JSONArray docsArray = new JSONObject(res).getJSONObject("data").getJSONArray("docs");
		JSONObject obj2 = null;
		List li = new ArrayList();
		for (Object object : docsArray) {
			obj2 = new JSONObject(object.toString());
			// System.out.println("The id is ========="+ obj2.get("_id"));
		}
		System.out.println("The Coupon code id is =========" + obj2.get("couponCode"));
		Object couponCode = obj2.get("couponCode");
		String coupanCodeString=(String) couponCode;
		FilloExcelUtility.replaceRow("baseCouponCode", coupanCodeString,testNameColom);
		testdatamap = FilloExcelUtility.readExcelWithTestName(testNameColom);
		String couponCodefroExcel = testdatamap.get("couponCode");
		
		System.out.println("Updated Coupan Code from Excel="+couponCodefroExcel);
		
		

	}
	
	
}
	

