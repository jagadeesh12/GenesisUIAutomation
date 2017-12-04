package com.dw.automation.pages.impl;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dw.automation.pages.CustomerCreateAndApprovePage;
import com.dw.automation.pages.OrgCreateAndApprovePage;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.RConstantUtils;
import com.dw.automation.support.RUtils;
import com.dw.automation.support.RandomDataUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.cucumber.uploadResults.WrapperFunctions;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBase;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;

import junit.framework.Assert;

public class OrgCreateAndApproveImpl extends BaseTestPage<TestPage> implements OrgCreateAndApprovePage {

	
	@FindBy(locator = "rd.orgonboard.usermenu")
	private WebElement UserMenu;
	
	@FindBy(locator = "rd.orgonboard.accmgmt")
	private WebElement AccountMgtMenu;
	
	@FindBy(locator = "rd.orgonboard.organization")
	private WebElement OrganizationMenu;
	
	@FindBy(locator = "rd.orgonboard.btn.Addbtn")
	private WebElement OrgAddBtn;
	
	@FindBy(locator = "rd.orgonboard.txtbox.orgname")
	private WebElement OrgNameTxtBox;
	
	@FindBy(locator = "rd.orgonboard.txtbox.mpnid")
	private WebElement MPNIDtxtBox;
	
	@FindBy(locator = "rd.orgonboard.btn.mpnverify")
	private WebElement mpnVerifyBtn;
	
	@FindBy(locator = "rd.orgonboard.txtbox.orgaddr1")
	private WebElement orgaddr1TxtBox;
	
	@FindBy(locator = "rd.orgonboard.txtbox.orgaddr2")
	private WebElement orgaddr2TxtBox;
	
	@FindBy(locator = "rd.orgonboard.txtbox.orgaddr3")
	private WebElement orgaddr3TxtBox;
	
	@FindBy(locator = "rd.orgonboard.txtbox.postalcode")
	private WebElement postalcodeTxtBox;
	
	@FindBy(locator = "rd.orgonboard.drpdwn.region")
	private WebElement regionDrpDwn;
	
	@FindBy(locator = "rd.orgonboard.drpdwn.country")
	private WebElement countryDrpDwn;
	
	public WebElement getOrgAddBtn() {
		return OrgAddBtn;
	}
	
	public WebElement getOrgNameTxtBox() {
		return OrgNameTxtBox;
	}
	
	public WebElement getMPNIDtxtBox() {
		return MPNIDtxtBox;
	}
	
	public WebElement getmpnVerifyBtn() {
		return mpnVerifyBtn;
	}
	
	public WebElement getorgaddr1TxtBox() {
		return orgaddr1TxtBox;
	}
	
	public WebElement getorgaddr2TxtBox() {
		return orgaddr2TxtBox;
	}
	public WebElement getorgaddr3TxtBox() {
		return orgaddr3TxtBox;
	}
	
	public WebElement getpostalcodeTxtBox() {
		return postalcodeTxtBox;
	}
	
	public WebElement getcountryDrpDwn() {
		return countryDrpDwn;
	}
	
	public WebElement getregionDrpDwn() {
		return regionDrpDwn;
	}
	
	public WebElement getAccountMgtMenu() {
		return AccountMgtMenu;
	}
	
	public WebElement getOrganizationMenu() {
		return OrganizationMenu;
	}
	
	public WebElement getUserMenu() {
		
		return UserMenu;
	}
	
	@FindBy(locator = "rd.orgonboard.drpdwn.city")
	private WebElement orgcity;
	
	public WebElement getorgcity() {
		return orgcity;
	}

	@FindBy(locator = "rd.orgonboard.txtbox.mobile")
	private WebElement orgmobile;
	
	public WebElement getorgmobile() {
		return orgmobile;
	}

	@FindBy(locator = "rd.orgonboard.txtbox.phone")
	private WebElement orgphone;
	
	public WebElement getorgphone() {
		return orgphone;
	}

	@FindBy(locator = "rd.orgonboard.txtbox.signauthname")
	private WebElement orgsignauthname;
	
	public WebElement getorgsignauthname() {
		return orgsignauthname;
	}

