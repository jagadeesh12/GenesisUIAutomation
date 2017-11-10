package com.dw.automation.pages.impl;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.dw.automation.pages.ILoginPage;
import com.dw.automation.pages.IStudentFlyerOrdersPage;
import com.dw.automation.pages.ITeachersHomePage;
import com.dw.automation.steps.TeacherCart.TeacherCartSteps;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;
import com.scholastic.torque.common.WaitUtils;

public class LoginPage extends BaseTestPage<TestPage> implements ILoginPage {

	@FindBy(locator = "dw.home.lbl.title")
	private WebElement lblPageTitle;

	@FindBy(locator = "dw.home.txt.username")
	private WebElement txtUsername;

	@FindBy(locator = "dw.home.txt.username")
	private List<WebElement> sizeTxtUsername;

	@FindBy(locator = "dw.home.txt.password")
	private WebElement txtPassword;

	@FindBy(locator = "dw.home.btn.signon")
	private WebElement btnSignOn;

	@FindBy(locator = "dw.home.school.drpselectschool")
	private WebElement drpSelectSchool;

	@FindBy(locator = "dw.home.school.drpselectschool")
	private List<WebElement> chkSelectSchool;

	@FindBy(locator = "dw.home.school.selectschool")
	private WebElement SelectSchool;

	@FindBy(locator = "dw.home.school.btn.Next")
	private WebElement btnNext;

	@FindBy(locator = "dw.home.school.btn.ProfileModel_DialogBoxs")
	private List<WebElement> ProfileModel_DialogBoxs;

	@FindBy(locator = "dw.home.school.btn.EditProfile_Continue_Site_Button")
	private WebElement EditProfile_Continue_Site_Button;

	@FindBy(locator = "dw.home.school.btn.EditRole_SelectRole_Dropdown")
	private WebElement EditRole_SelectRole_Dropdown;

	@FindBy(locator = "dw.home.school.drp.EditRole_SelectTitle_Dropdown")
	private WebElement EditRole_SelectTitle_Dropdown;

	@FindBy(locator = "dw.home.school.drp.Profilewindow_Role_EditBtnsize")
	private List<WebElement> Profilewindow_Role_EditBtnsize;

	@FindBy(locator = "dw.home.school.btn.Profilewindow_Role_EditBtn")
	private WebElement Profilewindow_Role_EditBtn;

	@FindBy(locator = "dw.home.school.btn.EditRole_SaveBtn")
	private WebElement EditRole_SaveBtn;

	@FindBy(locator = "dw.home.school.btn.EditRole_SaveBtnSize")
	private List<WebElement> EditRole_SaveBtnSize;


	@FindBy(locator = "dw.home.btn.createaccount")
	private WebElement btnCreateAccount;

	@FindBy(locator = "dw.home.btn.connecttoyourteacher")
	private WebElement btnConnectToYourTeacher;

	@FindBy(locator = "dw.home.chk.rememberme")
	private WebElement chkRememberMe;



	@FindBy(locator = "dw.home.dwn.myaccount")
	private WebElement drpMyAccount;

	@FindBy(locator = "dw.home.lnk.forgotaccount")
	private WebElement lnkForgotAccount;

	@FindBy(locator = "dw.home.fld.Username.CSR.LoginPage")
	private WebElement fld_Username_CSR_LoginPage;

	@FindBy(locator = "dw.home.fld.password.CSR.LoginPage")
	private WebElement fld_password_CSR_LoginPage;

	@FindBy(locator = "dw.home.section.Password.OnClick.CSR.LoginPage")
	private WebElement section_Password_OnClick_CSR_LoginPage;

	@FindBy(locator = "dw.home.btn.ENTER.CSR.LoginPage")
	private WebElement Enter_button_CSR_SignInPage;

	@FindBy(locator = "dw.home.lbl.of.Username.CSR.LoginPage")
	private WebElement lbl_of_Username_CSR_LoginPage;

	@FindBy(locator = "dw.home.lbl.of.Password.CSR.LoginPage")
	private WebElement lbl_of_Password_CSR_LoginPage;

	@FindBy(locator = "dw.home.section.CSR.LoginPage")
	private WebElement CSR_LoginPage_section;

	@FindBy(locator = "dw.home.Error.message.Pwd.field.CSR.LoginPage")
	private WebElement Error_message_Pwd_field_CSR_LoginPage;

	@FindBy(locator = "dw.home.CSR.Home.Page.OrderType")
	private WebElement CSR_Home_Page_OrderType;

	@FindBy(locator = "dw.home.lbl.welcometitle")
	private WebElement lblWelcomeTitle;

	@FindBy(locator = "dw.home.button.Activate.Your.Account.LogiinPage")
	private WebElement button_Activate_Your_Account_LogiinPage;

	@FindBy(locator = "dw.home.lnk.bookmarkthispage")
	private WebElement lnkBookmarkThisPage;

	@FindBy(locator = "dw.home.lnk.closepopup")
	private WebElement lnkIconClosePopUp;

	@FindBy(locator = "dw.teachers.home.btn.closeIcon")
	private WebElement btnTeacherHomeCloseIcon;

	@FindBy(locator = "dw.home.btn.closepopup")
	private WebElement btnCloseinLoginPage;

	@FindBy(locator = "dw.home.MyAccount")
	private WebElement MyAccount_HomePage;

	@FindBy(locator = "dw.home.MyAccount.Profile")
	private WebElement MyAccount_Profile_HomePage;

	@FindBy(locator = "dw.teachers.home.myaccount.enter.classRoomOrder")
	private WebElement Enter_ClassRoom_Order;
	
	@FindBy(locator = "dw.teachers.home.myaccount.enter.classRoomOrder")
	private List<WebElement> sizeEnter_ClassRoom_Order;

	@FindBy(locator = "dw.teachers.home.tab.SFO")
	private WebElement tab_SFO;
	
	@FindBy(locator = "dw.teachers.home.tab.SOO")
	private WebElement tab_SOO;

	@FindBy(locator = "dw.teachers.toggle.by.Item.YTO.page")
	private WebElement toggle_by_Item_YTO_page;

	@FindBy(locator = "dw.teachers.home.globalmenu.enterorders")
	private WebElement homepage_globalmenu_enterorders;

	@FindBy(locator = "dw.teachers.home.globalmenu.enterorders.options")
	private WebElement homepage_globalmenu_enterorders_options;

	@FindBy(locator = "dw.teachers.home.Enter.TeacherDesk")
	private WebElement Enter_TeacherDesk_HomePage;

	@FindBy(locator = "dw.teachers.home.Envelope")
	private WebElement Envelope_in_HomePage;

	@FindBy(locator = "dw.home.icon.close.prod")
	private WebElement iconCloseHomePageProd;

	@FindBy(locator = "dw.home.icon.close.prod")
	private List<WebElement> sizeiconCloseHomePageProd;

	@FindBy(locator="dw.home.popup.activateAcc.modal")
	private WebElement AccountActivationModal;

	@FindBy(locator="dw.login.activateacount.accountnumber.hintlabel")
	private List<WebElement> accountactivationaccnumberhintfield;

	@FindBy(locator="dw.home.txt.activateAcc.modal.AccNo")
	private WebElement Enter_AccNo;

	@FindBy(locator="dw.home.txt.activateAcc.modal.Email")
	private WebElement Email_ActivateAccount;

	@FindBy(locator="dw.home.btn.activateAcc.modal.Next")
	private WebElement btnAcctActivate_Next;

	@FindBy(locator="dw.home.btn.activateAcc.modal.disabled.Next")
	private List<WebElement> btnAcctActivate_Disabled_Next;

	@FindBy(locator="dw.home.popup.forgotPassword.modal")
	private WebElement PopupForgotPassword;

	@FindBy(locator="dw.home.btn.close.forgotPassword.modal")
	private WebElement btn_Close_ForgotPassWrdModal;

	@FindBy(locator="dw.home.popup.AccNotFound.modal")
	private WebElement PopupAccountNotFound;

	@FindBy(locator="dw.home.popup.AccNotFound.modal.text")
	private WebElement PopupAccountNotFound_textfield;

	@FindBy(locator="dw.home.popup.AccNotFound.modal.text.emailassociatedmsg")
	private WebElement PopupAccountNotFound_EmailAssociatedMsg;

	@FindBy(locator="dw.home.popup.AccNotFound.modal.error.tooltip")
	private WebElement PopupAccountNotFound_ErrorTooltip;

	@FindBy(locator="dw.home.popup.AccNotFound.modal.error.tooltip")
	private List<WebElement> sizePopupAccountNotFound_ErrorTooltip;

	@FindBy(locator="dw.home.popup.AccNotFound.back")
	private WebElement btn_Back_AccNotFndModal;

	@FindBy(locator="dw.home.popup.AccNotFound.back")
	private List<WebElement> sizeBtn_Back_AccNotFnd;

	@FindBy(locator="dw.home.invalidAccNo")
	private WebElement btn_invalidAccNo;

	@FindBy(locator = "dw.home.btn.dontshowagain")
	private WebElement btnDontShowAgainLoginPage;

	@FindBy(locator = "dw.home.registration.role.notavailable")
	private List<WebElement> lblhomerolenotavailable;

	@FindBy(locator = "dw.home.registration.role.btn.edit")
	private WebElement btnhomeregistrationedit;

	@FindBy(locator = "dw.home.registration.role.drodwn.role")
	private WebElement drpdownhomeregistrationprimaryrole;

	@FindBy(locator = "dw.home.registration.role.drpdwn.grade")
	private WebElement drpdownhomeregistrationprimarygrade;

	@FindBy(locator = "dw.home.registration.role.input.students")
	private WebElement inputhomeregistrationstudentcount;

	@FindBy(locator = "dw.home.registration.role.btn.save")
	private WebElement btnhomeregistrationsave;

	@FindBy(locator = "dw.home.registration.role.btn.continuetosite")
	private WebElement btnhomeregistrationcontinuesite;

	@FindBy(locator = "dw.home.error.label.loginerrorbox")
	private List<WebElement> sizetooltiploginerrormsgbox;

