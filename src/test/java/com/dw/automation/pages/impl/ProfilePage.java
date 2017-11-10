package com.dw.automation.pages.impl;

import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.dw.automation.beans.UserProfileBean;
import com.dw.automation.pages.IProfilePage;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.RandomDataUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;
import com.scholastic.torque.common.WaitUtils;

public class ProfilePage extends BaseTestPage<TestPage> implements IProfilePage {

	@FindBy(locator = "dw.profile.paymentandbilling.lbl.saved.paypal")
	private WebElement lblsavedPaypalAccount;

	@FindBy(locator = "dw.profile.paymentandbilling.saved.paypal.lbl.emailid")
	private WebElement lblsavedPaypalAccountEmailAdd;

	@FindBy(locator = "dw.profile.name.lbl.username")
	private WebElement txtUsername;

	@FindBy(locator = "dw.profile.email.lbl.emailaddress")
	private WebElement txtEmail;

	@FindBy(locator = "dw.profile.lbl.phonenumber")
	private WebElement txtPhoneNumber;

	@FindBy(locator = "dw.profile.teachers.school.lbl.name")
	private WebElement txtSchoolName;

	@FindBy(locator = "dw.profile.teachers.school.lbl.address")
	private WebElement txtSchoolAddress;

	@FindBy(locator = "dw.profile.teachers.school.lbl.cityname")
	private WebElement txtSchoolCity;

	@FindBy(locator = "dw.profile.teachers.school.lbl.zipcode")
	private WebElement txtSchoolZip;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.lbl.number")
	private List<WebElement> lstLblCreditcardNumber;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.lbl.expiry")
	private List<WebElement> lstLblCreditcardExpiry;

	@FindBy(locator = "dw.profile.childinfo.lst.plusicons")
	private List<WebElement> lstPlusIcon;

	@FindBy(locator = "dw.profile.childinfo.expandedinfo.btn.minusicon")
	private WebElement expandedMinusIcon;

	@FindBy(locator = "dw.profile.childinfo.expandedinfo.lst.lnk.edit")
	private List<WebElement> expandedEditLink;

	@FindBy(locator = "dw.profile.childinfo.expandedinfo.lst.lnk.remove")
	private List<WebElement> expandedRemoveLink;

	@FindBy(locator = "dw.profile.childinfo.expandedinfo.lst.lbl.childname")
	private List<WebElement> expandedChildName;

	@FindBy(locator = "dw.profile.childinfo.expandedinfo.lst.lbl.childgrade")
	private List<WebElement> expandedChildGrade;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.edit.txt.firstname")
	private WebElement txtEditcardFirstName;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.edit.txt.lastname")
	private WebElement txtEditcardLastName;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.edit.txt.addressone")
	private WebElement txtEditcardAddressOne;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.edit.txt.addresstwo")
	private WebElement txtEditcardAddressTwo;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.edit.txt.zip")
	private WebElement txtEditcardZip;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.edit.txt.phonenumber")
	private WebElement txtEditcardPhonenumber;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.edit.drp.country")
	private WebElement drpEditCardCountry;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.edit.drp.city")
	private WebElement drpEditCardCity;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.edit.drp.state")
	private WebElement drpEditCardState;

	@FindBy(locator = "dw.profile.childinfo.expandedinfo.lst.lbl.teachername")
	private List<WebElement> expandedTeacherName;

	@FindBy(locator = "dw.profile.childinfo.expandedinfo.lst.lbl.schoolname")
	private List<WebElement> expandedSchoolName;

	@FindBy(locator = "dw.profile.childinfo.expandedinfo.lst.lbl.schooladdress")
	private List<WebElement> expandedSchooAddress;

	@FindBy(locator = "dw.profile.childinfo.expandedinfo.lst.lbl.schoolcityandzip")
	private List<WebElement> expandedSchoolCityAndZip;

	@FindBy(locator = "dw.profile.paymentandbilling.paypal.lnk.remove")
	private WebElement removePaypalLink;

	@FindBy(locator = "dw.reviewcart.remove.btn.yes")
	private WebElement btnRemoveYes;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.lnk.edit")
	private List<WebElement> lstLnkCreditcardEdit;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.lnk.remove")
	private List<WebElement> lstLnkCreditcardRemove;

	@FindBy(locator = "dw.profile.grade.lbl")
	private WebElement lblGrade;

	@FindBy(locator = "dw.profile.additional.info")
	private WebElement lblAddInfo;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.error.lbl.cardlimitmsg")
	private WebElement lblCardLimitError;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.lbl.cardname")
	private WebElement lblSavedCardName;

	public WebElement getLblSavedCardName() {
		return lblSavedCardName;
	}

	public WebElement getLblCardLimitError() {
		return lblCardLimitError;
	}

