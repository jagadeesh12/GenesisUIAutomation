package com.dw.automation.steps.home;


import static com.dw.automation.pages.base.PageFactory.getFactory;

import com.dw.automation.pages.ICheckoutPage;
import com.dw.automation.pages.PCOD_IShippingAndPaymentPage;
import com.dw.automation.pages.impl.CheckoutPage.ShippingAndPayment;
import com.dw.automation.pages.impl.CheckoutPage_2;
import com.dw.automation.pages.impl.PCOD_HomePage;
import com.dw.automation.pages.impl.PCOD_LoginPage;
import com.dw.automation.pages.impl.PCOD_ReviewCartPage;
import com.dw.automation.pages.impl.PCOD_ShippingAndPaymentPage;
import com.dw.automation.pages.impl.ProductDetailPage;
import com.dw.automation.pages.impl.StudentFlyerOrdersPage;
import com.dw.automation.pages.impl.TeachersHomePage;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.WaitUtils;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PCOD_ShippingAndPaymentPageSteps {
	
PCOD_HomePage pcod_homepage = new PCOD_HomePage();
PCOD_LoginPage pcod_logpage = new PCOD_LoginPage();
TeachersHomePage teach_homepage = new TeachersHomePage();
ProductDetailPage prod_page = new ProductDetailPage();
StudentFlyerOrdersPage stud_page = new StudentFlyerOrdersPage();
PCOD_ReviewCartPage pcod_reviewpage = new PCOD_ReviewCartPage();
PCOD_ShippingAndPaymentPage pcod_shippage = new PCOD_ShippingAndPaymentPage();
CheckoutPage_2 teach_chk = new CheckoutPage_2();
ShippingAndPayment shippingAndPaymentPage =
getFactory().getICheckoutPage().getShippingAndPaymentSection();

//######################### SHIPPING & PAYMENT PAGE		#############################################
    


@Then("^Shipping section displays with “(.+)'s items will be shipped to:”$")
public void shipping_section_displays_with_s_items_will_be_shipped_to(String childname) throws Throwable {
	pcod_logpage.verify_element_displayed(pcod_shippage.getsectionshippingpaymentpage());
	pcod_logpage.pcod_get_text_contains(pcod_shippage.getsectionshippingpaymentpage(),
			TestBaseProvider.getTestBase().getTestData().getString("childname")+"'s Items will be shipped to");
	Thread.sleep(10000);
}

@And("^teacher's first and last name with school address (.+) displays$")
public void teachers_first_and_last_name_with_school_address_displays(String schoolnamestreetcitycountrypostalcode) throws Throwable {
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(2500);
	pcod_shippage.pcod_child1_teacherdetails(TestBaseProvider.getTestBase().getTestData().getString("child1_header"));
}

@And("^single teacher's first and last name with school address (.+) displays$")
public void single_teachers_first_and_last_name_with_school_address_displays(String schoolnamestreetcitycountrypostalcode) throws Throwable {
	pcod_shippage.pcod_singlechild_teacherdetails(TestBaseProvider.getTestBase().getTestData().getString("child1_header"));
}


@And("^child2's teacher first and last name with school address (.+) displays$")
public void child2s_teacher_first_and_last_name_with_school_address_displays(String schoolnamestreetcitycountrypostalcode) throws Throwable {
	pcod_shippage.verify_child2info_shippingpage(TestBaseProvider.getTestBase().getTestData());
}

@And("^child2 teacher's first and last name with school address (.+) displays$")
public void child2_teachers_first_and_last_name_with_school_address_displays(String schoolnamestreetcitycountrypostalcode) throws Throwable {
	pcod_shippage.pcod_child2_teacherdetails(TestBaseProvider.getTestBase().getTestData().getString("child1_header"));
}

@And("^teacher's information for child2 should be same as child1$")
public void teachers_information_for_child2_should_be_same_as_child1() throws Throwable {
	pcod_shippage.verify_child2info_shippingpage(TestBaseProvider.getTestBase().getTestData());
}

@And("^“Child2name's items will be shipped to:”$")
public void child2names_items_will_be_shipped_to() throws Throwable {
	pcod_logpage.verify_element_displayed(pcod_shippage.getsectionshippingpaymentpage());
	pcod_logpage.pcod_get_text_contains(pcod_shippage.getsectionshippingpaymentpage(),
			TestBaseProvider.getTestBase().getTestData().getString("childname2")+"'s Items will be shipped to");
}

@And("^“Child3name's items will be shipped to:”$")
public void child3names_items_will_be_shipped_to() throws Throwable {
	pcod_logpage.verify_element_displayed(pcod_shippage.getsectionshippingpaymentpage());
	pcod_logpage.pcod_get_text_contains(pcod_shippage.getsectionshippingpaymentpage(),
			TestBaseProvider.getTestBase().getTestData().getString("childname3")+"'s Items will be shipped to");
}

@And("^Shipping section presented with “(.+)'s items will be shipped to:”$")
public void shipping_section_presented_with_s_items_will_be_shipped_to(String child3name) throws Throwable {
	pcod_logpage.verify_element_displayed(pcod_shippage.getsectionshippingpaymentpage());
	pcod_logpage.pcod_get_text_contains(pcod_shippage.getsectionshippingpaymentpage(),
			TestBaseProvider.getTestBase().getTestData().getString("childname")+"'s Items will be shipped to");
}

@And("^teacher1's first and last name with school address (.+) displays$")
public void teacher1s_first_and_last_name_with_school_address_displays(String schoolname1streetcitycountrypostalcode) throws Throwable {
	pcod_shippage.pcod_child1_teacherdetails(TestBaseProvider.getTestBase().getTestData().getString("child1_header"));
}

@And("^teacher2's first and last name with school address (.+) displays$")
public void teacher2s_first_and_last_name_with_school_address_displays(String schoolname1streetcitycountrypostalcode) throws Throwable {
	pcod_shippage.pcod_child2_teacherdetails(TestBaseProvider.getTestBase().getTestData().getString("child2_header"));
}

@And("^clicks on Submit Your Order on step header$")
public void clicks_on_submit_your_order_on_step_header() throws Throwable {
	System.out.println("method to implement");
}

@Then("^Submit Your Order is not clickable$")
public void submit_your_order_is_not_clickable() throws Throwable {
	System.out.println("method to implement");
}

@And("^SHIPPING & PAYMENT is highlighted and not clickable$")
public void shipping_payment_is_highlighted_and_not_clickable() throws Throwable {
	System.out.println("method to implement");
}

@Then("^Ordercheckout footer displays with Scholastic\\.ca, About Scholastic, Careers,International, PRIVACY POLICY, WEB PRIVACY POLICY, TERMS OF USE TM ® & © 2017 Scholastic Inc\\. All Rights Reserved$")
public void ordercheckout_footer_displays_with_scholasticca_about_scholastic_careersinternational_privacy_policy_web_privacy_policy_terms_of_use_tm_2017_scholastic_inc_all_rights_reserved() throws Throwable {
	pcod_shippage.verify_pcod_footersection();
}


@When("^parent selects “Add a new Card” from credit card dropdown$")
public void parent_selects_add_a_new_card_from_credit_card_dropdown() throws Throwable {
	ShippingAndPayment shippingAndPaymentPage =
			getFactory().getICheckoutPage().getShippingAndPaymentSection();
    
    ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    checkoutPage.unCheckPOP();
    PauseUtil.pause(3000);
    WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
	SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
			ConstantUtils.CREDITCARD);
	PauseUtil.pause(3000);
	WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
	SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
			ConstantUtils.ADDNEWCARD);
	PauseUtil.pause(3000);
}

