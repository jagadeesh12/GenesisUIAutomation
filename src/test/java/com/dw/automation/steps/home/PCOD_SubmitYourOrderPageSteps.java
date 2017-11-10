package com.dw.automation.steps.home;


import static com.dw.automation.pages.base.PageFactory.getFactory;

import java.io.File;
import java.util.Map;

import org.testng.Assert;

import com.dw.automation.pages.ICheckoutPage;
import com.dw.automation.pages.impl.CheckoutPage.ConfirmAndSubmitOrder;
import com.dw.automation.pages.impl.CheckoutPage.ShippingAndPayment;
import com.dw.automation.pages.impl.CheckoutPage_2;
import com.dw.automation.pages.impl.PCOD_HomePage;
import com.dw.automation.pages.impl.PCOD_LoginPage;
import com.dw.automation.pages.impl.PCOD_ReviewCartPage;
import com.dw.automation.pages.impl.PCOD_ShippingAndPaymentPage;
import com.dw.automation.pages.impl.PCOD_SubmitYourOrderPage;
import com.dw.automation.pages.impl.Pcod_ExcelLibrary;
import com.dw.automation.pages.impl.StudentFlyerOrdersPage;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.WaitUtils;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PCOD_SubmitYourOrderPageSteps {
	
PCOD_SubmitYourOrderPage pcod_submitpage = new PCOD_SubmitYourOrderPage();
PCOD_LoginPage pcod_logpage = new PCOD_LoginPage();
PCOD_ShippingAndPaymentPage pcod_shippage = new PCOD_ShippingAndPaymentPage();
CheckoutPage_2 chkpage2 =  new CheckoutPage_2();
StudentFlyerOrdersPage stud_page = new StudentFlyerOrdersPage();
PCOD_ReviewCartPage pcod_reviewpage = new PCOD_ReviewCartPage();
ShippingAndPayment shippingAndPaymentPage = getFactory().getICheckoutPage().getShippingAndPaymentSection();
PCOD_HomePage pcod_homepage = new PCOD_HomePage();
//######################### SHIPPING & PAYMENT PAGE		#############################################
    


@Then("^checkout phases 1\\) SHIPPING & PAYMENT 2\\) SUBMIT YOUR ORDER displays$")
public void checkout_phases_1_shipping_payment_2_submit_your_order_displays() throws Throwable {
	pcod_submitpage.pcod_verify_submityourorderpage_stepheader();  
}


@And("^SUBMIT YOUR ORDER is highlighted and not clickable$")
public void submit_your_order_is_highlighted_and_not_clickable() throws Throwable {
    pcod_submitpage.pcod_verify_element_highlighted(pcod_submitpage.getheadersubmityourordersubmityourorderpage());
}

@And("^clicks on SHIPPING & PAYMENT from step header$")
public void clicks_on_shipping_payment_from_step_header() throws Throwable {
    pcod_logpage.pcod_click_element(pcod_submitpage.getheadershippingandpaymentsubmityourorderpage());
}

@Then("^SHIPPING & PAYMENT page displays with all the order information intact$")
public void shipping_payment_page_displays_with_all_the_order_information_intact() throws Throwable {
    pcod_shippage.verify_shippingpayment_details_remainsame();
}

@And("^SHIPPING & PAYMENT is highlighted$")
public void shipping_payment_is_highlighted() throws Throwable {
	pcod_submitpage.pcod_verify_element_highlighted(pcod_submitpage.getheadershippingandpaymentsubmityourorderpage());
}

@And("^SUBMIT YOUR ORDER is not clickable$")
public void submit_your_order_is_not_clickable() throws Throwable {
    pcod_submitpage.pcod_verify_element_notclickbale(chkpage2.sizebtnSubmitInSubmitPage());
}


@Then("^Submit Your Order page displays$")
public void submit_your_order_page_displays() throws Throwable {
   PauseUtil.waitForAjaxToComplete(2500);
   PauseUtil.pause(4500);
   pcod_logpage.pcod_get_text_contains(pcod_submitpage.getheaderbelowstepheadersubmityourorderpage(), 
		   ConstantUtils.PCOD_TITLEBELOWSTEPHEADER_SUBMITYOURORDERPPAGE);
   //Assert.assertTrue(SCHUtils.isPresent(chkpage2.btnSubmitInSubmitPage()));
}

@When("^parent navigates to Shopping cart page from submit your order page$")
public void parent_navigates_to_shopping_cart_page_from_submit_your_order_page() throws Throwable {
	ConfirmAndSubmitOrder shippingAndPaymentPage =
			getFactory().getICheckoutPage().getConfirmAndSubmitOrder();
	shippingAndPaymentPage.getBtneditcartonconfirmpage().click();
    PauseUtil.waitForAjaxToComplete(2500);
    PauseUtil.pause(4500);
}

    @Then("^parent lands on order Confirmation page$")
    public void parent_lands_on_order_confirmation_page() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4500);
    	pcod_submitpage.verifypagetitleOrderconfirmationpage();

    }
    
    @Then("^parent(\\d+) lands on order Confirmation page$")
    public void parent_lands_on_order_confirmation_page(int parentNumber) throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4500);
    	pcod_submitpage.verifypagetitleOrderconfirmationpage();
    	pcod_submitpage.storeorderinformation_specificteacher(parentNumber);
    }
    
    @When("^parent clicks on Submit order from Submit Your Order page$")
    public void parent_clicks_on_submit_order_from_submit_your_order_page() throws Throwable {
        PauseUtil.pause(4500);
        pcod_submitpage.clicksubmitOrder_SubmitOrderPage();


    }
    
    @When("^parent(\\d+) clicks on Submit order from Submit Your Order page$")
    public void parent_clicks_on_submit_order_from_submit_your_order_page(int arg1) throws Throwable {
        PauseUtil.pause(4500);
        pcod_submitpage.clicksubmitOrder_SubmitOrderPage();


    }
    
    @And("^parent clicks on Submit Order$")
    public void parent_clicks_on_submit_order() throws Throwable {
    	PauseUtil.pause(4500);
        pcod_submitpage.clicksubmitOrder_SubmitOrderPage();
    }
    
    @And("^Payment section displays with Amount paid by Credit Card text$")
    public void payment_section_displays_with_amount_paid_by_credit_card_text() throws Throwable {
        pcod_logpage.pcod_get_text_contains(pcod_submitpage.getpaymentsectionsubmityourorderpage(),
        		ConstantUtils.PCOD_PAYMENTSECTION_AMTPAIDBYTITLE);
    }
    
    @And("^XXXX-XXXX-XXXX-(.+) and Total Amount Due displays$")
    public void xxxxxxxxxxxx_and_total_amount_due_displays(String lastfourdigitsofcc) throws Throwable {
    	pcod_logpage.pcod_get_text_contains(pcod_submitpage.getpaymentsectioncreditcardnumbersubmityourorderpage(),
        		TestBaseProvider.getTestBase().getTestData().getString("paymentsection_creditcardno"));
    	double exp_total_amt = pcod_shippage.totalamountdue_paymentpage(pcod_shippage.getsubtotalpaymentpaymentpage(),pcod_shippage.gettaxsubtotalpaymentpaymentpage(),
    			pcod_shippage.gettotalamountduepaymentpaymentpage());
    	System.out.println("Total Amount Due is: "+exp_total_amt);
    	
    	String act_total_amt12 = pcod_submitpage.getpaymentsectiontotalamountsubmityourorderpage().getText();
    	String act_total_amt1 = act_total_amt12.substring(1);
        double act_total_amt = Double.parseDouble(act_total_amt1);
        Assert.assertEquals(act_total_amt, exp_total_amt,"Total Amount Due in Payment section is not correct");
        
        String exp_creditcard_4digits = TestBaseProvider.getTestBase().getContext().
        		getProperty("testexecution.paymentpage.fourdigits.creditcard").toString();
        String act_creditcard_4digits1 = pcod_submitpage.getpaymentsectioncreditcardnumbersubmityourorderpage().getText();
        String act_creditcard_4digits = act_creditcard_4digits1.substring(act_creditcard_4digits1.length()-4);
        System.out.println("last four digits is :"+act_creditcard_4digits);
        Assert.assertEquals(act_creditcard_4digits, exp_creditcard_4digits,"Credit card number is incorrect");
    	
    	
    }
    
    @Then("^Order Details section displays with “ChildFirstName” in TeacherName's Class items$")
    public void order_details_section_displays_with_childfirstname_in_teachernames_class_items() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(4500);
        pcod_submitpage.verify_childname_teachername_orderdetail();
    }
    
    @Then("^Order Details section displays with “Child1FirstName” in Teacher1Name's Class items$")
    public void order_details_section_displays_with_child1firstname_in_teacher1names_class_items() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(4500);
    	 pcod_submitpage.verify_childname_teachername_orderdetail();
    }
    
    @And("^Order Details section displays with “Child2FirstName” in Teacher2Name's Class items$")
    public void order_details_section_displays_with_child2firstname_in_teacher2names_class_items() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(4500);
    	pcod_submitpage.verify_childname_teachername_orderdetail();
    }
    
    @And("^Order Details section displays with “Child3FirstName” in Teacher1Name's Class items$")
    public void order_details_section_displays_with_child3firstname_in_teacher1names_class_items() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(4500);
    	pcod_submitpage.verify_childname_teachername_orderdetail();
    }
    
    @And("^Order Details section displays with “Child2FirstName” in TeacherName's Class items$")
    public void order_details_section_displays_with_child2firstname_in_teachernames_class_items() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(4500);
    	pcod_submitpage.verify_childname_teachername_orderdetail();
    }
    
    @And("^Order Details section displays with “Child2FirstName” in Teacher1Name's Class items$")
    public void order_details_section_displays_with_child2firstname_in_teacher1names_class_items() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(4500);
    	pcod_submitpage.verify_childname_teachername_orderdetail();
    }

    
    
    @And("^Total Items - (.+) displays$")
    public void total_items_displays(String totalnoofitemsaddedtocart) throws Throwable {
       PauseUtil.waitForAjaxToComplete(2500);
       PauseUtil.pause(4500);
       pcod_submitpage.verify_totalqty_submitorder_orderdetail();
    }
    
    

    @And("^Quantity, Total \\- Item level subtotal\\(unit price\\* Qty\\) pretax amount displays$")
    public void quantity_total_item_level_subtotalunit_price_qty_pretax_amount_displays() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4500);
    	pcod_submitpage.verify_alldata_iteminformation_submitpage();
    }
    
    
    @And("^Quantity, Total \\- FREE and Coupon: “coupon code1” displays$")
    public void quantity_total_free_and_coupon_coupon_code1_displays() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4500);
    	pcod_submitpage.verify_alldata_freeiteminformation_submitpage();
    }
    
    @And("^Quantity, Total \\- FREE and Coupon: “coupon code2” displays$")
    public void quantity_total_free_and_coupon_coupon_code2_displays() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4500);
    	pcod_submitpage.verify_alldata_freeiteminformation_submitpage();
    }
    
    
    @And("^all items added to that child displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price$")
    public void all_items_added_to_that_child_displays_under_this_child_with_product_image_product_title_book_type_grade_age_reading_level_and_price() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4500);
    	pcod_submitpage.verify_alldata_iteminformation_submitpage();
    }
    
    @And("^all paid items added to child1 displays$")
    public void all_paid_items_added_to_child1_displays() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4500);
    	pcod_submitpage.verify_alldata_iteminformation_1item_2freeitems_submitpage();
    }
    
    @And("^all paid items added to child1 displays under Child1$")
    public void all_paid_items_added_to_child1_displays_under_child1() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4500);
    	pcod_submitpage.verify_alldata_iteminformation_submitpage();
    }
    
    @And("^all paid items added to child2 displays under Child2$")
    public void all_paid_items_added_to_child2_displays_under_child2() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4500);
    	pcod_submitpage.verify_alldata_iteminformation_submitpage();
    }
    

    @And("^freepick item added to child1 displays under this child with product image, product title, Book type, Grade, Age, Reading level, striked off price and text FREE$")
    public void freepick_item_added_to_child1_displays_under_this_child_with_product_image_product_title_book_type_grade_age_reading_level_striked_off_price_and_text_free() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4500);
    	//pcod_submitpage.verify_alldata_iteminformation_submitpage();
    	pcod_submitpage.verify_alldata_freeiteminformation_submitpage();
    }
    
    @And("^freepick item added to child2 displays under this child with product image, product title, Book type, Grade, Age, Reading level, striked off price and text FREE$")
    public void freepick_item_added_to_child2_displays_under_this_child_with_product_image_product_title_book_type_grade_age_reading_level_striked_off_price_and_text_free() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4500);
    	//pcod_submitpage.verify_alldata_iteminformation_submitpage();
    	pcod_submitpage.verify_alldata_freeiteminformation_submitpage();
    }
    
    @And("^all items added to child1 displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price$")
    public void all_items_added_to_child1_displays_under_this_child_with_product_image_product_title_book_type_grade_age_reading_level_and_price() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4500);
    	pcod_submitpage.verify_alldata_iteminformation_submitpage();
    }
    
    @And("^all items added to child2 displays under this child with product image, product title, Book type, Grade, Age, Reading level and Price$")
    public void all_items_added_to_child2_displays_under_this_child_with_product_image_product_title_book_type_grade_age_reading_level_and_price() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4500);
    	pcod_submitpage.verify_alldata_iteminformation_submitpage();
    }
    
    @Then("^Order Confirmation page displays with Site header with Scholastic Reading Club logo and Home icon$")
    public void order_confirmation_page_displays_with_site_header_with_scholastic_reading_club_logo_and_home_icon() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4500);
    	pcod_submitpage.verifyhomeicon_confirmationpage();
    }
    
    @And("^confirmation message “Thank You for Your Order!”$")
    public void confirmation_message_thank_you_for_your_order() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4500);
    	pcod_submitpage.verifypagetitleOrderconfirmationpage();
    }
    
    @And("^Sub\\-message “You will receive an email once your child’s teacher submits your order\\. Your credit card won’t be charged until your books have shipped\\. You can check your order status at any time by visiting your Account\\.” displays$")
    	    public void submessage_you_will_receive_an_email_once_your_childs_teacher_submits_your_order_your_credit_card_wont_be_charged_until_your_books_have_shipped_you_can_check_your_order_status_at_any_time_by_visiting_your_account_displays() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4500);
    	pcod_submitpage.verifycontentassetOrderconfirmationpage();
    	    }
    
    @And("^Order number displays$")
    public void order_number_displays() throws Throwable {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4500);
    	pcod_submitpage.verifyordernumberOrderconfirmationpage();
    }

    @Then("^the order information is recorded in Excel$")
    public void the_order_information_is_recorded_in_Excel() throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_submitpage.record_order_information_in_Excel();
    }
    
    @Then("^the order information is recorded in Excel for scenario \"([^\"]*)\"$")
    public void the_order_information_is_recorded_in_Excel(String scenario) throws Throwable {
    	PauseUtil.pause(4500);
    	pcod_submitpage.record_order_information_in_Excel(scenario);
    }
    
    @Given("^parents login, add items and submit orders on the PCOD site$")
    public void parents_login_add_items_and_submit_orders_on_the_PCOD_site() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	int idx = 1;
    	int numParents = 1;
    	
    	String sep = File.separator;
		String excelDirectory = System.getProperty("user.dir") + sep + "src" + sep + "ExcelFile";
		
    	Map<String, String> data = Pcod_ExcelLibrary.find_get_ExcelData_SpecificRow(excelDirectory, "pcodorders.xlsx", "DeleteSubmittedSOO", idx);
    	
    	while (data != null) {
    		
	    	pcod_logpage.parent_login2(pcod_logpage.getTxtUsername(), data.get("parent" + numParents + " email"), "passw0rd");
	        PauseUtil.pause(1500);
	        
	        // Search for item and assign to child1
	        for(int i = 1; i <= 5; i++){
	        	if(data.get("child" + numParents + " item" + i + " number").equals(""))
	        		continue;
	        	
	        	String childname = data.get("child" + numParents + " name");
	        	String itemnum = data.get("child" + numParents + " item" + i + " number");
	        	String itemqty = data.get("child" + numParents + " item" + i + " quantity");
	        	
	        	stud_page.placeItem_GlobalSearch_and_assign_to_child(itemnum, itemqty, childname);
	        }
	        
	        // If second child is available, place orders for him/her
	        if(( !data.get("scenario").equals("2Parents1child1teacher")) && (!data.get("child2 name").equals("")) ){
	        	System.out.println("Second child is present. Adding items for child2");
	        	
	        	for(int i = 1; i <= 5; i++){
	        		if(data.get("child2 item" + i + " number").equals(""))
		        		continue;
	        		
		        	String childname = data.get("child2 name");
		        	String itemnum = data.get("child2 item" + i + " number");
		        	String itemqty = data.get("child2 item" + i + " quantity");
		        	
		        	stud_page.placeItem_GlobalSearch_and_assign_to_child(itemnum, itemqty, childname);
		        }
	        }
	        
	        // Go to Payment page
	        PauseUtil.waitForAjaxToComplete(2500);
	        PauseUtil.pause(2500);
	        pcod_reviewpage.getbtnproceedtocheckoutreviewcart().click();
	        
	        // Uncheck POP and select a saved credit card
	        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
	        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
	                ConstantUtils.CREDITCARD);
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
	    	SCHUtils.selectOptionByIndex(shippingAndPaymentPage.drpSelectaCard(), 2);
	        
	    	// Go to Confirm and Submit page
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
	    	SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
	    	SCHUtils.waitForLoaderToDismiss();
	    	PauseUtil.waitForAjaxToComplete(2500);
	    	PauseUtil.pause(2500);
	    	
	    	// Submit order
	    	PauseUtil.pause(4500);
	        pcod_submitpage.clicksubmitOrder_SubmitOrderPage();
	        
	        // Go to Confirmation page
	        PauseUtil.waitForAjaxToComplete(2500);
	        PauseUtil.pause(4500);
	        pcod_submitpage.verifypagetitleOrderconfirmationpage();
	        
	        System.out.println("Re-did the order for account " + data.get("teacher1 account"));

	        // Logout
	        PauseUtil.pause(4500);
	    	pcod_homepage.pcod_Click_homepage_icon();
	    	PauseUtil.pause(4500);
	    	pcod_homepage.pcod_clickMyAcc_SignOut();
	    	
	    	// If second parent is present, go back to while loop
	    	if(!data.get("parent2 email").equals("")){
	    		numParents = numParents + 1;
	    		continue;
	    	} else{
	    		numParents = 1;
	    	}
	    	
	    	//Remove that order info row from the excel
	        System.out.println("Removing the order information from excel");
	    	Pcod_ExcelLibrary.removeAndShiftRowsUp_ExcelData_SpecificRow(excelDirectory, "pcodorders.xlsx", "DeleteSubmittedSOO", idx);
	    	
	    	System.out.println("Removed successfully!");
	    	
	    	data = Pcod_ExcelLibrary.find_get_ExcelData_SpecificRow(excelDirectory, "pcodorders.xlsx", "DeleteSubmittedSOO", idx);
	    	
    	}
    }
}
