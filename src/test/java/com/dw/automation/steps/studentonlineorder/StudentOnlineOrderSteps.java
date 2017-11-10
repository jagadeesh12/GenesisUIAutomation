package com.dw.automation.steps.studentonlineorder;

import static com.dw.automation.pages.base.PageFactory.getFactory;
import static org.testng.Assert.assertFalse;

import com.dw.automation.pages.impl.*;
import cucumber.api.PendingException;
import org.apache.commons.configuration.Configuration;
import org.testng.Assert;
import com.dw.automation.pages.ICheckoutPage;
import com.dw.automation.pages.IStudentFlyerOrdersPage;
import com.dw.automation.pages.impl.CheckoutPage.RewardsAndCoupons;
import com.dw.automation.pages.impl.CheckoutPage.ShippingAndPayment;
import com.dw.automation.steps.TeacherCart.TotlaOwing;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;
import com.scholastic.torque.common.WaitUtils;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentOnlineOrderSteps extends BaseTestPage<TestPage>{
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
	StudentOnlineOrdersPage studonlinepage = new StudentOnlineOrdersPage();
	TeachersHomePage teacherhomepage = new TeachersHomePage();

	

	@When("^user selects Student Online Orders Tab$")
	public void user_selects_Student_Online_Orders() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickOnSOO();
	}
	
	@When("^teacher clicks on Student Online Orders from Enter Orders option$")
    public void teacher_clicks_on_student_online_orders_from_enter_orders_option() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickOnSOOFromHomePage();
    }
	
	 @When("^teacher clicks on Your Teacher Order from Enter Orders option$")
	    public void teacher_clicks_on_your_teacher_order_from_enter_orders_option() throws Throwable {
		 IStudentFlyerOrdersPage studentFlyerOrdersPage =
					getFactory().getIStudentFlyerOrdersPage();
			studentFlyerOrdersPage.clickOnYTOFromHomePage();
	    }
	 
	 @When("^teacher clicks on Student Flyer Orders from Enter Orders option$")
	    public void teacher_clicks_on_student_flyer_orders_from_enter_orders_option() throws Throwable {
		 IStudentFlyerOrdersPage studentFlyerOrdersPage =
					getFactory().getIStudentFlyerOrdersPage();
			studentFlyerOrdersPage.clickOnSOOFromHomePage();
	    }
	 
	 @Then("^tab title shows Student Flyer Orders$")
	    public void tab_title_shows_student_flyer_orders() throws Throwable {
		 IStudentFlyerOrdersPage studentFlyerOrdersPage =
					getFactory().getIStudentFlyerOrdersPage();
			studentFlyerOrdersPage.verifySFOTitle();
	    }
	 
	 @Then("^tab title shows Your Teacher Order$")
	    public void tab_title_shows_your_teacher_order() throws Throwable {
		 IStudentFlyerOrdersPage studentFlyerOrdersPage =
					getFactory().getIStudentFlyerOrdersPage();
			studentFlyerOrdersPage.verifyYTOTitle();
	    }
	
	@When("^teacher clicks on Review Cart button$")
    public void teacher_clicks_on_review_cart_button() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_clicks_on_ReviewCart_btn_in_SFO();
    }
	
	@Then("^teacher is navigated to Review Cart page$")
    public void teacher_is_navigated_to_review_cart_page() throws Throwable {
       System.out.println("this feature is not yet implemented");
    }

	
	@Then("^tab title shows Student Online Orders$")
    public void tab_title_shows_student_online_orders() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifySOOTitle();
    }
	
	@And("^no\\. of orders does not show in the tab$")
    public void no_of_orders_does_not_show_in_the_tab() throws Throwable {
		studonlinepage.verifyItemTotalCountOnSOOTab();
    }
	
	@And("^page title shows Student Online Orders$")
    public void page_title_shows_student_online_orders() throws Throwable {
        studonlinepage.verifyEmptySOOOrder();
    }
	
	@And("^message “There are no Student Online Orders to review\\. You may continue to your teacher order or go to Checkout\\.” displays$")
    public void message_there_are_no_student_online_orders_to_review_you_may_continue_to_your_teacher_order_or_go_to_checkout_displays() throws Throwable {
		 studonlinepage.verifyEmptySOOOrder();
    }
	
	
	@When("^teacher clicks on Item title of any item$")
	public void teacher_clicks_on_Item_title_of_any_item() throws Throwable {
		String SOO_Item1_Title = studonlinepage.getLblSOOItem1Title().getText();
		getTestBase().getContext().setProperty("testexecution.soo.item1title",
                String.valueOf(SOO_Item1_Title));
	    studonlinepage.getLblSOOItem1Title().click();
	}

	@Then("^teacher is navigated to Mini PDP page of corresponding item$")
	public void teacher_is_navigated_to_Mini_PDP_page_of_corresponding_item() throws Throwable {
		System.out.println("yet to implement");
	}

	@When("^teacher clicks 'See Full Details' hyperlink$")
	public void teacher_clicks_See_Full_Details_hyperlink() throws Throwable {
		studonlinepage.getlnksooseefulldetails().click();
		PauseUtil.pause(4500);
	}

	@Then("^teacher is navigated to PDP page of corresponding item$")
	public void teacher_is_navigated_to_PDP_page_of_corresponding_item() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();

        iStudentFlyerOrdersPage.uniqueItemDisplayProductDetailPage(
                TestBaseProvider.getTestBase().getTestData().getString("BookTitle"));
	}
	
	
	@When("^teacher clicks on Item number of any item$")
	public void teacher_clicks_on_Item_number_of_any_item() throws Throwable {
		String SOO_Item1_Number = studonlinepage.getLblSOOItem1Number().getText();
		getTestBase().getContext().setProperty("testexecution.soo.item1number",
                String.valueOf(SOO_Item1_Number));
	    studonlinepage.getLblSOOItem1Number().click();
	}

	@Then("^'See Full Details' hyperlink should be seen$")
	public void see_Full_Details_hyperlink_should_be_seen() throws Throwable {
		boolean seefuldetails = studonlinepage.getlnksooseefulldetails().isDisplayed();
		System.out.println("is seefulldetails link is seen: "+seefuldetails);
		Assert.assertTrue(seefuldetails);
	}

	@Then("^Remove/hide star and heart icon should be seen$")
	public void remove_hide_star_and_heart_icon_should_be_seen() throws Throwable {
		int soostar = studonlinepage.sizeiconsoostar().size();
		int sooheart = studonlinepage.sizeiconsooheart().size();
		if(soostar>=1 || sooheart>=1){
			Assert.fail("Star/heart icons are seen for items in SOO page");
		}
	}
	
	@Then("^total of all items displays without any taxes$")
    public void total_of_all_items_displays_without_any_taxes() throws Throwable {
		studonlinepage.verifynotaxesinsoopage();
    }
	
	@Then("^the items for corresponding child displays with correct Item#, title, Flyer, price, quantity$")
    public void the_items_for_corresponding_child_displays_with_correct_item_title_flyer_price_quantity() throws Throwable {
		proddetails.retrieve_data_excel("1ch1th");
		proddetails.verify_soo_iteminformation_checkoutpages();
    }
	
	@Then("^the items for corresponding child1 displays with correct Item#, title, Flyer, price, quantity$")
    public void the_items_for_corresponding_child1_displays_with_correct_item_title_flyer_price_quantity() throws Throwable {
		proddetails.retrieve_data_excel(TestBaseProvider.getTestBase().getTestData().getString("datatype"));
		proddetails.verify_soo_iteminformation_checkoutpages();
    }
	
	@And("^the items for corresponding child2 displays with correct Item#, title, Flyer, price, quantity$")
    public void the_items_for_corresponding_child2_displays_with_correct_item_title_flyer_price_quantity() throws Throwable {
		proddetails.verify_soo_iteminformation_checkoutpages();
    }
	
	@And("^order placed date displays$")
    public void order_placed_date_displays() throws Throwable {
        System.out.println("handled in above method");
    }
	
	@Then("^order submitted recently should appear on top$")
	public void order_submitted_recently_should_appear_on_top() throws Throwable {
		proddetails.retrieve_data_excel(TestBaseProvider.getTestBase().getTestData().getString("datatype"));
		proddetails.verify_soo_iteminformation_checkoutpages();
	}

	@Then("^the items for recent order corresponding child(\\d+) and child(\\d+) displays with correct Item#, title, Flyer, price, quantity$")
	public void the_items_for_recent_order_corresponding_child_and_child_displays_with_correct_Item_title_Flyer_price_quantity(int arg1, int arg2) throws Throwable {
		proddetails.verify_soo_iteminformation_checkoutpages();
	}

	@Then("^order placed date displays for recent order$")
	public void order_placed_date_displays_for_recent_order() throws Throwable {
		proddetails.verify_soo_iteminformation_checkoutpages();
	}

	@Then("^order submitted first should appear on bottom of the list$")
	public void order_submitted_first_should_appear_on_bottom_of_the_list() throws Throwable {
		proddetails.verify_soo_iteminformation_checkoutpages();
	}

	@Then("^the items for first order corresponding child(\\d+)  and child(\\d+) displays with correct Item#, title, Flyer, price, quantity$")
	public void the_items_for_first_order_corresponding_child_and_child_displays_with_correct_Item_title_Flyer_price_quantity(int arg1, int arg2) throws Throwable {
		proddetails.verify_soo_iteminformation_checkoutpages();
	}

	@Then("^order placed date displays for first order$")
	public void order_placed_date_displays_for_first_order() throws Throwable {
		proddetails.verify_soo_iteminformation_checkoutpages();
	}
	
	@Then("^order is grouped by child1 with correct Item number, title, Flyer, price, quantity$")
    public void order_is_grouped_by_child1_with_correct_item_number_title_flyer_price_quantity() throws Throwable {
		proddetails.retrieve_data_excel(TestBaseProvider.getTestBase().getTestData().getString("datatype"));
		proddetails.verify_soo_iteminformation_checkoutpages();
    }
	
	@Then("^order for teacher1 is grouped by child1 with correct Item number, title, Flyer, price, quantity$")
    public void order_for_teacher1_is_grouped_by_child1_with_correct_item_number_title_flyer_price_quantity() throws Throwable {
		proddetails.retrieve_firstrow_data_excel(TestBaseProvider.getTestBase().getTestData().getString("datatype"));
		proddetails.verify_soo_iteminformation_checkoutpages();
    }
	
	@Then("^order for teacher1 submitted recently should appear on top and grouped by child1 with correct Item information and totals$")
    public void order_for_teacher1_submitted_recently_should_appear_on_top_and_grouped_by_child1_with_correct_item_information_and_totals() throws Throwable {
		proddetails.retrieve_data_excel(TestBaseProvider.getTestBase().getTestData().getString("datatype"));
		proddetails.verify_soo_iteminformation_checkoutpages();
    }
	
	@Then("^order for teacher2 submitted recently should appear on top and grouped by child2 with correct Item information and totals$")
    public void order_for_teacher2_submitted_recently_should_appear_on_top_and_grouped_by_child2_with_correct_item_information_and_totals() throws Throwable {
		proddetails.retrieve_data_excel(TestBaseProvider.getTestBase().getTestData().getString("datatype2"));
		proddetails.verify_soo_iteminformation_checkoutpages();
    }
	
	@And("^order for teacher2 is grouped by child2 with correct Item number, title, Flyer, price, quantity$")
    public void order_for_teacher2_is_grouped_by_child2_with_correct_item_number_title_flyer_price_quantity() throws Throwable {
		proddetails.retrieve_secondrow_data_excel(TestBaseProvider.getTestBase().getTestData().getString("datatype"));
		proddetails.verify_soo_iteminformation_checkoutpages();
    }
	

    @And("^order placed date displays below the child1 for recent order$")
    public void order_placed_date_displays_below_the_child1_for_recent_order() throws Throwable {
    	 proddetails.verify_soo_iteminformation_checkoutpages();
    }
    
    @And("^order placed date displays below the child2 for recent order$")
    public void order_placed_date_displays_below_the_child2_for_recent_order() throws Throwable {
    	proddetails.verify_soo_iteminformation_checkoutpages();
    }
    
    @And("^order submitted first should appear at bottom and grouped by child1 with correct Item information and totals$")
    public void order_submitted_first_should_appear_at_bottom_and_grouped_by_child1_with_correct_item_information_and_totals() throws Throwable {
    	proddetails.verify_soo_iteminformation_checkoutpages();
    }
    
    @And("^order submitted first should appear at bottom and grouped by child2 with correct Item information and totals$")
    public void order_submitted_first_should_appear_at_bottom_and_grouped_by_child2_with_correct_item_information_and_totals() throws Throwable {
    	proddetails.verify_soo_iteminformation_checkoutpages();
    }
    
    @And("^order placed date displays below the child1 for first order$")
    public void order_placed_date_displays_below_the_child1_for_first_order() throws Throwable {
    	proddetails.verify_soo_iteminformation_checkoutpages();
    }
    
    @And("^order placed date displays below the child2 for first order$")
    public void order_placed_date_displays_below_the_child2_for_first_order() throws Throwable {
    	proddetails.verify_soo_iteminformation_checkoutpages();
    }
	
	 @And("^order is grouped by child2 with correct Item number, title, Flyer, price, quantity$")
	    public void order_is_grouped_by_child2_with_correct_item_number_title_flyer_price_quantity() throws Throwable {
		 proddetails.verify_soo_iteminformation_checkoutpages();
	    }

	@Then("^total for each student's order$")
	public void total_for_each_student_s_order() throws Throwable {
		proddetails.verify_soo_iteminformation_checkoutpages();
	}

	@Then("^order placed date is displayed below the child(\\d+)$")
	public void order_placed_date_is_displayed_below_the_child(int arg1) throws Throwable {
		proddetails.verify_soo_iteminformation_checkoutpages();
	}

	@Then("^cumulative total, Qty for all Student Online Orders$")
	public void cumulative_total_Qty_for_all_Student_Online_Orders() throws Throwable {
		proddetails.verify_soo_iteminformation_checkoutpages();
	}
	
	@Then("^Order is grouped by correct child with correct Item number, title, Flyer, price and quantity$")
    public void order_is_grouped_by_correct_child_with_correct_item_number_title_flyer_price_and_quantity() throws Throwable {
		System.out.println("to be implemented");
    }
	
	@And("^subtotal, tax total, and total for each student’s order$")
    public void subtotal_tax_total_and_total_for_each_students_order() throws Throwable {
		proddetails.verify_soo_iteminformation_checkoutpages();
    }

	@Then("^cumulative total for all Student Online Orders$")
	public void cumulative_total_for_all_Student_Online_Orders() throws Throwable {
		proddetails.verify_soo_iteminformation_checkoutpages();
	}

	@Then("^order placed date is displayed below the child$")
	public void order_placed_date_is_displayed_below_the_child() throws Throwable {
		proddetails.verify_soo_iteminformation_checkoutpages();
	}

	@Then("^teacher(\\d+) also logs into the application by providing \\[UserInformation\\]$")
	public void teacher_also_logs_into_the_application_by_providing_UserInformation(int arg1) throws Throwable {
		System.out.println("to be implemented");
	}

	@Then("^teacher(\\d+) clicks on Student Online Orders from Enter Orders option$")
	public void teacher_clicks_on_Student_Online_Orders_from_Enter_Orders_option(int arg1) throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.clickOnSOOFromHomePage();
	}
	
	@And("^message \"([^\"]*)\" displays$")
    public void message_something_displays(String strArg1) throws Throwable {
		System.out.println("to be implemented");
    }

	@Override
	protected void openPage() {
		 System.out.println("to be implemented");
		
	}
	
	@Then("^total of all items disaplays without any taxes$")
    public void total_of_all_items_disaplays_without_any_taxes() throws Throwable {
		System.out.println("yet to implement");
    }
	
	@When("^teacher clicks on \\(X\\) next to the child order$")
    public void teacher_clicks_on_x_next_to_the_child_order() throws Throwable {
		
		int sooitemssize_beforedelete = studonlinepage.sizeremoveiconitemssoopage().size();
		System.out.println("size of soo items before delete:"+sooitemssize_beforedelete);
		getTestBase().getContext().setProperty("testexecution.sooitemssize_beforedelete",
				Integer.valueOf(sooitemssize_beforedelete));
		PauseUtil.pause(2000);
		teacherhomepage.delete_item1_reviewcart().click();
		PauseUtil.pause(2000);
    }
	
	@And("^teacher selects a reason for deleting an order$")
    public void teacher_selects_a_reason_for_deleting_an_order() throws Throwable {
		WaitUtils.waitForDisplayed(studonlinepage.getDeleteItemOption(TestBaseProvider.getTestBase().getTestData().getString("option")));
		SCHUtils.clickUsingJavaScript(studonlinepage.getDeleteItemOption(TestBaseProvider.getTestBase().getTestData().getString("option")));
		AssertUtils.assertEnabled(studonlinepage.getBtnDelete());
    }

	
	@And("^teacher clicks on “Delete”$")
    public void teacher_clicks_on_delete() throws Throwable {
		SCHUtils.clickUsingJavaScript(studonlinepage.getBtnDelete());
    }
	
	@And("^teacher clicks on “Do Not Delete”$")
    public void teacher_clicks_on_do_not_delete() throws Throwable {
		SCHUtils.clickUsingJavaScript(studonlinepage.getBtnDoNotDelete());
    }
	
	@Then("^Delete modal is closed$")
    public void delete_modal_is_closed() throws Throwable {
        Boolean soodeletemodal = studonlinepage.getBtnDoNotDelete().isDisplayed();
        System.out.println("Soo delete modal is displayed or not?"+soodeletemodal);
        assertFalse(soodeletemodal);
    }
	
	 @Then("^the child order is deleted$")
	    public void the_child_order_is_deleted() throws Throwable {
		 int sooitemssize_afterdelete = studonlinepage.sizeremoveiconitemssoopage().size();
		 String sooitemssize_beforedelete1 = getTestBase().getContext().getProperty("testexecution.sooitemssize_beforedelete").toString();
		 int sooitemssize_beforedelete = Integer.parseInt(sooitemssize_beforedelete1);
		 Assert.assertNotEquals(sooitemssize_beforedelete, sooitemssize_afterdelete);
	    }
	 
	 @Then("^the child order is deleted on cart page$")
	    public void the_child_order_is_deleted_on_cart_page() throws Throwable {
		 int sooitemssize_afterdelete = studonlinepage.sizeremoveiconitemssoopage().size();
		 String sooitemssize_beforedelete1 = getTestBase().getContext().getProperty("testexecution.sooitemssize_beforedelete").toString();
		 int sooitemssize_beforedelete = Integer.parseInt(sooitemssize_beforedelete1);
		 Assert.assertNotEquals(sooitemssize_beforedelete, sooitemssize_afterdelete);
	    }
	 
	 @And("^the cart count remains the same as before$")
	    public void the_cart_count_remains_the_same_as_before() throws Throwable {
		 int sooitemssize_afterdelete = studonlinepage.sizeremoveiconitemssoopage().size();
		 String sooitemssize_beforedelete1 = getTestBase().getContext().getProperty("testexecution.sooitemssize_beforedelete").toString();
		 int sooitemssize_beforedelete = Integer.parseInt(sooitemssize_beforedelete1);
		 Assert.assertEquals(sooitemssize_beforedelete, sooitemssize_afterdelete);
	    }
	 
	 
	 @And("^the child order is not deleted$")
	    public void the_child_order_is_not_deleted() throws Throwable {
		 int sooitemssize_afterdelete = studonlinepage.sizeremoveiconitemssoopage().size();
		 String sooitemssize_beforedelete1 = getTestBase().getContext().getProperty("testexecution.sooitemssize_beforedelete").toString();
		 int sooitemssize_beforedelete = Integer.parseInt(sooitemssize_beforedelete1);
		 Assert.assertEquals(sooitemssize_beforedelete, sooitemssize_afterdelete);
	    }
	 
	 @And("^the cart count is reduced correctly$")
	    public void the_cart_count_is_reduced_correctly() throws Throwable {
		 int sooitemssize_afterdelete = studonlinepage.sizeremoveiconitemssoopage().size();
		 sooitemssize_afterdelete = sooitemssize_afterdelete+1;
		 String sooitemssize_beforedelete1 = getTestBase().getContext().getProperty("testexecution.sooitemssize_beforedelete").toString();
		 int sooitemssize_beforedelete = Integer.parseInt(sooitemssize_beforedelete1);
		 Assert.assertEquals(sooitemssize_beforedelete, sooitemssize_afterdelete);
	    }
	 
	 @And("^the child order is deleted on SOO page$")
	    public void the_child_order_is_deleted_on_soo_page() throws Throwable {
		 IStudentFlyerOrdersPage studentFlyerOrdersPage =
					getFactory().getIStudentFlyerOrdersPage();
			studentFlyerOrdersPage.clickOnSOOFromHomePage();
		 int sooitemssize_afterdelete = studonlinepage.sizeremoveiconitemssoopage().size();
		 String sooitemssize_beforedelete1 = getTestBase().getContext().getProperty("testexecution.sooitemssize_beforedelete").toString();
		 int sooitemssize_beforedelete = Integer.parseInt(sooitemssize_beforedelete1);
		 Assert.assertNotEquals(sooitemssize_beforedelete, sooitemssize_afterdelete);
	    }
	 
	 @Then("^teacher is presented with a new modal Message “Are You Sure You Want To Permanently Delete This Order\\?”$")
	    public void teacher_is_presented_with_a_new_modal_message_are_you_sure_you_want_to_permanently_delete_this_order() throws Throwable {
	        studonlinepage.verifyDeleteOptionModel();
	    }
	 
	 @And("^Modal sub-message – “This order will be permanently deleted, and we will inform (.+)’s parent the order has been cancelled and the credit card wil not be charged.”$")
	    public void modal_submessage_this_order_will_be_permanently_deleted_and_we_will_inform_s_parent_the_order_has_been_cancelled_and_the_credit_card_wil_not_be_charged(String childname) throws Throwable {
		 studonlinepage.verifyDeleteOptionModel();
	    }
	 
	 @And("^Modal question 2 – “Please tell us why you’re deleting this order:” displays$")
	    public void modal_question_2_please_tell_us_why_youre_deleting_this_order_displays() throws Throwable {
		 studonlinepage.verifyDeleteOptionModel();
	    }
	 
	 @And("^Teacher is presented with 3 selectable options:“This isn’t my student\\.”, “This order is incorrect – the parent asked me to delete it\\.”, “Other”$")
	    public void teacher_is_presented_with_3_selectable_optionsthis_isnt_my_student_this_order_is_incorrect_the_parent_asked_me_to_delete_it_other() throws Throwable {
		 studonlinepage.verifyDeleteOptionModel();
	    }
	 
	 @And("^“DO NOT DELETE” button in active state displays$")
	    public void do_not_delete_button_in_active_state_displays() throws Throwable {
		 studonlinepage.verifyDeleteOptionModel();
	    }
	 
	 @And("^“Delete” button displays in inactive state$")
	    public void delete_button_displays_in_inactive_state() throws Throwable {
		 studonlinepage.verifyDeleteOptionModel();
	    }
	 
	 @When("^teacher clicks on Student Online Orders hyperlink$")
		 public void teacher_clicks_on_Student_Online_Orders_hyperlink() throws Throwable {
			 IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
			 studentFlyerOrdersPage.clickSOOhyperlink();
		 }

	 @Then("^teacher is redirected to SOO page$")
		 public void teacher_is_redirected_to_SOO_page() throws Throwable {
			 IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
			 studentFlyerOrdersPage.verifySOOpagedisplayed();
		 }
	 
	 @Then("^empty SOO page displays$")
		 public void empty_SOO_page_displays() throws Throwable {
			 IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
			 studentFlyerOrdersPage.verify_TCOD_Review_Cart_displays();
			 //studentFlyerOrdersPage.tcod_verify_no_order_msg_reviewCart_SOO();
	 	 }
	 
	 @Then("^SOO page displays with parent orders$")
		 public void soo_page_displays_with_parent_orders() throws Throwable {
			 IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
			 studentFlyerOrdersPage.verify_TCOD_Review_Cart_displays();
			 studentFlyerOrdersPage.verify_TCOD_SOO_section_displays();
		 }
	 
	 @Then("^teacher views the correct count of SOO items in minicart$")
	    public void teacher_views_the_correct_count_of_soo_items_in_minicart() throws Throwable {
		 IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		 ProductDetails proddetails1 = new ProductDetails();
		 proddetails1.get_sooitems_count();
		 proddetails1.get_sfoitems_count();
		 proddetails1.get_sfofreepickitems_count();
		 proddetails1.get_ytoitems_count();
		 proddetails.get_teitems_count();
		 studentFlyerOrdersPage.verify_items_count_in_minicart();
		 }
	 
	 @Then("^correct count of SFO \\+ SOO \\+ YTO \\+ Teacher exclusive items displays in mini cart$")
	    public void correct_count_of_sfo_soo_yto_teacher_exclusive_items_displays_in_mini_cart() throws Throwable {
		 IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		 ProductDetails proddetails1 = new ProductDetails();
		 proddetails1.get_sooitems_count();
		 proddetails1.get_sfoitems_count();
		 proddetails1.get_sfofreepickitems_count();
		 proddetails1.get_ytoitems_count();
		 proddetails.get_teitems_count();
		 studentFlyerOrdersPage.verify_items_count_in_minicart();
	    }
	 
	 @Then("^correct count of SFO \\+ SOO items displays in mini cart$")
	    public void correct_count_of_sfo_soo_items_displays_in_mini_cart() throws Throwable {
		 IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		 ProductDetails proddetails1 = new ProductDetails();
		 proddetails1.get_sooitems_count();
		 proddetails1.get_sfoitems_count();
		 proddetails1.get_sfofreepickitems_count();
		 proddetails1.get_ytoitems_count();
		 proddetails.get_teitems_count();
		 studentFlyerOrdersPage.verify_items_count_in_minicart();
	    }

	 @Then("^correct count of SOO \\+ YTO items displays in mini cart$")
	    public void correct_count_of_soo_yto_items_displays_in_mini_cart() throws Throwable {
		 IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		 ProductDetails proddetails1 = new ProductDetails();
		 proddetails1.get_sooitems_count();
		 proddetails1.get_sfoitems_count();
		 proddetails1.get_sfofreepickitems_count();
		 proddetails1.get_ytoitems_count();
		 proddetails.get_teitems_count();
		 studentFlyerOrdersPage.verify_items_count_in_minicart();
	    }
	 
	 @Then("^correct count of SOO \\+ Teacher Exclusives items displays in mini cart$")
	    public void correct_count_of_soo_teacher_exclusives_items_displays_in_mini_cart() throws Throwable {
		 IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		 ProductDetails proddetails1 = new ProductDetails();
		 proddetails1.get_sooitems_count();
		 proddetails1.get_sfoitems_count();
		 proddetails1.get_sfofreepickitems_count();
		 proddetails1.get_ytoitems_count();
		 proddetails.get_teitems_count();
		 studentFlyerOrdersPage.verify_items_count_in_minicart();
	    }
	 
	 @Then("^correct count of SFO \\+ SOO \\+ YTO displays in mini cart$")
	    public void correct_count_of_sfo_soo_yto_displays_in_mini_cart() throws Throwable {
		 IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		 ProductDetails proddetails1 = new ProductDetails();
		 proddetails1.get_sooitems_count();
		 proddetails1.get_sfoitems_count();
		 proddetails1.get_sfofreepickitems_count();
		 proddetails1.get_ytoitems_count();
		 proddetails.get_teitems_count();
		 studentFlyerOrdersPage.verify_items_count_in_minicart();
	    }
	 
	 @Then("^correct count of SFO \\+ SOO \\+ Teacher Exclusives displays in mini cart$")
	    public void correct_count_of_sfo_soo_teacher_exclusives_displays_in_mini_cart() throws Throwable {
		 IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		 ProductDetails proddetails1 = new ProductDetails();
		 proddetails1.get_sooitems_count();
		 proddetails1.get_sfoitems_count();
		 proddetails1.get_sfofreepickitems_count();
		 proddetails1.get_ytoitems_count();
		 proddetails.get_teitems_count();
		 studentFlyerOrdersPage.verify_items_count_in_minicart();
	    }
	 
	 @Then("^correct count of cart displays$")
	    public void correct_count_of_cart_displays() throws Throwable {
		 IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		 ProductDetails proddetails1 = new ProductDetails();
		 proddetails1.get_sooitems_count();
		 proddetails1.get_sfoitems_count();
		 proddetails1.get_sfofreepickitems_count();
		 proddetails1.get_ytoitems_count();
		 proddetails.get_teitems_count();
		 studentFlyerOrdersPage.verify_items_count_in_minicart();
	    }
	 
	 @Then("^cart count is updated with the deleted order$")
	    public void cart_count_is_updated_with_the_deleted_order() throws Throwable {
		 IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		 ProductDetails proddetails1 = new ProductDetails();
		 proddetails1.get_sooitems_count();
		 proddetails1.get_sfoitems_count();
		 proddetails1.get_sfofreepickitems_count();
		 proddetails1.get_ytoitems_count();
		 proddetails.get_teitems_count();
		 studentFlyerOrdersPage.verify_items_count_in_minicart();
	    }
	 
	 @When("^teacher deletes an SOO order$")
	    public void teacher_deletes_an_soo_order() throws Throwable {
		 teacherhomepage.user_do_the_empty_soo_cart();
	    }
	 
	 @Then("^there is no pending SOO orders$")
	    public void there_is_no_pending_soo_orders() throws Throwable {
		 studonlinepage.verifyEmptySOOOrder();
	    }


}