	public WebElement getLblGrade() {
		return lblGrade;
	}

	public WebElement getLblAddInfo() {
		return lblAddInfo;
	}

	@FindBy(locator = "dw.teachers.profile.lbl.classactivationcode")
	private WebElement lblCAC;
	// Add Credit Card

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.add.lnk.AddCard")
	private WebElement lnkAddCard;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.add.txt.owner")
	private WebElement txtAddCreditCardOwner;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.add.txt.cardnumber")
	private WebElement txtAddCreditCardNumber;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.add.drp.expiry.month")
	private WebElement drpAddCreditCardCMonth;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.add.drp.expiry.year")
	private WebElement drpAddCreditCardYear;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.add.txt.securitycode")
	private WebElement txtAddCreditCardSecurityCode;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.add.txt.firstname")
	private WebElement txtAddCreditCardFirstName;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.add.txt.lastname")
	private WebElement txtAddCreditCardLastName;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.add.txt.addressone")
	private WebElement txtAddCreditCardAddress1;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.add.txt.addresstwo")
	private WebElement txtAddCreditCardAddress2;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.add.txt.zip")
	private WebElement txtAddCreditCardZipCode;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.add.txt.phonenumber")
	private WebElement txtAddCreditCardPhoneNumber;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.add.drp.country")
	private WebElement drpAddCreditCardCountry;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.add.drp.city")
	private WebElement drpAddCreditCardCity;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.add.drp.state")
	private WebElement drpAddCreditCardState;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.add.btn.save")
	private WebElement btnAddCreditCardSave;
	
	@FindBy(locator = "dw.profile.name.lnk.editname")
	private WebElement lnkeditmyprofile;

	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.add.drp.state.provinces")
	private WebElement drpAddCreditCardStateProvinces;
	
	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.edit.selected.expiry.month")
	private WebElement drpEditCreditCardSelectedExpiryMonth;
	
	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.edit.selected.expiry.year")
	private WebElement drpEditCreditCardSelectedExpiryYear;
	
	@FindBy(locator = "dw.profile.paymentandbilling.creditcard.edit.selected.province")
	private WebElement drpEditCreditCardSelectedProvince;
	
	public WebElement getDrpEditCreditCardSelectedProvince() {
		return drpEditCreditCardSelectedProvince;
	}
	
	public WebElement getDrpEditCreditCardSelectedExpiryYear() {
		return drpEditCreditCardSelectedExpiryYear;
	}
	
	public WebElement getDrpEditCreditCardSelectedExpiryMonth() {
		return drpEditCreditCardSelectedExpiryMonth;
	}
	
	public WebElement getDrpAddCreditCardStateProvinces() {
		return drpAddCreditCardStateProvinces;
	}
	
	public WebElement getLnkAddCard() {

		return lnkAddCard;

	}

	public WebElement getLblCAC() {
		return lblCAC;
	}

	public void setLblCAC(WebElement lblCAC) {
		this.lblCAC = lblCAC;
	}

	public WebElement getExpandedMinusIcon() {
		return expandedMinusIcon;
	}

	public List<WebElement> getExpandedEditLink() {
		return expandedEditLink;
	}

	public List<WebElement> getExpandedRemoveLink() {
		return expandedRemoveLink;
	}

	public List<WebElement> getExpandedChildName() {
		return expandedChildName;
	}

	public List<WebElement> getExpandedChildGrade() {
		return expandedChildGrade;
	}

	public List<WebElement> getExpandedTeacherName() {
		return expandedTeacherName;
	}

	public List<WebElement> getExpandedSchoolName() {
		return expandedSchoolName;
	}

	public List<WebElement> getExpandedSchooAddress() {
		return expandedSchooAddress;
	}

	public List<WebElement> getExpandedSchoolCityAndZip() {
		return expandedSchoolCityAndZip;
	}

	public List<WebElement> getLstPlusIcon() {
		return lstPlusIcon;
	}

	@Override
	public WebElement getTxtUsername() {
		return txtUsername;
	}

	@Override
	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPhoneNumber() {
		return txtPhoneNumber;
	}

	public WebElement getTxtSchoolName() {
		return txtSchoolName;
	}

	public WebElement getTxtSchoolAddress() {
		return txtSchoolAddress;
	}

	public WebElement getTxtSchoolCity() {
		return txtSchoolCity;
	}

	public WebElement getTxtSchoolZip() {
		return txtSchoolZip;
	}

	public List<WebElement> getLstLblCreditcardNumber() {
		return lstLblCreditcardNumber;
	}

	public List<WebElement> getLstLblCreditcardExpiry() {
		return lstLblCreditcardExpiry;
	}

	public WebElement getTxtEditcardFirstName() {
		return txtEditcardFirstName;
	}