	@FindBy(locator = "dw.home.loginpage.tooltip")
	private List<WebElement> sizetooltiploginpage;

	@FindBy(locator = "dw.home.loginpage.tooltip")
	private WebElement gettooltiploginpage;

	@FindBy(locator = "dw.home.error.label.loginerrorbox")
	private WebElement tooltiploginerrormsgbox;
	
	
	@FindBy(locator = "dw.home.error.label.loginerrorboxheader")
	private WebElement tooltiploginerrormsgboxheader;	
	
	@FindBy(locator = "dw.home.error.label.loginerrorboxmessage")
	private WebElement tooltiploginerrormsgboxmessage;
	
	@FindBy(locator = "dw.home.error.title.loginerrorbox")
	private WebElement titleloginerrormsgbox;

	@FindBy(locator = "dw.home.lnk.activateyouraccount")
	private WebElement lnkhomeactivateyouraccount;

	@FindBy(locator = "dw.home.input.activateaccountnumber")
	private WebElement inputactivateaccountnumber;

	@FindBy(locator = "dw.home.fld.email.ActivateYourAccount.modal.window")
	private WebElement fld_email_ActivateYourAccount_modal_window;

	@FindBy(locator = "dw.home.window.Account.Not.Found")
	private WebElement window_Account_Not_Found;

	@FindBy(locator = "dw.home.window.Email.Not.Match")
	private WebElement window_Email_Not_Match;

	@FindBy(locator = "dw.home.modal.window.fail.Account.Activation")
	private WebElement modal_window_fail_Account_Activation;

	@FindBy(locator = "dw.home.link.Forgot.AC.num.mail.in.Account.Not.Found")
	private WebElement link_Forgot_AC_num_mail_in_Account_Not_Found;

	@FindBy(locator = "dw.home.btn.close.in.Account.Not.Found")
	private WebElement btn_close_in_Account_Not_Found;

	@FindBy(locator = "dw.home.btn.BACK.in.Account.Not.Found")
	private WebElement btn_BACK_in_Account_Not_Found;

	@FindBy(locator = "dw.home.window.Activate.Your.Account")
	private WebElement window_Activate_Your_Account;

	@FindBy(locator = "dw.home.link.Forgot.login.info.login.page")
	private WebElement link_Forgot_login_info_login_page;

	@FindBy(locator = "dw.home.link.Forgot.Ac.num.Email.in.Forgot.pwd.window.loginPage")
	private WebElement link_Forgot_Ac_num_Email_in_Forgot_pwd_window_loginPage;

	@FindBy(locator = "dw.home.question.icon.AcNum.fld.ActicateYourAccount")
	private WebElement question_icon_AcNum_fld_ActicateYourAccount;

	@FindBy(locator = "dw.home.question.icon.Email.fld.ActicateYourAccount")
	private WebElement question_icon_Email_fld_ActicateYourAccount;

	@FindBy(locator = "dw.home.ToolTip.popup.AcNum.and.Email.flds.ActicateYourAccount")
	private WebElement ToolTip_popup_AcNum_and_Email_flds_ActicateYourAccount;

	@FindBy(locator = "dw.home.AcNum.Email.fld.ForgotYourLogin.window")
	private WebElement AcNum_Email_fld_ForgotYourLogin_window;

	@FindBy(locator = "dw.home.Fname.fld.ForgotYourLogin.window")
	private WebElement Fname_fld_ForgotYourLogin_window;

	@FindBy(locator = "dw.home.Lname.fld.ForgotYourLogin.window")
	private WebElement Lname_fld_ForgotYourLogin_window;

	@FindBy(locator = "dw.home.CONTINUE.btn.ForgotYourLogin.window")
	private WebElement CONTINUE_btn_ForgotYourLogin_window;

	@FindBy(locator = "dw.home.tooltip.Fname.min.char.ForgotYourLogin.window")
	private WebElement tooltip_Fname_min_char_ForgotYourLogin_window;

	@FindBy(locator = "dw.home.LogInError.tooltip.InvalidCreds.LoginPage")
	private WebElement LogInError_tooltip_InvalidCreds_LoginPage;

	@FindBy(locator = "dw.home.tooltip.Lname.min.char.ForgotYourLogin.window")
	private WebElement tooltip_Lname_min_char_ForgotYourLogin_window;

	@FindBy(locator = "dw.home.toolTip.AcNum.Email.ForgotYourLogin.window")
	private WebElement toolTip_AcNum_Email_ForgotYourLogin_window;

	@FindBy(locator = "dw.home.toolTip.AcNum.Email.Login.Page")
	private WebElement toolTip_AcNum_Email_Login_Page;

	@FindBy(locator = "dw.home.toolTip.for.empty.fld.AcNum.Email.Login.Page")
	private WebElement toolTip_for_empty_fld_AcNum_Email_Login_Page;

	@FindBy(locator = "dw.home.toolTip.for.empty.pwd.fld.Login.Page")
	private WebElement toolTip_for_empty_pwd_fld_Login_Page;

	@FindBy(locator = "dw.home.btn.activateaccountnumber.next")
	private WebElement btnactivateaccountnumbernext;

	@FindBy(locator = "dw.home.lnk.marketingurl")
	private WebElement lnkhomepagemarketingurl;

	@FindBy(locator = "dw.home.lnk.category.marketinglnk")
	private WebElement lnkhomepagecategorymarketinglnk;


	@FindBy(locator = "dw.home.lnk.content.marketinglnk")
	private WebElement lnkhomepagecontentmarketinglnk;

	@FindBy(locator = "dw.login.forgotpassword.modal.reg")
	private WebElement popupregistrationforgotlogin;

	@FindBy(locator = "dw.login.password.character")
	private WebElement chkpasswordCharacter;

	@FindBy(locator = "dw.login.passwordbox.text")
	private WebElement txtInsidePasswordbox;

	@FindBy(locator = "dw.TCOD.PCOD.home.page")
	private WebElement TCOD_PCOD_homepgae;
	
	@FindBy(locator = "dw.TCOD.PCOD.login.page")
	private WebElement TCOD_PCOD_login;

	@Override
	public WebElement getTCODPCODloginpage() {
		return TCOD_PCOD_login;
	}
	
	@Override
	public WebElement getTCODPCODhomepage() {
		return TCOD_PCOD_homepgae;
	}
	
	public WebElement Enter_ClassRoom_Order() {
		return Enter_ClassRoom_Order;
	}
	
	public List<WebElement> sizeEnter_ClassRoom_Order() {
		return sizeEnter_ClassRoom_Order;
	}

	public WebElement tab_SFO() {
		return tab_SFO;
	}
	
	public WebElement tab_SOO() {
		return tab_SOO;
	}

	public WebElement toggle_by_Item_YTO_page() {
		return toggle_by_Item_YTO_page;
	}

	public WebElement gethomepage_globalmenu_enterorders() {
		return homepage_globalmenu_enterorders;
	}

	public WebElement gethomepage_globalmenu_enterorders_options() {
		return homepage_globalmenu_enterorders_options;
	}

	public WebElement Enter_TeacherDesk_HomePage() {
		return Enter_TeacherDesk_HomePage;
	}

	public WebElement Envelope_in_HomePage() {
		return Envelope_in_HomePage;
	}

	public WebElement getLblPageTitle() {
		return lblPageTitle;
	}

	public WebElement getBtnTeacherHomeCloseIcon() {
		return btnTeacherHomeCloseIcon;
	}



	@Override
	public WebElement getTxtUsername() {
		return txtUsername;
	}

	@Override
	public List<WebElement> sizeTxtUsername() {
		return sizeTxtUsername;
	}

	@Override
	public WebElement getTxtPassword()
	{
		return txtPassword;
	}

	@Override
	public WebElement getchkpasswordCharacter() {
		return chkpasswordCharacter;
	}

	@Override
	public WebElement getBtnSignOn() {
		return btnSignOn;
	}

	@Override
	public List<WebElement> chkdrpSelectSchool() {
		return chkSelectSchool;
	}

	@Override
	public WebElement getdrpSelectSchool() {
		return drpSelectSchool;
	}

	@Override
	public WebElement getSelectSchool() {
		return SelectSchool;
	}

	@Override
	public WebElement getbtnNext() {
		return btnNext;
	}

	@Override
	public WebElement gettxtInsidePasswordbox() {
		return txtInsidePasswordbox;
	}

	@Override
	public List<WebElement> getProfileModel_DialogBoxs() {
		return ProfileModel_DialogBoxs;
	}

	@Override
	public List<WebElement> getProfilewindow_Role_EditBtnsize() {
		return Profilewindow_Role_EditBtnsize;
	}

	@Override
	public WebElement getProfilewindow_Role_EditBtn() {
		return Profilewindow_Role_EditBtn;
	}

	@Override
	public WebElement getEditRole_SaveBtn() {
		return EditRole_SaveBtn;
	}

	@Override
	public List<WebElement> getEditRole_SaveBtnsize() {
		return EditRole_SaveBtnSize;
	}

	@Override
	public WebElement getEditProfile_Continue_Site_Button() {
		return EditProfile_Continue_Site_Button;
	}


	@Override
	public WebElement getEditRole_SelectRole_Dropdown() {
		return EditRole_SelectRole_Dropdown;
	}

	@Override
	public WebElement getEditRole_SelectTitle_Dropdown() {
		return EditRole_SelectTitle_Dropdown;
	}

	public WebElement getBtnCreateAccount() {
		return btnCreateAccount;
	}

	public WebElement getBtnConnectToYourTeacher() {
		return btnConnectToYourTeacher;
	}

	public WebElement getChkRememberMe() {
		return chkRememberMe;
	}

	public WebElement getDrpMyAccount() {
		return drpMyAccount;
	}

	public WebElement getLnkForgotAccount() {
		return lnkForgotAccount;
	}

	public WebElement fld_Username_CSR_LoginPage() {
		return fld_Username_CSR_LoginPage;
	}

	public WebElement fld_password_CSR_LoginPage() {
		return fld_password_CSR_LoginPage;
	}

	public WebElement section_Password_OnClick_CSR_LoginPage() {
		return section_Password_OnClick_CSR_LoginPage;
	}

