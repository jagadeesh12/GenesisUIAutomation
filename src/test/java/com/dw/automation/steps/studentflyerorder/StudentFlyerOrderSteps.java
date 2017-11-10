package com.dw.automation.steps.studentflyerorder;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import java.util.ArrayList;
import java.util.List;

import com.dw.automation.pages.impl.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.dw.automation.pages.ICartPage;
import com.dw.automation.pages.ICheckoutPage;
import com.dw.automation.pages.ICheckoutPage_2;
import com.dw.automation.pages.ILoginPage;
import com.dw.automation.pages.IProductDetailPage;
import com.dw.automation.pages.IReviewOrderPage;
import com.dw.automation.pages.IStudentFlyerOrdersPage;
import com.dw.automation.pages.IStudentOnlineOrdersPage;
import com.dw.automation.pages.ITeachersHomePage;
import com.dw.automation.pages.IYourTeacherOrderPage;
import com.dw.automation.pages.impl.CheckoutPage.ConfirmAndSubmitOrder;
import com.dw.automation.pages.impl.CheckoutPage.RewardsAndCoupons;
import com.dw.automation.pages.impl.CheckoutPage.ShippingAndPayment;
import com.dw.automation.sections.IHeaderSection;
import com.dw.automation.sections.base.SectionFactory;
import com.dw.automation.sections.impl.CouponSection;
import com.dw.automation.steps.TeacherCart.TotlaOwing;
import com.dw.automation.steps.teachercheckout.TeacherCheckOutSteps;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.LocatorUtils;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.WaitUtils;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentFlyerOrderSteps {
	//StudentFlyerOrdersPage studorderpage = new StudentFlyerOrdersPage();

	TotlaOwing Total_Owing_Amount_act_1= new TotlaOwing() ;
	ProductDetails proddetails = new ProductDetails();
	CartTotals carttotals = new CartTotals();
	StudentFlyerOrdersPage studorderpage = new StudentFlyerOrdersPage();
	CheckoutPage chkpage = new CheckoutPage();
	ShippingAndPayment shippingAndPaymentPage =
			getFactory().getICheckoutPage().getShippingAndPaymentSection();
	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
	RewardsAndCoupons rewardsAndCoupons =
			getFactory().getICheckoutPage().getRewardsAndCouponsSection();
	CartPage cartpage = new CartPage();


	@Given("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user updates quantity$")
	public void user_updates_quantity() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user should be view updated records$")
	public void user_should_be_view_updated_records() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user should not be able to update quantity more than (\\d+)$")
	public void user_should_not_be_able_to_update_quantity_more_than(int arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user selects item for removal and confirms$")
	public void user_selects_item_for_removal_and_confirms() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user verifies cart items$")
	public void user_verifies_cart_items() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user selects Review Cart$")
	public void user_selects_Review_Cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickOnReviewCart();
	}

	@Then("^user should be view updated quantity in cart$")
	public void user_should_be_view_updated_quantity_in_cart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user should be view Item details$")
	public void user_should_be_view_Item_details() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user should view book title and list grouped by student name$")
	public void user_should_view_book_title_and_list_grouped_by_student_name()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user should view multiple items in ascending order$")
	public void user_should_view_multiple_items_in_ascending_order() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user should view student level subtotal of quantity and price$")
	public void user_should_view_student_level_subtotal_of_quantity_and_price()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user verifies cart items and verify notification diapppears$")
	public void user_verifies_cart_items_and_verify_notification_diapppears()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user selects order summary$")
	public void user_selects_order_summary() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user should view order summary detail$")
	public void user_should_view_order_summary_detail() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user submits the order for children$")
	public void user_submits_the_order_for_children() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^order should be submitted to teacher$")
	public void order_should_be_submitted_to_teacher() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user logouts from application$")
	public void user_logouts_from_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^verifies Student Flyer Orders Buttons$")
	public void verifies_Student_Flyer_Orders_Buttons() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^verifies Student Online Orders$")
	public void verifies_Student_Online_Orders() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^verifies Your Teacher Orders Buttons$")
	public void verifies_Your_Teacher_Orders_Buttons() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user should be able to view review page$")
	public void user_should_be_able_to_view_review_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user should add or edit order$")
	public void user_should_add_or_edit_order() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user selects Student Flyer Order Tab$")
	public void user_selects_Student_Flyer_Order() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickOnSFO();
	}

	@When("^user selects Your Teacher Order Tab$")
	public void user_selects_Your_Teacher_Order() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickOnYTO();
		PauseUtil.pause(7000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(5000);
		IYourTeacherOrderPage yourTeacherOrderPage =
				getFactory().getIYourTeacherOrderPage();
		yourTeacherOrderPage.clickOnByFlyerLink();
		PauseUtil.pause(5000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(5000);
	}

	@Then("^user verifies item status$")
	public void user_verifies_item_status() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user verifies Add button functionality$")
	public void user_verifies_Add_button_functionality() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user verifies student name field$")
	public void user_verifies_student_name_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user verifies item number field$")
	public void user_verifies_item_number_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user verifies flyer order item details$")
	public void user_verifies_flyer_order_item_details() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user verifies flyer order quantity field$")
	public void user_verifies_flyer_order_quantity_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user adds order with coupon$")
	public void user_adds_order_with_coupon() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user verifies coupon message$")
	public void user_verifies_coupon_message() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	/*@When("^teacher adds \\[ItemInformation\\] from SF page$")
	public void teacher_adds_ItemInformation_from_SF_page() {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder(
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemid"));
	}*/

	@When("^teacher adds \\[ItemInformation\\] from SF page$")
	public void teacher_adds_ItemInformation_from_SF_page() {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder(
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}




	@And("^teacher adds “ItemInformation” from YTO page$")
	public void teacher_adds_iteminformation_from_yto_page() throws Throwable {
		System.out.println("CALLING ITEMINFO STATEMENT"+System.currentTimeMillis());
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@When("^teacher searches for item which is present in logged in teacher's grade and also in other grades$")
	public void teacher_searches_for_item_which_is_present_in_logged_in_teachers_grade_and_also_in_other_grades() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"));
	}

	@And("^mouse hover the grade in PDP page$")
	public void mouse_hover_the_grade_in_pdp_page() throws Throwable {
		System.out.println("yet to implement this");
	}


	@When("^teacher searches for item which is present in multiple grades$")
	public void teacher_searches_for_item_which_is_present_in_multiple_grades() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"));
	}

	@When("^teacher add item to cart which is present in logged in teacher's grade and also in other grades$")
	public void teacher_add_item_to_cart_which_is_present_in_logged_in_teachers_grade_and_also_in_other_grades() throws Throwable {
		System.out.println("CALLING ITEMINFO STATEMENT"+System.currentTimeMillis());
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@When("^teacher add item to cart which is not present in logged in teacher's grade$")
	public void teacher_add_item_to_cart_which_is_not_present_in_logged_in_teachers_grade() throws Throwable {
		System.out.println("CALLING ITEMINFO STATEMENT"+System.currentTimeMillis());
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@When("^teacher searches for item which is not present in logged in teacher's grade$")
	public void teacher_searches_for_item_which_is_not_present_in_logged_in_teachers_grade() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"));
	}


	@And("^teacher add “teacher club items” to cart from YTO page$")
	public void teacher_add_teacher_club_items_to_cart_from_yto_page() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillTeacherCatalogueFlyerOrder(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice_limit"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
		PauseUtil.pause(2000);
		PauseUtil.waitForAjaxToComplete(3000);
		StudentFlyerOrdersPage studentFlyerOrdersPage = new StudentFlyerOrdersPage();
		studentFlyerOrdersPage.getBtnReviewCart().click();



	}



	@And("^teacher adds Teacher items to cart less than \\[Manual FreePick Coupon\\]$")
	public void teacher_adds_teacher_items_to_cart_less_than_manual_freepick_coupon() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}



	@And("^teacher adds “ItemInformation” from SF page with (.+) and (.+)$")
	public void teacher_adds_iteminformation_from_sf_page_with_and(String studentname, String quantity) throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder(studentname,quantity);
	}


	@And("^teacher adds student club items to cart with \\[minumum amount\\]$")
	public void teacher_adds_student_club_items_to_cart_with_minumum_amount() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder_Eligible_Promotions(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice_limit"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@And("^teacher adds \\[ItemInformation\\] eligible amount for Dollars to Spend from SF page$")
	public void teacher_adds_iteminformation_eligible_amount_for_dollars_to_spend_from_sf_page() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder_Eligible_Promotions(TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getDouble("itempricelimit"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}



	@When("^teacher adds \\[ItemInformation\\] eligible amount for Bonus Flat$")
	public void teacher_adds_iteminformation_eligible_amount_for_bonus_flat() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder_Eligible_Promotions(TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getDouble("itempricelimit"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@When("^teacher adds \\[ItemInformation\\] eligible amount for Bonus Percentage$")
	public void teacher_adds_iteminformation_eligible_amount_for_bonus_Percentage() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}



	@And("^teacher adds items to cart equal to the \\[shipping threshold\\]$")
	public void teacher_adds_items_to_cart_equal_to_the_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@And("^teacher adds Teacher items to cart equal to the \\[shipping threshold\\]$")
	public void teacher_adds_teacher_items_to_cart_equal_to_the_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}



	@And("^teacher adds Teacher items to cart equal to the \\[Free Item Promotion\\]$")
	public void teacher_adds_teacher_items_to_cart_equal_to_the_free_item_promotion() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@When("^teacher add teacher club items to cart$")
	public void teacher_add_teacher_club_items_to_cart() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillTeacherCatalogueFlyerOrder(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice_limit"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}



	@When("^teacher adds Teacher items to cart equal to the \\[Manual Free Item Coupon\\]$")
	public void teacher_adds_teacher_items_to_cart_equal_to_the_manual_free_item_coupon() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@And("^teacher add Teacher club items to cart qualifying for \\[Manual Free shipping coupon\\]$")
	public void teacher_add_teacher_club_items_to_cart_qualifying_for_manual_free_shipping_coupon() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@And("^teacher add Teacher and Student club items to cart less than \\[Shipping Threshold\\]$")
	public void teacher_add_teacher_and_student_club_items_to_cart_less_than_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		iStudentFlyerOrdersPage.placeItems_GlobalSearch_Teach_StudentItems(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
				TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));
	}



	@And("^teacher add Student club items to cart qualifying for \\[Manual Free shipping coupon\\]$")
	public void teacher_add_student_club_items_to_cart_qualifying_for_manual_free_shipping_coupon() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@And("^teacher add items from different Student and Teacher clubs$")
	public void teacher_add_items_from_different_student_and_teacher_clubs() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		iStudentFlyerOrdersPage.placeItems_GlobalSearch_Teach_StudentItems(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
				TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));
	}



	@And("^teacher add “teacher club items” to cart equal to the \\[shipping threshold\\]$")
	public void teacher_add_teacher_club_items_to_cart_equal_to_the_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillTeacherCatalogueFlyerOrder(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice_limit"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@And("^teacher adds teacher club items to cart meeting the \\[Manual shipping threshold\\]$")
	public void teacher_adds_teacher_club_items_to_cart_meeting_the_manual_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}



	@And("^teacher adds teacher club items to cart equal to the \\[Manual shipping threshold\\]$")
	public void teacher_adds_teacher_club_items_to_cart_equal_to_the_manual_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillTeacherCatalogueFlyerOrder(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice_limit"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@And("^teacher adds Student club items to cart meeting the \\[Manual shipping threshold\\]$")
	public void teacher_adds_student_club_items_to_cart_meeting_the_manual_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillTeacherCatalogueFlyerOrder(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice_limit"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}



	@And("^teacher adds Student club and teacher clubs items to cart meeting the \\[Manual shipping threshold\\]$")
	public void teacher_adds_student_club_and_teacher_clubs_items_to_cart_meeting_the_manual_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		iStudentFlyerOrdersPage.fillStudentFlyerOrder_Eligible_Promotions(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice_limit"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));

		iStudentFlyerOrdersPage.fillTeacherCatalogueFlyerOrder(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice_limit"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}



	@And("^teacher adds Student club and teacher clubs items to cart less than the \\[Manual shipping threshold\\]$")
	public void teacher_adds_student_club_and_teacher_clubs_items_to_cart_less_than_the_manual_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		iStudentFlyerOrdersPage.fillTeacherCatalogueFlyerOrder(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice_limit"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));

		iStudentFlyerOrdersPage.fillTeacherCatalogueFlyerOrder(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice_limit"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@And("^teacher adds Student club items to cart less than the \\[Manual shipping threshold\\]$")
	public void teacher_adds_student_club_items_to_cart_less_than_the_manual_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}



	@And("^teacher adds student club items to cart with total qualifying for \\[first tier\\]$")
	public void teacher_adds_student_club_items_to_cart_with_total_qualifying_for_first_tier() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@And("^teacher adds student club items to cart with \\[minumum amount\\] for Dollars to Spend promotion$")
	public void teacher_adds_student_club_items_to_cart_with_minumum_amount_for_dollars_to_spend_promotion() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@And("^teacher adds student club items to cart qualifying for \\[Manual Free shipping coupon\\]$")
	public void teacher_adds_student_club_items_to_cart_qualifying_for_manual_free_shipping_coupon() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}



	@And("^teacher adds Student and Teacher club items to cart less than the \\[Manual shipping threshold\\]$")
	public void teacher_adds_student_and_teacher_club_items_to_cart_less_than_the_manual_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		iStudentFlyerOrdersPage.placeItems_GlobalSearch_Teach_StudentItems(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
				TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));
	}


	@And("^teacher adds Student and Teacher club items to cart qualifying for \\[Manual Free shipping coupon\\]$")
	public void teacher_adds_student_and_teacher_club_items_to_cart_qualifying_for_free_manual_shipping_coupon() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		iStudentFlyerOrdersPage.placeItems_GlobalSearch_Teach_StudentItems(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
				TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));
	}







	@And("^teacher adds student club items to cart with total qualifying for \\[first tier Min\\]$")
	public void teacher_adds_student_club_items_to_cart_with_total_qualifying_for_first_tier_min() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder_Eligible_Promotions(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice_limit"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}



	@And("^teacher adds student club items to cart with total qualifying for \\[second tier\\]$")
	public void teacher_adds_student_club_items_to_cart_with_total_qualifying_for_second_tier() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder_Eligible_Promotions_SecondTier(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice_limit"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("secondtier_itemQty"));
	}


	@When("^teacher deletes items from cart qualifying for \\[first tier\\]$")
	public void teacher_deletes_items_from_cart_qualifying_for_first_tier() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder_Eligible_Promotions_FirstTier_ReviewCart(
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@When("^teacher adds more items to cart with cart total meeting \\[second tier\\]$")
	public void teacher_adds_more_items_to_cart_with_cart_total_meeting_second_tier() throws Throwable {

		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder_Eligible_Promotions_SecondTier_ReviewCart(
				TestBaseProvider.getTestBase().getTestData().getString("secondtier_itemQty"));
	}


	@And("^teacher adds student club items to cart with multiple quantity \\[minumum amount\\]$")
	public void teacher_adds_student_club_items_to_cart_with_multiple_quantity_minumum_amount() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder_multiQuantiy_Promotions(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice_limit"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@And("^teacher adds \\[ItemInformation\\] from Student Flyer page$")
	public void teacher_adds_iteminformation__from_studentflyer_page() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder_Promotions(
				//TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@And("^teacher adds student club items to cart less than \\[minumum amount\\]$")
	public void teacher_adds_student_club_items_to_cart_less_than_minumum_amount() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();

		/*iStudentFlyerOrdersPage.fillStudentFlyerOrder_NotEligible_Promotions(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));*/

		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));

	}


	@When("^teacher adds items to cart less than the \\[shipping threshold\\]$")
	public void teacher_adds_items_to_cart_less_than_the_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder_NotEligible_Promotions(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}



	@When("^teacher add items to cart less than the \\[shipping threshold\\]$")
	public void teacher_add_items_to_cart_less_than_the_shipping_threshold() throws Throwable {

		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@When("^teacher add items to cart less than the \\[shipping threshold\\] and equal to \\[minimum amount\\] for Dollars to Spend promotion$")
	public void teacher_add_items_to_cart_less_than_the_shipping_threshold_and_equal_to_minimum_amount_for_dollars_to_spend_promotion() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}



	@And("^teacher add items to cart less than the \\[manual shipping threshold\\] and equal to \\[minimum amount\\] for Dollars to Spend promotion$")
	public void teacher_add_items_to_cart_less_than_the_manual_shipping_threshold_and_equal_to_minimum_amount_for_dollars_to_spend_promotion() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}



	@And("^teacher adds items to cart less than the \\[minimum amount\\]for free item and equal to \\[minimum amount\\] for Dollars to Spend promotion$")
	public void teacher_adds_items_to_cart_less_than_the_minimum_amountfor_free_item_and_equal_to_minimum_amount_for_dollars_to_spend_promotion() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}




	@When("^teacher removes few items from cart such that it falls below \\[minimum amount\\]$")
	public void teacher_removes_few_items_from_cart_such_that_it_falls_below_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder_ModifyQuantity_ReviewCartPage(
				TestBaseProvider.getTestBase().getTestData().getString("updated_itemQty"));
	}



	@When("^teacher adds more items to cart meeting the \\[shipping threshold\\]$")
	public void teacher_adds_more_items_to_cart_meeting_the_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(6000);
		/*iStudentFlyerOrdersPage.fillStudentFlyerOrder_ModifyQuantity_ReviewCartPage(
				TestBaseProvider.getTestBase().getTestData().getString("updated_itemQty"));*/
		iStudentFlyerOrdersPage.update_YTO_item_Qty_ReviewCart_page(
				TestBaseProvider.getTestBase().getTestData().getString("updated_itemQty"));
		
	}


	@When("^teacher adds more items to the cart meeting the \\[shipping threshold\\]$")
	public void teacher_adds_more_items_to_the_cart_meeting_the_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(3000);
		PauseUtil.pause(6000);

		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder_ModifyQuantity_ReviewCartPage1(
				TestBaseProvider.getTestBase().getTestData().getString("updated_itemQty"));

	}



	@When("^teacher deletes items from cart resulting in cart total fall below \\[shipping threshold\\]$")
	public void teacher_deletes_items_from_cart_resulting_in_cart_total_fall_below_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder_ModifyQuantity_ReviewCartPage1(
				TestBaseProvider.getTestBase().getTestData().getString("updated_itemQty"));
	}


	@When("^teacher adds items from cart resulting in cart total cross \\[shipping threshold\\]$")
	public void teacher_adds_items_from_cart_resulting_in_cart_total_cross_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder_ModifyQuantity_ReviewCartPage1(
				TestBaseProvider.getTestBase().getTestData().getString("updated_itemQty"));
	}



	@When("^teacher delete items from cart resulting in cart total fall below \\[shipping threshold\\]$")
	public void teacher_delete_items_from_cart_resulting_in_cart_total_fall_below_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillStudent_TeacherFlyerOrder_ModifyQuantity_ReviewCartPage(
				TestBaseProvider.getTestBase().getTestData().getString("updated_itemQty"));
	}


	@When("^teacher deletes all items from Students clubs$")
	public void teacher_deletes_all_items_from_students_clubs() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder_ModifyQuantity_StudentClubs_ReviewCartPage(
				TestBaseProvider.getTestBase().getTestData().getString("updated_itemQty"));

	}







	@When("^user adds \\[ItemInformation\\] from SFO page with only \"([^\"]*)\"$")
	public void user_adds_ItemInformation_from_SFO_page_with_only(String fieldNane) {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillStudentFlyerOrderWithSpecificField(fieldNane,
				TestBaseProvider.getTestBase().getTestData());
	}

	@When("^user verify SFO page before adding any Item$")
	public void user_verify_SFO_page_before_adding_any_Item() {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
	}

	@When("^user selects ITEM sort from SFO order table$")
	public void user_selects_ITEM_sort_from_SFO_order_table() {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.clickOnItemFromSFOOrderTable();
	}

	@When("^user should see Items gets sorted in ascending order$")
	public void user_should_see_Items_gets_sorted_in_ascending_order() {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.verifyItemsSortedInAscendingOrder();
	}

	@Then("^user should see student name field$")
	public void user_should_see_student_name_field() {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.verifyStudentNameFieldFunctionality();
	}

	@Then("^user should see unique students count on SFO Tab$")
	public void user_should_see_unique_students_count_on_SFO_Tab() {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.verifyItemTotalCountOnSFOTab();
	}

	@When("^user selects item by providing \\[ItemInformation\\] on SFO page$")
	public void user_selects_item_by_providing_ItemInformation_on_SFO_page() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickOnItemAddedOnStudentFlyerTable(
				TestBaseProvider.getTestBase().getTestData());
	}

	@When("^user selects item by providing \\[ItemInformation\\] on review SFO order page$")
	public void user_selects_item_by_providing_ItemInformation_on_Review_SFO_page() {
		IReviewOrderPage reviewOrderPage = getFactory().getIReviewOrderPage();
		reviewOrderPage.clickOnItemAddedOnStudentTable(
				TestBaseProvider.getTestBase().getTestData());

	}

	@Then("^user should see \\[ItemInformation\\] on SFO page$")
	public void user_should_see_ItemInformation_on_SFO_page() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getIProductOrderTableSection()
				.verifyStudentFlyerOrderTableHeader();
		studentFlyerOrdersPage.getIProductOrderTableSection()
				.verifyItemIsAddedOnStudentTable();
	}

	@Then("^user should be able to view updated records$")
	public void user_should_be_able_to_view_updated_records() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getIProductOrderTableSection()
				.verifyItemIsAddedOnStudentTable();
	}

	@Then("^user should see \\[ItemInformation\\] on quick view modal on SFO page$")
	public void user_should_see_ItemInformation_on_quick_view_modal_on_SFO_page() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getIProductOrderTableSection()
				.verifyItemQuickLookOnOrderTable(
						TestBaseProvider.getTestBase().getTestData());
	}

	@Then("^user should see \\[ItemInformation\\] on quick view modal on SFO review order page$")
	public void user_should_see_ItemInformation_on_quick_view_modal_on_review_order_SFO_page() {
		IReviewOrderPage reviewOrderPage = getFactory().getIReviewOrderPage();
		reviewOrderPage.verifyItemQuickLookOnOrderTable(
				TestBaseProvider.getTestBase().getTestData());
	}

	@When("^user selects Review Student Flyer Order$")
	public void user_selects_Review_Student_Flyer_Order() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickOnReviewOrderLink();

	}

	@When("^user updates the item quantity from SFO page$")
	public void user_updates_the_item_quantity_from_SFO_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		PauseUtil.waitForAjaxToComplete();
		studentFlyerOrdersPage.getIProductOrderTableSection()
				.editProductQuantityOnOrderTable(
						TestBaseProvider.getTestBase().getTestData());

	}

	@Then("^user should see updated item quantity on SFO page$")
	public void user_should_see_updated_item_quantity_on_SFO_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getIProductOrderTableSection()
				.verifyItemIsAddedOnStudentTable();
	}

	@Then("^user should not be able to update item quantity more than \\(\\\\d\\+\\) on SFO page$")
	public void user_should_not_be_able_to_update_item_quantity_more_than_d_on_SFO_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user should see Add button functionality$")
	public void user_should_see_Add_button_functionality() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validateAddButtonFuncationality(
				TestBaseProvider.getTestBase().getTestData());
	}

	@Then("^user should see SFO form$")
	public void user_should_see_SFO_form() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
	}

	@Then("^user enter student name and item number on SFO page$")
	public void user_enter_student_name_and_item_number_on_SFO_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.enterStudentNameAndItemNumberOnSFO(
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemid"));
	}

	@Then("^user should see ADD button is enabled$")
	public void user_should_see_ADD_button_is_enabled() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyAddButtonIsActive();
	}

	@Then("^user select add button on SFO page$")
	public void user_select_add_button_on_SFO_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage
				.clickOnAddButton(TestBaseProvider.getTestBase().getTestData());
	}

	@Then("^user select ADD button and verify it updated to SAVED on SFO page$")
	public void user_select_ADD_button_and_verify_it_updated_to_SAVED_on_SFO_page()
			throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickOnAddButtonAndVerifyUpdateToSavedButton(
				TestBaseProvider.getTestBase().getTestData());
	}

	@Then("^user verify Student Name and Item field has type ahead functionality and provide autosuggestion$")
	public void user_verify_Student_Name_and_Item_field_has_type_ahead_functionality_and_provide_autosuggestion()
			throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verfiyAutoSuggestionFunctionality(
				TestBaseProvider.getTestBase().getTestData());
	}

	@Then("^user should see \\[ErrorMessage\\] on SFO Page$")
	public void user_should_see_ErrorMessage_on_SFO_Page() {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.verifyStudentFlyerOrderErrorMessage(
				TestBaseProvider.getTestBase().getTestData().getString("errormessage"));
	}

	@Then("^user should see item number field$")
	public void user_should_see_item_number_field() {
		// Write code here that turns the phrase above into concrete actions
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.verifyStudentOrderFieldinInStudentFlyerOrder();
		iStudentFlyerOrdersPage.verifyItemIdField(TestBaseProvider.getTestBase()
				.getTestData().getString("itemidwithsevendigit"));
	}

	// @Then("^user should see flyer order item details$")
	// public void user_should_see_flyer_order_item_details() throws Throwable {
	// IStudentFlyerOrdersPage studentFlyerOrdersPage =
	// getFactory().getIStudentFlyerOrdersPage();
	// studentFlyerOrdersPage.clickOnReviewCart();
	// }

	@Then("^user should see student roster functionality on SFO page$")
	public void user_should_see_student_roster_functionality_on_SFO_page()
			throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage
				.verifyStudentRoster(TestBaseProvider.getTestBase().getTestData());
	}

	@Then("^user should not see removed item on SFO page$")
	public void user_should_not_see_removed_item_on_SFO_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyUpdatedRecordsAfterRemoval(
				TestBaseProvider.getTestBase().getTestData());
	}

	@When("^user removes \\[ItemInformation\\] from item list from SFO page with \"([^\"]*)\"$")
	public void user_removes_ItemInformation_from_item_list_from_SFO_page_with(
			String confirmationStatus) {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getIProductOrderTableSection().removeItemsFromStudentTable(
				TestBaseProvider.getTestBase().getTestData(), confirmationStatus);
	}

	@When("^user removes \\[ItemInformation\\] from item list from review SFO page with \"([^\"]*)\"$")
	public void user_removes_ItemInformation_from_item_list_from_review_Sfo_Page_with(
			String confirmationStatus) {
		IReviewOrderPage reviewOrderPage = getFactory().getIReviewOrderPage();
		reviewOrderPage.removeItemsFromReviewOrderPageBasedOnStatus(
				TestBaseProvider.getTestBase().getTestData(), confirmationStatus);

	}

	@When("^user removes coupon \\[ItemInformation\\] from item list from SFO page with \"([^\"]*)\"$")
	public void user_removes_coupon_ItemInformation_from_item_list_from_SFO_page_with(
			String confirmationStatus) {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getIProductOrderTableSection()
				.removeCouponItemsFromStudentTable(
						TestBaseProvider.getTestBase().getTestData(), confirmationStatus);
	}

	@Then("^user should not see removed coupon \\[ItemInformation\\] on \"([^\"]*)\" page$")
	public void user_should_not_see_removed_coupon_iteminformation_on_SFO_page(
			String page) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getIProductOrderTableSection()
				.verifyCouponItemIsDeletedOnStudentTable(
						TestBaseProvider.getTestBase().getTestData(), page);
	}

	@Then("^user should see coupon \\[ItemInformation\\] on \"([^\"]*)\" page$")
	public void user_should_see_coupon_iteminformation_on_SFO_page(String page)
			throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getIProductOrderTableSection()
				.verifyCouponItemOnStudentTable(
						TestBaseProvider.getTestBase().getTestData(), page);
	}

	@Then("^user should see \\[OrderSummary\\] on Review SFO page$")
	public void user_should_see_OrderSummary_from_SFO_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getIProductOrderSummarySection()
				.verifyOrderSummary(TestBaseProvider.getTestBase().getTestData());

	}

	@When("^user selects Student Flyer Order Link$")
	public void user_selects_Student_Flyer_Order_Link() {
		IReviewOrderPage reviewOrderPage = getFactory().getIReviewOrderPage();
		reviewOrderPage.clickSFOLink();
	}

	@When("^user should see Student Flyer Orders sub-tab under Enter Orders tab$")
	public void user_should_see_Student_Flyer_Orders_subtab_under_Enter_Orders_tab() {
		IHeaderSection headerSection = SectionFactory.getFactory()
				.getIHeaderSection(LocatorUtils.getBy("dw.header.section"));
		headerSection.verifyHoverAction();
	}

	@When("^user verify Enter Student Name field allows alphanumeric max (\\d+) characters$")
	public void user_verify_Enter_Student_Name_field_allows_alphanumeric_max_characters(
			int maxSize) {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyMaxTwentyAlphanumericCharForStudentNameField(
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				maxSize);

	}

	@Then("^user should be able to see student name in roster$")
	public void user_should_be_able_to_see_student_name_in_roster() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage
				.verifyStudentNameInRoster(TestBaseProvider.getTestBase().getTestData());

	}

	@Then("^user verifies item original quantity$")
	public void user_verifies_item_original_quantity() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getIProductOrderTableSection()
				.verifyItemQuantity(TestBaseProvider.getTestBase().getTestData());

	}

	@When("^user should see \\[ButtonState\\] on Review SFO page$")
	public void user_should_see_ButtonState_on_Review_SFO_page() {
		IReviewOrderPage reviewOrdersPage = getFactory().getIReviewOrderPage();
		reviewOrdersPage.verifyButtonState(TestBaseProvider.getTestBase().getTestData());
	}

	@When("^user selects Student Online Orders Link$")
	public void user_selects_Student_Online_Orders_Link() {
		IReviewOrderPage reviewOrdersPage = getFactory().getIReviewOrderPage();
		reviewOrdersPage.clickOnSOOLink();
	}

	@Then("^user should see SOO page$")
	public void user_should_see_SOO_page() throws Throwable {
		IStudentOnlineOrdersPage studentOnlineOrdersPage =
				getFactory().getIStudentOnlineOrdersPage();
		studentOnlineOrdersPage.verifySOOPage();
	}

	@When("^user selects Your Teacher Order Link$")
	public void user_selects_Your_Teacher_Order_Link() {
		IReviewOrderPage reviewOrdersPage = getFactory().getIReviewOrderPage();
		reviewOrdersPage.clickYTOLink();
	}

	@When("^user selects \\[ItemInformation\\] from student Roster on SFO page$")
	public void user_selects_ItemInformation_from_student_Roster_on_SFO_page() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.selectFromRoster();
	}

	@Then("^user should see \\[ItemInformation\\] is selected$")
	public void user_should_see_ItemInformation_is_selected() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifySelectedRoster();
	}

	@Then("^user should item details until other item is selected$")
	public void user_should_item_details_until_other_item_is_selected() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getIProductOrderTableSection()
				.verifyBySelectingOtherItem();
	}

	@When("^user adds \\[ItemInformation\\] from SFO page with coupon$")
	public void user_adds_ItemInformation_from_SFO_page_with_coupon() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.addscoupon(TestBaseProvider.getTestBase().getTestData());
	}

	@Then("^user should see \\[CouponInformation\\] after applying \\[Coupon\\] on SFO page$")
	public void user_should_see_CouponInformation_after_applying_Coupon() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getIProductOrderTableSection()
				.verifyItemIsAddedOnStudentTable();
	}

	@Then("^user should not be able to edit coupon item quantity$")
	public void user_should_not_be_able_to_edit_coupon_item_quantity() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getIProductOrderTableSection()
				.verifyQuantityIsNotEditedForCouponsItem();
	}

	@When("^user selects applied \\[CouponInformation\\] on SFO page$")
	public void user_selects_applied_CouponInformation_on_SFO_page() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getIProductOrderTableSection().selectAppliedSFOCoupon();
	}

	@Then("^user should see \\[CouponInformation\\] on selected items table$")
	public void user_should_see_CouponInformation_on_selected_items_table() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getICouponSection().verifyAppliedCoupons();
	}

	@Then("^user should see coupon confirmation for two seconds on SFO page$")
	public void user_should_see_coupon_confirmation_for_two_seconds_on_SFO_page() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifycouponConfirmation();
	}

	@Given("^user should see total cost and quantity on review SFO Page$")
	public void user_should_see_total_cost_and_quantity_on_review_SFO_Page() {
		IReviewOrderPage reviewOrderPage = getFactory().getIReviewOrderPage();
		reviewOrderPage
				.verifyTotalPriceQuantity(TestBaseProvider.getTestBase().getTestData());
	}

	@Given("^user enters \\[CouponInformation\\] on SFO page$")
	public void user_enters_CouponInformation_on_SFO_page() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.enterCoupon(TestBaseProvider.getTestBase().getTestData());
	}

	@Then("^user should see pagination functionality$")
	public void user_should_see_pagination_functionality() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getICouponSection().verifyCouponsPagination();
	}

	@Then("^user should see free pick coupon popup as expected$")
	public void user_should_see_free_pick_coupon_popup_as_expected() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getICouponSection().verifyFPPopup();
	}

	@Then("^user should see sorting funtionality$")
	public void user_should_see_sorting_funtionality() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getICouponSection().verifySortingFunctionality();
	}

	@Then("^user selects Sort Arrow icon on the Student Name field of order table$")
	public void user_selects_Sort_Arrow_icon_on_the_Student_Name_field_of_order_table() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickOnLblStudentNameOrderTable();
	}

	@Then("^user selects Sort Arrow icon on the Item field of order table$")
	public void user_selects_Sort_Arrow_icon_on_the_Item_field_of_order_table() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickOnItemFromSFOOrderTable();
	}

	@Then("^user selects Sort Arrow icon on the Price field of order table$")
	public void user_selects_Sort_Arrow_icon_on_the_Price_field_of_order_table() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickOnItemFromSFOOrderTable();
	}

	@Then("^user selects Sort Arrow icon on the Flyer field of order table$")
	public void user_selects_Sort_Arrow_icon_on_the_Flyer_field_of_order_table() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickOnFlyerFromSFOOrderTable();
	}

	@Then("^user selects Sort Arrow icon on the '(.+)' field of order table$")
	public void user_selects_Sort_Arrow_icon_on_the_field_of_order_table(
			String columnName) {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickOnColumnFromSFOOrderTable(columnName);
	}

	@Then("^user verify data in the order the data has been added in order table$")
	public void user_verify_data_in_the_order_the_data_has_been_added_in_order_table() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyAddedDataOrderInSFOOrderTable(
				TestBaseProvider.getTestBase().getTestData());
	}

	@Then("^user verify student names sorted in ascending order$")
	public void user_verify_student_names_sorted_in_ascensing_order() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyStudentNameAscendingOrderSort();
	}

	@Then("^user verify Items sorted in ascending order$")
	public void user_verify_Item_sorted_in_ascensing_order() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyItemsAscendingOrderSort();
	}

	@Then("^user verify Flyer sorted in descending order$")
	public void user_verify_Flyer_sorted_in_descending_order() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyFlyerDescendingOrderSort();
	}

	@Then("^user verify Flyer sorted in ascending order$")
	public void user_verify_Flyer_sorted_in_ascending_order() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyFlyerAscendingOrderSort();
	}

	@Then("^user verify Items sorted in descending order$")
	public void user_verify_Items_sorted_in_descending_order() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyItemsDescendingOrderSort();
	}

	@Then("^user verify Price sorted in low to high order$")
	public void user_verify_Price_sorted_in_ascensing_order() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyPriceAscendingOrderSort();
	}

	@Then("^user verify Price sorted in high to low order$")
	public void user_verify_Price_sorted_in_descending_order() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyPriceDescendingOrderSort();
	}

	@Then("^user verify Titles sorted in ascending order$")
	public void user_verify_Title_sorted_in_ascensing_order() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyTitleAscendingOrderSort();
	}

	@Then("^user verify Titles sorted in descending order$")
	public void user_verify_Titles_sorted_in_descending_order() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyTitleDescendingOrderSort();
	}

	@Then("^user verify student names sorted in descending order$")
	public void user_verify_student_names_sorted_in_descending_order() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyStudentNameDescendingOrderSort();
	}

	@Then("^user should see item details on tapping item title and number$")
	public void user_should_see_item_details_on_tapping_item_title_and_number() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getICouponSection().verifyItemDetails();
	}

	@Then("^user should see confirm and apply button on changing student name$")
	public void user_should_see_confirm_and_apply_button_on_changing_student_name() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getICouponSection().verifyStudentRenameFunctionality();
	}

	@Then("^user verify maximum '(\\d+)' quantity can enter in item QTY field$")
	public void user_verify_maximum_quantity_can_enter_in_item_QTY_field(int maxQTYValue)
			throws Throwable {

		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		PauseUtil.waitForAjaxToComplete();
		studentFlyerOrdersPage.getIProductOrderTableSection().updateQuantityField(
				TestBaseProvider.getTestBase().getTestData(), maxQTYValue);

	}

	@Then("^user verify \\[ItemInformation\\] displayed and select free item$")
	public void user_verify_ItemInformation_displayed_in_modal_with_coupon() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage
				.verifyaddedcoupon(TestBaseProvider.getTestBase().getTestData());
	}

	@Then("^user removes \\[ItemInformation\\] from displayed list of coupon modal$")
	public void user_removes_ItemInformation_from_displayed_list_of_coupon_modal() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage
				.removeaddedfreeitem(TestBaseProvider.getTestBase().getTestData());
	}

	@Then("^user removes all coupons from displayed list of coupon modal$")
	public void user_removes_ALL_ItemInformation_from_displayed_list_of_coupon_modal() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.deleteAllItemOnModal();
	}

	@Then("^user removes applied coupons from SFO page$")
	public void user_removes_applied_coupons_from_SFO_page() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		if (!TestBaseProvider.getTestBase().getContext().getString("driver.name")
				.equalsIgnoreCase("ios")) {
			SCHUtils.refreshPage();
		}
		studentFlyerOrdersPage.verifyExistanceofPopUp();
		studentFlyerOrdersPage.getIProductOrderTableSection().removeAppliedCoupons();
	}

	/**
	 * this step should be used to search for invalid item on SFO page and then
	 * to apply coupon on
	 */
	@When("^user applies \\[CouponInformation\\] for \\[ItemInformation\\] on SFO page$")
	public void user_applies_CouponInformation_for_ItemInformation_on_SFO_page() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.fillStudentFlyerOrder(
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemid"));
		studentFlyerOrdersPage.enterCoupon(TestBaseProvider.getTestBase().getTestData());
	}

	@Then("^user should see \\[ErrorMessage\\] on coupon modal window$")
	public void user_should_see_ErrorMessage_on_coupon_modal_window() {
		if (TestBaseProvider.getTestBase().getTestData().getString("module")
				.equalsIgnoreCase("teacher")) {
			IStudentFlyerOrdersPage studentFlyerOrdersPage =
					getFactory().getIStudentFlyerOrdersPage();
			studentFlyerOrdersPage.getICouponSection().verifyEmptyCouponSectionMessage();
		} else {
			ICartPage page = getFactory().getICartPage();
			page.getICouponSection().verifyEmptyCouponSectionMessage();
		}

	}

	@When("^user selects apply coupons link on sfo page$")
	public void user_selects_apply_coupons_link_on_sfo_page() {
		PauseUtil.pause(1000);
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.clickOnApplyCouponLink();
	}

	@Then("^user should see blank coupon entry form coupan modal$")
	public void user_should_see_blank_coupon_entry_form_coupan_modal() {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.verifyBlankCouponsEntryForm();
	}

	@Then("^user verifies coupon entry form on coupan modal$")
	public void user_verifies_coupon_entry_form_on_coupan_modal() {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.verifyBlankCouponsEntryForm();
	}

	@And("^user close the coupon model on SFO page$")
	public void user_close_the_coupon_model_on_SFO_page() {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.closeCoupanModalOnSFO();
	}

	@When("^user wants to add sname \"([^\"]*)\" and itemid \"([^\"]*)\" on sfo page$")
	public void user_wants_to_add_sname_and_itemid_on_sfo_page(String studentname,
															   String itemid) throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.fillSFOForm(studentname, itemid);
	}

	@When("^user wants to add \"([^\"]*)\" coupons for \"([^\"]*)\" name on sfo page$")
	public void user_wants_to_add_sname_and_couponid_on_sfo_page(String studentname,
																 String couponNumber) {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.getICouponSection()
				.addSFOCoupounByNameAndCouponNumber(couponNumber, studentname);
	}

	@Then("^user verifies \"([^\"]*)\" is displayed on coupon modal$")
	public void verify_student_name_on_coupon_model(String studentName) {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.verifyStudentNameOnSfoCouponModal(studentName);
	}

	@When("^user selects an item at position \"([^\"]*)\" from make your selection section from sfo page$")
	public void user_selects_an_item_at_position_from_make_your_selection_section_on_Sfo_page(
			String itemPosition) throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.getICouponSection().selectItemByRadioButton(itemPosition);
	}

	@Then("^user verified item at position \"([^\"]*)\" is not selected on make your selection from sfo page$")
	public void user_verified_item_at_positon_is_not_selected_on_make_your_selection_on_coupon_modal(
			String itemPosition) {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.getICouponSection()
				.verifyItemUnselectedByRadioButton(itemPosition);
	}

	@When("^user verify \\[your_current_selection_section_Info\\] on sfo page$")
	public void user_verify_your_current_selection_section_Info_on_Sfo_page()
			throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.getICouponSection().verifyYourCurrentSelectionSection();
	}

	@Then("^user should see \\[your_current_selection_section_Info\\] is not sorted on sfo page$")
	public void user_verify_your_current_selection_section_Info_is_unsorted_Sfo_page()
			throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.getICouponSection().verifyCurrentSelectionisUnsorted();
	}

	@Then("^user remove selected item from your current selection section on sfo page$")
	public void user_remove_selected_item_from_your_current_selection_section_on_sfo_page()
			throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.getICouponSection().removeCurrentSelectedItem();
	}

	@Then("^user should see \"([^\"]*)\" error message on coupon modal on sfo page$")
	public void verifyErrorMessageOnCoupon(String errorMessage) {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		if (errorMessage.equalsIgnoreCase("INVALID_COUPON_MSG")) {

			iStudentFlyerOrdersPage.verifyStudentFlyerOrderErrorMessage(
					ConstantUtils.INVALID_COUPON_MSG);
		} else {
			iStudentFlyerOrdersPage.verifyStudentFlyerOrderErrorMessage(errorMessage);
		}
	}

	@When("^user should see header on Student Online Orders$")
	public void user_hould_see_header_on_student_online_orders() throws Throwable {
		IStudentOnlineOrdersPage iStudentOnlineOrdersPage =
				getFactory().getIStudentOnlineOrdersPage();
		iStudentOnlineOrdersPage.verifySOOorderDetailHeader();
	}

	@When("^user should see order details on Student Online Orders$")
	public void user_hould_see_order_details_on_student_online_orders() throws Throwable {
		IStudentOnlineOrdersPage iStudentOnlineOrdersPage =
				getFactory().getIStudentOnlineOrdersPage();
		iStudentOnlineOrdersPage.verifySOOorderDetail();
	}

	// this step is having parameter as css-@id of tab and text of child tab
	@Then("^user should see both \"([^\"]*)\" tab and \"([^\"]*)\" tab are highlighted and folded$")
	public void user_should_see_both_enter_order_tab_and_student_Flyer_orders_tab_are_highlighted_and_folded(
			String tabId, String childTabText) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyTabAndChildTabIsActive(tabId, childTabText);

	}
	@Then("^user clicks on link apply coupon for this student$")
	public void user_clicks_on_link_apply_coupon_for_this_student() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickOnApplyCouponLink();
	}

	@Then("^user apply coupon by entering student name and coupon code for this student modal$")
	public void user_apply_coupon_by_entering_student_name_and_coupon_code_for_this_student_modal() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getICouponSection()
				.addSFOCoupoun(TestBaseProvider.getTestBase().getTestData());
	}

	@Then("^user selects \\[CouponItem\\] from modal window$")
	public void user_selects_CouponItem_from_modal_window() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		PauseUtil.pause(5000);
		studentFlyerOrdersPage.getICouponSection().searchItemByGradeLevel(
				TestBaseProvider.getTestBase().getTestData().getString("selectgrade"));
		studentFlyerOrdersPage.getICouponSection().selectItemByRadioButton("2");
	}
	@Then("^user clicks on link hide detail$")
	public void user_clicks_on_link_hide_detail() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getICouponSection().verifyHideLinkFunctionality();

	}

	@Then("^user should see \\[MakeYourSelectionSectionDetails\\]$")
	public void user_should_see_MakeYourSelectionSectionDetails() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getICouponSection().verifyMakeYourSelectionSection();
	}
	@Then("^user verifies apply button state$")
	public void user_verifies_apply_button_state() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getICouponSection().verifyApplyButtonState();

	}

	@Then("^user apply invalid coupon on SFO page$")
	public void user_apply_invalid_coupon_on_SFO_page() {

		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.EnterCouponAndSelectApplyOnSFOPage(
				TestBaseProvider.getTestBase().getTestData());
	}

	@Then("^user verify invalid coupon error message get displayed$")
	public void user_verify_invalid_coupon_error_message_get_displayed() {

		ICartPage cartPage = getFactory().getICartPage();
		cartPage.verifyWrongErrorMessage(
				TestBaseProvider.getTestBase().getTestData().getString("errormessage"));
		PauseUtil.pause(2000);
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.closeCoupanModalOnSFO();
	}

	@Then("^user enter student name on SFO page$")
	public void user_enter_student_name_on_SFO_page() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.enterStudentNameOnSFOPage(
				TestBaseProvider.getTestBase().getTestData().getString("studentname"));

	}

	@Then("^user enter student name with special character on SFO page$")
	public void user_enter_student_name_with_special_character_on_SFO_page() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.enterStudentNameOnSFOPage(
				TestBaseProvider.getTestBase().getTestData().getString("studentname"));

	}

	@Then("^user should see '(.+)' error message$")
	public void user_should_see_error_message(String errorMessage) {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.verifyStudentFlyerOrderErrorMessage(errorMessage);

	}

	@Then("^user select apply coupon link on SFO page$")
	public void user_select_apply_coupon_link_on_SFO_page() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickOnAddCouponLinkOnSFO();
	}

	@Then("^user should see student name is prepopulated on coupon modal$")
	public void user_should_see_student_name_is_prepopulated_on_coupon_module() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyStudentNamePrepopulatedOnCouponModule(
				TestBaseProvider.getTestBase().getTestData().getString("studentname"));
	}

	@Then("^user enter coupon on coupon modal on SFO$")
	public void user_enter_coupon_on_coupon_modal_on_SFO() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.enterCouponInCouponModule(
				TestBaseProvider.getTestBase().getTestData().getString("couponnumber"));
	}

	@Then("^user should see coupon apply button is inactive$")
	public void user_should_see_coupon_apply_button_is_inactive() {

		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyApplyCouponButtonIsInActive();

	}

	@Then("^user selects apply coupon button on coupon modal$")
	public void user_selects_apply_coupon_button_on_coupon_modal() {

		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickOnApplyCouponButtonOnCouponModal();

	}
	@Then("^user should see sorted student name on sfo$")
	public void user_should_see_sorted_list() {

		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyeSortedStudentList();
	}
	@Then("^user select \"([^\"]*)\" roster on sfo page$")
	public void user_select_roster_name(String studName) {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.selectStudentName(studName);
	}
	@Then("^user should see max charecter length on sfo page$")
	public void user_should_see_max_char() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyMaxCharLimitForStudentName(TestBaseProvider
				.getTestBase().getTestData().getString("studentnamemorethantwenty"));
	}

	@Then("^user make timeout and quite browser$")
	public void quiteBrowser() {
		PauseUtil.pause(15000);
		TestBaseProvider.getTestBase().tearDown();

	}
	@Then("^user should see \\[CouponErrorMessage\\] on SFO Page$")
	public void user_should_see_Coupon_ErrorMessage_on_SFO_Page() {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.verifyStudentFlyerOrderErrorMessage(
				TestBaseProvider.getTestBase().getTestData().getString("errormessage"));
	}

	// use this step for entering studentname and password separately on coupon
	// modal
	@When("^user user enter \"([^\"]*)\" as \"([^\"]*)\" on coupon modal$")
	public void user_user_enter_as_on_coupon_modal(String textField, String value)
			throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		if (textField.equalsIgnoreCase("studentname")) {
			studentFlyerOrdersPage.getICouponSection().enterStudentNameOnCouponModal(
					TestBaseProvider.getTestBase().getTestData().getString(value));
		} else if (textField.equalsIgnoreCase("coupon")) {
			studentFlyerOrdersPage.getICouponSection().enterCouponForStudent(
					TestBaseProvider.getTestBase().getTestData().getString(value));
		}
	}

	@Then("^user should see invalid studentname \\[ErrorMessage\\] on coupon modal window$")
	public void user_should_see_invalid_studentname_errormessage_on_coupon() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyInvalidStudentNameErrorMessage();
	}

	@Then("^user verify max character length for studentname on coupon modal$")
	public void user_should_see_max_chararcter_length_on_coupon_modal() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getICouponSection()
				.verifyMaxCharLimitForStudentName(TestBaseProvider.getTestBase()
						.getTestData().getString("studentnamemorethantwenty"));
	}

	@Then("^user should see student name displayed on SFO page$")
	public void user_should_see_student_name_displayed_on_SFO_page() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyStudentNamePopullatedInStudentNameField(
				TestBaseProvider.getTestBase().getTestData().getString("studentname"));
	}

	@Then("^user enter item with more than six character on SFO page$")
	public void user_enter_item_with_more_than_six_character_on_SFO_page() {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.enterItemOnSFO(
				TestBaseProvider.getTestBase().getTestData().getString("itemid"));
	}

	@Then("^user enter item having special characters on SFO page$")
	public void user_enter_item_having_special_characters_on_SFO_page() {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.enterItemOnSFO(TestBaseProvider.getTestBase()
				.getTestData().getString("itemidwithspecialcharacter"));
	}

	@Then("^user verify item field not allowing more than six character$")
	public void user_verify_item_field_not_allowing_more_than_six_character() {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.verifyItemIdField(
				TestBaseProvider.getTestBase().getTestData().getString("itemid"));
	}

	@Then("^user should see teacher only coupon \\[ErrorMessage\\] on coupon modal window$")
	public void user_should_see_teacher_ony__coupon_ErrorMessage_on_coupon_modal_window() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyTeacherOnlyCouponErrorMessage();
	}

	@Given("^user is able to verify full details of product on review order page$")
	public void user_is_able_to_verify_full_details_of_product_on_review_order_page()
			throws Throwable {
		IReviewOrderPage reviewOrderPage = getFactory().getIReviewOrderPage();
		reviewOrderPage
				.verifyProductDetails(TestBaseProvider.getTestBase().getTestData());
	}
	@Given("^user is able to select hide details link on review order page$")
	public void user_is_able_to_select_hide_details_link() throws Throwable {
		IReviewOrderPage reviewOrderPage = getFactory().getIReviewOrderPage();
		reviewOrderPage
				.verifyHideDetailsAndClick(TestBaseProvider.getTestBase().getTestData());
	}
	@Given("^user is able to verify product details on SFO page$")
	public void user_is_able_to_verify_product_details_on_SFO_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage
				.verifyDescriptionofItem(TestBaseProvider.getTestBase().getTestData());
	}

	@Given("^user is able to check for hide details on SFO page$")
	public void user_is_able_to_check_for_hide_details_on_SFO_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage
				.verifyDescriptionofItem(TestBaseProvider.getTestBase().getTestData());
	}
	@Then("^user selects Sort Arrow icon on coupon field of order table$")
	public void clickOnSortArrowOfCoupon() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickOnCouponSort();

	}

	@And("^user verify coupon sorted in ascending order$")
	public void couponSortedAscending() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyCouponsAscendingOrderSort();
	}
	@And("^user verify coupon sorted in descending order$")
	public void couponSortedDescending() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyCouponsDescendingOrderSort();
	}

	@And("^user tap on item title of added item on SFO Page$")
	public void tapOnItemTilte() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickOnItemTitle();
	}
	@And("^user should selects hide detail for item$")
	public void clickOnHideDetailOfOrderTable() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickOnOrderTableHideDetail();
	}

	@And("user tap on another item of order table on SFO page")
	public void clickOnAnothertItemOfOrderTable() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickonAnotherItemOfOrderTable();
	}

	@And("^user doesnot see previous item's details$")
	public void hidesPreviousItemDetails() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.hidePreviousItemDetailInOrderTable();
	}

	@And("^user should not see updated item quantity$")
	public void itemQuantityNotupdated() {
		IProductDetailPage productDetailPage = getFactory().getIProductDetailPage();
		productDetailPage.verifyQuantityNotUpdated();
	}

	@When("^user should see review student flyer order title on Review SFO page$")
	public void verifyTitleOnReviewSFO() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyReviewSFOTitle();
	}

	@And("user should see Review Cart button on Review SFO page")
	public void verifyReviewCartOnReviewSFO() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyReviewCartbtnonReviewSFO();
	}

	@And("^user should see Review This Order button on SFO Page$")
	public void verifyReviewThisOrderOnSFO() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyReviewOrderOnSFO();
	}
	@Given("^user is able to verify coupon error message$")
	public void user_is_able_to_verify_coupon_error_message() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.verifyErrorMessageForCoupons(
				TestBaseProvider.getTestBase().getTestData());

	}


	@And("^teacher adds Student club items to cart$")
	public void teacher_adds_Student_club_items_to_cart() throws Throwable {
		teacher_adds_student_club_items_to_cart_meeting_the_manual_shipping_threshold();
	}


	@And("^teacher add items to cart$")
	public void teacher_add_items_to_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.fillStudentFlyerOrder_items();
	}


	@When("^Teacher adds items from different Student clubs same months$")
	public void teacher_adds_items_from_different_student_clubs_same_months() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.fillStudentFlyerOrder_items_SameMonth();

	}

	@And("^teacher adds student club items to the cart with \\[minumum amount\\]$")
	public void teacher_adds_student_club_items_to_the_cart_with_minumum_amount() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}

	@And("^Teacher adds student club items to the cart without qualifying \\[minumum amount\\]$")
	public void teacher_adds_student_club_items_to_the_cart_without_qualifying_minumum_amount() throws Throwable {
		/*IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.fillStudentFlyerOrder_items_SameMonth();*/
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}

	@And("^teacher adds items to cart that meets the \\[minimum amount\\]$")
	public void teacher_adds_items_to_cart_that_meets_the_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.fillStudentFlyerOrder_items_SameMonth();
	}

	@And("^teacher adds student club items to cart to meet the \\[minimum amount\\] for first tier$")
	public void teacher_adds_student_club_items_to_cart_to_meet_the_minimum_amount_for_first_tier() throws Throwable {

		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}

	@And("^teacher adds student club items to cart to get the upseller message for second tier$")
	public void teacher_adds_student_club_items_to_cart_to_get_the_upseller_message_for_second_tier() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}

	@And("^teacher adds student club items to cart to get the upseller message for BonusFlat first tier$")
	public void teacher_adds_student_club_items_to_cart_to_get_the_upseller_message_for_bonusflat_first_tier() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.fillStudentFlyerOrder_items_SameMonth();
	}

	@And("^teacher adds student club items to cart to meet the \\[minimum amount\\] for second tier$")
	public void teacher_adds_student_club_items_to_cart_to_meet_the_minimum_amount_for_second_tier() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch_Teach_StudentItems(
				TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty2"),
				TestBaseProvider.getTestBase().getTestData().getString("itemName1"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty1"));
	}

	@When("^teacher adds more items to cart qualifying for next tier$")
	public void teacher_adds_more_items_to_cart_qualifying_for_next_tier() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		rewardsAndCoupons.getLnkBackToShop().click();
		PauseUtil.pause(4500);
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));

	}

	@When("^teacher deletes the items from cart qualifying for first tier$")
	public void teacher_deletes_the_items_from_cart_qualifying_for_first_tier() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.user_navigates_to_Home_page_from_Order_ref_page();

		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(10000);
		teachersHomePage.user_clicks_on_mini_Reviewcart();

		PauseUtil.waitForAjaxToComplete(2000);
		studentFlyerOrdersPage.user_deletes_item1_in_reviewCart();

	}

	@And("^teacher deletes item from cart making cart total fall below \\[minimum amount\\]$")
	public void teacher_deletes_item_from_cart_making_cart_total_fall_below_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.user_navigates_to_Home_page_from_Order_ref_page();
		PauseUtil.pause(10000);
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(10000);
		teachersHomePage.user_clicks_on_mini_Reviewcart();

		PauseUtil.waitForAjaxToComplete(2000);
		studentFlyerOrdersPage.user_deletes_item1_in_reviewCart();
	}

	@And("^Teacher deletes items from cart such that cart does not qualify for \\[minimum amount\\]$")
	public void teacher_deletes_items_from_cart_such_that_cart_does_not_qualify_for_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.user_navigates_to_Home_page_from_Order_ref_page();

		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(10000);
		teachersHomePage.user_clicks_on_mini_Reviewcart();

		PauseUtil.waitForAjaxToComplete(2000);
		studentFlyerOrdersPage.user_deletes_item1_in_reviewCart();
	}

	@When("^Teacher adds student club items to cart which is less than required \\[minimum amount\\]$")
	public void teacher_adds_student_club_items_to_cart_which_is_less_than_required_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.fillStudentFlyerOrder_items_lessthan_req_amount();
	}

	@When("^Teacher adds teacher club items to cart with \\[minimum amount\\]$")
	public void teacher_adds_teacher_club_items_to_cart_with_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Teacher_adds_items_from_single_flyer_Teacher_clubs();
	}

	@And("^teacher adds student club items to the cart with \\[tier1 minimum amount\\]$")
	public void teacher_adds_student_club_items_to_the_cart_with_tier1_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.fillStudentFlyerOrder_items_SameMonth();
	}

	@And("^teacher adds student club items to the cart with \\[tier2 minimum amount\\]$")
	public void teacher_adds_student_club_items_to_the_cart_with_tier2_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.fillStudentFlyerOrder_items_SameMonth_2();
	}

	@And("^Teacher adds items to the cart from Student clubs$")
	public void teacher_adds_items_to_the_cart_from_student_clubs() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.fillStudentFlyerOrder_items();
	}

	@And("^Teacher clicks on any flyer and month$")
	public void teacher_clicks_on_any_flyer_and_month() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.clicks_on_flyer_and_month();
	}

	@And("^Teacher clicks on any item title$")
	public void teacher_clicks_on_any_item_title() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.clicks_on_First_item_in_a_Flyer();
	}

	@And("^Teacher clicks on See Full details link$")
	public void teacher_clicks_on_see_full_details_link() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.clicks_on_SeeFullDetails_for_item();
	}

	@Then("^Teacher lands on YTO on same flyer and month where she came from$")
	public void teacher_lands_on_yto_on_same_flyer_and_month_where_she_came_from() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.verify_the_same_flyer_and_month_displayed();
	}

	@Then("^Teacher lands on YTO on same flyer and month where she came from1$")
	public void teacher_lands_on_yto_on_same_flyer_and_month_where_she_came_from1() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.verify_the_same_flyer_and_month_displayed1();
	}


	@And("^Teacher clicks on browser back from PDP page$")
	public void teacher_clicks_on_browser_back_from_pdp_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.navigate_to_back_from_currentPage();
	}

	@And("^Teacher clicks navigates back to YTO$")
	public void teacher_clicks_navigates_back_to_yto() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.navigate_to_back_from_currentPage();
	}

	@And("^Teacher searches for any term$")
	public void teacher_searches_for_any_term() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.search_for_any_item();
	}


	@When("^teacher enters student name and no quantity$")
	public void teacher_enters_student_name_and_no_quantity() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.enters_Only_student_name_StudentClubs();
	}

	@And("^Teacher adds items from different Student clubs123$")
	public void teacher_adds_items_from_different_student_clubs123() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.fillStudentFlyerOrder_items();
	}

	@When("^teacher clicks on '\\-' in YTO page$")
	public void teacher_clicks_on_in_yto_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Teacher_clicks_On_Minus_btn_for_student_1_YTO();
	}

	@When("^teacher clicks on '\\+' in YTO page$")
	public void teacher_clicks_on_in_yto_page2() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Teacher_clicks_On_Plus_btn_for_student_1_YTO();
	}

	@Then("^the item quantity is decreased by 1 in YTO page$")
	public void the_item_quantity_is_decreased_by_1_in_yto_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		int value_act=studentFlyerOrdersPage.Validation_of_item_qty_decreased_in_YTO_Page();
		Total_Owing_Amount_act_1.setItem1_qty_Value(value_act);
		PauseUtil.pause(5000);
	}

	@Then("^the item quantiy is decreased by 1 in Review Your Cart page$")
	public void the_item_quantiy_is_decreased_by_1_in_review_your_cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Validation_of_item_qty_decreased_in_ReviewCart_Page(Total_Owing_Amount_act_1.getItem1_qty_Value());
	}

	@Then("^the item quantity is increased by 1 in YTO page$")
	public void the_item_quantity_is_increased_by_1_in_yto_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		int value_act=studentFlyerOrdersPage.Validation_of_item_qty_increased_in_YTO_Page();
		Total_Owing_Amount_act_1.setItem2_qty_Value(value_act);
		PauseUtil.pause(5000);
	}

	@Then("^the item quantiy is increased by 1 in Review Your Cart page$")
	public void the_item_quantiy_is_increased_by_1_in_review_your_cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Validation_of_item_qty_increased_in_ReviewCart_Page(Total_Owing_Amount_act_1.getItem2_qty_Value());
	}

	@And("^Teacher enters the student name and clicks on Tick mark$")
	public void teacher_enters_the_student_name_and_clicks_on_tick_mark() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Teacher_enters_StudentName_clicks_On_TickMark_StudentClub();
	}

	@And("^Teacher enters the student name and hits ENTER$")
	public void teacher_enters_the_student_name_and_hits_enter() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Teacher_enters_StudentName_and_hits_ENTER_StudentClub();
	}

	@Then("^entered name is displayed in Student name field$")
	public void entered_name_is_displayed_in_student_name_field() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Verify_entered_student_name_field_in_StudentClub();
	}

	@When("^Teacher adds items from different Student clubs different month$")
	public void teacher_adds_items_from_different_student_clubs_different_month() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.fillStudentFlyerOrder_items_Diff_Month();

	}

	@When("^Teacher adds items from different Teacher clubs$")
	public void Teacher_adds_items_from_different_Teacher_clubs() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.add_items_from_diff_TeacherClubs();

	}

	@And("^teacher adds Teacher club items to the cart with \\[minumum amount\\]$")
	public void teacher_adds_teacher_club_items_to_the_cart_with_minumum_amount() throws Throwable {
		/*IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.add_items_from_diff_TeacherClubs();*/
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}

	@When("^Teacher adds items from different Student and Teacher clubs$")
	public void Teacher_adds_items_from_different_Student_and_Teacher_clubs() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Teacher_adds_items_from_different_Student_and_Teacher_clubs();

	}

	@And("^Teacher adds student club and Teacher club items to the cart with \\[minumum amount\\]$")
	public void teacher_adds_student_club_and_teacher_club_items_to_the_cart_with_minumum_amount() throws Throwable {
		/*IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Teacher_adds_items_from_different_Student_and_Teacher_clubs();*/
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		iStudentFlyerOrdersPage.placeItems_GlobalSearch_Teach_StudentItems(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
				TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));
	}

	@Then("^YTO page displays$")
	public void yto_page_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.verify_YTO_page_displayed();
	}

	@Then("^teacher is navigated to YTO page$")
	public void teacher_is_navigated_to_yto_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.verify_YTO_page_displayed();
	}


	@Then("^teacher is navigated to Books and Resources page$")
	public void teacher_is_navigated_to_books_and_resources_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.verify_BooksResources_page_displayed();
	}


	@Then("^teacher is navigated to Teacher's Desk page$")
	public void teacher_is_navigated_to_teachers_desk_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.verify_TeachersDesk_page_displayed();
	}


	@Then("^teacher is navigated to All Flyers page$")
	public void teacher_is_navigated_to_all_flyers_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.verify_AllFlyers_page_displayed();
	}


	@When("^Teacher adds items from different Student and Teacher clubs_2$")
	public void Teacher_adds_items_from_different_Student_and_Teacher_clubs_2() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Teacher_adds_items_from_different_Student_and_Teacher_clubs_2();

	}

	@Then("^Student Club Subtotal,GST,PST,Total amount and Teacher Catalogues Subtotal,GST,PST,Total amount displays correctly$")
	public void student_club_subtotalgstpsttotal_amount_and_teacher_catalogues_subtotalgstpsttotal_amount_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Validation_of_Student_club_And_Teacher_Catalogues_Total();
	}

	@Then("^Student Club Subtotal,GST,PST,Total amount and Teacher Catalogues Subtotal,GST,PST,Total amount displays correctly in ConfirmSubmit Page$")
	public void student_club_subtotalgstpsttotal_amount_and_teacher_catalogues_subtotalgstpsttotal_amount_displays_correctly_in_confirmsubmit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_ConfirmSubmitPage();
	}

	@Then("^Student Club Subtotal,GST,PST,Total amount and Teacher Catalogues Subtotal,GST,PST,Total amount displays correctly in Order reference Page$")
	public void student_club_subtotalgstpsttotal_amount_and_teacher_catalogues_subtotalgstpsttotal_amount_displays_correctly_in_order_reference_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_GST_PST_OrderRefPage();
	}

	@And("^Teacher goes to YTO page$")
	public void teacher_goes_to_yto_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.user_navigates_to_Home_page_from_Order_ref_page();

		ILoginPage homePage = getFactory().getILoginPage();
		homePage.clickOn_Enter_ClassRoom_Order();
		homePage.closeButton_in_LoginPage();
	}

	@Then("^TGAT coupon information should be displayed in Confirm and Submit page$")
	public void tgat_coupon_information_should_be_displayed_in_confirm_and_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_TGAT_coupon_info_diaplyed_in_Confirm_Submit_page();
	}

	@Then("^order confirmation details should be displayed$")
	public void order_confirmation_details_should_be_displayed() throws Throwable {
		ICheckoutPage_2 checkoutPage2 = getFactory().getICheckoutPage_2();
		checkoutPage2.verify_the_Order_successful_message_isDisplayed();

		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_shipping_Address_field_displayed_in_ConfirmSubmit_Page();
	}

	@And("^teacher navigates to Home page from Order ref page$")
	public void teacher_navigates_to_home_page_from_order_ref_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.user_navigates_to_Home_page_from_Order_ref_page();
	}

	@Then("^Student Club Subtotal,GST,PST,Total amount and shipping fee displays correctly in Order reference Page$")
	public void student_club_subtotalgstpsttotal_amount_and_shipping_fee_displays_correctly_in_order_reference_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_Total_ShippingFee_GST_PST_OrderRefPage();
	}

	@Then("^Student Club Subtotal,GST,PST,Total amount and shipping fee displays correctly in ConfirmSubmit Page$")
	public void student_club_subtotalgstpsttotal_amount_and_shipping_fee_displays_correctly_in_confirmsubmit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_Total_ShippingFee_GST_PST_ConfirmSubmit_Page();
	}

	@Then("^Student Club Subtotal,GST,QST,Total amount and shipping fee displays correctly in Order reference Page$")
	public void student_club_subtotalgstqsttotal_amount_and_shipping_fee_displays_correctly_in_order_reference_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_Total_ShippingFee_GST_QST_OrderRefPage();
	}

	@Then("^Student Club Subtotal,GST,QST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page$")
	public void student_club_subtotalgstqsttotal_amount_and_shipping_fee_displays_correctly_in_order_confirmsubmit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_Total_ShippingFee_GST_QST_ConfirmSubmit_Page();
	}

	@Then("^teacher views Amount paid by Credit Card and Cheques correctly$")
	public void teacher_views_amount_paid_by_credit_card_and_cheques_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Amount_paid_by_Credit_Card_and_Cheques_ConfirmSubmit_Page();
	}

	@Then("^teacher views Amount paid by Credit Card correctly$")
	public void teacher_views_amount_paid_by_credit_card_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Amount_paid_by_Credit_Card_ConfirmSubmit_Page();
	}

	@Then("^Student Club Subtotal,HST,Total amount and shipping fee displays correctly in Order reference Page$")
	public void student_club_subtotalhsttotal_amount_and_shipping_fee_displays_correctly_in_order_reference_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_Total_ShippingFee_HST_OrderRefPage();
	}

	@Then("^Student Club Subtotal,HST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page$")
	public void student_club_subtotalhsttotal_amount_and_shipping_fee_displays_correctly_in_order_confirmsubmit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_Total_ShippingFee_HST_ConfirmSubmit_Page();
	}

	@Then("^Student Club Subtotal,GST,Total amount and shipping fee displays correctly in Order reference Page$")
	public void student_club_subtotalgsttotal_amount_and_shipping_fee_displays_correctly_in_order_reference_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_Total_ShippingFee_GST_OrderRefPage();
	}

	@Then("^Student Club Subtotal,GST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page$")
	public void student_club_subtotalgsttotal_amount_and_shipping_fee_displays_correctly_in_order_confirmsubmit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_Total_ShippingFee_GST_ConfirmSubmit_Page();
	}

	@Then("^Teacher Catalogues Subtotal,HST,Total amount and shipping fee displays correctly in Order reference Page$")
	public void teacher_catalogues_subtotalhsttotal_amount_and_shipping_fee_displays_correctly_in_order_reference_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Teacher_Catalogues_Total_ShippingFee_HST_OrderRefPage();
	}

	@Then("^Teacher Catalogues Subtotal,HST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page$")
	public void teacher_catalogues_subtotalhsttotal_amount_and_shipping_fee_displays_correctly_in_order_confirmsubmit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Teacher_Catalogues_Total_ShippingFee_HST_ConfirmSubmit_Page();
	}

	@Then("^Teacher Catalogues Subtotal,GST,Total amount and shipping fee displays correctly in Order reference Page$")
	public void teacher_catalogues_subtotalgsttotal_amount_and_shipping_fee_displays_correctly_in_order_reference_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Teacher_Catalogues_Total_ShippingFee_GST_OrderRefPage();
	}

	@Then("^Teacher Catalogues Subtotal,GST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page$")
	public void teacher_catalogues_subtotalgsttotal_amount_and_shipping_fee_displays_correctly_in_order_confirmsubmit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Teacher_Catalogues_Total_ShippingFee_GST_ConfirmSubmit_Page();
	}

	@Then("^School address displays in Shipping address section$")
	public void school_address_displays_in_shipping_address_section() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		Assert.assertTrue(studentFlyerOrdersPage.Validation_alternate_shipping_header_displayed_in_ConfirmSubmit_Page(), "Alternate Shipping header is not displayed");
		Assert.assertTrue(studentFlyerOrdersPage.Validation_alternate_shipping_Address_field_displayed_in_ConfirmSubmit_Page(), "Alternate Shipping Address is not displayed");
	}

	@Then("^teacher views alternate shipping address with text “Alternate Shipping Address” after the address on Confirm & Submit page$")
	public void teacher_views_alternate_shipping_address_with_text_alternate_shipping_address_after_the_address_on_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		Assert.assertTrue(studentFlyerOrdersPage.Validation_the_TEXT_Alternate_Shipping_Address_displayed(), "Alternate Shipping Address TEXT is not displayed");
	}

	@Then("^teacher views alternate shipping address with text “Alternate Shipping Address” on Submitted page$")
	public void teacher_views_alternate_shipping_address_with_text_alternate_shipping_address_on_submitted_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		Assert.assertTrue(studentFlyerOrdersPage.Validation_the_TEXT_Alternate_Shipping_Address_displayed(), "Alternate Shipping Address TEXT is not displayed");
	}

	@Then("^Teacher catalogues Subtotal,GST,QST,Total amount and shipping fee displays correctly in Order reference Page$")
	public void teacher_catalogues_subtotalgstqsttotal_amount_and_shipping_fee_displays_correctly_in_order_reference_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Teacher_Catalogue_Total_ShippingFee_GST_QST_OrderRefPage();
	}

	@Then("^Teacher catalogues Subtotal,GST,QST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page$")
	public void teacher_catalogues_subtotalgstqsttotal_amount_and_shipping_fee_displays_correctly_in_order_confirmsubmit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Teacher_Catalogue_Total_ShippingFee_GST_QST_ConfirmSubmit_Page();
	}

	@Then("^Teacher catalogues Subtotal,GST,PST,Total amount and shipping fee displays correctly in Order reference Page$")
	public void teacher_catalogues_subtotalgstpsttotal_amount_and_shipping_fee_displays_correctly_in_order_reference_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Teacher_Catalogue_Total_ShippingFee_GST_PST_OrderRefPage();
	}

	@Then("^Teacher catalogues Subtotal,GST,PST,Total amount and shipping fee displays correctly in Order ConfirmSubmit Page$")
	public void teacher_catalogues_subtotalgstpsttotal_amount_and_shipping_fee_displays_correctly_in_order_confirmsubmit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Teacher_Catalogue_Total_ShippingFee_GST_PST_ConfirmSubmit_Page();
	}

	@Then("^Student Club Subtotal,GST,QST,Total amount and Teacher Catalogues Subtotal,GST,QST,Total amount displays correctly in Order reference Page$")
	public void student_club_subtotalgstqsttotal_amount_and_teacher_catalogues_subtotalgstqsttotal_amount_displays_correctly_in_order_reference_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_GST_QST_OrderRefPage();
	}

	@Then("^Student Club Subtotal,GST,QST,Total amount and Teacher Catalogues Subtotal,GST,QST,Total amount displays correctly in ConfirmSubmit Page$")
	public void student_club_subtotalgstqsttotal_amount_and_teacher_catalogues_subtotalgstqsttotal_amount_displays_correctly_in_confirmsubmit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_GST_QST_ConfirmSubmitPage();
	}

	@Then("^Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly in ConfirmSubmit Page$")
	public void student_club_subtotalhsttotal_amount_and_teacher_catalogues_subtotalhsttotal_amount_displays_correctly_in_confirmsubmit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_HST_ConfirmSubmitPage();
	}

	@Then("^Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly in Order reference Page$")
	public void student_club_subtotalhsttotal_amount_and_teacher_catalogues_subtotalhsttotal_amount_displays_correctly_in_order_reference_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_HST_OrderRefPage();
	}

	@Then("^Student Club Subtotal,GST,Total amount and Teacher Catalogues Subtotal,GST,Total amount displays correctly in Order reference Page$")
	public void student_club_subtotalgsttotal_amount_and_teacher_catalogues_subtotalgsttotal_amount_displays_correctly_in_order_reference_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_GST_OrderRefPage();
	}

	@Then("^Student Club Subtotal,GST,Total amount and Teacher Catalogues Subtotal,GST,Total amount displays correctly in ConfirmSubmit Page$")
	public void student_club_subtotalgsttotal_amount_and_teacher_catalogues_subtotalgsttotal_amount_displays_correctly_in_confirmsubmit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_GST_ConfirmSubmitPage();
	}

	@Then("^no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly in ConfirmSubmit Page$")
	public void no_taxes_are_charged_on_student_club_subtotaltotal_amount_and_teacher_catalogues_subtotaltotal_amount_and_total_owing_amount_displays_correctly_in_confirmsubmit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_no_taxes_are_charged_on_Student_and_Teacher_club_Subtotal_Total_amount_ConfirmSubmitPage();
	}

	@Then("^no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly in Order reference Page$")
	public void no_taxes_are_charged_on_student_club_subtotaltotal_amount_and_teacher_catalogues_subtotaltotal_amount_and_total_owing_amount_displays_correctly_in_order_reference_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_no_taxes_are_charged_on_Student_and_Teacher_club_Subtotal_Total_amount_in_OrderRefPage();
	}

	@Then("^StudentClub PostTax,Items,GST,Total amount and TeacherCatalogues PostTax,Items,GST,Total amount displays correctly in ConfirmSubmit Page$")
	public void studentclub_posttaxitemsgsttotal_amount_and_teachercatalogues_posttaxitemsgsttotal_amount_displays_correctly_in_confirmsubmit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_after_enter_BPoints_GST_ConfirmSubmitPage();
	}

	@Then("^Student Club Subtotal,GST,QST,Total amount and Teacher Catalogues Subtotal,GST,QST,Total amount displays correctly$")
	public void student_club_subtotalgstqsttotal_amount_and_teacher_catalogues_subtotalgstqsttotal_amount_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_2();
	}

	@Then("^Student Club Subtotal,HST,Total amount and Teacher Catalogues Subtotal,HST,Total amount displays correctly$")
	public void student_club_subtotalhsttotal_amount_and_teacher_catalogues_subtotalhsttotal_amount_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_3();
	}

	@Then("^Student Club Subtotal,GST,Total amount and Teacher Catalogues Subtotal,GST,Total amount displays correctly$")
	public void student_club_subtotalgsttotal_amount_and_teacher_catalogues_subtotalgsttotal_amount_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_4();
	}

	@Then("^Student Club Subtotal,GST,PST and Total amount displays correctly$")
	public void student_club_subtotalgstpst_and_total_amount_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Validation_of_Student_club_SubTotal_and_Total();
	}

	@Then("^Teacher Club Subtotal,GST,PST and Total amount displays correctly$")
	public void teacher_club_subtotalgstpst_and_total_amount_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Validation_of_Teacher_club_SubTotal_and_Total();
	}

	@Then("^Teacher Club Subtotal,GST,QST and Total amount displays correctly$")
	public void teacher_club_subtotalgstqst_and_total_amount_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Validation_of_Teacher_club_SubTotal_and_Total_3();
	}

	@Then("^Teacher Club Subtotal,GST,QST and Total amount displays correctly123$")
	public void teacher_club_subtotalgstqst_and_total_amount_displays_correctly123() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Validation_of_Teacher_club_SubTotal_and_Total_3123();
	}

	@Then("^Student Club Subtotal,GST,QST and Total amount displays correctly$")
	public void student_club_subtotalgstqst_and_total_amount_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Validation_of_Student_club_SubTotal_and_Total_2();
	}

	@Then("^Student Club Subtotal,HST,Total amount displays correctly$")
	public void student_club_subtotalhsttotal_amount_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Validation_of_Student_club_SubTotal_and_Total_3();
	}

	@Then("^Student Club Subtotal,GST,Total amount displays correctly$")
	public void student_club_subtotalgsttotal_amount_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Validation_of_Student_club_SubTotal_and_Total_4();
	}

	@Then("^Teacher Club Subtotal,GST,Total amount displays correctly$")
	public void teacher_club_subtotalgsttotal_amount_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Validation_of_Teacher_Catalogues_SubTotal_and_Total_2();
	}

	@Then("^Teacher Club Subtotal,HST,Total amount displays correctly$")
	public void teacher_club_subtotalhsttotal_amount_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Validation_of_Teacher_Catalogues_SubTotal_and_Total();
	}

	@Then("^no taxes are charged on Student Club Subtotal,Total amount and Teacher Catalogues Subtotal,Total amount and Total owing amount displays correctly$")
	public void no_taxes_are_charged_on_student_club_subtotaltotal_amount_and_teacher_catalogues_subtotaltotal_amount_and_total_owing_amount_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Validation_of_no_taxes_are_charged_on_Student_and_Teacher_club_Subtotal_Total_amount();
	}

	@And("^Teacher edits the Quantity of Student club item in Review Cart page$")
	public void teacher_edits_the_quantity_of_student_club_item_in_review_cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.edit_item_qty1_in_reviewcartPage();
	}

	@And("^Teacher edits the Quantity to 0 of Student club item in Review Cart page$")
	public void teacher_edits_the_quantity_to_0_of_student_club_item_in_review_cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.edit_item_qty1_in_reviewcartPage();
	}

	@And("^teacher clicks enter orders$")
	public void teacher_clicks_enter_orders() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clicks_on_EnterOrders_ReviewCartPage();
	}


	@Then("^“Student Flyer Orders”,“Your Teacher Order” link should be displayed$")
	public void _Student_Flyer_Orders_Your_Teacher_Order_link_should_be_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clicks_on_EnterOrders_ReviewCartPage();

	}

	@When("^teacher clicks “Student Flyer Orders” link$")
	public void teacher_clicks_Student_Flyer_Orders_link() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//studentFlyerOrdersPage.hover_linkSFO();
		studentFlyerOrdersPage.click_SFO();
	}
	@Then("^Student Flyer Orders modal is dispalyed$")
	public void Student_Flyer_Orders_modal_is_dispalyed() throws Throwable {
		PauseUtil.pause(2000);
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifySFOPage();
	}

	@When("^teacher clicks on \\?$")
	public void teacher_clicks_on_() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.get_sfo_infolink_aboutEnterStudentname();
	}

	@Then("^Teacher is presented with a pop\\-up modal$")
	public void teacher_is_presented_with_a_popup_modal() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//studentFlyerOrdersPage.validate_sfo_studentname_infopopupmodal();
		studentFlyerOrdersPage.verify_Student_name_popup_displayed_SFO_section();
	}

	@Then("^the pop\\-up modal is closed$")
	public void the_popup_modal_is_closed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//studentFlyerOrdersPage.validate_sfo_studentname_infopopupmodal_closed();
		studentFlyerOrdersPage.verify_Student_name_popup_not_displayed_SFO_section();
	}

	@And("^the modal displays the Message$")
	public void the_modal_displays_the_message() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_sfo_studentname_infopopupmodalMessage();
	}

	@And("^“Learn More” hyperlink is displayed$")
	public void learn_more_hyperlink_is_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_sfo_studentname_infopopupmodalMessage_link();
	}

	@And("^Student Flyer Order page displays Labels as “Enter Student Name” and “Item#”$")
	public void student_flyer_order_page_displays_labels_as_enter_student_name_and_item() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifySFOPage_labels_Display();
	}

	@And("^Student Flyer Orders tab should be displayed$")
	public void Student_Flyer_Orders_tab_should_be_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_SFO_Page_SFOTab();
	}

	@And("^the title is displyed as “Student Flyer Orders”$")
	public void the_title_is_displyed_as_student_flyer_orders() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_SFO_Page_title();
	}

	@And("^the following message is displayed$")
	public void the_following_message_is_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_SFO_pageText();
	}

	@And("^Your Teacher Order tab should also be displayed$")
	public void Your_Teacher_Order_tab_should_also_be_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_SFO_Page_YTOTab();
	}

	@Then("^Student Flyer Orders page is displayed$")
	public void Student_Flyer_Orders_page_is_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifySFOPage();
	}

	@And("^teacher clicks Shop Books & Resources$")
	public void teacher_clicks_shop_books_resources() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clicks_on_shop_Books_Resources_ReviewCartPage();
	}

	@Then("^Shop Books & Resources page displays$")
	public void shop_books_resources_page_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_page_shop_books_Flyers_displayed();
	}

	@And("^Teacher edits the Quantity to 0 of Teacher club item in Review Cart page$")
	public void teacher_edits_the_quantity_to_0_of_teacher_club_item_in_review_cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.edit_item_qty1_in_reviewcartPage();
		studentFlyerOrdersPage.edit_item_qty1_in_reviewcartPage();
	}

	@And("^Teacher edits the Quantity of Teacher club item in Review Cart page$")
	public void teacher_edits_the_quantity_of_teacher_club_item_in_review_cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.edit_item_qty2_in_reviewcartPage();
		studentFlyerOrdersPage.edit_item_qty3_in_reviewcartPage();
	}

	@When("^Teacher edits the Student Name in Review Cart page$")
	public void teacher_edits_the_student_name_in_review_cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		StudentFlyerOrdersPage studpage = new StudentFlyerOrdersPage();

		SCHUtils.waitForLoaderToDismiss();
		SCHUtils.waitForElementToBeClickable(studpage.reviewCart_field_student1(), 2500);
		studentFlyerOrdersPage.edit_student1_name_field_in_reviewcartPage();
		studentFlyerOrdersPage.edit_student2_name_field_in_reviewcartPage();
		studentFlyerOrdersPage.edit_student3_name_field_in_reviewcartPage();
	}


	@Then("^teacher sees grade related to logged in teacher for item in Review Cart page$")
	public void teacher_sees_grade_related_to_logged_in_teacher_for_item_in_review_cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.pause(2500);
		studentFlyerOrdersPage.verify_flyer_field_in_reviewcartPage(TestBaseProvider.getTestBase().getTestData());
	}


	@Then("^teacher sees default grade or according to search ranking rule to teacher’s grade in Review Cart page$")
	public void teacher_sees_default_grade_or_according_to_search_ranking_rule_to_teachers_grade_in_review_cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.pause(2500);
		studentFlyerOrdersPage.verify_flyer_field_in_reviewcartPage(TestBaseProvider.getTestBase().getTestData());
	}

	@Then("^Student Name is updated in Review Cart page$")
	public void student_name_is_updated_in_review_cart_page() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.validate_the_modified_names_in_CartPage();
	}

	@Then("^Student Name is updated in submit page$")
	public void student_name_is_updated_in_submit_page() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.validate_the_modified_names_in_SubmitPage();
	}

	@Then("^Student Name is updated in Order reference page$")
	public void student_name_is_updated_in_order_reference_page() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.validate_the_modified_names_in_Order_reference_page();
	}

	@When("^teacher clicks on '\\+'$")
	public void teacher_clicks_on_1() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.Teacher_clicks_On_Plus_btn_for_student_1();
	}

	@Then("^the Qty of the item is increased by 1$")
	public void the_qty_of_the_item_is_increased_by_1() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.validate_the_updated_quantity_by_clicking_On_Plus_for_Student1();
	}

	@And("^the cart total is adjusted accordingly$")
	public void the_cart_total_is_adjusted_accordingly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.Validation_of_Student_club_SubTotal_and_Total_4();
	}

	@When("^teacher clicks on '\\-'$")
	public void teacher_clicks_on_2() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.Teacher_clicks_On_Minus_btn_for_student_1();
	}

	@When("^teacher clicks on '\\-'until the cart qty becomes 0$")
	public void teacher_clicks_on_until_the_cart_qty_becomes_0() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.Teacher_clicks_On_Minus_until_becomes_to_0();
	}

	@Then("^the item is removed from cart$")
	public void the_item_is_removed_from_cart() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.verify_the_items_are_not_listed_in_ReviewcartPage();
	}

	@Then("^the added item does not display on Review Cart page$")
	public void the_added_item_does_not_display_on_review_cart_page() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.verify_the_items_are_not_listed_in_ReviewcartPage();
	}

	@Then("^teacher views \"([^\"]*)\"$")
	public void teacher_views_something(String strArg1) throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.verify_the_items_are_not_listed_in_ReviewcartPage();
	}

	@Then("^the Qty of the item is decreased by 1$")
	public void the_qty_of_the_item_is_decreased_by_1() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.validate_the_updated_quantity_by_clicking_On_Minus_for_Student1();
	}


	@Then("^Student Club Subtotal,GST,PST,Total amount and Teacher Catalogues Subtotal,GST,PST,Total amount and shipping details displays correctly in Submitted Page$")
	public void student_club_subtotalgstpsttotal_amount_and_teacher_catalogues_subtotalgstpsttotal_amount_and_shipping_details_displays_correctly_in_submitted_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_SubmittedPage();
	}


	@Then("^teacher lands on PDP of the item the teacher clicked through$")
	public void teacher_lands_on_pdp_of_the_item_the_teacher_clicked_through() throws Throwable {

		ProductDetailPage pdppage = new ProductDetailPage();

		pdppage.teacher_lands_on_pdp_of_the_item_the_teacher_clicked_through();

	}


	@Then("^teacher lands on Category page the teacher clicked through$")
	public void teacher_lands_on_category_page_the_teacher_clicked_through() throws Throwable {
		ProductDetailPage pdppage = new ProductDetailPage();
		pdppage.teacher_lands_on_category_page_item_the_teacher_clicked_through();
	}


	@Then("^teacher lands on Content page the teacher clicked through$")
	public void teacher_lands_on_content_page_the_teacher_clicked_through() throws Throwable {
		ProductDetailPage pdppage = new ProductDetailPage();
		pdppage.teacher_lands_on_content_page_item_the_teacher_clicked_through();
	}

	@And("^teacher add items to cart qualifying for DTS$")
	public void teacher_add_items_to_cart_qualifying_for_dts() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@And("^teacher adds student club items to the cart with \\[minumum amount\\] for safari$")
	public void teacher_adds_student_club_items_to_the_cart_with_minumum_amount_for_safari() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.fillStudentFlyerOrder_items_Safari();

	}

	@Then("^TGAT coupon information should be displayed in Confirmation page$")
	public void tgat_coupon_information_should_be_displayed_in_confirmation_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_TGAT_coupon_info_diaplyed_in_Confirm_Submit_page();
	}

	@Then("^Teacher can see the TGAT coupon information in Order History section$")
	public void teacher_can_see_the_tgat_coupon_information_in_order_history_section() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_TGAT_coupon_info_diaplyed_in_Confirm_Submit_page();
	}

	@And("^teacher add Teacher and Student club items to cart equal to \\[Shipping Threshold\\]$")
	public void teacher_add_teacher_and_student_club_items_to_cart_equal_to_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		iStudentFlyerOrdersPage.placeItems_GlobalSearch_Teach_StudentItems(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
				TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));
	}


	@And("^teacher add Teacher and Student club items to the cart equal to \\[Shipping Threshold\\]$")
	public void teacher_add_teacher_and_student_club_items_to_the_cart_equal_to_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		iStudentFlyerOrdersPage.placeItems_GlobalSearch_Teach2_StudentItem1(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
				TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty2"),
				TestBaseProvider.getTestBase().getTestData().getString("itemName3"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty3"));
	}


	@And("^CSR selects the order type as \\[Phone Order\\]$")
	public void csr_selects_the_order_type_as_phone_order() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_orderType_as_PhoneOrder();
	}

	@When("^CSR selects \\[Continue To Verify Account\\] in Locate Account page$")
	public void csr_selects_continue_to_verify_account_in_locate_account_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Clicks_on_Continue_To_verify_Account_in_LocateAccountPage();
	}

	@Then("^\\[Verify Account\\] page should be displayed$")
	public void verify_account_page_should_be_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_Verify_Account_Page_is_displayed();
	}

	@Then("^\\[Order Entry\\] page should be displayed$")
	public void order_entry_page_should_be_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_Order_Entry_Page_is_displayed();
	}

	@Then("^\\[Order Entry\\] tab should be highlighted$")
	public void order_entry_tab_should_be_highlighted() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_Order_Entry_tab_is_highlighted();
	}

	@Then("^Teacher \\[Order Entry\\] form should be displayed$")
	public void teacher_order_entry_form_should_be_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_Order_Entry_form_is_displayed();
	}

	@And("^CSR navigates to Verify Account Page$")
	public void csr_navigates_to_verify_account_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		//studentFlyerOrdersPage.Clicks_on_Continue_To_verify_Account_in_LocateAccountPage();
		studentFlyerOrdersPage.CSR_enters_the_Ac_Num_and_select_in_Search_Results();
	}

	@When("^CSR selects \\[Continue To Order Entry\\] in Verify Account page$")
	public void csr_selects_continue_to_order_entry_in_verify_account_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Clicks_on_Continue_To_Order_Entry_in_VerifyAccountPage();
	}

	@When("^CSR navigates to Order Entry Page$")
	public void csr_navigates_to_order_entry_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Clicks_on_Continue_To_Order_Entry_in_VerifyAccountPage();
	}

	@When("^CSR navigates to Review Cart Page$")
	public void csr_navigates_to_review_cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_num_Item_Qty_and_proceedToCheckout();
	}

	@Then("^\\[Review Cart\\] tab should be highlighted$")
	public void review_cart_tab_should_be_highlighted() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_Review_cart_tab_is_highlighted();
	}

	@Then("^the step header number for the page in a highlighted tab should be displayed correctly$")
	public void the_step_header_number_for_the_page_in_a_highlighted_tab_should_be_displayed_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_Review_cart_page_Num_in_StepHeader_Bubble();
	}

	@Then("^\\[Proceed To Checkout\\] button should be displayed$")
	public void proceed_to_checkout_button_should_be_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_Proceed_To_Checkout_btn_is_displayed();
	}

	@When("^CSR enters the flyer code comprising special character and tab to move out of the flyer field$")
	public void csr_enters_the_flyer_code_comprising_special_character_and_tab_to_move_out_of_the_flyer_field() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_flyerCode_and_Tab_to_moveOut_OrderEntryPage();
	}

	@When("^CSR enters the unlisted flyer code and tab to move out of the flyer field$")
	public void csr_enters_the_unlisted_flyer_code_and_tab_to_move_out_of_the_flyer_field() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_flyerCode_and_Tab_to_moveOut_OrderEntryPage();
	}

	@When("^CSR enters the flyer code less than 6 charactes and tab to move out of the flyer field$")
	public void csr_enters_the_flyer_code_less_than_6_charactes_and_tab_to_move_out_of_the_flyer_field() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_flyerCode_and_Tab_to_moveOut_OrderEntryPage();
	}

	@When("^CSR enters the flyer code which is not active for current month and tab to move out of the flyer field$")
	public void csr_enters_the_flyer_code_which_is_not_active_for_current_month_and_tab_to_move_out_of_the_flyer_field() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_flyerCode_and_Tab_to_moveOut_OrderEntryPage();
	}

	@And("^CSR enters the flyer code and tab to move out of the flyer field$")
	public void csr_enters_the_flyer_code_and_tab_to_move_out_of_the_flyer_field() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_flyerCode_and_Tab_to_moveOut_OrderEntryPage();
	}

	@When("^CSR enters invalid flyer code tab to move out of the flyer field$")
	public void csr_enters_invalid_flyer_code_tab_to_move_out_of_the_flyer_field() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_flyerCode_and_Tab_to_moveOut_OrderEntryPage();
	}

	@When("^CSR enters ItemNo as blank and enters Paid QTY$")
	public void csr_enters_itemno_as_blank_and_enters_paid_qty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed1_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed1_in_OrderEntryPage();
	}

	@And("^CSR enters ItemNo and Paid Qty as blank$")
	public void csr_enters_itemno_and_paid_qty_as_blank() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed1_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed1_in_OrderEntryPage();
	}

	@And("^CSR enters InvalidItemNo and enters Paid QTY$")
	public void csr_enters_invaliditemno_and_enters_paid_qty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed1_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed1_in_OrderEntryPage();
	}

	@And("^CSR enters 'Item#' and enters Paid QTY$")
	public void csr_enters_item_and_enters_paid_qty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed1_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed1_in_OrderEntryPage();
	}

	@When("^CSR enters ItemNo and enters Paid QTY as 3 digits$")
	public void csr_enters_itemno_and_enters_paid_qty_as_3_digits() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed1_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed1_in_OrderEntryPage();
	}

	@And("^CSR enters ItemNo and enters Paid QTY$")
	public void csr_enters_itemno_and_enters_paid_qty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed1_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed1_in_OrderEntryPage();
	}

	@And("^CSR enters ItemNo and enters Paid QTY of 3 Integers$")
	public void csr_enters_itemno_and_enters_paid_qty_of_3_integers() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed1_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed1_in_OrderEntryPage();
	}

	@When("^CSR does not do any action on the webpage for 3 sec$")
	public void csr_does_not_do_any_action_on_the_webpage_for_3_sec() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_wait_for_3secs();
	}

	@Then("^Error call out automatically disappears$")
	public void error_call_out_automatically_disappears() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_callOut_msg_disappeares_PaidQty();
	}

	@And("^CSR moves to 2nd row and enters ItemNo and enters Paid QTY as blank$")
	public void csr_moves_to_2nd_row_and_enters_itemno_and_enters_paid_qty_as_blank() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed2_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed2_in_OrderEntryPage();
	}

	@And("^CSR moves to 2nd row and enters ItemNo and enters Paid QTY$")
	public void csr_moves_to_2nd_row_and_enters_itemno_and_enters_paid_qty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed2_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed2_in_OrderEntryPage();
	}

	@And("^CSR moves to 3rd row and enters Invalid\\-ItemNo and enters Paid QTY$")
	public void csr_moves_to_3rd_row_and_enters_invaliditemno_and_enters_paid_qty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed3_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed3_in_OrderEntryPage();
	}

	@And("^CSR moves to 4th row and enters Invalid\\-ItemNo and enters Paid QTY as blank$")
	public void csr_moves_to_4th_row_and_enters_invaliditemno_and_enters_paid_qty_as_blank() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed4_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed4_in_OrderEntryPage();
	}

	@And("^CSR moves to 4th row and enters Invalid\\-ItemNo and enters Paid QTY$")
	public void csr_moves_to_4th_row_and_enters_invaliditemno_and_enters_paid_qty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed4_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed4_in_OrderEntryPage();
	}

	@And("^CSR moves to 2nd row and enters Invalid\\-ItemNo and enters Paid QTY$")
	public void csr_moves_to_2nd_row_and_enters_invaliditemno_and_enters_paid_qty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed2_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed2_in_OrderEntryPage();
	}

	@And("^CSR moves to 3rd row and enters ItemNo as blank and enters Paid QTY$")
	public void csr_moves_to_3rd_row_and_enters_itemno_as_blank_and_enters_paid_qty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed3_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed3_in_OrderEntryPage();
	}

	@And("^CSR moves to 4th row and enters ItemNum and enters Paid QTY$")
	public void csr_moves_to_4th_row_and_enters_itemnum_and_enters_paid_qty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed4_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed4_in_OrderEntryPage();
	}

	@Then("^System triggers a popup message 'Is this the correct number of items\\?' with \\[YES\\] and \\[NO\\] buttons$")
	public void system_triggers_a_popup_message_is_this_the_correct_number_of_items_with_yes_and_no_buttons() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_popUp_msg_with_YES_NO_btns_when_CSR_enters_3digits_in_Qty_fld_OrderEntryPage();
	}

	@When("^CSR clicks on \\[Yes\\]$")
	public void csr_clicks_on_yes() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_YES_in_Confirmation_PopUp_PaidQty();
	}

	@When("^CSR clicks on \\[NO\\]$")
	public void csr_clicks_on_no() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_NO_in_Confirmation_PopUp_PaidQty();
	}

	@Then("^the Call out message for Qty closes and CSR is on Order Entry page$")
	public void the_call_out_message_for_qty_closes_and_csr_is_on_order_entry_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_Confirmation_PopUp_PaidQty();
	}

	@And("^CSR enters 'Item#' with special character and enters Paid QTY$")
	public void csr_enters_item_with_special_character_and_enters_paid_qty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed1_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed1_in_OrderEntryPage();
	}

	@And("^CSR enters ItemSerialNo and enters Paid QTY$")
	public void csr_enters_itemserialno_and_enters_paid_qty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed1_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed1_in_OrderEntryPage();
	}

	@And("^CSR enters ItemSerialNo with special character and enters Paid QTY$")
	public void csr_enters_itemserialno_with_special_character_and_enters_paid_qty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed2_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed2_in_OrderEntryPage();
	}

	@Then("^the Error message pop\\-up should be displayed with the title as \\[Invalid Items\\] and the \\[Continue\\] & \\[Cancel\\] buttons$")
	public void the_error_message_popup_should_be_displayed_with_the_title_as_invalid_items_and_the_continue_cancel_buttons() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_PopUp_for_InvalidItems_and_the_Continue_Cancel_buttons_in_OrderEntryPage();
	}

	@Then("^Error message popup is closed$")
	public void error_message_popup_is_closed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_InvalidItem_PopUp_disappeared_OrderEntryPage();
	}

	@And("^CSR is back on the \\[Order Entry page\\]$")
	public void csr_is_back_on_the_order_entry_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_OrderEntry_page_is_displayed();
	}

	@Then("^the Error message pop\\-up should be displayed with the title as \\[Invalid Items\\] and the \\[Ok\\] button$")
	public void the_error_message_popup_should_be_displayed_with_the_title_as_invalid_items_and_the_ok_button() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_PopUp_for_InvalidItems_and_the_OK_button_in_OrderEntryPage();
	}

	@And("^all the Invalid ItemNo will be displayed in the error popup$")
	public void all_the_invalid_itemno_will_be_displayed_in_the_error_popup() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_InvalidItem_nums_in_PopUp_in_OrderEntryPage();
	}

	@And("^all the Invalid ItemNo will be displayed in the error popup_2$")
	public void all_the_invalid_itemno_will_be_displayed_in_the_error_popup_2() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_InvalidItem_nums_2_in_PopUp_in_OrderEntryPage();
	}

	@And("^all the Invalid ItemNo will be displayed in the error popup_3$")
	public void all_the_invalid_itemno_will_be_displayed_in_the_error_popup3() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_InvalidItem_nums_3_in_PopUp_in_OrderEntryPage();
	}

	@And("^all the Invalid ItemNo will be displayed in the error popup_3_4$")
	public void all_the_invalid_itemno_will_be_displayed_in_the_error_popup34() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_InvalidItem_nums_3_4_in_PopUp_in_OrderEntryPage();
	}

	@And("^CSR enters 'Item#' as blank and enters Paid QTY$")
	public void csr_enters_item_as_blank_and_enters_paid_qty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed2_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed2_in_OrderEntryPage();
	}

	@And("^CSR clicks on \\[Proceed to Checkout\\]$")
	public void csr_clicks_on_proceed_to_checkout() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_Proceed_To_Checkout_btn();
	}

	@When("^CSR clicks on \\[Continue\\] button$")
	public void csr_clicks_on_continue_button() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_Continue_btn_Invalid_items_popup();
	}

	@When("^CSR clicks on \\[Cancel\\] button$")
	public void csr_clicks_on_cancel_button() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_Cancel_btn_Invalid_items_popup();
	}

	@Then("^the error message should be displayed as 'You must enter an item number' for Item Number field$")
	public void the_error_message_should_be_displayed_as_you_must_enter_an_item_number_for_item_number_field() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_error_msg_for_ItemNum_fld_OrderEntryPage();
	}

	@Then("^the error message should be displayed as 'You must enter a quantity' for Paid Qty field$")
	public void the_error_message_should_be_displayed_as_you_must_enter_a_quantity_for_paid_qty_field() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_error_msg_for_ItemQty_fld_OrderEntryPage();
	}

	@Then("^the error message should be displayed as 'You must enter an item number' for blank Item Number$")
	public void the_error_message_should_be_displayed_as_you_must_enter_an_item_number_for_blank_item_number() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_error_msg_for_ItemNum_fld_OrderEntryPage();
	}

	@Then("^Error message is displayed for in\\-valid flyer code$")
	public void error_message_is_displayed_for_invalid_flyer_code() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_error_msg_for_Invalid_FlyerCode_OrderEntryPage();
	}

	@Then("^Error message is displayed for missing flyer code$")
	public void error_message_is_displayed_for_missing_flyer_code() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_error_msg_for_missing_FlyerCode_OrderEntryPage();
	}

	@Then("^\"([^\"]*)\" screen should be displayed$")
	public void something_screen_should_be_displayed(String strArg1) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_locate_account_is_displayed();
	}


	@And("^\"([^\"]*)\" tab should be highlighted$")
	public void something_tab_should_be_highlighted(String strArg1) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_active_progress_tab();
	}

	@Then("^Step Header section should be in order from \"([^\"]*)\" to \"([^\"]*)\"$")
	public void step_header_section_should_be_in_order_from_something_to_something(String strArg1, String strArg2) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_progresstabs_order();
	}


	@When("^teacher add student club items to cart with \\[minumum amount\\]$")
	public void teacher_add_student_club_items_to_cart_with_minumum_amount() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@Then("^Two layers should be displayed in Order Entry module$")
	public void two_layers_should_be_displayed_in_order_entry_module() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_two_layers_displayed_in_Order_Entry_Page();
	}

	@Then("^Two tabs should be displayed in the first layer of Order Entry module$")
	public void two_tabs_should_be_displayed_in_the_first_layer_of_order_entry_module() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_two_tabs_displayed_in_first_layer_Order_Entry_Page();
	}

	@Then("^Eight rows should be displayed under the header in Item Entry layer of the form$")
	public void eight_rows_should_be_displayed_under_the_header_in_item_entry_layer_of_the_form() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_Eight_rows_displayed_under_the_header_in_Item_Entry_layer_form();
	}

	@Then("^Three textboxes should be displayed in each row in Item Entry layer of the three forms$")
	public void three_textboxes_should_be_displayed_in_each_row_in_item_entry_layer_of_the_three_forms() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_Three_text_boxes_in_each_row_displayed_under_the_header_in_Item_Entry_layer_form();
	}

	@Then("^Student Order tab should be disabled in the first layer of Order Entry module$")
	public void student_order_tab_should_be_disabled_in_the_first_layer_of_order_entry_module() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_StudentsOrders_tab_disabled_in_first_layer_Order_Entry_Page();
	}

	@Then("^the \\[BONUS QTY\\] textboxes should be disabled$")
	public void the_bonus_qty_textboxes_should_be_disabled() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_Bonus_QTY_textboxes_disabled_Order_Entry_Page();
	}

	@Then("^Teacher Order tab should be selected in the first layer of Order Entry module$")
	public void teacher_order_tab_should_be_selected_in_the_first_layer_of_order_entry_module() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_TeacherOrders_tab_selected_in_first_layer_Order_Entry_Page();
	}

	@Then("^Three horizontal forms should be present in the second layer of Order Entry module$")
	public void three_horizontal_forms_should_be_present_in_the_second_layer_of_order_entry_module() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_default_forms_displayed_in_Second_layer_Order_Entry_Page();
	}

	@Then("^the form should be expanded with additional Eight rows in all 3 forms$")
	public void the_form_should_be_expanded_with_additional_eight_rows_in_all_3_forms() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_additional_8rows_displayed_in_Order_Entry_forms();
	}

	@Then("^the form should be expanded with additional Eight rows in all the 3 forms$")
	public void the_form_should_be_expanded_with_additional_eight_rows_in_all_the_3_forms() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_additional_8rows_displayed_when_perform_Tab_in_Order_Entry_forms();
	}

	@Then("^Flyer Code entry content field should be displayed in the Order Entry module$")
	public void flyer_code_entry_content_field_should_be_displayed_in_the_order_entry_module() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_Flyer_Code_field_is_displayed_in_Order_Entry_Page();
	}

	@Then("^Items entry content field should be displayed in the Order Entry module$")
	public void items_entry_content_field_should_be_displayed_in_the_order_entry_module() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_items_Entry_fields_is_displayed_in_Order_Entry_Page();
	}

	@Then("^Form expansion button should be displayed in the Order Entry module$")
	public void form_expansion_button_should_be_displayed_in_the_order_entry_module() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_Form_expansion_buttons_is_displayed_in_Order_Entry_Page();
	}

	@When("^CSR clicks on '\\+' button in the Item Entry Layer of the form$")
	public void csr_clicks_on_button_in_the_item_entry_layer_of_the_form() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Form_expansion_button_form1_in_Order_Entry_Page();
	}

	@And("^the cursor is in the last ‘accessible\\/enabled’ textbox within any of the 3 forms on that row$")
	public void the_cursor_is_in_the_last_accessibleenabled_textbox_within_any_of_the_3_forms_on_that_row() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_the_last_textbox_in_form1_in_Order_Entry_Page();
	}

	@When("^CSR press the \\[Tab\\] key$")
	public void csr_press_the_tab_key() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_perform_Tab_key_in_Order_Entry_Page();
	}

	@Then("^the label of the Flyer Code entry field should be displayed as 'FLYER CODE #'$")
	public void the_label_of_the_flyer_code_entry_field_should_be_displayed_as_flyer_code_() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_label_of_FLYER_CODE_in_Order_Entry_Page();
	}

	@Then("^the Placeholder text should be displayed within the Flyer Code entry field text box$")
	public void the_placeholder_text_should_be_displayed_within_the_flyer_code_entry_field_text_box() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_placeholder_text_in_FLYER_CODE_in_Order_Entry_Page();
	}

	@Then("^the header of the first column entry should be displayed as 'Item #'$")
	public void the_header_of_the_first_column_entry_should_be_displayed_as_item_() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_header_of_first_column_entry_in_Order_Entry_from();
	}

	@Then("^the header of the second column entry should be displayed as 'Paid QTY\\.'$")
	public void the_header_of_the_second_column_entry_should_be_displayed_as_paid_qty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_header_of_second_column_entry_in_Order_Entry_from();
	}

	@Then("^the header of the third column entry should be displayed as 'Bonus QTY\\.'$")
	public void the_header_of_the_third_column_entry_should_be_displayed_as_bonus_qty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_header_of_third_column_entry_in_Order_Entry_from();
	}

	@When("^CSR enters the Flyer code$")
	public void csr_enters_the_flyer_code() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_FLYER_CODE_in_Order_Entry_form();
	}

	@When("^CSR enters Item number in a \\[Item number\\] field$")
	public void csr_enters_item_number_in_a_item_number_field() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Number_in_Order_Entry_form();
	}

	@When("^CSR enters the quantity in \\[PAID QTY\\] field$")
	public void csr_enters_the_quantity_in_paid_qty_field() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Paid_QTY_in_Order_Entry_form();
	}

	@Then("^Item number field should accept the entered item number$")
	public void item_number_field_should_accept_the_entered_item_number() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Verify_the_Item_Number_in_Order_Entry_form();
	}

	@Then("^the \\[PAID QTY\\] field accepts the entered paid quantity number$")
	public void the_paid_qty_field_accepts_the_entered_paid_quantity_number() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Verify_the_Paid_QTY_in_Order_Entry_form();
	}

	@Then("^the \\[PAID QTY\\] field should not accept the entered paid quantity number$")
	public void the_paid_qty_field_should_not_accept_the_entered_paid_quantity_number() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();

	}

	@Then("^the Flyer Code field should accept the entered Flyer code$")
	public void the_flyer_code_field_should_accept_the_entered_flyer_code() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_entered_FLYER_CODE_in_Order_Entry_form();
	}

	@And("^CSR enters Item#Qty$")
	public void csr_enters_itemqty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.enteritemcodeQty();

	}

	@When("^CSR clicks on \\[Proceed To CheckOut\\]$")
	public void csr_clicks_on_continue_to_checkout() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickProceedToCheckout();
	}

	@Then("^Review order page is displayed$")
	public void review_order_page_is_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_ReviewCartPageDiplayed();

	}

	@When("^CSR adds Teacher catalogue items to the cart$")
	public void csr_adds_teacher_catalogue_items_to_the_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@When("^CSR adds student club items to the cart$")
	public void csr_adds_student_club_items_to_the_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Student_clubs_items_to_cart_OrderEntryPage();
	}

	@Then("^Teacher catalogues table is expanded by default with the added item information displayed$")
	public void teacher_catalogues_table_is_expanded_by_default_with_the_added_item_information_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_Teacher_Cat_table_expanded_ReviewCartPage();
	}

	@Then("^Teacher catalogues table is not displayed$")
	public void teacher_catalogues_table_is_not_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_Teacher_Cat_table_is_not_displayed_ReviewCartPage();
	}

	@When("^CSR clicks on '\\-' next to 'Your Teacher Order – Teacher Catalogues' label$")
	public void csr_clicks_on_next_to_your_teacher_order_teacher_catalogues_label() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_minus_btn_YTO_in_ReviewCartPage();
	}

	@And("^CSR clicks on '\\-' to hide the Teacher Catalogue table$")
	public void csr_clicks_on_to_hide_the_teacher_catalogue_table() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_minus_btn_YTO_in_ReviewCartPage();
	}

	@When("^CSR clicks on '\\+' next to 'Your Teacher Order – Teacher Catalogue' label$")
	public void csr_clicks_on_next_to_your_teacher_order_teacher_catalogue_label() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_Plus_btn_YTO_in_ReviewCartPage();
	}

	@Then("^Teacher Catalogue table is expanded with items displayed and shows '\\-' sign$")
	public void teacher_catalogue_table_is_expanded_with_items_displayed_and_shows_sign() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_Teacher_Cat_table_expanded_ReviewCartPage();
	}

	@Then("^Columns 'Item#', 'Title', 'Flyer', 'Price', 'QTY\\.' displays in the mentioned order$")
	public void columns_item_title_flyer_price_qty_displays_in_the_mentioned_order() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_added_items_header_order_in_ReviewCartPage();
	}

	@And("^the items added are displayed with correct 'Item#', 'Title', 'Flyer', 'Price', 'QTY\\.'$")
	public void the_items_added_are_displayed_with_correct_item_title_flyer_price_qty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_added_items_details_displayed_correctly_in_ReviewCartPage();
	}

	@Then("^Single table displays with all the items listed under Teacher Catalogues$")
	public void single_table_displays_with_all_the_items_listed_under_teacher_catalogues() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_Single_table_displays_with_all_items_under_TeacherCatalogues_in_ReviewCartPage();
	}

	@And("^list of line\\-items are sorted by Flyer title and then by Item number in ascending order$")
	public void list_of_lineitems_are_sorted_by_flyer_title_and_then_by_item_number_in_ascending_order() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_items_list_is_in_ascending_order_in_ReviewCartPage();
	}

	@And("^the items are displayed sorted in ascending order of 'Item#'$")
	public void the_items_are_displayed_sorted_in_ascending_order_of_item() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_items_list_is_in_ascending_order_in_ReviewCartPage();
	}

	@When("^CSR adds Teacher Catalogue items from single flyer to cart$")
	public void csr_adds_teacher_catalogue_items_from_single_flyer_to_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@When("^CSR adds multiple Teacher Catalogue items from same month and flyer$")
	public void csr_adds_multiple_teacher_catalogue_items_from_same_month_and_flyer() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@And("^CSR adds Teacher catalogue items to the cart without qualifying min order from the same flyer$")
	public void csr_adds_teacher_catalogue_items_to_the_cart_without_qualifying_min_order_from_the_same_flyer() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@And("^CSR adds Student Clubs items to the cart$")
	public void csr_adds_student_clubs_items_to_the_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@And("^CSR adds Student Clubs items to the cart with minimum amount$")
	public void csr_adds_student_clubs_items_to_the_cart_with_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@And("^CSR adds Student Clubs items to the cart less than the minimum amount$")
	public void csr_adds_student_clubs_items_to_the_cart_less_than_the_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@And("^CSR adds Teacher catalogue items to the cart without qualifying minimum amount$")
	public void csr_adds_teacher_catalogue_items_to_the_cart_without_qualifying_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@And("^CSR adds Teacher Catalogues items to the cart with minimum amount$")
	public void csr_adds_teacher_catalogues_items_to_the_cart_with_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@And("^CSR adds Teacher Catalogues items to the cart$")
	public void csr_adds_teacher_catalogues_items_to_the_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@And("^CSR adds Student Clubs items to the cart without qualifying min order from the same flyer$")
	public void csr_adds_student_clubs_items_to_the_cart_without_qualifying_min_order_from_the_same_flyer() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@And("^CSR adds Student and Teacher Catalogues items to the cart without qualifying min order$")
	public void csr_adds_student_and_teacher_catalogues_items_to_the_cart_without_qualifying_min_order() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_from_diff_flyers_OrderEntryPage();
	}

	@When("^CSR adds multiple Teacher Catalogue items from same month and different flyers$")
	public void csr_adds_multiple_teacher_catalogue_items_from_same_month_and_different_flyers() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_from_diff_flyers_OrderEntryPage();
	}

	@And("^CSR adds Teacher catalogue items to the cart without qualifying min order from the differenr flyer$")
	public void csr_adds_teacher_catalogue_items_to_the_cart_without_qualifying_min_order_from_the_differenr_flyer() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_from_diff_flyers_OrderEntryPage();
	}

	@And("^CSR adds Student Clubs items to the cart without qualifying min order from the differenr flyer$")
	public void csr_adds_student_clubs_items_to_the_cart_without_qualifying_min_order_from_the_differenr_flyer() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_from_diff_flyers_OrderEntryPage();
	}

	@When("^CSR adds multiple Teacher Catalogue items from different flyers$")
	public void csr_adds_multiple_teacher_catalogue_items_from_different_flyers() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_from_diff_flyers_OrderEntryPage();
	}

	@When("^CSR adds teacher catalogue items from different flyers to cart$")
	public void csr_adds_teacher_catalogue_items_from_different_flyers_to_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_Teacher_cat_items_from_diff_flyers_to_cart_OrderEntryPage();
	}

	@Then("^Teacher Catalogues table is hidden or contracted showing '\\+' sign and label 'Your Teacher Order – Teacher Catalogues'$")
	public void teacher_catalogues_table_is_hidden_or_contracted_showing_sign_and_label_your_teacher_order_teacher_catalogues() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_YTO_table_is_hidden_in_ReviewCartPage();
	}

	@Then("^correct Teacher’s full name with that Teacher’s prefix preceding his\\/her first name displays in first container from \\[Order Entry\\] page to \\[Confirm & Submit\\] page$")
	public void correct_teachers_full_name_with_that_teachers_prefix_preceding_hisher_first_name_displays_in_first_container_from_order_entry_page_to_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_Teacher_Fullname_in_container1_in_Order_Entry_Page();
    	/*studentFlyerOrdersPage.CSR_enters_Item_num_Item_Qty_and_proceedToCheckout();
    	studentFlyerOrdersPage.verify_Teacher_Fullname_in_container1_in_Order_Entry_Page();
    	studentFlyerOrdersPage.CSR_clicks_on_Proceed_To_Checkout_btn();
    	studentFlyerOrdersPage.verify_Teacher_Fullname_in_container1_in_Order_Entry_Page();
    	studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Rewards_page();
    	studentFlyerOrdersPage.verify_Teacher_Fullname_in_container1_in_Order_Entry_Page();

    	ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();

		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
    	PauseUtil.waitForAjaxToComplete(2500);
    	shippingAndPaymentPage.getDrpPaymentMethod_2().click();
		PauseUtil.pause(2000);

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CHECKPAYMENTMETHOD);
		PauseUtil.pause(5000);

    	studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Payments_page();

    	studentFlyerOrdersPage.verify_Teacher_Fullname_in_container1_in_Order_Entry_Page();*/

	}

	@And("^CSR navigates to Review Cart page from Order Entry page$")
	public void csr_navigates_to_review_cart_page_from_order_entry_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickProceedToCheckout();
	}



	//soma for CSR 215

	@When("^CSR adds Student club items from Single month and single flyer to cart$")
	public void csr_adds_student_club_items_from_single_month_and_single_flyer_to_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_add_multiple_items_qty_orderentrypage();
	}

	@When("^CSR adds multiple Student club items from same month and flyer$")
	public void csr_adds_multiple_student_club_items_from_same_month_and_flyer() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_add_multiple_items_qty_orderentrypage();
	}

	@When("^CSR adds multiple Student club items from different flyers and months$")
	public void csr_adds_multiple_student_club_items_from_different_flyers_and_months() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_add_multiple_items_qty_orderentrypage();
	}

	@When("^CSR adds item with same item number and same Qty from different flyers$")
	public void CSR_adds_item_with_same_item_number_and_same_Qty_from_different_flyers() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_add_mulitple_item_sameQty_differentflyer();

	}

	@When("^CSR adds item with same item number with Qty being different from different flyers$")
	public void CSR_adds_item_with_same_item_number_with_Qty_being_different_from_different_flyers() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_add_mulitple_item_sameQty_differentflyer();
	}

	@When("^CSR updates the Qty of items in every flyer table$")
	public void csr_updates_the_qty_of_items_in_every_flyer_table() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_update_multiple_items_qty_orderentrypage();
	}

	@Then("^Unit price of the item is displayed on line item level with updated Qty in Qty field$")
	public void unit_price_of_the_item_is_displayed_on_line_item_level_with_updated_qty_in_qty_field() throws Throwable {
		//implement the code here
	}

	@When("^CSR adds Student club items from different flyers and different months to cart$")
	public void csr_adds_student_club_items_from_different_flyers_and_different_months_to_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_add_multiple_items_qty_orderentrypage();
	}

	@When("^CSR adds Student clubs items to cart$")
	public void csr_adds_student_clubs_items_to_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_add_multiple_items_qty_orderentrypage();
	}

	@When("^CSR adds teacher catalogue items to cart$")
	public void csr_adds_teacher_catalogue_items_to_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_add_multiple_items_qty_orderentrypage();
	}


	@Then("^correct total for Price and Qty are displayed within the footer region of the flyer table$")
	public void correct_total_for_price_and_qty_are_displayed_within_the_footer_region_of_the_flyer_table() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_Student_club_subtotalprice_qty();
	}

	@And("^correct updated total for Price and Qty are displayed within the footer region of each flyer table$")
	public void correct_updated_total_for_price_and_qty_are_displayed_within_the_footer_region_of_each_flyer_table() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_Student_club_subtotalprice_qty();
	}

	@Then("^correct total for Price and Qty are displayed within the footer region of each flyer table$")
	public void correct_total_for_price_and_qty_are_displayed_within_the_footer_region_of_each_flyer_table() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_Student_club_subtotalprice_qty();
	}

	@And("^“Student Clubs Subtotal” with correct subtotal\\(Pre\\-tax\\) and Qty displays$")
	public void student_clubs_subtotal_with_correct_subtotalpretax_and_qty_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_Student_club_subtotalprice_qty();
	}

	@And("^“Student Clubs Subtotal” with correct subtotal\\(Pre\\-tax amount which is sum of subtotals from each flyer\\) and Qty\\(Sum of Qty subtotals from each flyer\\)displays$")
	public void student_clubs_subtotal_with_correct_subtotalpretax_amount_which_is_sum_of_subtotals_from_each_flyer_and_qtysum_of_qty_subtotals_from_each_flyerdisplays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_Student_club_subtotalprice_qty();
	}

	@And("^“Student Clubs Subtotal” with correct updated subtotal\\(Pre\\-tax amount which is sum of subtotals from each flyer\\) and Qty\\(Sum of Qty subtotals from each flyer\\)displays$")
	public void student_clubs_subtotal_with_correct_updated_subtotalpretax_amount_which_is_sum_of_subtotals_from_each_flyer_and_qtysum_of_qty_subtotals_from_each_flyerdisplays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_Student_club_subtotalprice_qty();
	}


	@And("^correct GST, QST tax rates displays in 2 seperate line items$")
	public void correct_gst_qst_tax_rates_displays_in_2_seperate_line_items() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_student_club_gst_qst();

	}

	@And("^correct GST, PST tax rates displays in 2 seperate line items$")
	public void correct_gst_pst_tax_rates_displays_in_2_seperate_line_items() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_student_club_gst_pst();
	}

	@And("^correct updated GST, PST tax rates displays in 2 seperate line items$")
	public void correct_updated_gst_pst_tax_rates_displays_in_2_seperate_line_items() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_student_club_gst_pst();
	}

	@And("^correct HST tax rates displays$")
	public void correct_hst_tax_rates_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_student_club_hst();
	}

	@And("^correct GST tax rates displays$")
	public void correct_gst_tax_rates_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_student_club_gst();
	}

	@And("^GST, QST tax rates displays as \\$0\\.00$")
	public void gst_qst_tax_rates_displays_as_000() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_studentclub_teachercatalogues_notaxes();
	}

	@And("^GST, PST tax rates displays as \\$0\\.00$")
	public void gst_pst_tax_rates_displays_as_000() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_studentclub_teachercatalogues_notaxes();
	}

	@And("^HST tax rates displays as \\$0\\.00$")
	public void hst_tax_rates_displays_as_000() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_studentclub_teachercatalogues_notaxes();
	}

	@And("^GST tax rates displays as \\$0\\.00$")
	public void gst_tax_rates_displays_as_000() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_studentclub_teachercatalogues_notaxes();
	}

	@And("^correct “Student Clubs total”\\(Post\\-tax amount\\) displays$")
	public void correct_student_clubs_totalposttax_amount_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_studentclub_total_posttax();

	}

	@And("^correct “Student Clubs total”\\(Student Clubs Subtotal \\+ GST \\+ PST\\) displays$")
	public void correct_student_clubs_totalstudent_clubs_subtotal_gst_pst_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_studentclub_total_posttax();
	}

	@And("^correct updated “Student Clubs total”\\(Student Clubs Subtotal \\+ GST \\+ PST\\) displays$")
	public void correct_updated_student_clubs_totalstudent_clubs_subtotal_gst_pst_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_studentclub_total_posttax();
	}

	@And("^correct “Student Clubs total”\\(Student Clubs Subtotal \\+ HST\\) displays$")
	public void correct_student_clubs_totalstudent_clubs_subtotal_hst_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_studentclub_total_posttax();
	}

	@And("^correct “Student Clubs total”\\(Student Clubs Subtotal \\+ GST\\) displays$")
	public void correct_student_clubs_totalstudent_clubs_subtotal_gst_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_studentclub_total_posttax();
	}

	@And("^correct “Student Clubs total” displays$")
	public void correct_student_clubs_total_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_studentclub_total_posttax();
	}

	@And("^correct “Total amount Owing” with Student Clubs total\\(Post\\-tax amount\\) and total Qty displays$")
	public void correct_total_amount_owing_with_student_clubs_totalposttax_amount_and_total_qty_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_studentclub_totalamt_owing_qty();
	}

	@And("^correct “Total amount Owing” with Student Clubs total and total Qty displays$")
	public void correct_total_amount_owing_with_student_clubs_total_and_total_qty_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_studentclub_totalamt_owing_qty();
	}

	@And("^correct updated “Total amount Owing” displays with Student Clubs total and total Qty displays$")
	public void correct_updated_total_amount_owing_displays_with_student_clubs_total_and_total_qty_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_studentclub_totalamt_owing_qty();
	}

	@Then("^Teacher Catalogues Subtotal,GST,QST and Total Amount Owing displays correctly$")
	public void teacher_catalogues_subtotalgstqst_and_total_amount_owing_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_CSR_Teacher_club_SubTotal_GST_QST_and_TotalOwing();
	}

	@Then("^Teacher Catalogues Subtotal,GST,PST and Total Amount Owing displays correctly$")
	public void teacher_catalogues_subtotalgstpst_and_total_amount_owing_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_CSR_Teacher_club_SubTotal_GST_PST_and_TotalOwing();
	}

	@Then("^Teacher Catalogues Subtotal,HST and Total Amount Owing displays correctly$")
	public void teacher_catalogues_subtotalhst_and_total_amount_owing_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_CSR_Teacher_club_SubTotal_HST_and_TotalOwing();
	}

	@Then("^Teacher Catalogues Subtotal,GST and Total Amount Owing displays correctly$")
	public void teacher_catalogues_subtotalgst_and_total_amount_owing_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_CSR_Teacher_club_SubTotal_GST_and_TotalOwing();
	}

	@Then("^no tax displays for GST,PST and correct Teacher Catalogues Subtotal,GST,PST and Total Amount Owing displays$")
	public void no_tax_displays_for_gstpst_and_correct_teacher_catalogues_subtotalgstpst_and_total_amount_owing_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_no_taxes_are_charged_on_CSR_Teacher_club_Subtotal_Total_amount();
	}

	@Then("^Student clubs table is expanded by default with the added item information displayed$")
	public void student_clubs_table_is_expanded_by_default_with_the_added_item_information_displayed() throws Throwable {
		//implement the code here
	}

	@Then("^Student clubs table is not displayed$")
	public void student_clubs_table_is_not_displayed() throws Throwable {
		//implement the code here
	}

	@When("^CSR clicks on '\\-' next to “Your Teacher Order – Student Club” label$")
	public void csr_clicks_on_minus__next_to_your_teacher_order_student_club_label() throws Throwable {
		//implement the code here
	}

	@And("^CSR clicks on '\\-' to hide the Student clubs table$")
	public void csr_clicks_on_to_hide_the_student_clubs_table() throws Throwable {
		//implement the code here
	}

	@When("^CSR clicks on '\\+' next to “Your Teacher Order – Student Club” label$")
	public void csr_clicks_on_plus_next_to_your_teacher_order_student_club_label() throws Throwable {
		//implement the code here
	}

	@Then("^Student clubs table is hidden or contracted showing '\\+' sign and label “Your Teacher Order – Student Club”$")
	public void student_clubs_table_is_hidden_or_contracted_showing_sign_and_label_your_teacher_order_student_club() throws Throwable {
		//implement the code here
	}

	@Then("^Student clubs table is expanded with items displayed$")
	public void student_clubs_table_is_expanded_with_items_displayed() throws Throwable {
		//implement the code here
	}

	@And("^shows '\\-' sign and label “Your Teacher Order – Student Club”$")
	public void shows_sign_and_label_your_teacher_order_student_club() throws Throwable {
		//implement the code here
	}

	@Then("^different table with columns “Item#”, “Title”, “Flyer”, “Price”, “QTY” displays for each unique Flyer and month$")
	public void different_table_with_columns_item_title_flyer_price_qty_displays_for_each_unique_flyer_and_month() throws Throwable {
		//implement the code here
	}

	@And("^the tables are sorted based on Flyer title in ascending order$")
	public void the_tables_are_sorted_based_on_flyer_title_in_ascending_order() throws Throwable {
		//implement the code here
	}

	@And("^line items within each table are sorted by “Item#” in ascending order$")
	public void line_items_within_each_table_are_sorted_by_item_in_ascending_order() throws Throwable {
		//implement the code here
	}




	@Then("^only Teacher’s full name is displayed with no prefix from \\[Order Entry\\] page to \\[Confirm & Submit\\] page$")
	public void only_teachers_full_name_is_displayed_with_no_prefix_from_order_entry_page_to_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_Teacher_Fullname_in_container1_in_Order_Entry_Page();
    	/*studentFlyerOrdersPage.CSR_enters_Item_num_Item_Qty_and_proceedToCheckout();
    	studentFlyerOrdersPage.verify_Teacher_Fullname_in_container1_in_Order_Entry_Page();
    	studentFlyerOrdersPage.CSR_clicks_on_Proceed_To_Checkout_btn();
    	studentFlyerOrdersPage.verify_Teacher_Fullname_in_container1_in_Order_Entry_Page();
    	studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Rewards_page();
    	studentFlyerOrdersPage.verify_Teacher_Fullname_in_container1_in_Order_Entry_Page();

    	ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();

		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
    	PauseUtil.waitForAjaxToComplete(2500);
    	shippingAndPaymentPage.getDrpPaymentMethod_2().click();
		PauseUtil.pause(2000);

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CHECKPAYMENTMETHOD);
		PauseUtil.pause(5000);

    	studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Payments_page();

    	studentFlyerOrdersPage.verify_Teacher_Fullname_in_container1_in_Order_Entry_Page();*/
	}

	@Then("^teacher's full school address with School Account Number, School Name, Street Number, Street Name, City, Province, Postal Code and Country displays in 2nd container as listed in customer's profile from \\[Order Entry\\] page to \\[Confirm & Submit\\] page$")
	public void teachers_full_school_address_with_school_account_number_school_name_street_number_street_name_city_province_postal_code_and_country_displays_in_2nd_container_as_listed_in_customers_profile_from_order_entry_page_to_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.verify_School_Info_displayed_in_container2_in_CustProfile();
    	/*studentFlyerOrdersPage.CSR_enters_Item_num_Item_Qty_and_proceedToCheckout();
    	studentFlyerOrdersPage.verify_School_Info_displayed_in_container2_in_CustProfile();
    	studentFlyerOrdersPage.CSR_clicks_on_Proceed_To_Checkout_btn();
    	studentFlyerOrdersPage.verify_School_Info_displayed_in_container2_in_CustProfile();
    	studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Rewards_page();
    	studentFlyerOrdersPage.verify_School_Info_displayed_in_container2_in_CustProfile();

    	ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();

		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
    	PauseUtil.waitForAjaxToComplete(2500);
    	shippingAndPaymentPage.getDrpPaymentMethod_2().click();
		PauseUtil.pause(2000);

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CHECKPAYMENTMETHOD);
		PauseUtil.pause(5000);

    	studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Payments_page();

    	studentFlyerOrdersPage.verify_School_Info_displayed_in_container2_in_CustProfile();*/
	}

	@Then("^teacher's correct account number displays in 3rd container from \\[Order Entry\\] page to \\[Confirm & Submit\\] page$")
	public void teachers_correct_account_number_displays_in_3rd_container_from_order_entry_page_to_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.verify_Teacher_Ac_num_in_container3_in_CustProfile();
    	/*studentFlyerOrdersPage.CSR_enters_Item_num_Item_Qty_and_proceedToCheckout();
    	studentFlyerOrdersPage.verify_Teacher_Ac_num_in_container3_in_CustProfile();
    	studentFlyerOrdersPage.CSR_clicks_on_Proceed_To_Checkout_btn();
    	studentFlyerOrdersPage.verify_Teacher_Ac_num_in_container3_in_CustProfile();
    	studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Rewards_page();
    	studentFlyerOrdersPage.verify_Teacher_Ac_num_in_container3_in_CustProfile();

    	ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();

		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
    	PauseUtil.waitForAjaxToComplete(2500);
    	shippingAndPaymentPage.getDrpPaymentMethod_2().click();
		PauseUtil.pause(2000);

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CHECKPAYMENTMETHOD);
		PauseUtil.pause(5000);

    	studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Payments_page();

    	studentFlyerOrdersPage.verify_Teacher_Ac_num_in_container3_in_CustProfile();*/
	}

	@And("^there is no CAC information displayed on 3rd container from \\[Order Entry\\] page to \\[Confirm & Submit\\] page$")
	public void there_is_no_cac_information_displayed_on_3rd_container_from_order_entry_page_to_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.verify_CAC_info_displayed_in_container3_in_CustProfile();
    	/*studentFlyerOrdersPage.CSR_enters_Item_num_Item_Qty_and_proceedToCheckout();
    	studentFlyerOrdersPage.verify_CAC_info_displayed_in_container3_in_CustProfile();
    	studentFlyerOrdersPage.CSR_clicks_on_Proceed_To_Checkout_btn();
    	studentFlyerOrdersPage.verify_CAC_info_displayed_in_container3_in_CustProfile();
    	studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Rewards_page();
    	studentFlyerOrdersPage.verify_CAC_info_displayed_in_container3_in_CustProfile();

    	ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();

		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
    	PauseUtil.waitForAjaxToComplete(2500);
    	shippingAndPaymentPage.getDrpPaymentMethod_2().click();
		PauseUtil.pause(2000);

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CHECKPAYMENTMETHOD);
		PauseUtil.pause(5000);

    	studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Payments_page();

    	studentFlyerOrdersPage.verify_CAC_info_displayed_in_container3_in_CustProfile();*/
	}

	@Then("^account status 'Active' displays beneath the account number in 3rd container$")
	public void account_status_active_displays_beneath_the_account_number_in_3rd_container() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_active_Teacher_status_in_container3_of_CustProfile();
	}

	@Then("^account status 'Inactive' displays beneath the account number in 3rd container$")
	public void account_status_inactive_displays_beneath_the_account_number_in_3rd_container() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_Inactive_Teacher_status_in_container3_of_CustProfile();
	}

	@Then("^account Hold status 'Temporary Hold' displays beneath the account number in 3rd container$")
	public void account_hold_status_temporary_hold_displays_beneath_the_account_number_in_3rd_container() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_Temporary_Hold_Teacher_status_in_container3_of_CustProfile();
	}

	@Then("^account Hold status 'Pre\\-Paid' displays beneath the account number in 3rd container$")
	public void account_hold_status_prepaid_displays_beneath_the_account_number_in_3rd_container() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_PrePaid_Teacher_status_in_container3_of_CustProfile();
	}

	@Then("^account Hold status 'Held by A\\/R' displays beneath the account number in 3rd container$")
	public void account_hold_status_held_by_ar_displays_beneath_the_account_number_in_3rd_container() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_Held_by_AR_Teacher_status_in_container3_of_CustProfile();

	}

	@Then("^Fourth container is divided into 2 rows with the first row containing the label ‘Bonus Bank’ from \\[Order Entry\\] page to \\[Confirm & Submit\\] page$")
	public void fourth_container_is_divided_into_2_rows_with_the_first_row_containing_the_label_bonus_bank_from_order_entry_page_to_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.verify_the_label_of_BonusPoints_in_container4_of_CustProfile();
    	/*studentFlyerOrdersPage.CSR_enters_Item_num_Item_Qty_and_proceedToCheckout();
    	studentFlyerOrdersPage.verify_the_label_of_BonusPoints_in_container4_of_CustProfile();
    	studentFlyerOrdersPage.CSR_clicks_on_Proceed_To_Checkout_btn();
    	studentFlyerOrdersPage.verify_the_label_of_BonusPoints_in_container4_of_CustProfile();
    	studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Rewards_page();
    	studentFlyerOrdersPage.verify_the_label_of_BonusPoints_in_container4_of_CustProfile();

    	ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();

		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
    	PauseUtil.waitForAjaxToComplete(2500);
    	shippingAndPaymentPage.getDrpPaymentMethod_2().click();
		PauseUtil.pause(2000);

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CHECKPAYMENTMETHOD);
		PauseUtil.pause(5000);

    	studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Payments_page();

    	studentFlyerOrdersPage.verify_the_label_of_BonusPoints_in_container4_of_CustProfile();*/
	}

	@And("^the 2nd row contains that Teacher’s total Bonus Dollars currently in that Teacher's Bonus Bank i\\.e\\. previous accumulated from \\[Order Entry\\] page to \\[Confirm & Submit\\] page$")
	public void the_2nd_row_contains_that_teachers_total_bonus_dollars_currently_in_that_teachers_bonus_bank_ie_previous_accumulated_from_order_entry_page_to_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.verify_the_BonusPoints_Amt_in_container4_of_CustProfile();
    	/*studentFlyerOrdersPage.CSR_enters_Item_num_Item_Qty_and_proceedToCheckout();
    	studentFlyerOrdersPage.verify_the_BonusPoints_Amt_in_container4_of_CustProfile();
    	studentFlyerOrdersPage.CSR_clicks_on_Proceed_To_Checkout_btn();
    	studentFlyerOrdersPage.verify_the_BonusPoints_Amt_in_container4_of_CustProfile();
    	studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Rewards_page();
    	studentFlyerOrdersPage.verify_the_BonusPoints_Amt_in_container4_of_CustProfile();

    	ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();

		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
    	PauseUtil.waitForAjaxToComplete(2500);
    	shippingAndPaymentPage.getDrpPaymentMethod_2().click();
		PauseUtil.pause(2000);

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CHECKPAYMENTMETHOD);
		PauseUtil.pause(5000);

    	studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Payments_page();

    	studentFlyerOrdersPage.verify_the_BonusPoints_Amt_in_container4_of_CustProfile();*/
	}

	@When("^CSR clicks on Bonus Bank in 4th container$")
	public void csr_clicks_on_bonus_bank_in_4th_container() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_BonusBank_in_container4_of_CustProfile();
	}

	@Then("^CSR is presented with flyout containing the Bonus bank range list$")
	public void csr_is_presented_with_flyout_containing_the_bonus_bank_range_list() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_the_Flyout_with_BBank_rangeList();
	}

	@Then("^Zero is displayed in Bonus Bank in 4th container in Customer Information Module from \\[Order Entry\\] page to \\[Confirm & Submit\\] page$")
	public void zero_is_displayed_in_bonus_bank_in_4th_container_in_customer_information_module_from_order_entry_page_to_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.verify_BonusBank_Amt_is_zero_in_container4_of_CustProfile();
    	/*studentFlyerOrdersPage.CSR_enters_Item_num_Item_Qty_and_proceedToCheckout();
    	studentFlyerOrdersPage.verify_BonusBank_Amt_is_zero_in_container4_of_CustProfile();
    	studentFlyerOrdersPage.CSR_clicks_on_Proceed_To_Checkout_btn();
    	studentFlyerOrdersPage.verify_BonusBank_Amt_is_zero_in_container4_of_CustProfile();
    	studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Rewards_page();
    	studentFlyerOrdersPage.verify_BonusBank_Amt_is_zero_in_container4_of_CustProfile();

    	ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();

		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
    	PauseUtil.waitForAjaxToComplete(2500);
    	shippingAndPaymentPage.getDrpPaymentMethod_2().click();
		PauseUtil.pause(2000);

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CHECKPAYMENTMETHOD);
		PauseUtil.pause(5000);

    	studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Payments_page();

    	studentFlyerOrdersPage.verify_BonusBank_Amt_is_zero_in_container4_of_CustProfile();*/
	}

	@Then("^teacher's correct bonus bank balance is displayed in 4th container in CustomerInformation module from \\[Order Entry\\] page to \\[Confirm & Submit\\] page$")
	public void teachers_correct_bonus_bank_balance_is_displayed_in_4th_container_in_customerinformation_module_from_order_entry_page_to_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.verify_BonusBank_Amt_is_correct_in_container4_of_CustProfile();
    	/*studentFlyerOrdersPage.CSR_enters_Item_num_Item_Qty_and_proceedToCheckout();
    	studentFlyerOrdersPage.verify_BonusBank_Amt_is_correct_in_container4_of_CustProfile();
    	studentFlyerOrdersPage.CSR_clicks_on_Proceed_To_Checkout_btn();
    	studentFlyerOrdersPage.verify_BonusBank_Amt_is_correct_in_container4_of_CustProfile();
    	studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Rewards_page();
    	studentFlyerOrdersPage.verify_BonusBank_Amt_is_correct_in_container4_of_CustProfile();

    	ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();

		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
    	PauseUtil.waitForAjaxToComplete(2500);
    	shippingAndPaymentPage.getDrpPaymentMethod_2().click();
		PauseUtil.pause(2000);

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CHECKPAYMENTMETHOD);
		PauseUtil.pause(5000);

    	studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Payments_page();

    	studentFlyerOrdersPage.verify_BonusBank_Amt_is_correct_in_container4_of_CustProfile();*/
	}

	@Then("^Review cart page is displayed$")
	public void review_cart_page_is_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_ReviewCart_is_displayed();
	}

	@And("^the Invalid ItemNo is not displayed$")
	public void the_invalid_itemno_is_not_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_invalid_item_is_not_displayed_in_ReviewCartPage();
	}

	@And("^the valid ItemNo is displayed on Review cart page$")
	public void the_valid_itemno_is_displayed_on_review_cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_valid_item_is_displayed_in_ReviewCartPage();
	}

	@And("^teacher close the browser without logging out$")
	public void teacher_close_the_browser_without_logging_out() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.Browser_Close();
	}


	@Then("^items entered should be auto saved$")
	public void items_entered_should_be_auto_saved() throws Throwable {
		System.out.println("Items are auto saved if browser is closed and opened with same account");

	}


	@And("^teacher adds items to cart and submit the order$")
	public void teacher_adds_items_to_cart_and_submit_the_order() throws Throwable {

		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		ICartPage cartpage = getFactory().getICartPage();
		CheckoutPage chkpge = new CheckoutPage();
		TeacherCheckOutSteps tchchkstps = new TeacherCheckOutSteps();
		iStudentFlyerOrdersPage.additems_submitorder();
		cartpage.clickOn_btnReviewCart();
		chkpge.teacher_Proceed_To_confirmSubmitPage_from_reviewCart();
		tchchkstps.teacher_submit_the_order();


	}

	@When("^CSR is on the Order Entry page$")
	public void csr_is_on_the_order_entry_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_OrderEntry_page_is_displayed();
	}

	@Then("^\\[Add Flyer\\] link is displayed$")
	public void add_flyer_link_is_displayed() throws Throwable {

	}


	@When("^teacher clicks on Early Childhood Elf catalog and select any one of the flyer present under it$")
	public void teacher_clicks_on_early_childhood_elf_catalog_and_select_any_one_of_the_flyer_present_under_it() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.click_Elf();
	}


	@When("^teacher clicks on Grades 4&5 Arrow catalog and select any one of the flyer present under it$")
	public void teacher_clicks_on_grades_45_arrow_catalog_and_select_any_one_of_the_flyer_present_under_it() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.click_Grade4And5();
	}


	@When("^teacher clicks on Teacher Catalogues and select any one of the flyer present under it$")
	public void teacher_clicks_on_teacher_catalogues_and_select_any_one_of_the_flyer_present_under_it() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.click_TeacherCatalogue();
	}


	@Then("^downloadable flyer links labels should be “Student Flyer” and “Teacher Pages”$")
	public void downloadable_flyer_links_labels_should_be_student_flyer_and_teacher_pages() throws Throwable {

		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.verify_studentflyer_teacherpagedownloadlinks();
	}


	@When("^teacher clicks on Student Flyer link present under any of these flyers$")
	public void teacher_clicks_on_student_flyer_link_present_under_any_of_these_flyers() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.click_studentflyer_downloadlink();
	}


	@Then("^Elf student flyer pdf should be downloaded$")
	public void elf_student_flyer_pdf_should_be_downloaded() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.verify_pagetitle();
	}

	@When("^CSR clicks on ORDER ENTRY tab$")
	public void csr_clicks_on_order_entry_tab() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_OrderEntry_tab();
	}

	@Then("^entered item numbers and the quantities should be displayed correctly$")
	public void entered_item_numbers_and_the_quantities_should_be_displayed_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_item_nums_Qty_displays_correctly_OrderEntryPage();
	}

	@When("^CSR enter same Flyer code and clicks on \\[Proceed To CheckOut\\]$")
	public void csr_enter_same_flyer_code_and_clicks_on_proceed_to_checkout() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enter_FlyerCode_And_click_on_ProceedToCheckout_OrderEntryPage();
	}

	@Then("^entered items should be displayed correctly$")
	public void entered_items_should_be_displayed_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_items_list_in_ReviewCart_page();
	}

	@When("^CSR clicks on the button labeled 'x' for the item$")
	public void csr_clicks_on_the_button_labeled_x_for_the_item() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_btn_X_to_delete_the_item1_ReviewCartPage();
	}

	@Then("^CSR is presented with the callout message with the text 'Delete this item' and the buttons \\[YES\\] \\[NO\\]$")
	public void csr_is_presented_with_the_callout_message_with_the_text_delete_this_item_and_the_buttons_yes_no() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_CallOut_msg_and_YES_NO_btns_ReviewCartPage();
	}

	@Then("^CSR is presented with a button labeled \\[Proceed to Checkout\\] positioned in the footer region of the 'Review Cart' page$")
	public void csr_is_presented_with_a_button_labeled_proceed_to_checkout_positioned_in_the_footer_region_of_the_review_cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_label_of_ProceedToCheckout();
	}

	@When("^CSR clicks on \\[Proceed To Checkout\\] in Review Cart page$")
	public void csr_clicks_on_proceed_to_checkout_in_review_cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_ProceedToCheckout_ReviewCartPage();
	}

	@And("^CSR clicks on \\[Proceed To Checkout\\] in Rewards and Coupons popup window$")
	public void csr_clicks_on_proceed_to_checkout_in_rewards_and_coupons_popup_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_ProceedToCheckout_in_RewardsCoupons_popup_window();
	}

	@Then("^\\[Rewards & Coupons\\] page should be displayed$")
	public void rewards_coupons_page_should_be_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_Rewards_And_Coupons_page_displayed();
	}

	@And("^CSR changes the item quantity to zero and perform tab to move out of the field$")
	public void csr_changes_the_item_quantity_to_zero_and_perform_tab_to_move_out_of_the_field() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_changes_item_Qty_and_Tab_to_moveOut_ReviewCartPage();
	}

	@Then("^\\[Rewards & Coupons\\] page should not be displayed$")
	public void rewards_coupons_page_should_not_be_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Rewards_Coupons_page_not_displayed();
	}

	@Then("^the step header should have the text 'Enter New Order'$")
	public void the_step_header_should_have_the_text_enter_new_order() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_text_of_OrderEntryPage_header();
	}

	@Then("^CSR should see a blue step script icon beside the Verify Account header$")
	public void csr_should_see_a_blue_step_script_icon_beside_the_verify_account_header() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_blue_script_icon_displays_OrderEntryPage();
	}

	@When("^CSR clicks on blue step script icon in Order Entry page$")
	public void csr_clicks_on_blue_step_script_icon_in_order_entry_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_blue_script_icon_OrderEntryPage();
	}

	@Then("^\\[Order Entry Script\\] popup should be displayed$")
	public void order_entry_script_popup_should_be_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_OrderEntryScript_popup_displayed();
	}

	@And("^correct text should be displayed in the popup$")
	public void correct_text_should_be_displayed_in_the_popup() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		//studentFlyerOrdersPage.CSR_verify_the_blue_script_icon_displays_OrderEntryPage();
	}

	@Then("^the close button 'X' should be displayed in the top right corner of the modal window$")
	public void the_close_button_x_should_be_displayed_in_the_top_right_corner_of_the_modal_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_close_btn_displays_in_OrderEntryScript_popup();
	}

	@When("^CSR clicks on close button in Order Entry Script modal window$")
	public void csr_clicks_on_close_button_in_order_entry_script_modal_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_closes_the_OrderEntryScript_popup_window_OrderEntryPage();
	}

	@When("^CSR clicks on \\[NO\\] button in delete popup message$")
	public void csr_clicks_on_no_button_in_delete_popup_message() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_NO_btn_in_Delete_popup_ReviewCartPage();
	}

	@Then("^Delete confirmation callout disappears$")
	public void delete_confirmation_callout_disappears() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_delete_confirmation_popup_disappear();
	}

	@When("^CSR clicks on \\[YES\\] button in delete popup message$")
	public void csr_clicks_on_yes_button_in_delete_popup_message() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_YES_btn_in_Delete_popup_ReviewCartPage();
	}

	@And("^the deleted item should not be displayed in the table$")
	public void the_deleted_item_should_not_be_displayed_in_the_table() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_deleted_item_not_displayed_in_ReviewCartPage();
	}

	@When("^CSR doesn't do any action for 3 seconds$")
	public void csr_doesnt_do_any_action_for_3_seconds() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_wait_for_3secs();
	}

	@Then("^CSR is presented with a capitalized label 'Total Amount Owing' in the footer region of the page$")
	public void csr_is_presented_with_a_capitalized_label_total_amount_owing_in_the_footer_region_of_the_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_label_of_TotalAmountOwing_in_ReviewCartPage();
	}

	@Then("^CSR is presented with the a label representative of the total cost of all items in the footer region of the page$")
	public void csr_is_presented_with_the_a_label_representative_of_the_total_cost_of_all_items_in_the_footer_region_of_the_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_total_cost_of_all_items_displays_in_ReviewCartPage();
	}

	@Then("^CSR is presented with the a label representative of the total quantity and the items of all items in the footer region of the page$")
	public void csr_is_presented_with_the_a_label_representative_of_the_total_quantity_and_the_items_of_all_items_in_the_footer_region_of_the_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Total_Qty_and_Items_displays_in_ReviewCartPage();
	}

	@Then("^CSR is presented with a hyperlink labeled 'Edit Cart' in the footer region of the page$")
	public void csr_is_presented_with_a_hyperlink_labeled_edit_cart_in_the_footer_region_of_the_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_hyperlink_of_BackToShop_in_ReviewCartPage();
	}


	@When("^CSR clicks on the hyperlink \\[Edit Cart\\]$")
	public void csr_clicks_on_the_hyperlink_edit_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_hyperlink_BackToShop_in_ReviewCartPage();
	}

	@Then("^Blue step script icon should be displayed next to \\[Review Your Cart\\] header in a page$")
	public void blue_step_script_icon_should_be_displayed_next_to_review_your_cart_header_in_a_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_blue_script_icon_displays_in_ReviewCartPage();
	}

	@When("^CSR clicks on Blue step script icon in Review Cart page$")
	public void csr_clicks_on_blue_step_script_icon_in_review_cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_blue_script_icon_in_ReviewCartPage();
	}

	@Then("^the modal window should be displayed with the title 'To confirm your order:'$")
	public void the_modal_window_should_be_displayed_with_the_title_to_confirm_your_order() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_modal_window_text_in_ReviewCartPage();
	}

	@And("^the close button 'X' should be displayed in the top right corner of the \\[To confirm your order:\\] modal window$")
	public void the_close_button_x_should_be_displayed_in_the_top_right_corner_of_the_to_confirm_your_order_modal_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_close_btn_displays_in_modal_window_ReviewCart_page();
	}

	@When("^CSR clicks on close button in \\[To confirm your order\\] modal window$")
	public void csr_clicks_on_close_button_in_to_confirm_your_order_modal_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_close_btn_in_modal_window_in_ReviewCartPage();
	}

	@Then("^CSR is presented with the \\[Review Cart\\] page$")
	public void csr_is_presented_with_the_review_cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_ReviewCartPage_displays();
	}

	@When("^CSR navigates to \\[Rewards & Coupons\\] page from \\[Review Cart\\] page$")
	public void csr_navigates_to_rewards_coupons_page_from_review_cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_ProceedToCheckout_ReviewCartPage();
		//studentFlyerOrdersPage.CSR_clicks_on_ProceedToCheckout_in_RewardsCoupons_popup_window();
	}

	@Then("^Blue step script icon should be displayed next to \\[Redemptions & Rewards\\] header in a page$")
	public void blue_step_script_icon_should_be_displayed_next_to_redemptions_rewards_header_in_a_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_blue_script_icon_displays_in_RedemptionsRewards_Page();
	}

	@When("^CSR clicks on Blue step script icon in \\[Rewards & Coupons\\] page$")
	public void csr_clicks_on_blue_step_script_icon_in_rewards_coupons_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_blue_script_icon_in_RedemptionsRewards_Page();
	}

	@Then("^the modal window should be displayed with the title 'To apply redemptions:'$")
	public void the_modal_window_should_be_displayed_with_the_title_to_apply_redemptions() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_modal_window_text_in_RedemptionsRewards_Page();
	}

	@And("^the close button 'X' should be displayed in the top right corner of the \\[To apply redemptions:\\] modal window$")
	public void the_close_button_x_should_be_displayed_in_the_top_right_corner_of_the_to_apply_redemptions_modal_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_close_btn_displays_in_modal_window_RedemptionsRewards_Page();
	}

	@When("^CSR clicks on close button in \\[To apply redemptions:\\] modal window$")
	public void csr_clicks_on_close_button_in_to_apply_redemptions_modal_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_close_btn_in_modal_window_in_RedemptionsRewards_Page();
	}

	@Then("^CSR is presented with the \\[Rewards & Coupons\\] page$")
	public void csr_is_presented_with_the_rewards_coupons_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_Rewards_And_Coupons_page_displayed();
	}

	@Then("^\\[Redemptions & Rewards\\] tab should be highlighted in the step indicator$")
	public void redemptions_rewards_tab_should_be_highlighted_in_the_step_indicator() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_Rewards_And_Coupons_tab_is_highlighted();
	}

	@Then("^the step header number for the \\[Redemptions & Rewards\\] page in a highlighted tab should be displayed correctly$")
	public void the_step_header_number_for_the_redemptions_rewards_page_in_a_highlighted_tab_should_be_displayed_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_Rewards_And_Coupons_page_Num_in_StepHeader_Bubble();
	}

	@Then("^Rewards and Coupons popup window should be displayed$")
	public void rewards_and_coupons_popup_window_should_be_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_RedemptionsRewards_popup_displayed();
	}

	@And("^the button \\[Continue Checkout\\] should be enabled in the footer region of the page$")
	public void the_button_continue_checkout_should_be_enabled_in_the_footer_region_of_the_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_ContinueCheckout_btn_enabled_RedemptionsRewardsPage();
	}

	@When("^CSR removes few items from cart such that it falls below \\[minimum amount\\]$")
	public void csr_removes_few_items_from_cart_such_that_it_falls_below_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_btn_X_to_delete_the_item1_ReviewCartPage();
		studentFlyerOrdersPage.CSR_clicks_on_YES_btn_in_Delete_popup_ReviewCartPage();
	}

	@And("^correct unique item id should be seen$")
	public void correct_unique_item_id_should_be_seen() throws Throwable {
		ProductDetailPage pdppage = new ProductDetailPage();
		pdppage.verify_pdp_product_uniqueitemid();
	}

	@And("^teacher sees correct item numbers in YTO page$")
	public void teacher_sees_correct_item_numbers() throws Throwable {
		ProductDetailPage pdppage = new ProductDetailPage();
		pdppage.verify_yto_product_uniqueitemid();

	}

	@And("^teacher sees correct item numbers in confirm & submit page$")
	public void teacher_sees_correct_item_numbers_in_confirm_submit_page() throws Throwable {
		ProductDetailPage pdppage = new ProductDetailPage();
		pdppage.verify_confirmSubmitpage_product_uniqueitemid();
	}

	@Then("^teacher see the items selected from Dollars to spend with unique item id in Rewards Section$")
	public void teacher_see_the_items_selected_from_dollars_to_spend_with_unique_item_id_in_rewards_section() throws Throwable {
		System.out.println("passed");
	}


	@Then("^Free pick is displayed in coupons section with unique item id in Confirm & Submit page$")
	public void free_pick_is_displayed_in_coupons_section_with_unique_item_id_in_confirm_submit_page() throws Throwable {
		System.out.println("passed");
	}

	@And("^teacher add multiple items from different teacher catalogues with unique item id number$")
	public void teacher_add_multiple_items_from_different_teacher_catalogues_with_unique_item_id_number() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		iStudentFlyerOrdersPage.placeItems_GlobalSearch_Teach_StudentItems(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
				TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));
	}


	@And("^teacher add items from student clubs with normal item number$")
	public void teacher_add_items_from_student_clubs_with_normal_item_number() throws Throwable {
		System.out.println("passed");
	}

	@And("^teacher add items from student clubs with unique item id number$")
	public void teacher_add_items_from_student_clubs_with_unique_item_id_number() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}

	@And("^teacher add items from teacher catalogues with unique item id number$")
	public void teacher_add_items_from_teacher_catalogues_with_unique_item_id_number() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}

	@And("^teacher adds student club items with unique item id number to the cart with \\[minumum amount\\]$")
	public void teacher_adds_student_club_items_with_unique_item_id_number_to_the_cart_with_minumum_amount() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}


	@When("^teacher clicks on Quick View option for any item present in Result page$")
	public void teacher_clicks_on_quick_view_option_for_any_item_present_in_result_page() throws Throwable {
		System.out.println("passed");
	}

	@Then("^teacher should be navigated to Quick View PDP page with correct itemNo$")
	public void teacher_should_be_navigated_to_quick_view_pdp_page_with_correct_itemNo() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.reviewCartPageMiniPDPDisplays();
		iStudentFlyerOrdersPage.verifyItemNo_ReviewCartpage(TestBaseProvider.getTestBase().getTestData().getString("itemName"));


	}


	@And("^Teacher adds items from Student and Teacher clubs less than \\[shipping threshold\\]$")
	public void teacher_adds_items_from_student_and_teacher_clubs_less_than_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		iStudentFlyerOrdersPage.placeItems_GlobalSearch_Teach_StudentItems(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
				TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));
	}


	@Then("^auto formatted postal code should be seen in alternative shipping address in confirm submit page$")
	public void auto_formatted_postal_code_should_be_seen_in_alternative_shipping_address_in_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_autoformatted_postalcode_Confirmsubmitpage(TestBaseProvider.getTestBase().getTestData());
	}

	@Then("^CSR can see the TGAT coupon information in Order History section$")
	public void csr_can_see_the_tgat_coupon_information_in_order_history_section() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_TGAT_coupon_info_diaplyed_in_Confirm_Submit_page();
	}

	@And("^CSR adds Student Clubs items to the cart without qualifying \\[minumum amount\\]$")
	public void csr_adds_student_clubs_items_to_the_cart_without_qualifying_minumum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@And("^CSR adds student club and teacher catalogue items to the cart meeting the minimum amount$")
	public void csr_adds_student_club_and_teacher_catalogue_items_to_the_cart_meeting_the_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_from_diff_flyers_OrderEntryPage();
	}

	@And("^CSR adds Student Clubs items to the cart to meet the minimum amount$")
	public void csr_adds_student_clubs_items_to_the_cart_to_meet_the_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@And("^CSR adds student club and teacher catalogue items to the cart$")
	public void csr_adds_student_club_and_teacher_catalogue_items_to_the_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_from_diff_flyers_OrderEntryPage();
	}

	@When("^CSR navigates to \\[Payment\\] page from \\[Redeem & Rewards\\] page$")
	public void csr_navigates_to_payment_page_from_redeem_rewards_page() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.CSR_enters_value_in_StudentIncentives_if_displayed_in_Redemptions_Rewards_Page();

		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Rewards_page();
	}

	@When("^CSR clicks on \\[Continue Checkout\\] button in Redeem and Rewards page$")
	public void csr_clicks_on_continue_checkout_button_in_redeem_and_rewards_page() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.CSR_enters_value_in_StudentIncentives_if_displayed_in_Redemptions_Rewards_Page();

		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Rewards_page();
	}

	@Then("^\\[PAYMENT\\] tab should be highlighted in the step indicator$")
	public void payment_tab_should_be_highlighted_in_the_step_indicator() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_Shipping_And_Payment_tab_is_highlighted();
	}

	@Then("^the button \\[Continue Checkout\\] should be disabled in the footer region of the page$")
	public void the_button_continue_checkout_should_be_disabled_in_the_footer_region_of_the_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_ContinueCheckout_btn_disabled_PaymentPage();
	}

	@Then("^Unique method of Payment section displays$")
	public void unique_method_of_payment_section_displays() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		shippingAndPaymentPage.validate_payment_select_dropDown_displayed_PaymentPage();
	}

	@And("^Alternate shipping address field section displays$")
	public void alternate_shipping_address_field_section_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_alternate_shipping_section_displayed_PaymentPage();
	}

	@Then("^the step header number for the \\[PAYMENT\\] page in a highlighted tab should be displayed correctly$")
	public void the_step_header_number_for_the_payment_page_in_a_highlighted_tab_should_be_displayed_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_Payment_page_Num_in_StepHeader_Bubble();
	}

	@And("^CSR deletes items from cart such that cart does not qualify for \\[minimum amount\\]$")
	public void csr_deletes_items_from_cart_such_that_cart_does_not_qualify_for_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_btn_X_to_delete_the_item1_ReviewCartPage();
		studentFlyerOrdersPage.CSR_clicks_on_YES_btn_in_Delete_popup_ReviewCartPage();
	}

	@Then("^CSR sees error message when coupon not qualified for the amount$")
	public void csr_sees_error_message_when_coupon_not_qualified_for_the_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_error_msg_displayed_when_coupon_not_qualify_ReviewCartPage();
	}

	@And("^CSR adds student club items to the cart less than the required \\[minimum amount\\]$")
	public void csr_adds_student_club_items_to_the_cart_less_than_the_required_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@Then("^Blue step script icon should be displayed next to \\[Payment\\] header in a page$")
	public void blue_step_script_icon_should_be_displayed_next_to_payment_header_in_a_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_blue_script_icon_displays_in_Payment_Page();
	}

	@When("^CSR clicks on Blue step script icon in \\[Payment\\] page$")
	public void csr_clicks_on_blue_step_script_icon_in_payment_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_blue_script_icon_in_Payment_Page();
	}

	@Then("^the modal window should be displayed with the title 'Shipping & Payment:'$")
	public void the_modal_window_should_be_displayed_with_the_title_shipping_payment() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_modal_window_text_in_Payment_Page();
	}

	@And("^the close button 'X' should be displayed in the top right corner of the \\[Shipping & Payment:\\] modal window$")
	public void the_close_button_x_should_be_displayed_in_the_top_right_corner_of_the_shipping_payment_modal_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_close_btn_displays_in_modal_window_Payment_Page();
	}

	@Then("^CSR is presented with the \\[Payment\\] page$")
	public void csr_is_presented_with_the_payment_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_Payment_page_displayed();
	}

	@When("^CSR clicks on close button in \\[Shipping & Payment:\\] modal window$")
	public void csr_clicks_on_close_button_in_shipping_payment_modal_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_close_btn_in_modal_window_in_Payment_Page();
	}

	@And("^Continue Checkout button is enabled in the footer region of the page$")
	public void continue_checkout_button_is_enabled_in_the_footer_region_of_the_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_ContinueCheckout_btn_enabled_PaymentPage();
	}

	@And("^CSR adds student club and teacher catalogue items to the cart less than the \\[Shipping threshold\\]$")
	public void csr_adds_student_club_and_teacher_catalogue_items_to_the_cart_less_than_the_shipping_threshold() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_from_diff_flyers_OrderEntryPage();
	}

	@And("^CSR adds Teacher Catalogues items to the cart to meet the minimum amount$")
	public void csr_adds_teacher_catalogues_items_to_the_cart_to_meet_the_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@And("^CSR adds Student Clubs items to the cart to meet the minimum amount for Dollars to Spend promotion and less than the minimum amount for \\[Bonus Percentage\\] coupon$")
	public void csr_adds_student_clubs_items_to_the_cart_to_meet_the_minimum_amount_for_dollars_to_spend_promotion_and_less_than_the_minimum_amount_for_bonus_percentage_coupon() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@And("^CSR adds Student Club items to the cart less than the \\[minimum amount\\]$")
	public void csr_adds_student_club_items_to_the_cart_less_than_the_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@When("^CSR clicks on \\[Continue Checkout\\] button in Payment page$")
	public void csr_clicks_on_continue_checkout_button_in_payment_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Payments_page();
	}

	@When("^CSR navigates to \\[Confirm & Submit\\] page from \\[Payment\\] page$")
	public void csr_navigates_to_confirm_submit_page_from_payment_page() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();

		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.unCheckPOP();
		PauseUtil.pause(3000);
		WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CHECKPAYMENTMETHOD);
		PauseUtil.pause(3000);

		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_PO_Number_directly_in_PaymentPage();
		studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Payments_page();
	}

	@Then("^\\[Confirm & Submit\\] page displays$")
	public void confirm_submit_page_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_Confirm_And_Submit_tab_is_highlighted();
	}

	@Then("^\\[Confirm and Submit\\] tab should be highlighted in the step indicator$")
	public void confirm_and_submit_tab_should_be_highlighted_in_the_step_indicator() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_Confirm_And_Submit_tab_is_highlighted();
	}

	@Then("^the step header number for the \\[Confirm and Submit\\] page in a highlighted tab should be displayed correctly$")
	public void the_step_header_number_for_the_confirm_and_submit_page_in_a_highlighted_tab_should_be_displayed_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_Confirm_and_Submit_page_Num_in_StepHeader_Bubble();
	}

	@Then("^Blue step script icon should be displayed next to \\[Confirm & Submit\\] header in a page$")
	public void blue_step_script_icon_should_be_displayed_next_to_confirm_submit_header_in_a_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_blue_script_icon_displays_in_ConfirmSubmit_Page();
	}

	@When("^CSR clicks on Blue step script icon in \\[Confirm & Submit\\] page$")
	public void csr_clicks_on_blue_step_script_icon_in_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_blue_script_icon_in_ConfirmSubmit_Page();
	}

	@Then("^the modal window should be displayed with the title 'Confirm & Submit:'$")
	public void the_modal_window_should_be_displayed_with_the_title_confirm_submit() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_modal_window_text_in_ConfirmSubmit_Page();
	}

	@And("^the close button 'X' should be displayed in the top right corner of the \\[Confirm & Submit:\\] modal window$")
	public void the_close_button_x_should_be_displayed_in_the_top_right_corner_of_the_confirm_submit_modal_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_close_btn_displays_in_modal_window_ConfirmSubmit_Page();
	}

	@When("^CSR clicks on close button in \\[Confirm & Submit:\\] modal window$")
	public void csr_clicks_on_close_button_in_confirm_submit_modal_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_close_btn_in_modal_window_in_ConfirmSubmit_Page();
	}

	@Then("^CSR is presented with the \\[Confirm & Submit\\] page$")
	public void csr_is_presented_with_the_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_ConfirmSubmit_page_displayed();
	}

	@When("^CSR selects Credit Card as payment$")
	public void csr_selects_credit_card_as_payment() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		PauseUtil.pause(3000);
		shippingAndPaymentPage.getDrpPaymentMethod_2().click();
		PauseUtil.pause(2000);
		shippingAndPaymentPage.selectAScreditCard().click();
	}

	@And("^CSR selects \\[Add a New Card\\]$")
	public void csr_selects_add_a_new_card() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		PauseUtil.waitForAjaxToComplete(3000);
		PauseUtil.pause(8000);
		shippingAndPaymentPage.drpSelectaCard_2().click();
		PauseUtil.pause(2000);
		shippingAndPaymentPage.selectAsAddaNewCard().click();
		PauseUtil.pause(2000);
	}

	@Then("^Saved Credit Card displays in the list$")
	public void saved_credit_card_displays_in_the_list() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		PauseUtil.pause(3000);
		shippingAndPaymentPage.drpSelectaCard_2().click();

		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_SavedCard_displayed_correct_in_PaymentPage();
	}

	@When("^CSR selects saved Credit Card$")
	public void csr_selects_saved_credit_card() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		PauseUtil.pause(3000);
		shippingAndPaymentPage.drpSelectaCard_2().click();
		PauseUtil.pause(2000);
		SCHUtils.selectOptionByVisibleText(shippingAndPaymentPage.getDrpCardType(),
				TestBaseProvider.getTestBase().getTestData().getString("SavedCard"));
		PauseUtil.waitForAjaxToComplete(5000);
	}

	@Then("^Credit Card information displays correctly$")
	public void credit_card_information_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_selected_SavedCard_info_displayed_correct_in_PaymentPage();
	}

	@Then("^PO Number text box displays$")
	public void po_number_text_box_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_PO_Number_text_box_fld_displayed_in_PaymentPage();
	}

	@And("^Scholastic mailing address section displays$")
	public void scholastic_mailing_address_section_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_mailing_address_section_displayed_Payment_page();
	}

	@Then("^Scholastic mailing address text displays correctly$")
	public void scholastic_mailing_address_text_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_mailing_address_text_displayed_correct_Payment_page();
	}

	@When("^CSR enters \\[PO Number\\]$")
	public void csr_enters_po_number() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_PO_Number_in_PaymentPage();
	}

	@When("^CSR enters \\[PO Number\\] more than 20 characters$")
	public void csr_enters_po_number_more_than_20_characters() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_PO_Number_in_PaymentPage();
	}

	@Then("^PO Number field should not accept more than 20 characters$")
	public void po_number_field_should_not_accept_more_than_20_characters() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_PO_Number_fld_not_accept_entered_val_in_PaymentPage();
	}

	@Then("^PO Number field should not accept the entered value$")
	public void po_number_field_should_not_accept_the_entered_value() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_PO_Number_fld_not_accept_entered_val_in_PaymentPage();
	}

	@Then("^\\[PO Number\\] field accepts the entered number and CSR can see it$")
	public void po_number_field_accepts_the_entered_number_and_csr_can_see_it() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_PO_Number_fld_accepts_entered_val_in_PaymentPage();
	}

	@Then("^PO Number field should accept the entered value$")
	public void po_number_field_should_accept_the_entered_value() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_PO_Number_fld_accepts_entered_val_in_PaymentPage();
	}

	@When("^CSR enters more than 20 numbers in \\[PO Number\\] field$")
	public void csr_enters_more_than_20_numbers_in_po_number_field() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_PO_Number_in_PaymentPage();
	}

	@Then("^\\[PO Number\\] field not accept the entered number$")
	public void po_number_field_not_accept_the_entered_number() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_PO_Number_fld_not_accept_entered_val_in_PaymentPage();
	}

	@And("^CSR adds Student Clubs items to the cart from the same Flyer$")
	public void csr_adds_student_clubs_items_to_the_cart_from_the_same_flyer() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@And("^CSR adds Student Clubs items to the cart from the diffent Flyers$")
	public void csr_adds_student_clubs_items_to_the_cart_from_the_diffent_flyers() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_from_diff_flyers_OrderEntryPage();
	}

	@Then("^Student Clubs items are displayed in the table of Student Clubs Order Detail section$")
	public void student_clubs_items_are_displayed_in_the_table_of_student_clubs_order_detail_section() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Student_Clubs_table_Items_displayed();
	}

	@Then("^Different Flyer items are displays separate tables in the section of Student Clubs Order Detail$")
	public void different_flyer_items_are_displays_separate_tables_in_the_section_of_student_clubs_order_detail() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Student_Clubs_items_displays_in_a_separate_tables();
	}

	@And("^each line\\-item within the Student Clubs table\\(s\\) is listed within its own separate row$")
	public void each_lineitem_within_the_student_clubs_tables_is_listed_within_its_own_separate_row() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Student_Clubs_items_displays_in_a_separate_row();
	}

	@Then("^the CONTINUE CHECKOUT button is enabled$")
	public void the_continue_checkout_button_is_enabled() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_ContinueCheckout_btn_enabled_PaymentPage();
	}

	@Then("^the CONTINUE CHECKOUT button is disabled$")
	public void the_continue_checkout_button_is_disabled() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_ContinueCheckout_btn_disabled_PaymentPage();
	}


	@Then("^TeacherCatalogues PostTax,Items,GST,PST,shipping charges and Total amount displays correctly in Confirm & Submit page$")
	public void teachercatalogues_posttaxitemsgstpstshipping_charges_and_total_amount_displays_correctly_in_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_Validation_of_Teacher_Catalogue_Total_ShippingFee_GST_PST_ConfirmSubmit_Page();
	}

	@Then("^TeacherCatalogues PostTax,Items,GST,QST,shipping charges and Total amount displays correctly in Confirm & Submit page$")
	public void teachercatalogues_posttaxitemsgstqstshipping_charges_and_total_amount_displays_correctly_in_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_Validation_of_Teacher_Catalogue_Total_ShippingFee_GST_QST_ConfirmSubmit_Page();
	}

	@Then("^TeacherCatalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page$")
	public void teachercatalogues_posttaxitemshstshipping_charges_and_total_amount_displays_correctly_in_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Teacher_Catalogues_Total_ShippingFee_HST_ConfirmSubmit_Page();
	}

	@Then("^TeacherCatalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page$")
	public void teachercatalogues_posttaxitemsgstshipping_charges_and_total_amount_displays_correctly_in_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Teacher_Catalogues_Total_ShippingFee_GST_ConfirmSubmit_Page();
	}

	@Then("^No tax displays and correct TeacherCatalogues PostTax,Items,GST,PST,shipping charges and Total amount displays in Confirm & Submit page$")
	public void no_tax_displays_and_correct_teachercatalogues_posttaxitemsgstpstshipping_charges_and_total_amount_displays_in_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_Validation_of_no_taxes_are_charged_on_Teacher_catalogues_Subtotal_Total_amount_ConfirmSubmitPage();
	}

	@Then("^No tax displays and correct TeacherCatalogues PostTax,Items,GST,QST,shipping charges and Total amount displays in Confirm & Submit page$")
	public void no_tax_displays_and_correct_teachercatalogues_posttaxitemsgstqstshipping_charges_and_total_amount_displays_in_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_Validation_of_no_taxes_are_charged_on_Teacher_catalogues_Subtotal_Total_amount_ConfirmSubmitPage();
	}

	@Then("^Student Clubs PostTax,Items,GST,PST,shipping charges and Total amount displays correctly in Confirm & Submit page$")
	public void student_clubs_posttaxitemsgstpstshipping_charges_and_total_amount_displays_correctly_in_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_Total_ShippingFee_GST_PST_ConfirmSubmit_Page();
	}

	@Then("^Student Clubs PostTax,Items,GST,QST,shipping charges and Total amount displays correctly in Confirm & Submit page$")
	public void student_clubs_posttaxitemsgstqstshipping_charges_and_total_amount_displays_correctly_in_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_Total_ShippingFee_GST_QST_ConfirmSubmit_Page();
	}

	@Then("^Student Clubs PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page$")
	public void student_clubs_posttaxitemshstshipping_charges_and_total_amount_displays_correctly_in_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_Total_ShippingFee_HST_ConfirmSubmit_Page();
	}

	@Then("^Student Clubs PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page$")
	public void student_clubs_posttaxitemsgstshipping_charges_and_total_amount_displays_correctly_in_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_Total_ShippingFee_GST_ConfirmSubmit_Page();
	}

	@Then("^No tax displays and correct Student Clubs PostTax,Items,GST,PST,shipping charges and Total amount displays in Confirm & Submit page$")
	public void no_tax_displays_and_correct_student_clubs_posttaxitemsgstpstshipping_charges_and_total_amount_displays_in_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_Validation_of_no_taxes_are_charged_on_Student_Clubs_Subtotal_Total_amount_ConfirmSubmitPage();
	}

	@Then("^No tax displays and correct Student Clubs PostTax,Items,GST,QST,shipping charges and Total amount displays in Confirm & Submit page$")
	public void no_tax_displays_and_correct_student_clubs_posttaxitemsgstqstshipping_charges_and_total_amount_displays_in_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_Validation_of_no_taxes_are_charged_on_Student_Clubs_Subtotal_Total_amount_ConfirmSubmitPage();
	}

	@Then("^Student and Teacher Catalogues PostTax,Items,GST,PST,shipping charges and Total amount displays correctly in Confirm & Submit page$")
	public void student_and_teacher_catalogues_posttaxitemsgstpstshipping_charges_and_total_amount_displays_correctly_in_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_ConfirmSubmitPage();
	}

	@Then("^Student and Teacher Catalogues PostTax,Items,GST,QST,shipping charges and Total amount displays correctly in Confirm & Submit page$")
	public void student_and_teacher_catalogues_posttaxitemsgstqstshipping_charges_and_total_amount_displays_correctly_in_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_GST_QST_ConfirmSubmitPage();
	}

	@And("^CSR adds Student and Teacher Catalogues items to the cart without qualifying minimum order$")
	public void csr_adds_student_and_teacher_catalogues_items_to_the_cart_without_qualifying_minimum_order() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Student_Teacher_cat_items_from_diff_flyers_OrderEntryPage();
	}

	@Then("^Student and Teacher Catalogues PostTax,Items,HST,shipping charges and Total amount displays correctly in Confirm & Submit page$")
	public void student_and_teacher_catalogues_posttaxitemshstshipping_charges_and_total_amount_displays_correctly_in_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_HST_ConfirmSubmitPage();
	}

	@Then("^Student and Teacher Catalogues PostTax,Items,GST,shipping charges and Total amount displays correctly in Confirm & Submit page$")
	public void student_and_teacher_catalogues_posttaxitemsgstshipping_charges_and_total_amount_displays_correctly_in_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Validation_of_Student_club_And_Teacher_Catalogues_Total_GST_ConfirmSubmitPage();
	}

	@Then("^No tax displays and correct Student and Teacher Catalogues PostTax,Items,GST,PST,shipping charges and Total amount displays in Confirm & Submit page$")
	public void no_tax_displays_and_correct_student_and_teacher_catalogues_posttaxitemsgstpstshipping_charges_and_total_amount_displays_in_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_Validation_of_no_taxes_are_charged_on_Student_and_Teacher_Clubs_Subtotal_Total_amount_ConfirmSubmitPage();
	}

	@Then("^No tax displays and correct Student and Teacher Catalogues PostTax,Items,GST,QST,shipping charges and Total amount displays in Confirm & Submit page$")
	public void no_tax_displays_and_correct_student_and_teacher_catalogues_posttaxitemsgstqstshipping_charges_and_total_amount_displays_in_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_Validation_of_no_taxes_are_charged_on_Student_and_Teacher_Clubs_Subtotal_Total_amount_ConfirmSubmitPage();
	}

	@When("^teacher updates card info$")
	public void teacher_updates_card_info() throws Throwable {
		ICheckoutPage checkoutpage = getFactory().getICheckoutPage();
		checkoutpage.enterCreditCardInfo();

	}

	@And("^teacher clicks on Expiration year$")
	public void teacher_clicks_on_expiration_year() throws Throwable {
		ICheckoutPage checkoutpage = getFactory().getICheckoutPage();
		checkoutpage.selectCreditCardExpirationYear();

	}

	@Then("^number of years in the dropdown should display from current year to current year\\+15$")
	public void number_of_years_in_the_dropdown_should_display_from_current_year_to_current_year15() throws Throwable {
		ICheckoutPage checkoutpage = getFactory().getICheckoutPage();
		checkoutpage.validatecardyrsList();

	}

	@When("^CSR searches with the \\[Account Number\\]$")
	public void csr_searches_with_the_account_number() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_the_Ac_Num_and_clicks_on_Search();
	}

	@When("^CSR searches by \\[Teacher Name\\]$")
	public void csr_searches_by_teacher_name() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_TeacheName_and_enters_field_and_clicks_on_Search_LocatePage();
	}

	@Then("^the hyperlink with the label 'Start a New Search' displays in a Search Results page$")
	public void the_hyperlink_with_the_label_start_a_new_search_displays_in_a_search_results_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Start_a_New_Search_hyperlink_displayed_in_SearchResults_page();
	}

	@When("^CSR clicks on \\[Start a New Search\\] hyperlink$")
	public void csr_clicks_on_start_a_new_search_hyperlink() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_Start_a_New_Search_hyperlink_in_SearchResults_page();
	}

	@Then("^CSR will be re\\-directed to the \\[Locate Account\\] page$")
	public void csr_will_be_redirected_to_the_locate_account_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Locate_Account_page_displayed();
	}

	@Then("^CSR sees the Locate Customer Account by: section with \\[Account Number\\] and \\[Search By\\] options to search the account$")
	public void csr_sees_the_locate_customer_account_by_section_with_account_number_and_search_by_options_to_search_the_account() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_login_section_fields_displayed_LocateAccount_Page();
	}

	@When("^CSR enters the Account Number$")
	public void csr_enters_the_account_number() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_the_Ac_Num_in_LocateAccount_page();
	}

	@When("^CSR searches by \\[School Address\\]$")
	public void csr_searches_by_school_address() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_SchoolAdrs_and_enters_Name_and_clicks_on_Search_LocatePage();
	}

	@Then("^the Account Number field should accept the entered value$")
	public void the_account_number_field_should_accept_the_entered_value() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_the_Ac_num_field_accepts_entered_val_LocateAccount_page();
	}

	@Then("^the Account Number field should not accept the entered value$")
	public void the_account_number_field_should_not_accept_the_entered_value() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_the_Ac_num_field_mot_accept_entered_val_LocateAccount_page();
	}

	@Then("^the Search button is in disabled state$")
	public void the_search_button_is_in_disabled_state() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Search_btn_disabled_in_LocateAccount_page();
	}

	@Then("^Blue step script icon should be displayed next to \\[Locate Account\\] header in a page$")
	public void blue_step_script_icon_should_be_displayed_next_to_locate_account_header_in_a_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Blue_step_script_icon_displayed_in_LocateAccount_page();
	}

	@When("^CSR clicks on Blue step script icon in \\[Locate Account\\] page$")
	public void csr_clicks_on_blue_step_script_icon_in_locate_account_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_Blue_step_script_icon_in_LocateAccount_page();
	}

	@Then("^the modal window should be displayed with the title 'Locate Account'$")
	public void the_modal_window_should_be_displayed_with_the_title_locate_account() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_modal_window_is_displayed_in_LocateAccount_page();
	}

	@And("^the close button 'X' should be displayed in the top right corner of the \\[Locate Account\\] modal window$")
	public void the_close_button_x_should_be_displayed_in_the_top_right_corner_of_the_locate_account_modal_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_close_btn_is_displayed_in_modal_window_LocateAccount_page();
	}

	@When("^CSR clicks on Blue step script icon in \\[Search Results\\] page$")
	public void csr_clicks_on_blue_step_script_icon_in_search_results_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_Blue_step_script_icon_in_SearchResults_page();
	}

	@Then("^the modal window should be displayed with the title 'Search Results'$")
	public void the_modal_window_should_be_displayed_with_the_title_search_results() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_modal_window_is_displayed_in_SearchResults_page();
	}

	@And("^the close button 'X' should be displayed in the top right corner of the \\[Search Results\\] modal window$")
	public void the_close_button_x_should_be_displayed_in_the_top_right_corner_of_the_search_results_modal_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_close_btn_is_displayed_in_modal_window_SearchResults_page();
	}

	@When("^CSR clicks on close button in \\[Locate Account\\] modal window$")
	public void csr_clicks_on_close_button_in_locate_account_modal_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_close_btn_modal_window_in_LocateAccount_page();
	}

	@Then("^CSR is presented with the \\[Locate Account\\] page$")
	public void csr_is_presented_with_the_locate_account_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Locate_Account_page_displayed();
	}

	@When("^CSR clicks on close button in \\[Search Results\\] modal window$")
	public void csr_clicks_on_close_button_in_search_results_modal_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_close_btn_modal_window_in_LocateAccount_page();
	}

	@Then("^CSR is presented with the \\[Search Results\\] page$")
	public void csr_is_presented_with_the_search_results_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Search_Results_page_displayed();
	}

	@Then("^\\[Locate Account\\] tab should be highlighted in the step indicator$")
	public void locate_account_tab_should_be_highlighted_in_the_step_indicator() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_LocateAccount_tab_is_highlighted();
	}

	@Then("^the step header number for the \\[Locate Account\\] page in a highlighted tab should be displayed correctly$")
	public void the_step_header_number_for_the_locate_account_page_in_a_highlighted_tab_should_be_displayed_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_Locate_Account_page_Num_in_StepHeader_Bubble();
	}

	@Then("^Blue step script icon should be displayed next to \\[Search Results\\] header in a page$")
	public void blue_step_script_icon_should_be_displayed_next_to_search_results_header_in_a_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Blue_step_script_icon_displayed_in_SearchResults_page();
	}

	@Then("^search results display with a hyperlink 'School Not in System' positioned at the bottom right of every tabular structure of Search Results$")
	public void search_results_display_with_a_hyperlink_school_not_in_system_positioned_at_the_bottom_right_of_every_tabular_structure_of_search_results() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_hyperlink_School_not_in_system_displayed_in_SearchResults_page();
	}

	@When("^CSR clicks on 'School Not in System'$")
	public void csr_clicks_on_school_not_in_system() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_hyperlink_School_not_in_system_in_SearchResults_page();
	}

	@Then("^CSR is presented with a modal window with the title 'Instructions for CSR'$")
	public void csr_is_presented_with_a_modal_window_with_the_title_instructions_for_csr() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_modal_window_is_displayed_for_SchoolNotInSystem_SearchResults_page();
	}

	@And("^a paragraph of text displays$")
	public void a_paragraph_of_text_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_paragraph_text_is_displayed_in_SchoolNotInSystem_modalWindow_SearchResults_page();
	}

	@And("^an icon X in the top right of the window$")
	public void an_icon_x_in_the_top_right_of_the_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_close_btn_is_displayed_in_modal_window_of_SchoolNotInSystem_SearchResults_page();
	}

	@When("^CSR clicks on Close button$")
	public void csr_clicks_on_close_button() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_close_btn_modal_window_in_LocateAccount_page();
	}

	@Then("^CSR will be re\\-directed to the 'Search Form' on the Locate Account page$")
	public void csr_will_be_redirected_to_the_search_form_on_the_locate_account_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Search_Results_page_displayed();
	}

	@Then("^the Customer Account Hold Status section displays$")
	public void the_customer_account_hold_status_section_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Account_Hold_Section_displayed_in_Payment_page();
	}

	@And("^the header label displays as 'ACCOUNT HOLD STATUS:'$")
	public void the_header_label_displays_as_account_hold_status() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_hdr_text_Account_Hold_Section_in_Payment_page();
	}

	@And("^the radio button displays with the label \\[Override order and place on 'Open' Status\\.\\]$")
	public void the_radio_button_displays_with_the_label_override_order_and_place_on_open_status() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_radio_btn1_with_text_for_Account_Hold_Section_in_Payment_page();
	}

	@And("^another radio button displays with the label \\[Submit order with 'Hold' Status\\.\\]$")
	public void another_radio_button_displays_with_the_label_submit_order_with_hold_status() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_radio_btn2_with_text_for_Account_Hold_Section_in_Payment_page();
	}

	@Then("^the radio buttons should not be selected by default in a Account Hold Status section$")
	public void the_radio_buttons_should_not_be_selected_by_default_in_a_account_hold_status_section() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_radio_btns_are_selected_in_Account_Hold_Section_in_Payment_page();
	}

	@And("^teacher adds items to cart such that the cart is eligible for free shipping$")
	public void teacher_adds_items_to_cart_such_that_the_cart_is_eligible_for_free_shipping() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}

	@When("^CSR clicks on Province drop down list$")
	public void csr_clicks_on_province_drop_down_list() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_Province_dropDown_list_alternateShipping_section_Payment_page();
	}

	@Then("^the province drop down list displays 13 Canadian provinces$")
	public void the_province_drop_down_list_displays_13_canadian_provinces() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_the_Province_list_count_alternateShipping_section_Payment_page();
	}

	@And("^provinces list displays in ascending order$")
	public void provinces_list_displays_in_ascending_order() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_the_Province_list_in_ascending_order_alternateShipping_section_Payment_page();
	}

	@When("^CSR clicks on Province drop down list in Billing Info section$")
	public void csr_clicks_on_province_drop_down_list_in_billing_info_section() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_Province_dropDown_list_BillingInfo_section_Payment_page();
	}

	@Then("^the province drop down list displays 13 Canadian provinces in Billing Info section$")
	public void the_province_drop_down_list_displays_13_canadian_provinces_in_billing_info_section() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_the_Province_list_count_BillingInfo_section_Payment_page();
	}

	@And("^provinces list displays in ascending order in Billing Info section$")
	public void provinces_list_displays_in_ascending_order_in_billing_info_section() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_the_Province_list_in_ascending_order_BillingInfo_section_Payment_page();
	}

	@And("^CSR clicks on Continue Checkout in Payment page$")
	public void csr_clicks_on_continue_checkout_in_payment_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Payments_page();
	}

	@And("^CSR navigates to \\[Payment\\] page$")
	public void csr_navigates_to_payment_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_navigates_from_Submit_page_to_Payment_page();
	}

	@Then("^there is no Saved Credit Card displayed in the list$")
	public void there_is_no_saved_credit_card_displayed_in_the_list() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_credit_card_lst_count_Payment_page();
	}

	@And("^CSR selects Teacher Name from Search by dropdown$")
	public void csr_selects_teacher_name_from_search_by_dropdown() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_TeacheName_from_dropDown_LocatePage();
	}

	@And("^CSR enters at least 1 character in First Name$")
	public void csr_enters_at_least_1_character_in_first_name() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Teacher_Fname_LocatePage();
	}

	@And("^CSR enters at least 1 character in Last Name$")
	public void csr_enters_at_least_1_character_in_last_name() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Teacher_Lname_LocatePage();
	}

	@When("^clicks on Search$")
	public void clicks_on_search() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_Search_btn_LocatePage();
	}

	@Then("^the first name that was entered should have an occurrence in the first name of each row under Teacher Name column$")
	public void the_first_name_that_was_entered_should_have_an_occurrence_in_the_first_name_of_each_row_under_teacher_name_column() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_Fname_occurence_in_TeacherName_SearchResults_LocatePage();
	}

	@Then("^the last name that was entered should have an occurrence in the last name of each row under Teacher Name column$")
	public void the_last_name_that_was_entered_should_have_an_occurrence_in_the_last_name_of_each_row_under_teacher_name_column() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_Lname_occurence_in_TeacherName_SearchResults_LocatePage();
	}

	@And("^CSR selects School Address from Search by dropdown$")
	public void csr_selects_school_address_from_search_by_dropdown() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_SchoolAddress_from_dropDown_LocatePage();
	}

	@When("^CSR enters School Name more than 70 characters$")
	public void csr_enters_school_name_more_than_70_characters() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_SchoolName_in_LocatePage();
	}

	@Then("^the School Name does not accept more than 70 characters$")
	public void the_school_name_does_not_accept_more_than_70_characters() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_SchoolName_fld_not_accept_morethan_70_in_LocatePage();
	}

	@Then("^CSR is directed to the 'Search Results' page for the specific Teacher Account$")
	public void csr_is_directed_to_the_search_results_page_for_the_specific_teacher_account() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_correct_Ac_num_displayed_in_SearchResults_Page();
	}

	@Then("^the page 'Teacher Listing Search Results' appears$")
	public void the_page_teacher_listing_search_results_appears() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_correct_SearchResults_Page_displayed();
	}

	@When("^CSR tries to enter \\[Account Number\\] which does not exist$")
	public void csr_tries_to_enter_account_number_which_does_not_exist() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_the_Ac_Num_and_clicks_on_Search();
	}

	@Then("^error callout message 'The Account number is invalid' displays$")
	public void error_callout_message_the_account_number_is_invalid_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Error_popUp_displayed_Locate_Page();
	}

	@And("^Search button is disabled by default in Locate Account Page$")
	public void search_button_is_disabled_by_default_in_locate_account_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Search_btn_disabled_in_LocateAccount_page();
	}

	@When("^CSR tries to enter 1 character in \\[Account Number\\]$")
	public void csr_tries_to_enter_1_character_in_account_number() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_the_Ac_Num_in_Locate_Account_page();
	}

	@Then("^the Search button is in enabled state$")
	public void the_search_button_is_in_enabled_state() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Search_btn_enabled_in_LocateAccount_page();
	}

	@When("^CSR enters First Name more than 50 characters$")
	public void csr_enters_first_name_more_than_50_characters() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Teacher_Fname_LocatePage();
	}

	@Then("^the First Name does not accept more than 50 characters$")
	public void the_first_name_does_not_accept_more_than_50_characters() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_Teacher_Fname_not_accept_morethan_50_LocatePage();
	}

	@When("^CSR enters Last Name more than 50 characters$")
	public void csr_enters_last_name_more_than_50_characters() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Teacher_Lname_LocatePage();
	}

	@Then("^the Last Name does not accept more than 50 characters$")
	public void the_last_name_does_not_accept_more_than_50_characters() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_Teacher_Lname_not_accept_morethan_50_LocatePage();
	}

	@And("^CSR enters School Name no more than 70 characters that will give no result$")
	public void csr_enters_school_name_no_more_than_70_characters_that_will_give_no_result() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_SchoolName_in_LocatePage();
	}

	@And("^CSR enters School Name no more than 70 characters$")
	public void csr_enters_school_name_no_more_than_70_characters() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_SchoolName_in_LocatePage();
	}

	@And("^CSR selects 'Canada' from the 'Country' drop\\-down box$")
	public void csr_selects_canada_from_the_country_dropdown_box() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_country_in_LocatePage();
	}

	@And("^CSR enters valid Postal Code in the postal code text\\-box that will give no result$")
	public void csr_enters_valid_postal_code_in_the_postal_code_textbox_that_will_give_no_result() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_PostalCode_in_LocatePage();
	}

	@And("^CSR enters valid Postal Code in the postal code text\\-box$")
	public void csr_enters_valid_postal_code_in_the_postal_code_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_PostalCode_in_LocatePage();
	}

	@And("^CSR selects a Province from the province drop\\-down box$")
	public void csr_selects_a_province_from_the_province_dropdown_box() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_province_in_LocatePage();
	}

	@And("^CSR selects a City from the city drop\\-down box$")
	public void csr_selects_a_city_from_the_city_dropdown_box() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_SchoolCity_in_LocatePage();
	}

	@Then("^result paragraph 'We found 0 results for \\[School Name\\], \\[City\\], \\[Province\\], \\[Postal Code\\]' is shown under the page$")
	public void result_paragraph_we_found_0_results_for_school_name_city_province_postal_code_is_shown_under_the_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_SchoolAddress_results_search_results_page();
	}

	@Then("^school name, city and province in the result paragraph match \\[School Name\\], \\[City\\] and \\[Province\\] from the search form$")
	public void school_name_city_and_province_in_the_result_paragraph_match_school_name_city_and_province_from_the_search_form() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_SchoolAddress_shows_correct_search_results_page();
	}

	@Then("^school name, city, province and postal code in the result paragraph match \\[School Name\\], \\[City\\], \\[Province\\] and \\[Postal Code\\] from the search form$")
	public void school_name_city_province_and_postal_code_in_the_result_paragraph_match_school_name_city_province_and_postal_code_from_the_search_form() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_SchoolAddress_shows_correct_search_results_page_2();
	}

	@Then("^result paragraph 'We found 0 results for \\[Last Name\\] \\[First Name\\]' is shown under the page header$")
	public void result_paragraph_we_found_0_results_for_last_name_first_name_is_shown_under_the_page_header() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_TeacherName_results_search_results_page();
	}

	@Then("^result paragraph 'We found 0 results for \\[City\\], \\[Province\\], \\[Postal Code\\]' is shown under the page$")
	public void result_paragraph_we_found_0_results_for_city_province_postal_code_is_shown_under_the_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_SchoolAddress_results_without_schoolName_search_results_page();
	}

	@Then("^result paragraph 'We found 0 results for \\[City\\], \\[Province\\]' is shown under the page$")
	public void result_paragraph_we_found_0_results_for_city_province_is_shown_under_the_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_SchoolAddress_results_without_schoolName_PostalCode_search_results_page();
	}

	@And("^CSR enters at least 1 character in First Name that will give no result$")
	public void csr_enters_at_least_1_character_in_first_name_that_will_give_no_result() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Teacher_Fname_LocatePage();
	}

	@And("^CSR enters at least 1 character in Last Name that will give no result$")
	public void csr_enters_at_least_1_character_in_last_name_that_will_give_no_result() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Teacher_Lname_LocatePage();
	}

	@When("^CSR selects the first school name under the School Name column$")
	public void csr_selects_the_first_school_name_under_the_school_name_column() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_first_schoolName_under_search_results_page();
	}

	@Then("^hyperlink 'Back to School Listing' is present above the Teacher Listing Search results table and to the right of 'Start a New Search' hyperlink$")
	public void hyperlink_back_to_school_listing_is_present_above_the_teacher_listing_search_results_table_and_to_the_right_of_start_a_new_search_hyperlink() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_New_Search_and_School_listing_hyperlinks_displayed_in_search_results_page();
	}

	@Then("^hyperlink 'Back to School Listing' is not present above the Teacher Listing Search results table$")
	public void hyperlink_back_to_school_listing_is_not_present_above_the_teacher_listing_search_results_table() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Back_to_School_listing_hyperlink_not_display_in_search_results_page();
	}

	@When("^CSR clicks on 'Back to School Listing' hyperlink$")
	public void csr_clicks_on_back_to_school_listing_hyperlink() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_Back_to_School_listing_hyperlink_in_search_results_page();
		String exp_val=studentFlyerOrdersPage.CSR_gets_the_value_of_search_results_page();
		Total_Owing_Amount_act_1.setSearch_results_value(exp_val);
	}

	@Then("^CSR sees the same school listing results as shown previously$")
	public void csr_sees_the_same_school_listing_results_as_shown_previously() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_results_value_displayed_correct_come_form_BackToSchool_in_search_results_page(Total_Owing_Amount_act_1.getSearch_results_value());
	}

	@When("^CSR selects 'Select a Card' drop\\-down$")
	public void csr_selects_select_a_card_dropdown() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(3000);
		shippingAndPaymentPage.drpSelectaCard_2().click();
		PauseUtil.pause(2000);
	}

	@Then("^CSR sees the label 'Add a New Card' under the 'Select a Card' drop\\-down$")
	public void csr_sees_the_label_add_a_new_card_under_the_select_a_card_dropdown() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Add_a_Card_text_in_dropDown_in_PaymentPage();
	}

	@And("^CSR sees all saved cards under the 'Add a New Card' label$")
	public void csr_sees_all_saved_cards_under_the_add_a_new_card_label() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_SavedCard_displayed_correct_in_PaymentPage();
	}

	@When("^CSR selects the first school name under the School Name column and get the value$")
	public void csr_selects_the_first_school_name_under_the_school_name_column_and_get_the_value() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		String exp_text=studentFlyerOrdersPage.CSR_selects_first_schoolName_and_get_it_under_search_results_page();
		Total_Owing_Amount_act_1.set_SchoolName_in_Search_results(exp_text);
	}

	@Then("^the school value in the result paragraph matches the school clicked from the school listing page$")
	public void the_school_value_in_the_result_paragraph_matches_the_school_clicked_from_the_school_listing_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_School_Name_displays_correctly_2ndPage_search_results_page(Total_Owing_Amount_act_1.get_SchoolName_in_Search_results());
	}

	@And("^CSR selects the first school address under the School Address column$")
	public void csr_selects_the_first_school_address_under_the_school_address_column() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		String exp_text=studentFlyerOrdersPage.CSR_selects_first_schoolAddress_and_get_it_under_search_results_page();
		Total_Owing_Amount_act_1.set_SchoolName_in_Search_results(exp_text);
	}

	@Then("^the school address value in the result paragraph matches the school address clicked from the school listing page$")
	public void the_school_address_value_in_the_result_paragraph_matches_the_school_address_clicked_from_the_school_listing_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_School_Name_displays_correctly_2ndPage_search_results_page(Total_Owing_Amount_act_1.get_SchoolName_in_Search_results());
	}

	@Then("^the School name that was entered should have an occurrence in the complete name of each row under School Name column$")
	public void the_school_name_that_was_entered_should_have_an_occurrence_in_the_complete_name_of_each_row_under_school_name_column() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_SName_occurence_in_SchoolName_SearchResults_LocatePage();
	}

	@And("^'ACCOUNT HOLD STATUS' is returned$")
	public void account_hold_status_is_returned() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Account_Hold_Section_displayed_in_Payment_page();
	}

	@When("^CSR selects a payment method$")
	public void csr_selects_a_payment_method() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();

		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.unCheckPOP();
		PauseUtil.pause(3000);
		WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CHECKPAYMENTMETHOD);
		PauseUtil.pause(3000);

	}

	@But("^does not select one of the radio buttons for hold status$")
	public void does_not_select_one_of_the_radio_buttons_for_hold_status() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_radio_btns_are_selected_in_Account_Hold_Section_in_Payment_page();
	}

	@Then("^Continue Checkout button is not enabled$")
	public void continue_checkout_button_is_not_enabled() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_ContinueCheckout_btn_disabled_PaymentPage();
	}

	@When("^CSR selects one of the radio buttons for hold status$")
	public void csr_selects_one_of_the_radio_buttons_for_hold_status() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_1st_radio_btn_in_Account_Hold_Section_in_Payment_page();
	}

	@And("^CSR clicks on Continue Checkout$")
	public void csr_clicks_on_continue_checkout() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Payments_page();
	}

	@Then("^'ACCOUNT HOLD STATUS' is NOT returned$")
	public void account_hold_status_is_not_returned() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Account_Hold_Section_and_radio_btns_not_display_in_Payment_page();
	}

	@And("^radio buttons for hold status does not display$")
	public void radio_buttons_for_hold_status_does_not_display() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Account_Hold_Section_and_radio_btns_not_display_in_Payment_page();
	}

	@And("^Continue Checkout button is enabled$")
	public void continue_checkout_button_is_enabled() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_ContinueCheckout_btn_enabled_PaymentPage();
	}

	@And("^CSR selects 'US' from the 'Country' drop\\-down box$")
	public void csr_selects_us_from_the_country_dropdown_box() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_country_in_LocatePage();
	}

	@When("^CSR enters more than 10 integers in 'Zip Code' textbox$")
	public void csr_enters_more_than_10_integers_in_zip_code_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_US_PostalCode_in_LocatePage();
	}

	@Then("^Zip Code does not accept more than 10 integers$")
	public void zip_code_does_not_accept_more_than_10_integers() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_US_PostalCode_fld_not_accept_morethan_10_in_LocatePage();
	}

	@And("^CSR enters valid Zip Code$")
	public void csr_enters_valid_zip_code() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_US_PostalCode_in_LocatePage();
	}

	@And("^CSR enters invalid Zip Code$")
	public void csr_enters_invalid_zip_code() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_US_PostalCode_in_LocatePage();
	}

	@And("^CSR clicks outside the Zip Code textbox$")
	public void csr_clicks_outside_the_zip_code_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_TabOut_on_US_PostalCode_in_LocatePage();
	}

	@Then("^Search button is enabled in Locate Account page$")
	public void search_button_is_enabled_in_locate_account_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Search_btn_enabled_in_LocateAccount_page();
	}

	@Then("^error message is shown above the Zip Code textbox$")
	public void error_message_is_shown_above_the_zip_code_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_popup_is_displayed_PostalCode_in_LocatePage();
	}

	@Then("^CSR sees the 'School Listing Search Results' page$")
	public void csr_sees_the_school_listing_search_results_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Search_Results_page_displayed();
	}

	@And("^CSR selects the State drop\\-down$")
	public void csr_selects_the_state_dropdown() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_US_State_dropdown_list_in_LocatePage();
	}

	@Then("^CSR sees all 50 states of US in alphabetical order$")
	public void csr_sees_all_50_states_of_us_in_alphabetical_order() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_the_US_State_list_in_ascending_order_Locate_Account_page();
	}

	@Then("^CSR sees error message above 'PO Number' textbox$")
	public void csr_sees_error_message_above_po_number_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_popup_is_displayed_PO_num_fld_Payment_page();
	}

	@And("^CSR sees message 'A PO Number must be provided'$")
	public void csr_sees_message_a_po_number_must_be_provided() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_popup_text_PO_num_fld_Payment_page();
	}

	@And("^CSR enters valid PO Number in Purchase Order textbox$")
	public void csr_enters_valid_po_number_in_purchase_order_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_PO_Number_in_PaymentPage();
	}

	@Then("^CSR sees error message above 'Board\\/ School Number' textbox$")
	public void csr_sees_error_message_above_board_school_number_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_popup_is_displayed_Board_SchoolNum_fld_Payment_page();
	}

	@And("^CSR sees message 'A Board\\/School Number must be provided'$")
	public void csr_sees_message_a_boardschool_number_must_be_provided() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_popup_text_Board_SchoolNum_fld_Payment_page();
	}

	@And("^CSR enters valid Board\\/ School Number in 'Board\\/ School Number' textbox$")
	public void csr_enters_valid_board_school_number_in_board_school_number_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_text_Board_SchoolNum_in_Payment_page();
	}

	@Then("^CSR sees error message above 'Account Number' textbox$")
	public void csr_sees_error_message_above_account_number_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		//studentFlyerOrdersPage.CSR_enters_text_Board_SchoolNum_in_Payment_page();
	}

	@And("^CSR sees message 'An Account Number must be provided e\\.g\\. 99'$")
	public void csr_sees_message_an_account_number_must_be_provided_eg_99() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		//studentFlyerOrdersPage.CSR_enters_text_Board_SchoolNum_in_Payment_page();
	}

	@When("^CSR clicks 'Cancel Order' hyperlink$")
	public void csr_clicks_cancel_order_hyperlink() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_CanceOrder_link_in_Payment_page();
	}

	@And("^CSR selects YES from callout$")
	public void csr_selects_yes_from_callout() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_YES_btn_for_CancelOrder_in_Payment_page();
	}

	@And("^CSR selects NO from callout$")
	public void csr_selects_no_from_callout() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_NO_btn_for_CancelOrder_in_Payment_page();
	}

	@Then("^CSR sees 'Order Source'page$")
	public void csr_sees_order_sourcepage() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Order_Source_page_is_displayed();
	}

	@And("^CSR navigates to \\[Confirm & Submit\\] page$")
	public void csr_navigates_to_confirm_submit_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Payments_page();
	}

	@Then("^CSR do not see Cancel Order callout$")
	public void csr_do_not_see_cancel_order_callout() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_cancel_order_callout_not_display();
	}

	@And("^CSR waits 3 seconds$")
	public void csr_waits_3_seconds() throws Throwable {
		PauseUtil.pause(3000);
	}

	@And("^CSR searches with the \\[Other Account Number\\]$")
	public void csr_searches_with_the_other_account_number() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_the_Ac_Num2_and_clicks_on_Search();
	}

	@And("^CSR navigates to \\[Locate Account\\] page$")
	public void csr_navigates_to_locate_account_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_Locate_account_tab();
	}

	@Then("^CSR does not see the pending items on Order Entry page of \\[Other Account Number\\]$")
	public void csr_does_not_see_the_pending_items_on_order_entry_page_of_other_account_number() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_item_nums_Qty_not_display_in_OrderEntryPage();
	}

	@Then("^CSR does not see the items purchased with \\[Account Number\\] in \\[Other Account Number\\]$")
	public void csr_does_not_see_the_items_purchased_with_account_number_in_other_account_number() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_item_nums_Qty_not_display_in_OrderEntryPage();
	}

	@Then("^CSR does not see the items purchased in Order Entry page$")
	public void csr_does_not_see_the_items_purchased_in_order_entry_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_item_nums_Qty_not_display_in_OrderEntryPage();
	}

	@Then("^pending items on Teacher's website is not present on Order Entry page$")
	public void pending_items_on_teachers_website_is_not_present_on_order_entry_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_item_nums_Qty_not_display_in_OrderEntryPage();
	}

	@And("^CSR navigates to Verify Account Page from Search Results page$")
	public void csr_navigates_to_verify_account_page_from_search_results_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_1st_teacher_name_in_Search_Results();
	}

	@Then("^pending items on CSR order entry page is not present in the cart$")
	public void pending_items_on_csr_order_entry_page_is_not_present_in_the_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_items_not_display_in_ReviewCart_page();
	}

	@When("^CSR navigates to Review Cart page by clicking on Review cart Tab$")
	public void csr_navigates_to_review_cart_page_by_clicking_on_review_cart_tab() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_ReviewCart_tab();
	}

	@And("^CSR selects the order type as \\[Mail Order\\]$")
	public void csr_selects_the_order_type_as_mail_order() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_orderType_as_MailOrder();
	}

	@And("^CSR selects the order type as \\[Fax Order\\]$")
	public void csr_selects_the_order_type_as_fax_order() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_orderType_as_FaxOrder();
	}

	@When("^CSR removes all items in cart and select 'Yes' on the last item to delete$")
	public void csr_removes_all_items_in_cart_and_select_yes_on_the_last_item_to_delete() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_delete_all_items_in_ReviewCart_page();
	}

	@And("^CSR sees empty forms on Order Entry page$")
	public void csr_sees_empty_forms_on_order_entry_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_item_nums_Qty_not_display_in_OrderEntryPage();
	}

	@Then("^CSR is redirected to Order Entry page$")
	public void csr_is_redirected_to_order_entry_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_Order_Entry_Page_is_displayed();
	}

	@When("^CSR removes all items in cart and set the item quantity to 0 for last item$")
	public void csr_removes_all_items_in_cart_and_set_the_item_quantity_to_0_for_last_item() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.user_deletes_1st_two_items_and_enter_0_for_3rd_in_reviewCart();
	}

	@And("^select 'Yes' on the last item to delete$")
	public void select_yes_on_the_last_item_to_delete() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_YES_btn_in_Delete_popup_ReviewCartPage();
	}

	@When("^CSR enters more than 7 characters in 'Postal Code' textbox$")
	public void csr_enters_more_than_7_characters_in_postal_code_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_PostalCode_in_LocatePage();
	}

	@Then("^Postal Code does not accept more than 7 characters$")
	public void postal_code_does_not_accept_more_than_7_characters() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_PostalCode_fld_not_accept_morethan_7_chars_in_LocatePage();
	}

	@When("^CSR clicks outside the Postal Code textbox$")
	public void csr_clicks_outside_the_postal_code_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_TabOut_on_Canada_PostalCode_in_LocatePage();
	}

	@And("^CSR enters valid Postal Code$")
	public void csr_enters_valid_postal_code() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_PostalCode_in_LocatePage();
	}

	@And("^CSR enters invalid Postal Code$")
	public void csr_enters_invalid_postal_code() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_PostalCode_in_LocatePage();
	}

	@Then("^error message is shown above the Postal Code textbox$")
	public void error_message_is_shown_above_the_postal_code_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_error_msg_for_PostalCode_fld_OrderEntryPage();
	}

	@Then("^CSR sees all 13 provinces of Canada in alphabetical order$")
	public void csr_sees_all_13_provinces_of_canada_in_alphabetical_order() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_Canada_Province_dropdown_list_in_LocatePage();
	}

	@And("^CSR selects the Province drop\\-down$")
	public void csr_selects_the_province_dropdown() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_the_Canada_Province_list_in_ascending_order_Locate_Account_page();
	}

	//############################################# Story 134 steps #############################################
	@Then("^Purchase Order textbox accepts the input$")
	public void purchase_Order_textbox_accepts_the_input() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Purchase_Order_Number_fld_accepts_entered_val_in_PaymentPage();
	}

	@When("^CSR enters invalid characters in Purchase Order textbox$")
	public void csr_enters_invalid_characters_in_Purchase_Order_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_invalid_Purchase_Order_Number_in_PaymentPage();
	}

	@Then("^Purchase Order textbox rejects the input$")
	public void purchase_Order_textbox_rejects_the_input() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Purchase_Order_Number_fld_rejects_entered_val_in_PaymentPage();
	}

	@When("^CSR enters valid entry in Account Number textbox$")
	public void csr_enters_valid_entry_in_Account_Number_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_AC_Number_in_PaymentPage();
	}

	@Then("^Account Number textbox accepts the input$")
	public void account_Number_textbox_accepts_the_input() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Account_Number_fld_accepts_entered_val_in_PaymentPage();
	}

	@When("^CSR enters invalid entry in Account Number textbox$")
	public void csr_enters_invalid_entry_in_Account_Number_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_AC_Number_in_PaymentPage();
	}

	@Then("^Account Number textbox rejects the input$")
	public void account_Number_textbox_rejects_the_input() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Account_Number_fld_rejects_entered_val_in_PaymentPage();
	}

	@When("^CSR selects a radio button$")
	public void csr_selects_a_radio_button() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_Purchase_Order_radio_btn_in_PaymentPage();
	}

	@Then("^the other radio buttons should remain unselected$")
	public void the_other_radio_buttons_should_remain_unselected() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_other_radio_btns_not_selected_in_PaymentPage();
	}

	@Then("^CSR sees radio button labelled ‘PUB \\(Backorders Allowed\\)’ selected$")
	public void csr_sees_radio_button_labelled_PUB_Backorders_Allowed_selected() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_default_radio_btn_is_PUB_in_PaymentPage();
	}

	@When("^CSR selects Purchase Order textbox$")
	public void csr_selects_Purchase_Order_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_Purchase_Order_textbox_in_PaymentPage();
	}

	@When("^CSR clicks outside the Purchase Order textbox$")
	public void csr_clicks_outside_the_Purchase_Order_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_outside_Purchase_Order_textbox_in_PaymentPage();
	}

	@Then("^CSR sees error message above Purchase Order textbox$")
	public void csr_sees_error_message_above_Purchase_Order_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_sees_Purchase_Order_Error_Message_in_PaymentPage();
	}

	@When("^CSR selects Account Number textbox$")
	public void csr_selects_Account_Number_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_Account_Number_textbox_in_PaymentPage();
	}

	@When("^CSR clicks outside the Account Number textbox$")
	public void csr_clicks_outside_the_Account_Number_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_outside_Account_Number_textbox_in_PaymentPage();
	}

	@Then("^CSR sees error message above Account Number textbox$")
	public void csr_sees_error_message_above_Account_Number_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_sees_Account_Number_Error_Message_in_PaymentPage();
	}

	@When("^CSR selects Board/School Number textbox$")
	public void csr_selects_Board_School_Number_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_Board_School_Number_textbox_in_PaymentPage();
	}

	@When("^CSR clicks outside the Board/School Number textbox$")
	public void csr_clicks_outside_the_Board_School_Number_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_outside_Board_School_Number_textbox_in_PaymentPage();
	}

	@Then("^CSR sees error message above Board/School Number textbox$")
	public void csr_sees_error_message_above_Board_School_Number_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_sees_Board_School_Number_Error_Message_in_PaymentPage();
	}

	@When("^CSR enters valid entry in Board/School Number textbox$")
	public void csr_enters_valid_entry_in_Board_School_Number_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Board_School_Number_in_PaymentPage();
	}

	@Then("^Board/School Number textbox accepts the input$")
	public void board_School_Number_textbox_accepts_the_input() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Board_School_Number_fld_accepts_entered_val_in_PaymentPage();
	}

	@When("^CSR enters invalid entry in Board/School Number textbox$")
	public void csr_enters_invalid_entry_in_Board_School_Number_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Board_School_Number_in_PaymentPage();
	}

	@Then("^Board/School Number textbox rejects the input$")
	public void board_School_Number_textbox_rejects_the_input() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Board_School_Number_fld_rejects_entered_val_in_PaymentPage();
	}



	@When("^parent clicks on Continue Checkout$")
	public void parent_clicks_on_continue_checkout() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();

		WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
		SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);


	}


	@And("^parent navigates back to Shipping & Payment page$")
	public void parent_navigates_back_to_shipping_payment_page() throws Throwable {
		PCOD_SubmitYourOrderPage submitYourOrderPage = new PCOD_SubmitYourOrderPage();
		submitYourOrderPage.clickheaderpayment();


	}

	@Then("^the 'Province' drop\\-down has the 13 provinces in Canada$")
	public void the_province_dropdown_has_the_13_provinces_in_canada() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_Province_dropDown_list_BillingInfo_section_Payment_page();
		studentFlyerOrdersPage.CSR_validate_the_Province_list_count_BillingInfo_section_Payment_page();
	}

	@And("^the placeholder for the State drop\\-down displays 'Select Province\\/State'$")
	public void the_placeholder_for_the_state_dropdown_displays_select_provincestate() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_placeholder_for_US_State_dropdown_list_in_Payment_Page();
	}

	@And("^the 'States' drop\\-down has the 50 states in alphabetical order$")
	public void the_states_dropdown_has_the_50_states_in_alphabetical_order() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_US_State_dropdown_list_in_Payment_Page();
		studentFlyerOrdersPage.CSR_validate_the_US_State_list_in_ascending_order_Payment_page();
	}

	@Then("^Continue Checkout button is disabled in Payment page$")
	public void continue_checkout_button_is_disabled_in_Payment_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_ContinueCheckout_btn_disabled_PaymentPage();
	}

	@And("^CSR enters valid Account Number in Account textbox$")
	public void csr_enters_valid_account_number_in_account_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_AC_Number_in_PaymentPage();
	}

	@Then("^CSR sees error message above Account Number textbox with the text 'Please provide a unique number with the Purchase Order'$")
	public void csr_sees_error_message_above_account_number_textbox_with_the_text_please_provide_a_unique_number_with_the_purchase_order() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_sees_Account_Number_Error_Message_in_PaymentPage();
	}

	@When("^CSR clicks on Teacher's Name in Search Results$")
	public void csr_clicks_on_teachers_name_in_search_results() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_1st_teacher_name_in_Search_Results();
	}

	@Then("^\\[Verify Account\\] tab should be highlighted in the step indicator$")
	public void verify_account_tab_should_be_highlighted_in_the_step_indicator() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_VerifyAccount_tab_is_highlighted();
	}

	@Then("^the step header number for the \\[Verify Account\\] page in a highlighted tab should be displayed correctly$")
	public void the_step_header_number_for_the_verify_account_page_in_a_highlighted_tab_should_be_displayed_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_Verify_Account_page_Num_in_StepHeader_Bubble();
	}

	@Then("^Blue step script icon should be displayed next to \\[verify Account\\] header in a page$")
	public void blue_step_script_icon_should_be_displayed_next_to_verify_account_header_in_a_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Blue_step_script_icon_displayed_in_VerifyAccount_page();
	}

	@When("^CSR clicks on Blue step script icon in \\[Verify Account\\] page$")
	public void csr_clicks_on_blue_step_script_icon_in_verify_account_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_Blue_step_script_icon_in_VerifyAccount_page();
	}

	@Then("^the modal window should be displayed with the title 'Verify Account'$")
	public void the_modal_window_should_be_displayed_with_the_title_verify_account() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_modal_window_is_displayed_in_VerifyAccount_page();
	}

	@And("^the close button 'X' should be displayed in the top right corner of the \\[Verify Account\\] modal window$")
	public void the_close_button_x_should_be_displayed_in_the_top_right_corner_of_the_verify_account_modal_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_close_btn_is_displayed_in_modal_window_VerifyAccount_page();
	}

	@When("^CSR clicks on close button in \\[Verify Account\\] modal window$")
	public void csr_clicks_on_close_button_in_verify_account_modal_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_close_btn_modal_window_in_VerifyAccount_page();
	}

	@Then("^CSR is presented with the \\[Verify Account\\] page$")
	public void csr_is_presented_with_the_verify_account_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_VerifyAccount_page_displayed();
	}

	@Then("^First time teacher modal does not show up$")
	public void first_time_teacher_modal_does_not_show_up() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_modal_window_for_1st_time_teacher_not_display_in_VerifyAccount_page();
	}

	@When("^CSR clicks on Close icon 'X' on the top right of the window$")
	public void csr_clicks_on_close_icon_x_on_the_top_right_of_the_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_close_btn_modal_window_1st_time_teacher_in_VerifyAccount_page();
	}

	@Then("^Verify Account page displays$")
	public void verify_account_page_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_VerifyAccount_page_displayed();
	}

	@Then("^a modal window displays with title 'Instructions for CSR'$")
	public void a_modal_window_displays_with_title_instructions_for_csr() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_modal_window_and_text_for_1st_teacher_is_displayed_in_VerifyAccount_page();
	}

	@And("^a 'X' icon positioned to the top\\-right of the window displays$")
	public void a_x_icon_positioned_to_the_topright_of_the_window_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_close_btn_is_displayed_in_modal_window_1st_teacher_VerifyAccount_page();
	}

	@And("^a paragraph of text within the main content area which states 'Welcome to Reading Club!'$")
	public void a_paragraph_of_text_within_the_main_content_area_which_states_welcome_to_reading_club() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_content_text_for_1st_time_teacher_in_modal_window_VerifyAccount_page();
	}

	@Then("^the CSR is presented with the header 'Order History & Status'$")
	public void the_csr_is_presented_with_the_header_order_history_status() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_order_history_hdr_text_and_displayed_in_VerifyAccount_page();
	}

	@And("^Order \\[Order Number\\] displays$")
	public void order_order_number_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_order_number_is_displayed_in_OrderHistory_VerifyAccount_page();
	}

	@And("^Placed Date: \\[YYYY\\-MM\\-DD\\] displays$")
	public void placed_date_yyyymmdd_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_order_placed_date_is_displayed_in_OrderHistory_VerifyAccount_page();
	}

	@Then("^Type: Phone Order displays in Order History section$")
	public void type_phone_order_displays_in_order_history_section() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_order_type_phone_order_is_displayed_in_OrderHistory_VerifyAccount_page();
	}

	@Then("^Type: Mail Order displays in Order History section$")
	public void type_mail_order_displays_in_order_history_section() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_order_type_mail_order_is_displayed_in_OrderHistory_VerifyAccount_page();
	}

	@Then("^Type: Fax Order displays in Order History section$")
	public void type_fax_order_displays_in_order_history_section() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_order_type_fax_order_is_displayed_in_OrderHistory_VerifyAccount_page();
	}

	@Then("^Type: Online displays in Order History section$")
	public void type_online_displays_in_order_history_section() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_order_type_Online_is_displayed_in_OrderHistory_VerifyAccount_page();
	}

	@Then("^Status: 'Held by Accounting' displays in Order History section$")
	public void status_held_by_accounting_displays_in_order_history_section() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_order_status_Held_by_Accounting_in_OrderHistory_VerifyAccount_page();
	}

	@Then("^CSR is presented with 'This is my first year teaching: YES' in Additional Information Container$")
	public void csr_is_presented_with_this_is_my_first_year_teaching_yes_in_additional_information_container() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_1st_year_teaching_status_YES_in_Additional_info_in_VerifyAccount_page();
	}

	@Then("^CSR is presented with 'This is my first year teaching: NO' in Additional Information Container$")
	public void csr_is_presented_with_this_is_my_first_year_teaching_no_in_additional_information_container() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_1st_year_teaching_status_NO_in_Additional_info_in_VerifyAccount_page();
	}

	@Then("^the CSR is presented with the label 'ROLE' within the Role Details container$")
	public void the_csr_is_presented_with_the_label_role_within_the_role_details_container() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_ROLE_section_displayed_and_the_header_in_VerifyAccount_page();
	}

	@And("^directly below the label the CSR is presented with all of the roles that the Teacher has selected$")
	public void directly_below_the_label_the_csr_is_presented_with_all_of_the_roles_that_the_teacher_has_selected() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_selected_roles_are_displayed_in_ROLE_section_in_VerifyAccount_page();
	}

	@Then("^the CSR is presented \\[Grade\\] , \\[no\\. of students\\]$")
	public void the_csr_is_presented_grade_no_of_students() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Grades_and_Students_fields_are_displayed_in_ROLE_section_in_VerifyAccount_page();
	}

	@And("^each grade is displayed in a new line$")
	public void each_grade_is_displayed_in_a_new_line() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_grades_are_displayed_in_a_row_in_ROLE_section_in_VerifyAccount_page();
	}

	@Then("^the CSR is presented with the label 'SCHOOL'$")
	public void the_csr_is_presented_with_the_label_school() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_SCHOOL_section_displayed_and_the_header_in_VerifyAccount_page();
	}

	@And("^correct \\[School Name, Address 1, Address 2, City, Province, Canada, Postal Code, School Phone Number\\] displays each in a seperate line$")
	public void correct_school_name_address_1_address_2_city_province_canada_postal_code_school_phone_number_displays_each_in_a_seperate_line() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_School_details_displayed_in_each_row_SCHOOL_section_Canada_in_VerifyAccount_page();
	}

	@And("^correct \\[School Name, Address 1, Address 2, City, State, US, Zip Code, School Phone Number\\] displays each in a seperate line$")
	public void correct_school_name_address_1_address_2_city_state_us_zip_code_school_phone_number_displays_each_in_a_seperate_line() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_School_details_displayed_in_each_row_SCHOOL_section_US_in_VerifyAccount_page();
	}

	@And("^CSR navigates to Verify Account Page for 1st time Teacher$")
	public void csr_navigates_to_verify_account_page_for_1st_time_teacher() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_the_Ac_Num_and_select_TeacherName_in_Search_Results();
	}

	//################################ Story 115 steps #######################################################
	@When("^CSR enters Flyer Code not mapped to US account$")
	public void csr_enters_Flyer_Code_not_mapped_to_US_account() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Flyer_Code_not_mapped_to_US();
	}

	@Then("^CSR sees error notification above the Flyer Code textbox$")
	public void csr_sees_error_notification_above_the_Flyer_Code_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_sees_error_notification_above_the_Flyer_Code();
	}

	@Then("^CSR sees message ‘Club not valid for US customers\\.’$")
	public void csr_sees_message_Club_not_valid_for_US_customers() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_sees_error_message_Flyer_Code();
	}

	//################################ Story 1830 steps #########################################################
	@When("^CSR clicks ’Sign Out’ hyperlink$")
	public void csr_clicks_Sign_Out_hyperlink() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_Sign_Out();
	}

	@Then("^CSR sees the pending items on Order Entry page$")
	public void csr_sees_the_pending_items_on_Order_Entry_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_sees_pending_items_on_Order_Entry_page();
	}

	//################################ Story 2031 steps #########################################################
	@Given("^CSR enters PO details$")
	public void csr_enter_PO_details() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_PO_Number_in_PaymentPage();
		studentFlyerOrdersPage.CSR_enters_Board_School_Number_in_PaymentPage();
		studentFlyerOrdersPage.CSR_enters_AC_Number_in_PaymentPage();
	}

	//############################### Story 2292 #############################################################
	@When("^CSR clicks on flyer hyperlink for item$")
	public void csr_clicks_on_flyer_hyperlink_for_item() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_flyer_hyperlink_Review_Cart();
	}

	@Then("^CSR cannot click on flyer hyperlink$")
	public void csr_cannot_click_on_flyer_hyperlink() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_cannot_click_flyer_hyperlink_Review_Cart();
	}

	//####################################### Story 2293 ###################################################
	@When("^CSR clicks item number$")
	public void csr_clicks_item_number() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_item1_num_ReviewCart();
	}

	@When("^CSR clicks ‘See Full Details’ hyperlink$")
	public void csr_clicks_See_Full_Details_hyperlink() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_item1_see_full_details_ReviewCart();
	}

	@Then("^CSR sees item details in a new tab$")
	public void csr_sees_item_details_in_a_new_tab() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_sees_new_tab_item_details_ReviewCart();
	}

    /*@When("^CSR submits order$")
    public void csr_submits_order() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }*/

	@Then("^the error message should be displayed as 'Missing Flyer Code' for Flyer Code field$")
	public void the_error_message_should_be_displayed_as_missing_flyer_code_for_flyer_code_field() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_error_msg_for_missing_FlyerCode_OrderEntryPage();
	}

	@When("^CSR perform tab to move out on 'Board\\/ School Number' textbox$")
	public void csr_perform_tab_to_move_out_on_board_school_number_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_perform_TabOut_on_Board_SchoolNum_fld_PaymentPage();
	}

	@When("^CSR perform tab to move out on \\[Account Number\\] textbox$")
	public void csr_perform_tab_to_move_out_on_account_number_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_perform_TabOut_on_AccountNum_fld_PaymentPage();
	}

	@And("^CSR perform tab to move out on \\[PO Number\\] textbox$")
	public void csr_perform_tab_to_move_out_on_po_number_textbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_perform_TabOut_on_PONum_fld_PaymentPage();
	}

	@And("^CSR sees message ‘We cannot seem to locate the Board\\/School with the number provided’$")
	public void csr_sees_message_we_cannot_seem_to_locate_the_boardschool_with_the_number_provided() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_popup_error_msg_for_Board_SchoolNum_fld_Payment_page();
	}

	@When("^CSR selects the 'School is not in the system' hyperlink$")
	public void csr_selects_the_school_is_not_in_the_system_hyperlink() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_hyperlink_School_not_in_system_in_SearchResults_page();
	}

	@Then("^CSR sees instruction modal displayed$")
	public void csr_sees_instruction_modal_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_modal_window_is_displayed_for_SchoolNotInSystem_SearchResults_page();
	}

	@When("^CSR performs mouse hover on item title box$")
	public void csr_performs_mouse_hover_on_item_title_box() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_mouse_hover_on_1st_item_title_ReviewCart_page();
	}

	@Then("^CallOut box displays above the title$")
	public void callout_box_displays_above_the_title() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_CallOut_msg_is_displayed_on_mouse_hover_ReviewCart_page();
	}

	@Then("^Full item title displays in a CallOut message$")
	public void full_item_title_displays_in_a_callout_message() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Item_title_is_displayed_in_CallOut_msg_ReviewCart_page();
	}

	@And("^Base item price displays under the title$")
	public void base_item_price_displays_under_the_title() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Item_base_price_is_displayed_in_CallOut_msg_ReviewCart_page();
	}

	@And("^provincial taxes to be applied and displays under the base price$")
	public void provincial_taxes_to_be_applied_and_displays_under_the_base_price() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_tax_is_displayed_for_item_in_CallOut_msg_ReviewCart_page();
	}

	@And("^total price after tax displays for the item$")
	public void total_price_after_tax_displays_for_the_item() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Item_Total_price_is_displayed_in_CallOut_msg_ReviewCart_page();
	}

	@Then("^Item base price, GST, PST and Total values displays correctly$")
	public void item_base_price_gst_pst_and_total_values_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validation_of_item_basePrice_GST_PST_Total_vals_ReviewCart_page();
	}

	@Then("^Item base price, GST, QST and Total values displays correctly$")
	public void item_base_price_gst_qst_and_total_values_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validation_of_item_basePrice_GST_QST_Total_vals_ReviewCart_page();
	}

	@Then("^Item base price, HST and Total values displays correctly$")
	public void item_base_price_hst_and_total_values_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validation_of_item_basePrice_HST_Total_vals_ReviewCart_page();
	}

	@Then("^Item base price, GST and Total values displays correctly$")
	public void item_base_price_gst_and_total_values_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validation_of_item_basePrice_GST_Total_vals_ReviewCart_page();
	}

	@Then("^No tax displays for GST, PST and displays item base price, Total values correctly$")
	public void no_tax_displays_for_gst_pst_and_displays_item_base_price_total_values_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validation_of_itemPrice_Total_vals_and_noTax_GST_PST_ReviewCart_page();
	}

	@Then("^No tax displays for GST, QST and displays item base price, Total values correctly$")
	public void no_tax_displays_for_gst_qst_and_displays_item_base_price_total_values_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validation_of_itemPrice_Total_vals_and_noTax_GST_QST_ReviewCart_page();
	}


	//########################################## SCSCOD-6238 ##############################################################
	@And("^CSR adds Teacher Catalogue items to the cart$")
	public void csr_adds_Teacher_Catalogue_items_to_the_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@And("^CSR adds Student Clubs items to the cart that is below the free shipping$")
	public void csr_adds_Student_Clubs_items_to_the_cart_that_is_below_the_free_shipping() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	//######################################### SCSCOD-6177 ###############################################################
	@When("^CSR clicks Update Account button$")
	public void csr_clicks_Update_Account_button() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_update_account_button();
	}

	@Then("^CSR sees status as Inactive$")
	public void csr_sees_status_as_Inactive() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_sees_inactive_account_status();
	}

	@Then("^Order entry button is disabled$")
	public void order_entry_button_is_disabled() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		//studentFlyerOrdersPage.Clicks_on_Continue_To_Order_Entry_in_VerifyAccountPage();
		studentFlyerOrdersPage.verify_CSR_Verify_Account_Page_is_displayed();
	}

	@And("^teacher adds student club items to the cart below the free shipping$")
	public void teacher_adds_student_club_items_to_the_cart_below_the_free_shipping() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder_NotEligible_Promotions(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}

	//######################################### SCSCOD-6165 ##################################################################
	@And("^CSR adds Teacher Catalogue items to the cart that is below the free shipping$")
	public void csr_adds_Teacher_Catalogue_items_to_the_cart_that_is_below_the_free_shipping() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@When("^CSR returns to Review Cart page$")
	public void csr_returns_to_Review_Cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_returns_to_Review_cart_page_using_stepheader();
	}

	@When("^CSR increases the quantity of first item in cart$")
	public void csr_increases_the_quantity_of_first_item_in_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_increases_quantity_of_first_item_Review_Cart();
	}

	@When("^CSR decreases the quantity of first item in cart$")
	public void csr_decreases_the_quantity_of_first_item_in_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_decreases_quantity_of_first_item_Review_Cart();
	}

	//######################################### SCSCOD-6165 TCOD ##################################################################

	@And("^teacher adds student club items to cart below the free shipping$")
	public void teacher_adds_student_club_items_to_cart_below_the_free_shipping() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Teacher_adds_one_item_grade_2_second_month();
	}

	@And("^teacher adds teacher catalogue items to cart below the free shipping$")
	public void teacher_adds_teacher_catalogue_items_to_cart_below_the_free_shipping() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.Teacher_adds_one_item_teacher_rewards_classroom_reward();
	}

	@When("^teacher add a valid item and Student Name to Student Flyer Order$")
	public void teacher_add_a_valid_item_and_Student_Name_to_Student_Flyer_Order() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.sfo_teacherAdd_studentName_itemNo();
	}

	@When("^Valid ItemNo is entered less than 7 characters with valid student name$")
	public void valid_itemno_is_entered_less_than_7_characters_with_valid_student_name() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.doadd_1itemNo_1StudentName(TestBaseProvider.getTestBase().getTestData().getString("sName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemNo"));
	}

	@When("^Valid ItemNo is entered as 7 characters with valid student name$")
	public void valid_itemno_is_entered_as_7_characters_with_valid_student_name() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.doadd_1itemNo_1StudentName(TestBaseProvider.getTestBase().getTestData().getString("sName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemNo"));
	}

	@When("^teacher enters ItemNo with special character$")
	public void teacher_enters_itemno_with_special_character() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.doadd_1itemNo_1StudentName(TestBaseProvider.getTestBase().getTestData().getString("sName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemNo"));
	}

	@When("^teacher adds multiple item, student name from same Flyer$")
	public void teacher_adds_multiple_item_student_name_from_same_Flyer() throws Throwable {

		String sname1= TestBaseProvider.getTestBase().getTestData().getString("sName1");
		String sname2= TestBaseProvider.getTestBase().getTestData().getString("sName2");
		String itemNo1= TestBaseProvider.getTestBase().getTestData().getString("itemNo1");
		String itemNo2= TestBaseProvider.getTestBase().getTestData().getString("itemNo2");

		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.doadditemNo_StudentName(sname1,itemNo1,sname2,itemNo2);
	}

	@When("^teacher adds items for multiple student and items belong to different flyers$")
	public void teacher_adds_items_for_multiple_student_and_items_belong_to_different_flyers() throws Throwable {
		String sname1= TestBaseProvider.getTestBase().getTestData().getString("sName1");
		String sname2= TestBaseProvider.getTestBase().getTestData().getString("sName2");
		String itemNo1= TestBaseProvider.getTestBase().getTestData().getString("itemNo1");
		String itemNo2= TestBaseProvider.getTestBase().getTestData().getString("itemNo2");
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.doadditemNo_StudentName(sname1,itemNo1,sname2,itemNo2);
	}

	@Then("^Add button is enabled and teacher clicks on Add$")
	public void add_button_is_enabled_and_teacher_clicks_on_add() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.sfo_page_AddButton();
	}

	@When("^teacher adds items multiple items to same Student from different Flyer$")
	public void teacher_adds_items_multiple_items_to_same_Student_from_different_Flyer() throws Throwable {
		String sname1= TestBaseProvider.getTestBase().getTestData().getString("sName1");
		String sname2= TestBaseProvider.getTestBase().getTestData().getString("sName2");
		String itemNo1= TestBaseProvider.getTestBase().getTestData().getString("itemNo1");
		String itemNo2= TestBaseProvider.getTestBase().getTestData().getString("itemNo2");
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.doadditemNo_StudentName_QTY(sname1,itemNo1,sname2,itemNo2);
	}

	@When("^teacher adds items with QTY more than (\\d+) for multiple student and items belong to different flyers$")
	public void teacher_adds_items_with_QTY_more_than_for_multiple_student_and_items_belong_to_different_flyers(int arg1) throws Throwable {
		String sname1= TestBaseProvider.getTestBase().getTestData().getString("sName1");
		String sname2= TestBaseProvider.getTestBase().getTestData().getString("sName2");
		String itemNo1= TestBaseProvider.getTestBase().getTestData().getString("itemNo1");
		String itemNo2= TestBaseProvider.getTestBase().getTestData().getString("itemNo2");
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.doadditemNo_StudentName_QTY(sname1,itemNo1,sname2,itemNo2);
	}

	@Then("^Student Flyer Order grid displays items added in the order of addition$")
	public void Student_Flyer_Order_grid_displays_items_added_in_the_order_of_addition() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_sfo_table_itemdetails_Added();
	}

	@And("^the Student Name,Item#,Item Title,Flyer,Coupon,Price and Quantity is updated$")
	public void the_Student_Name_Item_Item_Title_Flyer_Coupon_Price_and_Quantity_is_updated() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_sfo_table_updated();
	}
	@And("^the Student Name,Item#,Item Title,Flyer,Coupon,Price and Quantity is updated in the order items are added$")
	public void the_Student_Name_Item_Item_Title_Flyer_Coupon_Price_and_Quantity_is_updated_in_the_order_items_are_added() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_sfo_table_updated();
	}

	@Then("^teacher sees a grid displaying added items$")
	public void teacher_sees_a_grid_displaying_added_items() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.sfo_grid_Display();
	}

	@And("^the grid displays Student Name, Item#,Item Title, Flyer, Coupon, Price and Quantity$")
	public void the_grid_displays_Student_Name_Item_Item_Title_Flyer_Coupon_Price_and_Quantity() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getsfo_table_header_name();

	}


	@When("^teacher returns to Review Cart page$")
	public void teacher_returns_to_Review_Cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.User_selects_back_to_shop_link();
		studentFlyerOrdersPage.User_selects_shopping_cart_link();
	}

	@Given("^teacher(\\d+) navigates to \\[Review Cart\\] page by clicking the shopping cart icon$")
	public void teacher_navigates_to_Review_Cart_page_by_clicking_the_shopping_cart_icon(int arg1) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.User_selects_shopping_cart_link();
	}

	@When("^teacher increases the quantity of first item in cart$")
	public void teacher_increases_the_quantity_of_first_item_in_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_increases_quantity_of_first_item_Review_Cart();
	}

	@When("^teacher decreases the quantity of first item in cart$")
	public void teacher_decreases_the_quantity_of_first_item_in_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_decreases_quantity_of_first_item_Review_Cart();
	}

	@When("^CSR adds item with same item number with different quantity$")
	public void CSR_adds_item_with_same_item_number_with_different_quantity() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@Then("^no error popup is displayed for duplicate item number$")
	public void no_error_popup_is_displayed_for_duplicate_item_number() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_popUp_InvalidItem_notDisplay();

	}

	@When("^CSR adds item with same item number and same Qty for all items$")
	public void CSR_adds_item_with_same_item_number_and_same_Qty_for_all_items() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}


	@And("^the duplicate order is combined in (\\d+) flyer$")
	public void the_duplicate_order_is_combined_in_flyer(int arg1) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_verify_TotalQty();
	}

	@And("^the duplicate order is combined and grouped in flyer code$")
	public void the_duplicate_order_is_combined_and_grouped_in_flyer_code() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_verify_TotalQty();
	}

	@When("^teacher adds student club items to cart with pre\\-tax amount NOT meeting the \\[minimum amount\\]$")
	public void teacher_adds_student_club_items_to_cart_with_pretax_amount_not_meeting_the_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder_NotEligible_Promotions(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}

	@When("^teacher adds teacher catalogue items to cart with pre\\-tax amount meeting the \\[minimum amount\\]$")
	public void teacher_adds_teacher_catalogue_items_to_cart_with_pretax_amount_meeting_the_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.add_TeachercataloguesItems_from_YTO_with_price_limit(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice_limit"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}

	@And("^CSR navigates to Locate Account Page and clicks on Teacher's name$")
	public void csr_navigates_to_locate_account_page_and_clicks_on_teachers_name() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_the_Ac_Num_and_select_in_Search_Results();
	}

	@When("^CSR clicks on 'Cancel Order' and select \\[YES\\] option$")
	public void csr_clicks_on_cancel_order_and_select_yes_option() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_Cancel_the_order_and_select_YES();
	}

	@And("^Order Cancellation modal window displays with the title 'Order Cancellation'$")
	public void order_cancellation_modal_window_displays_with_the_title_order_cancellation() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Order_Cancellation_modal_window_displays_and_title();
	}

	@And("^the close icon 'X' positioned at the top right of the window$")
	public void the_close_icon_x_positioned_at_the_top_right_of_the_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_Close_btn_displays_in_Order_Cancellation_modal_window();
	}

	@When("^CSR clicks on 'X' button in Order Cancellation modal window$")
	public void csr_clicks_on_x_button_in_order_cancellation_modal_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_Close_btn_in_Order_Cancellation_modal_window();
	}

	@Then("^the modal window closes automatically$")
	public void the_modal_window_closes_automatically() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.verify_CSR_Home_Page_is_displayed();
	}

	@And("^the first paragraph of the text displays 'Your order was successfully cancelled\\.'$")
	public void the_first_paragraph_of_the_text_displays_your_order_was_successfully_cancelled() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_validate_the_paragraph_text_in_Order_Cancellation_modal_window();
	}

	@Then("^RESET button displays in bottom of the page$")
	public void reset_button_displays_in_bottom_of_the_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_RESET_btn_displayed_in_OrderEntry_page();
	}

	@And("^RESET button is in disabled by default$")
	public void reset_button_is_in_disabled_by_default() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_RESET_btn_disabled_byDefault_in_OrderEntry_page();
	}

	@When("^CSR starts enter the data in any of the field$")
	public void csr_starts_enter_the_data_in_any_of_the_field() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_FLYER_CODE_in_Order_Entry_form();
	}

	@Then("^RESET button should be enabled$")
	public void reset_button_should_be_enabled() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_RESET_btn_enabled_in_OrderEntry_page();
	}

	@And("^CSR enters the data in any of the field in a form$")
	public void csr_enters_the_data_in_any_of_the_field_in_a_form() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_FLYER_CODE_in_Order_Entry_form();
	}

	@When("^CSR clicks on RESET button$")
	public void csr_clicks_on_reset_button() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_RESET_btn_in_OrderEntry_page();
	}

	@Then("^RESET button confirmation callout message displays$")
	public void reset_button_confirmation_callout_message_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_confirmation_callout_displayed_in_OrderEntry_page();
	}

	@And("^the text displays as 'Are you sure\\?' with YES and NO buttons$")
	public void the_text_displays_as_are_you_sure_with_yes_and_no_buttons() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_text_confirmation_callout_and_YES_NO_btns_displayed_in_OrderEntry_page();
	}

	@When("^CSR clicks on RESET button and select YES$")
	public void csr_clicks_on_reset_button_and_select_yes() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_RESET_btn_in_OrderEntry_page();
		studentFlyerOrdersPage.CSR_clicks_on_YES_btn_in_RESET_Confirmation_popup_OrderEntry_page();
	}

	@When("^CSR clicks on RESET button and select NO$")
	public void csr_clicks_on_reset_button_and_select_no() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_RESET_btn_in_OrderEntry_page();
		studentFlyerOrdersPage.CSR_clicks_on_NO_btn_in_RESET_Confirmation_popup_OrderEntry_page();
	}

	@Then("^the callout message will close automatically$")
	public void the_callout_message_will_close_automatically() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_confirmation_callout_msg_close_automatically_in_OrderEntry_page();
	}

	@And("^the entered flyer data in a form will reset in a page$")
	public void the_entered_flyer_data_in_a_form_will_reset_in_a_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_entered_Flyer_data_is_reset_when_CSR_clicks_on_RESET_btn_in_OrderEntry_page();
	}

	@And("^CSR enters the Item Number$")
	public void csr_enters_the_item_number() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed1_in_OrderEntryPage();
	}

	@And("^CSR enters the Item Qty$")
	public void csr_enters_the_item_qty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed1_in_OrderEntryPage();
	}

	@And("^CSR enters the Flyer code, Item Num and Item Qty$")
	public void csr_enters_the_flyer_code_item_num_and_item_qty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_FLYER_CODE_in_Order_Entry_form();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed1_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed1_in_OrderEntryPage();
	}

	@And("^CSR navigates to Order Entry page from Review Cart page$")
	public void csr_navigates_to_order_entry_page_from_review_cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_clicks_on_OrderEntry_tab();
	}

	@And("^the entered Item number data in a form will reset in a page$")
	public void the_entered_item_number_data_in_a_form_will_reset_in_a_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_entered_ItemNum_data_is_reset_when_CSR_clicks_on_RESET_btn_in_OrderEntry_page();
	}

	@And("^the entered Item Qty data in a form will reset in a page$")
	public void the_entered_item_qty_data_in_a_form_will_reset_in_a_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_entered_ItemQTY_data_is_reset_when_CSR_clicks_on_RESET_btn_in_OrderEntry_page();
	}

	@And("^the data entered in a form will reset in a page$")
	public void the_data_entered_in_a_form_will_reset_in_a_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_entered_Flyer_data_is_reset_when_CSR_clicks_on_RESET_btn_in_OrderEntry_page();
		studentFlyerOrdersPage.CSR_verify_the_entered_ItemNum_data_is_reset_when_CSR_clicks_on_RESET_btn_in_OrderEntry_page();
		studentFlyerOrdersPage.CSR_verify_the_entered_ItemQTY_data_is_reset_when_CSR_clicks_on_RESET_btn_in_OrderEntry_page();
	}

	@And("^the data entered in a form will not reset in a page$")
	public void the_data_entered_in_a_form_will_not_reset_in_a_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_entered_Flyer_data_is_not_reset_when_CSR_clicks_on_RESET_NO_btn_in_OrderEntry_page();
		studentFlyerOrdersPage.CSR_verify_the_entered_ItemNum_data_is_not_reset_when_CSR_clicks_on_RESET_NO_btn_in_OrderEntry_page();
		studentFlyerOrdersPage.CSR_verify_the_entered_ItemQTY_data_is_not_reset_when_CSR_clicks_on_RESET_NO_btn_in_OrderEntry_page();
	}

	@And("^no error message is displayed$")
	public void no_error_message_is_displayed() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.sfo_page_Name_Item_add_error();
	}

	@Then("^error message should be displayed “Please enter a valid item number\\.”$")
	public void error_message_should_be_displayed_please_enter_a_valid_item_number() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.sfo_page_Name_ItemNo_error();
	}


	@And("^ADD button is not enabled when Item# is blank and Student Name is present$")
	public void ADD_button_is_not_enabled_when_Item_is_blank_and_Student_Name_is_present() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.sfo_teacher_enters_studentName_itemNo();
		iStudentFlyerOrdersPage.verify_ADD_button_state_disable_SFO_section();
	}

	@And("^ADD button is not enabled when Item# is entered and Student name is blank$")
	public void ADD_button_is_not_enabled_when_Item_is_entered_and_Student_name_is_blank() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.sfo_teacher_enters_studentName_itemNo();
		iStudentFlyerOrdersPage.verify_ADD_button_state_disable_SFO_section();
	}

	@And("^ADD button is enabled when Item# and Student name is entered$")
	public void ADD_button_is_enabled_when_Item_and_Student_name_is_entered() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.sfo_teacher_enters_studentName_itemNo();
		iStudentFlyerOrdersPage.verify_ADD_button_state_enable_SFO_section();
	}

	@And("^teacher clicks on Add button$")
	public void teacher_clicks_on_Add_button() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.click_sfo_page_ADDbutton();
	}

	@And("^Student Flyer Order page displays ItemNo and Student Name$")
	public void Student_Flyer_Order_page_displays_ItemNo_and_Student_Name() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getsfo_table_header_name();

	}

	@And("^ADD button is enabled when Invalid Item# and Student name is entered$")
	public void ADD_button_is_enabled_when_Invalid_Item_and_Student_name_is_entered() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.sfo_teacher_enters_studentName_itemNo();
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.verify_ADD_button_state_enable_SFO_section();
	}

	@When("^teacher enter the student name with special character$")
	public void teacher_enter_the_student_name_with_special_character() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.sfo_teacherAdd_studentName_itemNo();
	}

	@And("^SFO page is populated with Student name and ItemNo$")
	public void SFO_page_is_populated_with_Student_name_and_ItemNo() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getsfo_table_header_name();
	}

	@When("^Item# is entered and Student name entered is Numeric only equal (\\d+) Character$")
	public void Item_is_entered_and_Student_name_entered_is_Numeric_only_equal_Character(int arg1) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getsfo_table_header_name();
	}

	//######################################### SCSCOD-7063 ##################################################################
	@When("^CSR selects the hyperlink “Redeem your Coupons”$")
	public void csr_selects_the_hyperlink_Redeem_your_Coupons() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_redeem_your_coupon_hyperlink();
	}

	@Then("^CSR sees the Rewards and Redemption page$")
	public void csr_sees_the_Rewards_and_Redemption_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_Rewards_and_Redemption_page_is_displayed();
	}

	@And("^the text “Apply a coupon for this student” is displayed under Student Name field$")
	public void the_text_Apply_a_coupon_for_this_student_is_displayed_under_Student_Name_field() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getsfo_applyCoupontxt();
	}
	@Then("^error message is displayed$")
	public void error_message_is_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_get_sfo_invliadItemNO_error();
	}

	@Then("^error messsage is displayed “Please enter a valid Student Name.”$")
	public void error_messsage_is_displayed_Please_enter_a_valid_Student_Name_() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_get_sfo_invliadItemNO_error();


	}

	@When("^Item# is entered and Student name entered is alphanumeric equal (\\d+) Character$")
	public void Item_is_entered_and_Student_name_entered_is_alphanumeric_equal_Character(int arg1) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.sfo_teacherAdd_studentName_itemNo();

	}

	@When("^Item# is entered and Student name entered is all alphabets only equal (\\d+) Character$")
	public void Item_is_entered_and_Student_name_entered_is_all_alphabets_only_equal_Character(int arg1) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.sfo_teacherAdd_studentName_itemNo();
	}



	@When("^teacher click on link “Apply a coupon for this student”$")
	public void teacher_click_on_link_Apply_a_coupon_for_this_student() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clicklink_sfoapplyCoupon();
	}

	@Then("^SFO Coupon Modal is displayed$")
	public void SFO_Coupon_Modal_is_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifySFOmodalisDisplayed();

	}

	@And("^the tile of the modal is “Apply a coupon for this student”$")
	public void theTileOfTheModalIsApplyACouponForThisStudent() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifySFOmodaltitle();
	}

	@And("^the subtitle is “Enter Coupon  Code”$")
	public void theSubtitleIsEnterCouponCode() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifySFOmodalSubtitle();
	}

	@And("^the modal has a close icon on right corner$")
	public void theModalHasACloseIconOnRightCorner() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifySFOmodalcloseIcon();
	}

	@When("^teacher click on the close icon$")
	public void teacherClickOnTheCloseIcon() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clicktoCloseSFOCouponModal();
	}

	@Then("^the modal closes and teacher lands on SFO page$")
	public void theModalClosesAndTeacherLandsOnSFOPage() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifySFOPage();
	}

	@And("^modal comprises of field Student Name,Coupon and Apply button$")
	public void modalComprisesOfFieldStudentNameCouponAndApplyButton() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validatedefaultSFOcouponmodal();
	}


	@And("^Student Name filed has text as “e\\.g\\. John S, J\\.s\\. or alias”$")
	public void studentNameFiledHasTextAsEGJohnSJSOrAlias() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getsfo_coupon_labelstudentName_text();
	}


	@And("^Coupon field has text as “E\\.G\\. 3P3RW”$")
	public void coupon_field_has_text_as_eg_3p3rw() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getsfo_coupon_labelcoupon_text();
	}

	@And("^Apply button is disabled$")
	public void applyButtonIsDisabled() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_SFO_section_Apply_Button_State_Disable();

	}

	@And("^teacher clicks on link “Apply a coupon for this student”$")
	public void teacherClicksOnLinkApplyACouponForThisStudent() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clicklink_sfoapplyCoupon();

	}

	@When("^teacher enters Student Name with special character and tabs out$")
	public void teacherEntersStudentNameWithSpecialCharacterAndTabsOut() throws Throwable {
		StudentFlyerOrdersPage spage = new StudentFlyerOrdersPage();
		spage.appgettext_sfocoupon_sname_text().sendKeys(
				TestBaseProvider.getTestBase().getTestData().getString("studentName"));

	}

	@Then("^error message is displayed “Please enter a valid Student Name\\.”$")
	public void errorMessageIsDisplayedPleaseEnterAValidStudentName() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getsfocoupon_Sname_getError();
	}


	@When("^teacher enters Student Name with combination of numbers, characters and -$")
	public void teacherEntersStudentNameWithCombinationOfNumbersCharactersAnd() throws Throwable {
		StudentFlyerOrdersPage spage = new StudentFlyerOrdersPage();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		spage.getinputbox_sfocoupon_sname().sendKeys(TestBaseProvider.getTestBase().getTestData()
				.getString("sname1"));
		PauseUtil.pause(1000);
		spage.appgettext_sfocoupon_couponfield_text().clear();
		spage.appgettext_sfocoupon_couponfield_text().sendKeys(
				TestBaseProvider.getTestBase().getTestData().getString("sfofreepick")	);
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		PauseUtil.pause(1000);
		studentFlyerOrdersPage.click_sfo_coupon_ApplyButton_State();

	}

	@When("^teacher enters Coupon code with special character$")
	public void teacherEntersCouponCodeWithSpecialCharacter() throws Throwable {
		StudentFlyerOrdersPage spage = new StudentFlyerOrdersPage();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		spage.getinputbox_sfocoupon_sname().sendKeys(TestBaseProvider.getTestBase().getTestData()
				.getString("sname1"));
		PauseUtil.pause(1000);
		spage.appgettext_sfocoupon_couponfield_text().sendKeys(
				TestBaseProvider.getTestBase().getTestData().getString("sfofreepick")	);
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		PauseUtil.pause(1000);
		studentFlyerOrdersPage.click_sfo_coupon_ApplyButton_State();
	}


	@Then("^error message is displayed for Coupon code$")
	public void errorMessageIsDisplayedForCouponCode() throws Throwable {
		StudentFlyerOrdersPage spage = new StudentFlyerOrdersPage();
		spage.verify_error_msg_displayed_for_invalid_SFO_coupon_in_modal_window();
	}

	@When("^teacher enters valid coupon code with combination of numbers, characters and -$")
	public void teacherEntersValidCouponCodeWithCombinationOfNumbersCharactersAnd() throws Throwable {
		StudentFlyerOrdersPage spage = new StudentFlyerOrdersPage();
		spage.getinputbox_sfocoupon_couponCode().sendKeys(TestBaseProvider.getTestBase()
				.getTestData().getString("sfofreepick"));
	}

	@Then("^no error message is seen$")
	public void no_error_message_is_seen() throws Throwable {
		StudentFlyerOrdersPage spage = new StudentFlyerOrdersPage();
		spage.get_sfocoupon_modal_couponcode_NoError();
	}

	@And("^teacher enters valid Student Name$")
	public void teacher_enters_valid_student_name() throws Throwable {
		StudentFlyerOrdersPage spage = new StudentFlyerOrdersPage();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		spage.getinputbox_sfocoupon_sname().sendKeys(TestBaseProvider.getTestBase().getTestData()
				.getString("sname1"));
	}

	@When("^teacher enters Coupon code which has expired in BM$")
	public void teacher_enters_coupon_code_which_has_expired_in_bm() throws Throwable {
		StudentFlyerOrdersPage spage = new StudentFlyerOrdersPage();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		spage.getinputbox_sfocoupon_couponCode().sendKeys(TestBaseProvider.getTestBase()
				.getTestData().getString("sfofreepick"));
	}

	@When("^teacher enters valid Coupon code equal to 15 characters$")
	public void teacher_enters_valid_coupon_code_equal_to_15_characters() throws Throwable {
		StudentFlyerOrdersPage spage = new StudentFlyerOrdersPage();
		spage.appgettext_sfocoupon_couponfield_text().sendKeys("");
	}

	@When("^teacher enters valid Coupon code less than 15 characters$")
	public void teacher_enters_valid_coupon_code_less_than_15_characters() throws Throwable {
		StudentFlyerOrdersPage spage = new StudentFlyerOrdersPage();
		spage.appgettext_sfocoupon_couponfield_text().sendKeys("");
	}

	@When("^teacher redeems the coupon$")
	public void teacher_redeems_the_coupon() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		String coupons[] = SCHUtils.getArrayFromStringData(
				TestBaseProvider.getTestBase().getTestData().getString("selectgrade"));
		for (int i = 0; i < coupons.length; i++) {
			checkoutPage.MakeSelectionWindow_SelectGrade(
					TestBaseProvider.getTestBase().getTestData() );

			// System.out.println("<<Hello>>"+TestBaseProvider.getTestBase().getTestData());
		}

		//ICheckoutPage CheckoutPage = getFactory().getICheckoutPage();
		checkoutPage.Selects_an_item_from_Free_Item_Modal_window();


		//ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.getICouponSection().createdatafromFreePickSelection();
		checkoutPage.getICouponSection().clickOnConfrimAndApplyCoupon();
	}

	@Then("^the entered coupon code is displayed under Coupon header$")
	public void the_entered_coupon_code_is_displayed_under_coupon_header() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.sfopage_appliedCoupondisplayed();
	}

	@When("^teacher enters valid Coupon code less than 3 characters$")
	public void teacher_enters_valid_coupon_code_less_than_3_characters() throws Throwable {
		StudentFlyerOrdersPage spage = new StudentFlyerOrdersPage();
		spage.appgettext_sfocoupon_couponfield_text().sendKeys("");
	}

	@When("^teacher enters Coupon code which is not setup in BM$")
	public void teacher_enters_coupon_code_which_is_not_setup_in_bm() throws Throwable {
		StudentFlyerOrdersPage spage = new StudentFlyerOrdersPage();
		spage.appgettext_sfocoupon_couponfield_text().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("sfofreepick"));
	}


	@And("^teacher clicks on Apply$")
	public void teacher_clicks_on_apply() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.click_sfo_coupon_ApplyButton_State();

	}

	@Then("^error message is displayed for expired coupon$")
	public void error_message_is_displayed_for_expired_coupon() throws Throwable {
		StudentFlyerOrdersPage spage = new StudentFlyerOrdersPage();
		spage.verify_error_msg_displayed_for_invalid_SFO_coupon_in_modal_window();
	}

	@When("^teacher enters Coupon code which has been redeemed$")
	public void teacher_enters_coupon_code_which_has_been_redeemed() throws Throwable {
		StudentFlyerOrdersPage spage = new StudentFlyerOrdersPage();
		spage.appgettext_sfocoupon_couponfield_text().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("sfofreepick"));
	}

	@Then("^error message is displayed “Our records indicate that this coupon code has already been redeemed\\.”$")
	public void error_message_is_displayed_our_records_indicate_that_this_coupon_code_has_already_been_redeemed() throws Throwable {
		StudentFlyerOrdersPage spage = new StudentFlyerOrdersPage();
		spage.get_sfocoupon_modal_couponcode_redeemedcoupon_getError();
	}

	@When("^teacher enters valid Coupon code$")
	public void teacher_enters_valid_coupon_code() throws Throwable {
		StudentFlyerOrdersPage spage = new StudentFlyerOrdersPage();
		PauseUtil.pause(3000);
		spage.getinputbox_sfocoupon_couponCode().sendKeys(TestBaseProvider.getTestBase().getTestData()
				.getString("sfofreepick"));
	}
	@Then("^Apply button is enabled$")
	public void apply_button_is_enabled() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getsfo_coupon_ApplyButton_State();
	}
	@Then("^Apply button stays in disabled state$")
	public void apply_button_stays_in_disabled_state() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getsfo_coupon_ApplyButton_State_disabled();
	}
	@When("^teacher click on Apply$")
	public void teacher_click_on_apply() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		studentFlyerOrdersPage.click_sfo_coupon_ApplyButton_State();
	}

	@When("^CSR enters unique item number which is a set of alphanumeric characters$")
	public void csr_enters_unique_item_number_which_is_a_set_of_alphanumeric_characters() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed1_in_OrderEntryPage();
	}

	@Then("^the item number field accepts the alphanumeric characters$")
	public void the_item_number_field_accepts_the_alphanumeric_characters() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_item_num_fld_accept_6_characters_length();
	}

	@When("^CSR enters 6 characters of unique item number$")
	public void csr_enters_6_characters_of_unique_item_number() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed1_in_OrderEntryPage();
	}

	@Then("^the item number field accepts the entered value$")
	public void the_item_number_field_accepts_the_entered_value() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_item_num_fld_accept_6_characters_length();
	}

	@When("^CSR enters more than 6 characters in item number field$")
	public void csr_enters_more_than_6_characters_in_item_number_field() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed1_in_OrderEntryPage();
	}

	@Then("^the item number field should not accept the entered value$")
	public void the_item_number_field_should_not_accept_the_entered_value() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_item_num_fld_not_accept_morethan_6_characters_length();
	}

	@And("^CSR enters the unique item number and qty$")
	public void csr_enters_the_unique_item_number_and_qty() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_Item_Num_filed1_in_OrderEntryPage();
		studentFlyerOrdersPage.CSR_enters_Paid_Qty_filed1_in_OrderEntryPage();
	}

	@Then("^the modal window displays with the text 'Invalid Items'$")
	public void the_modal_window_displays_with_the_text_invalid_items() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_Invalid_Items_modal_window_displayed_in_OrderEntryPage();
	}

	@And("^the unique item numbers listed in the modal window$")
	public void the_unique_item_numbers_listed_in_the_modal_window() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_the_Items_are_listed_in_modal_window_in_OrderEntryPage();
	}

	@And("^Apply button changes to Saved$")
	public void applyButtonChangesToSaved() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_sfo_freepick_couponmodal_applybtn_saved();
	}

	@And("^Coupon Code field is deactivated$")
	public void couponCodeFieldIsDeactivated() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_sfo_input_couponbox_isDisabled();


	}

	@And("^Student Name field remains active$")
	public void studentNameFieldRemainsActive() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_sfo_input_couponmodal_studentname_isEnabled();
	}

    @And("^Coupon call out message is displayed$")
    public void couponCallOutMessageIsDisplayed() throws Throwable {
        IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.verify_sfo_freepick_calloutMsg();
    }
    
    @And("^teacher adds SFO item to the cart for single student$")
    public void teacher_adds_sfo_item_to_the_cart_for_single_student() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_student();
    }
    
    @And("^teacher adds multiple SFO items to the cart for single student$")
    public void teacher_adds_multiple_sfo_items_to_the_cart_for_single_student() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_adds_multiple_SFO_items_for_single_student();
    }
    
   
    @And("^teacher navigates to SFO page and adds SFO items from different flyers for multiple students$")
    public void teacher_navigates_to_sfo_page_and_adds_sfo_items_from_different_flyers_for_multiple_students() throws Throwable {
    	proddetails.add_store_sfoitems_multiplestudents();
    	 carttotals.get_totals_sfo_yto(studorderpage.getsfohometable());
    }
    
    @And("^teacher adds SFO items$")
    public void teacher_adds_sfo_items() throws Throwable {
     proddetails.add_store_sfoitems_multiplestudents();
    }
    
    @And("^teacher adds YTO items$")
    public void teacher_adds_yto_items() throws Throwable {
    	PauseUtil.pause(4500);
    	proddetails.add_store_ytoitems_differentflyers();
    }
    
    @And("^teacher adds YTO items from YTO by Item# page$")
    public void teacher_adds_yto_items_from_yto_by_item_page() throws Throwable {
    	proddetails.add_store_ytoitems_differentflyers();
    	
    }
    
    @When("^teacher adds YTO items from YTO by flyer page$")
    public void teacher_adds_yto_items_from_yto_by_flyer_page() throws Throwable {
    	proddetails.add_store_ytoitems_differentflyers();
    }
    
    @And("^teacher navigates to SFO page and adds SFO items from multiple flyers for one student$")
    public void teacher_navigates_to_sfo_page_and_adds_sfo_items_from_multiple_flyers_for_one_student() throws Throwable {
    	proddetails.add_store_sfoitems_singlestudent();
   	    carttotals.get_totals_sfo_yto(studorderpage.getsfohometable());
    }
    
    
    @And("^teacher navigates to SFO page and adds an item for one student$")
    public void teacher_navigates_to_sfo_page_and_adds_an_item_for_one_student() throws Throwable {
    	proddetails.add_store_sfoitem_singlestudent();
    }
    
    @And("^teacher navigates to SFO page and adds an item for one student such that the order qualifies for free shipping$")
    public void teacher_navigates_to_sfo_page_and_adds_an_item_for_one_student_such_that_the_order_qualifies_for_free_shipping() throws Throwable {
        proddetails.add_store_sfoitem_singlestudent();
    }
    
    @And("^teacher applies coupon on SFO page for the same student and selects an item from SFO coupon modal$")
    public void teacher_applies_coupon_on_sfo_page_for_the_same_student_and_selects_an_item_from_sfo_coupon_modal() throws Throwable {
    	proddetails.add_store_sfo_freeitem_singlestudent();
   	    carttotals.get_totals_sfo_yto(studorderpage.getsfohometable());
    }
    
    @And("^teacher applies coupon on SFO page for different student and selects item from SFO coupon modal$")
    public void teacher_applies_coupon_on_sfo_page_for_different_student_and_selects_item_from_sfo_coupon_modal() throws Throwable {
    	 proddetails.add_store_sfo_freeitem_singlestudent();
      	 carttotals.get_totals_sfo_yto(studorderpage.getsfohometable());
    }
    
    
    @And("^teacher selects the same item as paid item from the SFO coupon modal$")
    public void teacher_selects_the_same_item_as_paid_item_from_the_sfo_coupon_modal() throws Throwable {
    	proddetails.add_store_sfo_freeitem_singlestudent();
     	 carttotals.get_totals_sfo_yto(studorderpage.getsfohometable());
    }
    
    
    @And("^teacher applies coupon on SFO page for the same student and selects same item as paid item from SFO coupon modal$")
    public void teacher_applies_coupon_on_sfo_page_for_the_same_student_and_selects_same_item_as_paid_item_from_sfo_coupon_modal() throws Throwable {
     proddetails.add_store_sfo_freeitem_singlestudent();
     carttotals.get_totals_sfo_yto(studorderpage.getsfohometable());
    }
    
    @And("^teacher applies coupon on SFO page for different student and selects same item as paid item from SFO coupon modal$")
    public void teacher_applies_coupon_on_sfo_page_for_different_student_and_selects_same_item_as_paid_item_from_sfo_coupon_modal() throws Throwable {
    	proddetails.add_store_sfo_freeitem_singlestudent();
        carttotals.get_totals_sfo_yto(studorderpage.getsfohometable());
    }    
    
    @And("^teacher navigates to SFO page, applies freepick coupon eligible for free shipping and selects item from SFO coupon modal$")
    public void teacher_navigates_to_sfo_page_applies_freepick_coupon_eligible_for_free_shipping_and_selects_item_from_sfo_coupon_modal() throws Throwable {
    	proddetails.add_store_sfo_freeitem_singlestudent();
        carttotals.get_totals_sfo_yto(studorderpage.getsfohometable());
    }
    
    @And("^teacher navigates to SFO page, applies freepick coupon NOT eligible for free shipping and selects item from SFO coupon modal$")
    public void teacher_navigates_to_sfo_page_applies_freepick_coupon_not_eligible_for_free_shipping_and_selects_item_from_sfo_coupon_modal() throws Throwable {
    	proddetails.add_store_sfo_freeitem_singlestudent();
        carttotals.get_totals_sfo_yto(studorderpage.getsfohometable());
    }
    
    @And("^teacher applies freepick coupon on SFO page$")
    public void teacher_applies_freepick_coupon_on_sfo_page() throws Throwable {
        proddetails.teacher_apply_freepick_coupon();
    }
    
    @And("^teacher selects an item from SFO coupon modal$")
    public void teacher_selects_an_item_from_sfo_coupon_modal() throws Throwable {
        proddetails.teacher_select_item_from_sfo_coupon_modal();
        carttotals.get_totals_sfo_yto(studorderpage.getsfohometable());
        
    }
    
    @And("^teacher adds the same item to another student$")
    public void teacher_adds_the_same_item_to_another_student() throws Throwable {
    	carttotals.get_totals_sfo_yto(studorderpage.getsfohometable());
    	System.out.println("Just storing the data of SFO here");
    }
    
    @And("^teacher navigates to YTO page and adds YTO items to cart$")
    public void teacher_navigates_to_yto_page_and_adds_yto_items_to_cart() throws Throwable {
    	proddetails.add_store_ytoitems_differentflyers();
    	carttotals.get_totals_sfo_yto(studorderpage.getsfohometable());
    }
    
    @And("^teacher navigates to YTO page and adds YTO items from different flyers from YTO by Item number and YTO by flyer view$")
    public void teacher_navigates_to_yto_page_and_adds_yto_items_from_different_flyers_from_yto_by_item_number_and_yto_by_flyer_view() throws Throwable {
    	proddetails.add_store_ytoitems_differentflyers();
    	carttotals.get_totals_sfo_yto(studorderpage.getsfohometable());
    }
    
    
    
    @And("^teacher navigates to Review Cart page with correct SFO & teacher exclusive item information and totals$")
    public void teacher_navigates_to_review_cart_page_with_correct_sfo_teacher_exclusive_item_information_and_totals() throws Throwable {
    	proddetails.verify_sfo_iteminformation_checkoutpages();
    	carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","ReviewCart");
     	carttotals.compare_totals_reviewcart("SFOItems","ReviewCart");
    	proddetails.verify_te_iteminformation_checkoutpages();
    }
    
    @And("^teacher navigates to Review Cart page with correct YTO & teacher exclusive item information and totals$")
    public void teacher_navigates_to_review_cart_page_with_correct_yto_teacher_exclusive_item_information_and_totals() throws Throwable {
    	proddetails.verify_yto_iteminformation_checkoutpages();
    	carttotals.get_totals_checkoutpages_sfo_yto("YTOItems","ReviewCart");
        carttotals.compare_totals_reviewcart("YTOItems","ReviewCart");
    	proddetails.verify_te_iteminformation_checkoutpages();
    }
    
    @And("^teacher navigates to Review Cart page with correct SFO, YTO & teacher exclusive item information and totals$")
    public void teacher_navigates_to_review_cart_page_with_correct_sfo_yto_teacher_exclusive_item_information_and_totals() throws Throwable {
    	proddetails.verify_sfo_iteminformation_checkoutpages();
    	carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","ReviewCart");
     	carttotals.compare_totals_reviewcart("SFOItems","ReviewCart");
    	proddetails.verify_yto_iteminformation_checkoutpages();
    	carttotals.get_totals_checkoutpages_sfo_yto("YTOItems","ReviewCart");
        carttotals.compare_totals_reviewcart("YTOItems","ReviewCart");
    	proddetails.verify_te_iteminformation_checkoutpages();
    	carttotals.get_total_reviewcartpage();
    }
    
    @And("^teacher adds SFO items to the cart for multiple students$")
    public void teacher_adds_sfo_items_to_the_cart_for_multiple_students() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_adds_single_SFO_item_for_multiple_student();
    }
    
    @When("^teacher navigates to \\[Review Cart\\] page$")
    public void teacher_navigates_to_review_cart_page() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_clicks_on_ReviewCart_btn_in_SFO();
    }
    
    @When("^teacher(\\d+) navigates to \\[Review Cart\\] page$")
    public void teacher_navigates_to_Review_Cart_page(int arg1) throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_clicks_on_ReviewCart_btn_in_SFO();
    }
    
    @Then("^teacher sees the SFO section$")
    public void teacher_sees_the_sfo_section() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.verify_SFO_section_displayed_in_ReviewCart_page();
    }

    @And("^YTO Subtotal,Qty,GST,QST,Total and Cart Total displays correctly$")
    public void yto_subtotalqtygstqsttotal_and_cart_total_displays_correctly() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.validation_of_multiple_YTO_items_in_ReviewCart_page_and_totals_GST_QST();
    }
    
    @And("^YTO Subtotal,Qty,GST,PST,Total and Cart Total displays correctly$")
    public void yto_subtotalqtygstpsttotal_and_cart_total_displays_correctly() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.validation_of_multiple_YTO_items_in_ReviewCart_page_and_totals_GST_PST();
    }
    
    @And("^YTO Subtotal,Qty,HST,Total and Cart Total displays correctly$")
    public void yto_subtotalqtyhsttotal_and_cart_total_displays_correctly() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.validation_of_multiple_YTO_items_in_ReviewCart_page_and_totals_HST();
    }
    
    @And("^YTO Subtotal,Qty,GST,Total and Cart Total displays correctly$")
    public void yto_subtotalqtygsttotal_and_cart_total_displays_correctly() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.validation_of_multiple_YTO_items_in_ReviewCart_page_and_totals_GST();
    }
    
    @And("^No taxes are charged for QC and YTO Subtotal,Qty,Total and Cart Total displays correctly$")
    public void no_taxes_are_charged_for_qc_and_yto_subtotalqtytotal_and_cart_total_displays_correctly() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.No_tax_validation_of_multiple_YTO_items_in_ReviewCart_page_and_totals_GST_QST();
    }
    
    @And("^No taxes are charged for BC and YTO Subtotal,Qty,Total and Cart Total displays correctly$")
    public void no_taxes_are_charged_for_bc_and_yto_subtotalqtytotal_and_cart_total_displays_correctly() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.No_tax_validation_of_multiple_YTO_items_in_ReviewCart_page_and_totals_GST_PST();
    }
    
    @And("^No taxes are charged for HST and YTO Subtotal,Qty,Total and Cart Total displays correctly$")
    public void no_taxes_are_charged_for_hst_and_yto_subtotalqtytotal_and_cart_total_displays_correctly() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.No_tax_validation_of_multiple_YTO_items_in_ReviewCart_page_and_totals_HST();
    }
    
    @And("^No taxes are charged for GST and YTO Subtotal,Qty,Total and Cart Total displays correctly$")
    public void no_taxes_are_charged_for_gst_and_yto_subtotalqtytotal_and_cart_total_displays_correctly() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.No_tax_validation_of_multiple_YTO_items_in_ReviewCart_page_and_totals_GST();
    }
    
    @And("^teacher adds Teacher Exclusives items to the cart$")
    public void teacher_adds_teacher_exclusives_items_to_the_cart() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_adds_TE_items_to_cart_by_Search();
    }
    
    @And("^teacher adds Teacher Exclusives items to cart$")
    public void teacher_adds_teacher_exclusives_items_to_cart() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_adds_TeacherExclusive_item_for_Free_ManualShipping();
    }
    
    @And("^teacher adds Teacher Exclusive items to cart$")
    public void teacher_adds_teacher_exclusive_items_to_cart() throws Throwable {
    	proddetails.add_store_teitems_differentflyers();
    }
    
    @And("^teacher adds Teacher Exclusive items from Quick look$")
    public void teacher_adds_teacher_exclusive_items_from_quick_look() throws Throwable {
    	proddetails.add_store_teitems_differentflyers();
    }
    
    @When("^teacher adds Teacher Exclusive items from PDP page$")
    public void teacher_adds_teacher_exclusive_items_from_pdp_page() throws Throwable {
    	proddetails.add_store_teitems_differentflyers();
    }
    
    @And("^teacher adds Teacher Exclusive items$")
    public void teacher_adds_teacher_exclusive_items() throws Throwable {
    	proddetails.add_store_teitems_differentflyers();
    }

	@And("^added item is grouped by student name$")
	public void added_item_is_grouped_by_student_name() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_single_item_grouped_by_Student_name_SFO_in_ReviewCart_page();
	}

	@And("^added items are grouped by student name$")
	public void added_items_are_grouped_by_student_name() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_multiple_items_grouped_by_Student_name_SFO_in_ReviewCart_page();
	}

	@And("^the student name displays correctly$")
	public void the_student_name_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_student_name_displays_correctly_in_SFO_section_in_ReviewCart_page();
	}

	@And("^the student names displays correctly$")
	public void the_student_names_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_student_names_displays_correctly_in_SFO_section_in_ReviewCart_page();
	}

	@And("^Student Subtotal,Qty,GST,PST,Total,SFO Total and Cart Total displays correctly$")
	public void student_subtotalqtygstpsttotalsfo_total_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validation_of_single_SFO_item_added_for_one_student_totals_GST_PST();
	}

	@And("^Multiple items Student Subtotal,Qty,GST,PST,Total,SFO Total and Cart Total displays correctly$")
	public void multiple_items_student_subtotalqtygstpsttotalsfo_total_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validation_of_multiple_SFO_items_added_for_one_student_totals_GST_PST();
	}

	@And("^Students Subtotal,Qty,GST,QST,Total,SFO Total and Cart Total displays correctly$")
	public void students_subtotalqtygstqsttotalsfo_total_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validation_of_single_SFO_items_added_for_multiple_students_totals_GST_QST();
	}

	@And("^Students Subtotal,Qty,GST,PST,Total,SFO Total and Cart Total displays correctly$")
	public void students_subtotalqtygstpsttotalsfo_total_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validation_of_single_SFO_items_added_for_multiple_students_totals_GST_PST();
	}

	@And("^Students Subtotal,Qty,HST,Total,SFO Total and Cart Total displays correctly$")
	public void students_subtotalqtyhsttotalsfo_total_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validation_of_single_SFO_items_added_for_multiple_students_totals_HST();
	}

	@And("^Students Subtotal,Qty,GST,Total,SFO Total and Cart Total displays correctly$")
	public void students_subtotalqtygsttotalsfo_total_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validation_of_single_SFO_items_added_for_multiple_students_totals_GST();
	}

	@And("^No taxes are charged and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly$")
	public void no_taxes_are_charged_and_students_subtotalqtytotalsfo_total_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.No_tax_validation_of_single_SFO_items_added_for_multiple_students_totals_GST_QST();
	}

	@And("^No taxes are charged for BC and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly$")
	public void no_taxes_are_charged_for_bc_and_students_subtotalqtytotalsfo_total_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.No_tax_validation_of_single_SFO_items_added_for_multiple_students_totals_GST_PST();
	}

	@And("^No taxes are charged for HST and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly$")
	public void no_taxes_are_charged_for_hst_and_students_subtotalqtytotalsfo_total_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.No_tax_validation_of_single_SFO_items_added_for_multiple_students_totals_HST();
	}

	@And("^No taxes are charged for GST and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly$")
	public void no_taxes_are_charged_for_gst_and_students_subtotalqtytotalsfo_total_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.No_tax_validation_of_single_SFO_items_added_for_multiple_students_totals_GST();
	}

	@And("^teacher adds YTO items to the cart$")
	public void teacher_adds_yto_items_to_the_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_multiple_YTO_items_to_the_cart();
	}

	@Then("^teacher sees the YTO section$")
	public void teacher_sees_the_yto_section() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_YTO_section_displayed_in_ReviewCart_page();
	}

	@When("^teacher navigates to \\[Review Cart\\] page from Search results page$")
	public void teacher_navigates_to_review_cart_page_from_search_results_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_clicks_on_mini_ReviewCart_btn();
	}

	@Then("^teacher sees the Teacher Exclusives section$")
	public void teacher_sees_the_teacher_exclusives_section() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_TE_section_displayed_in_ReviewCart_page();
	}

	@And("^Teacher Exclusives Subtotal,Qty,GST,QST,Total and Cart Total displays correctly$")
	public void teacher_exclusives_subtotalqtygstqsttotal_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validation_of_multiple_TE_items_in_ReviewCart_page_and_totals_GST_QST();
	}

	@And("^Teacher Exclusives Subtotal,Qty,GST,PST,Total and Cart Total displays correctly$")
	public void teacher_exclusives_subtotalqtygstpsttotal_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validation_of_multiple_TE_items_in_ReviewCart_page_and_totals_GST_PST();
	}

	@And("^Teacher Exclusives Subtotal,Qty,HST,Total and Cart Total displays correctly$")
	public void teacher_exclusives_subtotalqtyhsttotal_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validation_of_multiple_TE_items_in_ReviewCart_page_and_totals_HST();
	}

	@And("^Teacher Exclusives Subtotal,Qty,GST,Total and Cart Total displays correctly$")
	public void teacher_exclusives_subtotalqtygsttotal_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validation_of_multiple_TE_items_in_ReviewCart_page_and_totals_GST();
	}

	@And("^No taxes are charged for QC and Teacher Exclusives Subtotal,Qty,Total and Cart Total displays correctly$")
	public void no_taxes_are_charged_for_qc_and_teacher_exclusives_subtotalqtytotal_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.No_tax_validation_of_multiple_TE_items_in_ReviewCart_page_and_totals_GST_QST();
	}

	@And("^No taxes are charged for BC and Teacher Exclusives Subtotal,Qty,Total and Cart Total displays correctly$")
	public void no_taxes_are_charged_for_bc_and_teacher_exclusives_subtotalqtytotal_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.No_tax_validation_of_multiple_TE_items_in_ReviewCart_page_and_totals_GST_PST();
	}

	@And("^No taxes are charged for HST and Teacher Exclusives Subtotal,Qty,Total and Cart Total displays correctly$")
	public void no_taxes_are_charged_for_hst_and_teacher_exclusives_subtotalqtytotal_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.No_tax_validation_of_multiple_TE_items_in_ReviewCart_page_and_totals_HST();
	}

	@And("^No taxes are charged for GST and Teacher Exclusives Subtotal,Qty,Pre & Post Total and Cart Total displays correctly$")
	public void no_taxes_are_charged_for_gst_and_teacher_exclusives_subtotalqtypre_post_total_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.No_tax_validation_of_multiple_TE_items_in_ReviewCart_page_and_totals_GST();
	}

	@And("^teacher adds SFO and YTO items to the cart$")
	public void teacher_adds_sfo_and_yto_items_to_the_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_multiple_YTO_items_to_the_cart();

		ILoginPage login = getFactory().getILoginPage();
		login.teacher_clicks_on_SFO_tab_YTO_page();

		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_student();
	}

	@Then("^teacher sees the SFO and YTO sections$")
	public void teacher_sees_the_sfo_and_yto_sections() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_SFO_section_displayed_in_ReviewCart_page();
		studentFlyerOrdersPage.verify_YTO_section_displayed_in_ReviewCart_page();
	}

	@And("^teacher sees the text 'You are earning rewards on'$")
	public void teacher_sees_the_text_you_are_earning_rewards_on() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_verify_YOU_ARE_EARNING_REWARDS_ON_fld_displayed_ReviewCart_page();
	}

	@And("^SFO,YTO Total,GST,QST,YOU ARE EARNING REWARDS ON value and Cart Total displays correctly$")
	public void sfoyto_totalgstqstyou_are_earning_rewards_on_value_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validation_of_SFO_YTO_Totals_ReviewCart_page_GST_QST();
	}

	@And("^SFO,YTO Total,GST,PST,YOU ARE EARNING REWARDS ON value and Cart Total displays correctly$")
	public void sfoyto_totalgstpstyou_are_earning_rewards_on_value_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validation_of_SFO_YTO_Totals_ReviewCart_page_GST_PST();
	}

	@And("^SFO,YTO Total,HST,YOU ARE EARNING REWARDS ON value and Cart Total displays correctly$")
	public void sfoyto_totalhstyou_are_earning_rewards_on_value_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validation_of_SFO_YTO_Totals_ReviewCart_page_HST();
	}

	@And("^SFO,YTO Total,GST,YOU ARE EARNING REWARDS ON value and Cart Total displays correctly$")
	public void sfoyto_totalgstyou_are_earning_rewards_on_value_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validation_of_SFO_YTO_Totals_ReviewCart_page_GST();
	}

	@And("^teacher adds SFO,YTO and Teacher Exclusives items to the cart$")
	public void teacher_adds_sfoyto_and_teacher_exclusives_items_to_the_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_multiple_YTO_items_to_the_cart();

		ILoginPage login = getFactory().getILoginPage();
		login.teacher_clicks_on_SFO_tab_YTO_page();

		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_student();
		studentFlyerOrdersPage.teacher_adds_TE_items_to_cart_by_Search();
	}

	@Then("^teacher sees the SFO,YTO and Teacher Exclusives sections$")
	public void teacher_sees_the_sfoyto_and_teacher_exclusives_sections() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_SFO_section_displayed_in_ReviewCart_page();
		studentFlyerOrdersPage.verify_YTO_section_displayed_in_ReviewCart_page();
		studentFlyerOrdersPage.verify_TE_section_displayed_in_ReviewCart_page();
	}

	@And("^SFO,YTO,Teacher Exclusives Total,GST,QST and Cart Total displays correctly$")
	public void sfoytoteacher_exclusives_totalgstqst_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validation_of_SFO_YTO_TE_Totals_ReviewCart_page_GST_QST();
	}

	@And("^SFO,YTO,Teacher Exclusives Total,GST,PST and Cart Total displays correctly$")
	public void sfoytoteacher_exclusives_totalgstpst_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validation_of_SFO_YTO_TE_Totals_ReviewCart_page_GST_PST();
	}

	@And("^SFO,YTO,Teacher Exclusives Total,HST and Cart Total displays correctly$")
	public void sfoytoteacher_exclusives_totalhst_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validation_of_SFO_YTO_TE_Totals_ReviewCart_page_HST();
	}

	@And("^SFO,YTO,Teacher Exclusives Total,GST and Cart Total displays correctly$")
	public void sfoytoteacher_exclusives_totalgst_and_cart_total_displays_correctly() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validation_of_SFO_YTO_TE_Totals_ReviewCart_page_GST();
	}

	@And("^teacher adds SFO items to the cart$")
	public void teacher_adds_sfo_items_to_the_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_single_SFO_item_for_multiple_student();
	}

	@When("^teacher navigates to \\[Redemptions & Rewards\\] page$")
	public void teacher_navigates_to_redemptions_rewards_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_clicks_on_Continue_checkout_in_ReviewCart_page();
	}

	@When("^teacher1 navigates to \\[Redemptions & Rewards\\] page$")
	public void teacher1_navigates_to_redemptions_rewards_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_clicks_on_Continue_checkout_in_ReviewCart_page();
	}

	@And("^teacher2 navigates to \\[Redemptions & Rewards\\] page$")
	public void teacher2_navigates_to_redemptions_rewards_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_clicks_on_Continue_checkout_in_ReviewCart_page();
	}

	@Then("^error message is displayed “This coupon is no longer valid\\. Please check the coupon for details”$")
	public void errorMessageIsDisplayedThisCouponIsNoLongerValidPleaseCheckTheCouponForDetails() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_sfo_freepick_errorMsg( "expired");
	}

	@Then("^error message is displayed for Coupon not Setup$")
	public void errorMessageIsDisplayedForCouponNotSetup() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_sfo_freepick_errorMsg( "notsetup");

	}

	@Then("^error message is displayed for coupon already present in the cart$")
	public void errorMessageIsDisplayedForCouponAlreadyPresentInTheCart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_sfo_freepick_errorMsg( "alreadyinCart");
	}

	@And("^hyperlink “Manage” is present$")
	public void hyperlinkManageIsPresent() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_teacherDesk_linkManage();

	}


	@Then("^Student Name is saved to Class list on the backend$")
	public void studentNameIsSavedToClassListOnTheBackend() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^as teacher again try to add another student name$")
	public void asTeacherAgainTryToAddAnotherStudentName() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^the Student Name field provides auto suggestion option based on the Class list$")
	public void theStudentNameFieldProvidesAutoSuggestionOptionBasedOnTheClassList() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^application is not used for more than (\\d+) minutes the session time out\\.$")
	public void applicationIsNotUsedForMoreThanMinutesTheSessionTimeOut(int arg0) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^teacher  re-login to the application$")
	public void teacherReLoginToTheApplication() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^teacher enters Student name$")
	public void teacherEntersStudentName() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^the Student Name field gives auto suggestion option based on the Class list$")
	public void theStudentNameFieldGivesAutoSuggestionOptionBasedOnTheClassList() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^item# is entered$")
	public void itemIsEntered() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^the name is added to the Class list and the previously entered student name is retained as well$")
	public void theNameIsAddedToTheClassListAndThePreviouslyEnteredStudentNameIsRetainedAsWell() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^teacher logout from the application and relogin$")
	public void teacherLogoutFromTheApplicationAndRelogin() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^teacher enters student name and item#$")
	public void teacherEntersStudentNameAndItem() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^ADD button is not clicked$")
	public void addButtonIsNotClicked() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Class list will not be updated with the Student name typed$")
	public void classListWillNotBeUpdatedWithTheStudentNameTyped() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^teacher click on “Manage”$")
	public void teacherClickOnManage() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.click_teacherDesk_Manage();

	}

	@Then("^Manage Class list modal is displayed$")
	public void manageClassListModalIsDisplayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_teacherDesk_classListmodal();
	}

	@And("^the modal title is “Manage Class List”$")
	public void theModalTitleIsManageClassList() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_teacherDesk_classListmodal();
	}

	@And("^the modal message “Student Flyer Orders Please Note: These are students you have entered orders for online”  is displayed$")
	public void theModalMessageStudentFlyerOrdersPleaseNoteTheseAreStudentsYouHaveEnteredOrdersForOnlineIsDisplayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^Add student name field, add button, save hyperlink, edit hyperlink are all visible$")
	public void addStudentNameFieldAddButtonSaveHyperlinkEditHyperlinkAreAllVisible() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validate_teacherDesk_manageclassListmodal();

	}

	@And("^Add button is not active, Save Hyperlink is not active$")
	public void addButtonIsNotActiveSaveHyperlinkIsNotActive() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^teacher again try to add another student name$")
	public void teacherAgainTryToAddAnotherStudentName() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^the modal has x button at top of modal$")
	public void theModalHasXButtonAtTopOfModal() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^teacher clicks on the x button$")
	public void teacherClicksOnTheXButton() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the manage class list modal closes$")
	public void theManageClassListModalCloses() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^teacher enters student name more than (\\d+) characters and less than (\\d+)$")
	public void teacherEntersStudentNameMoreThanCharactersAndLessThan(int arg0, int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Add button is enabled$")
	public void addButtonIsEnabled() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^hyperlink Save is not activated$")
	public void hyperlinkSaveIsNotActivated() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^hyperlink Edit is active$")
	public void hyperlinkEditIsActive() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^teacher clicks on Add button on Class list modal$")
	public void teacherClicksOnAddButtonOnClassListModal() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^entered name is added to the grid below$")
	public void enteredNameIsAddedToTheGridBelow() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^hyperlink Save is active$")
	public void hyperlinkSaveIsActive() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^the entered name is not displayed on the grid$")
	public void theEnteredNameIsNotDisplayedOnTheGrid() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^teacher clicks on Save$")
	public void teacherClicksOnSave() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^the entered name is displayed on the grid$")
	public void theEnteredNameIsDisplayedOnTheGrid() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^teacher click on Edit$")
	public void teacherClickOnEdit() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^name field is disabled and displays the name$")
	public void nameFieldIsDisabledAndDisplaysTheName() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^Add button is disabled$")
	public void addButtonIsDisabled() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^edit is inactive$")
	public void editIsInactive() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^Save is activated$")
	public void saveIsActivated() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^the grid is available for edit name$")
	public void theGridIsAvailableForEditName() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^teacher enters student name less than (\\d+) characters$")
	public void teacherEntersStudentNameLessThanCharacters(int arg0) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^“Student names must include at least (\\d+) characters\\.” is displayed$")
	public void studentNamesMustIncludeAtLeastCharactersIsDisplayed(int arg0) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^teacher tries to type more than (\\d+) characters in name field$")
	public void teacherTriesToTypeMoreThanCharactersInNameField(int arg0) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^name field does not except more than (\\d+) characters$")
	public void nameFieldDoesNotExceptMoreThanCharacters(int arg0) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^the modal grid is empty$")
	public void theModalGridIsEmpty() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^save is inactive$")
	public void saveIsInactive() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^teacher clicks edit$")
	public void teacherClicksEdit() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^teacher delete the existing name$")
	public void teacherDeleteTheExistingName() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^close the Class list modal$")
	public void closeTheClassListModal() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the deleted name is not removed from class list$")
	public void theDeletedNameIsNotRemovedFromClassList() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^click on save$")
	public void clickOnSave() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the deleted name is removed from class list$")
	public void theDeletedNameIsRemovedFromClassList() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^teacher edits the the existing name$")
	public void teacherEditsTheTheExistingName() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the edited name is not displayed and the previous name is retained$")
	public void theEditedNameIsNotDisplayedAndThePreviousNameIsRetained() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the edited name is  displayed$")
	public void theEditedNameIsDisplayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^teacher try to update the existing name with only (\\d+) characters$")
	public void teacherTryToUpdateTheExistingNameWithOnlyCharacters(int arg0) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^teacher try to update the existing name with more than (\\d+) characters$")
	public void teacherTryToUpdateTheExistingNameWithMoreThanCharacters(int arg0) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the updated name will not allow more than (\\d+) characters$")
	public void theUpdatedNameWillNotAllowMoreThanCharacters(int arg0) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^teacher try to add existin name$")
	public void teacherTryToAddExistinName() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^error message is dispalyed$")
	public void errorMessageIsDispalyed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^teacher clicks to type student name$")
	public void teacherClicksToTypeStudentName() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^auto suggest should display name$")
	public void autoSuggestShouldDisplayName() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^teacher can choose the desired name using keyboard or mouse$")
	public void teacherCanChooseTheDesiredNameUsingKeyboardOrMouse() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^teacher can choose the desired name using keyboard$")
	public void teacherCanChooseTheDesiredNameUsingKeyboard() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@And("^teacher adds FreePick item to the cart for single student$")
	public void teacher_adds_freepick_item_to_the_cart_for_single_student() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_apply_a_FreePick_item_for_single_student_in_SFO_section();
		studentFlyerOrdersPage.teacher_search_and_select_a_FreePick_item_from_the_list_SFO_section();
	}

	@And("^No prices are charged for Student Subtotal,GST,PST,Total,SFO Total and Cart Total$")
	public void no_prices_are_charged_for_student_subtotalgstpsttotalsfo_total_and_cart_total() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validation_of_single_SFO_FreePick_item_added_for_one_student_totals_GST_PST();
	}

	@And("^teacher adds FreePick item to the cart for multiple students$")
	public void teacher_adds_freepick_item_to_the_cart_for_multiple_students() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_apply_a_FreePick_item_for_single_student_in_SFO_section();
		studentFlyerOrdersPage.teacher_search_and_select_a_FreePick_item_from_the_list_SFO_section();
		studentFlyerOrdersPage.teacher_apply_a_FreePick_item_2_for_single_student_in_SFO_section();
		studentFlyerOrdersPage.teacher_search_and_select_a_FreePick_item_from_the_list_SFO_section();
	}

	@And("^No prices are charged for multiple Students Subtotal,GST,PST,Total,SFO Total and Cart Total$")
	public void no_prices_are_charged_for_multiple_students_subtotalgstpsttotalsfo_total_and_cart_total() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.validation_of_multiple_SFO_FreePick_items_added_for_multiple_students_totals_GST_PST();
	}

	@And("^teacher adds SFO item for Free Shipping$")
	public void teacher_adds_sfo_item_for_free_shipping() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_Free_Shipping();
	}

	@And("^teacher adds SFO item for Paid Shipping$")
	public void teacher_adds_sfo_item_for_paid_shipping() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_Paid_Shipping();
	}

	@And("^teacher adds YTO item for Free Shipping$")
	public void teacher_adds_yto_item_for_free_shipping() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_YTO_item_for_Free_Shipping();
	}

	@And("^teacher adds YTO items to cart$")
	public void teacher_adds_yto_items_to_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_multiple_YTO_items_to_cart();
	}

	@And("^teacher adds YTO item for \\[Bonus Flat Upsell\\]$")
	public void teacherAddsYTOItemForBonusFlatUpsell() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
	}

	@When("^teacher adds YTO items to cart with \\[minumum amount\\]$")
	public void teacher_adds_yto_items_to_cart_with_minumum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_YTO_item_for_Free_Shipping();
	}

	@And("^teacher adds YTO items to cart with \\[minumum amount\\] for manual free shipping coupon$")
	public void teacher_adds_yto_items_to_cart_with_minumum_amount_for_manual_free_shipping_coupon() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_YTO_item_for_Free_ManualShipping();
	}

	@And("^teacher adds YTO items to cart which does not qualify for manual free shipping coupon$")
	public void teacher_adds_yto_items_to_cart_which_does_not_qualify_for_manual_free_shipping_coupon() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_YTO_item_for_Paid_ManualShipping();
	}


	@And("^teacher adds Teacher Exclusives item to cart with \\[minumum amount\\] for manual free shipping coupon$")
	public void teacher_adds_teacher_exclusives_item_to_cart_with_minumum_amount_for_manual_free_shipping_coupon() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_TeacherExclusive_item_for_Free_ManualShipping();
	}


	@And("^teacher adds YTO item for Free Shipping with item number$")
	public void teacher_adds_yto_item_for_free_shippingWithItemNumber() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_YTO_item_for_Free_Shipping_WithItemNumber();
	}

	@And("^teacher adds YTO items to cart without \\[minumum amount\\]$")
	public void teacher_adds_yto_items_to_cart_without_minumum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_YTO_item_for_Paid_Shipping();
	}

	@And("^teacher adds YTO item for Paid Shipping$")
	public void teacher_adds_yto_item_for_paid_shipping() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_YTO_item_for_Paid_Shipping();
	}

	@And("^teacher adds Teacher Exclusives item for Free Shipping$")
	public void teacher_adds_teacher_exclusives_item_for_free_shipping() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_TE_item_for_Free_Shipping();
	}

	@And("^teacher adds Teacher Exclusives item for Paid Shipping$")
	public void teacher_adds_teacher_exclusives_item_for_paid_shipping() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_TE_item_for_Paid_Shipping();
	}

	@And("^teacher adds YTO and Teacher Exclusives items for Free Shipping$")
	public void teacher_adds_yto_and_teacher_exclusives_items_for_free_shipping() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_YTO_item_for_Free_Shipping();
		studentFlyerOrdersPage.teacher_adds_TE_item_for_Free_Shipping();

	}


	@And("^teacher adds YTO and Teacher Exclusives items to cart with \\[minumum amount\\] for manual free shipping coupon$")
	public void teacher_adds_yto_and_teacher_exclusives_items_to_cart_with_minumum_amount_for_manual_free_shipping_coupon() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_multiple_YTO_TeacherExclusives_items_to_the_cart_for_manualshipping_coupon();
	}


	@And("^teacher adds YTO and Teacher Exclusives items for Paid Shipping$")
	public void teacher_adds_yto_and_teacher_exclusives_items_for_paid_shipping() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_YTO_item_for_Paid_Shipping();
		studentFlyerOrdersPage.teacher_adds_TE_item_for_Paid_Shipping();
	}

	@And("^teacher adds YTO items for Free Shipping$")
	public void teacher_adds_yto_items_for_free_shipping() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_multiple_YTO_items_to_the_cart_for_free_shipping();
	}

	@And("^teacher adds multiple YTO items to cart with \\[minumum amount\\]$")
	public void teacher_adds_multiple_yto_items_to_cart_with_minumum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_multiple_YTO_items_to_the_cart_for_free_shipping();
	}


	@And("^teacher adds YTO and Teacher Exclusives items$")
	public void teacher_adds_yto_and_teacher_exclusives_items() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_multiple_YTO_items();
		studentFlyerOrdersPage.teacher_adds_TeacherExclusive_item_for_Free_ManualShipping();
	}

	@And("^teacher adds YTO item to cart qualifying for QA Incentives$")
	public void teacher_adds_yto_item_to_cart_qualifying_for_qa_incentives() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_multiple_YTO_items_to_cart();
	}

	@And("^teacher navigates to Review Cart page with correct YTO item information and totals$")
	public void teacher_navigates_to_review_cart_page_with_correct_yto_item_information_and_totals() throws Throwable {

		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_clicks_on_ReviewCart_btn_in_SFO();
		PauseUtil.pause(4000);
		carttotals.get_totals_checkoutpages_sfo_yto("YTOItems","ReviewCart");
		proddetails.verify_yto_iteminformation_checkoutpages();
		carttotals.compare_totals_reviewcart("YTOItems","ReviewCart");
	}

	@And("^teacher navigates to Review Cart page with correct item information and totals$")
	public void teacher_navigates_to_review_cart_page_with_correct_item_information_and_totals() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_clicks_on_ReviewCart_btn_in_SFO();
		PauseUtil.pause(4000);
		carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","ReviewCart");
		proddetails.verify_sfo_iteminformation_checkoutpages();
		carttotals.compare_totals_reviewcart("SFOItems","ReviewCart");
		carttotals.get_total_reviewcartpage(); // getting only total of this page

		//studentFlyerOrdersPage.verify_sfo_iteminformation_checkoutpages();

    	/*ProductDetails proddetails = new ProductDetails();
    	proddetails.verify_sfo_iteminformation_checkoutpages();*/
	}

	@And("^teacher navigates to Review Cart page with correct SFO & YTO item information and totals$")
	public void teacher_navigates_to_review_cart_page_with_correct_sfo_yto_item_information_and_totals() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_clicks_on_ReviewCart_btn_in_SFO();
		PauseUtil.pause(4000);
		proddetails.verify_sfo_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","ReviewCart");
		carttotals.compare_totals_reviewcart("SFOItems","ReviewCart");
		proddetails.verify_yto_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("YTOItems","ReviewCart");
		carttotals.compare_totals_reviewcart("YTOItems","ReviewCart");

	}


	@And("^teacher navigates to Confirm & Submit page from Review Cart page with correct SFO & teacher exclusive item information and totals$")
	public void teacher_navigates_to_confirm_submit_page_from_review_cart_page_with_correct_sfo_teacher_exclusive_item_information_and_totals() throws Throwable {
		StudentFlyerOrdersPage sfp = new StudentFlyerOrdersPage();
		sfp.navigate_from_reviewcartpage_confirmandsubmitpage();
		PauseUtil.pause(4000);
		proddetails.verify_sfo_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","ConfirmSubmitpage");
		carttotals.compare_totals_reviewcart("SFOItems","ConfirmSubmitpage");
		proddetails.verify_te_iteminformation_checkoutpages();
	}


	@And("^teacher navigates to Confirm & Submit page from Review Cart page with correct YTO & teacher exclusive item information and totals$")
	public void teacher_navigates_to_confirm_submit_page_from_review_cart_page_with_correct_yto_teacher_exclusive_item_information_and_totals() throws Throwable {
		StudentFlyerOrdersPage sfp = new StudentFlyerOrdersPage();
		sfp.navigate_from_reviewcartpage_confirmandsubmitpage();
		PauseUtil.pause(4000);
		proddetails.verify_yto_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("YTOItems","ConfirmSubmitpage");
		carttotals.compare_totals_reviewcart("YTOItems","ConfirmSubmitpage");
		proddetails.verify_te_iteminformation_checkoutpages();
	}

	@And("^teacher navigates to Confirm & Submit page from Review Cart page with correct SFO,YTO & teacher exclusive item information and totals$")
	public void teacher_navigates_to_confirm_submit_page_from_review_cart_page_with_correct_sfoyto_teacher_exclusive_item_information_and_totals() throws Throwable {
		StudentFlyerOrdersPage sfp = new StudentFlyerOrdersPage();
		sfp.navigate_from_reviewcartpage_confirmandsubmitpage();
		PauseUtil.pause(4000);
		proddetails.verify_sfo_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","ConfirmSubmitpage");
		carttotals.compare_totals_reviewcart("SFOItems","ConfirmSubmitpage");
		proddetails.verify_yto_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("YTOItems","ConfirmSubmitpage");
		carttotals.compare_totals_reviewcart("YTOItems","ConfirmSubmitpage");
		proddetails.verify_te_iteminformation_checkoutpages();
	}

	@And("^teacher navigates to Redemptions & Rewards page with correct totals$")
	public void teacher_navigates_to_redemptions_rewards_page_with_correct_totals() throws Throwable {
		studorderpage.navigate_from_reviewcartpage_rewardsandredemptionspage();
		PauseUtil.pause(4000);
		carttotals.get_total_redemptionsandrewardspage_preshipping();
		carttotals.compare_reviewcarttotal_rewardspagetotal();
	}

	@And("^teacher navigates to Redemptions & Rewards page$")
	public void teacher_navigates_to_redemptions_and_rewards_page() throws Throwable {
		studorderpage.navigate_from_reviewcartpage_rewardsandredemptionspage();
		PauseUtil.pause(4000);
	}


	@And("^teacher applies freepick coupon$")
	public void teacher_applies_freepick_coupon() throws Throwable {
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();

		String coupons[] = SCHUtils.getArrayFromStringData(
				TestBaseProvider.getTestBase().getTestData().getString("CouponCode"));
		for (String coupon : coupons) {
			rewardsAndCoupons.enterCoupon(coupon);

		}
	}

	@And("^teacher selects an item from freepick modal$")
	public void teacher_selects_an_item_from_freepick_modal() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		PauseUtil.waitForAjaxToComplete(1500);
		checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
				TestBaseProvider.getTestBase().getTestData());
		checkoutPage.MakeSelectionWindow_SelectItemFreePick();
		checkoutPage.getICouponSection().clickOnConfrimAndApplyCoupon();
		PauseUtil.pause(3000);
	}

	@When("^teacher applies Credit Notes to SFO, Bonus Bank and paper coupons redemptions to YTO and teacher exclusives$")
	public void teacher_applies_credit_notes_to_sfo_bonus_bank_and_paper_coupons_redemptions_to_yto_and_teacher_exclusives() throws Throwable {
		chkpage.teacher_enter_redemptions("SFO");
		PauseUtil.pause(2000);
		chkpage.teacher_enter_redemptions("YTO");
		PauseUtil.pause(2000);
		chkpage.teacher_enter_redemptions("TE");
		PauseUtil.pause(2000);
		carttotals.get_total_redemptionsandrewardspage();
	}

	@Then("^correct totals display on Payment page$")
	public void correct_totals_display_on_payment_page() throws Throwable {
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		SCHUtils.scrollToView(rewardsAndCoupons.getBtnContinueCheckout());
		SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
		PauseUtil.pause(1000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		carttotals.get_total_paymentpage();
		carttotals.compare_rewardspagetotal_Paymentpagetotal();

	}

	@And("^teacher navigates to Confirm & Submit page from Review Cart page with correct item information and totals$")
	public void teacher_navigates_to_confirm_submit_page_from_review_cart_page_with_correct_item_information_and_totals() throws Throwable {
		//StudentFlyerOrdersPage sfp = new StudentFlyerOrdersPage();
		studorderpage.navigate_from_reviewcartpage_confirmandsubmitpage();
		PauseUtil.pause(4000);
		proddetails.verify_sfo_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","ConfirmSubmitpage");
		carttotals.compare_totals_reviewcart("SFOItems","ConfirmSubmitpage");

	}

	@And("^teacher navigates to Confirm & Submit page from Rewards page with correct item information and totals$")
	public void teacher_navigates_to_confirm_submit_page_from_rewards_page_with_correct_item_information_and_totals() throws Throwable {
		studorderpage.navigate_from_rewardspage_confirmandsubmitpage();
		PauseUtil.pause(4000);
		proddetails.verify_sfo_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","ConfirmSubmitpage");
		carttotals.compare_totals_reviewcart("SFOItems","ConfirmSubmitpage");
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.verifyManualFreePickDetails_ConfirmSubmitPage(
				TestBaseProvider.getTestBase().getTestData().getString("CouponCode"));
	}


	@And("^teacher navigates to Confirm & Submit page from Review Cart page with correct item information and totals and see free shipping$")
	public void teacher_navigates_to_confirm_submit_page_from_review_cart_page_with_correct_item_information_and_totals_and_see_free_shipping() throws Throwable {
		studorderpage.navigate_from_reviewcartpage_confirmandsubmitpage();
		PauseUtil.pause(4000);
		carttotals.verify_shippingfree_in_confirmpage();
		proddetails.verify_sfo_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","Confirmpage");
		carttotals.compare_totals_reviewcart("SFOItems","Confirmpage");
	}

	@And("^teacher navigates to Confirm & Submit page from Payment page with correct item information and totals and see paid shipping$")
	public void teacher_navigates_to_confirm_submit_page_from_payment_page_with_correct_item_information_and_totals_and_see_paid_shipping() throws Throwable {
		studorderpage.click_btn_continuecheckout_inpaymentpage();
		PauseUtil.pause(4000);
		carttotals.verify_shippingpaid_in_confirmpage();
		proddetails.verify_sfo_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","Confirmpage");
		carttotals.compare_totals_reviewcart("SFOItems","Confirmpage");
	}


	@And("^teacher navigates to Confirm & Submit page from Payment page with correct SFO item information and totals$")
	public void teacher_navigates_to_confirm_submit_page_from_payment_page_with_correct_sfo_item_information_and_totals() throws Throwable {
		studorderpage.click_btn_continuecheckout_inpaymentpage();
		PauseUtil.pause(4000);
		proddetails.verify_sfo_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","ConfirmSubmitpage");
		carttotals.compare_totals_reviewcart("SFOItems","ConfirmSubmitpage");
	}


	@And("^teacher navigates to Confirm & Submit page from Review Cart page with correct SFO item information and totals$")
	public void teacher_navigates_to_confirm_submit_page_from_review_cart_page_with_correct_sfo_item_information_and_totals() throws Throwable {
		studorderpage.click_btn_continuecheckout_inpaymentpage();
		proddetails.verify_sfo_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","Confirmpage");
		carttotals.compare_totals_reviewcart("SFOItems","Confirmpage");
	}

	@And("^teacher navigates to Confirm & Submit page from Review Cart page with correct YTO item information and totals$")
	public void teacher_navigates_to_confirm_submit_page_from_review_cart_page_with_correct_yto_item_information_and_totals() throws Throwable {
		//StudentFlyerOrdersPage sfp = new StudentFlyerOrdersPage();
		studorderpage.navigate_from_reviewcartpage_confirmandsubmitpage();
		PauseUtil.pause(4000);
		proddetails.verify_yto_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("YTOItems","ConfirmSubmitpage");
		carttotals.compare_totals_reviewcart("YTOItems","ConfirmSubmitpage");
	}

	@And("^teacher navigates to Confirm & Submit page from Review Cart page with correct SFO & YTO item information and totals$")
	public void teacher_navigates_to_confirm_submit_page_from_review_cart_page_with_correct_sfo_yto_item_information_and_totals() throws Throwable {
		//StudentFlyerOrdersPage sfp = new StudentFlyerOrdersPage();
		studorderpage.navigate_from_reviewcartpage_confirmandsubmitpage();
		PauseUtil.pause(4000);
		proddetails.verify_sfo_iteminformation_checkoutpages();
		proddetails.verify_yto_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","ConfirmSubmitpage");
		carttotals.compare_totals_reviewcart("SFOItems","ConfirmSubmitpage");
		carttotals.get_totals_checkoutpages_sfo_yto("YTOItems","Confirmpage");
		carttotals.compare_totals_reviewcart("YTOItems","Confirmpage");
	}


	@Then("^teacher sees the correct Free SFO and YTO item information and totals$")
	public void teacher_sees_the_correct_free_sfo_and_yto_item_information_and_totals() throws Throwable {
		proddetails.verify_sfo_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","Confirmpage");
		carttotals.compare_totals_reviewcart("SFOItems","Confirmpage");
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.verifyManualFreePickDetails_ConfirmSubmitPage(
				TestBaseProvider.getTestBase().getTestData().getString("CouponCode"));
	}

	@When("^teacher submits the order$")
	public void teacher_submits_the_order() throws Throwable {
		ConfirmAndSubmitOrder confirmAndSubmitOrderPage =
				getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
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
	
	@When("^teacher submits the order and adds submitted SOO order in Excel$")
	public void teacher_submits_the_order_and_adds_submitted_SOO_order_in_Excel() throws Throwable {
		PCOD_SubmitYourOrderPage pcod_submitpage = new PCOD_SubmitYourOrderPage();
		ConfirmAndSubmitOrder confirmAndSubmitOrderPage =
				getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
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
		
		pcod_submitpage.add_deleted_submitted_SOO_order_to_excel();
	}
	
	
	@Then("^teacher sees the correct SFO item information and totals$")
	public void teacher_sees_the_correct_sfo_item_information_and_totals() throws Throwable {
		proddetails.verify_sfo_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","Confirmpage");
		carttotals.compare_totals_reviewcart("SFOItems","Confirmpage");

	}

	@Then("^teacher sees the correct YTO item information and totals$")
	public void teacher_sees_the_correct_yto_item_information_and_totals() throws Throwable {
		proddetails.verify_yto_iteminformation_checkoutpages();
	}

	@Then("^teacher sees the correct SFO & YTO item information and totals$")
	public void teacher_sees_the_correct_sfo_yto_item_information_and_totals() throws Throwable {
		proddetails.verify_sfo_iteminformation_checkoutpages();
		proddetails.verify_yto_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","Confirmpage");
		carttotals.compare_totals_reviewcart("SFOItems","Confirmpage");
		carttotals.get_totals_checkoutpages_sfo_yto("YTOItems","Confirmpage");
		carttotals.compare_totals_reviewcart("YTOItems","Confirmpage");
	}

	@Then("^teacher sees the correct SFO & teacher exclusive item information and totals$")
	public void teacher_sees_the_correct_sfo_teacher_exclusive_item_information_and_totals() throws Throwable {
		proddetails.verify_sfo_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","Confirmpage");
		carttotals.compare_totals_reviewcart("SFOItems","Confirmpage");
		proddetails.verify_te_iteminformation_checkoutpages();
	}

	@Then("^teacher sees the correct YTO & teacher exclusive item information and totals$")
	public void teacher_sees_the_correct_yto_teacher_exclusive_item_information_and_totals() throws Throwable {
		proddetails.verify_yto_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("YTOItems","Confirmpage");
		carttotals.compare_totals_reviewcart("YTOItems","Confirmpage");
		proddetails.verify_te_iteminformation_checkoutpages();
	}

	@Then("^teacher sees the correct SFO, YTO & teacher exclusive item information and totals$")
	public void teacher_sees_the_correct_sfo_yto_teacher_exclusive_item_information_and_totals() throws Throwable {
		proddetails.verify_sfo_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","Confirmpage");
		carttotals.compare_totals_reviewcart("SFOItems","Confirmpage");
		proddetails.verify_yto_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("YTOItems","Confirmpage");
		carttotals.compare_totals_reviewcart("YTOItems","Confirmpage");
		proddetails.verify_te_iteminformation_checkoutpages();
	}

	@And("^correct SFO,YTO & teacher exclusive item information and totals with redemptions display on Confirm & Submit page$")
	public void correct_sfoyto_teacher_exclusive_item_information_and_totals_with_redemptions_display_on_confirm_submit_page() throws Throwable {
		studorderpage.navigate_from_paymentpage_to_confirmsubmitpage();
		PauseUtil.pause(4000);
		proddetails.verify_sfo_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","Confirmpage");
		carttotals.compare_totals_reviewcart("SFOItems","Confirmpage");
		proddetails.verify_yto_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("YTOItems","Confirmpage");
		carttotals.compare_totals_reviewcart("YTOItems","Confirmpage");
		proddetails.verify_te_iteminformation_checkoutpages();
		carttotals.get_total_confirmsubmitpage();
		carttotals.compare_Paymentpagetotal_confirmsubmitpage();



	}

	@And("^correct SFO,YTO & teacher exclusive item information and totals with redemptions display on Order Confirmation page$")
	public void correct_yto_teacher_exclusive_item_information_and_totals_with_redemptions_display_on_order_confirmation_page() throws Throwable {
		studorderpage.navigate_from_confirmsubmitpage_to_confirmationpage();
		PauseUtil.pause(4000);
		proddetails.verify_sfo_iteminformation_checkoutpages();
		proddetails.verify_yto_iteminformation_checkoutpages();
		proddetails.verify_te_iteminformation_checkoutpages();
		carttotals.get_total_confirmationpage();
		carttotals.compare_confirmsubmitpage_confirmationpage();
	}

	@And("^teacher adds multiple SFO and YTO items to the cart$")
	public void teacher_adds_multiple_sfo_and_yto_items_to_the_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_multiple_YTO_items_to_the_cart();

		ILoginPage login = getFactory().getILoginPage();
		login.teacher_clicks_on_SFO_tab_YTO_page();

		studentFlyerOrdersPage.teacher_adds_single_SFO_item_for_multiple_student();
	}

	@And("^teacher adds multiple SFO,YTO and Teacher Exclusives items to the cart$")
	public void teacher_adds_multiple_sfoyto_and_teacher_exclusives_items_to_the_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_multiple_YTO_items_to_the_cart();

		ILoginPage login = getFactory().getILoginPage();
		login.teacher_clicks_on_SFO_tab_YTO_page();

		studentFlyerOrdersPage.teacher_adds_single_SFO_item_for_multiple_student();
		studentFlyerOrdersPage.teacher_adds_TE_items_to_cart_by_Search();
	}




	@And("^teacher navigates to YTO page and same item added to YTO as added to SFO$")
	public void teacher_navigates_to_yto_page_and_same_item_added_to_yto_as_added_to_sfo() throws Throwable {
		proddetails.add_store_single_ytoitem();
		carttotals.get_totals_sfo_yto(studorderpage.getsfohometable());
	}

	@And("^teacher applies freepick coupon NOT eligible for free shipping on SFO page$")
	public void teacher_applies_freepick_coupon_not_eligible_for_free_shipping_on_sfo_page() throws Throwable {
		proddetails.teacher_apply_freepick_coupon();
	}

	@And("^teacher selects the same item as selected on SFO from freepick modal$")
	public void teacher_selects_the_same_item_as_selected_on_sfo_from_freepick_modal() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		PauseUtil.waitForAjaxToComplete(1500);
		checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
				TestBaseProvider.getTestBase().getTestData());
		checkoutPage.MakeSelectionWindow_SelectItemFreePick();
		checkoutPage.getICouponSection().clickOnConfrimAndApplyCoupon();
		PauseUtil.pause(3000);
	}

	@And("^teacher navigates to YTO page and same item added to YTO as added to SFO freepick item$")
	public void teacher_navigates_to_yto_page_and_same_item_added_to_yto_as_added_to_sfofreepick_item() throws Throwable {
		proddetails.add_store_single_ytoitem_from_xml();
		carttotals.get_totals_sfo_yto(studorderpage.getsfohometable());
	}

	@And("^adds SFO items from different flyers for multiple students$")
	public void adds_sfo_items_from_different_flyers_for_multiple_students() throws Throwable {
		proddetails.add_store_sfoitems_multiplestudents();
	}

	@Then("^teacher sees the correct SFO, YTO, teacher exclusive item and Rewards information and totals$")
	public void teacher_sees_the_correct_sfo_yto_teacher_exclusive_item_and_rewards_information_and_totals() throws Throwable {
		proddetails.verify_sfo_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","Confirmpage");
		carttotals.compare_totals_reviewcart("SFOItems","Confirmpage");
		proddetails.verify_yto_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("YTOItems","Confirmpage");
		carttotals.compare_totals_reviewcart("YTOItems","Confirmpage");
		proddetails.verify_te_iteminformation_checkoutpages();
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.verifyManualFreePickDetails_ConfirmSubmitPage(
				TestBaseProvider.getTestBase().getTestData().getString("CouponCode"));
	}

	@And("^teacher navigates to Confirm & Submit page from Rewards page with correct SFO,YTO & TE item information and totals$")
	public void teacher_navigates_to_confirm_submit_page_from_rewards_page_with_correct_sfoyto_te_item_information_and_totals() throws Throwable {
		proddetails.verify_sfo_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","ConfirmSubmitpage");
		carttotals.compare_totals_reviewcart("SFOItems","ConfirmSubmitpage");
		proddetails.verify_yto_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("YTOItems","ConfirmSubmitpage");
		carttotals.compare_totals_reviewcart("YTOItems","ConfirmSubmitpage");
		proddetails.verify_te_iteminformation_checkoutpages();
	}

	//################################################ SCSCOD-7359 ######################################################
	@When("^teacher enters teacher only coupon$")
	public void teacher_enters_teacher_only_coupon() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_applies_teacher_only_coupon_SFO_page();
	}

	@When("^teacher enters Student only coupon$")
	public void teacher_enters_Student_only_coupon() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_applies_student_only_coupon_SFO_page();
	}

	@Then("^No error message is displayed$")
	public void No_error_message_is_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.no_error_message_is_displayed_SFO_page();
	}
	//################################################ SCSCOD-7359 ######################################################


	//################################################ SCSCOD-6993 ######################################################
	@Given("^CSR adds YTO items to the cart such that it is equal or more than the automatic free shipping promotion$")
	public void csr_adds_YTO_items_to_the_cart_such_that_it_is_equal_or_more_than_the_automatic_free_shipping_promotion() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_YTO_items_to_the_cart();
	}

	@When("^CSR applies partial bonus bank and paper coupons on the YTO section$")
	public void csr_applies_partial_bonus_bank_and_paper_coupons_on_the_YTO_section() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.enter_amount_in_student_Bonus_Bank();
		checkoutPage.enter_amount_in_student_Paper_Bank();
	}

	@When("^CSR clicks on ‘Apply’ button for YTO section$")
	public void csr_clicks_on_Apply_button_for_YTO_section() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.click_on_Apply_in_Students_section();
	}

	@When("^CSR applies manual coupons$")
	public void csr_applies_manual_coupons() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.CSR_apply_a_coupon_in_Rewards_page();
	}

	@When("^CSR clicks on ‘Reset’ button$")
	public void csr_clicks_on_Reset_button() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.CSR_selects_Reset_button();
	}

	@When("^CSR selects ‘YES’ on delete pop-up$")
	public void csr_selects_YES_on_delete_pop_up() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.CSR_selects_YES_on_Reset_modal();
	}

	@Then("^CSR does not see the applied bonus bank and paper coupons on the YTO section$")
	public void csr_does_not_see_the_applied_bonus_bank_and_paper_coupons_on_the_YTO_section() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.CSR_sees_empty_bonus_bank_txtbox_YTO();
		checkoutPage.CSR_sees_empty_paper_coupons_txtbox_YTO();
	}

	@Then("^CSR does not see the previously entered manual coupons$")
	public void csr_does_not_see_the_previously_entered_manual_coupons() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.CSR_does_not_see_coupons_in_Rewards_page();
	}

	@Given("^CSR adds Teacher Exclusive items to the cart such that it is equal or more than the automatic free shipping promotion$")
	public void csr_adds_Teacher_Exclusive_items_to_the_cart_such_that_it_is_equal_or_more_than_the_automatic_free_shipping_promotion() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_Teacher_Exclusive_items_to_the_cart();
	}

	@When("^CSR applies partial bonus bank and paper coupons on the Teacher Exclusive section$")
	public void csr_applies_partial_bonus_bank_and_paper_coupons_on_the_Teacher_Exclusive_section() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.enter_amount_in_teacher_Bonus_Bank();
		checkoutPage.enter_amount_in_teacher_Paper_Bank();
	}

	@When("^CSR clicks on ‘Apply’ button for Teacher Exclusive section$")
	public void csr_clicks_on_Apply_button_for_Teacher_Exclusive_section() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.click_on_Apply_in_Teacher_section();
	}

	@Then("^CSR does not see the applied bonus bank and paper coupons on the Teacher Exclusive section$")
	public void csr_does_not_see_the_applied_bonus_bank_and_paper_coupons_on_the_Teacher_Exclusive_section() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.CSR_sees_empty_bonus_bank_txtbox_Teacher_Exclusive();
		checkoutPage.CSR_sees_empty_paper_coupons_txtbox_Teacher_Exclusive();
	}

	@Given("^CSR adds YTO items to the cart such that it is below the automatic free shipping promotion$")
	public void csr_adds_YTO_items_to_the_cart_such_that_it_is_below_the_automatic_free_shipping_promotion() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_YTO_items_to_the_cart();
	}

	@When("^CSR applies partial bonus bank and paper coupons on the Paid Shipping section$")
	public void csr_applies_partial_bonus_bank_and_paper_coupons_on_the_Paid_Shipping_section() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.enter_amount_in_shipping_Bonus_Bank();
		checkoutPage.enter_amount_in_shipping_Paper_Bank();
	}

	@When("^CSR clicks on ‘Apply’ button for Paid Shipping section$")
	public void csr_clicks_on_Apply_button_for_Paid_Shipping_section() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.click_on_Apply_in_Shipping_section();
	}

	@Then("^CSR does not see the applied bonus bank and paper coupons on the Paid Shipping section$")
	public void csr_does_not_see_the_applied_bonus_bank_and_paper_coupons_on_the_Paid_Shipping_section() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.CSR_sees_empty_bonus_bank_txtbox_Paid_Shipping();
		checkoutPage.CSR_sees_empty_paper_coupons_txtbox_Paid_Shipping();
	}

	@Given("^CSR adds Teacher Exclusive items such that it is below the automatic free shipping promotion$")
	public void csr_adds_Teacher_Exclusive_items_such_that_it_is_below_the_automatic_free_shipping_promotion() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_Teacher_Exclusive_items_to_the_cart();
	}

	@Given("^CSR adds YTO items such that it is equal or more than the automatic free shipping promotion$")
	public void csr_adds_YTO_items_such_that_it_is_equal_or_more_than_the_automatic_free_shipping_promotion() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_YTO_items_to_the_cart();
	}

	@When("^CSR selects ‘NO’ on delete pop-up$")
	public void csr_selects_NO_on_delete_pop_up() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.CSR_selects_NO_on_Reset_modal();
	}

	@Then("^CSR sees the same applied bonus bank and paper coupons on the YTO section$")
	public void csr_sees_the_same_applied_bonus_bank_and_paper_coupons_on_the_YTO_section() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.CSR_sees_the_same_applied_bonus_bank_txtbox_YTO();
		checkoutPage.CSR_sees_the_same_applied_paper_coupons_txtbox_YTO();
	}

	@Then("^CSR sees the same applied bonus bank and paper coupons on the Teacher Exclusive section$")
	public void csr_sees_the_same_applied_bonus_bank_and_paper_coupons_on_the_Teacher_Exclusive_section() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.CSR_sees_the_same_applied_bonus_bank_txtbox_Teacher_Exclusive();
		checkoutPage.CSR_sees_the_same_applied_paper_coupons_txtbox_Teacher_Exclusive();
	}

	@Then("^CSR sees the same applied bonus bank and paper coupons on the Paid Shipping section$")
	public void csr_sees_the_same_applied_bonus_bank_and_paper_coupons_on_the_Paid_Shipping_section() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.CSR_sees_the_same_applied_bonus_bank_txtbox_Paid_Shipping();
		checkoutPage.CSR_sees_the_same_applied_paper_coupons_txtbox_Paid_Shipping();
	}

	@Then("^CSR sees the same previously entered manual coupons$")
	public void csr_sees_the_same_previously_entered_manual_coupons() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.CSR_sees_coupon_in_Rewards_section();
	}

	//################################################ SCSCOD-6993 ######################################################

	//############################################################# SCSCOD-7622 ###############################################################
	@Given("^teacher selects Credit Card as payment$")
	public void teacher_selects_Credit_Card_as_payment() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage = getFactory().getICheckoutPage().getShippingAndPaymentSection();

		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.unCheckPOP();
		PauseUtil.pause(3000);
		WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CREDITCARD);
	}

	@When("^teacher selects \\[Saved Card\\]$")
	public void teacher_selects_Saved_Card() throws Throwable {
		ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		checkoutPage.select_a_saved_credit_card();
	}

	@Then("^teacher does not see the ‘Remove’ link next to the ‘Edit’ link for \\[Saved Card\\]$")
	public void teacher_does_not_see_the_Remove_link_next_to_the_Edit_link_for_Saved_Card() throws Throwable {
		ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		checkoutPage.teacher_does_not_see_remove_link_for_saved_card();
	}

	@Given("^teacher selects Combination of Credit Card and Cheque as payment$")
	public void teacher_selects_Combination_of_Credit_Card_and_Cheque_as_payment() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage = getFactory().getICheckoutPage().getShippingAndPaymentSection();

		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.unCheckPOP();
		PauseUtil.pause(3000);
		WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CHECKSANDCREDITCARD);
	}

	@When("^CSR selects \\[Saved Card\\]$")
	public void csr_selects_Saved_Card() throws Throwable {
		ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		checkoutPage.select_a_saved_credit_card();
	}

	@When("^CSR clicks on the ‘Remove’ link next to the ‘Edit’ link$")
	public void csr_clicks_on_the_Remove_link_next_to_the_Edit_link() throws Throwable {
		ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		checkoutPage.CSR_selects_remove_link_for_saved_credit_card_PAYMENT();
	}

	@When("^CSR selects ‘YES’ from the delete modal$")
	public void csr_selects_YES_from_the_delete_modal() throws Throwable {
		ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		checkoutPage.CSR_selects_YES_on_delete_modal_remove_link_PAYMENT();
	}

	@Then("^CSR does not see \\[Saved Card\\] that was removed$")
	public void csr_does_not_see_Saved_Card_that_was_removed() throws Throwable {
		ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		checkoutPage.CSR_does_not_see_deleted_saved_card_PAYMENT();
	}

	@Given("^CSR selects Combination of Credit Card and Cheque as payment$")
	public void csr_selects_Combination_of_Credit_Card_and_Cheque_as_payment() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage = getFactory().getICheckoutPage().getShippingAndPaymentSection();

		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.unCheckPOP();
		PauseUtil.pause(3000);
		WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CHECKSANDCREDITCARD);
	}

	@When("^CSR selects ‘NO’ from the delete modal$")
	public void csr_selects_NO_from_the_delete_modal() throws Throwable {
		ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		checkoutPage.CSR_selects_NO_on_delete_modal_remove_link_PAYMENT();
	}

	@Then("^CSR still sees \\[Saved Card\\]$")
	public void csr_still_sees_Saved_Card() throws Throwable {
		ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		checkoutPage.CSR_sees_saved_card_PAYMENT();
	}
	//############################################################# SCSCOD-7622 ###############################################################

	@And("^teacher navigates to SFO page and adds SFO items to cart such that order qualifies for free shipping$")
	public void teacher_navigates_to_sfo_page_and_adds_sfo_items_to_cart_such_that_order_qualifies_for_free_shipping() throws Throwable {
		proddetails.add_store_sfoitems_multiplestudents();
		carttotals.get_totals_sfo_yto(studorderpage.getsfohometable());
	}

	@And("^teacher enters amount in Credit notes for SFO$")
	public void teacher_enters_amount_in_credit_notes_for_sfo() throws Throwable {
		ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		checkoutPage.teacher_applies_CreditNotes_for_SFO_section_in_Rewards_page();
	}

	@And("^teacher navigates to Redemptions & Rewards page and get the SFO Total value$")
	public void teacher_navigates_to_redemptions_rewards_page_and_get_the_sfo_total_value() throws Throwable {
		double SFO_Total_val=studorderpage.navigate_from_reviewcartpage_rewardsandredemptionspage_get_SFO_Total_val();
		Total_Owing_Amount_act_1.set_Total_SFO_Value_Rewards_page(SFO_Total_val);
		PauseUtil.pause(5000);
	}

	@And("^amount entered in credit notes is deducted from SFO total$")
	public void amount_entered_in_credit_notes_is_deducted_from_sfo_total() throws Throwable {
		ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		checkoutPage.validate_SFO_Total_after_redeem_creditNotes_in_Rewards_page(Total_Owing_Amount_act_1.get_Total_SFO_Value_Rewards_page());
	}

	@And("^teacher navigates to SFO page and adds SFO items to cart such that order has paid shipping$")
	public void teacher_navigates_to_sfo_page_and_adds_sfo_items_to_cart_such_that_order_has_paid_shipping() throws Throwable {
		proddetails.add_store_sfoitems_paid_shiiping_multiplestudents();
		carttotals.get_totals_sfo_yto(studorderpage.getsfohometable());
	}

	@And("^teacher enters amount in Credit notes for SFO Then amount entered in credit notes is deducted from SFO total$")
	public void teacher_enters_amount_in_credit_notes_for_sfo_then_amount_entered_in_credit_notes_is_deducted_from_sfo_total() throws Throwable {
		ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		checkoutPage.teacher_applies_CreditNotes_for_SFO_section_in_Rewards_page_and_validate_Total();
	}

	@And("^teacher enters amount in Bonus bank and Credit notes for shipping Then amount entered in credit notes and bonus bank is deducted from shipping total$")
	public void teacher_enters_amount_in_bonus_bank_and_credit_notes_for_shipping_then_amount_entered_in_credit_notes_and_bonus_bank_is_deducted_from_shipping_total() throws Throwable {
		ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		checkoutPage.teacher_applies_BBank_CNotes_for_Shipping_section_in_Rewards_page_and_validate_Total();
	}

	@And("^teacher enters amount in Credit notes which is equal to SFO total$")
	public void teacher_enters_amount_in_credit_notes_which_is_equal_to_sfo_total() throws Throwable {
		ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		checkoutPage.teacher_applies_CreditNotes_equal_as_SFO_section_in_Rewards_page_and_validate_Total();
	}

	@And("^teacher enters amount in Bonus bank and Credit notes which is equal to Shipping fee$")
	public void teacher_enters_amount_in_bonus_bank_and_credit_notes_which_is_equal_to_shipping_fee() throws Throwable {
		ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		checkoutPage.teacher_applies_BBank_CNotes_equal_as_Shipping_section_in_Rewards_page_and_validate_Total();
		carttotals.get_total_redemptionsandrewardspage();
	}

	@And("^teacher navigates to Confirm & Submit page from Payment page with correct totals and no Payment method to select$")
	public void teacher_navigates_to_confirm_submit_page_from_payment_page_with_correct_totals_and_no_payment_method_to_select() throws Throwable {
		WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
		SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
		proddetails.verify_sfo_iteminformation_checkoutpages();
		//carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","Confirmpage");
		carttotals.get_total_confirmsubmitpage();
		carttotals.compare_Paymentpagetotal_confirmsubmitpage();
		//carttotals.compare_totals_reviewcart("SFOItems","Confirmpage");
	}

	@And("^teacher navigates to Confirm & Submit page from Payment page with correct totals$")
	public void teacher_navigates_to_confirm_submit_page_from_payment_page_with_correct_totals() throws Throwable {
		studorderpage.navigate_from_paymentpage_to_confirmsubmitpage();
		PauseUtil.pause(4000);
		proddetails.verify_sfo_iteminformation_checkoutpages();
		//carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","Confirmpage");
		carttotals.get_total_confirmsubmitpage();
		carttotals.compare_Paymentpagetotal_confirmsubmitpage();
		//carttotals.compare_totals_reviewcart("SFOItems","Confirmpage");
	}

	@And("^teacher navigates to Redemptions & Rewards page with correct totals with free shipping$")
	public void teacher_navigates_to_redemptions_rewards_page_with_correct_totals_with_free_shipping() throws Throwable {
		studorderpage.navigate_from_reviewcartpage_rewardsandredemptionspage();
		PauseUtil.pause(4000);
		carttotals.get_total_redemptionsandrewardspage();
		carttotals.compare_reviewcarttotal_rewardspagetotal();
	}

	@And("^teacher navigates to Confirm & Submit page from Rewards page with correct totals$")
	public void teacher_navigates_to_confirm_submit_page_from_rewards_page_with_correct_totals() throws Throwable {
		studorderpage.navigate_from_rewardspage_confirmandsubmitpage();
		PauseUtil.pause(4000);
		proddetails.verify_sfo_iteminformation_checkoutpages();
		carttotals.get_totals_checkoutpages_sfo_yto("SFOItems","ConfirmSubmitpage");
		carttotals.compare_totals_reviewcart("SFOItems","ConfirmSubmitpage");
	}

	@And("^teacher navigates to Redemptions & Rewards page and get the YTO Total value$")
	public void teacher_navigates_to_redemptions_rewards_page_and_get_the_yto_total_value() throws Throwable {
		double YTO_Total_val=studorderpage.navigate_from_reviewcartpage_rewardsandredemptionspage_get_YTO_Total_val();
		Total_Owing_Amount_act_1.set_Total_YTO_Value_Rewards_page(YTO_Total_val);
		PauseUtil.pause(5000);
	}

	@And("^teacher navigates to Confirm & Submit page from Payment page with correct SFO and YTO item information and totals$")
	public void teacher_navigates_to_confirm_submit_page_from_payment_page_with_correct_sfo_and_yto_item_information_and_totals() throws Throwable {
		studorderpage.navigate_from_paymentpage_to_confirmsubmitpage();
		PauseUtil.pause(4000);
		carttotals.get_total_confirmsubmitpage();
		carttotals.compare_rewardspagetotal_Paymentpagetotal();
	}

	@Then("^teacher sees the correct SFO and YTO item information and totals in Confirmation page$")
	public void teacher_sees_the_correct_sfo_and_yto_item_information_and_totals_in_confirmation_page() throws Throwable {
		carttotals.get_total_confirmationpage();
		carttotals.compare_confirmsubmitpage_confirmationpage();
	}

	@And("^teacher navigates to YTO page and adds YTO items to cart such that order eligibles for free shipping$")
	public void teacher_navigates_to_yto_page_and_adds_yto_items_to_cart_such_that_order_eligibles_for_free_shipping() throws Throwable {
		proddetails.add_store_yto_items_different_flyers();
		carttotals.get_totals_sfo_yto(studorderpage.getsfohometable());
	}

	@And("^teacher navigates to YTO page and adds YTO items to cart such that order has paid shipping$")
	public void teacher_navigates_to_yto_page_and_adds_yto_items_to_cart_such_that_order_has_paid_shipping() throws Throwable {
		proddetails.add_store_yto_items_different_flyers();
		carttotals.get_totals_sfo_yto(studorderpage.getsfohometable());
	}

	@And("^ADD button is not enabled state$")
	public void add_button_is_not_enabled_state() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_ADD_button_state_disable_SFO_section();
	}


	//######################################################## DWCAPCOD-103 ##################################################################
	@When("^teacher(\\d+) selects the minus sign on SOO section$")
	public void teacher_selects_the_minus_sign_on_SOO_section(int arg1) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_select_minus_sign_SOO_section_reviewCart();
	}

	@Then("^the Student Online Orders section collapses$")
	public void the_Student_Online_Orders_section_collapses() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_SOO_section_not_displayed_reviewCart();
	}

	@Then("^the minus sign changes to a plus sign on SOO section$")
	public void the_minus_sign_changes_to_a_plus_sign_on_SOO_section() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_minus_sign_changed_to_plus_sign_SOO_section_reviewCart();
	}

	@When("^teacher(\\d+) selects the plus sign on SOO section$")
	public void teacher_selects_the_plus_sign_on_SOO_section(int arg1) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_select_plus_sign_SOO_section_reviewCart();
	}

	@Then("^the Student Online Orders section expands$")
	public void the_Student_Online_Orders_section_expands() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_SOO_section_displayed_reviewCart();
	}

	@Then("^the plus sign changes to a minus sign on SOO section$")
	public void the_plus_sign_changes_to_a_minus_sign_on_SOO_section() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_plus_sign_changed_to_minus_sign_SOO_section_reviewCart();
	}

	@Then("^order is grouped by child(\\d+) with correct Item number, title, Flyer, price and quantity$")
	public void order_is_grouped_by_child_with_correct_Item_number_title_Flyer_price_quantity(int childNumber) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_verify_itemNumber_reviewCart_SOO(childNumber);
		studentFlyerOrdersPage.tcod_verify_itemTitle_reviewCart_SOO(childNumber);
		studentFlyerOrdersPage.tcod_verify_itemFlyer_reviewCart_SOO(childNumber);
		studentFlyerOrdersPage.tcod_verify_itemPrice_reviewCart_SOO(childNumber);
		studentFlyerOrdersPage.tcod_verify_itemQuantity_reviewCart_SOO(childNumber);
	}

	@Then("^child(\\d+)’s subtotal is displayed$")
	public void child_s_subtotal_is_displayed(int childNumber) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_verify_subTotal_reviewCart_SOO(childNumber);
	}

	@Then("^child(\\d+)’s tax total is displayed \\[GST_PST\\]$")
	public void child_s_tax_total_is_displayed_GST_PST(int childNumber) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_verify_GST_tax_total_reviewCart_SOO(childNumber);
		studentFlyerOrdersPage.tcod_verify_PST_tax_total_reviewCart_SOO(childNumber);
	}

	@Then("^child(\\d+)’s overall total is displayed \\[GST_PST\\]$")
	public void child_s_overall_total_is_displayed_GST_PST(int childNumber) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_verify_overall_total_GST_PST_reviewCart_SOO(childNumber);
	}

	@Then("^cumulative total for all Student Online Orders on Review Cart$")
	public void cumulative_total_for_all_Student_Online_Orders_on_Review_Cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_verify_cumulative_total_reviewCart_SOO();
	}

	@Then("^order placed date is displayed below child(\\d+)$")
	public void order_placed_date_is_displayed_below_child(int childNumber) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_verify_placed_date_reviewCart_SOO(childNumber);
	}

	@Then("^teacher(\\d+) sees the message \"([^\"]*)\" under the SOO section for child(\\d+)$")
	public void teacher_sees_the_message_under_the_SOO_section(int arg1, String arg2, int childNumber) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_verify_no_order_msg_reviewCart_SOO(childNumber);
	}

	@Then("^child(\\d+)’s tax total is displayed \\[HST\\]$")
	public void child_s_tax_total_is_displayed_HST(int childNumber) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_verify_HST_tax_total_reviewCart_SOO(childNumber);
	}

	@Then("^child(\\d+)’s overall total is displayed \\[HST\\]$")
	public void child_s_overall_total_is_displayed_HST(int childNumber) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_verify_overall_total_HST_reviewCart_SOO(childNumber);
	}

	@Then("^child(\\d+)’s subtotal is displayed as \\$(\\d+)$")
	public void child_s_subtotal_is_displayed_as_$(int childNumber, int arg2) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_verify_subTotal_reviewCart_SOO(childNumber);
	}

	@Then("^child(\\d+)’s tax total is displayed as \\$(\\d+)$")
	public void child_s_tax_total_is_displayed_as_$(int childNumber, int arg2) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_verify_GST_tax_total_reviewCart_SOO(childNumber);
	}

	@Then("^child(\\d+)’s overall total is displayed as \\$(\\d+)$")
	public void child_s_overall_total_is_displayed_as_$(int childNumber, int arg2) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_verify_overall_total_GST_reviewCart_SOO(childNumber);
	}

	@Then("^child(\\d+)’s tax total is displayed \\[GST\\]$")
	public void child_s_tax_total_is_displayed_GST(int childNumber) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_verify_GST_tax_total_reviewCart_SOO(childNumber);
	}

	@Then("^child(\\d+)’s overall total is displayed \\[GST\\]$")
	public void child_s_overall_total_is_displayed_GST(int childNumber) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_verify_overall_total_GST_reviewCart_SOO(childNumber);
	}

	@Then("^child(\\d+)’s tax total is displayed \\[GST_QST\\]$")
	public void child_s_tax_total_is_displayed_GST_QST(int childNumber) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_verify_GST_tax_total_reviewCart_SOO(childNumber);
		studentFlyerOrdersPage.tcod_verify_QST_tax_total_reviewCart_SOO(childNumber);
	}

	@Then("^child(\\d+)’s overall total is displayed \\[GST_QST\\]$")
	public void child_s_overall_total_is_displayed_GST_QST(int childNumber) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_verify_overall_total_GST_QST_reviewCart_SOO(childNumber);
	}

	@Then("^child(\\d+)’s tax total is displayed \\[Tax Exempted - GST\\]$")
	public void child_s_tax_total_is_displayed_Tax_Exempted(int childNumber) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_verify_GST_tax_total_reviewCart_SOO(childNumber);
	}

	@Then("^child(\\d+)’s overall total is displayed \\[Tax Exempted - GST\\]$")
	public void child_s_overall_total_is_displayed_Tax_Exempted(int childNumber) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.tcod_verify_overall_total_GST_reviewCart_SOO(childNumber);
	}
	//######################################################## DWCAPCOD-103 ##################################################################

	@Then("^Error message is displayed for Account Number field$")
	public void error_message_is_displayed_for_account_number_field() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_error_msg_diaplayed_for_Account_Number_fld_in_PaymentPage();
	}

	@Then("^Error message is displayed for Board\\/School Number field$")
	public void error_message_is_displayed_for_boardschool_number_field() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_error_msg_diaplayed_for_Board_School_Number_fld_in_PaymentPage();
	}

  /*  @Then("^SOO notification message is not displayed$")
    public void soo_notification_message_is_not_displayed() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
    	studentFlyerOrdersPage.CSR_verify_SOO_notification_not_displayed_ReviewCart_page();
    }*/

	@And("^CSR searches for a teacher account with pending SOO items in cart and navigates to Verify Account Page$")
	public void csr_searches_for_a_teacher_account_with_pending_soo_items_in_cart_and_navigates_to_verify_account_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_the_Ac_Num_and_select_in_Search_Results();
	}

	@Then("^SOO notification message displays$")
	public void soo_notification_message_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_SOO_notification_displayed_ReviewCart_page();
	}

	@And("^the include orders checkbox is not selected by default$")
	public void the_include_orders_checkbox_is_not_selected_by_default() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_SOO_orders_chkbox_not_selected_ReviewCart_page();
	}

	@And("^no SOO orders displays in Cart page$")
	public void no_soo_orders_displays_in_cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_SOO_items_list_not_displayed_ReviewCart_page();
	}

	@Given("^implementation is pending for this$")
	public void implementation_is_pending_for_this() throws Throwable {
		Assert.fail("Implementation is pending for this scenario");
	}

	@Then("^SOO orders display in the cart page$")
	public void soo_orders_display_in_the_cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_SOO_items_list_is_displayed_ReviewCart_page();
	}

	@And("^CSR checks the include orders checkbox$")
	public void csr_checks_the_include_orders_checkbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_selects_SOO_Include_Orders_chkbox_ReviewCart_page();
	}
	
	@Given("^CSR excludes the SOO orders on Review Cart page$")
	public void csr_excludes_the_SOO_orders_on_Review_Cart_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_unchecks_SOO_order_section_Review_Cart();
	}
	
    @Then("^blue header on SOO displays with correct total and no\\. of items as in SOO Child's total$")
    public void blue_header_on_soo_displays_with_correct_total_and_no_of_items_as_in_soo_childs_total() throws Throwable {
    	CartPage cartpage = new CartPage();
    	cartpage.store_all_information_from_rewards_page("SOO");
       cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
    }
    
    @Then("^blue header on SOO displays with correct total and no\\. of items as in Child1 \\+ Child2's total$")
    public void blue_header_on_soo_displays_with_correct_total_and_no_of_items_as_in_child1_child2s_total() throws Throwable {
    	CartPage cartpage = new CartPage();
    	cartpage.store_all_information_from_rewards_page("SOO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
    }
    
    @Then("^blue header on SOO displays with correct total and no\\. of items as in Child1's total$")
    public void blue_header_on_soo_displays_with_correct_total_and_no_of_items_as_in_child1s_total() throws Throwable {
    	CartPage cartpage = new CartPage();
    	cartpage.store_all_information_from_rewards_page("SOO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
    }
    
    @Then("^blue header on SOO displays with correct total and no\\. of items as in Child2's total$")
    public void blue_header_on_soo_displays_with_correct_total_and_no_of_items_as_in_child2s_total() throws Throwable {
    	CartPage cartpage = new CartPage();
    	cartpage.store_all_information_from_rewards_page("SOO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
    }
    
    @Then("^blue header on SOO displays with correct total and no\\. of items as in Child3's total$")
    public void blue_header_on_soo_displays_with_correct_total_and_no_of_items_as_in_child3s_total() throws Throwable {
    	CartPage cartpage = new CartPage();
    	cartpage.store_all_information_from_rewards_page("SOO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
    }
    
    
    @Then("^blue header on SOO displays with \\$0\\.00 as total and no\\. of items as 0$")
    public void blue_header_on_soo_displays_with_000_as_total_and_no_of_items_as_0() throws Throwable {
    	CartPage cartpage = new CartPage();
    	cartpage.store_all_information_from_rewards_page("SOO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
    }
    
    @And("^correct SOO Subtotal, taxes and SOO Total displays as in SOO Child's total$")
    public void correct_soo_subtotal_taxes_and_soo_total_displays_as_in_soo_childs_total() throws Throwable {
    	//not storing items here again as we have done in above gherkin. else it will duplicate the values
    	cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
    }
    
    @And("^correct SOO Subtotal, taxes and SOO Total displays as in Child3's total$")
    public void correct_soo_subtotal_taxes_and_soo_total_displays_as_in_child3s_total() throws Throwable {
    	cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
    }
    
    @And("^\\$0\\.00 displays for SOO Subtotal, taxes and SOO Total$")
    public void zero_displays_for_soo_subtotal_taxes_and_soo_total() throws Throwable {
    	cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
    }
    
    @And("^blue header on SFO displays with correct total and no\\. of items$")
    public void blue_header_on_sfo_displays_with_correct_total_and_no_of_items() throws Throwable {
    	CartPage cartpage = new CartPage();
    	cartpage.store_all_information_from_rewards_page("SFO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SFO");
    }
    
	@And("^correct Child wise subtotal, taxes, total displays$")
	public void correct_child_wise_subtotal_taxes_total_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		//studentFlyerOrdersPage.CSR_verify_SOO_items_list_not_displayed_ReviewCart_page();
	}

	@And("^correct Your Earning Rewards on total displays$")
	public void correct_your_earning_rewards_on_total_displays() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		//studentFlyerOrdersPage.CSR_verify_SOO_items_list_not_displayed_ReviewCart_page();
	}

    @And("^blue header on SFO displays with SFO total\\(post tax post redemption amount\\) and no\\. of items$")
    public void blue_header_on_sfo_displays_with_sfo_totalpost_tax_post_redemption_amount_and_no_of_items() throws Throwable {
    	CartPage cartpage = new CartPage();
    	cartpage.store_all_information_from_rewards_page("SFO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SFO");
    }
    
    @And("^correct Teacher Exclusives Subtotal, taxes and Teacher Exclusives Total displays$")
    public void correct_teacher_exclusives_subtotal_taxes_and_teacher_exclusives_total_displays() throws Throwable {
    	cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("TE");
    }
    
    @And("^correct Teacher Exclusives Subtotal, taxes and Teacher Exclusives Total\\(post tax post redemption amount\\) displays$")
    public void correct_teacher_exclusives_subtotal_taxes_and_teacher_exclusives_totalpost_tax_post_redemption_amount_displays() throws Throwable {
    	cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("TE");
    }

	@When("^CSR unchecks the include orders checkbox$")
	public void csr_unchecks_the_include_orders_checkbox() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_unselect_SOO_Include_Orders_chkbox_ReviewCart_page();
	}

	@And("^correct SOO Subtotal, taxes and SOO Total displays as in Child1's total$")
	public void correct_soo_subtotal_taxes_and_soo_total_displays_as_in_child1s_total() throws Throwable {
		cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
	}

	@And("^correct SOO Subtotal, taxes and SOO Total displays as in Child1 \\+ Child2's total$")
	public void correct_soo_subtotal_taxes_and_soo_total_displays_as_in_child1_child2s_total() throws Throwable {
		cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
	}

	@And("^correct SOO Subtotal, taxes and SOO Total displays as in Child2's total$")
	public void correct_soo_subtotal_taxes_and_soo_total_displays_as_in_child2s_total() throws Throwable {
		cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
	}

	@And("^correct SFO Subtotal, taxes and SFO Total displays$")
	public void correct_sfo_subtotal_taxes_and_sfo_total_displays() throws Throwable {
		//not storing items here again as we have done in above gherkin. else it will duplicate the values
		cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SFO");
	}

	@And("^correct SFO Subtotal, taxes and SFO Total\\(post tax post redemption amount\\) displays$")
	public void correct_sfo_subtotal_taxes_and_sfo_totalpost_tax_post_redemption_amount_displays() throws Throwable {
		cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SFO");
	}

	@And("^blue header on YTO displays with correct total and no\\. of items$")
	public void blue_header_on_yto_displays_with_correct_total_and_no_of_items() throws Throwable {
		CartPage cartpage = new CartPage();
		cartpage.store_all_information_from_rewards_page("YTO");
		cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("YTO");
	}

	@And("^blue header on YTO displays with correct total\\(post tax post redemption amount\\) and no\\. of items$")
	public void blue_header_on_yto_displays_with_correct_totalpost_tax_post_redemption_amount_and_no_of_items() throws Throwable {
		CartPage cartpage = new CartPage();
		cartpage.store_all_information_from_rewards_page("YTO");
		cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("YTO");
	}

	@And("^blue header on Teacher Exclusives displays with correct total and no\\. of items$")
	public void blue_header_on_teacher_exclusives_displays_with_correct_total_and_no_of_items() throws Throwable {
		CartPage cartpage = new CartPage();
		cartpage.store_all_information_from_rewards_page("TE");
		cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("TE");
	}

	@And("^blue header on Teacher Exclusives displays with correct total\\(post tax post redemption amount\\) and no\\. of items$")
	public void blue_header_on_teacher_exclusives_displays_with_correct_totalpost_tax_post_redemption_amount_and_no_of_items() throws Throwable {
		CartPage cartpage = new CartPage();
		cartpage.store_all_information_from_rewards_page("TE");
		cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("TE");
	}

	@And("^correct YTO Subtotal, taxes and YTO Total displays$")
	public void correct_yto_subtotal_taxes_and_yto_total_displays() throws Throwable {
		//not storing items here again as we have done in above gherkin. else it will duplicate the values
		cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("YTO");
	}

	@And("^correct YTO Subtotal, taxes and YTO Total\\(post tax post redemption amount\\) displays$")
	public void correct_yto_subtotal_taxes_and_yto_totalpost_tax_post_redemption_amount_displays() throws Throwable {
		cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("YTO");
	}

	@And("^“Rewards earned with Today's Qualifying Order Value of” displays (.+)$")
	public void rewards_earned_with_todays_qualifying_order_value_of_displays(String soosubtotalsfosubtotalytosubtotal) throws Throwable {
		CartPage cartpage = new CartPage();
		cartpage.store_all_information_from_rewards_page("SOO");
		cartpage.store_all_information_from_rewards_page("SFO");
		cartpage.store_all_information_from_rewards_page("YTO");
		cartpage.store_all_information_from_rewards_page("TE");
		cartpage.verify_rewardsearned_amount_in_rewardspage();
	}
    
    @And("^\\$0\\.00 displays in “Rewards earned with Today's Qualifying Order Value of”$")
    public void zero_displays_in_rewards_earned_with_todays_qualifying_order_value_of() throws Throwable {
    	CartPage cartpage = new CartPage();
    	cartpage.store_all_information_from_rewards_page("SOO");
    	cartpage.store_all_information_from_rewards_page("SFO");
    	cartpage.store_all_information_from_rewards_page("YTO");
    	cartpage.store_all_information_from_rewards_page("TE");
    	cartpage.verify_rewardsearned_amount_in_rewardspage();
    }
    
    @And("^SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child1's Subtotal$")
	public void soo_subtotal_displays_in_rewards_earned_with_todays_qualifying_order_value_of_as_in_child1s_subtotal() throws Throwable {
    	CartPage cartpage = new CartPage();
    	cartpage.store_all_information_from_rewards_page("SOO");
		cartpage.store_all_information_from_rewards_page("SFO");
		cartpage.store_all_information_from_rewards_page("YTO");
		cartpage.store_all_information_from_rewards_page("TE");
		cartpage.verify_rewardsearned_amount_in_rewardspage();
	}

	@And("^SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child2's Subtotal$")
	public void soo_subtotal_displays_in_rewards_earned_with_todays_qualifying_order_value_of_as_in_child2s_subtotal() throws Throwable {
		CartPage cartpage = new CartPage();
		cartpage.store_all_information_from_rewards_page("SOO");
		cartpage.store_all_information_from_rewards_page("SFO");
		cartpage.store_all_information_from_rewards_page("YTO");
		cartpage.store_all_information_from_rewards_page("TE");
		cartpage.verify_rewardsearned_amount_in_rewardspage();
	}

	@And("^SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child1 \\+ Child2's Subtotal$")
	public void soo_subtotal_displays_in_rewards_earned_with_todays_qualifying_order_value_of_as_in_child1_child2s_subtotal() throws Throwable {
		CartPage cartpage = new CartPage();
		cartpage.store_all_information_from_rewards_page("SOO");
		cartpage.store_all_information_from_rewards_page("SFO");
		cartpage.store_all_information_from_rewards_page("YTO");
		cartpage.store_all_information_from_rewards_page("TE");
		cartpage.verify_rewardsearned_amount_in_rewardspage();
	}

	@And("^SOO Subtotal displays in “Rewards earned with Today's Qualifying Order Value of” as in Child3's Subtotal$")
	public void soo_subtotal_displays_in_rewards_earned_with_todays_qualifying_order_value_of_as_in_child3s_subtotal() throws Throwable {
		CartPage cartpage = new CartPage();
		cartpage.store_all_information_from_rewards_page("SOO");
		cartpage.store_all_information_from_rewards_page("SFO");
		cartpage.store_all_information_from_rewards_page("YTO");
		cartpage.store_all_information_from_rewards_page("TE");
		cartpage.verify_rewardsearned_amount_in_rewardspage();
	}
	
	@Given("^teacher has pending parent items in cart whose pre\\-tax subtotal qualifies for min\\. amount for Freepick coupon$")
    public void teacher_has_pending_parent_items_in_cart_whose_pretax_subtotal_qualifies_for_min_amount_for_freepick_coupon() throws Throwable {
		System.out.println("Teacher has SOO orders in cart");
    }
	
	@Given("^teacher has pending parent items in cart whose pre\\-tax subtotal qualifies for min\\. amount for Bonus Flat coupon$")
    public void teacher_has_pending_parent_items_in_cart_whose_pretax_subtotal_qualifies_for_min_amount_for_bonus_flat_coupon() throws Throwable {
		System.out.println("Teacher has SOO orders in cart");
    }
	
	@Given("^teacher has pending parent items in cart whose pre\\-tax subtotal qualifies for min\\. amount for TGAT coupon$")
    public void teacher_has_pending_parent_items_in_cart_whose_pretax_subtotal_qualifies_for_min_amount_for_tgat_coupon() throws Throwable {
		System.out.println("Teacher has SOO orders in cart");
    }
	
	@Given("^teacher has pending parent items in cart whose pre\\-tax subtotal qualifies for min\\. amount for Free Item coupon$")
    public void teacher_has_pending_parent_items_in_cart_whose_pretax_subtotal_qualifies_for_min_amount_for_free_item_coupon() throws Throwable {
		System.out.println("Teacher has SOO orders in cart");
    }
	
	@Given("^teacher has pending parent items in cart whose pre\\-tax subtotal qualifies for min\\. amount for Free Shipping coupon$")
    public void teacher_has_pending_parent_items_in_cart_whose_pretax_subtotal_qualifies_for_min_amount_for_free_shipping_coupon() throws Throwable {
		System.out.println("Teacher has SOO orders in cart");
    }
	
	@Given("^teacher has pending parent items in cart whose pre\\-tax subtotal qualifies for min\\. amount for Bonus Flat promotion$")
    public void teacher_has_pending_parent_items_in_cart_whose_pretax_subtotal_qualifies_for_min_amount_for_bonus_flat_promotion() throws Throwable {
		System.out.println("Teacher has SOO orders in cart");
    }
	
	@Given("^teacher has pending parent items in cart whose pre\\-tax subtotal qualifies for min\\. amount for Free Item promotion$")
    public void teacher_has_pending_parent_items_in_cart_whose_pretax_subtotal_qualifies_for_min_amount_for_free_item_promotion() throws Throwable {
		System.out.println("Teacher has SOO orders in cart");
    }
	
	@Given("^teacher has pending parent items in cart whose pre\\-tax subtotal qualifies for min\\. amount for Student Incentive promotion$")
    public void teacher_has_pending_parent_items_in_cart_whose_pretax_subtotal_qualifies_for_min_amount_for_student_incentive_promotion() throws Throwable {
		System.out.println("Teacher has SOO orders in cart");
    }
	
	@Given("^teacher has pending parent items in cart whose pre\\-tax subtotal qualifies for min\\. amount for Spell Scholastic promotion$")
    public void teacher_has_pending_parent_items_in_cart_whose_pretax_subtotal_qualifies_for_min_amount_for_spell_scholastic_promotion() throws Throwable {
		System.out.println("Teacher has SOO orders in cart");
    }
	
	@Given("^teacher has pending parent items in cart whose pre\\-tax subtotal is less than min\\. amount for SFO coupon$")
    public void teacher_has_pending_parent_items_in_cart_whose_pretax_subtotal_is_less_than_min_amount_for_sfo_coupon() throws Throwable {
		System.out.println("Teacher has SOO orders in cart");
    }
	
	@Given("^teacher has pending parent items in cart whose pre\\-tax subtotal is less than min\\. amount for freepick coupon$")
    public void teacher_has_pending_parent_items_in_cart_whose_pretax_subtotal_is_less_than_min_amount_for_freepick_coupon() throws Throwable {
		System.out.println("Teacher has SOO orders in cart");
    }
	
	@Given("^teacher has pending parent items in cart whose pre\\-tax subtotal is less than min\\. amount for Bonus Flat coupon$")
    public void teacher_has_pending_parent_items_in_cart_whose_pretax_subtotal_is_less_than_min_amount_for_bonus_flat_coupon() throws Throwable {
		System.out.println("Teacher has SOO orders in cart");
    }
	
	@Given("^teacher has pending parent items in cart whose pre\\-tax subtotal is less than min\\. amount for TGAT coupon$")
    public void teacher_has_pending_parent_items_in_cart_whose_pretax_subtotal_is_less_than_min_amount_for_tgat_coupon() throws Throwable {
		System.out.println("Teacher has SOO orders in cart");
    }
	
	@Given("^teacher has pending parent items in cart whose pre\\-tax subtotal is less than min\\. amount for FreeItem coupon$")
    public void teacher_has_pending_parent_items_in_cart_whose_pretax_subtotal_is_less_than_min_amount_for_freeitem_coupon() throws Throwable {
		System.out.println("Teacher has SOO orders in cart");
    }
	
	@Given("^teacher has pending parent items in cart whose pre\\-tax subtotal is less than min\\. amount for Bonus Flat Promotion$")
    public void teacher_has_pending_parent_items_in_cart_whose_pretax_subtotal_is_less_than_min_amount_for_bonus_flat_promotion() throws Throwable {
		System.out.println("Teacher has SOO orders in cart");
    }
	
	@Given("^teacher has pending parent items in cart whose pre\\-tax subtotal is less than min\\. amount for Student Incentive promotion$")
    public void teacher_has_pending_parent_items_in_cart_whose_pretax_subtotal_is_less_than_min_amount_for_student_incentive_promotion() throws Throwable {
		System.out.println("Teacher has SOO orders in cart");
    }
	
	@Given("^teacher has pending parent items in cart whose pre\\-tax subtotal is less than min\\. amount for Free Item Promotion$")
    public void teacher_has_pending_parent_items_in_cart_whose_pretax_subtotal_is_less_than_min_amount_for_free_item_promotion() throws Throwable {
		System.out.println("Teacher has SOO orders in cart");
    }
	
	@Given("^teacher has pending parent items in cart whose pre\\-tax subtotal is less than min\\. amount for Spell Scholastic$")
    public void teacher_has_pending_parent_items_in_cart_whose_pretax_subtotal_is_less_than_min_amount_for_spell_scholastic() throws Throwable {
		System.out.println("Teacher has SOO orders in cart");
    }
	
	@Given("^teacher has pending parent items in cart whose pre\\-tax subtotal is less than min\\. amount for YTO coupon$")
    public void teacher_has_pending_parent_items_in_cart_whose_pretax_subtotal_is_less_than_min_amount_for_yto_coupon() throws Throwable {
		System.out.println("Teacher has SOO orders in cart");
    }
	
	@Given("^teacher has pending parent orders in cart whose pre\\-tax subtotal qualifies for min\\. amount for Bonus Flat promotion$")
    public void teacher_has_pending_parent_orders_in_cart_whose_pretax_subtotal_qualifies_for_min_amount_for_bonus_flat_promotion() throws Throwable {
		System.out.println("Teacher has SOO orders in cart");
    }
	
	@And("^teacher navigates to Coupons & Rewards page from Home page$")
    public void teacher_navigates_to_coupons_rewards_page_from_home_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_clicks_on_mini_ReviewCart_btn();
		studentFlyerOrdersPage.teacher_clicks_on_Continue_checkout_in_ReviewCart_page();
    }
	
	@And("^teacher adds items to SFO such that SOO \\+ SFO pre\\-tax subtotal meets the min\\. amount for SFO coupon$")
    public void teacher_adds_items_to_sfo_such_that_soo_sfo_pretax_subtotal_meets_the_min_amount_for_sfo_coupon() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigate_to_SFO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_student();
    }
	
	@And("^teacher adds items to SFO such that SOO \\+ SFO pre\\-tax subtotal meets the min\\. amount for freepick coupon$")
    public void teacher_adds_items_to_sfo_such_that_soo_sfo_pretax_subtotal_meets_the_min_amount_for_freepick_coupon() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigate_to_SFO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_student();
    }
	
	@And("^teacher adds items to SFO such that SOO \\+ SFO pre\\-tax subtotal meets the min\\. amount for Bonus Flat coupon$")
    public void teacher_adds_items_to_sfo_such_that_soo_sfo_pretax_subtotal_meets_the_min_amount_for_bonus_flat_coupon() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigate_to_SFO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_student();
    }
	
	@And("^teacher adds items to SFO such that SOO \\+ SFO pre\\-tax subtotal meets the min\\. amount for TGAT coupon$")
    public void teacher_adds_items_to_sfo_such_that_soo_sfo_pretax_subtotal_meets_the_min_amount_for_tgat_coupon() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigate_to_SFO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_student();
    }
	
	@And("^teacher adds items to SFO such that SOO \\+ SFO pre\\-tax subtotal meets the min\\. amount for FreeItem coupon$")
    public void teacher_adds_items_to_sfo_such_that_soo_sfo_pretax_subtotal_meets_the_min_amount_for_freeitem_coupon() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigate_to_SFO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_studentXML();
    }
	
	@And("^teacher adds items to SFO such that SOO \\+ SFO pre\\-tax subtotal meets the min\\. amount for Bonus Flat Promotion$")
    public void teacher_adds_items_to_sfo_such_that_soo_sfo_pretax_subtotal_meets_the_min_amount_for_bonus_flat_promotion() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigate_to_SFO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_student();
    }
	
	@And("^teacher adds items to SFO such that SOO \\+ SFO pre\\-tax subtotal meets the min\\. amount for Student Incentive promotion$")
    public void teacher_adds_items_to_sfo_such_that_soo_sfo_pretax_subtotal_meets_the_min_amount_for_student_incentive_promotion() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigate_to_SFO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_student();
    }
	
	@And("^teacher adds items to SFO such that SOO \\+ SFO pre\\-tax subtotal meets the min\\. amount for Free Item Promotion$")
    public void teacher_adds_items_to_sfo_such_that_soo_sfo_pretax_subtotal_meets_the_min_amount_for_free_item_promotion() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigate_to_SFO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_student();
    }
	
	@And("^teacher adds items to SFO such that SOO \\+ SFO pre\\-tax subtotal meets the min\\. amount for Spell Scholastic$")
    public void teacher_adds_items_to_sfo_such_that_soo_sfo_pretax_subtotal_meets_the_min_amount_for_spell_scholastic() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigate_to_SFO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_studentXML();
    }
	
	@And("^teacher adds items to YTO such that SOO \\+ YTO pre\\-tax subtotal meets the min\\. amount for YTO coupon$")
    public void teacher_adds_items_to_yto_such_that_soo_yto_pretax_subtotal_meets_the_min_amount_for_yto_coupon() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigates_to_YTO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_single_YTO_item_to_the_cart();
    }
	
	@And("^teacher adds items to YTO such that SOO \\+ YTO pre\\-tax subtotal meets the min\\. amount for freepick coupon$")
    public void teacher_adds_items_to_yto_such_that_soo_yto_pretax_subtotal_meets_the_min_amount_for_freepick_coupon() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigates_to_YTO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_single_YTO_item_to_the_cart();
    }
	
	@And("^teacher adds items to YTO such that SOO \\+ YTO pre\\-tax subtotal meets the min\\. amount for Bonus Flat coupon$")
    public void teacher_adds_items_to_yto_such_that_soo_yto_pretax_subtotal_meets_the_min_amount_for_bonus_flat_coupon() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigates_to_YTO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_single_YTO_item_to_the_cart();
    }
	
	@And("^teacher adds items to YTO such that SOO \\+ YTO pre\\-tax subtotal meets the min\\. amount for TGAT coupon$")
    public void teacher_adds_items_to_yto_such_that_soo_yto_pretax_subtotal_meets_the_min_amount_for_tgat_coupon() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigates_to_YTO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_single_YTO_item_to_the_cart();
    }
	
	@And("^teacher adds items to YTO such that SOO \\+ YTO pre\\-tax subtotal meets the min\\. amount for FreeItem coupon$")
    public void teacher_adds_items_to_yto_such_that_soo_yto_pretax_subtotal_meets_the_min_amount_for_freeitem_coupon() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigates_to_YTO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_single_YTO_item_to_the_cart();
    }
	
	@And("^teacher adds items to YTO such that SOO \\+ YTO pre\\-tax subtotal meets the min\\. amount for Bonus Flat Promotion$")
    public void teacher_adds_items_to_yto_such_that_soo_yto_pretax_subtotal_meets_the_min_amount_for_bonus_flat_promotion() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigates_to_YTO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_single_YTO_item_to_the_cart();
    }
	
	@And("^teacher adds items to YTO such that SOO \\+ YTO pre\\-tax subtotal meets the min\\. amount for Student Incentive promotion$")
    public void teacher_adds_items_to_yto_such_that_soo_yto_pretax_subtotal_meets_the_min_amount_for_student_incentive_promotion() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigates_to_YTO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_single_YTO_item_to_the_cart();
    }
	
	@And("^teacher adds items to YTO such that SOO \\+ YTO pre\\-tax subtotal meets the min\\. amount for Free Item Promotion$")
    public void teacher_adds_items_to_yto_such_that_soo_yto_pretax_subtotal_meets_the_min_amount_for_free_item_promotion() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigates_to_YTO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_single_YTO_item_to_the_cart();
    }
	
	@And("^teacher adds items to YTO such that SOO \\+ YTO pre\\-tax subtotal meets the min\\. amount for Spell Scholastic$")
    public void teacher_adds_items_to_yto_such_that_soo_yto_pretax_subtotal_meets_the_min_amount_for_spell_scholastic() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigates_to_YTO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_single_YTO_item_to_the_cart();
    }
	
	@And("^teacher adds items to SFO & YTO items such that SFO \\+ SOO \\+ YTO pre\\-tax subtotal meets the min\\. amount for SFO coupon$")
    public void teacher_adds_items_to_sfo_yto_items_such_that_sfo_soo_yto_pretax_subtotal_meets_the_min_amount_for_sfo_coupon() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigates_to_YTO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_single_YTO_item_to_the_cart();
	
		login.teacher_clicks_on_SFO_tab_YTO_page();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_student();
    }
	
	@And("^teacher adds items to SFO & YTO such that SFO \\+ SOO \\+ YTO pre\\-tax subtotal meets the min\\. amount for freepick coupon$")
    public void teacher_adds_items_to_sfo_yto_such_that_sfo_soo_yto_pretax_subtotal_meets_the_min_amount_for_freepick_coupon() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigates_to_YTO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_add_single_yto_itemXML();
	
		login.teacher_clicks_on_SFO_tab_YTO_page();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_studentXML();
    }
	
	@And("^Teacher navigates to SFO page from Redemptions page$")
    public void teacher_navigates_to_sfo_page_from_redemptions_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_clicks_on_HOME_button();
		
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigate_to_SFO();
    }
	
	@Then("^error message displays for SFO field$")
    public void error_message_displays_for_sfo_field() throws Throwable {
		StudentFlyerOrdersPage spage = new StudentFlyerOrdersPage();
		spage.verify_error_msg_displayed_for_invalid_SFO_coupon_in_modal_window();
    }
	
	@And("^teacher adds items to SFO & YTO such that SFO \\+ SOO \\+ YTO pre\\-tax subtotal meets the min\\. amount for Bonus Flat coupon$")
    public void teacher_adds_items_to_sfo_yto_such_that_sfo_soo_yto_pretax_subtotal_meets_the_min_amount_for_bonus_flat_coupon() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigates_to_YTO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_single_YTO_item_to_the_cart();
	
		login.teacher_clicks_on_SFO_tab_YTO_page();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_student();
    }
	
	@And("^teacher adds items to SFO & YTO such that SFO \\+ SOO \\+ YTO pre\\-tax subtotal meets the min\\. amount for TGAT coupon$")
    public void teacher_adds_items_to_sfo_yto_such_that_sfo_soo_yto_pretax_subtotal_meets_the_min_amount_for_tgat_coupon() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigates_to_YTO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_single_YTO_item_to_the_cart();
	
		login.teacher_clicks_on_SFO_tab_YTO_page();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_student();
    }
	
	@And("^teacher adds items to SFO & YTO such that SFO \\+ SOO \\+ YTO pre\\-tax subtotal meets the min\\. amount for FreeItem coupon$")
    public void teacher_adds_items_to_sfo_yto_such_that_sfo_soo_yto_pretax_subtotal_meets_the_min_amount_for_freeitem_coupon() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigates_to_YTO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_single_YTO_item_to_the_cart();
	
		login.teacher_clicks_on_SFO_tab_YTO_page();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_student();
    }
	
	@And("^teacher adds items to SFO such that SFO \\+ SOO \\+ YTO pre\\-tax subtotal meets the min\\. amount for Bonus Flat Promotion$")
    public void teacher_adds_items_to_sfo_such_that_sfo_soo_yto_pretax_subtotal_meets_the_min_amount_for_bonus_flat_promotion() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigates_to_YTO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_single_YTO_item_to_the_cart();
	
		login.teacher_clicks_on_SFO_tab_YTO_page();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_student();
    }
	
	@And("^teacher adds items to SFO & YTO such that SFO \\+ SOO \\+ YTO pre\\-tax subtotal meets the min\\. amount for Student Incentive promotion$")
    public void teacher_adds_items_to_sfo_yto_such_that_sfo_soo_yto_pretax_subtotal_meets_the_min_amount_for_student_incentive_promotion() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigates_to_YTO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_add_single_yto_itemXML();
	
		login.teacher_clicks_on_SFO_tab_YTO_page();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_studentXML();
    }
	
	@And("^teacher adds items to SFO & YTO such that SFO \\+ SOO \\+ YTO pre\\-tax subtotal meets the min\\. amount for Free Item Promotion$")
    public void teacher_adds_items_to_sfo_yto_such_that_sfo_soo_yto_pretax_subtotal_meets_the_min_amount_for_free_item_promotion() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigates_to_YTO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_single_YTO_item_to_the_cart();
	
		login.teacher_clicks_on_SFO_tab_YTO_page();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_student();
    }
	
	@And("^teacher adds items to SFO & YTO such that SFO \\+ SOO \\+ YTO pre\\-tax subtotal meets the min\\. amount for Spell Scholastic$")
    public void teacher_adds_items_to_sfo_yto_such_that_sfo_soo_yto_pretax_subtotal_meets_the_min_amount_for_spell_scholastic() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
    	login.teacher_navigates_to_YTO();
    	
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_single_YTO_item_to_the_cart();
	
		login.teacher_clicks_on_SFO_tab_YTO_page();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_student();
    }
	
	@And("^teacher navigates to cart page from Home page$")
    public void teacher_navigates_to_cart_page_from_home_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_clicks_on_mini_ReviewCart_btn();
    }
	
	@And("^teacher adds teacher exclusive items to cart meeting the min\\. amount for the coupon$")
    public void teacher_adds_teacher_exclusive_items_to_cart_meeting_the_min_amount_for_the_coupon() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_TE_item_for_Free_Shipping();
	}
    
    @When("^teacher applies SFO coupon$")
    public void teacher_applies_sfo_coupon() throws Throwable {
    	CheckoutPage checkoutpage = new CheckoutPage();
		checkoutpage.navigatesfo_clickapplycoupon_entercoupon_applybutton();		
    }
    
    @And("^teacher adds freepick item from SFO coupon modal$")
    public void teacher_adds_freepick_item_from_sfo_coupon_modal() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        String coupons[] = SCHUtils.getArrayFromStringData(
                TestBaseProvider.getTestBase().getTestData().getString("selectgrade"));
        for (int i = 0; i < coupons.length; i++) {
            checkoutPage.MakeSelectionWindow_SelectGrade(
                    TestBaseProvider.getTestBase().getTestData() );
            }
        checkoutPage.Selects_an_item_from_Free_Item_Modal_window();
        checkoutPage.getICouponSection().createdatafromFreePickSelection();
        checkoutPage.getICouponSection().clickOnConfrimAndApplyCoupon();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);
    }
    
    @Given("^teacher has pending parent items in cart whose pre\\-tax subtotal qualifies for min\\. amount for SFO coupon$")
    public void teacher_has_pending_parent_items_in_cart_whose_pretax_subtotal_qualifies_for_min_amount_for_sfo_coupon() throws Throwable {
        System.out.println("Teacher has SOO orders in cart");
    }
    
    @And("^Student Flyer Order modal is displayed$")
    public void student_flyer_order_modal_is_displayed() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_verify_SFO_page_displayed();
    }
    
    @Then("^SFO freepick item information displays on the SFO page$")
    public void sfo_freepick_item_information_displays_on_the_sfo_page() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_verify_SFO_FreePick_item_info();
    }

	@Then("^SOO notification message is not displayed$")
	public void soo_notification_message_is_not_displayed() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_verify_SOO_notification_not_displayed_ReviewCart_page();
	}
	
	@When("^teacher navigates to YTO by Item# page$")
    public void teacher_navigates_to_yto_by_item_page() throws Throwable {
		BasePageImpl bp = new BasePageImpl();
		LoginPage login = new LoginPage();
		bp.home_button_HomePage().click();
    	login.teacher_navigates_to_YTO();
    }
	
	@And("^teacher adds teacher resource item$")
    public void teacher_adds_teacher_resource_item() throws Throwable {
		proddetails.add_store_teacherresource_items_ytosection();
    }
	
	@When("^teacher adds teacher resource item for a student$")
    public void teacher_adds_teacher_resource_item_for_a_student() throws Throwable {
		proddetails.add_store_teacherresource_items_sfosection();
    }
	
	@And("^teacher adds classroom title item$")
    public void teacher_adds_classroom_title_item() throws Throwable {
		proddetails.add_store_classroomtitle_items_ytosection();
    }
	
	@Then("^teacher successfully adds both these items to cart$")
    public void teacher_successfully_adds_both_these_items_to_cart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_clicks_on_ReviewCart_btn_in_SFO();
		PauseUtil.pause(4000);
		proddetails.verify_yto_iteminformation_checkoutpages();
		
    }
	
	@And("^teacher applies free pick coupon$")
    public void teacher_applies_free_pick_coupon() throws Throwable {
		CheckoutPage checkoutpage = new CheckoutPage();
		checkoutpage.navigatesfo_clickapplycoupon_entercoupon_applybutton();
    }
	
	@When("^teacher searches for teacher resource item on SFO freepick modal$")
    public void teacher_searches_for_teacher_resource_item_on_sfo_freepick_modal() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.MakeSelectionWindow_Search_WithSpecificTerm(
                TestBaseProvider.getTestBase().getTestData());
    }
	
	@Then("^no results should display$")
    public void no_results_should_display() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		PauseUtil.pause(5000);
        checkoutPage.verify_no_search_results_display_in_makeyourselection_window();
    }
	
	@When("^teacher searches for a keyword matching classroom title items$")
    public void teacher_searches_for_a_keyword_matching_classroom_title_items() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.GlobalSearch(
                TestBaseProvider.getTestBase().getTestData().getString("itemName"));
    }
	
	@When("^teacher searches for a keyword matching teacher resources items$")
    public void teacher_searches_for_a_keyword_matching_teacher_resources_items() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.GlobalSearch(
                TestBaseProvider.getTestBase().getTestData().getString("itemName"));
    }
	
	@Then("^teacher views results for the items$")
    public void teacher_views_results_for_the_items() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();

        iStudentFlyerOrdersPage.uniqueItemDisplayProductDetailPage(
                TestBaseProvider.getTestBase().getTestData().getString("BookTitle"));
    }
	
	@Then("^teacher is redirected to PDP page of that item$")
    public void teacher_is_redirected_to_pdp_page_of_that_item() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();

        iStudentFlyerOrdersPage.uniqueItemDisplayProductDetailPage(
                TestBaseProvider.getTestBase().getTestData().getString("BookTitle"));
    }
	
	@When("^teacher searches for \"([^\"]*)\" of classroom title item$")
    public void teacher_searches_for_something_of_classroom_title_item(String strArg1) throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.GlobalSearch(
                TestBaseProvider.getTestBase().getTestData().getString("itemName"));
    }
	
	@When("^teacher searches for \"([^\"]*)\" of teacher resource item$")
    public void teacher_searches_for_something_of_teacher_resource_item(String strArg1) throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        iStudentFlyerOrdersPage.GlobalSearch(
                TestBaseProvider.getTestBase().getTestData().getString("itemName"));
    }
	
	@Then("^error message displays for teacher resources items in sfo page$")
    public void error_message_displays_for_teacher_resources_items_in_sfo_page() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.validate_teitem_errormessage_insfopage();
    }
	
	@When("^teacher1 navigates to \\[Payment\\] page$")
    public void teacher1_navigates_to_payment_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_navigates_to_paymentpage_from_reviewcartpage();
    }
	
	@And("^teacher2 navigates to \\[Payment\\] page$")
    public void teacher2_navigates_to_payment_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_navigates_to_paymentpage_from_reviewcartpage();
    }
	
	@When("^teacher navigates to \\[Payment\\] page$")
    public void teacher_navigates_to_payment_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_navigates_to_paymentpage_from_reviewcartpage();
    }
	
	@And("^teacher adds YTO items to the cart for Free Shipping$")
    public void teacher_adds_yto_items_to_the_cart_for_free_shipping() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_YTO_item_With_ItemNumber();
	}


	@And("^teacher clicks on the delete SFO coupon$")
	public void teacherClicksOnTheDeleteSFOCoupon() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.sfopage_delete_SFOcoupon();
	}

	@And("^empty SFO section$")
	public void emptySFOSection() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.sfopage_delete_all();
	}


	@And("^teacher adds items to SFO from xml such that SOO \\+ SFO pre-tax subtotal meets the min\\. amount for freepick coupon$")
	public void teacherAddsItemsToSFOFromXmlSuchThatSOOSFOPreTaxSubtotalMeetsTheMinAmountForFreepickCoupon() throws Throwable {
		ILoginPage login = getFactory().getILoginPage();
		login.teacher_navigate_to_SFO();

		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_studentXML();
	}

	@And("^teacher is back to SFO section$")
	public void teacherIsBackToSFOSection() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getbacktoSFOsection();
	}


	@And("^teacher click on link Edit Cart$")
	public void teacherClickOnLinkEditCart() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.getlinkEditCart();
	}

	@And("^empty items other than SOO$")
	public void emptyItemsOtherThanSOO() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.doremoveSFOYTOitems();

	}

	@And("^teacher click on cart$")
	public void teacherClickOnCart() throws Throwable {
		TeachersHomePage teachersHomePage = new TeachersHomePage();
		teachersHomePage.btn_mini_reviewCart().click();

	}
	
	/*@And("^Order Total displays as 0 and no\\. of items displays the correct number from Child1$")
    public void order_total_displays_as_0_and_no_of_items_displays_the_correct_number_from_child1() throws Throwable {
		CartPage cartpage = new CartPage();
		cartpage.verify_ordertotal_totalitems_in_paymentpage();
    }
	
	@And("^Order Total displays as 0 and no\\. of items displays the correct number from Child2$")
    public void order_total_displays_as_0_and_no_of_items_displays_the_correct_number_from_child2() throws Throwable {
		CartPage cartpage = new CartPage();
		cartpage.verify_ordertotal_totalitems_in_paymentpage();
    }
	
	@And("^Order Total displays as 0 and no\\. of items displays the correct number from Child1 \\+ Child2$")
    public void order_total_displays_as_0_and_no_of_items_displays_the_correct_number_from_child1_child2() throws Throwable {
		CartPage cartpage = new CartPage();
		cartpage.verify_ordertotal_totalitems_in_paymentpage();
    }*/
	
	@Then("^blue header on SOO displays with correct total and no\\. of items as in Child1 \\+ Child2 total$")
    public void blue_header_on_soo_displays_with_correct_total_and_no_of_items_as_in_child1_child2_total() throws Throwable {
		CartPage cartpage = new CartPage();
    	cartpage.store_all_information_from_rewards_page("SOO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
    }

    /*@And("^Order Total displays as 0 and no\\. of items displays the correct number from Child3$")
    public void order_total_displays_as_0_and_no_of_items_displays_the_correct_number_from_child3() throws Throwable {
    	CartPage cartpage = new CartPage();
		cartpage.verify_ordertotal_totalitems_in_paymentpage();
    }*/
    
    @And("^Order Total displays (.+)$")
    public void order_total_displays(String sfototalytototalteacherexclusivetotal) throws Throwable {
    	CartPage cartpage = new CartPage();
		cartpage.verify_ordertotal_totalitems_in_paymentpage();
    }

    @And("^total no. of items displays with correct no. of items (.+)$")
    public void total_no_of_items_displays_with_correct_no_of_items(String soosfoytoteacherexclusives) throws Throwable {
    	CartPage cartpage = new CartPage();
		cartpage.verify_ordertotal_totalitems_in_paymentpage();
    }
    
    @And("^teacher adds single YTO and Teacher Exclusives items$")
    public void teacher_adds_single_yto_and_teacher_exclusives_items() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_YTO_item_for_Paid_Shipping();
		studentFlyerOrdersPage.teacher_adds_single_TE_item_to_cart_by_Search();
	}
    
    @And("^teacher adds YTO item for Free Shipping with multiple item numbers$")
    public void teacher_adds_yto_item_for_free_shipping_with_multiple_item_numbers() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.teacher_adds_YTO_item_NotMinimum();
	}
    
    @When("^CSR navigates to Redemptions & Rewards page$")
    public void csr_navigates_to_redemptions_rewards_page() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		CartPage cartpage = new CartPage();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		//stores all item information which is in review cart page
		cartpage.store_all_information_from_reviewcart_page("SOO");
		cartpage.store_all_information_from_reviewcart_page("YTO");
		cartpage.store_all_information_from_reviewcart_page("TE");
		studentFlyerOrdersPage.CSR_clicks_on_ProceedToCheckout_ReviewCartPage();
    }
    
    @And("^\"([^\"]*)\" the displays (.+)$")
    public void something_displays(String soosubtotalytosubtotal, String strArg1) throws Throwable {
    	CartPage cartpage = new CartPage();
		cartpage.store_all_information_from_rewards_page("SOO");
		cartpage.store_all_information_from_rewards_page("SFO");
		cartpage.store_all_information_from_rewards_page("YTO");
		cartpage.store_all_information_from_rewards_page("TE");
		cartpage.verify_rewardsearned_amount_in_rewardspage();
    }
    
    @And("^CSR adds teacher exclusive items to the cart$")
    public void csr_adds_teacher_exclusive_items_to_the_cart() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
    }
    
    @And("^CSR adds Student Clubs and teacher exclusive items to the cart$")
    public void csr_adds_student_clubs_and_teacher_exclusive_items_to_the_cart() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_from_diff_flyers_OrderEntryPage();
    }
    

    @And("^CSR redeems bonus bank and paper coupons from YTO$")
    public void csr_redeems_bonus_bank_and_paper_coupons_from_yto() throws Throwable {
    	chkpage.teacher_enter_redemptions("YTO");
		PauseUtil.pause(2000);
		carttotals.get_total_redemptionsandrewardspage();
    }

    @And("^CSR redeems bonus bank and paper coupons from Teacher Exclusives$")
    public void csr_redeems_bonus_bank_and_paper_coupons_from_teacher_exclusives() throws Throwable {
    	chkpage.teacher_enter_redemptions("TE");
		PauseUtil.pause(2000);
		carttotals.get_total_redemptionsandrewardspage();
    }
    
    @And("^CSR searches for a teacher1 and navigates to Verify Account Page$")
    public void csr_searches_for_a_teacher1_and_navigates_to_verify_account_page() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_the_Ac_Num_and_select_in_Search_Results();
    }
    
    @And("^CSR searches for Teacher2 and navigates to \\[Payment\\] page$")
    public void csr_searches_for_teacher2_and_navigates_to_payment_page() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_the_Ac_Num2_and_select_in_Search_Results();
		studentFlyerOrdersPage.clickProceedToCheckout();
		studentFlyerOrdersPage.CSR_selects_SOO_Include_Orders_chkbox_ReviewCart_page();
		CartPage cartpage = new CartPage();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		//stores all item information which is in review cart page
		cartpage.store_all_information_from_reviewcart_page("SOO");
		cartpage.store_all_information_from_reviewcart_page("YTO");
		cartpage.store_all_information_from_reviewcart_page("TE");
		studentFlyerOrdersPage.CSR_clicks_on_ProceedToCheckout_ReviewCartPage();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		studentFlyerOrdersPage.CSR_selects_ContinueCheckout_in_Rewards_page();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
    }
    
    @When("^CSR searches for teacher2 and navigates to \\[Redemptions & Rewards\\] page$")
    public void csr_searches_for_teacher2_and_navigates_to_redemptions_rewards_page() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_enters_the_Ac_Num2_and_select_in_Search_Results();
		studentFlyerOrdersPage.clickProceedToCheckout();
		studentFlyerOrdersPage.CSR_selects_SOO_Include_Orders_chkbox_ReviewCart_page();
		CartPage cartpage = new CartPage();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		//stores all item information which is in review cart page
		cartpage.store_all_information_from_reviewcart_page("SOO");
		cartpage.store_all_information_from_reviewcart_page("YTO");
		cartpage.store_all_information_from_reviewcart_page("TE");
		studentFlyerOrdersPage.CSR_clicks_on_ProceedToCheckout_ReviewCartPage();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
    }
    
    @And("^CSR excludes SOO order$")
    public void csr_excludes_soo_order() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.csr_unselect_soo_includeorders_chkbox_reviewcart_page();
    }
    
    @Then("^blue header on SOO displays as \\$0$")
    public void blue_header_on_soo_displays_as_0() throws Throwable {
    	CartPage cartpage = new CartPage();
    	cartpage.store_all_information_from_rewards_page("SOO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
    }
    
    @And("^teacher applies Bonus Bank and paper coupons redemptions to YTO and teacher exclusives$")
    public void teacher_applies_bonus_bank_and_paper_coupons_redemptions_to_yto_and_teacher_exclusives() throws Throwable {
    	chkpage.teacher_enter_redemptions("YTO");
		PauseUtil.pause(2000);
		chkpage.teacher_enter_redemptions("TE");
		PauseUtil.pause(2000);
		carttotals.get_total_redemptionsandrewardspage();
    }

    
    @When("^teacher1 navigates to Confirm & Submit page$")
    public void teacher1_navigates_to_confirm_submit_page() throws Throwable {
    	proddetails.teacher_navigates_to_confirm_submitpage_from_homepage();
    }
    
    @And("^teacher2 navigates to Confirm & Submit page$")
    public void teacher2_navigates_to_confirm_submit_page() throws Throwable {
    	proddetails.teacher_navigates_to_confirm_submitpage_from_homepage();
    }
    
    @When("^teacher navigates to confirm & submit page$")
    public void teacher_navigates_to_confirm_submit_page() throws Throwable {
    	proddetails.teacher_navigates_to_confirm_submitpage_from_homepage();
    }

    @When("^teacher1 submits the order$")
    public void teacher1_submits_the_order() throws Throwable {
    	ConfirmAndSubmitOrder confirmAndSubmitOrderPage =
				getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
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
    
    @When("^teacher2 submits the order$")
    public void teacher2_submits_the_order() throws Throwable {
    	ConfirmAndSubmitOrder confirmAndSubmitOrderPage =
				getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
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
    
    @When("^teacher navigates to My Account page and click on view Order details for this order$")
    public void teacher_navigates_to_my_account_page_and_click_on_view_order_details_for_this_order() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        TeachersHomePage teachhomepge = new TeachersHomePage();
        checkoutPage.user_selects_OrderHistory_MyAccount_DropDown_in_ConfirmationPage();
        teachhomepge.clickOrderView_MyAccountPage();
    }

    @When("^teacher1 navigates to My Account page and click on view Order details for this order$")
    public void teacher1_navigates_to_my_account_page_and_click_on_view_order_details_for_this_order() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        TeachersHomePage teachhomepge = new TeachersHomePage();
        checkoutPage.user_selects_OrderHistory_MyAccount_DropDown_in_ConfirmationPage();
        teachhomepge.clickOrderView_MyAccountPage();
    }

    @When("^teacher2 navigates to My Account page and click on view Order details for this order$")
    public void teacher2_navigates_to_my_account_page_and_click_on_view_order_details_for_this_order() throws Throwable {
    	System.out.println("to be implemented");
    }

    @Then("^Order Summary Section displays the Student Online Orders \\- Paid with the correct SOO total$")
    public void order_summary_section_displays_the_student_online_orders_paid_with_the_correct_soo_total() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.verify_summarysection_totals_confirmationpages();
    }

    @Then("^Order Summary section and Order details display as in Confirm & Submit page$")
    public void order_summary_section_and_order_details_display_as_in_confirm_submit_page() throws Throwable {
    	CartPage cartpage = new CartPage();
    	cartpage.verify_summarysection_totals_confirmationpages();
    	cartpage.verify_totalamountdue_summarysection_confirmationpages();
        cartpage.store_all_information_from_rewards_page("SOO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
        cartpage.store_all_information_from_rewards_page("SFO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SFO");
        cartpage.store_all_information_from_rewards_page("YTO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("YTO");
        cartpage.store_all_information_from_rewards_page("TE");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("TE");
        
    }

    @Then("^Order Summary section and Order details display as in Order Confirmation page$")
    public void order_summary_section_and_order_details_display_as_in_order_confirmation_page() throws Throwable {
    	CartPage cartpage = new CartPage();
    	cartpage.verify_summarysection_totals_confirmationpages();
    	cartpage.verify_totalamountdue_summarysection_confirmationpages();
        cartpage.store_all_information_from_rewards_page("SOO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
        cartpage.store_all_information_from_rewards_page("SFO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SFO");
        cartpage.store_all_information_from_rewards_page("YTO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("YTO");
        cartpage.store_all_information_from_rewards_page("TE");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("TE");
    }

    @And("^Student Flyer Orders, Your Teacher Order, Teacher Exclusives displays \\$0$")
    public void student_flyer_orders_your_teacher_order_teacher_exclusives_displays_0() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.verify_summarysection_totals_confirmationpages();
    }
    
    @And("^Student Flyer Orders, Your Teacher Order, Teacher Exclusives total displays as \\$0$")
    public void student_flyer_orders_your_teacher_order_teacher_exclusives_total_displays_as_0() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.verify_summarysection_totals_confirmationpages();
        
    }

    @And("^Shipping & Handling displays FREE and Total Amount Due displays \\$0$")
    public void shipping_handling_displays_free_and_total_amount_due_displays_0() throws Throwable {
    	CartPage cartpage = new CartPage();
    	ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.waitForPageLoad();
        chkpage.verifyfreeshipping(TestBaseProvider.getTestBase()
                .getTestData().getString("shippingCharge").trim());
        cartpage.verify_totalamountdue_iszero_summarysection_confirmationpages();
    }

    @And("^payment section displays “Your order has no balance, so no payment is necessary to complete this order\\.”$")
    public void payment_section_displays_your_order_has_no_balance_so_no_payment_is_necessary_to_complete_this_order() throws Throwable {
    	CheckoutPage_2 checkoutpage2 = new CheckoutPage_2();
    	checkoutpage2.validate_nobalance_inpaymentsection_inconfirmpages();
    }

    @And("^Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price, quantity$")
    public void order_details_section_displays_with_order_grouped_by_child1_with_correct_item_number_title_flyer_price_quantity() throws Throwable {
		PauseUtil.pause(4000);
		proddetails.verify_soo_iteminformation1_checkoutpages();
    }
    
    @And("^order grouped by child2 with correct Item number, title, Flyer, price, quantity$")
    public void order_grouped_by_child2_with_correct_item_number_title_flyer_price_quantity() throws Throwable {
    	PauseUtil.pause(4000);
		proddetails.verify_soo_iteminformation1_checkoutpages();
    }
    
    @And("^Order Details section displays with order grouped by child3 with correct Item number, title, Flyer, price, quantity$")
    public void order_details_section_displays_with_order_grouped_by_child3_with_correct_item_number_title_flyer_price_quantity() throws Throwable {
    	PauseUtil.pause(4000);
		proddetails.verify_soo_iteminformation1_checkoutpages();
    }

    @And("^child1’s subtotal, tax total and overall total is displayed$")
    public void child1s_subtotal_tax_total_and_overall_total_is_displayed() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.store_all_information_from_rewards_page("SOO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
    }
    
    @And("^child1’s subtotal, tax total and overall total is displayed as \\$0$")
    public void child1s_subtotal_tax_total_and_overall_total_is_displayed_as_0() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.store_all_information_from_rewards_page("SOO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
    }
    
    @And("^child2’s subtotal, tax total and overall total is displayed$")
    public void child2s_subtotal_tax_total_and_overall_total_is_displayed() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.store_all_information_from_rewards_page("SOO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
    }
    
    @And("^child3’s subtotal, tax total and overall total is displayed$")
    public void child3s_subtotal_tax_total_and_overall_total_is_displayed() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.store_all_information_from_rewards_page("SOO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
    }

    @And("^cumulative total and Qty for all Student Online Orders displays$")
    public void cumulative_total_and_qty_for_all_student_online_orders_displays() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.store_all_information_from_rewards_page("SOO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
    }

    @And("^Shipping displays FREE$")
    public void shipping_displays_free() throws Throwable {
    	ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.waitForPageLoad();
        chkpage.verifyfreeshipping(TestBaseProvider.getTestBase()
                .getTestData().getString("shippingCharge").trim());
    }
    
    @And("^Correct Student Flyer Orders, Your Teacher Order, Teacher Exclusives total displays$")
    public void correct_student_flyer_orders_your_teacher_order_teacher_exclusives_total_displays() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.verify_summarysection_totals_confirmationpages();
    }

    @And("^SFO section displays with order grouped by child with correct Item number, title, Flyer, price, quantity$")
    public void sfo_section_displays_with_order_grouped_by_child_with_correct_item_number_title_flyer_price_quantity() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.store_all_information_from_rewards_page("SFO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SFO");
    }

    @And("^child wise subtotal, tax total and overall total is displayed$")
    public void child_wise_subtotal_tax_total_and_overall_total_is_displayed() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.store_all_information_from_rewards_page("SFO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SFO");
    }

    @And("^cumulative total and Qty for all Student Flyer Orders displays$")
    public void cumulative_total_and_qty_for_all_student_flyer_orders_displays() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.store_all_information_from_rewards_page("SFO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SFO");
    }

    @And("^YTO section displays with correct Item number, title, Flyer, price, quantity$")
    public void yto_section_displays_with_correct_item_number_title_flyer_price_quantity() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.store_all_information_from_rewards_page("YTO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("YTO");
    }

    @And("^cumulative total and Qty for YTO displays$")
    public void cumulative_total_and_qty_for_yto_displays() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.store_all_information_from_rewards_page("YTO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("YTO");
    }

    @And("^Teacher Exclusive section displays with correct Item number, title, Flyer, price, quantity$")
    public void teacher_exclusive_section_displays_with_correct_item_number_title_flyer_price_quantity() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.store_all_information_from_rewards_page("TE");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("TE");
    }

    @And("^cumulative total and Qty for Teacher Exclusives displays$")
    public void cumulative_total_and_qty_for_teacher_exclusives_displays() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.store_all_information_from_rewards_page("TE");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("TE");
    }
    
    @And("^teacher selects New Visa card as payment$")
    public void teacher_selects_new_visa_card_as_payment() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
    	studentFlyerOrdersPage.teacher_navigates_to_paymentpage_from_reviewcartpage_selects_newcard();
    }
    
    @And("^teacher selects saved master card as payment$")
    public void teacher_selects_saved_master_card_as_payment() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
    	studentFlyerOrdersPage.teacher_navigates_to_paymentpage_from_reviewcartpage_selects_savedcard();
    }

    @And("^teacher selects New Amex card as payment$")
    public void teacher_selects_new_amex_card_as_payment() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
    	studentFlyerOrdersPage.teacher_navigates_to_paymentpage_from_reviewcartpage_selects_newcard();
    }
    
    @And("^teacher selects combination of Credit card and checks as payment$")
    public void teacher_selects_combination_of_credit_card_and_checks_as_payment() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
    	studentFlyerOrdersPage.teacher_navigates_to_paymentpage_from_reviewcartpage_selects_combination_cheque_card();
    }

    @And("^Correct Student Flyer Orders total displays$")
    public void correct_student_flyer_orders_total_displays() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.verify_summarysection_totals_confirmationpages();
    }
    
    @And("^Correct Your Teacher Order total displays$")
    public void correct_your_teacher_order_total_displays() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.verify_summarysection_totals_confirmationpages();
    }
    
    @And("^Correct Teacher Exclusives total displays$")
    public void correct_teacher_exclusives_total_displays() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.verify_summarysection_totals_confirmationpages();
    }
    
    @And("^Correct Student Flyer Orders, Your Teacher Order total displays$")
    public void correct_student_flyer_orders_your_teacher_order_total_displays() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.verify_summarysection_totals_confirmationpages();
    }
    @And("^Correct Student Flyer Orders, Your Teacher Order, Teacher Exclusives total displays as \\$0$")
    public void correct_student_flyer_orders_your_teacher_order_teacher_exclusives_total_displays_as_0() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.verify_summarysection_totals_confirmationpages();
    }
    
    @And("^Correct Your Teacher Order, Teacher Exclusives total displays$")
    public void correct_your_teacher_order_teacher_exclusives_total_displays() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.verify_summarysection_totals_confirmationpages();
    }

    @And("^Correct Student Flyer Orders and Teacher Exclusives total displays$")
    public void correct_student_flyer_orders_and_teacher_exclusives_total_displays() throws Throwable {
    	System.out.println("to be implemented");
    }

    @And("^Your Teacher Order and Teacher Exclusives total displays as \\$0$")
    public void your_teacher_order_and_teacher_exclusives_total_displays_as_0() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.verify_summarysection_totals_confirmationpages();
    }
    
    @And("^Student Flyer Orders and Teacher Exclusives total displays as \\$0$")
    public void student_flyer_orders_and_teacher_exclusives_total_displays_as_0() throws Throwable {
    	System.out.println("to be implemented");
    }
    
    @And("^Student Flyer Orders, Your Teacher Order total displays as \\$0$")
    public void student_flyer_orders_your_teacher_order_total_displays_as_0() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.verify_summarysection_totals_confirmationpages();
    }
    
    @And("^Student Flyer Order total displays as \\$0$")
    public void student_flyer_order_total_displays_as_0() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.verify_summarysection_totals_confirmationpages();
    }
    
    @And("^Your Teacher Order total displays as \\$0$")
    public void your_teacher_order_total_displays_as_0() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.verify_summarysection_totals_confirmationpages();
    }
    
    @And("^Teacher Exclusives total displays as \\$0$")
    public void teacher_exclusives_total_displays_as_0() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.verify_summarysection_totals_confirmationpages();
    }
    
    @And("^payment section displays Amount paid by Checks as Total amount due$")
    public void payment_section_displays_amount_paid_by_checks_as_total_amount_due() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
        cartpage.verify_the_amount_paid_by_cheque_with_cheque_amt_ConfirmSub_Page(Total_Owing_Amount_act_1.getTotalOwingValue());
    }

    @And("^payment section displays Amount paid by Credit Card as Total amount due$")
    public void payment_section_displays_amount_paid_by_credit_card_as_total_amount_due() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
        cartpage.verify_the_amount_paid_by_cheque_with_cheque_amt_ConfirmSub_Page(Total_Owing_Amount_act_1.getTotalOwingValue());
    }
    
    @And("^payment section displays correct Amount paid by CC and Amount paid by Checks$")
    public void payment_section_displays_correct_amount_paid_by_cc_and_amount_paid_by_checks() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
        cartpage.verify_the_amount_paid_by_cheque_with_cheque_amt_ConfirmSub_Page(Total_Owing_Amount_act_1.getTotalOwingValue());
    }
    
    @And("^Rewards Earned with Qualifying order total of shows the SOO pre\\-tax total$")
    public void rewards_earned_with_qualifying_order_total_of_shows_the_soo_pretax_total() throws Throwable {
    	CartPage cartpage = new CartPage();
		cartpage.store_all_information_from_rewards_page("SOO");
		cartpage.store_all_information_from_rewards_page("SFO");
		cartpage.store_all_information_from_rewards_page("YTO");
		cartpage.store_all_information_from_rewards_page("TE");
		cartpage.verify_rewardsearned_amount_in_rewardspage();
    }

    @Given("^Parent has a child connected to teacher with pending parent orders with freepick coupon$")
    public void parent_has_a_child_connected_to_teacher_with_pending_parent_orders_with_freepick_coupon() throws Throwable {
        System.out.println("Parent has a child connected to teacher with pending parent orders with freepick coupon");
    }
    
    @Given("^Parent has a child connected to teacher with pending parent freepick only order$")
    public void parent_has_a_child_connected_to_teacher_with_pending_parent_freepick_only_order() throws Throwable {
    	System.out.println("Parent has a child connected to teacher with pending parent freepick only order");
    }
    
    @Given("^teacher adds SFO free pick item$")
    public void teacher_adds_SFO_free_pick_item() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.applySFOFreePickCoupon();
    }

    @Given("^teacher adds YTO items such that SFO \\+ SOO \\+ YTO amount qualifies for minimum for the coupons$")
    public void teacher_adds_YTO_items_such_that_SFO_SOO_YTO_amount_qualifies_for_minimum_for_the_coupons() throws Throwable {
    	proddetails.add_store_ytoitems_differentflyers();
    }

    @Given("^teacher applies Freepick coupon on Redemptions & Rewards page$")
    public void teacher_applies_Freepick_coupon_on_Redemptions_Rewards_page() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.apply_a_coupon_Rewards_page();
    	checkoutPage.clicks_Search_fld_and_searches_an_item_in_MakeYourSelection_window();
    	checkoutPage.MakeSelectionWindow_SelectItemFreePick();
    }

    @Given("^teacher applies Bonus Flat Coupon on Redemptions & Rewards page$")
    public void teacher_applies_Bonus_Flat_Coupon_on_Redemptions_Rewards_page() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.apply_a_BonusFlat_coupon_without_deleting_existing_coupons();
    }

    @Then("^Shipping & Handling displays FREE and Total Amount Due displays <SFO \\+ YTO Total>$")
    public void shipping_Handling_displays_FREE_and_Total_Amount_Due_displays_SFO_YTO_Total() throws Throwable {
    	ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.waitForPageLoad();
        chkpage.verifyfreeshipping(TestBaseProvider.getTestBase()
                .getTestData().getString("shippingCharge").trim());
    }

    @Then("^Order Details section displays with freepick item information with price displayed as FREE$")
    public void order_Details_section_displays_with_freepick_item_information_with_price_displayed_as_FREE() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.verify_free_pick_item_Confirm_Submit_page();
    }

    @Then("^SFO section displays with order grouped by child with Freepick item information with price displayed as FREE$")
    public void sfo_section_displays_with_order_grouped_by_child_with_Freepick_item_information_with_price_displayed_as_FREE() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.verify_SFO_free_pick_item_Confirm_Submit_page();
    }

    @Then("^coupons section displays with Freepick and Bonus Flat coupon information$")
    public void coupons_section_displays_with_Freepick_and_Bonus_Flat_coupon_information() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.verify_coupon_list_section_is_displayed();
    }
    
    @Then("^Order Summary Section displays the Student Online Orders - Paid as \\$(\\d+)$")
    public void order_Summary_Section_displays_the_Student_Online_Orders_Paid_as_$(int arg1) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.verify_SOO_Paid_amount_is_zero_Order_Summary();
    }

    @Then("^payment section displays blank$")
    public void payment_section_displays_blank() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.verify_payment_section_display_no_payment_Confirm_andSubmit();
    }

    @Then("^SFO section displays with Freepick item information with price displayed as FREE$")
    public void sfo_section_displays_with_Freepick_item_information_with_price_displayed_as_FREE() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.verify_SFO_free_pick_item_Confirm_Submit_page();
    }

    @Then("^coupons section displays with Freepick information$")
    public void coupons_section_displays_with_Freepick_information() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.verify_coupon_list_section_is_displayed();
    }
    
    @Given("^Parent has a child connected to teacher with pending orders such that pre-tax total qualifies for Bonus Flat$")
    public void parent_has_a_child_connected_to_teacher_with_pending_orders_such_that_pre_tax_total_qualifies_for_Bonus_Flat() throws Throwable {
        System.out.println("Parent has a child connected to teacher with pending orders such that pre-tax total qualifies for Bonus Flat");
    }
    
    @Given("^Parent has a child connected to teacher with pending orders such that pre-tax total qualifies for Spell Scholastic & Student Incentive$")
    public void parent_has_a_child_connected_to_teacher_with_pending_orders_such_that_pre_tax_total_qualifies_for_Spell_Scholastic_and_Student_Incentive() throws Throwable {
        System.out.println("Parent has a child connected to teacher with pending orders such that pre-tax total qualifies for Spell Scholastic & Student Incentive");
    }
    
    @Then("^Bonus Flat reward information displays under Rewards Section$")
    public void bonus_Flat_reward_information_displays_under_Rewards_Section() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.verify_bonus_rewards_displayed_Confirm_andSubmit();
    }

    @Then("^Coupons section displays with Bonus Flat coupon information$")
    public void coupons_section_displays_with_Bonus_Flat_coupon_information() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.verify_coupon_list_section_is_displayed();
    }
    
    @Given("^Parent has a child connected to teacher with pending orders such that pre-tax total qualifies for TGAT coupon$")
    public void parent_has_a_child_connected_to_teacher_with_pending_orders_such_that_pre_tax_total_qualifies_for_TGAT_coupon() throws Throwable {
    	System.out.println("Parent has a child connected to teacher with pending orders such that pre-tax total qualifies for TGAT coupon");
    }

    @Given("^teacher applies TGAT coupon$")
    public void teacher_applies_TGAT_coupon() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.apply_TGAT_coupon_in_Rewards_page();
        checkoutPage.Teacher_enters_referring_teacher_details_TGAT_modal_window();
    }

    @Then("^Coupons section displays with TGAT coupon information$")
    public void coupons_section_displays_with_TGAT_coupon_information() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.verify_coupon_list_section_is_displayed();
    }
    
    @Given("^Parent has a child connected to teacher with pending orders such that pre-tax total qualifies for Free Item$")
    public void parent_has_a_child_connected_to_teacher_with_pending_orders_such_that_pre_tax_total_qualifies_for_Free_Item() throws Throwable {
    	System.out.println("Parent has a child connected to teacher with pending orders such that pre-tax total qualifies for Free Item");
    }

    @Then("^Free Item reward information displays under Rewards Section$")
    public void free_Item_reward_information_displays_under_Rewards_Section() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.verify_free_item_rewards_displayed_Confirm_andSubmit();
    }

    @Then("^Coupons section displays with Free Item coupon information$")
    public void coupons_section_displays_with_Free_Item_coupon_information() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.verify_coupon_list_section_is_displayed();
    }
    
    @Given("^teacher enters no\\. of students in Student Incentive on Redemptions & Rewards page$")
    public void teacher_enters_no_of_students_in_Student_Incentive_on_Redemptions_Rewards_page() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.enter_number_students_student_incentives_Rewards_Page();
    }

    @Then("^Spell Scholastic reward information displays under Rewards Section$")
    public void spell_Scholastic_reward_information_displays_under_Rewards_Section() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.verify_spell_scholastic_displayed_Confirm_andSubmit();
    }

    @Then("^Student incentive with no\\. of students displays under rewards section$")
    public void student_incentive_with_no_of_students_displays_under_rewards_section() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.verify_student_incentives_displayed_Confirm_andSubmit();
    }
    
    @Given("^Parent has a child connected to teacher with pending parent orders with Free pick coupon$")
    public void parent_has_a_child_connected_to_teacher_with_pending_parent_orders_with_Free_pick_coupon() throws Throwable {
    	System.out.println("Parent has a child connected to teacher with pending parent orders with Free pick coupon");
    }
    
    @Given("^teacher redeems entire amount towards credit notes from SFO$")
    public void teacher_redeems_entire_amount_towards_credit_notes_from_SFO() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.enter_entire_amount_with_paper_coupon_SFO();
    }

    @Given("^teacher redeems entire amount towards bonus bank and paper coupons from YTO$")
    public void teacher_redeems_entire_amount_towards_bonus_bank_and_paper_coupons_from_YTO() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.enter_entire_amount_with_bonus_bank_paper_coupon_YTO();
    }

    @Given("^teacher redeems entire amount towards bonus bank and paper coupons from Teacher Exclusives$")
    public void teacher_redeems_entire_amount_towards_bonus_bank_and_paper_coupons_from_Teacher_Exclusives() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.enter_entire_amount_with_bonus_bank_paper_coupon_TE();
    }

    @Then("^coupons section displays with YTO Free pick coupon information$")
    public void coupons_section_displays_with_YTO_Free_pick_coupon_information() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.verify_coupon_list_section_is_displayed();
    }
    
    @Given("^teacher redeems credit notes from SFO$")
    public void teacher_redeems_credit_notes_from_SFO() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.teacher_enter_redemptions("SFO");
    }

    @Given("^teacher redeems bonus bank and paper coupons from YTO$")
    public void teacher_redeems_bonus_bank_and_paper_coupons_from_YTO() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.teacher_enter_redemptions("YTO");
    }

    @Given("^teacher redeems bonus bank and paper coupons from Teacher Exclusives$")
    public void teacher_redeems_bonus_bank_and_paper_coupons_from_Teacher_Exclusives() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.teacher_enter_redemptions("TE");
    }

    @Then("^Correct Student Flyer Orders, Your Teacher Order, Teacher Exclusives total \\(post tax & post redemption amount\\) displays$")
    public void correct_Student_Flyer_Orders_Your_Teacher_Order_Teacher_Exclusives_total_post_tax_post_redemption_amount_displays() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.verify_summarysection_totals_confirmationpages();
    }

    @Then("^Shipping & Handling displays FREE and Total Amount Due displays <SFO \\+ YTO \\+ Teacher Exclusives post tax, post redemption Total>$")
    public void shipping_Handling_displays_FREE_and_Total_Amount_Due_displays_SFO_YTO_Teacher_Exclusives_post_tax_post_redemption_Total() throws Throwable {
    	ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.waitForPageLoad();
        chkpage.verifyfreeshipping(TestBaseProvider.getTestBase()
                .getTestData().getString("shippingCharge").trim());
    }
    
    @Then("^Order Summary Section displays the Student Online Orders - Paid with the correct (.+) total$")
    public void order_summary_section_displays_the_student_online_orders_paid_with_the_correct_total(String child1child2) throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.verify_summarysection_totals_confirmationpages();
    }

    @Then("^Order Summary Section displays the Student Online Orders \\- Paid with the correct Child3 total$")
    public void order_summary_section_displays_the_student_online_orders_paid_with_the_correct_child3_total() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.verify_summarysection_totals_confirmationpages();
    }
    
    @And("^Order Details section displays with order grouped by child1 with correct Item number, title, Flyer, price as FREE, quantity$")
    public void order_details_section_displays_with_order_grouped_by_child1_with_correct_item_number_title_flyer_price_as_free_quantity() throws Throwable {
    	PauseUtil.pause(4000);
		proddetails.verify_soo_iteminformation1_checkoutpages();
    }

    @And("^cumulative total is \\$0 and Qty for all Student Online Orders displays$")
    public void cumulative_total_is_0_and_qty_for_all_student_online_orders_displays() throws Throwable {
    	CartPage cartpage = new CartPage();
        cartpage.store_all_information_from_rewards_page("SOO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SOO");
    }
    
    @And("^Shipping & Handling displays FREE and Total Amount Due displays (.+)$")
    public void shipping_handling_displays_free_and_total_amount_due_displays(String sfoytoteacherexclusivestotal) throws Throwable {
    	CartPage cartpage = new CartPage();
    	ShippingAndPayment shippingAndPayment =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        shippingAndPayment.waitForPageLoad();
        chkpage.verifyfreeshipping(TestBaseProvider.getTestBase()
                .getTestData().getString("shippingCharge").trim());
        cartpage.verify_totalamountdue_iszero_summarysection_confirmationpages();
    }
    
    //need to delete this(commented this as it was duplicate and causing issue)
    /*@And("^Correct Student Flyer Orders, Your Teacher Order, Teacher Exclusives total \\(post tax & post redemption amount\\) displays$")
    public void correct_student_flyer_orders_your_teacher_order_teacher_exclusives_total_post_tax_post_redemption_amount_displays() throws Throwable {
    	CartPage cartpage = new CartPage();
    	cartpage.store_all_information_from_rewards_page("SFO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("SFO");
        cartpage.store_all_information_from_rewards_page("YTO");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("YTO");
        cartpage.store_all_information_from_rewards_page("TE");
        cartpage.verify_all_item_information_from_reviewcartpage_rewardspage("TE");
        
    }*/
}
