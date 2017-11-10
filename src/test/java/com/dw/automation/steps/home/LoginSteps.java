package com.dw.automation.steps.home;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.dw.automation.pages.BasePage;
import com.dw.automation.pages.ICartPage;
import com.dw.automation.pages.ICheckoutPage;
import com.dw.automation.pages.ILoginPage;
import com.dw.automation.pages.IStudentFlyerOrdersPage;
import com.dw.automation.pages.impl.CheckoutPage;
import com.dw.automation.pages.impl.LoginPage;
import com.dw.automation.pages.impl.PCOD_HomePage;
import com.dw.automation.pages.impl.PCOD_LoginPage;
import com.dw.automation.pages.impl.TeachersHomePage;
import com.dw.automation.sections.IHeaderSection;
import com.dw.automation.sections.base.SectionFactory;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.LocatorUtils;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.cucumber.ScenarioHook;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	PCOD_LoginPage pcod_logpage = new PCOD_LoginPage();
	LoginPage loginpage = new LoginPage();

	@Given("^teacher open rco-scholastic web site$")
	public void user_open_rco_scholastic_web_site() {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.launchPage();
		TeachersHomePage teacherhomepage = new TeachersHomePage();
		
        PauseUtil.waitForAjaxToComplete(4000);
		
		if(teacherhomepage.chkTutorial_CloseIcon().size()!=0){
        	SCHUtils.clickUsingJavaScript(teacherhomepage.getTutorial_CloseIcon());
        	PauseUtil.pause(3000);
        }	
		
	}
	
	@When("^teacher navigates to the Canada Reading Clubs site$")
    public void teacher_navigates_to_the_canada_reading_clubs_site() throws Throwable {
		System.out.println("Teacher navigates to Canada Reading Clubs site");
    }
	
	@Given("^Parent opens scholastic reading clubs e\\-commerce site$")
    public void Parent_opens_scholastic_reading_clubs_ecommerce_site() throws Throwable {
			ILoginPage homePage = getFactory().getILoginPage();
			homePage.launchPage();
			TeachersHomePage teacherhomepage = new TeachersHomePage();
			
	        PauseUtil.waitForAjaxToComplete(4000);
			
			if(teacherhomepage.chkTutorial_CloseIcon().size()!=0){
	        	SCHUtils.clickUsingJavaScript(teacherhomepage.getTutorial_CloseIcon());
	        	PauseUtil.pause(3000);
	        }	
    }
	
	@Given("^parent opens scholastic reading clubs e\\-commerce site$")
    public void parent_opens_scholastic_reading_clubs_ecommerce_site() throws Throwable {
		WebDriver driver=TestBaseProvider.getTestBase().getDriver();
		driver.get(TestBaseProvider.getTestBase().getTestData().getString("pcod_url"));
		PauseUtil.pause(3000);
    }
	
	@Given("^CSR opens the rco-scholastic web site$")
    public void csr_opens_the_rcoscholastic_web_site() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		//homePage.launchPage();
		homePage.CSR_launchPage();
		/*TeachersHomePage teacherhomepage = new TeachersHomePage();
		
        PauseUtil.waitForAjaxToComplete(4000);
		
		if(teacherhomepage.chkTutorial_CloseIcon().size()!=0){
        	SCHUtils.clickUsingJavaScript(teacherhomepage.getTutorial_CloseIcon());
        	PauseUtil.pause(3000);
		}*/	
    }

    @Given("^teacher open BM$")
    public void teacher_open_BM() throws Throwable {
        ILoginPage homePage = getFactory().getILoginPage();
        homePage.BM_launchPage();


    }
	

	@Given("^teacher navigates to RCO CA site through a marketing URL$")
    public void teacher_navigates_to_rco_ca_site_through_a_marketing_url() throws Throwable {
		LoginPage loginpage = new LoginPage();
		loginpage.getlnkhomepagemarketingurl().click();
    }
	
	@Given("^teacher navigates to PDP Marketing link$")
    public void teacher_navigates_to_pdp_marketing_link() throws Throwable {
		
		WebDriver driver=TestBaseProvider.getTestBase().getDriver();
		driver.get(TestBaseProvider.getTestBase().getTestData().getString("url"));
		PauseUtil.pause(3000);
    }
	
	@Given("^teacher navigates to Reading Club Online login page by entering the URL$")
    public void teacher_navigates_to_reading_club_online_login_page_by_entering_the_url() throws Throwable {
		/*WebDriver driver=TestBaseProvider.getTestBase().getDriver();
		driver.get(TestBaseProvider.getTestBase().getTestData().getString("url"));
		PauseUtil.pause(3000);*/
		System.out.println("teacher have entered login page");
    }
	
	
	
	@Given("^teacher navigates to Category Marketing link$")
    public void teacher_navigates_to_category_marketing_link() throws Throwable {
		WebDriver driver=TestBaseProvider.getTestBase().getDriver();
		driver.get(TestBaseProvider.getTestBase().getTestData().getString("url"));
		PauseUtil.pause(3000);
    }
	
	
	@Given("^teacher navigates to Content Marketing link$")
    public void teacher_navigates_to_content_marketing_link() throws Throwable {
		WebDriver driver=TestBaseProvider.getTestBase().getDriver();
		driver.get(TestBaseProvider.getTestBase().getTestData().getString("url"));
		PauseUtil.pause(3000);
    }
	
	
	@Given("^teacher clicks on Activate Your Account in home page$")
    public void teacher_clicks_on_activate_your_account_in_home_page() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.click_ActivateYourAccountBtn();
    }
	
	
	

    @When("^teacher enters international account number and clicks on Next$")
    public void teacher_enters_international_account_number_and_clicks_on_next() throws Throwable {
    	ILoginPage homePage = getFactory().getILoginPage();
		homePage.enterActivateAccount_clickNext(TestBaseProvider.getTestBase().getTestData().getString("internationalactnumber"));
    }
	

	/*@Given("^teacher login into the application by providing \\[UserInformation\\]$")
	public void user_login_into_the_application_by_providing_UserInformation()
			throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		System.out.println("User ID......................"
				+ TestBaseProvider.getTestBase().getTestData().getString("userid"));
		System.out.println("PAssword..................."
				+ TestBaseProvider.getTestBase().getTestData().getString("password"));
		homePage.doLogin(TestBaseProvider.getTestBase().getTestData().getString("userid"),
				         TestBaseProvider.getTestBase().getTestData().getString("password"),
				false);
	}*/
	
	
	
	@Given("^teacher enters \\[UserInformation\\] associated with a school belonging to a non\\-Canadian zip code$")
    public void teacher_enters_userinformation_associated_with_a_school_belonging_to_a_noncanadian_zip_code() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.closeButton_in_LoginPage();
		System.out.println("User ID......................"
				+ TestBaseProvider.getTestBase().getTestData().getString("userid"));
		System.out.println("PAssword..................."
				+ TestBaseProvider.getTestBase().getTestData().getString("password"));
		homePage.doLogin_credentials_Input(TestBaseProvider.getTestBase().getTestData().getString("userid"),
				         TestBaseProvider.getTestBase().getTestData().getString("password"),
							false);
    }
	
	
	
	@When("^teacher clicks on login button$")
    public void teacher_clicks_on_login_button() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.doLogin_LoginBtn();
    }
	
	
	
	@Then("^error tool tip displays with title “International Account” and message “We’re sorry, the account number you entered is not eligible to shop from Reading Club Online\\.Please contact Customer Service at 1\\-800\\-268\\-3860 to place your order\\.” displays$")
    public void error_tool_tip_displays_with_title_international_account_and_message_were_sorry_the_account_number_you_entered_is_not_eligible_to_shop_from_reading_club_onlineplease_contact_customer_service_at_18002683860_to_place_your_order_displays() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.International_User_ErrorMsg_Check();
    }
	
	
	@Then("^error modal displays with title “International Account” and message “We’re sorry, the account number you entered is not eligible to shop from Reading Club Online\\.Please contact Customer Service at 1\\-800\\-268\\-3860 to place your order\\.” displays$")
    public void error_modal_displays_with_title_international_account_and_message_were_sorry_the_account_number_you_entered_is_not_eligible_to_shop_from_reading_club_onlineplease_contact_customer_service_at_18002683860_to_place_your_order_displays() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.International_User_ErrorMsg_Check();
    }
	
	
	@Given("^teacher login into the application by providing \\[UserInformation\\]$")
    public void teacher_login_into_the_application_by_providing_userinformation() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		System.out.println("User ID......................"
				+ TestBaseProvider.getTestBase().getTestData().getString("userid"));
		System.out.println("PAssword..................."
				+ TestBaseProvider.getTestBase().getTestData().getString("password"));
		homePage.doLogin(TestBaseProvider.getTestBase().getTestData().getString("userid"),
				         TestBaseProvider.getTestBase().getTestData().getString("password"),
				false);
    }
	
	@Given("^teacher logs into the application by providing \\[UserInformation\\]$")
    public void teacher_logs_into_the_application_by_providing_userinformation() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		//homePage.closeButton_in_LoginPage();			//commented by Siva as it's not coming now
		System.out.println("User ID......................"
				+ TestBaseProvider.getTestBase().getTestData().getString("userid"));
		System.out.println("PAssword..................."
				+ TestBaseProvider.getTestBase().getTestData().getString("password"));
		homePage.doLogin2(TestBaseProvider.getTestBase().getTestData().getString("userid"),
				         TestBaseProvider.getTestBase().getTestData().getString("password"),
				false);
		
    }
	
	@Given("^teacher logs into the application by providing \\[UserInformation\\] and sees the parent site modal$")
    public void teacher_logs_into_the_application_by_providing_userinformation_and_sees_the_parent_site_modal() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		//homePage.closeButton_in_LoginPage();			//commented by Siva as it's not coming now
		System.out.println("User ID......................"
				+ TestBaseProvider.getTestBase().getTestData().getString("userid"));
		System.out.println("PAssword..................."
				+ TestBaseProvider.getTestBase().getTestData().getString("password"));
		homePage.doLogin5(TestBaseProvider.getTestBase().getTestData().getString("userid"),
				         TestBaseProvider.getTestBase().getTestData().getString("password"),
				false);
		
    }
	

	@Given("^teacher(\\d+) logs into the application by providing \\[User Information\\]$")
	public void teacher_logs_into_the_application_by_providing_UserInformation(int arg1) throws Throwable {
		
		ILoginPage homePage = getFactory().getILoginPage();
		
		try{
			homePage.getTCODPCODhomepage().isDisplayed();		
		}catch(Exception e){
			System.out.println("Not on the TCOD homepage. Trying to logout of the TCOD site");
			user_logs_out_from_TCOOL();
		}
		
		// Setting the cumulative SOO total to 0 for each teacher logging in
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.cumulative_SOO_total", 0.0);
		System.out.println("Setting cumulative SOO total to: " + TestBaseProvider.getTestBase().getContext().getProperty("testexecution.cumulative_SOO_total").toString());
		
		//homePage.closeButton_in_LoginPage();			//commented by Siva as it's not coming now
		System.out.println("User ID......................"
				+ TestBaseProvider.getTestBase().getTestData().getString("userid"+arg1));
		System.out.println("PAssword..................."
				+ TestBaseProvider.getTestBase().getTestData().getString("password"+arg1));
		homePage.doLogin3(TestBaseProvider.getTestBase().getTestData().getString("userid"+arg1),
				         TestBaseProvider.getTestBase().getTestData().getString("password"+arg1),
				false);
		System.out.println("Currently on the TCOD homepage");
	}

	@And("^teacher logs in to the application by providing \\[UserInformation\\]$")
    public void teacher_is_navigated_to_review_cart_pageand_teacher_logs_in_to_the_application_by_providing_userinformation() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		//homePage.closeButton_in_LoginPage();			//commented by Siva as it's not coming now
		System.out.println("User ID......................"
				+ TestBaseProvider.getTestBase().getTestData().getString("userid"));
		System.out.println("PAssword..................."
				+ TestBaseProvider.getTestBase().getTestData().getString("password"));
		homePage.doLogin4(TestBaseProvider.getTestBase().getTestData().getString("userid"),
				         TestBaseProvider.getTestBase().getTestData().getString("password"),
				false);
    }
	
	
	@And("^teacher1 logs in to the application by providing \\[UserInformation\\]$")
    public void teacher1_logs_in_to_the_application_by_providing_userinformation() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		System.out.println("User ID......................"
				+ TestBaseProvider.getTestBase().getTestData().getString("userid"));
		System.out.println("PAssword..................."
				+ TestBaseProvider.getTestBase().getTestData().getString("password"));
		homePage.doLogin4(TestBaseProvider.getTestBase().getTestData().getString("userid"),
				         TestBaseProvider.getTestBase().getTestData().getString("password"),
				false);
    }
	
	@And("^teacher2 also logs in to the application by providing \\[UserInformation\\]$")
    public void teacher2_also_logs_in_to_the_application_by_providing_userinformation() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		BasePage B_page = getFactory().getBasePage();
		TeachersHomePage teacherhomepage = new TeachersHomePage();
		PauseUtil.pause(2500);
		CheckoutPage chkpge = new CheckoutPage();
		Thread.sleep(2000);
		if(chkpge.sizeHome_Select_dropDown_MyAccount().size()!=0){
		chkpge.Home_Select_dropDown_MyAccount().click();
	    PauseUtil.pause(2000);
		B_page.user_signOut_from_HomePage();
        PauseUtil.pause(2500);
		}else{
			SCHUtils.clickUsingJavaScript(teacherhomepage.Home_icon_on_header());
			PauseUtil.pause(4000);
			chkpge.Home_Select_dropDown_MyAccount().click();
		    PauseUtil.pause(2000);
			B_page.user_signOut_from_HomePage();
	        PauseUtil.pause(2500);
		}
		System.out.println("User ID......................"
				+ TestBaseProvider.getTestBase().getTestData().getString("userid2"));
		System.out.println("PAssword..................."
				+ TestBaseProvider.getTestBase().getTestData().getString("password"));
		homePage.doLogin4(TestBaseProvider.getTestBase().getTestData().getString("userid2"),
				         TestBaseProvider.getTestBase().getTestData().getString("password"),
				false);
    }
	
	@When("^teacher login with same account$")
    public void teacher_login_with_same_account() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.closeButton_in_LoginPage();
		System.out.println("User ID......................"
				+ TestBaseProvider.getTestBase().getTestData().getString("userid"));
		System.out.println("PAssword..................."
				+ TestBaseProvider.getTestBase().getTestData().getString("password"));
		homePage.Login_driver(TestBaseProvider.getTestBase().getTestData().getString("userid"),
				         TestBaseProvider.getTestBase().getTestData().getString("password"),
				false);
    }

	
	
	@And("^teacher logs into the application by providing \\[Incorrect UserInformation\\]$")
    public void teacher_logs_into_the_application_by_providing_incorrect_userinformation() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		LoginPage logpage = new LoginPage();
		homePage.closeButton_in_LoginPage();
		System.out.println("User ID......................"
				+ TestBaseProvider.getTestBase().getTestData().getString("incorrect_userid"));
		System.out.println("PAssword..................."
				+ TestBaseProvider.getTestBase().getTestData().getString("incorrect_password"));
		homePage.doLogin_invalid(TestBaseProvider.getTestBase().getTestData().getString("incorrect_userid"),
				         TestBaseProvider.getTestBase().getTestData().getString("incorrect_password"),
				false);
		Assert.assertTrue(logpage.sizetooltiploginerrormsgbox().size()!=0);
		logpage.getTxtUsername().clear();
		logpage.getTxtPassword().clear();
		
		
    }
	
	@Given("^CSR logs into the application by providing \\[UserInformation\\]$")
    public void csr_logs_into_the_application_by_providing_userinformation() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.CSR_doLogin();
    }
	
	@Given("^CSR goes to the RCOCA CSR site$")
	public void CSR_goes_to_the_RCOCA_CSR_site() throws Throwable {
		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		String CSRURL = TestBaseProvider.getTestBase().getTestData().getString("CSRURL");
		
		driver.get(CSRURL);
    }
	
	@Given("^CSR logs into the application by providing \\[UserInformation\\] whose prefix is not selected$")
    public void csr_logs_into_the_application_by_providing_userinformation_whose_prefix_is_not_selected() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.CSR_doLogin();
    }
	
	@Given("^CSR logs into the application by providing \\[UserInformation\\] whose account status is active$")
    public void csr_logs_into_the_application_by_providing_userinformation_whose_account_status_is_active() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.CSR_doLogin();
    }
	
	@Given("^CSR logs into the application by providing \\[UserInformation\\] whose account status is inactive$")
    public void csr_logs_into_the_application_by_providing_userinformation_whose_account_status_is_inactive() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.CSR_doLogin();
    }
	
	@Given("^CSR logs into the application by providing \\[UserInformation\\] whose account Hold status is 'Temporary Hold'$")
    public void csr_logs_into_the_application_by_providing_userinformation_whose_account_hold_status_is_temporary_hold() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.CSR_doLogin();
    }
	
	@Given("^CSR logs into the application by providing \\[UserInformation\\] whose account Hold status is 'Pre\\-Paid'$")
    public void csr_logs_into_the_application_by_providing_userinformation_whose_account_hold_status_is_prepaid() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.CSR_doLogin();
    }
	
	@Given("^CSR logs into the application by providing \\[UserInformation\\] whose account Hold status is 'Held by A\\/R'$")
    public void csr_logs_into_the_application_by_providing_userinformation_whose_account_hold_status_is_held_by_ar() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.CSR_doLogin();
    }
	
	@When("^teacher logs into the application by providing incorrect username and password$")
    public void teacher_logs_into_the_application_by_providing_incorrect_username_and_password() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		LoginPage logpage = new LoginPage();
		homePage.closeButton_in_LoginPage();
		System.out.println("User ID......................"
				+ TestBaseProvider.getTestBase().getTestData().getString("incorrect_userid"));
		System.out.println("PAssword..................."
				+ TestBaseProvider.getTestBase().getTestData().getString("incorrect_password"));
		homePage.doLogin_invalid(TestBaseProvider.getTestBase().getTestData().getString("incorrect_userid"),
				         TestBaseProvider.getTestBase().getTestData().getString("incorrect_password"),
				false);
		
    }
	
	
	 @When("^teacher enters valid email in upper case in Account Number or Email field and valid password$")
	    public void teacher_enters_valid_email_in_upper_case_in_account_number_or_email_field_and_valid_password() throws Throwable {
		 ILoginPage homePage = getFactory().getILoginPage();
			homePage.closeButton_in_LoginPage();
			System.out.println("User ID......................"
					+ TestBaseProvider.getTestBase().getTestData().getString("userid"));
			System.out.println("PAssword..................."
					+ TestBaseProvider.getTestBase().getTestData().getString("password"));
			homePage.doLogin_credentials_Input(TestBaseProvider.getTestBase().getTestData().getString("userid"),
					         TestBaseProvider.getTestBase().getTestData().getString("password"),
								false);
	    }
	 
	 @When("^teacher enters valid email in mixed case in Account Number or Email field and valid password$")
	    public void teacher_enters_valid_email_in_mixed_case_in_account_number_or_email_field_and_valid_password() throws Throwable {
		 ILoginPage homePage = getFactory().getILoginPage();
			//homePage.closeButton_in_LoginPage();
			System.out.println("User ID......................"
					+ TestBaseProvider.getTestBase().getTestData().getString("userid"));
			System.out.println("PAssword..................."
					+ TestBaseProvider.getTestBase().getTestData().getString("password"));
			homePage.doLogin_credentials_Input(TestBaseProvider.getTestBase().getTestData().getString("userid"),
					         TestBaseProvider.getTestBase().getTestData().getString("password"),
								false);
	    }
	
	
	@And("^teacher enters user name leaving password field blank and click on login button$")
    public void teacher_enters_user_name_leaving_password_field_blank_and_click_on_login_button() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		LoginPage logpage = new LoginPage();
		homePage.closeButton_in_LoginPage();
	
		homePage.doLogin_PasswordBlank(TestBaseProvider.getTestBase().getTestData().getString("userid"),
				false);
    }
	
	
	@When("^teacher enters password leaving user name field blank and click on login button$")
    public void teacher_enters_password_leaving_user_name_field_blank_and_click_on_login_button() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		LoginPage logpage = new LoginPage();
		homePage.closeButton_in_LoginPage();
	
		homePage.doLogin_UserNameBlank(TestBaseProvider.getTestBase().getTestData().getString("password"),
				false);
    }
	
	@When("^CSR enters valid username in 'UserName' field$")
    public void csr_enters_valid_username_in_username_field() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.CSR_enters_Username_in_UNameField();
    }
	
	@When("^CSR enters username in 'UserName' field$")
    public void csr_enters_username_in_username_field() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.CSR_enters_Username_in_UNameField();
    }
	
	@When("^CSR enters invalid username in 'UserName' field$")
    public void csr_enters_invalid_username_in_username_field() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.CSR_enters_Username_in_UNameField();
    }
	
	@And("^CSR enters valid password in 'Password' field$")
    public void csr_enters_valid_password_in_password_field() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.CSR_enters_Password_in_pwd_Field();
    }
	
	@And("^CSR enters invalid password in 'Password' field$")
    public void csr_enters_invalid_password_in_password_field() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.CSR_enters_Password_in_pwd_Field();
    }
	
	@When("^CSR clicks on 'UserName' field$")
    public void csr_clicks_on_username_field() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.CSR_clicks_on_UNameField_CSR_LoginPage();
    }
	
	@But("^has not entered any information in the ‘username’ field$")
    public void has_not_entered_any_information_in_the_username_field() throws Throwable {
		System.out.println("CSR has not entered the Username");
    }
	
	@But("^has not entered any information in the ‘password’ field$")
    public void has_not_entered_any_information_in_the_password_field() throws Throwable {
		System.out.println("CSR has not entered the Password");
    }
	
	@When("^CSR clicks on 'Password' field$")
    public void csr_clicks_on_password_field() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.CSR_clicks_on_pwd_Field_CSR_LoginPage();
    }
	
	@Then("^the 'ENTER' box should be disabled$")
    public void the_enter_box_should_be_disabled() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.validate_Enter_button_is_disabled_in_CSR_Login_Page();
    }
	
	@Then("^the 'ENTER' box should be enabled$")
    public void the_enter_box_should_be_enabled() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.validate_Enter_button_is_enabled_in_CSR_Login_Page();
    }
	
	@And("^CSR enters password in 'Password' field$")
    public void csr_enters_password_in_password_field() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.CSR_enters_Password_in_pwd_Field();
    }
	
	@And("^CSR enters password in 'Password' field with minimum 7 characters or more$")
    public void csr_enters_password_in_password_field_with_minimum_7_characters_or_more() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.CSR_enters_Password_in_pwd_Field();
    }
	
	@When("^CSR enters lessthan 7 characters in 'Password' field$")
    public void csr_enters_lessthan_7_characters_in_password_field() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.CSR_enters_Password_in_pwd_Field();
    }
	
	@Then("^CSR is presented with the user-authentication page$")
    public void csr_is_presented_with_the_userauthentication_page() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.Validate_CSR_is_presented_with_the_user_authentication_page();
    }
	
	@And("^an enabled textbox with the label ‘Username’$")
    public void an_enabled_textbox_with_the_label_username() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.Validate_the_label_of_Uname_in_CSR_loginPage();
    }
	
	@And("^an enabled textbox with the label ‘Password’$")
    public void an_enabled_textbox_with_the_label_password() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.Validate_the_label_of_Password_in_CSR_loginPage();
    }

    @And("^a disabled button labeled ‘ENTER’$")
    public void a_disabled_button_labeled_enter() throws Throwable {
    	ILoginPage homePage = getFactory().getILoginPage();
		homePage.Validate_the_label_of_ENTER_in_CSR_loginPage();
    }
	
	@And("^CSR clicks on outside in a page$")
    public void csr_clicks_on_outside_in_a_page() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.CSR_clicks_on_outside_in_loginPage();
    }
	
	@And("^CSR clicks on 'ENTER' button$")
    public void csr_clicks_on_enter_button() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.CSR_clicks_on_Enter_button_SignInPage();
    }
	
	@Then("^the error message should be displayed as 'Error Logging In'$")
    public void the_error_message_should_be_displayed_as_error_logging_in() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.verify_error_message_when_enter_Invalid_creds_CSR_Login_Page();
    }
	
	@Then("^the error message should be displayed as 'Please enter at least 7 characters\\.'$")
    public void the_error_message_should_be_displayed_as_please_enter_at_least_7_characters() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.verify_error_message_when_enter_lessthan_min_chars_in_pwd_CSR_Login_Page();
    }
	
	@Then("^Home page should be displayed$")
    public void home_page_should_be_displayed() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.verify_CSR_Home_Page_is_displayed();
    }
	
	
	@When("^teacher clicks on My Account link$")
    public void teacher_clicks_on_my_account_link() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		Scenario scenario = (Scenario) TestBaseProvider.getTestBase().getContext().getProperty("scenario.obj");
		new ScenarioHook().takeScreenshot(scenario);
		homePage.user_clicks_on_MyAccount_in_HomePage();
    }
	
	
	/*@Given("^teacher login with valid (.+) and (.+)$")
    public void teacher_login_with_valid_and(String username, String password) throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		System.out.println("User ID......................"
				+ TestBaseProvider.getTestBase().getTestData().getString("userid"));
		System.out.println("PAssword..................."
				+ TestBaseProvider.getTestBase().getTestData().getString("password"));
		homePage.doLogin(username,password,
				false);
    }*/
	
	
	@Given("^teacher logged into the application with valid (.+) and (.+)$")
    public void teacher_logged_into_the_application_with_valid_and(String username, String password) throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		System.out.println("User ID......................"+ username);
		System.out.println("PAssword..................."+ password);
		homePage.doLogin(username,password,false);
    }
	
	

	// There are two different log out steps required because in parent 'SIGN
	// OUT' is capitalized and in teacher it is not
	@Then("^user logs out from PCOOL$")
	public void user_logs_out_from_system() {
		IHeaderSection headerSection = SectionFactory.getFactory()
				.getIHeaderSection(LocatorUtils.getBy("dw.header.section"));
		headerSection.clickOnMenuOptions("My Account", "SIGN OUT");
		TestBaseProvider.getTestBase().getTestData().setProperty("module", "teacher");
	}

	@Then("^user logs out from TCOOL$")
	public void user_logs_out_from_TCOOL() {
		IHeaderSection headerSection = SectionFactory.getFactory()
				.getIHeaderSection(LocatorUtils.getBy("dw.header.section"));
		headerSection.clickOnMenuOptions("My Account", "Sign Out");
	}

	@Then("^user goes to profile page$")
	public void user_goes_to_profile_page() {
		IHeaderSection headerSection = SectionFactory.getFactory()
				.getIHeaderSection(LocatorUtils.getBy("dw.header.section"));
		headerSection.clickOnMenuOptions("My Account", "Profile");
	}
	
	
	@And("^BTS modal displays$")
    public void bts_modal_displays() throws Throwable {
        //throw new PendingException();
    }
	
	
	@And("^teacher completes the missing information on BTS modal$")
    public void teacher_completes_the_missing_information_on_bts_modal() throws Throwable {
        //throw new PendingException();
    }
	
	
	@Then("^“Please enter your password” tooltip should display$")
    public void please_enter_your_password_tooltip_should_display() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.LoginValidation_EmptyPassword();
    }
	
	
	@Then("^“Please enter your account number” tooltip should display$")
    public void please_enter_your_account_number_tooltip_should_display() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.LoginValidation_EmptyUserName();
    }
	
	
	@Then("^only “Please enter your account number” tooltip should display$")
    public void only_please_enter_your_account_number_tooltip_should_display() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.LoginValidation_OnlyEmptyUserName();
    }

	
	
	@Then("^Only single tool tip for Login Error should be displayed$")
    public void only_single_tool_tip_for_login_error_should_be_displayed() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.Invalid_Login_ErrorMsg_Check();
    }
	
	@When("^teacher clears the username and click on login button$")
    public void teacher_clears_the_usernameand_click_on_login_button() throws Throwable {
		
		LoginPage logpage = new LoginPage();
		logpage.getTxtUsername().clear();
		SCHUtils.clickUsingJavaScript(
	    SCHUtils.waitForElementToBeClickable(logpage.getBtnSignOn(), 30));
            
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(4000);
    }
	/*##################################################################################################################################################    
	##################################################################################################################################################    
	###########################################   							             #############################################################   
	###########################################   		    STORY 1880 Activation flow   #############################################################
	###########################################   							             #############################################################        
	##################################################################################################################################################        
	##################################################################################################################################################*/




	@When("^teacher clicks on the Activate Your Account button$")
	public void teacher_clicks_on_the_activate_your_account_button() throws Throwable {
		ILoginPage loginPg = getFactory().getILoginPage();
		loginPg.click_ActivateYourAccountBtn();
	}

	@Then("^the Activate Your Account modal should be dispalyed with Account Number field and Next Button$")
	public void the_activate_your_account_modal_should_be_dispalyed_with_account_number_field_and_next_button() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
		login.verify_ActivateAccountModal();
	}
	
	
	@And("^Activate Your Account modal should be dispalyed with Account Number field, Email address field and Next Button$")
    public void activate_your_account_modal_should_be_dispalyed_with_account_number_field_email_address_field_and_next_button() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
		login.verify_ActivateAccountModal();
    }
	
	@Then("^hint label under Account Number field i\\.e\\. “Maximum 8 characters” should not be seen$")
    public void hint_label_under_account_number_field_ie_maximum_8_characters_should_not_be_seen() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
		login.verify_hintfield_accountactivation_notpresent();
    }


	@And("^teacher enters the account Number \\[UserInformation\\]$")
	public void teacher_enters_the_account_number_userinformation() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
		login.enterAcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccId"));
		login.enter_emailField_AcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccEmail"));
		
	}
	
	@And("^teacher enters the account Number and Email field$")
    public void teacher_enters_the_account_number_and_email_field() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
		login.enterAcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccId"));
		login.enter_emailField_AcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccEmail"));
    }

	@And("^click on Next button$")
	public void click_on_next_button() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
		login.click_btn_AccModalNext();
	}


	@Then("^Forgot Your Password Modal with Close button is dispalyed$")
	public void forgot_your_password_modal_with_close_button_is_dispalyed() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
		login.verify_ForgotPasswordModal();
	}

	@And("^teacher clicks Close to close the modal$")
	public void teacher_clicks_close_to_close_the_modal() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
		login.click_btn_Close_ForgotPassWrdModal();

	}

	@Then("^Account Not found modal is displayed with Back Button$")
	public void account_not_found_modal_is_displayed_with_back_button() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
		login.verify_AccountNotFoundPopup();
	}

	@And("^teacher clicks Back, which brings back the Activate Your Account Modal$")
	public void teacher_clicks_back_which_brings_back_the_activate_your_account_modal() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
		login.click_btn_Back_AccNotFndModal();
	}

	@Then("^Account number field is blank$")
	public void account_number_field_is_blank() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
		String enteredAccNo = login.getvalue_Invalid_AccNo();
		
		if(enteredAccNo.isEmpty()){
			Assert.assertEquals(true, true, "Account Number cannot be Non-Numeric");
		}else 
		{
			Assert.fail("Account Number should not be anything other than Numeric");;
		}
	}
	
	
	
	
	
	/*###############################################################################################################################################   
	##################################################################################################################################################    
	###########################################   							             #############################################################   
	###########################################   		    STORY 2856 -My Saved Cart    #############################################################
	###########################################   							             #############################################################        
	##################################################################################################################################################        
	##################################################################################################################################################*/   
	
	@When("^teacher clicks save cart, provides cart name and save$")
	public void teacher_clicks_save_cart_provides_cart_name_and_save_cart_name() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.saveCart(TestBaseProvider.getTestBase().getTestData().getString("cartName"));
	}

	

    @And("^quantity is updated and same reflects on cart$")
    public void quantity_is_updated_and_same_reflects_on_cart() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
    	cartpage.verifyQuant();
    }
	/*public void cartSave() throws InterruptedException{
		
		
		
		
		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		driver.findElement(By.xpath("//button[@id='review-cart']")).click();// click review cart button
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// click save cart

		driver.findElement(By.xpath("//button[@class='button-save-cart']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			if(driver.findElement(By.xpath("//div[@id='dialog-save-cart']")).isDisplayed()){
				System.out.println("Yes Displayed 1");
	
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
				driver.findElement(By.xpath("//button[@class='button-yes secondary']")).click();// click YES
	
			}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(driver.findElement(By.xpath("//div[@id='dialog-save-cart']")).isDisplayed()){
			System.out.println("Yes Displayed 2");

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			driver.findElement(By.xpath("//div[@id='dialog-save-cart']/div[2]/div/p[1]/input[@id='cartnameinput']")).sendKeys(Keys.CLEAR);
			driver.findElement(By.xpath("//div[@id='dialog-save-cart']/div[2]/div/p[1]/input[@id='cartnameinput']")).sendKeys("Cart1");

			System.out.println("'enter the cart name");
			driver.findElement(By.xpath(".//*[@id='dialog-save-cart-content']/p[2]/button[1]")).click();// click SAVE

			System.out.println("Finally");
		}	
			// loing wait 
			try {
				System.out.println("here is long wait...........");
				Thread.sleep(10000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
		// open the saved cart

		driver.findElement(By.xpath("//div[@class='sidecarmenu-desktop hide-mobile']//li[@class='mylists toggle-menu']//a/span[contains(text(),'Saved Carts')]")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block open the application
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//div[@class='sidecarmenu-desktop hide-mobile']//li[starts-with(@class,'mylists toggle-menu')]/descendant::div[@class='toggle-content']/ul//li[1]/a")).click();
		
		Thread.sleep(10000);//run thi done
		
		// to click on the book detail to increase the quantity
		
		//Get the table,and click on the book 
		
		String xpathTableOrderDetail = "//div[@class='cart-month-1-content']/div/table/tbody/tr/td";
		
		List<WebElement> ttab = driver.findElements(By.xpath(xpathTableOrderDetail));
		for(WebElement i:ttab){
			System.out.println("TableDescription"+i.getText());
		}
		driver.findElement(By.xpath("//div[@class='cart-month-1-content']/div/table/tbody/tr[1]/td[2]/a")).click(); // click on book title
		String linkFullDetail = "//div[@class='product-details row']/div[2]/a";
		PauseUtil.clickWhenReady(By.xpath (linkFullDetail), 10);
		Thread.sleep(3000);
		
		String inputQantity = "//div[@class='inventory']/div/input";
		WebElement inputField = PauseUtil.getWhenVisible(By.xpath(inputQantity),10);
		inputField.clear();
		inputField.sendKeys("5");
		
		String buttonAddToCart = "add-to-cart";
		PauseUtil.clickWhenReady(By.id(buttonAddToCart),10);
		
		String buttonGoToCheckout = "//div[@id='minicart-modal']/div[2]/a[1]";
		//driver.findElement(By.xpath(buttonGoToCheckout));
		System.out.println("buttonGoToCheckout"+buttonGoToCheckout);
		PauseUtil.clickWhenReady(By.xpath(buttonGoToCheckout),10);
		System.out.println("2222buttonGoToCheckout"+buttonGoToCheckout);

		String cartQuantity = "//div[@class='header-authenticated-top-right']/div[3]/div[1]/a/span";
		System.out.println("Start to get Quantity");
		WebElement cartQ = PauseUtil.getWhenVisible(By.xpath(cartQuantity), 10);
		System.out.println("Quantity "+cartQ.getText());
		
		
		
	}*/	
    
    @When("^teacher open rco\\-scholastic web site once again and login with same account$")
    public void teacher_open_rcoscholastic_web_site_once_again_and_login_with_same_account() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
    	cartpage.login_sameaccount_verifyQty_autosave(TestBaseProvider.getTestBase().getTestData().getString("userid"),
		         TestBaseProvider.getTestBase().getTestData().getString("password"),false, ConstantUtils.ENTERORDER);	
    }
    
    
    @And("^teacher open rco\\-scholastic web site once again$")
    public void teacher_open_rcoscholastic_web_site_once_again() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
    	cartpage.login_sameaccount_verifyQty_autosave(TestBaseProvider.getTestBase().getTestData().getString("userid"),
		         TestBaseProvider.getTestBase().getTestData().getString("password"),false, ConstantUtils.ENTERORDER);	
    }
    
    
    @Given("^teacher whose order is shipped logs into the application by providing \\[UserInformation\\]$")
    public void teacher_whose_order_is_shipped_logs_into_the_application_by_providing_userinformation() throws Throwable {
    	ILoginPage homePage = getFactory().getILoginPage();
		homePage.closeButton_in_LoginPage();
		System.out.println("User ID......................"
				+ TestBaseProvider.getTestBase().getTestData().getString("userid"));
		System.out.println("PAssword..................."
				+ TestBaseProvider.getTestBase().getTestData().getString("password"));
		homePage.doLogin2(TestBaseProvider.getTestBase().getTestData().getString("userid"),
				         TestBaseProvider.getTestBase().getTestData().getString("password"),
				false);
        
    }
    
    
    @When("^teacher enters the account number leaving email field blank$")
    public void teacher_enters_the_account_number_leaving_email_field_blank() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
		login.enterAcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccId")); 
    }
    
    
    @Then("^Next button should be disabled$")
    public void next_button_should_be_disabled() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
		login.verify_btn_AccModalNext_Disabled(); 
    }
    
    
    @When("^teacher enters the email field leaving account number blank$")
    public void teacher_enters_the_email_field_leaving_account_number_blank() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
		login.enter_emailField_AcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccEmail"));
    }
    
    @When("^teacher enters correct account number and email address which is not associated to this account$")
    public void teacher_enters_correct_account_number_and_email_address_which_is_not_associated_to_this_account() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.enterAcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccId")); 
		login.enter_emailField_AcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccEmail"));
    }
    
    @Then("^“The information entered does not match our records\\. Please check to ensure the correct email address is being entered for the account number provided\\.” is displayed$")
    public void the_information_entered_does_not_match_our_records_please_check_to_ensure_the_correct_email_address_is_being_entered_for_the_account_number_provided_is_displayed() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
		login.verify_AccountNotFoundPopup_EmailNotAssociatedMsg(); 
    }
    
    @And("^Back button should be present$")
    public void back_button_should_be_present() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
		login.verify_backbutton_AccountNotFoundPopup();
    }
    
    
    @When("^teacher enters correct account number and email address which is associated to this account$")
    public void teacher_enters_correct_account_number_and_email_address_which_is_associated_to_this_account() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
        System.out.println("Entering Account No "+TestBaseProvider.getTestBase().getTestData().getString("teacherAccId") );
        login.enterAcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccId"));
		login.enter_emailField_AcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccEmail"));

    }
    
    
    @Then("^“We've sent an email with a link to reset your password\\. Please check your email\\.” is displayed$")
    public void weve_sent_an_email_with_a_link_to_reset_your_password_please_check_your_email_is_displayed() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
		login.verify_AccountNotFoundPopup_EmailAssociatedMsg();  
    }
    
    
    @When("^teacher enters correct account number and email address with special characters and tab out$")
    public void teacher_enters_correct_account_number_and_email_address_with_special_characters_and_tab_out() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.enterAcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccId")); 
		login.enter_emailField_AcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccEmail"));
    }
    
    @When("^teacher enters correct account number and partial email address and tab out$")
    public void teacher_enters_correct_account_number_and_partial_email_address_and_tab_out() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.enterAcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccId")); 
		login.enter_emailField_AcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccEmail"));
    }
    
    
    @When("^teacher enters correct account number and email with missing username and tab out$")
    public void teacher_enters_correct_account_number_and_email_with_missing_username_and_tab_out() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.enterAcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccId")); 
		login.enter_emailField_AcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccEmail"));
    }
    
    @When("^teacher enters correct account number and email with missing '@' sign and tab out$")
    public void teacher_enters_correct_account_number_and_email_with_missing_sign_and_tab_out() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.enterAcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccId")); 
		login.enter_emailField_AcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccEmail"));
    }
    
    @When("^teacher enters correct account number and email with missing domain and tab out$")
    public void teacher_enters_correct_account_number_and_email_with_missing_domain_and_tab_out() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.enterAcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccId")); 
		login.enter_emailField_AcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccEmail"));
    }
    
    @When("^teacher enters correct account number and email with missing '@' sign and domain and tab out$")
    public void teacher_enters_correct_account_number_and_email_with_missing_sign_and_domain_and_tab_out() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.enterAcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccId")); 
		login.enter_emailField_AcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccEmail"));
    }
    
    @When("^teacher enters correct account number and garbage email and tab out$")
    public void teacher_enters_correct_account_number_and_garbage_email_and_tab_out() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.enterAcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccId")); 
		login.enter_emailField_AcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccEmail"));
    }
    
    @When("^teacher enters correct account number and email with missing two '@' signs and tab out$")
    public void teacher_enters_correct_account_number_and_email_with_missing_two_signs_and_tab_out() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.enterAcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccId")); 
		login.enter_emailField_AcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccEmail"));
    }

    @When("^teacher enters correct account number and email with leading dot and tab out$")
    public void teacher_enters_correct_account_number_and_email_with_leading_dot_and_tab_out() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.enterAcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccId")); 
		login.enter_emailField_AcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccEmail"));
    	
    }
    
    @When("^teacher enters correct account number and email with trailing dot and tab out$")
    public void teacher_enters_correct_account_number_and_email_with_trailing_dot_and_tab_out() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.enterAcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccId")); 
		login.enter_emailField_AcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccEmail"));
    }
    
    @When("^teacher enters correct account number and email with multiple dots and tab out$")
    public void teacher_enters_correct_account_number_and_email_with_multiple_dots_and_tab_out() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.enterAcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccId")); 
		login.enter_emailField_AcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccEmail"));
    }
    
    @When("^teacher enters correct account number and email with unicode address and tab out$")
    public void teacher_enters_correct_account_number_and_email_with_unicode_address_and_tab_out() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.enterAcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccId")); 
		login.enter_emailField_AcctNumber(TestBaseProvider.getTestBase().getTestData().getString("teacherAccEmail"));
    }
    
    @Then("^“Please enter a valid email address\\.” is displayed$")
    public void please_enter_a_valid_email_address_is_displayed() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
		login.verify_AccountActivation_ErrorToolTip();  
    }
    
    @Then("^CSR can succesfully submit the order$")
    public void csr_can_succesfully_submit_the_order() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
		login.verify_CSR_Home_Page_is_displayed();
    }
    
    //######################################## Story 1830 steps ###################################################
    @Then("^CSR sees the login screen$")
    public void csr_sees_the_login_screen() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.Verify_LoginPagePresent();
    }


    @Then("^Child(\\d+)FirstName in Teacher(\\d+)Names class displays with a /+ sign/$")
    public void Child_FirstName_in_Teacher_Names_class_displays_with_a_sign(int arg1, int arg2) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
    
    
    @Given("^teacher has valid reading clubs account$")
    public void teacher_has_valid_reading_clubs_account() throws Throwable {
        System.out.println("Teacher has valid credentials");
    }
    
    @Given("^teacher has valid reading clubs account and navigates to Canada Reading Clubs site$")
    public void teacher_has_valid_reading_clubs_account_and_navigates_to_canada_reading_clubs_site() throws Throwable {
    	System.out.println("Teacher has valid credentials and navigates to Canada Reading Clubs site");
    }
    
    @Then("^teacher views “Forgot your login information\\?” hyperlink$")
    public void teacher_views_forgot_your_login_information_hyperlink() throws Throwable {
    	pcod_logpage.pcod_gettext_equals(loginpage.getLnkForgotAccount(),
                TestBaseProvider.getTestBase().getTestData().getString("forgot_login_hyperlink"), "Forgot your login information hyperlink");
    }
    
    @And("^teacher clicks on “Forgot your login information\\?” hyperlink$")
    public void teacher_clicks_on_forgot_your_login_information_hyperlink() throws Throwable {
    	pcod_logpage.pcod_click_element(loginpage.getLnkForgotAccount());
    }
    
    @Then("^teacher is navigated to Forgot Password page$")
    public void teacher_is_navigated_to_forgot_password_page() throws Throwable {
        pcod_logpage.verify_element_displayed(loginpage.getpopupregistrationforgotlogin());
    }
    
    @Given("^teacher has valid reading clubs account but forgot password$")
    public void teacher_has_valid_reading_clubs_account_but_forgot_password() throws Throwable {
    	System.out.println("Teacher has valid credentials and navigates to Canada Reading Clubs site but forgot the password");
    }
    
    @Given("^teacher has valid reading clubs account but not enabled$")
    public void teacher_has_valid_reading_clubs_account_but_not_enabled() throws Throwable {
    	System.out.println("Teacher has valid reading clubs account but not enabled");
    }

    @When("^teacher enters non\\-existing account number in account number\\/email field and password$")
    public void teacher_enters_nonexisting_account_number_in_account_numberemail_field_and_password() throws Throwable {
    		ILoginPage homePage = getFactory().getILoginPage();
    		homePage.closeButton_in_LoginPage();
    		System.out.println("User ID......................"
    				+ TestBaseProvider.getTestBase().getTestData().getString("userid"));
    		System.out.println("PAssword..................."
    				+ TestBaseProvider.getTestBase().getTestData().getString("password"));
    		homePage.teacher_enters_Uname_and_pwd(TestBaseProvider.getTestBase().getTestData().getString("userid"),
    				         TestBaseProvider.getTestBase().getTestData().getString("password"));
    	
    }
    
    @When("^teacher enters non\\-existing email address in account number\\/email field and password$")
    public void teacher_enters_nonexisting_email_address_in_account_numberemail_field_and_password() throws Throwable {
    	ILoginPage homePage = getFactory().getILoginPage();
		homePage.closeButton_in_LoginPage();
		System.out.println("User ID......................"
				+ TestBaseProvider.getTestBase().getTestData().getString("userid"));
		System.out.println("PAssword..................."
				+ TestBaseProvider.getTestBase().getTestData().getString("password"));
		homePage.teacher_enters_Uname_and_pwd(TestBaseProvider.getTestBase().getTestData().getString("userid"),
				         TestBaseProvider.getTestBase().getTestData().getString("password"));
    }
    
    @And("^teacher clicks on 'Activate Your Account' option$")
    public void teacher_clicks_on_activate_your_account_option() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_clicks_on_ActivateYourAccount_SignIn_page();
    }
    
    @When("^teacher provides invalid account number$")
    public void teacher_provides_invalid_account_number() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_AC_num_in_ActivateYourAccount_modal_window();
    }

    @And("^valid email address and clicks on NEXT button$")
    public void valid_email_address_and_clicks_on_next_button() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_mail_id_in_ActivateYourAccount_modal_window();
    	login.teacher_clicks_on_NEXT_button_in_ActivateYourAccount_modal_window();
    }
    
    @Then("^teacher is presented with Account Activation fail modal$")
    public void teacher_is_presented_with_account_activation_fail_modal() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_validate_Account_Not_Found_modal_window_displayed();
    }

    @And("^modal header as 'Account Not found'$")
    public void modal_header_as_account_not_found() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_Account_Not_Found_modal_window_header();
    }
    
    @And("^teacher sees 'Forgot your Account Number or Email Address\\?' hyper link$")
    public void teacher_sees_forgot_your_account_number_or_email_address_hyper_link() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_link_Forgot_AC_num_mail_displayed_in_Account_Not_Found();
    }

    @And("^close icon at top right corner of the modal window$")
    public void close_icon_at_top_right_corner_of_the_modal_window() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_close_btn_displayed_in_Account_Not_Found();
    }

    @And("^BACK button enabled by default$")
    public void back_button_enabled_by_default() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_BACK_btn_enabled_in_Account_Not_Found();
    }
    
    @When("^teacher provides valid account number$")
    public void teacher_provides_valid_account_number() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_AC_num_in_ActivateYourAccount_modal_window();
    }

    @And("^invalid email address and clicks on NEXT button$")
    public void invalid_email_address_and_clicks_on_next_button() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_mail_id_in_ActivateYourAccount_modal_window();
    	login.teacher_clicks_on_NEXT_button_in_ActivateYourAccount_modal_window();
    }
    
    @And("^modal header as 'Email Not Match'$")
    public void modal_header_as_email_not_match() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_Email_Not_Match_modal_window_header();
    }
    
    @And("^teacher provides either invalid account number or email address and clicks on NEXT button$")
    public void teacher_provides_either_invalid_account_number_or_email_address_and_clicks_on_next_button() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_AC_num_in_ActivateYourAccount_modal_window();
    	login.teacher_enters_mail_id_in_ActivateYourAccount_modal_window();
    	login.teacher_clicks_on_NEXT_button_in_ActivateYourAccount_modal_window();
    }
    
    @When("^teacher clicks on BACK button$")
    public void teacher_clicks_on_back_button() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_clicks_on_BACK_btn_Activation_fail_window();
    }

    @Then("^teacher is navigated back to 'Activate Your Account' window$")
    public void teacher_is_navigated_back_to_activate_your_account_window() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_window_Activate_Your_Account_displayed();
    }
    
    @And("^teacher clicks on 'Forgot your login information\\?' link$")
    public void teacher_clicks_on_forgot_your_login_information_link() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_clicks_on_Forgot_login_info_link_loginPage();
    }

    @And("^teacher clicks on 'Forgot your Account Number or Email Address\\?' hyper link$")
    public void teacher_clicks_on_forgot_your_account_number_or_email_address_hyper_link() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_clicks_on_Forgot_AcNum_Email_link_in_Forgot_pwd_window_loginPage();
    }
    
    @Then("^teacher is navigated to 'Activate Your Account' window$")
    public void teacher_is_navigated_to_activate_your_account_window() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_window_Activate_Your_Account_displayed();
    }

    @And("^teacher sees 'Forgot your Account Number or Email Address\\?' hyper link below email address field$")
    public void teacher_sees_forgot_your_account_number_or_email_address_hyper_link_below_email_address_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_ForgotAccountNum_And_EmailAddr_link_displayed_ActivateWindow();
    }
    
    @When("^teacher enters valid account number leaving email field as blank$")
    public void teacher_enters_valid_account_number_leaving_email_field_as_blank() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_AC_num_in_ActivateYourAccount_modal_window();
    }

    @Then("^NEXT button is disabled$")
    public void next_button_is_disabled() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_NEXT_btn_disabled_in_ActivateWindow();
    }

    @And("^teacher enters email field leaving account number as blank$")
    public void teacher_enters_email_field_leaving_account_number_as_blank() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_mail_id_in_ActivateYourAccount_modal_window();
    }
    
    @When("^teacher clicks on '\\?' icon of Account number field$")
    public void teacher_clicks_on_icon_of_account_number_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_clicks_on_AcNum_fld_question_icon_in_ActivateWindow();
    }

    @Then("^teacher sees 'Your account number can be found on the top right corner of your packing slip\\.' window message$")
    public void teacher_sees_your_account_number_can_be_found_on_the_top_right_corner_of_your_packing_slip_window_message() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_tooltip_txt_AcNum_fld_in_ActivateWindow();
    }

    @And("^teacher clicks on '\\?' icon of email field$")
    public void teacher_clicks_on_icon_of_email_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_clicks_on_Email_fld_question_icon_in_ActivateWindow();
    }

    @And("^teacher sees 'Enter the email address associated with your account number\\.' message$")
    public void teacher_sees_enter_the_email_address_associated_with_your_account_number_message() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_tooltip_txt_Email_fld_in_ActivateWindow();
    }
    
    @When("^teacher enters email address with multiple '@' sign in account number\\/email field and click outside$")
    public void teacher_enters_email_address_with_multiple_sign_in_account_numberemail_field_and_click_outside() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_AcNum_Email_Forgot_Login_window();
    }
    
    @Then("^tool tip error message 'Please enter a valid email address\\.' displays$")
    public void tool_tip_error_message_please_enter_a_valid_email_address_displays() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_error_tooltip_AcNum_Email_Forgot_Login_window();
    }
    
    @And("^account number email field is highlighted in yellow$")
    public void account_number_email_field_is_highlighted_in_yellow() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_AcNum_Email_fld_highlights_Yellow_color_Forgot_Login_window();
    }
    
    @When("^teacher enters valid data in all the fields except First Name field$")
    public void teacher_enters_valid_data_in_all_the_fields_except_first_name_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Lname_Forgot_Login_window();
    	login.teacher_enters_AcNum_Email_Forgot_Login_window();
    }
    
    @Then("^CONTINUE button is disabled$")
    public void continue_button_is_disabled() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_CONTINUE_btn_disabled_Forgot_Login_window();
    }
    
    @When("^teacher enters more than 30 characters in Last name field$")
    public void teacher_enters_more_than_30_characters_in_last_name_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Lname_Forgot_Login_window();
    }
    
    @Then("^Last name field should not accept more than 30 characters$")
    public void last_name_field_should_not_accept_more_than_30_characters() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_Lname_fld_chars_Forgot_Login_window();
    }
    
    @When("^teacher enters email address with multiple dots in account number\\/email field and click outside$")
    public void teacher_enters_email_address_with_multiple_dots_in_account_numberemail_field_and_click_outside() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_AcNum_Email_Forgot_Login_window();
    }
    
    @When("^teacher enters email address with multiple dots and invalid top level doamain in account number email field and click outside$")
    public void teacher_enters_email_address_with_multiple_dots_and_invalid_top_level_doamain_in_account_number_email_field_and_click_outside() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_AcNum_Email_Forgot_Login_window();
    }
    
    @When("^teacher enters any special character other than “'” in Last Name field$")
    public void teacher_enters_any_special_character_other_than_in_last_name_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Lname_Forgot_Login_window();
    }
    
    @When("^teacher clicks inside last name field and does not enter any data$")
    public void teacher_clicks_inside_last_name_field_and_does_not_enter_any_data() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Lname_Forgot_Login_window();
    }
    
    @And("^clicks inside First Name field$")
    public void clicks_inside_first_name_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Fname_Forgot_Login_window();
    }
    
    @Then("^Last Name field is highlighted in Yellow bordered with red color$")
    public void last_name_field_is_highlighted_in_yellow_bordered_with_red_color() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_Lname_fld_highlights_Yellow_color_Forgot_Login_window();
    }
    
    @When("^teacher enters 2 characters in both first name and last name fields$")
    public void teacher_enters_2_characters_in_both_first_name_and_last_name_fields() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Fname_Forgot_Login_window();
    	login.teacher_enters_Lname_Forgot_Login_window();
    }
    
    @Then("^Continue button is enabled$")
    public void continue_button_is_enabled() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_CONTINUE_btn_enabled_Forgot_Login_window();
    }
    
    @When("^teacher enters only one character in last name field$")
    public void teacher_enters_only_one_character_in_last_name_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Lname_Forgot_Login_window();
    }
    
    @And("^clicks outside or inside first name field$")
    public void clicks_outside_or_inside_first_name_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Fname_Forgot_Login_window();
    }
    
    @And("^tool tip message 'Please enter at least 2 characters\\.' displays for Last Name field$")
    public void tool_tip_message_please_enter_at_least_2_characters_displays_for_last_name_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_minChar_length_toolTip_displayed_Lname_Forgot_Login_window();
    }
    
    @When("^teacher enters two characters in last name field$")
    public void teacher_enters_two_characters_in_last_name_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Lname_Forgot_Login_window();
    }
    
    @Then("^no error message displays for Last Name field$")
    public void no_error_message_displays_for_last_name_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_toolTip_not_display_Lname_Forgot_Login_window();
    }
    
    @When("^teacher enters more than 30 characters in First name field$")
    public void teacher_enters_more_than_30_characters_in_first_name_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Fname_Forgot_Login_window();
    }
    
    @Then("^First name field should not accept more than 30 characters$")
    public void first_name_field_should_not_accept_more_than_30_characters() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_Fname_fld_chars_Forgot_Login_window();
    }
    
    @When("^teacher enters valid data in all the fields except Last Name field$")
    public void teacher_enters_valid_data_in_all_the_fields_except_last_name_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Fname_Forgot_Login_window();
    	login.teacher_enters_AcNum_Email_Forgot_Login_window();
    }
    
    @When("^Parent enters any special character other than single quote in First Name field$")
    public void parent_enters_any_special_character_other_than_single_quote_in_first_name_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Fname_Forgot_Login_window();
    }
    
    @When("^teacher enters email address without domain in account number\\/email field and click outside$")
    public void teacher_enters_email_address_without_domain_in_account_numberemail_field_and_click_outside() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_AcNum_Email_Forgot_Login_window();
    }
    
    @When("^teacher clicks inside first name field and does not enter any data$")
    public void teacher_clicks_inside_first_name_field_and_does_not_enter_any_data() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Fname_Forgot_Login_window();
    }
    
    @And("^clicks inside of Last Name field$")
    public void clicks_inside_of_last_name_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Lname_Forgot_Login_window();
    }
    
    @Then("^First Name field is highlighted in Yellow bordered with red color$")
    public void first_name_field_is_highlighted_in_yellow_bordered_with_red_color() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_Fname_fld_highlights_Yellow_color_Forgot_Login_window();
    }
    
    @When("^teacher enters email address without dot in account number\\/email field and click outside$")
    public void teacher_enters_email_address_without_dot_in_account_numberemail_field_and_click_outside() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_AcNum_Email_Forgot_Login_window();
    }
    
    @When("^teacher enters only one character in first name field$")
    public void teacher_enters_only_one_character_in_first_name_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Fname_Forgot_Login_window();
    }
    
    @And("^clicks outside or inside of last name field$")
    public void clicks_outside_or_inside_of_last_name_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Lname_Forgot_Login_window();
    }
    
    @And("^tool tip message 'Please enter at least 2 characters\\.' displays for First Name field$")
    public void tool_tip_message_please_enter_at_least_2_characters_displays_for_first_name_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_minChar_length_toolTip_displayed_Fname_Forgot_Login_window();
    }
    
    @When("^teacher enters email address without top level domain in account number\\/email field and click outside$")
    public void teacher_enters_email_address_without_top_level_domain_in_account_numberemail_field_and_click_outside() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_AcNum_Email_Forgot_Login_window();
    }
    
    @When("^teacher enters two characters in first name field$")
    public void teacher_enters_two_characters_in_first_name_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Fname_Forgot_Login_window();
    }
    
    @Then("^no error message displays for First Name field$")
    public void no_error_message_displays_for_first_name_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_toolTip_not_display_Fname_Forgot_Login_window();
    }
    
    @Then("^tool tip error message displays for invalid credentials$")
    public void tool_tip_error_message_displays_for_invalid_credentials() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_ErrorMsg_for_Invalid_creds_LoginPage();
    }
    
    @And("^the AcNum or email address and password field is highlighted in yellow$")
    public void the_acnum_or_email_address_and_password_field_is_highlighted_in_yellow() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_Uname_AcNum_fld_highlights_Yellow_color_Main_LoginPage();
    	login.teacher_verify_Pwd_fld_highlights_Yellow_color_Main_LoginPage();
    }
    
    @When("^teacher enters valid email address and incorrect password$")
    public void teacher_enters_valid_email_address_and_incorrect_password() throws Throwable {
    	ILoginPage homePage = getFactory().getILoginPage();
		homePage.closeButton_in_LoginPage();
		System.out.println("User ID......................"
				+ TestBaseProvider.getTestBase().getTestData().getString("userid"));
		System.out.println("PAssword..................."
				+ TestBaseProvider.getTestBase().getTestData().getString("password"));
		homePage.teacher_enters_Uname_and_pwd(TestBaseProvider.getTestBase().getTestData().getString("userid"),
				         TestBaseProvider.getTestBase().getTestData().getString("password"));
    }
    
    @Then("^tool tip error message 'Please enter a valid email address\\.' displays in Login page$")
    public void tool_tip_error_message_please_enter_a_valid_email_address_displays_in_login_page() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_error_tooltip_AcNum_Email_Main_Login_page();
    }
    
    @And("^account number or email field is highlighted in yellow$")
    public void account_number_or_email_field_is_highlighted_in_yellow() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_Uname_AcNum_fld_highlights_Yellow_color_Main_LoginPage();
    }
    
    @When("^teacher does not enter account number but enters password in password field$")
    public void teacher_does_not_enter_account_number_but_enters_password_in_password_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_pwd();
    }
    
    @Then("^tool tip error message 'Please enter your account number or account email\\.' displays$")
    public void tool_tip_error_message_please_enter_your_account_number_or_account_email_displays() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_error_tooltip_AcNum_Email_for_empty_fld_Main_Login_page();
    }
    
    @When("^teacher enters account number but does not enter password in password field$")
    public void teacher_enters_account_number_but_does_not_enter_password_in_password_field() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Username_or_Email_Main_Login_page();
    }
    
    @Then("^tool tip error message 'Please enter your password\\.' displays$")
    public void tool_tip_error_message_please_enter_your_password_displays() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_error_tooltip_for_pwd_fld_empty_Main_Login_page();
    }
    
    @And("^the Password field is highlighted in yellow color$")
    public void the_password_field_is_highlighted_in_yellow_color() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_Pwd_fld_highlights_Yellow_color_Main_LoginPage();
    }
    
    @When("^teacher enters valid email and password$")
    public void teacher_enters_valid_email_and_password() throws Throwable {
    	ILoginPage homePage = getFactory().getILoginPage();
		homePage.closeButton_in_LoginPage();
		System.out.println("User ID......................"
				+ TestBaseProvider.getTestBase().getTestData().getString("userid"));
		System.out.println("PAssword..................."
				+ TestBaseProvider.getTestBase().getTestData().getString("password"));
		homePage.teacher_enters_Uname_and_pwd(TestBaseProvider.getTestBase().getTestData().getString("userid"),
				         TestBaseProvider.getTestBase().getTestData().getString("password"));
    }
    
    @Then("^teacher Home page displays$")
    public void teacher_home_page_displays() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_Home_page_displayed();
    }
    
    @Then("^email is validated and teacher is navigated to home page$")
    public void email_is_validated_and_teacher_is_navigated_to_home_page() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_verify_Home_page_displayed();
    }
    
    @When("^teacher enters email address with multiple '@' sign in account number or email field and click outside$")
    public void teacher_enters_email_address_with_multiple_sign_in_account_number_or_email_field_and_click_outside() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Username_or_Email_and_clicks_on_outside_Main_Login_page();
    }
    
    @When("^teacher enters email address with multiple dots in account number or email field and click outside$")
    public void teacher_enters_email_address_with_multiple_dots_in_account_number_or_email_field_and_click_outside() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Username_or_Email_and_clicks_on_outside_Main_Login_page();
    }
    
    @When("^teacher enters email address with multiple dots and invalid top level doamain in account number or email field and click outside$")
    public void teacher_enters_email_address_with_multiple_dots_and_invalid_top_level_doamain_in_account_number_or_email_field_and_click_outside() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Username_or_Email_and_clicks_on_outside_Main_Login_page();
    }
    
    @When("^teacher enters email address without dot in account number or email field and click outside$")
    public void teacher_enters_email_address_without_dot_in_account_number_or_email_field_and_click_outside() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Username_or_Email_and_clicks_on_outside_Main_Login_page();
    }
    
    @When("^teacher enters email address without top level domain in account number or email field and click outside$")
    public void teacher_enters_email_address_without_top_level_domain_in_account_number_or_email_field_and_click_outside() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Username_or_Email_and_clicks_on_outside_Main_Login_page();
    }
    
    @When("^teacher enters email address without domain in account number or email field and click outside$")
    public void teacher_enters_email_address_without_domain_in_account_number_or_email_field_and_click_outside() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_enters_Username_or_Email_and_clicks_on_outside_Main_Login_page();
    }
    
    @Given("^User opens the BM web site$")
    public void user_opens_the_bm_web_site() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.launchPage2();
    }
    
    @Given("^teacher is new to RCO clubs and newTeacherFlag option is checked in BM$")
    public void teacher_is_new_to_rco_clubs_and_newteacherflag_option_is_checked_in_bm() throws Throwable {
    	System.out.println("Teacher is new to RCO clubs and newTeacherFlag option is checked in BM");
    }
    
    
    @Given("^teacher is already existing user to RCO clubs$")
    public void teacher_is_already_existing_user_to_rco_clubs() throws Throwable {
    	System.out.println("Teacher is already existing user to RCO clubs");
    }

    //###################################Steps-SCSCOD-6308==========================================================================//

    @Given("^teacher has valid reading clubs account and navigates to login page$")
    public void teacher_has_valid_reading_clubs_account_and_navigates_to_login_page() throws Throwable {
    	System.out.println("Teacher has valid credentials and navigates to Canada Reading Clubs site");	

    }

    
    @When("^teacher selects “Remember me” checkbox$")
    public void teacher_selects_remember_me_checkbox() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
        ILoginPage homePage = getFactory().getILoginPage();
        //homePage.closeButton_in_LoginPage();
        login.click_RememberMe_LoginPage();
    }
    
    @And("^teacher enters valid account number\\/email address$")
    public void teacher_enters_valid_account_numberemail_address() throws Throwable {
    	ILoginPage homePage = getFactory().getILoginPage();
        homePage.closeButton_in_LoginPage();
        homePage.getTxtUsername().click();
        homePage.getTxtUsername().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("userid"));
        PauseUtil.pause(1000);
    }

    @And("^teacher enters valid password and clicks on login button$")
    public void teacher_enters_valid_password_and_clicks_on_login_button() throws Throwable {
    	ILoginPage homePage = getFactory().getILoginPage();
    	homePage.getTxtPassword().click();
    	homePage.getTxtPassword().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("password"));
        PauseUtil.pause(1500);
        SCHUtils.clickUsingJavaScript(
                SCHUtils.waitForElementToBeClickable(homePage.getBtnSignOn(), 30));
        homePage.closeButton_in_LoginPage();

    }

    @Then("^teacher should see already entered account number/email address in scholastic account/email field$")
    public void teacher_should_see_already_entered_account_number_email_address_in_scholastic_account_email_field() throws Throwable {
        ILoginPage homePage = getFactory().getILoginPage();
        homePage.validateRememberUserName_autopopulated();


    }

    @And("^teacher close the browser and launches reading club site in new browser$")
    public void teacher_close_the_browser_and_launches_reading_club_site_in_new_browser() throws Throwable {
        WebDriver driver = TestBaseProvider.getTestBase().getDriver();
        driver.close();
        PauseUtil.pause(2500);
        WebDriver driver1= new FirefoxDriver();
        driver1.get(TestBaseProvider.getTestBase().getTestData().getString("url"));
    }

    @And("^teacher enters valid account number$")
    public void teacher_enters_valid_account_number() throws Throwable {
        ILoginPage homePage = getFactory().getILoginPage();
        System.out.println("User ID......................"
                + TestBaseProvider.getTestBase().getTestData().getString("userid"));
        System.out.println("PAssword..................."
                + TestBaseProvider.getTestBase().getTestData().getString("password"));
        homePage.enterUn(TestBaseProvider.getTestBase().getTestData().getString("userid"));
    }

    @Then("^teacher should see already entered account number in scholastic account/email field$")
    public void teacher_should_see_already_entered_account_number_in_scholastic_account_email_field() throws Throwable {
        ILoginPage homePage = getFactory().getILoginPage();
        homePage.validateRememberUserName_autopopulated();
    }


    @And("^teacher enters valid email address$")
    public void teacher_enters_valid_email_address() throws Throwable {
        {
            ILoginPage homePage = getFactory().getILoginPage();
            System.out.println("User ID......................"
                    + TestBaseProvider.getTestBase().getTestData().getString("userid"));
            System.out.println("Password..................."
                    + TestBaseProvider.getTestBase().getTestData().getString("password"));
            homePage.doLogin3(TestBaseProvider.getTestBase().getTestData().getString("userid"),
                    TestBaseProvider.getTestBase().getTestData().getString("password"),
                    false);
        }

    }


    @Then("^teacher should see already entered email address in scholastic account/email field$")
    public void teacher_should_see_already_entered_email_address_in_scholastic_account_email_field() throws Throwable {
        ILoginPage homePage = getFactory().getILoginPage();
        homePage.validateRememberUserName_autopopulated();
    }

    @And("^teacher enters invalid account number/email address$")
    public void teacher_enters_invalid_account_number_email_address() throws Throwable {
        ILoginPage homePage = getFactory().getILoginPage();
        System.out.println("User ID......................"
                + TestBaseProvider.getTestBase().getTestData().getString("invaliduserid"));
        System.out.println("Password..................."
                + TestBaseProvider.getTestBase().getTestData().getString("invalidpassword"));
        homePage.enter_Uname(TestBaseProvider.getTestBase().getTestData().getString("invaliduserid"));
    }

    @And("^teacher enters invalid password and clicks on login button$")
    public void teacher_enters_invalid_password_and_clicks_on_login_button() throws Throwable {
    	ILoginPage homePage = getFactory().getILoginPage();
        homePage.enter_Pwd(TestBaseProvider.getTestBase().getTestData().getString("invalidpassword"));
        homePage.click_on_Login_btn();
    }

    @Then("^teacher should not see entered account number/email address in scholastic account/email field$")
    public void teacher_should_not_see_entered_account_number_email_address_in_scholastic_account_email_field() throws Throwable {
        ILoginPage homePage = getFactory().getILoginPage();
        homePage.validateRememberUserName_autopopulated1();

    }

    @And("^\"([^\"]*)\" checkbox is deselected$")
    public void checkbox_is_deselected(String arg1) throws Throwable {
        ILoginPage login = getFactory().getILoginPage();
        login.unchecked_RememberMe_LoginPage();

    }