@When("^parent selects a Saved card from the dropdown or adds a new card if no saved card is present")
public void parent_selects_a_Saved_card_from_the_dropdown_or_adds_a_new_card_if_no_saved_card_is_present() throws Throwable {
	ShippingAndPayment shippingAndPaymentPage =
            getFactory().getICheckoutPage().getShippingAndPaymentSection();

    ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    checkoutPage.unCheckPOP();
    PauseUtil.pause(3000);
    WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
    SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
            ConstantUtils.CREDITCARD);
    PauseUtil.pause(3000);
    WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
    
	try{
		SCHUtils.selectOptionByIndex(shippingAndPaymentPage.drpSelectaCard(), 2);
		System.out.println("Selected an existing saved credit card from the credit card list");
		
	} catch(Exception e){
		System.out.println("No saved credit card is on this account. Adding a new credit card...");
		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
				ConstantUtils.ADDNEWCARD);
		PauseUtil.pause(3000);
		pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
	}
}

@When("^parent(\\d+) selects a Saved card from the dropdown or adds a new card if no saved card is present")
public void parent_selects_a_Saved_card_from_the_dropdown_or_adds_a_new_card_if_no_saved_card_is_present(int parentNumber) throws Throwable {
	ShippingAndPayment shippingAndPaymentPage =
            getFactory().getICheckoutPage().getShippingAndPaymentSection();

    ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    checkoutPage.unCheckPOP();
    PauseUtil.pause(3000);
    WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
    SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
            ConstantUtils.CREDITCARD);
    PauseUtil.pause(3000);
    WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
    
	try{
		SCHUtils.selectOptionByIndex(shippingAndPaymentPage.drpSelectaCard(), 2);
		System.out.println("Selected an existing saved credit card from the credit card list");
		
	} catch(Exception e){
		System.out.println("No saved credit card is on this account. Adding a new credit card...");
		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
				ConstantUtils.ADDNEWCARD);
		PauseUtil.pause(3000);
		pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData(), parentNumber);
	}
}

    @And("^parent selects saved visa card from credit card dropdown$")
    public void parent_selects_saved_visa_card_from_credit_card_dropdown() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CREDITCARD);
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
                ConstantUtils.CCVISCARD);
        PauseUtil.pause(3000);
        String cardvalue = pcod_shippage.getcreditcarddropdownpayment().getText();
        String digits = cardvalue.substring(cardvalue.length()-4);
        System.out.println("last four digits is :"+digits);
        TestBaseProvider.getTestBase().getContext()
		.setProperty("testexecution.paymentpage.fourdigits.creditcard", digits);

    }
    
    
    @And("^parent selects saved Visa card as payment$")
    public void parent_selects_saved_visa_card_as_payment() throws Throwable {
    	ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CREDITCARD);
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
                ConstantUtils.CCVISCARD);
        PauseUtil.pause(3000);
        String cardvalue = pcod_shippage.getcreditcarddropdownpayment().getText();
        String digits = cardvalue.substring(cardvalue.length()-4);
        System.out.println("last four digits is :"+digits);
        TestBaseProvider.getTestBase().getContext()
		.setProperty("testexecution.paymentpage.fourdigits.creditcard", digits);
    }
    
    
    @And("^parent selects saved Master card as payment$")
    public void parent_selects_saved_master_card_as_payment() throws Throwable {
    	ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CREDITCARD);
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
                ConstantUtils.CCMASTERCARD);
        PauseUtil.pause(3000);
        String cardvalue = pcod_shippage.getcreditcarddropdownpayment().getText();
        String digits = cardvalue.substring(cardvalue.length()-4);
        System.out.println("last four digits is :"+digits);
        TestBaseProvider.getTestBase().getContext()
		.setProperty("testexecution.paymentpage.fourdigits.creditcard", digits);
    }

    @And("^parent selects saved 2\\-series Master card from credit card dropdown$")
    public void parent_selects_saved_2series_master_card_from_credit_card_dropdown() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CREDITCARD);
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
                ConstantUtils.CCMASTERCARD2);
        PauseUtil.pause(3000);
        String cardvalue = pcod_shippage.getcreditcarddropdownpayment().getText();
        String digits = cardvalue.substring(cardvalue.length()-4);
        System.out.println("last four digits is :"+digits);
        TestBaseProvider.getTestBase().getContext()
		.setProperty("testexecution.paymentpage.fourdigits.creditcard", digits);

    }

    @And("^parent selects saved 5\\-series Master card from credit card dropdown$")
    public void parent_selects_saved_5series_master_card_from_credit_card_dropdown() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CREDITCARD);
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
                ConstantUtils.CCMASTERCARD5);
        PauseUtil.pause(3000);
        String cardvalue = pcod_shippage.getcreditcarddropdownpayment().getText();
        String digits = cardvalue.substring(cardvalue.length()-4);
        System.out.println("last four digits is :"+digits);
        TestBaseProvider.getTestBase().getContext()
		.setProperty("testexecution.paymentpage.fourdigits.creditcard", digits);
    }

    @And("^parent selects saved Amex card from credit card dropdown$")
    public void parent_selects_saved_amex_card_from_credit_card_dropdown() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CREDITCARD);
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
                ConstantUtils.CCAMEXCARD);
        PauseUtil.pause(3000);
        String cardvalue = pcod_shippage.getcreditcarddropdownpayment().getText();
        String digits = cardvalue.substring(cardvalue.length()-4);
        System.out.println("last four digits is :"+digits);
        TestBaseProvider.getTestBase().getContext()
		.setProperty("testexecution.paymentpage.fourdigits.creditcard", digits);
    }
    
    @And("^parent selects saved Amex card as payment$")
    public void parent_selects_saved_amex_card_as_payment() throws Throwable {
    	ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CREDITCARD);
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
                ConstantUtils.CCAMEXCARD);
        PauseUtil.pause(3000);
        String cardvalue = pcod_shippage.getcreditcarddropdownpayment().getText();
        String digits = cardvalue.substring(cardvalue.length()-4);
        System.out.println("last four digits is :"+digits);
        TestBaseProvider.getTestBase().getContext()
		.setProperty("testexecution.paymentpage.fourdigits.creditcard", digits);
    }

    @And("^parent selects New Visa card as payment$")
    public void parent_selects_new_visa_card_as_payment() throws Throwable {
    	ShippingAndPayment shippingAndPaymentPage =
    			getFactory().getICheckoutPage().getShippingAndPaymentSection();
        
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
    	SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
    			ConstantUtils.CREDITCARD);
    	PauseUtil.pause(3000);
    	WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
    	SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
    			ConstantUtils.ADDNEWCARD);
    	PauseUtil.pause(3000);
    	
    	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
    	
        
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
    	SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
    	SCHUtils.waitForLoaderToDismiss();
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(2500);
    }
    
    
    @And("^parent selects New Visa card as payment and navigate to Submit Your Order page$")
    public void parent_selects_new_visa_card_as_payment_and_navigate_to_submit_your_order_page() throws Throwable {
    	ShippingAndPayment shippingAndPaymentPage =
    			getFactory().getICheckoutPage().getShippingAndPaymentSection();
        
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
    	SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
    			ConstantUtils.CREDITCARD);
    	PauseUtil.pause(3000);
    	WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
    	SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
    			ConstantUtils.ADDNEWCARD);
    	PauseUtil.pause(3000);
    	
    	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
    	
        
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
    	SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
    	SCHUtils.waitForLoaderToDismiss();
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(2500);
    }
    
    
    
    @When("^parent selects New Master card as payment and navigate to Submit Your Order page$")
    public void parent_selects_new_master_card_as_payment_and_navigate_to_submit_your_order_page() throws Throwable {
    	ShippingAndPayment shippingAndPaymentPage =
    			getFactory().getICheckoutPage().getShippingAndPaymentSection();
        
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
    	SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
    			ConstantUtils.CREDITCARD);
    	PauseUtil.pause(3000);
    	WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
    	SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
    			ConstantUtils.ADDNEWCARD);
    	PauseUtil.pause(3000);
    	
    	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
    	
        
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
    	SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
    	SCHUtils.waitForLoaderToDismiss();
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(2500);
    }
    
    
    @And("^parent selects New Amex card as payment and navigate to Submit Your Order page$")
    public void parent_selects_new_amex_card_as_payment_and_navigate_to_submit_your_order_page() throws Throwable {
    	ShippingAndPayment shippingAndPaymentPage =
    			getFactory().getICheckoutPage().getShippingAndPaymentSection();
        
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
    	SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
    			ConstantUtils.CREDITCARD);
    	PauseUtil.pause(3000);
    	WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
    	SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
    			ConstantUtils.ADDNEWCARD);
    	PauseUtil.pause(3000);
    	
    	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
    	
        
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
    	SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
    	SCHUtils.waitForLoaderToDismiss();
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(2500);
    }
    
    
    @And("^parent selects New 5series Master card as payment and navigate to Submit Your Order page$")
    public void parent_selects_new_5series_master_card_as_payment_and_navigate_to_submit_your_order_page() throws Throwable {
    	ShippingAndPayment shippingAndPaymentPage =
    			getFactory().getICheckoutPage().getShippingAndPaymentSection();
        
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
    	SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
    			ConstantUtils.CREDITCARD);
    	PauseUtil.pause(3000);
    	WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
    	SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
    			ConstantUtils.ADDNEWCARD);
    	PauseUtil.pause(3000);
    	
    	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
    	
        
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
    	SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
    	SCHUtils.waitForLoaderToDismiss();
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(2500);
    }
    
    @And("^parent selects New Master card as payment$")
    public void parent_selects_new_master_card_as_payment() throws Throwable {
    	ShippingAndPayment shippingAndPaymentPage =
    			getFactory().getICheckoutPage().getShippingAndPaymentSection();
        
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
    	SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
    			ConstantUtils.CREDITCARD);
    	PauseUtil.pause(3000);
    	WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
    	SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
    			ConstantUtils.ADDNEWCARD);
    	PauseUtil.pause(3000);
    	
    	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
    	
        
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
    	SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
    	SCHUtils.waitForLoaderToDismiss();
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(2500);
    }
    
    
    
    @And("^parent selects New Amex card as payment$")
    public void parent_selects_new_amex_card_as_payment() throws Throwable {
    	ShippingAndPayment shippingAndPaymentPage =
    			getFactory().getICheckoutPage().getShippingAndPaymentSection();
        
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
    	SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
    			ConstantUtils.CREDITCARD);
    	PauseUtil.pause(3000);
    	WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
    	SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
    			ConstantUtils.ADDNEWCARD);
    	PauseUtil.pause(3000);
    	
    	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
    	
        
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
    	SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
    	SCHUtils.waitForLoaderToDismiss();
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(2500);
    }
    
    
    
    @And("^parent selects New 5series Master card as payment$")
    public void parent_selects_new_5series_master_card_as_payment() throws Throwable {
    	ShippingAndPayment shippingAndPaymentPage =
    			getFactory().getICheckoutPage().getShippingAndPaymentSection();
        
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
    	SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
    			ConstantUtils.CREDITCARD);
    	PauseUtil.pause(3000);
    	WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
    	SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
    			ConstantUtils.ADDNEWCARD);
    	PauseUtil.pause(3000);
    	
    	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
    	
        
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
    	SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
    	SCHUtils.waitForLoaderToDismiss();
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(2500);
    }


    @And("^enters valid data in all credit card fields entering Visa card number and country selected as Canada$")
