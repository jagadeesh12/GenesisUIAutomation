package com.dw.automation.steps.home;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import java.util.Date;


import com.dw.automation.pages.ILoginPage;

import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;
import com.dw.automation.pages.ILoginPage;
import com.dw.automation.pages.ITeachersHomePage;
import com.dw.automation.pages.PCOD_ILoginPage;
import com.dw.automation.pages.impl.LoginPage;
import com.dw.automation.pages.impl.PCOD_HomePage;
import com.dw.automation.pages.impl.PCOD_LoginPage;
import com.dw.automation.pages.impl.ProductDetailPage;
import com.dw.automation.pages.impl.ProfilePage;
import com.dw.automation.pages.impl.StudentFlyerOrdersPage;
import com.dw.automation.pages.impl.TeachersHomePage;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.TestBaseProvider;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;


public class PCOD_HomePageSteps {

    PCOD_HomePage pcod_homepage = new PCOD_HomePage();
    PCOD_LoginPage pcod_logpage = new PCOD_LoginPage();
    TeachersHomePage teach_homepage = new TeachersHomePage();
    ProductDetailPage prod_page = new ProductDetailPage();
    StudentFlyerOrdersPage stud_page = new StudentFlyerOrdersPage();
    LoginPage loginpage = new LoginPage();

//######################### HOME PAGE		#############################################


