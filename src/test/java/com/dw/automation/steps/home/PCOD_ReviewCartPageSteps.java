package com.dw.automation.steps.home;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import java.util.Date;

import org.testng.Assert;

import com.dw.automation.pages.ICheckoutPage;
import com.dw.automation.pages.impl.CheckoutPage.ConfirmAndSubmitOrder;
import com.dw.automation.pages.impl.CheckoutPage.ShippingAndPayment;
import com.dw.automation.pages.impl.PCOD_HomePage;
import com.dw.automation.pages.impl.PCOD_LoginPage;
import com.dw.automation.pages.impl.PCOD_ReviewCartPage;
import com.dw.automation.pages.impl.ProductDetailPage;
import com.dw.automation.pages.impl.StudentFlyerOrdersPage;
import com.dw.automation.pages.impl.TeachersHomePage;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.WaitUtils;
import com.scholastic.torque.webdriver.ExtendedElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PCOD_ReviewCartPageSteps {
	
PCOD_HomePage pcod_homepage = new PCOD_HomePage();
PCOD_LoginPage pcod_logpage = new PCOD_LoginPage();
TeachersHomePage teach_homepage = new TeachersHomePage();
ProductDetailPage prod_page = new ProductDetailPage();
StudentFlyerOrdersPage stud_page = new StudentFlyerOrdersPage();
PCOD_ReviewCartPage pcod_reviewpage = new PCOD_ReviewCartPage();
	
//######################### REVIEW CART PAGE		#############################################
    

@When("^parent edit the quantity and tabout$")
public void parent_edit_the_quantity_and_tabout() throws Throwable {
    stud_page.edit_item_qty1_tabout_in_reviewcartPage(
    		TestBaseProvider.getTestBase().getTestData().getString("updated_itemquantity"));
}

@When("^parent edit the quantity to any negative value and click outside of quantity field$")
public void parent_edit_the_quantity_to_any_negative_value_and_click_outside_of_quantity_field() throws Throwable {
	pcod_reviewpage.edit_item_qty1_clickoutside_in_reviewcartPage(
			TestBaseProvider.getTestBase().getTestData().getString("neg_itemquantity"));
}

@When("^parent edits the quantity to zero and click outside of quantity field$")
public void parent_edits_the_quantity_to_zero_and_click_outside_of_quantity_field() throws Throwable {
	stud_page.edit_item_qty1_tabout_in_reviewcartPage(
    		TestBaseProvider.getTestBase().getTestData().getString("updated_itemquantity"));
}

@When("^parent tries to edit the quantity to more than 3 digits$")
public void parent_tries_to_edit_the_quantity_to_more_than_3_digits() throws Throwable {
	stud_page.edit_item_qty1_tabout_in_reviewcartPage(
    		TestBaseProvider.getTestBase().getTestData().getString("updated_itemquantity"));
}

@Then("^updated quantity is displayed in quantity field$")
public void updated_quantity_is_displayed_in_quantity_field() throws Throwable {
    pcod_logpage.verify_value_entered_issaved(stud_page.cart_qty_item1(), 
    		TestBaseProvider.getTestBase().getTestData().getString("updated_itemquantity"), "Quantity Field");
}


@Then("^negative value is not accepted and postive value is updated in quantity field$")
public void negative_value_is_not_accepted_and_postive_value_is_updated_in_quantity_field() throws Throwable {
	pcod_logpage.verify_value_entered_issaved(stud_page.cart_qty_item1(), 
    		TestBaseProvider.getTestBase().getTestData().getString("updated_itemquantity"), "Quantity Field");
}


@And("^total price is updated correctly$")
public void total_price_is_updated_correctly() throws Throwable {
	pcod_reviewpage.verify_item1_totalprice_reviewcartpage();
}


@And("^total items and order total is updated correctly$")
public void total_items_and_order_total_is_updated_correctly() throws Throwable {
pcod_reviewpage.verify_item1_ordertotal_reviewcartpage();
pcod_reviewpage.verify_item1_totalitems_reviewcartpage();
}

@And("^correct total items and Order Total should display$")
public void correct_total_items_and_order_total_should_display() throws Throwable {
	pcod_reviewpage.verify_item1_ordertotal_reviewcartpage();
	pcod_reviewpage.verify_item1_totalitems_reviewcartpage();
}

@And("^total items and Order Total should show as zero$")
public void total_items_and_order_total_should_show_as_zero() throws Throwable {
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(4000);
	pcod_logpage.pcod_get_text_contains(pcod_reviewpage.getlbltotalitemsqtyreviewcartpage(), 
			TestBaseProvider.getTestBase().getTestData().getString("zeroqty"));
	pcod_logpage.pcod_get_text_contains(pcod_reviewpage.getlblordertotalreviewcartpage(), 
			TestBaseProvider.getTestBase().getTestData().getString("zeroordertotal"));
}


@Then("^item is deleted from shopping cart$")
public void item_is_deleted_from_shopping_cart() throws Throwable {
PauseUtil.waitForAjaxToComplete(2500);
PauseUtil.pause(4000);
pcod_logpage.pcod_get_text_notcontains(pcod_reviewpage.getpagereviewcartpage(), 
		TestBaseProvider.getTestBase().getTestData().getString("itemName"));
}

@Then("^added item is deleted from shopping cart$")
public void added_item_is_deleted_from_shopping_cart() throws Throwable {
PauseUtil.waitForAjaxToComplete(2500);
PauseUtil.pause(4000);
boolean itempresent=false;

try {
	if(pcod_reviewpage.reviewcartpagetableitems(TestBaseProvider.getTestBase().getTestData().getString("itemName")).isDisplayed())
	{
		itempresent=true;
		Assert.assertFalse(itempresent);
	}
} catch (Exception e) {
	if(itempresent==false){
		Assert.assertTrue(true);
	}
	e.printStackTrace();
}
}

@Then("^that particular item is deleted from the cart$")
public void that_particular_item_is_deleted_from_the_cart() throws Throwable {
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(4000);
	pcod_logpage.pcod_get_text_notcontains(pcod_reviewpage.getpagereviewcartpage(), 
			TestBaseProvider.getTestBase().getTestData().getString("itemName"));
}

@Then("^item is deleted from the cart$")
public void item_is_deleted_from_the_cart() throws Throwable {
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(4000);
	pcod_logpage.pcod_get_text_notcontains(pcod_reviewpage.getpagereviewcartpage(), 
			TestBaseProvider.getTestBase().getTestData().getString("itemName"));
}

@Then("^item is not deleted from shopping cart$")
public void item_is_not_deleted_from_shopping_cart() throws Throwable {
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(4000);
	pcod_logpage.pcod_get_text_contains(pcod_reviewpage.getpagereviewcartpage(), 
			TestBaseProvider.getTestBase().getTestData().getString("itemName"));
}

@Then("^quantity field does not accept more than 3 digits$")
public void quantity_field_does_not_accept_more_than_3_digits() throws Throwable {
pcod_homepage.verify_element_textlimit(stud_page.cart_qty_item1(),
		TestBaseProvider.getTestBase().getTestData().getString("exp_quantity"));
}



@When("^parent clicks on Delete option for item added$")
public void parent_clicks_on_delete_option_for_item_added() throws Throwable {
	pcod_logpage.pcod_click_element(teach_homepage.delete_item1_reviewcart());
}

@When("^parent clicks on Delete option for any one item$")
public void parent_clicks_on_delete_option_for_any_one_item() throws Throwable {
	pcod_logpage.pcod_click_element(teach_homepage.delete_item1_reviewcart());
}

@And("^clicks on YES button in delete modal window$")
public void clicks_on_yes_button_in_delete_modal_window() throws Throwable {
	pcod_logpage.pcod_click_element(teach_homepage.YES_to_delete_item1_reviewcart());
}

@And("^clicks on NO button in delete modal window$")
public void clicks_on_no_button_in_delete_modal_window() throws Throwable {
	pcod_logpage.pcod_click_element(teach_homepage.NO_to_delete_item1_reviewcart());
}


@And("^“BACK TO SHOP” link is enabled$")
public void back_to_shop_link_is_enabled() throws Throwable {
	pcod_logpage.verify_element_is_enabled(pcod_reviewpage.sizelnkbacktoshopreviewcart());
}

@And("^parent sees “BACK TO SHOP” link and “PROCEED TO CHECKOUT” button$")
public void parent_sees_back_to_shop_link_and_proceed_to_checkout_button() throws Throwable {
	pcod_logpage.verify_element_is_enabled(pcod_reviewpage.sizelnkbacktoshopreviewcart());
	pcod_logpage.verify_button_enabled(pcod_reviewpage.sizebtnproceedtocheckoutdisabledreviewcart());
}


@And("^“PROCEED TO CHECKOUT” button is enabled$")
public void proceed_to_checkout_button_is_enabled() throws Throwable {
	pcod_logpage.verify_button_enabled(pcod_reviewpage.sizebtnproceedtocheckoutdisabledreviewcart());
}

@And("^“PROCEED TO CHECKOUT” button is disabled$")
public void proceed_to_checkout_button_is_disabled() throws Throwable {
	pcod_logpage.verify_button_disabled(pcod_reviewpage.sizebtnproceedtocheckoutdisabledreviewcart());
}


@And("^“You currently have no items in your cart\\.” text is seen in shopping cart$")
public void you_currently_have_no_items_in_your_cart_text_is_seen_in_shopping_cart() throws Throwable {
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(4000);
	pcod_logpage.pcod_get_text_contains(pcod_reviewpage.reviewcartpageemptymessage(), 
			TestBaseProvider.getTestBase().getTestData().getString("noitemmessage"));
}

@Then("^item added from PDP page should display in review cart page along with title, flyer, price and quantity$")
public void item_added_from_pdp_page_should_display_in_review_cart_page_along_with_title_flyer_price_and_quantity() throws Throwable {
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(4000);
	pcod_logpage.pcod_get_text_contains(pcod_reviewpage.getpagereviewcartpage(), 
			TestBaseProvider.getTestBase().getTestData().getString("itemName"));
	pcod_logpage.pcod_get_text_itemprice_contains(pcod_reviewpage.getlblitem1unitpricereviewcartpage(), 
			TestBaseProvider.getTestBase().getTestData().getString("itemprice"));
	pcod_logpage.pcod_getvalue_equals(stud_page.cart_qty_item1(), 
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),"Item Quantity");
}