public void enters_valid_data_in_all_credit_card_fields_entering_visa_card_number_and_country_selected_as_canada() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
}

@And("^enters valid data in all credit card fields except for First Name$")
public void enters_valid_data_in_all_credit_card_fields_except_for_first_name() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
}

@And("^enters valid data in all credit card fields except for Last Name$")
public void enters_valid_data_in_all_credit_card_fields_except_for_last_name() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
}

@And("^enters valid data in all credit card fields except for Address 1$")
public void enters_valid_data_in_all_credit_card_fields_except_for_address_1() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
}

@And("^enters valid data in all credit card fields except for Postal Code$")
public void enters_valid_data_in_all_credit_card_fields_except_for_postal_code() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
}

@And("^enters valid data in all credit card fields except for City$")
public void enters_valid_data_in_all_credit_card_fields_except_for_city() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
}


@And("^enters valid data in all credit card fields except for Name on Card$")
public void enters_valid_data_in_all_credit_card_fields_except_for_name_on_card() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
}

@And("^enters valid data in all credit card fields except for Province$")
public void enters_valid_data_in_all_credit_card_fields_except_for_province() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
}

@And("^enters valid data in all credit card fields except for Card#$")
public void enters_valid_data_in_all_credit_card_fields_except_for_card() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
}