	@FindBy(locator = "rd.orgonboard.txtbox.signauthemail")
	private WebElement orgsignauthemail;
	
	public WebElement getorgsignauthemail() {
		return orgsignauthemail;
	}

	@FindBy(locator = "rd.orgonboard.rdBtn.finapproval")
	private WebElement orgfinapproval;
	
	public WebElement getorgfinapproval() {
		return orgfinapproval;
	}

	@FindBy(locator = "rd.orgonboard.drpdwn.partnersegmnt")
	private WebElement orgpartnersegmnt;
	
	public WebElement getorgpartnersegmnt() {
		return orgpartnersegmnt;
	}

	@FindBy(locator = "rd.orgonboard.txtbox.compdomain")
	private WebElement orgcompdomain;
	
	public WebElement getorgcompdomain() {
		return orgcompdomain;
	}

	@FindBy(locator = "rd.orgonboard.txtbox.tradelic")
	private WebElement orgtradelic;
	
	public WebElement getorgtradelic() {
		return orgtradelic;
	}

	@FindBy(locator = "rd.orgonboard.txtbox.calendar")
	private WebElement orgtradecalendar;
	
	public WebElement getorgtradecalendar() {
		return orgtradecalendar;
	}

	@FindBy(locator = "rd.orgonboard.txtbox.vatid")
	private WebElement orgvatid;
	
	public WebElement getorgvatid() {
		return orgvatid;
	}

	@FindBy(locator = "rd.orgonboard.chkbox.iagreechkbox")
	private WebElement orgiagreechkbox;
	
	public WebElement getiagreechkbox() {
		return orgiagreechkbox;
	}

	@FindBy(locator = "rd.orgonboard.btn.save")
	private WebElement orgsavebtn;
	
	public WebElement getorgsaveBtn() {
		return orgsavebtn;
	}


	@FindBy(locator = "rd.orgonboard.fileUpload")
	private WebElement fileUpload;
	
	public WebElement getfileUpload() {
		return fileUpload;
	}
	
	@FindBy(locator = "rd.orgonboard.popUp.orgCreate")
	private WebElement orgCreate;
	
	public WebElement getffileUploadPopup() {
		return orgCreate;
	}

	
	@FindBy(locator = "rd.orgonboard.popUp.close")
	private WebElement closePopup;
	
	public WebElement getclosePopup() {
		return closePopup;
	}

	@FindBy(locator = "rd.orgonboard.bam.usermenu")
	private WebElement bamUserMenu;
	
	
	public WebElement getbamUserMenu() {
		return bamUserMenu;
	}
	
	@FindBy(locator = "rd.orgonboard.bam.txtbox.search")
	private WebElement bamSearchTxtBox;
	
	public WebElement getbamSearchTxtBox() {
		return bamSearchTxtBox;
	}
	
	@FindBy(locator = "rd.orgonboard.bam.btn.search")
	private WebElement bamSearchBtn;
	
	public WebElement getbamSearchBtn() {
		return bamSearchBtn;
	}
	
	@FindBy(locator = "rd.orgonboard.fileUpload")
	private WebElement logoUpload;
	
	public WebElement getlogoUpload() {
		return logoUpload;
	}
	
	@FindBy(locator = "rd.orgonboard.bam.icon.approve")
	private WebElement approveIcon;
	
	public WebElement getapproveIcon() {
		return approveIcon;
	}
	
	@FindBy(locator = "rd.orgonboard.bam.drpdwn.status")
	private WebElement statusSelectBox;
	
	public WebElement getstatusSelectBox() {
		return statusSelectBox;
	}
	
	@FindBy(locator = "rd.orgonboard.bam.txtbox.credit")
	private WebElement bamCredittxtBox;
	
	public WebElement getbamCredittxtBox() {
		return bamCredittxtBox;
	}
	
	@FindBy(locator = "rd.orgonboard.bam.rdBtn.finApp")
	private WebElement rdBtnFinApp;
	
	public WebElement getrdBtnFinApp() {
		return rdBtnFinApp;
	}
	
	@FindBy(locator = "rd.orgonboard.bam.txtbox.comment")
	private WebElement commentTxtBox;
	