@Then("^parent is navigated to shopping cart page$")
public void parent_is_navigated_to_shopping_cart_page() throws Throwable {
	pcod_logpage.verify_element_is_enabled(pcod_reviewpage.sizelnkbacktoshopreviewcart());
}

@And("^correct item title is present$")
public void correct_item_title_is_present() throws Throwable {
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(4000);
	pcod_logpage.pcod_get_text_contains(pcod_reviewpage.getpagereviewcartpage(), 
			TestBaseProvider.getTestBase().getTestData().getString("itemName"));
}

@And("^correct item price is present$")
public void correct_item_price_is_present() throws Throwable {
	pcod_logpage.pcod_get_text_itemprice_contains(pcod_reviewpage.getlblitem1unitpricereviewcartpage(), 
			TestBaseProvider.getTestBase().getTestData().getString("itemprice"));
}

@And("^correct quantity is present$")
public void correct_quantity_is_present() throws Throwable {
	pcod_logpage.pcod_getvalue_equals(stud_page.cart_qty_item1(), 
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),"Item Quantity");
}

@And("^correct item total price is present$")
public void correct_item_total_price_is_present() throws Throwable {
	pcod_reviewpage.verify_item1_totalprice_reviewcartpage();
}

@And("^correct total items and order total is present$")
public void correct_total_items_and_order_total_is_present() throws Throwable {
	pcod_reviewpage.verify_item1_ordertotal_reviewcartpage();
	pcod_reviewpage.verify_item1_totalitems_reviewcartpage();
}


@And("^added item is deleted from the cart$")
public void added_item_is_deleted_from_the_cart() throws Throwable {
	pcod_reviewpage.added_item_is_deleted_from_the_cart();
	
}

@And("^correct item title, price, quantity, total price, total items and order total is seen$")
public void correct_item_title_price_quantity_total_price_total_items_and_order_total_is_seen() throws Throwable {
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(4000);
	pcod_logpage.pcod_get_text_contains(pcod_reviewpage.getpagereviewcartpage(), 
			TestBaseProvider.getTestBase().getTestData().getString("itemName"));
	pcod_logpage.pcod_get_text_itemprice_contains(pcod_reviewpage.getlblitem1unitpricereviewcartpage(), 
			TestBaseProvider.getTestBase().getTestData().getString("itemprice"));
	pcod_logpage.pcod_getvalue_equals(stud_page.cart_qty_item1(), 
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),"Item Quantity");
	pcod_reviewpage.verify_item1_totalprice_reviewcartpage();
	pcod_reviewpage.verify_item1_ordertotal_reviewcartpage();
	pcod_reviewpage.verify_item1_totalitems_reviewcartpage();
}


@And("^correct item title, price, updated quantity, updated total price, updated total items and updated order total is seen$")
public void correct_item_title_price_updated_quantity_updated_total_price_updated_total_items_and_updated_order_total_is_seen() throws Throwable {
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(4000);
	pcod_logpage.pcod_get_text_contains(pcod_reviewpage.getpagereviewcartpage(), 
			TestBaseProvider.getTestBase().getTestData().getString("itemName"));
	pcod_logpage.pcod_get_text_itemprice_contains(pcod_reviewpage.getlblitem1unitpricereviewcartpage(), 
			TestBaseProvider.getTestBase().getTestData().getString("itemprice"));
	pcod_logpage.pcod_getvalue_equals(stud_page.cart_qty_item1(), 
			TestBaseProvider.getTestBase().getTestData().getString("updated_itemQty"),"Item Quantity");
	pcod_reviewpage.verify_item1_totalprice_reviewcartpage();
	pcod_reviewpage.verify_item1_ordertotal_reviewcartpage();
	pcod_reviewpage.verify_item1_totalitems_reviewcartpage();
}

@When("^parent clicks on “BACK TO SHOP” link$")
public void parent_clicks_on_back_to_shop_link() throws Throwable {
	pcod_logpage.pcod_click_element(pcod_reviewpage.getlnkbacktoshopreviewcart());
}


@Then("^Coupon code section displays with “HAVE A COUPON\\?” and text box to enter coupon code with default text$")
public void coupon_code_section_displays_with_have_a_coupon_and_text_box_to_enter_coupon_code_with_default_text() throws Throwable {
    AssertUtils.assertPresent((ExtendedElement) pcod_reviewpage.getsectioncouponcodereviewcart());
    AssertUtils.assertPresent((ExtendedElement) pcod_reviewpage.gettxtcouponcodereviewcart());
    pcod_logpage.pcod_get_text_contains(pcod_reviewpage.getsectioncouponcodereviewcart(), 
    		TestBaseProvider.getTestBase().getTestData().getString("coupon_label"));
    pcod_logpage.pcod_getplaceholder_equals(pcod_reviewpage.gettxtcouponcodereviewcart(), 
    		TestBaseProvider.getTestBase().getTestData().getString("coupon_placeholder"), "Coupon code");
}