@And("^enters valid data in all credit card fields except for Phone number$")
public void enters_valid_data_in_all_credit_card_fields_except_for_phone_number() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
}

@And("^enters valid data in all credit card fields except for Security Code$")
public void enters_valid_data_in_all_credit_card_fields_except_for_security_code() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
}

@And("^enters valid data in all credit card fields except for expiration date month$")
public void enters_valid_data_in_all_credit_card_fields_except_for_expiration_date_month() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard_ExceptExpiryMonthYear(TestBaseProvider.getTestBase().getTestData());
}

@And("^enters valid data in all credit card fields except for expiration date year$")
public void enters_valid_data_in_all_credit_card_fields_except_for_expiration_date_year() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard_ExceptExpiryMonthYear(TestBaseProvider.getTestBase().getTestData());
}

@And("^clicks on Continue Checkout$")
public void clicks_on_continue_checkout() throws Throwable {
	ShippingAndPayment shippingAndPaymentPage =
			getFactory().getICheckoutPage().getShippingAndPaymentSection();
    
    WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
	SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
	SCHUtils.waitForLoaderToDismiss();
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(2500);
    }

@When("^parent navigates to Submit Your Order page$")
public void parent_navigates_to_submit_your_order_page() throws Throwable {
	ShippingAndPayment shippingAndPaymentPage =
			getFactory().getICheckoutPage().getShippingAndPaymentSection();
    
    WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
	SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
	SCHUtils.waitForLoaderToDismiss();
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(2500);
}


