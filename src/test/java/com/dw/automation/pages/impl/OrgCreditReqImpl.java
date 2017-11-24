package com.dw.automation.pages.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dw.automation.pages.OrgCreditReqPage;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.cucumber.uploadResults.WrapperFunctions;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBase;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;

import junit.framework.Assert;

public class OrgCreditReqImpl extends BaseTestPage<TestPage> implements OrgCreditReqPage {

	@FindBy(locator = "rd.pm.orgCreditReqPage.option.orgcreditreq")
	private WebElement orgCreditReqOption;
	
	public WebElement getorgCreditReqOption() {
		return orgCreditReqOption;
	}
	
	@FindBy(locator = "rd.pm.orgCreditReqPage.icon.credit")
	private WebElement creditIcon;
	
	public WebElement getcreditIcon() {
		return creditIcon;
	}
	
	@FindBy(locator = "rd.pm.orgCreditReqPage.txtBox.credit")
	private WebElement creditTxtBox;
	
	public WebElement getcreditTxtBox() {
		return creditTxtBox;
	}
	
	@FindBy(locator = "rd.pm.orgCreditPage.txtBox.comment")
	private WebElement commentTxtBox;
	
	public WebElement getcommentTxtBox() {
		return commentTxtBox;
	}
	
	@FindBy(locator = "rd.pm.orgCreditPage.btn.update")
	private WebElement updateBtn;
	
	public WebElement getupdateBtn() {
		return updateBtn;
	}
	
	@FindBy(locator = "rd.ca.orgCreditPage.txtBox.comment")
	private WebElement commentCATxtBox;
	
	public WebElement getcommentCATxtBox() {
		return commentCATxtBox;
	}
	
	@FindBy(locator = "rd.ca.orgCreditPage.txt.status")
	private WebElement CAcreditstatus;
	
	public WebElement getCAcreditstatusTxt() {
		return CAcreditstatus;
	}
	
	@FindBy(locator = "rd.ca.orgCreditPage.drpdwn.status")
	private WebElement selectStatusDrpDwn;
	
	public WebElement getCAselectStatusDrpDwn() {
		return selectStatusDrpDwn;
	}
	
	@FindBy(locator = "rd.ca.orgCreditPage.btn.update")
	private WebElement creditUpdatebtn;
	
	public WebElement getCAcreditUpdatebtn() {
		return creditUpdatebtn;
	}
	
	@FindBy(locator = "rd.ca.orgCreditPage.icon.credit")
	private WebElement cacreditIcon;
	
	public WebElement getcacreditIcon() {
		return cacreditIcon;
	}
	
	@FindBy(locator = "rd.pm.orgCreditPage.txt.status")
	private WebElement CreditRequestStatus;
	
	public WebElement getCreditRequestStatusTxt() {
		return CreditRequestStatus;
	}
	
	OrgCreateAndApproveImpl oca = new OrgCreateAndApproveImpl();
	WrapperFunctions wf = new WrapperFunctions();
	WebDriver driver=TestBaseProvider.getTestBase().getDriver();
	TestBase testBase = TestBaseProvider.getTestBase();

	@Override
	protected void openPage() {
		// TODO Auto-generated method stub
		
	}

	
	public void applyForCredit(String domainName) {
		PauseUtil.pause(3000);
		wf.click_element(oca.getUserMenu());
		wf.click_element(oca.getUserMenu());
		wf.click_element(oca.getAccountMgtMenu());
		wf.click_element(getorgCreditReqOption());
		oca.getbamSearchTxtBox().sendKeys(domainName);
		wf.click_element(oca.getsearchBtnPm());
		PauseUtil.pause(3000);
		wf.click_element(getcreditIcon());
		PauseUtil.pause(3000);
		String credit = getcreditTxtBox().getAttribute("value");
		System.out.println("Credit :"+credit);
		credit = credit.split("\\.",2)[0];
		credit = credit + "0";
		getcreditTxtBox().clear();
		getcreditTxtBox().sendKeys(credit);
		//getcreditTxtBox().sendKeys(testBase.getTestData().getString("creditPMreq"));
		getcommentTxtBox().sendKeys(testBase.getTestData().getString("commentCredit"));
		wf.click_element(getupdateBtn());
		PauseUtil.pause(3000);
	}


	
	public void creditRequest(String domainName,String status) {
		wf.click_element(oca.getbamUserMenu());
		wf.click_element(oca.getAccountMgtMenu());
		wf.click_element(getorgCreditReqOption());
		PauseUtil.pause(3000);
		oca.getbamSearchTxtBox().sendKeys(domainName);
		wf.click_element(oca.getbamSearchBtn());
		PauseUtil.pause(3000);
		wf.click_element(getcacreditIcon());
		
		switch (status) {
			case "Approve":
				PauseUtil.pause(3000);
				SCHUtils.selectOptionByVisibleText(getCAselectStatusDrpDwn(), testBase.getTestData().getString("approveStatus"));
				getcommentCATxtBox().sendKeys(testBase.getTestData().getString("approveStatus"));
				wf.click_element(getCAcreditUpdatebtn());
				PauseUtil.pause(2000);
				boolean statusApp = getCAcreditstatusTxt().getText().contains("APPROVED");
				Assert.assertTrue("Organization credit approval scenario failed by CA.",statusApp);
				break;
			
			case "Reject":
				PauseUtil.pause(3000);
				SCHUtils.selectOptionByVisibleText(getCAselectStatusDrpDwn(), testBase.getTestData().getString("rejecteStatus"));
				getcommentCATxtBox().sendKeys(testBase.getTestData().getString("rejecteStatus"));
				wf.click_element(getCAcreditUpdatebtn());
				PauseUtil.pause(2000);
				statusApp = getCAcreditstatusTxt().getText().contains("REJECTED");
				Assert.assertTrue("Organization credit reject scenario failed by CA.",statusApp);
				break;	
		}
		
	}


	
	public void verifyCreditReqStatus(String domainName, String status) {
		PauseUtil.pause(3000);
		wf.click_element(oca.getUserMenu());
		wf.click_element(oca.getAccountMgtMenu());
		wf.click_element(getorgCreditReqOption());
		oca.getbamSearchTxtBox().sendKeys(domainName);
		wf.click_element(oca.getsearchBtnPm());
		PauseUtil.pause(3000);
		
		switch (status) {
		case "Approve":
			boolean statusApp = getCreditRequestStatusTxt().getText().contains("APPROVED");
			Assert.assertTrue("PM Verification scenario failed for Customer Approval",statusApp);
			break;
		case "Reject":
			statusApp = getCreditRequestStatusTxt().getText().contains("REJECTED");
			Assert.assertTrue("PM Verification scenario failed for Customer Approval",statusApp);
			break;	
		}
		
	}

}