	public WebElement getcommentTxtBox() {
		return commentTxtBox;
	}
	
	@FindBy(locator = "rd.orgonboard.bam.btn.update")
	private WebElement updateBtn;
	
	public WebElement getupdateBtn() {
		return updateBtn;
	}
	
	@FindBy(locator = "rd.orgonboard.ca.btn.update")
	private WebElement updateCABtn;
	
	public WebElement getupdateCABtn() {
		return updateCABtn;
	}
	@FindBy(locator = "rd.orgonboard.bam.status.txt")
	private WebElement statusTxt;
	
	public WebElement getstatusTxt() {
		return statusTxt;
	}
	
	@FindBy(locator = "rd.orgonboard.ca.drpdwm.compCode")
	private WebElement compCodeSelect;
	
	public WebElement getcompCodeSelect() {
		return compCodeSelect;
	}
	
	@FindBy(locator = "rd.orgonboard.ca.drpdwm.paymentTerm")
	private WebElement paymentSelect;
	
	public WebElement getpaymentSelect() {
		return paymentSelect;
	}
	
	@FindBy(locator = "rd.orgonboard.ca.drpdwm.currency")
	private WebElement currencySelect;
	
	public WebElement getcurrencySelect() {
		return currencySelect;
	}
	
	@FindBy(locator = "rd.orgonboard.pm.btn.search")
	private WebElement searchBtnPm;
	
	public WebElement getsearchBtnPm() {
		return searchBtnPm;
	}
	
	@FindBy(locator = "rd.orgonboard.pm.txt.status")
	private WebElement statusTxtPM;
	
	public WebElement getstatusTxtPM() {
		return statusTxtPM;
	}
	
	@FindBy(locator = "rd.orgonboard.bam.btn.rejectUpdate")
	private WebElement rejectUpdateBAM;
	
	public WebElement getrejectUpdateBAM() {
		return rejectUpdateBAM;
	}
	

	@FindBy(locator = "rd.orgonboard.drpdwn.finEmail")
	private WebElement finEmail;
	
	public WebElement getfinEmail() {
		return finEmail;
	}
	
	// ------------------------Existing onboard 
	
	@FindBy(locator = "rd.exorgonboard.pm.rdBtn.orgselection")
	private WebElement orgselection;
	
	public WebElement getorgselection() {
		return orgselection;
	}

	@FindBy(locator = "rd.exorgonboard.pm.txtbox.customercode")
	private WebElement customercode;
	
	public WebElement getcustomercode() {
		return customercode;
	}

	@FindBy(locator = "rd.exorgonboard.pm.txtbox.companycode")
	private WebElement companycode;
	
	public WebElement getcompanycode() {
		return companycode;
	}

	@FindBy(locator = "rd.exorgonboard.pm.btn.orgsearch")
	private WebElement orgsearch;
	
	public WebElement getorgsearch() {
		return orgsearch;
	}

	@FindBy(locator = "rd.exorgonboard.pm.txtbox.orgmpnid")
	private WebElement orgmpnid;
	
	public WebElement getorgmpnid() {
		return orgmpnid;
	}

	@FindBy(locator = "rd.exorgonboard.pm.btn.orgmpnverify")
	private WebElement orgmpnverify;
	
	public WebElement getorgmpnverify() {
		return orgmpnverify;
	}

	@FindBy(locator = "rd.exorgonboard.pm.txtbox.orgsigningAuthorityName")
	private WebElement orgsigningAuthorityName;
	
	public WebElement getorgsigningAuthorityName() {
		return orgsigningAuthorityName;
	}

	@FindBy(locator = "rd.exorgonboard.pm.txtbox.orgsignauthemail")
	private WebElement exorgsignauthemail;
	
	public WebElement getexorgsignauthemail() {
		return exorgsignauthemail;
	}


	@FindBy(locator = "rd.exorgonboard.rdBtn.orgfinapproval")
	private WebElement exorgfinapproval;
	
	public WebElement getexorgfinapproval() {
		return exorgfinapproval;
	}

	@FindBy(locator = "rd.exorgonboard.drpdwn.orgpartnersegmnt")
	private WebElement exorgpartnersegmnt;
	
