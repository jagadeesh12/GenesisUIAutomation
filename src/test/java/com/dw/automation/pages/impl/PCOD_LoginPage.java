package com.dw.automation.pages.impl;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.configuration.Configuration;
import org.hamcrest.Matchers;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.dw.automation.pages.ILoginPage;
import com.dw.automation.pages.ITeachersHomePage;
import com.dw.automation.pages.PCOD_ILoginPage;
import com.dw.automation.pages.impl.CheckoutPage.RewardsAndCoupons;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;
import com.scholastic.torque.common.WaitUtils;

public class PCOD_LoginPage extends BaseTestPage<TestPage> implements PCOD_ILoginPage {

	PCOD_HomePage pcod_homepage = new PCOD_HomePage();
	LoginPage log_page = new LoginPage();
	PCOD_ReviewCartPage pcod_reviewpage = new PCOD_ReviewCartPage();
	StudentFlyerOrdersPage SfoPage = new StudentFlyerOrdersPage();

	@FindBy(locator = "dw.pcod.login.lbl.connectoyourteacher")
	private WebElement lblconnectyourteacher;
	
	
	

	@FindBy(locator = "dw.pcod.login.connectoyourteacher.txt.entercode")
	private WebElement txtconnectyourteacherCAC;

	@FindBy(locator = "dw.pcod.login.connectoyourteacher.txt.postalcode")
	private WebElement txtconnectyourteacherpostalcode;

	@FindBy(locator = "dw.pcod.login.connectoyourteacher.txt.postalcode")
	private List<WebElement> sizetxtconnectyourteacherpostalcode;
	
	
	@FindBy(locator = "dw.pcod.login.connectoyourteacher.lbl.step2.postalcode")
	private WebElement ctt_lblstep2postalcode;

	@FindBy(locator = "dw.pcod.login.connectoyourteacher.lnk.whatsthis")
	private WebElement lnkconnectyourteacherwhatsthis;

	@FindBy(locator = "dw.pcod.login.connectoyourteacher.tooltip.whatsthis")
	private WebElement tooltipconnectyourteacherwhatsthis;

	@FindBy(locator = "dw.pcod.login.connectoyourteacher.tooltip.errormessage")
	private WebElement tooltiperrormessage;

	@FindBy(locator = "dw.pcod.login.connectoyourteacher.tooltip.errormessage")
	private List<WebElement> sizetooltiperrormessage;

	@FindBy(locator = "dw.pcod.login.connectoyourteacher.tooltip.errormsg")
	private WebElement tooltipconnectyourteachererrormsg;

	@FindBy(locator = "dw.pcod.login.connectoyourteacher.btn.connect")
	private WebElement btnconnectyourteacherconnect;

	@FindBy(locator = "dw.pcod.login.connectoyourteacher.btn.connect.disabled")
	private List<WebElement> btnconnectyourteacherconnectdisabled;

	@FindBy(locator = "dw.pcod.login.connectoyourteacher.window.addachild")
	private List<WebElement> windowaddachildconnecttoteacher;

	@FindBy(locator = "dw.pcod.login.createaccount.btn.continue.disabled")
	private List<WebElement> btncontinuecreateaccountdisabled;

	@FindBy(locator = "dw.pcod.login.addachild.btn.add.disabled")
	private List<WebElement> sizebtnaddaddachilddisabled;

	@FindBy(locator = "dw.pcod.login.createaccount.btn.continue")
	private WebElement btncontinuecreateaccount;

	@FindBy(locator = "dw.pcod.login.connectoyourteacher.btn.search.disabled")
	private List<WebElement> btnconnectyourteachersearchdisabled;

	@FindBy(locator = "dw.pcod.login.connectoyourteacher.btn.yes.enabled")
	private List<WebElement> btnconnectyourteacheryesenabled;

	@FindBy(locator = "dw.pcod.login.connectoyourteacher.window.createanaccount")
	private List<WebElement> windowcreateanaccountconnectyourteacher;

	@FindBy(locator = "dw.pcod.login.connectoyourteacher.window.addachild")
	private WebElement windowaddachildconnectyourteacher;

	
	@FindBy(locator = "dw.pcod.login.select.school.connectoyourteacher.nodropdown")
	private WebElement schoolconnectoyourteachernodropdown;

	
	@FindBy(locator = "dw.pcod.login.connectoyourteacher.btn.no")
	private WebElement btnconnectyourteacherno;

	@FindBy(locator = "dw.pcod.login.connectoyourteacher.lnk.thisisnotmyteacher")
	private WebElement lnkthisisnotmyteacher_connectyourteacher;

	@FindBy(locator = "dw.pcod.login.connectoyourteacher.btn.createanaccount")
	private WebElement btncreateanaccount_connectyourteacher;

	@FindBy(locator = "dw.pcod.login.createanaccount.lnk.hide")
	private WebElement lnkhide_createanaccount;

	@FindBy(locator = "dw.pcod.login.createanaccount.lnk.hide")
	private List<WebElement> sizelnkhide_createanaccount;

	@FindBy(locator = "dw.pcod.login.createanaccount.lnk.show")
	private WebElement lnkshow_createanaccount;

	
	@FindBy(locator = "dw.pcod.login.aboutreadinglevel.popup.close.icon")
	private WebElement aboutreadinglevelpopupcloseicon;
	
	@FindBy(locator = "dw.pcod.login.connectoyourteacher.txt.cac")
	private List<WebElement> txtcacconnectyourteacher;

	@FindBy(locator = "dw.pcod.login.window.connectoyourteacher")
	private List<WebElement> connectyourteacherwindow;

	@FindBy(locator = "dw.pcod.login.btn.back.connectoyourteacher")
	private WebElement btnbackconnectyourteacher;

	@FindBy(locator = "dw.pcod.login.btn.next.connectoyourteacher")
	private WebElement btnnextconnectyourteacher;

	@FindBy(locator = "dw.pcod.login.btn.search.connectoyourteacher")
	private WebElement btnsearchconnectyourteacher;

	@FindBy(locator = "dw.pcod.login.btn.newsearch.connectoyourteacher")
	private WebElement btnnewsearchconnectyourteacher;

	@FindBy(locator = "dw.pcod.login.icon.close.connectoyourteacher")
	private WebElement iconcloseconnectyourteacher;

	@FindBy(locator = "dw.pcod.login.icon.close.connectoyourteacher")
	private List<WebElement> sizeiconcloseconnectyourteacher;

	@FindBy(locator = "dw.pcod.login.lnk.findyourteacher.connectoyourteacher")
	private WebElement lnkfindyourteacherconnectyourteacher;

	@FindBy(locator = "dw.pcod.login.lnk.cantfindyourteacher.connectoyourteacher")
	private WebElement lnkcantfindyourteacherconnectyourteacher;

	@FindBy(locator = "dw.pcod.login.drpdwn.province.connectoyourteacher")
	private WebElement drpdwnprovinceconnectyourteacher;

	@FindBy(locator = "dw.pcod.login.drpdwn.province.connectoyourteacher")
	private List<WebElement> sizedrpdwnprovinceconnectyourteacher;
	
	
	@FindBy(locator = "dw.pcod.login.connectoyourteacher.lbl.step2.resultfor")
	private WebElement cct_lblstep2resultfor;
	
	@FindBy(locator = "dw.pcod.login.select.school.connectoyourteacher.drpdwn")
	private WebElement schoolconnectoyourteacherdrpdwn;


	@FindBy(locator = "dw.pcod.login.drpdwn.city.connectoyourteacher")
	private WebElement drpdwncityconnectyourteacher;

	@FindBy(locator = "dw.pcod.login.drpdwn.selectteacher.connectoyourteacher")
	private WebElement drpdwnselectteacherconnectyourteacher;

	@FindBy(locator = "dw.pcod.login.select.province.connectoyourteacher")
	private WebElement SelectProvince_ConnectYourTeacher;
	
	
	@FindBy(locator = "dw.pcod.login.select.province.connectoyourteacher.parentschool")
	private WebElement SelectProvince_ConnectYourTeacher_parentschool;

	@FindBy(locator = "dw.pcod.login.lbl.schooldetails.connectoyourteacher")
	private WebElement schooldetails_ConnectYourTeacher;

	@FindBy(locator = "dw.pcod.login.select.city.connectoyourteacher")
	private WebElement selectcity_ConnectYourTeacher;

	@FindBy(locator = "dw.pcod.login.select.school.connectoyourteacher")
	private WebElement selectschool_ConnectYourTeacher;
	
	
	@FindBy(locator = "dw.pcod.login.connectoyourteacher.select.school.city")
	private WebElement connecttoyourteacherselectschoolcity;

	@FindBy(locator = "dw.pcod.login.connectoyourteacher.txt.yourteachername")
	private WebElement txtyourteachername_connectyourteacher;

	@FindBy(locator = "dw.pcod.login.createaccount.txt.firstname")
	private WebElement txtcreateaccountfirstname;

	@FindBy(locator = "dw.pcod.login.addachild.txt.firstname")
	private WebElement txtaddachildfirstname;

	@FindBy(locator = "dw.pcod.login.addachild.button.save")
	private WebElement buttonAddchildSave;

	@FindBy(locator = "dw.pcod.login.addachild.txt.lastname")
	private WebElement txtaddachildlastname;

	@FindBy(locator = "dw.pcod.login.addachild.drpdown.grade")
	private WebElement drpdownaddachildgrade;
	
	
	@FindBy(locator = "dw.pcod.login.addachild.drpdown.gradeselect")
	private WebElement drpdownaddachildgradeselect;

	@FindBy(locator = "dw.pcod.login.addachild.dropdown.grade")
	private WebElement dropdownaddachildgrade;

	@FindBy(locator = "dw.pcod.login.addachild.drpdown.birthdate.month")
	private WebElement drpdownaddachildbirthdatemonth;

	@FindBy(locator = "dw.pcod.login.addachild.dropdown.birthdate.month")
	private WebElement dropdownaddachildbirthdatemonth;

	@FindBy(locator = "dw.pcod.login.addachild.drpdown.birthdate.year")
	private WebElement drpdownaddachildbirthdateyear;

	@FindBy(locator = "dw.pcod.login.addachild.dropdown.birthdate.year")
	private WebElement dropdownaddachildbirthdateyear;

	@FindBy(locator = "dw.pcod.login.addachild.btn.add")
	private WebElement btnaddachildadd;

	@FindBy(locator = "dw.pcod.login.addachild.btn.add")
	private List<WebElement> sizebtnaddachildadd;

	@FindBy(locator = "dw.pcod.addchild.connecteaccher.FATmodal.zip")
	private WebElement inputboxzipcodefatmodal;

	@FindBy(locator = "dw.pcod.addchild.connecteaccher.FATmodal.Searchbutton")
	private WebElement click_addchild_fatModal_search;

	@FindBy(locator = "dw.pcod.addchild.FATmodal.selectschool")
	private WebElement fatmodalschoolnameSelect;

	@FindBy(locator = "dw.pcod.FATWindow.connectTeacher")
	private WebElement ConnectTeacherFatFlow;

	@FindBy(locator = "dw.pcod.FATwindow.connectTeacher.buttonNext")
	private WebElement FatflowConnectTeacherButtonNext;


	@FindBy(locator = "dw.pcod.FATwindow.dropdown.teachername")
	private WebElement TeacherName_FATflowAddchild;

	@FindBy(locator = "dw.pcod.FATwindow.connectTeacher.schoolname")
	private List<WebElement> ListFatflowConnectTeacherschoolname;

	@FindBy(locator = "dw.pcod.login.login.btn.login")
	private WebElement btnlogin;

	@FindBy(locator = "dw.pcod.login.addachild.lnk.askmelateragain")
	private WebElement lnkaddachildaskmelateragain;

	@FindBy(locator = "dw.pcod.login.createaccount.txt.firstnameerror")
	private WebElement txtcreateaccountfirstnameerror;

	@FindBy(locator = "dw.pcod.login.createaccount.txt.lastnameerror")
	private WebElement txtcreateaccountlastnameerror;

	@FindBy(locator = "dw.pcod.login.addachild.txt.lastnameerror")
	private List<WebElement> sizeaddachildlastnameerror;

	@FindBy(locator = "dw.pcod.login.createaccount.txt.emailerror")
	private WebElement txtcreateaccountemailerror;

	@FindBy(locator = "dw.pcod.login.createaccount.txt.passworderror")
	private WebElement txtcreateaccountpassworderror;

	@FindBy(locator = "dw.pcod.login.createaccount.txt.passworderror")
	private List<WebElement> sizetxtcreateaccountpassworderror;

	@FindBy(locator = "dw.pcod.login.createaccount.txt.firstnameerror")
	private List<WebElement> sizetxtcreateaccountfirstnameerror;

	@FindBy(locator = "dw.pcod.login.createaccount.txt.lastname")
	private WebElement txtcreateaccountlastname;

	@FindBy(locator = "dw.pcod.addchild.fat.link")
	private WebElement linkAddchildFindyourTeacher;

	@FindBy(locator = "dw.pcod.login.createaccount.txt.email")
	private WebElement txtcreateaccountemail;

	@FindBy(locator = "dw.pcod.login.createaccount.txt.password")
	private WebElement txtcreateaccountpassword;

	@FindBy(locator = "dw.pcod.login.createaccount.txt.mobile")
	private WebElement txtcreateaccountmobile;

	@FindBy(locator = "dw.pcod.login.createaccount.chxbox.language.eng")
	private WebElement chkboxcreateaccountlngeng;

	@FindBy(locator = "dw.pcod.login.createaccount.chxbox.language.fr")
	private WebElement chkboxcreateaccountlngfr;

	@FindBy(locator = "dw.pcod.login.createaccount.chkbox.termsofuse")
	private WebElement chkboxcreateaccounttermsofuse;

	@FindBy(locator = "dw.pcod.login.createaccount.chkbox.privacypolicy")
	private WebElement chkboxcreateaccountprivacypolicy;

	@FindBy(locator = "dw.pcod.login.addachild.addeddetails")
	private WebElement listaddachildaddeddetials;

	@FindBy(locator = "dw.pcod.tooltip.errormessage")
	private WebElement messagetooltiperrormsg;

	@FindBy(locator = "dw.pcod.login.txt.username")
	private WebElement txtUsername;

	@FindBy(locator = "dw.pcod.login.txt.password")
	private WebElement txtPassword;

	@FindBy(locator = "dw.pcod.home.page.parenthomepage")
	private WebElement pageparenthomepage;
	
	@FindBy(locator = "dw.header.headercart.txt.cartquantity")
	private WebElement shopping_cart_quantity;
	
	@FindBy(locator = "dw.pcod.login.connecttoteacher.addanotherchild.link")
	private WebElement add_another_child_button;

	public WebElement getAddAnotherChildButton() {
		return add_another_child_button;
	}
	
	
	public WebElement ctt_lblstep2postalcode() {
		return ctt_lblstep2postalcode;
	}
	
	public WebElement getCartQuantity() {
		return shopping_cart_quantity;
	}

	@FindBy(locator = "dw.pcod.login.addachild.btn.getstarted")
	private WebElement btngetstarted;

	@FindBy(locator = "dw.pcod.login.addachild.btn.addanotherchild")
	private WebElement btnaddanotherchild;
	
	
	@FindBy(locator = "dw.pcod.login.connectoyourteacher.searchbutton")
	private WebElement connectoyourteachersearchbutton;

	public WebElement getbtnaddanotherchild() {
		return btnaddanotherchild;
	}
	
	
	public WebElement connectoyourteachersearchbutton() {
		return connectoyourteachersearchbutton;
	}

	public WebElement getbtngetstarted() {
		return btngetstarted;
	}

	public WebElement getlblconnectyourteacher() {
		return lblconnectyourteacher;
	}

	public WebElement getbtnbackconnectyourteacher() {
		return btnbackconnectyourteacher;
	}

	public WebElement getbtnnextconnectyourteacher() {
		return btnnextconnectyourteacher;
	}

	public WebElement getbtnsearchconnectyourteacher() {
		return btnsearchconnectyourteacher;
	}