	public WebElement Enter_button_CSR_SignInPage() {
		return Enter_button_CSR_SignInPage;
	}

	public WebElement button_Activate_Your_Account_LogiinPage() {
		return button_Activate_Your_Account_LogiinPage;
	}

	public WebElement lbl_of_Username_CSR_LoginPage() {
		return lbl_of_Username_CSR_LoginPage;
	}

	public WebElement lbl_of_Password_CSR_LoginPage() {
		return lbl_of_Password_CSR_LoginPage;
	}

	public WebElement CSR_LoginPage_section() {
		return CSR_LoginPage_section;
	}

	public WebElement Error_message_Pwd_field_CSR_LoginPage() {
		return Error_message_Pwd_field_CSR_LoginPage;
	}

	public WebElement CSR_Home_Page_OrderType() {
		return CSR_Home_Page_OrderType;
	}

	public WebElement getLblWelcomeTitle() {
		return lblWelcomeTitle;
	}

	public WebElement getLnkBookmarkThisPage() {
		return lnkBookmarkThisPage;
	}

	public WebElement btnCloseinLoginPage() {
		return btnCloseinLoginPage;
	}

	public WebElement MyAccount_HomePage() {
		return MyAccount_HomePage;
	}
	
	public WebElement ToolTipLoginErrorMsgBoxHeader() {
		return tooltiploginerrormsgboxheader;
	}
	
	public WebElement ToolTipLoginErrorMsgBoxMessage() {
		return tooltiploginerrormsgboxmessage;
	}

	public WebElement MyAccount_Profile_HomePage() {
		return MyAccount_Profile_HomePage;
	}

	public List<WebElement> sizelblhomerolenotavailable() {
		return lblhomerolenotavailable;
	}

	public WebElement btnhomeregistrationedit() {
		return btnhomeregistrationedit;
	}

	public WebElement getdrpdownhomeregistrationprimaryrole() {
		return drpdownhomeregistrationprimaryrole;
	}

	public WebElement getdrpdownhomeregistrationprimarygrade() {
		return drpdownhomeregistrationprimarygrade;
	}

	public WebElement getinputhomeregistrationstudentcount() {
		return inputhomeregistrationstudentcount;
	}

	public WebElement btnhomeregistrationsave() {
		return btnhomeregistrationsave;
	}

	public WebElement btnhomeregistrationcontinuesite() {
		return btnhomeregistrationcontinuesite;
	}

	public WebElement btnDontShowAgainLoginPage() {
		return btnDontShowAgainLoginPage;
	}

	public List<WebElement> sizetooltiploginerrormsgbox() {
		return sizetooltiploginerrormsgbox;
	}

	public List<WebElement> sizetooltiploginpage() {
		return sizetooltiploginpage;
	}

	public WebElement gettooltiploginpage() {
		return gettooltiploginpage;
	}

	public WebElement gettooltiploginerrormsgbox() {
		return tooltiploginerrormsgbox;
	}

	public WebElement gettitleloginerrormsgbox() {
		return titleloginerrormsgbox;
	}

	public WebElement getlnkhomeactivateyouraccount() {
		return lnkhomeactivateyouraccount;
	}

	public WebElement getinputactivateaccountnumber() {
		return inputactivateaccountnumber;
	}

	public WebElement fld_email_ActivateYourAccount_modal_window() {
		return fld_email_ActivateYourAccount_modal_window;
	}

	public WebElement window_Account_Not_Found() {
		return window_Account_Not_Found;
	}

	public WebElement window_Email_Not_Match() {
		return window_Email_Not_Match;
	}

	public WebElement modal_window_fail_Account_Activation() {
		return modal_window_fail_Account_Activation;
	}

	public WebElement link_Forgot_AC_num_mail_in_Account_Not_Found() {
		return link_Forgot_AC_num_mail_in_Account_Not_Found;
	}

	public WebElement btn_close_in_Account_Not_Found() {
		return btn_close_in_Account_Not_Found;
	}

	public WebElement btn_BACK_in_Account_Not_Found() {
		return btn_BACK_in_Account_Not_Found;
	}

	public WebElement window_Activate_Your_Account() {
		return window_Activate_Your_Account;
	}

	public WebElement link_Forgot_login_info_login_page() {
		return link_Forgot_login_info_login_page;
	}

	public WebElement link_Forgot_Ac_num_Email_in_Forgot_pwd_window_loginPage() {
		return link_Forgot_Ac_num_Email_in_Forgot_pwd_window_loginPage;
	}

	public WebElement question_icon_AcNum_fld_ActicateYourAccount() {
		return question_icon_AcNum_fld_ActicateYourAccount;
	}

	public WebElement question_icon_Email_fld_ActicateYourAccount() {
		return question_icon_Email_fld_ActicateYourAccount;
	}

	public WebElement ToolTip_popup_AcNum_and_Email_flds_ActicateYourAccount() {
		return ToolTip_popup_AcNum_and_Email_flds_ActicateYourAccount;
	}

	public WebElement AcNum_Email_fld_ForgotYourLogin_window() {
		return AcNum_Email_fld_ForgotYourLogin_window;
	}

	public WebElement Fname_fld_ForgotYourLogin_window() {
		return Fname_fld_ForgotYourLogin_window;
	}

	public WebElement Lname_fld_ForgotYourLogin_window() {
		return Lname_fld_ForgotYourLogin_window;
	}

	public WebElement CONTINUE_btn_ForgotYourLogin_window() {
		return CONTINUE_btn_ForgotYourLogin_window;
	}

	public WebElement tooltip_Fname_min_char_ForgotYourLogin_window() {
		return tooltip_Fname_min_char_ForgotYourLogin_window;
	}

	public WebElement LogInError_tooltip_InvalidCreds_LoginPage() {
		return LogInError_tooltip_InvalidCreds_LoginPage;
	}

	public WebElement tooltip_Lname_min_char_ForgotYourLogin_window() {
		return tooltip_Lname_min_char_ForgotYourLogin_window;
	}

	public WebElement toolTip_AcNum_Email_ForgotYourLogin_window() {
		return toolTip_AcNum_Email_ForgotYourLogin_window;
	}

	public WebElement toolTip_AcNum_Email_Login_Page() {
		return toolTip_AcNum_Email_Login_Page;
	}

	public WebElement toolTip_for_empty_fld_AcNum_Email_Login_Page() {
		return toolTip_for_empty_fld_AcNum_Email_Login_Page;
	}

	public WebElement toolTip_for_empty_pwd_fld_Login_Page() {
		return toolTip_for_empty_pwd_fld_Login_Page;
	}

	public WebElement getbtnactivateaccountnumbernext() {
		return btnactivateaccountnumbernext;
	}

	public WebElement getlnkhomepagemarketingurl() {
		return lnkhomepagemarketingurl;
	}

	public WebElement getlnkhomepagecategorymarketinglnk() {
		return lnkhomepagecategorymarketinglnk;
	}

	public WebElement getlnkhomepagecontentmarketinglnk() {
		return lnkhomepagecontentmarketinglnk;
	}

	public WebElement getpopupregistrationforgotlogin() {
		return popupregistrationforgotlogin;
	}

	public WebElement getInvalidAccNo(){
		return btn_invalidAccNo;
	}

	public WebElement getForgotPasswordPopup(){
		return PopupForgotPassword;
	}

	public WebElement getBtn_Close_ForogotPasswordModal(){
		return btn_Close_ForgotPassWrdModal;
	}

	public WebElement getAccountNotFoundPopup(){
		return PopupAccountNotFound;
	}

	public WebElement getPopupAccountNotFound_textfield(){
		return PopupAccountNotFound_textfield;
	}

	public WebElement getPopupAccountNotFound_EmailAssociatedMsg(){
		return PopupAccountNotFound_EmailAssociatedMsg;
	}

	public WebElement getPopupAccountNotFound_ErrorTooltip(){
		return PopupAccountNotFound_ErrorTooltip;
	}

	public List<WebElement> sizePopupAccountNotFound_ErrorTooltip(){
		return sizePopupAccountNotFound_ErrorTooltip;
	}


	public WebElement getBtn_Back_AccNotFnd(){
		return btn_Back_AccNotFndModal;
	}

	public List<WebElement> sizeBtn_Back_AccNotFnd(){
		return sizeBtn_Back_AccNotFnd;
	}

	@Override
	public WebElement getActivateAccPopup(){
		return AccountActivationModal;
	}

	@Override
	public List<WebElement> getaccountactivationaccnumberhintfield(){
		return accountactivationaccnumberhintfield;
	}

	@Override
	public WebElement getAccountNo(){
		return Enter_AccNo;
	}

	@Override
	public WebElement getEmail_ActivateAccount(){
		return Email_ActivateAccount;
	}

	@Override
	public WebElement getButtonNext(){
		return btnAcctActivate_Next;
	}

	@Override
	public List<WebElement> getbtnAcctActivate_Disabled_Next(){
		return btnAcctActivate_Disabled_Next;
	}


	public WebElement geticonCloseHomePageProd() {
		return iconCloseHomePageProd;
	}

	public List<WebElement> sizeiconCloseHomePageProd() {

		return sizeiconCloseHomePageProd;
	}


	@Override
	public void openPage() {
		if (TestBaseProvider.getTestBase().getContext().getString("driver.name")
				.equals("Android")) {
			PauseUtil.pause(2000);
			WebElement el = TestBaseProvider.getTestBase().getDriver()
					.findElement(By.xpath("//button[@title='Close']"));
			PauseUtil.pause(2000);
			if (el.isDisplayed()) {
				el.click();
				WaitUtils.waitForEnabled(getTxtUsername());
			}
		}

	}

	@Override
	public void openPage2() {
		TestBaseProvider.getTestBase().getContext().getString("driver.name")
		.equals("Android");

	}

	@Override
	public boolean isPageActive() {
		return getLblPageTitle().isDisplayed();
	}

