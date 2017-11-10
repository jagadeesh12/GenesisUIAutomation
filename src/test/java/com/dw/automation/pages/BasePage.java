package com.dw.automation.pages;

public interface BasePage {
	
	void user_Click_On_Home_button_in_HomePage();
	
	void user_Click_On_closeButton_PopUp();
	
	void user_Click_On_mini_Cart_Button_in_HomePage();
	
	boolean is_header_HomePage_Displayed();
	
	void user_Click_On_MyAccount_in_HomePage();
	
	void user_signOut_from_HomePage();
	
	void user_click_on_payment_method();
	
	void user_choose_payment_method();
	
	void enter_no_of_students_Rewards_Coupons(String value);
	
	void user_click_on_continueCheckout_in_Rewards_Coupons();
	
	void user_click_on_shipping_Payment_in_Checkout();
	
	void user_click_on_Continue_checkout_in_shipping_Payment();
	
	void user_click_on_enter_to_login();

	void user_enter_username_field(String uname);

	void user_enter_password_field(String pwd);
	
	void user_enter_securityCode(String code);
	
	void user_Click_On_closeButton_PopUp_parent();
	
	void enter_item_in_field(String item);
	
	void user_Click_On_AddToCart_in_home();
	
	void user_Click_On_GoToCheckout();
	
	void user_Click_On_proceed_CheckOut_in_Review();
	
	void user_enter_creditCard_num(String num);
	
	void user_click_on_card_type();
	
	void user_select_card_type_as();
	
	boolean is_header_confirm_submit_displayed();
	
	boolean is_header_successfful_order_displayed();
	
	void user_click_on_Home_menu_icon_phone();
	
	void value_of_Bonus_point_bank();

}