	public WebElement getTxtEditcardLastName() {
		return txtEditcardLastName;
	}

	public WebElement getTxtEditcardAddressOne() {
		return txtEditcardAddressOne;
	}

	public WebElement getTxtEditcardAddressTwo() {
		return txtEditcardAddressTwo;
	}

	public WebElement getTxtEditcardZip() {
		return txtEditcardZip;
	}

	public WebElement getTxtEditcardPhonenumber() {
		return txtEditcardPhonenumber;
	}

	public WebElement getDrpEditCardCountry() {
		return drpEditCardCountry;
	}

	public WebElement getDrpEditCardCity() {
		return drpEditCardCity;
	}

	public WebElement getDrpEditCardState() {
		return drpEditCardState;
	}

	public WebElement getRemovePaypalLink() {
		return removePaypalLink;
	}

	public WebElement getBtnRemoveYes() {
		return btnRemoveYes;
	}

	public List<WebElement> getLstLnkCardEdit() {
		return lstLnkCreditcardEdit;
	}

	public List<WebElement> getLstLnkCardRemove() {
		return lstLnkCreditcardRemove;
	}

	public WebElement getLblsavedPaypalAccount() {
		return lblsavedPaypalAccount;
	}

	public WebElement getLblsavedPaypalAccountEmailAdd() {
		return lblsavedPaypalAccountEmailAdd;
	}

	public List<WebElement> getLstLnkCreditcardEdit() {
		return lstLnkCreditcardEdit;
	}

	public List<WebElement> getLstLnkCreditcardRemove() {
		return lstLnkCreditcardRemove;
	}

	public WebElement getTxtAddCreditCardOwner() {
		return txtAddCreditCardOwner;
	}

	public WebElement getTxtAddCreditCardNumber() {
		return txtAddCreditCardNumber;
	}

	public WebElement getDrpAddCreditCardCMonth() {
		return drpAddCreditCardCMonth;
	}

	public WebElement getDrpAddCreditCardYear() {
		return drpAddCreditCardYear;
	}

	public WebElement getTxtAddCreditCardSecurityCode() {
		return txtAddCreditCardSecurityCode;
	}

	public WebElement getTxtAddCreditCardFirstName() {
		return txtAddCreditCardFirstName;
	}

	public WebElement getTxtAddCreditCardLastName() {
		return txtAddCreditCardLastName;
	}

	public WebElement getTxtAddCreditCardAddress1() {
		return txtAddCreditCardAddress1;
	}

	public WebElement getTxtAddCreditCardAddress2() {
		return txtAddCreditCardAddress2;
	}

	public WebElement getTxtAddCreditCardZipCode() {
		return txtAddCreditCardZipCode;
	}

	public WebElement getTxtAddCreditCardPhoneNumber() {
		return txtAddCreditCardPhoneNumber;
	}

	public WebElement getDrpAddCreditCardCountry() {
		return drpAddCreditCardCountry;
	}

	public WebElement getDrpAddCreditCardCity() {
		return drpAddCreditCardCity;
	}

	public WebElement getDrpAddCreditCardState() {
		return drpAddCreditCardState;
	}

	public WebElement getBtnAddCreditCardSave() {
		return btnAddCreditCardSave;
	}
	
	public WebElement getlnkeditmyprofile() {
		return lnkeditmyprofile;
	}

	@Override
	public void openPage() {
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
		WaitUtils.waitForEnabled(txtUsername);

	}

	/**
	 * This Method Get Address From Profile Page And Set All Address into user
	 * profile bean
	 */
	@Override
	public UserProfileBean fillUserProfileBean() {
		System.out.println("Comes in Fill User Profile Bean");
		WaitUtils.waitForDisplayed(getTxtUsername());
		UserProfileBean profileBean = new UserProfileBean();
		System.out.println("username...." + getTxtUsername().getText());
		profileBean.setName(getTxtUsername().getText());
		profileBean.setEmail(getTxtEmail().getText());
		profileBean.setCac(getLblCAC().getText());
		if (SCHUtils.isPresent(getTxtPhoneNumber())) {
			profileBean.setPhone(getTxtPhoneNumber().getText());
		}
		profileBean.setSchool(getTxtSchoolName().getText());
		System.out.println("School Name" + getTxtSchoolName().getText());
		profileBean.setAddress(getTxtSchoolAddress().getText());
		System.out.println("Address Section  : " + getTxtSchoolAddress().getText());
		profileBean.setCity(getTxtSchoolCity().getText());
		profileBean.setZip(getTxtSchoolZip().getText());
		getTestBase().getContext().setProperty("testexecution.userProfileBean",
				profileBean);
		return profileBean;

	}