	@Override
	public void doLogin(String username, String password, boolean isRemember) {

		PauseUtil.pause(2000);
		WaitUtils.waitForEnabled(getTxtUsername());
		getTxtUsername().click();
		getTxtUsername().sendKeys(username);
		WaitUtils.waitForEnabled(getTxtPassword());
		PauseUtil.pause(1000);
		getTxtPassword().click();
		getTxtPassword().sendKeys(password);
		PauseUtil.pause(1500);

		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getBtnSignOn(), 30));
		PauseUtil.pause(4000);

		if(chkdrpSelectSchool().size()!=0) {
			WaitUtils.waitForDisplayed(getdrpSelectSchool());
			PauseUtil.pause(1000);
			Select_School();
			WaitUtils.waitForDisplayed(getbtnNext());
			getbtnNext().click();
			PauseUtil.pause(1500);
		}

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		ILoginPage homePage = getFactory().getILoginPage();
		if(sizelblhomerolenotavailable().size()!=0){

			btnhomeregistrationedit().click();
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(2500);
			btnhomeregistrationsave().click();
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(2500);
			btnhomeregistrationcontinuesite().click();
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(2500);
			homePage.DontShowAgainButton_in_LoginPage();
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(2500);

		}

		ITeachersHomePage iTeachersHomePage = getFactory().getITeachersHomePage();
		//iTeachersHomePage.waitForPageLoad();

		TeacherCartSteps teacherCartSteps = new TeacherCartSteps();
		teacherCartSteps.user_removes_all_items_from_cart();

	}

	@Override
	public void doLogin2(String username, String password, boolean isRemember) {

		PauseUtil.pause(2000);
		WaitUtils.waitForEnabled(getTxtUsername());
		getTxtUsername().click();
		getTxtUsername().sendKeys(username);
		WaitUtils.waitForEnabled(getTxtPassword());
		PauseUtil.pause(1000);
		getTxtPassword().click();
		getTxtPassword().sendKeys(password);
		PauseUtil.pause(1500);

		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getBtnSignOn(), 30));

		ITeachersHomePage iTeachersHomePage = getFactory().getITeachersHomePage();
		//iTeachersHomePage.waitForPageLoad();

		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();

		PauseUtil.pause(1000);

		System.out.println("####Handling Popup####");

		teachersHomePage.handleBack2SchoolPopup("english");
		teachersHomePage.handle_teacher_parent_Popup();
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.closeButton_in_LoginPage();

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		if(sizeiconCloseHomePageProd().size()!=0){
			System.out.println("COMING INSIDE FORSEE TO CLOSE PROD CLOSE");
			geticonCloseHomePageProd().click();
			System.out.println("CLICKED PROD CLOSE");
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(1500);
			}

		teachersHomePage.user_do_the_empty_cart();
	}

	@Override
	public void doLogin3(String username, String password, boolean isRemember) {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(2000);
		WaitUtils.waitForEnabled(getTxtUsername());
		getTxtUsername().click();
		getTxtUsername().sendKeys(username);
		WaitUtils.waitForEnabled(getTxtPassword());
		PauseUtil.pause(1000);
		getTxtPassword().click();
		getTxtPassword().sendKeys(password);
		PauseUtil.pause(1500);

		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getBtnSignOn(), 30));

		ILoginPage homePage = getFactory().getILoginPage();
		teachersHomePage.handle_teacher_parent_Popup();
		homePage.closeButton_in_LoginPage();

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		if(sizeiconCloseHomePageProd().size()!=0){
			geticonCloseHomePageProd().click();
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(10000);

		}
	}
	
	
	//for not deleting items in cart after login
	@Override
	public void doLogin4(String username, String password, boolean isRemember) {

		PauseUtil.pause(2000);
		WaitUtils.waitForEnabled(getTxtUsername());
		getTxtUsername().click();
		getTxtUsername().sendKeys(username);
		WaitUtils.waitForEnabled(getTxtPassword());
		PauseUtil.pause(1000);
		getTxtPassword().click();
		getTxtPassword().sendKeys(password);
		PauseUtil.pause(1500);

		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getBtnSignOn(), 30));

		ITeachersHomePage iTeachersHomePage = getFactory().getITeachersHomePage();
		//iTeachersHomePage.waitForPageLoad();

		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();

		PauseUtil.pause(1000);

		System.out.println("####Handling Popup####");

		teachersHomePage.handleBack2SchoolPopup("english");
		teachersHomePage.handle_teacher_parent_Popup();
		
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.closeButton_in_LoginPage();

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		if(sizeiconCloseHomePageProd().size()!=0){
			System.out.println("COMING INSIDE FORSEE TO CLOSE PROD CLOSE");
			geticonCloseHomePageProd().click();
			System.out.println("CLICKED PROD CLOSE");
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(1500);
			}
	}
	
	// Login without completing parent site modal
	@Override
	public void doLogin5(String username, String password, boolean isRemember) {

		PauseUtil.pause(2000);
		WaitUtils.waitForEnabled(getTxtUsername());
		getTxtUsername().click();
		getTxtUsername().sendKeys(username);
		WaitUtils.waitForEnabled(getTxtPassword());
		PauseUtil.pause(1000);
		getTxtPassword().click();
		getTxtPassword().sendKeys(password);
		PauseUtil.pause(1500);

		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getBtnSignOn(), 30));

		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();

		PauseUtil.pause(1000);

		System.out.println("####Handling Popup####");

		teachersHomePage.handleBack2SchoolPopup("english");
		
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.closeButton_in_LoginPage();

		//SCHUtils.waitForLoaderToDismiss();
		//PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		if(sizeiconCloseHomePageProd().size()!=0){
			System.out.println("COMING INSIDE FORSEE TO CLOSE PROD CLOSE");
			geticonCloseHomePageProd().click();
			System.out.println("CLICKED PROD CLOSE");
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(1500);
			}
	}
	
	public void enterUn(String username) {
		PauseUtil.pause(2000);
		WaitUtils.waitForEnabled(getTxtUsername());
		getTxtUsername().click();
		getTxtUsername().sendKeys(username);
		}

	@Override
	public void Login_driver(String username, String password, boolean isRemember) {

		WebDriver driver=TestBaseProvider.getTestBase().getDriver();

		String userpath = "input[placeholder='Scholastic Account Number']";
		String pwdpath = "input[placeholder='Scholastic Account Password']";
		String loginbtnpath = ".home-page-login-btn";
		String prodclose = "//a[@class='fsrCloseBtn']";


		PauseUtil.pause(5000);
		//WaitUtils.waitForEnabled(driver.findElement(By.cssSelector(userpath)));
		driver.findElement(By.cssSelector(userpath)).click();
		driver.findElement(By.cssSelector(userpath)).sendKeys(username);
		//WaitUtils.waitForEnabled(driver.findElement(By.cssSelector(pwdpath)));
		PauseUtil.pause(1000);
		driver.findElement(By.cssSelector(pwdpath)).click();
		driver.findElement(By.cssSelector(pwdpath)).sendKeys(password);
		PauseUtil.pause(1500);
		driver.findElement(By.cssSelector(loginbtnpath)).click();
		PauseUtil.pause(5000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);


		/*ILoginPage homePage = getFactory().getILoginPage();
		homePage.closeButton_in_LoginPage();*/


		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);

		if(driver.findElements(By.xpath(prodclose)).size()!=0){
			driver.findElement(By.xpath(prodclose)).click();
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(10000);

		}
	}



	@Override
	public void doLogin_invalid(String username, String password, boolean isRemember) {

		PauseUtil.pause(2000);
		WaitUtils.waitForEnabled(getTxtUsername());
		getTxtUsername().click();
		getTxtUsername().sendKeys(username);
		WaitUtils.waitForEnabled(getTxtPassword());
		PauseUtil.pause(1000);
		getTxtPassword().click();
		getTxtPassword().sendKeys(password);
		PauseUtil.pause(1500);

		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getBtnSignOn(), 30));

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(4000);
	}



	@Override
	public void doLogin_PasswordBlank(String username, boolean isRemember) {

		PauseUtil.pause(2000);
		WaitUtils.waitForEnabled(getTxtUsername());
		getTxtUsername().click();
		getTxtUsername().sendKeys(username);
		WaitUtils.waitForEnabled(getTxtPassword());
		PauseUtil.pause(1000);

		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getBtnSignOn(), 30));

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(4000);
	}




	@Override
	public void doLogin_UserNameBlank(String password, boolean isRemember) {

		PauseUtil.pause(2000);
		WaitUtils.waitForEnabled(getTxtUsername());
		getTxtPassword().click();
		getTxtPassword().sendKeys(password);
		PauseUtil.pause(1500);
		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getBtnSignOn(), 30));

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(4000);
	}


	@Override
	public void doLogin_credentials_Input(String username, String password, boolean isRemember) {

		PauseUtil.pause(2000);
		WaitUtils.waitForEnabled(getTxtUsername());
		getTxtUsername().click();
		getTxtUsername().sendKeys(username);
		WaitUtils.waitForEnabled(getTxtPassword());
		PauseUtil.pause(1000);
		getTxtPassword().click();
		getTxtPassword().sendKeys(password);
		PauseUtil.pause(1500);

	}


	@Override
	public void doLogin_LoginBtn() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getBtnSignOn(), 30));
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);



	}



	@Override
	public void click_ActivateYourAccountBtn() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getlnkhomeactivateyouraccount(), 30));
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);



	}



	@Override
	public void enterActivateAccount_clickNext(String internationalactnumber) {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		getinputactivateaccountnumber().sendKeys(internationalactnumber);
		PauseUtil.pause(1500);
		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getbtnactivateaccountnumbernext(), 30));
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);



	}



	@Override
	public void International_User_ErrorMsg_Check() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		if(sizetooltiploginerrormsgbox().size()==0){
			Assert.fail("Tool tip should be present after login for international user when tries to login to Canada site");
		}
		AssertUtils.assertTextMatches(gettitleloginerrormsgbox(),
				Matchers.equalToIgnoringCase(ConstantUtils.INTERNATIONALTOOLTIP_TITLE));

					AssertUtils.assertTextMatches(gettooltiploginerrormsgbox(),
							Matchers.equalToIgnoringCase(ConstantUtils.INTERNATIONALLOGINERRMSG_CANADASITE));




	}



	@Override
	public void Invalid_Login_ErrorMsg_Check() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Assert.assertTrue(sizetooltiploginerrormsgbox().size() > 0);
		Assert.assertFalse(sizetooltiploginpage().size() > 0);

		/*if(sizetooltiploginerrormsgbox().size()==0){
		Assert.fail("Tool tip should be present when loging with invalid user and password");
		}
		AssertUtils.assertTextMatches(gettooltiploginpage(),
				Matchers.equalToIgnoringCase(ConstantUtils.INTERNATIONALTOOLTIP_TITLE)); */




	}



	@Override
	public void LoginValidation_EmptyPassword() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Assert.assertTrue(sizetooltiploginpage().size() > 0);

		AssertUtils.assertTextMatches(gettooltiploginpage(),
				Matchers.equalToIgnoringCase(ConstantUtils.LOGINPAGEEMPTYPWDERROR));

	}





	@Override
	public void LoginValidation_EmptyUserName() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Assert.assertTrue(sizetooltiploginpage().size() > 0);

		AssertUtils.assertTextMatches(gettooltiploginpage(),
				Matchers.equalToIgnoringCase(ConstantUtils.LOGINPAGEEMPTYUSERNAMEERROR));

	}



	@Override
	public void LoginValidation_OnlyEmptyUserName() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Assert.assertTrue(sizetooltiploginpage().size() > 0);
		Assert.assertFalse(sizetooltiploginerrormsgbox().size() > 0);

		AssertUtils.assertTextMatches(gettooltiploginpage(),
				Matchers.equalToIgnoringCase(ConstantUtils.LOGINPAGEEMPTYUSERNAMEERROR));

	}

	@Override
	public void validateRememberUserName_autopopulated() {
		String username = getTxtUsername().getAttribute("value").trim();
		System.out.println("user from application:"+username);
		System.out.println("user from dataaaaaaaa:"+TestBaseProvider.getTestBase().getTestData().getString("userid"));
		if (!username.equals(TestBaseProvider.getTestBase().getTestData().getString("userid"))) {
			Assert.fail("User Name is not saved OR user name is not as expected  " +getTxtUsername().getText() );
		}

	}

	@Override
	public void validateRememberUserName_autopopulated1() {
		if (!getTxtUsername().getText().equals("")) {
			Assert.fail("User Name is not saved OR user name is not as expected  " +getTxtUsername().getText() );
		}
	}

	@Override
	public void unchecked_RememberMe_LoginPage() {
		if(chkRememberMe.isSelected()){
			Assert.fail("Expected Remember Me not Checked");
		}
	}

	@Override
	public void verifypasswordHidden() {
		String passwordType = getchkpasswordCharacter().getAttribute("type");
		//System.out.println(">>>>>>>>>>TestPassword "+passwordType);
		if(!passwordType.equals("password")){
			Assert.fail("password should be hidden "+passwordType);
		}
	}

	@Override
	public void verifyShow_passwordbox() {
		//System.out.println("><><><><>"+gettxtInsidePasswordbox().getText());

		if(!gettxtInsidePasswordbox().getText().trim().equals("SHOW")){
			Assert.fail("Text Show expected but found"+gettxtInsidePasswordbox().getText().trim());
		}
	}

	@Override
	public void verifyHide_passwordbox() {
		if(!gettxtInsidePasswordbox().getText().trim().equals("HIDE")){
			Assert.fail("Text HIDE expected but found"+gettxtInsidePasswordbox().getText().trim());
		}
	}

	@Override
	public void clickShowInPasswordBox() {
		gettxtInsidePasswordbox().click();
	}

	@Override
	public void clickHideInPasswordBox() {
		gettxtInsidePasswordbox().click();
	}

	@Override
	public void validateEnteredPassword() {
		PauseUtil.pause(3000);
		String password =  getchkpasswordCharacter().getAttribute("type");
		if(!password.equals("text")){
			Assert.fail("Password entered in password field is not shown when clicked on show link");
		}
	}

	@Override
	public void validatePasswordisencrypted() {
		PauseUtil.pause(3000);
		String password =  getchkpasswordCharacter().getAttribute("type");
		if(!password.equals("password")){
			Assert.fail("Password entered in password field is not shown when clicked on show link");
		}
	}

	@Override
	public void doLogin_specificSchool(String username, String password, boolean isRemember) {

		PauseUtil.pause(2000);
		WaitUtils.waitForEnabled(getTxtUsername());
		getTxtUsername().click();
		getTxtUsername().sendKeys(username);
		WaitUtils.waitForEnabled(getTxtPassword());
		PauseUtil.pause(1000);
		getTxtPassword().click();
		getTxtPassword().sendKeys(password);
		PauseUtil.pause(1500);

		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getBtnSignOn(), 30));

		WaitUtils.waitForDisplayed(getdrpSelectSchool());
		PauseUtil.pause(1000);
		Select_School();
		WaitUtils.waitForDisplayed(getbtnNext());
		getbtnNext().click();
		PauseUtil.pause(4000);

		/*if(getProfileModel_DialogBoxs().size()!=0)
	    {

		if(!getEditProfile_Continue_Site_Button().isEnabled()){

			boolean roleEdit_Btn = getProfilewindow_Role_EditBtnsize().size();
			if(roleEdit_Btn==true)
			{
			classroom_orders.click(homepage_var.Profilewindow_Role_EditBtn);
			classroom_orders.click(homepage_var.EditRole_SelectRole_Dropdown);
			classroom_orders.EditRole_SelectRole("ADMINISTRATOR");
			classroom_orders.click(homepage_var.EditRole_SelectTitle_Dropdown);
			classroom_orders.click(homepage_var.EditRole_Title_FirstTitle);
			Thread.sleep(1500);
			classroom_orders.click(homepage_var.EditRole_SaveBtn);
			boolean Save_Btn = classroom_orders.size(homepage_var.EditRole_SaveBtn);
			for(int i=0;i<=2;i++)
			{
			if(Save_Btn==true)
			{
			click(homepage_var.EditRole_SaveBtn);
			}
			}


			}
	     }
		click(homepage_var.EditProfile_Continue_Site_Button);
		boolean Continue_Btn = classroom_orders.size(homepage_var.EditProfile_Continue_Site_Button);
		for(int i=0;i<=2;i++)
		{
		if(Continue_Btn==true)
		{
		click(homepage_var.EditProfile_Continue_Site_Button);
		}
		}

	    }*/


		ITeachersHomePage iTeachersHomePage = getFactory().getITeachersHomePage();
		//iTeachersHomePage.waitForPageLoad();



		TeacherCartSteps teacherCartSteps = new TeacherCartSteps();
		teacherCartSteps.user_removes_all_items_from_cart();



		/*if (TestBaseProvider.getTestBase().getTestData()
				.getString("addAccountInfo") != null
				&& TestBaseProvider.getTestBase().getTestData()
						.getString("addAccountInfo").equalsIgnoreCase("true")) {
			PauseUtil.pause(2000);
			IHeaderSection headerSection = SectionFactory.getFactory()
					.getIHeaderSection(LocatorUtils.getBy("dw.header.section"));
			headerSection.clickOnMenuOptions("My Account", "Profile");
			IProfilePage profilePage = getFactory().getIProfilePage();
			if (TestBaseProvider.getTestBase().getTestData().getString("module") != null
					&& TestBaseProvider.getTestBase().getTestData().getString("module")
							.equalsIgnoreCase("parent")) {

				profilePage.fillUserProfileBeanFromChildName();
			} else if (TestBaseProvider.getTestBase().getTestData()
					.getString("module") != null
					&& TestBaseProvider.getTestBase().getTestData().getString("module")
							.equalsIgnoreCase("teacher")) {
				profilePage.fillUserProfileBean();
				// If you are setting title in test data then you will need to
				// pass all the profile page parameters in this methods

				if (TestBaseProvider.getTestBase().getTestData()
						.getString("title") != null
						&& TestBaseProvider.getTestBase().getContext()
								.getString("testexecution.teacheremail") == null) {

					profilePage.verifyPage();
				}
			}
			headerSection.clickOnHomeIcon();
		}*/
	}




	@Override
	public void navigateToCreateAccountPage() {
		getBtnCreateAccount().click();

	}

	@Override
	public void user_clicks_on_MyAccount_in_HomePage() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		MyAccount_HomePage().click();
		MyAccount_Profile_HomePage().click();
		// Implementation Pending Satnam
		/*PauseUtil.pause(5000);
		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		// locator in firefox and chrome chages for menu so using url
		driver.navigate().to("https://development-rco-scholastic.demandware.net/s/rco-ca/myreadingclubaccount");
		//driver.findElement(By.xpath("(//div[@class='toggle-content']/ul/li[1]/a)[3]")).click();
		TeachersHomePage teacherhomepage = new TeachersHomePage();
		if(teacherhomepage.chkTutorial_CloseIcon().size()!=0){
		        	SCHUtils.clickUsingJavaScript(teacherhomepage.getTutorial_CloseIcon());
		        	PauseUtil.pause(3000);
		        }
		 */


	}

	@Override
	public void launchPage() {
		openPage();
	}

	@Override
	public void launchPage2() {
		openPage2();
	}

	@Override
	public boolean isUserLoggedIn() {
		return getDrpMyAccount().isDisplayed();
	}

	@Override
	public void waitForPageLoad() {
		SCHUtils.waitForLoaderToDismiss();
		WaitUtils.waitForDisplayed(getTxtUsername());
	}

	/**
	 * This method will click on Forgot Your account information Link on Login
	 * page
	 */
	@Override
	public void userClicksForgotAccountInfo() {
		getLnkForgotAccount().click();
	}


	@Override
	public void Select_School()
	{
		Select sel = new Select(getSelectSchool());
		sel.selectByIndex(1);

	}


	/**
	 * This method will verify unauthenticated home page
	 */
	@Override
	public void verifyUnauthenticatedHomePage() {
		AssertUtils.assertDisplayed(getLblPageTitle());
		AssertUtils.assertDisplayed(getLblWelcomeTitle());
		AssertUtils.assertDisplayed(getTxtUsername());
		AssertUtils.assertDisplayed(getTxtPassword());
		AssertUtils.assertDisplayed(getBtnSignOn());
	}

	@Override
	public void closeButton_in_LoginPage() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		try {
			btnCloseinLoginPage().isDisplayed();
			btnCloseinLoginPage().click();
		} catch (Exception e) {
			System.out.println("Close button is not displayed in login page");
		}

	}


	@Override
	public void DontShowAgainButton_in_LoginPage() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		try {
			btnDontShowAgainLoginPage().isDisplayed();
			btnDontShowAgainLoginPage().click();
		} catch (Exception e) {
			System.out.println("Dnt Show Again link is not displayed in login page");
		}

	}

	@Override
	public void clickOn_TeacherDesk_HomePage() {
		PauseUtil.waitForAjaxToComplete(2500);
		WaitUtils.waitForDisplayed(Enter_TeacherDesk_HomePage());
		Enter_TeacherDesk_HomePage().click();
	}

	@Override
	public void clickOn_Enter_ClassRoom_Order() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Enter_ClassRoom_Order().click();

	}

	@Override
	public void clickOn_Envelope_in_HomePage() {
		PauseUtil.waitForAjaxToComplete(2500);
		WaitUtils.waitForDisplayed(Envelope_in_HomePage());
		Envelope_in_HomePage().click();

	}

	@Override
	public void Verify_LoginPagePresent() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Assert.assertEquals(sizeTxtUsername().size() > 0, true);

	}

	/*################################SATNAM*/

	@Override
	public void click_btn_Close_ForgotPassWrdModal(){
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		getBtn_Close_ForogotPasswordModal().click();
	}


	@Override
	public void verify_ForgotPasswordModal(){

		PauseUtil.getWhenVisible(getForgotPasswordPopup(), 15);
		if(getForgotPasswordPopup().isDisplayed()){
			Assert.assertEquals(true, true, "The ForgotPassword Modal is displayed");
		}else{
			Assert.fail("The expected ForgotPassword Modal is not displayed");
		}

	}

	@Override
	public String getvalue_Invalid_AccNo(){
		String inputAccNt = getInvalidAccNo().getText();
		return inputAccNt;


	}

	@Override

	public void verify_AccountNotFoundPopup(){
		if(getAccountNotFoundPopup().isDisplayed())
		{

			Assert.assertEquals(true, true, "The Account not found Modal is displayed");
		}else{
			Assert.fail("The expected Acount not Found Modal is not displayed");
		}
	}


	@Override
	public void verify_backbutton_AccountNotFoundPopup(){
		Assert.assertTrue(sizeBtn_Back_AccNotFnd().size() > 0);
	}

	@Override
	public void verify_AccountNotFoundPopup_EmailNotAssociatedMsg(){
		AssertUtils.assertTextMatches(getPopupAccountNotFound_textfield(),
				Matchers.containsString(ConstantUtils.ACCOUNTNOTFOUND_EMAILNOTASSOCIATEDMSG));
	}


	@Override
	public void verify_AccountNotFoundPopup_EmailAssociatedMsg(){
		AssertUtils.assertTextMatches(getPopupAccountNotFound_EmailAssociatedMsg(),
				Matchers.containsString(ConstantUtils.ACCOUNTNOTFOUND_EMAILASSOCIATEDMSG));
	}


	@Override
	public void verify_AccountActivation_ErrorToolTip(){
		Assert.assertTrue(sizePopupAccountNotFound_ErrorTooltip().size() > 0);
		AssertUtils.assertTextMatches(getPopupAccountNotFound_ErrorTooltip(),
				Matchers.containsString(ConstantUtils.ACTIVATEACCOUNT_ERRORTOOLTIP));
	}

	@Override
	public void click_btn_Back_AccNotFndModal(){
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		getBtn_Back_AccNotFnd().click();
	}


	//############################################Satnam

	@Override
	public void verify_ActivateAccountModal(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(getActivateAccPopup().isDisplayed())
		{
			Assert.assertTrue(true, "Activate Account Modal is displayed");
		}
		else
		{
			Assert.fail("Activate Account Modal not displayed");
		}
	}

	public void enterAcctNumber(String ac){
		System.out.println("To check the value to be entered >>>>>"+ac );
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		getAccountNo().clear();
		getAccountNo().sendKeys(ac);
		System.out.println("account no"+ac);

	}

	public void  enter_emailField_AcctNumber(String email){
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		getEmail_ActivateAccount().sendKeys(email + Keys.TAB);
		PauseUtil.pause(1500);
		// getAccountNo().sendKeys(Keys.TAB);
		PauseUtil.pause(1000);
		// getButtonNext().click();
		PauseUtil.pause(1000);
	}

	@Override
	public void  click_btn_AccModalNext(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getButtonNext().click();
	}

	@Override
	public void  verify_btn_AccModalNext_Disabled(){
		Assert.assertTrue(getbtnAcctActivate_Disabled_Next().size() > 0);
	}

	@Override
	public void CSR_enters_Username_in_UNameField() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		fld_Username_CSR_LoginPage().click();
		fld_Username_CSR_LoginPage().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("userid"));
	}

	@Override
	public void CSR_clicks_on_UNameField_CSR_LoginPage() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		fld_Username_CSR_LoginPage().click();
	}

	@Override
	public void CSR_clicks_on_pwd_Field_CSR_LoginPage() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		fld_password_CSR_LoginPage().click();
	}

	@Override
	public void validate_Enter_button_is_disabled_in_CSR_Login_Page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);

		if (Enter_button_CSR_SignInPage().isEnabled()) {
			Assert.fail("ENTER button is enabled in CSR login Page");
		} else {
			System.out.println("ENTER button is disabled in CSR login Page");
		}

	}

	@Override
	public void validate_Enter_button_is_enabled_in_CSR_Login_Page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);

		if (Enter_button_CSR_SignInPage().isEnabled()) {
			System.out.println("ENTER button is enabled in CSR login Page");
		} else {
			Assert.fail("ENTER button is disabled in CSR login Page");
		}

	}


	@Override
	public void CSR_enters_Password_in_pwd_Field() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		fld_password_CSR_LoginPage().click();
		fld_password_CSR_LoginPage().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("password"));
	}

	@Override
	public void CSR_clicks_on_outside_in_loginPage() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);

		section_Password_OnClick_CSR_LoginPage().click();

	}

	@Override
	public void CSR_clicks_on_Enter_button_SignInPage() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Enter_button_CSR_SignInPage().click();
	}

	@Override
	public void verify_error_message_when_enter_Invalid_creds_CSR_Login_Page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		String act_text=CSR_LoginPage_section().getText();
		act_text=act_text.trim();

		String act_text2=act_text.substring(act_text.length() - 16);
		System.out.println("################:"+act_text2);

		String exp_text="Error Logging In";

		Assert.assertEquals(act_text2, exp_text, "Incorrect error message is showing when CSR enters invalid cred's");
	}

	@Override
	public void verify_error_message_when_enter_lessthan_min_chars_in_pwd_CSR_Login_Page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		String act_text=Error_message_Pwd_field_CSR_LoginPage().getText();
		String exp_text="Please enter at least 7 characters.";

		Assert.assertEquals(act_text, exp_text, "Incorrect error message is showing when CSR enters lessthan min char's in password field");
	}

	@Override
	public void verify_CSR_Home_Page_is_displayed() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		try {
			CSR_Home_Page_OrderType().isDisplayed();
			System.out.println("CSR Home page is displayed");
		} catch (Exception e) {
			Assert.fail("CSR Home page is not displayed");
		}
	}

	@Override
	public void CSR_doLogin() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);

		/*WebDriver driver=TestBaseProvider.getTestBase().getDriver();
        driver.switchTo().alert().accept();*/

		fld_Username_CSR_LoginPage().click();
		fld_Username_CSR_LoginPage().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("userid"));
		PauseUtil.pause(2000);
		System.out.println("userid used "+TestBaseProvider.getTestBase().getTestData().getString("userid"));
		fld_password_CSR_LoginPage().click();
		fld_password_CSR_LoginPage().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("password"));
		PauseUtil.pause(2000);
		Enter_button_CSR_SignInPage().click();

	}

	@Override
	public void Validate_CSR_is_presented_with_the_user_authentication_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);

		try {
			CSR_LoginPage_section().isDisplayed();
			System.out.println("CSR_is_presented_with_the_user_authentication_page");
		} catch (Exception e) {
			Assert.fail("CSR_is_not presented_with_the_user_authentication_page");
		}

	}

	@Override
	public void Validate_the_label_of_Uname_in_CSR_loginPage() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);

		String act_text=lbl_of_Username_CSR_LoginPage().getText();
		String exp_text="UserName";

		Assert.assertEquals(act_text, exp_text, "Username label is incorrect");
	}

	@Override
	public void Validate_the_label_of_Password_in_CSR_loginPage() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);

		String act_text=lbl_of_Password_CSR_LoginPage().getText();
		String exp_text="Password";

		Assert.assertEquals(act_text, exp_text, "Password label is incorrect");
	}

	@Override
	public void Validate_the_label_of_ENTER_in_CSR_loginPage() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);

		String act_text=Enter_button_CSR_SignInPage().getText();
		act_text=act_text.trim();

		String exp_text="ENTER";

		Assert.assertEquals(act_text, exp_text, "ENTER label is incorrect");

	}



	@Override
	public void verify_hintfield_accountactivation_notpresent(){
//		System.out.println("hint fied is: "+getaccountactivationaccnumberhintfield().get(0).getText());

		try {
			if(getaccountactivationaccnumberhintfield().size()>0){
				Assert.fail("Hint field is present for Account Number i.e. Maximum 8 characters");
            }
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*if(!getaccountactivationaccnumberhintfield().getText().equals(""))
		{
			Assert.fail("Hint field is present for Account Number i.e. Maximum 8 characters");
		}*/
	}

	@Override
	public void CSR_openPage() {
		/*if (TestBaseProvider.getTestBase().getContext().getString("driver.name")
				.equals("Android")) {
			PauseUtil.pause(10000);
			WebElement el = TestBaseProvider.getTestBase().getDriver()
					.findElement(By.xpath("//button[@title='Close']"));
			PauseUtil.pause(15000);
			if (el.isDisplayed()) {
				el.click();
				WaitUtils.waitForEnabled(getTxtUsername());
			}
		}*/
		TestBaseProvider.getTestBase().getContext().getString("driver.name")
		.equals("Android");
	}

	@Override
	public void BM_openPage() {
		System.out.println("DRIVER+++++");
		TestBaseProvider.getTestBase().getContext().getString("driver.name")
		.equals("Android");

	}

	@Override
	public void CSR_launchPage()
	{
		CSR_openPage();
	}

	@Override
	public void teacher_clicks_on_ActivateYourAccount_SignIn_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		button_Activate_Your_Account_LogiinPage().click();
	}

	@Override
	public void teacher_enters_AC_num_in_ActivateYourAccount_modal_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		getinputactivateaccountnumber().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("AcNum"));
	}

	@Override
	public void teacher_enters_mail_id_in_ActivateYourAccount_modal_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		fld_email_ActivateYourAccount_modal_window().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("Email"));

	}

	@Override
	public void teacher_clicks_on_NEXT_button_in_ActivateYourAccount_modal_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);

		getbtnactivateaccountnumbernext().click();
	}

	@Override
	public void teacher_validate_Account_Not_Found_modal_window_displayed() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		try {
			modal_window_fail_Account_Activation().isDisplayed();
			System.out.println("Account Not Found modal window is displayed");
		} catch (Exception e) {
			Assert.fail("Account Not Found modal window is not displayed");
		}
	}

	@Override
	public void teacher_verify_Account_Not_Found_modal_window_header() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		String act_text=window_Account_Not_Found().getText();
		act_text=act_text.trim();

		String exp_text="Account Not Found";

		Assert.assertEquals(act_text, exp_text, "Incorrect header is displayed for the modal window Account Not Found");
	}

	@Override
	public void teacher_verify_link_Forgot_AC_num_mail_displayed_in_Account_Not_Found() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		try {
			link_Forgot_AC_num_mail_in_Account_Not_Found().isDisplayed();
			System.out.println("Forgot Your AC number or Email Address hyper link is displayed");
		} catch (Exception e) {
			Assert.fail("Forgot Your AC number or Email Address hyper link is not displayed");
		}
	}

	@Override
	public void teacher_verify_close_btn_displayed_in_Account_Not_Found() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		try {
			btn_close_in_Account_Not_Found().isDisplayed();
			System.out.println("Close button is displayed in Account Not Found modal window");
		} catch (Exception e) {
			Assert.fail("Close button is not displayed in Account Not Found modal window");
		}
	}

	@Override
	public void teacher_verify_BACK_btn_enabled_in_Account_Not_Found() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		if (btn_BACK_in_Account_Not_Found().isEnabled()) {
			System.out.println("BACK button is enabled in Account Not Found modal window");
		} else {
			Assert.fail("BACK button is disabled in Account Not Found modal window");
		}
	}

	@Override
	public void teacher_verify_Email_Not_Match_modal_window_header() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		String act_text=window_Email_Not_Match().getText();
		act_text=act_text.trim();

		String exp_text="Email Doesn’t Match";

		Assert.assertEquals(act_text, exp_text, "Incorrect header is displayed for the modal window Email Not Match");
	}

	@Override
	public void teacher_clicks_on_BACK_btn_Activation_fail_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		btn_BACK_in_Account_Not_Found().click();
	}

	@Override
	public void teacher_verify_window_Activate_Your_Account_displayed() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		try {
			window_Activate_Your_Account().isDisplayed();
			System.out.println("Activate Your Account modal window is displayed");
		} catch (Exception e) {
			Assert.fail("Activate Your Account modal window is not displayed");
		}
	}

	@Override
	public void teacher_clicks_on_Forgot_login_info_link_loginPage() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		link_Forgot_login_info_login_page().click();
	}

	@Override
	public void teacher_clicks_on_Forgot_AcNum_Email_link_in_Forgot_pwd_window_loginPage() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		link_Forgot_Ac_num_Email_in_Forgot_pwd_window_loginPage().click();
	}

	@Override
	public void teacher_verify_ForgotAccountNum_And_EmailAddr_link_displayed_ActivateWindow() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		try {
			link_Forgot_Ac_num_Email_in_Forgot_pwd_window_loginPage().isDisplayed();
			System.out.println("Forgot your Account Number or Email Address? link is displayed");
		} catch (Exception e) {
			Assert.fail("Forgot your Account Number or Email Address? link is not displayed");
		}
	}

	@Override
	public void teacher_verify_NEXT_btn_disabled_in_ActivateWindow() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		if (getbtnactivateaccountnumbernext().isEnabled()) {
			Assert.fail("NEXT button is enabled in Activate Your Account window");
		} else {
			System.out.println("NEXT button is disabled in Activate Your Account window");
		}
	}

	@Override
	public void teacher_clicks_on_AcNum_fld_question_icon_in_ActivateWindow() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		question_icon_AcNum_fld_ActicateYourAccount().click();
	}

	@Override
	public void teacher_clicks_on_Email_fld_question_icon_in_ActivateWindow() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		question_icon_Email_fld_ActicateYourAccount().click(); 	
	}

	@Override
	public void teacher_verify_tooltip_txt_AcNum_fld_in_ActivateWindow() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		String act_text=ToolTip_popup_AcNum_and_Email_flds_ActicateYourAccount().getText();
		act_text=act_text.trim();
		String exp_text="Your account number can be found on the top left corner of your packing slip.";

		Assert.assertEquals(act_text, exp_text, "Incorrect tooltip text is displayed for Account num field");
	}

	@Override
	public void teacher_verify_tooltip_txt_Email_fld_in_ActivateWindow() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		String act_text=ToolTip_popup_AcNum_and_Email_flds_ActicateYourAccount().getText();
		act_text=act_text.trim();
		String exp_text="Enter the email address associated with your account number.";

		Assert.assertEquals(act_text, exp_text, "Incorrect tooltip text is displayed for Email field");
	}

	@Override
	public void teacher_enters_Uname_and_pwd(String username, String password) {

		PauseUtil.pause(2000);
		WaitUtils.waitForEnabled(getTxtUsername());
		getTxtUsername().click();
		getTxtUsername().sendKeys(username);
		WaitUtils.waitForEnabled(getTxtPassword());
		PauseUtil.pause(1000);
		getTxtPassword().click();
		getTxtPassword().sendKeys(password);
	}

	@Override
	public void teacher_enters_pwd() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		getTxtPassword().click();
		getTxtPassword().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("password"));

	}

	@Override
	public void teacher_enters_AcNum_Email_Forgot_Login_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		AcNum_Email_fld_ForgotYourLogin_window().click();
		AcNum_Email_fld_ForgotYourLogin_window().clear();
		AcNum_Email_fld_ForgotYourLogin_window().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("AcNumOrEmail"));
		AcNum_Email_fld_ForgotYourLogin_window().sendKeys(Keys.TAB);
	}

	@Override
	public void teacher_verify_error_tooltip_AcNum_Email_Forgot_Login_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		try {
			toolTip_AcNum_Email_ForgotYourLogin_window().isDisplayed();
			String act_text=toolTip_AcNum_Email_ForgotYourLogin_window().getText();
			act_text=act_text.trim();
			String exp_text="Please enter a valid email address.";
			Assert.assertEquals(act_text, exp_text, "Incorrect ToolTip message is displayed");
		} catch (Exception e) {
			Assert.fail("Ac Num Email tooltip message is not displayed");
		}
	}

	@Override
	public void teacher_verify_AcNum_Email_fld_highlights_Yellow_color_Forgot_Login_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		String act_text=AcNum_Email_fld_ForgotYourLogin_window().getAttribute("aria-invalid");
		String exp_text="true";

		Assert.assertEquals(act_text, exp_text, "Ac Num/Email field not highlighted in Yeloow color");
	}

	@Override
	public void teacher_enters_Fname_Forgot_Login_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		Fname_fld_ForgotYourLogin_window().click();
		Fname_fld_ForgotYourLogin_window().clear();
		Fname_fld_ForgotYourLogin_window().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("firstname"));
	}

	@Override
	public void teacher_enters_Lname_Forgot_Login_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		Lname_fld_ForgotYourLogin_window().click();
		Lname_fld_ForgotYourLogin_window().clear();
		Lname_fld_ForgotYourLogin_window().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("lastname"));
	}

	@Override
	public void teacher_verify_CONTINUE_btn_disabled_Forgot_Login_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		if (CONTINUE_btn_ForgotYourLogin_window().isEnabled()) {
			Assert.fail("CONTINUE button is enabled in Forgot_Login_window");
		} else {
			System.out.println("CONTINUE button is disabled in Forgot_Login_window");
		}

	}

	@Override
	public void teacher_verify_Lname_fld_chars_Forgot_Login_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		String act_text=Lname_fld_ForgotYourLogin_window().getText();
		act_text=act_text.trim();

		String exp_text=TestBaseProvider.getTestBase().getTestData().getString("lastname");

		Assert.assertNotSame(act_text, exp_text, "Last name field accepted more than 30 char's");

	}

	@Override
	public void teacher_verify_Fname_fld_chars_Forgot_Login_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		String act_text=Fname_fld_ForgotYourLogin_window().getText();
		act_text=act_text.trim();

		String exp_text=TestBaseProvider.getTestBase().getTestData().getString("firstname");

		Assert.assertNotSame(act_text, exp_text, "First name field accepted more than 30 char's");

	}

	@Override
	public void teacher_verify_Lname_fld_highlights_Yellow_color_Forgot_Login_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		String act_text=Lname_fld_ForgotYourLogin_window().getAttribute("aria-invalid");
		String exp_text="true";

		Assert.assertEquals(act_text, exp_text, "Last name field not highlighted in Yeloow color");
	}

	@Override
	public void teacher_verify_Fname_fld_highlights_Yellow_color_Forgot_Login_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		String act_text=Fname_fld_ForgotYourLogin_window().getAttribute("aria-invalid");
		String exp_text="true";

		Assert.assertEquals(act_text, exp_text, "First name field not highlighted in Yeloow color");
	}

	@Override
	public void teacher_verify_CONTINUE_btn_enabled_Forgot_Login_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		if (CONTINUE_btn_ForgotYourLogin_window().isEnabled()) {
			System.out.println("CONTINUE button is enabled in Forgot_Login_window");
		} else {
			Assert.fail("CONTINUE button is diasbled in Forgot_Login_window");
		}
	}

	@Override
	public void teacher_verify_minChar_length_toolTip_displayed_Fname_Forgot_Login_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		try {
			tooltip_Fname_min_char_ForgotYourLogin_window().isDisplayed();
			String act_text=tooltip_Fname_min_char_ForgotYourLogin_window().getText();
			act_text=act_text.trim();
			String exp_text="Please enter a valid first name.";
			Assert.assertEquals(act_text, exp_text, "Incorrect tooltip error message is displayed");
		} catch (Exception e) {
			Assert.fail("Tooltip message is not displayed for Fname fld");
		}
	}

	@Override
	public void teacher_verify_minChar_length_toolTip_displayed_Lname_Forgot_Login_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		try {
			tooltip_Lname_min_char_ForgotYourLogin_window().isDisplayed();
			String act_text=tooltip_Lname_min_char_ForgotYourLogin_window().getText();
			act_text=act_text.trim();
			String exp_text="Please enter a valid last name.";
			Assert.assertEquals(act_text, exp_text, "Incorrect tooltip error message is displayed");
		} catch (Exception e) {
			Assert.fail("Tooltip message is not displayed for Lname fld");
		}
	}

	@Override
	public void teacher_verify_toolTip_not_display_Lname_Forgot_Login_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		try {
			tooltip_Lname_min_char_ForgotYourLogin_window().isDisplayed();
			Assert.fail("Tooltip error message is displayed for Lname fld");
		} catch (Exception e) {
			System.out.println("Tooltip error message is displayed for Lname fld");
		}
	}

	@Override
	public void teacher_verify_toolTip_not_display_Fname_Forgot_Login_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		try {
			tooltip_Fname_min_char_ForgotYourLogin_window().isDisplayed();
			Assert.fail("Tooltip error message is displayed for Fname fld");
		} catch (Exception e) {
			System.out.println("Tooltip error message is displayed for Fname fld");
		}
	}

	@Override
	public void teacher_verify_ErrorMsg_for_Invalid_creds_LoginPage(){
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);

		String act_text=LogInError_tooltip_InvalidCreds_LoginPage().getText();
		act_text=act_text.trim();
		System.out.println("########:"+act_text);
		Assert.assertEquals(act_text, ConstantUtils.InvalidCredsErrorMsg, "Incorrect error message is displayed for invaild cred's in Login Page");
	}

	@Override
	public void teacher_verify_Uname_AcNum_fld_highlights_Yellow_color_Main_LoginPage() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		String act_text=getTxtUsername().getAttribute("aria-invalid");
		String exp_text="true";

		Assert.assertEquals(act_text, exp_text, "Username/Ac num field not highlighted in Yeloow color in Login page");
	}

	@Override
	public void teacher_verify_Pwd_fld_highlights_Yellow_color_Main_LoginPage() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		String act_text=getTxtPassword().getAttribute("aria-invalid");
		String exp_text="true";

		Assert.assertEquals(act_text, exp_text, "Password field not highlighted in Yeloow color in Login page");
	}

	@Override
	public void teacher_verify_error_tooltip_AcNum_Email_Main_Login_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		try {
			toolTip_AcNum_Email_Login_Page().isDisplayed();
			String act_text=toolTip_AcNum_Email_Login_Page().getText();
			act_text=act_text.trim();
			String exp_text="Please enter a valid email address.";
			Assert.assertEquals(act_text, exp_text, "Incorrect ToolTip message is displayed for Ac Num/ Email address fld in Login Page");
		} catch (Exception e) {
			Assert.fail("Ac Num Email tooltip message is not displayed in Login Page");
		}
	}

	@Override
	public void teacher_verify_error_tooltip_AcNum_Email_for_empty_fld_Main_Login_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		try {
			System.out.println("Started#########################");
			toolTip_for_empty_fld_AcNum_Email_Login_Page().isDisplayed();
			String act_text=toolTip_for_empty_fld_AcNum_Email_Login_Page().getText();
			act_text=act_text.trim();
			String exp_text="Please enter your account number or account email.";
			Assert.assertEquals(act_text, exp_text, "Incorrect ToolTip message is displayed for Ac Num/ Email address fld in Login Page");
		} catch (Exception e) {
			Assert.fail("Ac Num Email tooltip message is not displayed in Login Page");
		}
	}


	@Override
	public void teacher_enters_Username_or_Email_Main_Login_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		getTxtUsername().click();
		getTxtUsername().clear();
		getTxtUsername().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("userid"));
	}

	@Override
	public void teacher_verify_error_tooltip_for_pwd_fld_empty_Main_Login_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		try {
			toolTip_for_empty_pwd_fld_Login_Page().isDisplayed();
			String act_text=toolTip_for_empty_pwd_fld_Login_Page().getText();
			act_text=act_text.trim();
			String exp_text="Please enter your password.";
			Assert.assertEquals(act_text, exp_text, "Incorrect ToolTip message is displayed for password fld in Login Page");
		} catch (Exception e) {
			Assert.fail("Password fld tooltip message is not displayed in Login Page");
		}
	}

	@Override
	public void teacher_verify_Home_page_displayed() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);

		try {
			Enter_ClassRoom_Order().isDisplayed();
			System.out.println("Home page is displayed");
		} catch (Exception e) {
			Assert.fail("Home page is not displayed");
		}
	}

	@Override
	public void teacher_enters_Username_or_Email_and_clicks_on_outside_Main_Login_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		getTxtUsername().click();
		getTxtUsername().clear();
		getTxtUsername().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("AcNumOrEmail") + Keys.TAB);
