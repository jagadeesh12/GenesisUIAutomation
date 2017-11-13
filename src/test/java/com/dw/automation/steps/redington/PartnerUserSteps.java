package com.dw.automation.steps.redington;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static com.dw.automation.pages.base.PageFactory.getFactory;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.dw.automation.pages.BasePage;
import com.dw.automation.pages.ICartPage;
import com.dw.automation.pages.ICheckoutPage;
import com.dw.automation.pages.ILoginPage;
import com.dw.automation.pages.IStudentFlyerOrdersPage;
import com.dw.automation.pages.PartnerUserPage;
import com.dw.automation.pages.RLoginPage;
import com.dw.automation.support.PauseUtil;

import cucumber.api.java.en.Given;

public class PartnerUserSteps {
	


    public String email;
    public String verificationCode;
    public String resetPassword;
    
    PartnerUserPage pup = getFactory().getPartnerUserPage();

	
    @Given("^I launch the application as a site admin\\[UserInformation\\]$")
    public void i_launch_the_application_as_a_site_adminuserinformation() throws Throwable {
		System.out.println("Login started steps");

        //PartnerUserPage pup = getFactory().getPartnerUserPage();
        pup.loginApplication();
        PauseUtil.waitForAjaxToComplete(4000);

    }

    @When("^I fill partner user form$")
    public void i_fill_partner_user_form() throws Throwable {
       // PartnerUserPage pup = getFactory().getPartnerUserPage();
        email = pup.fillPartnerUserForm();
        System.out.println("Registering with following EmailID :"+email);

    }
    

    @Then("^Temporary password is generated$")
    public void temporary_password_is_generated() throws Throwable {
        //PartnerUserPage pup = getFactory().getPartnerUserPage();

    }

    @Given("^I launch the mail application$")
    public void i_launch_the_mail_application() throws Throwable {
    	pup.launchMailApplication();
    }

    @Then("^I get the verification code$")
    public void i_get_the_verification_code() throws Throwable {
        verificationCode = pup.gettingVerificationCode(email);
        System.out.println("Verification code:"+verificationCode);
    }
    

    @Given("^I launch the application$")
    public void i_launch_the_application() throws Throwable {
    	pup.launchApplication();
    }

    @Then("^I login with new username and temporary password$")
    public void i_login_with_new_username_and_temporary_password() throws Throwable {
    	System.out.println("Login with Temp password===============");
    	pup.loginUserCredentials(email,verificationCode);
    }

    @Then("^I reset the password$")
    public void i_reset_the_password() throws Throwable {
    	System.out.println("I reset the password method===============");

    	resetPassword = pup.resetPassword(verificationCode);
    }

    @Then("^I login with new username and reset password$")
    public void i_login_with_new_username_and_reset_password() throws Throwable {
    	email = "pmfn_11112341@mailinator.com";
    	resetPassword = "Pass@123";
    	pup.loginUserCredentials(email,resetPassword);
    }

    @Then("^I view the partner user detail$")
    public void i_view_the_partner_user_detail() throws Throwable {
    	pup.viewUserDetails(email);
    }

}