@And("^Apply button displays$")
public void apply_button_displays() throws Throwable {
	pcod_logpage.verify_button_disabled(pcod_reviewpage.getbtnapplydisabledcouponcodereviewcart());
}

@And("^Apply button for coupon code is disabled by default$")
public void apply_button_for_coupon_code_is_disabled_by_default() throws Throwable {
	pcod_logpage.verify_button_disabled(pcod_reviewpage.getbtnapplydisabledcouponcodereviewcart());
}

@Then("^“Apply” button is enabled$")
public void apply_button_is_enabled() throws Throwable {
	pcod_logpage.verify_button_enabled(pcod_reviewpage.getbtnapplydisabledcouponcodereviewcart());
}

@And("^a note “Please note: Only three Coupons can be applied to an order\\.”$")
public void a_note_please_note_only_three_coupons_can_be_applied_to_an_order() throws Throwable {
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(4000);
	pcod_logpage.pcod_get_text_contains(pcod_reviewpage.getsectioncouponcodereviewcart(), 
			ConstantUtils.FREECOUPONSECTION_HINTMSG);	
}


@When("^parent enters letters in coupon code field$")
public void parent_enters_letters_in_coupon_code_field() throws Throwable {
	pcod_logpage.pcod_entervalue_textfield(pcod_reviewpage.gettxtcouponcodereviewcart(),
			TestBaseProvider.getTestBase().getTestData().getString("couponcode_letters"));
}

@When("^parent enters numbers in coupon code field$")
public void parent_enters_numbers_in_coupon_code_field() throws Throwable {
	pcod_logpage.pcod_entervalue_textfield(pcod_reviewpage.gettxtcouponcodereviewcart(),
			TestBaseProvider.getTestBase().getTestData().getString("couponcode_numbers"));
}

@When("^parent enters non\\-existing coupon code$")
public void parent_enters_nonexisting_coupon_code() throws Throwable {
	pcod_logpage.pcod_entervalue_textfield(pcod_reviewpage.gettxtcouponcodereviewcart(),
			TestBaseProvider.getTestBase().getTestData().getString("couponcode"));
}

@When("^parent enters special characters along with numbers in coupon code field$")
public void parent_enters_special_characters_along_with_numbers_in_coupon_code_field() throws Throwable {
	pcod_logpage.pcod_entervalue_textfield(pcod_reviewpage.gettxtcouponcodereviewcart(),
			TestBaseProvider.getTestBase().getTestData().getString("couponcode_num_splchar"));
}

@When("^parent enters special characters along with letters in coupon code field$")
public void parent_enters_special_characters_along_with_letters_in_coupon_code_field() throws Throwable {
	pcod_logpage.pcod_entervalue_textfield(pcod_reviewpage.gettxtcouponcodereviewcart(),
			TestBaseProvider.getTestBase().getTestData().getString("couponcode_let_splchar"));
}

@When("^parent enters 1 characters in coupon code$")
public void parent_enters_1_characters_in_coupon_code() throws Throwable {
	pcod_logpage.pcod_entervalue_textfield(pcod_reviewpage.gettxtcouponcodereviewcart(),
			TestBaseProvider.getTestBase().getTestData().getString("couponcode"));
}

@When("^parent enters \\[Free Pick Coupon\\]$")
public void parent_enters_free_pick_coupon() throws Throwable {
	pcod_logpage.pcod_entervalue_textfield(pcod_reviewpage.gettxtcouponcodereviewcart(),
			TestBaseProvider.getTestBase().getTestData().getString("couponcode"));
	pcod_logpage.pcod_click_element(pcod_reviewpage.getbtnapplycouponcodereviewcart());
}

@And("^parent applies a freepick coupon$")
public void parent_applies_a_freepick_coupon() throws Throwable {
	pcod_logpage.pcod_entervalue_textfield(pcod_reviewpage.gettxtcouponcodereviewcart(),
			TestBaseProvider.getTestBase().getTestData().getString("couponcode"));
	pcod_logpage.pcod_click_element(pcod_reviewpage.getbtnapplycouponcodereviewcart());
	
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
			TestBaseProvider.getTestBase().getTestData());
	
    PauseUtil.waitForAjaxToComplete(1500);
    checkoutPage.MakeSelectionWindow_SelectItemFreePick();
    
	checkoutPage.getICouponSection().clickOnConfrimAndApplyCoupon();
String total_items = pcod_reviewpage.getlbltotalitemsqtyreviewcartpage().getText();
    
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.total.items", total_items);
}


@And("^parent applies another freepick coupon$")
public void parent_applies_another_freepick_coupon() throws Throwable {
	pcod_logpage.pcod_entervalue_textfield(pcod_reviewpage.gettxtcouponcodereviewcart(),
			TestBaseProvider.getTestBase().getTestData().getString("couponcode2"));
	pcod_logpage.pcod_click_element(pcod_reviewpage.getbtnapplycouponcodereviewcart());
	
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
			TestBaseProvider.getTestBase().getTestData());
	
    PauseUtil.waitForAjaxToComplete(1500);
    checkoutPage.MakeSelectionWindow_SelectItemFreePick();
    
	checkoutPage.getICouponSection().clickOnConfrimAndApplyCoupon();
String total_items = pcod_reviewpage.getlbltotalitemsqtyreviewcartpage().getText();
    
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.total.items", total_items);
}

@When("^parent enters already redeemed coupon code$")
public void parent_enters_already_redeemed_coupon_code() throws Throwable {
	pcod_logpage.pcod_entervalue_textfield(pcod_reviewpage.gettxtcouponcodereviewcart(),
			TestBaseProvider.getTestBase().getTestData().getString("couponcode"));
	pcod_logpage.pcod_click_element(pcod_reviewpage.getbtnapplycouponcodereviewcart());
}

@When("^parent enters expired coupon code$")
public void parent_enters_expired_coupon_code() throws Throwable {
	pcod_logpage.pcod_entervalue_textfield(pcod_reviewpage.gettxtcouponcodereviewcart(),
			TestBaseProvider.getTestBase().getTestData().getString("couponcode"));
	pcod_logpage.pcod_click_element(pcod_reviewpage.getbtnapplycouponcodereviewcart());
}

@When("^parent enters teacher freepick coupon code$")
public void parent_enters_teacher_freepick_coupon_code() throws Throwable {
	pcod_logpage.pcod_entervalue_textfield(pcod_reviewpage.gettxtcouponcodereviewcart(),
			TestBaseProvider.getTestBase().getTestData().getString("couponcode"));
	pcod_logpage.pcod_click_element(pcod_reviewpage.getbtnapplycouponcodereviewcart());
}

@Then("^data is accepted and no error message is displayed$")
public void data_is_accepted_and_no_error_message_is_displayed() throws Throwable {
	pcod_logpage.verify_element_notdisplayed(pcod_logpage.gettooltiperrormessage(),
    pcod_logpage.sizetooltiperrormessage());
}

@Then("^error message “The system does not recognize the coupon code you have entered\\. Please check the coupon and try again\\. If the coupon code is correct, please contact customer service at 1\\-800\\-SCHOLASTIC \\(1\\-800\\-724\\-6527\\)\\.” displays$")
public void error_message_the_system_does_not_recognize_the_coupon_code_you_have_entered_please_check_the_coupon_and_try_again_if_the_coupon_code_is_correct_please_contact_customer_service_at_1800scholastic_18007246527_displays() throws Throwable {
	pcod_logpage.verify_element_displayed(pcod_logpage.getmessagetooltiperrormsg());
	pcod_logpage.pcod_gettext_equals(pcod_logpage.getmessagetooltiperrormsg(),
			ConstantUtils.INCORRECTFREEPICKCOUPONCODEMSG, "FreePick coupon");
}