//		/getTxtUsername().sendKeys(Keys.TAB);
	}

	@Override
	public void BM_launchPage() {
		BM_openPage();
	}

	@Override
	public void click_RememberMe_LoginPage() {
		//AssertUtils.assertDisplayed(getChkRememberMe());
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		SCHUtils.waitForElementToBeClickable(getChkRememberMe(), 20);
		getChkRememberMe().click();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
	}

	@Override
	public void verify_AccountNumber_Placeholder(){
		String userplaceholder = getTxtUsername().getAttribute("placeholder");
		String userplaceholder_color = getTxtUsername().getCssValue("color");
		System.out.println("color is:"+userplaceholder_color);
		Assert.assertEquals(userplaceholder,ConstantUtils.LOGINPAGEUSERPLACEHOLDER);
		Assert.assertEquals(userplaceholder_color,ConstantUtils.LOGINPAGEPLACEHOLDERCOLOR);
	}

	@Override
	public void verify_AccountPassword_Placeholder(){
		String userplaceholder = getTxtPassword().getAttribute("placeholder");
		String userplaceholder_color = getTxtPassword().getCssValue("color");
		System.out.println("color is:"+userplaceholder_color);
		Assert.assertEquals(userplaceholder,ConstantUtils.LOGINPAGEPWDPLACEHOLDER);
		Assert.assertEquals(userplaceholder_color,ConstantUtils.LOGINPAGEPLACEHOLDERCOLOR);
	}

	@Override
	public void Wait_for_invisibility_of_locator() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		WebDriver driver=TestBaseProvider.getTestBase().getDriver();
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loader-indicator']")));
		//WaitUtils.waitForNotDisplayed(Loader_invisibilty());
	}

	@Override
	public void teacher_navigate_to_SFO() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		Enter_ClassRoom_Order().click();
		Wait_for_invisibility_of_locator();
		PauseUtil.waitForAjaxToComplete(2500);
		tab_SFO().click();
		Wait_for_invisibility_of_locator();
	}

	@Override
	public void teacher_navigates_to_YTO() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		Enter_ClassRoom_Order().click();
		Wait_for_invisibility_of_locator();
		PauseUtil.waitForAjaxToComplete(2500);
		toggle_by_Item_YTO_page().click();
		Wait_for_invisibility_of_locator();
	}

	@Override
	public void teacher_clicks_on_SFO_tab_YTO_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);

		tab_SFO().click();
		Wait_for_invisibility_of_locator();
	}
	
	@Override
	public void verify_create_account_firstname_is_saved(){
    	PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		
		String act_text=Fname_fld_ForgotYourLogin_window().getAttribute("value");
		String exp_text=TestBaseProvider.getTestBase().getTestData().getString("firstname");
		
		Assert.assertEquals(act_text, exp_text, "Fname data is not saved");
	}

	@Override
	public void verifyTCODHomepgae(){
		getTCODPCODhomepage().isDisplayed();
		System.out.println("TCOD Homepage is displayed");
	}

	@Override
	public void verifySearchBarDisplayed(){
		IStudentFlyerOrdersPage studentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
		studentFlyerOrdersPage.verify_search_bar_displays_TCODHomepgae();
	}
	
	@Override
	public void teacher_navigate_to_SOO() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		Enter_ClassRoom_Order().click();
		Wait_for_invisibility_of_locator();
		PauseUtil.waitForAjaxToComplete(2500);
		tab_SOO().click();
		Wait_for_invisibility_of_locator();
		PauseUtil.pause(2500);
	}
	
	@Override
	public void enter_Uname(String username) {
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(2000);
		WaitUtils.waitForEnabled(getTxtUsername());
		getTxtUsername().click();
		getTxtUsername().sendKeys(username);
	}
	
	@Override
	public void enter_Pwd(String password) {
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(3000);
		WaitUtils.waitForEnabled(getTxtPassword());
		PauseUtil.pause(1000);
		getTxtPassword().click();
		getTxtPassword().sendKeys(password);
	}
	
	@Override
	public void click_on_Login_btn() {
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(1000);
		SCHUtils.clickUsingJavaScript(getBtnSignOn());
	}

}