	/**
	 * This Method Get Teacher Address for particular Child From Profile Page
	 * and Set All Address into user profile bean
	 * 
	 * @param -
	 *            <<<<<<< HEAD
	 *            childName
	 *            =======
	 *            and Set All Address into user
	 *            profile bean
	 * @param -
	 *            childName
	 *            >>>>>>> branch 'master' of
	 *            https://mehul_infostretch@bitbucket.org/schl-rco/schl-rco-test
	 *            .git
	 *            =======
	 *            childName
	 *            >>>>>>> bb2eb8e45acaa62f62e0ab934452a4323c249050
	 */
	@Override
	public void fillUserProfileBeanFromChildName() {
		WaitUtils.waitForDisplayed(getTxtUsername());
		if (getTestBase().getTestData().getString("newPayPal") != null
				&& getTestBase().getTestData().getString("newPayPal").equals("true")
				&& SCHUtils.isPresent(getRemovePaypalLink())) {
			SCHUtils.clickUsingJavaScript(getRemovePaypalLink());
			PauseUtil.pause(2000);
			WaitUtils.waitForEnabled(getBtnRemoveYes());
			SCHUtils.clickUsingJavaScript(getBtnRemoveYes());
			PauseUtil.pause(2000);

		}

		for (int index = 0; index < getLstPlusIcon().size(); index++) {
			UserProfileBean profileBean = new UserProfileBean();
			System.out.println("Filling Parent User Profile Bean");
			profileBean.setName(getTxtUsername().getText());
			profileBean.setEmail(getTxtEmail().getText());
			if (SCHUtils.isPresent(getTxtPhoneNumber())) {
				profileBean.setPhone(getTxtPhoneNumber().getText());
			}
			getLstPlusIcon().get(index).click();
			PauseUtil.pause(2000);
			profileBean.setChildName(getExpandedChildName().get(index).getText());
			profileBean.setChildGrade(getExpandedChildGrade().get(index).getText());
			profileBean.setSchool(getExpandedSchoolName().get(index).getText());
			profileBean.setAddress(getExpandedSchooAddress().get(index).getText());
			profileBean.setCity(getExpandedSchoolCityAndZip().get(index).getText());
			profileBean.setChildTeacher(getExpandedTeacherName().get(index).getText());
			SCHUtils.addChildTeacherDetails(profileBean);
		}
	}

	@Override
	public void verifyDefaultSavedCard() {
		Configuration data = TestBaseProvider.getTestBase().getTestData();
		String cardNumber = data.getString("cardnumber");
		boolean verified = false;
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.pause(5000);
		for (int i = 0; i < lstLblCreditcardNumber.size(); i++) {
			if (lstLblCreditcardNumber.get(i).getText().trim()
					.equalsIgnoreCase(cardNumber.substring(cardNumber.length() - 4))
					&& lstLblCreditcardExpiry.get(i).getText().trim().split(" ")[1]
							.split("/")[0].trim()
									.equalsIgnoreCase(data.getString("expmonth"))
					&& lstLblCreditcardExpiry.get(i).getText().trim().split(" ")[1]
							.split("/")[1].trim()
									.equalsIgnoreCase(data.getString("expyear").substring(
											data.getString("expyear").length() - 2))) {
				getLstLnkCardEdit().get(i).click();
				AssertUtils.assertAttributeMatches(txtEditcardFirstName, "value",
						Matchers.containsString(data.getString("firstname")));
				AssertUtils.assertAttributeMatches(txtEditcardLastName, "value",
						Matchers.containsString(data.getString("lastname")));
				AssertUtils.assertAttributeMatches(txtEditcardPhonenumber, "value",
						Matchers.containsString(data.getString("phone")));
				AssertUtils.assertAttributeMatches(txtEditcardZip, "value",
						Matchers.containsString(data.getString("zip")));
				AssertUtils.assertAttributeMatches(txtEditcardAddressOne, "value",
						Matchers.containsString(data.getString("address1")));
				if (data.getString("address2") != null) {
					AssertUtils.assertAttributeMatches(txtEditcardAddressTwo, "value",
							Matchers.containsString(data.getString("address2")));
				}
				AssertUtils.assertTextMatches(drpEditCardCity,
						Matchers.equalToIgnoringCase(data.getString("city")));
				AssertUtils.assertTextMatches(drpEditCardCountry,
						Matchers.equalToIgnoringCase(data.getString("country")));
				AssertUtils.assertTextMatches(drpEditCardState,
						Matchers.equalToIgnoringCase(data.getString("state")));
				verified = true;
				break;
			}
		}
		Assert.assertTrue(verified, "CriditCard is not Saved");
	}

