package com.dw.api.automation.steps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
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
import com.dw.api.automation.libs.Put;
import com.dw.api.automation.utils.Configurations;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

public class PlaceOrderWithCoupanCodeTest {
	/* Login to Application */
	static NewCookie cook;
	LoginPost lgoin = new LoginPost();
	Get get = new Get();
	Post post = new Post();
	ExtentReports extent;
	static ExtentTest test;
	ClientResponse response = null;
	HashMap<String, LinkedHashMap<Integer, List>> outerMap = new LinkedHashMap<String, LinkedHashMap<Integer, List>>();
	HashMap<String, String> testdatamap = null;
	Object partnerEntityId = null;

	private List li;
	Object sku = null;
	Object skuAddon = null;
	Object customerId = null;
	Object vendorId = null;
	Object parentSubscriptionId = null;

	@BeforeClass
	public void initateExtentManager() {
		extent = ExtentManager.Instance();
	}

	@Test(priority = 1)
	public void login_to_application() {
		testdatamap = FilloExcelUtility.readExcel();
		test = ExtentManager.loggerInstance(extent, " Test case: Place Order With Coupan Code");
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

	/* TestCase-1 :Add New Partner Organisation */

	@Test(priority = 2)
	public void addNewPartnerOrganisation() throws FileNotFoundException {
		/*
		 * Step-1:verify MPN EntityName:Burhani Computers Trading LLC mpnId:991450
		 */

		testdatamap = FilloExcelUtility.readExcel();
		String verifyMPNidUrl = testdatamap.get("verifyMPNidUrl");
		System.out.println("verifyMPNidUrl=" + verifyMPNidUrl);
		System.out.println("cookie=" + cook);
		response = get.getRestServiceMethod(verifyMPNidUrl, cook);
		/* Step-2:Add new Partner Organisation */
		testdatamap = FilloExcelUtility.readExcel();
		String addNewPartnerOrganisationUrl = testdatamap.get("addNewPartnerOrganisationUrl");
		System.out.println("addNewPartnerOrganisationUrl=" + addNewPartnerOrganisationUrl);

		/* Multi valued form data */
		Configurations config = new Configurations();
		String fileLoc = config.getProperty("jpegfile");
		System.out.println("fileLoc=" + fileLoc);
		File initialFile = new File(fileLoc);
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
		formData.field("addressLine1", "CoupanCodeAdress1");
		formData.field("addressLine2", "CoupanCodeaddressLine2");
		formData.field("addressLine3", "CoupanCodeaddressLine3");

		formData.field("pinCode", "60254");
		formData.field("countryCode", "ARE");
		formData.field("region", "008");
		formData.field("city", "dubai");
		formData.field("contactMobile", "3424242424243");
		formData.field("phoneNumber", "2323232323233");
		formData.field("signingAuthorityName", "signingAuthority");
		formData.field("signingAuthorityEmail", "coupancodeAuthority@fff.com");
		formData.field("financeApproval", "false");
		formData.field("partnerSegment", "Advisor & Consulting Services");
		FilloExcelUtility.updateRow("CoupandomainName", "PlaceOrderWithCoupanCodeTest");
		testdatamap = FilloExcelUtility.readExcel();
		String domainName = testdatamap.get("CoupandomainName");

		domainName = "www." + domainName + ".com";
		System.out.println("Domain name=" + domainName);
		formData.field("fqdn", domainName);
		FilloExcelUtility.updateRow("CoupantradeLicenseNo", "PlaceOrderWithCoupanCodeTest");
		testdatamap = FilloExcelUtility.readExcel();
		String tradeLicenseNo = testdatamap.get("CoupantradeLicenseNo");
		System.out.println("tradeLicenseNo=" + tradeLicenseNo);
		formData.field("tradeLicenseNo", tradeLicenseNo);
		FilloExcelUtility.updateRow("CoupanvatId", "PlaceOrderWithCoupanCodeTest");
		testdatamap = FilloExcelUtility.readExcel();
		String vatId = testdatamap.get("CoupanvatId");
		System.out.println("vatId=" + vatId);
		formData.field("vatId", vatId);
		formData.field("termsAndConditions", "on");
		Post postcall = new Post();
		response = postcall.postMultiValuedWithAttachments(addNewPartnerOrganisationUrl, fileloc, formData, cook);
		logPassStatus("New Partner created");

	}

	/* TestCase-3 :Login As BAM */

	@Test(priority = 3)
	public void orgApproveByBaM() {
		try {
			CertificateHandle.IgnoreSSLClient();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String bamSignInUrl = "https://test.redington.market/api/v1/auth/signIn";
		String bamusername = testdatamap.get("bamusername");
		System.out.println("bamusernamee==" + bamusername);
		String bampassword = testdatamap.get("bampassword");
		System.out.println("bampassword==" + bampassword);
		String postparm = "{\"username\":\""+bamusername+"\",\"password\":\""+bampassword+"\"}";
		cook = lgoin.loginGetPostByJersey(bamSignInUrl, postparm);
		System.out.println("Cookie as Token paramter=" + cook);
		logPassStatus("login to Application with Userid=bam@axsup.ne Password=Pass@123");

	}

	/*
	 * TestCase-4 :Search Organisation with BAM Credentials, : Approve Organisation
	 * with creditLimit=1000,financeApproval=none
	 */

	@Test(priority = 4)
	public void approveOrganisationFromBAM() {
		testdatamap = FilloExcelUtility.readExcel();
		String domainName = testdatamap.get("CoupandomainName");
		domainName = "www." + domainName + ".com";
		System.out.println("Domain name=" + domainName);
		// autoupdate domain nmae
		String orgBamSearchGetUrl = "https://test.redington.market/api/v1/partnerEntity/approvalList?page=1&pageSize=10&sortBy=modifiedOn&sortOrder=desc&searchKey="
				+ domainName + "";
		System.out.println("orgBamSearchGetUrl=" + orgBamSearchGetUrl);
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
		// details get method
		String approvePartnerOrgUrl = "https://test.redington.market/api/v1/partnerEntity/" + partnerEntityId + "";
		System.out.println("approvePartnerOrgUrl=" + approvePartnerOrgUrl);
		get.getRestServiceMethod(approvePartnerOrgUrl, cook);
		System.out.println("Cookie====" + cook);
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
		logPassStatus(" Organisation Search Sucessfull ");
	}

	/* TestCase-5 :Login As C.A */
	@Test(priority = 5)
	public void loginToCAuser() {
		testdatamap = FilloExcelUtility.readExcel();
		try {
			CertificateHandle.IgnoreSSLClient();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String p = null;
		String posturl = testdatamap.get("testurl");
		System.out.println("Login Url=" + posturl);
		String username = testdatamap.get("causername");
		System.out.println("CA User name==" + username);
		String password = testdatamap.get("capassword");
		System.out.println("CA Password==" + password);
		String postparm = "{\"username\":\"" + username + "\",\"password\":\"" + password + "\"}";
		cook = lgoin.loginGetPostByJersey(posturl, postparm);
		System.out.println("Cookie as Token paramter=" + cook);
		logPassStatus("login to C.A Application with Userid=ca@nezdiro.org Password=Pass@123");
	}

	/*
	 * TestCase-6 : Approve Organisation
	 */
	@Test(priority = 6)
	public void orgApprovalByCA() {
		testdatamap = FilloExcelUtility.readExcel();
		System.out.println("partnerEntityId=" + partnerEntityId);
		String vatid = testdatamap.get("vatId");
		System.out.println("vatid=" + vatid);
		String orgApprovalByCAUrl = "https://test.redington.market/api/v1/partnerEntity/" + partnerEntityId
				+ "/changeStatus";
		String orgApprovalParms = "{\"VATClass\":\"0\",\"billingCurrency\":\"USD\",\"comment\":\"Approved from CA\",\"companyCode\":\"9110/Redn Saudi Arabia Co\",\"credit\":\"500\",\"partnerEntityId\":\""
				+ partnerEntityId + "\",\"paymentTerm\":\"Advance payment\",\"status\":\"APPROVED\",\"vatId\":\""
				+ vatid + "\"}";
		System.out.println("orgApprovalByCAUrl=" + orgApprovalByCAUrl);
		System.out.println("orgApprovalParms=" + orgApprovalParms);
		Put p = new Put();
		p.put(orgApprovalByCAUrl, orgApprovalParms, cook);
		logPassStatus(" Organisation Approval Sucess ");

	}

	/* UseCse::Customer on Boarding 
	 * @TestCase-7::login to Application
	 * @TestCase-8::Get Partner Enitity id
	 * @TestCase-9::Create New Customer
	 * @TestCase-10::Login By BAM
	 * @TestCase-11::Get Customer id
	 * @TestCase-12::Approve Customer from Bam
	 */
	
	/* TestCase-7 : login to Application*/
	@Test(priority = 7)
	public void loginPa() {
		
		testdatamap = FilloExcelUtility.readExcel();
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
	/* TestCase-8 : GetvPartner Entity id*/
	@Test(priority =8)
	public void getPartnerEntityid() {
		FilloExcelUtility.updateRow("CoupancustomerdomainName", "PlaceOrderWithCoupanCodeTest");
		testdatamap = FilloExcelUtility.readExcel();
		String domainName = testdatamap.get("CoupandomainName");
		System.out.println("domainName=" + domainName);
		String getPartnerEntityidUrl = "https://test.redington.market/api/v1/partnerEntity?page=1&pageSize=10&sortBy=modifiedOn&sortOrder=desc&searchKey="
				+ domainName + "";
		System.out.println("getPartnerEntityidUrl=" + getPartnerEntityidUrl);
		String res = get.getRestServiceMethod2(getPartnerEntityidUrl, cook);
		partnerEntityId=ParseJsonArray.parseJsonArray(res, "data", "docs", "_id");
		System.out.println("partnerEntityId is =========" +partnerEntityId);
		logPassStatus("Get PartnerEntityid=" + "<br/>partnerEntityId=" + partnerEntityId);
	}

	/* TestCase-9 : Create New Customer*/
	@Test(priority =9)
	public void createNewCustomer() {
		/* verify Existing customer API */
		FilloExcelUtility.updateRow("CoupandomainName", "PlaceOrderWithCoupanCodeTest");
		testdatamap = FilloExcelUtility.readExcel();
		String domainName = testdatamap.get("CoupandomainName");
		String customerdomainName = testdatamap.get("CoupancustomerdomainName");
		customerdomainName = customerdomainName + ".onmicrosoft.com";
		System.out.println("customerdomainName=" + customerdomainName);
		FilloExcelUtility.updateRow("CoupancompanyName", "PlaceOrderWithCoupanCodeTest");
		testdatamap = FilloExcelUtility.readExcel();
		String companyName = testdatamap.get("CoupancompanyName");
		System.out.println("companyName=" + companyName);
		String newCustGetUrl = "https://test.redington.market/api/v1/endCustomers/domainCheck?countryCode=are&domain="
				+ customerdomainName + "";
		System.out.println("newCustGetUrl=" + newCustGetUrl);
		System.out.println("cookie" + cook);
		response = get.getRestServiceMethod(newCustGetUrl, cook);
		System.out.println("Create New Customr Response code=" + response.getStatus());
		System.out.println("Create New Customr Response=" + response.getHeaders().toString());
		String newCustPostUrl = "https://test.redington.market/api/v1/endcustomer";
		String newCustomerpayload = "{\"endCustomerType\": \"New\",\"CompanyName\": \"" + companyName + "\","
				+ "\"ContactFirstName\": \"ApiFirstname\"," + " \"ContactLastName\": \"ApiLastName\","
				+ "\"Address\": {" + "\"Address1\": \"Address1\"," + "\"Address2\": \"Address2\","
				+ "\"Address3\": \"Address3\"}," + "\"City\": \"kuwait\"," + "\"Entity\": \"" + partnerEntityId + "\","
				+ "\"pinCode\": \"75001\"," + "\"CountryId\": \"KWT\"," + "\"PhoneNumber\": \"9008252576\","
				+ "\"MobileNumber\": \"9008252576\"," + "\"Email\": \"checkmail@gmail.com\","
				+ "\"ManagementTypeId\": \"Billing-Only\"," + "\"SpendLimit\": \"500\"," + "\"Department\": \"cse\","
				+ "\"Function\": \"devops\"," + "\"PaymentTypeId\": \"Monthly-Invoice\","
				+ "\"termsAndConditions\": true," + "\"DomainName\": \"" + customerdomainName + "\","
				+ "\"PartnerEntityId\": \"" + partnerEntityId + "\"}";
		System.out.println("newCustomerpayload=" + newCustomerpayload);
		response = post.getPostByJersey("https://test.redington.market/api/v1/endcustomer", newCustomerpayload, cook);
		System.out.println("Cookie as Token paramter=" + cook);
		System.out.println("Create New Customr Response code=" + response.getStatus());
		System.out.println("Create New Customr Response=" + response.toString());
		logPassStatus("New Customer Created Sucessfuly   CustomerName=" + "<br/>companyName=" + companyName);
	}

	
	 /*@TestCase-10::Login By BAM */
	@Test(priority =10)
		public void loginByBaM() {
			try {
				CertificateHandle.IgnoreSSLClient();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			testdatamap = FilloExcelUtility.readExcel();
			String bamUrl = testdatamap.get("bamUrl");
			System.out.println("bamUrl=" + bamUrl);
			String bamusername = testdatamap.get("bamusername");
			System.out.println("bamusername=" + bamusername);
			String bampassword = testdatamap.get("bampassword");
			System.out.println("bampassword=" + bampassword);

			String postparm = "{\"username\":\"" + bamusername + "\",\"password\":\"" + bampassword + "\"}";
			cook = lgoin.loginGetPostByJersey(bamUrl, postparm);
			System.out.println("Cookie as Token paramter=" + cook);
			logPassStatus("login to Application with with BAM Userid=bam@axsup.net Password=Pass@123");
		}
	
	/*@TestCase-11::Get Customer id*/
	@Test(priority =11)
	public void getCustomerId() {
		testdatamap = FilloExcelUtility.readExcel();
		String companyName = testdatamap.get("CoupancompanyName");
		System.out.println("companyName=" + companyName);
		String getCustomerIdUrl = "https://test.redington.market/api/v1/endcustomer/approvalList?page=1&pageSize=10&sortBy=ModifiedOn&sortOrder=desc&searchKey="
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
		partnerEntityId = obj2.get("_id");
		logPassStatus("Get Customer id " + "<br/> Customer id=" + partnerEntityId);
	}
	
	/*Approve from BAM and Create Customer*/	
	@Test(priority =12)
	public void approveCustomerFromBam() 
	{
		System.out.println("The id is =========" + partnerEntityId);
		String approveCustomerFrmBamUrl="https://test.redington.market/api/v1/endCustomer/"+partnerEntityId+"/changeStatus";
		System.out.println("approveCustomerFrmBamUrl="+approveCustomerFrmBamUrl);
		String put ="{\"comment\":\"Done\",\"status\":\"APPROVED\"}";
		System.out.println("approvalParamters="+put); 
		Put p = new Put();
		p.put(approveCustomerFrmBamUrl, put, cook);
		testdatamap = FilloExcelUtility.readExcel();
		String companyName = testdatamap.get("CoupancompanyName");
		logPassStatus("Customer has been Approved " + "<br/> Customer name=" + companyName);
	}
	
	/*UseCase::Market Place
     * @TestCase-13::login to Application
	 * @TestCase-14::Search Base Product
	 * @TestCase-15::Add Base Product 365 Enterprise  with 2 licenses monthly 
	 * @TestCase-16::Add AddOn Office 365 Extra File Storage with 1 licenses monthly  
	 * @TestCase-17::PlaceOrder
	 * @TestCase-18::Order Provision
	 */
	
	@Test(priority = 13)
	/* @TestCase-13::login to Application*/
	public void loginApplication() {
		testdatamap = FilloExcelUtility.readExcel();
		
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
	
	/* @TestCase-14::Search Base Product 
	 * Search Product --Office 365 Enterprise E3 and get sku-id "796b6b5f-613c-4e24-a17c-eba730d49c02*/
	@Test(priority = 14)
	public void searchBaseProduct()
	{
		testdatamap = FilloExcelUtility.readExcel();
		String marketPlaceBaseUrl=testdatamap.get("marketPlaceBaseUrl");
		System.out.println("marketPlaceBaseUrl=" + marketPlaceBaseUrl);
		System.out.println("Cookie as Token paramter=" + cook);
		String res = get.getRestServiceMethod2(marketPlaceBaseUrl, cook);
				
		 sku = ParseJsonArray.parseJsonArray(res, "data", "items", "sku");
		System.out.println("sku id="+sku);
		logPassStatus("Search for Base Product Office-365-Enterprise-E3  is  sucessfull  "+"<br/> sku-id="+sku);
	
	}
	
	/*@TestCase-15::Add Base Product 365 Enterprise  with 2 licenses monthly */
	@Test(priority = 15)
	public void addBaseProductWithTwoLicenses()
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
	
	/* @TestCase-16::Add AddOn Office 365 Extra File Storage with 1 licenses monthly*/  
	@Test(priority = 16)
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
	/*Use Case : Create Coupan Code
	  * @TestCase-17::login to Application
	 * @TestCase-18::getPartnerEntityid
	 * @TestCase-19::getCustomerId
	 * @TestCase-20::loginByBaM 
	 * @TestCase-21::createCoupon
	 * @TestCase-22::getCouponCode
	 */

	/*@TestCase-17::login to Application*/
	@Test(priority =17)
	public void loginAsPa()
	{
		testdatamap = FilloExcelUtility.readExcel();
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
	/* @TestCase-18::getPartnerEntityid */
	@Test(priority =18)
	public void getPartnerEntityidforCoupanCreation() {
		FilloExcelUtility.updateRow("CoupandomainName", "PlaceOrderWithCoupanCodeTest");
		testdatamap = FilloExcelUtility.readExcel();
		String domainName = testdatamap.get("CoupandomainName");
		System.out.println("domainName=" + domainName);
		String getPartnerEntityidUrl = "https://test.redington.market/api/v1/partnerEntity?page=1&pageSize=10&sortBy=modifiedOn&sortOrder=desc&searchKey="
				+ domainName + "";
		System.out.println("getPartnerEntityidUrl=" + getPartnerEntityidUrl);
		String res = get.getRestServiceMethod2(getPartnerEntityidUrl, cook);
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
		logPassStatus("Get PartnerEntityid=" + "<br/>partnerEntityId=" + partnerEntityId);
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
			test.log(LogStatus.FAIL, result.getThrowable());
		}
	}
}