@Then("^error message “Our records indicate that coupon code \"([^\"]*)\" has already been redeemed.” displays$")
public void error_message_our_records_indicate_that_coupon_code_something_has_already_been_redeemed_displays(String strArg1) throws Throwable {
	pcod_logpage.verify_element_displayed(pcod_logpage.getmessagetooltiperrormsg());
	pcod_logpage.pcod_gettext_equals(pcod_logpage.getmessagetooltiperrormsg(),
			ConstantUtils.REDEEMEDFREEPICKCOUPONMSG, "FreePick coupon");
}

@Then("^error message “Your order does not meet the “XXXXX” coupon requirements\\. Please check the coupon for details\\.” displays$")
public void error_message_your_order_does_not_meet_the_xxxxx_coupon_requirements_please_check_the_coupon_for_details_displays() throws Throwable {
	pcod_logpage.verify_element_displayed(pcod_logpage.getmessagetooltiperrormsg());
	pcod_logpage.pcod_gettext_equals(pcod_logpage.getmessagetooltiperrormsg(),
			ConstantUtils.NOTELIGIBLECOUPONMSG, "FreePick coupon");
}

@Then("^error message “Our records indicate that coupon code \"([^\"]*)\" has expired.” displays$")
public void error_message_our_records_indicate_that_coupon_code_something_has_expired_displays(String strArg1) throws Throwable {
	pcod_logpage.verify_element_displayed(pcod_logpage.getmessagetooltiperrormsg());
	pcod_logpage.pcod_gettext_equals(pcod_logpage.getmessagetooltiperrormsg(),
			ConstantUtils.EXPIREDFREEPICKCOUPONMSG, "FreePick coupon");
}

@And("^parent clicks “Apply” button$")
public void parent_clicks_apply_button() throws Throwable {
	pcod_logpage.pcod_click_element(pcod_reviewpage.getbtnapplycouponcodereviewcart());
}


@When("^parent selects a grade from grade dropdown$")
public void parent_selects_a_grade_from_grade_dropdown() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	SCHUtils.waitForLoaderToDismiss();
	PauseUtil.waitForAjaxToComplete(5000);
	PauseUtil.pause(6000);
    WaitUtils.waitForEnabled(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards());
	SCHUtils.selectOptionsByVisibleText(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards(),
			TestBaseProvider.getTestBase().getTestData().getString("grade"));
	PauseUtil.pause(5000);
}

@And("^parent selects a grade$")
public void parent_selects_a_grade() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	SCHUtils.waitForLoaderToDismiss();
	PauseUtil.waitForAjaxToComplete(5000);
	PauseUtil.pause(6000);
    WaitUtils.waitForEnabled(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards());
	SCHUtils.selectOptionsByVisibleText(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards(),
			TestBaseProvider.getTestBase().getTestData().getString("grade"));
	PauseUtil.pause(5000);
}

@When("^parent clicks on grade level dropdown$")
public void parent_clicks_on_grade_level_dropdown() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	PauseUtil.waitForAjaxToComplete(2500);
    WaitUtils.waitForEnabled(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards());
}

@And("^parent clicks on grade level dropdown and select a grade from dropdown$")
public void parent_clicks_on_grade_level_dropdown_and_select_a_grade_from_dropdown() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	SCHUtils.waitForLoaderToDismiss();
	PauseUtil.waitForAjaxToComplete(5000);
	PauseUtil.pause(6000);
    WaitUtils.waitForEnabled(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards());
	SCHUtils.selectOptionsByVisibleText(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards(),
			TestBaseProvider.getTestBase().getTestData().getString("grade"));
	PauseUtil.pause(5000);
}


@And("^parent clicks on Pagination links$")
public void parent_clicks_on_pagination_links() throws Throwable {
    pcod_reviewpage.click_paginationlinks_freepick_modalwindow();
}


@Then("^10 results display on each page$")
public void ten_results_display_on_each_page() throws Throwable {
	pcod_reviewpage.result_paginationlinks_freepick_modalwindow(
			TestBaseProvider.getTestBase().getTestData().getString("freepick_result"));
}


@Then("^items less than or equal to the \\[coupon amount\\] displays in Freepick modal$")
public void items_less_than_or_equal_to_the_coupon_amount_displays_in_freepick_modal() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	checkoutPage.verifyManualFreePickItemsPriceWithInCouponAmount(
			TestBaseProvider.getTestBase().getTestData()
					.getDouble("ManualFreePickTier1CouponAmt"),
			TestBaseProvider.getTestBase().getTestData()
					.getDouble("ManualFreePickTier2CouponAmt"));
}



@Then("^teacher catalogues does not display in list of grades$")
public void teacher_catalogues_does_not_display_in_list_of_grades() throws Throwable {
    pcod_reviewpage.verify_Teacher_catalogue_is_not_displayed_in_Modal_window_dropDown();
}

@When("^parent searches for a keyword with more than 10 results$")
public void parent_searches_for_a_keyword_with_more_than_10_results() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
			TestBaseProvider.getTestBase().getTestData());
}

@When("^parent searches for a \\[search term\\]$")
public void parent_searches_for_a_search_term() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
			TestBaseProvider.getTestBase().getTestData());
}

@When("^parent searches for a \\[qualifying Item number\\]$")
public void parent_searches_for_a_qualifying_item_number() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
			TestBaseProvider.getTestBase().getTestData().getString("freebookID"));
}

@And("^parent selects item from the results$")
public void parent_selects_item_from_the_results() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    PauseUtil.waitForAjaxToComplete(1500);
    checkoutPage.MakeSelectionWindow_SelectItemFreePick();
}

@And("^parent searches for a \\[keyword\\]$")
public void parent_searches_for_a_keyword() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
			TestBaseProvider.getTestBase().getTestData());
}

@And("^parent searches for a \\[Author Name\\]$")
public void parent_searches_for_a_author_name() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
			TestBaseProvider.getTestBase().getTestData());
}


@And("^parent searches for a \\[Item title\\]$")
public void parent_searches_for_a_item_title() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
			TestBaseProvider.getTestBase().getTestData().getString("freebooktitle"));
}

@When("^parent searches item which is greater than coupon amount$")
public void parent_searches_item_which_is_greater_than_coupon_amount() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
			TestBaseProvider.getTestBase().getTestData());
}

@When("^parent searches teacher club item$")
public void parent_searches_teacher_club_item() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
			TestBaseProvider.getTestBase().getTestData().getString("teacher_item"));
}

@When("^parent searches expired item$")
public void parent_searches_expired_item() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
			TestBaseProvider.getTestBase().getTestData().getString("exp_item"));
}


@And("^parent searches for a \\[search term\\] with no results$")
public void parent_searches_for_a_search_term_with_no_results() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
			TestBaseProvider.getTestBase().getTestData());
}



@Then("^no results message displays$")
public void no_results_message_displays() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	checkoutPage.verify_no_search_results_display_in_MakeYourSelection_window(
			TestBaseProvider.getTestBase().getTestData().getString("message"));
}

@Then("^searched item\\(s\\) should display in result$")
public void searched_items_should_display_in_result() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	checkoutPage.verifyResultforParticularSearch_FreePickCoupon(
			TestBaseProvider.getTestBase().getTestData().getString("couponsearch"));
}


@Then("^searched item\\(s\\) should display in result w\\.r\\.t author$")
public void searched_items_should_display_in_result_wrt_author() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	checkoutPage.verifyResultforParticularSearch_FreePickCoupon(
			TestBaseProvider.getTestBase().getTestData().getString("exp_item"));
}

@When("^parent selects an item from the results$")
public void parent_selects_an_item_from_the_results() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	PauseUtil.waitForAjaxToComplete(1500);
	checkoutPage.MakeSelectionWindow_SelectItemFreePick();

}