	/**
	 * this method verify user has already paypal account or not. if user has
	 * already paypal account then it will store paypal email id information
	 * into testexecution.saved.paypal.account.information this property key.
	 */
	@Override
	public void verifyDefaultSavedPaypalCard() {
		AssertUtils.assertDisplayed(lblsavedPaypalAccount);
		AssertUtils.assertDisplayed(lblsavedPaypalAccountEmailAdd);
		getTestBase().getContext().setProperty(
				"testexecution.saved.paypal.account.information",
				lblsavedPaypalAccount.getText().split("\n")[1]);

	}

	@Override
	public void addCreditCard(Configuration data) {
		getLnkAddCard().click();
		PauseUtil.pause(2000);
		// If there are already 3 cards in the profile then the first one will
		// be deleted to add new one
		if (SCHUtils.isPresent(getLblCardLimitError())) {
			getLstLnkCardRemove().get(0).click();
			WaitUtils.waitForDisplayed(getBtnRemoveYes());
			getBtnRemoveYes().click();
			PauseUtil.pause(1000);
			SCHUtils.waitForLoaderToDismiss();
			getLnkAddCard().click();
		}
		PauseUtil.pause(3000);
		WaitUtils.waitForEnabled(getTxtAddCreditCardNumber());
		getTxtAddCreditCardOwner().click();
		getTxtAddCreditCardOwner().sendKeys(data.getString("cardname"));
		String cardnumber = data.getString("cardnumber");
		if (getTxtAddCreditCardNumber().isDisplayed()) {
			getTxtAddCreditCardNumber().sendKeys(cardnumber);
			PauseUtil.pause(5000);
			Select drpMonth = new Select(getDrpAddCreditCardCMonth());
			drpMonth.selectByVisibleText(data.getString("expmonth"));
			Select drpYear = new Select(getDrpAddCreditCardYear());
			drpYear.selectByVisibleText(data.getString("expyear"));
		} else {
			Select drpMonth = new Select(getDrpAddCreditCardCMonth());
			drpMonth.selectByVisibleText(data.getString("expmonth"));
			Select drpYear = new Select(getDrpAddCreditCardYear());
			drpYear.selectByVisibleText(data.getString("expyear"));
		}
		getTxtAddCreditCardSecurityCode().clear();
		getTxtAddCreditCardSecurityCode().sendKeys(data.getString("securitycode"));
		getTxtAddCreditCardFirstName().sendKeys(data.getString("firstname"));
		PauseUtil.pause(1000);
		getTxtAddCreditCardLastName().click();
		getTxtAddCreditCardLastName().sendKeys(data.getString("lastname"));
		getTxtAddCreditCardAddress1().sendKeys(data.getString("address1"));
		getTxtAddCreditCardAddress2().sendKeys(data.getString("address2"));
		getTxtAddCreditCardZipCode().sendKeys(data.getString("zip"));
		PauseUtil.pause(6000);
		SCHUtils.clickUsingJavaScript(getTxtAddCreditCardPhoneNumber());
		getTxtAddCreditCardPhoneNumber()
				.sendKeys(RandomDataUtil.getPhoneNumber(data.getString("phone")));
		getTxtAddCreditCardPhoneNumber().click();
		PauseUtil.pause(1000);
		SCHUtils.clickUsingJavaScript(getBtnAddCreditCardSave());
		SCHUtils.waitForLoaderToDismiss();
		// This will set the card name for selection in checkout flow
		WaitUtils.waitForDisplayed(getLblSavedCardName());
		data.setProperty("cardname",
				getLblSavedCardName().getText().replace("E", "e").replace("I", "i"));
	}

	/**
	 * this method will verify user information on profile page for teacher
	 * login, it is mandatory to set all the following test data in XML.
	 * title,firstname,lastname,email,phone,zipcode,schoolname,schooladdress,
	 * schoolcity,role,grade,noofstudents
	 */
	@Override
	public void verifyPage() {

		WaitUtils.waitForEnabled(getLblAddInfo());
		PauseUtil.pause(10000);
		Configuration data = getTestBase().getTestData();

		AssertUtils.assertTextMatches(getTxtUsername(),
				Matchers.containsString(data.getString("title")));
		AssertUtils.assertTextMatches(getTxtUsername(),
				Matchers.containsString(data.getString("firstname")));
		AssertUtils.assertTextMatches(getTxtUsername(),
				Matchers.containsString(data.getString("lastname")));

		AssertUtils.assertTextMatches(getTxtEmail(),
				Matchers.containsString(data.getString("email")));
		AssertUtils.assertTextMatches(getTxtPhoneNumber(),
				Matchers.containsString(data.getString("phone")));
		AssertUtils.assertTextMatches(getTxtSchoolZip(),
				Matchers.containsString(data.getString("zipcode")));
		AssertUtils.assertTextMatches(getTxtSchoolName(),
				Matchers.containsString(data.getString("schoolname")));
		AssertUtils.assertTextMatches(getTxtSchoolAddress(),
				Matchers.containsString(data.getString("schooladdress")));
		AssertUtils.assertTextMatches(getTxtSchoolCity(),
				Matchers.containsString(data.getString("schoolcity")));
		AssertUtils.assertTextMatches(getLblGrade(),
				Matchers.containsString(data.getString("role")));
		AssertUtils.assertTextMatches(getLblGrade(),
				Matchers.containsString(data.getString("grade")));
		AssertUtils.assertTextMatches(getLblGrade(),
				Matchers.containsString(data.getString("noofstudents")));

	}
	