	public WebElement getbtnnewsearchconnectyourteacher() {
		return btnnewsearchconnectyourteacher;
	}

	public List<WebElement> sizeiconcloseconnectyourteacher() {
		return sizeiconcloseconnectyourteacher;
	}

	public WebElement geticoncloseconnectyourteacher() {
		return iconcloseconnectyourteacher;
	}

	public WebElement getlnkfindyourteacherconnectyourteacher() {
		return lnkfindyourteacherconnectyourteacher;
	}

	public WebElement getlnkcantfindyourteacherconnectyourteacher() {
		return lnkcantfindyourteacherconnectyourteacher;
	}

	public WebElement getdrpdwnprovinceconnectyourteacher() {
		return drpdwnprovinceconnectyourteacher;
	}

	public List<WebElement> sizedrpdwnprovinceconnectyourteacher() {
		return sizedrpdwnprovinceconnectyourteacher;
	}

	public WebElement getdrpdwncityconnectyourteacher() {
		return drpdwncityconnectyourteacher;
	}

	

	
	public WebElement getdrpdwnselectteacherconnectyourteacher() {
		return drpdwnselectteacherconnectyourteacher;
	}

	public WebElement getSelectProvince_ConnectYourTeacher() {
		return SelectProvince_ConnectYourTeacher;
	}
	
	
	public WebElement getSelectProvince_ConnectYourTeacher_parentschool() {
		return SelectProvince_ConnectYourTeacher_parentschool;
	}

	public WebElement getschooldetails_ConnectYourTeacher() {
		return schooldetails_ConnectYourTeacher;
	}

	
	public WebElement schoolconnectoyourteachernodropdown() {
		return schoolconnectoyourteachernodropdown;
	}
	
	public WebElement getselectcity_ConnectYourTeacher() {
		return selectcity_ConnectYourTeacher;
	}

	public WebElement getselectschool_ConnectYourTeacher() {
		return selectschool_ConnectYourTeacher;
	}

	public WebElement gettxtconnectyourteacherCAC() {
		return txtconnectyourteacherCAC;
	}

	public WebElement gettxtconnectyourteacherpostalcode() {
		return txtconnectyourteacherpostalcode;
	}

	public WebElement gettxtcreateaccountfirstnameerror() {
		return txtcreateaccountfirstnameerror;
	}

	public WebElement gettxtcreateaccountlastnameerror() {
		return txtcreateaccountlastnameerror;
	}

	public List<WebElement> sizeaddachildlastnameerror() {
		return sizeaddachildlastnameerror;
	}

	public WebElement gettxtcreateaccountemailerror() {
		return txtcreateaccountemailerror;
	}

	public WebElement gettxtcreateaccountpassworderror() {
		return txtcreateaccountpassworderror;
	}

	public List<WebElement> sizetxtcreateaccountpassworderror() {
		return sizetxtcreateaccountpassworderror;
	}

	public List<WebElement> sizetxtcreateaccountfirstnameerror() {
		return sizetxtcreateaccountfirstnameerror;
	}

	public WebElement gettxtcreateaccountfirstname() {
		return txtcreateaccountfirstname;
	}

	public WebElement gettxtaddachildfirstname() {
		return txtaddachildfirstname;
	}

	public WebElement getbuttonAddchildSave() {
		return buttonAddchildSave;
	}

	public WebElement gettxtaddachildlastname() {
		return txtaddachildlastname;
	}

	public WebElement getdrpdownaddachildgrade() {
		return drpdownaddachildgrade;
	}

	public WebElement getdropdownaddachildgrade() {
		return dropdownaddachildgrade;
	}

	public WebElement getdrpdownaddachildbirthdatemonth() {
		return drpdownaddachildbirthdatemonth;
	}

	public WebElement getdropdownaddachildbirthdatemonth() {
		return dropdownaddachildbirthdatemonth;
	}

	public WebElement getdrpdownaddachildbirthdateyear() {
		return drpdownaddachildbirthdateyear;
	}

	public WebElement getdropdownaddachildbirthdateyear() {
		return dropdownaddachildbirthdateyear;
	}

	public WebElement getbtnaddachildadd() {
		return btnaddachildadd;
	}

	public List<WebElement> sizebtnaddachildadd() {
		return sizebtnaddachildadd;
	}

	public WebElement getinputboxzipcodefatmodal() {
		return inputboxzipcodefatmodal;
	}

	public WebElement getclick_addchild_fatModal_search() {
		return click_addchild_fatModal_search;
	}

	public WebElement getfatmodalschoolnameSelect() {
		return fatmodalschoolnameSelect;
	}
	
	
	public WebElement aboutreadinglevelpopupcloseicon() {
		return aboutreadinglevelpopupcloseicon;
	}

	public WebElement getConnectTeacherFatFlow() {
		return ConnectTeacherFatFlow;
	}

	public WebElement getFatflowConnectTeacherButtonNext() {
		return FatflowConnectTeacherButtonNext;
	}

	public WebElement getTeacherName_FATflowAddchild() {
		return TeacherName_FATflowAddchild;
	}

	public List<WebElement> getListFatflowConnectTeacherschoolname() {
		return ListFatflowConnectTeacherschoolname;
	}

	public WebElement getbtnlogin() {
		return btnlogin;
	}

	public WebElement getlnkaddachildaskmelateragain() {
		return lnkaddachildaskmelateragain;
	}

	public WebElement gettxtcreateaccountlastname() {
		return txtcreateaccountlastname;
	}

	public WebElement getlinkAddchildFindyourTeacher() {
		return linkAddchildFindyourTeacher;
	}

	public WebElement gettxtcreateaccountemail() {
		return txtcreateaccountemail;
	}

	public WebElement gettxtcreateaccountpassword() {
		return txtcreateaccountpassword;
	}

	public WebElement gettxtcreateaccountmobile() {
		return txtcreateaccountmobile;
	}

	public WebElement getchkboxcreateaccountlngeng() {
		return chkboxcreateaccountlngeng;
	}

	public WebElement getchkboxcreateaccountlngfr() {
		return chkboxcreateaccountlngfr;
	}

	public WebElement getchkboxcreateaccounttermsofuse() {
		return chkboxcreateaccounttermsofuse;
	}

	
	public WebElement connecttoyourteacherselectschoolcity() {
		return connecttoyourteacherselectschoolcity;
	}
	
	public WebElement getchkboxcreateaccountprivacypolicy() {
		return chkboxcreateaccountprivacypolicy;
	}

	public List<WebElement> sizetxtconnectyourteacherpostalcode() {
		return sizetxtconnectyourteacherpostalcode;
	}
	
	
	public WebElement cct_lblstep2resultfor() {
		return cct_lblstep2resultfor;
	}

	public WebElement getlnkconnectyourteacherwhatsthis() {
		return lnkconnectyourteacherwhatsthis;
	}

	public WebElement gettooltipconnectyourteacherwhatsthis() {
		return tooltipconnectyourteacherwhatsthis;
	}

	public WebElement gettooltiperrormessage() {
		return tooltiperrormessage;
	}

	public List<WebElement> sizetooltiperrormessage() {
		return sizetooltiperrormessage;
	}

	public WebElement getbtnconnectyourteacherconnect() {
		return btnconnectyourteacherconnect;
	}

	public WebElement gettooltipconnectyourteachererrormsg() {
		return tooltipconnectyourteachererrormsg;
	}

	public List<WebElement> sizebtnconnectyourteacherconnectdisabled() {
		return btnconnectyourteacherconnectdisabled;
	}

	public List<WebElement> sizewindowaddachildconnecttoteacher() {
		return windowaddachildconnecttoteacher;
	}

	public List<WebElement> sizebtncontinuecreateaccountdisabled() {
		return btncontinuecreateaccountdisabled;
	}

	public List<WebElement> sizebtnaddaddachilddisabled() {
		return sizebtnaddaddachilddisabled;
	}

	public WebElement getbtncontinuecreateaccount() {
		return btncontinuecreateaccount;
	}
	
	
	public WebElement schoolconnectoyourteacherdrpdwn() {
		return schoolconnectoyourteacherdrpdwn;
	}

	public List<WebElement> sizebtnconnectyourteachersearchdisabled() {
		return btnconnectyourteachersearchdisabled;
	}

	public List<WebElement> sizebtnconnectyourteacheryesenabled() {
		return btnconnectyourteacheryesenabled;
	}

	public List<WebElement> sizewindowcreateanaccountconnectyourteacher() {
		return windowcreateanaccountconnectyourteacher;
	}

	public WebElement getwindowaddachildconnectyourteacher() {
		return windowaddachildconnectyourteacher;
	}
	
	
	public WebElement drpdownaddachildgradeselect() {
		return drpdownaddachildgradeselect;
	}

	public WebElement getbtnconnectyourteacherno() {
		return btnconnectyourteacherno;
	}

	public WebElement getlnkthisisnotmyteacher_connectyourteacher() {
		return lnkthisisnotmyteacher_connectyourteacher;
	}

	public WebElement getbtncreateanaccount_connectyourteacher() {
		return btncreateanaccount_connectyourteacher;
	}

	public WebElement getlnkhide_createanaccount() {
		return lnkhide_createanaccount;
	}

	public List<WebElement> sizelnkhide_createanaccount() {
		return sizelnkhide_createanaccount;
	}

	public WebElement getlnkshow_createanaccount() {
		return lnkshow_createanaccount;
	}

	public List<WebElement> sizetxtcacconnectyourteacher() {
		return txtcacconnectyourteacher;
	}

	public List<WebElement> sizeconnectyourteacherwindow() {
		return connectyourteacherwindow;
	}

	public WebElement gettxtyourteachername_connectyourteacher() {
		return txtyourteachername_connectyourteacher;
	}

	public WebElement getlistaddachildaddeddetials() {
		return listaddachildaddeddetials;
	}

	public WebElement getmessagetooltiperrormsg() {
		return messagetooltiperrormsg;
	}

	@Override
	public WebElement getTxtUsername() {
		return txtUsername;
	}

	@Override
	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getpageparenthomepage() {
		return pageparenthomepage;
	}


	//############################# METHODS ######################################