@And("^parent navigates to Submit Your Order page from shopping cart$")
public void parent_navigates_to_submit_your_order_page_from_shopping_cart() throws Throwable {
    
    PauseUtil.waitForAjaxToComplete(3500);
    PauseUtil.pause(3500);
    pcod_reviewpage.getbtnproceedtocheckoutreviewcart().click();
    
    ShippingAndPayment shippingAndPaymentPage =
            getFactory().getICheckoutPage().getShippingAndPaymentSection();

    ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    checkoutPage.unCheckPOP();
    PauseUtil.pause(3000);
    WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
    SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
            ConstantUtils.CREDITCARD);
    PauseUtil.pause(3000);
    WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
    SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
            ConstantUtils.CCVISCARD);
    PauseUtil.pause(3000);
    String cardvalue = pcod_shippage.getcreditcarddropdownpayment().getText();
    String digits = cardvalue.substring(cardvalue.length()-4);
    System.out.println("last four digits is :"+digits);
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.paymentpage.fourdigits.creditcard", digits);
    
    WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
	SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
	SCHUtils.waitForLoaderToDismiss();
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(2500);
}


@And("^enters valid data in all credit card fields entering Master card number and country selected as Canada$")
public void enters_valid_data_in_all_credit_card_fields_entering_master_card_number_and_country_selected_as_canada() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
}

@And("^enters valid data in all credit card fields entering Amex card number and country selected as Canada$")
public void enters_valid_data_in_all_credit_card_fields_entering_amex_card_number_and_country_selected_as_canada() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
}


@And("^enters valid data in all credit card fields entering Visa card number and country selected as US$")
public void enters_valid_data_in_all_credit_card_fields_entering_visa_card_number_and_country_selected_as_us() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
}

@And("^enters valid data in all credit card fields entering Master card number and country selected as US$")
public void enters_valid_data_in_all_credit_card_fields_entering_master_card_number_and_country_selected_as_us() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
}

@And("^enters valid data in all credit card fields entering Master card number with 2 series and country selected as US$")
public void enters_valid_data_in_all_credit_card_fields_entering_master_card_number_with_2_series_and_country_selected_as_us() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
}

@And("^enters valid data in all credit card fields entering Master card number with 2 series and country selected as Canada$")
public void enters_valid_data_in_all_credit_card_fields_entering_master_card_number_with_2_series_and_country_selected_as_canada() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
}


@And("^enters valid data in all credit card fields entering Amex card number and country selected as US$")
public void enters_valid_data_in_all_credit_card_fields_entering_amex_card_number_and_country_selected_as_us() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
}

@And("^enters valid data in all credit card fields and enters invalid credit card number$")
public void enters_valid_data_in_all_credit_card_fields_and_enters_invalid_credit_card_number() throws Throwable {
	pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
}

@Then("^error message “Invalid Credit Card Number, Please Enter Correct Card Number” displays on Shipping & Payment page$")
public void error_message_invalid_credit_card_number_please_enter_correct_card_number_displays_on_shipping_payment_page() throws Throwable {
	pcod_logpage.verify_validationmessage(pcod_logpage.gettooltipconnectyourteachererrormsg(),ConstantUtils.INVALIDCREDITCARD_MSG);
}

@Then("^Payment section displays with (.+)'s Orders - (.+)$")
public void payment_section_displays_with_s_orders_(String childname, String pretaxsubtotal) throws Throwable {
	pcod_logpage.verify_element_displayed(pcod_shippage.getsectionpaymentpaymentpage());
	pcod_logpage.pcod_get_text_contains(pcod_shippage.getsectionpaymentpaymentpage(),
			TestBaseProvider.getTestBase().getTestData().getString("childname")+"'s Orders");
	Thread.sleep(2500);
	
	pcod_shippage.verify_itemwise_totalprice_paymentpage(pcod_shippage.sizeitem1pricepaymentpaymentpage(), pcod_shippage.getitem1pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem2pricepaymentpaymentpage(), pcod_shippage.getitem2pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem3pricepaymentpaymentpage(), pcod_shippage.getitem3pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem4pricepaymentpaymentpage(), pcod_shippage.getitem4pricepaymentpaymentpage());
}

@And("^Order Summary section displays with (.+)'s Orders - (.+)$")
public void order_summary_section_displays_with_s_orders_(String childname1, String child1spretaxsubtotal) throws Throwable {
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(4500);
	pcod_logpage.verify_element_displayed(pcod_shippage.getsectionpaymentpaymentpage());
	pcod_logpage.pcod_get_text_contains(pcod_shippage.getsectionpaymentpaymentpage(),
			 TestBaseProvider.getTestBase().getTestData().getString("childname")+"'s Orders");
	Thread.sleep(2500);
	
	pcod_shippage.verify_itemwise_totalprice_paymentpage(pcod_shippage.sizeitem1pricepaymentpaymentpage(), pcod_shippage.getitem1pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem2pricepaymentpaymentpage(), pcod_shippage.getitem2pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem3pricepaymentpaymentpage(), pcod_shippage.getitem3pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem4pricepaymentpaymentpage(), pcod_shippage.getitem4pricepaymentpaymentpage());
}


