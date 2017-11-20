package com.dw.automation.pages.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.dw.automation.pages.PartnerUserPage;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.RUtils;
import com.dw.automation.support.SCHUtils;
import com.scholastic.cucumber.uploadResults.WrapperFunctions;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBase;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;

public class PartnerUserPageImpl extends BaseTestPage<TestPage> implements PartnerUserPage{
	
	private static final String WrapperFunction = null;

	@FindBy(locator = "rd.sa.homepage.addbtn")
	private WebElement addbtn;
	
	@FindBy(locator = "rd.sa.addpartner.form.txtbox.firstname")
	private WebElement firstname;
	
	@FindBy(locator = "rd.sa.addpartner.form.txtbox.lastname")
	private WebElement lastname;
	
	@FindBy(locator = "rd.sa.addpartner.form.txtbox.department")
	private WebElement department;
	
	@FindBy(locator = "rd.sa.addpartner.form.txtbox.function")
	private WebElement function;
	
	@FindBy(locator = "rd.sa.addpartner.form.txtbox.mobile")
	private WebElement mobile;
	
	@FindBy(locator = "rd.sa.addpartner.form.txtbox.telephone")
	private WebElement telephone;
	
	@FindBy(locator = "rd.sa.addpartner.form.txtbox.fax")
	private WebElement fax;
	
	@FindBy(locator = "rd.sa.addpartner.form.txtbox.email")
	private WebElement email;
	
	@FindBy(locator = "rd.sa.addpartner.form.selectbox.selectrole")
	private WebElement selectrole;
	
	@FindBy(locator = "rd.sa.addpartner.form.selectbox.selectcountry")
	private WebElement selectcountry;
	
	@FindBy(locator = "rd.sa.addpartner.form.selectbox.selectstatus")
	private WebElement selectstatus;
	
	@FindBy(locator = "rd.sa.addpartner.form.btn.submit")
	private WebElement formSubmitbtn;
	
	@FindBy(locator = "rd.login.signin.username")
	private WebElement usernam;
	
	@FindBy(locator = "rd.login.signin.password")
	private WebElement pass;
	
	@FindBy(locator = "rd.login.signin.captcha.image")
	private WebElement captchImage;
	
	@FindBy(locator = "rd.login.signin.captcha.txtbox")
	private WebElement captchTxtBox;
	
	
	@FindBy(locator = "rd.login.signin.signinbtn")
	private WebElement signinBtn;
	
	@FindBy(locator  = "mailinator.homepage.txtbox.eamil")
	private WebElement mailinatorEmaiTxtBox;
	
	
	@FindBy(locator = "mailinator.homepage.btn.submit")
	private WebElement mailinatorSubmitBtn;
	
	@FindBy(locator = "mailinator.homepage.mail")
	private WebElement mailinatorMail;
	
	@FindBy(locator = "mailinator.homepage.msg")
	private WebElement mailinatorMsg;
			
//	@FindBy(locator = "mailinator.homepage.frame.msgbody")
//	private WebElement mailinatorMsgFrame;
	
	@FindBy(locator = "mailinator.homepage.txt.verificationcode")
	private WebElement mailinatorVerificationCode;
	
	@FindBy(locator = "rd.user.passreset.form.txtbox.oldPassword")
	private WebElement userOldPasswordTxtBox;
	
	@FindBy(locator = "rd.user.passreset.form.txtbox.newPassword")
	private WebElement userNewPasswordTxtBox;
	
	@FindBy(locator = "rd.user.passreset.form.txtbox.confirmNewPassword")
	private WebElement userConfirmPasswordTxtBox;
	
	@FindBy(locator = "rd.user.passreset.form.btn.submit")
	private WebElement userPassResetSubmitBtn;
	
	@FindBy(locator = "rd.application.loading.image")
	private WebElement loadingImg;
	
	
	@FindBy(locator = "rd.sa.homepage.drpdwn.siteadmin")
	private WebElement siteAdminDrpDwn;
	
	@FindBy(locator = "rd.sa.homepage.option.accountmgt")
	private WebElement accountmgtOption;
	
	
	@FindBy(locator = "rd.sa.homepage.option.user")
	private WebElement userOption;
	
	@FindBy(locator = "rd.sa.userpage.txtbox.search")
	private WebElement searchTxtBox;
	
	
	@FindBy(locator = "rd.sa.userpage.btn.search")
	private WebElement searchBtn;
	
	@FindBy(locator = "rd.sa.userpage.icon.userinfo")
	private WebElement userinfoIcon;
	
	@FindBy(locator = "rd.user.homepage.popup.addorgnization")
	private WebElement popUpCloseBtn;
	
	@FindBy(locator = "rd.user.userdetailspage.text.name")
	private WebElement getUserNameTxt;
	
