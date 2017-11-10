package com.dw.automation.pages.impl;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.dw.automation.pages.BasePage;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestPage;
import com.scholastic.torque.common.WaitUtils;

public class BasePageImpl extends BaseTestPage<TestPage> implements BasePage {

	// WebDriver driver;

	@FindBy(locator = "dw.home.button.HomeButton")
	private WebElement homeButton_HomePage;
	@FindBy(locator = "dw.home.popup.closeButton")
	private WebElement closeButton_PopUp;
	@FindBy(locator = "dw.home.button.MiniCart")
	private WebElement miniCart_Button_HomePage;
	@FindBy(locator = "dw.home.header.HomePage")
	private WebElement header_HomePage;
	@FindBy(locator = "dw.home.dropdown.MyAccount")
	private WebElement MyAccount_HomePage;
	@FindBy(locator = "dw.home.button.SignOut")
	private WebElement SignOut_HomePage;
	@FindBy(locator = "dw.selection.paymentMethod")
	private WebElement Payment_method_selection;
	@FindBy(locator = "dw.paymentMethod.CreditCard")
	private WebElement Payment_method_credit_card;
	@FindBy(locator = "dw.RewardsCoupons.No.OfStudents")
	private WebElement No_OfStudents_RewardsCoupons;
	@FindBy(locator = "dw.RewardsCoupons.ContinueCheckout")
	private WebElement ContinueCheckout_RewardsCoupons;
	@FindBy(locator = "dw.Checkout.ShippingPayment")
	private WebElement Shipping_and_Payment_Checkout;
	@FindBy(locator = "dw.ShippingPayment.ContinueCheckout")
	private WebElement Continue_checkout_in_Shipping_and_Payment;
	@FindBy(locator = "dw.Login.UsernameField")
	private WebElement Enter_username;
	@FindBy(locator = "dw.Login.PasswordField")
	private WebElement Enter_password;
	@FindBy(locator = "dw.Login.button.enter")
	private WebElement Enter_login_button;
	@FindBy(locator = "dw.SecurityCode.Checkout.ShippingPayment")
	private WebElement SecurityCode_Checkout_ShippingPayment;
	@FindBy(locator = "dw.home.popup.closeButton.parent")
	private WebElement closeButton_popUp_home_parent;
	@FindBy(locator = "dw.home.field.EnterItem")
	private WebElement EnterItem_field_home;
	@FindBy(locator = "dw.home.button.AddToCart")
	private WebElement AddToCart_button_home;
	@FindBy(locator = "dw.cart.button.GoToCheckout")
	private WebElement GoToCheckout_button_Cart;
	@FindBy(locator = "dw.Reviewcart.checkout.proceed")
	private WebElement proceed_checkout_Reviewcart;
	@FindBy(locator = "dw.cc.enterCard.field")
	private WebElement CC_enterCard_field;
	@FindBy(locator = "dw.selection.cardType")
	private WebElement Select_cardType;
	@FindBy(locator = "dw.cardType.AddNewCard")
	private WebElement Crad_type_as_AddNewCard;
	@FindBy(locator = "dw.header.confirm.submit")
	private WebElement header_confirm_submit;
	@FindBy(locator = "dw.header.order.successfulMessage")
	private WebElement header_order_successfulMessage;
	@FindBy(locator = "dw.home.menu.icon.phone")
	private WebElement home_menu_icon_phone;
	@FindBy(locator = "dw.home.BonusPointBank.field")
	private WebElement field_bonus_point_bank;

	////////////////////////////////////////////////////////////
	/*
	 * public BasePageImpl2(WebDriver driver){
	 * this.driver=driver;
	 * }
	 */

	public WebElement home_button_HomePage() {
		return homeButton_HomePage;
	}
	public WebElement close_Button_PopUp() {
		return closeButton_PopUp;
	}
	public WebElement mini_Cart_Button_HomePage() {
		return miniCart_Button_HomePage;
	}
	public WebElement header_in_HomePage() {
		return header_HomePage;
	}
	public WebElement MyAccount_in_HomePage() {
		return MyAccount_HomePage;
	}
	public WebElement SignOut_in_HomePage() {
		return SignOut_HomePage;
	}
	public WebElement Payment_method_selection() {
		return Payment_method_selection;
	}
	public WebElement Payment_method_credit_card() {
		return Payment_method_credit_card;
	}
	public WebElement No_OfStudents_RewardsCoupons() {
		return No_OfStudents_RewardsCoupons;
	}
	public WebElement ContinueCheckout_RewardsCoupons() {
		return ContinueCheckout_RewardsCoupons;
	}
	public WebElement Shipping_and_Payment_Checkout() {
		return Shipping_and_Payment_Checkout;
	}
	public WebElement Continue_checkout_in_Shipping_and_Payment() {
		return Continue_checkout_in_Shipping_and_Payment;
	}
	public WebElement Enter_username() {
		return Enter_username;
	}
	public WebElement Enter_password() {
		return Enter_password;
	}
	public WebElement Enter_login_button() {
		return Enter_login_button;
	}
	public WebElement SecurityCode_Checkout_ShippingPayment() {
		return SecurityCode_Checkout_ShippingPayment;
	}
	public WebElement closeButton_popUp_home_parent() {
		return closeButton_popUp_home_parent;
	}
	public WebElement EnterItem_field_home() {
		return EnterItem_field_home;
	}
	public WebElement AddToCart_button_home() {
		return AddToCart_button_home;
	}
	public WebElement GoToCheckout_button_Cart() {
		return GoToCheckout_button_Cart;
	}
	public WebElement proceed_checkout_Reviewcart() {
		return proceed_checkout_Reviewcart;
	}
	public WebElement CC_enterCard_field() {
		return CC_enterCard_field;
	}
	public WebElement Select_cardType() {
		return Select_cardType;
	}
	public WebElement Crad_type_as_AddNewCard() {
		return Crad_type_as_AddNewCard;
	}
	public WebElement header_confirm_submit() {
		return header_confirm_submit;
	}
	public WebElement header_order_successfulMessage() {
		return header_order_successfulMessage;
	}
	public WebElement home_menu_icon_phone() {
		return home_menu_icon_phone;
	}
	public WebElement field_bonus_point_bank() {
		return field_bonus_point_bank;
	}
	////////////////////////////////////////////////////////////

