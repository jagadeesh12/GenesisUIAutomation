package com.dw.automation.pages.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dw.automation.pages.CustomerCreateAndApprovePage;
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

public class CustomerCreateAndApproveImpl extends BaseTestPage<TestPage> implements CustomerCreateAndApprovePage {
	
	
	@FindBy(locator = "rd.custonboard.option.customer")
	private WebElement customerOption;
	
	public WebElement getcustomerOption() {
		return customerOption;
	}
	
	@FindBy(locator = "rd.custonboard.txtbox.compName")
	private WebElement companyName;
	
	public WebElement getCompanynameTxtBox() {
		return companyName;
	}
	
	@FindBy(locator = "rd.custonboard.txtbox.firstName")
	private WebElement firstName;
	
	public WebElement getfirstNameTxtBox() {
		return firstName;
	}
	
	@FindBy(locator = "rd.custonboard.txtbox.lastName")
	private WebElement lastName;
	
	public WebElement getlastNameTxtBox() {
		return lastName;
	}
	
	@FindBy(locator = "rd.custonboard.txtbox.addr1")
	private WebElement addr1;
	
	public WebElement getAddress1TxtBox() {
		return addr1;
	}
	
	@FindBy(locator = "rd.custonboard.txtbox.addr2")
	private WebElement addr2;
	
	public WebElement getAddress2TxtBox() {
		return addr2;
	}
	
	@FindBy(locator = "rd.custonboard.txtbox.addr3")
	private WebElement addr3;
	
	public WebElement getAddress3TxtBox() {
		return addr3;
	}
	
	@FindBy(locator = "rd.custonboard.txtbox.city")
	private WebElement city;
	
	public WebElement getCityTxtBox() {
		return city;
	}
	
	@FindBy(locator = "rd.custonboard.drpdwn.organization")
	private WebElement organization;
	
	public WebElement getorganizationSelectBox() {
		return organization;
	}
	
	@FindBy(locator = "rd.custonboard.txtbox.pincode")
	private WebElement pincode;
	
	public WebElement getpincodeTxtBox() {
		return pincode;
	}
	
	@FindBy(locator = "rd.custonboard.drpdwn.country")
	private WebElement country;
	
	public WebElement getcountrySelectBox() {
		return country;
	}
	
	@FindBy(locator = "rd.custonboard.txtbox.phone")
	private WebElement phone;
	
	public WebElement getphoneTxtBox() {
		return phone;
	}
	
	@FindBy(locator = "rd.custonboard.txtbox.mobile")
	private WebElement mobile;
	
	public WebElement getmobileTxtBox() {
		return mobile;
	}
	
	@FindBy(locator = "rd.custonboard.txtbox.email")
	private WebElement email;
	
	public WebElement getemailTxtBox() {
		return email;
	}
	
	@FindBy(locator = "rd.custonboard.txtbox.spendLimit")
	private WebElement spendLimit;
	
	public WebElement getspendLimitTxtBox() {
		return spendLimit;
	}
	
	@FindBy(locator = "rd.custonboard.rdbtn.managmentType")
	private WebElement managmentType;
	
	public WebElement getmanagmentTypeTxtBox() {
		return managmentType;
	}
	
	@FindBy(locator = "rd.custonboard.txtbox.department")
	private WebElement department;
	
	public WebElement getdepartmentTxtBox() {
		return department;
	}
	
	@FindBy(locator = "rd.custonboard.txtbox.function")
	private WebElement function;
	
	public WebElement getfunctionTxtBox() {
		return function;
	}
	
	@FindBy(locator = "rd.custonboard.rdbtn.payment")
	private WebElement payment;
	
	public WebElement getpaymentRadioBtn() {
		return payment;
	}
	
	@FindBy(locator = "rd.custonboard.chkbox.iagree")
	private WebElement iagree;
	
	public WebElement getiagreeCheckBox() {
		return iagree;
	}
	
	@FindBy(locator = "rd.custonboard.btn.submit")
	private WebElement submit;
	
	public WebElement getsubmitBtn() {
		return submit;
	}
	
	@FindBy(locator = "rd.custonboard.txtbox.domain")
	private WebElement domain;
	
