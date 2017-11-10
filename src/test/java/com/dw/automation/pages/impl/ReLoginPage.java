package com.dw.automation.pages.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dw.automation.pages.RLoginPage;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;

public class ReLoginPage extends BaseTestPage<TestPage> implements RLoginPage {
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
	
	@Override
	public void launchApplication() {
		System.out.println("Starting test run");
		
		String username = TestBaseProvider.getTestBase().getTestData().getString("userid");
		String password = TestBaseProvider.getTestBase().getTestData().getString("password");
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		captureCaptcha();
		getSignInBtn().click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void openPage() {
		// TODO Auto-generated method stub
		
	}
	
	private void captureCaptcha() {
		String captchaValue = getCaptchaImage().getText();  //this will read the captcha
        System.out.println(captchaValue);
        getCaptchaTxtBox().sendKeys(captchaValue);
		
	}
	
	

}