@And("^parent selects an item from modal$")
public void parent_selects_an_item_from_modal() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	PauseUtil.waitForAjaxToComplete(1500);
	checkoutPage.MakeSelectionWindow_SelectItemFreePick();
}

@And("^parent selects an item$")
public void parent_selects_an_item() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	PauseUtil.waitForAjaxToComplete(1500);
	checkoutPage.MakeSelectionWindow_SelectItemFreePick();
}


@When("^parent clicks Cancel in freepick modal window$")
public void parent_clicks_cancel_in_freepick_modal_window() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	PauseUtil.waitForAjaxToComplete(1500);
	checkoutPage.clickOnCancel_CouponPopup();
	
}


@When("^parent clicks on close button$")
public void parent_clicks_on_close_button() throws Throwable {
	ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
	CheckoutPage.closes_the_Modal_window();
}

@When("^parent deletes the item from Current Selection section$")
public void parent_deletes_the_item_from_current_selection_section() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	checkoutPage.deletes_the_Selected_item_Modal_Selection_Window();
}


@Then("^Coupon is removed from the cart$")
public void coupon_is_removed_from_the_cart() throws Throwable {
	ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
	CheckoutPage.verify_selected_items_are_notsaved_in_Modal_window();
}


@When("^parent navigates to Shipping & Payment page$")
public void parent_navigates_to_shipping_payment_page() throws Throwable {
	PauseUtil.waitForAjaxToComplete(2500);
    PauseUtil.pause(2500);
    pcod_reviewpage.getbtnproceedtocheckoutreviewcart().click();
    
}

@When("^parent(\\d+) navigates to Shipping & Payment page$")
public void parent_navigates_to_shipping_payment_page(int arg1) throws Throwable {
	PauseUtil.waitForAjaxToComplete(2500);
    PauseUtil.pause(2500);
    pcod_reviewpage.getbtnproceedtocheckoutreviewcart().click();
    
}

@And("^select different child for second item added$")
public void select_different_child_for_second_item_added() throws Throwable {
	SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname2reviewcart(),(ConstantUtils.REVIEWCARTCHILD2));
	PauseUtil.pause(1500);
}


@And("^parent clicks on Confirm Selection button$")
public void parent_clicks_on_confirm_selection_button() throws Throwable {
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	checkoutPage.getICouponSection().clickOnConfrimAndApplyCoupon();
}


@Then("^the selected item displays under the paid item on shopping cart page$")
public void the_selected_item_displays_under_the_paid_item_on_shopping_cart_page() throws Throwable {
    pcod_reviewpage.verify_freepick_items_reviewcart();
}

@And("^the item image, item title, Book type\\(paper back or hard cover\\), Grade & Age, Reading level displays$")
public void the_item_image_item_title_book_typepaper_back_or_hard_cover_grade_age_reading_level_displays() throws Throwable {
    pcod_reviewpage.verify_freepick_itemdetails_reviewcartpage();
}

@And("^stricked price of the item and term FREE displays$")
public void stricked_price_of_the_item_and_term_free_displays() throws Throwable {
	pcod_reviewpage.verify_freepick_itemelements_reviewcartpage();
}

@And("^Child dropdown with default child selected and list of children in dropdown displays$")
public void child_dropdown_with_default_child_selected_and_list_of_children_in_dropdown_displays() throws Throwable {
	pcod_reviewpage.verify_freepick_itemelements_reviewcartpage();
}

@And("^Quantity 1 in disabled state displays$")
public void quantity_1_in_disabled_state_displays() throws Throwable {
	pcod_reviewpage.verify_freepick_itemelements_reviewcartpage();
}

@And("^Delete link displays under the Quantity$")
public void delete_link_displays_under_the_quantity() throws Throwable {
	pcod_reviewpage.verify_freepick_itemelements_reviewcartpage();
}

@And("^Total FREE and Coupon code displays$")
public void total_free_and_coupon_code_displays() throws Throwable {
	pcod_reviewpage.verify_freepick_itemelements_reviewcartpage();
}

@And("^Edit link displays under the coupon code$")
public void edit_link_displays_under_the_coupon_code() throws Throwable {
	pcod_reviewpage.verify_freepick_itemelements_reviewcartpage();
}

@And("^the selected item is assigned to the default child$")
public void the_selected_item_is_assigned_to_the_default_child() throws Throwable {
	 pcod_reviewpage.Verify_defaultChild_items_reviewcart(pcod_reviewpage.sizedrpdownchildname2reviewcart(),
			 pcod_reviewpage.getdrpdownchildname2reviewcart());
}

@And("^the selected free pick item is assigned to the default child$")
public void the_selected_free_pick_item_is_assigned_to_the_default_child() throws Throwable {
	pcod_reviewpage.Verify_defaultchildnames_FreePick_items_reviewcart();
}

@And("^the items are assigned to the \\(default child\\) Child1$")
public void the_items_are_assigned_to_the_default_child_child1() throws Throwable {
	pcod_reviewpage.Verify_defaultChild_items_reviewcart(pcod_reviewpage.sizedrpdownchildname1reviewcart(),
			 pcod_reviewpage.getdrpdownchildname1reviewcart());
	 pcod_reviewpage.Verify_defaultChild_items_reviewcart(pcod_reviewpage.sizedrpdownchildname2reviewcart(),
			 pcod_reviewpage.getdrpdownchildname2reviewcart());
}

@And("^the freepick item is assigned to default child$")
public void the_freepick_item_is_assigned_to_default_child() throws Throwable {
	pcod_reviewpage.ReassignChild1_FreePick_items_reviewcart();
}

@When("^parent selects a different child from the dropdown$")
public void parent_selects_a_different_child_from_the_dropdown() throws Throwable {
	pcod_reviewpage.ReassignChild2_FreePick_items_reviewcart();
}

@Then("^freepick item is assigned to the recently selected child$")
public void freepick_item_is_assigned_to_the_recently_selected_child() throws Throwable {
	pcod_reviewpage.Verify_reassigned_childnames_FreePick_items_reviewcart();
}


@And("^the items are assigned to the default child$")
public void the_items_are_assigned_to_the_default_child() throws Throwable {
	 pcod_reviewpage.Verify_defaultChild_items_reviewcart(pcod_reviewpage.sizedrpdownchildname1reviewcart(),
             pcod_reviewpage.getdrpdownchildname1reviewcart());
	 
	 pcod_reviewpage.Verify_defaultChild_items_reviewcart(pcod_reviewpage.sizedrpdownchildname2reviewcart(),
             pcod_reviewpage.getdrpdownchildname2reviewcart());
}

@When("^parent selects a different child from the dropdown for the freepick item$")
public void parent_selects_a_different_child_from_the_dropdown_for_the_freepick_item() throws Throwable {
	/*SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname2reviewcart(),(ConstantUtils.REVIEWCARTCHILD2));
	PauseUtil.pause(1500);
	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild", String.valueOf
	        (pcod_reviewpage.getdrpdownchildname2reviewcart().getText()));*/
	
	pcod_reviewpage.ReassignChild2_FreePick_items_reviewcart();
}

@And("^selects a freepick item and assigns to child1$")
public void selects_a_freepick_item_and_assigns_to_child1() throws Throwable {
	pcod_reviewpage.ReassignChild1_FreePick_items_reviewcart();
}

@And("^parent selects a freepick item and assigns to child2$")
public void parent_selects_a_freepick_item_and_assigns_to_child2() throws Throwable {
	pcod_reviewpage.ReassignChild2_FreePick_items_reviewcart();
}


