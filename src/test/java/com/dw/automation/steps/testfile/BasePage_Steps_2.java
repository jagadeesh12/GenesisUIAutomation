package com.dw.automation.steps.testfile;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import com.dw.automation.pages.BasePage;
import com.dw.automation.pages.impl.CheckoutPage;
import com.dw.automation.support.PauseUtil;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasePage_Steps_2 {

	// WebDriver driver;
	// BasePage B_page;

	@When("^user click on Home button$")
	public void user_click_on_Home_button() throws Throwable {
		BasePage B_page = getFactory().getBasePage();
		B_page.user_Click_On_Home_button_in_HomePage();
		Thread.sleep(5000);
	}

	/*
	 * @Then("^teacher should see the Home Page$")
	 * public void user_should_see_the_Home_Page() throws Throwable {
	 * BasePage B_page = getFactory().getBasePage();
	 * Thread.sleep(4000);
	 * //PauseUtil.pause(4000);
	 * assertTrue("Home page is not displayed",
	 * B_page.is_header_HomePage_Displayed());
	 * }
	 */

	@Then("^teacher should see the Home Page$")
	public void teacher_should_see_the_home_page() throws Throwable {
		BasePage B_page = getFactory().getBasePage();
		Thread.sleep(4000);
		// PauseUtil.pause(4000);
		assert (B_page.is_header_HomePage_Displayed());
	}

	/*
	 * @When("^teacher logout from the application$")
	 * public void user_logout_from_the_application() throws Throwable {
	 * BasePage B_page = getFactory().getBasePage();
	 * Thread.sleep(2000);
	 * B_page.user_Click_On_MyAccount_in_HomePage();
	 * Thread.sleep(2000);
	 * //PauseUtil.pause(2000);
	 * B_page.user_signOut_from_HomePage();
	 * }
	 */

	@When("^teacher logout from the application$")
	public void teacher_logout_from_the_application() throws Throwable {
		BasePage B_page = getFactory().getBasePage();
		CheckoutPage chkpge = new CheckoutPage();
		Thread.sleep(2000);
		chkpge.Home_Select_dropDown_MyAccount().click();
	    PauseUtil.pause(2000);
		B_page.user_signOut_from_HomePage();
	}

	@Then("^teacher should logout$")
	public void teacher_should_logout() throws Throwable {
		System.out.println("teacher logout");
	}

	/*
	 * @Given("^User enters (.+) and (.+)$")
	 * public void user_enters_and(String mailid, String password) throws
	 * Throwable {
	 * BasePage B_page = getFactory().getBasePage();
	 * B_page.user_enter_username_field(mailid);
	 * B_page.user_enter_password_field(password);
	 * }
	 */

	@When("^User enter into the application$")
	public void user_enter_into_the_application() throws Throwable {
		Thread.sleep(2000);
		BasePage B_page = getFactory().getBasePage();
		B_page.user_click_on_enter_to_login();
		Thread.sleep(10000);
		B_page.user_Click_On_closeButton_PopUp();
	}

}
