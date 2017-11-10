package com.dw.automation.steps.redington;

import static com.dw.automation.pages.base.PageFactory.getFactory;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.dw.automation.pages.BasePage;
import com.dw.automation.pages.ICartPage;
import com.dw.automation.pages.ICheckoutPage;
import com.dw.automation.pages.ILoginPage;
import com.dw.automation.pages.IStudentFlyerOrdersPage;
import com.dw.automation.pages.RLoginPage;
import com.dw.automation.support.PauseUtil;

import cucumber.api.java.en.Given;


public class LoginSteps {
//	@Given("^login to redington$")
//	public void login_to_redington() throws Throwable {
//		System.out.println("Starting Login function ==================================");
//		RLoginPage hp = getFactory().getRLoginPage();
//		hp.launchApplication();
//
//		
//        PauseUtil.waitForAjaxToComplete(4000);
//	}
	
    @Given("^login to redington\\[UserInformation\\]$")
    public void login_to_redingtonuserinformation() throws Throwable {
		System.out.println("Starting Login function ==================================");
		RLoginPage hp = getFactory().getRLoginPage();
		hp.launchApplication();

		
        PauseUtil.waitForAjaxToComplete(4000);
    }
}