@When("^parent assigns few books to one child and the rest to different child$")
public void parent_assigns_few_books_to_one_child_and_the_rest_to_different_child() throws Throwable {
	SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname2reviewcart(),(ConstantUtils.REVIEWCARTCHILD2));
	PauseUtil.pause(1500);
	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild", String.valueOf
	        (pcod_reviewpage.getdrpdownchildname2reviewcart().getText()));
}

@And("^reassigns them to a different child$")
public void reassigns_them_to_a_different_child() throws Throwable {
	SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname2reviewcart(),(ConstantUtils.REVIEWCARTCHILD2));
	PauseUtil.pause(1500);
	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild", String.valueOf
	        (pcod_reviewpage.getdrpdownchildname2reviewcart().getText()));
}

@And("^reassigns few items to child2$")
public void reassigns_few_items_to_child2() throws Throwable {
	//pcod_reviewpage.getdrpdownchildname2reviewcart().click();
	SCHUtils.clickUsingJavaScript(pcod_reviewpage.getdrpdownchildname2reviewcart());
	SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname2reviewcart(),(ConstantUtils.REVIEWCARTCHILD2));
	PauseUtil.pause(1500);
	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild", String.valueOf
	        (pcod_reviewpage.getdrpdownchildname2reviewcart().getText()));
}

@When("^few items are assigned to child2$")
public void few_items_are_assigned_to_child2() throws Throwable {
	PauseUtil.pause(4500);
	pcod_logpage.pcod_click_element(pcod_reviewpage.getdrpdwnchildname2reviewcart());
	SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname2reviewcart(),(ConstantUtils.REVIEWCARTCHILD2));
	PauseUtil.pause(2500);
	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild", String.valueOf
	        (pcod_reviewpage.getdrpdownchildname2reviewcart().getText()));
	
	Thread.sleep(2500);
    double item1price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem1totalpricereviewcartpage());
    
    
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item1.totalprice", item1price);
    
    double item2price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem2totalpricereviewcartpage());
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item2.totalprice", item2price);
    
    pcod_reviewpage.calculate_2items_taxes_shoppingcart(
            pcod_reviewpage.sizedrpdownchildname1reviewcart(), pcod_reviewpage.getlblitem1unitpricereviewcartpage(), stud_page.cart_qty_item1(),
            pcod_reviewpage.sizedrpdownchildname2reviewcart(), pcod_reviewpage.getlblitem2unitpricereviewcartpage(), stud_page.cart_qty_item2());
}


@And("^reassigns few items to child2 and child3$")
public void reassigns_few_items_to_child2_and_child3() throws Throwable {
	SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname2reviewcart(),(ConstantUtils.REVIEWCARTCHILD2));
	PauseUtil.pause(1500);
	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild", String.valueOf
	        (pcod_reviewpage.getdrpdownchildname2reviewcart().getText()));
	SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname3reviewcart(),(ConstantUtils.REVIEWCARTCHILD3));
	PauseUtil.pause(1500);
	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild3", String.valueOf
            (pcod_reviewpage.getdrpdownchildname3reviewcart().getText()));
}

@And("^parent reassigns all items to child1$")
public void parent_reassigns_all_items_to_child1() throws Throwable {
	SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname1reviewcart(),(ConstantUtils.REVIEWCARTCHILD1));
	PauseUtil.pause(1500);
	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild1", String.valueOf
	        (pcod_reviewpage.getdrpdownchildname1reviewcart().getText()));
	SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname2reviewcart(),(ConstantUtils.REVIEWCARTCHILD1));
	PauseUtil.pause(1500);
	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild1", String.valueOf
	        (pcod_reviewpage.getdrpdownchildname2reviewcart().getText()));
}

@When("^parent clicks on child dropdown$")
public void parent_clicks_on_child_dropdown() throws Throwable {
   pcod_logpage.pcod_click_element(pcod_reviewpage.getdrpdwnchildname1reviewcart());
}

@When("^parent clicks on child dropdown for few items$")
public void parent_clicks_on_child_dropdown_for_few_items() throws Throwable {
	 pcod_logpage.pcod_click_element(pcod_reviewpage.getdrpdwnchildname2reviewcart());
}

@Then("^the free pick item is assigned to the reassigned child$")
public void the_free_pick_item_is_assigned_to_the_reassigned_child() throws Throwable {
   // pcod_reviewpage.Verify_reassignedChild_items_reviewcart(pcod_reviewpage.getdrpdownchildname2reviewcart());
	pcod_reviewpage.Verify_reassigned_childnames_FreePick_items_reviewcart();
}


@Then("^child dropdown on all the books are updated to the recently assigned child$")
public void child_dropdown_on_all_the_books_are_updated_to_the_recently_assigned_child() throws Throwable {
	 pcod_reviewpage.Verify_defaultChild_items_reviewcart(pcod_reviewpage.sizedrpdownchildname1reviewcart(),
			 pcod_reviewpage.getdrpdownchildname1reviewcart());
	pcod_reviewpage.Verify_reassignedChild_items_reviewcart(pcod_reviewpage.getdrpdownchildname2reviewcart());
}

@Then("^all the items that are reassigned are now assigned to the re\\-assigned child$")
public void all_the_items_that_are_reassigned_are_now_assigned_to_the_reassigned_child() throws Throwable {
	pcod_reviewpage.Verify_reassignedChild_items_reviewcart(pcod_reviewpage.getdrpdownchildname2reviewcart());
}

@And("^the other items are still assigned to default child$")
public void the_other_items_are_still_assigned_to_default_child() throws Throwable {
	 pcod_reviewpage.Verify_defaultChild_items_reviewcart(pcod_reviewpage.sizedrpdownchildname1reviewcart(),
             pcod_reviewpage.getdrpdownchildname1reviewcart());
}


@Then("^all the children are listed in the dropdown$")
public void all_the_children_are_listed_in_the_dropdown() throws Throwable {
    pcod_reviewpage.verify_childs_childdropdown_reviewcart(pcod_reviewpage.getdrpdownchildname1reviewcart());
}

@And("^the order in which the children are displayed are based on highest to lowest grade of the child$")
public void the_order_in_which_the_children_are_displayed_are_based_on_highest_to_lowest_grade_of_the_child() throws Throwable {
	 pcod_reviewpage.verify_childs_childdropdown_reviewcart(pcod_reviewpage.getdrpdownchildname1reviewcart());
}

@And("^Parent navigates to Home page$")
public void parent_navigates_to_home_page() throws Throwable {
    pcod_logpage.pcod_click_element(teach_homepage.Home_icon_on_header());
    PauseUtil.waitForAjaxToComplete(2500);
    PauseUtil.pause(4500);
}


@When("^Parent navigates back to Shopping cart page$")
public void parent_navigates_back_to_shopping_cart_page() throws Throwable {
	pcod_logpage.pcod_click_element(teach_homepage.btn_mini_reviewCart());
    PauseUtil.waitForAjaxToComplete(2500);
    PauseUtil.pause(4500);
}

@When("^Parent navigates back to Shopping cart page from shipping & payment page$")
public void parent_navigates_back_to_shopping_cart_page_from_shipping_payment_page() throws Throwable {
	ShippingAndPayment shippingAndPaymentPage =
			getFactory().getICheckoutPage().getShippingAndPaymentSection();
	shippingAndPaymentPage.getLnkEditCart().click();
    PauseUtil.waitForAjaxToComplete(2500);
    PauseUtil.pause(4500);
}

@When("^Parent navigates back to Shopping cart page from submit your order page$")
public void parent_navigates_back_to_shopping_cart_page_from_submit_your_order_page() throws Throwable {
	ConfirmAndSubmitOrder cf = getFactory().getICheckoutPage().getConfirmAndSubmitOrder();
    PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(4500);
	cf.getBtneditcartonconfirmpage().click();
    PauseUtil.waitForAjaxToComplete(2500);
    PauseUtil.pause(4500);
}