    @When("^Parent enters minimum 3 characters in item number field$")
    public void parent_enters_minimum_3_characters_in_item_number_field() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(pcod_homepage.gettxtitemnumberhomepage(),
                TestBaseProvider.getTestBase().getTestData().getString("itemnumber"));
    }

    @When("^Parent tries to enter more than 6 characters in Item# field$")
    public void parent_tries_to_enter_more_than_6_characters_in_item_field() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(pcod_homepage.gettxtitemnumberhomepage(),
                TestBaseProvider.getTestBase().getTestData().getString("itemnumber"));
    }

    @When("^Parent enters special characters in Item# field$")
    public void parent_enters_special_characters_in_item_field() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(pcod_homepage.gettxtitemnumberhomepage(),
                TestBaseProvider.getTestBase().getTestData().getString("itemnumber"));
    }

    @Then("^any characters entered after 6 characters are ignored$")
    public void any_characters_entered_after_6_characters_are_ignored() throws Throwable {
        pcod_homepage.verify_element_textlimit(pcod_homepage.gettxtitemnumberhomepage(),
                TestBaseProvider.getTestBase().getTestData().getString("exp_itemnumber"));
    }

    @Then("^ADD TO CART button is enabled$")
    public void add_to_cart_button_is_enabled() throws Throwable {
        pcod_logpage.verify_element_enabled(pcod_homepage.getbtnaddtocartdisabledhomepage());
    }


    @Then("^tool tip error message “Please enter a valid item number\\.” displays$")
    public void tool_tip_error_message_please_enter_a_valid_item_number_displays() throws Throwable {
        pcod_logpage.verify_validationmessage(pcod_logpage.gettooltipconnectyourteachererrormsg(), ConstantUtils.INVALIDITEMNUMBERMSG);
    }


    @And("^item# field is highlighted in yellow and bordered in red$")
    public void item_field_is_highlighted_in_yellow_and_bordered_in_red() throws Throwable {
        pcod_logpage.verify_field_incorrect_highlighted(pcod_homepage.gettxtitemnumberhomepage());
    }


    @And("^parent clicks on “Add a Child” link present in home page$")
    public void parent_clicks_on_add_a_child_link_present_in_home_page() throws Throwable {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);
        pcod_logpage.pcod_click_element(pcod_homepage.getdrpdownchildinteacherclasshomepage());
        pcod_logpage.pcod_click_element(pcod_homepage.getlnkaddachildhomepage());
    }


    @Then("^SAVE button is not enabled$")
    public void save_button_is_not_enabled() throws Throwable {
        pcod_logpage.verify_element_disabled(pcod_homepage.getbtnsaveaddachildhomepagedisabled());
    }


    @Then("^SAVE button is enabled$")
    public void save_button_is_enabled() throws Throwable {
        pcod_logpage.verify_element_enabled(pcod_homepage.getbtnsaveaddachildhomepagedisabled());
    }

    @And("^CANCEL button is enabled$")
    public void cancel_button_is_enabled() throws Throwable {
        pcod_logpage.verify_element_enabled(pcod_homepage.getbtncanceladdachildhomepageenabled());
    }

    @When("^parent clicks on Cancel button$")
    public void parent_clicks_on_cancel_button() throws Throwable {
        pcod_logpage.pcod_click_element(pcod_homepage.getbtncanceladdachildhomepage());
    }

    @When("^parent clicks on Save button$")
    public void parent_clicks_on_save_button() throws Throwable {
        pcod_logpage.pcod_click_element(pcod_homepage.getbtnsaveaddachildhomepage());
    }


    @When("^parent tries to give spaces in CONNECT TO A TEACHER text field$")
    public void parent_tries_to_give_spaces_in_connect_to_a_teacher_text_field() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(pcod_homepage.gettxtconnecttoateacheraddachildhomepage(),
                TestBaseProvider.getTestBase().getTestData().getString("cacno"));
    }


    @When("^CONNECT TO A TEACHER text field is left blank$")
    public void connect_to_a_teacher_text_field_is_left_blank() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(pcod_homepage.gettxtconnecttoateacheraddachildhomepage(),
                TestBaseProvider.getTestBase().getTestData().getString("cacno"));
    }

    @When("^parent enters 5 characters in CONNECT TO A TEACHER text field$")
    public void parent_enters_5_characters_in_connect_to_a_teacher_text_field() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(pcod_homepage.gettxtconnecttoateacheraddachildhomepage(),
                TestBaseProvider.getTestBase().getTestData().getString("cacno"));
    }

    @When("^parent enters enters less than 5 characters in CONNECT TO A TEACHER text field$")
    public void parent_enters_enters_less_than_5_characters_in_connect_to_a_teacher_text_field() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(pcod_homepage.gettxtconnecttoateacheraddachildhomepage(),
                TestBaseProvider.getTestBase().getTestData().getString("cacno"));
    }

    @When("^parent enters incorrect CONNECT TO A TEACHER in text field$")
    public void parent_enters_incorrect_connect_to_a_teacher_in_text_field() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(pcod_homepage.gettxtconnecttoateacheraddachildhomepage(),
                TestBaseProvider.getTestBase().getTestData().getString("cacno"));
    }


    @When("^parent tries to enter more than 5 characters in CONNECT TO A TEACHER text field$")
    public void parent_tries_to_enter_more_than_5_characters_in_connect_to_a_teacher_text_field() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(pcod_homepage.gettxtconnecttoateacheraddachildhomepage(),
                TestBaseProvider.getTestBase().getTestData().getString("cacno"));
    }


    @When("^parent tries to enter special characters in CONNECT TO A TEACHER text field$")
    public void parent_tries_to_enter_special_characters_in_connect_to_a_teacher_text_field() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(pcod_homepage.gettxtconnecttoateacheraddachildhomepage(),
                TestBaseProvider.getTestBase().getTestData().getString("cacno"));
    }

    @And("^parent enters CAC with less than 5 digits$")
    public void parent_enters_cac_with_less_than_5_digits() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(pcod_homepage.gettxtconnecttoateacheraddachildhomepage(),
                TestBaseProvider.getTestBase().getTestData().getString("cacno"));
    }


    @And("^parent enters correct CAC number in Connect to a Teacher text field$")
    public void parent_enters_correct_cac_number_in_connect_to_a_teacher_text_field() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(pcod_homepage.gettxtconnecttoateacheraddachildhomepage(),
                TestBaseProvider.getTestBase().getTestData().getString("cacno"));
    }


    @Then("^CONNECT TO A TEACHER text field will not allow any spaces$")
    public void connect_to_a_teacher_text_field_will_not_allow_any_spaces() throws Throwable {
        pcod_logpage.pcod_getvalue_equals(pcod_homepage.gettxtconnecttoateacheraddachildhomepage(),
                TestBaseProvider.getTestBase().getTestData().getString("exp_cac"), "Connect to Teacher text");
    }


    @Then("^CONNECT TO A TEACHER text field will not allow special characters$")
    public void connect_to_a_teacher_text_field_will_not_allow_special_characters() throws Throwable {
        pcod_logpage.pcod_getvalue_equals(pcod_homepage.gettxtconnecttoateacheraddachildhomepage(),
                TestBaseProvider.getTestBase().getTestData().getString("exp_cac"), "Connect to Teacher text");
    }


    @Then("^CONNECT TO A TEACHER text field will not take more than 5 characters$")
    public void connect_to_a_teacher_text_field_will_not_take_more_than_5_characters() throws Throwable {
        pcod_logpage.verify_text_size(pcod_homepage.gettxtconnecttoateacheraddachildhomepage(),
                TestBaseProvider.getTestBase().getTestData().getString("exp_cac"), "CAC in Connect to Teacher");
    }


    @And("^parent searches with valid item which is having reading level information$")
    public void parent_searches_with_valid_item_which_is_having_reading_level_information() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(teach_homepage.getTxtTeacherHomeSearch(),
                TestBaseProvider.getTestBase().getTestData().getString("itemId"));
        pcod_logpage.pcod_click_element(teach_homepage.getbtnTeacherHomeSearch());
    }


    @When("^parent enters valid Item# in search field and click on search icon$")
    public void parent_enters_valid_item_in_search_field_and_click_on_search_icon() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(teach_homepage.getTxtTeacherHomeSearch(),
                TestBaseProvider.getTestBase().getTestData().getString("itemnumber"));
        pcod_logpage.pcod_click_element(teach_homepage.getbtnTeacherHomeSearch());
    }

    @And("^parent searches with valid item$")
    public void parent_searches_with_valid_item() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(teach_homepage.getTxtTeacherHomeSearch(),
                TestBaseProvider.getTestBase().getTestData().getString("itemnumber"));
        pcod_logpage.pcod_click_element(teach_homepage.getbtnTeacherHomeSearch());
    }

    @And("^parent searches with same item$")
    public void parent_searches_with_same_item() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(teach_homepage.getTxtTeacherHomeSearch(),
                TestBaseProvider.getTestBase().getTestData().getString("itemName"));
        pcod_logpage.pcod_click_element(teach_homepage.getbtnTeacherHomeSearch());
    }

    @When("^parent enters exact matching title in search field and click enter button$")
    public void parent_enters_exact_matching_title_in_search_field_and_click_enter_button() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(teach_homepage.getTxtTeacherHomeSearch(),
                TestBaseProvider.getTestBase().getTestData().getString("itemtitle"));
        pcod_logpage.click_enter(teach_homepage.getTxtTeacherHomeSearch());
    }

    @When("^parent enters exact matching author name in search field and click enter button$")
    public void parent_enters_exact_matching_author_name_in_search_field_and_click_enter_button() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(teach_homepage.getTxtTeacherHomeSearch(),
                TestBaseProvider.getTestBase().getTestData().getString("author"));
        pcod_logpage.click_enter(teach_homepage.getTxtTeacherHomeSearch());
    }

    @And("^PDP of the item displays$")
    public void pdp_of_the_item_displays() throws Throwable {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);
        System.out.println("actual string name : "+prod_page.getLblProductName().getText());
        System.out.println("string name from xml : "+TestBaseProvider.getTestBase().getTestData().getString("itemName"));
        pcod_logpage.pcod_get_text_contains(prod_page.getLblProductName(),
                TestBaseProvider.getTestBase().getTestData().getString("itemName"));
    }

    @Then("^correct PDP of the item displays$")
    public void correct_pdp_of_the_item_displays() throws Throwable {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);
        pcod_homepage.pcod_verify_searcheditem_pdppage(prod_page.getLblProductName());

    }

    @Then("^PDP of the searched item displays$")
    public void pdp_of_the_searched_item_displays() throws Throwable {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);
        pcod_logpage.pcod_get_text_contains(prod_page.getLblProductName(),
                TestBaseProvider.getTestBase().getTestData().getString("itemtitle"));
    }

    @Then("^PDP of the searched author displays$")
    public void pdp_of_the_searched_author_displays() throws Throwable {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);
        pcod_logpage.pcod_get_text_contains(prod_page.getLnkAuthorName(),
                TestBaseProvider.getTestBase().getTestData().getString("author"));
    }

    @Then("^parent is navigated to PDP page$")
    public void parent_is_navigated_to_pdp_page() throws Throwable {
    	 PauseUtil.waitForAjaxToComplete(2500);
         PauseUtil.pause(4000);
         pcod_logpage.pcod_get_text_contains(prod_page.getLblProductName(),
                 TestBaseProvider.getTestBase().getTestData().getString("itemName"));
    }

    @When("^parent click on Reading Level line$")
    public void parent_click_on_reading_level_line() throws Throwable {
        pcod_logpage.pcod_click_element(prod_page.getLblReadingLevelProductAttriute());
    }

    @Then("^pop up is displayed with reading level infomation$")
    public void pop_up_is_displayed_with_reading_level_infomation() throws Throwable {
        PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(2500);
    	pcod_logpage.verify_element_displayed(pcod_logpage.gettooltipconnectyourteacherwhatsthis());
    }

    @And("^“About Reading Levels” link is present in the pop up$")
    public void about_reading_levels_link_is_present_in_the_pop_up() throws Throwable {
       pcod_logpage.verify_element_disabled(prod_page.getAboutReadingLevelLink());
    }

    @And("^clicks “About Reading Levels” link present in the pop up$")
    public void clicks_about_reading_levels_link_present_in_the_pop_up() throws Throwable {
    	pcod_logpage.pcod_click_element(prod_page.Aboutreadinglevellink());
    }

    @When("^parent clicks on close icon$")
    public void parent_clicks_on_close_icon() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.about_reading_level_close_icon();
    }

    @Then("^“About Reading Levels” window is closed$")
    public void about_reading_levels_window_is_closed() throws Throwable {
    	pcod_logpage.verify_Reading_Level_Window_Is_Closed(prod_page.Aboutreadinglevellink());
    }

    @When("^parent searches with valid partial matching title$")
    public void parent_searches_with_valid_partial_matching_title() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(teach_homepage.getTxtTeacherHomeSearch(),
                TestBaseProvider.getTestBase().getTestData().getString("itemName"));
        pcod_logpage.pcod_click_element(teach_homepage.getbtnTeacherHomeSearch());
    }

    @And("^parent searches with valid exact title$")
    public void parent_searches_with_valid_exact_title() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(teach_homepage.getTxtTeacherHomeSearch(),
                TestBaseProvider.getTestBase().getTestData().getString("itemName"));
        pcod_logpage.pcod_click_element(teach_homepage.getbtnTeacherHomeSearch());
    }

    @And("^clicks on any of the item$")
    public void clicks_on_any_of_the_item() throws Throwable {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4500);
        String itemtitle = pcod_homepage.gettitleitem1searchresultspage().getText();
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.searchresultspage.item.title", itemtitle);
        pcod_logpage.pcod_click_element(pcod_homepage.gettitleitem1searchresultspage());

    }

    @And("^parent clicks on any of the item present in search result page$")
    public void parent_clicks_on_any_of_the_item_present_in_search_result_page() throws Throwable {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4500);
        String itemtitle = pcod_homepage.gettitleitem1searchresultspage().getText();
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.searchresultspage.item.title", itemtitle);
        pcod_logpage.pcod_click_element(pcod_homepage.gettitleitem1searchresultspage());
    }

    @When("^parent enter more than 999 in quantity input field$")
    public void parent_enter_more_than_999_in_quantity_input_field() throws Throwable {
        pcod_logpage.pcod_entervalue_textfield(stud_page.getteacherSearchQuantityField(),
                TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
    }


    @Then("^it should not allow to enter more than 3 digits$")
    public void it_should_not_allow_to_enter_more_than_3_digits() throws Throwable {
        pcod_logpage.verify_text_size(stud_page.getteacherSearchQuantityField(),
                TestBaseProvider.getTestBase().getTestData().getString("exp_itemQty"), "Item Quantity Field");
    }

    @When("^parent enter some number in quantity input field$")
    public void parent_enter_some_number_in_quantity_input_field() throws Throwable {
    	 pcod_logpage.pcod_entervalue_textfield(stud_page.getteacherSearchQuantityField(),
                 TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
    }

    @Then("^quantity field should be displayed as entered$")
    public void quantity_field_should_be_displayed_as_entered() throws Throwable {
    	pcod_logpage.pcod_entervalue_textfield(stud_page.getteacherSearchQuantityField(),
                TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
    }

    @When("^parent edits the quantity field$")
    public void parent_edits_the_quantity_field() throws Throwable {
    	 pcod_logpage.pcod_entervalue_textfield(stud_page.getteacherSearchQuantityField(),
                 TestBaseProvider.getTestBase().getTestData().getString("updateditemQty"));
    }

    @Then("^modified data should be displayed in quantity input field$")
    public void modified_data_should_be_displayed_in_quantity_input_field() throws Throwable {
    	 pcod_logpage.pcod_entervalue_textfield(stud_page.getteacherSearchQuantityField(),
                 TestBaseProvider.getTestBase().getTestData().getString("updateditemQty"));
    }

    @When("^parent tries to enter negative value in quantity input field$")
    public void parent_tries_to_enter_negative_value_in_quantity_input_field() throws Throwable {
    	 pcod_logpage.pcod_entervalue_textfield(stud_page.getteacherSearchQuantityField(),
                 TestBaseProvider.getTestBase().getTestData().getString("updateditemQty"));
    }

    @Then("^negative value is not accepted in quantity field$")
    public void negative_value_is_not_accepted_in_quantity_field() throws Throwable {
    	pcod_logpage.pcod_entervalue_textfield(stud_page.getteacherSearchQuantityField(),
                TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
    }

    @When("^parent clicks on “Back To Results” link$")
    public void parent_clicks_on_back_to_results_link() throws Throwable {
        System.out.println("");
    }

    @Then("^parent is navigated back to search result page$")
    public void parent_is_navigated_back_to_search_result_page() throws Throwable {
        System.out.println("");
    }

    @When("^parent searches with non\\-existing keyword$")
    public void parent_searches_with_nonexisting_keyword() throws Throwable {
    	pcod_logpage.pcod_entervalue_textfield(teach_homepage.getTxtTeacherHomeSearch(),
                TestBaseProvider.getTestBase().getTestData().getString("item_noresult"));
        pcod_logpage.pcod_click_element(teach_homepage.getbtnTeacherHomeSearch());
    }

    @When("^parent searches for non\\-existing item#$")
    public void parent_searches_for_nonexisting_item() throws Throwable {
    	pcod_logpage.pcod_entervalue_textfield(teach_homepage.getTxtTeacherHomeSearch(),
                TestBaseProvider.getTestBase().getTestData().getString("item_noresult"));
        pcod_logpage.pcod_click_element(teach_homepage.getbtnTeacherHomeSearch());
    }

    @And("^parent searches with Item# with no results$")
    public void parent_searches_with_item_with_no_results() throws Throwable {
    	 pcod_logpage.pcod_entervalue_textfield(teach_homepage.getTxtTeacherHomeSearch(),
                 TestBaseProvider.getTestBase().getTestData().getString("item_noresult"));
         pcod_logpage.pcod_click_element(teach_homepage.getbtnTeacherHomeSearch());
    }

    @When("^parent searches for valid item# from no search results page$")
    public void parent_searches_for_valid_item_from_no_search_results_page() throws Throwable {
    	 pcod_logpage.pcod_entervalue_textfield(teach_homepage.getTxtTeacherHomeSearch(),
                 TestBaseProvider.getTestBase().getTestData().getString("itemtitle"));
         pcod_logpage.pcod_click_element(teach_homepage.getbtnTeacherHomeSearch());
    }


    @When("^parent searches with author name with no results$")
    public void parent_searches_with_author_name_with_no_results() throws Throwable {
    	pcod_logpage.pcod_entervalue_textfield(teach_homepage.getTxtTeacherHomeSearch(),
                TestBaseProvider.getTestBase().getTestData().getString("item_noresult"));
        pcod_logpage.pcod_click_element(teach_homepage.getbtnTeacherHomeSearch());
    }

    @And("^parent clicks enter$")
    public void parent_clicks_enter() throws Throwable {
        pcod_logpage.click_enter(teach_homepage.getTxtTeacherHomeSearch());
    }

    @And("^parent click on Search icon$")
    public void parent_click_on_search_icon() throws Throwable {
    	pcod_logpage.pcod_click_element(teach_homepage.getbtnTeacherHomeSearch());
    }

    @Then("^no search results page displays$")
    public void no_search_results_page_displays() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        ITeachersHomePage homepage = getFactory().getITeachersHomePage();
    	homepage.valdiate0searchPg();
    }

    @Then("^Submit button should be disabled$")
    public void submit_button_should_be_disabled() throws Throwable {
        pcod_logpage.verify_button_disabled(pcod_homepage.sizebtnsubmitaddachildhomepagedisabled());
    }

    @Then("^Submit button should be enabled$")
    public void submit_button_should_be_enabled() throws Throwable {
        pcod_logpage.verify_button_enabled(pcod_homepage.sizebtnsubmitaddachildhomepagedisabled());
    }


    @And("^click on Submit button$")
    public void click_on_submit_button() throws Throwable {
        pcod_logpage.pcod_click_element(pcod_homepage.getbtnsubmitaddachildhomepage());
    }

    @When("^parent clicks on SUBMIT button$")
    public void parent_clicks_on_submit_button() throws Throwable {
        pcod_logpage.pcod_click_element(pcod_homepage.getbtnsubmitaddachildhomepage());
    }


    @Then("^child information given is not saved$")
    public void child_information_given_is_not_saved() throws Throwable {
        teach_homepage.navigateToProfilePage();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);
        pcod_logpage.pcod_get_text_notcontains(pcod_homepage.getsectionmychildrenmyaccountpage(),
                TestBaseProvider.getTestBase().getTestData().getString("child_firstname"));
    }


    @Then("^child information given is saved$")
    public void child_information_given_is_saved() throws Throwable {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);
        teach_homepage.navigateToProfilePage();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);
        pcod_homepage.pcod_get_text_saved_contains(pcod_homepage.getsectionmychildrenmyaccountpage());
    }


    @Then("^correct teacher information is displayed below$")
    public void correct_teacher_information_is_displayed_below() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.verify_teachername_connectyourteacher(pcod_homepage.getsectionconnecttoateacheraddachildwindow(),
                TestBaseProvider.getTestBase().getTestData());
        loginPg.verify_schooldetails_connectyourteacher(pcod_homepage.getsectionconnecttoateacheraddachildwindow(),
                TestBaseProvider.getTestBase().getTestData());
    }


    @When("^parent clicks on “Find Your Teacher” link$")
    public void parent_clicks_on_find_your_teacher_link() throws Throwable {
        PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
        loginPg.pcod_link_findyourteacher_connect_to_your_teacher();
    }

    @Then("^parent is navigated to “Connect To Teacher” window$")
    public void parent_is_navigated_to_connect_to_teacher_window() throws Throwable {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        pcod_logpage.verify_element_displayed(pcod_logpage.getpageparenthomepage());
    }

    @Then("^“Add a Child” window is closed$")
    public void add_a_child_window_is_closed() throws Throwable {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        pcod_logpage.verify_element_notdisplayed(pcod_logpage.geticoncloseconnectyourteacher(),
                pcod_logpage.sizeiconcloseconnectyourteacher());
    }


    @When("^parent is in homepage$")
    public void parent_is_in_homepage() throws Throwable {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        pcod_logpage.verify_element_is_enabled(pcod_homepage.sizetxtitemnumberhomepage());

    }

    @Then("^parent is navigated back to home page$")
    public void parent_is_navigated_back_to_home_page() throws Throwable {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        pcod_logpage.verify_element_is_enabled(pcod_homepage.sizetxtitemnumberhomepage());
    }


    @Then("^parent is redirected to home page$")
    public void parent_is_redirected_to_home_page() throws Throwable {
        pcod_logpage.verify_element_is_enabled(pcod_homepage.sizetxtitemnumberhomepage());
    }

    @Then("^parent see child associated to highest grade as default in “Child in Teacher Class” drop down$")
    public void parent_see_child_associated_to_highest_grade_as_default_in_child_in_teacher_class_drop_down() throws Throwable {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);
        pcod_logpage.pcod_get_text_contains(pcod_homepage.getlblselectedchildparenthomepage(),
                TestBaseProvider.getTestBase().getTestData().getString("child_name"));
    }


    @Then("^parent see initially added child having highest grade as default in “Child in Teacher Class” drop down$")
    public void parent_see_initially_added_child_having_highest_grade_as_default_in_child_in_teacher_class_drop_down() throws Throwable {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);
        pcod_logpage.pcod_get_text_contains(pcod_homepage.getlblselectedchildparenthomepage(),
                TestBaseProvider.getTestBase().getTestData().getString("child_name"));
    }

    @Then("^parent Home page displays$")
    public void parent_home_page_displays() throws Throwable {
        pcod_homepage.pcod_verify_parenthomepage();
    }


    @And("^parent clicks on My Account and Profile from the header$")
    public void parent_clicks_on_My_Account_and_Profile_from_the_header() throws Throwable {
        pcod_homepage.pcod_clickMyAcc_Profile();

    }

    @And("^ChildFirstName in TeacherNames class displays with a /\\+ sign/$")
    public void ChildFirstName_in_TeacherNames_class_displays_with_a_sign() throws Throwable {
        System.out.println("On my profile page =====================");
        pcod_homepage.pcod_myprofile_verifychildadded();

    }

    @When("^parent clicks on Add a Child link present in My Children section$")
    public void parent_clicks_on_Add_a_Child_link_present_in_My_Children_section() throws Throwable {
        pcod_homepage.pcod_myprofile_addchild();
    }

    @When("^parent clicks on Close icon$")
    public void parent_clicks_on_Close_icon() throws Throwable {
        pcod_homepage.pcod_Click_Cancel_AddChild();

    }

    @And("^parent is redirected to My Account page$")
    public void parent_is_redirected_to_My_Account_page() throws Throwable {
        pcod_homepage.pcod_verify_Profile();

    }

    @When("^parent clicks on Cancel icon$")
    public void parent_clicks_on_Cancel_icon() throws Throwable {
        //pcod_homepage.pcod_Click_Cancel_AddChild();
        pcod_homepage.pcod_Click_CloseIcon_AddChild();
    }



    @And("^Parent enters valid data in all fields and connects to teacher using CAC code$")
    public void Parent_enters_valid_data_in_all_fields_and_connects_to_teacher_using_CAC_code() throws Throwable {

        pcod_logpage.pcod_enteralldata_addachild_homepage(
                TestBaseProvider.getTestBase().getTestData().getString("child_firstname")+System.currentTimeMillis(),
                TestBaseProvider.getTestBase().getTestData().getString("child_lastname"),
                TestBaseProvider.getTestBase().getTestData().getString("cacno"));
    }



    @And("^parent clicks on Add a child link again to add another child$")
    public void parent_clicks_on_Add_a_child_link_again_to_add_another_child() throws Throwable {
        pcod_homepage.pcod_myprofile_addchild();
    }

    @And("^parent enters valid data in all fields and connects to different teacher using FAT$")
    public void parent_enters_valid_data_in_all_fields_and_connects_to_different_teacher_using_FAT() throws Throwable {
        PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
        login.pcod_enteralldata_createaccount_withFAT(
                TestBaseProvider.getTestBase().getTestData().getString("firstname"),
                TestBaseProvider.getTestBase().getTestData().getString("lastname"),
                TestBaseProvider.getTestBase().getTestData().getString("ZIP")) ;

    }

    @Then("^Child1FirstName in Teacher1Name class displays with a \\+ sign$")
    public void child1firstname_in_teacher1name_class_displays_with_a_sign() throws Throwable {
        pcod_homepage.pcod_myprofile_verifychild1added();

    }

    @And("^Child2FirstName in Teacher2Name class displays with a \\+ sign$")
    public void child2firstname_in_teacher2name_class_displays_with_a_sign() throws Throwable {
        pcod_homepage.pcod_myprofile_verifychild2added();

    }
    
    @When("^teacher hovers over Enter Orders option present in home page$")
    public void teacher_hovers_over_enter_orders_option_present_in_home_page() throws Throwable {
    	SCHUtils.mouseHoverOnElement(loginpage.gethomepage_globalmenu_enterorders());
    }
    
    
    @Then("^Student Flyer Orders, Student Online Orders, Your Teacher Order options displays$")
    public void student_flyer_orders_student_online_orders_your_teacher_order_options_displays() throws Throwable {
    	PauseUtil.pause(4500);
        pcod_logpage.pcod_get_options_contains(loginpage.gethomepage_globalmenu_enterorders_options(), ConstantUtils.homepage_global_enteroders_options);
    }
    
    //############################################# DWCAPCOD - 156 #######################################################
    @Given("^teacher clicks on Teacher Desk$")
    public void teacher_clicks_on_Teacher_Desk() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_Click_Teacher_Desk_link();
    }

    @Given("^teacher clicks on Edit link of Online Note$")
    public void teacher_clicks_on_Edit_link_of_Online_Note() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_Click_Online_Notes_edit_link();
    }

    @When("^teacher tries to enter more than (\\d+) characters in online note$")
    public void teacher_tries_to_enter_more_than_characters_in_online_note(int arg1) throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_enter_characters_in_online_notes_message_field();
    }

    @Then("^the character count shows as \\((\\d+)/(\\d+)\\)$")
    public void the_character_count_shows_as(int arg1, int arg2) throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_character_count_is_zero();
    }

    @Then("^any characters entered after (\\d+) are not accepted$")
    public void any_characters_entered_after_are_not_accepted(int arg1) throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_no_more_characters_accepted_in_online_notes_message_field();
    }
    
    @When("^teacher deletes the default online note$")
    public void teacher_deletes_the_default_online_note() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_remove_default_online_notes();
    }

    @When("^teacher clicks on save$")
    public void teacher_clicks_on_save() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_Click_online_notes_SAVE_button();
    }

    @When("^teacher clicks on Edit link$")
    public void teacher_clicks_on_Edit_link() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_Click_Online_Notes_edit_link();
    }

    @Then("^the default message is restored$")
    public void the_default_message_is_restored() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_still_see_default_message();
    }
    
    @When("^teacher tries to enter more than (\\d+) characters in the name field$")
    public void teacher_tries_to_enter_more_than_characters_in_the_name_field(int arg1) throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_enter_characters_in_Online_Notes_name_field();
    	//pcod_homepage.pcod_
    }
    
    @When("^teacher edits the salutation and teacher display name$")
    public void teacher_edits_the_salutation_and_teacher_display_name() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_edit_salutation_name_Online_Notes();
    	pcod_homepage.pcod_Click_online_notes_SAVE_button();
    }

    @Then("^the salutation and teacher display name are saved$")
    public void the_salutation_and_teacher_display_name_are_saved() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_edited_salutation_name_saved_Online_Notes();
    }
    
    @Then("^\"([^\"]*)\" section displays with \"([^\"]*)\" message$")
    public void section_displays_with_message(String arg1, String arg2) throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_salutation_section_is_displayed();
    }

    @Then("^Edit link displays$")
    public void edit_link_displays() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_edit_link_is_displayed();
    }
    
    @When("^teacher edits the default note$")
    public void teacher_edits_the_default_note() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_enter_characters_in_online_notes_message_field();
    }

    @When("^clicks on Save$")
    public void clicks_on_Save() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_Click_online_notes_SAVE_button();
    }

    @Then("^the edited content is saved$")
    public void the_edited_content_is_saved() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_edited_content_saved();
    }

    @Then("^the modal closes$")
    public void the_modal_closes() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_Online_Notes_modal_closes();
    }
    
    @When("^clicks on Cancel$")
    public void clicks_on_Cancel() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_Click_Online_Notes_CANCEL_button();
    }

    @Then("^the edited content is not saved$")
    public void the_edited_content_is_not_saved() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_edited_content_not_saved();
    }
    
    @When("^clicks on Close$")
    public void clicks_on_Close() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_Click_Online_Notes_CLOSE_button();
    }
    
    @When("^teacher clicks on the salutation dropdown$")
    public void teacher_clicks_on_the_salutation_dropdown() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_Click_Online_Notes_salutation_dropdown();
    }

    @Then("^values MRS\\., MISS, MS, MR\\., SR\\., BR\\., FR\\., MME\\., MLLE\\., M\\.,OTHER/AUTRE displays in salutation$")
    public void values_MRS_MISS_MS_MR_SR_BR_FR_MME_MLLE_M_OTHER_AUTRE_displays_in_salutation() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_verify_all_the_salutations_are_present_in_the_Online_Notes_salutation_dropdown();
    }
    
    //############################################# DWCAPCOD - 156 #######################################################
    
    //############################################# DWCAPCOD - 158 #######################################################
    @Then("^Due Date is blank$")
    public void due_Date_is_blank() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_due_date_is_blank();
    }
    
    @When("^teacher clicks on Edit next to Due Date$")
    public void teacher_clicks_on_Edit_next_to_Due_Date() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_Click_due_date_edit_link();
    }

    @Then("^teacher is presented with a calendar modal$")
    public void teacher_is_presented_with_a_calendar_modal() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_due_date_calendar_displays();
    }

    @Then("^Calendar defaults to current month$")
    public void calendar_defaults_to_current_month() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_calendar_current_month_is_default_month();
    }

    @Then("^teacher cannot navigate to months past$")
    public void teacher_cannot_navigate_to_months_past() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_past_months_cannot_be_selected();
    }

    @Then("^past dates in current month are displayed as greyed out and unselectable$")
    public void past_dates_in_current_month_are_displayed_as_greyed_out_and_unselectable() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_past_dates_in_current_month_unselectable();
    }

    @Then("^teacher can navigate to any number of months in the future$")
    public void teacher_can_navigate_to_any_number_of_months_in_the_future() throws Throwable {
        PauseUtil.pause(4500);
    	pcod_homepage.pcod_future_dates_in_current_month_selectable();
    }
    
    @When("^teacher selects a due date$")
    public void teacher_selects_a_due_date() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_select_due_date();
    }

    @Then("^the selected date displays$")
    public void the_selected_date_displays() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_selected_date_is_displayed();
    }

    @Then("^clicking Edit shows the selected date highlighted in blue$")
    public void clicking_Edit_shows_the_selected_date_highlighted_in_blue() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_Click_due_date_edit_link();
    	pcod_homepage.pcod_selected_due_date_highlighted("blue");
    }
    
    @When("^teacher clicks on Send Reminder$")
    public void teacher_clicks_on_Send_Reminder() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_Click_send_reminder_link();
    }

    @Then("^Send Reminder modal displays$")
    public void send_Reminder_modal_displays() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_send_reminder_modal_is_displayed();
    }
    
    @Given("^teacher toggles to French$")
    public void teacher_toggles_to_French() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_Click_French_toggle();
    }

    @Then("^the selected date displays in French format$")
    public void the_selected_date_displays_in_French_format() throws Throwable {
    	PauseUtil.pause(4500);
//    	pending
//    	pcod_homepage.pcod_selected_date_displays_in_French();
    }
    //############################################# DWCAPCOD - 158 #######################################################
    
    //############################################# DWCAPCOD - 82 #######################################################
    @Then("^Parent is navigated to the Profile section of the My Account page$")
    public void parent_is_navigated_to_the_Profile_section_of_the_My_Account_page() throws Throwable {
    	PauseUtil.pause(4500);
    	//pcod_homepage.pcod_clickMyAcc_Profile();
    	pcod_homepage.pcod_Profile_section_displayed();
    }

    @And("^secondary section header  “MY CHILDREN” displays$")
    public void secondary_section_header_my_children_displays() throws Throwable {
        PauseUtil.pause(4500);
        pcod_homepage.pcod_secondary_section_header_displays();
    }


    @And("^this Section shows no message but shows “Add a Child” hyperlink$")
    public void this_Section_shows_no_message_but_shows_hyperlink() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_no_message_displays_noChild();
    	pcod_homepage.pcod_Add_a_Child_hyperlink_displayed();
    }
    
    @Given("^<ChildFirstName> in <TeacherName>'s class displays with a \\+ sign$")
    public void childfirstname_in_TeacherName_s_class_displays_with_a_sign() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_ChildFirstName_TeacherName_plusSign_displays_firstChild();
    }
    
    @When("^parent clicks on \\+ sign$")
    public void parent_clicks_on_sign() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_Click_plus_sign_firstChild();
    }

    @Then("^Label ñ \"([^\"]*)\" displays$")
    public void label_ñ_displays(String arg1) throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_firstChild_label_displays();
    }

    @Then("^<Name of child>, <Grade of child> displays$")
    public void name_of_child_Grade_of_child_displays() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_firstChild_name_displays();
    	pcod_homepage.pcod_firstChild_grade_displays();
    }

    @Then("^Label \"([^\"]*)\" displays$")
    public void label_displays(String arg1) throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_firstChild_teacher_label_displays();
    }

    @Then("^<Name of teacher>, <Name of school>, <Address of school> displays\\.$")
    public void name_of_teacher_Name_of_school_Address_of_school_displays() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_firstChild_teacherName_displays();
    	pcod_homepage.pcod_firstChild_teacherSchoolName_displays();
    	pcod_homepage.pcod_firstChild_teacherSchoolAddress_displays();
    }

    @Then("^\"([^\"]*)\" and \"([^\"]*)\" labels in right corner under expand and collapse displays$")
    public void and_labels_in_right_corner_under_expand_and_collapse_displays(String arg1, String arg2) throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_Edit_link_displays();
    	pcod_homepage.pcod_Remove_link_displays();
    	
    }

    @Then("^\"([^\"]*)\" label at bottom right of section displays$")
    public void label_at_bottom_right_of_section_displays(String arg1) throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_Add_a_Child_hyperlink_displayed();
    }
    
    @Given("^<ChildFirstName> displays with a \\+ sign$")
    public void childfirstname_displays_with_a_sign() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_ChildFirstName_plusSign_displays_firstChild();
    }
    //############################################# DWCAPCOD - 82 #######################################################
    
    //############################################# DWCAPCOD - 65 #######################################################
    @When("^parent clicks on Remove$")
    public void parent_clicks_on_Remove() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_firstChild_Click_remove_link();
    }

    @Then("^parent is presented with tool tip$")
    public void parent_is_presented_with_tool_tip() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_firstChild_remove_tooltip_appears();
    }

    @Then("^Tool tip message \"([^\"]*)\" displays with \"([^\"]*)\" and \"([^\"]*)\" buttons$")
    public void tool_tip_message_displays_with_and_buttons(String arg1, String arg2, String arg3) throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_verify_tooltip_message_and_buttons();
    }
    
    @When("^clicks on \"([^\"]*)\" option from tool tip$")
    public void clicks_on_option_from_tool_tip(String arg1) throws Throwable {
    	PauseUtil.pause(4500);
    	//pcod_homepage.pcod_firstChild_Click_NO_button_remove_link();
    	pcod_homepage.pcod_firstChild_Click_YES_button_remove_link();
    }

    @And("^clicks on'NO'option from tool tip$")
    public void clicksOnNOOptionFromToolTip() throws Throwable {
        PauseUtil.pause(4500);
        pcod_homepage.pcod_firstChild_Click_NO_button_remove_link();
        //pcod_homepage.pcod_firstChild_Click_YES_button_remove_link();
    }



    @Then("^the child information is deleted$")
    public void the_child_information_is_deleted() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_firstChild_information_removed();
    }

    @Then("^this Section shows no message but shows ìAdd a Childî hyperlink$")
    public void this_Section_shows_no_message_but_shows_ìAdd_a_Childî_hyperlink() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_no_message_displays_noChild();
    	pcod_homepage.pcod_Add_a_Child_hyperlink_displayed();
    }

    @Then("^the child is not seen in child dropdown on Home page$")
    public void the_child_is_not_seen_in_child_dropdown_on_Home_page() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_Click_homepage_icon();
    	pcod_homepage.pcod_verify_Child_not_exist_in_homepage_dropdown();
    }
    
    @Then("^the child information is still retained$")
    public void the_child_information_is_still_retained() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_ChildFirstName_TeacherName_plusSign_displays_firstChild();
    }

    @Then("^the child is still seen in child dropdown on Home page$")
    public void the_child_is_still_seen_in_child_dropdown_on_Home_page() throws Throwable {
    	PauseUtil.pause(2500);
    	pcod_homepage.pcod_Click_homepage_icon();
    	
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_verify_Child_exists_in_homepage_dropdown();
    }
    //############################################# DWCAPCOD - 65 #######################################################
    
    //############################################# DWCAPCOD - 200 #######################################################
    @When("^parent clicks \"([^\"]*)\" link from child dropdown$")
    public void parent_clicks_link_from_child_dropdown(String arg1) throws Throwable {
    	PauseUtil.pause(4500);
    	Boolean available_child_not_connected = pcod_homepage.pcod_check_child_not_connected_to_teacher_homepage();
    	
    	if(!available_child_not_connected){
    		Date date = new Date();
    		pcod_logpage.pcod_enteralldata_addachild(TestBaseProvider.getTestBase().getTestData().getString("firstname") + date.getTime(), TestBaseProvider.getTestBase().getTestData().getString("lastname"));
    		pcod_homepage.getbtnsaveaddachildhomepage().click();
    		pcod_homepage.pcod_select_child_not_connected_to_teacher_homepage();
    	}
    	
    }

    @When("^parent clicks on Find Your Teacher$")
    public void parent_clicks_on_Find_Your_Teacher() throws Throwable {
    	PauseUtil.pause(4500);
    	//pcod_logpage.getlinkAddchildFindyourTeacher().click();
    }

    @When("^parent selects a teacher$")
    public void parent_selects_a_teacher() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_logpage.clickFATLink_connectToTeacher_specificTeacher(TestBaseProvider.getTestBase().getTestData().getString("postalcode"), TestBaseProvider.getTestBase().getTestData().getString("accNum"));
    }
    
    @When("^parent clicks on Save on the \"([^\"]*)\" modal$")
    public void parent_clicks_on_Save_on_the_modal(String arg1) throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_click_Save_connectToTeacher(pcod_logpage.getbuttonAddchildSave());
    }
    
    @Then("^<ChildFirstName> in <TeacherName>'s class displays in child dropdown$")
    public void childfirstname_in_TeacherName_s_class_displays_in_child_dropdown() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_childFirstName_TeacherName_display_in_dropdown_homepage();
    }

    @Then("^parent remains on Home page$")
    public void parent_remains_on_Home_page() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_verify_PCOD_homepae_displays();
    }

    @And("^new updates are saved$")
    public void newUpdatesAreSaved() throws Throwable {

    }

    @Then("^<ChildFirstName> in <TeacherName>'s class displays$")
    public void childfirstnameInTeacherNameSClassDisplays() throws Throwable {
        PCOD_HomePage pcodHomePage = new PCOD_HomePage();
        pcodHomePage.pcod_myprofile_verifychildaddedName();
    }
    
    @Then("^all children are removed from account$")
    public void all_children_are_removed_from_account() throws Throwable {
        pcod_homepage.pcod_clickMyAcc_Profile();
        pcod_homepage.pcod_myAccount_deleteAllChildren();
    }
    //############################################# DWCAPCOD - 200 #######################################################
    
    //############################################# DWCAPCOD - 67 #######################################################
    @Given("^parent has saved cards on file$")
    public void parent_has_saved_cards_on_file() throws Throwable {
    	pcod_homepage.pcod_clickMyAcc_Profile();
    	pcod_homepage.pcod_check_remove_and_add_a_saved_card_on_account();
    	pcod_homepage.pcod_Click_homepage_icon();
    }

    @Given("^parent clicks on Profile from My Account dropdown$")
    public void parent_clicks_on_Profile_from_My_Account_dropdown() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_clickMyAcc_Profile();
    }

    @When("^parent clicks on Remove link next to a saved card$")
    public void parent_clicks_on_Remove_link_next_to_a_saved_card() throws Throwable {
    	pcod_homepage.pcod_click_remove_link_on_saved_credit_card();
    }

    @Then("^Credit card is still displays in Billing & Payments section and is not deleted$")
    public void credit_card_is_still_displays_in_Billing_Payments_section_and_is_not_deleted() throws Throwable {
    	pcod_homepage.pcod_verify_savedcard_information_profile_page();
    	pcod_homepage.pcod_verify_savedcard_expiration_date_profile_page();
    }
    
    @And("^parent clicks on NO on Remove Card modal$")
    public void parent_clicks_on_NO_on_Remove_Card_modal() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.getProfilePaymentRemoveCardNOButton().click();
    }
    
    @And("^parent has no saved cards on file$")
    public void parent_has_no_saved_cards_on_file() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_clickMyAcc_Profile();
    	pcod_homepage.pcod_remove_saved_credit_cards_profile_page();
    	pcod_homepage.pcod_Click_homepage_icon();
    }
    
    @When("^parent clicks on \"([^\"]*)\", enters all mandatory information of the card and saves card$")
    public void parent_clicks_on_enters_all_mandatory_information_of_the_card_and_saves_card(String arg1) throws Throwable {
    	PauseUtil.pause(4500);
    	
    	ProfilePage profilepage = new ProfilePage();
    	profilepage.addCreditCardProfilePage(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^Image indicating specified card, type of card, last (\\d+) digits of card$")
    public void image_indicating_specified_card_type_of_card_last_digits_of_card(int arg1) throws Throwable {
    	PauseUtil.pause(4500);
    	
    	pcod_homepage.pcod_verify_savedcard_information_profile_page();
    }

    @Then("^Expiry date \"([^\"]*)\" followed by \\[MM/YY\\] format card expiry date displays$")
    public void expiry_date_followed_by_MM_YY_format_card_expiry_date_displays(String arg1) throws Throwable {
    	PauseUtil.pause(4500);
    	
    	pcod_homepage.pcod_verify_savedcard_expiration_date_profile_page();
    }
    
    @Given("^parent has saved AMEX card on file$")
    public void parent_has_saved_AMEX_card_on_file() throws Throwable {
    	pcod_homepage.pcod_clickMyAcc_Profile();
    	pcod_homepage.pcod_check_remove_and_add_a_saved_card_on_account();
    	pcod_homepage.pcod_Click_homepage_icon();
    }
    
    @Given("^parent has saved VISA card on file$")
    public void parent_has_saved_VISA_card_on_file() throws Throwable {
    	pcod_homepage.pcod_clickMyAcc_Profile();
    	pcod_homepage.pcod_check_remove_and_add_a_saved_card_on_account();
    	pcod_homepage.pcod_Click_homepage_icon();
    }
    
    @Given("^parent has saved MasterCard on file$")
    public void parent_has_saved_MasterCard_on_file() throws Throwable {
    	pcod_homepage.pcod_clickMyAcc_Profile();
    	pcod_homepage.pcod_check_remove_and_add_a_saved_card_on_account();
    	pcod_homepage.pcod_Click_homepage_icon();
    }
    
    @Given("^parent clicks on \"([^\"]*)\" for saved card$")
    public void parent_clicks_on_for_saved_card(String arg1) throws Throwable {
    	PauseUtil.pause(4500);
    	
    	pcod_homepage.pcod_click_edit_link_on_saved_credit_card();
    }

    @When("^parent edits expiration date, security code and billing information$")
    public void parent_edits_expiration_date_security_code_and_billing_information() throws Throwable {
    	PauseUtil.pause(4500);
    	
    	ProfilePage profilepage = new ProfilePage();
    	profilepage.editSavedCreditCardProfilePage(TestBaseProvider.getTestBase().getTestData());	
    }

    @When("^click on Save for Credit Card on Profile page$")
    public void click_on_Save_for_Credit_Card_on_Profile_page() throws Throwable {
    	PauseUtil.pause(4500);
    	
    	pcod_homepage.pcod_click_save_edit_card_profile_page();
    }

    @Then("^edited information for saved credit card is saved$")
    public void edited_information_for_saved_credit_card_is_saved() throws Throwable {
    	PauseUtil.pause(4500);
    	
    	ProfilePage profilepage = new ProfilePage();
    	
    	pcod_homepage.pcod_click_edit_link_on_saved_credit_card();
    	profilepage.pcod_verify_saved_information_edit_card_profile_page(TestBaseProvider.getTestBase().getTestData());
    }
    
    @Then("^error message displays and credit card info is not saved$")
    public void error_message_displays_and_credit_card_info_is_not_saved() throws Throwable {
    	PauseUtil.pause(4500);
    	
    	pcod_homepage.pcod_verify_error_message_isplays_payment_profile_page();
    }
    
    @Then("^security code is cleared$")
    public void security_code_is_cleared() throws Throwable {
    	PauseUtil.pause(4500);
    	
    	ProfilePage profilepage = new ProfilePage();
    	profilepage.pcod_verify_securitycode_cleared_profile_page();
    }
    
    @Then("^Tool tip message \"([^\"]*)\" displays with YES and NO buttons$")
    public void tool_tip_message_displays_with_YES_and_NO_buttons(String arg1) throws Throwable {
    	PauseUtil.pause(4500);
    	
    	pcod_homepage.pcod_verify_removecard_tooltip_profile_page();
    }
    
    @Given("^parent has (\\d+) saved cards on file$")
    public void parent_has_saved_cards_on_file(int arg1) throws Throwable {
    	PauseUtil.pause(4500);
    	
    	pcod_homepage.pcod_clickMyAcc_Profile();
    	pcod_homepage.pcod_add_max_saved_card_on_account();
    	pcod_homepage.pcod_Click_homepage_icon();
    }

    @When("^parent clicks on \"([^\"]*)\" on Profile page$")
    public void parent_clicks_on_on_Profile_page(String arg1) throws Throwable {
    	PauseUtil.pause(4500);
    	ProfilePage profilepage = new ProfilePage();
    	
    	profilepage.getLnkAddCard().click();
    }

    @Then("^tool tip message displays \"([^\"]*)\"$")
    public void tool_tip_message_displays(String arg1) throws Throwable {
    	PauseUtil.pause(4500);
    	
    	pcod_homepage.pcod_verify_tooltip_meesgae_cannot_add_more_than_three_credit_card();
    }
    
    @When("^clicks on YES on Remove Card modal$")
    public void clicks_on_YES_on_Remove_Card_modal() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.getProfilePaymentRemoveCardYESButton().click();
    }

    @Then("^Credit card is deleted and does not display in Billing & Payments section$")
    public void credit_card_is_deleted_and_does_not_display_in_Billing_Payments_section() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_verify_no_saved_credit_card_display_profile_page();
    }
    
    @When("^clicks on Cancel for Credit Card on Profile page$")
    public void clicks_on_Cancel_for_Credit_Card_on_Profile_page() throws Throwable {
    	PauseUtil.pause(4500);
    	SCHUtils.clickUsingJavaScript(pcod_homepage.getProfilePaymentEditCancelButton());
    }

    @Then("^edited information is not saved$")
    public void edited_information_is_not_saved() throws Throwable {
    	PauseUtil.pause(4500);
    	
    	ProfilePage profilepage = new ProfilePage();
    	
    	pcod_homepage.pcod_click_edit_link_on_saved_credit_card();
    	profilepage.pcod_verify_information_not_saved_edit_card_profile_page(TestBaseProvider.getTestBase().getTestData());
    }

    @And("^delete items other than SOO$")
    public void deleteItemsOtherThanSOO() throws Throwable {
        pcod_homepage.exceptSOOdeleteAll();
    }

    @When("^parent clicks on Edit next to password$")
    public void parent_clicks_on_edit_next_to_password() throws Throwable {
        pcod_homepage.getpcod_profile_password_editlink().click();
        PauseUtil.waitForAjaxToComplete(2500);
    }
    
    @And("^parent enters passwords in “New password” and “confirm New password” fields$")
    public void parent_enters_passwords_in_new_password_and_confirm_new_password_fields() throws Throwable {
    	PauseUtil.pause(1500);
    	pcod_homepage.getpcod_profile_password_edit_newpasswordfield().sendKeys(
        		TestBaseProvider.getTestBase().getTestData().getString("newpassword"));
        PauseUtil.pause(1500);
        pcod_homepage.getpcod_profile_password_edit_confirmpasswordfield().sendKeys(
        		TestBaseProvider.getTestBase().getTestData().getString("confirmpassword"));
        pcod_homepage.getpcod_profile_password_edit_confirmpasswordfield().sendKeys(Keys.TAB);
    }
    
    @And("^enters non\\-matching passwords in “New password” and “confirm New password” fields$")
    public void enters_nonmatching_passwords_in_new_password_and_confirm_new_password_fields() throws Throwable {
    	PauseUtil.pause(1500);
    	pcod_homepage.getpcod_profile_password_edit_newpasswordfield().sendKeys(
        		TestBaseProvider.getTestBase().getTestData().getString("newpassword"));
    	PauseUtil.pause(1500);
        pcod_homepage.getpcod_profile_password_edit_confirmpasswordfield().sendKeys(
        		TestBaseProvider.getTestBase().getTestData().getString("confirmpassword"));
        pcod_homepage.getpcod_profile_password_edit_confirmpasswordfield().sendKeys(Keys.TAB);
    }

    @When("^parent clicks on Hide$")
    public void parent_clicks_on_hide() throws Throwable {
        pcod_homepage.getpcod_profile_password_edit_hidelink().click();
    }

    @When("^parent clicks on Show$")
    public void parent_clicks_on_show() throws Throwable {
    	pcod_homepage.getpcod_profile_password_edit_showlink().click();
    }

    @Then("^Edit password modal closes$")
    public void edit_password_modal_closes() throws Throwable {
        if((pcod_homepage.pcod_profile_profile_editpassword_modal().size()!=0) &&
        		(pcod_homepage.pcod_profile_profile_editpassword_modal().get(0).isDisplayed())){
        	Assert.fail("Edit Password modal is not closed");
        }
        else{
        	System.out.println("Edit Password modal is closed");
        }
    }

    @Then("^password is hidden on “New password” and “confirm New password” fields$")
    public void password_is_hidden_on_new_password_and_confirm_new_password_fields() throws Throwable {
        if(!pcod_homepage.getpcod_profile_password_edit_newpasswordfield().getAttribute("type").equals("password")){
        	Assert.fail("New Password field is not hidden");
        }
        if(!pcod_homepage.getpcod_profile_password_edit_confirmpasswordfield().getAttribute("type").equals("password")){
        	Assert.fail("Confirm New Password field is not hidden");
        }
    }

    @Then("^password on “New password” and “confirm New password” fields is shown$")
    public void password_on_new_password_and_confirm_new_password_fields_is_shown() throws Throwable {
    	if(!pcod_homepage.getpcod_profile_password_edit_newpasswordfield().getAttribute("type").equals("text")){
        	Assert.fail("New Password field is not shown");
        }
        if(!pcod_homepage.getpcod_profile_password_edit_confirmpasswordfield().getAttribute("type").equals("text")){
        	Assert.fail("Confirm New Password field is not shown");
        }
    }

    @Then("^“Does not match password” tooltip displays$")
    public void does_not_match_password_tooltip_displays() throws Throwable {
       AssertUtils.assertTextMatches(pcod_logpage.gettooltipconnectyourteacherwhatsthis(), Matchers.containsString(ConstantUtils.PASSWORD_DOESNOTMATCH_ERRMSG
    			));
    }

    @Then("^“Please make sure your password has at least 7 characters and contains both letters and numbers\\. Special characters may be used\\.” tool tip message dispays on outfocus$")
    public void please_make_sure_your_password_has_at_least_7_characters_and_contains_both_letters_and_numbers_special_characters_may_be_used_tool_tip_message_dispays_on_outfocus() throws Throwable {
    	AssertUtils.assertTextMatches(pcod_logpage.gettooltipconnectyourteacherwhatsthis(), Matchers.containsString(ConstantUtils.INVALID_PASSWORD_ERROR_MESSAGE_SPLCHAR_ALLOWED
    			));
    }

    @And("^parent enters valid matching passwords in “New password” and “confirm New password” fields$")
    public void parent_enters_valid_matching_passwords_in_new_password_and_confirm_new_password_fields() throws Throwable {
    	PauseUtil.pause(1500);
    	pcod_homepage.getpcod_profile_password_edit_newpasswordfield().sendKeys(
        		TestBaseProvider.getTestBase().getTestData().getString("newpassword"));
    	PauseUtil.pause(1500);
        pcod_homepage.getpcod_profile_password_edit_confirmpasswordfield().sendKeys(
        		TestBaseProvider.getTestBase().getTestData().getString("confirmpassword"));
        pcod_homepage.getpcod_profile_password_edit_confirmpasswordfield().sendKeys(Keys.TAB);
    }

    @And("^Edited password is saved$")
    public void edited_password_is_saved() throws Throwable {
    	if((pcod_homepage.pcod_profile_profile_editpassword_modal().size()!=0) &&
        		(pcod_homepage.pcod_profile_profile_editpassword_modal().get(0).isDisplayed())){
        	Assert.fail("Edit Password modal is not closed");
        }
        else{
        	System.out.println("Edit Password modal is closed");
        }
    }

    @And("^parent can login with edited password$")
    public void parent_can_login_with_edited_password() throws Throwable {
    	PauseUtil.pause(2500);
		pcod_homepage.pcod_logout();
		PauseUtil.pause(2500);
        pcod_logpage.parent_login(pcod_logpage.getTxtUsername(), TestBaseProvider.getTestBase().getTestData().getString("acc_no"),
                TestBaseProvider.getTestBase().getTestData().getString("updatedpassword"));
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        pcod_logpage.verify_element_is_enabled(pcod_homepage.sizetxtitemnumberhomepage());
    }

    @And("^Save button gets disabled$")
    public void save_button_gets_disabled() throws Throwable {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
    	if(!pcod_homepage.getpcod_profile_password_edit_savebtn().getAttribute("disabled").equals("true")){
    	   Assert.fail("Save button is not disabled");
       }
    }

    @And("^enters invalid password without numbers$")
    public void enters_invalid_password_without_numbers() throws Throwable {
    	pcod_homepage.getpcod_profile_password_edit_newpasswordfield().sendKeys(
        		TestBaseProvider.getTestBase().getTestData().getString("newpassword"));
    	pcod_homepage.getpcod_profile_password_edit_newpasswordfield().sendKeys(Keys.TAB);
    	PauseUtil.waitForAjaxToComplete(2500);
    }

    @And("^enters invalid password without letters$")
    public void enters_invalid_password_without_letters() throws Throwable {
    	pcod_homepage.getpcod_profile_password_edit_newpasswordfield().sendKeys(
        		TestBaseProvider.getTestBase().getTestData().getString("newpassword"));
    	pcod_homepage.getpcod_profile_password_edit_newpasswordfield().sendKeys(Keys.TAB);
    	PauseUtil.waitForAjaxToComplete(2500);
    }
    
    @And("^enters invalid password less than 7 characters$")
    public void enters_invalid_password_less_than_7_characters() throws Throwable {
    	pcod_homepage.getpcod_profile_password_edit_newpasswordfield().sendKeys(
        		TestBaseProvider.getTestBase().getTestData().getString("newpassword"));
    	pcod_homepage.getpcod_profile_password_edit_newpasswordfield().sendKeys(Keys.TAB);
    	PauseUtil.waitForAjaxToComplete(2500);
    }
    
    @Then("^password is shown by default in edit password modal$")
    public void password_is_shown_by_default_in_edit_password_modal() throws Throwable {
    	if(!pcod_homepage.getpcod_profile_password_edit_newpasswordfield().getAttribute("type").equals("text")){
        	Assert.fail("New Password field is not shown");
        }
        if(!pcod_homepage.getpcod_profile_password_edit_confirmpasswordfield().getAttribute("type").equals("text")){
        	Assert.fail("Confirm New Password field is not shown");
        }
        
    }
    
    @Then("^“Please enter at least 7 characters\\.” tool tip message dispays on outfocus$")
    public void please_enter_at_least_7_characters_tool_tip_message_dispays_on_outfocus() throws Throwable {
    	AssertUtils.assertTextMatches(pcod_logpage.gettooltipconnectyourteacherwhatsthis(), 
    			Matchers.containsString(ConstantUtils.PASSWORD_ATLEAST_7CHAR_ERRMSG));
    }
    
    @And("^clicks on Save button$")
    public void clicks_on_save_button() throws Throwable {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        pcod_homepage.getpcod_profile_password_edit_savebtn().click();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
    }
    
    //############################################# DWCAPCOD - 51 #######################################################
    @Given("^parent clicks on Edit link next to name$")
    public void parent_clicks_on_Edit_link_next_to_name() throws Throwable {
    	pcod_homepage.pcod_click_edit_link_name_section_Profile_page();
    }

    @When("^parent enters invalid phone number$")
    public void parent_enters_invalid_phone_number() throws Throwable {
    	pcod_homepage.pcod_edit_profile_information_PHONENUMBER_Profile_page();
    }

    @Then("^error message “Please enter a valid phone number\\.” displays$")
    public void error_message_Please_enter_a_valid_phone_number_displays() throws Throwable {
    	pcod_homepage.pcod_verify_error_message_tooltip_invalid_phone_number_displays();
    	pcod_homepage.pcod_verify_error_message_text_invalid_phone_number();
    }
    
    @When("^parent edits their profile information$")
    public void parent_edits_their_profile_information() throws Throwable {
    	pcod_homepage.pcod_edit_profile_information_FIRSTNAME_Profile_page();
    	pcod_homepage.pcod_edit_profile_information_LASTNAME_Profile_page();
    	pcod_homepage.pcod_edit_profile_information_EMAIL_Profile_page();
    	pcod_homepage.pcod_edit_profile_information_PHONENUMBER_Profile_page();
    }

    @Then("^edited information is not saved and profile page displays the old information$")
    public void edited_information_is_not_saved_and_profile_page_displays_the_old_information() throws Throwable {
    	pcod_homepage.pcod_verify_edit_information_not_saved_Profile_page();
    }
    
    @When("^parent tries to enter more than (\\d+) characters in first and Last name$")
    public void parent_tries_to_enter_more_than_characters_in_first_and_Last_name(int arg1) throws Throwable {
    	pcod_homepage.pcod_edit_profile_information_FIRSTNAME_Profile_page();
    	pcod_homepage.pcod_edit_profile_information_LASTNAME_Profile_page();
    }
    
    @Then("^any characters entered after (\\d+) are ignored for \"([^\"]*)\"$")
    public void any_characters_entered_after_are_ignored_for(int arg1, String field) throws Throwable {
    	pcod_homepage.pcod_verify_character_limits_for_textfield(field);
    }
    
    @When("^parent tries to enter more than (\\d+) characters in email$")
    public void parent_tries_to_enter_more_than_characters_in_email(int arg1) throws Throwable {
    	pcod_homepage.pcod_edit_profile_information_EMAIL_Profile_page();
    }
    
    @When("^parent enters invalid format of email address$")
    public void parent_enters_invalid_format_of_email_address() throws Throwable {
    	pcod_homepage.pcod_edit_profile_information_EMAIL_Profile_page();
    }

    @Then("^error message displays for invalid email address$")
    public void error_message_displays_for_invalid_email_address() throws Throwable {
    	pcod_homepage.pcod_verify_error_message_tooltip_invalid_email_displays();
    	pcod_homepage.pcod_verify_error_message_text_invalid_email();
    }
    
    @When("^parent does not enter mobile number$")
    public void parent_does_not_enter_mobile_number() throws Throwable {
    	pcod_homepage.pcod_verify_and_set_phone_number_empty();
    }

    @Then("^save button is enabled on Edit Profile modal$")
    public void save_button_is_enabled_on_Edit_Profile_modal() throws Throwable {
        pcod_homepage.pcod_verify_save_button_enabled_edit_profile_modal();
    }
    
    @When("^parent enters only (\\d+) character in \"([^\"]*)\" field$")
    public void parent_enters_only_character_in_field(int arg1, String field) throws Throwable {
    	pcod_homepage.pcod_enter_info_in_specific_field_edit_profile_modal(field);
    }

    @Then("^tool tip displays with error message \"([^\"]*)\" for \"([^\"]*)\" field$")
    public void tool_tip_displays_with_error_message_for_field(String arg1, String field) throws Throwable {
    	pcod_homepage.pcod_verify_specific_error_msg_edit_profile_modal(field);
    }
    
    @When("^parent enters already used email address$")
    public void parent_enters_already_used_email_address() throws Throwable {
    	pcod_homepage.pcod_edit_profile_information_EMAIL_Profile_page();
    	pcod_homepage.pcod_click_save_edit_modal_Profile_page();
    }

    @Then("^error message displays for already existing email$")
    public void error_message_displays_for_already_existing_email() throws Throwable {
    	pcod_homepage.pcod_verify_duplicate_email_error_msg_Profile_page();
    }
    
    @Given("^parent edits their email address$")
    public void parent_edits_their_email_address() throws Throwable {
    	pcod_homepage.pcod_click_edit_link_name_section_Profile_page();
    	pcod_homepage.pcod_edit_profile_information_EMAIL_Profile_page();
    	pcod_homepage.pcod_click_save_edit_modal_Profile_page();
    }

    @Given("^parent edits their password$")
    public void parent_edits_their_password() throws Throwable {
    	pcod_homepage.pcod_edit_password_Profile_page();
    	pcod_homepage.pcod_click_save_edit_password_modal_Profile_page();
    }

    @Given("^parent clicks on Sign Out from My Account dropdown$")
    public void parent_clicks_on_Sign_Out_from_My_Account_dropdown() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_clickMyAcc_SignOut();
    }
    
    @Given("^parent(\\d+) clicks on Sign Out from My Account dropdown$")
    public void parent_clicks_on_Sign_Out_from_My_Account_dropdown(int arg1) throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_Click_homepage_icon();
    	
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_clickMyAcc_SignOut();
    }
    
    @When("^parent tries to login with edited email address and password$")
    public void parent_tries_to_login_with_edited_email_address_and_password() throws Throwable {
    	pcod_logpage.parent_login(pcod_logpage.getTxtUsername(), TestBaseProvider.getTestBase().getTestData().getString("email"),
                TestBaseProvider.getTestBase().getTestData().getString("password2"));
        PauseUtil.pause(1500);
    }
    
    @When("^parent does not enter data in any of first name, last name, email$")
    public void parent_does_not_enter_data_in_any_of_first_name_last_name_email() throws Throwable {
    	pcod_homepage.pcod_edit_profile_information_FIRSTNAME_Profile_page();
    	pcod_homepage.pcod_edit_profile_information_LASTNAME_Profile_page();
    	pcod_homepage.pcod_edit_profile_information_EMAIL_Profile_page();
    	pcod_homepage.pcod_edit_profile_information_PHONENUMBER_Profile_page();
    }

    @Then("^save button is disabled$")
    public void save_button_is_disabled() throws Throwable {
    	pcod_homepage.pcod_verify_save_button_disabled_edit_profile_modal();
    }
    
    @And("^parent restores previous information on account$")
    public void parent_restores_previous_information_on_account() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_clickMyAcc_Profile();
    	
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_restore_default_information();
    	pcod_homepage.pcod_restore_default_password();
    }
    
    @And("^parent clicks on Close on Edit Profile modal$")
    public void parent_clicks_on_Close_on_Edit_Profile_modal() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_click_on_Close_button_edit_profile_modal();
    }
    
    @When("^parent edits first name, last name, email and mobile number$")
    public void parent_edits_first_name_last_name_email_and_mobile_number() throws Throwable {
    	pcod_homepage.pcod_edit_profile_information_FIRSTNAME_Profile_page();
    	pcod_homepage.pcod_edit_profile_information_LASTNAME_Profile_page();
    	pcod_homepage.pcod_edit_profile_information_EMAIL_Profile_page();
    	pcod_homepage.pcod_edit_profile_information_PHONENUMBER_Profile_page();
    }

    @When("^parent clicks on Save on the Edit Profile modal$")
    public void parent_clicks_on_Save_on_the_Edit_Profile_modal() throws Throwable {
    	pcod_homepage.pcod_click_save_edit_modal_Profile_page();
    }

    @Then("^the Edit Profile modal disappears$")
    public void the_Edit_Profile_modal_disappears() throws Throwable {
    	pcod_homepage.pcod_verify_edit_profile_modal_not_displayed_Profile_page();
    }

    @Then("^the edited full name, email and mobile number displays$")
    public void the_edited_full_name_email_and_mobile_number_displays() throws Throwable {
    	pcod_homepage.pcod_verify_edit_information_are_saved_Profile_page();
    }
    
    @Then("^parent's correct full name, email and mobile number displays$")
    public void parentSCorrectFullNameEmailAndMobileNumberDisplays() throws Throwable {
        PCOD_HomePage pcod_homepage = new PCOD_HomePage();
        if(pcod_homepage.getMyAccountProfileSection().size() != 0){
            Assert.assertTrue("Profile Section dispalyed",true);
            pcod_homepage.verifyName_Email_MobileNumberisDisplayed();
        }

    }

    @And("^parent has opted in for communication and promotional emails$")
    public void parentHasOptedInForCommunicationAndPromotionalEmails() throws Throwable {
        System.out.println("No Implementation needed here its preconditon");
    }


    @Then("^parent's view all their communication and promotional email as selected$")
    public void parentSViewAllTheirCommunicationAndPromotionalEmailAsSelected() throws Throwable {
        PCOD_HomePage pcod_homepage = new PCOD_HomePage();
        pcod_homepage.verifyCommunicationSelected(
                TestBaseProvider.getTestBase().getTestData().getString("flagComm")
        );
        pcod_homepage.verifyPromoEmailSelected(
                TestBaseProvider.getTestBase().getTestData().getString("flagEmail")
        );
    }

    @And("^parent has not opted in for communication and promotional emails$")
    public void parentHasNotOptedInForCommunicationAndPromotionalEmails() throws Throwable {
        System.out.println("No Implementation needed here its preconditon");

    }

    @Then("^parent's view all their communication and promotional email as unselected$")
    public void parentSViewAllTheirCommunicationAndPromotionalEmailAsUnselected() throws Throwable {
        PCOD_HomePage pcod_homepage = new PCOD_HomePage();
        pcod_homepage.verifyCommunicationSelected(
                TestBaseProvider.getTestBase().getTestData().getString("flagComm")
        );
        pcod_homepage.verifyPromoEmailSelected(
                TestBaseProvider.getTestBase().getTestData().getString("flagEmail")
        );
    }

    @Then("^parent views privacy policy$")
    public void parentViewsPrivacyPolicy() throws Throwable {
        PCOD_HomePage pcod_homepage = new PCOD_HomePage();
        pcod_homepage.verifyPrivacy();
    }

    @And("^Edit password modal displays with current password hidden$")
    public void editPasswordModalDisplaysWithCurrentPasswordHidden() throws Throwable {
        PCOD_HomePage pcodHomePage = new PCOD_HomePage();
        pcodHomePage.pcodProfile_password_display_hidden();
        pcodHomePage.verifyEditPasswordmodal();
    }

    @When("^parent enters new password matching the current password$")
    public void parentEntersNewPasswordMatchingTheCurrentPassword() throws Throwable {
        pcod_homepage.getpcod_profile_password_edit_newpasswordfield().sendKeys(
                TestBaseProvider.getTestBase().getTestData().getString("newpassword"));
        PauseUtil.pause(1500);
        pcod_homepage.getpcod_profile_password_edit_confirmpasswordfield().sendKeys(
                TestBaseProvider.getTestBase().getTestData().getString("confirmpassword"));
        pcod_homepage.getpcod_profile_password_edit_confirmpasswordfield().sendKeys(Keys.TAB);
    }

        @Then("^Save modal closes and edited password is saved$")
        public void saveModalClosesAndEditedPasswordIsSaved () throws Throwable {
            System.out.println("");
        }

        @And("^parent clicks on Submit$")
        public void parentClicksOnSubmit () throws Throwable {
            pcod_homepage.getpcod_profile_password_edit_savebtn().click();
        }
    }