@And("^Childname2's Orders - (.+)$")
public void childname2s_orders_(String child2spretaxsubtotal) throws Throwable {
	pcod_logpage.verify_element_displayed(pcod_shippage.getsectionpaymentpaymentpage());
	pcod_logpage.pcod_get_text_contains(pcod_shippage.getsectionpaymentpaymentpage(),
			TestBaseProvider.getTestBase().getTestData().getString("childname2")+"'s Orders");
	Thread.sleep(2500);
	
	pcod_shippage.verify_itemwise_totalprice_paymentpage(pcod_shippage.sizeitem1pricepaymentpaymentpage(), pcod_shippage.getitem1pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem2pricepaymentpaymentpage(), pcod_shippage.getitem2pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem3pricepaymentpaymentpage(), pcod_shippage.getitem3pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem4pricepaymentpaymentpage(), pcod_shippage.getitem4pricepaymentpaymentpage());
}


@And("^Childname3's Orders - (.+)$")
public void childname3s_orders_(String child3spretaxsubtotal) throws Throwable {
	pcod_logpage.verify_element_displayed(pcod_shippage.getsectionpaymentpaymentpage());
	pcod_logpage.pcod_get_text_contains(pcod_shippage.getsectionpaymentpaymentpage(),
			TestBaseProvider.getTestBase().getTestData().getString("childname3")+"'s Orders");
	Thread.sleep(2500);
	
	pcod_shippage.verify_itemwise_totalprice_paymentpage(pcod_shippage.sizeitem1pricepaymentpaymentpage(), pcod_shippage.getitem1pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem2pricepaymentpaymentpage(), pcod_shippage.getitem2pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem3pricepaymentpaymentpage(), pcod_shippage.getitem3pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem4pricepaymentpaymentpage(), pcod_shippage.getitem4pricepaymentpaymentpage());
}


@And("^Childname4's Orders - (.+)$")
public void childname4s_orders_(String child4spretaxsubtotal) throws Throwable {
	pcod_logpage.verify_element_displayed(pcod_shippage.getsectionpaymentpaymentpage());
	pcod_logpage.pcod_get_text_contains(pcod_shippage.getsectionpaymentpaymentpage(),
			TestBaseProvider.getTestBase().getTestData().getString("childname4")+"'s Orders");
	Thread.sleep(2500);
	
	pcod_shippage.verify_itemwise_totalprice_paymentpage(pcod_shippage.sizeitem1pricepaymentpaymentpage(), pcod_shippage.getitem1pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem2pricepaymentpaymentpage(), pcod_shippage.getitem2pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem3pricepaymentpaymentpage(), pcod_shippage.getitem3pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem4pricepaymentpaymentpage(), pcod_shippage.getitem4pricepaymentpaymentpage());
}

@And("^OrderSubtotal - (.+)$")
public void ordersubtotal_(String pretaxsubtotalofallchildorders) throws Throwable {
	pcod_shippage.verify_items_subtotal_paymentpage(pcod_shippage.sizeitem1pricepaymentpaymentpage(), pcod_shippage.getitem1pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem2pricepaymentpaymentpage(), pcod_shippage.getitem2pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem3pricepaymentpaymentpage(), pcod_shippage.getitem3pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem4pricepaymentpaymentpage(), pcod_shippage.getitem4pricepaymentpaymentpage(),
			pcod_shippage.getsubtotalpaymentpaymentpage());
}



@And("^Order Subtotal - (.+) displays$")
public void order_subtotal_displays(String subtotalofallchildren) throws Throwable {
	pcod_shippage.verify_items_subtotal_paymentpage(pcod_shippage.sizeitem1pricepaymentpaymentpage(), pcod_shippage.getitem1pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem2pricepaymentpaymentpage(), pcod_shippage.getitem2pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem3pricepaymentpaymentpage(), pcod_shippage.getitem3pricepaymentpaymentpage(), 
			pcod_shippage.sizeitem4pricepaymentpaymentpage(), pcod_shippage.getitem4pricepaymentpaymentpage(),
			pcod_shippage.getsubtotalpaymentpaymentpage());
}


@And("^Tax Subtotal - (.+)$")
public void tax_subtotal_(String taxsubtotalforallchlidorders) throws Throwable {
	 pcod_shippage.verify_items_subtotal_tax_paymentpage(pcod_shippage.gettaxsubtotalpaymentpaymentpage());
}


@And("^Tax Subtotal for GST and GST_PST - (.+)$")
public void tax_subtotal_for_gst_and_gstpst_(String taxsubtotalforallchildorders) throws Throwable {
	pcod_shippage.verify_items_subtotal_tax_2Provinces_paymentpage(pcod_shippage.gettaxsubtotalpaymentpaymentpage());
}

@And("^Tax Subtotal for GST/PST and GST/PST - (.+)$")
public void tax_subtotal_for_gstpst_and_gstpst_(String taxsubtotalforallchildorders) throws Throwable {
	pcod_shippage.verify_items_subtotal_tax_2Provinces_paymentpage(pcod_shippage.gettaxsubtotalpaymentpaymentpage());
}

@And("^Tax Subtotal for GST and HST - (.+)$")
public void tax_subtotal_for_gst_and_hst_(String taxsubtotalforallchlidorders) throws Throwable {
	pcod_shippage.verify_items_subtotal_tax_2Provinces_paymentpage(pcod_shippage.gettaxsubtotalpaymentpaymentpage());
}

@And("^Tax Subtotal for GST/PST and HST - (.+)$")
public void tax_subtotal_for_gstpst_and_hst_(String taxsubtotalforallchlidorders) throws Throwable {
	pcod_shippage.verify_items_subtotal_tax_2Provinces_paymentpage(pcod_shippage.gettaxsubtotalpaymentpaymentpage());
}