	public WebElement getgetUserNameTxt() {
		return getUserNameTxt;
	}
	
	public WebElement getpopUpCloseBtn() {
		return popUpCloseBtn;
	}
	
	public WebElement getsiteAdminDrpDwn() {
		return siteAdminDrpDwn;
	}	
	
	public WebElement getAccountmgtOption() {
		return accountmgtOption;
	}	
	
	public WebElement getuserOption() {
		return userOption;
	}	
	
	public WebElement getsearchTxtBox() {
		return searchTxtBox;
	}	
	
	
	public WebElement getsearchBtn() {
		return searchBtn;
	}	
	
	public WebElement getuserinfoIcon() {
		return userinfoIcon;
	}	
			
	public WebElement getuserOldPasswordTxtBox() {
		return userOldPasswordTxtBox;
	}		
	
	public WebElement getuserNewPasswordTxtBox() {
		return userNewPasswordTxtBox;
	}	
	
	public WebElement getuserConfirmPasswordTxtBox() {
		return userConfirmPasswordTxtBox;
	}	
	
	public WebElement getuserPassResetSubmitBtn() {
		return userPassResetSubmitBtn;
	}	
	
	public WebElement getAdd() {
		return addbtn;
	}
	
	public WebElement getUsername(){
		return usernam;
	}
	
	public WebElement getPassword(){
		return pass;
	}

	public WebElement getCaptchaImage(){
		return captchImage;
	}
	
	public WebElement getCaptchaTxtBox(){
		return captchTxtBox;
	}
	
	public WebElement getSignInBtn(){
		return signinBtn;
	}
	
	public WebElement getFirstNameTxtBox(){
		return firstname;
	}
	
	public WebElement getLastNameTxtBox(){
		return lastname;
	}
	
	public WebElement getDepartmentTxtBox(){
		return department;
	}
	
	public WebElement getFunctionTxtBox(){
		return function;
	}
	
	public WebElement getMobileTxtBox(){
		return mobile;
	}
	
	public WebElement getTelephoneTxtBox(){
		return telephone;
	}
	
	public WebElement getFaxTxtBox(){
		return fax;
	}
	
	
	public WebElement getFormSignInBtn(){
		return formSubmitbtn;
	}
	
	public WebElement getSelectRole(){
		return selectrole;
	}
	
	public WebElement getSelectCountry(){
		return selectcountry;
	}
	
	public WebElement getEmailTxtBox(){
		return email;
	}
	
	public WebElement getMailinatorEmailTxtBox(){
		return mailinatorEmaiTxtBox;
	}
	
	public WebElement getMailinatorVerificatonCode(){
		return mailinatorVerificationCode;
	}
	
//	public WebElement getMailinatorMsgFrame(){
//		return mailinatorMsgFrame;
//	}
	
	public WebElement getMailinatorMsg(){
		return mailinatorMsg;
	}
	
	public WebElement getMailinatorMail(){
		return mailinatorMail;
	}
	
	public WebElement getMailinatorSubmitBtn(){
		return mailinatorSubmitBtn;
	}

	public WebElement getloadinImg(){
		return loadingImg;
	}
	
	WrapperFunctions wf = new WrapperFunctions();
	WebDriver driver=TestBaseProvider.getTestBase().getDriver();
	TestBase testBase = TestBaseProvider.getTestBase();


	
	public void loginApplication() {
		try {
	//	String username = TestBaseProvider.getTestBase().getTestData().getString("userid");
	//	String password = TestBaseProvider.getTestBase().getTestData().getString("password");
		String username = testBase.getString("userSA");
		String password = testBase.getString("passSA");
		login(username,password);
		}catch(Exception ex) {
			System.out.println("Failed login :"+ex);
		}
		
		
	}

	@Override
	protected void openPage() {
		// TODO Auto-generated method stub
			
	}
	
	public  void login(String username,String password) {
		System.out.println("Login started===========================================");
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		captureCaptcha();
		getSignInBtn().click();
	}