@When("^parent clicks on Scholastic\\.ca from the footer$")
public void parent_clicks_on_scholasticca_from_the_footer() throws Throwable {
   pcod_logpage.pcod_click_element(pcod_reviewpage.getlnkscholasticcapcodfooter());
}

@When("^parent clicks on About Scholastic from the footer$")
public void parent_clicks_on_about_scholastic_from_the_footer() throws Throwable {
	pcod_logpage.pcod_click_element(pcod_reviewpage.getlnkaboutscholasticpcodfooter());
}

@When("^parent clicks on Careers from the footer$")
public void parent_clicks_on_careers_from_the_footer() throws Throwable {
	pcod_logpage.pcod_click_element(pcod_reviewpage.getlnkcareerspcodfooter());
}

@When("^parent clicks on International from the footer$")
public void parent_clicks_on_international_from_the_footer() throws Throwable {
	pcod_logpage.pcod_click_element(pcod_reviewpage.getlnkinternationalpcodfooter());
}

@When("^parent clicks on Privacy policy from the footer$")
public void parent_clicks_on_privacy_policy_from_the_footer() throws Throwable {
	pcod_logpage.pcod_click_element(pcod_reviewpage.getlnkprivacypolicypcodfooter());
}

@When("^parent clicks on Web Privacy policy from the footer$")
public void parent_clicks_on_web_privacy_policy_from_the_footer() throws Throwable {
	pcod_logpage.pcod_click_element(pcod_reviewpage.getlnkwebprivacypolicypcodfooter());
}

@When("^parent clicks on Terms of Use from the footer$")
public void parent_clicks_on_terms_of_use_from_the_footer() throws Throwable {
	pcod_logpage.pcod_click_element(pcod_reviewpage.getlnktermsofusepcodfooter());
}

@Then("^parent is redirected to http:\\/\\/www\\.scholastic\\.ca\\/$")
public void parent_is_redirected_to_httpwwwscholasticca() throws Throwable {
    pcod_logpage.verify_currentpage_URL(TestBaseProvider.getTestBase().getTestData().getString("url"));
}

@Then("^parent is redirected to http:\\/\\/www\\.scholastic\\.ca\\/aboutscholastic\\/$")
public void parent_is_redirected_to_httpwwwscholasticcaaboutscholastic() throws Throwable {
	pcod_logpage.verify_currentpage_URL(TestBaseProvider.getTestBase().getTestData().getString("url"));
}

@Then("^parent is redirected to http:\\/\\/www\\.scholastic\\.ca\\/aboutscholastic\\/careers\\.php$")
public void parent_is_redirected_to_httpwwwscholasticcaaboutscholasticcareersphp() throws Throwable {
	pcod_logpage.verify_currentpage_URL(TestBaseProvider.getTestBase().getTestData().getString("url"));
}

@Then("^parent is redirected to http:\\/\\/www\\.scholastic\\.ca\\/aboutscholastic\\/businesses_worldwide\\.php$")
public void parent_is_redirected_to_httpwwwscholasticcaaboutscholasticbusinessesworldwidephp() throws Throwable {
	pcod_logpage.verify_currentpage_URL(TestBaseProvider.getTestBase().getTestData().getString("url"));
}

@Then("^parent is redirected to http:\\/\\/www\\.scholastic\\.ca\\/aboutscholastic\\/privacy\\.php$")
public void parent_is_redirected_to_httpwwwscholasticcaaboutscholasticprivacyphp() throws Throwable {
	pcod_logpage.verify_currentpage_URL(TestBaseProvider.getTestBase().getTestData().getString("url"));
}

@Then("^parent is redirected to http:\\/\\/www\\.scholastic\\.ca\\/aboutscholastic\\/webprivacy\\.php$")
public void parent_is_redirected_to_httpwwwscholasticcaaboutscholasticwebprivacyphp() throws Throwable {
	pcod_logpage.verify_currentpage_URL(TestBaseProvider.getTestBase().getTestData().getString("url"));
}

@Then("^parent is redirected to http:\\/\\/www\\.scholastic\\.ca\\/aboutscholastic\\/webterms\\.php$")
public void parent_is_redirected_to_httpwwwscholasticcaaboutscholasticwebtermsphp() throws Throwable {
	pcod_logpage.verify_currentpage_URL(TestBaseProvider.getTestBase().getTestData().getString("url"));
}

@When("^parent navigates to Submit Your Order page from shopping cart page$")
public void parent_navigates_to_submit_your_order_page_from_shopping_cart_page() throws Throwable {
    pcod_reviewpage.navigate_from_shoppingcart_to_submitorderpage();
}

@And("^parent navigates to Submit Your Order page page$")
public void parent_navigates_to_submit_your_order_page_page() throws Throwable {
	pcod_reviewpage.navigate_from_shoppingcart_to_submitorderpage();
}