	public WebElement getexorgpartnersegmnt() {
		return exorgpartnersegmnt;
	}

	@FindBy(locator = "rd.exorgonboard.txtbox.orgcompdomain")
	private WebElement exorgcompdomain;
	
	public WebElement getexorgcompdomain() {
		return exorgcompdomain;
	}

	@FindBy(locator = "rd.exorgonboard.txtbox.orgvatid")
	private WebElement exorgvatid;
	
	public WebElement getexorgvatid() {
		return exorgvatid;
	}

	@FindBy(locator = "rd.exorgonboard.chkbox.orgiagreechkbox")
	private WebElement exorgiagreechkbox;
	
	public WebElement getexorgiagreechkbox() {
		return exorgiagreechkbox;
	}

	@FindBy(locator = "rd.exorgonboard.btn.orgsave")
	private WebElement exorgsave;
	
	public WebElement getexorgsave() {
		return exorgsave;
	}
	
	@FindBy(locator = "rd.orgonboard.popUp.createOrg")
	private WebElement createOrgPopup;
	
	public WebElement getcreateOrgPopupClose() {
		return createOrgPopup;
	}

	//------------------------End---------

	@FindBy(locator = "rd.orgonboard.upload.licCopy")
	private WebElement uploadFileBtn1;
	
	public WebElement getuploadFileBtn1() {
		return uploadFileBtn1;
	}
	
	@FindBy(locator = "rd.orgonboard.upload.shareHolding")
	private WebElement uploadFileBtn2;
	
	public WebElement getuploadFileBtn2() {
		return uploadFileBtn2;
	}
	
	@FindBy(locator = "rd.orgonboard.upload.tradeLic")
	private WebElement uploadFileBtn3;
	
	public WebElement getuploadFileBtn3() {
		return uploadFileBtn3;
	}
	
	@FindBy(locator = "rd.orgonboard.upload.ownerPassportCopy")
	private WebElement uploadFileBtn4;
	
	public WebElement getuploadFileBtn4() {
		return uploadFileBtn4;
	}
	
	@FindBy(locator = "rd.orgonboard.drpdwn.userfm")
	private WebElement userfmDrpdwn;
	
	public WebElement getuserfmDrpdwn() {
		return userfmDrpdwn;
	}
	
	
	WrapperFunctions wf = new WrapperFunctions();
	WebDriver driver=TestBaseProvider.getTestBase().getDriver();
	TestBase testBase = TestBaseProvider.getTestBase();
	
	public String basepath;
	@Override
	protected void openPage() {
		// TODO Auto-generated method stub
		
	}
	
	PartnerUserPageImpl pupi = new PartnerUserPageImpl();

	public void goToOrgPage() {
		try {
			
		wf.click_element(getcreateOrgPopupClose());
		}catch(Exception e) {
			System.out.println("New Organization create popup not present");
		}
		wf.click_element(getUserMenu());
		wf.click_element(getAccountMgtMenu());
		wf.click_element(getOrganizationMenu());
		System.out.println("Going to organization page.");
	}

	