	@Override
	public void addCreditCardProfilePage(Configuration data) {
		getLnkAddCard().click();
		PauseUtil.pause(2000);
		
		WaitUtils.waitForEnabled(getTxtAddCreditCardNumber());
		getTxtAddCreditCardOwner().click();
		getTxtAddCreditCardOwner().sendKeys(data.getString("cardname"));
		String cardnumber = data.getString("cardnumber");
		if (getTxtAddCreditCardNumber().isDisplayed()) {
			getTxtAddCreditCardNumber().sendKeys(cardnumber);
			PauseUtil.pause(5000);
			Select drpMonth = new Select(getDrpAddCreditCardCMonth());
			drpMonth.selectByVisibleText(data.getString("expmonth"));
			Select drpYear = new Select(getDrpAddCreditCardYear());
			drpYear.selectByVisibleText(data.getString("expyear"));
		} else {
			Select drpMonth = new Select(getDrpAddCreditCardCMonth());
			drpMonth.selectByVisibleText(data.getString("expmonth"));
			Select drpYear = new Select(getDrpAddCreditCardYear());
			drpYear.selectByVisibleText(data.getString("expyear"));
		}
		getTxtAddCreditCardSecurityCode().clear();
		getTxtAddCreditCardSecurityCode().sendKeys(data.getString("securitycode"));
		getTxtAddCreditCardFirstName().sendKeys(data.getString("firstname"));
		PauseUtil.pause(1000);
		getTxtAddCreditCardLastName().click();
		getTxtAddCreditCardLastName().sendKeys(data.getString("lastname"));
		getTxtAddCreditCardAddress1().sendKeys(data.getString("address1"));
		getTxtAddCreditCardAddress2().sendKeys(data.getString("address2"));
		getTxtAddCreditCardZipCode().sendKeys(data.getString("zip"));
		getDrpAddCreditCardCity().sendKeys(data.getString("city"));
		
		Select drpProvince = new Select(getDrpAddCreditCardStateProvinces());
			drpProvince.selectByValue(data.getString("province"));
		
		PauseUtil.pause(6000);
		SCHUtils.clickUsingJavaScript(getTxtAddCreditCardPhoneNumber());
		getTxtAddCreditCardPhoneNumber()
				.sendKeys(RandomDataUtil.getPhoneNumber(data.getString("phone")));
		getTxtAddCreditCardPhoneNumber().click();
		PauseUtil.pause(1000);
		SCHUtils.clickUsingJavaScript(getBtnAddCreditCardSave());
		SCHUtils.waitForLoaderToDismiss();
	}
	
