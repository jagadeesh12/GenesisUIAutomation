package com.dw.automation.pages.impl;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.apache.commons.configuration.Configuration;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.dw.automation.pages.ITeachersHomePage;
import com.dw.automation.pages.impl.CheckoutPage.ConfirmAndSubmitOrder;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.RandomDataUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;
import com.scholastic.torque.common.WaitUtils;

public class TeachersHomePage extends BaseTestPage<TestPage> implements ITeachersHomePage {
	PCOD_LoginPage pcod_logpage = new PCOD_LoginPage();
	PCOD_HomePage pcod_homePage = new PCOD_HomePage();
	StudentFlyerOrdersPage SfoPage = new StudentFlyerOrdersPage();

	@FindBy(locator = "dw.teacher.home.enterorder.studentflyerorder.applicationLoader")
	private WebElement applicationLoader;

	@FindBy(locator = "dw.teachers.home.lbl.username")
	private WebElement lblUsername;

	@FindBy(locator = "dw.teachers.home.lnk.enterorder")
	private WebElement lnkEnterOrder;

	@FindBy(locator = "dw.teachers.home.lnk.enterorder")
	private List<WebElement> sizelnkEnterOrder;

	@FindBy(locator = "dw.teachers.home.mainmenu.lnk.enterorders")
	private WebElement mainmenulnkEnterOrder;

	@FindBy(locator = "dw.teachers.home.mainmenu.lnk.booksresources")
	private WebElement mainmenulnkbooksresources;

	@FindBy(locator = "dw.teachers.home.mainmenu.lnk.allflyers")
	private WebElement mainmenulnkallflyers;

	@FindBy(locator = "dw.teachers.home.mainmenu.lnk.allflyers.grade.elf")
	private WebElement flyerallflyersgradeelf;

	@FindBy(locator = "dw.teachers.home.mainmenu.lnk.allflyers.specialoffers.specialoffers")
	private WebElement flyerallflyerssplofferssploffers;

	@FindBy(locator = "dw.teachers.home.mainmenu.lnk.allflyers.specialoffers.specialoffers2")
	private WebElement flyerallflyerssplofferssploffers2;

	@FindBy(locator = "dw.teachers.home.mainmenu.lnk.allflyers.french.clubdelecture")
	private WebElement flyerallflyersfrenchclubdelecture;

	@FindBy(locator = "dw.teachers.home.mainmenu.lnk.teacherdesk")
	private WebElement mainmenulnkteacherdesk;

	@FindBy(locator = "dw.teachers.home.mainmenu.lnk.enterorders")
	private List<WebElement> sizemainmenulnkEnterOrder;

	@FindBy(locator = "dw.teachers.home.mainmenu.lnk.booksresources")
	private List<WebElement> sizemainmenulnkbooksresources;

	@FindBy(locator = "dw.teachers.home.mainmenu.lnk.allflyers")
	private List<WebElement> sizemainmenulnkallflyers;

	@FindBy(locator = "dw.teachers.home.mainmenu.lnk.teacherdesk")
	private List<WebElement> sizemainmenulnkteacherdesk;

	@FindBy(locator = "dw.teachers.home.lnk.shopbookresources")
	private WebElement lnkShopBookResources;

	@FindBy(locator = "dw.teachers.home.lnk.teacherdesk")
	private WebElement lnkTeacherDesk;

	@FindBy(locator = "dw.teachers.home.lbl.welcometext")
	private WebElement lblWelcomeText;

	@FindBy(locator = "dw.teachers.home.lst.marktingimg")
	private List<WebElement> lstMarketingImg;

	@FindBy(locator = "dw.teachers.home.lbl.marktingmsgtitle")
	private WebElement lblMarketingMsgTitle;

	@FindBy(locator = "dw.teachers.home.btn.closeIcon")
	private WebElement btnTeacherHomeCloseIcon;

	@FindBy(locator = "dw.teachers.enterorder.btn.closeICon")
	private WebElement btnEnterOrderClosePopup;

	@FindBy(locator = "dw.teachers.enterorder.chk.btn.closeICon")
	private List <WebElement> chkbtnEnterOrderClosePopup;

	@FindBy(locator = "dw.teachers.home.icon.home")
	private WebElement iconteacherhome;

	@FindBy(locator = "dw.teachers.home.txt.search")
	private WebElement txtTeacherHomeSearch;

	@FindBy(locator = "dw.teacher.home.btn.search")
	private WebElement btnTeacherHomeSearch;

	@FindBy(locator = "dw.teachers.home.lnk.myaccount")
	private WebElement lnkMyAccount;

	@FindBy(locator = "dw.teachers.home.myaccount.lnk.profile")
	private WebElement lnkMyAccountProfile;

	@FindBy(locator = "dw.teachers.home.lst.search")
	private List<WebElement> lstTeacherHomeSearch;

	@FindBy(locator = "dw.header.checkout.readingclub.logo")
	private WebElement logoReadingClub;

	@FindBy(locator = "dw.header.checkout.readingclub.Tutorial_DontShowAgain_Link")
	private WebElement Tutorial_DontShowAgain_Link;

	@FindBy(locator = "dw.header.checkout.readingclub.chk.Tutorial_DontShowAgain_Link")
	private List<WebElement> chkTutorial_DontShowAgain_Link;

	@FindBy(locator = "dw.header.checkout.readingclub.chk.Tutorial_CloseIcon")
	private List<WebElement> chkTutorial_CloseIcon;

	@FindBy(locator = "dw.header.checkout.readingclub.chk.Tutorial_CloseIcon")
	private WebElement getTutorial_CloseIcon;


	@FindBy(locator = "dw.header.checkout.readingclub.YesGotoClassRoomOrders_Button")
	private WebElement YesGotoClassRoomOrders_Button;


	@FindBy(locator = "dw.header.checkout.readingclub.chk.YesGotoClassRoomOrders_Button")
	private List<WebElement> chkYesGotoClassRoomOrders_Button;



	@FindBy(locator = "dw.header.checkout.readingclub.DontShowThisAgainClassRoomOrders_Button")
	private WebElement DontShowThisAgainClassRoomOrders_Button;


	@FindBy(locator = "dw.header.checkout.readingclub.chk.DontShowThisAgainClassRoomOrders_Button")
	private List<WebElement> chkDontShowThisAgainClassRoomOrders_Button;

	@FindBy(locator = "dw.teacher.home.teacherdeskoption")
	private WebElement optionteacherhomepageteacherdesk;

	@FindBy(locator = "dw.teacher.home.teacherdeskoption.lnk.view")
	private WebElement lnkviewTeacherDesk;

	@FindBy(locator = "dw.teacher.home.teacherdeskoption.lnk.view")
	private List<WebElement> sizelnkviewTeacherDesk;

	@FindBy(locator = "dw.teacher.home.teacherdeskoption.nosubmit.noship")
	private List<WebElement> sizenosubmittednoshippedTeacherDesk;

	@FindBy(locator = "dw.teacher.home.teacherdeskoption.submit.noship")
	private List<WebElement> sizesubmittednoshippedTeacherDesk;

	@FindBy(locator = "dw.teacher.home.teacherdeskoption.submit.ship")
	private List<WebElement> sizesubmittedshippedTeacherDesk;

	@FindBy(locator = "dw.teacher.home.teacherdeskoption.orderstatus.refno")
	private WebElement teacherdeskorderstatusrefno;

	@FindBy(locator = "dw.teachercatalogue.tab.css")
	private WebElement tabTeacherCatalogues;

	@FindBy(locator = "dw.teachercatalogue.flyer.css")
	private WebElement classRoomRewardFlyer;

	@FindBy(locator = "dw.home.btn.mini.reviewCart")
	private WebElement btn_mini_reviewCart;

	@FindBy(locator = "dw.teacher.home.enterorder.studentflyerorder.delete.item1.reviewcart")
	private WebElement delete_item1_reviewcart;

	@FindBy(locator = "dw.reviewcart.Home_icon_on_header")
	private WebElement Home_icon_on_header;

	@FindBy(locator = "dw.teacher.home.enterorder.studentflyerorder.YES.to.delete.item1.reviewcart")
	private WebElement YES_to_delete_item1_reviewcart;

	@FindBy(locator = "dw.teacher.home.enterorder.studentflyerorder.NO.to.delete.item1.reviewcart")
	private WebElement NO_to_delete_item1_reviewcart;
	
	@FindBy(locator = "dw.teacher.studentflyerorder.btn.radio.SOO.delete.option.Other")
	private WebElement btn_radio_SOO_delete_option_Other;
	
	@FindBy(locator = "dw.teacher.studentflyerorder.btn.DELETE.SOO.item")
	private WebElement btn_DELETE_SOO_item;

	@FindBy(locator = "dw.teacher.teacherdesk.hold.Status.msg")
	private WebElement hold_Status_msg_TeacherDesk;

	@FindBy(locator = "dw.teacher.myaccount.myprofile.name")
	private WebElement teachermyaccountprofilename;

	@FindBy(locator = "dw.checkout.MyAccount.OrderHistory.firstorderdetails.refno")
	private WebElement teachermyaccountorderhistoryrefno;

	@FindBy(locator = "dw.checkout.MyAccount.OrderHistory.firstorderdetails.orderamt")
	private WebElement teachermyaccountorderhistoryorderamt;

	@FindBy(locator = "dw.checkout.MyAccount.OrderHistory.firstorderdetails.vieworder")
	private WebElement teachermyaccountorderhistoryvieworder;

	@FindBy(locator = "dw.teacher.myaccount.payment.expiredcreditcard")
	private WebElement teachermyaccountexpiredcreditcard;

	@FindBy(locator = "dw.teacher.myaccount.myprofile.school")
	private WebElement teachermyaccountprofileschool;

	@FindBy(locator = "dw.teacher.myaccount.myprofile.grade")
	private WebElement teachermyaccountprofilegrade;

	@FindBy(locator = "dw.teacher.teacherdesk.teachename")
	private WebElement teacherdeskteachername;

	@FindBy(locator = "dw.teacher.teacherdesk.schoolname")
	private WebElement teacherdeskteacherschoolname;

	@FindBy(locator = "dw.teacher.teacherdesk.gradename")
	private WebElement teacherdeskteachergradename;

	@FindBy(locator = "dw.teacher.home.myaccountlink")
	private WebElement lnktecherhomemyaccount;

	@FindBy(locator = "dw.teachers.myaccount.myprofile.lnk.edit")
	private WebElement lnkeditmyprofilemyaccountpage;

	@FindBy(locator = "dw.teachers.myaccount.editprofile.txt.emailaddress")
	private WebElement txtemailaddresseditprofilemyaccount;

	@FindBy(locator = "dw.teachers.myaccount.myprofile.txt.emailaddress")
	private WebElement txtemailaddressmyprofilemyaccount;