//@Then("^Delete confirmation tooltip displays with \"([^\"]*)\" text with buttons YES and NO$")
@Then("^Delete confirmation tooltip displays with Delete this item text with buttons YES and NO$")
public void Delete_confirmation_tooltip_displays_with_text_with_buttons_YES_and_NO() throws Throwable {
    PauseUtil.pause(5000);
    pcod_reviewpage.verify_popup_removeFreeitem();

    }

    @And("^clicks on NO$")
    public void clicks_on_no() throws Throwable {

        SCHUtils.waitForElementToBeClickable(pcod_reviewpage.getbuttonDeletePopupNO(),5);
        pcod_reviewpage.getbuttonDeletePopupNO().click();
    }

    @Then("^Free pick item is not deleted$")
    public void free_pick_item_is_not_deleted() throws Throwable {
        pcod_reviewpage.frepickItemnotremoved();

    }


    @And("^is retained in its original state$")
    public void is_retained_in_its_original_state() throws Throwable {

    }


    @And("^clicks on YES$")
    public void clicks_on_YES() throws Throwable {
        SCHUtils.waitForElementToBeClickable(pcod_reviewpage.getbuttonDeletePopupYes(),5);
        pcod_reviewpage.getbuttonDeletePopupYes().click();
    }

    @Then("^Free pick item is deleted from cart$")
    public void Free_pick_item_is_deleted_from_cart() throws Throwable {
        pcod_reviewpage.verify_freeItemRemoved();
    }

    @And("^the coupon is also removed$")
    public void the_coupon_is_also_removed() throws Throwable {
        pcod_reviewpage.verify_freepickItemdeleted();
    }

    
    @When("^parent deletes item from cart making cart total fall below \\[minimum amount\\]$")
    public void parent_deletes_item_from_cart_making_cart_total_fall_below_minimum_amount() throws Throwable {
        teach_homepage.delete_item1_reviewcart().click();
		PauseUtil.pause(2000);
		teach_homepage.YES_to_delete_item1_reviewcart().click();
		PauseUtil.pause(8000);
    }
    
    @Then("^coupon is automatically removed from the cart$")
    public void coupon_is_automatically_removed_from_the_cart() throws Throwable {
        pcod_reviewpage.verify_FREEPICKRemoved_whenItemsDeleted();
    }



    @And("^teacher navigates to Review cart page$")
    public void teacher_navigates_to_Review_cart_page() throws Throwable {



    }

    @When("^teacher updates the quantity of an item to (\\d+)$")
    public void teacher_updates_the_quantity_of_an_item_to(int arg1) throws Throwable {
        pcod_reviewpage.reveiwpageUpdateqty(TestBaseProvider.getTestBase().getTestData().getString("newQty"));


    }

    @And("^focus out of the field$")
    public void focus_out_of_the_field() throws Throwable {
        pcod_reviewpage.reviewcartpage_Tabfromqty();

    }


    @And("^click on Continue Checkout$")
    public void click_on_Continue_Checkout() throws Throwable {
         pcod_reviewpage.reviewcartpage_clickButton_continueChkout();
    }

    @When("^teacher reduces the quantity of an item to (\\d+) by clicking on '-'$")
    public void teacher_reduces_the_quantity_of_an_item_to_by_clicking_on_(int arg1) throws Throwable {

        pcod_reviewpage.click_reduceitemqty();

    }

    @When("^teacher tries to enter a negative value in Quantity$")
    public void teacher_tries_to_enter_a_negative_value_in_Quantity() throws Throwable {
        pcod_reviewpage.reveiwpageUpdateqty(TestBaseProvider.getTestBase().getTestData().getString("newQty"));

    }

    @Then("^negative sign is not accepted$")
    public void negative_sign_is_not_accepted() throws Throwable {
        pcod_reviewpage.getItemqtycount();

    }

    @When("^teacher tries to (\\d+) digits in Quantity field$")
    public void teacher_tries_to_digits_in_Quantity_field(int arg1) throws Throwable {
        pcod_reviewpage.reveiwpageUpdateqty(TestBaseProvider.getTestBase().getTestData().getString("newQty"));


    }

    @Then("^only (\\d+) digits are accepted$")
    public void only_digits_are_accepted(int arg1) throws Throwable {
        String value = pcod_reviewpage.getreviewcartitemqty().getAttribute("value");
        int number = Integer.parseInt(value);
        if(number>999){
            Assert.fail("Qty should not be more than 3 characters");
        }
    }

    @When("^parent clicks on edit option of Freepick$")
    public void parent_clicks_on_edit_option_of_Freepick() throws Throwable {

        pcod_reviewpage.click_edit_FREEPICK();

        
    }

    @Then("^free pick modal displays with the selected item displayed in the current selection section$")
    public void free_pick_modal_displays_with_the_selected_item_displayed_in_the_current_selection_section() throws Throwable {
        pcod_reviewpage.verify_MakeSelection_Modal_FreePick();
    }

    @And("^parent selects a different grade from dropdown$")
    public void parent_selects_a_different_grade_from_dropdown() throws Throwable {
        pcod_reviewpage.editFreePick_selectGrade();
    }

    @And("^parent selects a different item from Free Pick modal window$")
    public void parent_selects_a_different_item_from_Free_Pick_modal_window() throws Throwable {
        pcod_reviewpage.editFreePick_selectItem();

    }

    @Then("^the recently selected free pick item information is shown on Shopping cart page$")
    public void the_recently_selected_free_pick_item_information_is_shown_on_Shopping_cart_page() throws Throwable {
        pcod_reviewpage.verifyItem_editFreePick_shoppingCart();
    }

    @And("^deletes the item from current selection section$")
    public void deletes_the_item_from_current_selection_section() throws Throwable {
        pcod_reviewpage.verifyItem_editFreePick_shoppingCart();
        pcod_reviewpage.getFreeitemselectedToDelete().click();

    }

    @Then("^Confirm selection button is disabled$")
    public void Confirm_selection_button_is_disabled() throws Throwable {
        pcod_reviewpage.editFreePick_Modal_Cancel_NotDisplayed();


    }

    @And("^there is no way for the user to proceed without selecting freepick item$")
    public void there_is_no_way_for_the_user_to_proceed_without_selecting_freepick_item() throws Throwable {
        // UI Issue is there.
    }

    @And("^parent clicks on Close$")
    public void parent_clicks_on_Close() throws Throwable {
        pcod_reviewpage.click_Cancel_FreePick_CurrentSelection();
    }

    @Then("^the recently selected free pick item information is not saved$")
    public void the_recently_selected_free_pick_item_information_is_not_saved() throws Throwable {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verifyYourCurrentSelectionSection_FreePickCoupon();
    }
    
    @Then("^parent should not see “Move to Wish List” hyperlink in shopping cart$")
    public void parent_should_not_see_move_to_wish_list_hyperlink_in_shopping_cart() throws Throwable {
    	pcod_logpage.pcod_get_text_notcontains(pcod_reviewpage.getpagereviewcartpage(), 
    			TestBaseProvider.getTestBase().getTestData().getString("movetowishlist"));
    }
    
    //############################################# DWCAPCOD - 201 #######################################################
    @When("^parent selects child not connected to teacher from child dropdown$")
    public void parent_selects_child_not_connected_to_teacher_from_child_dropdown() throws Throwable {
    	PauseUtil.pause(4500);
    	Boolean available_child_not_connected = pcod_reviewpage.pcod_check_child_not_connected_to_teacher_reviewpage();
    	
    	if(!available_child_not_connected){
    		Date date = new Date();
    		pcod_logpage.pcod_enteralldata_addachild(TestBaseProvider.getTestBase().getTestData().getString("firstname") + date.getTime(), TestBaseProvider.getTestBase().getTestData().getString("lastname"));
    		pcod_homepage.getbtnsaveaddachildhomepage().click();
    		pcod_reviewpage.pcod_check_child_not_connected_to_teacher_reviewpage();
    	}
    }

    @Then("^<ChildFirstName LastName> displays in child dropdown$")
    public void childfirstname_LastName_displays_in_child_dropdown() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_reviewpage.pcod_verify_reviewpage_displays();
    	pcod_reviewpage.pcod_check_connectedchild_in_dropdown_reviewCart();
    }

    @Then("^<ChildFirstName> in <TeacherName>'s class displays in child dropdown on Home page$")
    public void childfirstname_in_TeacherName_s_class_displays_in_child_dropdown_on_Home_page() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_Click_homepage_icon();
    	
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_childFirstName_TeacherName_display_in_dropdown_homepage();
    }

    @Then("^<ChildFirstName> in <TeacherName>'s class displays in My Children section in My Account page$")
    public void childfirstname_in_TeacherName_s_class_displays_in_My_Children_section_in_My_Account_page() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_homepage.pcod_clickMyAcc_Profile();
    	pcod_homepage.pcod_childFirstName_TeacherName_display_in_myChildrenSection_myAccount();
    }
    //############################################# DWCAPCOD - 201 #######################################################
    
    @Given("^parent navigate to the Review Cart page$")
    public void parent_navigate_to_the_Review_Cart_page() throws Throwable {
    	pcod_reviewpage.pcod_go_to_review_cart_page();
    }
    
    
    //############################################# DWCAPCOD - 1662 #######################################################
    @When("^parent applies Free Pick coupon$")
    public void parent_applies_Free_Pick_coupon() throws Throwable {
    	pcod_reviewpage.pcod_apply_free_pick_coupon();
    }

    @When("^parent searches for a Teacher Resource item# in the Free Pick modal$")
    public void parent_searches_for_a_Teacher_Resource_item() throws Throwable {
    	pcod_reviewpage.pcod_search_for_item_free_pick_modal();
    }
    
    @When("^parent clicks on grade from grade level dropdown$")
    public void parent_clicks_on_grade_from_grade_level_dropdown() throws Throwable {
    	pcod_reviewpage.pcod_click_and_select_grade_level_dropdown();
    }

    @Then("^parent do not see teacher resource items in the results$")
    public void parent_do_not_see_teacher_resource_items_in_the_results() throws Throwable {
    	pcod_reviewpage.pcod_no_results_displayed_free_pick_modal();
    }
    
    @Then("^parent do not see teacher resource items in the selection section$")
    public void parent_do_not_see_teacher_resource_items_in_the_selection_section() throws Throwable {
    	pcod_reviewpage.pcod_item_not_available_in_free_pick_modal();
    }
    //############################################# DWCAPCOD - 1662 #######################################################
}