//    @When("^teacher enters password in password field$")
//    public void teacher_enters_password_in_password_field() throws Throwable {
//        //ILoginPage homePage = getFactory().getILoginPage();
//        //System.out.println("password to enter"+TestBaseProvider.getTestBase().getTestData().getString("password"));
//        loginpage.getTxtPassword().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("password"));
//        PauseUtil.pause(1500);
//
//
//    }
//
//    @Then("^password by default is hidden and displayed as \\*$")
//    public void password_by_default_is_hidden_and_displayed_as_() throws Throwable {
//        ILoginPage login = getFactory().getILoginPage();
//        login.verifypasswordHidden();
//
//    }
//
//
//    @And("^'SHOW' is displayed within password field$")
//    public void _SHOW_is_displayed_within_password_field() throws Throwable {
//        ILoginPage login = getFactory().getILoginPage();
//        login.verifyShow_passwordbox();
//    }
//
//    @When("^teacher clicks on SHOW$")
//    public void teacher_clicks_on_SHOW() throws Throwable {
//        ILoginPage login = getFactory().getILoginPage();
//        login.verifyShow_passwordbox();
//        login.clickShowInPasswordBox();
//    }
//
//    @Then("^the entered characters in the password is shown$")
//    public void the_entered_characters_in_the_password_is_shown() throws Throwable {
//        ILoginPage login = getFactory().getILoginPage();
//        login.validateEnteredPassword();
//
//    }
//
//    @When("^teacher clicks on HIDE$")
//    public void teacher_clicks_on_HIDE() throws Throwable {
//        ILoginPage login = getFactory().getILoginPage();
//        login.verifyHide_passwordbox();
//        login.clickHideInPasswordBox();
//    }
//
//    @Then("^the password is hidden and \\'\\*\\'s are displayed$")
//    public void the_password_is_hidden_and_s_are_displayed() throws Throwable {
//        ILoginPage login = getFactory().getILoginPage();
//        login.validatePasswordisencrypted();
//    }
//
//    @And("^SHOW option should be seen$")
//    public void SHOW_option_should_be_seen() throws Throwable {
//        ILoginPage login = getFactory().getILoginPage();
//        login.verifyShow_passwordbox();
//    }
//
//    @Then("^HIDE option should be seen$")
//    public void HIDE_option_should_be_seen() throws Throwable {
//        ILoginPage login = getFactory().getILoginPage();
//        login.verifyHide_passwordbox();
//    }