	@FindBy(locator = "dw.teachers.myaccount.myprofile.btn.save")
	private WebElement btnsaveaddressmyprofilemyaccount;


	//Popup locators
	@FindBy(xpath ="//div/h3[contains(.,'WELCOME BACK TO SCHOOL!')]")
	private WebElement popUpWelcomeBackText;

	@FindBy(id="btsProfileContinue")
	private WebElement popUpWelcomeBackNxtBtn;

	@FindBy(id="dwfrm_profile_customer_email")
	private WebElement popUpEditProfileEmailTextField;

	@FindBy(id="dwfrm_profile_customer_phone")
	private WebElement popUpEditProfilePhoneTextField;

	@FindBy(name = "dwfrm_profile_save")
	private WebElement pupUpEditProfileNextBtn;
	
	@FindBy(xpath="//div[@class='registration-title']")
	private WebElement headerEditYourPref;

	@FindBy(xpath="//span[@class='custom-radio fa']")
	private WebElement pupUpEditYourPreferencesRadioBtnEng1;
	
	
	@FindBy(xpath="//span[@class='label-msg'][(text()='English')]")
	private WebElement labelEnglishRadioBtn;
	
	@FindBy(xpath="//label[@for='dwfrm_profile_customer_comunicationlocale-0']/span[1]")
	private WebElement pupUpEditYourPreferencesRadioBtnEng;
	
	@FindBy(xpath="//label[@for='dwfrm_profile_customer_comunicationlocale-1']/span[1]")
	private WebElement pupUpEditYourPreferencesRadioBtnFrenchBtn;

	@FindBy(xpath="//label[@for='dwfrm_profile_customer_comunicationlocale-1']/span[1]")
	private WebElement pupUpEditYourPreferencesRadioBtnFre;

	@FindBy(name = "dwfrm_profile_save")
	private WebElement popUpEditRoleSaveBtn;

	@FindBy(xpath="//label[@for='dwfrm_profile_customer_termsofuse']/span[2]")
	private WebElement pupUpEditYourPreferencesCheckBoxTermsOfUse;

	@FindBy(xpath="//label[@for='dwfrm_profile_customer_privacypolicy']/span[2]")
	private WebElement pupUpEditYourPreferencesCheckBoxPrivecyPolicy;

	@FindBy(name = "dwfrm_profile_save")
	private WebElement pupUpPrivacyPolicyNextBtn;

	@FindBy(xpath="//div[contains(@class,'ui-draggable registration-flow')]")
	private WebElement popUpEditRole;

	@FindBy(xpath="//div[@class='form-row hide custom-textbox required']/input")
	private List<WebElement> PopUpEditRoleStudentsInputbox;


	@FindBy(xpath = "//button[@class='button-continue save']")
	private WebElement pupUpEditYourPreferencesNextBtn;
	
	@FindBy(id="dwfrm_profile_customer_title")
	private WebElement title;
	
	@FindBy(id="dw.teacher.home.sfo.ytotab")
	private WebElement teacherhomesfoytotab;

