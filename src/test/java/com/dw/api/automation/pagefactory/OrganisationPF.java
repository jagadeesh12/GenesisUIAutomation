package com.dw.api.automation.pagefactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
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
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

public class OrganisationPF {
	Get get = new Get();
	Post post=new Post();
	static NewCookie cook;
	ClientResponse response = null;
	String testColomName="AddNewPartnerOrgTest";
	HashMap<String, String> testdatamap = null;
	Object partnerEntityId;
	
	ApiLoginPF login=new ApiLoginPF();
	/*Verify MPN Id*/
	public ClientResponse verifyMPN(String testColomName)
	{
		
		cook=login.loginAsPM();
		testdatamap = FilloExcelUtility.readExcelWithTestName(testColomName);
		String verifyMPNidUrl = testdatamap.get("verifyMPNidUrl");
		System.out.println("Basic verifyMPNidUrl=" + verifyMPNidUrl);
		String mPNid = testdatamap.get("MPNid");
		System.out.println("MPNid=" + mPNid);
		verifyMPNidUrl=verifyMPNidUrl+mPNid;
		System.out.println(" verifyMPNidUrl=" + verifyMPNidUrl);
		response = get.getRestServiceMethod(verifyMPNidUrl, cook);
		return response;
	}
	
	public ClientResponse addNewPartnerOrganisation(String testNameColom) throws FileNotFoundException
	{
		cook=login.loginAsPM();
		testdatamap = FilloExcelUtility.readExcelWithTestName(testNameColom);
		System.out.println("testNameColom="+testNameColom);
		String addNewPartnerOrganisationUrl = testdatamap.get("addNewPartnerOrganisationUrl");
		System.out.println("addNewPartnerOrganisationUrl=" + addNewPartnerOrganisationUrl);
		/* multivalued form data call for windows */
        Configurations config=new Configurations();
		String fileLoc=config.getProperty("jpegfile");
		System.out.println("fileLoc="+fileLoc);
		File initialFile = new File(fileLoc);
		
		
		//for linux
		InputStream targetStream1 = new FileInputStream(initialFile);
		InputStream targetStream2 = new FileInputStream(initialFile);
		InputStream targetStream3 = new FileInputStream(initialFile);
		InputStream targetStream4 = new FileInputStream(initialFile);
		InputStream targetStream5 = new FileInputStream(initialFile);
		HashMap<String, InputStream> fileloc = new HashMap<String, InputStream>();
		fileloc.put("f1", targetStream1);
		fileloc.put("f2", targetStream2);
		fileloc.put("f3", targetStream3);
		fileloc.put("f4", targetStream4);
		fileloc.put("f5", targetStream5);
		FormDataMultiPart formData = new FormDataMultiPart();
		formData.bodyPart(new FileDataBodyPart("logo", initialFile));
		formData.bodyPart(new FileDataBodyPart("Trade License Copy with Partners Page", initialFile));
		formData.bodyPart(new FileDataBodyPart("MOA / Shareholding letter (whichever is applicable)", initialFile));
		formData.bodyPart(new FileDataBodyPart("Trade License Copy with Share Certificate", initialFile));
		formData.bodyPart(new FileDataBodyPart("Owner/Decision Maker/Authorized Signatory Passport Copy with Visa Page",
				initialFile));
		formData.field("tradeLicenseValidityFrom", "2017-11-04");
		formData.field("tradeLicenseValidityTo", "2018-11-26");
		formData.field("existingType", "New");
		String entityName = testdatamap.get("entityName");
		System.out.println("entityName=" + entityName);
		formData.field("entityName", entityName);
		String mpnId = testdatamap.get("mpnId");
		formData.field("mpnId", mpnId);
		formData.field("addressLine1", "addressLine1");
		formData.field("addressLine2", "addressLine2");
		formData.field("addressLine3", "addressLine3");
		String pinCode=testdatamap.get("pinCode");
		System.out.println("pinCode=" + pinCode);
		formData.field("pinCode", pinCode);
		String countryCode=testdatamap.get("countryCode");
		System.out.println("countryCode=" + countryCode);
		formData.field("countryCode", countryCode);
		String region=testdatamap.get("region");
		System.out.println("region=" + region);
		formData.field("region", region);
		String city=testdatamap.get("city");
		System.out.println("city=" + city);
		formData.field("city", city);
		formData.field("contactMobile", "3424242424243");
		formData.field("phoneNumber", "2323232323233");
		formData.field("signingAuthorityName", "signingAuthority");
		formData.field("signingAuthorityEmail", "signingAuthority@fff.com");
		formData.field("financeApproval", "false");
		formData.field("partnerSegment", "Advisor & Consulting Services");
		FilloExcelUtility.updateRow("domainName", testNameColom);
		testdatamap = FilloExcelUtility.readExcelWithTestName(testNameColom);
		String domainName = testdatamap.get("domainName");
		domainName = "www." + domainName + ".com";
		System.out.println("Domain name=" + domainName);
		formData.field("fqdn", domainName);
		FilloExcelUtility.updateRow("tradeLicenseNo", testNameColom);
		testdatamap = FilloExcelUtility.readExcelWithTestName(testNameColom);
		String tradeLicenseNo = testdatamap.get("tradeLicenseNo");
		System.out.println("tradeLicenseNo=" + tradeLicenseNo);
		formData.field("tradeLicenseNo", tradeLicenseNo);
		FilloExcelUtility.updateRow("vatId", testNameColom);
		testdatamap = FilloExcelUtility.readExcelWithTestName(testNameColom);
		String vatId = testdatamap.get("vatId");
		System.out.println("vatId=" + vatId);
		formData.field("vatId", vatId);
		formData.field("termsAndConditions", "on");
		Post postcall = new Post();
		response = postcall.postMultiValuedWithAttachments(addNewPartnerOrganisationUrl, fileloc, formData, cook);
		//return response;
		return null;
		
	}

	
	public void   approveNewOrganisationByBam(String testNameColom)
	{
		//Login as BAM
		 testdatamap = FilloExcelUtility.readExcelWithTestName("login");
		 	cook=login.loginAsBAM();
			System.out.println("Cookie as Token paramter=" + cook);
			
			testdatamap = FilloExcelUtility.readExcelWithTestName(testNameColom);
			String domainName = testdatamap.get("domainName");
			domainName = "www." + domainName + ".com";
			System.out.println("Domain name=" + domainName);
			// autoupdate domain nmae
			String orgBamSearchGetUrl = "https://test.redington.market/api/v1/partnerEntity/approvalList?page=1&pageSize=10&sortBy=modifiedOn&sortOrder=desc&searchKey="
					+ domainName + "";
			System.out.println("Entity idSearchUrl=" + orgBamSearchGetUrl);
			System.out.println("Cookie as Token paramter=" + cook);
			String res = get.getRestServiceMethod2(orgBamSearchGetUrl, cook);
			JSONObject obj = new JSONObject(res);
			JSONArray docsArray = new JSONObject(res).getJSONObject("data").getJSONArray("docs");
			JSONObject obj2 = null;

			List li = new ArrayList();
			for (Object object : docsArray) {
				obj2 = new JSONObject(object.toString());
				// System.out.println("The id is ========="+ obj2.get("_id"));
			}

			System.out.println("The id is =========" + obj2.get("_id"));
		    partnerEntityId = obj2.get("_id");
		 
		    FilloExcelUtility.replaceRowPartnereEntity("partnerEntityId", (String) partnerEntityId, testNameColom);
		    testdatamap = FilloExcelUtility.readExcelWithTestName(testNameColom);
		    System.out.println("partnerEntityId =========" +testdatamap.get("partnerEntityId"));
					String put = "{\"status\": \"APPROVED\",\"comment\": \"done\",\"credit\":\"1000\",\"financeApproval\": \"false\",\"financeEmail\":\"null\",\"partnerEntityId\":\""
					+ partnerEntityId + "\"}";
			System.out.println("put=" + put);
			// String put2 =
			// "{\"comment\":\"yes\",\"credit\":\"500\",\"financeApproval\":\"true\",\"financeEmail\":\"fm6.qa@mailinator.com\",\"partnerEntityId\":\"5a24e4b018a0d83986279e35\",\"status\":\"APPROVED\"}";
			Put p = new Put();
			String orgBamApprovalUrl = "https://test.redington.market/api/v1/partnerEntity/" + partnerEntityId
					+ "/changeStatus";
			System.out.println("orgBamApprovalUrl=" + orgBamApprovalUrl);
			p.put(orgBamApprovalUrl, put, cook);	
			
			
			
			
	}
	