	public String fillOrgForm() {
		
		wf.click_element(getOrgAddBtn());
		String orgName = testBase.getTestData().getString("orgname");
		String mpnId = testBase.getTestData().getString("mpnId");
		PauseUtil.pause(2000);
		
		getOrgNameTxtBox().sendKeys(orgName);
		getMPNIDtxtBox().sendKeys(mpnId);
		PauseUtil.pause(2000);
		wf.click_element(getmpnVerifyBtn());
		System.out.println("Waiting for mpn verify");
		RUtils.waitforloadingtodissappear();
		System.out.println("Starting file upload function");
		wf.click_element(getlogoUpload());
		File currentDir = new File (testBase.getTestData().getString("filePath"));
		try {
			basepath = currentDir.getCanonicalPath();
			System.out.println("Baseapth :"+basepath);
		
	    	String fileDoc = testBase.getTestData().getString("filePath");
			
			RUtils.upload_Documents(basepath);
					
			}catch (AWTException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
					}
		System.out.println("End of file upload function");
		//PauseUtil.pause(10000);
		getorgaddr1TxtBox().sendKeys(testBase.getTestData().getString("orgAdd1"));
		getorgaddr2TxtBox().sendKeys(testBase.getTestData().getString("orgAdd2"));
		getorgaddr3TxtBox().sendKeys(testBase.getTestData().getString("orgAdd3"));
		getpostalcodeTxtBox().sendKeys(testBase.getTestData().getString("postalCode"));

		SCHUtils.selectOptionByvalue(getcountryDrpDwn(), testBase.getTestData().getString("country"));
		SCHUtils.selectOptionByvalue(getregionDrpDwn(), testBase.getTestData().getString("region"));
		//SCHUtils.selectOptionByvalue(getorgcity(), testBase.getTestData().getString("city"));
		getorgcity().sendKeys(testBase.getTestData().getString("city"));

		String number = null;
		getorgmobile().sendKeys(RandomDataUtil.getPhoneNumber(number));
		getorgphone().sendKeys(RandomDataUtil.getPhoneNumber(number));
		getorgsignauthname().sendKeys(testBase.getTestData().getString("signAuth"));
		getorgsignauthemail().sendKeys(testBase.getTestData().getString("signAuthEmail"));
		wf.click_element(getorgfinapproval());
		SCHUtils.selectOptionsByVisibleText(getuserfmDrpdwn(), PartnerUserPageImpl.readXML("userFm").toLowerCase());
		SCHUtils.selectOptionByvalue(getorgpartnersegmnt(), testBase.getTestData().getString("partnerSegment"));
		//SCHUtils.selectOptionByvalue(getfinEmail(), );
		String name = RUtils.generateName();
		String domainName = "www."+name+".com";
		getorgcompdomain().sendKeys(domainName);
		getorgtradelic().sendKeys(testBase.getTestData().getString("tradeLi"));
		getorgtradecalendar().sendKeys(testBase.getTestData().getString("tradeLicCal"));
		getorgvatid().sendKeys(testBase.getTestData().getString("tradeLi"));
		//PauseUtil.pause(20000);
		try {
			System.out.println("Starting 2 file upload function");
			wf.click_element(getuploadFileBtn1());
			RUtils.upload_Documents(basepath);
			System.out.println("Starting 3 file upload function");
			wf.click_element(getuploadFileBtn2());
			RUtils.upload_Documents(basepath);
			System.out.println("Starting 4 file upload function");
			wf.click_element(getuploadFileBtn3());
			RUtils.upload_Documents(basepath);
			System.out.println("Starting 5 file upload function");
			wf.click_element(getuploadFileBtn4());
			RUtils.upload_Documents(basepath);

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Fileupload function
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);",getorgsaveBtn());
		wf.click_element(getiagreechkbox());
		wf.click_element(getorgsaveBtn());
		System.out.println("Saving organization after filling the form");
		RUtils.waitforloadingtodissappear();
		boolean partnerEnity = getffileUploadPopup().getText().contains(RConstantUtils.ORG_CREATE_SUCCESS);
        Assert.assertTrue("Partner Entity not created succesfully",partnerEnity);
        wf.click_element(getclosePopup());
        System.out.println("Filled creating new organizaton with domain name "+domainName);
     
        PartnerUserPageImpl.writeXML("domain","cust",domainName, "0000");
        return domainName;

	}
	