	public WebElement getdomainTxtBox() {
		return domain;
	}
	
	@FindBy(locator = "rd.custonboard.btn.verify")
	private WebElement verify;
	
	public WebElement getverifyBtn() {
		return verify;
	}
	
	@FindBy(locator = "rd.custonboard.poup.custlimitreached")
	private WebElement custlimitreached;
	
	public WebElement custlimitreachedPopUp() {
		return custlimitreached;
	}
	
	@FindBy(locator = "rd.custonboard.popup.closebtn")
	private WebElement closebtn;
	
	public WebElement getPopupCloseBtn() {
		return closebtn;
	}
	
	@FindBy(locator = "rd.custonboard.bam.icon.approve")
	private WebElement approveIcon;
	
	public WebElement getbamapproveIcon() {
		return approveIcon;
	}
	
	@FindBy(locator = "rd.custonboard.bam.txtbox.comment")
	private WebElement comment;
	
	public WebElement getbamCommentTxtBox() {
		return comment;
	}
	
	@FindBy(locator = "rd.custonboard.bam.btn.update")
	private WebElement updateBtn;
	
	public WebElement getBamupdateBtn() {
		return updateBtn;
	}
	
	@FindBy(locator = "rd.custonboard.pm.txt.status")
	private WebElement statusTxt;
	
	public WebElement getCustStatusTxt() {
		return statusTxt;
	}
	
	@FindBy(locator = "rd.custonboard.pm.txtbox.search")
	private WebElement searchTxtBox;
	
	public WebElement getsearchTxtBox() {
		return searchTxtBox;
	}
	
	@FindBy(locator = "rd.custonboard.pm.btn.search")
	private WebElement pmsearchBtn;
	
	public WebElement getpmsearchBtn() {
		return pmsearchBtn;
	}
	
	@FindBy(locator = "rd.custonboard.option.customerCredit")
	private WebElement custCreditOption;
	
	public WebElement getcustCreditOption() {
		return custCreditOption;
	}
	
	@FindBy(locator = "rd.pm.custcredit.btn.search")
	private WebElement pmCustCreditSearchBtn;
	
	public WebElement getpmCustCreditSearchBtn() {
		return pmCustCreditSearchBtn;
	}
	