	@Override
	public void pcod_verify_connect_to_your_teacher_model_windowstep0() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Assert.assertEquals(sizetxtcacconnectyourteacher().size() > 0, true);
	}

	@Override
	public void pcod_verify_connect_to_your_teacher_model_windowstep1() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Assert.assertEquals(sizetxtconnectyourteacherpostalcode().size() > 0, true);
		Assert.assertEquals(sizedrpdwnprovinceconnectyourteacher().size() > 0, true);
	}

	@Override
	public void pcod_verify_connect_to_your_teacher_model_windowstep2() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Assert.assertEquals(ctt_lblstep2postalcode().isDisplayed(), true);
		Assert.assertEquals(cct_lblstep2resultfor().isDisplayed(), true);
	}

	@Override
	public void pcod_verify_connect_to_your_teacher_model_window_notpresent() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		//Assert.assertNotEquals(sizeconnectyourteacherwindow().size() > 0, true);
		boolean ctytwindow=false;
		try {
			
			Assert.assertTrue(sizeconnectyourteacherwindow().size()<=0);
			if(sizeconnectyourteacherwindow().size()>0)
				ctytwindow=true;
		} catch (Exception e) {
			System.out.println("Window not present"+ctytwindow);
			e.printStackTrace();
		}
	}


	@Override
	public void pcod_verify_validationMsg_Invalidpostalcode_connect_to_your_teacher() {
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		System.out.println("error message" + rewardsAndCoupons.getLblErrorMessage().getText());
		AssertUtils.assertTextMatches(rewardsAndCoupons.getLblErrorMessage(), Matchers.containsString(ConstantUtils.INVALIDPostalCODE_MSG));
	}

	@Override
	public void pcod_verify_validationMsg_firstname_lastname_createaccount() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		System.out.println("error message" + gettooltiperrormessage().getText());
		AssertUtils.assertTextMatches(gettooltiperrormessage(), Matchers.containsString(ConstantUtils.INVALIDFIRSTNAME_LASTNAME_MSG));
	}

	@Override
	public void pcod_verify_validationMsg_email_createaccount() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		System.out.println("error message" + gettooltiperrormessage().getText());
		AssertUtils.assertTextMatches(gettooltiperrormessage(), Matchers.containsString(ConstantUtils.INVALIDEMAILIDMESSAGE));
	}

	@Override
	public void pcod_verify_validationMsg_invalidcredentials() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		System.out.println("error message" + log_page.ToolTipLoginErrorMsgBoxHeader().getText());
		System.out.println("error message" + log_page.ToolTipLoginErrorMsgBoxMessage().getText());
		AssertUtils.assertTextMatches(log_page.ToolTipLoginErrorMsgBoxHeader(), Matchers.containsString(ConstantUtils.INVALIDCREDENTIALSMESSAGE1_PCOD));
		AssertUtils.assertTextMatches(log_page.ToolTipLoginErrorMsgBoxMessage(), Matchers.containsString(ConstantUtils.INVALIDCREDENTIALSMESSAGE2_PCOD));
	}

	@Override
	public void pcod_verify_validationMsg_phonenumber_createaccount() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		gettxtcreateaccountmobile().sendKeys(Keys.TAB);
		PauseUtil.pause(2500);
		System.out.println("error message" + gettooltiperrormessage().getText());
		AssertUtils.assertTextMatches(gettooltiperrormessage(), Matchers.containsString(ConstantUtils.INVALIDPHNNUMMESSAGE));
	}


	@Override
	public void pcod_tooltip_validationmessage(String errmsg) {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		System.out.println("error message" + gettooltiperrormessage().getText());
		AssertUtils.assertTextMatches(gettooltiperrormessage(), Matchers.containsString(errmsg));
	}


	@Override
	public void pcod_verify_validationMsg_firstname_lastname_createaccount_notpresent() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		Assert.assertEquals(sizetooltiperrormessage().size() > 0, false);
	}


	@Override
	public void pcod_verify_validationMsg_postalcode_notassociatedtoschool_connect_to_your_teacher() {
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		System.out.println("error message : " + rewardsAndCoupons.ctt_cannotlocateschool_lblErrorMessage().getText());
		System.out.println("error message from const : "+ConstantUtils.PostalCODENOTASSOCIATEDTOSCHOOL_MSG);
		AssertUtils.assertTextMatches(rewardsAndCoupons.ctt_cannotlocateschool_lblErrorMessage(), Matchers.containsString(ConstantUtils.PostalCODENOTASSOCIATEDTOSCHOOL_MSG));
	}

	@Override
	public void pcod_verify_validationMsg_noteacher_selectedschool_connect_to_your_teacher() {
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		System.out.println("error message : " + rewardsAndCoupons.ctt_cannotlocateschool_lblErrorMessage().getText());
		System.out.println("const message : "+ConstantUtils.NOTEACHER_SELECTEDSCHOOL_MSG);
		AssertUtils.assertTextMatches(rewardsAndCoupons.ctt_cannotlocateschool_lblErrorMessage(), Matchers.containsString(ConstantUtils.NOTEACHER_SELECTEDSCHOOL_MSG));
	}
	
	
	public void pcod_verify_validationMsg_no_teacher_registered() {
		RewardsAndCoupons rewardsAndCoupons =
				getFactory().getICheckoutPage().getRewardsAndCouponsSection();

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		System.out.println("error message : " + rewardsAndCoupons.ctt_noteacherfoundlblerrormessage().getText());
		System.out.println("const message : "+ConstantUtils.NOTEACHER_REGISTERED_MSG);
		Assert.assertTrue(rewardsAndCoupons.ctt_noteacherfoundlblerrormessage().getText().trim().contains(ConstantUtils.NOTEACHER_REGISTERED_MSG.trim()));
		//AssertUtils.assert(rewardsAndCoupons.ctt_noteacherfoundlblerrormessage(), Matchers.containsString(ConstantUtils.NOTEACHER_REGISTERED_MSG));
	}
	
	


	@Override
	public void pcod_verify_postalcode_placeholder_connect_to_your_teacher(Configuration testData) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String actual_postalcodeplaceholder = gettxtconnectyourteacherpostalcode().getAttribute("placeholder");
		String exp_postalcodeplaceholder = testData.getString("exp_postalcodeplaceholder");
		if (!actual_postalcodeplaceholder.equals(exp_postalcodeplaceholder)) {
			Assert.fail("Place holder is not correct in postal code text field");
		}
	}


	@Override
	public void pcod_connect_to_your_teacher() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getlblconnectyourteacher(), 30));
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
	}

	@Override
	public void pcod_backbtn_connect_to_your_teacher() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getbtnbackconnectyourteacher(), 30));
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
	}

	@Override
	public void pcod_nextbtn_connect_to_your_teacher() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getbtnnextconnectyourteacher(), 30));
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
	}

	@Override
	public void pcod_searchbtn_connect_to_your_teacher() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getbtnsearchconnectyourteacher(), 30));
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
	}

	@Override
	public void pcod_newsearchbtn_connect_to_your_teacher() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getbtnnewsearchconnectyourteacher(), 30));
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
	}

	@Override
	public void pcod_closeicon_connect_to_your_teacher() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(geticoncloseconnectyourteacher(), 30));
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
	}

	@Override
	public void pcod_link_findyourteacher_connect_to_your_teacher() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getlnkfindyourteacherconnectyourteacher(), 30));
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
	}

	@Override
	public void pcod_link_cantfindyourteacher_connect_to_your_teacher() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getlnkcantfindyourteacherconnectyourteacher(), 30));
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
	}

	@Override
	public void pcod_drpdwn_province_connect_to_your_teacher() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getdrpdwnprovinceconnectyourteacher(), 30));
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
	}

	@Override
	public void pcod_drpdwn_city_connect_to_your_teacher() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getdrpdwncityconnectyourteacher(), 30));
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
	}

	@Override
	public void pcod_drpdwn_selectteacher_connect_to_your_teacher() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getdrpdwnselectteacherconnectyourteacher(), 30));
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
	}


	@Override
	public void pcod_select_province_connect_to_your_teacher(Configuration testData) {

		PauseUtil.waitForAjaxToComplete(1000);
SCHUtils.waitForElementToBeClickable(getSelectProvince_ConnectYourTeacher_parentschool(), 30);
//getSelectProvince_ConnectYourTeacher_parentschool().click();
SCHUtils.clickUsingJavaScript(getSelectProvince_ConnectYourTeacher_parentschool());
PauseUtil.waitForAjaxToComplete(1000);

		SCHUtils.selectOptionByVisibleText(getSelectProvince_ConnectYourTeacher(),
				testData.getString("province"));
		PauseUtil.pause(2000);
		PauseUtil.waitForAjaxToComplete(1000);
	}

	@Override
	public void pcod_select_city_connect_to_your_teacher(Configuration testData) {

		PauseUtil.waitForAjaxToComplete(1000);
		SCHUtils.clickUsingJavaScript(connecttoyourteacherselectschoolcity());
		//PauseUtil.waitForAjaxToComplete(1000);
		//System.out.println("city to be selected is : "+testData.getString("city"));
		//System.out.println("select text is : "+getselectcity_ConnectYourTeacher().getText());
		//WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		//SCHUtils.selectOptionByIndex(getselectcity_ConnectYourTeacher(), 2);
		SCHUtils.selectOptionByVisibleText(getselectcity_ConnectYourTeacher(),testData.getString("city"));
		
		PauseUtil.pause(2000);
		PauseUtil.waitForAjaxToComplete(1000);
	}

	@Override
	public void pcod_select_school_connect_to_your_teacher(Configuration testData) {

		PauseUtil.waitForAjaxToComplete(1000);

		SCHUtils.selectOptionByvalue(getselectschool_ConnectYourTeacher(),
				testData.getString("school"));


		PauseUtil.pause(2000);
		//getselectschool_ConnectYourTeacher()
		SCHUtils.clickUsingJavaScript(schoolconnectoyourteacherdrpdwn());
		PauseUtil.waitForAjaxToComplete(1000);
	}

	public void enterAccountNumber_Email(String acc_email) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		getTxtUsername().clear();
		getTxtUsername().sendKeys(acc_email);
		PauseUtil.pause(1500);
	}

	public void enterPassword(String password) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		getTxtPassword().clear();
		getTxtPassword().sendKeys(password);
		PauseUtil.pause(1500);
	}

	public void enterCACtNumber(String cacno) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtconnectyourteacherCAC().clear();
		gettxtconnectyourteacherCAC().sendKeys(cacno);
		PauseUtil.pause(1500);
	}

	public void pcod_enterpostalcode_connecttoteacher(String postalcode) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtconnectyourteacherpostalcode().click();
		gettxtconnectyourteacherpostalcode().clear();
		gettxtconnectyourteacherpostalcode().sendKeys(postalcode);
		PauseUtil.pause(1500);
	}

	public void pcod_enterfirstname_createaccount(String firstname) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtcreateaccountfirstname().clear();
		gettxtcreateaccountfirstname().sendKeys(firstname);
		PauseUtil.pause(1500);
	}

	public void pcod_enterfirstname_addachild(String firstname) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtaddachildfirstname().clear();
		gettxtaddachildfirstname().sendKeys(firstname);
		PauseUtil.pause(1500);
	}

	public void pcod_enterlastname_addachild(String lastname) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtaddachildlastname().clear();
		gettxtaddachildlastname().sendKeys(lastname);
		PauseUtil.pause(1500);
	}

	public void pcod_enteralldata_createaccount(String firstname, String lastname, String email, String password, String mobnumber) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtcreateaccountfirstname().clear();
		gettxtcreateaccountfirstname().sendKeys(firstname);
		PauseUtil.pause(1000);
		gettxtcreateaccountlastname().clear();
		gettxtcreateaccountlastname().sendKeys(lastname);
		PauseUtil.pause(1000);
		gettxtcreateaccountemail().clear();
		gettxtcreateaccountemail().sendKeys(email);
		PauseUtil.pause(1000);
		gettxtcreateaccountpassword().clear();
		gettxtcreateaccountpassword().sendKeys(password);
		PauseUtil.pause(1000);
		gettxtcreateaccountmobile().clear();
		gettxtcreateaccountmobile().sendKeys(mobnumber);
		PauseUtil.pause(2500);
		getchkboxcreateaccountlngeng().click();
		PauseUtil.pause(1000);
		getchkboxcreateaccounttermsofuse().click();
		PauseUtil.pause(1000);
		getchkboxcreateaccountprivacypolicy().click();
		PauseUtil.pause(1000);

	}


	public void pcod_enteralldata_exceptphonenumber_createaccount(String firstname, String lastname, String email, String password) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtcreateaccountfirstname().clear();
		gettxtcreateaccountfirstname().sendKeys(firstname);
		PauseUtil.pause(1000);
		gettxtcreateaccountlastname().clear();
		gettxtcreateaccountlastname().sendKeys(lastname);
		PauseUtil.pause(1000);
		gettxtcreateaccountemail().clear();
		gettxtcreateaccountemail().sendKeys(email);
		PauseUtil.pause(1000);
		gettxtcreateaccountpassword().clear();
		gettxtcreateaccountpassword().sendKeys(password);
		PauseUtil.pause(1000);
		getchkboxcreateaccountlngeng().click();
		PauseUtil.pause(1000);
		getchkboxcreateaccounttermsofuse().click();
		PauseUtil.pause(1000);
		getchkboxcreateaccountprivacypolicy().click();
		PauseUtil.pause(1000);

	}


	public void pcod_enteralldata_langunselect_createaccount(String firstname, String lastname, String email, String password, String mobnumber) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtcreateaccountfirstname().clear();
		gettxtcreateaccountfirstname().sendKeys(firstname);
		PauseUtil.pause(1000);
		gettxtcreateaccountlastname().clear();
		gettxtcreateaccountlastname().sendKeys(lastname);
		PauseUtil.pause(1000);
		gettxtcreateaccountemail().clear();
		gettxtcreateaccountemail().sendKeys(email);
		PauseUtil.pause(1000);
		gettxtcreateaccountpassword().clear();
		gettxtcreateaccountpassword().sendKeys(password);
		PauseUtil.pause(1000);
		gettxtcreateaccountmobile().clear();
		gettxtcreateaccountmobile().sendKeys(mobnumber);
		PauseUtil.pause(1500);
		getchkboxcreateaccounttermsofuse().click();
		PauseUtil.pause(1000);
		getchkboxcreateaccountprivacypolicy().click();
		PauseUtil.pause(1000);

	}


	public void pcod_enteralldata_except_termspolicy_createaccount(String firstname, String lastname, String email, String password, String mobnumber) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtcreateaccountfirstname().clear();
		gettxtcreateaccountfirstname().sendKeys(firstname);
		PauseUtil.pause(1000);
		gettxtcreateaccountlastname().clear();
		gettxtcreateaccountlastname().sendKeys(lastname);
		PauseUtil.pause(1000);
		gettxtcreateaccountemail().clear();
		gettxtcreateaccountemail().sendKeys(email);
		PauseUtil.pause(1000);
		gettxtcreateaccountpassword().clear();
		gettxtcreateaccountpassword().sendKeys(password);
		PauseUtil.pause(1000);
		gettxtcreateaccountmobile().clear();
		gettxtcreateaccountmobile().sendKeys(mobnumber);
		PauseUtil.pause(1000);
		getchkboxcreateaccountlngeng().click();
		PauseUtil.pause(1500);

	}

	public void pcod_enterlastname_createaccount(String lastname) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtcreateaccountlastname().clear();
		gettxtcreateaccountlastname().sendKeys(lastname);
		PauseUtil.pause(1500);
	}

	public void pcod_enteremail_createaccount(String email) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtcreateaccountemail().clear();
		gettxtcreateaccountemail().sendKeys(email);
		PauseUtil.pause(1500);
	}

	public void pcod_enterpassword_createaccount(String password) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtcreateaccountpassword().clear();
		gettxtcreateaccountpassword().sendKeys(password);
		PauseUtil.pause(1500);
	}

	public void pcod_enterphonenumber_createaccount(String mobnumber) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtcreateaccountmobile().clear();
		gettxtcreateaccountmobile().sendKeys(mobnumber);
		PauseUtil.pause(1500);
	}

	public void pcod_clickslastname_createaccount() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtcreateaccountlastname().clear();
		PauseUtil.pause(1500);
	}

	public void pcod_clicksemail_createaccount() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtcreateaccountemail().clear();
		PauseUtil.pause(1500);
	}

	public void pcod_clicksphonenumber_createaccount() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtcreateaccountmobile().clear();
		PauseUtil.pause(1500);
	}

	public void pcod_clickspassword_createaccount() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtcreateaccountpassword().clear();
		PauseUtil.pause(1500);
	}

	public void pcod_enterpostalcode_tabout_connecttoteacher(String postalcode) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtconnectyourteacherpostalcode().clear();
		gettxtconnectyourteacherpostalcode().sendKeys(postalcode);
		PauseUtil.pause(1500);
		gettxtconnectyourteacherpostalcode().sendKeys(Keys.TAB);
		PauseUtil.pause(1500);
	}


	public void pcod_enteralldata_addachild(String firstname, String lastname) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		gettxtaddachildfirstname().clear();
		gettxtaddachildfirstname().sendKeys(firstname);
		PauseUtil.pause(1000);
		gettxtaddachildlastname().clear();
		gettxtaddachildlastname().sendKeys(lastname);
		PauseUtil.pause(1000);
		SCHUtils.selectOptionByvalue(getdrpdownaddachildgrade(), (ConstantUtils.CHILDGRADE1));
		PauseUtil.pause(1500);
		/*SCHUtils.selectOptionByvalue(getdrpdownaddachildbirthdatemonth(),(ConstantUtils.CHILDBIRTHMONTH_JAN));
		PauseUtil.pause(1500);
		SCHUtils.selectOptionByvalue(getdrpdownaddachildbirthdateyear(),(ConstantUtils.CHILDBIRTHYEAR));
		PauseUtil.pause(1500);*/
		gettxtaddachildfirstname().click();
		PauseUtil.pause(3500);
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_firstname", String.valueOf
				(gettxtaddachildfirstname().getText()));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_lastname", String.valueOf
				(gettxtaddachildlastname().getText()));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_grade", String.valueOf
				(getdropdownaddachildgrade().getText()));
    	/*TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_birthmonth", String.valueOf
    	        (getdropdownaddachildbirthdatemonth().getText()));
    	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_birthyear", String.valueOf
    	        (getdropdownaddachildbirthdateyear().getText()));*/

	}


