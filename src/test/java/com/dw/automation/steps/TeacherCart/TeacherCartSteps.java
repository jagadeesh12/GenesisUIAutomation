package com.dw.automation.steps.TeacherCart;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import java.util.HashMap;
import java.util.List;

import cucumber.api.PendingException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.dw.automation.beans.ProductInfoBean;
import com.dw.automation.pages.IBooksAndResourcesPage;
import com.dw.automation.pages.ICartPage;
import com.dw.automation.pages.ICheckoutPage;
import com.dw.automation.pages.IConfirmAndSubmitOrder;
import com.dw.automation.pages.ICouponsandRewards;
import com.dw.automation.pages.IReviewOrderPage;
import com.dw.automation.pages.IStudentFlyerOrdersPage;
import com.dw.automation.pages.IStudentOnlineOrdersPage;
import com.dw.automation.pages.ITeachersHomePage;
import com.dw.automation.pages.impl.CartPage;
import com.dw.automation.pages.impl.CheckoutPage;
import com.dw.automation.pages.impl.PCOD_LoginPage;
import com.dw.automation.pages.impl.CheckoutPage.ConfirmAndSubmitOrder;
import com.dw.automation.pages.impl.CheckoutPage.RewardsAndCoupons;
import com.dw.automation.pages.impl.CheckoutPage.ShippingAndPayment;
import com.dw.automation.pages.impl.ReviewOrdersPage;
import com.dw.automation.pages.impl.StudentFlyerOrdersPage;
import com.dw.automation.pages.impl.StudentOnlineOrdersPage;
import com.dw.automation.pages.impl.TeachersHomePage;
import com.dw.automation.sections.IHeaderSection;
import com.dw.automation.sections.base.SectionFactory;
import com.dw.automation.steps.home.TeacherHomePageSteps;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.LocatorUtils;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.WaitUtils;
import com.scholastic.torque.webdriver.ExtendedElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TeacherCartSteps {
	
	@FindBy(locator = "dw.teacher.home.enterorder.studentflyerorder.applicationLoader")
	private WebElement applicationLoader;
	
	@FindBy(locator = "dw.reviewcart.btn.proceedtocheckout")
	private WebElement btnProceedToCheckout;
	
	@FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.chk.txt.rewardqanda")
	private List<WebElement> chktxtRewardQandA;
	
	@FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.txt.rewardqanda")
	private WebElement txtRewardQandA;
	
	@FindBy(locator = "dw.checkout.rewardsandcoupons.lbl.errormessage")
	private WebElement lblErrorMessage;


	public WebElement getLblErrorMessage() {
		return lblErrorMessage;
	}
	
	
	public WebElement getTxtRewardQandA() {
		return txtRewardQandA;
	}
	
	public List<WebElement> chkTxtRewardQandA() {
		return chktxtRewardQandA;
	}
	
	public WebElement getapplicationLoader() {
		return applicationLoader;
	}
	
	public WebElement getBtnProceedToCheckout() {
		return btnProceedToCheckout;
	}
	
	
	@When("^user wants to shop books and resources$")
	public void user_wants_to_shop_books_and_resources() throws Throwable {

	}

	@When("^user adds a book in cart$")
	public void user_adds_a_book_in_cart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user selects go to checkout$")
	public void user_selects_go_to_checkout() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user should see all item detail on review cart$")
	public void user_should_see_all_item_detail_on_review_cart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user should be on review cart$")
	public void user_should_be_on_review_cart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user selects redeem coupons$")
	public void user_selects_redeem_coupons() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user should be on rewards and coupons section of checkout page$")
	public void user_should_be_on_rewards_and_coupons_section_of_checkout_page()
			throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.verifyRewardsAndCouponsPage();
	}
	
	
	@And("^teacher tries to checkout from rewards and coupons page$")
    public void teacher_tries_to_checkout_from_rewards_and_coupons_page() throws Throwable {
		SCHUtils.waitForLoaderToDismiss();
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		
		for(int i=0;i<=2;i++){
			if(rewardsAndCoupons.chkBtnSkip().size()!=0)
			{
		//while (SCHUtils.isPresent(rewardsAndCoupons.getBtnSkip())) {
			System.out.println(" rewardsAndCoupons.getBtnSkip() ==========> "
					+ SCHUtils.isPresent(rewardsAndCoupons.getBtnSkip()));
			SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnSkip());
			PauseUtil.waitForAjaxToComplete();
		}
		}
		System.out.println(" rewardsAndCoupons.getBtnContinueCheckout() ==========> "
				+ SCHUtils.isPresent(rewardsAndCoupons.getBtnContinueCheckout()));
		SCHUtils.scrollToView(rewardsAndCoupons.getBtnContinueCheckout());
		SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
		SCHUtils.waitForLoaderToDismiss();
    }
	


	@When("^teacher proceeds to checkout from rewards and coupons page$")


	public void teacher_proceeds_to_checkout_from_rewards_and_coupons_page()
			throws Throwable {
		SCHUtils.waitForLoaderToDismiss();
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		ICheckoutPage checkOut = getFactory().getICheckoutPage();
		
		while (SCHUtils.isPresent(rewardsAndCoupons.getBtnSkip())) {

			System.out.println(" rewardsAndCoupons.getBtnSkip() ==========> "
					+ SCHUtils.isPresent(rewardsAndCoupons.getBtnSkip()));
			SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnSkip());
			PauseUtil.waitForAjaxToComplete();
		}

		/*if(chkTxtRewardQandA().size()!=0){
			
		if(getTxtRewardQandA().isDisplayed()){*/	
		
		//--> soma to handle DTS in checkout // 1 line
		checkOut.getRewardsAndCouponsSection().checkOutWithDTS(TestBaseProvider.getTestBase().getTestData());
		
		checkOut.getRewardsAndCouponsSection().enterTossInNumberOfStudent(TestBaseProvider.getTestBase().getTestData());
		/*}
		}
*/
		System.out.println(" rewardsAndCoupons.getBtnContinueCheckout() ==========> "
				+ SCHUtils.isPresent(rewardsAndCoupons.getBtnContinueCheckout()));
		SCHUtils.scrollToView(rewardsAndCoupons.getBtnContinueCheckout());
		// SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
		SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
		// rewardsAndCoupons.getBtnContinueCheckout().click();
		PauseUtil.pause(1000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();

	   
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CHECKPAYMENTMETHOD);
		
		
		
		PauseUtil.pause(1500);
		//SCHUtils.waitForLoaderToDismiss();
		//PauseUtil.waitForAjaxToComplete();
		WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
		SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
		
		
		// shippingAndPaymentPage.getBtnContinueCheckout().click();
		//PauseUtil.pause(5000);
		//SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		//PauseUtil.pause(2000);
		//SCHUtils.waitForLoaderToDismiss();
		//PauseUtil.waitForAjaxToComplete();
		}
	
	
	
	@And("^teacher proceeds checkout from rewards and coupons page$")
    public void teacher_proceeds_checkout_from_rewards_and_coupons_page() throws Throwable {
		SCHUtils.waitForLoaderToDismiss();
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		ICheckoutPage checkOut = getFactory().getICheckoutPage();
		
        checkOut.getRewardsAndCouponsSection().checkOutWithDTS(TestBaseProvider.getTestBase().getTestData());
		
		checkOut.getRewardsAndCouponsSection().enterTossInNumberOfStudent(TestBaseProvider.getTestBase().getTestData());

		System.out.println(" rewardsAndCoupons.getBtnContinueCheckout() ==========> "
				+ SCHUtils.isPresent(rewardsAndCoupons.getBtnContinueCheckout()));
		SCHUtils.scrollToView(rewardsAndCoupons.getBtnContinueCheckout());
		// SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
		SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
		// rewardsAndCoupons.getBtnContinueCheckout().click();
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

    // Below step is used to checkout from rewards & coupon page without entering Toss in Value

    @And("^teacher proceeds checkout from the rewards and coupons page$")
    public void teacher_proceeds_checkout_from_the_rewards_and_coupons_page() throws Throwable {
        SCHUtils.waitForLoaderToDismiss();
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        ICheckoutPage checkOut = getFactory().getICheckoutPage();

        //checkOut.getRewardsAndCouponsSection().checkOutWithDTS(TestBaseProvider.getTestBase().getTestData());

        //checkOut.getRewardsAndCouponsSection().enterTossInNumberOfStudent(TestBaseProvider.getTestBase().getTestData());

        System.out.println(" rewardsAndCoupons.getBtnContinueCheckout() ==========> "
                + SCHUtils.isPresent(rewardsAndCoupons.getBtnContinueCheckout()));
        SCHUtils.scrollToView(rewardsAndCoupons.getBtnContinueCheckout());
        // SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
        SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
        // rewardsAndCoupons.getBtnContinueCheckout().click();
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


    @And("^teacher proceeds to checkout from coupons & rewards page and submit the order$")
    public void teacher_proceeds_to_checkout_from_coupons_rewards_page_and_submit_the_order() throws Throwable {
		CheckoutPage chkpge = new CheckoutPage();
		chkpge.getRewardsAndCouponsSection().enterTossInNumberOfStudent(TestBaseProvider.getTestBase().getTestData());
		chkpge.teacher_proceedtocheckout_couponsrewardspage_submitorder();
    }

	//this mehtod is used for only qa student incentive scenarios
	 @And("^teacher proceeds to confirm & submit page from couons & rewards page$")
	    public void teacher_proceeds_to_confirm_submit_page_from_couons_rewards_page() throws Throwable {
		 RewardsAndCoupons rewardsAndCoupons =
					getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		 System.out.println(" rewardsAndCoupons.getBtnContinueCheckout() ==========> "
					+ SCHUtils.isPresent(rewardsAndCoupons.getBtnContinueCheckout()));
			SCHUtils.scrollToView(rewardsAndCoupons.getBtnContinueCheckout());
			// SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
			SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
			// rewardsAndCoupons.getBtnContinueCheckout().click();
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
	
	
	
	@And("^teacher navigates to payment page$")
    public void teacher_navigates_to_payment_page() throws Throwable {
        
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
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		ICheckoutPage checkOut = getFactory().getICheckoutPage();
		PauseUtil.pause(2000);
		for(int i=0;i<=3;i++){
			if(rewardsAndCoupons.chkBtnSkip().size()!=0)
			{
		
			System.out.println(" rewardsAndCoupons.getBtnSkip() ==========> "
					+ SCHUtils.isPresent(rewardsAndCoupons.getBtnSkip()));
			SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnSkip());
			PauseUtil.waitForAjaxToComplete();
		}
		}
		//--> soma to handle DTS in checkout // 1 line
		checkOut.getRewardsAndCouponsSection().checkOutWithDTS(TestBaseProvider.getTestBase().getTestData());
		
		PauseUtil.pause(2500);
		checkOut.getRewardsAndCouponsSection().enterTossInNumberOfStudent(TestBaseProvider.getTestBase().getTestData());
		
		System.out.println(" rewardsAndCoupons.getBtnContinueCheckout() ==========> "
				+ SCHUtils.isPresent(rewardsAndCoupons.getBtnContinueCheckout()));
		SCHUtils.scrollToView(rewardsAndCoupons.getBtnContinueCheckout());
		// SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
		SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
		// rewardsAndCoupons.getBtnContinueCheckout().click();
		PauseUtil.pause(1000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		
		}
	
	
	
	
	@And("^teacher navigate to payment page$")
    public void teacher_navigate_to_payment_page() throws Throwable {
        
        ICartPage cartPage = getFactory().getICartPage();
        CartPage crtpge = new CartPage();
		//cartPage.clickProceedToCheckoutBtn();
        PauseUtil.pause(2500);
		/*SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		SCHUtils.waitForLoaderToDismiss();
		if (SCHUtils.isPresent(crtpge.getbtntopBonuspointModelProceedToCheckout())) {
			SCHUtils.clickUsingJavaScript(crtpge.getbtntopBonuspointModelProceedToCheckout());
			PauseUtil.pause(1000);
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete();
		}*/
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		ICheckoutPage checkOut = getFactory().getICheckoutPage();
		PauseUtil.pause(2000);
		for(int i=0;i<=3;i++){
			if(rewardsAndCoupons.chkBtnSkip().size()!=0)
			{
		
			System.out.println(" rewardsAndCoupons.getBtnSkip() ==========> "
					+ SCHUtils.isPresent(rewardsAndCoupons.getBtnSkip()));
			SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnSkip());
			PauseUtil.waitForAjaxToComplete();
		}
		}
		//--> soma to handle DTS in checkout // 1 line
		checkOut.getRewardsAndCouponsSection().checkOutWithDTS(TestBaseProvider.getTestBase().getTestData());
		
		
		PauseUtil.pause(2500);
		checkOut.getRewardsAndCouponsSection().enterTossInNumberOfStudent(TestBaseProvider.getTestBase().getTestData());
		
		System.out.println(" rewardsAndCoupons.getBtnContinueCheckout() ==========> "
				+ SCHUtils.isPresent(rewardsAndCoupons.getBtnContinueCheckout()));
		SCHUtils.scrollToView(rewardsAndCoupons.getBtnContinueCheckout());
		// SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
		SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
		// rewardsAndCoupons.getBtnContinueCheckout().click();
		PauseUtil.pause(1000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
        
		
		}
	
	
	@And("^teacher selects credit card as payment$")
    public void teacher_selects_credit_card_as_payment() throws Throwable {
        
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
	
	
	
	@When("^teacher selects credit card as payment and try to look for expired card$")
    public void teacher_selects_credit_card_as_payment_and_try_to_look_for_expired_card() throws Throwable {
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
		PauseUtil.pause(3000);
    }
	
	
	
	@When("^teacher selects combination of credit card and checks as payment and try to look for expired card$")
    public void teacher_selects_combination_of_credit_card_and_checks_as_payment_and_try_to_look_for_expired_card() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CCANDCHECKPAYMENTMETHOD);
		PauseUtil.pause(3000);
		
    }
	
	
	
	@Then("^no credit card is seen in the list$")
    public void no_credit_card_is_seen_in_the_list() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
         
        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
				ConstantUtils.ADDNEWCARD);
        
        Select sel = new Select(shippingAndPaymentPage.drpSelectaCard());
        List<WebElement> size = sel.getOptions();
        int creditcrdsize = size.size();
        System.out.println("size is:::::::::::::::" +creditcrdsize);
        if(creditcrdsize>2){
        Assert.fail("Expired credit card is seen under credcard drop down list");	
        }
    }
	
	
	@And("^teacher selects checks as payment$")
    public void teacher_selects_checks_as_payment() throws Throwable {
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
	
	
	
	@And("^teacher selects combination of credit card and cheques as payment$")
    public void teacher_selects_combination_of_credit_card_and_cheques_as_payment() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CCANDCHECKPAYMENTMETHOD);
		PauseUtil.pause(3000);
		
		
    }
	
	@And("^teacher selects cheques as payment$")
    public void teacher_selects_cheques_as_payment() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CHECKPAYMENTMETHOD);
		PauseUtil.pause(5000);
		
		
    }
	
	@And("^Teacher navigates to Confirm and Submit page$")
    public void teacher_navigates_to_confirm_and_submit_page() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CHECKPAYMENTMETHOD);
		PauseUtil.pause(5000);
		
		WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
		SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		
    }
	
	
	@When("^teacher selects saved credit card and valid information in all other fields$")
    public void teacher_selects_saved_credit_card_and_valid_information_in_all_other_fields() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();

		WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
		PauseUtil.pause(3000);
		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
				TestBaseProvider.getTestBase().getTestData().getString("cctype"));
		PauseUtil.pause(3000);
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.fillCCAndCheckAmount_PaymentPage();
		
    }
	
	
	@When("^teacher enters \\[credit card info\\]$")
    public void teacher_enters_credit_card_info() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.addNewCreditCard(TestBaseProvider.getTestBase().getTestData());
        
        
    }
	
	
	@And("^teacher clicks on \"([^\"]*)\"$")
    public void teacher_clicks_on_something(String strArg1) throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
        
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
		SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
    }
	
	@Then("^Continue Checkout button should be disabled$")
    public void continue_checkout_button_should_be_disabled() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		ConfirmAndSubmitOrder confirmAndSubmitOrderPage =
				getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
		
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		AssertUtils.assertNotPresent((ExtendedElement) confirmAndSubmitOrderPage.getBtnSubmitOrder());
		
	   // AssertUtils.assertDisabled(shippingAndPaymentPage.getBtnContinueCheckout());
  
    }
	
	
	@Then("^Continue Checkout button should be enabled$")
    public void continue_checkout_button_should_be_enabled() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		ConfirmAndSubmitOrder confirmAndSubmitOrderPage =
				getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
		
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		AssertUtils.assertPresent((ExtendedElement) confirmAndSubmitOrderPage.getBtnSubmitOrder());
    }
	
	
	@And("^Continue checkout button is deactivated$")
    public void continue_checkout_button_is_deactivated() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		ConfirmAndSubmitOrder confirmAndSubmitOrderPage =
				getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
		
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		AssertUtils.assertNotPresent((ExtendedElement) confirmAndSubmitOrderPage.getBtnSubmitOrder());
    }
	
	
	
	@Then("^teacher lands on Confirm and Submit page$")
    public void teacher_lands_on_confirm_and_submit_page() throws Throwable {

		ConfirmAndSubmitOrder confirmAndSubmitOrderPage =
				getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		AssertUtils.assertPresent((ExtendedElement) confirmAndSubmitOrderPage.getBtnSubmitOrder());
    }
	
	
	
	@When("^teacher click on Continue Checkout without making selections from Dollars to Spend promotion$")
    public void teacher_click_on_continue_checkout_without_making_selections_from_dollars_to_spend_promotion() throws Throwable {
		ICartPage cartPage = getFactory().getICartPage();
		
		CheckoutPage chk = new CheckoutPage();
		CartPage crtpge = new CartPage();
		//cartPage.clickProceedToCheckoutBtn();
		PauseUtil.pause(2500);
		/*SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		SCHUtils.waitForLoaderToDismiss();
		if (SCHUtils.isPresent(crtpge.getbtntopBonuspointModelProceedToCheckout())) {
			SCHUtils.clickUsingJavaScript(crtpge.getbtntopBonuspointModelProceedToCheckout());
			PauseUtil.pause(1000);
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete();
		}*/
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		ICheckoutPage checkOut = getFactory().getICheckoutPage();
		PauseUtil.pause(2000);
		
		for(int i=0;i<=3;i++){
			if(rewardsAndCoupons.chkBtnSkip().size()!=0)
			{
		
			System.out.println(" rewardsAndCoupons.getBtnSkip() ==========> "
					+ SCHUtils.isPresent(rewardsAndCoupons.getBtnSkip()));
			SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnSkip());
			PauseUtil.waitForAjaxToComplete();
		}
		}
		
		AssertUtils.assertDisplayed(chk.getbtnMakeSelectionFpf());
		
		PauseUtil.pause(2500);
		checkOut.getRewardsAndCouponsSection().enterTossInNumberOfStudent(TestBaseProvider.getTestBase().getTestData());
		
		System.out.println(" rewardsAndCoupons.getBtnContinueCheckout() ==========> "
				+ SCHUtils.isPresent(rewardsAndCoupons.getBtnContinueCheckout()));
		SCHUtils.scrollToView(rewardsAndCoupons.getBtnContinueCheckout());
		// SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
		SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
		// rewardsAndCoupons.getBtnContinueCheckout().click();
		PauseUtil.pause(1000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
    }
	
	
	@Then("^page refreshes and error message “To proceed with checkout, please select at least one item to redeem your Dollars To Spend\\.” displays$")
    public void page_refreshes_and_error_message_to_proceed_with_checkout_please_select_at_least_one_item_to_redeem_your_dollars_to_spend_displays() throws Throwable {
		
		
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(5000);
		rewardsAndCoupons.verifyErrorMsgForSkippingDTS(
				TestBaseProvider.getTestBase().getTestData());
	
		
    }
	
	
	
	@Then("^page is refreshed and error message “To proceed with checkout, please select an item to redeem your Free Book Pick by clicking on the coupon code\\.” should display$")
    public void page_is_refreshed_and_error_message_to_proceed_with_checkout_please_select_an_item_to_redeem_your_free_book_pick_by_clicking_on_the_coupon_code_should_display() throws Throwable {
		
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(5000);
		rewardsAndCoupons.verifyErrorMsgForSkippingFreePick(
				TestBaseProvider.getTestBase().getTestData());
	}
	
	
	
	@Then("^teacher lands on confirm & submit page$")
    public void teacher_lands_on_confirm_submit_page() throws Throwable {
        
        
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verifyOrderConfirmationPage();
    }
	
	
	@Then("^teacher views Amount paid by Credit card and Amount paid by Cheques correctly$")
    public void teacher_views_amount_paid_by_credit_card_and_amount_paid_by_cheques_correctly() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		
		checkoutPage.verifyCheque_CreditPayement_ConfirmationPage();
    }
	
	
	
	
	
	@And("^teacher views Amount paid by Credit Card and Amount paid by Cheques correctly in ConfirmationPage$")
    public void teacher_views_amount_paid_by_credit_card_and_amount_paid_by_cheques_correctly_in_confirmationpage() throws Throwable {
    
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.verifyCheque_CreditPayement_SubmittedPage();    
    }
	

	@Then("^user should see all functionalities of SFO section on cart page$")
	public void user_should_see_all_functionalities_of_SFO_section_on_cart_page()
			throws Throwable {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.getStudentFlyerOrdersCartSection().verifySFOFunctionalities();
	}

	@When("^user selects review cart from teacher cart page$")
	public void user_selects_review_cart_from_teacher_cart_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user should see \\[OrderSummary\\] from teacher cart page$")
	public void user_should_see_OrderSummary_from_teacher_cart_page() throws Throwable {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.getProductOrderSummarySection()
				.verifyOrderSummary(TestBaseProvider.getTestBase().getTestData());
	}
	@When("^user adds \\[SFOInformation\\] on order and review page$")
	public void user_adds_SFOInformation_on_order_and_review_page() throws Throwable {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.clickStudentFlyerOrderAddBtn();
	}

	@Then("^user should see SFO page$")
	public void user_should_see_SFO_page() throws Throwable {
		IStudentFlyerOrdersPage flyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		flyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
	}

	@When("^user edits \\[SFOItemInformation\\] on SFO page$")
	public void user_edits_ItemInformation_on_order_and_review_page() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder(
				TestBaseProvider.getTestBase().getTestData().getString("editstudentname"),
				TestBaseProvider.getTestBase().getTestData().getString("edititemid"));

	}

	@When("^user selects review SFO order$")
	public void user_selects_review_SFO_order() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user adds order by providing \\[OrderInformation\\]$")
	public void user_adds_order_by_providing_OrderInformation() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user logs out from application$")
	public void user_logs_out_from_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user selects mini cart$")
	public void user_selects_mini_cart() throws Throwable {

		IHeaderSection headerSection = SectionFactory.getFactory()
				.getIHeaderSection(LocatorUtils.getBy("dw.header.section"));
		headerSection.clickMiniCartIcon();
	}

	@Then("^user verifies book for trust section with checkbox and dropdown and other functionalities$")
	public void user_verifies_book_for_trust_section_with_checkbox_and_dropdown_and_other_functionalities()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^user removes \\[ItemInformation\\] from item list on enter orders page with \\[ConfirmationStatus\\]$")
	public void user_removes_ItemInformation_from_item_list_on_enter_orders_page_with_ConfirmationStatus()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user should see \\[ItemInformation\\] on review SFO Page$")
	public void user_should_see_ItemInformation_on_review_SFO_Page() {
		IReviewOrderPage iReviewOrderPage = getFactory().getIReviewOrderPage();

		iReviewOrderPage.verifyItemIsAddedOnReviewOrderSFO(
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemid"));
	}

	@Then("^user should see error msgs for adding wrong \\[ItemInformation\\] on SFO page$")
	public void user_should_see_error_msgs_for_adding_wrong_ItemInformation_on_SFO_page() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.enterAndVerifyWrongItemErrorMessages(
				TestBaseProvider.getTestBase().getTestData());
	}

	@Then("^user should see \\[ItemInformation\\] in ascending order on review SFO page$")
	public void user_should_see_ItemInformation_in_ascending_order_on_review_SFO_page() {
		IReviewOrderPage reviewOrderPage = getFactory().getIReviewOrderPage();
		reviewOrderPage.verifyStudentNamesAscOrder();
	}

	@Given("^user should see \\[ItemInformation\\] at student level on review SFO page$")
	public void user_should_see_ItemInformation_at_student_level_on_review_SFO_page() {
		IReviewOrderPage reviewOrderPage = getFactory().getIReviewOrderPage();
		reviewOrderPage.verifyStudentLevelOnReviewSFO();
	}

	@When("^user removes \\[ItemInformation\\] from item list from SFO page$")
	public void user_removes_ItemInformation_from_item_list_from_SFO_page() {
		IReviewOrderPage iReviewOrderPage = getFactory().getIReviewOrderPage();
		iReviewOrderPage.removeItemsFromReviewOrderPage(
				TestBaseProvider.getTestBase().getTestData());

	}
	@Then("^user check delete option disapper after few seconds$")
	public void user_check_delete_option_disapper_after_few_seconds() {
		IReviewOrderPage iReviewOrderPage = getFactory().getIReviewOrderPage();
		iReviewOrderPage.verifyDeleteOptionDisappearOnNoActionOnReviewOrder(
				TestBaseProvider.getTestBase().getTestData());

	}

	@Then("^user should see update \\[ItemInformation\\] on review order page$")
	public void user_should_see_update_ItemInformation_on_review_order_page() {
		IReviewOrderPage iReviewOrderPage = getFactory().getIReviewOrderPage();
		iReviewOrderPage.verifyUpdatedRecordsAfterRemovalOnReviewOrder(
				TestBaseProvider.getTestBase().getTestData());
	}
	@Then("^user should see empty cart on review cart page$")
	public void user_should_see_empty_cart_on_review_cart_page() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.verifyEmptyCartPage();
	}

	@When("^user wants to redeem coupon on review cart page$")
	public void user_wants_to_redeem_coupon_on_review_cart_page() throws Throwable {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.clickOnRedeemCoupon();
	}

	@Then("^user should see \\[ItemInformation\\] on cart page$")
	public void user_should_see_ItemInformation_on_cart_page() {

		ICartPage cartPage = getFactory().getICartPage();
		cartPage.verifyCartItems();

	}

	@Then("^user selects child for respective items on review cart page$")
	public void user_selects_child_for_respective_items_on_review_cart_page() {

		ReviewOrdersPage reviewPage = new ReviewOrdersPage();
		PauseUtil.pause(6000);
		PauseUtil.waitForAjaxToComplete(6000);
		SCHUtils.waitForLoaderToDismiss();
		HashMap<String, ProductInfoBean> POOItems = SCHUtils.getPOProductItems();
		for (String key : POOItems.keySet()) {
			ProductInfoBean productInfoBean = POOItems.get(key);
			System.out.println("Keyssssssss........" + key);
			System.out.println("Product Info Bean....." + productInfoBean);
			System.out.println("Item Number......" + productInfoBean.getItemNumber());
			System.out.println("child name....." + productInfoBean.getStudentName());
			SCHUtils.selectOptionByVisibleText(
					reviewPage.getPOAddChildDropDown(productInfoBean.getItemNumber()),
					productInfoBean.getStudentName());
			PauseUtil.pause(300);
		}
		PauseUtil.pause(1000);
	}

	@Then("^user should see updated \\[ItemInformation\\] quantity on cart page$")
	public void user_should_see_updated_ItemInformation_quantity_on_cart_page() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.verifyCartItemQuantity();
	}

	@Given("^user removes all items from cart$")
	public void user_removes_all_items_from_cart() {
		PauseUtil.pause(1500);
		//SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		
		IHeaderSection headerSection = SectionFactory.getFactory()
				.getIHeaderSection(LocatorUtils.getBy("dw.header.section"));
		if (headerSection.getCartQuantity() != 0) {
			headerSection.clickMiniCartIcon();
			if (TestBaseProvider.getTestBase().getTestData().getString("module") != null
					&& TestBaseProvider.getTestBase().getTestData().getString("module")
							.equalsIgnoreCase("parent")) {
				ReviewOrdersPage reviewOrdersPage = new ReviewOrdersPage();
				reviewOrdersPage.removeAllItemFromParentCart();
			} else {
				ICartPage cartPage = getFactory().getICartPage();
				cartPage.removeAllItems();
			}
			headerSection.clickOnHomeIcon();
		}
	}
	@Then("^user verifies total quantity and amount for all items on cart page$")
	public void user_verifies_total_quantity_and_amount_for_all_items_on_cart_page() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.verifyCartTotalAmountAndQuantity();
	}

	@Then("^user should see order total with book trust amount on parent cart page$")
	public void user_should_see_order_total_with_book_trust_amount_on_parent_cart_page() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.verifyCartTotalOnParentCart();
	}

	@When("^user selects return to shop$")
	public void user_selects_return_to_shop() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.clickReturnToShopBtn();
	}

	@Then("^user should see books and resources catalog$")
	public void user_should_see_books_and_resources_catalog() {
		IBooksAndResourcesPage booksAndResourcesPage =
				getFactory().getIBooksAndResourcesPage();
		booksAndResourcesPage.verifyBookAndResourcePage();
	}

	@When("^teacher proceed to checkout from review cart page$")
	public void proceed_to_checkout_from_review_cart_page() {
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

	}
	
	

	@When("^teacher navigates to coupons & Rewards page$")
    public void teacher_navigates_to_coupons_rewards_page() throws Throwable {
		ICartPage cartPage = getFactory().getICartPage();
		CartPage crtpge = new CartPage();
		cartPage.clickProceedToCheckoutBtn();
		PauseUtil.pause(2500);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		SCHUtils.waitForLoaderToDismiss();
		if (SCHUtils.isPresent(crtpge.getbtntopBonuspointModelProceedToCheckout())) {
			//SCHUtils.clickUsingJavaScript(crtpge.getbtntopBonuspointModelProceedToCheckout());
            crtpge.getbtntopBonuspointModelProceedToCheckout().click();
			PauseUtil.pause(1000);
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete();
		}
    }
	
	@And("^teacher adds YTO items with unique item id number to cart with \\[minumum amount\\]$")
    public void teacher_adds_yto_items_with_unique_item_id_number_to_cart_with_minumum_amount() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_adds_YTO_item_for_Free_Shipping();
    }
	
	
	@When("^teacher applies \\[Bonus percentage coupon\\]$")
    public void teacher_applies_bonus_percentage_coupon() throws Throwable {
		
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.addBonusBankCoupon();
		PauseUtil.pause(3000);
    }
	
	public void Wait_for_invisibility_of_locator() {
		
		WebDriver driver=TestBaseProvider.getTestBase().getDriver();
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loader-indicator']")));
		//WaitUtils.waitForNotDisplayed(Loader_invisibilty());
	}
	
	@And("^teacher applies \\[Non\\-Stackable coupon\\]$")
    public void teacher_applies_nonstackable_coupon() throws Throwable {
		PauseUtil.waitForAjaxToComplete(2500);
		Wait_for_invisibility_of_locator();
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();

		String coupons[] = SCHUtils.getArrayFromStringData(
				TestBaseProvider.getTestBase().getTestData().getString("nonstackablecoupon"));
		for (String coupon : coupons) {
			rewardsAndCoupons.enterCoupon(coupon);
			
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);		
		}
		
		//--> soma to handle Freepick for non stackable coupon // 2 lines
		/*ICheckoutPage checkOut = getFactory().getICheckoutPage();
		checkOut.getRewardsAndCouponsSection().HandleFreePickforNonStackable(TestBaseProvider.getTestBase().getTestData());*/
		
		
    }
	
	
	
	@When("^teacher tries to apply another \\[non\\-stackable coupon\\]$")
    public void teacher_tries_to_apply_another_nonstackable_coupon() throws Throwable {
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();

		String coupons[] = SCHUtils.getArrayFromStringData(
				TestBaseProvider.getTestBase().getTestData().getString("nonstackablecoupon1"));
		for (String coupon : coupons) {
			rewardsAndCoupons.enterCoupon2(coupon);

		}
    }
	
	
	
	@When("^teacher tries to apply \\[Non\\-Stackable coupon\\]$")
    public void teacher_tries_to_apply_nonstackable_coupon() throws Throwable {
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();

		String coupons[] = SCHUtils.getArrayFromStringData(
				TestBaseProvider.getTestBase().getTestData().getString("nonstackablecoupon"));
		for (String coupon : coupons) {
			rewardsAndCoupons.enterCoupon2(coupon);

		}
    }
	
	
	
	@When("^teacher tries to apply \\[stackable coupon\\]$")
    public void teacher_tries_to_apply_stackable_coupon() throws Throwable {
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();

		String coupons[] = SCHUtils.getArrayFromStringData(
				TestBaseProvider.getTestBase().getTestData().getString("stackablecoupon"));
		for (String coupon : coupons) {
			rewardsAndCoupons.enterCoupon2(coupon);

		}
    }
	
	
	
	@And("^teacher applies \\[stackable coupon\\]$")
    public void teacher_applies_stackable_coupon() throws Throwable {
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();

		String coupons[] = SCHUtils.getArrayFromStringData(
				TestBaseProvider.getTestBase().getTestData().getString("stackablecoupon"));
		for (String coupon : coupons) {
			rewardsAndCoupons.enterCoupon(coupon);

		}
		
		/*//--> soma to handle Freepick for non stackable coupon // 2 lines
				ICheckoutPage checkOut = getFactory().getICheckoutPage();
				checkOut.getRewardsAndCouponsSection().HandleFreePickforNonStackable(TestBaseProvider.getTestBase().getTestData());*/
				
		
    }
	
	

    

    @Then("^teacher should be able to apply another \\[stackable coupon\\] successfully$")
    public void teacher_should_be_able_to_apply_another_stackable_coupon_successfully() throws Throwable {
    	RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();

		String coupons[] = SCHUtils.getArrayFromStringData(
				TestBaseProvider.getTestBase().getTestData().getString("stackablecoupon1"));
		for (String coupon : coupons) {
			rewardsAndCoupons.enterCoupon(coupon);

		}
		rewardsAndCoupons.verifySuccessStackableAndStackableCoupon(
				TestBaseProvider.getTestBase().getTestData());
    }

	
	
	
	@Then("^error message \"([^\"]*)\" displays$")
    public void error_message_something_displays(List<String> list1) throws Throwable {
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		rewardsAndCoupons.verifyErrorMsgForStackableNonStackableCoupon(
				TestBaseProvider.getTestBase().getTestData());
    }



    @Then("^error message \"([^\"]*)\" display$")
    public void error_message_something_display(List<String> list1) throws Throwable {
    	RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		rewardsAndCoupons.verifyErrorMsgForNonStackableStackableCoupon(
				TestBaseProvider.getTestBase().getTestData());
    }
	
	
	@And("^teacher navigates back to coupons & Rewards page from confirm & submit page$")
    public void teacher_navigates_back_to_coupons_rewards_page_from_confirm_submit_page() throws Throwable {
		IConfirmAndSubmitOrder confirmsubmitpage = getFactory().getICheckoutPage().getConfirmAndSubmitOrder();
		
		confirmsubmitpage.navigateToCouponsRewardsPageFromConfirmSubmitPage();
	}
	
	
	@And("^teacher navigates to Review Your cart page from Coupons & Rewards page$")
    public void teacher_navigates_to_review_your_cart_page_from_coupons_rewards_page() throws Throwable {
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		
		StudentFlyerOrdersPage studentFlyerOrdersPage= new StudentFlyerOrdersPage();
		TeachersHomePage techhomepage = new TeachersHomePage();
		
		SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getLnkBackToShop());
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.pause(2500);
		 if(techhomepage.chkDontShowThisAgainClassRoomOrders_Button().size()!=0){
	        	SCHUtils.clickUsingJavaScript(techhomepage.getDontShowThisAgainClassRoomOrders_Button());
	        	PauseUtil.pause(3000);
	        }
		 PauseUtil.waitForAjaxToComplete(1500);
		 if(techhomepage.chkTutorial_DontShowAgain_Link().size()!=0){
	        	SCHUtils.clickUsingJavaScript(techhomepage.getTutorial_DontShowAgain_Link());
	        	PauseUtil.pause(3000);
	        }
            System.out.println("before review cart button");

            PauseUtil.waitForAjaxToComplete(3000);
            PauseUtil.pause(7000);
            Wait_for_invisibility_of_locator();

        /* SCHUtils.waitForLoaderToDismiss();
		 PauseUtil.waitForAjaxToComplete(3500);
		 PauseUtil.pause(7500);
         Wait_for_invisibility_of_locator();*/
		
		//WaitUtils.waitForDisplayed(studentFlyerOrdersPage.getLblTitle());
		SCHUtils.waitForElementToBeClickable(studentFlyerOrdersPage.getBtnReviewCart(), 30);
        System.out.println("start to click ");
        //SCHUtils.clickUsingJavaScript(studentFlyerOrdersPage.getBtnReviewCart());
        studentFlyerOrdersPage.getBtnReviewCart().click();
        System.out.println("hi I clicked");

		 /*SCHUtils.waitForLoaderToDismiss();
		 PauseUtil.waitForAjaxToComplete(3500);
		 PauseUtil.pause(2500);*/

        PauseUtil.waitForAjaxToComplete(3000);
        PauseUtil.pause(7000);
        Wait_for_invisibility_of_locator();


        SCHUtils.waitForElementToBeClickable(getBtnProceedToCheckout(), 30);
    }
	

	@When("^teacher applies Bonus Flat coupon$")
    public void teacher_applies_Bonus_Flat_coupon() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.apply_a_coupon_Rewards_page();
    	/*
		ICouponsandRewards couponsandrewards = getFactory().getICouponandRewardsPage();
		couponsandrewards.enterCouponCode();
		PauseUtil.pause(1000);
		couponsandrewards.clickonCouponCodeApplyButton();
		PauseUtil.pause(2000);*/
    }
	
	@When("^teacher deletes items from cart making cart non-qualifying$")
    public void teacher_deletes_items_From_cart_making_cart_non_qualifying() throws Throwable {
		ICartPage cartPage = getFactory().getICartPage();
		CartPage crtpge = new CartPage();
		cartPage.clickReturnToShopBtn();
		PauseUtil.pause(2000);
		cartPage.waitForRemoveCircle();
		cartPage.clickOnReviewCartButton();
		cartPage.clickOnRemoveCircle();
		PauseUtil.pause(2000);
		cartPage.clickOnYesButton();
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

    }

	
	@When("^Teacher makes redemeptions from student paper coupon such that cart total is now below \\[minimum amount\\]$")
    public void teacher_makes_redemptions_from_student_paper_coupon_cart_total_below_minamount() throws Throwable {
		ICheckoutPage checkOut = getFactory().getICheckoutPage();
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		
		
		while (SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon())) {
			System.out.println(" rewardsAndCoupons.getBtnEditCoupon() ==========> "
					+ SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon()));
			SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnEditCoupon());
			WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnApplyCoupon());
			
		}
		
		 

	   checkOut.getRewardsAndCouponsSection().enterPaperCoupon(TestBaseProvider.getTestBase().getTestData(), "paperbonuscoupon");