	public void approveNewOrganisationByCA(String testNameColom)
	{
		cook=login.loginAsCA();
		 testdatamap = FilloExcelUtility.readExcelWithTestName("login");
		String posturl = testdatamap.get("testurl");
		System.out.println("Login Url=" + posturl);
		String username = testdatamap.get("causername");
		System.out.println("CA User name==" + username);
		String password = testdatamap.get("capassword");
		System.out.println("CA Password==" + password);
		String postparm = "{\"username\":\"" + username + "\",\"password\":\"" + password + "\"}";
		System.out.println("postparm="+postparm);
		ApiLoginPF login=new ApiLoginPF();
		cook=login.login(posturl, postparm);
		//System.out.println("partnerEntityIdCA="+partnerEntityIdCA);
		testdatamap = FilloExcelUtility.readExcelWithTestName("login");
		
		
		 testdatamap = FilloExcelUtility.readExcelWithTestName(testNameColom);
		 partnerEntityId=testdatamap.get("partnerEntityId");
		 System.out.println("partnerEntityId="+partnerEntityId);
		String vatid=testdatamap.get("vatId");
		System.out.println("vatid="+vatid);
			String orgApprovalByCAUrl="https://test.redington.market/api/v1/partnerEntity/"+partnerEntityId+"/changeStatus";
			String orgApprovalParms= "{\"VATClass\":\"0\",\"billingCurrency\":\"USD\",\"comment\":\"Approved from CA\",\"companyCode\":\"1150/Redington Kuwait\",\"credit\":\"500\",\"partnerEntityId\":\""+partnerEntityId+"\",\"paymentTerm\":\"Advance payment\",\"status\":\"APPROVED\",\"vatId\":\""+vatid+"\"}";
			System.out.println("orgApprovalByCAUrl="+orgApprovalByCAUrl);
			System.out.println("orgApprovalParms="+orgApprovalParms);
			
			Put p = new Put();
			p.put(orgApprovalByCAUrl, orgApprovalParms, cook);
		
		
		
		
		
		
		
	}
	
	//@ToDo
	public void addNewPartnerOrganisationExisting()
	{
		
		
	}
}