//	public void pcod_enteralldata_addsecondchild(String firstname, String lastname, String cacno2) {
//		SCHUtils.waitForLoaderToDismiss();
//		PauseUtil.waitForAjaxToComplete(1500);
//		PauseUtil.pause(1500);
//		getbtnaddanotherchild().click();
//		PauseUtil.pause(1500);
//		gettxtaddachildfirstname().clear();
//		gettxtaddachildfirstname().sendKeys(firstname);
//		PauseUtil.pause(1000);
//		gettxtaddachildlastname().clear();
//		gettxtaddachildlastname().sendKeys(lastname);
//		PauseUtil.pause(1000);
//		SCHUtils.selectOptionByvalue(getdrpdownaddachildgrade(), (TestBaseProvider.getTestBase().getTestData().getString("child2grade")));
//		PauseUtil.pause(1500);
//		SCHUtils.selectOptionByvalue(getdrpdownaddachildbirthdatemonth(), (TestBaseProvider.getTestBase().getTestData().getString("child2birthmonth")));
//		PauseUtil.pause(1500);
//		SCHUtils.selectOptionByvalue(getdrpdownaddachildbirthdateyear(), (TestBaseProvider.getTestBase().getTestData().getString("child2birthyear")));
//		PauseUtil.pause(1500);
//		pcod_homepage.gettxtconnecttoateacheraddachildhomepage().clear();
//		pcod_homepage.gettxtconnecttoateacheraddachildhomepage().sendKeys(cacno2);
//		PauseUtil.pause(1000);
//		pcod_homepage.getbtnsubmitaddachildhomepage().click();
//		PauseUtil.pause(4000);
//		gettxtaddachildfirstname().click();
//		PauseUtil.pause(3500);
//		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_firstname", String.valueOf
//				(gettxtaddachildfirstname().getText()));
//		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_lastname", String.valueOf
//				(gettxtaddachildlastname().getText()));
//		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_grade", String.valueOf
//				(getdropdownaddachildgrade().getText()));
//    	/*TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_birthmonth", String.valueOf
//    	        (getdropdownaddachildbirthdatemonth().getText()));
//    	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_birthyear", String.valueOf
//    	        (getdropdownaddachildbirthdateyear().getText()));*/
//		getbuttonAddchildSave().click();
//		PauseUtil.pause(3500);
//
//	}
	
	public void pcod_enteralldata_addsecondchild(String firstname, String lastname, String postalcode, String schoolName, String teacherAccNum) {
		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(1500);
		PauseUtil.pause(1500);
		//getbtnaddanotherchild().click();
		getAddAnotherChildButton().click();
		PauseUtil.pause(1500);
		gettxtaddachildfirstname().clear();
		gettxtaddachildfirstname().sendKeys(firstname);
		PauseUtil.pause(1000);
		gettxtaddachildlastname().clear();
		gettxtaddachildlastname().sendKeys(lastname);
		PauseUtil.pause(1000);
		SCHUtils.selectOptionByvalue(getdrpdownaddachildgrade(), (TestBaseProvider.getTestBase().getTestData().getString("child2grade")));
		PauseUtil.pause(1500);
		SCHUtils.selectOptionByvalue(getdrpdownaddachildbirthdatemonth(), (TestBaseProvider.getTestBase().getTestData().getString("child2birthmonth")));
		PauseUtil.pause(1500);
		SCHUtils.selectOptionByvalue(getdrpdownaddachildbirthdateyear(), (TestBaseProvider.getTestBase().getTestData().getString("child2birthyear")));
		PauseUtil.pause(1500);
		
		getlinkAddchildFindyourTeacher().click();
		
		SCHUtils.isPresent(getinputboxzipcodefatmodal());
		System.out.println("Postal Code:" + postalcode);
		getinputboxzipcodefatmodal().sendKeys(postalcode);
		getclick_addchild_fatModal_search().click();
		
		PauseUtil.pause(1000);
		SCHUtils.isPresent(getConnectTeacherFatFlow());
		
		driver.findElement(By.xpath("(//span[contains(text(), \"" + schoolName + "\")])[1]")).click();
		PauseUtil.pause(1000);
		SCHUtils.waitForElementToBeClickable(getFatflowConnectTeacherButtonNext(),5000);
		
		getFatflowConnectTeacherButtonNext().click();
		PauseUtil.pause(2000);
		SCHUtils.selectOptionByvalue(getTeacherName_FATflowAddchild(), teacherAccNum);
		
		SCHUtils.waitForElementToBeClickable(getFatflowConnectTeacherButtonNext(),5000);
		PauseUtil.pause(1000);
		getFatflowConnectTeacherButtonNext().click();
		
		PauseUtil.pause(1000);
		getbuttonAddchildSave().click();
		
		PauseUtil.pause(4000);
		//pcod_homepage.getbtnsubmitaddachildhomepage().click();
		getbtngetstarted().click();
		//gettxtaddachildfirstname().click();
		//PauseUtil.pause(3500);
		/*TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_firstname", String.valueOf
				(gettxtaddachildfirstname().getText()));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_lastname", String.valueOf
				(gettxtaddachildlastname().getText()));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_grade", String.valueOf
				(getdropdownaddachildgrade().getText()));
    	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_birthmonth", String.valueOf
    	        (getdropdownaddachildbirthdatemonth().getText()));
    	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_birthyear", String.valueOf
    	        (getdropdownaddachildbirthdateyear().getText()));*/
		
		PauseUtil.pause(3500);

	}

	public void pcod_enteralldata_addachild_homepage_child_lastname_blank(String firstname, String lastname, String cacno){
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtaddachildfirstname().clear();
		gettxtaddachildfirstname().sendKeys(firstname);
		PauseUtil.pause(1000);
		gettxtaddachildlastname().clear();
		gettxtaddachildlastname().sendKeys(lastname);
		PauseUtil.pause(1000);
		/*SCHUtils.clickUsingJavaScript(drpdownaddachildgradeselect());
		PauseUtil.pause(1000);*/
		SCHUtils.selectOptionByvalue(getdrpdownaddachildgrade(),(ConstantUtils.CHILDGRADE1));
		PauseUtil.pause(1500);
		SCHUtils.selectOptionByVisibleText(getdrpdownaddachildbirthdatemonth(), (ConstantUtils.CHILDBIRTHMONTH_JAN));
		PauseUtil.pause(1500);
		SCHUtils.selectOptionByVisibleText(getdrpdownaddachildbirthdateyear(), (ConstantUtils.CHILDBIRTHYEAR));
		PauseUtil.pause(1500);
		gettxtaddachildfirstname().click();
	}
	
	
	
	public void pcod_enteralldata_addachild_homepage(String firstname, String lastname, String cacno) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtaddachildfirstname().clear();
		gettxtaddachildfirstname().sendKeys(firstname);
		PauseUtil.pause(1000);
		gettxtaddachildlastname().clear();
		gettxtaddachildlastname().sendKeys(lastname);
		PauseUtil.pause(1000);
		/*SCHUtils.clickUsingJavaScript(drpdownaddachildgradeselect());
		PauseUtil.pause(1000);*/
		SCHUtils.selectOptionByvalue(getdrpdownaddachildgrade(),(ConstantUtils.CHILDGRADE1));
		PauseUtil.pause(1500);
		SCHUtils.selectOptionByVisibleText(getdrpdownaddachildbirthdatemonth(), (ConstantUtils.CHILDBIRTHMONTH_JAN));
		PauseUtil.pause(1500);
		SCHUtils.selectOptionByVisibleText(getdrpdownaddachildbirthdateyear(), (ConstantUtils.CHILDBIRTHYEAR));
		PauseUtil.pause(1500);
		gettxtaddachildfirstname().click();
		/*pcod_homepage.gettxtconnecttoateacheraddachildhomepage().clear();
		pcod_homepage.gettxtconnecttoateacheraddachildhomepage().sendKeys(cacno);*/
		PauseUtil.pause(1000);
		
		PauseUtil.pause(4000);
		//gettxtaddachildfirstname().click();
		PauseUtil.pause(3500);
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_firstname", String.valueOf
				(gettxtaddachildfirstname().getText()));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_lastname", String.valueOf
				(gettxtaddachildlastname().getText()));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_grade", String.valueOf
				(getdropdownaddachildgrade().getText()));
    	/*TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_birthmonth", String.valueOf
    	        (getdropdownaddachildbirthdatemonth().getText()));
    	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_birthyear", String.valueOf
    	        (getdropdownaddachildbirthdateyear().getText()));*/		
		getbuttonAddchildSave().click();
		PauseUtil.pause(3500);
	}

	public void pcod_enteralldata_addachild_homepage1(String firstname, String lastname, String cacno) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtaddachildfirstname().clear();
		gettxtaddachildfirstname().sendKeys(firstname);
		PauseUtil.pause(1000);
		gettxtaddachildlastname().clear();
		gettxtaddachildlastname().sendKeys(lastname);
		PauseUtil.pause(1000);
		SCHUtils.selectOptionByvalue(getdrpdownaddachildgrade(), (ConstantUtils.CHILDGRADE1));
		PauseUtil.pause(1500);
		SCHUtils.selectOptionByvalue(getdrpdownaddachildbirthdatemonth(), (ConstantUtils.CHILDBIRTHMONTH_JAN));
		PauseUtil.pause(1500);
		SCHUtils.selectOptionByvalue(getdrpdownaddachildbirthdateyear(), (ConstantUtils.CHILDBIRTHYEAR));
		PauseUtil.pause(1500);
		pcod_homepage.gettxtconnecttoateacheraddachildhomepage().clear();
		pcod_homepage.gettxtconnecttoateacheraddachildhomepage().sendKeys(cacno);
		PauseUtil.pause(1000);
		pcod_homepage.getbtnsubmitaddachildhomepage().click();
		PauseUtil.pause(4000);
		gettxtaddachildfirstname().click();
		PauseUtil.pause(3500);
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_firstname", String.valueOf
				(gettxtaddachildfirstname().getText()));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_lastname", String.valueOf
				(gettxtaddachildlastname().getText()));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_grade", String.valueOf
				(getdropdownaddachildgrade().getText()));

		System.out.println("<<<<<<<<<<<child data added");

	}

	public void pcod_enteralldata_except_grade_addachild(String firstname, String lastname) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtaddachildfirstname().clear();
		gettxtaddachildfirstname().sendKeys(firstname);
		PauseUtil.pause(1000);
		gettxtaddachildlastname().clear();
		gettxtaddachildlastname().sendKeys(lastname);
		PauseUtil.pause(1000);
		SCHUtils.selectOptionByvalue(getdrpdownaddachildbirthdatemonth(), (ConstantUtils.CHILDBIRTHMONTH_JAN));
		PauseUtil.pause(1500);
		SCHUtils.selectOptionByvalue(getdrpdownaddachildbirthdateyear(), (ConstantUtils.CHILDBIRTHYEAR));
		PauseUtil.pause(1500);
		gettxtaddachildfirstname().click();
		PauseUtil.pause(3500);

	}


	public void pcod_enteralldata_except_birthdetails_addachild(String firstname, String lastname) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtaddachildfirstname().clear();
		gettxtaddachildfirstname().sendKeys(firstname);
		PauseUtil.pause(1000);
		gettxtaddachildlastname().clear();
		gettxtaddachildlastname().sendKeys(lastname);
		PauseUtil.pause(1000);
		SCHUtils.selectOptionByvalue(getdrpdownaddachildgrade(), (ConstantUtils.CHILDGRADE1));
		PauseUtil.pause(1500);
		gettxtaddachildfirstname().click();
		PauseUtil.pause(3500);

	}

	public void pcod_enteralldata_partial_birthdetails_addachild(String firstname, String lastname) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtaddachildfirstname().clear();
		gettxtaddachildfirstname().sendKeys(firstname);
		PauseUtil.pause(1000);
		gettxtaddachildlastname().clear();
		gettxtaddachildlastname().sendKeys(lastname);
		PauseUtil.pause(1000);
		SCHUtils.selectOptionByvalue(getdrpdownaddachildgrade(), (ConstantUtils.CHILDGRADE1));
		PauseUtil.pause(1500);
		SCHUtils.selectOptionByvalue(getdrpdownaddachildbirthdatemonth(), (ConstantUtils.CHILDBIRTHMONTH_JAN));
		PauseUtil.pause(1500);
		gettxtaddachildfirstname().click();
		PauseUtil.pause(3500);

	}


	@Override
	public void verify_connecttoteacher_cacfield(Configuration testData) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String actual_cacno = gettxtconnectyourteacherCAC().getAttribute("value");
		String exp_cacno = testData.getString("correct_cacno");
		System.out.println("postal code value is :" + gettxtconnectyourteacherCAC().getAttribute("value"));
		if (!actual_cacno.equals(exp_cacno)) {
			Assert.fail("CAC number functionality is wrong");
		}
	}

	@Override
	public void verify_createaccount_firstname_size() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String actual_firstname = gettxtcreateaccountfirstname().getAttribute("value");
		int firnamesize = actual_firstname.length();
		if (!(firnamesize == 29)) {
			Assert.fail("FirstName is not equal to 30 Characters" + firnamesize);
		}
	}

	@Override
	public void verify_addachild_firstname_size(Configuration testData) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String actual_firstname = gettxtaddachildfirstname().getAttribute("value");
		int firnamesize = actual_firstname.length();
		String exp_firstnamesize1 = testData.getString("exp_firstnamesize");
		int exp_firstnamesize = Integer.parseInt(exp_firstnamesize1);
		if (firnamesize > exp_firstnamesize) {
			Assert.fail("Able to enter more than 50 characters in first name field in add a child window");
		}
	}


	@Override
	public void verify_addachild_lastname_size(Configuration testData) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String actual_lastname = gettxtaddachildlastname().getAttribute("value");
		int lastnamesize = actual_lastname.length();
		String exp_lastnamesize1 = testData.getString("exp_lastnamesize");
		int exp_lastnamesize = Integer.parseInt(exp_lastnamesize1);
		if (lastnamesize > exp_lastnamesize) {
			Assert.fail("Able to enter more than 50 characters in last name field in add a child window");
		}
	}

	@Override
	public void verify_createaccount_lastname_size(Configuration testData) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String actual_lastname = gettxtcreateaccountlastname().getAttribute("value");
		int lastnamesize = actual_lastname.length();
		String exp_lastnamesize1 = testData.getString("exp_lastnamesize");
		int exp_lastnamesize = Integer.parseInt(exp_lastnamesize1);
		if (lastnamesize > exp_lastnamesize) {
			Assert.fail("Able to enter more than 30 characters in last name field in create account window");
		}
	}

	@Override
	public void verify_createaccount_firstname(Configuration testData) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String actual_firstname = gettxtcreateaccountfirstname().getAttribute("value");
		String exp_firstname = testData.getString("exp_firstname");
		if (!actual_firstname.equals(exp_firstname)) {
			Assert.fail("Able to enter more than 30 characters in first name field in create account window");
		}
	}

	@Override
	public void verify_createaccount_lastname(Configuration testData) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String actual_lastname = gettxtcreateaccountlastname().getAttribute("value");
		String exp_lastname = testData.getString("exp_lastname");
		if (!actual_lastname.equals(exp_lastname)) {
			Assert.fail("Able to enter more than 30 characters in last name field in create account window");
		}
	}

	@Override
	public void verify_createaccount_firstname_saved(Configuration testData) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String actual_firstname = gettxtcreateaccountfirstname().getAttribute("value");
		String exp_firstname = testData.getString("firstname");
		if (!actual_firstname.equals(exp_firstname)) {
			Assert.fail("Text entered in firt name field is not saved in Create Account window");
		}
	}


	@Override
	public void verify_createaccount_password_showdefault(Configuration testData) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String actual_password = gettxtcreateaccountpassword().getAttribute("value");
		String exp_password = testData.getString("password");
		if (!actual_password.equals(exp_password)) {
			Assert.fail("Text entered in password field is not seen by default in Create Account window");
		}
	}

	@Override
	public void verify_createaccount_password_hidden() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String password = gettxtcreateaccountpassword().getAttribute("type");
		if (!password.equals("password")) {
			Assert.fail("Password entered in password field is not hidden");
		}
	}

	@Override
	public void verify_createaccount_password_shown() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String password = gettxtcreateaccountpassword().getAttribute("type");
		if (!password.equals("text")) {
			Assert.fail("Password entered in password field is not shown when clicked on show link");
		}
	}

	@Override
	public void pcod_verify_validationMsg_password_createaccount() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		System.out.println("error message" + gettooltiperrormessage().getText());
		AssertUtils.assertTextMatches(gettooltiperrormessage(), Matchers.containsString(ConstantUtils.INVALIDPASSWORDERRORMSG));
	}

	@Override
	public void pcod_verify_correct_password_createaccount() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		gettxtcreateaccountmobile().clear();
		PauseUtil.pause(1500);
		String password = gettxtcreateaccountpassword().getAttribute("aria-invalid");
		System.out.println("Password field area is:" + password);
		if (password.equals("true")) {
			Assert.fail("Password field should not be highlighted in yellow are not in red border in Create Account window");
		}
		Assert.assertEquals(sizetxtcreateaccountpassworderror().size() > 0, false);
	}

	@Override
	public void verify_createaccount_lastname_saved(Configuration testData) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String actual_lastname = gettxtcreateaccountlastname().getAttribute("value");
		String exp_lastname = testData.getString("lastname");
		if (!actual_lastname.equals(exp_lastname)) {
			Assert.fail("Text entered in last name field is not saved in Create Account window");
		}
	}

	@Override
	public void verify_createaccount_firstname_emptyfield() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String empty_firstname = gettxtcreateaccountfirstname().getAttribute("aria-invalid");
		String empty_firstnameerror = gettxtcreateaccountfirstname().getAttribute("class");
		System.out.println("First name field area is:" + empty_firstname);
		System.out.println("First name error field area is:" + empty_firstnameerror);
		if ((!empty_firstname.equals("true")) || (!empty_firstnameerror.contains("tooltipstered"))) {
			Assert.fail("First name field is not highlighted in yellow are not in red border in Create Account window");
		}
	}

	@Override
	public void verify_createaccount_lastname_emptyfield() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String empty_lastname = gettxtcreateaccountlastname().getAttribute("aria-invalid");
		String empty_lastnameerror = gettxtcreateaccountlastname().getAttribute("class");
		System.out.println("Last name field area is:" + empty_lastname);
		System.out.println("Last name error field area is:" + empty_lastnameerror);
		if ((!empty_lastname.equals("true")) || (!empty_lastnameerror.contains("tooltipstered"))) {
			Assert.fail("Last name field is not highlighted in yellow are not in red border in Create Account window");
		}
	}

	@Override
	public void verify_createaccount_email_empty_incorrect_highlighted() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String empty_email = gettxtcreateaccountemail().getAttribute("aria-invalid");
		String empty_emailerror = gettxtcreateaccountemail().getAttribute("class");
		System.out.println("Email field area is:" + empty_email);
		System.out.println("Email error field area is:" + empty_emailerror);
		if ((!empty_email.equals("true")) || (!empty_emailerror.contains("tooltipstered"))) {
			Assert.fail("Email field is not highlighted in yellow are not in red border in Create Account window");
		}
	}

	@Override
	public void verify_createaccount_password_empty_incorrect_highlighted() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String empty_email = gettxtcreateaccountpassword().getAttribute("aria-invalid");
		String empty_emailerror = gettxtcreateaccountpassword().getAttribute("class");
		System.out.println("Email field area is:" + empty_email);
		System.out.println("Email error field area is:" + empty_emailerror);
		if ((!empty_email.equals("true")) || (!empty_emailerror.contains("tooltipstered"))) {
			Assert.fail("Password field is not highlighted in yellow are not in red border in Create Account window");
		}
	}

	@Override
	public void verify_createaccount_phonenumber_empty_incorrect_highlighted() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String incorrect_phno = gettxtcreateaccountmobile().getAttribute("aria-invalid");
		String phno_red = gettxtcreateaccountmobile().getAttribute("class");
		System.out.println("Ph No field area is:" + incorrect_phno);
		System.out.println("Ph No error field area is:" + phno_red);
		if ((!incorrect_phno.equals("true")) || (!phno_red.contains("tooltipstered"))) {
			Assert.fail("Phone number field is not highlighted in yellow are not in red border in Create Account window");
		}
	}


	@Override
	public void verify_createaccount_firstname_NotHighlighted() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String empty_firstname = gettxtcreateaccountfirstname().getAttribute("aria-invalid");
		System.out.println("First name field area is:" + empty_firstname);
		if (empty_firstname.equals("true")) {
			Assert.fail("First name field should not be highlighted in yellow with red border in Create Account window");
		}
		Assert.assertEquals(sizetxtcreateaccountfirstnameerror().size() > 0, false);
	}

	@Override
	public void verify_createaccount_lastname_NotHighlighted() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String empty_lastname = gettxtcreateaccountlastname().getAttribute("aria-invalid");
		System.out.println("First name field area is:" + empty_lastname);
		if (empty_lastname.equals("true")) {
			Assert.fail("Last name field should not be highlighted in yellow with red border in Create Account window");
		}
		Assert.assertEquals(sizetxtcreateaccountfirstnameerror().size() > 0, false);
	}

	@Override
	public void verify_connecttoteacher_postalcode_autoformatted(Configuration testData) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String actual_postalcode = gettxtconnectyourteacherpostalcode().getAttribute("value");
		String exp_postalcode = testData.getString("correct_postalcode");
		System.out.println("postal code value is :" + gettxtconnectyourteacherpostalcode().getAttribute("value"));
		if (!actual_postalcode.equals(exp_postalcode)) {
			Assert.fail("postal code is not auto formatted");
		}
	}

	@Override
	public void mousehover_whatsthis_connecttoteacher() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		Actions action = new Actions(driver);
		action.moveToElement(getlnkconnectyourteacherwhatsthis()).build().perform();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
	}

	public void verify_tooltip_whatsthis_connecttoteacher() {
		System.out.println("error message" + gettooltipconnectyourteacherwhatsthis().getText());
		AssertUtils.assertTextMatches(gettooltipconnectyourteacherwhatsthis(), Matchers.containsString(ConstantUtils.WHATSTHISTOOLTIP_CONNECTTOTEACHER
		));
	}


	public void verify_tooltip_incorrectcac_connecttoteacher() {
		System.out.println("error message" + gettooltipconnectyourteachererrormsg().getText());
		AssertUtils.assertTextMatches(gettooltipconnectyourteachererrormsg(), Matchers.containsString(ConstantUtils.INCORRECTCACNUMBER_VALIDATIONMSG
		));
	}

	@Override
	public void verify_connectbtn_connecttoteacher_disabled() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		Assert.assertEquals(sizebtnconnectyourteacherconnectdisabled().size() > 0, true);
	}

	@Override
	public void verify_continuebtn_createaccount_disabled() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		Assert.assertEquals(sizebtncontinuecreateaccountdisabled().size() > 0, true);
	}


	@Override
	public void verify_button_disabled(List<WebElement> element) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		System.out.println("button size : "+element.size());
		Assert.assertEquals(element.size() > 0, true);
		Assert.assertTrue(!element.get(0).isEnabled());
	}


	@Override
	public void verify_button_enabled(List<WebElement> element) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		Assert.assertEquals(element.size() > 0, false);
	}

	@Override
	public void verify_continuebtn_createaccount_enabled() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		Assert.assertEquals(sizebtncontinuecreateaccountdisabled().size() > 0, false);
	}


	@Override
	public void verify_searchbtn_connecttoteacher_disabled() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		Assert.assertEquals(sizebtnconnectyourteachersearchdisabled().size() > 0, true);
	}


	@Override
	public void verify_searchbtn_connecttoteacher_enabled() {
		PauseUtil.pause(15000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		//Assert.assertNotEquals(sizebtnconnectyourteachersearchdisabled().size() > 0, true);
		Assert.assertFalse(sizebtnconnectyourteachersearchdisabled().get(0).isEnabled());
		//connectoyourteachersearchbutton();
	}

	@Override
	public void verify_Yesbtn_connecttoteacher_enabled() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		Assert.assertEquals(sizebtnconnectyourteacheryesenabled().size() > 0, true);
	}

	@Override
	public void verify_createanaccount_window_connecttoteacher() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		Assert.assertEquals(sizewindowcreateanaccountconnectyourteacher().size() > 0, true);
	}

	@Override
	public void verify_createanaccount_window_connecttoteacher_notpresent() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		Assert.assertEquals(sizewindowcreateanaccountconnectyourteacher().size() > 0, false);
	}

	@Override
	public void verify_yourteachername_textfield_connecttoteacher_present() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		AssertUtils.assertDisplayed(gettxtyourteachername_connectyourteacher());
	}

	@Override
	public void click_Nobtn_connecttoteacher() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		getbtnconnectyourteacherno().click();
		PauseUtil.pause(1500);
	}

	@Override
	public void click_createanaccount_connecttoteacher() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		getbtncreateanaccount_connectyourteacher().click();
		PauseUtil.pause(1500);
	}

	@Override
	public void click_hidelink_createanaccount() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		getlnkhide_createanaccount().click();
		PauseUtil.pause(1500);
		for (int i = 0; i <= 1; i++) {
			if (sizelnkhide_createanaccount().size() != 0) {
				getlnkhide_createanaccount().click();
				PauseUtil.pause(1500);
			}
		}
	}


	@Override
	public void select_language_createanaccount() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		getchkboxcreateaccountlngeng().click();
		PauseUtil.pause(1500);
	}


	@Override
	public void select_terms_createanaccount() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		getchkboxcreateaccounttermsofuse().click();
		PauseUtil.pause(1500);
	}

	@Override
	public void click_showlink_createanaccount() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		getlnkshow_createanaccount().click();
		PauseUtil.pause(1500);
	}

	@Override
	public void click_thisisnotmyteacherlink_connecttoteacher() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		getlnkthisisnotmyteacher_connectyourteacher().click();
		PauseUtil.pause(1500);
	}

	@Override
	public void verify_connectbtn_connecttoteacher_enabled() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		Assert.assertNotEquals(sizebtnconnectyourteacherconnectdisabled().size() > 0, true);

	}


	@Override
	public void verify_addchildwindow_connecttoteacher_present() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		Assert.assertEquals(sizewindowaddachildconnecttoteacher().size() > 0, true);

	}

	@Override
	public void verify_parentcreatedacccount_connecttoteacher() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		String msg = getwindowaddachildconnectyourteacher().getText();
		if (!msg.contains(ConstantUtils.CREATEPARENTMSG)) ;

	}


	@Override
	public void click_connectbtn_connecttoteacher() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		SCHUtils.clickUsingJavaScript(getbtnconnectyourteacherconnect());
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);

	}


	@Override
	public void click_continuebtn_createaccount() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		SCHUtils.clickUsingJavaScript(getbtncontinuecreateaccount());
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);

	}

	@Override
	public void verify_all_provinces_connectyourteacher() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		String provinces_connectyourteacher = getSelectProvince_ConnectYourTeacher().getText();
		for (int i = 0; i < ConstantUtils.provinces_connectyourteacher.length; i++) {
			if (!provinces_connectyourteacher.contains(ConstantUtils.provinces_connectyourteacher[i])) {
				Assert.fail("Application Issue." + ConstantUtils.provinces_connectyourteacher[i] + "is not present in province list");
			}
		}

	}

	@Override
	public void verify_schooldetails_connectyourteacher(WebElement element, Configuration testData) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		String schoolname = testData.getString("schoolname");
		String street = testData.getString("street");
		String city = testData.getString("city");
		String province = testData.getString("province");
		String postalcode = testData.getString("postalcode");

		String exp_schooldetails[] = {schoolname, street, city, province, postalcode};

		String schooldetails_connectyourteacher = element.getText();
		for (int i = 0; i < exp_schooldetails.length; i++) {
			if (!schooldetails_connectyourteacher.contains(exp_schooldetails[i])) {
				Assert.fail("Application Issue." + exp_schooldetails[i] + "is not present in school details");
			}
		}

	}

	@Override
	public void verify_schooldetails1_connectyourteacher(Configuration testData) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		String street = testData.getString("street");
		String city = testData.getString("city");
		String province = testData.getString("province");
		String postalcode = testData.getString("postalcode");

		String exp_schooldetails[] = {street, city, province, postalcode};

		String schooldetails_connectyourteacher = getschooldetails_ConnectYourTeacher().getText();
		for (int i = 0; i < exp_schooldetails.length; i++) {
			if (!schooldetails_connectyourteacher.contains(exp_schooldetails[i])) {
				Assert.fail("Application Issue." + exp_schooldetails[i] + "is not present in school details");
			}
		}

	}

	@Override
	public void verify_teachername_connectyourteacher(WebElement element, Configuration testData) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		String exp_teachername = testData.getString("teachername");

		String teacher_connectyourteacher = element.getText();
		if (!teacher_connectyourteacher.contains(exp_teachername)) {
			Assert.fail("Application Issue." + exp_teachername + "is not present in school details");
		}

	}

	@Override
	public void verify_schoolname_connectyourteacher(Configuration testData) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		String exp_schoolname = testData.getString("schoolname");

		String teacher_connectyourteacher = getschooldetails_ConnectYourTeacher().getText();
		if (!teacher_connectyourteacher.contains(exp_schoolname)) {
			Assert.fail("Application Issue." + exp_schoolname + "is not present in school details");
		}

	}


	@Override
	public void verify_all_cities_connectyourteacher() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		String provinces_connectyourteacher = getSelectProvince_ConnectYourTeacher().getText();
		for (int i = 0; i < ConstantUtils.cities_connectyourteacher.length; i++) {
			if (!provinces_connectyourteacher.contains(ConstantUtils.cities_connectyourteacher[i])) {
				Assert.fail("Application Issue." + ConstantUtils.cities_connectyourteacher[i] + "is not present in city list");
			}
		}

	}

	@Override
	public void openPage() {
		if (TestBaseProvider.getTestBase().getContext().getString("driver.name")
				.equals("Android")) {
			PauseUtil.pause(10000);
			WebElement el = TestBaseProvider.getTestBase().getDriver()
					.findElement(By.xpath("//button[@title='Close']"));
			PauseUtil.pause(15000);
			if (el.isDisplayed()) {
				el.click();
				WaitUtils.waitForEnabled(getTxtUsername());
			}
		}

	}


	@Override
	public void pcod_addachild_saved_successfully() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		String exp_child_firstname = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.child_firstname").toString();
		String exp_child_lastname = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.child_lastname").toString();
		String exp_child_grade = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.child_grade").toString();
		//String exp_child_month = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.child_birthmonth").toString();
		//String exp_child_year = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.child_birthyear").toString();

		String exp_values[] = {exp_child_firstname, exp_child_lastname, exp_child_grade};

		String actual_values = getlistaddachildaddeddetials().getText();
		for (int i = 0; i < exp_values.length; i++) {
			if (!actual_values.contains(exp_values[i])) {
				Assert.fail("Application Issue." + exp_values[i] + "is not present in Submit page");
			}
		}
	}


	public void parent_login(WebElement UserName, String username, String password) {
		System.out.println("username is : "+username);
		
		System.out.println("password is : "+password);
		PauseUtil.pause(1500);
		WaitUtils.waitForEnabled(UserName);
		getTxtUsername().clear();
		getTxtUsername().sendKeys(username);
		PauseUtil.pause(1000);
		getTxtPassword().clear();
		getTxtPassword().sendKeys(password);
		PauseUtil.pause(1000);
		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getbtnlogin(), 30));
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.closeButton_in_LoginPage();

		if (log_page.sizeiconCloseHomePageProd().size() != 0) {
			log_page.geticonCloseHomePageProd().click();
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(10000);

		}
		/*ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.user_do_the_empty_cart();
*/
		try {
			if (!pcod_homepage.getlblselectedchildparenthomepage().getText().equals(null) ||
					pcod_homepage.getlblselectedchildparenthomepage().getText().isEmpty())

			{
				TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.defaultchild", String.valueOf
						(pcod_homepage.getlblselectedchildparenthomepage().getText()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.parent_clicks_on_ReviewCart_if_cart_has_items_and_delete();
	}
	
	public void parent_login2(WebElement UserName, String username, String password) {
		System.out.println("username is : "+username);
		
		System.out.println("password is : "+password);
		PauseUtil.pause(1500);
		WaitUtils.waitForEnabled(UserName);
		getTxtUsername().clear();
		getTxtUsername().sendKeys(username);
		PauseUtil.pause(1000);
		getTxtPassword().clear();
		getTxtPassword().sendKeys(password);
		PauseUtil.pause(1000);
		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(getbtnlogin(), 30));
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.closeButton_in_LoginPage();

		if (log_page.sizeiconCloseHomePageProd().size() != 0) {
			log_page.geticonCloseHomePageProd().click();
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(10000);

		}
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.user_do_the_empty_cart();

		try {
			if (!pcod_homepage.getlblselectedchildparenthomepage().getText().equals(null) ||
					pcod_homepage.getlblselectedchildparenthomepage().getText().isEmpty())

			{
				TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.defaultchild", String.valueOf
						(pcod_homepage.getlblselectedchildparenthomepage().getText()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

//##########################################################################################################################
//#####################################	COMMON METHODS USED	################################################################
//##########################################################################################################################


	public void pcod_click_element(WebElement element) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		SCHUtils.waitForElementToBeClickable(element, 30);
		SCHUtils.clickUsingJavaScript(element);
		PauseUtil.pause(1500);
	}


	public void pcod_tabout_presentfield(WebElement element) {
		PauseUtil.pause(1500);
		element.sendKeys(Keys.TAB);
		PauseUtil.pause(1500);
	}

	public void pcod_entervalue_textfield(WebElement element, String value) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		element.clear();
		element.sendKeys(value);
		PauseUtil.pause(1500);
	}

	@Override
	public void verify_value_entered_issaved(WebElement element, String value, String fieldname) {
		//SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String actual_lastname = element.getAttribute("value");
		String exp_lastname = value;
		if (!actual_lastname.equals(exp_lastname)) {
			Assert.fail("Text entered in " + fieldname + " is not saved in Create Account window");
		}
	}

	@Override
	public void verify_field_incorrect_highlighted(WebElement element) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String empty_email = element.getAttribute("aria-invalid");
		String empty_emailerror = element.getAttribute("class");
		System.out.println("Last name field area is:" + empty_email);
		System.out.println("Last name error field area is:" + empty_emailerror);
		if ((!empty_email.equals("true")) || (!empty_emailerror.contains("tooltipstered"))) {
			Assert.fail("Last name field is not highlighted in yellow are not in red border in Add a Child window");
		}
	}


	@Override
	public void verify_username_incorrect_highlighted(WebElement element) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String empty_emailerror = element.getAttribute("class");
		System.out.println("UserName name error field area is:" + empty_emailerror);
		if ((!empty_emailerror.contains("tooltipstered")) && (!empty_emailerror.contains("form-error-input"))) {
			Assert.fail("UserName field is not highlighted in yellow");
		}
	}


	@Override
	public void verify_password_incorrect_highlighted(WebElement element) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String empty_emailerror = element.getAttribute("class");
		System.out.println("password error field area is:" + empty_emailerror);
		if ((!empty_emailerror.contains("tooltipstered")) && (!empty_emailerror.contains("form-error-input"))) {
			Assert.fail("Password field is not highlighted in yellow ");
		}
	}


	@Override
	public void verify_value_entered_NotHighlighted(WebElement element,
													List<WebElement> element1, String value) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String empty_lastname = element.getAttribute("aria-invalid");
		System.out.println("First name field area is:" + empty_lastname);
		if (empty_lastname.equals("true")) {
			Assert.fail("" + value + " should not be highlighted in yellow with red border in Create Account window");
		}
		Assert.assertEquals(element1.size() > 0, false);

	}


	@Override
	public void pcod_gettext_equals(WebElement element, String value, String fieldname) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String actual_text = element.getText();
		String exp_text = value;
		System.out.println("actual value is : "+actual_text);
		System.out.println("expected value is : "+exp_text);
		Assert.assertEquals(actual_text, exp_text, "" + fieldname + " value is incorrect");

	}

	@Override
	public void pcod_getvalue_equals(WebElement element, String value, String fieldname) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String actual_text = element.getAttribute("value");
		String exp_text = value;
		System.out.println("CAC is :" + element.getAttribute("value"));
		Assert.assertEquals(actual_text, exp_text, "" + fieldname + " value is incorrect");
	}


	@Override
	public void pcod_getplaceholder_equals(WebElement element, String value, String fieldname) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String actual_text = element.getAttribute("placeholder");
		String exp_text = value;
		System.out.println("CAC is :" + element.getAttribute("value"));
		Assert.assertEquals(actual_text, exp_text, "" + fieldname + " placeholder is incorrect");
	}

	@Override
	public void pcod_get_options_contains(WebElement element, String exp_values[]) {
		String actual_values = element.getText();
		System.out.println("values are :" + actual_values);
		for (int i = 0; i < exp_values.length; i++) {
			if (!actual_values.contains(exp_values[i])) {
				Assert.fail("Application Issue." + exp_values[i] + "is not present in province list");
			}
		}
	}


	@Override
	public void pcod_get_text_notcontains(WebElement element, String value) {
		String actual_values = element.getText();
		System.out.println("values are :" + actual_values);

		if (actual_values.contains(value)) {
			Assert.fail("Application Issue." + value + " should not be present");
		}
	}

	@Override
	public void pcod_get_text_contains(WebElement element, String value) {
		String actual_values = element.getText();

		System.out.println("actual values are : " + actual_values);
		System.out.println("expected values are : "+value);

		if (!actual_values.contains(value)) {
			Assert.fail("Application Issue." + value + " is not present");
		}
	}


	@Override
	public void pcod_get_text_itemprice_contains(WebElement element, String value) {
		String actual_values1 = element.getText();
		System.out.println("values are :" + actual_values1);

		String actual_values = actual_values1.substring(1);
		if (!actual_values.contains(value)) {
			Assert.fail("Application Issue." + value + " is not present");
		}
	}


	public void verify_validationmessage(WebElement element, String errormsg) {
		System.out.println("error message" + element.getText());
		AssertUtils.assertTextMatches(element, Matchers.containsString(errormsg));
	}


	public void verify_element_displayed(WebElement element) {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		AssertUtils.assertDisplayed(element);
	}

	public void verify_element_notdisplayed(WebElement element, List<WebElement> element1) {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		try {
			if (element1.size() != 0) {
				AssertUtils.assertNotDisplayed(element);
			}
		} catch (Exception e) {
			Assert.fail(element1 + "is not present");
		}

	}


	public void verify_element_enabled(WebElement webElement) {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		System.out.println("cancel button is enabled : "+webElement.isEnabled());
		Assert.assertTrue(webElement.isEnabled());
	}
	
	
	public void verify_Reading_Level_Window_Is_Closed(WebElement webElement) {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		Assert.assertEquals(webElement.isDisplayed(), false);
	}
	

	public void verify_element_disabled(WebElement element) {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		System.out.println("save button disabled -  : "+element.isEnabled());
		Assert.assertTrue(!element.isEnabled());
	}


	@Override
	public void verify_text_size(WebElement element, String value, String expvalue) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String actual_size = element.getAttribute("value");
		int act_textsize = actual_size.length();
		System.out.println("actual size is: " + act_textsize);
		String exp_txtsize1 = value;
		int exp_txtsize = exp_txtsize1.length();
		System.out.println("value from xml is:" + exp_txtsize);
		if (act_textsize > exp_txtsize) {
			Assert.fail("Able to enter " + expvalue + " value more than expected");
		}
	}

	public void click_enter(WebElement element) {
		element.sendKeys(Keys.ENTER);

	}

	@Override
	public void verify_element_is_enabled(List<WebElement> element) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		Assert.assertEquals(element.size() > 0, true);
	}


	@Override
	public void parent_delete_freepick_coupon_shoppingcart() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		if (pcod_reviewpage.sizebtnremovefreepickcouponreviewcart().size() != 0) {
			do {
				pcod_reviewpage.getbtnremovefreepickcouponreviewcart().click();
				try {
					pcod_reviewpage.getbtnremovefreepickcouponreviewcart().isDisplayed();
				} catch (Exception e) {
					System.out.println("Remove FreePick button is empty");
					break;
				}
			}
			while (pcod_reviewpage.getbtnremovefreepickcouponreviewcart().isDisplayed());
		}
	}


	@Override
	public void verify_requiredfield_missed_highlighted(WebElement element, String value) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String empty_email = element.getAttribute("aria-invalid");
		String empty_emailerror = element.getAttribute("class");
		System.out.println("Last name field area is:" + empty_email);
		System.out.println("Last name error field area is:" + empty_emailerror);
		if ((!empty_email.equals("true")) || (!empty_emailerror.contains("error"))) {
			Assert.fail(value + "is not highlighted in yellow and not in red border");
		}
	}

	@Override
	public void pcod_enteralldata_createaccount_withCAC(String firstname, String lastname, String email, String password, String mobnumber, String CAC) {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtcreateaccountfirstname().clear();
		gettxtcreateaccountfirstname().sendKeys(firstname);
		PauseUtil.pause(1000);
		gettxtcreateaccountlastname().clear();
		gettxtcreateaccountlastname().sendKeys(lastname);
		PauseUtil.pause(1000);
		gettxtcreateaccountemail().clear();
		gettxtcreateaccountemail().sendKeys(email);
		PauseUtil.pause(1000);
		gettxtcreateaccountpassword().clear();
		gettxtcreateaccountpassword().sendKeys(password);
		PauseUtil.pause(1000);
		gettxtcreateaccountmobile().clear();
		gettxtcreateaccountmobile().sendKeys(mobnumber);
		PauseUtil.pause(2500);
		getchkboxcreateaccountlngeng().click();
		PauseUtil.pause(1000);
		getchkboxcreateaccounttermsofuse().click();
		PauseUtil.pause(1000);
		getchkboxcreateaccountprivacypolicy().click();
		PauseUtil.pause(1000);

	}

	@Override
	public void pcod_enteralldata_createaccount_withFAT(String firstname, String lastname, String zipcode) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtaddachildfirstname().clear();
		gettxtaddachildfirstname().sendKeys(firstname);
		PauseUtil.pause(1000);
		gettxtaddachildlastname().clear();
		gettxtaddachildlastname().sendKeys(lastname);
		PauseUtil.pause(1000);
		clickFATLink_addyourChild(TestBaseProvider.getTestBase().getTestData().getString("ZIP"));
	}

	@Override
	public void clickFATLink_addyourChild(String zip) {
		getlinkAddchildFindyourTeacher().click();
		SCHUtils.isPresent(getinputboxzipcodefatmodal());
		getinputboxzipcodefatmodal().sendKeys(zip);
		getclick_addchild_fatModal_search().click();
		PauseUtil.pause(1000);
		SCHUtils.isPresent(getConnectTeacherFatFlow());
		//String data = "Amalgamated Academy";
		String data = TestBaseProvider.getTestBase().getTestData().getString("SchoolName");
		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		Select sel = new Select(driver.findElement(By.name("dwfrm_parentsearch_schoolvalue")));
		sel.selectByVisibleText(data);

		//driver.findElement(By.xpath("(//span[contains(text()='" + data + "')])[4]")).click();
		PauseUtil.pause(1000);
		getFatflowConnectTeacherButtonNext().click();
		SCHUtils.selectOptionByIndex(getTeacherName_FATflowAddchild(), 1);
		PauseUtil.pause(1000);
		getFatflowConnectTeacherButtonNext().click();
		SCHUtils.selectOptionByvalue(getdrpdownaddachildgrade(), (ConstantUtils.CHILDGRADE1));
		PauseUtil.pause(1000);
		pcod_homepage.getbtnsaveaddachildhomepage().click();


	}

	@Override
	public void clickFATLink_connectToTeacher(String zip) {
		getlinkAddchildFindyourTeacher().click();
		SCHUtils.isPresent(getinputboxzipcodefatmodal());
		System.out.println("Testing value of String zip"+zip);
		getinputboxzipcodefatmodal().sendKeys(zip);
		getclick_addchild_fatModal_search().click();
		PauseUtil.pause(4500);
		SCHUtils.isPresent(getConnectTeacherFatFlow());

		//String data = "Amalgamated Academy";
		String data = TestBaseProvider.getTestBase().getTestData().getString("SchoolName");
		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		/*
		Select sel = new Select(driver.findElement(By.id("dwfrm_parentdwfrmsearch_schoolvalue")));
		sel.selectByVisibleText(data);
		 */

		//driver.findElement(By.xpath("//*[@id='scrollbar-7']/ul/li")).click();
		driver.findElement(By.xpath("(//span[contains(text(), '" + data + "')])[1]")).click();

		//driver.findElement(By.xpath("//*[@id='scrollbar-7']/ul/li")).click();
		//driver.findElement(By.xpath("(//span[contains(text()='" + data + "')])[4]")).click();
		//SCHUtils.clickUsingJavaScript(getfatmodalschoolnameSelect());
		//getfatmodalschoolnameSelect().click();

		PauseUtil.pause(4500);
		SCHUtils.waitForElementToBeClickable(getFatflowConnectTeacherButtonNext(),5000);
		getFatflowConnectTeacherButtonNext().click();
		PauseUtil.pause(2000);
		SCHUtils.selectOptionByIndex(getTeacherName_FATflowAddchild(), 1);
		PauseUtil.pause(1000);
		getFatflowConnectTeacherButtonNext().click();
		SCHUtils.selectOptionByvalue(getdrpdownaddachildgrade(), (ConstantUtils.CHILDGRADE1));
		PauseUtil.pause(1000);
		//getbuttonAddchildSave().click();

	}
	
	@FindBy(locator = "dw.pcod.login.connecttoteacher.FAT.button")
	private WebElement login_connecttoteacher_FAT_btn;
	
	@FindBy(locator = "dw.pcod.login.connecttoteacher.createanaccount.button")
	private WebElement login_connecttoteacher_createaccount_btn;

	public WebElement getLoginConnectToTeacherFATBtn() {
		return login_connecttoteacher_FAT_btn;
	}
	
	public WebElement getLoginConnectToTeacherCreateAccountBtn() {
		return login_connecttoteacher_createaccount_btn;
	}
	
	@Override
	public void FAT_connectToTeacher_LoginPage(String postalcode, String schoolName, String teacherAccNum) {
		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		
		getLoginConnectToTeacherFATBtn().click();
		
		SCHUtils.isPresent(getinputboxzipcodefatmodal());
		System.out.println("Postal Code:" + postalcode);
		getinputboxzipcodefatmodal().sendKeys(postalcode);
		getclick_addchild_fatModal_search().click();
		
		PauseUtil.pause(1000);
		SCHUtils.isPresent(getConnectTeacherFatFlow());

		
		SCHUtils.clickUsingJavaScript(driver.findElement(By.xpath("(//span[contains(text(), \"" + schoolName + "\")])[1]")));
		PauseUtil.pause(1000);
		SCHUtils.waitForElementToBeClickable(getFatflowConnectTeacherButtonNext(),5000);
		
		getFatflowConnectTeacherButtonNext().click();
		PauseUtil.pause(2000);
		SCHUtils.selectOptionByvalue(getTeacherName_FATflowAddchild(), teacherAccNum);
		
		SCHUtils.waitForElementToBeClickable(getFatflowConnectTeacherButtonNext(),5000);
		PauseUtil.pause(1000);
		getFatflowConnectTeacherButtonNext().click();
		
		PauseUtil.pause(1000);
		getLoginConnectToTeacherCreateAccountBtn().click();
	}
	
	@Override
	public void clickFATLink_connectToTeacher_specificTeacher(String zip, String teacherAccNum) {
		getlinkAddchildFindyourTeacher().click();
		SCHUtils.isPresent(getinputboxzipcodefatmodal());
		System.out.println("Testing value of String zip"+zip);
		getinputboxzipcodefatmodal().sendKeys(zip);
		getclick_addchild_fatModal_search().click();
		PauseUtil.pause(1000);
		SCHUtils.isPresent(getConnectTeacherFatFlow());

		//String data = "Amalgamated Academy";
		String data = TestBaseProvider.getTestBase().getTestData().getString("SchoolName");
		WebDriver driver = TestBaseProvider.getTestBase().getDriver();

		driver.findElement(By.xpath("(//span[contains(text(), '" + data + "')])[1]")).click();
		
		PauseUtil.pause(1000);
		SCHUtils.waitForElementToBeClickable(getFatflowConnectTeacherButtonNext(),5000);
		getFatflowConnectTeacherButtonNext().click();
		PauseUtil.pause(2000);
		
		SCHUtils.selectOptionByvalue(getTeacherName_FATflowAddchild(), teacherAccNum);
		PauseUtil.pause(1000);
		
		getFatflowConnectTeacherButtonNext().click();
		SCHUtils.selectOptionByvalue(getdrpdownaddachildgrade(), (ConstantUtils.CHILDGRADE1));
		PauseUtil.pause(1000);
		//getbuttonAddchildSave().click();

	}
	
	@Override
	public void verify_currentpage_URL(String url) {
		String parentHandle = getDriver().getWindowHandle();
		PauseUtil.pause(8000);
		for (String winHandle : getDriver().getWindowHandles()) {
			System.out.println(winHandle);
			getDriver().switchTo().window(winHandle);
		}
		System.out.println("current url:" + getDriver().getCurrentUrl());
		Assert.assertTrue(getDriver().getCurrentUrl().contains(url));
		getDriver().switchTo().window(parentHandle);

	}

	@Override
	public void TCOD_enter_data_login_info_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtcreateaccountfirstname().clear();
		gettxtcreateaccountfirstname().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("firstname"));
		PauseUtil.pause(1000);
		gettxtcreateaccountlastname().clear();
		gettxtcreateaccountlastname().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("lastname"));
		PauseUtil.pause(1000);
		gettxtcreateaccountemail().clear();
		gettxtcreateaccountemail().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("AcNumOrEmail"));

	}

	@Override
	public void TCOD_enter_AcNumOrEmail_in_login_info_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtcreateaccountemail().click();
		gettxtcreateaccountemail().clear();
		gettxtcreateaccountemail().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("AcNumOrEmail"));
		gettxtcreateaccountemail().sendKeys(Keys.TAB);
	}

	@Override
	public void TCOD_enter_Lname_in_login_info_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtcreateaccountlastname().click();
		gettxtcreateaccountlastname().clear();
		gettxtcreateaccountlastname().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("lastname"));

	}

	@Override
	public void TCOD_enter_Fname_in_login_info_window() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1500);
		gettxtcreateaccountfirstname().click();
		gettxtcreateaccountfirstname().clear();
		gettxtcreateaccountfirstname().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("firstname"));

	}

	public Boolean pcod_check_cart_is_empty() {
		String catTotalstr = getCartQuantity().getText().trim();
		System.out.println("catTotalstr" + catTotalstr);
		int cartTotal = Integer.parseInt(catTotalstr);
		System.out.println(cartTotal);

		if (cartTotal == 0) {
			return true;
		} else {
			return false;
		}

	}


	@Override
	public void verify_field_size(WebElement element, String value, String expvalue) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		String actual_size = element.getAttribute("value");
		int act_textsize = actual_size.length();
		System.out.println("actual size is: " + act_textsize);
		String exp_txtsize1 = value;
		int exp_txtsize = Integer.parseInt(exp_txtsize1);
		System.out.println("value from xml is:" + exp_txtsize);
		if (act_textsize > exp_txtsize) {
			Assert.fail("Able to enter " + expvalue + " value more than expected");
		}
	}

	@Override
	public void parent_create_account_one_child() {
		//WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		//Pcod_ExcelLibrary objExcelFile = new Pcod_ExcelLibrary();
		//TCOD_ExcelLibrary tcodExcel = new TCOD_ExcelLibrary();
		PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
		//int numTeachers = TestBaseProvider.getTestBase().getTestData().getInt("numTeachers");
		int idx = TestBaseProvider.getTestBase().getTestData().getInt("teacherAssociation");
		
		PauseUtil.pause(5000);
		//for (int i = 1; i <= numTeachers; i++) {

			try {
				Thread.sleep(2000);

//				String teacherAccNum = tcodExcel.getExcelData("teacherInfo", i, 0);
//				String firstname = tcodExcel.getExcelData("teacherInfo", i, 1);
//				String lastname = tcodExcel.getExcelData("teacherInfo", i, 2);
//				String teacherName = (lastname + "," + firstname);
//				
//				String schoolName = tcodExcel.getExcelData("teacherInfo", i, 3);
//				String schoolProvince = tcodExcel.getExcelData("teacherInfo", i, 4);
//				String postalcode = tcodExcel.getExcelData("teacherInfo", i, 5);
				
				String teacherAccNum = TestBaseProvider.getTestBase().getContext().getString("teacherAccount"+idx);
				String firstname = TestBaseProvider.getTestBase().getContext().getString("teacherFirstName"+idx);
				String lastname = TestBaseProvider.getTestBase().getContext().getString("teacherLastName"+idx);
				
				String schoolName = TestBaseProvider.getTestBase().getContext().getString("schoolName"+idx);
				String schoolAddress = TestBaseProvider.getTestBase().getContext().getString("schoolAddress"+idx);
				String schoolCity = TestBaseProvider.getTestBase().getContext().getString("schoolCity"+idx);
				String schoolProvince = TestBaseProvider.getTestBase().getContext().getString("schoolProvince"+idx);
				String postalcode = TestBaseProvider.getTestBase().getContext().getString("postalCode"+idx);
				
				Date date = new Date();
				String randomVal = String.valueOf(date.getTime());
				
				//PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
				login.pcod_connect_to_your_teacher();
				
				PauseUtil.pause(2000);
				
				
				
				/*login.enterCACtNumber(TestBaseProvider.getTestBase().getTestData().getString("cac_no"));
				PauseUtil.pause(2000);
				loginPg.click_connectbtn_connecttoteacher();
				PauseUtil.pause(2000);
				loginPg.click_createanaccount_connecttoteacher();*/
				login.FAT_connectToTeacher_LoginPage(postalcode, schoolName, teacherAccNum);
				PauseUtil.pause(2000);
				
				login.pcod_enteralldata_createaccount(
						TestBaseProvider.getTestBase().getTestData().getString("firstname") + randomVal,
						TestBaseProvider.getTestBase().getTestData().getString("lastname") + randomVal,
						TestBaseProvider.getTestBase().getTestData().getString("email") + randomVal + "@abc.com",
						TestBaseProvider.getTestBase().getTestData().getString("password"),
						TestBaseProvider.getTestBase().getTestData().getString("mobnumber"));
				PauseUtil.pause(4000);
				login.click_continuebtn_createaccount();
				PauseUtil.pause(3000);
				if (sizebtnaddachildadd().size() == 0) {
					for (int j = 1; j <= 3; j++) {
						if (sizebtnaddachildadd().size() == 0) {
							login.click_continuebtn_createaccount();
							PauseUtil.pause(2000);
						}
					}
				}

				login.pcod_enteralldata_addachild(
						TestBaseProvider.getTestBase().getTestData().getString("child_firstname") + randomVal,
						TestBaseProvider.getTestBase().getTestData().getString("child_lastname") + randomVal);
				PauseUtil.pause(2000);
				pcod_click_element(getbtnaddachildadd());
				PauseUtil.pause(2000);
				getbtngetstarted().click();
				PauseUtil.pause(4000);
				String parentfirstname = TestBaseProvider.getTestBase().getTestData().getString("firstname") + randomVal;
				String parentlastname = TestBaseProvider.getTestBase().getTestData().getString("lastname") + randomVal;
				String parentemail = TestBaseProvider.getTestBase().getTestData().getString("email") + randomVal + "@abc.com";
				String parentpassword = TestBaseProvider.getTestBase().getTestData().getString("password");
				String parentnumber = TestBaseProvider.getTestBase().getTestData().getString("mobnumber");
				String childfirstname = TestBaseProvider.getTestBase().getTestData().getString("child_firstname") + randomVal;
				String childlastname = TestBaseProvider.getTestBase().getTestData().getString("child_lastname") + randomVal;
				//String cacno = TestBaseProvider.getTestBase().getTestData().getString("cac_no");
				
				String[] valueToWrite = {parentfirstname, parentlastname, parentemail, parentpassword, parentnumber, childfirstname, childlastname, teacherAccNum, firstname, lastname, schoolName, schoolAddress, schoolCity, schoolProvince, postalcode, "no", "no"};
				//Create an object of current class
				
				
				//Write the file using file name, sheet name and the data to be filled
				String sep = File.separator;
				String excelDirectory = System.getProperty("user.dir") + sep + "src" + sep + "ExcelFile";
				Pcod_ExcelLibrary.writeExcel(excelDirectory, "pcod.xlsx", "Parent1child", valueToWrite);
				PauseUtil.pause(5000);
				pcod_homepage.pcod_logout();
			} catch (Exception e) {
				//driver.get("https://dev35-rco-scholastic.demandware.net/s/rco-ca/en/home");
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		//}
	}

	
	@Override
	public void parent_create_account_two_childs() {
		//WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		//Pcod_ExcelLibrary objExcelFile = new Pcod_ExcelLibrary();
		PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
		int idx = TestBaseProvider.getTestBase().getTestData().getInt("teacherAssociation");
		
		PauseUtil.pause(5000);
		

		try {
			Thread.sleep(2000);
			
			String teacherAccNum = TestBaseProvider.getTestBase().getContext().getString("teacherAccount"+idx);
			String firstname = TestBaseProvider.getTestBase().getContext().getString("teacherFirstName"+idx);
			String lastname = TestBaseProvider.getTestBase().getContext().getString("teacherLastName"+idx);
			
			String schoolName = TestBaseProvider.getTestBase().getContext().getString("schoolName"+idx);
			String schoolAddress = TestBaseProvider.getTestBase().getContext().getString("schoolAddress"+idx);
			String schoolCity = TestBaseProvider.getTestBase().getContext().getString("schoolCity"+idx);
			String schoolProvince = TestBaseProvider.getTestBase().getContext().getString("schoolProvince"+idx);
			String postalcode = TestBaseProvider.getTestBase().getContext().getString("postalCode"+idx);
			
			Date date = new Date();
			String randomVal = String.valueOf(date.getTime());
			
			login.pcod_connect_to_your_teacher();
			PauseUtil.pause(2000);
			
			login.FAT_connectToTeacher_LoginPage(postalcode, schoolName, teacherAccNum);
			PauseUtil.pause(2000);
			
			login.pcod_enteralldata_createaccount(
					TestBaseProvider.getTestBase().getTestData().getString("firstname") + randomVal,
					TestBaseProvider.getTestBase().getTestData().getString("lastname") + randomVal,
					TestBaseProvider.getTestBase().getTestData().getString("email") + randomVal + "@abc.com",
					TestBaseProvider.getTestBase().getTestData().getString("password"),
					TestBaseProvider.getTestBase().getTestData().getString("mobnumber"));
			
			PauseUtil.pause(4000);
			login.click_continuebtn_createaccount();
			PauseUtil.pause(3000);
			if (sizebtnaddachildadd().size() == 0) {
				for (int j = 1; j <= 3; j++) {
					if (sizebtnaddachildadd().size() == 0) {
						login.click_continuebtn_createaccount();
						PauseUtil.pause(2000);
					}
				}
			}

			login.pcod_enteralldata_addachild(
					TestBaseProvider.getTestBase().getTestData().getString("child_firstname") + randomVal,
					TestBaseProvider.getTestBase().getTestData().getString("child_lastname") + randomVal);
			PauseUtil.pause(2000);
			pcod_click_element(getbtnaddachildadd());
			PauseUtil.pause(2000);
			
			//adding 2nd child
			pcod_enteralldata_addsecondchild(
					TestBaseProvider.getTestBase().getTestData().getString("child2_firstname") + randomVal,
					TestBaseProvider.getTestBase().getTestData().getString("child2_lastname") + randomVal,
					postalcode, schoolName, teacherAccNum);
			
			PauseUtil.pause(4000);
			String parentfirstname = TestBaseProvider.getTestBase().getTestData().getString("firstname") + randomVal;
			String parentlastname = TestBaseProvider.getTestBase().getTestData().getString("lastname") + randomVal;
			String parentemail = TestBaseProvider.getTestBase().getTestData().getString("email") + randomVal + "@abc.com";
			String parentpassword = TestBaseProvider.getTestBase().getTestData().getString("password");
			String parentnumber = TestBaseProvider.getTestBase().getTestData().getString("mobnumber");
			String childfirstname = TestBaseProvider.getTestBase().getTestData().getString("child_firstname") + randomVal;
			String childlastname = TestBaseProvider.getTestBase().getTestData().getString("child_lastname") + randomVal;
			String child2firstname = TestBaseProvider.getTestBase().getTestData().getString("child2_firstname") + randomVal;
			String child2lastname = TestBaseProvider.getTestBase().getTestData().getString("child2_lastname") + randomVal;
			
			List <String> arr = new ArrayList<String>();
			arr.add(parentfirstname);
			arr.add(parentlastname);
			arr.add(parentemail);
			arr.add(parentpassword);
			arr.add(parentnumber);
			arr.add(childfirstname);
			arr.add(childlastname);
			arr.add(child2firstname);
			arr.add(child2lastname);
			arr.add(teacherAccNum);
			arr.add(firstname);arr.add(lastname);
			arr.add(schoolName);arr.add(schoolAddress);arr.add(schoolCity);arr.add(schoolProvince);arr.add(postalcode);
			arr.add("no");arr.add("no");
			
			String[] valueToWrite = arr.toArray(new String[arr.size()]);
			
			//Write the file using file name, sheet name and the data to be filled
			String sep = File.separator;
			String excelDirectory = System.getProperty("user.dir") + sep + "src" + sep + "ExcelFile";
			Pcod_ExcelLibrary.writeExcel(excelDirectory, "pcod.xlsx", "Parent2childs", valueToWrite);
			PauseUtil.pause(5000);
			pcod_homepage.pcod_logout();
		} catch (Exception e) {
			//driver.get("https://dev35-rco-scholastic.demandware.net/s/rco-ca/en/home");
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	public void parent_create_account_two_childs_two_teachers() {
		//WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		//Pcod_ExcelLibrary objExcelFile = new Pcod_ExcelLibrary();
		PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
		int idx1 = TestBaseProvider.getTestBase().getTestData().getInt("teacherAssociation1");
		int idx2 = TestBaseProvider.getTestBase().getTestData().getInt("teacherAssociation2");
		String firstname1, lastname1, firstname2, lastname2;
		
		PauseUtil.pause(5000);
		
		try {
			Thread.sleep(2000);
			
			String teacherAccNum1 = TestBaseProvider.getTestBase().getContext().getString("teacherAccount"+idx1);
			firstname1 = TestBaseProvider.getTestBase().getContext().getString("teacherFirstName"+idx1);
			lastname1 = TestBaseProvider.getTestBase().getContext().getString("teacherLastName"+idx1);
			
			String schoolName1 = TestBaseProvider.getTestBase().getContext().getString("schoolName"+idx1);
			String schoolAddress1 = TestBaseProvider.getTestBase().getContext().getString("schoolAddress"+idx1);
			String schoolCity1 = TestBaseProvider.getTestBase().getContext().getString("schoolCity"+idx1);
			String schoolProvince1 = TestBaseProvider.getTestBase().getContext().getString("schoolProvince"+idx1);
			String postalcode1 = TestBaseProvider.getTestBase().getContext().getString("postalCode"+idx1);
			
			String teacherAccNum2 = TestBaseProvider.getTestBase().getContext().getString("teacherAccount"+idx2);
			firstname2 = TestBaseProvider.getTestBase().getContext().getString("teacherFirstName"+idx2);
			lastname2 = TestBaseProvider.getTestBase().getContext().getString("teacherLastName"+idx2);
			
			String schoolName2 = TestBaseProvider.getTestBase().getContext().getString("schoolName"+idx2);
			String schoolAddress2 = TestBaseProvider.getTestBase().getContext().getString("schoolAddress"+idx2);
			String schoolCity2 = TestBaseProvider.getTestBase().getContext().getString("schoolCity"+idx2);
			String schoolProvince2 = TestBaseProvider.getTestBase().getContext().getString("schoolProvince"+idx2);
			String postalcode2 = TestBaseProvider.getTestBase().getContext().getString("postalCode"+idx2);
			
			Date date = new Date();
			String randomVal = String.valueOf(date.getTime());
			
			login.pcod_connect_to_your_teacher();
			PauseUtil.pause(2000);
			
			login.FAT_connectToTeacher_LoginPage(postalcode1, schoolName1, teacherAccNum1);
			PauseUtil.pause(2000);
			
			login.pcod_enteralldata_createaccount(
					TestBaseProvider.getTestBase().getTestData().getString("firstname") + randomVal,
					TestBaseProvider.getTestBase().getTestData().getString("lastname") + randomVal,
					TestBaseProvider.getTestBase().getTestData().getString("email") + randomVal + "@abc.com",
					TestBaseProvider.getTestBase().getTestData().getString("password"),
					TestBaseProvider.getTestBase().getTestData().getString("mobnumber"));
			
			PauseUtil.pause(4000);
			login.click_continuebtn_createaccount();
			PauseUtil.pause(3000);
			if (sizebtnaddachildadd().size() == 0) {
				for (int j = 1; j <= 3; j++) {
					if (sizebtnaddachildadd().size() == 0) {
						login.click_continuebtn_createaccount();
						PauseUtil.pause(2000);
					}
				}
			}

			login.pcod_enteralldata_addachild(
					TestBaseProvider.getTestBase().getTestData().getString("child_firstname") + randomVal,
					TestBaseProvider.getTestBase().getTestData().getString("child_lastname") + randomVal);
			PauseUtil.pause(2000);
			pcod_click_element(getbtnaddachildadd());
			PauseUtil.pause(2000);
			
			//adding 2nd child
			pcod_enteralldata_addsecondchild(
					TestBaseProvider.getTestBase().getTestData().getString("child2_firstname") + randomVal,
					TestBaseProvider.getTestBase().getTestData().getString("child2_lastname") + randomVal,
					postalcode2, schoolName2, teacherAccNum2);
			
			PauseUtil.pause(4000);
			String parentfirstname = TestBaseProvider.getTestBase().getTestData().getString("firstname") + randomVal;
			String parentlastname = TestBaseProvider.getTestBase().getTestData().getString("lastname") + randomVal;
			String parentemail = TestBaseProvider.getTestBase().getTestData().getString("email") + randomVal + "@abc.com";
			String parentpassword = TestBaseProvider.getTestBase().getTestData().getString("password");
			String parentnumber = TestBaseProvider.getTestBase().getTestData().getString("mobnumber");
			String childfirstname = TestBaseProvider.getTestBase().getTestData().getString("child_firstname") + randomVal;
			String childlastname = TestBaseProvider.getTestBase().getTestData().getString("child_lastname") + randomVal;
			String child2firstname = TestBaseProvider.getTestBase().getTestData().getString("child2_firstname") + randomVal;
			String child2lastname = TestBaseProvider.getTestBase().getTestData().getString("child2_lastname") + randomVal;
			
			List <String> arr = new ArrayList<String>();
			arr.add(parentfirstname);
			arr.add(parentlastname);
			arr.add(parentemail);
			arr.add(parentpassword);
			arr.add(parentnumber);
			arr.add(childfirstname);
			arr.add(childlastname);
			arr.add(child2firstname);
			arr.add(child2lastname);
			arr.add(teacherAccNum1);
			arr.add(firstname1);arr.add(lastname1);
			arr.add(schoolName1);arr.add(schoolAddress1);arr.add(schoolCity1);arr.add(schoolProvince1);arr.add(postalcode1);
			arr.add(teacherAccNum2);
			arr.add(firstname2);arr.add(lastname2);
			arr.add(schoolName2);arr.add(schoolAddress2);arr.add(schoolCity2);arr.add(schoolProvince2);arr.add(postalcode2);
			arr.add("no");arr.add("no");
			
			String[] valueToWrite = arr.toArray(new String[arr.size()]);
			
			//Write the file using file name, sheet name and the data to be filled
			String sep = File.separator;
			String excelDirectory = System.getProperty("user.dir") + sep + "src" + sep + "ExcelFile";
			Pcod_ExcelLibrary.writeExcel(excelDirectory, "pcod.xlsx", "Parent2childs2teachers", valueToWrite);
			PauseUtil.pause(5000);
			pcod_homepage.pcod_logout();
		} catch (Exception e) {
			//driver.get("https://dev35-rco-scholastic.demandware.net/s/rco-ca/en/home");
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	
	@Override
	public void specific_parent_create_account_one_child(int val) {
		//WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		//Pcod_ExcelLibrary objExcelFile = new Pcod_ExcelLibrary();
		PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
		int idx = TestBaseProvider.getTestBase().getTestData().getInt("teacherAssociation");
		
		PauseUtil.pause(5000);

			try {
				Thread.sleep(2000);
				
				String teacherAccNum = TestBaseProvider.getTestBase().getContext().getString("teacherAccount"+idx);
				String firstname = TestBaseProvider.getTestBase().getContext().getString("teacherFirstName"+idx);
				String lastname = TestBaseProvider.getTestBase().getContext().getString("teacherLastName"+idx);

				String schoolName = TestBaseProvider.getTestBase().getContext().getString("schoolName"+idx);
				String schoolAddress = TestBaseProvider.getTestBase().getContext().getString("schoolAddress"+idx);
				String schoolCity = TestBaseProvider.getTestBase().getContext().getString("schoolCity"+idx);
				String schoolProvince = TestBaseProvider.getTestBase().getContext().getString("schoolProvince"+idx);
				String postalcode = TestBaseProvider.getTestBase().getContext().getString("postalCode"+idx);
				
				Date date = new Date();
				String randomVal = String.valueOf(date.getTime());
				
				login.pcod_connect_to_your_teacher();
				
				PauseUtil.pause(2000);

				login.FAT_connectToTeacher_LoginPage(postalcode, schoolName, teacherAccNum);
				PauseUtil.pause(2000);
				
				login.pcod_enteralldata_createaccount(
						TestBaseProvider.getTestBase().getTestData().getString("firstname") + randomVal,
						TestBaseProvider.getTestBase().getTestData().getString("lastname") + randomVal,
						TestBaseProvider.getTestBase().getTestData().getString("email") + randomVal + "@abc.com",
						TestBaseProvider.getTestBase().getTestData().getString("password"),
						TestBaseProvider.getTestBase().getTestData().getString("mobnumber"));
				PauseUtil.pause(4000);
				login.click_continuebtn_createaccount();
				PauseUtil.pause(3000);
				if (sizebtnaddachildadd().size() == 0) {
					for (int j = 1; j <= 3; j++) {
						if (sizebtnaddachildadd().size() == 0) {
							login.click_continuebtn_createaccount();
							PauseUtil.pause(2000);
						}
					}
				}

				login.pcod_enteralldata_addachild(
						TestBaseProvider.getTestBase().getTestData().getString("child_firstname") + randomVal,
						TestBaseProvider.getTestBase().getTestData().getString("child_lastname") + randomVal);
				PauseUtil.pause(2000);
				pcod_click_element(getbtnaddachildadd());
				PauseUtil.pause(2000);
				getbtngetstarted().click();
				PauseUtil.pause(4000);
				String parentfirstname = TestBaseProvider.getTestBase().getTestData().getString("firstname") + randomVal;
				String parentlastname = TestBaseProvider.getTestBase().getTestData().getString("lastname") + randomVal;
				String parentemail = TestBaseProvider.getTestBase().getTestData().getString("email") + randomVal + "@abc.com";
				String parentpassword = TestBaseProvider.getTestBase().getTestData().getString("password");
				String parentnumber = TestBaseProvider.getTestBase().getTestData().getString("mobnumber");
				String childfirstname = TestBaseProvider.getTestBase().getTestData().getString("child_firstname") + randomVal;
				String childlastname = TestBaseProvider.getTestBase().getTestData().getString("child_lastname") + randomVal;

				String[] valueToWrite = {String.valueOf(val), parentfirstname, parentlastname, parentemail, parentpassword, parentnumber, childfirstname, childlastname, teacherAccNum, firstname, lastname, schoolName, schoolAddress, schoolCity, schoolProvince, postalcode, "no", "no"};
				//Create an object of current class
				
				
				//Write the file using file name, sheet name and the data to be filled
				String sep = File.separator;
				String excelDirectory = System.getProperty("user.dir") + sep + "src" + sep + "ExcelFile";
				Pcod_ExcelLibrary.writeExcel(excelDirectory, "pcod.xlsx", "2Parents1child", valueToWrite);
				
				PauseUtil.pause(5000);
				pcod_homepage.pcod_logout();
			} catch (Exception e) {
				//driver.get("https://dev35-rco-scholastic.demandware.net/s/rco-ca/en/home");
				e.printStackTrace();
				Assert.fail(e.getMessage());
			}
		//}
	}
	
	@FindBy(locator="dw.pcod.search.noresults.section")
	private WebElement pcod_search_noresults_section;
	
	public WebElement getPCODSearchNoResultsSection(){
		return pcod_search_noresults_section;
	}
	
	public void pcod_no_results_page_displayed() {
		PauseUtil.pause(2500);
		try{
			getPCODSearchNoResultsSection().isDisplayed();
			System.out.print("No results section is displayed");
		
		} catch(Exception e){
			Assert.fail("No results section is not displayed");
		}
	}

	public void pcod_enter_school_and_teacher_info(String postalcode, String schoolName, String teacherAccNum) {
		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		
		getLoginConnectToTeacherFATBtn().click();
		
		SCHUtils.isPresent(getinputboxzipcodefatmodal());
		System.out.println("Postal Code:" + postalcode);
		getinputboxzipcodefatmodal().sendKeys(postalcode);
		getclick_addchild_fatModal_search().click();
		
		PauseUtil.pause(1000);
		SCHUtils.isPresent(getConnectTeacherFatFlow());

		
		SCHUtils.clickUsingJavaScript(driver.findElement(By.xpath("(//span[contains(text(), \"" + schoolName + "\")])[1]")));
		PauseUtil.pause(1000);
		SCHUtils.waitForElementToBeClickable(getFatflowConnectTeacherButtonNext(),5000);
		
		getFatflowConnectTeacherButtonNext().click();
		PauseUtil.pause(2000);
		SCHUtils.selectOptionByvalue(getTeacherName_FATflowAddchild(), teacherAccNum);
		
		SCHUtils.waitForElementToBeClickable(getFatflowConnectTeacherButtonNext(),5000);
		PauseUtil.pause(1000);
		getFatflowConnectTeacherButtonNext().click();
	}

	public void pcod_click_on_create_account_button() {
		PauseUtil.pause(2500);
		getLoginConnectToTeacherCreateAccountBtn().click();
	}

	public void pcod_parent_enters_information_CAT_modal(boolean uniqueDomain) {
		PauseUtil.pause(4000);
		Date date = new Date();
		String test_email = TestBaseProvider.getTestBase().getTestData().getString("email");
		String email = (uniqueDomain ? "auto_" + String.valueOf(date.getTime()) + test_email : test_email);
		
		pcod_enteralldata_createaccount(
				TestBaseProvider.getTestBase().getTestData().getString("firstname"),
				TestBaseProvider.getTestBase().getTestData().getString("lastname"),
				email,
				TestBaseProvider.getTestBase().getTestData().getString("password"),
				TestBaseProvider.getTestBase().getTestData().getString("mobnumber")
		);
	}

	public void pcod_parent_clicks_continue_CAT_modal() {
		PauseUtil.pause(4000);
		click_continuebtn_createaccount();
	}
	
	@FindBy(locator = "dw.pcod.login.connecttoteacher.email.already.used.error.msg")
	private WebElement pcod_email_already_exist_error_msg;
	
	@FindBy(locator = "dw.pcod.login.connecttoteacher.email.already.used.clickhere.link")
	private WebElement pcod_mail_already_exist_clickhere_link;
	
	@FindBy(locator = "dw.pcod.login.forgotpassword.modal")
	private WebElement pcod_forgotpassword_modal;
	
	@FindBy(locator = "dw.pcod.homepage")
	private WebElement pcod_homepage_main;

	public WebElement getPCODHomePage() {
		return pcod_homepage_main;
	}
	
	public WebElement getForgotPasswordModal() {
		return pcod_forgotpassword_modal;
	}
	
	public WebElement getEmailAlreadyExistErrorMsg() {
		return pcod_email_already_exist_error_msg;
	}
	
	public WebElement getEmailAlreadyExistClickHereLink() {
		return pcod_mail_already_exist_clickhere_link;
	}
	
	public void pcod_error_msg_teacher_email_displays() {
		PauseUtil.pause(2500);
		
		String exp_msg = ConstantUtils.EMAILALREADYEXISTMSG_ENG;
		String act_msg = getEmailAlreadyExistErrorMsg().getAttribute("innerText");
		
		Assert.assertEquals(act_msg, exp_msg, "The error messgae displayed is not correct");
	}

	public void pcod_click_teacher_email_click_here_link() {
		PauseUtil.pause(2500);
		
		getEmailAlreadyExistClickHereLink().click();
	}

	public void pcod_forgot_password_modal_displays() {
		PauseUtil.pause(2500);
		
		try{
			getForgotPasswordModal().isDisplayed();
			System.out.print("Forgot Password modal is displayed");
		} catch(Exception e){
			Assert.fail("Forgot Password modal is not displayed");
		}
	}

	public void pcod_parent_adds_one_child() {
		PauseUtil.pause(3000);
		if (sizebtnaddachildadd().size() == 0) {
			for (int j = 1; j <= 3; j++) {
				if (sizebtnaddachildadd().size() == 0) {
					click_continuebtn_createaccount();
					PauseUtil.pause(2000);
				}
			}
		}
		
		pcod_enteralldata_addachild(
				TestBaseProvider.getTestBase().getTestData().getString("child_firstname"),
				TestBaseProvider.getTestBase().getTestData().getString("child_lastname"));
		PauseUtil.pause(2000);
		pcod_click_element(getbtnaddachildadd());
		PauseUtil.pause(2000);
		SCHUtils.clickUsingJavaScript(getbtngetstarted());
	}

	public void pcod_homepage_is_displayed() {
		PauseUtil.pause(2500);
		
		try{
			getPCODHomePage().isDisplayed();
			System.out.print("PCOD Homepage is displayed");
		} catch(Exception e){
			Assert.fail("PCOD Homepage is not displayed");
		}
	}

	@Override
	public void about_reading_level_close_icon() {
		SCHUtils.clickUsingJavaScript(
				SCHUtils.waitForElementToBeClickable(aboutreadinglevelpopupcloseicon(), 30));
		
	}

			
	}
	
	
//@Override
//public void parent_create_account_two_childs() {
//	PCOD_ILoginPage login = getFactory().getPCOD_ILoginPage();
//	WebDriver driver = TestBaseProvider.getTestBase().getDriver();
//	Pcod_ExcelLibrary objExcelFile = new Pcod_ExcelLibrary();
//	TCOD_ExcelLibrary tcodExcel = new TCOD_ExcelLibrary();
//	int numTeachers = TestBaseProvider.getTestBase().getTestData().getInt("numTeachers");
//	
//	PauseUtil.pause(5000);
//	for (int i = 1; i <= 2; i++) {
//
//		try {
//			Thread.sleep(2000);
//
//			PCOD_ILoginPage loginPg = getFactory().getPCOD_ILoginPage();
//			loginPg.pcod_connect_to_your_teacher();
//			PauseUtil.pause(2000);
//			login.enterCACtNumber(TestBaseProvider.getTestBase().getTestData().getString("cac_no"));
//			PauseUtil.pause(2000);
//			loginPg.click_connectbtn_connecttoteacher();
//			PauseUtil.pause(2000);
//			loginPg.click_createanaccount_connecttoteacher();
//			PauseUtil.pause(2000);
//			login.pcod_enteralldata_createaccount(
//					TestBaseProvider.getTestBase().getTestData().getString("firstname") + i,
//					TestBaseProvider.getTestBase().getTestData().getString("lastname") + i,
//					TestBaseProvider.getTestBase().getTestData().getString("email") + i + "@abc.com",
//					TestBaseProvider.getTestBase().getTestData().getString("password"),
//					TestBaseProvider.getTestBase().getTestData().getString("mobnumber"));
//			PauseUtil.pause(4000);
//			login.click_continuebtn_createaccount();
//			PauseUtil.pause(3000);
//			if (sizebtnaddachildadd().size() == 0) {
//				for (int j = 1; j <= 3; j++) {
//					if (sizebtnaddachildadd().size() == 0) {
//						login.click_continuebtn_createaccount();
//						PauseUtil.pause(2000);
//					}
//				}
//			}
//
//			login.pcod_enteralldata_addachild(
//					TestBaseProvider.getTestBase().getTestData().getString("child_firstname") + i,
//					TestBaseProvider.getTestBase().getTestData().getString("child_lastname") + i);
//			PauseUtil.pause(2000);
//			pcod_click_element(getbtnaddachildadd());
//			PauseUtil.pause(2000);
//			//adding 2nd child
//			pcod_enteralldata_addsecondchild(
//					TestBaseProvider.getTestBase().getTestData().getString("child2_firstname") + i,
//					TestBaseProvider.getTestBase().getTestData().getString("child2_lastname") + i,
//					TestBaseProvider.getTestBase().getTestData().getString("cacno2"));
//			PauseUtil.pause(4000);
//			String parentfirstname = TestBaseProvider.getTestBase().getTestData().getString("firstname") + i;
//			String parentlastname = TestBaseProvider.getTestBase().getTestData().getString("lastname") + i;
//			String parentemail = TestBaseProvider.getTestBase().getTestData().getString("email") + i + "@abc.com";
//			String parentpassword = TestBaseProvider.getTestBase().getTestData().getString("password");
//			String parentnumber = TestBaseProvider.getTestBase().getTestData().getString("mobnumber");
//			String childfirstname = TestBaseProvider.getTestBase().getTestData().getString("child_firstname") + i;
//			String childlastname = TestBaseProvider.getTestBase().getTestData().getString("child_lastname") + i;
//			String child2firstname = TestBaseProvider.getTestBase().getTestData().getString("child2_firstname") + i;
//			String child2lastname = TestBaseProvider.getTestBase().getTestData().getString("child2_lastname") + i;
//			String cacno = TestBaseProvider.getTestBase().getTestData().getString("cac_no");
//			String cacno2 = TestBaseProvider.getTestBase().getTestData().getString("cacno2");
//
//			String[] valueToWrite = {parentfirstname, parentlastname, parentemail, parentpassword, parentnumber, childfirstname, childlastname, cacno, child2firstname, child2lastname, cacno2};
//
//			//Write the file using file name, sheet name and the data to be filled
//			objExcelFile.writeExcel(System.getProperty("user.dir") + "\\src\\ExcelFile", "pcod.xlsx", "Parent2childs", valueToWrite);
//			PauseUtil.pause(5000);
//			pcod_homepage.pcod_logout();
//		} catch (Exception e) {
//			driver.get("https://dev35-rco-scholastic.demandware.net/s/rco-ca/en/home");
//
//		}
//	}
//}
//