//need to check this if required
	   //checkOut.getRewardsAndCouponsSection().enterPaperCoupon(TestBaseProvider.getTestBase().getTestData());

		PauseUtil.pause(1500);
		while (SCHUtils.isPresent(rewardsAndCoupons.getBtnApplyCoupon())) {
			System.out.println(" rewardsAndCoupons.getBtnApplyCoupon() ==========> "
					+ SCHUtils.isPresent(rewardsAndCoupons.getBtnApplyCoupon()));
			SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnApplyCoupon());
			WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnEditCoupon());
			PauseUtil.pause(1000);
			//SCHUtils.waitForLoaderToDismiss();
			//PauseUtil.waitForAjaxToComplete();
   }
   }
	
	@When("^Teacher makes redemeptions from student bonus coupon such that cart total is now below \\[minimum amount\\]$")
    public void teacher_makes_redemptions_from_student_bonus_coupon_cart_total_below_minamount() throws Throwable {
		ICheckoutPage checkOut = getFactory().getICheckoutPage();
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		
		
		while (SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon())) {
			System.out.println(" rewardsAndCoupons.getBtnEditCoupon() ==========> "
					+ SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon()));
			SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnEditCoupon());
			WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnApplyCoupon());
			
		}
		
		 
	   checkOut.getRewardsAndCouponsSection().enterBonusCoupon(TestBaseProvider.getTestBase().getTestData());
		PauseUtil.pause(1500);
		while (SCHUtils.isPresent(rewardsAndCoupons.getBtnApplyCoupon())) {
			System.out.println(" rewardsAndCoupons.getBtnApplyCoupon() ==========> "
					+ SCHUtils.isPresent(rewardsAndCoupons.getBtnApplyCoupon()));
			SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnApplyCoupon());
			WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnEditCoupon());
			PauseUtil.pause(1000);
			//SCHUtils.waitForLoaderToDismiss();
			//PauseUtil.waitForAjaxToComplete();
   }
   }
	
	@When("^Teacher makes redemeptions from teacher bonus coupon such that cart total is now below \\[minimum amount\\]$")
    public void teacher_makes_redemptions_from_teacher_bonus_coupon_cart_total_below_minamount() throws Throwable {
		ICheckoutPage checkOut = getFactory().getICheckoutPage();
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		
		
		while (SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon())) {
			System.out.println(" rewardsAndCoupons.getBtnEditCoupon() ==========> "
					+ SCHUtils.isPresent(rewardsAndCoupons.getBtnEditCoupon()));
			SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnEditCoupon());
			WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnApplyCoupon());
			
		}
		
		 
	   checkOut.getRewardsAndCouponsSection().enterTeacherBonusCoupon(TestBaseProvider.getTestBase().getTestData());
		PauseUtil.pause(1500);
		while (SCHUtils.isPresent(rewardsAndCoupons.getBtnApplyCoupon())) {
			System.out.println(" rewardsAndCoupons.getBtnApplyCoupon() ==========> "
					+ SCHUtils.isPresent(rewardsAndCoupons.getBtnApplyCoupon()));
			SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnApplyCoupon());
			WaitUtils.waitForEnabled(rewardsAndCoupons.getBtnEditCoupon());
			PauseUtil.pause(1000);
			//SCHUtils.waitForLoaderToDismiss();
			//PauseUtil.waitForAjaxToComplete();
   }
   }

 
	@When("^Teacher enters the bonus bank coupons$")
    public void teacher_enters_the_bonus_bank_coupon() throws Throwable {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.addBonusBankCoupon();
		//cartPage.clickProceedToCheckoutBtn();
		
		PauseUtil.pause(3000);
    }
	
	@When("^Teacher should not see Free item promotion is displayed$")
    public void teacher_should_not_see_free_item_promotion_is_displayed() throws Throwable {
		ICartPage cartPage = getFactory().getICartPage();
		
		cartPage.verify_FreeItem_promotions_not_display();
		
		
    }
	
	
	@Then("^Teacher should not receive Free Teacher Kit promotion$")
    public void teacher_should_not_receive_free_teacher_kit_promotion() throws Throwable {
     ICartPage cartPage = getFactory().getICartPage();
	 cartPage.verifyFreePromotionShouldNotDisplay();
    }
	
	
	/*@When("^Teacher should not see Free item promotion is displayed$")
    public void teacher_should_not_see_Free_item_promotion_is_displayed() throws Throwable {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.clickProceedToCheckoutBtn();
		PauseUtil.pause(5000);
    }*/


	@Then("^user should see checkout page$")
	public void user_should_see_checkout_page() {
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		WaitUtils.waitForDisplayed(rewardsAndCoupons.getTxtCouponeCode());
		AssertUtils.assertDisplayed(rewardsAndCoupons.getLblCoupons());
		AssertUtils.assertDisplayed(rewardsAndCoupons.getLblRewards());

	}

	@Then("^user should see no item to review message on cart page$")
	public void user_should_see_no_item_to_review_message_on_cart_page() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.verifyNoItemToReviewMessages();
	}

	@When("^user selects enter order from cart page$")
	public void user_selects_enter_order_from_cart_page() throws Throwable {
		IHeaderSection headerSection = SectionFactory.getFactory()
				.getIHeaderSection(LocatorUtils.getBy("dw.header.section"));
		headerSection.clickOnHomeIcon();
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.selectOptionFromTeacherHomePage(ConstantUtils.ENTERORDER);
	}

	@When("^user updates the item quantity from review SFO page$")
	public void user_updates_the_item_quantity_from_review_SFO_page() throws Throwable {
		IReviewOrderPage reviewOrderPage = getFactory().getIReviewOrderPage();
		reviewOrderPage.editProductQuantityOnOrderTable(
				TestBaseProvider.getTestBase().getTestData());
	}

	@Then("^user should see SOO page with orders$")
	public void user_should_see_SOO_page() {
		IStudentOnlineOrdersPage onlineOrdersPage =
				getFactory().getIStudentOnlineOrdersPage();
		onlineOrdersPage.verifySOOOrders();
	}

	@When("^user removes \\[SOOItemInformation\\] from item list from cart page with \"([^\"]*)\"$")
	public void user_removes_SOOItemInformation_from_item_list_from_cart_page_with(
			String confirmationStatus) {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.getStudentOnlineOrdersCartSection().removeSOOItemsFromStudentTable(
				TestBaseProvider.getTestBase().getTestData(), confirmationStatus);
	}

	@Then("^user should not see removed SOO item on cart page$")
	public void user_should_not_see_removed_SOO_item_on_cart_page() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.getStudentOnlineOrdersCartSection().verifyUpdatedRecordsAfterRemoval(
				TestBaseProvider.getTestBase().getTestData());
	}

	@When("^user selects any YTO item on cart page$")
	public void user_selects_any_YTO_item_on_cart_page() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.getYourTeacherOrdersCartSection()
				.clickOnYTOItem(TestBaseProvider.getTestBase().getTestData());
	}

	@When("^user adds \\[YTOInformation\\] on order and review page$")
	public void user_adds_YTOInformation_on_order_and_review_page() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.clickYourTeacherOrderAddBtn();
	}

	@Then("^user should see all functionalities of YTO section on cart page$")
	public void user_should_see_all_functionalities_of_YTO_section_on_cart_page() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.getYourTeacherOrdersCartSection().verifyYTOFunctionalities();
	}

	@Then("^user should see all functionalities of SOO section on cart page$")
	public void user_should_see_all_functionalities_of_SOO_section_on_cart_age() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.getStudentOnlineOrdersCartSection().verifySOOFunctionalities();
	}

	@When("^user selects any SOO item on cart page$")
	public void user_selects_any_SOO_item_on_cart_page() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.getStudentOnlineOrdersCartSection().clickOnAnySOOItem();
	}

	@Then("^user should see \\[SOOItemInformation\\] on cart page$")
	public void user_should_see_SOOItemInformation_on_cart_page() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.getStudentOnlineOrdersCartSection().verifyExpandedInfo();
	}

	@When("^user updates SFO item quantity on cart page$")
	public void user_updates_SFO_item_quantity_on_cart_page() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.getStudentFlyerOrdersCartSection()
				.updateQuantity(TestBaseProvider.getTestBase().getTestData());
	}

	@When("^user should see toss-in get displayed$")
	public void user_should_see_auto_tossin_get_displayed() {
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		rewardsAndCoupons.verifyTossIn();
	}

	@When("^user add number of student in toss-in$")
	public void user_add_number_of_student_in_toss_in() {

		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		if (SCHUtils.isPresent(rewardsAndCoupons.getTxtNoOfStudents())) {
			rewardsAndCoupons.getTxtNoOfStudents().clear();
			if (TestBaseProvider.getTestBase().getTestData()
					.getString("noofstudents") != null) {
				rewardsAndCoupons.getTxtNoOfStudents().sendKeys(TestBaseProvider
						.getTestBase().getTestData().getString("noofstudents"));
			} else {
				rewardsAndCoupons.getTxtNoOfStudents().sendKeys("2");
			}
		}
		rewardsAndCoupons.getBtnContinueCheckout().click();

	}

	@When("^user verify number of student displayed in Q&A toss in with no of students from SFO and SOO$")
	public void user_verify_number_of_student_displayed_in_QA_toss_in_with_no_of_students_from_SFO_and_SOO() {

		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		System.out.println(SCHUtils.getSOOOrderCount() + SCHUtils.getSFOOrderTotal());
		rewardsAndCoupons.verifyStudentCountInQATossinDisplayes();

	}

	@Then("^user should see \\[UpdatedReviewCartInformation\\] on parent Review Cart page$")
	public void user_should_see_UpdatedReviewCartInformation_on_parent_Review_Cart_page() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.verifyParentCart();
	}
	@When("^user removes \\[SFOItemInformation\\] from item list from cart page with \"([^\"]*)\"$")
	public void user_removes_SFOItemInformation_from_item_list_from_cart_page_with(
			String confirmationStatus) {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.removeSFOItem(TestBaseProvider.getTestBase().getTestData(),
				confirmationStatus);

	}

	@Then("^user should not see removed SFO item on cart page$")
	public void user_should_not_see_removed_SFO_item_on_cart_page() {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyUpdatedRecordsAfterRemoval(
				TestBaseProvider.getTestBase().getTestData());
	}
	@Then("^user select redeem coupon link$")
	public void user_select_redeem_coupon_link() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.clickOnRedeemCouponLink();
	}

	@Then("^user should see promotional modal display on parent Review Cart page$")
	public void user_should_see_promotional_modal_ispresent() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.verifyeBonusPointModelProceedToCheckOut();
	}

	@When("^user proceeds to checkout from review cart page and verifies promotion modal$")
	public void user_proceeds_to_checkout_from_review_cart_page_and_verifies_promotion_modal() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.verifyPromotionalModal();

	}

	@Then("^user should see book for trust section with all functionalities$")
	public void user_should_see_book_for_trust_section_with_all_functionalities() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.verifyeBookForTrustSection();
	}

	@When("^user donates \"([^\"]*)\" on teacher cart page$")
	public void user_donates_Amount_on_teacher_cart_page(String amount) throws Throwable {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.selectAmountToDonateOnTeacherCart(
				TestBaseProvider.getTestBase().getTestData(), amount);
	}

	@Then("^user should see \\[CouponInformation\\] is not editable on cart page$")
	public void user_verify_coupons_information_is_not_editable_on_cart_page() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.getStudentFlyerOrdersCartSection().verifyCouponsIsNotEditedOnSfoCart();
	}

	@Then("^user should see order total with book trust amount on cart page$")
	public void user_verify_order_toal_on_cart_page() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.verifyCartItems();
	}
	@Then("^user should see book trust is not displayed for empty cart$")
	public void user_should_see_book_trust_is_not_displayed_for_empty_cart() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.verifyBooktrustIsNotDisplayForEmptyCart();
	}

	@When("^user select redeem and coupons on cart page$")
	public void user_select_redeem_and_coupons_on_cart_page() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.clickOnRedeemCoupon();
	}
	@Then("^user should see empty item list on cart page$")
	public void user_should_see_empty_to_review_message_on_cart_page() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.verifyEmptyCart();
	}

	@Then("^user verfies YTO items header on cart page$")
	public void user_verfies_YTO_items_header_on_cart_page() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.getYourTeacherOrdersCartSection().verifyYTOHeader();
	}

	@When("^user removes \\[YTOItemInformation\\] from item list from cart page with \"([^\"]*)\"$")
	public void user_removes_YTOItemInformation_from_item_list_from_cart_page_with(
			String confirmationStatus) {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.getYourTeacherOrdersCartSection().removeYTOItemFromStudentTable(
				TestBaseProvider.getTestBase().getTestData(), confirmationStatus);
	}

	@Then("^user verifies YTO item order on cart page$")
	public void user_verifies_YTO_item_order_on_cart_page() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.getYourTeacherOrdersCartSection().VerifyLastAddedItemOnFirstPosition();
	}

	@Then("^user add/update \\[Item\\] to cart by updating \\[BonusQuantity\\] on cart page$")
	public void user_updates_bonus_quantity_on_cart_page() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.getYourTeacherOrdersCartSection().updateBonusPointQuantity(
				TestBaseProvider.getTestBase().getTestData().getString("itemtitle"),
				TestBaseProvider.getTestBase().getTestData().getString("bonuspoints"));
	}

	@Then("^user wish to close promotional modal from parent Review Cart page$")
	public void user_should_able_to_close_promotional_modal_() {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.closePromotionalModalReviewCartPage();
	}
	@Then("^user should see should see Incomplete SFO coupon Model and select Review coupon$")
	public void user_should_incomplete_sfo_coupon_model() throws Throwable {
		ICheckoutPage checkoutpage = getFactory().getICheckoutPage();
		checkoutpage.verifyIncompleteSfoCouponModel();
	}
	@Then("^teacher sees the Bonus Flat description in Rewards section$")
	public void teacher_sees_the_Bonus_Flat_desc_in_rewards_section() throws Throwable {
		ICheckoutPage checkoutpage = getFactory().getICheckoutPage();
		checkoutpage.teacher_verify_BonusFlat_desc_displayed();
	}
	
	
	@Then("^teacher sees the Bonus percentage description in coupons section$")
    public void teacher_sees_the_bonus_percentage_description_in_coupons_section() throws Throwable {
		ICheckoutPage checkoutpage = getFactory().getICheckoutPage();
		checkoutpage.verify_bonusperc_manualCoupon_presence();
		
		
    }
	
	
	@Then("^teacher navigates to Confirm & Submit page$")
	public void teacher_navigates_to_Confirm_and_Submit_page() throws Throwable {
		ICheckoutPage checkoutpage = getFactory().getICheckoutPage();
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		//--> soma to handle DTS in checkout // 2 lines
		/*ICheckoutPage checkOut = getFactory().getICheckoutPage();
		checkOut.getRewardsAndCouponsSection().checkOutWithDTS(TestBaseProvider.getTestBase().getTestData());
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);*/
		checkoutpage.getRewardsAndCouponsSection().enterTossInNumberOfStudent(TestBaseProvider.getTestBase().getTestData());		
		PauseUtil.pause(3000);	
		checkoutpage.clickOnCheckoutButton();
		ShippingAndPayment shippingAndPaymentPage =
			    getFactory().getICheckoutPage().getShippingAndPaymentSection();
		
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		
		if((shippingAndPaymentPage.sizedrpSelectaCard().size()==0) || (!shippingAndPaymentPage.sizedrpSelectaCard().get(0).isDisplayed())){
			SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				    ConstantUtils.CHECKPAYMENTMETHOD);	
		}
		WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
		  SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
		
		
		
	}
	@And ("^teacher sees the Bonus Flat description in Confirm & Submit page$")
	public void teacher_see_bonus_flat_desc_in_confirm_and_submit_page() throws Throwable {
        /*ICartPage cartpage = getFactory().getICartPage();
        cartpage.getBonusFlatTextinConfirmandSubmitPage();*/
        ICheckoutPage checkoutpage = getFactory().getICheckoutPage();
		checkoutpage.teacher_verify_BonusFlat_desc_displayed();
		
	}
	
	
	
	@And("^teacher sees the Bonus percentage description in Confirm Submit page$")
    public void teacher_sees_the_bonus_percentage_description_in_Confirm_Submit_page() throws Throwable {
		CartPage crtpage = new CartPage();
		//crtpage.getBonusPercentageConfirmandSubmitPage();
        crtpage.getBonusPercentageConfirmationPage1();
    }
	
	@And("^teacher see the Bonus percentage description in confirm submit page with correct calculated dollars$")
    public void teacher_see_the_bonus_percentage_description_in_confirm_submit_page_with_correct_calculated_dollars() throws Throwable {
		CartPage crtpage = new CartPage();
		crtpage.getBonusPercentageConfirmandSubmitPage();
    }
	
	
	@And ("^teacher sees the Bonus Flat description in Submitted page$")
	public void teacher_sees_the_bonus_flat_desc_in_submitted_page() throws Throwable {
		ICheckoutPage checkoutpage = getFactory().getICheckoutPage();
		checkoutpage.teacher_verify_BonusFlat_desc_displayed();
		
	}
	
	

    @And("^teacher sees the Bonus percentage description in Confirmation page$")
    public void teacher_sees_the_bonus_percentage_description_in_confirmation_page() throws Throwable {
    	/*ICheckoutPage checkoutpage = getFactory().getICheckoutPage();
		checkoutpage.teacher_verify_BonusFlat_desc_displayed();*/
    	CartPage crtpage = new CartPage();
        crtpage.getBonusPercentageConfirmationPage1();
    }
    
    
    @And("^teacher see the Bonus percentage description in confirmation page with correct calculated dollars$")
    public void teacher_see_the_bonus_percentage_description_in_confirmation_page_with_correct_calculated_dollars() throws Throwable {
    	CartPage crtpage = new CartPage();
		crtpage.getBonusPercentageConfirmationPage();
    }
		
		
	@And ("^teacher navigates to Submitted page$")
	public void teacher_navigates_to_Submitted_page() throws Throwable {
		
		ICartPage cartpage = getFactory().getICartPage();
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		
		cartpage.clickOnSubmitOrderPage();
		
	}
		
		
	@Then ("^teacher does not see the Bonus Flat message in Rewards section$")
	public void teacher_does_not_sees_the_bonus_flat_desc_in_rewards_section() throws Throwable {
		
		ICartPage cartpage = getFactory().getICartPage();
		
		cartpage.verifyBonusFlatNotPresentinRewardsPage();
		
	}
	
	@Then ("^teacher does not see the Bonus Percentage message in Rewards section$")
	public void teacher_does_not_sees_the_bonus_Percentage_desc_in_rewards_section() throws Throwable {
		
		ICartPage cartpage = getFactory().getICartPage();
		
		cartpage.verifyBonusFlatNotPresentinRewardsPage();
		
	}
	
	@Then ("^teacher see the Bonus percentage description in Rewards section with correct calculated dollars$")
	public void teacher_see_the_bonus_percentage_desc_in_rewards_section_with_correct_calculated_dollars() throws Throwable {
		
		
		ICartPage cartpage = getFactory().getICartPage();
		
		cartpage.verifyBonusPercentageRewardsPage(TestBaseProvider.getTestBase()
				.getTestData().getDouble("bonuspercent"));
		
		
		
	}
	@When("^teacher applies \\[expired coupon\\]$")
    public void teacher_applies_expired_coupon() throws Throwable {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.enterExpiredCoupon();
    }
	
	
	
	@When("^teacher recieves error message$")
    public void teacher_receives_error_message_expired_coupon() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		
		cartpage.verifyExpiredCouponErrorMessage();
		
		
    }
	
	
	@Then("^teacher receives “This coupon code is not currently active\\. Please check the coupon for details\\.” error message for Bonus Percentage$")
    public void teacher_receives_this_coupon_code_is_not_currently_active_please_check_the_coupon_for_details_error_message_for_bonus_percentage() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.verifyExpiredCouponErrorMessage(ConstantUtils.BONUSPERCENTAGEEXPIREDERRMSG);
    }
	
	
	@When("^teacher recieves error message2$")
    public void teacher_receives_error_message_expired_coupon2() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		
		cartpage.verifyExpiredCouponErrorMessage2();
		
		
    }
	
	@When("^teacher applies \\[redeemed coupon\\]$")
    public void teacher_applies_error_message_redeemed_coupon() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		
		cartpage.enterRedeemedCoupon();
		
    }
	@And("^Teacher navigates to Review Your Cart page$")
    public void teacher_navigates_to_review_your_cart_page() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.clickOn_btnReviewCart();


    }
	
	@And("^teacher navigates to review cart page$")
    public void teacher_navigates_to_review_cart_page() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.clickOn_btnReviewCart();
    }
	
	@And("^teacher navigates to Review Your Cart page$")
    public void teacher_navigate_to_review_your_cart_page() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.clickOn_btnReviewCart();
    }
	
	
	
	@Then("^items are grouped by Student Club Youngest Club to Oldest Club$")
    public void items_are_grouped_by_student_club_youngest_club_to_oldest_club() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.verify_the_Grades_order_in_CartPage();
    }
	
	@Then("^items are grouped by Student Club Youngest Club to Oldest Club in SavedCart page$")
    public void items_are_grouped_by_student_club_youngest_club_to_oldest_club_in_savedcart_page() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.verify_the_Grades_order_in_SavedCartPage();
    }
	
	@And("^teacher sees items grouped by Student Club Youngest Club to Oldest Club in submit page$")
    public void teacher_sees_items_grouped_by_student_club_youngest_club_to_oldest_club_in_submit_page() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.verify_the_Grades_order_in_SubmitPage();
    }
	
	@When("^Teacher do the empty saved cart$")
    public void teacher_do_the_empty_saved_cart() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.Teacher_do_the_empty_saved_cart();
    }

	@When("^Teacher selects the saved cart$")
    public void teacher_selects_the_saved_cart() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.Teacher_selects_saved_cart();
    }
	
	@Then("^items are grouped by teacher Club in SavedCart page$")
    public void items_are_grouped_by_teacher_club_in_savedcart_page() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.verify_items_are_grouped_by_teacher_Club_SavedCart_Page();
    }
	
	@Then("^Teacher is still on saved cart and it is not deleted$")
    public void teacher_is_still_on_saved_cart_and_it_is_not_deleted() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.verify_items_are_not_deleted_in_student_and_teacher_Club_SavedCart_Page();
    }

    @And("^Teacher clicks on Save Cart for Later button$")
    public void teacher_clicks_on_save_cart_for_later_button() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
		cartpage.click_on_btn_SaveCart_for_Later();
    }

    @And("^Teacher saves the cart$")
    public void teacher_saves_the_cart() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
		cartpage.Teacher_saves_the_cart();
    }

    @Then("^items are grouped by student club and teacher Club$")
    public void items_are_grouped_by_student_club_and_teacher_club() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
		cartpage.verify_items_are_grouped_by_student_and_teacher_Club_SavedCart_Pages();
    }
    
    @Then("^totals are calculated correctly in Saved Cart page$")
    public void totals_are_calculated_correctly_in_saved_cart_page() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
		cartpage.verify_subTotal_of_student_and_teacher_Club_amount_SavedCart_Page();
    }
    
    @Then("^Student Club total is calculated correctly in Saved Cart page$")
    public void student_club_total_is_calculated_correctly_in_saved_cart_page() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
		cartpage.verify_subTotal_of_student_Club_amount_SavedCart_Page();
    }
    
    @Then("^Teacher Catalogues total is calculated correctly in Saved Cart page$")
    public void teacher_catalogues_total_is_calculated_correctly_in_saved_cart_page() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
		cartpage.verify_subTotal_of_teacher_Catalogues_amount_SavedCart_Page();
    }
    
    @And("^Teacher deletes the Saved cart$")
    public void teacher_deletes_the_saved_cart() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
		cartpage.Teacher_deletes_the_Saved_cart();
    }
    
    @When("^Teacher clicks on 'Return to Manage Saved Carts'$")
    public void teacher_clicks_on_return_to_manage_saved_carts() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
		cartpage.Selects_Return_To_ManageSavedCart();
    }

    @Then("^Manage Your Saved carts page displays with list of all saved carts$")
    public void manage_your_saved_carts_page_displays_with_list_of_all_saved_carts() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
		cartpage.verify_Manage_Your_Savedcarts_list_displayed();
    }
    
    @Then("^Teacher is still on saved cart$")
    public void teacher_is_still_on_saved_cart() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
		cartpage.verify_header_MySavedCarts_displayed_in_SavedCart_Page();
    }
    
    @When("^Teacher clicks on Delete and NO$")
    public void teacher_clicks_on_delete_and_no() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
		cartpage.Teacher_clicks_delete_and_NO_Saved_cart();
    }
    
    @When("^Teacher clicks on Delete and YES$")
    public void teacher_clicks_on_delete_and_yes() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
		cartpage.Teacher_clicks_delete_and_YES_Saved_cart();
    }
    
    @Then("^the deleted saved cart is not shown$")
    public void the_deleted_saved_cart_is_not_shown() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
		cartpage.verify_deleted_saved_cart_is_not_shown();
    }
    
    @When("^Teacher selects the Manage saved cart$")
    public void teacher_selects_the_manage_saved_cart() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
		cartpage.selects_the_Manage_SavedCart();
    }
    
    @And("^Teacher restore the Saved cart$")
    public void teacher_restore_the_saved_cart() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
		cartpage.restore_the_SavedCart();
    }
    
    @When("^Teacher clicks on View$")
    public void teacher_clicks_on_view() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
		cartpage.view_the_SavedCart();
    }
    
    @Then("^selected saved cart page displays$")
    public void selected_saved_cart_page_displays() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
		cartpage.verify_items_are_listed_in_student_and_teacher_Club_SavedCart_Page();
    }
    
    @Then("^saved cart is not shown in the Saved cart list$")
    public void saved_cart_is_not_shown_in_the_saved_cart_list() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
		cartpage.verify_Manage_cart_items_are_not_listed_in_SavedCart_Page();
    }
    

	
	@When("^teacher receives Flat Bonus Dollars$")
	public void teacher_receives_Flat_bonus_dollars() throws Throwable {
		ICouponsandRewards couponsandrewards = getFactory().getICouponandRewardsPage();

		couponsandrewards.verifyTeacherReceivesFlatBonusDollars();

	}
	
	
	@And("^teacher sees the Bonus Flat coupon number and message in coupons section$")
	public void teacher_sees_the_Bonus_Flat_coupon_number_and_message_in_coupons_section() throws Throwable {
		ICouponsandRewards couponsandrewards = getFactory().getICouponandRewardsPage();
		couponsandrewards.verifyTeacherBonusFlatCouponNumber();

	}
	
	/*@And("^teacher views Amount paid by checks with check amount$")
    public void teacher_views_amount_paid_by_checks_with_check_amount() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.verify_the_amount_paid_by_cheque_with_cheque_amt_ConfirmSub_Page();
		
    }*/

    @And("^Teacher submits the order$")
    public void teacher_submits_the_order() throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
		//cartpage.verify_the_Grades_order_in_SubmitPage();
    }
    
    
    
    @When("^Teacher selects new credit card as payment with \"([^\"]*)\" option checked$")
    public void teacher_selects_new_credit_card_as_payment_with_something_option_checked(String strArg1) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.selectCreditOption_newCard();
		checkoutPage.addNewCreditCard_SaveCart(TestBaseProvider.getTestBase().getTestData());
    }
    
    
    @Then("^line time label for student clubs total should be \"([^\"]*)\" and for teacher club items it should be \"([^\"]*)\"$")
    public void line_time_label_for_student_clubs_total_should_be_something_and_for_teacher_club_items_it_should_be_something(String strArg1, String strArg2) throws Throwable {
        
    	IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyReviewCartStudentTeacherClubTotalsLabel();
    }
    
    
    @Then("^line time label in Confirm and Submit page for student clubs total should be \"([^\"]*)\" and for teacher club items it should be \"([^\"]*)\"$")
    public void line_time_label_in_confirm_and_submit_page_for_student_clubs_total_should_be_something_and_for_teacher_club_items_it_should_be_something(String strArg1, String strArg2) throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyConfirmSubmitStudentTeacherClubTotalsLabel();
    }
    
    
    @And("^line time label in Confirmation page for student clubs total should be \"([^\"]*)\" and for teacher club items it should be \"([^\"]*)\"$")
    public void line_time_label_in_confirmation_page_for_student_clubs_total_should_be_something_and_for_teacher_club_items_it_should_be_something(String strArg1, String strArg2) throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verifyConfirmSubmitStudentTeacherClubTotalsLabel();
    }
    
    @Then("^teacher see the item selected from Dollars to spend with unique item id with correct format in Rewards Section$")
    public void teacher_see_the_item_selected_from_dollars_to_spend_with_unique_item_id_with_correct_format_in_rewards_section() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.verify_DTS_itemid_ConfirmSubmitPage();
    }
    
    @Then("^teacher see the item selected from Free pick window with unique item id with correct format in Rewards Section$")
    public void teacher_see_the_item_selected_from_free_pick_window_with_unique_item_id_with_correct_format_in_rewards_section() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.verify_DTS_itemid_ConfirmSubmitPage();
    }
    
    
    @Then("^teacher sees correct item numbers in order history page$")
    public void teacher_sees_correct_item_numbers_in_order_history_page() throws Throwable {
       System.out.println("pass");
    }

    
    
    
    @And("^teacher navigates to confirm and submit page from Review cart page$")
    public void teacher_navigates_to_confirm_and_submit_page_from_review_cart_page() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.teacher_Proceed_To_confirmSubmitPage_from_reviewCart();
    }
    
    
    @Then("^teacher should see home icon$")
    public void teacher_should_see_home_icon() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.verifyhomeIcon_ConfirmationPage();
    }
    
    @When("^teacher clicks on home icon present on the top$")
    public void teacher_clicks_on_home_icon_present_on_the_top() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.clickhomeIcon_ConfirmationPage();
    }
    
    @When("^teacher clicks on home page icon option present in main menu on top of the page$")
    public void teacher_clicks_on_home_page_icon_option_present_in_main_menu_on_top_of_the_page() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.clickhomeIcon_mainmenu();
    }
    
    
    @Then("^teacher should be navigated back to home page$")
    public void teacher_should_be_navigated_back_to_home_page() throws Throwable {
    	ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(5000);
		Assert.assertTrue(teachersHomePage.sizelnkEnterOrder().size() > 0);
		
    }
    
    
    @And("^should not see Checkout label in the red bar$")
    public void should_not_see_checkout_label_in_the_red_bar() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.verifyCheckoutLabel_ConfirmationPage();
    }
    
    @And("^should not see checkout phases$")
    public void should_not_see_checkout_phases() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.verifyCheckoutLabel_ConfirmationPage();
    }
		
	@And("^teacher adds student club items to cart and proceed to Review Cart page$")
    public void teacher_adds_student_club_items_to_cart_and_proceed_to_review_cart_page() throws Throwable {
		
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		ICartPage cartPage = getFactory().getICartPage();
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder_Eligible_Promotions(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice_limit"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));	
		
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(2500);
		cartPage.clickOn_btnReviewCart();
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(5000);
		
		double totalamountowing = checkoutPage.ReviewCart_Total_Amt_Owing();
	    TestBaseProvider.getTestBase().getContext()
		.setProperty("testexecution.reviewcart_totalamtowing", totalamountowing);
	    System.out.println("Review Cart Total Amt Owing is: "+totalamountowing);
	    
	    
	    double studclub_subtotal = checkoutPage.ReviewCart_SubTotal_Amt();
	    TestBaseProvider.getTestBase().getContext()
		.setProperty("testexecution.reviewcart_studentclubsubtotal", studclub_subtotal);
	    System.out.println("Review Cart Student sub total is: "+studclub_subtotal);
	    
	    
	    
		}
	
	
	
	@And("^teacher adds teacher catalogue items to cart and proceed to Review Cart page$")
    public void teacher_adds_teacher_catalogue_items_to_cart_and_proceed_to_review_cart_page() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		ICartPage cartPage = getFactory().getICartPage();
		iStudentFlyerOrdersPage.fillTeacherCatalogueFlyerOrder(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice_limit"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));	
		
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(2500);
		cartPage.clickOn_btnReviewCart();
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(5000);
    }
	
	
	@When("^teacher clicks on Proceed to Checkout button$")
    public void teacher_clicks_on_proceed_to_checkout_button() throws Throwable {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.clickOn_ProceedToCheckoutBtn();
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(5000);
    }
	
	
	@Then("^pop\\-up reward table should be seen$")
    public void popup_reward_table_should_be_seen() throws Throwable {
		ICartPage cartPage = getFactory().getICartPage();
        cartPage.verify_Present_PopUp_Rewards_Table();
    }
	
	
	@Then("^pop\\-up reward table should not be seen$")
    public void popup_reward_table_should_not_be_seen() throws Throwable {
		ICartPage cartPage = getFactory().getICartPage();
        cartPage.verify_NotPresent_PopUp_Rewards_Table();
    }
	
	
	@And("^order total on pop\\-up reward table should match with current order total$")
    public void order_total_on_popup_reward_table_should_match_with_current_order_total() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.verifycurrenttotalorderValue_rewardtable();
    }
	
	
	@When("^teacher clicks on Proceed to Checkout link present on top of the reward table$")
    public void teacher_clicks_on_proceed_to_checkout_link_present_on_top_of_the_reward_table() throws Throwable {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.click_proceedtocheckout_popuprewardtable();
    }
	
	
	@When("^teacher clicks on Proceed to Checkout button present at bottom of the reward table$")
    public void teacher_clicks_on_proceed_to_checkout_button_present_at_bottom_of_the_reward_table() throws Throwable {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.click_proceedtocheckout_bottom_popuprewardtable();
    }
	
	
	@Then("^teacher should navigate back to flyers page and see the recently selected flyer$")
    public void teacher_should_navigate_back_to_flyers_page_and_see_the_recently_selected_flyer() throws Throwable {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.verify_flyerpage_with_returntoshoplink();
    }
	
	
	@When("^teacher clicks on Return to Shop link present at bottom of the reward table$")
    public void teacher_clicks_on_return_to_shop_link_present_at_bottom_of_the_reward_table() throws Throwable {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.click_lnk_returntoshop_popuprewardtable();
    }
	
	
	@And("^Current Total Order value range should be highlighted on pop-up reward table along with Bonus points and Dollars to Spend row$")
    public void current_total_order_value_range_should_be_highlighted_on_popup_reward_table_along_with_bonus_points_and_dollars_to_spend_row() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.verifyhighlighedrowpopuprewardtable();
    }
	
	@And("^teacher proceed to checkout and lands on confirm & submit page$")
    public void teacher_proceed_to_checkout_and_lands_on_confirm_submit_page() throws Throwable {
    	CheckoutPage chkpge = new CheckoutPage();
		chkpge.teacher_Proceed_To_confirmSubmitPage_from_reviewCart();
    }
    
	@When("^CSR navigates to Confirm and Submit page$")
    public void csr_navigates_to_confirm_and_submit_page() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CHECKPAYMENTMETHOD);
		PauseUtil.pause(5000);
		
		WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
		SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
    }
	
	@When("^CSR selects Checks as payment$")
    public void csr_selects_checks_as_payment() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CHECKPAYMENTMETHOD);
		PauseUtil.pause(5000);
    }
	
	@And("^CSR selects Combination of Credit Card and Cheques as payment$")
    public void csr_selects_combination_of_credit_card_and_cheques_as_payment() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CCANDCHECKPAYMENTMETHOD);
		PauseUtil.pause(5000);
    }
	
	@When("^CSR selects Purchase Order as payment$")
    public void csr_selects_purchase_order_as_payment() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.PURCHASEORDERPAYMENTMETHOD);
		PauseUtil.pause(5000);
    }
	
	
	@Then("^Cheques payable to section and message displays correctly$")
    public void cheques_payable_to_section_and_message_displays_correctly() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.validate_cheques_payable_to_message_and_section_displayed_Payment_page();
    }
	
	@Then("^Payment options are not displayed$")
    public void payment_options_are_not_displayed() throws Throwable {
		/*ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.verify_payment_options_are_not_displayed_and_disabled_PaymentPage();*/
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
    	shippingAndPaymentPage.verify_payment_method_section_not_displayed();
    }
	
	@When("^CSR selects Cheques as payment$")
    public void csr_selects_cheques_as_payment() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CHECKPAYMENTMETHOD);
		PauseUtil.pause(5000);
    }
	
	@When("^CSR selects Combination of Credit Card and PO as payment$")
    public void csr_selects_combination_of_credit_card_and_po_as_payment() throws Throwable {
		ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CC_AND_PO_PAYMENT_METHOD);
		PauseUtil.pause(5000);
    }


	@And("^teacher navigates to Review Your Cart page(\\d+)$")
	public void teacherNavigatesToReviewYourCartPage(int arg0) throws Throwable {
		// reveiw cart navigation is taken care by the search and add item
	}


	//######################################### SCSCOD-6165 CSR ##################################################################
    @When("^CSR enters free shipping coupon$")
    public void csr_enters_free_shipping_coupon() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.CSR_enters_coupon_in_coupon_textbox_field();
    }

    @When("^CSR clicks apply on coupon code section$")
    public void csr_clicks_apply_on_coupon_code_section() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.CSR_clicks_apply_button_on_coupon_textbox();
    }

    /*@Then("^free shipping coupon is applied to order$")
    public void free_shipping_coupon_is_applied_to_order() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.CSR_verify_coupon_section_displayed_and_retained_in_Redemptions_Page();
    	checkoutPage.CSR_sees_coupon_in_coupon_layer();
    	checkoutPage.CSR_sees_shipping_as_free();
    }*/
   
    @When("^CSR clicks the ‘X’ icon next to coupon$")
    public void csr_clicks_the_X_icon_next_to_coupon() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.CSR_delete_selected_item_from_DTS_window();
    }

    @Then("^free shipping coupon is removed from order$")
    public void free_shipping_coupon_is_removed_from_order() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.CSR_verify_coupon_section_not_displayed_in_Redemptions_Page();
    }

    @Then("^CSR sees original amount for shipping$")
    public void csr_sees_original_amount_for_shipping() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.CSR_does_not_see__free_shipping_message_Rewards_page();
    }
    
    @Then("^CSR sees the automatic free shipping applied to order$")
    public void csr_sees_the_automatic_free_shipping_applied_to_order() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.CSR_sees_shipping_as_free();
    	checkoutPage.CSR_verify_coupon_section_not_displayed_in_Redemptions_Page();
    }
    
    @Then("^free shipping coupon remains on the order$")
    public void free_shipping_coupon_remains_on_the_order() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.CSR_verify_coupon_section_displayed_and_retained_in_Redemptions_Page();
    	checkoutPage.CSR_sees_coupon_in_coupon_layer();
    	checkoutPage.CSR_sees_shipping_as_free();
    }
    
    @Then("^an error message is displayed$")
    public void an_error_message_is_displayed() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.CSR_verify_error_popup_displayed_RedeemRewards_page();
    	checkoutPage.validate_error_message_for_reenter_the_same_coupon();
    }
    
    @Then("^free shipping coupon is not applied to order$")
    public void free_shipping_coupon_is_not_applied_to_order() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.CSR_verify_coupon_section_not_displayed_in_Redemptions_Page();
    }
    
  //######################################### SCSCOD-6165 TCOD ##################################################################
    
    @When("^teacher enters free shipping coupon$")
    public void teacher_enters_free_shipping_coupon() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.CSR_enters_coupon_in_coupon_textbox_field();
    }

    @When("^teacher clicks apply on coupon code section$")
    public void teacher_clicks_apply_on_coupon_code_section() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.CSR_clicks_apply_button_on_coupon_textbox();
    }
    
    @When("^teacher clicks the ‘X’ icon next to coupon$")
    public void teacher_clicks_the_X_icon_next_to_coupon() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.delete_the_FreeItem_RewardsPage();
    }

    @Then("^teacher sees original amount for shipping$")
    public void teacher_sees_original_amount_for_shipping() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.CSR_does_not_see__free_shipping_message_Rewards_page();
    }
    
    @Then("^teacher sees the automatic free shipping applied to order$")
    public void teacher_sees_the_automatic_free_shipping_applied_to_order() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.CSR_sees_shipping_as_free();
    	checkoutPage.CSR_verify_coupon_section_not_displayed_in_Redemptions_Page();
    }
    
  //######################################### SCSCOD-7063 ##################################################################
    @When("^teacher selects the shopping cart icon with (\\d+) items$")
    public void teacher_selects_the_shopping_cart_icon_with_items(int arg1) throws Throwable {
    	ICartPage cartpage = getFactory().getICartPage();
		cartpage.clickCartIcon_on_homepage();
    }
    
    @When("^teacher selects the hyperlink “Redeem your Coupons”$")
    public void teacher_selects_the_hyperlink_Redeem_your_Coupons() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_selects_redeem_coupon_hyperlink();
    }
    
    @Then("^teacher sees the Rewards and Redemption page$")
    public void teacher_sees_the_Rewards_and_Redemption_page() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.verify_Rewards_and_redemption_page_is_displayed();
    }
    
    @When("^teacher navigates to the Your Teacher Order page$")
    public void teacher_navigates_to_the_Your_Teacher_Order_page() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_selects_YTO_option();
    }

    @Then("^label for the \"([^\"]*)\" button is changed to \"([^\"]*)\"$")
    public void label_for_the_button_is_changed_to(String arg1, String arg2) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.button_changed_validation_YTO_page(arg1, arg2);
    }

    @Then("^the link \"([^\"]*)\" is selected by default$")
    public void the_link_is_selected_by_default(String arg1) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.By_Flyer_link_selected_by_default();
    }

	@And("^the freepick item is displayed with Student Name,item Title, Item Flyer,Coupon Code\\.Price as FREE and QTY is displayed$")
	public void theFreepickItemIsDisplayedWithStudentNameItemTitleItemFlyerCouponCodePriceAsFREEAndQTYIsDisplayed() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.getICouponSection().validate_sfo_freepickItem_afterselection_SFOpage();




	}
    //######################################### SCSCOD-7063 ##################################################################
    
  //######################################### SCSCOD-5101 ##################################################################
    @And("^teacher enters an unique item number existing in a Flyer in the search textbox$")
    public void teacher_enters_an_unique_item_number_existing_in_a_Flyer_in_the_search_textbox() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_enters_value_in_search_textbox();
    }

    @And("^teacher clicks Search$")
    public void teacher_clicks_Search() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_selects_search_button();
    }

    @When("^teacher clicks on the hyperlink next to the item number$")
    public void teacher_clicks_on_the_hyperlink_next_to_the_item_number() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_clicks_hyperlink_next_to_item_number();
    }

    @Then("^teacher is re-directed to the YTO page$")
    public void teacher_is_re_directed_to_the_YTO_page() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_goes_to_YTO_page();
    }

    @Then("^corresponding grade that the item belongs to is selected$")
    public void corresponding_grade_that_the_item_belongs_to_is_selected() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_sees_active_grade_selected();
    }

    @Then("^corresponding month for that grade is selected$")
    public void corresponding_month_for_that_grade_is_selected() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_sees_active_month_selected();
    }
    
    @And("^teacher enters a partial text for an item existing in a Flyer in the search textbox$")
    public void teacher_enters_a_partial_text_for_an_item_existing_in_a_Flyer_in_the_search_textbox() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_enters_value_in_search_textbox();
    }

    @When("^teacher clicks on the Quick Look link for the first item on the search result page$")
    public void teacher_clicks_on_the_Quick_Look_link_for_the_first_item_on_the_search_result_page() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_clicks_the_Quick_Look_link();
    }
    
    @And("^teacher adds item to cart$")
    public void teacher_adds_item_to_cart() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_add_item_to_cart();
    }

    @When("^teacher navigates to the Review Cart page$")
    public void teacher_navigates_to_the_Review_Cart_page() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_goes_to_review_cart_via_the_mini_popup_on_PDP();
    }

    @When("^teacher clicks on Flyer hyperlink for the added item$")
    public void teacher_clicks_on_Flyer_hyperlink_for_the_added_item() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_select_flyer_hyperlink_on_added_item();
    }
    
    @And("^teacher enters an unique item number existing in the Teacher Catalogue in the search textbox$")
    public void teacher_enters_an_unique_item_number_existing_in_the_Teacher_Catalogue_in_the_search_textbox() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_enters_value_in_search_textbox();
    }

    @Then("^teacher is re-directed to the corresponding Book Resource page$")
    public void teacher_is_re_directed_to_the_corresponding_Book_Resource_page() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_sees_appropriate_book_resource_page();
    }
    
    @And("^teacher enters a partial text for an item existing in the Teacher Catalogue in the search textbox$")
    public void teacher_enters_a_partial_text_for_an_item_existing_in_the_Teacher_Catalogue_in_the_search_textbox() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_enters_value_in_search_textbox();
    }
    
    @And("^teacher enters a partial text for an item existing only in the Generic Online category in the search textbox$")
    public void teacher_enters_a_partial_text_for_an_item_existing_only_in_the_Generic_Online_category_in_the_search_textbox() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_enters_value_in_search_textbox();
    }

    @Then("^the hyperlink next to the \"([^\"]*)\" is removed and disabled$")
    public void the_hyperlink_next_to_the_is_removed_and_disabled(String arg1) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_cannot_click_the_hyperlink_for_generic_online_items_PDP_QuickLook();
    }
    
    @And("^teacher enters the unique item number for an item existing only in the Generic Online category in the search textbox$")
    public void teacher_enters_the_unique_item_number_for_an_item_existing_only_in_the_Generic_Online_category_in_the_search_textbox() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_enters_value_in_search_textbox();
    }
    
    @Then("^the hyperlink under the Flyer column for the added item is removed and disabled$")
    public void the_hyperlink_under_the_Flyer_column_for_the_added_item_is_removed_and_disabled() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_cannot_click_the_hyperlink_for_generic_online_items_Review_Cart();
    }
    
    @And("^teacher enters partial text for item existing in a Flyer and Book Resource in the search textbox$")
    public void teacher_enters_partial_text_for_item_existing_in_a_Flyer_and_Book_Resource_in_the_search_textbox() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_enters_value_in_search_textbox();
    }

    @And("^teacher hovers over the category hyperlink next to the item number$")
    public void teacher_hovers_over_the_category_hyperlink_next_to_the_item_number() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_hovers_the_category_hyperlink_next_to_item_number();
    }

    @When("^teacher clicks on the YTO hyperlink in the pop-up$")
    public void teacher_clicks_on_the_YTO_hyperlink_in_the_pop_up() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_selects_YTO_link_in_popup();
    }
    
    @And("^teacher enters an unique item number existing in a Flyer and Book Resource in the search textbox$")
    public void teacher_enters_an_unique_item_number_existing_in_a_Flyer_and_Book_Resource_in_the_search_textbox() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_enters_value_in_search_textbox();
    }

    @When("^teacher clicks on the Teacher Catalogue hyperlink in the pop-up$")
    public void teacher_clicks_on_the_Teacher_Catalogue_hyperlink_in_the_pop_up() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_selects_TeacherExclusive_link_in_popup();
    }
    
    @And("^teacher enters an unique item number existing in Generic Online and Flyer in the search textbox$")
    public void teacher_enters_an_unique_item_number_existing_in_Generic_Online_and_Flyer_in_the_search_textbox() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_enters_value_in_search_textbox();
    }

    @When("^the hyperlink for the Generic Online category is disabled$")
    public void the_hyperlink_for_the_Generic_Online_category_is_disabled() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_cannot_click_on_Generic_link();
    }

    @When("^the hyperlink for the Flyer is enabled$")
    public void the_hyperlink_for_the_Flyer_is_enabled() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_can_click_on_FLyer_link();
    }
    
    @Given("^teacher enters an unique item number existing in Generic Online and Book Resource in the search textbox$")
    public void teacher_enters_an_unique_item_number_existing_in_Generic_Online_and_Book_Resource_in_the_search_textbox() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_enters_value_in_search_textbox();
    }

    @When("^the hyperlink for the Book Resource is enabled$")
    public void the_hyperlink_for_the_Book_Resource_is_enabled() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_can_click_on_Book_Resource_link();
    }
    
    @And("^teacher enters partial text for item existing in Generic Online and Flyer in the search textbox$")
    public void teacher_enters_partial_text_for_item_existing_in_Generic_Online_and_Flyer_in_the_search_textbox() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_enters_value_in_search_textbox();
    }
    
    @And("^teacher enters partial text for item existing in Generic Online and Book Resource in the search textbox$")
    public void teacher_enters_partial_text_for_item_existing_in_Generic_Online_and_Book_Resource_in_the_search_textbox() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_enters_value_in_search_textbox();
    }
  //######################################### SCSCOD-5101 ##################################################################
    
  //######################################### SCSCOD-7064 ##################################################################
    @Given("^teacher clicks the \"([^\"]*)\" hyperlink$")
    public void teacher_clicks_the_hyperlink(String arg1) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_click_YTO_ByItem_link();
    }

    @Given("^teacher adds multiple valid item numbers$")
    public void teacher_adds_multiple_valid_item_numbers() throws Throwable {
    	boolean multipleItems = true;
    	
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_add_items_to_cart_via_YTO_ByItem(multipleItems);
    }

    @When("^teacher enters another valid item number$")
    public void teacher_enters_another_valid_item_number() throws Throwable {
    	boolean multipleItems = false;
    	
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_add_items_to_cart_via_YTO_ByItem(multipleItems);
    }

    @When("^teacher clicks on the ‘ADD’ button$")
    public void teacher_clicks_on_the_ADD_button() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_clicks_ADD_button_YTO_ByItem();
    }
    
    @Given("^teacher enters a valid item number$")
    public void teacher_enters_a_valid_item_number() throws Throwable {
    	boolean multipleItems = false;
    	
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_add_items_to_cart_via_YTO_ByItem(multipleItems);
    }

    @When("^teacher edits the quantity of the item to \\[quantity amount\\]$")
    public void teacher_edits_the_quantity_of_the_item_to_quantity_amount() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_edit_quantity_of_first_item_YTO_ByItem();
    }

    @Then("^teacher sees the current quantity of item as \\[quantity amount\\]$")
    public void teacher_sees_the_current_quantity_of_item_as_quantity_amount() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_sees_entered_quantity_first_item_YTO_ByItem();
    }
    
    @When("^teacher selects the ‘X’ icon in the first item row$")
    public void teacher_selects_the_X_icon_in_the_first_item_row() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_selects_X_icon_on_first_item_YTO_ByItem();
    }

    @When("^teacher confirms the delete$")
    public void teacher_confirms_the_delete() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_selects_YES_on_delete_modal_first_item_YTO_ByItem();
    }

    @Then("^teacher do not see the deleted item in the \"([^\"]*)\" list$")
    public void teacher_do_not_see_the_deleted_item_in_the_list(String arg1) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_does_not_see_deleted_item_first_row_YTO_ByItem();
    }
    
    @When("^teacher edits the quantity of the first item to (\\d+)$")
    public void teacher_edits_the_quantity_of_the_first_item_to(int arg1) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_edit_quantity_of_first_item_YTO_ByItem();
    }

    @Then("^teacher sees the delete pop-up under the first item row$")
    public void teacher_sees_the_delete_pop_up_under_the_first_item_row() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_sees_delete_modal_first_item_YTO_ByItem();
    }
    
    @Then("^teacher do not see the \"([^\"]*)\" table under the \"([^\"]*)\" layer$")
    public void teacher_do_not_see_the_table_under_the_layer(String arg1, String arg2) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_does_not_see_table_under_YTO_ByItem_layer();
    }
    
    @When("^teacher enters an item number with (\\d+) characters$")
    public void teacher_enters_an_item_number_with_characters(int arg1) throws Throwable {
    	boolean multipleItems = false;
    	
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_add_items_to_cart_via_YTO_ByItem(multipleItems);
    }

    @Then("^the \"([^\"]*)\" button is enabled$")
    public void the_button_is_enabled(String arg1) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.ADD_button_enabled_YTO_ByItem();
    }
    
    @When("^teacher enters a non-existing item number$")
    public void teacher_enters_a_non_existing_item_number() throws Throwable {
    	boolean multipleItems = false;
    	
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_add_items_to_cart_via_YTO_ByItem(multipleItems);
    }

    @Then("^an error message is shown above the \"([^\"]*)\" textbox stating that the number does not exist$")
    public void an_error_message_is_shown_above_the_textbox_stating_that_the_number_does_not_exist(String arg1) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_sees_does_not_exist_error_msg_YTO_ByItem();
    }
    
    @Then("^\"([^\"]*)\" textbox is empty$")
    public void textbox_is_empty(String arg1) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.ItemNum_textbox_is_empty_YTO_ByItem();
    }

    @Then("^\"([^\"]*)\" button is disabled$")
    public void button_is_disabled(String arg1) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.ADD_button_disabled_YTO_ByItem();
    }
    
    @Then("^\"([^\"]*)\" textbox accepts the item number$")
    public void textbox_accepts_the_item_number(String arg1) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_sees_entered_item_number_YTO_ByItem();
    }
    
    @When("^teacher enters an item number with (\\d+) character$")
    public void teacher_enters_an_item_number_with_character(int arg1) throws Throwable {
    	boolean multipleItems = false;
    	
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_add_items_to_cart_via_YTO_ByItem(multipleItems);
    }
    
    @When("^teacher enters an item number with more than (\\d+) characters$")
    public void teacher_enters_an_item_number_with_more_than_characters(int arg1) throws Throwable {
    	boolean multipleItems = false;
    	
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_add_items_to_cart_via_YTO_ByItem(multipleItems);
    }
    
    @Then("^the \"([^\"]*)\" textbox rejects the item number$")
    public void textbox_rejects_the_item_number(String arg1) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_does_not_see_entered_item_number_YTO_ByItem();
    }
    
    @When("^teacher enters an item number with special characters$")
    public void teacher_enters_an_item_number_with_special_characters() throws Throwable {
    	boolean multipleItems = false;
    	
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_add_items_to_cart_via_YTO_ByItem(multipleItems);
    }

    @Then("^an error message is shown above the \"([^\"]*)\" textbox stating the number is incorrect$")
    public void an_error_message_is_shown_above_the_textbox_stating_the_number_is_incorrect(String arg1) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_sees_incorrect_error_msg_YTO_ByItem();
    }
    
    @Then("^the shopping cart is updated by an increase of (\\d+)$")
    public void the_shopping_cart_is_updated_by_an_increase_of(int arg1) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_sees_shopping_cart_updated_YTO_ByItem(arg1);
    }
    
    @Then("^the shopping cart is updated by a decrease of (\\d+)$")
    public void the_shopping_cart_is_updated_by_a_decrease_of(int arg1) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_sees_shopping_cart_updated_YTO_ByItem(arg1);
    }
    
    @When("^teacher clicks in the \"([^\"]*)\" textbox$")
    public void teacher_clicks_in_the_textbox(String arg1) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_clicks_in_the_ItemNum_textbox_YTO_ByItem();
    }

    @Then("^teacher sees a drop-down under the \"([^\"]*)\" textbox$")
    public void teacher_sees_a_drop_down_under_the_textbox(String arg1) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_sees_dropdown_menu_YTO_ByItem();
    }

    @Then("^teacher sees the previously added item in the drop-down$")
    public void teacher_sees_the_previously_added_item_in_the_drop_down() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_sees_previously_added_item_in_dropdown_YTO_ByItem();
    }
    
    @Then("^teacher sees the recent item added at the top of the \"([^\"]*)\" list$")
    public void teacher_sees_the_recent_item_added_at_the_top_of_the_list(String arg1) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_sees_recent_added_item_YTO_ByItem();
    }
    
    @When("^teacher selects previously added item number from dropdown$")
    public void teacher_selects_previously_added_item_number_from_dropdown() throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_adds_previous_item_from_dropdown_YTO_ByItem();
    }

    @Then("^teacher sees item number added to \"([^\"]*)\" textbox$")
    public void teacher_sees_item_number_added_to_textbox(String arg1) throws Throwable {
    	ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.Teacher_sees_item_from_dropdown_in_ItemNumtextbox_YTO_ByItem();
    }
  //######################################### SCSCOD-7064 ##################################################################
    
    @Then("^teacher does not see the Bonus Flat description in Rewards section$")
    public void teacher_does_not_see_the_bonus_flat_description_in_rewards_section() throws Throwable {
		ICartPage cartpage = getFactory().getICartPage();
		cartpage.verifyBonusFlatNotPresentinRewardsPage();
	}
    
    @Then("^teacher does not see the Free Item description in Rewards section$")
    public void teacher_does_not_see_the_free_item_description_in_rewards_section() throws Throwable {
		ICartPage cartPage = getFactory().getICartPage();
		cartPage.verifyFreePromotionShouldNotDisplay();
    }
    
    @And("^teacher applies \\[Non\\-Stackable coupon\\] and dismiss$")
    public void teacher_applies_nonstackable_coupon_and_dismiss() throws Throwable {
		PauseUtil.waitForAjaxToComplete(2500);
		Wait_for_invisibility_of_locator();
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();

		String coupons[] = SCHUtils.getArrayFromStringData(
				TestBaseProvider.getTestBase().getTestData().getString("nonstackablecoupon"));
		for (String coupon : coupons) {
			rewardsAndCoupons.enterCoupon_and_dismiss(coupon);
			
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);		
		}
    }
    
    @And("^teacher applies \\[stackable coupon\\] and dismiss$")
    public void teacher_applies_stackable_coupon_and_dismiss() throws Throwable {
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();

		String coupons[] = SCHUtils.getArrayFromStringData(
				TestBaseProvider.getTestBase().getTestData().getString("stackablecoupon"));
		for (String coupon : coupons) {
			rewardsAndCoupons.enterCoupon_and_dismiss(coupon);

		}
    }
    
    
    @And("^teacher navigates to Review cart page from home page$")
    public void teacher_navigates_to_review_cart_page_from_home_page() throws Throwable {
    	TeachersHomePage teacherhomepage = new TeachersHomePage();
    	teacherhomepage.btn_mini_reviewCart().click();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
    }

	@Then("^teacher see Bonus Flat description in Rewards section$")
	public void teacherSeeBonusFlatDescriptionInRewardsSection() throws Throwable {
		ICheckoutPage checkoutpage = getFactory().getICheckoutPage();
		ICartPage cartpage = getFactory().getICartPage();
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		cartpage.getBonusFlatText();
	}
    
	@Then("^error message 'The coupon code you have already applied cannot be combined with any other coupons\\. To use a different coupon code, please remove the code you have already entered and try again\\.' displays$")
    public void error_message_the_coupon_code_you_have_already_applied_cannot_be_combined_with_any_other_coupons_to_use_a_different_coupon_code_please_remove_the_code_you_have_already_entered_and_try_again_displays() throws Throwable {
    	RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();
		rewardsAndCoupons.verifyErrorMsgForNonStackableStackableCoupon(
				TestBaseProvider.getTestBase().getTestData());
    }
    
	//######################################### SCSCOD-2324 ##################################################################
	@Given("^CSR adds items to order entry such that SOO \\+ YTO pre-tax subtotal meets the min\\. amount for coupon$")
	public void csr_adds_items_to_order_entry_such_that_SOO_YTO_pre_tax_subtotal_meets_the_min_amount_for_coupon() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@When("^CSR enters valid Coupon code on Rewards Page$")
	public void csr_enters_valid_Coupon_code_on_Rewards_Page() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.CSR_enters_coupon_in_coupon_textbox_field();
	}

	@When("^CSR searches for a \\[qualifying Item number\\]$")
	public void csr_searches_for_a_qualifying_Item_number() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
    	checkoutPage.clicks_Search_fld_and_searches_an_item_in_MakeYourSelection_window();
	}
	
	@And("^CSR selects the item from freepick modal$")
	public void CSR_selects_the_item_from_freepick_modal() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.MakeSelectionWindow_SelectItemFreePick();
	}
	
	@Then("^YTO freepick item information displays on the Redemptions & Rewards page$")
	public void yto_freepick_item_information_displays_on_the_Redemptions_Rewards_page() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Verify_applied_couon_is_added_and_shipping_charge_is_free_in_Redemptions_page();
	}
	
	@Given("^CSR adds items to order entry such that SOO \\+ YTO pre-tax subtotal meets the min\\. amount for promotion$")
	public void csr_adds_items_to_order_entry_such_that_SOO_YTO_pre_tax_subtotal_meets_the_min_amount_for_promotion() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@Then("^CSR sees the Bonus Flat description in Rewards section$")
	public void csr_sees_the_Bonus_Flat_description_in_Rewards_section() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.bonus_flat_bonus_percentage_promotion_displays_Rewards_page();
	}
	
	@Then("^CSR sees the Student Incentive description in Rewards section$")
	public void csr_sees_the_Student_Incentive_description_in_Rewards_section() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.student_incentive_promotion_displays_Rewards_page();
	}
	
	@Then("^CSR sees the Free Item description in Rewards section$")
	public void csr_sees_the_Free_Item_description_in_Rewards_section() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.free_item_promotion_displays_Rewards_page();
	}
	
	@Then("^CSR sees the Spell Scholastic promotion description in Rewards section$")
	public void csr_sees_the_Spell_Scholastic_promotion_description_in_Rewards_section() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.Spell_Scholastic_promotion_displays_Rewards_page();
	}
	
	@Given("^CSR adds teacher exclusive items to order entry such that SOO \\+ Teacher Exclusive pre-tax subtotal meets the min\\. amount for coupon$")
	public void csr_adds_teacher_exclusive_items_to_order_entry_such_that_SOO_Teacher_Exclusive_pre_tax_subtotal_meets_the_min_amount_for_coupon() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@Then("^error message displays and coupon is not applied$")
	public void error_message_displays_and_coupon_is_not_applied() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		checkoutPage.CSR_verify_error_popup_displayed_RedeemRewards_page();
    	checkoutPage.CSR_verify_coupon_section_not_displayed_in_Redemptions_Page();
	}
	
	@Given("^CSR adds items less than the min\\. amount for promotion$")
	public void csr_adds_items_less_than_the_min_amount_for_promotion() throws Throwable {
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.CSR_adds_mul_Teacher_cat_items_to_cart_OrderEntryPage();
	}

	@Then("^CSR does not see the Bonus Flat description in Rewards section$")
	public void csr_does_not_see_the_Bonus_Flat_description_in_Rewards_section() throws Throwable {
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.bonus_flat_bonus_percentage_promotion_not_displayed_Rewards_page();
	}
	//######################################### SCSCOD-2324 ##################################################################
}