	public void captureCaptcha() {
		String captchaValue = getCaptchaImage().getText();  //this will read the captcha
        System.out.println(captchaValue);
        getCaptchaTxtBox().sendKeys(captchaValue);
		
	}

	
	public String fillPartnerUserForm() {
		
		wf.click_element(addbtn);
		String name = generateName();
		String emailID = name + "@mailinator.com";
		firstname.sendKeys(name);
		lastname.sendKeys("Test");
		department.sendKeys(TestBaseProvider.getTestBase().getTestData().getString("department"));
		function.sendKeys(TestBaseProvider.getTestBase().getTestData().getString("function"));
		mobile.sendKeys(TestBaseProvider.getTestBase().getTestData().getString("mobile"));
		telephone.sendKeys(TestBaseProvider.getTestBase().getTestData().getString("tele"));
		fax.sendKeys(TestBaseProvider.getTestBase().getTestData().getString("fax"));
		email.sendKeys(emailID);
		SCHUtils.selectOptionByvalue(selectrole, TestBaseProvider.getTestBase().getTestData().getString("role"));
        SCHUtils.selectOptionByvalue(selectcountry,TestBaseProvider.getTestBase().getTestData().getString("country"));
        SCHUtils.selectOptionByvalue(selectstatus, TestBaseProvider.getTestBase().getTestData().getString("status"));
        wf.click_element(formSubmitbtn);
        //AssertUtils.assertTextMatches(getLblErrorMessage(), Matchers.containsString(ConstantUtils.ERRMSGSTACKABLENONSTACKABLE
		
		return emailID;
	}
	
	public String generateName() {
        DateFormat dateFormat = new SimpleDateFormat("ddMMHHmm");
        Date date = new Date();
        String name = dateFormat.format(date);
        
        String firstName = "PMFN_"+name;
        System.out.println("FirstName :"+firstName);
        return firstName;

	}
	

	public String fillFMUserForm() {
		wf.click_element(addbtn);
		String name = RUtils.generateSpecificName("FM");
		String emailID = name + "@mailinator.com";
		firstname.sendKeys(name);
		lastname.sendKeys("FMLN");
		department.sendKeys(TestBaseProvider.getTestBase().getTestData().getString("department"));
		function.sendKeys(TestBaseProvider.getTestBase().getTestData().getString("function"));
		SCHUtils.selectOptionByvalue(selectcountry,TestBaseProvider.getTestBase().getTestData().getString("country"));
		mobile.sendKeys(TestBaseProvider.getTestBase().getTestData().getString("mobile"));
		telephone.sendKeys(TestBaseProvider.getTestBase().getTestData().getString("tele"));
		fax.sendKeys(TestBaseProvider.getTestBase().getTestData().getString("fax"));
		email.sendKeys(emailID);
		SCHUtils.selectOptionByvalue(selectrole, TestBaseProvider.getTestBase().getTestData().getString("fmrole"));
        SCHUtils.selectOptionByvalue(selectstatus, TestBaseProvider.getTestBase().getTestData().getString("status"));
        PauseUtil.pause(2000);
        wf.click_element(formSubmitbtn);
      
        System.out.println("======Email id created for FM ======" +emailID);
        
        
		return emailID;
				
	}
	


	
	public String gettingVerificationCode(String email) {

		SCHUtils.waitForElementToBeDisplayed(mailinatorEmaiTxtBox, 10000);
		System.out.println("==========Entering below email id in mailinator" +email);
		mailinatorEmaiTxtBox.sendKeys(email);
		wf.click_element(mailinatorSubmitBtn);
		wf.click_element(mailinatorMail);
		wf.click_element(mailinatorMsg);
		driver.switchTo().frame("msg_body");
		String ver = getMailinatorVerificatonCode().getText();
		System.out.println("Verification Code :"+ ver);
		return ver;
	}

	public void launchMailApplication() {
		testBase.getDriver().get(testBase.getString("MailinatorURL"));
		
	}

	
	public String loginUserCredentials(String email, String verificationCode) {
		login(email,verificationCode);
		return null;
	}

	public String resetPassword(String verificationCode) {
		//PauseUtil.waitTillDisappear(loadingImg,80);
		PauseUtil.pause(4000);
		getuserOldPasswordTxtBox().sendKeys(verificationCode);
		String newPassword = TestBaseProvider.getTestBase().getTestData().getString("newPassword");
		getuserNewPasswordTxtBox().sendKeys(newPassword);
		getuserConfirmPasswordTxtBox().sendKeys(newPassword);
		wf.click_element(getuserPassResetSubmitBtn());
		
		return newPassword;
	}

	public void viewUserDetails(String email) {
		System.out.println("User details function is started");
		//PauseUtil.waitTillDisappear(loadingImg,80);
		PauseUtil.pause(4000);
		wf.click_element(getpopUpCloseBtn());
		wf.click_element(getsiteAdminDrpDwn());
		wf.click_element(getAccountmgtOption());
		wf.click_element(getuserOption());
		getsearchTxtBox().sendKeys(email);
		wf.click_element(getsearchBtn());
		PauseUtil.pause(4000);
		wf.click_element(getuserinfoIcon());
		PauseUtil.pause(3000);

		System.out.println(getgetUserNameTxt().getText() + " : " + email );
		Assert.assertEquals(email, getgetUserNameTxt().getText());

		
		

	}

	@Override
	public void launchApplication() {
		testBase.getDriver().get(testBase.getString("url"));		
	}


	


}
