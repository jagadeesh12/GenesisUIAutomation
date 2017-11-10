package com.dw.automation.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface ILoginPage {

	void launchPage();

	void doLogin(String username, String password, boolean isRemember);
	
	void doLogin_specificSchool(String username, String password, boolean isRemember);
	
	void navigateToCreateAccountPage();
    
    void waitForPageLoad();

	boolean isUserLoggedIn();

	boolean isPageActive();

	void userClicksForgotAccountInfo();
	
    void verifyUnauthenticatedHomePage();
	
	void Select_School();
	
	WebElement getTxtUsername();

	WebElement getTxtPassword();

    WebElement getchkpasswordCharacter();
	
	List<WebElement> chkdrpSelectSchool();

	WebElement getBtnSignOn();
	
	WebElement getSelectSchool();
	
	WebElement getdrpSelectSchool();
	
	WebElement getbtnNext();

    WebElement gettxtInsidePasswordbox();
	
	List<WebElement> getProfileModel_DialogBoxs();
	
	List<WebElement> getProfilewindow_Role_EditBtnsize();
	
	WebElement getProfilewindow_Role_EditBtn();
	
	WebElement getEditRole_SaveBtn();
	
	List<WebElement> getEditRole_SaveBtnsize();
	
	WebElement getEditProfile_Continue_Site_Button();
	
	WebElement getEditRole_SelectRole_Dropdown();
	
	WebElement getEditRole_SelectTitle_Dropdown();
	
	void closeButton_in_LoginPage();
	
	void DontShowAgainButton_in_LoginPage();

	void doLogin2(String username, String password, boolean isRemember);

    void doLogin3(String username, String password, boolean isRemember);
    
    void enterUn(String username);
	
	void doLogin_invalid(String username, String password, boolean isRemember);
	
	void clickOn_Enter_ClassRoom_Order();

	void clickOn_TeacherDesk_HomePage();

	void clickOn_Envelope_in_HomePage();

	void user_clicks_on_MyAccount_in_HomePage();

	List<WebElement> sizeTxtUsername();

	void Verify_LoginPagePresent();

	void LoginValidation_EmptyPassword();

	void doLogin_PasswordBlank(String username, boolean isRemember);

	void doLogin_UserNameBlank(String password, boolean isRemember);

	void LoginValidation_EmptyUserName();

	void Invalid_Login_ErrorMsg_Check();

	void LoginValidation_OnlyEmptyUserName();

    void validateRememberUserName_autopopulated();

    void validateRememberUserName_autopopulated1();

    void unchecked_RememberMe_LoginPage();

    void verifypasswordHidden();

    void verifyShow_passwordbox();

    void verifyHide_passwordbox();

    void clickShowInPasswordBox();

    void clickHideInPasswordBox();

    void validateEnteredPassword();

    void validatePasswordisencrypted();

	WebElement getActivateAccPopup();
	
	WebElement getAccountNo();
	
	WebElement getButtonNext();
	
	WebElement getForgotPasswordPopup();
	
	WebElement getBtn_Close_ForogotPasswordModal();
	
	WebElement getAccountNotFoundPopup();
	
	WebElement getBtn_Back_AccNotFnd();
	
	WebElement getInvalidAccNo();
	
	void verify_ActivateAccountModal();
	
	void enterAcctNumber(String ac);
	
	void click_btn_AccModalNext();
	
	void verify_ForgotPasswordModal();
	
	void click_btn_Close_ForgotPassWrdModal();
	
	void verify_AccountNotFoundPopup();
	
	void click_btn_Back_AccNotFndModal();
	
	String getvalue_Invalid_AccNo();
	
    void doLogin_credentials_Input(String username, String password, boolean isRemember);
	
	void doLogin_LoginBtn();
	
	void International_User_ErrorMsg_Check();
	
	void click_ActivateYourAccountBtn();
	
	void enterActivateAccount_clickNext(String internationalactnumber);

	void CSR_enters_Username_in_UNameField();

	void CSR_enters_Password_in_pwd_Field();

	void CSR_clicks_on_Enter_button_SignInPage();

	void verify_CSR_Home_Page_is_displayed();

	void CSR_clicks_on_UNameField_CSR_LoginPage();

	void validate_Enter_button_is_disabled_in_CSR_Login_Page();

	void CSR_clicks_on_pwd_Field_CSR_LoginPage();

	void validate_Enter_button_is_enabled_in_CSR_Login_Page();

	void verify_error_message_when_enter_Invalid_creds_CSR_Login_Page();

	void CSR_clicks_on_outside_in_loginPage();

	void verify_error_message_when_enter_lessthan_min_chars_in_pwd_CSR_Login_Page();

	void CSR_doLogin();

	void Validate_CSR_is_presented_with_the_user_authentication_page();

	void Validate_the_label_of_Uname_in_CSR_loginPage();

	void Validate_the_label_of_Password_in_CSR_loginPage();

	void Validate_the_label_of_ENTER_in_CSR_loginPage();

	void Login_driver(String username, String password, boolean isRemember);

	void verify_hintfield_accountactivation_notpresent();

	List<WebElement> getaccountactivationaccnumberhintfield();

	List<WebElement> getbtnAcctActivate_Disabled_Next();

	void verify_btn_AccModalNext_Disabled();

	WebElement getEmail_ActivateAccount();

	void enter_emailField_AcctNumber(String string);

	void verify_AccountNotFoundPopup_EmailNotAssociatedMsg();

	void verify_backbutton_AccountNotFoundPopup();

	void verify_AccountNotFoundPopup_EmailAssociatedMsg();

	void verify_AccountActivation_ErrorToolTip();

	void CSR_openPage();

	void CSR_launchPage();

	void teacher_clicks_on_ActivateYourAccount_SignIn_page();

	void teacher_enters_AC_num_in_ActivateYourAccount_modal_window();

	void teacher_enters_mail_id_in_ActivateYourAccount_modal_window();

	void teacher_clicks_on_NEXT_button_in_ActivateYourAccount_modal_window();

	void teacher_validate_Account_Not_Found_modal_window_displayed();

	void teacher_verify_Account_Not_Found_modal_window_header();

	void teacher_verify_link_Forgot_AC_num_mail_displayed_in_Account_Not_Found();

	void teacher_verify_close_btn_displayed_in_Account_Not_Found();

	void teacher_verify_BACK_btn_enabled_in_Account_Not_Found();

	void teacher_verify_Email_Not_Match_modal_window_header();

	void teacher_clicks_on_BACK_btn_Activation_fail_window();

	void teacher_verify_window_Activate_Your_Account_displayed();

	void teacher_clicks_on_Forgot_login_info_link_loginPage();

	void teacher_clicks_on_Forgot_AcNum_Email_link_in_Forgot_pwd_window_loginPage();

	void teacher_verify_ForgotAccountNum_And_EmailAddr_link_displayed_ActivateWindow();

	void teacher_verify_NEXT_btn_disabled_in_ActivateWindow();

	void teacher_clicks_on_AcNum_fld_question_icon_in_ActivateWindow();

	void teacher_clicks_on_Email_fld_question_icon_in_ActivateWindow();

	void teacher_verify_tooltip_txt_AcNum_fld_in_ActivateWindow();

	void teacher_verify_tooltip_txt_Email_fld_in_ActivateWindow();

	void teacher_enters_Uname_and_pwd(String username, String password);

	void teacher_enters_pwd();

	void teacher_enters_AcNum_Email_Forgot_Login_window();

	void teacher_verify_error_tooltip_AcNum_Email_Forgot_Login_window();

	void teacher_verify_AcNum_Email_fld_highlights_Yellow_color_Forgot_Login_window();

	void teacher_enters_Fname_Forgot_Login_window();

	void teacher_enters_Lname_Forgot_Login_window();

	void teacher_verify_CONTINUE_btn_disabled_Forgot_Login_window();

	void teacher_verify_Lname_fld_chars_Forgot_Login_window();

	void teacher_verify_Fname_fld_chars_Forgot_Login_window();

	void teacher_verify_Fname_fld_highlights_Yellow_color_Forgot_Login_window();

	void teacher_verify_Lname_fld_highlights_Yellow_color_Forgot_Login_window();

	void teacher_verify_CONTINUE_btn_enabled_Forgot_Login_window();

	void teacher_verify_minChar_length_toolTip_displayed_Fname_Forgot_Login_window();

	void teacher_verify_minChar_length_toolTip_displayed_Lname_Forgot_Login_window();

	void teacher_verify_toolTip_not_display_Fname_Forgot_Login_window();

	void teacher_verify_toolTip_not_display_Lname_Forgot_Login_window();

	void teacher_verify_ErrorMsg_for_Invalid_creds_LoginPage();

	void teacher_verify_Uname_AcNum_fld_highlights_Yellow_color_Main_LoginPage();

	void teacher_verify_Pwd_fld_highlights_Yellow_color_Main_LoginPage();

	void teacher_verify_error_tooltip_AcNum_Email_Main_Login_page();

	void teacher_verify_error_tooltip_AcNum_Email_for_empty_fld_Main_Login_page();

	void teacher_enters_Username_or_Email_Main_Login_page();

	void teacher_verify_error_tooltip_for_pwd_fld_empty_Main_Login_page();

	void teacher_verify_Home_page_displayed();

	void teacher_enters_Username_or_Email_and_clicks_on_outside_Main_Login_page();

	void openPage2();

	void launchPage2();

    void BM_launchPage();

    void BM_openPage();

    void click_RememberMe_LoginPage();

	void verify_AccountNumber_Placeholder();

	void verify_AccountPassword_Placeholder();

	void teacher_navigate_to_SFO();

	void Wait_for_invisibility_of_locator();

	void teacher_navigates_to_YTO();

	void teacher_clicks_on_SFO_tab_YTO_page();

	void verify_create_account_firstname_is_saved();

	void doLogin4(String username, String password, boolean isRemember);

	WebElement getTCODPCODhomepage();

	void verifyTCODHomepgae();

	WebElement getTCODPCODloginpage();

	void verifySearchBarDisplayed();

	void teacher_navigate_to_SOO();

	void enter_Uname(String username);

	void enter_Pwd(String password);

	void click_on_Login_btn();

	void doLogin5(String username, String password, boolean isRemember);

}