@And("^Tax Subtotal for GST/PST and GST/PST exempted- (.+)$")
public void tax_subtotal_for_gstpst_and_gstpst_exempted_tax_for_child_connected_to_pst_tax_exempted_teacher_only_gst_is_charged(String taxsubtotalforallchildorders) throws Throwable {
	pcod_shippage.verify_items_subtotal_tax_2Provinces_paymentpage(pcod_shippage.gettaxsubtotalpaymentpaymentpage());
}


@And("^Tax Subtotal for 4 children - (.+)$")
public void tax_subtotal_for_4_children_(String taxsubtotalforallchlidorders) throws Throwable {
	pcod_shippage.verify_items_subtotal_tax_4Provinces_paymentpage(pcod_shippage.gettaxsubtotalpaymentpaymentpage());
}

@And("^Total Amount Due - (.+) displays$")
public void total_amount_due_displays(String ordersubtotaltaxsubtotal) throws Throwable {
	pcod_shippage.verify_items_totalamountdue_paymentpage(pcod_shippage.getsubtotalpaymentpaymentpage(),pcod_shippage.gettaxsubtotalpaymentpaymentpage(),
			pcod_shippage.gettotalamountduepaymentpaymentpage());
}

@Then("^First Name field is highlighted in Yellow$")
public void first_name_field_is_highlighted_in_yellow() throws Throwable {
	pcod_logpage.verify_requiredfield_missed_highlighted(teach_chk.getTxtBillingFirstName(), "First name field in Add New Card");
}


@Then("^Last Name field is highlighted in Yellow$")
public void last_name_field_is_highlighted_in_yellow() throws Throwable {
   pcod_logpage.verify_requiredfield_missed_highlighted(teach_chk.getTxtBillingLastName(), "Last name field in Add New Card");
}

@Then("^Address 1 field is highlighted in Yellow$")
public void address_1_field_is_highlighted_in_yellow() throws Throwable {
	pcod_logpage.verify_requiredfield_missed_highlighted(teach_chk.getTxtBillingAddressOne(), "Address1 field in Add New Card");
}

@Then("^Postal Code field is highlighted in Yellow$")
public void postal_code_field_is_highlighted_in_yellow() throws Throwable {
	pcod_logpage.verify_requiredfield_missed_highlighted(teach_chk.getTxtBillingZip(), "Postal code field in Add New Card");
}

@Then("^City field is highlighted in Yellow$")
public void city_field_is_highlighted_in_yellow() throws Throwable {
	pcod_logpage.verify_requiredfield_missed_highlighted(teach_chk.getTxtBillingCity(), "City field in Add New Card");
}

@Then("^Name on Card field is highlighted in Yellow$")
public void name_on_card_field_is_highlighted_in_yellow() throws Throwable {
	pcod_logpage.verify_requiredfield_missed_highlighted(teach_chk.getTxtNameOnCard(), "CardName field in Add New Card");
}

@Then("^Card# field is highlighted in Yellow$")
public void card_field_is_highlighted_in_yellow() throws Throwable {
	pcod_logpage.verify_requiredfield_missed_highlighted(teach_chk.getTxtCardNumber(), "Card Number field in Add New Card");
}

@Then("^Phone Number field is highlighted in Yellow$")
public void phone_number_field_is_highlighted_in_yellow() throws Throwable {
	pcod_logpage.verify_requiredfield_missed_highlighted(teach_chk.getTxtBillingPhoneNumber(), "Phone Number field in Add New Card");
}


@Then("^Security code field is highlighted in Yellow$")
public void security_code_field_is_highlighted_in_yellow() throws Throwable {
	pcod_logpage.verify_requiredfield_missed_highlighted(teach_chk.getTxtCardSecurityCode(), "Security Number field in Add New Card");
}

@And("^Continue Checkout button is disabled$")
public void continue_checkout_button_is_disabled() throws Throwable {
    pcod_logpage.verify_button_disabled(shippingAndPaymentPage.sizebtnContinueCheckout());
}


@Then("^Section title “PAYMENT METHOD” displays$")
public void section_title_payment_method_displays() throws Throwable {
   pcod_logpage.pcod_get_text_contains(pcod_shippage.gettitlepaymentmehtodpaymentpage(),
		   TestBaseProvider.getTestBase().getTestData().getString("payment_header"));
}


@And("^payment dropdown displays with grey text “Select a Payment Method”$")
public void payment_dropdown_displays_with_grey_text_select_a_payment_method() throws Throwable {
	SCHUtils.isSize(shippingAndPaymentPage.chkDrpPaymentMethod());
	pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.getDrpPaymentMethod(),
			TestBaseProvider.getTestBase().getTestData().getString("payment_drpdown_header"));
}


@And("^options for dropdown displays “Credit Card”$")
public void options_for_dropdown_displays_credit_card() throws Throwable {
    pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.getDrpPaymentMethod(),
    		TestBaseProvider.getTestBase().getTestData().getString("payment_option"));
}

@When("^parent selects Credit card from dropdown$")
public void parent_selects_credit_card_from_dropdown() throws Throwable {
	 WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
     SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
             ConstantUtils.CREDITCARD);
     PauseUtil.pause(3000);
}

@Then("^another dropdown populates with grey text “Select a Card”$")
public void another_dropdown_populates_with_grey_text_select_a_card() throws Throwable {
	
   //AssertUtils.assertDisplayed(shippingAndPaymentPage.drpSelectaCard());
   pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.drpSelectaCard(),
			TestBaseProvider.getTestBase().getTestData().getString("selectcard_drpdown_header"));
   
}