	@Override
	public void editSavedCreditCardProfilePage(Configuration data) {
		PauseUtil.pause(2000);
		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//SCHUtils.clickUsingJavaScript(getDrpEditCreditCardSelectedExpiryMonth());
		PauseUtil.pause(2000);
		
		WebElement val = driver.findElement(By.xpath("//*[@id='dwfrm_paymentinstruments_creditcards_newcreditcard_month']/option[@value='" + data.getString("expmonth2") + "']"));
		//Select drpMonth = new Select(val);
		//drpMonth.selectByVisibleText(data.getString("expmonth2"));
		SCHUtils.changeValueUsingJavaScript(val, "selected", "true");
		
		val = driver.findElement(By.xpath("//*[@id='creditCardYear']"));
		SCHUtils.changeValueUsingJavaScript(val, "value", data.getString("expmonth2"));
		//SCHUtils.clickUsingJavaScript(val);
		
		val = driver.findElement(By.xpath("//*[@id='dwfrm_paymentinstruments_creditcards_newcreditcard_year']/option[@value='" + data.getString("expyear2") + "']"));
		//Select drpYear = new Select(val);
		//drpYear.selectByVisibleText(data.getString("expyear2"));
		
		SCHUtils.changeValueUsingJavaScript(val, "selected", "true");
	
		//SCHUtils.clickUsingJavaScript(val);
		
		 val = driver.findElement(By.xpath("//*[@id='dwfrm_paymentinstruments_creditcards_newcreditcard_cvn']"));
		//SCHUtils.clickUsingJavaScript(val);
		//val.sendKeys(data.getString("securitycode"));
		SCHUtils.changeValueUsingJavaScript(val, "value", data.getString("securitycode"));
		
		val = driver.findElement(By.xpath("//*[@id='dwfrm_paymentinstruments_creditcards_address_firstname']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('dwfrm_paymentinstruments_creditcards_address_firstname').focus();");
		
		
		//val.sendKeys(data.getString("firstname2"));
		SCHUtils.changeValueUsingJavaScript(val, "value", data.getString("firstname2"));
		PauseUtil.pause(1000);
		
		val = driver.findElement(By.xpath("//*[@id='dwfrm_paymentinstruments_creditcards_address_lastname']"));
		//val.click();
		//val.sendKeys(data.getString("lastname2"));
		SCHUtils.changeValueUsingJavaScript(val, "value", data.getString("lastname2"));
		
		val = driver.findElement(By.xpath("//*[@id='dwfrm_paymentinstruments_creditcards_address_address1']"));
		//val.sendKeys(data.getString("address1_2"));
		SCHUtils.changeValueUsingJavaScript(val, "value", data.getString("address1_2"));
						
		val = driver.findElement(By.xpath("//*[@id='dwfrm_paymentinstruments_creditcards_address_address2']"));
		//val.sendKeys(data.getString("address2_2"));
		SCHUtils.changeValueUsingJavaScript(val, "value", data.getString("address2_2"));
		
		val = driver.findElement(By.xpath("//*[@id='dwfrm_paymentinstruments_creditcards_address_postal']"));
		//val.sendKeys(data.getString("zip2"));
		SCHUtils.changeValueUsingJavaScript(val, "value", data.getString("zip2"));
		
		val = driver.findElement(By.xpath("//*[@id='dwfrm_paymentinstruments_creditcards_address_city']"));
		//val.sendKeys(data.getString("city2"));
		SCHUtils.changeValueUsingJavaScript(val, "value", data.getString("city2"));
		
		val = driver.findElement(By.xpath("//*[@id='dwfrm_paymentinstruments_creditcards_address_states_stateCA']/option[@value='" + data.getString("province2") + "']"));
		//Select drpProvince = new Select(val);
		//drpProvince.selectByValue(data.getString("province2"));
		SCHUtils.changeValueUsingJavaScript(val, "selected", "true");
		//SCHUtils.clickUsingJavaScript(val);
		PauseUtil.pause(6000);
		val = driver.findElement(By.xpath("//*[@id='dwfrm_paymentinstruments_creditcards_address_phone']"));
		//val.sendKeys(RandomDataUtil.getPhoneNumber(data.getString("phone2")));
		//val.click();
		SCHUtils.changeValueUsingJavaScript(val, "value", data.getString("phone2"));
	}

	public void pcod_verify_saved_information_edit_card_profile_page(Configuration data) {
		PauseUtil.pause(2000);
		
		String exp_month = data.getString("expmonth2");
		String exp_year = data.getString("expyear2");
		String exp_firstname = data.getString("firstname2");
		String exp_lastname = data.getString("lastname2");
		String exp_address1 = data.getString("address1_2");
		String exp_address2 = data.getString("address2_2");
		String exp_zip = data.getString("zip2");
		String exp_city = data.getString("city2");
		String exp_province = data.getString("expprovince");
		String exp_phone = data.getString("phone2");
		
		Assert.assertEquals(getDrpEditCreditCardSelectedExpiryMonth().getText().trim(), exp_month, "The editted expiry month is not correct");
		Assert.assertEquals(getDrpEditCreditCardSelectedExpiryYear().getText().trim(), exp_year, "The editted expiry year is not correct");
		Assert.assertEquals(getTxtAddCreditCardFirstName().getText().trim(), exp_firstname, "The editted firstname is not correct");
		Assert.assertEquals(getTxtAddCreditCardLastName().getText().trim(), exp_lastname, "The editted lastname is not correct");
		Assert.assertEquals(getTxtAddCreditCardAddress1().getText().trim(), exp_address1, "The editted address1 is not correct");
		Assert.assertEquals(getTxtAddCreditCardAddress2().getText().trim(), exp_address2, "The editted address2 is not correct");
		Assert.assertEquals(getTxtAddCreditCardZipCode().getText().trim(), exp_zip, "The editted postal code is not correct");
		Assert.assertEquals(getDrpAddCreditCardCity().getText().trim(), exp_city, "The editted city is not correct");
		Assert.assertEquals(getDrpEditCreditCardSelectedProvince().getText().trim(), exp_province, "The editted province is not correct");
		Assert.assertEquals(getTxtAddCreditCardPhoneNumber().getText().trim(), exp_phone, "The editted phone number is not correct");
	}

	public void pcod_verify_securitycode_cleared_profile_page() {
		PauseUtil.pause(2000);
		
		String act_value = getTxtAddCreditCardSecurityCode().getText();
		String exp_value = "";
		
		Assert.assertEquals(act_value, exp_value, "The security code textbox is not empty");
	}

	public void addUniqueCreditCardProfilePage(Configuration data, int i) {
		getLnkAddCard().click();
		PauseUtil.pause(2000);
		
		WaitUtils.waitForEnabled(getTxtAddCreditCardNumber());
		getTxtAddCreditCardOwner().click();
		getTxtAddCreditCardOwner().sendKeys(data.getString("cardname") + i);
		String cardnumber = data.getString("cardnumber");
		if (getTxtAddCreditCardNumber().isDisplayed()) {
			getTxtAddCreditCardNumber().sendKeys(cardnumber);
			PauseUtil.pause(5000);
			Select drpMonth = new Select(getDrpAddCreditCardCMonth());
			drpMonth.selectByVisibleText(data.getString("expmonth"));
			Select drpYear = new Select(getDrpAddCreditCardYear());
			drpYear.selectByVisibleText(data.getString("expyear"));
		} else {
			Select drpMonth = new Select(getDrpAddCreditCardCMonth());
			drpMonth.selectByVisibleText(data.getString("expmonth"));
			Select drpYear = new Select(getDrpAddCreditCardYear());
			drpYear.selectByVisibleText(data.getString("expyear"));
		}
		getTxtAddCreditCardSecurityCode().clear();
		getTxtAddCreditCardSecurityCode().sendKeys(data.getString("securitycode"));
		getTxtAddCreditCardFirstName().sendKeys(data.getString("firstname"));
		PauseUtil.pause(1000);
		getTxtAddCreditCardLastName().click();
		getTxtAddCreditCardLastName().sendKeys(data.getString("lastname") + i);
		getTxtAddCreditCardAddress1().sendKeys(data.getString("address1"));
		getTxtAddCreditCardAddress2().sendKeys(data.getString("address2"));
		getTxtAddCreditCardZipCode().sendKeys(data.getString("zip"));
		getDrpAddCreditCardCity().sendKeys(data.getString("city"));
		
		Select drpProvince = new Select(getDrpAddCreditCardStateProvinces());
			drpProvince.selectByValue(data.getString("province"));
		
		PauseUtil.pause(6000);
		SCHUtils.clickUsingJavaScript(getTxtAddCreditCardPhoneNumber());
		getTxtAddCreditCardPhoneNumber()
				.sendKeys(RandomDataUtil.getPhoneNumber(data.getString("phone")));
		getTxtAddCreditCardPhoneNumber().click();
		PauseUtil.pause(1000);
		SCHUtils.clickUsingJavaScript(getBtnAddCreditCardSave());
		SCHUtils.waitForLoaderToDismiss();
	}

	public void pcod_verify_information_not_saved_edit_card_profile_page(Configuration data) {
		PauseUtil.pause(2000);
		
		String exp_month = data.getString("expmonth2");
		String exp_year = data.getString("expyear2");
		String exp_firstname = data.getString("firstname2");
		String exp_lastname = data.getString("lastname2");
		String exp_address1 = data.getString("address1_2");
		String exp_address2 = data.getString("address2_2");
		String exp_zip = data.getString("zip2");
		String exp_city = data.getString("city2");
		String exp_province = data.getString("expprovince");
		String exp_phone = data.getString("phone2");
		
		Assert.assertNotEquals(getDrpEditCreditCardSelectedExpiryMonth().getText().trim(), exp_month, "The editted expiry month is not correct");
		Assert.assertNotEquals(getDrpEditCreditCardSelectedExpiryYear().getText().trim(), exp_year, "The editted expiry year is not correct");
		Assert.assertNotEquals(getTxtAddCreditCardFirstName().getText().trim(), exp_firstname, "The editted firstname is not correct");
		Assert.assertNotEquals(getTxtAddCreditCardLastName().getText().trim(), exp_lastname, "The editted lastname is not correct");
		Assert.assertNotEquals(getTxtAddCreditCardAddress1().getText().trim(), exp_address1, "The editted address1 is not correct");
		Assert.assertNotEquals(getTxtAddCreditCardAddress2().getText().trim(), exp_address2, "The editted address2 is not correct");
		Assert.assertNotEquals(getTxtAddCreditCardZipCode().getText().trim(), exp_zip, "The editted postal code is not correct");
		Assert.assertNotEquals(getDrpAddCreditCardCity().getText().trim(), exp_city, "The editted city is not correct");
		Assert.assertNotEquals(getDrpEditCreditCardSelectedProvince().getText().trim(), exp_province, "The editted province is not correct");
		Assert.assertNotEquals(getTxtAddCreditCardPhoneNumber().getText().trim(), exp_phone, "The editted phone number is not correct");
	}
	
	
}