// Duplicates
//    @When("^teacher enters password in password field$")
//    public void teacher_enters_password_in_password_field() throws Throwable {
//        //ILoginPage homePage = getFactory().getILoginPage();
//        //System.out.println("password to enter"+TestBaseProvider.getTestBase().getTestData().getString("password"));
//        loginpage.getTxtPassword().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("password"));
//        PauseUtil.pause(1500);
//
//
//    }
//
//    @Then("^password by default is hidden and displayed as \\*$")
//    public void password_by_default_is_hidden_and_displayed_as_() throws Throwable {
//        ILoginPage login = getFactory().getILoginPage();
//        login.verifypasswordHidden();
//
//    }
//
//
//    @And("^'SHOW' is displayed within password field$")
//    public void _SHOW_is_displayed_within_password_field() throws Throwable {
//        ILoginPage login = getFactory().getILoginPage();
//        login.verifyShow_passwordbox();
//    }
//
//    @When("^teacher clicks on SHOW$")
//    public void teacher_clicks_on_SHOW() throws Throwable {
//        ILoginPage login = getFactory().getILoginPage();
//        login.verifyShow_passwordbox();
//        login.clickShowInPasswordBox();
//    }
//
//    @Then("^the entered characters in the password is shown$")
//    public void the_entered_characters_in_the_password_is_shown() throws Throwable {
//        ILoginPage login = getFactory().getILoginPage();
//        login.validateEnteredPassword();
//
//    }
//
//    @When("^teacher clicks on HIDE$")
//    public void teacher_clicks_on_HIDE() throws Throwable {
//        ILoginPage login = getFactory().getILoginPage();
//        login.verifyHide_passwordbox();
//        login.clickHideInPasswordBox();
//    }
//
//    @Then("^the password is hidden and \\'\\*\\'s are displayed$")
//    public void the_password_is_hidden_and_s_are_displayed() throws Throwable {
//        ILoginPage login = getFactory().getILoginPage();
//        login.validatePasswordisencrypted();
//    }


    @When("^teacher enters password in password field$")
    public void teacher_enters_password_in_password_field() throws Throwable {
        //ILoginPage homePage = getFactory().getILoginPage();
        //System.out.println("password to enter"+TestBaseProvider.getTestBase().getTestData().getString("password"));
        loginpage.getTxtPassword().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("password"));
        PauseUtil.pause(1500);

    }


    @Then("^password by default is hidden and displayed as \\*$")
    public void password_by_default_is_hidden_and_displayed_as_() throws Throwable {
        ILoginPage login = getFactory().getILoginPage();
        login.verifypasswordHidden();

    }


    @And("^'SHOW' is displayed within password field$")
    public void _SHOW_is_displayed_within_password_field() throws Throwable {
        ILoginPage login = getFactory().getILoginPage();
        login.verifyShow_passwordbox();
    }

    @When("^teacher clicks on SHOW$")
    public void teacher_clicks_on_SHOW() throws Throwable {
        ILoginPage login = getFactory().getILoginPage();
        login.verifyShow_passwordbox();
        login.clickShowInPasswordBox();
    }

    @Then("^the entered characters in the password is shown$")
    public void the_entered_characters_in_the_password_is_shown() throws Throwable {
        ILoginPage login = getFactory().getILoginPage();
        login.validateEnteredPassword();

    }

    @When("^teacher clicks on HIDE$")
    public void teacher_clicks_on_HIDE() throws Throwable {
        ILoginPage login = getFactory().getILoginPage();
        login.verifyHide_passwordbox();
        login.clickHideInPasswordBox();
    }

    @Then("^the password is hidden and \\'\\*\\'s are displayed$")
    public void the_password_is_hidden_and_s_are_displayed() throws Throwable {
        ILoginPage login = getFactory().getILoginPage();
        login.validatePasswordisencrypted();
    }

    @And("^SHOW option should be seen$")
    public void SHOW_option_should_be_seen() throws Throwable {
        ILoginPage login = getFactory().getILoginPage();
        login.verifyShow_passwordbox();
    }

    @Then("^HIDE option should be seen$")
    public void HIDE_option_should_be_seen() throws Throwable {
        ILoginPage login = getFactory().getILoginPage();
        login.verifyHide_passwordbox();
    }
    

    @Then("^Username field placeholder is “Account Number or Account Email” with grey text$")
    public void username_field_placeholder_is_account_number_or_account_email_with_grey_text() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
        login.verify_AccountNumber_Placeholder();
    }
    
    @And("^Password field placeholder is “Account Password” with grey text$")
    public void password_field_placeholder_is_account_password_with_grey_text() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
        login.verify_AccountPassword_Placeholder();
    }

    @Then("^CSR will be redirected to the Order Source page$")
    public void csr_will_be_redirected_to_the_order_source_page() throws Throwable {
    	ILoginPage homePage = getFactory().getILoginPage();
		homePage.verify_CSR_Home_Page_is_displayed();

    }
    
    @Given("^CSR is new to RCO clubs$")
    public void csr_is_new_to_rco_clubs() throws Throwable {
        System.out.println("CSR is new to RCO club");
    }

    @Given("^CSR is not new to RCO clubs$")
    public void csr_is_not_new_to_rco_clubs() throws Throwable {
    	System.out.println("CSR is not new to RCO club");
    }


    @And("^teacher click on ADD$")
    public void teacher_click_on_ADD() throws Throwable {
        Reporter.log("Add Button was clicked");
    }
    
    @And("^teacher navigates to SFO page$")
    public void teacher_navigates_to_sfo_page() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigate_to_SFO();
    }
    
    @And("^teacher navigates to YTO page$")
    public void teacher_navigates_to_yto_page() throws Throwable {
    	ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigates_to_YTO();
    }

	@Given("^teacher is on the RCO unauthenticated page$")
	public void teacherIsOnTheRCOUnauthenticatedPage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(true,false);
		throw new PendingException();
	}

	@And("^a block First Time Here\\? Teachers is displayed$")
	public void aBlockFirstTimeHereTeachersIsDisplayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(true,false);
		throw new PendingException();
	}

	@And("^teacher is presented with button Create An Account$")
	public void teacherIsPresentedWithButtonCreateAnAccount() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^Activate Your Account button should not be displayed anymore$")
	public void activateYourAccountButtonShouldNotBeDisplayedAnymore() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^a hyperlink Activate Your Account should be displayed$")
	public void aHyperlinkActivateYourAccountShouldBeDisplayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^teacher toggle to FR$")
	public void teacherToggleToFR() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the FR version of the block First Time Here\\? Teachers is displayed$")
	public void theFRVersionOfTheBlockFirstTimeHereTeachersIsDisplayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^FR version of button Create An Account is displayed$")
	public void frVersionOfButtonCreateAnAccountIsDisplayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^FR version of hyperlink Activate Your Account is displayed$")
	public void frVersionOfHyperlinkActivateYourAccountIsDisplayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^teacher click on the link Create An Account$")
	public void teacherClickOnTheLinkCreateAnAccount() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Self registraion modal window is displayed$")
	public void selfRegistraionModalWindowIsDisplayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^teacher switch to FR$")
	public void teacherSwitchToFR() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^FR version of the Self registration modal is displayed$")
	public void frVersionOfTheSelfRegistrationModalIsDisplayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^teacher toggles back to EN$")
	public void teacherTogglesBackToEN() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^the EN version of Self registration modal is displayed$")
	public void theENVersionOfSelfRegistrationModalIsDisplayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^FR version of Self registration modal is displayed$")
	public void frVersionOfSelfRegistrationModalIsDisplayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^the Activation modal is displayed$")
	public void theActivationModalIsDisplayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^teacher should be able to activate her account$")
	public void teacherShouldBeAbleToActivateHerAccount() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^teacher should be able to login with the new password$")
	public void teacherShouldBeAbleToLoginWithTheNewPassword() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
	
	//############# PROD steps ###########
	@When("^teacher lands on login page$")
	public void teacher_lands_on_login_page() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
        login.verifyTCODHomepgae();
	}

	@Then("^teacher sees search bar$")
	public void teacher_sees_search_bar() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
        login.verifySearchBarDisplayed();
	}

	@Then("^teacher sees login screen$")
	public void teacher_sees_login_screen() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.getTCODPCODhomepage().isDisplayed();
		System.out.println("TCOD Login screen displayed");
		
	}
	
	//################################################ DWCAPCOD - 1456 #################################################################
	@Given("^teacher has not logged in after parent site launch and teacher has previously not opted in for parent pay$")
	public void teacher_has_not_logged_in_after_parent_site_launch_and_teacher_has_previously_not_opted_in_for_parent_pay() throws Throwable {
		System.out.println("Teacher account has not logged in since Parent Site launched and had not previously opted in for parent pay");
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		
		checkoutPage.updateParentSiteAttributesBM();
	}

	@Given("^teacher has not logged in after parent site launch and teacher has previously opted in for parent pay$")
	public void teacher_has_not_logged_in_after_parent_site_launch_and_teacher_has_previously_opted_in_for_parent_pay() throws Throwable {
		System.out.println("Teacher account has not logged in since Parent Site launched and had previously opted in for parent pay");
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		
		checkoutPage.updateParentSiteAttributesBM();
	}
	//################################################ DWCAPCOD - 1456 #################################################################
}