@And("^options for dropdown display “Add a New Card”$")
public void options_for_dropdown_display_add_a_new_card() throws Throwable {
	pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.drpSelectaCard(),
    		TestBaseProvider.getTestBase().getTestData().getString("selectcard_option"));
}


@Then("^“NAME ON CARD”, CARD# field displays with text fields$")
public void name_on_card_card_field_displays_with_text_fields() throws Throwable {
	PauseUtil.pause(4500);
	System.out.println("payment details are:"+shippingAndPaymentPage.getpaymentmethodsection().getText());
	pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.getpaymentmethodsection(),
    		TestBaseProvider.getTestBase().getTestData().getString("nameoncard_header"));
	pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.getpaymentmethodsection(),
    		TestBaseProvider.getTestBase().getTestData().getString("cardno_header"));
}

@And("^“We accept American Express, Visam and MasterCard only\\.” text displays under CARD# textbox$")
public void we_accept_american_express_visam_and_mastercard_only_text_displays_under_card_textbox() throws Throwable {
	pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.getpaymentmethodsection(),(ConstantUtils.PCOD_CARDINSTRUCTION));
}


@And("^EXPIRATION DATE \\(month dropdown and year dropdown\\) and SECURITY CODE fields displays$")
public void expiration_date_month_dropdown_and_year_dropdown_and_security_code_fields_displays() throws Throwable {
	pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.getpaymentmethodsection(),
    		TestBaseProvider.getTestBase().getTestData().getString("expirationdate_header"));
	pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.getpaymentmethodsection(),
    		TestBaseProvider.getTestBase().getTestData().getString("securitycode_header"));
}

@And("^BILLING INFORMATION SECTION displays with FIRST NAME, LAST NAME, ADDRESS 1, ADDRESS 2, POSTAL CODE, CITY, PROVINCE, COUNTRY And PHONE NUMBER fields$")
public void billing_information_section_displays_with_first_name_last_name_address_1_address_2_postal_code_city_province_country_and_phone_number_fields() throws Throwable {
	pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.getpaymentmethodsection(),
    		TestBaseProvider.getTestBase().getTestData().getString("firstname_header"));
	pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.getpaymentmethodsection(),
    		TestBaseProvider.getTestBase().getTestData().getString("lastname_header"));
	pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.getpaymentmethodsection(),
    		TestBaseProvider.getTestBase().getTestData().getString("address1_header"));
	pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.getpaymentmethodsection(),
    		TestBaseProvider.getTestBase().getTestData().getString("address2_header"));
	pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.getpaymentmethodsection(),
    		TestBaseProvider.getTestBase().getTestData().getString("postalcode_header"));
	pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.getpaymentmethodsection(),
    		TestBaseProvider.getTestBase().getTestData().getString("city_header"));
	pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.getpaymentmethodsection(),
    		TestBaseProvider.getTestBase().getTestData().getString("province_header"));
	pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.getpaymentmethodsection(),
    		TestBaseProvider.getTestBase().getTestData().getString("country_header"));
	pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.getpaymentmethodsection(),
    		TestBaseProvider.getTestBase().getTestData().getString("phone_header"));
}

@And("^COUNTRY dropdown has US and CA values$")
public void country_dropdown_has_us_and_ca_values() throws Throwable {
	
	pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.getpaymentmethodsection(),
    		TestBaseProvider.getTestBase().getTestData().getString("country1"));
	pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.getpaymentmethodsection(),
    		TestBaseProvider.getTestBase().getTestData().getString("country2"));
}

@And("^“SAVE THIS CARD” checkbox is disabled by default$")
public void save_this_card_checkbox_is_disabled_by_default() throws Throwable {
	pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.getpaymentmethodsection(),
    		TestBaseProvider.getTestBase().getTestData().getString("country2"));
}

@And("^CANCEL button displays$")
public void cancel_button_displays() throws Throwable {
	pcod_logpage.pcod_get_text_contains(shippingAndPaymentPage.getpaymentmethodsection(),
    		TestBaseProvider.getTestBase().getTestData().getString("Cancel_btn"));
}


// Satnam Story 540

    @And("^parent enters valid data in all credit card fields entering Visa card number$")
    public void parent_enters_valid_data_in_all_credit_card_fields_entering_visa_card_number() throws Throwable {
        pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());

    }

    @And("^enters valid data in all credit card fields entering Master card number$")
    public void enters_valid_data_in_all_credit_card_fields_entering_master_card_number() throws Throwable {
        pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
    }

    @And("^enters valid data in all credit card fields entering Amex card number$")
    public void enters_valid_data_in_all_credit_card_fields_entering_amex_card_number() throws Throwable {
        pcod_shippage.pcod_addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
    }


    @And("^Save credit card option selected$")
    public void save_credit_card_option_selected() throws Throwable {
       pcod_shippage.clickpcod_shippingpayment_saveCreditCard();

    }

    @Then("^this card is shown as saved card in Credit card dropdown$")
    public void this_card_is_shown_as_saved_card_in_credit_card_dropdown() throws Throwable {
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CREDITCARD);
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
        PCOD_IShippingAndPaymentPage shippaypage = getFactory().getPCOD_IShipPage();
        shippaypage.verifysavedCard_paymentpage(TestBaseProvider.getTestBase().getTestData().getString("savedcard"));

    }

    @When("^parent clicks on Delete$")
    public void parent_clicks_on_delete() throws Throwable {
        TestBaseProvider.getTestBase().getDriver().navigate().refresh();
        pcod_reviewpage.remove_FREEPICK_coupon();


    }


}
