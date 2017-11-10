package com.dw.automation.pages.impl;

import java.text.DecimalFormat;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.dw.automation.pages.ICheckoutPage_2;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.RandomDataUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;
import com.scholastic.torque.common.WaitUtils;

public class CheckoutPage_2 extends BaseTestPage<TestPage> implements ICheckoutPage_2 {
	StudentFlyerOrdersPage SFO_page=new StudentFlyerOrdersPage();
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.txt.nameoncard")
	private WebElement txtNameOnCard;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.txt.cardnumber")
	private WebElement txtCardNumber;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.drp.expirymonth")
	private WebElement drpCardExpiryMonth;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.drp.expiryyear")
	private WebElement drpCardExpiryYear;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.txt.securitycode")
	private WebElement txtCardSecurityCode;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.fld.CreditCard.image.Payment.page")
	private WebElement fld_CreditCard_image_Payment_page;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.fld.default.country.Payment.page")
	private WebElement fld_default_country_Payment_page;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.fld.country.US.Payment.page")
	private WebElement fld_country_US_Payment_page;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.label.Postal.Code.and.ZIP.Payment.page")
	private WebElement label_Postal_Code_and_ZIP_Payment_page;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.label.Province.and.STATE.Payment.page")
	private WebElement label_Province_and_STATE_Payment_page;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.firstname")
	private WebElement txtBillingFirstName;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.lastname")
	private WebElement txtBillingLastName;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.addressone")
	private WebElement txtBillingAddressOne;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.addresstwo")
	private WebElement txtBillingAddressTwo;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.zip")
	private WebElement txtBillingZip;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.city")
	private WebElement txtBillingCity;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.phonenumber")
	private WebElement txtBillingPhoneNumber;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.fld.selection.Year.Payment.page")
	private WebElement fld_selection_Year_Payment_page;
	
	@FindBy(locator = "dw.checkout.popUp.error.PhoneNumber.fld.Payment.page")
	private WebElement popUp_error_PhoneNumber_fld_Payment_page;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.fld.selection.Month.Payment.page")
	private WebElement fld_selection_Month_Payment_page;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.drp.state")
	private WebElement drpBillingState;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.drp.country")
	private WebElement drpBillingCountry;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.shippinginfo.txt.addressone")
	private WebElement txtshippinginfoAddressOne;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.shippinginfo.txt.addresstwo")
	private WebElement txtshippinginfoAddressTwo;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.shippinginfo.txt.zip")
	private WebElement txtshippinginfoZip;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.shippinginfo.txt.city")
	private WebElement txtshippinginfoCity;

	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.shippinginfo.drp.state")
	private WebElement drpshippinginfoState;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.shippinginfo.drp.country")
	private WebElement drpshippinginfoCountry;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.drp.month")
	private WebElement drpMonth;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.drp.year")
	private WebElement drpYear;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.select.month")
	private WebElement selectMonth;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.select.year")
	private WebElement selectYear;

	@FindBy(locator = "dw.checkout.header.ConfirmSubmitIsActive")
	private WebElement headerConfirmSubmitIsActive;
	
	@FindBy(locator = "dw.checkout.btn.Submit")
	private WebElement btnSubmitInSubmitPage;
	
	@FindBy(locator = "dw.checkout.btn.close.order.Confirmation.popup")
	private WebElement btn_close_order_Confirmation_popup;
	
	@FindBy(locator = "dw.checkout.btn.Submit")
	private List<WebElement> sizebtnSubmitInSubmitPage;
	
	@FindBy(locator = "dw.checkout.msg.succesful.order")
	private WebElement headerOrderSuccessfulMessage;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.Fld.amt.paid.by.CC")
	private WebElement Fld_amt_paid_by_CC;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.Fld.amt.paid.by.Cheque")
	private WebElement Fld_amt_paid_by_Cheque;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.Fld.amt.paid.by.PO")
	private WebElement Fld_amt_paid_by_PO;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.selected.year.in.credit.card.dropDown.Payment.page")
	private WebElement selected_year_in_credit_card_dropDown_Payment_page;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.header.PaymentPage")
	private WebElement header_payment_PaymentPage;
	
	@FindBy(locator = "dw.checkout.shippingandpayment.payment.msg.CC.card.expired")
	private WebElement msg_CC_card_expired;
	
	@FindBy(locator = "dw.checkout.MyAccount.AddAcard.CardName")
	private WebElement AddCard_fld_Name_on_Card_MyAccount;
	
	@FindBy(locator = "dw.checkout.MyAccount.AddAcard.CardNumber")
	private WebElement AddCard_fld_Card_num_MyAccount;
	
	@FindBy(locator = "dw.checkout.MyAccount.AddAcard.ExpMonth")
	private WebElement AddCard_fld_Exp_mnt_MyAccount;
	
	@FindBy(locator = "dw.checkout.MyAccount.AddAcard.ExpYear")
	private WebElement AddCard_fld_Exp_yr_MyAccount;
	
	@FindBy(locator = "dw.checkout.MyAccount.AddAcard.SecurityCode")
	private WebElement AddCard_fld_Sec_code_MyAccount;
	
	@FindBy(locator = "dw.checkout.MyAccount.AddAcard.fName")
	private WebElement AddCard_fld_fName_MyAccount;
	
	@FindBy(locator = "dw.checkout.MyAccount.AddAcard.lName")
	private WebElement AddCard_fld_lName_MyAccount;
	
	@FindBy(locator = "dw.checkout.MyAccount.AddAcard.Addr1")
	private WebElement AddCard_fld_addr1_MyAccount;
	
	@FindBy(locator = "dw.checkout.MyAccount.AddAcard.Addr2")
	private WebElement AddCard_fld_addr2_MyAccount;
	
	@FindBy(locator = "dw.checkout.MyAccount.AddAcard.Country")
	private WebElement AddCard_fld_country_MyAccount;
	
	@FindBy(locator = "dw.checkout.MyAccount.AddAcard.PostalCode")
	private WebElement AddCard_fld_postalCode_MyAccount;
	
	@FindBy(locator = "dw.checkout.MyAccount.AddAcard.City")
	private WebElement AddCard_fld_city_MyAccount;
	
	@FindBy(locator = "dw.checkout.MyAccount.AddAcard.State")
	private WebElement AddCard_fld_state_MyAccount;
	
	@FindBy(locator = "dw.checkout.MyAccount.AddAcard.Phone")
	private WebElement AddCard_fld_phNum_MyAccount;
	
	@FindBy(locator = "dw.checkout.MyAccount.AddAcard.btn.Save")
	private WebElement AddCard_btn_Save_MyAccount;
	
	@FindBy(locator = "dw.checkout.MyAccount.Home.Select.dropDown")
	private WebElement Home_Select_dropDown_MyAccount;
	
	@FindBy(locator = "dw.checkout.header_MyAccountReadingClub_MyAccountPage")
	private WebElement header_MyAccountReadingClub_MyAccountPage;
	
	@FindBy(locator = "dw.checkout.table_MyAccountReadingClub_MyAccountPage")
	private WebElement table_MyAccountReadingClub_MyAccountPage;
	
	@FindBy(locator = "dw.checkout.MyAccount.Home.Select.dropDown.BillingPayment")
	private WebElement Home_Select_dropDown_BillingPayment_MyAccount;
	
	@FindBy(locator = "dw.checkout.MyAccount.Home.Select.dropDown.OrderHistory")
	private WebElement Home_Select_dropDown_OrderHistory_MyAccount;
	
	
	@FindBy(locator = "dw.checkout.MyAccount.Home.Select.dropDown.SignOut")
	private WebElement Home_Select_dropDown_SignOut_MyAccount;
	
	@FindBy(locator = "dw.checkout.MyAccount.Select.AddaCard")
	private WebElement Select_AddaCard_MyAccount;
	
	@FindBy(locator = "dw.checkout.MyAccount.Remove.Saved.card")
	private WebElement Remove_Saved_card_MyAccount;
	
	@FindBy(locator = "dw.checkout.MyAccount.Remove.Saved.card")
	private List<WebElement> sizeRemove_Saved_card_MyAccount;
	
	@FindBy(locator = "dw.checkout.MyAccount.Yes.to.remove.savedCard")
	private WebElement Yes_to_remove_savedCard_MyAccount;
	
	@FindBy(locator = "dw.home.btn.closepopup")
	private WebElement btnCloseinLoginPage;
	
	@FindBy(locator = "dw.checkout.MyAccount.Saved.credit.card")
	private WebElement Saved_credit_card_MyAccount;
	
	@FindBy(locator = "dw.checkout.icon.Home.home.Page")
	private WebElement icon_Home_home_Page;
	
	@FindBy(locator = "dw.checkout.header.SFO.Rewards.page")
	private WebElement header_SFO_Rewards_page;
	
	@FindBy(locator = "dw.checkout.header.YTO.Rewards.page")
	private WebElement header_YTO_Rewards_page;
	
	@FindBy(locator = "dw.checkout.header.TE.Rewards.page")
	private WebElement header_TE_Rewards_page;
	
	@FindBy(locator = "dw.checkout.SFO.subtotal.Rewards.page")
	private WebElement SFO_subtotal_Rewards_page;
	
	@FindBy(locator = "dw.checkout.GST.in.SFO.section.Rewards.page")
	private WebElement GST_in_SFO_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.PST.in.SFO.section.Rewards.page")
	private WebElement PST_in_SFO_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.QST.in.SFO.section.Rewards.page")
	private WebElement QST_in_SFO_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.HST.in.SFO.section.Rewards.page")
	private WebElement HST_in_SFO_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.SFO.Total.Rewards.page")
	private WebElement SFO_Total_Rewards_page;
	
	@FindBy(locator = "dw.checkout.Shipping.Total.Rewards.page")
	private WebElement Shipping_Total_Rewards_page;
	
	@FindBy(locator = "dw.checkout.YTO.subtotal.Rewards.page")
	private WebElement YTO_subtotal_Rewards_page;
	
	@FindBy(locator = "dw.checkout.GST.in.YTO.section.Rewards.page")
	private WebElement GST_in_YTO_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.PST.in.YTO.section.Rewards.page")
	private WebElement PST_in_YTO_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.QST.in.YTO.section.Rewards.page")
	private WebElement QST_in_YTO_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.HST.in.YTO.section.Rewards.page")
	private WebElement HST_in_YTO_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.YTO.Total.Rewards.page")
	private WebElement YTO_Total_Rewards_page;
	
	@FindBy(locator = "dw.checkout.TE.subtotal.Rewards.page")
	private WebElement TE_subtotal_Rewards_page;
	
	@FindBy(locator = "dw.checkout.GST.in.TE.section.Rewards.page")
	private WebElement GST_in_TE_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.PST.in.TE.section.Rewards.page")
	private WebElement PST_in_TE_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.QST.in.TE.section.Rewards.page")
	private WebElement QST_in_TE_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.HST.in.TE.section.Rewards.page")
	private WebElement HST_in_TE_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.TE.Total.Rewards.page")
	private WebElement TE_Total_Rewards_page;
	
	@FindBy(locator = "dw.checkout.fld.Credit.Notes.SFO.section.Rewards.page")
	private WebElement fld_Credit_Notes_SFO_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.btn.APPLY.SFO.section.Rewards.page")
	private WebElement btn_APPLY_SFO_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.btn.EDIT.SFO.section.Rewards.page")
	private WebElement btn_EDIT_SFO_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.btn.EDIT.SFO.section.Rewards.page")
	private List<WebElement> lst_btn_EDIT_SFO_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.btn.EDIT.YTO.section.Rewards.page")
	private List<WebElement> lst_btn_EDIT_YTO_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.btn.EDIT.TE.section.Rewards.page")
	private List<WebElement> lst_btn_EDIT_TE_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.rewardsandcoupons.btn.ship.apply")
    private WebElement btn_APPLY_Shipping_section_Rewards_page;
	
    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.ship.apply")
    private List<WebElement> list_btn_APPLY_Shipping_section_Rewards_page;
    
    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.ship.edit")
    private WebElement btn_EDIT_Shipping_section_Rewards_page;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.ship.edit")
    private List<WebElement> list_btn_EDIT_Shipping_section_Rewards_page;
    
    @FindBy(locator = "dw.checkout.payment.header.BlueBar.StudentClub.PostAmount.items.payment")
    private WebElement header_BlueBar_StudentClub_PostAmount_items_payment;

    @FindBy(locator = "dw.checkout.payment.header.BlueBar.TeacherCatalogues.PostAmount.items.payment")
    private WebElement header_BlueBar_TeacherCatalogues_PostAmount_items_payment;

	@FindBy(locator = "dw.checkout.fld.Bonus.Bank.YTO.section.Rewards.page")
	private WebElement fld_Bonus_Bank_YTO_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.btn.Continue.Checkout.Rewards.page")
	private WebElement btn_Continue_Checkout_Rewards_page;
	
	@FindBy(locator = "dw.checkout.section.SFO.Payments.page")
	private WebElement section_SFO_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.SFO.subtotal.Payments.page")
	private WebElement fld_SFO_subtotal_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.GST.in.SFO.section.Payments.page")
	private WebElement fld_GST_in_SFO_section_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.PST.in.SFO.section.Payments.page")
	private WebElement fld_PST_in_SFO_section_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.QST.in.SFO.section.Payments.page")
	private WebElement fld_QST_in_SFO_section_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.HST.in.SFO.section.Payments.page")
	private WebElement fld_HST_in_SFO_section_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.CreditNotes.in.SFO.Payments.page")
	private WebElement fld_CreditNotes_in_SFO_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.SFO.Total.Payments.page")
	private WebElement fld_SFO_Total_Payments_page;
	
	@FindBy(locator = "dw.checkout.section.YTO.Payments.page")
	private WebElement section_YTO_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.YTO.subtotal.Payments.page")
	private WebElement fld_YTO_subtotal_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.GST.in.YTO.section.Payments.page")
	private WebElement fld_GST_in_YTO_section_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.PST.in.YTO.section.Payments.page")
	private WebElement fld_PST_in_YTO_section_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.QST.in.YTO.section.Payments.page")
	private WebElement fld_QST_in_YTO_section_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.HST.in.YTO.section.Payments.page")
	private WebElement fld_HST_in_YTO_section_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.BonusBank.in.YTO.Payments.page")
	private WebElement fld_BonusBank_in_YTO_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.CreditNotes.in.YTO.Payments.page")
	private WebElement fld_CreditNotes_in_YTO_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.YTO.Total.Payments.page")
	private WebElement fld_YTO_Total_Payments_page;
	
	@FindBy(locator = "dw.checkout.section.TE.Payments.page")
	private WebElement section_TE_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.TE.subtotal.Payments.page")
	private WebElement fld_TE_subtotal_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.GST.in.TE.section.Payments.page")
	private WebElement fld_GST_in_TE_section_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.PST.in.TE.section.Payments.page")
	private WebElement fld_PST_in_TE_section_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.QST.in.TE.section.Payments.page")
	private WebElement fld_QST_in_TE_section_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.HST.in.TE.section.Payments.page")
	private WebElement fld_HST_in_TE_section_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.BonusBank.in.TE.Payments.page")
	private WebElement fld_BonusBank_in_TE_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.CreditNotes.in.TE.Payments.page")
	private WebElement fld_CreditNotes_in_TE_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.TE.Total.Payments.page")
	private WebElement fld_TE_Total_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.Shipping.Handling.val.BlueBar.Payments.page")
	private WebElement fld_Shipping_Handling_val_BlueBar_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.Shipping.Handling.subtotal.Payments.page")
	private WebElement fld_Shipping_Handling_subtotal_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.GST.in.Shipping.Handling.Payments.page")
	private WebElement fld_GST_in_Shipping_Handling_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.PST.in.Shipping.Handling.Payments.page")
	private WebElement fld_PST_in_Shipping_Handling_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.QST.in.Shipping.Handling.Payments.page")
	private WebElement fld_QST_in_Shipping_Handling_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.HST.in.Shipping.Handling.Payments.page")
	private WebElement fld_HST_in_Shipping_Handling_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.Bonus.Bank.in.Shipping.Handling.Payments.page")
	private WebElement fld_Bonus_Bank_in_Shipping_Handling_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.CreditNotes.in.Shipping.Handling.Payments.page")
	private WebElement fld_CreditNotes_in_Shipping_Handling_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.Shipping.Handling.Total.Payments.page")
	private WebElement fld_Shipping_Handling_Total_Payments_page;
	
	@FindBy(locator = "dw.checkout.fld.Order.Total.Payments.page")
	private WebElement fld_Order_Total_Payments_page;
	
	@FindBy(locator = "dw.checkout.section.SFO.header.Confirm.Submit.page")
	private WebElement section_SFO_header_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.Students.section.SFO.Confirm.Submit.page")
	private List<WebElement> Students_section_SFO_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.student1.Table1.SFO.Confirm.Submit.page")
	private WebElement student1_Table1_SFO_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.item1.price.Table1.SFO.Confirm.Submit.page")
	private WebElement item1_price_Table1_SFO_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.item2.price.Table1.SFO.Confirm.Submit.page")
	private WebElement item2_price_Table1_SFO_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.item1.QTY.Table1.SFO.Confirm.Submit.page")
	private WebElement item1_QTY_Table1_SFO_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.item2.QTY.Table1.SFO.Confirm.Submit.page")
	private WebElement item2_QTY_Table1_SFO_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.Student1.subtotal.Table1.SFO.Confirm.Submit.page")
	private WebElement Student1_subtotal_Table1_SFO_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.GST.Table1.SFO.section.Confirm.Submit.page")
	private WebElement GST_Table1_SFO_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.PST.Table1.SFO.section.Confirm.Submit.page")
	private WebElement PST_Table1_SFO_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.QST.Table1.SFO.section.Confirm.Submit.page")
	private WebElement QST_Table1_SFO_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.HST.Table1.SFO.section.Confirm.Submit.page")
	private WebElement HST_Table1_SFO_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.Student1.Total.Table1.SFO.section.Confirm.Submit.page")
	private WebElement Student1_Total_Table1_SFO_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.CreditNotes.SFO.section.Confirm.Submit.page")
	private WebElement CreditNotes_SFO_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.SFO.Total.Confirm.Submit.page")
	private WebElement SFO_Total_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.student2.Table2.SFO.Confirm.Submit.page")
	private WebElement student2_Table2_SFO_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.item1.price.Table2.SFO.Confirm.Submit.page")
	private WebElement item1_price_Table2_SFO_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.item1.QTY.Table2.SFO.Confirm.Submit.page")
	private WebElement item1_QTY_Table2_SFO_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.Student1.subtotal.Table2.SFO.Confirm.Submit.page")
	private WebElement Student1_subtotal_Table2_SFO_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.GST.Table2.SFO.section.Confirm.Submit.page")
	private WebElement GST_Table2_SFO_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.PST.Table2.SFO.section.Confirm.Submit.page")
	private WebElement PST_Table2_SFO_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.QST.Table2.SFO.section.Confirm.Submit.page")
	private WebElement QST_Table2_SFO_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.HST.Table2.SFO.section.Confirm.Submit.page")
	private WebElement HST_Table2_SFO_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.Student1.Total.Table2.SFO.section.Confirm.Submit.page")
	private WebElement Student1_Total_Table2_SFO_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.Shipping.value.BlueBar.Confirm.Submit.page")
	private WebElement Shipping_value_BlueBar_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.Shipping.Subtotal.Confirm.Submit.page")
	private WebElement Shipping_Subtotal_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.GST.Shipping.section.Confirm.Submit.page")
	private WebElement GST_Shipping_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.PST.Shipping.section.Confirm.Submit.page")
	private WebElement PST_Shipping_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.QST.Shipping.section.Confirm.Submit.page")
	private WebElement QST_Shipping_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.HST.Shipping.section.Confirm.Submit.page")
	private WebElement HST_Shipping_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.BonusBank.Shipping.section.Confirm.Submit.page")
	private WebElement BonusBank_Shipping_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.CreditNotes.Shipping.section.Confirm.Submit.page")
	private WebElement CreditNotes_Shipping_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.Shipping.Total.Confirm.Submit.page")
	private WebElement Shipping_Total_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.SOO.Total.OrderSummary.section.Confirm.Submit.page")
	private WebElement SOO_Total_OrderSummary_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.SFO.Total.OrderSummary.section.Confirm.Submit.page")
	private WebElement SFO_Total_OrderSummary_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.YTO.Total.OrderSummary.section.Confirm.Submit.page")
	private WebElement YTO_Total_OrderSummary_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.TE.Total.OrderSummary.section.Confirm.Submit.page")
	private WebElement TE_Total_OrderSummary_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.POP.Total.OrderSummary.section.Confirm.Submit.page")
	private List<WebElement> POP_Total_OrderSummary_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.sfoyto.pop.Total.OrderSummary.section.Confirm.Submit.page")
	private List<WebElement> SFOYTOPOP_Total_OrderSummary_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.Shipping.Handling.Total.OrderSummary.section.Confirm.Submit.page")
	private WebElement Shipping_Handling_Total_OrderSummary_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.ORDER.TOTAL.OrderSummary.section.Confirm.Submit.page")
	private WebElement ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.section.YTO.header.Confirm.Submit.page")
	private WebElement section_YTO_header_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.item1.price.YTO.Confirm.Submit.page")
	private WebElement item1_price_YTO_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.item2.price.YTO.Confirm.Submit.page")
	private WebElement item2_price_YTO_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.item1.QTY.YTO.Confirm.Submit.page")
	private WebElement item1_QTY_YTO_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.item2.QTY.YTO.Confirm.Submit.page")
	private WebElement item2_QTY_YTO_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.YTO.Subtotal.Confirm.Submit.page")
	private WebElement YTO_Subtotal_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.GST.YTO.section.Confirm.Submit.page")
	private WebElement GST_YTO_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.PST.YTO.section.Confirm.Submit.page")
	private WebElement PST_YTO_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.QST.YTO.section.Confirm.Submit.page")
	private WebElement QST_YTO_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.HST.YTO.section.Confirm.Submit.page")
	private WebElement HST_YTO_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.BonusBank.YTO.section.Confirm.Submit.page")
	private WebElement BonusBank_YTO_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.CreditNotes.YTO.section.Confirm.Submit.page")
	private WebElement CreditNotes_YTO_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.YTO.Total.Confirm.Submit.page")
	private WebElement YTO_Total_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.section.TE.header.Confirm.Submit.page")
	private WebElement section_TE_header_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.item1.price.TE.Confirm.Submit.page")
	private WebElement item1_price_TE_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.item2.price.TE.Confirm.Submit.page")
	private WebElement item2_price_TE_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.item1.QTY.TE.Confirm.Submit.page")
	private WebElement item1_QTY_TE_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.item2.QTY.TE.Confirm.Submit.page")
	private WebElement item2_QTY_TE_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.TE.Subtotal.Confirm.Submit.page")
	private WebElement TE_Subtotal_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.GST.TE.section.Confirm.Submit.page")
	private WebElement GST_TE_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.PST.TE.section.Confirm.Submit.page")
	private WebElement PST_TE_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.QST.TE.section.Confirm.Submit.page")
	private WebElement QST_TE_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.HST.TE.section.Confirm.Submit.page")
	private WebElement HST_TE_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.BonusBank.TE.section.Confirm.Submit.page")
	private WebElement BonusBank_TE_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.CreditNotes.TE.section.Confirm.Submit.page")
	private WebElement CreditNotes_TE_section_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.TE.Total.Confirm.Submit.page")
	private WebElement TE_Total_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.btn.SUBMIT.Confirm.Submit.page")
	private WebElement btn_SUBMIT_Confirm_Submit_page;
	
	@FindBy(locator = "dw.checkout.fld.Credit.Notes.YTO.section.Rewards.page")
	private WebElement fld_Credit_Notes_YTO_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.btn.APPLY.YTO.section.Rewards.page")
	private WebElement btn_APPLY_YTO_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.btn.EDIT.YTO.section.Rewards.page")
	private WebElement btn_EDIT_YTO_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.fld.Bonus.Bank.TE.section.Rewards.page")
	private WebElement fld_Bonus_Bank_TE_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.fld.Credit.Notes.TE.section.Rewards.page")
	private WebElement fld_Credit_Notes_TE_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.btn.APPLY.TE.section.Rewards.page")
	private WebElement btn_APPLY_TE_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.btn.EDIT.TE.section.Rewards.page")
	private WebElement btn_EDIT_TE_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.fld.SaveThisCard.BillingInfo.Payment.page")
	private WebElement fld_SaveThisCard_BillingInfo_Payment_page;
	
	@FindBy(locator = "dw.checkout.checkBox.SaveThisCard.BillingInfo.Payment.page")
	private WebElement checkBox_SaveThisCard_BillingInfo_Payment_page;
	
	@FindBy(locator = "dw.checkout.btn.Cancel.BillingInfo.Payment.page")
	private WebElement btn_Cancel_BillingInfo_Payment_page;
	
	@FindBy(locator = "dw.checkout.btn.Save.BillingInfo.Payment.page")
	private WebElement btn_Save_BillingInfo_Payment_page;
	
	@FindBy(locator = "dw.checkout.fld.Security.code.CreditCard.Payment.page")
	private WebElement fld_Security_code_CreditCard_Payment_page;
	
	@FindBy(locator = "dw.checkout.hyperlink.EDIT.SavedCard.Payment.page")
	private WebElement hyperlink_EDIT_SavedCard_Payment_page;
	
	@FindBy(locator = "dw.checkout.payment.Total.Amount.Owing")
	private WebElement Total_Amount_Owing_Payment;
	
	@FindBy(locator = "dw.checkout.mnth.list.ExpirationDate.CreditCard.Payment.page")
	private List<WebElement> mnth_list_ExpirationDate_CreditCard_Payment_page;
	
	@FindBy(locator = "dw.checkout.year.list.ExpirationDate.CreditCard.Payment.page")
	private List<WebElement> year_list_ExpirationDate_CreditCard_Payment_page;
	
	@FindBy(locator = "dw.checkout.section.Billing.Info.Payment.page")
	private WebElement section_Billing_Info_Payment_page;
	
	@FindBy(locator = "dw.checkout.confirmpages.payment.nobalancesection")
	private WebElement section_payment_nobalance_confirmpages;
	
	
	public WebElement headerConfirmSubmitIsActive() {
		return headerConfirmSubmitIsActive;
	}
	
	public WebElement getTxtNameOnCard() {
		return txtNameOnCard;
	}
	
	public WebElement drpMonth() {
		return drpMonth;
	}
	
	public WebElement selectMonth() {
		return selectMonth;
	}
	public WebElement selectYear() {
		return selectYear;
	}
	
	public WebElement drpYear() {
		return drpYear;
	}
	
	public WebElement getTxtCardNumber() {
		return txtCardNumber;
	}
	
	public WebElement Fld_amt_paid_by_CC() {
		return Fld_amt_paid_by_CC;
	}
	
	public WebElement Fld_amt_paid_by_Cheque() {
		return Fld_amt_paid_by_Cheque;
	}
	
	public WebElement Fld_amt_paid_by_PO() {
		return Fld_amt_paid_by_PO;
	}
	
	public WebElement selected_year_in_credit_card_dropDown_Payment_page() {
		return selected_year_in_credit_card_dropDown_Payment_page;
	}
	
	public WebElement header_payment_PaymentPage() {
		return header_payment_PaymentPage;
	}
	
	public WebElement msg_CC_card_expired() {
		return msg_CC_card_expired;
	}
	
	public WebElement getDrpCardExpiryMonth() {
		return drpCardExpiryMonth;
	}
	
	public WebElement getDrpCardExpiryYear() {
		return drpCardExpiryYear;
	}
	
	public WebElement getTxtCardSecurityCode() {
		return txtCardSecurityCode;
	}
	
	public WebElement fld_CreditCard_image_Payment_page() {
		return fld_CreditCard_image_Payment_page;
	}
	
	public WebElement fld_default_country_Payment_page() {
		return fld_default_country_Payment_page;
	}
	
	public WebElement fld_country_US_Payment_page() {
		return fld_country_US_Payment_page;
	}
	
	public WebElement label_Postal_Code_and_ZIP_Payment_page() {
		return label_Postal_Code_and_ZIP_Payment_page;
	}
	
	public WebElement label_Province_and_STATE_Payment_page() {
		return label_Province_and_STATE_Payment_page;
	}
	
	public WebElement getTxtBillingFirstName() {
		return txtBillingFirstName;
	}
	
	public WebElement getTxtBillingLastName() {
		return txtBillingLastName;
	}

	public WebElement getTxtBillingAddressOne() {
		return txtBillingAddressOne;
	}
	
	public WebElement txtshippinginfoAddressOne() {
		return txtshippinginfoAddressOne;
	}
	
	public WebElement txtshippinginfoAddressTwo() {
		return txtshippinginfoAddressTwo;
	}
	
	public WebElement txtshippinginfoZip() {
		return txtshippinginfoZip;
	}
	
	public WebElement txtshippinginfoCity() {
		return txtshippinginfoCity;
	}

	public WebElement getTxtBillingAddressTwo() {
		return txtBillingAddressTwo;
	}
	
	public WebElement getTxtBillingZip() {
		return txtBillingZip;
	}

	public WebElement getTxtBillingCity() {
		return txtBillingCity;
	}
	public WebElement getTxtBillingPhoneNumber() {
		return txtBillingPhoneNumber;
	}
	
	public WebElement popUp_error_PhoneNumber_fld_Payment_page() {
		return popUp_error_PhoneNumber_fld_Payment_page;
	}
	
	public WebElement fld_selection_Year_Payment_page() {
		return fld_selection_Year_Payment_page;
	}
	
	public WebElement fld_selection_Month_Payment_page() {
		return fld_selection_Month_Payment_page;
	}
	
	public WebElement getDrpBillingState() {
		return drpBillingState;
	}
	
	public WebElement btnSubmitInSubmitPage() {
		return btnSubmitInSubmitPage;
	}
	
	public WebElement btn_close_order_Confirmation_popup() {
		return btn_close_order_Confirmation_popup;
	}
	
	public WebElement fld_SaveThisCard_BillingInfo_Payment_page() {
		return fld_SaveThisCard_BillingInfo_Payment_page;
	}
	
	public WebElement checkBox_SaveThisCard_BillingInfo_Payment_page() {
		return checkBox_SaveThisCard_BillingInfo_Payment_page;
	}
	
	public WebElement btn_Cancel_BillingInfo_Payment_page() {
		return btn_Cancel_BillingInfo_Payment_page;
	}
	
	public WebElement btn_Save_BillingInfo_Payment_page() {
		return btn_Save_BillingInfo_Payment_page;
	}
	
	public WebElement fld_Security_code_CreditCard_Payment_page() {
		return fld_Security_code_CreditCard_Payment_page;
	}
	
	public WebElement hyperlink_EDIT_SavedCard_Payment_page() {
		return hyperlink_EDIT_SavedCard_Payment_page;
	}
	
	public WebElement Total_Amount_Owing_Payment() {
		return Total_Amount_Owing_Payment;
	}
	
	public List<WebElement> mnth_list_ExpirationDate_CreditCard_Payment_page() {
		return mnth_list_ExpirationDate_CreditCard_Payment_page;
	}
	
	public List<WebElement> year_list_ExpirationDate_CreditCard_Payment_page() {
		return year_list_ExpirationDate_CreditCard_Payment_page;
	}
	
	public WebElement section_Billing_Info_Payment_page() {
		return section_Billing_Info_Payment_page;
	}
	
	public WebElement headerOrderSuccessfulMessage() {
		return headerOrderSuccessfulMessage;
	}
	
	public WebElement AddCard_fld_Name_on_Card_MyAccount() {
		return AddCard_fld_Name_on_Card_MyAccount;
	}
	
	public WebElement AddCard_fld_Card_num_MyAccount() {
		return AddCard_fld_Card_num_MyAccount;
	}
	
	public WebElement AddCard_fld_Exp_mnt_MyAccount() {
		return AddCard_fld_Exp_mnt_MyAccount;
	}
	
	public WebElement AddCard_fld_yr_mnt_MyAccount() {
		return AddCard_fld_Exp_yr_MyAccount;
	}
	
	public WebElement AddCard_fld_Sec_code_MyAccount() {
		return AddCard_fld_Sec_code_MyAccount;
	}
	
	public WebElement AddCard_fld_fName_MyAccount() {
		return AddCard_fld_fName_MyAccount;
	}
	
	public WebElement AddCard_fld_lName_MyAccount() {
		return AddCard_fld_lName_MyAccount;
	}
	
	public WebElement AddCard_fld_addr1_MyAccount() {
		return AddCard_fld_addr1_MyAccount;
	}
	
	public WebElement AddCard_fld_addr2_MyAccount() {
		return AddCard_fld_addr2_MyAccount;
	}
	
	public WebElement AddCard_fld_country_MyAccount() {
		return AddCard_fld_country_MyAccount;
	}
	
	public WebElement AddCard_fld_postalCode_MyAccount() {
		return AddCard_fld_postalCode_MyAccount;
	}
	
	public WebElement AddCard_fld_city_MyAccount() {
		return AddCard_fld_city_MyAccount;
	}
	
	public WebElement AddCard_fld_state_MyAccount() {
		return AddCard_fld_state_MyAccount;
	}
	
	public WebElement AddCard_fld_phNum_MyAccount() {
		return AddCard_fld_phNum_MyAccount;
	}
	
	public WebElement AddCard_btn_Save_MyAccount() {
		return AddCard_btn_Save_MyAccount;
	}
	
	public WebElement Home_Select_dropDown_MyAccount() {
		return Home_Select_dropDown_MyAccount;
	}
	
	public WebElement header_MyAccountReadingClub_MyAccountPage() {
		return header_MyAccountReadingClub_MyAccountPage;
	}
	
	public WebElement table_MyAccountReadingClub_MyAccountPage() {
		return table_MyAccountReadingClub_MyAccountPage;
	}
	
	public WebElement Home_Select_dropDown_BillingPayment_MyAccount() {
		return Home_Select_dropDown_BillingPayment_MyAccount;
	}
	
	public WebElement Home_Select_dropDown_OrderHistory_MyAccount() {
		return Home_Select_dropDown_OrderHistory_MyAccount;
	}
	
	public WebElement Home_Select_dropDown_SignOut_MyAccount() {
		return Home_Select_dropDown_SignOut_MyAccount;
	}
	
	public WebElement Select_AddaCard_MyAccount() {
		return Select_AddaCard_MyAccount;
	}
	
	public WebElement Remove_Saved_card_MyAccount() {
		return Remove_Saved_card_MyAccount;
	}
	
	public List<WebElement> sizeRemove_Saved_card_MyAccount() {
		return sizeRemove_Saved_card_MyAccount;
	}
	
	public WebElement Yes_to_remove_savedCard_MyAccount() {
		return Yes_to_remove_savedCard_MyAccount;
	}
	
	public WebElement btnCloseinLoginPage() {
		return btnCloseinLoginPage;
	}
	
	public WebElement Saved_credit_card_MyAccount() {
		return Saved_credit_card_MyAccount;
	}
	
	public WebElement icon_Home_home_Page() {
		return icon_Home_home_Page;
	}
	
	
	public List<WebElement> sizebtnSubmitInSubmitPage(){
		return sizebtnSubmitInSubmitPage;
	}
	
	public WebElement getsection_payment_nobalance_confirmpages(){
		return section_payment_nobalance_confirmpages;
	}
	
	
	@Override
	protected void openPage() {
		// TODO Auto-generated method stub
		
	}
	
	public WebElement header_SFO_Rewards_page() {
        return header_SFO_Rewards_page;
    }
	
	public WebElement header_YTO_Rewards_page() {
        return header_YTO_Rewards_page;
    }
	
	public WebElement header_TE_Rewards_page() {
        return header_TE_Rewards_page;
    }
	
	public WebElement SFO_subtotal_Rewards_page() {
        return SFO_subtotal_Rewards_page;
    }
	
	public WebElement GST_in_SFO_section_Rewards_page() {
        return GST_in_SFO_section_Rewards_page;
    }
	
	public WebElement PST_in_SFO_section_Rewards_page() {
        return PST_in_SFO_section_Rewards_page;
    }
	
	public WebElement QST_in_SFO_section_Rewards_page() {
        return QST_in_SFO_section_Rewards_page;
    }
	
	public WebElement HST_in_SFO_section_Rewards_page() {
        return HST_in_SFO_section_Rewards_page;
    }
	
	public WebElement SFO_Total_Rewards_page() {
        return SFO_Total_Rewards_page;
    }
	
	public WebElement Shipping_Total_Rewards_page() {
        return Shipping_Total_Rewards_page;
    }
	
	public WebElement YTO_subtotal_Rewards_page() {
        return YTO_subtotal_Rewards_page;
    }
	
	public WebElement GST_in_YTO_section_Rewards_page() {
        return GST_in_YTO_section_Rewards_page;
    }
	
	public WebElement PST_in_YTO_section_Rewards_page() {
        return PST_in_YTO_section_Rewards_page;
    }
	
	public WebElement QST_in_YTO_section_Rewards_page() {
        return QST_in_YTO_section_Rewards_page;
    }
	
	public WebElement HST_in_YTO_section_Rewards_page() {
        return HST_in_YTO_section_Rewards_page;
    }
	
	public WebElement YTO_Total_Rewards_page() {
        return YTO_Total_Rewards_page;
    }
	
	public WebElement TE_subtotal_Rewards_page() {
        return TE_subtotal_Rewards_page;
    }
	
	public WebElement GST_in_TE_section_Rewards_page() {
        return GST_in_TE_section_Rewards_page;
    }
	
	public WebElement PST_in_TE_section_Rewards_page() {
        return PST_in_TE_section_Rewards_page;
    }
	
	public WebElement QST_in_TE_section_Rewards_page() {
        return QST_in_TE_section_Rewards_page;
    }
	
	public WebElement HST_in_TE_section_Rewards_page() {
        return HST_in_TE_section_Rewards_page;
    }
	
	public WebElement TE_Total_Rewards_page() {
        return TE_Total_Rewards_page;
    }
	
	public WebElement fld_Credit_Notes_SFO_section_Rewards_page() {
        return fld_Credit_Notes_SFO_section_Rewards_page;
    }
	
	public WebElement btn_APPLY_SFO_section_Rewards_page() {
        return btn_APPLY_SFO_section_Rewards_page;
    }
	
	public WebElement btn_EDIT_SFO_section_Rewards_page() {
        return btn_EDIT_SFO_section_Rewards_page;
    }
	
	public List<WebElement> lst_btn_EDIT_SFO_section_Rewards_page() {
        return lst_btn_EDIT_SFO_section_Rewards_page;
    }
	
	public WebElement fld_Bonus_Bank_YTO_section_Rewards_page() {
        return fld_Bonus_Bank_YTO_section_Rewards_page;
    }
	
	public WebElement fld_Credit_Notes_YTO_section_Rewards_page() {
        return fld_Credit_Notes_YTO_section_Rewards_page;
    }
	
	public WebElement btn_APPLY_YTO_section_Rewards_page() {
        return btn_APPLY_YTO_section_Rewards_page;
    }
	
	public WebElement btn_EDIT_YTO_section_Rewards_page() {
        return btn_EDIT_YTO_section_Rewards_page;
    }
	
	public List<WebElement> lst_btn_EDIT_YTO_section_Rewards_page() {
        return lst_btn_EDIT_YTO_section_Rewards_page;
    }
	
	public WebElement fld_Bonus_Bank_TE_section_Rewards_page() {
        return fld_Bonus_Bank_TE_section_Rewards_page;
    }
	
	public WebElement fld_Credit_Notes_TE_section_Rewards_page() {
        return fld_Credit_Notes_TE_section_Rewards_page;
    }
	
	public WebElement btn_APPLY_TE_section_Rewards_page() {
        return btn_APPLY_TE_section_Rewards_page;
    }
	
	public WebElement btn_EDIT_TE_section_Rewards_page() {
        return btn_EDIT_TE_section_Rewards_page;
    }
	
	public List<WebElement> lst_btn_EDIT_TE_section_Rewards_page() {
        return lst_btn_EDIT_TE_section_Rewards_page;
    }
	
	public WebElement btn_Continue_Checkout_Rewards_page() {
        return btn_Continue_Checkout_Rewards_page;
    }
	
	public WebElement section_SFO_Payments_page() {
        return section_SFO_Payments_page;
    }
	
	public WebElement fld_SFO_subtotal_Payments_page() {
        return fld_SFO_subtotal_Payments_page;
    }
	
	public WebElement fld_GST_in_SFO_section_Payments_page() {
        return fld_GST_in_SFO_section_Payments_page;
    }
	
	public WebElement fld_PST_in_SFO_section_Payments_page() {
        return fld_PST_in_SFO_section_Payments_page;
    }
	
	public WebElement fld_QST_in_SFO_section_Payments_page() {
        return fld_QST_in_SFO_section_Payments_page;
    }
	
	public WebElement fld_HST_in_SFO_section_Payments_page() {
        return fld_HST_in_SFO_section_Payments_page;
    }
	
	public WebElement fld_CreditNotes_in_SFO_Payments_page() {
        return fld_CreditNotes_in_SFO_Payments_page;
    }
	
	public WebElement fld_SFO_Total_Payments_page() {
        return fld_SFO_Total_Payments_page;
    }
	
	public WebElement section_YTO_Payments_page() {
        return section_YTO_Payments_page;
    }
	
	public WebElement fld_YTO_subtotal_Payments_page() {
        return fld_YTO_subtotal_Payments_page;
    }
	
	public WebElement fld_GST_in_YTO_section_Payments_page() {
        return fld_GST_in_YTO_section_Payments_page;
    }
	
	public WebElement fld_PST_in_YTO_section_Payments_page() {
        return fld_PST_in_YTO_section_Payments_page;
    }
	
	public WebElement fld_QST_in_YTO_section_Payments_page() {
        return fld_QST_in_YTO_section_Payments_page;
    }
	
	public WebElement fld_HST_in_YTO_section_Payments_page() {
        return fld_HST_in_YTO_section_Payments_page;
    }
	
	public WebElement fld_BonusBank_in_YTO_Payments_page() {
        return fld_BonusBank_in_YTO_Payments_page;
    }
	
	public WebElement fld_CreditNotes_in_YTO_Payments_page() {
        return fld_CreditNotes_in_YTO_Payments_page;
    }
	
	public WebElement fld_YTO_Total_Payments_page() {
        return fld_YTO_Total_Payments_page;
    }
	
	public WebElement section_TE_Payments_page() {
        return section_TE_Payments_page;
    }
	
	public WebElement fld_TE_subtotal_Payments_page() {
        return fld_TE_subtotal_Payments_page;
    }
	
	public WebElement fld_GST_in_TE_section_Payments_page() {
        return fld_GST_in_TE_section_Payments_page;
    }
	
	public WebElement fld_PST_in_TE_section_Payments_page() {
        return fld_PST_in_TE_section_Payments_page;
    }
	
	public WebElement fld_QST_in_TE_section_Payments_page() {
        return fld_QST_in_TE_section_Payments_page;
    }
	
	public WebElement fld_HST_in_TE_section_Payments_page() {
        return fld_HST_in_TE_section_Payments_page;
    }
	
	public WebElement fld_BonusBank_in_TE_Payments_page() {
        return fld_BonusBank_in_TE_Payments_page;
    }
	
	public WebElement fld_CreditNotes_in_TE_Payments_page() {
        return fld_CreditNotes_in_TE_Payments_page;
    }
	
	public WebElement fld_TE_Total_Payments_page() {
        return fld_TE_Total_Payments_page;
    }
	
	public WebElement fld_Shipping_Handling_val_BlueBar_Payments_page() {
        return fld_Shipping_Handling_val_BlueBar_Payments_page;
    }
	
	public WebElement fld_Shipping_Handling_subtotal_Payments_page() {
        return fld_Shipping_Handling_subtotal_Payments_page;
    }
	
	public WebElement fld_GST_in_Shipping_Handling_Payments_page() {
        return fld_GST_in_Shipping_Handling_Payments_page;
    }
	
	public WebElement fld_PST_in_Shipping_Handling_Payments_page() {
        return fld_PST_in_Shipping_Handling_Payments_page;
    }
	
	public WebElement fld_QST_in_Shipping_Handling_Payments_page() {
        return fld_QST_in_Shipping_Handling_Payments_page;
    }
	
	public WebElement fld_HST_in_Shipping_Handling_Payments_page() {
        return fld_HST_in_Shipping_Handling_Payments_page;
    }
	
	public WebElement fld_Bonus_Bank_in_Shipping_Handling_Payments_page() {
        return fld_Bonus_Bank_in_Shipping_Handling_Payments_page;
    }
	
	public WebElement fld_CreditNotes_in_Shipping_Handling_Payments_page() {
        return fld_CreditNotes_in_Shipping_Handling_Payments_page;
    }
	
	public WebElement fld_Shipping_Handling_Total_Payments_page() {
        return fld_Shipping_Handling_Total_Payments_page;
    }
	
	public WebElement fld_Order_Total_Payments_page() {
        return fld_Order_Total_Payments_page;
    }
	
	public WebElement section_SFO_header_Confirm_Submit_page() {
        return section_SFO_header_Confirm_Submit_page;
    }
	
	public List<WebElement> Students_section_SFO_Confirm_Submit_page() {
        return Students_section_SFO_Confirm_Submit_page;
    }
	
	public WebElement student1_Table1_SFO_Confirm_Submit_page() {
        return student1_Table1_SFO_Confirm_Submit_page;
    }
	
	public WebElement item1_price_Table1_SFO_Confirm_Submit_page() {
        return item1_price_Table1_SFO_Confirm_Submit_page;
    }
	
	public WebElement item2_price_Table1_SFO_Confirm_Submit_page() {
        return item2_price_Table1_SFO_Confirm_Submit_page;
    }
	
	public WebElement item1_QTY_Table1_SFO_Confirm_Submit_page() {
        return item1_QTY_Table1_SFO_Confirm_Submit_page;
    }
	
	public WebElement item2_QTY_Table1_SFO_Confirm_Submit_page() {
        return item2_QTY_Table1_SFO_Confirm_Submit_page;
    }
	
	public WebElement Student1_subtotal_Table1_SFO_Confirm_Submit_page() {
        return Student1_subtotal_Table1_SFO_Confirm_Submit_page;
    }
	
	public WebElement GST_Table1_SFO_section_Confirm_Submit_page() {
        return GST_Table1_SFO_section_Confirm_Submit_page;
    }
	
	public WebElement PST_Table1_SFO_section_Confirm_Submit_page() {
        return PST_Table1_SFO_section_Confirm_Submit_page;
    }
	
	public WebElement QST_Table1_SFO_section_Confirm_Submit_page() {
        return QST_Table1_SFO_section_Confirm_Submit_page;
    }
	
	public WebElement HST_Table1_SFO_section_Confirm_Submit_page() {
        return HST_Table1_SFO_section_Confirm_Submit_page;
    }
	
	public WebElement Student1_Total_Table1_SFO_section_Confirm_Submit_page() {
        return Student1_Total_Table1_SFO_section_Confirm_Submit_page;
    }
	
	public WebElement CreditNotes_SFO_section_Confirm_Submit_page() {
        return CreditNotes_SFO_section_Confirm_Submit_page;
    }
	
	public WebElement SFO_Total_Confirm_Submit_page() {
        return SFO_Total_Confirm_Submit_page;
    }
	
	public WebElement student2_Table2_SFO_Confirm_Submit_page() {
        return student2_Table2_SFO_Confirm_Submit_page;
    }
	
	public WebElement item1_price_Table2_SFO_Confirm_Submit_page() {
        return item1_price_Table2_SFO_Confirm_Submit_page;
    }
	
	public WebElement item1_QTY_Table2_SFO_Confirm_Submit_page() {
        return item1_QTY_Table2_SFO_Confirm_Submit_page;
    }
	
	public WebElement Student1_subtotal_Table2_SFO_Confirm_Submit_page() {
        return Student1_subtotal_Table2_SFO_Confirm_Submit_page;
    }
	
	public WebElement GST_Table2_SFO_section_Confirm_Submit_page() {
        return GST_Table2_SFO_section_Confirm_Submit_page;
    }
	
	public WebElement PST_Table2_SFO_section_Confirm_Submit_page() {
        return PST_Table2_SFO_section_Confirm_Submit_page;
    }
	
	public WebElement QST_Table2_SFO_section_Confirm_Submit_page() {
        return QST_Table2_SFO_section_Confirm_Submit_page;
    }
	
	public WebElement HST_Table2_SFO_section_Confirm_Submit_page() {
        return HST_Table2_SFO_section_Confirm_Submit_page;
    }
	
	public WebElement Student1_Total_Table2_SFO_section_Confirm_Submit_page() {
        return Student1_Total_Table2_SFO_section_Confirm_Submit_page;
    }
	
	public WebElement Shipping_value_BlueBar_Confirm_Submit_page() {
        return Shipping_value_BlueBar_Confirm_Submit_page;
    }
	
	public WebElement Shipping_Subtotal_Confirm_Submit_page() {
        return Shipping_Subtotal_Confirm_Submit_page;
    }
	
	public WebElement GST_Shipping_section_Confirm_Submit_page() {
        return GST_Shipping_section_Confirm_Submit_page;
    }
	
	public WebElement PST_Shipping_section_Confirm_Submit_page() {
        return PST_Shipping_section_Confirm_Submit_page;
    }
	
	public WebElement QST_Shipping_section_Confirm_Submit_page() {
        return QST_Shipping_section_Confirm_Submit_page;
    }
	
	public WebElement HST_Shipping_section_Confirm_Submit_page() {
        return HST_Shipping_section_Confirm_Submit_page;
    }
	
	public WebElement BonusBank_Shipping_section_Confirm_Submit_page() {
        return BonusBank_Shipping_section_Confirm_Submit_page;
    }
	
	public WebElement CreditNotes_Shipping_section_Confirm_Submit_page() {
        return CreditNotes_Shipping_section_Confirm_Submit_page;
    }
	
	public WebElement Shipping_Total_Confirm_Submit_page() {
        return Shipping_Total_Confirm_Submit_page;
    }
	
	public WebElement SOO_Total_OrderSummary_section_Confirm_Submit_page() {
        return SOO_Total_OrderSummary_section_Confirm_Submit_page;
    }
	
	public WebElement SFO_Total_OrderSummary_section_Confirm_Submit_page() {
        return SFO_Total_OrderSummary_section_Confirm_Submit_page;
    }
	
	public WebElement YTO_Total_OrderSummary_section_Confirm_Submit_page() {
        return YTO_Total_OrderSummary_section_Confirm_Submit_page;
    }
	
	public WebElement TE_Total_OrderSummary_section_Confirm_Submit_page() {
        return TE_Total_OrderSummary_section_Confirm_Submit_page;
    }
	
	public List<WebElement> POP_Total_OrderSummary_section_Confirm_Submit_page() {
        return POP_Total_OrderSummary_section_Confirm_Submit_page;
    }
	
	public List<WebElement> SFOYTOPOP_Total_OrderSummary_section_Confirm_Submit_page() {
        return SFOYTOPOP_Total_OrderSummary_section_Confirm_Submit_page;
    }
	
	public WebElement Shipping_Handling_Total_OrderSummary_section_Confirm_Submit_page() {
        return Shipping_Handling_Total_OrderSummary_section_Confirm_Submit_page;
    }
	
	public WebElement ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page() {
        return ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page;
    }
	
	public WebElement section_YTO_header_Confirm_Submit_page() {
        return section_YTO_header_Confirm_Submit_page;
    }
	
	public WebElement item1_price_YTO_Confirm_Submit_page() {
        return item1_price_YTO_Confirm_Submit_page;
    }
	
	public WebElement item2_price_YTO_Confirm_Submit_page() {
        return item2_price_YTO_Confirm_Submit_page;
    }
	
	public WebElement item1_QTY_YTO_Confirm_Submit_page() {
        return item1_QTY_YTO_Confirm_Submit_page;
    }
	
	public WebElement item2_QTY_YTO_Confirm_Submit_page() {
        return item2_QTY_YTO_Confirm_Submit_page;
    }
	
	public WebElement YTO_Subtotal_Confirm_Submit_page() {
        return YTO_Subtotal_Confirm_Submit_page;
    }
	
	public WebElement GST_YTO_section_Confirm_Submit_page() {
        return GST_YTO_section_Confirm_Submit_page;
    }
	
	public WebElement PST_YTO_section_Confirm_Submit_page() {
        return PST_YTO_section_Confirm_Submit_page;
    }
	
	public WebElement QST_YTO_section_Confirm_Submit_page() {
        return QST_YTO_section_Confirm_Submit_page;
    }
	
	public WebElement HST_YTO_section_Confirm_Submit_page() {
        return HST_YTO_section_Confirm_Submit_page;
    }
	
	public WebElement BonusBank_YTO_section_Confirm_Submit_page() {
        return BonusBank_YTO_section_Confirm_Submit_page;
    }
	
	public WebElement CreditNotes_YTO_section_Confirm_Submit_page() {
        return CreditNotes_YTO_section_Confirm_Submit_page;
    }
	
	public WebElement YTO_Total_Confirm_Submit_page() {
        return YTO_Total_Confirm_Submit_page;
    }
	
	public WebElement section_TE_header_Confirm_Submit_page() {
        return section_TE_header_Confirm_Submit_page;
    }
	
	public WebElement item1_price_TE_Confirm_Submit_page() {
        return item1_price_TE_Confirm_Submit_page;
    }
	
	public WebElement item2_price_TE_Confirm_Submit_page() {
        return item2_price_TE_Confirm_Submit_page;
    }
	
	public WebElement item1_QTY_TE_Confirm_Submit_page() {
        return item1_QTY_TE_Confirm_Submit_page;
    }
	
	public WebElement item2_QTY_TE_Confirm_Submit_page() {
        return item2_QTY_TE_Confirm_Submit_page;
    }
	
	public WebElement TE_Subtotal_Confirm_Submit_page() {
        return TE_Subtotal_Confirm_Submit_page;
    }
	
	public WebElement GST_TE_section_Confirm_Submit_page() {
        return GST_TE_section_Confirm_Submit_page;
    }
	
	public WebElement PST_TE_section_Confirm_Submit_page() {
        return PST_TE_section_Confirm_Submit_page;
    }
	
	public WebElement QST_TE_section_Confirm_Submit_page() {
        return QST_TE_section_Confirm_Submit_page;
    }
	
	public WebElement HST_TE_section_Confirm_Submit_page() {
        return HST_TE_section_Confirm_Submit_page;
    }
	
	public WebElement BonusBank_TE_section_Confirm_Submit_page() {
        return BonusBank_TE_section_Confirm_Submit_page;
    }
	
	public WebElement CreditNotes_TE_section_Confirm_Submit_page() {
        return CreditNotes_TE_section_Confirm_Submit_page;
    }
	
	public WebElement TE_Total_Confirm_Submit_page() {
        return TE_Total_Confirm_Submit_page;
    }
	
	public WebElement btn_SUBMIT_Confirm_Submit_page() {
        return btn_SUBMIT_Confirm_Submit_page;
    }
	
	public WebElement btn_APPLY_Shipping_section_Rewards_page() {
        return btn_APPLY_Shipping_section_Rewards_page;
    }

    public List<WebElement> list_btn_APPLY_Shipping_section_Rewards_page() {
        return list_btn_APPLY_Shipping_section_Rewards_page;
    }
    
    public WebElement btn_EDIT_Shipping_section_Rewards_page() {
        return btn_EDIT_Shipping_section_Rewards_page;
    }
    
    public List<WebElement> list_btn_EDIT_Shipping_section_Rewards_page() {
        return list_btn_EDIT_Shipping_section_Rewards_page;
    }
    
    public WebElement header_BlueBar_StudentClub_PostAmount_items_payment() {
        return header_BlueBar_StudentClub_PostAmount_items_payment;
    }

    public WebElement header_BlueBar_TeacherCatalogues_PostAmount_items_payment() {
        return header_BlueBar_TeacherCatalogues_PostAmount_items_payment;
    }
	
	

	@Override
	public void fill_new_CreditCard() {
		WaitUtils.waitForEnabled(getTxtNameOnCard());
		WaitUtils.waitForDisplayed(getTxtNameOnCard());
		getTxtNameOnCard().click();
		getTxtNameOnCard().clear();
		getTxtNameOnCard().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("cardname"));
		String cardnumber = TestBaseProvider.getTestBase().getTestData().getString("cardnumber");
		if (getTxtCardNumber().isDisplayed()) {
			getTxtCardNumber().clear();
			getTxtCardNumber().sendKeys(cardnumber);
			getTxtCardNumber().sendKeys(Keys.TAB);
			PauseUtil.pause(3000);
			SCHUtils.scrollToView(drpMonth);
			SCHUtils.selectOptionByVisibleText(drpMonth, TestBaseProvider.getTestBase().getTestData().getString("expmonth"));
			PauseUtil.pause(3000);
			SCHUtils.selectOptionByVisibleText(drpYear, TestBaseProvider.getTestBase().getTestData().getString("expyear"));
			PauseUtil.pause(3000);
			
			/*SCHUtils.selectItemByText(TestBaseProvider.getTestBase().getTestData().getString("expmonth"),
					getDrpCardExpiryMonth());
			PauseUtil.pause(1000);
			SCHUtils.selectItemByText(TestBaseProvider.getTestBase().getTestData().getString("expyear"), getDrpCardExpiryYear());*/
			// if (cardnumber.substring(0, 4).equalsIgnoreCase("3782")) {
			// AssertUtils.assertAttributeMatches(imgCardIcon, "class",
			// Matchers.containsString("Amex"));
			// } else if (cardnumber.substring(0, 4).equalsIgnoreCase("6011")) {
			// AssertUtils.assertAttributeMatches(imgCardIcon, "class",
			// Matchers.containsString("Discover"));
			// } else if (cardnumber.substring(0, 4).equalsIgnoreCase("5555")) {
			// AssertUtils.assertAttributeMatches(imgCardIcon, "class",
			// Matchers.containsString("Master"));
			// } else if (cardnumber.substring(0, 4).equalsIgnoreCase("4111")) {
			// AssertUtils.assertAttributeMatches(imgCardIcon, "class",
			// Matchers.containsString("Visa"));
			// } else {
			// throw new RuntimeException("cardnumber is invalid");
			// }

		} else {
			SCHUtils.selectItemByText(TestBaseProvider.getTestBase().getTestData().getString("expmonth"),
					getDrpCardExpiryMonth());
			SCHUtils.selectItemByText(TestBaseProvider.getTestBase().getTestData().getString("expyear"), getDrpCardExpiryYear());
		}

		getTxtCardSecurityCode().clear();
		getTxtCardSecurityCode().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("securitycode"));
		getTxtBillingFirstName().clear();
		getTxtBillingFirstName().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("firstname"));
		getTxtBillingLastName().clear();
		getTxtBillingLastName().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("lastname"));
		getTxtBillingAddressOne().clear();
		getTxtBillingAddressOne().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("address1"));
		getTxtBillingAddressTwo().clear();
		getTxtBillingAddressTwo().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("address2"));
		getTxtBillingZip().clear();
		getTxtBillingZip().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("zip"));
		getTxtBillingCity().clear();
		getTxtBillingCity().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("city"));
		PauseUtil.pause(4000);
		SCHUtils.selectOptionByVisibleText(drpBillingCountry, TestBaseProvider.getTestBase().getTestData().getString("country"));
		PauseUtil.pause(2000);
		SCHUtils.selectOptionByVisibleText(drpBillingState, TestBaseProvider.getTestBase().getTestData().getString("state"));
		getTxtBillingPhoneNumber().click();
		getTxtBillingPhoneNumber().clear();
		getTxtBillingPhoneNumber()
				.sendKeys(RandomDataUtil.getPhoneNumber(TestBaseProvider.getTestBase().getTestData().getString("phone")));

		// if (getTxtNameOnCard().getText().isEmpty()) {
		// getTxtNameOnCard().click();
		// getFormCreditcard().click();
		// AssertUtils.assertDisplayed(getValidateCardname());
		// getTxtNameOnCard().sendKeys(data.getString("cardname"));
		// }
		// if (getTxtCardNumber().getText().isEmpty()) {
		// AssertUtils.assertDisplayed(getValidateCardNumber());
		// getTxtCardNumber().sendKeys(data.getString("cardnumber"));
		// }
		// if (getDrpCardExpiryMonth().getText().isEmpty()) {
		// AssertUtils.assertDisplayed(getValidateExpMonth());
		// SCHUtils.selectItemByText(data.getString("expirymonth"),
		// getDrpCardExpiryMonth());
		// }
		// if (getDrpCardExpiryYear().getText().isEmpty()) {
		// AssertUtils.assertDisplayed(getValidateExpYear());
		// SCHUtils.selectItemByText(data.getString("expiryyear"),
		// getDrpCardExpiryYear());
		// }
		// if (getTxtCardSecurityCode().getText().isEmpty()) {
		// AssertUtils.assertDisplayed(getValidateCvn());
		// getTxtCardSecurityCode().sendKeys(data.getString("securitycode"));
		//
		// }
		// if (getTxtBillingFirstName().getText().isEmpty()) {
		// AssertUtils.assertDisplayed(getValidateFirstName());
		// getTxtBillingFirstName().sendKeys(data.getString("firstname"));
		// }
		// if (getTxtBillingLastName().getText().isEmpty()) {
		// AssertUtils.assertDisplayed(getValidateLastname());
		// getTxtBillingLastName().sendKeys(data.getString("lastname"));
		//
		// }
		// if (getTxtBillingAddressOne().getText().isEmpty()) {
		// AssertUtils.assertDisplayed(getValidateAddress1());
		// getTxtBillingAddressOne().sendKeys(data.getString("address1"));
		//
		// }
		// if (getTxtBillingZip().getText().isEmpty()) {
		// AssertUtils.assertDisplayed(getValidateZip());
		// getTxtBillingZip().sendKeys(data.getString("zip"));
		// }
		// if (getTxtBillingCity().getText().isEmpty()) {
		// AssertUtils.assertDisplayed(getValidateCity());
		// getTxtBillingCity().sendKeys(data.getString("city"));
		// }
		// if (getDrpBillingState().getText().isEmpty()) {
		// AssertUtils.assertDisplayed(getValidateState());
		// SCHUtils.selectItemByText(data.getString("state"),
		// getDrpBillingState());
		// }
		// if (getDrpBillingCountry().getText().isEmpty()) {
		// AssertUtils.assertDisplayed(getValidateCountry());
		// SCHUtils.selectOptionByVisibleText(getDrpBillingCountry(),
		// data.getString("country"));
		// }
		// if (getTxtBillingPhoneNumber().getText().isEmpty()) {
		// AssertUtils.assertDisplayed(getValidatePhoneNumber());
		// getTxtBillingPhoneNumber().sendKeys(
		// RandomDataUtil.getPhoneNumber(data.getString("phonenumber")));
		// }
	}
	
	@Override
	public void fill_new_CreditCard_to_MyAccount_Page() {
		PauseUtil.pause(3000);
		AddCard_fld_Name_on_Card_MyAccount().click();
		AddCard_fld_Name_on_Card_MyAccount().clear();
		AddCard_fld_Name_on_Card_MyAccount().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("cardname"));
		AddCard_fld_Card_num_MyAccount().clear();
		AddCard_fld_Card_num_MyAccount().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("cardnumber"));
		PauseUtil.pause(2000);
		SCHUtils.selectOptionByVisibleText(AddCard_fld_Exp_mnt_MyAccount, TestBaseProvider.getTestBase().getTestData().getString("expmonth"));
		PauseUtil.pause(2000);
		SCHUtils.selectOptionByVisibleText(AddCard_fld_Exp_yr_MyAccount, TestBaseProvider.getTestBase().getTestData().getString("expyear"));
		AddCard_fld_Sec_code_MyAccount().clear();
		AddCard_fld_Sec_code_MyAccount().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("securitycode"));
		AddCard_fld_fName_MyAccount().clear();
		AddCard_fld_fName_MyAccount().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("firstname"));
		AddCard_fld_lName_MyAccount().clear();
		AddCard_fld_lName_MyAccount().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("lastname"));
		AddCard_fld_addr1_MyAccount().clear();
		AddCard_fld_addr1_MyAccount().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("address1"));
		AddCard_fld_addr2_MyAccount().clear();
		AddCard_fld_addr2_MyAccount().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("address2"));
		PauseUtil.pause(2000);
		SCHUtils.selectOptionByVisibleText(AddCard_fld_country_MyAccount, TestBaseProvider.getTestBase().getTestData().getString("country"));
		PauseUtil.pause(2000);
		SCHUtils.selectOptionByVisibleText(AddCard_fld_state_MyAccount, TestBaseProvider.getTestBase().getTestData().getString("state"));
		PauseUtil.pause(2000);
		AddCard_fld_postalCode_MyAccount().clear();
		AddCard_fld_postalCode_MyAccount().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("zip"));
		AddCard_fld_city_MyAccount().clear();
		AddCard_fld_city_MyAccount().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("city"));
		PauseUtil.pause(2000);
		AddCard_fld_phNum_MyAccount().click();
		AddCard_fld_phNum_MyAccount().clear();
		AddCard_fld_phNum_MyAccount()
				.sendKeys(RandomDataUtil.getPhoneNumber(TestBaseProvider.getTestBase().getTestData().getString("phone")));
		PauseUtil.pause(2000);
		
	}
	
	@Override
	public void user_selects_MyAccount_in_HomePage() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Home_Select_dropDown_MyAccount().click();
	}
	
	@Override
	public void user_select_MyAccount_in_HomePage() {
		
		TeachersHomePage tchhome = new TeachersHomePage();
		PauseUtil.pause(2000);
		tchhome.getlnktecherhomemyaccount().click();
		PauseUtil.pause(2000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		
		if(tchhome.chkTutorial_DontShowAgain_Link().size()!=0){
        	SCHUtils.clickUsingJavaScript(tchhome.getTutorial_DontShowAgain_Link());
        	PauseUtil.pause(3000);
        }
		WebDriver driver=TestBaseProvider.getTestBase().getDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
			WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(btnCloseinLoginPage()));
			element1.isDisplayed();
			element1.click();
		} catch (Exception e) {
			System.out.println("Close button is not displayed");
		}
	}
	
	@Override
	public void user_selects_BillingAndPayment_MyAccount_dropDown() {
		PauseUtil.pause(2000);
		Home_Select_dropDown_BillingPayment_MyAccount().click();
	}
	
	@Override
	public void user_selects_OrderHistory_MyAccount_dropDown() {
		PauseUtil.pause(2000);
		Home_Select_dropDown_OrderHistory_MyAccount().click();
	}
	
	@Override
	public void user_selects_SignOut_MyAccount_dropDown() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Home_Select_dropDown_SignOut_MyAccount().click();
	}
	
	@Override
	public void verify_MyAccount_ReadingClub_header_and_table_displayed_MyAccountPage() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		Assert.assertTrue(header_MyAccountReadingClub_MyAccountPage().isDisplayed(), "My Reading Club Account header is not displayed");
		Assert.assertTrue(table_MyAccountReadingClub_MyAccountPage().isDisplayed(), "My Account page table is not displayed");
	}
	
	@Override
	public void user_selects_AddaCard_in_MyAccount_Page() {
		PauseUtil.pause(8000);
		WebDriver driver=TestBaseProvider.getTestBase().getDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
			WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(btnCloseinLoginPage()));
			element1.isDisplayed();
			element1.click();
		} catch (Exception e) {
			System.out.println("Close button is not displayed");
		}
		WebElement element2 = wait.until(ExpectedConditions.visibilityOf(Select_AddaCard_MyAccount()));
		//Select_AddaCard_MyAccount().click();
		
		for(int i=0;i<=3;i++)
		{
			
		if(sizeRemove_Saved_card_MyAccount().size()!=0){	
	    Remove_Saved_card_MyAccount().click();
	    PauseUtil.pause(2000);
		Yes_to_remove_savedCard_MyAccount().click();
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		}
		PauseUtil.pause(20000);
		try {
			Remove_Saved_card_MyAccount().isDisplayed();
		} catch (Exception e) {
			System.out.println("################Saved Card list  is empty");
			PauseUtil.pause(10000);
			break;
		}
			
		}
		
		//(soma) commenting this as this loop is executing for more time which is making 8 scenarios skipping
		/*do {
			Remove_Saved_card_MyAccount().click();
			PauseUtil.pause(2000);
			Yes_to_remove_savedCard_MyAccount().click();
			PauseUtil.pause(20000);
			try {
				Remove_Saved_card_MyAccount().isDisplayed();
			} catch (Exception e) {
				System.out.println("################Saved Card list  is empty");
				PauseUtil.pause(10000);
				break;
			}
		} while (Remove_Saved_card_MyAccount().isDisplayed());*/
		
		element2.click();
	}
	
	
	@Override
	public void user_selects_DeleteCard_in_MyAccount_Page() {
		PauseUtil.pause(8000);
		WebDriver driver=TestBaseProvider.getTestBase().getDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
			WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(btnCloseinLoginPage()));
			element1.isDisplayed();
			element1.click();
		} catch (Exception e) {
			System.out.println("Close button is not displayed");
		}
		WebElement element2 = wait.until(ExpectedConditions.visibilityOf(Select_AddaCard_MyAccount()));
		//Select_AddaCard_MyAccount().click();
		
		for(int i=0;i<=3;i++)
		{
			
		if(sizeRemove_Saved_card_MyAccount().size()!=0){	
	    Remove_Saved_card_MyAccount().click();
	    PauseUtil.pause(2000);
		Yes_to_remove_savedCard_MyAccount().click();
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		}
		PauseUtil.pause(20000);
		try {
			Remove_Saved_card_MyAccount().isDisplayed();
		} catch (Exception e) {
			System.out.println("################Saved Card list  is empty");
			PauseUtil.pause(10000);
			break;
		}
			
		}
		
	}
	
	
	
	@Override
	public void user_validate_Saved_Credit_card_in_MyAccount_Page() {
		PauseUtil.waitForAjaxToComplete(5000);
		PauseUtil.pause(8000);
		WebDriver driver=TestBaseProvider.getTestBase().getDriver();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(Saved_credit_card_MyAccount()));
		String text_act=element.getText();
		if (TestBaseProvider.getTestBase().getTestData().getString("cardnumber").equals("4111111111111111")) {
			String text_exp="Visa Ending In 1111";
			Assert.assertEquals(text_act, text_exp, "Visa card is not saved");
		} else if(TestBaseProvider.getTestBase().getTestData().getString("cardnumber").equals("373731623811006")){
			String text_exp="Amex Ending In 1006";
			Assert.assertEquals(text_act, text_exp, "Amex card is not saved");

		}else if(TestBaseProvider.getTestBase().getTestData().getString("cardnumber").equals("6011000991000500")){
			String text_exp="Discover Ending In 0500";
			Assert.assertEquals(text_act, text_exp, "Discover card is not saved");
		}else if(TestBaseProvider.getTestBase().getTestData().getString("cardnumber").equals("5431111111111111")){
			String text_exp="MasterCard Ending In 1111";
			Assert.assertEquals(text_act, text_exp, "Mastercard card is not saved");
		}else{
			System.out.println("No card is saved");
		}
	}
	
	
	@Override
	public void user_selects_Save_btn_in_MyAccount_Page() {
		PauseUtil.pause(2000);
		AddCard_btn_Save_MyAccount().click();
	}
	
	@Override
	public void user_clicks_on_Home_icon_from_MyAccountPage() {
		PauseUtil.pause(20000);
		icon_Home_home_Page().click();
	}
	
	@Override
	public void fill_alternate_shipping_address_details() {
		PauseUtil.pause(3000);
		txtshippinginfoAddressOne().clear();
		txtshippinginfoAddressOne().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("address1"));
		PauseUtil.pause(2000);
		txtshippinginfoAddressTwo().clear();
		txtshippinginfoAddressTwo().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("address2"));
		PauseUtil.pause(1000);
		txtshippinginfoZip().clear();
		txtshippinginfoZip().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("zip"));
		PauseUtil.pause(1000);
		txtshippinginfoCity().clear();
		txtshippinginfoCity().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("city"));
		PauseUtil.pause(4000);
		SCHUtils.selectOptionByVisibleText(drpshippinginfoState, TestBaseProvider.getTestBase().getTestData().getString("state"));
		PauseUtil.pause(2000);
		//SCHUtils.selectOptionByVisibleText(drpshippinginfoCountry, TestBaseProvider.getTestBase().getTestData().getString("country"));
	}
	
	@Override
	public void isSubmitConfirm_header_displayed(){
		PauseUtil.pause(5000);
		headerConfirmSubmitIsActive().isDisplayed();
	}

@Override
public void enter_amt_paid_by_creditCard_paymentPage() {
	PauseUtil.pause(3000);
	Fld_amt_paid_by_CC().click();
	Fld_amt_paid_by_CC().clear();
	PauseUtil.pause(2000);
	Fld_amt_paid_by_CC().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("paymentAmt"));
	PauseUtil.pause(1000);
	Fld_amt_paid_by_CC().sendKeys(Keys.ENTER);
	
	/* Pending implementation Satnam
		this is failing for testTeacher selects passed expiration date in combination of credit card and checks in Payment page:[<UsingData>]
		Modifying this method as not sure if its used by other tests.
	
	*/
	WebDriver driver = TestBaseProvider.getTestBase().getDriver();
	List<WebElement> eleChk = driver.findElements(By.xpath("//h2[text()='Payment']"));
	if(eleChk.size()>0){
	header_payment_PaymentPage().click();
	PauseUtil.pause(2000);
	}
	
	

}

@Override
public void Verify_the_expired_card_error_message_paymentPage() {
	PauseUtil.pause(10000);
	String Msg_act=msg_CC_card_expired().getText();
	String Msg_exp="This Credit Card is expired";
	Assert.assertEquals(Msg_act, Msg_exp, "Wrong Ërror message is displayed");
	
}

@Override
public void submit_the_Order() {
	PauseUtil.waitForAjaxToComplete(2000);
	btnSubmitInSubmitPage().click();
	PauseUtil.waitForAjaxToComplete(2000);
	PauseUtil.pause(6000);
	headerOrderSuccessfulMessage().isDisplayed();
}

@Override
public void verify_the_Order_successful_message_isDisplayed() {
	PauseUtil.waitForAjaxToComplete(2000);
	PauseUtil.pause(3000);
	headerOrderSuccessfulMessage().isDisplayed();
	
}

	@Override
	public void CSR_verify_the_SaveCard_checkbox_with_label_displays_correctly_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(2000);
		
		try {
			fld_SaveThisCard_BillingInfo_Payment_page().isDisplayed();
			System.out.println("SAVE THIS CARD section is displayed in Payment page");
		} catch (Exception e) {
			Assert.fail("SAVE THIS CARD section is not displayed in Payment page");
		}
		String act_text=fld_SaveThisCard_BillingInfo_Payment_page().getText();
		String exp_text="SAVE THIS CARD";
		
		Assert.assertEquals(act_text, exp_text, "Incorrect label is displayed for SAVE THIS CARD in Payment page");
	}
	
	@Override
	public void CSR_fills_Billing_info_details_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(2000);
		
		getTxtBillingFirstName().clear();
		getTxtBillingFirstName().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("firstname"));
		getTxtBillingLastName().clear();
		getTxtBillingLastName().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("lastname"));
		getTxtBillingAddressOne().clear();
		getTxtBillingAddressOne().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("address1"));
		getTxtBillingAddressTwo().clear();
		getTxtBillingAddressTwo().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("address2"));
		getTxtBillingZip().clear();
		getTxtBillingZip().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("zip"));
		getTxtBillingCity().clear();
		getTxtBillingCity().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("city"));
		PauseUtil.pause(4000);
		SCHUtils.selectOptionByVisibleText(drpBillingState, TestBaseProvider.getTestBase().getTestData().getString("state"));
		PauseUtil.pause(2000);
		SCHUtils.selectOptionByVisibleText(drpBillingCountry, TestBaseProvider.getTestBase().getTestData().getString("country"));
		getTxtBillingPhoneNumber().click();
		getTxtBillingPhoneNumber().clear();
		getTxtBillingPhoneNumber()
				.sendKeys(RandomDataUtil.getPhoneNumber(TestBaseProvider.getTestBase().getTestData().getString("phone")));
		
	}
	
	@Override
	public void CSR_enters_amt_paid_by_creditCard_in_paymentPage() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Fld_amt_paid_by_CC().click();
		Fld_amt_paid_by_CC().clear();
		PauseUtil.pause(2000);
		Fld_amt_paid_by_CC().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("paymentAmt"));
		PauseUtil.pause(1000);
		Fld_amt_paid_by_CC().sendKeys(Keys.TAB);
	}
	
	@Override
	public void CSR_clicks_on_Cancel_btn_in_Billing_info_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		btn_Cancel_BillingInfo_Payment_page().click();
	}
	
	@Override
	public void CSR_verify_Billing_info_form_disappeared_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String act_text=section_Billing_Info_Payment_page().getAttribute("style");
		String exp_text="display: none;";
		
		Assert.assertEquals(act_text, exp_text, "Billing Info form is not disappeared when CSR clicks on Cancel button");
	}
	
	@Override
	public void CSR_clicks_on_Save_btn_in_Billing_info_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		btn_Save_BillingInfo_Payment_page().click();
	}
	
	@Override
	public void CSR_clicks_on_EDIT_hyperlink_in_Billing_info_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		hyperlink_EDIT_SavedCard_Payment_page().click();
	}
	
	@Override
	public void CSR_verify_Security_code_fld_highlighted_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		fld_Security_code_CreditCard_Payment_page().sendKeys(Keys.TAB);
		String act_text=fld_Security_code_CreditCard_Payment_page().getAttribute("aria-invalid");
		System.out.println("#########:"+act_text);
		String exp_text="true";
		Assert.assertEquals(act_text, exp_text, "Security field is not highlighted without enter the value");
	}
	
	@Override
	public void CSR_clicks_on_Year_dropDown_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		fld_selection_Year_Payment_page().click();
	}
	
	@Override
	public void CSR_validate_year_list_count_displayed_correctly_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		int act_val=year_list_ExpirationDate_CreditCard_Payment_page().size();
		act_val=act_val-1;
		
		int exp_val=20;
		Assert.assertEquals(act_val, exp_val, "Incorrect Year list is displayed in Expiration Date Year list");
		int j = 2017;
		for (int i = 1; i <= act_val; i++) {
			WebElement list=year_list_ExpirationDate_CreditCard_Payment_page().get(i);
			String list_text=list.getText();
			int list_text_is=Integer.parseInt(list_text);
			System.out.println("##########:"+list_text_is);
			if(j<=2036)
			Assert.assertEquals(list_text_is, j, "Incorrect Year is displayed in Expiration Date Year list");
		j++;
		}
	}
	
	@Override
	public void CSR_clicks_on_Month_dropDown_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		fld_selection_Month_Payment_page().click();
	}
	
	@Override
	public void CSR_validate_month_list_count_displayed_correctly_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		int act_val=mnth_list_ExpirationDate_CreditCard_Payment_page().size();
		act_val=act_val-1;
		
		int exp_val=12;
		Assert.assertEquals(act_val, exp_val, "Incorrect Month list is displayed in Expiration Date Year list");
		int j = 1;
		for (int i = 1; i <= act_val; i++) {
			WebElement list=mnth_list_ExpirationDate_CreditCard_Payment_page().get(i);
			String list_text=list.getText();
			int list_text_is=Integer.parseInt(list_text);
			System.out.println("##########:"+list_text_is);
			if(j<=12)
			Assert.assertEquals(list_text_is, j, "Incorrect Month is displayed in Expiration Date Year list");
		j++;
		}
	}
	
	@Override
	public void CSR_enters_amount_to_be_paid_in_Credit_card_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String Total_Amount_Owing_Value=Total_Amount_Owing_Payment().getText();
		Total_Amount_Owing_Value=Total_Amount_Owing_Value.trim();
		Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
		double Total_Amount_Owing_Value_is=Double.parseDouble(Total_Amount_Owing_Value);
		int Paid_Amount=TestBaseProvider.getTestBase().getTestData().getInt("PaymentAmt");
		
		if (Total_Amount_Owing_Value_is > Paid_Amount) {
			
			String Paid_Amount_is=Integer.toString(Paid_Amount-1);
			
			Fld_amt_paid_by_CC().click();
			Fld_amt_paid_by_CC().clear();
			PauseUtil.pause(2000);
			Fld_amt_paid_by_CC().sendKeys(Paid_Amount_is);
		} else {
			Assert.fail("Total Amount Owing value is less than the Amount entered in Credit card field");
		}
	}
	
	@Override
	public void CSR_enters_amount_to_be_paid_in_Cheque_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String Total_Amount_Owing_Value=Total_Amount_Owing_Payment().getText();
		Total_Amount_Owing_Value=Total_Amount_Owing_Value.trim();
		Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
		double Total_Amount_Owing_Value_is=Double.parseDouble(Total_Amount_Owing_Value);
		int Paid_Amount=TestBaseProvider.getTestBase().getTestData().getInt("PaymentAmt");
		
		if (Total_Amount_Owing_Value_is > Paid_Amount) {
			
			String Paid_Amount_is=Integer.toString(Paid_Amount-1);
			
			Fld_amt_paid_by_Cheque().click();
			Fld_amt_paid_by_Cheque().clear();
			PauseUtil.pause(2000);
			Fld_amt_paid_by_Cheque().sendKeys(Paid_Amount_is);
		} else {
			Assert.fail("Total Amount Owing value is less than the Amount entered in Cheque field");
		}
	}
	
	@Override
	public void CSR_enters_morethan_Tot_amount_to_be_paid_in_Credit_card_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String Total_Amount_Owing_Value=Total_Amount_Owing_Payment().getText();
		Total_Amount_Owing_Value=Total_Amount_Owing_Value.trim();
		Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
		
		Total_Amount_Owing_Value=Total_Amount_Owing_Value+1;
		
		Fld_amt_paid_by_CC().click();
		Fld_amt_paid_by_CC().clear();
		PauseUtil.pause(2000);
		Fld_amt_paid_by_CC().sendKeys(Total_Amount_Owing_Value);
		
	}
	
	@Override
	public void CSR_enters_same_Tot_amount_to_be_paid_in_Credit_card_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String Total_Amount_Owing_Value=Total_Amount_Owing_Payment().getText();
		Total_Amount_Owing_Value=Total_Amount_Owing_Value.trim();
		Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
		
		Fld_amt_paid_by_CC().click();
		Fld_amt_paid_by_CC().clear();
		PauseUtil.pause(2000);
		Fld_amt_paid_by_CC().sendKeys(Total_Amount_Owing_Value);
		
	}
	
	@Override
	public void CSR_enters_same_Tot_amount_to_be_paid_in_Cheque_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String Total_Amount_Owing_Value=Total_Amount_Owing_Payment().getText();
		Total_Amount_Owing_Value=Total_Amount_Owing_Value.trim();
		Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
		
		Fld_amt_paid_by_Cheque().click();
		Fld_amt_paid_by_Cheque().clear();
		PauseUtil.pause(2000);
		Fld_amt_paid_by_Cheque().sendKeys(Total_Amount_Owing_Value);
		
	}
	
	@Override
	public void CSR_enters_morethan_Tot_amount_to_be_paid_in_Cheque_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String Total_Amount_Owing_Value=Total_Amount_Owing_Payment().getText();
		Total_Amount_Owing_Value=Total_Amount_Owing_Value.trim();
		Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
		
		Total_Amount_Owing_Value=Total_Amount_Owing_Value+1;
		
		Fld_amt_paid_by_Cheque().click();
		Fld_amt_paid_by_Cheque().clear();
		PauseUtil.pause(2000);
		Fld_amt_paid_by_Cheque().sendKeys(Total_Amount_Owing_Value);
		
	}
	
	@Override
	public void CSR_perform_Enter_key_after_enter_amount_to_be_paid_in_Credit_card_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		Fld_amt_paid_by_CC().sendKeys(Keys.TAB);
	}
	
	@Override
	public void CSR_validate_Amount_to_be_paid_by_Cheque_val_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String Total_Amount_Owing_Value=Total_Amount_Owing_Payment().getText();
		Total_Amount_Owing_Value=Total_Amount_Owing_Value.trim();
		Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
		double Total_Amount_Owing_Value_is=Double.parseDouble(Total_Amount_Owing_Value);
		
		double Paid_Amount=TestBaseProvider.getTestBase().getTestData().getDouble("PaymentAmt");
		Paid_Amount=Paid_Amount-1;
		
		double exp_val=Total_Amount_Owing_Value_is-Paid_Amount;
		exp_val =Double.parseDouble(new DecimalFormat("##.##").format(exp_val));
		
		String Cheque_val=Fld_amt_paid_by_Cheque().getAttribute("value");
		double Cheque_val_is=Double.parseDouble(Cheque_val);
		
		Assert.assertEquals(Cheque_val_is, exp_val, "Incorrect AMOUNT TO BE PAID BY CHEQUE value is displayed");
		
	}
	
	@Override
	public void CSR_validate_Amount_to_be_paid_by_CreditCard_val_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String Total_Amount_Owing_Value=Total_Amount_Owing_Payment().getText();
		Total_Amount_Owing_Value=Total_Amount_Owing_Value.trim();
		Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
		double Total_Amount_Owing_Value_is=Double.parseDouble(Total_Amount_Owing_Value);
		
		double Paid_Amount=TestBaseProvider.getTestBase().getTestData().getDouble("PaymentAmt");
		Paid_Amount=Paid_Amount-1;
		
		double exp_val=Total_Amount_Owing_Value_is-Paid_Amount;
		exp_val =Double.parseDouble(new DecimalFormat("##.##").format(exp_val));
		
		String Credit_val=Fld_amt_paid_by_CC().getAttribute("value");
		double Credit_val_is=Double.parseDouble(Credit_val);
		
		Assert.assertEquals(Credit_val_is, exp_val, "Incorrect AMOUNT TO BE PAID BY CREDIT value is displayed");
		
	}
	
	@Override
	public void CSR_validate_Amount_to_be_paid_by_Cheque_val_is_0_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String Cheque_val=Fld_amt_paid_by_Cheque().getAttribute("value");
		Cheque_val=Cheque_val.trim();
		String exp_val="0.00";
		
		Assert.assertEquals(Cheque_val, exp_val, "Incorrect AMOUNT TO BE PAID BY CHEQUE value is displayed");
		
	}
	
	@Override
	public void CSR_validate_Amount_to_be_paid_by_Credit_Card_val_is_0_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String Credit_val=Fld_amt_paid_by_CC().getAttribute("value");
		Credit_val=Credit_val.trim();
		String exp_val="0.00";
		
		Assert.assertEquals(Credit_val, exp_val, "Incorrect AMOUNT TO BE PAID BY CREDIT value is displayed");
		
	}
	
	@Override
	public void CSR_selects_Country_in_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		SCHUtils.selectOptionByVisibleText(drpBillingCountry, TestBaseProvider.getTestBase().getTestData().getString("country"));
	}
	
	@Override
	public void CSR_enters_PhoneNumber_in_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		getTxtBillingPhoneNumber().click();
		getTxtBillingPhoneNumber().clear();
		getTxtBillingPhoneNumber()
				.sendKeys(RandomDataUtil.getPhoneNumber(TestBaseProvider.getTestBase().getTestData().getString("phone")));
	}
	
	@Override
	public void CSR_verify_the_PhoneNumber_in_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String act_val=getTxtBillingPhoneNumber().getAttribute("value");
		act_val=act_val.trim();
		
		String exp_val=TestBaseProvider.getTestBase().getTestData().getString("phone");
		exp_val=exp_val.substring(0, 3)+"-"+exp_val.substring(3, exp_val.length());
		exp_val=exp_val.substring(0, 7)+"-"+exp_val.substring(7, exp_val.length());
		
		Assert.assertEquals(act_val, exp_val, "Incorrect Phone number is displayed");
				
	}
	
	@Override
	public void CSR_selects_a_year_Credit_card_info_in_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String Year=TestBaseProvider.getTestBase().getTestData().getString("expyear");
		WebDriver driver=TestBaseProvider.getTestBase().getDriver();
		driver.findElement(By.xpath("//li[@data-label='"+Year+"']/span")).click();
		
	}
	
	@Override
	public void CSR_validate_the_selected_year_not_shown_in_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		try {
			selected_year_in_credit_card_dropDown_Payment_page().isDisplayed();
			String act_val=selected_year_in_credit_card_dropDown_Payment_page().getAttribute("data-label");
			String exp_val=TestBaseProvider.getTestBase().getTestData().getString("expyear");
			
			Assert.assertEquals(act_val, exp_val, "Selected year is showing in YEAR drop down list");
		} catch (Exception e) {
			Assert.fail("Selected year is listed in YEAR deop down list");
		}
	}
	
	@Override
	public void CSR_enters_Security_code_CreditCard_section_in_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		getTxtCardSecurityCode().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("securitycode"));
	}
	
	@Override
	public void CSR_verify_Security_code_not_accept_morethan_4chars_CreditCard_section_in_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String act_val=getTxtCardSecurityCode().getAttribute("value");
		String exp_val=TestBaseProvider.getTestBase().getTestData().getString("securitycode");
		
		Assert.assertNotEquals(act_val, exp_val, "Security code field is accepted more than 4 characters");
	}
	
	@Override
	public void CSR_enters_CreditCard_number_in_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		getTxtCardNumber().click();
		getTxtCardNumber().clear();
		getTxtCardNumber().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("cardnumber"));
		getTxtCardNumber().sendKeys(Keys.TAB);
	}
	
	@Override
	public void CSR_verify_CreditCard_number_image_shows_correctly_in_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String act_text=fld_CreditCard_image_Payment_page().getAttribute("data-cardlabel");
		String exp_text=TestBaseProvider.getTestBase().getTestData().getString("CardType");
		
		Assert.assertEquals(act_text, exp_text, "Incorrect Credit card image is showing in Payment Page");
	}
	
	@Override
	public void CSR_submit_the_Order() {
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(1000);
		btnSubmitInSubmitPage().click();
	}
	
	@Override
	public void CSR_verify_default_country_option_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(1000);
		
		String act_text=fld_default_country_Payment_page().getText();
		act_text=act_text.trim();
		
		String exp_text="Canada";
		
		Assert.assertEquals(act_text, exp_text, "Incorrect default country is selected in Payment page");
	}
	
	@Override
	public void CSR_verify_country_dropdown_list_option_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(1000);
		
		fld_default_country_Payment_page().click();
		
		String act_text=fld_country_US_Payment_page().getText();
		act_text=act_text.trim();
		
		String exp_text="United States";
		
		Assert.assertEquals(act_text, exp_text, "Country drop down list doesn't have US option in Payment page");
	}
	
	@Override
	public void CSR_verify_the_label_changes_to_ZIP_in_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(1000);
		
		String act_text=label_Postal_Code_and_ZIP_Payment_page().getText();
		act_text=act_text.trim();
		
		String exp_text="ZIP";
		
		Assert.assertEquals(act_text, exp_text, "Incorrect text is displayed for ZIP field");
		
	}
	
	@Override
	public void CSR_verify_the_label_changes_to_STATE_in_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(1000);
		String act_text=label_Province_and_STATE_Payment_page().getText();
		act_text=act_text.trim();
		String exp_text="STATE";
		Assert.assertEquals(act_text, exp_text, "Incorrect text is displayed for STATE field");
	}
	
	@Override
	public void CSR_perform_TabOut_PhoneNumber_in_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);		
		getTxtBillingPhoneNumber().sendKeys(Keys.TAB);
	}
	
	@Override
	public void CSR_verify_error_popup_displayed_for_PhoneNumber_fld_in_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		AssertUtils.assertDisplayed(popUp_error_PhoneNumber_fld_Payment_page());
	}
	
	@Override
	public void CSR_enters_decimal_val_lessthan_Tot_amount_to_be_paid_in_Credit_card_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String Total_Amount_Owing_Value=Total_Amount_Owing_Payment().getText();
		Total_Amount_Owing_Value=Total_Amount_Owing_Value.trim();
		Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
		
		Double CreditAmt_val=Double.parseDouble(Total_Amount_Owing_Value);
		CreditAmt_val=(CreditAmt_val)-(1.25);
		System.out.println("############:"+CreditAmt_val);
		
		String CreditAmt_val_is=String.valueOf(CreditAmt_val);
		System.out.println("############:"+CreditAmt_val_is);
		
		Fld_amt_paid_by_CC().click();
		Fld_amt_paid_by_CC().clear();
		PauseUtil.pause(2000);
		Fld_amt_paid_by_CC().sendKeys(CreditAmt_val_is);
		
	}
	
	@Override
	public void CSR_validate_the_decimal_vals_for_creditCard_fld_in_paymentPage() {
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(1000);
		
		String act_val=Fld_amt_paid_by_CC().getAttribute("value");
		
		String[] value = act_val.split("\\.");
		System.out.println("************:"+value[1]);
		
		String value2=value[1].toString().trim();
		
		if (value2.length() == 2) {
			System.out.println("2 decimal values are displayed in Credit card field");
		} else {
			Assert.fail("More than 2 decimal values are displayed in Credit card field");
		}
	}
	
	@Override
	public void CSR_enters_amt_paid_by_Purchase_Order_in_paymentPage() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Fld_amt_paid_by_PO().click();
		Fld_amt_paid_by_PO().clear();
		PauseUtil.pause(2000);
		Fld_amt_paid_by_PO().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("POAmt"));
		PauseUtil.pause(1000);
		Fld_amt_paid_by_PO().sendKeys(Keys.TAB);
	}
	
	@Override
	public void CSR_validate_the_decimal_vals_for_PurchaseOrder_fld_in_paymentPage() {
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(1000);
		
		String act_val=Fld_amt_paid_by_PO().getAttribute("value");
		
		String[] value = act_val.split("\\.");
		System.out.println("************:"+value[1]);
		
		String value2=value[1].toString().trim();
		
		if (value2.length() == 2) {
			System.out.println("2 decimal values are displayed in Purchase Order field");
		} else {
			Assert.fail("More than 2 decimal values are displayed in Purchase Order field");
		}
	}
	
	@Override
	public void CSR_validate_Amount_to_be_paid_by_PO_val_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String Total_Amount_Owing_Value=Total_Amount_Owing_Payment().getText();
		Total_Amount_Owing_Value=Total_Amount_Owing_Value.trim();
		Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
		double Total_Amount_Owing_Value_is=Double.parseDouble(Total_Amount_Owing_Value);
		
		double Paid_Amount=TestBaseProvider.getTestBase().getTestData().getDouble("PaymentAmt");
		Paid_Amount=Paid_Amount-1;
		
		double exp_val=Total_Amount_Owing_Value_is-Paid_Amount;
		exp_val =Double.parseDouble(new DecimalFormat("##.##").format(exp_val));
		
		String PO_val=Fld_amt_paid_by_PO().getAttribute("value");
		double PO_val_is=Double.parseDouble(PO_val);
		
		Assert.assertEquals(PO_val_is, exp_val, "Incorrect AMOUNT TO BE PAID BY Purchase Order value is displayed");
		
	}
	
	@Override
	public void CSR_enters_amount_to_be_paid_in_PO_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String Total_Amount_Owing_Value=Total_Amount_Owing_Payment().getText();
		Total_Amount_Owing_Value=Total_Amount_Owing_Value.trim();
		Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
		double Total_Amount_Owing_Value_is=Double.parseDouble(Total_Amount_Owing_Value);
		int Paid_Amount=TestBaseProvider.getTestBase().getTestData().getInt("PaymentAmt");
		
		if (Total_Amount_Owing_Value_is > Paid_Amount) {
			
			String Paid_Amount_is=Integer.toString(Paid_Amount-1);
			
			Fld_amt_paid_by_PO().click();
			Fld_amt_paid_by_PO().clear();
			PauseUtil.pause(2000);
			Fld_amt_paid_by_PO().sendKeys(Paid_Amount_is);
		} else {
			Assert.fail("Total Amount Owing value is less than the Amount entered in Purchase Order field");
		}
	}
	
	@Override
	public void CSR_perform_Enter_key_after_enter_amount_to_be_paid_in_Cheques_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		
		Fld_amt_paid_by_Cheque().sendKeys(Keys.TAB);
	}
	
	@Override
	public void CSR_perform_Enter_key_after_enter_amount_to_be_paid_in_PurchaseOrder_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		
		Fld_amt_paid_by_PO().sendKeys(Keys.TAB);
	}
	
	@Override
	public void CSR_validate_Amount_to_be_paid_by_PO_val_is_0_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		
		String PO_val=Fld_amt_paid_by_PO().getAttribute("value");
		PO_val=PO_val.trim();
		String exp_val="0.00";
		
		Assert.assertEquals(PO_val, exp_val, "Incorrect AMOUNT TO BE PAID BY Purchase Order value is displayed");
		
	}
	
	@Override
	public void CSR_enters_morethan_Tot_amount_to_be_paid_in_PurchaseOrder_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String Total_Amount_Owing_Value=Total_Amount_Owing_Payment().getText();
		Total_Amount_Owing_Value=Total_Amount_Owing_Value.trim();
		Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
		
		Total_Amount_Owing_Value=Total_Amount_Owing_Value+1;
		
		Fld_amt_paid_by_PO().click();
		Fld_amt_paid_by_PO().clear();
		PauseUtil.pause(2000);
		Fld_amt_paid_by_PO().sendKeys(Total_Amount_Owing_Value);
	}
	
	@Override
	public void CSR_enters_same_Tot_amount_to_be_paid_in_PurchaseOrder_Payment_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String Total_Amount_Owing_Value=Total_Amount_Owing_Payment().getText();
		Total_Amount_Owing_Value=Total_Amount_Owing_Value.trim();
		Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
		
		Fld_amt_paid_by_PO().click();
		Fld_amt_paid_by_PO().clear();
		PauseUtil.pause(2000);
		Fld_amt_paid_by_PO().sendKeys(Total_Amount_Owing_Value);
	}
	
	
	//########################################## Story 2031 ################################################
	@FindBy(locator="dw.checkout.confirmsubmitpage.lbl.Purchase.Order.text")
	private WebElement amount_paid_by_PO_lbl;
	
	@FindBy(locator="dw.checkout.confirmsubmitpage.lbl.Purchase.Order.Amount")
	private WebElement amount_paid_by_PO;
	
	@FindBy(locator="dw.checkout.confirmsubmitpage.lbl.Credit.Card.text")
	private WebElement amount_paid_by_credit_card_lbl;
	
	@FindBy(locator="dw.checkout.confirmsubmitpage.lbl.Credit.Card.Amount")
	private WebElement amount_paid_by_credit_card;
	
	@FindBy(locator="dw.checkout.shippingandpayment.payment.purchaseorder.Fld.amt.paid.by.PO")
	private WebElement paid_amount_for_PO;
	
	@FindBy(locator = "dw.checkout.payment.totalamount.owing")
    private WebElement lblpaymenttotalamountowing;
	
	@FindBy(locator = "dw.checkout.clickoutside.layout.PaymentPage")
	private WebElement Click_outside_PaymentPage;
	
	public WebElement CSR_click_outside_PaymentPage(){
		return Click_outside_PaymentPage;
	}
	
	public WebElement getlblpaymenttotalamountowing() {
        return lblpaymenttotalamountowing;
    }
	
	public WebElement Amount_Paid_By_Credit_Card_Label(){
		return amount_paid_by_credit_card_lbl;
	}
	
	public WebElement Amount_Paid_By_PO_Label(){
		return amount_paid_by_PO_lbl;
	}
	
	public WebElement Amount_Paid_By_Credit_Card(){
		return amount_paid_by_credit_card;
	}
	
	public WebElement Amount_Paid_By_PO(){
		return amount_paid_by_PO;
	}
	
	public WebElement Paid_Amount_for_PO(){
		return paid_amount_for_PO;
	}
	
	@Override
	public void CSR_sees_Amount_Paid_by_Credit_Card_label(){
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		Boolean amt_paid_by_credit_card_lbl_displayed = Amount_Paid_By_Credit_Card_Label().isDisplayed();
		
		Assert.assertTrue(amt_paid_by_credit_card_lbl_displayed, "The 'Amount Paid by Credit Card' label is not displaying.");
	}
	
	@Override
	public void CSR_sees_Amount_Paid_by_PO_label(){
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		Boolean amt_paid_by_PO_lbl_displayed = Amount_Paid_By_PO_Label().isDisplayed();
		
		Assert.assertTrue(amt_paid_by_PO_lbl_displayed, "The 'Amount Paid by Purchase Order' label is not displaying.");
	}
	
	@Override
	public void CSR_sees_the_remaining_dollar_amount_for_credit_card(){
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String act_amount = Amount_Paid_By_Credit_Card().getText();
		act_amount = act_amount.trim();
		act_amount = act_amount.substring(1);
		
		Double get_total_amt = SCHUtils.convertDollarsToDouble(getlblpaymenttotalamountowing(), 1);
		Double get_payment_amt = Double.parseDouble(TestBaseProvider.getTestBase().getTestData().getString("PaymentAmt"));
		String exp_amount = String.format("%.2f", get_total_amt - get_payment_amt);
		
		//System.out.println(exp_amount);
		
		Assert.assertEquals(act_amount, exp_amount, "The amount for the credit card is not the same");
		System.out.println("The credit card amount is correct amount - " + act_amount);
	}
	
	@Override
	public void CSR_sees_the_dollar_amount_entered_for_PO(){
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		Double act_amount = SCHUtils.convertDollarsToDouble(Amount_Paid_By_PO(), 1);
	
		String test_data = String.valueOf(TestBaseProvider.getTestBase().getTestData().getString("PaymentAmt"));
		Double exp_amount;
		
		if(test_data.equals("N/A")){
			exp_amount = SCHUtils.convertDollarsToDouble(getlblpaymenttotalamountowing(), 1);
		} else {
			exp_amount = Double.parseDouble(test_data);
		}
			
		Assert.assertEquals(act_amount, exp_amount, "The amount for the PO is not the same.");
		System.out.println("The PO amount is correct amount - " + act_amount);
	}
	
	@Override
	public void CSR_sees_the_same_amount_for_PO_and_Total_Owing(){
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String act_amount = Amount_Paid_By_PO().getText();
		String exp_amount = getlblpaymenttotalamountowing().getText();
		
		Assert.assertEquals(act_amount, exp_amount, "The amount for the PO is not the same as the amount owing.");
	}
	
	@Override
	public void CSR_enters_amount_for_PO(){
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		/*
		String Total_Amount_Owing_Value=getlblpaymenttotalamountowing().getText();
		Total_Amount_Owing_Value=Total_Amount_Owing_Value.trim();
		Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
		double Total_Amount_Owing_Value_is=Double.parseDouble(Total_Amount_Owing_Value);
		double Paid_Amount=TestBaseProvider.getTestBase().getTestData().getDouble("PaymentAmt");
		
		if (Total_Amount_Owing_Value_is > Paid_Amount) {
			
			String Paid_Amount_is=Double.toString(Paid_Amount-1);
			
			Paid_Amount_for_PO().click();
			Paid_Amount_for_PO().clear();
			PauseUtil.pause(2000);
			Paid_Amount_for_PO().sendKeys(Paid_Amount_is);
			Paid_Amount_for_PO().sendKeys(Keys.TAB);
		} else {
			Assert.fail("Total Amount Owing value is less than the Amount entered in PO field");
		}
		*/
		String Paid_Amount=TestBaseProvider.getTestBase().getTestData().getString("PaymentAmt");
		
		Paid_Amount_for_PO().click();
		Paid_Amount_for_PO().clear();
		PauseUtil.pause(2000);
		Paid_Amount_for_PO().sendKeys(Paid_Amount);
		PauseUtil.pause(2000);
		CSR_click_outside_PaymentPage().click();
	}
	
	//######################################### SCSCOD-6119 ##################################################################
	@FindBy(locator="dw.checkout.payment.CreditCard.Input")
	private WebElement amount_paid_by_credit_card_amt;
	
	public WebElement Paid_Amount_for_Credit_Card(){
		return amount_paid_by_credit_card_amt;
	}
	
	@Override
	public void CSR_enters_same_total_amount_in_PO_amount(){
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String total_amount_str = getlblpaymenttotalamountowing().getText();
		total_amount_str = total_amount_str.trim().substring(1);
		
		Paid_Amount_for_PO().click();
		Paid_Amount_for_PO().clear();
		
		PauseUtil.pause(2000);
		
		Paid_Amount_for_PO().sendKeys(total_amount_str);
		
		PauseUtil.pause(2000);
		
		CSR_click_outside_PaymentPage().click();
	}
	
	@Override
	public void CSR_enters_same_total_amount_in_credit_card_amount(){
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String total_amount_str = getlblpaymenttotalamountowing().getText();
		total_amount_str = total_amount_str.trim().substring(1);
		
		Paid_Amount_for_Credit_Card().click();
		Paid_Amount_for_Credit_Card().clear();
		
		PauseUtil.pause(2000);
		
		Paid_Amount_for_Credit_Card().sendKeys(total_amount_str);
		
		PauseUtil.pause(2000);
		
		CSR_click_outside_PaymentPage().click();
	}
	
	@Override
	public void CSR_sees_the_amount_entered_for_credit_card(){
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String act_amount = Amount_Paid_By_Credit_Card().getText();
		String exp_amount = getlblpaymenttotalamountowing().getText();
		
		Assert.assertEquals(act_amount, exp_amount, "The amount for the credit card is not the same as the amount owing.");
	}
	
	@Override
    public void teacher_sees_SFO_section_Rewards_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        try {
        	header_SFO_Rewards_page().isDisplayed();
        	System.out.println("SFO section is displayed in Redemptions & Rewards page");
		} catch (Exception e) {
			Assert.fail("SFO section is not displayed in Redemptions & Rewards page");
		}
    }
	
	@Override
    public void validate_SFO_section_subtotal_Total_GST_PST_Rewards_page() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_subTotal_is=SFO_subtotal_Rewards_page().getText().trim();
    	act_SFO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_subTotal_is);
    	double act_SFO_subTotal=Double.parseDouble(act_SFO_subTotal_is);
    	
    	String act_GST_in_SFO_section=GST_in_SFO_section_Rewards_page().getText().trim();
    	act_GST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_SFO_section);
    	double act_GST_val_in_SFO_section=Double.parseDouble(act_GST_in_SFO_section);
    	
    	String act_PST_in_SFO_section=PST_in_SFO_section_Rewards_page().getText().trim();
    	act_PST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_PST_in_SFO_section);
    	double act_PST_val_in_SFO_section=Double.parseDouble(act_PST_in_SFO_section);
    	
    	double exp_GST_val_in_SFO_section=(double)(act_SFO_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_SFO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_SFO_section));
    	
    	Assert.assertEquals(act_GST_val_in_SFO_section, exp_GST_val_in_SFO_section, "Incorrect GST value is displayed in SFO section in Rewards page");
		
    	
    	double exp_PST_val_in_SFO_section=(double)(act_SFO_subTotal * stateTaxPST) / 100;
    	exp_PST_val_in_SFO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_val_in_SFO_section));
    	
    	Assert.assertEquals(act_PST_val_in_SFO_section, exp_PST_val_in_SFO_section, "Incorrect PST value is displayed in SFO section in Rewards page");
		
    	String act_SFO_Total_is=SFO_Total_Rewards_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	double exp_SFO_Total=act_SFO_subTotal+exp_GST_val_in_SFO_section+exp_PST_val_in_SFO_section;
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void validate_SFO_section_subtotal_Total_GST_QST_Rewards_page() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxQST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxQST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_subTotal_is=SFO_subtotal_Rewards_page().getText().trim();
    	act_SFO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_subTotal_is);
    	double act_SFO_subTotal=Double.parseDouble(act_SFO_subTotal_is);
    	
    	String act_GST_in_SFO_section=GST_in_SFO_section_Rewards_page().getText().trim();
    	act_GST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_SFO_section);
    	double act_GST_val_in_SFO_section=Double.parseDouble(act_GST_in_SFO_section);
    	
    	String act_QST_in_SFO_section=QST_in_SFO_section_Rewards_page().getText().trim();
    	act_QST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_QST_in_SFO_section);
    	double act_QST_val_in_SFO_section=Double.parseDouble(act_QST_in_SFO_section);
    	
    	double exp_GST_val_in_SFO_section=(double)(act_SFO_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_SFO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_SFO_section));
    	
    	Assert.assertEquals(act_GST_val_in_SFO_section, exp_GST_val_in_SFO_section, "Incorrect GST value is displayed in SFO section in Rewards page");
		
    	
    	double exp_QST_val_in_SFO_section=(double)(act_SFO_subTotal * stateTaxQST) / 100;
    	exp_QST_val_in_SFO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_QST_val_in_SFO_section));
    	
    	Assert.assertEquals(act_QST_val_in_SFO_section, exp_QST_val_in_SFO_section, "Incorrect QST value is displayed in SFO section in Rewards page");
		
    	String act_SFO_Total_is=SFO_Total_Rewards_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	double exp_SFO_Total=act_SFO_subTotal+exp_GST_val_in_SFO_section+exp_QST_val_in_SFO_section;
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void validate_SFO_section_subtotal_Total_HST_Rewards_page() {
    	double stateTaxHST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxHST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_subTotal_is=SFO_subtotal_Rewards_page().getText().trim();
    	act_SFO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_subTotal_is);
    	double act_SFO_subTotal=Double.parseDouble(act_SFO_subTotal_is);
    	
    	String act_HST_in_SFO_section=HST_in_SFO_section_Rewards_page().getText().trim();
    	act_HST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_HST_in_SFO_section);
    	double act_HST_val_in_SFO_section=Double.parseDouble(act_HST_in_SFO_section);
    	
    	double exp_HST_val_in_SFO_section=(double)(act_SFO_subTotal * stateTaxHST) / 100;
    	exp_HST_val_in_SFO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_HST_val_in_SFO_section));
    	
    	Assert.assertEquals(act_HST_val_in_SFO_section, exp_HST_val_in_SFO_section, "Incorrect HST value is displayed in SFO section in Rewards page");
		
    	String act_SFO_Total_is=SFO_Total_Rewards_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	double exp_SFO_Total=act_SFO_subTotal+exp_HST_val_in_SFO_section;
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void validate_SFO_section_subtotal_Total_GST_Rewards_page() {
    	double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_subTotal_is=SFO_subtotal_Rewards_page().getText().trim();
    	act_SFO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_subTotal_is);
    	double act_SFO_subTotal=Double.parseDouble(act_SFO_subTotal_is);
    	
    	String act_GST_in_SFO_section=GST_in_SFO_section_Rewards_page().getText().trim();
    	act_GST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_SFO_section);
    	double act_GST_val_in_SFO_section=Double.parseDouble(act_GST_in_SFO_section);
    	
    	double exp_GST_val_in_SFO_section=(double)(act_SFO_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_SFO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_SFO_section));
    	
    	Assert.assertEquals(act_GST_val_in_SFO_section, exp_GST_val_in_SFO_section, "Incorrect GST value is displayed in SFO section in Rewards page");
		
    	String act_SFO_Total_is=SFO_Total_Rewards_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	double exp_SFO_Total=act_SFO_subTotal+exp_GST_val_in_SFO_section;
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void No_tax_validation_of_SFO_section_subtotal_Total_GST_QST_Rewards_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_subTotal_is=SFO_subtotal_Rewards_page().getText().trim();
    	act_SFO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_subTotal_is);
    	double act_SFO_subTotal=Double.parseDouble(act_SFO_subTotal_is);
    	
    	String act_GST_in_SFO_section=GST_in_SFO_section_Rewards_page().getText().trim();
    	act_GST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_SFO_section);
    	double act_GST_val_in_SFO_section=Double.parseDouble(act_GST_in_SFO_section);
    	
    	String act_QST_in_SFO_section=QST_in_SFO_section_Rewards_page().getText().trim();
    	act_QST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_QST_in_SFO_section);
    	double act_QST_val_in_SFO_section=Double.parseDouble(act_QST_in_SFO_section);
    	
    	double exp_GST_val_in_SFO_section=0;
    	Assert.assertEquals(act_GST_val_in_SFO_section, exp_GST_val_in_SFO_section, "GST value is displayed in SFO section in Rewards page");
		
    	double exp_QST_val_in_SFO_section=0;
    	Assert.assertEquals(act_QST_val_in_SFO_section, exp_QST_val_in_SFO_section, "QST value is displayed in SFO section in Rewards page");
		
    	String act_SFO_Total_is=SFO_Total_Rewards_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	double exp_SFO_Total=act_SFO_subTotal+exp_GST_val_in_SFO_section+exp_QST_val_in_SFO_section;
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void No_tax_validation_of_SFO_section_subtotal_Total_GST_PST_Rewards_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_subTotal_is=SFO_subtotal_Rewards_page().getText().trim();
    	act_SFO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_subTotal_is);
    	double act_SFO_subTotal=Double.parseDouble(act_SFO_subTotal_is);
    	
    	String act_GST_in_SFO_section=GST_in_SFO_section_Rewards_page().getText().trim();
    	act_GST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_SFO_section);
    	double act_GST_val_in_SFO_section=Double.parseDouble(act_GST_in_SFO_section);
    	
    	String act_PST_in_SFO_section=PST_in_SFO_section_Rewards_page().getText().trim();
    	act_PST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_PST_in_SFO_section);
    	double act_PST_val_in_SFO_section=Double.parseDouble(act_PST_in_SFO_section);
    	
    	double exp_GST_val_in_SFO_section=0;
    	Assert.assertEquals(act_GST_val_in_SFO_section, exp_GST_val_in_SFO_section, "GST value is displayed in SFO section in Rewards page");
		
    	double exp_PST_val_in_SFO_section=0;
    	Assert.assertEquals(act_PST_val_in_SFO_section, exp_PST_val_in_SFO_section, "PST value is displayed in SFO section in Rewards page");
		
    	String act_SFO_Total_is=SFO_Total_Rewards_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	double exp_SFO_Total=act_SFO_subTotal+exp_GST_val_in_SFO_section+exp_PST_val_in_SFO_section;
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void No_tax_validation_of_SFO_section_subtotal_Total_HST_Rewards_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_subTotal_is=SFO_subtotal_Rewards_page().getText().trim();
    	act_SFO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_subTotal_is);
    	double act_SFO_subTotal=Double.parseDouble(act_SFO_subTotal_is);
    	
    	String act_HST_in_SFO_section=HST_in_SFO_section_Rewards_page().getText().trim();
    	act_HST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_HST_in_SFO_section);
    	double act_HST_val_in_SFO_section=Double.parseDouble(act_HST_in_SFO_section);
    	
    	double exp_HST_val_in_SFO_section=0;
    	Assert.assertEquals(act_HST_val_in_SFO_section, exp_HST_val_in_SFO_section, "HST value is displayed in SFO section in Rewards page");
		
    	String act_SFO_Total_is=SFO_Total_Rewards_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	double exp_SFO_Total=act_SFO_subTotal+exp_HST_val_in_SFO_section;
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void No_tax_validation_of_SFO_section_subtotal_Total_GST_Rewards_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_subTotal_is=SFO_subtotal_Rewards_page().getText().trim();
    	act_SFO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_subTotal_is);
    	double act_SFO_subTotal=Double.parseDouble(act_SFO_subTotal_is);
    	
    	String act_GST_in_SFO_section=GST_in_SFO_section_Rewards_page().getText().trim();
    	act_GST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_SFO_section);
    	double act_GST_val_in_SFO_section=Double.parseDouble(act_GST_in_SFO_section);
    	
    	double exp_GST_val_in_SFO_section=0;
    	Assert.assertEquals(act_GST_val_in_SFO_section, exp_GST_val_in_SFO_section, "GST value is displayed in SFO section in Rewards page");
		
    	String act_SFO_Total_is=SFO_Total_Rewards_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	double exp_SFO_Total=act_SFO_subTotal+exp_GST_val_in_SFO_section;
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void teacher_sees_YTO_section_Rewards_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        try {
        	header_YTO_Rewards_page().isDisplayed();
        	System.out.println("YTO section is displayed in Redemptions & Rewards page");
		} catch (Exception e) {
			Assert.fail("YTO section is not displayed in Redemptions & Rewards page");
		}
    }
	
	@Override
    public void validate_YTO_section_subtotal_Total_GST_PST_Rewards_page() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_subTotal_is=YTO_subtotal_Rewards_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	String act_GST_in_YTO_section=GST_in_YTO_section_Rewards_page().getText().trim();
    	act_GST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_YTO_section);
    	double act_GST_val_in_YTO_section=Double.parseDouble(act_GST_in_YTO_section);
    	
    	String act_PST_in_YTO_section=PST_in_YTO_section_Rewards_page().getText().trim();
    	act_PST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_PST_in_YTO_section);
    	double act_PST_val_in_YTO_section=Double.parseDouble(act_PST_in_YTO_section);
    	
    	double exp_GST_val_in_YTO_section=(double)(act_YTO_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_YTO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_YTO_section));
    	
    	Assert.assertEquals(act_GST_val_in_YTO_section, exp_GST_val_in_YTO_section, "Incorrect GST value is displayed in YTO section in Rewards page");
		
    	
    	double exp_PST_val_in_YTO_section=(double)(act_YTO_subTotal * stateTaxPST) / 100;
    	exp_PST_val_in_YTO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_val_in_YTO_section));
    	
    	Assert.assertEquals(act_PST_val_in_YTO_section, exp_PST_val_in_YTO_section, "Incorrect PST value is displayed in YTO section in Rewards page");
		
    	String act_YTO_Total_is=YTO_Total_Rewards_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	double exp_YTO_Total=act_YTO_subTotal+exp_GST_val_in_YTO_section+exp_PST_val_in_YTO_section;
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void validate_YTO_section_subtotal_Total_GST_QST_Rewards_page() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxQST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxQST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_subTotal_is=YTO_subtotal_Rewards_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	String act_GST_in_YTO_section=GST_in_YTO_section_Rewards_page().getText().trim();
    	act_GST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_YTO_section);
    	double act_GST_val_in_YTO_section=Double.parseDouble(act_GST_in_YTO_section);
    	
    	String act_QST_in_YTO_section=QST_in_YTO_section_Rewards_page().getText().trim();
    	act_QST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_QST_in_YTO_section);
    	double act_QST_val_in_YTO_section=Double.parseDouble(act_QST_in_YTO_section);
    	
    	double exp_GST_val_in_YTO_section=(double)(act_YTO_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_YTO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_YTO_section));
    	
    	Assert.assertEquals(act_GST_val_in_YTO_section, exp_GST_val_in_YTO_section, "Incorrect GST value is displayed in YTO section in Rewards page");
		
    	
    	double exp_QST_val_in_YTO_section=(double)(act_YTO_subTotal * stateTaxQST) / 100;
    	exp_QST_val_in_YTO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_QST_val_in_YTO_section));
    	
    	Assert.assertEquals(act_QST_val_in_YTO_section, exp_QST_val_in_YTO_section, "Incorrect QST value is displayed in YTO section in Rewards page");
		
    	String act_YTO_Total_is=YTO_Total_Rewards_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	double exp_YTO_Total=act_YTO_subTotal+exp_GST_val_in_YTO_section+exp_QST_val_in_YTO_section;
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void validate_YTO_section_subtotal_Total_HST_Rewards_page() {
    	double stateTaxHST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxHST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_subTotal_is=YTO_subtotal_Rewards_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	String act_HST_in_YTO_section=HST_in_YTO_section_Rewards_page().getText().trim();
    	act_HST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_HST_in_YTO_section);
    	double act_HST_val_in_YTO_section=Double.parseDouble(act_HST_in_YTO_section);
    	
    	double exp_HST_val_in_YTO_section=(double)(act_YTO_subTotal * stateTaxHST) / 100;
    	exp_HST_val_in_YTO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_HST_val_in_YTO_section));
    	
    	Assert.assertEquals(act_HST_val_in_YTO_section, exp_HST_val_in_YTO_section, "Incorrect HST value is displayed in YTO section in Rewards page");
		
    	String act_YTO_Total_is=YTO_Total_Rewards_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	double exp_YTO_Total=act_YTO_subTotal+exp_HST_val_in_YTO_section;
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void validate_YTO_section_subtotal_Total_GST_Rewards_page() {
    	double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_subTotal_is=YTO_subtotal_Rewards_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	String act_GST_in_YTO_section=GST_in_YTO_section_Rewards_page().getText().trim();
    	act_GST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_YTO_section);
    	double act_GST_val_in_YTO_section=Double.parseDouble(act_GST_in_YTO_section);
    	
    	double exp_GST_val_in_YTO_section=(double)(act_YTO_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_YTO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_YTO_section));
    	
    	Assert.assertEquals(act_GST_val_in_YTO_section, exp_GST_val_in_YTO_section, "Incorrect GST value is displayed in YTO section in Rewards page");
		
    	String act_YTO_Total_is=YTO_Total_Rewards_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	double exp_YTO_Total=act_YTO_subTotal+exp_GST_val_in_YTO_section;
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void No_tax_validation_of_YTO_section_subtotal_Total_GST_QST_Rewards_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_subTotal_is=YTO_subtotal_Rewards_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	String act_GST_in_YTO_section=GST_in_YTO_section_Rewards_page().getText().trim();
    	act_GST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_YTO_section);
    	double act_GST_val_in_YTO_section=Double.parseDouble(act_GST_in_YTO_section);
    	
    	String act_QST_in_YTO_section=QST_in_YTO_section_Rewards_page().getText().trim();
    	act_QST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_QST_in_YTO_section);
    	double act_QST_val_in_YTO_section=Double.parseDouble(act_QST_in_YTO_section);
    	
    	double exp_GST_val_in_YTO_section=0;
    	Assert.assertEquals(act_GST_val_in_YTO_section, exp_GST_val_in_YTO_section, "GST value is displayed in YTO section in Rewards page");
		
    	double exp_QST_val_in_YTO_section=0;
    	Assert.assertEquals(act_QST_val_in_YTO_section, exp_QST_val_in_YTO_section, "QST value is displayed in YTO section in Rewards page");
		
    	String act_YTO_Total_is=YTO_Total_Rewards_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	double exp_YTO_Total=act_YTO_subTotal+exp_GST_val_in_YTO_section+exp_QST_val_in_YTO_section;
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void No_tax_validation_of_YTO_section_subtotal_Total_GST_PST_Rewards_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_subTotal_is=YTO_subtotal_Rewards_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	String act_GST_in_YTO_section=GST_in_YTO_section_Rewards_page().getText().trim();
    	act_GST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_YTO_section);
    	double act_GST_val_in_YTO_section=Double.parseDouble(act_GST_in_YTO_section);
    	
    	String act_PST_in_YTO_section=PST_in_YTO_section_Rewards_page().getText().trim();
    	act_PST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_PST_in_YTO_section);
    	double act_PST_val_in_YTO_section=Double.parseDouble(act_PST_in_YTO_section);
    	
    	double exp_GST_val_in_YTO_section=0;
    	Assert.assertEquals(act_GST_val_in_YTO_section, exp_GST_val_in_YTO_section, "GST value is displayed in YTO section in Rewards page");
		
    	double exp_PST_val_in_YTO_section=0;
    	Assert.assertEquals(act_PST_val_in_YTO_section, exp_PST_val_in_YTO_section, "PST value is displayed in YTO section in Rewards page");
		
    	String act_YTO_Total_is=YTO_Total_Rewards_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	double exp_YTO_Total=act_YTO_subTotal+exp_GST_val_in_YTO_section+exp_PST_val_in_YTO_section;
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void No_tax_validation_of_YTO_section_subtotal_Total_HST_Rewards_page() {
		
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_subTotal_is=YTO_subtotal_Rewards_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	String act_HST_in_YTO_section=HST_in_YTO_section_Rewards_page().getText().trim();
    	act_HST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_HST_in_YTO_section);
    	double act_HST_val_in_YTO_section=Double.parseDouble(act_HST_in_YTO_section);
    	
    	double exp_HST_val_in_YTO_section=0;
    	Assert.assertEquals(act_HST_val_in_YTO_section, exp_HST_val_in_YTO_section, "HST value is displayed in YTO section in Rewards page");
		
    	String act_YTO_Total_is=YTO_Total_Rewards_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	double exp_YTO_Total=act_YTO_subTotal+exp_HST_val_in_YTO_section;
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void No_tax_validation_of_YTO_section_subtotal_Total_GST_Rewards_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_subTotal_is=YTO_subtotal_Rewards_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	String act_GST_in_YTO_section=GST_in_YTO_section_Rewards_page().getText().trim();
    	act_GST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_YTO_section);
    	double act_GST_val_in_YTO_section=Double.parseDouble(act_GST_in_YTO_section);
    	
    	double exp_GST_val_in_YTO_section=0;
    	Assert.assertEquals(act_GST_val_in_YTO_section, exp_GST_val_in_YTO_section, "GST value is displayed in YTO section in Rewards page");
		
    	String act_YTO_Total_is=YTO_Total_Rewards_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	double exp_YTO_Total=act_YTO_subTotal+exp_GST_val_in_YTO_section;
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void teacher_sees_TE_section_Rewards_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        try {
        	header_TE_Rewards_page().isDisplayed();
        	System.out.println("TE section is displayed in Redemptions & Rewards page");
		} catch (Exception e) {
			Assert.fail("TE section is not displayed in Redemptions & Rewards page");
		}
    }
	
	@Override
    public void validate_TE_section_subtotal_Total_GST_PST_Rewards_page() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_subTotal_is=TE_subtotal_Rewards_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	String act_GST_in_TE_section=GST_in_TE_section_Rewards_page().getText().trim();
    	act_GST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_TE_section);
    	double act_GST_val_in_TE_section=Double.parseDouble(act_GST_in_TE_section);
    	
    	String act_PST_in_TE_section=PST_in_TE_section_Rewards_page().getText().trim();
    	act_PST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_PST_in_TE_section);
    	double act_PST_val_in_TE_section=Double.parseDouble(act_PST_in_TE_section);
    	
    	double exp_GST_val_in_TE_section=(double)(act_TE_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_TE_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_TE_section));
    	
    	Assert.assertEquals(act_GST_val_in_TE_section, exp_GST_val_in_TE_section, "Incorrect GST value is displayed in TE section in Rewards page");
		
    	
    	double exp_PST_val_in_TE_section=(double)(act_TE_subTotal * stateTaxPST) / 100;
    	exp_PST_val_in_TE_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_val_in_TE_section));
    	
    	Assert.assertEquals(act_PST_val_in_TE_section, exp_PST_val_in_TE_section, "Incorrect PST value is displayed in TE section in Rewards page");
		
    	String act_TE_Total_is=TE_Total_Rewards_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	
    	double exp_TE_Total=act_TE_subTotal+exp_GST_val_in_TE_section+exp_PST_val_in_TE_section;
    	exp_TE_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_Total));
    	
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void validate_TE_section_subtotal_Total_GST_QST_Rewards_page() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxQST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxQST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_subTotal_is=TE_subtotal_Rewards_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	String act_GST_in_TE_section=GST_in_TE_section_Rewards_page().getText().trim();
    	act_GST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_TE_section);
    	double act_GST_val_in_TE_section=Double.parseDouble(act_GST_in_TE_section);
    	
    	String act_QST_in_TE_section=QST_in_TE_section_Rewards_page().getText().trim();
    	act_QST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_QST_in_TE_section);
    	double act_QST_val_in_TE_section=Double.parseDouble(act_QST_in_TE_section);
    	
    	double exp_GST_val_in_TE_section=(double)(act_TE_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_TE_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_TE_section));
    	
    	Assert.assertEquals(act_GST_val_in_TE_section, exp_GST_val_in_TE_section, "Incorrect GST value is displayed in TE section in Rewards page");
		
    	
    	double exp_QST_val_in_TE_section=(double)(act_TE_subTotal * stateTaxQST) / 100;
    	exp_QST_val_in_TE_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_QST_val_in_TE_section));
    	
    	Assert.assertEquals(act_QST_val_in_TE_section, exp_QST_val_in_TE_section, "Incorrect QST value is displayed in TE section in Rewards page");
		
    	String act_TE_Total_is=TE_Total_Rewards_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	
    	double exp_TE_Total=act_TE_subTotal+exp_GST_val_in_TE_section+exp_QST_val_in_TE_section;
    	exp_TE_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_Total));
    	
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void validate_TE_section_subtotal_Total_HST_Rewards_page() {
    	double stateTaxHST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxHST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_subTotal_is=TE_subtotal_Rewards_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	String act_HST_in_TE_section=HST_in_TE_section_Rewards_page().getText().trim();
    	act_HST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_HST_in_TE_section);
    	double act_HST_val_in_TE_section=Double.parseDouble(act_HST_in_TE_section);
    	
    	double exp_HST_val_in_TE_section=(double)(act_TE_subTotal * stateTaxHST) / 100;
    	exp_HST_val_in_TE_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_HST_val_in_TE_section));
    	
    	Assert.assertEquals(act_HST_val_in_TE_section, exp_HST_val_in_TE_section, "Incorrect HST value is displayed in TE section in Rewards page");
		
    	String act_TE_Total_is=TE_Total_Rewards_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	
    	double exp_TE_Total=act_TE_subTotal+exp_HST_val_in_TE_section;
    	exp_TE_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_Total));
    	
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void validate_TE_section_subtotal_Total_GST_Rewards_page() {
    	double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_subTotal_is=TE_subtotal_Rewards_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	String act_GST_in_TE_section=GST_in_TE_section_Rewards_page().getText().trim();
    	act_GST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_TE_section);
    	double act_GST_val_in_TE_section=Double.parseDouble(act_GST_in_TE_section);
    	
    	double exp_GST_val_in_TE_section=(double)(act_TE_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_TE_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_TE_section));
    	
    	Assert.assertEquals(act_GST_val_in_TE_section, exp_GST_val_in_TE_section, "Incorrect GST value is displayed in TE section in Rewards page");
		
    	String act_TE_Total_is=TE_Total_Rewards_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	
    	double exp_TE_Total=act_TE_subTotal+exp_GST_val_in_TE_section;
    	exp_TE_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_Total));
    	
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void No_tax_validation_of_TE_section_subtotal_Total_GST_QST_Rewards_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_subTotal_is=TE_subtotal_Rewards_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	String act_GST_in_TE_section=GST_in_TE_section_Rewards_page().getText().trim();
    	act_GST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_TE_section);
    	double act_GST_val_in_TE_section=Double.parseDouble(act_GST_in_TE_section);
    	
    	String act_QST_in_TE_section=QST_in_TE_section_Rewards_page().getText().trim();
    	act_QST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_QST_in_TE_section);
    	double act_QST_val_in_TE_section=Double.parseDouble(act_QST_in_TE_section);
    	
    	double exp_GST_val_in_TE_section=0;
    	Assert.assertEquals(act_GST_val_in_TE_section, exp_GST_val_in_TE_section, "GST value is displayed in TE section in Rewards page");
		
    	double exp_QST_val_in_TE_section=0;
    	Assert.assertEquals(act_QST_val_in_TE_section, exp_QST_val_in_TE_section, "QST value is displayed in TE section in Rewards page");
		
    	String act_TE_Total_is=TE_Total_Rewards_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	
    	double exp_TE_Total=act_TE_subTotal+exp_GST_val_in_TE_section+exp_QST_val_in_TE_section;
    	exp_TE_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_Total));
    	
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void No_tax_validation_of_TE_section_subtotal_Total_GST_PST_Rewards_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_subTotal_is=TE_subtotal_Rewards_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	String act_GST_in_TE_section=GST_in_TE_section_Rewards_page().getText().trim();
    	act_GST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_TE_section);
    	double act_GST_val_in_TE_section=Double.parseDouble(act_GST_in_TE_section);
    	
    	String act_PST_in_TE_section=PST_in_TE_section_Rewards_page().getText().trim();
    	act_PST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_PST_in_TE_section);
    	double act_PST_val_in_TE_section=Double.parseDouble(act_PST_in_TE_section);
    	
    	double exp_GST_val_in_TE_section=0;
    	Assert.assertEquals(act_GST_val_in_TE_section, exp_GST_val_in_TE_section, "GST value is displayed in TE section in Rewards page");
		
    	double exp_PST_val_in_TE_section=0;
    	Assert.assertEquals(act_PST_val_in_TE_section, exp_PST_val_in_TE_section, "PST value is displayed in TE section in Rewards page");
		
    	String act_TE_Total_is=TE_Total_Rewards_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	
    	double exp_TE_Total=act_TE_subTotal+exp_GST_val_in_TE_section+exp_PST_val_in_TE_section;
    	exp_TE_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_Total));
    	
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void No_tax_validation_of_TE_section_subtotal_Total_HST_Rewards_page() {
		
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_subTotal_is=TE_subtotal_Rewards_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	String act_HST_in_TE_section=HST_in_TE_section_Rewards_page().getText().trim();
    	act_HST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_HST_in_TE_section);
    	double act_HST_val_in_TE_section=Double.parseDouble(act_HST_in_TE_section);
    	
    	double exp_HST_val_in_TE_section=0;
    	Assert.assertEquals(act_HST_val_in_TE_section, exp_HST_val_in_TE_section, "HST value is displayed in TE section in Rewards page");
		
    	String act_TE_Total_is=TE_Total_Rewards_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	
    	double exp_TE_Total=act_TE_subTotal+exp_HST_val_in_TE_section;
    	exp_TE_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_Total));
    	
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void No_tax_validation_of_TE_section_subtotal_Total_GST_Rewards_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_subTotal_is=TE_subtotal_Rewards_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	String act_GST_in_TE_section=GST_in_TE_section_Rewards_page().getText().trim();
    	act_GST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_TE_section);
    	double act_GST_val_in_TE_section=Double.parseDouble(act_GST_in_TE_section);
    	
    	double exp_GST_val_in_TE_section=0;
    	Assert.assertEquals(act_GST_val_in_TE_section, exp_GST_val_in_TE_section, "GST value is displayed in TE section in Rewards page");
		
    	String act_TE_Total_is=TE_Total_Rewards_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	
    	double exp_TE_Total=act_TE_subTotal+exp_GST_val_in_TE_section;
    	exp_TE_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_Total));
    	
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void teacher_applies_CreditNotes_for_SFO_section_in_Rewards_page() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	if (lst_btn_EDIT_SFO_section_Rewards_page().size() !=0) {
    		btn_EDIT_SFO_section_Rewards_page().click();
    		PauseUtil.waitForAjaxToComplete(2500);
        	PauseUtil.pause(1000);
		} else {
			System.out.println("Button state is : APPLY");
		}
    	fld_Credit_Notes_SFO_section_Rewards_page().click();
    	fld_Credit_Notes_SFO_section_Rewards_page().clear();
    	fld_Credit_Notes_SFO_section_Rewards_page().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("CreditNotes"));
    	PauseUtil.pause(1000);
    	btn_APPLY_SFO_section_Rewards_page().click();
    	
	}
	
	@Override
    public void validate_Applied_CreditNotes_SFO_section_subtotal_Total_GST_QST_Rewards_page() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxQST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxQST");
    	double SFO_creditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_subTotal_is=SFO_subtotal_Rewards_page().getText().trim();
    	act_SFO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_subTotal_is);
    	double act_SFO_subTotal=Double.parseDouble(act_SFO_subTotal_is);
    	
    	String act_GST_in_SFO_section=GST_in_SFO_section_Rewards_page().getText().trim();
    	act_GST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_SFO_section);
    	double act_GST_val_in_SFO_section=Double.parseDouble(act_GST_in_SFO_section);
    	
    	String act_QST_in_SFO_section=QST_in_SFO_section_Rewards_page().getText().trim();
    	act_QST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_QST_in_SFO_section);
    	double act_QST_val_in_SFO_section=Double.parseDouble(act_QST_in_SFO_section);
    	
    	double exp_GST_val_in_SFO_section=(double)(act_SFO_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_SFO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_SFO_section));
    	
    	Assert.assertEquals(act_GST_val_in_SFO_section, exp_GST_val_in_SFO_section, "Incorrect GST value is displayed in SFO section in Rewards page");
		
    	
    	double exp_QST_val_in_SFO_section=(double)(act_SFO_subTotal * stateTaxQST) / 100;
    	exp_QST_val_in_SFO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_QST_val_in_SFO_section));
    	
    	Assert.assertEquals(act_QST_val_in_SFO_section, exp_QST_val_in_SFO_section, "Incorrect QST value is displayed in SFO section in Rewards page");
		
    	String act_SFO_Total_is=SFO_Total_Rewards_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	double exp_SFO_Total=(act_SFO_subTotal+exp_GST_val_in_SFO_section+exp_QST_val_in_SFO_section)-(SFO_creditNotes);
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void validate_Applied_CreditNotes_SFO_section_subtotal_Total_GST_PST_Rewards_page() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");
    	double SFO_creditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_subTotal_is=SFO_subtotal_Rewards_page().getText().trim();
    	act_SFO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_subTotal_is);
    	double act_SFO_subTotal=Double.parseDouble(act_SFO_subTotal_is);
    	
    	String act_GST_in_SFO_section=GST_in_SFO_section_Rewards_page().getText().trim();
    	act_GST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_SFO_section);
    	double act_GST_val_in_SFO_section=Double.parseDouble(act_GST_in_SFO_section);
    	
    	String act_PST_in_SFO_section=PST_in_SFO_section_Rewards_page().getText().trim();
    	act_PST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_PST_in_SFO_section);
    	double act_PST_val_in_SFO_section=Double.parseDouble(act_PST_in_SFO_section);
    	
    	double exp_GST_val_in_SFO_section=(double)(act_SFO_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_SFO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_SFO_section));
    	
    	Assert.assertEquals(act_GST_val_in_SFO_section, exp_GST_val_in_SFO_section, "Incorrect GST value is displayed in SFO section in Rewards page");
		
    	
    	double exp_PST_val_in_SFO_section=(double)(act_SFO_subTotal * stateTaxPST) / 100;
    	exp_PST_val_in_SFO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_val_in_SFO_section));
    	
    	Assert.assertEquals(act_PST_val_in_SFO_section, exp_PST_val_in_SFO_section, "Incorrect PST value is displayed in SFO section in Rewards page");
		
    	String act_SFO_Total_is=SFO_Total_Rewards_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	double exp_SFO_Total=(act_SFO_subTotal+exp_GST_val_in_SFO_section+exp_PST_val_in_SFO_section)-(SFO_creditNotes);
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void validate_Applied_CreditNotes_SFO_section_subtotal_Total_HST_Rewards_page() {
    	double stateTaxHST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxHST");
    	double SFO_creditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_subTotal_is=SFO_subtotal_Rewards_page().getText().trim();
    	act_SFO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_subTotal_is);
    	double act_SFO_subTotal=Double.parseDouble(act_SFO_subTotal_is);
    	
    	String act_HST_in_SFO_section=HST_in_SFO_section_Rewards_page().getText().trim();
    	act_HST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_HST_in_SFO_section);
    	double act_HST_val_in_SFO_section=Double.parseDouble(act_HST_in_SFO_section);
    	
    	double exp_HST_val_in_SFO_section=(double)(act_SFO_subTotal * stateTaxHST) / 100;
    	exp_HST_val_in_SFO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_HST_val_in_SFO_section));
    	
    	Assert.assertEquals(act_HST_val_in_SFO_section, exp_HST_val_in_SFO_section, "Incorrect HST value is displayed in SFO section in Rewards page");
		
    	String act_SFO_Total_is=SFO_Total_Rewards_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	double exp_SFO_Total=(act_SFO_subTotal+exp_HST_val_in_SFO_section)-(SFO_creditNotes);
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void validate_Applied_CreditNotes_SFO_section_subtotal_Total_GST_Rewards_page() {
    	double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");
    	double SFO_creditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_subTotal_is=SFO_subtotal_Rewards_page().getText().trim();
    	act_SFO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_subTotal_is);
    	double act_SFO_subTotal=Double.parseDouble(act_SFO_subTotal_is);
    	
    	String act_GST_in_SFO_section=GST_in_SFO_section_Rewards_page().getText().trim();
    	act_GST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_SFO_section);
    	double act_GST_val_in_SFO_section=Double.parseDouble(act_GST_in_SFO_section);
    	
    	double exp_GST_val_in_SFO_section=(double)(act_SFO_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_SFO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_SFO_section));
    	
    	Assert.assertEquals(act_GST_val_in_SFO_section, exp_GST_val_in_SFO_section, "Incorrect GST value is displayed in SFO section in Rewards page");
		
    	String act_SFO_Total_is=SFO_Total_Rewards_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	double exp_SFO_Total=(act_SFO_subTotal+exp_GST_val_in_SFO_section)-(SFO_creditNotes);
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void teacher_applies_BonusBank_for_YTO_section_in_Rewards_page() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	if (lst_btn_EDIT_YTO_section_Rewards_page().size() !=0) {
    		btn_EDIT_YTO_section_Rewards_page().click();
    		PauseUtil.waitForAjaxToComplete(2500);
        	PauseUtil.pause(1000);
		} else {
			System.out.println("Button state is : APPLY");
		}
    	fld_Bonus_Bank_YTO_section_Rewards_page().click();
    	fld_Bonus_Bank_YTO_section_Rewards_page().clear();
    	fld_Bonus_Bank_YTO_section_Rewards_page().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("BonusBank"));
    	PauseUtil.pause(1000);
    	btn_APPLY_YTO_section_Rewards_page().click();
    	
	}
	
	@Override
    public void teacher_applies_CreditNotes_for_YTO_section_in_Rewards_page() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	if (lst_btn_EDIT_YTO_section_Rewards_page().size() !=0) {
    		btn_EDIT_YTO_section_Rewards_page().click();
    		PauseUtil.waitForAjaxToComplete(2500);
        	PauseUtil.pause(1000);
		} else {
			System.out.println("Button state is : APPLY");
		}
    	fld_Credit_Notes_YTO_section_Rewards_page().click();
    	fld_Credit_Notes_YTO_section_Rewards_page().clear();
    	fld_Credit_Notes_YTO_section_Rewards_page().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("CreditNotes"));
    	PauseUtil.pause(1000);
    	btn_APPLY_YTO_section_Rewards_page().click();
    	
	}
	
	@Override
    public void teacher_applies_BonusBank_for_TE_section_in_Rewards_page() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	if (lst_btn_EDIT_TE_section_Rewards_page().size() !=0) {
    		btn_EDIT_TE_section_Rewards_page().click();
    		PauseUtil.waitForAjaxToComplete(2500);
        	PauseUtil.pause(1000);
		} else {
			System.out.println("Button state is : APPLY");
		}
    	fld_Bonus_Bank_TE_section_Rewards_page().click();
    	fld_Bonus_Bank_TE_section_Rewards_page().clear();
    	fld_Bonus_Bank_TE_section_Rewards_page().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("BonusBank"));
    	PauseUtil.pause(1000);
    	btn_APPLY_TE_section_Rewards_page().click();
    	
	}
	
	@Override
    public void teacher_applies_CreditNotes_for_TE_section_in_Rewards_page() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	if (lst_btn_EDIT_TE_section_Rewards_page().size() !=0) {
    		btn_EDIT_TE_section_Rewards_page().click();
    		PauseUtil.waitForAjaxToComplete(2500);
        	PauseUtil.pause(1000);
		} else {
			System.out.println("Button state is : APPLY");
		}
    	fld_Credit_Notes_TE_section_Rewards_page().click();
    	fld_Credit_Notes_TE_section_Rewards_page().clear();
    	fld_Credit_Notes_TE_section_Rewards_page().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("CreditNotes"));
    	PauseUtil.pause(1000);
    	btn_APPLY_TE_section_Rewards_page().click();
	}
	
	@Override
    public void validate_Applied_BonusBank_CreditNotes_YTO_section_subtotal_Total_GST_QST_Rewards_page() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxQST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxQST");
    	double YTO_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double YTO_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_subTotal_is=YTO_subtotal_Rewards_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	String act_GST_in_YTO_section=GST_in_YTO_section_Rewards_page().getText().trim();
    	act_GST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_YTO_section);
    	double act_GST_val_in_YTO_section=Double.parseDouble(act_GST_in_YTO_section);
    	
    	String act_QST_in_YTO_section=QST_in_YTO_section_Rewards_page().getText().trim();
    	act_QST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_QST_in_YTO_section);
    	double act_QST_val_in_YTO_section=Double.parseDouble(act_QST_in_YTO_section);
    	
    	double exp_GST_val_in_YTO_section=(double)(act_YTO_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_YTO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_YTO_section));
    	
    	Assert.assertEquals(act_GST_val_in_YTO_section, exp_GST_val_in_YTO_section, "Incorrect GST value is displayed in YTO section in Rewards page");
		
    	
    	double exp_QST_val_in_YTO_section=(double)(act_YTO_subTotal * stateTaxQST) / 100;
    	exp_QST_val_in_YTO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_QST_val_in_YTO_section));
    	
    	Assert.assertEquals(act_QST_val_in_YTO_section, exp_QST_val_in_YTO_section, "Incorrect QST value is displayed in YTO section in Rewards page");
		
    	String act_YTO_Total_is=YTO_Total_Rewards_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	double exp_YTO_Total=(act_YTO_subTotal+exp_GST_val_in_YTO_section+exp_QST_val_in_YTO_section)-(YTO_BonusBank+YTO_CreditNotes);
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void validate_Applied_BonusBank_CreditNotes_YTO_section_subtotal_Total_GST_PST_Rewards_page() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");
    	double YTO_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double YTO_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_subTotal_is=YTO_subtotal_Rewards_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	String act_GST_in_YTO_section=GST_in_YTO_section_Rewards_page().getText().trim();
    	act_GST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_YTO_section);
    	double act_GST_val_in_YTO_section=Double.parseDouble(act_GST_in_YTO_section);
    	
    	String act_PST_in_YTO_section=PST_in_YTO_section_Rewards_page().getText().trim();
    	act_PST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_PST_in_YTO_section);
    	double act_PST_val_in_YTO_section=Double.parseDouble(act_PST_in_YTO_section);
    	
    	double exp_GST_val_in_YTO_section=(double)(act_YTO_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_YTO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_YTO_section));
    	
    	Assert.assertEquals(act_GST_val_in_YTO_section, exp_GST_val_in_YTO_section, "Incorrect GST value is displayed in YTO section in Rewards page");
		
    	
    	double exp_PST_val_in_YTO_section=(double)(act_YTO_subTotal * stateTaxPST) / 100;
    	exp_PST_val_in_YTO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_val_in_YTO_section));
    	
    	Assert.assertEquals(act_PST_val_in_YTO_section, exp_PST_val_in_YTO_section, "Incorrect PST value is displayed in YTO section in Rewards page");
		
    	String act_YTO_Total_is=YTO_Total_Rewards_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	double exp_YTO_Total=(act_YTO_subTotal+exp_GST_val_in_YTO_section+exp_PST_val_in_YTO_section)-(YTO_BonusBank+YTO_CreditNotes);
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void validate_Applied_BonusBank_CreditNotes_YTO_section_subtotal_Total_HST_Rewards_page() {
    	double stateTaxHST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxHST");
    	double YTO_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double YTO_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_subTotal_is=YTO_subtotal_Rewards_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	String act_HST_in_YTO_section=HST_in_YTO_section_Rewards_page().getText().trim();
    	act_HST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_HST_in_YTO_section);
    	double act_HST_val_in_YTO_section=Double.parseDouble(act_HST_in_YTO_section);
    	
    	double exp_HST_val_in_YTO_section=(double)(act_YTO_subTotal * stateTaxHST) / 100;
    	exp_HST_val_in_YTO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_HST_val_in_YTO_section));
    	
    	Assert.assertEquals(act_HST_val_in_YTO_section, exp_HST_val_in_YTO_section, "Incorrect HST value is displayed in YTO section in Rewards page");
		
    	String act_YTO_Total_is=YTO_Total_Rewards_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	double exp_YTO_Total=(act_YTO_subTotal+exp_HST_val_in_YTO_section)-(YTO_BonusBank+YTO_CreditNotes);
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void validate_Applied_BonusBank_CreditNotes_YTO_section_subtotal_Total_GST_Rewards_page() {
    	double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");
    	double YTO_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double YTO_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_subTotal_is=YTO_subtotal_Rewards_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	String act_GST_in_YTO_section=GST_in_YTO_section_Rewards_page().getText().trim();
    	act_GST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_YTO_section);
    	double act_GST_val_in_YTO_section=Double.parseDouble(act_GST_in_YTO_section);
    	
    	double exp_GST_val_in_YTO_section=(double)(act_YTO_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_YTO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_YTO_section));
    	
    	Assert.assertEquals(act_GST_val_in_YTO_section, exp_GST_val_in_YTO_section, "Incorrect GST value is displayed in YTO section in Rewards page");
		
    	String act_YTO_Total_is=YTO_Total_Rewards_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	double exp_YTO_Total=(act_YTO_subTotal+exp_GST_val_in_YTO_section)-(YTO_BonusBank+YTO_CreditNotes);
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO total value is displayed in Rewards page");
    	
	}
	
	
	@Override
    public void validate_Applied_BonusBank_CreditNotes_TE_section_subtotal_Total_GST_QST_Rewards_page() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxQST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxQST");
    	double TE_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double TE_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_subTotal_is=TE_subtotal_Rewards_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	String act_GST_in_TE_section=GST_in_TE_section_Rewards_page().getText().trim();
    	act_GST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_TE_section);
    	double act_GST_val_in_TE_section=Double.parseDouble(act_GST_in_TE_section);
    	
    	String act_QST_in_TE_section=QST_in_TE_section_Rewards_page().getText().trim();
    	act_QST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_QST_in_TE_section);
    	double act_QST_val_in_TE_section=Double.parseDouble(act_QST_in_TE_section);
    	
    	double exp_GST_val_in_TE_section=(double)(act_TE_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_TE_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_TE_section));
    	
    	Assert.assertEquals(act_GST_val_in_TE_section, exp_GST_val_in_TE_section, "Incorrect GST value is displayed in TE section in Rewards page");
		
    	
    	double exp_QST_val_in_TE_section=(double)(act_TE_subTotal * stateTaxQST) / 100;
    	exp_QST_val_in_TE_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_QST_val_in_TE_section));
    	
    	Assert.assertEquals(act_QST_val_in_TE_section, exp_QST_val_in_TE_section, "Incorrect QST value is displayed in TE section in Rewards page");
		
    	String act_TE_Total_is=TE_Total_Rewards_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	
    	double exp_TE_Total=(act_TE_subTotal+exp_GST_val_in_TE_section+exp_QST_val_in_TE_section)-(TE_BonusBank+TE_CreditNotes);
    	exp_TE_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_Total));
    	
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void validate_Applied_BonusBank_CreditNotes_TE_section_subtotal_Total_GST_PST_Rewards_page() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");
    	double TE_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double TE_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_subTotal_is=TE_subtotal_Rewards_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	String act_GST_in_TE_section=GST_in_TE_section_Rewards_page().getText().trim();
    	act_GST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_TE_section);
    	double act_GST_val_in_TE_section=Double.parseDouble(act_GST_in_TE_section);
    	
    	String act_PST_in_TE_section=PST_in_TE_section_Rewards_page().getText().trim();
    	act_PST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_PST_in_TE_section);
    	double act_PST_val_in_TE_section=Double.parseDouble(act_PST_in_TE_section);
    	
    	double exp_GST_val_in_TE_section=(double)(act_TE_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_TE_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_TE_section));
    	
    	Assert.assertEquals(act_GST_val_in_TE_section, exp_GST_val_in_TE_section, "Incorrect GST value is displayed in TE section in Rewards page");
		
    	
    	double exp_PST_val_in_TE_section=(double)(act_TE_subTotal * stateTaxPST) / 100;
    	exp_PST_val_in_TE_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_val_in_TE_section));
    	
    	Assert.assertEquals(act_PST_val_in_TE_section, exp_PST_val_in_TE_section, "Incorrect PST value is displayed in TE section in Rewards page");
		
    	String act_TE_Total_is=TE_Total_Rewards_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	
    	double exp_TE_Total=(act_TE_subTotal+exp_GST_val_in_TE_section+exp_PST_val_in_TE_section)-(TE_BonusBank+TE_CreditNotes);
    	exp_TE_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_Total));
    	
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void validate_Applied_BonusBank_CreditNotes_TE_section_subtotal_Total_HST_Rewards_page() {
    	double stateTaxHST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxHST");
    	double TE_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double TE_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_subTotal_is=TE_subtotal_Rewards_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	String act_HST_in_TE_section=HST_in_TE_section_Rewards_page().getText().trim();
    	act_HST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_HST_in_TE_section);
    	double act_HST_val_in_TE_section=Double.parseDouble(act_HST_in_TE_section);
    	
    	double exp_HST_val_in_TE_section=(double)(act_TE_subTotal * stateTaxHST) / 100;
    	exp_HST_val_in_TE_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_HST_val_in_TE_section));
    	
    	Assert.assertEquals(act_HST_val_in_TE_section, exp_HST_val_in_TE_section, "Incorrect HST value is displayed in TE section in Rewards page");
		
    	String act_TE_Total_is=TE_Total_Rewards_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	
    	double exp_TE_Total=(act_TE_subTotal+exp_HST_val_in_TE_section)-(TE_BonusBank+TE_CreditNotes);
    	exp_TE_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_Total));
    	
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void validate_Applied_BonusBank_CreditNotes_TE_section_subtotal_Total_GST_Rewards_page() {
    	double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");
    	double TE_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double TE_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_subTotal_is=TE_subtotal_Rewards_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	String act_GST_in_TE_section=GST_in_TE_section_Rewards_page().getText().trim();
    	act_GST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_TE_section);
    	double act_GST_val_in_TE_section=Double.parseDouble(act_GST_in_TE_section);
    	
    	double exp_GST_val_in_TE_section=(double)(act_TE_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_TE_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_TE_section));
    	
    	Assert.assertEquals(act_GST_val_in_TE_section, exp_GST_val_in_TE_section, "Incorrect GST value is displayed in TE section in Rewards page");
		
    	String act_TE_Total_is=TE_Total_Rewards_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	
    	double exp_TE_Total=(act_TE_subTotal+exp_GST_val_in_TE_section)-(TE_BonusBank+TE_CreditNotes);
    	exp_TE_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_Total));
    	
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE total value is displayed in Rewards page");
    	
	}
	
	@Override
    public void teacher_clicks_on_ContinueCheckout_Rewards_page() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(2000);
    	
    	SCHUtils.clickUsingJavaScript(btn_Continue_Checkout_Rewards_page());
	}
	
	@Override
    public void teacher_sees_SFO_section_Payments_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        try {
        	section_SFO_Payments_page().isDisplayed();
        	System.out.println("SFO section is displayed in Payments page");
		} catch (Exception e) {
			Assert.fail("SFO section is not displayed in Payments page");
		}
    }
	
	@Override
    public double teacher_validate_SFO_section_in_Payments_page_GST_PST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");
    	double SFO_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_subTotal_is=fld_SFO_subtotal_Payments_page().getText().trim();
    	act_SFO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_subTotal_is);
    	double act_SFO_subTotal=Double.parseDouble(act_SFO_subTotal_is);
    	
    	String act_GST_in_SFO_section=fld_GST_in_SFO_section_Payments_page().getText().trim();
    	act_GST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_SFO_section);
    	double act_GST_val_in_SFO_section=Double.parseDouble(act_GST_in_SFO_section);
    	
    	String act_PST_in_SFO_section=fld_PST_in_SFO_section_Payments_page().getText().trim();
    	act_PST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_PST_in_SFO_section);
    	double act_PST_val_in_SFO_section=Double.parseDouble(act_PST_in_SFO_section);
    	
    	double exp_GST_val_in_SFO_section=(double)(act_SFO_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_SFO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_SFO_section));
    	
    	Assert.assertEquals(act_GST_val_in_SFO_section, exp_GST_val_in_SFO_section, "Incorrect GST value is displayed in SFO section in Payments page");
		
    	
    	double exp_PST_val_in_SFO_section=(double)(act_SFO_subTotal * stateTaxPST) / 100;
    	exp_PST_val_in_SFO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_val_in_SFO_section));
    	
    	Assert.assertEquals(act_PST_val_in_SFO_section, exp_PST_val_in_SFO_section, "Incorrect PST value is displayed in SFO section in Payments page");
		
    	String act_CreditNotes_in_SFO_is=fld_CreditNotes_in_SFO_Payments_page().getText().trim();
    	act_CreditNotes_in_SFO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_SFO_is);
    	double act_CreditNotes_in_SFO=Double.parseDouble(act_CreditNotes_in_SFO_is);
    	
    	double exp_CreditNotes_in_SFO=SFO_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_SFO, exp_CreditNotes_in_SFO, "Incorrect SFO Credit Notes value is displayed in Payments page");
    	
    	String act_SFO_Total_is=fld_SFO_Total_Payments_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	double exp_SFO_Total=(act_SFO_subTotal+exp_GST_val_in_SFO_section+exp_PST_val_in_SFO_section)-(exp_CreditNotes_in_SFO);
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Payments page");
    	
    	return exp_SFO_Total;
	}
	
	@Override
    public double teacher_validate_SFO_section_in_Payments_page_GST_QST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxQST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxQST");
    	double SFO_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_subTotal_is=fld_SFO_subtotal_Payments_page().getText().trim();
    	act_SFO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_subTotal_is);
    	double act_SFO_subTotal=Double.parseDouble(act_SFO_subTotal_is);
    	
    	String act_GST_in_SFO_section=fld_GST_in_SFO_section_Payments_page().getText().trim();
    	act_GST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_SFO_section);
    	double act_GST_val_in_SFO_section=Double.parseDouble(act_GST_in_SFO_section);
    	
    	String act_QST_in_SFO_section=fld_QST_in_SFO_section_Payments_page().getText().trim();
    	act_QST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_QST_in_SFO_section);
    	double act_QST_val_in_SFO_section=Double.parseDouble(act_QST_in_SFO_section);
    	
    	double exp_GST_val_in_SFO_section=(double)(act_SFO_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_SFO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_SFO_section));
    	
    	Assert.assertEquals(act_GST_val_in_SFO_section, exp_GST_val_in_SFO_section, "Incorrect GST value is displayed in SFO section in Payments page");
		
    	
    	double exp_QST_val_in_SFO_section=(double)(act_SFO_subTotal * stateTaxQST) / 100;
    	exp_QST_val_in_SFO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_QST_val_in_SFO_section));
    	
    	Assert.assertEquals(act_QST_val_in_SFO_section, exp_QST_val_in_SFO_section, "Incorrect QST value is displayed in SFO section in Payments page");
		
    	String act_CreditNotes_in_SFO_is=fld_CreditNotes_in_SFO_Payments_page().getText().trim();
    	act_CreditNotes_in_SFO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_SFO_is);
    	double act_CreditNotes_in_SFO=Double.parseDouble(act_CreditNotes_in_SFO_is);
    	
    	double exp_CreditNotes_in_SFO=SFO_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_SFO, exp_CreditNotes_in_SFO, "Incorrect SFO Credit Notes value is displayed in Payments page");
    	
    	String act_SFO_Total_is=fld_SFO_Total_Payments_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	double exp_SFO_Total=(act_SFO_subTotal+exp_GST_val_in_SFO_section+exp_QST_val_in_SFO_section)-(exp_CreditNotes_in_SFO);
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Payments page");
    	
    	return exp_SFO_Total;
	}
	
	@Override
    public double teacher_validate_SFO_section_in_Payments_page_HST() {
    	double stateTaxHST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxHST");
    	double SFO_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_subTotal_is=fld_SFO_subtotal_Payments_page().getText().trim();
    	act_SFO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_subTotal_is);
    	double act_SFO_subTotal=Double.parseDouble(act_SFO_subTotal_is);
    	
    	String act_HST_in_SFO_section=fld_HST_in_SFO_section_Payments_page().getText().trim();
    	act_HST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_HST_in_SFO_section);
    	double act_HST_val_in_SFO_section=Double.parseDouble(act_HST_in_SFO_section);
    	
    	double exp_HST_val_in_SFO_section=(double)(act_SFO_subTotal * stateTaxHST) / 100;
    	exp_HST_val_in_SFO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_HST_val_in_SFO_section));
    	
    	Assert.assertEquals(act_HST_val_in_SFO_section, exp_HST_val_in_SFO_section, "Incorrect HST value is displayed in SFO section in Payments page");
		
    	String act_CreditNotes_in_SFO_is=fld_CreditNotes_in_SFO_Payments_page().getText().trim();
    	act_CreditNotes_in_SFO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_SFO_is);
    	double act_CreditNotes_in_SFO=Double.parseDouble(act_CreditNotes_in_SFO_is);
    	
    	double exp_CreditNotes_in_SFO=SFO_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_SFO, exp_CreditNotes_in_SFO, "Incorrect SFO Credit Notes value is displayed in Payments page");
    	
    	String act_SFO_Total_is=fld_SFO_Total_Payments_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	double exp_SFO_Total=(act_SFO_subTotal+exp_HST_val_in_SFO_section)-(exp_CreditNotes_in_SFO);
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Payments page");
    	
    	return exp_SFO_Total;
	}
	
	@Override
    public double teacher_validate_SFO_section_in_Payments_page_GST() {
    	double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");
    	double SFO_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_subTotal_is=fld_SFO_subtotal_Payments_page().getText().trim();
    	act_SFO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_subTotal_is);
    	double act_SFO_subTotal=Double.parseDouble(act_SFO_subTotal_is);
    	
    	String act_GST_in_SFO_section=fld_GST_in_SFO_section_Payments_page().getText().trim();
    	act_GST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_SFO_section);
    	double act_GST_val_in_SFO_section=Double.parseDouble(act_GST_in_SFO_section);
    	
    	double exp_GST_val_in_SFO_section=(double)(act_SFO_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_SFO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_SFO_section));
    	
    	Assert.assertEquals(act_GST_val_in_SFO_section, exp_GST_val_in_SFO_section, "Incorrect GST value is displayed in SFO section in Payments page");
		
    	String act_CreditNotes_in_SFO_is=fld_CreditNotes_in_SFO_Payments_page().getText().trim();
    	act_CreditNotes_in_SFO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_SFO_is);
    	double act_CreditNotes_in_SFO=Double.parseDouble(act_CreditNotes_in_SFO_is);
    	
    	double exp_CreditNotes_in_SFO=SFO_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_SFO, exp_CreditNotes_in_SFO, "Incorrect SFO Credit Notes value is displayed in Payments page");
    	
    	String act_SFO_Total_is=fld_SFO_Total_Payments_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	double exp_SFO_Total=(act_SFO_subTotal+exp_GST_val_in_SFO_section)-(exp_CreditNotes_in_SFO);
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Payments page");
    	
    	return exp_SFO_Total;
	}
	
	@Override
    public double teacher_validate_Shipping_Handling_section_when_apply_BBank_CNotes_in_Payments_page_GST_PST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");
    	double Shipping_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double Shipping_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	Double exp_Shipping_Handling_Value=null;
    	String act_Shipping_Handling_Value_is=fld_Shipping_Handling_val_BlueBar_Payments_page().getText().trim();
    	
    	if (act_Shipping_Handling_Value_is.equals("FREE!")) {
    		exp_Shipping_Handling_Value=(double) 0;
		} else {
			act_Shipping_Handling_Value_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Handling_Value_is);
	    	double act_Shipping_Handling_Value=Double.parseDouble(act_Shipping_Handling_Value_is);
	    	
	    	String act_Shipping_subTotal_is=fld_Shipping_Handling_subtotal_Payments_page().getText().trim();
	    	act_Shipping_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_subTotal_is);
	    	double act_Shipping_subTotal=Double.parseDouble(act_Shipping_subTotal_is);
	    	
	    	String act_GST_in_Shipping_section=fld_GST_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_GST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_Shipping_section);
	    	double act_GST_val_in_Shipping_section=Double.parseDouble(act_GST_in_Shipping_section);
	    	
	    	String act_PST_in_Shipping_section=fld_PST_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_PST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_PST_in_Shipping_section);
	    	double act_PST_val_in_Shipping_section=Double.parseDouble(act_PST_in_Shipping_section);
	    	
	    	double exp_GST_val_in_Shipping_section=(double)(act_Shipping_subTotal * stateTaxGST) / 100;
	    	exp_GST_val_in_Shipping_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_Shipping_section));
	    	
	    	Assert.assertEquals(act_GST_val_in_Shipping_section, exp_GST_val_in_Shipping_section, "Incorrect GST value is displayed in Shipping section in Payments page");
			
	    	
	    	double exp_PST_val_in_Shipping_section=(double)(act_Shipping_subTotal * stateTaxPST) / 100;
	    	exp_PST_val_in_Shipping_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_val_in_Shipping_section));
	    	
	    	Assert.assertEquals(act_PST_val_in_Shipping_section, exp_PST_val_in_Shipping_section, "Incorrect PST value is displayed in Shipping section in Payments page");
			
	    	String act_BonusBank_in_Shipping_is=fld_Bonus_Bank_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_BonusBank_in_Shipping_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_Shipping_is);
	    	double act_BonusBank_in_Shipping=Double.parseDouble(act_BonusBank_in_Shipping_is);
	    	
	    	double exp_BonusBank_in_Shipping=Shipping_BonusBank;
	    	Assert.assertEquals(act_BonusBank_in_Shipping, exp_BonusBank_in_Shipping, "Incorrect Shipping Bonus Bank value is displayed in Payments page");
	    	
	    	String act_CreditNotes_in_Shipping_is=fld_CreditNotes_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_CreditNotes_in_Shipping_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_Shipping_is);
	    	double act_CreditNotes_in_Shipping=Double.parseDouble(act_CreditNotes_in_Shipping_is);
	    	
	    	double exp_CreditNotes_in_Shipping=Shipping_CreditNotes;
	    	Assert.assertEquals(act_CreditNotes_in_Shipping, exp_CreditNotes_in_Shipping, "Incorrect Shipping Credit Notes value is displayed in Payments page");
	    	
	    	exp_Shipping_Handling_Value = (act_Shipping_subTotal+exp_GST_val_in_Shipping_section+exp_PST_val_in_Shipping_section)-(exp_BonusBank_in_Shipping+exp_CreditNotes_in_Shipping);
	    	exp_Shipping_Handling_Value =Double.parseDouble(new DecimalFormat("##.##").format(exp_Shipping_Handling_Value));
	    	
	    	Assert.assertEquals(act_Shipping_Handling_Value, exp_Shipping_Handling_Value, "Incorrect Shipping & Handling Total value is displayed in Payments page");
		}
    	
    	return exp_Shipping_Handling_Value;
	}
	
	@Override
    public double teacher_validate_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST_PST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");
    	
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	Double exp_Shipping_Handling_Value=null;
    	String act_Shipping_Handling_Value_is=fld_Shipping_Handling_val_BlueBar_Payments_page().getText().trim();
    	
    	if (act_Shipping_Handling_Value_is.equals("FREE!")) {
    		exp_Shipping_Handling_Value=(double) 0;
		} else {
			act_Shipping_Handling_Value_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Handling_Value_is);
	    	double act_Shipping_Handling_Value=Double.parseDouble(act_Shipping_Handling_Value_is);
	    	
	    	String act_Shipping_subTotal_is=fld_Shipping_Handling_subtotal_Payments_page().getText().trim();
	    	act_Shipping_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_subTotal_is);
	    	double act_Shipping_subTotal=Double.parseDouble(act_Shipping_subTotal_is);
	    	
	    	String act_GST_in_Shipping_section=fld_GST_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_GST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_Shipping_section);
	    	double act_GST_val_in_Shipping_section=Double.parseDouble(act_GST_in_Shipping_section);
	    	
	    	String act_PST_in_Shipping_section=fld_PST_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_PST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_PST_in_Shipping_section);
	    	double act_PST_val_in_Shipping_section=Double.parseDouble(act_PST_in_Shipping_section);
	    	
	    	double exp_GST_val_in_Shipping_section=(double)(act_Shipping_subTotal * stateTaxGST) / 100;
	    	exp_GST_val_in_Shipping_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_Shipping_section));
	    	
	    	Assert.assertEquals(act_GST_val_in_Shipping_section, exp_GST_val_in_Shipping_section, "Incorrect GST value is displayed in Shipping section in Payments page");
			
	    	
	    	double exp_PST_val_in_Shipping_section=(double)(act_Shipping_subTotal * stateTaxPST) / 100;
	    	exp_PST_val_in_Shipping_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_val_in_Shipping_section));
	    	
	    	Assert.assertEquals(act_PST_val_in_Shipping_section, exp_PST_val_in_Shipping_section, "Incorrect PST value is displayed in Shipping section in Payments page");
			
	    	String act_BonusBank_in_Shipping_is=fld_Bonus_Bank_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_BonusBank_in_Shipping_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_Shipping_is);
	    	double act_BonusBank_in_Shipping=Double.parseDouble(act_BonusBank_in_Shipping_is);
	    	
	    	double exp_BonusBank_in_Shipping=0;
	    	Assert.assertEquals(act_BonusBank_in_Shipping, exp_BonusBank_in_Shipping, "Incorrect Shipping Bonus Bank value is displayed in Payments page");
	    	
	    	String act_CreditNotes_in_Shipping_is=fld_CreditNotes_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_CreditNotes_in_Shipping_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_Shipping_is);
	    	double act_CreditNotes_in_Shipping=Double.parseDouble(act_CreditNotes_in_Shipping_is);
	    	
	    	double exp_CreditNotes_in_Shipping=0;
	    	Assert.assertEquals(act_CreditNotes_in_Shipping, exp_CreditNotes_in_Shipping, "Incorrect Shipping Credit Notes value is displayed in Payments page");
	    	
	    	exp_Shipping_Handling_Value = (act_Shipping_subTotal+exp_GST_val_in_Shipping_section+exp_PST_val_in_Shipping_section)-(exp_BonusBank_in_Shipping+exp_CreditNotes_in_Shipping);
	    	exp_Shipping_Handling_Value =Double.parseDouble(new DecimalFormat("##.##").format(exp_Shipping_Handling_Value));
	    	
	    	Assert.assertEquals(act_Shipping_Handling_Value, exp_Shipping_Handling_Value, "Incorrect Shipping & Handling Total value is displayed in Payments page");
		}
    	
    	return exp_Shipping_Handling_Value;
		
	}
	
	@Override
    public double teacher_validate_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST_QST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxQST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxQST");
    	
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	Double exp_Shipping_Handling_Value=null;
    	String act_Shipping_Handling_Value_is=fld_Shipping_Handling_val_BlueBar_Payments_page().getText().trim();
    	
    	if (act_Shipping_Handling_Value_is.equals("FREE!")) {
    		exp_Shipping_Handling_Value=(double) 0;
		} else {
			act_Shipping_Handling_Value_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Handling_Value_is);
	    	double act_Shipping_Handling_Value=Double.parseDouble(act_Shipping_Handling_Value_is);
	    	
	    	String act_Shipping_subTotal_is=fld_Shipping_Handling_subtotal_Payments_page().getText().trim();
	    	act_Shipping_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_subTotal_is);
	    	double act_Shipping_subTotal=Double.parseDouble(act_Shipping_subTotal_is);
	    	
	    	String act_GST_in_Shipping_section=fld_GST_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_GST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_Shipping_section);
	    	double act_GST_val_in_Shipping_section=Double.parseDouble(act_GST_in_Shipping_section);
	    	
	    	String act_QST_in_Shipping_section=fld_QST_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_QST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_QST_in_Shipping_section);
	    	double act_QST_val_in_Shipping_section=Double.parseDouble(act_QST_in_Shipping_section);
	    	
	    	double exp_GST_val_in_Shipping_section=(double)(act_Shipping_subTotal * stateTaxGST) / 100;
	    	exp_GST_val_in_Shipping_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_Shipping_section));
	    	
	    	Assert.assertEquals(act_GST_val_in_Shipping_section, exp_GST_val_in_Shipping_section, "Incorrect GST value is displayed in Shipping section in Payments page");
			
	    	
	    	double exp_QST_val_in_Shipping_section=(double)(act_Shipping_subTotal * stateTaxQST) / 100;
	    	exp_QST_val_in_Shipping_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_QST_val_in_Shipping_section));
	    	
	    	Assert.assertEquals(act_QST_val_in_Shipping_section, exp_QST_val_in_Shipping_section, "Incorrect QST value is displayed in Shipping section in Payments page");
			
	    	String act_BonusBank_in_Shipping_is=fld_Bonus_Bank_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_BonusBank_in_Shipping_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_Shipping_is);
	    	double act_BonusBank_in_Shipping=Double.parseDouble(act_BonusBank_in_Shipping_is);
	    	
	    	double exp_BonusBank_in_Shipping=0;
	    	Assert.assertEquals(act_BonusBank_in_Shipping, exp_BonusBank_in_Shipping, "Incorrect Shipping Bonus Bank value is displayed in Payments page");
	    	
	    	String act_CreditNotes_in_Shipping_is=fld_CreditNotes_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_CreditNotes_in_Shipping_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_Shipping_is);
	    	double act_CreditNotes_in_Shipping=Double.parseDouble(act_CreditNotes_in_Shipping_is);
	    	
	    	double exp_CreditNotes_in_Shipping=0;
	    	Assert.assertEquals(act_CreditNotes_in_Shipping, exp_CreditNotes_in_Shipping, "Incorrect Shipping Credit Notes value is displayed in Payments page");
	    	
	    	exp_Shipping_Handling_Value = (act_Shipping_subTotal+exp_GST_val_in_Shipping_section+exp_QST_val_in_Shipping_section)-(exp_BonusBank_in_Shipping+exp_CreditNotes_in_Shipping);
	    	exp_Shipping_Handling_Value =Double.parseDouble(new DecimalFormat("##.##").format(exp_Shipping_Handling_Value));
	    	
	    	Assert.assertEquals(act_Shipping_Handling_Value, exp_Shipping_Handling_Value, "Incorrect Shipping & Handling Total value is displayed in Payments page");
		}
    	
    	return exp_Shipping_Handling_Value;
		
	}
	
	@Override
    public double teacher_validate_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_HST() {
		double stateTaxHST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxHST");
    	
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	Double exp_Shipping_Handling_Value=null;
    	String act_Shipping_Handling_Value_is=fld_Shipping_Handling_val_BlueBar_Payments_page().getText().trim();
    	
    	if (act_Shipping_Handling_Value_is.equals("FREE!")) {
    		exp_Shipping_Handling_Value=(double) 0;
		} else {
			act_Shipping_Handling_Value_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Handling_Value_is);
	    	double act_Shipping_Handling_Value=Double.parseDouble(act_Shipping_Handling_Value_is);
	    	
	    	String act_Shipping_subTotal_is=fld_Shipping_Handling_subtotal_Payments_page().getText().trim();
	    	act_Shipping_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_subTotal_is);
	    	double act_Shipping_subTotal=Double.parseDouble(act_Shipping_subTotal_is);
	    	
	    	String act_HST_in_Shipping_section=fld_HST_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_HST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_HST_in_Shipping_section);
	    	double act_HST_val_in_Shipping_section=Double.parseDouble(act_HST_in_Shipping_section);
	    	
	    	double exp_HST_val_in_Shipping_section=(double)(act_Shipping_subTotal * stateTaxHST) / 100;
	    	exp_HST_val_in_Shipping_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_HST_val_in_Shipping_section));
	    	
	    	Assert.assertEquals(act_HST_val_in_Shipping_section, exp_HST_val_in_Shipping_section, "Incorrect HST value is displayed in Shipping section in Payments page");
		
	    	String act_BonusBank_in_Shipping_is=fld_Bonus_Bank_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_BonusBank_in_Shipping_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_Shipping_is);
	    	double act_BonusBank_in_Shipping=Double.parseDouble(act_BonusBank_in_Shipping_is);
	    	
	    	double exp_BonusBank_in_Shipping=0;
	    	Assert.assertEquals(act_BonusBank_in_Shipping, exp_BonusBank_in_Shipping, "Incorrect Shipping Bonus Bank value is displayed in Payments page");
	    	
	    	String act_CreditNotes_in_Shipping_is=fld_CreditNotes_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_CreditNotes_in_Shipping_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_Shipping_is);
	    	double act_CreditNotes_in_Shipping=Double.parseDouble(act_CreditNotes_in_Shipping_is);
	    	
	    	double exp_CreditNotes_in_Shipping=0;
	    	Assert.assertEquals(act_CreditNotes_in_Shipping, exp_CreditNotes_in_Shipping, "Incorrect Shipping Credit Notes value is displayed in Payments page");
	    	
	    	exp_Shipping_Handling_Value = (act_Shipping_subTotal+exp_HST_val_in_Shipping_section)-(exp_BonusBank_in_Shipping+exp_CreditNotes_in_Shipping);
	    	exp_Shipping_Handling_Value =Double.parseDouble(new DecimalFormat("##.##").format(exp_Shipping_Handling_Value));
	    	
	    	Assert.assertEquals(act_Shipping_Handling_Value, exp_Shipping_Handling_Value, "Incorrect Shipping & Handling Total value is displayed in Payments page");
		}
    	
    	return exp_Shipping_Handling_Value;
		
	}
	
	@Override
    public double teacher_validate_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST() {
		double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	Double exp_Shipping_Handling_Value=null;
    	String act_Shipping_Handling_Value_is=fld_Shipping_Handling_val_BlueBar_Payments_page().getText().trim();
    	
    	if (act_Shipping_Handling_Value_is.equals("FREE!")) {
    		exp_Shipping_Handling_Value=(double) 0;
		} else {
			act_Shipping_Handling_Value_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Handling_Value_is);
	    	double act_Shipping_Handling_Value=Double.parseDouble(act_Shipping_Handling_Value_is);
	    	
	    	String act_Shipping_subTotal_is=fld_Shipping_Handling_subtotal_Payments_page().getText().trim();
	    	act_Shipping_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_subTotal_is);
	    	double act_Shipping_subTotal=Double.parseDouble(act_Shipping_subTotal_is);
	    	
	    	String act_GST_in_Shipping_section=fld_GST_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_GST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_Shipping_section);
	    	double act_GST_val_in_Shipping_section=Double.parseDouble(act_GST_in_Shipping_section);
	    	
	    	double exp_GST_val_in_Shipping_section=(double)(act_Shipping_subTotal * stateTaxGST) / 100;
	    	exp_GST_val_in_Shipping_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_Shipping_section));
	    	
	    	Assert.assertEquals(act_GST_val_in_Shipping_section, exp_GST_val_in_Shipping_section, "Incorrect GST value is displayed in Shipping section in Payments page");
		
	    	String act_BonusBank_in_Shipping_is=fld_Bonus_Bank_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_BonusBank_in_Shipping_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_Shipping_is);
	    	double act_BonusBank_in_Shipping=Double.parseDouble(act_BonusBank_in_Shipping_is);
	    	
	    	double exp_BonusBank_in_Shipping=0;
	    	Assert.assertEquals(act_BonusBank_in_Shipping, exp_BonusBank_in_Shipping, "Incorrect Shipping Bonus Bank value is displayed in Payments page");
	    	
	    	String act_CreditNotes_in_Shipping_is=fld_CreditNotes_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_CreditNotes_in_Shipping_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_Shipping_is);
	    	double act_CreditNotes_in_Shipping=Double.parseDouble(act_CreditNotes_in_Shipping_is);
	    	
	    	double exp_CreditNotes_in_Shipping=0;
	    	Assert.assertEquals(act_CreditNotes_in_Shipping, exp_CreditNotes_in_Shipping, "Incorrect Shipping Credit Notes value is displayed in Payments page");
	    	
	    	exp_Shipping_Handling_Value = (act_Shipping_subTotal+exp_GST_val_in_Shipping_section)-(exp_BonusBank_in_Shipping+exp_CreditNotes_in_Shipping);
	    	exp_Shipping_Handling_Value =Double.parseDouble(new DecimalFormat("##.##").format(exp_Shipping_Handling_Value));
	    	
	    	Assert.assertEquals(act_Shipping_Handling_Value, exp_Shipping_Handling_Value, "Incorrect Shipping & Handling Total value is displayed in Payments page");
		}
    	
    	return exp_Shipping_Handling_Value;
		
	}
	
	@Override
    public double No_tax_validation_of_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST_PST() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	Double exp_Shipping_Handling_Value=null;
    	String act_Shipping_Handling_Value_is=fld_Shipping_Handling_val_BlueBar_Payments_page().getText().trim();
    	
    	if (act_Shipping_Handling_Value_is.equals("FREE!")) {
    		exp_Shipping_Handling_Value=(double) 0;
		} else {
			act_Shipping_Handling_Value_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Handling_Value_is);
	    	double act_Shipping_Handling_Value=Double.parseDouble(act_Shipping_Handling_Value_is);
	    	
	    	String act_Shipping_subTotal_is=fld_Shipping_Handling_subtotal_Payments_page().getText().trim();
	    	act_Shipping_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_subTotal_is);
	    	double act_Shipping_subTotal=Double.parseDouble(act_Shipping_subTotal_is);
	    	
	    	String act_GST_in_Shipping_section=fld_GST_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_GST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_Shipping_section);
	    	double act_GST_val_in_Shipping_section=Double.parseDouble(act_GST_in_Shipping_section);
	    	
	    	String act_PST_in_Shipping_section=fld_PST_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_PST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_PST_in_Shipping_section);
	    	double act_PST_val_in_Shipping_section=Double.parseDouble(act_PST_in_Shipping_section);
	    	
	    	double exp_GST_val_in_Shipping_section=0;
	    	Assert.assertEquals(act_GST_val_in_Shipping_section, exp_GST_val_in_Shipping_section, "GST value is displayed in Shipping section in Payments page");
			
	    	double exp_PST_val_in_Shipping_section=0;
	    	Assert.assertEquals(act_PST_val_in_Shipping_section, exp_PST_val_in_Shipping_section, "PST value is displayed in Shipping section in Payments page");
			
	    	String act_BonusBank_in_Shipping_is=fld_Bonus_Bank_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_BonusBank_in_Shipping_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_Shipping_is);
	    	double act_BonusBank_in_Shipping=Double.parseDouble(act_BonusBank_in_Shipping_is);
	    	
	    	double exp_BonusBank_in_Shipping=0;
	    	Assert.assertEquals(act_BonusBank_in_Shipping, exp_BonusBank_in_Shipping, "Incorrect Shipping Bonus Bank value is displayed in Payments page");
	    	
	    	String act_CreditNotes_in_Shipping_is=fld_CreditNotes_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_CreditNotes_in_Shipping_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_Shipping_is);
	    	double act_CreditNotes_in_Shipping=Double.parseDouble(act_CreditNotes_in_Shipping_is);
	    	
	    	double exp_CreditNotes_in_Shipping=0;
	    	Assert.assertEquals(act_CreditNotes_in_Shipping, exp_CreditNotes_in_Shipping, "Incorrect Shipping Credit Notes value is displayed in Payments page");
	    	
	    	exp_Shipping_Handling_Value = (act_Shipping_subTotal+exp_GST_val_in_Shipping_section+exp_PST_val_in_Shipping_section)-(exp_BonusBank_in_Shipping+exp_CreditNotes_in_Shipping);
	    	exp_Shipping_Handling_Value =Double.parseDouble(new DecimalFormat("##.##").format(exp_Shipping_Handling_Value));
	    	
	    	Assert.assertEquals(act_Shipping_Handling_Value, exp_Shipping_Handling_Value, "Incorrect Shipping & Handling Total value is displayed in Payments page");
		}
    	
    	return exp_Shipping_Handling_Value;
		
	}
	
	@Override
    public double No_tax_validation_of_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST_QST() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	Double exp_Shipping_Handling_Value=null;
    	String act_Shipping_Handling_Value_is=fld_Shipping_Handling_val_BlueBar_Payments_page().getText().trim();
    	
    	if (act_Shipping_Handling_Value_is.equals("FREE!")) {
    		exp_Shipping_Handling_Value=(double) 0;
		} else {
			act_Shipping_Handling_Value_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Handling_Value_is);
	    	double act_Shipping_Handling_Value=Double.parseDouble(act_Shipping_Handling_Value_is);
	    	
	    	String act_Shipping_subTotal_is=fld_Shipping_Handling_subtotal_Payments_page().getText().trim();
	    	act_Shipping_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_subTotal_is);
	    	double act_Shipping_subTotal=Double.parseDouble(act_Shipping_subTotal_is);
	    	
	    	String act_GST_in_Shipping_section=fld_GST_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_GST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_Shipping_section);
	    	double act_GST_val_in_Shipping_section=Double.parseDouble(act_GST_in_Shipping_section);
	    	
	    	String act_QST_in_Shipping_section=fld_QST_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_QST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_QST_in_Shipping_section);
	    	double act_QST_val_in_Shipping_section=Double.parseDouble(act_QST_in_Shipping_section);
	    	
	    	double exp_GST_val_in_Shipping_section=0;
	    	Assert.assertEquals(act_GST_val_in_Shipping_section, exp_GST_val_in_Shipping_section, "GST value is displayed in Shipping section in Payments page");
			
	    	double exp_QST_val_in_Shipping_section=0;
	    	Assert.assertEquals(act_QST_val_in_Shipping_section, exp_QST_val_in_Shipping_section, "QST value is displayed in Shipping section in Payments page");
			
	    	String act_BonusBank_in_Shipping_is=fld_Bonus_Bank_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_BonusBank_in_Shipping_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_Shipping_is);
	    	double act_BonusBank_in_Shipping=Double.parseDouble(act_BonusBank_in_Shipping_is);
	    	
	    	double exp_BonusBank_in_Shipping=0;
	    	Assert.assertEquals(act_BonusBank_in_Shipping, exp_BonusBank_in_Shipping, "Incorrect Shipping Bonus Bank value is displayed in Payments page");
	    	
	    	String act_CreditNotes_in_Shipping_is=fld_CreditNotes_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_CreditNotes_in_Shipping_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_Shipping_is);
	    	double act_CreditNotes_in_Shipping=Double.parseDouble(act_CreditNotes_in_Shipping_is);
	    	
	    	double exp_CreditNotes_in_Shipping=0;
	    	Assert.assertEquals(act_CreditNotes_in_Shipping, exp_CreditNotes_in_Shipping, "Incorrect Shipping Credit Notes value is displayed in Payments page");
	    	
	    	exp_Shipping_Handling_Value = (act_Shipping_subTotal+exp_GST_val_in_Shipping_section+exp_QST_val_in_Shipping_section)-(exp_BonusBank_in_Shipping+exp_CreditNotes_in_Shipping);
	    	exp_Shipping_Handling_Value =Double.parseDouble(new DecimalFormat("##.##").format(exp_Shipping_Handling_Value));
	    	
	    	Assert.assertEquals(act_Shipping_Handling_Value, exp_Shipping_Handling_Value, "Incorrect Shipping & Handling Total value is displayed in Payments page");
		}
    	
    	return exp_Shipping_Handling_Value;
		
	}
	
	@Override
    public double No_tax_validation_of_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_HST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	Double exp_Shipping_Handling_Value=null;
    	String act_Shipping_Handling_Value_is=fld_Shipping_Handling_val_BlueBar_Payments_page().getText().trim();
    	
    	if (act_Shipping_Handling_Value_is.equals("FREE!")) {
    		exp_Shipping_Handling_Value=(double) 0;
		} else {
			act_Shipping_Handling_Value_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Handling_Value_is);
	    	double act_Shipping_Handling_Value=Double.parseDouble(act_Shipping_Handling_Value_is);
	    	
	    	String act_Shipping_subTotal_is=fld_Shipping_Handling_subtotal_Payments_page().getText().trim();
	    	act_Shipping_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_subTotal_is);
	    	double act_Shipping_subTotal=Double.parseDouble(act_Shipping_subTotal_is);
	    	
	    	String act_HST_in_Shipping_section=fld_HST_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_HST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_HST_in_Shipping_section);
	    	double act_HST_val_in_Shipping_section=Double.parseDouble(act_HST_in_Shipping_section);
	    	
	    	double exp_HST_val_in_Shipping_section=0;
	    	Assert.assertEquals(act_HST_val_in_Shipping_section, exp_HST_val_in_Shipping_section, "HST value is displayed in Shipping section in Payments page");
			
	    	String act_BonusBank_in_Shipping_is=fld_Bonus_Bank_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_BonusBank_in_Shipping_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_Shipping_is);
	    	double act_BonusBank_in_Shipping=Double.parseDouble(act_BonusBank_in_Shipping_is);
	    	
	    	double exp_BonusBank_in_Shipping=0;
	    	Assert.assertEquals(act_BonusBank_in_Shipping, exp_BonusBank_in_Shipping, "Incorrect Shipping Bonus Bank value is displayed in Payments page");
	    	
	    	String act_CreditNotes_in_Shipping_is=fld_CreditNotes_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_CreditNotes_in_Shipping_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_Shipping_is);
	    	double act_CreditNotes_in_Shipping=Double.parseDouble(act_CreditNotes_in_Shipping_is);
	    	
	    	double exp_CreditNotes_in_Shipping=0;
	    	Assert.assertEquals(act_CreditNotes_in_Shipping, exp_CreditNotes_in_Shipping, "Incorrect Shipping Credit Notes value is displayed in Payments page");
	    	
	    	exp_Shipping_Handling_Value = (act_Shipping_subTotal+exp_HST_val_in_Shipping_section)-(exp_BonusBank_in_Shipping+exp_CreditNotes_in_Shipping);
	    	exp_Shipping_Handling_Value =Double.parseDouble(new DecimalFormat("##.##").format(exp_Shipping_Handling_Value));
	    	
	    	Assert.assertEquals(act_Shipping_Handling_Value, exp_Shipping_Handling_Value, "Incorrect Shipping & Handling Total value is displayed in Payments page");
		}
    	
    	return exp_Shipping_Handling_Value;
		
	}
	
	@Override
    public double No_tax_validation_of_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	Double exp_Shipping_Handling_Value=null;
    	String act_Shipping_Handling_Value_is=fld_Shipping_Handling_val_BlueBar_Payments_page().getText().trim();
    	
    	if (act_Shipping_Handling_Value_is.equals("FREE!")) {
    		exp_Shipping_Handling_Value=(double) 0;
		} else {
			act_Shipping_Handling_Value_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Handling_Value_is);
	    	double act_Shipping_Handling_Value=Double.parseDouble(act_Shipping_Handling_Value_is);
	    	
	    	String act_Shipping_subTotal_is=fld_Shipping_Handling_subtotal_Payments_page().getText().trim();
	    	act_Shipping_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_subTotal_is);
	    	double act_Shipping_subTotal=Double.parseDouble(act_Shipping_subTotal_is);
	    	
	    	String act_GST_in_Shipping_section=fld_GST_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_GST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_Shipping_section);
	    	double act_GST_val_in_Shipping_section=Double.parseDouble(act_GST_in_Shipping_section);
	    	
	    	double exp_GST_val_in_Shipping_section=0;
	    	Assert.assertEquals(act_GST_val_in_Shipping_section, exp_GST_val_in_Shipping_section, "GST value is displayed in Shipping section in Payments page");
			
	    	String act_BonusBank_in_Shipping_is=fld_Bonus_Bank_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_BonusBank_in_Shipping_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_Shipping_is);
	    	double act_BonusBank_in_Shipping=Double.parseDouble(act_BonusBank_in_Shipping_is);
	    	
	    	double exp_BonusBank_in_Shipping=0;
	    	Assert.assertEquals(act_BonusBank_in_Shipping, exp_BonusBank_in_Shipping, "Incorrect Shipping Bonus Bank value is displayed in Payments page");
	    	
	    	String act_CreditNotes_in_Shipping_is=fld_CreditNotes_in_Shipping_Handling_Payments_page().getText().trim();
	    	act_CreditNotes_in_Shipping_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_Shipping_is);
	    	double act_CreditNotes_in_Shipping=Double.parseDouble(act_CreditNotes_in_Shipping_is);
	    	
	    	double exp_CreditNotes_in_Shipping=0;
	    	Assert.assertEquals(act_CreditNotes_in_Shipping, exp_CreditNotes_in_Shipping, "Incorrect Shipping Credit Notes value is displayed in Payments page");
	    	
	    	exp_Shipping_Handling_Value = (act_Shipping_subTotal+exp_GST_val_in_Shipping_section)-(exp_BonusBank_in_Shipping+exp_CreditNotes_in_Shipping);
	    	exp_Shipping_Handling_Value =Double.parseDouble(new DecimalFormat("##.##").format(exp_Shipping_Handling_Value));
	    	
	    	Assert.assertEquals(act_Shipping_Handling_Value, exp_Shipping_Handling_Value, "Incorrect Shipping & Handling Total value is displayed in Payments page");
		}
    	
    	return exp_Shipping_Handling_Value;
		
	}
	
	@Override
    public double No_tax_validation_of_SFO_section_in_Payments_page_GST_PST() {
    	double SFO_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_subTotal_is=fld_SFO_subtotal_Payments_page().getText().trim();
    	act_SFO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_subTotal_is);
    	double act_SFO_subTotal=Double.parseDouble(act_SFO_subTotal_is);
    	
    	String act_GST_in_SFO_section=fld_GST_in_SFO_section_Payments_page().getText().trim();
    	act_GST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_SFO_section);
    	double act_GST_val_in_SFO_section=Double.parseDouble(act_GST_in_SFO_section);
    	
    	String act_PST_in_SFO_section=fld_PST_in_SFO_section_Payments_page().getText().trim();
    	act_PST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_PST_in_SFO_section);
    	double act_PST_val_in_SFO_section=Double.parseDouble(act_PST_in_SFO_section);
    	
    	double exp_GST_val_in_SFO_section=0;
    	Assert.assertEquals(act_GST_val_in_SFO_section, exp_GST_val_in_SFO_section, "GST value is displayed in SFO section in Payments page");
		
    	
    	double exp_PST_val_in_SFO_section=0;
    	Assert.assertEquals(act_PST_val_in_SFO_section, exp_PST_val_in_SFO_section, "PST value is displayed in SFO section in Payments page");
		
    	String act_CreditNotes_in_SFO_is=fld_CreditNotes_in_SFO_Payments_page().getText().trim();
    	act_CreditNotes_in_SFO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_SFO_is);
    	double act_CreditNotes_in_SFO=Double.parseDouble(act_CreditNotes_in_SFO_is);
    	
    	double exp_CreditNotes_in_SFO=SFO_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_SFO, exp_CreditNotes_in_SFO, "Incorrect SFO Credit Notes value is displayed in Payments page");
    	
    	String act_SFO_Total_is=fld_SFO_Total_Payments_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	double exp_SFO_Total=(act_SFO_subTotal+exp_GST_val_in_SFO_section+exp_PST_val_in_SFO_section)-(exp_CreditNotes_in_SFO);
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Payments page");
    	
    	return exp_SFO_Total;
	}
	
	@Override
    public double No_tax_validation_of_SFO_section_in_Payments_page_GST_QST() {
    	double SFO_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_subTotal_is=fld_SFO_subtotal_Payments_page().getText().trim();
    	act_SFO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_subTotal_is);
    	double act_SFO_subTotal=Double.parseDouble(act_SFO_subTotal_is);
    	
    	String act_GST_in_SFO_section=fld_GST_in_SFO_section_Payments_page().getText().trim();
    	act_GST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_SFO_section);
    	double act_GST_val_in_SFO_section=Double.parseDouble(act_GST_in_SFO_section);
    	
    	String act_QST_in_SFO_section=fld_QST_in_SFO_section_Payments_page().getText().trim();
    	act_QST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_QST_in_SFO_section);
    	double act_QST_val_in_SFO_section=Double.parseDouble(act_QST_in_SFO_section);
    	
    	double exp_GST_val_in_SFO_section=0;
    	Assert.assertEquals(act_GST_val_in_SFO_section, exp_GST_val_in_SFO_section, "GST value is displayed in SFO section in Payments page");
		
    	
    	double exp_QST_val_in_SFO_section=0;
    	Assert.assertEquals(act_QST_val_in_SFO_section, exp_QST_val_in_SFO_section, "QST value is displayed in SFO section in Payments page");
		
    	String act_CreditNotes_in_SFO_is=fld_CreditNotes_in_SFO_Payments_page().getText().trim();
    	act_CreditNotes_in_SFO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_SFO_is);
    	double act_CreditNotes_in_SFO=Double.parseDouble(act_CreditNotes_in_SFO_is);
    	
    	double exp_CreditNotes_in_SFO=SFO_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_SFO, exp_CreditNotes_in_SFO, "Incorrect SFO Credit Notes value is displayed in Payments page");
    	
    	String act_SFO_Total_is=fld_SFO_Total_Payments_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	double exp_SFO_Total=(act_SFO_subTotal+exp_GST_val_in_SFO_section+exp_QST_val_in_SFO_section)-(exp_CreditNotes_in_SFO);
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Payments page");
    	
    	return exp_SFO_Total;
	}
	
	@Override
    public double No_tax_validation_of_SFO_section_in_Payments_page_HST() {
    	double SFO_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_subTotal_is=fld_SFO_subtotal_Payments_page().getText().trim();
    	act_SFO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_subTotal_is);
    	double act_SFO_subTotal=Double.parseDouble(act_SFO_subTotal_is);
    	
    	String act_HST_in_SFO_section=fld_HST_in_SFO_section_Payments_page().getText().trim();
    	act_HST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_HST_in_SFO_section);
    	double act_HST_val_in_SFO_section=Double.parseDouble(act_HST_in_SFO_section);
    	
    	double exp_HST_val_in_SFO_section=0;
    	Assert.assertEquals(act_HST_val_in_SFO_section, exp_HST_val_in_SFO_section, "HST value is displayed in SFO section in Payments page");
		
    	String act_CreditNotes_in_SFO_is=fld_CreditNotes_in_SFO_Payments_page().getText().trim();
    	act_CreditNotes_in_SFO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_SFO_is);
    	double act_CreditNotes_in_SFO=Double.parseDouble(act_CreditNotes_in_SFO_is);
    	
    	double exp_CreditNotes_in_SFO=SFO_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_SFO, exp_CreditNotes_in_SFO, "Incorrect SFO Credit Notes value is displayed in Payments page");
    	
    	String act_SFO_Total_is=fld_SFO_Total_Payments_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	double exp_SFO_Total=(act_SFO_subTotal+exp_HST_val_in_SFO_section)-(exp_CreditNotes_in_SFO);
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Payments page");
    	
    	return exp_SFO_Total;
	}
	
	@Override
    public double No_tax_validation_of_SFO_section_in_Payments_page_GST() {
    	double SFO_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_subTotal_is=fld_SFO_subtotal_Payments_page().getText().trim();
    	act_SFO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_subTotal_is);
    	double act_SFO_subTotal=Double.parseDouble(act_SFO_subTotal_is);
    	
    	String act_GST_in_SFO_section=fld_GST_in_SFO_section_Payments_page().getText().trim();
    	act_GST_in_SFO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_SFO_section);
    	double act_GST_val_in_SFO_section=Double.parseDouble(act_GST_in_SFO_section);
    	
    	double exp_GST_val_in_SFO_section=0;
    	Assert.assertEquals(act_GST_val_in_SFO_section, exp_GST_val_in_SFO_section, "GST value is displayed in SFO section in Payments page");
		
    	String act_CreditNotes_in_SFO_is=fld_CreditNotes_in_SFO_Payments_page().getText().trim();
    	act_CreditNotes_in_SFO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_SFO_is);
    	double act_CreditNotes_in_SFO=Double.parseDouble(act_CreditNotes_in_SFO_is);
    	
    	double exp_CreditNotes_in_SFO=SFO_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_SFO, exp_CreditNotes_in_SFO, "Incorrect SFO Credit Notes value is displayed in Payments page");
    	
    	String act_SFO_Total_is=fld_SFO_Total_Payments_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	double exp_SFO_Total=(act_SFO_subTotal+exp_GST_val_in_SFO_section)-(exp_CreditNotes_in_SFO);
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Payments page");
    	
    	return exp_SFO_Total;
	}
	
	@Override
    public void teacher_validate_SFO_totals_taxes_OrderTotal_in_Payments_page_GST_PST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_SFO_section_val = teacher_validate_SFO_section_in_Payments_page_GST_PST();
    	double exp_Shipping_section_val = teacher_validate_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST_PST();
    	
    	double exp_Order_Total=exp_SFO_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void teacher_validate_SFO_totals_taxes_OrderTotal_in_Payments_page_GST_QST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_SFO_section_val = teacher_validate_SFO_section_in_Payments_page_GST_QST();
    	double exp_Shipping_section_val = teacher_validate_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST_QST();
    	
    	double exp_Order_Total=exp_SFO_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void teacher_validate_SFO_totals_taxes_OrderTotal_in_Payments_page_HST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_SFO_section_val = teacher_validate_SFO_section_in_Payments_page_HST();
    	double exp_Shipping_section_val = teacher_validate_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_HST();
    	
    	double exp_Order_Total=exp_SFO_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void teacher_validate_SFO_totals_taxes_OrderTotal_in_Payments_page_GST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_SFO_section_val = teacher_validate_SFO_section_in_Payments_page_GST();
    	double exp_Shipping_section_val = teacher_validate_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST();
    	
    	double exp_Order_Total=exp_SFO_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void No_tax_validation_of_SFO_totals_OrderTotal_in_Payments_page_GST_PST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_SFO_section_val = No_tax_validation_of_SFO_section_in_Payments_page_GST_PST();
    	double exp_Shipping_section_val = No_tax_validation_of_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST_PST();
    	
    	double exp_Order_Total=exp_SFO_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void No_tax_validation_of_SFO_totals_OrderTotal_in_Payments_page_GST_QST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_SFO_section_val = No_tax_validation_of_SFO_section_in_Payments_page_GST_QST();
    	double exp_Shipping_section_val = No_tax_validation_of_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST_QST();
    	
    	double exp_Order_Total=exp_SFO_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void No_tax_validation_of_SFO_totals_OrderTotal_in_Payments_page_HST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_SFO_section_val = No_tax_validation_of_SFO_section_in_Payments_page_HST();
    	double exp_Shipping_section_val = No_tax_validation_of_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_HST();
    	
    	double exp_Order_Total=exp_SFO_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void No_tax_validation_of_SFO_totals_OrderTotal_in_Payments_page_GST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_SFO_section_val = No_tax_validation_of_SFO_section_in_Payments_page_GST();
    	double exp_Shipping_section_val = No_tax_validation_of_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST();
    	
    	double exp_Order_Total=exp_SFO_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void teacher_sees_YTO_section_Payments_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        try {
        	section_YTO_Payments_page().isDisplayed();
        	System.out.println("YTO section is displayed in Payments page");
		} catch (Exception e) {
			Assert.fail("YTO section is not displayed in Payments page");
		}
    }
	
	@Override
    public void teacher_sees_TE_section_Payments_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        try {
        	section_TE_Payments_page().isDisplayed();
        	System.out.println("TE section is displayed in Payments page");
		} catch (Exception e) {
			Assert.fail("TE section is not displayed in Payments page");
		}
    }
	
	@Override
    public double teacher_validate_YTO_section_in_Payments_page_GST_PST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");
    	double YTO_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double YTO_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_subTotal_is=fld_YTO_subtotal_Payments_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	String act_GST_in_YTO_section=fld_GST_in_YTO_section_Payments_page().getText().trim();
    	act_GST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_YTO_section);
    	double act_GST_val_in_YTO_section=Double.parseDouble(act_GST_in_YTO_section);
    	
    	String act_PST_in_YTO_section=fld_PST_in_YTO_section_Payments_page().getText().trim();
    	act_PST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_PST_in_YTO_section);
    	double act_PST_val_in_YTO_section=Double.parseDouble(act_PST_in_YTO_section);
    	
    	double exp_GST_val_in_YTO_section=(double)(act_YTO_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_YTO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_YTO_section));
    	
    	Assert.assertEquals(act_GST_val_in_YTO_section, exp_GST_val_in_YTO_section, "Incorrect GST value is displayed in YTO section in Payments page");
		
    	
    	double exp_PST_val_in_YTO_section=(double)(act_YTO_subTotal * stateTaxPST) / 100;
    	exp_PST_val_in_YTO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_val_in_YTO_section));
    	
    	Assert.assertEquals(act_PST_val_in_YTO_section, exp_PST_val_in_YTO_section, "Incorrect PST value is displayed in YTO section in Payments page");
		
    	String act_BonusBank_in_YTO_is=fld_BonusBank_in_YTO_Payments_page().getText().trim();
    	act_BonusBank_in_YTO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_YTO_is);
    	double act_BonusBank_in_YTO=Double.parseDouble(act_BonusBank_in_YTO_is);
    	
    	double exp_BonusBank_in_YTO=YTO_BonusBank;
    	Assert.assertEquals(act_BonusBank_in_YTO, exp_BonusBank_in_YTO, "Incorrect YTO Bonus Bank value is displayed in Payments page");
    	
    	String act_CreditNotes_in_YTO_is=fld_CreditNotes_in_YTO_Payments_page().getText().trim();
    	act_CreditNotes_in_YTO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_YTO_is);
    	double act_CreditNotes_in_YTO=Double.parseDouble(act_CreditNotes_in_YTO_is);
    	
    	double exp_CreditNotes_in_YTO=YTO_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_YTO, exp_CreditNotes_in_YTO, "Incorrect YTO Credit Notes value is displayed in Payments page");
    	
    	String act_YTO_Total_is=fld_YTO_Total_Payments_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	double exp_YTO_Total=(act_YTO_subTotal+exp_GST_val_in_YTO_section+exp_PST_val_in_YTO_section)-(exp_BonusBank_in_YTO+exp_CreditNotes_in_YTO);
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Payments page");
    	
    	return exp_YTO_Total;
	}
	
	@Override
    public double teacher_validate_YTO_section_in_Payments_page_GST_QST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxQST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxQST");
    	double YTO_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double YTO_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_subTotal_is=fld_YTO_subtotal_Payments_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	String act_GST_in_YTO_section=fld_GST_in_YTO_section_Payments_page().getText().trim();
    	act_GST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_YTO_section);
    	double act_GST_val_in_YTO_section=Double.parseDouble(act_GST_in_YTO_section);
    	
    	String act_QST_in_YTO_section=fld_QST_in_YTO_section_Payments_page().getText().trim();
    	act_QST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_QST_in_YTO_section);
    	double act_QST_val_in_YTO_section=Double.parseDouble(act_QST_in_YTO_section);
    	
    	double exp_GST_val_in_YTO_section=(double)(act_YTO_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_YTO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_YTO_section));
    	
    	Assert.assertEquals(act_GST_val_in_YTO_section, exp_GST_val_in_YTO_section, "Incorrect GST value is displayed in YTO section in Payments page");
		
    	
    	double exp_QST_val_in_YTO_section=(double)(act_YTO_subTotal * stateTaxQST) / 100;
    	exp_QST_val_in_YTO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_QST_val_in_YTO_section));
    	
    	Assert.assertEquals(act_QST_val_in_YTO_section, exp_QST_val_in_YTO_section, "Incorrect QST value is displayed in YTO section in Payments page");
		
    	String act_BonusBank_in_YTO_is=fld_BonusBank_in_YTO_Payments_page().getText().trim();
    	act_BonusBank_in_YTO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_YTO_is);
    	double act_BonusBank_in_YTO=Double.parseDouble(act_BonusBank_in_YTO_is);
    	
    	double exp_BonusBank_in_YTO=YTO_BonusBank;
    	Assert.assertEquals(act_BonusBank_in_YTO, exp_BonusBank_in_YTO, "Incorrect YTO Bonus Bank value is displayed in Payments page");
    	
    	String act_CreditNotes_in_YTO_is=fld_CreditNotes_in_YTO_Payments_page().getText().trim();
    	act_CreditNotes_in_YTO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_YTO_is);
    	double act_CreditNotes_in_YTO=Double.parseDouble(act_CreditNotes_in_YTO_is);
    	
    	double exp_CreditNotes_in_YTO=YTO_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_YTO, exp_CreditNotes_in_YTO, "Incorrect YTO Credit Notes value is displayed in Payments page");
    	
    	String act_YTO_Total_is=fld_YTO_Total_Payments_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	double exp_YTO_Total=(act_YTO_subTotal+exp_GST_val_in_YTO_section+exp_QST_val_in_YTO_section)-(exp_BonusBank_in_YTO+exp_CreditNotes_in_YTO);
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Payments page");
    	
    	return exp_YTO_Total;
	}
	
	@Override
    public double teacher_validate_YTO_section_in_Payments_page_HST() {
    	double stateTaxHST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxHST");
    	double YTO_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double YTO_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_subTotal_is=fld_YTO_subtotal_Payments_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	String act_HST_in_YTO_section=fld_HST_in_YTO_section_Payments_page().getText().trim();
    	act_HST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_HST_in_YTO_section);
    	double act_HST_val_in_YTO_section=Double.parseDouble(act_HST_in_YTO_section);
    	
    	double exp_HST_val_in_YTO_section=(double)(act_YTO_subTotal * stateTaxHST) / 100;
    	exp_HST_val_in_YTO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_HST_val_in_YTO_section));
    	
    	Assert.assertEquals(act_HST_val_in_YTO_section, exp_HST_val_in_YTO_section, "Incorrect HST value is displayed in YTO section in Payments page");
		
    	String act_BonusBank_in_YTO_is=fld_BonusBank_in_YTO_Payments_page().getText().trim();
    	act_BonusBank_in_YTO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_YTO_is);
    	double act_BonusBank_in_YTO=Double.parseDouble(act_BonusBank_in_YTO_is);
    	
    	double exp_BonusBank_in_YTO=YTO_BonusBank;
    	Assert.assertEquals(act_BonusBank_in_YTO, exp_BonusBank_in_YTO, "Incorrect YTO Bonus Bank value is displayed in Payments page");
    	
    	String act_CreditNotes_in_YTO_is=fld_CreditNotes_in_YTO_Payments_page().getText().trim();
    	act_CreditNotes_in_YTO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_YTO_is);
    	double act_CreditNotes_in_YTO=Double.parseDouble(act_CreditNotes_in_YTO_is);
    	
    	double exp_CreditNotes_in_YTO=YTO_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_YTO, exp_CreditNotes_in_YTO, "Incorrect YTO Credit Notes value is displayed in Payments page");
    	
    	String act_YTO_Total_is=fld_YTO_Total_Payments_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	double exp_YTO_Total=(act_YTO_subTotal+exp_HST_val_in_YTO_section)-(exp_BonusBank_in_YTO+exp_CreditNotes_in_YTO);
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Payments page");
    	
    	return exp_YTO_Total;
	}
	
	@Override
    public double teacher_validate_YTO_section_in_Payments_page_GST() {
    	double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");
    	double YTO_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double YTO_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_subTotal_is=fld_YTO_subtotal_Payments_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	String act_GST_in_YTO_section=fld_GST_in_YTO_section_Payments_page().getText().trim();
    	act_GST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_YTO_section);
    	double act_GST_val_in_YTO_section=Double.parseDouble(act_GST_in_YTO_section);
    	
    	double exp_GST_val_in_YTO_section=(double)(act_YTO_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_YTO_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_YTO_section));
    	
    	Assert.assertEquals(act_GST_val_in_YTO_section, exp_GST_val_in_YTO_section, "Incorrect GST value is displayed in YTO section in Payments page");
		
    	String act_BonusBank_in_YTO_is=fld_BonusBank_in_YTO_Payments_page().getText().trim();
    	act_BonusBank_in_YTO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_YTO_is);
    	double act_BonusBank_in_YTO=Double.parseDouble(act_BonusBank_in_YTO_is);
    	
    	double exp_BonusBank_in_YTO=YTO_BonusBank;
    	Assert.assertEquals(act_BonusBank_in_YTO, exp_BonusBank_in_YTO, "Incorrect YTO Bonus Bank value is displayed in Payments page");
    	
    	String act_CreditNotes_in_YTO_is=fld_CreditNotes_in_YTO_Payments_page().getText().trim();
    	act_CreditNotes_in_YTO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_YTO_is);
    	double act_CreditNotes_in_YTO=Double.parseDouble(act_CreditNotes_in_YTO_is);
    	
    	double exp_CreditNotes_in_YTO=YTO_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_YTO, exp_CreditNotes_in_YTO, "Incorrect YTO Credit Notes value is displayed in Payments page");
    	
    	String act_YTO_Total_is=fld_YTO_Total_Payments_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	double exp_YTO_Total=(act_YTO_subTotal+exp_GST_val_in_YTO_section)-(exp_BonusBank_in_YTO+exp_CreditNotes_in_YTO);
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Payments page");
    	
    	return exp_YTO_Total;
	}
	
	@Override
    public double No_tax_validation_of_YTO_section_in_Payments_page_GST_PST() {
		double YTO_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double YTO_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_subTotal_is=fld_YTO_subtotal_Payments_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	String act_GST_in_YTO_section=fld_GST_in_YTO_section_Payments_page().getText().trim();
    	act_GST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_YTO_section);
    	double act_GST_val_in_YTO_section=Double.parseDouble(act_GST_in_YTO_section);
    	
    	String act_PST_in_YTO_section=fld_PST_in_YTO_section_Payments_page().getText().trim();
    	act_PST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_PST_in_YTO_section);
    	double act_PST_val_in_YTO_section=Double.parseDouble(act_PST_in_YTO_section);
    	
    	double exp_GST_val_in_YTO_section=0;
    	Assert.assertEquals(act_GST_val_in_YTO_section, exp_GST_val_in_YTO_section, "GST value is displayed in YTO section in Payments page");
		
    	
    	double exp_PST_val_in_YTO_section=0;
    	Assert.assertEquals(act_PST_val_in_YTO_section, exp_PST_val_in_YTO_section, "PST value is displayed in YTO section in Payments page");
		
    	String act_BonusBank_in_YTO_is=fld_BonusBank_in_YTO_Payments_page().getText().trim();
    	act_BonusBank_in_YTO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_YTO_is);
    	double act_BonusBank_in_YTO=Double.parseDouble(act_BonusBank_in_YTO_is);
    	
    	double exp_BonusBank_in_YTO=YTO_BonusBank;
    	Assert.assertEquals(act_BonusBank_in_YTO, exp_BonusBank_in_YTO, "Incorrect YTO Bonus Bank value is displayed in Payments page");
    	
    	String act_CreditNotes_in_YTO_is=fld_CreditNotes_in_YTO_Payments_page().getText().trim();
    	act_CreditNotes_in_YTO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_YTO_is);
    	double act_CreditNotes_in_YTO=Double.parseDouble(act_CreditNotes_in_YTO_is);
    	
    	double exp_CreditNotes_in_YTO=YTO_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_YTO, exp_CreditNotes_in_YTO, "Incorrect YTO Credit Notes value is displayed in Payments page");
    	
    	String act_YTO_Total_is=fld_YTO_Total_Payments_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	double exp_YTO_Total=(act_YTO_subTotal+exp_GST_val_in_YTO_section+exp_PST_val_in_YTO_section)-(exp_BonusBank_in_YTO+exp_CreditNotes_in_YTO);
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Payments page");
    	
    	return exp_YTO_Total;
	}
	
	@Override
    public double No_tax_validation_of_YTO_section_in_Payments_page_GST_QST() {
		double YTO_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double YTO_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_subTotal_is=fld_YTO_subtotal_Payments_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	String act_GST_in_YTO_section=fld_GST_in_YTO_section_Payments_page().getText().trim();
    	act_GST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_YTO_section);
    	double act_GST_val_in_YTO_section=Double.parseDouble(act_GST_in_YTO_section);
    	
    	String act_QST_in_YTO_section=fld_QST_in_YTO_section_Payments_page().getText().trim();
    	act_QST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_QST_in_YTO_section);
    	double act_QST_val_in_YTO_section=Double.parseDouble(act_QST_in_YTO_section);
    	
    	double exp_GST_val_in_YTO_section=0;
    	Assert.assertEquals(act_GST_val_in_YTO_section, exp_GST_val_in_YTO_section, "GST value is displayed in YTO section in Payments page");
		
    	
    	double exp_QST_val_in_YTO_section=0;
    	Assert.assertEquals(act_QST_val_in_YTO_section, exp_QST_val_in_YTO_section, "QST value is displayed in YTO section in Payments page");
		
    	String act_BonusBank_in_YTO_is=fld_BonusBank_in_YTO_Payments_page().getText().trim();
    	act_BonusBank_in_YTO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_YTO_is);
    	double act_BonusBank_in_YTO=Double.parseDouble(act_BonusBank_in_YTO_is);
    	
    	double exp_BonusBank_in_YTO=YTO_BonusBank;
    	Assert.assertEquals(act_BonusBank_in_YTO, exp_BonusBank_in_YTO, "Incorrect YTO Bonus Bank value is displayed in Payments page");
    	
    	String act_CreditNotes_in_YTO_is=fld_CreditNotes_in_YTO_Payments_page().getText().trim();
    	act_CreditNotes_in_YTO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_YTO_is);
    	double act_CreditNotes_in_YTO=Double.parseDouble(act_CreditNotes_in_YTO_is);
    	
    	double exp_CreditNotes_in_YTO=YTO_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_YTO, exp_CreditNotes_in_YTO, "Incorrect YTO Credit Notes value is displayed in Payments page");
    	
    	String act_YTO_Total_is=fld_YTO_Total_Payments_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	double exp_YTO_Total=(act_YTO_subTotal+exp_GST_val_in_YTO_section+exp_QST_val_in_YTO_section)-(exp_BonusBank_in_YTO+exp_CreditNotes_in_YTO);
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Payments page");
    	
    	return exp_YTO_Total;
	}
	
	@Override
    public double No_tax_validation_of_YTO_section_in_Payments_page_HST() {
		double YTO_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double YTO_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_subTotal_is=fld_YTO_subtotal_Payments_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	String act_HST_in_YTO_section=fld_HST_in_YTO_section_Payments_page().getText().trim();
    	act_HST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_HST_in_YTO_section);
    	double act_HST_val_in_YTO_section=Double.parseDouble(act_HST_in_YTO_section);
    	
    	double exp_HST_val_in_YTO_section=0;
    	Assert.assertEquals(act_HST_val_in_YTO_section, exp_HST_val_in_YTO_section, "HST value is displayed in YTO section in Payments page");
		
    	String act_BonusBank_in_YTO_is=fld_BonusBank_in_YTO_Payments_page().getText().trim();
    	act_BonusBank_in_YTO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_YTO_is);
    	double act_BonusBank_in_YTO=Double.parseDouble(act_BonusBank_in_YTO_is);
    	
    	double exp_BonusBank_in_YTO=YTO_BonusBank;
    	Assert.assertEquals(act_BonusBank_in_YTO, exp_BonusBank_in_YTO, "Incorrect YTO Bonus Bank value is displayed in Payments page");
    	
    	String act_CreditNotes_in_YTO_is=fld_CreditNotes_in_YTO_Payments_page().getText().trim();
    	act_CreditNotes_in_YTO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_YTO_is);
    	double act_CreditNotes_in_YTO=Double.parseDouble(act_CreditNotes_in_YTO_is);
    	
    	double exp_CreditNotes_in_YTO=YTO_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_YTO, exp_CreditNotes_in_YTO, "Incorrect YTO Credit Notes value is displayed in Payments page");
    	
    	String act_YTO_Total_is=fld_YTO_Total_Payments_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	double exp_YTO_Total=(act_YTO_subTotal+exp_HST_val_in_YTO_section)-(exp_BonusBank_in_YTO+exp_CreditNotes_in_YTO);
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Payments page");
    	
    	return exp_YTO_Total;
	}
	
	@Override
    public double No_tax_validation_of_YTO_section_in_Payments_page_GST() {
		double YTO_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double YTO_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_subTotal_is=fld_YTO_subtotal_Payments_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	String act_GST_in_YTO_section=fld_GST_in_YTO_section_Payments_page().getText().trim();
    	act_GST_in_YTO_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_YTO_section);
    	double act_GST_val_in_YTO_section=Double.parseDouble(act_GST_in_YTO_section);
    	
    	double exp_GST_val_in_YTO_section=0;
    	Assert.assertEquals(act_GST_val_in_YTO_section, exp_GST_val_in_YTO_section, "GST value is displayed in YTO section in Payments page");
		
    	String act_BonusBank_in_YTO_is=fld_BonusBank_in_YTO_Payments_page().getText().trim();
    	act_BonusBank_in_YTO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_YTO_is);
    	double act_BonusBank_in_YTO=Double.parseDouble(act_BonusBank_in_YTO_is);
    	
    	double exp_BonusBank_in_YTO=YTO_BonusBank;
    	Assert.assertEquals(act_BonusBank_in_YTO, exp_BonusBank_in_YTO, "Incorrect YTO Bonus Bank value is displayed in Payments page");
    	
    	String act_CreditNotes_in_YTO_is=fld_CreditNotes_in_YTO_Payments_page().getText().trim();
    	act_CreditNotes_in_YTO_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_YTO_is);
    	double act_CreditNotes_in_YTO=Double.parseDouble(act_CreditNotes_in_YTO_is);
    	
    	double exp_CreditNotes_in_YTO=YTO_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_YTO, exp_CreditNotes_in_YTO, "Incorrect YTO Credit Notes value is displayed in Payments page");
    	
    	String act_YTO_Total_is=fld_YTO_Total_Payments_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	double exp_YTO_Total=(act_YTO_subTotal+exp_GST_val_in_YTO_section)-(exp_BonusBank_in_YTO+exp_CreditNotes_in_YTO);
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Payments page");
    	
    	return exp_YTO_Total;
	}
	
	@Override
    public double teacher_validate_TE_section_in_Payments_page_GST_PST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");
    	double TE_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double TE_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_subTotal_is=fld_TE_subtotal_Payments_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	String act_GST_in_TE_section=fld_GST_in_TE_section_Payments_page().getText().trim();
    	act_GST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_TE_section);
    	double act_GST_val_in_TE_section=Double.parseDouble(act_GST_in_TE_section);
    	
    	String act_PST_in_TE_section=fld_PST_in_TE_section_Payments_page().getText().trim();
    	act_PST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_PST_in_TE_section);
    	double act_PST_val_in_TE_section=Double.parseDouble(act_PST_in_TE_section);
    	
    	double exp_GST_val_in_TE_section=(double)(act_TE_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_TE_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_TE_section));
    	
    	Assert.assertEquals(act_GST_val_in_TE_section, exp_GST_val_in_TE_section, "Incorrect GST value is displayed in TE section in Payments page");
		
    	
    	double exp_PST_val_in_TE_section=(double)(act_TE_subTotal * stateTaxPST) / 100;
    	exp_PST_val_in_TE_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_val_in_TE_section));
    	
    	Assert.assertEquals(act_PST_val_in_TE_section, exp_PST_val_in_TE_section, "Incorrect PST value is displayed in TE section in Payments page");
		
    	String act_BonusBank_in_TE_is=fld_BonusBank_in_TE_Payments_page().getText().trim();
    	act_BonusBank_in_TE_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_TE_is);
    	double act_BonusBank_in_TE=Double.parseDouble(act_BonusBank_in_TE_is);
    	
    	double exp_BonusBank_in_TE=TE_BonusBank;
    	Assert.assertEquals(act_BonusBank_in_TE, exp_BonusBank_in_TE, "Incorrect TE Bonus Bank value is displayed in Payments page");
    	
    	String act_CreditNotes_in_TE_is=fld_CreditNotes_in_TE_Payments_page().getText().trim();
    	act_CreditNotes_in_TE_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_TE_is);
    	double act_CreditNotes_in_TE=Double.parseDouble(act_CreditNotes_in_TE_is);
    	
    	double exp_CreditNotes_in_TE=TE_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_TE, exp_CreditNotes_in_TE, "Incorrect TE Credit Notes value is displayed in Payments page");
    	
    	String act_TE_Total_is=fld_TE_Total_Payments_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	
    	double exp_TE_Total=(act_TE_subTotal+exp_GST_val_in_TE_section+exp_PST_val_in_TE_section)-(exp_BonusBank_in_TE+exp_CreditNotes_in_TE);
    	exp_TE_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_Total));
    	
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE Total value is displayed in Payments page");
    	
    	return exp_TE_Total;
	}
	
	@Override
    public double teacher_validate_TE_section_in_Payments_page_GST_QST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxQST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxQST");
    	double TE_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double TE_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_subTotal_is=fld_TE_subtotal_Payments_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	String act_GST_in_TE_section=fld_GST_in_TE_section_Payments_page().getText().trim();
    	act_GST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_TE_section);
    	double act_GST_val_in_TE_section=Double.parseDouble(act_GST_in_TE_section);
    	
    	String act_QST_in_TE_section=fld_QST_in_TE_section_Payments_page().getText().trim();
    	act_QST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_QST_in_TE_section);
    	double act_QST_val_in_TE_section=Double.parseDouble(act_QST_in_TE_section);
    	
    	double exp_GST_val_in_TE_section=(double)(act_TE_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_TE_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_TE_section));
    	
    	Assert.assertEquals(act_GST_val_in_TE_section, exp_GST_val_in_TE_section, "Incorrect GST value is displayed in TE section in Payments page");
		
    	
    	double exp_QST_val_in_TE_section=(double)(act_TE_subTotal * stateTaxQST) / 100;
    	exp_QST_val_in_TE_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_QST_val_in_TE_section));
    	
    	Assert.assertEquals(act_QST_val_in_TE_section, exp_QST_val_in_TE_section, "Incorrect QST value is displayed in TE section in Payments page");
		
    	String act_BonusBank_in_TE_is=fld_BonusBank_in_TE_Payments_page().getText().trim();
    	act_BonusBank_in_TE_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_TE_is);
    	double act_BonusBank_in_TE=Double.parseDouble(act_BonusBank_in_TE_is);
    	
    	double exp_BonusBank_in_TE=TE_BonusBank;
    	Assert.assertEquals(act_BonusBank_in_TE, exp_BonusBank_in_TE, "Incorrect TE Bonus Bank value is displayed in Payments page");
    	
    	String act_CreditNotes_in_TE_is=fld_CreditNotes_in_TE_Payments_page().getText().trim();
    	act_CreditNotes_in_TE_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_TE_is);
    	double act_CreditNotes_in_TE=Double.parseDouble(act_CreditNotes_in_TE_is);
    	
    	double exp_CreditNotes_in_TE=TE_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_TE, exp_CreditNotes_in_TE, "Incorrect TE Credit Notes value is displayed in Payments page");
    	
    	String act_TE_Total_is=fld_TE_Total_Payments_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	
    	double exp_TE_Total=(act_TE_subTotal+exp_GST_val_in_TE_section+exp_QST_val_in_TE_section)-(exp_BonusBank_in_TE+exp_CreditNotes_in_TE);
    	exp_TE_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_Total));
    	
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE Total value is displayed in Payments page");
    	
    	return exp_TE_Total;
	}
	
	@Override
    public double teacher_validate_TE_section_in_Payments_page_HST() {
    	double stateTaxHST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxHST");
    	double TE_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double TE_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_subTotal_is=fld_TE_subtotal_Payments_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	String act_HST_in_TE_section=fld_HST_in_TE_section_Payments_page().getText().trim();
    	act_HST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_HST_in_TE_section);
    	double act_HST_val_in_TE_section=Double.parseDouble(act_HST_in_TE_section);
    	
    	double exp_HST_val_in_TE_section=(double)(act_TE_subTotal * stateTaxHST) / 100;
    	exp_HST_val_in_TE_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_HST_val_in_TE_section));
    	
    	Assert.assertEquals(act_HST_val_in_TE_section, exp_HST_val_in_TE_section, "Incorrect HST value is displayed in TE section in Payments page");
		
    	String act_BonusBank_in_TE_is=fld_BonusBank_in_TE_Payments_page().getText().trim();
    	act_BonusBank_in_TE_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_TE_is);
    	double act_BonusBank_in_TE=Double.parseDouble(act_BonusBank_in_TE_is);
    	
    	double exp_BonusBank_in_TE=TE_BonusBank;
    	Assert.assertEquals(act_BonusBank_in_TE, exp_BonusBank_in_TE, "Incorrect TE Bonus Bank value is displayed in Payments page");
    	
    	String act_CreditNotes_in_TE_is=fld_CreditNotes_in_TE_Payments_page().getText().trim();
    	act_CreditNotes_in_TE_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_TE_is);
    	double act_CreditNotes_in_TE=Double.parseDouble(act_CreditNotes_in_TE_is);
    	
    	double exp_CreditNotes_in_TE=TE_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_TE, exp_CreditNotes_in_TE, "Incorrect TE Credit Notes value is displayed in Payments page");
    	
    	String act_TE_Total_is=fld_TE_Total_Payments_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	
    	double exp_TE_Total=(act_TE_subTotal+exp_HST_val_in_TE_section)-(exp_BonusBank_in_TE+exp_CreditNotes_in_TE);
    	exp_TE_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_Total));
    	
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE Total value is displayed in Payments page");
    	
    	return exp_TE_Total;
	}
	
	@Override
    public double teacher_validate_TE_section_in_Payments_page_GST() {
    	double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");
    	double TE_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double TE_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_subTotal_is=fld_TE_subtotal_Payments_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	String act_GST_in_TE_section=fld_GST_in_TE_section_Payments_page().getText().trim();
    	act_GST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_TE_section);
    	double act_GST_val_in_TE_section=Double.parseDouble(act_GST_in_TE_section);
    	
    	double exp_GST_val_in_TE_section=(double)(act_TE_subTotal * stateTaxGST) / 100;
    	exp_GST_val_in_TE_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_TE_section));
    	
    	Assert.assertEquals(act_GST_val_in_TE_section, exp_GST_val_in_TE_section, "Incorrect GST value is displayed in TE section in Payments page");
		
    	String act_BonusBank_in_TE_is=fld_BonusBank_in_TE_Payments_page().getText().trim();
    	act_BonusBank_in_TE_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_TE_is);
    	double act_BonusBank_in_TE=Double.parseDouble(act_BonusBank_in_TE_is);
    	
    	double exp_BonusBank_in_TE=TE_BonusBank;
    	Assert.assertEquals(act_BonusBank_in_TE, exp_BonusBank_in_TE, "Incorrect TE Bonus Bank value is displayed in Payments page");
    	
    	String act_CreditNotes_in_TE_is=fld_CreditNotes_in_TE_Payments_page().getText().trim();
    	act_CreditNotes_in_TE_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_TE_is);
    	double act_CreditNotes_in_TE=Double.parseDouble(act_CreditNotes_in_TE_is);
    	
    	double exp_CreditNotes_in_TE=TE_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_TE, exp_CreditNotes_in_TE, "Incorrect TE Credit Notes value is displayed in Payments page");
    	
    	String act_TE_Total_is=fld_TE_Total_Payments_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	
    	double exp_TE_Total=(act_TE_subTotal+exp_GST_val_in_TE_section)-(exp_BonusBank_in_TE+exp_CreditNotes_in_TE);
    	exp_TE_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_Total));
    	
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE Total value is displayed in Payments page");
    	
    	return exp_TE_Total;
	}
	
	@Override
    public double No_tax_validation_of_TE_section_in_Payments_page_GST_PST() {
		double TE_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double TE_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_subTotal_is=fld_TE_subtotal_Payments_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	String act_GST_in_TE_section=fld_GST_in_TE_section_Payments_page().getText().trim();
    	act_GST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_TE_section);
    	double act_GST_val_in_TE_section=Double.parseDouble(act_GST_in_TE_section);
    	
    	String act_PST_in_TE_section=fld_PST_in_TE_section_Payments_page().getText().trim();
    	act_PST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_PST_in_TE_section);
    	double act_PST_val_in_TE_section=Double.parseDouble(act_PST_in_TE_section);
    	
    	double exp_GST_val_in_TE_section=0;
    	Assert.assertEquals(act_GST_val_in_TE_section, exp_GST_val_in_TE_section, "GST value is displayed in TE section in Payments page");
		
    	
    	double exp_PST_val_in_TE_section=0;
    	Assert.assertEquals(act_PST_val_in_TE_section, exp_PST_val_in_TE_section, "PST value is displayed in TE section in Payments page");
		
    	String act_BonusBank_in_TE_is=fld_BonusBank_in_TE_Payments_page().getText().trim();
    	act_BonusBank_in_TE_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_TE_is);
    	double act_BonusBank_in_TE=Double.parseDouble(act_BonusBank_in_TE_is);
    	
    	double exp_BonusBank_in_TE=TE_BonusBank;
    	Assert.assertEquals(act_BonusBank_in_TE, exp_BonusBank_in_TE, "Incorrect TE Bonus Bank value is displayed in Payments page");
    	
    	String act_CreditNotes_in_TE_is=fld_CreditNotes_in_TE_Payments_page().getText().trim();
    	act_CreditNotes_in_TE_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_TE_is);
    	double act_CreditNotes_in_TE=Double.parseDouble(act_CreditNotes_in_TE_is);
    	
    	double exp_CreditNotes_in_TE=TE_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_TE, exp_CreditNotes_in_TE, "Incorrect TE Credit Notes value is displayed in Payments page");
    	
    	String act_TE_Total_is=fld_TE_Total_Payments_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	
    	double exp_TE_Total=(act_TE_subTotal+exp_GST_val_in_TE_section+exp_PST_val_in_TE_section)-(exp_BonusBank_in_TE+exp_CreditNotes_in_TE);
    	exp_TE_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_Total));
    	
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE Total value is displayed in Payments page");
    	
    	return exp_TE_Total;
	}
	
	@Override
    public double No_tax_validation_of_TE_section_in_Payments_page_GST_QST() {
		double TE_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double TE_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_subTotal_is=fld_TE_subtotal_Payments_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	String act_GST_in_TE_section=fld_GST_in_TE_section_Payments_page().getText().trim();
    	act_GST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_TE_section);
    	double act_GST_val_in_TE_section=Double.parseDouble(act_GST_in_TE_section);
    	
    	String act_QST_in_TE_section=fld_QST_in_TE_section_Payments_page().getText().trim();
    	act_QST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_QST_in_TE_section);
    	double act_QST_val_in_TE_section=Double.parseDouble(act_QST_in_TE_section);
    	
    	double exp_GST_val_in_TE_section=0;
    	Assert.assertEquals(act_GST_val_in_TE_section, exp_GST_val_in_TE_section, "GST value is displayed in TE section in Payments page");
		
    	
    	double exp_QST_val_in_TE_section=0;
    	Assert.assertEquals(act_QST_val_in_TE_section, exp_QST_val_in_TE_section, "QST value is displayed in TE section in Payments page");
		
    	String act_BonusBank_in_TE_is=fld_BonusBank_in_TE_Payments_page().getText().trim();
    	act_BonusBank_in_TE_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_TE_is);
    	double act_BonusBank_in_TE=Double.parseDouble(act_BonusBank_in_TE_is);
    	
    	double exp_BonusBank_in_TE=TE_BonusBank;
    	Assert.assertEquals(act_BonusBank_in_TE, exp_BonusBank_in_TE, "Incorrect TE Bonus Bank value is displayed in Payments page");
    	
    	String act_CreditNotes_in_TE_is=fld_CreditNotes_in_TE_Payments_page().getText().trim();
    	act_CreditNotes_in_TE_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_TE_is);
    	double act_CreditNotes_in_TE=Double.parseDouble(act_CreditNotes_in_TE_is);
    	
    	double exp_CreditNotes_in_TE=TE_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_TE, exp_CreditNotes_in_TE, "Incorrect TE Credit Notes value is displayed in Payments page");
    	
    	String act_TE_Total_is=fld_TE_Total_Payments_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	
    	double exp_TE_Total=(act_TE_subTotal+exp_GST_val_in_TE_section+exp_QST_val_in_TE_section)-(exp_BonusBank_in_TE+exp_CreditNotes_in_TE);
    	exp_TE_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_Total));
    	
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE Total value is displayed in Payments page");
    	
    	return exp_TE_Total;
	}
	
	@Override
    public double No_tax_validation_of_TE_section_in_Payments_page_HST() {
		double TE_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double TE_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_subTotal_is=fld_TE_subtotal_Payments_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	String act_HST_in_TE_section=fld_HST_in_TE_section_Payments_page().getText().trim();
    	act_HST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_HST_in_TE_section);
    	double act_HST_val_in_TE_section=Double.parseDouble(act_HST_in_TE_section);
    	
    	double exp_HST_val_in_TE_section=0;
    	Assert.assertEquals(act_HST_val_in_TE_section, exp_HST_val_in_TE_section, "HST value is displayed in TE section in Payments page");
		
    	String act_BonusBank_in_TE_is=fld_BonusBank_in_TE_Payments_page().getText().trim();
    	act_BonusBank_in_TE_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_TE_is);
    	double act_BonusBank_in_TE=Double.parseDouble(act_BonusBank_in_TE_is);
    	
    	double exp_BonusBank_in_TE=TE_BonusBank;
    	Assert.assertEquals(act_BonusBank_in_TE, exp_BonusBank_in_TE, "Incorrect TE Bonus Bank value is displayed in Payments page");
    	
    	String act_CreditNotes_in_TE_is=fld_CreditNotes_in_TE_Payments_page().getText().trim();
    	act_CreditNotes_in_TE_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_TE_is);
    	double act_CreditNotes_in_TE=Double.parseDouble(act_CreditNotes_in_TE_is);
    	
    	double exp_CreditNotes_in_TE=TE_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_TE, exp_CreditNotes_in_TE, "Incorrect TE Credit Notes value is displayed in Payments page");
    	
    	String act_TE_Total_is=fld_TE_Total_Payments_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	
    	double exp_TE_Total=(act_TE_subTotal+exp_HST_val_in_TE_section)-(exp_BonusBank_in_TE+exp_CreditNotes_in_TE);
    	exp_TE_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_Total));
    	
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE Total value is displayed in Payments page");
    	
    	return exp_TE_Total;
	}
	
	@Override
    public double No_tax_validation_of_TE_section_in_Payments_page_GST() {
		double TE_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double TE_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_subTotal_is=fld_TE_subtotal_Payments_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	String act_GST_in_TE_section=fld_GST_in_TE_section_Payments_page().getText().trim();
    	act_GST_in_TE_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_TE_section);
    	double act_GST_val_in_TE_section=Double.parseDouble(act_GST_in_TE_section);
    	
    	double exp_GST_val_in_TE_section=0;
    	Assert.assertEquals(act_GST_val_in_TE_section, exp_GST_val_in_TE_section, "GST value is displayed in TE section in Payments page");
		
    	String act_BonusBank_in_TE_is=fld_BonusBank_in_TE_Payments_page().getText().trim();
    	act_BonusBank_in_TE_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_BonusBank_in_TE_is);
    	double act_BonusBank_in_TE=Double.parseDouble(act_BonusBank_in_TE_is);
    	
    	double exp_BonusBank_in_TE=TE_BonusBank;
    	Assert.assertEquals(act_BonusBank_in_TE, exp_BonusBank_in_TE, "Incorrect TE Bonus Bank value is displayed in Payments page");
    	
    	String act_CreditNotes_in_TE_is=fld_CreditNotes_in_TE_Payments_page().getText().trim();
    	act_CreditNotes_in_TE_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_CreditNotes_in_TE_is);
    	double act_CreditNotes_in_TE=Double.parseDouble(act_CreditNotes_in_TE_is);
    	
    	double exp_CreditNotes_in_TE=TE_CreditNotes;
    	Assert.assertEquals(act_CreditNotes_in_TE, exp_CreditNotes_in_TE, "Incorrect TE Credit Notes value is displayed in Payments page");
    	
    	String act_TE_Total_is=fld_TE_Total_Payments_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	
    	double exp_TE_Total=(act_TE_subTotal+exp_GST_val_in_TE_section)-(exp_BonusBank_in_TE+exp_CreditNotes_in_TE);
    	exp_TE_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_Total));
    	
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE Total value is displayed in Payments page");
    	
    	return exp_TE_Total;
	}
	
	@Override
    public void teacher_validate_YTO_totals_taxes_OrderTotal_in_Payments_page_GST_PST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_YTO_section_val = teacher_validate_YTO_section_in_Payments_page_GST_PST();
    	double exp_Shipping_section_val = teacher_validate_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST_PST();
    	
    	double exp_Order_Total=exp_YTO_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void teacher_validate_YTO_totals_taxes_OrderTotal_in_Payments_page_GST_QST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_YTO_section_val = teacher_validate_YTO_section_in_Payments_page_GST_QST();
    	double exp_Shipping_section_val = teacher_validate_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST_QST();
    	
    	double exp_Order_Total=exp_YTO_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void teacher_validate_YTO_totals_taxes_OrderTotal_in_Payments_page_HST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_YTO_section_val = teacher_validate_YTO_section_in_Payments_page_HST();
    	double exp_Shipping_section_val = teacher_validate_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_HST();
    	
    	double exp_Order_Total=exp_YTO_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void teacher_validate_YTO_totals_taxes_OrderTotal_in_Payments_page_GST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_YTO_section_val = teacher_validate_YTO_section_in_Payments_page_GST();
    	double exp_Shipping_section_val = teacher_validate_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST();
    	
    	double exp_Order_Total=exp_YTO_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void No_tax_validation_of_YTO_totals_OrderTotal_in_Payments_page_GST_PST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_YTO_section_val = No_tax_validation_of_YTO_section_in_Payments_page_GST_PST();
    	double exp_Shipping_section_val = No_tax_validation_of_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST_PST();
    	
    	double exp_Order_Total=exp_YTO_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void No_tax_validation_of_YTO_totals_OrderTotal_in_Payments_page_GST_QST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_YTO_section_val = No_tax_validation_of_YTO_section_in_Payments_page_GST_QST();
    	double exp_Shipping_section_val = No_tax_validation_of_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST_QST();
    	
    	double exp_Order_Total=exp_YTO_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void No_tax_validation_of_YTO_totals_OrderTotal_in_Payments_page_HST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_YTO_section_val = No_tax_validation_of_YTO_section_in_Payments_page_HST();
    	double exp_Shipping_section_val = No_tax_validation_of_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_HST();
    	
    	double exp_Order_Total=exp_YTO_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void No_tax_validation_of_YTO_totals_OrderTotal_in_Payments_page_GST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_YTO_section_val = No_tax_validation_of_YTO_section_in_Payments_page_GST();
    	double exp_Shipping_section_val = No_tax_validation_of_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST();
    	
    	double exp_Order_Total=exp_YTO_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void teacher_validate_TE_totals_taxes_OrderTotal_in_Payments_page_GST_PST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_TE_section_val = teacher_validate_TE_section_in_Payments_page_GST_PST();
    	double exp_Shipping_section_val = teacher_validate_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST_PST();
    	
    	double exp_Order_Total=exp_TE_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void teacher_validate_TE_totals_taxes_OrderTotal_in_Payments_page_GST_QST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_TE_section_val = teacher_validate_TE_section_in_Payments_page_GST_QST();
    	double exp_Shipping_section_val = teacher_validate_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST_QST();
    	
    	double exp_Order_Total=exp_TE_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void teacher_validate_TE_totals_taxes_OrderTotal_in_Payments_page_HST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_TE_section_val = teacher_validate_TE_section_in_Payments_page_HST();
    	double exp_Shipping_section_val = teacher_validate_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_HST();
    	
    	double exp_Order_Total=exp_TE_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void teacher_validate_TE_totals_taxes_OrderTotal_in_Payments_page_GST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_TE_section_val = teacher_validate_TE_section_in_Payments_page_GST();
    	double exp_Shipping_section_val = teacher_validate_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST();
    	
    	double exp_Order_Total=exp_TE_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void No_tax_validation_of_TE_totals_OrderTotal_in_Payments_page_GST_PST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_TE_section_val = No_tax_validation_of_TE_section_in_Payments_page_GST_PST();
    	double exp_Shipping_section_val = No_tax_validation_of_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST_PST();
    	
    	double exp_Order_Total=exp_TE_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void No_tax_validation_of_TE_totals_OrderTotal_in_Payments_page_GST_QST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_TE_section_val = No_tax_validation_of_TE_section_in_Payments_page_GST_QST();
    	double exp_Shipping_section_val = No_tax_validation_of_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST_QST();
    	
    	double exp_Order_Total=exp_TE_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void No_tax_validation_of_TE_totals_OrderTotal_in_Payments_page_HST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_TE_section_val = No_tax_validation_of_TE_section_in_Payments_page_HST();
    	double exp_Shipping_section_val = No_tax_validation_of_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_HST();
    	
    	double exp_Order_Total=exp_TE_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void No_tax_validation_of_TE_totals_OrderTotal_in_Payments_page_GST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	String act_Order_Total_is=fld_Order_Total_Payments_page().getText().trim();
    	act_Order_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Order_Total_is);
    	double act_Order_Total=Double.parseDouble(act_Order_Total_is);
    	
    	double exp_TE_section_val = No_tax_validation_of_TE_section_in_Payments_page_GST();
    	double exp_Shipping_section_val = No_tax_validation_of_Shipping_Handling_section_without_apply_BBank_CNotes_in_Payments_page_GST();
    	
    	double exp_Order_Total=exp_TE_section_val+exp_Shipping_section_val;
    	exp_Order_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Order_Total));
    	
    	Assert.assertEquals(act_Order_Total, exp_Order_Total, "Incorrect Order Total value is displayed in Payments page");
	}
	
	@Override
    public void verify_SFO_section_displayed_in_Confirm_Submit_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
    	
    	try {
    		section_SFO_header_Confirm_Submit_page().isDisplayed();
    		String act_text=section_SFO_header_Confirm_Submit_page().getText().trim();
    		String exp_text="STUDENT FLYER ORDERS";
    		
    		Assert.assertEquals(act_text, exp_text, "Incorrect SFO header text is displayed in Confirm & Submit page");
		} catch (Exception e) {
			Assert.fail("SFO section is not displayed in Confirm & Submit page");
		}
    }
	
	@Override
    public void verify_item_grouped_by_single_Student_name_SFO_in_Confirm_Submit_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
    	
    	int act_num=Students_section_SFO_Confirm_Submit_page().size();
    	int exp_num=1;
    	Assert.assertEquals(act_num, exp_num, "Items are not grouped by Student name in SFO section in Confirm & Submit page");
    }
	
	@Override
    public void verify_items_grouped_by_multiple_Student_names_SFO_in_Confirm_Submit_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
    	
    	int act_num=Students_section_SFO_Confirm_Submit_page().size();
    	int exp_num=2;
    	Assert.assertEquals(act_num, exp_num, "Items are not grouped by Student name in SFO section in Confirm & Submit page");
    }
	
	@Override
	public void verify_student_name_displays_correctly_in_SFO_section_in_Confirm_Submit_page() {
	    	PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(1000);
	    	
	    	String act_text=student1_Table1_SFO_Confirm_Submit_page().getText().trim();
	    	String exp_text=ConstantUtils.SFO_Student_name1;
	    	Assert.assertEquals(act_text, exp_text, "Incorrect Student name is displayed in Confirm & Submit page");
	}
	
	@Override
	public void verify_student_names_displays_correctly_in_SFO_section_in_Confirm_Submit_page() {
	    	PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(1000);
	    	
	    	String act_text=student1_Table1_SFO_Confirm_Submit_page().getText().trim();
	    	String exp_text=ConstantUtils.SFO_Student_name1;
	    	Assert.assertEquals(act_text, exp_text, "Incorrect Student name is displayed in Table1 SFO section in Confirm & Submit page");
	    	
	    	String act_text2=student2_Table2_SFO_Confirm_Submit_page().getText().trim();
	    	String exp_text2=ConstantUtils.SFO_Student_name2;
	    	Assert.assertEquals(act_text2, exp_text2, "Incorrect Student name is displayed in Table2 SFO section in Confirm & Submit page");
	}
	
	@Override
	public void teacher_clicks_on_SUBMIT_btn_Confirm_Submit_page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		
		btn_SUBMIT_Confirm_Submit_page().click();
	}
	
	@Override
    public double item1_price_in_SFO_section_table1_in_Confirm_Submit_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		
		String value1=item1_price_Table1_SFO_Confirm_Submit_page().getText().trim();
		String ele1=item1_QTY_Table1_SFO_Confirm_Submit_page().getText().trim();
		
		value1 = SFO_page.delete_US_or_Canada_dollar_for_the_value(value1);
		double d1=Double.parseDouble(value1);
		System.out.println("#############>"+d1);
		int a1=Integer.parseInt(ele1);
		System.out.println("%%%%%%%%%%%%>"+a1);
		double item1_price=d1*a1;
		item1_price =Double.parseDouble(new DecimalFormat("##.##").format(item1_price));
		System.out.println("^^^^^^^^^^^^^^^^^"+item1_price);
		
		return item1_price;
    }
	
	@Override
    public double item2_price_in_SFO_section_table1_in_Confirm_Submit_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		
		String value1=item2_price_Table1_SFO_Confirm_Submit_page().getText().trim();
		String ele1=item2_QTY_Table1_SFO_Confirm_Submit_page().getText().trim();
		
		value1 = SFO_page.delete_US_or_Canada_dollar_for_the_value(value1);
		double d1=Double.parseDouble(value1);
		System.out.println("#############>"+d1);
		int a1=Integer.parseInt(ele1);
		System.out.println("%%%%%%%%%%%%>"+a1);
		double item2_price=d1*a1;
		item2_price =Double.parseDouble(new DecimalFormat("##.##").format(item2_price));
		System.out.println("^^^^^^^^^^^^^^^^^"+item2_price);
		
		return item2_price;
    }
	
	@Override
    public double item1_price_in_SFO_section_table2_in_Confirm_Submit_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		
		String value1=item1_price_Table2_SFO_Confirm_Submit_page().getText().trim();
		String ele1=item1_QTY_Table2_SFO_Confirm_Submit_page().getText().trim();
		
		value1 = SFO_page.delete_US_or_Canada_dollar_for_the_value(value1);
		double d1=Double.parseDouble(value1);
		System.out.println("#############>"+d1);
		int a1=Integer.parseInt(ele1);
		System.out.println("%%%%%%%%%%%%>"+a1);
		double item1_price=d1*a1;
		item1_price =Double.parseDouble(new DecimalFormat("##.##").format(item1_price));
		System.out.println("^^^^^^^^^^^^^^^^^"+item1_price);
		
		return item1_price;
    }
	
	public double GST_SFO_Table1_Confirm_Submit_page()
	{
		String Teacher_gst=GST_Table1_SFO_section_Confirm_Submit_page().getText().trim();
		Teacher_gst = SFO_page.delete_US_or_Canada_dollar_for_the_value(Teacher_gst);
		double Teacher_gst_2=Double.parseDouble(Teacher_gst);
		System.out.println("Teacher_GST###########:" + Teacher_gst_2);
		return Teacher_gst_2;
	}
	
	public double PST_SFO_Table1_Confirm_Submit_page()
	{
		String Teacher_PST=PST_Table1_SFO_section_Confirm_Submit_page().getText().trim();
		Teacher_PST = SFO_page.delete_US_or_Canada_dollar_for_the_value(Teacher_PST);
		double Teacher_PST_2=Double.parseDouble(Teacher_PST);
		System.out.println("Teacher_PST###########:" + Teacher_PST_2);
		return Teacher_PST_2;
	}
	
	public double QST_SFO_Table1_Confirm_Submit_page()
	{
		String Teacher_QST=QST_Table1_SFO_section_Confirm_Submit_page().getText().trim();
		Teacher_QST = SFO_page.delete_US_or_Canada_dollar_for_the_value(Teacher_QST);
		double Teacher_QST_2=Double.parseDouble(Teacher_QST);
		System.out.println("Teacher_QST###########:" + Teacher_QST_2);
		return Teacher_QST_2;
	}
	
	public double HST_SFO_Table1_Confirm_Submit_page()
	{
		String Teacher_HST=HST_Table1_SFO_section_Confirm_Submit_page().getText().trim();
		Teacher_HST = SFO_page.delete_US_or_Canada_dollar_for_the_value(Teacher_HST);
		double Teacher_HST_2=Double.parseDouble(Teacher_HST);
		System.out.println("Teacher_HST###########:" + Teacher_HST_2);
		return Teacher_HST_2;
	}
	
	public double GST_SFO_Table2_Confirm_Submit_page()
	{
		String Teacher_gst=GST_Table2_SFO_section_Confirm_Submit_page().getText().trim();
		Teacher_gst = SFO_page.delete_US_or_Canada_dollar_for_the_value(Teacher_gst);
		double Teacher_gst_2=Double.parseDouble(Teacher_gst);
		System.out.println("Teacher_GST###########:" + Teacher_gst_2);
		return Teacher_gst_2;
	}
	
	public double PST_SFO_Table2_Confirm_Submit_page()
	{
		String Teacher_PST=PST_Table2_SFO_section_Confirm_Submit_page().getText().trim();
		Teacher_PST = SFO_page.delete_US_or_Canada_dollar_for_the_value(Teacher_PST);
		double Teacher_PST_2=Double.parseDouble(Teacher_PST);
		System.out.println("Teacher_PST###########:" + Teacher_PST_2);
		return Teacher_PST_2;
	}
	
	public double QST_SFO_Table2_Confirm_Submit_page()
	{
		String Teacher_QST=QST_Table2_SFO_section_Confirm_Submit_page().getText().trim();
		Teacher_QST = SFO_page.delete_US_or_Canada_dollar_for_the_value(Teacher_QST);
		double Teacher_QST_2=Double.parseDouble(Teacher_QST);
		System.out.println("Teacher_QST###########:" + Teacher_QST_2);
		return Teacher_QST_2;
	}
	
	public double HST_SFO_Table2_Confirm_Submit_page()
	{
		String Teacher_HST=HST_Table2_SFO_section_Confirm_Submit_page().getText().trim();
		Teacher_HST = SFO_page.delete_US_or_Canada_dollar_for_the_value(Teacher_HST);
		double Teacher_HST_2=Double.parseDouble(Teacher_HST);
		System.out.println("Teacher_HST###########:" + Teacher_HST_2);
		return Teacher_HST_2;
	}
	
	@Override
    public double validation_of_SFO_section_Table1_single_item_single_student_in_Confirm_Submit_page_GST_PST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_SFO_section_table1_in_Confirm_Submit_page();
    	double exp_SFO_table1_subTotal=item1_price;
    	String act_SFO_table1_subTotal_is=Student1_subtotal_Table1_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_subTotal_is);
    	double act_SFO_table1_subTotal=Double.parseDouble(act_SFO_table1_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table1_subTotal, exp_SFO_table1_subTotal, "Incorrect Student subtotal value is displayed in Table1 Confirm & Submit page");
    	
    	double act_GST_SFO_Table1=GST_SFO_Table1_Confirm_Submit_page();
    	double act_PST_SFO_Table1=PST_SFO_Table1_Confirm_Submit_page();
    	
    	double exp_GST_SFO_Table1=(double)(exp_SFO_table1_subTotal * stateTaxGST) / 100;
    	exp_GST_SFO_Table1 =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_SFO_Table1));
    	
    	Assert.assertEquals(act_GST_SFO_Table1, exp_GST_SFO_Table1, "Incorrect GST value is displayed in SFO Table1 Confirm & Submit page");
    	
    	double exp_PST_SFO_Table1=(double)(exp_SFO_table1_subTotal * stateTaxPST) / 100;
    	exp_PST_SFO_Table1 =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_SFO_Table1));
    	
    	Assert.assertEquals(act_PST_SFO_Table1, exp_PST_SFO_Table1, "Incorrect PST value is displayed in SFO Table1 Confirm & Submit page");
    	
    	String act_SFO_table1_total_is=Student1_Total_Table1_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_total_is);
    	double act_SFO_table1_total=Double.parseDouble(act_SFO_table1_total_is);
    	
    	double exp_SFO_table1_total=exp_SFO_table1_subTotal+exp_GST_SFO_Table1+exp_PST_SFO_Table1;
    	exp_SFO_table1_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table1_total));
    	
    	Assert.assertEquals(act_SFO_table1_total, exp_SFO_table1_total, "Incorrect SFO Table1 Total value is displayed in Confirm & Submit page");
    	
    	String act_CreditNotes_in_SFO_is=CreditNotes_SFO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_SFO=Double.parseDouble(act_CreditNotes_in_SFO_is);
    	
    	exp_SFO_table1_total=exp_SFO_table1_total-act_CreditNotes_in_SFO;
    	exp_SFO_table1_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table1_total));
    	
    	String act_SFO_table1_Total_is=SFO_Total_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_Total_is);
    	double act_SFO_table1_Total=Double.parseDouble(act_SFO_table1_Total_is);
    	
    	Assert.assertEquals(act_SFO_table1_Total, exp_SFO_table1_total, "Incorrect SFO Total value is displayed in Confirm & Submit page");
    	
    	return exp_SFO_table1_total;
	}
	
	@Override
    public double validation_of_SFO_section_Table1_multiple_items_single_student_in_Confirm_Submit_page_GST_PST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_SFO_section_table1_in_Confirm_Submit_page();
    	double item2_price=item2_price_in_SFO_section_table1_in_Confirm_Submit_page();
    	double exp_SFO_table1_subTotal=item1_price+item2_price;
    	
    	String act_SFO_table1_subTotal_is=Student1_subtotal_Table1_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_subTotal_is);
    	double act_SFO_table1_subTotal=Double.parseDouble(act_SFO_table1_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table1_subTotal, exp_SFO_table1_subTotal, "Incorrect Student subtotal value is displayed in Table1 Confirm & Submit page");
    	
    	double act_GST_SFO_Table1=GST_SFO_Table1_Confirm_Submit_page();
    	double act_PST_SFO_Table1=PST_SFO_Table1_Confirm_Submit_page();
    	
    	double exp_GST_SFO_Table1=(double)(exp_SFO_table1_subTotal * stateTaxGST) / 100;
    	exp_GST_SFO_Table1 =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_SFO_Table1));
    	
    	Assert.assertEquals(act_GST_SFO_Table1, exp_GST_SFO_Table1, "Incorrect GST value is displayed in SFO Table1 Confirm & Submit page");
    	
    	double exp_PST_SFO_Table1=(double)(exp_SFO_table1_subTotal * stateTaxPST) / 100;
    	exp_PST_SFO_Table1 =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_SFO_Table1));
    	
    	Assert.assertEquals(act_PST_SFO_Table1, exp_PST_SFO_Table1, "Incorrect PST value is displayed in SFO Table1 Confirm & Submit page");
    	
    	String act_SFO_table1_total_is=Student1_Total_Table1_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_total_is);
    	double act_SFO_table1_total=Double.parseDouble(act_SFO_table1_total_is);
    	
    	double exp_SFO_table1_total=exp_SFO_table1_subTotal+exp_GST_SFO_Table1+exp_PST_SFO_Table1;
    	exp_SFO_table1_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table1_total));
    	
    	Assert.assertEquals(act_SFO_table1_total, exp_SFO_table1_total, "Incorrect SFO Table1 Total value is displayed in Confirm & Submit page");
    	
    	String act_CreditNotes_in_SFO_is=CreditNotes_SFO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_SFO=Double.parseDouble(act_CreditNotes_in_SFO_is);
    	
    	exp_SFO_table1_total=exp_SFO_table1_total-act_CreditNotes_in_SFO;
    	exp_SFO_table1_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table1_total));
    	
    	String act_SFO_table1_Total_is=SFO_Total_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_Total_is);
    	double act_SFO_table1_Total=Double.parseDouble(act_SFO_table1_Total_is);
    	
    	Assert.assertEquals(act_SFO_table1_Total, exp_SFO_table1_total, "Incorrect SFO Total value is displayed in Confirm & Submit page");
    	
    	return exp_SFO_table1_total;
	}
	
	@Override
    public double teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_PST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");
    	
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	Double exp_Shipping_Handling_Value=null;
    	String act_Shipping_Handling_Value_is=Shipping_value_BlueBar_Confirm_Submit_page().getText().trim();
    	
    	if (act_Shipping_Handling_Value_is.equals("FREE!")) {
    		exp_Shipping_Handling_Value=(double) 0;
		} else {
			act_Shipping_Handling_Value_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Handling_Value_is);
	    	double act_Shipping_Handling_Value=Double.parseDouble(act_Shipping_Handling_Value_is);
	    	
	    	String act_Shipping_subTotal_is=Shipping_Subtotal_Confirm_Submit_page().getText().trim();
	    	act_Shipping_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_subTotal_is);
	    	double act_Shipping_subTotal=Double.parseDouble(act_Shipping_subTotal_is);
	    	
	    	String act_GST_in_Shipping_section=GST_Shipping_section_Confirm_Submit_page().getText().trim();
	    	act_GST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_Shipping_section);
	    	double act_GST_val_in_Shipping_section=Double.parseDouble(act_GST_in_Shipping_section);
	    	
	    	String act_PST_in_Shipping_section=PST_Shipping_section_Confirm_Submit_page().getText().trim();
	    	act_PST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_PST_in_Shipping_section);
	    	double act_PST_val_in_Shipping_section=Double.parseDouble(act_PST_in_Shipping_section);
	    	
	    	double exp_GST_val_in_Shipping_section=(double)(act_Shipping_subTotal * stateTaxGST) / 100;
	    	exp_GST_val_in_Shipping_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_Shipping_section));
	    	
	    	Assert.assertEquals(act_GST_val_in_Shipping_section, exp_GST_val_in_Shipping_section, "Incorrect GST value is displayed in Shipping section in Confirm & Submit page");
			
	    	
	    	double exp_PST_val_in_Shipping_section=(double)(act_Shipping_subTotal * stateTaxPST) / 100;
	    	exp_PST_val_in_Shipping_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_val_in_Shipping_section));
	    	
	    	Assert.assertEquals(act_PST_val_in_Shipping_section, exp_PST_val_in_Shipping_section, "Incorrect PST value is displayed in Shipping section in Confirm & Submit page");
			
	    	String act_BonusBank_in_Shipping_is=BonusBank_Shipping_section_Confirm_Submit_page().getAttribute("value").trim();
	    	double act_BonusBank_in_Shipping=Double.parseDouble(act_BonusBank_in_Shipping_is);
	    	
	    	String act_CreditNotes_in_Shipping_is=CreditNotes_Shipping_section_Confirm_Submit_page().getAttribute("value").trim();
	    	double act_CreditNotes_in_Shipping=Double.parseDouble(act_CreditNotes_in_Shipping_is);
	    	
	    	
	    	exp_Shipping_Handling_Value = (act_Shipping_subTotal+exp_GST_val_in_Shipping_section+exp_PST_val_in_Shipping_section)-(act_BonusBank_in_Shipping+act_CreditNotes_in_Shipping);
	    	exp_Shipping_Handling_Value =Double.parseDouble(new DecimalFormat("##.##").format(exp_Shipping_Handling_Value));
	    	
	    	Assert.assertEquals(act_Shipping_Handling_Value, exp_Shipping_Handling_Value, "Incorrect Shipping & Handling Total value is displayed in Confirm & Submit page");
		}
    	
    	return exp_Shipping_Handling_Value;
		
	}
	
	@Override
    public double teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_QST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxQST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxQST");
    	
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	Double exp_Shipping_Handling_Value=null;
    	String act_Shipping_Handling_Value_is=Shipping_value_BlueBar_Confirm_Submit_page().getText().trim();
    	
    	if (act_Shipping_Handling_Value_is.equals("FREE!")) {
    		exp_Shipping_Handling_Value=(double) 0;
		} else {
			act_Shipping_Handling_Value_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Handling_Value_is);
	    	double act_Shipping_Handling_Value=Double.parseDouble(act_Shipping_Handling_Value_is);
	    	
	    	String act_Shipping_subTotal_is=Shipping_Subtotal_Confirm_Submit_page().getText().trim();
	    	act_Shipping_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_subTotal_is);
	    	double act_Shipping_subTotal=Double.parseDouble(act_Shipping_subTotal_is);
	    	
	    	String act_GST_in_Shipping_section=GST_Shipping_section_Confirm_Submit_page().getText().trim();
	    	act_GST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_Shipping_section);
	    	double act_GST_val_in_Shipping_section=Double.parseDouble(act_GST_in_Shipping_section);
	    	
	    	String act_QST_in_Shipping_section=QST_Shipping_section_Confirm_Submit_page().getText().trim();
	    	act_QST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_QST_in_Shipping_section);
	    	double act_QST_val_in_Shipping_section=Double.parseDouble(act_QST_in_Shipping_section);
	    	
	    	double exp_GST_val_in_Shipping_section=(double)(act_Shipping_subTotal * stateTaxGST) / 100;
	    	exp_GST_val_in_Shipping_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_Shipping_section));
	    	
	    	Assert.assertEquals(act_GST_val_in_Shipping_section, exp_GST_val_in_Shipping_section, "Incorrect GST value is displayed in Shipping section in Confirm & Submit page");
			
	    	
	    	double exp_QST_val_in_Shipping_section=(double)(act_Shipping_subTotal * stateTaxQST) / 100;
	    	exp_QST_val_in_Shipping_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_QST_val_in_Shipping_section));
	    	
	    	Assert.assertEquals(act_QST_val_in_Shipping_section, exp_QST_val_in_Shipping_section, "Incorrect QST value is displayed in Shipping section in Confirm & Submit page");
			
	    	String act_BonusBank_in_Shipping_is=BonusBank_Shipping_section_Confirm_Submit_page().getAttribute("value").trim();
	    	double act_BonusBank_in_Shipping=Double.parseDouble(act_BonusBank_in_Shipping_is);
	    	
	    	String act_CreditNotes_in_Shipping_is=CreditNotes_Shipping_section_Confirm_Submit_page().getAttribute("value").trim();
	    	double act_CreditNotes_in_Shipping=Double.parseDouble(act_CreditNotes_in_Shipping_is);
	    	
	    	
	    	exp_Shipping_Handling_Value = (act_Shipping_subTotal+exp_GST_val_in_Shipping_section+exp_QST_val_in_Shipping_section)-(act_BonusBank_in_Shipping+act_CreditNotes_in_Shipping);
	    	exp_Shipping_Handling_Value =Double.parseDouble(new DecimalFormat("##.##").format(exp_Shipping_Handling_Value));
	    	
	    	Assert.assertEquals(act_Shipping_Handling_Value, exp_Shipping_Handling_Value, "Incorrect Shipping & Handling Total value is displayed in Confirm & Submit page");
		}
    	
    	return exp_Shipping_Handling_Value;
		
	}
	
	@Override
    public double teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_HST() {
		double stateTaxHST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxHST");
    	
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	Double exp_Shipping_Handling_Value=null;
    	String act_Shipping_Handling_Value_is=Shipping_value_BlueBar_Confirm_Submit_page().getText().trim();
    	
    	if (act_Shipping_Handling_Value_is.equals("FREE!")) {
    		exp_Shipping_Handling_Value=(double) 0;
		} else {
			act_Shipping_Handling_Value_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Handling_Value_is);
	    	double act_Shipping_Handling_Value=Double.parseDouble(act_Shipping_Handling_Value_is);
	    	
	    	String act_Shipping_subTotal_is=Shipping_Subtotal_Confirm_Submit_page().getText().trim();
	    	act_Shipping_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_subTotal_is);
	    	double act_Shipping_subTotal=Double.parseDouble(act_Shipping_subTotal_is);
	    	
	    	String act_HST_in_Shipping_section=HST_Shipping_section_Confirm_Submit_page().getText().trim();
	    	act_HST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_HST_in_Shipping_section);
	    	double act_HST_val_in_Shipping_section=Double.parseDouble(act_HST_in_Shipping_section);
	    	
	    	double exp_HST_val_in_Shipping_section=(double)(act_Shipping_subTotal * stateTaxHST) / 100;
	    	exp_HST_val_in_Shipping_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_HST_val_in_Shipping_section));
	    	
	    	Assert.assertEquals(act_HST_val_in_Shipping_section, exp_HST_val_in_Shipping_section, "Incorrect HST value is displayed in Shipping section in Confirm & Submit page");
			
	    	String act_BonusBank_in_Shipping_is=BonusBank_Shipping_section_Confirm_Submit_page().getAttribute("value").trim();
	    	double act_BonusBank_in_Shipping=Double.parseDouble(act_BonusBank_in_Shipping_is);
	    	
	    	String act_CreditNotes_in_Shipping_is=CreditNotes_Shipping_section_Confirm_Submit_page().getAttribute("value").trim();
	    	double act_CreditNotes_in_Shipping=Double.parseDouble(act_CreditNotes_in_Shipping_is);
	    	
	    	
	    	exp_Shipping_Handling_Value = (act_Shipping_subTotal+exp_HST_val_in_Shipping_section)-(act_BonusBank_in_Shipping+act_CreditNotes_in_Shipping);
	    	exp_Shipping_Handling_Value =Double.parseDouble(new DecimalFormat("##.##").format(exp_Shipping_Handling_Value));
	    	
	    	Assert.assertEquals(act_Shipping_Handling_Value, exp_Shipping_Handling_Value, "Incorrect Shipping & Handling Total value is displayed in Confirm & Submit page");
		}
    	
    	return exp_Shipping_Handling_Value;
		
	}
	
	@Override
    public double teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST() {
		double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	Double exp_Shipping_Handling_Value=null;
    	String act_Shipping_Handling_Value_is=Shipping_value_BlueBar_Confirm_Submit_page().getText().trim();
    	
    	if (act_Shipping_Handling_Value_is.equals("FREE!")) {
    		exp_Shipping_Handling_Value=(double) 0;
		} else {
			act_Shipping_Handling_Value_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Handling_Value_is);
	    	double act_Shipping_Handling_Value=Double.parseDouble(act_Shipping_Handling_Value_is);
	    	
	    	String act_Shipping_subTotal_is=Shipping_Subtotal_Confirm_Submit_page().getText().trim();
	    	act_Shipping_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_subTotal_is);
	    	double act_Shipping_subTotal=Double.parseDouble(act_Shipping_subTotal_is);
	    	
	    	String act_GST_in_Shipping_section=GST_Shipping_section_Confirm_Submit_page().getText().trim();
	    	act_GST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_Shipping_section);
	    	double act_GST_val_in_Shipping_section=Double.parseDouble(act_GST_in_Shipping_section);
	    	
	    	double exp_GST_val_in_Shipping_section=(double)(act_Shipping_subTotal * stateTaxGST) / 100;
	    	exp_GST_val_in_Shipping_section =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_val_in_Shipping_section));
	    	
	    	Assert.assertEquals(act_GST_val_in_Shipping_section, exp_GST_val_in_Shipping_section, "Incorrect GST value is displayed in Shipping section in Confirm & Submit page");
			
	    	String act_BonusBank_in_Shipping_is=BonusBank_Shipping_section_Confirm_Submit_page().getAttribute("value").trim();
	    	double act_BonusBank_in_Shipping=Double.parseDouble(act_BonusBank_in_Shipping_is);
	    	
	    	String act_CreditNotes_in_Shipping_is=CreditNotes_Shipping_section_Confirm_Submit_page().getAttribute("value").trim();
	    	double act_CreditNotes_in_Shipping=Double.parseDouble(act_CreditNotes_in_Shipping_is);
	    	
	    	
	    	exp_Shipping_Handling_Value = (act_Shipping_subTotal+exp_GST_val_in_Shipping_section)-(act_BonusBank_in_Shipping+act_CreditNotes_in_Shipping);
	    	exp_Shipping_Handling_Value =Double.parseDouble(new DecimalFormat("##.##").format(exp_Shipping_Handling_Value));
	    	
	    	Assert.assertEquals(act_Shipping_Handling_Value, exp_Shipping_Handling_Value, "Incorrect Shipping & Handling Total value is displayed in Confirm & Submit page");
		}
    	
    	return exp_Shipping_Handling_Value;
		
	}
	
	@Override
    public double No_tax_validation_for_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_PST() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	Double exp_Shipping_Handling_Value=null;
    	String act_Shipping_Handling_Value_is=Shipping_value_BlueBar_Confirm_Submit_page().getText().trim();
    	
    	if (act_Shipping_Handling_Value_is.equals("FREE!")) {
    		exp_Shipping_Handling_Value=(double) 0;
		} else {
			act_Shipping_Handling_Value_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Handling_Value_is);
	    	double act_Shipping_Handling_Value=Double.parseDouble(act_Shipping_Handling_Value_is);
	    	
	    	String act_Shipping_subTotal_is=Shipping_Subtotal_Confirm_Submit_page().getText().trim();
	    	act_Shipping_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_subTotal_is);
	    	double act_Shipping_subTotal=Double.parseDouble(act_Shipping_subTotal_is);
	    	
	    	String act_GST_in_Shipping_section=GST_Shipping_section_Confirm_Submit_page().getText().trim();
	    	act_GST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_Shipping_section);
	    	double act_GST_val_in_Shipping_section=Double.parseDouble(act_GST_in_Shipping_section);
	    	
	    	String act_PST_in_Shipping_section=PST_Shipping_section_Confirm_Submit_page().getText().trim();
	    	act_PST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_PST_in_Shipping_section);
	    	double act_PST_val_in_Shipping_section=Double.parseDouble(act_PST_in_Shipping_section);
	    	
	    	double exp_GST_val_in_Shipping_section=0;
	    	Assert.assertEquals(act_GST_val_in_Shipping_section, exp_GST_val_in_Shipping_section, "GST value is displayed in Shipping section in Confirm & Submit page");
			
	    	
	    	double exp_PST_val_in_Shipping_section=0;
	    	Assert.assertEquals(act_PST_val_in_Shipping_section, exp_PST_val_in_Shipping_section, "PST value is displayed in Shipping section in Confirm & Submit page");
			
	    	String act_BonusBank_in_Shipping_is=BonusBank_Shipping_section_Confirm_Submit_page().getAttribute("value").trim();
	    	double act_BonusBank_in_Shipping=Double.parseDouble(act_BonusBank_in_Shipping_is);
	    	
	    	String act_CreditNotes_in_Shipping_is=CreditNotes_Shipping_section_Confirm_Submit_page().getAttribute("value").trim();
	    	double act_CreditNotes_in_Shipping=Double.parseDouble(act_CreditNotes_in_Shipping_is);
	    	
	    	
	    	exp_Shipping_Handling_Value = (act_Shipping_subTotal+exp_GST_val_in_Shipping_section+exp_PST_val_in_Shipping_section)-(act_BonusBank_in_Shipping+act_CreditNotes_in_Shipping);
	    	exp_Shipping_Handling_Value =Double.parseDouble(new DecimalFormat("##.##").format(exp_Shipping_Handling_Value));
	    	
	    	Assert.assertEquals(act_Shipping_Handling_Value, exp_Shipping_Handling_Value, "Incorrect Shipping & Handling Total value is displayed in Confirm & Submit page");
		}
    	
    	return exp_Shipping_Handling_Value;
		
	}
	
	@Override
    public double No_tax_validation_for_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_QST() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	Double exp_Shipping_Handling_Value=null;
    	String act_Shipping_Handling_Value_is=Shipping_value_BlueBar_Confirm_Submit_page().getText().trim();
    	
    	if (act_Shipping_Handling_Value_is.equals("FREE!")) {
    		exp_Shipping_Handling_Value=(double) 0;
		} else {
			act_Shipping_Handling_Value_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Handling_Value_is);
	    	double act_Shipping_Handling_Value=Double.parseDouble(act_Shipping_Handling_Value_is);
	    	
	    	String act_Shipping_subTotal_is=Shipping_Subtotal_Confirm_Submit_page().getText().trim();
	    	act_Shipping_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_subTotal_is);
	    	double act_Shipping_subTotal=Double.parseDouble(act_Shipping_subTotal_is);
	    	
	    	String act_GST_in_Shipping_section=GST_Shipping_section_Confirm_Submit_page().getText().trim();
	    	act_GST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_Shipping_section);
	    	double act_GST_val_in_Shipping_section=Double.parseDouble(act_GST_in_Shipping_section);
	    	
	    	String act_QST_in_Shipping_section=QST_Shipping_section_Confirm_Submit_page().getText().trim();
	    	act_QST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_QST_in_Shipping_section);
	    	double act_QST_val_in_Shipping_section=Double.parseDouble(act_QST_in_Shipping_section);
	    	
	    	double exp_GST_val_in_Shipping_section=0;
	    	Assert.assertEquals(act_GST_val_in_Shipping_section, exp_GST_val_in_Shipping_section, "GST value is displayed in Shipping section in Confirm & Submit page");
			
	    	
	    	double exp_QST_val_in_Shipping_section=0;
	    	Assert.assertEquals(act_QST_val_in_Shipping_section, exp_QST_val_in_Shipping_section, "QST value is displayed in Shipping section in Confirm & Submit page");
			
	    	String act_BonusBank_in_Shipping_is=BonusBank_Shipping_section_Confirm_Submit_page().getAttribute("value").trim();
	    	double act_BonusBank_in_Shipping=Double.parseDouble(act_BonusBank_in_Shipping_is);
	    	
	    	String act_CreditNotes_in_Shipping_is=CreditNotes_Shipping_section_Confirm_Submit_page().getAttribute("value").trim();
	    	double act_CreditNotes_in_Shipping=Double.parseDouble(act_CreditNotes_in_Shipping_is);
	    	
	    	
	    	exp_Shipping_Handling_Value = (act_Shipping_subTotal+exp_GST_val_in_Shipping_section+exp_QST_val_in_Shipping_section)-(act_BonusBank_in_Shipping+act_CreditNotes_in_Shipping);
	    	exp_Shipping_Handling_Value =Double.parseDouble(new DecimalFormat("##.##").format(exp_Shipping_Handling_Value));
	    	
	    	Assert.assertEquals(act_Shipping_Handling_Value, exp_Shipping_Handling_Value, "Incorrect Shipping & Handling Total value is displayed in Confirm & Submit page");
		}
    	
    	return exp_Shipping_Handling_Value;
		
	}
	
	@Override
    public double No_tax_validation_for_Shipping_Handling_section_in_Confirm_and_Submit_page_HST() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	Double exp_Shipping_Handling_Value=null;
    	String act_Shipping_Handling_Value_is=Shipping_value_BlueBar_Confirm_Submit_page().getText().trim();
    	
    	if (act_Shipping_Handling_Value_is.equals("FREE!")) {
    		exp_Shipping_Handling_Value=(double) 0;
		} else {
			act_Shipping_Handling_Value_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Handling_Value_is);
	    	double act_Shipping_Handling_Value=Double.parseDouble(act_Shipping_Handling_Value_is);
	    	
	    	String act_Shipping_subTotal_is=Shipping_Subtotal_Confirm_Submit_page().getText().trim();
	    	act_Shipping_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_subTotal_is);
	    	double act_Shipping_subTotal=Double.parseDouble(act_Shipping_subTotal_is);
	    	
	    	String act_HST_in_Shipping_section=HST_Shipping_section_Confirm_Submit_page().getText().trim();
	    	act_HST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_HST_in_Shipping_section);
	    	double act_HST_val_in_Shipping_section=Double.parseDouble(act_HST_in_Shipping_section);
	    	
	    	double exp_HST_val_in_Shipping_section=0;
	    	Assert.assertEquals(act_HST_val_in_Shipping_section, exp_HST_val_in_Shipping_section, "HST value is displayed in Shipping section in Confirm & Submit page");
			
	    	String act_BonusBank_in_Shipping_is=BonusBank_Shipping_section_Confirm_Submit_page().getAttribute("value").trim();
	    	double act_BonusBank_in_Shipping=Double.parseDouble(act_BonusBank_in_Shipping_is);
	    	
	    	String act_CreditNotes_in_Shipping_is=CreditNotes_Shipping_section_Confirm_Submit_page().getAttribute("value").trim();
	    	double act_CreditNotes_in_Shipping=Double.parseDouble(act_CreditNotes_in_Shipping_is);
	    	
	    	
	    	exp_Shipping_Handling_Value = (act_Shipping_subTotal+exp_HST_val_in_Shipping_section)-(act_BonusBank_in_Shipping+act_CreditNotes_in_Shipping);
	    	exp_Shipping_Handling_Value =Double.parseDouble(new DecimalFormat("##.##").format(exp_Shipping_Handling_Value));
	    	
	    	Assert.assertEquals(act_Shipping_Handling_Value, exp_Shipping_Handling_Value, "Incorrect Shipping & Handling Total value is displayed in Confirm & Submit page");
		}
    	
    	return exp_Shipping_Handling_Value;
		
	}
	
	@Override
    public double No_tax_validation_for_Shipping_Handling_section_in_Confirm_and_Submit_page_GST() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	Double exp_Shipping_Handling_Value=null;
    	String act_Shipping_Handling_Value_is=Shipping_value_BlueBar_Confirm_Submit_page().getText().trim();
    	
    	if (act_Shipping_Handling_Value_is.equals("FREE!")) {
    		exp_Shipping_Handling_Value=(double) 0;
		} else {
			act_Shipping_Handling_Value_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Handling_Value_is);
	    	double act_Shipping_Handling_Value=Double.parseDouble(act_Shipping_Handling_Value_is);
	    	
	    	String act_Shipping_subTotal_is=Shipping_Subtotal_Confirm_Submit_page().getText().trim();
	    	act_Shipping_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_subTotal_is);
	    	double act_Shipping_subTotal=Double.parseDouble(act_Shipping_subTotal_is);
	    	
	    	String act_GST_in_Shipping_section=GST_Shipping_section_Confirm_Submit_page().getText().trim();
	    	act_GST_in_Shipping_section=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_GST_in_Shipping_section);
	    	double act_GST_val_in_Shipping_section=Double.parseDouble(act_GST_in_Shipping_section);
	    	
	    	double exp_GST_val_in_Shipping_section=0;
	    	Assert.assertEquals(act_GST_val_in_Shipping_section, exp_GST_val_in_Shipping_section, "GST value is displayed in Shipping section in Confirm & Submit page");
			
	    	String act_BonusBank_in_Shipping_is=BonusBank_Shipping_section_Confirm_Submit_page().getAttribute("value").trim();
	    	double act_BonusBank_in_Shipping=Double.parseDouble(act_BonusBank_in_Shipping_is);
	    	
	    	String act_CreditNotes_in_Shipping_is=CreditNotes_Shipping_section_Confirm_Submit_page().getAttribute("value").trim();
	    	double act_CreditNotes_in_Shipping=Double.parseDouble(act_CreditNotes_in_Shipping_is);
	    	
	    	
	    	exp_Shipping_Handling_Value = (act_Shipping_subTotal+exp_GST_val_in_Shipping_section)-(act_BonusBank_in_Shipping+act_CreditNotes_in_Shipping);
	    	exp_Shipping_Handling_Value =Double.parseDouble(new DecimalFormat("##.##").format(exp_Shipping_Handling_Value));
	    	
	    	Assert.assertEquals(act_Shipping_Handling_Value, exp_Shipping_Handling_Value, "Incorrect Shipping & Handling Total value is displayed in Confirm & Submit page");
		}
    	
    	return exp_Shipping_Handling_Value;
		
	}
	
	@Override
    public double validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_GST_PST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_SFO_section_table1_in_Confirm_Submit_page();
    	double exp_SFO_table1_subTotal=item1_price;
    	String act_SFO_table1_subTotal_is=Student1_subtotal_Table1_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_subTotal_is);
    	double act_SFO_table1_subTotal=Double.parseDouble(act_SFO_table1_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table1_subTotal, exp_SFO_table1_subTotal, "Incorrect Student subtotal value is displayed in Table1 Confirm & Submit page");
    	
    	double act_GST_SFO_Table1=GST_SFO_Table1_Confirm_Submit_page();
    	double act_PST_SFO_Table1=PST_SFO_Table1_Confirm_Submit_page();
    	
    	double exp_GST_SFO_Table1=(double)(exp_SFO_table1_subTotal * stateTaxGST) / 100;
    	exp_GST_SFO_Table1 =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_SFO_Table1));
    	
    	Assert.assertEquals(act_GST_SFO_Table1, exp_GST_SFO_Table1, "Incorrect GST value is displayed in SFO Table1 Confirm & Submit page");
    	
    	double exp_PST_SFO_Table1=(double)(exp_SFO_table1_subTotal * stateTaxPST) / 100;
    	exp_PST_SFO_Table1 =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_SFO_Table1));
    	
    	Assert.assertEquals(act_PST_SFO_Table1, exp_PST_SFO_Table1, "Incorrect PST value is displayed in SFO Table1 Confirm & Submit page");
    	
    	String act_SFO_table1_total_is=Student1_Total_Table1_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_total_is);
    	double act_SFO_table1_total=Double.parseDouble(act_SFO_table1_total_is);
    	
    	double exp_SFO_table1_total=exp_SFO_table1_subTotal+exp_GST_SFO_Table1+exp_PST_SFO_Table1;
    	exp_SFO_table1_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table1_total));
    	
    	Assert.assertEquals(act_SFO_table1_total, exp_SFO_table1_total, "Incorrect SFO Table1 Total value is displayed in Confirm & Submit page");
    	
    	/////////////////////////////////////////////
    	
    	double item_1_price=item1_price_in_SFO_section_table2_in_Confirm_Submit_page();
    	double exp_SFO_table2_subTotal=item_1_price;
    	String act_SFO_table2_subTotal_is=Student1_subtotal_Table2_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table2_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table2_subTotal_is);
    	double act_SFO_table2_subTotal=Double.parseDouble(act_SFO_table2_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table2_subTotal, exp_SFO_table2_subTotal, "Incorrect Student subtotal value is displayed in Table2 Confirm & Submit page");
    	
    	double act_GST_SFO_Table2=GST_SFO_Table2_Confirm_Submit_page();
    	double act_PST_SFO_Table2=PST_SFO_Table2_Confirm_Submit_page();
    	
    	double exp_GST_SFO_Table2=(double)(exp_SFO_table2_subTotal * stateTaxGST) / 100;
    	exp_GST_SFO_Table2 =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_SFO_Table2));
    	
    	Assert.assertEquals(act_GST_SFO_Table2, exp_GST_SFO_Table2, "Incorrect GST value is displayed in SFO Table2 Confirm & Submit page");
    	
    	double exp_PST_SFO_Table2=(double)(exp_SFO_table2_subTotal * stateTaxPST) / 100;
    	exp_PST_SFO_Table2 =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_SFO_Table2));
    	
    	Assert.assertEquals(act_PST_SFO_Table2, exp_PST_SFO_Table2, "Incorrect PST value is displayed in SFO Table2 Confirm & Submit page");
    	
    	String act_SFO_table2_total_is=Student1_Total_Table2_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table2_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table2_total_is);
    	double act_SFO_table2_total=Double.parseDouble(act_SFO_table2_total_is);
    	
    	double exp_SFO_table2_total=exp_SFO_table2_subTotal+exp_GST_SFO_Table2+exp_PST_SFO_Table2;
    	exp_SFO_table2_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table2_total));
    	
    	Assert.assertEquals(act_SFO_table2_total, exp_SFO_table2_total, "Incorrect SFO Table2 Total value is displayed in Confirm & Submit page");
    	
    	String act_CreditNotes_in_SFO_is=CreditNotes_SFO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_SFO=Double.parseDouble(act_CreditNotes_in_SFO_is);
    	
    	double exp_SFO_total=(exp_SFO_table1_total + exp_SFO_table2_total) - act_CreditNotes_in_SFO;
    	exp_SFO_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_total));
    	
    	String act_SFO_Total_is=SFO_Total_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_total, "Incorrect SFO Total value is displayed in Confirm & Submit page");
    	
    	return exp_SFO_total;
    }
	
	@Override
    public double validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_GST_QST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxQST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxQST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_SFO_section_table1_in_Confirm_Submit_page();
    	double exp_SFO_table1_subTotal=item1_price;
    	String act_SFO_table1_subTotal_is=Student1_subtotal_Table1_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_subTotal_is);
    	double act_SFO_table1_subTotal=Double.parseDouble(act_SFO_table1_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table1_subTotal, exp_SFO_table1_subTotal, "Incorrect Student subtotal value is displayed in Table1 Confirm & Submit page");
    	
    	double act_GST_SFO_Table1=GST_SFO_Table1_Confirm_Submit_page();
    	double act_QST_SFO_Table1=QST_SFO_Table1_Confirm_Submit_page();
    	
    	double exp_GST_SFO_Table1=(double)(exp_SFO_table1_subTotal * stateTaxGST) / 100;
    	exp_GST_SFO_Table1 =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_SFO_Table1));
    	
    	Assert.assertEquals(act_GST_SFO_Table1, exp_GST_SFO_Table1, "Incorrect GST value is displayed in SFO Table1 Confirm & Submit page");
    	
    	double exp_QST_SFO_Table1=(double)(exp_SFO_table1_subTotal * stateTaxQST) / 100;
    	exp_QST_SFO_Table1 =Double.parseDouble(new DecimalFormat("##.##").format(exp_QST_SFO_Table1));
    	
    	Assert.assertEquals(act_QST_SFO_Table1, exp_QST_SFO_Table1, "Incorrect QST value is displayed in SFO Table1 Confirm & Submit page");
    	
    	String act_SFO_table1_total_is=Student1_Total_Table1_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_total_is);
    	double act_SFO_table1_total=Double.parseDouble(act_SFO_table1_total_is);
    	
    	double exp_SFO_table1_total=exp_SFO_table1_subTotal+exp_GST_SFO_Table1+exp_QST_SFO_Table1;
    	exp_SFO_table1_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table1_total));
    	
    	Assert.assertEquals(act_SFO_table1_total, exp_SFO_table1_total, "Incorrect SFO Table1 Total value is displayed in Confirm & Submit page");
    	
    	/////////////////////////////////////////////
    	
    	double item_1_price=item1_price_in_SFO_section_table2_in_Confirm_Submit_page();
    	double exp_SFO_table2_subTotal=item_1_price;
    	String act_SFO_table2_subTotal_is=Student1_subtotal_Table2_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table2_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table2_subTotal_is);
    	double act_SFO_table2_subTotal=Double.parseDouble(act_SFO_table2_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table2_subTotal, exp_SFO_table2_subTotal, "Incorrect Student subtotal value is displayed in Table2 Confirm & Submit page");
    	
    	double act_GST_SFO_Table2=GST_SFO_Table2_Confirm_Submit_page();
    	double act_QST_SFO_Table2=QST_SFO_Table2_Confirm_Submit_page();
    	
    	double exp_GST_SFO_Table2=(double)(exp_SFO_table2_subTotal * stateTaxGST) / 100;
    	exp_GST_SFO_Table2 =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_SFO_Table2));
    	
    	Assert.assertEquals(act_GST_SFO_Table2, exp_GST_SFO_Table2, "Incorrect GST value is displayed in SFO Table2 Confirm & Submit page");
    	
    	double exp_QST_SFO_Table2=(double)(exp_SFO_table2_subTotal * stateTaxQST) / 100;
    	exp_QST_SFO_Table2 =Double.parseDouble(new DecimalFormat("##.##").format(exp_QST_SFO_Table2));
    	
    	Assert.assertEquals(act_QST_SFO_Table2, exp_QST_SFO_Table2, "Incorrect QST value is displayed in SFO Table2 Confirm & Submit page");
    	
    	String act_SFO_table2_total_is=Student1_Total_Table2_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table2_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table2_total_is);
    	double act_SFO_table2_total=Double.parseDouble(act_SFO_table2_total_is);
    	
    	double exp_SFO_table2_total=exp_SFO_table2_subTotal+exp_GST_SFO_Table2+exp_QST_SFO_Table2;
    	exp_SFO_table2_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table2_total));
    	
    	Assert.assertEquals(act_SFO_table2_total, exp_SFO_table2_total, "Incorrect SFO Table2 Total value is displayed in Confirm & Submit page");
    	
    	String act_CreditNotes_in_SFO_is=CreditNotes_SFO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_SFO=Double.parseDouble(act_CreditNotes_in_SFO_is);
    	
    	double exp_SFO_total=(exp_SFO_table1_total + exp_SFO_table2_total) - act_CreditNotes_in_SFO;
    	exp_SFO_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_total));
    	
    	String act_SFO_Total_is=SFO_Total_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_total, "Incorrect SFO Total value is displayed in Confirm & Submit page");
    	
    	return exp_SFO_total;
    }
	
	@Override
    public double validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_HST() {
		double stateTaxHST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxHST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_SFO_section_table1_in_Confirm_Submit_page();
    	double exp_SFO_table1_subTotal=item1_price;
    	String act_SFO_table1_subTotal_is=Student1_subtotal_Table1_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_subTotal_is);
    	double act_SFO_table1_subTotal=Double.parseDouble(act_SFO_table1_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table1_subTotal, exp_SFO_table1_subTotal, "Incorrect Student subtotal value is displayed in Table1 Confirm & Submit page");
    	
    	double act_HST_SFO_Table1=HST_SFO_Table1_Confirm_Submit_page();
    	
    	double exp_HST_SFO_Table1=(double)(exp_SFO_table1_subTotal * stateTaxHST) / 100;
    	exp_HST_SFO_Table1 =Double.parseDouble(new DecimalFormat("##.##").format(exp_HST_SFO_Table1));
    	
    	Assert.assertEquals(act_HST_SFO_Table1, exp_HST_SFO_Table1, "Incorrect HST value is displayed in SFO Table1 Confirm & Submit page");
    	
    	String act_SFO_table1_total_is=Student1_Total_Table1_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_total_is);
    	double act_SFO_table1_total=Double.parseDouble(act_SFO_table1_total_is);
    	
    	double exp_SFO_table1_total=exp_SFO_table1_subTotal+exp_HST_SFO_Table1;
    	exp_SFO_table1_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table1_total));
    	
    	Assert.assertEquals(act_SFO_table1_total, exp_SFO_table1_total, "Incorrect SFO Table1 Total value is displayed in Confirm & Submit page");
    	
    	/////////////////////////////////////////////
    	
    	double item_1_price=item1_price_in_SFO_section_table2_in_Confirm_Submit_page();
    	double exp_SFO_table2_subTotal=item_1_price;
    	String act_SFO_table2_subTotal_is=Student1_subtotal_Table2_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table2_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table2_subTotal_is);
    	double act_SFO_table2_subTotal=Double.parseDouble(act_SFO_table2_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table2_subTotal, exp_SFO_table2_subTotal, "Incorrect Student subtotal value is displayed in Table2 Confirm & Submit page");
    	
    	double act_HST_SFO_Table2=HST_SFO_Table2_Confirm_Submit_page();
    	
    	double exp_HST_SFO_Table2=(double)(exp_SFO_table2_subTotal * stateTaxHST) / 100;
    	exp_HST_SFO_Table2 =Double.parseDouble(new DecimalFormat("##.##").format(exp_HST_SFO_Table2));
    	
    	Assert.assertEquals(act_HST_SFO_Table2, exp_HST_SFO_Table2, "Incorrect HST value is displayed in SFO Table2 Confirm & Submit page");
    	
    	String act_SFO_table2_total_is=Student1_Total_Table2_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table2_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table2_total_is);
    	double act_SFO_table2_total=Double.parseDouble(act_SFO_table2_total_is);
    	
    	double exp_SFO_table2_total=exp_SFO_table2_subTotal+exp_HST_SFO_Table2;
    	exp_SFO_table2_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table2_total));
    	
    	Assert.assertEquals(act_SFO_table2_total, exp_SFO_table2_total, "Incorrect SFO Table2 Total value is displayed in Confirm & Submit page");
    	
    	String act_CreditNotes_in_SFO_is=CreditNotes_SFO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_SFO=Double.parseDouble(act_CreditNotes_in_SFO_is);
    	
    	double exp_SFO_total=(exp_SFO_table1_total + exp_SFO_table2_total) - act_CreditNotes_in_SFO;
    	exp_SFO_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_total));
    	
    	String act_SFO_Total_is=SFO_Total_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_total, "Incorrect SFO Total value is displayed in Confirm & Submit page");
    	
    	return exp_SFO_total;
    }
	
	@Override
    public double validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_GST() {
		double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_SFO_section_table1_in_Confirm_Submit_page();
    	double exp_SFO_table1_subTotal=item1_price;
    	String act_SFO_table1_subTotal_is=Student1_subtotal_Table1_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_subTotal_is);
    	double act_SFO_table1_subTotal=Double.parseDouble(act_SFO_table1_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table1_subTotal, exp_SFO_table1_subTotal, "Incorrect Student subtotal value is displayed in Table1 Confirm & Submit page");
    	
    	double act_GST_SFO_Table1=GST_SFO_Table1_Confirm_Submit_page();
    	
    	double exp_GST_SFO_Table1=(double)(exp_SFO_table1_subTotal * stateTaxGST) / 100;
    	exp_GST_SFO_Table1 =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_SFO_Table1));
    	
    	Assert.assertEquals(act_GST_SFO_Table1, exp_GST_SFO_Table1, "Incorrect GST value is displayed in SFO Table1 Confirm & Submit page");
    	
    	String act_SFO_table1_total_is=Student1_Total_Table1_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_total_is);
    	double act_SFO_table1_total=Double.parseDouble(act_SFO_table1_total_is);
    	
    	double exp_SFO_table1_total=exp_SFO_table1_subTotal+exp_GST_SFO_Table1;
    	exp_SFO_table1_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table1_total));
    	
    	Assert.assertEquals(act_SFO_table1_total, exp_SFO_table1_total, "Incorrect SFO Table1 Total value is displayed in Confirm & Submit page");
    	
    	/////////////////////////////////////////////
    	
    	double item_1_price=item1_price_in_SFO_section_table2_in_Confirm_Submit_page();
    	double exp_SFO_table2_subTotal=item_1_price;
    	String act_SFO_table2_subTotal_is=Student1_subtotal_Table2_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table2_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table2_subTotal_is);
    	double act_SFO_table2_subTotal=Double.parseDouble(act_SFO_table2_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table2_subTotal, exp_SFO_table2_subTotal, "Incorrect Student subtotal value is displayed in Table2 Confirm & Submit page");
    	
    	double act_GST_SFO_Table2=GST_SFO_Table2_Confirm_Submit_page();
    	
    	double exp_GST_SFO_Table2=(double)(exp_SFO_table2_subTotal * stateTaxGST) / 100;
    	exp_GST_SFO_Table2 =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_SFO_Table2));
    	
    	Assert.assertEquals(act_GST_SFO_Table2, exp_GST_SFO_Table2, "Incorrect GST value is displayed in SFO Table2 Confirm & Submit page");
    	
    	String act_SFO_table2_total_is=Student1_Total_Table2_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table2_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table2_total_is);
    	double act_SFO_table2_total=Double.parseDouble(act_SFO_table2_total_is);
    	
    	double exp_SFO_table2_total=exp_SFO_table2_subTotal+exp_GST_SFO_Table2;
    	exp_SFO_table2_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table2_total));
    	
    	Assert.assertEquals(act_SFO_table2_total, exp_SFO_table2_total, "Incorrect SFO Table2 Total value is displayed in Confirm & Submit page");
    	
    	String act_CreditNotes_in_SFO_is=CreditNotes_SFO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_SFO=Double.parseDouble(act_CreditNotes_in_SFO_is);
    	
    	double exp_SFO_total=(exp_SFO_table1_total + exp_SFO_table2_total) - act_CreditNotes_in_SFO;
    	exp_SFO_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_total));
    	
    	String act_SFO_Total_is=SFO_Total_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_total, "Incorrect SFO Total value is displayed in Confirm & Submit page");
    	
    	return exp_SFO_total;
    }
	
	@Override
    public double No_tax_validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_GST_PST() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_SFO_section_table1_in_Confirm_Submit_page();
    	double exp_SFO_table1_subTotal=item1_price;
    	String act_SFO_table1_subTotal_is=Student1_subtotal_Table1_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_subTotal_is);
    	double act_SFO_table1_subTotal=Double.parseDouble(act_SFO_table1_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table1_subTotal, exp_SFO_table1_subTotal, "Incorrect Student subtotal value is displayed in Table1 Confirm & Submit page");
    	
    	double act_GST_SFO_Table1=GST_SFO_Table1_Confirm_Submit_page();
    	double act_PST_SFO_Table1=PST_SFO_Table1_Confirm_Submit_page();
    	
    	double exp_GST_SFO_Table1=0;
    	Assert.assertEquals(act_GST_SFO_Table1, exp_GST_SFO_Table1, "GST value is displayed in SFO Table1 Confirm & Submit page");
    	
    	double exp_PST_SFO_Table1=0;
    	Assert.assertEquals(act_PST_SFO_Table1, exp_PST_SFO_Table1, "PST value is displayed in SFO Table1 Confirm & Submit page");
    	
    	String act_SFO_table1_total_is=Student1_Total_Table1_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_total_is);
    	double act_SFO_table1_total=Double.parseDouble(act_SFO_table1_total_is);
    	
    	double exp_SFO_table1_total=exp_SFO_table1_subTotal+exp_GST_SFO_Table1+exp_PST_SFO_Table1;
    	exp_SFO_table1_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table1_total));
    	
    	Assert.assertEquals(act_SFO_table1_total, exp_SFO_table1_total, "Incorrect SFO Table1 Total value is displayed in Confirm & Submit page");
    	
    	/////////////////////////////////////////////
    	
    	double item_1_price=item1_price_in_SFO_section_table2_in_Confirm_Submit_page();
    	double exp_SFO_table2_subTotal=item_1_price;
    	String act_SFO_table2_subTotal_is=Student1_subtotal_Table2_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table2_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table2_subTotal_is);
    	double act_SFO_table2_subTotal=Double.parseDouble(act_SFO_table2_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table2_subTotal, exp_SFO_table2_subTotal, "Incorrect Student subtotal value is displayed in Table2 Confirm & Submit page");
    	
    	double act_GST_SFO_Table2=GST_SFO_Table2_Confirm_Submit_page();
    	double act_PST_SFO_Table2=PST_SFO_Table2_Confirm_Submit_page();
    	
    	double exp_GST_SFO_Table2=0;
    	Assert.assertEquals(act_GST_SFO_Table2, exp_GST_SFO_Table2, "GST value is displayed in SFO Table2 Confirm & Submit page");
    	
    	double exp_PST_SFO_Table2=0;
    	Assert.assertEquals(act_PST_SFO_Table2, exp_PST_SFO_Table2, "PST value is displayed in SFO Table2 Confirm & Submit page");
    	
    	String act_SFO_table2_total_is=Student1_Total_Table2_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table2_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table2_total_is);
    	double act_SFO_table2_total=Double.parseDouble(act_SFO_table2_total_is);
    	
    	double exp_SFO_table2_total=exp_SFO_table2_subTotal+exp_GST_SFO_Table2+exp_PST_SFO_Table2;
    	exp_SFO_table2_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table2_total));
    	
    	Assert.assertEquals(act_SFO_table2_total, exp_SFO_table2_total, "Incorrect SFO Table2 Total value is displayed in Confirm & Submit page");
    	
    	String act_CreditNotes_in_SFO_is=CreditNotes_SFO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_SFO=Double.parseDouble(act_CreditNotes_in_SFO_is);
    	
    	double exp_SFO_total=(exp_SFO_table1_total + exp_SFO_table2_total) - act_CreditNotes_in_SFO;
    	exp_SFO_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_total));
    	
    	String act_SFO_Total_is=SFO_Total_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_total, "Incorrect SFO Total value is displayed in Confirm & Submit page");
    	
    	return exp_SFO_total;
    }
	
	@Override
    public double No_tax_validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_GST_QST() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_SFO_section_table1_in_Confirm_Submit_page();
    	double exp_SFO_table1_subTotal=item1_price;
    	String act_SFO_table1_subTotal_is=Student1_subtotal_Table1_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_subTotal_is);
    	double act_SFO_table1_subTotal=Double.parseDouble(act_SFO_table1_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table1_subTotal, exp_SFO_table1_subTotal, "Incorrect Student subtotal value is displayed in Table1 Confirm & Submit page");
    	
    	double act_GST_SFO_Table1=GST_SFO_Table1_Confirm_Submit_page();
    	double act_QST_SFO_Table1=QST_SFO_Table1_Confirm_Submit_page();
    	
    	double exp_GST_SFO_Table1=0;
    	Assert.assertEquals(act_GST_SFO_Table1, exp_GST_SFO_Table1, "GST value is displayed in SFO Table1 Confirm & Submit page");
    	
    	double exp_QST_SFO_Table1=0;
    	Assert.assertEquals(act_QST_SFO_Table1, exp_QST_SFO_Table1, "QST value is displayed in SFO Table1 Confirm & Submit page");
    	
    	String act_SFO_table1_total_is=Student1_Total_Table1_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_total_is);
    	double act_SFO_table1_total=Double.parseDouble(act_SFO_table1_total_is);
    	
    	double exp_SFO_table1_total=exp_SFO_table1_subTotal+exp_GST_SFO_Table1+exp_QST_SFO_Table1;
    	exp_SFO_table1_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table1_total));
    	
    	Assert.assertEquals(act_SFO_table1_total, exp_SFO_table1_total, "Incorrect SFO Table1 Total value is displayed in Confirm & Submit page");
    	
    	/////////////////////////////////////////////
    	
    	double item_1_price=item1_price_in_SFO_section_table2_in_Confirm_Submit_page();
    	double exp_SFO_table2_subTotal=item_1_price;
    	String act_SFO_table2_subTotal_is=Student1_subtotal_Table2_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table2_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table2_subTotal_is);
    	double act_SFO_table2_subTotal=Double.parseDouble(act_SFO_table2_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table2_subTotal, exp_SFO_table2_subTotal, "Incorrect Student subtotal value is displayed in Table2 Confirm & Submit page");
    	
    	double act_GST_SFO_Table2=GST_SFO_Table2_Confirm_Submit_page();
    	double act_QST_SFO_Table2=QST_SFO_Table2_Confirm_Submit_page();
    	
    	double exp_GST_SFO_Table2=0;
    	Assert.assertEquals(act_GST_SFO_Table2, exp_GST_SFO_Table2, "GST value is displayed in SFO Table2 Confirm & Submit page");
    	
    	double exp_QST_SFO_Table2=0;
    	Assert.assertEquals(act_QST_SFO_Table2, exp_QST_SFO_Table2, "QST value is displayed in SFO Table2 Confirm & Submit page");
    	
    	String act_SFO_table2_total_is=Student1_Total_Table2_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table2_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table2_total_is);
    	double act_SFO_table2_total=Double.parseDouble(act_SFO_table2_total_is);
    	
    	double exp_SFO_table2_total=exp_SFO_table2_subTotal+exp_GST_SFO_Table2+exp_QST_SFO_Table2;
    	exp_SFO_table2_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table2_total));
    	
    	Assert.assertEquals(act_SFO_table2_total, exp_SFO_table2_total, "Incorrect SFO Table2 Total value is displayed in Confirm & Submit page");
    	
    	String act_CreditNotes_in_SFO_is=CreditNotes_SFO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_SFO=Double.parseDouble(act_CreditNotes_in_SFO_is);
    	
    	double exp_SFO_total=(exp_SFO_table1_total + exp_SFO_table2_total) - act_CreditNotes_in_SFO;
    	exp_SFO_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_total));
    	
    	String act_SFO_Total_is=SFO_Total_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_total, "Incorrect SFO Total value is displayed in Confirm & Submit page");
    	
    	return exp_SFO_total;
    }
	
	@Override
    public double No_tax_validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_HST() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_SFO_section_table1_in_Confirm_Submit_page();
    	double exp_SFO_table1_subTotal=item1_price;
    	String act_SFO_table1_subTotal_is=Student1_subtotal_Table1_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_subTotal_is);
    	double act_SFO_table1_subTotal=Double.parseDouble(act_SFO_table1_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table1_subTotal, exp_SFO_table1_subTotal, "Incorrect Student subtotal value is displayed in Table1 Confirm & Submit page");
    	
    	double act_HST_SFO_Table1=HST_SFO_Table1_Confirm_Submit_page();
    	
    	double exp_HST_SFO_Table1=0;
    	Assert.assertEquals(act_HST_SFO_Table1, exp_HST_SFO_Table1, "HST value is displayed in SFO Table1 Confirm & Submit page");
    	
    	String act_SFO_table1_total_is=Student1_Total_Table1_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_total_is);
    	double act_SFO_table1_total=Double.parseDouble(act_SFO_table1_total_is);
    	
    	double exp_SFO_table1_total=exp_SFO_table1_subTotal+exp_HST_SFO_Table1;
    	exp_SFO_table1_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table1_total));
    	
    	Assert.assertEquals(act_SFO_table1_total, exp_SFO_table1_total, "Incorrect SFO Table1 Total value is displayed in Confirm & Submit page");
    	
    	/////////////////////////////////////////////
    	
    	double item_1_price=item1_price_in_SFO_section_table2_in_Confirm_Submit_page();
    	double exp_SFO_table2_subTotal=item_1_price;
    	String act_SFO_table2_subTotal_is=Student1_subtotal_Table2_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table2_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table2_subTotal_is);
    	double act_SFO_table2_subTotal=Double.parseDouble(act_SFO_table2_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table2_subTotal, exp_SFO_table2_subTotal, "Incorrect Student subtotal value is displayed in Table2 Confirm & Submit page");
    	
    	double act_HST_SFO_Table2=HST_SFO_Table2_Confirm_Submit_page();
    	
    	double exp_HST_SFO_Table2=0;
    	Assert.assertEquals(act_HST_SFO_Table2, exp_HST_SFO_Table2, "HST value is displayed in SFO Table2 Confirm & Submit page");
    	
    	String act_SFO_table2_total_is=Student1_Total_Table2_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table2_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table2_total_is);
    	double act_SFO_table2_total=Double.parseDouble(act_SFO_table2_total_is);
    	
    	double exp_SFO_table2_total=exp_SFO_table2_subTotal+exp_HST_SFO_Table2;
    	exp_SFO_table2_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table2_total));
    	
    	Assert.assertEquals(act_SFO_table2_total, exp_SFO_table2_total, "Incorrect SFO Table2 Total value is displayed in Confirm & Submit page");
    	
    	String act_CreditNotes_in_SFO_is=CreditNotes_SFO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_SFO=Double.parseDouble(act_CreditNotes_in_SFO_is);
    	
    	double exp_SFO_total=(exp_SFO_table1_total + exp_SFO_table2_total) - act_CreditNotes_in_SFO;
    	exp_SFO_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_total));
    	
    	String act_SFO_Total_is=SFO_Total_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_total, "Incorrect SFO Total value is displayed in Confirm & Submit page");
    	
    	return exp_SFO_total;
    }
	
	@Override
    public double No_tax_validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_GST() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_SFO_section_table1_in_Confirm_Submit_page();
    	double exp_SFO_table1_subTotal=item1_price;
    	String act_SFO_table1_subTotal_is=Student1_subtotal_Table1_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_subTotal_is);
    	double act_SFO_table1_subTotal=Double.parseDouble(act_SFO_table1_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table1_subTotal, exp_SFO_table1_subTotal, "Incorrect Student subtotal value is displayed in Table1 Confirm & Submit page");
    	
    	double act_GST_SFO_Table1=GST_SFO_Table1_Confirm_Submit_page();
    	
    	double exp_GST_SFO_Table1=0;
    	Assert.assertEquals(act_GST_SFO_Table1, exp_GST_SFO_Table1, "GST value is displayed in SFO Table1 Confirm & Submit page");
    	
    	String act_SFO_table1_total_is=Student1_Total_Table1_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_total_is);
    	double act_SFO_table1_total=Double.parseDouble(act_SFO_table1_total_is);
    	
    	double exp_SFO_table1_total=exp_SFO_table1_subTotal+exp_GST_SFO_Table1;
    	exp_SFO_table1_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table1_total));
    	
    	Assert.assertEquals(act_SFO_table1_total, exp_SFO_table1_total, "Incorrect SFO Table1 Total value is displayed in Confirm & Submit page");
    	
    	/////////////////////////////////////////////
    	
    	double item_1_price=item1_price_in_SFO_section_table2_in_Confirm_Submit_page();
    	double exp_SFO_table2_subTotal=item_1_price;
    	String act_SFO_table2_subTotal_is=Student1_subtotal_Table2_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table2_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table2_subTotal_is);
    	double act_SFO_table2_subTotal=Double.parseDouble(act_SFO_table2_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table2_subTotal, exp_SFO_table2_subTotal, "Incorrect Student subtotal value is displayed in Table2 Confirm & Submit page");
    	
    	double act_GST_SFO_Table2=GST_SFO_Table2_Confirm_Submit_page();
    	
    	double exp_GST_SFO_Table2=0;
    	Assert.assertEquals(act_GST_SFO_Table2, exp_GST_SFO_Table2, "GST value is displayed in SFO Table2 Confirm & Submit page");
    	
    	String act_SFO_table2_total_is=Student1_Total_Table2_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table2_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table2_total_is);
    	double act_SFO_table2_total=Double.parseDouble(act_SFO_table2_total_is);
    	
    	double exp_SFO_table2_total=exp_SFO_table2_subTotal+exp_GST_SFO_Table2;
    	exp_SFO_table2_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table2_total));
    	
    	Assert.assertEquals(act_SFO_table2_total, exp_SFO_table2_total, "Incorrect SFO Table2 Total value is displayed in Confirm & Submit page");
    	
    	String act_CreditNotes_in_SFO_is=CreditNotes_SFO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_SFO=Double.parseDouble(act_CreditNotes_in_SFO_is);
    	
    	double exp_SFO_total=(exp_SFO_table1_total + exp_SFO_table2_total) - act_CreditNotes_in_SFO;
    	exp_SFO_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_total));
    	
    	String act_SFO_Total_is=SFO_Total_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_total, "Incorrect SFO Total value is displayed in Confirm & Submit page");
    	
    	return exp_SFO_total;
    }
	
	@Override
    public double Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	Double act_Shipping_Total_Value=null;
    	String act_Shipping_Total_is=Shipping_Handling_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	
    	if (act_Shipping_Total_is.equals("FREE")) {
    		act_Shipping_Total_Value=(double) 0;
		} else {
			act_Shipping_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Total_is);
	    	act_Shipping_Total_Value=Double.parseDouble(act_Shipping_Total_is);
		}
    	return act_Shipping_Total_Value;
		
	}
		
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_single_item_single_student_SFO_section_in_Confirm_Submit_page_GST_PST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	double exp_SFO_Total=validation_of_SFO_section_Table1_single_item_single_student_in_Confirm_Submit_page_GST_PST();
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_PST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_SFO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_multiple_items_single_student_SFO_section_in_Confirm_Submit_page_GST_PST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	double exp_SFO_Total=validation_of_SFO_section_Table1_multiple_items_single_student_in_Confirm_Submit_page_GST_PST();
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_PST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_SFO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_GST_PST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	double exp_SFO_Total=validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_GST_PST();
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_PST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_SFO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_GST_QST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	double exp_SFO_Total=validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_GST_QST();
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_QST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_SFO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_HST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	double exp_SFO_Total=validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_HST();
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_HST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_SFO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_GST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	double exp_SFO_Total=validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_GST();
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_SFO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void No_tax_validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_GST_QST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	double exp_SFO_Total=No_tax_validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_GST_QST();
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=No_tax_validation_for_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_QST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_SFO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void No_tax_validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_GST_PST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	double exp_SFO_Total=No_tax_validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_GST_PST();
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=No_tax_validation_for_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_PST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_SFO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void No_tax_validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_HST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	double exp_SFO_Total=No_tax_validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_HST();
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=No_tax_validation_for_Shipping_Handling_section_in_Confirm_and_Submit_page_HST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_SFO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void No_tax_validation_of_OrderSummary_Totals_Shipping_and_SFO_section_in_Confirm_Submit_page_GST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	double exp_SFO_Total=No_tax_validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_GST();
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=No_tax_validation_for_Shipping_Handling_section_in_Confirm_and_Submit_page_GST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_SFO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void verify_YTO_section_displayed_in_Confirm_Submit_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
    	
    	try {
    		section_YTO_header_Confirm_Submit_page().isDisplayed();
    		String act_text=section_YTO_header_Confirm_Submit_page().getText().trim();
    		String exp_text="YOUR TEACHER ORDER";
    		
    		Assert.assertEquals(act_text, exp_text, "Incorrect YTO header text is displayed in Confirm & Submit page");
		} catch (Exception e) {
			Assert.fail("YTO section is not displayed in Confirm & Submit page");
		}
    }
	
	@Override
    public double item1_price_in_YTO_section_in_Confirm_Submit_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		
		String value1=item1_price_YTO_Confirm_Submit_page().getText().trim();
		String ele1=item1_QTY_YTO_Confirm_Submit_page().getText().trim();
		
		value1 = SFO_page.delete_US_or_Canada_dollar_for_the_value(value1);
		double d1=Double.parseDouble(value1);
		System.out.println("#############>"+d1);
		int a1=Integer.parseInt(ele1);
		System.out.println("%%%%%%%%%%%%>"+a1);
		double item1_price=d1*a1;
		item1_price =Double.parseDouble(new DecimalFormat("##.##").format(item1_price));
		System.out.println("^^^^^^^^^^^^^^^^^"+item1_price);
		
		return item1_price;
    }
	
	@Override
    public double item2_price_in_YTO_section_in_Confirm_Submit_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		
		String value1=item2_price_YTO_Confirm_Submit_page().getText().trim();
		String ele1=item2_QTY_YTO_Confirm_Submit_page().getText().trim();
		
		value1 = SFO_page.delete_US_or_Canada_dollar_for_the_value(value1);
		double d1=Double.parseDouble(value1);
		System.out.println("#############>"+d1);
		int a1=Integer.parseInt(ele1);
		System.out.println("%%%%%%%%%%%%>"+a1);
		double item2_price=d1*a1;
		item2_price =Double.parseDouble(new DecimalFormat("##.##").format(item2_price));
		System.out.println("^^^^^^^^^^^^^^^^^"+item2_price);
		
		return item2_price;
    }
	
	public double GST_YTO_Confirm_Submit_page()
	{
		String Teacher_gst=GST_YTO_section_Confirm_Submit_page().getText().trim();
		Teacher_gst = SFO_page.delete_US_or_Canada_dollar_for_the_value(Teacher_gst);
		double Teacher_gst_2=Double.parseDouble(Teacher_gst);
		System.out.println("Teacher_GST###########:" + Teacher_gst_2);
		return Teacher_gst_2;
	}
	
	public double PST_YTO_Confirm_Submit_page()
	{
		String Teacher_PST=PST_YTO_section_Confirm_Submit_page().getText().trim();
		Teacher_PST = SFO_page.delete_US_or_Canada_dollar_for_the_value(Teacher_PST);
		double Teacher_PST_2=Double.parseDouble(Teacher_PST);
		System.out.println("Teacher_PST###########:" + Teacher_PST_2);
		return Teacher_PST_2;
	}
	
	public double QST_YTO_Confirm_Submit_page()
	{
		String Teacher_QST=QST_YTO_section_Confirm_Submit_page().getText().trim();
		Teacher_QST = SFO_page.delete_US_or_Canada_dollar_for_the_value(Teacher_QST);
		double Teacher_QST_2=Double.parseDouble(Teacher_QST);
		System.out.println("Teacher_QST###########:" + Teacher_QST_2);
		return Teacher_QST_2;
	}
	
	public double HST_YTO_Confirm_Submit_page()
	{
		String Teacher_HST=HST_YTO_section_Confirm_Submit_page().getText().trim();
		Teacher_HST = SFO_page.delete_US_or_Canada_dollar_for_the_value(Teacher_HST);
		double Teacher_HST_2=Double.parseDouble(Teacher_HST);
		System.out.println("Teacher_HST###########:" + Teacher_HST_2);
		return Teacher_HST_2;
	}
	
	@Override
    public double validation_of_YTO_items_in_Confirm_Submit_page_totals_GST_QST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxQST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxQST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_YTO_section_in_Confirm_Submit_page();
    	double item2_price=item2_price_in_YTO_section_in_Confirm_Submit_page();
    	
    	double exp_YTO_subTotal=item1_price+item2_price;
    	exp_YTO_subTotal =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_subTotal));
    	
    	String act_YTO_subTotal_is=YTO_Subtotal_Confirm_Submit_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	Assert.assertEquals(act_YTO_subTotal, exp_YTO_subTotal, "Incorrect YTO Subtotal value is displayed in Confirm & Submit page");
    	
    	double act_GST_YTO=GST_YTO_Confirm_Submit_page();
    	double act_QST_YTO=QST_YTO_Confirm_Submit_page();
    	
    	double exp_GST_YTO=(double)(exp_YTO_subTotal * stateTaxGST) / 100;
    	exp_GST_YTO =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_YTO));
    	
    	Assert.assertEquals(act_GST_YTO, exp_GST_YTO, "Incorrect GST value is displayed in YTO Confirm & Submit page");
    	
    	double exp_QST_YTO=(double)(exp_YTO_subTotal * stateTaxQST) / 100;
    	exp_QST_YTO =Double.parseDouble(new DecimalFormat("##.##").format(exp_QST_YTO));
    	
    	Assert.assertEquals(act_QST_YTO, exp_QST_YTO, "Incorrect QST value is displayed in YTO Confirm & Submit page");
    	
    	String act_YTO_total_is=YTO_Total_Confirm_Submit_page().getText().trim();
    	act_YTO_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_total_is);
    	double act_YTO_total=Double.parseDouble(act_YTO_total_is);
    	
    	String act_BonusBank_in_YTO_is=BonusBank_YTO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_BonusBank_in_YTO=Double.parseDouble(act_BonusBank_in_YTO_is);
    	
    	String act_CreditNotes_in_YTO_is=CreditNotes_YTO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_YTO=Double.parseDouble(act_CreditNotes_in_YTO_is);
    	
    	double exp_YTO_total=(exp_YTO_subTotal+exp_GST_YTO+exp_QST_YTO)-(act_BonusBank_in_YTO+act_CreditNotes_in_YTO);
    	exp_YTO_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_total));
    	
    	Assert.assertEquals(act_YTO_total, exp_YTO_total, "Incorrect YTO Total value is displayed in Confirm & Submit page");
    	
    	return exp_YTO_total;
    }
	
	@Override
    public double validation_of_YTO_items_in_Confirm_Submit_page_totals_GST_PST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_YTO_section_in_Confirm_Submit_page();
    	double item2_price=item2_price_in_YTO_section_in_Confirm_Submit_page();
    	
    	double exp_YTO_subTotal=item1_price+item2_price;
    	exp_YTO_subTotal =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_subTotal));
    	
    	String act_YTO_subTotal_is=YTO_Subtotal_Confirm_Submit_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	Assert.assertEquals(act_YTO_subTotal, exp_YTO_subTotal, "Incorrect YTO Subtotal value is displayed in Confirm & Submit page");
    	
    	double act_GST_YTO=GST_YTO_Confirm_Submit_page();
    	double act_PST_YTO=PST_YTO_Confirm_Submit_page();
    	
    	double exp_GST_YTO=(double)(exp_YTO_subTotal * stateTaxGST) / 100;
    	exp_GST_YTO =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_YTO));
    	
    	Assert.assertEquals(act_GST_YTO, exp_GST_YTO, "Incorrect GST value is displayed in YTO Confirm & Submit page");
    	
    	double exp_PST_YTO=(double)(exp_YTO_subTotal * stateTaxPST) / 100;
    	exp_PST_YTO =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_YTO));
    	
    	Assert.assertEquals(act_PST_YTO, exp_PST_YTO, "Incorrect PST value is displayed in YTO Confirm & Submit page");
    	
    	String act_YTO_total_is=YTO_Total_Confirm_Submit_page().getText().trim();
    	act_YTO_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_total_is);
    	double act_YTO_total=Double.parseDouble(act_YTO_total_is);
    	
    	String act_BonusBank_in_YTO_is=BonusBank_YTO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_BonusBank_in_YTO=Double.parseDouble(act_BonusBank_in_YTO_is);
    	
    	String act_CreditNotes_in_YTO_is=CreditNotes_YTO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_YTO=Double.parseDouble(act_CreditNotes_in_YTO_is);
    	
    	double exp_YTO_total=(exp_YTO_subTotal+exp_GST_YTO+exp_PST_YTO)-(act_BonusBank_in_YTO+act_CreditNotes_in_YTO);
    	exp_YTO_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_total));
    	
    	Assert.assertEquals(act_YTO_total, exp_YTO_total, "Incorrect YTO Total value is displayed in Confirm & Submit page");
    	
    	return exp_YTO_total;
    }
	
	@Override
    public double validation_of_YTO_items_in_Confirm_Submit_page_totals_GST() {
    	double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_YTO_section_in_Confirm_Submit_page();
    	double item2_price=item2_price_in_YTO_section_in_Confirm_Submit_page();
    	
    	double exp_YTO_subTotal=item1_price+item2_price;
    	exp_YTO_subTotal =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_subTotal));
    	
    	String act_YTO_subTotal_is=YTO_Subtotal_Confirm_Submit_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	Assert.assertEquals(act_YTO_subTotal, exp_YTO_subTotal, "Incorrect YTO Subtotal value is displayed in Confirm & Submit page");
    	
    	double act_GST_YTO=GST_YTO_Confirm_Submit_page();
    	
    	double exp_GST_YTO=(double)(exp_YTO_subTotal * stateTaxGST) / 100;
    	exp_GST_YTO =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_YTO));
    	
    	Assert.assertEquals(act_GST_YTO, exp_GST_YTO, "Incorrect GST value is displayed in YTO Confirm & Submit page");
    	
    	String act_YTO_total_is=YTO_Total_Confirm_Submit_page().getText().trim();
		System.out.println("<<<WHAT VALUE act_YTO_total_is"+act_YTO_subTotal_is);
		act_YTO_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_total_is);
    	double act_YTO_total=Double.parseDouble(act_YTO_total_is);
    	
    	String act_BonusBank_in_YTO_is=BonusBank_YTO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_BonusBank_in_YTO=Double.parseDouble(act_BonusBank_in_YTO_is);
    	
    	String act_CreditNotes_in_YTO_is=CreditNotes_YTO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_YTO=Double.parseDouble(act_CreditNotes_in_YTO_is);
    	
    	double exp_YTO_total=(exp_YTO_subTotal+exp_GST_YTO)-(act_BonusBank_in_YTO+act_CreditNotes_in_YTO);
    	exp_YTO_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_total));
    	
    	Assert.assertEquals(act_YTO_total, exp_YTO_total, "Incorrect YTO Total value is displayed in Confirm & Submit page");
    	
    	return exp_YTO_total;
    }
	
	@Override
    public double validation_of_YTO_items_in_Confirm_Submit_page_totals_HST() {
    	double stateTaxHST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxHST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_YTO_section_in_Confirm_Submit_page();
    	double item2_price=item2_price_in_YTO_section_in_Confirm_Submit_page();
    	
    	double exp_YTO_subTotal=item1_price+item2_price;
    	exp_YTO_subTotal =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_subTotal));
    	
    	String act_YTO_subTotal_is=YTO_Subtotal_Confirm_Submit_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	Assert.assertEquals(act_YTO_subTotal, exp_YTO_subTotal, "Incorrect YTO Subtotal value is displayed in Confirm & Submit page");
    	
    	double act_HST_YTO=HST_YTO_Confirm_Submit_page();
    	
    	double exp_HST_YTO=(double)(exp_YTO_subTotal * stateTaxHST) / 100;
    	exp_HST_YTO =Double.parseDouble(new DecimalFormat("##.##").format(exp_HST_YTO));
    	
    	Assert.assertEquals(act_HST_YTO, exp_HST_YTO, "Incorrect HST value is displayed in YTO Confirm & Submit page");
    	
    	String act_YTO_total_is=YTO_Total_Confirm_Submit_page().getText().trim();
    	act_YTO_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_total_is);
    	double act_YTO_total=Double.parseDouble(act_YTO_total_is);
    	
    	String act_BonusBank_in_YTO_is=BonusBank_YTO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_BonusBank_in_YTO=Double.parseDouble(act_BonusBank_in_YTO_is);
    	
    	String act_CreditNotes_in_YTO_is=CreditNotes_YTO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_YTO=Double.parseDouble(act_CreditNotes_in_YTO_is);
    	
    	double exp_YTO_total=(exp_YTO_subTotal+exp_HST_YTO)-(act_BonusBank_in_YTO+act_CreditNotes_in_YTO);
    	exp_YTO_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_total));
    	
    	Assert.assertEquals(act_YTO_total, exp_YTO_total, "Incorrect YTO Total value is displayed in Confirm & Submit page");
    	
    	return exp_YTO_total;
    }
	
	@Override
    public double NoTax_validation_of_YTO_items_in_Confirm_Submit_page_totals_GST_QST() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_YTO_section_in_Confirm_Submit_page();
    	double item2_price=item2_price_in_YTO_section_in_Confirm_Submit_page();
    	
    	double exp_YTO_subTotal=item1_price+item2_price;
    	exp_YTO_subTotal =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_subTotal));
    	
    	String act_YTO_subTotal_is=YTO_Subtotal_Confirm_Submit_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	Assert.assertEquals(act_YTO_subTotal, exp_YTO_subTotal, "Incorrect YTO Subtotal value is displayed in Confirm & Submit page");
    	
    	double act_GST_YTO=GST_YTO_Confirm_Submit_page();
    	double act_QST_YTO=QST_YTO_Confirm_Submit_page();
    	
    	double exp_GST_YTO=0;
    	Assert.assertEquals(act_GST_YTO, exp_GST_YTO, "GST value is displayed in YTO Confirm & Submit page");
    	
    	double exp_QST_YTO=0;
    	Assert.assertEquals(act_QST_YTO, exp_QST_YTO, "QST value is displayed in YTO Confirm & Submit page");
    	
    	String act_YTO_total_is=YTO_Total_Confirm_Submit_page().getText().trim();
    	act_YTO_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_total_is);
    	double act_YTO_total=Double.parseDouble(act_YTO_total_is);
    	
    	String act_BonusBank_in_YTO_is=BonusBank_YTO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_BonusBank_in_YTO=Double.parseDouble(act_BonusBank_in_YTO_is);
    	
    	String act_CreditNotes_in_YTO_is=CreditNotes_YTO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_YTO=Double.parseDouble(act_CreditNotes_in_YTO_is);
    	
    	double exp_YTO_total=(exp_YTO_subTotal+exp_GST_YTO+exp_QST_YTO)-(act_BonusBank_in_YTO+act_CreditNotes_in_YTO);
    	exp_YTO_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_total));
    	
    	Assert.assertEquals(act_YTO_total, exp_YTO_total, "Incorrect YTO Total value is displayed in Confirm & Submit page");
    	
    	return exp_YTO_total;
    }
	
	@Override
    public double NoTax_validation_of_YTO_items_in_Confirm_Submit_page_totals_GST_PST() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_YTO_section_in_Confirm_Submit_page();
    	double item2_price=item2_price_in_YTO_section_in_Confirm_Submit_page();
    	
    	double exp_YTO_subTotal=item1_price+item2_price;
    	exp_YTO_subTotal =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_subTotal));
    	
    	String act_YTO_subTotal_is=YTO_Subtotal_Confirm_Submit_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	Assert.assertEquals(act_YTO_subTotal, exp_YTO_subTotal, "Incorrect YTO Subtotal value is displayed in Confirm & Submit page");
    	
    	double act_GST_YTO=GST_YTO_Confirm_Submit_page();
    	double act_PST_YTO=PST_YTO_Confirm_Submit_page();
    	
    	double exp_GST_YTO=0;
    	Assert.assertEquals(act_GST_YTO, exp_GST_YTO, "GST value is displayed in YTO Confirm & Submit page");
    	
    	double exp_PST_YTO=0;
    	Assert.assertEquals(act_PST_YTO, exp_PST_YTO, "PST value is displayed in YTO Confirm & Submit page");
    	
    	String act_YTO_total_is=YTO_Total_Confirm_Submit_page().getText().trim();
    	act_YTO_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_total_is);
    	double act_YTO_total=Double.parseDouble(act_YTO_total_is);
    	
    	String act_BonusBank_in_YTO_is=BonusBank_YTO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_BonusBank_in_YTO=Double.parseDouble(act_BonusBank_in_YTO_is);
    	
    	String act_CreditNotes_in_YTO_is=CreditNotes_YTO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_YTO=Double.parseDouble(act_CreditNotes_in_YTO_is);
    	
    	double exp_YTO_total=(exp_YTO_subTotal+exp_GST_YTO+exp_PST_YTO)-(act_BonusBank_in_YTO+act_CreditNotes_in_YTO);
    	exp_YTO_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_total));
    	
    	Assert.assertEquals(act_YTO_total, exp_YTO_total, "Incorrect YTO Total value is displayed in Confirm & Submit page");
    	
    	return exp_YTO_total;
    }
	
	@Override
    public double NoTax_validation_of_YTO_items_in_Confirm_Submit_page_totals_HST() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_YTO_section_in_Confirm_Submit_page();
    	double item2_price=item2_price_in_YTO_section_in_Confirm_Submit_page();
    	
    	double exp_YTO_subTotal=item1_price+item2_price;
    	exp_YTO_subTotal =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_subTotal));
    	
    	String act_YTO_subTotal_is=YTO_Subtotal_Confirm_Submit_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	Assert.assertEquals(act_YTO_subTotal, exp_YTO_subTotal, "Incorrect YTO Subtotal value is displayed in Confirm & Submit page");
    	
    	double act_HST_YTO=HST_YTO_Confirm_Submit_page();
    	
    	double exp_HST_YTO=0;
    	Assert.assertEquals(act_HST_YTO, exp_HST_YTO, "HST value is displayed in YTO Confirm & Submit page");
    
    	String act_YTO_total_is=YTO_Total_Confirm_Submit_page().getText().trim();
    	act_YTO_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_total_is);
    	double act_YTO_total=Double.parseDouble(act_YTO_total_is);
    	
    	String act_BonusBank_in_YTO_is=BonusBank_YTO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_BonusBank_in_YTO=Double.parseDouble(act_BonusBank_in_YTO_is);
    	
    	String act_CreditNotes_in_YTO_is=CreditNotes_YTO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_YTO=Double.parseDouble(act_CreditNotes_in_YTO_is);
    	
    	double exp_YTO_total=(exp_YTO_subTotal+exp_HST_YTO)-(act_BonusBank_in_YTO+act_CreditNotes_in_YTO);
    	exp_YTO_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_total));
    	
    	Assert.assertEquals(act_YTO_total, exp_YTO_total, "Incorrect YTO Total value is displayed in Confirm & Submit page");
    	
    	return exp_YTO_total;
    }
	
	@Override
    public double NoTax_validation_of_YTO_items_in_Confirm_Submit_page_totals_GST() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_YTO_section_in_Confirm_Submit_page();
    	double item2_price=item2_price_in_YTO_section_in_Confirm_Submit_page();
    	
    	double exp_YTO_subTotal=item1_price+item2_price;
    	exp_YTO_subTotal =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_subTotal));
    	
    	String act_YTO_subTotal_is=YTO_Subtotal_Confirm_Submit_page().getText().trim();
    	act_YTO_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_subTotal_is);
    	double act_YTO_subTotal=Double.parseDouble(act_YTO_subTotal_is);
    	
    	Assert.assertEquals(act_YTO_subTotal, exp_YTO_subTotal, "Incorrect YTO Subtotal value is displayed in Confirm & Submit page");
    	
    	double act_GST_YTO=GST_YTO_Confirm_Submit_page();
    	
    	double exp_GST_YTO=0;
    	Assert.assertEquals(act_GST_YTO, exp_GST_YTO, "GST value is displayed in YTO Confirm & Submit page");
    
    	String act_YTO_total_is=YTO_Total_Confirm_Submit_page().getText().trim();
    	act_YTO_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_total_is);
    	double act_YTO_total=Double.parseDouble(act_YTO_total_is);
    	
    	String act_BonusBank_in_YTO_is=BonusBank_YTO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_BonusBank_in_YTO=Double.parseDouble(act_BonusBank_in_YTO_is);
    	
    	String act_CreditNotes_in_YTO_is=CreditNotes_YTO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_YTO=Double.parseDouble(act_CreditNotes_in_YTO_is);
    	
    	double exp_YTO_total=(exp_YTO_subTotal+exp_GST_YTO)-(act_BonusBank_in_YTO+act_CreditNotes_in_YTO);
    	exp_YTO_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_total));
    	
    	Assert.assertEquals(act_YTO_total, exp_YTO_total, "Incorrect YTO Total value is displayed in Confirm & Submit page");
    	
    	return exp_YTO_total;
    }
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_GST_QST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_Total_is=YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	double exp_YTO_Total=validation_of_YTO_items_in_Confirm_Submit_page_totals_GST_QST();
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_QST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_YTO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_GST_PST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_Total_is=YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	double exp_YTO_Total=validation_of_YTO_items_in_Confirm_Submit_page_totals_GST_PST();
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_PST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_YTO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_GST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_Total_is=YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	double exp_YTO_Total=validation_of_YTO_items_in_Confirm_Submit_page_totals_GST();
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_YTO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_HST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_Total_is=YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	double exp_YTO_Total=validation_of_YTO_items_in_Confirm_Submit_page_totals_HST();
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_HST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_YTO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void NoTax_validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_GST_QST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_Total_is=YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	double exp_YTO_Total=NoTax_validation_of_YTO_items_in_Confirm_Submit_page_totals_GST_QST();
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=No_tax_validation_for_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_QST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_YTO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void NoTax_validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_GST_PST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_Total_is=YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	double exp_YTO_Total=NoTax_validation_of_YTO_items_in_Confirm_Submit_page_totals_GST_PST();
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=No_tax_validation_for_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_PST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_YTO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void NoTax_validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_HST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_Total_is=YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	double exp_YTO_Total=NoTax_validation_of_YTO_items_in_Confirm_Submit_page_totals_HST();
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=No_tax_validation_for_Shipping_Handling_section_in_Confirm_and_Submit_page_HST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_YTO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void NoTax_validation_of_OrderSummary_Totals_Shipping_and_YTO_section_in_Confirm_Submit_page_GST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_Total_is=YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	double exp_YTO_Total=NoTax_validation_of_YTO_items_in_Confirm_Submit_page_totals_GST();
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=No_tax_validation_for_Shipping_Handling_section_in_Confirm_and_Submit_page_GST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_YTO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void verify_TE_section_displayed_in_Confirm_Submit_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
    	
    	try {
    		section_TE_header_Confirm_Submit_page().isDisplayed();
    		String act_text=section_TE_header_Confirm_Submit_page().getText().trim();
    		String exp_text="TEACHER EXCLUSIVES";
    		
    		Assert.assertEquals(act_text, exp_text, "Incorrect TE header text is displayed in Confirm & Submit page");
		} catch (Exception e) {
			Assert.fail("TE section is not displayed in Confirm & Submit page");
		}
    }
	
	@Override
    public double item1_price_in_TE_section_in_Confirm_Submit_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		
		String value1=item1_price_TE_Confirm_Submit_page().getText().trim();
		String ele1=item1_QTY_TE_Confirm_Submit_page().getText().trim();
		
		value1 = SFO_page.delete_US_or_Canada_dollar_for_the_value(value1);
		double d1=Double.parseDouble(value1);
		System.out.println("#############>"+d1);
		int a1=Integer.parseInt(ele1);
		System.out.println("%%%%%%%%%%%%>"+a1);
		double item1_price=d1*a1;
		item1_price =Double.parseDouble(new DecimalFormat("##.##").format(item1_price));
		System.out.println("^^^^^^^^^^^^^^^^^"+item1_price);
		
		return item1_price;
    }
	
	@Override
    public double item2_price_in_TE_section_in_Confirm_Submit_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
		
		String value1=item2_price_TE_Confirm_Submit_page().getText().trim();
		String ele1=item2_QTY_TE_Confirm_Submit_page().getText().trim();
		
		value1 = SFO_page.delete_US_or_Canada_dollar_for_the_value(value1);
		double d1=Double.parseDouble(value1);
		System.out.println("#############>"+d1);
		int a1=Integer.parseInt(ele1);
		System.out.println("%%%%%%%%%%%%>"+a1);
		double item2_price=d1*a1;
		item2_price =Double.parseDouble(new DecimalFormat("##.##").format(item2_price));
		System.out.println("^^^^^^^^^^^^^^^^^"+item2_price);
		
		return item2_price;
    }
	
	public double GST_TE_Confirm_Submit_page()
	{
		String Teacher_gst=GST_TE_section_Confirm_Submit_page().getText().trim();
		Teacher_gst = SFO_page.delete_US_or_Canada_dollar_for_the_value(Teacher_gst);
		double Teacher_gst_2=Double.parseDouble(Teacher_gst);
		System.out.println("Teacher_GST###########:" + Teacher_gst_2);
		return Teacher_gst_2;
	}
	
	public double PST_TE_Confirm_Submit_page()
	{
		String Teacher_PST=PST_TE_section_Confirm_Submit_page().getText().trim();
		Teacher_PST = SFO_page.delete_US_or_Canada_dollar_for_the_value(Teacher_PST);
		double Teacher_PST_2=Double.parseDouble(Teacher_PST);
		System.out.println("Teacher_PST###########:" + Teacher_PST_2);
		return Teacher_PST_2;
	}
	
	public double QST_TE_Confirm_Submit_page()
	{
		String Teacher_QST=QST_TE_section_Confirm_Submit_page().getText().trim();
		Teacher_QST = SFO_page.delete_US_or_Canada_dollar_for_the_value(Teacher_QST);
		double Teacher_QST_2=Double.parseDouble(Teacher_QST);
		System.out.println("Teacher_QST###########:" + Teacher_QST_2);
		return Teacher_QST_2;
	}
	
	public double HST_TE_Confirm_Submit_page()
	{
		String Teacher_HST=HST_TE_section_Confirm_Submit_page().getText().trim();
		Teacher_HST = SFO_page.delete_US_or_Canada_dollar_for_the_value(Teacher_HST);
		double Teacher_HST_2=Double.parseDouble(Teacher_HST);
		System.out.println("Teacher_HST###########:" + Teacher_HST_2);
		return Teacher_HST_2;
	}
	
	@Override
    public double validation_of_TE_items_in_Confirm_Submit_page_totals_GST_QST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxQST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxQST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_TE_section_in_Confirm_Submit_page();
    	double item2_price=item2_price_in_TE_section_in_Confirm_Submit_page();
    	
    	double exp_TE_subTotal=item1_price+item2_price;
    	exp_TE_subTotal =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_subTotal));
    	
    	String act_TE_subTotal_is=TE_Subtotal_Confirm_Submit_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	Assert.assertEquals(act_TE_subTotal, exp_TE_subTotal, "Incorrect TE Subtotal value is displayed in Confirm & Submit page");
    	
    	double act_GST_TE=GST_TE_Confirm_Submit_page();
    	double act_QST_TE=QST_TE_Confirm_Submit_page();
    	
    	double exp_GST_TE=(double)(exp_TE_subTotal * stateTaxGST) / 100;
    	exp_GST_TE =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_TE));
    	
    	Assert.assertEquals(act_GST_TE, exp_GST_TE, "Incorrect GST value is displayed in TE Confirm & Submit page");
    	
    	double exp_QST_TE=(double)(exp_TE_subTotal * stateTaxQST) / 100;
    	exp_QST_TE =Double.parseDouble(new DecimalFormat("##.##").format(exp_QST_TE));
    	
    	Assert.assertEquals(act_QST_TE, exp_QST_TE, "Incorrect QST value is displayed in TE Confirm & Submit page");
    	
    	String act_TE_total_is=TE_Total_Confirm_Submit_page().getText().trim();
    	act_TE_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_total_is);
    	double act_TE_total=Double.parseDouble(act_TE_total_is);
    	
    	String act_BonusBank_in_TE_is=BonusBank_TE_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_BonusBank_in_TE=Double.parseDouble(act_BonusBank_in_TE_is);
    	
    	String act_CreditNotes_in_TE_is=CreditNotes_TE_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_TE=Double.parseDouble(act_CreditNotes_in_TE_is);
    	
    	double exp_TE_total=(exp_TE_subTotal+exp_GST_TE+exp_QST_TE)-(act_BonusBank_in_TE+act_CreditNotes_in_TE);
    	exp_TE_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_total));
    	
    	Assert.assertEquals(act_TE_total, exp_TE_total, "Incorrect TE Total value is displayed in Confirm & Submit page");
    	
    	return exp_TE_total;
    }
	
	@Override
    public double validation_of_TE_items_in_Confirm_Submit_page_totals_GST_PST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_TE_section_in_Confirm_Submit_page();
    	double item2_price=item2_price_in_TE_section_in_Confirm_Submit_page();
    	
    	double exp_TE_subTotal=item1_price+item2_price;
    	exp_TE_subTotal =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_subTotal));
    	
    	String act_TE_subTotal_is=TE_Subtotal_Confirm_Submit_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	Assert.assertEquals(act_TE_subTotal, exp_TE_subTotal, "Incorrect TE Subtotal value is displayed in Confirm & Submit page");
    	
    	double act_GST_TE=GST_TE_Confirm_Submit_page();
    	double act_PST_TE=PST_TE_Confirm_Submit_page();
    	
    	double exp_GST_TE=(double)(exp_TE_subTotal * stateTaxGST) / 100;
    	exp_GST_TE =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_TE));
    	
    	Assert.assertEquals(act_GST_TE, exp_GST_TE, "Incorrect GST value is displayed in TE Confirm & Submit page");
    	
    	double exp_PST_TE=(double)(exp_TE_subTotal * stateTaxPST) / 100;
    	exp_PST_TE =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_TE));
    	
    	Assert.assertEquals(act_PST_TE, exp_PST_TE, "Incorrect PST value is displayed in TE Confirm & Submit page");
    	
    	String act_TE_total_is=TE_Total_Confirm_Submit_page().getText().trim();
    	act_TE_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_total_is);
    	double act_TE_total=Double.parseDouble(act_TE_total_is);
    	
    	String act_BonusBank_in_TE_is=BonusBank_TE_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_BonusBank_in_TE=Double.parseDouble(act_BonusBank_in_TE_is);
    	
    	String act_CreditNotes_in_TE_is=CreditNotes_TE_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_TE=Double.parseDouble(act_CreditNotes_in_TE_is);
    	
    	double exp_TE_total=(exp_TE_subTotal+exp_GST_TE+exp_PST_TE)-(act_BonusBank_in_TE+act_CreditNotes_in_TE);
    	exp_TE_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_total));
    	
    	Assert.assertEquals(act_TE_total, exp_TE_total, "Incorrect TE Total value is displayed in Confirm & Submit page");
    	
    	return exp_TE_total;
    }
	
	@Override
    public double validation_of_TE_items_in_Confirm_Submit_page_totals_GST() {
    	double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_TE_section_in_Confirm_Submit_page();
    	double item2_price=item2_price_in_TE_section_in_Confirm_Submit_page();
    	
    	double exp_TE_subTotal=item1_price+item2_price;
    	exp_TE_subTotal =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_subTotal));
    	
    	String act_TE_subTotal_is=TE_Subtotal_Confirm_Submit_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	Assert.assertEquals(act_TE_subTotal, exp_TE_subTotal, "Incorrect TE Subtotal value is displayed in Confirm & Submit page");
    	
    	double act_GST_TE=GST_TE_Confirm_Submit_page();
    	
    	double exp_GST_TE=(double)(exp_TE_subTotal * stateTaxGST) / 100;
    	exp_GST_TE =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_TE));
    	
    	Assert.assertEquals(act_GST_TE, exp_GST_TE, "Incorrect GST value is displayed in TE Confirm & Submit page");
    	
    	String act_TE_total_is=TE_Total_Confirm_Submit_page().getText().trim();
    	act_TE_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_total_is);
    	double act_TE_total=Double.parseDouble(act_TE_total_is);
    	
    	String act_BonusBank_in_TE_is=BonusBank_TE_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_BonusBank_in_TE=Double.parseDouble(act_BonusBank_in_TE_is);
    	
    	String act_CreditNotes_in_TE_is=CreditNotes_TE_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_TE=Double.parseDouble(act_CreditNotes_in_TE_is);
    	
    	double exp_TE_total=(exp_TE_subTotal+exp_GST_TE)-(act_BonusBank_in_TE+act_CreditNotes_in_TE);
    	exp_TE_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_total));
    	
    	Assert.assertEquals(act_TE_total, exp_TE_total, "Incorrect TE Total value is displayed in Confirm & Submit page");
    	
    	return exp_TE_total;
    }
	
	@Override
    public double validation_of_TE_items_in_Confirm_Submit_page_totals_HST() {
    	double stateTaxHST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxHST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_TE_section_in_Confirm_Submit_page();
    	double item2_price=item2_price_in_TE_section_in_Confirm_Submit_page();
    	
    	double exp_TE_subTotal=item1_price+item2_price;
    	exp_TE_subTotal =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_subTotal));
    	
    	String act_TE_subTotal_is=TE_Subtotal_Confirm_Submit_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	Assert.assertEquals(act_TE_subTotal, exp_TE_subTotal, "Incorrect TE Subtotal value is displayed in Confirm & Submit page");
    	
    	double act_HST_TE=HST_TE_Confirm_Submit_page();
    	
    	double exp_HST_TE=(double)(exp_TE_subTotal * stateTaxHST) / 100;
    	exp_HST_TE =Double.parseDouble(new DecimalFormat("##.##").format(exp_HST_TE));
    	
    	Assert.assertEquals(act_HST_TE, exp_HST_TE, "Incorrect HST value is displayed in TE Confirm & Submit page");
    	
    	String act_TE_total_is=TE_Total_Confirm_Submit_page().getText().trim();
    	act_TE_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_total_is);
    	double act_TE_total=Double.parseDouble(act_TE_total_is);
    	
    	String act_BonusBank_in_TE_is=BonusBank_TE_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_BonusBank_in_TE=Double.parseDouble(act_BonusBank_in_TE_is);
    	
    	String act_CreditNotes_in_TE_is=CreditNotes_TE_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_TE=Double.parseDouble(act_CreditNotes_in_TE_is);
    	
    	double exp_TE_total=(exp_TE_subTotal+exp_HST_TE)-(act_BonusBank_in_TE+act_CreditNotes_in_TE);
    	exp_TE_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_total));
    	
    	Assert.assertEquals(act_TE_total, exp_TE_total, "Incorrect TE Total value is displayed in Confirm & Submit page");
    	
    	return exp_TE_total;
    }
	
	@Override
    public double NoTax_validation_of_TE_items_in_Confirm_Submit_page_totals_GST_QST() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_TE_section_in_Confirm_Submit_page();
    	double item2_price=item2_price_in_TE_section_in_Confirm_Submit_page();
    	
    	double exp_TE_subTotal=item1_price+item2_price;
    	exp_TE_subTotal =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_subTotal));
    	
    	String act_TE_subTotal_is=TE_Subtotal_Confirm_Submit_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	Assert.assertEquals(act_TE_subTotal, exp_TE_subTotal, "Incorrect TE Subtotal value is displayed in Confirm & Submit page");
    	
    	double act_GST_TE=GST_TE_Confirm_Submit_page();
    	double act_QST_TE=QST_TE_Confirm_Submit_page();
    	
    	double exp_GST_TE=0;
    	Assert.assertEquals(act_GST_TE, exp_GST_TE, "GST value is displayed in TE Confirm & Submit page");
    	
    	double exp_QST_TE=0;
    	Assert.assertEquals(act_QST_TE, exp_QST_TE, "QST value is displayed in TE Confirm & Submit page");
    	
    	String act_TE_total_is=TE_Total_Confirm_Submit_page().getText().trim();
    	act_TE_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_total_is);
    	double act_TE_total=Double.parseDouble(act_TE_total_is);
    	
    	String act_BonusBank_in_TE_is=BonusBank_TE_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_BonusBank_in_TE=Double.parseDouble(act_BonusBank_in_TE_is);
    	
    	String act_CreditNotes_in_TE_is=CreditNotes_TE_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_TE=Double.parseDouble(act_CreditNotes_in_TE_is);
    	
    	double exp_TE_total=(exp_TE_subTotal+exp_GST_TE+exp_QST_TE)-(act_BonusBank_in_TE+act_CreditNotes_in_TE);
    	exp_TE_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_total));
    	
    	Assert.assertEquals(act_TE_total, exp_TE_total, "Incorrect TE Total value is displayed in Confirm & Submit page");
    	
    	return exp_TE_total;
    }
	
	@Override
    public double NoTax_validation_of_TE_items_in_Confirm_Submit_page_totals_GST_PST() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_TE_section_in_Confirm_Submit_page();
    	double item2_price=item2_price_in_TE_section_in_Confirm_Submit_page();
    	
    	double exp_TE_subTotal=item1_price+item2_price;
    	exp_TE_subTotal =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_subTotal));
    	
    	String act_TE_subTotal_is=TE_Subtotal_Confirm_Submit_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	Assert.assertEquals(act_TE_subTotal, exp_TE_subTotal, "Incorrect TE Subtotal value is displayed in Confirm & Submit page");
    	
    	double act_GST_TE=GST_TE_Confirm_Submit_page();
    	double act_PST_TE=PST_TE_Confirm_Submit_page();
    	
    	double exp_GST_TE=0;
    	Assert.assertEquals(act_GST_TE, exp_GST_TE, "GST value is displayed in TE Confirm & Submit page");
    	
    	double exp_PST_TE=0;
    	Assert.assertEquals(act_PST_TE, exp_PST_TE, "PST value is displayed in TE Confirm & Submit page");
    	
    	String act_TE_total_is=TE_Total_Confirm_Submit_page().getText().trim();
    	act_TE_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_total_is);
    	double act_TE_total=Double.parseDouble(act_TE_total_is);
    	
    	String act_BonusBank_in_TE_is=BonusBank_TE_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_BonusBank_in_TE=Double.parseDouble(act_BonusBank_in_TE_is);
    	
    	String act_CreditNotes_in_TE_is=CreditNotes_TE_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_TE=Double.parseDouble(act_CreditNotes_in_TE_is);
    	
    	double exp_TE_total=(exp_TE_subTotal+exp_GST_TE+exp_PST_TE)-(act_BonusBank_in_TE+act_CreditNotes_in_TE);
    	exp_TE_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_total));
    	
    	Assert.assertEquals(act_TE_total, exp_TE_total, "Incorrect TE Total value is displayed in Confirm & Submit page");
    	
    	return exp_TE_total;
    }
	
	@Override
    public double NoTax_validation_of_TE_items_in_Confirm_Submit_page_totals_HST() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_TE_section_in_Confirm_Submit_page();
    	double item2_price=item2_price_in_TE_section_in_Confirm_Submit_page();
    	
    	double exp_TE_subTotal=item1_price+item2_price;
    	exp_TE_subTotal =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_subTotal));
    	
    	String act_TE_subTotal_is=TE_Subtotal_Confirm_Submit_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	Assert.assertEquals(act_TE_subTotal, exp_TE_subTotal, "Incorrect TE Subtotal value is displayed in Confirm & Submit page");
    	
    	double act_HST_TE=HST_TE_Confirm_Submit_page();
    	
    	double exp_HST_TE=0;
    	Assert.assertEquals(act_HST_TE, exp_HST_TE, "HST value is displayed in TE Confirm & Submit page");
    
    	String act_TE_total_is=TE_Total_Confirm_Submit_page().getText().trim();
    	act_TE_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_total_is);
    	double act_TE_total=Double.parseDouble(act_TE_total_is);
    	
    	String act_BonusBank_in_TE_is=BonusBank_TE_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_BonusBank_in_TE=Double.parseDouble(act_BonusBank_in_TE_is);
    	
    	String act_CreditNotes_in_TE_is=CreditNotes_TE_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_TE=Double.parseDouble(act_CreditNotes_in_TE_is);
    	
    	double exp_TE_total=(exp_TE_subTotal+exp_HST_TE)-(act_BonusBank_in_TE+act_CreditNotes_in_TE);
    	exp_TE_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_total));
    	
    	Assert.assertEquals(act_TE_total, exp_TE_total, "Incorrect TE Total value is displayed in Confirm & Submit page");
    	
    	return exp_TE_total;
    }
	
	@Override
    public double NoTax_validation_of_TE_items_in_Confirm_Submit_page_totals_GST() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double item1_price=item1_price_in_TE_section_in_Confirm_Submit_page();
    	double item2_price=item2_price_in_TE_section_in_Confirm_Submit_page();
    	
    	double exp_TE_subTotal=item1_price+item2_price;
    	exp_TE_subTotal =Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_subTotal));
    	
    	String act_TE_subTotal_is=TE_Subtotal_Confirm_Submit_page().getText().trim();
    	act_TE_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_subTotal_is);
    	double act_TE_subTotal=Double.parseDouble(act_TE_subTotal_is);
    	
    	Assert.assertEquals(act_TE_subTotal, exp_TE_subTotal, "Incorrect TE Subtotal value is displayed in Confirm & Submit page");
    	
    	double act_GST_TE=GST_TE_Confirm_Submit_page();
    	
    	double exp_GST_TE=0;
    	Assert.assertEquals(act_GST_TE, exp_GST_TE, "GST value is displayed in TE Confirm & Submit page");
    
    	String act_TE_total_is=TE_Total_Confirm_Submit_page().getText().trim();
    	act_TE_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_total_is);
    	double act_TE_total=Double.parseDouble(act_TE_total_is);
    	
    	String act_BonusBank_in_TE_is=BonusBank_TE_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_BonusBank_in_TE=Double.parseDouble(act_BonusBank_in_TE_is);
    	
    	String act_CreditNotes_in_TE_is=CreditNotes_TE_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_TE=Double.parseDouble(act_CreditNotes_in_TE_is);
    	
    	double exp_TE_total=(exp_TE_subTotal+exp_GST_TE)-(act_BonusBank_in_TE+act_CreditNotes_in_TE);
    	exp_TE_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_TE_total));
    	
    	Assert.assertEquals(act_TE_total, exp_TE_total, "Incorrect TE Total value is displayed in Confirm & Submit page");
    	
    	return exp_TE_total;
    }
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_GST_QST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_Total_is=TE_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	double exp_TE_Total=validation_of_TE_items_in_Confirm_Submit_page_totals_GST_QST();
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_QST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_TE_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_GST_PST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_Total_is=TE_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	double exp_TE_Total=validation_of_TE_items_in_Confirm_Submit_page_totals_GST_PST();
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_PST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_TE_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_GST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_Total_is=TE_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	double exp_TE_Total=validation_of_TE_items_in_Confirm_Submit_page_totals_GST();
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_TE_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_HST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_Total_is=TE_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	double exp_TE_Total=validation_of_TE_items_in_Confirm_Submit_page_totals_HST();
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_HST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_TE_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void NoTax_validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_GST_QST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_Total_is=TE_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	double exp_TE_Total=NoTax_validation_of_TE_items_in_Confirm_Submit_page_totals_GST_QST();
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=No_tax_validation_for_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_QST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_TE_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void NoTax_validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_GST_PST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_Total_is=TE_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	double exp_TE_Total=NoTax_validation_of_TE_items_in_Confirm_Submit_page_totals_GST_PST();
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=No_tax_validation_for_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_PST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_TE_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void NoTax_validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_HST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_Total_is=TE_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	double exp_TE_Total=NoTax_validation_of_TE_items_in_Confirm_Submit_page_totals_HST();
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=No_tax_validation_for_Shipping_Handling_section_in_Confirm_and_Submit_page_HST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_TE_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void NoTax_validation_of_OrderSummary_Totals_Shipping_and_TE_section_in_Confirm_Submit_page_GST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_TE_Total_is=TE_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	double exp_TE_Total=NoTax_validation_of_TE_items_in_Confirm_Submit_page_totals_GST();
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=No_tax_validation_for_Shipping_Handling_section_in_Confirm_and_Submit_page_GST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_TE_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}

	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_sections_in_Confirm_Submit_page_GST_QST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	double exp_SFO_Total=validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_GST_QST();
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_YTO_Total_is=YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	double exp_YTO_Total=validation_of_YTO_items_in_Confirm_Submit_page_totals_GST_QST();
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_QST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_SFO_Total+exp_YTO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_sections_in_Confirm_Submit_page_GST_PST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	double exp_SFO_Total=validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_GST_PST();
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_YTO_Total_is=YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	double exp_YTO_Total=validation_of_YTO_items_in_Confirm_Submit_page_totals_GST_PST();
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_PST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_SFO_Total+exp_YTO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_sections_in_Confirm_Submit_page_HST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	double exp_SFO_Total=validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_HST();
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_YTO_Total_is=YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	double exp_YTO_Total=validation_of_YTO_items_in_Confirm_Submit_page_totals_HST();
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_HST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_SFO_Total+exp_YTO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_sections_in_Confirm_Submit_page_GST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	double exp_SFO_Total=validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_GST();
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_YTO_Total_is=YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	double exp_YTO_Total=validation_of_YTO_items_in_Confirm_Submit_page_totals_GST();
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_SFO_Total+exp_YTO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_TE_sections_in_Confirm_Submit_page_GST_QST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	double exp_SFO_Total=validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_GST_QST();
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_YTO_Total_is=YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	double exp_YTO_Total=validation_of_YTO_items_in_Confirm_Submit_page_totals_GST_QST();
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_TE_Total_is=TE_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	double exp_TE_Total=validation_of_TE_items_in_Confirm_Submit_page_totals_GST_QST();
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_QST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_SFO_Total+exp_YTO_Total+exp_TE_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_TE_sections_in_Confirm_Submit_page_GST_PST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	double exp_SFO_Total=validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_GST_PST();
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_YTO_Total_is=YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	double exp_YTO_Total=validation_of_YTO_items_in_Confirm_Submit_page_totals_GST_PST();
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_TE_Total_is=TE_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	double exp_TE_Total=validation_of_TE_items_in_Confirm_Submit_page_totals_GST_PST();
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_PST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_SFO_Total+exp_YTO_Total+exp_TE_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_TE_sections_in_Confirm_Submit_page_HST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	double exp_SFO_Total=validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_HST();
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_YTO_Total_is=YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	double exp_YTO_Total=validation_of_YTO_items_in_Confirm_Submit_page_totals_HST();
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_TE_Total_is=TE_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	double exp_TE_Total=validation_of_TE_items_in_Confirm_Submit_page_totals_HST();
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_HST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_SFO_Total+exp_YTO_Total+exp_TE_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_SFO_YTO_TE_sections_in_Confirm_Submit_page_GST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	double exp_SFO_Total=validation_of_single_SFO_items_added_for_multiple_students_in_Confirm_Submit_page_totals_GST();
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_YTO_Total_is=YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	double exp_YTO_Total=validation_of_YTO_items_in_Confirm_Submit_page_totals_GST();
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_TE_Total_is=TE_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_TE_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_TE_Total_is);
    	double act_TE_Total=Double.parseDouble(act_TE_Total_is);
    	double exp_TE_Total=validation_of_TE_items_in_Confirm_Submit_page_totals_GST();
    	Assert.assertEquals(act_TE_Total, exp_TE_Total, "Incorrect TE Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_SFO_Total+exp_YTO_Total+exp_TE_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public double validation_of_SFO_section_Table1_single_FreePick_item_single_student_in_Confirm_Submit_page_GST_PST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double exp_SFO_table1_subTotal=0;
    	String act_SFO_table1_subTotal_is=Student1_subtotal_Table1_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_subTotal_is);
    	double act_SFO_table1_subTotal=Double.parseDouble(act_SFO_table1_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table1_subTotal, exp_SFO_table1_subTotal, "Incorrect Student subtotal value is displayed in Table1 Confirm & Submit page");
    	
    	double act_GST_SFO_Table1=GST_SFO_Table1_Confirm_Submit_page();
    	double act_PST_SFO_Table1=PST_SFO_Table1_Confirm_Submit_page();
    	
    	double exp_GST_SFO_Table1=(double)(exp_SFO_table1_subTotal * stateTaxGST) / 100;
    	exp_GST_SFO_Table1 =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_SFO_Table1));
    	
    	Assert.assertEquals(act_GST_SFO_Table1, exp_GST_SFO_Table1, "Incorrect GST value is displayed in SFO Table1 Confirm & Submit page");
    	
    	double exp_PST_SFO_Table1=(double)(exp_SFO_table1_subTotal * stateTaxPST) / 100;
    	exp_PST_SFO_Table1 =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_SFO_Table1));
    	
    	Assert.assertEquals(act_PST_SFO_Table1, exp_PST_SFO_Table1, "Incorrect PST value is displayed in SFO Table1 Confirm & Submit page");
    	
    	String act_SFO_table1_total_is=Student1_Total_Table1_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_total_is);
    	double act_SFO_table1_total=Double.parseDouble(act_SFO_table1_total_is);
    	
    	double exp_SFO_table1_total=exp_SFO_table1_subTotal+exp_GST_SFO_Table1+exp_PST_SFO_Table1;
    	exp_SFO_table1_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table1_total));
    	
    	Assert.assertEquals(act_SFO_table1_total, exp_SFO_table1_total, "Incorrect SFO Table1 Total value is displayed in Confirm & Submit page");
    	
    	String act_CreditNotes_in_SFO_is=CreditNotes_SFO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_SFO=Double.parseDouble(act_CreditNotes_in_SFO_is);
    	
    	exp_SFO_table1_total=exp_SFO_table1_total-act_CreditNotes_in_SFO;
    	exp_SFO_table1_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table1_total));
    	
    	String act_SFO_table1_Total_is=SFO_Total_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_Total_is);
    	double act_SFO_table1_Total=Double.parseDouble(act_SFO_table1_Total_is);
    	
    	Assert.assertEquals(act_SFO_table1_Total, exp_SFO_table1_total, "Incorrect SFO Total value is displayed in Confirm & Submit page");
    	
    	return exp_SFO_table1_total;
	}
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_single_FreePick_item_single_student_SFO_section_in_Confirm_Submit_page_GST_PST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	double exp_SFO_Total=validation_of_SFO_section_Table1_single_FreePick_item_single_student_in_Confirm_Submit_page_GST_PST();
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_PST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_SFO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	@Override
    public double validation_of_single_SFO_FreePick_items_added_for_multiple_students_in_Confirm_Submit_page_totals_GST_PST() {
		int stateTaxGST=TestBaseProvider.getTestBase().getTestData().getInt("stateTaxGST");
    	double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double exp_SFO_table1_subTotal=0;
    	String act_SFO_table1_subTotal_is=Student1_subtotal_Table1_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_subTotal_is);
    	double act_SFO_table1_subTotal=Double.parseDouble(act_SFO_table1_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table1_subTotal, exp_SFO_table1_subTotal, "Incorrect Student subtotal value is displayed in Table1 Confirm & Submit page");
    	
    	double act_GST_SFO_Table1=GST_SFO_Table1_Confirm_Submit_page();
    	double act_PST_SFO_Table1=PST_SFO_Table1_Confirm_Submit_page();
    	
    	double exp_GST_SFO_Table1=(double)(exp_SFO_table1_subTotal * stateTaxGST) / 100;
    	exp_GST_SFO_Table1 =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_SFO_Table1));
    	
    	Assert.assertEquals(act_GST_SFO_Table1, exp_GST_SFO_Table1, "Incorrect GST value is displayed in SFO Table1 Confirm & Submit page");
    	
    	double exp_PST_SFO_Table1=(double)(exp_SFO_table1_subTotal * stateTaxPST) / 100;
    	exp_PST_SFO_Table1 =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_SFO_Table1));
    	
    	Assert.assertEquals(act_PST_SFO_Table1, exp_PST_SFO_Table1, "Incorrect PST value is displayed in SFO Table1 Confirm & Submit page");
    	
    	String act_SFO_table1_total_is=Student1_Total_Table1_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table1_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table1_total_is);
    	double act_SFO_table1_total=Double.parseDouble(act_SFO_table1_total_is);
    	
    	double exp_SFO_table1_total=exp_SFO_table1_subTotal+exp_GST_SFO_Table1+exp_PST_SFO_Table1;
    	exp_SFO_table1_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table1_total));
    	
    	Assert.assertEquals(act_SFO_table1_total, exp_SFO_table1_total, "Incorrect SFO Table1 Total value is displayed in Confirm & Submit page");
    	
    	/////////////////////////////////////////////
    	
    	double exp_SFO_table2_subTotal=0;
    	String act_SFO_table2_subTotal_is=Student1_subtotal_Table2_SFO_Confirm_Submit_page().getText().trim();
    	act_SFO_table2_subTotal_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table2_subTotal_is);
    	double act_SFO_table2_subTotal=Double.parseDouble(act_SFO_table2_subTotal_is);
    	
    	Assert.assertEquals(act_SFO_table2_subTotal, exp_SFO_table2_subTotal, "Incorrect Student subtotal value is displayed in Table2 Confirm & Submit page");
    	
    	double act_GST_SFO_Table2=GST_SFO_Table2_Confirm_Submit_page();
    	double act_PST_SFO_Table2=PST_SFO_Table2_Confirm_Submit_page();
    	
    	double exp_GST_SFO_Table2=(double)(exp_SFO_table2_subTotal * stateTaxGST) / 100;
    	exp_GST_SFO_Table2 =Double.parseDouble(new DecimalFormat("##.##").format(exp_GST_SFO_Table2));
    	
    	Assert.assertEquals(act_GST_SFO_Table2, exp_GST_SFO_Table2, "Incorrect GST value is displayed in SFO Table2 Confirm & Submit page");
    	
    	double exp_PST_SFO_Table2=(double)(exp_SFO_table2_subTotal * stateTaxPST) / 100;
    	exp_PST_SFO_Table2 =Double.parseDouble(new DecimalFormat("##.##").format(exp_PST_SFO_Table2));
    	
    	Assert.assertEquals(act_PST_SFO_Table2, exp_PST_SFO_Table2, "Incorrect PST value is displayed in SFO Table2 Confirm & Submit page");
    	
    	String act_SFO_table2_total_is=Student1_Total_Table2_SFO_section_Confirm_Submit_page().getText().trim();
    	act_SFO_table2_total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_table2_total_is);
    	double act_SFO_table2_total=Double.parseDouble(act_SFO_table2_total_is);
    	
    	double exp_SFO_table2_total=exp_SFO_table2_subTotal+exp_GST_SFO_Table2+exp_PST_SFO_Table2;
    	exp_SFO_table2_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_table2_total));
    	
    	Assert.assertEquals(act_SFO_table2_total, exp_SFO_table2_total, "Incorrect SFO Table2 Total value is displayed in Confirm & Submit page");
    	
    	String act_CreditNotes_in_SFO_is=CreditNotes_SFO_section_Confirm_Submit_page().getAttribute("value").trim();
    	double act_CreditNotes_in_SFO=Double.parseDouble(act_CreditNotes_in_SFO_is);
    	
    	double exp_SFO_total=(exp_SFO_table1_total + exp_SFO_table2_total) - act_CreditNotes_in_SFO;
    	exp_SFO_total=Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_total));
    	
    	String act_SFO_Total_is=SFO_Total_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_total, "Incorrect SFO Total value is displayed in Confirm & Submit page");
    	
    	return exp_SFO_total;
    }
	
	@Override
    public void validation_of_OrderSummary_Totals_Shipping_and_SFO_section_with_FreePick_in_Confirm_Submit_page_GST_PST() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	double exp_SFO_Total=validation_of_single_SFO_FreePick_items_added_for_multiple_students_in_Confirm_Submit_page_totals_GST_PST();
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	double act_Shipping_Total=Shipping_and_Handling_value_in_OrderSummary_section_in_Confirm_and_Submit_page();
    	double exp_Shipping_Total=teacher_validate_Shipping_Handling_section_in_Confirm_and_Submit_page_GST_PST();
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping & Handling Total value is displayed in Order Summary section in Confirm & Submit page");
    	
    	String act_ORDER_TOTAL_is=ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	act_ORDER_TOTAL_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ORDER_TOTAL_is);
    	double act_ORDER_TOTAL=Double.parseDouble(act_ORDER_TOTAL_is);
    	double exp_ORDER_TOTAL=exp_SFO_Total+exp_Shipping_Total;
    	exp_ORDER_TOTAL=Double.parseDouble(new DecimalFormat("##.##").format(exp_ORDER_TOTAL));
    	Assert.assertEquals(act_ORDER_TOTAL, exp_ORDER_TOTAL, "Incorrect ORDER_TOTAL value is displayed in Order Summary section in Confirm & Submit page");
    	
	}
	
	//############################################################# SCSCOD-7622 ###############################################################
    private static int[] numSavedCards;
    
    @FindBy(locator = "dw.checkout.shippingandpayment.payment.drp.SelectACard")
    private List<WebElement> lst_drpSelectaCard;
    
    @FindBy(locator="dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.chk.savecard")
    private WebElement payment_save_credit_card_checkbox;
    
    @FindBy(locator = "dw.checkout.shippingandpayment.btn.continuecheckout")
    private WebElement btnContinueCheckout;
    
    @FindBy(locator = "dw.checkout.shippingandpayment.payment.drp.paymentmethod")
    private WebElement drpPaymentMethod;
    
    @FindBy(locator = "dw.checkout.confirm.submit.payments.step.header.link")
    private WebElement payment_step_header;
    
    @FindBy(locator = "dw.CSR.checkout.payment.saved.credit.card.remove.link")
    private WebElement payment_saved_CC_card_remove_link;
    
    @FindBy(locator = "dw.checkout.shippingandpayment.payment.cardcheckcombo.txt.checkamount")
    private WebElement payment_CC_cheque_combo_cheque_amt_txtbox;
    
    @FindBy(locator = "dw.checkout.payment.saved.credit.card.information.container")
    private WebElement payment_saved_CC_information_container;
    
    @FindBy(locator = "dw.CSR.checkout.payment.saved.credit.card.remove.link.YES.button")
    private WebElement payment_saved_CC_remove_link_YES_button;
    
    @FindBy(locator = "dw.CSR.checkout.payment.saved.credit.card.remove.link.NO.button")
    private WebElement payment_saved_CC_remove_link_NO_button;
    
    public WebElement payment_saved_CC_remove_link_YES_button(){
        return payment_saved_CC_remove_link_YES_button;
    }
    
    public WebElement payment_saved_CC_remove_link_NO_button(){
        return payment_saved_CC_remove_link_NO_button;
    }
    
    public WebElement payment_saved_CC_information_container(){
        return payment_saved_CC_information_container;
    }
    
    public WebElement payment_CC_cheque_combo_cheque_amt_txtbox(){
        return payment_CC_cheque_combo_cheque_amt_txtbox;
    }
    
    public WebElement payment_saved_CC_card_remove_link(){
        return payment_saved_CC_card_remove_link;
    }
    
    public WebElement payment_step_header(){
        return payment_step_header;
    }
    
    public WebElement drpPaymentMethod(){
        return drpPaymentMethod;
    }
    
    public WebElement btnContinueCheckout(){
        return btnContinueCheckout;
    }
    
    public WebElement payment_save_credit_card_checkbox(){
        return payment_save_credit_card_checkbox;
    }
    
    public List<WebElement> lst_drpSelectaCard(){
        return lst_drpSelectaCard;
    }
    
    public void set_num_saved_cards(int amt, int pos){
        
        if(numSavedCards == null){
            numSavedCards = new int[4];
        }
        
        numSavedCards[pos] = amt;
    }
    
    public int get_num_saved_cards(int pos){
        return numSavedCards[pos];
    }
    
    @Override
    public void select_a_saved_credit_card() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        int selectACard_dropdown_length = lst_drpSelectaCard().size();
        Boolean save_card_chkbox = Boolean.parseBoolean(payment_save_credit_card_checkbox().getAttribute("checked"));
        Boolean cheque_amt_txtbox_exists = payment_CC_cheque_combo_cheque_amt_txtbox().isDisplayed();
        
        if(selectACard_dropdown_length == 1){
            fill_new_CreditCard();
            
            if(!save_card_chkbox){
                payment_save_credit_card_checkbox().click();
            }
            
            PauseUtil.pause(1000);
            if(cheque_amt_txtbox_exists){
                payment_CC_cheque_combo_cheque_amt_txtbox().click();
                payment_CC_cheque_combo_cheque_amt_txtbox().sendKeys(Keys.TAB);
                PauseUtil.pause(1000);
            }
            
            WaitUtils.waitForEnabled(btnContinueCheckout());
            SCHUtils.clickUsingJavaScript(btnContinueCheckout());
            
            PauseUtil.pause(1000);
            SCHUtils.clickUsingJavaScript(payment_step_header());
            
            PauseUtil.pause(1000);
            SCHUtils.selectOptionsByVisibleText(drpPaymentMethod(), ConstantUtils.CREDITCARD);
            
            PauseUtil.pause(1000);
        }
        
        lst_drpSelectaCard().get(selectACard_dropdown_length - 1).click();
        
        String arr_position = TestBaseProvider.getTestBase().getTestData().getString("DataLocation");
        set_num_saved_cards(selectACard_dropdown_length, Integer.parseInt(arr_position));
    }
    
    @Override
    public void teacher_does_not_see_remove_link_for_saved_card() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        Boolean credit_card_remove_link_exists = payment_saved_CC_card_remove_link().isDisplayed();
        
        Assert.assertFalse(credit_card_remove_link_exists, "Remove link for saved credit card is displayed");
    }
    
    @Override
    public void CSR_sees_saved_card_PAYMENT(){
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        Boolean saved_CC_layer_is_displayed = payment_saved_CC_information_container().isDisplayed();
        
        Assert.assertTrue(saved_CC_layer_is_displayed, "Saved Credit Card information is not displayed");
    }

    @Override
    public void CSR_selects_NO_on_delete_modal_remove_link_PAYMENT(){
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        SCHUtils.clickUsingJavaScript(payment_saved_CC_remove_link_NO_button());
    }

    @Override
    public void CSR_does_not_see_deleted_saved_card_PAYMENT(){
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        String arr_position = TestBaseProvider.getTestBase().getTestData().getString("DataLocation");
        int act_result = lst_drpSelectaCard().size();
        int exp_result = get_num_saved_cards(Integer.parseInt(arr_position));
        
        Assert.assertNotEquals(act_result, exp_result, "The saved credit card was not deleted");
    }

    @Override
    public void CSR_selects_YES_on_delete_modal_remove_link_PAYMENT(){
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        SCHUtils.clickUsingJavaScript(payment_saved_CC_remove_link_YES_button());
    }

    @Override
    public void CSR_selects_remove_link_for_saved_credit_card_PAYMENT(){
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        SCHUtils.clickUsingJavaScript(payment_saved_CC_card_remove_link());
    }
    //############################################################# SCSCOD-7622 ###############################################################

    
    
    
    public double SFO_Total_Rewards_Page() {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_Rewards_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
		return act_SFO_Total;
	}
    
    /*public double Shipping_Total_Rewards_Page() {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
    	
    	String act_Shipping_Total_is=Shipping_Total_Rewards_page().getText().trim();
    	act_Shipping_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Total_is);
    	double act_Shipping_Total=Double.parseDouble(act_Shipping_Total_is);
		return act_Shipping_Total;
	}*/
    
    @Override
    public void validate_SFO_Total_after_redeem_creditNotes_in_Rewards_page(double SFO_Total_Val) {
    	double SFO_creditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double act_SFO_Total=SFO_Total_Val;
    	System.out.println("###########:"+act_SFO_Total);
    	
    	String exp_SFO_Total_is=SFO_Total_Rewards_page().getText().trim();
    	exp_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(exp_SFO_Total_is);
    	double exp_SFO_Total=Double.parseDouble(exp_SFO_Total_is);
    	exp_SFO_Total=(exp_SFO_Total)+(SFO_creditNotes);
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO total value is displayed in Rewards page");
    	
	}
    
    @Override
    public void teacher_applies_BonusBank_for_Shipping_section_in_Rewards_page() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	if (list_btn_EDIT_Shipping_section_Rewards_page().size() !=0) {
    		btn_EDIT_Shipping_section_Rewards_page().click();
    		PauseUtil.waitForAjaxToComplete(2500);
        	PauseUtil.pause(1000);
		} else {
			System.out.println("Button state is : APPLY");
		}
    	BonusBank_Shipping_section_Confirm_Submit_page().click();
    	BonusBank_Shipping_section_Confirm_Submit_page().clear();
    	BonusBank_Shipping_section_Confirm_Submit_page().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("BonusBank"));
    	PauseUtil.pause(1000);
    	btn_APPLY_Shipping_section_Rewards_page().click();
    	
	}
    
    @Override
    public void teacher_applies_CreditNotes_for_Shipping_section_in_Rewards_page() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	if (list_btn_EDIT_Shipping_section_Rewards_page().size() !=0) {
    		btn_EDIT_Shipping_section_Rewards_page().click();
    		PauseUtil.waitForAjaxToComplete(2500);
        	PauseUtil.pause(1000);
		} else {
			System.out.println("Button state is : APPLY");
		}
    	CreditNotes_Shipping_section_Confirm_Submit_page().click();
    	CreditNotes_Shipping_section_Confirm_Submit_page().clear();
    	CreditNotes_Shipping_section_Confirm_Submit_page().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("CreditNotes"));
    	PauseUtil.pause(1000);
    	btn_APPLY_Shipping_section_Rewards_page().click();
    	
	}
    
    @Override
    public void teacher_applies_CreditNotes_for_SFO_section_in_Rewards_page_and_validate_Total() {
    	double SFO_creditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_Rewards_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
		
    	teacher_applies_CreditNotes_for_SFO_section_in_Rewards_page();
    	
    	String exp_SFO_Total_is=SFO_Total_Rewards_page().getText().trim();
    	exp_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(exp_SFO_Total_is);
    	double exp_SFO_Total=Double.parseDouble(exp_SFO_Total_is);
    	exp_SFO_Total=(exp_SFO_Total)+(SFO_creditNotes);
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO total value is displayed in Rewards page");
    	
	}
    
    @Override
    public void teacher_applies_BBank_CNotes_for_Shipping_section_in_Rewards_page_and_validate_Total() {
    	double Shipping_BonusBank=TestBaseProvider.getTestBase().getTestData().getDouble("BonusBank");
    	double Shipping_CreditNotes=TestBaseProvider.getTestBase().getTestData().getDouble("CreditNotes");
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_Shipping_Total_is=Shipping_Total_Rewards_page().getText().trim();
    	act_Shipping_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Total_is);
    	double act_Shipping_Total=Double.parseDouble(act_Shipping_Total_is);
		
    	teacher_applies_BonusBank_for_Shipping_section_in_Rewards_page();
    	teacher_applies_CreditNotes_for_Shipping_section_in_Rewards_page();
    	
    	String exp_Shipping_Total_is=Shipping_Total_Rewards_page().getText().trim();
    	exp_Shipping_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(exp_Shipping_Total_is);
    	double exp_Shipping_Total=Double.parseDouble(exp_Shipping_Total_is);
    	exp_Shipping_Total=(exp_Shipping_Total)+(Shipping_BonusBank)+(Shipping_CreditNotes);
    	exp_Shipping_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Shipping_Total));
    	
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping total value is displayed in Rewards page");
    	
	}
    
    @Override
    public void teacher_applies_CreditNotes_equal_as_SFO_section_in_Rewards_page_and_validate_Total() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_SFO_Total_is=SFO_Total_Rewards_page().getText().trim();
    	act_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_SFO_Total_is);
    	double act_SFO_Total=Double.parseDouble(act_SFO_Total_is);
    	
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	if (lst_btn_EDIT_SFO_section_Rewards_page().size() !=0) {
    		btn_EDIT_SFO_section_Rewards_page().click();
    		PauseUtil.waitForAjaxToComplete(2500);
        	PauseUtil.pause(1000);
		} else {
			System.out.println("Button state is : APPLY");
		}
    	fld_Credit_Notes_SFO_section_Rewards_page().click();
    	fld_Credit_Notes_SFO_section_Rewards_page().clear();
    	fld_Credit_Notes_SFO_section_Rewards_page().sendKeys(act_SFO_Total_is);
    	PauseUtil.pause(1000);
    	btn_APPLY_SFO_section_Rewards_page().click();
    	
    	/*String exp_SFO_Total_is=SFO_Total_Rewards_page().getText().trim();
    	exp_SFO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(exp_SFO_Total_is);
    	double exp_SFO_Total=Double.parseDouble(exp_SFO_Total_is);
    	exp_SFO_Total=(exp_SFO_Total)+(SFO_creditNotes);
    	exp_SFO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_SFO_Total));
    	
    	Assert.assertEquals(act_SFO_Total, exp_SFO_Total, "Incorrect SFO total value is displayed in Rewards page");*/
    	
	}
    
    @Override
    public void teacher_applies_BBank_CNotes_equal_as_Shipping_section_in_Rewards_page_and_validate_Total() {
		PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_Shipping_Total_is=Shipping_Total_Rewards_page().getText().trim();
    	act_Shipping_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_Shipping_Total_is);
    	double act_Shipping_Total=Double.parseDouble(act_Shipping_Total_is);
    	act_Shipping_Total=act_Shipping_Total/2;
    	act_Shipping_Total =Double.parseDouble(new DecimalFormat("##.##").format(act_Shipping_Total));
    	String act_Shipping_Total_2=String.valueOf(act_Shipping_Total);
		
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	if (list_btn_EDIT_Shipping_section_Rewards_page().size() !=0) {
    		btn_EDIT_Shipping_section_Rewards_page().click();
    		PauseUtil.waitForAjaxToComplete(2500);
        	PauseUtil.pause(1000);
		} else {
			System.out.println("Button state is : APPLY");
		}
    	BonusBank_Shipping_section_Confirm_Submit_page().click();
    	BonusBank_Shipping_section_Confirm_Submit_page().clear();
    	BonusBank_Shipping_section_Confirm_Submit_page().sendKeys(act_Shipping_Total_2);
    	PauseUtil.pause(1000);
    	btn_APPLY_Shipping_section_Rewards_page().click();
    	
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
		
    	if (list_btn_EDIT_Shipping_section_Rewards_page().size() !=0) {
    		btn_EDIT_Shipping_section_Rewards_page().click();
    		PauseUtil.waitForAjaxToComplete(2500);
        	PauseUtil.pause(1000);
		} else {
			System.out.println("Button state is : APPLY");
		}
    	CreditNotes_Shipping_section_Confirm_Submit_page().click();
    	CreditNotes_Shipping_section_Confirm_Submit_page().clear();
    	CreditNotes_Shipping_section_Confirm_Submit_page().sendKeys(act_Shipping_Total_2);
    	PauseUtil.pause(1000);
    	btn_APPLY_Shipping_section_Rewards_page().click();
    	
    	/*String exp_Shipping_Total_is=Shipping_Total_Rewards_page().getText().trim();
    	exp_Shipping_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(exp_Shipping_Total_is);
    	double exp_Shipping_Total=Double.parseDouble(exp_Shipping_Total_is);
    	exp_Shipping_Total=(exp_Shipping_Total)+(Shipping_BonusBank)+(Shipping_CreditNotes);
    	exp_Shipping_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_Shipping_Total));
    	
    	Assert.assertEquals(act_Shipping_Total, exp_Shipping_Total, "Incorrect Shipping total value is displayed in Rewards page");
    	*/
	}
    
    @Override
    public void validate_YTO_Total_with_DTS_topOff_with_Tax_in_Rewards_page(double YTO_Total_Val) {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String act_YTO_Total_is=YTO_Total_Rewards_page().getText().trim();
    	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
    	double act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
    	
    	CheckoutPage checkoutPage=new CheckoutPage();
    	double Exceeded_Amt=checkoutPage.Total_DTS_exceeded_payable_amt_with_taxes();
    	
    	double exp_YTO_Total=YTO_Total_Val+Exceeded_Amt;
    	exp_YTO_Total =Double.parseDouble(new DecimalFormat("##.##").format(exp_YTO_Total));
    	
    	Assert.assertEquals(act_YTO_Total, exp_YTO_Total, "Incorrect YTO total value is displayed in Rewards page");
    	
	}
    
    public double YTO_Total_Rewards_Page() {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        Double act_YTO_Total=null;
  
        try {
        	YTO_Total_Rewards_page().isDisplayed();
        	String act_YTO_Total_is=YTO_Total_Rewards_page().getText().trim();
        	act_YTO_Total_is=SFO_page.delete_US_or_Canada_dollar_for_the_value(act_YTO_Total_is);
        	act_YTO_Total=Double.parseDouble(act_YTO_Total_is);
		} catch (Exception e) {
			act_YTO_Total=(double) 0;
		}
		return act_YTO_Total;
	}
    
    @Override
	public void CSR_submit_the_Order_and_closes_confirmation_popup() {
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(1000);
		btnSubmitInSubmitPage().click();
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(10000);
		SCHUtils.clickUsingJavaScript(btn_close_order_Confirmation_popup());
	}
    
    @Override
    public void validate_No_taxes_are_displayed_for_YTO_section_in_Payment_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String exp_val=fld_YTO_subtotal_Payments_page().getText().trim();
    	String act_val=fld_YTO_Total_Payments_page().getText().trim();
    	
    	Assert.assertEquals(act_val, exp_val, "Taxes are shown for YTO section in Payments page");
    	
    	String act_YTO_Tot_val=header_BlueBar_StudentClub_PostAmount_items_payment().getText().trim();
    	Assert.assertEquals(act_YTO_Tot_val, act_val, "Incorrect YTO total value is displayed in Payments page");
    }
    
    @Override
    public void validate_No_taxes_are_displayed_for_TE_section_in_Payment_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	String exp_val=fld_TE_subtotal_Payments_page().getText().trim();
    	String act_val=fld_TE_Total_Payments_page().getText().trim();
    	
    	Assert.assertEquals(act_val, exp_val, "Taxes are shown for TE section in Payments page");
    	
    	String act_TE_Tot_val=header_BlueBar_TeacherCatalogues_PostAmount_items_payment().getText().trim();
    	Assert.assertEquals(act_TE_Tot_val, act_val, "Incorrect TE total value is displayed in Payments page");
    }
    
    @Override
    public void validate_nobalance_inpaymentsection_inconfirmpages(){
    	String act_nobalancemsg = getsection_payment_nobalance_confirmpages().getText().trim();
    	Assert.assertEquals(act_nobalancemsg, ConstantUtils.NOBALANCEMSG_PAYMENTSECTION_CONFIRMATIONPAGES, 
    			"Payment section does not show no balance message in confirmation pages");
    }
	
	
	
}