	OrgCreateAndApproveImpl oca = new OrgCreateAndApproveImpl();
	WrapperFunctions wf = new WrapperFunctions();
	WebDriver driver=TestBaseProvider.getTestBase().getDriver();
	TestBase testBase = TestBaseProvider.getTestBase();
	@Override
	protected void openPage() {
		// TODO Auto-generated method stub
		
	}

	
	public void goToCustomerPage() {
		wf.click_element(oca.getUserMenu());
		wf.click_element(oca.getAccountMgtMenu());
		wf.click_element(getcustomerOption());
	}


	
	public String createCustomer() {
		PauseUtil.pause(3000);
		wf.click_element(oca.getOrgAddBtn());
		PauseUtil.pause(3000);
		
		String name = RUtils.generateName();
		getdomainTxtBox().sendKeys(name);
		wf.click_element(getverifyBtn());
		RUtils.waitforloadingtodissappear();
		String domainName = "www."+name+".com";
		getCompanynameTxtBox().sendKeys(domainName);
		getfirstNameTxtBox().sendKeys(name);
		getlastNameTxtBox().sendKeys(testBase.getTestData().getString("lname"));
		getAddress1TxtBox().sendKeys(testBase.getTestData().getString("orgAdd1"));
		getAddress2TxtBox().sendKeys(testBase.getTestData().getString("orgAdd2"));
		getAddress3TxtBox().sendKeys(testBase.getTestData().getString("orgAdd3"));
		getCityTxtBox().sendKeys(testBase.getTestData().getString("city"));
		SCHUtils.selectOptionByVisibleText(getorganizationSelectBox(), testBase.getTestData().getString("orgname"));
		getpincodeTxtBox().sendKeys(testBase.getTestData().getString("postalCode"));
		SCHUtils.selectOptionByvalue(getcountrySelectBox(), testBase.getTestData().getString("country"));
		String number = null;
		getphoneTxtBox().sendKeys(RandomDataUtil.getPhoneNumber(number));
		getmobileTxtBox().sendKeys(RandomDataUtil.getPhoneNumber(number));
		getemailTxtBox().sendKeys(testBase.getString("userPM"));
		wf.click_element(getmanagmentTypeTxtBox());
		getspendLimitTxtBox().sendKeys(testBase.getTestData().getString("custCredit"));
		getdepartmentTxtBox().sendKeys(testBase.getTestData().getString("department"));
		getfunctionTxtBox().sendKeys(testBase.getTestData().getString("function"));
		wf.click_element(getpaymentRadioBtn());
		wf.click_element(getiagreeCheckBox());
		wf.click_element( getsubmitBtn());
		RUtils.waitforloadingtodissappear();
		try {
			boolean customerstatus = custlimitreachedPopUp().getText().contains(RConstantUtils.CUSTOMER_CREATED_SUCCESSFULLY);
	        Assert.assertTrue("Customer not created successfully.",customerstatus);
        
		}catch(Exception e) {
			e.printStackTrace();
			boolean customerLimit = custlimitreachedPopUp().getText().contains(RConstantUtils.CUSTOMER_LIMIT_REACHED);
	        Assert.assertFalse("Customer max limit reached.",customerLimit);
		}
		wf.click_element(getPopupCloseBtn());
		PauseUtil.pause(10000);
		return domainName;
	}





	
	public void bamApproveCustomer(String domainName, String status) {
		PauseUtil.pause(3000);
		wf.click_element(oca.getbamUserMenu());
		wf.click_element(oca.getAccountMgtMenu());
		wf.click_element(getcustomerOption());
		RUtils.waitforloadingtodissappear();
		oca.getbamSearchTxtBox().sendKeys(domainName);
		wf.click_element(oca.getbamSearchBtn());
		RUtils.waitforloadingtodissappear();
		wf.click_element(getbamapproveIcon());
		
		switch (status) {
			case "Approve":
				PauseUtil.pause(3000);
				SCHUtils.selectOptionByVisibleText(oca.getstatusSelectBox(), testBase.getTestData().getString("approveStatus"));
				getbamCommentTxtBox().sendKeys(testBase.getTestData().getString("approveStatus"));
				wf.click_element(getBamupdateBtn());
				RUtils.waitforloadingtodissappear();
				boolean statusApp = getCustStatusTxt().getText().contains("APPROVED");
				Assert.assertTrue("BAM Approval failed for Customer Scenario.",statusApp);
				break;
			case "Reject":
				PauseUtil.pause(3000);
				SCHUtils.selectOptionByVisibleText(oca.getstatusSelectBox(), testBase.getTestData().getString("rejecteStatus"));
				getbamCommentTxtBox().sendKeys(testBase.getTestData().getString("rejecteStatus"));
				wf.click_element(getBamupdateBtn());
				RUtils.waitforloadingtodissappear();
				statusApp = getCustStatusTxt().getText().contains("REJECTED");
				Assert.assertTrue("BAM Rejection failed for Customer Scenario.",statusApp);
				break;
		}
	}


	
	public void customerStatus(String domainName, String status) {
		RUtils.waitforloadingtodissappear();
		getsearchTxtBox().sendKeys(domainName);
		wf.click_element(getpmsearchBtn());
		RUtils.waitforloadingtodissappear();

		switch (status) {
		case "Approve":
			boolean statusApp = getCustStatusTxt().getText().contains("APPROVED");
			Assert.assertTrue("PM Verification scenario failed for Customer Approval",statusApp);
			break;
		case "Reject":
			statusApp = getCustStatusTxt().getText().contains("REJECTED");
			Assert.assertTrue("PM Verification scenario failed for Customer Rejection",statusApp);
			break;
		}
	}


	
	public void updateCustSpendLimit(String domainName) {
		wf.click_element(oca.getUserMenu());
		wf.click_element(oca.getAccountMgtMenu());
		wf.click_element(getcustCreditOption());
		PauseUtil.pause(3000);
		getsearchTxtBox().sendKeys(domainName);
	}

}