	public WebElement getteacherhomesfoytotab() {
		return teacherhomesfoytotab;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getPopUpWelcomeBackText() {
		return popUpWelcomeBackText;
	}

	public WebElement getPopUpWelcomeBackNxtBtn() {
		return popUpWelcomeBackNxtBtn;
	}

	public WebElement getPopUpEditProfileEmailTextField() {
		return popUpEditProfileEmailTextField;
	}

	public WebElement getPopUpEditProfilePhoneTextField() {
		return popUpEditProfilePhoneTextField;
	}

	public WebElement getPupUpEditProfileNextBtn() {
		return pupUpEditProfileNextBtn;
	}

	public WebElement getPupUpEditYourPreferencesRadioBtnEng() {
		return pupUpEditYourPreferencesRadioBtnEng;
	}

	public WebElement getPupUpEditYourPreferencesRadioBtnFre() {
		return pupUpEditYourPreferencesRadioBtnFre;
	}

	public WebElement getPopUpEditRoleSaveBtn() {
		return popUpEditRoleSaveBtn;
	}

	public WebElement getPupUpEditYourPreferencesCheckBoxTermsOfUse() {
		return pupUpEditYourPreferencesCheckBoxTermsOfUse;
	}

	public WebElement getPupUpEditYourPreferencesCheckBoxPrivecyPolicy() {
		return pupUpEditYourPreferencesCheckBoxPrivecyPolicy;
	}

	public WebElement getPupUpPrivacyPolicyNextBtn() {
		return pupUpPrivacyPolicyNextBtn;
	}

	public WebElement getPopUpEditRole() {
		return popUpEditRole;
	}
	public List <WebElement> getPopUpEditRoleStudentsInputbox() {
		return PopUpEditRoleStudentsInputbox;
	}


	public WebElement getPupUpEditYourPreferencesNextBtn() {
		return pupUpEditYourPreferencesNextBtn;
	}

	public WebElement getlnkeditmyprofilemyaccountpage(){
		return lnkeditmyprofilemyaccountpage;
	}

	public WebElement gettxtemailaddresseditprofilemyaccount(){
		return txtemailaddresseditprofilemyaccount;
	}

	public WebElement gettxtemailaddressmyprofilemyaccount(){
		return txtemailaddressmyprofilemyaccount;
	}

	public WebElement getbtnsaveaddressmyprofilemyaccount(){
		return btnsaveaddressmyprofilemyaccount;
	}


	public WebElement getoptionteacherhomepageteacherdesk() {
		return optionteacherhomepageteacherdesk;
	}

	public WebElement getteachermyaccountprofilename() {
		return teachermyaccountprofilename;
	}

	public WebElement getteachermyaccountorderhistoryrefno() {
		return teachermyaccountorderhistoryrefno;
	}

	public WebElement getteachermyaccountorderhistoryorderamt() {
		return teachermyaccountorderhistoryorderamt;
	}

	public WebElement getteachermyaccountorderhistoryvieworder() {
		return teachermyaccountorderhistoryvieworder;
	}

	public WebElement getteachermyaccountexpiredcreditcard() {
		return teachermyaccountexpiredcreditcard;
	}

	public WebElement getlnktecherhomemyaccount() {
		return lnktecherhomemyaccount;
	}

	public WebElement geticonteacherhome() {
		return iconteacherhome;
	}

	public WebElement getteachermyaccountprofileschool() {
		return teachermyaccountprofileschool;
	}

	public WebElement getteachermyaccountprofilegrade() {
		return teachermyaccountprofilegrade;
	}

	public WebElement getteacherdeskteachername() {
		return teacherdeskteachername;
	}

	public WebElement getteacherdeskteacherschoolname() {
		return teacherdeskteacherschoolname;
	}

	public WebElement getteacherdeskteachergradename() {
		return teacherdeskteachergradename;
	}

	public WebElement getClassroomRewardFlyer() {
		return classRoomRewardFlyer;
	}

	public WebElement btn_mini_reviewCart() {
		return btn_mini_reviewCart;
	}

	public WebElement delete_item1_reviewcart() {
		return delete_item1_reviewcart;
	}

	public WebElement Home_icon_on_header() {
		return Home_icon_on_header;
	}

	public WebElement YES_to_delete_item1_reviewcart() {
		return YES_to_delete_item1_reviewcart;
	}

	public WebElement NO_to_delete_item1_reviewcart() {
		return NO_to_delete_item1_reviewcart;
	}

	public WebElement hold_Status_msg_TeacherDesk() {
		return hold_Status_msg_TeacherDesk;
	}

	public WebElement getTeacherCatalogues() {
		return tabTeacherCatalogues;
	}
	
	public WebElement btn_radio_SOO_delete_option_Other() {
		return btn_radio_SOO_delete_option_Other;
	}
	
	public WebElement btn_DELETE_SOO_item() {
		return btn_DELETE_SOO_item;
	}

	public WebElement getapplicationLoader() {
		return applicationLoader;
	}

	public WebElement getLogoReadingClub() {
		return logoReadingClub;
	}

	public WebElement getTxtTeacherHomeSearch() {
		return txtTeacherHomeSearch;
	}

	public WebElement getbtnTeacherHomeSearch() {
		return btnTeacherHomeSearch;
	}

	public List<WebElement> getLstTeacherHomeSearch() {
		return lstTeacherHomeSearch;
	}

	@Override
	public WebElement getBtnTeacherHomeCloseIcon() {
		return btnTeacherHomeCloseIcon;
	}

	public WebElement getBtnEnterOrderClosePopup() {
		return btnEnterOrderClosePopup;
	}

	public List<WebElement> chkBtnEnterOrderClosePopup() {
		return chkbtnEnterOrderClosePopup;
	}

	public WebElement getLblUsername() {
		return lblUsername;
	}

	@Override
	public WebElement getLnkEnterOrder() {
		return lnkEnterOrder;
	}


	@Override
	public List<WebElement> sizelnkEnterOrder() {
		return sizelnkEnterOrder;
	}


	@Override
	public WebElement getmainmenulnkEnterOrder() {
		return mainmenulnkEnterOrder;
	}

	@Override
	public WebElement getmainmenulnkbooksresources() {
		return mainmenulnkbooksresources;
	}

	@Override
	public WebElement getmainmenulnkallflyers() {
		return mainmenulnkallflyers;
	}

	@Override
	public WebElement getflyerallflyersgradeelf() {
		return flyerallflyersgradeelf;
	}

	@Override
	public WebElement getflyerallflyerssplofferssploffers() {
		return flyerallflyerssplofferssploffers;
	}

	@Override
	public WebElement getflyerallflyerssplofferssploffers2() {
		return flyerallflyerssplofferssploffers2;
	}

	@Override
	public WebElement getflyerallflyersfrenchclubdelecture() {
		return flyerallflyersfrenchclubdelecture;
	}

	@Override
	public WebElement getsizemainmenulnkteacherdesk() {
		return mainmenulnkteacherdesk;
	}

	@Override
	public List<WebElement> sizemainmenulnkEnterOrder() {
		return sizemainmenulnkEnterOrder;
	}

	@Override
	public List<WebElement> sizemainmenulnkbooksresources() {
		return sizemainmenulnkbooksresources;
	}

	@Override
	public List<WebElement> sizemainmenulnkallflyers() {
		return sizemainmenulnkallflyers;
	}

	@Override
	public List<WebElement> sizemainmenulnkteacherdesk() {
		return sizemainmenulnkteacherdesk;
	}

	@Override
	public WebElement getLnkShopBookResources() {
		return lnkShopBookResources;
	}

	@Override
	public WebElement getLnkTeacherDesk() {
		return lnkTeacherDesk;
	}

	@Override
	public WebElement getLblWelcomeText() {
		return lblWelcomeText;
	}

	public List<WebElement> getLstMarketingImg() {
		return lstMarketingImg;
	}

	@Override
	public WebElement getLblMarketingMsgTitle() {
		return lblMarketingMsgTitle;
	}

	public WebElement getLnkMyAccount() {
		return lnkMyAccount;
	}

	public WebElement getLnkMyAccountProfile() {
		return lnkMyAccountProfile;
	}

	public WebElement getTutorial_DontShowAgain_Link() {
		return Tutorial_DontShowAgain_Link;
	}

	public List<WebElement> chkTutorial_DontShowAgain_Link() {
		return chkTutorial_DontShowAgain_Link;
	}

	public List<WebElement> chkTutorial_CloseIcon() {
		return chkTutorial_CloseIcon;
	}

	public WebElement getTutorial_CloseIcon() {
		return getTutorial_CloseIcon;
	}

	public WebElement getYesGotoClassRoomOrders_Button() {
		return YesGotoClassRoomOrders_Button;
	}

	public List<WebElement> chkYesGotoClassRoomOrders_Button() {
		return chkYesGotoClassRoomOrders_Button;
	}

	public WebElement getDontShowThisAgainClassRoomOrders_Button() {
		return DontShowThisAgainClassRoomOrders_Button;
	}

	public List<WebElement> chkDontShowThisAgainClassRoomOrders_Button() {
		return chkDontShowThisAgainClassRoomOrders_Button;
	}

	public WebElement getlnkviewTeacherDesk() {
		return lnkviewTeacherDesk;
	}

	public List<WebElement> getsizelnkviewTeacherDesk() {
		return sizelnkviewTeacherDesk;
	}

	public List<WebElement> getsizenosubmittednoshippedTeacherDesk() {
		return sizenosubmittednoshippedTeacherDesk;
	}

	public List<WebElement> getsizesubmittednoshippedTeacherDesk() {
		return sizesubmittednoshippedTeacherDesk;
	}

	public List<WebElement> getsizesubmittedshippedTeacherDesk() {
		return sizesubmittedshippedTeacherDesk;
	}

	public WebElement getteacherdeskorderstatusrefno() {
		return teacherdeskorderstatusrefno;
	}


	@Override
	public void openPage() {
		// Code to open TCOOL page after teacher login
	}

	@Override
	protected void initParent() {
		parent = new LoginPage();
	}

	@Override
	public boolean isPageActive() {
		return false;
	}

	@Override
	public void launchPage() {
		openPage();
	}

	@Override
	public void waitForPageLoad() {
		PauseUtil.pause(3000);
		try {
			WaitUtils.waitForEnabled(getBtnTeacherHomeCloseIcon());
			if (getBtnTeacherHomeCloseIcon().isDisplayed())
				getBtnTeacherHomeCloseIcon().click();
		} catch (Exception e) {
			PauseUtil.pause(1000);
		}
		WaitUtils.waitForDisplayed(getTxtTeacherHomeSearch());
	}

	/**
	 * @author infostretch This Method is use for select Option From Teacher
	 *         Home Page The Option Can Be Enter Orders, Shop Book And
	 *         Resouces,Teacher Desk
	 * @param option
	 *            select option(Enter Order,ShopBookAndResources,TeacherDesk)
	 *            from teacher home page
	 */
	@Override
	public void selectOptionFromTeacherHomePage(String option) {
		PauseUtil.pause(1000);
		if (ConstantUtils.ENTERORDER.equalsIgnoreCase(option)) {
			SCHUtils.waitForElementToBeClickable(getLnkEnterOrder(), 60);
			SCHUtils.clickUsingJavaScript(getLnkEnterOrder());
			// getLnkEnterOrder().click();
		}
		PauseUtil.pause(4500);
		//WaitUtils.waitForNotDisplayed(getapplicationLoader());
		/*else if (SCHUtils.isPresent(getBtnTeacherHomeCloseIcon())) {
			SCHUtils.clickUsingJavaScript(getBtnTeacherHomeCloseIcon());
			PauseUtil.pause(3000);
		}
		 else if (ConstantUtils.SHOP_BOOK_AND_RESOURCES.equalsIgnoreCase(option)) {
			SCHUtils.clickUsingJavaScript(
					SCHUtils.waitForElementToBeClickable(getLnkShopBookResources(), 60));
			// getLnkShopBookResources().click();

		} else {
			SCHUtils.clickUsingJavaScript(
					SCHUtils.waitForElementToBeClickable(getLnkTeacherDesk(), 60));
			// getLnkTeacherDesk().click();
		}*/
		//PauseUtil.pause(2000);
		// Need to keep condition with is present


		if(chkBtnEnterOrderClosePopup().size()!=0){
			SCHUtils.clickUsingJavaScript(getBtnEnterOrderClosePopup());
			PauseUtil.pause(3000);
		}
		/*if (SCHUtils.isPresent(getBtnEnterOrderClosePopup())) {
			SCHUtils.clickUsingJavaScript(getBtnEnterOrderClosePopup());
		}*/
		if(chkTutorial_DontShowAgain_Link().size()!=0){
			SCHUtils.clickUsingJavaScript(getTutorial_DontShowAgain_Link());
			PauseUtil.pause(3000);
		}

		/*if (SCHUtils.isPresent(getTutorial_DontShowAgain_Link())) {
			SCHUtils.clickUsingJavaScript(getTutorial_DontShowAgain_Link());
			PauseUtil.pause(3000);
		}*/
		if(chkDontShowThisAgainClassRoomOrders_Button().size()!=0){
			SCHUtils.clickUsingJavaScript(getDontShowThisAgainClassRoomOrders_Button());
			PauseUtil.pause(3000);
		}


		if(chkYesGotoClassRoomOrders_Button().size()!=0){
			SCHUtils.clickUsingJavaScript(getYesGotoClassRoomOrders_Button());
			PauseUtil.pause(3000);
		}
		if(chkDontShowThisAgainClassRoomOrders_Button().size()!=0){
			SCHUtils.clickUsingJavaScript(getDontShowThisAgainClassRoomOrders_Button());
			PauseUtil.pause(3000);
		}

		if(chkTutorial_DontShowAgain_Link().size()!=0){
			SCHUtils.clickUsingJavaScript(getTutorial_DontShowAgain_Link());
			PauseUtil.pause(3000);
		}


		/*if (SCHUtils.isPresent(getYesGotoClassRoomOrders_Button())) {
			SCHUtils.clickUsingJavaScript(getYesGotoClassRoomOrders_Button());
			PauseUtil.pause(3000);
		}*/
		//WaitUtils.waitForNotDisplayed(getapplicationLoader());
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(3500);
		PauseUtil.pause(1500);


	}



	@Override
	public void selectOptionFromTeacherHomePage1(String option) {
		PauseUtil.pause(1000);
		if (ConstantUtils.ENTERORDER.equalsIgnoreCase(option)) {
			SCHUtils.waitForElementToBeClickable(getmainmenulnkEnterOrder(), 15);
			SCHUtils.clickUsingJavaScript(getmainmenulnkEnterOrder());
			// getLnkEnterOrder().click();
		}
		PauseUtil.pause(4500);
		//WaitUtils.waitForNotDisplayed(getapplicationLoader());
		/*else if (SCHUtils.isPresent(getBtnTeacherHomeCloseIcon())) {
			SCHUtils.clickUsingJavaScript(getBtnTeacherHomeCloseIcon());
			PauseUtil.pause(3000);
		}
		 else if (ConstantUtils.SHOP_BOOK_AND_RESOURCES.equalsIgnoreCase(option)) {
			SCHUtils.clickUsingJavaScript(
					SCHUtils.waitForElementToBeClickable(getLnkShopBookResources(), 60));
			// getLnkShopBookResources().click();

		} else {
			SCHUtils.clickUsingJavaScript(
					SCHUtils.waitForElementToBeClickable(getLnkTeacherDesk(), 60));
			// getLnkTeacherDesk().click();
		}*/
		//PauseUtil.pause(2000);
		// Need to keep condition with is present


		if(chkBtnEnterOrderClosePopup().size()!=0){
			SCHUtils.clickUsingJavaScript(getBtnEnterOrderClosePopup());
			PauseUtil.pause(3000);
		}
		/*if (SCHUtils.isPresent(getBtnEnterOrderClosePopup())) {
			SCHUtils.clickUsingJavaScript(getBtnEnterOrderClosePopup());
		}*/
		if(chkTutorial_DontShowAgain_Link().size()!=0){
			SCHUtils.clickUsingJavaScript(getTutorial_DontShowAgain_Link());
			PauseUtil.pause(3000);
		}

		/*if (SCHUtils.isPresent(getTutorial_DontShowAgain_Link())) {
			SCHUtils.clickUsingJavaScript(getTutorial_DontShowAgain_Link());
			PauseUtil.pause(3000);
		}*/
		if(chkDontShowThisAgainClassRoomOrders_Button().size()!=0){
			SCHUtils.clickUsingJavaScript(getDontShowThisAgainClassRoomOrders_Button());
			PauseUtil.pause(3000);
		}


		if(chkYesGotoClassRoomOrders_Button().size()!=0){
			SCHUtils.clickUsingJavaScript(getYesGotoClassRoomOrders_Button());
			PauseUtil.pause(3000);
		}
		if(chkDontShowThisAgainClassRoomOrders_Button().size()!=0){
			SCHUtils.clickUsingJavaScript(getDontShowThisAgainClassRoomOrders_Button());
			PauseUtil.pause(3000);
		}

		if(chkTutorial_DontShowAgain_Link().size()!=0){
			SCHUtils.clickUsingJavaScript(getTutorial_DontShowAgain_Link());
			PauseUtil.pause(3000);
		}


		/*if (SCHUtils.isPresent(getYesGotoClassRoomOrders_Button())) {
			SCHUtils.clickUsingJavaScript(getYesGotoClassRoomOrders_Button());
			PauseUtil.pause(3000);
		}*/
		//WaitUtils.waitForNotDisplayed(getapplicationLoader());
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(3500);
		PauseUtil.pause(1500);


	}



	@Override
	public void selectOptionFromTeacherHomePage_Driver(String option) {
		PauseUtil.pause(1000);
		WebDriver driver=TestBaseProvider.getTestBase().getDriver();

		String enterorder = "img[src*='orders']";
		String logincloseicon = "//a[@class='close dialog-close']";

		if (ConstantUtils.ENTERORDER.equalsIgnoreCase(option)) {
			PauseUtil.pause(4000);
			driver.findElement(By.cssSelector(enterorder)).click();
			PauseUtil.pause(4500);
		}

		if(driver.findElements(By.xpath(logincloseicon)).size()!=0){
			driver.findElement(By.xpath(logincloseicon)).click();
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(10000);
		}

		/*if(chkTutorial_DontShowAgain_Link().size()!=0){
        	SCHUtils.clickUsingJavaScript(getTutorial_DontShowAgain_Link());
        	PauseUtil.pause(3000);
        }


        if(chkDontShowThisAgainClassRoomOrders_Button().size()!=0){
        	SCHUtils.clickUsingJavaScript(getDontShowThisAgainClassRoomOrders_Button());
        	PauseUtil.pause(3000);
        }


        if(chkYesGotoClassRoomOrders_Button().size()!=0){
        	SCHUtils.clickUsingJavaScript(getYesGotoClassRoomOrders_Button());
        	PauseUtil.pause(3000);
        }
        if(chkDontShowThisAgainClassRoomOrders_Button().size()!=0){
        	SCHUtils.clickUsingJavaScript(getDontShowThisAgainClassRoomOrders_Button());
        	PauseUtil.pause(3000);
        }

        if(chkTutorial_DontShowAgain_Link().size()!=0){
        	SCHUtils.clickUsingJavaScript(getTutorial_DontShowAgain_Link());
        	PauseUtil.pause(3000);
        }

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(3500);
        PauseUtil.pause(1500);*/


	}



	public void SelectOptionFromTeacherHomePage() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);

