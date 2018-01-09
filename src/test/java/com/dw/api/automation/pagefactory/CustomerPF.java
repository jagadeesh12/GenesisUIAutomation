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
import com.dw.api.automation.libs.Put;
import com.dw.api.automation.utils.Configurations;
import com.sun.jersey.api.client.ClientResponse;

public class CustomerPF {

	Get get = new Get();
	Post post=new Post();
	static NewCookie cook;
	ClientResponse response = null;
	ApiLoginPF login=new ApiLoginPF();
	HashMap<String, String> testdatamap = null;
	Object partnerEntityId = null;
	String customerId;
	Object customerIdValue;
	Configurations config=new Configurations();
	
	public ClientResponse createNewCustomer(String testNameColom)
	{
		//Get Partner Entity Id
		cook=login.loginAsPM();
		testdatamap = FilloExcelUtility.readExcelWithTestName(testNameColom);
		partnerEntityId=testdatamap.get("partnerEntityId");
		System.out.println("partnerEntityId ="+partnerEntityId);
		FilloExcelUtility.updateRow("customerdomainName", testNameColom);
		testdatamap = FilloExcelUtility.readExcelWithTestName(testNameColom);
		String domainName = testdatamap.get("domainName");
		String customerdomainName = testdatamap.get("customerdomainName");
		customerdomainName = customerdomainName + ".onmicrosoft.com";
		System.out.println("customerdomainName=" + customerdomainName);
		/*//Switch location to Kuwait
		String switchlocKWT=testdatamap.get("switchLocation");
		get.getRestServiceMethod(switchlocKWT,cook);
		*/
		
		FilloExcelUtility.updateRow("companyName", testNameColom);
		testdatamap = FilloExcelUtility.readExcelWithTestName(testNameColom);
		String companyName = testdatamap.get("companyName");
		System.out.println("companyName=" + companyName);
		
		String db=config.getProperty("db");
		System.out.println("dbloc="+db);
		
		
		String newCustGetUrl = "redington.market/api/v1/endCustomers/domainCheck?countryCode=are&domain="
				+ customerdomainName + "";
		newCustGetUrl=db+newCustGetUrl;
		System.out.println("newCustGetUrl=" + newCustGetUrl);
		System.out.println("cookie" + cook);
		response = get.getRestServiceMethod(newCustGetUrl, cook);
		System.out.println("Create New Customr Response code=" + response.getStatus());
		System.out.println("Create New Customr Response=" + response.getHeaders().toString());

		String newCustPostUrl = "redington.market/api/v1/endcustomer";
		newCustPostUrl=db+newCustPostUrl;
		System.out.println("newCustPostUrle=" + newCustPostUrl);

		String newCustomerpayload = "{\"endCustomerType\": \"New\",\"CompanyName\": \"" + companyName + "\","
				+ "\"ContactFirstName\": \"ApiFirstname\"," + " \"ContactLastName\": \"ApiLastName\","
				+ "\"Address\": {" + "\"Address1\": \"Address1\"," + "\"Address2\": \"Address2\","
				+ "\"Address3\": \"Address3\"}," + "\"City\": \"kuwait\"," + "\"Entity\": \"" + partnerEntityId + "\","
				+ "\"pinCode\": \"75001\"," + "\"CountryId\": \"KWT\"," + "\"PhoneNumber\": \"9008252576\","
				+ "\"MobileNumber\": \"9008252576\"," + "\"Email\": \"checkmail@gmail.com\","
				+ "\"ManagementTypeId\": \"Billing-Only\"," + "\"SpendLimit\": \"1000\"," + "\"Department\": \"cse\","
				+ "\"Function\": \"devops\"," + "\"PaymentTypeId\": \"Monthly-Invoice\","
				+ "\"termsAndConditions\": true," + "\"DomainName\": \"" + customerdomainName + "\","
				+ "\"PartnerEntityId\": \"" + partnerEntityId + "\"}";
		System.out.println("newCustomerpayload=" + newCustomerpayload);
		response = post.getPostByJersey(newCustPostUrl, newCustomerpayload, cook);
		//System.out.println("Cookie as Token paramter=" + cook);
		System.out.println("Create New Customr Response code=" + response.getStatus());
		System.out.println("Create New Customr Response=" + response.toString());
		System.out.println("New Company Created ,Company Name=" + companyName);
		return response;
		
		
		
		
	}
	
	public ClientResponse getCustomerId(String testNameColom) 
	{
		cook=login.loginAsBAM();
		System.out.println("testNameColom="+testNameColom);
		testdatamap = FilloExcelUtility.readExcelWithTestName(testNameColom);
		String companyName = testdatamap.get("companyName");
		System.out.println("companyName=" + companyName);
		String db=config.getProperty("db");
		System.out.println("dbloc="+db);
		String getCustomerIdUrl = "redington.market/api/v1/endcustomer/approvalList?page=1&pageSize=10&sortBy=ModifiedOn&sortOrder=desc&searchKey="
				+ companyName + "";
		getCustomerIdUrl=db+getCustomerIdUrl;
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
	//	System.out.println("The id is =========" + obj2.get("_id"));
		 customerIdValue = obj2.get("_id");
		System.out.println("customerIdValue="+customerIdValue);
		//Object customerIdValue=ParseJsonArray.parseJsonArray(res, "data", "docs", "_id");
		FilloExcelUtility.replaceRowPartnereEntity("customerId", (String) customerIdValue, testNameColom);	
		testdatamap = FilloExcelUtility.readExcelWithTestName(testNameColom);
		
		customerId = testdatamap.get("customerId");
		System.out.println("customerId="+customerId);
		return response;
	}
	
	public ClientResponse approveNewCustomerFromBam(String testNameColom) 
	{
		cook=login.loginAsBAM();
		testdatamap = FilloExcelUtility.readExcelWithTestName(testNameColom);
		customerId = testdatamap.get("customerId");
		System.out.println("customerId="+customerId);
		String db=config.getProperty("db");
		System.out.println("dbloc="+db);
		String approveCustomerFrmBamUrl="redington.market/api/v1/endCustomer/"+customerId+"/changeStatus";
		approveCustomerFrmBamUrl=db+approveCustomerFrmBamUrl;
		System.out.println("approveCustomerFrmBamUrl="+approveCustomerFrmBamUrl);
		String put ="{\"comment\":\"Done\",\"status\":\"APPROVED\"}";
		System.out.println("approvalParamters="+put); 
		Put p = new Put();
		response= p.put(approveCustomerFrmBamUrl, put, cook);
		 return response;
	}
}
