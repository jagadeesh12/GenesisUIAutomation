package com.dw.automation.steps.home;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.dw.automation.support.SCHUtils;
import cucumber.api.PendingException;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import com.dw.automation.pages.ICheckoutPage;
import com.dw.automation.pages.ICheckoutPage_2;
import com.dw.automation.pages.ILoginPage;
import com.dw.automation.pages.PCOD_ILoginPage;
import com.dw.automation.pages.impl.PCOD_HomePage;
import com.dw.automation.pages.impl.PCOD_LoginPage;
import com.dw.automation.pages.impl.PCOD_ReviewCartPage;
import com.dw.automation.pages.impl.StudentFlyerOrdersPage;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.DataCreation;
import com.dw.automation.support.PauseUtil;
import com.scholastic.torque.common.TestBaseProvider;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class PCOD_LoginSteps {
    PCOD_LoginPage pcod_logpage = new PCOD_LoginPage();
    PCOD_HomePage pcod_homepage = new PCOD_HomePage();
    StudentFlyerOrdersPage stud_page = new StudentFlyerOrdersPage();
    PCOD_ReviewCartPage pcod_reviewpage = new PCOD_ReviewCartPage();
    ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();


    @Given("^Parent enters email address without domain in account number\\/email field and click outside$")
    public void parent_enters_email_address_without_domain_in_account_numberemail_field_and_click_outside() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.enterAccountNumber_Email(TestBaseProvider.getTestBase().getTestData().getString("acc_email"));
        pcod_logpage.getTxtUsername().sendKeys(Keys.TAB);
        PauseUtil.pause(1500);
    }

    @Given("^Parent enters email address without dot in account number\\/email field and click outside$")
    public void parent_enters_email_address_without_dot_in_account_numberemail_field_and_click_outside() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.enterAccountNumber_Email(TestBaseProvider.getTestBase().getTestData().getString("acc_email"));
        pcod_logpage.getTxtUsername().sendKeys(Keys.TAB);
        PauseUtil.pause(1500);
    }

    @Given("^Parent enters email address without top level domain in account number\\/email field and click outside$")
    public void parent_enters_email_address_without_top_level_domain_in_account_numberemail_field_and_click_outside() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.enterAccountNumber_Email(TestBaseProvider.getTestBase().getTestData().getString("acc_email"));
        pcod_logpage.getTxtUsername().sendKeys(Keys.TAB);
        PauseUtil.pause(1500);
    }

    @Given("^Parent enters email address with multiple “@” sign in account number\\/email field and click outside$")
    public void parent_enters_email_address_with_multiple_sign_in_account_numberemail_field_and_click_outside() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.enterAccountNumber_Email(TestBaseProvider.getTestBase().getTestData().getString("acc_email"));
        pcod_logpage.getTxtUsername().sendKeys(Keys.TAB);
        PauseUtil.pause(1500);
    }

    @Given("^Parent enters email address with multiple dots in account number\\/email field and click outside$")
    public void parent_enters_email_address_with_multiple_dots_in_account_numberemail_field_and_click_outside() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.enterAccountNumber_Email(TestBaseProvider.getTestBase().getTestData().getString("acc_email"));
        pcod_logpage.getTxtUsername().sendKeys(Keys.TAB);
        PauseUtil.pause(1500);
    }


    @Given("^Parent enters email address with multiple dots and invalid top level doamain in account number\\/email field and click outside$")
    public void parent_enters_email_address_with_multiple_dots_and_invalid_top_level_doamain_in_account_numberemail_field_and_click_outside() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.enterAccountNumber_Email(TestBaseProvider.getTestBase().getTestData().getString("acc_email"));
        pcod_logpage.getTxtUsername().sendKeys(Keys.TAB);
        PauseUtil.pause(1500);
    }

    @Given("^Parent enters non\\-existing email address in account number\\/email field$")
    public void parent_enters_nonexisting_email_address_in_account_numberemail_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.enterAccountNumber_Email(TestBaseProvider.getTestBase().getTestData().getString("acc_email"));
        pcod_logpage.getTxtUsername().sendKeys(Keys.TAB);
        PauseUtil.pause(1500);
    }

    @Given("^Parent enters non\\-existing email address in account number\\/email field and password$")
    public void parent_enters_nonexisting_email_address_in_account_numberemail_field_and_password() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        System.out.println("username is : "+TestBaseProvider.getTestBase().getTestData().getString("acc_email"));
        System.out.println("password is : "+TestBaseProvider.getTestBase().getTestData().getString("password"));
        login.enterAccountNumber_Email(TestBaseProvider.getTestBase().getTestData().getString("acc_email"));
        login.enterPassword(TestBaseProvider.getTestBase().getTestData().getString("password"));
        PauseUtil.pause(1500);
    }

    @Given("^Parent enters non\\-existing account number in account number\\/email field$")
    public void parent_enters_nonexisting_account_number_in_account_numberemail_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.enterAccountNumber_Email(TestBaseProvider.getTestBase().getTestData().getString("acc_email"));
        pcod_logpage.getTxtUsername().sendKeys(Keys.TAB);
        PauseUtil.pause(1500);
    }

    @Given("^Parent enters non\\-existing account number in account number\\/email field and password$")
    public void parent_enters_nonexisting_account_number_in_account_numberemail_field_and_password() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.enterAccountNumber_Email(TestBaseProvider.getTestBase().getTestData().getString("acc_no"));
        login.enterPassword(TestBaseProvider.getTestBase().getTestData().getString("password"));
        PauseUtil.pause(1500);
    }

    @Given("^Parent enters valid email address and incorrect password$")
    public void parent_enters_valid_email_address_and_incorrect_password() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.enterAccountNumber_Email(TestBaseProvider.getTestBase().getTestData().getString("acc_email"));
        login.enterPassword(TestBaseProvider.getTestBase().getTestData().getString("password"));
        PauseUtil.pause(1500);
    }

    @Given("^Parent does not enter account number but enters password in password field$")
    public void parent_does_not_enter_account_number_but_enters_password_in_password_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.enterPassword(TestBaseProvider.getTestBase().getTestData().getString("password"));
        PauseUtil.pause(1500);
    }

    @When("^Parent enters account number but does not enter password in password field$")
    public void parent_enters_account_number_but_does_not_enter_password_in_password_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.enterAccountNumber_Email(TestBaseProvider.getTestBase().getTestData().getString("acc_no"));
        PauseUtil.pause(1500);
    }

    @When("^Parent enters valid email and password$")
    public void parent_enters_valid_email_and_password() throws Throwable {
        pcod_logpage.enterAccountNumber_Email(TestBaseProvider.getTestBase().getTestData().getString("acc_email"));
        pcod_logpage.enterPassword(TestBaseProvider.getTestBase().getTestData().getString("password"));
        PauseUtil.pause(1500);
    }

    @When("^Parent enters valid account number and password$")
    public void parent_enters_valid_account_number_and_password() throws Throwable {
        pcod_logpage.enterAccountNumber_Email(TestBaseProvider.getTestBase().getTestData().getString("acc_no"));
        pcod_logpage.enterPassword(TestBaseProvider.getTestBase().getTestData().getString("password"));
        PauseUtil.pause(1500);
    }

    @Given("^Parent login in with valid \\[username\\] and \\[password\\]$")
    public void parent_login_in_with_valid_username_and_password() throws Throwable {
        pcod_logpage.parent_login(pcod_logpage.getTxtUsername(), TestBaseProvider.getTestBase().getTestData().getString("acc_no"),
                TestBaseProvider.getTestBase().getTestData().getString("password"));
        PauseUtil.pause(1500);
    }
    
    @Given("^Parent login in with valid \\[username\\] and \\[password\\] and empties cart$")
    public void parent_login_in_with_valid_username_and_password_and_empties_cart() throws Throwable {
        pcod_logpage.parent_login2(pcod_logpage.getTxtUsername(), TestBaseProvider.getTestBase().getTestData().getString("acc_no"),
                TestBaseProvider.getTestBase().getTestData().getString("password"));
        PauseUtil.pause(1500);
    }
    
    @Given("^Parent(\\d+) login in with valid \\[username\\] and \\[password\\] and empties cart$")
    public void parent_login_in_with_valid_username_and_password_and_empties_cart(int arg1) throws Throwable {
        pcod_logpage.parent_login2(pcod_logpage.getTxtUsername(), TestBaseProvider.getTestBase().getTestData().getString("acc_no" + arg1),
                TestBaseProvider.getTestBase().getTestData().getString("password" + arg1));
        PauseUtil.pause(1500);
    }
    
    @Given("^Parent login in with valid \\[username\\] and \\[password\\] having multiple children$")
    public void parent_login_in_with_valid_username_and_password_having_multiple_children() throws Throwable {
        pcod_logpage.parent_login(pcod_logpage.getTxtUsername(), TestBaseProvider.getTestBase().getTestData().getString("acc_no"),
                TestBaseProvider.getTestBase().getTestData().getString("password"));
        PauseUtil.pause(1500);
    }

    @Given("^Parent login in with valid \\[username\\] and \\[password\\] having multiple children associated to same highest grade$")
    public void parent_login_in_with_valid_username_and_password_having_multiple_children_associated_to_same_highest_grade() throws Throwable {
        pcod_logpage.parent_login(pcod_logpage.getTxtUsername(), TestBaseProvider.getTestBase().getTestData().getString("acc_no"),
                TestBaseProvider.getTestBase().getTestData().getString("password"));
        PauseUtil.pause(1500);
    }

    @Given("^Parent logs into the application by providing valid credentials$")
    public void parent_logs_into_the_application_by_providing_valid_credentials() throws Throwable {
        pcod_logpage.parent_login(pcod_logpage.getTxtUsername(), TestBaseProvider.getTestBase().getTestData().getString("acc_no"),
                TestBaseProvider.getTestBase().getTestData().getString("password"));
    }

    @And("^Parent clicks on login button$")
    public void parent_clicks_on_login_button() throws Throwable {
        pcod_logpage.pcod_click_element(pcod_logpage.getbtnlogin());
    }

    @And("^parent clicks on “Connect to your Teacher” option$")
    public void parent_clicks_on_connect_to_your_teacher_option() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_connect_to_your_teacher();
    }

    @When("^parent clicks on Back$")
    public void parent_clicks_on_back() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_backbtn_connect_to_your_teacher();
    }

    @And("^clicks Next$")
    public void clicks_next() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_nextbtn_connect_to_your_teacher();
    }

    @When("^parent clicks on “Close \\(X\\)”$")
    public void parent_clicks_on_close_x() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_closeicon_connect_to_your_teacher();
    }

    @And("^parent clicks on “Find Your Teacher”$")
    public void parent_clicks_on_find_your_teacher() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_link_findyourteacher_connect_to_your_teacher();
    }

    @When("^parent clicks on “Can't Find Your Teacher” link$")
    public void parent_clicks_on_cant_find_your_teacher_link() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_link_cantfindyourteacher_connect_to_your_teacher();
    }

    @When("^parent clicks on Province dropdown$")
    public void parent_clicks_on_province_dropdown() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_drpdwn_province_connect_to_your_teacher();
    }

    @And("^parent clicks on Search$")
    public void parent_clicks_on_search() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_searchbtn_connect_to_your_teacher();
    }

    @When("^parent clicks on “New Search” link$")
    public void parent_clicks_on_new_search_link() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_newsearchbtn_connect_to_your_teacher();
    }

    @When("^parent selects a province$")
    public void parent_selects_a_province() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_select_province_connect_to_your_teacher(TestBaseProvider.getTestBase().getTestData());
    }

    @And("^clicks on City dropdown$")
    public void clicks_on_city_dropdown() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_drpdwn_city_connect_to_your_teacher();
    }

    @When("^parent selects a province and city$")
    public void parent_selects_a_province_and_city() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_select_province_connect_to_your_teacher(TestBaseProvider.getTestBase().getTestData());
        loginPg.pcod_select_city_connect_to_your_teacher(TestBaseProvider.getTestBase().getTestData());
    }

    @When("^parent clicks on “Select Teacher” dropdown$")
    public void parent_clicks_on_select_teacher_dropdown() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_drpdwn_selectteacher_connect_to_your_teacher();
    }

    @When("^parent selects a school$")
    public void parent_selects_a_school() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_select_school_connect_to_your_teacher(TestBaseProvider.getTestBase().getTestData());
    }

    @And("^parent selects a school with no teachers$")
    public void parent_selects_a_school_with_no_teachers() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_select_school_connect_to_your_teacher(TestBaseProvider.getTestBase().getTestData());
    }

    @When("^parent tries to give spaces in CAC text field$")
    public void parent_tries_to_give_spaces_in_cac_text_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.enterCACtNumber(TestBaseProvider.getTestBase().getTestData().getString("cac_space"));
    }

    @When("^CAC text field is left blank$")
    public void cac_text_field_is_left_blank() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.enterCACtNumber(TestBaseProvider.getTestBase().getTestData().getString("cac_blank"));
    }

    @When("^parent tries to enter special characters in CAC text field$")
    public void parent_tries_to_enter_special_characters_in_cac_text_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.enterCACtNumber(TestBaseProvider.getTestBase().getTestData().getString("cac_no"));
    }

    @When("^parent enters incorrect CAC in text field$")
    public void parent_enters_incorrect_cac_in_text_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.enterCACtNumber(TestBaseProvider.getTestBase().getTestData().getString("cac_no"));
    }

    @When("^parent enters 5 characters in CAC text field$")
    public void parent_enters_5_characters_in_cac_text_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.enterCACtNumber(TestBaseProvider.getTestBase().getTestData().getString("cac_no"));
    }


    @When("^parent enters a valid CAC code$")
    public void parent_enters_a_valid_cac_code() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.enterCACtNumber(TestBaseProvider.getTestBase().getTestData().getString("cac_no"));
    }

    @When("^parent enter valid postal code as combination of lower case and upper case with space after 3 characters$")
    public void parent_enter_valid_postal_code_as_combination_of_lower_case_and_upper_case_with_space_after_3_characters() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterpostalcode_connecttoteacher(TestBaseProvider.getTestBase().getTestData().getString("postalcode"));
    }

    @When("^parent enter valid postal code as lower case with space after 3 characters$")
    public void parent_enter_valid_postal_code_as_lower_case_with_space_after_3_characters() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterpostalcode_connecttoteacher(TestBaseProvider.getTestBase().getTestData().getString("postalcode"));
    }


    @When("^parent enter postal code with 7 characters with no space and tab out$")
    public void parent_enter_postal_code_with_7_characters_with_no_space_and_tab_out() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterpostalcode_tabout_connecttoteacher(TestBaseProvider.getTestBase().getTestData().getString("postalcode"));
    }

    @When("^parent enter postal code with less than 6 characters and tab out$")
    public void parent_enter_postal_code_with_less_than_6_characters_and_tab_out() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterpostalcode_tabout_connecttoteacher(TestBaseProvider.getTestBase().getTestData().getString("postalcode"));
    }

    @When("^parent enters postal code with no schools registered with scholastic$")
    public void parent_enters_postal_code_with_no_schools_registered_with_scholastic() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterpostalcode_connecttoteacher(TestBaseProvider.getTestBase().getTestData().getString("postalcode"));
    }

    @When("^parent enters postal code with inactive school$")
    public void parent_enters_postal_code_with_inactive_school() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterpostalcode_connecttoteacher(TestBaseProvider.getTestBase().getTestData().getString("postalcode"));
    }


    @And("^parent enters valid postal code$")
    public void parent_enters_valid_postal_code() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterpostalcode_connecttoteacher(TestBaseProvider.getTestBase().getTestData().getString("postalcode"));
    }

    @When("^Parent enters more than 30 characters in First name field$")
    public void parent_enters_more_than_30_characters_in_first_name_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterfirstname_createaccount(TestBaseProvider.getTestBase().getTestData().getString("firstname"));
    }

    @When("^Parent enters more than 30 characters in First name field on Add a Child modal$")
    public void parent_enters_more_than_30_characters_in_first_name_field_on_add_a_child_modal() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterfirstname_addachild(TestBaseProvider.getTestBase().getTestData().getString("child_firstname"));
    }

    @When("^Parent enters more than 50 characters in First name field on Add a Child modal$")
    public void parent_enters_more_than_50_characters_in_first_name_field_on_add_a_child_modal() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterfirstname_addachild(TestBaseProvider.getTestBase().getTestData().getString("child_firstname"));
    }

    @When("^Parent enters more than 50 characters in Last name field on Add a Child modal$")
    public void parent_enters_more_than_50_characters_in_last_name_field_on_add_a_child_modal() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterfirstname_addachild(TestBaseProvider.getTestBase().getTestData().getString("child_lastname"));
    }

    @When("^Parent enters only 1 character in Last name field on Add a Child modal$")
    public void parent_enters_only_1_character_in_last_name_field_on_add_a_child_modal() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterlastname_addachild(TestBaseProvider.getTestBase().getTestData().getString("child_lastname"));
    }

    @When("^Parent enters 2 or more character in Last name field on Add a Child modal$")
    public void parent_enters_2_or_more_character_in_last_name_field_on_add_a_child_modal() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_entervalue_textfield(pcod_logpage.gettxtaddachildlastname(),
                TestBaseProvider.getTestBase().getTestData().getString("child_lastname"));
        login.pcod_tabout_presentfield(pcod_logpage.gettxtaddachildlastname());
    }

    @When("^Parent enters valid data in all fields and does not enter data in Child's First Name$")
    public void parent_enters_valid_data_in_all_fields_and_does_not_enter_data_in_childs_first_name() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteralldata_addachild(
                TestBaseProvider.getTestBase().getTestData().getString("child_firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("child_lastname"));
    }

    @When("^Parent enters valid data in all the fields and does not enter data in Child's First Name$")
    public void parent_enters_valid_data_in_all_the_fields_and_does_not_enter_data_in_childs_first_name() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteralldata_addachild_homepage(
                TestBaseProvider.getTestBase().getTestData().getString("child_firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("child_lastname"),
                TestBaseProvider.getTestBase().getTestData().getString("cacno"));
    }


    @When("^Parent enters valid data in all fields and does not enter data in Child's Last Name$")
    public void parent_enters_valid_data_in_all_fields_and_does_not_enter_data_in_childs_last_name() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteralldata_addachild(
                TestBaseProvider.getTestBase().getTestData().getString("child_firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("child_lastname"));
    }


    @When("^Parent enters valid data in all the fields and does not enter data in Child's Last Name$")
    public void parent_enters_valid_data_in_all_the_fields_and_does_not_enter_data_in_childs_last_name() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteralldata_addachild_homepage(
                TestBaseProvider.getTestBase().getTestData().getString("child_firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("child_lastname"),
                TestBaseProvider.getTestBase().getTestData().getString("cacno"));
    }
    
    
    @When("^Parent enters data in all the fields and without entering Child's Last Name$")
    public void Parent_enters_data_in_all_the_fields_and_without_entering_Childs_Last_Name() throws Throwable {
    	 PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
         login.pcod_enteralldata_addachild_homepage_child_lastname_blank(
                 TestBaseProvider.getTestBase().getTestData().getString("child_firstname"),
                 TestBaseProvider.getTestBase().getTestData().getString("child_lastname"),
                 TestBaseProvider.getTestBase().getTestData().getString("cacno"));
    }

    @When("^Parent enters valid data in all fields in Add a Child window$")
    public void parent_enters_valid_data_in_all_fields_in_add_a_child_window() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteralldata_addachild(
                TestBaseProvider.getTestBase().getTestData().getString("child_firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("child_lastname"));
    }


    @When("^Parent enters valid data in all fields and does not select a grade$")
    public void parent_enters_valid_data_in_all_fields_and_does_not_select_a_grade() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteralldata_except_grade_addachild(
                TestBaseProvider.getTestBase().getTestData().getString("child_firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("child_lastname"));
    }

    @When("^Parent enters valid first name and last name in “Add a Child” modal window$")
    public void parent_enters_valid_first_name_and_last_name_in_add_a_child_modal_window() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteralldata_except_grade_addachild(
                TestBaseProvider.getTestBase().getTestData().getString("child_firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("child_lastname"));
    }

    @When("^Parent enters valid data in all fields and does not select Birthdate$")
    public void parent_enters_valid_data_in_all_fields_and_does_not_select_birthdate() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteralldata_except_birthdetails_addachild(
                TestBaseProvider.getTestBase().getTestData().getString("child_firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("child_lastname"));
    }

    @When("^Parent enters valid data in all fields and does not select either Month or Year in Birthdate$")
    public void parent_enters_valid_data_in_all_fields_and_does_not_select_either_month_or_year_in_birthdate() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteralldata_partial_birthdetails_addachild(
                TestBaseProvider.getTestBase().getTestData().getString("child_firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("child_lastname"));
    }


    @When("^Parent enters valid data in all fields and does not enter CAC in CONNECT TO A TEACHER text field$")
    public void parent_enters_valid_data_in_all_fields_and_does_not_enter_cac_in_connect_to_a_teacher_text_field() throws Throwable {
        pcod_logpage.pcod_enteralldata_addachild_homepage(
                TestBaseProvider.getTestBase().getTestData().getString("child_firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("child_lastname"),
                TestBaseProvider.getTestBase().getTestData().getString("cacno"));
    }

    @When("^Parent enters valid data in all fields except CAC in CONNECT TO A TEACHER text field$")
    public void parent_enters_valid_data_in_all_fields_except_cac_in_connect_to_a_teacher_text_field() throws Throwable {
        pcod_logpage.pcod_enteralldata_addachild_homepage(
                TestBaseProvider.getTestBase().getTestData().getString("child_firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("child_lastname"),
                TestBaseProvider.getTestBase().getTestData().getString("cacno"));
    }

    @And("^Parent enters valid data in all fields in Add a Child window from home page$")
    public void parent_enters_valid_data_in_all_fields_in_add_a_child_window_from_home_page() throws Throwable {
        pcod_logpage.pcod_enteralldata_addachild_homepage(
                TestBaseProvider.getTestBase().getTestData().getString("child_firstname") + System.currentTimeMillis(),
                TestBaseProvider.getTestBase().getTestData().getString("child_lastname"),
                TestBaseProvider.getTestBase().getTestData().getString("cacno"));
    }

    @And("^Parent enters valid data in all fields in Add a Child window from home page1$")
    public void parent_enters_valid_data_in_all_fields_in_add_a_child_window_from_home_page1() throws Throwable {
        pcod_logpage.pcod_enteralldata_addachild_homepage1(
                TestBaseProvider.getTestBase().getTestData().getString("child_firstname") + System.currentTimeMillis(),
                TestBaseProvider.getTestBase().getTestData().getString("child_lastname"),
                TestBaseProvider.getTestBase().getTestData().getString("cacno"));
    }

    @And("^tabout from last name field or click on some other fields$")
    public void tabout_from_last_name_field_or_click_on_some_other_fields() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        PCOD_LoginPage pcod_logpage = new PCOD_LoginPage();
        login.pcod_tabout_presentfield(pcod_logpage.gettxtaddachildlastname());
    }


    @When("^Parent enters more than 30 characters in Last name field$")
    public void parent_enters_more_than_30_characters_in_last_name_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterlastname_createaccount(TestBaseProvider.getTestBase().getTestData().getString("lastname"));
    }

    @When("^Parent enters any special character other than “'” in First Name field$")
    public void parent_enters_any_special_character_other_than_in_first_name_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterfirstname_createaccount(TestBaseProvider.getTestBase().getTestData().getString("firstname"));
    }

    @When("^Parent enters any special character other than “'” in Last Name field$")
    public void parent_enters_any_special_character_other_than_in_last_name_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterlastname_createaccount(TestBaseProvider.getTestBase().getTestData().getString("lastname"));
    }

    @When("^Parent enters only one character in first name field$")
    public void parent_enters_only_one_character_in_first_name_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterfirstname_createaccount(TestBaseProvider.getTestBase().getTestData().getString("firstname"));
    }

    @When("^Parent enters only one character in Last name field$")
    public void parent_enters_only_one_character_in_last_name_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterlastname_createaccount(TestBaseProvider.getTestBase().getTestData().getString("lastname"));
    }

    @When("^Parent enters two characters in first name field$")
    public void parent_enters_two_characters_in_first_name_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterfirstname_createaccount(TestBaseProvider.getTestBase().getTestData().getString("firstname"));
    }

    @When("^Parent enters two characters in Last name field$")
    public void parent_enters_two_characters_in_last_name_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterlastname_createaccount(TestBaseProvider.getTestBase().getTestData().getString("lastname"));
    }

    @When("^Parent enters valid data in all fields except First Name field$")
    public void parent_enters_valid_data_in_all_fields_except_first_name_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteralldata_createaccount(
                TestBaseProvider.getTestBase().getTestData().getString("firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("lastname"),
                TestBaseProvider.getTestBase().getTestData().getString("email"),
                TestBaseProvider.getTestBase().getTestData().getString("password"),
                TestBaseProvider.getTestBase().getTestData().getString("mobnumber"));
    }

    @When("^Parent enters valid data in all fields and selects both Terms and Privacy Policy$")
    public void parent_enters_valid_data_in_all_fields_and_selects_both_terms_and_privacy_policy() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteralldata_createaccount(
                TestBaseProvider.getTestBase().getTestData().getString("firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("lastname"),
                TestBaseProvider.getTestBase().getTestData().getString("email"),
                TestBaseProvider.getTestBase().getTestData().getString("password"),
                TestBaseProvider.getTestBase().getTestData().getString("mobnumber"));
    }

    @When("^Parent enters valid data in all fields and does not accept communications about special offers$")
    public void parent_enters_valid_data_in_all_fields_and_does_not_accept_communications_about_special_offers() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteralldata_createaccount(
                TestBaseProvider.getTestBase().getTestData().getString("firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("lastname"),
                TestBaseProvider.getTestBase().getTestData().getString("email"),
                TestBaseProvider.getTestBase().getTestData().getString("password"),
                TestBaseProvider.getTestBase().getTestData().getString("mobnumber"));
    }

    @When("^Parent enters valid data in all fields$")
    public void parent_enters_valid_data_in_all_fields() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteralldata_createaccount(
                TestBaseProvider.getTestBase().getTestData().getString("firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("lastname"),
                TestBaseProvider.getTestBase().getTestData().getString("email"),
                TestBaseProvider.getTestBase().getTestData().getString("password"),
                TestBaseProvider.getTestBase().getTestData().getString("mobnumber"));
    }


    @And("^parent creates an account and navigates to Add a Child window$")
    public void parent_creates_an_account_and_navigates_to_add_a_child_window() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        String email = TestBaseProvider.getTestBase().getTestData().getString("email") + System.currentTimeMillis() + "@abc.com";
        login.pcod_enteralldata_createaccount(
                TestBaseProvider.getTestBase().getTestData().getString("firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("lastname"), email,
                TestBaseProvider.getTestBase().getTestData().getString("password"),
                TestBaseProvider.getTestBase().getTestData().getString("mobnumber"));

        login.click_continuebtn_createaccount();

    }
    
    @And("^parent creates an account with one child$")
    public void parent_creates_an_account_with_one_child() throws Throwable {
        pcod_logpage.parent_create_account_one_child();
    }
    
    @And("^parent(\\d+) creates an account with one child$")
    public void parent_creates_an_account_with_one_child(int arg1) throws Throwable {
        pcod_logpage.specific_parent_create_account_one_child(arg1);
    }
    
    @And("^parent creates an account with two childs$")
    public void parent_creates_an_account_with_two_childs() throws Throwable {
    	pcod_logpage.parent_create_account_two_childs();
    }
    
    @And("^parent creates an account with two childs and two teachers$")
    public void parent_creates_an_account_with_two_childs_and_two_teachers() throws Throwable {
    	pcod_logpage.parent_create_account_two_childs_two_teachers();
    }

    @When("^Parent enters valid data in all fields except Last Name field$")
    public void parent_enters_valid_data_in_all_fields_except_last_name_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteralldata_createaccount(
                TestBaseProvider.getTestBase().getTestData().getString("firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("lastname"),
                TestBaseProvider.getTestBase().getTestData().getString("email"),
                TestBaseProvider.getTestBase().getTestData().getString("password"),
                TestBaseProvider.getTestBase().getTestData().getString("mobnumber"));
    }


    @When("^Parent enters valid data in all fields except Email$")
    public void parent_enters_valid_data_in_all_fields_except_email() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteralldata_createaccount(TestBaseProvider.getTestBase().getTestData().getString("firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("lastname"),
                TestBaseProvider.getTestBase().getTestData().getString("email"),
                TestBaseProvider.getTestBase().getTestData().getString("password"),
                TestBaseProvider.getTestBase().getTestData().getString("mobnumber"));
    }


    @When("^Parent enters valid data in all fields except password$")
    public void parent_enters_valid_data_in_all_fields_except_password() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteralldata_createaccount(
                TestBaseProvider.getTestBase().getTestData().getString("firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("lastname"),
                TestBaseProvider.getTestBase().getTestData().getString("email"),
                TestBaseProvider.getTestBase().getTestData().getString("password"),
                TestBaseProvider.getTestBase().getTestData().getString("mobnumber"));
    }


    @When("^Parent enters valid data in all fields except phone number$")
    public void parent_enters_valid_data_in_all_fields_except_phone_number() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteralldata_exceptphonenumber_createaccount(
                TestBaseProvider.getTestBase().getTestData().getString("firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("lastname"),
                TestBaseProvider.getTestBase().getTestData().getString("email"),
                TestBaseProvider.getTestBase().getTestData().getString("password"));
    }

    @And("^Parent enters valid data in all fields except selecting the language preference$")
    public void parent_enters_valid_data_in_all_fields_except_selecting_the_language_preference() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteralldata_langunselect_createaccount(
                TestBaseProvider.getTestBase().getTestData().getString("firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("lastname"),
                TestBaseProvider.getTestBase().getTestData().getString("email"),
                TestBaseProvider.getTestBase().getTestData().getString("password"),
                TestBaseProvider.getTestBase().getTestData().getString("mobnumber"));
    }

    @And("^Parent enters valid data in all fields except selecting the Terms and Privacy Policy$")
    public void parent_enters_valid_data_in_all_fields_except_selecting_the_terms_and_privacy_policy() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteralldata_except_termspolicy_createaccount(
                TestBaseProvider.getTestBase().getTestData().getString("firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("lastname"),
                TestBaseProvider.getTestBase().getTestData().getString("email"),
                TestBaseProvider.getTestBase().getTestData().getString("password"),
                TestBaseProvider.getTestBase().getTestData().getString("mobnumber"));
    }


    @When("^Parent enters valid email without domain$")
    public void parent_enters_valid_email_without_domain() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteremail_createaccount(TestBaseProvider.getTestBase().getTestData().getString("email"));
    }

    @When("^Parent enters valid email without dot$")
    public void parent_enters_valid_email_without_dot() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteremail_createaccount(TestBaseProvider.getTestBase().getTestData().getString("email"));
    }

    @When("^Parent enters valid email without top level domain$")
    public void parent_enters_valid_email_without_top_level_domain() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteremail_createaccount(TestBaseProvider.getTestBase().getTestData().getString("email"));
    }


    @When("^Parent enters valid email with multiple “@” sign$")
    public void parent_enters_valid_email_with_multiple_sign() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteremail_createaccount(TestBaseProvider.getTestBase().getTestData().getString("email"));
    }

    @When("^Parent enters valid email with multiple dots$")
    public void parent_enters_valid_email_with_multiple_dots() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteremail_createaccount(TestBaseProvider.getTestBase().getTestData().getString("email"));
    }

    @When("^Parent enters password with less than 7 characters$")
    public void parent_enters_password_with_less_than_7_characters() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterpassword_createaccount(TestBaseProvider.getTestBase().getTestData().getString("password"));
    }

    @When("^Parent enters password more than 7 characters but without combination of letters and numbers$")
    public void parent_enters_password_more_than_7_characters_but_without_combination_of_letters_and_numbers() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterpassword_createaccount(TestBaseProvider.getTestBase().getTestData().getString("password"));
    }

    @When("^Parent enters valid password in the password field$")
    public void parent_enters_valid_password_in_the_password_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterpassword_createaccount(TestBaseProvider.getTestBase().getTestData().getString("password"));
    }

    @When("^Parent enters incorrect format of phone number$")
    public void parent_enters_incorrect_format_of_phone_number() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterphonenumber_createaccount(TestBaseProvider.getTestBase().getTestData().getString("mobnumber"));
    }


    @Then("^the password is accepted$")
    public void the_password_is_accepted() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_verify_correct_password_createaccount();
    }

    @When("^Parent clicks inside first name field and does not enter any data$")
    public void parent_clicks_inside_first_name_field_and_does_not_enter_any_data() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterfirstname_createaccount(TestBaseProvider.getTestBase().getTestData().getString("firstname"));
    }

    @When("^Parent clicks inside Last name field and does not enter any data$")
    public void parent_clicks_inside_last_name_field_and_does_not_enter_any_data() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterlastname_createaccount(TestBaseProvider.getTestBase().getTestData().getString("lastname"));
    }

    @And("^clicks inside Last Name field$")
    public void clicks_inside_last_name_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_clickslastname_createaccount();
    }

    @And("^clicks inside Email field$")
    public void clicks_inside_email_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_clicksemail_createaccount();
    }

    @And("^clicks outside or inside last name field$")
    public void clicks_outside_or_inside_last_name_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_clickslastname_createaccount();
    }


    @And("^clicks outside or inside Email field$")
    public void clicks_outside_or_inside_email_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_clicksemail_createaccount();
    }

    @And("^clicks outside or inside phone number field$")
    public void clicks_outside_or_inside_phone_number_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_clicksphonenumber_createaccount();
    }

    @And("^clicks outside or inside password field$")
    public void clicks_outside_or_inside_password_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_clickspassword_createaccount();
    }

    @Then("^any characters entered after 30 characters are ignored$")
    public void any_characters_entered_after_30_characters_are_ignored() throws Throwable {

    	pcod_logpage.verify_field_size(pcod_homepage.getOnlineNotesModalNameField(),
                TestBaseProvider.getTestBase().getTestData().getString("exp_firstnamesize"), "Online Note modal name field");
    }

    @Then("^any characters entered after 50 characters are ignored$")
    public void any_characters_entered_after_50_characters_are_ignored() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_addachild_firstname_size(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^any characters entered after 50 characters are ignored for last name field$")
    public void any_characters_entered_after_50_characters_are_ignored_for_last_name_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_addachild_lastname_size(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^any characters entered after 30 characters are ignored for last name field$")
    public void any_characters_entered_after_30_characters_are_ignored_for_last_name_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_createaccount_lastname_size(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^the special characters are ignored$")
    public void the_special_characters_are_ignored() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_createaccount_firstname(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^the special characters are ignored for last name field$")
    public void the_special_characters_are_ignored_for_last_name_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_createaccount_lastname(TestBaseProvider.getTestBase().getTestData());
    }

    @And("^parent searches with a valid postal code$")
    public void parent_searches_with_a_valid_postal_code() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enterpostalcode_connecttoteacher(TestBaseProvider.getTestBase().getTestData().getString("postalcode"));
        login.pcod_searchbtn_connect_to_your_teacher();
    }

    @When("^parent tries to enter more than 5 characters in CAC text field$")
    public void parent_tries_to_enter_more_than_5_characters_in_cac_text_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.enterCACtNumber(TestBaseProvider.getTestBase().getTestData().getString("cac_no"));
    }


    @Then("^CAC text field will not allow any spaces$")
    public void cac_text_field_will_not_allow_any_spaces() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_connecttoteacher_cacfield(TestBaseProvider.getTestBase().getTestData());
    }

   /* @Then("^postal code field is auto\\-formatted to correct format$")
    public void postal_code_field_is_autoformatted_to_correct_format() throws Throwable {
    	PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
    	login.verify_connecttoteacher_postalcode_autoformatted(TestBaseProvider.getTestBase().getTestData());
    }*/

    @Then("^CAC text field will not take more than 5 characters$")
    public void cac_text_field_will_not_take_more_than_5_characters() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_connecttoteacher_cacfield(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^CAC text field will not allow special characters$")
    public void cac_text_field_will_not_allow_special_characters() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_connecttoteacher_cacfield(TestBaseProvider.getTestBase().getTestData());
    }

    @When("^parent enters enters less than 5 characters in CAC text field$")
    public void parent_enters_enters_less_than_5_characters_in_cac_text_field() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.enterCACtNumber(TestBaseProvider.getTestBase().getTestData().getString("cac_no"));
    }

    @When("^parent clicks “What's this\\?” hyperlink$")
    public void parent_clicks_whats_this_hyperlink() throws Throwable {
        pcod_logpage.pcod_click_element(pcod_logpage.getlnkconnectyourteacherwhatsthis());

    }


    @Then("^“Your Class Code is the five\\-digit unique code that, once entered, will automatically connect you to your child's teacher for the remainder of the school year\\. This code may have been distributed by the teacher via email, letter, or written on the cover of a student flyer\\.” should be seen$")
    public void your_class_code_is_the_fivedigit_unique_code_that_once_entered_will_automatically_connect_you_to_your_childs_teacher_for_the_remainder_of_the_school_year_this_code_may_have_been_distributed_by_the_teacher_via_email_letter_or_written_on_the_cover_of_a_student_flyer_should_be_seen() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_tooltip_whatsthis_connecttoteacher();
    }

    @Then("^“Please make sure you entered the correct class code\\. If you don't have correct code , contact your child's teacher\\.” should be seen$")
    public void please_make_sure_you_entered_the_correct_class_code_if_you_dont_have_correct_code_contact_your_childs_teacher_should_be_seen() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_tooltip_incorrectcac_connecttoteacher();
    }


    @Then("^Connect button should be disabled$")
    public void connect_button_should_be_disabled() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_connectbtn_connecttoteacher_disabled();
    }

    @Then("^Continue button is disabled$")
    public void continue_button_is_disabled() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_continuebtn_createaccount_disabled();
    }

    @Then("^ADD button is not enabled$")
    public void add_button_is_not_enabled() throws Throwable {
        pcod_logpage.verify_button_disabled(pcod_logpage.sizebtnaddaddachilddisabled());
    }

    @Then("^ADD button is enabled$")
    public void add_button_is_enabled() throws Throwable {
        pcod_logpage.verify_button_enabled(pcod_logpage.sizebtnaddaddachilddisabled());
    }

    @And("^clicks on ADD$")
    public void clicks_on_add() throws Throwable {
        pcod_logpage.pcod_click_element(pcod_logpage.getbtnaddachildadd());
    }

    @Then("^Continue button is still disabled$")
    public void continue_button_is_still_disabled() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_continuebtn_createaccount_disabled();
    }

    @Then("^Continue button is enabled as this is an optional field$")
    public void continue_button_is_enabled_as_this_is_an_optional_field() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_continuebtn_createaccount_enabled();
    }

    @And("^Search button is still disabled$")
    public void search_button_is_still_disabled() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_searchbtn_connecttoteacher_disabled();
    }

    @Then("^Search button is enabled$")
    public void search_button_is_enabled() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_searchbtn_connecttoteacher_enabled();
    }


    @Then("^Connect button should be enabled$")
    public void connect_button_should_be_enabled() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_connectbtn_connecttoteacher_enabled();
    }


    @And("^click on connect button$")
    public void click_on_connect_button() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.click_connectbtn_connecttoteacher();
    }

    @And("^clicks on Continue button$")
    public void clicks_on_continue_button() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.click_continuebtn_createaccount();
    }

    @And("^parent clicks on Connect button$")
    public void parent_clicks_on_connect_button() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.click_connectbtn_connecttoteacher();
    }


    @Then("^all the provinces are listed in the dropdown$")
    public void all_the_provinces_are_listed_in_the_dropdown() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_all_provinces_connectyourteacher();
    }

    @Then("^selected school address displays with School name, street, City, province, postal code$")
    public void selected_school_address_displays_with_school_name_street_city_province_postal_code() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_schooldetails_connectyourteacher(pcod_logpage.getschooldetails_ConnectYourTeacher(),
                TestBaseProvider.getTestBase().getTestData());
    }

    @And("^school location with school city, province and postal code displays$")
    public void school_location_with_school_city_province_and_postal_code_displays() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_schooldetails1_connectyourteacher(TestBaseProvider.getTestBase().getTestData());
    }

    @And("^correct school name associated to the CAC displays$")
    public void correct_school_name_associated_to_the_cac_displays() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_schoolname_connectyourteacher(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^correct teacher's name associated to the CAC displays$")
    public void correct_teachers_name_associated_to_the_cac_displays() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_teachername_connectyourteacher(pcod_logpage.getschooldetails_ConnectYourTeacher(),
                TestBaseProvider.getTestBase().getTestData());
    }


    @Then("^all cities related to the selected province are listed in city dropdown$")
    public void all_cities_related_to_the_selected_province_are_listed_in_city_dropdown() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_all_cities_connectyourteacher();
    }

    @Then("^parent is taken back to Connect to Teacher workflow with option to enter CAC code$")
    public void parent_is_taken_back_to_connect_to_teacher_workflow_with_option_to_enter_cac_code() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_verify_connect_to_your_teacher_model_windowstep0();
    }

    @Then("^Step1 of Find Your Teacher with School search displays$")
    public void step1_of_find_your_teacher_with_school_search_displays() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_verify_connect_to_your_teacher_model_windowstep1();
    }

    @Then("^Step 1 displays with option to enter the CAC code$")
    public void step_1_displays_with_option_to_enter_the_cac_code() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_verify_connect_to_your_teacher_model_windowstep0();
    }

    @Then("^Find Your Teacher Step 2 with school selection should display$")
    public void find_your_teacher_step_2_with_school_selection_should_display() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_verify_connect_to_your_teacher_model_windowstep2();
    }

    @Then("^Connect to Your Teacher modal closes and the entered information is not saved$")
    public void connect_to_your_teacher_modal_closes_and_the_entered_information_is_not_saved() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_verify_connect_to_your_teacher_model_window_notpresent();
    }

    /*@Then("^“Please enter a valid postal code\\.” should display$")
    public void please_enter_a_valid_postal_code_should_display() throws Throwable {
    	PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
		loginPg.pcod_verify_validationMsg_Invalidpostalcode_connect_to_your_teacher();
    }*/

    @Then("^postal code field is displayed with place holder as “Enter School Postal Code”$")
    public void postal_code_field_is_displayed_with_place_holder_as_enter_school_postal_code() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_placeholder_postalcode(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^“Sorry, we cannot locate your school\\. Please search again\\.” message displays$")
    public void sorry_we_cannot_locate_your_school_please_search_again_message_displays() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_verify_validationMsg_postalcode_notassociatedtoschool_connect_to_your_teacher();
    }

    @Then("^tool tip message “At this time, there are no teachers at the selected school who are accepting Scholastic Reading Club online orders\\. Encourage your child's teacher to participate in Reading Club \\- it's a great way to build reading excitement and get books and resources for the classroom!” displays$")
    public void tool_tip_message_at_this_time_there_are_no_teachers_at_the_selected_school_who_are_accepting_scholastic_reading_club_online_orders_encourage_your_childs_teacher_to_participate_in_reading_club_its_a_great_way_to_build_reading_excitement_and_get_books_and_resources_for_the_classroom_displays() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_verify_validationMsg_noteacher_selectedschool_connect_to_your_teacher();
    }
    
    
    @Then("^tool tip message to validate no teacher registered for the selected school$")
    public void pcod_verify_validationMsg_no_teacher_registered() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_verify_validationMsg_no_teacher_registered();
    }
    

    @And("^YES button is enabled by default$")
    public void yes_button_is_enabled_by_default() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_Yesbtn_connecttoteacher_enabled();
    }

    @When("^parent clicks on “No” for “Is this your classroom teacher”$")
    public void parent_clicks_on_no_for_is_this_your_classroom_teacher() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.click_Nobtn_connecttoteacher();
    }


    @When("^parent clicks on “This is not my teacher”$")
    public void parent_clicks_on_this_is_not_my_teacher() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.click_thisisnotmyteacherlink_connecttoteacher();
    }


    @When("^parent clicks on “Create an Account”$")
    public void parent_clicks_on_create_an_account() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.click_createanaccount_connecttoteacher();
    }

    @And("^parent clicks on “Create an Account” button$")
    public void parent_clicks_on_create_an_account_button() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.click_createanaccount_connecttoteacher();
    }

    @And("^parent clicks on Hide link$")
    public void parent_clicks_on_hide_link() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.click_hidelink_createanaccount();
    }

    @When("^parent clicks on Show link$")
    public void parent_clicks_on_show_link() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.click_showlink_createanaccount();
    }

    @And("^parent clicks on Hide next to password field$")
    public void parent_clicks_on_hide_next_to_password_field() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.click_hidelink_createanaccount();
    }

    @When("^Parent selects Language Preference as English or French$")
    public void parent_selects_language_preference_as_english_or_french() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.select_language_createanaccount();
    }

    @When("^Parent selects either Terms or Policy$")
    public void parent_selects_either_terms_or_policy() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.select_terms_createanaccount();
    }

    @Then("^YOUR TEACHER'S NAME field displays with a text box$")
    public void your_teachers_name_field_displays_with_a_text_box() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_yourteachername_textfield_connecttoteacher_present();
    }

    @Then("^Create an Account modal displays$")
    public void create_an_account_modal_displays() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_createanaccount_window_connecttoteacher();
    }


    @Then("^First Name field is highlighted in Yellow bordered with red$")
    public void first_name_field_is_highlighted_in_yellow_bordered_with_red() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_createaccount_firstname_emptyfield();
    }

    @Then("^Last Name field is highlighted in Yellow bordered with red$")
    public void last_name_field_is_highlighted_in_yellow_bordered_with_red() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_createaccount_lastname_emptyfield();
    }

    @And("^email field is highlighted and bordered in red$")
    public void email_field_is_highlighted_and_bordered_in_red() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_createaccount_email_empty_incorrect_highlighted();
    }

    @And("^the box is highlighted and bordered in red$")
    public void the_box_is_highlighted_and_bordered_in_red() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_createaccount_password_empty_incorrect_highlighted();
    }

    @And("^account number\\/email field is highlighted in yellow$")
    public void account_numberemail_field_is_highlighted_in_yellow() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        PCOD_LoginPage pcod_logpage = new PCOD_LoginPage();
        login.verify_username_incorrect_highlighted(pcod_logpage.getTxtUsername());
    }

    @And("^the field is highlighted in yellow and bordered in red$")
    public void the_field_is_highlighted_in_yellow_and_bordered_in_red() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        PCOD_LoginPage pcod_logpage = new PCOD_LoginPage();
        login.verify_field_incorrect_highlighted(pcod_logpage.gettxtaddachildlastname());
    }

    @And("^the email address and password field is highlighted in yellow$")
    public void the_email_address_and_password_field_is_highlighted_in_yellow() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        PCOD_LoginPage pcod_logpage = new PCOD_LoginPage();
        login.verify_username_incorrect_highlighted(pcod_logpage.getTxtUsername());
        login.verify_password_incorrect_highlighted(pcod_logpage.getTxtPassword());
    }

    @And("^email address field is highlighted in yellow$")
    public void email_address_field_is_highlighted_in_yellow() throws Throwable {
        pcod_logpage.verify_username_incorrect_highlighted(pcod_logpage.getTxtUsername());
    }

    @And("^the password field is highlighted in yellow$")
    public void the_password_field_is_highlighted_in_yellow() throws Throwable {
        pcod_logpage.verify_password_incorrect_highlighted(pcod_logpage.getTxtPassword());
    }

    @And("^phone number field is highlighted and bordered in red$")
    public void phone_number_field_is_highlighted_and_bordered_in_red() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_createaccount_phonenumber_empty_incorrect_highlighted();
    }


    @And("^the field is not highlighted$")
    public void the_field_is_not_highlighted() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_createaccount_firstname_NotHighlighted();
    }

    @And("^last name field is not highlighted$")
    public void last_name_field_is_not_highlighted() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_value_entered_NotHighlighted(pcod_logpage.gettxtaddachildlastname(),
                pcod_logpage.sizeaddachildlastnameerror(), "last name");
    }

    @And("^no error message displays and field is not highlighted$")
    public void no_error_message_displays_and_field_is_not_highlighted() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();

        login.verify_value_entered_NotHighlighted(pcod_logpage.gettxtaddachildlastname(),
                pcod_logpage.sizeaddachildlastnameerror(), "last value");
    }


    @Then("^First Name field is saved with the data$")
    public void first_name_field_is_saved_with_the_data() throws Throwable {
        /*PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_createaccount_firstname_saved(TestBaseProvider.getTestBase().getTestData());*/
    	ILoginPage login = getFactory().getILoginPage();
    	login.verify_create_account_firstname_is_saved();
    }

    @Then("^password is shown by default$")
    public void password_is_shown_by_default() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_createaccount_password_showdefault(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^the password is hidden and '\\.'s are displayed$")
    public void the_password_is_hidden_and_s_are_displayed() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_createaccount_password_hidden();
    }

    @Then("^the entered characters in password is shown$")
    public void the_entered_characters_in_password_is_shown() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_createaccount_password_shown();
    }

    @Then("^Last Name field is saved with the data$")
    public void last_name_field_is_saved_with_the_data() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_createaccount_lastname_saved(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^last name is accepted$")
    public void last_name_is_accepted() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.verify_value_entered_issaved(pcod_logpage.gettxtaddachildlastname(),
                TestBaseProvider.getTestBase().getTestData().getString("child_lastname"), "last name");
    }

    @And("^no error message displays$")
    public void no_error_message_displays() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_verify_validationMsg_firstname_lastname_createaccount_notpresent();
    }


    @And("^tool tip message “Please enter a valid name\\. Must contain at least two characters\\.” displays$")
    public void tool_tip_message_please_enter_a_valid_name_must_contain_at_least_two_characters_displays() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_verify_validationMsg_firstname_lastname_createaccount();
    }

    @And("^tool tip error message “Please make sure your password has at least 7 characters and contains both letters and numbers\\.” displays$")
    public void tool_tip_error_message_please_make_sure_your_password_has_at_least_7_characters_and_contains_both_letters_and_numbers_displays() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_verify_validationMsg_password_createaccount();
    }

    @Then("^tool tip error message “Please enter a valid email address\\.” displays$")
    public void tool_tip_error_message_please_enter_a_valid_email_address_displays() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_verify_validationMsg_email_createaccount();
    }

    @Then("^tool tip error message “Log\\-In Error\\. We couldn't find an account with the information you provided\\. Please try again or click the “Forgot your account information\\?” link below to retrieve your account information\\.” displays$")
    public void tool_tip_error_message_login_error_we_couldnt_find_an_account_with_the_information_you_provided_please_try_again_or_click_the_forgot_your_account_information_link_below_to_retrieve_your_account_information_displays() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_verify_validationMsg_invalidcredentials();
    }

    @Then("^tool tip error message “Log\\-In Error\\. Is this your first time signing in to the new Reading Club Online site\\? You must click the “Activate Your Account” button in the blue section to the right to get started\\.Not your first time\\? You may have entered the incorrect account number or password\\. Please try again or click the “Forgot Your Password” link below to reset your password\\.” displays$")
    public void tool_tip_error_message_login_error_is_this_your_first_time_signing_in_to_the_new_reading_club_online_site_you_must_click_the_activate_your_account_button_in_the_blue_section_to_the_right_to_get_startednot_your_first_time_you_may_have_entered_the_incorrect_account_number_or_password_please_try_again_or_click_the_forgot_your_password_link_below_to_reset_your_password_displays() throws Throwable {
        pcod_logpage.verify_validationmessage(pcod_logpage.gettooltipconnectyourteachererrormsg(), ConstantUtils.logInError);
    }

    @Then("^tool tip error message “Please provide your account number or account email\\.” displays$")
    public void tool_tip_error_message_please_provide_your_account_number_or_account_email_displays() throws Throwable {
        pcod_logpage.verify_validationmessage(pcod_logpage.gettooltiperrormessage(), ConstantUtils.USERNAMEBLANKERRMSG);
    }

    @Then("^tool tip error message “Please enter your password\\.” displays$")
    public void tool_tip_error_message_please_enter_your_password_displays() throws Throwable {
        pcod_logpage.verify_validationmessage(pcod_logpage.gettooltiperrormessage(), ConstantUtils.PASSWORDBLANKERRMSG);
    }


    @Then("^tool tip error message “Please specify a valid phone number\\.” displays$")
    public void tool_tip_error_message_please_specify_a_valid_phone_number_displays() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_verify_validationMsg_phonenumber_createaccount();
    }


    @Then("^“Please enter at least 2 characters” error message displays$")
    public void please_enter_at_least_2_characters_error_message_displays() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_tooltip_validationmessage(ConstantUtils.VALIDATIONMSG_LASTNAME_ADDACHILD);
    }

    @Then("^Add a child modal displays$")
    public void add_a_child_modal_displays() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_addchildwindow_connecttoteacher_present();
    }

    @And("^Parent account is created$")
    public void parent_account_is_created() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_parentcreatedacccount_connecttoteacher();
    }


    @Then("^Create Account modal disappears$")
    public void create_account_modal_disappears() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_createanaccount_window_connecttoteacher_notpresent();
    }


    @When("^Parent clicks on the grade dropdown$")
    public void parent_clicks_on_the_grade_dropdown() throws Throwable {
        pcod_logpage.pcod_click_element(pcod_logpage.getdropdownaddachildgrade());
    }

    @And("^selects grade by using arrow keys and click ENTER button$")
    public void selects_grade_by_using_arrow_keys_and_click_enter_button() throws Throwable {
        pcod_logpage.gettxtaddachildlastname().sendKeys(Keys.TAB);
        PauseUtil.pause(1500);
        pcod_logpage.getdrpdownaddachildgrade().sendKeys(Keys.ARROW_DOWN);
        pcod_logpage.getdrpdownaddachildgrade().sendKeys(Keys.RETURN);
        PauseUtil.pause(1500);

    }

    @When("^Parent clicks on Month dropdown$")
    public void parent_clicks_on_month_dropdown() throws Throwable {
        pcod_logpage.pcod_click_element(pcod_logpage.getdropdownaddachildbirthdatemonth());
    }

    @When("^Parent clicks on Year dropdown$")
    public void parent_clicks_on_year_dropdown() throws Throwable {
        pcod_logpage.pcod_click_element(pcod_logpage.getdropdownaddachildbirthdateyear());
    }

    @Then("^Select Grade is displayed by default$")
    public void select_grade_is_displayed_by_default() throws Throwable {
        pcod_logpage.pcod_gettext_equals(pcod_logpage.getdropdownaddachildgrade(),
                TestBaseProvider.getTestBase().getTestData().getString("child_grade"), "Default Grade dropdown");
    }

    @And("^dropdown values Pre\\-Kindergarten, Kindergarten, 1st Grade, 2nd Grade, 3rd Grade, 4th Grade, 5th Grade, 6th Grade, 7th Grade, 8th Grade, 9th Grade, 10th Grade, 11th Grade, 12th Grade displays$")
    public void dropdown_values_prekindergarten_kindergarten_1st_grade_2nd_grade_3rd_grade_4th_grade_5th_grade_6th_grade_7th_grade_8th_grade_9th_grade_10th_grade_11th_grade_12th_grade_displays() throws Throwable {
        pcod_logpage.pcod_get_options_contains(pcod_logpage.getdrpdownaddachildgrade(), ConstantUtils.ADDCHILD_GRADES);
    }


    @Then("^months January through december displays in the chronological order$")
    public void months_january_through_december_displays_in_the_chronological_order() throws Throwable {
        pcod_logpage.pcod_get_options_contains(pcod_logpage.getdrpdownaddachildbirthdatemonth(), ConstantUtils.ADDCHILD_MONTHS);
    }


    @Then("^current \\- 20 to current year displays$")
    public void current_20_to_current_year_displays() throws Throwable {
        pcod_logpage.pcod_get_options_contains(pcod_logpage.getdrpdownaddachildbirthdateyear(), ConstantUtils.ADDCHILD_YEARS);
    }

    @Then("^child information is saved$")
    public void child_information_is_saved() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_addachild_saved_successfully();
    }

    @Then("^Parent Home page displays$")
    public void parent_home_page_displays() throws Throwable {
        ILoginPage homePage = getFactory().getILoginPage();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        homePage.closeButton_in_LoginPage();
        pcod_logpage.verify_element_displayed(pcod_logpage.getpageparenthomepage());
    }

    @Given("^parent has only one child configured$")
    public void parent_has_only_one_child_configured() throws Throwable {
        System.out.println("This parent should have atleast 1 child connected to teacher");
    }

    @Given("^parent has 2 childs connected to same teacher$")
    public void parent_has_2_childs_connected_to_same_teacher() throws Throwable {
        System.out.println("This parent should have atleast 2 childs connected to same teacher");
    }

    @Given("^parent has 2 childs connected to different teacher$")
    public void parent_has_2_childs_connected_to_different_teacher() throws Throwable {
        System.out.println("This parent should have atleast 2 childs connected to different teacher");
    }

    @Given("^parent has 2 children$")
    public void parent_has_2_children() throws Throwable {
        System.out.println("This parent should have atleast 2 childs connected");
    }

    @Given("^parent has 2 child connected to different teacher$")
    public void parent_has_2_child_connected_to_different_teacher() throws Throwable {
        pcod_homepage.pcod_clickMyAcc_Profile();
        pcod_homepage.pcod_myAccount_deleteAllChild();
        pcod_homepage.pcod_clickMyAcc_Profile();
        pcod_homepage.getpcodmyProfileclickplus().click();
        pcod_homepage.getpcodMyProfile_linkEdit().click();
        PauseUtil.pause(4500);
        pcod_logpage.clickFATLink_connectToTeacher(TestBaseProvider.getTestBase().getTestData().getString("postalcode"));
        PauseUtil.pause(4500);
        pcod_homepage.pcod_Click_online_notes_SAVE_button();
    }

    @Given("^parent has 3 children 2 connected to same teacher and other to different child$")
    public void parent_has_3_children_2_connected_to_same_teacher_and_other_to_different_child() throws Throwable {
        System.out.println("This parent should have atleast 3 childs, 2 connected to one teacher"
                + "and other connected to other teacher");
    }


    @Given("^parent with 1 child connected to teacher belonging to AB Province with applicable tax as GST$")
    public void parent_with_1_child_connected_to_teacher_belonging_to_ab_province_with_applicable_tax_as_gst() throws Throwable {
        System.out.println("this parent should have 1 child with GST linked to AB province");
    }


    @Given("^parent with 1 child connected to teacher belonging to MB Province with applicable tax as GST$")
    public void parent_with_1_child_connected_to_teacher_belonging_to_mb_province_with_applicable_tax_as_gst() throws Throwable {
        System.out.println("this parent should have 1 child with GST linked to MB province");
    }

    @Given("^parent with 1 child connected to teacher belonging to NT Province with applicable tax as GST$")
    public void parent_with_1_child_connected_to_teacher_belonging_to_nt_province_with_applicable_tax_as_gst() throws Throwable {
        System.out.println("this parent should have 1 child with GST linked to NT province");
    }

    @Given("^parent with 1 child connected to teacher belonging to YT Province with applicable tax as GST$")
    public void parent_with_1_child_connected_to_teacher_belonging_to_yt_province_with_applicable_tax_as_gst() throws Throwable {
        System.out.println("this parent should have 1 child with GST linked to YT province");
    }


    @Given("^parent with 1 child connected to teacher belonging to BC Province with applicable tax as GST and PST$")
    public void parent_with_1_child_connected_to_teacher_belonging_to_bc_province_with_applicable_tax_as_gst_and_pst() throws Throwable {
        System.out.println("this parent should have 1 child with GST and PST linked to BC province");
    }

    @Given("^parent with 1 child connected to teacher belonging to NL Province with applicable tax as GST and PST$")
    public void parent_with_1_child_connected_to_teacher_belonging_to_nl_province_with_applicable_tax_as_gst_and_pst() throws Throwable {
        System.out.println("this parent should have 1 child with GST and PST linked to NL province");
    }


    @Given("^parent with 1 child connected to teacher belonging to SK Province with applicable tax as GST$")
    public void parent_with_1_child_connected_to_teacher_belonging_to_sk_province_with_applicable_tax_as_gst() throws Throwable {
        System.out.println("this parent should have 1 child with GST linked to SK province");
    }

    @Given("^parent with 1 child connected to teacher belonging to NL Province with applicable tax as HST$")
    public void parent_with_1_child_connected_to_teacher_belonging_to_nl_province_with_applicable_tax_as_hst() throws Throwable {
        System.out.println("this parent should have 1 child with HST linked to NL province");
    }

    @Given("^parent with 1 child connected to teacher belonging to NB Province with applicable tax as HST$")
    public void parent_with_1_child_connected_to_teacher_belonging_to_nb_province_with_applicable_tax_as_hst() throws Throwable {
        System.out.println("this parent should have 1 child with HST linked to NB province");
    }

    @Given("^parent with 1 child connected to teacher belonging to NS Province with applicable tax as HST$")
    public void parent_with_1_child_connected_to_teacher_belonging_to_ns_province_with_applicable_tax_as_hst() throws Throwable {
        System.out.println("this parent should have 1 child with HST linked to NS province");
    }

    @Given("^parent with 1 child connected to teacher belonging to ON Province with applicable tax as HST$")
    public void parent_with_1_child_connected_to_teacher_belonging_to_on_province_with_applicable_tax_as_hst() throws Throwable {
        System.out.println("this parent should have 1 child with HST linked to ON province");
    }


    @Given("^parent with 1 child connected to teacher belonging to PE Province with applicable tax as HST$")
    public void parent_with_1_child_connected_to_teacher_belonging_to_pe_province_with_applicable_tax_as_hst() throws Throwable {
        System.out.println("this parent should have 1 child with HST linked to PE province");
    }

    @Given("^parent with 1 child connected to teacher belonging to QC Province with applicable tax as GST and QST$")
    public void parent_with_1_child_connected_to_teacher_belonging_to_qc_province_with_applicable_tax_as_gst_and_qst() throws Throwable {
        System.out.println("this parent should have 1 child with GST and QST linked to QC province");
    }


    @Given("^parent with 2 child connected to different teacher belonging to provinces one with GST and other with GST and PST$")
    public void parent_with_2_child_connected_to_different_teacher_belonging_to_provinces_one_with_gst_and_other_with_gst_and_pst() throws Throwable {
        System.out.println("this parent should have 2 childs with different teachers havng different provicnes i.e GST and GST/PST");
    }

    @Given("^parent with 2 child connected to different teacher belonging to provinces one with GST and other with HST$")
    public void parent_with_2_child_connected_to_different_teacher_belonging_to_provinces_one_with_gst_and_other_with_hst() throws Throwable {
        System.out.println("this parent should have 2 childs with different teachers havng different provicnes i.e GST and HST");
    }

    @Given("^parent with 2 child connected to different teacher belonging to provinces one with GST\\/PST and other with HST$")
    public void parent_with_2_child_connected_to_different_teacher_belonging_to_provinces_one_with_gstpst_and_other_with_hst() throws Throwable {
        System.out.println("this parent should have 2 childs with different teachers havng different provicnes i.e GST/PST and HST");
    }

    @Given("^parent with 4 child connected to different teacher belonging to provinces one with GST,GST\\/PST,HST and GST\\/QST$")
    public void parent_with_4_child_connected_to_different_teacher_belonging_to_provinces_one_with_gstgstpsthst_and_gstqst() throws Throwable {
        System.out.println("this parent should have 2 childs with different teachers havng different provicnes i.e GST, GST/PST, HST and GST /QST");
    }

    @Given("^parent with 2 child connected to different teacher belonging to provinces one with GST\\/PST and other is GST$")
    public void parent_with_2_child_connected_to_different_teacher_belonging_to_provinces_one_with_gstpst_and_other_is_gst() throws Throwable {
        System.out.println("this parent should have 2 childs with different teachers havng different provicnes i.e GST/PST and GST");
    }


    @Given("^parent with 2 child connected to different teacher belonging to provinces one with GST\\/PST and other is GST\\/PST but PST tax exempt school$")
    public void parent_with_2_child_connected_to_different_teacher_belonging_to_provinces_one_with_gstpst_and_other_is_gstpst_but_pst_tax_exempt_school() throws Throwable {
        System.out.println("this parent should have 2 childs with different teachers havng different provicnes i.e GST/PST and other with GST/PST but PST exempt");
    }

    @Given("^parent with 1 child connected to teacher belonging to Province with applicable tax as GST\\/PST and item as PST tax exempt$")
    public void parent_with_1_child_connected_to_teacher_belonging_to_province_with_applicable_tax_as_gstpst_and_item_as_tax_exempt() throws Throwable {
        System.out.println("this parent should have 2 childs with different teachers havng different provicnes i.e GST/PST and item as PST exempt");
    }

    @Given("^parent with 2 child connected to different teacher belonging to provinces one with GST\\/PST and other is GST\\/PST but tax exempt school$")
    public void parent_with_2_child_connected_to_different_teacher_belonging_to_provinces_one_with_gstpst_and_other_is_gstpst_but_tax_exempt_school() throws Throwable {
        System.out.println("this parent should have 2 childs with different teachers havng different provicnes i.e GST/PST and other as GST / PST exempt");
    }


    @Given("^parent with 1 child connected to teacher belonging to Province with applicable tax as GST$")
    public void parent_with_1_child_connected_to_teacher_belonging_to_province_with_applicable_tax_as_gst() throws Throwable {
        System.out.println("this parent should have 1 child with one teacher havng provicne i.e GST");
    }

    @Given("^parent with 1 child connected to teacher belonging to Province with applicable tax as GST & PST$")
    public void parent_with_1_child_connected_to_teacher_belonging_to_province_with_applicable_tax_as_gst_pst() throws Throwable {
        System.out.println("this parent should have 1 child with one teacher havng provicne i.e GST and PST");
    }

    @Given("^parent with 1 child connected to teacher belonging to Province with applicable tax as HST$")
    public void parent_with_1_child_connected_to_teacher_belonging_to_province_with_applicable_tax_as_hst() throws Throwable {
        System.out.println("this parent should have 1 child with one teacher havng provicne i.e HST");
    }
    
    @Given("^Parent having one child connected to 2 teachers and has 1 pending order$")
    public void parent_having_one_child_connected_to_2_teachers_and_has_1_pending_order() throws Throwable {
    	System.out.println("this parent should have connected to 2 teachers with 1 pending order");
    }
    
    
    @Given("^Parent having 2 childs, child1 related to teacher1 and child2 related to teacher2 and has 1 pending order$")
    public void parent_having_2_childs_child1_related_to_teacher1_and_child2_related_to_teacher2_and_has_1_pending_order() throws Throwable {
    	System.out.println("Parent having 2 childs, child1 related to teacher1 and child2 related to teacher2 and has 1 pending order");
    }
    
    @Given("^Parent having 2 childs, child1 related to teacher1 and child2 related to teacher2 and has 1 pending order only for child1$")
    public void parent_having_2_childs_child1_related_to_teacher1_and_child2_related_to_teacher2_and_has_1_pending_order_only_for_child1() throws Throwable {
    	System.out.println("Parent having 2 childs, child1 related to teacher1 and child2 related to teacher2 and has 1 pending order only for child1");
    }
    
    @Given("^Parent having 2 childs, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders$")
    public void parent_having_2_childs_child1_related_to_teacher1_and_child2_related_to_teacher2_and_has_2_pending_orders() throws Throwable {
    	System.out.println("Parent having 2 childs, child1 related to teacher1 and child2 related to teacher2 and has 2 pending orders");
    }
    
    
    @Given("^Parent having 3 childs, child1 and child2 related to teacher1 and child3 related to teacher2 and has 1 pending order$")
    public void parent_having_3_childs_child1_and_child2_related_to_teacher1_and_child3_related_to_teacher2_and_has_1_pending_order() throws Throwable {
    	System.out.println("Parent having 3 childs, child1 and child2 related to teacher1 and child3 related to teacher2 and has 1 pending order");
    }
    
    @Given("^Parent having 3 childs, child1 and child2 related to teacher1 and child3 related to teacher2 and has 2 pending orders$")
    public void parent_having_3_childs_child1_and_child2_related_to_teacher1_and_child3_related_to_teacher2_and_has_2_pending_orders() throws Throwable {
    	System.out.println("Parent having 3 childs, child1 and child2 related to teacher1 and child3 related to teacher2 and has 2 pending orders");
    }
    
    @Given("^2 different parents place order to the same teacher$")
    public void two_different_parents_place_order_to_the_same_teacher() throws Throwable {
    	System.out.println("this is with one 2 parent having 2 child2 and 1 pending order for 1 teacher");
    }
    
    @Given("^teacher connected to one parent having one child and has 1 pending order$")
    public void teacher_connected_to_one_parent_having_one_child_and_has_1_pending_order() throws Throwable {
    	System.out.println("this is with one parent having one child and 1 pending order");
    }
    
    @Given("^teacher connected to one parent and having one child placing 1 order$")
    public void teacher_connected_to_one_parent_and_having_one_child_placing_1_order() throws Throwable {
    	pcod_logpage.parent_login(pcod_logpage.getTxtUsername(), TestBaseProvider.getTestBase().getTestData().getString("acc_no"),
                TestBaseProvider.getTestBase().getTestData().getString("password"));
        PauseUtil.pause(1500);
        stud_page.placeItems_GlobalSearch_StoreInfo(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
    			TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
        pcod_reviewpage.navigate_from_shoppingcart_to_submitorderpage();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
    }
    
    @Given("^teacher connected to one parent and having 2 childs placing 1 order$")
    public void teacher_connected_to_one_parent_and_having_2_childs_placing_1_order() throws Throwable {
    	pcod_logpage.parent_login(pcod_logpage.getTxtUsername(), TestBaseProvider.getTestBase().getTestData().getString("acc_no"),
                TestBaseProvider.getTestBase().getTestData().getString("password"));
        PauseUtil.pause(1500);
        stud_page.parent_placing_2items_2childs(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
    			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
    			TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
    			TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));
        pcod_reviewpage.navigate_from_shoppingcart_to_submitorderpage();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
    }
    
    
    @Given("^teacher connected to 2 parents and having 2 childs placing 1 order$")
    public void teacher_connected_to_2_parents_and_having_2_childs_placing_1_order() throws Throwable {
    	pcod_logpage.parent_login(pcod_logpage.getTxtUsername(), TestBaseProvider.getTestBase().getTestData().getString("acc_no"),
                TestBaseProvider.getTestBase().getTestData().getString("password"));
        PauseUtil.pause(1500);
        stud_page.two_parents_placing_2items_2childs(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
    			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
    			TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
    			TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));
    }
    
    @Given("^teacher connected to 1 parent and having 2 childs placing 2 orders$")
    public void teacher_connected_to_1_parent_and_having_2_childs_placing_2_orders() throws Throwable {
        pcod_logpage.parent_login(pcod_logpage.getTxtUsername(), TestBaseProvider.getTestBase().getTestData().getString("acc_no"),
                TestBaseProvider.getTestBase().getTestData().getString("password"));
        PauseUtil.pause(1500);
        stud_page.parent_placing_2orders_2items_2childs(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
    			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
    			TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
    			TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));
    }
    
    @And("^parent has pending items from expired flyers$")
    public void parent_has_pending_items_from_expired_flyers() throws Throwable {
    	Assert.fail("Yet to implement. Keeping this to fail");
    }
    
    @And("^parent has pending items from expired and non\\-expired flyers$")
    public void parent_has_pending_items_from_expired_and_nonexpired_flyers() throws Throwable {
    	Assert.fail("Yet to implement. Keeping this to fail");
    }

    @Given("^teacher connected to one parent having 2 childs and has 1 pending order$")
    public void teacher_connected_to_one_parent_having_2_childs_and_has_1_pending_order() throws Throwable {
    	System.out.println("parent connected to one teacher with 2 childs and 1 pending orders");
    }
    
    @Given("^teacher connected to one parent having 2 childs and has 2 pending orders$")
    public void teacher_connected_to_one_parent_having_2_childs_and_has_2_pending_orders() throws Throwable {
    	System.out.println("parent connected to one teacher with 2 parents and 2 pending orders");
    }
    
    @Given("^teacher connected to one parent having one child and has no pending orders$")
    public void teacher_connected_to_one_parent_having_one_child_and_has_no_pending_orders() throws Throwable {
        System.out.println("parent connected to one teacher with no pending orders");
    }    
    
    @Given("^teacher connected to one parent having one child$")
    public void teacher_connected_to_one_parent_having_one_child() throws Throwable {
    	System.out.println("parent connected to one teacher and one child");
    }

    
    
    @Given("^parent have valid credentials$")
    public void parent_have_valid_credentials() throws Throwable {
        System.out.println("parent should have valid username and password");
    }


    @Given("^teacher is connected to parent account$")
    public void teacher_is_connected_to_parent_account() throws Throwable {
        System.out.println("parent is connected to parent account");
    }
    
    @When("^teacher enters valid data in all fields except First Name field$")
    public void teacher_enters_valid_data_in_all_fields_except_first_name_field() throws Throwable {
    	PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
    	login.TCOD_enter_data_login_info_window();
    }
    
    @When("^teacher enters email address with multiple dots and invalid top level doamain in account number\\/email field and click outside$")
    public void teacher_enters_email_address_with_multiple_dots_and_invalid_top_level_doamain_in_account_numberemail_field_and_click_outside() throws Throwable {
    	PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
    	login.TCOD_enter_AcNumOrEmail_in_login_info_window();
    }
    
    @When("^teacher enters first name and last name$")
    public void teacher_enters_first_name_and_last_name() throws Throwable {
    	PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
    	login.TCOD_enter_Fname_in_login_info_window();
    	login.TCOD_enter_Lname_in_login_info_window();
    }

    @And("^clicks on account number\\/email address field but leave it blank and click outside$")
    public void clicks_on_account_numberemail_address_field_but_leave_it_blank_and_click_outside() throws Throwable {
    	PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
    	login.TCOD_enter_AcNumOrEmail_in_login_info_window();
    }

    @When("^teacher enters valid data in all fields except Last Name field$")
    public void teacher_enters_valid_data_in_all_fields_except_last_name_field() throws Throwable {
    	PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
    	login.TCOD_enter_data_login_info_window();
    }
    
    @Given("^teacher has not set a due date$")
    public void teacher_has_not_set_a_due_date() throws Throwable {
    	System.out.println("this teacher has not set the due date");
    }
    
    @Given("^parent does not have any child added$")
    public void parent_does_not_have_any_child_added() throws Throwable {
    	System.out.println("this parent does not have any child added");
    }
    
    @Given("^parent has a child connected to a teacher$")
    public void parent_has_a_child_connected_to_a_teacher() throws Throwable {
    	PauseUtil.pause(4500);
        pcod_homepage.pcod_clickMyAcc_Profile();
        pcod_homepage.pcod_myAccount_deleteAllChild();
        pcod_homepage.pcod_clickMyAcc_Profile();
        pcod_homepage.pcod_profile_addchildClickPlus();
        pcod_homepage.pcod_profile_addChild_linkEditClick();
        SCHUtils.waitForElementToBeClickable(pcod_logpage.getlinkAddchildFindyourTeacher(),2000);
        pcod_logpage.clickFATLink_connectToTeacher(TestBaseProvider.getTestBase().getTestData().getString("postalcode"));
        PauseUtil.pause(4500);
        pcod_homepage.pcod_Click_online_notes_SAVE_button();

    }
    
    @Given("^parent has a child not connected to a teacher$")
    public void parent_has_a_child_not_connected_to_a_teacher() throws Throwable {
		// Go to My Profile
        pcod_homepage.pcod_clickMyAcc_Profile();
        pcod_homepage.pcod_myAccount_deleteAllChild();
    }

    @When("^parent clicks on Edit$")

    public void parentClicksOnEdit() throws Throwable {
        //PCOD_HomePage pcodHomePage = new PCOD_HomePage();
        pcod_homepage.getpcodmyProfileclickplus().click();
        pcod_homepage.getpcodMyProfile_linkEdit().click();

    }

    @And("^parent update the child first name, last name, grade, birth date$")
    public void parentUpdateTheChildFirstNameLastNameGradeBirthDate() throws Throwable {
        //PCOD_HomePage pcodHomePage = new PCOD_HomePage();
        pcod_homepage.pcod_myprofile_updatechildInfo();

    }

    @And("^parent selects a different teacher$")
    public void parentSelectsADifferentTeacher() throws Throwable {
        pcod_logpage.clickFATLink_connectToTeacher(
                TestBaseProvider.getTestBase().getTestData().getString("zipcode")
        );
    }

    @And("^clicks on Save add Child$")
    public void clicksOnSaveAddChild() throws Throwable {
        PCOD_LoginPage pcoologinPage = new PCOD_LoginPage();
        SCHUtils.clickUsingJavaScript(pcoologinPage.getbuttonAddchildSave());

    }

    @Then("^updated <ChildFirstName> in <TeacherName>'s class displays$")
    public void updatedChildFirstNameInTeacherNameSClassDisplays() throws Throwable {
        PCOD_HomePage pcodHomePage = new PCOD_HomePage();
        pcodHomePage.pcod_myprofile_verifychildaddedName();
                //getpcodMyProfile_nameofchild_text().getText();
    }
    @Given("^Parent has a child connected to teacher with pending orders$")
    public void parent_has_a_child_connected_to_teacher_with_pending_orders() throws Throwable {
    	System.out.println("the parent has child connected to teacher with pending orders");
    }
    
    @Given("^Parent having (\\d+) children, child(\\d+) related to teacher(\\d+) and child(\\d+) related to teacher(\\d+) and has (\\d+) pending order only for child(\\d+)$")
    public void parent_having_children_child_related_to_teacher_and_child_related_to_teacher_and_has_pending_order_only_for_child(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) throws Throwable {
    	System.out.println("the parent has 2 children, child1 connected to teacher1 and child2 connected to teacher2, and teacher1 only has pending orders");
    }
    
    @Given("^Parent has a child connected to teacher with free pick order$")
    public void parent_has_a_child_connected_to_teacher_with_free_pick_order() throws Throwable {
    	System.out.println("the parent has a child connected to teacher with free pick order");
    }
    
    @Given("^Parent having (\\d+) child connected to (\\d+) teachers and has (\\d+) pending order for each child$")
    public void parent_having_child_connected_to_teachers_and_has_pending_order_for_each_child(int arg1, int arg2, int arg3) throws Throwable {
    	System.out.println("the parent having 2 children connected to 2 teachers and has 1 pending order for each child");
    }
    
    @Given("^Parent having (\\d+) children, child(\\d+) related to teacher(\\d+) and child(\\d+) related to teacher(\\d+) and has (\\d+) pending orders$")
    public void parent_having_children_child_related_to_teacher_and_child_related_to_teacher_and_has_pending_orders(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Throwable {
    	System.out.println("the parent having 2 children, child1 connected to teacher1 and child2 [as child1] connected to teacher2 and both teachers has pending orders for each child");
    }
    
    @Given("^Parent having (\\d+) children, child(\\d+) and child(\\d+) related to teacher(\\d+) and child(\\d+) related to teacher(\\d+) and has (\\d+) pending order$")
    public void parent_having_children_child_and_child_related_to_teacher_and_child_related_to_teacher_and_has_pending_order(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) throws Throwable {
    	System.out.println("the parent having 3 children, child1 and child2 connected to teacher1 and child3 connected to teacher2 and both teachers has pending orders for each child");
    }
    
    @Given("^(\\d+) parents with one child connected to same teacher places order and teacher has pending orders$")
    public void parents_with_one_child_connected_to_same_teacher_places_order_and_teacher_has_pending_orders(int arg1) throws Throwable {
    	System.out.println("2 parents have 1 child connected to same teacher and teachers has pending orders");
    }
    
    @Given("^teacher has pending parent orders in cart$")
    public void teacher_has_pending_parent_orders_in_cart() throws Throwable {
    	System.out.println("teacher has pending parent orders in cart");
    }

    @Given("^Parent has a child connected to teacher with pending parent orders$")
    public void parent_has_a_child_connected_to_teacher_with_pending_parent_orders() throws Throwable {
    	System.out.println("Seperate method to place orders for teachers");
    }

    @Given("^teacher does not have pending parent orders in cart$")
    public void teacher_does_not_have_pending_parent_orders_in_cart() throws Throwable {
    	Assert.fail("failing as not implemented");
    }

    @Given("^teacher does not have pending parent orders from 3 parents$")
    public void teacher_does_not_have_pending_parent_orders_from_3_parents() throws Throwable {
    	Assert.fail("failing as not implemented");
    }

    @Given("^teacher does not have pending multiple orders from multiple children from same parent in cart$")
    public void teacher_does_not_have_pending_multiple_orders_from_multiple_children_from_same_parent_in_cart() throws Throwable {
    	Assert.fail("failing as not implemented");
    }

    @Given("^Parent with 2 children connected to same teacher$")
    public void parent_with_2_children_connected_to_same_teacher() throws Throwable {
    	Assert.fail("failing as not implemented");
    }

    @Given("^Parent with 2 children connected to different teacher$")
    public void parent_with_2_children_connected_to_different_teacher() throws Throwable {
    	Assert.fail("failing as not implemented");
    }

    @And("^teacher has pending parent orders$")
    public void teacher_has_pending_parent_orders() throws Throwable {
    	System.out.println("Teacher has some pending parent orders");
    }

    @And("^teacher navigates to Teacher Desk$")
    public void teacher_navigates_to_teacher_desk() throws Throwable {

    }
    
    @Given("^teacher has pending parent orders from (\\d+) parents$")
    public void teacher_has_pending_parent_orders_from_parents(int arg1) throws Throwable {
    	System.out.println("teacher has pending parent orders from 3 parents");
    }
    
    @Given("^Parent has a child connected to teacher with pending parent freepick only order in cart$")
    public void parent_has_a_child_connected_to_teacher_with_pending_parent_freepick_only_order_in_cart() throws Throwable {
    	System.out.println("Parent has a child connected to teacher with pending parent freepick only order in cart");
    }
    
    @Then("^\"([^\"]*)\" displays$")
    public void displays(String arg1) throws Throwable {
    	pcod_homepage.verify_message_displayed_for_SOO_orders_teacherDesk();
    }
    
    @And("^data creation function is called$")
    public void dataCreation() throws IOException{
    	try {
			DataCreation.generate_parent_end_to_end_data(1, 34, "1Parent2Children2Teachers");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    //############################################# DWCAPCOD - 1914 #######################################################
    @Given("^parent navigates to RCO CA Login page$")
    public void parent_navigates_to_RCO_CA_Login_page() throws Throwable {
    	System.out.println("Parent is on RCO Login page");
    }
    
    @Given("^parent clicks on \"([^\"]*)\" button$")
    public void parent_clicks_on_button(String arg1) throws Throwable {
    	pcod_logpage.pcod_connect_to_your_teacher();
    }

    @Given("^parent enters postal code and selects a teacher$")
    public void parent_enters_postal_code_and_selects_a_teacher() throws Throwable {
    	String teacherAccNum = TestBaseProvider.getTestBase().getTestData().getString("accnum");
    	String postalcode = TestBaseProvider.getTestBase().getTestData().getString("postalcode");
    	String schoolName = TestBaseProvider.getTestBase().getTestData().getString("schoolName");
    	
    	pcod_logpage.pcod_enter_school_and_teacher_info(postalcode, schoolName, teacherAccNum);
    }

    @Given("^parent clicks on Create an Account$")
    public void parent_clicks_on_Create_an_Account() throws Throwable {
    	pcod_logpage.pcod_click_on_create_account_button();
    }

    @When("^parent enters already existing teacher email address and all other mandatory information$")
    public void parent_enters_already_existing_teacher_email_address_and_all_other_mandatory_information() throws Throwable {
    	boolean isUniqueDomain = false;
    	pcod_logpage.pcod_parent_enters_information_CAT_modal(isUniqueDomain);
    }

    @When("^parent clicks on \"([^\"]*)\"$")
    public void parent_clicks_on(String arg1) throws Throwable {
    	pcod_logpage.pcod_parent_clicks_continue_CAT_modal();
    }

    @Then("^error message \"([^\"]*)\" displays\\.$")
    public void error_message_displays(String arg1) throws Throwable {
    	pcod_logpage.pcod_error_msg_teacher_email_displays();
    }
    
    @When("^parent clicks on \"([^\"]*)\" link from the error message$")
    public void parent_clicks_on_link_from_the_error_message(String arg1) throws Throwable {
    	pcod_logpage.pcod_click_teacher_email_click_here_link();
    }

    @Then("^Forgot password modal displays$")
    public void forgot_password_modal_displays() throws Throwable {
    	pcod_logpage.pcod_forgot_password_modal_displays();
    }
    
    @Given("^parent enters email address with any invalid domain like \\.education$")
    public void parent_enters_email_address_with_any_invalid_domain_like_education() throws Throwable {
        System.out.println("The email will be entered in the next step");
    }

    @When("^parent enters rest of the mandatory information during the registration prcess$")
    public void parent_enters_rest_of_the_mandatory_information_during_the_registration_prcess() throws Throwable {
    	boolean isUniqueDomain = true;
    	pcod_logpage.pcod_parent_enters_information_CAT_modal(isUniqueDomain);
    }

    @Then("^parent lands on Home page$")
    public void parent_lands_on_Home_page() throws Throwable {
        pcod_logpage.pcod_parent_adds_one_child();
    	pcod_logpage.pcod_homepage_is_displayed();
    }
    //############################################# DWCAPCOD - 1914 #######################################################
}