		getoptionteacherhomepageteacherdesk().click();

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
	}


	@Override
	public void ReadTeacherDetailsFromMyAccountPage() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(5000);
		if(chkTutorial_DontShowAgain_Link().size()!=0){
			SCHUtils.clickUsingJavaScript(getTutorial_DontShowAgain_Link());
			PauseUtil.pause(3000);
		}
		PauseUtil.pause(2000);

		getTestBase().getContext().setProperty("testexecution.myaccount.profilename",
				String.valueOf(getteachermyaccountprofilename().getText()));
		getTestBase().getContext().setProperty("testexecution.myaccount.schoolname",
				String.valueOf(getteachermyaccountprofileschool().getText()));

		getTestBase().getContext().setProperty("testexecution.myaccount.grade",
				String.valueOf(getteachermyaccountprofilegrade().getText()));

		PauseUtil.pause(5000);
		//SCHUtils.scrollToView(geticonteacherhome());
		//PauseUtil.pause(5000);
		geticonteacherhome().click();

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(8000);



	}




	@Override
	public void teacher_check_expired_creditcard() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(5000);
		//String expiredcard = getteachermyaccountexpiredcreditcard().getText();
		AssertUtils.assertTextMatches(getteachermyaccountexpiredcreditcard(), Matchers.equalToIgnoringCase("EXPIRED"));


	}




	@Override
	public void teacher_navigates_to_homepage_from_myaccountpage() {

		PauseUtil.pause(5000);
		/*SCHUtils.scrollToView(geticonteacherhome());
		PauseUtil.pause(2000);*/
		geticonteacherhome().click();

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(8000);


	}


	@Override
	public void user_clicks_on_mini_Reviewcart() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		WebDriver driver=TestBaseProvider.getTestBase().getDriver();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(btn_mini_reviewCart()));

		element.click();
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(5000);
		//btn_mini_reviewCart().click();
	}

	@Override
	public void user_do_the_empty_cart() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(4000);

		String cart_val=btn_mini_reviewCart().getText();
		cart_val=cart_val.trim();
		int cart_val2=Integer.parseInt(cart_val);
		System.out.println("################Cart Val is:"+cart_val2);

		if (cart_val2!=0) {
			btn_mini_reviewCart().click();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(3000);
			pcod_logpage.parent_delete_freepick_coupon_shoppingcart();
			PauseUtil.pause(1500);
			do {
				delete_item1_reviewcart().click();
				PauseUtil.pause(2000);
				YES_to_delete_item1_reviewcart().click();
				PauseUtil.pause(8000);
				try {
					delete_item1_reviewcart().isDisplayed();
				} catch (Exception e) {
					System.out.println("################Cart is empty");
					SCHUtils.clickUsingJavaScript(Home_icon_on_header());
					//Home_icon_on_header().click();
					PauseUtil.pause(10000);
					break;
				}
			} while (delete_item1_reviewcart().isDisplayed());


		} else {
			System.out.println("No items in cart");
		}

	}
	
	
	@Override
	public void user_do_the_empty_soo_cart() {
		StudentOnlineOrdersPage studonlinepage = new StudentOnlineOrdersPage();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(4000);

		String cart_val=btn_mini_reviewCart().getText();
		cart_val=cart_val.trim();
		int cart_val2=Integer.parseInt(cart_val);
		System.out.println("################Cart Val is:"+cart_val2);

		if (cart_val2!=0) {
			btn_mini_reviewCart().click();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(3000);
			pcod_logpage.parent_delete_freepick_coupon_shoppingcart();
			PauseUtil.pause(1500);
			do {
				delete_item1_reviewcart().click();
				PauseUtil.pause(2000);
				SCHUtils.clickUsingJavaScript(studonlinepage.getDeleteItemOption(TestBaseProvider.getTestBase().getTestData().getString("option")));
				AssertUtils.assertEnabled(studonlinepage.getBtnDelete());
				SCHUtils.clickUsingJavaScript(studonlinepage.getBtnDelete());
				PauseUtil.pause(2500);
				try {
					delete_item1_reviewcart().isDisplayed();
				} catch (Exception e) {
					System.out.println("################Cart is empty");
					//SCHUtils.clickUsingJavaScript(Home_icon_on_header());
					//Home_icon_on_header().click();
					PauseUtil.pause(2500);
					break;
				}
			} while (delete_item1_reviewcart().isDisplayed());


		} else {
			System.out.println("No items in cart");
		}

	}

	@Override
	public void verify_hold_status_msg_T_displayed_TeacherDesk() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String msg_exp=hold_Status_msg_TeacherDesk().getText();
		String msg_act="-There is a problem with your account. Your new and pending orders are on hold and will not ship. Please contact Customer Service at 1-800-268-3860 or custserve@scholastic.ca to resolve the issue.";

		Assert.assertEquals(msg_act, msg_exp, "hold Status msg is displayed incorrect in TeacherDesk page");
	}

	@Override
	public void verify_hold_status_msg_P_displayed_TeacherDesk() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String msg_exp=hold_Status_msg_TeacherDesk().getText();
		String msg_act="-Your order(s) will ship once payment is confirmed. If you pay by cheque, order(s) will ship once cheques are received.";

		Assert.assertEquals(msg_act, msg_exp, "hold Status msg is displayed incorrect in TeacherDesk page");
	}

	@Override
	public void verify_alert_message_displayed_TeacherDesk() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		Assert.assertTrue(hold_Status_msg_TeacherDesk().isDisplayed(), "alert message is not displayed in Teacher Desk page");
	}

	@Override
	public void ReadTeacherDetailsFromTeacherDesk() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(5000);

		String myaccountteachername = TestBaseProvider.getTestBase().getTestData().getString("teachername");


		String myaccountschoolname = TestBaseProvider.getTestBase().getTestData().getString("schoolname");

		/*String myaccountschoolgrade = TestBaseProvider.getTestBase().getContext()
				.getProperty("testexecution.myaccount.grade").toString();*/

		System.out.println("my acount tech name: "+myaccountteachername);
		System.out.println("my acount school name: "+myaccountschoolname);
		//System.out.println("my acount grade name: "+myaccountschoolgrade);

		String teacherdesk_tchname         = getteacherdeskteachername().getText();
		String teacherdesk_tchschoolname   = getteacherdeskteacherschoolname().getText().toLowerCase();
		String teacherdesk_tchgradename    = getteacherdeskteachergradename().getText();


		System.out.println("teach desk tech name: "+teacherdesk_tchname);
		System.out.println("teach desk school name: "+teacherdesk_tchschoolname);
		System.out.println("teach desk grade name: "+teacherdesk_tchgradename);


		Assert.assertEquals(myaccountteachername, teacherdesk_tchname, "Teacher name is incorrect");
		Assert.assertEquals(myaccountschoolname, teacherdesk_tchschoolname, "Teacher school name is incorrect");
		//Assert.assertEquals(myaccountschoolgrade, teacherdesk_tchgradename, "Teacher grade is incorrect");



	}



	@Override
	public void ReadTeacherProfileName_MyAccount() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(5000);
		ReadTeacherDetailsFromMyAccountPage();
		String myaccountteachername = TestBaseProvider.getTestBase().getContext()
				.getProperty("testexecution.myaccount.profilename").toString();

		System.out.println("my acount tech name: "+myaccountteachername);

		String teacherdesk_tchname = TestBaseProvider.getTestBase().getTestData().getString("teacherProfileName");

		System.out.println("Test data read tech name: "+teacherdesk_tchname);
		Assert.assertEquals(myaccountteachername, teacherdesk_tchname, "Teacher name is incorrect");



	}

	@Override
	public void myProfilePage() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(5000);
		ReadTeacherDetailsFromMyAccountPage();
	}


	@Override
	public void ReadOrderHistory_FirstOrder_MyAccount() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(5000);

		String myaccountteacherorderrefno = TestBaseProvider.getTestBase().getContext()
				.getProperty("testexecution.confirmationpage.orderrefno").toString();

		String myaccountteacherorderamt = TestBaseProvider.getTestBase().getContext()
				.getProperty("testexecution.confirmationpage.orderamt").toString();

		System.out.println("Confirmation page order refno: "+myaccountteacherorderrefno);

		System.out.println("Confirmation page order orderamt: "+myaccountteacherorderamt);

		String teacher_myAcc_orderrefno = getteachermyaccountorderhistoryrefno().getText();

		String teacher_myAcc_orderamt = getteachermyaccountorderhistoryorderamt().getText();

		System.out.println("My Account order Ref no: "+teacher_myAcc_orderrefno);

		System.out.println("My Account order amt: "+teacher_myAcc_orderamt);

		AssertUtils.assertTextMatches(getteachermyaccountorderhistoryrefno(),
				Matchers.containsString(myaccountteacherorderrefno));

		AssertUtils.assertTextMatches(getteachermyaccountorderhistoryorderamt(),
				Matchers.containsString(myaccountteacherorderamt));

		//Assert.assertEquals(myaccountteacherorderrefno, teacher_myAcc_orderrefno, "Order Ref no is not matching in My Account page with confirmation page");

		//Assert.assertEquals(myaccountteacherorderamt, teacher_myAcc_orderamt, "Order Amt no is not matching in My Account page with confirmation page");


	}


	@Override
	public void verify_ordernumber_orderamount_orderhistorypage(Configuration testData) {
		CheckoutPage chkpge = new CheckoutPage();
		ConfirmAndSubmitOrder confirmAndSubmitOrder =
				getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(5000);

		String teacher_myAcc_orderamt = chkpge.user_verify_TotalAmt_ConfirmationPage();
		teacher_myAcc_orderamt = teacher_myAcc_orderamt.substring(1);

		String teacher_myAcc_orderrefno = confirmAndSubmitOrder.getLblReferenceNumberOnOrderConfirmationPage().getText().trim();

		System.out.println("My Account order Ref no: "+teacher_myAcc_orderrefno);

		System.out.println("My Account order amt: "+teacher_myAcc_orderamt);

		String myaccountteacherorderrefno = testData.getString("exp_ordernumber");
		String myaccountteacherorderamt =  testData.getString("exp_orderamount");

		if(!teacher_myAcc_orderrefno.equals(myaccountteacherorderrefno)){
			Assert.fail("Order number is not matching in confirmation page with order history page");
		}

		if(!teacher_myAcc_orderamt.equals(myaccountteacherorderamt)){
			Assert.fail("Order amount is not matching in confirmation page with order history page");
		}

	}
	/**
	 * This Method Verify username is present with welcome title
	 * 
	 * @param username
	 *            : give user name for verification in teacher home page
	 */
	@Override
	public void verifyUserName(String username) {
		AssertUtils.assertTextMatches(getLblUsername(),
				Matchers.equalToIgnoringCase(username));
	}

	@Override
	public void verifyPage() {
		try {
			WaitUtils.waitForEnabled(getBtnTeacherHomeCloseIcon());
			getBtnTeacherHomeCloseIcon().click();
		} catch (Exception e) {
		}
		/*Configuration data = TestBaseProvider.getTestBase().getTestData();
		if (data.getString("lastname") != null && data.getString("title") != null) {
			verifyUserName(data.getString("title") + " " + data.getString("lastname"));
		}*/
		getLnkEnterOrder().isDisplayed();
		getLnkShopBookResources().isDisplayed();
		getLnkTeacherDesk().isDisplayed();
		getLblWelcomeText().isDisplayed();
	}

	@Override
	public void searchForItem(String item) {
		waitForPageLoad();
		WaitUtils.waitForDisplayed(getTxtTeacherHomeSearch());
		getTxtTeacherHomeSearch().sendKeys(item);
		PauseUtil.pause(3000);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getLstTeacherHomeSearch().get(0).click();
		PauseUtil.pause(3000);
	}

	@Override
	public void navigateToProfilePage() {
		WaitUtils.waitForEnabled(getLnkMyAccount());
		lnkMyAccount.click();
		WaitUtils.waitForDisplayed(pcod_homePage.getselectProfile_Myacc());
		PauseUtil.pause(1000);
		//WaitUtils.waitForEnabled(getLnkMyAccountProfile());
		//getLnkMyAccountProfile().click();
		pcod_homePage.getselectProfile_Myacc().click();

	}

	@Override
	public void clickOnReadingClub() {
		getLogoReadingClub().click();
	}

	@Override
	public void clickOnTeacherCatalgoues() {
		getTeacherCatalogues().click();

	}

	@Override
	public void clickOnClassroomRewardCataloguesFlyer() {

		getClassroomRewardFlyer().click();
	}

	@Override
	public void clickOrderView_MyAccountPage(){
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(10000);
		getteachermyaccountorderhistoryvieworder().click();	

	}

	@Override
	public void click_viewdetails_orderhistory_MyAccountPage(Configuration testData){
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(5000);

		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		WebElement ele = driver.findElement(By.xpath("//table[@id='OrderHistoryTable']/tbody"));
		List<WebElement> allrows = ele.findElements(By.tagName("tr"));
		System.out.println("in1");
		for(WebElement row: allrows){
			System.out.println("In2");
			List<WebElement> Cells = row.findElements(By.tagName("td"));
			for(WebElement Cell:Cells){

				if (Cell.getText().contains(testData.getString("ordernumber"))){ 
					row.findElement(By.className("details")).findElement(By.className("link")).findElement(By.tagName("a")).click();   
					PauseUtil.pause(5000);
					System.out.println("In3");
					break;
					
				}
			}
		}

	}
	//  Story SCSCOD-3919

	@FindBy(locator = "dw.teacher.home.page.zerosearchresult")
	private WebElement imgMagGlass;

	@FindBy(locator = "dw.teacher.searchResult.page.searchbar")
	private WebElement secSearchBar;

	@FindBy(locator="dw.teacher.searchResult2.page.text")
	private WebElement text_secsearch_Result;

	public WebElement getimgMagGlass(){
		return imgMagGlass;
	}

	public WebElement get2searchBar(){
		return secSearchBar;
	}

	public WebElement gettext_secsearch_Result(){
		return text_secsearch_Result;
	}

	@Override
	public void verifySearchResultPage() {

		// get the url of the page and check if search is present

		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		String url = driver.getCurrentUrl();
		if(!url.contains("search"))
		{
			Assert.fail("Search Result page is not diplayed.Url of page is "+url);;
		}
		else {
			Assert.assertTrue(true, "The Search Result Page is displayed");
		}
	}


	@Override 
	public void valdiate0searchPg(){
		// get the magnifying image
		try {
			AssertUtils.assertDisplayed(getimgMagGlass());
			Assert.assertTrue(true, "The Magnifying Glass Search Image is displayed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail("Expected search result page is not displayed");

		}

	}


	@Override
	public void search_with_sec_searchBar(String svalue){
		waitForPageLoad();
		WaitUtils.waitForDisplayed(get2searchBar());
		secSearchBar.sendKeys(svalue);
		secSearchBar.sendKeys(Keys.RETURN);		

	}

	@Override
	public String  getsecondSearchResultPg(){
		waitForPageLoad();
		String ptext = gettext_secsearch_Result().getText();
		System.out.println("text from the second search result page..."+ptext);


		if(!ptext.contains("Narrow Your Search By:"))
		{
			Assert.fail("Expected search result page is not displayed");
		}
		else {
			Assert.assertTrue(true, "The valid Search Result Page is displayed");
		}
		return ptext;
	}


	public void selectviewteacherdesk() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		TeachersHomePage teacherhomepage = new TeachersHomePage();
		if(teacherhomepage.chkTutorial_CloseIcon().size()!=0){
			SCHUtils.clickUsingJavaScript(teacherhomepage.getTutorial_CloseIcon());
			PauseUtil.pause(3000);
		}

		getlnkviewTeacherDesk().click();

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
	}


	public void teacherdesk_view_orderdetailspage() {
		ConfirmAndSubmitOrder confirmAndSubmitOrderPage =
				getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		String expected_order = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.confirmationpage.orderrefno").toString().trim();
		String actual_order = confirmAndSubmitOrderPage.getorderrefnoviewConfirmationpage().getText().trim();
		if(!expected_order.equals(actual_order)){
			Assert.fail("View option in Teacher desk not navigating to recent order");
		}
	}


	public void check_for_no_viewlink_teacherdeskpage() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		Assert.assertFalse(getsizelnkviewTeacherDesk().size() > 0);	
	}


	public void check_for_nosubmit_noship_teacherdeskpage() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		Assert.assertTrue(getsizenosubmittednoshippedTeacherDesk().size() > 0);	
	}


	public void check_for_submit_noship_teacherdeskpage() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		Assert.assertTrue(getsizesubmittednoshippedTeacherDesk().size() > 0);	
	}

	public void check_for_submit_ship_teacherdeskpage() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		// to close the guided tutorial
		TeachersHomePage teacherhomepage = new TeachersHomePage();
		if(teacherhomepage.chkTutorial_CloseIcon().size()!=0){
			SCHUtils.clickUsingJavaScript(teacherhomepage.getTutorial_CloseIcon());
			PauseUtil.pause(3000);
		}
		Assert.assertTrue(getsizesubmittedshippedTeacherDesk().size() > 0);	
	}


	public void verify_orderrefno_teacherdesk_orderstatus() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		String expected_order = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.confirmationpage.orderrefno").toString().trim();
		String actual_order = getteacherdeskorderstatusrefno().getText().trim();
		if(!expected_order.equals(actual_order)){
			Assert.fail("Order Ref no in Teacher's Desk under Order status is not correct");
		}
	}


	@Override
	public void verify_homepage() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Assert.assertEquals(sizelnkEnterOrder().size() > 0, true);

	}

	@Override
	public void verify_globalmainmenu() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Assert.assertEquals(sizemainmenulnkEnterOrder().size() > 0, true);
		Assert.assertEquals(sizemainmenulnkbooksresources().size() > 0, true);
		Assert.assertEquals(sizemainmenulnkallflyers().size() > 0, true);
		Assert.assertEquals(sizemainmenulnkteacherdesk().size() > 0, true);

	}



	@Override
	public void verify_pdp_longAndShortDescription() {
		ProductDetailPage prodpage = new ProductDetailPage();
		String productshortdesc = prodpage.getdescshortdescpdp().getText();
		String[] lines = productshortdesc.split("\\r?\\n");
		for (String line : lines) {
			System.out.println(line);
		}
		String productlongdesc = prodpage.getdesclongdescpdp().getText();

		System.out.println("short desc:" + productshortdesc.length());
		System.out.println("short desc>>>>>:"+productshortdesc);
		System.out.println("long desc:" + productlongdesc.length());
		System.out.println("long desch>>>>"+productlongdesc);

		if (productshortdesc.length() == productlongdesc.length())
		{
			Assert.fail("Product short description is equal to  product long description in PDP page");
		}

		if (productshortdesc.length() > productlongdesc.length())
		{
			Assert.fail("Product short description is greater than product long description in PDP page");
		}

		String actual_productshortdesc = lines[1];
		System.out.println("array result of [1]"+lines[1]);
		String exp_productshortdesc = TestBaseProvider.getTestBase().getTestData().getString("pdpshortdesc");

		String actual_productlongdesc = productlongdesc;
		String exp_productlongdesc = TestBaseProvider.getTestBase().getTestData().getString("pdplongdesc");

		if(!actual_productshortdesc.contains(exp_productshortdesc))
		{
			Assert.fail("Short description for the product in PDP page is incorrect. It should have been  : "+exp_productshortdesc);	
		}

		if(!actual_productlongdesc.equals(exp_productlongdesc))
		{
			Assert.fail("Long description for the product in PDP page is incorrect. It should have been  : "+exp_productlongdesc);	
		}

	}

	@Override
	public void click_edit_myprofile_myaccountpage(){
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		getlnkeditmyprofilemyaccountpage().click();
		PauseUtil.pause(2000);

	}

	@Override
	public void click_save_myprofile_myaccountpage(){
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		getbtnsaveaddressmyprofilemyaccount().click();
		PauseUtil.pause(2000);

	}

	@Override
	public void enter_emailaddress_myprofile_myaccountpage(Configuration testData){
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		gettxtemailaddresseditprofilemyaccount().clear();
		PauseUtil.pause(1000);
		gettxtemailaddresseditprofilemyaccount().sendKeys(testData.getString("myprofile_emailaddress"));
		PauseUtil.pause(2000);

	}

	@Override
	public void verify_editprofile_myprofile_myaccountpage(Configuration testData){
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		String exp_email = testData.getString("myprofile_emailaddress");
		String act_email = gettxtemailaddressmyprofilemyaccount().getText();
		System.out.println("email address from Profile"+act_email);
		if(!exp_email.equals(act_email)){
			Assert.fail("Updated email is not reflecting correctly in Edit Profile window");
		}
	}

	@Override
	public void verify_emailcase_myprofile_myaccountpage(Configuration testData){
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		String exp_email = testData.getString("myprofile_emailaddress").toLowerCase();
		String act_email = gettxtemailaddressmyprofilemyaccount().getText();
		System.out.println("email address from Profile"+act_email);
		if(!exp_email.equals(act_email)){
			Assert.fail("Updated email is not reflecting in lowercase in Edit Profile window");
		}
	}

	@Override
	public void YES_to_delete_item_in_ReviewCart_page(){
		PauseUtil.pause(1000);
		SCHUtils.clickUsingJavaScript(YES_to_delete_item1_reviewcart());
	}

	@Override
	public void handleBack2SchoolPopup(String local) {
		
		
		try {
			if(getPopUpWelcomeBackText().isDisplayed()){
				getPopUpWelcomeBackNxtBtn().click();
				
				/*Select sel = new Select(getTitle());
				sel.selectByVisibleText("Mrs.");*/
				
				//Enter email, phone and click nexet
				String emailId = RandomDataUtil.getRandomEmailId();
				getPopUpEditProfileEmailTextField().clear();
				//PauseUtil.pause(5000);
				getPopUpEditProfileEmailTextField().sendKeys(emailId);
				PauseUtil.pause(5000);
				//getPopUpEditProfilePhoneTextField().sendKeys("3333333333" + Keys.TAB);
				getPopUpEditProfilePhoneTextField().clear();
				getPopUpEditProfilePhoneTextField().sendKeys("226-121-4455");
				getPopUpEditProfilePhoneTextField().sendKeys(Keys.TAB);
				//PauseUtil.pause(5000);
				getPupUpEditProfileNextBtn().click();
				//PauseUtil.pause(10000);
				//Select/click Radio button
				
				if(local=="english") {
					getPupUpEditYourPreferencesRadioBtnEng().click();
				}else {
					getPupUpEditYourPreferencesRadioBtnFre().click();
				}
				
				System.out.println(getPupUpEditYourPreferencesRadioBtnEng().isSelected());
					
				//Click next button
				getPopUpEditRoleSaveBtn().click();
				//PauseUtil.pause(8000);
				//Edit Your Preferances popup screen

				getPupUpEditYourPreferencesCheckBoxTermsOfUse().click();
				getPupUpEditYourPreferencesCheckBoxPrivecyPolicy().click();
				getPupUpPrivacyPolicyNextBtn().click();

				//Edit Role popup screen
				SCHUtils.waitForElementToBeDisplayed(getPopUpEditRole(),30);
				getPopUpEditRole().isDisplayed();
				System.out.println("***************POPUPDISPLAYED**************");
				int popUpstudentBox = getPopUpEditRoleStudentsInputbox().size();
				System.out.println("***********SIZE OF INPUT BOX********"+popUpstudentBox);
				getPopUpEditRoleStudentsInputbox().get(popUpstudentBox-1).clear();
				getPopUpEditRoleStudentsInputbox().get(popUpstudentBox-1).sendKeys("20",Keys.TAB);
				SCHUtils.waitForElementToBeClickable(getPupUpEditYourPreferencesNextBtn(), 30);
				getPupUpEditYourPreferencesNextBtn().click();
			}
		} catch (Exception e) {
			System.out.println("Back to school popup not coming up, it might already been handled for this account");
		}	
	}
	
	@FindBy(locator="dw.teacherdesk.viewsubmit.link")
	private WebElement teacherDesk_view_submit_link;
	
	@FindBy(locator="dw.tcod.profile.teachername")
	private WebElement tcod_profile_teachername;
	
	@FindBy(locator="dw.tcod.profile.schoolname")
	private WebElement tcod_profile_schoolname;
	
	@FindBy(locator="dw.tcod.profile.schooladdress2")
	private WebElement tcod_profile_schooladdress2;
	
	@FindBy(locator="dw.tcod.profile.schooladdress1")
	private WebElement tcod_profile_schooladdress1;
	
	public WebElement getTCODProfileSchoolAddress1() {
		return tcod_profile_schooladdress1;
	}
	
	public WebElement getTCODProfileTeacherName() {
		return tcod_profile_teachername;
	}
	
	public WebElement getTCODProfileSchoolName() {
		return tcod_profile_schoolname;
	}
	
	public WebElement getTCODProfileSchoolAddress2() {
		return tcod_profile_schooladdress2;
	}
	
	public WebElement getTeacherDeskViiewSubmitLink() {
		return teacherDesk_view_submit_link;
	}
	
	@Override
	public void clicks_View_Submit_link_TeachersDesk(){
		PauseUtil.pause(2000);
		getTeacherDeskViiewSubmitLink().click();
	}
	
	@Override
	public String get_teacher_account_from_properties(int idx, String dir){
		String val = "";
		
		try{
	    	FileInputStream fileInput = new FileInputStream(new File(dir));
	        Properties prop = new Properties();
	        prop.load(fileInput);
	        
	        String customerId = prop.getProperty("u" + idx);
            String customerId1 = customerId.replaceAll("\\s", "");
                
            val = customerId1;
            System.out.println("Retrieved customer " + val);
	        
            fileInput.close();
            
    	} catch (Exception e){
    		Assert.fail(e.getMessage());
    		e.printStackTrace();
    	}
		
		return val;
	}
	
	@Override
	public int get_starting_idx_from_properties(String dir){
		int idx = 0;
		
		try{
	    	FileInputStream fileInput = new FileInputStream(new File(dir));
	        Properties prop = new Properties();
	        prop.load(fileInput);
	        
	        String val = prop.getProperty("startIdx").replaceAll("\\s", "");
            idx = Integer.parseInt(val);

            System.out.println("Current index for these customers: " + idx);
	        
            fileInput.close();
            
    	} catch (Exception e){
    		Assert.fail(e.getMessage());
    		e.printStackTrace();
    	}
		
		return idx;
	}
	
	@Override
	public void get_teacher_information(int association){
		
		String teacherNameArr[] = getTCODProfileTeacherName().getAttribute("innerText").trim().split(" ");
		String firstName = "";
		String lastName = "";
		
		if(teacherNameArr.length == 2){
			firstName = teacherNameArr[0];
			lastName = teacherNameArr[1];
		} else {
			firstName = teacherNameArr[1];
			lastName = teacherNameArr[2];
		}
		
		String schoolName = getTCODProfileSchoolName().getText().trim();
		String schoolAddress = getTCODProfileSchoolAddress1().getText().trim();
		String schoolCity = "";
		
		String schooladdress2[] = getTCODProfileSchoolAddress2().getText().trim().split(" ");
		int arrSize = schooladdress2.length;
		
		String schoolprovince = schooladdress2[arrSize-3];
		String postalcode = schooladdress2[arrSize-2] + " " + schooladdress2[arrSize-1];
		
		for(int i = 0; i < schooladdress2.length; i++){
			if(schooladdress2[i].contains(",")){
				schoolCity += schooladdress2[i].trim().replaceAll(",", "");
				break;
			}
			
			schoolCity += schooladdress2[i].trim() + " ";
		}
		
        TestBaseProvider.getTestBase().getContext().setProperty("teacherFirstName"+association, firstName);
        TestBaseProvider.getTestBase().getContext().setProperty("teacherLastName"+association, lastName);
        TestBaseProvider.getTestBase().getContext().setProperty("schoolName"+association, schoolName);
        TestBaseProvider.getTestBase().getContext().setProperty("schoolAddress"+association, schoolAddress);
        TestBaseProvider.getTestBase().getContext().setProperty("schoolCity"+association, schoolCity);
        TestBaseProvider.getTestBase().getContext().setProperty("schoolProvince"+association, schoolprovince);
        TestBaseProvider.getTestBase().getContext().setProperty("postalCode"+association, postalcode);
		
        System.out.println("The information for teacher " + firstName + " was successfully recorded!");
	}
	
	@FindBy(locator="dw.tcod.teacherdesk.sendlettertoparents.edit.button")
	private WebElement tcod_teacherdesk_slp_edit_button;
	
	@FindBy(locator="dw.tcod.teacherdesk.sendlettertoparents.modal.save.button")
	private WebElement tcod_teacherdesk_slp_modal_save_button;
	
	@FindBy(locator="dw.tcod.teacherdesk.sendlettertoparents.modal.selectedlanguage")
	private WebElement tcod_teacherdesk_slp_modal_selectedlanguage;
	
	@FindBy(locator="dw.tcod.teacherdesk.sendlettertoparents.modal.select.languagedropdown")
	private WebElement tcod_teacherdesk_slp_modal_select_language_drpdown;
	
	@FindBy(locator="dw.tcod.teacherdesk.sendlettertoparents.modal.msg.textbox.noneditmode")
	private WebElement tcod_teacherdesk_slp_modal_msg_txtbox_noneditmode;
	
	@FindBy(locator="dw.tcod.teacherdesk.sendlettertoparents.modal.restoredefault.link")
	private WebElement tcod_teacherdesk_slp_modal_restoredefault_link;
	
	@FindBy(locator="dw.tcod.teacherdesk.sendlettertoparents.modal.edit.link")
	private WebElement tcod_teacherdesk_slp_modal_edit_link;
	
	@FindBy(locator="dw.tcod.teacherdesk.sendlettertoparents.modal")
	private WebElement tcod_teacherdesk_slp_modal;
	
	@FindBy(locator="dw.tcod.teacherdesk.sendlettertoparents.modal.close.button")
	private WebElement tcod_teacherdesk_slp_modal_close_button;

	@FindBy(locator="dw.tcod.teacherdesk.sendlettertoparents.modal.download.button")
	private WebElement tcod_teacherdesk_slp_modal_download_button;
	
	@FindBy(locator="dw.tcod.teacherdesk.sendlettertoparents.modal.print.button")
	private WebElement tcod_teacherdesk_slp_modal_print_button;
	
	@FindBy(locator="dw.tcod.teacherdesk.sendlettertoparents.modal.PDF.text")
	private WebElement tcod_teacherdesk_slp_modal_PDF_text;
	
	@FindBy(locator="dw.tcod.teacherdesk.sendlettertoparents.modal.facebbok.icon")
	private WebElement tcod_teacherdesk_slp_modal_facebook_icon;
	
	@FindBy(locator="dw.tcod.teacherdesk.sendlettertoparents.view.button")
	private WebElement tcod_teacherdesk_slp_modal_view_button;
	
	public WebElement getSLPModalDownloadButton() {
		return tcod_teacherdesk_slp_modal_download_button;
	}
	
	public WebElement getSLPModalPrintButton() {
		return tcod_teacherdesk_slp_modal_print_button;
	}
	
	public WebElement getSLPModalPDFText() {
		return tcod_teacherdesk_slp_modal_PDF_text;
	}
	
	public WebElement getSLPModalFacebookIcon() {
		return tcod_teacherdesk_slp_modal_facebook_icon;
	}
	
	public WebElement getSLPModal() {
		return tcod_teacherdesk_slp_modal;
	}
	
	public WebElement getSLPModalCloseButton() {
		return tcod_teacherdesk_slp_modal_close_button;
	}
	
	public WebElement getSLPViewButton() {
		return tcod_teacherdesk_slp_modal_view_button;
	}
	
	public WebElement getSLPModalEditLink() {
		return tcod_teacherdesk_slp_modal_edit_link;
	}
	
	public WebElement getSLPModalSaveButton() {
		return tcod_teacherdesk_slp_modal_save_button;
	}
	
	public WebElement getSLPModalSelectedLanguage() {
		return tcod_teacherdesk_slp_modal_selectedlanguage;
	}
	
	public WebElement getSLPModalSelectLanguageDropdown() {
		return tcod_teacherdesk_slp_modal_select_language_drpdown;
	}
	
	public WebElement getSLPModalMSGTextboxNonEdit() {
		return tcod_teacherdesk_slp_modal_msg_txtbox_noneditmode;
	}
	
	public WebElement getSLPModalRestoreDefautLink() {
		return tcod_teacherdesk_slp_modal_restoredefault_link;
	}
	
	public WebElement getSLPEditButton() {
		return tcod_teacherdesk_slp_edit_button;
	}
	
	@Override
	public void clicks_edit_button_on_Send_Letter_to_Parents_section(){
		PauseUtil.pause(2500);
		getSLPEditButton().click();
	}
	
	@Override
	public void restore_default_msg_language(){
		PauseUtil.pause(2500);
		getSLPViewButton().click();
		
		PauseUtil.pause(2500);
		SCHUtils.selectOptionByVisibleText(getSLPModalSelectLanguageDropdown(), ConstantUtils.SLP_DEFAULT_LANGUAGE);
		getSLPModalRestoreDefautLink().click();
		
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.defaultMessage", getSLPModalMSGTextboxNonEdit().getText());
		
		PauseUtil.pause(2500);
		getSLPModalCloseButton().click();
		
		System.out.println("Restore default settings");
	}

	@Override
	public void select_different_language_on_Send_Letter_to_Parents_modal_dropdown(){
		PauseUtil.pause(2500);
		
		String lang = getSLPModalSelectedLanguage().getText();
		
		if(lang.equals(ConstantUtils.SLP_DEFAULT_LANGUAGE)){
			System.out.println("Selecting French");
			SCHUtils.selectOptionByVisibleText(getSLPModalSelectLanguageDropdown(), ConstantUtils.SLP_FRENCH_LANGUAGE);
			
			TestBaseProvider.getTestBase().getContext().setProperty("testexecution.defaultMessage", getSLPModalMSGTextboxNonEdit().getText());
		} else {
			System.out.println("Selecting English");
			SCHUtils.selectOptionByVisibleText(getSLPModalSelectLanguageDropdown(), ConstantUtils.SLP_DEFAULT_LANGUAGE);
		}
	}
	
	@Override
	public void click_edit_link_view_mode_Send_Letter_to_Parents_modal(){
		PauseUtil.pause(2500);
		getSLPModalEditLink().click();
	}
	
	@Override
	public void edit_letter_in_Send_Letter_to_Parents_modal(){
		getSLPModal().click();
		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		String msg = TestBaseProvider.getTestBase().getTestData().getString("editedMsg");
		
		driver.switchTo().frame(1);
		
		PauseUtil.pause(2500);
		driver.findElement(By.xpath("html/body")).clear();
		driver.findElement(By.xpath("html/body")).click();
		driver.findElement(By.xpath("html/body")).sendKeys(msg);
		driver.switchTo().defaultContent();
	}

	@Override
	public void click_save_button_in_Send_Letter_to_Parents_modal(){
		PauseUtil.pause(2500);
		getSLPModalSaveButton().click();
	}

	@Override
	public void verify_edited_letter_is_saved(){
		PauseUtil.pause(2500);
		
		String exp_lang = ConstantUtils.SLP_FRENCH_LANGUAGE;
		String act_lang = getSLPModalSelectedLanguage().getText();
		
		String exp_msg = TestBaseProvider.getTestBase().getTestData().getString("editedMsg");
		String act_msg = getSLPModalMSGTextboxNonEdit().getText();
		
		Assert.assertEquals(act_lang, exp_lang, "The editted language is not correct");
		Assert.assertEquals(act_msg, exp_msg, "The editted message is not correct");
	}
	
	@Override
	public void click_view_on_Send_Letter_to_Parents_section(){
		PauseUtil.pause(2500);
		getSLPViewButton().click();
	}

	@Override
	public void click_restore_deafult_in_Send_Letter_to_Parents_modal(){
		PauseUtil.pause(2500);
		getSLPModalRestoreDefautLink().click();
	}

	@Override
	public void verify_deafult_message_is_displayed(){
		PauseUtil.pause(2500);
		//getSLPViewButton().click();
		
		PauseUtil.pause(2500);
		String exp_msg = TestBaseProvider.getTestBase().getContext().getString("testexecution.defaultMessage");
		String act_msg = getSLPModalMSGTextboxNonEdit().getText();

		Assert.assertEquals(act_msg, exp_msg, "The editted message is not correct");
	}
	
	@Override
	public void click_close_button_on_Send_Letter_to_Parents_modal(){
		PauseUtil.pause(2500);
		getSLPModalCloseButton().click();
	}

	@Override
	public void verify_Send_Letter_to_Parents_modal_not_displayed(){
		PauseUtil.pause(2500);
		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		
		String exp_displyMode = "none";
		String act_displayMode = driver.findElement(By.xpath("//div[contains(@class, 'senddue')]")).getCssValue("display");
		
		Assert.assertEquals(act_displayMode, exp_displyMode, "The Send Letter to Parents modal is still displayed");
	}
	
	@Override
	public void verify_letter_displays_in_selected_language(){		
		PauseUtil.pause(2500);
		String exp_msg = TestBaseProvider.getTestBase().getContext().getString("testexecution.defaultMessage");
		String act_msg = getSLPModalPDFText().getText();

		Assert.assertEquals(act_msg, exp_msg, "The letter is not displayed in selected language");
	}
	
	@Override
	public void click_download_on_Send_Letter_to_Parents_modal(){
		PauseUtil.pause(2500);
		getSLPModalDownloadButton().click();
	}

	@Override
	public void click_print_on_Send_Letter_to_Parents_modal(){
		PauseUtil.pause(2500);
		getSLPModalPrintButton().click();
	}
	
	@Override
	public void click_facebook_icon_on_Send_Letter_to_Parents_modal(){
		PauseUtil.pause(2500);
		getSLPModalFacebookIcon().click();
	}

	@Override
	public void verify_facebook_page_is_displayed(){
		System.out.println("Needs to be implemented");
	}
	//################################################
	@FindBy(locator="dw.tcod.profile.logout.link")
	private WebElement tcod_profile_logout_link;
	
	public WebElement getLogoutlink() {
		return tcod_profile_logout_link;
	}
	
	@Override
	public void doLogout(){
		SCHUtils.clickUsingJavaScript(getLogoutlink());
	}
	
	@Override
	public void teacher_deletes_first_SOO_item_in_Cart_page(){
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		delete_item1_reviewcart().click();
		PauseUtil.pause(2000);
		btn_radio_SOO_delete_option_Other().click();
		PauseUtil.pause(2000);
		btn_DELETE_SOO_item().click();
	}
	
	//################################################ DWCAPCOD - 1456 #################################################################
	@FindBy(locator="dw.tcod.profile.parent.site.edit.link")
	private WebElement tcod_profile_parent_site_edit_link;
	
	@FindBy(locator="dw.tcod.profile.parent.site.modal.allow.parent.checkbox")
	private WebElement tcod_profile_parent_site_modal_allow_parent_checkbox;

	@FindBy(locator="dw.tcod.profile.parent.site.modal")
	private WebElement tcod_profile_parent_site_modal;
	
	@FindBy(locator="dw.tcod.profile.parent.site.modal")
	private List<WebElement> size_tcod_profile_parent_site_modal;
	
	@FindBy(locator="dw.tcod.profile.parent.site.message")
	private WebElement tcod_profile_parent_site_message;
	
	@FindBy(locator="dw.tcod.profile.parent.site.message.checkmark")
	private WebElement tcod_profile_parent_site_message_checkmark;
	
	@FindBy(locator="dw.tcod.profile.parent.site.modal.save")
	private WebElement tcod_profile_parent_site_modal_save;
	
	@FindBy(locator="dw.tcod.profile.parent.site.launch.modal.next")
	private WebElement tcod_profile_parent_site_launch_modal_next;
	
	@FindBy(locator="dw.tcod.profile.page")
	private WebElement tcod_profile_page;

	@FindBy(locator="dw.tcod.teacherdesk.setreminderlink")
	private WebElement linksetreminder_fromNextdueDatesection;

	@FindBy(locator="dw.tcod.remindletter.restoredefault")
	private List<WebElement> getrestoredefaultlinkremidletter;


	@FindBy(locator="dw.tcod.teacherdesk.popupsetReminderDueDate")
	private WebElement popupModalSetReminderDueDate;

	@FindBy(locator="dw.tcod.teacherdesk.reminderletter.toparent.edit")
	private WebElement geteditonreminderletter;

	@FindBy(locator="dw.tcod.teacherdesk.textupdate.reminderletter")
	private WebElement gettextfromreminderletter;

	@FindBy(locator="dw.tcod.teacherdesk.save.onduedateremiderletter")
	private WebElement getsavebuttononletterDuedateReminder;

	@FindBy(locator="teacherdesk.Restoredefaultmessage.onduedateremiderletter")
	private List<WebElement> getupdatereminderLettersaved;


	public WebElement getProfilePage() {
		return tcod_profile_page;
	}
	
	public WebElement getParentSiteLaunchModalNextButton() {
		return tcod_profile_parent_site_launch_modal_next;
	}
	
	public WebElement getParentSiteModalSaveButton() {
		return tcod_profile_parent_site_modal_save;
	}
	
	public WebElement getParentSiteMessageCheckmark() {
		return tcod_profile_parent_site_message_checkmark;
	}
	
	public List<WebElement> sizetcod_profile_parent_site_modal() {
		return size_tcod_profile_parent_site_modal;
	}
	
	public WebElement getParentSiteMessage() {
		return tcod_profile_parent_site_message;
	}
	
	public WebElement getParentSiteModal() {
		return tcod_profile_parent_site_modal;
	}
	
	public WebElement getParentSiteModalAllowParentCheckbox() {
		return tcod_profile_parent_site_modal_allow_parent_checkbox;
	}

	public WebElement getlinksetreminder_fromNextdueDatesection() {
		return linksetreminder_fromNextdueDatesection;
	}

	public List<WebElement> getrestoredefaultlinkremidletter() {
		return getrestoredefaultlinkremidletter;
	}

	public WebElement getpopupModalSetRemiderDueDate() {
		return popupModalSetReminderDueDate;
	}

	public WebElement geteditonreminderletter() {
		return geteditonreminderletter;
	}

	public WebElement gettextfromreminderletter()
	{
		return 	gettextfromreminderletter;
	}

	public WebElement getsavebuttononletterDuedateReminder()
	{
		return 	getsavebuttononletterDuedateReminder;
	}

	public List<WebElement> getupdatereminderLettersaved()
	{
		return 	getupdatereminderLettersaved;
	}




	public WebElement getParentSiteEditLink() {
		return tcod_profile_parent_site_edit_link;
	}
	
	@Override
	public void teacher_clicks_edit_link_parent_site(){
		PauseUtil.pause(2000);
		getParentSiteEditLink().click();
	}

	@Override
	public void teacher_checks_parent_site_option(){
		PauseUtil.pause(2000);
		
		if(getParentSiteModalAllowParentCheckbox().isSelected())
			System.out.println("Checkbox to allow parent is already selected");
		else{
			System.out.println("Selecting checkbox to allow parent");
			getParentSiteModalAllowParentCheckbox().click();
		}
				
	}

	@Override
	public void teacher_edit_parent_site_modal_not_displayed(){
		PauseUtil.pause(2000);
		
		try{
			getParentSiteModal().isDisplayed();
			Assert.fail("Parent Site Modal is still displayed");
		} catch(Exception e){
			System.out.println("Parent Site Modal is not displayed");
		}
	}

	@Override
	public void teacher_selected_option_displays_parent_site_opted_in(){
		PauseUtil.pause(2000);
		
		String exp_msg = ConstantUtils.PARENTSITEMESSAGE;
		String act_msg = getParentSiteMessage().getText().trim();
		
		Assert.assertEquals(act_msg, exp_msg, "The displayed message for parent site is not correct");
		
		try{
			getParentSiteMessageCheckmark().isDisplayed();
			System.out.println("Check mark next to parent site messgae is displayed");
		} catch (Exception e){
			Assert.fail("Check mark is not displayed next to the parent site message");
		}
	}
	
	@Override
	public void teacher_unchecks_parent_site_option(){
		PauseUtil.pause(2000);
		
		if(!getParentSiteModalAllowParentCheckbox().isSelected())
			System.out.println("Checkbox to allow parent is already deselected");
		else{
			System.out.println("Unselecting checkbox to allow parent");
			getParentSiteModalAllowParentCheckbox().click();
		}
	}

	@Override
	public void teacher_clicks_save_parent_site_modal(){
		PauseUtil.pause(2000);
		
		getParentSiteModalSaveButton().click();
	}

	@Override
	public void teacher_does_not_see_anything_parent_site_opted_out(){
		PauseUtil.pause(2000);
		
		try{
			getParentSiteMessage().isDisplayed();
			Assert.fail("Parent Site message is displayed");
		} catch(Exception e){
			System.out.println("Parent Site message is not displayed");
		}
	}
	
	@Override
	public void teacher_clicks_next_parent_site_launch_modal() {
		PauseUtil.pause(2000);
		
		getParentSiteLaunchModalNextButton().click();
	}

	@Override
	public void teacher_my_account_page_is_displayed() {
		PauseUtil.pause(2000);
		
		try{
			getProfilePage().isDisplayed();
			System.out.println("Profile page displayed");
		} catch(Exception e){
			Assert.fail("Profile page is not displayed");
		}
		
	}

	@Override
	public void teacher_edit_parent_site_modal_is_displayed() {
		PauseUtil.pause(2000);
		
		try{
			getParentSiteModal().isDisplayed();
			System.out.println("Parent Site Modal is displayed");
		} catch(Exception e){
			Assert.fail("Parent Site Modal is not displayed");
		}
	}

	@Override
	public void teacher_checkbox_not_selected_edit_parent_site_modal() {
		PauseUtil.pause(2000);
		
		boolean isParentSiteSelected = getParentSiteModalAllowParentCheckbox().isSelected();
		
		Assert.assertFalse(isParentSiteSelected, "The parent site checkbox is selected");
	}
	
	@Override
	public void teacher_checkbox_selected_edit_parent_site_modal() {
		PauseUtil.pause(2000);
		
		boolean isParentSiteSelected = getParentSiteModalAllowParentCheckbox().isSelected();
		
		Assert.assertTrue(isParentSiteSelected, "The parent site checkbox is not selected");
	}
	//################################################ DWCAPCOD - 1456 #################################################################


	@Override
	public void  select_sendRemider_fromNextdueDatesection() {
		SCHUtils.waitForElementToBeClickable(getlinksetreminder_fromNextdueDatesection(),2000);
		getlinksetreminder_fromNextdueDatesection().click();

	}

	@Override
	public void modalforSetDueDateReminder() {
		SCHUtils.waitForElementToBeDisplayed(getpopupModalSetRemiderDueDate(),5000);
		String txtpopup = getpopupModalSetRemiderDueDate().getText().trim();
		Assert.assertEquals(txtpopup,"Send Due Date Reminder","The Send Reminder modal is displayed");

	}

	public void newbrowserTabforpdf(){
		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		Set <String> handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		String getURL = driver.getCurrentUrl();
		Assert.assertTrue(getURL.contains("PDF"));
		//perform actions on child window
		//perform actions on child window
		driver.close(); // only for child wondow
		driver.switchTo().window(parent);
	}


	public void reminderLetterclickEdit(){
		SCHUtils.waitForElementToBeClickable(geteditonreminderletter,2000);
		geteditonreminderletter().click();
	}

	public void updatereminderLetter() {
		WebDriver d = TestBaseProvider.getTestBase().getDriver();

		List<WebElement> ele = d.findElements(By.tagName("iframe"));
		System.out.println("Number of frames in a page :" + ele.size());
		for (WebElement el : ele) {
			//Returns the Id of a frame.
			System.out.println("Frame Id :" + el.getAttribute("id"));
			//Returns the Name of a frame.
			System.out.println("Frame name :" + el.getAttribute("class"));
		}
		d.switchTo().frame(1);
		System.out.println("switched");
		PauseUtil.pause(2000);
		String inputtxt = "Hello  " + RandomDataUtil.getString("");
		System.out.println(inputtxt);
		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		WebElement editable = driver.switchTo().activeElement();
		editable.sendKeys(inputtxt);
		getTestBase().getContext().setProperty("EditedLetterString", String.valueOf(inputtxt));
		d.switchTo().defaultContent();
	}

	public void savebuttononletterDuedateReminder(){

		SCHUtils.waitForElementToBeClickable(getsavebuttononletterDuedateReminder,2000);
		try {
			getsavebuttononletterDuedateReminder().click();
			Assert.assertTrue(true,"Save button clicked");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Save Button is not clicked");
		}


	}


	public void updatereminderLettersaved(){

		/*WebDriver d = TestBaseProvider.getTestBase().getDriver();
		List<WebElement> ele = d.findElements(By.tagName("iframe"));
		System.out.println("Number of frames in a page :" + ele.size());
		for(WebElement el : ele){
			//Returns the Id of a frame.
			System.out.println("Frame Id :" + el.getAttribute("id"));
			//Returns the Name of a frame.
			System.out.println("Frame name :" + el.getAttribute("class"));
		}
		d.switchTo().frame(1);
		System.out.println("switched");
		PauseUtil.pause(2000);
		System.out.println(getupdatereminderLettersaved.size()+"checking the size of element");

		try {
			if(getupdatereminderLettersaved.size()==0){
                //Assert.fail("Element not present.");
				d.switchTo().defaultContent();
				PauseUtil.pause(2000);
				System.out.println(getupdatereminderLettersaved.size()+"In Catch checking the size of element");
            }
		} catch (Exception e) {
			e.printStackTrace();
			d.switchTo().defaultContent();
			System.out.println(getupdatereminderLettersaved.size()+"In Catch checking the size of element");
		}*/
			String letter = "";
		for( WebElement web :getupdatereminderLettersaved()){
			 letter = letter +web.getText();
		}
		String updatedletter = TestBaseProvider.getTestBase().getContext()
				.getProperty("EditedLetterString").toString();

		//String letterupdated = getupdatereminderLettersaved().get(0).getText();
		System.out.println("reading letter"+letter);
		System.out.println("getter propery"+updatedletter);

		if(letter.contains(updatedletter)){
			Assert.assertTrue(true,"Letter updated contains updated text");
		}else {
			Assert.fail("Something went wrong with letter update");
		}
	}

	public void restoredefault_remindLetter(){
		if(getrestoredefaultlinkremidletter().size()!=0){
			getrestoredefaultlinkremidletter().get(0).click();
		}

	}

	public void defultletterdisplay(){

	}
	
	@Override
	public void handle_teacher_parent_Popup() {
		try{
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(2500);
			if(sizetcod_profile_parent_site_modal().size()!=0){
				PauseUtil.pause(1500);
				getParentSiteLaunchModalNextButton().click();
				PauseUtil.pause(1500);
				teacher_checks_parent_site_option();
				getParentSiteModalSaveButton().click();
				PauseUtil.waitForAjaxToComplete(2500);
				PauseUtil.pause(1500);
			}
		}
		catch (Exception e) {
			System.out.println("Teacher and Parent connection popup is not coming");
		}	
	}
	
	@Override
	public void parent_clicks_on_ReviewCart_if_cart_has_items_and_delete() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(4000);

		String cart_val=btn_mini_reviewCart().getText();
		cart_val=cart_val.trim();
		int cart_val2=Integer.parseInt(cart_val);
		System.out.println("################Cart Val is:"+cart_val2);

		if (cart_val2!=0) {
			btn_mini_reviewCart().click();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(2000);
			SfoPage.parenet_delete_all_items_in_ReviewCart();
		} else {
			System.out.println("No items in cart");
		}
	}
	
	

}