   public String fillExistingOrgForm(){
	PauseUtil.pause(5000);
	wf.click_element(getOrgAddBtn());
	wf.click_element(getorgselection());
	getcustomercode().sendKeys(testBase.getTestData().getString("customercode"));
	getcompanycode().sendKeys(testBase.getTestData().getString("companycode"));
	wf.click_element(getorgsearch());
	PauseUtil.pause(10000);
	getorgmpnid().sendKeys(testBase.getTestData().getString("orgmpnid"));
	wf.click_element(getorgmpnverify());
	RUtils.waitforloadingtodissappear();
	wf.click_element(getlogoUpload());
	File currentDir = new File (testBase.getTestData().getString("filePath"));
	try {
		basepath = currentDir.getCanonicalPath();
		System.out.println("Baseapth :"+basepath);
	
    	String fileDoc = testBase.getTestData().getString("filePath");
		
		RUtils.upload_Documents(basepath);
				
		}catch (AWTException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
				}
	System.out.println("End of file upload function for existing customer");
	PauseUtil.pause(5000);
	getorgsigningAuthorityName().sendKeys(testBase.getTestData().getString("orgsigningAuthorityName"));
	
	getexorgsignauthemail().sendKeys(testBase.getTestData().getString("exorgsignauthemail"));

	wf.click_element(getexorgfinapproval());

	SCHUtils.selectOptionByvalue(getorgpartnersegmnt(), testBase.getTestData().getString("exorgpartnersegmnt"));

	String name = RUtils.generateName();

	String domainName = "www."+name+".com";
	getexorgcompdomain().sendKeys(domainName);
	PauseUtil.pause(3000);
	getexorgvatid().sendKeys("orgmpnid");
	try {
		System.out.println("Starting 2 file upload function");
		wf.click_element(getuploadFileBtn1());
		RUtils.upload_Documents(basepath);
		System.out.println("Starting 3 file upload function");
		wf.click_element(getuploadFileBtn2());
		RUtils.upload_Documents(basepath);
		System.out.println("Starting 4 file upload function");
		wf.click_element(getuploadFileBtn3());
		RUtils.upload_Documents(basepath);
		System.out.println("Starting 5 file upload function");
		wf.click_element(getuploadFileBtn4());
		RUtils.upload_Documents(basepath);

	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	JavascriptExecutor je = (JavascriptExecutor) driver;
    je.executeScript("arguments[0].scrollIntoView(true);",getexorgsave());
	wf.click_element(getexorgiagreechkbox());
	PauseUtil.pause(3000);
	wf.click_element(getexorgsave());
	RUtils.waitforloadingtodissappear();
	wf.click_element(getclosePopup());
	System.out.println("Domain Name after registering for existing customer:" +domainName);
	return domainName;
	   
   }

		
		
		
	

	
	public void loginApplicationAsBAM() {

		String username = testBase.getString("userBAM");
		String password = testBase.getString("passBAM");
		System.out.println(username);
		System.out.println(password);
		pupi.login(username,password);
        PauseUtil.waitForAjaxToComplete(4000);
        System.out.println("Logged in as BAM");
		
	}

	
	public void approveOrg(String domainName, String status) {
		wf.click_element(getbamUserMenu());
		wf.click_element(getAccountMgtMenu());
		wf.click_element(getOrganizationMenu());
		System.out.println("Going to organization page.");
		PauseUtil.pause(3000);
		getbamSearchTxtBox().sendKeys(domainName);
		wf.click_element(getbamSearchBtn());
		wf.click_element(getapproveIcon());
		System.out.println("Clicked "+status+" icon.");
		switch(status){    
		case "Approve":
			PauseUtil.pause(3000);
			SCHUtils.selectOptionByvalue(getstatusSelectBox(), "1: APPROVED");
			getbamCredittxtBox().clear();
			PauseUtil.pause(3000);
			getbamCredittxtBox().sendKeys(testBase.getTestData().getString("credit"));
			//wf.click_element(getrdBtnFinApp());
			
			getcommentTxtBox().sendKeys("APPROVED");
			wf.click_element(getupdateBtn());
			PauseUtil.pause(2000);
			boolean statusApp = getstatusTxt().getAttribute("title").contains("Approved");
			Assert.assertTrue("BAM Approval scenario failed",statusApp);
			System.out.println("BAM approved organization successfully");
			break;
		case "Reject":
			PauseUtil.pause(3000);
			SCHUtils.selectOptionByvalue(getstatusSelectBox(), "2: REJECTED");
			getcommentTxtBox().sendKeys("REJECTED");
			wf.click_element(getrejectUpdateBAM());
			PauseUtil.pause(3000);
			boolean statusReject = getstatusTxt().getAttribute("title").contains("Rejected");
			Assert.assertTrue("BAM Approval scenario failed",statusReject);
			System.out.println("BAM rejeced organization successfully");
			break;
		
		case "Onhold":
			PauseUtil.pause(3000);
			SCHUtils.selectOptionByvalue(getstatusSelectBox(), "3: ONHOLD");
			getcommentTxtBox().sendKeys("ONHOLD");
			wf.click_element(getrejectUpdateBAM());
			PauseUtil.pause(3000);
			boolean statusOnhold = getstatusTxt().getAttribute("title").contains("Onhold");
			Assert.assertTrue("BAM Approval scenario failed",statusOnhold);
			System.out.println("BAM onhold organization successfully");
			break;
		
		}
		
		
	}

	public void approveOrgAsCA(String domainName, String status) {
		wf.click_element(getbamUserMenu());
		wf.click_element(getAccountMgtMenu());
		wf.click_element(getOrganizationMenu());
		PauseUtil.pause(3000);
		System.out.println("DOMAIN NAME :"+domainName);
		getbamSearchTxtBox().sendKeys(domainName);
		PauseUtil.pause(3000);
		wf.click_element(getbamSearchBtn());
		PauseUtil.pause(3000);
		wf.click_element(getapproveIcon());		
		switch(status){    
		case "Approve":
			PauseUtil.pause(3000);
			SCHUtils.selectOptionByvalue(getstatusSelectBox(), "1: APPROVED");
			SCHUtils.selectOptionByvalue(getcompCodeSelect(), "2: 1120/Redington Middleeast");
			SCHUtils.selectOptionByvalue(getpaymentSelect(), "1: 30 Days from Invoice date");
			SCHUtils.selectOptionByvalue(getcurrencySelect(), "2: USD");
			getcommentTxtBox().sendKeys("APPROVED");
			wf.click_element(getupdateCABtn());
			PauseUtil.pause(2000);
			boolean statusApp = getstatusTxt().getAttribute("title").contains("Approved");
			Assert.assertTrue("CA Approval scenario failed",statusApp);
			System.out.println("CA Approve organization successfully");
			break;
			
		case "Reject":
			PauseUtil.pause(3000);
			SCHUtils.selectOptionByvalue(getstatusSelectBox(), "2: REJECTED");
			getcommentTxtBox().sendKeys("REJECTED");
			wf.click_element(getrejectUpdateBAM());
			PauseUtil.pause(3000);
			boolean statusReject = getstatusTxt().getAttribute("title").contains("Rejected");
			Assert.assertTrue("CA Approval scenario failed",statusReject);
			System.out.println("CA Reject organization successfully");
			break;
			
		case "Onhold":
			PauseUtil.pause(3000);
			SCHUtils.selectOptionByvalue(getstatusSelectBox(), "3: ONHOLD");
			getcommentTxtBox().sendKeys("ONHOLD");
			wf.click_element(getrejectUpdateBAM());
			PauseUtil.pause(3000);
			boolean statusOnhold = getstatusTxt().getAttribute("title").contains("Onhold");
			Assert.assertTrue("CA Approval scenario failed",statusOnhold);
			System.out.println("CA ONHOLD organization successfully");
			break;
			}	
			

		
		
	}

	
	public void verifyOrg(String domainName, String status) {
		goToOrgPage();
		getbamSearchTxtBox().sendKeys(domainName);
		wf.click_element(getsearchBtnPm());
		switch (status) {
			case "Approve":
				boolean statusApp = getstatusTxtPM().getAttribute("title").contains("Approved");
				Assert.assertTrue("PM Verification scenario failed",statusApp);
				System.out.println("PM org approve Verification scenario ");
				break;
				
			case "Reject":
				boolean statusReject = getstatusTxtPM().getAttribute("title").contains("Rejected");
				Assert.assertTrue("PM Verification scenario failed",statusReject);
				System.out.println("PM org reject Verification scenario ");
				break;
				
			case "Onhold":
				boolean statusOnhold = getstatusTxtPM().getAttribute("title").contains("Onhold");
				Assert.assertTrue("PM onhold Verification scenario failed",statusOnhold);
				break;
			}
	}

	@Override
	public void loginApplicationAsCA() {
		String username = testBase.getString("userCA");
		String password = testBase.getString("passCA");
		pupi.login(username,password);
        PauseUtil.waitForAjaxToComplete(4000);
        System.out.println("Logged in as CA");
		
	}

	
}
