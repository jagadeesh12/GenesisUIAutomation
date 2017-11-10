package com.dw.automation.steps.teachercheckout;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import java.util.List;
import java.util.Locale;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.dw.automation.pages.IBooksAndResourcesPage;
import com.dw.automation.pages.ICartPage;
import com.dw.automation.pages.ICheckoutPage;
import com.dw.automation.pages.ICheckoutPage_2;
import com.dw.automation.pages.ICouponsandRewards;
import com.dw.automation.pages.ILoginPage;
import com.dw.automation.pages.IProductDetailPage;
import com.dw.automation.pages.IProfilePage;
import com.dw.automation.pages.IStudentFlyerOrdersPage;
import com.dw.automation.pages.ITeachersHomePage;
import com.dw.automation.pages.IYourTeacherOrderPage;
import com.dw.automation.pages.impl.CartPage;
import com.dw.automation.pages.impl.CheckoutPage;
import com.dw.automation.pages.impl.CheckoutPage.ConfirmAndSubmitOrder;
import com.dw.automation.pages.impl.CheckoutPage.RewardsAndCoupons;
import com.dw.automation.pages.impl.CheckoutPage.ShippingAndPayment;
import com.dw.automation.pages.impl.CartTotals;
import com.dw.automation.pages.impl.LoginPage;
import com.dw.automation.pages.impl.ProductDetailPage;
import com.dw.automation.pages.impl.StudentFlyerOrdersPage;
import com.dw.automation.pages.impl.TeachersHomePage;
import com.dw.automation.sections.ICreditCardAndBillingInfoSection;
import com.dw.automation.sections.IHeaderSection;
import com.dw.automation.sections.IProductOrderSummarySection;
import com.dw.automation.sections.base.SectionFactory;
import com.dw.automation.steps.TeacherCart.TotlaOwing;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.LocatorUtils;
import com.scholastic.torque.common.TestBase;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.WaitUtils;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TeacherCheckOutSteps {

    TotlaOwing Total_Owing_Amount_act_1 = new TotlaOwing();
    StudentFlyerOrdersPage studflyerpage = new StudentFlyerOrdersPage();
    CartTotals carttotals = new CartTotals();

    @Given("^user login with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_with_and(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user is on teacher home page$")
    public void user_is_on_teacher_home_page() throws Throwable {
        ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
        teachersHomePage.verifyPage();

    }

    @Given("^user selects my account and goes for \"([^\"]*)\"$")
    public void user_selects_my_account_and_goes_for(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("^user choose \"([^\"]*)\" and add it to cart$")
    public void user_choose_and_add_it_to_cart(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^user chooses to checkout or continue shopping$")
    public void user_chooses_to_checkout_or_continue_shopping() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^user selects going on cart$")
    public void user_selects_going_on_cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^user chooses to edit the cart$")
    public void user_chooses_to_edit_the_cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^Student Clubs Amount Owing becomes\\$(\\d+)$")
    public void studentClubsAmountOwingBecomes$(int arg0) throws Throwable {

    }

    @Given("^user see total in SFO,SOO,YTO and chooses to proceed to checkout$")
    public void user_see_total_in_SFO_SOO_YTO_and_chooses_to_proceed_to_checkout()
            throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user selects to checkout in confirmation window$")
    public void user_selects_to_checkout_in_confirmation_window() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user selects to return to shop in confirmation window$")
    public void user_selects_to_return_to_shop_in_confirmation_window() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user comes back on home of site$")
    public void user_comes_back_on_home_of_site() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user wants to see the reward points$")
    public void user_wants_to_see_the_reward_points() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user applies a coupon code while shopping$")
    public void user_applies_a_coupon_code_while_shopping() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user continue to checkout from reward page$")
    public void user_continue_to_checkout_from_reward_page() throws Throwable {
        ICheckoutPage checkOutPage = getFactory().getICheckoutPage();
        checkOutPage.getRewardsAndCouponsSection().getBtnContinueCheckout().click();

    }

    @Then("^user checks his shipping address is fine$")
    public void user_checks_his_shipping_address_is_fine() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user checks his payment total$")
    public void user_checks_his_payment_total() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user selects payment method as credit card$")
    public void user_selects_payment_method_as_credit_card() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user choose to continue to paypal$")
    public void user_choose_to_continue_to_paypal() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user chooses to create paypal account$")
    public void user_chooses_to_create_paypal_account() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user login in his paypal$")
    public void user_login_in_his_paypal() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user selects credit card type, verifies name and billing address$")
    public void user_selects_credit_card_type_verifies_name_and_billing_address()
            throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user enters purchase order number and checks the billing address$")
    public void user_enters_purchase_order_number_and_checks_the_billing_address()
            throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user continue to checkout after payment mode$")
    public void user_continue_to_checkout_after_payment_mode() throws Throwable {
        ICheckoutPage checkOutPage = getFactory().getICheckoutPage();
        checkOutPage.getRewardsAndCouponsSection().getBtnContinueCheckout().click();

    }

    @Then("^user checks the information for check$")
    public void user_checks_the_information_for_check() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user wants to edit email-id to \"([^\"]*)\" for current order$")
    public void user_wants_to_edit_email_id_to_for_current_order(String arg1)
            throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user verifies order summary for YTO SOO SFO$")
    public void user_verifies_order_summary_for_YTO_SOO_SFO() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user see his total coming proper$")
    public void user_see_his_total_coming_proper() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user verifes the shipping address$")
    public void user_verifes_the_shipping_address() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user wants to return to shop from his final order page$")
    public void user_wants_to_return_to_shop_from_his_final_order_page()
            throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user decides to submit his order$")
    public void user_decides_to_submit_his_order() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user gets the order_reciept number$")
    public void user_gets_the_order_reciept_number() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^decides to continue more shopping after order placed\\.$")
    public void decides_to_continue_more_shopping_after_order_placed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user select create account option$")
    public void user_select_create_account_option() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user gets paypal account details, amount in payment section$")
    public void user_gets_paypal_account_details_amount_in_payment_section()
            throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user verify detail in order summary on rewards and coupons page$")
    public void user_verify_detail_in_order_summary_on_rewards_and_coupons_page()
            throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user verify verification_body in rewards section on rewards and coupons page$")
    public void user_verify_verification_body_in_rewards_section_on_rewards_and_coupons_page()
            throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user select \"([^\"]*)\" menu and update \"([^\"]*)\"$")
    public void user_select_menu_and_update(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user verify \"([^\"]*)\" and \"([^\"]*)\" on shipping address page$")
    public void user_verify_and_on_shipping_address_page(String arg1, String arg2)
            throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user will verify \\[customer_info\\], \\[order_summary_section\\],\\[payment_methods\\],\"([^\"]*)\",\\[order_detail_section\\]$")
    public void user_will_verify_customer_info_order_summary_section_payment_methods_order_detail_section(
            String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user gets the order confirmation email$")
    public void user_gets_the_order_confirmation_email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user fill valid data and add card$")
    public void user_fill_valid_data_and_add_card() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user verify that a card are stored and default card will display first$")
    public void user_verify_that_a_card_are_stored_and_default_card_will_display_first()
            throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user will add remaining (\\d+) credit cards$")
    public void user_will_add_remaining_credit_cards(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user verify that all (\\d+) credit cards are stored at the top of list$")
    public void user_verify_that_all_credit_cards_are_stored_at_the_top_of_list(int arg1)
            throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user verify that \"([^\"]*)\" will display at the bottom of the list$")
    public void user_verify_that_will_display_at_the_bottom_of_the_list(String arg1)
            throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user login to Cyber Source Business Center$")
    public void user_login_to_Cyber_Source_Business_Center() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user gets the print of page$")
    public void user_gets_the_print_of_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user selects Paypal as payment method$")
    public void user_selects_Paypal_as_payment_method() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user login in paypal model$")
    public void user_login_in_paypal_model() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^displayed window as \"([^\"]*)\"$")
    public void displayed_window_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user either able to select apple icon or not$")
    public void user_either_able_to_select_apple_icon_or_not() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user gets \"([^\"]*)\" apple icon status$")
    public void user_gets_apple_icon_status(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user will able to see \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_will_able_to_see_and(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user will able to see payment information$")
    public void user_will_able_to_see_payment_information() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^verify all payment methods$")
    public void verify_all_payment_methods() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user will fill and check all credit card information$")
    public void user_will_fill_and_check_all_credit_card_information() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user verify credit cards information$")
    public void user_verify_credit_cards_information() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user will able to see payment information in payment section$")
    public void user_will_able_to_see_payment_information_in_payment_section()
            throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user gets expired credit card as an error message$")
    public void user_gets_expired_credit_card_as_an_error_message() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user added items having order less than (\\d+)\\$$")
    public void user_added_items_having_order_less_than_$(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user gets free shipping in payment section$")
    public void user_gets_free_shipping_in_payment_section() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user gets shipping is free$")
    public void user_gets_shipping_is_free() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user selects payment method as credit card on shipping page$")
    public void user_selects_payment_method_as_credit_card_on_shipping_page()
            throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

        PauseUtil.waitForAjaxToComplete(2000);
        SCHUtils.selectOptionByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CREDITCARD);

    }


    @When("^user selects payment method as creditCard$")
    public void user_selects_payment_method_as_creditCard() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        PauseUtil.pause(3000);
        shippingAndPaymentPage.getDrpPaymentMethod_2().click();
        PauseUtil.pause(2000);
        shippingAndPaymentPage.selectAScreditCard().click();

    }

    @When("^user selects Add a New card$")
    public void user_selects_Add_a_New_card() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(5000);
        shippingAndPaymentPage.drpSelectaCard_2().click();
        PauseUtil.pause(2000);
        shippingAndPaymentPage.selectAsAddaNewCard().click();
        PauseUtil.pause(5000);

    }

    @When("^user selects payment method as credit card on payment page$")
    public void user_selects_payment_method_as_credit_card_on_payment_page()
            throws Throwable {

        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CHECKPAYMENTMETHOD);

        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
        SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());

    }


    @When("^teacher selects payment method as credit card on payment page$")
    public void teacher_selects_payment_method_as_credit_card_on_payment_page()
            throws Throwable {

        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CHECKPAYMENTMETHOD);

        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
        SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());

    }

	
	/*@When("^user selects payment method as credit card on payment page2$")
	public void user_selects_payment_method_as_credit_card_on_payment_page2()
			throws Throwable {
		
		AutoFreePromotion auto = getFactory().getAutoFreePromotionPage();
		auto.user_Clicks_on_Payment_Method();

	}*/


	/*
	 * @When("^user selects payment method as credit card on payment page2$")
	 * public void user_selects_payment_method_as_credit_card_on_payment_page2()
	 * throws Throwable {
	 * AutoFreePromotion auto = getFactory().getAutoFreePromotionPage();
	 * auto.user_Clicks_on_Payment_Method();
	 * }
	 */

    @When("^user wish to add new credit card$")
    public void user_wish_to_add_new_credit_card() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        SCHUtils.selectOptionByvalue(shippingAndPaymentPage.getDrpCardType(), "new");
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.paymentmethod", ConstantUtils.CREDITCARD);

    }

    @When("^user wish to edit credit card details$")
    public void user_wish_to_edit_credit_card_details() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnEditCrediCard());
    }

    @Then("^user fills \\[CreditCardInformation\\] for credit card$")
    public void user_fills_CreditCardInformation_for_credit_card() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.addNewCreditCard(TestBaseProvider.getTestBase().getTestData());

    }

    @Then("^user fills \\[CreditCardInformation\\] for the credit card$")
    public void user_fills_CreditCardInformation_for_the_credit_card() throws Throwable {

        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.fill_new_CreditCard();

    }

    @When("^teacher clicks on My Account$")
    public void teacher_clicks_on_my_account() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.user_selects_MyAccount_in_HomePage();
    }

    @And("^Teacher clicks on Logout$")
    public void teacher_clicks_on_logout() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.user_selects_MyAccount_in_HomePage();
        checkoutPage.user_selects_SignOut_MyAccount_dropDown();
    }


    @When("^teacher enters \\[credit card info\\] in MyAccount Page$")
    public void teacher_enters_credit_card_info_in_myaccount_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.fill_new_CreditCard_to_MyAccount_Page();
    }

    @And("^teacher clicks on Billing and Payments$")
    public void teacher_clicks_on_billing_and_payments() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.user_selects_BillingAndPayment_MyAccount_dropDown();
        PauseUtil.waitForAjaxToComplete(2500);
    }

    @And("^teacher clicks on Add a card$")
    public void teacher_clicks_on_add_a_card() throws Throwable {
        PauseUtil.waitForAjaxToComplete(2500);
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.user_selects_AddaCard_in_MyAccount_Page();
    }

    @Then("^teacher navigates to My Reading Club account page$")
    public void teacher_navigates_to_my_reading_club_account_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.verify_MyAccount_ReadingClub_header_and_table_displayed_MyAccountPage();
    }

    @And("^teacher click on Save$")
    public void teacher_click_on_save() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.user_selects_Save_btn_in_MyAccount_Page();
    }

    @Then("^the credit card is saved$")
    public void the_credit_card_is_saved() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.user_validate_Saved_Credit_card_in_MyAccount_Page();
    }

    @And("^teacher comes to Home page$")
    public void teacher_comes_to_home_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.user_clicks_on_Home_icon_from_MyAccountPage();
    }

    @And("^teacher fills alternate shipping address details$")
    public void teacher_fills_alternate_shipping_address_details() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.fill_alternate_shipping_address_details();
    }

    @And("^teacher selects alternate shipping option$")
    public void teacher_selects_alternate_shipping_option() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Select_Alternate_Shipping_Address_in_Payment_Page();
    }


    @When("^teacher selects alternative shipping and enters only \\[postal code\\], \\[city\\] and \\[province\\]$")
    public void teacher_selects_alternative_shipping_and_enters_only_postal_code_city_and_province() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Select_Alternate_Shipping_Address_Enters_Postalcode_City_Province();
    }


    @When("^teacher selects alternative shipping and enters only \\[address1\\], \\[postal code\\], \\[city\\] and \\[province\\]$")
    public void teacher_selects_alternative_shipping_and_enters_only_address1_postal_code_city_and_province() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Select_Alternate_Shipping_Address_Enters_Address1_Postalcode_City_Province();
    }

    @And("^teacher selects alternative shipping and enters all required details$")
    public void teacher_selects_alternative_shipping_and_enters_all_required_details() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Select_Alternate_Shipping_Address_Enters_Address1_Postalcode_Province();
    }

    @When("^teacher selects alternative shipping and enters only \\[address1\\], \\[city\\] and \\[province\\]$")
    public void teacher_selects_alternative_shipping_and_enters_only_address1_city_and_province() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Select_Alternate_Shipping_Address_Enters_Address1_City_Province();
    }

    @When("^teacher selects alternative shipping and enters only \\[address1\\], \\[postal code\\] and \\[province\\]$")
    public void teacher_selects_alternative_shipping_and_enters_only_address1_postal_code_and_province() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Select_Alternate_Shipping_Address_Enters_Address1_Postalcode_Province();
    }


    @When("^teacher selects alternative shipping and enters only \\[address1\\], \\[city\\] and \\[postal code\\]$")
    public void teacher_selects_alternative_shipping_and_enters_only_address1_city_and_postal_code() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Select_Alternate_Shipping_Address_Enters_Address1_City_Postalcode();
    }


    @When("^teacher enters passed expiration date and valid information in all other fields$")
    public void teacher_enters_passed_expiration_date_and_valid_information_in_all_other_fields() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.fill_new_CreditCard();
    }

    @And("^Teacher enter amount to be paid by credit card$")
    public void teacher_enter_amount_to_be_paid_by_credit_card() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.enter_amt_paid_by_creditCard_paymentPage();
    }

    @Then("^teacher sees expired card error message$")
    public void teacher_sees_expired_card_error_message() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.Verify_the_expired_card_error_message_paymentPage();
    }


    @Then("^user fills \"([^\"]*)\" card number with security code \"([^\"]*)\" on ship and pay page$")
    public void fillTxtCardNumber(String cardNumber, String securityCode)
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.fillTxtCardNumber(cardNumber, securityCode);
    }

    @Then("^user should able to see card number Error message on ship and pay page$")
    public void validateCardErrorMessage() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validateCardErrorMessage();
    }

    @Then("^user selects credit card type for payment$")
    public void user_selects_credit_card_type_for_payment() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        if (!shippingAndPaymentPage.checkCCAvailblity()) {
            getFactory().getICheckoutPage().getShippingAndPaymentSection();
            SCHUtils.selectOptionByvalue(shippingAndPaymentPage.getDrpCardType(), "new");
            ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
            checkoutPage.addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
        }

    }

    @Then("^user should see \\[PaymentInformation\\] and \\[ShippingInformation\\] on shipping and payement section of checkout page$")
    public void user_should_see_PaymentInformation_and_ShippingInformation_on_shipping_and_payement_section_of_checkout_page()
            throws Throwable {
        PauseUtil.pause(3000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPaymentPage.verifyShippingAndPaymentPage();

    }

    @Then("^user selects payment method as combination of credit card and check on shipping page$")
    public void user_selects_payment_method_as_combination_of_credit_card_and_check_on_shipping_page()
            throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        ;

        shippingAndPaymentPage.waitForPageLoad();
        SCHUtils.selectOptionByvalue(shippingAndPaymentPage.getDrpPaymentMethod(),
                TestBaseProvider.getTestBase().getTestData().getString("paymentmethod"));
        PauseUtil.pause(1000);
    }

    @Then("^user checks add card functionality$")
    public void user_checks_add_card_functionality() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        shippingAndPaymentPage.verifyCardTypeField();
        PauseUtil.waitForAjaxToComplete(5000);
    }

    @Then("^user wants to pay with combination of credit card and check$")
    public void user_wants_to_pay_with_combination_of_credit_card_and_check()
            throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPaymentPage.verifyPamentWithCombinationOfCCAndChecks();

    }

    @When("^user selects payment method as check on shipping page$")
    public void user_selects_payment_method_as_check_on_shipping_page() {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CHECKPAYMENTMETHOD);

    }

    @Then("^user should be able to check the \\[DetailsOfCheck\\] on shipping page$")
    public void user_should_be_able_to_check_the_DetailsOfCheck_on_shipping_page() {
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        shippingAndPayment.verifyCheckDetailsOnShippingAndPaymentSection();
    }

    @Then("^user goes shop books and resources$")
    public void user_goes_shop_books_and_resources() throws Throwable {
        ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
        teachersHomePage
                .selectOptionFromTeacherHomePage(ConstantUtils.SHOP_BOOK_AND_RESOURCES);
    }

    @Then("^user should be able to see previous and next option on recommandation section$")
    public void user_should_be_able_to_see_previous_and_next_option_on_recommandation_section()
            throws Throwable {
        IBooksAndResourcesPage bookandresourcepage =
                getFactory().getIBooksAndResourcesPage();
        bookandresourcepage.verifyBubblesShopsBooksResources();

    }

    @Then("^user select \"([^\"]*)\" bubble to get new items in recommandations$")
    public void user_select_bubble_to_get_new_items_in_recommandations(String arg1)
            throws Throwable {
        IBooksAndResourcesPage bookandresourcepage =
                getFactory().getIBooksAndResourcesPage();

        bookandresourcepage.controlBubblesshopsBooksResources(arg1);
    }

    @Then("^user select \"([^\"]*)\" arrow to get new items in recommandations$")
    public void user_select_arrow_to_get_new_items_in_recommandations(String arg1)
            throws Throwable {
        IBooksAndResourcesPage bookandresourcepage =
                getFactory().getIBooksAndResourcesPage();

        bookandresourcepage.controlarrowShopBooksResources(arg1);
    }

    @Then("^user should get \\[InsufficientPointBalanceMessage\\] on checkout page$")
    public void user_should_get_BonusPointErrorMessage_on_checkout_page() {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        rewardsAndCoupons.verifyInsufficientBonusPointMessage();
    }

    @When("^user saves card$")
    public void user_saves_card() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        SCHUtils.selectCheckBox(shippingAndPaymentPage.getChkSaveCard(), "true");
    }

    @When("^user unsave the card$")
    public void user_unsave_the_card() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        SCHUtils.selectCheckBox(shippingAndPaymentPage.getChkSaveCard(), "false");
    }

    @When("^user makes card as a default$")
    public void user_makes_card_as_a_default() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        SCHUtils.selectCheckBox(shippingAndPaymentPage.getChkDefaultCard(), "true");
    }

    @Then("^teacher navigates to Confirm and Submit page$")
    public void teacher_navigates_to_Confirm_and_Submit_page() throws Throwable {
        PauseUtil.pause(3000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
        SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
        // shippingAndPaymentPage.getBtnContinueCheckout().click();
        PauseUtil.pause(5000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        PauseUtil.pause(4000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        ICheckoutPage_2 checkoutPage2 = getFactory().getICheckoutPage_2();
        checkoutPage2.isSubmitConfirm_header_displayed();

    }

    @Then("user should see order summary with total dollar amount in order confirmation page")
    public void user_should_see_order_summary_with_total_dollar_amount_in_order_confirmation_page() {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        confirmAndSubmitOrder.verifyParentOrderSummarySection();
    }

    @Then("^user should see view order details page$")
    public void user_should_see_view_order_details_page() {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verifyOrderConfirmationPage();
    }

    @When("^user decides to submit the order$")
    public void user_decides_to_submit_the_order() throws Throwable {
        ConfirmAndSubmitOrder confirmAndSubmitOrderPage =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        // if pcoolordersubmit is off then it will not submit order
        String pcoolordersubmit = TestBaseProvider.getTestBase().getTestData()
                .getString("pcoolordersubmit");
        if (pcoolordersubmit == null) {
            WaitUtils.waitForEnabled(confirmAndSubmitOrderPage.getBtnSubmitOrder());
            SCHUtils.clickUsingJavaScript(confirmAndSubmitOrderPage.getBtnSubmitOrder());
            // confirmAndSubmitOrderPage.getBtnSubmitOrder().click();
            // PauseUtil.pause(20000);
        }
        PauseUtil.pause(4000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
    }

    @And("^teacher submit the order$")
    public void teacher_submit_the_order() throws Throwable {
        ConfirmAndSubmitOrder confirmAndSubmitOrderPage =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        // if pcoolordersubmit is off then it will not submit order
        String pcoolordersubmit = TestBaseProvider.getTestBase().getTestData()
                .getString("pcoolordersubmit");
        if (pcoolordersubmit == null) {
            WaitUtils.waitForEnabled(confirmAndSubmitOrderPage.getBtnSubmitOrder());
            SCHUtils.clickUsingJavaScript(confirmAndSubmitOrderPage.getBtnSubmitOrder());
            // confirmAndSubmitOrderPage.getBtnSubmitOrder().click();
            // PauseUtil.pause(20000);
        }
        PauseUtil.pause(1000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        String orderRefNum = confirmAndSubmitOrderPage.getorderrefnoConfirmationpage().getText().trim();

        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.confirmationpage.orderrefno", orderRefNum);
    }

    @And("^teacher lands on Submitted page$")
    public void teacher_lands_on_submitted_page() throws Throwable {

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        confirmAndSubmitOrder.verifyConfirmationPrint();

        String orderamt = checkoutPage.user_verify_TotalAmt_ConfirmationPage();
        orderamt = orderamt.substring(1);
        PauseUtil.pause(7000);

        String orderRefNum = confirmAndSubmitOrder.getLblReferenceNumberOnOrderConfirmationPage().getText().trim();

        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.confirmationpage.orderrefno", orderRefNum);

        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.confirmationpage.orderamt", orderamt);


    }


    @And("^MyAccount dropdown displays on the header$")
    public void myaccount_dropdown_displays_on_the_header() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.user_verify_MyAccount_in_ConfirmationPage();
    }


    @When("^teacher clicks on My Account in confirmation page$")
    public void teacher_clicks_on_my_account_in_confirmation_page() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.user_selects_MyAccount_in_ConfirmationPage();
    }


    @And("^clicks on Profile from My Account dropdown$")
    public void clicks_on_profile_from_my_account_dropdown() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        TeachersHomePage teachhomepge = new TeachersHomePage();
        teachhomepge.selectOptionFromTeacherHomePage(ConstantUtils.PROFILE);
        checkoutPage.user_selects_MyAccount_DropDown_in_ConfirmationPage();
    }

    @And("^teacher click Edit link present under My Profile section$")
    public void teacher_click_edit_link_present_under_my_profile_section() throws Throwable {
        TeachersHomePage teachhomepge = new TeachersHomePage();
        teachhomepge.click_edit_myprofile_myaccountpage();
    }

    @When("^teacher provides unique email address along with other required details$")
    public void teacher_provides_unique_email_address_along_with_other_required_details() throws Throwable {
        TeachersHomePage teachhomepge = new TeachersHomePage();
        teachhomepge.enter_emailaddress_myprofile_myaccountpage(TestBaseProvider.getTestBase().getTestData());
    }

    @When("^teacher enters valid email in upper case in Email field$")
    public void teacher_enters_valid_email_in_upper_case_in_email_field() throws Throwable {
        TeachersHomePage teachhomepge = new TeachersHomePage();
        teachhomepge.enter_emailaddress_myprofile_myaccountpage(TestBaseProvider.getTestBase().getTestData());
    }

    @When("^teacher provides email address which is already associated to other account along with other required details$")
    public void teacher_provides_email_address_which_is_already_associated_to_other_account_along_with_other_required_details() throws Throwable {
        TeachersHomePage teachhomepge = new TeachersHomePage();
        teachhomepge.enter_emailaddress_myprofile_myaccountpage(TestBaseProvider.getTestBase().getTestData());
    }

    @And("^teacher clicks SAVE button$")
    public void teacher_clicks_save_button() throws Throwable {
        TeachersHomePage teachhomepge = new TeachersHomePage();
        teachhomepge.click_save_myprofile_myaccountpage();
    }

    @Then("^changes should be updated without any issues$")
    public void changes_should_be_updated_without_any_issues() throws Throwable {
        TeachersHomePage teachhomepge = new TeachersHomePage();
        teachhomepge.verify_editprofile_myprofile_myaccountpage(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^email is validated and auto\\-formatted to lower case without any issues$")
    public void email_is_validated_and_autoformatted_to_lower_case_without_any_issues() throws Throwable {
        TeachersHomePage teachhomepge = new TeachersHomePage();
        teachhomepge.verify_emailcase_myprofile_myaccountpage(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^“This email address has already been assigned to an account\\. Please enter a different email address\\.” should be seen$")
    public void this_email_address_has_already_been_assigned_to_an_account_please_enter_a_different_email_address_should_be_seen() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        rewardsAndCoupons.verifyErrorMsg_duplicatemailaddress_myprofile(
                TestBaseProvider.getTestBase().getTestData());
    }

    @And("^teacher clicks on Order History from My Account dropdown$")
    public void teacher_clicks_on_order_history_from_my_account_dropdown() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        //teachhomepge.selectOptionFromTeacherHomePage(ConstantUtils.TEACHER_DESK);
        checkoutPage.user_selects_OrderHistory_MyAccount_DropDown_in_ConfirmationPage();
    }

    @And("^teacher clicks on Billing & Payment from My Account dropdown$")
    public void teacher_clicks_on_billing_payment_from_my_account_dropdown() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        TeachersHomePage teachhomepge = new TeachersHomePage();
        teachhomepge.selectOptionFromTeacherHomePage(ConstantUtils.TEACHER_DESK);
        checkoutPage.user_selects_BillingAndPayment_MyAccount_DropDown_in_ConfirmationPage();
    }


    @When("^teacher navigates to my account page and click on view order under order history$")
    public void teacher_navigates_to_my_account_page_and_click_on_view_order_under_order_history() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        TeachersHomePage teachhomepge = new TeachersHomePage();
        //teachhomepge.selectOptionFromTeacherHomePage(ConstantUtils.TEACHER_DESK);
        checkoutPage.user_selects_OrderHistory_MyAccount_DropDown_in_ConfirmationPage();
        teachhomepge.clickOrderView_MyAccountPage();

    }

    @When("^teacher navigates to my account page and click on view order option under order history for latest booked order$")
    public void teacher_navigates_to_my_account_page_and_click_on_view_order_option_under_order_history_for_latest_booked_order() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        TeachersHomePage teachhomepge = new TeachersHomePage();
        checkoutPage.user_selects_OrderHistory_MyAccount_DropDown_in_ConfirmationPage();
        teachhomepge.clickOrderView_MyAccountPage();
    }


    @And("^teacher navigates to order history section under My Account page$")
    public void teacher_navigates_to_order_history_section_under_my_account_page() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.user_selects_OrderHistory_MyAccount_DropDown_in_ConfirmationPage();
    }


    @When("^teacher clicks View Details link for any of ther orders present under Order History section$")
    public void teacher_clicks_view_details_link_for_any_of_ther_orders_present_under_order_history_section() throws Throwable {

        TeachersHomePage teachhomepge = new TeachersHomePage();
        teachhomepge.clickOrderView_MyAccountPage();
    }


    @When("^teacher clicks logout option from My Account dropdown$")
    public void teacher_clicks_logout_option_from_my_account_dropdown() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        TeachersHomePage teachhomepge = new TeachersHomePage();
        teachhomepge.selectOptionFromTeacherHomePage(ConstantUtils.TEACHER_DESK);
        checkoutPage.user_selects_Logout_MyAccount_DropDown_in_ConfirmationPage();
    }


    @Then("^teacher should land on My Account page$")
    public void teacher_should_land_on_my_account_page() throws Throwable {
        ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
        teachersHomePage.myProfilePage();
    }


    @Then("^teacher should land on MyAccount page anchored to the profile displayed with correct teacher profile$")
    public void teacher_should_land_on_myaccount_page_anchored_to_the_profile_displayed_with_correct_teacher_profile() throws Throwable {
        ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
        teachersHomePage.ReadTeacherProfileName_MyAccount();
    }

    @Then("^teacher should land on My Account page anchored to Order History with this specific order information displayed \\(order number and amount due\\)$")
    public void teacher_should_land_on_my_account_page_anchored_to_order_history_with_this_specific_order_information_displayed_order_number_and_amount_due() throws Throwable {
        ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
        teachersHomePage.ReadOrderHistory_FirstOrder_MyAccount();
    }


    @When("^teacher clicks on view details link for concerned order details$")
    public void teacher_clicks_on_view_details_link_for_concerned_order_details() throws Throwable {
        TeachersHomePage teachhomepge = new TeachersHomePage();
        teachhomepge.click_viewdetails_orderhistory_MyAccountPage(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^order number and amount in order history page should match with detials present in order history section in My Account page$")
    public void order_number_and_amount_in_order_history_page_should_match_with_detials_present_in_order_history_section_in_my_account_page() throws Throwable {
        ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
        teachersHomePage.verify_ordernumber_orderamount_orderhistorypage(TestBaseProvider.getTestBase().getTestData());
    }


    @Then("^teacher should land on My Account page anchored to Billing & Payments section with saved card info that is added$")
    public void teacher_should_land_on_my_account_page_anchored_to_billing_payments_section_with_saved_card_info_that_is_added() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.user_validate_Saved_Credit_card_in_MyAccount_Page();
        checkoutPage.user_selects_DeleteCard_in_MyAccount_Page();


    }


    @Then("^teacher should land on My Account page anchored to Billing & Payments section with saved card info that is added(\\d+)$")
    public void teacherShouldLandOnMyAccountPageAnchoredToBillingPaymentsSectionWithSavedCardInfoThatIsAdded(int arg0) throws Throwable {

        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.user_validate_Saved_Credit_card_in_MyAccount_Page();
        //checkoutPage.user_selects_DeleteCard_in_MyAccount_Page();
    }


    @Then("^teacher should land on Login page$")
    public void teacher_should_land_on_login_page() throws Throwable {
        LoginPage loginpge = new LoginPage();
        loginpge.Verify_LoginPagePresent();
    }


    @Then("^user should be able to view added \\[CreditCardInformation\\]$")
    public void user_should_be_able_to_view_added_CreditCardInformation()
            throws Throwable {

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        SCHUtils.waitForLoaderToDismiss();
        SCHUtils.clickUsingJavaScript(checkoutPage.getLnkHome());
        ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
        teachersHomePage.navigateToProfilePage();
        IProfilePage profilePage = getFactory().getIProfilePage();
        profilePage.verifyDefaultSavedCard();
    }

    @Then("^user should be able to view edited \\[CreditCardInformation\\]$")
    public void user_should_be_able_to_view_edited_CreditCardInformation()
            throws Throwable {
        user_should_be_able_to_view_added_CreditCardInformation();
    }

    @Then("^user checks negative bonus point on cart page$")
    public void user_checks_negative_bonus_point_on_cart_page() {
        IHeaderSection headerSection = SectionFactory.getFactory()
                .getIHeaderSection(LocatorUtils.getBy("dw.header.section"));
        Assert.assertTrue(Integer.parseInt(headerSection.getBonusPointValue()) < 0,
                "mini cart should have Negative Bonus Point Value");
    }

    @Then("^user should see \"([^\"]*)\" is active state with blue chevron$")
    public void user_should_see_is_active_state_with_blue_chevron(String arg1)
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verifyBlueChevron(arg1);

    }

    @When("^user select unactive state of \"([^\"]*)\"$")
    public void user_select_unactive_state_of(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.selectInActiveTab(arg1);
    }

    @Then("^user should not able to see \"([^\"]*)\"$")
    public void user_should_not_able_to_see(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();

        if (arg1.equalsIgnoreCase("shipping and payment section")) {

            Assert.assertFalse(checkoutPage.getLblPageSubTitle().getText()
                    .contains(ConstantUtils.SHIPPINGANDPAYMENT));

        }
        if (arg1.equalsIgnoreCase("order and submit section")) {
            Assert.assertFalse(checkoutPage.getLblPageSubTitle().getText()
                    .contains(ConstantUtils.CONFIRMANDSUBMITORDER));
        }
    }

    @When("^user select unactive completed step of \"([^\"]*)\"$")
    public void user_select_unactive_completed_step_of(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.selectInActiveTab(arg1);
    }

    @When("^user wish to edit cart link from shipping and payment section of checkout page$")
    public void user_wish_to_edit_cart_link_from_shipping_and_payment_section_of_checkout_page()
            throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPaymentPage.getLnkEditCart().click();
    }

    @When("^user proceed checkout from review and cart page$")
    public void user_proceed_checkout_from_review_and_cart_page() throws Throwable {
        CartPage cartPage = new CartPage();
        // WaitUtils.waitForDisplayed(cartPage.getBtnProceedToCheckout());
        SCHUtils.waitForLoaderToDismiss();
        SCHUtils.clickUsingJavaScript(cartPage.getBtnProceedToCheckout());
        if (SCHUtils.isPresent(cartPage.getbtntopBonuspointModelProceedToCheckout())) {
            // WaitUtils.waitForDisplayed(cartPage.getBtnBonuspointModelProceedToCheckout());
            cartPage.getbtntopBonuspointModelProceedToCheckout().click();
        }
    }

    @When("^user select proceeds to checkout from review cart page$")
    public void user_select_proceed_checkout_from_review_and_cart_page()
            throws Throwable {
        CartPage cartPage = new CartPage();
        // WaitUtils.waitForDisplayed(cartPage.getBtnProceedToCheckout());
        SCHUtils.waitForLoaderToDismiss();
        SCHUtils.clickUsingJavaScript(cartPage.getBtnProceedToCheckout());

    }

    @When("^user fills all required data on shipping and payment section of checkout page$")
    public void user_fills_all_required_data_on_shipping_and_payment_section_of_checkout_page()
            throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        SCHUtils.selectOptionByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CHECKPAYMENTMETHOD);
        TestBaseProvider.getTestBase().getContext().setProperty(
                "testexecution.paymentmethod", ConstantUtils.CHECKPAYMENTMETHOD);
    }

    @When("^user select \"([^\"]*)\" credit card$")
    public void user_select_credit_card(String text) throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpCardType());
        // PauseUtil.waitForAjaxToComplete(1000);
        SCHUtils.waitForLoaderToDismiss();
        SCHUtils.selectOptionByVisibleText(shippingAndPaymentPage.getDrpCardType(), text);
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.paymentmethod", ConstantUtils.CREDITCARD);
        TestBaseProvider.getTestBase().getContext().setProperty("execution.card", text);
        PauseUtil.waitForAjaxToComplete(2000);
    }

    @Then("^user should see saved creditcard details$")
    public void user_should_see_saved_creditcard_details() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPaymentPage.verifySavedCreditcardInformation();
    }

    @Then("^user verifies credit card information and billing address in un-editable$")
    public void user_verifies_credit_card_information_and_billing_address_in_uneditable()
            throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPaymentPage.verifyCreditcardInformationBillingAddressUneditable();
    }

    @Then("^user should see \\[OrderSummary\\] and \\[OrderDetails\\] and \\[PaymentInformation\\] on confirm and submit section of checkout page$")
    public void user_should_see_OrderSummary_and_OrderDetails_and_PaymentInformation_on_confirm_and_submit_section_of_checkout_page()
            throws Throwable {
        PauseUtil.pause(3000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        // shippingAndPayment.verifyPaymentSectionOnShippingAndPayment();
        shippingAndPayment.verifyShippingAddressSectionOnShippingAndPayment();
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrder();
        if (TestBaseProvider.getTestBase().getTestData().getString("module")
                .equalsIgnoreCase("teacher")
                && TestBaseProvider.getTestBase().getContext()
                .getProperty("testExecution.paymentMethod") != null) {
            // /ICheckoutPage checkoutPage = getFactory().getICheckoutPage();

            confirmAndSubmitOrder.verifyPaymentSectionForTeacherOnConfirmAndSubmitSection(
                    TestBaseProvider.getTestBase().getContext()
                            .getString("testexecution.paymentmethod"));
            ICartPage cartPage = getFactory().getICartPage();
            cartPage.verifyCartItems();
        } else {
            confirmAndSubmitOrder.verifyPaymentMethodDetailsOnConfirmAndSubmit();
        }
    }

    @Then("^user selects my scholostic link on shipping and payment section of checkout page$")
    public void user_selects_my_scholostic_link_on_shipping_and_payment_section_of_checkout_page()
            throws Throwable {
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        AssertUtils.assertDisplayed(shippingAndPayment.getLinkMyScholastic());
        shippingAndPayment.getLinkMyScholastic().click();
        SCHUtils.waitForLoaderToDismiss();
    }

    @Then("^user verifies no information is saved$")
    public void user_verifies_no_information_is_saved() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPaymentPage.verifyCreditcardInformationNotSaved();
    }

    @Then("^user should see my account page$")
    public void user_should_see_my_account_page() throws Throwable {
        Assert.assertEquals(
                TestBaseProvider.getTestBase().getDriver().getCurrentUrl()
                        .contains("myaccount2.qa1.scholastic.com"),
                true,
                "Expected : myaccount2.qa1.scholastic.com And Found :"
                        + TestBaseProvider.getTestBase().getDriver().getCurrentUrl()
                        + "");

    }

    @When("^user select \"([^\"]*)\" section$")
    public void user_select_shipping_and_payment_section(String Section)
            throws Throwable {
        PauseUtil.pause(3000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(10000);
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        if (Section.equalsIgnoreCase("shipping and payment")) {
            checkoutPage.getLblStepShippingAndPayment().findElement(By.tagName("a"))
                    .click();
        } else if (Section.equalsIgnoreCase("rewards and coupons")) {
            checkoutPage.getLblStepRewardsAndCoupons().findElement(By.tagName("a"))
                    .click();
        } else if (Section.equalsIgnoreCase("confirm and submit")) {
            checkoutPage.getLblStepConfirmAndSubmit().findElement(By.tagName("a"))
                    .click();
        } else {
            new Exception("could not find valid Section");
        }
        PauseUtil.pause(3000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
    }

    @Then("^user should see \"([^\"]*)\" as default card on shipping and payment section$")
    public void verifyDefaultCreditCard(String cardNo) {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        Select selectDefaultValue = new Select(shippingAndPaymentPage.getDrpCardType());
        AssertUtils.assertTextMatches(selectDefaultValue.getOptions().get(1),
                Matchers.containsString(
                        TestBaseProvider.getTestBase().getTestData().getString(cardNo)));

    }

    @When("^teacher selects saved credit card$")
    public void teacher_selects_saved_credit_card() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        PauseUtil.pause(3000);
        shippingAndPaymentPage.drpSelectaCard_2().click();
        PauseUtil.pause(2000);
        SCHUtils.selectOptionByVisibleText(shippingAndPaymentPage.getDrpCardType(),
                TestBaseProvider.getTestBase().getTestData().getString("SavedCard"));
        PauseUtil.waitForAjaxToComplete(5000);

    }

    @Deprecated
    @Then("^user fills \\[InvalidCreditCard\\] on shipping and payment section of checkout page$")
    public void user_fills_InvalidCreditCard_on_shipping_and_payment_section_of_checkout_page()
            throws Throwable {
        ICreditCardAndBillingInfoSection creditCardAndBillingInfoSection =
                SectionFactory.getFactory().getICreditCardAndBillingInfoSection(
                        "dw.checkout.shippingandpayment.payment.creditcard.addnewcard.form");
        creditCardAndBillingInfoSection.enterInvalidCreditcardInfo();
    }

    @Then("^user validates \\[ErrorMessage\\] on credit card section of checkout page$")
    public void user_validates_all_error_message_on_credit_card_form() throws Throwable {
        ICheckoutPage iCheckoutPage = getFactory().getICheckoutPage();
        iCheckoutPage.validateCreditCardFormError();
    }

    @Then("^user should see \\[ErrorMessage\\] on shipping and payment section of checkout page$")
    public void user_should_see_ErrorMessage_on_shipping_and_payment_section_of_checkout_page()
            throws Throwable {
        ICreditCardAndBillingInfoSection creditCardAndBillingInfoSection =
                SectionFactory.getFactory().getICreditCardAndBillingInfoSection(
                        "dw.checkout.shippingandpayment.payment.creditcard.addnewcard.form");
        AssertUtils.assertTextMatches(
                creditCardAndBillingInfoSection.getLblErrInvalidCardNumber(),
                Matchers.containsString("Invalid Credit Card Number"));
    }

    @Then("^user should see \\[OrderSummary\\] and \\[OrderDetails\\] and \\[PaymentInformation\\] on submitorder page$")
    public void user_should_see_OrderSummary_and_OrderDetails_and_PaymentInformation_on_submitorder_page()
            throws Throwable {
        PauseUtil.pause(3000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        // shippingAndPayment.verifyPaymentSectionOnShippingAndPayment();
        shippingAndPayment.verifyShippingAddressSectionOnShippingAndPayment();
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrder();
        AssertUtils.assertDisplayed(confirmAndSubmitOrder.getLstBtnPrint().get(0));
        // Payment method will be null for SOO item checkout
        if (TestBaseProvider.getTestBase().getTestData().getString("module")
                .equalsIgnoreCase("teacher")
                && TestBaseProvider.getTestBase().getContext()
                .getProperty("testExecution.paymentMethod") != null) {
            confirmAndSubmitOrder.verifyPaymentSectionForTeacherOnConfirmAndSubmitSection(
                    TestBaseProvider.getTestBase().getContext()
                            .getString("testexecution.paymentmethod"));
            // Cart items will not be present on this page there
            // will be locator issues
            // ICartPage cartPage = getFactory().getICartPage();
            // cartPage.verifyCartItems();
        } else {
            confirmAndSubmitOrder.verifyPaymentMethodDetailsOnConfirmAndSubmit();
        }
    }

    @When("^user decides to \"([^\"]*)\" on confirm and submit section of checkout page$")
    public void user_decides_to_return_or_edit_on_confirm_and_submit_section_of_checkout_page(
            String args) throws Throwable {
        if (args.equalsIgnoreCase("edit cart")) {
            ConfirmAndSubmitOrder confirmAndSubmitOrderPage =
                    getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
            if (confirmAndSubmitOrderPage.getBtnEditCartOnConfirmpage().getText()
                    .equalsIgnoreCase("Edit Cart")) {
                confirmAndSubmitOrderPage.getBtnEditCartOnConfirmpage().click();
            }

        }
        if (args.equalsIgnoreCase("return-to-shop")) {
            ShippingAndPayment shippingAndPayment =
                    getFactory().getICheckoutPage().getShippingAndPaymentSection();
            if (shippingAndPayment.getLnkEditCart().getText()
                    .equalsIgnoreCase("Return to Shop")) {
                shippingAndPayment.getLnkEditCart().click();
            }

        }

    }

    @Then("^user is on rewards and coupons page$")
    public void user_is_on_rewards_and_coupons_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        AssertUtils.assertDisplayed(rewardsAndCoupons.getLblRewards());
        AssertUtils.assertDisplayed(rewardsAndCoupons.getLblCoupons());
        Assert.assertTrue(checkoutPage.getLblPageSubTitle().getText()
                .contains(ConstantUtils.REWARDSANDCOUPONS));

    }

    @Then("^user is on shipping and payment page$")
    public void user_is_on_shipping_and_payment_page() throws Throwable {
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        AssertUtils.assertDisplayed(shippingAndPayment.getBtnContinueCheckout());

    }

    @Then("^user is on confirm and submit page$")
    public void user_is_on_confirm_and_submit_page() throws Throwable {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrder();
        AssertUtils.assertDisplayed(confirmAndSubmitOrder.getBtnSubmitOrder());
    }

    @Then("^user return to rewards and coupons page from submit order page$")
    public void user_return_to_rewards_and_coupons_page_from_submit_order_page()
            throws Throwable {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrder();
        confirmAndSubmitOrder.getTabRewardsAndCoupon().click();
        PauseUtil.pause(2000);
    }

    @Then("^user should see books and resource page$")
    public void user_should_come_on_shop_books_resource_page() throws Throwable {
        IBooksAndResourcesPage bookandresourcepage =
                getFactory().getIBooksAndResourcesPage();
        bookandresourcepage.verifyShopsBooksResources();

    }

    @When("^user wants to edit \"([^\"]*)\" email-id for current order$")
    public void user_wants_to_edit_email_id_for_current_order(String status)
            throws Throwable {
        ConfirmAndSubmitOrder confirmAndSubmitOrderPage =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        if (status.equals("correct")) {
            confirmAndSubmitOrderPage.editEmailAddress(
                    TestBaseProvider.getTestBase().getTestData().getString("email"));

        } else {
            confirmAndSubmitOrderPage.editEmailAddress("test123.com");
        }
    }

    @Then("^user should see updated email address on ThankYouModal$")
    public void user_should_see_updated_email_address_on_ThankYouModal()
            throws Throwable {
        ConfirmAndSubmitOrder confirmAndSubmitOrderPage =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        AssertUtils.assertDisplayed(confirmAndSubmitOrderPage.getConfirmationEmail());
        Assert.assertEquals(confirmAndSubmitOrderPage.getConfirmationEmail().getText(),
                TestBaseProvider.getTestBase().getTestData().getString("email"));

    }

    @When("^user wants to pay with credit card greater than \"([^\"]*)\"$")
    public void user_wants_to_pay_with_credit_card_greater_than(String amount)
            throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPaymentPage.paymentWithCardGreaterThanSpeAmount(amount);

    }

    @Then("^user gets \"([^\"]*)\" shipping method on shipping and payment section of checkout page$")
    public void user_gets_shipping_method_on_shipping_and_payment_section_of_checkout_page(
            String shippingMethod) {
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.verifyShippingMethod(shippingMethod);
    }

    @Then("^user selects payment method as purchase order on shipping page$")
    public void user_selects_payment_method_as_purchase_order_on_shipping_page()
            throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        shippingAndPaymentPage.waitForPageLoad();
        TestBaseProvider.getTestBase().getContext().setProperty(
                "testexecution.paymentmethod", ConstantUtils.PURCHASEORDERPAYMENTMETHOD);
        SCHUtils.selectOptionByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                "Purchase Order");

    }

    @Then("^user should be able to check the \\[DetailsOfPurchaseOrder\\] on shipping page$")
    public void user_should_be_able_to_check_the_DetailsOfPurchaseOrder_on_shipping_page()
            throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        shippingAndPaymentPage.verifyPurchaseOrderDetail();

    }

    @Then("^user gets shipping charge of \"([^\"]*)\" on shipping and payment section of checkout page$")
    public void user_gets_shipping_charge_of_on_shipping_and_payment_section_of_checkout_page(
            String shippingCharge) throws Throwable {
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.waitForPageLoad();
        shippingAndPayment.verifyShippingCharge(shippingCharge);
    }

	/*
	 * @Then("^FREE displays in Shipping & Handling blue header$")
	 * public void free_displays_in_shipping_handling_blue_header() throws
	 * Throwable {
	 * ShippingAndPayment shippingAndPayment =
	 * getFactory().getICheckoutPage().getShippingAndPaymentSection();
	 * shippingAndPayment.waitForPageLoad();
	 * shippingAndPayment.verifyFreeShippingCharge(
	 * TestBaseProvider.getTestBase().getTestData().getString("shippingCharge").
	 * trim());
	 * }
	 */

    @And("^teacher receives FREE shipping$")
    public void teacher_receives_free_shipping() throws Throwable {
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.waitForPageLoad();
        shippingAndPayment.verifyFreeShippingCharge(TestBaseProvider.getTestBase()
                .getTestData().getString("shippingCharge").trim());
    }
    
    @And("^shipping displays FREE$")
    public void shipping_displays_free() throws Throwable {
    	ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.waitForPageLoad();
        shippingAndPayment.verifyFreeShippingCharge(TestBaseProvider.getTestBase()
                .getTestData().getString("shippingCharge").trim());
    }


    @Then("^teacher sees error message “Shipping for your order is already FREE! This coupon code cannot be applied\\.”$")
    public void teacher_sees_error_message_shipping_for_your_order_is_already_free_this_coupon_code_cannot_be_applied() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        rewardsAndCoupons.verifyErrorMsgFreeShippingOnAlreadyFreeShip(
                TestBaseProvider.getTestBase().getTestData());
    }


    @And("^teacher still has FREE shipping$")
    public void teacher_still_has_free_shipping() throws Throwable {
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.waitForPageLoad();
        shippingAndPayment.verifyFreeShippingCharge(TestBaseProvider.getTestBase()
                .getTestData().getString("shippingCharge").trim());
    }

    @Then("^\\[Shipping Fee\\] displays in Shipping & Handling blue header$")
    public void shipping_fee_displays_in_shipping_handling_blue_header()
            throws Throwable {
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.waitForPageLoad();
        shippingAndPayment.verifyShippingCharge(TestBaseProvider.getTestBase()
                .getTestData().getString("shippingCharge").trim());
    }

    @Then("^teacher does not receive free Shipping$")
    public void teacher_does_not_receive_free_shipping() throws Throwable {
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.waitForPageLoad();
        shippingAndPayment.verifyShippingCharge(TestBaseProvider.getTestBase()
                .getTestData().getString("shippingCharge").trim());
    }


    @And("^Shipping Handling, GST, PST and Shipping & Handling Total displays in Shipping & Handling section$")
    public void shipping_handling_gst_pst_and_shipping_handling_total_displays_in_shipping_handling_section() throws Throwable {
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.waitForPageLoad();
        shippingAndPayment.verifyShippingCharge_Province(TestBaseProvider.getTestBase().getTestData().getString("shippingCharge"),
                TestBaseProvider.getTestBase().getTestData().getString("tax1_per"),
                TestBaseProvider.getTestBase().getTestData().getString("tax2_per"));
    }


    @And("^Shipping Handling, GST, QST and Shipping & Handling Total displays in Shipping & Handling section$")
    public void shipping_handling_gst_qst_and_shipping_handling_total_displays_in_shipping_handling_section() throws Throwable {
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.waitForPageLoad();
        shippingAndPayment.verifyShippingCharge_Province(TestBaseProvider.getTestBase().getTestData().getString("shippingCharge"),
                TestBaseProvider.getTestBase().getTestData().getString("tax1_per"),
                TestBaseProvider.getTestBase().getTestData().getString("tax2_per"));
        shippingAndPayment.verifyShippingCharge_Province_BlueBarTotal_TwoLine();
    }


    @And("^Shipping Handling, HST and Shipping & Handling Total displays in Shipping & Handling section$")
    public void shipping_handling_hst_and_shipping_handling_total_displays_in_shipping_handling_section() throws Throwable {
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.waitForPageLoad();
        shippingAndPayment.verifyShippingCharge_Province(TestBaseProvider.getTestBase().getTestData().getString("shippingCharge"),
                TestBaseProvider.getTestBase().getTestData().getString("tax1_per"),
                TestBaseProvider.getTestBase().getTestData().getString("tax2_per"));

        shippingAndPayment.verifyShippingCharge_Province_BlueBarTotal_SingleLine();
    }


    @And("^Shipping Handling, GST and Shipping & Handling Total displays in Shipping & Handling section$")
    public void shipping_handling_gst_and_shipping_handling_total_displays_in_shipping_handling_section() throws Throwable {
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.waitForPageLoad();
        shippingAndPayment.verifyShippingCharge_Province(TestBaseProvider.getTestBase().getTestData().getString("shippingCharge"),
                TestBaseProvider.getTestBase().getTestData().getString("tax1_per"),
                TestBaseProvider.getTestBase().getTestData().getString("tax2_per"));

        shippingAndPayment.verifyShippingCharge_Province_BlueBarTotal_SingleLine();
    }


    @And("^Shipping Handling \"([^\"]*)\" and \"([^\"]*)\" Shipping & Handling Total displays in Shipping Handling section$")
    public void shipping_handling_something_and_something_shipping_handling_total_displays_in_shipping_handling_section(
            String strArg1, String strArg2) throws Throwable {
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.waitForPageLoad();
        shippingAndPayment.verifyShippingCharge(TestBaseProvider.getTestBase()
                .getTestData().getString("shippingCharge").trim());
    }

    @Then("^user gets shipping charge of \"(.*)\" on submit and order section of checkout page$")
    public void user_gets_shipping_charge_of_shippingcharge_on_submit_and_order_section_of_checkout_page(
            String shippingCharge) {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        confirmAndSubmitOrder.waitForpageToLoad();
        confirmAndSubmitOrder.verifyShippingChargeOnOrderSubmitSection(shippingCharge);
    }

    @Then("^user gets shipping charge of \"(.*)\" on order confirmation page$")
    public void user_gets_shipping_charge_of_shippingcharge_on_order_confirmation_page(
            String shippingCharge) {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        PauseUtil.waitForAjaxToComplete(5000);
        confirmAndSubmitOrder.verifyShippingChargeOnOrderSubmitSection(shippingCharge);
    }

    @When("^user saves edited information of card$")
    public void user_saves_edited_information_of_card() {
        ICreditCardAndBillingInfoSection creditCardAndBillingInfoSection =
                SectionFactory.getFactory().getICreditCardAndBillingInfoSection(
                        "dw.checkout.shippingandpayment.payment.creditcard.addnewcard.form");
        creditCardAndBillingInfoSection.getBtnSave().click();
        SCHUtils.waitForLoaderToDismiss();
    }

    @When("^user cancels to update information of card$")
    public void user_cancels_to_update_information_of_card() {
        ICreditCardAndBillingInfoSection creditCardAndBillingInfoSection =
                SectionFactory.getFactory().getICreditCardAndBillingInfoSection(
                        "dw.checkout.shippingandpayment.payment.creditcard.addnewcard.form");
        creditCardAndBillingInfoSection.clickOnCancel();
        SCHUtils.waitForLoaderToDismiss();
    }

    @Then("^user should see apple status icon on checkout page$")
    public void user_should_see_apple_status_icon_on_checkout_page() {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verifyAppleIcon(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^user is not able to select apple status icon on checkout page$")
    public void user_is_not_able_to_select_apple_status_icon_on_checkout_page() {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verifyAppleIconNotClickable(
                TestBaseProvider.getTestBase().getTestData());
    }

    @When("^user select pay in paypal page$")
    public void user_select_pay_in_paypal_page() {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clickChangeLinkOfPaypalSection();
    }

    @Then("^user should see different wallet list on paypal page$")
    public void user_should_see_different_wallet_list_on_paypal_page() {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verifyWalletSectionOfPaypal();
    }

    @Then("^user returns to shipping and payment page from paypal$")
    public void user_returns_to_shipping_and_payment_page_from_paypal() {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clickCancelLinkOfPaypalSection();
    }

    @When("^user select different payment method$")
    public void user_select_different_payment_method() {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.selectWalletOption(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^user should see updated message on paypal page$")
    public void user_should_see_updated_message_on_paypal_page() {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verifyPaymetMethodUpdatedMsg();
    }

    @And("^user click on agree and continue on paypal page$")
    public void AgreeAndContinuePaypal() {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clickOnAgreeAndContinuePaypal();
    }

    @Given("^user check paypal information is saved in my profile page$")
    public void user_check_paypal_information_is_saved_in_my_profile_page()
            throws Throwable {
        IHeaderSection headerSection = SectionFactory.getFactory()
                .getIHeaderSection(LocatorUtils.getBy("dw.header.section"));
        headerSection.clickOnMenuOptions("My Account", "Profile");
        IProfilePage profilePage = getFactory().getIProfilePage();
        profilePage.waitForPageLoad();
        profilePage.verifyDefaultSavedPaypalCard();
        headerSection.clickOnHomeIcon();
    }

    @When("^user selects payment method as paypal on shipping page$")
    public void user_selects_payment_method_as_paypal_on_shipping_page()
            throws Throwable {
        PauseUtil.waitForAjaxToComplete(4000);
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.PAYPAL);

        // Here only drop down paypal needs to be selected, no need to click on
        // continue to paypal, for this there is a separate step
        // SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueToPaypal());
    }

    @Then("^user should see another funding source in paypal page$")
    public void user_should_see_another_funding_source_in_paypal_page() {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPaymentPage.verifyAnotherFundingSourceInPaypal();
    }

    @Then("^user should update paypal wallet in paypal page$")
    public void user_should_update_paypal_wallet_in_paypal_page() {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.updatePaypalWallet();

    }

    @When("^user selects continue to paypal on shipping and payment page$")
    public void user_selects_continue_to_paypal_on_shipping_and_payment_page()
            throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        // in parent shipping charge is not display on submit page so i comment
        // this
        // TestBaseProvider.getTestBase().getContext().setProperty(
        // ConstantUtils.SHIPPING_CHARGES_BEFORE_PayPal,
        // SCHUtils.getPriceWithOutCurrency(
        // shippingAndPaymentPage.getLblPaymentShipingcharge().getText()));
        System.out.println("Before Handle......"
                + TestBaseProvider.getTestBase().getDriver().getWindowHandle());

        TestBaseProvider.getTestBase().getContext().setProperty("execution.window.handle",
                TestBaseProvider.getTestBase().getDriver().getWindowHandle());
        // ShippingAndPayment shippingAndPaymentPage =
        // getFactory().getICheckoutPage().getShippingAndPaymentSection();
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueToPaypal());
        PauseUtil.pause(5000);
        Assert.assertTrue(
                shippingAndPaymentPage.getBtnContinueToPaypal().getText().trim()
                        .toUpperCase(Locale.ENGLISH).contains("CONTINUE"),
                "continue to paypal button is not found");
        SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueToPaypal());

        // PauseUtil.pause(10000);
        // shippingAndPaymentPage.getBtnContinueToPaypal().click();
    }

    @Then("^user wish to create new paypal account with \\[PaypalDetailInformation\\] and continue$")
    public void user_wish_to_create_new_paypal_account_with_PaypalDetailInformation_and_continue()
            throws Throwable {
        // todo
    }

    @Then("^user should see paypal email address on order and submit page$")
    public void user_should_see_paypal_email_address_on_order_and_submit_page()
            throws Throwable {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrder();
        confirmAndSubmitOrder
                .verifyPaymentSectionForTeacherOnConfirmAndSubmitSection("PayPal");
    }

    @Then("^user should see saved paypal information on shipping and payment page$")
    public void user_should_see_saved_paypal_information_on_shipping_and_payment_page() {
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.verifySavedPaypalAccountInformationOnShippingAndPaymentPage();
    }

    @Then("^user selects send me to paypal option on shipping and payment page$")
    public void user_selects_send_me_to_paypal_option_on_shipping_and_payment_page() {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clickOnSendMetoPaypalCheckBox();
    }

    @When("^user selects \"(.*)\" shipping and purchase order as payment and user verifies it in payment section")
    public void user_selects_shipping_and_purchase_order_as_payment(String amount)
            throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPaymentPage.selectShipingOption(amount);
        shippingAndPaymentPage.getLblShippingInfo().click();
        PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(2000);
        shippingAndPaymentPage.verifyUpadatedShipingCharge(amount);

    }

    @Then("^user should see paypal email address on orderconfirmation page$")
    public void user_should_see_paypal_email_address_on_orderconfirmation_page()
            throws Throwable {
        PauseUtil.pause(2000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrder();
        confirmAndSubmitOrder
                .verifyPaymentSectionForTeacherOnConfirmAndSubmitSection("PayPal");
    }

    @Then("^user should see paypal login page$")
    public void user_should_see_paypal_login_page() {
        if (!TestBaseProvider.getTestBase().getContext().getString("driver.name")
                .equalsIgnoreCase("ios")) {
            for (String handle : TestBaseProvider.getTestBase().getDriver()
                    .getWindowHandles()) {
                System.out.println("Handles..." + handle);
                if (!handle.equals(TestBaseProvider.getTestBase().getContext()
                        .getString("execution.window.handle"))) {
                    TestBaseProvider.getTestBase().getDriver().switchTo().window(handle);
                    break;
                }
            }
        }
        PauseUtil.pause(5000);
        System.out.println("new window:"
                + TestBaseProvider.getTestBase().getDriver().getWindowHandle());
        WebDriverWait wait =
                new WebDriverWait(TestBaseProvider.getTestBase().getDriver(), 150);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("injectedUl"));
        if (!(TestBaseProvider.getTestBase().getContext().getString("driver.name")
                .equals("Android")
                || TestBaseProvider.getTestBase().getContext().getString("driver.name")
                .equals("IOs"))) {
            TestBaseProvider.getTestBase().getDriver().manage().window().maximize();
        }

    }

    @When("^user login with \\[PayPalInformation\\] on paypal login page$")
    public void user_login_with_PayPalInformation_on_paypal_login_page() {
        PauseUtil.waitForAjaxToComplete(8000);
        TestBase testBase = TestBaseProvider.getTestBase();
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        // PauseUtil.pause(3000);
        SCHUtils.waitForLoaderToDismiss();
        // WaitUtils.waitForEnabled(checkoutPage.getTxtPayPalEmail());
        checkoutPage.getTxtPayPalEmail().clear();
        checkoutPage.getTxtPayPalEmail()
                .sendKeys(testBase.getTestData().getString("paypalemail"));
        checkoutPage.getTxtPayPalPassword().clear();
        checkoutPage.getTxtPayPalPassword()
                .sendKeys(testBase.getTestData().getString("paypalpassword"));
        WaitUtils.waitForEnabled(checkoutPage.getBtnPayPalLogin());
        checkoutPage.getBtnPayPalLogin().click();
        testBase.getDriver().switchTo().defaultContent();
    }

    @Then("^user should see agree and continue button on paypal page$")
    public void user_should_see_agree_and_continue_button_on_paypal_page() {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        Assert.assertTrue(checkoutPage.getBtnPayPalAgreeAndContinue().isDisplayed(),
                "user is not on paypal home page");
    }

    @And("^user agrees and continues on paypal home page$")
    public void user_agrees_and_continues_on_paypal_home_page() {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        try {
            WebDriverWait wait =
                    new WebDriverWait(TestBaseProvider.getTestBase().getDriver(), 60);
            wait.until(ExpectedConditions
                    .elementToBeClickable(checkoutPage.getBtnPayPalAgreeAndContinue()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        SCHUtils.scrollToView(checkoutPage.getBtnPayPalAgreeAndContinue());
        PauseUtil.pause(3000);
        checkoutPage.getBtnPayPalAgreeAndContinue().click();
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.paymentmethod", ConstantUtils.PAYPAL);
        PauseUtil.pause(3000);
        // SCHUtils.waitForLoaderToDismiss();
        // SCHUtils.WaitForAjax();
        if (!TestBaseProvider.getTestBase().getContext().getString("driver.name")
                .equalsIgnoreCase("IOs")) {
            TestBaseProvider.getTestBase().getDriver().switchTo().window(TestBaseProvider
                    .getTestBase().getContext().getString("execution.window.handle"));
        }

        try {
            WaitUtils.waitForEnabled(checkoutPage.getBtnPayPalContinue());
            checkoutPage.getBtnPayPalContinue().click();
        } catch (Exception e) {
            // TODO: handle exception
        }
        PauseUtil.pause(3000);
        // SCHUtils.waitForLoaderToDismiss();
        // SCHUtils.WaitForAjax();
    }

    @Then("user should review paypal home page")
    public void user_should_review_paypal_home_page() {
        CheckoutPage checkoutPage = new CheckoutPage();
        WaitUtils.waitForDisplayed(checkoutPage.getLblPaypalCart());
        AssertUtils.assertDisplayed(checkoutPage.getLnkChangePaypalSection());
        AssertUtils.assertDisplayed(checkoutPage.getLblPaypalCart());
        String cart = checkoutPage.getLblPaypalCart().getText();
        Assert.assertTrue(cart.contains("USD"));
        cart = cart.split(" ")[0];
        if (TestBaseProvider.getTestBase().getTestData().getString("module")
                .equals("parent")) {
            Assert.assertEquals(
                    SCHUtils.getProductItemTotal(SCHUtils.getPOProductItems()),
                    SCHUtils.getPriceWithOutCurrency(cart));
        } else if (TestBaseProvider.getTestBase().getTestData().getString("module")
                .equals("teacher")) {
            double shippingcharges = 0.0;
            if (TestBaseProvider.getTestBase().getContext()
                    .getProperty(ConstantUtils.SHIPPING_CHARGES_BEFORE_PayPal) != null) {
                shippingcharges =
                        Double.parseDouble(TestBaseProvider.getTestBase().getContext()
                                .getProperty(ConstantUtils.SHIPPING_CHARGES_BEFORE_PayPal)
                                .toString());

            }
            Assert.assertEquals(
                    SCHUtils.getProductItemTotal(SCHUtils.getYTOProductItems())
                            + shippingcharges,
                    SCHUtils.getPriceWithOutCurrency(cart));
        }
    }

    @Then("^user selects shipping method as two business day shipping$")
    public void user_selects_shipping_method_as_two_business_day_shipping()
            throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPaymentPage.selectTwoBusinessDayShipping();
    }

    @Then("^user is on review cart page$")
    public void user_is_on_review_cart_page() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        AssertUtils.assertTextMatches(checkoutPage.getLblPageSubTitle(),
                Matchers.containsString(ConstantUtils.REVIEWCARTPAGE));
    }

    @Then("^user should see \\[OrderSummary\\] on rewards and coupons section of checkout page$")
    public void user_should_see_OrderSummary_on_rewards_and_coupons_section_of_checkout_page() {
        IProductOrderSummarySection iProductOrderSummarySection =
                SectionFactory.getFactory().getIProductOrderSummarySection(
                        LocatorUtils.getBy("dw.product.order.summary.cmp"));
        iProductOrderSummarySection
                .verifyOrderSummary(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^teacher should see \\[OrderSummary\\] on rewards and coupons section of checkout page$")
    public void teacher_should_see_ordersummary_on_rewards_and_coupons_section_of_checkout_page()
            throws Throwable {
        IProductOrderSummarySection iProductOrderSummarySection =
                SectionFactory.getFactory().getIProductOrderSummarySection(
                        LocatorUtils.getBy("dw.product.order.summary.cmp"));
        iProductOrderSummarySection.verifyOrderTotalDue_RewardsCouponsPage(
                TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^user enters purchase order number on shipping page$")
    public void user_enters_purchase_order_number_on_shipping_page() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPaymentPage.enterPurchaseOrderNumber();
    }

    @When("^user selects shipping method as a free standard$")
    public void user_selects_shipping_method_as_a_free_standard() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPaymentPage.selectStandardShipping();
    }

    @Then("^user should see \\[OrderSummary\\] on shipping and payement section of checkout page$")
    public void user_should_see_OrderSummary_on_shipping_and_payement_section_of_checkout_page() {
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.verifyOrderSummerySectionOnShippingAndPayment();
    }

    @Then("^user should see \\[OrderSummary\\] on confirm and submit section of checkout page$")
    public void user_should_see_OrderSummary_on_confirm_and_submit_section_of_checkout_page() {
        IProductOrderSummarySection iProductOrderSummarySection =
                SectionFactory.getFactory().getIProductOrderSummarySection(
                        LocatorUtils.getBy("dw.product.order.summary.cmp"));
        iProductOrderSummarySection
                .verifyOrderSummary(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^user should see \\[OrderSummary\\] on submit page$")
    public void user_should_see_OrderSummary_on_submit_page() {
        user_should_see_OrderSummary_on_confirm_and_submit_section_of_checkout_page();
    }

    @Then("^user gets order receipt$")
    public void user_gets_order_receipt() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        AssertUtils.assertTextMatches(checkoutPage.getLblPageSubTitle(),
                Matchers.containsString(ConstantUtils.THANKYOUFORORDER_TEXT));
    }

    @When("^user adds coupons on rewards and coupons page$")
    public void user_adds_coupons_on_rewards_and_coupons_page() {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("couponnumber"));
        for (int i = 0; i < coupons.length; i++) {
            rewardsAndCoupons.enterCoupon(coupons[i]);

            ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
            checkoutPage.addscoupon(TestBaseProvider.getTestBase().getTestData(), i);
        }

		/*
		 * rewardsAndCoupons.enterCoupon(TestBaseProvider.getTestBase().
		 * getTestData
		 * ());
		 * ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		 * checkoutPage.addscoupon(TestBaseProvider.getTestBase().getTestData())
		 * ;
		 */
    }

    @Then("^user enters coupons on rewards and coupons page$")
    public void user_enters_coupons_on_rewards_and_coupons_page() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("couponnumber"));
        for (String coupon : coupons) {
            rewardsAndCoupons.enterCoupon(coupon);

        }

        // rewardsAndCoupons.enterCoupon(TestBaseProvider.getTestBase().getTestData());
    }

    @When("^Teacher enters \\[Free Pick Coupon\\] on rewards and coupons page$")
    public void teacher_enters_free_pick_coupon_on_rewards_and_coupons_page()
            throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("CouponCode"));
        for (String coupon : coupons) {
            rewardsAndCoupons.enterCoupon(coupon);

        }
    }

    @When("^Teacher enters \\[UniqueFreePickCoupon\\] on rewards and coupons page$")
    public void teacherEntersUniqueFreePickCouponOnRewardsAndCouponsPage() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("CouponCode"));
        for (String coupon : coupons) {
            rewardsAndCoupons.enterCoupon(coupon);
        }
    }


    @And("^teacher closes the Free pick modal without making any selections$")
    public void teacher_closes_the_free_pick_modal_without_making_any_selections () throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clickOnCloseIcon();
    }


    @Then("^Free pick modal displays$")
    public void free_pick_modal_displays() throws Throwable {
        ICartPage page = getFactory().getICartPage();
        page.getICouponSection().verifyCouponsModalWithMakeYourSelectionSection();
    }

    @Then("^teacher should see order does not meet coupon requirements error message$")
    public void teacher_should_see_order_does_not_meet_coupon_requirements_error_message()
            throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        rewardsAndCoupons.verifyDoesNotMeetFreePickCouponrequirements();
    }

    @Then("^teacher sees error message for order amount not meeting for Free Shipping$")
    public void teacher_sees_error_message_for_order_amount_not_meeting_for_free_shipping()
            throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        rewardsAndCoupons.verifyOrderAmtNotMeetingFreeShippingMsg(
                TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^teacher sees error message for using same coupon$")
    public void teacher_sees_error_message_for_using_same_coupon() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        rewardsAndCoupons.verifyErrorMsgForUsingSameCoupon(
                TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^teacher sees error message for using same coupon2$")
    public void teacher_sees_error_message_for_using_same_coupon2() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        rewardsAndCoupons.verifyErrorMsgFreeShippingOnAlreadyFreeShip(
                TestBaseProvider.getTestBase().getTestData());
    }


    @Then("^user should see coupon already applied error message$")
    public void user_should_see_coupon_already_applied_error_message() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        rewardsAndCoupons.verifyCouponAlreadyAppliedMsg(
                TestBaseProvider.getTestBase().getTestData());
    }


    @Then("^user should see invalid coupn error message$")
    public void user_should_see_invalid_coupn_error_message() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        rewardsAndCoupons.verifyInvalidCouponErrorMsg();
    }

    @Then("^user should see \\[INVALIDEMAILERRORMESSAGE\\] on confirm and submit section of checkout page$")
    public void user_should_see_INVALIDEMAILERRORMESSAGE_on_confirm_and_submit_section_of_checkout_page() {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrder();
        confirmAndSubmitOrder.verifyErrorMessageOnConfirmAndSubmitSection(
                ConstantUtils.INVALIDEMAILIDMESSAGE);
    }

    @Then("^user should see updated email address on orderconfirmation page$")
    public void user_should_see_updated_email_address_on_orderconfirmation_page() {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrder();
        confirmAndSubmitOrder.verifyEmailAddress();
    }

    @Then("^user should see updated email address on order sumit page$")
    public void user_should_see_updated_email_address_on_ordersubmit_page() {
        ConfirmAndSubmitOrder confirmAndSubmitOrderPage =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        AssertUtils.assertDisplayed(confirmAndSubmitOrderPage.getConfirmationEmail());
        Assert.assertEquals(confirmAndSubmitOrderPage.getConfirmationEmail().getText(),
                TestBaseProvider.getTestBase().getTestData().getString("updatedemail"));
    }

    @Then("^user can update email address on orderconfirmation page$")
    public void user_can_update_email_address_on_orderconfirmation_page() {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrder();
        confirmAndSubmitOrder.updateEmailAddress();
    }

    @Then("^user should see print option on submit order page$")
    public void user_should_see_print_option_on_submit_order_page() {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrder();
        confirmAndSubmitOrder.verifyPrintOption();
    }

    @Then("^user should not see print option for mobile view on submit order page$")
    public void user_should_not_see_print_option_on_submit_order_page() {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrder();
        confirmAndSubmitOrder.verifyPrintOption();
    }

    @Then("^user edits free pick coupon on rewards and coupons page$")
    public void user_edits_free_pick_coupon_on_rewards_and_coupons_page()
            throws Throwable {

        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        rewardsAndCoupons
                .editFreePickCoupon(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^user verifies coupons section on rewards and coupons page$")
    public void user_verifies_coupons_section_on_rewards_and_coupons_page()
            throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        rewardsAndCoupons.verifyCouponSectionAfterApplyingCoupon(
                TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^user verifies bonus points section on rewards and coupons page$")
    public void user_verifies_bonus_points_section_on_rewards_and_coupons_page()
            throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        rewardsAndCoupons.verifyBonusPointsActivitySection();
    }

    @Then("^user should see order number on submit order page$")
    public void checkOrderNumber() {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrder();
        confirmAndSubmitOrder.verifyOrderNumber();
    }

    @Then("^user should see email address on ThankYouModal$")
    public void seeEmailOnShipping() {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        confirmAndSubmitOrder.verifyEmailAddressFromProfileBean();
        confirmAndSubmitOrder.verifyOrderReceiptAfterCheckout();
    }

    @Then("^user should see coupon summary on confirm and submit section of checkout page$")
    public void user_should_see_coupon_summary_on_checkout_page() throws Throwable {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();

        confirmAndSubmitOrder.verifyCouponOrderDetail();

    }

    @When("^user clicks on delete icon on Rewards and Coupons Page$")
    public void user_clicks_on_delete_icon_on_rewards_and_coupons_page()
            throws Throwable {
        ICheckoutPage checkout = getFactory().getICheckoutPage();
        checkout.getRewardsAndCouponsSection()
                .clickOnRemoveIcon(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^user should be able to delete the item after selecting Yes$")
    public void user_should_be_able_to_delete_the_item_after_selecting_yes()
            throws Throwable {
        ICheckoutPage checkout = getFactory().getICheckoutPage();
        checkout.getRewardsAndCouponsSection().removeItemFromRewardAndCouponAfterYes(
                TestBaseProvider.getTestBase().getTestData());

    }

    @When("^user navigates to SFO page from Rewards and Coupon Page$")
    public void user_navigates_to_SFO_page_from_Rewards_and_Coupon_Page()
            throws Throwable {
        IHeaderSection headerSection = SectionFactory.getFactory()
                .getIHeaderSection(LocatorUtils.getBy("dw.header.checkout.cmp"));
        headerSection.selectHomeIconFromCheckOut();
        ITeachersHomePage homepage = getFactory().getITeachersHomePage();
        homepage.selectOptionFromTeacherHomePage(ConstantUtils.ENTERORDER);
    }

    @Then("^user verifies MGM coupon functionality on rewards and coupons page$")
    public void user_verifies_MGM_coupon_functionality_on_rewards_and_coupons_page()
            throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        rewardsAndCoupons
                .verifyMGMCouponFlow(TestBaseProvider.getTestBase().getTestData());

    }

    @Then("^user enters invalid coupon code and validates error message on rewards and coupons page$")
    public void user_enters_invalid_coupon_code_and_validates_error_message_on_rewards_and_coupons_page()
            throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        rewardsAndCoupons.enterCoupon(TestBaseProvider.getTestBase().getTestData()
                .getString("invalidcouponnumber"));

        rewardsAndCoupons.verifyInvalidCouponErrorMsg();
    }

    @Then("^user enters and verifies incomplete coupon information on rewards and coupons page$")
    public void user_enters_and_verifies_incomplete_coupon_information_on_rewards_and_coupons_page()
            throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        rewardsAndCoupons.enterCoupon(TestBaseProvider.getTestBase().getTestData()
                .getString("incompletecouponnumber"));

        rewardsAndCoupons.verifyCouponEntryFunctionalities(
                TestBaseProvider.getTestBase().getTestData());

    }

    @Then("^user verifies links on rewards and coupons page$")
    public void user_verifies_links_on_rewards_and_coupons_page() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        rewardsAndCoupons.enterCoupon(TestBaseProvider.getTestBase().getTestData()
                .getString("incompletecouponnumber"));

        rewardsAndCoupons.verifyCouponEntryFunctionalities(
                TestBaseProvider.getTestBase().getTestData());

    }

    @Then("^user should see unique count of SFO and SOO student auto populated in the no of student field$")
    public void user_should_see_unique_count_of_student_auto_populated_in_no_of_student_field()
            throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        AssertUtils.assertDisplayed(rewardsAndCoupons.getTxtNoOfStudents());

        AssertUtils.assertAttributeMatches(rewardsAndCoupons.getTxtNoOfStudents(),
                "value", Matchers.equalToIgnoringWhiteSpace(TestBaseProvider.getTestBase()
                        .getTestData().getString("noofstudents")));

    }

    @Then("^teacher should see Q&A toss-in section$")
    public void teacher_should_see_Q_A_toss_in_section() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.getRewardsAndCouponsSection().verifyQandASection();
    }

    @When("^teacher views Q & A Student incentive with no\\. of students$")
    public void teacher_views_q_a_student_incentive_with_no_of_students()
            throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.getRewardsAndCouponsSection().verifyQandASection();
    }

    @Then("^teacher should not see Q & A Student incentive line$")
    public void teacher_should_not_see_q_a_student_incentive_line() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.getRewardsAndCouponsSection().verifyNotQandASection();
    }


    @Then("^Teacher should see Q & A toss\\-in with no\\. of students$")

    public void teacher_should_see_q_a_tossin_with_no_of_students() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.getRewardsAndCouponsSection().verifyQandASection();

    }


    @When("^teacher enters number of students in text field$")
    public void teacher_enters_number_of_students_in_text_field() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();

        checkOut.getRewardsAndCouponsSection()
                .enterTossInNumberOfStudent(TestBaseProvider.getTestBase().getTestData());
    }

    @And("^teacher enters number of students in text field and tries to checkout$")
    public void teacher_enters_number_of_students_in_text_field_and_tries_to_checkout() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();

        checkOut.getRewardsAndCouponsSection()
                .enterTossInNumberOfStudent(TestBaseProvider.getTestBase().getTestData());
        SCHUtils.waitForLoaderToDismiss();
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        SCHUtils.scrollToView(rewardsAndCoupons.getBtnContinueCheckout());
        SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
        SCHUtils.waitForLoaderToDismiss();
    }



    @When("^teacher removes data in no\\. of students$")
    public void teacher_removes_data_in_no_of_students() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.getRewardsAndCouponsSection().removeTossInvalue();

    }

    @And("^teacher does not enter any data in no of students$")
    public void teacher_does_not_enter_any_data_in_no_of_students() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();

        checkOut.getRewardsAndCouponsSection().DoNotenterTossInNumberOfStudent();

    }


    @And("^teacher re\\-enters number of students in text field$")
    public void teacher_reenters_number_of_students_in_text_field() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();

        checkOut.getRewardsAndCouponsSection().ReenterTossInNumberOfStudent(
                TestBaseProvider.getTestBase().getTestData());

    }


    @And("^teacher re\\-enters number of students in error text field$")
    public void teacher_reenters_number_of_students_in_error_text_field() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();

        checkOut.getRewardsAndCouponsSection().Reenter_Error_TossInNumberOfStudent(
                TestBaseProvider.getTestBase().getTestData());
    }


    @Then("^teacher sees Q & A student incentive information in rewards section on Confirm & Submit page$")
    public void teacher_sees_q_a_student_incentive_information_in_rewards_section_on_confirm_submit_page()
            throws Throwable {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        confirmAndSubmitOrder
                .verifyTossInQA(TestBaseProvider.getTestBase().getTestData());
    }


    @And("^teacher should not see Q & A student incentive information in rewards section on Confirm & Submit page$")
    public void teacher_should_not_see_q_a_student_incentive_information_in_rewards_section_on_confirm_submit_page() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.getRewardsAndCouponsSection().verifyNotQandASection();


    }


    @Then("^teacher sees updated Q & A student incentive information in rewards section on Confirm & Submit page$")
    public void teacher_sees_updated_q_a_student_incentive_information_in_rewards_section_on_confirm_submit_page()
            throws Throwable {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        confirmAndSubmitOrder
                .verifyUpdatedTossInQA(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^Teacher does not see Q & A student incentive information in rewards section on Confirm & Submit page$")
    public void teacher_does_not_see_q_a_student_incentive_information_in_rewards_section_on_confirm_submit_page()
            throws Throwable {

        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        confirmAndSubmitOrder.verifyQAStudentIncentiveNotPresent();

    }

    @Then("^teacher see the items selected from Dollars to spend with strike price in Rewards Section$")
    public void teacher_see_the_items_selected_from_dollars_to_spend_with_strike_price_in_rewards_section()
            throws Throwable {
        SCHUtils.waitForLoaderToDismiss();
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        confirmAndSubmitOrder.verifyRewardsAndPromotionDetail();
    }

    @And("^teacher sees the recent selections displayed for DTS in Rewards section$")
    public void teacher_sees_the_recent_selections_displayed_for_dts_in_rewards_section()
            throws Throwable {
        SCHUtils.waitForLoaderToDismiss();
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        confirmAndSubmitOrder.verifyDollarsToSpendRecentSelectionSaved_SubmitOrderPage();
    }

    @And("^teacher sees the previous selections displayed for DTS in Rewards section$")
    public void teacher_sees_the_previous_selections_displayed_for_dts_in_rewards_section()
            throws Throwable {

        SCHUtils.waitForLoaderToDismiss();
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        confirmAndSubmitOrder.verifyDollarsToSpendPreviousSelections_SubmitOrderPage();
    }

    @And("^teacher sees items selected from Dollars to spend with strike price in rewards section on Confirmation page$")
    public void teacher_sees_items_selected_from_dollars_to_spend_with_strike_price_in_rewards_section_on_confirmation_page()
            throws Throwable {
        SCHUtils.waitForLoaderToDismiss();
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        confirmAndSubmitOrder.verifyRewardsAndPromotionDetail();
    }

    @Then("^teacher sees appropriate error message for maximum input$")
    public void teacher_sees_appropriate_error_message_for_maximum_input()
            throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.getRewardsAndCouponsSection()
                .verifyQAStudentIncentiveMaximumErrorMessage();
    }

    @Then("^teacher sees appropriate error message for empty input$")
    public void teacher_sees_appropriate_error_message_for_empty_input()
            throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.getRewardsAndCouponsSection()
                .verifyQAStudentIncentiveEmptyInputErrorMessage();
    }

    @Then("^teacher sees appropriate error message for negative input$")
    public void teacher_sees_appropriate_error_message_for_negative_input()
            throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.getRewardsAndCouponsSection()
                .verifyQAStudentIncentiveNegativeErrorMessage();
    }

    @And("^teacher sees Q & A Student incentive field should not take negative value$")
    public void teacher_sees_q_a_student_incentive_field_should_not_take_negative_value() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.verify_QA_Incentive_field_taking_negative_value(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^Teacher does not see Q & A student incentive information in rewards section on Confirmation page$")
    public void teacher_does_not_see_q_a_student_incentive_information_in_rewards_section_on_confirmation_page()
            throws Throwable {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        confirmAndSubmitOrder.verifyQAStudentIncentiveNotPresent_ConfirmationPage();
    }


    @And("^teacher sees Q & A student incentive information in rewards section on Confirmation page$")
    public void teacher_sees_q_a_student_incentive_information_in_rewards_section_on_confirmation_page()
            throws Throwable {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        confirmAndSubmitOrder.verifyTossInQA_ConfirmationPage(
                TestBaseProvider.getTestBase().getTestData());
    }

    @And("^teacher sees updated Q & A student incentive information in rewards section on Confirmation page$")
    public void teacher_sees_updated_q_a_student_incentive_information_in_rewards_section_on_confirmation_page()
            throws Throwable {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        confirmAndSubmitOrder.verifyUpdatedTossInQA_ConfirmationPage(
                TestBaseProvider.getTestBase().getTestData());
    }

    @When("^user selects goto checkout after adding Item to cart$")
    public void user_selects_goto_checkout_after_adding_Item_to_cart() throws Throwable {
        IProductDetailPage pdp = getFactory().getIProductDetailPage();
        pdp.clickOnAddToCartandCheckout();
    }

    @When("^user removes coupon with \"([^\"]*)\"$")
    public void user_removes_coupon_with(String ConfirmationStatus) throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        rewardsAndCoupons.removeCouponItem(TestBaseProvider.getTestBase().getTestData(),
                ConfirmationStatus);

    }

    @Then("^user should not see removed coupon$")
    public void user_should_not_see_removed_coupon() throws Throwable {

        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        SCHUtils.waitForLoaderToDismiss();
        rewardsAndCoupons.verifyUpdatedRecordsAfterRemoval(
                TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^user verifies coupons sorting order on rewards and coupons page$")
    public void user_verifies_coupon_order_on_rewards_and_coupons_page()
            throws Throwable {

        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        rewardsAndCoupons
                .verifyCouponsSortingOrder(TestBaseProvider.getTestBase().getTestData());
    }

    @When("^user searches invalid keyword for coupon item$")
    public void user_searches_invalid_keyword_for_coupon_item() throws Throwable {

        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        rewardsAndCoupons.enterCoupon(TestBaseProvider.getTestBase().getTestData()
                .getString("couponforinvalidkeyword"));

        rewardsAndCoupons
                .searchInvalidKeyWord(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^user should see invalid keyword error message$")
    public void user_should_see_invalid_keyword_error_message() throws Throwable {

        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        rewardsAndCoupons.verifyInvalidKeyWordSearchErrorMessage();
    }

    @Then("^user verifies free pick modal functionalities on rewards and coupons page$")
    public void user_verifies_free_pick_modal_functionalities_on_rewards_and_coupons_page()
            throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        rewardsAndCoupons.verifyFreePickModalFunctionalities(
                TestBaseProvider.getTestBase().getTestData());

    }

    @Then("^user should see maximum student limit error message$")
    public void user_should_see_maximum_student_limit_error_message() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        rewardsAndCoupons.verifyMaximumStudentLimitErrorMessage();
        rewardsAndCoupons.getBtnContinueCheckout().click();
        rewardsAndCoupons.verifyMaximumStudentLimitErrorMessage();
    }

    @Then("^user should see Rewards and Coupon Page$")
    public void user_should_see_Rewards_and_Coupon_Page() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        rewardsAndCoupons.verifyRewardsAndCouponsPage();
    }

    @When("^user navigate to home page$")
    public void user_navigate_to_home_page() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        WaitUtils.waitForEnabled(checkoutPage.getLnkHome());
        checkoutPage.getLnkHome().click();
    }

    @Then("^user selects \"([^\"]*)\" shipping method on shipping and payment section of checkout page$")
    public void user_selects_shipping_method_on_shipping_and_payment_section_of_checkout_page(
            String shippingMethod) {
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.selectTwoBuissnessDayShippingWithBonusPoint(shippingMethod);
    }

    @Then("^user should see Insufficient Bonus Points Model$")
    public void user_should_see_Insufficient_Bonus_Points_Model() throws Throwable {
        ICheckoutPage checkoutpage = getFactory().getICheckoutPage();
        checkoutpage
                .verifyInsufficientBPModel(TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^user should be able to update the cart from Insufficient Bonus Points Model$")
    public void user_should_be_able_to_update_the_cart_from_Insufficient_Bonus_Points_Model()
            throws Throwable {
        ICheckoutPage checkoutpage = getFactory().getICheckoutPage();
        checkoutpage.clickOnGotoYourTeacherOrder();
        PauseUtil.pause(5000);
        IYourTeacherOrderPage yourteacherorder = getFactory().getIYourTeacherOrderPage();
        yourteacherorder.verifyYTOInstructionPage();
    }

    @Then("^user should see SFO SOO and YTO order tabs from enter orders page$")
    public void user_should_see_SFO_SOO_and_YTO_order_tabs_from_enter_orders_page() {
        StudentFlyerOrdersPage studentFlyerOrderSteps = new StudentFlyerOrdersPage();
        studentFlyerOrderSteps.verifyOrderTabs();
    }

    @When("^user changes data key \"([^\"]*)\"$")
    public void user_changes_data_key(String coupondatakey) throws Throwable {
        TestBaseProvider.getTestBase().setTestDataFromXml(coupondatakey);
    }

    @Then("^user should not see AgreementId$")
    public void user_should_not_see_AgreementId() {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verifyAgreementIdNotPresent(
                TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^user should see Payment Method UnEditable$")
    public void user_should_see_Payment_Method_UnEditable() {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.getShippingAndPaymentSection().verifyPaymentMethodUneditable();
    }

    @Then("^user selects to go to home page from shipping and payment page$")
    public void user_selects_to_go_to_home_page_from_shipping_and_payment_page()
            throws Throwable {
        SCHUtils.waitForLoaderToDismiss();
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        SCHUtils.clickUsingJavaScript(shippingAndPayment.getGoToHomeButton());
        // shippingAndPayment.getGoToHomeButton().click();
    }

    @Then("^user should see Billing AgreementId is same$")
    public void user_should_see_Billing_AgreementId_is_same() throws Throwable {
        ICheckoutPage checkout = getFactory().getICheckoutPage();
        checkout.verifyBillingAgreementIdareSame(
                TestBaseProvider.getTestBase().getTestData());
    }

    @When("^user adds dollar to spend coupon with top off amount on rewards and coupon page$")
    public void user_adds_dollar_to_spend_coupon_with_top_off_amount_on_rewards_and_coupon_page()
            throws Throwable {

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.addDollarToSpentCouponWithTopOff(
                TestBaseProvider.getTestBase().getTestData());
    }

    @When("^user selects return to shop from checkout page$")
    public void user_selects_return_to_shop_from_submit_order_page() throws Throwable {

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.selectReturnToShop();
    }

    @When("^user removes \"([^\"]*)\" coupon with \"([^\"]*)\"$")
    public void user_removes_specific_coupon_with_status(String CouponId,
                                                         String ConfirmationStatus) throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        rewardsAndCoupons.removeCouponItemWithSpecificId(CouponId, ConfirmationStatus);

    }

    @When("^teacher clicks on Delete coupon$")
    public void teacher_clicks_on_delete_coupon() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        rewardsAndCoupons.deleteCouponIcon();
    }

    @And("^teacher clicks on No option$")
    public void teacher_clicks_on_no_option() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        rewardsAndCoupons.deleteCouponIconNo();
    }


    @And("^teacher clicks on Yes option$")
    public void teacher_clicks_on_yes_option() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        rewardsAndCoupons.deleteCouponIconYes();
    }

    @Then("^coupon is not deleted$")
    public void coupon_is_not_deleted() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_applied_coupon_is_displayed_in_coupons_section_Rewards_page();
    }

    @When("^user verifies bonus point calculation on rewards and coupons page$")
    public void user_verifies_bonus_point_calculation_on_rewards_and_coupons_page()
            throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        rewardsAndCoupons.verifyBonusPointCalculation();
    }

    @When("^user should not see print button on submit order page$")
    public void user_should_not_see_print_button_on_submit_order_page() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verifyPrintButtonFunctionality();
    }

    @When("^user verifies fully used dollar to spend popup$")
    public void user_verifies_fully_used_dollar_to_spend_popup() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        rewardsAndCoupons.verifyFullyUsedDollarToSpendPopup(
                TestBaseProvider.getTestBase().getTestData());
    }

    @Then("^user should see all the payment methods functionality$")
    public void user_should_see_all_the_payment_methods_functionality() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        SCHUtils.waitForLoaderToDismiss();
        SCHUtils.selectOptionByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CREDITCARD);
        shippingAndPaymentPage.verifyCardTypeField();
        SCHUtils.selectOptionByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CHECK);
        PauseUtil.pause(3000);
        shippingAndPaymentPage.verifyCheckDetailsOnShippingAndPaymentSection();
        ;
        SCHUtils.selectOptionByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CHECKSANDCREDITCARD);
        PauseUtil.pause(3000);
        shippingAndPaymentPage.verifyPamentWithCombinationOfCCAndChecks();

        SCHUtils.selectOptionByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.PURCHASEORDERPAYMENTMETHOD);
        PauseUtil.pause(3000);
        shippingAndPaymentPage.verifyPurchaseOrderDetail();

        SCHUtils.selectOptionByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.PAYPAL);
        PauseUtil.pause(3000);
        shippingAndPaymentPage.verifyContinueToPaypalOptionAndClick();

    }

    @When("^user should see apple status info on confirm and submit page$")
    public void user_should_see_apple_status_info_on_confirm_and_submit_page() {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        confirmAndSubmitOrder.verifyAppleStatus();
    }

    @Then("^user should see OrderSummary ,Payment Method and Shipping Section$")
    public void user_should_see_OrderSummary_Payment_Method_and_Shipping_Section()
            throws Throwable {
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        confirmAndSubmitOrder.verifyPaymentMethodDetailsOnConfirmAndSubmit();
        confirmAndSubmitOrder.verifyParentOrderSummarySection();
        confirmAndSubmitOrder.verifyShippingSectionDetails();
    }


    @And("^teacher clicks on Make Selection button$")
    public void teacher_clicks_on_make_selection_button() throws Throwable {
        ICheckoutPage iCheckoutPage = getFactory().getICheckoutPage();
        iCheckoutPage.clickOnMakeSelectionButton();
        System.out.println("teacher clicks on Make Selection button" + Total_Owing_Amount_act_1.getTotal_StudenClub_Value());
        System.out.println("NEW-teacher clicks on Make Selection button"+TestBaseProvider.getTestBase().getContext()
                .getProperty("Total_StudenClub_Value"));

    }

    @And("^teacher sees the Dollars to spend promotion$")
    public void teacher_sees_the_dollars_to_spend_promotion() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.verify_Dollars_To_Spend_Section_displayed();
    }

    @And("^teacher sees the Dollars to spend promotion2$")
    public void teacher_sees_the_dollars_to_spend_promotion2() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        double Tot_Amt = CheckoutPage.verify_Dollars_To_Spend_Section_displayed_and_get_Tot_amt();
        Total_Owing_Amount_act_1.setTotal_StudenClub_Value(Tot_Amt);
        System.out.println("teacher sees the Dollars to spend promotion2" + Total_Owing_Amount_act_1.getTotal_StudenClub_Value());
    }

    @Then("^teacher does not see the Dollars to spend promotion$")
    public void teacher_does_not_see_the_dollars_to_spend_promotion() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.verify_Dollars_To_Spend_Section_is_not_displayed();
    }

    @Then("^teacher does not recieve Bonus percentage dollars$")
    public void teacher_does_not_recieve_bonus_percentage_dollars() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.verify_earned_BonusBank_amt_is_not_displayed_in_rewardsPage();
    }

    @And("^teacher does not see the Bonus percentage description in Rewards section$")
    public void teacher_does_not_see_the_bonus_percentage_description_in_rewards_section() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.verify_Bonus_percentage_description_is_not_displayed_in_rewardsPage();
    }

    @Then("^teacher does not receive Flat Bonus dollars$")
    public void teacher_does_not_receive_flat_bonus_dollars() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        //CheckoutPage.verify_earned_BonusBank_amt_is_not_displayed_in_rewardsPage();
        CheckoutPage.CSR_verify_BonusFlat_amt_section_not_displayed_RedeemRewards_page();
    }

    @And("^does not see the Bonus Flat message in Rewards section$")
    public void does_not_see_the_bonus_flat_message_in_rewards_section() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        //CheckoutPage.verify_Bonus_percentage_description_is_not_displayed_in_rewardsPage();
        CheckoutPage.CSR_verify_BonusFlat_amt_section_not_displayed_RedeemRewards_page();
    }

    @When("^teacher clicks on Gradelevel dropdown$")
    public void teacher_clicks_on_gradelevel_dropdown() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.User_selects_Select_By_Grade();
    }

    @And("^teacher selects a grade$")
    public void teacher_selects_a_grade() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(5000);
        PauseUtil.pause(6000);
        WaitUtils.waitForEnabled(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards());
        SCHUtils.selectOptionsByVisibleText(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards(),
                TestBaseProvider.getTestBase().getTestData().getString("grade"));
        PauseUtil.pause(5000);
        System.out.println("teacher selects a grade" + Total_Owing_Amount_act_1.getTotal_StudenClub_Value());
        System.out.println("NEW-teacher selects a grade"+TestBaseProvider.getTestBase().getContext()
                .getProperty("Total_StudenClub_Value"));


    }

    @When("^teacher clicks on grade level dropdown$")
    public void teacher_clicks_on_grade_level_dropdown() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        PauseUtil.waitForAjaxToComplete(2500);
        WaitUtils.waitForEnabled(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards());
    }

    @Then("^teacher catalogue does not display in list of grades$")
    public void teacher_catalogue_does_not_display_in_list_of_grades() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_Teacher_catalogue_is_not_displayed_in_Modal_window_dropDown();
    }

    @When("^teacher selects an item from Make Selection window$")
    public void teacher_selects_an_item_from_make_selection_window() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.Selects_an_item_from_Make_Selection_window();
    }

    @And("^teacher selects an item from modal$")
    public void teacher_selects_an_item_from_modal() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.Selects_an_item_from_Free_Item_Modal_window();
    }

    @When("^teacher clicks on modal window close button$")
    public void teacher_clicks_on_modal_window_close_button() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.closes_the_Modal_window();
    }


    @When("^teacher clicks Cancel in freepick model window$")
    public void teacher_clicks_cancel_in_freepick_model_window() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.cancel_freepick_selection();
    }


    @Then("^item selections are saved$")
    public void item_selections_are_saved() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.verify_selected_items_are_saved_in_Modal_window();
    }


    @Then("^item selections are not saved$")
    public void item_selections_are_not_saved() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.verify_selected_items_are_notsaved_in_Modal_window();
    }


    @When("^teacher selects an item from Make Selection window2$")
    public void teacher_selects_an_item_from_make_selection_window2() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        double Excceded_Amt = CheckoutPage.Selects_an_item_from_Make_Selection_window_And_get_Exceeded_amt();
        //Total_Owing_Amount_act_1.setExceeded_Amt(Excceded_Amt);
        TestBaseProvider.getTestBase().getContext().setProperty("exceedAmt",String.valueOf(Excceded_Amt));
        System.out.println("teacher selects an item from Make Selection window2" + Total_Owing_Amount_act_1.getTotal_StudenClub_Value());
        System.out.println("NEWteacher selects an item from Make Selection window2" + TestBaseProvider.getTestBase().getContext()
                .getProperty("Total_StudenClub_Value").toString());


    }

    @And("^teacher selects the multiple items from same grade in Make Selection window2$")
    public void teacher_selects_the_multiple_items_from_same_grade_in_make_selection_window2() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        double Excceded_Amt = CheckoutPage.Selects_multiple_items_from_Make_Selection_window_And_get_Exceeded_amt();
        System.out.println("exceeded amt value to check in Mul >" + Excceded_Amt);
        //Total_Owing_Amount_act_1.setExceeded_Amt(Excceded_Amt);
        TestBaseProvider.getTestBase().getContext().setProperty("exceedAmt",Excceded_Amt);
        //System.out.println("teacher selects the multiple items from same grade in Make Selection window2" + Total_Owing_Amount_act_1.getTotal_StudenClub_Value());
        //System.out.println("teacher selects the multiple items from same grade in Make Selection window2" + Total_Owing_Amount_act_1.getExceeded_Amt());

    }

    @Then("^GST & PST are charged on the top off amount and post tax top off amount is added to Student club total$")
    public void gst_pst_are_charged_on_the_topoff_amount_and_post_tax_topoff_amount_is_added_to_student_club_total() throws Throwable {
        System.out.println(Total_Owing_Amount_act_1.getExceeded_Amt());
        System.out.println("TRY NEW GETTER SETTER"+TestBaseProvider.getTestBase().getContext().getProperty("exceedAmt"));
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
       /* CheckoutPage.validation_of_GST_PST_are_charged_on_topOff_and_post_tax_topOff_amount(Total_Owing_Amount_act_1.getTotal_StudenClub_Value(),
         Total_Owing_Amount_act_1.getExceeded_Amt());*/
        String val = TestBaseProvider.getTestBase().getContext().getProperty("Total_StudenClub_Value").toString();
        double val1 = Double.parseDouble(val);
        System.out.println("TTTTOALEXCEDEDVAL"+val1);
        System.out.println("TTTTTTTTTTT exceeded Amt"+TestBaseProvider.getTestBase().getContext().getProperty("exceedAmt").toString());
        CheckoutPage.validation_of_GST_PST_are_charged_on_topOff_and_post_tax_topOff_amount(val1,Double.parseDouble
                (TestBaseProvider.getTestBase().getContext().getProperty("exceedAmt").toString()));


    }

    @Then("^GST & QST are charged on the top off amount and post tax top off amount is added to Student club total$")
    public void gst_qst_are_charged_on_the_topoff_amount_and_post_tax_topoff_amount_is_added_to_student_club_total() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        System.out.println("GST & QST are charged on the top off amount and post tax top off amount is added to Student club total$" + Total_Owing_Amount_act_1.getTotal_StudenClub_Value());
        System.out.println("GST & QST are charged on the top off amount and post tax top off amount is added to Student club total$" + Total_Owing_Amount_act_1.getExceeded_Amt());
/*

        CheckoutPage.validation_of_GST_QST_are_charged_on_topOff_and_post_tax_topOff_amount(Total_Owing_Amount_act_1.getTotal_StudenClub_Value(),
                Total_Owing_Amount_act_1.getExceeded_Amt());
*/

        String val = TestBaseProvider.getTestBase().getContext().getProperty("Total_StudenClub_Value").toString();
        double val1 = Double.parseDouble(val);
        System.out.println("TTTTOALEXCEDEDVAL"+val1);
        System.out.println("TTTTTTTTTTT exceeded Amt"+TestBaseProvider.getTestBase().getContext().getProperty("exceedAmt").toString());
        CheckoutPage.validation_of_GST_QST_are_charged_on_topOff_and_post_tax_topOff_amount(val1,Double.parseDouble
                (TestBaseProvider.getTestBase().getContext().getProperty("exceedAmt").toString()));

    }

    @Then("^HST is charged on the top off amount and post tax top off amount is added to Student club total$")
    public void hst_is_charged_on_the_top_off_amount_and_post_tax_top_off_amount_is_added_to_student_club_total() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.validation_of_HST_is_charged_on_topOff_and_post_tax_topOff_amount(
                Total_Owing_Amount_act_1.getTotal_StudenClub_Value(), Total_Owing_Amount_act_1.getExceeded_Amt());

        /*String val = TestBaseProvider.getTestBase().getContext().getProperty("Total_StudenClub_Value").toString();
        double val1 = Double.parseDouble(val);
        System.out.println("TTTTOALEXCEDEDVAL"+val1);
        System.out.println("TTTTTTTTTTT exceeded Amt"+TestBaseProvider.getTestBase().getContext().getProperty("exceedAmt").toString());
        CheckoutPage.validation_of_HST_is_charged_on_topOff_and_post_tax_topOff_amount(val1,Double.parseDouble
                (TestBaseProvider.getTestBase().getContext().getProperty("exceedAmt").toString()));*/
    }

    @Then("^GST is charged on the top off amount and post tax top off amount is added to Student club total$")
    public void gst_is_charged_on_the_top_off_amount_and_post_tax_top_off_amount_is_added_to_student_club_total() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        /*
        CheckoutPage.validation_of_GST_is_charged_on_topOff_and_post_tax_topOff_amount
                (Total_Owing_Amount_act_1.getTotal_StudenClub_Value(), Total_Owing_Amount_act_1.getExceeded_Amt());

        */

        String val = TestBaseProvider.getTestBase().getContext().getProperty("Total_StudenClub_Value").toString();
        double val1 = Double.parseDouble(val);
        System.out.println("TTTTOALEXCEDEDVAL"+val1);
        System.out.println("TTTTTTTTTTT exceeded Amt"+TestBaseProvider.getTestBase().getContext().getProperty("exceedAmt").toString());
        CheckoutPage.validation_of_GST_is_charged_on_topOff_and_post_tax_topOff_amount(val1,Double.parseDouble
                (TestBaseProvider.getTestBase().getContext().getProperty("exceedAmt").toString()));
    }

    @Then("^Tax is charged on one of the item on top off amount and post tax top off amount is added to Student club total$")
    public void tax_is_charged_on_one_of_the_item_on_top_off_amount_and_post_tax_top_off_amount_is_added_to_student_club_total() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        /*CheckoutPage.validation_of_GST_is_charged_on_topOff_and_post_tax_topOff_amount
                (Total_Owing_Amount_act_1.getTotal_StudenClub_Value(), Total_Owing_Amount_act_1.getExceeded_Amt());*/
        String val = TestBaseProvider.getTestBase().getContext().getProperty("Total_StudenClub_Value").toString();
        double val1 = Double.parseDouble(val);
        System.out.println("TTTTOALEXCEDEDVAL"+val1);
        System.out.println("TTTTTTTTTTT exceeded Amt"+TestBaseProvider.getTestBase().getContext().getProperty("exceedAmt").toString());
        CheckoutPage.validation_of_GST_is_charged_on_topOff_and_post_tax_topOff_amount(val1,Double.parseDouble
                (TestBaseProvider.getTestBase().getContext().getProperty("exceedAmt").toString()));



    }

    @Then("^No tax is charged on the top off amount and post tax top off amount is added to Student club total$")
    public void no_tax_is_charged_on_the_top_off_amount_and_post_tax_top_off_amount_is_added_to_student_club_total() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        /*CheckoutPage.validation_of_No_Taxes_is_charged_on_topOff_and_post_tax_topOff_amount
                (Total_Owing_Amount_act_1.getTotal_StudenClub_Value(), Total_Owing_Amount_act_1.getExceeded_Amt());*/

        String val = TestBaseProvider.getTestBase().getContext().getProperty("Total_StudenClub_Value").toString();
        double val1 = Double.parseDouble(val);
        System.out.println("TTTTOALEXCEDEDVAL"+val1);
        System.out.println("TTTTTTTTTTT exceeded Amt"+TestBaseProvider.getTestBase().getContext().getProperty("exceedAmt").toString());
        CheckoutPage.validation_of_No_Taxes_is_charged_on_topOff_and_post_tax_topOff_amount
                (val1,Double.parseDouble
                        (TestBaseProvider.getTestBase().getContext().getProperty("exceedAmt").toString()));
    }

    @And("^teacher selects the multiple items from same grade in Make Selection window$")
    public void teacher_selects_the_multiple_items_from_same_grade_in_make_selection_window() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.Selects_multiple_items_from_Make_Selection_window();
    }


    @When("^teacher selects an item such that the top\\-off amount makes cart qualifying for next tier$")
    public void teacher_selects_an_item_such_that_the_topoff_amount_makes_cart_qualifying_for_next_tier() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.Selects_multiple_items_from_Make_Selection_window();
    }


    @Then("^selected item displays in the Current Selection section$")
    public void selected_item_displays_in_the_current_selection_section() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.validation_of_selected_item_Section_MakeYourSelection();
    }

    @Then("^items from all flyers mapped to the grade from current calendar month displays$")
    public void items_from_all_flyers_mapped_to_the_grade_from_current_calendar_month_displays() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.verify_display_of_all_items_from_diff_Flyers_Selected_By_Grade();
    }

	/*
	 * @Then(
	 * "^user selects items from make your selection pop up on rewards and coupon page$"
	 * )
	 * public void user_selects_item_from_make_you_selection_pop_up() {
	 * ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	 * String coupons[] = SCHUtils.getArrayFromStringData(
	 * TestBaseProvider.getTestBase().getTestData().getString("coupontype"));
	 * for (int i = 0; i < coupons.length; i++) {
	 * checkoutPage.addscoupon(TestBaseProvider.getTestBase().getTestData(), i);
	 * }
	 * }
	 */

    @Then("^confirm selection button is disabled in DTS model$")
    public void confirm_selection_button_is_disabled_in_dts_model() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();

        SCHUtils.waitForLoaderToDismiss();
        checkoutPage.verifyApplyCouponButton_NotPresent();
    }

    @And("^teacher selects an item that is greater than the \\[coupon amount\\]$")
    public void teacher_selects_an_item_that_is_greater_than_the_coupon_amount()
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("coupontype"));
        for (int i = 0; i < coupons.length; i++) {
            checkoutPage.MakeSelectionWindow_SelectSpecificItem_Apply(TestBaseProvider.getTestBase().getTestData(),
                    TestBaseProvider.getTestBase().getTestData().getDouble("couponprice"),
                    TestBaseProvider.getTestBase().getTestData()
                            .getDouble("couponprice_limit"));
        }
    }

    @And("^teacher sees pagination links$")
    public void teacher_sees_pagination_links() throws Throwable {
        ICheckoutPage checkOutPage = getFactory().getICheckoutPage();
        checkOutPage.verifyCouponsPagination();
    }

    @When("^teacher clicks on the pagination links$")
    public void teacher_clicks_on_the_pagination_links() throws Throwable {
        ICheckoutPage checkOutPage = getFactory().getICheckoutPage();
        checkOutPage.verifyCouponsPagination();
    }

    @Then("^teacher sees 10 items per page$")
    public void teacher_sees_10_items_per_page() throws Throwable {
        ICheckoutPage checkOutPage = getFactory().getICheckoutPage();
        checkOutPage.verifyCouponsPagination();
    }

    @When("^teacher selects an item such that there is a top\\-off$")
    public void teacher_selects_an_item_such_that_there_is_a_topoff() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("coupontype"));
        for (int i = 0; i < coupons.length; i++) {
            checkoutPage.MakeSelectionWindow_SelectSpecificItem(
                    TestBaseProvider.getTestBase().getTestData(),
                    TestBaseProvider.getTestBase().getTestData().getDouble("couponprice"),
                    TestBaseProvider.getTestBase().getTestData()
                            .getDouble("couponprice_limit"));
        }
    }


    @When("^teacher selects an item such that the top\\-off amount makes cart meet the \\[shipping threshold\\]$")
    public void teacher_selects_an_item_such_that_the_topoff_amount_makes_cart_meet_the_shipping_threshold() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("coupontype"));
        for (int i = 0; i < coupons.length; i++) {
            checkoutPage.MakeSelectionWindow_SelectSpecificItem(
                    TestBaseProvider.getTestBase().getTestData(),
                    TestBaseProvider.getTestBase().getTestData().getDouble("couponprice"),
                    TestBaseProvider.getTestBase().getTestData()
                            .getDouble("couponprice_limit"));
        }
    }


    @And("^teacher selects an item such that the top\\-off amount makes cart meet the \\[Bonus percentage coupon\\]$")
    public void teacher_selects_an_item_such_that_the_topoff_amount_makes_cart_meet_the_bonus_percentage_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("coupontype"));
        for (int i = 0; i < coupons.length; i++) {
            checkoutPage.MakeSelectionWindow_SelectMultipleItems_ToMeet_Promotions(
                    TestBaseProvider.getTestBase().getTestData(),
                    TestBaseProvider.getTestBase().getTestData().getDouble("couponprice"),
                    TestBaseProvider.getTestBase().getTestData()
                            .getDouble("couponprice_limit"));
        }
    }


    @When("^teacher select an item such that there is a top\\-off$")
    public void teacher_select_an_item_such_that_there_is_a_topoff() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("coupontype"));
        for (int i = 0; i < coupons.length; i++) {
            checkoutPage.SelectItem_TopOff_DTS(
                    TestBaseProvider.getTestBase().getTestData(),
                    TestBaseProvider.getTestBase().getTestData().getDouble("topoff_dts"));
        }
    }

    @When("^teacher clicks on make selection and selects an item such that there is a top\\-off$")
    public void teacher_clicks_on_make_selection_and_selects_an_item_such_that_there_is_a_topoff() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        CheckoutPage chckout = new CheckoutPage();
        checkoutPage.clickOnMakeSelectionButton();

        /*String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("coupontype"));

        for (int i = 0; i < coupons.length; i++) {
            checkoutPage.MakeSelectionWindow_SelectGrade(
                    TestBaseProvider.getTestBase().getTestData());
        }

        for (int i = 0; i < coupons.length; i++) {
            checkoutPage.SelectItem_TopOff_DTS(
                    TestBaseProvider.getTestBase().getTestData(),
                    TestBaseProvider.getTestBase().getTestData().getDouble("topoff_dts"));
        }*/

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(5000);
        PauseUtil.pause(6000);
        WaitUtils.waitForEnabled(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards());
        SCHUtils.selectOptionsByVisibleText(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards(),
                TestBaseProvider.getTestBase().getTestData().getString("grade"));
        PauseUtil.pause(5000);

        List<WebElement> price = chckout.items_price_Make_Selection_Window();

        int value = price.size();

        double value2 = TestBaseProvider.getTestBase().getTestData().getDouble("itemValue");

        for (int i = 0; i <= value; i++) {
            String text = price.get(i).getText();
            text = text.trim();

            String path = "//tr[td[text()='" + text + "']]/td[5]/i";

            text = text.substring(1);
            double text2 = Double.parseDouble(text);

            if (text2 > value2) {
                WebDriver driver = TestBaseProvider.getTestBase().getDriver();
                driver.findElement(By.xpath(path)).click();
                PauseUtil.pause(5000);
                break;
            } else {
                System.out.println("value is lesser than expected");
            }
        }


    }

    @And("^teacher makes the qty as 3$")
    public void teacher_makes_the_qty_as_3() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.MakeSelectionWindow_dts_enterquantity(TestBaseProvider.getTestBase().getTestData());

    }


    @And("^teacher selects a different item from Free Pick model window$")
    public void teacher_selects_a_different_item_from_free_pick_model_window()
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        PauseUtil.waitForAjaxToComplete(1500);

        //checkoutPage.MakeSelectionWindow_DeleteSelectedItem();
        checkoutPage.MakeSelectionWindow_SelectItemFreePick();

    }

    @When("^teacher selects an item less than or equal to the coupon amount$")
    public void teacher_selects_an_item_less_than_or_equal_to_the_coupon_amount()
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("coupontype"));
        for (int i = 0; i < coupons.length; i++) {
            checkoutPage.MakeSelectionWindow_SelectSpecificItem(
                    TestBaseProvider.getTestBase().getTestData(),
                    TestBaseProvider.getTestBase().getTestData().getDouble("couponprice"),
                    TestBaseProvider.getTestBase().getTestData()
                            .getDouble("couponprice_limit"));
        }
    }

    @When("^teacher selects an item from the results$")
    public void teacher_selects_an_item_from_the_results() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        PauseUtil.waitForAjaxToComplete(1500);
        checkoutPage.MakeSelectionWindow_SelectItemFreePick();
    }

    @And("^teacher selects multiple items from same grade in Make Selection window$")
    public void teacher_selects_multiple_items_from_same_grade_in_make_selection_window()
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("coupontype"));
        for (int i = 0; i < coupons.length; i++) {
            checkoutPage.MakeSelectionWindow_SelectMultipleItems(
                    TestBaseProvider.getTestBase().getTestData(),
                    TestBaseProvider.getTestBase().getTestData().getDouble("couponprice"),
                    TestBaseProvider.getTestBase().getTestData()
                            .getDouble("couponprice_limit"));
        }
    }

    @And("^teacher clicks on grade level dropdown and select a grade from dropdown$")
    public void teacher_clicks_on_grade_level_dropdown_and_select_a_grade_from_dropdown()
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("selectgrade"));
        for (int i = 0; i < coupons.length; i++) {
            checkoutPage.MakeSelectionWindow_SelectGrade(
                    TestBaseProvider.getTestBase().getTestData() );


        }
    }

    @And("^teacher sees the \\[coupon amount\\] of first tier on the DTS modal$")
    public void teacher_sees_the_coupon_amount_of_first_tier_on_the_dts_modal()
            throws Throwable {

        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        rewardsAndCoupons.verifyDollarToSpendSection_FirstTierOnDTSModel(
                TestBaseProvider.getTestBase().getTestData());
    }

    @And("^teacher sees the \\[coupon amount\\] of second tier on the DTS modal$")
    public void teacher_sees_the_coupon_amount_of_second_tier_on_the_dts_modal()
            throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        rewardsAndCoupons.verifyDollarToSpendSection_SecondTierOnDTSModel(
                TestBaseProvider.getTestBase().getTestData());
    }

    @When("^teacher clicks on grade level dropdown in DTS model$")
    public void teacher_clicks_on_grade_level_dropdown_in_dts_model() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.MakeSelectionWindow_SelectDropDownGradeLevel();
    }

    @Then("^teacher should see all student flyers in the dropdown$")
    public void teacher_should_see_all_student_flyers_in_the_dropdown() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.MakeSelectionWindow_verifyStudentFlyersInDropDownGradeLevel();
    }

    @Then("^teacher does not find teacher club in the dropdown$")
    public void teacher_does_not_find_teacher_club_in_the_dropdown() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.MakeSelectionWindow_verifyTeacherCatalogueInDropDownGradeLevel();
    }

    @And("^teacher selects a different grade from dropdown$")
    public void teacher_selects_a_different_grade_from_dropdown() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("coupontype"));
        for (int i = 0; i < coupons.length; i++) {
            checkoutPage.MakeSelectionWindow_SelectDifferentGrade(
                    TestBaseProvider.getTestBase().getTestData());

        }
    }

    @When("^teacher selects an item from the Make Selection window$")
    public void teacher_selects_an_item_from_the_make_selection_window()
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("coupontype"));
        for (int i = 0; i < coupons.length; i++) {
            checkoutPage.MakeSelectionWindow_SelectItem();
        }
    }

    @When("^teacher deletes the item from Current Selection section$")
    public void teacher_deletes_the_item_from_current_selection_section()
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("coupontype"));
        for (int i = 0; i < coupons.length; i++) {
            checkoutPage.MakeSelectionWindow_SelectSpecificItem(
                    TestBaseProvider.getTestBase().getTestData(),
                    TestBaseProvider.getTestBase().getTestData().getDouble("couponprice"),
                    TestBaseProvider.getTestBase().getTestData()
                            .getDouble("couponprice_limit"));
        }
    }

    @When("^teacher searches for \\[expired item\\] in Make Selection window$")
    public void teacher_searches_for_expired_item_in_make_selection_window()
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();

        checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
                TestBaseProvider.getTestBase().getTestData());

    }

    @And("^teacher searches for a \\[search term\\]$")
    public void teacher_searches_for_a_search_term() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();

        checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
                TestBaseProvider.getTestBase().getTestData());
    }

    @When("^teacher searches for a \\[keyword\\]$")
    public void teacher_searches_for_a_keyword() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
                TestBaseProvider.getTestBase().getTestData());
    }

    @When("^teacher searches for a \\[qualifying Item number\\]$")
    public void teacher_searches_for_a_qualifying_item_number() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
         checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
                TestBaseProvider.getTestBase().getTestData());
    }

    @When("^teacher searches for a \\[qualifying Item name\\]$")
    public void teacherSearchesForAQualifyingItemName() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
                TestBaseProvider.getTestBase().getTestData());
    }

    @When("^teacher searches for a \\[search term\\] with no results$")
    public void teacher_searches_for_a_search_term_with_no_results() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
                TestBaseProvider.getTestBase().getTestData());
    }


    @Then("^items less than or equal to the \\[coupon amount\\] displays in Manual Free Pick model$")
    public void items_less_than_or_equal_to_the_coupon_amount_displays_in_manual_free_pick_model()
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verifyManualFreePickItemsPriceWithInCouponAmount(
                TestBaseProvider.getTestBase().getTestData()
                        .getDouble("ManualFreePickTier1CouponAmt"),
                TestBaseProvider.getTestBase().getTestData()
                        .getDouble("ManualFreePickTier2CouponAmt"));
    }

    @Then("^item displays in results in Free Pick model$")
    public void item_displays_in_results_in_free_pick_model() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_Searched_FreePick_Item_displayed_in_results_list();

    }


    @Then("^item displays in results in DTS model$")
    public void item_displays_in_results_in_DTS_model() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verifyResultforParticularSearch_DTSModal(
                TestBaseProvider.getTestBase().getTestData().getString("couponsearch"));

    }

    @Then("^selected item displays in Current Selection section$")
    public void selected_item_displays_in_current_selection_section() throws Throwable {

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.getYourCurrentSelectionSection();
        checkoutPage.verifyYourCurrentSelectionSection();

    }

    @Then("^selected item displays in Current Selection section for DTS$")
    public void selected_item_displays_in_current_selection_section_for_DTS() throws Throwable {

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.getYourCurrentSelectionSection();
        checkoutPage.verifyYourCurrentSelectionSection_DTS();

    }


    @Then("^selected item displays in Current Selection section for Freepick$")
    public void selected_item_displays_in_current_selection_section_for_Freepick() throws Throwable {

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        //checkoutPage.verifyYourCurrentSelectionSection_FreePickCoupon();
        checkoutPage.verify_selected_FreePick_item_info_Rewards_Page();

    }


    @Then("^teacher sees a validation message for expired item search$")
    public void teacher_sees_a_validation_message_for_expired_item_search()
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.MakeSelectionWindow_ExpiredItems_ValidationMessage();
    }

    @Then("^teacher sees no results message$")
    public void teacher_sees_no_results_message() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.MakeSelectionWindow_NoResultItem_ValidationMessage();
    }

    @Then("^top\\-off message displays on Dollars to Spend modal$")
    public void topoff_message_displays_on_dollars_to_spend_modal() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.MakeSelectionWindow_TopOffAmtPresent_Message();
    }

    @Then("^top\\-off message does not display on Dollars to Spend modal$")
    public void topoff_message_does_not_display_on_dollars_to_spend_modal()
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.MakeSelectionWindow_TopOffAmtPresent_Message();
    }

    @When("^teacher searches for a term with no results$")
    public void teacher_searches_for_a_term_with_no_results() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();

        checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
                TestBaseProvider.getTestBase().getTestData());
    }

    @When("^teacher searches for teacher club items$")
    public void teacher_searches_for_teacher_club_items() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
                TestBaseProvider.getTestBase().getTestData());
    }

    @And("^user should see promotion display with edit option on dollar to spend section$")
    public void user_should_see_promotion_display_with_edit_option_on_dollar_tospend_section() {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verifyDollarToSpendSectionOnRewardsAndCoupons();
    }

    @Then("^teacher still sees the item selections from Dollars to Spend$")
    public void teacher_still_sees_the_item_selections_from_dollars_to_spend()
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verifyDollarToSpendSectionOnRewardsAndCoupons();
    }

    @When("^user selects \"([^\"]*)\" icon on bonus point section on rewards and coupons page$")
    public void select_plus_minus_icon_on_bonus_point_section_rewards_and_coupons_page(
            String iconName) {
        ICheckoutPage icCheckoutPage = getFactory().getICheckoutPage();
        icCheckoutPage.selectPlusMinusIconOnBonusPointSection(iconName);
    }

    @Then("^user should see bonus point section collapse from screen$")
    public void verify_bonus_point_section_collapse_on_screen() {
        ICheckoutPage icCheckoutPage = getFactory().getICheckoutPage();
        icCheckoutPage.verifyBonusPointSectionCollapseOnScreen();
    }

    @Then("^user verifies proceed to checkout is disable on teacher checkout page$")
    public void verifies_proceed_to_checkout_button_is_disabled_on_teacher_checkout_page() {
        PauseUtil.waitForAjaxToComplete();
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        AssertUtils.assertAttributeMatches(
                shippingAndPaymentPage.getBtnContinueCheckout(), "style",
                Matchers.containsString("none"));
    }

    @Then("^user verifies credit card form validation with different inputs$")
    public void verifyCreditCardFormValidation() {
        ICreditCardAndBillingInfoSection fillfornewcreditcard =

                SectionFactory.getFactory().getICreditCardAndBillingInfoSection(
                        "dw.checkout.shippingandpayment.payment.creditcard.addnewcard.form");
        fillfornewcreditcard.verifyCreditCardFormFieldValidation();
    }

    @When("^User is able to verify error message$")
    public void user_is_able_to_verify_error_message() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();

        checkoutPage.finalizeErrorCouponMessage();
    }

    @Given("^user selects close option from coupon page$")
    public void user_selects_close_option_from_coupon_page() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clickOnCloseIcon();
    }

    @When("^user selects item from books and resources page and purchase from pdp page$")
    public void purchaseItemFromBooksnResources() {
        IBooksAndResourcesPage bookandresources =
                getFactory().getIBooksAndResourcesPage();
        bookandresources.selectItemFromList(TestBaseProvider.getTestBase().getTestData());
        ProductDetailPage productDetailPage = new ProductDetailPage();
        productDetailPage.waitForPageLoad();
        if (TestBaseProvider.getTestBase().getTestData()
                .getString("removeCartFlag") != null
                && TestBaseProvider.getTestBase().getTestData()
                .getString("removeCartFlag").equalsIgnoreCase("true")) {
            productDetailPage.updateQuantityAsPerOrderPrice();
            productDetailPage.addYTOProductDetails();
        }
        WaitUtils.waitForDisplayed(productDetailPage.getBtnAddToCart());
        SCHUtils.clickUsingJavaScript(productDetailPage.getBtnAddToCart());
        // productDetailPage.getBtnAddToCart().click();
        PauseUtil.pause(2000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        WaitUtils.waitForEnabled(productDetailPage.getBtnModelGoToCheckout());
        WaitUtils.waitForDisplayed(productDetailPage.getBtnModelGoToCheckout());
        productDetailPage.getBtnModelGoToCheckout().click();
        PauseUtil.pause(2000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
    }


    @Then("^teacher views Dollars to Spend promotion$")
    public void teacher_views_dollars_to_spend_promotion() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();


		/*for (int i = 0; i <= 2; i++) {
			if (rewardsAndCoupons.chkBtnSkip().size() != 0) {
				// while (SCHUtils.isPresent(rewardsAndCoupons.getBtnSkip())) {
				System.out.println(" rewardsAndCoupons.getBtnSkip() ==========> "
						+ SCHUtils.isPresent(rewardsAndCoupons.getBtnSkip()));
				SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnSkip());
				SCHUtils.waitForLoaderToDismiss();
				PauseUtil.waitForAjaxToComplete();
			}
		}*/
        rewardsAndCoupons.verifyDollarToSpendSectionOnRewardsAndCoupons();
        // rewardsAndCoupons.verifyFreePickFlatPromotion();

    }


    @And("^teacher receives the Dollars to Spend promotion from first tier$")
    public void teacher_receives_the_dollars_to_spend_promotion_from_first_tier()
            throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        rewardsAndCoupons.verifyDollarToSpendSection_FirstTierOnRewardsAndCoupons(
                TestBaseProvider.getTestBase().getTestData());
    }

    @And("^teacher receives the Dollars to Spend promotion from second tier$")
    public void teacher_receives_the_dollars_to_spend_promotion_from_second_tier()
            throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

		/*for (int i = 0; i <= 2; i++) {
			if (rewardsAndCoupons.chkBtnSkip().size() != 0) {
				// while (SCHUtils.isPresent(rewardsAndCoupons.getBtnSkip())) {
				System.out.println(" rewardsAndCoupons.getBtnSkip() ==========> "
						+ SCHUtils.isPresent(rewardsAndCoupons.getBtnSkip()));
				SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnSkip());
				SCHUtils.waitForLoaderToDismiss();
				PauseUtil.waitForAjaxToComplete();
			}
		}*/
        rewardsAndCoupons.verifyDollarToSpendSection_SecondTierOnRewardsAndCoupons(
                TestBaseProvider.getTestBase().getTestData());
    }

    @And("^teacher is on coupons & Rewards page$")
    public void teacher_is_on_coupons_rewards_page() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        SCHUtils.waitForLoaderToDismiss();

        //rewardsAndCoupons.verifyDollarToSpendLineOnRewardsAndCoupons();

    }

    @Then("^recent selections are saved for Dollars to Spend$")
    public void recent_selections_are_saved_for_dollars_to_spend() throws Throwable {

        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        SCHUtils.waitForLoaderToDismiss();

        rewardsAndCoupons.verifyDollarToSpendCloseIcon_RecentSaved();
    }

    @Then("^recent selections are not saved for Dollars to Spend$")
    public void recent_selections_are_not_saved_for_dollars_to_spend() throws Throwable {

        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        SCHUtils.waitForLoaderToDismiss();

        rewardsAndCoupons.verifyDollarToSpendCancelOption_RecentNotSaved();
    }

    @Then("^the cart total includes the top\\-off amount$")
    public void the_cart_total_includes_the_topoff_amount() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();

        checkoutPage.verifyOrderTotalIncludesTopOff_CouponsAndRewardspage();
    }

    @And("^teacher see the cart total includes the top\\-off amount in Confirm & submit page$")
    public void teacher_see_the_cart_total_includes_the_topoff_amount_in_confirm_submit_page()
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();

        checkoutPage.verifyOrderTotalIncludesTopOff_ConfirmAndSubmitPage();

    }

    @And("^teacher see the cart total includes the top\\-off amount in confirmation page$")
    public void teacher_see_the_cart_total_includes_the_topoff_amount_in_confirmation_page()
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();

        checkoutPage.verifyOrderTotalIncludesTopOff_ConfirmationPage();
    }

    @Then("^Free pick is displayed in coupons section with correct details in Confirm & Submit page$")
    public void free_pick_is_displayed_in_coupons_section_with_correct_details_in_confirm_submit_page()
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();

        /*checkoutPage.verifyManualFreePickDetails_ConfirmSubmitPage(
                TestBaseProvider.getTestBase().getTestData().getString("couponnumber"));*/
        checkoutPage.verify_ManualFreePick_coupon_Details_ConfirmSubmitPage();
    }

    @And("^Free pick is displayed in coupons section with correct details in Confirmation page$")
    public void free_pick_is_displayed_in_coupons_section_with_correct_details_in_confirmation_page()
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();

        /*checkoutPage.verifyManualFreePickDetails_ConfirmSubmitPage(
                TestBaseProvider.getTestBase().getTestData().getString("couponnumber"));*/
        checkoutPage.verify_ManualFreePick_coupon_Details_ConfirmSubmitPage();
    }


    @When("^teacher enters \\[Student dollar amount\\] of Bonus coupon to redeem from Student Bonus bank$")
    public void teacher_enters_student_dollar_amount_of_bonus_coupon_to_redeem_from_student_bonus_bank()
            throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        while (SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon())) {
            System.out.println(" rewardsAndCoupons.getBtnEditCoupon() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnEditCoupon());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnApplyCoupon());
            PauseUtil.pause(1000);

        }

        checkOut.getRewardsAndCouponsSection().enterBonusBank(
                TestBaseProvider.getTestBase().getTestData(), "bonusbank");
        PauseUtil.pause(1500);
        while (SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper())) {
            System.out.println(" rewardsAndCoupons.getbtnApplyBonusPaper() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getbtnApplyBonusPaper());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnEditCoupon());
            PauseUtil.pause(1000);
            // SCHUtils.waitForLoaderToDismiss();
            // PauseUtil.waitForAjaxToComplete();
        }
    }

    @When("^teacher enters amount in \\[student bonus dollar\\] resulting in cart total fall below \\[shipping threshold\\]$")
    public void teacher_enters_amount_in_student_bonus_dollar_resulting_in_cart_total_fall_below_shipping_threshold()
            throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        while (SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon())) {
            System.out.println(" rewardsAndCoupons.getBtnEditCoupon() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnEditCoupon());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnApplyCoupon());


        }

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Bonus_Bank();
        PauseUtil.pause(1500);
        while (SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper())) {
            System.out.println(" rewardsAndCoupons.getBtnApplyCoupon() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getbtnApplyBonusPaper());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnEditCoupon());
            PauseUtil.pause(1000);
            //SCHUtils.waitForLoaderToDismiss();
            //PauseUtil.waitForAjaxToComplete();
        }

    }


    @When("^teacher enters \\[dollar amount\\] of paper Bonus coupon to redeem from Bonus bank$")
    public void teacher_enters_dollar_amount_of_paper_bonus_coupon_to_redeem_from_bonus_bank() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        while (SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon())) {
            System.out.println(" rewardsAndCoupons.getBtnEditCoupon() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnEditCoupon());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getbtnApplyBonusPaper());

        }
        checkOut.getRewardsAndCouponsSection().enterPaperCoupon(
                TestBaseProvider.getTestBase().getTestData(), "paperbonuscoupon");

        PauseUtil.pause(1500);
        while (SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper())) {
            System.out.println(" rewardsAndCoupons.getbtnApplyBonusPaper() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getbtnApplyBonusPaper());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnEditCoupon());
            PauseUtil.pause(1000);
            //SCHUtils.waitForLoaderToDismiss();
            //PauseUtil.waitForAjaxToComplete();
        }
    }


    @Then("^teacher should see dollars to spend promotion on rewards and coupon page$")
    public void teacher_should_see_dollars_to_spend_promotion_on_rewards_and_coupon_page() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        rewardsAndCoupons.verifyDollarToSpendSectionOnRewardsAndCoupons();
        rewardsAndCoupons.verifyFreePickFlatPromotion();


    }


    @And("^teacher enters amount in \\[Student Bonus dollar\\] making cart total fall below \\[Manual shipping threshold\\]$")
    public void teacher_enters_amount_in_student_bonus_dollar_making_cart_total_fall_below_manual_shipping_threshold()
            throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        while (SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon())) {
            System.out.println(" rewardsAndCoupons.getBtnEditCoupon() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnEditCoupon());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnApplyCoupon());

        }
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Bonus_Bank();
        PauseUtil.pause(1500);
        while (SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper())) {
            System.out.println(" rewardsAndCoupons.getbtnApplyBonusPaper() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getbtnApplyBonusPaper());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnEditCoupon());
            PauseUtil.pause(1000);
            // SCHUtils.waitForLoaderToDismiss();
            // PauseUtil.waitForAjaxToComplete();
        }
    }

    @When("^teacher enters amount in \\[student paper dollar\\] resulting in cart total fall below \\[shipping threshold\\]$")
    public void teacher_enters_amount_in_student_paper_dollar_resulting_in_cart_total_fall_below_shipping_threshold()
            throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        while (SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon())) {
            System.out.println(" rewardsAndCoupons.getBtnEditCoupon() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnEditCoupon());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getbtnApplyBonusPaper());

        }

        checkOut.getRewardsAndCouponsSection().enterPaperCouponForStudent(
                TestBaseProvider.getTestBase().getTestData(), "paperbonuscoupon");
        PauseUtil.pause(1500);
        while (SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper())) {
            System.out.println(" rewardsAndCoupons.getbtnApplyBonusPaper() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getbtnApplyBonusPaper());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnEditCoupon());
            PauseUtil.pause(1000);
            // SCHUtils.waitForLoaderToDismiss();
            // PauseUtil.waitForAjaxToComplete();
        }
    }

    @And("^teacher enters amount in \\[Student paper dollar\\] making cart total fall below \\[Manual shipping threshold\\]$")
    public void teacher_enters_amount_in_student_paper_dollar_making_cart_total_fall_below_manual_shipping_threshold()
            throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        while (SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon())) {
            System.out.println(" rewardsAndCoupons.getBtnEditCoupon() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnEditCoupon());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getbtnApplyBonusPaper());

        }

        checkOut.getRewardsAndCouponsSection().enterPaperCouponForStudent(
                TestBaseProvider.getTestBase().getTestData(), "paperbonuscoupon");
        PauseUtil.pause(1500);
        while (SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper())) {
            System.out.println(" rewardsAndCoupons.getbtnApplyBonusPaper() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getbtnApplyBonusPaper());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnEditCoupon());
            PauseUtil.pause(1000);
            // SCHUtils.waitForLoaderToDismiss();
            // PauseUtil.waitForAjaxToComplete();
        }
    }

    @And("^teacher enters amount in \\[Student Bonus dollar\\] and \\[student paper dollar\\] making cart total fall below \\[Manual shipping threshold\\]$")
    public void teacher_enters_amount_in_student_bonus_dollar_and_student_paper_dollar_making_cart_total_fall_below_manual_shipping_threshold()
            throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        while (SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon())) {
            System.out.println(" rewardsAndCoupons.getBtnEditCoupon() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnEditCoupon());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnApplyCoupon());

        }

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Bonus_Bank();
        checkOut.getRewardsAndCouponsSection().enterPaperCouponForStudent(
                TestBaseProvider.getTestBase().getTestData(), "paperbonuscoupon");
        PauseUtil.pause(1500);
        while (SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper())) {
            System.out.println(" rewardsAndCoupons.getbtnApplyBonusPaper() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getbtnApplyBonusPaper());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnEditCoupon());
            PauseUtil.pause(1000);
            // SCHUtils.waitForLoaderToDismiss();
            // PauseUtil.waitForAjaxToComplete();
        }
    }

    @And("^teacher enters amount in \\[Teacher Bonus dollar\\] and \\[Teacher paper dollar\\] making cart total fall below \\[Manual shipping threshold\\]$")
    public void teacher_enters_amount_in_teacher_bonus_dollar_and_teacher_paper_dollar_making_cart_total_fall_below_manual_shipping_threshold()
            throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        while (SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon())) {
            System.out.println(" rewardsAndCoupons.getBtnEditCoupon() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnEditCoupon());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnApplyCoupon());

        }


        checkOut.getRewardsAndCouponsSection().enterBonusBank(
                TestBaseProvider.getTestBase().getTestData(), "bonusbank");
        PauseUtil.pause(1500);
        checkOut.getRewardsAndCouponsSection().enterPaperCoupon(
                TestBaseProvider.getTestBase().getTestData(), "paperbonuscoupon");
        PauseUtil.pause(1500);
        while (SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper())) {
            System.out.println(" rewardsAndCoupons.getbtnApplyBonusPaper() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getbtnApplyBonusPaper());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnEditCoupon());
            PauseUtil.pause(1000);
            // SCHUtils.waitForLoaderToDismiss();
            // PauseUtil.waitForAjaxToComplete();
        }
    }

    @When("^teacher enters amount in \\[teacher Bonus dollar\\] resulting in cart total fall below \\[shipping threshold\\]$")
    public void teacher_enters_amount_in_teacher_bonus_dollar_resulting_in_cart_total_fall_below_shipping_threshold()
            throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        while (SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon())) {
            System.out.println(" rewardsAndCoupons.getBtnEditCoupon() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnEditCoupon());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnApplyCoupon());

        }

        checkOut.getRewardsAndCouponsSection().enterBonusBank(
                TestBaseProvider.getTestBase().getTestData(), "bonusbank");
        PauseUtil.pause(1500);
        while (SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper())) {
            System.out.println(" rewardsAndCoupons.getbtnApplyBonusPaper() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getbtnApplyBonusPaper());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnEditCoupon());
            PauseUtil.pause(1000);
            // SCHUtils.waitForLoaderToDismiss();
            // PauseUtil.waitForAjaxToComplete();
        }
    }

    @And("^teacher enters amount in \\[Teacher Bonus dollar\\] making cart total fall below \\[Manual shipping threshold\\]$")
    public void teacher_enters_amount_in_teacher_bonus_dollar_making_cart_total_fall_below_manual_shipping_threshold()
            throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        while (SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon())) {
            System.out.println(" rewardsAndCoupons.getBtnEditCoupon() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnEditCoupon());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnApplyCoupon());

        }

        checkOut.getRewardsAndCouponsSection().enterBonusBank(
                TestBaseProvider.getTestBase().getTestData(), "bonusbank");
        PauseUtil.pause(1500);
        while (SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper())) {
            System.out.println(" rewardsAndCoupons.getbtnApplyBonusPaper() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getbtnApplyBonusPaper());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnEditCoupon());
            PauseUtil.pause(1000);
            // SCHUtils.waitForLoaderToDismiss();
            // PauseUtil.waitForAjaxToComplete();
        }
    }

    @When("^teacher enters amount in \\[teacher paper dollar\\] resulting in cart total fall below \\[shipping threshold\\]$")
    public void teacher_enters_amount_in_teacher_paper_dollar_resulting_in_cart_total_fall_below_shipping_threshold()
            throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        while (SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon())) {
            System.out.println(" rewardsAndCoupons.getBtnEditCoupon() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnEditCoupon());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getbtnApplyBonusPaper());

        }

        checkOut.getRewardsAndCouponsSection().enterPaperCoupon(
                TestBaseProvider.getTestBase().getTestData(), "paperbonuscoupon");
        PauseUtil.pause(1500);
        while (SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper())) {
            System.out.println(" rewardsAndCoupons.getbtnApplyBonusPaper() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getbtnApplyBonusPaper());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnEditCoupon());
            PauseUtil.pause(1000);
            // SCHUtils.waitForLoaderToDismiss();
            // PauseUtil.waitForAjaxToComplete();
        }
    }

    @And("^teacher enters amount in \\[Teacher paper dollar\\] making cart total fall below \\[Manual shipping threshold\\]$")
    public void teacher_enters_amount_in_teacher_paper_dollar_making_cart_total_fall_below_manual_shipping_threshold()
            throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        while (SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon())) {
            System.out.println(" rewardsAndCoupons.getBtnEditCoupon() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnEditCoupon());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getbtnApplyBonusPaper());

        }

        checkOut.getRewardsAndCouponsSection().enterPaperCoupon(
                TestBaseProvider.getTestBase().getTestData(), "paperbonuscoupon");
        PauseUtil.pause(1500);
        while (SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper())) {
            System.out.println(" rewardsAndCoupons.getbtnApplyBonusPaper() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getbtnApplyBonusPaper());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnEditCoupon());
            PauseUtil.pause(1000);
            // SCHUtils.waitForLoaderToDismiss();
            // PauseUtil.waitForAjaxToComplete();
        }
    }

    @When("^teacher applies \\[Free Shipping Coupon\\]$")
    public void teacher_applies_free_shipping_coupon() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("couponnumber"));
        for (String coupon : coupons) {
            rewardsAndCoupons.enterCoupon(coupon);

        }
    }


    @When("^teacher tries to apply same \\[Free Shipping Coupon\\]$")
    public void teacher_tries_to_apply_same_free_shipping_coupon() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        String coupons[] = SCHUtils.getArrayFromStringData(TestBaseProvider.getTestBase()
                .getTestData().getString("samecouponnumber"));
        for (String coupon : coupons) {
            rewardsAndCoupons.enterCoupon2(coupon);

        }
    }


    @Then("^teacher does not receive Dollars to Spend promotion$")
    public void teacher_does_not_receive_dollars_to_spend_promotion() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        for (int i = 0; i <= 2; i++) {
            if (rewardsAndCoupons.chkBtnSkip().size() != 0) {
                System.out.println(" rewardsAndCoupons.getBtnSkip() ==========> "
                        + SCHUtils.isPresent(rewardsAndCoupons.getBtnSkip()));
                SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnSkip());
                SCHUtils.waitForLoaderToDismiss();
                PauseUtil.waitForAjaxToComplete();
            }
        }

        rewardsAndCoupons.verifyDollarsToSpendNotPresent();
    }


    @Then("^teacher should not see dollars to spend promotion on rewards and coupon page$")
    public void teacher_should_not_see_dollars_to_spend_promotion_on_rewards_and_coupon_page() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        for (int i = 0; i <= 2; i++) {
            if (rewardsAndCoupons.chkBtnSkip().size() != 0) {
                System.out.println(" rewardsAndCoupons.getBtnSkip() ==========> "
                        + SCHUtils.isPresent(rewardsAndCoupons.getBtnSkip()));
                SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnSkip());
                SCHUtils.waitForLoaderToDismiss();
                PauseUtil.waitForAjaxToComplete();
            }
        }

        rewardsAndCoupons.verifyDollarsToSpendNotPresent();
    }

    @Then("^user should see \\[RewardsInformation\\] on \"([^\"]*)\"$")
    public void user_should_rewardsInformation_onpage(String page) throws Throwable {
        SCHUtils.waitForLoaderToDismiss();
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        confirmAndSubmitOrder.verifyRewardsAndPromotionDetail();
    }

    @Then("^user should see \\[TeacherWishListItems\\] section on \"([^\"]*)\"$")
    public void user_should_see_TeacherSummary_section_on_confirm_and_submit_page(
            String page) throws Throwable {
        SCHUtils.waitForLoaderToDismiss();
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        confirmAndSubmitOrder.verifyTeacherWishListSection();
    }


    @And("^teacher click on edit option on dollar to spend section$")
    public void teacher_click_on_edit_option_on_dollar_to_spend_section()
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clickOnEditLinkOnDollarToSpendSection();
    }


    @When("^teacher click on edit option for Free Pick coupon section$")
    public void teacher_click_on_edit_option_for_free_pick_coupon_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clickOnEditLinkOnFreePickCouponSection();
    }


    @And("^teacher can click on the coupon code$")
    public void teacher_can_click_on_the_coupon_code() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clickOnEditLinkOnFreePickCouponSection();
    }


    @When("^teacher clicks on Close option in Make Your Selection window$")
    public void teacher_clicks_on_close_option_in_make_your_selection_window()
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clickOnCloseIcon();
    }

    @When("^teacher clicks on Cancel button in Make Your Selection window$")
    public void teacher_clicks_on_cancel_button_in_make_your_selection_window()
            throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clickOnCancel_CouponPopup();
    }

    @And("^user edits coupon on dollar to spend section$")
    public void user_edits_coupon_on_dollar_to_spend_section() {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clickOnEditLinkOnDollarToSpendSection();
        checkoutPage.getICouponSection()
                .editFreePickCoupon(TestBaseProvider.getTestBase().getTestData());
        ;

    }


    @Then("^user is abel to enter the wrong coupon$")
    public void user_is_abel_to_enter_the_wrong_coupon() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        String coupons[] = SCHUtils.getArrayFromStringData(TestBaseProvider.getTestBase()
                .getTestData().getString("wrongcouponnumber"));
        for (String coupon : coupons) {
            rewardsAndCoupons.enterWrongCoupon(coupon);

        }
    }

    @Then("^User is able to verify error message for wrong coupon$")
    public void user_is_able_to_verify_error_message_for_wrong_coupon() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        rewardsAndCoupons.wrongErrorCouponMessage();
    }

    @When("^Teacher should see Free item promotion is displayed$")
    public void teacher_should_see_Free_item_promotionn_is_displayed() throws Throwable {
    	ICartPage cartPage = getFactory().getICartPage();
		cartPage.verify_FreeItem_promotion_is_displayed();
    }


    @Then("^Teacher should see Free Teacher Kit promotion is displayed$")
    public void teacher_should_see_free_teacher_kit_promotion_is_displayed() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.getRewardsAndCouponsSection().verifyTossIn();
    }

    @And("^teacher selects items such that the top-off amount makes cart qualify for Bonus Flat coupon$")
    public void teacher_selects_items_such_that_the_topoff_amount_makes_cart_qualifying_for_Bonus_Flat_coupon() throws Throwable {

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		  /*String coupons[] = SCHUtils.getArrayFromStringData(
		    TestBaseProvider.getTestBase().getTestData().getString("coupontype"));
		  for (int i = 0; i < coupons.length; i++) {*/
        checkoutPage.MakeSelectionWindow_SelectSpecificItem(TestBaseProvider.getTestBase().getTestData(),
                TestBaseProvider.getTestBase().getTestData().getDouble("couponprice"),
                TestBaseProvider.getTestBase().getTestData().getDouble("couponprice_limit"));

        //}
    }


    @When("^Teacher navigates to Review Your Cart page from Coupons and Rewards Page$")
    public void teacher_navigates_to_review_your_cart_page_from_coupons_and_rewards_page()
            throws Throwable {
        ICartPage cartPage = getFactory().getICartPage();
        cartPage.clickReturnToShopBtn();
        cartPage.clickOnReviewCartButton();

    }

    @When("^Teacher deletes items from cart such that cart does not qualify for minimum amount$")
    public void teacher_deletes_items_from_cart_such_that_cart_does_not_qualify_for_minimum_amount()
            throws Throwable {
        ICartPage cartPage = getFactory().getICartPage();
        cartPage.clickOnRemoveCircle();
        PauseUtil.pause(2000);
        cartPage.clickOnYesButton();
    }

    @Then("^Teacher sees Free item promotion in Confirm & Submit page$")
    public void teacher_sees_Free_item_promotion_in_confirm_submit_page()
            throws Throwable {

        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        PauseUtil.waitForAjaxToComplete(2000);

        // checkOut.waitForPageLoad();
        checkOut.getRewardsAndCouponsSection().verifyFreePromotionConfirmandSubmitPage();

    }


    @And("^Teacher sees Free item promotion in Confirmation page$")
    public void teacher_sees_free_item_promotion_in_confirmation_page() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        PauseUtil.waitForAjaxToComplete(2000);
        checkOut.getRewardsAndCouponsSection().verifyFreePromotionConfirmandSubmitPage();
    }


    @And("^teacher clicks on Confirm Selection button$")
    public void teacher_clicks_on_confirm_selection_button() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.getICouponSection().createdatafromFreePickSelection();
        checkoutPage.getICouponSection().clickOnConfrimAndApplyCoupon();
        //checkoutPage.getICouponSection().createdatafromFreePickSelection();


        //System.out.println("teacher clicks on Confirm Selection button2" + Total_Owing_Amount_act_1.getTotal_StudenClub_Value());
        //System.out.println("teacher clicks on Confirm Selection button2" + Total_Owing_Amount_act_1.getExceeded_Amt());

    }

    @And("^Teacher enters an amount in bonus bank and paper coupons and applies$")
    public void teacher_enters_an_amount_in_bonus_bank_and_paper_coupons_and_applies()
            throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        while (SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon())) {
            System.out.println(" rewardsAndCoupons.getBtnEditCoupon() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon()));
            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnEditCoupon());
            WaitUtils.waitForEnabled(rewardsAndCoupons.getbtnApplyBonusPaper());

        }

        checkOut.getRewardsAndCouponsSection().enterBonusBank(
                TestBaseProvider.getTestBase().getTestData(), "bonusbank");
        PauseUtil.pause(1500);
        checkOut.getRewardsAndCouponsSection().enterPaperCoupon(
                TestBaseProvider.getTestBase().getTestData(), "paperbonuscoupon");
        PauseUtil.pause(1500);

        // code to verify that the button changes to APPLY
        assert (SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper()));

        System.out.println(" rewardsAndCoupons.getbtnApplyBonusPaper() ==========> "
                + SCHUtils.isPresent(rewardsAndCoupons.getbtnApplyBonusPaper()));
        SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getbtnApplyBonusPaper());
        WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnEditCoupon());
        PauseUtil.pause(1000);
        // SCHUtils.waitForLoaderToDismiss();
        // PauseUtil.waitForAjaxToComplete();
    }

    @When("^Teacher edits already entered amounts$")
    public void Teacher_edits_already_entered_amounts() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnEditCoupon());
    }

    @When("^Teacher navigates to rewards & coupons page$")
    public void teacher_navigates_to_rewards_coupons_page() throws Throwable {
        ICartPage cartPage = getFactory().getICartPage();
        CartPage crtpge = new CartPage();
        cartPage.clickOn_ProceedToCheckoutBtn();
        PauseUtil.pause(2500);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);
        SCHUtils.waitForLoaderToDismiss();
        if (SCHUtils.isPresent(crtpge.getbtntopBonuspointModelProceedToCheckout())) {
            SCHUtils.clickUsingJavaScript(crtpge.getbtntopBonuspointModelProceedToCheckout());
            PauseUtil.pause(1000);
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete();
        }
        Assert.assertTrue(cartPage.is_RewardsAndCouponsActive_dislayed(), "RewardsAndCoupon page is not displayed");
    }

    @And("^Teacher navigates to Redemptions & Rewards page$")
    public void teacher_navigates_to_redemptions_rewards_page() throws Throwable {
        ICartPage cartPage = getFactory().getICartPage();
        CartPage crtpge = new CartPage();
        cartPage.clickOn_btnReviewCart();

        cartPage.clickOn_ProceedToCheckoutBtn();
        PauseUtil.pause(2500);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        SCHUtils.waitForLoaderToDismiss();
        if (SCHUtils.isPresent(crtpge.getbtntopBonuspointModelProceedToCheckout())) {
            SCHUtils.clickUsingJavaScript(crtpge.getbtntopBonuspointModelProceedToCheckout());
            PauseUtil.pause(1000);
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete();
        }
        Assert.assertTrue(cartPage.is_RewardsAndCouponsActive_dislayed(), "Redemptions & Rewards page is not displayed");
    }


    @And("^Teacher navigates to Payments page$")
    public void teacher_navigates_to_payments_page() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        //checkoutPage.navigateToPaymentsPage();
        checkoutPage.teacher_navigate_to_payment_page();
        PauseUtil.pause(5000);
    }

    @And("^Teacher navigates to Payments page2$")
    public void teacher_navigates_to_payments_page2() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.navigateToPaymentsPage_2();
        PauseUtil.pause(5000);
    }

    @And("^Teacher navigates to Payments page3$")
    public void teacher_navigates_to_payments_page3() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.navigateToPaymentsPage_3();
        PauseUtil.pause(5000);
    }

    @And("^Teacher navigates to Payments page4$")
    public void teacher_navigates_to_payments_page4() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        double value = checkoutPage.navigateToPaymentsPage_4();

        Total_Owing_Amount_act_1.setTotalOwingValue(value);
        PauseUtil.pause(5000);
    }

    @And("^Teacher navigate to Payment page$")
    public void teacher_navigate_to_payment_page() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        double value = checkoutPage.teacher_navigate_to_payment_page();

        Total_Owing_Amount_act_1.setTotalOwingValue(value);
        PauseUtil.pause(5000);
    }

    @When("^Teacher navigates to the Payments page$")
    public void teacher_navigates_to_the_Payments_page() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.navigateToPaymentsPage_TGAT();
    }

    @When("^Teacher proceed to checkout from Rewards and coupons page$")
    public void teacher_proceed_to_checkout_from_rewards_and_coupons_page() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.navigateToPaymentsPage_TGAT();
    }

    @And("^teacher clicks on Continue Checkout$")
    public void teacher_clicks_on_continue_checkout() throws Throwable {

        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_ContinueCheckout_Rewards_page();
    }


    @And("^teacher views Amount paid by checks with check amount$")
    public void teacher_views_amount_paid_by_checks_with_check_amount() throws Throwable {
        ICartPage cartpage = getFactory().getICartPage();
        cartpage.verify_the_amount_paid_by_cheque_with_cheque_amt_ConfirmSub_Page(Total_Owing_Amount_act_1.getTotalOwingValue());

    }

    @When("^Teacher navigates to rewards & coupons page_2$")
    public void teacher_navigates_to_rewards_coupons_page_2() throws Throwable {
        ICartPage cartPage = getFactory().getICartPage();
        CartPage crtpge = new CartPage();
        cartPage.clickOn_ProceedToCheckoutBtn();
        PauseUtil.pause(2500);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        SCHUtils.waitForLoaderToDismiss();
        if (SCHUtils.isPresent(crtpge.getbtntopBonuspointModelProceedToCheckout())) {
            SCHUtils.clickUsingJavaScript(crtpge.getbtntopBonuspointModelProceedToCheckout());
            PauseUtil.pause(1000);
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete();
        }
        Assert.assertTrue(cartPage.is_RewardsAndCouponsActive_dislayed(), "RewardsAndCoupon page is not displayed");

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        double value1 = checkoutPage.Validation_of_no_taxes_charged_Student_club_And_TeacherCatalogues_in_PaymentsPage();
        double value2 = checkoutPage.Validation_of_no_taxes_charged_Student_club_And_TeacherCatalogues_in_PaymentsPage_2();

        Total_Owing_Amount_act_1.setStudent_Sub_Tot_Value(value1);
        Total_Owing_Amount_act_1.setTeacher_Sub_Tot_Value(value2);

    }

    @Then("^no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly in Payment Page$")
    public void no_taxes_are_charged_on_student_club_subtotaltotal_amount_and_teacher_catalogues_subtotaltotal_amount_and_total_owing_amount_displays_correctly_in_payment_page() throws Throwable {
    	ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_No_taxes_are_displayed_for_YTO_section_in_Payment_page();
        checkoutPage.validate_No_taxes_are_displayed_for_TE_section_in_Payment_page();
    }

    @Then("^teacher sees alternate shipping option$")
    public void teacher_sees_alternate_shipping_option() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        Assert.assertTrue(checkoutPage.Validation_alternate_shipping_displayed_in_PaymentsPage(), "Alternate Shipping Flag is not displayed");
    }

    @And("^teacher clicks on Submit Order$")
    public void teacher_clicks_on_submit_order() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.submit_the_Order();

    }

    @And("^Teacher submit the order$")
    public void teacher_submit_the_Order() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.submit_the_Order();
    }

    @Then("^sees the Main message and sub message as in confirm & submit page$")
    public void sees_the_main_message_and_sub_message_as_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage2 = getFactory().getICheckoutPage_2();
        checkoutPage2.verify_the_Order_successful_message_isDisplayed();

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validation_of_Rewards_earned_amount_message_CouponsRewardsPage();
        checkoutPage.validation_of_Submit_order_date_CouponsRewardsPage();


    }

    @Then("^teacher sees items grouped by Club Youngest Club to Oldest Club in Order reference page$")
    public void teacher_sees_items_grouped_by_club_youngest_club_to_oldest_club_in_order_reference_page() throws Throwable {
        ICartPage cartpage = getFactory().getICartPage();
        cartpage.verify_the_Grades_order_in_Order_reference_page();
    }


    @Then("^total amount should be updated$")
    public void total_amount_should_be_updated() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^teacher enters amount in student Bonus Bank$")
    public void teacher_enters_amount_in_student_bonus_bank() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Bonus_Bank();
    }

    @When("^teacher enters amount more than the student order total in student Bonus Bank$")
    public void teacher_enters_amount_more_than_the_student_order_total_in_student_bonus_bank() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Bonus_Bank_Greater_Than_StudentClubTotal_Amount();
    }


    @When("^teacher enters amount in student Bonus Bank equal to Student Club total$")
    public void teacher_enters_amount_in_student_bonus_bank_equal_to_student_club_total() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Bonus_Bank_Equal_To_StudentClubTotal_Amount();
    }


    @When("^Teacher makes order total as zero by applying redemptions$")
    public void teacher_makes_order_total_as_zero_by_applying_redemptions() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Bonus_Bank_Equal_To_StudentClubTotal_Amount();
        checkoutPage.enter_amount_in_shipping_Bonus_Bank_Equal_To_ShippingFee_Amount();
    }

    @When("^CSR makes order total as zero by applying redemptions$")
    public void csr_makes_order_total_as_zero_by_applying_redemptions() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Bonus_Bank_Equal_To_StudentClubTotal_Amount();
        checkoutPage.enter_amount_in_shipping_Bonus_Bank_Equal_To_ShippingFee_Amount();
    }


    @When("^teacher enters amount in teacher Bonus Bank equal to Teacher Club total$")
    public void teacher_enters_amount_in_teacher_bonus_bank_equal_to_teacher_club_total() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Bonus_Bank_Equal_To_TeacherClubTotal_Amount();
    }


    @When("^teacher enters amount in teacher paper bonus coupon equal to Teacher Club total$")
    public void teacher_enters_amount_in_teacher_paper_bonus_coupon_equal_to_teacher_club_total() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Paper_Bonus_Coupon_Equal_To_TeacherClubTotal_Amount();
    }


    @When("^teacher enters amount in student Paper Bonus coupon equal to Student Club total$")
    public void teacher_enters_amount_in_student_paper_bonus_coupon_equal_to_student_club_total() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Paper_Bonus_Coupon_Equal_To_StudentClubTotal_Amount();
    }


    @When("^teacher enters amount in Bonus Bank and paper Bonus coupon making redemptions equal to the Student Clubs total amount$")
    public void teacher_enters_amount_in_bonus_bank_and_paper_bonus_coupon_making_redemptions_equal_to_the_student_clubs_total_amount() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Bonus_Bank_Paper_Bonus_Coupon_Equal_To_StudentClubTotal_Amount();
    }


    @When("^teacher enters amount in Bonus Bank and paper Bonus coupon making redemptions equal to Teacher Clubs total amount$")
    public void teacher_enters_amount_in_bonus_bank_and_paper_bonus_coupon_making_redemptions_equal_to_teacher_clubs_total_amount() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Bonus_Bank_Paper_Bonus_Coupon_Equal_To_TeacherClubTotal_Amount();
    }


    @When("^teacher enters amount more than the teacher order total in teacher Bonus Bank$")
    public void teacher_enters_amount_more_than_the_teacher_order_total_in_teacher_bonus_bank() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Bonus_Bank_Greater_Than_TeacherClubTotal_Amount();
    }


    @When("^teacher enters amount more than the student order total in paper Bonus coupon$")
    public void teacher_enters_amount_more_than_the_student_order_total_in_paper_bonus_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Paper_Bank_Greater_Than_StudentClubTotal_Amount();
    }


    @When("^teacher enters amount in Bonus Bank and paper Bonus coupon making redemptions greater than the student club total$")
    public void teacher_enters_amount_in_bonus_bank_and_paper_bonus_coupon_making_redemptions_greater_than_the_student_club_total() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Bonus_Bank_Paper_Bank_Greater_Than_StudentClubTotal_Amount();
    }

    @When("^teacher enters amount in Bonus Bank and paper Bonus coupon making redemptions greater than the teacher club total$")
    public void teacher_enters_amount_in_bonus_bank_and_paper_bonus_coupon_making_redemptions_greater_than_the_teacher_club_total() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Bonus_Bank_Paper_Bank_Greater_Than_TeacherClubTotal_Amount();
    }


    @When("^teacher enters amount greater than the teacher order total in teacher paper Bonus coupon$")
    public void teacher_enters_amount_greater_than_the_teacher_order_total_in_teacher_paper_bonus_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Paper_Bank_Greater_Than_TeacherClubTotal_Amount();
    }


    @When("^teacher enters amount more than dollars in Bonus Bank in student Bonus Bank$")
    public void teacher_enters_amount_more_than_dollars_in_bonus_bank_in_student_bonus_bank() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Bonus_Bank_Greater_Than_BonusBank_Amount();
    }


    @When("^teacher enters amount more than dollars in Bonus Bank in teacher Bonus Bank$")
    public void teacher_enters_amount_more_than_dollars_in_bonus_bank_in_teacher_bonus_bank() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teachers_Bonus_Bank_Greater_Than_BonusBank_Amount();
    }


    @When("^teacher enters amount more than dollars in Bonus Bank in shipping Bonus Bank$")
    public void teacher_enters_amount_more_than_dollars_in_bonus_bank_in_shipping_bonus_bank() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_shipping_Bonus_Bank_Greater_Than_BonusBank_Amount();
    }


    @When("^teacher enters amount equal to the \\[ShippingFee\\] in shipping Bonus Bank$")
    public void teacher_enters_amount_equal_to_the_shippingfee_in_shipping_bonus_bank() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_shipping_Bonus_Bank_Equal_To_ShippingFee_Amount();
    }


    @When("^teacher enters amount equal to the \\[ShippingFee\\] in shipping paper bonus coupon$")
    public void teacher_enters_amount_equal_to_the_shippingfee_in_shipping_paper_bonus_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_shipping_Paper_Bonus_Coupon_Equal_To_ShippingFee_Amount();
    }

    @When("^teacher enters amount equal to the \\[ShippingFee\\] in shipping Bonus Bank and paper Bonus coupon$")
    public void teacher_enters_amount_equal_to_the_shippingfee_in_shipping_bonus_bank_and_paper_bonus_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_shipping_Bonus_Bank_Paper_Bonus_Coupon_Equal_To_ShippingFee_Amount();
    }


    @And("^teacher enters amount less than the \\[ShippingFee\\] in teacher Bonus Bank and paper coupons$")
    public void teacher_enters_amount_less_than_the_shippingfee_in_teacher_bonus_bank_and_paper_coupons() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_shipping_Bonus_Bank_Paper_Bonus_Coupon_Less_Than_ShippingFee_Amount();
    }


    @And("^teacher enters amount in \\[student Bonus Bank\\] such that cart total is now below \\[minimum amount\\]$")
    public void teacher_enters_amount_in_student_bonus_bank_such_that_cart_total_is_now_below_minimum_amount() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Bonus_Bank();
    }

    @And("^teacher enters amount in student Paper coupons$")
    public void teacher_enters_amount_in_student_paper_coupons() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Paper_Bank();
    }

    @And("^teacher enters amount in \\[student paper dollar\\] such that cart total is now below \\[minimum amount\\]$")
    public void teacher_enters_amount_in_student_paper_dollar_such_that_cart_total_is_now_below_minimum_amount() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Paper_Bank();
    }

    @And("^Teacher adds amount in \\[Teacher Bonus dollars\\] such that cart total is now below \\[minimum amount\\]$")
    public void teacher_adds_amount_in_teacher_bonus_dollars_such_that_cart_total_is_now_below_minimum_amount() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Bonus_Bank();
    }

    @And("^Teacher applies \\[Free item coupon\\]$")
    public void teacher_applies_free_item_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_a_coupon_Rewards_page();
    }

    @And("^Teacher enters \\[Free Pick Coupon\\]$")
    public void teacher_enters_free_pick_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_a_coupon_Rewards_page();
    }

    @When("^Teacher enters a TGAT coupon$")
    public void teacher_enters_a_tgat_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_TGAT_coupon_in_Rewards_page();
    }

    @When("^Teacher selects the DTS item which top off amount makes the cart to qualify$")
    public void teacher_selects_the_dts_item_which_top_off_amount_makes_the_cart_to_qualify() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clickOnMakeSelectionButton();

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(5000);
        PauseUtil.pause(6000);
        WaitUtils.waitForEnabled(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards());
        SCHUtils.selectOptionsByVisibleText(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards(),
                TestBaseProvider.getTestBase().getTestData().getString("grade"));
        PauseUtil.pause(5000);

        checkoutPage.Selects_multiple_items_from_Make_Selection_window();

        checkoutPage.getICouponSection().clickOnConfrimAndApplyCoupon();

    }

    @When("^Teacher clicks on delete TGAT coupon button and selects as \\[NO\\]$")
    public void teacher_clicks_on_delete_tgat_coupon_button_and_selects_as_no() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.select_TGAT_delete_button_and_click_NO();
    }

    @When("^Teacher clicks on delete TGAT coupon button and selects as \\[YES\\]$")
    public void teacher_clicks_on_delete_tgat_coupon_button_and_selects_as_yes() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.select_TGAT_delete_button_and_click_YES();
    }

    @And("^Teacher deletes the TGAT coupon$")
    public void teacher_deletes_the_tgat_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.select_TGAT_delete_button_and_click_YES();
    }

    @Then("^the applied TGAT coupon should be displayed in \\[Coupons Applied\\] section$")
    public void the_applied_tgat_coupon_should_be_displayed_in_coupons_applied_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_TGAT_coupon_in_Coupons_Applied_section();
    }

    @Then("^the applied TGAT coupon should not be displayed in \\[Coupons Applied\\] section$")
    public void the_applied_tgat_coupon_should_not_be_displayed_in_coupons_applied_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_TGAT_coupon_not_present_in_Coupons_Applied_section();
    }

    @When("^Teacher enters again the same TGAT coupon$")
    public void teacher_enters_again_the_same_tgat_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_TGAT_coupon_second_time_in_Rewards_page();
    }

    @When("^Teacher enters a TGAT coupon which is already applied and redeemed$")
    public void teacher_enters_a_tgat_coupon_which_is_already_applied_and_redeemed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_TGAT_coupon_in_Rewards_page();
    }

    @When("^Teacher enters invalid TGAT coupon$")
    public void teacher_enters_invalid_tgat_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_TGAT_coupon_in_Rewards_page();
    }

    @When("^Teacher enters expired TGAT coupon$")
    public void teacher_enters_expired_tgat_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_TGAT_coupon_in_Rewards_page();
    }

    @And("^Teacher enters a TGAT coupon which is referred by \\[Teacher1\\]$")
    public void teacher_enters_a_tgat_coupon_which_is_referred_by_teacher1() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_TGAT_coupon_in_Rewards_page_referred_by_Teacher1();
    }

    @When("^Teacher enters a TGAT coupon which is referred by \\[Teacher2\\]$")
    public void teacher_enters_a_tgat_coupon_which_is_referred_by_teacher2() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_TGAT_coupon_in_Rewards_page_referred_by_Teacher2();
    }

    @Then("^the error message 'You have already redeemed this coupon code on a previous order\\.' should be displayed$")
    public void the_error_message_you_have_already_redeemed_this_coupon_code_on_a_previous_order_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validate_error_message_when_enter_TGAT_secondTime();
    }

    @Then("^the tooltip 'Thank you for ensuring your colleague earns Bonus Points!' text should be displayed$")
    public void the_tooltip_thank_you_for_ensuring_your_colleague_earns_bonus_points_text_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_the_toolTip_for_TGAT_coupon_details();
    }

    @Then("^the error message 'click the coupon link below to finalize your coupons' text should be displayed$")
    public void the_error_message_click_the_coupon_link_below_to_finalize_your_coupons_text_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_the_error_msg_without_enter_TGAT_ac_details_and_proceed_checkout();
    }

    @Then("^the error message \\'Coupon code is already in your cart\\.' should be displayed$")
    public void the_error_message_coupon_code_is_already_in_your_cart_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validate_error_message_when_enter_same_TGAT_coupon();
    }

    @Then("^the error message \\'This Coupon has already been applied to this order' should be displayed$")
    public void the_error_message_this_coupon_has_already_been_applied_to_this_order_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validate_error_message_when_enter_TGAT_secondTime_in_sameOrder();
    }

    @Then("^the error message \\'Coupon code is unknown\\.' should be displayed$")
    public void the_error_message_coupon_code_is_unknown_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validate_error_message_when_wrong_TGAT_coupon_enters();
    }

    @Then("^the error message \\'Your order does not meet the coupon requirements\\. Please check the coupon for details\\.' should be displayed$")
    public void the_error_message_your_order_does_not_meet_the_coupon_requirements_please_check_the_coupon_for_details_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validate_error_message_when_order_does_not_qualify_the_min_val();
    }

    @When("^Teacher enters inactive Teacher account details in TGAT modal window$")
    public void teacher_enters_inactive_teacher_account_details_in_tgat_modal_window() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Teacher_enters_referring_teacher_details_TGAT_modal_window();
    }

    @Then("^the error message \\'Your order does not meet the coupon requirements\\.Please check the coupon for details' should be displayed$")
    public void the_error_message_your_order_does_not_meet_the_coupon_requirementsplease_check_the_coupon_for_details_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validate_error_message_which_not_meet_the_student_club_tot_value();
    }

    @Then("^the error message \\'This customer account number is invalid\\. Please make sure you entered the correct number' should be displayed$")
    public void the_error_message_this_customer_account_number_is_invalid_please_make_sure_you_entered_the_correct_number_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validate_error_message_for_invalid_customer_account_number();
    }

    @When("^Teacher enters referring Teacher account details in TGAT modal window$")
    public void teacher_enters_referring_teacher_account_details_in_tgat_modal_window() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Teacher_enters_referring_teacher_details_TGAT_modal_window();
    }

    @And("^Teacher closes the TGAT modal window$")
    public void teacher_closes_the_tgat_modal_window() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.close_the_TGAT_modal_window();
    }

    @When("^Teacher enters only the \\[Fname\\] and \\[Lname\\] of referring Teacher in TGAT modal window$")
    public void teacher_enters_only_the_fname_and_lname_of_referring_teacher_in_tgat_modal_window() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Teacher_enters_referring_teacher_Fname_Lname_in_TGAT_modal_window();
    }

    @When("^Teacher enters only the \\[AcNumber\\] and \\[Lname\\] of referring Teacher in TGAT modal window$")
    public void teacher_enters_only_the_acnumber_and_lname_of_referring_teacher_in_tgat_modal_window() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Teacher_enters_referring_teacher_AcNum_Lname_in_TGAT_modal_window();
    }

    @When("^Teacher enters only the \\[AcNumber\\] and \\[Fname\\] of referring Teacher in TGAT modal window$")
    public void teacher_enters_only_the_acnumber_and_fname_of_referring_teacher_in_tgat_modal_window() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Teacher_enters_referring_teacher_AcNum_Fname_in_TGAT_modal_window();
    }

    @Then("^the \\[Submit\\] button should be disabled$")
    public void the_submit_button_should_be_disabled() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validate_Submit_button_is_disabled_in_TGAT_modal_window();
    }

    @When("^Teacher enters invalid referring Teacher account number in TGAT modal window$")
    public void teacher_enters_invalid_referring_teacher_account_number_in_tgat_modal_window() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Teacher_enters_referring_teacher_details_TGAT_modal_window();
    }

    @Then("^referring Teacher account details should be displyed in the \\[Coupons Applied\\] section$")
    public void referring_teacher_account_details_should_be_displyed_in_the_coupons_applied_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_Teacher_ac_details_displayed_Coupons_applied_section();
    }

    @When("^teacher deletes the item from Current Selection section window$")
    public void teacher_deletes_the_item_from_current_selection_section_window() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.deletes_the_Selected_item_Modal_Selection_Window();
    }

    @Then("^confirm selection button is disabled$")
    public void confirm_selection_button_is_disabled() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_ConfirmSubmit_button_disappear_Modal_Selection_Window();
    }

    @When("^teacher searches for a \\[Non\\-qualifying Item\\]$")
    public void teacher_searches_for_a_nonqualifying_item() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clicks_Search_fld_and_searches_an_item_in_MakeYourSelection_window();
    }

    @Then("^no results displays$")
    public void no_results_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_no_search_results_display_in_MakeYourSelection_window();
    }

    @And("^teacher applies the \\[Bonus percentage coupon\\]$")
    public void teacher_applies_the_bonus_percentage_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_a_coupon_Rewards_page();
    }

    @Then("^teacher sees the upsell message with dollars gained from current cart total$")
    public void teacher_sees_the_upsell_message_with_dollars_gained_from_current_cart_total() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_upseller_message_displayed_Rewards_page();
    }

    @And("^teacher is notified of dollar amount that teacher would receive if teacher adds items to cart meeting next tier$")
    public void teacher_is_notified_of_dollar_amount_that_teacher_would_receive_if_teacher_adds_items_to_cart_meeting_next_tier() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_upseller_message_displayed_Rewards_page();
    }

    @When("^teacher applies already redeemed \\[Free item coupon\\]$")
    public void teacher_applies_already_redeemed_free_item_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_a_coupon_Rewards_page(); // enter coupon
        //checkoutPage.verify_FreeItem_displayed_in_Rewards_page(); // SS- This is invalid as coupon should  not be applied
        //checkoutPage.apply_a_coupon_Rewards_page();
    }

    @When("^teacher applies the \\[redeemed coupon\\]$")
    public void teacher_applies_the_redeemed_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_a_coupon_Rewards_page();
        checkoutPage.verify_FreeItem_displayed_in_Rewards_page();
        checkoutPage.apply_a_coupon_Rewards_page();
    }

    @And("^teacher can apply the same \\[Free item coupon\\] again$")
    public void teacher_can_apply_the_same_free_item_coupon_again() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_a_coupon_Rewards_page();
    }

    @When("^teacher deletes the Free item coupon$")
    public void teacher_deletes_the_free_item_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.TCOD_delete_applied_coupon_Rewards_page();
    }

    @Then("^Teacher sees error message$")
    public void teacher_sees_error_message() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_error_message_displayed_in_Rewards_page();
    }

    @And("^teacher recieves percentage\\*carttotal\\/100 dollars from first tier$")
    public void teacher_recieves_percentagecarttotal100_dollars_from_first_tier() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_the_percentage_recieved_in_Rewards_page_tier1();
    }

    @And("^teacher recieves percentage\\*carttotal\\/100 dollars from first tier_2$")
    public void teacher_recieves_percentagecarttotal100_dollars_from_first_tier_2() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        double earnedAmt = checkoutPage.verify_the_percentage_recieved_in_Rewards_page_tier1_with_BonusPercentage();
        Total_Owing_Amount_act_1.setEarned_Amt(earnedAmt);
        PauseUtil.pause(5000);
    }

    @Then("^teacher does not see the Bonus percentage dollars received earlier$")
    public void teacher_does_not_see_the_bonus_percentage_dollars_received_earlier() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_the_percentage_recieved_in_Rewards_page_tier1_after_deletes_the_Bonus_coupon(Total_Owing_Amount_act_1.getEarned_Amt());
    }

    @Then("^teacher recieves percentage\\*carttotal\\/100 dollars from second tier$")
    public void teacher_recieves_percentagecarttotal100_dollars_from_second_tier() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_the_percentage_recieved_in_Rewards_page_tier2();
    }

    @And("^teacher sees description from second tier and calculations based on second tier in Rewards section$")
    public void teacher_sees_description_from_second_tier_and_calculations_based_on_second_tier_in_rewards_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_Bonus_percentage_description_is_displayed_in_rewardsPage();
    }

    @And("^teacher sees description from first tier and calculations based on first tier in Rewards section$")
    public void teacher_sees_description_from_first_tier_and_calculations_based_on_first_tier_in_rewards_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_Bonus_percentage_description_is_displayed_in_rewardsPage();
    }

    @And("^teacher receives Flat Bonus dollars$")
    public void teacher_receives_flat_bonus_dollars() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        //checkoutPage.verify_Teacher_receives_FlatBonusDollars();
        checkoutPage.CSR_verify_BonusFlat_amt_section_is_displayed_RedeemRewards_page();
    }

    @When("^teacher deletes the items from cart making cart non\\-qualifying$")
    public void teacher_deletes_the_items_from_cart_making_cart_nonqualifying() throws Throwable {
        IStudentFlyerOrdersPage studentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();

        studentFlyerOrdersPage.user_navigates_to_Home_page_from_Order_ref_page();

        ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
        PauseUtil.pause(1000);
        teachersHomePage.user_clicks_on_mini_Reviewcart();
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.fillStudentFlyerOrder_ModifyQuantity_ReviewCartPage1(
                TestBaseProvider.getTestBase().getTestData().getString("updated_itemQty"));
        //studentFlyerOrdersPage.user_deletes_item1_in_reviewCart();
        // added below for the  TGAT sc
       // studentFlyerOrdersPage.user_deletes_item2_in_reviewCart();

    }

    @Then("^teacher recieves Bonus percent Dollars$")
    public void teacher_recieves_bonus_percent_dollars() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_Bonus_percentage_description_is_displayed_in_rewardsPage();
    }

    @And("^Teacher sees Free item displayed in Coupons section$")
    public void teacher_sees_free_item_displayed_in_coupons_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_FreeItem_displayed_in_Rewards_page();
    }

    @Then("^TGAT modal window should be displayed$")
    public void tgat_modal_window_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_TGAT_modal_window_displayed();
    }

    @Then("^Free Pick Coupon should not display$")
    public void free_pick_coupon_should_not_display() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_FreePickCoupon_section_is_not_displayed_in_rewardsPage();
    }

    @Then("^Free item Coupon should not display$")
    public void free_item_coupon_should_not_display() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_FreePickCoupon_section_is_not_displayed_in_rewardsPage();
    }

    @Then("^the FREE shipping coupon is automatically removed$")
    public void the_free_shipping_coupon_is_automatically_removed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_FreePickCoupon_section_is_not_displayed_in_rewardsPage();
    }

    @And("^teacher can proceed to payment page$")
    public void teacher_can_proceed_to_payment_page() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.navigateToPaymentsPage();
    }

    @And("^teacher clicks on Apply in Students section$")
    public void teacher_clicks_on_apply_in_students_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.click_on_Apply_in_Students_section();
    }

    @And("^teacher enters amount in teacher Bonus Bank$")
    public void teacher_enters_amount_in_teacher_bonus_bank() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Bonus_Bank();
    }

    @And("^teacher enters amount in teacher Paper coupons$")
    public void teacher_enters_amount_in_teacher_paper_coupons() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Paper_Bank();
    }

    @And("^Teacher adds amount in \\[Teacher paper dollar\\] such that cart total is now below \\[minimum amount\\]$")
    public void teacher_adds_amount_in_teacher_paper_dollar_such_that_cart_total_is_now_below_minimum_amount() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Paper_Bank();
    }


    @When("^teacher enters amount equal to order total in student Bonus Bank$")
    public void teacher_enters_amount_equal_to_order_total_in_student_bonus_bank() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_bonus_Bank_Equal_To_OrderTotal();
    }


    @And("^teacher clicks on Apply in teacher section$")
    public void teacher_clicks_on_apply_in_teacher_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.click_on_Apply_in_Teacher_section();
    }

    @Then("^StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly$")
    public void studentclub_posttaxitemsgstpsttotal_amount_and_teachercatalogues_posttaxitemsgstpsttotal_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_in_RewardsCouponsPage();
    }

    @Then("^StudentClub PostTax,Items,GST,PST,Total amount displays correctly$")
    public void studentclub_posttaxitemsgstpsttotal_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Validation_of_Student_club_Total_in_RewardsCouponsPage();
    }

    @Then("^Teacher Catalogues PostTax,Items,GST,PST,Total amount displays correctly$")
    public void teacher_catalogues_posttaxitemsgstpsttotal_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Validation_of_Teacher_catalogues_Total_in_RewardsCouponsPage();
    }

    @Then("^Teacher Catalogues PostTax,Items,GST,QST,Total amount displays correctly$")
    public void teacher_catalogues_posttaxitemsgstqsttotal_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Validation_of_Teacher_catalogues_Total_in_RewardsCouponsPage_gst_qst();
    }

    @Then("^StudentClub PostTax,Items,GST,QST,Total amount displays correctly$")
    public void studentclub_posttaxitemsgstqsttotal_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Validation_of_Student_club_Total_in_RewardsCouponsPage_gst_qst();
    }

    @Then("^StudentClub PostTax,Items,GST,QST,Total amount and TeacherCatalogues PostTax,Items,GST,QST,Total amount displays correctly$")
    public void studentclub_posttaxitemsgstqsttotal_amount_and_teachercatalogues_posttaxitemsgstqsttotal_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_in_RewardsCouponsPage_gst_qst();
    }

    @Then("^StudentClub PostTax,Items,HST,Total amount and TeacherCatalogues PostTax,Items,HST,Total amount displays correctly$")
    public void studentclub_posttaxitemshsttotal_amount_and_teachercatalogues_posttaxitemshsttotal_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_in_RewardsCouponsPage_hst();
    }

    @Then("^StudentClub PostTax,Items,HST,Total amount displays correctly$")
    public void studentclub_posttaxitemshsttotal_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Validation_of_Student_club_Total_in_RewardsCouponsPage_hst();
    }

    @Then("^Teacher catalogues PostTax,Items,HST,Total amount displays correctly$")
    public void teacher_catalogues_posttaxitemshsttotal_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Validation_of_Teacher_catalogues_Total_in_RewardsCouponsPage_hst();
    }

    @Then("^StudentClub PostTax,Items,GST,Total amount displays correctly$")
    public void studentclub_posttaxitemsgsttotal_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Validation_of_Student_club_Total_in_RewardsCouponsPage_gst();
    }

    @Then("^Teacher catalogues PostTax,Items,GST,Total amount displays correctly$")
    public void teacher_catalogues_posttaxitemsgsttotal_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Validation_of_Teacher_catalogues_Total_in_RewardsCouponsPage_gst();
    }

    @Then("^StudentClub PostTax,Items,GST,HST,Total amount and TeacherCatalogues PostTax,Items,GST,HST,Total amount displays correctly$")
    public void studentclub_posttaxitemsgsthsttotal_amount_and_teachercatalogues_posttaxitemsgsthsttotal_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_in_RewardsCouponsPage_gst_hst();
    }

    @Then("^StudentClub PostTax,Items,GST,Total amount and TeacherCatalogues PostTax,Items,GST,Total amount displays correctly$")
    public void studentclub_posttaxitemsgsttotal_amount_and_teachercatalogues_posttaxitemsgsttotal_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_in_RewardsCouponsPage_gst();
    }

    @When("^teacher edits the Student Bonus Bank and paper coupons$")
    public void teacher_edits_the_student_bonus_bank_and_paper_coupons() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.edit_of_Student_Bonus_Bank_and_paper_coupons();
    }

    @And("^teacher edits the teacher Bonus Bank and paper coupons$")
    public void teacher_edits_the_teacher_bonus_bank_and_paper_coupons() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.edit_of_Teacher_Bonus_Bank_and_paper_coupons();
    }

    @Then("^Updated StudentClub PostTax,Items,GST,PST,Total amount and TeacherCatalogues PostTax,Items,GST,PST,Total amount displays correctly$")
    public void updated_studentclub_posttaxitemsgstpsttotal_amount_and_teachercatalogues_posttaxitemsgstpsttotal_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Validation_of_updated_Student_club_And_Teacher_Catalogues_Total_in_RewardsCouponsPage();
    }

    @Then("^Main message – \\[Rewards Earned with Today’s Qualifying Order of\\] displays in rewards section$")
    public void main_message_rewards_earned_with_todays_qualifying_order_of_displays_in_rewards_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validation_of_Rewards_earned_amount_message_CouponsRewardsPage();
    }

    @And("^user clicks on link \"([^\"]*)\"$")
    public void user_clicks_on_link_something(String strArg1) throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clicks_on_How_is_my_qualifying_order_tot_cal();
    }

    @Then("^pop up displays with message “Your Qualifying Order Total is the pre\\-tax value of all your Student Club items \\(anything you have purchased from the monthly teacher pages and student flyers\\), less any Bonus Coupons or Credit Notes redeemed\\.”$")
    public void pop_up_displays_with_message_your_qualifying_order_total_is_the_pretax_value_of_all_your_student_club_items_anything_you_have_purchased_from_the_monthly_teacher_pages_and_student_flyers_less_any_bonus_coupons_or_credit_notes_redeemed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_explanation_of_qualifying_order_Total();
    }

    @And("^Sub message – Submit by \\[Last date of current calendar month\\] to receive \\[Insert calendar month\\] rewards displays in rewards section$")
    public void submessage_submit_by_last_date_of_current_calendar_month_to_receive_insert_calendar_month_rewards_displays_in_rewards_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validation_of_Submit_order_date_CouponsRewardsPage();
    }

    @Then("^StudentClub PostTax,Items,BonusBank Redemption,PaperBonusCoupon and POP displays correctly$")
    public void studentclub_posttaxitemsbonusbank_redemptionpaperbonuscoupon_and_pop_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validation_of_Student_club_PostAmt_items_redemption_pop();
    }

    @And("^TeacherCatalogues PostTax,Items,BonusBank Redemption and PaperBonusCoupon displays correctly$")
    public void teachercatalogues_posttaxitemsbonusbank_redemption_and_paperbonuscoupon_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validation_of_Teacher_catalogues_PostAmt_items_redemption_pop();
    }

    @And("^Student and Teacher clubs Total owing amount displays correctly$")
    public void student_and_teacher_clubs_total_owing_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validation_of_Student_and_Teacher_catalogues_Total_owing_amount();
    }

    @Then("^Teacher sees Free item information in Payments page Coupons section$")
    public void teacher_sees_free_item_information_in_payments_page_coupons_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_FreeItem_section_displayed_in_Payment_and_OrderRef_page();
    }

    @Then("^Teacher sees Free item information in Order reference page Coupons section$")
    public void teacher_sees_free_item_information_in_order_reference_page_coupons_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_FreeItem_section_displayed_in_Payment_and_OrderRef_page();
    }

    @And("^Student club Total owing amount displays correctly$")
    public void student_club_total_owing_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validation_of_StudentClub_Total_owing_amount_Payment_Page();
    }

    @And("^Teacher Catalogues Total owing amount displays correctly$")
    public void teacher_catalogues_total_owing_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validation_of_TeacherCatalogues_Total_owing_amount_Payment_Page();
    }

    // SEARCH RELATED STUFF


    @And("^teacher have entered search query in the search field which has more than 15 results$")
    public void teacher_have_entered_search_query_in_the_search_field_which_has_more_than_15_results() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.GlobalSearch(
                TestBaseProvider.getTestBase().getTestData().getString("itemName"));
    }


    @And("^teacher have entered search query with less than 15 results$")
    public void teacher_have_entered_search_query_with_less_than_15_results() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.GlobalSearch(
                TestBaseProvider.getTestBase().getTestData().getString("itemName"));
    }


    @When("^search results are presented with results set greater than the default 15 items and View All link$")
    public void search_results_are_presented_with_results_set_greater_than_the_default_15_items_and_view_all_link() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.ResultsGreater_ViewAllLink(
                TestBaseProvider.getTestBase().getTestData().getInt("prodcount"));
    }


    @When("^search results are presented with results set less than the default 15 items$")
    public void search_results_are_presented_with_results_set_less_than_the_default_15_items() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.ResultsLesser_ViewAllLink(
                TestBaseProvider.getTestBase().getTestData().getInt("prodcount"));
    }


    @And("^teacher clicks on View All link$")
    public void teacher_clicks_on_view_all_link() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.ClickViewAllLink();
    }


    @Then("^all the search results displays as teacher scrolls through the page$")
    public void all_the_search_results_displays_as_teacher_scrolls_through_the_page() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.CheckProductCountAfterClickViewAll();
    }


    @Then("^View All link does not display$")
    public void view_all_link_does_not_display() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.verifyViewAllLinkNotPresent();
    }


    @Then("^Student Clubs Amount Owing becomes\\$0$")
    public void student_clubs_amount_owing_becomes_0() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.check_StudentClubTotalToZero();
    }


    @Then("^Teacher Clubs Amount Owing becomes\\$0$")
    public void teacher_clubs_amount_owing_becomes0() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.check_TeacherClubTotalToZero();
    }

    @Then("^Shipping & Handling Amount owing is 0$")
    public void shipping_handling_amount_owing_is_0() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.check_ShippingTotalToZero();
    }

    @And("^teacher can proceed to checkout$")
    public void teacher_can_proceed_to_checkout() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_can_Proceed_To_checkout();
    }


    @Then("^payments dropdown is disabled$")
    public void payments_dropdown_is_disabled() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_check_Payment_disabled_checkout();
    }

    @And("^teacher can submit order without selecting payment method$")
    public void teacher_can_submit_order_without_selecting_payment_method() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_checkout_without_payment();
    }


    @When("^teacher navigates to Payment page$")
    public void teacher_navigates_to_payment_page() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_can_Proceed_To_paymentpage();
    }

    @And("^teacher navigates to Payment page from Review Cart page$")
    public void teacher_navigates_to_payment_page_from_review_cart_page() throws Throwable {
        studflyerpage.navigate_from_reviewcartpage_to_paymentpage();
    }

    @And("^teacher selects Combination of CC and Checks with Saved Visa card as payment$")
    public void teacher_selects_combination_of_cc_and_checks_with_saved_visa_card_as_payment() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.payment_cc_and_savedcreditcard();
    }

    @And("^teacher selects saved visa card as payment$")
    public void teacher_selects_saved_visa_card_as_payment() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.payment_select_savedcreditcard();
    }

    @And("^teacher selects new master card as payment$")
    public void teacher_selects_new_master_card_as_payment() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
    }


    @Then("^No\\. of items and Total\\(Post tax & post Redemptions\\) in Student Catalogues displays$")
    public void no_of_items_and_totalpost_tax_post_redemptions_in_student_catalogues_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_noofitems_studtotals_paymentpage();
    }


    @And("^No\\. of items and Total\\(Post tax & post Redemptions\\) in Teacher Catalogues displays$")
    public void no_of_items_and_totalpost_tax_post_redemptions_in_teacher_catalogues_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_noofitems_teachertotals_paymentpage();
    }


    @And("^Total\\(Post tax\\) displays in Shipping & Handling header$")
    public void totalpost_tax_displays_in_shipping_handling_header() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate__shippingtotals_paymentpage();
    }


    @And("^Shipping & Handling Total\\(Post tax & post Redemptions\\) displays$")
    public void shipping_handling_totalpost_tax_post_redemptions_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate__shippingtotals_paymentpage();
    }


    @And("^StudentClubsTotal\\(post Redemptions\\) displays$")
    public void studentclubstotalpost_redemptions_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_studtotals_paymentpage();
    }


    @And("^TeacherCatalogues Total\\(Post tax & post Redemptions\\) displays$")
    public void teachercatalogues_totalpost_tax_post_redemptions_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_teachertotals_paymentpage();
    }

    @And("^Total Amount Due displays Student Club total \\+ TeacherCatalogues Total \\+ Shipping Total$")
    public void total_amount_due_displays_student_club_total_teachercatalogues_total_shipping_total() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_totalamtowing_paymentpage();
    }


    @And("^Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Student Catalogues displays$")
    public void bonus_bank_redemptions_and_paper_bonus_coupon_redemptions_in_student_catalogues_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_bonusbank_paperbonuscoupon_student_paymentpage();
    }


    @And("^Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Teacher Catalogues displays$")
    public void bonus_bank_redemptions_and_paper_bonus_coupon_redemptions_in_teacher_catalogues_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_bonusbank_paperbonuscoupon_teacher_paymentpage();
    }


    @And("^Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays$")
    public void bonus_bank_redemptions_and_paper_bonus_coupon_redemptions_in_shipping_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_bonusbank_paperbonuscoupon_shipping_paymentpage();
    }


    @Then("^“Bonus bank and paper redemption total must be less then or equal to subtotal″ message displays$")
    public void bonus_bank_and_paper_redemption_total_must_be_less_then_or_equal_to_subtotal_message_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.bonusbank_error_msg();
    }


    @Then("^“Bonus bank totals must be less then or equal to bonus bank available″ message displays$")
    public void bonus_bank_totals_must_be_less_then_or_equal_to_bonus_bank_available_message_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.bonusbankAmount_error_msg();
    }


    @When("^teacher enters amount greater than the \\[ShippingFee\\] in shipping Bonus Bank$")
    public void teacher_enters_amount_greater_than_the_shippingfee_in_teacher_bonus_bank() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_shipping_Bonus_Bank_Greater_Than_ShippingFee_Amount();
    }


    @When("^teacher enters amount greater than the \\[ShippingFee\\] in shipping Paper Bonus Coupon$")
    public void teacher_enters_amount_greater_than_the_shippingfee_in_shipping_paper_bonus_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_shipping_Paper_Bonus_Coupon_Greater_Than_ShippingFee_Amount();
    }

    @When("^teacher enters amount greater than the \\[ShippingFee\\] in shipping Bonus Bank and Paper Bonus Coupon$")
    public void teacher_enters_amount_greater_than_the_shippingfee_in_shipping_bonus_bank_and_paper_bonus_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_shipping_Bonus_Bank_Paper_Bonus_Coupon_Greater_Than_ShippingFee_Amount();
    }


    @Then("^“Rewards Earned with Today's Qualifying Order Value of” displays in Rewards section$")
    public void rewards_earned_with_todays_qualifying_order_value_of_displays_in_rewards_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        PauseUtil.pause(8000);
        checkoutPage.verifyRewardsText1_CouponsAndRewardsPage();
    }

    @And("^“How is my Qualifying Order Value calculated” displays in Rewards section$")
    public void how_is_my_qualifying_order_value_calculated_displays_in_rewards_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        PauseUtil.pause(8000);
        checkoutPage.verifyRewardsText2_CouponsAndRewardsPage();
    }


    @And("^“Your Qualifying Order Value” should contain in Rewards section$")
    public void your_qualifying_order_value_should_contain_in_rewards_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        PauseUtil.pause(8000);
        checkoutPage.verifyRewardsText3_CouponsAndRewardsPage();
    }

    @And("^teacher enters amount in student Bonus Bank and Paper coupons and click on Apply button$")
    public void teacher_enters_amount_in_student_bonus_bank_and_paper_coupons_and_click_on_apply_button() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Bonus_Bank_Paper_Bank();
    }


    @And("^teacher enters amount in teacher Bonus Bank and Paper coupons and click on Apply button$")
    public void teacher_enters_amount_in_teacher_bonus_bank_and_paper_coupons_and_click_on_apply_button() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Bonus_Bank_Paper_Bank();
    }


    @And("^teacher enters amount in shipping Bonus Bank and Paper coupons and click on Apply button$")
    public void teacher_enters_amount_in_shipping_bonus_bank_and_paper_coupons_and_click_on_apply_button() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_shipping_Bonus_Bank_Paper_Bonus_Coupon();
    }

    // implementation for InSprint_11.3 - soma

    @Then("^No\\. of items and Total\\(post tax & post Redemptions\\)in Student Clubs displays in the blue header$")
    public void no_of_items_and_totalpost_tax_post_redemptionsin_student_clubs_displays_in_the_blue_header() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_noofitems_studtotals_paymentpage();
    }


    @And("^Student club subtotal which is the pre tax, pre redemptions amount displays correctly$")
    public void student_club_subtotal_which_is_the_pre_tax_pre_redemptions_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_student_subtotal_paymentpage();
    }

    @And("^tax rates for Student Catalogues GST & PST display correctly$")
    public void tax_rates_for_student_catalogues_gst_pst_display_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_Student_GST_PST_paymentpage();
    }

    @And("^tax rates for Student Catalogues GST & QST display correctly$")
    public void tax_rates_for_student_catalogues_gst_qst_display_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_Student_GST_QST_paymentpage();
    }

    @And("^tax rates for Student Catalogues GST display correctly$")
    public void tax_rates_for_student_catalogues_gst_display_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_Student_GST_paymentpage();
    }

    @And("^tax rates for Student Catalogues HST display correctly$")
    public void tax_rates_for_student_catalogues_hst_display_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_Student_HST_paymentpage();
    }

    @And("^Bonus Bank Redemptions, Paper Bonus coupon Redemptions and POPs in Student Clubs displays$")
    public void bonus_bank_redemptions_paper_bonus_coupon_redemptions_and_pops_in_student_clubs_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_bonusbank_paperbonuscoupon_student_paymentpage();
    }

    @And("^StudentClubsAmountOwing\\(post tax & redemptions\\) displays correctly$")
    public void studentclubsamountowingpost_tax_redemptions_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_studtotals_paymentpage();
    }

    @And("^No\\. of items and Total\\(post tax\\)in Teacher Catalogues displays$")
    public void no_of_items_and_totalpost_taxin_teacher_catalogues_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_noofitems_teachertotals_paymentpage();
    }

    @And("^Shipping subtotal which is the pre tax, pre redemptions amount displays correctly$")
    public void shipping_subtotal_which_is_the_pre_tax_pre_redemptions_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_shipping_subtotal_paymentpage();
    }

    @And("^tax rates for Shipping GST & PST display correctly$")
    public void tax_rates_for_shiping_gst_pst_display_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_Shipping_GST_PST_paymentpage();
    }

    @And("^tax rates for Shipping GST & QST display correctly$")
    public void tax_rates_for_shipping_gst_qst_display_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_Shipping_GST_QST_paymentpage();
    }

    @And("^tax rates for Shipping GST display correctly$")
    public void tax_rates_for_shipping_gst_display_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_Shipping_GST_paymentpage();
    }

    @And("^tax rates for Shipping HST display correctly$")
    public void tax_rates_for_shipping_hst_display_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_Shipping_HST_paymentpage();
    }

    @And("^Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Shipping displays correctly$")
    public void bonus_bank_redemptions_and_paper_bonus_coupon_redemptions_in_shipping_displays_corectly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_bonusbank_paperbonuscoupon_shipping_paymentpage();
    }

    @And("^ShippingAmountOwing\\(post tax & redemptions\\) displays correctly$")
    public void shippingamountowingpost_tax_redemptions_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_shippingtotals_paymentpage();
    }

    @And("^Total Amount Owing displays Student Club total \\+ TeacherCatalogues Total \\+ Shipping Total$")
    public void total_amount_owing_displays_student_club_total_teachercatalogues_total_shipping_total() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_totalamtowing_paymentpage();
    }

    @And("^teacher enters amount in shipping Bonus Bank$")
    public void teacher_enters_amount_in_shipping_bonus_bank() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_shipping_Bonus_Bank();
    }


    @And("^teacher enters amount in shipping Paper coupons$")
    public void teacher_enters_amount_in_shipping_paper_coupons() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_shipping_Paper_Bank();
    }

    @And("^teacher clicks on Apply in Shipping section$")
    public void teacher_clicks_on_apply_in_shipping_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.click_on_Apply_in_Shipping_section();
    }

    @And("^Teacher catalogue subtotal which is the pre tax, pre redemptions amount displays correctly$")
    public void teacher_catalogue_subtotal_which_is_the_pre_tax_pre_redemptions_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_teacher_subtotal_paymentpage();
    }

    @And("^tax rates for Teacher Catalogues GST & PST display correctly$")
    public void tax_rates_for_teacher_catalogues_gst_pst_display_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_Teacher_GST_PST_paymentpage();
    }

    @And("^tax rates for Teacher Catalogues GST & QST display correctly$")
    public void tax_rates_for_teacher_catalogues_gst_qst_display_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_Teacher_GST_QST_paymentpage();
    }

    @And("^tax rates for Teacher Catalogues GST display correctly$")
    public void tax_rates_for_teacher_catalogues_gst_display_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_Teacher_GST_paymentpage();
    }

    @And("^tax rates for Teacher Catalogues HST display correctly$")
    public void tax_rates_for_teacher_catalogues_hst_display_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_Teacher_HST_paymentpage();
    }

    @And("^Bonus Bank Redemptions and Paper Bonus coupon Redemptions in Teacher Catalogues displays correctly$")
    public void bonus_bank_redemptions_and_paper_bonus_coupon_redemptions_in_teacher_catalogues_displays_corectly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_bonusbank_paperbonuscoupon_teacher_paymentpage();
    }

    @And("^TeacherCataloguesAmountOwing\\(post tax & redemptions\\) displays correctly$")
    public void teachercataloguesamountowingpost_tax_redemptions_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_validate_teachertotals_paymentpage();
    }

    @Then("^Shipping & Handling displays FREE! in blue header$")
    public void shipping_handling_displays_free_in_blue_header() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();

        checkoutPage.verifyFreeShippingCharge_Paymentpage(TestBaseProvider.getTestBase()
                .getTestData().getString("shippingCharge").trim());
    }


    @And("^the redemptions section does not display, only the blue header displays for shipping$")
    public void the_redemptions_section_does_not_display_only_the_blue_header_displays_for_shipping() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verifytaxlinesize_paymentpage();
    }


    @Then("^teacher should see Early Childhood, Kindergarten & Grade 1, Grades 2 & 3, Grades 4 & 5, Grades 6 & 7 and French options$")
    public void teacher_should_see_early_childhood_kindergarten_grade_1_grades_2_3_grades_4_5_grades_6_7_and_french_options() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.MakeSelectionWindow_verifyStudentFlyersInDropDownGradeLevel();
    }


    @Then("^teacher should land on Coupons and Rewards page$")
    public void teacher_should_land_on_coupons_and_rewards_page() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        checkoutPage.verifyRewardsAndCouponsPage();
    }


    @Then("^only \\[Grade1 Callout Message\\] is displayed in the REWARDS section$")
    public void only_book1_is_displayed_in_the_rewards_section() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.verify_Grade1_CallOutMsg_rewardsection_english();
    }

    @Then("^only \\[Grade3 Callout Message\\] is displayed in the REWARDS section$")
    public void only_grade3_callout_message_is_displayed_in_the_rewards_section() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.verify_Grade3_CallOutMsg_rewardsection_english();
    }

    @Then("^only \\[Grade5 Callout Message\\] is displayed in the REWARDS section$")
    public void only_grade5_callout_message_is_displayed_in_the_rewards_section() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.verify_Grade5_CallOutMsg_rewardsection_english();
    }

    @Then("^only \\[No Grade Student Incentive Callout Message\\] is displayed in the REWARDS section$")
    public void only_no_grade_student_incentive_callout_message_is_displayed_in_the_rewards_section() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.verify_NoGrade_StudentIncentive_CallOutMsg_rewardsection_english();
    }

    @Then("^only \\[No Grade, No Language Student Incentive Callout Message\\] is displayed in the REWARDS section$")
    public void only_no_grade_no_language_student_incentive_callout_message_is_displayed_in_the_rewards_section() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.verify_NoGrade_NoLanguage_StudentIncentive_CallOutMsg_rewardsection_english();
    }


    @Then("^only \\[Grade7 Callout Message\\] is displayed in the REWARDS section$")
    public void only_grade7_callout_message_is_displayed_in_the_rewards_section() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.verify_Grade7_CallOutMsg_rewardsection_english();
    }

    @Then("^only \\[Grade9 Callout Message\\] is displayed in the REWARDS section$")
    public void only_grade9_callout_message_is_displayed_in_the_rewards_section() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.verify_Grade9_CallOutMsg_rewardsection_english();
    }


    @Then("^only \\[Grade11 Callout Message\\] is displayed in the REWARDS section$")
    public void only_grade11_callout_message_is_displayed_in_the_rewards_section() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.verify_Grade11_CallOutMsg_rewardsection_english();
    }


    @Then("^only \\[Grade1 French Callout Message\\] is displayed in the REWARDS section$")
    public void only_grade1_french_callout_message_is_displayed_in_the_rewards_section() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.verify_Grade1_CallOutMsg_rewardsection_french();
    }

    @Then("^only \\[Grade3 French Callout Message\\] is displayed in the REWARDS section$")
    public void only_grade3_french_callout_message_is_displayed_in_the_rewards_section() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.verify_Grade3_CallOutMsg_rewardsection_french();
    }

    @And("^teacher navigates to page2 in DTS model window$")
    public void teacher_navigates_to_page2_in_dts_model_window() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.click_dts_paginate2();
    }

    @When("^teacher searches for \\[Dr\\. Seuss: What Was I Scared Of\\?\\]$")
    public void teacher_searches_for_dr_seuss_what_was_i_scared_of() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();

        checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
                TestBaseProvider.getTestBase().getTestData());
    }


    @And("^teacher selects \\[Dr\\. Seuss: What Was I Scared Of\\?\\] from the results$")
    public void teacher_selects_dr_seuss_what_was_i_scared_of_from_the_results() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        PauseUtil.waitForAjaxToComplete(1500);
        checkoutPage.MakeSelectionWindow_SelectItemFreePick();
    }


    @When("^teacher navigates to payment page from YTO page$")
    public void teacher_navigates_to_payment_page_from_yto_page() throws Throwable {
        ICartPage cartpage = getFactory().getICartPage();
        cartpage.clickOn_btnReviewCart();
        cartpage.clickOn_ProceedToCheckoutBtn();
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_navigate_to_payment_page();
    }


    @Then("^“Check this box if your school cannot currently recieve deliveries and you would like to provide an alternative shipping address\\.” message should be seen$")
    public void check_this_box_if_your_school_cannot_currently_recieve_deliveries_and_you_would_like_to_provide_an_alternative_shipping_address_message_should_be_seen() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Label_Alternate_Shipping();
    }


    @And("^teacher selects alternative shipping option$")
    public void teacher_selects_alternative_shipping_option() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Select_Alternate_Shipping_Address_Checkbox();
    }

    @When("^teacher enter postal code as complete alphabets and tab out$")
    public void teacher_enter_postal_code_as_complete_alphabets_and_tab_out() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_enter_postalCode_Paymentpage_alternativeaddress();
    }

    @When("^teacher enter valid postal code as combination of lower case and upper case with space after 3 characters along with other required information$")
    public void teacher_enter_valid_postal_code_as_combination_of_lower_case_and_upper_case_with_space_after_3_characters_along_with_other_required_information() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_enter_postalCode_Paymentpage_alternativeaddress_otherDetails();
    }

    @When("^teacher enters incorrect postal code along with other required information$")
    public void teacher_enters_incorrect_postal_code_along_with_other_required_information() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_enter_postalCode_Paymentpage_alternativeaddress_otherDetails();
    }

    @When("^teacher enter valid postal code as lower case with space after 3 characters along with other required information$")
    public void teacher_enter_valid_postal_code_as_lower_case_with_space_after_3_characters_along_with_other_required_information() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_enter_postalCode_Paymentpage_alternativeaddress_otherDetails();
    }

    @When("^teacher enter valid postal code as combination of lower case and upper case without space along with other required information$")
    public void teacher_enter_valid_postal_code_as_combination_of_lower_case_and_upper_case_without_space_along_with_other_required_information() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_enter_postalCode_Paymentpage_alternativeaddress_otherDetails();
    }

    @When("^teacher enter valid postal code as lower case without space along with other required information$")
    public void teacher_enter_valid_postal_code_as_lower_case_without_space_along_with_other_required_information() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_enter_postalCode_Paymentpage_alternativeaddress_otherDetails();
    }

    @When("^teacher enter postal code with 7 characters with no space and tab out$")
    public void teacher_enter_postal_code_with_7_characters_with_no_space_and_tab_out() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_enter_postalCode_Paymentpage_alternativeaddress();
    }


    @And("^teacher corrects the postal code with correct one$")
    public void teacher_corrects_the_postal_code_with_correct_one() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_enter_correctpostalcode_paymentpage_alternativeaddress();
    }

    @When("^teacher enter postal code with less than 6 characters and tab out$")
    public void teacher_enter_postal_code_with_less_than_6_characters_and_tab_out() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_enter_postalCode_Paymentpage_alternativeaddress();
    }


    @When("^teacher enter postal code as complete numbers and tab out$")
    public void teacher_enter_postal_code_as_complete_numbers_and_tab_out() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_enter_postalCode_Paymentpage_alternativeaddress();
    }

    @When("^teacher enter incorrect postal code and tab out$")
    public void teacher_enter_incorrect_postal_code_and_tab_out() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_enter_postalCode_Paymentpage_alternativeaddress();
    }

    @When("^teacher provides valid postal code for Nunavat province$")
    public void teacher_provides_valid_postal_code_for_nunavat_province() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.teacher_enter_postalCode_Paymentpage_alternativeaddress();
    }

    @Then("^“Please enter a valid postal code\\.” should display$")
    public void please_enter_a_valid_postal_code_should_display() throws Throwable {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        rewardsAndCoupons.Verify_validationMsg_InvalidPostalcode();
    }

    @Then("^postal code field is displayed in gray with place holder as “E\\.G\\. M5V 1E1”$")
    public void postal_code_field_is_displayed_in_gray_with_place_holder_as_eg_m5v_1e1() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_placeholder_postalcode(TestBaseProvider.getTestBase().getTestData());
    }


    @Then("^postal code field is auto\\-formatted to correct format$")
    public void postal_code_field_is_autoformatted_to_correct_format() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_autoformatted_postalcode(TestBaseProvider.getTestBase().getTestData());
    }


    @Then("^correct provice should populate in province field$")
    public void correct_provice_should_populate_in_province_field() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validate_province_alternativeshipping(TestBaseProvider.getTestBase().getTestData());
    }

    @And("^province field is in read only mode$")
    public void province_field_is_in_read_only_mode() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validate_provincefield_readonly();
    }

    @Then("^order is succefully submitted and teacher sees correct item numbers in confirmation page$")
    public void order_is_succefully_submitted_and_teacher_sees_correct_item_numbers_in_confirmation_page() throws Throwable {
        ProductDetailPage pdppage = new ProductDetailPage();
        pdppage.verify_confirmSubmitpage_product_uniqueitemid();
    }

    @And("^teacher see the items selected from Dollars to spend with unique item id in Rewards Section on Confirmation page$")
    public void teacher_see_the_items_selected_from_dollars_to_spend_with_unique_item_id_in_rewards_section_on_confirmation_page() throws Throwable {
        System.out.println("passed");
    }

    @And("^Free pick is displayed in coupons section with unique item id in Confirmation page$")
    public void free_pick_is_displayed_in_coupons_section_with_unique_item_id_in_confirmation_page() throws Throwable {
        System.out.println("passed");
    }

    @Then("^TeacherCatalogues PostTax,Items,GST,PST,shipping charges and Total amount displays correctly$")
    public void teachercatalogues_posttaxitemsgstpstshipping_charges_and_total_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_Validation_of_Teacher_catalogues_GST_PST_ShippingChargers_Total_in_RewardsCouponsPage();
    }

    @Then("^Student Clubs PostTax,Items,GST,PST,shipping charges and Total amount displays correctly$")
    public void student_clubs_posttaxitemsgstpstshipping_charges_and_total_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_Validation_of_Student_Clubs_GST_PST_ShippingChargers_Total_in_RewardsCouponsPage();
    }

    @Then("^Student and Teacher Catalogues PostTax,Items,GST,PST,shipping charges and Total amount displays correctly$")
    public void student_and_teacher_catalogues_posttaxitemsgstpstshipping_charges_and_total_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_Validation_of_Student_and_TeacherCatalogues_GST_PST_ShippingChargers_Total_in_RewardsCouponsPage();
    }

    @Then("^Student and Teacher Catalogues PostTax,Items,GST,QST,shipping charges and Total amount displays correctly$")
    public void student_and_teacher_catalogues_posttaxitemsgstqstshipping_charges_and_total_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_Validation_of_Student_and_TeacherCatalogues_GST_QST_ShippingChargers_Total_in_RewardsCouponsPage();
    }

    @Then("^Student and Teacher Catalogues PostTax,Items,HST,shipping charges and Total amount displays correctly$")
    public void student_and_teacher_catalogues_posttaxitemshstshipping_charges_and_total_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_Validation_of_Student_and_TeacherCatalogues_HST_ShippingChargers_Total_in_RewardsCouponsPage();
    }

    @Then("^Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly$")
    public void student_and_teacher_catalogues_posttaxitemsgstshipping_charges_and_total_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_Validation_of_Student_and_TeacherCatalogues_GST_ShippingChargers_Total_in_RewardsCouponsPage();
    }

    @Then("^Student Clubs PostTax,Items,GST,QST,shipping charges and Total amount displays correctly$")
    public void student_clubs_posttaxitemsgstqstshipping_charges_and_total_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_Validation_of_Student_Clubs_GST_QST_ShippingChargers_Total_in_RewardsCouponsPage();
    }

    @Then("^Student Clubs PostTax,Items,HST,shipping charges and Total amount displays correctly$")
    public void student_clubs_posttaxitemshstshipping_charges_and_total_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_Validation_of_Student_Clubs_HST_ShippingChargers_Total_in_RewardsCouponsPage();
    }

    @Then("^Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly$")
    public void student_clubs_posttaxitemsgstshipping_charges_and_total_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_Validation_of_Student_Clubs_GST_ShippingChargers_Total_in_RewardsCouponsPage();
    }

    @Then("^No tax displays and correct TeacherCatalogues PostTax,Items,GST,PST,shipping charges and Total amount displays$")
    public void no_tax_displays_and_correct_teachercatalogues_posttaxitemsgstpstshipping_charges_and_total_amount_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_Validation_of_noTaxes_for_Teacher_catalogues_GST_PST_ShippingChargers_Total_in_RewardsCouponsPage();
    }

    @Then("^No tax displays and correct Student Clubs PostTax,Items,GST,PST,shipping charges and Total amount displays$")
    public void no_tax_displays_and_correct_student_clubs_posttaxitemsgstpstshipping_charges_and_total_amount_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_Validation_of_noTaxes_for_Student_Clubs_GST_PST_ShippingChargers_Total_in_RewardsCouponsPage();
    }

    @Then("^No tax displays and correct Student and Teacher Catalogues PostTax,Items,GST,PST,shipping charges and Total amount displays$")
    public void no_tax_displays_and_correct_student_and_teacher_catalogues_posttaxitemsgstpstshipping_charges_and_total_amount_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_Validation_of_noTaxes_for_Student_and_TeacherCatalogues_GST_PST_ShippingChargers_Total_in_RewardsCouponsPage();
    }

    @Then("^No tax displays and correct Student and Teacher Catalogues PostTax,Items,GST,QST,shipping charges and Total amount displays$")
    public void no_tax_displays_and_correct_student_and_teacher_catalogues_posttaxitemsgstqstshipping_charges_and_total_amount_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_Validation_of_noTaxes_for_Student_and_TeacherCatalogues_GST_QST_ShippingChargers_Total_in_RewardsCouponsPage();
    }

    @Then("^No tax displays and correct Student Clubs PostTax,Items,GST,QST,shipping charges and Total amount displays$")
    public void no_tax_displays_and_correct_student_clubs_posttaxitemsgstqstshipping_charges_and_total_amount_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_Validation_of_noTaxes_for_Student_Clubs_GST_QST_ShippingChargers_Total_in_RewardsCouponsPage();
    }

    @Then("^No tax displays and correct TeacherCatalogues PostTax,Items,GST,QST,shipping charges and Total amount displays$")
    public void no_tax_displays_and_correct_teachercatalogues_posttaxitemsgstqstshipping_charges_and_total_amount_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_Validation_of_noTaxes_for_Teacher_catalogues_GST_QST_ShippingChargers_Total_in_RewardsCouponsPage();
    }

    @Then("^TeacherCatalogues PostTax,Items,GST,QST,shipping charges and Total amount displays correctly$")
    public void teachercatalogues_posttaxitemsgstqstshipping_charges_and_total_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_Validation_of_Teacher_catalogues_GST_QST_ShippingChargers_Total_in_RewardsCouponsPage();
    }

    @Then("^TeacherCatalogues PostTax,Items,HST,shipping charges and Total amount displays correctly$")
    public void teachercatalogues_posttaxitemshstshipping_charges_and_total_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_Validation_of_Teacher_catalogues_HST_ShippingChargers_Total_in_RewardsCouponsPage();
    }

    @Then("^TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly$")
    public void teachercatalogues_posttaxitemsgstshipping_charges_and_total_amount_displays_correctly() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_Validation_of_Teacher_catalogues_GST_ShippingChargers_Total_in_RewardsCouponsPage();
    }

    @Then("^Student Clubs section should be displayed$")
    public void student_clubs_section_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_validate_StudentClubs_section_displayed_in_RewardsCouponsPage();
    }

    @Then("^Shipping and Handing section should be displayed$")
    public void shipping_and_handing_section_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_validate_ShippingHandling_section_displayed_in_RewardsCouponsPage();
    }

    @Then("^Student Clubs section should not be displayed$")
    public void student_clubs_section_should_not_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_validate_StudentClubs_section_is_not_displayed_in_RewardsCouponsPage();
    }

    @Then("^Toggle button should be displayed in Student Clubs header section$")
    public void toggle_button_should_be_displayed_in_student_clubs_header_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_validate_Toggle_btn_displayed_for_StudentClubs_section_in_RewardsCouponsPage();
    }

    @And("^header label should be displayed as 'STUDENT CLUBS'$")
    public void header_label_should_be_displayed_as_student_clubs() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_validate_hdr_label_for_StudentClubs_section_in_RewardsCouponsPage();
    }

    @And("^Student Clubs items price and the summary should be displayed$")
    public void student_clubs_items_price_and_the_summary_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_StudentClubs_ItemsPrice_Qty_displayed_in_BlueHdr_RewardsCouponsPage();
    }

    @Then("^Toggle button should be displayed in Shipping and handling header section$")
    public void toggle_button_should_be_displayed_in_shipping_and_handling_header_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_validate_Toggle_btn_displayed_for_ShippingHandling_section_in_RewardsCouponsPage();
    }

    @And("^'Shipping & Handling' header label should be displayed$")
    public void shipping_handling_header_label_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_validate_hdr_label_for_ShippingHandling_section_in_RewardsCouponsPage();
    }

    @And("^Shipping price field should be displayed$")
    public void shipping_price_field_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_ShippingHandling_charge_displayed_in_BlueHdr_RewardsCouponsPage();
    }

    @Then("^Student Clubs section should be expanded$")
    public void student_clubs_section_should_be_expanded() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_StudentClubs_section_expanded_RewardsCouponsPage();
    }

    @Then("^Shipping and Handling section should be expanded$")
    public void shipping_and_handling_section_should_be_expanded() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_ShippingHandling_section_expanded_RewardsCouponsPage();
    }

    @Then("^the label minus should be displayed in Student Clubs header section$")
    public void the_label_minus_should_be_displayed_in_student_clubs_header_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_StudentClubs_section_Toggle_btn_displayed_as_Minus_RewardsCouponsPage();
    }

    @Then("^the label minus should be displayed in Shipping and Handling header section$")
    public void the_label_minus_should_be_displayed_in_shipping_and_handling_header_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_ShippingHandling_section_Toggle_btn_displayed_as_Minus_RewardsCouponsPage();
    }

    @When("^CSR clicks on expanded Student Clubs toggle button$")
    public void csr_clicks_on_expanded_student_clubs_toggle_button() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_clicks_on_StudentClubs_section_Toggle_btn_RewardsCouponsPage();
    }

    @Then("^the label plus should be displayed in Student Clubs header section$")
    public void the_label_plus_should_be_displayed_in_student_clubs_header_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_StudentClubs_section_Toggle_btn_displayed_as_Plus_RewardsCouponsPage();
    }

    @When("^CSR clicks on expanded Shipping and Handling toggle button$")
    public void csr_clicks_on_expanded_shipping_and_handling_toggle_button() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_clicks_on_ShippingHandling_section_Toggle_btn_RewardsCouponsPage();
    }

    @Then("^the label plus should be displayed in Shipping and Handling header section$")
    public void the_label_plus_should_be_displayed_in_shipping_and_handling_header_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_ShippingHandling_section_Toggle_btn_displayed_as_Plus_RewardsCouponsPage();
    }

    @Then("^the label 'Student Clubs Subtotal' should be displayed in the 2nd layer of the section$")
    public void the_label_student_clubs_subtotal_should_be_displayed_in_the_2nd_layer_of_the_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_SubTot_StudentClubs_label_in_RewardsCouponsPage();
    }

    @And("^the tax module section and correct tax should be displayed for the Students Clubs items$")
    public void the_tax_module_section_and_correct_tax_should_be_displayed_for_the_students_clubs_items() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_Tax_module_section_displayed_for_StudentClubs_section_in_RewardsCouponsPage();
    }

    @Then("^the label 'Shipping & Handling' should be displayed in the 2nd layer of the section$")
    public void the_label_shipping_handling_should_be_displayed_in_the_2nd_layer_of_the_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_ShippingHandling_label_in_RewardsCouponsPage();
    }

    @And("^the tax module section and correct tax should be displayed$")
    public void the_tax_module_section_and_correct_tax_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_Tax_module_section_displayed_for_ShippingHandling_section_in_RewardsCouponsPage();
    }

    @Then("^the label 'REDEEM BONUS COUPONS & CREDIT NOTES' should be displayed in the 3rd layer of the Student Clubs section$")
    public void the_label_redeem_bonus_coupons_credit_notes_should_be_displayed_in_the_3rd_layer_of_the_student_clubs_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_label_REDEEM_BONUS_COUPONS_and_CREDIT_NOTES_in_StudentClubs_section_in_RewardsCouponsPage();
    }

    @Then("^the label 'Bonus Bank' should be displayed in the 4th layer of the Student Clubs section$")
    public void the_label_bonus_bank_should_be_displayed_in_the_4th_layer_of_the_student_clubs_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_label_BonusBank_in_StudentClubs_section_in_RewardsCouponsPage();
    }

    @And("^paragraph of text reflective of the label section should be displayed in the 4th layer of the Student Clubs section$")
    public void paragraph_of_text_reflective_of_the_label_section_should_be_displayed_in_the_4th_layer_of_the_student_clubs_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_paragraph_is_displayed_for_BonusBank_fld_in_StudentClubs_section_in_RewardsCouponsPage();
    }

    @Then("^\\[Bonus Bank\\] text box should be displayed with the label '\\-\\$' in the 4th layer of the Student Clubs section$")
    public void bonus_bank_text_box_should_be_displayed_with_the_label_in_the_4th_layer_of_the_student_clubs_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_BonusBank_txtBox_and_dollar_label_displayed_in_StudentClubs_section_in_RewardsCouponsPage();
    }

    @Then("^\\[Paper Bonus Coupons And Credit Notes\\] text box should be displayed with the label '\\-\\$' in the 5th layer of the Student Clubs section$")
    public void paper_bonus_coupons_and_credit_notes_text_box_should_be_displayed_with_the_label_in_the_5th_layer_of_the_student_clubs_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_PaperBonus_txtBox_and_dollar_label_displayed_in_StudentClubs_section_in_RewardsCouponsPage();
    }

    @When("^CSR enters amount in Student Clubs Bonus Bank$")
    public void csr_enters_amount_in_student_clubs_bonus_bank() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Bonus_Bank();
    }

    @Then("^Student Clubs section Bonus Bank text box should accept the value$")
    public void student_clubs_section_bonus_bank_text_box_should_accept_the_value() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_validate_value_of_student_Bonus_Bank_Redemptions_Rewards_Page();
    }

    @When("^CSR enters amount in Shipping and Handling Bonus Bank$")
    public void csr_enters_amount_in_shipping_and_handling_bonus_bank() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_Shipping_Bonus_Bank();
    }

    @Then("^Shipping and Handling section Bonus Bank text box should accept the value$")
    public void shipping_and_handling_section_bonus_bank_text_box_should_accept_the_value() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_validate_value_of_Shipping_Bonus_Bank_Redemptions_Rewards_Page();
    }

    @When("^CSR enters amount in Shipping and Handling Paper Bonus$")
    public void csr_enters_amount_in_shipping_and_handling_paper_bonus() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_Shipping_Paper_Bonus();
    }

    @Then("^Shipping and Handling section Paper Bonus text box should accept the value$")
    public void shipping_and_handling_section_paper_bonus_text_box_should_accept_the_value() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_validate_value_of_Shipping_Paper_Bonus_Redemptions_Rewards_Page();
    }

    @When("^CSR enters amount in Student Clubs Paper Bonus$")
    public void csr_enters_amount_in_student_clubs_paper_bonus() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Paper_Bank();
    }

    @Then("^Student Clubs section Paper Bonus text box should accept the value$")
    public void student_clubs_section_paper_bonus_text_box_should_accept_the_value() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_validate_value_of_student_Paper_Bonus_Redemptions_Rewards_Page();
    }

    @Then("^the label 'Paper Bonus Coupons, And Credit Notes' should be displayed in the 5th layer of the Student Clubs section$")
    public void the_label_paper_bonus_coupons_and_credit_notes_should_be_displayed_in_the_5th_layer_of_the_student_clubs_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_label_PaperBonus_in_StudentClubs_section_in_RewardsCouponsPage();
    }

    @And("^paragraph of text reflective of the label section should be displayed in the 5th layer of the Student Clubs section$")
    public void paragraph_of_text_reflective_of_the_label_section_should_be_displayed_in_the_5th_layer_of_the_student_clubs_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_paragraph_is_displayed_for_PaperBonus_fld_in_StudentClubs_section_in_RewardsCouponsPage();
    }

    @Then("^the Apply button should be displayed with the label 'APPLY' in the 6th layer of the Student Clubs section$")
    public void the_apply_button_should_be_displayed_with_the_label_apply_in_the_6th_layer_of_the_student_clubs_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_label_APPLY_btn_in_StudentClubs_section_in_RewardsCouponsPage();
    }

    @Then("^the label 'Student Clubs Amount Owing' should be displayed in the footer layer of the Student Clubs section$")
    public void the_label_student_clubs_amount_owing_should_be_displayed_in_the_footer_layer_of_the_student_clubs_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_label_Student_Clubs_Amt_Owing_in_StudentClubs_section_in_RewardsCouponsPage();
    }

    @And("^Student Clubs Amount Owing field and Items field should be displayed in the footer layer of the Student Clubs section$")
    public void student_clubs_amount_owing_field_and_items_field_should_be_displayed_in_the_footer_layer_of_the_student_clubs_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_flds_Student_Clubs_AmtOwing_TotalItems_in_StudentClubs_section_in_RewardsCouponsPage();
    }

    @Then("^the header label 'REWARDS' should be displayed for the title of the Rewards module$")
    public void the_header_label_rewards_should_be_displayed_for_the_title_of_the_rewards_module() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_label_of_REWARDS_section_in_Redemptions_Rewards_Page();
    }

    @And("^the text 'Rewards Earned with Todays Qualifying Order Value of' should be displayed$")
    public void the_text_rewards_earned_with_todays_qualifying_order_value_of_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_label_of_Rewards_earned_Today_in_REWARDS_section_in_Redemptions_Rewards_Page();
    }

    @And("^the text 'How is my Qualifying Order Value calculated\\?' should be displayed$")
    public void the_text_how_is_my_qualifying_order_value_calculated_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_label_of_How_is_Qualifying_Order_in_REWARDS_section_in_Redemptions_Rewards_Page();
    }

    @Then("^Time and Date section should be displayed in Rewards module$")
    public void time_and_date_section_should_be_displayed_in_rewards_module() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_TimeDate_fld_displayed_in_REWARDS_section_in_Redemptions_Rewards_Page();
    }

    @Then("^the date and time should be displayed as e\\.g\\. 11\\/30, 11:59pm ET based on the date in a Time and Date section in Rewards module$")
    public void the_date_and_time_should_be_displayed_as_eg_1130_1159pm_et_based_on_the_date_in_a_time_and_date_section_in_rewards_module() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_TimeDate_text_in_REWARDS_section_in_Redemptions_Rewards_Page();
    }

    @Then("^Qualifying order value section should be displayed in Rewards module$")
    public void qualifying_order_value_section_should_be_displayed_in_rewards_module() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_fld_How_is_my_Qualifying_Order_value_displayed_in_REWARDS_section_in_Redemptions_Rewards_Page();
    }

    @Then("^correct qualifying order value should be displayed in Rewards section$")
    public void correct_qualifying_order_value_should_be_displayed_in_rewards_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_Qualifying_Amt_in_REWARDS_section_in_Redemptions_Rewards_Page();
    }

    @Then("^FreeItem promotion should be displayed$")
    public void freeitem_promotion_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_FreeItem_Promotion_displayed_in_Redemptions_Rewards_Page();
    }

    @Then("^CSR should see Free Teacher Kit promotion is displayed$")
    public void csr_should_see_free_teacher_kit_promotion_is_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_Free_TeacherKit_Promotion_displayed_in_Redemptions_Rewards_Page();
    }

    @Then("^CSR should see the FreeItem promotion label$")
    public void csr_should_see_the_freeitem_promotion_label() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_label_FreeItem_Promotion_in_Redemptions_Rewards_Page();
    }

    @Then("^FreeItem promotion should not be displayed$")
    public void freeitem_promotion_should_not_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_fld_FreeItem_Promotion_not_displayed_in_Redemptions_Rewards_Page();
    }


    @But("^CSR should not receive Free Teacher Kit promotion$")
    public void csr_should_not_receive_free_teacher_kit_promotion() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_fld_Free_TeacherKit_Promotion_not_displayed_in_Redemptions_Rewards_Page();
    }

    @Then("^the label should be displayed as 'FREE!' in Shipping and Handling header section$")
    public void the_label_should_be_displayed_as_free_in_shipping_and_handling_header_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_label_ShippingHandling_price_is_FREE_in_Redemptions_Rewards_Page();
    }

    @Then("^Student Incentive promotion should be displayed$")
    public void student_incentive_promotion_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_StudentIncentives_field_displayed_in_Redemptions_Rewards_Page();
    }

    @Then("^Student Incentive text box should be displayed$")
    public void student_incentive_text_box_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_StudentIncentives_textBox_field_displayed_in_Redemptions_Rewards_Page();
    }

    @When("^CSR enters numeric value in a Student Incentive text box$")
    public void csr_enters_numeric_value_in_a_student_incentive_text_box() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_enter_numOfStudents_StudentIncentives_textBox_in_Redemptions_Rewards_Page();
    }

    @Then("^the Student Incentive text box should be allowed the entered value$")
    public void the_student_incentive_text_box_should_be_allowed_the_entered_value() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_the_value_entered_in_StudentIncentives_textBox_in_Redemptions_Rewards_Page();
    }

    @When("^CSR enters other than numeric value in a Student Incentive text box$")
    public void csr_enters_other_than_numeric_value_in_a_student_incentive_text_box() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_enter_numOfStudents_StudentIncentives_textBox_in_Redemptions_Rewards_Page();
    }

    @Then("^the Student Incentive text box should not allow the entered value$")
    public void the_student_incentive_text_box_should_not_allow_the_entered_value() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_the_spcailChars_And_alphabets_values_in_StudentIncentives_textBox_in_Redemptions_Rewards_Page();
    }

    @When("^CSR enters number of students in a Student Incentive text box$")
    public void csr_enters_number_of_students_in_a_student_incentive_text_box() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_enter_numOfStudents_StudentIncentives_textBox_in_Redemptions_Rewards_Page();
    }

    @Then("^Exceeded students error message should not be displayed$")
    public void exceeded_students_error_message_should_not_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_PopUp_for_exceeded_students_not_displayed_for_StudentIncentives_in_Redemptions_Rewards_Page();
    }

    @And("^CSR clicks on \\[Continue Checkout\\] in \\[Redemptions & Rewards\\] page$")
    public void csr_clicks_on_continue_checkout_in_redemptions_rewards_page() throws Throwable {
        IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Rewards_page();
    }

    @Then("^Exceeded students error message should be displayed$")
    public void exceeded_students_error_message_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_PopUp_for_exceeded_students_displayed_for_StudentIncentives_in_Redemptions_Rewards_Page();
    }

    @Then("^DTS message section and MAKE SELECTION button should be displayed$")
    public void dts_message_section_and_make_selection_button_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_DTS_section_MakeSelection_fld_displayed_in_Redemptions_Rewards_Page();
    }

    @When("^CSR clicks on \\[MAKE SELECTION\\] button$")
    public void csr_clicks_on_make_selection_button() throws Throwable {
        ICheckoutPage iCheckoutPage = getFactory().getICheckoutPage();
        iCheckoutPage.CSR_clicks_on_MakeSelection_in_RedemptionsPage();
    }

    @Then("^DTS modal window should be displayed$")
    public void dts_modal_window_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_DTS_modal_window_displayed_in_Redemptions_Rewards_Page();
    }

    @Then("^value of the amount of DTS within the header should be shown correctly as per the Rewards section$")
    public void value_of_the_amount_of_dts_within_the_header_should_be_shown_correctly_as_per_the_rewards_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_DTS_amt_is_same_in_header_of_MakeSelection_modal_window_in_Redemptions_Rewards_Page();
    }

    @Then("^the close button should be displayed in the top right position of the modal window$")
    public void the_close_button_should_be_displayed_in_the_top_right_position_of_the_modal_window() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_close_btn_displayed_in_DTS_modal_window_in_Redemptions_Rewards_Page();
    }

    @When("^CSR clicks on close button in DTS modal window$")
    public void csr_clicks_on_close_button_in_dts_modal_window() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_clicks_on_close_btn_in_DTS_modal_window_in_Redemptions_Rewards_Page();
    }

    @And("^\\[Redemptions & Rewards\\] page should be displayed$")
    public void redemptions_rewards_page_should_be_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        //checkoutPage.CSR_verify_close_btn_displayed_in_DTS_modal_window_in_Redemptions_Rewards_Page();
    }

    @And("^CSR views Dollars to Spend promotion$")
    public void csr_views_dollars_to_spend_promotion() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_DTS_section_MakeSelection_fld_displayed_in_Redemptions_Rewards_Page();
    }

    @And("^CSR searches for a term$")
    public void csr_searches_for_a_term() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clicks_Search_fld_and_searches_an_item_in_MakeYourSelection_window();
    }

    @And("^CSR selects items such that the price of items selected is more than the coupon amount$")
    public void csr_selects_items_such_that_the_price_of_items_selected_is_more_than_the_coupon_amount() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Selects_multiple_items_from_Make_Selection_window();
    }

    @When("^CSR selects items such that the price of items selected is less than or equal to the coupon amount$")
    public void csr_selects_items_such_that_the_price_of_items_selected_is_less_than_or_equal_to_the_coupon_amount() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Selects_an_item_from_Make_Selection_window();
    }

    @When("^CSR deletes the items by clicking on X from current selection section such that the price of items selected is less than top\\-off amount$")
    public void csr_deletes_the_items_by_clicking_on_x_from_current_selection_section_such_that_the_price_of_items_selected_is_less_than_topoff_amount() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_delete_selected_item_from_DTS_window();
    }

    @Then("^unselected items are removed from current selection section$")
    public void unselected_items_are_removed_from_current_selection_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_deleted_item_not_displayed_in_DTS_modal_window_in_Redemptions_Rewards_Page();
    }

    @And("^top\\-off message disappears from the current selection section$")
    public void topoff_message_disappears_from_the_current_selection_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_TopOff_msg_disappeared_in_DTS_modal_window();
    }

    @And("^updated 'You Have Used' amount displays which is the total price of the items selected$")
    public void updated_you_have_used_amount_displays_which_is_the_total_price_of_the_items_selected() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_updated_total_price_for_selected_items_displayed_in_DTS_modal_window();
    }

    @And("^updated 'Remaining to Spend' displays which is \\(coupon amount \\- total price of items selected\\) and is either 0 or a positive value$")
    public void updated_remaining_to_spend_displays_which_is_coupon_amount_total_price_of_items_selected_and_is_either_0_or_a_positive_value() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_updated_RemainingToSpend_amt_displayed_in_DTS_modal_window();
    }

    @And("^no top\\-off message is displayed$")
    public void no_topoff_message_is_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_TopOff_msg_disappeared_in_DTS_modal_window();
    }

    @When("^CSR selects another item leading to top\\-off$")
    public void csr_selects_another_item_leading_to_topoff() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_Selects_another_item_from_Make_Selection_window();
    }

    @Then("^top\\-off message displays with correct top\\-off amount$")
    public void topoff_message_displays_with_correct_topoff_amount() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_correct_TopOff_amt_displayed_in_DTS_modal_window();
    }

    @And("^correct 'You Have Used' amount displays which is the total price of the items selected$")
    public void correct_you_have_used_amount_displays_which_is_the_total_price_of_the_items_selected() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_correct_YouHaveUsed_amt_displayed_in_DTS_modal_window();
    }

    @When("^CSR clicks CANCEL link$")
    public void csr_clicks_cancel_link() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_clicks_on_CANCEL_btn_in_DTS_modal_window();
    }

    @Then("^DTS modal is closed with selections lost$")
    public void dts_modal_is_closed_with_selections_lost() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clickOnMakeSelectionButton();
        checkoutPage.CSR_verify_selected_items_are_lost_in_DTS_modal_window();
        checkoutPage.CSR_clicks_on_close_btn_in_DTS_modal_window_in_Redemptions_Rewards_Page();
    }

    @And("^Redemptions & Rewards page displays$")
    public void redemptions_rewards_page_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();

    }

    @When("^CSR clicks Confirm Selection button$")
    public void csr_clicks_confirm_selection_button() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.getICouponSection().clickOnConfrimAndApplyCoupon();
    }

    @Then("^DTS modal is closed with selections saved$")
    public void dts_modal_is_closed_with_selections_saved() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_clicks_on_EDIT_btn_in_DTS_section_RedemptionsPage();
        checkoutPage.CSR_verify_selected_items_are_saved_in_DTS_modal_window();
        checkoutPage.CSR_clicks_on_close_btn_in_DTS_modal_window_in_Redemptions_Rewards_Page();
    }

    @When("^CSR select the item such that the price of items selected is less than coupon amount$")
    public void csr_select_the_item_such_that_the_price_of_items_selected_is_less_than_coupon_amount() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Selects_an_item_from_Make_Selection_window();
    }

    @When("^CSR select the item such that the price of items selected is more than the coupon amount$")
    public void csr_select_the_item_such_that_the_price_of_items_selected_is_more_than_the_coupon_amount() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Selects_multiple_items_from_Make_Selection_window();
    }

    @Then("^top\\-off message displays as '\\*Your current selection exceeds your amount of Dollars to Spend'$")
    public void topoff_message_displays_as_your_current_selection_exceeds_your_amount_of_dollars_to_spend() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_the_Exceeded_amt_text_in_DTS_modalWindow();
    }

    @When("^CSR unselects the item selection such that the price of items selected is less than top\\-off amount$")
    public void csr_unselects_the_item_selection_such_that_the_price_of_items_selected_is_less_than_topoff_amount() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_unselects_first_selected_item_from_list_DTS_modal_window();
    }

    @When("^CSR clicks on button X to delete the selected item$")
    public void csr_clicks_on_button_x_to_delete_the_selected_item() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_clicks_on_btn_X_to_delete_item_DTS_window();
    }

    @Then("^the callout message displays 'Delete This Item'$")
    public void the_callout_message_displays_delete_this_item() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_callout_msg_to_delete_item_DTS_window();
    }

    @And("^the buttons labeled 'YES' and 'NO'$")
    public void the_buttons_labeled_yes_and_no() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_labels_for_YES_NO_to_delete_item_DTS_window();
    }

    @When("^CSR clicks on 'NO' button$")
    public void csr_clicks_on_no_button() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_clicks_on_NO_btn_to_delete_item_DTS_window();
    }

    @Then("^Callout message is disappers$")
    public void callout_message_is_disappers() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_callout_msg_disappered_in_DTS_window();
    }

    @When("^CSR clicks on 'YES' button$")
    public void csr_clicks_on_yes_button() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_clicks_on_YES_btn_to_delete_item_DTS_window();
    }

    @Then("^the item is removed from the table$")
    public void the_item_is_removed_from_the_table() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_validate_items_are_removed_in_DTS_modal_window();
    }

    @And("^CSR sees the Dollars to Spend promotion$")
    public void csr_sees_the_dollars_to_spend_promotion() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        double Tot_Amt = CheckoutPage.verify_Dollars_To_Spend_Section_displayed_and_get_Tot_amt();
        Total_Owing_Amount_act_1.setTotal_StudenClub_Value(Tot_Amt);
    }

    @And("^CSR sees the Dollars to Spend promotion2$")
    public void csr_sees_the_dollars_to_spend_promotion2() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        double Tot_Amt = CheckoutPage.verify_Dollars_To_Spend_Section_displayed_and_get_Tot_amt();
        Total_Owing_Amount_act_1.setTotal_StudenClub_Value(Tot_Amt);
    }

    @When("^CSR select the item such that the price of selected item is more than the coupon amount$")
    public void csr_select_the_item_such_that_the_price_of_selected_item_is_more_than_the_coupon_amount() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        double Excceded_Amt = CheckoutPage.Selects_an_item_from_Make_Selection_window_And_get_Exceeded_amt();
        Total_Owing_Amount_act_1.setExceeded_Amt(Excceded_Amt);
    }

    @Then("^'Prev' link is disabled in first page of search results$")
    public void prev_link_is_disabled_in_first_page_of_search_results() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_Prev_link_disabled_in_first_page_search_results();
    }

    @When("^CSR is on the last page results$")
    public void csr_is_on_the_last_page_results() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_navigate_to_last_page_in_search_results_DTS_modal_window();
    }

    @Then("^'Next' link is disabled in last page of search results$")
    public void next_link_is_disabled_in_last_page_of_search_results() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_Next_link_disabled_in_last_page_search_results();
    }

    @Then("^CSR views Dollars to Spend promotion with Make Selection button in the same line$")
    public void csr_views_dollars_to_spend_promotion_with_make_selection_button_in_the_same_line() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_DTS_section_MakeSelection_fld_displayed_in_Redemptions_Rewards_Page();
    }

    @Then("^CSR does not see the Dollars to Spend promotion$")
    public void csr_does_not_see_the_dollars_to_spend_promotion() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_DTS_promotion_not_displayed_RewardsPage();
    }

    @And("^CSR selects an item that is greater than the \\[coupon amount\\]$")
    public void csr_selects_an_item_that_is_greater_than_the_coupon_amount() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.Selects_an_item_from_Make_Selection_window();
    }

    @And("^CSR navigates to \\[Review Cart\\] page from \\[Rewards & Coupons\\] page$")
    public void csr_navigates_to_review_cart_page_from_rewards_coupons_page() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.CSR_navigates_from_RewardsPage_to_ReviewCart_Page();
    }

    @Then("^CSR does not receive Dollars to Spend promotion$")
    public void csr_does_not_receive_dollars_to_spend_promotion() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_DTS_promotion_not_displayed_RewardsPage();
    }

    @And("^CSR selects a grade$")
    public void csr_selects_a_grade() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(5000);
        PauseUtil.pause(6000);
        WaitUtils.waitForEnabled(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards());
        SCHUtils.selectOptionsByVisibleText(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards(),
                TestBaseProvider.getTestBase().getTestData().getString("grade"));
        PauseUtil.pause(5000);
    }

    @When("^CSR selects an item$")
    public void csr_selects_an_item() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.Selects_an_item_from_Make_Selection_window();
    }

    @Then("^correct Item#, item title, price, Flyer are displayed$")
    public void correct_item_item_title_price_flyer_are_displayed() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.CSR_verify_selected_item_info_correctly_in_FreeItem_YourSelection_window();
    }

    @When("^CSR clicks on an item title\\/Item#$")
    public void csr_clicks_on_an_item_titleitem() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_clicks_on_item_title_DTS_window();
    }

    @Then("^expanded table row of the item displays$")
    public void expanded_table_row_of_the_item_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_table_is_expanded_when_clicks_on_item_DTS_window();
    }

    @And("^a thumbnail image representative of the particular item being engaged \\(uploaded to Business Manager$")
    public void a_thumbnail_image_representative_of_the_particular_item_being_engaged_uploaded_to_business_manager() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_thumbnail_image_displayed_when_clicks_on_item_DTS_window();
    }

    @When("^CSR clicks on Hide Detail link$")
    public void csr_clicks_on_hide_detail_link() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_clicks_on_HideDetail_link_in_DTS_window();
    }

    @Then("^the expanded view of the item is hidden$")
    public void the_expanded_view_of_the_item_is_hidden() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_expanded_table_not_displayed_in_DTS_window();
    }

    @Then("^CSR is presented with range of search result items currently being viewed e.g. 11 – 20 of (.+) Results$")
    public void csr_is_presented_with_range_of_search_result_items_currently_being_viewed_eg_11_20_of_results(String total) throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_search_results_range_section_displayed_in_DTS_window();
    }

    @And("^CSR is presented with the total number of items found in the Search Results list$")
    public void csr_is_presented_with_the_total_number_of_items_found_in_the_search_results_list() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_search_results_Tot_items_section_displayed_in_DTS_window();
    }

    @And("^CSR searches for a \\[search term\\]$")
    public void csr_searches_for_a_search_term() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clicks_Search_fld_and_searches_an_item_in_MakeYourSelection_window();
    }

    @When("^CSR searches for \\[expired item\\] in Make Selection window$")
    public void csr_searches_for_expired_item_in_make_selection_window() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clicks_Search_fld_and_searches_an_item_in_MakeYourSelection_window();
    }

    @Then("^CSR sees a validation message for expired item search$")
    public void csr_sees_a_validation_message_for_expired_item_search() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        //checkoutPage.clicks_Search_fld_and_searches_an_item_in_MakeYourSelection_window();
    }

    @When("^CSR selects an item from the results$")
    public void csr_selects_an_item_from_the_results() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_clicks_on_item_title_DTS_window();
    }

    @Then("^selected item title displays correctly in Current Selection section$")
    public void selected_item_title_displays_correctly_in_current_selection_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_item_title_displays_correctly_in_DTS_window();
    }

    @Then("^selected item number displays correctly in Current Selection section$")
    public void selected_item_number_displays_correctly_in_current_selection_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_item_num_displays_correctly_in_DTS_window();
    }

    @When("^CSR searches for a term with no results$")
    public void csr_searches_for_a_term_with_no_results() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clicks_Search_fld_and_searches_an_item_in_MakeYourSelection_window();
    }

    @When("^CSR searches for teacher club items$")
    public void csr_searches_for_teacher_club_items() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clicks_Search_fld_and_searches_an_item_in_MakeYourSelection_window();
    }

    @Then("^CSR sees no results message$")
    public void csr_sees_no_results_message() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_items_list_is_empty_in_DTS_modal_window();
    }


    @Then("^only Apply buttons should be present for Student Clubs, Teacher Catalogues, and Shipping & Handling sections$")
    public void only_apply_buttons_should_be_present_for_student_clubs_teacher_catalogues_and_shipping_handling_sections() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.check_applybtn_stud_teach_ship_sections();
    }


    @Then("^Skip button should not be seen for Student Clubs, Teacher Catalogues, and Shipping & Handling sections$")
    public void skip_button_should_not_be_seen_for_student_clubs_teacher_catalogues_and_shipping_handling_sections() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.check_skipbtn_stud_teach_ship_sections();
    }

    @And("^teacher enter bonus amount for Student Clubs and clicks Apply button$")
    public void teacher_enter_bonus_amount_for_student_clubs_and_clicks_apply_button() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Bonus_Bank_Equal_To_StudentClubTotal_Amount();
    }

    @And("^teacher enter bonus amount for Teacher Catalogues and clicks Apply button$")
    public void teacher_enter_bonus_amount_for_teacher_catalogues_and_clicks_apply_button() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Bonus_Bank_Equal_To_TeacherClubTotal_Amount();
    }


    @And("^teacher enter bonus amount for Shipping & Handling section and clicks Apply button$")
    public void teacher_enter_bonus_amount_for_shipping_handling_section_and_clicks_apply_button() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_shipping_Bonus_Bank_Equal_To_ShippingFee_Amount();
    }

    @And("^Edit button should be seen for Student Clubs$")
    public void edit_button_should_be_seen_for_student_clubs() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.check_editbtn_stud_sections();
    }

    @And("^Edit button should be seen for Teacher Catalogues$")
    public void edit_button_should_be_seen_for_teacher_catalogues() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.check_editbtn_teach_sections();
    }

    @And("^Edit button should be seen for Shipping & Handling section$")
    public void edit_button_should_be_seen_for_shipping_handling_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.check_editbtn_ship_sections();
    }

    @And("^teacher selects an item from the Make Selection window having unique item id$")
    public void teacher_selects_an_item_from_the_make_selection_window_having_unique_item_id() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
                TestBaseProvider.getTestBase().getTestData());
        checkoutPage.MakeSelectionWindow_DTSSelectItem();
    }


    @And("^teacher selects an item from the model window having unique item id$")
    public void teacher_selects_an_item_from_the_model_window_having_unique_item_id() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
                TestBaseProvider.getTestBase().getTestData());
        checkoutPage.MakeSelectionWindow_DTSSelectItem();
    }


    @When("^CSR does not enter no\\. of students in student incentive promotion$")
    public void csr_does_not_enter_no_of_students_in_student_incentive_promotion() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_enter_numOfStudents_StudentIncentives_textBox_in_Redemptions_Rewards_Page();
    }

    @Then("^'Empty field is invalid' error message displays$")
    public void empty_field_is_invalid_error_message_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_PopUp_msg_for_StudentIncentives_in_Redemptions_Rewards_Page();
    }

    @And("^CSR applies freepick coupon$")
    public void csr_applies_freepick_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        //checkoutPage.apply_a_coupon_Rewards_page();
        checkoutPage.CSR_apply_a_coupon_in_Rewards_page();
    }

    @When("^CSR clicks on Edit link$")
    public void csr_clicks_on_edit_link() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_clicks_on_EDIT_btn_for_coupon_fld_in_Redemptions_Rewards_Page();
    }

    @And("^CSR clicks on grade level dropdown$")
    public void csr_clicks_on_grade_level_dropdown() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(5000);
        PauseUtil.pause(6000);
        WaitUtils.waitForEnabled(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards());
        SCHUtils.selectOptionsByVisibleText(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards(),
                TestBaseProvider.getTestBase().getTestData().getString("grade"));
        PauseUtil.pause(5000);
    }

    @And("^CSR confirms selections on Freepick modal$")
    public void csr_confirms_selections_on_freepick_modal() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.Selects_an_item_from_Free_Item_Modal_window();
        CheckoutPage.getICouponSection().clickOnConfrimAndApplyCoupon();

    }

    @Then("^the CSR will be presented with the ‘Make Your Selection’ modal window minus any search results$")
    public void the_csr_will_be_presented_with_the_make_your_selection_modal_window_minus_any_search_results() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.CSR_verify_FreePick_modal_window_displayed_in_Redemptions_Rewards_Page();
    }

    @And("^the ‘Your Current Selection’ table with the previously selected item displays$")
    public void the_your_current_selection_table_with_the_previously_selected_item_displays() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.CSR_verify_Selected_items_are_saved_in_FreePick_modal_window();
    }

    @And("^the button labeled ‘CONFIRM & APPLY’ in a disabled state$")
    public void the_button_labeled_confirm_apply_in_a_disabled_state() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.getICouponSection().CSR_verify_ConfirmSubmit_btn_disabled_in_FreeItem_modal_window();
    }

    @When("^CSR clicks on X to delete the item from current selection section$")
    public void csr_clicks_on_x_to_delete_the_item_from_current_selection_section() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.CSR_clicks_on_delete_btn_for_selected_item_FreePick_modalWindow();
    }

    @Then("^that item and the entire ‘Your Current Selection’ table is removed from the CSR’s screen$")
    public void that_item_and_the_entire_your_current_selection_table_is_removed_from_the_csrs_screen() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.CSR_verify_Selected_items_are_not_displayed_in_FreePick_modal_window();
    }

    @And("^the CHECKED button for that item from the ‘Search Results’ table reverts to its default radio button state$")
    public void the_checked_button_for_that_item_from_the_search_results_table_reverts_to_its_default_radio_button_state() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.CSR_verify_checked_btn_not_displayed_for_deleted_item_in_FreePick_modal_window();
    }

    @And("^CSR selects an item from the list$")
    public void csr_selects_an_item_from_the_list() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.Selects_an_item_from_Free_Item_Modal_window();
    }

    @Then("^freepick modal is closed with selections lost$")
    public void freepick_modal_is_closed_with_selections_lost() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.CSR_clicks_on_entered_FreePick_coupon_fld();
        CheckoutPage.CSR_verify_Selected_items_are_not_displayed_in_FreePick_modal_window();
        CheckoutPage.CSR_clicks_on_close_btn_in_DTS_modal_window_in_Redemptions_Rewards_Page();

    }


    @And("^teacher is able to apply the free shipping coupon in next order$")
    public void teacher_is_able_to_apply_the_free_shipping_coupon_in_next_order() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clickhomeIcon_ConfirmationPage();
        PauseUtil.pause(5000);
        //
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();

        iStudentFlyerOrdersPage.placeItems_GlobalSearch(
                TestBaseProvider.getTestBase().getTestData().getString("itemName"),
                TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
        //
        ICartPage cartPage = getFactory().getICartPage();
        CartPage crtpge = new CartPage();
        cartPage.clickProceedToCheckoutBtn();
        PauseUtil.pause(2500);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        SCHUtils.waitForLoaderToDismiss();
        if (SCHUtils.isPresent(crtpge.getbtntopBonuspointModelProceedToCheckout())) {
            SCHUtils.clickUsingJavaScript(crtpge.getbtntopBonuspointModelProceedToCheckout());
            PauseUtil.pause(1000);
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete();
        }
        //
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("couponnumber"));
        for (String coupon : coupons) {
            rewardsAndCoupons.enterCoupon(coupon);

        }
        //
        ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.waitForPageLoad();
        shippingAndPayment.verifyFreeShippingCharge(TestBaseProvider.getTestBase()
                .getTestData().getString("shippingCharge").trim());
        //
        CheckoutPage chkpge = new CheckoutPage();
        chkpge.getRewardsAndCouponsSection().enterTossInNumberOfStudent(TestBaseProvider.getTestBase().getTestData());
        chkpge.teacher_proceedtocheckout_couponsrewardspage_submitorder();

    }

    @Then("^freepick modal is closed with selections saved$")
    public void freepick_modal_is_closed_with_selections_saved() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.CSR_clicks_on_EDIT_btn_for_coupon_fld_in_Redemptions_Rewards_Page();
        CheckoutPage.CSR_verify_Selected_items_are_saved_in_FreePick_modal_window();
        CheckoutPage.CSR_clicks_on_close_btn_in_DTS_modal_window_in_Redemptions_Rewards_Page();

    }

    @And("^Redemptions & Rewards page displays with the coupon code and Edit link$")
    public void redemptions_rewards_page_displays_with_the_coupon_code_and_edit_link() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.CSR_verify_EDIT_link_displayed_in_coupon_section_in_Rewards_page();
    }

    @When("^CSR selects a different item on the freepick modal$")
    public void csr_selects_a_different_item_on_the_freepick_modal() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        //CheckoutPage.CSR_Selects_another_item_from_FreeItem_Selection_window();
        CheckoutPage.CSR_selects_second_item_in_FreePick_window_Redemptions_Rewards_Page();
    }

    @Then("^Current selection item displays with the recently selected item$")
    public void current_selection_item_displays_with_the_recently_selected_item() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.CSR_verify_selected_item_info_correctly_in_FreeItem_YourSelection_window();
    }

    @And("^only one item can be selected and the new selection is swapped by the previous selection$")
    public void only_one_item_can_be_selected_and_the_new_selection_is_swapped_by_the_previous_selection() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.CSR_verify_selected_item_only_displayed_YourSelection_list_in_Redemptions_Rewards_Page();
    }

    @Then("^Current selection item displays with correct Item, title, Flyer, Price, Qty$")
    public void current_selection_item_displays_with_correct_item_title_flyer_price_qty() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.CSR_verify_selected_item_info_correctly_in_FreeItem_YourSelection_window();
    }

    @And("^CSR clicks on an item title$")
    public void csr_clicks_on_an_item_title() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.CSR_clicks_on_item_title_FreePick_window();
    }

    @When("^CSR selects an item from the search results$")
    public void csr_selects_an_item_from_the_search_results() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.CSR_clicks_on_item_title_FreePick_window();
    }

    @Then("^selected item number displays correctly in Current Selection section for FreeItem$")
    public void selected_item_number_displays_correctly_in_current_selection_section_for_freeitem() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.CSR_verify_item_num_displays_correctly_in_FreePick_window();
    }

    @Then("^CSR sees no search results message$")
    public void csr_sees_no_search_results_message() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_no_search_results_display_in_MakeYourSelection_window();
    }

    @And("^CSR enters Free pick flat coupon code$")
    public void csr_enters_free_pick_flat_coupon_code() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        //checkoutPage.apply_a_coupon_Rewards_page();
        checkoutPage.CSR_apply_a_coupon_in_Rewards_page();
    }

    @When("^CSR enters invalid coupon code$")
    public void csr_enters_invalid_coupon_code() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        //checkoutPage.apply_a_coupon_Rewards_page();
        checkoutPage.CSR_apply_a_coupon_in_Rewards_page();
    }

    @And("^CSR clicks on X icon$")
    public void csr_clicks_on_x_icon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_clicks_on_btn_X_to_delete_item_DTS_window();
    }

    @When("^CSR clicks on 'No'$")
    public void csr_clicks_on_no() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_clicks_on_NO_to_delete_coupon_in_Rewards_page_coupons_section();
    }

    @When("^CSR clicks on 'Yes'$")
    public void csr_clicks_on_yes() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_clicks_on_YES_to_delete_coupon_in_Rewards_page_coupons_section();
    }

    @Then("^delete callout message disappears$")
    public void delete_callout_message_disappears() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_delete_CallOut_disappeared_in_Redemptions_Page();
    }

    @Then("^delete callout message not displayed$")
    public void delete_callout_message_not_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_delete_CallOut_not_displayed_in_Redemptions_Page();
    }

    @And("^the coupon is retained in cart and selections are retained$")
    public void the_coupon_is_retained_in_cart_and_selections_are_retained() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_coupon_section_displayed_and_retained_in_Redemptions_Page();
    }

    @And("^the coupon is removed from cart$")
    public void the_coupon_is_removed_from_cart() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_coupon_is_removed_from_cart_in_Redemptions_Page();
    }

    @And("^Coupons Applied section disappears$")
    public void coupons_applied_section_disappears() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_coupon_section_not_displayed_in_Redemptions_Page();
    }

    @And("^CSR enter no\\. of students in student incentive if applicable$")
    public void csr_enter_no_of_students_in_student_incentive_if_applicable() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_enter_numOfStudents_StudentIncentives_textBox_in_Redemptions_Rewards_Page();
    }

    @Then("^Payment page displays with the information from Redemptions & Rewards page saved$")
    public void payment_page_displays_with_the_information_from_redemptions_rewards_page_saved() throws Throwable {
        IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.validate_Shipping_And_Payment_tab_is_highlighted();

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validation_of_StudentClub_Total_owing_amount_Payment_Page();
    }

    @Then("^error message displays for invalid coupon code$")
    public void error_message_displays_for_invalid_coupon_code() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_validate_error_message_for_invalid_couponCode_RewardsPage();
    }

    @And("^CSR applies valid coupon code$")
    public void csr_applies_valid_coupon_code() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        //checkoutPage.apply_a_coupon_Rewards_page();
        checkoutPage.CSR_apply_a_coupon_in_Rewards_page();
    }

    @When("^CSR enters the same coupon code again$")
    public void csr_enters_the_same_coupon_code_again() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_a_coupon_Rewards_page();
    }

    @Then("^error message displays for already enterd coupon code$")
    public void error_message_displays_for_already_enterd_coupon_code() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_validate_error_message_for_already_entered_couponCode_RewardsPage();
    }

    @When("^CSR enter minimum 3 characters in coupon text box$")
    public void csr_enter_minimum_3_characters_in_coupon_text_box() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        //checkoutPage.apply_a_coupon_Rewards_page();
        checkoutPage.CSR_enters_coupon_without_clicks_on_ApplyBtn_in_Rewards_page();
    }

    @Then("^Apply button becomes active$")
    public void apply_button_becomes_active() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_validate_Apply_btn_enabled_in_RewardsPage();
    }

    @When("^CSR enters a TGAT coupon$")
    public void csr_enters_a_tgat_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_TGAT_coupon_in_Rewards_page();
    }

    @When("^CSR enters referring Teacher account details in TGAT modal window$")
    public void csr_enters_referring_teacher_account_details_in_tgat_modal_window() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Teacher_enters_referring_teacher_details_TGAT_modal_window();
    }

    @When("^CSR navigates to the Payment page$")
    public void csr_navigates_to_the_payment_page() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_enters_value_in_StudentIncentives_if_displayed_in_Redemptions_Rewards_Page();

        IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Rewards_page();
    }

    @When("^CSR enters inactive Teacher account details in TGAT modal window$")
    public void csr_enters_inactive_teacher_account_details_in_tgat_modal_window() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Teacher_enters_referring_teacher_details_TGAT_modal_window();
    }

    @When("^CSR submit the order$")
    public void csr_submit_the_order() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.submit_the_Order();
    }

    @When("^CSR enters invalid referring Teacher account number in TGAT modal window$")
    public void csr_enters_invalid_referring_teacher_account_number_in_tgat_modal_window() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Teacher_enters_referring_teacher_details_TGAT_modal_window();
    }

    @When("^CSR enters only the \\[Fname\\] and \\[Lname\\] of referring Teacher in TGAT modal window$")
    public void csr_enters_only_the_fname_and_lname_of_referring_teacher_in_tgat_modal_window() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Teacher_enters_referring_teacher_Fname_Lname_in_TGAT_modal_window();
    }

    @When("^CSR enters only the \\[AcNumber\\] and \\[Lname\\] of referring Teacher in TGAT modal window$")
    public void csr_enters_only_the_acnumber_and_lname_of_referring_teacher_in_tgat_modal_window() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Teacher_enters_referring_teacher_AcNum_Lname_in_TGAT_modal_window();
    }

    @When("^CSR enters only the \\[AcNumber\\] and \\[Fname\\] of referring Teacher in TGAT modal window$")
    public void csr_enters_only_the_acnumber_and_fname_of_referring_teacher_in_tgat_modal_window() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Teacher_enters_referring_teacher_AcNum_Fname_in_TGAT_modal_window();
    }

    @And("^CSR enters a TGAT coupon which is referred by \\[Teacher1\\]$")
    public void csr_enters_a_tgat_coupon_which_is_referred_by_teacher1() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_TGAT_coupon_in_Rewards_page_referred_by_Teacher1();
    }

    @When("^CSR enters a TGAT coupon which is referred by \\[Teacher2\\]$")
    public void csr_enters_a_tgat_coupon_which_is_referred_by_teacher2() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_TGAT_coupon_in_Rewards_page_referred_by_Teacher2();
    }

    @When("^CSR enters invalid TGAT coupon$")
    public void csr_enters_invalid_tgat_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_TGAT_coupon_in_Rewards_page();
    }

    @When("^CSR enters expired TGAT coupon$")
    public void csr_enters_expired_tgat_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_TGAT_coupon_in_Rewards_page();
    }

    @When("^CSR enters a TGAT coupon which is already applied and redeemed$")
    public void csr_enters_a_tgat_coupon_which_is_already_applied_and_redeemed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_TGAT_coupon_in_Rewards_page();
    }

    @And("^CSR closes the TGAT modal window$")
    public void csr_closes_the_tgat_modal_window() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.close_the_TGAT_modal_window();
    }

    @When("^CSR proceed to checkout from Rewards and coupons page$")
    public void csr_proceed_to_checkout_from_rewards_and_coupons_page() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.navigateToPaymentsPage_TGAT();
    }

    @When("^CSR enters again the same TGAT coupon$")
    public void csr_enters_again_the_same_tgat_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_TGAT_coupon_in_Rewards_page();
    }

    @When("^CSR clicks on delete TGAT coupon button and selects as \\[NO\\]$")
    public void csr_clicks_on_delete_tgat_coupon_button_and_selects_as_no() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_selects_TGAT_delete_button_and_click_NO();
    }

    @When("^CSR clicks on delete TGAT coupon button and selects as \\[YES\\]$")
    public void csr_clicks_on_delete_tgat_coupon_button_and_selects_as_yes() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_selects_TGAT_delete_button_and_click_YES();
    }

    @When("^CSR deletes the TGAT coupon$")
    public void csr_deletes_the_tgat_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_selects_TGAT_delete_button_and_click_YES();
    }

    @When("^CSR deletes the items from cart making cart non\\-qualifying$")
    public void csr_deletes_the_items_from_cart_making_cart_nonqualifying() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.CSR_navigates_from_RewardsPage_to_ReviewCart_Page();

        IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.CSR_clicks_on_btn_X_to_delete_the_item1_ReviewCartPage();
        studentFlyerOrdersPage.CSR_clicks_on_YES_btn_in_Delete_popup_ReviewCartPage();

    }

    @And("^CSR navigates to rewards & coupons page$")
    public void csr_navigates_to_rewards_coupons_page() throws Throwable {
        IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.CSR_clicks_on_ProceedToCheckout_ReviewCartPage();
        //studentFlyerOrdersPage.CSR_clicks_on_ProceedToCheckout_in_RewardsCoupons_popup_window();
    }

    @When("^CSR selects the DTS item which top off amount makes the cart to qualify$")
    public void csr_selects_the_dts_item_which_top_off_amount_makes_the_cart_to_qualify() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.clickOnMakeSelectionButton();

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(5000);
        PauseUtil.pause(6000);
        WaitUtils.waitForEnabled(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards());
        SCHUtils.selectOptionsByVisibleText(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards(),
                TestBaseProvider.getTestBase().getTestData().getString("grade"));
        PauseUtil.pause(5000);

        checkoutPage.Selects_multiple_items_from_Make_Selection_window();

        checkoutPage.getICouponSection().clickOnConfrimAndApplyCoupon();
    }

    @And("^CSR enters amount in student Bonus Bank$")
    public void csr_enters_amount_in_student_bonus_bank() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Bonus_Bank();
    }

    @And("^CSR enters amount in student Paper coupons$")
    public void csr_enters_amount_in_student_paper_coupons() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Paper_Bank();
    }

    @And("^CSR clicks on Apply in Students section$")
    public void csr_clicks_on_apply_in_students_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.click_on_Apply_in_Students_section();
    }

    @And("^CSR does not receive free Shipping$")
    public void csr_does_not_receive_free_shipping() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_shipping_charge_is_not_free_in_Redemptions_page();
    }

    @When("^CSR applies \\[Free Shipping Coupon\\]$")
    public void csr_applies_free_shipping_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        //checkoutPage.apply_a_coupon_Rewards_page();
        checkoutPage.CSR_apply_a_coupon_in_Rewards_page();
    }

    @Then("^CSR receives FREE shipping$")
    public void csr_receives_free_shipping() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_shipping_charge_is_free_in_Redemptions_page();
    }

    @Then("^CSR receives FREE shipping and deletes the applied coupon$")
    public void csr_receives_free_shipping_and_deletes_the_applied_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_shipping_charge_is_free_in_Redemptions_page_and_delete_appliedCoupon();
    }

    @And("^CSR navigates to Review Your cart page from Coupons & Rewards page$")
    public void csr_navigates_to_review_your_cart_page_from_coupons_rewards_page() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.CSR_navigates_from_RewardsPage_to_ReviewCart_Page();
    }

    @When("^CSR deletes items from cart resulting in cart total fall below \\[shipping threshold\\]$")
    public void csr_deletes_items_from_cart_resulting_in_cart_total_fall_below_shipping_threshold() throws Throwable {
        IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.CSR_clicks_on_btn_X_to_delete_the_item1_ReviewCartPage();
        studentFlyerOrdersPage.CSR_clicks_on_YES_btn_in_Delete_popup_ReviewCartPage();
    }

    @Then("^CSR sees error message for order amount not meeting for Free Shipping$")
    public void csr_sees_error_message_for_order_amount_not_meeting_for_free_shipping() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validate_error_message_which_does_not_meet_the_min_cart_val();
    }

    @And("^CSR enters amount in \\[Student Bonus dollar\\] and \\[student paper dollar\\] making cart total fall below \\[Manual shipping threshold\\]$")
    public void csr_enters_amount_in_student_bonus_dollar_and_student_paper_dollar_making_cart_total_fall_below_manual_shipping_threshold() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Bonus_Bank();
        checkoutPage.enter_amount_in_student_Paper_Bank();
        checkoutPage.click_on_Apply_in_Students_section();
    }

    @And("^CSR enters amount in \\[Student Bonus dollar\\] making cart total fall below \\[Manual shipping threshold\\]$")
    public void csr_enters_amount_in_student_bonus_dollar_making_cart_total_fall_below_manual_shipping_threshold() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Bonus_Bank();
        checkoutPage.click_on_Apply_in_Students_section();
    }

    @And("^CSR enters amount in \\[Student paper dollar\\] making cart total fall below \\[Manual shipping threshold\\]$")
    public void csr_enters_amount_in_student_paper_dollar_making_cart_total_fall_below_manual_shipping_threshold() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Paper_Bank();
        checkoutPage.click_on_Apply_in_Students_section();
    }

    @And("^CSR enters amount in \\[Teacher Bonus dollar\\] making cart total fall below \\[Manual shipping threshold\\]$")
    public void csr_enters_amount_in_teacher_bonus_dollar_making_cart_total_fall_below_manual_shipping_threshold() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Bonus_Bank();
        checkoutPage.click_on_Apply_in_Teacher_section();
    }

    @And("^CSR enters amount in \\[Teacher paper dollar\\] making cart total fall below \\[Manual shipping threshold\\]$")
    public void csr_enters_amount_in_teacher_paper_dollar_making_cart_total_fall_below_manual_shipping_threshold() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Paper_Bank();
        checkoutPage.click_on_Apply_in_Teacher_section();
    }

    @And("^CSR enters amount in \\[Teacher Bonus dollar\\] and \\[Teacher paper dollar\\] making cart total fall below \\[Manual shipping threshold\\]$")
    public void csr_enters_amount_in_teacher_bonus_dollar_and_teacher_paper_dollar_making_cart_total_fall_below_manual_shipping_threshold() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Bonus_Bank();
        checkoutPage.enter_amount_in_teacher_Paper_Bank();
        checkoutPage.click_on_Apply_in_Teacher_section();
    }

    @And("^CSR clicks on Delete coupon and clicks on \\[YES\\] option$")
    public void csr_clicks_on_delete_coupon_and_clicks_on_yes_option() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_selects_TGAT_delete_button_and_click_YES();
    }

    @When("^CSR tries to apply same \\[Free Shipping Coupon\\]$")
    public void csr_tries_to_apply_same_free_shipping_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_apply_a_same_coupon_Rewards_page();
    }

    @And("^CSR clicks on Delete coupon and clicks on \\[NO\\] option$")
    public void csr_clicks_on_delete_coupon_and_clicks_on_no_option() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_selects_TGAT_delete_button_and_click_NO();
    }

    @Then("^CSR still has FREE shipping$")
    public void csr_still_has_free_shipping() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_shipping_charge_is_free_in_Redemptions_page();
    }

    @Then("^CSR sees error message for using same coupon$")
    public void csr_sees_error_message_for_using_same_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validate_error_message_for_reenter_the_same_coupon();
    }

    @Then("^CSR sees error message 'Shipping for your order is already FREE! This coupon code cannot be applied\\.'$")
    public void csr_sees_error_message_shipping_for_your_order_is_already_free_this_coupon_code_cannot_be_applied() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validate_error_message_for_reenter_the_same_coupon();
    }

    @And("^CSR enters amount in teacher Bonus Bank$")
    public void csr_enters_amount_in_teacher_bonus_bank() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Bonus_Bank();
    }

    @And("^CSR enters amount in teacher Paper coupons$")
    public void csr_enters_amount_in_teacher_paper_coupons() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Paper_Bank();
    }

    @And("^CSR clicks on Apply in teacher section$")
    public void csr_clicks_on_apply_in_teacher_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.click_on_Apply_in_Teacher_section();
    }


    @And("^CSR applies \\[Free item coupon\\]$")
    public void csr_applies_free_item_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        //checkoutPage.apply_a_coupon_Rewards_page();
        checkoutPage.CSR_apply_a_coupon_in_Rewards_page();
    }

    @And("^CSR sees Free item displayed in Coupons section$")
    public void csr_sees_free_item_displayed_in_coupons_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_coupon_section_displayed_and_retained_in_Redemptions_Page();
    }

    @When("^CSR enters amount in \\[student bonus dollars\\] such that cart total is now below \\[minimum amount\\]$")
    public void csr_enters_amount_in_student_bonus_dollars_such_that_cart_total_is_now_below_minimum_amount() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Bonus_Bank();
        checkoutPage.click_on_Apply_in_Students_section();
    }

    @And("^CSR adds amount in \\[student paper dollar\\] such that cart total is now below \\[minimum amount\\]$")
    public void csr_adds_amount_in_student_paper_dollar_such_that_cart_total_is_now_below_minimum_amount() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Paper_Bank();
        checkoutPage.click_on_Apply_in_Students_section();
    }

    @And("^CSR adds amount in \\[Teacher Bonus dollars\\] such that cart total is now below \\[minimum amount\\]$")
    public void csr_adds_amount_in_teacher_bonus_dollars_such_that_cart_total_is_now_below_minimum_amount() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Bonus_Bank();
        checkoutPage.click_on_Apply_in_Teacher_section();
    }

    @And("^CSR adds amount in \\[Teacher paper dollars\\] such that cart total is now below \\[minimum amount\\]$")
    public void csr_adds_amount_in_teacher_paper_dollars_such_that_cart_total_is_now_below_minimum_amount() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Paper_Bank();
        checkoutPage.click_on_Apply_in_Teacher_section();
    }

    @Then("^CSR sees error message for order amount does not meet Free Item value$")
    public void csr_sees_error_message_for_order_amount_does_not_meet_free_item_value() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validate_error_message_which_does_not_meet_the_min_cart_val();
    }

    @Then("^entered FreeItem coupon not displayed$")
    public void entered_freeitem_coupon_not_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_coupon_is_removed_from_cart_in_Redemptions_Page();
    }

    @Then("^CSR should see error message$")
    public void csr_should_see_error_message() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validate_error_message_which_does_not_meet_the_min_cart_val();
    }

    @When("^CSR deletes the Free item coupon$")
    public void csr_deletes_the_free_item_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_selects_TGAT_delete_button_and_click_YES();
    }

    @Then("^CSR can apply the same \\[Free item coupon\\] again$")
    public void csr_can_apply_the_same_free_item_coupon_again() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_a_coupon_Rewards_page();
        checkoutPage.CSR_verify_coupon_section_displayed_and_retained_in_Redemptions_Page();
    }

    @When("^CSR enters amount equal to Student club amount owing in Student Bonus Bank$")
    public void csr_enters_amount_equal_to_student_club_amount_owing_in_student_bonus_bank() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Bonus_Bank_which_is_equal_to_StudentClub_Tot_amt();
        checkoutPage.click_on_Apply_in_Students_section();
    }

    @And("^CSR enters amount equal to teacher club amount owing in Student Bonus Bank$")
    public void csr_enters_amount_equal_to_teacher_club_amount_owing_in_student_bonus_bank() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Bonus_Bank_which_is_equal_to_TeacherCatalogue_Tot_amt();
        checkoutPage.click_on_Apply_in_Teacher_section();
    }

    @And("^CSR enters amount equal to Shipping amount owing in Student Bonus Bank$")
    public void csr_enters_amount_equal_to_shipping_amount_owing_in_student_bonus_bank() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_shipping_Bonus_Bank_which_is_equal_to_ShippingCharge_Tot_amt();
        checkoutPage.click_on_Apply_in_Shipping_section();
    }

    @When("^CSR applies \\[Bonus percentage coupon\\]$")
    public void csr_applies_bonus_percentage_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        //checkoutPage.apply_a_coupon_Rewards_page();
        checkoutPage.CSR_apply_a_coupon_in_Rewards_page();
    }

    @When("^CSR applies \\[expired coupon\\]$")
    public void csr_applies_expired_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        //checkoutPage.apply_a_coupon_Rewards_page();
        checkoutPage.CSR_apply_a_coupon_in_Rewards_page();
    }

    @When("^CSR applies \\[redeemed coupon\\]$")
    public void csr_applies_redeemed_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        //checkoutPage.apply_a_coupon_Rewards_page();
        checkoutPage.CSR_apply_a_coupon_in_Rewards_page();
    }

    @Then("^CSR recieves percentage\\*carttotal\\/100 dollars$")
    public void csr_recieves_percentagecarttotal100_dollars() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_the_percentage_recieved_in_Rewards_page_tier1_with_BonusPercentage();
    }

    @And("^CSR sees the Bonus percentage description in Coupons section$")
    public void csr_sees_the_bonus_percentage_description_in_coupons_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_coupon_section_displayed_and_retained_in_Redemptions_Page();
    }

    @Then("^CSR does not see the Bonus percentage description in Coupons section$")
    public void csr_does_not_see_the_bonus_percentage_description_in_coupons_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_coupon_section_not_displayed_in_Redemptions_Page();
    }

    @Then("^CSR receives error message for order does not meet the coupon minimum value$")
    public void csr_receives_error_message_for_order_does_not_meet_the_coupon_minimum_value() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validate_error_message_which_does_not_meet_the_min_cart_val();
    }

    @When("^CSR deletes items from cart$")
    public void csr_deletes_items_from_cart() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.CSR_navigates_from_RewardsPage_to_ReviewCart_Page();

        IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.CSR_clicks_on_btn_X_to_delete_the_item1_ReviewCartPage();
        studentFlyerOrdersPage.CSR_clicks_on_YES_btn_in_Delete_popup_ReviewCartPage();
        studentFlyerOrdersPage.CSR_clicks_on_ProceedToCheckout_ReviewCartPage();
    }

    @Then("^CSR does not see the Bonus percentage dollars received earlier$")
    public void csr_does_not_see_the_bonus_percentage_dollars_received_earlier() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_coupon_is_removed_from_cart_in_Redemptions_Page();
    }

    @Then("^CSR recieves error message$")
    public void csr_recieves_error_message() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_error_popup_displayed_RedeemRewards_page();
    }

    @And("^CSR selects an item such that the top\\-off amount makes cart meet the \\[Bonus percentage coupon\\]$")
    public void csr_selects_an_item_such_that_the_topoff_amount_makes_cart_meet_the_bonus_percentage_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(5000);
        PauseUtil.pause(6000);
        WaitUtils.waitForEnabled(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards());
        SCHUtils.selectOptionsByVisibleText(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards(),
                TestBaseProvider.getTestBase().getTestData().getString("grade"));
        PauseUtil.pause(5000);

        checkoutPage.Selects_multiple_items_from_Make_Selection_window();
    }

    @And("^CSR clicks on Confirm Selection button$")
    public void csr_clicks_on_confirm_selection_button() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.getICouponSection().clickOnConfrimAndApplyCoupon();
    }

    @When("^CSR applies already redeemed \\[Free item coupon\\]$")
    public void csr_applies_already_redeemed_free_item_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        //checkoutPage.apply_a_coupon_Rewards_page();
        checkoutPage.CSR_apply_a_coupon_in_Rewards_page();
    }

    @When("^CSR applies Bonus Flat coupon$")
    public void csr_applies_bonus_flat_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        //checkoutPage.apply_a_coupon_Rewards_page();
        checkoutPage.CSR_apply_a_coupon_in_Rewards_page();
    }

    @When("^CSR applies already redeemed Bonus Flat coupon$")
    public void csr_applies_already_redeemed_bonus_flat_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        //checkoutPage.apply_a_coupon_Rewards_page();
        checkoutPage.CSR_apply_a_coupon_in_Rewards_page();
    }

    @Then("^CSR receives Flat Bonus Dollars$")
    public void csr_receives_flat_bonus_dollars() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_BonusFlat_value_displayed_correctly_RedeemRewards_page();
    }

    @And("^sees the Bonus Flat coupon number and message in coupons section$")
    public void sees_the_bonus_flat_coupon_number_and_message_in_coupons_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_coupon_section_displayed_and_retained_in_Redemptions_Page();
    }

    @Then("^CSR sees error message for order amount does not meet Bonus Flat value$")
    public void csr_sees_error_message_for_order_amount_does_not_meet_bonus_flat_value() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validate_error_message_which_does_not_meet_the_min_cart_val();
    }

    @Then("^CSR sees error message for the Teacher Catalogues items$")
    public void csr_sees_error_message_for_the_teacher_catalogues_items() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.validate_error_message_which_does_not_meet_the_min_cart_val();
    }

    @When("^CSR deletes items from cart making cart non\\-qualifying$")
    public void csr_deletes_items_from_cart_making_cart_nonqualifying() throws Throwable {
        ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
        CheckoutPage.CSR_navigates_from_RewardsPage_to_ReviewCart_Page();

        IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.CSR_clicks_on_btn_X_to_delete_the_item1_ReviewCartPage();
        studentFlyerOrdersPage.CSR_clicks_on_YES_btn_in_Delete_popup_ReviewCartPage();
        studentFlyerOrdersPage.CSR_clicks_on_ProceedToCheckout_ReviewCartPage();
    }

    @Then("^CSR does not see Flat Bonus dollars$")
    public void csr_does_not_see_flat_bonus_dollars() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_BonusFlat_amt_section_not_displayed_RedeemRewards_page();
    }

    @And("^does not see the Bonus Flat message in coupons section$")
    public void does_not_see_the_bonus_flat_message_in_coupons_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_coupon_is_removed_from_cart_in_Redemptions_Page();
    }

    @Then("^CSR sees the upsell message with dollars gained from current cart total$")
    public void csr_sees_the_upsell_message_with_dollars_gained_from_current_cart_total() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_BonusFlat_Upsell_msg_displayed_RedeemRewards_page();
    }

    @And("^CSR selects Alternate Shipping Address Check box$")
    public void csr_selects_alternate_shipping_address_check_box() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Select_Alternate_Shipping_Address_Checkbox();
    }

    @When("^CSR enters Postal Code without a space between 3rd and 4th charactres$")
    public void csr_enters_postal_code_without_a_space_between_3rd_and_4th_charactres() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_enters_PostalCode_PaymentPage();
    }

    @When("^CSR performs Tab key$")
    public void csr_performs_tab_key() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_performs_TAB_key_Payment_Page();
    }

    @Then("^Error callOut message not displays$")
    public void error_callout_message_not_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_error_popup_not_displayed_Payment_page();
    }

    @When("^CSR enters Postal Code that doesn't follow the rule$")
    public void csr_enters_postal_code_that_doesnt_follow_the_rule() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_enters_PostalCode_PaymentPage();
    }

    @When("^CSR enters Postal Code$")
    public void csr_enters_postal_code() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_enters_PostalCode_PaymentPage();
    }

    @Then("^Error callOut message displays$")
    public void error_callout_message_displays() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_error_popup_displayed_Payment_page();
    }

    @Then("^the province in which that postal code is related to will be automatically selected based on its 1st letter$")
    public void the_province_in_which_that_postal_code_is_related_to_will_be_automatically_selected_based_on_its_1st_letter() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_correct_province_displayed_for_alternate_shipping_Payment_page();
    }

    @Then("^the province in which that postal code is related to will be automatically selected based on its 1st letter if it is mapped more than one$")
    public void the_province_in_which_that_postal_code_is_related_to_will_be_automatically_selected_based_on_its_1st_letter_if_it_is_mapped_more_than_one() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_correct_province_displayed_for_more_states_alternate_shipping_Payment_page();
    }

    @And("^the same province drop\\-down box is DISABLED$")
    public void the_same_province_dropdown_box_is_disabled() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_Province_dropdown_disabled_Payment_page();
    }

    @And("^the province drop\\-down box is ENABLED$")
    public void the_province_dropdown_box_is_enabled() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_Province_dropdown_enabled_Payment_page();
    }

    @When("^CSR fills the alternate shipping address detail$")
    public void csr_fills_the_alternate_shipping_address_detail() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_fills_alternateAddress_detail_Payment_page();
    }

    @When("^CSR doesn't fill any one of the field in alternate shipping address detail$")
    public void csr_doesnt_fill_any_one_of_the_field_in_alternate_shipping_address_detail() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_fills_alternateAddress_detail_Payment_page();
    }

    @Then("^shipping upsell message is shown in the blue header of Shipping & Handling section$")
    public void shipping_upsell_message_is_shown_in_the_blue_header_of_shipping_handling_section() throws Throwable {
        ICouponsandRewards couponreward = getFactory().getICouponandRewardsPage();
        couponreward.verifyShippingHandlingUpsellMessage();

    }

    @Then("^shipping upsell message is NOT shown in the blue header of Shipping & Handling section$")
    public void shipping_upsell_message_is_not_shown_in_the_blue_header_of_shipping_handling_section() throws Throwable {
        ICouponsandRewards couponreward = getFactory().getICouponandRewardsPage();
        couponreward.verifyShippingHandlingUpsellMessageNotDisplayed();
    }


    @And("^teacher clicks Back to Shop to navigate to YTO page$")
    public void teacher_clicks_something_to_navigate_to_yto_page() throws Throwable {
        ICouponsandRewards couponreward = getFactory().getICouponandRewardsPage();
        couponreward.clickonBacktoShopButton();
    }

    @When("^teacher deletes items from cart resulting in the cart total fall below \\[shipping threshold\\]$")
    public void teacher_deletes_items_from_cart_resulting_in_the_cart_total_fall_below() throws Throwable {

        ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
        teachersHomePage.user_do_the_empty_cart();
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.placeItems_GlobalSearch(
                TestBaseProvider.getTestBase().getTestData().getString("itemName"),
                TestBaseProvider.getTestBase().getTestData().getString("updated_itemQty"));
    }


    @Then("^the checkbox with the label 'Save this card' displays below the \\[Phone Number\\] field$")
    public void the_checkbox_with_the_label_save_this_card_displays_below_the_phone_number_field() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_verify_the_SaveCard_checkbox_with_label_displays_correctly_Payment_page();
    }

    @And("^CSR fills the Credit card and Billing information form$")
    public void csr_fills_the_credit_card_and_billing_information_form() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.fill_new_CreditCard();
    }

    @And("^teacher views Q & A Student incentive with no\\. of students defaulted to 0$")
    public void teacher_views_q_a_student_incentive_with_no_of_students_defaulted_to_0() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.getRewardsAndCouponsSection().verifyQandASectionDefault0();

    }

    @And("^CSR saves the card$")
    public void csr_saves_the_card() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        SCHUtils.selectCheckBox(shippingAndPaymentPage.getChkSaveCard(), "true");
    }

    @And("^CSR unsave the card$")
    public void csr_unsave_the_card() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        SCHUtils.selectCheckBox(shippingAndPaymentPage.getChkSaveCard(), "false");
    }

    @And("^CSR enters the amount to be paid by Credit card$")
    public void csr_enters_the_amount_to_be_paid_by_credit_card() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_amt_paid_by_creditCard_in_paymentPage();
    }

    @When("^CSR clicks on \\[Cancel\\] button in Billing Information section$")
    public void csr_clicks_on_cancel_button_in_billing_information_section() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_clicks_on_Cancel_btn_in_Billing_info_Payment_page();
    }

    @Then("^the Billing Information field section disappears$")
    public void the_billing_information_field_section_disappears() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_verify_Billing_info_form_disappeared_Payment_page();
    }

    @And("^CSR selects 'Edit' hyperlink$")
    public void csr_selects_edit_hyperlink() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_clicks_on_EDIT_hyperlink_in_Billing_info_Payment_page();
    }

    @When("^CSR clicks on Save button$")
    public void csr_clicks_on_save_button() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_clicks_on_Save_btn_in_Billing_info_Payment_page();
    }

    @Then("^CSR sees Security Code text box colored yellow$")
    public void csr_sees_security_code_text_box_colored_yellow() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_verify_Security_code_fld_highlighted_Payment_page();
    }

    @When("^CSR selects the right drop\\-down box under 'Expiration Date:' label$")
    public void csr_selects_the_right_dropdown_box_under_expiration_date_label() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_clicks_on_Year_dropDown_Payment_page();
    }

    @Then("^the right drop\\-down has values of the years ranging from the current system year to the next 20 years$")
    public void the_right_dropdown_has_values_of_the_years_ranging_from_the_current_system_year_to_the_next_20_years() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_validate_year_list_count_displayed_correctly_Payment_page();
    }

    @When("^CSR selects the left drop\\-down box under 'Expiration Date:' label$")
    public void csr_selects_the_left_dropdown_box_under_expiration_date_label() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_clicks_on_Month_dropDown_Payment_page();
    }

    @Then("^the drop\\-down menu should have values from 1 to 12$")
    public void the_dropdown_menu_should_have_values_from_1_to_12() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_validate_month_list_count_displayed_correctly_Payment_page();
    }

    @And("^CSR enters \\[Amount Less than Total Amount\\] in \\[Credit Card fld\\]$")
    public void csr_enters_amount_less_than_total_amount_in_credit_card_fld() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_amount_to_be_paid_in_Credit_card_Payment_page();
    }

    @And("^CSR enters \\[Amount More than Total Amount\\] in \\[Credit Card fld\\]$")
    public void csr_enters_amount_more_than_total_amount_in_credit_card_fld() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_morethan_Tot_amount_to_be_paid_in_Credit_card_Payment_page();
    }

    @And("^CSR enters the total amount in \\[Credit Card fld\\]$")
    public void csr_enters_the_total_amount_in_credit_card_fld() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_same_Tot_amount_to_be_paid_in_Credit_card_Payment_page();
    }

    @And("^CSR enters the total amount in \\[Cheque fld\\]$")
    public void csr_enters_the_total_amount_in_cheque_fld() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_same_Tot_amount_to_be_paid_in_Cheque_Payment_page();
    }

    @And("^CSR enters \\[Amount More than Total Amount\\] in \\[Cheque fld\\]$")
    public void csr_enters_amount_more_than_total_amount_in_cheque_fld() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_morethan_Tot_amount_to_be_paid_in_Cheque_Payment_page();
    }

    @And("^CSR enters \\[Amount Less than Total Amount\\] in \\[Cheque fld\\]$")
    public void csr_enters_amount_less_than_total_amount_in_cheque_fld() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_amount_to_be_paid_in_Cheque_Payment_page();
    }

    @When("^CSR clicks outside the Credit Card fld textbox$")
    public void csr_clicks_outside_the_credit_card_fld_textbox() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_perform_Enter_key_after_enter_amount_to_be_paid_in_Credit_card_Payment_page();
    }

    @Then("^CSR sees the amount in \\[Cheque fld\\] that is the difference between total amount and \\[Amount Less than Total Amount\\]$")
    public void csr_sees_the_amount_in_cheque_fld_that_is_the_difference_between_total_amount_and_amount_less_than_total_amount() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_validate_Amount_to_be_paid_by_Cheque_val_Payment_page();
    }

    @Then("^CSR sees the amount 0\\.00 in \\[Cheque fld\\]$")
    public void csr_sees_the_amount_000_in_cheque_fld() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_validate_Amount_to_be_paid_by_Cheque_val_is_0_Payment_page();
    }

    @Then("^CSR sees the amount 0\\.00 in \\[Credit Card fld\\]$")
    public void csr_sees_the_amount_000_in_credit_card_fld() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_validate_Amount_to_be_paid_by_Credit_Card_val_is_0_Payment_page();
    }

    @Then("^CSR sees the amount in \\[Credit Card fld\\] that is the difference between total amount and \\[Amount Less than Total Amount\\]$")
    public void csr_sees_the_amount_in_credit_card_fld_that_is_the_difference_between_total_amount_and_amount_less_than_total_amount() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_validate_Amount_to_be_paid_by_CreditCard_val_Payment_page();
    }

    @And("^CSR selects \\[Canada\\] in the Country drop\\-down$")
    public void csr_selects_canada_in_the_country_dropdown() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_selects_Country_in_Payment_page();
    }

    @When("^CSR enters valid phone number without hyphens in the 'Phone Number' textbox$")
    public void csr_enters_valid_phone_number_without_hyphens_in_the_phone_number_textbox() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_PhoneNumber_in_Payment_page();
    }

    @Then("^the phone number in the textbox has an hyphen between the 3rd and 4th number and the 6th and 7th number$")
    public void the_phone_number_in_the_textbox_has_an_hyphen_between_the_3rd_and_4th_number_and_the_6th_and_7th_number() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_verify_the_PhoneNumber_in_Payment_page();
    }

    @And("^CSR selects \\[Year\\]$")
    public void csr_selects_year() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_selects_a_year_Credit_card_info_in_Payment_page();
    }

    @Then("^\\[Year\\] is not shown in the drop\\-down box$")
    public void year_is_not_shown_in_the_dropdown_box() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_validate_the_selected_year_not_shown_in_Payment_page();
    }

    @When("^CSR enters characters more than 4 in the Security Code textbox$")
    public void csr_enters_characters_more_than_4_in_the_security_code_textbox() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_Security_code_CreditCard_section_in_Payment_page();
    }

    @Then("^the Security Code does not accept more than 4 characters$")
    public void the_security_code_does_not_accept_more_than_4_characters() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_verify_Security_code_not_accept_morethan_4chars_CreditCard_section_in_Payment_page();
    }

    @When("^CSR enters a valid card in the 'Card #' textbox$")
    public void csr_enters_a_valid_card_in_the_card_textbox() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_CreditCard_number_in_Payment_page();
    }

    @Then("^an image is shown to the far right in the 'Card #' textbox$")
    public void an_image_is_shown_to_the_far_right_in_the_card_textbox() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_verify_CreditCard_number_image_shows_correctly_in_Payment_page();
    }

    @And("^CSR submits the order$")
    public void csr_submits_the_order() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_submit_the_Order();
    }

    @Then("^the country field is selected \\[Canada\\] by default$")
    public void the_country_field_is_selected_canada_by_default() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_verify_default_country_option_Payment_page();
    }

    @And("^the country field drop down has \\[United States\\] option$")
    public void the_country_field_drop_down_has_united_states_option() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_verify_country_dropdown_list_option_Payment_page();
    }

    @And("^CSR selects 'United States' in the 'Country' drop\\-down$")
    public void csr_selects_united_states_in_the_country_dropdown() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_selects_Country_in_Payment_page();
    }

    @Then("^the 'Postal Code' label changes to 'Zip' label$")
    public void the_postal_code_label_changes_to_zip_label() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_verify_the_label_changes_to_ZIP_in_Payment_page();
    }

    @And("^the 'Province' label changes to 'State' label$")
    public void the_province_label_changes_to_state_label() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_verify_the_label_changes_to_STATE_in_Payment_page();
    }

    @And("^CSR enters invalid phone number without hyphens in the 'Phone Number' textbox$")
    public void csr_enters_invalid_phone_number_without_hyphens_in_the_phone_number_textbox() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_PhoneNumber_in_Payment_page();
    }

    @And("^CSR clicks outside the textbox of Phone Number field$")
    public void csr_clicks_outside_the_textbox_of_phone_number_field() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_perform_TabOut_PhoneNumber_in_Payment_page();
    }

    @Then("^the an error message should be displayed$")
    public void the_an_error_message_should_be_displayed() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_verify_error_popup_displayed_for_PhoneNumber_fld_in_Payment_page();
    }

    @And("^CSR enters amount in credit card field and clicks on outside$")
    public void csr_enters_amount_in_credit_card_field_and_clicks_on_outside() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_amt_paid_by_creditCard_in_paymentPage();
    }

    @Then("^CSR only see first two values after decimal point in credit card field$")
    public void csr_only_see_first_two_values_after_decimal_point_in_credit_card_field() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_validate_the_decimal_vals_for_creditCard_fld_in_paymentPage();
    }

    @And("^CSR enters amount in purchase order field and clicks on outside$")
    public void csr_enters_amount_in_purchase_order_field_and_clicks_on_outside() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_amt_paid_by_Purchase_Order_in_paymentPage();
    }

    @Then("^CSR only see first two values after decimal point in purchase order field$")
    public void csr_only_see_first_two_values_after_decimal_point_in_purchase_order_field() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_validate_the_decimal_vals_for_PurchaseOrder_fld_in_paymentPage();
    }

    @Then("^CSR sees the amount in \\[PO fld\\] that is the difference between total amount and \\[Amount Less than Total Amount\\]$")
    public void csr_sees_the_amount_in_po_fld_that_is_the_difference_between_total_amount_and_amount_less_than_total_amount() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_validate_Amount_to_be_paid_by_PO_val_Payment_page();
    }

    @And("^CSR enters \\[Amount Less than Total Amount\\] in \\[PO fld\\]$")
    public void csr_enters_amount_less_than_total_amount_in_po_fld() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_amount_to_be_paid_in_PO_Payment_page();
    }

    @When("^CSR clicks outside the Cheque fld textbox$")
    public void csr_clicks_outside_the_cheque_fld_textbox() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_perform_Enter_key_after_enter_amount_to_be_paid_in_Cheques_Payment_page();
    }

    @When("^CSR clicks outside the PO fld textbox$")
    public void csr_clicks_outside_the_po_fld_textbox() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_perform_Enter_key_after_enter_amount_to_be_paid_in_PurchaseOrder_Payment_page();
    }

    @Then("^CSR sees the amount 0\\.00 in \\[PO fld\\]$")
    public void csr_sees_the_amount_000_in_po_fld() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_validate_Amount_to_be_paid_by_PO_val_is_0_Payment_page();
    }

    @And("^CSR enters \\[Amount More than Total Amount\\] in \\[PO fld\\]$")
    public void csr_enters_amount_more_than_total_amount_in_po_fld() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_morethan_Tot_amount_to_be_paid_in_PurchaseOrder_Payment_page();
    }

    @And("^CSR enters the total amount in \\[PO fld\\]$")
    public void csr_enters_the_total_amount_in_po_fld() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_same_Tot_amount_to_be_paid_in_PurchaseOrder_Payment_page();
    }

    @And("^CSR enters card information$")
    public void csr_enters_card_information() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.fill_new_CreditCard();
    }

    //############################################## Story 2031 ##################################################
    @Then("^the label 'Amount Paid by Credit Card' and 'Amount Paid by Purchase Order' displays in the Payment section$")
    public void the_label_Amount_Paid_by_Credit_Card_and_Amount_Paid_by_Purchase_Order_displays_in_the_Payment_section() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_sees_Amount_Paid_by_Credit_Card_label();
        checkoutPage.CSR_sees_Amount_Paid_by_PO_label();
    }

    @And("^CSR enters amount paid for PO$")
    public void csr_enters_amount_paid_for_PO() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_amount_for_PO();
    }

    @Then("^the amount entered is displayed for PO$")
    public void the_amount__entered_is_displayed_for_PO$() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_sees_the_dollar_amount_entered_for_PO();
    }

    @Then("^the amount for PO is the same as amount owing$")
    public void the_amount_for_PO_is_the_same_as_amount_owing$() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_sees_the_same_amount_for_PO_and_Total_Owing();
    }

    @Then("^the amount is displayed for credit card as remaining from PO amount$")
    public void the_amount_is_displayed_for_credit_card_as_remaining_from_PO_amount$() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_sees_the_remaining_dollar_amount_for_credit_card();
    }

    @Then("^the label 'Amount Paid by Purchase Order' displays in the Payment section$")
    public void the_label_Amount_Paid_by_Purchase_Order_displays_in_the_Payment_section() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_sees_Amount_Paid_by_PO_label();
    }

    @And("^CSR enters the total amount in \\[Creidt Card fld\\]$")
    public void csr_enters_the_total_amount_in_creidt_card_fld() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_same_Tot_amount_to_be_paid_in_Credit_card_Payment_page();
    }

    @And("^CSR clicks outside the textbox$")
    public void csr_clicks_outside_the_textbox() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_perform_Enter_key_after_enter_amount_to_be_paid_in_Credit_card_Payment_page();
    }

    @And("^CSR enters \\[Amount Less than Total Amount\\] in \\[Creidt Card fld\\]$")
    public void csr_enters_amount_less_than_total_amount_in_creidt_card_fld() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_amount_to_be_paid_in_Credit_card_Payment_page();
    }

    @And("^CSR enters \\[Amount More than Total Amount\\] in \\[Creidt Card fld\\]$")
    public void csr_enters_amount_more_than_total_amount_in_creidt_card_fld() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_morethan_Tot_amount_to_be_paid_in_Credit_card_Payment_page();
    }

    @And("^teacher lands on Submitted page(\\d+)$")
    public void teacher_lands_on_Submitted_page(int arg1) throws Throwable {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        ConfirmAndSubmitOrder confirmAndSubmitOrder =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        confirmAndSubmitOrder.verifyConfirmationPrint();
    }

    @And("^selected item displays in Current Selection section(\\d+)$")
    public void selected_item_displays_in_Current_Selection_section(int arg1) throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        // checkoutPage.getYourCurrentSelectionSection();
        checkoutPage.verifyYourCurrentSelectionSection();
    }


    @And("^parent clicks on YES button$")
    public void parent_clicks_on_yes_button() throws Throwable {
        TeachersHomePage teachhomepge = new TeachersHomePage();
        teachhomepge.YES_to_delete_item_in_ReviewCart_page();
    }


    //################################################# SCSCOD-6238 ########################################################
    @When("^CSR applies redeemable bonus bank amount for Student Club items$")
    public void csr_applies_redeemable_bonus_bank_amount_for_Student_Club_items() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_redeemable_amount_in_Student_Club_bonus();
    }

    @Then("^Bonus Bank amount is reduced by the redeemed amount$")
    public void bonus_Bank_amount_is_reduced_by_the_redeemed_amount() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.bonus_bank_reduced_by_redeemable_amount();
    }

    @When("^CSR redeemable applies bonus bank amount for Teacher Catalogue items$")
    public void csr_redeemable_applies_bonus_bank_amount_for_Teacher_Catalogue_items() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_redeemable_amount_in_Teacher_Catalogue_bonus();
    }

    @When("^CSR redeemable applies bonus bank amount for Paid Shipping$")
    public void csr_redeemable_applies_bonus_bank_amount_for_Paid_Shipping() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_redeemable_amount_in_Shippinge_bonus();
    }

    @When("^CSR removes redeemable bonus bank amount for Student Club items$")
    public void csr_removes_redeemable_bonus_bank_amount_for_Student_Club_items() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.csr_remove_amount_in_Student_Club_bonus();
    }

    @When("^CSR clicks on Apply in shipping section$")
    public void csr_clicks_on_apply_in_shipping_section() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.click_on_Apply_in_Shipping_section();
    }

    @When("^CSR removes redeemable bonus bank amount for Teacher Catalogue items$")
    public void csr_removes_redeemable_bonus_bank_amount_for_Teacher_Catalogue_items() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.csr_remove_amount_in_Teacher_Catalogue_bonus();
    }

    @When("^CSR removes redeemable bonus bank amount for Paid Shipping$")
    public void csr_removes_redeemable_bonus_bank_amount_for_Paid_Shipping() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.csr_remove_amount_in_Paid_Shipping_bonus();
    }

    @Then("^Bonus Bank amount is same as before$")
    public void bonus_Bank_amount_is_same_as_before() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.bonus_bank_amount_is_the_same_as_before();
    }


    @And("^teacher have entered search query with valid ItemNo$")
    public void teacherHaveEnteredSearchQueryWithValidItemNo() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.GlobalSearch(
                TestBaseProvider.getTestBase().getTestData().getString("itemNo"));
    }

    @When("^teacher click on search$")
    public void teacherClickOnSearch() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.clickSearchOnbGlobalSearchBar();

    }


    @Then("^the search result returns single match,Teacher is navigated to the PDP for the matching product$")
    public void theSearchResultReturnsSingleMatchTeacherIsNavigatedToThePDPForTheMatchingProduct() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.verifyOnlyOneSearchResultDisplaysHomePage(
                TestBaseProvider.getTestBase().getTestData().getString("itemNo"));


    }

    @And("^teacher enters an Unique Item # in search bar$")
    public void teacherEntersAnUniqueItemInSearchBar() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.GlobalSearchUniqueItemID(
                TestBaseProvider.getTestBase().getTestData().getString("itemNo"));
    }

    @And("^the search result returns single match$")
    public void theSearchResultReturnsSingleMatch() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.verifyOnlyOneSearchResultDisplaysHomePage(
                TestBaseProvider.getTestBase().getTestData().getString("itemNo"));
    }

    @Then("^teacher is navigated to the PDP for the matching product$")
    public void teacherIsNavigatedToThePDPForTheMatchingProduct() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();

        iStudentFlyerOrdersPage.uniqueItemDisplayProductDetailPage(
                TestBaseProvider.getTestBase().getTestData().getString("BookTitle"));

    }

    @And("^the review cart page displays the searched item$")
    public void theReviewCartPageDisplaysTheSearchedItem() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();

        iStudentFlyerOrdersPage.verifyReviewYourCartpageSingleItemShow
                (TestBaseProvider.getTestBase().getTestData().getString("itemName"));
    }

    @And("^teacher have entered search query with In-valid ItemNo$")
    public void teacherHaveEnteredSearchQueryWithInValidItemNo() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.GlobalSearch(
                TestBaseProvider.getTestBase().getTestData().getString("itemNo"));

    }


    @When("^teacher click on the Item# on the Review Cart page$")
    public void teacherClickOnTheItemOnTheReviewCartPage() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.clickItemNoReviewCartPage(TestBaseProvider.getTestBase().getTestData().getString("itemNo"));


    }

    @And("^teacher should see the correct item number in the Confirm and Submit page$")
    public void teacherShouldSeeTheCorrectItemNumberInTheConfirmAndSubmitPage() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();

        iStudentFlyerOrdersPage.displayedItemNoConfirmSubmitPage(TestBaseProvider.getTestBase().getTestData().getString("itemNo"));

    }

    @And("^correct item number should be displayed$")
    public void correctItemNumberShouldBeDisplayed() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.displayedItemNoConfirmSubmitPage(
                TestBaseProvider.getTestBase().getTestData().getString("itemNo"));


    }

    @And("^item# field on the PDP displays the same Item# used in search bar$")
    public void itemFieldOnThePDPDisplaysTheSameItemUsedInSearchBar() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.verifyItemNoPDPpage(
                TestBaseProvider.getTestBase().getTestData().getString("itemNo"));

    }

    @Then("^the CSR will be re-directed to the \\[Order Source\\] page$")
    public void theCSRWillBeReDirectedToTheOrderSourcePage() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.csr_verifyItemSourcePage();


    }

    @And("^is presented with a modal window with the title \\[Order Confirmation\\]$")
    public void isPresentedWithAModalWindowWithTheTitleOrderConfirmation() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.csr_verifyItemSourceDialogueTitle();


    }


    @And("^a X icon is present on the top-right of the window$")
    public void a_X_icon_is_present_on_the_top_right_of_the_window() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.csr_verifyItemSourceDialogue_closeIcon();

    }


    @And("^the text is displayed with order ref no$")
    public void the_text_is_displayed_with_order_ref_no() throws Throwable {
        IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.csr_verifyItemSourceDialogue_refNo();
    }

    @When("^CSR clicks on the X$")
    public void CSR_clicks_on_the_X() throws Throwable {
        StudentFlyerOrdersPage sfop = new StudentFlyerOrdersPage();
        sfop.getcsr_orderConfirmation_popup_closeIcon().click();
    }

    @Then("^the \\[Order Confirmation\\] window is closed$")
    public void the_Order_Confirmation_window_is_closed() throws Throwable {
        StudentFlyerOrdersPage sfop = new StudentFlyerOrdersPage();
        if (sfop.getcsr_orderConfirmation_popup_closeIcon().isDisplayed()) {
            Assert.fail("Order Confirmation popup should be closed");
        }
    }
    @And("^the message \"([^\"]*)\" will not be displayed$")
    public void the_message_will_not_be_displayed(String arg1) throws Throwable {
        StudentFlyerOrdersPage sfop = new StudentFlyerOrdersPage();
        if (sfop.getcsrMessage_Text_OrderConfirm_Popup().size() == 3) {
            String div_value = sfop.getcsrMessage_Text_OrderConfirm_Popup().get(2).getText();
            Assert.fail("Order Confirmation email message should not be displayed  " + div_value);
        }
    }


    @Given("^teacher prints the data from Excel$")
    public void teacher_prints_the_data_from_excel() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.ToGetExcelData();
    }

    @When("^teacher enters free shipping coupon and clicks on apply$")
    public void teacher_enters_free_shipping_coupon_and_clicks_on_apply() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_unique_coupon_code_in_Redeem_Rewards_page();
    }

    @Then("^free shipping coupon is applied to order$")
    public void free_shipping_coupon_is_applied_to_order() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Verify_applied_couon_is_added_and_shipping_charge_is_free_in_Redemptions_page();
    }

    @And("^User creates the data in BM and set the Role and save it to the Excel file$")
    public void user_creates_the_data_in_bm_and_set_the_role_and_save_it_to_the_excel_file() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.BM_User_Creation();
    }

    @And("^Password set for the BM users$")
    public void password_set_for_the_bm_users() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.BM_Password_set_for_BM_Users();
    }


    //######################################### SCSCOD-6165 CSR ##################################################################
    @And("^CSR applies redeemable paper coupon amount as the same for total amount for Student Club items$")
    public void csr_applies_redeemable_paper_coupon_amount_as_the_same_for_total_amount_for_Student_Club_items
    ()throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Paper_Bonus_Coupon_Equal_To_StudentClubTotal_Amount();
    }


    @And("^CSR redeemable applies bonus bank amount as the same for total amount for Teacher Catalogue items$")
    public void csr_redeemable_applies_bonus_bank_amount_as_the_same_for_total_amount_for_Teacher_Catalogue_items
            ()throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Bonus_Bank_Equal_To_TeacherClubTotal_Amount();
    }

    @And("^CSR applies redeemable bonus bank as the same for total amount for Paid Shipping$")
    public void csr_applies_redeemable_bonus_bank_as_the_same_for_total_amount_for_Paid_Shipping ()throws Throwable
    {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_shipping_Bonus_Bank_which_is_equal_to_ShippingCharge_Tot_amt();
    }
    //######################################### SCSCOD-6165 CSR ##################################################################

    //######################################### SCSCOD-6165 TCOD ##################################################################
    @And("^teacher applies redeemable paper coupon amount for Student Club items$")
    public void teacher_applies_redeemable_paper_coupon_amount_for_Student_Club_items ()throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_student_Paper_Bonus_Coupon_Equal_To_StudentClubTotal_Amount();
    }

    @And("^teacher applies redeemable bonus bank amount for Teacher Catalogue items$")
    public void teacher_applies_redeemable_bonus_bank_amount_for_Teacher_Catalogue_items ()throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_teacher_Bonus_Bank_Equal_To_TeacherClubTotal_Amount();
    }

    @And("^teacher applies redeemable bonus bank amount for Paid Shipping$")
    public void teacher_applies_redeemable_bonus_bank_amount_for_Paid_Shipping ()throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.enter_amount_in_shipping_Bonus_Bank_which_is_equal_to_ShippingCharge_Tot_amt();
    }
    //######################################### SCSCOD-6165 TCOD ##################################################################

    @And("^the message “to enter” will not be displayed$")
    public void the_message_will_not_be_displayed() throws Throwable {
        StudentFlyerOrdersPage sfop = new StudentFlyerOrdersPage();
        if (sfop.getcsrMessage_Text_OrderConfirm_Popup().size() == 3) {
            String div_value = sfop.getcsrMessage_Text_OrderConfirm_Popup().get(2).getText();
            Assert.fail("Order Confirmation email message should not be displayed  " + div_value);
        }
    }

    //######################################### SCSCOD-6119 ##################################################################
    @And("^CSR enters amount paid for PO as the same as the total order amount$")
    public void csr_enters_amount_paid_for_PO_as_the_same_as_the_total_order_amount ()throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_same_total_amount_in_PO_amount();
    }

    @Given("^CSR enters amount paid for credit card as the same as the total order amount$")
    public void csr_enters_amount_paid_for_credit_card_as_the_same_as_the_total_order_amount ()throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_enters_same_total_amount_in_credit_card_amount();
    }

    @Then("^the label 'Amount Paid by Credit Card' displays in the Payment section$")
    public void the_label_Amount_Paid_by_Credit_Card_displays_in_the_Payment_section ()throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_sees_Amount_Paid_by_Credit_Card_label();
    }

    @Then("^the amount entered is displayed for credit card$")
    public void the_amount_entered_is_displayed_for_credit_card ()throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_sees_the_amount_entered_for_credit_card();

    }

    @Then("^the items displayed in Free pick modal is sorted on Price high to low$")
    public void theItemsDisplayedInFreePickModalIsSortedOnPriceHighToLow() throws Throwable {
        //Manual Test
    }

    @And("^teacher click on price header on the modal$")
    public void teacherClickOnPriceHeaderOnTheModal() throws Throwable {
        // Manual Test
    }

    @And("^items are sorted by price$")
    public void itemsAreSortedByPrice() throws Throwable {
        // Manual Test
    }

    @And("^Free Pick selected modal is displayed$")
    public void free_pick_selected_modal_is_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.freepick_modal_confirmSelectionGrid();
    }

    @And("^the selected freeItem is displayed$")
    public void the_selected_freeitem_is_displayed() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.freepickItemselected();

    }

    @When("^teacher click on “X” button$")
    public void teacher_click_on_x_button() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.closeFreepickmodal_crossicon();
    }

    @Then("^the Free Pick Modal close$")
    public void the_free_pick_modal_close() throws Throwable {
        ICartPage page = getFactory().getICartPage();
        page.getICouponSection().verifyCouponModalNotdisplayed();

    }

    @When("^teacher click on “CANCEL” button$")
    public void teacher_click_on_cancel_button() throws Throwable {
        ICartPage page = getFactory().getICartPage();
        page.getICouponSection().click_Cancel_closethefreepick_modal();
        //;
    }

    @When("^Free pick modal is closed by X button$")
    public void freePickModalIsClosedByXButton() throws Throwable {
        ICartPage page = getFactory().getICartPage();
        page.getICouponSection().click_close_closethefreepick_modal();
    }

    @Then("^Free pick modal closes and SFO page is displayed$")
    public void freePickModalClosesAndSFOPageIsDisplayed() throws Throwable {
        ICartPage page = getFactory().getICartPage();
        page.getICouponSection().validate_sfopage_freepick_coupon_display();
    }

    @And("^SFO pages displays error message for coupon$")
    public void sfoPagesDisplaysErrorMessageForCoupon() throws Throwable {
        ICartPage page = getFactory().getICartPage();
        page.getICouponSection().validate_sfopage_freepick_coupon_error();
    }

    @And("^the coupon code and Student name is displayed on SFO$")
    public void theCouponCodeAndStudentNameIsDisplayedOnSFO() throws Throwable {
        // Then Free pick modal closes and SFO page is displayed covers this valisation

    }

    @And("^SFO pages displays coupon code which is hyperlink$")
    public void sfoPagesDisplaysCouponCodeWhichIsHyperlink() throws Throwable {
        ICartPage page = getFactory().getICartPage();
        page.getICouponSection().validate_sfopage_freepick_coupon_code_hyperlink();
    }

    @When("^teacher click on the coupon hyperlink$")
    public void teacherClickOnTheCouponHyperlink() throws Throwable {
        // this is validated in validate_sfopage_freepick_coupon_code_hyperlink()

    }

    @Given("^teacher is new to RCO clubs and placed an order who earned a New Teacher Kit Automatic Reward along with Free Item, DTS and Free pick$")
    public void teacherIsNewToRCOClubsAndPlacedAnOrderWhoEarnedANewTeacherKitAutomaticRewardAlongWithFreeItemDTSAndFreePick() throws Throwable {
        ILoginPage homePage = getFactory().getILoginPage();
        homePage.closeButton_in_LoginPage();
        System.out.println("User ID......................"
                + TestBaseProvider.getTestBase().getTestData().getString("userid"));
        System.out.println("PAssword..................."
                + TestBaseProvider.getTestBase().getTestData().getString("password"));
        homePage.doLogin2(TestBaseProvider.getTestBase().getTestData().getString("userid"),
                TestBaseProvider.getTestBase().getTestData().getString("password"),
                false);
        PauseUtil.pause(1000);
        //teachersHomePage.verifyPage();
        PauseUtil.waitForAjaxToComplete(2000);
        ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
        StudentFlyerOrdersPage stdpage = new StudentFlyerOrdersPage();
        teachersHomePage.selectOptionFromTeacherHomePage(ConstantUtils.ENTERORDER);
        for(int i=0;i<=3;i++){
            if(stdpage.sizegrade_Seesaw().size()==0){
                teachersHomePage.selectOptionFromTeacherHomePage(ConstantUtils.ENTERORDER);
                Thread.sleep(4000);
            }

        }
        IStudentFlyerOrdersPage studentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.Teacher_adds_items_from_different_Student_and_Teacher_clubs_2();

        ICartPage cartpage = getFactory().getICartPage();
        cartpage.clickOn_btnReviewCart();

        ICartPage cartPage = getFactory().getICartPage();
        CartPage crtpge = new CartPage();
        cartPage.clickOn_ProceedToCheckoutBtn();
        PauseUtil.pause(2500);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);
        SCHUtils.waitForLoaderToDismiss();
        if (SCHUtils.isPresent(crtpge.getbtntopBonuspointModelProceedToCheckout())) {
            SCHUtils.clickUsingJavaScript(crtpge.getbtntopBonuspointModelProceedToCheckout());
            PauseUtil.pause(1000);
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete();
        }
        Assert.assertTrue(cartPage.is_RewardsAndCouponsActive_dislayed(), "RewardsAndCoupon page is not displayed");




        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        //checkoutPage.navigateToPaymentsPage();
        checkoutPage.teacher_navigate_to_payment_page();
        PauseUtil.pause(5000);


        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        //ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CHECKPAYMENTMETHOD);
        PauseUtil.pause(5000);

        //ShippingAndPayment shippingAndPaymentPage =
        getFactory().getICheckoutPage().getShippingAndPaymentSection();

        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
        SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);

        ICheckoutPage_2 checkoutPage1 = getFactory().getICheckoutPage_2();
        checkoutPage1.submit_the_Order();
    }

    @Then("^Teacher Clubs Amount Owing becomes\\$(\\d+)$")
    public void teacherClubsAmountOwingBecomes$(int arg0) throws Throwable {

    }



    //######################################### SCSCOD-6165 CSR ##################################################################
   /*
    @And("^CSR applies redeemable paper coupon amount as the same for total amount for Student Club items$")
    public void csr_applies_redeemable_paper_coupon_amount_as_the_same_for_total_amount_for_Student_Club_items() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.enter_amount_in_student_Paper_Bonus_Coupon_Equal_To_StudentClubTotal_Amount();
    }

    @And("^CSR redeemable applies bonus bank amount as the same for total amount for Teacher Catalogue items$")
    public void csr_redeemable_applies_bonus_bank_amount_as_the_same_for_total_amount_for_Teacher_Catalogue_items() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.enter_amount_in_teacher_Paper_Bonus_Coupon_Equal_To_TeacherClubTotal_Amount();
    }
    */
    //######################################### SCSCOD-6165 TCOD ##################################################################
   /* @And("^teacher applies redeemable paper coupon amount for Student Club items$")
    public void teacher_applies_redeemable_paper_coupon_amount_for_Student_Club_items() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.enter_amount_in_student_Paper_Bonus_Coupon_Equal_To_StudentClubTotal_Amount();
    }

    @And("^teacher applies redeemable bonus bank amount for Teacher Catalogue items$")
    public void teacher_applies_redeemable_bonus_bank_amount_for_Teacher_Catalogue_items() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.enter_amount_in_teacher_Paper_Bonus_Coupon_Equal_To_TeacherClubTotal_Amount();
    }*/

   /* @Then("^the amount entered is displayed for credit card$")
    public void the_amount_entered_is_displayed_for_credit_card() throws Throwable {
    	ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		checkoutPage.CSR_sees_the_amount_entered_for_credit_card();
    }*/

    @Then("^teacher sees the SFO section in Redemptions & Rewards page$")
    public void teacher_sees_the_sfo_section_in_redemptions_rewards_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_sees_SFO_section_Rewards_page();
    }

    @And("^SFO subtotal,Qty,GST,QST and Total displays correctly$")
    public void sfo_subtotalqtygstqst_and_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_SFO_section_subtotal_Total_GST_QST_Rewards_page();
    }

    @And("^SFO subtotal,Qty,GST,PST,Total and Cart Total displays correctly$")
    public void sfo_subtotalqtygstpsttotal_and_cart_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_SFO_section_subtotal_Total_GST_PST_Rewards_page();
    }

    @And("^SFO subtotal,Qty,HST,Total and Cart Total displays correctly$")
    public void sfo_subtotalqtyhsttotal_and_cart_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_SFO_section_subtotal_Total_HST_Rewards_page();
    }

    @And("^SFO subtotal,Qty,GST,Total and Cart Total displays correctly$")
    public void sfo_subtotalqtygsttotal_and_cart_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_SFO_section_subtotal_Total_GST_Rewards_page();
    }

    @And("^No taxes are charged for QC and SFO subtotal,Qty,Total and Cart Total displays correctly$")
    public void no_taxes_are_charged_for_qc_and_sfo_subtotalqtytotal_and_cart_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_SFO_section_subtotal_Total_GST_QST_Rewards_page();
    }

    @And("^No taxes are charged for BC and SFO subtotal,Qty,Total and Cart Total displays correctly$")
    public void no_taxes_are_charged_for_bc_and_sfo_subtotalqtytotal_and_cart_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_SFO_section_subtotal_Total_GST_PST_Rewards_page();
    }

    @And("^No taxes are charged for HST and SFO subtotal,Qty,Total and Cart Total displays correctly$")
    public void no_taxes_are_charged_for_hst_and_sfo_subtotalqtytotal_and_cart_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_SFO_section_subtotal_Total_HST_Rewards_page();
    }

    @And("^No taxes are charged for GST and SFO subtotal,Qty,Total and Cart Total displays correctly$")
    public void no_taxes_are_charged_for_gst_and_sfo_subtotalqtytotal_and_cart_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_SFO_section_subtotal_Total_GST_Rewards_page();
    }

    @Then("^teacher sees the YTO section in Redemptions & Rewards page$")
    public void teacher_sees_the_yto_section_in_redemptions_rewards_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_sees_YTO_section_Rewards_page();
    }

    @And("^YTO subtotal,Qty,GST,QST and Total displays correctly$")
    public void yto_subtotalqtygstqst_and_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_YTO_section_subtotal_Total_GST_QST_Rewards_page();
    }

    @And("^YTO subtotal,Qty,GST,PST and Total displays correctly$")
    public void yto_subtotalqtygstpst_and_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_YTO_section_subtotal_Total_GST_PST_Rewards_page();
    }

    @And("^YTO subtotal,Qty,HST and Total displays correctly$")
    public void yto_subtotalqtyhst_and_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_YTO_section_subtotal_Total_HST_Rewards_page();
    }

    @And("^YTO subtotal,Qty,GST and Total displays correctly$")
    public void yto_subtotalqtygst_and_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_YTO_section_subtotal_Total_GST_Rewards_page();
    }

    @And("^No taxes are charged for QC and YTO subtotal,Qty and Total displays correctly$")
    public void no_taxes_are_charged_for_qc_and_yto_subtotalqty_and_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_YTO_section_subtotal_Total_GST_QST_Rewards_page();
    }

    @And("^No taxes are charged for BC and YTO subtotal,Qty and Total displays correctly$")
    public void no_taxes_are_charged_for_bc_and_yto_subtotalqty_and_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_YTO_section_subtotal_Total_GST_PST_Rewards_page();
    }

    @And("^No taxes are charged for HST and YTO subtotal,Qty and Total displays correctly$")
    public void no_taxes_are_charged_for_hst_and_yto_subtotalqty_and_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_YTO_section_subtotal_Total_HST_Rewards_page();
    }

    @And("^No taxes are charged for GST and YTO subtotal,Qty and Total displays correctly$")
    public void no_taxes_are_charged_for_gst_and_yto_subtotalqty_and_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_YTO_section_subtotal_Total_GST_Rewards_page();
    }

    @Then("^teacher sees the Teacher Exclusives section in Redemptions & Rewards page$")
    public void teacher_sees_the_teacher_exclusives_section_in_redemptions_rewards_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_sees_TE_section_Rewards_page();
    }

    @And("^Teacher Exclusives subtotal,Qty,GST,QST and Total displays correctly$")
    public void teacher_exclusives_subtotalqtygstqst_and_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_TE_section_subtotal_Total_GST_QST_Rewards_page();
    }

    @And("^Teacher Exclusives subtotal,Qty,GST,PST and Total displays correctly$")
    public void teacher_exclusives_subtotalqtygstpst_and_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_TE_section_subtotal_Total_GST_PST_Rewards_page();
    }

    @And("^Teacher Exclusives subtotal,Qty,HST and Total displays correctly$")
    public void teacher_exclusives_subtotalqtyhst_and_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_TE_section_subtotal_Total_HST_Rewards_page();
    }

    @And("^Teacher Exclusives subtotal,Qty,GST and Total displays correctly$")
    public void teacher_exclusives_subtotalqtygst_and_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_TE_section_subtotal_Total_GST_Rewards_page();
    }

    @And("^No taxes are charged for QC and Teacher Exclusives subtotal,Qty and Total displays correctly$")
    public void no_taxes_are_charged_for_qc_and_teacher_exclusives_subtotalqty_and_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_TE_section_subtotal_Total_GST_QST_Rewards_page();
    }

    @And("^No taxes are charged for BC and Teacher Exclusives subtotal,Qty and Total displays correctly$")
    public void no_taxes_are_charged_for_bc_and_teacher_exclusives_subtotalqty_and_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_TE_section_subtotal_Total_GST_PST_Rewards_page();
    }

    @And("^No taxes are charged for HST and Teacher Exclusives subtotal,Qty and Total displays correctly$")
    public void no_taxes_are_charged_for_hst_and_teacher_exclusives_subtotalqty_and_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_TE_section_subtotal_Total_HST_Rewards_page();
    }

    @And("^No taxes are charged for GST and Teacher Exclusives subtotal,Qty and Total displays correctly$")
    public void no_taxes_are_charged_for_gst_and_teacher_exclusives_subtotalqty_and_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_TE_section_subtotal_Total_GST_Rewards_page();
    }

    @Then("^teacher sees the SFO,YTO and Teacher Exclusives sections in Redemptions & Rewards page$")
    public void teacher_sees_the_sfoyto_and_teacher_exclusives_sections_in_redemptions_rewards_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_sees_SFO_section_Rewards_page();
        checkoutPage.teacher_sees_YTO_section_Rewards_page();
        checkoutPage.teacher_sees_TE_section_Rewards_page();
    }

    @And("^SFO,YTO and Teacher Exclusives GST, QST and Totals displays correctly$")
    public void sfoyto_and_teacher_exclusives_gst_qst_and_totals_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_SFO_section_subtotal_Total_GST_QST_Rewards_page();
        checkoutPage.validate_YTO_section_subtotal_Total_GST_QST_Rewards_page();
        checkoutPage.validate_TE_section_subtotal_Total_GST_QST_Rewards_page();
    }

    @And("^SFO,YTO and Teacher Exclusives GST, PST and Totals displays correctly$")
    public void sfoyto_and_teacher_exclusives_gst_pst_and_totals_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_SFO_section_subtotal_Total_GST_PST_Rewards_page();
        checkoutPage.validate_YTO_section_subtotal_Total_GST_PST_Rewards_page();
        checkoutPage.validate_TE_section_subtotal_Total_GST_PST_Rewards_page();
    }

    @And("^SFO,YTO and Teacher Exclusives HST and Totals displays correctly$")
    public void sfoyto_and_teacher_exclusives_hst_and_totals_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_SFO_section_subtotal_Total_HST_Rewards_page();
        checkoutPage.validate_YTO_section_subtotal_Total_HST_Rewards_page();
        checkoutPage.validate_TE_section_subtotal_Total_HST_Rewards_page();
    }

    @And("^SFO,YTO and Teacher Exclusives GST and Totals displays correctly$")
    public void sfoyto_and_teacher_exclusives_gst_and_totals_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_SFO_section_subtotal_Total_GST_Rewards_page();
        checkoutPage.validate_YTO_section_subtotal_Total_GST_Rewards_page();
        checkoutPage.validate_TE_section_subtotal_Total_GST_Rewards_page();
    }

    @And("^No taxes are charged for QC and SFO,YTO,Teacher Exclusives Totals displays correctly$")
    public void no_taxes_are_charged_for_qc_and_sfoytoteacher_exclusives_totals_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_SFO_section_subtotal_Total_GST_QST_Rewards_page();
        checkoutPage.No_tax_validation_of_YTO_section_subtotal_Total_GST_QST_Rewards_page();
        checkoutPage.No_tax_validation_of_TE_section_subtotal_Total_GST_QST_Rewards_page();
    }

    @And("^No taxes are charged for BC and SFO,YTO,Teacher Exclusives Totals displays correctly$")
    public void no_taxes_are_charged_for_bc_and_sfoytoteacher_exclusives_totals_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_SFO_section_subtotal_Total_GST_PST_Rewards_page();
        checkoutPage.No_tax_validation_of_YTO_section_subtotal_Total_GST_PST_Rewards_page();
        checkoutPage.No_tax_validation_of_TE_section_subtotal_Total_GST_PST_Rewards_page();
    }

    @And("^No taxes are charged for HST and SFO,YTO,Teacher Exclusives Totals displays correctly$")
    public void no_taxes_are_charged_for_hst_and_sfoytoteacher_exclusives_totals_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_SFO_section_subtotal_Total_HST_Rewards_page();
        checkoutPage.No_tax_validation_of_YTO_section_subtotal_Total_HST_Rewards_page();
        checkoutPage.No_tax_validation_of_TE_section_subtotal_Total_HST_Rewards_page();
    }

    @And("^No taxes are charged for GST and SFO,YTO,Teacher Exclusives Totals displays correctly$")
    public void no_taxes_are_charged_for_gst_and_sfoytoteacher_exclusives_totals_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_SFO_section_subtotal_Total_GST_Rewards_page();
        checkoutPage.No_tax_validation_of_YTO_section_subtotal_Total_GST_Rewards_page();
        checkoutPage.No_tax_validation_of_TE_section_subtotal_Total_GST_Rewards_page();
    }

    @When("^teacher applies Credit Notes in SFO section$")
    public void teacher_applies_credit_notes_in_sfo_section() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_applies_CreditNotes_for_SFO_section_in_Rewards_page();
    }

    @Then("^SFO subtotal,Qty,GST,QST and Total displays correctly after redeem the Credit Notes$")
    public void sfo_subtotalqtygstqst_and_total_displays_correctly_after_redeem_the_credit_notes() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_Applied_CreditNotes_SFO_section_subtotal_Total_GST_QST_Rewards_page();
    }

    @Then("^SFO subtotal,Qty,GST,PST and Total displays correctly after redeem the Credit Notes$")
    public void sfo_subtotalqtygstpst_and_total_displays_correctly_after_redeem_the_credit_notes() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_Applied_CreditNotes_SFO_section_subtotal_Total_GST_PST_Rewards_page();
    }

    @Then("^SFO subtotal,Qty,HST and Total displays correctly after redeem the Credit Notes$")
    public void sfo_subtotalqtyhst_and_total_displays_correctly_after_redeem_the_credit_notes() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_Applied_CreditNotes_SFO_section_subtotal_Total_HST_Rewards_page();
    }

    @Then("^SFO subtotal,Qty,GST and Total displays correctly after redeem the Credit Notes$")
    public void sfo_subtotalqtygst_and_total_displays_correctly_after_redeem_the_credit_notes() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_Applied_CreditNotes_SFO_section_subtotal_Total_GST_Rewards_page();
    }

    @When("^teacher applies Bonus Bank in YTO section$")
    public void teacher_applies_bonus_bank_in_yto_section() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_applies_BonusBank_for_YTO_section_in_Rewards_page();
    }

    @And("^teacher applies Credit Notes in YTO section$")
    public void teacher_applies_credit_notes_in_yto_section() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_applies_CreditNotes_for_YTO_section_in_Rewards_page();
    }

    @Then("^YTO subtotal,Qty,GST,QST and Total displays correctly after redeem the Credit Notes and Bonus Bank$")
    public void yto_subtotalqtygstqst_and_total_displays_correctly_after_redeem_the_credit_notes_and_bonus_bank() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_Applied_BonusBank_CreditNotes_YTO_section_subtotal_Total_GST_QST_Rewards_page();
    }

    @Then("^YTO subtotal,Qty,GST,PST and Total displays correctly after redeem the Credit Notes and Bonus Bank$")
    public void yto_subtotalqtygstpst_and_total_displays_correctly_after_redeem_the_credit_notes_and_bonus_bank() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_Applied_BonusBank_CreditNotes_YTO_section_subtotal_Total_GST_PST_Rewards_page();
    }

    @Then("^YTO subtotal,Qty,HST and Total displays correctly after redeem the Credit Notes and Bonus Bank$")
    public void yto_subtotalqtyhst_and_total_displays_correctly_after_redeem_the_credit_notes_and_bonus_bank() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_Applied_BonusBank_CreditNotes_YTO_section_subtotal_Total_HST_Rewards_page();
    }

    @Then("^YTO subtotal,Qty,GST and Total displays correctly after redeem the Credit Notes and Bonus Bank$")
    public void yto_subtotalqtygst_and_total_displays_correctly_after_redeem_the_credit_notes_and_bonus_bank() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_Applied_BonusBank_CreditNotes_YTO_section_subtotal_Total_GST_Rewards_page();
    }

    @When("^teacher applies Bonus Bank in TE section$")
    public void teacher_applies_bonus_bank_in_TE_section() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_applies_BonusBank_for_TE_section_in_Rewards_page();
    }

    @And("^teacher applies Credit Notes in TE section$")
    public void teacher_applies_credit_notes_in_TE_section() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_applies_CreditNotes_for_TE_section_in_Rewards_page();
    }

    @Then("^TE subtotal,Qty,GST,QST and Total displays correctly after redeem the Credit Notes and Bonus Bank$")
    public void TE_subtotalqtygstqst_and_total_displays_correctly_after_redeem_the_credit_notes_and_bonus_bank() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_Applied_BonusBank_CreditNotes_TE_section_subtotal_Total_GST_QST_Rewards_page();
    }

    @Then("^TE subtotal,Qty,GST,PST and Total displays correctly after redeem the Credit Notes and Bonus Bank$")
    public void TE_subtotalqtygstpst_and_total_displays_correctly_after_redeem_the_credit_notes_and_bonus_bank() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_Applied_BonusBank_CreditNotes_TE_section_subtotal_Total_GST_PST_Rewards_page();
    }

    @Then("^TE subtotal,Qty,HST and Total displays correctly after redeem the Credit Notes and Bonus Bank$")
    public void TE_subtotalqtyhst_and_total_displays_correctly_after_redeem_the_credit_notes_and_bonus_bank() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_Applied_BonusBank_CreditNotes_TE_section_subtotal_Total_HST_Rewards_page();
    }

    @Then("^TE subtotal,Qty,GST and Total displays correctly after redeem the Credit Notes and Bonus Bank$")
    public void TE_subtotalqtygst_and_total_displays_correctly_after_redeem_the_credit_notes_and_bonus_bank() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validate_Applied_BonusBank_CreditNotes_TE_section_subtotal_Total_GST_Rewards_page();
    }

    @When("^teacher navigates to the \\[Payments\\] page$")
    public void teacher_navigates_to_the_payments_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_ContinueCheckout_Rewards_page();
    }

    @Then("^teacher sees the SFO section in Payment page$")
    public void teacher_sees_the_sfo_section_in_payment_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_sees_SFO_section_Payments_page();
    }

    @And("^SFO subtotal,Qty,GST,PST,SFO Total and Order Total displays correctly$")
    public void sfo_subtotalqtygstpstsfo_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_validate_SFO_totals_taxes_OrderTotal_in_Payments_page_GST_PST();
    }

    @And("^SFO subtotal,Qty,GST,QST,SFO Total and Order Total displays correctly$")
    public void sfo_subtotalqtygstqstsfo_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_validate_SFO_totals_taxes_OrderTotal_in_Payments_page_GST_QST();
    }

    @And("^SFO subtotal,Qty,HST,SFO Total and Order Total displays correctly$")
    public void sfo_subtotalqtyhstsfo_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_validate_SFO_totals_taxes_OrderTotal_in_Payments_page_HST();
    }

    @And("^SFO subtotal,Qty,GST,SFO Total and Order Total displays correctly$")
    public void sfo_subtotalqtygstsfo_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_validate_SFO_totals_taxes_OrderTotal_in_Payments_page_GST();
    }

    @And("^No taxes are charged for BC and SFO subtotal,Qty,SFO Total and Order Total displays correctly$")
    public void no_taxes_are_charged_for_bc_and_sfo_subtotalqtysfo_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_SFO_totals_OrderTotal_in_Payments_page_GST_PST();
    }

    @And("^No taxes are charged for QC and SFO subtotal,Qty,SFO Total and Order Total displays correctly$")
    public void no_taxes_are_charged_for_qc_and_sfo_subtotalqtysfo_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_SFO_totals_OrderTotal_in_Payments_page_GST_QST();
    }

    @And("^No taxes are charged for HST and SFO subtotal,Qty,SFO Total and Order Total displays correctly$")
    public void no_taxes_are_charged_for_hst_and_sfo_subtotalqtysfo_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_SFO_totals_OrderTotal_in_Payments_page_HST();
    }

    @And("^No taxes are charged for GST and SFO subtotal,Qty,SFO Total and Order Total displays correctly$")
    public void no_taxes_are_charged_for_gst_and_sfo_subtotalqtysfo_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_SFO_totals_OrderTotal_in_Payments_page_GST();
    }

    @Then("^teacher sees the YTO section in Payment page$")
    public void teacher_sees_the_yto_section_in_payment_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_sees_YTO_section_Payments_page();
    }

    @And("^YTO subtotal,Qty,GST,PST,YTO Total and Order Total displays correctly$")
    public void yto_subtotalqtygstpstyto_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_validate_YTO_totals_taxes_OrderTotal_in_Payments_page_GST_PST();
    }

    @And("^YTO subtotal,Qty,GST,QST,YTO Total and Order Total displays correctly$")
    public void yto_subtotalqtygstqstyto_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_validate_YTO_totals_taxes_OrderTotal_in_Payments_page_GST_QST();
    }

    @And("^YTO subtotal,Qty,HST,YTO Total and Order Total displays correctly$")
    public void yto_subtotalqtyhstyto_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_validate_YTO_totals_taxes_OrderTotal_in_Payments_page_HST();
    }

    @And("^YTO subtotal,Qty,GST,YTO Total and Order Total displays correctly$")
    public void yto_subtotalqtygstyto_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_validate_YTO_totals_taxes_OrderTotal_in_Payments_page_GST();
    }

    @And("^No taxes are charged for BC and YTO subtotal,Qty,YTO Total and Order Total displays correctly$")
    public void no_taxes_are_charged_for_bc_and_yto_subtotalqtyyto_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_YTO_totals_OrderTotal_in_Payments_page_GST_PST();
    }

    @And("^No taxes are charged for QC and YTO subtotal,Qty,YTO Total and Order Total displays correctly$")
    public void no_taxes_are_charged_for_qc_and_yto_subtotalqtyyto_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_YTO_totals_OrderTotal_in_Payments_page_GST_QST();
    }

    @And("^No taxes are charged for HST and YTO subtotal,Qty,YTO Total and Order Total displays correctly$")
    public void no_taxes_are_charged_for_hst_and_yto_subtotalqtyyto_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_YTO_totals_OrderTotal_in_Payments_page_HST();
    }

    @And("^No taxes are charged for GST and YTO subtotal,Qty,YTO Total and Order Total displays correctly$")
    public void no_taxes_are_charged_for_gst_and_yto_subtotalqtyyto_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_YTO_totals_OrderTotal_in_Payments_page_GST();
    }

    @Then("^teacher sees the TE section in Payment page$")
    public void teacher_sees_the_te_section_in_payment_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_sees_TE_section_Payments_page();
    }

    @And("^TE subtotal,Qty,GST,PST,TE Total and Order Total displays correctly$")
    public void te_subtotalqtygstpstte_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_validate_TE_totals_taxes_OrderTotal_in_Payments_page_GST_PST();
    }

    @And("^TE subtotal,Qty,GST,QST,TE Total and Order Total displays correctly$")
    public void te_subtotalqtygstqstte_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_validate_TE_totals_taxes_OrderTotal_in_Payments_page_GST_QST();
    }

    @And("^TE subtotal,Qty,HST,TE Total and Order Total displays correctly$")
    public void te_subtotalqtyhstte_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_validate_TE_totals_taxes_OrderTotal_in_Payments_page_HST();
    }

    @And("^TE subtotal,Qty,GST,TE Total and Order Total displays correctly$")
    public void te_subtotalqtygstte_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_validate_TE_totals_taxes_OrderTotal_in_Payments_page_GST();
    }

    @And("^No taxes are charged for BC and TE subtotal,Qty,TE Total and Order Total displays correctly$")
    public void no_taxes_are_charged_for_bc_and_te_subtotalqtyte_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_TE_totals_OrderTotal_in_Payments_page_GST_PST();
    }

    @And("^No taxes are charged for QC and TE subtotal,Qty,TE Total and Order Total displays correctly$")
    public void no_taxes_are_charged_for_qc_and_te_subtotalqtyte_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_TE_totals_OrderTotal_in_Payments_page_GST_QST();
    }

    @And("^No taxes are charged for HST and TE subtotal,Qty,TE Total and Order Total displays correctly$")
    public void no_taxes_are_charged_for_hst_and_te_subtotalqtyte_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_TE_totals_OrderTotal_in_Payments_page_HST();
    }

    @And("^No taxes are charged for GST and TE subtotal,Qty,TE Total and Order Total displays correctly$")
    public void no_taxes_are_charged_for_gst_and_te_subtotalqtyte_total_and_order_total_displays_correctly() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_TE_totals_OrderTotal_in_Payments_page_GST();
    }

    @When("^teacher navigates to \\[Confirm & Submit\\] page$")
    public void teacher_navigates_to_confirm_submit_page() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CHECKPAYMENTMETHOD);
        PauseUtil.pause(2000);

        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
        SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
    }

    @Then("^teacher sees the SFO section in Confirm & Submit page$")
    public void teacher_sees_the_sfo_section_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
    }

    @And("^added item is grouped by student name in Confirm & Submit page$")
    public void added_item_is_grouped_by_student_name_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.verify_item_grouped_by_single_Student_name_SFO_in_Confirm_Submit_page();
    }

    @And("^the student name displays correctly in Confirm & Submit page$")
    public void the_student_name_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.verify_student_name_displays_correctly_in_SFO_section_in_Confirm_Submit_page();
    }

    @And("^Student Subtotal,Qty,GST,PST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page$")
    public void student_subtotalqtygstpsttotalsfo_total_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_single_item_single_student_SFO_section_in_Confirm_Submit_page_GST_PST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:1\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen1() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_item_grouped_by_single_Student_name_SFO_in_Confirm_Submit_page();
        checkoutPage.verify_student_name_displays_correctly_in_SFO_section_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_single_item_single_student_SFO_section_in_Confirm_Submit_page_GST_PST();
    }

    @And("^Multiple items Student Subtotal,Qty,GST,PST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page$")
    public void multiple_items_student_subtotalqtygstpsttotalsfo_total_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_multiple_items_single_student_SFO_section_in_Confirm_Submit_page_GST_PST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:2\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen2() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_item_grouped_by_single_Student_name_SFO_in_Confirm_Submit_page();
        checkoutPage.verify_student_name_displays_correctly_in_SFO_section_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_multiple_items_single_student_SFO_section_in_Confirm_Submit_page_GST_PST();
    }

    @And("^added items are grouped by student name in Confirm & Submit page$")
    public void added_items_are_grouped_by_student_name_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.verify_items_grouped_by_multiple_Student_names_SFO_in_Confirm_Submit_page();
    }

    @And("^the student names displays correctly in Confirm & Submit page$")
    public void the_student_names_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.verify_student_names_displays_correctly_in_SFO_section_in_Confirm_Submit_page();
    }

    @And("^Students Subtotal,Qty,GST,QST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page$")
    public void students_subtotalqtygstqsttotalsfo_total_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_GST_QST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:3\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen3() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_items_grouped_by_multiple_Student_names_SFO_in_Confirm_Submit_page();
        checkoutPage.verify_student_names_displays_correctly_in_SFO_section_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_GST_QST();
    }

    @And("^Students Subtotal,Qty,GST,PST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page$")
    public void students_subtotalqtygstpsttotalsfo_total_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_GST_PST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:4\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen4() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_items_grouped_by_multiple_Student_names_SFO_in_Confirm_Submit_page();
        checkoutPage.verify_student_names_displays_correctly_in_SFO_section_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_GST_PST();
    }

    @And("^Students Subtotal,Qty,HST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page$")
    public void students_subtotalqtyhsttotalsfo_total_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_HST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:5\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen5() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_items_grouped_by_multiple_Student_names_SFO_in_Confirm_Submit_page();
        checkoutPage.verify_student_names_displays_correctly_in_SFO_section_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_HST();
    }

    @And("^Students Subtotal,Qty,GST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page$")
    public void students_subtotalqtygsttotalsfo_total_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_GST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:6\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen6() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_items_grouped_by_multiple_Student_names_SFO_in_Confirm_Submit_page();
        checkoutPage.verify_student_names_displays_correctly_in_SFO_section_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_GST();
    }

    @And("^No taxes are charged for QC and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page$")
    public void no_taxes_are_charged_for_qc_and_students_subtotalqtytotalsfo_total_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_GST_QST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:7\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen7() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_items_grouped_by_multiple_Student_names_SFO_in_Confirm_Submit_page();
        checkoutPage.verify_student_names_displays_correctly_in_SFO_section_in_Confirm_Submit_page();
        checkoutPage.No_tax_validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_GST_QST();
    }

    @And("^No taxes are charged for BC and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page$")
    public void no_taxes_are_charged_for_bc_and_students_subtotalqtytotalsfo_total_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_GST_PST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:8\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen8() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_items_grouped_by_multiple_Student_names_SFO_in_Confirm_Submit_page();
        checkoutPage.verify_student_names_displays_correctly_in_SFO_section_in_Confirm_Submit_page();
        checkoutPage.No_tax_validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_GST_PST();
    }

    @And("^No taxes are charged for HST and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page$")
    public void no_taxes_are_charged_for_hst_and_students_subtotalqtytotalsfo_total_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_HST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:9\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen9() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_items_grouped_by_multiple_Student_names_SFO_in_Confirm_Submit_page();
        checkoutPage.verify_student_names_displays_correctly_in_SFO_section_in_Confirm_Submit_page();
        checkoutPage.No_tax_validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_HST();
    }

    @And("^No taxes are charged for GST and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page$")
    public void no_taxes_are_charged_for_gst_and_students_subtotalqtytotalsfo_total_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.No_tax_validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_GST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:10\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen10() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_items_grouped_by_multiple_Student_names_SFO_in_Confirm_Submit_page();
        checkoutPage.verify_student_names_displays_correctly_in_SFO_section_in_Confirm_Submit_page();
        checkoutPage.No_tax_validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_GST();
    }

    @Then("^teacher sees the YTO section in Confirm & Submit page$")
    public void teacher_sees_the_yto_section_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.verify_YTO_section_displayed_in_Confirm_Submit_page();
    }

    @And("^YTO Subtotal,Qty,GST,QST,Total and Cart Total displays correctly in Confirm & Submit page$")
    public void yto_subtotalqtygstqsttotal_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_GST_QST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:11\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen11() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_YTO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_GST_QST();
    }

    @And("^YTO Subtotal,Qty,GST,PST,Total and Cart Total displays correctly in Confirm & Submit page$")
    public void yto_subtotalqtygstpsttotal_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_GST_PST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:12\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen12() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_YTO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_GST_PST();
    }

    @And("^YTO Subtotal,Qty,HST,Total and Cart Total displays correctly in Confirm & Submit page$")
    public void yto_subtotalqtyhsttotal_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_HST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:13\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen13() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_YTO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_HST();
    }

    @And("^YTO Subtotal,Qty,GST,Total and Cart Total displays correctly in Confirm & Submit page$")
    public void yto_subtotalqtygsttotal_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_GST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:14\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen14() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_YTO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_GST();
    }

    @And("^No taxes are charged for QC and YTO Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page$")
    public void no_taxes_are_charged_for_qc_and_yto_subtotalqtytotal_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.NoTax_validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_GST_QST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:15\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen15() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_YTO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.NoTax_validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_GST_QST();
    }

    @And("^No taxes are charged for BC and YTO Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page$")
    public void no_taxes_are_charged_for_bc_and_yto_subtotalqtytotal_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.NoTax_validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_GST_PST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:16\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen16() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_YTO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.NoTax_validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_GST_PST();
    }

    @And("^No taxes are charged for HST and YTO Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page$")
    public void no_taxes_are_charged_for_hst_and_yto_subtotalqtytotal_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.NoTax_validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_HST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:17\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen17() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_YTO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.NoTax_validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_HST();
    }

    @And("^No taxes are charged for GST and YTO Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page$")
    public void no_taxes_are_charged_for_gst_and_yto_subtotalqtytotal_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.NoTax_validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_GST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:18\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen18() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_YTO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.NoTax_validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_GST();
    }

    @Then("^teacher sees the Teacher Exclusives section in Confirm & Submit page$")
    public void teacher_sees_the_teacher_exclusives_section_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.verify_TE_section_displayed_in_Confirm_Submit_page();
    }

    @And("^Teacher Exclusives Subtotal,Qty,GST,QST,Total and Cart Total displays correctly in Confirm & Submit page$")
    public void teacher_exclusives_subtotalqtygstqsttotal_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_GST_QST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:19\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen19() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_TE_section_displayed_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_GST_QST();
    }

    @And("^Teacher Exclusives Subtotal,Qty,GST,PST,Total and Cart Total displays correctly in Confirm & Submit page$")
    public void teacher_exclusives_subtotalqtygstpsttotal_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_GST_PST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:20\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen20() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_TE_section_displayed_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_GST_PST();
    }

    @And("^Teacher Exclusives Subtotal,Qty,HST,Total and Cart Total displays correctly in Confirm & Submit page$")
    public void teacher_exclusives_subtotalqtyhsttotal_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_HST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:21\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen21() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_TE_section_displayed_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_HST();
    }

    @And("^Teacher Exclusives Subtotal,Qty,GST,Total and Cart Total displays correctly in Confirm & Submit page$")
    public void teacher_exclusives_subtotalqtygsttotal_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_GST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:22\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen22() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_TE_section_displayed_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_GST();
    }

    @And("^No taxes are charged for QC and Teacher Exclusives Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page$")
    public void no_taxes_are_charged_for_qc_and_teacher_exclusives_subtotalqtyTotal_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.NoTax_validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_GST_QST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:23\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen23() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_TE_section_displayed_in_Confirm_Submit_page();
        checkoutPage.NoTax_validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_GST_QST();
    }

    @And("^No taxes are charged for BC and Teacher Exclusives Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page$")
    public void no_taxes_are_charged_for_bc_and_teacher_exclusives_subtotalqtyTotal_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.NoTax_validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_GST_PST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:24\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen24() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_TE_section_displayed_in_Confirm_Submit_page();
        checkoutPage.NoTax_validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_GST_PST();
    }

    @And("^No taxes are charged for HST and Teacher Exclusives Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page$")
    public void no_taxes_are_charged_for_hst_and_teacher_exclusives_subtotalqtyTotal_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.NoTax_validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_HST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:25\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen25() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_TE_section_displayed_in_Confirm_Submit_page();
        checkoutPage.NoTax_validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_HST();
    }

    @And("^No taxes are charged for GST and Teacher Exclusives Subtotal,Qty,Pre & Post Total and Cart Total displays correctly in Confirm & Submit page$")
    public void no_taxes_are_charged_for_gst_and_teacher_exclusives_subtotalqtypre_post_total_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.NoTax_validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_GST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:26\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen26() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_TE_section_displayed_in_Confirm_Submit_page();
        checkoutPage.NoTax_validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_GST();
    }

    @Then("^teacher sees the SFO and YTO sections in Confirm & Submit page$")
    public void teacher_sees_the_sfo_and_yto_sections_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_YTO_section_displayed_in_Confirm_Submit_page();
    }

    @And("^SFO,YTO Total,GST,QST and Cart Total displays correctly in Confirm & Submit page$")
    public void sfoyto_totalgstqst_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_sections_in_Confirm_Submit_page_GST_QST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:27\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen27() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_YTO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_sections_in_Confirm_Submit_page_GST_QST();
    }

    @And("^SFO,YTO Total,GST,PST and Cart Total displays correctly in Confirm & Submit page$")
    public void sfoyto_totalgstpst_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_sections_in_Confirm_Submit_page_GST_PST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:28\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen28() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_YTO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_sections_in_Confirm_Submit_page_GST_PST();
    }

    @And("^SFO,YTO Total,HST and Cart Total displays correctly in Confirm & Submit page$")
    public void sfoyto_totalhst_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_sections_in_Confirm_Submit_page_HST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:29\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen29() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_YTO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_sections_in_Confirm_Submit_page_HST();
    }

    @And("^SFO,YTO Total,GST and Cart Total displays correctly in Confirm & Submit page$")
    public void sfoyto_totalgst_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_sections_in_Confirm_Submit_page_GST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:30\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen30() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_YTO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_sections_in_Confirm_Submit_page_GST();
    }

    @Then("^teacher sees the SFO,YTO and Teacher Exclusives sections in Confirm & Submit page$")
    public void teacher_sees_the_sfoyto_and_teacher_exclusives_sections_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_YTO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_TE_section_displayed_in_Confirm_Submit_page();
    }

    @And("^SFO,YTO,Teacher Exclusives Total,GST,QST and Cart Total displays correctly in Confirm & Submit page$")
    public void sfoytoteacher_exclusives_totalgstqst_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_TE_sections_in_Confirm_Submit_page_GST_QST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:31\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen31() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_YTO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_TE_section_displayed_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_TE_sections_in_Confirm_Submit_page_GST_QST();
    }

    @And("^SFO,YTO,Teacher Exclusives Total,GST,PST and Cart Total displays correctly in Confirm & Submit page$")
    public void sfoytoteacher_exclusives_totalgstpst_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_TE_sections_in_Confirm_Submit_page_GST_PST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:32\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen32() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_YTO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_TE_section_displayed_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_TE_sections_in_Confirm_Submit_page_GST_PST();
    }

    @And("^SFO,YTO,Teacher Exclusives Total,HST and Cart Total displays correctly in Confirm & Submit page$")
    public void sfoytoteacher_exclusives_totalhst_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_TE_sections_in_Confirm_Submit_page_HST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:33\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen33() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_YTO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_TE_section_displayed_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_TE_sections_in_Confirm_Submit_page_HST();
    }

    @And("^SFO,YTO,Teacher Exclusives Total,GST and Cart Total displays correctly in Confirm & Submit page$")
    public void sfoytoteacher_exclusives_totalgst_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_TE_sections_in_Confirm_Submit_page_GST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:34\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen34() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_YTO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.verify_TE_section_displayed_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_TE_sections_in_Confirm_Submit_page_GST();
    }

    @And("^No prices are charged for Student Subtotal,GST,PST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page$")
    public void no_prices_are_charged_for_student_subtotalgstpsttotalsfo_total_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_single_FreePick_item_single_student_SFO_section_in_Confirm_Submit_page_GST_PST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:35\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen35() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_single_FreePick_item_single_student_SFO_section_in_Confirm_Submit_page_GST_PST();
    }

    @And("^No prices are charged for multiple Students Subtotal,GST,PST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page$")
    public void no_prices_are_charged_for_multiple_students_subtotalgstpsttotalsfo_total_and_cart_total_displays_correctly_in_confirm_submit_page() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_section_with_FreePick_in_Confirm_Submit_page_GST_PST();
    }

    @And("^teacher sees the same details on order confirmation page \\[scen:36\\]$")
    public void teacher_sees_the_same_details_on_order_confirmation_page_scen36() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page();
        checkoutPage.verify_SFO_section_displayed_in_Confirm_Submit_page();
        checkoutPage.validation_of_OrderSummary_Totals_Shipping_and_SFO_section_with_FreePick_in_Confirm_Submit_page_GST_PST();
    }


    @And("^teacher avails unique free pick coupon and checkout without any issues$")
    public void teacherAvailsUniqueFreePickCouponAndCheckoutWithoutAnyIssues() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("selectgrade"));
        for (int i = 0; i < coupons.length; i++) {
            checkoutPage.MakeSelectionWindow_SelectGrade(
                    TestBaseProvider.getTestBase().getTestData() );

            PauseUtil.waitForAjaxToComplete(1500);
            checkoutPage.MakeSelectionWindow_SelectItemFreePick();
            checkoutPage.getICouponSection().createdatafromFreePickSelection();
            checkoutPage.getICouponSection().clickOnConfrimAndApplyCoupon();
            SCHUtils.waitForLoaderToDismiss();
            RewardsAndCoupons rewardsAndCoupons =
                    getFactory().getICheckoutPage().getRewardsAndCouponsSection();
//            ICheckoutPage checkOut = getFactory().getICheckoutPage();
            while (SCHUtils.isPresent(rewardsAndCoupons.getBtnSkip())) {
                System.out.println(" rewardsAndCoupons.getBtnSkip() ==========> "
                        + SCHUtils.isPresent(rewardsAndCoupons.getBtnSkip()));
                SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnSkip());
                PauseUtil.waitForAjaxToComplete();
            }




            System.out.println(" rewardsAndCoupons.getBtnContinueCheckout() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getBtnContinueCheckout()));
            SCHUtils.scrollToView(rewardsAndCoupons.getBtnContinueCheckout());

            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());

            PauseUtil.pause(1000);
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete();


            ShippingAndPayment shippingAndPaymentPage =
                    getFactory().getICheckoutPage().getShippingAndPaymentSection();

            SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                    ConstantUtils.CHECKPAYMENTMETHOD);



            PauseUtil.pause(1500);

            WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
            SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());



            PauseUtil.waitForAjaxToComplete();

        }

        ConfirmAndSubmitOrder confirmAndSubmitOrderPage =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        // if pcoolordersubmit is off then it will not submit order
        String pcoolordersubmit = TestBaseProvider.getTestBase().getTestData()
                .getString("pcoolordersubmit");
        if (pcoolordersubmit == null) {
            WaitUtils.waitForEnabled(confirmAndSubmitOrderPage.getBtnSubmitOrder());
            SCHUtils.clickUsingJavaScript(confirmAndSubmitOrderPage.getBtnSubmitOrder());
            // confirmAndSubmitOrderPage.getBtnSubmitOrder().click();
            // PauseUtil.pause(20000);
        }
        PauseUtil.pause(1000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        String orderRefNum = confirmAndSubmitOrderPage.getorderrefnoConfirmationpage().getText().trim();

        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.confirmationpage.orderrefno", orderRefNum);
    }

    
    @And("^User set the password for the accounts$")
    public void user_set_the_password_for_the_accounts() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.passwordSet_in_BM_TCOD();
    }
    
    @And("^teacher selects saved amex card as payment$")
    public void teacher_selects_saved_amex_card_as_payment() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.payment_select_savedcreditcard();
    }
    
    @And("^teacher selects combination of cc and checks with new amex card as payment$")
    public void teacher_selects_combination_of_cc_and_checks_with_new_amex_card_as_payment() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CCANDCHECKPAYMENTMETHOD);
		PauseUtil.pause(5000);
		
		PauseUtil.waitForAjaxToComplete(3000);
		PauseUtil.pause(5000);
		shippingAndPaymentPage.drpSelectaCard_2().click();
		PauseUtil.pause(2000);
		shippingAndPaymentPage.selectAsAddaNewCard().click();
		PauseUtil.pause(2000);
		
		ICheckoutPage_2 checkoutPage_2 = getFactory().getICheckoutPage_2();
		checkoutPage_2.fill_new_CreditCard();
        
        SCHUtils.selectCheckBox(shippingAndPaymentPage.getChkSaveCard(), "false");
		
        checkoutPage_2.CSR_enters_amt_paid_by_creditCard_in_paymentPage();
    }
    
    @When("^teacher navigates to the \\[Payments\\] page with correct totals$")
    public void teacher_navigates_to_the_payments_page_with_correct_totals() throws Throwable {
    	ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		checkoutPage.teacher_clicks_on_ContinueCheckout_Rewards_page();
		
		carttotals.get_total_paymentpage();
		carttotals.compare_rewardspagetotal_Paymentpagetotal();
    }
    
    @And("^teacher select the item on DTS modal such that there is a top\\-off amount$")
    public void teacher_select_the_item_on_dts_modal_such_that_there_is_a_topoff_amount() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.CSR_clicks_on_MakeSelection_in_RedemptionsPage();
        checkoutPage.clicks_Search_fld_and_searches_an_item_in_MakeYourSelection_window();
        checkoutPage.Selects_first_item_from_Make_Selection_window();
        checkoutPage.getICouponSection().clickOnConfrimAndApplyCoupon();
        
    }
    
    @And("^top\\-off amount is added to YTO total$")
    public void topoff_amount_is_added_to_yto_total() throws Throwable {
    	ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		checkoutPage.validate_YTO_Total_with_DTS_topOff_with_Tax_in_Rewards_page(Total_Owing_Amount_act_1.get_Total_YTO_Value_Rewards_page());
		carttotals.get_total_redemptionsandrewardspage();
    }
    
    
    @And("^teacher checkouts order without any issues$")
    public void teacherCheckoutsOrderWithoutAnyIssues() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("selectgrade"));
        for (int i = 0; i < coupons.length; i++) {
            checkoutPage.MakeSelectionWindow_SelectGrade(
                    TestBaseProvider.getTestBase().getTestData() );

            PauseUtil.waitForAjaxToComplete(1500);
            checkoutPage.MakeSelectionWindow_SelectItemFreePick();
            checkoutPage.getICouponSection().createdatafromFreePickSelection();
            checkoutPage.getICouponSection().clickOnConfrimAndApplyCoupon();
            SCHUtils.waitForLoaderToDismiss();
            RewardsAndCoupons rewardsAndCoupons =
                    getFactory().getICheckoutPage().getRewardsAndCouponsSection();
//            ICheckoutPage checkOut = getFactory().getICheckoutPage();
            while (SCHUtils.isPresent(rewardsAndCoupons.getBtnSkip())) {
                System.out.println(" rewardsAndCoupons.getBtnSkip() ==========> "
                        + SCHUtils.isPresent(rewardsAndCoupons.getBtnSkip()));
                SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnSkip());
                PauseUtil.waitForAjaxToComplete();
            }




            System.out.println(" rewardsAndCoupons.getBtnContinueCheckout() ==========> "
                    + SCHUtils.isPresent(rewardsAndCoupons.getBtnContinueCheckout()));
            SCHUtils.scrollToView(rewardsAndCoupons.getBtnContinueCheckout());

            SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());

            PauseUtil.pause(1000);
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete();


            ShippingAndPayment shippingAndPaymentPage =
                    getFactory().getICheckoutPage().getShippingAndPaymentSection();

            SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                    ConstantUtils.CHECKPAYMENTMETHOD);



            PauseUtil.pause(1500);

            WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
            SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());



            PauseUtil.waitForAjaxToComplete();

        }

        ConfirmAndSubmitOrder confirmAndSubmitOrderPage =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        // if pcoolordersubmit is off then it will not submit order
        String pcoolordersubmit = TestBaseProvider.getTestBase().getTestData()
                .getString("pcoolordersubmit");
        if (pcoolordersubmit == null) {
            WaitUtils.waitForEnabled(confirmAndSubmitOrderPage.getBtnSubmitOrder());
            SCHUtils.clickUsingJavaScript(confirmAndSubmitOrderPage.getBtnSubmitOrder());
            // confirmAndSubmitOrderPage.getBtnSubmitOrder().click();
            // PauseUtil.pause(20000);
        }
        PauseUtil.pause(1000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        String orderRefNum = confirmAndSubmitOrderPage.getorderrefnoConfirmationpage().getText().trim();

        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.confirmationpage.orderrefno", orderRefNum);
    }

    @And("^the error is This coupon is no longer valid\\. Please check the coupon for details\\.$")
    public void theErrorIsThisCouponIsNoLongerValidPleaseCheckTheCouponForDetails() throws Throwable {
    	StudentFlyerOrdersPage spage = new StudentFlyerOrdersPage();
		spage.get_sfocoupon_modal_couponcode_expiredcoupon_getError();

    }

    @And("^the message is “from prop file”$")
    public void theMessageIsFromPropFile() throws Throwable {
        	StudentFlyerOrdersPage spage = new StudentFlyerOrdersPage();
    		spage.get_sfocoupon_modal_couponcode_getError();
    }
        
    @And("^Password reset for the expired BM users$")
    public void password_reset_for_the_expired_bm_users() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.BM_Password_reset_after_expiry_for_BM_users();
    }
    
    @And("^CSR submits the order and closes Order Confirmation popup$")
    public void csr_submits_the_order_and_closes_order_confirmation_popup() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.CSR_submit_the_Order_and_closes_confirmation_popup();
    }
    
    @When("^teacher navigates to \\[Confirm & Submit\\] page without Payment method$")
    public void teacher_navigates_to_confirm_submit_page_without_payment_method() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
        SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
    }
    
    @And("^teacher selects an item from the freepick modal$")
    public void teacher_selects_an_item_from_the_freepick_modal() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        PauseUtil.waitForAjaxToComplete(1500);
        checkoutPage.MakeSelectionWindow_SelectItemFreePick();
    }
    
    @Then("^the freepick coupon information displays under Applied Coupons section$")
    public void the_freepick_coupon_information_displays_under_applied_coupons_section() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.CSR_verify_coupon_section_displayed_and_retained_in_Redemptions_Page();
    }
    
    @When("^Teacher enters a Bonus Flat coupon$")
    public void teacher_enters_a_bonus_flat_coupon() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_apply_a_coupon_in_Rewards_page();
    }
    
    @Then("^Bonus Flat coupon information displays under Applied Coupons section$")
    public void bonus_flat_coupon_information_displays_under_applied_coupons_section() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.CSR_verify_coupon_section_displayed_and_retained_in_Redemptions_Page();
    }
    
    @And("^the TGAT coupon information displays under Applied Coupons section$")
    public void the_tgat_coupon_information_displays_under_applied_coupons_section() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.verify_TGAT_couon_info_Coupons_applied_section();
    }
    
    @Then("^teacher sees the Student Incentive description in Rewards section$")
    public void teacher_sees_the_student_incentive_description_in_rewards_section() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.getRewardsAndCouponsSection().verifyQandASection();
    }
    
    @Then("^teacher sees the Free Item description in Rewards section$")
    public void teacher_sees_the_free_item_description_in_rewards_section() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.getRewardsAndCouponsSection().verifyTossIn();
    }
    
    @Then("^Free Item coupon information displays under Applied Coupons section$")
    public void free_item_coupon_information_displays_under_applied_coupons_section() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verify_FreeItem_displayed_in_Rewards_page();
    }
    
    @And("^teacher applies redemptions from SFO & YTO making the order pre\\-tax subtotal less than the min\\. amount$")
    public void teacher_applies_redemptions_from_sfo_yto_making_the_order_pretax_subtotal_less_than_the_min_amount() throws Throwable {
        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        checkoutPage.teacher_applies_CreditNotes_for_SFO_section_in_Rewards_page();
        checkoutPage.teacher_applies_CreditNotes_for_YTO_section_in_Rewards_page();
    }
    
    @Then("^error message displays for COUPONS field$")
    public void error_message_displays_for_coupons_field() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.CSR_verify_error_popup_displayed_RedeemRewards_page();
    }
    
    @Then("^teacher does not see the Student Incentive description in Rewards section$")
    public void teacher_does_not_see_the_student_incentive_description_in_rewards_section() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.getRewardsAndCouponsSection().verifyNotQandASection();
    }


    @Then("^teacher sees the Spell Scholastic promotion description in Rewards section$")
    public void teacherSeesTheSpellScholasticPromotionDescriptionInRewardsSection() throws Throwable {
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.verify_rewardsPage_spellScholasticMsgdisplay();
    }
    
    @When("^teacher clicks on Delete coupon and selects NO$")
    public void teacher_clicks_on_delete_coupon_and_selects_no() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.select_TGAT_delete_button_and_click_NO();
    }
    
    @When("^teacher clicks on Delete coupon and selects YES$")
    public void teacher_clicks_on_delete_coupon_and_selects_yes() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.select_TGAT_delete_button_and_click_YES();
    }

}