	@Override
	protected void openPage() {
		// TODO Auto-generated method stub
	}

	@Override
	public void user_Click_On_Home_button_in_HomePage() {
		home_button_HomePage().click();

	}
	@Override
	public void user_Click_On_closeButton_PopUp() {
		try {
			if (close_Button_PopUp().isDisplayed()) {
				close_Button_PopUp().click();
			} /*
				 * else if (closeButton_popUp_home_parent().isDisplayed()) {
				 * closeButton_popUp_home_parent().click();
				 * }
				 */
		} catch (Exception e) {
			header_in_HomePage().isDisplayed();
		}

	}
	@Override
	public void user_Click_On_mini_Cart_Button_in_HomePage() {
		mini_Cart_Button_HomePage().click();

	}
	@Override
	public boolean is_header_HomePage_Displayed() {
		if (header_in_HomePage().isDisplayed())
			return true;
		else return false;
	}
	@Override
	public void user_Click_On_MyAccount_in_HomePage() {
		WaitUtils.waitForDisplayed(MyAccount_in_HomePage());
		MyAccount_in_HomePage().click();

	}
	@Override
	public void user_signOut_from_HomePage() {
		WaitUtils.waitForDisplayed(SignOut_in_HomePage());
		SignOut_in_HomePage().click();
	}
	@Override
	public void user_click_on_payment_method() {
		Payment_method_selection().click();
	}
	@Override
	public void user_choose_payment_method() {
		Payment_method_credit_card().click();
	}
	@Override
	public void enter_no_of_students_Rewards_Coupons(String value) {
		try {
			if (No_OfStudents_RewardsCoupons().isDisplayed()) {
				No_OfStudents_RewardsCoupons().sendKeys(value);
			}
		} catch (Exception e) {
			System.out.println("Not a mandotory to enter students in bonus field");
		}
	}
	@Override
	public void user_click_on_continueCheckout_in_Rewards_Coupons() {
		ContinueCheckout_RewardsCoupons().click();
	}
	@Override
	public void user_click_on_shipping_Payment_in_Checkout() {
		Shipping_and_Payment_Checkout().click();
	}
	@Override
	public void user_click_on_Continue_checkout_in_shipping_Payment() {
		Continue_checkout_in_Shipping_and_Payment().click();
	}
	@Override
	public void user_enter_username_field(String uname) {
		Enter_username().sendKeys(uname);
	}
	@Override
	public void user_enter_password_field(String pwd) {
		Enter_password().sendKeys(pwd);
	}
	@Override
	public void user_click_on_enter_to_login() {
		Enter_login_button().click();
	}
	@Override
	public void user_enter_securityCode(String code) {
		SecurityCode_Checkout_ShippingPayment().sendKeys(code);
	}
	@Override
	public void user_Click_On_closeButton_PopUp_parent() {
		closeButton_popUp_home_parent().click();
	}
	@Override
	public void enter_item_in_field(String item) {
		EnterItem_field_home().sendKeys(item);
	}
	@Override
	public void user_Click_On_AddToCart_in_home() {
		AddToCart_button_home().click();
	}
	@Override
	public void user_Click_On_GoToCheckout() {
		GoToCheckout_button_Cart().click();
	}
	@Override
	public void user_Click_On_proceed_CheckOut_in_Review() {
		proceed_checkout_Reviewcart().click();
	}
	@Override
	public void user_enter_creditCard_num(String num) {
		CC_enterCard_field().clear();
		CC_enterCard_field().sendKeys(num);
	}
	@Override
	public void user_click_on_card_type() {
		Select_cardType().click();
	}
	@Override
	public void user_select_card_type_as() {
		Crad_type_as_AddNewCard().click();
	}
	@Override
	public boolean is_header_confirm_submit_displayed() {
		if (header_confirm_submit().isDisplayed())
			return true;
		else return false;
	}
	@Override
	public boolean is_header_successfful_order_displayed() {
		if (header_order_successfulMessage().isDisplayed())
			return true;
		else return false;
	}
	@Override
	public void user_click_on_Home_menu_icon_phone() {
		home_menu_icon_phone().click();
	}
	@Override
	public void value_of_Bonus_point_bank() {
		String value = field_bonus_point_bank().getText();
		String expected = "-1";
		Assert.assertNotEquals("Bonus Point Bank value is -1", value, expected);

	}

}
