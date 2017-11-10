package com.dw.automation.pages.impl;
import static com.dw.automation.pages.base.PageFactory.getFactory;
import static com.dw.automation.support.SCHUtils.findElement;
import static com.scholastic.torque.common.AssertUtils.assertDisplayed;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.configuration.Configuration;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.hamcrest.Matchers;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.dw.automation.beans.ProductInfoBean;
import com.dw.automation.beans.UserProfileBean;
import com.dw.automation.pages.ICartPage;
import com.dw.automation.pages.ICheckoutPage;
import com.dw.automation.pages.ICheckoutPage_2;
import com.dw.automation.pages.IConfirmAndSubmitOrder;
import com.dw.automation.pages.IStudentFlyerOrdersPage;
import com.dw.automation.sections.ICouponSection;
import com.dw.automation.sections.ICreditCardAndBillingInfoSection;
import com.dw.automation.sections.IProductOrderSummarySection;
import com.dw.automation.sections.base.SectionFactory;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.DMClient;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.LocatorUtils;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;
import com.scholastic.torque.common.WaitUtils;
import com.scholastic.torque.webdriver.ExtendedElement;

public class CheckoutPage extends BaseTestPage<TestPage> implements ICheckoutPage {
    ShippingAndPayment shippingAndPayment = new ShippingAndPayment();
    ExcelLibrary ExLib=new ExcelLibrary();
    
    @FindBy(locator = "dw.checkout.rewardsandcoupons.paperbonuscoupons.input")
    private WebElement inputPaperBonusCouponsTextField;
    
    @FindBy(locator = "dw.checkout.rewardsandcoupons.paperbonuscoupons.student.input")
    private WebElement inputPaperBonusCouponsForStudentTextField;

    public WebElement getinputPaperBonusCouponsTextField() {
        return inputPaperBonusCouponsTextField;
    }
    
    public WebElement getinputPaperBonusCouponsForStudentTextField(){
    	return inputPaperBonusCouponsForStudentTextField;
    }

    @FindBy(locator = "dw.checkout.rewardsandcoupons.bonuscoupons.input")
    private WebElement inputBonusCouponsTextField;

    public WebElement getinputBonusCouponsTextField() {
        return inputBonusCouponsTextField;
    }
    @FindBy(locator = "dw.checkout.rewardsandcoupons.teacherbonuscoupons.input")
    private WebElement inputTeacherBonusCouponsTextField;

    public WebElement getinputTeacherBonusCouponsTextField() {
        return inputTeacherBonusCouponsTextField;
    }

    @FindBy(locator = "dw.checkout.rewardsandcoupons.bonuspoint.icon.plus")
    private WebElement btnExpandOnBonusPointSection;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.bonusbank.input")
    private WebElement inputBonusBankTextField;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.bonusbank.shipping.input")
    private WebElement inputBonusBankShippingTextField;
    
    
    @FindBy(locator = "dw.checkout.rewardsandcoupons.lbl.InvalidPostalCodeErrorMessage")
    private WebElement getLblInvalidPostalCodeErrorMessage;
    
    @FindBy(locator = "dw.teacher.coupon.popup.select.grade")
    private WebElement selectGrade;
    
    @FindBy(locator = "dw.checkout.fld.Credit.Notes.SFO.section.Rewards.page")
    private WebElement creditenotes_SFO_RewardsPage;

    public WebElement getCreditNotesSFO() {
        return creditenotes_SFO_RewardsPage;
    }
    
    public WebElement getinputBonusBankTextField() {
        return inputBonusBankTextField;
    }

    public WebElement getinputBonusBankShippingTextField() {
        return inputBonusBankShippingTextField;
    }


    public WebElement getSelectGrade() {
        return selectGrade;
    }
    
    
    public WebElement getLblInvalidPostalCodeErrorMessage() {
        return getLblInvalidPostalCodeErrorMessage;
    }


    @FindBy(locator = "dw.checkout.rewardsandcoupons.bonuspoint.icon.minus")
    private WebElement btnCollapseOnBonusPointSection;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.bonuspoint.section")
    private WebElement bonusPointSection;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.dollarspend.btn.makeselection")
    private WebElement btnMakeYourSelection;
    
    @FindBy(locator = "dw.checkout.rewardsandcoupons.dollarspend.btn.makeselection")
    private List<WebElement> list_btnMakeYourSelection;



    public WebElement getBtnMakeYourSelection() {
        return btnMakeYourSelection;
    }
    
    public List<WebElement> list_btnMakeYourSelection() {
        return list_btnMakeYourSelection;
    }

    @FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.lnk.edit")
    private WebElement lnkEditOnDollarToSpendSection;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.freepick.lnk.edit")
    private WebElement lnkEditOnFreePickCouponSection;

    public WebElement getLnkEditOnDollarToSpendSection() {
        return lnkEditOnDollarToSpendSection;
    }

    public WebElement getlnkEditOnFreePickCouponSection() {
        return lnkEditOnFreePickCouponSection;
    }

    @FindBy(locator = "dw.checkout.rewardsandcoupons.dollarspend.lbl.rewarddetail")
    private WebElement lblRewardDetailOnDollarToSpendSection;


    @FindBy(locator = "dw.checkout.rewardsandcoupons.dollarspend.lbl.rewarddetail.header.dtsmodel")
    private WebElement lblRewardDetailOnDollarToSpendSection_header_dtsmodel;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.dollarspend.lbl.rewarddetail.selectedarea")
    private WebElement lblRewardDetailOnDollarToSpendSelectedArea;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.dollarspend.lbl.rewarddetail.quantity.submitpage")
    private WebElement lblRewardDetailOnDollarToSpendQuantitySubmitOrderPage;


    @FindBy(locator = "dw.checkout.lbl.subtitle")
    private WebElement lblPageSubTitle;

    @FindBy(locator = "dw.checkoout.wavetrust.popup.img.logo")
    private WebElement imgWaveTrustIconLogoonPopUp;

    @FindBy(locator = "dw.checkout.btn.returntoshop")
    private WebElement btnReturnToShop;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.tab.activerewardstab")
    private WebElement activeRewardsTabBlue;

    @FindBy(locator = "dw.checkout.shippingandpayment.tab.activeshippingtab")
    private WebElement activeShippingTabBlue;

    @FindBy(locator = "dw.checkout.confirmandsubmitorder.tab.activesubmittab")
    private WebElement activeSubmitTabBlue;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.tab.unactivecompletedrewardstab")
    private WebElement InActiveCompletedRewardsTab;

    @FindBy(locator = "dw.checkout.confirmandsubmitorder.tab.unactivecompletedsubmittab")
    private WebElement InActiveSubmitTab;

    @FindBy(locator = "dw.checkout.shippingandpayment.payment.paypal.frm.login")
    private WebElement frmPayPalLogin;

    @FindBy(locator = "dw.checkout.shippingandpayment.payment.paypal.txt.email")
    private WebElement txtPayPalEmail;

    @FindBy(locator = "dw.checkout.shippingandpayment.payment.paypal.txt.password")
    private WebElement txtPayPalPassword;

    @FindBy(locator = "dw.checkout.shippingandpayment.payment.paypal.btn.login")
    private WebElement btnPayPalLogin;

    @FindBy(locator = "dw.checkout.shippingandpayment.payment.paypal.btn.agreeandcontinue")
    private WebElement btnPayPalAgreeAndContinue;

    @FindBy(locator = "dw.checkout.lbl.checkout")
    private WebElement lblCheckout;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.lbl.couponcode")
    private WebElement lblCouponCode;

    @FindBy(locator = "dw.checkout.shippingandpayment.payment.paypal.btn.continue")
    private WebElement btnPayPalContinue;

    @FindBy(locator = "dw.teacher.rewardsandcoupons.coupon.popup.parent.couponmodal")
    private WebElement couponsModel;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.lbl.couponitemsdescription")
    private WebElement lblCouponItemsDescription;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.lbl.invisibleremovecoupon")
    private WebElement lblInVisibleRemoveCouponPopUp;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.lbl.visibleremovecoupon")
    private WebElement lblVisibleRemoveCouponPopUp;

    @FindBy(locator = "dw.chekkout.orderdetail.lbl.ordernumber")
    private WebElement lblOrderNumber;

    @FindBy(locator = "dw.chekkout.orderdetail.lbl.orderstatus")
    private WebElement lblOrderStatus;

    @FindBy(locator = "dw.chekkout.orderdetail.lbl.orderdate")
    private WebElement lblOrderDate;

    @FindBy(locator = "dw.checkout.orderconfirmation.duedate.lnk.set")
    private WebElement lnkDueDateSet;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.makeselection.lnk.close")
    private WebElement iconclose;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.makeselection.lnk.cancel")
    private WebElement lnkcouponpopupcancel;;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.makeselection")
    private WebElement btnMakeSelectionFpf;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.chk.makeselection")
    private List<WebElement> chkbtnMakeSelectionFpf;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.section.freepick.flat.promotion")
    private WebElement sectionFpfPromotions;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.section.lbl.rewards.description")
    private WebElement lblFpfPromotionDescription;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.dts.lnk.edit")
    private WebElement lnkDTSEdit;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.skip1")
    private WebElement btnSkip1;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.skip2")
    private WebElement btnSkip2;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.skip3")
    private WebElement btnSkip3;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.Expand.Shipping")
    private WebElement btnExpand_Shipping;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.Expand.2nd")
    private WebElement btnExpand_2;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.Expand.3rd")
    private WebElement btnExpand_3;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.Dollars.To.Spend")
    private WebElement fld_Dollars_To_Spend_Coupons_Rewards;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.Selection.Grade.level.inPopUp")
    private WebElement Selection_Grade_level_inPopUp_Coupons_Rewards;


	@FindBy(locator = "dw.checkout.items.price.Make.Selection.Window")
    private List<WebElement> items_price_Make_Selection_Window;

    @FindBy(locator = "dw.checkout.items.price.FreeItem.Modal.Window")
    private List<WebElement> items_price_FreeItem_Modal_Window;

    @FindBy(locator = "dw.checkout.selected.items.list.DTS.modal.window.Redemptions.Rewards.Page")
    private List<WebElement> selected_items_list_DTS_modal_window_Redemptions_Rewards_Page;

    @FindBy(locator = "dw.checkout.grade.names.Modal.Window.dropDown")
    private List<WebElement> grade_names_Modal_Window_dropDown;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.data.To.Check.By.Grade.Level")
    private WebElement data_To_Check_By_Grade_Level_Coupons_Rewards;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.select.item1.MakeYourSelection")
    private WebElement select_item1_MakeYourSelection;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.selected.item.Section.MakeYourSelection")
    private WebElement selected_item_Section_MakeYourSelection;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.data.To.Check.By.Results.Text")
    private WebElement data_To_Check_By_Results_Text_Coupons_Rewards;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.StudentClub.BonusBank")
    private WebElement fld_StudentClub_BonusBank;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.StudentClub.btn.EDIT")
    private WebElement fld_StudentClub_btn_EDIT;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.TeacherCat.btn.EDIT")
    private WebElement fld_TeacherCat_btn_EDIT;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.ShippingFee.btn.EDIT")
    private WebElement fld_ShippingFee_btn_EDIT;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.StudentClub.PaperBonus")
    private WebElement fld_StudentClub_PaperBonus;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.TeacherCat.BonusBank")
    private WebElement fld_TeacherCat_BonusBank;

    @FindBy(locator = "dw.checkout.payment.blueBar.value.StudentClubSubTot")
    private WebElement blueBar_value_StudentClubSubTot_Payment;

    @FindBy(locator = "dw.checkout.payment.chkBox.pop.1st.Sname")
    private WebElement chkBox_pop_1st_Sname_Payment;

    @FindBy(locator = "dw.checkout.payment.amt.pop.1st.Sname")
    private WebElement amt_pop_1st_Sname_Payment;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.TeacherCat.PaperBonus")
    private WebElement fld_TeacherCat_PaperBonus;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.Shipping.BonusBank")
    private WebElement fld_Shipping_BonusBank;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.Shipping.PaperBonus")
    private WebElement fld_Shipping_PaperBonus;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.Enter.CouponCode")
    private WebElement fld_Enter_CouponCode_RewardsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.close.TGAT.coupon")
    private WebElement btn_close_TGAT_coupon;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.NO.to.delete.TGAT.coupon")
    private WebElement btn_NO_to_delete_TGAT_coupon;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.TGAT.coupon.in.Coupons.Applied.section")
    private WebElement TGAT_coupon_in_Coupons_Applied_section;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.YES.to.delete.TGAT.coupon")
    private WebElement btn_YES_to_delete_TGAT_coupon;
    
    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.YES.to.delete.TGAT.coupon.CSR")
    private WebElement btn_YES_to_delete_TGAT_coupon_CSR;
   
    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.NO.to.delete.TGAT.coupon.CSR")
    private WebElement btn_NO_to_delete_TGAT_coupon_CSR;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.link.click.here.to.enter.the.ref.teacher.TGAT")
    private WebElement link_click_here_to_enter_the_ref_teacher_TGAT;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.Teacher.CustNum.TGAT.Modal.window")
    private WebElement fld_Teacher_CustNum_TGAT_Modal_window;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.button.close.the.TGAT.modal.window")
    private WebElement button_close_the_TGAT_modal_window;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.Teacher.Fname.TGAT.Modal.window")
    private WebElement fld_Teacher_Fname_TGAT_Modal_window;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.Teacher.Lname.TGAT.Modal.window")
    private WebElement fld_Teacher_Lname_TGAT_Modal_window;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.Submit.TGAT.Modal.window")
    private WebElement btn_Submit_TGAT_Modal_window;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.delete.SelectedItem.Modal.Selection.window")
    private WebElement delete_SelectedItem_Modal_Selection_window;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.close.btn.Modal.Selection.window")
    private WebElement close_btn_Modal_Selection_window;

    @FindBy(locator = "dw.teacher.couponsrewards.rewards.manual.freepickcoupon")
    private WebElement coupon_rewardscoupons_freepickcoupon;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.EDIT.Selected.Item.Modal.Selection.window")
    private WebElement EDIT_Selected_Item_in_Modal_window;

    @FindBy(locator = "dw.checkout.fld.selected.item.num.MakeSelection.Window")
    private WebElement fld_selected_item_num_MakeSelection_Window;

    @FindBy(locator = "dw.checkout.fld.selected.item.Title.MakeSelection.Window")
    private WebElement fld_selected_item_Title_MakeSelection_Window;

    @FindBy(locator = "dw.checkout.fld.selected.item.Flyer.MakeSelection.Window")
    private WebElement fld_selected_item_Flyer_MakeSelection_Window;

    @FindBy(locator = "dw.checkout.fld.selected.item.num.YourSelection.Window")
    private WebElement fld_selected_item_num_YourSelection_Window;
    
    @FindBy(locator = "dw.checkout.fld.selected.FreePick.item.num.YourSelection.Window")
    private WebElement fld_selected_FreePick_item_num_YourSelection_Window;

    @FindBy(locator = "dw.checkout.fld.selected.item.Title.YourSelection.Window")
    private WebElement fld_selected_item_Title_YourSelection_Window;

    @FindBy(locator = "dw.checkout.fld.selected.item.Flyer.YourSelection.Window")
    private WebElement fld_selected_item_Flyer_YourSelection_Window;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.EDIT.Selected.Item.Modal.Selection.window")
    private List<WebElement> SIZE_EDIT_Selected_Item_in_Modal_window;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.delete.SelectedItem.data.Modal.Selection.window")
    private WebElement SelectedItem_data_Modal_Selection_window;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.disappear.ConfirmSubmit.Modal.Selection.window")
    private WebElement disappear_ConfirmSubmit_Modal_Selection_window;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.Search.fld.MakeYourSelection.window")
    private WebElement Search_fld_MakeYourSelection_window;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.Search.btn.MakeYourSelection.window")
    private WebElement Search_btn_MakeYourSelection_window;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.empty.data.search.results.MakeYourSelection.window")
    private WebElement empty_data_search_results_MakeYourSelection_window;
    
    @FindBy(locator = "dw.checkout.section.BonusFlat.description.rewards.page")
    private WebElement section_BonusFlat_description_rewards_page;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.spellscholasticdisplay")
    private WebElement spellscholasticSectionDispaly;


    @FindBy(locator = "dw.checkout.rewardsandcoupons.msg.upseller")
    private WebElement msg_upseller_RewardsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.delete.coupon")
    private WebElement delete_coupon_in_RewardsPage;
    
    @FindBy(locator = "dw.checkout.TCOD.YES.to.delete.applied.coupon")
    private WebElement TCOD_YES_to_delete_applied_coupon;
    
    @FindBy(locator = "dw.checkout.fld.coupon.val.in.ConfirmSubmit.Coupons.section")
    private WebElement fld_coupon_val_in_ConfirmSubmit_Coupons_section;
    
    @FindBy(locator = "dw.checkout.TCOD.NO.to.delete.applied.coupon")
    private WebElement TCOD_NO_to_delete_applied_coupon;

    @FindBy(locator = "dw.checkout.btn.delete.selected.item.FreeItem.window.in.RewardsPage")
    private WebElement btn_delete_selected_item_FreeItem_window_in_RewardsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.YES.to.delete.coupon")
    private WebElement YES_to_delete_coupon_RewardsPage;

    @FindBy(locator = "dw.checkout.CSR.YES.to.delete.selected.item.DTS.window")
    private WebElement CSR_YES_to_delete_selected_item_DTS_window;

    @FindBy(locator = "dw.checkout.CSR.NO.to.delete.selected.item.DTS.window")
    private WebElement CSR_NO_to_delete_selected_item_DTS_window;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.NO.to.delete.coupon")
    private WebElement NO_to_delete_coupon_RewardsPage;

    @FindBy(locator = "dw.checkout.TopOff.msg.DTS.modal.window.Redemptions.Page")
    private WebElement TopOff_msg_DTS_modal_window_Redemptions_Page;

    @FindBy(locator = "dw.checkout.CSR.callout.section.for.delete.item.DTS.window")
    private WebElement CSR_callout_section_for_delete_item_DTS_window;

    @FindBy(locator = "dw.checkout.Selected.item.TickMark.DTS.modal.window.Redemptions.Page")
    private WebElement Selected_item_TickMark_DTS_modal_window_Redemptions_Page;

    @FindBy(locator = "dw.checkout.Callout.msg.delete.item.DTS.modal.window.Redemptions.Page")
    private WebElement Callout_msg_delete_item_DTS_modal_window_Redemptions_Page;

    @FindBy(locator = "dw.checkout.selected.first.item.price.Your.current.selection.list.DTS.window")
    private WebElement selected_first_item_price_Your_current_selection_list_DTS_window;

    @FindBy(locator = "dw.checkout.selected.second.item.price.Your.current.selection.list.DTS.window")
    private WebElement selected_second_item_price_Your_current_selection_list_DTS_window;

    @FindBy(locator = "dw.checkout.YouHaveUsed.fld.Your.current.selection.DTS.window")
    private WebElement YouHaveUsed_fld_Your_current_selection_DTS_window;

    @FindBy(locator = "dw.checkout.btn.CANCEL.Your.current.selection.DTS.window")
    private WebElement btn_CANCEL_Your_current_selection_DTS_window;

    @FindBy(locator = "dw.checkout.section.NoDataAvailable.Your.current.selection.DTS.window")
    private WebElement section_NoDataAvailable_Your_current_selection_DTS_window;

    @FindBy(locator = "dw.checkout.btn.checked.for.selected.item.Your.current.selection.DTS.window")
    private WebElement btn_checked_for_selected_item_Your_current_selection_DTS_window;

    @FindBy(locator = "dw.checkout.fld.entered.FreePick.coupon.Redemptions.page")
    private WebElement fld_entered_FreePick_coupon_Redemptions_page;

    @FindBy(locator = "dw.checkout.lnk.Prev.Your.current.selection.DTS.window")
    private WebElement lnk_Prev_Your_current_selection_DTS_window;

    @FindBy(locator = "dw.checkout.lnk.Next.Your.current.selection.DTS.window")
    private WebElement lnk_Next_Your_current_selection_DTS_window;

    @FindBy(locator = "dw.checkout.tab.ReviewCart.CSR")
    private WebElement tab_ReviewCart_CSR;

    @FindBy(locator = "dw.checkout.item.first.in.DTS.modal.window.list")
    private WebElement item_first_in_DTS_modal_window_list;

    @FindBy(locator = "dw.checkout.item.first.in.FreePick.modal.window.list")
    private WebElement item_first_in_FreePick_modal_window_list;

    @FindBy(locator = "dw.checkout.section.expanded.table.in.DTS.modal.window.list")
    private WebElement section_expanded_table_in_DTS_modal_window_list;

    @FindBy(locator = "dw.checkout.section.Tot.items.search.results.in.DTS.modal.window.list")
    private WebElement section_Tot_items_search_results_in_DTS_modal_window_list;

    @FindBy(locator = "dw.checkout.ItemNum.fld.first.item.in.DTS.modal.window.list")
    private WebElement ItemNum_fld_first_item_in_DTS_modal_window_list;

    @FindBy(locator = "dw.checkout.ItemNum.fld.first.item.in.FreePick.modal.window.list")
    private WebElement ItemNum_fld_first_item_in_FreePick_modal_window_list;

    @FindBy(locator = "dw.checkout.delete.callOut.msg.coupons.section.Redemptions.page")
    private WebElement delete_callOut_msg_coupons_section_Redemptions_page;

    @FindBy(locator = "dw.checkout.title.fld.first.item.in.DTS.modal.window.list")
    private WebElement title_fld_first_item_in_DTS_modal_window_list;

    @FindBy(locator = "dw.checkout.img.thumbnail.in.DTS.modal.window.list")
    private WebElement img_thumbnail_in_DTS_modal_window_list;

    @FindBy(locator = "dw.checkout.lnk.HideDetail.in.DTS.modal.window.list")
    private WebElement lnk_HideDetail_in_DTS_modal_window_list;

    @FindBy(locator = "dw.checkout.pages.search.results.DTS.window")
    private List<WebElement> pages_search_results_DTS_window;

    @FindBy(locator = "dw.checkout.btn.EDIT.for.DTS.RedemptionsRewards.Page")
    private WebElement btn_EDIT_for_DTS_RedemptionsRewards_Page;
    
    @FindBy(locator = "dw.checkout.btn.EDIT.for.DTS.RedemptionsRewards.Page")
    private List<WebElement> list_btn_EDIT_for_DTS_RedemptionsRewards_Page;

    @FindBy(locator = "dw.checkout.YouHaveUsed.Tot.items.price.Your.current.selection.list.DTS.window")
    private WebElement YouHaveUsed_Tot_items_price_Your_current_selection_list_DTS_window;

    @FindBy(locator = "dw.checkout.RemainingToSpend.amt.Your.current.selection.DTS.window")
    private WebElement RemainingToSpend_amt_Your_current_selection_DTS_window;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.popUp.coupon.error.message")
    private WebElement popUp_coupon_error_message_RewardsPage;

    @FindBy(locator = "dw.checkout.province.state.alternate.shipping.PaymentPage")
    private WebElement province_state_alternate_shipping_PaymentPage;

    @FindBy(locator = "dw.checkout.province.state.dropDown.selection.PaymentPage")
    private WebElement province_state_dropDown_selection_PaymentPage;

    @FindBy(locator = "dw.checkout.section.cheques.payable.to.message.PaymentPage")
    private WebElement section_cheques_payable_to_message_PaymentPage;

    @FindBy(locator = "dw.checkout.section.payment.options.disabled.PaymentPage")
    private WebElement section_payment_options_disabled_PaymentPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.ToolTip.for.TGAT.coupon.details")
    private WebElement ToolTip_for_TGAT_coupon_details;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.Apply.for.Coupon")
    private WebElement btn_Apply_for_Coupon_RewardsPage;
    
    @FindBy(locator = "dw.sfo.first.item.search.results.SFO.modal.section")
    private WebElement first_item_search_results_SFO_modal_section;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.applied.coupon.Section1")
    private WebElement fld_applied_coupon_Section1_RewardsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.window.TGATmodal")
    private WebElement TGAT_modal_window;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.Teacher.ac.details.Coupons.applied.section")
    private WebElement Teacher_ac_details_Coupons_applied_section;
    
    @FindBy(locator = "dw.checkout.fld.applied.TGAT.Coupons.section")
    private WebElement fld_applied_TGAT_Coupons_section;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.earned.BonusBank.amt.section")
    private WebElement fld_earned_BonusBank_amt_section_RewardsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.earned.BonusBank.amt.for.coupon")
    private WebElement earned_BonusBank_amt_for_coupon_RewardsPage;

    @FindBy(locator = "dw.checkout.section.UpSell.msg.BonusFlat.RedeemPage.CSR")
    private WebElement section_UpSell_msg_BonusFlat_RedeemPage_CSR;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.applied.coupon.Section2")
    private WebElement fld_applied_coupon_Section2_RewardsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.FreeItem.Section")
    private List<WebElement> fld_FreeItem_Section_RewardsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.FreeItem1.Section")
    private WebElement fld_FreeItem1_Section_RewardsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.FreeItem2.Section")
    private WebElement fld_FreeItem2_Section_RewardsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.lbl.studentincentive")
    private List<WebElement> sizefld_StudentIncentive_Section_RewardsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.lbl.studentincentive1")
    private WebElement fld_StudentIncentive1_Section_RewardsPage;

    @FindBy(locator = "dw.checkout.popUp.Exceeded.Students.StudentIncentive.Redemptions.Rewards_Page")
    private WebElement popUp_Exceeded_Students_StudentIncentive_Redemptions_Rewards_Page;

    @FindBy(locator = "dw.checkout.header.label.DTS.modal.window.Redemptions.Rewards_Page")
    private WebElement header_label_DTS_modal_window_Redemptions_Rewards_Page;

    @FindBy(locator = "dw.checkout.btn.close.DTS.modal.window.Redemptions.Rewards_Page")
    private WebElement btn_close_DTS_modal_window_Redemptions_Rewards_Page;

    @FindBy(locator = "dw.checkout.DTS.modal.window.Redemptions.Rewards_Page")
    private WebElement DTS_modal_window_Redemptions_Rewards_Page;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.lbl.studentincentive2")
    private WebElement fld_StudentIncentive2_Section_RewardsPage;



    @FindBy(locator = "dw.checkout.payment.header.BlueBar.StudentClub.PostAmount.items.payment")
    private WebElement header_BlueBar_StudentClub_PostAmount_items_payment;

    @FindBy(locator = "dw.checkout.payment.item.Bonus.Bank.Redeemed.StudentClub")
    private WebElement item_Bonus_Bank_Redeemed_StudentClub;

    @FindBy(locator = "dw.checkout.payment.item.Paper.Bonus.Coupons.StudentClub")
    private WebElement item_Paper_Bonus_Coupons_StudentClub;

    @FindBy(locator = "dw.checkout.payment.item.POP.studentClub")
    private WebElement item_POP_StudentClub;

    @FindBy(locator = "dw.checkout.payment.header.BlueBar.TeacherCatalogues.PostAmount.items.payment")
    private WebElement header_BlueBar_TeacherCatalogues_PostAmount_items_payment;

    @FindBy(locator = "dw.checkout.payment.item.Bonus.Bank.Redeemed.TeacherCatalogues")
    private WebElement item_Bonus_Bank_Redeemed_TeacherCatalogues;

    @FindBy(locator = "dw.checkout.payment.item.Paper.Bonus.Coupons.TeacherCatalogues")
    private WebElement item_Paper_Bonus_Coupons_TeacherCatalogues;

    @FindBy(locator = "dw.checkout.payment.btn.minus.POP.StudentClub")
    private WebElement btn_minus_POP_StudentClub_payment;

    @FindBy(locator = "dw.checkout.payment.checkBox.checkAll.POP.StudentClub")
    private WebElement checkBox_checkAll_POP_StudentClub_payment;

    @FindBy(locator = "dw.checkout.payment.fld.FreeItem.Section")
    private WebElement fld_FreeItem_Section_Payment_page;

    @FindBy(locator = "dw.checkout.payment.Total.owing.StudentClub")
    private WebElement Total_owing_StudentClub_payment;

    @FindBy(locator = "dw.checkout.payment.Total.owing.TeacherCatalogues")
    private WebElement Total_owing_TeacherCatalogues_payment;

    @FindBy(locator = "dw.checkout.payment.Total.owing.Shipping")
    private WebElement Total_owing_Shipping_payment;

    @FindBy(locator = "dw.checkout.payment.Total.Amount.Owing")
    private WebElement Total_Amount_Owing_Payment;
    
    @FindBy(locator = "dw.checkout.payment.Total.Items")
    private WebElement Total_Items_Payment;

    @FindBy(locator = "dw.checkout.payment.CreditCard.Input")
    private WebElement Total_Amount_Payment_CreditcardInput;

    @FindBy(locator = "dw.checkout.payment.Cheque.Input")
    private WebElement Total_Amount_Payment_ChequeInput;

    @FindBy(locator = "dw.checkout.payment.confirmsubmit.Cheque.payment")
    private WebElement Total_Amount_Payment_ConfirmSubmit_ChequePayment;

    @FindBy(locator = "dw.checkout.payment.confirmsubmit.Credit.payment")
    private WebElement Total_Amount_Payment_ConfirmSubmit_CreditPayment;

    @FindBy(locator = "dw.checkout.payment.submitted.Cheque.payment")
    private WebElement Total_Amount_Payment_Submitted_ChequePayment;

    @FindBy(locator = "dw.checkout.payment.submitted.Credit.payment")
    private WebElement Total_Amount_Payment_Submitted_CreditPayment;

    @FindBy(locator = "dw.checkout.Rewards.earned.amount.message.CouponsRewards")
    private WebElement Rewards_earned_amount_message_CouponsRewards;

    @FindBy(locator = "dw.checkout.calc.of.qualifying.order.Total.Rewards.page")
    private WebElement calc_of_qualifying_order_Total_Rewards_page;

    @FindBy(locator = "dw.checkout.explanation.of.qualifying.order.Total.Rewards.page")
    private WebElement explanation_of_qualifying_order_Total_Rewards_page;

    @FindBy(locator = "dw.checkout.Submit.order.date.CouponsRewards")
    private WebElement Submit_order_date_CouponsRewards;


    @FindBy(locator = "dw.checkout.rewardsandcoupons.hdr.BlueBar.StudentClub.PostAmount")
    private WebElement header_BlueBar_StudentClub_PostAmount;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.Exeeded_Amt_MakeYourSelection_Window")
    private WebElement Exeeded_Amt_MakeYourSelection_Window;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.Payable_amt_Rewards_Coupons")
    private WebElement Payable_amt_Rewards_Coupons;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.hdr.BlueBar.StudentClub.Items")
    private WebElement header_BlueBar_StudentClub_Items;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.hdr.BlueBar.TeacherCatalogues.PostAmount")
    private WebElement header_BlueBar_TeacherCatalogues_PostAmount;

    @FindBy(locator = "dw.checkout.payment.chkBox.alternateShipping.Payment")
    private WebElement chkBox_alternateShipping_Payment;

    @FindBy(locator = "dw.checkout.payment.lbl.alternateShipping.Payment")
    private WebElement lbl_alternateShipping_Payment;

    @FindBy(locator = "dw.checkout.payment.chkBox.alternateShipping.address1")
    private WebElement fld_alternativeshipping_address1;

    @FindBy(locator = "dw.checkout.payment.chkBox.alternateShipping.address2")
    private WebElement fld_alternativeshipping_address2;

    @FindBy(locator = "dw.checkout.payment.chkBox.alternateShipping.postalcode")
    private WebElement fld_alternativeshipping_postalcode;

    @FindBy(locator = "dw.checkout.payment.chkBox.alternateShipping.city")
    private WebElement fld_alternativeshipping_city;

    @FindBy(locator = "dw.checkout.payment.chkBox.alternateShipping.province")
    private WebElement fld_alternativeshipping_province;

    @FindBy(locator = "dw.checkout.payment.chkBox.alternateShipping.selected.province")
    private WebElement fld_alternativeshipping_selectedprovince;

    @FindBy(locator = "dw.checkout.payment.chkBox.alternateShipping.selected.province.locked")
    private WebElement fld_alternativeshipping_selectedprovincelocked;

    @FindBy(locator = "dw.checkout.payment.chkBox.alternateShipping.selected.province.locked")
    private List<WebElement> sizefld_alternativeshipping_selectedprovincelocked;

    @FindBy(locator = "dw.checkout.payment.chkBox.alternateShipping.country")
    private WebElement fld_alternativeshipping_country;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.hdr.BlueBar.TeacherCatalogues.Items")
    private WebElement header_BlueBar_TeacherCatalogues_Items;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.hdr.BlueBar.Shipping.TotalAmount")
    private WebElement header_BlueBar_Shipping_TotalAmount;

    @FindBy(locator = "dw.teacher.home.enterorder.amt.TotalAmountOwing")
    private WebElement Total_Amount_Owing;
    
    @FindBy(locator = "dw.BM.fld.Login")
    private WebElement BM_fld_Login;
    
    @FindBy(locator = "dw.BM.fld.Password")
    private WebElement BM_fld_Password;
    
    @FindBy(locator = "dw.BM.btn.LogIn")
    private WebElement BM_btn_LogIn;
    
    @FindBy(locator = "dw.BM.MenuIcon.Administartion")
    private WebElement BM_MenuIcon_Administartion;
    
    @FindBy(locator = "dw.BM.In.Administartion.link.Users")
    private WebElement BM_In_Administartion_link_Users;
    
    @FindBy(locator = "dw.BM.btn.New.in.UserList")
    private WebElement BM_btn_New_in_UserList;
    
    @FindBy(locator = "dw.BM.fld.YourPwd.in.NewUserPage")
    private WebElement BM_fld_YourPwd_in_NewUserPage;
    
    @FindBy(locator = "dw.BM.fld.Login.in.NewUserPage")
    private WebElement BM_fld_Login_in_NewUserPage;
    
    @FindBy(locator = "dw.BM.fld.Pwd.in.NewUserPage")
    private WebElement BM_fld_Pwd_in_NewUserPage;
    
    @FindBy(locator = "dw.BM.fld.Confirm.Pwd.in.NewUserPage")
    private WebElement BM_fld_Confirm_Pwd_in_NewUserPage;
    
    @FindBy(locator = "dw.BM.fld.Fname.in.NewUserPage")
    private WebElement BM_fld_Fname_in_NewUserPage;
    
    @FindBy(locator = "dw.BM.fld.Lname.in.NewUserPage")
    private WebElement BM_fld_Lname_in_NewUserPage;
    
    @FindBy(locator = "dw.BM.fld.Email.in.NewUserPage")
    private WebElement BM_fld_Email_in_NewUserPage;
    
    @FindBy(locator = "dw.BM.btn.Apply.in.NewUserPage")
    private WebElement BM_btn_Apply_in_NewUserPage;
    
    @FindBy(locator = "dw.BM.tab.Roles.SetRolePage")
    private WebElement BM_tab_Roles_SetRolePage;
    
    @FindBy(locator = "dw.BM.btn.Assign.in.SetRolePage")
    private WebElement BM_btn_Assign_in_SetRolePage;
    
    @FindBy(locator = "dw.BM.checkBox.Administrator.in.SetRolePage")
    private WebElement BM_checkBox_Administrator_in_SetRolePage;
    
    @FindBy(locator = "dw.BM.checkBox.CSR.User.in.SetRolePage")
    private WebElement BM_checkBox_CSR_User_in_SetRolePage;
    
    @FindBy(locator = "dw.BM.tab.Users.in.SubMenu")
    private WebElement BM_tab_Users_in_SubMenu;
    
    @FindBy(locator = "dw.BM.fld.OldPwd.ToSet")
    private WebElement BM_fld_OldPwd_ToSet;
    
    @FindBy(locator = "dw.BM.fld.OriginalPwd.ToSet")
    private WebElement BM_fld_OriginalPwd_ToSet;
    
    @FindBy(locator = "dw.BM.fld.Original.Pwd.confirm.ToSet")
    private WebElement BM_fld_Original_Pwd_confirm_ToSet;
    
    @FindBy(locator = "dw.BM.dropdown.Pwd.sec.question")
    private WebElement BM_dropdown_Pwd_sec_question;
    
    @FindBy(locator = "dw.BM.fld.answer.for.Pwd.sec.question")
    private WebElement BM_fld_answer_for_Pwd_sec_question;
    
    @FindBy(locator = "dw.BM.btn.Continue.after.set.pwd")
    private WebElement BM_btn_Continue_after_set_pwd;
    
    @FindBy(locator = "dw.BM.btn.LogOff")
    private WebElement BM_btn_LogOff;

    @FindBy(locator = "dw.checkout.section.StudentClubs.RedemptionsRewardsPage")
    private WebElement section_StudentClubs_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.section.ShippingHandling.RedemptionsRewardsPage")
    private WebElement section_ShippingHandling_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.btn.Toggle.for.StudentClubs.RedemptionsRewardsPage")
    private WebElement btn_Toggle_for_StudentClubs_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.btn.Toggle.for.ShippingHandling.RedemptionsRewardsPage")
    private WebElement btn_Toggle_for_ShippingHandling_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.label.SubTotal.StudentClubs.RedemptionsRewardsPage")
    private WebElement label_SubTotal_StudentClubs_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.label.ShippingHandling.preAmt.RedemptionsRewardsPage")
    private WebElement label_ShippingHandling_preAmt_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.fld.tax.ShippingHandling.section.RedemptionsRewardsPage")
    private WebElement fld_tax_ShippingHandling_section_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.label.REDEEM.BONUS.COUPONS.REWARDS.StudentClubs.RedemptionsRewardsPage")
    private WebElement label_REDEEM_BONUS_COUPONS_REWARDS_StudentClubs_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.label.BONUS.BANK.StudentClubs.RedemptionsRewardsPage")
    private WebElement label_BONUS_BANK_StudentClubs_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.label.PAPER.BONUS.StudentClubs.RedemptionsRewardsPage")
    private WebElement label_PAPER_BONUS_StudentClubs_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.fld.paragraph.PAPER.BONUS.StudentClubs.RedemptionsRewardsPage")
    private WebElement fld_paragraph_PAPER_BONUS_StudentClubs_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.fld.paragraph.BONUS.BANK.StudentClubs.RedemptionsRewardsPage")
    private WebElement fld_paragraph_BONUS_BANK_StudentClubs_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.label.BONUS.BANK.txtBox.StudentClubs.RedemptionsRewardsPage")
    private WebElement label_BONUS_BANK_txtBox_StudentClubs_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.label.PAPER.BONUS.txtBox.StudentClubs.RedemptionsRewardsPage")
    private WebElement label_PAPER_BONUS_txtBox_StudentClubs_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.label.Student.Clubs.Amt.Owing.RedemptionsRewardsPage")
    private WebElement label_Student_Clubs_Amt_Owing_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.fld.Tot.AmtOwing.Student.Clubs.RedemptionsRewardsPage")
    private WebElement fld_Tot_AmtOwing_Student_Clubs_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.fld.Tot.Items.Student.Clubs.RedemptionsRewardsPage")
    private WebElement fld_Tot_Items_Student_Clubs_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.label.REWARDS.in.RedemptionsRewardsPage")
    private WebElement label_REWARDS_in_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.fld.FreeItem.Promotion.in.RedemptionsRewardsPage")
    private WebElement fld_FreeItem_Promotion_in_RedemptionsRewardsPage;
    
    @FindBy(locator = "dw.checkout.fld.Free.TeacherKit.Promotion.in.RedemptionsRewardsPage")
    private WebElement fld_Free_TeacherKit_Promotion_in_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.lebel.Rewards.Qualifying.order.in.REWARDS.section.in.RedemptionsRewardsPage")
    private WebElement lebel_Rewards_Qualifying_order_in_REWARDS_section_in_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.fld.How.is.Qualifying.order.in.REWARDS.section.in.RedemptionsRewardsPage")
    private WebElement fld_How_is_Qualifying_order_in_REWARDS_section_in_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.fld.TimeAndDate.in.REWARDS.section.in.RedemptionsRewardsPage")
    private WebElement fld_TimeAndDate_in_REWARDS_section_in_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.hdr.StudentClubs.in.RedemptionsRewardsPage")
    private WebElement hdr_StudentClubs_in_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.hdr.ShippingHandling.in.RedemptionsRewardsPage")
    private WebElement hdr_ShippingHandling_in_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.section.TeacherCatalogues.RedemptionsRewardsPage")
    private WebElement section_TeacherCatalogues_RedemptionsRewardsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.StudentClubSubTotal")
    private WebElement value_StudentClubSubTotal_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.GST.StudentClub")
    private WebElement value_GST_StudentClub_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.HST.StudentClub")
    private WebElement value_HST_StudentClub_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.PST.StudentClub")
    private WebElement value_PST_StudentClub_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.QST.StudentClub")
    private WebElement value_QST_StudentClub_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.GST.StudentClub")
    private List<WebElement> sizevalue_GST_StudentClub_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.HST.StudentClub")
    private List<WebElement> sizevalue_HST_StudentClub_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.PST.StudentClub")
    private List<WebElement> sizevalue_PST_StudentClub_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.QST.StudentClub")
    private List<WebElement> sizevalue_QST_StudentClub_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.TeacherCatSubTotal")
    private WebElement value_TeacherCatSubTotal_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.GST.TeacherCat")
    private WebElement value_GST_TeacherCat_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.HST.TeacherCat")
    private WebElement value_HST_TeacherCat_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.PST.TeacherCat")
    private WebElement value_PST_TeacherCat_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.QST.TeacherCat")
    private WebElement value_QST_TeacherCat_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.GST.TeacherCat")
    private List<WebElement> sizevalue_GST_TeacherCat_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.HST.TeacherCat")
    private List<WebElement> sizevalue_HST_TeacherCat_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.PST.TeacherCat")
    private List<WebElement> sizevalue_PST_TeacherCat_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.QST.TeacherCat")
    private List<WebElement> sizevalue_QST_TeacherCat_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.GST.Shipping")
    private WebElement value_GST_Shipping_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.HST.Shipping")
    private WebElement value_HST_Shipping_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.PST.Shipping")
    private WebElement value_PST_Shipping_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.QST.Shipping")
    private WebElement value_QST_Shipping_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.GST.Shipping")
    private List<WebElement> sizevalue_GST_Shipping_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.HST.Shipping")
    private List<WebElement> sizevalue_HST_Shipping_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.PST.Shipping")
    private List<WebElement> sizevalue_PST_Shipping_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.QST.Shipping")
    private List<WebElement> sizevalue_QST_Shipping_RewardsCouponsPage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.Shipping.standardPrice")
    private WebElement value_Shipping_standardPrice;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.value.Shipping.TotalPrice")
    private WebElement value_Shipping_TotalPrice;


    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.tossinQty")
    private WebElement tossinQty;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.fld.tossinQty")
    private List<WebElement> sizetossinQty;




    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.ContinueCheckout")
    private WebElement btnContinueCheckout;

    @FindBy(locator = "dw.checkout.header.PaymentsIsActive")
    private WebElement headerPaymentsIsActive;

    @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.chk.savecard")
    private WebElement chkSaveCard;

    @FindBy(locator = "dw.checkout.rewardscoupons.shipping.subtotal")
    private WebElement getCheckoutRewardCouponsShipSubtotal;

    @FindBy(locator = "dw.checkout.rewardscoupons.shipping.subtotal.tax1.label")
    private WebElement getCheckoutRewardCouponsShipTax1label;

    @FindBy(locator = "dw.checkout.rewardscoupons.shipping.subtotal.tax2.label")
    private WebElement getCheckoutRewardCouponsShipTax2label;

    @FindBy(locator = "dw.checkout.rewardscoupons.shipping.subtotal.tax2.label")
    private List<WebElement> chkCheckoutRewardCouponsShipTax2label;

    @FindBy(locator = "dw.checkout.rewardscoupons.shipping.subtotal.tax.gst")
    private WebElement getCheckoutRewardCouponsShipTaxGst;

    @FindBy(locator = "dw.checkout.rewardscoupons.shipping.subtotal.tax.pst")
    private WebElement getCheckoutRewardCouponsShipTaxPst;
    
    @FindBy(locator = "dw.checkout.rewards.redemption.spellscholastic.promotion")
    private WebElement getCheckoutRewardSpellScholasticPromo;
    
    @FindBy(locator = "dw.checkout.rewards.redemption.bonusflat.bonuspercentage.promotion")
    private WebElement getCheckoutRewardBonusFlatBonusPercPromo;
    
    @FindBy(locator = "dw.checkout.rewards.redemption.freeitem.promotion.list")
    private List<WebElement> getCheckoutRewardFreeItemPromoList;
    
    @FindBy(locator = "dw.checkout.rewards.redemption.studentincentive.promotion")
    private WebElement getCheckoutRewardStudentIncentivePromo;

    public WebElement getCheckoutRewardStudentIncentivePromo() {
        return getCheckoutRewardStudentIncentivePromo;
    }
    
    public WebElement getCheckoutRewardSpellScholasticPromo() {
        return getCheckoutRewardSpellScholasticPromo;
    }
    
    public WebElement getCheckoutRewardBonusFlatBonusPercPromo() {
        return getCheckoutRewardBonusFlatBonusPercPromo;
    }
    
    public List<WebElement> getCheckoutRewardFreeItemPromoList() {
        return getCheckoutRewardFreeItemPromoList;
    }
    
    public WebElement getCheckoutRewardCouponsShipSubtotal() {
        return getCheckoutRewardCouponsShipSubtotal;
    }

    public WebElement getCheckoutRewardCouponsShipTax1label() {
        return getCheckoutRewardCouponsShipTax1label;
    }

    public WebElement getCheckoutRewardCouponsShipTax2label() {
        return getCheckoutRewardCouponsShipTax2label;
    }

    public List<WebElement> chkCheckoutRewardCouponsShipTax2label() {
        return chkCheckoutRewardCouponsShipTax2label;
    }

    public WebElement getCheckoutRewardCouponsShipTaxGst() {
        return getCheckoutRewardCouponsShipTaxGst;
    }

    public WebElement getCheckoutRewardCouponsShipTaxPst() {
        return getCheckoutRewardCouponsShipTaxPst;
    }



    @FindBy(locator = "dw.teacher.coupon.popup.btn.confirmandapply")
    private List<WebElement> sizebtnConfirmAndApply;

    public List<WebElement> sizegetBtnConfirmAndApply() {
        return sizebtnConfirmAndApply;
    }


    @FindBy(locator = "dw.checkout.payment.pop.checkbox")
    private WebElement popCheckBox;

    public WebElement getpopCheckBox() {
        return popCheckBox;
    }

    @FindBy(locator = "dw.checkout.payment.pop.checkbox")
    private List<WebElement> chkpopCheckBox;

    public List<WebElement> chkgetpopCheckBox() {
        return chkpopCheckBox;
    }

    public WebElement getChkSaveCard() {
        return chkSaveCard;
    }


    public WebElement getlnkDTSEdit() {
        return lnkDTSEdit;
    }

    public WebElement btnSkip1() {
        return btnSkip1;
    }
    public WebElement btnSkip2() {
        return btnSkip2;
    }
    public WebElement btnSkip3() {
        return btnSkip3;
    }
    public WebElement btnExpand_Shipping() {
        return btnExpand_Shipping;
    }

    public WebElement btnExpand_2() {
        return btnExpand_2;
    }

    public WebElement btnExpand_3() {
        return btnExpand_3;
    }

    public WebElement fld_Dollars_To_Spend_Coupons_Rewards() {
        return fld_Dollars_To_Spend_Coupons_Rewards;
    }

    public WebElement Selection_Grade_level_inPopUp_Coupons_Rewards() {
        return Selection_Grade_level_inPopUp_Coupons_Rewards;
    }

    public List<WebElement> items_price_Make_Selection_Window() {
        return items_price_Make_Selection_Window;
    }

    public List<WebElement> items_price_FreeItem_Modal_Window() {
        return items_price_FreeItem_Modal_Window;
    }

    public List<WebElement> grade_names_Modal_Window_dropDown() {
        return grade_names_Modal_Window_dropDown;
    }

    public WebElement data_To_Check_By_Grade_Level_Coupons_Rewards() {
        return data_To_Check_By_Grade_Level_Coupons_Rewards;
    }

    public WebElement select_item1_MakeYourSelection() {
        return select_item1_MakeYourSelection;
    }

    public WebElement selected_item_Section_MakeYourSelection() {
        return selected_item_Section_MakeYourSelection;
    }

    public WebElement data_To_Check_By_Results_Text_Coupons_Rewards() {
        return data_To_Check_By_Results_Text_Coupons_Rewards;
    }
    public WebElement fld_StudentClub_BonusBank() {
        return fld_StudentClub_BonusBank;
    }

    public WebElement fld_StudentClub_btn_EDIT() {
        return fld_StudentClub_btn_EDIT;
    }

    public WebElement fld_TeacherCat_btn_EDIT() {
        return fld_TeacherCat_btn_EDIT;
    }

    public WebElement fld_ShippingFee_btn_EDIT() {
        return fld_ShippingFee_btn_EDIT;
    }

    public WebElement fld_StudentClub_PaperBonus() {
        return fld_StudentClub_PaperBonus;
    }
    public WebElement fld_TeacherCat_BonusBank() {
        return fld_TeacherCat_BonusBank;
    }

    public WebElement blueBar_value_StudentClubSubTot_Payment() {
        return blueBar_value_StudentClubSubTot_Payment;
    }

    public WebElement chkBox_pop_1st_Sname_Payment() {
        return chkBox_pop_1st_Sname_Payment;
    }

    public WebElement amt_pop_1st_Sname_Payment() {
        return amt_pop_1st_Sname_Payment;
    }

    public WebElement fld_TeacherCat_PaperBonus() {
        return fld_TeacherCat_PaperBonus;
    }
    public WebElement fld_Shipping_BonusBank() {
        return fld_Shipping_BonusBank;
    }
    public WebElement fld_Shipping_PaperBonus() {
        return fld_Shipping_PaperBonus;
    }

    public WebElement fld_Enter_CouponCode_RewardsPage() {
        return fld_Enter_CouponCode_RewardsPage;
    }

    public WebElement btn_close_TGAT_coupon() {
        return btn_close_TGAT_coupon;
    }

    public WebElement btn_NO_to_delete_TGAT_coupon() {
        return btn_NO_to_delete_TGAT_coupon;
    }

    public WebElement TGAT_coupon_in_Coupons_Applied_section() {
        return TGAT_coupon_in_Coupons_Applied_section;
    }

    public WebElement btn_YES_to_delete_TGAT_coupon() {
        return btn_YES_to_delete_TGAT_coupon;
    }
    
    public WebElement btn_YES_to_delete_TGAT_coupon_CSR() {
        return btn_YES_to_delete_TGAT_coupon_CSR;
    }
    
    public WebElement btn_NO_to_delete_TGAT_coupon_CSR() {
        return btn_NO_to_delete_TGAT_coupon_CSR;
    }

    public WebElement link_click_here_to_enter_the_ref_teacher_TGAT() {
        return link_click_here_to_enter_the_ref_teacher_TGAT;
    }

    public WebElement fld_Teacher_CustNum_TGAT_Modal_window() {
        return fld_Teacher_CustNum_TGAT_Modal_window;
    }

    public WebElement button_close_the_TGAT_modal_window() {
        return button_close_the_TGAT_modal_window;
    }

    public WebElement fld_Teacher_Fname_TGAT_Modal_window() {
        return fld_Teacher_Fname_TGAT_Modal_window;
    }

    public WebElement fld_Teacher_Lname_TGAT_Modal_window() {
        return fld_Teacher_Lname_TGAT_Modal_window;
    }

    public WebElement btn_Submit_TGAT_Modal_window() {
        return btn_Submit_TGAT_Modal_window;
    }

    public WebElement delete_SelectedItem_Modal_Selection_window() {
        return delete_SelectedItem_Modal_Selection_window;
    }

    public WebElement close_btn_Modal_Selection_window() {
        return close_btn_Modal_Selection_window;
    }

    public WebElement getcoupon_rewardscoupons_freepickcoupon() {
        return coupon_rewardscoupons_freepickcoupon;
    }

    public WebElement EDIT_Selected_Item_in_Modal_window() {
        return EDIT_Selected_Item_in_Modal_window;
    }

    public WebElement fld_selected_item_num_MakeSelection_Window() {
        return fld_selected_item_num_MakeSelection_Window;
    }

    public WebElement fld_selected_item_Title_MakeSelection_Window() {
        return fld_selected_item_Title_MakeSelection_Window;
    }

    public WebElement fld_selected_item_Flyer_MakeSelection_Window() {
        return fld_selected_item_Flyer_MakeSelection_Window;
    }

    public WebElement fld_selected_item_num_YourSelection_Window() {
        return fld_selected_item_num_YourSelection_Window;
    }
    
    public WebElement fld_selected_FreePick_item_num_YourSelection_Window() {
        return fld_selected_FreePick_item_num_YourSelection_Window;
    }

    public WebElement fld_selected_item_Title_YourSelection_Window() {
        return fld_selected_item_Title_YourSelection_Window;
    }

    public WebElement fld_selected_item_Flyer_YourSelection_Window() {
        return fld_selected_item_Flyer_YourSelection_Window;
    }

    public List<WebElement> SIZE_EDIT_Selected_Item_in_Modal_window() {
        return SIZE_EDIT_Selected_Item_in_Modal_window;
    }

    public WebElement SelectedItem_data_Modal_Selection_window() {
        return SelectedItem_data_Modal_Selection_window;
    }

    public WebElement disappear_ConfirmSubmit_Modal_Selection_window() {
        return disappear_ConfirmSubmit_Modal_Selection_window;
    }

    public WebElement Search_fld_MakeYourSelection_window() {
        return Search_fld_MakeYourSelection_window;
    }

    public WebElement Search_btn_MakeYourSelection_window() {
        return Search_btn_MakeYourSelection_window;
    }

    public WebElement empty_data_search_results_MakeYourSelection_window() {
        return empty_data_search_results_MakeYourSelection_window;
    }
    
    public WebElement section_BonusFlat_description_rewards_page() {
        return section_BonusFlat_description_rewards_page;
    }

    public WebElement spellScholastic_sectionDisplay()  {
        return spellscholasticSectionDispaly;
    }

    public WebElement msg_upseller_RewardsPage() {
        return msg_upseller_RewardsPage;
    }

    public WebElement delete_coupon_in_RewardsPage() {
        return delete_coupon_in_RewardsPage;
    }
    
    public WebElement TCOD_YES_to_delete_applied_coupon() {
        return TCOD_YES_to_delete_applied_coupon;
    }
    
    public WebElement fld_coupon_val_in_ConfirmSubmit_Coupons_section() {
        return fld_coupon_val_in_ConfirmSubmit_Coupons_section;
    }
    
    public WebElement TCOD_NO_to_delete_applied_coupon() {
        return TCOD_NO_to_delete_applied_coupon;
    }

    public WebElement btn_delete_selected_item_FreeItem_window_in_RewardsPage() {
        return btn_delete_selected_item_FreeItem_window_in_RewardsPage;
    }

    public WebElement YES_to_delete_coupon_RewardsPage() {
        return YES_to_delete_coupon_RewardsPage;
    }

    public WebElement CSR_YES_to_delete_selected_item_DTS_window() {
        return CSR_YES_to_delete_selected_item_DTS_window;
    }

    public WebElement CSR_NO_to_delete_selected_item_DTS_window() {
        return CSR_NO_to_delete_selected_item_DTS_window;
    }

    public WebElement NO_to_delete_coupon_RewardsPage() {
        return NO_to_delete_coupon_RewardsPage;
    }

    public WebElement CSR_callout_section_for_delete_item_DTS_window() {
        return CSR_callout_section_for_delete_item_DTS_window;
    }

    public WebElement TopOff_msg_DTS_modal_window_Redemptions_Page() {
        return TopOff_msg_DTS_modal_window_Redemptions_Page;
    }

    public WebElement Selected_item_TickMark_DTS_modal_window_Redemptions_Page() {
        return Selected_item_TickMark_DTS_modal_window_Redemptions_Page;
    }

    public WebElement Callout_msg_delete_item_DTS_modal_window_Redemptions_Page() {
        return Callout_msg_delete_item_DTS_modal_window_Redemptions_Page;
    }

    public WebElement selected_first_item_price_Your_current_selection_list_DTS_window() {
        return selected_first_item_price_Your_current_selection_list_DTS_window;
    }

    public WebElement selected_second_item_price_Your_current_selection_list_DTS_window() {
        return selected_second_item_price_Your_current_selection_list_DTS_window;
    }

    public WebElement YouHaveUsed_fld_Your_current_selection_DTS_window() {
        return YouHaveUsed_fld_Your_current_selection_DTS_window;
    }

    public WebElement btn_CANCEL_Your_current_selection_DTS_window() {
        return btn_CANCEL_Your_current_selection_DTS_window;
    }

    public WebElement section_NoDataAvailable_Your_current_selection_DTS_window() {
        return section_NoDataAvailable_Your_current_selection_DTS_window;
    }

    public WebElement btn_checked_for_selected_item_Your_current_selection_DTS_window() {
        return btn_checked_for_selected_item_Your_current_selection_DTS_window;
    }

    public WebElement fld_entered_FreePick_coupon_Redemptions_page() {
        return fld_entered_FreePick_coupon_Redemptions_page;
    }

    public WebElement lnk_Prev_Your_current_selection_DTS_window() {
        return lnk_Prev_Your_current_selection_DTS_window;
    }

    public WebElement lnk_Next_Your_current_selection_DTS_window() {
        return lnk_Next_Your_current_selection_DTS_window;
    }

    public WebElement tab_ReviewCart_CSR() {
        return tab_ReviewCart_CSR;
    }

    public WebElement item_first_in_DTS_modal_window_list() {
        return item_first_in_DTS_modal_window_list;
    }

    public WebElement item_first_in_FreePick_modal_window_list() {
        return item_first_in_FreePick_modal_window_list;
    }

    public WebElement section_expanded_table_in_DTS_modal_window_list() {
        return section_expanded_table_in_DTS_modal_window_list;
    }

    public WebElement section_Tot_items_search_results_in_DTS_modal_window_list() {
        return section_Tot_items_search_results_in_DTS_modal_window_list;
    }

    public WebElement ItemNum_fld_first_item_in_DTS_modal_window_list() {
        return ItemNum_fld_first_item_in_DTS_modal_window_list;
    }

    public WebElement ItemNum_fld_first_item_in_FreePick_modal_window_list() {
        return ItemNum_fld_first_item_in_FreePick_modal_window_list;
    }

    public WebElement delete_callOut_msg_coupons_section_Redemptions_page() {
        return delete_callOut_msg_coupons_section_Redemptions_page;
    }

    public WebElement title_fld_first_item_in_DTS_modal_window_list() {
        return title_fld_first_item_in_DTS_modal_window_list;
    }

    public WebElement img_thumbnail_in_DTS_modal_window_list() {
        return img_thumbnail_in_DTS_modal_window_list;
    }

    public WebElement lnk_HideDetail_in_DTS_modal_window_list() {
        return lnk_HideDetail_in_DTS_modal_window_list;
    }

    public List<WebElement> pages_search_results_DTS_window() {
        return pages_search_results_DTS_window;
    }

    public WebElement btn_EDIT_for_DTS_RedemptionsRewards_Page() {
        return btn_EDIT_for_DTS_RedemptionsRewards_Page;
    }
    
    public List<WebElement> list_btn_EDIT_for_DTS_RedemptionsRewards_Page() {
        return list_btn_EDIT_for_DTS_RedemptionsRewards_Page;
    }

    public WebElement YouHaveUsed_Tot_items_price_Your_current_selection_list_DTS_window() {
        return YouHaveUsed_Tot_items_price_Your_current_selection_list_DTS_window;
    }

    public WebElement RemainingToSpend_amt_Your_current_selection_DTS_window() {
        return RemainingToSpend_amt_Your_current_selection_DTS_window;
    }

    public WebElement popUp_coupon_error_message_RewardsPage() {
        return popUp_coupon_error_message_RewardsPage;
    }

    public WebElement province_state_alternate_shipping_PaymentPage() {
        return province_state_alternate_shipping_PaymentPage;
    }

    public WebElement province_state_dropDown_selection_PaymentPage() {
        return province_state_dropDown_selection_PaymentPage;
    }

    public WebElement section_cheques_payable_to_message_PaymentPage() {
        return section_cheques_payable_to_message_PaymentPage;
    }

    public WebElement section_payment_options_disabled_PaymentPage() {
        return section_payment_options_disabled_PaymentPage;
    }

    public WebElement ToolTip_for_TGAT_coupon_details() {
        return ToolTip_for_TGAT_coupon_details;
    }

    public WebElement btn_Apply_for_Coupon_RewardsPage() {
        return btn_Apply_for_Coupon_RewardsPage;
    }
    
    public WebElement first_item_search_results_SFO_modal_section() {
        return first_item_search_results_SFO_modal_section;
    }

    public WebElement fld_applied_coupon_Section1_RewardsPage() {
        return fld_applied_coupon_Section1_RewardsPage;
    }

    public WebElement TGAT_modal_window() {
        return TGAT_modal_window;
    }

    public WebElement Teacher_ac_details_Coupons_applied_section() {
        return Teacher_ac_details_Coupons_applied_section;
    }
    
    public WebElement fld_applied_TGAT_Coupons_section() {
        return fld_applied_TGAT_Coupons_section;
    }

    public WebElement fld_earned_BonusBank_amt_section_RewardsPage() {
        return fld_earned_BonusBank_amt_section_RewardsPage;
    }

    public WebElement earned_BonusBank_amt_for_coupon_RewardsPage() {
        return earned_BonusBank_amt_for_coupon_RewardsPage;
    }

    public WebElement section_UpSell_msg_BonusFlat_RedeemPage_CSR() {
        return section_UpSell_msg_BonusFlat_RedeemPage_CSR;
    }

    public WebElement fld_applied_coupon_Section2_RewardsPage() {
        return fld_applied_coupon_Section2_RewardsPage;
    }

    public List<WebElement> fld_FreeItem_Section_RewardsPage() {
        return fld_FreeItem_Section_RewardsPage;
    }

    public WebElement fld_FreeItem1_Section_RewardsPage() {
        return fld_FreeItem1_Section_RewardsPage;
    }

    public WebElement fld_FreeItem2_Section_RewardsPage() {
        return fld_FreeItem2_Section_RewardsPage;
    }

    public List<WebElement> sizefld_StudentIncentive_Section_RewardsPage() {
        return sizefld_StudentIncentive_Section_RewardsPage;
    }

    public WebElement fld_StudentIncentive1_Section_RewardsPage() {
        return fld_StudentIncentive1_Section_RewardsPage;
    }

    public WebElement popUp_Exceeded_Students_StudentIncentive_Redemptions_Rewards_Page() {
        return popUp_Exceeded_Students_StudentIncentive_Redemptions_Rewards_Page;
    }

    public WebElement header_label_DTS_modal_window_Redemptions_Rewards_Page() {
        return header_label_DTS_modal_window_Redemptions_Rewards_Page;
    }

    public WebElement btn_close_DTS_modal_window_Redemptions_Rewards_Page() {
        return btn_close_DTS_modal_window_Redemptions_Rewards_Page;
    }

    public List<WebElement> selected_items_list_DTS_modal_window_Redemptions_Rewards_Page() {
        return selected_items_list_DTS_modal_window_Redemptions_Rewards_Page;
    }

    public WebElement DTS_modal_window_Redemptions_Rewards_Page() {
        return DTS_modal_window_Redemptions_Rewards_Page;
    }

    public WebElement fld_StudentIncentive2_Section_RewardsPage() {
        return fld_StudentIncentive2_Section_RewardsPage;
    }

    public WebElement header_BlueBar_StudentClub_PostAmount_items_payment() {
        return header_BlueBar_StudentClub_PostAmount_items_payment;
    }

    public WebElement item_Bonus_Bank_Redeemed_StudentClub() {
        return item_Bonus_Bank_Redeemed_StudentClub;
    }

    public WebElement item_Paper_Bonus_Coupons_StudentClub() {
        return item_Paper_Bonus_Coupons_StudentClub;
    }

    public WebElement item_POP_StudentClub() {
        return item_POP_StudentClub;
    }

    public WebElement header_BlueBar_TeacherCatalogues_PostAmount_items_payment() {
        return header_BlueBar_TeacherCatalogues_PostAmount_items_payment;
    }

    public WebElement item_Bonus_Bank_Redeemed_TeacherCatalogues() {
        return item_Bonus_Bank_Redeemed_TeacherCatalogues;
    }

    public WebElement item_Paper_Bonus_Coupons_TeacherCatalogues() {
        return item_Paper_Bonus_Coupons_TeacherCatalogues;
    }

    public WebElement btn_minus_POP_StudentClub_payment() {
        return btn_minus_POP_StudentClub_payment;
    }

    public WebElement checkBox_checkAll_POP_StudentClub_payment() {
        return checkBox_checkAll_POP_StudentClub_payment;
    }

    public WebElement fld_FreeItem_Section_Payment_page() {
        return fld_FreeItem_Section_Payment_page;
    }

    public WebElement Total_owing_StudentClub_payment() {
        return Total_owing_StudentClub_payment;
    }

    public WebElement Total_owing_TeacherCatalogues_payment() {
        return Total_owing_TeacherCatalogues_payment;
    }

    public WebElement Total_owing_Shipping_payment() {
        return Total_owing_Shipping_payment;
    }

    public WebElement Total_Amount_Owing_Payment() {
        return Total_Amount_Owing_Payment;
    }
    
    public WebElement Total_Items_Payment() {
        return Total_Items_Payment;
    }

    public WebElement Total_Amount_Payment_Creditcard_Input() {
        return Total_Amount_Payment_CreditcardInput;
    }

    public WebElement Total_Amount_Payment_Cheque_Input() {
        return Total_Amount_Payment_ChequeInput;
    }

    public WebElement Total_Amount_Payment_ConfirmSubmit_ChequePayment() {
        return Total_Amount_Payment_ConfirmSubmit_ChequePayment;
    }

    public WebElement Total_Amount_Payment_ConfirmSubmit_CreditPayment() {
        return Total_Amount_Payment_ConfirmSubmit_CreditPayment;
    }

    public WebElement Total_Amount_Payment_Submitted_ChequePayment() {
        return Total_Amount_Payment_Submitted_ChequePayment;
    }

    public WebElement Total_Amount_Payment_Submitted_CreditPayment() {
        return Total_Amount_Payment_Submitted_CreditPayment;
    }

    public WebElement Rewards_earned_amount_message_CouponsRewards() {
        return Rewards_earned_amount_message_CouponsRewards;
    }

    public WebElement calc_of_qualifying_order_Total_Rewards_page() {
        return calc_of_qualifying_order_Total_Rewards_page;
    }

    public WebElement explanation_of_qualifying_order_Total_Rewards_page() {
        return explanation_of_qualifying_order_Total_Rewards_page;
    }

    public WebElement Submit_order_date_CouponsRewards() {
        return Submit_order_date_CouponsRewards;
    }


    public WebElement header_BlueBar_StudentClub_PostAmount() {
        return header_BlueBar_StudentClub_PostAmount;
    }

    public WebElement Exeeded_Amt_MakeYourSelection_Window() {
        return Exeeded_Amt_MakeYourSelection_Window;
    }

    public WebElement Payable_amt_Rewards_Coupons() {
        return Payable_amt_Rewards_Coupons;
    }

    public WebElement header_BlueBar_StudentClub_Items() {
        return header_BlueBar_StudentClub_Items;
    }

    public WebElement header_BlueBar_TeacherCatalogues_PostAmount() {
        return header_BlueBar_TeacherCatalogues_PostAmount;
    }

    public WebElement chkBox_alternateShipping_Payment() {
        return chkBox_alternateShipping_Payment;
    }

    public WebElement lbl_alternateShipping_Payment() {
        return lbl_alternateShipping_Payment;
    }

    public WebElement getfld_alternativeshipping_address1() {
        return fld_alternativeshipping_address1;
    }

    public WebElement getfld_alternativeshipping_address2() {
        return fld_alternativeshipping_address2;
    }

    public WebElement getfld_alternativeshipping_postalcode() {
        return fld_alternativeshipping_postalcode;
    }

    public WebElement getfld_alternativeshipping_city() {
        return fld_alternativeshipping_city;
    }

    public WebElement getfld_alternativeshipping_province() {
        return fld_alternativeshipping_province;
    }

    public WebElement getfld_alternativeshipping_selectedprovince() {
        return fld_alternativeshipping_selectedprovince;
    }

    public WebElement getfld_alternativeshipping_selectedprovincelocked() {
        return fld_alternativeshipping_selectedprovincelocked;
    }

    public List<WebElement> sizefld_alternativeshipping_selectedprovincelocked() {
        return sizefld_alternativeshipping_selectedprovincelocked;
    }

    public WebElement getfld_alternativeshipping_country() {
        return fld_alternativeshipping_country;
    }

    public WebElement header_BlueBar_TeacherCatalogues_Items() {
        return header_BlueBar_TeacherCatalogues_Items;
    }

    public WebElement header_BlueBar_Shipping_TotalAmount() {
        return header_BlueBar_Shipping_TotalAmount;
    }

    public WebElement Total_Amount_Owing() {
        return Total_Amount_Owing;
    }
    
    public WebElement BM_fld_Login() {
        return BM_fld_Login;
    }
    
    public WebElement BM_fld_Password() {
        return BM_fld_Password;
    }
    
    public WebElement BM_btn_LogIn() {
        return BM_btn_LogIn;
    }
    
    public WebElement BM_MenuIcon_Administartion() {
        return BM_MenuIcon_Administartion;
    }
    
    public WebElement BM_In_Administartion_link_Users() {
        return BM_In_Administartion_link_Users;
    }
    
    public WebElement BM_btn_New_in_UserList() {
        return BM_btn_New_in_UserList;
    }
    
    public WebElement BM_fld_YourPwd_in_NewUserPage() {
        return BM_fld_YourPwd_in_NewUserPage;
    }
    
    public WebElement BM_fld_Login_in_NewUserPage() {
        return BM_fld_Login_in_NewUserPage;
    }
    
    public WebElement BM_fld_Pwd_in_NewUserPage() {
        return BM_fld_Pwd_in_NewUserPage;
    }
    
    public WebElement BM_fld_Confirm_Pwd_in_NewUserPage() {
        return BM_fld_Confirm_Pwd_in_NewUserPage;
    }
    
    public WebElement BM_fld_Fname_in_NewUserPage() {
        return BM_fld_Fname_in_NewUserPage;
    }
    
    public WebElement BM_fld_Lname_in_NewUserPage() {
        return BM_fld_Lname_in_NewUserPage;
    }
    
    public WebElement BM_fld_Email_in_NewUserPage() {
        return BM_fld_Email_in_NewUserPage;
    }
    
    public WebElement BM_btn_Apply_in_NewUserPage() {
        return BM_btn_Apply_in_NewUserPage;
    }
    
    public WebElement BM_tab_Roles_SetRolePage() {
        return BM_tab_Roles_SetRolePage;
    }
    
    public WebElement BM_btn_Assign_in_SetRolePage() {
        return BM_btn_Assign_in_SetRolePage;
    }
    
    public WebElement BM_checkBox_Administrator_in_SetRolePage() {
        return BM_checkBox_Administrator_in_SetRolePage;
    }
    
    public WebElement BM_checkBox_CSR_User_in_SetRolePage() {
        return BM_checkBox_CSR_User_in_SetRolePage;
    }
    
    public WebElement BM_tab_Users_in_SubMenu() {
        return BM_tab_Users_in_SubMenu;
    }
    
    public WebElement BM_fld_OldPwd_ToSet() {
        return BM_fld_OldPwd_ToSet;
    }
    
    public WebElement BM_fld_OriginalPwd_ToSet() {
        return BM_fld_OriginalPwd_ToSet;
    }
    
    public WebElement BM_fld_Original_Pwd_confirm_ToSet() {
        return BM_fld_Original_Pwd_confirm_ToSet;
    }
    
    public WebElement BM_dropdown_Pwd_sec_question() {
        return BM_dropdown_Pwd_sec_question;
    }
    
    public WebElement BM_fld_answer_for_Pwd_sec_question() {
        return BM_fld_answer_for_Pwd_sec_question;
    }
    
    public WebElement BM_btn_Continue_after_set_pwd() {
        return BM_btn_Continue_after_set_pwd;
    }
    
    public WebElement BM_btn_LogOff() {
        return BM_btn_LogOff;
    }

    @FindBy(locator = "dw.checkout.rewardsandcoupons.section.coupons.itemid.confirmsubmitpage")
    private WebElement sectioncouponitemidconfirmsubmitpage;

    public WebElement getsectioncouponitemidconfirmsubmitpage() {
        return sectioncouponitemidconfirmsubmitpage;
    }

    public WebElement section_StudentClubs_RedemptionsRewardsPage() {
        return section_StudentClubs_RedemptionsRewardsPage;
    }

    public WebElement section_ShippingHandling_RedemptionsRewardsPage() {
        return section_ShippingHandling_RedemptionsRewardsPage;
    }

    public WebElement btn_Toggle_for_StudentClubs_RedemptionsRewardsPage() {
        return btn_Toggle_for_StudentClubs_RedemptionsRewardsPage;
    }

    public WebElement btn_Toggle_for_ShippingHandling_RedemptionsRewardsPage() {
        return btn_Toggle_for_ShippingHandling_RedemptionsRewardsPage;
    }

    public WebElement label_SubTotal_StudentClubs_RedemptionsRewardsPage() {
        return label_SubTotal_StudentClubs_RedemptionsRewardsPage;
    }

    public WebElement label_ShippingHandling_preAmt_RedemptionsRewardsPage() {
        return label_ShippingHandling_preAmt_RedemptionsRewardsPage;
    }

    public WebElement fld_tax_ShippingHandling_section_RedemptionsRewardsPage() {
        return fld_tax_ShippingHandling_section_RedemptionsRewardsPage;
    }

    public WebElement label_REDEEM_BONUS_COUPONS_REWARDS_StudentClubs_RedemptionsRewardsPage() {
        return label_REDEEM_BONUS_COUPONS_REWARDS_StudentClubs_RedemptionsRewardsPage;
    }

    public WebElement label_BONUS_BANK_StudentClubs_RedemptionsRewardsPage() {
        return label_BONUS_BANK_StudentClubs_RedemptionsRewardsPage;
    }

    public WebElement fld_paragraph_BONUS_BANK_StudentClubs_RedemptionsRewardsPage() {
        return fld_paragraph_BONUS_BANK_StudentClubs_RedemptionsRewardsPage;
    }

    public WebElement label_PAPER_BONUS_StudentClubs_RedemptionsRewardsPage() {
        return label_PAPER_BONUS_StudentClubs_RedemptionsRewardsPage;
    }

    public WebElement fld_paragraph_PAPER_BONUS_StudentClubs_RedemptionsRewardsPage() {
        return fld_paragraph_PAPER_BONUS_StudentClubs_RedemptionsRewardsPage;
    }

    public WebElement label_BONUS_BANK_txtBox_StudentClubs_RedemptionsRewardsPage() {
        return label_BONUS_BANK_txtBox_StudentClubs_RedemptionsRewardsPage;
    }

    public WebElement label_PAPER_BONUS_txtBox_StudentClubs_RedemptionsRewardsPage() {
        return label_PAPER_BONUS_txtBox_StudentClubs_RedemptionsRewardsPage;
    }

    public WebElement label_Student_Clubs_Amt_Owing_RedemptionsRewardsPage() {
        return label_Student_Clubs_Amt_Owing_RedemptionsRewardsPage;
    }

    public WebElement fld_Tot_AmtOwing_Student_Clubs_RedemptionsRewardsPage() {
        return fld_Tot_AmtOwing_Student_Clubs_RedemptionsRewardsPage;
    }

    public WebElement fld_Tot_Items_Student_Clubs_RedemptionsRewardsPage() {
        return fld_Tot_Items_Student_Clubs_RedemptionsRewardsPage;
    }

    public WebElement label_REWARDS_in_RedemptionsRewardsPage() {
        return label_REWARDS_in_RedemptionsRewardsPage;
    }

    public WebElement fld_FreeItem_Promotion_in_RedemptionsRewardsPage() {
        return fld_FreeItem_Promotion_in_RedemptionsRewardsPage;
    }
    
    public WebElement fld_Free_TeacherKit_Promotion_in_RedemptionsRewardsPage() {
        return fld_Free_TeacherKit_Promotion_in_RedemptionsRewardsPage;
    }

    public WebElement lebel_Rewards_Qualifying_order_in_REWARDS_section_in_RedemptionsRewardsPage() {
        return lebel_Rewards_Qualifying_order_in_REWARDS_section_in_RedemptionsRewardsPage;
    }

    public WebElement fld_How_is_Qualifying_order_in_REWARDS_section_in_RedemptionsRewardsPage() {
        return fld_How_is_Qualifying_order_in_REWARDS_section_in_RedemptionsRewardsPage;
    }

    public WebElement fld_TimeAndDate_in_REWARDS_section_in_RedemptionsRewardsPage() {
        return fld_TimeAndDate_in_REWARDS_section_in_RedemptionsRewardsPage;
    }

    public WebElement hdr_StudentClubs_in_RedemptionsRewardsPage() {
        return hdr_StudentClubs_in_RedemptionsRewardsPage;
    }

    public WebElement hdr_ShippingHandling_in_RedemptionsRewardsPage() {
        return hdr_ShippingHandling_in_RedemptionsRewardsPage;
    }

    public WebElement section_TeacherCatalogues_RedemptionsRewardsPage() {
        return section_TeacherCatalogues_RedemptionsRewardsPage;
    }

    public WebElement value_StudentClubSubTotal_RewardsCouponsPage() {
        return value_StudentClubSubTotal_RewardsCouponsPage;
    }

    public WebElement value_GST_StudentClub_RewardsCouponsPage() {
        return value_GST_StudentClub_RewardsCouponsPage;
    }

    public WebElement value_HST_StudentClub_RewardsCouponsPage() {
        return value_HST_StudentClub_RewardsCouponsPage;
    }

    public WebElement value_PST_StudentClub_RewardsCouponsPage() {
        return value_PST_StudentClub_RewardsCouponsPage;
    }

    public WebElement value_QST_StudentClub_RewardsCouponsPage() {
        return value_QST_StudentClub_RewardsCouponsPage;
    }

    public List<WebElement> sizevalue_GST_StudentClub_RewardsCouponsPage() {
        return sizevalue_GST_StudentClub_RewardsCouponsPage;
    }

    public List<WebElement> sizevalue_HST_StudentClub_RewardsCouponsPage() {
        return sizevalue_HST_StudentClub_RewardsCouponsPage;
    }

    public List<WebElement> sizevalue_PST_StudentClub_RewardsCouponsPage() {
        return sizevalue_PST_StudentClub_RewardsCouponsPage;
    }

    public List<WebElement> sizevalue_QST_StudentClub_RewardsCouponsPage() {
        return sizevalue_QST_StudentClub_RewardsCouponsPage;
    }

    public WebElement value_TeacherCatSubTotal_RewardsCouponsPage() {
        return value_TeacherCatSubTotal_RewardsCouponsPage;
    }

    public WebElement value_GST_TeacherCat_RewardsCouponsPage() {
        return value_GST_TeacherCat_RewardsCouponsPage;
    }

    public WebElement value_HST_TeacherCat_RewardsCouponsPage() {
        return value_HST_TeacherCat_RewardsCouponsPage;
    }

    public WebElement value_PST_TeacherCat_RewardsCouponsPage() {
        return value_PST_TeacherCat_RewardsCouponsPage;
    }

    public WebElement value_QST_TeacherCat_RewardsCouponsPage() {
        return value_QST_TeacherCat_RewardsCouponsPage;
    }

    public List<WebElement> sizevalue_GST_TeacherCat_RewardsCouponsPage() {
        return sizevalue_GST_TeacherCat_RewardsCouponsPage;
    }

    public List<WebElement> sizevalue_HST_TeacherCat_RewardsCouponsPage() {
        return sizevalue_HST_TeacherCat_RewardsCouponsPage;
    }

    public List<WebElement> sizevalue_PST_TeacherCat_RewardsCouponsPage() {
        return sizevalue_PST_TeacherCat_RewardsCouponsPage;
    }

    public List<WebElement> sizevalue_QST_TeacherCat_RewardsCouponsPage() {
        return sizevalue_QST_TeacherCat_RewardsCouponsPage;
    }

    public WebElement value_GST_Shipping_RewardsCouponsPage() {
        return value_GST_Shipping_RewardsCouponsPage;
    }

    public WebElement value_HST_Shipping_RewardsCouponsPage() {
        return value_HST_Shipping_RewardsCouponsPage;
    }

    public WebElement value_PST_Shipping_RewardsCouponsPage() {
        return value_PST_Shipping_RewardsCouponsPage;
    }

    public WebElement value_QST_Shipping_RewardsCouponsPage() {
        return value_QST_Shipping_RewardsCouponsPage;
    }

    public List<WebElement> sizevalue_GST_Shipping_RewardsCouponsPage() {
        return sizevalue_GST_Shipping_RewardsCouponsPage;
    }

    public List<WebElement> sizevalue_HST_Shipping_RewardsCouponsPage() {
        return sizevalue_HST_Shipping_RewardsCouponsPage;
    }

    public List<WebElement> sizevalue_PST_Shipping_RewardsCouponsPage() {
        return sizevalue_PST_Shipping_RewardsCouponsPage;
    }

    public List<WebElement> sizevalue_QST_Shipping_RewardsCouponsPage() {
        return sizevalue_QST_Shipping_RewardsCouponsPage;
    }

    public WebElement value_Shipping_standardPrice() {
        return value_Shipping_standardPrice;
    }

    public WebElement value_Shipping_TotalPrice() {
        return value_Shipping_TotalPrice;
    }

    public WebElement tossinQty() {
        return tossinQty;
    }

    public List<WebElement> sizetossinQty() {
        return sizetossinQty;
    }


    public WebElement btnContinueCheckout() {
        return btnContinueCheckout;
    }
    public WebElement headerPaymentsIsActive() {
        return headerPaymentsIsActive;
    }


    public WebElement getbtnMakeSelectionFpf() {
        return btnMakeSelectionFpf;
    }

    public List<WebElement> chkbtnMakeSelectionFpf() {
        return chkbtnMakeSelectionFpf;
    }

    public WebElement getLnkclose() {
        return iconclose;
    }

    public WebElement getLnkcouponpopupCancel() {
        return lnkcouponpopupcancel;
    }

    public WebElement getSectionFpfPromotions() {
        return sectionFpfPromotions;
    }

    public WebElement getLblFpfPromotionDescription() {
        return lblFpfPromotionDescription;
    }

    public WebElement getLnkDueDateSet() {
        return lnkDueDateSet;
    }

    @FindBy(locator = "dw.checkout.parent.orderconfirmation.lbl.header")
    private WebElement lblHeaderOrderConfirmation;

    public WebElement getLblHeaderOrderConfirmation() {
        return lblHeaderOrderConfirmation;
    }

    @FindBy(locator = "dw.checkout.orderconfirmation.info.txt")
    private WebElement lblConfirmationInfo;

    public WebElement getLblConfirmationInfo() {
        return lblConfirmationInfo;
    }

    @FindBy(locator = "dw.checkout.confirmAndSubmit.lbl.errormessage")
    private WebElement lblErrorMessageOnConfirmOrderSubmit;

    @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.txt.cardnumber")
    private WebElement txtCardNumber;

    @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.txt.securitycode")
    private WebElement txtCardSecurityCode;

    @FindBy(locator = "dw.teacher.home.field.bonusbank")
    private WebElement fieldbonubank;
    
    @FindBy(locator = "dw.checkout.rewardscoupons.sfo.bluebar.total")
    private List<WebElement> sizelblrewardscouponssfobluebartotal;
    
    @FindBy(locator = "dw.checkout.rewardscoupons.sfo.bluebar.total")
    private WebElement lblrewardscouponssfobluebartotal;

    @FindBy(locator = "dw.checkout.rewardscoupons.studentclub.bluebar.total")
    private WebElement lblrewardscouponsstudentclubbluebartotal;

    @FindBy(locator = "dw.checkout.rewardscoupons.studentclub.bluebar.qty")
    private WebElement lblrewardscouponsstudentclubbluebarqty;

    @FindBy(locator = "dw.checkout.rewardscoupons.studentclub.subtotal")
    private WebElement lblrewardscouponsstudentclubsubtotal;

    @FindBy(locator = "dw.checkout.rewardscoupons.studentclub.fld.bonus.bank")
    private WebElement lblrewardscouponsstudentclubbonusbank;

    @FindBy(locator = "dw.checkout.rewardscoupons.studentclub.fld.paper.bonus.coupon")
    private WebElement lblrewardscouponsstudentclubpaperbonuscoupon;

    @FindBy(locator = "dw.checkout.rewardscoupons.teacherclub.bluebar.total")
    private WebElement lblrewardscouponsteacherclubbluebartotal;

    @FindBy(locator = "dw.checkout.rewardscoupons.teacherclub.bluebar.qty")
    private WebElement lblrewardscouponsteacherclubbluebarqty;

    @FindBy(locator = "dw.checkout.rewardscoupons.teacherclub.subtotal")
    private WebElement lblrewardscouponsteacherclubsubtotal;

    @FindBy(locator = "dw.checkout.rewardscoupons.teacherclub.fld.bonus.bank")
    private WebElement lblrewardscouponsteacherclubbonusbank;

    @FindBy(locator = "dw.checkout.rewardscoupons.teacherclub.fld.paper.bonus.coupon")
    private WebElement lblrewardscouponsteacherclubpaperbonuscoupon;
    
    @FindBy(locator = "dw.checkout.rewardscoupons.shippingfee.bluebar.total")
    private List<WebElement> sizelblrewardscouponsshippingfeebluebartotal;

    @FindBy(locator = "dw.checkout.rewardscoupons.shippingfee.bluebar.total")
    private WebElement lblrewardscouponsshippingfeebluebartotal;

    @FindBy(locator = "dw.checkout.rewardscoupons.shippingfee.subtotal")
    private WebElement lblrewardscouponsshippingfeesubtotal;

    @FindBy(locator = "dw.checkout.rewardscoupons.shippingclub.fld.bonus.bank")
    private WebElement lblrewardscouponsshippingclubbonusbank;

    @FindBy(locator = "dw.checkout.rewardscoupons.shippingclub.fld.paper.bonus.coupon")
    private WebElement lblrewardscouponsshippingclubpaperbonuscoupon;

    @FindBy(locator = "dw.checkout.rewardscoupons.totalamount.owing")
    private WebElement lblrewardscouponstotalamountowing;

    @FindBy(locator = "dw.checkout.payment.studentclub.subtotal")
    private WebElement lblpaymentstudentclubsubtotal;

    @FindBy(locator = "dw.checkout.payment.studentclub.bluebar.total")
    private WebElement lblpaymentstudentclubbluebartotal;

    @FindBy(locator = "dw.checkout.payment.studentclub.bluebar.qty")
    private WebElement lblpaymentstudentclubbluebarqty;

    @FindBy(locator = "dw.checkout.payment.studentclub.fld.bonus.bank")
    private WebElement lblpaymentstudentclubbonusbank;

    @FindBy(locator = "dw.checkout.payment.studentclub.fld.paper.bonus.coupon")
    private WebElement lblpaymentstudentclubpaperbonuscoupon;

    @FindBy(locator = "dw.checkout.payment.teacherclub.subtotal")
    private WebElement lblpaymentteacherclubsubtotal;

    @FindBy(locator = "dw.checkout.payment.teacherclub.bluebar.total")
    private WebElement lblpaymentteacherclubbluebartotal;

    @FindBy(locator = "dw.checkout.payment.teacherclub.bluebar.qty")
    private WebElement lblpaymentteacherclubbluebarqty;

    @FindBy(locator = "dw.checkout.payment.teacherclub.fld.bonus.bank")
    private WebElement lblpaymentteacherclubbonusbank;

    @FindBy(locator = "dw.checkout.payment.teacherclub.fld.paper.bonus.coupon")
    private WebElement lblpaymentteacherclubpaperbonuscoupon;

    @FindBy(locator = "dw.checkout.payment.shippingfee.subtotal")
    private WebElement lblpaymentshippingfeesubtotal;

    @FindBy(locator = "dw.checkout.payment.shippingfee.bluebar.total")
    private WebElement lblpaymentshippingfeebluebartotal;

    @FindBy(locator = "dw.checkout.payment.shippingclub.fld.bonus.bank")
    private WebElement lblpaymentshippingclubbonusbank;

    @FindBy(locator = "dw.checkout.payment.shippingclub.fld.paper.bonus.coupon")
    private WebElement lblpaymentshippingclubpaperbonuscoupon;

    @FindBy(locator = "dw.checkout.payment.totalamount.owing")
    private WebElement lblpaymenttotalamountowing;

    @FindBy(locator = "dw.checkout.rewardscoupons.bonuscoupon.error.msgbox")
    private WebElement msgbonusbankerrmsg;
    
    @FindBy(locator = "dw.reviewcart.active.RewardsAndCoupons")
    private WebElement RewardsAndCouponsActive;
    
    @FindBy(locator = "dw.checkout.lbl.SFO.total.amount.blue.header")
    private WebElement getSFOTotalBlueHeader;

    public WebElement getSFOTotalBlueHeader() {
        return getSFOTotalBlueHeader;
    }
    
    public WebElement RewardsAndCouponsActive() {
        return RewardsAndCouponsActive;
    }

    public WebElement getfieldbonubank() {
        return fieldbonubank;
    }

    public WebElement getmsgbonusbankerrmsg() {
        return msgbonusbankerrmsg;
    }
    
    public List<WebElement> sizelblrewardscouponssfobluebartotal(){
    	return sizelblrewardscouponssfobluebartotal;
    }
    
    public WebElement getlblrewardscouponssfobluebartotal(){
    	return lblrewardscouponssfobluebartotal;
    }

    public WebElement getlblrewardscouponsstudentclubbluebartotal() {
        return lblrewardscouponsstudentclubbluebartotal;
    }

    public WebElement getlblrewardscouponsstudentclubbluebarqty() {
        return lblrewardscouponsstudentclubbluebarqty;
    }

    public WebElement getlblrewardscouponsstudentclubsubtotal() {
        return lblrewardscouponsstudentclubsubtotal;
    }

    public WebElement getlblrewardscouponsstudentclubbonusbank() {
        return lblrewardscouponsstudentclubbonusbank;
    }

    public WebElement getlblrewardscouponsstudentclubpaperbonuscoupon() {
        return lblrewardscouponsstudentclubpaperbonuscoupon;
    }


    public WebElement getlblrewardscouponsteacherclubbluebartotal() {
        return lblrewardscouponsteacherclubbluebartotal;
    }

    public WebElement getlblrewardscouponsteacherclubbluebarqty() {
        return lblrewardscouponsteacherclubbluebarqty;
    }

    public WebElement getlblrewardscouponsteacherclubsubtotal() {
        return lblrewardscouponsteacherclubsubtotal;
    }


    public WebElement getlblrewardscouponsteacherclubbonusbank() {
        return lblrewardscouponsteacherclubbonusbank;
    }

    public WebElement getlblrewardscouponsteacherclubpaperbonuscoupon() {
        return lblrewardscouponsteacherclubpaperbonuscoupon;
    }
    
    public List<WebElement> sizelblrewardscouponsshippingfeebluebartotal() {
        return sizelblrewardscouponsshippingfeebluebartotal;
    }

    public WebElement getlblrewardscouponsshippingfeebluebartotal() {
        return lblrewardscouponsshippingfeebluebartotal;
    }

    public WebElement getlblrewardscouponsshippingfeesubtotal() {
        return lblrewardscouponsshippingfeesubtotal;
    }

    public WebElement getlblrewardscouponsshippingclubbonusbank() {
        return lblrewardscouponsshippingclubbonusbank;
    }

    public WebElement getlblrewardscouponsshippingclubpaperbonuscoupon() {
        return lblrewardscouponsshippingclubpaperbonuscoupon;
    }

    public WebElement getlblrewardscouponstotalamountowing() {
        return lblrewardscouponstotalamountowing;
    }



    public WebElement getlblpaymentstudentclubsubtotal() {
        return lblpaymentstudentclubsubtotal;
    }

    public WebElement getlblpaymentstudentclubbluebartotal() {
        return lblpaymentstudentclubbluebartotal;
    }

    public WebElement getlblpaymentstudentclubbluebarqty() {
        return lblpaymentstudentclubbluebarqty;
    }

    public WebElement getlblpaymentstudentclubbonusbank() {
        return lblpaymentstudentclubbonusbank;
    }

    public WebElement getlblpaymentstudentclubpaperbonuscoupon() {
        return lblpaymentstudentclubpaperbonuscoupon;
    }


    public WebElement getlblpaymentteacherclubsubtotal() {
        return lblpaymentteacherclubsubtotal;
    }

    public WebElement getlblpaymentteacherclubbluebartotal() {
        return lblpaymentteacherclubbluebartotal;
    }

    public WebElement getlblpaymentteacherclubbluebarqty() {
        return lblpaymentteacherclubbluebarqty;
    }


    public WebElement getlblpaymentteacherclubbonusbank() {
        return lblpaymentteacherclubbonusbank;
    }

    public WebElement getlblpaymentteacherclubpaperbonuscoupon() {
        return lblpaymentteacherclubpaperbonuscoupon;
    }

    public WebElement getlblpaymentshippingfeesubtotal() {
        return lblpaymentshippingfeesubtotal;
    }

    public WebElement getlblpaymentshippingfeebluebartotal() {
        return lblpaymentshippingfeebluebartotal;
    }

    public WebElement getlblpaymentshippingclubbonusbank() {
        return lblpaymentshippingclubbonusbank;
    }

    public WebElement getlblpaymentshippingclubpaperbonuscoupon() {
        return lblpaymentshippingclubpaperbonuscoupon;
    }

    public WebElement getlblpaymenttotalamountowing() {
        return lblpaymenttotalamountowing;
    }


    @FindBy(locator = "dw.checkout.payment.studentclub.gst.total")
    private WebElement lblpaymentstudentclubgstvalue;

    @FindBy(locator = "dw.checkout.payment.studentclub.pst.total")
    private WebElement lblpaymentstudentclubpstvalue;

    @FindBy(locator = "dw.checkout.payment.studentclub.qst.total")
    private WebElement lblpaymentstudentclubqstvalue;

    @FindBy(locator = "dw.checkout.payment.studentclub.hst.total")
    private WebElement lblpaymentstudentclubhstvalue;

    @FindBy(locator = "dw.checkout.payment.studentclub.subtotal")
    private WebElement lblpaymentstudentclubsubtotalvalue;

    @FindBy(locator = "dw.checkout.payment.teacherclub.gst.total")
    private WebElement lblpaymentteacherclubgstvalue;

    @FindBy(locator = "dw.checkout.payment.teacherclub.pst.total")
    private WebElement lblpaymentteacherclubpstvalue;

    @FindBy(locator = "dw.checkout.payment.teacherclub.qst.total")
    private WebElement lblpaymentteacherclubqstvalue;

    @FindBy(locator = "dw.checkout.payment.teacherclub.hst.total")
    private WebElement lblpaymentteacherclubhstvalue;

    @FindBy(locator = "dw.checkout.payment.teacherclub.subtotal")
    private WebElement lblpaymentteacherclubsubtotalvalue;

    @FindBy(locator = "dw.checkout.payment.shipping.gst.total")
    private WebElement lblpaymentshippinggstvalue;

    @FindBy(locator = "dw.checkout.payment.shipping.gst.total")
    private List<WebElement> sizelblpaymentshippinggstvalue;

    @FindBy(locator = "dw.checkout.payment.shipping.pst.total")
    private WebElement lblpaymentshippingpstvalue;

    @FindBy(locator = "dw.checkout.payment.shipping.qst.total")
    private WebElement lblpaymentshippingqstvalue;

    @FindBy(locator = "dw.checkout.payment.shipping.hst.total")
    private WebElement lblpaymentshippinghstvalue;

    @FindBy(locator = "dw.checkout.payment.shippingandhandling.bluebar")
    private WebElement lblpaymentshippingandhandlingbluebar;


    public WebElement getlblpaymentstudentclubgstvalue() {
        return lblpaymentstudentclubgstvalue;
    }

    public WebElement getlblpaymentstudentclubpstvalue() {
        return lblpaymentstudentclubpstvalue;
    }

    public WebElement getlblpaymentstudentclubqstvalue() {
        return lblpaymentstudentclubqstvalue;
    }

    public WebElement getlblpaymentstudentclubhstvalue() {
        return lblpaymentstudentclubhstvalue;
    }

    public WebElement getlblpaymentstudentclubsubtotalvalue() {
        return lblpaymentstudentclubsubtotalvalue;
    }

    public WebElement getlblpaymentteacherclubgstvalue() {
        return lblpaymentteacherclubgstvalue;
    }

    public WebElement getlblpaymentteacherclubpstvalue() {
        return lblpaymentteacherclubpstvalue;
    }

    public WebElement getlblpaymentteacherclubqstvalue() {
        return lblpaymentteacherclubqstvalue;
    }

    public WebElement getlblpaymentteacherclubhstvalue() {
        return lblpaymentteacherclubhstvalue;
    }

    public WebElement getlblpaymentteacherclubsubtotalvalue() {
        return lblpaymentteacherclubsubtotalvalue;
    }

    public WebElement getlblpaymentshippinggstvalue() {
        return lblpaymentshippinggstvalue;
    }

    public List<WebElement> sizegetlblpaymentshippinggstvalue() {
        return sizelblpaymentshippinggstvalue;
    }

    public WebElement getlblpaymentshippingpstvalue() {
        return lblpaymentshippingpstvalue;
    }

    public WebElement getlblpaymentshippingqstvalue() {
        return lblpaymentshippingqstvalue;
    }

    public WebElement getlblpaymentshippinghstvalue() {
        return lblpaymentshippinghstvalue;
    }

    public WebElement getlblpaymentshippingandhandlingbluebar() {
        return lblpaymentshippingandhandlingbluebar;
    }



    public WebElement getLblErrorMessageOnConfirmOrderSubmit() {
        return lblErrorMessageOnConfirmOrderSubmit;
    }

    public WebElement getTxtCardSecurityCode() {
        return txtCardSecurityCode;
    }

    public WebElement getTxtCardNumber() {
        return txtCardNumber;
    }

    public WebElement getLblOrderNumber() {
        return lblOrderNumber;
    }

    public WebElement getLblOrderStatus() {
        return lblOrderStatus;
    }

    public WebElement getLblOrderDate() {
        return lblOrderDate;
    }

    @FindBy(locator = "dw.checkout.rewardsandcoupons.teacher.popupinsufficientbonuspts.gotoyourteacherorder")
    private WebElement btnPopUpGotoyourteacherorder;

    public WebElement getBtnPopUpGotoSFO() {
        return btnPopUpGotoSFO;
    }

    @FindBy(locator = "dw.checkout.rewardsandcoupons.teacher.popupincompletesfo.gotoreview")
    private WebElement btnPopUpGotoSFO;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.teacher.popupinsufficientbonuspts.lbl.insuffientbonusmessage")
    private WebElement lblPopUpGoInsufficientBPNote;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.teacher.popupinsufficientbonuspts.lbl.instructionalmessage")
    private WebElement lblPopUpGoInstructionalMessage;

    public WebElement getLblPopUpGoInstructionalMessage() {
        return lblPopUpGoInstructionalMessage;
    }

    public void setLblPopUpGoInstructionalMessage(
            WebElement lblPopUpGoInstructionalMessage) {
        this.lblPopUpGoInstructionalMessage = lblPopUpGoInstructionalMessage;
    }

    public WebElement getLblPopUpGoInsufficientBPNote() {
        return lblPopUpGoInsufficientBPNote;
    }

    public void setLblPopUpGoInsufficientBPNote(WebElement lblInsufficientBPNote) {
        this.lblPopUpGoInsufficientBPNote = lblInsufficientBPNote;
    }

    public WebElement getBtnPopUpGotoyourteacherorder() {
        return btnPopUpGotoyourteacherorder;
    }

    public void setBtnPopUpGotoyourteacherorder(WebElement btnPopUpGotoyourteacherorder) {
        this.btnPopUpGotoyourteacherorder = btnPopUpGotoyourteacherorder;
    }

    public WebElement getLblVisibleRemoveCouponPopUp() {
        return lblVisibleRemoveCouponPopUp;
    }

    public ShippingAndPayment getShippingAndPayment() {
        return shippingAndPayment;
    }

    public WebElement getInActiveCompletedRewardsTab() {
        return InActiveCompletedRewardsTab;
    }

    public WebElement getLblCouponCode() {
        return lblCouponCode;
    }

    public WebElement getLblCouponItemsDescription() {
        return lblCouponItemsDescription;
    }

    public WebElement getLblInVisibleRemoveCouponPopUp() {
        return lblInVisibleRemoveCouponPopUp;
    }

    public WebElement getInActiveCompletedShippingTab() {
        return InActiveCompletedShippingTab;
    }

    public WebElement getLblCreditCardInfo() {
        return lblCreditCardInfo;
    }

    public WebElement getInActiveSubmitTab() {
        return InActiveSubmitTab;
    }

    public WebElement getInActiveRewardsTab() {
        return InActiveCompletedRewardsTab;
    }

    public WebElement getInActiveShippingTab() {
        return InActiveCompletedShippingTab;
    }



    @FindBy(locator = "dw.checkout.shippingandpayment.tab.unactivecompletedshippingtab")
    private WebElement InActiveCompletedShippingTab;

    public WebElement getActiveShippingTabBlue() {
        return activeShippingTabBlue;
    }

    public WebElement getActiveSubmitTabBlue() {
        return activeSubmitTabBlue;
    }

    public WebElement getActiveRewardsTabBlue() {
        return activeRewardsTabBlue;
    }

    public WebElement getLblCheckout() {
        return lblCheckout;
    }

    public WebElement getCouponsModel() {
        return couponsModel;
    }

    @Override
    public WebElement getFrmPayPalLogin() {
        return frmPayPalLogin;
    }

    @Override
    public WebElement getTxtPayPalEmail() {
        return txtPayPalEmail;
    }

    @Override
    public WebElement getTxtPayPalPassword() {
        return txtPayPalPassword;
    }

    @Override
    public WebElement getBtnPayPalLogin() {
        return btnPayPalLogin;
    }

    @Override
    public WebElement getBtnPayPalAgreeAndContinue() {
        return btnPayPalAgreeAndContinue;
    }

    @Override
    public WebElement getBtnPayPalContinue() {
        return btnPayPalContinue;
    }

    @Override
    public WebElement getLnkHome() {
        return lnkHome;
    }

    @Override
    public WebElement getCheckoutLabel_Confirmpage() {
        return CheckoutLabel_Confirmpage;
    }

    @Override
    public List<WebElement> getCheckoutPhases_Confirmpage() {
        return CheckoutPhases_Confirmpage;
    }

    @FindBy(locator = "dw.checkout.stepnavigation.lbl.rewardsandcoupons")
    private WebElement lblStepRewardsAndCoupons;

    @FindBy(locator = "dw.checkout.stepnavigation.lbl.shippingandpayment")
    private WebElement lblStepShippingAndPayment;



    @FindBy(locator = "dw.checkout.stepnavigation.lbl.confirmandsubmit")
    private WebElement lblStepConfirmAndSubmit;

    @FindBy(locator = "dw.checkout.lnk.home")
    private WebElement lnkHome;

    @FindBy(locator = "dw.checkout.lbl.confirmpage.checkout")
    private WebElement CheckoutLabel_Confirmpage;

    @FindBy(locator = "dw.checkout.lbl.confirmpage.checkoutphases")
    private List<WebElement> CheckoutPhases_Confirmpage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.img.goldappleicon")
    private WebElement imgGoldAppleIcon;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.img.redappleicon")
    private WebElement imgRedAppleIcon;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.img.greenappleicon")
    private WebElement imgGreenAppleIcon;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.lnk.goldapplenotclickableicon")
    private WebElement lnkGoldAppleNotClickable;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.lnk.redapplenotclickableicon")
    private WebElement lnkRedAppleNotClickable;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.lnk.greenapplenotclickableicon")
    private WebElement lnkGreenAppleNotClickable;

    @FindBy(locator = "dw.checkout.shippingandpayment.payment.paypal.lnk.change")
    private WebElement lnkChangePaypalSection;

    @FindBy(locator = "dw.checkout.shippingandpayment.payment.paypal.cart")
    private WebElement lblPaypalCart;

    public WebElement getLblPaypalCart() {
        return lblPaypalCart;
    }

    @FindBy(locator = "dw.checkout.shippingandpayment.teacher.lbl.nopaymentneedednote")
    private WebElement lblNoPaymentNeededNote;

    @FindBy(locator = "dw.checkout.shippingandpayment.payment.paypal.lnk.cancel")
    private WebElement lnkCancelPaypalSection;

    public WebElement getLnkCancelPaypalSection() {
        return lnkCancelPaypalSection;
    }

    @FindBy(locator = "dw.checkout.shippingandpayment.payment.paypal.change.lst.paymentoptions")
    private List<WebElement> lstPaymentOptionsPaypalSection;

    @FindBy(locator = "dw.checkout.shippingandpayment.payment.paypal.change.lbl.walletheading")
    private WebElement lblWalletHeadingPaypalSection;

    @FindBy(locator = "dw.checkout.shippingandpayment.payment.paypal.change.lbl.paymentwalletlist")
    private List<WebElement> lblWalletList;

    public List<WebElement> getLblWalletList() {
        return lblWalletList;
    }

    @FindBy(locator = "dw.checkout.shippingandpayment.payment.paypal.change.lbl.paymentmethodupdated")
    private WebElement lblPaymentMethodUpdatedMsgPaypalSection;

    @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.info")
    private WebElement lblCreditCardInfo;

    @FindBy(locator = "dw.checkout.parent.shippingandpayment.paymentsection.lst.chilnames")
    private List<WebElement> lstChildNames;

    @FindBy(locator = "dw.checkout.confirmandsubmitorder.lbl.contentassetmessage")
    private WebElement lblContentAssetMessageOfConfirmAndSubmit;

    @FindBy(locator = "dw.checkout.confirmandsubmitorder.lbl.recommandedcartrigestitle")
    private List<WebElement> lstLblCartRiges;

    @FindBy(locator = "dw.checkout.confirmandsubmitorder.lbl.active.recommandeditems")
    private List<WebElement> lstActiveRecommandationItems;

    public List<WebElement> getLstActiveRecommandationItems() {
        return lstActiveRecommandationItems;
    }

    @FindBy(locator = "dw.checkout.confirmandsubmitorder.lbl.total.recommandeditems")
    private List<WebElement> lstTotalRecommandationItems;

    @FindBy(locator = "dw.checkout.confirmandsubmitorder.lbl.prv.bubblearrow.recommandeditems")
    private WebElement bubblePrvArrowReccItems;

    @FindBy(locator = "dw.checkout.confirmandsubmitorder.lbl.nxt.bubblearrow.recommandeditems")
    private WebElement bubbleNxtArrowReccItems;

    public WebElement getBubbleNxtArrowReccItems() {
        return bubbleNxtArrowReccItems;
    }

    public WebElement getBubblePrvArrowReccItems() {
        return bubblePrvArrowReccItems;
    }

    public List<WebElement> getLstTotalRecommandationItems() {
        return lstTotalRecommandationItems;
    }

    public List<WebElement> getLstLblCartRiges() {
        return lstLblCartRiges;
    }

    public WebElement getLblContentAssetMessageOfConfirmAndSubmit() {
        return lblContentAssetMessageOfConfirmAndSubmit;
    }

    public List<WebElement> getLstChildNames() {
        return lstChildNames;
    }

    public void setLstChildNames(List<WebElement> lstChildNames) {
        this.lstChildNames = lstChildNames;
    }

    public WebElement getPriceByLabel(String label) {
        return findElement("dw.checkout.lbl.pricebylabel", label, label);
    }

    @FindBy(locator = "dw.checkout.couponsandrewards.lbl.shippingandhandling.totalprice")
    private WebElement lblCouponsandRewardsShippingandHandlingTotalPrice;

    @FindBy(locator = "dw.checkout.couponsandrewards.lbl.shippingandhandling.bluebar")
    private WebElement lblCouponsandRewardsShippingandHandlingBlueBar;
    
    @FindBy(locator = "dw.checkout.lbl.shippingandhandling.bluebar")
    private List<WebElement> sizelblShippingandHandlingBlueBar;

    @FindBy(locator = "dw.freepickmodal.confirmationselectionModal.title")
    private WebElement  Freepick_modal_confirmselection_title;

    @FindBy(locator = "dw.freepick.confirmationgrid.display.title")
    private WebElement  freepickitemdisplayed;

    @FindBy(locator = "dw.freepick.modal.crossicon.close")
    private WebElement  closecross_freepickmodal;

    public WebElement getlblCouponsandRewardsShippingandHandlingTotalPrice() {
        return lblCouponsandRewardsShippingandHandlingTotalPrice;
    }
    
    public List<WebElement> sizelblShippingandHandlingBlueBar() {
        return sizelblShippingandHandlingBlueBar;
    }

    public WebElement getlblCouponsandRewardsShippingandHandlingBlueBar() {
        return lblCouponsandRewardsShippingandHandlingBlueBar;
    }
    public WebElement getFreepick_modal_confirmselection_title() {
        return Freepick_modal_confirmselection_title;
    }


    public WebElement getfreepickItemselected() {
        return freepickitemdisplayed;
    }
    public WebElement get_closecross_freepickmodal() {
        return closecross_freepickmodal;
    }

    @FindBy(locator = "dw.checkout.couponsandrewards.lbl.shippingandhandling.standardshipping")
    private WebElement lblCouponsandRewardsShippingandHandlingStandardShipping;

    public WebElement getlblCouponsandRewardsShippingandHandlingStandardShipping() {
        return lblCouponsandRewardsShippingandHandlingStandardShipping;
    }

    public WebElement getImgRedAppleIcon() {
        return imgRedAppleIcon;
    }

    public WebElement getImgGreenAppleIcon() {
        return imgGreenAppleIcon;
    }

    public WebElement getImgGoldAppleIcon() {
        return imgGoldAppleIcon;
    }

    public WebElement getLnkGoldAppleNotClickable() {
        return lnkGoldAppleNotClickable;
    }

    public WebElement getLnkRedAppleNotClickable() {
        return lnkRedAppleNotClickable;
    }

    public WebElement getLnkGreenAppleNotClickable() {
        return lnkGreenAppleNotClickable;
    }

    public WebElement getLnkChangePaypalSection() {
        return lnkChangePaypalSection;
    }

    public WebElement getLblNoPaymentNeededNote() {
        return lblNoPaymentNeededNote;
    }

    public List<WebElement> getLstPaymentOptionsPaypalSection() {
        return lstPaymentOptionsPaypalSection;
    }

    public WebElement getLblWalletHeadingPaypalSection() {
        return lblWalletHeadingPaypalSection;
    }

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.student.apply")
    private WebElement couponspagestudentapplybtn;

    public WebElement getcouponspagestudentapplybtn() {
        return couponspagestudentapplybtn;
    }

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.student.apply")
    private List<WebElement> sizecouponspagestudentapplybtn;

    public List<WebElement> sizecouponspagestudentapplybtn() {
        return sizecouponspagestudentapplybtn;
    }

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.teacher.apply")
    private WebElement couponspageteacherapplybtn;

    public WebElement getcouponspageteacherapplybtn() {
        return couponspageteacherapplybtn;
    }

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.teacher.apply")
    private List<WebElement> sizecouponspageteacherapplybtn;

    public List<WebElement> sizecouponspageteacherapplybtn() {
        return sizecouponspageteacherapplybtn;
    }


    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.ship.apply")
    private WebElement couponspageshipapplybtn;

    public WebElement getcouponspageshipapplybtn() {
        return couponspageshipapplybtn;
    }

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.ship.apply")
    private List<WebElement> sizecouponspageshipapplybtn;

    public List<WebElement> sizecouponspageshipapplybtn() {
        return sizecouponspageshipapplybtn;
    }

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.student.edit")
    private WebElement couponspagestudenteditbtn;

    public WebElement getcouponspagestudenteditbtn() {
        return couponspagestudenteditbtn;
    }

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.student.edit")
    private List<WebElement> sizecouponspagestudenteditbtn;

    public List<WebElement> sizecouponspagestudenteditbtn() {
        return sizecouponspagestudenteditbtn;
    }

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.teacher.edit")
    private WebElement couponspageteachereditbtn;

    public WebElement getcouponspageteachereditbtn() {
        return couponspageteachereditbtn;
    }

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.teacher.edit")
    private List<WebElement> sizecouponspageteachereditbtn;

    public List<WebElement> sizecouponspageteachereditbtn() {
        return sizecouponspageteachereditbtn;
    }

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.ship.edit")
    private WebElement couponspageshipeditbtn;

    public WebElement getcouponspageshipeditbtn() {
        return couponspageshipeditbtn;
    }

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.ship.edit")
    private List<WebElement> sizecouponspageshipeditbtn;

    public List<WebElement> sizecouponspageshipeditbtn() {
        return sizecouponspageshipeditbtn;
    }


    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.student.skip")
    private List<WebElement> sizecouponspagestudentskipbtn;

    public List<WebElement> sizecouponspagestudentskipbtn() {
        return sizecouponspagestudentskipbtn;
    }

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.teacher.skip")
    private List<WebElement> sizecouponspageteacherskipbtn;

    public List<WebElement> sizecouponspageteacherskipbtn() {
        return sizecouponspageteacherskipbtn;
    }


    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.ship.skip")
    private List<WebElement> sizecouponspageshipskipbtn;

    public List<WebElement> sizecouponspageshipskipbtn() {
        return sizecouponspageshipskipbtn;
    }

    @FindBy(locator = "dw.checkout.paypal.btn.agreeandcontinue")
    private WebElement paypalAgreeAndContinuebtn;

    public WebElement getPaypalAgreeAndContinuebtn() {
        return paypalAgreeAndContinuebtn;
    }

    public WebElement getLblPaymentMethodUpdatedMsgPaypalSection() {
        return lblPaymentMethodUpdatedMsgPaypalSection;
    }

    public WebElement getLblPaymentOption(String optionName) {
        return SCHUtils.findElement(
                "dw.checkout.shippingandpayment.payment.paypal.change.lbl.paymentoption",
                optionName);
    }

    public WebElement getRowofStudentCouponRedeemedTable(String studentname,
                                                         String couponcode) {
        return SCHUtils.findElement("dw.checkout.student.coupon.redeemed.table.row",
                studentname, couponcode);
    }

    public WebElement getRowofStudentCouponOrderOnThankYouPage(String studentname,
                                                               String couponcode) {
        return SCHUtils.findElement("dw.checkout.thankyou.order.row", studentname,
                couponcode);
    }


    @FindBy(locator = "dw.checkout.proceedtocheckout.bonuspointmodel.lbl.currenttotalorder")
    private WebElement lblcheckoutpopuprewardstablecurrenttotalorder;

    public WebElement getlblcheckoutpopuprewardstablecurrenttotalorder() {
        return lblcheckoutpopuprewardstablecurrenttotalorder;
    }

    @FindBy(locator = "dw.checkout.flyerspage.btn.updatecart")
    private WebElement btncheckoutflyerpageupdatecart;

    public WebElement getbtncheckoutflyerpageupdatecart() {
        return btncheckoutflyerpageupdatecart;
    }

    @FindBy(locator = "dw.checkout.flyerspage.btn.updatecart")
    private List<WebElement> sizebtncheckoutflyerpageupdatecart;

    public List<WebElement> sizebtncheckoutflyerpageupdatecart() {
        return sizebtncheckoutflyerpageupdatecart;
    }

    @Override
    public WebElement getLblPageSubTitle() {
        return lblPageSubTitle;
    }

    @Override
    public WebElement getBtnReturnToShop() {
        return btnReturnToShop;
    }

    @Override
    public WebElement getLblStepRewardsAndCoupons() {
        return lblStepRewardsAndCoupons;
    }

    @Override
    public WebElement getLblStepShippingAndPayment() {
        return lblStepShippingAndPayment;
    }





    @Override
    public WebElement getLblStepConfirmAndSubmit() {
        return lblStepConfirmAndSubmit;
    }

    @Override
    public void waitForPageLoad() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void openPage() {
        // TODO Auto-generated method stub

    }

    @Override
    public RewardsAndCoupons getRewardsAndCouponsSection() {
        return new RewardsAndCoupons();
    }



    @Override
    public void updatePaypalWallet() {
        if (getTestBase().getTestData().getString("walletoption") != null && getTestBase()
                .getTestData().getString("walletoption").trim().length() > 0) {
            Assert.assertTrue(getLblWalletList().size() > 0);
            getLblPaymentOption(getTestBase().getTestData().getString("walletoption"))
                    .click();
        } else {
            SCHUtils.waitForLoaderToDismiss();
            Assert.assertTrue(getLblWalletList().size() > 0);
            SCHUtils.clickUsingJavaScript(getLblWalletList().get(1));
        }

    }

    @Override
    public void verifyConfirmatinInfo() {

        AssertUtils.assertTextMatches(getLblConfirmationInfo(),
                Matchers.containsString(ConstantUtils.CONFIRMATION_INFO));

    }

    public class RewardsAndCoupons extends BaseTestPage<TestPage> {

        @FindBy(locator = "dw.checkout.rewardsandcoupons.coupons.btn.edit")
        private WebElement btnEditCoupon;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.bonuspointactivity.beginningbonuspoint")
        private WebElement lblBeginningBonusPoint;


        @FindBy(locator = "dw.checkout.rewardsandcoupons.lnk.BackToShop")
        private WebElement lnkBackToShop;

        public WebElement getlblRewardDetailOnDollarToSpendSection() {
            return lblRewardDetailOnDollarToSpendSection;
        }


        public WebElement getlblRewardDetailOnDollarToSpendSection_Header_DTSModel() {
            return lblRewardDetailOnDollarToSpendSection_header_dtsmodel;
        }

        public WebElement getlblRewardDetailOnDollarToSpendSelectedArea() {
            return lblRewardDetailOnDollarToSpendSelectedArea;
        }

        public WebElement getlblRewardDetailOnDollarToSpendQuantitySubmitOrderPage() {
            return lblRewardDetailOnDollarToSpendQuantitySubmitOrderPage;
        }

        public WebElement getLblBeginningBonusPoint() {
            return lblBeginningBonusPoint;
        }

        public WebElement getLnkBackToShop() {
            return lnkBackToShop;
        }

        public void setLblBeginningBonusPoint(WebElement lblBeginningBonusPoint) {
            this.lblBeginningBonusPoint = lblBeginningBonusPoint;
        }

        public WebElement getLblBonuspointsCouponRedeemed() {
            return lblBonuspointsCouponRedeemed;
        }



        public void setLblBonuspointsCouponRedeemed(
                WebElement lblBonuspointsCouponRedeemed) {
            this.lblBonuspointsCouponRedeemed = lblBonuspointsCouponRedeemed;
        }

        public WebElement getLblExtraBonusPointsRewards() {
            return lblExtraBonusPointsRewards;
        }

        public void setLblExtraBonusPointsRewards(WebElement lblExtraBonusPointsRewards) {
            this.lblExtraBonusPointsRewards = lblExtraBonusPointsRewards;
        }

        public WebElement getLblPointsPerDollarSpent() {
            return lblPointsPerDollarSpent;
        }

        public void setLblPointsPerDollarSpent(WebElement lblPointsPerDollarSpent) {
            this.lblPointsPerDollarSpent = lblPointsPerDollarSpent;
        }

        public WebElement getLblTotalBonusPointSearned() {
            return lblTotalBonusPointSearned;
        }

        public void setLblTotalBonusPointSearned(WebElement lblTotalBonusPointSearned) {
            this.lblTotalBonusPointSearned = lblTotalBonusPointSearned;
        }

        public WebElement getLblBonusPointUsed() {
            return lblBonusPointUsed;
        }

        public void setLblBonusPointUsed(WebElement lblBonusPointUsed) {
            this.lblBonusPointUsed = lblBonusPointUsed;
        }

        public WebElement getLblEndingBonusPointBalance() {
            return lblEndingBonusPointBalance;
        }

        public void setLblEndingBonusPointBalance(WebElement lblEndingBonusPointBalance) {
            this.lblEndingBonusPointBalance = lblEndingBonusPointBalance;
        }

        public List<WebElement> chkBtnSkip() {
            return chkbtnSkip;

        }


        @FindBy(locator = "dw.checkout.rewardsandcoupons.bonuspointactivity.bonuspointscouponredeemed")
        private WebElement lblBonuspointsCouponRedeemed;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.bonuspointactivity.extrabonuspointsrewards")
        private WebElement lblExtraBonusPointsRewards;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.bonuspointactivity.pointsperdollarspent")
        private WebElement lblPointsPerDollarSpent;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.bonuspointactivity.totalbonuspointsearned")
        private WebElement lblTotalBonusPointSearned;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.bonuspointactivity.bonuspointused")
        private WebElement lblBonusPointUsed;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.bonuspointactivity.endingbonuspointbalance")
        private WebElement lblEndingBonusPointBalance;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.coupons.txt.couponcode")
        private WebElement txtCouponeCode;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.coupons.btn.apply")
        private WebElement btnApplyCoupon;

        @FindBy(locator = "dw.checkout.rewardsandcoupon.bonus.paper.btn.apply")
        private WebElement btnApplyBonusPaper;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.Skip")
        private WebElement btnSkip;


        @FindBy(locator = "dw.checkout.rewardsandcoupons.chkbtn.Skip")
        private List<WebElement> chkbtnSkip;


        @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.continuecheckout")
        private WebElement btnContinueCheckout;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.coupons.lbl.coupons")
        private WebElement lblCoupons;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.lbl.rewards")
        private WebElement lblRewards;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.txt.noofstudents")
        private WebElement txtNoOfStudents;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.lbl.rewardsinfo")
        private WebElement lblRewardsInfo;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.bonuspoint.lbl.message")
        private WebElement lblInsufficientBonusPointMessage;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.lbl.errormessage")
        private WebElement lblErrorMessage;
        
        
        @FindBy(locator = "dw.connecttoteacher.cannotlocateschool.lbl.errormessage")
        private WebElement ctt_cannotlocateschool_lblErrorMessage;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.coupondetail.icon.deletecoupon")
        private List<WebElement> iconDeleteCoupon;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.lbl.tossin")
        private WebElement lblTossIn;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.section.coupons.confirmsubmitpage")
        private WebElement sectioncouponconfirmsubmitpage;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.coupon.bonuspercentage")
        private WebElement lblrewardscouponsbonuspercentagemanual;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.coupon.bonuspercentage.name")
        private WebElement lblrewardscouponsbonuspercentagemanualname;

        public WebElement getSectionCouponconfirmSubmitPage() {
            return sectioncouponconfirmsubmitpage;
        }

        public WebElement getlblrewardscouponsbonuspercentagemanual() {
            return lblrewardscouponsbonuspercentagemanual;
        }
        
        
        public WebElement ctt_cannotlocateschool_lblErrorMessage() {
            return ctt_cannotlocateschool_lblErrorMessage;
        }
        
        @FindBy(locator = "dw.connecttoteacher.noteacherfound.lbl.errormessage")
    	private WebElement ctt_noteacherfoundlblerrormessage;

        public WebElement getlblrewardscouponsbonuspercentagemanualname() {
            return lblrewardscouponsbonuspercentagemanualname;
        }

    	public WebElement ctt_noteacherfoundlblerrormessage() {
    		return ctt_noteacherfoundlblerrormessage;
    	}

        public WebElement getLblTossIn() {
            return lblTossIn;
        }

        public WebElement getbtnApplyBonusPaper() {
            return btnApplyBonusPaper;
        }

        @FindBy(locator = "dw.checkout.confirmandsubmit.lbl.tossin")
        private WebElement freePromotionConfSubmit;

        public WebElement getFreePromoCnfmSubmit() {
            return freePromotionConfSubmit;
        }

        @FindBy(locator = "dw.checkout.confirmsubmitpage.section.rewards")
        private WebElement sectionconfirmsubmitpagerewards;

        public WebElement getsectionconfirmsubmitpagerewards() {
            return sectionconfirmsubmitpagerewards;
        }

        @FindBy(locator = "dw.checkout.rewardsandcoupons.coupon.popup.removeYes")
        private WebElement btnRemoveCouponYes;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.txt.rewardqanda")
        private WebElement txtRewardQandA;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.txt.rewardqandaDefault0")
        private WebElement txtRewardQandADefault0;


        //  fix Satnam

        @FindBy(locator = "dw.reviewcart.rewardsandcoupons.rewards.newrewardqanda")
        private WebElement txtNewRewardQandA;

        public WebElement getTxtNewRewardQandA(){
            return txtNewRewardQandA;
        }

        @FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.txt.error.rewardqanda")
        private WebElement TxtErrorRewardQandA;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.lbl.rewardqanda")
        private WebElement lblRewardQandA;


        @FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.lbl.rewardqanda")
        private List<WebElement> chklblRewardQandA;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.lbl.rewarderrormessage")
        private List<WebElement> lblErrorMessageReward;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.msg.rewarderrormessage")
        private WebElement msgErrorMessageReward;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.order.TotalAmountOwing")
        private WebElement lblTotalAmountOwing;


        @FindBy(locator = "dw.checkout.confirmsubmitpage.order.TotalAmountOwing")
        private WebElement lblConfirmPageTotalAmountOwing;

        public WebElement getlblTotalAmountOwing() {
            return lblTotalAmountOwing;
        }

        public WebElement getlblConfirmPageTotalAmountOwing() {
            return lblConfirmPageTotalAmountOwing;
        }

        public WebElement getTxtRewardQandA() {
            return txtRewardQandA;
        }

        public WebElement getTxtRewardQandADefault0() {
            return txtRewardQandADefault0;
        }


        public WebElement getTxtErrorRewardQandA() {
            return TxtErrorRewardQandA;
        }

        public void setTxtRewardQandA(WebElement txtRewardQandA) {
            this.txtRewardQandA = txtRewardQandA;
        }

        public WebElement getLblRewardQandA() {
            return lblRewardQandA;
        }

        public List<WebElement> chkLblRewardQandA() {
            return chklblRewardQandA;
        }

        public void setLblRewardQandA(WebElement lblRewardQandA) {
            this.lblRewardQandA = lblRewardQandA;
        }

        public WebElement getBtnRemoveCouponYes() {
            return btnRemoveCouponYes;
        }

        public void setBtnRemoveCouponYes(WebElement btnRemoveCouponYes) {
            this.btnRemoveCouponYes = btnRemoveCouponYes;
        }

        @FindBy(locator = "dw.checkout.rewardsandcoupons.coupon.popup.removeNo")
        private WebElement btnRemoveCouponNo;

        public WebElement getBtnRemoveCouponNo() {
            return btnRemoveCouponNo;
        }

        @FindBy(locator = "dw.checkout.rewardsandcoupons.lbl.couponmodule")
        private WebElement lblCouponModule;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.coupondetail.lst.couponname")
        private List<WebElement> lstCouponName;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.lbl.carttotal")
        private WebElement lblCartTotal;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.lbl.pointsperdollar")
        private WebElement lblBonusPointsPerDollar;

        @FindBy(locator = "dw.freepromotion.text.name")
        private WebElement backToShopLink;


        @FindBy(locator = "dw.teacher.dts.modelwindow.itemprice1")
        private WebElement lblDtsModelwindowItemPrice1;

        @FindBy(locator = "dw.teacher.coupon.popup.btn.confirmandapply")
        private WebElement btnConfirmAndApply;

        public WebElement getlblDtsModelwindowItemPrice1() {
            return lblDtsModelwindowItemPrice1;
        }

        public WebElement getBtnConfirmAndApply() {
            return btnConfirmAndApply;
        }


        public WebElement getBackToShop() {
            return backToShopLink;
        }


        public WebElement getLblBonusPointsPerDollar() {
            return lblBonusPointsPerDollar;
        }

        public WebElement getLblCartTotal() {
            return lblCartTotal;
        }

        public WebElement getBonusPointsBasedOnAttribute(String attributeName) {
            return SCHUtils.findElement(
                    "dw.checkout.rewardsandcoupons.lbl.bonuspointvalue", attributeName);
        }

        public List<WebElement> getLstCouponName() {
            return lstCouponName;
        }

        public WebElement getLblCouponModule() {
            return lblCouponModule;
        }

        public WebElement getLblInsufficientBonusPointMessage() {
            return lblInsufficientBonusPointMessage;
        }

        public WebElement getBonusPointsByLabel(String label) {
            return findElement(
                    "dw.checkout.rewardsandcoupons.bonuspointactivity.lbl.bonuspointbylabel",
                    label);
        }

        public WebElement getTxtCouponeCode() {
            return txtCouponeCode;
        }

        public WebElement getBtnEditCoupon() {
            return btnEditCoupon;
        }

        public WebElement getBtnApplyCoupon() {
            return btnApplyCoupon;
        }

        public WebElement getBtnSkip() {
            return btnSkip;


        }



        public WebElement getBtnContinueCheckout() {
            return btnContinueCheckout;
        }

        public WebElement getLblCoupons() {
            return lblCoupons;
        }

        public WebElement getLblRewards() {
            return lblRewards;
        }

        public WebElement getTxtNoOfStudents() {
            return txtNoOfStudents;
        }

        public WebElement getLblRewardsInfo() {
            return lblRewardsInfo;
        }

        public WebElement getLblErrorMessage() {
            return lblErrorMessage;
        }

        public List<WebElement> getIconDeleteCoupon() {
            return iconDeleteCoupon;

        }


        @FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.chk.txt.rewardqanda")
        private List<WebElement> chktxtRewardQandA;

        public List<WebElement> chkTxtRewardQandA() {
            return chktxtRewardQandA;
        }

        @FindBy(locator = "dw.checkout.rewardsandcoupons.rewards.lbl.rewardqanda")
        private WebElement LblRewardQandA;

        public WebElement LblRewardQandA() {
            return LblRewardQandA;
        }


        public WebElement getIconRemoveCoupon(String couponId) {
            return SCHUtils.findElement("dw.checkout.rewardsandcoupons.img.removecoupon",
                    couponId);
        }

        public WebElement getLblCouponName(String couponId) {
            return SCHUtils.findElement(
                    "dw.checkout.rewardsandcoupons.coupondetail.lbl.couponname",
                    couponId);
        }

        public WebElement getLblCouponDescription(String couponId) {
            return SCHUtils.findElement(
                    "dw.checkout.rewardsandcoupons.coupondetail.lbl.coupondescription",
                    couponId);
        }

        public WebElement getLnkEdit(String couponId) {
            return SCHUtils.findElement(
                    "dw.checkout.rewardsandcoupons.coupondetail.lnk.edit", couponId);
        }

        public WebElement getLblCouponItemDetail(String couponId) {
            return SCHUtils.findElement(
                    "dw.checkout.rewardsandcoupons.coupondetail.lbl.coupomitemdetail",
                    couponId);
        }

        public WebElement getBtnRemoveCoupon(String couponId) {
            return SCHUtils.findElement(
                    "dw.checkout.rewardsandcoupons.coupondetail.btn.removecoupon",
                    couponId);
        }


        @FindBy(locator = "dw.teacher.coupon.popup.table")
        private List<WebElement> tablecoupontable;

        @FindBy(locator = "dw.teacher.dts.navigation.page2")
        private WebElement dtspagenavigationpage2;

        @FindBy(locator = "dw.teacher.dts.navigation.page2")
        private List<WebElement> sizedtspagenavigationpage2;

        @FindBy(locator = "dw.teacher.dts.navigation.page3")
        private WebElement dtspagenavigationpage3;

        @FindBy(locator = "dw.teacher.dts.navigation.page3")
        private List<WebElement> sizedtspagenavigationpage3;


        public List<WebElement> getTableCouponTable() {
            return tablecoupontable;
        }

        public WebElement getdtspagenavigationpage2() {
            return dtspagenavigationpage2;
        }

        public List<WebElement> sizedtspagenavigationpage2() {
            return sizedtspagenavigationpage2;
        }

        public WebElement getdtspagenavigationpage3() {
            return dtspagenavigationpage3;
        }

        public List<WebElement> sizedtspagenavigationpage3() {
            return sizedtspagenavigationpage3;
        }



        @Override
        protected void openPage() {
        }

        public void verifyCouponsRewardsBonusPointsSection() {
            AssertUtils.assertDisplayed(getLblRewards());
            AssertUtils.assertDisplayed(getLblCoupons());
            verifyOrderSummeryFromRewardCouponsPage();
        }

        public void verifyRewardsEligibility() {
            AssertUtils.assertDisplayed(lblRewards);
            String rewards_eligibility = getLblRewardsInfo().getText();
            Assert.assertTrue(rewards_eligibility.contains(ConstantUtils.NO_REWARDS)
                    || rewards_eligibility.contains(ConstantUtils.REWARDS_EARN_TODAY));
        }

        /**
         * This method verify Check
         * "not enough Bonus Points in your bank to complete the order." message
         * on Rewards Section of checkout page
         */
        public void verifyInsufficientBonusPointMessage() {
            AssertUtils.assertTextMatches(getLblInsufficientBonusPointMessage(),
                    Matchers.containsString(
                            ConstantUtils.INSUFFICIENTBONUSPOINTCHECKOUTERRORMESSAGE));

        }

        /**
         * this method verify order summery section from rewards and coupons
         * page
         */
        public void verifyOrderSummeryFromRewardCouponsPage() {
            IProductOrderSummarySection iProductOrderSummarySection =
                    SectionFactory.getFactory().getIProductOrderSummarySection(
                            LocatorUtils.getBy("dw.product.order.summary.cmp"));

            iProductOrderSummarySection
                    .verifyOrderSummary(TestBaseProvider.getTestBase().getTestData());
        }

        public void enterCoupon(String data) {
            //SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(1000);
            
            try {
                delete_coupon_in_RewardsPage().isDisplayed();
                TCOD_delete_applied_coupon_Rewards_page();
            } catch (Exception e) {
                System.out.println("No coupons are available to delete");
            }
            SCHUtils.waitForElementToBeDisplayed(getBtnApplyCoupon(),2000);
            SCHUtils.scrollToView(getBtnApplyCoupon());

            getTxtCouponeCode().clear();
            getTxtCouponeCode().sendKeys(data);
            PauseUtil.pause(4000);
            SCHUtils.waitForElementToBeClickable(getBtnApplyCoupon(), 20);
            SCHUtils.clickUsingJavaScript(getBtnApplyCoupon());
            //PauseUtil.pause(4000);
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(2500);
        }
        
        public void enterCoupon2(String data) {
            //SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(1000);
            
            SCHUtils.scrollToView(getBtnApplyCoupon());

            getTxtCouponeCode().clear();
            getTxtCouponeCode().sendKeys(data);
            SCHUtils.clickUsingJavaScript(getBtnApplyCoupon());
            //PauseUtil.pause(4000);
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete();
        }
        
        public void enterCoupon_and_dismiss(String data) {
            //SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(1000);
            
            try {
                delete_coupon_in_RewardsPage().isDisplayed();
                TCOD_delete_applied_coupon_Rewards_page();
            } catch (Exception e) {
                System.out.println("No coupons are available to delete");
            }
            
            SCHUtils.scrollToView(getBtnApplyCoupon());

            getTxtCouponeCode().clear();
            getTxtCouponeCode().sendKeys(data);
            SCHUtils.clickUsingJavaScript(getBtnApplyCoupon());
            //PauseUtil.pause(4000);
            
            try {
            	PauseUtil.pause(2000);
            	close_btn_Modal_Selection_window().isDisplayed();
            	close_btn_Modal_Selection_window().click();
			} catch (Exception e) {
				System.out.println("CLose button is not displayed");
			}
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(2000);
            PauseUtil.pause(2000);
        }

        public void Verify_validationMsg_InvalidPostalcode(){
           SCHUtils.waitForElementToBeDisplayed(getLblInvalidPostalCodeErrorMessage(),2000);
            System.out.println("error message is :" + getLblInvalidPostalCodeErrorMessage().getText());
            AssertUtils.assertTextMatches(getLblInvalidPostalCodeErrorMessage(), Matchers.containsString(ConstantUtils.INVALIDPOSTALCODE_MSG));

        }

        public void verifyCouponAlreadyAppliedMsg(Configuration data) {
            System.out.println("error message" + getLblErrorMessage().getText());
            AssertUtils.assertTextMatches(getLblErrorMessage(), Matchers.containsString(
                    "The coupon you?ve entered has expired. Please see the instructions on your coupon for details."));
        }


        public void verifyOrderAmtNotMeetingFreeShippingMsg(Configuration data) {
            System.out.println("error message" + getLblErrorMessage().getText());
            AssertUtils.assertTextMatches(getLblErrorMessage(), Matchers.containsString(ConstantUtils.ORDERTOTALNOTMEETINGFREESHIPPINGMSG
            ));
        }


        public void verifyErrorMsgForUsingSameCoupon(Configuration data) {
            System.out.println("error message" + getLblErrorMessage().getText());
            AssertUtils.assertTextMatches(getLblErrorMessage(), Matchers.containsString(ConstantUtils.USINGSAMECOUPONMSG
            ));
        }


        public void verifyErrorMsgForSkippingFreePick(Configuration data) {
            System.out.println("error message" + getLblErrorMessage().getText());
            AssertUtils.assertTextMatches(getLblErrorMessage(), Matchers.containsString(ConstantUtils.FREEPICKSKIPERRMSG
            ));
        }


        public void verifyErrorMsgForSkippingDTS(Configuration data) {
            System.out.println("error message" + getLblErrorMessage().getText());
            AssertUtils.assertTextMatches(getLblErrorMessage(), Matchers.containsString(ConstantUtils.DTSSKIPERRMSG));
        }


        public void verifyErrorMsgForNonStackableStackableCoupon(Configuration data) {
            System.out.println("error message" + getLblErrorMessage().getText());
            AssertUtils.assertTextMatches(getLblErrorMessage(), Matchers.containsString(ConstantUtils.ERRMSGNONSTACKABLESTACKABLE
            ));
        }



        public void verifyErrorMsgFreeShippingOnAlreadyFreeShip(Configuration data) {
            System.out.println("error message" + getLblErrorMessage().getText());
            AssertUtils.assertTextMatches(getLblErrorMessage(), Matchers.containsString(ConstantUtils.FREESHIPONALREADYFREESHIPMSG
            ));
        }

        public void verifyErrorMsg_duplicatemailaddress_myprofile(Configuration data) {
            System.out.println("error message" + getLblErrorMessage().getText());
            AssertUtils.assertTextMatches(getLblErrorMessage(), Matchers.containsString(ConstantUtils.DUPLICATEMAILERRMSG_MYPROFILE
            ));
        }

        public void verifyErrorMsgForStackableNonStackableCoupon(Configuration data) {
            System.out.println("error message" + getLblErrorMessage().getText());
            AssertUtils.assertTextMatches(getLblErrorMessage(), Matchers.containsString(ConstantUtils.ERRMSGSTACKABLENONSTACKABLE
            ));
        }


        public void verifySuccessStackableAndStackableCoupon(Configuration data) {
            AssertUtils.assertNotPresent((ExtendedElement) getLblErrorMessage());

        }


        public void verifyDoesNotMeetCouponrequirements() {
            System.err.println("error message" + getLblErrorMessage().getText());
            AssertUtils.assertTextMatches(getLblErrorMessage(), Matchers.containsString(
                    ConstantUtils.ORDER_NOT_MEET_COUPON_REQUIREMENTS_MSG));
        }

        public void verifyDoesNotMeetFreePickCouponrequirements() {
            System.err.println("error message" + getLblErrorMessage().getText());
            AssertUtils.assertTextMatches(getLblErrorMessage(), Matchers.containsString(
                    ConstantUtils.ORDER_NOT_MEET_FREEPICKCOUPON_REQUIREMENTS_MSG));
        }


        public void verifyInvalidCouponErrorMsg() {
            System.out.println("error message" + getLblErrorMessage().getText());
            AssertUtils.assertTextMatches(getLblErrorMessage(),
                    Matchers.containsString(ConstantUtils.INVALID_COUPON_MSG));
        }

        public void verifyCouponSectionAfterApplyingCoupon(Configuration data) {
            PauseUtil.pause(3000);
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete();
            Map<String, ProductInfoBean> couponProducts = SCHUtils.getCouponItems();
            for (String key : couponProducts.keySet()) {
                ProductInfoBean details = couponProducts.get(key);
                AssertUtils.assertDisplayed(getLblCouponName(details.getCoupon()));
                // Assert.assertTrue(getLblCouponDescription(details.getCoupon()).getText()
                // .trim().contains(details.getCouponDescription().trim()));
                AssertUtils.assertDisplayed(getBtnRemoveCoupon(details.getCoupon()));

                try {
                    if (SCHUtils.isPresent(getLblCouponItemDetail(details.getCoupon()))) {
                        String itemDescriptionText =
                                getLblCouponItemDetail(details.getCoupon()).getText()
                                        .trim();
                        String text[] = itemDescriptionText.split("\\|");
                        System.out.println("Total No OF Coupon Item......"
                                + SCHUtils.getTotalCouponItems(data));
                        System.out.println("Total no Of Price........"
                                + SCHUtils.getTotalCouponItemsPrice(data));
                        System.out.println("Actial Coupons Item...." + text[1]);
                        System.out.println("Expected Coupons Item...." + text[0]);

                        // we are already verifying total no of coupons item by
                        // beans we dont need to use this steps
                        // Assert.assertTrue(
                        // text[1].contains(String
                        // .valueOf(SCHUtils.getTotalCouponItems(data))),
                        // "Total of coupon item is not as expected");
                        // Assert.assertTrue(
                        // text[0].contains(String.valueOf(
                        // SCHUtils.getTotalCouponItemsPrice(data))),
                        // "Total coupon price is not as expected");
                        // String text[] = itemDescriptionText.split("\\|");
                        // Assert.assertTrue(
                        // text[1].contains(String
                        // .valueOf(SCHUtils.getTotalCouponItems(data))),
                        // "Total of coupon item is not as expected");
                        // Assert.assertTrue(
                        // text[0].contains(String.valueOf(
                        // SCHUtils.getTotalCouponItemsPrice(data))),
                        // "Total coupon price is not as expected");
                        // }
                        getIconRemoveCoupon(details.getCoupon()).click();
                        SCHUtils.isPresent(getLblVisibleRemoveCouponPopUp());
                        PauseUtil.pause(1000);
                        PauseUtil.waitForAjaxToComplete();
                        SCHUtils.isPresent(getLblInVisibleRemoveCouponPopUp());
                    }
                    if (SCHUtils.isPresent(getLnkEdit(details.getCoupon()))) {
                        AssertUtils.assertDisplayed(getLnkEdit(details.getCoupon()));

                    }

                } catch (Exception e) {
                    // TODO: handle exception
                }
            }

        }

        public void verifyBonusPointsActivitySection() {
            assertDisplayed(getBonusPointsByLabel(ConstantUtils.BEGINNING_BONUS_POINTS));
            assertDisplayed(getBonusPointsByLabel(ConstantUtils.POINTS_PER_DOLLAR_SPENT));
            assertDisplayed(
                    getBonusPointsByLabel(ConstantUtils.EXTRA_BONUS_POINTS_REWARDS));
            assertDisplayed(
                    getBonusPointsByLabel(ConstantUtils.BONUS_POINTS_COUPON_REDEEMED));
            assertDisplayed(
                    getBonusPointsByLabel(ConstantUtils.TOTAL_BONUS_POINTS_EARNED));
            assertDisplayed(getBonusPointsByLabel(ConstantUtils.BONUS_POINTS_USED));
            assertDisplayed(
                    getBonusPointsByLabel(ConstantUtils.ENDING_BONUS_POINT_BALANCE));
            // TO DO bonus points calculation and verification

            int ending_bp_balance =
                    Integer.parseInt(getLblEndingBonusPointBalance().getText().trim());
            System.out.println("ending_bp----------->" + ending_bp_balance);

            int bp_used = Integer.parseInt(getLblBonusPointUsed().getText().trim());
            System.out.println("bp_used----------->" + bp_used);

            int total_bp_earned =
                    Integer.parseInt(getLblTotalBonusPointSearned().getText().trim());

            System.out.println("total_bp_earned----------->" + total_bp_earned);

            // int points_per_dollar_spend =
            // Integer.parseInt(getLblPointsPerDollarSpent().getText().trim());
            // int extra_bp_rewards =
            // Integer.parseInt(getLblExtraBonusPointsRewards().getText().trim());
            // int bp_coupon_redeems =
            // Integer.parseInt(getLblBonuspointsCouponRedeemed().getText().trim());
            int beggining_bp =
                    Integer.parseInt(getLblBeginningBonusPoint().getText().trim());

            System.out.println("beggining_bp----------->" + beggining_bp);

            Assert.assertTrue(
                    (beggining_bp + total_bp_earned - bp_used) == ending_bp_balance,
                    "error in bonus points calculation and verification");

        }

        public void verifyTossIn() {
			/*AssertUtils.assertTextMatches(getLblTossIn(),
					Matchers.containsString(ConstantUtils.TOSS_IN_TEXT));*/
            PauseUtil.waitForAjaxToComplete(3000);
            PauseUtil.pause(2000);
            AssertUtils.assertDisplayed(fld_FreeItem1_Section_RewardsPage());
        }



        public void verifyFreePromotionConfirmandSubmitPage() {

			String FREE_PRAMOTION_TEXT_CONFIRM_AND_SUBMIT_PAGE = "3 FREE Surprise Books perfect for your classroom library";
			String FREE_PRAMOTION_TEXT_CONFIRM_AND_SUBMIT_PAGE_QA="FREE Reading is Giving Poster for your classroom";


            String Actual_Text=getsectionconfirmsubmitpagerewards().getText().trim();
            System.out.println("^^^^^^^^^^^^^^^***********"+Actual_Text);

			if (Actual_Text.contains("FREE")) {
				System.out.println("Free Item promotion is displayed in Confirm and Submit page");
			} else if (Actual_Text.contains("")) {
				System.out.println("Free Item promotion is displayed in Confirm and Submit page");
			} else {
				Assert.fail("Free Item promotion is not displaying in Confirm and Submit page");
			} 

        }

        public void clickOnRemoveIcon(Configuration testData) {
            PauseUtil.waitForAjaxToComplete(5000);

            SCHUtils.clickUsingJavaScript(
                    getIconRemoveCoupon(testData.getString("couponnumber")));
        }

        // public void removeSFOItemFromRewardAndCouponAfterYes(Configuration
        // data) {
        public void removeItemFromRewardAndCouponAfterYes(Configuration data) {
            PauseUtil.waitForAjaxToComplete(5000);
            getBtnRemoveCouponYes().click();
            HashMap<String, ProductInfoBean> itemDeleted = SCHUtils.getSFOProductItems();
            for (String key : itemDeleted.keySet()) {
                if (SCHUtils.getSFOProductByIDAndStudentName(key).getCoupon()
                        .equalsIgnoreCase(data.getString("couponnumber"))) {
                    SCHUtils.removeSFOProductItem(
                            SCHUtils.getSFOProductByIDAndStudentName(key));
                }
            }
        }

        public void verifyMGMCouponFlow(Configuration data) {
            PauseUtil.waitForAjaxToComplete(4000);
            getICouponSection().verifyMGMCouponFunctionality(data);
        }

        public void verifyQandASection() {
            PauseUtil.waitForAjaxToComplete(1500);
            AssertUtils.assertDisplayed(getLblRewardQandA());
            AssertUtils.assertDisplayed(getTxtRewardQandA());
        }

        public void verifyNotQandASection() {
            PauseUtil.waitForAjaxToComplete(1500);
            if(chkLblRewardQandA().size()==0){
                System.out.println("Application works good for student incentive line with teacher catalogue items");
            }
            else{
                Assert.fail("Application issue. Able to see the student line incentive for teacher catalogue items");
            }

            //AssertUtils.assertNotDisplayed(getLblRewardQandA());
            //AssertUtils.assertNotDisplayed(getTxtRewardQandA());
        }



        public void verifyQAStudentIncentiveMaximumErrorMessage(){
            PauseUtil.waitForAjaxToComplete(3000);
            List<WebElement> QAStudentIncentiveToolTip = getLblErrorMessageReward();
            if(QAStudentIncentiveToolTip.size()==0){
                Assert.fail("Error message is not displaying when number beyond the maximum limit is given in QA Student Incentive text field");
            }
            //AssertUtils.assertPresent((ExtendedElement) getLblErrorMessageReward());

            AssertUtils.assertDisplayed(getMsgErrorMessageReward());
            AssertUtils.assertTextMatches(getMsgErrorMessageReward(),
                    Matchers.containsString(
                            ConstantUtils.QASTUDENTINCENTIVEMAXNUMBERERRORMESSAGE));


        }

        public void verifyQAStudentIncentiveEmptyInputErrorMessage(){
            PauseUtil.waitForAjaxToComplete(3000);

            //AssertUtils.assertPresent((ExtendedElement) getLblErrorMessageReward());
            List<WebElement> QAStudentIncentiveToolTip = getLblErrorMessageReward();
            if(QAStudentIncentiveToolTip.size()==0){
                Assert.fail("Error message is not displaying when QA Student Incentive text field is left blank");
            }
            AssertUtils.assertDisplayed(getMsgErrorMessageReward());
            AssertUtils.assertTextMatches(getMsgErrorMessageReward(),
                    Matchers.containsString(
                            ConstantUtils.QASTUDENTINCENTIVEEMPTYINPUTERRORMESSAGE));


        }


        public void verifyQAStudentIncentiveNegativeErrorMessage(){
            PauseUtil.waitForAjaxToComplete(3000);
            //AssertUtils.assertPresent((ExtendedElement) getLblErrorMessageReward());
            List<WebElement> QAStudentIncentiveToolTip = getLblErrorMessageReward();
            if(QAStudentIncentiveToolTip.size()==0){
                Assert.fail("Error message is not displaying when negative number is entered in QA Student Incentive text field");
            }
            AssertUtils.assertDisplayed(getMsgErrorMessageReward());
            AssertUtils.assertTextMatches(getMsgErrorMessageReward(),
                    Matchers.containsString(
                            ConstantUtils.QASTUDENTINCENTIVENEGATIVENUMBERERRORMESSAGE));

        }




        public void verifyCouponEntryFunctionalities(Configuration data) {
            getICouponSection().verifyInCompleteCouponEntryProcessMsg(data);

        }

		/*public void enterTossInNumberOfStudent(String numberofstudents) {

				getTxtRewardQandA().clear();
				getTxtRewardQandA().sendKeys(numberofstudents);
				//getTxtRewardQandA().sendKeys(Keys.ENTER);
				// getLblRewardQandA().click();

		}*/


        public void enterTossInNumberOfStudent(Configuration testData) {
            if (testData.getString("numberofstudents") != null) {
                String inValue = testData.getString("numberofstudents");
                System.out.println("value from the config file"+inValue);

                if(chkTxtRewardQandA().size()!=0){
                    if(getTxtRewardQandA().isDisplayed()){
                        System.out.println("No of Student entered are:" +getTxtRewardQandA().getAttribute("value"));

                        getTxtRewardQandA().clear();
                        getTxtRewardQandA().sendKeys(inValue);
                        LblRewardQandA().click();

                    }
                } else {
                    if ((chkTxtRewardQandA().size() != 0)) {

                        System.out.println("Student Incentive is present **************");
                        if (getTxtRewardQandA().isDisplayed()) {
                            System.out.println("Config file Data ------ No of Students #################################" + inValue);

                            getTxtRewardQandA().clear();
                            getTxtRewardQandA().sendKeys(inValue);
                            LblRewardQandA().click();

                        }


                    }}
                }
            }


            public void removeTossInvalue() {
                System.out.println("inside remove Tossin");
                if (chkTxtRewardQandA().size() != 0) {
                    if (getTxtRewardQandA().isDisplayed()) {
                        System.out.println("remove tossin2");
                        getTxtRewardQandA().clear();
                        getTxtRewardQandA().sendKeys("0");
                        System.out.println("remove3");
                        // getTxtRewardQandA().sendKeys("0");
                        LblRewardQandA().click();

                    }
                } else if ((chkTxtRewardQandA().size() != 0)) {

                    System.out.println("Student Incentive is present **************");
                    if (getTxtRewardQandA().isDisplayed()) {
                         getTxtRewardQandA().clear();
                         getTxtRewardQandA().sendKeys("0");
                        //getTxtRewardQandA().sendKeys(inValue);
                        LblRewardQandA().click();

                    }

                }
            }


        public void checkOutWithDTS(Configuration testData) {

            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(2500);
            if(chkbtnMakeSelectionFpf().size()!=0)
            {
                ICheckoutPage iCheckoutPage = getFactory().getICheckoutPage();


                iCheckoutPage.clickOnMakeSelectionButton();
                SCHUtils.waitForLoaderToDismiss();
                PauseUtil.waitForAjaxToComplete(2500);
                SCHUtils.selectOptionByvalue(getSelectGrade(),(ConstantUtils.DTSFLYER));
                SCHUtils.waitForLoaderToDismiss();
                PauseUtil.waitForAjaxToComplete(3500);
                getlblDtsModelwindowItemPrice1().click();
                SCHUtils.waitForLoaderToDismiss();
                PauseUtil.waitForAjaxToComplete(3500);


                List<WebElement> cartTable1= getTableCouponTable();
                for(WebElement cartTable:cartTable1){
                    List<WebElement> cartTabletr1= cartTable.findElements(By.tagName("tr"));
                    for(WebElement cartTabletd1:cartTabletr1){
                        List<WebElement> cartTabletd= cartTabletd1.findElements(By.tagName("td"));


                        String actualprice1 = cartTabletd.get(3).getText();
                        actualprice1 = actualprice1.substring(1);
                        Double actualprice = Double.parseDouble(actualprice1.trim());

                        System.out.println("navigation 1 price#############: "+actualprice);

                        if(actualprice<=ConstantUtils.DTSAMOUNT){

                            cartTabletd.get(4).findElement(By.tagName("i")).click();
                            PauseUtil.pause(2500);
                            PauseUtil.waitForAjaxToComplete(1000);
                            SCHUtils.waitForLoaderToDismiss();
                            PauseUtil.waitForAjaxToComplete(4000);
                            PauseUtil.pause(2500);

                            //SCHUtils.waitForElementToBeClickable(getBtnConfirmAndApply(), 20);
                            PauseUtil.waitForAjaxToComplete(1500);
                            getBtnConfirmAndApply().click();
                            SCHUtils.waitForLoaderToDismiss();
                            PauseUtil.waitForAjaxToComplete(1500);
                            break;
                            //iCheckoutPage.getICouponSection().clickOnConfrimAndApplyCoupon();	


                        }


                        else if(sizedtspagenavigationpage2().size()!=0){
                            getdtspagenavigationpage2().click();
                            SCHUtils.waitForLoaderToDismiss();
                            PauseUtil.waitForAjaxToComplete(3500);


                            List<WebElement> cartTable21= getTableCouponTable();
                            for(WebElement cartTable12:cartTable21){
                                List<WebElement> cartTabletr2= cartTable12.findElements(By.tagName("tr"));
                                for(WebElement cartTabletd2:cartTabletr2){
                                    List<WebElement> cartTabletd12= cartTabletd2.findElements(By.tagName("td"));


                                    String actualprice2 = cartTabletd12.get(3).getText();
                                    actualprice2 = actualprice2.substring(1);
                                    Double actualpricee = Double.parseDouble(actualprice2.trim());
                                    System.out.println("navigation 2 price#############: "+actualpricee);


                                    if(actualpricee<=ConstantUtils.DTSAMOUNT){
                                        cartTabletd12.get(4).findElement(By.tagName("i")).click();
                                        PauseUtil.pause(2500);
                                        PauseUtil.waitForAjaxToComplete(1000);
                                        SCHUtils.waitForLoaderToDismiss();
                                        PauseUtil.waitForAjaxToComplete(4000);
                                        PauseUtil.pause(2500);

                                        PauseUtil.waitForAjaxToComplete(1500);
                                        getBtnConfirmAndApply().click();
                                        SCHUtils.waitForLoaderToDismiss();
                                        PauseUtil.waitForAjaxToComplete(1500);
                                        break;


                                    }
                                }
                            }
                        }
                        break;

                    }
                }
            }
        }



        public void HandleFreePickforNonStackable(Configuration testData) {

            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(2500);

            SCHUtils.selectOptionByvalue(getSelectGrade(),(ConstantUtils.DTSFLYER));
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(3500);
            getlblDtsModelwindowItemPrice1().click();
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(3500);


            List<WebElement> cartTable1= getTableCouponTable();
            for(WebElement cartTable:cartTable1){
                List<WebElement> cartTabletr1= cartTable.findElements(By.tagName("tr"));
                for(WebElement cartTabletd1:cartTabletr1){
                    List<WebElement> cartTabletd= cartTabletd1.findElements(By.tagName("td"));


                    String actualprice1 = cartTabletd.get(4).getText();
                    actualprice1 = actualprice1.substring(1);
                    Double actualprice = Double.parseDouble(actualprice1.trim());

                    System.out.println("navigation 1 price#############: "+actualprice);

                    if(actualprice<=ConstantUtils.DTSAMOUNT){

                        cartTabletd.get(5).findElement(By.tagName("i")).click();
                        PauseUtil.pause(2500);
                        PauseUtil.waitForAjaxToComplete(1000);
                        SCHUtils.waitForLoaderToDismiss();
                        PauseUtil.waitForAjaxToComplete(4000);
                        PauseUtil.pause(2500);

                        //SCHUtils.waitForElementToBeClickable(getBtnConfirmAndApply(), 20);
                        PauseUtil.waitForAjaxToComplete(1500);
                        getBtnConfirmAndApply().click();
                        SCHUtils.waitForLoaderToDismiss();
                        PauseUtil.waitForAjaxToComplete(1500);
                        break;
                        //iCheckoutPage.getICouponSection().clickOnConfrimAndApplyCoupon();	


                    }


                    else if(sizedtspagenavigationpage2().size()!=0){
                        getdtspagenavigationpage2().click();
                        SCHUtils.waitForLoaderToDismiss();
                        PauseUtil.waitForAjaxToComplete(3500);


                        List<WebElement> cartTable21= getTableCouponTable();
                        for(WebElement cartTable12:cartTable21){
                            List<WebElement> cartTabletr2= cartTable12.findElements(By.tagName("tr"));
                            for(WebElement cartTabletd2:cartTabletr2){
                                List<WebElement> cartTabletd12= cartTabletd2.findElements(By.tagName("td"));


                                String actualprice2 = cartTabletd12.get(4).getText();
                                actualprice2 = actualprice2.substring(1);
                                Double actualpricee = Double.parseDouble(actualprice2.trim());
                                System.out.println("navigation 2 price#############: "+actualpricee);


                                if(actualpricee<=ConstantUtils.DTSAMOUNT){
                                    cartTabletd12.get(5).findElement(By.tagName("i")).click();
                                    PauseUtil.pause(2500);
                                    PauseUtil.waitForAjaxToComplete(1000);
                                    SCHUtils.waitForLoaderToDismiss();
                                    PauseUtil.waitForAjaxToComplete(4000);
                                    PauseUtil.pause(2500);

                                    PauseUtil.waitForAjaxToComplete(1500);
                                    getBtnConfirmAndApply().click();
                                    SCHUtils.waitForLoaderToDismiss();
                                    PauseUtil.waitForAjaxToComplete(1500);
                                    break;


                                }
                            }
                        }
                    }
                    break;

                }
            }
        }








        public void enterBonusBank(Configuration testData, String bonusbankinput) {
            if (testData.getString(bonusbankinput) == null) {
                getinputBonusBankTextField().clear();
            } else {
                getinputBonusBankTextField().clear();
                getinputBonusBankTextField().sendKeys(testData.getString(bonusbankinput));
            }
        }



        public void enterBonusBank_Shipping(Configuration testData, String bonusbankinput) {
            if (testData.getString(bonusbankinput) == null) {
                getinputBonusBankShippingTextField().clear();
            } else {
                getinputBonusBankShippingTextField().clear();
                getinputBonusBankShippingTextField().sendKeys(testData.getString(bonusbankinput));
            }
        }


        public void enterPaperCoupon(Configuration testData, String paperbonuscouponinput) {
            if (testData.getString(paperbonuscouponinput) == null) {
                getinputPaperBonusCouponsTextField().clear();
            } else {
                getinputPaperBonusCouponsTextField().clear();
                getinputPaperBonusCouponsTextField().sendKeys(testData.getString(paperbonuscouponinput));
            }
        }
        
        public void enterPaperCouponForStudent(Configuration testData, String paperbonuscouponinput) {
            if (testData.getString(paperbonuscouponinput) == null) {
                getinputPaperBonusCouponsForStudentTextField().clear();
            } else {
            	getinputPaperBonusCouponsForStudentTextField().clear();
            	getinputPaperBonusCouponsForStudentTextField().sendKeys(testData.getString(paperbonuscouponinput));
            }
        }
        
        


        public void DoNotenterTossInNumberOfStudent() {

            getTxtRewardQandA().clear();


        }

        public void ReenterTossInNumberOfStudent(Configuration testData) {

            if (testData.getString("updatenumberofstudents") == null) {
                if(chkTxtRewardQandA().size()!=0){
                    if(getTxtRewardQandA().isDisplayed()){
                        getTxtRewardQandA().clear();
                    }
                }
            } else {
                if(chkTxtRewardQandA().size()!=0){

                    if(getTxtRewardQandA().isDisplayed()){
                        getTxtRewardQandA().clear();
                        getTxtRewardQandA().sendKeys(testData.getString("updatenumberofstudents"));
                        System.out.println("printing text"+LblRewardQandA.getText());
                        LblRewardQandA().click();
                    }}
            }
        }

        public void Reenter_Error_TossInNumberOfStudent(Configuration testData) {



            PauseUtil.pause(2000);
            getTxtErrorRewardQandA().clear();
            getTxtErrorRewardQandA().sendKeys(testData.getString("updatenumberofstudents"));
            LblRewardQandA().click();

        }

		/*public void verifyErrorMessgaeOfTossIn() {
			AssertUtils.assertDisplayed(getLblErrorMessageReward());
		}*/

        public List<WebElement> getLblErrorMessageReward() {
            return lblErrorMessageReward;
        }

        public WebElement getMsgErrorMessageReward() {
            return msgErrorMessageReward;
        }

        public void setLblErrorMessageReward(WebElement lblErrorMessageReward) {
            this.lblErrorMessageReward = (List<WebElement>) lblErrorMessageReward;
        }

        public void editFreePickCoupon(Configuration data) {
            getLnkEdit(data.getString("editcouponname")).click();
            PauseUtil.waitForAjaxToComplete(4000);
            getICouponSection().editFreePickCoupon(data);

        }

        public void removeCouponItem(Configuration data, String confirmationStatus) {

            getDriver().navigate().refresh();
            String couponName = data.getString("removecouponno");
            getBtnRemoveCoupon(couponName).click();

            if (confirmationStatus.equalsIgnoreCase("YES")) {
                SCHUtils.clickUsingJavaScript(getBtnRemoveCouponYes());
                SCHUtils.removeCouponItem(SCHUtils.getCouponItemByIdAndName(couponName));
            } else {
                PauseUtil.pause(5000);
                Assert.assertTrue(!SCHUtils.isPresent(getBtnRemoveCouponYes()));
                Assert.assertTrue(!SCHUtils.isPresent(getBtnRemoveCouponNo()));
            }

        }

        public void verifyUpdatedRecordsAfterRemoval(Configuration testData) {
            HashMap<String, ProductInfoBean> itemDeleted =
                    SCHUtils.getCouponRemovedItems();

            String couponName;
            if (getTestBase().getContext()
                    .getProperty("testexecution.removedcouponid") != null) {
                couponName = getTestBase().getContext()
                        .getProperty("testexecution.removedcouponid").toString();
            } else {
                couponName = testData.getString("removecouponno");
            }

            if (!itemDeleted.containsKey(couponName)) {
                Assert.assertTrue(true, "Item is not deleted");
            }
        }

        public void verifyCouponsSortingOrder(Configuration testData) {
            String couponName[] =
                    SCHUtils.getArrayFromStringData(testData.getString("couponnumber"));
            List<WebElement> lstCoupon = getLstCouponName();
            for (int i = 0; i < lstCoupon.size(); i++) {
                if (!couponName[i].equalsIgnoreCase("C000002")) {
                    AssertUtils.assertTextMatches(lstCoupon.get(i), Matchers
                            .containsString(couponName[(couponName.length - 1) - i]));
                }
            }
        }

        public void searchInvalidKeyWord(Configuration data) {
            PauseUtil.waitForAjaxToComplete(6000);
            getICouponSection().searchCouponItemForinvalidKeyword(data);
        }

        public void verifyInvalidKeyWordSearchErrorMessage() {
            getICouponSection().verifyInvalidSearchErrorMessage();
        }

        public void verifyFreePickModalFunctionalities(Configuration data) {
            PauseUtil.waitForAjaxToComplete(4000);
            getICouponSection().verifyFreePickModalFunctionality(data);
        }

        public void verifyMaximumStudentLimitErrorMessage() {

            AssertUtils.assertTextMatches(getLblErrorMessage(), Matchers
                    .containsString(ConstantUtils.MAXIMUM_STUDENT_LIMIT_ERROR_MESSAGE));
        }

        public void verifyRewardsAndCouponsPage() {

            AssertUtils.assertDisplayed(getBtnContinueCheckout());
            AssertUtils.assertDisplayed(getBtnApplyCoupon());
            AssertUtils.assertDisplayed(getLnkHome());
        }

        public void verifyCouponErrorMessage() {
            AssertUtils.assertDisplayed(getLblErrorMessage());

        }

        public void verifyFullyUsedDollarToSpendPopup(Configuration data) {
            getICouponSection().verifyFullyUsedDollarToSpendPopup(data);
        }

        public void verifyStudentCountInQATossinDisplayes() {

            if (SCHUtils.isPresent(getTxtNoOfStudents())) {

                System.out.println(
                        SCHUtils.getSOOOrderCount() + SCHUtils.getSFOOrderTotal());
                System.out.println(Integer.parseInt(getTxtNoOfStudents().getText()));
                Assert.assertEquals(
                        SCHUtils.getSOOOrderCount() + SCHUtils.getSFOOrderTotal(),
                        Integer.parseInt(getTxtNoOfStudents().getText()));
            }
        }

        public void removeCouponItemWithSpecificId(String couponName,
                                                   String confirmationStatus) {
            if (!TestBaseProvider.getTestBase().getContext().getString("driver.name")
                    .equals("IE")) {
                getDriver().navigate().refresh();
            }
            PauseUtil.pause(2000);
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete();
            getBtnRemoveCoupon(couponName).click();

            if (confirmationStatus.equalsIgnoreCase("YES")) {
                SCHUtils.clickUsingJavaScript(getBtnRemoveCouponYes());
                PauseUtil.pause(2000);
                SCHUtils.waitForLoaderToDismiss();
                getTestBase().getContext().setProperty("testexecution.removedcouponid",
                        String.valueOf(couponName));
                SCHUtils.removeCouponItem(SCHUtils.getCouponItemByIdAndName(couponName));
            } else {
                PauseUtil.pause(8000);
                Assert.assertTrue(!SCHUtils.isPresent(getBtnRemoveCouponYes()));
                Assert.assertTrue(!SCHUtils.isPresent(getBtnRemoveCouponNo()));
            }
        }


        public void deleteCouponIcon()
        {

            PauseUtil.waitForAjaxToComplete();
            if(getIconDeleteCoupon().size()>0) {
                getIconDeleteCoupon().get(0).click();
                PauseUtil.pause(1500);
                getBtnRemoveCouponYes().click();
                SCHUtils.waitForLoaderToDismiss();
                PauseUtil.waitForAjaxToComplete(2500);
                PauseUtil.pause(1500);
            }

        }


        public void deleteCouponIconNo()
        {


            getBtnRemoveCouponNo().click();
            PauseUtil.pause(1500);


        }


        public void checkCouponNotDeleted()
        {


            PauseUtil.pause(2000);
            AssertUtils.assertPresent((ExtendedElement) getIconDeleteCoupon());


        }


        public void deleteCouponIconYes()
        {
            SCHUtils.waitForElementToBeClickable(getBtnRemoveCouponYes(),2000);
            getBtnRemoveCouponYes().click();
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(2000);


        }



        public void verifyBonusPointCalculation() {
            PauseUtil.pause(3000);
            Double cartTotal =
                    SCHUtils.getPriceWithOutCurrency(getLblCartTotal().getText());
            System.out.println("cart total---" + cartTotal);
            for (int i = 1; i <= Integer.parseInt(TestBaseProvider.getTestBase()
                    .getString("numberOfRanges").toString()); i++) {
                System.out.println("lower range----"
                        + Double.valueOf(TestBaseProvider.getTestBase().getContext()
                        .getProperty("range" + i).toString().split("~")[0]
                        .split("-")[0]));

                if (Double
                        .valueOf(TestBaseProvider.getTestBase().getContext()
                                .getProperty("range" + i).toString().split("~")[0]
                                .split("-")[0]) <= cartTotal
                        && (TestBaseProvider.getTestBase().getContext()
                        .getProperty("range" + i).toString().split("~")[0]
                        .split("-")[1].equalsIgnoreCase("any")
                        || (Double.valueOf(TestBaseProvider.getTestBase()
                        .getContext().getProperty("range" + i).toString()
                        .split("~")[0].split("-")[1]) >= cartTotal))) {

                    String bonusMultiplier = TestBaseProvider.getTestBase().getContext()
                            .getProperty("range" + i).toString().split("~")[1].toString()
                            .split("\\+")[0];

                    int bonuspoints = Integer.valueOf((int) (cartTotal
                            * Double.parseDouble(bonusMultiplier.substring(0, 1))));

                    System.out.println("Bonus point multiplier-" + bonusMultiplier);
                    System.out.println("Points per dollar earned-" + bonuspoints);

                    AssertUtils.assertTextMatches(
                            getBonusPointsBasedOnAttribute("Points Per Dollar"),
                            Matchers.containsString(String.valueOf(bonuspoints)));

                    AssertUtils.assertTextMatches(getLblBonusPointsPerDollar(),
                            Matchers.containsString(bonusMultiplier));

                    String extraBonusPointEarned =
                            String.valueOf(TestBaseProvider.getTestBase().getContext()
                                    .getProperty("range" + i).toString().split("\\+")[1]
                                    .replace("bp", ""));
                    System.out
                            .println("Extra bonus point earned-" + extraBonusPointEarned);
                    AssertUtils.assertTextMatches(
                            getBonusPointsBasedOnAttribute("Extra Points"),
                            Matchers.containsString(extraBonusPointEarned));

                    break;

                }

            }
        }

        public void verifyFreePickFlatPromotion() {
            AssertUtils.assertDisplayed(getSectionFpfPromotions());
            AssertUtils.assertDisplayed(getLblFpfPromotionDescription());
            AssertUtils.assertDisplayed(getBtnMakeYourSelection());

        }

        public void verifyDollarsToSpendNotPresent() {


            if(chkbtnMakeSelectionFpf().size()!=0)
            {
                Assert.fail("MAKE SELECTION BUTTON is present even when the order is not eligible or for Teacher Club items");


                if(getbtnMakeSelectionFpf().isDisplayed())
                {
                    Assert.fail("MAKE SELECTION BUTTON is visible even when the order is not eligible or for Teacher Club items");
                }
                //AssertUtils.assertNotDisplayed(getbtnMakeSelectionFpf());
                if(getlblRewardDetailOnDollarToSpendSection().isDisplayed())
                {
                    Assert.fail("Dollars to Spend line item is visible even when the order is not eligible or for Teacher Club items");
                }
                //AssertUtils.assertNotDisplayed(getlblRewardDetailOnDollarToSpendSection());

                AssertUtils.assertNotDisplayed(getLblFpfPromotionDescription());
                AssertUtils.assertNotDisplayed(lblRewardDetailOnDollarToSpendSection);
            }

        }







        public void verifyDollarToSpendSectionOnRewardsAndCoupons() {

			/*AssertUtils.assertTextMatches(getRewardsAndCouponsSection().getlblRewardDetailOnDollarToSpendSection(),
					Matchers.containsString("Spend"));*/
            //AssertUtils.assertDisplayed(getLnkEditOnDollarToSpendSection());
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(4000);
            //AssertUtils.assertDisplayed(getbtnMakeSelectionFpf());
            try {
                getbtnMakeSelectionFpf().isDisplayed();
            } catch (Exception e) {
                Assert.fail("DTS is not displayed");
            }

			/*AssertUtils.assertTextMatches(getlblRewardDetailOnDollarToSpendSection(),
					Matchers.containsString("$"));*/

        }


        public void verifyDollarToSpendSection_FirstTierOnRewardsAndCoupons(Configuration testData) {

            AssertUtils.assertTextMatches(getRewardsAndCouponsSection().getlblRewardDetailOnDollarToSpendSection(),
                    Matchers.containsString("spend right now!"));
            //AssertUtils.assertDisplayed(getLnkEditOnDollarToSpendSection());
            AssertUtils.assertDisplayed(getbtnMakeSelectionFpf());
            AssertUtils.assertTextMatches(getlblRewardDetailOnDollarToSpendSection(),
                    Matchers.containsString(testData.getString("couponamountfirsttier")));
        }


        public void verifyDollarToSpendSection_SecondTierOnRewardsAndCoupons(Configuration testData) {

            AssertUtils.assertTextMatches(getRewardsAndCouponsSection().getlblRewardDetailOnDollarToSpendSection(),
                    Matchers.containsString("spend right now!"));
            //AssertUtils.assertDisplayed(getLnkEditOnDollarToSpendSection());
            AssertUtils.assertDisplayed(getbtnMakeSelectionFpf());
            AssertUtils.assertTextMatches(getlblRewardDetailOnDollarToSpendSection(),
                    Matchers.containsString(testData.getString("couponamountsecondtier")));
        }



        public void verifyDollarToSpendSection_FirstTierOnDTSModel(Configuration testData) {

            AssertUtils.assertTextMatches(getRewardsAndCouponsSection().getlblRewardDetailOnDollarToSpendSection_Header_DTSModel(),
                    Matchers.containsString("spend right now!"));
            AssertUtils.assertTextMatches(getlblRewardDetailOnDollarToSpendSection_Header_DTSModel(),
                    Matchers.containsString(testData.getString("couponamountfirsttier")));
        }



        public void verifyDollarToSpendSection_SecondTierOnDTSModel(Configuration testData) {

            AssertUtils.assertTextMatches(getRewardsAndCouponsSection().getlblRewardDetailOnDollarToSpendSection_Header_DTSModel(),
                    Matchers.containsString("spend right now!"));
            AssertUtils.assertTextMatches(getlblRewardDetailOnDollarToSpendSection_Header_DTSModel(),
                    Matchers.containsString(testData.getString("couponamountsecondtier")));
        }






        public void verifyDollarToSpendLineOnRewardsAndCoupons() {


            AssertUtils.assertTextMatches(getRewardsAndCouponsSection().getlblRewardDetailOnDollarToSpendSection(),
                    Matchers.containsString("spend right now!"));
            //AssertUtils.assertDisplayed(getLnkEditOnDollarToSpendSection());
            AssertUtils.assertDisplayed(getlnkDTSEdit());
            AssertUtils.assertTextMatches(getlblRewardDetailOnDollarToSpendSection(),
                    Matchers.containsString("$"));


        }



        public void verifyDollarToSpendCloseIcon_RecentSaved() {

            AssertUtils.assertTextMatches(getRewardsAndCouponsSection().getlblRewardDetailOnDollarToSpendSelectedArea(),
                    Matchers.containsString("2 Items"));

        }


        public void verifyDollarToSpendCancelOption_RecentNotSaved() {

            AssertUtils.assertTextMatches(getRewardsAndCouponsSection().getlblRewardDetailOnDollarToSpendSelectedArea(),
                    Matchers.containsString("1 Items"));

        }



        public void enterWrongCoupon(String data) {
            PauseUtil.pause(3000);
            getTxtCouponeCode().clear();
            getTxtCouponeCode().sendKeys(data);
            getBtnApplyCoupon().click();
        }
        public void wrongErrorCouponMessage() {
            AssertUtils.assertTextMatches(
                    getRewardsAndCouponsSection().getLblErrorMessage(),
                    Matchers.containsString(ConstantUtils.Wrong_Coupon_Error_Message));
        }




        public void enterBonusCoupon(Configuration testData) {
            if (testData.getString("paperbonuscoupon") == null) {
                getinputPaperBonusCouponsTextField().clear();
            } else {
                getinputBonusCouponsTextField().clear();
                getinputBonusCouponsTextField().sendKeys(testData.getString("paperbonuscoupon"));
                getinputBonusCouponsTextField().sendKeys(Keys.ENTER);
            }
        }

        public void enterTeacherBonusCoupon(Configuration testData) {
            if (testData.getString("paperbonuscoupon") == null) {
                getinputTeacherBonusCouponsTextField().clear();
            } else {
                System.out.println("in the else loop");
                getinputTeacherBonusCouponsTextField().clear();
                getinputTeacherBonusCouponsTextField().sendKeys(testData.getString("paperbonuscoupon"));
                getinputTeacherBonusCouponsTextField().sendKeys(Keys.ENTER);
            }
        }


        public void verifyQandASectionDefault0() {
            {
                PauseUtil.waitForAjaxToComplete(1500);
                AssertUtils.assertDisplayed(getLblRewardQandA());
                //AssertUtils.assertDisplayed(getTxtRewardQandA());
                AssertUtils.assertDisplayed(getTxtRewardQandADefault0());
                System.out.println("value output"+getTxtRewardQandADefault0().getAttribute("value"));
                Assert.assertEquals("0",getTxtRewardQandADefault0().getAttribute("value"));
            }

        }


    }




    public class ShippingAndPayment extends BaseTestPage<TestPage> {

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.txt.securitycode")
        private WebElement securityCode;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.txt.nameoncard")
        private WebElement nameOnCard;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.drp.expirymonth")
        private WebElement expiryMonth;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.drp.expiryyear")
        private WebElement expiryYear;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.firstname")
        private WebElement firstName;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.lastname")
        private WebElement lastName;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.addressone")
        private WebElement addressOne;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.addresstwo")
        private WebElement addressTwo;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.zip")
        private WebElement zip;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.city")
        private WebElement city;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.drp.state")
        private WebElement state;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.drp.country")
        private WebElement country;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.txt.phonenumber")
        private WebElement phoneNumber;

        public WebElement getNameOnCardText() {
            return nameOnCardText;
        }

        public WebElement getExpiryDateText() {
            return expiryDateText;
        }

        public WebElement getBillingAddressText() {
            return billingAddressText;
        }

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.creditcardinfo.txt.nameoncardtext")
        private WebElement nameOnCardText;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.creditcardinfo.txt.expirydatetext")
        private WebElement expiryDateText;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.creditcardinfo.txt.billingaddresstext")
        private WebElement billingAddressText;

        @FindBy(locator = "dw.checkout.shippingandpayment.savedpaypal.lbl.emailid")
        private WebElement lblsavedPaypalEmailId;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.check.lbl.details")
        private WebElement lblCheckDetails;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.editcardinfo.btn.cancel")
        private WebElement buttonCancel;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.editcardinfo.btn.save")
        private WebElement buttonSave;

        @FindBy(locator = "dw.checkout.parent.shippingandpayment.lbl.note")
        private WebElement lblNote;

        @FindBy(locator = "dw.checkout.shippingandpayment.lnk.editcart")
        private WebElement lnkEditCart;

        @FindBy(locator = "dw.checkout.shippingandpayment.btn.continuecheckout")
        private WebElement btnContinueCheckout;
        
        @FindBy(locator = "dw.checkout.shippingandpayment.btn.continuecheckout")
        private List<WebElement> sizebtnContinueCheckout;

        @FindBy(locator = "dw.checkout.shippingandpayment.shipping.lbl.shippingtitle")
        private WebElement lblShippingTitle;

        @FindBy(locator = "dw.checkout.shippingandpayment.shipping.lbl.shipinfo")
        private WebElement lblShippingInfo;

        @FindBy(locator = "dw.checkout.parent.shippingandpayment.shipping.shipinfo.lbl.note")
        private WebElement lblShippingInfoNote;

        @FindBy(locator = "dw.checkout.parent.shippingandpayment.shipping.shipinfo.lnk.why")
        private WebElement lnkShippingInfoWhy;

        @FindBy(locator = "dw.checkout.parent.shippingandpayment.shipping.shipinfo.label.why")
        private WebElement lblShippingInfoWhy;

        public WebElement getLblShippingInfoWhy() {
            return lblShippingInfoWhy;
        }

        @FindBy(locator = "dw.checkout.shippingandpayment.shipping.shippingmethod.rdb.standardshipping")
        private WebElement rdbStandardShipping;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.lbl.paymenttitle")
        private WebElement lblPaymentTitle;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.drp.paymentmethod.option")
        private List<WebElement> lblPaymentMethodOption;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.drp.paymentmethod")
        private WebElement drpPaymentMethod;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.drp.paymentmethod")
        private List<WebElement> chkdrpPaymentMethod;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.drp.paymentmethod_2")
        private WebElement drpPaymentMethod_2;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.select.CreditCard")
        private WebElement selectAScreditCard;
        
        @FindBy(locator = "dw.checkout.shippingandpayment.payment.drp.SelectACard")
        private List<WebElement> sizedrpSelectaCard;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.drp.SelectACard")
        private WebElement drpSelectaCard;
        
        @FindBy(locator = "dw.checkout.payment.method.section")
        private WebElement paymentmethodsection;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.select.AddaNewCard")
        private WebElement selectAsNewCard;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.drp.paymentdrpdwn")
        private WebElement drpPaymentMethoddrpdwn;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.drp.selectcreditcard")
        private WebElement drpSelectCreditcard;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.drp.paypal")
        private WebElement drpSelectPayPal;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.drp.SelectACard_2")
        private WebElement drpSelectaCard_2;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.drp.selectedpaymentmethod")
        private WebElement drpSelectedPaymentMethod;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.drp.cardtype")
        private WebElement drpCardType;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.cardtype.addanewcard")
        private WebElement cardTypeAddANewCard;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.purchaseorder.txt.ordernumber")
        private WebElement txtPurchaseOrderNumber;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.cardcheckcombo.txt.creditcardamount")
        private WebElement txtCardCheckComboCardAmount;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.cardcheckcombo.txt.checkamount")
        private WebElement txtCardCheckComboCheckAmount;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.btn.edit")
        private WebElement btnEditCrediCard;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.lbl.creditcardinfo")
        private WebElement lblCreditCardInfo;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.creditcardinfo.lbl.nameoncard")
        private WebElement lblCreditCardInfoNameOnCard;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.creditcardinfo.img.icon")
        private WebElement imgCreditCardInfoIcon;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.creditcardinfo.lbl.cardnumber")
        private WebElement lblCreditCardInfoCardNumber;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.creditcardinfo.lbl.expiry")
        private WebElement lblCreditCardInfoExpiry;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.billingaddress.lbl.address")
        private WebElement lblBillingAddress;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.paypal.chk.sendmetopaypal")
        private WebElement chkSendMeToPayPal;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.paypal.lbl.paypalmessage")
        private WebElement lblPayPalMessage;

        @FindBy(locator = "dw.checkout.parent.shippingpayment.lbl.header")
        private WebElement lblShippingAndPaymentHeader;

        @FindBy(locator = "dw.checkout.shippingandpayment.shipping.lbl.shipdetail")
        private WebElement lblShippingDetails;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.form")
        private WebElement formCreditcard;

        @FindBy(locator = "dw.checkout.shippingandpayment.totalamount")
        private WebElement totalAmount;

        @FindBy(locator = "dw.checkout.shippingandpayment.shippingmethod.radio.standardfree")
        private WebElement radioStandardShipping;

        @FindBy(locator = "dw.checkout.shippingandpayment.shippingmethod.lbl.seconddaybonus")
        private WebElement lblshippingMethodSecondDayBonus;

        @FindBy(locator = "dw.checkout.shippingandpayment.shippingmethod.radio.combinedorderfree")
        private WebElement lblshippingMethodCombinedOrder;

        @FindBy(locator = "dw.checkout.shippingandpayment.shippingmethod.radio.seconddaybonus")
        private WebElement radioshippingMethodSecondDayBonus;

        @FindBy(locator = "dw.checkout.shippingandpayment.shippingmethod.radio.secondday")
        private WebElement radioshippingMethodSecondDay;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.chk.savecard")
        private WebElement chkSaveCard;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.addoreditcardinfo.billinginfo.chk.defaultcard")
        private WebElement chkDefaultCard;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.verify.txt.cardname")
        private WebElement verifycardname;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcardname.list")
        private List<WebElement> listofcreditcardname;

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.saveanddefaultoption")
        private WebElement saveAndDefaultOption;

        @FindBy(locator = "dw.checkout.shippingandpayment.btn.continuetopaypal")
        private WebElement btnContinueToPaypal;

        @FindBy(locator = "dw.checkout.shippingandpayment.purchesorder.info")
        private WebElement lblPurchaseOrderInfo;

        @FindBy(locator = "dw.checkout.shippingandpayment.checkbox.sendmetopaypal")
        private WebElement checkBoxSendMeToPaypal;

        @FindBy(locator = "dw.checkout.shippingandpayment.lst.shippingaddress")
        private List<WebElement> listShippingAddress;

        @FindBy(locator = "dw.checkout.parent.shippingandpayment.paymentsection.lbl.cartotal")
        private WebElement lblShippingCartTotal;

        @FindBy(locator = "dw.checkout.parent.shippingpayment.gotohome")
        private WebElement goToHomeButton;


        public WebElement getGoToHomeButton() {
            return goToHomeButton;
        }

        public WebElement getLblShippingCartTotal() {
            return lblShippingCartTotal;
        }

        public void setLblShippingCartTotal(WebElement lblShippingCartTotal) {
            this.lblShippingCartTotal = lblShippingCartTotal;
        }

        public List<WebElement> getListShippingAddress() {
            return listShippingAddress;
        }

        public void setListShippingAddress(List<WebElement> listShippingAddress) {
            this.listShippingAddress = listShippingAddress;
        }

        public WebElement getCheckBoxSendMeToPaypal() {
            return checkBoxSendMeToPaypal;
        }

        public WebElement getLblshippingMethodCombinedOrder() {
            return lblshippingMethodCombinedOrder;
        }

        public WebElement getLblPurchaseOrderBillingAddress() {
            return lblPurchaseOrderBillingAddress;
        }

        public WebElement getlblCreditCardInfo() {
            return lblCreditCardInfo;
        }

        @FindBy(locator = "dw.checkout.shippingandpayment.purchesorder.address")
        private WebElement lblPurchaseOrderBillingAddress;

        public WebElement getNameOnCard() {
            return nameOnCard;
        }

        public WebElement getExpiryMonth() {
            return expiryMonth;
        }

        public WebElement getExpiryYear() {
            return expiryYear;
        }

        public WebElement getFirstName() {
            return firstName;
        }

        public WebElement getLastName() {
            return lastName;
        }

        public WebElement getAddressOne() {
            return addressOne;
        }

        public WebElement getAddressTwo() {
            return addressTwo;
        }

        public WebElement getZip() {
            return zip;
        }

        public WebElement getCity() {
            return city;
        }

        public WebElement getState() {
            return state;
        }

        public WebElement getCountry() {
            return country;
        }

        public WebElement getPhoneNumber() {
            return phoneNumber;
        }

        public WebElement getSecurityCode() {
            return securityCode;
        }

        public WebElement getButtonCancel() {
            return buttonCancel;
        }

        public WebElement getButtonSave() {
            return buttonSave;
        }

        public WebElement getLblsavedPaypalEmailId() {
            return lblsavedPaypalEmailId;
        }

        public WebElement getDrpPaymentMethoddrpdwn() {
            return drpPaymentMethoddrpdwn;
        }

        public WebElement getLblPaymentShipingcharge() {
            return lblPaymentShipingcharge;
        }

        public WebElement getDrpSelectedPaymentMethod() {
            return drpSelectedPaymentMethod;
        }

        public WebElement getShipingCharge(String label) {
            return findElement("dw.checkout.shippingandpayment.shipping.value", label);
        }

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.shipingcharge")
        private WebElement lblPaymentShipingcharge;

        public WebElement getlblPaymentShipingcharge() {
            return lblPaymentShipingcharge;
        }

        public WebElement getLblPurchaseOrderInfo() {
            return lblPurchaseOrderInfo;
        }

        public WebElement getLblshippingMethodSecondDayBonus() {
            return lblshippingMethodSecondDayBonus;
        }

        public List<WebElement> getLblPaymentMethodOption() {
            return lblPaymentMethodOption;
        }

        public WebElement getRadioStandardShipping() {
            return radioStandardShipping;
        }

        public WebElement getRadioshippingMethodSecondDayBonus() {
            return radioshippingMethodSecondDayBonus;
        }

        public WebElement getRadioshippingMethodSecondDay() {
            return radioshippingMethodSecondDay;
        }

        public WebElement getTotalAmount() {
            return totalAmount;
        }

        public WebElement getFormCreditcard() {
            return formCreditcard;
        }

        @FindBy(locator = "dw.checkout.shippingandpayment.teacher.link.myscholastic")
        private WebElement linkMyScholastic;

        @FindBy(locator = "dw.checkout.shippingandpayment.parent.lbl.childorderprice")
        private WebElement lblChildOrderPrice;

        @FindBy(locator = "dw.checkout.shippingandpayment.paypal.fundinganothersource")
        private WebElement lnkFundingAnotherSource;

        public WebElement getLnkFundingAnotherSource() {
            return lnkFundingAnotherSource;
        }

        @FindBy(locator = "dw.checkout.shippingandpayment.payment.creditcard.creditcardinfo")
        private WebElement creditcardinfoSection;

        public WebElement getcreditcardinfoSection() {
            return creditcardinfoSection;
        }
        public WebElement getLblChildOrderPrice() {
            return lblChildOrderPrice;
        }

        public WebElement getLinkMyScholastic() {
            return linkMyScholastic;
        }

        public WebElement getSaveAndDefaultOption() {
            return saveAndDefaultOption;
        }

        public List<WebElement> getListofcreditcardname() {
            return listofcreditcardname;
        }

        public WebElement getVerifycardname() {
            return verifycardname;
        }

        public WebElement getLblNote() {
            return lblNote;
        }

        public WebElement getLnkEditCart() {
            return lnkEditCart;
        }

        public WebElement getBtnContinueCheckout() {
            return btnContinueCheckout;
        }
        
        public List<WebElement> sizebtnContinueCheckout() {
            return sizebtnContinueCheckout;
        }

        public void setBtnContinueToPaypal(WebElement btnContinueToPaypal) {
            this.btnContinueToPaypal = btnContinueToPaypal;
        }

        public WebElement getLblShippingTitle() {
            return lblShippingTitle;
        }

        public WebElement getLblShippingInfo() {
            return lblShippingInfo;
        }

        public WebElement getLblShippingInfoNote() {
            return lblShippingInfoNote;
        }

        public WebElement getLnkParentShippingInfoWhy() {
            return lnkShippingInfoWhy;
        }

        public WebElement getRdbStandardShipping() {
            return rdbStandardShipping;
        }

        public WebElement getLblPaymentTitle() {
            return lblPaymentTitle;
        }

        public WebElement getDrpPaymentMethod() {
            return drpPaymentMethod;
        }

        public List<WebElement> chkDrpPaymentMethod() {
            return chkdrpPaymentMethod;
        }

        public WebElement getDrpPaymentMethod_2() {
            return drpPaymentMethod_2;
        }
        public WebElement selectAScreditCard() {
            return selectAScreditCard;
        }
        
        public List<WebElement> sizedrpSelectaCard() {
            return sizedrpSelectaCard;
        }

        public WebElement drpSelectaCard() {
            return drpSelectaCard;
        }
        
        public WebElement getpaymentmethodsection() {
            return paymentmethodsection;
        }

        public WebElement selectAsAddaNewCard() {
            return selectAsNewCard;
        }
        public List<WebElement> getDrpPaymentMethodOption() {
            return lblPaymentMethodOption;
        }

        public WebElement getDrpSelectCreditcard() {
            return drpSelectCreditcard;
        }

        public WebElement drpSelectaCard_2() {
            return drpSelectaCard_2;
        }

        public WebElement getDrpSelectPayPal() {
            return drpSelectPayPal;
        }

        public WebElement getDrpCardType() {
            return drpCardType;
        }

        public WebElement getCardTypeAddANewCard() {
            return cardTypeAddANewCard;
        }

        public WebElement getTxtPurchaseOrderNumber() {
            return txtPurchaseOrderNumber;
        }

        public WebElement getTxtCardCheckComboCardAmount() {
            return txtCardCheckComboCardAmount;
        }

        public WebElement getTxtCardCheckComboCheckAmount() {
            return txtCardCheckComboCheckAmount;
        }

        public WebElement getBtnEditCrediCard() {
            return btnEditCrediCard;
        }

        public WebElement getLblCreditCardInfo() {
            return lblCreditCardInfo;
        }

        public WebElement getLblBillingAddress() {
            return lblBillingAddress;
        }

        public WebElement getChkSendMeToPayPal() {
            return chkSendMeToPayPal;
        }

        public WebElement getLblPayPalMessage() {
            return lblPayPalMessage;
        }

        public WebElement getLnkShippingInfoWhy() {
            return lnkShippingInfoWhy;
        }

        public WebElement getLblShippingAndPaymentHeader() {
            return lblShippingAndPaymentHeader;
        }

        public WebElement getBtnContinueToPaypal() {
            return btnContinueToPaypal;
        }

        public WebElement getLblCheckDetails() {
            return lblCheckDetails;
        }

        public WebElement getLblShippingDetails() {
            return lblShippingDetails;
        }

        public WebElement getChkSaveCard() {
            return chkSaveCard;
        }

        public WebElement getChkDefaultCard() {
            return chkDefaultCard;
        }

        public WebElement getLblCreditCardInfoNameOnCard() {
            return lblCreditCardInfoNameOnCard;
        }

        public WebElement getImgCreditCardInfoIcon() {
            return imgCreditCardInfoIcon;
        }

        public WebElement getLblCreditCardInfoCardNumber() {
            return lblCreditCardInfoCardNumber;
        }

        public WebElement getLblCreditCardInfoExpiry() {
            return lblCreditCardInfoExpiry;
        }



        /**
         * this method verify Shipping method{Standard Shipping,5000 bonus point
         * 2 day shipping, 25$ 2 day shipping}
         *
         * @param shippingMethod
         */
        public void verifyShippingMethod(String shippingMethod) {
            if (shippingMethod.contains(ConstantUtils.FREESHIPPING)) {
                AssertUtils.assertTextMatches(getRadioStandardShipping(),
                        Matchers.containsString("FREE"));
            } else if (shippingMethod.contains(ConstantUtils.SECONDDAYBONUS)) {
                AssertUtils.assertTextMatches(getRadioshippingMethodSecondDay(),
                        Matchers.containsString("2-Business Day Shipping"));
            } else if (shippingMethod.contains(ConstantUtils.SECONDDAYSHIPPING)) {
                AssertUtils.assertTextMatches(getRadioshippingMethodSecondDayBonus(),
                        Matchers.containsString("2-Business Day Shipping"));
                AssertUtils.assertTextMatches(getLblshippingMethodSecondDayBonus(),

                        Matchers.containsString(TestBaseProvider.getTestBase()
                                .getTestData().getString("bonuspointlabel")));

            } else if (shippingMethod.contains(ConstantUtils.COMBINEDORDERFREESHIPPING)) {
                AssertUtils.assertTextMatches(getLblshippingMethodCombinedOrder(),
                        Matchers.containsString(
                                "FREE SHIPPING with combined order of $20 or any parent online order"));
            } else {
                System.out.println("No Shipping Method Selected");
            }
        }

        public ShippingAndPayment getShippingAndPaymentSection() {
            return new ShippingAndPayment();
        }

        /**
         * This method verify Shipping and address Section on Step 2 of checkout
         */
        public void verifyShippingAddressSectionOnShippingAndPayment() {
            UserProfileBean profileBean = (UserProfileBean) getTestBase().getContext()
                    .getProperty("testexecution.userProfileBean");
            System.out.println("user gets information" + profileBean);
            PauseUtil.waitForAjaxToComplete(1000);
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete();
            System.out.println("First Name : " + profileBean.getName());
            WaitUtils.waitForEnabled(getLblShippingDetails());
            String shippingDetails =
                    getLblShippingDetails().getText().replaceAll("[\r\n]+", " ").trim();
            System.out.println(shippingDetails);
            System.out.println(profileBean.getName().split("\\.")[1].trim());
            Assert.assertEquals(shippingDetails
                    .contains(profileBean.getName().split("\\.")[1].trim()), true);
            Assert.assertEquals(shippingDetails.contains(profileBean.getAddress()), true);
            Assert.assertEquals(shippingDetails.contains(profileBean.getSchool()), true);

            // @Author:Harshit.trivedi
            // verify with proper Assert Condition
            // shippingDetails.contains(profileBean.getName());
            // shippingDetails.contains(profileBean.getAddress());
            // shippingDetails.contains(profileBean.getSchool());

        }

        /**
         * This method verify order summery on Shipping And Payment Page
         */
        public void verifyOrderSummerySectionOnShippingAndPayment() {

            waitForPageLoad();
            IProductOrderSummarySection iProductOrderSummarySection =
                    SectionFactory.getFactory().getIProductOrderSummarySection(
                            LocatorUtils.getBy("dw.product.order.summary.cmp"));
            iProductOrderSummarySection
                    .verifyOrderSummary(TestBaseProvider.getTestBase().getTestData());

        }

        /**
         * This method verify payment section of checkout page
         */
        public void verifyPaymentSectionOnShippingAndPayment() {
            PauseUtil.pause(6000);
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete();
            AssertUtils.assertTextMatches(getPriceByLabel(ConstantUtils.SFO_SUBTITLE),
                    Matchers.containsString(String.valueOf(SCHUtils.getSFOOrderTotal())));
            AssertUtils.assertTextMatches(getPriceByLabel(ConstantUtils.YTO_SUBTITLE),
                    Matchers.containsString(String.valueOf(SCHUtils
                            .getStandardPriceFormat(SCHUtils.getYTOOrderTotal()))));
            if (TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.wishlistitemprice") != null) {
                double SOOTotal = SCHUtils.getSOOOrderTotal();
                double wishListTotal = Double.parseDouble(TestBaseProvider.getTestBase()
                        .getContext().getProperty("testexecution.wishlistitemprice")
                        .toString());
                SOOTotal += wishListTotal;
                System.out.println("Total Price after adding wishlist item-" + SOOTotal);
                AssertUtils.assertTextMatches(getPriceByLabel(ConstantUtils.SSO_SUBTITLE),
                        Matchers.containsString(String.valueOf(SOOTotal)));
            } else {
                AssertUtils.assertTextMatches(getPriceByLabel(ConstantUtils.SSO_SUBTITLE),
                        Matchers.containsString(String.valueOf(SCHUtils
                                .getStandardPriceFormat(SCHUtils.getSOOOrderTotal()))));
            }

            AssertUtils.assertDisplayed(getPriceByLabel(ConstantUtils.SHIPPING));
            double shippingCharge = 0;
            if (getPriceByLabel(ConstantUtils.SHIPPING).getText() != "FREE"
                    && !getPriceByLabel(ConstantUtils.SHIPPING).getText()
                    .contains("Points")) {
                shippingCharge = SCHUtils.getPriceWithOutCurrency(
                        getPriceByLabel(ConstantUtils.SHIPPING).getText());
            }

            Double totalPrice = (SCHUtils.getPriceWithOutCurrency(
                    getPriceByLabel(ConstantUtils.SFO_SUBTITLE).getText())
                    + SCHUtils.getPriceWithOutCurrency(
                    getPriceByLabel(ConstantUtils.YTO_SUBTITLE).getText())
                    + shippingCharge);
            Assert.assertTrue(SCHUtils
                    .getPriceWithOutCurrency(
                            getPriceByLabel(ConstantUtils.TOTAL_AMOUNT_DUE).getText())
                    .equals(totalPrice));
            try {
                getPriceByLabel(ConstantUtils.SUBTOTAL);
                Assert.assertTrue(SCHUtils
                        .getPriceWithOutCurrency(
                                getPriceByLabel(ConstantUtils.SUBTOTAL).getText())
                        .equals(totalPrice));
            } catch (Exception e) {
            }

        }

        /**
         * This Method verify Shipping And Payment Section On Checkout Page
         */

        public void verifyShippingAndPaymentPage() {
            PauseUtil.pause(4000);
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete();
            AssertUtils.assertDisplayed(getLblShippingAndPaymentHeader());

            if (getTestBase().getTestData().getString("module") != null && getTestBase()
                    .getTestData().getString("module").equalsIgnoreCase("parent")) {
                AssertUtils.assertDisplayed(getLblNote());
                AssertUtils.assertDisplayed(getLblShippingDetails());
                AssertUtils.assertDisplayed(getLnkParentShippingInfoWhy());
                AssertUtils.assertDisplayed(getLblShippingInfoNote());
                if (getListShippingAddress() != null
                        && getListShippingAddress().size() > 0) {
                    AssertUtils.assertDisplayed(getListShippingAddress().get(0));
                }
                AssertUtils.assertDisplayed(getLblShippingAndPaymentHeader());
                AssertUtils.assertDisplayed(getLblPaymentTitle());
                AssertUtils.assertDisplayed(getLnkEditCart());
                AssertUtils.assertDisplayed(getLblNote());
                AssertUtils.assertDisplayed(getLblShippingCartTotal());
                AssertUtils.assertDisplayed(getBtnContinueCheckout());
                PauseUtil.waitForAjaxToComplete(3000);
                if (getLstChildNames() != null && getLstChildNames().size() > 0) {
                    Assert.assertTrue(SCHUtils.isSortedList(getLstChildNames()));
                } else {
                    Assert.assertTrue(false, "Student name list does not displayed");
                }
            } else {
                verifyShippingAddressSectionOnShippingAndPayment();
                verifyPaymentSectionOnShippingAndPayment();
                verifyPaymentOptions();
                verifyOrderSummerySectionOnShippingAndPayment();
            }
        }



        public void validate_payment_select_dropDown_displayed_PaymentPage() {
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(2000);

            try {
                getDrpPaymentMethod_2().isDisplayed();
                System.out.println("Payment section is displayed in Payment Page");
            } catch (Exception e) {
                Assert.fail("Payment section is not displayed in Payment Page");
            }
        }

        public void verify_payment_method_section_not_displayed() {
        	PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(2000);

            try {
                getDrpPaymentMethod_2().isDisplayed();
                Assert.fail("Payment section is displayed in Payment Page");
            } catch (Exception e) {
            	System.out.println("Payment section is not displayed in Payment Page");
            }
        	
        }
        



        public void verifyPaymentSectionForOnlyFreePickItems() {
            AssertUtils.assertTextMatches(getLblChildOrderPrice(),
                    Matchers.containsString("$0.00"));
            AssertUtils.assertTextMatches(getLblShippingCartTotal(),
                    Matchers.containsString("$0.00"));
        }

        /**
         * This Method verify already saved Paypal Account information From
         * Shipping And Payment Page To Verify this We Need To Set
         * "testexecution.saved.paypal.account.information" Property From
         * Profile Page.
         */
        public void verifySavedPaypalAccountInformationOnShippingAndPaymentPage() {
            PauseUtil.waitForAjaxToComplete(500);
            AssertUtils.assertTextMatches(lblsavedPaypalEmailId,
                    Matchers.containsString(getTestBase().getContext().getString(
                            "testexecution.saved.paypal.account.information")));
        }

        @Override
        protected void openPage() {
            // TODO Auto-generated method stub
        }

        public void waitForPageLoad() {
            // @author: kulin
            // This element will be present on all three checkout pages please
            // don't replace it, if it does not work, let me know.
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete();
            WaitUtils.waitForEnabled(getLblPageSubTitle());
            WaitUtils.waitForDisplayed(getLblPageSubTitle());
            PauseUtil.waitForAjaxToComplete(2000);
            // Here wait for payment drop down cannot be used because it is
            // shipping and payment page specific, and also on that page, when
            // there are only SOO orders, at that time this element will not be
            // present
            // WaitUtils.waitForEnabled(getDrpPaymentMethod());
        }

        /**
         * This Method use to select paypal method option on shipping and
         * payment section of checkout page
         */
        public void selectPayPal(String option) {

            getDrpPaymentMethod().sendKeys(option);

        }

        /**
         * this method click on continue to paypal Button
         */
        public void continueToPayPal() {
            PauseUtil.pause(4000);
            getCheckBoxSendMeToPaypal().click();
            WaitUtils.waitForEnabled(getBtnContinueToPaypal());
            AssertUtils.assertDisplayed(getBtnContinueToPaypal());

        }

        public void verifyAndClickCheckoutForNewCreditCard() {
            WaitUtils.waitForDisplayed(getBtnContinueCheckout());
            AssertUtils.assertDisplayed(getBtnContinueCheckout());
            WaitUtils.waitForEnabled(getBtnContinueCheckout());
            SCHUtils.clickUsingJavaScript(getBtnContinueCheckout());
            // getBtnContinueCheckout().click();
        }

        public void verifyContinueTOCheckoutAndClick() {
            SCHUtils.scrollToView(getBtnContinueCheckout());
            WaitUtils.waitForDisplayed(getBtnContinueCheckout());
            AssertUtils.assertDisplayed(getBtnContinueCheckout());
            PauseUtil.waitForAjaxToComplete(8000);
            getBtnContinueCheckout().click();
        }

        public void verifyContinueToPaypalOptionAndClick() {
            WaitUtils.waitForDisplayed(getBtnContinueToPaypal());
            AssertUtils.assertDisplayed(getBtnContinueToPaypal());
            SCHUtils.clickUsingJavaScript(getBtnContinueToPaypal());
        }

        public void switchToNewWindow() {
            // Method to switch on new window
            String oldWindow = getDriver().getWindowHandle();
            PauseUtil.waitForAjaxToComplete(2000);
            if (getDriver().getWindowHandles().size() > 1) {
                for (String window : getDriver().getWindowHandles()) {
                    if (!oldWindow.equalsIgnoreCase(window)) {
                        getDriver().switchTo().window(window);
                    }
                }
            }
        }

        // Method to switch back to old window
        public void switchToOldWindow(String oldWindow) {

            if (getDriver().getWindowHandles().size() > 1) {
                for (String window : getDriver().getWindowHandles()) {
                    if (!window.equals(oldWindow)) {
                        getDriver().switchTo().window(window);
                    }
                }
                getDriver().switchTo().window(oldWindow);
                PauseUtil.waitForAjaxToComplete(1000);
            }
        }

        public void loginWithPayPalAccount(String paypalUserName, String paypalPasswor) {

            String winHandleBefore = getDriver().getWindowHandle();
            // verifyContinueToPaypalOptionAndClick();
            try {
                SCHUtils.clickUsingJavaScript(
                        getDriver().findElement(By.cssSelector(".ppbutton")));
            } catch (Exception e) {

                PauseUtil.waitForAjaxToComplete(15000);

                // for (String winHandle : getDriver().getWindowHandles()) {
                // getDriver().switchTo().window(winHandle);
                // PauseUtil.pause(8000);
                // getDriver().manage().window().maximize();
                // PauseUtil.pause(4000);
                // getDriver().findElement(By.cssSelector("#email"))
                // .sendKeys(paypalUserName);
                // getDriver().findElement(By.cssSelector("#password"))
                // .sendKeys(paypalPasswor);
                // PauseUtil.pause(4000);
                // getDriver().findElement(By.cssSelector("#btnLogin")).click();
                // PauseUtil.pause(4000);
                // getDriver().findElement(By.cssSelector("#confirmButtonTop")).click();
                //
                // }
            }
            if (!getTestBase().getContext().getString("driver.name").equals("IOs")) {
                switchToNewWindow();
            }

            WebDriverWait wait = new WebDriverWait(getDriver(), 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("paypalLogo")));
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("paypalLogo")));
            getDriver().switchTo().frame("injectedUl");
            getDriver().findElement(By.id("email")).clear();
            getDriver().findElement(By.id("email")).sendKeys(paypalUserName);
            getDriver().findElement(By.id("password")).sendKeys(paypalPasswor);
            getDriver().findElement(By.id("btnLogin")).click();
            getDriver().switchTo().defaultContent();
            PauseUtil.pause(5000);
            SCHUtils.waitForLoaderToDismiss();
            // wait.until(ExpectedConditions
            // .presenceOfElementLocated(By.xpath(".//*[@id='confirmButtonTop']")));
            SCHUtils.scrollToView(getBtnPayPalAgreeAndContinue());
            getBtnPayPalAgreeAndContinue().click();

            System.out.println("outside window handle if");
            try {
                System.out.println("inside window handle if");
                getDriver().switchTo().window(winHandleBefore);
            } catch (Exception e2) {
                // TODO: handle exception
            }
            // if
            // ((!getTestBase().getContext().getString("driver.name").equals("IOs"))
            // && (!winHandleBefore.equals(getDriver().getWindowHandle())))
            // {
            // PauseUtil.pause(5000);
            // SCHUtils.waitForLoaderToDismiss();
            // System.out.println("inside window handle if");
            // getDriver().switchTo().window(winHandleBefore);
            // }

            PauseUtil.pause(5000);
            SCHUtils.waitForLoaderToDismiss();
            System.out.println("outside window handle if2");
        }

        /**
         * @param cardoption
         * @param paypaloption
         */
        public void verifyPaymentOptions(String cardoption, String paypaloption) {
            getDrpPaymentMethoddrpdwn().click();
            // getDrpPaymentMethod().click();
            WaitUtils.waitForDisplayed(getDrpSelectCreditcard());
            AssertUtils.assertTextMatches(getDrpSelectCreditcard(),
                    Matchers.containsString(cardoption));
            AssertUtils.assertTextMatches(getDrpSelectedPaymentMethod(),
                    Matchers.containsString(paypaloption));
        }

        public void verifyPaymentOptions() {
            Select sel = new Select(drpPaymentMethod);
            Configuration data = getTestBase().getTestData();
            if (getTestBase().getTestData().getString("module") != null
                    && data.getString("module").equalsIgnoreCase("parent")) {

            } else {

                // This condition is required because if there are not SFO or
                // YTO orders(i.e: if there are only SOO orders) then there
                // won't be any payment method available
                // on the screen
                if (SCHUtils.getYTOOrderTotal() + SCHUtils.getSFOOrderTotal() != 0) {
                    List<WebElement> options = sel.getOptions();
                    String[] expected = {"Credit Card", "Checks",
                            "Combination of Credit Card and Checks", "Purchase Order",
                            "PayPal"};
                    for (int i = 1, j = 0; i < options.size(); i++, j++) {
                        AssertUtils.assertTextMatches(options.get(i),
                                Matchers.equalToIgnoringCase(expected[j]));
                    }

                }
            }
        }

        /**
         * Verify Shipping Information
         */
        public void verifyShippingInformation() {
            AssertUtils.assertDisplayed(getLblShippingTitle());
            AssertUtils.assertDisplayed(getLblShippingInfo());

        }

        public void verifyCardTypeField() {
            WaitUtils.waitForEnabled(getDrpCardType());
            PauseUtil.waitForAjaxToComplete(200);
            // getDrpCardType().click();
            Select select = new Select(getDrpCardType());
            List<WebElement> paymentMethodElement = select.getOptions();
            List<String> paymentMethodString = new ArrayList<String>();
            for (WebElement element : paymentMethodElement) {
                paymentMethodString.add(element.getText());
            }
            if (paymentMethodString.size() == 2) {
                paymentMethodString.contains("Select a Card");
                paymentMethodString.contains("Add a New Card");
            }

            Assert.assertTrue(
                    paymentMethodString.get(paymentMethodString.size() - 1)
                            .contains("Add a New Card"),
                    "Add a New Card is not bottom of the list");
            paymentMethodString.remove("Select a Card");
            paymentMethodString.remove("Add a New Card");
            Assert.assertTrue(paymentMethodString.size() <= 3,
                    "more than three card can be stored");

            select.selectByVisibleText("Add a New Card");
            AssertUtils.assertDisplayed(getFormCreditcard());

            if (paymentMethodString.size() != 0) {
                select.selectByVisibleText(paymentMethodString.get(0));
            }
            PauseUtil.waitForAjaxToComplete(5000);
        }

        public void verifySavedCreditcardInformation() {

            Configuration data = getTestBase().getTestData();

            if (data.getString("verifyCCthroughAPI") != null
                    && data.getString("verifyCCthroughAPI").equalsIgnoreCase("true")) {
                DMClient client = new DMClient();
                String str = null;
                str = client.getUser(getTestBase().getTestData().getString("userid"));
                System.out.println(str);

                JSONArray jsonArray = new JSONArray(str);

                JSONObject jsonObject = jsonArray.getJSONObject(0);

                JSONObject questionMark =
                        jsonObject.getJSONObject("wallet").getJSONObject("creditCards");
                Iterator keys = questionMark.keys();

                while (keys.hasNext()) {
                    // loop to get the dynamic key
                    String currentDynamicKey = (String) keys.next();
                    System.out.println(currentDynamicKey);
                    JSONObject currentDynamicValue =
                            questionMark.getJSONObject(currentDynamicKey);
                    String card_type = currentDynamicValue.getString("cardType");

                    String applied_card = (String) TestBaseProvider.getTestBase()
                            .getContext().getProperty("execution.card");
                    if (applied_card.toUpperCase().contains(card_type.toUpperCase())) {
                        String card_number =
                                currentDynamicValue.getString("maskedCardNumber");
                        int expire_month = currentDynamicValue.getJSONObject("expiration")
                                .getInt("monthOfYear");
                        int expire_year = currentDynamicValue.getJSONObject("expiration")
                                .getInt("year");
                        String first_name = currentDynamicValue
                                .getJSONObject("billingAddress").getString("firstName");
                        String last_name = currentDynamicValue
                                .getJSONObject("billingAddress").getString("lastName");
                        String add1 = currentDynamicValue.getJSONObject("billingAddress")
                                .getString("address1");
                        String add2 = currentDynamicValue.getJSONObject("billingAddress")
                                .getString("address2");
                        String city = currentDynamicValue.getJSONObject("billingAddress")
                                .getString("city");
                        String state = currentDynamicValue.getJSONObject("billingAddress")
                                .getString("state");
                        String country = currentDynamicValue
                                .getJSONObject("billingAddress").getString("country");
                        String postal_code = currentDynamicValue
                                .getJSONObject("billingAddress").getString("postalCode");

                        Assert.assertTrue(getImgCreditCardInfoIcon().getAttribute("class")
                                .toUpperCase().contains(card_type.toUpperCase()));

                        AssertUtils.assertTextMatches(getLblCreditCardInfoCardNumber(),
                                Matchers.containsString(
                                        card_number.substring(card_number.length() - 4)));

                        String month = getLblCreditCardInfoExpiry().getText().trim()
                                .split(" ")[1].split("/")[0];
                        String year = getLblCreditCardInfoExpiry().getText().trim()
                                .split(" ")[1].split("/")[1];
                        Assert.assertTrue(month.contains(String.valueOf(expire_month)),
                                "Month is Invalid");
                        Assert.assertTrue(year.contains(String.valueOf(expire_year)),
                                "Year is Invalid");
                        Assert.assertTrue(getLblBillingAddress().getText()
                                .contains(first_name)
                                || getLblBillingAddress().getText().contains(last_name));
                        AssertUtils.assertTextMatches(getLblBillingAddress(),
                                Matchers.containsString(add1));
                        AssertUtils.assertTextMatches(getLblBillingAddress(),
                                Matchers.containsString(add2));
                        AssertUtils.assertTextMatches(getLblBillingAddress(),
                                Matchers.containsString(postal_code));
                        AssertUtils.assertTextMatches(getLblBillingAddress(),
                                Matchers.containsString(city));
                        AssertUtils.assertTextMatches(getLblBillingAddress(),
                                Matchers.containsString(state));
                        AssertUtils.assertTextMatches(getLblBillingAddress(),
                                Matchers.containsString(country));
                    }
                }
            } else {
                // AssertUtils.assertTextMatches(getLblCreditCardInfoCardNumber(),
                // Matchers
                // .containsString(cardnumber.substring(cardnumber.length() -
                // 4)));
            }
            String month = getLblCreditCardInfoExpiry().getText().trim().split(" ")[1]
                    .split("/")[0];
            String year = getLblCreditCardInfoExpiry().getText().trim().split(" ")[1]
                    .split("/")[1];
            Assert.assertTrue(month.equalsIgnoreCase(data.getString("expmonth")),
                    "Month is Invalid");
            Assert.assertTrue(year.equalsIgnoreCase(data.getString("expyear")),
                    "Year is Invalid");
            AssertUtils.assertTextMatches(getLblBillingAddress(),
                    Matchers.containsString(data.getString("billingName")));
            AssertUtils.assertTextMatches(getLblBillingAddress(),
                    Matchers.containsString(data.getString("address1")));
            AssertUtils.assertTextMatches(getLblBillingAddress(),
                    Matchers.containsString(data.getString("address2")));
            AssertUtils.assertTextMatches(getLblBillingAddress(),
                    Matchers.containsString(data.getString("zip")));
            AssertUtils.assertTextMatches(getLblBillingAddress(),
                    Matchers.containsString(data.getString("city")));
            AssertUtils.assertTextMatches(getLblBillingAddress(),
                    Matchers.containsString(data.getString("state")));
        }

        public void verifyCreditcardInformationBillingAddressUneditable() {

            Assert.assertTrue(getcreditcardinfoSection().getTagName().contains("div"),
                    "Credit car information section is editable");

            Assert.assertTrue(getLblBillingAddress().getTagName().contains("div"),
                    "Billing address information section is editable");

        }

        /**
         * This Method Verify Check Details Label On Shipping And PAyment
         * Section Of Checkout Page after select checks as a payment method
         */
        public void verifyCheckDetailsOnShippingAndPaymentSection() {
            PauseUtil.waitForAjaxToComplete(30);
            WebElement labelCheckDetail = getLblCheckDetails();
            AssertUtils.assertTextMatches(labelCheckDetail,
                    Matchers.containsString(ConstantUtils.CHECKTEXT));
            AssertUtils.assertTextMatches(labelCheckDetail,
                    Matchers.containsString(ConstantUtils.CHECKTOADD1));
            AssertUtils.assertTextMatches(labelCheckDetail,
                    Matchers.containsString(ConstantUtils.CHECKTOADD2));

            AssertUtils.assertTextMatches(labelCheckDetail,
                    Matchers.containsString(ConstantUtils.CHECKTOADD3));
            AssertUtils.assertTextMatches(labelCheckDetail,
                    Matchers.containsString(ConstantUtils.CHECKINSTRUCTION));

        }

        /**
         * This method is used to create Paypal Account for Parent Checkout
         */
        public void createPayPalAccount() {

            getDriver().getWindowHandle();
            verifyContinueToPaypalOptionAndClick();
            PauseUtil.waitForAjaxToComplete(4000);
            switchToNewWindow();
        }

        public void verifyPamentWithCombinationOfCCAndChecks() {

            AssertUtils.assertDisplayed(getTxtCardCheckComboCardAmount());

            AssertUtils.assertDisplayed(getTxtCardCheckComboCheckAmount());

            Double totalAmount =
                    SCHUtils.getPriceWithOutCurrency(getTotalAmount().getText());

            Double cardAmount = Double
                    .parseDouble(getTxtCardCheckComboCardAmount().getAttribute("value"));
            Double checkAmount = Double
                    .parseDouble(getTxtCardCheckComboCheckAmount().getAttribute("value"));
            Assert.assertTrue(cardAmount == 0.0);

            getTxtCardCheckComboCardAmount().clear();
            getTxtCardCheckComboCardAmount().sendKeys(ConstantUtils.CCAMOUNT);
            PauseUtil.waitForAjaxToComplete(5000);
            cardAmount = Double.parseDouble(ConstantUtils.CCAMOUNT);
            getTxtCardCheckComboCheckAmount().click();
            PauseUtil.waitForAjaxToComplete(5000);
            checkAmount = totalAmount - cardAmount;
            Assert.assertTrue(Double.parseDouble(getTxtCardCheckComboCheckAmount()
                    .getAttribute("value")) == checkAmount);
            getTxtCardCheckComboCheckAmount().clear();
            getTxtCardCheckComboCheckAmount().sendKeys(ConstantUtils.CCAMOUNT);
            PauseUtil.waitForAjaxToComplete(10000);
            checkAmount = Double.parseDouble(ConstantUtils.CCAMOUNT);
            getTxtCardCheckComboCardAmount().click();
            cardAmount = totalAmount - checkAmount;

            getTestBase().getContext().setProperty("testexecution.paymentbycard.price",
                    String.valueOf(cardAmount));
            getTestBase().getContext().setProperty("testexecution.paymentbycheck.price",
                    String.valueOf(checkAmount));
            getTestBase().getContext().setProperty("testexecution.paymentmethod",
                    ConstantUtils.CHECKSANDCREDITCARD);
            Assert.assertTrue(Double.parseDouble(getTxtCardCheckComboCardAmount()
                    .getAttribute("value")) == cardAmount);

        }

        public boolean checkCCAvailblity() {
            boolean flag = false;
            Select select = new Select(getDrpCardType());
            List<WebElement> paymentMethodElement = select.getOptions();
            List<String> paymentMethodString = new ArrayList<String>();
            for (WebElement element : paymentMethodElement) {
                paymentMethodString.add(element.getText());
            }
            if (paymentMethodString.size() > 2) {
                flag = true;
            }
            select.selectByVisibleText(paymentMethodString.get(1));
            return flag;
        }

        public void paymentWithCardGreaterThanSpeAmount(String amount) {

            AssertUtils.assertDisplayed(getTxtCardCheckComboCardAmount());

            Double totalAmount =
                    SCHUtils.getPriceWithOutCurrency(getTotalAmount().getText());

            Double cardAmount = SCHUtils.getPriceWithOutCurrency(amount) + 1.00;
            getTestBase().getContext().setProperty("testexecution.paymentbycard.price",
                    String.valueOf(cardAmount));
            getTestBase().getContext().setProperty("testexecution.paymentbycheck.price",
                    String.valueOf(totalAmount - cardAmount));
            getTestBase().getContext().setProperty("testexecution.paymentmethod",
                    ConstantUtils.CHECKSANDCREDITCARD);
            if (totalAmount > cardAmount) {
                getTxtCardCheckComboCardAmount().clear();
                getTxtCardCheckComboCardAmount().sendKeys(cardAmount.toString());
                PauseUtil.waitForAjaxToComplete(5000);
                getTxtCardCheckComboCheckAmount().click();
            }

        }

        /**
         * This method verify Shipping Charge in Shipping And Payment Section Of
         * Checkout Page
         *
         * @param shippingCharge
         */
		/*public void verifyShippingCharge(String shippingCharge) {
			System.out.println("================> "
					+ getPriceByLabel(ConstantUtils.SHIPPING).getText());
			System.out.println(" shippingCharge=====> " + shippingCharge);
			Assert.assertTrue(
					getPriceByLabel(ConstantUtils.SHIPPING).getText().trim()
							.replace(".0", "").contains(shippingCharge.trim()),
					"Shipping Charge does not match");
		}*/




        public void verifyShippingCharge(String shippingCharge) {
            System.out.println("================> "
                    + getlblCouponsandRewardsShippingandHandlingStandardShipping().getText());
            System.out.println(" shippingCharge=====> " + shippingCharge);
            String ActualShippingCharge = getlblCouponsandRewardsShippingandHandlingStandardShipping().getText().trim();
            if(ActualShippingCharge.equals(shippingCharge))
            {
                Assert.fail("Shipping charge is not calculating for the orders which are not eligible for Free Shipping");
            }
			/*Assert.assertTrue(
					getlblCouponsandRewardsShippingandHandlingStandardShipping().getText().trim()
							.replace(".0", "").contains(shippingCharge.trim()),
					"Shipping Charge does not match");*/
        }


        public void verifyShippingCharge_Province(String shippingCharge, String tax1_per, String tax2_per) {
            System.out.println("================> "
                    + getlblCouponsandRewardsShippingandHandlingStandardShipping().getText());
            System.out.println(" shippingCharge=====> " + shippingCharge);

            String ActualShippingCharge_SubTotal1 = getCheckoutRewardCouponsShipSubtotal().getText().trim();
            ActualShippingCharge_SubTotal1 = ActualShippingCharge_SubTotal1.substring(1);
            double ActualShippingCharge_SubTotal=Double.parseDouble(ActualShippingCharge_SubTotal1);

            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.rewardscoupons.shipsubtotal", ActualShippingCharge_SubTotal);


            double shippingCharge_SubTotal_Exp = Double.parseDouble(shippingCharge);

            if(ActualShippingCharge_SubTotal!=shippingCharge_SubTotal_Exp)
            {
                Assert.fail("Shipping subtotal is not as per the expected. It should have been: "+shippingCharge_SubTotal_Exp);
            }

            //LINE 1 TAX CALCULATIONS

            // line1 tax for shipping for GST

            if(getCheckoutRewardCouponsShipTax1label().getText().equals("GST")){

                String ActualShippingCharge_GST1 = getCheckoutRewardCouponsShipTaxGst().getText().trim();
                ActualShippingCharge_GST1 = ActualShippingCharge_GST1.substring(1);
                double ActualShippingCharge_Line1 = Double.parseDouble(ActualShippingCharge_GST1);

                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.rewardscoupons.shiptax_line1", ActualShippingCharge_Line1);


                double taxrate_gst = Double.parseDouble(tax1_per);

                double shippingCharge_GST1_Exp = ((taxrate_gst/100)*ActualShippingCharge_SubTotal);

                double r = (double) Math.round(shippingCharge_GST1_Exp*100);
                double shippingCharge_GST_Exp = r / 100.0;


                if(ActualShippingCharge_Line1!=shippingCharge_GST_Exp)
                {
                    Assert.fail("Tax for GST is not as expected. It should have been: "+shippingCharge_GST_Exp);
                }

            }


            // line1 tax for shipping for PST

            if(getCheckoutRewardCouponsShipTax1label().getText().equals("PST")){

                String ActualShippingCharge_PST1 = getCheckoutRewardCouponsShipTaxGst().getText().trim();
                ActualShippingCharge_PST1 = ActualShippingCharge_PST1.substring(1);
                double ActualShippingCharge_Line1 = Double.parseDouble(ActualShippingCharge_PST1);

                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.rewardscoupons.shiptax_line1", ActualShippingCharge_Line1);


                double taxrate_pst = Double.parseDouble(tax1_per);

                double shippingCharge_PST1_Exp = ((taxrate_pst/100)*ActualShippingCharge_SubTotal);

                double r = (double) Math.round(shippingCharge_PST1_Exp*100);
                double shippingCharge_PST_Exp = r / 100.0;



                if(ActualShippingCharge_Line1!=shippingCharge_PST_Exp)
                {
                    Assert.fail("Tax for PST is not as expected. It should have been: "+shippingCharge_PST_Exp);
                }

            }




            // line1 tax for shipping for QST

            if(getCheckoutRewardCouponsShipTax1label().getText().equals("QST")){

                String ActualShippingCharge_QST1 = getCheckoutRewardCouponsShipTaxGst().getText().trim();
                ActualShippingCharge_QST1 = ActualShippingCharge_QST1.substring(1);
                double ActualShippingCharge_Line1 = Double.parseDouble(ActualShippingCharge_QST1);

                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.rewardscoupons.shiptax_line1", ActualShippingCharge_Line1);

                double taxrate_qst = Double.parseDouble(tax1_per);

                double shippingCharge_QST1_Exp = ((taxrate_qst/100)*ActualShippingCharge_SubTotal);

                double r = (double) Math.round(shippingCharge_QST1_Exp*100);
                double shippingCharge_QST_Exp = r / 100.0;


                if(ActualShippingCharge_Line1!=shippingCharge_QST_Exp)
                {
                    Assert.fail("Tax for PST is not as expected. It should have been: "+shippingCharge_QST_Exp);
                }

            }


            // line1 tax for shipping for HST

            if(getCheckoutRewardCouponsShipTax1label().getText().equals("HST")){

                String ActualShippingCharge_HST1 = getCheckoutRewardCouponsShipTaxGst().getText().trim();
                ActualShippingCharge_HST1 = ActualShippingCharge_HST1.substring(1);
                double ActualShippingCharge_Line1 = Double.parseDouble(ActualShippingCharge_HST1);

                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.rewardscoupons.shiptax_line1", ActualShippingCharge_Line1);


                double taxrate_hst = Double.parseDouble(tax1_per);

                double shippingCharge_HST1_Exp = ((taxrate_hst/100)*ActualShippingCharge_SubTotal);

                double r = (double) Math.round(shippingCharge_HST1_Exp*100);
                double shippingCharge_HST_Exp = r / 100.0;


                if(ActualShippingCharge_Line1!=shippingCharge_HST_Exp)
                {
                    Assert.fail("Tax for PST is not as expected. It should have been: "+shippingCharge_HST_Exp);
                }

            }


            //LINE 2 TAX CALCULATIONS

            if(chkCheckoutRewardCouponsShipTax2label().size()!=0){

                // line2 tax for shipping for PST
                if(getCheckoutRewardCouponsShipTax2label().getText().equals("PST")){

                    String ActualShippingCharge_PST1 = getCheckoutRewardCouponsShipTaxPst().getText().trim();
                    ActualShippingCharge_PST1 = ActualShippingCharge_PST1.substring(1);
                    double ActualShippingCharge_Line2 = Double.parseDouble(ActualShippingCharge_PST1);

                    TestBaseProvider.getTestBase().getContext()
                            .setProperty("testexecution.rewardscoupons.shiptax_line2", ActualShippingCharge_Line2);


                    double taxrate_pst = Double.parseDouble(tax2_per);

                    double shippingCharge_PST1_Exp = ((taxrate_pst/100)*ActualShippingCharge_SubTotal);

                    double r = (double) Math.round(shippingCharge_PST1_Exp*100);
                    double shippingCharge_PST_Exp = r / 100.0;


                    if(ActualShippingCharge_Line2!=shippingCharge_PST_Exp)
                    {
                        Assert.fail("Tax for PST in line2 is not as expected. It should have been: "+shippingCharge_PST_Exp);
                    }

                }



                // line2 tax for shipping for QST
                if(chkCheckoutRewardCouponsShipTax2label().size()!=0){

                    if(getCheckoutRewardCouponsShipTax2label().getText().equals("QST")){

                        String ActualShippingCharge_QST1 = getCheckoutRewardCouponsShipTaxPst().getText().trim();
                        ActualShippingCharge_QST1 = ActualShippingCharge_QST1.substring(1);
                        double ActualShippingCharge_Line2 = Double.parseDouble(ActualShippingCharge_QST1);

                        TestBaseProvider.getTestBase().getContext()
                                .setProperty("testexecution.rewardscoupons.shiptax_line2", ActualShippingCharge_Line2);


                        double taxrate_qst = Double.parseDouble(tax2_per);

                        double shippingCharge_QST1_Exp = ((taxrate_qst/100)*ActualShippingCharge_SubTotal);

                        double r = (double) Math.round(shippingCharge_QST1_Exp*100);
                        double shippingCharge_QST_Exp = r / 100.0;


                        if(ActualShippingCharge_Line2!=shippingCharge_QST_Exp)
                        {
                            Assert.fail("Tax for line 2 QST is not as expected. It should have been: "+shippingCharge_QST_Exp);
                        }

                    }

                }



                // line2 tax for shipping for HST
                if(chkCheckoutRewardCouponsShipTax2label().size()!=0){

                    if(getCheckoutRewardCouponsShipTax2label().getText().equals("HST")){

                        String ActualShippingCharge_HST1 = getCheckoutRewardCouponsShipTaxPst().getText().trim();
                        ActualShippingCharge_HST1 = ActualShippingCharge_HST1.substring(1);
                        double ActualShippingCharge_Line2 = Double.parseDouble(ActualShippingCharge_HST1);

                        TestBaseProvider.getTestBase().getContext()
                                .setProperty("testexecution.rewardscoupons.shiptax_line2", ActualShippingCharge_Line2);


                        double taxrate_hst = Double.parseDouble(tax2_per);

                        double shippingCharge_HST1_Exp = ((taxrate_hst/100)*ActualShippingCharge_SubTotal);

                        double r = (double) Math.round(shippingCharge_HST1_Exp*100);
                        double shippingCharge_HST_Exp = r / 100.0;


                        if(ActualShippingCharge_Line2!=shippingCharge_HST_Exp)
                        {
                            Assert.fail("Tax for line 2 HST is not as expected. It should have been: "+shippingCharge_HST_Exp);
                        }

                    }

                }

            }

        }

        public void verifyShippingCharge_Province_BlueBarTotal_TwoLine() {


            String ActualShippingCharge_BluebarTotal1 = getlblCouponsandRewardsShippingandHandlingStandardShipping().getText().trim();
            ActualShippingCharge_BluebarTotal1 = ActualShippingCharge_BluebarTotal1.substring(1);
            double ActualShippingCharge_BlueTotal=Double.parseDouble(ActualShippingCharge_BluebarTotal1);

            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.rewardscoupons.shipbluebartotal", ActualShippingCharge_BlueTotal);


            String ship_actualsubtotal1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardscoupons.shipsubtotal").toString();
            double ship_actualsubtotal = Double.parseDouble(ship_actualsubtotal1);
            //################################################################################
            String ship_line1Tax1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardscoupons.shiptax_line1").toString();
            double ship_line1Tax = Double.parseDouble(ship_line1Tax1);
            //################################################################################


            String ship_line2Tax1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardscoupons.shiptax_line2").toString();
            double ship_line2Tax = Double.parseDouble(ship_line2Tax1);

            //################################################################################

			/*String ship_line1PST1 = TestBaseProvider.getTestBase().getContext()
								.getProperty("testexecution.rewardscoupons.shiptax_line1PST").toString();
						double ship_line1PST = Double.parseDouble(ship_line1PST1);
						//################################################################################
						String ship_line1QST1 = TestBaseProvider.getTestBase().getContext()
								.getProperty("testexecution.rewardscoupons.shiptax_line1QST").toString();
						double ship_line1QST = Double.parseDouble(ship_line1QST1);
						//################################################################################

						String ship_line1HST1 = TestBaseProvider.getTestBase().getContext()
								.getProperty("testexecution.rewardscoupons.shiptax_line1HST").toString();
						double ship_line1HST = Double.parseDouble(ship_line1HST1);
						//################################################################################
						String ship_line2PST1 = TestBaseProvider.getTestBase().getContext()
								.getProperty("testexecution.rewardscoupons.shiptax_line2PST").toString();
						double ship_line2PST = Double.parseDouble(ship_line2PST1);
						//################################################################################
						String ship_line2QST1 = TestBaseProvider.getTestBase().getContext()
								.getProperty("testexecution.rewardscoupons.shiptax_line2QST").toString();
						double ship_line2QST = Double.parseDouble(ship_line2QST1);
						//################################################################################

						String ship_line2HST1 = TestBaseProvider.getTestBase().getContext()
								.getProperty("testexecution.rewardscoupons.shiptax_line2HST").toString();
						double ship_line2HST = Double.parseDouble(ship_line2HST1);
						//################################################################################
			 */
            double shippingCharge_BluebarTotal_Exp1 = ship_actualsubtotal+ship_line1Tax+ship_line2Tax;


            double r = (double) Math.round(shippingCharge_BluebarTotal_Exp1*100);
            double shippingCharge_BluebarTotal_Exp = r / 100.0;

            if(ActualShippingCharge_BlueTotal!=shippingCharge_BluebarTotal_Exp)
            {
                Assert.fail("Shipping total in blue bar is not as per the expected. It should have been: "+shippingCharge_BluebarTotal_Exp);
            }	





			/*Assert.assertTrue(
		getlblCouponsandRewardsShippingandHandlingStandardShipping().getText().trim()
				.replace(".0", "").contains(shippingCharge.trim()),
		"Shipping Charge does not match");*/
        }




        public void verifyShippingCharge_Province_BlueBarTotal_SingleLine() {


            String ActualShippingCharge_BluebarTotal1 = getlblCouponsandRewardsShippingandHandlingStandardShipping().getText().trim();
            ActualShippingCharge_BluebarTotal1 = ActualShippingCharge_BluebarTotal1.substring(1);
            double ActualShippingCharge_BlueTotal=Double.parseDouble(ActualShippingCharge_BluebarTotal1);

            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.rewardscoupons.shipbluebartotal", ActualShippingCharge_BlueTotal);


            String ship_actualsubtotal1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardscoupons.shipsubtotal").toString();
            double ship_actualsubtotal = Double.parseDouble(ship_actualsubtotal1);
            //################################################################################
            String ship_line1Tax1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardscoupons.shiptax_line1").toString();
            double ship_line1Tax = Double.parseDouble(ship_line1Tax1);
            //################################################################################

            double shippingCharge_BluebarTotal_Exp1 = ship_actualsubtotal+ship_line1Tax;


            double r = (double) Math.round(shippingCharge_BluebarTotal_Exp1*100);
            double shippingCharge_BluebarTotal_Exp = r / 100.0;

            if(ActualShippingCharge_BlueTotal!=shippingCharge_BluebarTotal_Exp)
            {
                Assert.fail("Shipping total in blue bar is not as per the expected. It should have been: "+shippingCharge_BluebarTotal_Exp);
            }	





			/*Assert.assertTrue(
						getlblCouponsandRewardsShippingandHandlingStandardShipping().getText().trim()
								.replace(".0", "").contains(shippingCharge.trim()),
						"Shipping Charge does not match");*/
        }



        public void verifyGSTAndPSTForShipping(){

        }




        // THIS IS FOR CALCULATINGT THE FREE SHIPPING IN AMOUNTS

		/*public void verifyFreeShippingCharge(String shippingCharge) {
			System.out.println("================> "
					+ getlblCouponsandRewardsShippingandHandlingTotalPrice().getText());
			System.out.println(" shippingCharge=====> " + shippingCharge);
			String FreeShipCharge1 = getlblCouponsandRewardsShippingandHandlingTotalPrice().getText().substring(1);
			String FreeShipCharge = FreeShipCharge1.trim();
			Assert.assertTrue(FreeShipCharge.contains(shippingCharge),
					"Shipping Charge does not match");
		}*/

        public void verifyFreeShippingCharge(String shippingCharge) {
        	PauseUtil.waitForAjaxToComplete(2000);
            PauseUtil.pause(3000);
            System.out.println("================> "
                    + getlblCouponsandRewardsShippingandHandlingBlueBar().getText());
            System.out.println("Expected Shipping Charge:" + shippingCharge);
            String FreeShipCharge = getlblCouponsandRewardsShippingandHandlingBlueBar().getText();
            System.out.println("Actual Shipping charge is:"+FreeShipCharge);
            String ActualShippingCharge = getlblCouponsandRewardsShippingandHandlingBlueBar().getText().trim();
            if(!ActualShippingCharge.equals(shippingCharge))  // 14.3 update
            {
                Assert.fail("Shipping charge should be FREE for Items eligible for Free Shipping");
            }

			/*Assert.assertTrue(FreeShipCharge.equals(shippingCharge),
					"Shipping Charge does not match");*/
        }


        public void verifyPurchaseOrderDetail() {
            AssertUtils.assertDisplayed(getLblPurchaseOrderInfo());
            AssertUtils.assertDisplayed(getLblPurchaseOrderBillingAddress());

        }

        public void selectShipingOption(String amount) {
            getShipingCharge(amount).click();
        }

        public void verifyUpadatedShipingCharge(String amount) {
            Assert.assertTrue(getShipingCharge(amount).getText()
                    .contains(getlblPaymentShipingcharge().getText()));

            Assert.assertTrue(
                    getShipingCharge(amount).getText()
                            .contains(SCHUtils
                                    .getPriceWithOutCurrency(
                                            getlblPaymentShipingcharge().getText())
                                    .toString()),
                    "Shipping fee is not updated");
        }

        public void selectTwoBusinessDayShipping() {
            SCHUtils.clickUsingJavaScript(getRadioshippingMethodSecondDay());
        }

        public void verifyCreditcardInformationNotSaved() {

            Configuration data = getTestBase().getTestData();
            AssertUtils.assertTextMatches(getLblBillingAddress(),
                    Matchers.containsString(data.getString("pre_address1")));
            AssertUtils.assertTextMatches(getLblBillingAddress(),
                    Matchers.containsString(data.getString("pre_address2")));
            AssertUtils.assertTextMatches(getLblBillingAddress(),
                    Matchers.containsString(data.getString("zip")));
            AssertUtils.assertTextMatches(getLblBillingAddress(),
                    Matchers.containsString(data.getString("city")));

        }

        public void selectTwoBuissnessDayShippingWithBonusPoint(String shippingMethod) {
            if (shippingMethod.equalsIgnoreCase("2-Business Day Shipping with Bonus")) {
                SCHUtils.waitForLoaderToDismiss();
                SCHUtils.clickUsingJavaScript(getRadioshippingMethodSecondDayBonus());
            } else {
                SCHUtils.waitForLoaderToDismiss();
                SCHUtils.clickUsingJavaScript(getRadioshippingMethodSecondDay());
            }
        }

        public void enterPurchaseOrderNumber() {
            PauseUtil.waitForAjaxToComplete(3000);
            getTxtPurchaseOrderNumber()
                    .sendKeys(String.valueOf(SCHUtils.getRandomNumber()));
        }

        public void selectStandardShipping() {
            SCHUtils.clickUsingJavaScript(getRadioStandardShipping());
        }

        public void verifyDefaultPaymentMethodDropdown() {

            AssertUtils.assertTextMatches(getDrpSelectedPaymentMethod(), Matchers
                    .equalToIgnoringCase(ConstantUtils.DEFAULT_PAYMENT_METHOD_OPTION));
        }

        public void verifyChildNamesAscOrder() {
            List<String> childNames = new ArrayList<String>();
            for (WebElement ele : getLstChildNames()) {
                childNames.add(ele.getText().split("'")[0]);
            }
            List<String> sortedList = new ArrayList<String>(childNames);
            Collections.sort(sortedList);
            Assert.assertTrue(sortedList.equals(childNames),
                    "Child name list is not in alphabetical order");
        }

        public void verifyIndividualChildTotal(String childName) {
            Double price = SCHUtils.getIndividualChildTotal(childName);
            AssertUtils.assertTextMatches(getlblChildTotal(childName.split(" ")[0]),
                    Matchers.equalToIgnoringCase(SCHUtils.getPriceWithDollar(price)));
        }

        private WebElement getlblChildTotal(String itemId) {
            return SCHUtils.findElement(
                    "dw.checkout.parent.shippingandpayment.paymentsection.lbl.childtotal",
                    itemId);
        }

        public void verifyPaymentSectionTotalForParent() {
            String childNames[] = SCHUtils.getArrayFromStringData(
                    TestBaseProvider.getTestBase().getTestData().getString("childname"));
            Double totalAmountDue = 0.0;
            for (String childName : childNames) {
                verifyIndividualChildTotal(childName);
                totalAmountDue += SCHUtils.getIndividualChildTotal(childName);
            }
            String price = SCHUtils.getPriceWithDollar(totalAmountDue);
            AssertUtils.assertTextMatches(getTotalAmount(),
                    Matchers.equalToIgnoringCase(price));
        }

        public void verifySelectionDisplay() {
            AssertUtils.assertTextMatches(getDrpSelectedPaymentMethod(),
                    Matchers.containsString("Add a New Card"));
            AssertUtils.assertDisplayed(getDrpSelectedPaymentMethod());
        }

        public void verifyShippingAddressOnShippingAndPayment(Configuration data) {
            HashMap<String, UserProfileBean> userMap = SCHUtils.getChildTeacherDetails();
            String[] child = SCHUtils.getArrayFromStringData(data.getString("childname"));
            for (String element : child) {
                for (String key : userMap.keySet()) {
                    if (key.contains(element)) {
                        UserProfileBean profileBean = userMap.get(key);
                        PauseUtil.waitForAjaxToComplete(1000);
                        String shippingdeatils = getLblShippingDetails().getText()
                                .replaceAll("\n", "").replace("'", "").replace("'", "")
                                .replace(",", "");

                        Assert.assertEquals(
                                shippingdeatils.contains(profileBean.getAddress()), true);
                        Assert.assertEquals(
                                shippingdeatils.contains(profileBean.getSchool()), true);
                        Assert.assertEquals(
                                shippingdeatils.contains(profileBean.getChildTeacher()),
                                true);
                    }
                }
            }
        }

        public void verifyOrderOfChildnameOnShippingAndPayment() {
            PauseUtil.waitForAjaxToComplete(5000);
            List<WebElement> lstChild = getListShippingAddress();
            Assert.assertTrue(SCHUtils.isSortedList(lstChild));
        }

        public void verifyAnotherFundingSourceInPaypal() {
            // PauseUtil.pause(5000);
            SCHUtils.waitForLoaderToDismiss();
            // Assert.assertTrue(getLnkChangePaypalSection().isDisplayed());
        }

        public void verifyPaymentMethodUneditable() {
            PauseUtil.waitForAjaxToComplete(3000);
            if (SCHUtils.isPresent(getDrpPaymentMethod())) {
                Assert.assertTrue(getDrpPaymentMethod().isDisplayed());
            } else {
                AssertUtils.assertDisplayed(getLblNoPaymentNeededNote());
            }
        }

        public void verifyEditCartLink() {
            AssertUtils.assertDisplayed(getLnkEditCart());
        }

        public void verifyCheckoutButtonState(String buttonState) {
            if (buttonState.equalsIgnoreCase("Enabled")) {
                AssertUtils.assertEnabled(getBtnContinueCheckout());
            } else {
                AssertUtils.assertDisabled(getBtnContinueCheckout());
            }
        }

        public void verifyHoverAction() {
            Actions action = new Actions(getDriver());
            action.moveToElement(getLnkParentShippingInfoWhy()).click().build()
                    .perform();;
            Assert.assertTrue(SCHUtils.isPresent(getLblShippingInfoWhy()));
        }

    }

    public class ConfirmAndSubmitOrder extends BaseTestPage<TestPage> implements IConfirmAndSubmitOrder {

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.btn.gobacktoshippingpage")
        private WebElement btngobacktoshppingpage;

        @FindBy(locator = "dw.checkout.shippingandpayment.confirmandordersubmit.savedpayapl.lbl.emailid")
        private WebElement lblSavedPayaplEmailIdOnOrderAndSubmit;

        @FindBy(locator = "dw.checkout.teacher.confirmandsubmitorder.lbl.customernumber")
        private WebElement lblcustomerNumber;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.lbl.confirmationemail")
        private WebElement lblConfirmationEmailAddress;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.confirmationemail.lnk.edit")
        private WebElement lnkEditConfirmationEmail;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.confirmationemail.editemail.btn.save")
        private WebElement btnSaveConfirmationEmail;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.confirmationemail.editemail.txt.email")
        private WebElement txtConfirmationEmail;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.confirmationemail.textbox.editemail")
        private WebElement textboxEditEmail;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.tab.rewardsandcoupon")
        private WebElement tabRewardsAndCoupon;

        public WebElement getTabRewardsAndCoupon() {
            return tabRewardsAndCoupon;
        }

        public WebElement getTextboxEditEmail() {
            return textboxEditEmail;
        }

        private WebElement lblItemTite;

        private WebElement lblItemPrice;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.lbl.receipt")
        private WebElement lblReceipt;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.lbl.email")
        private WebElement confirmationEmailText;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.btn.submitorder")
        private WebElement btnSubmitOrder;

        @FindBy(locator = "dw.checkout.confirmationpage.orderrefno")
        private WebElement orderrefnoConfirmationpage;

        @FindBy(locator = "dw.checkout.view.confirmationpage.orderrefno")
        private WebElement orderrefnoviewConfirmationpage;

        @FindBy(locator = "dw.chekcout.confirmandsubmitorder.btn.editcartlink")
        private WebElement btneditcartonconfirmpage;

        @FindBy(locator = "dw.checkout.confirmAndSubmit.lbl.errormessage")
        private WebElement lblErrorMessageOnConfirmOrderSubmit;

        @FindBy(locator = "dw.checkout.confirmandsubmit.lnk.editorsetduedate")
        private WebElement lnkEditOrSetDueDate;

        @FindBy(locator = "dw.checkout.confirmandsubmit.lbl.duedate")
        private WebElement lblDueDate;

        @FindBy(locator = "dw.checkout.confirmandsubmit.title.duedate")
        private WebElement lblTitleDueDate;

        @FindBy(locator = "dw.checkout.orderconfirmation.btn.print")
        private WebElement btnPrintOnOrderConfirmationPage;

        @FindBy(locator = "dw.checkout.confirmationpage.referencenumber")
        private WebElement LblReferenceNumberOnOrderConfirmationPage;


        @FindBy(locator = "dw.checkout.confirmandsubmitorder.coupondetail.lbl.strikedprice")
        private WebElement lblStrikedPrice;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.coupondetail.lbl.strikedandnewprice")
        private WebElement lblStrikedAndNewPrice;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.rewards.lbl.tossin")
        private WebElement lblTossInQty;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.rewards.lbl.tossin.QA")
        private WebElement lblTossInQA;


        @FindBy(locator = "dw.checkout.confirmationpage.rewards.lbl.tossin.QA")
        private WebElement lblTossInQty_ConfirmationPage;

        @FindBy(locator = "dw.checkout.confirmationpage.rewards.lbl.tossin.QA")
        private WebElement confirmpagelblTossInQA;


        @FindBy(locator = "dw.checkout.confirmandsubmitorder.lnk.downloadadonationcertificate")
        private WebElement lnkDownloadDonationCertificate;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.parent.lbl.errormessage")
        private WebElement lblErrorMesage;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.wishlist.table.header.itemid")
        private WebElement lblWishListItemIdHeader;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.wishlist.table.header.title")
        private WebElement lblWishListItemTitleHeader;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.wishlist.table.header.flyer")
        private WebElement lblWishListFlyerHeader;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.wishlist.table.header.price")
        private WebElement lblWishListItemPriceHeader;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.wishlist.table.header.quantity")
        private WebElement lblWishListItemQuantityHeader;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.wishlist.table.header.givenby")
        private WebElement lblWishListGivenByHeader;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.wishlist.table.body.itemid")
        private List<WebElement> lstWishListItemId;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.wishlist.table.body.title")
        private List<WebElement> lstWishListItemTitle;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.wishlist.table.body.flyer")
        private List<WebElement> lstWishListItemFlyer;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.wishlist.table.body.price")
        private List<WebElement> lstWishListItemPrice;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.wishlist.table.body.quantity")
        private List<WebElement> lstWishListItemQuantity;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.wishlist.table.body.givenby")
        private List<WebElement> lstWishListItemGivenBy;

        @FindBy(locator = "dw.checkout.submitorder.lst.btn.print")
        private List<WebElement> lstBtnPrint;

        @FindBy(locator = "dw.checkout.confirmandsubmitorder.classroomwishlist.lbl.teacherinfo")
        private WebElement lblClassroomTeacherInfo;

        @FindBy(locator = "dw.checkout.submitorder.applestatus.message")
        private WebElement appleStatusMessage;

        @FindBy(locator = "dw.reviewcart.btn.proceedtocheckout")
        private WebElement btnProceedToCheckout;

        @FindBy(locator = "dw.reviewcart.proceedtocheckout.bonuspointmodel.btn.proceedtocheckout")
        private WebElement btnBonuspointModelProceedToCheckout;

        @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.continuecheckout")
        private WebElement btnContinueCheckout;


        public WebElement getBtnContinueCheckout() {
            return btnContinueCheckout;
        }

        public WebElement getBtnBonuspointModelProceedToCheckout() {
            return btnBonuspointModelProceedToCheckout;
        }




        public WebElement get() {
            return btnBonuspointModelProceedToCheckout;
        }

        public WebElement getBtnProceedToCheckout() {
            return btnProceedToCheckout;
        }

        public WebElement getAppleStatusMessage() {
            return appleStatusMessage;
        }

        public WebElement getLblClassroomTeacherInfo() {
            return lblClassroomTeacherInfo;
        }

        public WebElement getLblSavedPayaplEmailIdOnOrderAndSubmit() {
            return lblSavedPayaplEmailIdOnOrderAndSubmit;
        }

        public WebElement getBtneditcartonconfirmpage() {
            return btneditcartonconfirmpage;
        }

        public WebElement getTeacherwishListItemSection(String heading) {
            return SCHUtils.findElement(
                    "dw.checkout.confirmandsubmitorder.wishlist.section", heading);
        }

        public WebElement getLblWishListItemIdHeader() {
            return lblWishListItemIdHeader;
        }

        public WebElement getLblWishListItemTitleHeader() {
            return lblWishListItemTitleHeader;
        }

        public WebElement getLblWishListFlyerHeader() {
            return lblWishListFlyerHeader;
        }

        public WebElement getLblWishListItemPriceHeader() {
            return lblWishListItemPriceHeader;
        }

        public WebElement getLblWishListItemQuantityHeader() {
            return lblWishListItemQuantityHeader;
        }

        public WebElement getLblWishListGivenByHeader() {
            return lblWishListGivenByHeader;
        }

        public List<WebElement> getLstWishListItemId() {
            return lstWishListItemId;
        }

        public List<WebElement> getLstWishListItemTitle() {
            return lstWishListItemTitle;
        }

        public List<WebElement> getLstWishListItemFlyer() {
            return lstWishListItemFlyer;
        }

        public List<WebElement> getLstWishListItemPrice() {
            return lstWishListItemPrice;
        }

        public List<WebElement> getLstWishListItemQuantity() {
            return lstWishListItemQuantity;
        }

        public List<WebElement> getLstWishListItemGivenBy() {
            return lstWishListItemGivenBy;
        }

        public List<WebElement> getLstBtnPrint() {
            return lstBtnPrint;
        }

        public WebElement getLblErrorMesage() {
            return lblErrorMesage;
        }

        public WebElement getStudentAndTeacherinTitle(String name) {
            return findElement(
                    "dw.checkout.confirmandsubmitorder.orderdetail.studentandteachertitle",
                    name);
        }

        public WebElement getChildDetailsInGrid(String itemNumber, String detail) {
            return findElement(
                    "dw.checkout.confirmandsubmitorder.orderdetail.childdetailsingrid",
                    itemNumber, detail);
        }

        public WebElement getClasswishListOrDonationSection(String sectionName) {
            return findElement(
                    "dw.checkout.orderhistory.orderdetail.wishlist.donation.section",
                    sectionName);
        }

        public WebElement getItemImageForSection(String sectionName) {
            return findElement(
                    "dw.checkout.orderhistory.orderdetail.wishlist.donation.table.item.image",
                    sectionName);

        }

        public WebElement getItemDetailsForSection(String sectionName) {
            return findElement(
                    "dw.checkout.orderhistory.orderdetail.wishlist.donation.table.item.details",
                    sectionName);

        }

        public WebElement getItemQuantityForSection(String sectionName) {
            return findElement(
                    "dw.checkout.orderhistory.orderdetail.wishlist.donation.table.item.quantity",
                    sectionName);

        }

        public WebElement getItemTotalForSection(String sectionName) {
            return findElement(
                    "dw.checkout.orderhistory.orderdetail.wishlist.donation.table.item.price",
                    sectionName);

        }

        public WebElement getLnkDownloadDonationCertificate() {
            return lnkDownloadDonationCertificate;
        }

        public WebElement getLblTossInQty() {
            return lblTossInQty;
        }

        public WebElement getLblTossInQA() {
            return lblTossInQA;
        }

        public WebElement getLblTossInQAConfirmationPage() {
            return confirmpagelblTossInQA;
        }

        public WebElement getLblTossInQty_ConfirmationPage() {
            return lblTossInQty_ConfirmationPage;
        }

        public void setLblTossInQty(WebElement lblTossInQty) {
            this.lblTossInQty = lblTossInQty;
        }

        public WebElement getLblStrikedPrice() {
            return lblStrikedPrice;
        }

        public WebElement getLblStrikedAndNewPrice() {
            return lblStrikedAndNewPrice;
        }

        public WebElement getBtnPrintOnOrderConfirmationPage() {
            return btnPrintOnOrderConfirmationPage;
        }

        public WebElement getLblReferenceNumberOnOrderConfirmationPage() {
            return LblReferenceNumberOnOrderConfirmationPage;
        }

        public WebElement getLblItemTite() {
            return lblItemTite;
        }

        public WebElement getLblItemPrice() {
            return lblItemPrice;
        }

        public WebElement getConfirmationEmailText() {
            return confirmationEmailText;
        }

        public WebElement getLblTitleDueDate() {
            return lblTitleDueDate;
        }

        public WebElement getLblErrorMessageOnConfirmOrderSubmit() {
            return lblErrorMessageOnConfirmOrderSubmit;
        }

        public WebElement getBtnEditCartOnConfirmpage() {
            return btneditcartonconfirmpage;
        }

        public WebElement getLnkEditOrSetDueDate() {
            return lnkEditOrSetDueDate;
        }

        public WebElement getLblDueDate() {
            return lblDueDate;
        }

        public WebElement getConfirmationEmail() {
            return confirmationEmailText;
        }

        public WebElement getLblReceipt() {
            return lblReceipt;
        }

        public void setLblReceipt(WebElement lblReceipt) {
            this.lblReceipt = lblReceipt;
        }

        public WebElement getBtngobacktoshppingpage() {
            return btngobacktoshppingpage;
        }

        public WebElement getLblcustomerNumber() {
            return lblcustomerNumber;
        }

        public WebElement getLblConfirmationEmailAddress() {
            return lblConfirmationEmailAddress;
        }

        public WebElement getLnkEditConfirmationEmail() {
            return lnkEditConfirmationEmail;
        }

        public WebElement getBtnSaveConfirmationEmail() {
            return btnSaveConfirmationEmail;
        }

        public WebElement getTxtConfirmationEmail() {
            return txtConfirmationEmail;
        }

        public WebElement getBtnSubmitOrder() {
            return btnSubmitOrder;
        }

        public WebElement getorderrefnoConfirmationpage() {
            return orderrefnoConfirmationpage;
        }

        public WebElement getorderrefnoviewConfirmationpage() {
            return orderrefnoviewConfirmationpage;
        }



        public void setBtnSubmitOrder(WebElement btnSubmitOrder) {
            this.btnSubmitOrder = btnSubmitOrder;
        }

        public WebElement getItemTitle(String itemId) {
            lblItemTite = SCHUtils.findElement(
                    "dw.checkout.confirmandsubmitorder.orderdetail.itemtitle", itemId);
            return lblItemTite;
        }

        public WebElement getItemPrice(String itemId) {
            lblItemPrice = SCHUtils.findElement(
                    "dw.checkout.confirmandsubmitorder.orderdetail.itemprice", itemId);
            return lblItemPrice;
        }

        public WebElement getItemQuantity(String itemId) {

            return SCHUtils.findElement(
                    "dw.checkout.confirmandsubmitorder.orderdetail.lbl.itemquantity",
                    itemId);

        }

        public WebElement getSectionByLabel(String label) {
            return findElement("dw.checkout.confirmandsubmitorder.sectionbylabel", label);
        }

        public WebElement getBtngobacktoshippingpage() {
            return btngobacktoshppingpage;
        }

        public WebElement getImgGoldAppleIcon() {
            return imgGoldAppleIcon;
        }

        public WebElement getImgRedAppleIcon() {
            return imgRedAppleIcon;
        }

        public WebElement getImgGreenAppleIcon() {
            return imgGreenAppleIcon;
        }

        public WebElement getChildTeacherDetails(String childName, String details) {
            return SCHUtils.findElement(
                    "dw.checkout.parent.confirmandsubmitorder.lbl.detailbychildname",
                    details, childName);
        }

        public WebElement getLblCouponDescription(String couponName) {
            return SCHUtils.findElement(
                    "dw.checkout.confirmandsubmitorder.coupondetail.lbl.coupondescription",
                    couponName);
        }

        public WebElement getLblCouponNumber(String couponName) {
            return SCHUtils.findElement(
                    "dw.checkout.confirmandsubmitorder.coupondetail.lbl.coupondname",
                    couponName);
        }

        public WebElement getCmpParentCouponItemDetail(String couponName) {
            return SCHUtils.findElement(
                    "dw.checkout.confirmandsubmitorder.coupondetail.cmp.itemdetail.parent",
                    couponName);
        }

        public WebElement getLblCouponItemNumber(String couponName, String itemNumber) {
            return SCHUtils.findElement(
                    "dw.checkout.confirmandsubmitorder.coupondetail.lbl.itemnumber",
                    couponName, itemNumber);
        }

        public WebElement getLblCouponItemTitle(String couponName, String itemNumber) {
            return SCHUtils.findElement(
                    "dw.checkout.confirmandsubmitorder.coupondetail.lbl.itemtitle",
                    couponName, itemNumber);
        }

        public WebElement getLblCouponItemPrice(String couponName, String itemNumber) {
            return SCHUtils.findElement(
                    "dw.checkout.confirmandsubmitorder.coupondetail.lbl.itemprice",
                    couponName, itemNumber);
        }

        public WebElement getLblCouponItemFlyer(String couponName, String itemNumber) {
            return SCHUtils.findElement(
                    "dw.checkout.confirmandsubmitorder.coupondetail.lbl.itemflyer",
                    couponName, itemNumber);
        }

        public WebElement getLblCouponItemQuantity(String couponName, String itemNumber) {
            return SCHUtils.findElement(
                    "dw.checkout.confirmandsubmitorder.coupondetail.lbl.itemquantity",
                    couponName, itemNumber);
        }

        @Override
        protected void openPage() {
            // TODO Auto-generated method stub

        }

        public String getLastFourDigit(String text) {
            return text.substring(text.length() - 4);
        }

        public void verifyConfirmAndSubmitPage() {
            PauseUtil.waitForAjaxToComplete();
            WaitUtils.waitForDisplayed(getLblPageSubTitle());
            PauseUtil.pause(4000);
            AssertUtils.assertTextMatches(getLblPageSubTitle(),
                    Matchers.containsString(ConstantUtils.CONFIRMANDSUBMITORDER));

        }


        public void verifyQAStudentIncentiveNotPresent() {
            //AssertUtils.assertNotDisplayed(getLblTossInQA());
            AssertUtils.assertNotPresent((ExtendedElement) getLblTossInQA());

        }


        public void verifyQAStudentIncentiveNotPresent_ConfirmationPage() {
            //AssertUtils.assertNotDisplayed(getLblTossInQAConfirmationPage());
            AssertUtils.assertNotPresent((ExtendedElement) getLblTossInQAConfirmationPage());

        }



        @Override
        public void navigateToCouponsRewardsPageFromConfirmSubmitPage() {
            CartPage crtpge = new CartPage();

            SCHUtils.waitForLoaderToDismiss();
            WaitUtils.waitForDisplayed(getBtneditcartonconfirmpage());
            SCHUtils.clickUsingJavaScript(getBtneditcartonconfirmpage());
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete();
            WaitUtils.waitForDisplayed(getBtnProceedToCheckout());
            SCHUtils.clickUsingJavaScript(getBtnProceedToCheckout());
            SCHUtils.waitForLoaderToDismiss();
            if (SCHUtils.isPresent(crtpge.getbtntopBonuspointModelProceedToCheckout())) {
                SCHUtils.clickUsingJavaScript(crtpge.getbtntopBonuspointModelProceedToCheckout());
                PauseUtil.pause(1000);
                SCHUtils.waitForLoaderToDismiss();
                PauseUtil.waitForAjaxToComplete();
            }
            WaitUtils.waitForDisplayed(getBtnContinueCheckout());
        }





        public void setTeacherOrderInfo() {
            HashMap<String, ProductInfoBean> productMap = SCHUtils.getPOProductItems();

            for (String key : productMap.keySet()) {
                if (!(key.startsWith("donation") || key.contains("wishlist"))) {
                    ProductInfoBean productInfoBean = productMap.get(key);
                    System.out.println("Child name -" + productInfoBean.getStudentName());
                    SCHUtils.addPOSOOProduct(
                            SCHUtils.getChildTeacherInfoByChildName(
                                    productInfoBean.getStudentName()).getChildTeacher(),
                            productInfoBean.getStudentName(),
                            productInfoBean.getItemNumber(), productInfoBean);
                }

            }
        }

        /**
         * This method is used to edit Email Address
         *
         * @param email
         */
        public void editEmailAddress(String email) {
            if (SCHUtils.isPresent(getLnkEditConfirmationEmail())) {
                try {
                    getLnkEditConfirmationEmail().click();
                } catch (Exception e) {

                }
            }
            AssertUtils.assertDisplayed(getTextboxEditEmail());
            getTextboxEditEmail().sendKeys(email);
            AssertUtils.assertDisplayed(getBtnSaveConfirmationEmail());
            getBtnSaveConfirmationEmail().click();

        }

        /**
         * this method verify error message on confirm and submit order page
         *
         * @param errorMessage
         */
        public void verifyErrorMessageOnConfirmAndSubmitSection(String errorMessage) {
            AssertUtils.assertTextMatches(lblErrorMessageOnConfirmOrderSubmit,
                    Matchers.containsString(errorMessage));
        }

        /**
         * This Method Verify Email Address on Order Confirm and submit order
         * page
         */
        public void verifyEmailAddress() {
            getTestBase().getTestData().setProperty("email",
                    getTestBase().getTestData().getString("userid"));
            AssertUtils.assertTextMatches(getConfirmationEmailText(), Matchers
                    .equalToIgnoringCase(getTestBase().getTestData().getString("email")));
        }

        public void updateEmailAddress() {
            getLnkEditConfirmationEmail().click();
            getTextboxEditEmail().clear();
            getTextboxEditEmail()
                    .sendKeys(getTestBase().getTestData().getString("invalidemail"));
            getBtnSaveConfirmationEmail().click();
            AssertUtils.assertTextMatches(lblErrorMessageOnConfirmOrderSubmit,
                    Matchers.containsString(ConstantUtils.INVALIDEMAILIDMESSAGE));
            getTextboxEditEmail().clear();
            getTextboxEditEmail()
                    .sendKeys(getTestBase().getTestData().getString("updatedemail"));
            getBtnSaveConfirmationEmail().click();
            AssertUtils.assertTextMatches(getConfirmationEmailText(),
                    Matchers.containsString(
                            getTestBase().getTestData().getString("updatedemail")));
            Map<String, UserProfileBean> SFOProducts = SCHUtils.getChildTeacherDetails();
            for (String key : SFOProducts.keySet()) {
                UserProfileBean details = SFOProducts.get(key);
                Assert.assertTrue(details.getEmail().equalsIgnoreCase(
                        getTestBase().getTestData().getString("email")));
            }
        }

        /**
         * verify Print Option on
         */
        public void verifyPrintOption() {
            if (getContext().getString("platform").equalsIgnoreCase("android")
                    || getContext().getString("platform").equalsIgnoreCase("ios")) {
                AssertUtils.assertNotDisplayed(getBtnPrintOnOrderConfirmationPage());

            } else {
                AssertUtils.assertDisplayed(getBtnPrintOnOrderConfirmationPage());
            }
        }

        /**
         * verify Order number on order confirmation page
         */
        public void verifyOrderNumber() {
            AssertUtils.assertDisplayed(getLblcustomerNumber());
        }

        /**
         * This method verify card payment method selected
         */
        public void verifyPaymentMethodDetailsOnConfirmAndSubmit() {
            if (TestBaseProvider.getTestBase().getContext()
                    .getProperty("testExecution.paymentMethod") != null) {
                WebElement paymentSection = getSectionByLabel(ConstantUtils.PAYMENT_TEXT);
                String paymentMethod = (String) TestBaseProvider.getTestBase()
                        .getContext().getProperty("testExecution.paymentMethod");

                if (paymentMethod.equals(ConstantUtils.PAYPALPAYMENTMETHOD)) {
                    System.out
                            .println("##########payment:" + paymentSection
                                    .findElement(By.cssSelector(
                                            ".sec-info-module-inner td:nth-child(1)"))
                                    .getText());
                    Assert.assertTrue(paymentSection
                            .findElement(By.cssSelector(
                                    ".sec-info-module-inner td:nth-child(1)"))
                            .getText().contains(paymentMethod));
                    Assert.assertTrue(paymentSection
                            .findElement(By.cssSelector(
                                    ".sec-info-module-inner td:nth-child(1)"))
                            .getText().contains(TestBaseProvider.getTestBase()
                                    .getTestData().getString("paypalemail")));
                } else {
                    Assert.assertTrue(
                            paymentSection
                                    .findElement(
                                            By.cssSelector(".sec-info-module-inner b"))
                                    .getText().contains(paymentMethod));

                }
            }
        }

        public void verifyOrderSummaryDetails() {
            new ReviewOrdersPage();

            AssertUtils.assertDisplayed(getPriceByLabel(ConstantUtils.ORDERSUMMARY_TEXT));
            AssertUtils.assertDisplayed(getPriceByLabel(ConstantUtils.PAYMENT_TEXT));
            AssertUtils.assertDisplayed(getPriceByLabel(ConstantUtils.SHIPPING_TEXT));
            AssertUtils.assertDisplayed(getPriceByLabel(ConstantUtils.ORDERDETAIL_TEXT));

            // Order Summary Section

            SCHUtils.getPriceWithOutCurrency(
                    getPriceByLabel(ConstantUtils.ORDERSUMMARY_TEXT)
                            .findElement(By.cssSelector(".total .price")).getText());
        }

        public void verifyShippingSectionDetails() {
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(5000);
            if (TestBaseProvider.getTestBase().getTestData().getString("module")
                    .equals("parent")
                    && TestBaseProvider.getTestBase().getTestData()
                    .getString("childname") != null
                    && !TestBaseProvider.getTestBase().getTestData()
                    .getString("childname").equals("none")) {
                String childNameArray[] = SCHUtils.getArrayFromStringData(TestBaseProvider
                        .getTestBase().getTestData().getString("childname"));
                for (String element : childNameArray) {
                    UserProfileBean profileBean =
                            SCHUtils.getChildTeacherInfoByChildName(element);
                    System.out.println("Child Name array......." + childNameArray);
                    String childName = element.substring(0, element.indexOf(" "));
                    System.out.println("CHild Name...." + childName);
					/*
					 * System.out.println("elemenmt value------------>" +
					 * element);
					 * System.out.println("normal value------------>"
					 * + getChildTeacherDetails(childName,
					 * profileBean.getChildTeacher().split(" ")[0]));
					 */
                    AssertUtils.assertDisplayed(
                            getChildTeacherDetails(childName, profileBean.getSchool()));
                    System.out.println(
                            "teacher name-----" + profileBean.getChildTeacher().trim());
                    // String teacherName =
                    // profileBean.getTeacherwithSalutation().split("\\.")[1]
                    // .split("'s")[0];
                    // teacherName.replace(teacherName.substring(0, 1),
                    // teacherName.substring(0, 1).toLowerCase());
                    AssertUtils.assertDisplayed(getChildTeacherDetails(childName,
                            profileBean.getChildTeacher().trim().split(" ")[0]));
                    // AssertUtils.assertDisplayed(getChildTeacherDetails(childName,
                    // profileBean.getChildTeacher().trim()));

                    AssertUtils.assertDisplayed(
                            getChildTeacherDetails(childName, profileBean.getAddress()));
                    AssertUtils.assertDisplayed(
                            getChildTeacherDetails(childName, profileBean.getCity()));
                }

            }

        }

        public void verifyAppleStatus() {
            AssertUtils.assertDisplayed(getAppleStatusMessage());
        }

        // this method verifies
        // summary(grade,readinglevel,age,itemtitle,child+teachername in
        // heading,quantity,price) for each child purchasing respective item in
        // orderdetail section of both submit-order and receipt page.
        // @author poonam mehta
        public void verifyItemSummaryForEachChild() {
            if (TestBaseProvider.getTestBase().getTestData().getString("module")
                    .equals("parent")
                    && TestBaseProvider.getTestBase().getTestData()
                    .getString("itemid") != null
                    && !TestBaseProvider.getTestBase().getTestData().getString("itemid")
                    .equals("none")) {
                String itemIdArray[] = SCHUtils.getArrayFromStringData(
                        TestBaseProvider.getTestBase().getTestData().getString("itemid"));
                String childNameArray[] = SCHUtils.getArrayFromStringData(TestBaseProvider
                        .getTestBase().getTestData().getString("childname"));
                for (int index = 0; index < itemIdArray.length; index++) {
                    ProductInfoBean productInfoBean =
                            SCHUtils.getPOProductByIDAndStudentName(
                                    itemIdArray[index] + childNameArray[index]);
                    PauseUtil.waitForAjaxToComplete(5000);

                    AssertUtils.assertDisplayed(getStudentAndTeacherinTitle(
                            productInfoBean.getStudentName().substring(0,
                                    productInfoBean.getStudentName().indexOf(" "))));

                    AssertUtils.assertDisplayed(getChildDetailsInGrid(
                            productInfoBean.getItemNumber(), productInfoBean.getAges()));
                    AssertUtils.assertDisplayed(
                            getChildDetailsInGrid(productInfoBean.getItemNumber(),
                                    productInfoBean.getGrades()));
                    // AssertUtils.assertDisplayed(
                    // getChildDetailsInGrid(productInfoBean.getItemNumber(),
                    // productInfoBean.getReadingLevel()));

                    AssertUtils.assertDisplayed(
                            getItemTitle(productInfoBean.getItemNumber()));
                    AssertUtils.assertDisplayed(
                            getItemPrice(productInfoBean.getItemNumber()));
                    AssertUtils.assertDisplayed(
                            getItemQuantity(productInfoBean.getItemNumber()));

                }

            }

        }

        public void verifyPaymentSection() {
            String paymentMethod = TestBaseProvider.getTestBase().getTestData()
                    .getString("paymentmethod");
            WebElement paymentSection = getSectionByLabel(ConstantUtils.PAYMENT_TEXT);
            Assert.assertTrue(
                    paymentSection.findElement(By.cssSelector(".sec-info-module-inner b"))
                            .getText().contains(paymentMethod),
                    "Payment option contains -" + paymentMethod);
            Double actualDisplayedTotalOnPayment = SCHUtils.getPriceWithOutCurrency(
                    paymentSection.findElement(By.cssSelector(".price")).getText());
            Assert.assertEquals(
                    SCHUtils.getProductItemTotal(SCHUtils.getPOProductItems()),
                    actualDisplayedTotalOnPayment);
            if (TestBaseProvider.getTestBase().getTestData()
                    .getString("cardname") != null) {
                // String paymentText[] =
                // paymentSection.findElement(By.tagName("div"))
                // .getText().split("\n");
                // If adding new CC then the card name will be only like 'Visa'
                // so in that case the card number added will be verified
                String expectedCardName = getLastFourDigit(TestBaseProvider.getTestBase()
                        .getTestData().getString("cardname"));
                if (!SCHUtils.isNumeric(expectedCardName)) {
                    expectedCardName = getLastFourDigit(TestBaseProvider.getTestBase()
                            .getTestData().getString("cardnumber"));
                }
				/*
				 * Assert.assertTrue(
				 * getLastFourDigit(paymentText[1]).equals(expectedCardName),
				 * "Last four digit of credit card are same as original");
				 */
            }
            if (TestBaseProvider.getTestBase().getTestData().getString("paymentmethod")
                    .equals(ConstantUtils.PAYPAL)
                    && TestBaseProvider.getTestBase().getTestData()
                    .getString("paypalUserName") != null) {
                String paymentText[] = paymentSection.findElement(By.tagName("div"))
                        .getText().split("\n");
                Assert.assertTrue(
                        paymentText[1].equals(TestBaseProvider.getTestBase().getTestData()
                                .getString("paypalUserName")),
                        "Paypal email id is present");
            }

        }

        public void verifyParentOrderSummarySection() {
            System.out.println("Module-"
                    + TestBaseProvider.getTestBase().getTestData().getString("module"));
            if (TestBaseProvider.getTestBase().getTestData().getString("module")
                    .equals("parent")) {
                SCHUtils.waitForLoaderToDismiss();
                WebElement paymentSection =
                        getSectionByLabel(ConstantUtils.ORDERSUMMARY_TEXT);
                AssertUtils.assertDisplayed(
                        paymentSection.findElement(By.cssSelector(".cart-total .price")));
                AssertUtils.assertDisplayed(
                        paymentSection.findElement(By.cssSelector(".total .price")));
                Double total = SCHUtils.getPriceWithOutCurrency(paymentSection
                        .findElement(By.cssSelector(".total .price")).getText());
                // System.out.println("price from element----" + total);
                // System.out.println("price from bean--------"
                // +
                // SCHUtils.getProductItemTotal(SCHUtils.getPOProductItems()));

                Assert.assertEquals(
                        SCHUtils.getProductItemTotal(SCHUtils.getPOProductItems()),
                        total);

            }
        }

        public ConfirmAndSubmitOrder getConfirmAndSubmitOrder() {
            return new ConfirmAndSubmitOrder();
        }

        public ConfirmAndSubmitOrder getConfirmAndSubmitOrderSection() {
            return new ConfirmAndSubmitOrder();
        }

        public void verifyDifferentSection() {
            PauseUtil.waitForAjaxToComplete(4000);

            AssertUtils
                    .assertDisplayed(getSectionByLabel(ConstantUtils.ORDERSUMMARY_TEXT));
            AssertUtils.assertDisplayed(getSectionByLabel(ConstantUtils.PAYMENT_TEXT));
            AssertUtils.assertDisplayed(getSectionByLabel(ConstantUtils.SHIPPING_TEXT));
            AssertUtils
                    .assertDisplayed(getSectionByLabel(ConstantUtils.ORDERDETAIL_TEXT));
        }

        public void verifyOrderReceiptAfterCheckout() {
            PauseUtil.waitForAjaxToComplete(4000);
            System.out.println("Title-" + getLblPageSubTitle().getText());
            System.out.println("Receipt" + getLblReceipt().getText());
            Assert.assertTrue(getLblPageSubTitle().getText()
                    .contains(ConstantUtils.THANKYOUFORORDER_TEXT));
            Assert.assertTrue(getLblReceipt().getText()
                    .contains(ConstantUtils.ORDERRECEIPTREFERENCE_TEXT));
            AssertUtils.assertDisplayed(getConfirmationEmail());
        }



        public void verifyConfirmationPrint(){
            PauseUtil.waitForAjaxToComplete(3000);
            AssertUtils.assertDisplayed(getBtnPrintOnOrderConfirmationPage());

        }

        /**
         * This method verify shipping charge on order and submit section of
         * checkout page
         *
         * @param shippingCharge
         */
        public void verifyShippingChargeOnOrderSubmitSection(String shippingCharge) {
            AssertUtils.assertTextMatches(getPriceByLabel(ConstantUtils.SHIPPING),
                    Matchers.containsString(shippingCharge));
        }

        /**
         * this method verify Payment Section on confirm and submit section of
         * checkout For This You need to paymentmethods option
         * {PayPal,CreditCard,Checks,CheckAndCreditCard,Purchase Order}
         *
         * @param paymentMethods
         */
        public void verifyPaymentSectionForTeacherOnConfirmAndSubmitSection(
                String paymentMethods) {
            SCHUtils.waitForLoaderToDismiss();
            double SFOTotal = SCHUtils.getSFOOrderTotal();
            double YTOTotal = SCHUtils.getYTOOrderTotal();
            double shippingCharge = 0;
            System.out.println("SFO Total" + SFOTotal);
            System.out.println("Yto Total " + YTOTotal);

            if (getPriceByLabel(ConstantUtils.SHIPPING).getText() != "FREE") {
                shippingCharge = SCHUtils.getPriceWithOutCurrency(
                        getPriceByLabel(ConstantUtils.SHIPPING).getText());
            }
            System.out.println("Shipping Charge......" + shippingCharge);
            // @author: kulin
            // Total amount due will not add SOO total because it is paid by
            // parent removed SOOTotal from amount due calculation
            String totalAmountDue = SCHUtils
                    .getStandardPriceFormat((SFOTotal + YTOTotal + shippingCharge));
            System.out.println("Total amount----" + totalAmountDue);
            if (TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.topoffamount") != null) {
                System.out.println("inside condition with top-off amount");
                String topOffAmount = TestBaseProvider.getTestBase().getContext()
                        .getProperty("testexecution.topoffamount").toString();
                System.out.println("top of=" + topOffAmount);
                totalAmountDue = SCHUtils.getStandardPriceFormat((SFOTotal + YTOTotal
                        + shippingCharge + Integer.parseInt(topOffAmount)));
                System.out.println("total amount after adding topoff-" + totalAmountDue);
            }
            if (paymentMethods.equalsIgnoreCase(ConstantUtils.PAYPAL)) {
                AssertUtils.assertTextMatches(lblSavedPayaplEmailIdOnOrderAndSubmit,
                        Matchers.containsString(getTestBase().getContext().getString(
                                "testexecution.saved.paypal.account.information")));

                AssertUtils.assertTextMatches(getPriceByLabel(ConstantUtils.PAYPAL),
                        Matchers.containsString(totalAmountDue));
            } else if (paymentMethods
                    .equalsIgnoreCase(ConstantUtils.CHECKSANDCREDITCARD)) {
                AssertUtils.assertTextMatches(getPriceByLabel("Amount Paid by"),
                        Matchers.containsString(getTestBase().getContext()
                                .getString("testexecution.paymentbycard.price")));
                AssertUtils.assertTextMatches(getPriceByLabel("CHECK"),
                        Matchers.containsString(getTestBase().getContext()
                                .getString("testexecution.paymentbycheck.price")));
            } else if (paymentMethods
                    .equalsIgnoreCase(ConstantUtils.PURCHASEORDERPAYMENTMETHOD)) {
                AssertUtils.assertTextMatches(getPriceByLabel("Amount Paid by"),
                        Matchers.containsString(totalAmountDue));
            } else {
                System.out.println("No Payment Type Defined...........");
            }
        }

        public void waitForpageToLoad() {
            WaitUtils.waitForDisplayed(btnSubmitOrder);
        }

        public void verifyCouponOrderDetail() {

            PauseUtil.waitForAjaxToComplete(5000);
            Map<String, ProductInfoBean> couponProducts = SCHUtils.getCouponItems();
            for (String key : couponProducts.keySet()) {
                ProductInfoBean details = couponProducts.get(key);
                AssertUtils.assertDisplayed(getLblCouponNumber(details.getCoupon()));
                Assert.assertTrue(details.getCouponDescription().contains(
                        getLblCouponDescription(details.getCoupon()).getText()));

                try {

                    if (SCHUtils.isPresent(
                            getCmpParentCouponItemDetail(details.getCoupon()))) {
                        AssertUtils.assertTextMatches(
                                getLblCouponItemNumber(details.getCoupon(),
                                        details.getItemNumber()),
                                Matchers.containsString(details.getItemNumber()));
                        AssertUtils.assertTextMatches(
                                getLblCouponItemTitle(details.getCoupon(),
                                        details.getItemNumber()),
                                Matchers.containsString(details.getItemTitle()));
                        AssertUtils.assertTextMatches(
                                getLblCouponItemFlyer(details.getCoupon(),
                                        details.getItemNumber()),
                                Matchers.containsString(details.getFlyer()));
                        AssertUtils.assertTextMatches(
                                getLblCouponItemQuantity(details.getCoupon(),
                                        details.getItemNumber()),
                                Matchers.containsString(details.getQuantity()));
                        if (getLblCouponDescription(details.getCoupon()).getText()
                                .contains("free")) {
                            AssertUtils.assertTextMatches(
                                    getLblCouponItemPrice(details.getCoupon(),
                                            details.getItemNumber()),
                                    Matchers.containsString(details.getPrice()));
                        } else {
                            AssertUtils.assertTextMatches(
                                    getLblCouponItemPrice(details.getCoupon(),
                                            details.getItemNumber()),
                                    Matchers.containsString(
                                            details.getCouponItemPrice()));
                            Assert.assertTrue(getLblStrikedPrice().getAttribute("class")
                                    .contains("strike-data"));
                            System.out.println("striked and newprice----text"
                                    + getLblStrikedAndNewPrice().getText());
                            AssertUtils.assertDisplayed(getLblStrikedAndNewPrice());
                        }

                    }

                } catch (Exception e) {
                    // TODO: handle exception
                }

            }

        }

        public void verifyDollarsToSpendRecentSelectionSaved_SubmitOrderPage()
        {
            AssertUtils.assertTextMatches(getRewardsAndCouponsSection().getlblRewardDetailOnDollarToSpendQuantitySubmitOrderPage(),
                    Matchers.containsString("2"));

        }


        public void verifyDollarsToSpendPreviousSelections_SubmitOrderPage()
        {
            AssertUtils.assertTextMatches(getRewardsAndCouponsSection().getlblRewardDetailOnDollarToSpendQuantitySubmitOrderPage(),
                    Matchers.containsString("1"));

        }

        public void verifyRewardsAndPromotionDetail() {

            PauseUtil.waitForAjaxToComplete(5000);
            Map<String, ProductInfoBean> couponProducts = SCHUtils.getCouponItems();
            for (String key : couponProducts.keySet()) {
                if (key.contains("fpfpromotion")) {
                    ProductInfoBean details = couponProducts.get(key);
                    System.out.println("Getting fpf item -" + details.getItemNumber());
                    AssertUtils.assertTextMatches(
                            getRewardsAndCouponsSection().getLblRewardsInfo(),
                            Matchers.containsString(ConstantUtils.REWARDS_EARN_TODAY));
                    Assert.assertTrue(
                            details.getCouponDescription()
                                    .contains(getLblCouponDescription(
                                            ConstantUtils.REWARDS_HEADER_LABEL)
                                            .getText()));
                    if (SCHUtils.isPresent(getCmpParentCouponItemDetail(
                            ConstantUtils.REWARDS_HEADER_LABEL))) {
                        AssertUtils.assertTextMatches(
                                getLblCouponItemNumber(ConstantUtils.REWARDS_HEADER_LABEL,
                                        details.getItemNumber()),
                                Matchers.containsString(details.getItemNumber()));
                        AssertUtils.assertTextMatches(
                                getLblCouponItemTitle(ConstantUtils.REWARDS_HEADER_LABEL,
                                        details.getItemNumber()),
                                Matchers.containsString(details.getItemTitle()));
                        AssertUtils.assertTextMatches(
                                getLblCouponItemFlyer(ConstantUtils.REWARDS_HEADER_LABEL,
                                        details.getItemNumber()),
                                Matchers.containsString(details.getFlyer()));
                        AssertUtils.assertTextMatches(
                                getLblCouponItemQuantity(
                                        ConstantUtils.REWARDS_HEADER_LABEL,
                                        details.getItemNumber()),
                                Matchers.containsString(details.getQuantity()));
                        Assert.assertTrue(getLblStrikedPrice().getAttribute("class")
                                .contains("strike-data"));
                        System.out.println("striked and newprice----text"
                                + getLblStrikedAndNewPrice().getText());
                        AssertUtils.assertDisplayed(getLblStrikedAndNewPrice());

                    }
                }

            }

        }

		/*public void verifyTossInQA(String numberofstudents, String description) {

				AssertUtils.assertDisplayed(getLblTossInQty());
				AssertUtils.assertTextMatches(getLblTossInQty(),
						Matchers.containsString(numberofstudents));
				AssertUtils.assertTextMatches(getLblTossInQty(),
						Matchers.containsString(description));

		}*/


        public void verifyTossInQA(Configuration testData) {

            SCHUtils.scrollToView(getLblTossInQA());
            if (testData.getString("numberofstudents").equals("0")) {
                if (SCHUtils.isPresent(getLblTossInQty())) {
                    Assert.assertTrue(false);
                }
            } else {
                AssertUtils.assertDisplayed(getLblTossInQA());
                AssertUtils.assertTextMatches(getLblTossInQA(),
                        Matchers.containsString(testData.getString("numberofstudents")));
            }
        }


        public void verifyUpdatedTossInQA(Configuration testData) {
            if (testData.getString("updatenumberofstudents").equals("0")) {
                if (SCHUtils.isPresent(getLblTossInQty())) {
                    Assert.assertTrue(false);
                }
            } else {
                AssertUtils.assertDisplayed(getLblTossInQA());
                AssertUtils.assertTextMatches(getLblTossInQA(),
                        Matchers.containsString(testData.getString("updatenumberofstudents")));
            }
        }



        public void verifyTossInQA_ConfirmationPage(Configuration testData) {

            if (testData.getString("numberofstudents").equals("0")) {
                if (SCHUtils.isPresent(getLblTossInQty_ConfirmationPage())) {
                    Assert.assertTrue(false);
                }
            } else {
                AssertUtils.assertPresent((ExtendedElement) getLblTossInQty_ConfirmationPage());
                AssertUtils.assertDisplayed(getLblTossInQty_ConfirmationPage());
                AssertUtils.assertTextMatches(getLblTossInQty_ConfirmationPage(),
                        Matchers.containsString(testData.getString("numberofstudents")));
            }
        }


        public void verifyUpdatedTossInQA_ConfirmationPage(Configuration testData) {

            if (testData.getString("updatenumberofstudents").contains("33")) {
                if (SCHUtils.isPresent(getLblTossInQty_ConfirmationPage())) {
                    Assert.assertTrue(false);
                }
            } else {
                AssertUtils.assertPresent((ExtendedElement) getLblTossInQty_ConfirmationPage());
                AssertUtils.assertDisplayed(getLblTossInQty_ConfirmationPage());
                AssertUtils.assertTextMatches(getLblTossInQty_ConfirmationPage(),
                        Matchers.containsString(testData.getString("updatenumberofstudents")));
            }
        }



        public void verifyEmailAddressFromProfileBean() {
            PauseUtil.pause(5000);
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(5000);
            new CheckoutPage();
            HashMap<String, UserProfileBean> userProfileMap =
                    SCHUtils.getChildTeacherDetails();
            if (userProfileMap != null) {
                List<UserProfileBean> profileBeans =
                        new ArrayList<UserProfileBean>(userProfileMap.values());
                for (int i = 0; i < profileBeans.size(); i++) {
                    if (profileBeans.get(i).getEmail() != null) {
                        SCHUtils.waitForLoaderToDismiss();
                        PauseUtil.waitForAjaxToComplete();
                        AssertUtils.assertTextMatches(getConfirmationEmailText(),
                                Matchers.containsString(profileBeans.get(i).getEmail()));
                    }
                }

            }
        }

        public void clickOnDownloadDonationCertificate() {
            WaitUtils.waitForEnabled(getLnkDownloadDonationCertificate());
            getLnkDownloadDonationCertificate().click();
        }

        public void verifyErrorMessage(Configuration testData) {
            AssertUtils.assertDisplayed(getLblErrorMesage());
            AssertUtils.assertTextMatches(getLblErrorMesage(),
                    Matchers.containsString(testData.getString("errormessage")));
        }

        public void verifyCertificateOnAnotherTab() {

            String parentHandle = getDriver().getWindowHandle();

            PauseUtil.pause(8000);

            for (String winHandle : getDriver().getWindowHandles()) {
                System.out.println(winHandle);
                getDriver().switchTo().window(winHandle);
            }

            Assert.assertTrue(getDriver().getCurrentUrl().contains(".pdf"));

            getDriver().switchTo().window(parentHandle);
        }

        public void verifyClassWishListSection() {
            // If class wishlist section is present then verify class wishlist
            // table
            try {
                if (getClasswishListOrDonationSection(
                        ConstantUtils.CLASS_WISHLIST_SECTION_HEADER).isDisplayed()) {
                    System.out.println(
                            "Class wish list section is present in order history");
                    AssertUtils.assertDisplayed(getItemImageForSection(
                            ConstantUtils.CLASS_WISHLIST_SECTION_HEADER));
                    AssertUtils.assertDisplayed(getItemDetailsForSection(
                            ConstantUtils.CLASS_WISHLIST_SECTION_HEADER));
                    AssertUtils.assertDisplayed(getItemQuantityForSection(
                            ConstantUtils.CLASS_WISHLIST_SECTION_HEADER));
                    AssertUtils.assertDisplayed(getItemTotalForSection(
                            ConstantUtils.CLASS_WISHLIST_SECTION_HEADER));
                }
            } catch (Exception e) {
            }
        }

        public void verifyDonationSection() {
            // If Donation section is present then verify class wishlist
            // table
            if (getClasswishListOrDonationSection(ConstantUtils.DONATION_SECTION_HEADER)
                    .isDisplayed()) {
                System.out.println("Donation section is present in order history");

                AssertUtils.assertDisplayed(
                        getItemImageForSection(ConstantUtils.DONATION_SECTION_HEADER));
                AssertUtils.assertDisplayed(
                        getItemDetailsForSection(ConstantUtils.DONATION_SECTION_HEADER));
                AssertUtils.assertDisplayed(
                        getItemTotalForSection(ConstantUtils.DONATION_SECTION_HEADER));
            }

        }

        public void verifyTeacherWishListSection() {
            AssertUtils.assertDisplayed(
                    getTeacherwishListItemSection(ConstantUtils.TEACHER_WISHLIST_HEADER));
            // Verify Wishlist Item Header
            if (getTestBase().getContext().getString("platform", "")
                    .equalsIgnoreCase("desktop")) {
                AssertUtils.assertDisplayed(getLblWishListItemIdHeader());
                AssertUtils.assertDisplayed(getLblWishListFlyerHeader());
            }

            AssertUtils.assertDisplayed(getLblWishListItemTitleHeader());
            AssertUtils.assertDisplayed(getLblWishListItemQuantityHeader());
            AssertUtils.assertDisplayed(getLblWishListItemPriceHeader());
            AssertUtils.assertDisplayed(getLblWishListGivenByHeader());

            // If needed you can verify wishlist item text
            for (int i = 0; i < getLstWishListItemId().size(); i++) {
                if (getTestBase().getContext().getString("platform", "")
                        .equalsIgnoreCase("desktop")) {
                    AssertUtils.assertDisplayed(getLstWishListItemId().get(i));
                    AssertUtils.assertDisplayed(getLstWishListItemFlyer().get(i));
                }
                AssertUtils.assertDisplayed(getLstWishListItemTitle().get(i));
                AssertUtils.assertDisplayed(getLstWishListItemQuantity().get(i));
                AssertUtils.assertDisplayed(getLstWishListItemPrice().get(i));
                AssertUtils.assertDisplayed(getLstWishListItemGivenBy().get(i));
            }

        }

    }

    @Override
    public void addNewCreditCard(Configuration data) throws AWTException {

        ICreditCardAndBillingInfoSection fillfornewcreditcard =
                SectionFactory.getFactory().getICreditCardAndBillingInfoSection(
                        "dw.checkout.shippingandpayment.payment.creditcard.addnewcard.form");

        ICreditCardAndBillingInfoSection fillfornewcreditcardaddr =
                SectionFactory.getFactory().getICreditCardAndBillingInfoSection(
                        "dw.checkout.shippingandpayment.payment.creditcard.addnewcard.address");


        fillfornewcreditcard.fillCreditCardAndBillingInfoSection(data);
        fillfornewcreditcardaddr.fillCreditCardAddressInfoSection(data);
        getChkSaveCard().click();
        PauseUtil.waitForAjaxToComplete(2000);

    }


    @Override
    public void selectCreditOption_newCard()
    {
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



    @Override
    public void addNewCreditCard_SaveCart(Configuration data) {

        ICreditCardAndBillingInfoSection fillfornewcreditcard =
                SectionFactory.getFactory().getICreditCardAndBillingInfoSection(
                        "dw.checkout.shippingandpayment.payment.creditcard.addnewcard.form");

        ICreditCardAndBillingInfoSection fillfornewcreditcardaddr =
                SectionFactory.getFactory().getICreditCardAndBillingInfoSection(
                        "dw.checkout.shippingandpayment.payment.creditcard.addnewcard.address");


        fillfornewcreditcard.fillCreditCardAndBillingInfoSection(data);
        fillfornewcreditcardaddr.fillCreditCardAddressInfoSection(data);
        PauseUtil.waitForAjaxToComplete(2000);

    }


    @Override
    public void fillCCAndCheckAmount_PaymentPage(){

        String TotalAmtOwing1=Total_Amount_Owing_Payment().getText();
        TotalAmtOwing1 = TotalAmtOwing1.substring(1);
        double TotalAmtOwing=Double.parseDouble(TotalAmtOwing1);


        double payby_CC1 = TotalAmtOwing/2;
        double r = (double) Math.round(payby_CC1*100);
        double payby_CC = r / 100.0;

        double payby_Check1 = TotalAmtOwing - payby_CC;
        double r1 = (double) Math.round(payby_Check1*100);
        double payby_Check = r1 / 100.0;

        String creditPay = Double.toString(payby_CC);
        String CheckPay = Double.toString(payby_Check);


        Total_Amount_Payment_Creditcard_Input().clear();
        Total_Amount_Payment_Creditcard_Input().sendKeys(creditPay);
        Total_Amount_Payment_Cheque_Input().clear();
        Total_Amount_Payment_Cheque_Input().sendKeys(CheckPay);
        PauseUtil.pause(3000);

        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.payment.Creditcard", creditPay);
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.payment.Cheque", CheckPay);




    }



    @Override
    public void fillTxtCardNumber(String cardNumber, String securityCode) {
        PauseUtil.pause(3000);
        getTxtCardNumber().clear();
        getTxtCardNumber().sendKeys(cardNumber);
        getTxtCardSecurityCode().clear();
        getTxtCardSecurityCode().sendKeys(securityCode);
        getTxtCardSecurityCode().sendKeys(Keys.TAB);
    }

    @Override
    public void validateCardErrorMessage() {
        AssertUtils.assertTextMatches(getLblErrorMessageOnConfirmOrderSubmit(),
                Matchers.containsString("Invalid Credit Card Number"));
    }

    @Override
    public void verifyBlueChevron(String args) {
        if (args.equalsIgnoreCase("Rewards And Coupons Section")) {
            AssertUtils.assertDisplayed(getActiveRewardsTabBlue());
            AssertUtils.assertEnabled(getActiveRewardsTabBlue());
            String color = getActiveRewardsTabBlue().getCssValue("background-color");

            // JOptionPane.showInputDialog(color);
            String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");

        }

        if (args.equalsIgnoreCase("shipping and payment section")) {

            AssertUtils.assertDisplayed(getActiveShippingTabBlue());
            AssertUtils.assertEnabled(getActiveShippingTabBlue());

        }
        if (args.equalsIgnoreCase("order and submit section")) {
            AssertUtils.assertDisplayed(getActiveSubmitTabBlue());
            AssertUtils.assertEnabled(getActiveSubmitTabBlue());

        }

    }

    @Override
    public void selectInActiveTab(String args) {
        if (args.equalsIgnoreCase("shipping and payment section")) {

            getInActiveShippingTab().click();

        }
        if (args.equalsIgnoreCase("order and submit section")) {

            getInActiveSubmitTab().click();

        }
        if (args.equalsIgnoreCase("Rewards And Coupons Section")) {
            getInActiveRewardsTab().click();
        }

    }

    @Override
    public void verifyRewardsAndCouponsPage() {
        AssertUtils.assertDisplayed(getLblPageSubTitle());
        Assert.assertTrue(
                getLblPageSubTitle().getText().contains(ConstantUtils.REWARDSANDCOUPONS));

    }

    @Override
    public void verifyAppleIcon(Configuration data) {
        if (data.getString("applestatus").equalsIgnoreCase("gold")) {
            AssertUtils.assertDisplayed(getImgGoldAppleIcon());
        } else if (data.getString("applestatus").equalsIgnoreCase("green")) {
            AssertUtils.assertDisplayed(getImgGreenAppleIcon());
        } else if (data.getString("applestatus").equalsIgnoreCase("red")) {
            AssertUtils.assertDisplayed(getImgRedAppleIcon());
        } else {
            AssertUtils.assertNotDisplayed(getImgGoldAppleIcon());
            AssertUtils.assertNotDisplayed(getImgGreenAppleIcon());
            AssertUtils.assertNotDisplayed(getImgRedAppleIcon());
        }

    }

    @Override
    public void clickOnEditLink() {

        shippingAndPayment.getBtnEditCrediCard().click();

    }

    @Override
    public void clickOnCancelButton() {

        WaitUtils.waitForDisplayed(shippingAndPayment.getButtonCancel());
        shippingAndPayment.getButtonCancel().click();

    }

    @Override
    public void clickOnSaveButton() {
        shippingAndPayment.getButtonSave().click();
    }

    @Override
    public void verifyCardInformationUnchangedAndClickOnCancelButton() {

        clickOnCancelButton();

        Assert.assertEquals(shippingAndPayment.getNameOnCardText().getText(),
                TestBaseProvider.getTestBase().getContext()
                        .getProperty("testexecution.nameoncard"));

        Assert.assertEquals(shippingAndPayment.getExpiryDateText().getText(),
                TestBaseProvider.getTestBase().getContext()
                        .getProperty("testexecution.expirydate"));

        Assert.assertEquals(shippingAndPayment.getBillingAddressText().getText(),
                TestBaseProvider.getTestBase().getContext()
                        .getProperty("testexecution.billingaddress"));
    }

    @Override
    public void verifyCardInformationChangedAndClickOnSaveButton() {

        WaitUtils.waitForDisplayed(shippingAndPayment.getButtonSave());

        shippingAndPayment.getSecurityCode().sendKeys("111");
        shippingAndPayment.getFirstName().clear();
        shippingAndPayment.getFirstName().sendKeys("scholastic1");
        shippingAndPayment.getLastName().clear();
        shippingAndPayment.getLastName().sendKeys("scholastic2");

        clickOnSaveButton();

        WaitUtils.waitForNotDisplayed(shippingAndPayment.getButtonSave());
        WaitUtils.waitForDisplayed(shippingAndPayment.getNameOnCardText());

        String nameoncard = shippingAndPayment.getNameOnCardText().getText();
        String expirydate = shippingAndPayment.getExpiryDateText().getText();
        String billingaddress = shippingAndPayment.getBillingAddressText().getText();
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.nameoncard", nameoncard);
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.expirydate", expirydate);
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.billingaddress", billingaddress);

        Assert.assertEquals(shippingAndPayment.getNameOnCardText().getText(),
                TestBaseProvider.getTestBase().getContext()
                        .getProperty("testexecution.nameoncard"));
        Assert.assertEquals(shippingAndPayment.getExpiryDateText().getText(),
                TestBaseProvider.getTestBase().getContext()
                        .getProperty("testexecution.expirydate"));
        Assert.assertEquals(shippingAndPayment.getBillingAddressText().getText(),
                TestBaseProvider.getTestBase().getContext()
                        .getProperty("testexecution.billingaddress"));

    }

    @Override
    public void verifyAppleIconNotClickable(Configuration data) {
        if (data.getString("applestatus").equalsIgnoreCase("gold")) {
            Assert.assertTrue(!SCHUtils.isPresent(getLnkGoldAppleNotClickable()));
        } else if (data.getString("applestatus").equalsIgnoreCase("green")) {
            Assert.assertTrue(!SCHUtils.isPresent(getLnkGreenAppleNotClickable()));
        } else if (data.getString("applestatus").equalsIgnoreCase("red")) {
            Assert.assertTrue(!SCHUtils.isPresent(getLnkRedAppleNotClickable()));
        } else {
            Assert.assertTrue(!SCHUtils.isPresent(getLnkGoldAppleNotClickable()));
            Assert.assertTrue(!SCHUtils.isPresent(getLnkGreenAppleNotClickable()));
            Assert.assertTrue(!SCHUtils.isPresent(getLnkRedAppleNotClickable()));
        }
    }

    @Override
    public void clickChangeLinkOfPaypalSection() {
        PauseUtil.waitForAjaxToComplete(4000);
        WaitUtils.waitForDisplayed(getLnkChangePaypalSection());
        getLnkChangePaypalSection().click();
    }

    @Override
    public void clickCancelLinkOfPaypalSection() {
        PauseUtil.waitForAjaxToComplete(4000);
        WaitUtils.waitForDisplayed(getLnkCancelPaypalSection());
        getLnkCancelPaypalSection().click();
    }

    @Override
    public void verifyWalletSectionOfPaypal() {
        AssertUtils.assertDisplayed(getLblWalletHeadingPaypalSection());
        Assert.assertTrue(getLstPaymentOptionsPaypalSection().size() > 0);

    }

    @Override
    public void selectWalletOption(Configuration data) {
        SCHUtils.waitForLoaderToDismiss();
        if (getLblWalletList().size() > 1) {
            SCHUtils.clickUsingJavaScript(getLblWalletList().get(1));
        } else {
            getLblPaymentOption(data.getString("walletoption")).click();
        }
    }

    @Override
    public void verifyPaymetMethodUpdatedMsg() {
        SCHUtils.waitForLoaderToDismiss();
        Assert.assertTrue(getLblPaymentMethodUpdatedMsgPaypalSection().getText()
                .equalsIgnoreCase(ConstantUtils.PAYMENT_METHOD_UPDATED));
    }

    @Override
    public void clickOnAgreeAndContinuePaypal() {
        AssertUtils.assertDisplayed(getPaypalAgreeAndContinuebtn());
        getPaypalAgreeAndContinuebtn().click();
    }

    @Override
    public void verifyConfirmAndSubmitHeader() {
        AssertUtils.assertDisplayed(getLblCheckout());
        AssertUtils.assertDisplayed(getActiveSubmitTabBlue());
        AssertUtils.assertDisplayed(getInActiveRewardsTab());
        AssertUtils.assertDisplayed(getInActiveShippingTab());
        AssertUtils.assertTextMatches(getLblPageSubTitle(),
                Matchers.containsString("Confirm & Submit Order"));

        AssertUtils.assertDisplayed(getConfirmAndSubmitOrder().getLblcustomerNumber());
        AssertUtils.assertDisplayed(
                getConfirmAndSubmitOrder().getLblConfirmationEmailAddress());
        AssertUtils.assertDisplayed(
                getConfirmAndSubmitOrder().getLnkEditConfirmationEmail());
    }

    @Override
    public ICouponSection getICouponSection() {
        return SectionFactory.getFactory().getCouponSection(LocatorUtils.getBy(
                "dw.checkout.teacher.rewardsandcoupons.coupon.popup.parent.couponmodal"));

    }

    @Override
    public void verify_Dollars_To_Spend_Section_displayed() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);
        Assert.assertTrue(fld_Dollars_To_Spend_Coupons_Rewards().isDisplayed(), "Dollars To Spend section is not displayed");
    }


	/*@Override
	public void verify_Dollars_To_Spend_Section_is_not_displayed() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2000);
		AssertUtils.assertNotDisplayed(fld_Dollars_To_Spend_Coupons_Rewards());

	}*/


    @Override
    public boolean verify_Dollars_To_Spend_Section_is_not_displayed() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);
        boolean flag=false;
        try{
            fld_Dollars_To_Spend_Coupons_Rewards().isDisplayed();
            Assert.fail("#########App issue:::Dollars to spend promotion is displayed");
        }
        catch(Exception e)
        {
            flag = true;
        }
        return flag;

    }



    @Override
    public boolean verify_Bonus_percentage_description_is_not_displayed_in_rewardsPage() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);
        boolean flag=false;
        try{
            fld_earned_BonusBank_amt_section_RewardsPage().isDisplayed();
        }
        catch(Exception e)
        {
            flag = true;
        }
        return flag;


    }

    @Override
    public boolean verify_earned_BonusBank_amt_is_not_displayed_in_rewardsPage() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);
        boolean flag=false;
        try{
            earned_BonusBank_amt_for_coupon_RewardsPage().isDisplayed();
        }
        catch(Exception e)
        {
            flag = true;
        }
        return flag;

    }

    @Override
    public void verify_Bonus_percentage_description_is_displayed_in_rewardsPage() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);

        AssertUtils.assertDisplayed(fld_earned_BonusBank_amt_section_RewardsPage());
        AssertUtils.assertDisplayed(earned_BonusBank_amt_for_coupon_RewardsPage());

    }


    @Override
    public double verify_Dollars_To_Spend_Section_displayed_and_get_Tot_amt() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(3000);
        Assert.assertTrue(fld_Dollars_To_Spend_Coupons_Rewards().isDisplayed(), "Dollars To Spend section is not displayed");

        String StudentClubPostValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubPostValue = StudentClubPostValue.substring(1);
        double StudentClubPostValue_exp=Double.parseDouble(StudentClubPostValue);
        System.out.println("############StudentClubPostValue is "+StudentClubPostValue_exp);

        return StudentClubPostValue_exp;

    }

    @Override
    public void User_selects_Select_By_Grade() {
        PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(3000);
        Selection_Grade_level_inPopUp_Coupons_Rewards().click();
        PauseUtil.pause(4000);

    }

    @Override
    public void Selects_an_item_from_Make_Selection_window() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(5000);
        List<WebElement> price = items_price_Make_Selection_Window();
        int value=price.size();

        double value2=TestBaseProvider.getTestBase().getTestData().getDouble("itemValue");

        for (int i=0; i<=value; i++) {
            String text=price.get(i).getText();
            text=text.trim();

            String path="//tr[td[text()='"+text+"']]/td[5]/i";

            text = text.substring(1);
            double text2=Double.parseDouble(text);

            if (text2 > value2) {
                WebDriver driver=TestBaseProvider.getTestBase().getDriver();
                driver.findElement(By.xpath(path)).click();
                PauseUtil.pause(5000);
                break;
            } else {
                System.out.println("value is lesser than expected");
            }
        }
    }

    @Override
    public double Selects_an_item_from_Make_Selection_window_And_get_Exceeded_amt() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(5000);
        List<WebElement> price = items_price_Make_Selection_Window();
        int value=price.size();

        double value2=TestBaseProvider.getTestBase().getTestData().getDouble("itemValue");

        for (int i=0; i<=value; i++) {
            String text=price.get(i).getText();
            text=text.trim();

            String path="//tr[td[text()='"+text+"']]/td[5]/i";

            text = text.substring(1);
            double text2=Double.parseDouble(text);

            if (text2 > value2) {
                WebDriver driver=TestBaseProvider.getTestBase().getDriver();
                driver.findElement(By.xpath(path)).click();
                PauseUtil.pause(5000);
                break;
            } else {
                System.out.println("value is lesser than expected");
            }
        }

        String Exeecded_Val=Exeeded_Amt_MakeYourSelection_Window().getText();
        double Exeecded_Val_is=Double.parseDouble(Exeecded_Val);
        return Exeecded_Val_is;


    }

    @Override
    public void Selects_an_item_from_Free_Item_Modal_window() {
        //SCHUtils.waitForLoaderToDismiss();
        /*PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(5000);
        List<WebElement> price = items_price_FreeItem_Modal_Window();
        int value=price.size();

        double value2=TestBaseProvider.getTestBase().getTestData().getDouble("itemValue");

        for (int i=1; i<=value-1; i++) {
            String text=price.get(i).getText();
            text=text.trim();

            //String path="(//tr[td[text()='"+text+"']]/td[6]/i)[1]";
            String path= "(//tr[td[text()='"+text+"']])["+i+"]//td[6]";

            text = text.substring(1);
            double text2=Double.parseDouble(text);
            System.out.println("text2 before select"+text2);

            if (text2 >= value2) {
                WebDriver driver=TestBaseProvider.getTestBase().getDriver();
                driver.findElement(By.xpath(path)).click();
                PauseUtil.pause(5000);
                break;
            } else {
                System.out.println("value is lesser than expected");
            }
        }*/
    	
    	StudentFlyerOrdersPage SFOpage=new StudentFlyerOrdersPage();
    	SFOpage.teacher_select_first_FreePick_item_from_the_list_SFO_section();
    }

    @Override
    public double Selects_multiple_items_from_Make_Selection_window_And_get_Exceeded_amt() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(5000);
        List<WebElement> price = items_price_Make_Selection_Window();
        int value=price.size();

        double value2=TestBaseProvider.getTestBase().getTestData().getDouble("itemValue");
        WebDriver driver=TestBaseProvider.getTestBase().getDriver();

        for (int i=1; i<=value; i++) {
            String text=price.get(i).getText();
            text=text.trim();

            String path="//tr[td[text()='"+text+"']]/td[5]/i";

            text = text.substring(1);
            double text2=Double.parseDouble(text);

            if (text2 > value2) {
                driver.findElement(By.xpath(path)).click();
                PauseUtil.pause(5000);
                break;
            } else {
                System.out.println("value is lesser than expected");
            }

        }

        for (int i=1; i<value; i++) {
            String text=price.get(i).getText();
            text=text.trim();

            String path="//tr[td[text()='"+text+"']]/td[5]/i";

            String path2=driver.findElement(By.xpath(path)).getAttribute("class");
            System.out.println("#################:"+path2);
            String classVal="fa fa-circle-o remove";

            text = text.substring(1);
            double text2=Double.parseDouble(text);

            if (text2 > value2 && path2.equals(classVal)) {
                driver.findElement(By.xpath(path)).click();
                PauseUtil.pause(5000);
                break;
            } else {
                System.out.println("value is lesser than expected");
            }
        }

        String Exeecded_Val=Exeeded_Amt_MakeYourSelection_Window().getText();
        double Exeecded_Val_is=Double.parseDouble(Exeecded_Val);

        return Exeecded_Val_is;
    }

    @Override
    public void Selects_multiple_items_from_Make_Selection_window() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(5000);
        List<WebElement> price = items_price_Make_Selection_Window();
        int value=price.size();

        double value2=TestBaseProvider.getTestBase().getTestData().getDouble("itemValue");
        WebDriver driver=TestBaseProvider.getTestBase().getDriver();

        for (int i=0; i<value; i++) {
            String text=price.get(i).getText();
            text=text.trim();

            String path="//tr[td[text()='"+text+"']]/td[5]/i";

            text = text.substring(1);
            double text2=Double.parseDouble(text);

            if (text2 > value2) {
                driver.findElement(By.xpath(path)).click();
                PauseUtil.pause(5000);
                break;
            } else {
                System.out.println("value is lesser than expected");
            }

        }

        for (int i=0; i<value; i++) {
            String text=price.get(i).getText();
            text=text.trim();

            String path="//tr[td[text()='"+text+"']]/td[5]/i";

            String path2=driver.findElement(By.xpath(path)).getAttribute("class");
            System.out.println("#################:"+path2);
            String classVal="fa fa-circle-o remove";

            text = text.substring(1);
            double text2=Double.parseDouble(text);

            if (text2 > value2 && path2.equals(classVal)) {
                driver.findElement(By.xpath(path)).click();
                PauseUtil.pause(5000);
                break;
            } else {
                System.out.println("value is lesser than expected");
            }
        }
    }

    @Override
    public void verify_Teacher_catalogue_is_not_displayed_in_Modal_window_dropDown() {
        PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(5000);
        List<WebElement> names = grade_names_Modal_Window_dropDown();

        int value=names.size();

        String TeacherCat="teachercatalogues";
        WebDriver driver=TestBaseProvider.getTestBase().getDriver();
        for (int i=1; i<=value; i++) {

            String path="//ul[@class='content-scrollbar']/li["+i+"]";

            String GradeName=driver.findElement(By.xpath(path)).getAttribute("data-label");
            System.out.println("*******************:"+GradeName);
            if (GradeName.equals(TeacherCat)) {
                Assert.fail("Teacher catalogue grade is displayed in the Modal window dropDown");
            } else {
                System.out.println("Teacher catalogue grade is not displayed in the Modal window dropDown");
            }

        }
    }



    @Override
    public void validation_of_GST_PST_are_charged_on_topOff_and_post_tax_topOff_amount(double TotAmt, double ExceededAmt) {
        double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");
        double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");

        System.out.println("Inside the topoff calc method total amt:"+TotAmt);
        System.out.println("Inside the topoff calc method ExceededAmt:"+ExceededAmt);

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);

        String Payable_Amt=Payable_amt_Rewards_Coupons().getText();
        String[] value = Payable_Amt.split("\\|");

        String[] value2=value[0].split(":");
        System.out.println("*******************:"+value2[1]);

        String value3=value2[1].toString().trim();
        value3=value3.substring(1);
        double payableAmt_act=Double.parseDouble(value3);
        System.out.println("@@@@@@@@@@@@@@:"+payableAmt_act);

        double Shipping_tax=stateTaxGST+stateTaxPST;

        double exceeded_tax=(double)(Shipping_tax * ExceededAmt) / 100;
        exceeded_tax = TaxRoundOff(exceeded_tax);
        //exceeded_tax =Double.parseDouble(new DecimalFormat("##.##").format(exceeded_tax));
        System.out.println(" ######### Exceeded Amt is:" +exceeded_tax);

        double payable_Amt_exp=ExceededAmt+exceeded_tax;
        payable_Amt_exp =Double.parseDouble(new DecimalFormat("##.##").format(payable_Amt_exp));
        Assert.assertEquals(payableAmt_act, payable_Amt_exp, "Payable Amount Value is incorrect");

        String StudentClubPostValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubPostValue = StudentClubPostValue.substring(1);
        double StudentClubPostValue_act=Double.parseDouble(StudentClubPostValue);
        StudentClubPostValue_act =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubPostValue_act));
        System.out.println("############StudentClubPostValue_act:"+StudentClubPostValue_act);

        double StudentClubPostValue_exp=TotAmt+payable_Amt_exp;
        StudentClubPostValue_exp =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubPostValue_exp));
        System.out.println("##########StudentClubPostValue_exp:"+StudentClubPostValue_exp);

        Assert.assertEquals(StudentClubPostValue_act, StudentClubPostValue_exp, "Student Club Post Value is incorrect");

    }

    @Override
    public void validation_of_GST_QST_are_charged_on_topOff_and_post_tax_topOff_amount(double TotAmt, double ExceededAmt) {
        double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");
        double stateTaxQST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxQST");

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);

        String Payable_Amt=Payable_amt_Rewards_Coupons().getText();
        String[] value = Payable_Amt.split("\\|");

        String[] value2=value[0].split(":");
        System.out.println("*******************:"+value2[1]);

        String value3=value2[1].toString().trim();
        value3=value3.substring(1);
        double payableAmt_act=Double.parseDouble(value3);
        System.out.println("@@@@@@@@@@@@@@:"+payableAmt_act);

        double Shipping_tax=stateTaxGST+stateTaxQST;

        double exceeded_tax=(double)(Shipping_tax * ExceededAmt) / 100;
        exceeded_tax = TaxRoundOff(exceeded_tax);
        //exceeded_tax =Double.parseDouble(new DecimalFormat("##.##").format(exceeded_tax));
        System.out.println(" ######### Exceeded Amt is:" +exceeded_tax);

        double payable_Amt_exp=ExceededAmt+exceeded_tax;
        payable_Amt_exp =Double.parseDouble(new DecimalFormat("##.##").format(payable_Amt_exp));
        Assert.assertEquals(payableAmt_act, payable_Amt_exp, "Payable Amount Value is incorrect");

        String StudentClubPostValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubPostValue = StudentClubPostValue.substring(1);
        double StudentClubPostValue_act=Double.parseDouble(StudentClubPostValue);
        StudentClubPostValue_act =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubPostValue_act));
        System.out.println("############StudentClubPostValue_act:"+StudentClubPostValue_act);

        double StudentClubPostValue_exp=TotAmt+payable_Amt_exp;
        StudentClubPostValue_exp =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubPostValue_exp));
        System.out.println("##########StudentClubPostValue_exp:"+StudentClubPostValue_exp);

        Assert.assertEquals(StudentClubPostValue_exp, StudentClubPostValue_act, "Student Club Post Value is incorrect");

    }

    @Override
    public void validation_of_HST_is_charged_on_topOff_and_post_tax_topOff_amount(double TotAmt, double ExceededAmt) {
        double stateTaxHST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxHST");

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);

        String Payable_Amt=Payable_amt_Rewards_Coupons().getText();
        String[] value = Payable_Amt.split("\\|");

        String[] value2=value[0].split(":");
        System.out.println("*******************:"+value2[1]);

        String value3=value2[1].toString().trim();
        value3=value3.substring(1);
        double payableAmt_act=Double.parseDouble(value3);
        System.out.println("@@@@@@@@@@@@@@:"+payableAmt_act);

        double Shipping_tax=stateTaxHST;

        double exceeded_tax=(double)(Shipping_tax * ExceededAmt) / 100;
        exceeded_tax = TaxRoundOff(exceeded_tax);
        //exceeded_tax =Double.parseDouble(new DecimalFormat("##.##").format(exceeded_tax));
        System.out.println(" ######### Exceeded Amt is:" +exceeded_tax);

        double payable_Amt_exp=ExceededAmt+exceeded_tax;
        payable_Amt_exp =Double.parseDouble(new DecimalFormat("##.##").format(payable_Amt_exp));
        Assert.assertEquals(payableAmt_act, payable_Amt_exp, "Payable Amount Value is incorrect");

        String StudentClubPostValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubPostValue = StudentClubPostValue.substring(1);
        double StudentClubPostValue_act=Double.parseDouble(StudentClubPostValue);
        StudentClubPostValue_act =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubPostValue_act));
        System.out.println("############StudentClubPostValue_act:"+StudentClubPostValue_act);

        double StudentClubPostValue_exp=TotAmt+payable_Amt_exp;
        StudentClubPostValue_exp =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubPostValue_exp));
        System.out.println("##########StudentClubPostValue_exp:"+StudentClubPostValue_exp);

        Assert.assertEquals(StudentClubPostValue_exp, StudentClubPostValue_act, "Student Club Post Value is incorrect");

    }

    @Override
    public void validation_of_GST_is_charged_on_topOff_and_post_tax_topOff_amount(double TotAmt, double ExceededAmt) {
        double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);

        String Payable_Amt=Payable_amt_Rewards_Coupons().getText();
        String[] value = Payable_Amt.split("\\|");

        String[] value2=value[0].split(":");
        System.out.println("*******************:"+value2[1]);

        String value3=value2[1].toString().trim();
        value3=value3.substring(1);
        double payableAmt_act=Double.parseDouble(value3);
        System.out.println("@@@@@@@@@@@@@@:"+payableAmt_act);

        double Shipping_tax=stateTaxGST;

        double exceeded_tax=(double)(Shipping_tax * ExceededAmt) / 100;
        exceeded_tax =Double.parseDouble(new DecimalFormat("##.##").format(exceeded_tax));
        System.out.println(" ######### Exceeded Amt is:" +exceeded_tax);

        double payable_Amt_exp=ExceededAmt+exceeded_tax;
        payable_Amt_exp =Double.parseDouble(new DecimalFormat("##.##").format(payable_Amt_exp));
        Assert.assertEquals(payable_Amt_exp, payableAmt_act, "Payable Amount Value is incorrect");

        String StudentClubPostValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubPostValue = StudentClubPostValue.substring(1);
        double StudentClubPostValue_act=Double.parseDouble(StudentClubPostValue);
        StudentClubPostValue_act =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubPostValue_act));
        System.out.println("############StudentClubPostValue_act:"+StudentClubPostValue_act);

        double StudentClubPostValue_exp=TotAmt+payable_Amt_exp;
        StudentClubPostValue_exp =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubPostValue_exp));
        System.out.println("##########StudentClubPostValue_exp:"+StudentClubPostValue_exp);

        Assert.assertEquals(StudentClubPostValue_exp, StudentClubPostValue_act, "Student Club Post Value is incorrect");

    }

    @Override
    public void validation_of_No_Taxes_is_charged_on_topOff_and_post_tax_topOff_amount(double TotAmt, double ExceededAmt) {

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);

        String Payable_Amt=Payable_amt_Rewards_Coupons().getText();
        String[] value = Payable_Amt.split("\\|");

        String[] value2=value[0].split(":");
        System.out.println("*******************:"+value2[1]);

        String value3=value2[1].toString().trim();
        value3=value3.substring(1);
        double payableAmt_act=Double.parseDouble(value3);
        System.out.println("@@@@@@@@@@@@@@:"+payableAmt_act);

        double Shipping_tax=0.00;

        double exceeded_tax=(double)(Shipping_tax * ExceededAmt) / 100;
        exceeded_tax = TaxRoundOff(exceeded_tax);
        //exceeded_tax =Double.parseDouble(new DecimalFormat("##.##").format(exceeded_tax));
        System.out.println(" ######### Exceeded Amt is:" +exceeded_tax);

        double payable_Amt_exp=ExceededAmt+exceeded_tax;
        payable_Amt_exp =Double.parseDouble(new DecimalFormat("##.##").format(payable_Amt_exp));
        Assert.assertEquals(payableAmt_act, payable_Amt_exp, "Payable Amount Value is incorrect");

        String StudentClubPostValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubPostValue = StudentClubPostValue.substring(1);
        double StudentClubPostValue_act=Double.parseDouble(StudentClubPostValue);
        StudentClubPostValue_act =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubPostValue_act));
        System.out.println("############StudentClubPostValue_act:"+StudentClubPostValue_act);

        double StudentClubPostValue_exp=TotAmt+payable_Amt_exp;
        StudentClubPostValue_exp =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubPostValue_exp));
        System.out.println("##########StudentClubPostValue_exp:"+StudentClubPostValue_exp);

        Assert.assertEquals(StudentClubPostValue_exp, StudentClubPostValue_act, "Student Club Post Value is incorrect");
    }

    @Override
    public void verify_display_of_all_items_from_diff_Flyers_Selected_By_Grade() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);
        AssertUtils.assertDisplayed(data_To_Check_By_Grade_Level_Coupons_Rewards());
        AssertUtils.assertDisplayed(data_To_Check_By_Results_Text_Coupons_Rewards());

        String exp_text=data_To_Check_By_Grade_Level_Coupons_Rewards().getText();
        String act_text="No data available in table";

        if (!act_text.equals(exp_text)) {
            System.out.println("Items are listed in Make Your Selection");
        } else {
            System.out.println("Items are not listed in Make Your Selection");
        }

        String exp2_text=data_To_Check_By_Results_Text_Coupons_Rewards().getText();
        String act2_text="0 - 0 of 0 Results";

        if (!act2_text.equals(exp2_text)) {
            System.out.println("Items are listed in Make Your Selection");
        } else {
            System.out.println("Items are not listed in Make Your Selection");
        }

    }

    @Override
    public void addscoupon(Configuration testData, int i) {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().addCoupon(testData);
    }





    @Override
    public void MakeSelectionWindow_SelectItem() {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().MakeSelectionWindow_SelectItem();
    }



    @Override
    public void MakeSelectionWindow_SelectItemFreePick() {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().MakeSelectionWindow_SelectItemFreePick();
    }


    @Override
    public void MakeSelectionWindow_DTSSelectItem() {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().MakeSelectionWindow_DTSSelectItem();
    }

    @Override
    public void MakeSelectionWindow_DeleteSelectedItem() {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().MakeSelectionWindow_DeleteSelectedItem();
    }



    @Override
    public void verifyApplyCouponButton_NotPresent() {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().verifyApplyCouponButton_NotPresent();
    }


    @Override
    public void verifyOrderTotalIncludesTopOff_CouponsAndRewardspage() {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().verifyOrderTotalIncludesTopOff_CouponsAndRewardspage();
    }


    @Override
    public void verifyCouponsPagination() {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().verifyCouponsPagination();
    }

    @Override
    public void verifyOrderTotalIncludesTopOff_ConfirmAndSubmitPage() {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().verifyOrderTotalIncludesTopOff_ConfirmAndSubmitPage();
    }

    @Override
    public void verifyOrderTotalIncludesTopOff_ConfirmationPage() {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().verifyOrderTotalIncludesTopOff_ConfirmationPage();
    }



    @Override
    public void verifyManualFreePickDetails_ConfirmSubmitPage(String couponnumber) {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().verifyManualFreePickDetails_ConfirmSubmitPage(couponnumber);
    }


    @Override
    public void verifyManualFreePickDetails_ConfirmationPage(String couponnumber) {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().verifyManualFreePickDetails_ConfirmSubmitPage(couponnumber);
    }







    @Override
    public void MakeSelectionWindow_SelectSpecificItem(Configuration testData, double couponprice, double couponprice_limit) {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().MakeSelectionWindow_SelectSpecificItem(testData,couponprice, couponprice_limit);
    }


    @Override
    public void MakeSelectionWindow_SelectSpecificItem_Apply(Configuration testData, double couponprice, double couponprice_limit) {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().MakeSelectionWindow_SelectSpecificItem_Apply(testData,couponprice, couponprice_limit);
    }


    @Override
    public void MakeSelectionWindow_SelectMultipleItems(Configuration testData, double couponprice, double couponprice_limit) {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().MakeSelectionWindow_SelectMultipleItems(testData,couponprice, couponprice_limit);
    }



    @Override
    public void MakeSelectionWindow_SelectMultipleItems_ToMeet_Promotions(Configuration testData, double couponprice, double couponprice_limit) {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().MakeSelectionWindow_SelectMultipleItems_ToMeet_Promotions(testData,couponprice, couponprice_limit);
    }



    @Override
    public void SelectItem_TopOff_DTS(Configuration testData, double couponprice) {
        getICouponSection().SelectItem_TopOff_DTS(testData,couponprice);
    }


    @Override
    public void MakeSelectionWindow_SelectGrade(Configuration testData) {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().MakeSelectionWindow_SelectGrade(testData);
    }

    @Override
    public void MakeSelectionWindow_dts_enterquantity(Configuration testData) {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().MakeSelectionWindow_dts_enterquantity(testData);
    }


    @Override
    public void MakeSelectionWindow_SelectDifferentGrade(Configuration testData) {

        getICouponSection().MakeSelectionWindow_SelectDifferentGrade(testData);
    }


    @Override
    public void MakeSelectionWindow_SelectDropDownGradeLevel() {

        getICouponSection().MakeSelectionWindow_SelectDropDownGradeLevel();
    }


    @Override
    public void MakeSelectionWindow_verifyTeacherCatalogueInDropDownGradeLevel() {

        getICouponSection().MakeSelectionWindow_verifyTeacherCatalogueInDropDownGradeLevel();
    }

    @Override
    public void MakeSelectionWindow_verifyStudentFlyersInDropDownGradeLevel() {

        getICouponSection().MakeSelectionWindow_verifyStudentFlyersInDropDownGradeLevel();
    }

    @Override
    public void MakeSelectionWindow_verifyListDropDownGradeLevel() {

        getICouponSection().MakeSelectionWindow_verifyListDropDownGradeLevel();
    }

    @Override
    public void MakeSelectionWindow_Search_WithSpecificTerm(Configuration testData) {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().MakeSelectionWindow_Search_WithSpecificTerm(testData);
    }


    @Override
    public void getYourCurrentSelectionSection() {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().getYourCurrentSelectionSection();
    }


    @Override
    public void verifyResultforParticularSearch(String couponsearch) {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().verifyResultforParticularSearch(couponsearch);
    }

    @Override
    public void verifyResultforParticularSearch_FreePickCoupon(String couponsearch) {
        getICouponSection().verifyResultforParticularSearch(couponsearch);
    }

    @Override
    public void verifyYourCurrentSelectionSection() {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().verifyYourCurrentSelectionSection();
    }

    @Override
    public void verifyYourCurrentSelectionSection_DTS() {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().verifyYourCurrentSelectionSection_DTS();
    }





    @Override
    public void verifyYourCurrentSelectionSection_FreePickCoupon() {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().verifyYourCurrentSelectionSection_FreePickCoupon();
    }





    @Override
    public void getYourCurrentSelectionSection_FreePick() {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().getYourCurrentSelectionSection_FreePick();
    }


    @Override
    public void verifyManualFreePickItemsPriceWithInCouponAmount(double ManualFreePickTier1CouponAmt,
                                                                 double ManualFreePickTier2CouponAmt) {
        getICouponSection().verifyManualFreePickItemsPriceWithInCouponAmount(
                ManualFreePickTier1CouponAmt, ManualFreePickTier2CouponAmt);
    }

    @Override
    public void MakeSelectionWindow_ExpiredItems_ValidationMessage() {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().MakeSelectionWindow_ExpiredItems_ValidationMessage();
    }

    @Override
    public void MakeSelectionWindow_NoResultItem_ValidationMessage() {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().MakeSelectionWindow_NoResultItem_ValidationMessage();
    }


    @Override
    public void MakeSelectionWindow_TopOffAmtPresent_Message() {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().MakeSelectionWindow_TopOffAmtPresent_Message();
    }


    @Override
    public void MakeSelectionWindow_TopOffAmtNotPresent_Message() {
        //getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
        getICouponSection().MakeSelectionWindow_TopOffAmtNotPresent_Message();
    }




    // @Override
    @Override
    public void clickOnCheckoutButton() {
        // PauseUtil.pause(ms);
        getRewardsAndCouponsSection().getBtnContinueCheckout().click();

    }

    @Override
    public ShippingAndPayment getShippingAndPaymentSection() {
        return new ShippingAndPayment();
    }

    @Override
    public ConfirmAndSubmitOrder getConfirmAndSubmitOrder() {
        return new ConfirmAndSubmitOrder();
    }

    @Override
    public ConfirmAndSubmitOrder getConfirmAndSubmitOrderSection() {
        return new ConfirmAndSubmitOrder();
    }

    @Override
    public void verifyInsufficientBPModel(Configuration testData) {
        AssertUtils.assertDisplayed(getBtnPopUpGotoyourteacherorder());
        AssertUtils.assertDisplayed(getLblPopUpGoInsufficientBPNote());
        AssertUtils.assertDisplayed(getLblPopUpGoInstructionalMessage());
    }

    @Override
    public void clickOnGotoYourTeacherOrder() {
        getBtnPopUpGotoyourteacherorder().click();
    }



    @Override
    public void verifyBillingAgreementIdareSame(Configuration testData) {
        DMClient client = new DMClient();
        String resp = client.getUser(testData.getString("userid"));
        // System.out.println(" resp ===> " + resp);
        // System.out.println("-->" + JsonUtil.getJsonArrayString(resp, 0,
        // "wallet.payPal.billingAgreementId"));
        // Code to be implemented for billingagreementId of business manager
        Assert.assertFalse(true);
    }

    @Override
    public void addDollarToSpentCouponWithTopOff(Configuration testData) {
        getICouponSection().applyDollarToSpendCouponWithTopOff(testData);
    }

    @Override
    public void selectReturnToShop() {
        SCHUtils.waitForLoaderToDismiss();
        getBtnReturnToShop().click();
    }

    /**
     * this method verify wave trust modal pop up on checkout page after click
     * on wave trust icon on checkout page
     */
    @Override
    public void verifyTrustWavePopUpModal() {
        String currentWindow =
                TestBaseProvider.getTestBase().getDriver().getWindowHandle();
        for (String window : getDriver().getWindowHandles()) {
            if (!window.equals(
                    getTestBase().getContext().getString("testexecution.cart.window"))) {
            }
            getDriver().switchTo().window(window);
        }

        SCHUtils.switchToNewWindow(currentWindow);
        System.out.println("############URL:>"
                + TestBaseProvider.getTestBase().getDriver().getCurrentUrl());

        Assert.assertTrue(
                TestBaseProvider.getTestBase().getDriver().getCurrentUrl()
                        .contains("sealserver.trustwave.com"),
                "Wave Trust pop up Modal is not open");
        AssertUtils.assertDisplayed(imgWaveTrustIconLogoonPopUp);
    }

    @Override
    public void verifyItemListIsDisplayed(Map<String, ProductInfoBean> Products) {
        for (String key : Products.keySet()) {

            ProductInfoBean details = Products.get(key);
            new CheckoutPage();
            System.out.println("Product Details On Submit Order Page" + details);
            if (key.startsWith("donation")) {
                System.out.println("Donation item is verifying");
                // verify donation header
                AssertUtils.assertDisplayed(
                        getConfirmAndSubmitOrderSection().getStudentAndTeacherinTitle(
                                ConstantUtils.DONATION_SECTION_HEADER));
                AssertUtils.assertDisplayed(getConfirmAndSubmitOrderSection()
                        .getItemTitle(details.getDonatedItemNumber()));
                AssertUtils.assertDisplayed(getConfirmAndSubmitOrderSection()
                        .getItemPrice(details.getDonatedItemNumber()));
                AssertUtils.assertDisplayed(getConfirmAndSubmitOrderSection()
                        .getItemQuantity(details.getDonatedItemNumber()));

            } else {
                System.out.println("Item Id........" + details.getItemNumber());
                AssertUtils.assertDisplayed(getConfirmAndSubmitOrderSection()
                        .getItemTitle(details.getItemNumber()));
                AssertUtils.assertDisplayed(getConfirmAndSubmitOrderSection()
                        .getItemPrice(details.getItemNumber()));
                AssertUtils.assertDisplayed(getConfirmAndSubmitOrderSection()
                        .getItemQuantity(details.getItemNumber()));
            }

        }
    }

    @Override
    public void verifyOrderConfirmationPage() {
        WaitUtils.waitForDisplayed(getLblHeaderOrderConfirmation());
        AssertUtils.assertDisplayed(getLblHeaderOrderConfirmation());
    }



    @Override
    public void verifyCheque_CreditPayement_ConfirmationPage() {

        String ConfirmSubmit_ChequePayment_Actual = Total_Amount_Payment_ConfirmSubmit_ChequePayment().getText().substring(1).trim();
        String ConfirmSubmit_CreditPayment_Actual = Total_Amount_Payment_ConfirmSubmit_CreditPayment().getText().substring(1).trim();

        String ConfirmSubmit_ChequePayment = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.payment.Cheque").toString();
        String ConfirmSubmit_CreditPayment = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.payment.Creditcard").toString();

        System.out.println("ChequefromConfirmAndSubmitpage: "+ConfirmSubmit_ChequePayment_Actual);
        System.out.println("CreditpayfromConfirmAndSubmitpage: "+ConfirmSubmit_CreditPayment_Actual);

        System.out.println("Chequefrompaymentpage: "+ConfirmSubmit_ChequePayment);
        System.out.println("CreditpayfromPaymentpage: "+ConfirmSubmit_CreditPayment);

        if(!ConfirmSubmit_ChequePayment_Actual.equals(ConfirmSubmit_ChequePayment)){
            Assert.fail("Cheque amount in Confirm & Submit page is not matching with paymentpage");
        }

        if(!ConfirmSubmit_CreditPayment_Actual.equals(ConfirmSubmit_CreditPayment)){
            Assert.fail("Credit card amount in Confirm & Submit page is not matching with paymentpage");
        }

    }


    @Override
    public void verifyCheque_CreditPayement_SubmittedPage() {

        String Submitted_ChequePayment_Actual = Total_Amount_Payment_Submitted_ChequePayment().getText().substring(1).trim();
        String Submitted_CreditPayment_Actual = Total_Amount_Payment_Submitted_CreditPayment().getText().substring(1).trim();

        String ConfirmSubmit_ChequePayment = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.payment.Cheque").toString();
        String ConfirmSubmit_CreditPayment = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.payment.Creditcard").toString();

        if(!Submitted_ChequePayment_Actual.equals(ConfirmSubmit_ChequePayment)){
            Assert.fail("Cheque amount in Confirm & Submit page is not matching with paymentpage");
        }

        if(!Submitted_CreditPayment_Actual.equals(ConfirmSubmit_CreditPayment)){
            Assert.fail("Credit card amount in Confirm & Submit page is not matching with paymentpage");
        }

    }



    @Override
    public void verifyRecommandedItemsFunctionality() {

    }

    @Override
    public void verifyPrintButtonFunctionality() {
        AssertUtils.assertNotDisplayed(
                getConfirmAndSubmitOrderSection().getBtnPrintOnOrderConfirmationPage());
    }

    @Override
    public void verifyAppleStatusInfoOnConfirmAndSubmitPage() {
        // TODO Auto-generated method stub

    }

    @Override
    public void validateCreditCardFormError() {

    }

    @Override
    public void clickOnSendMetoPaypalCheckBox() {
        SCHUtils.clickUsingJavaScript(getShippingAndPayment().getChkSendMeToPayPal());
        // getShippingAndPayment().getChkSendMeToPayPal().click();
    }

    @Override
    public void clickOnMakeSelectionButton() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        getBtnMakeYourSelection().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        // btnMakeYourSelection.click();
    }

    @Override
    public void verifyDollarToSpendSectionOnRewardsAndCoupons() {

        AssertUtils.assertTextMatches(getRewardsAndCouponsSection().getLblRewardQandA(),
                Matchers.containsString("spend right now!"));
        AssertUtils.assertDisplayed(getLnkEditOnDollarToSpendSection());
        AssertUtils.assertTextMatches(lblRewardDetailOnDollarToSpendSection,
                Matchers.containsString("$"));
    }

    @Override
    public void selectPlusMinusIconOnBonusPointSection(String iconName) {
        if (iconName.equals("minus")) {
            btnCollapseOnBonusPointSection.click();

        } else {
            btnExpandOnBonusPointSection.click();
        }
        PauseUtil.waitForAjaxToComplete(30);
    }

    @Override
    public void verifyBonusPointSectionCollapseOnScreen() {
        PauseUtil.waitForAjaxToComplete(30);
        AssertUtils.assertAttributeMatches(bonusPointSection, "style",
                Matchers.containsString("none"));
    }
    @Override
    public void finalizeErrorCouponMessage() {
        AssertUtils.assertTextMatches(getRewardsAndCouponsSection().getLblErrorMessage(),
                Matchers.containsString(ConstantUtils.Coupon_Finalize_Error_Message));

    }
    @Override
    public void clickOnCloseIcon() {
        SCHUtils.scrollToView(getLnkclose());
        getLnkclose().click();
    }

    @Override
    public void clickOnCancel_CouponPopup() {
        SCHUtils.scrollToView(getLnkcouponpopupCancel());
        getLnkcouponpopupCancel().click();
    }



    @Override
    public void verifyIncompleteSfoCouponModel() {
        PauseUtil.pause(8000);
        AssertUtils.assertDisplayed(getBtnPopUpGotoSFO());
        AssertUtils.assertTextMatches(getBtnPopUpGotoSFO(),
                Matchers.containsString("REVIEW COUPONS"));
        SCHUtils.clickUsingJavaScript(getBtnPopUpGotoSFO());

    }



    @Override
    public void verify_bonusperc_manualCoupon_presence() {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);

        String bonuspercname = rewardsAndCoupons.getlblrewardscouponsbonuspercentagemanualname().getText();
        System.out.println("Bonus Perc Manual Coupon value is: "+ bonuspercname);

        getTestBase().getContext().setProperty("testexecution.bonuspercentagevalue",
                String.valueOf(bonuspercname));
        AssertUtils.assertDisplayed(rewardsAndCoupons.getlblrewardscouponsbonuspercentagemanual());


    }

    @Override
    public void clickOnEditLinkOnDollarToSpendSection() {
        AssertUtils.assertDisplayed(getLnkEditOnDollarToSpendSection());
        getLnkEditOnDollarToSpendSection().click();
        PauseUtil.pause(1000);
    }


    @Override
    public void clickOnEditLinkOnFreePickCouponSection() {
        PauseUtil.waitForAjaxToComplete(2500);
        AssertUtils.assertDisplayed(getlnkEditOnFreePickCouponSection());
        //getcoupon_rewardscoupons_freepickcoupon().click();
        getlnkEditOnFreePickCouponSection().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(5000);
    }

    @Override
    public void verify_FreeItem_section_displayed_in_Payment_and_OrderRef_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
       //14.1SS Payment page dont have FreeItem / Coupon Sectoin
       AssertUtils.assertDisplayed(fld_FreeItem_Section_Payment_page());

    }

    @Override
    public void verifyClassroomTeacherInfo() {

        String classroomTeacherSalutation = getConfirmAndSubmitOrder()
                .getLblClassroomTeacherInfo().getText().split(". ")[0];
        String classroomTeacherName = getConfirmAndSubmitOrder()
                .getLblClassroomTeacherInfo().getText().split(" ")[1].split("'")[0];

        String teachername = TestBaseProvider.getTestBase().getContext()
                .getProperty("execution.teachername").toString();

        Assert.assertEquals(teachername.split(" ")[1].toUpperCase(),
                classroomTeacherSalutation.toUpperCase());

        Assert.assertEquals(teachername.split(" ")[2], classroomTeacherName);
    }



    @Override
    public void verifyAgreementIdNotPresent(Configuration data) {
        // TODO Auto-generated method stub

    }

    @Override
    public void verifyContentAssetMessageOnConfirmAndSubmit() {
        // TODO Auto-generated method stub

    }

    @Override
    public void handleSecurityCode(Configuration testData) {
        // TODO Auto-generated method stub
    }


    @Override
    public void navigatetoReviewYourCartPage() {



    }


    @Override
    public void navigateToPaymentsPage() {
        try {
            btnExpand_Shipping().isDisplayed();
            btnExpand_Shipping().click();
            try {
                btnExpand_2().isDisplayed();
                PauseUtil.pause(2000);
                btnExpand_2().click();
                try {
                    btnExpand_3().isDisplayed();
                    PauseUtil.pause(2000);
                    btnExpand_3().click();
                } catch (Exception e9) {
                    System.out.println("+ button is already expanded");
                }
            } catch (Exception e8) {
                System.out.println("+ button is already expanded");
            }
        } catch (Exception e7) {
            System.out.println("+ button is already expanded");
        }
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        try {
            btnSkip1().isDisplayed();
            PauseUtil.pause(5000);
            btnSkip1().click();
            PauseUtil.pause(6000);
            PauseUtil.waitForAjaxToComplete(2500);
        } catch (Exception e6) {
            System.out.println("Skip1 button is not displayed");
        }

        try {
            btnExpand_Shipping().isDisplayed();
            btnExpand_Shipping().click();
        }
        catch (Exception e5) {
            System.out.println("+ button is already expanded");
        }
        try {
            PauseUtil.pause(2000);
            btnSkip2().isDisplayed();
            btnSkip2().click();
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.pause(6000);
            PauseUtil.waitForAjaxToComplete(2500);

        } catch (Exception e1) {
            System.out.println("Shipping and Handling is Free");
        }

        try {
            btnSkip3().isDisplayed();
            btnSkip3().click();
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.pause(6000);
            PauseUtil.waitForAjaxToComplete(2500);
        } catch (Exception e2) {
            System.out.println("REDEEM BONUS COUPONS & CREDIT NOTES Skip button is not there");
        }

        //--> soma to handle DTS in checkout // 2 lines
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.getRewardsAndCouponsSection().checkOutWithDTS(TestBaseProvider.getTestBase().getTestData());
        checkOut.getRewardsAndCouponsSection().enterTossInNumberOfStudent(TestBaseProvider.getTestBase().getTestData());

		/*
		try {
			PauseUtil.pause(5000);
			tossinQty().isDisplayed();
			tossinQty().click();
			tossinQty().sendKeys("1");

		} catch (Exception e3) {
			System.out.println("Tossin field is not displayed");
		}
		 */

        PauseUtil.pause(2000);
        btnContinueCheckout().click();
        PauseUtil.pause(5000);
        headerPaymentsIsActive().isDisplayed();

    }

    @Override
    public void navigateToPaymentsPage_2() {
        try {
            btnExpand_Shipping().isDisplayed();
            btnExpand_Shipping().click();
            try {
                btnExpand_2().isDisplayed();
                PauseUtil.pause(2000);
                btnExpand_2().click();
                try {
                    btnExpand_3().isDisplayed();
                    PauseUtil.pause(2000);
                    btnExpand_3().click();
                } catch (Exception e) {
                    System.out.println("+ button is already expanded");
                }
            } catch (Exception e) {
                System.out.println("+ button is already expanded");
            }
        } catch (Exception e) {
            System.out.println("+ button is already expanded");
        }
        PauseUtil.pause(2000);
        try {
            btnSkip2().isDisplayed();
            btnSkip2().click();
            PauseUtil.pause(7000);
        } catch (Exception e) {
            System.out.println("Shipping & Handling is Free");
        }





        //--> soma to handle DTS in checkout // 2 lines
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.getRewardsAndCouponsSection().checkOutWithDTS(TestBaseProvider.getTestBase().getTestData());

        checkOut.getRewardsAndCouponsSection().enterTossInNumberOfStudent(TestBaseProvider.getTestBase().getTestData());

		/*
		try {
			tossinQty().isDisplayed();
			tossinQty().click();
			tossinQty().sendKeys("0");
		}catch (Exception e) {
			System.out.println("tossin qty is not displayed");
		}

		 */

        PauseUtil.pause(2000);
        btnContinueCheckout().click();
        PauseUtil.pause(5000);
        PauseUtil.waitForAjaxToComplete(2000);
        headerPaymentsIsActive().isDisplayed();

    }


    @Override
    public void navigateToPaymentsPage_3() {
        try {
            btnExpand_Shipping().isDisplayed();
            btnExpand_Shipping().click();
            try {
                btnExpand_2().isDisplayed();
                PauseUtil.pause(2000);
                btnExpand_2().click();
                try {
                    btnExpand_3().isDisplayed();
                    PauseUtil.pause(2000);
                    btnExpand_3().click();
                } catch (Exception e) {
                    System.out.println("+ button is already expanded");
                }
            } catch (Exception e) {
                System.out.println("+ button is already expanded");
            }
        } catch (Exception e) {
            System.out.println("+ button is already expanded");
        }
        PauseUtil.pause(2000);

        try {
            //btnSkip1().isDisplayed();
            //btnSkip1().click();
            //PauseUtil.pause(7000);
        } catch (Exception e) {
            System.out.println("Skip1 is not available");
        }

        try {
            //btnSkip2().isDisplayed();
            //btnSkip2().click();
            //PauseUtil.pause(7000);
        } catch (Exception e2) {
            System.out.println("Skip2 is not available");
        }

        //--> soma to handle DTS in checkout // 2 lines
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.getRewardsAndCouponsSection().checkOutWithDTS(TestBaseProvider.getTestBase().getTestData());

        try {
            tossinQty().isDisplayed();
            tossinQty().click();
            tossinQty().sendKeys("0");
        } catch (Exception e) {
            System.out.println("Shipping and Handling is Free");
        }

        PauseUtil.pause(2000);
        btnContinueCheckout().click();
        PauseUtil.pause(5000);
        headerPaymentsIsActive().isDisplayed();

    }

    @Override
    public void navigateToPaymentsPage_TGAT() {
        PauseUtil.waitForAjaxToComplete(2000);
        try {
            //btnSkip1().isDisplayed();
            PauseUtil.pause(2000);
            //btnSkip1().click();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(6000);
        } catch (Exception e1) {
            System.out.println("Student Catalogues skip button is not displayed");
        }

        try {
            PauseUtil.waitForAjaxToComplete(2000);
            //btnSkip3().isDisplayed();
            //btnSkip3().click();
            //SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(6000);
        } catch (Exception e3) {
            System.out.println("Teacher Catalogues skip button is not displayed");
        }

        try {
            PauseUtil.waitForAjaxToComplete(2000);
            PauseUtil.pause(2000);
            //btnSkip2().isDisplayed();
            //btnSkip2().click();
            //SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(6000);

        } catch (Exception e2) {
            System.out.println("Shipping and Handling is Free");
        }

        //--> To handle DTS in checkout // 2 lines
        try {
            getBtnMakeYourSelection().isDisplayed();
            ICheckoutPage checkOut = getFactory().getICheckoutPage();
            checkOut.getRewardsAndCouponsSection().checkOutWithDTS(TestBaseProvider.getTestBase().getTestData());
        } catch (Exception e) {
            System.out.println("Make Selection is not displayed");
        }

        try {
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(2000);
            tossinQty().isDisplayed();
            tossinQty().click();
            tossinQty().sendKeys("1");

        } catch (Exception e3) {
            System.out.println("Tossin field is not displayed");
        }

        PauseUtil.pause(2000);
        btnContinueCheckout().click();
        PauseUtil.pause(5000);
        headerPaymentsIsActive().isDisplayed();

    }

    @Override
    public double teacher_navigate_to_payment_page() {

        ICartPage cartPage = getFactory().getICartPage();
        CartPage crtpge = new CartPage();
        //cartPage.clickProceedToCheckoutBtn();
        //PauseUtil.pause(5000);
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

        String Total_Owing_Amount_act=Total_Amount_Owing().getText();
        Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
        double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
        PauseUtil.pause(2500);
        //--> soma to handle DTS in checkout // 1 line
        checkOut.getRewardsAndCouponsSection().checkOutWithDTS(TestBaseProvider.getTestBase().getTestData());
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
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
        return Total_Owing_Amount_act_2;


    }

    @Override
    public void verify_QA_Incentive_field_taking_negative_value(Configuration testData) {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(3000);
        //RewardsAndCouponsActive().click();
        PauseUtil.pause(3000);
        String exp_val=testData.getString("updatenumberofstudents");

        //chkpge.LblRewardQandA().click();
        String act_val=rewardsAndCoupons.getTxtRewardQandA().getAttribute("cached");
        System.out.println("#################"+act_val);
        //int act_val_is=Integer.parseInt(act_val);

        Assert.assertNotEquals(act_val, exp_val, "QA Student Incentive field is taking negative value");

    }




    @Override
    public double navigateToPaymentsPage_4() {
        try {
            btnExpand_Shipping().isDisplayed();
            btnExpand_Shipping().click();
            try {
                btnExpand_2().isDisplayed();
                PauseUtil.pause(2000);
                btnExpand_2().click();
                try {
                    btnExpand_3().isDisplayed();
                    PauseUtil.pause(2000);
                    btnExpand_3().click();
                } catch (Exception e) {
                    System.out.println("+ button is already expanded");
                }
            } catch (Exception e) {
                System.out.println("+ button is already expanded");
            }
        } catch (Exception e) {
            System.out.println("+ button is already expanded");
        }
        PauseUtil.pause(5000);
        //btnSkip1().click();
        PauseUtil.pause(6000);
        try {
            btnExpand_Shipping().isDisplayed();
            btnExpand_Shipping().click();
        }
        catch (Exception e) {
            System.out.println("+ button is already expanded");
        }
        PauseUtil.pause(2000);
        //btnSkip2().click();
        PauseUtil.pause(5000);
        try {
            //btnSkip3().isDisplayed();
            //btnSkip3().click();
        } catch (Exception e2) {
            System.out.println("REDEEM BONUS COUPONS & CREDIT NOTES Skip button is not there");
        }
        PauseUtil.pause(5000);

        String Total_Owing_Amount_act=Total_Amount_Owing().getText();
        Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
        double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);

        //--> soma to handle DTS in checkout // 2 lines
        ICheckoutPage checkOut = getFactory().getICheckoutPage();
        checkOut.getRewardsAndCouponsSection().checkOutWithDTS(TestBaseProvider.getTestBase().getTestData());

        tossinQty().click();
        tossinQty().sendKeys("0");
        PauseUtil.pause(2000);
        btnContinueCheckout().click();
        PauseUtil.pause(6000);
        headerPaymentsIsActive().isDisplayed();
        return Total_Owing_Amount_act_2;
    }

    @Override
    public void enter_amount_in_student_Bonus_Bank() {
        PauseUtil.pause(2000);
        PauseUtil.waitForAjaxToComplete(2500);
        try {
            fld_StudentClub_btn_EDIT().isDisplayed();
            fld_StudentClub_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_StudentClub_BonusBank().click();
        fld_StudentClub_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_StudentClub_BonusBank().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("sBonusBank"));

    }

    @Override
    public void enter_amount_in_student_Bonus_Bank_Greater_Than_BonusBank_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double bonusbnkamt = BonusBankAmt();

        int bonusbnkamtInt = BonusBankAmtInt();


        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.bonusbnkdouble", bonusbnkamt);
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.bonusbnkint", bonusbnkamtInt);


        double bonustoEnter1 = bonusbnkamt+1;
        String bonustoEnter = Double.toString(bonustoEnter1);


        try {
            fld_StudentClub_btn_EDIT().isDisplayed();
            fld_StudentClub_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_StudentClub_BonusBank().click();
        fld_StudentClub_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_StudentClub_BonusBank().sendKeys(bonustoEnter);
        PauseUtil.pause(2000);
        btnSkip1().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

    }



    @Override
    public void enter_amount_in_teachers_Bonus_Bank_Greater_Than_BonusBank_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double bonusbnkamt = BonusBankAmt();

        int bonusbnkamtInt = BonusBankAmtInt();


        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.bonusbnkdouble", bonusbnkamt);
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.bonusbnkint", bonusbnkamtInt);


        double bonustoEnter1 = bonusbnkamt+1;
        String bonustoEnter = Double.toString(bonustoEnter1);


        try {
            fld_TeacherCat_btn_EDIT().isDisplayed();
            fld_TeacherCat_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_TeacherCat_BonusBank().click();
        fld_TeacherCat_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_TeacherCat_BonusBank().sendKeys(bonustoEnter);
        PauseUtil.pause(2000);
        btnSkip3().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

    }






    @Override
    public void enter_amount_in_shipping_Bonus_Bank_Greater_Than_BonusBank_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double bonusbnkamt = BonusBankAmt();

        int bonusbnkamtInt = BonusBankAmtInt();


        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.bonusbnkdouble", bonusbnkamt);
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.bonusbnkint", bonusbnkamtInt);


        double bonustoEnter1 = bonusbnkamt+1;
        String bonustoEnter = Double.toString(bonustoEnter1);


        try {
            fld_ShippingFee_btn_EDIT().isDisplayed();
            fld_ShippingFee_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_Shipping_BonusBank().click();
        fld_Shipping_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_Shipping_BonusBank().sendKeys(bonustoEnter);
        PauseUtil.pause(2000);
        btnSkip2().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

    }


    @Override
    public void verify_upseller_message_displayed_Rewards_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        Assert.assertTrue(msg_upseller_RewardsPage().isDisplayed(), "Upseller message is not displayed");

    }

    @Override
    public void enter_amount_in_shipping_Bonus_Bank_Equal_To_ShippingFee_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        //double shippingfeeamt = ShippingFee_BlueBarTotal();
        String shippingfeebluebarAmt1= getlblrewardscouponsshippingfeebluebartotal().getText().trim();
        if (shippingfeebluebarAmt1.equals("FREE!")) {
			System.out.println("Shipping is FREE");
		} else {
			shippingfeebluebarAmt1 = shippingfeebluebarAmt1.substring(1);
			double shippingfeebluebarAmt2=Double.parseDouble(shippingfeebluebarAmt1);
			String bonustoEnter = Double.toString(shippingfeebluebarAmt2);
			
			try {
	            fld_ShippingFee_btn_EDIT().isDisplayed();
	            fld_ShippingFee_btn_EDIT().click();
	        } catch (Exception e) {
	            System.out.println("Edit button is not shown");
	        }
	        fld_Shipping_BonusBank().click();
	        fld_Shipping_BonusBank().clear();
	        PauseUtil.pause(2000);
	        fld_Shipping_BonusBank().sendKeys(bonustoEnter);
	        PauseUtil.pause(2000);
	        getcouponspageshipapplybtn().click();
	        SCHUtils.waitForLoaderToDismiss();
	        PauseUtil.waitForAjaxToComplete(2500);
	        PauseUtil.pause(2000);
			
		}
    }

    @Override
    public void enter_amount_in_shipping_Paper_Bonus_Coupon_Equal_To_ShippingFee_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double shippingfeeamt = ShippingFee_BlueBarTotal();

        int shippingfeeamtInt = BonusBankAmtInt();


        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.bonusbnkdouble", shippingfeeamt);
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.bonusbnkint", shippingfeeamtInt);


        double bonustoEnter1 = shippingfeeamt;
        String bonustoEnter = Double.toString(bonustoEnter1);


        try {
            fld_ShippingFee_btn_EDIT().isDisplayed();
            fld_ShippingFee_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_Shipping_PaperBonus().click();
        fld_Shipping_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_Shipping_PaperBonus().sendKeys(bonustoEnter);
        PauseUtil.pause(2000);
        btnSkip2().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

    }





    @Override
    public void enter_amount_in_shipping_Bonus_Bank_Paper_Bonus_Coupon_Equal_To_ShippingFee_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double shippingfeetotal = ShippingFee_BlueBarTotal();

        double bonustoEnter1 = shippingfeetotal;

        double bonusbank1 = bonustoEnter1/2;
        bonusbank1 = TaxRoundOff(bonusbank1);

        double paperbank1 = bonustoEnter1 - bonusbank1;
        paperbank1 = TaxRoundOff(paperbank1);

        String bonusbank = Double.toString(bonusbank1);
        String paperbank = Double.toString(paperbank1);

        try {
            fld_ShippingFee_btn_EDIT().isDisplayed();
            fld_ShippingFee_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_Shipping_BonusBank().click();
        fld_Shipping_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_Shipping_BonusBank().sendKeys(bonusbank);
        PauseUtil.pause(2000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        fld_Shipping_PaperBonus().click();
        fld_Shipping_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_Shipping_PaperBonus().sendKeys(paperbank);
        PauseUtil.pause(2000);
        btnSkip2().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

    }




    @Override
    public void enter_amount_in_shipping_Bonus_Bank_Paper_Bonus_Coupon_Less_Than_ShippingFee_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double shippingfeetotal = ShippingFee_BlueBarTotal();

        double bonustoEnter1 = shippingfeetotal-1;

        double bonusbank1 = bonustoEnter1/2;
        bonusbank1 = TaxRoundOff(bonusbank1);

        double paperbank1 = bonustoEnter1 - bonusbank1;
        paperbank1 = TaxRoundOff(paperbank1);

        String bonusbank = Double.toString(bonusbank1);
        String paperbank = Double.toString(paperbank1);

        try {
            fld_ShippingFee_btn_EDIT().isDisplayed();
            fld_ShippingFee_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_Shipping_BonusBank().click();
        fld_Shipping_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_Shipping_BonusBank().sendKeys(bonusbank);
        PauseUtil.pause(2000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        fld_Shipping_PaperBonus().click();
        fld_Shipping_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_Shipping_PaperBonus().sendKeys(paperbank);
        PauseUtil.pause(2000);
        btnSkip2().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

    }

    @Override
    public void enter_amount_in_student_Bonus_Bank_Greater_Than_StudentClubTotal_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double studclubtotal = StudentClub_BlueBarTotal();

        double bonustoEnter1 = studclubtotal+1;
        String bonustoEnter = Double.toString(bonustoEnter1);


        try {
            fld_StudentClub_btn_EDIT().isDisplayed();
            fld_StudentClub_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_StudentClub_BonusBank().click();
        fld_StudentClub_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_StudentClub_BonusBank().sendKeys(bonustoEnter);
        PauseUtil.pause(2000);
        btnSkip1().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


    }


    @Override
    public void enter_amount_in_student_Bonus_Bank_Equal_To_StudentClubTotal_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double studclubtotal = StudentClub_BlueBarTotal();

        double bonustoEnter1 = studclubtotal;
        String bonustoEnter = Double.toString(bonustoEnter1);


        try {
            fld_StudentClub_btn_EDIT().isDisplayed();
            fld_StudentClub_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_StudentClub_BonusBank().click();
        fld_StudentClub_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_StudentClub_BonusBank().sendKeys(bonustoEnter);
        PauseUtil.pause(2000);
        getcouponspagestudentapplybtn().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


    }


    @Override
    public void enter_amount_in_teacher_Bonus_Bank_Equal_To_TeacherClubTotal_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double teachclubtotal = TeacherClub_BlueBarTotal();

        double bonustoEnter1 = teachclubtotal;
        String bonustoEnter = Double.toString(bonustoEnter1);


        try {
            fld_TeacherCat_btn_EDIT().isDisplayed();
            fld_TeacherCat_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_TeacherCat_BonusBank().click();
        fld_TeacherCat_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_TeacherCat_BonusBank().sendKeys(bonustoEnter);
        PauseUtil.pause(2000);
        getcouponspageteacherapplybtn().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


    }




    @Override
    public void enter_amount_in_teacher_Paper_Bonus_Coupon_Equal_To_TeacherClubTotal_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double teachclubtotal = TeacherClub_BlueBarTotal();

        double bonustoEnter1 = teachclubtotal;
        String bonustoEnter = Double.toString(bonustoEnter1);


        try {
            fld_TeacherCat_btn_EDIT().isDisplayed();
            fld_TeacherCat_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_TeacherCat_PaperBonus().click();
        fld_TeacherCat_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_TeacherCat_PaperBonus().sendKeys(bonustoEnter);
        PauseUtil.pause(2000);
        btnSkip3().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


    }



    @Override
    public void enter_amount_in_student_Paper_Bonus_Coupon_Equal_To_StudentClubTotal_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double studclubtotal = StudentClub_BlueBarTotal();

        double bonustoEnter1 = studclubtotal;
        String bonustoEnter = Double.toString(bonustoEnter1);


        try {
            fld_StudentClub_btn_EDIT().isDisplayed();
            fld_StudentClub_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_StudentClub_PaperBonus().click();
        fld_StudentClub_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_StudentClub_PaperBonus().sendKeys(bonustoEnter);
        PauseUtil.pause(2000);
        btnSkip1().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


    }




    @Override
    public void enter_amount_in_student_Bonus_Bank_Paper_Bonus_Coupon_Equal_To_StudentClubTotal_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double studentclubtotal = StudentClub_BlueBarTotal();

        double bonustoEnter1 = studentclubtotal;

        double bonusbank1 = bonustoEnter1/2;
        double paperbank1 = bonustoEnter1 - bonusbank1;

        String bonusbank = Double.toString(bonusbank1);
        String paperbank = Double.toString(paperbank1);


        try {
            fld_StudentClub_btn_EDIT().isDisplayed();
            fld_StudentClub_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_StudentClub_BonusBank().click();
        fld_StudentClub_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_StudentClub_BonusBank().sendKeys(bonusbank);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        fld_StudentClub_PaperBonus().click();
        fld_StudentClub_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_StudentClub_PaperBonus().sendKeys(paperbank);
        PauseUtil.pause(2000);
        btnSkip1().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
    }



    @Override
    public void enter_amount_in_teacher_Bonus_Bank_Paper_Bonus_Coupon_Equal_To_TeacherClubTotal_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double teacherclubtotal = TeacherClub_BlueBarTotal();

        double bonustoEnter1 = teacherclubtotal;

        double bonusbank1 = bonustoEnter1/2;
        bonusbank1 = TaxRoundOff(bonusbank1);

        double paperbank1 = bonustoEnter1 - bonusbank1;
        paperbank1 = TaxRoundOff(paperbank1);

        String bonusbank = Double.toString(bonusbank1);
        String paperbank = Double.toString(paperbank1);


        try {
            fld_TeacherCat_btn_EDIT().isDisplayed();
            fld_TeacherCat_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_TeacherCat_BonusBank().click();
        fld_TeacherCat_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_TeacherCat_BonusBank().sendKeys(bonusbank);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        fld_TeacherCat_PaperBonus().click();
        fld_TeacherCat_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_TeacherCat_PaperBonus().sendKeys(paperbank);
        PauseUtil.pause(2000);
        btnSkip3().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
    }


    @Override
    public void enter_amount_in_teacher_Bonus_Bank_Greater_Than_TeacherClubTotal_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double teachclubtotal = TeacherClub_BlueBarTotal();

        double bonustoEnter1 = teachclubtotal+1;
        String bonustoEnter = Double.toString(bonustoEnter1);


        try {
            fld_TeacherCat_btn_EDIT().isDisplayed();
            fld_TeacherCat_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_TeacherCat_BonusBank().click();
        fld_TeacherCat_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_TeacherCat_BonusBank().sendKeys(bonustoEnter);
        PauseUtil.pause(2000);
        btnSkip3().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


    }


    @Override
    public void enter_amount_in_student_Paper_Bank_Greater_Than_StudentClubTotal_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double studclubtotal = StudentClub_BlueBarTotal();

        double bonustoEnter1 = studclubtotal+1;
        String bonustoEnter = Double.toString(bonustoEnter1);


        try {
            fld_StudentClub_btn_EDIT().isDisplayed();
            fld_StudentClub_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_StudentClub_PaperBonus().click();
        fld_StudentClub_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_StudentClub_PaperBonus().sendKeys(bonustoEnter);
        PauseUtil.pause(2000);
        btnSkip1().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


    }




    @Override
    public void enter_amount_in_student_Bonus_Bank_Paper_Bank_Greater_Than_StudentClubTotal_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double studentclubtotal = StudentClub_BlueBarTotal();

        double bonustoEnter1 = studentclubtotal+2;

        double bonusbank1 = bonustoEnter1/2;
        double paperbank1 = bonustoEnter1 - bonusbank1;

        String bonusbank = Double.toString(bonusbank1);
        String paperbank = Double.toString(paperbank1);


        try {
            fld_StudentClub_btn_EDIT().isDisplayed();
            fld_StudentClub_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_StudentClub_BonusBank().click();
        fld_StudentClub_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_StudentClub_BonusBank().sendKeys(bonusbank);

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


        fld_StudentClub_PaperBonus().click();
        fld_StudentClub_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_StudentClub_PaperBonus().sendKeys(paperbank);
        PauseUtil.pause(2000);
        btnSkip1().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


    }




    @Override
    public void enter_amount_in_teacher_Bonus_Bank_Paper_Bank_Greater_Than_TeacherClubTotal_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double teachclubtotal = TeacherClub_BlueBarTotal();

        double bonustoEnter1 = teachclubtotal+1;

        double bonusbank1 = bonustoEnter1/2;
        double paperbank1 = bonustoEnter1 - bonusbank1;

        String bonusbank = Double.toString(bonusbank1);
        String paperbank = Double.toString(paperbank1);


        try {
            fld_TeacherCat_btn_EDIT().isDisplayed();
            fld_TeacherCat_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_TeacherCat_BonusBank().click();
        fld_TeacherCat_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_TeacherCat_BonusBank().sendKeys(bonusbank);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        fld_TeacherCat_PaperBonus().click();
        fld_TeacherCat_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_TeacherCat_PaperBonus().sendKeys(paperbank);
        PauseUtil.pause(2000);
        btnSkip3().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


    }



    @Override
    public void enter_amount_in_teacher_Paper_Bank_Greater_Than_TeacherClubTotal_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double techclubtotal = TeacherClub_BlueBarTotal();

        double bonustoEnter1 = techclubtotal+1;
        String bonustoEnter = Double.toString(bonustoEnter1);


        try {
            fld_TeacherCat_btn_EDIT().isDisplayed();
            fld_TeacherCat_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_TeacherCat_PaperBonus().click();
        fld_TeacherCat_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_TeacherCat_PaperBonus().sendKeys(bonustoEnter);
        PauseUtil.pause(2000);
        btnSkip3().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


    }



    @Override
    public void enter_amount_in_shipping_Bonus_Bank_Greater_Than_ShippingFee_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double shippingfeetotal = ShippingFee_BlueBarTotal();

        double bonustoEnter1 = shippingfeetotal+1;
        String bonustoEnter = Double.toString(bonustoEnter1);


        try {
            fld_ShippingFee_btn_EDIT().isDisplayed();
            fld_ShippingFee_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_Shipping_BonusBank().click();
        fld_Shipping_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_Shipping_BonusBank().sendKeys(bonustoEnter);
        PauseUtil.pause(2000);
        btnSkip2().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


    }


    @Override
    public void enter_amount_in_shipping_Paper_Bonus_Coupon_Greater_Than_ShippingFee_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double shippingfeetotal = ShippingFee_BlueBarTotal();

        double bonustoEnter1 = shippingfeetotal+1;
        String bonustoEnter = Double.toString(bonustoEnter1);


        try {
            fld_ShippingFee_btn_EDIT().isDisplayed();
            fld_ShippingFee_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_Shipping_PaperBonus().click();
        fld_Shipping_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_Shipping_PaperBonus().sendKeys(bonustoEnter);
        PauseUtil.pause(2000);
        btnSkip2().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


    }



    @Override
    public void enter_amount_in_shipping_Bonus_Bank_Paper_Bonus_Coupon_Greater_Than_ShippingFee_Amount() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


        double shippingfeetotal = ShippingFee_BlueBarTotal();

        double bonustoEnter1 = shippingfeetotal+1;

        double bonusbank1 = bonustoEnter1/2;
        bonusbank1 = TaxRoundOff(bonusbank1);

        double paperbank1 = bonustoEnter1 - bonusbank1;
        paperbank1 = TaxRoundOff(paperbank1);

        String bonusbank = Double.toString(bonusbank1);
        String paperbank = Double.toString(paperbank1);


        try {
            fld_ShippingFee_btn_EDIT().isDisplayed();
            fld_ShippingFee_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_Shipping_BonusBank().click();
        fld_Shipping_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_Shipping_BonusBank().sendKeys(bonusbank);
        PauseUtil.pause(2000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        fld_Shipping_PaperBonus().click();
        fld_Shipping_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_Shipping_PaperBonus().sendKeys(paperbank);
        PauseUtil.pause(2000);
        btnSkip2().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


    }



    @Override
    public void teacher_can_Proceed_To_checkout(){

        ShippingAndPayment shippayment = new ShippingAndPayment();

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
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        checkOut.getRewardsAndCouponsSection().enterTossInNumberOfStudent(TestBaseProvider.getTestBase().getTestData());

        System.out.println(" rewardsAndCoupons.getBtnContinueCheckout() ==========> "
                + SCHUtils.isPresent(rewardsAndCoupons.getBtnContinueCheckout()));
        SCHUtils.scrollToView(rewardsAndCoupons.getBtnContinueCheckout());
        // SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
        SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
        // rewardsAndCoupons.getBtnContinueCheckout().click();

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);

        AssertUtils.assertPresent((ExtendedElement) shippayment.getDrpPaymentMethoddrpdwn());


    }



    @Override
    public void teacher_check_Payment_disabled_checkout(){

        ShippingAndPayment shippayment = new ShippingAndPayment();

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);
        shippayment.getDrpPaymentMethoddrpdwn().click();
        PauseUtil.pause(2000);

        AssertUtils.assertNotSelected((ExtendedElement) shippayment.getDrpPaymentMethoddrpdwn());


    }



    @Override
    public void teacher_checkout_without_payment(){


        ShippingAndPayment shippayment = new ShippingAndPayment();
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        ConfirmAndSubmitOrder confirmAndSubmitOrderPage =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();

        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
        SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);
        WaitUtils.waitForDisplayed(getLblHeaderOrderConfirmation());
        AssertUtils.assertDisplayed(getLblHeaderOrderConfirmation());

        WaitUtils.waitForEnabled(confirmAndSubmitOrderPage.getBtnSubmitOrder());
        SCHUtils.clickUsingJavaScript(confirmAndSubmitOrderPage.getBtnSubmitOrder());
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);
        confirmAndSubmitOrderPage.verifyConfirmationPrint();




    }


    // this is only used for calculating all stud, teach and shipping bonus bank, paper coupon redemptions. do not use for othrs
    @Override
    public void teacher_can_Proceed_To_paymentpage(){

        ShippingAndPayment shippayment = new ShippingAndPayment();
        CheckoutPage chkpage = new CheckoutPage();

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


        double studnoofitems = StudentClub_Qty();
        double studclubssubtotal = StudentClub_SubTotal();
        double studclubstotal = StudentClub_BlueBarTotal();
        double studbonusbank = StudentClub_BonusBank();
        double studpaperbonuscoupon = StudentClub_PaperBonusCoupon();


        if(chkpage.sizevalue_GST_StudentClub_RewardsCouponsPage().size()!=0){
            double studgstvalue = StudentClub_GST();
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.studGst", studgstvalue);
        }

        if(chkpage.sizevalue_PST_StudentClub_RewardsCouponsPage().size()!=0){
            double studpstvalue = StudentClub_PST();
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.studPst", studpstvalue);
        }

        if(chkpage.sizevalue_QST_StudentClub_RewardsCouponsPage().size()!=0){
            double studqstvalue = StudentClub_QST();
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.studQst", studqstvalue);
        }

        if(chkpage.sizevalue_HST_StudentClub_RewardsCouponsPage().size()!=0){
            double studhstvalue = StudentClub_HST();
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.studHst", studhstvalue);
        }

        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.studnoofitems", studnoofitems);
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.studclubstotal", studclubstotal);
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.studclubssubtotal", studclubssubtotal);
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.studbonusbank", studbonusbank);
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.studpaperbonuscoupon", studpaperbonuscoupon);



        if(chkpage.sizevalue_GST_TeacherCat_RewardsCouponsPage().size()!=0){
            double teachgstvalue = TeacherClub_GST();
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.teacherGst", teachgstvalue);
        }

        if(chkpage.sizevalue_PST_TeacherCat_RewardsCouponsPage().size()!=0){
            double teachpstvalue = TeacherClub_PST();
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.teacherPst", teachpstvalue);

        }

        if(chkpage.sizevalue_QST_TeacherCat_RewardsCouponsPage().size()!=0){
            double teachqstvalue = TeacherClub_QST();
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.teacherQst", teachqstvalue);

        }

        if(chkpage.sizevalue_HST_TeacherCat_RewardsCouponsPage().size()!=0){
            double teachhstvalue = TeacherClub_HST();
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.teacherHst", teachhstvalue);

        }

        double teachnoofitems = TeacherClub_Qty();
        double teachclubstotal = TeacherClub_BlueBarTotal();
        double teachclubssubtotal = TeacherClub_SubTotal();
        double teachbonusbank = TeacherClub_BonusBank();
        double teachpaperbonuscoupon = TeacherClub_PaperBonusCoupon();

        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.teachnoofitems", teachnoofitems);
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.teachclubstotal", teachclubstotal);
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.teachclubssubtotal", teachclubssubtotal);
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.teachbonusbank", teachbonusbank);
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.teachpaperbonuscoupon", teachpaperbonuscoupon);


        if(!chkpage.getlblrewardscouponsshippingfeebluebartotal().getText().equals("FREE!")){

            if(chkpage.sizevalue_GST_Shipping_RewardsCouponsPage().size()!=0){
                double shipgstvalue = Shipping_GST();
                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.shippingGst", shipgstvalue);

            }

            if(chkpage.sizevalue_PST_Shipping_RewardsCouponsPage().size()!=0){
                double shippstvalue = Shipping_PST();
                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.shippingPst", shippstvalue);
            }

            if(chkpage.sizevalue_QST_Shipping_RewardsCouponsPage().size()!=0){
                double shipqstvalue = Shipping_QST();
                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.shippingQst", shipqstvalue);
            }

            if(chkpage.sizevalue_HST_Shipping_RewardsCouponsPage().size()!=0){
                double shiphstvalue = Shipping_HST();
                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.shippingHst", shiphstvalue);
            }

            double shipclubstotal = ShippingFee_BlueBarTotal();
            double shipclubssubtotal = Shipping_SubTotal();
            double shipbonusbank = ShippingFee_BonusBank();
            double shippaperbonuscoupon = ShippingFee_PaperBonusCoupon();

            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.shipclubstotal", shipclubstotal);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.shipclubssubtotal", shipclubssubtotal);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.shipbonusbank", shipbonusbank);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.shippaperbonuscoupon", shippaperbonuscoupon);

        }

        double totalamountowing = Total_Amt_Owing();
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.totalamtowing", totalamountowing);

        //--> soma to handle DTS in checkout // 1 line
        checkOut.getRewardsAndCouponsSection().checkOutWithDTS(TestBaseProvider.getTestBase().getTestData());
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        checkOut.getRewardsAndCouponsSection().enterTossInNumberOfStudent(TestBaseProvider.getTestBase().getTestData());

        System.out.println(" rewardsAndCoupons.getBtnContinueCheckout() ==========> "
                + SCHUtils.isPresent(rewardsAndCoupons.getBtnContinueCheckout()));
        SCHUtils.scrollToView(rewardsAndCoupons.getBtnContinueCheckout());
        // SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
        SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
        // rewardsAndCoupons.getBtnContinueCheckout().click();

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);


    }


    @Override
    public void teacher_validate_noofitems_studtotals_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        // double expstudnoofitems = Payment_StudentClub_Qty();
        double expstudclubstotal = Payment_StudentClub_BlueBarTotal();


		/*String actualstudnoofitems1 = TestBaseProvider.getTestBase().getContext().
	    		getProperty("testexecution.studnoofitems").toString();
	    int actualstudnoofitems = Integer.parseInt(actualstudnoofitems1);*/

        String actualstudtotal1 = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.studclubstotal").toString();
        double actualstudtotal = Double.parseDouble(actualstudtotal1);

        //Assert.assertEquals(actualstudnoofitems, expstudnoofitems, "Student Club Items are incorrect from rewards page to payment page");
        Assert.assertEquals(expstudclubstotal, actualstudtotal, "Student Club Totals are incorrect from rewards page to payment page");
    }


    @Override
    public void teacher_validate_student_subtotal_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double expstudclubstotal = Payment_StudentClub_SubTotal();

        String actualstudtotal1 = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.studclubssubtotal").toString();
        double actualstudtotal = Double.parseDouble(actualstudtotal1);

        Assert.assertEquals(expstudclubstotal, actualstudtotal, "Student Club Sub Totals are incorrect from rewards page to payment page");
    }

    @Override
    public void teacher_validate_teacher_subtotal_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double expteachclubstotal = Payment_TeacherClub_SubTotal();

        String actualteachtotal1 = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.teachclubssubtotal").toString();
        double actualteachtotal = Double.parseDouble(actualteachtotal1);
        Assert.assertEquals(expteachclubstotal, actualteachtotal, "Teacher Club Totals are incorrect from rewards page to payment page");
    }


    @Override
    public void teacher_validate_shipping_subtotal_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


        double expshippingstotal = Payment_Shipping_SubTotal();

        String actualshippingtotal1 = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.shipclubssubtotal").toString();
        double actualshippingtotal = Double.parseDouble(actualshippingtotal1);

        Assert.assertEquals(expshippingstotal, actualshippingtotal, "Shipping Club Totals are incorrect from rewards page to payment page");
    }




    @Override
    public void teacher_validate_noofitems_teachertotals_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        // double expteachnoofitems = Payment_TeacherClub_Qty();
        double expteachclubstotal = Payment_TeacherClub_BlueBarTotal();


		/* String actualteachnoofitems1 = TestBaseProvider.getTestBase().getContext().
	    		getProperty("testexecution.teachnoofitems").toString();
	    int actualteachnoofitems = Integer.parseInt(actualteachnoofitems1);*/

        String actualteachtotal1 = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.teachclubstotal").toString();
        double actualteachtotal = Double.parseDouble(actualteachtotal1);

        //Assert.assertEquals(actualstudnoofitems, expstudnoofitems, "Student Club Items are incorrect from rewards page to payment page");
        Assert.assertEquals(expteachclubstotal, actualteachtotal, "Teacher Club Totals are incorrect from rewards page to payment page");
    }





    @Override
    public void teacher_validate__shippingtotals_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


        double expshippingtotal = Payment_ShippingFee_BlueBarTotal();

        String actualshippingtotal1 = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.shipclubstotal").toString();
        double actualshippingtotal = Double.parseDouble(actualshippingtotal1);

        //Assert.assertEquals(actualstudnoofitems, expstudnoofitems, "Student Club Items are incorrect from rewards page to payment page");
        Assert.assertEquals(expshippingtotal, actualshippingtotal, "Shipping Totals are incorrect from rewards page to payment page");
    }


    @Override
    public void teacher_validate_studtotals_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double expstudclubstotal = Payment_StudentClub_BlueBarTotal();

        String actualstudtotal1 = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.studclubstotal").toString();
        double actualstudtotal = Double.parseDouble(actualstudtotal1);

        Assert.assertEquals(expstudclubstotal, actualstudtotal, "Student Club Totals are incorrect from rewards page to payment page");
    }




    @Override
    public void teacher_validate_teachertotals_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double expteachclubstotal = Payment_TeacherClub_BlueBarTotal();

        String actualteachtotal1 = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.teachclubstotal").toString();
        double actualteachtotal = Double.parseDouble(actualteachtotal1);

        Assert.assertEquals(expteachclubstotal, actualteachtotal, "Teacher Club Totals are incorrect from rewards page to payment page");
    }


    @Override
    public void teacher_validate_shippingtotals_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double expshippingtotal = Payment_ShippingFee_BlueBarTotal();

        String actualshippingtotal1 = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.shipclubstotal").toString();
        double actualshippingtotal = Double.parseDouble(actualshippingtotal1);

        Assert.assertEquals(expshippingtotal, actualshippingtotal, "Shipping Totals are incorrect from rewards page to payment page");
    }



    @Override
    public void teacher_validate_totalamtowing_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double exptotalamtowing = Payment_Total_Amt_Owing();

        String actualtotalamtowing1 = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.totalamtowing").toString();
        double actualtotalamtowing = Double.parseDouble(actualtotalamtowing1);

        Assert.assertEquals(exptotalamtowing,actualtotalamtowing,  "Total Amt Owing is incorrect from rewards page to payment page");
    }



    @Override
    public void teacher_validate_bonusbank_paperbonuscoupon_student_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double expstudbonusbank = Payment_StudentClub_BonusBank();
        double expstudpapercoupon = Payment_StudentClub_PaperBonusCoupon();

        String actualstudbonusbank1 = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.studbonusbank").toString();
        double actualstudbonusbank = Double.parseDouble(actualstudbonusbank1);

        String actualstudpapercoupon1 = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.studpaperbonuscoupon").toString();
        double actualstudpapercoupon = Double.parseDouble(actualstudpapercoupon1);

        Assert.assertEquals(expstudbonusbank,actualstudbonusbank,  "Student Club bonus bank details are incorrect from rewards page to payment page");
        Assert.assertEquals(expstudpapercoupon,actualstudpapercoupon,  "Student Club paper coupon details are incorrect from rewards page to payment page");
    }




    @Override
    public void teacher_validate_bonusbank_paperbonuscoupon_teacher_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double expteachbonusbank = Payment_TeacherClub_BonusBank();
        double expteachpapercoupon = Payment_TeacherClub_PaperBonusCoupon();


        String actualteachbonusbank1 = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.teachbonusbank").toString();
        double actualteachbonusbank = Double.parseDouble(actualteachbonusbank1);

        String actualteachpapercoupon1 = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.teachpaperbonuscoupon").toString();
        double actualteachpapercoupon = Double.parseDouble(actualteachpapercoupon1);

        Assert.assertEquals(expteachbonusbank,actualteachbonusbank,  "Teacher Club bonus bank details are incorrect from rewards page to payment page");
        Assert.assertEquals(expteachpapercoupon,actualteachpapercoupon,  "Teacher Club paper coupon details are incorrect from rewards page to payment page");
    }




    @Override
    public void teacher_validate_bonusbank_paperbonuscoupon_shipping_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double expshippingbonusbank = Payment_ShippingFee_BonusBank();
        double expshippingpapercoupon = Payment_ShippingFee_PaperBonusCoupon();

        String actualshipbonusbank1 = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.shipbonusbank").toString();
        double actualshipbonusbank = Double.parseDouble(actualshipbonusbank1);

        String actualshippapercoupon1 = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.shippaperbonuscoupon").toString();
        double actualshippapercoupon = Double.parseDouble(actualshippapercoupon1);

        Assert.assertEquals(expshippingbonusbank, actualshipbonusbank, "Shipping bonus bank details are incorrect from rewards page to payment page");
        Assert.assertEquals(expshippingpapercoupon,actualshippapercoupon,  "Shipping Club paper coupon details are incorrect from rewards page to payment page");
    }


    @Override
    public void check_StudentClubTotalToZero(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double studclubtotal = StudentClub_BlueBarTotal();
        System.out.println("Student club total after applying bonus bank: "+studclubtotal);

        double Expected_studclubtotal = 0.00;
        Assert.assertEquals(studclubtotal, Expected_studclubtotal, "Student Club Total should be zero");

    }



    @Override
    public void check_TeacherClubTotalToZero(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double teachclubtotal = TeacherClub_BlueBarTotal();
        System.out.println("Teacher club total after applying bonus bank: "+teachclubtotal);

        double Expected_teachclubtotal = 0.00;
        Assert.assertEquals(teachclubtotal, Expected_teachclubtotal, "Teacher Club Total should be zero");

    }




    @Override
    public void check_ShippingTotalToZero(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);

        double shippingfeetotal = ShippingFee_BlueBarTotal();
        System.out.println("Teacher club total after applying bonus bank: "+shippingfeetotal);

        double Expected_teachclubtotal = 0.00;
        Assert.assertEquals(shippingfeetotal, Expected_teachclubtotal, "Shipping Fee Total should be zero");

    }



    @Override
    public void bonusbank_error_msg(){
        AssertUtils.assertTextMatches(getmsgbonusbankerrmsg(),
                Matchers.containsString(ConstantUtils.BONUSBANKERRMSG_GRTTHANTOTAL));

    }


    @Override
    public void bonusbankAmount_error_msg(){

        String bonuabnkInt = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.bonusbnkint").toString();

        String bonuabnkdouble = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.bonusbnkdouble").toString();



        String expbonusbnkmsg = getmsgbonusbankerrmsg().getText();

        if(!expbonusbnkmsg.equals(ConstantUtils.BONUSBANKERRMSG_GRTTHANBONUSAMT+bonuabnkInt) && !expbonusbnkmsg.equals(ConstantUtils.BONUSBANKERRMSG_GRTTHANBONUSAMT+bonuabnkdouble) )
        {
            Assert.fail("Incorrect error message if we enter bonus / paper coupon more than bonus bank amout available");
        }
    }


    @Override
    public void enter_amount_in_student_bonus_Bank_Equal_To_OrderTotal() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);



        try {
            fld_StudentClub_btn_EDIT().isDisplayed();
            fld_StudentClub_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_StudentClub_BonusBank().click();
        fld_StudentClub_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_StudentClub_BonusBank().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("sBonusBank"));

    }



    @Override
    public void enter_amount_in_student_Paper_Bank() {
        PauseUtil.pause(2000);
        PauseUtil.waitForAjaxToComplete(2500);
        try {
            fld_StudentClub_btn_EDIT().isDisplayed();
            fld_StudentClub_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_StudentClub_PaperBonus().click();
        fld_StudentClub_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_StudentClub_PaperBonus().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("sPaperBank"));
    }

    @Override
    public void click_on_Apply_in_Students_section() {
        PauseUtil.pause(2000);
        getcouponspagestudentapplybtn().click();
    }

    @Override
    public void apply_a_coupon_Rewards_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        try {
            delete_coupon_in_RewardsPage().isDisplayed();
            TCOD_delete_applied_coupon_Rewards_page();
        } catch (Exception e) {
            System.out.println("No coupons are available to delete");
        }
        fld_Enter_CouponCode_RewardsPage().click();
        fld_Enter_CouponCode_RewardsPage().clear();
        fld_Enter_CouponCode_RewardsPage().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("CouponCode"));
        PauseUtil.pause(4000);
        btn_Apply_for_Coupon_RewardsPage().click();
    }
    
    @Override
    public void apply_a_BonusFlat_coupon_Rewards_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        try {
            delete_coupon_in_RewardsPage().isDisplayed();
            TCOD_delete_applied_coupon_Rewards_page();
        } catch (Exception e) {
            System.out.println("No coupons are available to delete");
        }
        fld_Enter_CouponCode_RewardsPage().click();
        fld_Enter_CouponCode_RewardsPage().clear();
        fld_Enter_CouponCode_RewardsPage().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("BonusFlatCode"));
        PauseUtil.pause(4000);
        btn_Apply_for_Coupon_RewardsPage().click();
    }
    
    @Override
    public void apply_a_coupon_without_deleting_existing_coupons() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        fld_Enter_CouponCode_RewardsPage().click();
        fld_Enter_CouponCode_RewardsPage().clear();
        fld_Enter_CouponCode_RewardsPage().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("CouponCode"));
        PauseUtil.pause(4000);
        btn_Apply_for_Coupon_RewardsPage().click();
    }
    
    @Override
    public void apply_a_BonusFlat_coupon_without_deleting_existing_coupons() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        fld_Enter_CouponCode_RewardsPage().click();
        fld_Enter_CouponCode_RewardsPage().clear();
        fld_Enter_CouponCode_RewardsPage().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("BonusFlatCode"));
        PauseUtil.pause(4000);
        btn_Apply_for_Coupon_RewardsPage().click();
    }
    
    @Override
    public void apply_TGAT_coupon_in_Rewards_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        try {
            delete_coupon_in_RewardsPage().isDisplayed();
            TCOD_delete_applied_coupon_Rewards_page();
        } catch (Exception e) {
            System.out.println("No coupons are available to delete");
        }
        fld_Enter_CouponCode_RewardsPage().click();
        fld_Enter_CouponCode_RewardsPage().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("TGATcoupon"));
        PauseUtil.waitForAjaxToComplete(2000);
        SCHUtils.waitForElementToBeClickable(btn_Apply_for_Coupon_RewardsPage(), 15);
        PauseUtil.pause(4000);
        //SCHUtils.clickUsingJavaScript(btn_Apply_for_Coupon_RewardsPage());
        btn_Apply_for_Coupon_RewardsPage().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(5000);
        PauseUtil.pause(2000);

    }

    @Override
    public void select_TGAT_delete_button_and_click_NO() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        SCHUtils.clickUsingJavaScript(btn_close_TGAT_coupon());
        //btn_close_TGAT_coupon().click();
        PauseUtil.pause(1500);
        SCHUtils.clickUsingJavaScript(btn_NO_to_delete_TGAT_coupon());
        //btn_NO_to_delete_TGAT_coupon().click();

    }

    @Override
    public void verify_TGAT_coupon_in_Coupons_Applied_section() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            TGAT_coupon_in_Coupons_Applied_section().isDisplayed();
            System.out.println("TGAT coupon is present in Coupons Applied section");
        } catch (Exception e) {
            Assert.fail("TGAT coupon is not present in Coupons Applied section");
        }

    }

    @Override
    public void verify_TGAT_coupon_not_present_in_Coupons_Applied_section() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            TGAT_coupon_in_Coupons_Applied_section().isDisplayed();
            Assert.fail("TGAT coupon is present in Coupons Applied section");
        } catch (Exception e) {
            System.out.println("TGAT coupon is not present in Coupons Applied section");
        }

    }

    @Override
    public void select_TGAT_delete_button_and_click_YES() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        btn_close_TGAT_coupon().click();
        PauseUtil.pause(1500);
        SCHUtils.clickUsingJavaScript(btn_YES_to_delete_TGAT_coupon());
        //btn_YES_to_delete_TGAT_coupon().click();

    }

    @Override
    public void apply_TGAT_coupon_in_Rewards_page_referred_by_Teacher1() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        try {
            delete_coupon_in_RewardsPage().isDisplayed();
            TCOD_delete_applied_coupon_Rewards_page();
        } catch (Exception e) {
            System.out.println("No coupons are available to delete");
        }
        fld_Enter_CouponCode_RewardsPage().click();
        fld_Enter_CouponCode_RewardsPage().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("TGATcouponTeacher1"));
        PauseUtil.pause(4000);
        SCHUtils.clickUsingJavaScript(btn_Apply_for_Coupon_RewardsPage());
        //btn_Apply_for_Coupon_RewardsPage().click();
        PauseUtil.waitForAjaxToComplete(2500);

    }

    @Override
    public void apply_TGAT_coupon_in_Rewards_page_referred_by_Teacher2() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        fld_Enter_CouponCode_RewardsPage().click();
        fld_Enter_CouponCode_RewardsPage().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("TGATcouponTeacher2"));
        PauseUtil.pause(4000);
        SCHUtils.clickUsingJavaScript(btn_Apply_for_Coupon_RewardsPage());
        //btn_Apply_for_Coupon_RewardsPage().click();
        PauseUtil.waitForAjaxToComplete(2500);

    }

    @Override
    public void validate_error_message_which_not_meet_the_student_club_tot_value() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String TGATcoupon=TestBaseProvider.getTestBase().getTestData().getString("TGATcoupon");
        String exp_text="Your order does not meet the "+"\""+TGATcoupon+"\""+" coupon requirements. Please check the coupon for details.";
        String act_text=popUp_coupon_error_message_RewardsPage().getText();

        Assert.assertEquals(act_text, exp_text, "Incorrect error message is displayed");
    }

    @Override
    public void validate_error_message_when_enter_same_TGAT_coupon() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String TGATcoupon=TestBaseProvider.getTestBase().getTestData().getString("TGATcoupon");
        String exp_text="Coupon code "+"\""+TGATcoupon+"\""+" is already in your cart.";
        String act_text=popUp_coupon_error_message_RewardsPage().getText();

        Assert.assertEquals(act_text, exp_text, "Incorrect error message is displayed when enter the same TGAT coupon which is already in cart");
    }

    @Override
    public void validate_error_message_when_enter_TGAT_secondTime() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String TGATcoupon= TestBaseProvider.getTestBase().getTestData().getString("TGATcoupon");
        //String exp_text="You have already redeemed "+"\""+TGATcoupon+"\""+" coupon code on a previous order.";
        String exp_text="Our records indicate that this coupon code has already been redeemed.";
        System.out.println("##########"+exp_text);
        String act_text=popUp_coupon_error_message_RewardsPage().getText().trim();

        Assert.assertEquals(act_text, exp_text, "Incorrect error message is displayed");
    }

    @Override
    public void verify_the_toolTip_for_TGAT_coupon_details() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=ToolTip_for_TGAT_coupon_details().getAttribute("data-thankyou-msg");
        String exp_text="Thank you for ensuring your colleague earns Bonus Points!";

        Assert.assertEquals(act_text, exp_text, "Incorrect toolTip is displayed for TGAT coupon");
    }

    @Override
    public void verify_the_error_msg_without_enter_TGAT_ac_details_and_proceed_checkout() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String exp_text="Click the coupon link below to finalize your coupons";
        String act_text=popUp_coupon_error_message_RewardsPage().getText();

        Assert.assertEquals(act_text, exp_text, "Incorrect error message is displayed");
    }

    @Override
    public void validate_error_message_when_enter_TGAT_secondTime_in_sameOrder() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String exp_text="This Coupon has already been applied to this order";
        String act_text=popUp_coupon_error_message_RewardsPage().getText();

        Assert.assertEquals(act_text, exp_text, "Incorrect error message is displayed");
    }

    @Override
    public void validate_error_message_when_wrong_TGAT_coupon_enters() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String TGATcoupon=TestBaseProvider.getTestBase().getTestData().getString("TGATcoupon");
        String exp_text="The system does not recognize the coupon code";
        String act_text=popUp_coupon_error_message_RewardsPage().getText();
        if(!act_text.contains(exp_text))
        {
            Assert.fail("Incorrect error message is displayed when Teacher enters wrong TGAT coupon");
        }

       // Assert.assertEquals(act_text, exp_text, "Incorrect error message is displayed when Teacher enters wrong TGAT coupon");
    }

    @Override
    public void validate_error_message_when_order_does_not_qualify_the_min_val() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String TGATcoupon=TestBaseProvider.getTestBase().getTestData().getString("TGATcoupon");
        String exp_text="Your order does not meet the "+"\""+TGATcoupon+"\""+" coupon requirements. Please check the coupon for details.";
        String act_text=popUp_coupon_error_message_RewardsPage().getText();

        Assert.assertEquals(act_text, exp_text, "Incorrect error message is displayed when the order doesn't qualify the min value");
    }

    @Override
    public void validate_error_message_for_invalid_customer_account_number() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        //String TGATcoupon=TestBaseProvider.getTestBase().getTestData().getString("TGATcoupon");
        String exp_text="This customer account number is invalid. Please make sure you entered the correct number";
        System.out.println("##########"+exp_text);
        String act_text=popUp_coupon_error_message_RewardsPage().getText();

        Assert.assertEquals(act_text, exp_text, "Incorrect error message is displayed");
    }

    @Override
    public void Teacher_enters_referring_teacher_details_TGAT_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        fld_Teacher_CustNum_TGAT_Modal_window().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("RefTeacherCustNo"));
        PauseUtil.pause(2000);
        fld_Teacher_Fname_TGAT_Modal_window().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("RefTeacherFname"));
        PauseUtil.pause(2000);
        fld_Teacher_Lname_TGAT_Modal_window().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("RefTeacherLname"));
        PauseUtil.pause(2000);
        btn_Submit_TGAT_Modal_window().click();
    }

    @Override
    public void close_the_TGAT_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        button_close_the_TGAT_modal_window().click();
    }

    @Override
    public void Teacher_enters_referring_teacher_Fname_Lname_in_TGAT_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        fld_Teacher_Fname_TGAT_Modal_window().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("RefTeacherFname"));
        PauseUtil.pause(2000);
        fld_Teacher_Lname_TGAT_Modal_window().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("RefTeacherLname"));
        PauseUtil.pause(2000);

    }

    @Override
    public void Teacher_enters_referring_teacher_AcNum_Lname_in_TGAT_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        fld_Teacher_CustNum_TGAT_Modal_window().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("RefTeacherCustNo"));
        PauseUtil.pause(2000);
        fld_Teacher_Lname_TGAT_Modal_window().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("RefTeacherLname"));
        PauseUtil.pause(2000);

    }

    @Override
    public void Teacher_enters_referring_teacher_AcNum_Fname_in_TGAT_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        fld_Teacher_CustNum_TGAT_Modal_window().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("RefTeacherCustNo"));
        PauseUtil.pause(2000);
        fld_Teacher_Fname_TGAT_Modal_window().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("RefTeacherFname"));
        PauseUtil.pause(2000);

    }

    @Override
    public void validate_Submit_button_is_disabled_in_TGAT_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        if (btn_Submit_TGAT_Modal_window().isEnabled()) {
            Assert.fail("Submit button is enabled in TGAT modal window");
        } else {
            System.out.println("Submit button is disabled");
        }

    }

    @Override
    public void validate_the_error_message_for_Invalide_cust_id() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        //String TGATcoupon=TestBaseProvider.getTestBase().getTestData().getString("TGATcoupon");
        String exp_text="This customer account number is invalid. Please make sure you entered the correct number";
        String act_text=popUp_coupon_error_message_RewardsPage().getText();

        Assert.assertEquals(act_text, exp_text, "Incorrect error message is displayed");

    }

    @Override
    public void clicks_Search_fld_and_searches_an_item_in_MakeYourSelection_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        Search_fld_MakeYourSelection_window().click();
        Search_fld_MakeYourSelection_window().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("SearchData"));
        PauseUtil.pause(2000);
        Search_btn_MakeYourSelection_window().click();

    }

    @Override
    public void verify_no_search_results_display_in_MakeYourSelection_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        //Assert.assertTrue(empty_data_search_results_MakeYourSelection_window().isDisplayed(), "Search results are displayed");
        //String text_exp=empty_data_search_results_MakeYourSelection_window().getText();
        WebDriver driver=TestBaseProvider.getTestBase().getDriver();
        String text_act=driver.findElement(By.xpath("//td[@class='dataTables_empty']")).getText().trim();
        String text_exp="No data available in table";
        String text_exp2="No search results found";
        
        if (text_act.equalsIgnoreCase(text_exp) || text_act.equalsIgnoreCase(text_exp2)) {
			System.out.println("No search results are displayed");
		} else {
			Assert.fail("Search results are displayed");
		}
    }

    @Override
    public void delete_the_FreeItem_RewardsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);
        SCHUtils.waitForElementToBeClickable(delete_coupon_in_RewardsPage(),10);
        delete_coupon_in_RewardsPage().click();
        PauseUtil.pause(1000);
        YES_to_delete_coupon_RewardsPage().click();

    }

    @Override
    public void verify_error_message_displayed_in_Rewards_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        AssertUtils.assertDisplayed(popUp_coupon_error_message_RewardsPage());

    }

    @Override
    public void verify_the_percentage_recieved_in_Rewards_page_tier1() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String StudentClubSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubSubTotal = StudentClubSubTotal.substring(1);
        double StudentClubSubTotal_exp=Double.parseDouble(StudentClubSubTotal);

        String Earned_amt=earned_BonusBank_amt_for_coupon_RewardsPage().getText();
        Earned_amt = Earned_amt.substring(1);
        double Earned_amt_exp=Double.parseDouble(Earned_amt);
        double BonusPercentagePromotion = TestBaseProvider.getTestBase().getTestData().getDouble("bonuspercent");

            double Earned_amt_act=(BonusPercentagePromotion * StudentClubSubTotal_exp)/100;
            Earned_amt_act =Double.parseDouble(new DecimalFormat("##.##").format(Earned_amt_act));
            System.out.println("#########Earned_amt_act:"+Earned_amt_act);
            Assert.assertEquals(Earned_amt_act, Earned_amt_exp, "Earned Bonus amount value is incorrect");

    }

    @Override
    public void verify_the_percentage_recieved_in_Rewards_page_tier2() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String StudentClubSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubSubTotal = StudentClubSubTotal.substring(1);
        double StudentClubSubTotal_exp=Double.parseDouble(StudentClubSubTotal);

        String Earned_amt=earned_BonusBank_amt_for_coupon_RewardsPage().getText();
        Earned_amt = Earned_amt.substring(1);
        double Earned_amt_exp=Double.parseDouble(Earned_amt);
        double BonusPercentagePromotion=TestBaseProvider.getTestBase().getTestData().getDouble("bonuspercent2");

            double Earned_amt_act=(BonusPercentagePromotion * StudentClubSubTotal_exp)/100;
            Earned_amt_act =Double.parseDouble(new DecimalFormat("##.##").format(Earned_amt_act));
            System.out.println("#########Earned_amt_act:"+Earned_amt_act);

            Assert.assertEquals(Earned_amt_exp, Earned_amt_act, "Earned Bonus amount value is incorrect");

    }

    @Override
    public double verify_the_percentage_recieved_in_Rewards_page_tier1_with_BonusPercentage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String StudentClubSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubSubTotal = StudentClubSubTotal.substring(1);
        double StudentClubSubTotal_exp=Double.parseDouble(StudentClubSubTotal);

        String Earned_amt=earned_BonusBank_amt_for_coupon_RewardsPage().getText();
        Earned_amt = Earned_amt.substring(1);
        double Earned_amt_exp=Double.parseDouble(Earned_amt);

        double value1=100;
        double value2=150;

        if (StudentClubSubTotal_exp>=value1 && StudentClubSubTotal_exp<value2) {

            double BonusPercentagePromotion1=5;
            double BonusPercentagePromotion2=5;
            double BonusPercentagePromotion=BonusPercentagePromotion1+BonusPercentagePromotion2;

            double Earned_amt_act=(BonusPercentagePromotion * StudentClubSubTotal_exp)/100;
            Earned_amt_act =Double.parseDouble(new DecimalFormat("##.##").format(Earned_amt_act));
            System.out.println("#########Earned_amt_act:"+Earned_amt_act);

            Assert.assertEquals(Earned_amt_act, Earned_amt_exp, "Earned Bonus amount value is incorrect");


        } else {
            System.out.println("Student Clubs Total value is not expected to the tier1 amount:"+StudentClubSubTotal_exp);
        }
        return Earned_amt_exp;

    }

    @Override
    public void verify_the_percentage_recieved_in_Rewards_page_tier1_after_deletes_the_Bonus_coupon(double earned_Amt_act) {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String Earned_amt=earned_BonusBank_amt_for_coupon_RewardsPage().getText();
        Earned_amt = Earned_amt.substring(1);
        double Earned_amt_exp=Double.parseDouble(Earned_amt);

        double Earned_Amt_Act_is=earned_Amt_act/2;
        Earned_Amt_Act_is =Double.parseDouble(new DecimalFormat("##.##").format(Earned_Amt_Act_is));
        System.out.println("#########Earned_Amt_Act_is:"+Earned_Amt_Act_is);

        Assert.assertEquals(Earned_Amt_Act_is, Earned_amt_exp, "Earned Bonus amount value is incorrect after deletes the Bonus Coupon");

    }

    @Override
    public void verify_FreeItem_displayed_in_Rewards_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        AssertUtils.assertDisplayed(fld_applied_coupon_Section1_RewardsPage());
        AssertUtils.assertDisplayed(fld_applied_coupon_Section2_RewardsPage());
        //AssertUtils.assertDisplayed(fld_FreeItem1_Section_RewardsPage());
    }

    @Override
    public void verify_TGAT_modal_window_displayed() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        try {
            TGAT_modal_window().isDisplayed();
            System.out.println("TGAT modal window is displayed");
        } catch (Exception e) {
            Assert.fail("TGAT modal window is not displayed");
        }
    }

    @Override
    public void verify_Teacher_ac_details_displayed_Coupons_applied_section() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        try {
            Teacher_ac_details_Coupons_applied_section().isDisplayed();
            System.out.println("Teacher_ac_details is displayed in Coupons applied section");
        } catch (Exception e) {
            Assert.fail("Teacher_ac_details is not displayed in Coupons applied section");
        }
    }

    @Override
    public void enter_amount_in_teacher_Bonus_Bank() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        try {
            fld_TeacherCat_btn_EDIT().isDisplayed();
            fld_TeacherCat_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_TeacherCat_BonusBank().click();
        fld_TeacherCat_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_TeacherCat_BonusBank().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("tBonusBank"));
    }

    @Override
    public void enter_amount_in_teacher_Paper_Bank() {
        PauseUtil.pause(2000);
        PauseUtil.waitForAjaxToComplete(2500);
        try {
            fld_TeacherCat_btn_EDIT().isDisplayed();
            fld_TeacherCat_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_TeacherCat_PaperBonus().click();
        fld_TeacherCat_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_TeacherCat_PaperBonus().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("tPaperBank"));
    }


    @Override
    public void enter_amount_in_shipping_Bonus_Bank() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        try {
            fld_ShippingFee_btn_EDIT().isDisplayed();
            fld_ShippingFee_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_Shipping_BonusBank().click();
        fld_Shipping_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_Shipping_BonusBank().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("shipBonusBank"));
    }

    @Override
    public void enter_amount_in_shipping_Paper_Bank() {
        PauseUtil.pause(2000);
        PauseUtil.waitForAjaxToComplete(2500);
        try {
            fld_ShippingFee_btn_EDIT().isDisplayed();
            fld_ShippingFee_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_Shipping_PaperBonus().click();
        fld_Shipping_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_Shipping_PaperBonus().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("shipPaperBank"));
    }

    @Override
    public void click_on_Apply_in_Teacher_section() {
        PauseUtil.pause(2000);
        getcouponspageteacherapplybtn().click();
    }

    @Override
    public void check_applybtn_stud_teach_ship_sections()
    {
        Assert.assertEquals(sizecouponspagestudentapplybtn().size() > 0, true);
        Assert.assertEquals(sizecouponspageteacherapplybtn().size() > 0, true);
        Assert.assertEquals(sizecouponspageshipapplybtn().size() > 0, true);
    }


    @Override
    public void check_skipbtn_stud_teach_ship_sections()
    {
        Assert.assertNotEquals(sizecouponspagestudentskipbtn().size() > 0, true);
        Assert.assertNotEquals(sizecouponspageteacherskipbtn().size() > 0, true);
        Assert.assertNotEquals(sizecouponspageshipskipbtn().size() > 0, true);
    }

    @Override
    public void check_editbtn_stud_sections()
    {
        Assert.assertEquals(sizecouponspagestudenteditbtn().size() > 0, true);
    }

    @Override
    public void check_editbtn_teach_sections()
    {
        Assert.assertEquals(sizecouponspageteachereditbtn().size() > 0, true);
    }

    @Override
    public void check_editbtn_ship_sections()
    {
        Assert.assertEquals(sizecouponspageshipeditbtn().size() > 0, true);
    }

    @Override
    public void click_on_Apply_in_Shipping_section() {
        PauseUtil.pause(2000);
        getcouponspageshipapplybtn().click();
    }

    @Override
    public void verify_Teacher_receives_FlatBonusDollars() {
        PauseUtil.pause(2000);
        PauseUtil.waitForAjaxToComplete(2500);
        AssertUtils.assertDisplayed(fld_earned_BonusBank_amt_section_RewardsPage());
        AssertUtils.assertDisplayed(earned_BonusBank_amt_for_coupon_RewardsPage());

        String StudentClubSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubSubTotal = StudentClubSubTotal.substring(1).replaceAll(",","");
        double StudentClubSubTotal_exp=Double.parseDouble(StudentClubSubTotal);

        String BonusFlatAmt=earned_BonusBank_amt_for_coupon_RewardsPage().getText();
        BonusFlatAmt = BonusFlatAmt.substring(1);
        double BonusFlatAmt_exp=Double.parseDouble(BonusFlatAmt);

        String tier31_val=TestBaseProvider.getTestBase().getTestData().getString("bonusflattier1");
        double tier1_val=Double.parseDouble(tier31_val);

        String tier41_val=TestBaseProvider.getTestBase().getTestData().getString("bonusflattier2");
        double tier2_val = Double.parseDouble(tier41_val);

        String tier5_val=TestBaseProvider.getTestBase().getTestData().getString("bonusflattier3");
        double tier3_val = Double.parseDouble(tier5_val);


        String tier6_val=TestBaseProvider.getTestBase().getTestData().getString("bonusflattier4");
        double tier4_val = Double.parseDouble(tier6_val);




        /*String  <bonusflattier1>25.00</bonusflattier1>
        <bonusflattier2>50.00</bonusflattier2>
        <bonusflattier3>75.00</bonusflattier3>
        <bonusflattier4>125.00</bonusflattier4>
        String  bonusflattier3 = TestBaseProvider.getTestBase().getTestData().getString("bonusflattier1");

*/

        try {

            if (Payable_amt_Rewards_Coupons().isDisplayed()) {
                String Payable_Amt=Payable_amt_Rewards_Coupons().getText();
                String[] value = Payable_Amt.split("\\|");

                String[] value2=value[0].split(":");
                System.out.println("*******************:"+value2[1]);

                String value3=value2[1].toString().trim();
                value3=value3.substring(1);
                double payableAmt_act=Double.parseDouble(value3);
                System.out.println("@@@@@@@@@@@@@@:"+payableAmt_act);

                StudentClubSubTotal_exp=StudentClubSubTotal_exp+payableAmt_act;
                StudentClubSubTotal_exp =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubSubTotal_exp));

                if (StudentClubSubTotal_exp>=tier1_val && StudentClubSubTotal_exp<=tier2_val) {
                    Assert.assertEquals(BonusFlatAmt_exp, tier1_val, "Bonus Flat dollars value is incorrect for Tier1");

                } else if (StudentClubSubTotal_exp>=tier3_val && StudentClubSubTotal_exp<=tier4_val) {
                    Assert.assertEquals(BonusFlatAmt_exp, tier2_val, "Bonus Flat dollars value is incorrect for Tier2");
                } else {
                    Assert.fail("Student cubs Total value is unexpected range even when the TopOff amount is added");
                }
            }}
        catch (Exception e) {


            //else if (!Payable_amt_Rewards_Coupons().isDisplayed()) {
            if (StudentClubSubTotal_exp>=tier1_val && StudentClubSubTotal_exp<=tier2_val) {
                Assert.assertEquals(tier1_val, BonusFlatAmt_exp, "Bonus Flat dollars value is incorrect for Tier1");

            } else if (StudentClubSubTotal_exp>=tier3_val && StudentClubSubTotal_exp<=tier4_val) {
                Assert.assertEquals(tier2_val, BonusFlatAmt_exp, "Bonus Flat dollars value is incorrect for Tier2");
            } else {
                Assert.fail("Student cubs Total value is unexpected range without having TopOff amount");
            }
        }

    }

    @Override
    public void Validation_of_Student_club_And_Teacher_Catalogues_Total_in_RewardsCouponsPage() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        String StudentClubPostValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubPostValue = StudentClubPostValue.substring(1);
        double StudentClubPostValue_exp=Double.parseDouble(StudentClubPostValue);
        StudentClubPostValue_exp =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubPostValue_exp));
        System.out.println("############StudentClubPostValue is "+StudentClubPostValue_exp);

        String StudentClubSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubSubTotal = StudentClubSubTotal.substring(1);
        double StudentClubSubTotal_exp=Double.parseDouble(StudentClubSubTotal);

        String GST_value_StudentClub=value_GST_StudentClub_RewardsCouponsPage().getText();
        GST_value_StudentClub = GST_value_StudentClub.substring(1);
        double GST_value_StudentClub_exp=Double.parseDouble(GST_value_StudentClub);

        String PST_value_StudentClub=value_PST_StudentClub_RewardsCouponsPage().getText();
        PST_value_StudentClub = PST_value_StudentClub.substring(1);
        double PST_value_StudentClub_exp=Double.parseDouble(PST_value_StudentClub);

        double StudentClubTotalValue=StudentClubSubTotal_exp+GST_value_StudentClub_exp+PST_value_StudentClub_exp;
        StudentClubTotalValue=StudentClubTotalValue-(TestBaseProvider.getTestBase().getTestData().getDouble("sBonusBank")+TestBaseProvider.getTestBase().getTestData().getDouble("sPaperBank"));
        StudentClubTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubTotalValue));
        System.out.println("############StudentClubTotalValue is "+StudentClubTotalValue);

        Assert.assertEquals(StudentClubPostValue_exp, StudentClubTotalValue, "StudentClubTotalValue is incorrect");
        //////////////////////////////////////////
        PauseUtil.pause(2000);
        String TeacherClubPostValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherClubPostValue = TeacherClubPostValue.substring(1);
        double TeacherClubPostValue_exp=Double.parseDouble(TeacherClubPostValue);
        System.out.println("############TeacherCatalogues Post Value is "+TeacherClubPostValue_exp);

        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_exp=Double.parseDouble(TeacherCatSubTotal);

        String GST_value_TeacherCat=value_GST_TeacherCat_RewardsCouponsPage().getText();
        GST_value_TeacherCat = GST_value_TeacherCat.substring(1);
        double GST_value_TeacherCat_exp=Double.parseDouble(GST_value_TeacherCat);

        String PST_value_TeacherCat=value_PST_TeacherCat_RewardsCouponsPage().getText();
        PST_value_TeacherCat = PST_value_TeacherCat.substring(1);
        double PST_value_TeacherCat_exp=Double.parseDouble(PST_value_TeacherCat);


		double TeacherCataloguesTotalValue=TeacherCatSubTotal_exp+GST_value_TeacherCat_exp+PST_value_TeacherCat_exp;
		TeacherCataloguesTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(TeacherCataloguesTotalValue));
		TeacherCataloguesTotalValue=TeacherCataloguesTotalValue-(TestBaseProvider.getTestBase().getTestData().getDouble("tBonusBank")+TestBaseProvider.getTestBase().getTestData().getDouble("tPaperBank"));
        TeacherCataloguesTotalValue=Double.parseDouble(new DecimalFormat("##.##").format(TeacherCataloguesTotalValue));
		System.out.println("############TeacherCatalogues Total Value is "+TeacherCataloguesTotalValue);

        Assert.assertEquals(TeacherClubPostValue_exp, TeacherCataloguesTotalValue, "TeacherCataloguesTotalValue is incorrect");
        ///////////////////////////////////////////
        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubPostValue_exp+TeacherClubPostValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");

        } else if (!ShippingValue.equals("FREE!")) {

            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_exp=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_exp);
            double Total_owing_exp=StudentClubPostValue_exp+TeacherClubPostValue_exp+ShippingValue_exp;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

            String Total_Owing_Amount_act=Total_Amount_Owing().getText();
            Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
            double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
            Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");
        } */

    }

    @Override
    public void Validation_of_Student_club_Total_in_RewardsCouponsPage() {
        PauseUtil.pause(2000);
        String StudentClubPostValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubPostValue = StudentClubPostValue.substring(1);
        double StudentClubPostValue_exp=Double.parseDouble(StudentClubPostValue);
        System.out.println("############StudentClubPostValue is "+StudentClubPostValue_exp);

        String StudentClubSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubSubTotal = StudentClubSubTotal.substring(1);
        double StudentClubSubTotal_exp=Double.parseDouble(StudentClubSubTotal);

        String GST_value_StudentClub=value_GST_StudentClub_RewardsCouponsPage().getText();
        GST_value_StudentClub = GST_value_StudentClub.substring(1);
        double GST_value_StudentClub_exp=Double.parseDouble(GST_value_StudentClub);

        String PST_value_StudentClub=value_PST_StudentClub_RewardsCouponsPage().getText();
        PST_value_StudentClub = PST_value_StudentClub.substring(1);
        double PST_value_StudentClub_exp=Double.parseDouble(PST_value_StudentClub);

        double StudentClubTotalValue=StudentClubSubTotal_exp+GST_value_StudentClub_exp+PST_value_StudentClub_exp;
        StudentClubTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubTotalValue));
        StudentClubTotalValue=StudentClubTotalValue-(TestBaseProvider.getTestBase().getTestData().getDouble("sBonusBank")+TestBaseProvider.getTestBase().getTestData().getDouble("sPaperBank"));
        System.out.println("############StudentClubTotalValue is "+StudentClubTotalValue);

        Assert.assertEquals(StudentClubPostValue_exp, StudentClubTotalValue, "StudentClubTotalValue is incorrect");

        ///////////////////////////////////////////
        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubPostValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");

        } else if (!ShippingValue.equals("FREE!")) {

            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_exp=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_exp);
            double Total_owing_exp=StudentClubPostValue_exp+ShippingValue_exp;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");
		}*/


		/*PauseUtil.pause(2000);
		String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
		ShippingValue = ShippingValue.substring(1);
		double ShippingValue_exp=Double.parseDouble(ShippingValue);
		System.out.println("############ShippingValue is "+ShippingValue_exp);
		/////////////////////////////////////////////

		double Total_owing_exp=StudentClubPostValue_exp+ShippingValue_exp;

		String Total_Owing_Amount_act=Total_Amount_Owing().getText();
		Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
		double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
		Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");*/
    }

    @Override
    public double Validation_of_no_taxes_charged_Student_club_And_TeacherCatalogues_in_PaymentsPage() {
        PauseUtil.pause(8000);
        String StudentClubPostValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubPostValue = StudentClubPostValue.substring(1);
        double StudentClubPostValue_exp=Double.parseDouble(StudentClubPostValue);
        System.out.println("############StudentClubPostValue is "+StudentClubPostValue_exp);

        String StudentClubSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubSubTotal = StudentClubSubTotal.substring(1);
        double StudentClubSubTotal_exp=Double.parseDouble(StudentClubSubTotal);

        Assert.assertEquals(StudentClubPostValue_exp, StudentClubSubTotal_exp, "Taxes are shown for Student clubs");

        return StudentClubPostValue_exp;
        ///////////////////////////////////////////

    }

    @Override
    public double Validation_of_no_taxes_charged_Student_club_And_TeacherCatalogues_in_PaymentsPage_2() {
        PauseUtil.pause(2000);
        String TeacherCataloguesPostValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherCataloguesPostValue = TeacherCataloguesPostValue.substring(1);
        double TeacherCataloguesPostValue_exp=Double.parseDouble(TeacherCataloguesPostValue);
        System.out.println("############TeacherCataloguesPostValue is "+TeacherCataloguesPostValue_exp);

        String TeacherCataloguesSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCataloguesSubTotal = TeacherCataloguesSubTotal.substring(1);
        double TeacherCataloguesSubTotal_exp=Double.parseDouble(TeacherCataloguesSubTotal);

        Assert.assertEquals(TeacherCataloguesPostValue_exp, TeacherCataloguesSubTotal_exp, "Taxes are shown for Teacher Catalogues");

        return TeacherCataloguesPostValue_exp;
    }

    @Override
    public void Validation_of_no_taxes_charged_Student_club_And_TeacherCatalogues_in_PaymentsPage_Final(double value1, double value2) {
        PauseUtil.pause(8000);
        String StudentClubTotalValue=Total_owing_StudentClub_payment().getText();
        StudentClubTotalValue = StudentClubTotalValue.substring(1);
        double StudentClubTotalValue_exp=Double.parseDouble(StudentClubTotalValue);
        System.out.println("############StudentClub Total owing value is "+StudentClubTotalValue_exp);
        Assert.assertEquals(StudentClubTotalValue_exp, value1, "Taxes are shown for Student clubs");

        String TeacherCatTotalValue=Total_owing_TeacherCatalogues_payment().getText();
        TeacherCatTotalValue = TeacherCatTotalValue.substring(1);
        double TeacherCatTotalValue_exp=Double.parseDouble(TeacherCatTotalValue);
        System.out.println("############TeacherCatalogues Total owing value is "+TeacherCatTotalValue_exp);
        Assert.assertEquals(TeacherCatTotalValue_exp, value2, "Taxes are shown for Teacher Catalogues");
    }

    @Override
    public void Validation_of_Teacher_catalogues_Total_in_RewardsCouponsPage() {
        PauseUtil.pause(2000);
        String TeacherClubPostValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherClubPostValue = TeacherClubPostValue.substring(1);
        //TeacherClubPostValue = TeacherClubPostValue.substring(0,TeacherClubPostValue.length() - 3);
        //TeacherClubPostValue = TeacherClubPostValue.replace(",", ".");
        double TeacherClubPostValue_exp=Double.parseDouble(TeacherClubPostValue);
        System.out.println("############TeacherCatalogues Post Value is "+TeacherClubPostValue_exp);

        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_exp=Double.parseDouble(TeacherCatSubTotal);

        String GST_value_TeacherCat=value_GST_TeacherCat_RewardsCouponsPage().getText();
        GST_value_TeacherCat = GST_value_TeacherCat.substring(1);
        double GST_value_TeacherCat_exp=Double.parseDouble(GST_value_TeacherCat);

        String PST_value_TeacherCat=value_PST_TeacherCat_RewardsCouponsPage().getText();
        PST_value_TeacherCat = PST_value_TeacherCat.substring(1);
        double PST_value_TeacherCat_exp=Double.parseDouble(PST_value_TeacherCat);

        double TeacherCataloguesTotalValue1=TeacherCatSubTotal_exp+GST_value_TeacherCat_exp+PST_value_TeacherCat_exp;

        double TeacherCataloguesTotalValue11 = TaxRoundOff(TeacherCataloguesTotalValue1);

        //TeacherCataloguesTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(TeacherCataloguesTotalValue));
        double TeacherCataloguesTotalValue12=TeacherCataloguesTotalValue11-(TestBaseProvider.getTestBase().getTestData().getDouble("tBonusBank")+TestBaseProvider.getTestBase().getTestData().getDouble("tPaperBank"));
        double TeacherCataloguesTotalValue = TaxRoundOff(TeacherCataloguesTotalValue12);

        System.out.println("############TeacherCatalogues Total Value is "+TeacherCataloguesTotalValue);

        Assert.assertEquals(TeacherClubPostValue_exp, TeacherCataloguesTotalValue, "TeacherCataloguesTotalValue is incorrect");
        ///////////////////////////////////////////
        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=TeacherClubPostValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");

        } else if (!ShippingValue.equals("FREE!")) {

            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_exp=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_exp);
            double Total_owing_exp=TeacherClubPostValue_exp+ShippingValue_exp;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");
		}*/

		/*PauseUtil.pause(2000);
		String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
		ShippingValue = ShippingValue.substring(1);
		double ShippingValue_exp=Double.parseDouble(ShippingValue);
		System.out.println("############ShippingValue is "+ShippingValue_exp);
		/////////////////////////////////////////////

		double Total_owing_exp=TeacherClubPostValue_exp+ShippingValue_exp;

		String Total_Owing_Amount_act=Total_Amount_Owing().getText();
		Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
		double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
		Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");*/
    }

    @Override
    public boolean Validation_alternate_shipping_displayed_in_PaymentsPage() {
        PauseUtil.pause(6000);
        if(chkBox_alternateShipping_Payment().isDisplayed() )
            return true;
        else
            return false;
    }

    @Override
    public void Select_Alternate_Shipping_Address_in_Payment_Page(){
        PauseUtil.pause(3000);
        chkBox_alternateShipping_Payment().click();
    }


    @Override
    public void Select_Alternate_Shipping_Address_Enters_Postalcode_City_Province(){
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(3000);
        chkBox_alternateShipping_Payment().click();
        PauseUtil.pause(1500);
        getfld_alternativeshipping_postalcode().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("postalcode"));
        PauseUtil.pause(1500);
        getfld_alternativeshipping_city().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("city"));
        PauseUtil.pause(1500);
        SCHUtils.selectOptionByVisibleText(getfld_alternativeshipping_province(), TestBaseProvider.getTestBase().getTestData().getString("state"));
        PauseUtil.pause(2000);
        SCHUtils.selectOptionByVisibleText(getfld_alternativeshipping_country(), TestBaseProvider.getTestBase().getTestData().getString("country"));
        PauseUtil.pause(1500);
    }


    @Override
    public void Label_Alternate_Shipping(){
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(3000);
        AssertUtils.assertTextMatches(lbl_alternateShipping_Payment(),
                Matchers.containsString(ConstantUtils.ALTERNATIVESHIPPING_LABEL));

    }


    @Override
    public void Select_Alternate_Shipping_Address_Enters_Address1_Postalcode_City_Province(){
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(3000);
        chkBox_alternateShipping_Payment().click();
        PauseUtil.pause(1500);
        getfld_alternativeshipping_address1().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("address1"));;
        PauseUtil.pause(1500);
        getfld_alternativeshipping_postalcode().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("postalcode"));;
        PauseUtil.pause(1500);
        getfld_alternativeshipping_city().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("city"));;
        PauseUtil.pause(1500);
        SCHUtils.selectOptionByVisibleText(getfld_alternativeshipping_province(), TestBaseProvider.getTestBase().getTestData().getString("state"));
        PauseUtil.pause(2000);
        SCHUtils.selectOptionByVisibleText(getfld_alternativeshipping_country(), TestBaseProvider.getTestBase().getTestData().getString("country"));
        PauseUtil.pause(1500);
    }



    @Override
    public void Select_Alternate_Shipping_Address_Enters_Address1_City_Province(){
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(3000);
        chkBox_alternateShipping_Payment().click();
        PauseUtil.pause(1500);
        getfld_alternativeshipping_address1().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("address1"));
        PauseUtil.pause(1500);
        getfld_alternativeshipping_address2().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("address2"));
        PauseUtil.pause(1500);
        getfld_alternativeshipping_city().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("city"));
        PauseUtil.pause(1500);
        SCHUtils.selectOptionByVisibleText(getfld_alternativeshipping_province(), TestBaseProvider.getTestBase().getTestData().getString("state"));
        PauseUtil.pause(2000);
        SCHUtils.selectOptionByVisibleText(getfld_alternativeshipping_country(), TestBaseProvider.getTestBase().getTestData().getString("country"));
        PauseUtil.pause(1500);
    }

    @Override
    public void verify_DTS_itemid_ConfirmSubmitPage() {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(5000);

        String ActualItemId =getsectioncouponitemidconfirmsubmitpage().getText();
        String expected_ItemId =    TestBaseProvider.getTestBase().getContext().getProperty("testexecution.selectedItemId").toString();
        System.out.println("Actual freepick item id:"+ActualItemId);
        System.out.println("Expected freepick item id:"+expected_ItemId);
        if(!ActualItemId.equals(expected_ItemId))
        {
            Assert.fail("Application Issue. DTS item id is not the same in confirmsubmit page");
        }


    }




    @Override
    public void Select_Alternate_Shipping_Address_Enters_Address1_Postalcode_Province(){
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(3000);
        chkBox_alternateShipping_Payment().click();
        PauseUtil.pause(1500);
        getfld_alternativeshipping_address1().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("address1"));;
        PauseUtil.pause(1500);
        getfld_alternativeshipping_address2().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("address2"));;
        PauseUtil.pause(1500);
        getfld_alternativeshipping_postalcode().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("postalcode"));;
        PauseUtil.pause(1500);
        SCHUtils.selectOptionByVisibleText(getfld_alternativeshipping_province(), TestBaseProvider.getTestBase().getTestData().getString("state"));
        PauseUtil.pause(2000);
        SCHUtils.selectOptionByVisibleText(getfld_alternativeshipping_country(), TestBaseProvider.getTestBase().getTestData().getString("country"));
        PauseUtil.pause(1500);
    }




    @Override
    public void Select_Alternate_Shipping_Address_Enters_Address1_City_Postalcode(){
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(3000);
        chkBox_alternateShipping_Payment().click();
        PauseUtil.pause(1500);
        getfld_alternativeshipping_address1().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("address1"));;
        PauseUtil.pause(1500);
        getfld_alternativeshipping_address2().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("address2"));;
        PauseUtil.pause(1500);
        getfld_alternativeshipping_city().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("city"));;
        PauseUtil.pause(1500);
        getfld_alternativeshipping_postalcode().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("postalcode"));;
        PauseUtil.pause(1500);
        SCHUtils.selectOptionByVisibleText(getfld_alternativeshipping_country(), TestBaseProvider.getTestBase().getTestData().getString("country"));
        PauseUtil.pause(1500);
    }

    @Override
    public void Validation_of_Teacher_catalogues_Total_in_RewardsCouponsPage_gst_qst() {
        PauseUtil.pause(2000);
        String TeacherClubPostValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherClubPostValue = TeacherClubPostValue.substring(1);
        double TeacherClubPostValue_exp=Double.parseDouble(TeacherClubPostValue);
        System.out.println("############TeacherCatalogues Post Value is "+TeacherClubPostValue_exp);

        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_exp=Double.parseDouble(TeacherCatSubTotal);

        String GST_value_TeacherCat=value_GST_TeacherCat_RewardsCouponsPage().getText();
        GST_value_TeacherCat = GST_value_TeacherCat.substring(1);
        double GST_value_TeacherCat_exp=Double.parseDouble(GST_value_TeacherCat);

        String QST_value_TeacherCat=value_QST_TeacherCat_RewardsCouponsPage().getText();
        QST_value_TeacherCat = QST_value_TeacherCat.substring(1);
        double QST_value_TeacherCat_exp=Double.parseDouble(QST_value_TeacherCat);

        double TeacherCataloguesTotalValue=TeacherCatSubTotal_exp+GST_value_TeacherCat_exp+QST_value_TeacherCat_exp;
        TeacherCataloguesTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(TeacherCataloguesTotalValue));
        TeacherCataloguesTotalValue=TeacherCataloguesTotalValue-(TestBaseProvider.getTestBase().getTestData().getDouble("tBonusBank")+TestBaseProvider.getTestBase().getTestData().getDouble("tPaperBank"));
        TeacherCataloguesTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(TeacherCataloguesTotalValue));
        System.out.println("############TeacherCatalogues Total Value is "+TeacherCataloguesTotalValue);

        Assert.assertEquals(TeacherClubPostValue_exp, TeacherCataloguesTotalValue, "TeacherCataloguesTotalValue is incorrect");
        ///////////////////////////////////////////
        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=TeacherClubPostValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_exp=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_exp);
            double Total_owing_exp=TeacherClubPostValue_exp+ShippingValue_exp;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");
		}*/

		/*PauseUtil.pause(2000);
		String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
		ShippingValue = ShippingValue.substring(1);
		double ShippingValue_exp=Double.parseDouble(ShippingValue);
		System.out.println("############ShippingValue is "+ShippingValue_exp);
		/////////////////////////////////////////////

		double Total_owing_exp=TeacherClubPostValue_exp+ShippingValue_exp;

		String Total_Owing_Amount_act=Total_Amount_Owing().getText();
		Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
		double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
		Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");*/
    }

    @Override
    public void Validation_of_Student_club_Total_in_RewardsCouponsPage_gst_qst() {
        PauseUtil.pause(2000);
        String StudentClubPostValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubPostValue = StudentClubPostValue.substring(1);
        double StudentClubPostValue_exp=Double.parseDouble(StudentClubPostValue);
        System.out.println("############StudentClubPostValue is "+StudentClubPostValue_exp);

        String StudentClubSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubSubTotal = StudentClubSubTotal.substring(1);
        double StudentClubSubTotal_exp=Double.parseDouble(StudentClubSubTotal);

        String GST_value_StudentClub=value_GST_StudentClub_RewardsCouponsPage().getText();
        GST_value_StudentClub = GST_value_StudentClub.substring(1);
        double GST_value_StudentClub_exp=Double.parseDouble(GST_value_StudentClub);

        String QST_value_StudentClub=value_QST_StudentClub_RewardsCouponsPage().getText();
        QST_value_StudentClub = QST_value_StudentClub.substring(1);
        double QST_value_StudentClub_exp=Double.parseDouble(QST_value_StudentClub);

        double StudentClubTotalValue=StudentClubSubTotal_exp+GST_value_StudentClub_exp+QST_value_StudentClub_exp;
        StudentClubTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubTotalValue));
        StudentClubTotalValue=StudentClubTotalValue-(TestBaseProvider.getTestBase().getTestData().getDouble("sBonusBank")+TestBaseProvider.getTestBase().getTestData().getDouble("sPaperBank"));
        StudentClubTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubTotalValue));
        System.out.println("############StudentClubTotalValue is "+StudentClubTotalValue);

        Assert.assertEquals(StudentClubPostValue_exp, StudentClubTotalValue, "StudentClubTotalValue is incorrect");

        ///////////////////////////////////////////
        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubPostValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_exp=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_exp);
            double Total_owing_exp=StudentClubPostValue_exp+ShippingValue_exp;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");
		}*/


		/*PauseUtil.pause(2000);
		String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
		ShippingValue = ShippingValue.substring(1);
		double ShippingValue_exp=Double.parseDouble(ShippingValue);
		System.out.println("############ShippingValue is "+ShippingValue_exp);
		/////////////////////////////////////////////

		double Total_owing_exp=StudentClubPostValue_exp+ShippingValue_exp;

		String Total_Owing_Amount_act=Total_Amount_Owing().getText();
		Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
		double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
		Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");*/
    }

    @Override
    public void Validation_of_Student_club_And_Teacher_Catalogues_Total_in_RewardsCouponsPage_gst_qst() {
        PauseUtil.pause(2000);
        String StudentClubPostValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubPostValue = StudentClubPostValue.substring(1);
        double StudentClubPostValue_exp=Double.parseDouble(StudentClubPostValue);
        System.out.println("############StudentClubPostValue is "+StudentClubPostValue_exp);

        String StudentClubSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubSubTotal = StudentClubSubTotal.substring(1);
        double StudentClubSubTotal_exp=Double.parseDouble(StudentClubSubTotal);

        String GST_value_StudentClub=value_GST_StudentClub_RewardsCouponsPage().getText();
        GST_value_StudentClub = GST_value_StudentClub.substring(1);
        double GST_value_StudentClub_exp=Double.parseDouble(GST_value_StudentClub);

        String QST_value_StudentClub=value_QST_StudentClub_RewardsCouponsPage().getText();
        QST_value_StudentClub = QST_value_StudentClub.substring(1);
        double QST_value_StudentClub_exp=Double.parseDouble(QST_value_StudentClub);

        double StudentClubTotalValue=StudentClubSubTotal_exp+GST_value_StudentClub_exp+QST_value_StudentClub_exp;
        StudentClubTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubTotalValue));
        StudentClubTotalValue=StudentClubTotalValue-(TestBaseProvider.getTestBase().getTestData().getDouble("sBonusBank")+TestBaseProvider.getTestBase().getTestData().getDouble("sPaperBank"));
        StudentClubTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubTotalValue));
        System.out.println("############StudentClubTotalValue is "+StudentClubTotalValue);

        Assert.assertEquals(StudentClubPostValue_exp, StudentClubTotalValue, "StudentClubTotalValue is incorrect");
        //////////////////////////////////////////
        PauseUtil.pause(2000);
        String TeacherClubPostValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherClubPostValue = TeacherClubPostValue.substring(1);
        double TeacherClubPostValue_exp=Double.parseDouble(TeacherClubPostValue);
        TeacherClubPostValue_exp =Double.parseDouble(new DecimalFormat("##.##").format(TeacherClubPostValue_exp));
        System.out.println("############TeacherCatalogues Post Value is "+TeacherClubPostValue_exp);

        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_exp=Double.parseDouble(TeacherCatSubTotal);

        String GST_value_TeacherCat=value_GST_TeacherCat_RewardsCouponsPage().getText();
        GST_value_TeacherCat = GST_value_TeacherCat.substring(1);
        double GST_value_TeacherCat_exp=Double.parseDouble(GST_value_TeacherCat);

        String QST_value_TeacherCat=value_QST_TeacherCat_RewardsCouponsPage().getText();
        QST_value_TeacherCat = QST_value_TeacherCat.substring(1);
        double QST_value_TeacherCat_exp=Double.parseDouble(QST_value_TeacherCat);

        double TeacherCataloguesTotalValue=TeacherCatSubTotal_exp+GST_value_TeacherCat_exp+QST_value_TeacherCat_exp;
        TeacherCataloguesTotalValue=TeacherCataloguesTotalValue-(TestBaseProvider.getTestBase().getTestData().getDouble("tBonusBank")+TestBaseProvider.getTestBase().getTestData().getDouble("tPaperBank"));
        TeacherCataloguesTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(TeacherCataloguesTotalValue));
        System.out.println("############TeacherCatalogues Total Value is "+TeacherCataloguesTotalValue);

        Assert.assertEquals(TeacherClubPostValue_exp, TeacherCataloguesTotalValue, "TeacherCataloguesTotalValue is incorrect");
        ///////////////////////////////////////////
        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubPostValue_exp+TeacherClubPostValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));
			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");

        } else if (!ShippingValue.equals("FREE!")) {

            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_exp=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_exp);
            double Total_owing_exp=StudentClubPostValue_exp+TeacherClubPostValue_exp+ShippingValue_exp;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));
			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");
		}*/ 

		/*PauseUtil.pause(2000);
		String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
		ShippingValue = ShippingValue.substring(1);
		double ShippingValue_exp=Double.parseDouble(ShippingValue);
		System.out.println("############ShippingValue is "+ShippingValue_exp);
		/////////////////////////////////////////////

		double Total_owing_exp=StudentClubPostValue_exp+TeacherClubPostValue_exp+ShippingValue_exp;

		String Total_Owing_Amount_act=Total_Amount_Owing().getText();
		Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
		double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
		Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");*/

    }

    @Override
    public void Validation_of_Student_club_And_Teacher_Catalogues_Total_in_RewardsCouponsPage_hst() {
        PauseUtil.pause(2000);
        String StudentClubPostValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubPostValue = StudentClubPostValue.substring(1);
        double StudentClubPostValue_exp=Double.parseDouble(StudentClubPostValue);
        System.out.println("############StudentClubPostValue is "+StudentClubPostValue_exp);

        String StudentClubSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubSubTotal = StudentClubSubTotal.substring(1);
        double StudentClubSubTotal_exp=Double.parseDouble(StudentClubSubTotal);

        String HST_value_StudentClub=value_HST_StudentClub_RewardsCouponsPage().getText();
        HST_value_StudentClub = HST_value_StudentClub.substring(1);
        double HST_value_StudentClub_exp=Double.parseDouble(HST_value_StudentClub);

        double StudentClubTotalValue=StudentClubSubTotal_exp+HST_value_StudentClub_exp;
        StudentClubTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubTotalValue));
        StudentClubTotalValue=StudentClubTotalValue-(TestBaseProvider.getTestBase().getTestData().getDouble("sBonusBank")+TestBaseProvider.getTestBase().getTestData().getDouble("sPaperBank"));
        StudentClubTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubTotalValue));
        System.out.println("############StudentClubTotalValue is "+StudentClubTotalValue);

        Assert.assertEquals(StudentClubPostValue_exp, StudentClubTotalValue, "StudentClubTotalValue is incorrect");
        //////////////////////////////////////////
        PauseUtil.pause(2000);
        String TeacherClubPostValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherClubPostValue = TeacherClubPostValue.substring(1);
        double TeacherClubPostValue_exp=Double.parseDouble(TeacherClubPostValue);
        System.out.println("############TeacherCatalogues Post Value is "+TeacherClubPostValue_exp);

        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_exp=Double.parseDouble(TeacherCatSubTotal);

        String HST_value_TeacherCat=value_HST_TeacherCat_RewardsCouponsPage().getText();
        HST_value_TeacherCat = HST_value_TeacherCat.substring(1);
        double HST_value_TeacherCat_exp=Double.parseDouble(HST_value_TeacherCat);

        double TeacherCataloguesTotalValue=TeacherCatSubTotal_exp+HST_value_TeacherCat_exp;
        TeacherCataloguesTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(TeacherCataloguesTotalValue));
        TeacherCataloguesTotalValue=TeacherCataloguesTotalValue-(TestBaseProvider.getTestBase().getTestData().getDouble("tBonusBank")+TestBaseProvider.getTestBase().getTestData().getDouble("tPaperBank"));
        TeacherCataloguesTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(TeacherCataloguesTotalValue));
        System.out.println("############TeacherCatalogues Total Value is "+TeacherCataloguesTotalValue);

        Assert.assertEquals(TeacherClubPostValue_exp, TeacherCataloguesTotalValue, "TeacherCataloguesTotalValue is incorrect");
        ///////////////////////////////////////////
        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubPostValue_exp+TeacherClubPostValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));
			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_exp=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_exp);
            double Total_owing_exp=StudentClubPostValue_exp+TeacherClubPostValue_exp+ShippingValue_exp;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");
		}*/ 

		/*PauseUtil.pause(2000);
		String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
		ShippingValue = ShippingValue.substring(1);
		double ShippingValue_exp=Double.parseDouble(ShippingValue);
		System.out.println("############ShippingValue is "+ShippingValue_exp);
		/////////////////////////////////////////////

		double Total_owing_exp=StudentClubPostValue_exp+TeacherClubPostValue_exp+ShippingValue_exp;

		String Total_Owing_Amount_act=Total_Amount_Owing().getText();
		Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
		double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
		Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");*/

    }

    @Override
    public void Validation_of_Student_club_Total_in_RewardsCouponsPage_hst() {
        PauseUtil.pause(2000);
        String StudentClubPostValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubPostValue = StudentClubPostValue.substring(1);
        double StudentClubPostValue_exp=Double.parseDouble(StudentClubPostValue);
        System.out.println("############StudentClubPostValue is "+StudentClubPostValue_exp);

        String StudentClubSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubSubTotal = StudentClubSubTotal.substring(1);
        double StudentClubSubTotal_exp=Double.parseDouble(StudentClubSubTotal);

        String HST_value_StudentClub=value_HST_StudentClub_RewardsCouponsPage().getText();
        HST_value_StudentClub = HST_value_StudentClub.substring(1);
        double HST_value_StudentClub_exp=Double.parseDouble(HST_value_StudentClub);

        double StudentClubTotalValue=StudentClubSubTotal_exp+HST_value_StudentClub_exp;
        //StudentClubTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubTotalValue));
        StudentClubTotalValue =TaxRoundOff(StudentClubTotalValue);
        StudentClubTotalValue=StudentClubTotalValue-(TestBaseProvider.getTestBase().getTestData().getDouble("sBonusBank")+TestBaseProvider.getTestBase().getTestData().getDouble("sPaperBank"));
        StudentClubTotalValue =TaxRoundOff(StudentClubTotalValue);
        System.out.println("############StudentClubTotalValue is "+StudentClubTotalValue);

        Assert.assertEquals(StudentClubPostValue_exp, StudentClubTotalValue, "StudentClubTotalValue is incorrect");

        ///////////////////////////////////////////
        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubPostValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_exp=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_exp);
            double Total_owing_exp=StudentClubPostValue_exp+ShippingValue_exp;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");
		}*/

		/*PauseUtil.pause(2000);
		String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
		ShippingValue = ShippingValue.substring(1);
		double ShippingValue_exp=Double.parseDouble(ShippingValue);
		System.out.println("############ShippingValue is "+ShippingValue_exp);
		/////////////////////////////////////////////

		double Total_owing_exp=StudentClubPostValue_exp+ShippingValue_exp;

		String Total_Owing_Amount_act=Total_Amount_Owing().getText();
		Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
		double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
		Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");*/
    }

    @Override
    public void Validation_of_Teacher_catalogues_Total_in_RewardsCouponsPage_hst() {
        PauseUtil.pause(2000);
        String TeacherClubPostValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherClubPostValue = TeacherClubPostValue.substring(1);
        double TeacherClubPostValue_exp=Double.parseDouble(TeacherClubPostValue);
        System.out.println("############TeacherCatalogues Post Value is "+TeacherClubPostValue_exp);

        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_exp=Double.parseDouble(TeacherCatSubTotal);

        String HST_value_TeacherCat=value_HST_TeacherCat_RewardsCouponsPage().getText();
        HST_value_TeacherCat = HST_value_TeacherCat.substring(1);
        double HST_value_TeacherCat_exp=Double.parseDouble(HST_value_TeacherCat);

        double TeacherCataloguesTotalValue=TeacherCatSubTotal_exp+HST_value_TeacherCat_exp;
        TeacherCataloguesTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(TeacherCataloguesTotalValue));
        TeacherCataloguesTotalValue=TeacherCataloguesTotalValue-(TestBaseProvider.getTestBase().getTestData().getDouble("tBonusBank")+TestBaseProvider.getTestBase().getTestData().getDouble("tPaperBank"));
        TeacherCataloguesTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(TeacherCataloguesTotalValue));
        System.out.println("############TeacherCatalogues Total Value is "+TeacherCataloguesTotalValue);

        Assert.assertEquals(TeacherClubPostValue_exp, TeacherCataloguesTotalValue, "TeacherCataloguesTotalValue is incorrect");
        ///////////////////////////////////////////
        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=TeacherClubPostValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");

        } else if (!ShippingValue.equals("FREE!")) {

            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_exp=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_exp);
            double Total_owing_exp=TeacherClubPostValue_exp+ShippingValue_exp;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));
			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");
		}*/

		/*PauseUtil.pause(2000);
		String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
		ShippingValue = ShippingValue.substring(1);
		double ShippingValue_exp=Double.parseDouble(ShippingValue);
		System.out.println("############ShippingValue is "+ShippingValue_exp);
		/////////////////////////////////////////////

		double Total_owing_exp=TeacherClubPostValue_exp+ShippingValue_exp;

		String Total_Owing_Amount_act=Total_Amount_Owing().getText();
		Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
		double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
		Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");*/
    }

    @Override
    public void Validation_of_Student_club_Total_in_RewardsCouponsPage_gst() {
        PauseUtil.pause(2000);
        String StudentClubPostValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubPostValue = StudentClubPostValue.substring(1);
        double StudentClubPostValue_exp=Double.parseDouble(StudentClubPostValue);
        System.out.println("############StudentClubPostValue is "+StudentClubPostValue_exp);

        String StudentClubSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubSubTotal = StudentClubSubTotal.substring(1);
        double StudentClubSubTotal_exp=Double.parseDouble(StudentClubSubTotal);

        String GST_value_StudentClub=value_GST_StudentClub_RewardsCouponsPage().getText();
        GST_value_StudentClub = GST_value_StudentClub.substring(1);
        double GST_value_StudentClub_exp=Double.parseDouble(GST_value_StudentClub);

        double StudentClubTotalValue=StudentClubSubTotal_exp+GST_value_StudentClub_exp;
        StudentClubTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubTotalValue));
        StudentClubTotalValue=StudentClubTotalValue-(TestBaseProvider.getTestBase().getTestData().getDouble("sBonusBank")+TestBaseProvider.getTestBase().getTestData().getDouble("sPaperBank"));
        StudentClubTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubTotalValue));
        System.out.println("############StudentClubTotalValue is "+StudentClubTotalValue);

        Assert.assertEquals(StudentClubPostValue_exp, StudentClubTotalValue, "StudentClubTotalValue is incorrect");

        ///////////////////////////////////////////
        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubPostValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_exp=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_exp);
            double Total_owing_exp=StudentClubPostValue_exp+ShippingValue_exp;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));
			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");
		}*/

		/*PauseUtil.pause(2000);
		String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
		ShippingValue = ShippingValue.substring(1);
		double ShippingValue_exp=Double.parseDouble(ShippingValue);
		System.out.println("############ShippingValue is "+ShippingValue_exp);
		/////////////////////////////////////////////

		double Total_owing_exp=StudentClubPostValue_exp+ShippingValue_exp;

		String Total_Owing_Amount_act=Total_Amount_Owing().getText();
		Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
		double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
		Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");*/
    }

    @Override
    public void Validation_of_Teacher_catalogues_Total_in_RewardsCouponsPage_gst() {
        PauseUtil.pause(2000);
        String TeacherClubPostValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherClubPostValue = TeacherClubPostValue.substring(1);
        double TeacherClubPostValue_exp=Double.parseDouble(TeacherClubPostValue);
        System.out.println("############TeacherCatalogues Post Value is "+TeacherClubPostValue_exp);

        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_exp=Double.parseDouble(TeacherCatSubTotal);

        String GST_value_TeacherCat=value_GST_TeacherCat_RewardsCouponsPage().getText();
        GST_value_TeacherCat = GST_value_TeacherCat.substring(1);
        double GST_value_TeacherCat_exp=Double.parseDouble(GST_value_TeacherCat);

        double TeacherCataloguesTotalValue=TeacherCatSubTotal_exp+GST_value_TeacherCat_exp;
        TeacherCataloguesTotalValue=TeacherCataloguesTotalValue-(TestBaseProvider.getTestBase().getTestData().getDouble("tBonusBank")+TestBaseProvider.getTestBase().getTestData().getDouble("tPaperBank"));
        TeacherCataloguesTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(TeacherCataloguesTotalValue));
        System.out.println("############TeacherCatalogues Total Value is "+TeacherCataloguesTotalValue);

        Assert.assertEquals(TeacherClubPostValue_exp, TeacherCataloguesTotalValue, "TeacherCataloguesTotalValue is incorrect");
        ///////////////////////////////////////////
        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=TeacherClubPostValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_exp=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_exp);
            double Total_owing_exp=TeacherClubPostValue_exp+ShippingValue_exp;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));
			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");
		}*/

		/*PauseUtil.pause(2000);
		String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
		ShippingValue = ShippingValue.substring(1);
		double ShippingValue_exp=Double.parseDouble(ShippingValue);
		System.out.println("############ShippingValue is "+ShippingValue_exp);
		/////////////////////////////////////////////

		double Total_owing_exp=TeacherClubPostValue_exp+ShippingValue_exp;

		String Total_Owing_Amount_act=Total_Amount_Owing().getText();
		Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
		double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
		Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");*/
    }

    @Override
    public void Validation_of_Student_club_And_Teacher_Catalogues_Total_in_RewardsCouponsPage_gst_hst() {
        PauseUtil.pause(2000);
        String StudentClubPostValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubPostValue = StudentClubPostValue.substring(1);
        double StudentClubPostValue_exp=Double.parseDouble(StudentClubPostValue);
        System.out.println("############StudentClubPostValue is "+StudentClubPostValue_exp);

        String StudentClubSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubSubTotal = StudentClubSubTotal.substring(1);
        double StudentClubSubTotal_exp=Double.parseDouble(StudentClubSubTotal);

        String GST_value_StudentClub=value_GST_StudentClub_RewardsCouponsPage().getText();
        GST_value_StudentClub = GST_value_StudentClub.substring(1);
        double GST_value_StudentClub_exp=Double.parseDouble(GST_value_StudentClub);

        String HST_value_StudentClub=value_HST_StudentClub_RewardsCouponsPage().getText();
        HST_value_StudentClub = HST_value_StudentClub.substring(1);
        double HST_value_StudentClub_exp=Double.parseDouble(HST_value_StudentClub);
        System.out.println();

        double StudentClubTotalValue=StudentClubSubTotal_exp+GST_value_StudentClub_exp+HST_value_StudentClub_exp;
        StudentClubTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubTotalValue));
        StudentClubTotalValue=StudentClubTotalValue-(TestBaseProvider.getTestBase().getTestData().getDouble("sBonusBank")+TestBaseProvider.getTestBase().getTestData().getDouble("sPaperBank"));
        System.out.println("############StudentClubTotalValue is "+StudentClubTotalValue);

        Assert.assertEquals(StudentClubPostValue_exp, StudentClubTotalValue, "StudentClubTotalValue is incorrect");
        //////////////////////////////////////////
        PauseUtil.pause(2000);
        String TeacherClubPostValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherClubPostValue = TeacherClubPostValue.substring(1);
        double TeacherClubPostValue_exp=Double.parseDouble(TeacherClubPostValue);
        System.out.println("############TeacherCatalogues Post Value is "+TeacherClubPostValue_exp);

        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_exp=Double.parseDouble(TeacherCatSubTotal);

        String GST_value_TeacherCat=value_GST_TeacherCat_RewardsCouponsPage().getText();
        GST_value_TeacherCat = GST_value_TeacherCat.substring(1);
        double GST_value_TeacherCat_exp=Double.parseDouble(GST_value_TeacherCat);

        String HST_value_TeacherCat=value_HST_TeacherCat_RewardsCouponsPage().getText();
        HST_value_TeacherCat = HST_value_TeacherCat.substring(1);
        double HST_value_TeacherCat_exp=Double.parseDouble(HST_value_TeacherCat);

        double TeacherCataloguesTotalValue=TeacherCatSubTotal_exp+GST_value_TeacherCat_exp+HST_value_TeacherCat_exp;
        TeacherCataloguesTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(TeacherCataloguesTotalValue));
        TeacherCataloguesTotalValue=TeacherCataloguesTotalValue-(TestBaseProvider.getTestBase().getTestData().getDouble("tBonusBank")+TestBaseProvider.getTestBase().getTestData().getDouble("tPaperBank"));
        System.out.println("############TeacherCatalogues Total Value is "+TeacherCataloguesTotalValue);

        Assert.assertEquals(TeacherClubPostValue_exp, TeacherCataloguesTotalValue, "TeacherCataloguesTotalValue is incorrect");
        ///////////////////////////////////////////
        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubPostValue_exp+TeacherClubPostValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_exp=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_exp);
            double Total_owing_exp=StudentClubPostValue_exp+TeacherClubPostValue_exp+ShippingValue_exp;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));
			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");
		}*/ 

		/*PauseUtil.pause(2000);
		String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
		ShippingValue = ShippingValue.substring(1);
		double ShippingValue_exp=Double.parseDouble(ShippingValue);
		System.out.println("############ShippingValue is "+ShippingValue_exp);
		/////////////////////////////////////////////

		double Total_owing_exp=StudentClubPostValue_exp+TeacherClubPostValue_exp+ShippingValue_exp;

		String Total_Owing_Amount_act=Total_Amount_Owing().getText();
		Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
		double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
		Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");*/

    }

    @Override
    public void Validation_of_Student_club_And_Teacher_Catalogues_Total_in_RewardsCouponsPage_gst() {
        PauseUtil.pause(2000);
        String StudentClubPostValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubPostValue = StudentClubPostValue.substring(1);
        double StudentClubPostValue_exp=Double.parseDouble(StudentClubPostValue);
        System.out.println("############StudentClubPostValue is "+StudentClubPostValue_exp);

        String StudentClubSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubSubTotal = StudentClubSubTotal.substring(1);
        double StudentClubSubTotal_exp=Double.parseDouble(StudentClubSubTotal);

        String GST_value_StudentClub=value_GST_StudentClub_RewardsCouponsPage().getText();
        GST_value_StudentClub = GST_value_StudentClub.substring(1);
        double GST_value_StudentClub_exp=Double.parseDouble(GST_value_StudentClub);

        double StudentClubTotalValue=StudentClubSubTotal_exp+GST_value_StudentClub_exp;
        StudentClubTotalValue=StudentClubTotalValue-(TestBaseProvider.getTestBase().getTestData().getDouble("sBonusBank")+TestBaseProvider.getTestBase().getTestData().getDouble("sPaperBank"));
        StudentClubTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubTotalValue));
        System.out.println("############StudentClubTotalValue is "+StudentClubTotalValue);

        Assert.assertEquals(StudentClubPostValue_exp, StudentClubTotalValue, "StudentClubTotalValue is incorrect");
        //////////////////////////////////////////
        PauseUtil.pause(2000);
        String TeacherClubPostValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherClubPostValue = TeacherClubPostValue.substring(1);
        double TeacherClubPostValue_exp=Double.parseDouble(TeacherClubPostValue);
        System.out.println("############TeacherCatalogues Post Value is "+TeacherClubPostValue_exp);

        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_exp=Double.parseDouble(TeacherCatSubTotal);

        String GST_value_TeacherCat=value_GST_TeacherCat_RewardsCouponsPage().getText();
        GST_value_TeacherCat = GST_value_TeacherCat.substring(1);
        double GST_value_TeacherCat_exp=Double.parseDouble(GST_value_TeacherCat);


        double TeacherCataloguesTotalValue=TeacherCatSubTotal_exp+GST_value_TeacherCat_exp;
        TeacherCataloguesTotalValue=TeacherCataloguesTotalValue-(TestBaseProvider.getTestBase().getTestData().getDouble("tBonusBank")+TestBaseProvider.getTestBase().getTestData().getDouble("tPaperBank"));
        TeacherCataloguesTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(TeacherCataloguesTotalValue));
        System.out.println("############TeacherCatalogues Total Value is "+TeacherCataloguesTotalValue);

        Assert.assertEquals(TeacherClubPostValue_exp, TeacherCataloguesTotalValue, "TeacherCataloguesTotalValue is incorrect");
        ///////////////////////////////////////////
        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubPostValue_exp+TeacherClubPostValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));
			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_exp=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_exp);
            double Total_owing_exp=StudentClubPostValue_exp+TeacherClubPostValue_exp+ShippingValue_exp;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));
			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");
		}*/ 

    }

    @Override
    public void edit_of_Student_Bonus_Bank_and_paper_coupons() {
        PauseUtil.pause(2000);
        btnSkip1().click();
        PauseUtil.pause(2000);
        fld_StudentClub_BonusBank().click();
        fld_StudentClub_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_StudentClub_BonusBank().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("sBonusBankEdit"));
        PauseUtil.pause(2000);
        fld_StudentClub_PaperBonus().click();
        fld_StudentClub_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_StudentClub_PaperBonus().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("sPaperBankEdit"));
        PauseUtil.pause(2000);
        btnSkip1().click();

    }

    @Override
    public void edit_of_Teacher_Bonus_Bank_and_paper_coupons() {
        PauseUtil.pause(2000);
        btnSkip3().click();
        PauseUtil.pause(2000);
        fld_TeacherCat_BonusBank().click();
        fld_TeacherCat_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_TeacherCat_BonusBank().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("tBonusBankEdit"));
        PauseUtil.pause(2000);
        fld_TeacherCat_PaperBonus().click();
        fld_TeacherCat_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_TeacherCat_PaperBonus().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("tPaperBankEdit"));
        PauseUtil.pause(2000);
        btnSkip3().click();
    }

    @Override
    public void Validation_of_updated_Student_club_And_Teacher_Catalogues_Total_in_RewardsCouponsPage() {
        PauseUtil.pause(2000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        String StudentClubPostValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubPostValue = StudentClubPostValue.substring(1);
        double StudentClubPostValue_exp=Double.parseDouble(StudentClubPostValue);
        System.out.println("############StudentClubPostValue is "+StudentClubPostValue_exp);

        String StudentClubSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubSubTotal = StudentClubSubTotal.substring(1);
        double StudentClubSubTotal_exp=Double.parseDouble(StudentClubSubTotal);

        String GST_value_StudentClub=value_GST_StudentClub_RewardsCouponsPage().getText();
        GST_value_StudentClub = GST_value_StudentClub.substring(1);
        double GST_value_StudentClub_exp=Double.parseDouble(GST_value_StudentClub);

        String PST_value_StudentClub=value_PST_StudentClub_RewardsCouponsPage().getText();
        PST_value_StudentClub = PST_value_StudentClub.substring(1);
        double PST_value_StudentClub_exp=Double.parseDouble(PST_value_StudentClub);

        double StudentClubTotalValue=StudentClubSubTotal_exp+GST_value_StudentClub_exp+PST_value_StudentClub_exp;
        StudentClubTotalValue = TaxRoundOff(StudentClubTotalValue);
        //StudentClubTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(StudentClubTotalValue));
        StudentClubTotalValue=StudentClubTotalValue-(TestBaseProvider.getTestBase().getTestData().getDouble("sBonusBankEdit")+TestBaseProvider.getTestBase().getTestData().getDouble("sPaperBankEdit"));
        StudentClubTotalValue = TaxRoundOff(StudentClubTotalValue);
        System.out.println("############StudentClubTotalValue is "+StudentClubTotalValue);

        Assert.assertEquals(StudentClubTotalValue, StudentClubPostValue_exp, "StudentClubTotalValue is incorrect");
        //////////////////////////////////////////
        PauseUtil.pause(2000);
        String TeacherClubPostValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherClubPostValue = TeacherClubPostValue.substring(1);
        double TeacherClubPostValue_exp=Double.parseDouble(TeacherClubPostValue);
        System.out.println("############TeacherCatalogues Post Value is "+TeacherClubPostValue_exp);

        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_exp=Double.parseDouble(TeacherCatSubTotal);

        String GST_value_TeacherCat=value_GST_TeacherCat_RewardsCouponsPage().getText();
        GST_value_TeacherCat = GST_value_TeacherCat.substring(1);
        double GST_value_TeacherCat_exp=Double.parseDouble(GST_value_TeacherCat);

        String PST_value_TeacherCat=value_PST_TeacherCat_RewardsCouponsPage().getText();
        PST_value_TeacherCat = PST_value_TeacherCat.substring(1);
        double PST_value_TeacherCat_exp=Double.parseDouble(PST_value_TeacherCat);

        double TeacherCataloguesTotalValue=TeacherCatSubTotal_exp+GST_value_TeacherCat_exp+PST_value_TeacherCat_exp;
        TeacherCataloguesTotalValue = TaxRoundOff(TeacherCataloguesTotalValue);
        //TeacherCataloguesTotalValue =Double.parseDouble(new DecimalFormat("##.##").format(TeacherCataloguesTotalValue));
        TeacherCataloguesTotalValue=TeacherCataloguesTotalValue-(TestBaseProvider.getTestBase().getTestData().getDouble("tBonusBankEdit")+TestBaseProvider.getTestBase().getTestData().getDouble("tPaperBankEdit"));
        TeacherCataloguesTotalValue = TaxRoundOff(TeacherCataloguesTotalValue);
        System.out.println("############TeacherCatalogues Total Value is "+TeacherCataloguesTotalValue);

        Assert.assertEquals(TeacherClubPostValue_exp, TeacherCataloguesTotalValue, "TeacherCataloguesTotalValue is incorrect");
        ///////////////////////////////////////////
        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubPostValue_exp+TeacherClubPostValue_exp+ShippingValue_is;
            Total_owing_exp = TaxRoundOff(Total_owing_exp);
            //Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Total_Owing_Amount_act_2 = TaxRoundOff(Total_Owing_Amount_act_2);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_exp=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_exp);
            double Total_owing_exp=StudentClubPostValue_exp+TeacherClubPostValue_exp+ShippingValue_exp;
            Total_owing_exp = TaxRoundOff(Total_owing_exp);
            //Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));
			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");
		} */


		/*PauseUtil.pause(2000);
		String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
		ShippingValue = ShippingValue.substring(1);
		double ShippingValue_exp=Double.parseDouble(ShippingValue);
		System.out.println("############ShippingValue is "+ShippingValue_exp);
		/////////////////////////////////////////////

		double Total_owing_exp=StudentClubPostValue_exp+TeacherClubPostValue_exp+ShippingValue_exp;

		String Total_Owing_Amount_act=Total_Amount_Owing().getText();
		Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
		double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
		Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect");*/

    }

    @Override
    public void validation_of_Student_club_PostAmt_items_redemption_pop() {
        PauseUtil.pause(8000);
        Assert.assertTrue(header_BlueBar_StudentClub_PostAmount_items_payment().isDisplayed(), "StudentClub PostAmount and items blue bar is not displayed");
        Assert.assertTrue(item_Bonus_Bank_Redeemed_StudentClub().isDisplayed(), "StudentClub Bonus_Bank_Redeemed is not displayed");
        Assert.assertTrue(item_Paper_Bonus_Coupons_StudentClub().isDisplayed(), "StudentClub Paper_Bonus_Coupons is not displayed");
        //Assert.assertTrue(item_POP_StudentClub().isDisplayed(), "StudentClub POP is not displayed");

    }

    @Override
    public void validation_of_Teacher_catalogues_PostAmt_items_redemption_pop() {
        PauseUtil.pause(2000);
        PauseUtil.waitForAjaxToComplete(2500);
        Assert.assertTrue(header_BlueBar_TeacherCatalogues_PostAmount_items_payment().isDisplayed(), "TeacherCatalogues PostAmount and items blue bar is not displayed");
        Assert.assertTrue(item_Bonus_Bank_Redeemed_TeacherCatalogues().isDisplayed(), "TeacherCatalogues Bonus_Bank_Redeemed is not displayed");
        Assert.assertTrue(item_Paper_Bonus_Coupons_TeacherCatalogues().isDisplayed(), "TeacherCatalogues Paper_Bonus_Coupons is not displayed");
    }

    @Override
    public void validation_of_Student_and_Teacher_catalogues_Total_owing_amount() {
        PauseUtil.pause(2000);
        try {
            btn_minus_POP_StudentClub_payment().isDisplayed();
            checkBox_checkAll_POP_StudentClub_payment().isDisplayed();
            checkBox_checkAll_POP_StudentClub_payment().click();
            PauseUtil.pause(6000);
            try {
                btn_minus_POP_StudentClub_payment().isDisplayed();
                btn_minus_POP_StudentClub_payment().click();
            } catch (Exception e) {
                System.out.println("POP coupons are not displayed");
            }
        } catch (Exception e) {
            System.out.println("POP coupons are not displayed");
        }

        String StudentClubTotalValue=Total_owing_StudentClub_payment().getText();
        StudentClubTotalValue = StudentClubTotalValue.substring(1);
        double StudentClubTotalValue_exp=Double.parseDouble(StudentClubTotalValue);
        System.out.println("############StudentClub Total owing value is "+StudentClubTotalValue_exp);

        String TeacherCatTotalValue=Total_owing_TeacherCatalogues_payment().getText();
        TeacherCatTotalValue = TeacherCatTotalValue.substring(1);
        double TeacherCatTotalValue_exp=Double.parseDouble(TeacherCatTotalValue);
        System.out.println("############TeacherCatalogues Total owing value is "+TeacherCatTotalValue_exp);

        ////////////////////////////////////////////////
        PauseUtil.pause(2000);
        String ShippingTotalValue=Total_owing_Shipping_payment().getText();
        ShippingTotalValue=ShippingTotalValue.trim();
        if (ShippingTotalValue.equals("FREE!")) {
            double ShippingValue_is=0;

            double Total_Amount_Owing_Value_exp=StudentClubTotalValue_exp+TeacherCatTotalValue_exp+ShippingValue_is;
            Total_Amount_Owing_Value_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_Amount_Owing_Value_exp));

			String Total_Amount_Owing_Value=Total_Amount_Owing_Payment().getText();
			Total_Amount_Owing_Value=Total_Amount_Owing_Value.trim();
			Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
			double Total_Amount_Owing_Value_act=Double.parseDouble(Total_Amount_Owing_Value);
			System.out.println("############Total_Amount_Owing value is "+Total_Amount_Owing_Value_act);

            Assert.assertEquals(Total_Amount_Owing_Value_act, Total_Amount_Owing_Value_exp, "Total owing value is incorrect");

        } else if (!ShippingTotalValue.equals("FREE!")) {
            ShippingTotalValue = ShippingTotalValue.substring(1);
            double ShippingTotalValue_exp=Double.parseDouble(ShippingTotalValue);
            System.out.println("############Shipping total value is "+ShippingTotalValue_exp);
            double Total_Amount_Owing_Value_exp=StudentClubTotalValue_exp+TeacherCatTotalValue_exp+ShippingTotalValue_exp;
            Total_Amount_Owing_Value_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_Amount_Owing_Value_exp));

			String Total_Amount_Owing_Value=Total_Amount_Owing_Payment().getText();
			Total_Amount_Owing_Value=Total_Amount_Owing_Value.trim();
			Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
			double Total_Amount_Owing_Value_act=Double.parseDouble(Total_Amount_Owing_Value);
			System.out.println("############Total_Amount_Owing value is "+Total_Amount_Owing_Value_act);

            Assert.assertEquals(Total_Amount_Owing_Value_act, Total_Amount_Owing_Value_exp, "Total owing value is incorrect");
        } 

		/*String ShippingTotalValue=Total_owing_Shipping_payment().getText();
		ShippingTotalValue = ShippingTotalValue.substring(1);
		double ShippingTotalValue_exp=Double.parseDouble(ShippingTotalValue);
		System.out.println("############Shipping & handling Total value is "+ShippingTotalValue_exp);

		double Total_Amount_Owing_Value_exp=StudentClubTotalValue_exp+TeacherCatTotalValue_exp+ShippingTotalValue_exp;
		Total_Amount_Owing_Value_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_Amount_Owing_Value_exp));

		String Total_Amount_Owing_Value=Total_Amount_Owing_Payment().getText();
		Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
		double Total_Amount_Owing_Value_act=Double.parseDouble(Total_Amount_Owing_Value);
		System.out.println("############Total_Amount_Owing value is "+Total_Amount_Owing_Value_act);

		Assert.assertEquals(Total_Amount_Owing_Value_act, Total_Amount_Owing_Value_exp, "Total owing value is incorrect");*/

    }

    @Override
    public void validation_of_StudentClub_Total_owing_amount_Payment_Page() {
        PauseUtil.pause(2000);
        try {
            btn_minus_POP_StudentClub_payment().isDisplayed();
            checkBox_checkAll_POP_StudentClub_payment().isDisplayed();
            checkBox_checkAll_POP_StudentClub_payment().click();
            PauseUtil.pause(6000);
            try {
                btn_minus_POP_StudentClub_payment().isDisplayed();
                btn_minus_POP_StudentClub_payment().click();
            } catch (Exception e) {
                System.out.println("POP coupons are not displayed");
            }
        } catch (Exception e) {
            System.out.println("POP coupons are not displayed");
        }

        String StudentClubTotalValue=Total_owing_StudentClub_payment().getText();
        StudentClubTotalValue = StudentClubTotalValue.substring(1);
        double StudentClubTotalValue_exp=Double.parseDouble(StudentClubTotalValue);
        System.out.println("############StudentClub Total owing value is "+StudentClubTotalValue_exp);

        ////////////////////////////////////////////////
        PauseUtil.pause(2000);
        String ShippingTotalValue=Total_owing_Shipping_payment().getText();
        ShippingTotalValue=ShippingTotalValue.trim();
        if (ShippingTotalValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_Amount_Owing_Value_exp=StudentClubTotalValue_exp+ShippingValue_is;
            Total_Amount_Owing_Value_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_Amount_Owing_Value_exp));
			String Total_Amount_Owing_Value=Total_Amount_Owing_Payment().getText();
			Total_Amount_Owing_Value=Total_Amount_Owing_Value.trim();
			Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
			double Total_Amount_Owing_Value_act=Double.parseDouble(Total_Amount_Owing_Value);
			System.out.println("############Total_Amount_Owing value is "+Total_Amount_Owing_Value_act);
            Assert.assertEquals(Total_Amount_Owing_Value_act, Total_Amount_Owing_Value_exp, "Total owing value is incorrect");

        } else if (!ShippingTotalValue.equals("FREE!")) {
            ShippingTotalValue = ShippingTotalValue.substring(1);
            double ShippingTotalValue_exp=Double.parseDouble(ShippingTotalValue);
            System.out.println("############Shipping total value is "+ShippingTotalValue_exp);
            double Total_Amount_Owing_Value_exp=StudentClubTotalValue_exp+ShippingTotalValue_exp;
            Total_Amount_Owing_Value_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_Amount_Owing_Value_exp));
			String Total_Amount_Owing_Value=Total_Amount_Owing_Payment().getText();
			Total_Amount_Owing_Value=Total_Amount_Owing_Value.trim();
			Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
			double Total_Amount_Owing_Value_act=Double.parseDouble(Total_Amount_Owing_Value);
			System.out.println("############Total_Amount_Owing value is "+Total_Amount_Owing_Value_act);

            Assert.assertEquals(Total_Amount_Owing_Value_act, Total_Amount_Owing_Value_exp, "Total owing value is incorrect");
        }

    }



    @Override
    public void unCheckPOP(){

        PauseUtil.pause(4500);

        if(chkgetpopCheckBox().size()!=0)
        {
            if(getpopCheckBox().isSelected()){
                getpopCheckBox().click();
            }
        }



    }

    @Override
    public void validation_of_TeacherCatalogues_Total_owing_amount_Payment_Page() {
        String TeacherCatTotalValue=Total_owing_TeacherCatalogues_payment().getText();
        TeacherCatTotalValue = TeacherCatTotalValue.substring(1);
        double TeacherCatTotalValue_exp=Double.parseDouble(TeacherCatTotalValue);
        System.out.println("############TeacherCatalogues Total owing value is "+TeacherCatTotalValue_exp);

        ////////////////////////////////////////////////
        PauseUtil.pause(2000);
        String ShippingTotalValue=Total_owing_Shipping_payment().getText();
        ShippingTotalValue=ShippingTotalValue.trim();
        if (ShippingTotalValue.equals("FREE!")) {
            double ShippingValue_is=0;

            double Total_Amount_Owing_Value_exp=TeacherCatTotalValue_exp+ShippingValue_is;
            Total_Amount_Owing_Value_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_Amount_Owing_Value_exp));
			String Total_Amount_Owing_Value=Total_Amount_Owing_Payment().getText();
			Total_Amount_Owing_Value=Total_Amount_Owing_Value.trim();
			Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
			double Total_Amount_Owing_Value_act=Double.parseDouble(Total_Amount_Owing_Value);
			System.out.println("############Total_Amount_Owing value is "+Total_Amount_Owing_Value_act);

            Assert.assertEquals(Total_Amount_Owing_Value_act, Total_Amount_Owing_Value_exp, "Total owing value is incorrect");

        } else if (!ShippingTotalValue.equals("FREE!")) {
            ShippingTotalValue = ShippingTotalValue.substring(1);
            double ShippingTotalValue_exp=Double.parseDouble(ShippingTotalValue);
            System.out.println("############Shipping total value is "+ShippingTotalValue_exp);
            double Total_Amount_Owing_Value_exp=TeacherCatTotalValue_exp+ShippingTotalValue_exp;
            Total_Amount_Owing_Value_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_Amount_Owing_Value_exp));

			String Total_Amount_Owing_Value=Total_Amount_Owing_Payment().getText();
			Total_Amount_Owing_Value=Total_Amount_Owing_Value.trim();
			Total_Amount_Owing_Value = Total_Amount_Owing_Value.substring(1);
			double Total_Amount_Owing_Value_act=Double.parseDouble(Total_Amount_Owing_Value);
			System.out.println("############Total_Amount_Owing value is "+Total_Amount_Owing_Value_act);

            Assert.assertEquals(Total_Amount_Owing_Value_act, Total_Amount_Owing_Value_exp, "Total owing value is incorrect");
        }
    }

    @Override
    public void validation_of_Rewards_earned_amount_message_CouponsRewardsPage() {
        PauseUtil.pause(8000);
        Assert.assertTrue(Rewards_earned_amount_message_CouponsRewards().isDisplayed(), "Rewards_earned_amount is not displayed in Rewards & Coupons page");
    }

    @Override
    public void validation_of_Submit_order_date_CouponsRewardsPage() {
        PauseUtil.pause(2000);
        Assert.assertTrue(Submit_order_date_CouponsRewards().isDisplayed(), "Submit_order_date is not displayed in Rewards & Coupons page");
    }

    @Override
    public void validation_of_selected_item_Section_MakeYourSelection() {
        PauseUtil.pause(5000);
        Assert.assertTrue(selected_item_Section_MakeYourSelection().isDisplayed(), "selected item Section is not displayed in MakeYourSelection Window");
    }

    public double TaxRoundOff(double taxvalue)
    {
        double r11 = (double) Math.round(taxvalue*10000);
        double expected11 = r11 / 10000.0;

        System.out.println("EXPECTED 4th #########" +expected11);

        double r12 = (double) Math.round(expected11*1000);
        double expected12 = r12 / 1000.0;

        System.out.println("EXPECTED 3th #########" +expected12);

        double r13 = (double) Math.round(expected12*100);
        double expected = r13 / 100.0;

        System.out.println("EXPECTED 2nd #########" +expected);

        return expected;
    }



    public double BonusBankAmt()
    {
        String BonusBankAmt1=getfieldbonubank().getText();
        String BonusBankAmt12 = BonusBankAmt1.substring(1);
        double BonusBankAmt=Double.parseDouble(BonusBankAmt12);
        System.out.println("Bonus Amout is:###########" + BonusBankAmt);
        return BonusBankAmt;
    }


    public int BonusBankAmtInt()
    {
        String BonusBankAmt1=getfieldbonubank().getText();
        String BonusBankAmt12 = BonusBankAmt1.substring(1);
        double BonusBankAmt=Double.parseDouble(BonusBankAmt12);
        Long L = Math.round(BonusBankAmt);
        int BonusBankAmtInt = Integer.valueOf(L.intValue());

        //Integer i = BonusBankAmt.intValue();

        //int BonusBankAmtInt=Integer.parseInt(BonusBankAmt12);
        System.out.println("Bonus Amout in Int is:###########" + BonusBankAmtInt);
        return BonusBankAmtInt;
    }


    public double BonusBankAmt_Negative()
    {
        String BonusBankAmt1=getfieldbonubank().getText();
        System.out.println("exact aftr value:"+BonusBankAmt1);
        String BonusBankAmt12 = BonusBankAmt1.substring(3);
        System.out.println("exact aftr substring value:"+BonusBankAmt12);
        double BonusBankAmt=Double.parseDouble(BonusBankAmt12);
        System.out.println("Bonus Amout after applying:###########" + BonusBankAmt);
        return BonusBankAmt;
    }
    
    
    public double SFO_BlueBarTotal()
    {
        String studentclubbluebarAmt1=getlblrewardscouponssfobluebartotal().getText();
        String studentclubbluebarAmt12 = studentclubbluebarAmt1.substring(1);
        double sfobluebarAmt=Double.parseDouble(studentclubbluebarAmt12);
        System.out.println("SFO Total Amount is:###########" + sfobluebarAmt);
        return sfobluebarAmt;
    }

    public double StudentClub_BlueBarTotal()
    {
        String studentclubbluebarAmt1=getlblrewardscouponsstudentclubbluebartotal().getText();
        String studentclubbluebarAmt12 = studentclubbluebarAmt1.substring(1);
        double studentclubbluebarAmt=Double.parseDouble(studentclubbluebarAmt12);
        System.out.println("Student Club Total Amount is:###########" + studentclubbluebarAmt);
        return studentclubbluebarAmt;
    }


    public double StudentClub_Qty()
    {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        String studentclubqty1=getlblrewardscouponsstudentclubbluebarqty().getText();
        String studentclubqty12 = studentclubqty1.substring(0,2);
        double studentclubqty=Double.parseDouble(studentclubqty12);
        System.out.println("Student Club Qty is:###########" + studentclubqty);
        return studentclubqty;
    }

    public double StudentClub_SubTotal()
    {
        String studentclubsubtotal1=getlblrewardscouponsstudentclubsubtotal().getText();
        String studentclubsubtotal12 = studentclubsubtotal1.substring(1);
        double studentclubsubtotal=Double.parseDouble(studentclubsubtotal12);
        System.out.println("Student Club sub Total Amount is:###########" + studentclubsubtotal);
        return studentclubsubtotal;
    }

    public double StudentClub_BonusBank()
    {
        String studentclubbonusbank1=getlblrewardscouponsstudentclubbonusbank().getAttribute("value");
        double studentclubbonusbank=Double.parseDouble(studentclubbonusbank1);
        System.out.println("Student Club Bonus Bank is:###########" + studentclubbonusbank);
        return studentclubbonusbank;
    }


    public double StudentClub_PaperBonusCoupon()
    {
        String studentclubpapercoupon1=getlblrewardscouponsstudentclubpaperbonuscoupon().getAttribute("value");
        double studentclubpapercoupon=Double.parseDouble(studentclubpapercoupon1);
        System.out.println("Student Club Paper Coupon is:###########" + studentclubpapercoupon);
        return studentclubpapercoupon;
    }



    public double TeacherClub_BlueBarTotal()
    {
        String teacherclubbluebarAmt1=getlblrewardscouponsteacherclubbluebartotal().getText();
        String teacherclubbluebarAmt12 = teacherclubbluebarAmt1.substring(1);
        double teacherclubbluebarAmt=Double.parseDouble(teacherclubbluebarAmt12);
        System.out.println("Teacher Club Total Amount is:###########" + teacherclubbluebarAmt);
        return teacherclubbluebarAmt;
    }

    public double TeacherClub_Qty()
    {
        String teachclubqty1=getlblrewardscouponsteacherclubbluebarqty().getText();
        String teachclubqty12 = teachclubqty1.substring(0,2);
        double teachclubqty=Double.parseDouble(teachclubqty12);
        System.out.println("Teacher Club Qty is:###########" + teachclubqty);
        return teachclubqty;
    }

    public double TeacherClub_SubTotal()
    {
        String teacherclubsubtotal1=getlblrewardscouponsteacherclubsubtotal().getText();
        String teacherclubsubtotal12 = teacherclubsubtotal1.substring(1);
        double teacherclubsubtotal=Double.parseDouble(teacherclubsubtotal12);
        System.out.println("Teacher Club sub Total Amount is:###########" + teacherclubsubtotal);
        return teacherclubsubtotal;
    }


    public double TeacherClub_BonusBank()
    {
        String teacherclubbonusbank1=getlblrewardscouponsteacherclubbonusbank().getAttribute("value");
        double teacherclubbonusbank=Double.parseDouble(teacherclubbonusbank1);
        System.out.println("Teacher Club Bonus Bank is:###########" + teacherclubbonusbank);
        return teacherclubbonusbank;
    }


    public double TeacherClub_PaperBonusCoupon()
    {
        String teacherclubpapercoupon1=getlblrewardscouponsteacherclubpaperbonuscoupon().getAttribute("value");
        double teacherclubpapercoupon=Double.parseDouble(teacherclubpapercoupon1);
        System.out.println("Teacher Club Paper Coupon is:###########" + teacherclubpapercoupon);
        return teacherclubpapercoupon;
    }


    public double ShippingFee_BlueBarTotal()
    {
    	Double shippingfeebluebarAmt=null;
        String shippingfeebluebarAmt1= getlblrewardscouponsshippingfeebluebartotal().getText().trim();
        if (shippingfeebluebarAmt1.equals("FREE!")) {
        	shippingfeebluebarAmt=(double) 0;
		} else {
			String shippingfeebluebarAmt12 = shippingfeebluebarAmt1.substring(1);
	        shippingfeebluebarAmt=Double.parseDouble(shippingfeebluebarAmt12);
	        System.out.println("Shipping fee Total Amount is:###########" + shippingfeebluebarAmt);
		}
        return shippingfeebluebarAmt;
    }

    public double Shipping_SubTotal()
    {
        String shippingsubtotal1=getlblrewardscouponsshippingfeesubtotal().getText();
        String shippingsubtotal12 = shippingsubtotal1.substring(1);
        double shippingsubtotal=Double.parseDouble(shippingsubtotal12);
        System.out.println("shippingsubtotal dub Total Amount is:###########" + shippingsubtotal);
        return shippingsubtotal;
    }


    public double ShippingFee_BonusBank()
    {
        String shippingclubbonusbank1=getlblrewardscouponsshippingclubbonusbank().getAttribute("value");
        double shippingclubbonusbank=Double.parseDouble(shippingclubbonusbank1);
        System.out.println("Shiping Fee Bonus Bank is:###########" + shippingclubbonusbank);
        return shippingclubbonusbank;
    }


    public double ShippingFee_PaperBonusCoupon()
    {
        String shippingclubpapercoupon1=getlblrewardscouponsshippingclubpaperbonuscoupon().getAttribute("value");
        double shippingclubpapercoupon=Double.parseDouble(shippingclubpapercoupon1);
        System.out.println("Shipping Fee Paper Coupon is:###########" + shippingclubpapercoupon);
        return shippingclubpapercoupon;
    }


    public double Total_Amt_Owing()
    {
        String totalamtowing1=getlblrewardscouponstotalamountowing().getText();
        String totalamtowing12 = totalamtowing1.substring(1);
        double totalamtowing=Double.parseDouble(totalamtowing12);
        System.out.println("Total Amount Owing is:###########" + totalamtowing);
        return totalamtowing;
    }

    public double StudentClub_GST()
    {
        String studentclubgst1=value_GST_StudentClub_RewardsCouponsPage().getText();
        String studentclubgst12 = studentclubgst1.substring(1);
        double studentclubgst=Double.parseDouble(studentclubgst12);
        System.out.println("Student Club GST is:###########" + studentclubgst);
        return studentclubgst;
    }

    public double StudentClub_PST()
    {
        String studentclubpst1=value_PST_StudentClub_RewardsCouponsPage().getText();
        String studentclubpst12 = studentclubpst1.substring(1);
        double studentclubpst=Double.parseDouble(studentclubpst12);
        System.out.println("Student Club PST is:###########" + studentclubpst);
        return studentclubpst;
    }

    public double StudentClub_QST()
    {
        String studentclubqst1=value_QST_StudentClub_RewardsCouponsPage().getText();
        String studentclubqst12 = studentclubqst1.substring(1);
        double studentclubqst=Double.parseDouble(studentclubqst12);
        System.out.println("Student Club QST is:###########" + studentclubqst);
        return studentclubqst;
    }

    public double StudentClub_HST()
    {
        String studentclubhst1=value_HST_StudentClub_RewardsCouponsPage().getText();
        String studentclubhst12 = studentclubhst1.substring(1);
        double studentclubhst=Double.parseDouble(studentclubhst12);
        System.out.println("Student Club HST is:###########" + studentclubhst);
        return studentclubhst;
    }

    public double TeacherClub_GST()
    {
        String teacherclubgst1=value_GST_TeacherCat_RewardsCouponsPage().getText();
        String teacherclubgst12 = teacherclubgst1.substring(1);
        double teacherclubgst=Double.parseDouble(teacherclubgst12);
        System.out.println("Teacher Club GST is:###########" + teacherclubgst);
        return teacherclubgst;
    }

    public double TeacherClub_PST()
    {
        String teacherclubpst1=value_PST_TeacherCat_RewardsCouponsPage().getText();
        String teacherclubpst12 = teacherclubpst1.substring(1);
        double teacherclubpst=Double.parseDouble(teacherclubpst12);
        System.out.println("Teacher Club PST is:###########" + teacherclubpst);
        return teacherclubpst;
    }

    public double TeacherClub_QST()
    {
        String teacherclubqst1=value_QST_TeacherCat_RewardsCouponsPage().getText();
        String teacherclubqst12 = teacherclubqst1.substring(1);
        double teacherclubqst=Double.parseDouble(teacherclubqst12);
        System.out.println("Teacher Club QST is:###########" + teacherclubqst);
        return teacherclubqst;
    }

    public double TeacherClub_HST()
    {
        String teacherclubhst1=value_HST_TeacherCat_RewardsCouponsPage().getText();
        String teacherclubhst12 = teacherclubhst1.substring(1);
        double teacherclubhst=Double.parseDouble(teacherclubhst12);
        System.out.println("Teacher Club HST is:###########" + teacherclubhst);
        return teacherclubhst;
    }

    public double Shipping_GST()
    {
        String shipgst1=value_GST_Shipping_RewardsCouponsPage().getText();
        String shipgst12 = shipgst1.substring(1);
        double shipgst=Double.parseDouble(shipgst12);
        System.out.println("Shipping GST is:###########" + shipgst);
        return shipgst;
    }

    public double Shipping_PST()
    {
        String shippst1=value_PST_Shipping_RewardsCouponsPage().getText();
        String shippst12 = shippst1.substring(1);
        double shippst=Double.parseDouble(shippst12);
        System.out.println("Shipping PST is:###########" + shippst1);
        return shippst;
    }

    public double Shipping_QST()
    {
        String shipqst1=value_QST_Shipping_RewardsCouponsPage().getText();
        String shipqst12 = shipqst1.substring(1);
        double shipqst=Double.parseDouble(shipqst12);
        System.out.println("Shipping QST is:###########" + shipqst1);
        return shipqst;
    }

    public double Shipping_HST()
    {
        String shiphst1=value_HST_Shipping_RewardsCouponsPage().getText();
        String shiphst12 = shiphst1.substring(1);
        double shiphst=Double.parseDouble(shiphst12);
        System.out.println("Shipping HST is:###########" + shiphst1);
        return shiphst;
    }



    //CALCULATING FOR PAYMENT PAGE 


    public double Payment_StudentClub_SubTotal()
    {
        String studentclubsubtotal1=getlblpaymentstudentclubsubtotal().getText();
        String studentclubsubtotal12 = studentclubsubtotal1.substring(1);
        double studentclubsubtotal=Double.parseDouble(studentclubsubtotal12);
        System.out.println("Student Club Sub Total Amount is:###########" + studentclubsubtotal);
        return studentclubsubtotal;
    }

    public double Payment_StudentClub_BlueBarTotal()
    {
        String studentclubbluebarAmt1=getlblpaymentstudentclubbluebartotal().getText();
        String studentclubbluebarAmt12 = studentclubbluebarAmt1.substring(1);
        double studentclubbluebarAmt=Double.parseDouble(studentclubbluebarAmt12);
        System.out.println("Student Club Total Amount is:###########" + studentclubbluebarAmt);
        return studentclubbluebarAmt;
    }


    public double Payment_StudentClub_Qty()
    {
        String studentclubqty1=getlblpaymentstudentclubbluebarqty().getText();
        String studentclubqty12 = studentclubqty1.substring(0,2);
        double studentclubqty=Double.parseDouble(studentclubqty12);
        System.out.println("Student Club Qty is:###########" + studentclubqty);
        return studentclubqty;
    }

    public double Payment_StudentClub_BonusBank()
    {
        String studentclubbonusbank1=getlblpaymentstudentclubbonusbank().getText();
        double studentclubbonusbank=Double.parseDouble(studentclubbonusbank1);
        System.out.println("Student Club Bonus Bank is:###########" + studentclubbonusbank);
        return studentclubbonusbank;
    }

    @Override
    public void deletes_the_Selected_item_Modal_Selection_Window()
    {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        delete_SelectedItem_Modal_Selection_window().click();

    }

    @Override
    public void verify_ConfirmSubmit_button_disappear_Modal_Selection_Window()
    {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String value_exp=disappear_ConfirmSubmit_Modal_Selection_window().getAttribute("style");
        String value_act="display: none;";

        Assert.assertEquals(value_act, value_exp, "Confirm & Submit button is displayed even when we deletes the item in Modal window");

    }


    public double Payment_StudentClub_PaperBonusCoupon()
    {
        String studentclubpapercoupon1=getlblpaymentstudentclubpaperbonuscoupon().getText();
        double studentclubpapercoupon=Double.parseDouble(studentclubpapercoupon1);
        System.out.println("Student Club Paper Coupon is:###########" + studentclubpapercoupon);
        return studentclubpapercoupon;
    }



    public double Payment_TeacherClub_SubTotal()
    {
        String teacherclubsubtotal1=getlblpaymentteacherclubsubtotal().getText();
        String teacherclubsubtotal12 = teacherclubsubtotal1.substring(1);
        double teacherclubsubtotal=Double.parseDouble(teacherclubsubtotal12);
        System.out.println("teacher Club Sub Total Amount is:###########" + teacherclubsubtotal);
        return teacherclubsubtotal;
    }

    public double Payment_TeacherClub_BlueBarTotal()
    {
        String teacherclubbluebarAmt1=getlblpaymentteacherclubbluebartotal().getText();
        String teacherclubbluebarAmt12 = teacherclubbluebarAmt1.substring(1);
        double teacherclubbluebarAmt=Double.parseDouble(teacherclubbluebarAmt12);
        System.out.println("Teacher Club Total Amount is:###########" + teacherclubbluebarAmt);
        return teacherclubbluebarAmt;
    }


    public double Payment_TeacherClub_Qty()
    {
        String teachclubqty1=getlblpaymentteacherclubbluebarqty().getText();
        String teachclubqty12 = teachclubqty1.substring(0,2);
        double teachclubqty=Double.parseDouble(teachclubqty12);
        System.out.println("Teacher Club Qty is:###########" + teachclubqty);
        return teachclubqty;
    }


    public double Payment_TeacherClub_BonusBank()
    {
        String teacherclubbonusbank1=getlblpaymentteacherclubbonusbank().getText();
        double teacherclubbonusbank=Double.parseDouble(teacherclubbonusbank1);
        System.out.println("Teacher Club Bonus Bank is:###########" + teacherclubbonusbank);
        return teacherclubbonusbank;
    }


    public double Payment_TeacherClub_PaperBonusCoupon()
    {
        String teacherclubpapercoupon1=getlblpaymentteacherclubpaperbonuscoupon().getText();
        double teacherclubpapercoupon=Double.parseDouble(teacherclubpapercoupon1);
        System.out.println("Teacher Club Paper Coupon is:###########" + teacherclubpapercoupon);
        return teacherclubpapercoupon;
    }


    public double Payment_Shipping_SubTotal()
    {
        String shippingsubtotal1=getlblpaymentshippingfeesubtotal().getText();
        String shippingsubtotal12 = shippingsubtotal1.substring(1);
        double shippingsubtotal=Double.parseDouble(shippingsubtotal12);
        System.out.println("shipping Sub Total Amount is:###########" + shippingsubtotal);
        return shippingsubtotal;
    }

    public double Payment_ShippingFee_BlueBarTotal()
    {
        String shippingfeebluebarAmt1= getlblpaymentshippingfeebluebartotal().getText();
        String shippingfeebluebarAmt12 = shippingfeebluebarAmt1.substring(1);
        double shippingfeebluebarAmt=Double.parseDouble(shippingfeebluebarAmt12);
        System.out.println("Shipping fee Total Amount is:###########" + shippingfeebluebarAmt);
        return shippingfeebluebarAmt;
    }


    public double Payment_ShippingFee_BonusBank()
    {
        String shippingclubbonusbank1=getlblpaymentshippingclubbonusbank().getText();
        String shippingclubbonusbank2 = shippingclubbonusbank1.substring(1);
        double shippingclubbonusbank=Double.parseDouble(shippingclubbonusbank2);
        System.out.println("Shiping Fee Bonus Bank is:###########" + shippingclubbonusbank);
        return shippingclubbonusbank;
    }


    public double Payment_ShippingFee_PaperBonusCoupon()
    {
        String shippingclubpapercoupon1=getlblpaymentshippingclubpaperbonuscoupon().getText();
        double shippingclubpapercoupon=Double.parseDouble(shippingclubpapercoupon1);
        System.out.println("Shipping Fee Paper Coupon is:###########" + shippingclubpapercoupon);
        return shippingclubpapercoupon;
    }


    public double  Payment_Total_Amt_Owing()
    {
        String totalamtowing1=getlblpaymenttotalamountowing().getText();
        String totalamtowing12 = totalamtowing1.substring(1);
        double totalamtowing=Double.parseDouble(totalamtowing12);
        System.out.println("Total Amount Owing is:###########" + totalamtowing);
        return totalamtowing;
    }


    public double Payment_StudentClub_GST_Total()
    {
        String studentclubgst1=getlblpaymentstudentclubgstvalue().getText();
        String studentclubgst12 = studentclubgst1.substring(1);
        double studentclubgst=Double.parseDouble(studentclubgst12);
        System.out.println("Student Club GST Amount is:###########" + studentclubgst);
        return studentclubgst;
    }

    public double Payment_StudentClub_PST_Total()
    {
        String studentclubpst1=getlblpaymentstudentclubpstvalue().getText();
        String studentclubpst12 = studentclubpst1.substring(1);
        double studentclubpst=Double.parseDouble(studentclubpst12);
        System.out.println("Student Club PST Amount is:###########" + studentclubpst);
        return studentclubpst;
    }

    public double Payment_StudentClub_HST_Total()
    {
        String studentclubhst1=getlblpaymentstudentclubhstvalue().getText();
        String studentclubhst12 = studentclubhst1.substring(1);
        double studentclubhst=Double.parseDouble(studentclubhst12);
        System.out.println("Student Club HST Amount is:###########" + studentclubhst);
        return studentclubhst;
    }

    public double Payment_StudentClub_QST_Total()
    {
        String studentclubqst1=getlblpaymentstudentclubqstvalue().getText();
        String studentclubqst12 = studentclubqst1.substring(1);
        double studentclubqst=Double.parseDouble(studentclubqst12);
        System.out.println("Student Club QST Amount is:###########" + studentclubqst);
        return studentclubqst;
    }

    public double Payment_TeacherClub_GST_Total()
    {
        String teachclubgst1=getlblpaymentteacherclubgstvalue().getText();
        String teachclubgst12 = teachclubgst1.substring(1);
        double teachclubgst=Double.parseDouble(teachclubgst12);
        System.out.println("Teacher Club GST Amount is:###########" + teachclubgst);
        return teachclubgst;
    }

    public double Payment_TeacherClub_PST_Total()
    {
        String teachclubpst1=getlblpaymentteacherclubpstvalue().getText();
        String teachclubpst12 = teachclubpst1.substring(1);
        double teachclubpst=Double.parseDouble(teachclubpst12);
        System.out.println("Teacher Club PST Amount is:###########" + teachclubpst);
        return teachclubpst;
    }

    public double Payment_TeacherClub_HST_Total()
    {
        String teachclubhst1=getlblpaymentteacherclubhstvalue().getText();
        String teachclubhst12 = teachclubhst1.substring(1);
        double teachclubhst=Double.parseDouble(teachclubhst12);
        System.out.println("Teacher Club HST Amount is:###########" + teachclubhst);
        return teachclubhst;
    }

    public double Payment_TeacherClub_QST_Total()
    {
        String teachclubqst1=getlblpaymentteacherclubqstvalue().getText();
        String teachclubqst12 = teachclubqst1.substring(1);
        double teachclubqst=Double.parseDouble(teachclubqst12);
        System.out.println("Teacher Club PST Amount is:###########" + teachclubqst);
        return teachclubqst;
    }

    public double Payment_Shipping_GST_Total()
    {
        String shippinggst1=getlblpaymentshippinggstvalue().getText();
        String shippinggst12 = shippinggst1.substring(1);
        double shippinggst=Double.parseDouble(shippinggst12);
        System.out.println("Shipping GST Amount is:###########" + shippinggst);
        return shippinggst;
    }

    public double Payment_Shipping_PST_Total()
    {
        String shippingpst1=getlblpaymentshippingpstvalue().getText();
        String shippingpst12 = shippingpst1.substring(1);
        double shippingpst=Double.parseDouble(shippingpst12);
        System.out.println("Shipping PST Amount is:###########" + shippingpst);
        return shippingpst;
    }

    public double Payment_Shipping_HST_Total()
    {
        String shippinghst1=getlblpaymentshippinghstvalue().getText();
        String shippinghst12 = shippinghst1.substring(1);
        double shippinghst=Double.parseDouble(shippinghst12);
        System.out.println("Shipping HST Amount is:###########" + shippinghst);
        return shippinghst;
    }

    public double Payment_Shipping_QST_Total()
    {
        String shippingqst1=getlblpaymentshippingqstvalue().getText();
        String shippingqst12 = shippingqst1.substring(1);
        double shippingqst=Double.parseDouble(shippingqst12);
        System.out.println("Shipping QST Amount is:###########" + shippingqst);
        return shippingqst;
    }

    @Override
    public boolean verify_FreePickCoupon_section_is_not_displayed_in_rewardsPage() {

        boolean flag=false;
        try{
            fld_applied_coupon_Section1_RewardsPage().isDisplayed();
        }
        catch(Exception e)
        {flag = true;
        }
        return flag;

    }

    @Override
    public void closes_the_Modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        close_btn_Modal_Selection_window().click();

    }


    @Override
    public void cancel_freepick_selection() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        getLnkcouponpopupCancel().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);

    }

    @Override
    public void clicks_on_How_is_my_qualifying_order_tot_cal() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        calc_of_qualifying_order_Total_Rewards_page().click();
    }

    @Override
    public void verify_explanation_of_qualifying_order_Total() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        Assert.assertTrue(explanation_of_qualifying_order_Total_Rewards_page().isDisplayed(), "Qualifying order total explanation popUp is not displayed");
    }

    @Override
    public void verify_selected_items_are_saved_in_Modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        Assert.assertTrue(EDIT_Selected_Item_in_Modal_window().isDisplayed(), "EDIT button is not displayed to Select the item");
        EDIT_Selected_Item_in_Modal_window().click();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        Assert.assertTrue(SelectedItem_data_Modal_Selection_window().isDisplayed(), "Selected Free Pick item is not saved in the list");

    }



    @Override
    public void verify_selected_items_are_notsaved_in_Modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        if(SIZE_EDIT_Selected_Item_in_Modal_window().size()!=0)
        {
            Assert.fail("EDIT button should not be displayed to Select the item");
        }

		/*Assert.assertFalse(EDIT_Selected_Item_in_Modal_window().isDisplayed(), "EDIT button shoud not be displayed to Select the item");
		EDIT_Selected_Item_in_Modal_window().click();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);*/
        //Assert.assertTrue(SelectedItem_data_Modal_Selection_window().isDisplayed(), "Selected Free Pick item is not saved in the list");

    }



    @Override
    public void fillTxtCardNumber() {
        // TODO Auto-generated method stub

    }


    @FindBy(locator = "dw.checkout.MyAccount.Home.Select.dropDown")
    private WebElement Home_Select_dropDown_MyAccount;

    @FindBy(locator = "dw.checkout.MyAccount.Home.Select.dropDown")
    private List<WebElement> sizeHome_Select_dropDown_MyAccount;

    @FindBy(locator = "dw.checkout.MyAccount.Home")
    private WebElement Home_MyAccount;


    public WebElement Home_Select_dropDown_MyAccount() {
        return Home_Select_dropDown_MyAccount;
    }

    public List<WebElement> sizeHome_Select_dropDown_MyAccount() {
        return sizeHome_Select_dropDown_MyAccount;
    }

    public WebElement Home_MyAccount() {
        return Home_MyAccount;
    }


    @Override
    public void user_selects_MyAccount_in_ConfirmationPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        Home_MyAccount().click();
    }



    @Override
    public void user_selects_MyAccount_DropDown_in_ConfirmationPage() {

        TeachersHomePage teachhome = new TeachersHomePage();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        Home_Select_dropDown_MyAccount().click();
        PauseUtil.pause(2000);
        teachhome.getLnkMyAccountProfile().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(5000);
        if(teachhome.chkTutorial_CloseIcon().size()!=0){
            SCHUtils.clickUsingJavaScript(teachhome.getTutorial_CloseIcon());
            PauseUtil.pause(3000);
        }
    }



    @Override
    public void user_selects_Logout_MyAccount_DropDown_in_ConfirmationPage() {

        TeachersHomePage teachhome = new TeachersHomePage();
        BasePageImpl bsepage = new BasePageImpl();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        Home_Select_dropDown_MyAccount().click();
        PauseUtil.pause(2000);
        bsepage.user_signOut_from_HomePage();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(5000);
        if(teachhome.chkTutorial_CloseIcon().size()!=0){
            SCHUtils.clickUsingJavaScript(teachhome.getTutorial_CloseIcon());
            PauseUtil.pause(3000);
        }
    }



    @Override
    public void user_selects_BillingAndPayment_MyAccount_DropDown_in_ConfirmationPage() {

        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        TeachersHomePage teacherhomepage = new TeachersHomePage();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        Home_Select_dropDown_MyAccount().click();
        PauseUtil.pause(2000);
        checkoutPage.user_selects_BillingAndPayment_MyAccount_dropDown();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(5000);
        if(teacherhomepage.chkTutorial_CloseIcon().size()!=0){
            SCHUtils.clickUsingJavaScript(teacherhomepage.getTutorial_CloseIcon());
            PauseUtil.pause(3000);
        }

    }


    @Override
    public void user_selects_OrderHistory_MyAccount_DropDown_in_ConfirmationPage() {

        ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
        TeachersHomePage teacherhomepage = new TeachersHomePage();

        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        Home_Select_dropDown_MyAccount().click();
        PauseUtil.pause(2000);
        checkoutPage.user_selects_OrderHistory_MyAccount_dropDown();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(5000);
        if(teacherhomepage.chkTutorial_CloseIcon().size()!=0){
            SCHUtils.clickUsingJavaScript(teacherhomepage.getTutorial_CloseIcon());
            PauseUtil.pause(3000);
        }
    }


    @Override
    public void user_verify_MyAccount_in_ConfirmationPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        //AssertUtils.assertPresent((ExtendedElement) Home_Select_dropDown_MyAccount());
        Assert.assertEquals(sizeHome_Select_dropDown_MyAccount().size() > 0, true);
    }


    @Override
    public String user_verify_TotalAmt_ConfirmationPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        String order_amt = Total_Amount_Owing_Payment().getText().trim();

        return order_amt;
    }


    @Override
    public void teacher_proceedtocheckout_couponsrewardspage_submitorder(){
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();
        ConfirmAndSubmitOrder confirmAndSubmitOrderPage =
                getFactory().getICheckoutPage().getConfirmAndSubmitOrderSection();
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();

        System.out.println(" rewardsAndCoupons.getBtnContinueCheckout() ==========> "
                + SCHUtils.isPresent(rewardsAndCoupons.getBtnContinueCheckout()));
        SCHUtils.scrollToView(rewardsAndCoupons.getBtnContinueCheckout());
        SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
        PauseUtil.pause(1000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();


        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CHECKPAYMENTMETHOD);
        PauseUtil.pause(1500);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
        SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
        PauseUtil.waitForAjaxToComplete();


        String pcoolordersubmit = TestBaseProvider.getTestBase().getTestData()
                .getString("pcoolordersubmit");
        if (pcoolordersubmit == null) {
            WaitUtils.waitForEnabled(confirmAndSubmitOrderPage.getBtnSubmitOrder());
            SCHUtils.clickUsingJavaScript(confirmAndSubmitOrderPage.getBtnSubmitOrder());
        }
        PauseUtil.pause(1000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        String orderRefNum = confirmAndSubmitOrderPage.getorderrefnoConfirmationpage().getText().trim();

        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.confirmationpage.orderrefno", orderRefNum);


    }



    @Override
    public void teacher_Proceed_To_confirmSubmitPage_from_reviewCart(){

        ICartPage cartPage = getFactory().getICartPage();
        CartPage crtpge = new CartPage();
        cartPage.clickOn_ProceedToCheckoutBtn();
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
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        checkOut.getRewardsAndCouponsSection().enterTossInNumberOfStudent(TestBaseProvider.getTestBase().getTestData());

        System.out.println(" rewardsAndCoupons.getBtnContinueCheckout() ==========> "
                + SCHUtils.isPresent(rewardsAndCoupons.getBtnContinueCheckout()));
        SCHUtils.scrollToView(rewardsAndCoupons.getBtnContinueCheckout());
        // SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
        SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnContinueCheckout());
        // rewardsAndCoupons.getBtnContinueCheckout().click();

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);

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
        PauseUtil.waitForAjaxToComplete();
        PauseUtil.pause(4000);



    }

    @Override
    public void verifyhomeIcon_ConfirmationPage() {

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(5000);
        AssertUtils.assertDisplayed(getLnkHome());
    }


    @Override
    public void clickhomeIcon_ConfirmationPage() {

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(5000);
        getLnkHome().click();
        PauseUtil.pause(5000);
    }


    @Override
    public void clickhomeIcon_mainmenu(){

        TeachersHomePage tchhmpge = new TeachersHomePage();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
		/*SCHUtils.scrollToView(tchhmpge.geticonteacherhome());
		PauseUtil.pause(2000);*/
        tchhmpge.geticonteacherhome().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);

    }


    @Override
    public void verifyCheckoutLabel_ConfirmationPage() {

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(5000);


        AssertUtils.assertTextNotMatches(getCheckoutLabel_Confirmpage(),
                Matchers.containsString(ConstantUtils.CONFIRMATIONPAGECHECKOUTLABEL));
    }


    @Override
    public void verifyCheckoutPhases_ConfirmationPage() {

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(5000);
        //Assert.assertTrue(getCheckoutPhases_Confirmpage().size() > 0);
        Assert.assertFalse(getCheckoutPhases_Confirmpage().size() > 0);
    }



    @Override
    public void verifyRewardsText1_CouponsAndRewardsPage(){

        AssertUtils.assertTextMatches(Rewards_earned_amount_message_CouponsRewards(),
                Matchers.containsString(ConstantUtils.REWARDSCOUPONSTEXT1));

    }


    @Override
    public void verifyRewardsText2_CouponsAndRewardsPage(){

        AssertUtils.assertTextMatches(calc_of_qualifying_order_Total_Rewards_page(),
                Matchers.containsString(ConstantUtils.REWARDSCOUPONSTEXT2));

    }


    @Override
    public void verifyRewardsText3_CouponsAndRewardsPage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        calc_of_qualifying_order_Total_Rewards_page().click();
        PauseUtil.pause(1500);
        AssertUtils.assertTextMatches(explanation_of_qualifying_order_Total_Rewards_page(),
                Matchers.containsString(ConstantUtils.REWARDSCOUPONSTEXT3));

    }


    @Override
    public void enter_amount_in_student_Bonus_Bank_Paper_Bank() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double studentclubtotal = StudentClub_BlueBarTotal();

        double bonustoEnter1 = studentclubtotal-2;

        double bonusbank1 = bonustoEnter1/2;
        bonusbank1 = TaxRoundOff(bonusbank1);
        double paperbank1 = bonustoEnter1 - bonusbank1;

        String bonusbank = Double.toString(bonusbank1);
        String paperbank = Double.toString(paperbank1);


        try {
            fld_StudentClub_btn_EDIT().isDisplayed();
            fld_StudentClub_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_StudentClub_BonusBank().click();
        fld_StudentClub_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_StudentClub_BonusBank().sendKeys(bonusbank);

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


        fld_StudentClub_PaperBonus().click();
        fld_StudentClub_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_StudentClub_PaperBonus().sendKeys(paperbank);
        PauseUtil.pause(2000);
        btnSkip1().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


    }



    @Override
    public void enter_amount_in_teacher_Bonus_Bank_Paper_Bank() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double teachclubtotal = TeacherClub_BlueBarTotal();

        double bonustoEnter1 = teachclubtotal - 2;

        double bonusbank1 = bonustoEnter1/2;
        bonusbank1 = TaxRoundOff(bonusbank1);
        double paperbank1 = bonustoEnter1 - bonusbank1;

        String bonusbank = Double.toString(bonusbank1);
        String paperbank = Double.toString(paperbank1);


        try {
            fld_TeacherCat_btn_EDIT().isDisplayed();
            fld_TeacherCat_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_TeacherCat_BonusBank().click();
        fld_TeacherCat_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_TeacherCat_BonusBank().sendKeys(bonusbank);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        fld_TeacherCat_PaperBonus().click();
        fld_TeacherCat_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_TeacherCat_PaperBonus().sendKeys(paperbank);
        PauseUtil.pause(2000);
        btnSkip3().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


    }


    @Override
    public void enter_amount_in_shipping_Bonus_Bank_Paper_Bonus_Coupon() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


        double shippingfeetotal = ShippingFee_BlueBarTotal();

        double bonustoEnter1 = shippingfeetotal - 1;

        double bonusbank1 = bonustoEnter1/2;
        bonusbank1 = TaxRoundOff(bonusbank1);

        double paperbank1 = bonustoEnter1 - bonusbank1;
        paperbank1 = TaxRoundOff(paperbank1);

        String bonusbank = Double.toString(bonusbank1);
        String paperbank = Double.toString(paperbank1);


        try {
            fld_ShippingFee_btn_EDIT().isDisplayed();
            fld_ShippingFee_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_Shipping_BonusBank().click();
        fld_Shipping_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_Shipping_BonusBank().sendKeys(bonusbank);
        PauseUtil.pause(2000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        fld_Shipping_PaperBonus().click();
        fld_Shipping_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_Shipping_PaperBonus().sendKeys(paperbank);
        PauseUtil.pause(2000);
        btnSkip2().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);


    }
    
    
    @Override
    public void teacher_enter_redemptions(String section){
    	CheckoutPage_2 chkpage2 = new CheckoutPage_2();
    	// SFO Redemptions
    	if(section.equalsIgnoreCase("SFO")){
    	if (chkpage2.lst_btn_EDIT_SFO_section_Rewards_page().size() !=0) {
    		chkpage2.btn_EDIT_SFO_section_Rewards_page().click();
    		PauseUtil.waitForAjaxToComplete(2500);
        	PauseUtil.pause(1000);
		}
    	else{
    	chkpage2.fld_Credit_Notes_SFO_section_Rewards_page().click();
    	chkpage2.fld_Credit_Notes_SFO_section_Rewards_page().clear();
    	chkpage2.fld_Credit_Notes_SFO_section_Rewards_page().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("redemptions"));
    	PauseUtil.pause(1000);
    	chkpage2.btn_APPLY_SFO_section_Rewards_page().click();
    	}
    	}
    	
    	//YTO Redemptions
    	if(section.equalsIgnoreCase("YTO")){
    	if(chkpage2.lst_btn_EDIT_YTO_section_Rewards_page().size() !=0) {
    		chkpage2.btn_EDIT_YTO_section_Rewards_page().click();
    		PauseUtil.waitForAjaxToComplete(2500);
        	PauseUtil.pause(1000);
		}
    	else{
    		fld_StudentClub_BonusBank().click();
            fld_StudentClub_BonusBank().clear();
            PauseUtil.pause(2000);
            fld_StudentClub_BonusBank().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("redemptions"));
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(2000);
            fld_StudentClub_PaperBonus().click();
            fld_StudentClub_PaperBonus().clear();
            PauseUtil.pause(2000);
            fld_StudentClub_PaperBonus().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("redemptions"));
            PauseUtil.pause(2000);
            btnSkip1().click();
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(2000);
    	}
    	}
        //TE Redemptions
    	if(section.equalsIgnoreCase("TE")){
        if (chkpage2.lst_btn_EDIT_TE_section_Rewards_page().size() !=0) {
    		chkpage2.btn_EDIT_TE_section_Rewards_page().click();
    		PauseUtil.waitForAjaxToComplete(2500);
        	PauseUtil.pause(1000);
		}
        else{
        	fld_TeacherCat_BonusBank().click();
            fld_TeacherCat_BonusBank().clear();
            PauseUtil.pause(2000);
            fld_TeacherCat_BonusBank().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("redemptions"));
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(2000);
            fld_TeacherCat_PaperBonus().click();
            fld_TeacherCat_PaperBonus().clear();
            PauseUtil.pause(2000);
            fld_TeacherCat_PaperBonus().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("redemptions"));
            PauseUtil.pause(2000);
            btnSkip3().click();
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(2000);
        }
    	} 	
    }
    
    
    @Override
    public void teacher_validate_Student_GST_PST_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double expstudclubsGST = Payment_StudentClub_GST_Total();
        double expstudclubsPST = Payment_StudentClub_PST_Total();

        String actualstud_Gst = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.studGst").toString();
        String actualstud_Pst = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.studPst").toString();
        double actualstud_GST = Double.parseDouble(actualstud_Gst);
        double actualstud_PST = Double.parseDouble(actualstud_Pst);

        Assert.assertEquals(expstudclubsGST, actualstud_GST, "Student Club GST is incorrect from rewards page to payment page");
        Assert.assertEquals(expstudclubsPST, actualstud_PST, "Student Club PST is incorrect from rewards page to payment page");
    }


    @Override
    public void teacher_validate_Teacher_GST_PST_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double expteachclubsGST = Payment_TeacherClub_GST_Total();
        double expteachclubsPST = Payment_TeacherClub_PST_Total();

        String actualteach_Gst = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.teacherGst").toString();
        String actualteach_Pst = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.teacherPst").toString();
        double actualteach_GST = Double.parseDouble(actualteach_Gst);
        double actualteach_PST = Double.parseDouble(actualteach_Pst);

        Assert.assertEquals(expteachclubsGST, actualteach_GST, "Teacher Club GST is incorrect from rewards page to payment page");
        Assert.assertEquals(expteachclubsPST, actualteach_PST, "Teacher Club PST is incorrect from rewards page to payment page");
    }


    @Override
    public void teacher_validate_Student_GST_QST_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double expstudclubsGST = Payment_StudentClub_GST_Total();
        double expstudclubsQST = Payment_StudentClub_QST_Total();

        String actualstud_Gst = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.studGst").toString();
        String actualstud_Qst = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.studQst").toString();
        double actualstud_GST = Double.parseDouble(actualstud_Gst);
        double actualstud_QST = Double.parseDouble(actualstud_Qst);

        Assert.assertEquals(expstudclubsGST, actualstud_GST, "Student Club GST is incorrect from rewards page to payment page");
        Assert.assertEquals(expstudclubsQST, actualstud_QST, "Student Club QST is incorrect from rewards page to payment page");
    }


    @Override
    public void teacher_validate_Teacher_GST_QST_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double expteachclubsGST = Payment_TeacherClub_GST_Total();
        double expteachclubsQST = Payment_TeacherClub_QST_Total();

        String actualteach_Gst = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.teacherGst").toString();
        String actualteach_Qst = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.teacherQst").toString();
        double actualteach_GST = Double.parseDouble(actualteach_Gst);
        double actualteach_QST = Double.parseDouble(actualteach_Qst);

        Assert.assertEquals(expteachclubsGST, actualteach_GST, "Teacher Club GST is incorrect from rewards page to payment page");
        Assert.assertEquals(expteachclubsQST, actualteach_QST, "Teacher Club QST is incorrect from rewards page to payment page");
    }

    @Override
    public void teacher_validate_Student_GST_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double expstudclubsGST = Payment_StudentClub_GST_Total();

        String actualstud_Gst = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.studGst").toString();
        double actualstud_GST = Double.parseDouble(actualstud_Gst);


        Assert.assertEquals(expstudclubsGST, actualstud_GST, "Student Club GST is incorrect from rewards page to payment page");
    }


    @Override
    public void teacher_validate_Teacher_GST_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double expteachclubsGST = Payment_TeacherClub_GST_Total();

        String actualteach_Gst = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.teacherGst").toString();
        double actualteach_GST = Double.parseDouble(actualteach_Gst);

        Assert.assertEquals(expteachclubsGST, actualteach_GST, "Teacher Club GST is incorrect from rewards page to payment page");

    }

    @Override
    public void teacher_validate_Student_HST_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double expstudclubsHST = Payment_StudentClub_HST_Total();

        String actualstud_Hst = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.studHst").toString();
        double actualstud_HST = Double.parseDouble(actualstud_Hst);


        Assert.assertEquals(expstudclubsHST, actualstud_HST, "Student Club HST is incorrect from rewards page to payment page");
    }


    @Override
    public void teacher_validate_Teacher_HST_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double expteachclubsHST = Payment_TeacherClub_HST_Total();

        String actualteach_Hst = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.teacherHst").toString();
        double actualteach_HST = Double.parseDouble(actualteach_Hst);

        Assert.assertEquals(expteachclubsHST, actualteach_HST, "Teacher Club HST is incorrect from rewards page to payment page");

    }

    @Override
    public void teacher_validate_Shipping_GST_PST_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double expshippingGST = Payment_Shipping_GST_Total();
        double expshippingPST = Payment_Shipping_PST_Total();

        String actualshipping_Gst = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.shippingGst").toString();
        String actualshipping_Pst = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.shippingPst").toString();
        double actualshipping_GST = Double.parseDouble(actualshipping_Gst);
        double actualshipping_PST = Double.parseDouble(actualshipping_Pst);

        Assert.assertEquals(expshippingGST, actualshipping_GST, "Shipping GST is incorrect from rewards page to payment page");
        Assert.assertEquals(expshippingPST, actualshipping_PST, "Shipping PST is incorrect from rewards page to payment page");
    }


    @Override
    public void teacher_validate_Shipping_GST_QST_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double expshippingGST = Payment_Shipping_GST_Total();
        double expshippingQST = Payment_Shipping_QST_Total();

        String actualshipping_Gst = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.shippingGst").toString();
        String actualshipping_Qst = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.shippingQst").toString();
        double actualshipping_GST = Double.parseDouble(actualshipping_Gst);
        double actualshipping_QST = Double.parseDouble(actualshipping_Qst);

        Assert.assertEquals(expshippingGST, actualshipping_GST, "shipping GST is incorrect from rewards page to payment page");
        Assert.assertEquals(expshippingQST, actualshipping_QST, "shipping QST is incorrect from rewards page to payment page");
    }

    @Override
    public void teacher_validate_Shipping_GST_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double expshippingGST = Payment_Shipping_GST_Total();

        String actualshipping_Gst = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.shippingGst").toString();
        double actualshipping_GST = Double.parseDouble(actualshipping_Gst);

        Assert.assertEquals(expshippingGST, actualshipping_GST, "shipping GST is incorrect from rewards page to payment page");

    }

    @Override
    public void teacher_validate_Shipping_HST_paymentpage(){

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double expshippingHST = Payment_Shipping_HST_Total();

        String actualshipping_Hst = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.shippingHst").toString();
        double actualshipping_HST = Double.parseDouble(actualshipping_Hst);

        Assert.assertEquals(expshippingHST, actualshipping_HST, "shipping HST is incorrect from rewards page to payment page");

    }


    public void verifyFreeShippingCharge_Paymentpage(String shippingCharge) {

        String ActualShippingCharge = getlblpaymentshippingandhandlingbluebar().getText().trim();
        if(!ActualShippingCharge.equals(shippingCharge))
        {
            Assert.fail("Shipping charge should be FREE for Items eligible for Free Shipping in payment page");
        }
    }


    @Override
    public void verifytaxlinesize_paymentpage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        Assert.assertEquals(sizegetlblpaymentshippinggstvalue().size() > 0, false);
    }


    public double ReviewCart_Total_Amt_Owing()
    {
        RewardsAndCoupons r = new RewardsAndCoupons();

        String totalamtowing1=r.getlblTotalAmountOwing().getText();
        String totalamtowing12 = totalamtowing1.substring(1);
        double totalamtowing=Double.parseDouble(totalamtowing12);
        System.out.println("Total Amount Owing in Review Cart is:###########" + totalamtowing);
        return totalamtowing;
    }


    public double ReviewCart_SubTotal_Amt()
    {
        CartPage crtpge = new CartPage();

        String totalamtowing1=crtpge.get_reviewcart_studentclub_subtotal().getText();
        String totalamtowing12 = totalamtowing1.substring(1);
        double totalamtowing=Double.parseDouble(totalamtowing12);
        System.out.println("Student Club Sub Total in Review Cart is:###########" + totalamtowing);
        return totalamtowing;
    }



    public double PopUp_RewardTable_Total_Amt()
    {

        String totalamtowing1=getlblcheckoutpopuprewardstablecurrenttotalorder().getText();
        String totalamtowing12 = totalamtowing1.substring(1);
        double rewardtable_currenttotalordervalue=Double.parseDouble(totalamtowing12);
        System.out.println("Total Amount Owing in Reward table is :###########" + rewardtable_currenttotalordervalue);
        return rewardtable_currenttotalordervalue;
    }



    @Override
    public void verifycurrenttotalorderValue_rewardtable() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double rewardtable_totalamt = PopUp_RewardTable_Total_Amt();
        System.out.println("reward table current order total: "+rewardtable_totalamt);

        String reviewcart_totalamt1 = TestBaseProvider.getTestBase().getContext()
                .getProperty("testexecution.reviewcart_studentclubsubtotal").toString();
        double reviewcart_totalamt = Double.parseDouble(reviewcart_totalamt1);
        if(rewardtable_totalamt!=reviewcart_totalamt)
        {
            Assert.fail("Current Order Total is not matching with exact order total value. It should have been: "+reviewcart_totalamt);
        }

    }


    @Override
    public void verifyhighlighedrowpopuprewardtable(){

        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double rewardtable_totalamt = PopUp_RewardTable_Total_Amt();
        System.out.println("reward table current order total: "+rewardtable_totalamt);
        WebDriver driver=TestBaseProvider.getTestBase().getDriver();

        String path="//tr[@class='on'][@data-msg-hd='Congratulations!']";
        String datalow1=driver.findElement(By.xpath(path)).getAttribute("data-lo");
        double datalow = Double.parseDouble(datalow1);
        System.out.println("DATA LOW##########################: "+datalow);

        String datahigh1=driver.findElement(By.xpath(path)).getAttribute("data-hi");
        double datahigh = Double.parseDouble(datahigh1);
        System.out.println("DATA HIGH##########################: "+datahigh);

        if(rewardtable_totalamt>=datalow && rewardtable_totalamt<=datahigh){
            System.out.println("The current total value is highlighted");

        }
        else{
            Assert.fail("The current total value is highlighted in the pop-up reward table");
        }

    }


    @Override
    //Checking for single Free Item for english
    public void verify_Grade1_CallOutMsg_rewardsection_english() {

        PauseUtil.waitForAjaxToComplete(3000);
        PauseUtil.pause(2000);

        int freeitem_size = fld_FreeItem_Section_RewardsPage().size();
        System.out.println("size of free item"+freeitem_size);
        Assert.assertEquals(fld_FreeItem_Section_RewardsPage().size() >= 1, true);
        Assert.assertEquals(fld_FreeItem_Section_RewardsPage().size() >= 2, false);
        Assert.assertEquals(sizefld_StudentIncentive_Section_RewardsPage().size() >=1, true);
        Assert.assertEquals(sizefld_StudentIncentive_Section_RewardsPage().size() >=2, false);

        AssertUtils.assertDisplayed(fld_FreeItem1_Section_RewardsPage());
        AssertUtils.assertTextMatches(fld_FreeItem1_Section_RewardsPage(),
                Matchers.containsString(ConstantUtils.GRADE1_CALLOUT_MSG));

        AssertUtils.assertDisplayed(fld_StudentIncentive1_Section_RewardsPage());
        AssertUtils.assertTextMatches(fld_StudentIncentive1_Section_RewardsPage(),
                Matchers.containsString(ConstantUtils.GRADE3_CALLOUT_MSG));
    }

    @Override
    //Checking for single Student Incentive for english
    public void verify_Grade3_CallOutMsg_rewardsection_english() {

        PauseUtil.waitForAjaxToComplete(3000);
        PauseUtil.pause(2000);

        int studentincentive_size = sizefld_StudentIncentive_Section_RewardsPage().size();
        System.out.println("size of free item"+studentincentive_size);
        Assert.assertEquals(sizefld_StudentIncentive_Section_RewardsPage().size() >= 1, true);
        Assert.assertEquals(sizefld_StudentIncentive_Section_RewardsPage().size() >= 2, false);

        AssertUtils.assertDisplayed(fld_StudentIncentive1_Section_RewardsPage());
        AssertUtils.assertTextMatches(fld_StudentIncentive1_Section_RewardsPage(),
                Matchers.containsString(ConstantUtils.GRADE3_CALLOUT_MSG));

        Assert.assertEquals(fld_FreeItem_Section_RewardsPage().size() >=1, false);
    }


    @Override

    //Checking for single Free Item and single Student Incentive for english
    public void verify_Grade5_CallOutMsg_rewardsection_english() {

        PauseUtil.waitForAjaxToComplete(3000);
        PauseUtil.pause(2000);

        Assert.assertEquals(fld_FreeItem_Section_RewardsPage().size() >= 1, true);
        Assert.assertEquals(fld_FreeItem_Section_RewardsPage().size() >= 2, false);

        Assert.assertEquals(sizefld_StudentIncentive_Section_RewardsPage().size() >= 1, true);
        Assert.assertEquals(sizefld_StudentIncentive_Section_RewardsPage().size() >= 2, false);

        AssertUtils.assertDisplayed(fld_FreeItem1_Section_RewardsPage());
        AssertUtils.assertTextMatches(fld_FreeItem1_Section_RewardsPage(),
                Matchers.containsString(ConstantUtils.GRADE5_FREEITEM_CALLOUT_MSG));

        AssertUtils.assertDisplayed(fld_StudentIncentive1_Section_RewardsPage());
        AssertUtils.assertTextMatches(fld_StudentIncentive1_Section_RewardsPage(),
                Matchers.containsString(ConstantUtils.GRADE5_STUDENTINCENTIVE1_CALLOUT_MSG));

    }

    @Override

    //Checking for single Student Incentive for english with no grade
    public void verify_NoGrade_StudentIncentive_CallOutMsg_rewardsection_english() {

        PauseUtil.waitForAjaxToComplete(3000);
        PauseUtil.pause(2000);

        Assert.assertEquals(fld_FreeItem_Section_RewardsPage().size() >= 1, false);
        Assert.assertEquals(fld_FreeItem_Section_RewardsPage().size() >= 2, false);

        Assert.assertEquals(sizefld_StudentIncentive_Section_RewardsPage().size() >= 1, true);
        Assert.assertEquals(sizefld_StudentIncentive_Section_RewardsPage().size() >= 2, false);

        AssertUtils.assertDisplayed(fld_StudentIncentive1_Section_RewardsPage());
        AssertUtils.assertTextMatches(fld_StudentIncentive1_Section_RewardsPage(),
                Matchers.containsString(ConstantUtils.NOGRADE_STUDENTINCENTIVE1_CALLOUT_MSG));

    }


    @Override

    //Checking for single Student Incentive for english with no grade
    public void verify_NoGrade_NoLanguage_StudentIncentive_CallOutMsg_rewardsection_english() {

        PauseUtil.waitForAjaxToComplete(3000);
        PauseUtil.pause(2000);

        Assert.assertEquals(fld_FreeItem_Section_RewardsPage().size() >= 1, false);
        Assert.assertEquals(fld_FreeItem_Section_RewardsPage().size() >= 2, false);

        Assert.assertEquals(sizefld_StudentIncentive_Section_RewardsPage().size() >= 1, true);
        Assert.assertEquals(sizefld_StudentIncentive_Section_RewardsPage().size() >= 2, false);

        AssertUtils.assertDisplayed(fld_StudentIncentive1_Section_RewardsPage());
        AssertUtils.assertTextMatches(fld_StudentIncentive1_Section_RewardsPage(),
                Matchers.containsString(ConstantUtils.NOGRADE_NOLANGUAGE_STUDENTINCENTIVE1_CALLOUT_MSG));

    }

    @Override
    //Checking for two Free Item for english
    public void verify_Grade7_CallOutMsg_rewardsection_english() {

        PauseUtil.waitForAjaxToComplete(3000);
        PauseUtil.pause(2000);

        Assert.assertEquals(fld_FreeItem_Section_RewardsPage().size() >= 2, true);
        Assert.assertEquals(fld_FreeItem_Section_RewardsPage().size() >= 3, false);

        AssertUtils.assertDisplayed(fld_FreeItem1_Section_RewardsPage());
        AssertUtils.assertTextMatches(fld_FreeItem1_Section_RewardsPage(),
                Matchers.containsString(ConstantUtils.GRADE7_FREEITEM1_CALLOUT_MSG));

        AssertUtils.assertDisplayed(fld_FreeItem2_Section_RewardsPage());
        AssertUtils.assertTextMatches(fld_FreeItem2_Section_RewardsPage(),
                Matchers.containsString(ConstantUtils.GRADE7_FREEITEM2_CALLOUT_MSG));

        Assert.assertEquals(sizefld_StudentIncentive_Section_RewardsPage().size() >=1, false);
    }


    @Override
    //Checking for two Student Incentive for english
    public void verify_Grade9_CallOutMsg_rewardsection_english() {

        PauseUtil.waitForAjaxToComplete(3000);
        PauseUtil.pause(2000);

        Assert.assertEquals(sizefld_StudentIncentive_Section_RewardsPage().size() >= 2, true);
        Assert.assertEquals(sizefld_StudentIncentive_Section_RewardsPage().size() >= 3, false);

        AssertUtils.assertDisplayed(fld_StudentIncentive1_Section_RewardsPage());
        AssertUtils.assertTextMatches(fld_StudentIncentive1_Section_RewardsPage(),
                Matchers.containsString(ConstantUtils.GRADE9_STUDENTINCENTIVE1_CALLOUT_MSG));

        AssertUtils.assertDisplayed(fld_StudentIncentive2_Section_RewardsPage());
        AssertUtils.assertTextMatches(fld_StudentIncentive2_Section_RewardsPage(),
                Matchers.containsString(ConstantUtils.GRADE9_STUDENTINCENTIVE2_CALLOUT_MSG));

        Assert.assertEquals(fld_FreeItem_Section_RewardsPage().size() >=1, false);
    }


    @Override
    //Checking for two free items and two Student Incentive for english
    public void verify_Grade11_CallOutMsg_rewardsection_english() {

        PauseUtil.waitForAjaxToComplete(3000);
        PauseUtil.pause(2000);

        Assert.assertEquals(fld_FreeItem_Section_RewardsPage().size() >= 2, true);
        Assert.assertEquals(fld_FreeItem_Section_RewardsPage().size() >= 3, false);

        Assert.assertEquals(sizefld_StudentIncentive_Section_RewardsPage().size() >= 2, true);
        Assert.assertEquals(sizefld_StudentIncentive_Section_RewardsPage().size() >= 3, false);

        AssertUtils.assertDisplayed(fld_FreeItem1_Section_RewardsPage());
        AssertUtils.assertTextMatches(fld_FreeItem1_Section_RewardsPage(),
                Matchers.containsString(ConstantUtils.GRADE11_FREEITEM1_CALLOUT_MSG));

        AssertUtils.assertDisplayed(fld_FreeItem2_Section_RewardsPage());
        AssertUtils.assertTextMatches(fld_FreeItem2_Section_RewardsPage(),
                Matchers.containsString(ConstantUtils.GRADE11_FREEITEM2_CALLOUT_MSG));

        AssertUtils.assertDisplayed(fld_StudentIncentive1_Section_RewardsPage());
        AssertUtils.assertTextMatches(fld_StudentIncentive1_Section_RewardsPage(),
                Matchers.containsString(ConstantUtils.GRADE11_STUDENTINCENTIVE1_CALLOUT_MSG));

        AssertUtils.assertDisplayed(fld_StudentIncentive2_Section_RewardsPage());
        AssertUtils.assertTextMatches(fld_StudentIncentive2_Section_RewardsPage(),
                Matchers.containsString(ConstantUtils.GRADE11_STUDENTINCENTIVE2_CALLOUT_MSG));
    }


    @Override
    //Checking for single Free Item for french
    public void verify_Grade1_CallOutMsg_rewardsection_french() {

        PauseUtil.waitForAjaxToComplete(3000);
        PauseUtil.pause(2000);

        int freeitem_size = fld_FreeItem_Section_RewardsPage().size();
        System.out.println("size of free item"+freeitem_size);
        Assert.assertEquals(fld_FreeItem_Section_RewardsPage().size() >= 1, true);
        Assert.assertEquals(fld_FreeItem_Section_RewardsPage().size() >= 2, false);

        AssertUtils.assertDisplayed(fld_FreeItem1_Section_RewardsPage());
        AssertUtils.assertTextMatches(fld_FreeItem1_Section_RewardsPage(),
                Matchers.containsString(ConstantUtils.GRADE1_FRENCH_CALLOUT_MSG));

        Assert.assertEquals(sizefld_StudentIncentive_Section_RewardsPage().size() >=1, false);
    }

    @Override
    //Checking for single Student Incentive for french
    public void verify_Grade3_CallOutMsg_rewardsection_french() {

        PauseUtil.waitForAjaxToComplete(3000);
        PauseUtil.pause(2000);

        Assert.assertEquals(sizefld_StudentIncentive_Section_RewardsPage().size() >= 1, true);
        Assert.assertEquals(sizefld_StudentIncentive_Section_RewardsPage().size() >= 2, false);

        AssertUtils.assertDisplayed(fld_StudentIncentive1_Section_RewardsPage());
        AssertUtils.assertTextMatches(fld_StudentIncentive1_Section_RewardsPage(),
                Matchers.containsString(ConstantUtils.GRADE3_FRENCH_CALLOUT_MSG));

        Assert.assertEquals(fld_FreeItem_Section_RewardsPage().size() >=1, false);
    }


    @Override
    public void click_dts_paginate2() {

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(3000);
        PauseUtil.pause(2000);
        getICouponSection().getdtspaginate2().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(3000);
        PauseUtil.pause(2000);


    }

    @Override
    public void Select_Alternate_Shipping_Address_Checkbox(){
        //SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        chkBox_alternateShipping_Payment().click();
        PauseUtil.pause(1500);
    }


    @Override
    public void teacher_enter_postalCode_Paymentpage_alternativeaddress() throws AWTException{
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(3000);
        getfld_alternativeshipping_postalcode().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("postalcode"));
        PauseUtil.pause(1500);
        getfld_alternativeshipping_city().sendKeys(Keys.TAB);
        PauseUtil.pause(1500);


    }

    @Override
    public void teacher_enter_correctpostalcode_paymentpage_alternativeaddress() throws AWTException{
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(3000);
        getfld_alternativeshipping_postalcode().clear();
        getfld_alternativeshipping_postalcode().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("correct_postalcode"));
        PauseUtil.pause(1500);
        getfld_alternativeshipping_city().sendKeys(Keys.TAB);
        PauseUtil.pause(1500);


    }


    @Override
    public void teacher_enter_postalCode_Paymentpage_alternativeaddress_otherDetails() throws AWTException{
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(3000);
        getfld_alternativeshipping_address1().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("address1"));
        PauseUtil.pause(1500);
        getfld_alternativeshipping_address2().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("address2"));
        PauseUtil.pause(1500);
        getfld_alternativeshipping_postalcode().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("postalcode"));
        PauseUtil.pause(1500);
        getfld_alternativeshipping_city().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("city"));
        PauseUtil.pause(1500);
        getfld_alternativeshipping_city().sendKeys(Keys.TAB);
        PauseUtil.pause(1500);


    }


    @Override
    public void verify_autoformatted_postalcode(Configuration testData){
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(3000);
        String correctpostalcode = getfld_alternativeshipping_postalcode().getAttribute("value").toUpperCase();
        String exp_correctpostalcode = testData.getString("correct_postalcode");
        System.out.println("postal code value is :" +getfld_alternativeshipping_postalcode().getAttribute("value"));
        System.out.println("postal code is :" +correctpostalcode);
        System.out.println("postal code is actual:" +exp_correctpostalcode);
        if(!correctpostalcode.equals(exp_correctpostalcode)){
            Assert.fail("Postal code is not auto formatting");
        }
    }


    @Override
    public void verify_placeholder_postalcode(Configuration testData){
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(3000);
        String actual_postalcodeplaceholder = getfld_alternativeshipping_postalcode().getAttribute("placeholder");
        String exp_postalcodeplaceholder = testData.getString("exp_postalcodeplaceholder");
        System.out.println("actual_postalcodeplaceholder is : "+actual_postalcodeplaceholder);
        System.out.println("exp_postalcodeplaceholder is : "+exp_postalcodeplaceholder);
        if(!actual_postalcodeplaceholder.equals(exp_postalcodeplaceholder)){
            Assert.fail("Place holder is not correct in postal code text field");
        }
    }


    @Override
    public void validate_province_alternativeshipping(Configuration testData){
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(3000);
        AssertUtils.assertTextMatches(getfld_alternativeshipping_selectedprovince(),
                Matchers.containsString(testData.getString("province")));


    }

    @Override
    public void validate_provincefield_readonly(){
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(3000);

        Assert.assertTrue(sizefld_alternativeshipping_selectedprovincelocked().size() > 0);

        System.out.println("disabled layer: "+getfld_alternativeshipping_selectedprovincelocked().getAttribute("class"));
        Assert.assertTrue(getfld_alternativeshipping_selectedprovincelocked().getAttribute("class")
                .contains("disabled-layer"));

    }

    @Override
    public void CSR_Validation_of_Teacher_catalogues_GST_PST_ShippingChargers_Total_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");
        double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");

        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_act=Double.parseDouble(TeacherCatSubTotal);

        String GST_value_TeacherCat=value_GST_TeacherCat_RewardsCouponsPage().getText();
        GST_value_TeacherCat = GST_value_TeacherCat.substring(1);
        double GST_value_TeacherCat_act=Double.parseDouble(GST_value_TeacherCat);

        String PST_value_TeacherCat=value_PST_TeacherCat_RewardsCouponsPage().getText();
        PST_value_TeacherCat = PST_value_TeacherCat.substring(1);
        double PST_value_TeacherCat_act=Double.parseDouble(PST_value_TeacherCat);

        double GST_value_TeacherCat_exp=(TeacherCatSubTotal_act * stateTaxGST)/100;
        GST_value_TeacherCat_exp=TaxRoundOff(GST_value_TeacherCat_exp);
        Assert.assertEquals(GST_value_TeacherCat_act, GST_value_TeacherCat_exp, "Teacher Catalogues GST value is incorrect in Redemptions & Rewards Page");

        double PST_value_TeacherCat_exp=(TeacherCatSubTotal_act * stateTaxPST)/100;
        PST_value_TeacherCat_exp=TaxRoundOff(PST_value_TeacherCat_exp);
        Assert.assertEquals(PST_value_TeacherCat_act, PST_value_TeacherCat_exp, "Teacher Catalogues PST value is incorrect in Redemptions & Rewards Page");

        String TeacherCatTotValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherCatTotValue = TeacherCatTotValue.substring(1);
        double TeacherCatTotValue_act=Double.parseDouble(TeacherCatTotValue);

        double TeacherCataloguesTotalValue_exp=TeacherCatSubTotal_act+GST_value_TeacherCat_exp+PST_value_TeacherCat_exp;
        TeacherCataloguesTotalValue_exp=TaxRoundOff(TeacherCataloguesTotalValue_exp);

        Assert.assertEquals(TeacherCatTotValue_act, TeacherCataloguesTotalValue_exp, "Teacher Catalogues Total Amount owing is incorrect in Redemptions & Rewards Page");


        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=TeacherCataloguesTotalValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));
			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_act=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_act);
            double Total_owing_exp=TeacherCataloguesTotalValue_exp+ShippingValue_act;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");
		}*/	
	}

    @Override
    public void CSR_Validation_of_Teacher_catalogues_GST_QST_ShippingChargers_Total_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");
        double stateTaxQST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxQST");

        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_act=Double.parseDouble(TeacherCatSubTotal);

        String GST_value_TeacherCat=value_GST_TeacherCat_RewardsCouponsPage().getText();
        GST_value_TeacherCat = GST_value_TeacherCat.substring(1);
        double GST_value_TeacherCat_act=Double.parseDouble(GST_value_TeacherCat);

        String QST_value_TeacherCat=value_QST_TeacherCat_RewardsCouponsPage().getText();
        QST_value_TeacherCat = QST_value_TeacherCat.substring(1);
        double QST_value_TeacherCat_act=Double.parseDouble(QST_value_TeacherCat);

        double GST_value_TeacherCat_exp=(TeacherCatSubTotal_act * stateTaxGST)/100;
        GST_value_TeacherCat_exp=TaxRoundOff(GST_value_TeacherCat_exp);
        Assert.assertEquals(GST_value_TeacherCat_act, GST_value_TeacherCat_exp, "Teacher Catalogues GST value is incorrect in Redemptions & Rewards Page");

        double QST_value_TeacherCat_exp=(TeacherCatSubTotal_act * stateTaxQST)/100;
        QST_value_TeacherCat_exp=TaxRoundOff(QST_value_TeacherCat_exp);
        Assert.assertEquals(QST_value_TeacherCat_act, QST_value_TeacherCat_exp, "Teacher Catalogues QST value is incorrect in Redemptions & Rewards Page");

        String TeacherCatTotValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherCatTotValue = TeacherCatTotValue.substring(1);
        double TeacherCatTotValue_act=Double.parseDouble(TeacherCatTotValue);

        double TeacherCataloguesTotalValue_exp=TeacherCatSubTotal_act+GST_value_TeacherCat_exp+QST_value_TeacherCat_exp;
        TeacherCataloguesTotalValue_exp=TaxRoundOff(TeacherCataloguesTotalValue_exp);

        Assert.assertEquals(TeacherCatTotValue_act, TeacherCataloguesTotalValue_exp, "Teacher Catalogues Total Amount owing is incorrect in Redemptions & Rewards Page");


        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=TeacherCataloguesTotalValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_act=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_act);
            double Total_owing_exp=TeacherCataloguesTotalValue_exp+ShippingValue_act;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");
		}*/	
	}

    @Override
    public void CSR_Validation_of_Teacher_catalogues_HST_ShippingChargers_Total_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double stateTaxHST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxHST");

        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_act=Double.parseDouble(TeacherCatSubTotal);

        String HST_value_TeacherCat=value_HST_TeacherCat_RewardsCouponsPage().getText();
        HST_value_TeacherCat = HST_value_TeacherCat.substring(1);
        double HST_value_TeacherCat_act=Double.parseDouble(HST_value_TeacherCat);

        double HST_value_TeacherCat_exp=(TeacherCatSubTotal_act * stateTaxHST)/100;
        HST_value_TeacherCat_exp=TaxRoundOff(HST_value_TeacherCat_exp);
        Assert.assertEquals(HST_value_TeacherCat_act, HST_value_TeacherCat_exp, "Teacher Catalogues HST value is incorrect in Redemptions & Rewards Page");

        String TeacherCatTotValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherCatTotValue = TeacherCatTotValue.substring(1);
        double TeacherCatTotValue_act=Double.parseDouble(TeacherCatTotValue);

        double TeacherCataloguesTotalValue_exp=TeacherCatSubTotal_act+HST_value_TeacherCat_exp;
        TeacherCataloguesTotalValue_exp=TaxRoundOff(TeacherCataloguesTotalValue_exp);

        Assert.assertEquals(TeacherCatTotValue_act, TeacherCataloguesTotalValue_exp, "Teacher Catalogues Total Amount owing is incorrect in Redemptions & Rewards Page");


        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=TeacherCataloguesTotalValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");

        } else if (!ShippingValue.equals("FREE!")) {

            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_act=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_act);
            double Total_owing_exp=TeacherCataloguesTotalValue_exp+ShippingValue_act;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");
		}*/	
	}

    @Override
    public void CSR_Validation_of_Teacher_catalogues_GST_ShippingChargers_Total_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");

        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_act=Double.parseDouble(TeacherCatSubTotal);

        String GST_value_TeacherCat=value_GST_TeacherCat_RewardsCouponsPage().getText();
        GST_value_TeacherCat = GST_value_TeacherCat.substring(1);
        double GST_value_TeacherCat_act=Double.parseDouble(GST_value_TeacherCat);

        double GST_value_TeacherCat_exp=(TeacherCatSubTotal_act * stateTaxGST)/100;
        GST_value_TeacherCat_exp=TaxRoundOff(GST_value_TeacherCat_exp);
        Assert.assertEquals(GST_value_TeacherCat_act, GST_value_TeacherCat_exp, "Teacher Catalogues GST value is incorrect in Redemptions & Rewards Page");

        String TeacherCatTotValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherCatTotValue = TeacherCatTotValue.substring(1);
        double TeacherCatTotValue_act=Double.parseDouble(TeacherCatTotValue);

        double TeacherCataloguesTotalValue_exp=TeacherCatSubTotal_act+GST_value_TeacherCat_exp;
        TeacherCataloguesTotalValue_exp=TaxRoundOff(TeacherCataloguesTotalValue_exp);

        Assert.assertEquals(TeacherCatTotValue_act, TeacherCataloguesTotalValue_exp, "Teacher Catalogues Total Amount owing is incorrect in Redemptions & Rewards Page");


        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=TeacherCataloguesTotalValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_act=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_act);
            double Total_owing_exp=TeacherCataloguesTotalValue_exp+ShippingValue_act;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");
		}*/	
	}

    @Override
    public void CSR_Validation_of_noTaxes_for_Teacher_catalogues_GST_PST_ShippingChargers_Total_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        if (value_GST_TeacherCat_RewardsCouponsPage().isDisplayed()) {
            String Teacher_gst=value_GST_TeacherCat_RewardsCouponsPage().getText();
            Teacher_gst = Teacher_gst.substring(1);
            double Teacher_gst_2=Double.parseDouble(Teacher_gst);
            double value=0.0;
            Assert.assertEquals(value, Teacher_gst_2, "GST value is displayed for Teacher_Catalogues_Subtotal in Redemptions & Rewards Page");
        } else if (value_PST_TeacherCat_RewardsCouponsPage().isDisplayed()) {
            String Teacher_pst=value_PST_TeacherCat_RewardsCouponsPage().getText();
            Teacher_pst = Teacher_pst.substring(1);
            double Teacher_pst_2=Double.parseDouble(Teacher_pst);
            double value=0.0;
            Assert.assertEquals(value, Teacher_pst_2, "PST value is displayed for Teacher_Catalogues_Subtotal in Redemptions & Rewards Page");

        } else {
            Assert.fail("No taxes are displayed");

        }

        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_act=Double.parseDouble(TeacherCatSubTotal);

        String TeacherCatTotValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherCatTotValue = TeacherCatTotValue.substring(1);
        double TeacherCatTotValue_act=Double.parseDouble(TeacherCatTotValue);

        double TeacherCataloguesTotalValue_exp=TeacherCatSubTotal_act;
        TeacherCataloguesTotalValue_exp=TaxRoundOff(TeacherCataloguesTotalValue_exp);

        Assert.assertEquals(TeacherCatTotValue_act, TeacherCataloguesTotalValue_exp, "Teacher Catalogues Total Amount owing is incorrect in Redemptions & Rewards Page");


        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=TeacherCataloguesTotalValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");

        } else if (!ShippingValue.equals("FREE!")) {

            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_act=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_act);
            double Total_owing_exp=TeacherCataloguesTotalValue_exp+ShippingValue_act;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");
		}*/	
	}

    @Override
    public void CSR_Validation_of_noTaxes_for_Teacher_catalogues_GST_QST_ShippingChargers_Total_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        if (value_GST_TeacherCat_RewardsCouponsPage().isDisplayed()) {
            String Teacher_gst=value_GST_TeacherCat_RewardsCouponsPage().getText();
            Teacher_gst = Teacher_gst.substring(1);
            double Teacher_gst_2=Double.parseDouble(Teacher_gst);
            double value=0.0;
            Assert.assertEquals(value, Teacher_gst_2, "GST value is displayed for Teacher_Catalogues_Subtotal in Redemptions & Rewards Page");
        } else if (value_QST_TeacherCat_RewardsCouponsPage().isDisplayed()) {
            String Teacher_qst=value_QST_TeacherCat_RewardsCouponsPage().getText();
            Teacher_qst = Teacher_qst.substring(1);
            double Teacher_qst_2=Double.parseDouble(Teacher_qst);
            double value=0.0;
            Assert.assertEquals(value, Teacher_qst_2, "QST value is displayed for Teacher_Catalogues_Subtotal in Redemptions & Rewards Page");

        } else {
            Assert.fail("No taxes are displayed");

        }

        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_act=Double.parseDouble(TeacherCatSubTotal);

        String TeacherCatTotValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherCatTotValue = TeacherCatTotValue.substring(1);
        double TeacherCatTotValue_act=Double.parseDouble(TeacherCatTotValue);

        double TeacherCataloguesTotalValue_exp=TeacherCatSubTotal_act;
        TeacherCataloguesTotalValue_exp=TaxRoundOff(TeacherCataloguesTotalValue_exp);

        Assert.assertEquals(TeacherCatTotValue_act, TeacherCataloguesTotalValue_exp, "Teacher Catalogues Total Amount owing is incorrect in Redemptions & Rewards Page");


        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=TeacherCataloguesTotalValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_act=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_act);
            double Total_owing_exp=TeacherCataloguesTotalValue_exp+ShippingValue_act;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");
		}*/	
	}

    @Override
    public void CSR_Validation_of_Student_Clubs_GST_PST_ShippingChargers_Total_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");
        double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");

        String StudentClubsSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubsSubTotal = StudentClubsSubTotal.substring(1);
        double StudentClubsSubTotal_act=Double.parseDouble(StudentClubsSubTotal);

        String GST_value_StudentClubs=value_GST_StudentClub_RewardsCouponsPage().getText();
        GST_value_StudentClubs = GST_value_StudentClubs.substring(1);
        double GST_value_StudentClubs_act=Double.parseDouble(GST_value_StudentClubs);

        String PST_value_StudentClubs=value_PST_StudentClub_RewardsCouponsPage().getText();
        PST_value_StudentClubs = PST_value_StudentClubs.substring(1);
        double PST_value_StudentClubs_act=Double.parseDouble(PST_value_StudentClubs);

        double GST_value_StudentClubs_exp=(StudentClubsSubTotal_act * stateTaxGST)/100;
        GST_value_StudentClubs_exp=TaxRoundOff(GST_value_StudentClubs_exp);
        Assert.assertEquals(GST_value_StudentClubs_act, GST_value_StudentClubs_exp, "Student Clubs GST value is incorrect in Redemptions & Rewards Page");

        double PST_value_StudentClubs_exp=(StudentClubsSubTotal_act * stateTaxPST)/100;
        PST_value_StudentClubs_exp=TaxRoundOff(PST_value_StudentClubs_exp);
        Assert.assertEquals(PST_value_StudentClubs_act, PST_value_StudentClubs_exp, "Student Clubs PST value is incorrect in Redemptions & Rewards Page");

        String StudentClubsTotValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubsTotValue = StudentClubsTotValue.substring(1);
        double StudentClubsTotValue_act=Double.parseDouble(StudentClubsTotValue);

        double StudentClubsTotalValue_exp=StudentClubsSubTotal_act+GST_value_StudentClubs_exp+PST_value_StudentClubs_exp;
        StudentClubsTotalValue_exp=TaxRoundOff(StudentClubsTotalValue_exp);

        Assert.assertEquals(StudentClubsTotValue_act, StudentClubsTotalValue_exp, "Student Clubs Total Amount owing is incorrect in Redemptions & Rewards Page");


        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubsTotalValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_act=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_act);
            double Total_owing_exp=StudentClubsTotalValue_exp+ShippingValue_act;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");
		}*/	
	}

    @Override
    public void CSR_Validation_of_Student_Clubs_GST_QST_ShippingChargers_Total_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");
        double stateTaxQST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxQST");

        String StudentClubsSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubsSubTotal = StudentClubsSubTotal.substring(1);
        double StudentClubsSubTotal_act=Double.parseDouble(StudentClubsSubTotal);

        String GST_value_StudentClubs=value_GST_StudentClub_RewardsCouponsPage().getText();
        GST_value_StudentClubs = GST_value_StudentClubs.substring(1);
        double GST_value_StudentClubs_act=Double.parseDouble(GST_value_StudentClubs);

        String QST_value_StudentClubs=value_QST_StudentClub_RewardsCouponsPage().getText();
        QST_value_StudentClubs = QST_value_StudentClubs.substring(1);
        double QST_value_StudentClubs_act=Double.parseDouble(QST_value_StudentClubs);

        double GST_value_StudentClubs_exp=(StudentClubsSubTotal_act * stateTaxGST)/100;
        GST_value_StudentClubs_exp=TaxRoundOff(GST_value_StudentClubs_exp);
        Assert.assertEquals(GST_value_StudentClubs_act, GST_value_StudentClubs_exp, "Student Clubs GST value is incorrect in Redemptions & Rewards Page");

        double QST_value_StudentClubs_exp=(StudentClubsSubTotal_act * stateTaxQST)/100;
        QST_value_StudentClubs_exp=TaxRoundOff(QST_value_StudentClubs_exp);
        Assert.assertEquals(QST_value_StudentClubs_act, QST_value_StudentClubs_exp, "Student Clubs QST value is incorrect in Redemptions & Rewards Page");

        String StudentClubsTotValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubsTotValue = StudentClubsTotValue.substring(1);
        double StudentClubsTotValue_act=Double.parseDouble(StudentClubsTotValue);

        double StudentClubsTotalValue_exp=StudentClubsSubTotal_act+GST_value_StudentClubs_exp+QST_value_StudentClubs_exp;
        StudentClubsTotalValue_exp=TaxRoundOff(StudentClubsTotalValue_exp);

        Assert.assertEquals(StudentClubsTotValue_act, StudentClubsTotalValue_exp, "Student Clubs Total Amount owing is incorrect in Redemptions & Rewards Page");


        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubsTotalValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_act=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_act);
            double Total_owing_exp=StudentClubsTotalValue_exp+ShippingValue_act;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");
		}*/	
	}

    @Override
    public void CSR_Validation_of_Student_Clubs_HST_ShippingChargers_Total_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double stateTaxHST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxHST");

        String StudentClubsSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubsSubTotal = StudentClubsSubTotal.substring(1);
        double StudentClubsSubTotal_act=Double.parseDouble(StudentClubsSubTotal);

        String HST_value_StudentClubs=value_HST_StudentClub_RewardsCouponsPage().getText();
        HST_value_StudentClubs = HST_value_StudentClubs.substring(1);
        double HST_value_StudentClubs_act=Double.parseDouble(HST_value_StudentClubs);

        double HST_value_StudentClubs_exp=(StudentClubsSubTotal_act * stateTaxHST)/100;
        HST_value_StudentClubs_exp=TaxRoundOff(HST_value_StudentClubs_exp);
        Assert.assertEquals(HST_value_StudentClubs_act, HST_value_StudentClubs_exp, "Student Clubs HST value is incorrect in Redemptions & Rewards Page");

        String StudentClubsTotValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubsTotValue = StudentClubsTotValue.substring(1);
        double StudentClubsTotValue_act=Double.parseDouble(StudentClubsTotValue);

        double StudentClubsTotalValue_exp=StudentClubsSubTotal_act+HST_value_StudentClubs_exp;
        StudentClubsTotalValue_exp=TaxRoundOff(StudentClubsTotalValue_exp);

        Assert.assertEquals(StudentClubsTotValue_act, StudentClubsTotalValue_exp, "Student Clubs Total Amount owing is incorrect in Redemptions & Rewards Page");


        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubsTotalValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_act=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_act);
            double Total_owing_exp=StudentClubsTotalValue_exp+ShippingValue_act;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));
            
			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");
		}*/	
	}

    @Override
    public void CSR_Validation_of_Student_Clubs_GST_ShippingChargers_Total_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");

        String StudentClubsSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubsSubTotal = StudentClubsSubTotal.substring(1);
        double StudentClubsSubTotal_act=Double.parseDouble(StudentClubsSubTotal);

        String GST_value_StudentClubs=value_GST_StudentClub_RewardsCouponsPage().getText();
        GST_value_StudentClubs = GST_value_StudentClubs.substring(1);
        double GST_value_StudentClubs_act=Double.parseDouble(GST_value_StudentClubs);

        double GST_value_StudentClubs_exp=(StudentClubsSubTotal_act * stateTaxGST)/100;
        GST_value_StudentClubs_exp=TaxRoundOff(GST_value_StudentClubs_exp);
        Assert.assertEquals(GST_value_StudentClubs_act, GST_value_StudentClubs_exp, "Student Clubs GST value is incorrect in Redemptions & Rewards Page");

        String StudentClubsTotValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubsTotValue = StudentClubsTotValue.substring(1);
        double StudentClubsTotValue_act=Double.parseDouble(StudentClubsTotValue);

        double StudentClubsTotalValue_exp=StudentClubsSubTotal_act+GST_value_StudentClubs_exp;
        StudentClubsTotalValue_exp=TaxRoundOff(StudentClubsTotalValue_exp);

        Assert.assertEquals(StudentClubsTotValue_act, StudentClubsTotalValue_exp, "Student Clubs Total Amount owing is incorrect in Redemptions & Rewards Page");


        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubsTotalValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_act=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_act);
            double Total_owing_exp=StudentClubsTotalValue_exp+ShippingValue_act;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");
		}*/	
	}

    @Override
    public void CSR_Validation_of_noTaxes_for_Student_Clubs_GST_PST_ShippingChargers_Total_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        if (value_GST_StudentClub_RewardsCouponsPage().isDisplayed()) {
            String Student_gst=value_GST_StudentClub_RewardsCouponsPage().getText();
            Student_gst = Student_gst.substring(1);
            double Student_gst_2=Double.parseDouble(Student_gst);
            double value=0.0;
            Assert.assertEquals(value, Student_gst_2, "GST value is displayed for Student Clubs Subtotal in Redemptions & Rewards Page");
        } else if (value_PST_StudentClub_RewardsCouponsPage().isDisplayed()) {
            String Student_pst=value_PST_StudentClub_RewardsCouponsPage().getText();
            Student_pst = Student_pst.substring(1);
            double Student_pst_2=Double.parseDouble(Student_pst);
            double value=0.0;
            Assert.assertEquals(value, Student_pst_2, "PST value is displayed for Student Clubs Subtotal in Redemptions & Rewards Page");

        } else {
            Assert.fail("No taxes are displayed");

        }

        String StudentClubsSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubsSubTotal = StudentClubsSubTotal.substring(1);
        double StudentClubsSubTotal_act=Double.parseDouble(StudentClubsSubTotal);

        String StudentClubsTotValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubsTotValue = StudentClubsTotValue.substring(1);
        double StudentClubsTotValue_act=Double.parseDouble(StudentClubsTotValue);

        double StudentClubsTotalValue_exp=StudentClubsSubTotal_act;
        StudentClubsTotalValue_exp=TaxRoundOff(StudentClubsTotalValue_exp);

        Assert.assertEquals(StudentClubsTotValue_act, StudentClubsTotalValue_exp, "Student Clubs Total Amount owing is incorrect in Redemptions & Rewards Page");


        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubsTotalValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_act=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_act);
            double Total_owing_exp=StudentClubsTotalValue_exp+ShippingValue_act;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");
		}*/	
	}

    @Override
    public void CSR_Validation_of_noTaxes_for_Student_Clubs_GST_QST_ShippingChargers_Total_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        if (value_GST_StudentClub_RewardsCouponsPage().isDisplayed()) {
            String Student_gst=value_GST_StudentClub_RewardsCouponsPage().getText();
            Student_gst = Student_gst.substring(1);
            double Student_gst_2=Double.parseDouble(Student_gst);
            double value=0.0;
            Assert.assertEquals(value, Student_gst_2, "GST value is displayed for Student Clubs Subtotal in Redemptions & Rewards Page");
        } else if (value_QST_StudentClub_RewardsCouponsPage().isDisplayed()) {
            String Student_qst=value_QST_StudentClub_RewardsCouponsPage().getText();
            Student_qst = Student_qst.substring(1);
            double Student_qst_2=Double.parseDouble(Student_qst);
            double value=0.0;
            Assert.assertEquals(value, Student_qst_2, "QST value is displayed for Student Clubs Subtotal in Redemptions & Rewards Page");

        } else {
            Assert.fail("No taxes are displayed");

        }

        String StudentClubsSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubsSubTotal = StudentClubsSubTotal.substring(1);
        double StudentClubsSubTotal_act=Double.parseDouble(StudentClubsSubTotal);

		String StudentClubsTotValue=header_BlueBar_StudentClub_PostAmount().getText();
		System.out.println("###########:"+StudentClubsTotValue);
		StudentClubsTotValue = StudentClubsTotValue.substring(1);
		double StudentClubsTotValue_act=Double.parseDouble(StudentClubsTotValue);

        double StudentClubsTotalValue_exp=StudentClubsSubTotal_act;
        StudentClubsTotalValue_exp=TaxRoundOff(StudentClubsTotalValue_exp);

        Assert.assertEquals(StudentClubsTotValue_act, StudentClubsTotalValue_exp, "Student Clubs Total Amount owing is incorrect in Redemptions & Rewards Page");


        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubsTotalValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_act=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_act);
            double Total_owing_exp=StudentClubsTotalValue_exp+ShippingValue_act;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");
		}*/	
	}


    @Override
    public void CSR_Validation_of_Student_and_TeacherCatalogues_GST_PST_ShippingChargers_Total_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");
        double stateTaxPST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxPST");

        String StudentClubsSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubsSubTotal = StudentClubsSubTotal.substring(1);
        double StudentClubsSubTotal_act=Double.parseDouble(StudentClubsSubTotal);

        String GST_value_StudentClubs=value_GST_StudentClub_RewardsCouponsPage().getText();
        GST_value_StudentClubs = GST_value_StudentClubs.substring(1);
        double GST_value_StudentClubs_act=Double.parseDouble(GST_value_StudentClubs);

        String PST_value_StudentClubs=value_PST_StudentClub_RewardsCouponsPage().getText();
        PST_value_StudentClubs = PST_value_StudentClubs.substring(1);
        double PST_value_StudentClubs_act=Double.parseDouble(PST_value_StudentClubs);

        double GST_value_StudentClubs_exp=(StudentClubsSubTotal_act * stateTaxGST)/100;
        GST_value_StudentClubs_exp=TaxRoundOff(GST_value_StudentClubs_exp);
        Assert.assertEquals(GST_value_StudentClubs_act, GST_value_StudentClubs_exp, "Student Clubs GST value is incorrect in Redemptions & Rewards Page");

        double PST_value_StudentClubs_exp=(StudentClubsSubTotal_act * stateTaxPST)/100;
        PST_value_StudentClubs_exp=TaxRoundOff(PST_value_StudentClubs_exp);
        Assert.assertEquals(PST_value_StudentClubs_act, PST_value_StudentClubs_exp, "Student Clubs PST value is incorrect in Redemptions & Rewards Page");

        String StudentClubsTotValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubsTotValue = StudentClubsTotValue.substring(1);
        double StudentClubsTotValue_act=Double.parseDouble(StudentClubsTotValue);

        double StudentClubsTotalValue_exp=StudentClubsSubTotal_act+GST_value_StudentClubs_exp+PST_value_StudentClubs_exp;
        StudentClubsTotalValue_exp=TaxRoundOff(StudentClubsTotalValue_exp);

        Assert.assertEquals(StudentClubsTotValue_act, StudentClubsTotalValue_exp, "Student Clubs Total Amount owing is incorrect in Redemptions & Rewards Page");


        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_act=Double.parseDouble(TeacherCatSubTotal);

        String GST_value_TeacherCat=value_GST_TeacherCat_RewardsCouponsPage().getText();
        GST_value_TeacherCat = GST_value_TeacherCat.substring(1);
        double GST_value_TeacherCat_act=Double.parseDouble(GST_value_TeacherCat);

        String PST_value_TeacherCat=value_PST_TeacherCat_RewardsCouponsPage().getText();
        PST_value_TeacherCat = PST_value_TeacherCat.substring(1);
        double PST_value_TeacherCat_act=Double.parseDouble(PST_value_TeacherCat);

        double GST_value_TeacherCat_exp=(TeacherCatSubTotal_act * stateTaxGST)/100;
        GST_value_TeacherCat_exp=TaxRoundOff(GST_value_TeacherCat_exp);
        Assert.assertEquals(GST_value_TeacherCat_act, GST_value_TeacherCat_exp, "Teacher Catalogues GST value is incorrect in Redemptions & Rewards Page");

        double PST_value_TeacherCat_exp=(TeacherCatSubTotal_act * stateTaxPST)/100;
        PST_value_TeacherCat_exp=TaxRoundOff(PST_value_TeacherCat_exp);
        Assert.assertEquals(PST_value_TeacherCat_act, PST_value_TeacherCat_exp, "Teacher Catalogues PST value is incorrect in Redemptions & Rewards Page");

        String TeacherCatTotValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherCatTotValue = TeacherCatTotValue.substring(1);
        double TeacherCatTotValue_act=Double.parseDouble(TeacherCatTotValue);

        double TeacherCataloguesTotalValue_exp=TeacherCatSubTotal_act+GST_value_TeacherCat_exp+PST_value_TeacherCat_exp;
        TeacherCataloguesTotalValue_exp=TaxRoundOff(TeacherCataloguesTotalValue_exp);

        Assert.assertEquals(TeacherCatTotValue_act, TeacherCataloguesTotalValue_exp, "Teacher Catalogues Total Amount owing is incorrect in Redemptions & Rewards Page");


        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubsTotalValue_exp+TeacherCataloguesTotalValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_act=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_act);
            double Total_owing_exp=StudentClubsTotalValue_exp+TeacherCataloguesTotalValue_exp+ShippingValue_act;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");
		}*/	
	}

    @Override
    public void CSR_Validation_of_Student_and_TeacherCatalogues_GST_QST_ShippingChargers_Total_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");
        double stateTaxQST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxQST");

        String StudentClubsSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubsSubTotal = StudentClubsSubTotal.substring(1);
        double StudentClubsSubTotal_act=Double.parseDouble(StudentClubsSubTotal);

        String GST_value_StudentClubs=value_GST_StudentClub_RewardsCouponsPage().getText();
        GST_value_StudentClubs = GST_value_StudentClubs.substring(1);
        double GST_value_StudentClubs_act=Double.parseDouble(GST_value_StudentClubs);

        String QST_value_StudentClubs=value_QST_StudentClub_RewardsCouponsPage().getText();
        QST_value_StudentClubs = QST_value_StudentClubs.substring(1);
        double QST_value_StudentClubs_act=Double.parseDouble(QST_value_StudentClubs);

        double GST_value_StudentClubs_exp=(StudentClubsSubTotal_act * stateTaxGST)/100;
        GST_value_StudentClubs_exp=TaxRoundOff(GST_value_StudentClubs_exp);
        Assert.assertEquals(GST_value_StudentClubs_act, GST_value_StudentClubs_exp, "Student Clubs GST value is incorrect in Redemptions & Rewards Page");

        double QST_value_StudentClubs_exp=(StudentClubsSubTotal_act * stateTaxQST)/100;
        QST_value_StudentClubs_exp=TaxRoundOff(QST_value_StudentClubs_exp);
        Assert.assertEquals(QST_value_StudentClubs_act, QST_value_StudentClubs_exp, "Student Clubs QST value is incorrect in Redemptions & Rewards Page");

        String StudentClubsTotValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubsTotValue = StudentClubsTotValue.substring(1);
        double StudentClubsTotValue_act=Double.parseDouble(StudentClubsTotValue);

        double StudentClubsTotalValue_exp=StudentClubsSubTotal_act+GST_value_StudentClubs_exp+QST_value_StudentClubs_exp;
        StudentClubsTotalValue_exp=TaxRoundOff(StudentClubsTotalValue_exp);

        Assert.assertEquals(StudentClubsTotValue_act, StudentClubsTotalValue_exp, "Student Clubs Total Amount owing is incorrect in Redemptions & Rewards Page");


        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_act=Double.parseDouble(TeacherCatSubTotal);

        String GST_value_TeacherCat=value_GST_TeacherCat_RewardsCouponsPage().getText();
        GST_value_TeacherCat = GST_value_TeacherCat.substring(1);
        double GST_value_TeacherCat_act=Double.parseDouble(GST_value_TeacherCat);

        String QST_value_TeacherCat=value_QST_TeacherCat_RewardsCouponsPage().getText();
        QST_value_TeacherCat = QST_value_TeacherCat.substring(1);
        double QST_value_TeacherCat_act=Double.parseDouble(QST_value_TeacherCat);

        double GST_value_TeacherCat_exp=(TeacherCatSubTotal_act * stateTaxGST)/100;
        GST_value_TeacherCat_exp=TaxRoundOff(GST_value_TeacherCat_exp);
        Assert.assertEquals(GST_value_TeacherCat_act, GST_value_TeacherCat_exp, "Teacher Catalogues GST value is incorrect in Redemptions & Rewards Page");

        double QST_value_TeacherCat_exp=(TeacherCatSubTotal_act * stateTaxQST)/100;
        QST_value_TeacherCat_exp=TaxRoundOff(QST_value_TeacherCat_exp);
        Assert.assertEquals(QST_value_TeacherCat_act, QST_value_TeacherCat_exp, "Teacher Catalogues QST value is incorrect in Redemptions & Rewards Page");

        String TeacherCatTotValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherCatTotValue = TeacherCatTotValue.substring(1);
        double TeacherCatTotValue_act=Double.parseDouble(TeacherCatTotValue);

        double TeacherCataloguesTotalValue_exp=TeacherCatSubTotal_act+GST_value_TeacherCat_exp+QST_value_TeacherCat_exp;
        TeacherCataloguesTotalValue_exp=TaxRoundOff(TeacherCataloguesTotalValue_exp);

        Assert.assertEquals(TeacherCatTotValue_act, TeacherCataloguesTotalValue_exp, "Teacher Catalogues Total Amount owing is incorrect in Redemptions & Rewards Page");


        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubsTotalValue_exp+TeacherCataloguesTotalValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");

        } else if (!ShippingValue.equals("FREE!")) {

            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_act=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_act);
            double Total_owing_exp=StudentClubsTotalValue_exp+TeacherCataloguesTotalValue_exp+ShippingValue_act;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");
		}*/	
	}

    @Override
    public void CSR_Validation_of_Student_and_TeacherCatalogues_HST_ShippingChargers_Total_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double stateTaxHST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxHST");

        String StudentClubsSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubsSubTotal = StudentClubsSubTotal.substring(1);
        double StudentClubsSubTotal_act=Double.parseDouble(StudentClubsSubTotal);

        String HST_value_StudentClubs=value_HST_StudentClub_RewardsCouponsPage().getText();
        HST_value_StudentClubs = HST_value_StudentClubs.substring(1);
        double HST_value_StudentClubs_act=Double.parseDouble(HST_value_StudentClubs);

        double HST_value_StudentClubs_exp=(StudentClubsSubTotal_act * stateTaxHST)/100;
        HST_value_StudentClubs_exp=TaxRoundOff(HST_value_StudentClubs_exp);
        Assert.assertEquals(HST_value_StudentClubs_act, HST_value_StudentClubs_exp, "Student Clubs HST value is incorrect in Redemptions & Rewards Page");

        String StudentClubsTotValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubsTotValue = StudentClubsTotValue.substring(1);
        double StudentClubsTotValue_act=Double.parseDouble(StudentClubsTotValue);

        double StudentClubsTotalValue_exp=StudentClubsSubTotal_act+HST_value_StudentClubs_exp;
        StudentClubsTotalValue_exp=TaxRoundOff(StudentClubsTotalValue_exp);

        Assert.assertEquals(StudentClubsTotValue_act, StudentClubsTotalValue_exp, "Student Clubs Total Amount owing is incorrect in Redemptions & Rewards Page");


        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_act=Double.parseDouble(TeacherCatSubTotal);

        String HST_value_TeacherCat=value_HST_TeacherCat_RewardsCouponsPage().getText();
        HST_value_TeacherCat = HST_value_TeacherCat.substring(1);
        double HST_value_TeacherCat_act=Double.parseDouble(HST_value_TeacherCat);

        double HST_value_TeacherCat_exp=(TeacherCatSubTotal_act * stateTaxHST)/100;
        HST_value_TeacherCat_exp=TaxRoundOff(HST_value_TeacherCat_exp);
        Assert.assertEquals(HST_value_TeacherCat_act, HST_value_TeacherCat_exp, "Teacher Catalogues HST value is incorrect in Redemptions & Rewards Page");

        String TeacherCatTotValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherCatTotValue = TeacherCatTotValue.substring(1);
        double TeacherCatTotValue_act=Double.parseDouble(TeacherCatTotValue);

        double TeacherCataloguesTotalValue_exp=TeacherCatSubTotal_act+HST_value_TeacherCat_exp;
        TeacherCataloguesTotalValue_exp=TaxRoundOff(TeacherCataloguesTotalValue_exp);

        Assert.assertEquals(TeacherCatTotValue_act, TeacherCataloguesTotalValue_exp, "Teacher Catalogues Total Amount owing is incorrect in Redemptions & Rewards Page");


        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubsTotalValue_exp+TeacherCataloguesTotalValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");

        } else if (!ShippingValue.equals("FREE!")) {

            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_act=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_act);
            double Total_owing_exp=StudentClubsTotalValue_exp+TeacherCataloguesTotalValue_exp+ShippingValue_act;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");
		}*/	
	}

    @Override
    public void CSR_Validation_of_Student_and_TeacherCatalogues_GST_ShippingChargers_Total_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double stateTaxGST=TestBaseProvider.getTestBase().getTestData().getDouble("stateTaxGST");

        String StudentClubsSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubsSubTotal = StudentClubsSubTotal.substring(1);
        double StudentClubsSubTotal_act=Double.parseDouble(StudentClubsSubTotal);

        String GST_value_StudentClubs=value_GST_StudentClub_RewardsCouponsPage().getText();
        GST_value_StudentClubs = GST_value_StudentClubs.substring(1);
        double GST_value_StudentClubs_act=Double.parseDouble(GST_value_StudentClubs);

        double GST_value_StudentClubs_exp=(StudentClubsSubTotal_act * stateTaxGST)/100;
        GST_value_StudentClubs_exp=TaxRoundOff(GST_value_StudentClubs_exp);
        Assert.assertEquals(GST_value_StudentClubs_act, GST_value_StudentClubs_exp, "Student Clubs GST value is incorrect in Redemptions & Rewards Page");

        String StudentClubsTotValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubsTotValue = StudentClubsTotValue.substring(1);
        double StudentClubsTotValue_act=Double.parseDouble(StudentClubsTotValue);

        double StudentClubsTotalValue_exp=StudentClubsSubTotal_act+GST_value_StudentClubs_exp;
        StudentClubsTotalValue_exp=TaxRoundOff(StudentClubsTotalValue_exp);

        Assert.assertEquals(StudentClubsTotValue_act, StudentClubsTotalValue_exp, "Student Clubs Total Amount owing is incorrect in Redemptions & Rewards Page");


        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_act=Double.parseDouble(TeacherCatSubTotal);

        String GST_value_TeacherCat=value_GST_TeacherCat_RewardsCouponsPage().getText();
        GST_value_TeacherCat = GST_value_TeacherCat.substring(1);
        double GST_value_TeacherCat_act=Double.parseDouble(GST_value_TeacherCat);

        double GST_value_TeacherCat_exp=(TeacherCatSubTotal_act * stateTaxGST)/100;
        GST_value_TeacherCat_exp=TaxRoundOff(GST_value_TeacherCat_exp);
        Assert.assertEquals(GST_value_TeacherCat_act, GST_value_TeacherCat_exp, "Teacher Catalogues GST value is incorrect in Redemptions & Rewards Page");

        String TeacherCatTotValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherCatTotValue = TeacherCatTotValue.substring(1);
        double TeacherCatTotValue_act=Double.parseDouble(TeacherCatTotValue);

        double TeacherCataloguesTotalValue_exp=TeacherCatSubTotal_act+GST_value_TeacherCat_exp;
        TeacherCataloguesTotalValue_exp=TaxRoundOff(TeacherCataloguesTotalValue_exp);

        Assert.assertEquals(TeacherCatTotValue_act, TeacherCataloguesTotalValue_exp, "Teacher Catalogues Total Amount owing is incorrect in Redemptions & Rewards Page");


        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubsTotalValue_exp+TeacherCataloguesTotalValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_act=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_act);
            double Total_owing_exp=StudentClubsTotalValue_exp+TeacherCataloguesTotalValue_exp+ShippingValue_act;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");
		}*/	
	}


    @Override
    public void CSR_Validation_of_noTaxes_for_Student_and_TeacherCatalogues_GST_PST_ShippingChargers_Total_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        if (value_GST_StudentClub_RewardsCouponsPage().isDisplayed()) {
            String Student_gst=value_GST_StudentClub_RewardsCouponsPage().getText();
            Student_gst = Student_gst.substring(1);
            double Student_gst_2=Double.parseDouble(Student_gst);
            double value=0.0;
            Assert.assertEquals(value, Student_gst_2, "GST value is displayed for Student Clubs Subtotal in Redemptions & Rewards Page");
        } else if (value_PST_StudentClub_RewardsCouponsPage().isDisplayed()) {
            String Student_pst=value_PST_StudentClub_RewardsCouponsPage().getText();
            Student_pst = Student_pst.substring(1);
            double Student_pst_2=Double.parseDouble(Student_pst);
            double value=0.0;
            Assert.assertEquals(value, Student_pst_2, "PST value is displayed for Student Clubs Subtotal in Redemptions & Rewards Page");

        } else {
            Assert.fail("No taxes are displayed");

        }

        String StudentClubsSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubsSubTotal = StudentClubsSubTotal.substring(1);
        double StudentClubsSubTotal_act=Double.parseDouble(StudentClubsSubTotal);

        String StudentClubsTotValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubsTotValue = StudentClubsTotValue.substring(1);
        double StudentClubsTotValue_act=Double.parseDouble(StudentClubsTotValue);

        double StudentClubsTotalValue_exp=StudentClubsSubTotal_act;
        StudentClubsTotalValue_exp=TaxRoundOff(StudentClubsTotalValue_exp);

        Assert.assertEquals(StudentClubsTotValue_act, StudentClubsTotalValue_exp, "Student Clubs Total Amount owing is incorrect in Redemptions & Rewards Page");


        if (value_GST_TeacherCat_RewardsCouponsPage().isDisplayed()) {
            String Teacher_gst=value_GST_TeacherCat_RewardsCouponsPage().getText();
            Teacher_gst = Teacher_gst.substring(1);
            double Teacher_gst_2=Double.parseDouble(Teacher_gst);
            double value=0.0;
            Assert.assertEquals(value, Teacher_gst_2, "GST value is displayed for Teacher_Catalogues_Subtotal in Redemptions & Rewards Page");
        } else if (value_PST_TeacherCat_RewardsCouponsPage().isDisplayed()) {
            String Teacher_pst=value_PST_TeacherCat_RewardsCouponsPage().getText();
            Teacher_pst = Teacher_pst.substring(1);
            double Teacher_pst_2=Double.parseDouble(Teacher_pst);
            double value=0.0;
            Assert.assertEquals(value, Teacher_pst_2, "PST value is displayed for Teacher_Catalogues_Subtotal in Redemptions & Rewards Page");

        } else {
            Assert.fail("No taxes are displayed");

        }

        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_act=Double.parseDouble(TeacherCatSubTotal);

        String TeacherCatTotValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherCatTotValue = TeacherCatTotValue.substring(1);
        double TeacherCatTotValue_act=Double.parseDouble(TeacherCatTotValue);

        double TeacherCataloguesTotalValue_exp=TeacherCatSubTotal_act;
        TeacherCataloguesTotalValue_exp=TaxRoundOff(TeacherCataloguesTotalValue_exp);

        Assert.assertEquals(TeacherCatTotValue_act, TeacherCataloguesTotalValue_exp, "Teacher Catalogues Total Amount owing is incorrect in Redemptions & Rewards Page");


        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubsTotalValue_exp+TeacherCataloguesTotalValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_act=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_act);
            double Total_owing_exp=StudentClubsTotalValue_exp+TeacherCataloguesTotalValue_exp+ShippingValue_act;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");
		}*/	
	}

    @Override
    public void CSR_Validation_of_noTaxes_for_Student_and_TeacherCatalogues_GST_QST_ShippingChargers_Total_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        if (value_GST_StudentClub_RewardsCouponsPage().isDisplayed()) {
            String Student_gst=value_GST_StudentClub_RewardsCouponsPage().getText();
            Student_gst = Student_gst.substring(1);
            double Student_gst_2=Double.parseDouble(Student_gst);
            double value=0.0;
            Assert.assertEquals(value, Student_gst_2, "GST value is displayed for Student Clubs Subtotal in Redemptions & Rewards Page");
        } else if (value_QST_StudentClub_RewardsCouponsPage().isDisplayed()) {
            String Student_qst=value_QST_StudentClub_RewardsCouponsPage().getText();
            Student_qst = Student_qst.substring(1);
            double Student_qst_2=Double.parseDouble(Student_qst);
            double value=0.0;
            Assert.assertEquals(value, Student_qst_2, "QST value is displayed for Student Clubs Subtotal in Redemptions & Rewards Page");

        } else {
            Assert.fail("No taxes are displayed");

        }

        String StudentClubsSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubsSubTotal = StudentClubsSubTotal.substring(1);
        double StudentClubsSubTotal_act=Double.parseDouble(StudentClubsSubTotal);

        String StudentClubsTotValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubsTotValue = StudentClubsTotValue.substring(1);
        double StudentClubsTotValue_act=Double.parseDouble(StudentClubsTotValue);

        double StudentClubsTotalValue_exp=StudentClubsSubTotal_act;
        StudentClubsTotalValue_exp=TaxRoundOff(StudentClubsTotalValue_exp);

        Assert.assertEquals(StudentClubsTotValue_act, StudentClubsTotalValue_exp, "Student Clubs Total Amount owing is incorrect in Redemptions & Rewards Page");


        if (value_GST_TeacherCat_RewardsCouponsPage().isDisplayed()) {
            String Teacher_gst=value_GST_TeacherCat_RewardsCouponsPage().getText();
            Teacher_gst = Teacher_gst.substring(1);
            double Teacher_gst_2=Double.parseDouble(Teacher_gst);
            double value=0.0;
            Assert.assertEquals(value, Teacher_gst_2, "GST value is displayed for Teacher_Catalogues_Subtotal in Redemptions & Rewards Page");
        } else if (value_QST_TeacherCat_RewardsCouponsPage().isDisplayed()) {
            String Teacher_qst=value_QST_TeacherCat_RewardsCouponsPage().getText();
            Teacher_qst = Teacher_qst.substring(1);
            double Teacher_qst_2=Double.parseDouble(Teacher_qst);
            double value=0.0;
            Assert.assertEquals(value, Teacher_qst_2, "QST value is displayed for Teacher_Catalogues_Subtotal in Redemptions & Rewards Page");

        } else {
            Assert.fail("No taxes are displayed");

        }

        String TeacherCatSubTotal=value_TeacherCatSubTotal_RewardsCouponsPage().getText();
        TeacherCatSubTotal = TeacherCatSubTotal.substring(1);
        double TeacherCatSubTotal_act=Double.parseDouble(TeacherCatSubTotal);

        String TeacherCatTotValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherCatTotValue = TeacherCatTotValue.substring(1);
        double TeacherCatTotValue_act=Double.parseDouble(TeacherCatTotValue);

        double TeacherCataloguesTotalValue_exp=TeacherCatSubTotal_act;
        TeacherCataloguesTotalValue_exp=TaxRoundOff(TeacherCataloguesTotalValue_exp);

        Assert.assertEquals(TeacherCatTotValue_act, TeacherCataloguesTotalValue_exp, "Teacher Catalogues Total Amount owing is incorrect in Redemptions & Rewards Page");


        /*PauseUtil.pause(2000);
        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        if (ShippingValue.equals("FREE!")) {
            double ShippingValue_is=0;
            double Total_owing_exp=StudentClubsTotalValue_exp+TeacherCataloguesTotalValue_exp+ShippingValue_is;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");

        } else if (!ShippingValue.equals("FREE!")) {
            ShippingValue = ShippingValue.substring(1);
            double ShippingValue_act=Double.parseDouble(ShippingValue);
            System.out.println("############ShippingValue is "+ShippingValue_act);
            double Total_owing_exp=StudentClubsTotalValue_exp+TeacherCataloguesTotalValue_exp+ShippingValue_act;
            Total_owing_exp =Double.parseDouble(new DecimalFormat("##.##").format(Total_owing_exp));

			String Total_Owing_Amount_act=Total_Amount_Owing().getText();
			Total_Owing_Amount_act=Total_Owing_Amount_act.trim();
			Total_Owing_Amount_act = Total_Owing_Amount_act.substring(1);
			double Total_Owing_Amount_act_2=Double.parseDouble(Total_Owing_Amount_act);
			Assert.assertEquals(Total_Owing_Amount_act_2, Total_owing_exp, "Total owing value is incorrect in Redemptions & Rewards Page");
		}*/	
	}

    @Override
    public void CSR_validate_StudentClubs_section_displayed_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            section_StudentClubs_RedemptionsRewardsPage().isDisplayed();
            System.out.println("Student Clubs section is displayed in Redemptions & Rewards Page");
        } catch (Exception e) {
            Assert.fail("Student Clubs section is not displayed in Redemptions & Rewards Page");
        }
    }

    @Override
    public void CSR_validate_ShippingHandling_section_displayed_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            section_ShippingHandling_RedemptionsRewardsPage().isDisplayed();
            System.out.println("Shipping & Handling section is displayed in Redemptions & Rewards Page");
        } catch (Exception e) {
            Assert.fail("Shipping & Handling section is not displayed in Redemptions & Rewards Page");
        }
    }

    @Override
    public void CSR_validate_TeacherCatalogues_section_displayed_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            section_TeacherCatalogues_RedemptionsRewardsPage().isDisplayed();
            System.out.println("Teacher Catalogues section is displayed in Redemptions & Rewards Page");
        } catch (Exception e) {
            Assert.fail("Teacher Catalogues section is not displayed in Redemptions & Rewards Page");
        }

    }

    @Override
    public void CSR_validate_StudentClubs_section_is_not_displayed_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            section_StudentClubs_RedemptionsRewardsPage().isDisplayed();
            Assert.fail("Student Clubs section is displayed in Redemptions & Rewards Page");
        } catch (Exception e) {
            System.out.println("Student Clubs section is not displayed in Redemptions & Rewards Page");
        }
    }

    @Override
    public void CSR_validate_Toggle_btn_displayed_for_StudentClubs_section_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            btn_Toggle_for_StudentClubs_RedemptionsRewardsPage().isDisplayed();
            System.out.println("Toggle button is displayed for Student Clubs section in Redemptions & Rewards page");
        } catch (Exception e) {
            Assert.fail("Toggle button is not displayed for Student Clubs section in Redemptions & Rewards page");
        }

    }

    @Override
    public void CSR_validate_Toggle_btn_displayed_for_ShippingHandling_section_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            btn_Toggle_for_ShippingHandling_RedemptionsRewardsPage().isDisplayed();
            System.out.println("Toggle button is displayed for Shipping & Handling section in Redemptions & Rewards page");
        } catch (Exception e) {
            Assert.fail("Toggle button is not displayed for Shipping & Handling section in Redemptions & Rewards page");
        }

    }

    @Override
    public void CSR_validate_hdr_label_for_StudentClubs_section_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=hdr_StudentClubs_in_RedemptionsRewardsPage().getText();
        act_text=act_text.trim();

        String exp_text="YOUR TEACHER ORDER";

        Assert.assertEquals(act_text, exp_text, "Incorrect header text is displayed for Student Clubs section in Redemptions & Rewards page");
    }

    @Override
    public void CSR_validate_hdr_label_for_ShippingHandling_section_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=hdr_ShippingHandling_in_RedemptionsRewardsPage().getText();
        act_text=act_text.trim();

        String exp_text="SHIPPING & HANDLING";

        Assert.assertEquals(act_text, exp_text, "Incorrect header text is displayed for Shipping & Handling section in Redemptions & Rewards page");
    }

    @Override
    public void CSR_verify_StudentClubs_ItemsPrice_Qty_displayed_in_BlueHdr_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            header_BlueBar_StudentClub_PostAmount().isDisplayed();
            System.out.println("Student Clubs Post Amount is displayed in Blue header in Redemptions & Rewards Page");
        } catch (Exception e) {
            Assert.fail("Student Clubs Post Amount is not displayed in Blue header in Redemptions & Rewards Page");
        }

        try {
            header_BlueBar_StudentClub_Items().isDisplayed();
            System.out.println("Student Clubs Total items field is displayed in Blue header in Redemptions & Rewards Page");
        } catch (Exception e) {
            Assert.fail("Student Clubs Total items field is not displayed in Blue header in Redemptions & Rewards Page");
        }

    }

    @Override
    public void CSR_verify_ShippingHandling_charge_displayed_in_BlueHdr_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            header_BlueBar_Shipping_TotalAmount().isDisplayed();
            System.out.println("Shipping & Handling Total Amount field is displayed in Blue header in Redemptions & Rewards Page");
        } catch (Exception e) {
            Assert.fail("Shipping & Handling Post Total Amount field is not displayed in Blue header in Redemptions & Rewards Page");
        }

    }

    @Override
    public void CSR_verify_StudentClubs_section_expanded_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        String act_text=btn_Toggle_for_StudentClubs_RedemptionsRewardsPage().getAttribute("class");
        String exp_text="fa fa-minus";

        Assert.assertEquals(act_text, exp_text, "Student Clubs section is not expanded in Redemptions & Rewards page");
    }

    @Override
    public void CSR_verify_ShippingHandling_section_expanded_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        String act_text=btn_Toggle_for_ShippingHandling_RedemptionsRewardsPage().getAttribute("class");
        String exp_text="fa fa-minus";

        Assert.assertEquals(act_text, exp_text, "Shipping & Handling section is not expanded in Redemptions & Rewards page");
    }

    @Override
    public void CSR_verify_StudentClubs_section_Toggle_btn_displayed_as_Minus_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        String act_text=btn_Toggle_for_StudentClubs_RedemptionsRewardsPage().getAttribute("class");
        String exp_text="fa fa-minus";

        Assert.assertEquals(act_text, exp_text, "Minus symbol is not displayed for the Student Clubs Toggle button in Redemptions & Rewards page");
    }

    @Override
    public void CSR_verify_ShippingHandling_section_Toggle_btn_displayed_as_Minus_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        String act_text=btn_Toggle_for_ShippingHandling_RedemptionsRewardsPage().getAttribute("class");
        String exp_text="fa fa-minus";

        Assert.assertEquals(act_text, exp_text, "Minus symbol is not displayed for the Shipping & Handling Toggle button in Redemptions & Rewards page");
    }

    @Override
    public void CSR_clicks_on_StudentClubs_section_Toggle_btn_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        btn_Toggle_for_StudentClubs_RedemptionsRewardsPage().click();
    }

    @Override
    public void CSR_clicks_on_ShippingHandling_section_Toggle_btn_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        btn_Toggle_for_ShippingHandling_RedemptionsRewardsPage().click();
    }

    @Override
    public void CSR_verify_StudentClubs_section_Toggle_btn_displayed_as_Plus_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        String act_text=btn_Toggle_for_StudentClubs_RedemptionsRewardsPage().getAttribute("class");
        String exp_text="fa fa-plus";

        Assert.assertEquals(act_text, exp_text, "Plus symbol is not displayed for the Student Clubs Toggle button in Redemptions & Rewards page");
    }

    @Override
    public void CSR_verify_ShippingHandling_section_Toggle_btn_displayed_as_Plus_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        String act_text=btn_Toggle_for_ShippingHandling_RedemptionsRewardsPage().getAttribute("class");
        String exp_text="fa fa-plus";

        Assert.assertEquals(act_text, exp_text, "Plus symbol is not displayed for the Shipping & Handling Toggle button in Redemptions & Rewards page");
    }

    @Override
    public void CSR_verify_SubTot_StudentClubs_label_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=label_SubTotal_StudentClubs_RedemptionsRewardsPage().getText();
        act_text=act_text.trim();

        String exp_text="Your Teacher Order Subtotal";

        Assert.assertEquals(act_text, exp_text, "Incorrect text is displayed for the Student Clubs Subtotal in Redemptions & Rewards Page");
    }

    @Override
    public void CSR_verify_ShippingHandling_label_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=label_ShippingHandling_preAmt_RedemptionsRewardsPage().getText();
        act_text=act_text.trim();

        String exp_text="Shipping & Handling";

        Assert.assertEquals(act_text, exp_text, "Incorrect text is displayed for the field pre amount of Shipping & Handling in Redemptions & Rewards Page");
    }

    @Override
    public void CSR_verify_Tax_module_section_displayed_for_StudentClubs_section_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            value_GST_StudentClub_RewardsCouponsPage().isDisplayed();
            System.out.println("Tax module section is displayed for Student Clubs section in Redemptions & Rewards Page");
        } catch (Exception e) {
            Assert.fail("Tax module section is not displayed for Student Clubs section in Redemptions & Rewards Page");
        }
    }

    @Override
    public void CSR_verify_Tax_module_section_displayed_for_ShippingHandling_section_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            fld_tax_ShippingHandling_section_RedemptionsRewardsPage().isDisplayed();
            System.out.println("Tax module section is displayed for Shipping & Handling section in Redemptions & Rewards Page");
        } catch (Exception e) {
            Assert.fail("Tax module section is not displayed for Shipping & Handling section in Redemptions & Rewards Page");
        }
    }

    @Override
    public void CSR_verify_label_REDEEM_BONUS_COUPONS_and_CREDIT_NOTES_in_StudentClubs_section_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=label_REDEEM_BONUS_COUPONS_REWARDS_StudentClubs_RedemptionsRewardsPage().getText();
        act_text=act_text.trim();

        String exp_text="REDEEM BONUS BANK AND CREDIT NOTES";

        Assert.assertEquals(act_text, exp_text, "Incorrect text is displayed for REDEEM BONUS COUPONS & CREDIT NOTES in Student Clubs section in Redemptions & Rewards Page");
    }

    @Override
    public void CSR_verify_label_BonusBank_in_StudentClubs_section_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=label_BONUS_BANK_StudentClubs_RedemptionsRewardsPage().getText();
        act_text=act_text.trim();

        String exp_text="BONUS BANK";

        Assert.assertEquals(act_text, exp_text, "Incorrect label is displayed for BONUS BANK in Student Clubs section in Redemptions & Rewards Page");

    }

    @Override
    public void CSR_verify_paragraph_is_displayed_for_BonusBank_fld_in_StudentClubs_section_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            fld_paragraph_BONUS_BANK_StudentClubs_RedemptionsRewardsPage().isDisplayed();
            System.out.println("Paragraph fld is displayed for BONUS BANK in StudentClubs section in RewardsCouponsPage");
        } catch (Exception e) {
            Assert.fail("Paragraph fld is not displayed for BONUS BANK in StudentClubs section in RewardsCouponsPage");
        }
    }

    @Override
    public void CSR_verify_BonusBank_txtBox_and_dollar_label_displayed_in_StudentClubs_section_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            fld_StudentClub_BonusBank().isDisplayed();
            System.out.println("Bonus Bank text box field is displayed in StudentClubs section in RewardsCouponsPage");
        } catch (Exception e) {
            Assert.fail("Bonus Bank text box field is not displayed in StudentClubs section in RewardsCouponsPage");
        }

        String act_text=label_BONUS_BANK_txtBox_StudentClubs_RedemptionsRewardsPage().getText();
        act_text=act_text.trim();
        System.out.println("############:"+act_text);

        String exp_text="- $";
        Assert.assertEquals(act_text, exp_text, "Incorrect label is displayed for BONUS BANK text box in Student Clubs section in Redemptions & Rewards Page");

    }

    @Override
    public void CSR_verify_PaperBonus_txtBox_and_dollar_label_displayed_in_StudentClubs_section_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            fld_StudentClub_PaperBonus().isDisplayed();
            System.out.println("Paper Bonus text box field is displayed in StudentClubs section in RewardsCouponsPage");
        } catch (Exception e) {
            Assert.fail("Paper Bonus text box field is not displayed in StudentClubs section in RewardsCouponsPage");
        }

        String act_text=label_PAPER_BONUS_txtBox_StudentClubs_RedemptionsRewardsPage().getText();
        act_text=act_text.trim();
        System.out.println("############:"+act_text);

        String exp_text="- $";
        Assert.assertEquals(act_text, exp_text, "Incorrect label is displayed for PAPER BONUS text box in Student Clubs section in Redemptions & Rewards Page");

    }

    @Override
    public void CSR_validate_value_of_student_Bonus_Bank_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_val=fld_StudentClub_BonusBank().getAttribute("value");
        String exp_val=TestBaseProvider.getTestBase().getTestData().getString("sBonusBank");

        Assert.assertEquals(act_val, exp_val, "Incorrect value is displayed for Student BONUS BANK and Decimal value is not accepting in Redemptions & Rewards Page");
    }

    @Override
    public void CSR_validate_value_of_student_Paper_Bonus_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_val=fld_StudentClub_PaperBonus().getAttribute("value");
        String exp_val=TestBaseProvider.getTestBase().getTestData().getString("sPaperBank");

        Assert.assertEquals(act_val, exp_val, "Incorrect value is displayed for Student PAPER BONUS and Decimal value is not accepting in Redemptions & Rewards Page");
    }

    @Override
    public void CSR_verify_label_PaperBonus_in_StudentClubs_section_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=label_PAPER_BONUS_StudentClubs_RedemptionsRewardsPage().getText();
        act_text=act_text.trim();

        String exp_text="CREDIT NOTES";

        Assert.assertEquals(act_text, exp_text, "Incorrect label is displayed for PAPER BONUS COUPONS in Student Clubs section in Redemptions & Rewards Page");

    }

    @Override
    public void CSR_verify_paragraph_is_displayed_for_PaperBonus_fld_in_StudentClubs_section_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            fld_paragraph_PAPER_BONUS_StudentClubs_RedemptionsRewardsPage().isDisplayed();
            System.out.println("Paragraph fld is displayed for PAPER BONUS COUPONS in StudentClubs section in RewardsCouponsPage");
        } catch (Exception e) {
            Assert.fail("Paragraph fld is not displayed for PAPER BONUS COUPONS in StudentClubs section in RewardsCouponsPage");
        }
    }

    @Override
    public void CSR_verify_label_APPLY_btn_in_StudentClubs_section_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=btnSkip1().getText();
        act_text=act_text.trim();

        String exp_text="APPLY";

        Assert.assertEquals(act_text, exp_text, "Incorrect label is displayed for APPLY button in Student Clubs section in Redemptions & Rewards Page");
    }

    @Override
    public void CSR_verify_label_Student_Clubs_Amt_Owing_in_StudentClubs_section_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=label_Student_Clubs_Amt_Owing_RedemptionsRewardsPage().getText();
        act_text=act_text.trim();

        String exp_text="Your Teacher Order Total";

        Assert.assertEquals(act_text, exp_text, "Incorrect label is displayed for Student Clubs Amount Owing in Student Clubs section in Redemptions & Rewards Page");
    }

    @Override
    public void CSR_verify_flds_Student_Clubs_AmtOwing_TotalItems_in_StudentClubs_section_in_RewardsCouponsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            fld_Tot_AmtOwing_Student_Clubs_RedemptionsRewardsPage().isDisplayed();
            System.out.println("Student Clubs Amount Owing field is displayed in Redemptions & Rewards Page");
        } catch (Exception e) {
            Assert.fail("Student Clubs Amount Owing field is not displayed in Redemptions & Rewards Page");
        }

        try {
            fld_Tot_Items_Student_Clubs_RedemptionsRewardsPage().isDisplayed();
            System.out.println("Student Clubs Total Items field is displayed in the footer region in Redemptions & Rewards Page");
        } catch (Exception e) {
            Assert.fail("Student Clubs Total Items field is not displayed in the footer region in Redemptions & Rewards Page");
        }

    }

    @Override
    public void CSR_verify_label_of_REWARDS_section_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=label_REWARDS_in_RedemptionsRewardsPage().getText();
        act_text=act_text.trim();

        String exp_text="REWARDS";

        Assert.assertEquals(act_text, exp_text, "Incorrect label is displayed for REWARDS filed in Redemptions & Rewards Page");

    }

    @Override
    public void CSR_verify_label_of_Rewards_earned_Today_in_REWARDS_section_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=lebel_Rewards_Qualifying_order_in_REWARDS_section_in_RedemptionsRewardsPage().getText();
        act_text=act_text.trim();

        String exp_text="REWARDS EARNED WITH TODAY'S QUALIFYING ORDER VALUE OF ";
        String exp_text2=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        exp_text2=exp_text2.trim();

        exp_text=exp_text+exp_text2;

        Assert.assertEquals(act_text, exp_text, "Incorrect label is displayed for Rewards Earned with Today's Qualifying Order Value of filed in Redemptions & Rewards Page");

    }

    @Override
    public void CSR_verify_label_of_How_is_Qualifying_Order_in_REWARDS_section_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=fld_How_is_Qualifying_order_in_REWARDS_section_in_RedemptionsRewardsPage().getText();
        act_text=act_text.trim();

        String exp_text="How is my Qualifying Order Value calculated?";

        Assert.assertEquals(act_text, exp_text, "Incorrect label is displayed for How is my Qualifying Order Value calculated? filed in Redemptions & Rewards Page");

    }

    @Override
    public void CSR_verify_TimeDate_fld_displayed_in_REWARDS_section_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            fld_TimeAndDate_in_REWARDS_section_in_RedemptionsRewardsPage().isDisplayed();
            System.out.println("Time and Date field is displayed in Rewards section");
        } catch (Exception e) {
            Assert.fail("Time and Date field is not displayed in Rewards section");
        }
    }

    @Override
	public void CSR_verify_TimeDate_text_in_REWARDS_section_in_Redemptions_Rewards_Page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);

		String act_text=fld_TimeAndDate_in_REWARDS_section_in_RedemptionsRewardsPage().getText();

		String exp_text="Submit order by 10/31, 11:59pm ET, to receive October rewards";


		Assert.assertEquals(act_text, exp_text, "Incorrect Time and Dtae is displayed in Rewards section in Redemptions & Rewards Page");
	}

    @Override
    public void CSR_verify_fld_How_is_my_Qualifying_Order_value_displayed_in_REWARDS_section_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            fld_How_is_Qualifying_order_in_REWARDS_section_in_RedemptionsRewardsPage().isDisplayed();
            System.out.println("How is my Qualifying Order value field is displayed in Rewards section");
        } catch (Exception e) {
            Assert.fail("How is my Qualifying Order value field is not displayed in Rewards section");
        }
    }

    @Override
    public void CSR_verify_Qualifying_Amt_in_REWARDS_section_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=lebel_Rewards_Qualifying_order_in_REWARDS_section_in_RedemptionsRewardsPage().getText();
        act_text=act_text.trim();

        String exp_text="REWARDS EARNED WITH TODAY'S QUALIFYING ORDER VALUE OF ";
        String exp_text2=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        exp_text2=exp_text2.trim();

        exp_text=exp_text+exp_text2;
        System.out.println("###############:"+exp_text);
        Assert.assertEquals(act_text, exp_text, "Incorrect Qualifying amount is displayed in Rewards section in Redemptions & Rewards Page");
    }

    @Override
    public void CSR_verify_FreeItem_Promotion_displayed_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            fld_FreeItem_Promotion_in_RedemptionsRewardsPage().isDisplayed();
            System.out.println("FreeItem promotion is displayed in Redemptions & Rewards Page");
        } catch (Exception e) {
            Assert.fail("FreeItem promotion is not displayed in Redemptions & Rewards Page");
        }

    }

    @Override
    public void CSR_verify_label_FreeItem_Promotion_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=fld_FreeItem_Promotion_in_RedemptionsRewardsPage().getText();
        String exp_text="You've earned a pack of 5 FREE New Books!";

        Assert.assertEquals(act_text, exp_text, "Incorrect FreeItem promotion is displayed in Redemptions & Rewards Page");
    }

    @Override
    public void CSR_verify_fld_FreeItem_Promotion_not_displayed_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            fld_FreeItem_Promotion_in_RedemptionsRewardsPage().isDisplayed();
            Assert.fail("FreeItem promotion is displayed in Redemptions & Rewards Page");
        } catch (Exception e) {
            System.out.println("FreeItem promotion is not displayed in Redemptions & Rewards Page");
        }
    }

    @Override
    public void CSR_verify_label_ShippingHandling_price_is_FREE_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=header_BlueBar_Shipping_TotalAmount().getText();
        act_text=act_text.trim();
        String exp_text="FREE!";

        Assert.assertEquals(act_text, exp_text, "Incorrect text is displayed if the shipping is free in Redemptions & Rewards Page");

    }

    @Override
    public void enter_amount_in_Shipping_Bonus_Bank() {
        PauseUtil.pause(2000);
        PauseUtil.waitForAjaxToComplete(2500);
        try {
            fld_ShippingFee_btn_EDIT().isDisplayed();
            fld_ShippingFee_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_Shipping_BonusBank().click();
        fld_Shipping_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_Shipping_BonusBank().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("shipBonusBank"));

    }

    @Override
    public void CSR_validate_value_of_Shipping_Bonus_Bank_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_val=fld_Shipping_BonusBank().getAttribute("value");
        String exp_val=TestBaseProvider.getTestBase().getTestData().getString("shipBonusBank");

        Assert.assertEquals(act_val, exp_val, "Incorrect value is displayed for Shipping BONUS BANK and Decimal value is not accepted in Redemptions & Rewards Page");
    }

    @Override
    public void enter_amount_in_Shipping_Paper_Bonus() {
        PauseUtil.pause(2000);
        PauseUtil.waitForAjaxToComplete(2500);
        try {
            fld_ShippingFee_btn_EDIT().isDisplayed();
            fld_ShippingFee_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_Shipping_PaperBonus().click();
        fld_Shipping_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_Shipping_PaperBonus().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("shipPaperBonus"));

    }

    @Override
    public void CSR_validate_value_of_Shipping_Paper_Bonus_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_val=fld_Shipping_PaperBonus().getAttribute("value");
        String exp_val=TestBaseProvider.getTestBase().getTestData().getString("shipPaperBonus");

        Assert.assertEquals(act_val, exp_val, "Incorrect value is displayed for Shipping Paper Bonus and Decimal value is not accepted in Redemptions & Rewards Page");
    }

    @Override
    public void CSR_verify_StudentIncentives_field_displayed_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(5000);

        try {
            fld_StudentIncentive1_Section_RewardsPage().isDisplayed();
            System.out.println("Student Incentive field is displayed in Redemptions & Rewards Page");
        } catch (Exception e) {
            Assert.fail("Student Incentive field is not displayed in Redemptions & Rewards Page");
        }
    }

    @Override
    public void CSR_verify_StudentIncentives_textBox_field_displayed_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(5000);

        try {
            tossinQty().isDisplayed();
            System.out.println("Student Incentive text box field is displayed in Redemptions & Rewards Page");
        } catch (Exception e) {
            Assert.fail("Student Incentive text box field is not displayed in Redemptions & Rewards Page");
        }
    }

    @Override
    public void CSR_enter_numOfStudents_StudentIncentives_textBox_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        tossinQty().click();
        tossinQty().clear();
        tossinQty().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("NumOfStudents"));

    }

    @Override
    public void CSR_verify_the_value_entered_in_StudentIncentives_textBox_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_val=tossinQty().getAttribute("value");
        String exp_val=TestBaseProvider.getTestBase().getTestData().getString("NumOfStudents");

        Assert.assertEquals(act_val, exp_val, "Student Incentive text box field is not accepting the entered "+exp_val+" value in Redemptions & Rewards Page");

    }

    @Override
    public void CSR_verify_the_spcailChars_And_alphabets_values_in_StudentIncentives_textBox_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_val=tossinQty().getAttribute("value");
        System.out.println("#############:"+act_val);
        String exp_val=TestBaseProvider.getTestBase().getTestData().getString("NumOfStudents");

        Assert.assertNotEquals(act_val, exp_val, "Student Incentive text box field is accepting the entered "+exp_val+" value in Redemptions & Rewards Page");

    }

	@Override
	public void CSR_verify_PopUp_for_exceeded_students_displayed_for_StudentIncentives_in_Redemptions_Rewards_Page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
	
		try {
			popUp_Exceeded_Students_StudentIncentive_Redemptions_Rewards_Page().isDisplayed();
			System.out.println("Exceeded students error popUp is displayed in Redemptions & Rewards page");
		} catch (Exception e) {
			Assert.fail("Exceeded students error popUp is not displayed in Redemptions & Rewards page");
		}
	}
	
    @Override
    public void CSR_verify_PopUp_for_exceeded_students_not_displayed_for_StudentIncentives_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            popUp_Exceeded_Students_StudentIncentive_Redemptions_Rewards_Page().isDisplayed();
            Assert.fail("Exceeded students error popUp is displayed in Redemptions & Rewards page");
        } catch (Exception e) {
            System.out.println("Exceeded students error popUp is not displayed in Redemptions & Rewards page");
        }
    }

    @Override
    public void CSR_verify_DTS_section_MakeSelection_fld_displayed_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            fld_Dollars_To_Spend_Coupons_Rewards().isDisplayed();
            System.out.println("DTS section is displayed in Redemptions & Rewards page");
        } catch (Exception e) {
            Assert.fail("DTS section is not displayed in Redemptions & Rewards page");
        }

		/*try {
			getBtnMakeYourSelection().isDisplayed();
			System.out.println("MAKE SELECTION button is displayed in Redemptions & Rewards page");
		} catch (Exception e) {
			Assert.fail("MAKE SELECTION button is not displayed in Redemptions & Rewards page");
		}*/
    }

    @Override
    public void CSR_verify_DTS_modal_window_displayed_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            DTS_modal_window_Redemptions_Rewards_Page().isDisplayed();
            System.out.println("DTS modal window is displayed in Redemptions & Rewards page");
        } catch (Exception e) {
            Assert.fail("DTS modal window is not displayed in Redemptions & Rewards page");
        }
    }

    @Override
    public void CSR_verify_DTS_amt_is_same_in_header_of_MakeSelection_modal_window_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String exp_text=fld_Dollars_To_Spend_Coupons_Rewards().getText();
        float exp_val = Float.valueOf(exp_text.replaceAll("[^\\d.]+|\\.(?!\\d)", ""));

        String act_text=header_label_DTS_modal_window_Redemptions_Rewards_Page().getText();
        float act_val = Float.valueOf(act_text.replaceAll("[^\\d.]+|\\.(?!\\d)", ""));

        Assert.assertEquals(act_val, exp_val, "DTS amount value is incorrect in Make selection window header");

    }

    @Override
    public void CSR_verify_close_btn_displayed_in_DTS_modal_window_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            btn_close_DTS_modal_window_Redemptions_Rewards_Page().isDisplayed();
            System.out.println("Close button is displayed in DTS modal window");
        } catch (Exception e) {
            Assert.fail("Close button is not displayed in DTS modal window");
        }

    }

    @Override
    public void CSR_clicks_on_close_btn_in_DTS_modal_window_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        btn_close_DTS_modal_window_Redemptions_Rewards_Page().click();
    }

    @Override
    public void CSR_verify_deleted_item_not_displayed_in_DTS_modal_window_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        int act_val=selected_items_list_DTS_modal_window_Redemptions_Rewards_Page().size();
        int exp_val=1;

        Assert.assertEquals(act_val, exp_val, "Deleted item is displayed in DTS Make selection window");
    }

    @Override
    public void CSR_delete_selected_item_from_DTS_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        delete_coupon_in_RewardsPage().click();
        PauseUtil.pause(1000);
        CSR_YES_to_delete_selected_item_DTS_window().click();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
    }

    @Override
    public void CSR_verify_TopOff_msg_disappeared_in_DTS_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=TopOff_msg_DTS_modal_window_Redemptions_Page().getAttribute("style");
        act_text=act_text.trim();

        String exp_text="display: none;";

        Assert.assertEquals(act_text, exp_text, "Excceded amount TopOff message is not disappered in DTS modal window");

    }

    @Override
    public void CSR_verify_updated_total_price_for_selected_items_displayed_in_DTS_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String exp_val=selected_first_item_price_Your_current_selection_list_DTS_window().getText();
        exp_val=exp_val.substring(1);

        String act_val=YouHaveUsed_Tot_items_price_Your_current_selection_list_DTS_window().getText();

        Assert.assertEquals(act_val, exp_val, "Incorrect You Have Used amount is displayed in Your Current Selection section in DTS modal window");
    }

    @Override
    public void CSR_verify_updated_RemainingToSpend_amt_displayed_in_DTS_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_val=RemainingToSpend_amt_Your_current_selection_DTS_window().getText();
        double act_val_2=Double.parseDouble(act_val);

        String hdr_val=header_label_DTS_modal_window_Redemptions_Rewards_Page().getText();
        double hdr_val2 = Double.valueOf(hdr_val.replaceAll("[^\\d.]+|\\.(?!\\d)", ""));

        String exp_val=selected_first_item_price_Your_current_selection_list_DTS_window().getText();
        exp_val=exp_val.substring(1);

        double exp_val2=Double.parseDouble(exp_val);
        exp_val2=hdr_val2-exp_val2;
        exp_val2 =Double.parseDouble(new DecimalFormat("##.##").format(exp_val2));

        Assert.assertEquals(act_val_2, exp_val2, "Incorrect Remaining To Spend amount is displayed in Your Current Selection section in DTS modal window");

    }

    @Override
    public void CSR_Selects_another_item_from_Make_Selection_window() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(5000);
        List<WebElement> price = items_price_Make_Selection_Window();
        int value=price.size();

        double value2=TestBaseProvider.getTestBase().getTestData().getDouble("itemValue2");
        WebDriver driver=TestBaseProvider.getTestBase().getDriver();

        for (int i=0; i<=value; i++) {
            String text=price.get(i).getText();
            text=text.trim();

            String path="//tr[td[text()='"+text+"']]/td[5]/i";

            String path2=driver.findElement(By.xpath(path)).getAttribute("class");
            System.out.println("#################:"+path2);
            String classVal="fa fa-circle-o remove";

            text = text.substring(1);
            double text2=Double.parseDouble(text);

            if (text2 > value2 && path2.equals(classVal)) {
                driver.findElement(By.xpath(path)).click();
                PauseUtil.pause(5000);
                break;
            } else {
                System.out.println("value is lesser than expected");
            }
        }
    }

    @Override
    public void CSR_verify_correct_TopOff_amt_displayed_in_DTS_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            TopOff_msg_DTS_modal_window_Redemptions_Page().isDisplayed();
            System.out.println("TopOff message is displayed");
        } catch (Exception e) {
            Assert.fail("TopOff message is not displayed");
        }

        String act_val=Exeeded_Amt_MakeYourSelection_Window().getText();
        double act_val_is=Double.parseDouble(act_val);

        String hdr_val=header_label_DTS_modal_window_Redemptions_Rewards_Page().getText();
        double hdr_val2 = Double.valueOf(hdr_val.replaceAll("[^\\d.]+|\\.(?!\\d)", ""));

        String exp_val=selected_first_item_price_Your_current_selection_list_DTS_window().getText();
        exp_val=exp_val.substring(1);
        double exp_val_Item1=Double.parseDouble(exp_val);

        String exp_val2=selected_second_item_price_Your_current_selection_list_DTS_window().getText();
        exp_val2=exp_val2.substring(1);
        double exp_val_Item2=Double.parseDouble(exp_val2);

        double exp_val_3=exp_val_Item1+exp_val_Item2;
        exp_val_3=Double.parseDouble(new DecimalFormat("##.##").format(exp_val_3));

        double exp_val_is=exp_val_3-hdr_val2;
        exp_val_is=Double.parseDouble(new DecimalFormat("##.##").format(exp_val_is));

        Assert.assertEquals(act_val_is, exp_val_is, "Incorrect TopOff Exceeded amount is dsiplayed in Your Current Selection in DTS modal window");

    }

    @Override
    public void CSR_verify_correct_YouHaveUsed_amt_displayed_in_DTS_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_val=YouHaveUsed_fld_Your_current_selection_DTS_window().getText();
        double act_val2=Double.parseDouble(act_val);

        String hdr_val=header_label_DTS_modal_window_Redemptions_Rewards_Page().getText();
        double hdr_val2 = Double.valueOf(hdr_val.replaceAll("[^\\d.]+|\\.(?!\\d)", ""));

        Assert.assertEquals(act_val2, hdr_val2, "Incorrect You Have Used amount is dsiplayed in Your Current Selection in DTS modal window");

    }

    @Override
    public void CSR_clicks_on_CANCEL_btn_in_DTS_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        btn_CANCEL_Your_current_selection_DTS_window().click();
    }

    @Override
    public void CSR_verify_selected_items_are_lost_in_DTS_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=section_NoDataAvailable_Your_current_selection_DTS_window().getAttribute("class");
        String exp_text="dataTables_empty";

        Assert.assertEquals(act_text, exp_text, "Selected items are dsiplayed when CSR clicks on cancel without selecting confirm in Your Current Selection in DTS modal window");
    }

    @Override
    public void CSR_verify_selected_items_are_saved_in_DTS_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=section_NoDataAvailable_Your_current_selection_DTS_window().getAttribute("class");
        String exp_text="dataTables_empty";

        Assert.assertNotEquals(act_text, exp_text, "Selected items are not saved when CSR clicks on ConfirmApply button in Your Current Selection in DTS modal window");
    }

    @Override
    public void CSR_clicks_on_EDIT_btn_in_DTS_section_RedemptionsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        btn_EDIT_for_DTS_RedemptionsRewards_Page().click();

    }

    @Override
    public void CSR_verify_the_Exceeded_amt_text_in_DTS_modalWindow() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=TopOff_msg_DTS_modal_window_Redemptions_Page().getText();

        String[] act_text_2 = act_text.split("\\$");
        System.out.println("################:"+act_text_2[0]);

        String act_text_3=act_text_2[0].toString().trim();
        System.out.println("@@@@@@@@@@@@@@:"+act_text_3);

        String exp_text="*Your current selection exceeds your amount of Dollars to Spend";
        Assert.assertEquals(act_text_3, exp_text, "Incorrect Exceeded amount text is displayed for the Top Off amount in Your Currect Selection");
    }

    @Override
    public void CSR_unselects_the_selected_items_DTS_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        do {
            Selected_item_TickMark_DTS_modal_window_Redemptions_Page().click();
            PauseUtil.pause(2000);
            try {
                Selected_item_TickMark_DTS_modal_window_Redemptions_Page().isDisplayed();
            } catch (Exception e) {
                System.out.println("Selected items are empty");
                break;
            }
        } while (Selected_item_TickMark_DTS_modal_window_Redemptions_Page().isDisplayed());
    }

    @Override
    public void CSR_unselects_first_selected_item_from_list_DTS_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        Selected_item_TickMark_DTS_modal_window_Redemptions_Page().click();

    }

    @Override
    public void CSR_clicks_on_btn_X_to_delete_item_DTS_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        SCHUtils.waitForElementToBeClickable(delete_coupon_in_RewardsPage(), 45);
        delete_coupon_in_RewardsPage().click();
    }

    @Override
    public void CSR_verify_callout_msg_to_delete_item_DTS_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=Callout_msg_delete_item_DTS_modal_window_Redemptions_Page().getText();

        String exp_text="Delete This Item";
        Assert.assertEquals(act_text, exp_text, "Incorrect text is displayed for callout message to Delete the item in DTS Your Currect Selection");

    }

    @Override
    public void CSR_verify_labels_for_YES_NO_to_delete_item_DTS_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=CSR_YES_to_delete_selected_item_DTS_window().getText();

        String exp_text="YES";
        Assert.assertEquals(act_text, exp_text, "Incorrect text is displayed for YES button to Delete the item in DTS Your Currect Selection");

        String act_text_2=CSR_NO_to_delete_selected_item_DTS_window().getText();

        String exp_text_2="NO";
        Assert.assertEquals(act_text_2, exp_text_2, "Incorrect text is displayed for NO button to Delete the item in DTS Your Currect Selection");
    }

    @Override
    public void CSR_clicks_on_NO_btn_to_delete_item_DTS_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        CSR_NO_to_delete_selected_item_DTS_window().click();

    }

    @Override
    public void CSR_clicks_on_YES_btn_to_delete_item_DTS_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);

        CSR_YES_to_delete_selected_item_DTS_window().click();

    }

    @Override
    public void CSR_verify_callout_msg_disappered_in_DTS_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=CSR_callout_section_for_delete_item_DTS_window().getAttribute("style");

        String exp_text="display: none;";
        Assert.assertEquals(act_text, exp_text, "Callout message is not disappered when CSR cliciks on NO button in DTS Your Currect Selection");
    }

    @Override
    public void CSR_validate_items_are_removed_in_DTS_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=section_NoDataAvailable_Your_current_selection_DTS_window().getAttribute("class");
        String exp_text="dataTables_empty";

        Assert.assertEquals(act_text, exp_text, "Items are not removed from the selected list in DTS Your Currect Selection");
    }

    @Override
    public void CSR_verify_Prev_link_disabled_in_first_page_search_results() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=lnk_Prev_Your_current_selection_DTS_window().getAttribute("class");
        String exp_text="paginate_button previous disabled";

        Assert.assertEquals(act_text, exp_text, "Prev link is enabled in First page of Search results in DTS modal window");
    }

    @Override
    public void CSR_navigate_to_last_page_in_search_results_DTS_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        int pageCount=pages_search_results_DTS_window().size();

        WebDriver driver=TestBaseProvider.getTestBase().getDriver();
        driver.findElement(By.xpath("//div[@id='sfo-coupon-table_paginate']/span/a"+"["+pageCount+"]")).click();

    }

    @Override
    public void CSR_verify_Next_link_disabled_in_last_page_search_results() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=lnk_Next_Your_current_selection_DTS_window().getAttribute("class");
        String exp_text="paginate_button next disabled";

        Assert.assertEquals(act_text, exp_text, "Next link is enabled in last page of Search results in DTS modal window");
    }

    @Override
    public void CSR_verify_DTS_promotion_not_displayed_RewardsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            fld_Dollars_To_Spend_Coupons_Rewards().isDisplayed();
            Assert.fail("DTS promotion is displayed in Redemptions & Rewards Page");
        } catch (Exception e) {
            System.out.println("DTS promotion is not displayed in Redemptions & Rewards Page");
        }
    }

    @Override
    public void CSR_navigates_from_RewardsPage_to_ReviewCart_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        SCHUtils.waitForElementToBeClickable(tab_ReviewCart_CSR(), 30);
        tab_ReviewCart_CSR().click();

    }

    @Override
    public void CSR_clicks_on_item_title_DTS_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        item_first_in_DTS_modal_window_list().click();
    }

    @Override
    public void CSR_verify_table_is_expanded_when_clicks_on_item_DTS_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            section_expanded_table_in_DTS_modal_window_list().isDisplayed();
            System.out.println("Table is expanded when CSR clicks on item title in DTS window");
        } catch (Exception e) {
            Assert.fail("Table is not expanded when CSR clicks on item title in DTS window");
        }

    }

    @Override
    public void CSR_verify_thumbnail_image_displayed_when_clicks_on_item_DTS_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        try {
            img_thumbnail_in_DTS_modal_window_list().isDisplayed();
            System.out.println("Thumbnail image is displayed when CSR clicks on item title in DTS window");
        } catch (Exception e) {
            Assert.fail("Thumbnail image is not displayed when CSR clicks on item title in DTS window");
        }
    }

    @Override
    public void CSR_clicks_on_HideDetail_link_in_DTS_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        lnk_HideDetail_in_DTS_modal_window_list().click();
    }

    @Override
    public void CSR_verify_expanded_table_not_displayed_in_DTS_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            section_expanded_table_in_DTS_modal_window_list().isDisplayed();
            Assert.fail("Expanded table is displayed for the item in DTS modal window");
        } catch (Exception e) {
            System.out.println("Table is not expanded for the item title in DTS window");
        }
    }

    @Override
    public void CSR_verify_search_results_range_section_displayed_in_DTS_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            data_To_Check_By_Results_Text_Coupons_Rewards().isDisplayed();
            System.out.println("Search results items range section is displayed in DTS modal window");
        } catch (Exception e) {
            Assert.fail("Search results items range section is not displayed in DTS modal window");
        }
    }

    @Override
    public void CSR_verify_search_results_Tot_items_section_displayed_in_DTS_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            section_Tot_items_search_results_in_DTS_modal_window_list().isDisplayed();
            System.out.println("Search results Total no' of items section is displayed in DTS modal window");
        } catch (Exception e) {
            Assert.fail("Search results Total no' of items section is not displayed in DTS modal window");
        }

    }

    @Override
    public void CSR_verify_item_title_displays_correctly_in_DTS_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=title_fld_first_item_in_DTS_modal_window_list().getText();
        act_text=act_text.trim();

        String exp_text=TestBaseProvider.getTestBase().getTestData().getString("SearchData");
        Assert.assertEquals(act_text, exp_text, "Incorrect item title is displayed in DTS modal window");

    }

    @Override
    public void CSR_verify_item_num_displays_correctly_in_DTS_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_num=ItemNum_fld_first_item_in_DTS_modal_window_list().getText();
        act_num=act_num.trim();

        String exp_num=TestBaseProvider.getTestBase().getTestData().getString("SearchData");
        Assert.assertEquals(act_num, exp_num, "Incorrect item number is displayed in DTS modal window");
    }

    @Override
    public void CSR_verify_items_list_is_empty_in_DTS_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=section_NoDataAvailable_Your_current_selection_DTS_window().getAttribute("class");
        String exp_text="dataTables_empty";

        Assert.assertEquals(act_text, exp_text, "Items are displayed in DTS modal window");
    }

    @Override
    public void CSR_verify_PopUp_msg_for_StudentIncentives_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=popUp_Exceeded_Students_StudentIncentive_Redemptions_Rewards_Page().getText();
        act_text=act_text.trim();

        String exp_text="Empty field is invalid";

        Assert.assertEquals(act_text, exp_text, "Incorrect popUp message is displayed for StudentIncentives");

    }


    @Override
    public void CSR_clicks_on_EDIT_btn_for_coupon_fld_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        EDIT_Selected_Item_in_Modal_window().click();

    }

    @Override
    public void CSR_verify_FreePick_modal_window_displayed_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            DTS_modal_window_Redemptions_Rewards_Page().isDisplayed();
            System.out.println("FreePick modal window is displayed in Redemptions & Rewards page");
        } catch (Exception e) {
            Assert.fail("FreePick modal window is not displayed in Redemptions & Rewards page");
        }
    }


    @Override
    public void CSR_verify_Selected_items_are_saved_in_FreePick_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            section_NoDataAvailable_Your_current_selection_DTS_window().isDisplayed();
            System.out.println("Selected items are displayed in FreeItem modal window");
        } catch (Exception e) {
            Assert.fail("Selected items are not displayed in FreeItem modal window");
        }
    }

    @Override
    public void CSR_clicks_on_delete_btn_for_selected_item_FreePick_modalWindow() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        btn_delete_selected_item_FreeItem_window_in_RewardsPage().click();
    }

    @Override
    public void CSR_verify_Selected_items_are_not_displayed_in_FreePick_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            section_NoDataAvailable_Your_current_selection_DTS_window().isDisplayed();
            Assert.fail("Selected items are displayed in FreeItem modal window");
        } catch (Exception e) {
            System.out.println("Selected items are not displayed in FreeItem modal window");
        }
    }

    @Override
    public void CSR_verify_checked_btn_not_displayed_for_deleted_item_in_FreePick_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            btn_checked_for_selected_item_Your_current_selection_DTS_window().isDisplayed();
            Assert.fail("Checked button for the item is displayed");
        } catch (Exception e) {
            System.out.println("Checked button for the selected item is removed");
        }
    }

    @Override
    public void CSR_clicks_on_entered_FreePick_coupon_fld() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        fld_entered_FreePick_coupon_Redemptions_page().click();
    }

    @Override
    public void CSR_apply_a_coupon_in_Rewards_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        try {
            delete_coupon_in_RewardsPage().isDisplayed();
            CSR_delete_selected_item_from_DTS_window();
        } catch (Exception e) {
            System.out.println("No coupons are available to delete");
        }
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        fld_Enter_CouponCode_RewardsPage().click();
        fld_Enter_CouponCode_RewardsPage().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("CouponCode"));
        PauseUtil.pause(4000);
        btn_Apply_for_Coupon_RewardsPage().click();
    }

    @Override
    public void CSR_verify_EDIT_link_displayed_in_coupon_section_in_Rewards_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            EDIT_Selected_Item_in_Modal_window().isDisplayed();
            System.out.println("EDIT link is displayed in Coupons section in Redemptions page");
        } catch (Exception e) {
            Assert.fail("EDIT link is not displayed in Coupons section in Redemptions page");
        }
    }

    @Override
    public void CSR_Selects_another_item_from_FreeItem_Selection_window() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(5000);
        List<WebElement> price = items_price_FreeItem_Modal_Window();
        int value=price.size();

        double value2=TestBaseProvider.getTestBase().getTestData().getDouble("itemValue2");
        WebDriver driver=TestBaseProvider.getTestBase().getDriver();

        for (int i=0; i<=value; i++) {
            String text=price.get(i).getText();
            text=text.trim();

            String path="(//tr[td[text()='"+text+"']]/td[6]/i)[1]";

            String path2=driver.findElement(By.xpath(path)).getAttribute("class");
            System.out.println("#################:"+path2);
            String classVal="fa fa-circle-o remove";

            text = text.substring(1);
            double text2=Double.parseDouble(text);

            if (text2 > value2 && path2.equals(classVal)) {
                driver.findElement(By.xpath(path)).click();
                PauseUtil.pause(5000);
                break;
            } else {
                System.out.println("value is lesser than expected");
            }
        }
    }

    @Override
    public void CSR_verify_selected_item_info_correctly_in_FreeItem_YourSelection_window() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);

        String act_val=fld_selected_item_num_MakeSelection_Window().getText();
        String exp_val=fld_selected_item_num_YourSelection_Window().getText();
        Assert.assertEquals(act_val, exp_val, "Incorrect item Number is displayed for selected item in Your Selection list");

        String act_title=fld_selected_item_Title_MakeSelection_Window().getText();
        act_title=act_title.trim();
        String exp_title=fld_selected_item_Title_YourSelection_Window().getText();
        exp_title=exp_title.trim();
        Assert.assertEquals(act_title, exp_title, "Incorrect item Title is displayed for selected item in Your Selection list");

        String act_Flyer=fld_selected_item_Flyer_MakeSelection_Window().getText();
        act_Flyer=act_Flyer.trim();
        String exp_Flyer=fld_selected_item_Flyer_YourSelection_Window().getText();
        exp_Flyer=exp_Flyer.trim();
        Assert.assertEquals(act_Flyer, exp_Flyer, "Incorrect item Flyer is displayed for selected item in Your Selection list");
    }

    @Override
    public void CSR_verify_selected_item_only_displayed_YourSelection_list_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        int act_val=selected_items_list_DTS_modal_window_Redemptions_Rewards_Page().size();
        int exp_val=1;

        Assert.assertEquals(act_val, exp_val, "Incorrect Your Selection list is displayed");
    }

    @Override
    public void CSR_clicks_on_item_title_FreePick_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        item_first_in_FreePick_modal_window_list().click();
    }

    @Override
    public void CSR_verify_item_num_displays_correctly_in_FreePick_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_num=ItemNum_fld_first_item_in_FreePick_modal_window_list().getText();
        act_num=act_num.trim();

        String exp_num=TestBaseProvider.getTestBase().getTestData().getString("SearchData");
        Assert.assertEquals(act_num, exp_num, "Incorrect item number is displayed in FreePick modal window");
    }

    @Override
    public void CSR_clicks_on_NO_to_delete_coupon_in_Rewards_page_coupons_section() {
        //PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1500);

        NO_to_delete_coupon_RewardsPage().click();
    }

    @Override
    public void CSR_clicks_on_YES_to_delete_coupon_in_Rewards_page_coupons_section() {
        //PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        YES_to_delete_coupon_RewardsPage().click();
    }

    @Override
    public void CSR_verify_delete_CallOut_disappeared_in_Redemptions_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=delete_callOut_msg_coupons_section_Redemptions_page().getAttribute("style");
        act_text=act_text.trim();

        String exp_text="display: none;";
        Assert.assertEquals(act_text, exp_text, "Delete CallOut message popUp is not disappeared");
    }

    @Override
    public void CSR_verify_delete_CallOut_not_displayed_in_Redemptions_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            delete_callOut_msg_coupons_section_Redemptions_page().isDisplayed();
            Assert.fail("Delete CallOut message popUp is not disappeared");
        } catch (Exception e) {
            System.out.println("Delete CallOut message popUp is disappeared");
        }
    }

    @Override
    public void CSR_verify_coupon_section_displayed_and_retained_in_Redemptions_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            fld_applied_coupon_Section1_RewardsPage().isDisplayed();
            System.out.println("Coupon section is displayed in Rewrads page");
        } catch (Exception e) {
            Assert.fail("Coupon section is not displayed and selections are not retained in Rewrads page");
        }
    }

    @Override
    public void CSR_verify_coupon_section_not_displayed_in_Redemptions_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            fld_applied_coupon_Section1_RewardsPage().isDisplayed();
            Assert.fail("Coupon section is displayed in Rewrads page");
        } catch (Exception e) {
            System.out.println("Coupon section is not displayed in Rewrads page");
        }
    }

    @Override
    public void CSR_verify_coupon_is_removed_from_cart_in_Redemptions_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            fld_applied_coupon_Section2_RewardsPage().isDisplayed();
            Assert.fail("Coupon is not removed from the coupons cart section in Rewrads page");
        } catch (Exception e) {
            System.out.println("Coupon is removed from the coupons cart section in Rewrads page");
        }
    }

    @Override
    public void CSR_validate_error_message_for_invalid_couponCode_RewardsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String Coupon=TestBaseProvider.getTestBase().getTestData().getString("CouponCode");
        String exp_text="The system does not recognize the coupon code "+"\""+Coupon+"\""+" you have entered. Please check the coupon and try again. If the coupon code is correct, please contact Customer Service at 1-800-268-3860.";
        String act_text=popUp_coupon_error_message_RewardsPage().getText();

        Assert.assertEquals(act_text, exp_text, "Incorrect error message is displayed");
    }

    @Override
    public void CSR_validate_error_message_for_already_entered_couponCode_RewardsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String Coupon=TestBaseProvider.getTestBase().getTestData().getString("CouponCode");
        String exp_text="Coupon code "+"\""+Coupon+"\""+" is already in your cart.";
        String act_text=popUp_coupon_error_message_RewardsPage().getText();

        Assert.assertEquals(act_text, exp_text, "Incorrect error message is displayed for already entered coupon code");
    }

    @Override
    public void CSR_validate_Apply_btn_enabled_in_RewardsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        if (btn_Apply_for_Coupon_RewardsPage().isEnabled()) {
            System.out.println("Apply button is enabled");
        } else {
            Assert.fail("Apply button is not enabled when CSR enters 3digits in coupon field");
        }
    }

    @Override
    public void CSR_enters_coupon_without_clicks_on_ApplyBtn_in_Rewards_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        try {
            delete_coupon_in_RewardsPage().isDisplayed();
            CSR_delete_selected_item_from_DTS_window();
        } catch (Exception e) {
            System.out.println("No coupons are available to delete");
        }
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        fld_Enter_CouponCode_RewardsPage().click();
        fld_Enter_CouponCode_RewardsPage().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("CouponCode"));
    }

    @Override
    public void CSR_clicks_on_MakeSelection_in_RedemptionsPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        if (list_btn_EDIT_for_DTS_RedemptionsRewards_Page().size()!=0) {
        	btn_EDIT_for_DTS_RedemptionsRewards_Page().click();
        	PauseUtil.waitForAjaxToComplete(1500);
            PauseUtil.pause(2000);
        	do {
        		delete_coupon_in_RewardsPage().click();
    			PauseUtil.pause(1000);
    			YES_to_delete_coupon_RewardsPage().click();
    			PauseUtil.pause(1000);
    			try {
    				delete_coupon_in_RewardsPage().isDisplayed();
    			} catch (Exception e) {
    				System.out.println("################ DTS selection list is empty");
    				PauseUtil.pause(2000);
    				break;
    			}
    		} while (delete_coupon_in_RewardsPage().isDisplayed());
        	
		} else if (list_btnMakeYourSelection().size()!=0) {
			PauseUtil.pause(1000);
			getBtnMakeYourSelection().click();
		} else {
			Assert.fail("Make Selection button is not displayed");
		}
        /*SCHUtils.waitForElementToBeClickable(getBtnMakeYourSelection(), 30);
        PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(1000);
        getBtnMakeYourSelection().click();*/
    }

    @Override
    public void CSR_enters_value_in_StudentIncentives_if_displayed_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            tossinQty().isDisplayed();
            tossinQty().click();
            tossinQty().clear();
            tossinQty().sendKeys("1");
        } catch (Exception e) {
            System.out.println("Student Incentives field is not displayed");
        }
    }

    @Override
    public void CSR_verify_shipping_charge_is_free_in_Redemptions_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=header_BlueBar_Shipping_TotalAmount().getText();
        act_text=act_text.trim();

        String exp_text="FREE!";

        Assert.assertEquals(act_text, exp_text, "Free shipping is not received and Shipping charge amount is displayed in Redemptions & Rewards page");

    }

    @Override
    public void CSR_verify_shipping_charge_is_free_in_Redemptions_page_and_delete_appliedCoupon() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=header_BlueBar_Shipping_TotalAmount().getText();
        act_text=act_text.trim();

        String exp_text="FREE!";

        Assert.assertEquals(act_text, exp_text, "Free shipping is not received and Shipping charge amount is displayed in Redemptions & Rewards page");

        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        try {
            delete_coupon_in_RewardsPage().isDisplayed();
            CSR_delete_selected_item_from_DTS_window();
        } catch (Exception e) {
            Assert.fail("Applied coupon section is not displayed");
        }

    }

    @Override
    public void CSR_verify_shipping_charge_is_not_free_in_Redemptions_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=header_BlueBar_Shipping_TotalAmount().getText();
        act_text=act_text.trim();

        String exp_text="FREE!";

        Assert.assertNotEquals(act_text, exp_text, "Received Free shipping and Shipping charge displayed as FREE! in Redemptions & Rewards page");

    }

    @Override
    public void validate_error_message_which_does_not_meet_the_min_cart_val() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String Coupon=TestBaseProvider.getTestBase().getTestData().getString("CouponCode");
        String exp_text="Your order does not meet the "+"\""+Coupon+"\""+" coupon requirements. Please check the coupon for details.";
        String act_text=popUp_coupon_error_message_RewardsPage().getText();

        Assert.assertEquals(act_text, exp_text, "Incorrect error message is displayed for the order doesn't meet the Coupon's min value");
    }

    @Override
    public void validate_error_message_for_reenter_the_same_coupon() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=popUp_coupon_error_message_RewardsPage().getText();
        String exp_text="Shipping for your order is already FREE! This coupon code cannot be applied.";

        Assert.assertEquals(act_text, exp_text, "Incorrect error message is displayed for re-enter the same coupon");
    }

    @Override
    public void validate_cheques_payable_to_message_and_section_displayed_Payment_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            section_cheques_payable_to_message_PaymentPage().isDisplayed();
            System.out.println("Cheques Payable to message section is displayed when CSR selects payment method as Cheques");
        } catch (Exception e) {
            Assert.fail("Cheques Payable to message section is not displayed when CSR selects payment method as Cheques");
        }
    }

    @Override
    public void enter_amount_in_student_Bonus_Bank_which_is_equal_to_StudentClub_Tot_amt() {
        PauseUtil.pause(2000);
        PauseUtil.waitForAjaxToComplete(2500);

        String StudentClubsTotValue=header_BlueBar_StudentClub_PostAmount().getText();
        StudentClubsTotValue = StudentClubsTotValue.substring(1);

        try {
            fld_StudentClub_btn_EDIT().isDisplayed();
            fld_StudentClub_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_StudentClub_BonusBank().click();
        fld_StudentClub_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_StudentClub_BonusBank().sendKeys(StudentClubsTotValue);

    }

    @Override
    public void enter_amount_in_teacher_Bonus_Bank_which_is_equal_to_TeacherCatalogue_Tot_amt() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String TeacherCatTotValue=header_BlueBar_TeacherCatalogues_PostAmount().getText();
        TeacherCatTotValue = TeacherCatTotValue.substring(1);

        try {
            fld_TeacherCat_btn_EDIT().isDisplayed();
            fld_TeacherCat_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_TeacherCat_BonusBank().click();
        fld_TeacherCat_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_TeacherCat_BonusBank().sendKeys(TeacherCatTotValue);
    }

    @Override
    public void enter_amount_in_shipping_Bonus_Bank_which_is_equal_to_ShippingCharge_Tot_amt() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String ShippingValue=header_BlueBar_Shipping_TotalAmount().getText();
        ShippingValue=ShippingValue.trim();
        ShippingValue = ShippingValue.substring(1);

        try {
            fld_ShippingFee_btn_EDIT().isDisplayed();
            fld_ShippingFee_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_Shipping_BonusBank().click();
        fld_Shipping_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_Shipping_BonusBank().sendKeys(ShippingValue);
    }

    @Override
    public void verify_payment_options_are_not_displayed_and_disabled_PaymentPage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(5000);

		/*try {
			section_payment_options_disabled_PaymentPage().isDisplayed();
			System.out.println("Payment options are not displayed and the section is disabled state");
		} catch (Exception e) {
			Assert.fail("Payment options are displayed and the section is enabled state");
		}	*/

        String act_text=section_payment_options_disabled_PaymentPage().getAttribute("class");
        String exp_text="payment-method-options disablePayment";

        Assert.assertEquals(act_text, exp_text, "Payment options are displayed and the section is enabled state");
    }

    @Override
    public void CSR_verify_the_percentage_recieved_in_Rewards_page_tier1_with_BonusPercentage() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String StudentClubSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubSubTotal = StudentClubSubTotal.substring(1);
        double StudentClubSubTotal_is=Double.parseDouble(StudentClubSubTotal);

        String Earned_amt=earned_BonusBank_amt_for_coupon_RewardsPage().getText();
        Earned_amt = Earned_amt.substring(1);
        double Earned_amt_act=Double.parseDouble(Earned_amt);

        double value1=100;
        double value2=150;

        if (StudentClubSubTotal_is>=value1 && StudentClubSubTotal_is<value2) {

            double BonusPercentagePromotion1=5;
            double BonusPercentagePromotion2=5;
            double BonusPercentagePromotion=BonusPercentagePromotion1+BonusPercentagePromotion2;

            double Earned_amt_exp=(BonusPercentagePromotion * StudentClubSubTotal_is)/100;
            Earned_amt_exp =Double.parseDouble(new DecimalFormat("##.##").format(Earned_amt_exp));
            System.out.println("#########Earned_amt_exp:"+Earned_amt_exp);

            Assert.assertEquals(Earned_amt_act, Earned_amt_exp, "Earned Bonus percentage amount value is incorrect");

        } else {
            Assert.fail("Student Clubs Total value is not expected to the tier1 and Bonus percentage coupon amount:"+StudentClubSubTotal_is);
        }
    }

    @Override
    public void CSR_verify_error_popup_displayed_RedeemRewards_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            popUp_coupon_error_message_RewardsPage().isDisplayed();
            System.out.println("Error popup message is displayed in coupon section in Redeem & Rewards page");
        } catch (Exception e) {
            Assert.fail("Error popup message is not displayed in coupon section in Redeem & Rewards page");
        }
    }

    @Override
    public void CSR_verify_BonusFlat_value_displayed_correctly_RedeemRewards_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        //AssertUtils.assertDisplayed(fld_earned_BonusBank_amt_section_RewardsPage());
        AssertUtils.assertDisplayed(earned_BonusBank_amt_for_coupon_RewardsPage());

        String StudentClubSubTotal=value_StudentClubSubTotal_RewardsCouponsPage().getText();
        StudentClubSubTotal = StudentClubSubTotal.substring(1);
        double StudentClubSubTotal_act=Double.parseDouble(StudentClubSubTotal);

        String BonusFlatAmt=earned_BonusBank_amt_for_coupon_RewardsPage().getText();
        BonusFlatAmt = BonusFlatAmt.substring(1);
        double BonusFlatAmt_act=Double.parseDouble(BonusFlatAmt);

        /*double tier1_val=1;
        double tier2_val=2;

        if (StudentClubSubTotal_act>=20 && StudentClubSubTotal_act<=50) {
            double BonusFlat_val_exp=10;
            BonusFlat_val_exp=BonusFlat_val_exp+tier1_val;
            Assert.assertEquals(BonusFlatAmt_act, BonusFlat_val_exp, "Incorrect Bonus Flat amount displayed for Tier1");

        } else if (StudentClubSubTotal_act>=50.01 && StudentClubSubTotal_act<=100) {
				double BonusFlat_val_exp=20;
				BonusFlat_val_exp=BonusFlat_val_exp+tier2_val;
				Assert.assertEquals(BonusFlatAmt_act, BonusFlat_val_exp, "Incorrect Bonus Flat amount displayed for Tier2");
			} else {
            Assert.fail("Student cubs Total value is unexpected range for Bonus Flat coupon");
        }*/
        
        double tier1_val=5;
        double tier2_val=10;
        double tier3_val=15;
        double tier4_val=25;
        
        if (StudentClubSubTotal_act>=25 && StudentClubSubTotal_act<=49.99) {
            Assert.assertEquals(BonusFlatAmt_act, tier1_val, "Incorrect Bonus Flat amount displayed for Tier1");
        } else if (StudentClubSubTotal_act>=50.00 && StudentClubSubTotal_act<=74.99) {
        	Assert.assertEquals(BonusFlatAmt_act, tier2_val, "Incorrect Bonus Flat amount displayed for Tier2");
		} else if (StudentClubSubTotal_act>=75 && StudentClubSubTotal_act<=124.99) {
	        	Assert.assertEquals(BonusFlatAmt_act, tier3_val, "Incorrect Bonus Flat amount displayed for Tier3");
		} else if (StudentClubSubTotal_act>=125 && StudentClubSubTotal_act<=199.99) {
	        	Assert.assertEquals(BonusFlatAmt_act, tier4_val, "Incorrect Bonus Flat amount displayed for Tier4");
		} else {
            Assert.fail("Student cubs Total value is unexpected range for Bonus Flat coupon");
        }
    }

    @Override
    public void CSR_verify_BonusFlat_amt_section_not_displayed_RedeemRewards_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            earned_BonusBank_amt_for_coupon_RewardsPage().isDisplayed();
            Assert.fail("Bonus Flat amount and section is displayed");
        } catch (Exception e) {
            System.out.println("Bonus Flat amount and section is not displayed");
        }
    }

    @Override
    public void CSR_verify_BonusFlat_Upsell_msg_displayed_RedeemRewards_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            section_UpSell_msg_BonusFlat_RedeemPage_CSR().isDisplayed();
            System.out.println("Upsell message is displayed for BonusFlat amount");
        } catch (Exception e) {
            Assert.fail("Upsell message is not displayed for BonusFlat amount");
        }
    }

    @Override
    public void CSR_enters_PostalCode_PaymentPage(){
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        getfld_alternativeshipping_postalcode().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("PostalCode"));
    }

    @Override
    public void CSR_performs_TAB_key_Payment_Page(){
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        getfld_alternativeshipping_postalcode().sendKeys(Keys.TAB);
    }

    @Override
    public void CSR_verify_error_popup_not_displayed_Payment_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            popUp_coupon_error_message_RewardsPage().isDisplayed();
            Assert.fail("Error popup message is displayed in Payment page");
        } catch (Exception e) {
            System.out.println("Error popup message is not displayed in Payment page");
        }
    }

    @Override
    public void CSR_verify_error_popup_displayed_Payment_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            popUp_coupon_error_message_RewardsPage().isDisplayed();
            System.out.println("Error popup message is displayed in Payment page");
        } catch (Exception e) {
            Assert.fail("Error popup message is not displayed in Payment page");
        }
    }

    @Override
    public void CSR_verify_correct_province_displayed_for_alternate_shipping_Payment_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String PostalCode=TestBaseProvider.getTestBase().getTestData().getString("PostalCode");
        String text=PostalCode.substring(0, 1);
        System.out.println("##########:"+text);

        if (text.equalsIgnoreCase("A")) {
            String act_text=province_state_alternate_shipping_PaymentPage().getText();
            String exp_text="Newfoundland and Labrador";
            Assert.assertEquals(act_text, exp_text, "Incorrect Province state is displayed for the letter starts with :"+text);
        } else if (text.equalsIgnoreCase("B")) {
            String act_text=province_state_alternate_shipping_PaymentPage().getText();
            String exp_text="Nova Scotia";
            Assert.assertEquals(act_text, exp_text, "Incorrect Province state is displayed for the letter starts with :"+text);
        } else if (text.equalsIgnoreCase("C")) {
            String act_text=province_state_alternate_shipping_PaymentPage().getText();
            String exp_text="Prince Edward Island";
            Assert.assertEquals(act_text, exp_text, "Incorrect Province state is displayed for the letter starts with :"+text);
        } else if (text.equalsIgnoreCase("E")) {
            String act_text=province_state_alternate_shipping_PaymentPage().getText();
            String exp_text="New Brunswick";
            Assert.assertEquals(act_text, exp_text, "Incorrect Province state is displayed for the letter starts with :"+text);
        } else if (text.equalsIgnoreCase("G")) {
            String act_text=province_state_alternate_shipping_PaymentPage().getText();
            String exp_text="Quebec";
            Assert.assertEquals(act_text, exp_text, "Incorrect Province state is displayed for the letter starts with :"+text);
        } else if (text.equalsIgnoreCase("H")) {
            String act_text=province_state_alternate_shipping_PaymentPage().getText();
            String exp_text="Quebec";
            Assert.assertEquals(act_text, exp_text, "Incorrect Province state is displayed for the letter starts with :"+text);
        } else if (text.equalsIgnoreCase("J")) {
            String act_text=province_state_alternate_shipping_PaymentPage().getText();
            String exp_text="Quebec";
            Assert.assertEquals(act_text, exp_text, "Incorrect Province state is displayed for the letter starts with :"+text);
        } else if (text.equalsIgnoreCase("K")) {
            String act_text=province_state_alternate_shipping_PaymentPage().getText();
            String exp_text="Ontario";
            Assert.assertEquals(act_text, exp_text, "Incorrect Province state is displayed for the letter starts with :"+text);
        } else if (text.equalsIgnoreCase("L")) {
            String act_text=province_state_alternate_shipping_PaymentPage().getText();
            String exp_text="Ontario";
            Assert.assertEquals(act_text, exp_text, "Incorrect Province state is displayed for the letter starts with :"+text);
        } else if (text.equalsIgnoreCase("M")) {
            String act_text=province_state_alternate_shipping_PaymentPage().getText();
            String exp_text="Ontario";
            Assert.assertEquals(act_text, exp_text, "Incorrect Province state is displayed for the letter starts with :"+text);
        } else if (text.equalsIgnoreCase("N")) {
            String act_text=province_state_alternate_shipping_PaymentPage().getText();
            String exp_text="Ontario";
            Assert.assertEquals(act_text, exp_text, "Incorrect Province state is displayed for the letter starts with :"+text);
        } else if (text.equalsIgnoreCase("P")) {
            String act_text=province_state_alternate_shipping_PaymentPage().getText();
            String exp_text="Ontario";
            Assert.assertEquals(act_text, exp_text, "Incorrect Province state is displayed for the letter starts with :"+text);
        } else if (text.equalsIgnoreCase("R")) {
            String act_text=province_state_alternate_shipping_PaymentPage().getText();
            String exp_text="Manitoba";
            Assert.assertEquals(act_text, exp_text, "Incorrect Province state is displayed for the letter starts with :"+text);
        } else if (text.equalsIgnoreCase("S")) {
            String act_text=province_state_alternate_shipping_PaymentPage().getText();
            String exp_text="Saskatchewan";
            Assert.assertEquals(act_text, exp_text, "Incorrect Province state is displayed for the letter starts with :"+text);
        } else if (text.equalsIgnoreCase("T")) {
            String act_text=province_state_alternate_shipping_PaymentPage().getText();
            String exp_text="Alberta";
            Assert.assertEquals(act_text, exp_text, "Incorrect Province state is displayed for the letter starts with :"+text);
        } else if (text.equalsIgnoreCase("V")) {
            String act_text=province_state_alternate_shipping_PaymentPage().getText();
            String exp_text="British Columbia";
            Assert.assertEquals(act_text, exp_text, "Incorrect Province state is displayed for the letter starts with :"+text);
        } else if (text.equalsIgnoreCase("Y")) {
            String act_text=province_state_alternate_shipping_PaymentPage().getText();
            String exp_text="Yukon";
            Assert.assertEquals(act_text, exp_text, "Incorrect Province state is displayed for the letter starts with :"+text);
        }
        else {
            Assert.fail("No Postal Code is provided");
        }
    }

    @Override
    public void CSR_verify_Province_dropdown_disabled_Payment_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=province_state_dropDown_selection_PaymentPage().getAttribute("class");
        String exp_text="disabled-layer";

        Assert.assertEquals(act_text, exp_text, "Province State selection drop down list is enabled");
    }

    @Override
    public void CSR_verify_correct_province_displayed_for_more_states_alternate_shipping_Payment_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String PostalCode=TestBaseProvider.getTestBase().getTestData().getString("PostalCode");
        String text=PostalCode.substring(0, 1);
        System.out.println("##########:"+text);

        if (text.equalsIgnoreCase("X")) {
            String act_text=province_state_dropDown_selection_PaymentPage().getText();
            String exp_text="Nunavut";
            Assert.assertEquals(act_text, exp_text, "Incorrect Province state is displayed for the letter starts with :"+text);
        }
        else {
            Assert.fail("No Postal Code is provided");
        }
    }

    @Override
    public void CSR_verify_Province_dropdown_enabled_Payment_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        String act_text=province_state_dropDown_selection_PaymentPage().getAttribute("class");
        String exp_text="selected-option";

        Assert.assertEquals(act_text, exp_text, "Province State selection drop down list is disabled");
    }

    @Override
    public void CSR_fills_alternateAddress_detail_Payment_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        getfld_alternativeshipping_address1().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("Address1"));
        PauseUtil.pause(1500);
        getfld_alternativeshipping_address2().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("Address2"));
        PauseUtil.pause(1500);
        getfld_alternativeshipping_postalcode().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("PostalCode"));
        PauseUtil.pause(1500);
        getfld_alternativeshipping_city().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("City"));

    }

    @FindBy(locator="paymentpage.newcard.nameOnCard")
    private WebElement paymentpagenewcardnameOnCard;

    @FindBy(locator="paymentpage.newcard.cardNumber")
    private WebElement paymentpagenewcardCardNumber;


    public WebElement getpaymentpagenewcardnameOnCard(){
        return paymentpagenewcardnameOnCard;
    }


    public WebElement getpaymentpagenewcardCardNumber(){
        return paymentpagenewcardCardNumber;
    }



    @Override
    public void enterCreditCardInfo() {
        PauseUtil.pause(2000);
        getpaymentpagenewcardnameOnCard().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("cardusersName"));
        PauseUtil.pause(2000);
        getpaymentpagenewcardCardNumber().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("cardNum"));
        PauseUtil.pause(5000);
    }

    @FindBy(locator="paymentpage.ccard.monthlist")
    private WebElement getccardmonthlist;

    @FindBy(locator="paymentpage.ccard.monthselect")
    private WebElement getccardmonthselect;

    @FindBy(locator="paymentpage.ccard.yearlist")
    private WebElement getccardyearlist;

    @FindBy(locator="paymentpage.ccard.yearlistallval")
    private List<WebElement> listallvaluesyeardropdown;


    public WebElement getmonthListccard() {
        return getccardmonthlist;
    }

    public WebElement selectMonthCcard() {
        return getccardmonthselect;
    }


    public WebElement clickyearlistcCard() {
        return getccardyearlist;
    }

    public List <WebElement> listallyearscCard() {
        return listallvaluesyeardropdown;
    }

    @Override
    public void selectCreditCardExpirationYear() {
        //click on the Month dropdown
        getmonthListccard().click();
        PauseUtil.pause(2000);

        //Select the first month from dropdown
        selectMonthCcard().click();
        PauseUtil.pause(2000);

        //Click on the Year dropdown
        clickyearlistcCard().click();
    }

    @Override
    public void validatecardyrsList() {
        PauseUtil.pause(1000);
        System.out.println("listsize"+listallyearscCard().size());
        if(!((listallyearscCard().size()==21)||(listallyearscCard().size()==22))){
            Assert.fail("The list of years in dropdown is not equal to15");
        }

        if(listallyearscCard().size()==21){
            String yearEnd = listallyearscCard().get(20).getAttribute("data-label");
            System.out.println("The credit card is valid up to Year"+yearEnd);
            Assert.assertEquals(yearEnd, TestBaseProvider.getTestBase().getTestData().getString("yearEnd"));
            System.out.println("##################Ending############");
        }
        if(listallyearscCard().size()==22){
            String yearEnd = listallyearscCard().get(21).getAttribute("data-label");
            System.out.println("The credit card is valid up to Year"+yearEnd);
            Assert.assertEquals(yearEnd, TestBaseProvider.getTestBase().getTestData().getString("yearEnd"));
            System.out.println("##################Ending############");
        }

    }

    @Override
    public void MakeSelectionWindow_Search_WithSpecificTerm(String string) {
     getICouponSection().MakeSelectionWindow_Search_WithSpecificTerm(string);
     
    }
    
    @Override
    public void verify_no_search_results_display_in_MakeYourSelection_window(String message) {
     PauseUtil.waitForAjaxToComplete(2500);
     PauseUtil.pause(2000);
     Assert.assertTrue(empty_data_search_results_MakeYourSelection_window().isDisplayed(), "Search results are displayed");

     String text_exp=empty_data_search_results_MakeYourSelection_window().getText();
     String text_act=message;

     Assert.assertEquals(text_act, text_exp, "Search results are displayed");

    }
    
    @Override
    public void verifyResultforParticularSearch_DTSModal(String couponsearch){
     getICouponSection().verifyResultforParticularSearch_DTSModal(couponsearch);
    }
    
    //################################################## SCSCOD-6238 ####################################################
    @FindBy(locator = "dw.studentflyerorder.fld.BonusPoints.amt.Container4.CustProfile")
	private WebElement fld_BonusPoints_amt_Container4_CustProfile;
    
    private static double[] bonus_bank_amts;
    
    public WebElement fld_BonusPoints_amt_Container4_CustProfile() {
		return fld_BonusPoints_amt_Container4_CustProfile;
	}
    
    public void set_bonus_amt(double amt, int pos){
    	
    	if(bonus_bank_amts == null){
    		bonus_bank_amts = new double[6];
    	}
    	
    	bonus_bank_amts[pos] = amt;
    	System.out.println("Bonus Bank Amount Set at Position " + String.valueOf(pos));
    }
    
    public Double get_bonus_amt(int pos){
    	return bonus_bank_amts[pos];
    }
    
    // Function to ensure there are no bonus coupons in the fields
    @Override
    public void check_bonus_bank_amt(WebElement bonus_bank_amt_fld, WebElement bonus_coupon_EDIT_btn, WebElement get_coupon_apply_btn){
    	String bonus_bank_amt_str = bonus_bank_amt_fld.getAttribute("value");
        Double bonus_bank_amt_dbl = (bonus_bank_amt_str.isEmpty() ? 0 : Double.parseDouble(bonus_bank_amt_str));
        
        try {
        	bonus_coupon_EDIT_btn.isDisplayed();
        	bonus_coupon_EDIT_btn.click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }

        bonus_bank_amt_fld.click();
        
        if(bonus_bank_amt_dbl != 0){
        	
        	bonus_bank_amt_fld.clear();
        	get_coupon_apply_btn.click();
        	System.out.println("Removed previous bonus bank amount");
        } else {
        	bonus_bank_amt_fld.clear();
        	get_coupon_apply_btn.click();
        	System.out.println("No previous bonus bank amount was entered");
        }
    }
    
    @Override
    public void enter_redeemable_amount_in_Student_Club_bonus(){
    	PauseUtil.pause(2000);
        PauseUtil.waitForAjaxToComplete(2500);

        check_bonus_bank_amt(fld_StudentClub_BonusBank(), fld_StudentClub_btn_EDIT(), getcouponspagestudentapplybtn());
        
        String bonus_points = fld_BonusPoints_amt_Container4_CustProfile.getText();
        bonus_points = bonus_points.trim().replaceAll(",", "");
        bonus_points = bonus_points.substring(1);
        String arr_position = TestBaseProvider.getTestBase().getTestData().getString("DataLocation");
        
        set_bonus_amt(Double.parseDouble(bonus_points), Integer.parseInt(arr_position));
        
        try {
            fld_StudentClub_btn_EDIT().isDisplayed();
            fld_StudentClub_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        
        fld_StudentClub_BonusBank().click();
        fld_StudentClub_BonusBank().clear();
        
        PauseUtil.pause(2000);
        
        fld_StudentClub_BonusBank().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("sBonusBank"));
    }
    
    @Override
    public void bonus_bank_reduced_by_redeemable_amount(){
    	PauseUtil.pause(2000);
        PauseUtil.waitForAjaxToComplete(2500);
        
        String bonus_points = fld_BonusPoints_amt_Container4_CustProfile.getText();
        bonus_points = bonus_points.trim().replaceAll(",", "");
        bonus_points = bonus_points.substring(1);
        String arr_position = TestBaseProvider.getTestBase().getTestData().getString("DataLocation");
        
        Double current_bonus_points = Double.parseDouble(bonus_points);
        Assert.assertNotEquals(current_bonus_points, get_bonus_amt(Integer.parseInt(arr_position)), "Bonus Bank amount has not been reduced.");
    }
    
    @Override
    public void enter_redeemable_amount_in_Teacher_Catalogue_bonus(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        check_bonus_bank_amt(fld_TeacherCat_BonusBank(), fld_TeacherCat_btn_EDIT(), getcouponspageteacherapplybtn());
        
        String bonus_points = fld_BonusPoints_amt_Container4_CustProfile.getText();
        bonus_points = bonus_points.trim().replaceAll(",", "");
        bonus_points = bonus_points.substring(1);
        String arr_position = TestBaseProvider.getTestBase().getTestData().getString("DataLocation");
        
        set_bonus_amt(Double.parseDouble(bonus_points), Integer.parseInt(arr_position));
        
        try {
            fld_TeacherCat_btn_EDIT().isDisplayed();
            fld_TeacherCat_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        
        fld_TeacherCat_BonusBank().click();
        fld_TeacherCat_BonusBank().clear();
        
        PauseUtil.pause(2000);
        
        fld_TeacherCat_BonusBank().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("tBonusBank"));       
    }
    
    @Override
    public void enter_redeemable_amount_in_Shippinge_bonus(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        check_bonus_bank_amt(fld_Shipping_BonusBank(), fld_ShippingFee_btn_EDIT(), getcouponspageshipapplybtn());
        
        String bonus_points = fld_BonusPoints_amt_Container4_CustProfile.getText();
        bonus_points = bonus_points.trim().replaceAll(",", "");
        bonus_points = bonus_points.substring(1);
        String arr_position = TestBaseProvider.getTestBase().getTestData().getString("DataLocation");
        
        set_bonus_amt(Double.parseDouble(bonus_points), Integer.parseInt(arr_position));	
        
        try {
            fld_ShippingFee_btn_EDIT().isDisplayed();
            fld_ShippingFee_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        
        fld_Shipping_BonusBank().click();
        fld_Shipping_BonusBank().clear();
        
        PauseUtil.pause(2000);
        
        fld_Shipping_BonusBank().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("pBonusBank"));	
    }
    
    @Override
    public void csr_remove_amount_in_Student_Club_bonus(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        try {
            fld_StudentClub_btn_EDIT().isDisplayed();
            fld_StudentClub_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        
        fld_StudentClub_BonusBank().click();
        fld_StudentClub_BonusBank().clear();
    }
    
    @Override
    public void csr_remove_amount_in_Teacher_Catalogue_bonus(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        try {
            fld_TeacherCat_btn_EDIT().isDisplayed();
            fld_TeacherCat_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        
        fld_TeacherCat_BonusBank().click();
        fld_TeacherCat_BonusBank().clear();
    }
    
    @Override
    public void csr_remove_amount_in_Paid_Shipping_bonus(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        try {
            fld_ShippingFee_btn_EDIT().isDisplayed();
            fld_ShippingFee_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        
        fld_Shipping_BonusBank().click();
        fld_Shipping_BonusBank().clear();
    }
    
    @Override
    public void bonus_bank_amount_is_the_same_as_before(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        String bonus_points = fld_BonusPoints_amt_Container4_CustProfile.getText();
        bonus_points = bonus_points.trim().replaceAll(",", "");
        bonus_points = bonus_points.substring(1);
        String arr_position = TestBaseProvider.getTestBase().getTestData().getString("DataLocation");
        
        Double current_bonus_points = Double.parseDouble(bonus_points);
        Double actual_bonus_points = get_bonus_amt(Integer.parseInt(arr_position));
        System.out.println(actual_bonus_points);
        Assert.assertEquals(current_bonus_points, actual_bonus_points, "Bonus Bank amount is not the same as before");
    }
    
    @Override
    public void ToGetExcelData(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        WebDriver driver=TestBaseProvider.getTestBase().getDriver();
        
    	int LastRow=ExLib.getLaRow("Sheet1");
    	System.out.println(LastRow);
    	
    	for (int i = 1; i <= LastRow; i++) {
    		String Column1Data=ExLib.getExcelData("Sheet1", i, 0);
			String Column2Data=ExLib.getExcelData("Sheet1", i, 1);
			System.out.println(Column2Data);
			if (Column2Data.equalsIgnoreCase("NotUsed")) {
				driver.findElement(By.xpath("//input[@id='dwfrm_agentlogin_agentName']")).click();
				driver.findElement(By.xpath("//input[@id='dwfrm_agentlogin_agentName']")).sendKeys(Column1Data);
				ExLib.setExcelData("Sheet1", i, 1);
				break;
			} else if (Column2Data.equalsIgnoreCase("Used")) {
				continue;
			} else {
				Assert.fail("Coupon code status is Incorrect or data is not available");
			} 	
		}
    }
    
    @Override
    public void enter_unique_coupon_code_in_Redeem_Rewards_page(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
    	int LastRow=ExLib.getLaRow("Sheet1");
    	System.out.println(LastRow);
    	
    	synchronized (this) {
    	for (int i = 1; i <= LastRow; i++) {
    		String Column1Data=ExLib.getExcelData("Sheet1", i, 0);
			String Column2Data=ExLib.getExcelData("Sheet1", i, 1);
			System.out.println(Column2Data);
			if (Column2Data.equalsIgnoreCase("NotUsed")) {
				try {
		            delete_coupon_in_RewardsPage().isDisplayed();
		            CSR_delete_selected_item_from_DTS_window();
		        } catch (Exception e) {
		            System.out.println("No coupons are available to delete");
		        }
		        PauseUtil.waitForAjaxToComplete(2500);
		        PauseUtil.pause(2000);
		        fld_Enter_CouponCode_RewardsPage().click();
		        fld_Enter_CouponCode_RewardsPage().sendKeys(Column1Data);
		        PauseUtil.pause(4000);
				ExLib.setExcelData("Sheet1", i, 1);
				btn_Apply_for_Coupon_RewardsPage().click();
				break;
			} else if (Column2Data.equalsIgnoreCase("Used")) {
				continue;
			} else {
				Assert.fail("Coupon code status is Incorrect or data is not available");
			} 	
		}
    	}
    }
    
    @Override
    public void Verify_applied_couon_is_added_and_shipping_charge_is_free_in_Redemptions_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        try {
            delete_coupon_in_RewardsPage().isDisplayed();
            System.out.println("Coupon code is applied");
        } catch (Exception e) {
            Assert.fail("Applied coupon section is not displayed");
        }
        String act_text=header_BlueBar_Shipping_TotalAmount().getText();
        act_text=act_text.trim();
        String exp_text="FREE!";
        Assert.assertEquals(act_text, exp_text, "Free shipping is not received and Shipping charge amount is displayed in Redemptions & Rewards page");
    }
    
    @Override
    public void BM_User_Creation(){
    	WebDriver driver=TestBaseProvider.getTestBase().getDriver();
    	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	PauseUtil.pause(10000);
        
        String NewUserLogin="bctest";
        String NewUserPwd="Scholastic@123";
        String NewUserFname="bctest-Fname-";
        String NewUserLname="bctest-Lname-";
        String NewUserEmail="sdevineni-consultant@scholastic.com";
        
    	System.out.println("###############");
        
        BM_fld_Login().click();
        BM_fld_Login().clear();
        BM_fld_Login().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("LoginID"));
        PauseUtil.pause(2000);
        
        BM_fld_Password().click();
        BM_fld_Password().clear();
        BM_fld_Password().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("LoginPwd"));
        PauseUtil.pause(2000);
        
        BM_btn_LogIn().click();
        
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        BM_MenuIcon_Administartion().click();
        PauseUtil.pause(2000);
        
        BM_In_Administartion_link_Users().click();
        
        for (int i = 16; i <= 56; i++) {
        	PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(2000);
        	BM_btn_New_in_UserList().click();
        	PauseUtil.pause(2000);
        	BM_fld_YourPwd_in_NewUserPage().click();
        	BM_fld_YourPwd_in_NewUserPage().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("LoginPwd"));
        	PauseUtil.pause(2000);
        	BM_fld_Login_in_NewUserPage().click();
        	BM_fld_Login_in_NewUserPage().sendKeys(NewUserLogin+i);
        	PauseUtil.pause(2000);
        	BM_fld_Pwd_in_NewUserPage().click();
        	BM_fld_Pwd_in_NewUserPage().sendKeys(NewUserPwd);
        	PauseUtil.pause(2000);
        	BM_fld_Confirm_Pwd_in_NewUserPage().click();
        	BM_fld_Confirm_Pwd_in_NewUserPage().sendKeys(NewUserPwd);
        	PauseUtil.pause(2000);
        	SCHUtils.clickUsingJavaScript(BM_fld_Fname_in_NewUserPage());
        	//BM_fld_Fname_in_NewUserPage().click();
        	BM_fld_Fname_in_NewUserPage().sendKeys(NewUserFname+i);
        	PauseUtil.pause(2000);
        	SCHUtils.clickUsingJavaScript(BM_fld_Lname_in_NewUserPage());
        	//BM_fld_Lname_in_NewUserPage().click();
        	BM_fld_Lname_in_NewUserPage().sendKeys(NewUserLname+i);
        	PauseUtil.pause(2000);
        	SCHUtils.clickUsingJavaScript(BM_fld_Email_in_NewUserPage());
        	//BM_fld_Email_in_NewUserPage().click();
        	BM_fld_Email_in_NewUserPage().sendKeys(NewUserEmail);
        	PauseUtil.pause(2000);
        	SCHUtils.clickUsingJavaScript(BM_btn_Apply_in_NewUserPage());
        	//BM_btn_Apply_in_NewUserPage().click();
        	PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(2000);
            
            SCHUtils.clickUsingJavaScript(BM_tab_Roles_SetRolePage());
            //BM_tab_Roles_SetRolePage().click();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(1000);
            
            SCHUtils.clickUsingJavaScript(BM_btn_Assign_in_SetRolePage());
            //BM_btn_Assign_in_SetRolePage().click();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(2000);
            
            SCHUtils.clickUsingJavaScript(BM_checkBox_Administrator_in_SetRolePage());
            //BM_checkBox_Administrator_in_SetRolePage().click();
            PauseUtil.pause(2000);
            //BM_checkBox_CSR_User_in_SetRolePage().click();
            
            SCHUtils.clickUsingJavaScript(BM_btn_Assign_in_SetRolePage());
            //BM_btn_Assign_in_SetRolePage().click();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(2000);
            
            SCHUtils.clickUsingJavaScript(BM_tab_Users_in_SubMenu());
            //BM_tab_Users_in_SubMenu().click();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(2000);
              
            try {
    			FileInputStream fis=new FileInputStream("src/ExcelFile/data.xlsx");
    			Workbook wb=WorkbookFactory.create(fis);
    			Sheet s=wb.getSheet("Sheet4");
    			Row r=s.createRow(i);
    			Cell c=r.createCell(0);
    			c.setCellValue(NewUserLogin+i);
    			FileOutputStream fos=new FileOutputStream("src/ExcelFile/data.xlsx");
    			wb.write(fos);
    			fos.close();
    			
    		} catch (FileNotFoundException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} catch (InvalidFormatException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
            System.out.println("Created the user :"+NewUserLogin+i);
    		}
    }
    
    @Override
    public void BM_Password_set_for_BM_Users(){
    	WebDriver driver=TestBaseProvider.getTestBase().getDriver();
    	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        PauseUtil.pause(2000);
        
        String OldPwd="Scholastic@123";
        String NewPwd="Scholastic@1234";
        String SecQuestion="City where you were born?";
        String SecQueAnswer="Bangalore";
        
        int LastRow=ExLib.getLaRow("Sheet4");
    	System.out.println("Rows in Excel sheet are:"+LastRow);
    	
    	for (int i = 1; i <= LastRow; i++) {
    		String Column1Data=ExLib.getExcelData("Sheet4", i, 0);
    		
    		
    		BM_fld_Login().click();
            BM_fld_Login().sendKeys(Column1Data);
            PauseUtil.pause(2000);
            
            BM_fld_Password().click();
            BM_fld_Password().sendKeys(OldPwd);
            PauseUtil.pause(2000);
            
            BM_btn_LogIn().click();
            //PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(5000);
            
            SCHUtils.clickUsingJavaScript(BM_fld_OldPwd_ToSet());
            //BM_fld_OldPwd_ToSet().click();
            BM_fld_OldPwd_ToSet().sendKeys(OldPwd);
            PauseUtil.pause(2000);
            
            SCHUtils.clickUsingJavaScript(BM_fld_OriginalPwd_ToSet());
            //BM_fld_OriginalPwd_ToSet().click();
            BM_fld_OriginalPwd_ToSet().sendKeys(NewPwd);
            PauseUtil.pause(2000);
            
            SCHUtils.clickUsingJavaScript(BM_fld_Original_Pwd_confirm_ToSet());
            //BM_fld_Original_Pwd_confirm_ToSet().click();
            BM_fld_Original_Pwd_confirm_ToSet().sendKeys(NewPwd);
            PauseUtil.pause(2000);
            
            SCHUtils.clickUsingJavaScript(BM_btn_Apply_in_NewUserPage());
            //BM_btn_Apply_in_NewUserPage().click();
        	//PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(5000);
            
            Select dd=new Select(BM_dropdown_Pwd_sec_question());
            PauseUtil.pause(2000);
            dd.selectByVisibleText(SecQuestion);
            
            SCHUtils.clickUsingJavaScript(BM_fld_answer_for_Pwd_sec_question());
            //BM_fld_answer_for_Pwd_sec_question().click();
            BM_fld_answer_for_Pwd_sec_question().sendKeys(SecQueAnswer);
            PauseUtil.pause(2000);
            
            SCHUtils.clickUsingJavaScript(BM_btn_Continue_after_set_pwd());
            //BM_btn_Continue_after_set_pwd().click();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(3000);
            
            SCHUtils.clickUsingJavaScript(BM_btn_LogOff());
            //BM_btn_LogOff().click();
            //PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(5000);
    		
            System.out.println("Password is set for the account :"+Column1Data);
    	}
    }
    
    //######################################### SCSCOD-6165 ##################################################################
    @FindBy(locator = "dw.checkout.rewardsandcoupons.coupondetail.1st.couponname")
	private WebElement couponname_in_first_layer;
    
    public WebElement getFirstCouponName(){
    	return couponname_in_first_layer;
    }
    
    @Override
    public void CSR_enters_coupon_in_coupon_textbox_field(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        try {
            delete_coupon_in_RewardsPage().isDisplayed();
            CSR_delete_selected_item_from_DTS_window();
        } catch (Exception e) {
            System.out.println("No coupons are available to delete");
        }
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        fld_Enter_CouponCode_RewardsPage().click();
        fld_Enter_CouponCode_RewardsPage().clear();
        fld_Enter_CouponCode_RewardsPage().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("CouponCode"));
    }
    
    @Override
    public void CSR_clicks_apply_button_on_coupon_textbox(){
    	PauseUtil.pause(4000);
        btn_Apply_for_Coupon_RewardsPage().click();
    }
    
    @Override
    public void CSR_sees_coupon_in_coupon_layer(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        String exp_result = TestBaseProvider.getTestBase().getTestData().getString("CouponCode");
        String act_result = getFirstCouponName().getText();
        
        Assert.assertEquals(act_result, exp_result, "Coupon name is not same as the one applied to order");
    	
    }
    
    @Override
    public void CSR_sees_shipping_as_free(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        String exp_result = ConstantUtils.FREESHIPPINGINPAYMENT;
        String act_result = getlblCouponsandRewardsShippingandHandlingBlueBar().getText();
        
        Assert.assertEquals(act_result, exp_result, "Shipping is not free for the order");
    
    }
    
    @Override
    public void CSR_does_not_see__free_shipping_message_Rewards_page(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        String exp_result = ConstantUtils.FREESHIPPINGINPAYMENT;
        String act_result = getlblCouponsandRewardsShippingandHandlingBlueBar().getText();
        
        Boolean shipping_not_free = (act_result != exp_result ? true : false);
        
        Assert.assertTrue(shipping_not_free, "Shipping is free for this order.");
    	
    }
    
  //######################################### SCSCOD-7063 ##################################################################
    @FindBy(locator="dw.enterorders.YTO.redeem.coupon.hyperlink")
    private WebElement redeem_your_coupon_hyperlink;
    
    @FindBy(locator="dw.checkout.rewardsandcoupons.page")
    private WebElement rewards_and_redemption_page;
    
    @FindBy(locator="dw.enterorders.YTO.option")
    private WebElement YTO_enter_classroom_option;
    
    @FindBy(locator="dw.enterordrs.ByFlyer.default.selected")
    private List<WebElement> by_flyer_link_selected;
    
    @FindBy(locator="dw.enterordrs.save.button.top")
    private WebElement YTO_save_button_top;
    
    @FindBy(locator="dw.enterordrs.save.button.bottom")
    private WebElement YTO_save_button_bottom;
    
    public WebElement YTO_save_button_top(){
    	return YTO_save_button_top;
    }
    
    public WebElement YTO_save_button_bottom(){
    	return YTO_save_button_bottom;
    }
    
    public List<WebElement> by_flyer_link_selected(){
    	return by_flyer_link_selected;
    }
    
    public WebElement YTO_enter_classroom_option(){
    	return YTO_enter_classroom_option;
    }
    
    public WebElement redeem_your_coupon_hyperlink(){
    	return redeem_your_coupon_hyperlink;
    }
    
    public WebElement rewards_and_redemption_page(){
    	return rewards_and_redemption_page;
    }
    
    @Override
    public void Teacher_selects_redeem_coupon_hyperlink(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        redeem_your_coupon_hyperlink().click();
        System.out.println("Redeem your coupon link is clicked");
    }
    
    @Override
    public void verify_Rewards_and_redemption_page_is_displayed(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
       
    	rewards_and_redemption_page().isDisplayed();
    	System.out.println("Rewards and Redemption page is displayed");
    
	}
    
    @Override
    public void Teacher_selects_YTO_option(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        try {
        	YTO_enter_classroom_option().click();
        	System.out.println("YTO option on 'Enter Classroom' link is selected");
        } catch (Exception e) {
        	System.out.println("YTO option on 'Enter Classroom' link is already selected");
        }
	}
    
    @Override
    public void button_changed_validation_YTO_page(String arg1, String arg2){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        String exp_value = arg2;
        String act_value_top_button = YTO_save_button_top().getText();	
        
        Assert.assertEquals(arg2, act_value_top_button, "The incorrect label is shown for top button: " + act_value_top_button);
        System.out.println("The label for the top button has been updated to '" + arg2 + "'");
        
        String act_value_bottom_button = YTO_save_button_bottom().getText();	
        Assert.assertEquals(arg2, act_value_bottom_button, "The incorrect label is shown for bottom button: " + act_value_bottom_button);
        System.out.println("The label for the bottom button has been updated to '" + arg2 + "'");
        
	}
    
    @Override
    public void By_Flyer_link_selected_by_default(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        int exp_by_flyer_list_size = 2;
        int act_by_flyer_list_size = by_flyer_link_selected().size();
        
        Assert.assertEquals(act_by_flyer_list_size, exp_by_flyer_list_size, "Only one WebElement is in the list");
        
        WebElement arrow_pointer_on_by_flyer_link = by_flyer_link_selected().get(1);
    	arrow_pointer_on_by_flyer_link.isDisplayed();
    	System.out.println("The arrow is displayed under the 'By Flyer' link");
        
	}
  //######################################### SCSCOD-7063 ##################################################################
    
  //######################################### SCSCOD-5101 ##################################################################
    @FindBy(locator="dw.teacher.search.textbox")
    private WebElement TCOD_search_textbox;
    
    @FindBy(locator="dw.teacher.search.button")
    private WebElement TCOD_search_button;
    
    @FindBy(locator="dw.teacher.search.PDP.QUICKLOOK.flyer.hyperlink")
    private WebElement TCOD_PDP_QuickLook_hyperlink;
    
    @FindBy(locator="dw.teacher.search.QUICKLOOK.first.item.link")
    private WebElement TCOD_first_item_QuickLook_link;
    
    @FindBy(locator="dw.teacher.search.PDP.QUICKLOOK.ReviewCart.YTO.page")
    private WebElement TCOD_YTO_page_from_QuickLook_PDP;
    
    @FindBy(locator="dw.teacher.YTO.ByFlyer.active.flyer.type")
    private WebElement TCOD_YTO_ByFlyer_type;
    
    @FindBy(locator="dw.teacher.YTO.ByFlyer.active.flyer.month")
    private WebElement TCOD_YTO_ByFlyer_month;
    
    @FindBy(locator = "dw.productdetail.btn.addtocart")
	private WebElement TCOD_btnAddToCart;
    
    @FindBy(locator = "dw.cart.button.GoToCheckout")
	private WebElement GoToCheckout_button_Cart;
    
    @FindBy(locator = "dw.teacher.Review.Cart.YTO.first.item.flyer.hyperlink")
	private WebElement TCOD_YTO_Review_Cart_flyer_hyperlink_first_item;
    
    @FindBy(locator = "dw.teacher.Review.Cart.YTO.first.item.flyer.hyperlink")
	private WebElement TCOD_BookResource_Review_Cart_flyer_hyperlink_first_item;
    
    @FindBy(locator = "dw.teacher.Book.Resource.search.page.breadcrumb")
	private List<WebElement> TCOD_Book_Resource_search_page_breadcrumb;
    
    public List<WebElement> TCOD_Book_Resource_search_page_breadcrumb(){
    	return TCOD_Book_Resource_search_page_breadcrumb;
    }
    
    public WebElement TCOD_BookResource_Review_Cart_flyer_hyperlink_first_item(){
    	return TCOD_BookResource_Review_Cart_flyer_hyperlink_first_item;
    }
    
    public WebElement TCOD_YTO_Review_Cart_flyer_hyperlink_first_item(){
    	return TCOD_YTO_Review_Cart_flyer_hyperlink_first_item;
    }
    
    public WebElement GoToCheckout_button_Cart(){
    	return GoToCheckout_button_Cart;
    }
    
    public WebElement TCOD_btnAddToCart(){
    	return TCOD_btnAddToCart;
    }
    
    public WebElement TCOD_search_textbox(){
    	return TCOD_search_textbox;
    }
    
    public WebElement TCOD_search_button(){
    	return TCOD_search_button;
    }
    
    public WebElement TCOD_PDP_QuickLook_hyperlink(){
    	return TCOD_PDP_QuickLook_hyperlink;
    }
    
    public WebElement TCOD_first_item_QuickLook_link(){
    	return TCOD_first_item_QuickLook_link;
    }
    
    public WebElement TCOD_YTO_page_from_QuickLook_PDP(){
    	return TCOD_YTO_page_from_QuickLook_PDP;
    }
    
    public WebElement TCOD_YTO_ByFlyer_type(){
    	return TCOD_YTO_ByFlyer_type;
    }
    
    public WebElement TCOD_YTO_ByFlyer_month(){
    	return TCOD_YTO_ByFlyer_month;
    }
    
    @Override
	public void Teacher_enters_value_in_search_textbox(){
		PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
    	TCOD_search_textbox().click();
    	TCOD_search_textbox().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("SearchValue"));
    	System.out.println("Teacher able to enter value in search textbox");
	}
    
    @Override
	public void Teacher_selects_search_button(){
		PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
    	TCOD_search_button().click();
    	System.out.println("Teacher able to click the search button");
        
	}
    
    @Override
	public void Teacher_clicks_hyperlink_next_to_item_number(){
		PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
    	TCOD_PDP_QuickLook_hyperlink().click();
    	System.out.println("Teacher able to click the hyperlink next to item #");
        
	}

    @Override
	public void Teacher_goes_to_YTO_page(){
		PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        Boolean YTO_page_is_displayed = TCOD_YTO_page_from_QuickLook_PDP().isDisplayed();
        
        Assert.assertTrue(YTO_page_is_displayed, "YTO page is not displayed");
        System.out.println("YTO page is displayed");
	}
    
    @Override
	public void Teacher_sees_active_grade_selected(){
		PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        String act_value = TCOD_YTO_ByFlyer_type().getText();
        String exp_value = TestBaseProvider.getTestBase().getTestData().getString("FlyerType");
        
        Assert.assertEquals(act_value, exp_value, "The selected flyer type does not match the flyer the item is assigned to");
        System.out.println("The selected flyer type matches the flyer the item is assigned to");
	}
    
    @Override
	public void Teacher_sees_active_month_selected(){
		PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        String act_value = TCOD_YTO_ByFlyer_month().getText();
        String exp_value = TestBaseProvider.getTestBase().getTestData().getString("FlyerMonth");
        
        Assert.assertEquals(act_value, exp_value, "The selected flyer month does not match the month the item is assigned to");
        System.out.println("The selected flyer month matches the month the item is assigned to");
	}
	
    @Override
	public void Teacher_clicks_the_Quick_Look_link(){
		PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
    	TCOD_first_item_QuickLook_link().click();
    	System.out.println("Teacher able to click the Quick Look link for first item");
        
	}
	
    @Override
	public void Teacher_add_item_to_cart(){
		PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
    	TCOD_btnAddToCart().click();
    	System.out.println("Teacher able to add item to cart");
	}
    
    @Override
	public void Teacher_goes_to_review_cart_via_the_mini_popup_on_PDP(){
		PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
    	GoToCheckout_button_Cart().click();
    	System.out.println("Teacher able to go to Review Cart page");
	}
    
    @Override
	public void Teacher_select_flyer_hyperlink_on_added_item(){
		PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
    	TCOD_YTO_Review_Cart_flyer_hyperlink_first_item().click();
    	System.out.println("Teacher clicked the flyer hyperlink of first item");
	}
	
    @Override
	public void Teacher_sees_appropriate_book_resource_page(){
		PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        int book_resource_breadcrumb_size = TCOD_Book_Resource_search_page_breadcrumb().size();
        
        String exp_book_resource_category = TestBaseProvider.getTestBase().getTestData().getString("BookResourceCategory");
        
        WebElement last_book_resource_category = TCOD_Book_Resource_search_page_breadcrumb().get(book_resource_breadcrumb_size - 1);
        String act_book_resource_category = last_book_resource_category.getText();
        
        Assert.assertEquals(act_book_resource_category, exp_book_resource_category, "Not on the correct Book Resource Page for the item");
        System.out.println("Currently on the correct Book Resource page - " + act_book_resource_category);
        
	}
	
    @Override
	public void Teacher_cannot_click_the_hyperlink_for_generic_online_items_PDP_QuickLook(){
		PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
    	TCOD_PDP_QuickLook_hyperlink().click();
    	Assert.fail("Teacher can click the hyperlink for the Generic Online item");
	}
	
    @Override
	public void Teacher_cannot_click_the_hyperlink_for_generic_online_items_Review_Cart(){
		PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
    	TCOD_YTO_Review_Cart_flyer_hyperlink_first_item().click();
    	Assert.fail("Teacher can click the hyperlink for the Generic Online item");

	}
	
    @Override
	public void Teacher_hovers_the_category_hyperlink_next_to_item_number(){
		PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        Actions action = new Actions(getDriver());
        
        action.moveToElement(TCOD_PDP_QuickLook_hyperlink()).click().build().perform();
        System.out.println("Teacher currently hovering the hyperlink");
	}
    
    @Override
	public void Teacher_selects_YTO_link_in_popup(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        TCOD_YTO_Review_Cart_flyer_hyperlink_first_item().click();
        Assert.fail("Teacher clicked the flyer hyperlink of first item");
	}
	
    @Override
	public void Teacher_selects_TeacherExclusive_link_in_popup(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        TCOD_BookResource_Review_Cart_flyer_hyperlink_first_item().click();
        Assert.fail("Teacher clicked the Book Resource hyperlink of first item");
	}
	
    @Override
	public void Teacher_cannot_click_on_Generic_link(){
		
	}
    
    @Override
	public void Teacher_can_click_on_FLyer_link(){
		
	}
	
    @Override
	public void Teacher_can_click_on_Book_Resource_link(){
		
	}
	

    @FindBy(locator="dw.teacher.YTO.ByItem.link")
    private WebElement TCOD_YTO_ByItem_link;
    
    @FindBy(locator="dw.teacher.YTO.ByItem.EnterItem.textbox")
    private WebElement TCOD_YTO_ByItem_EnterItem_textbox;
    
    @FindBy(locator="dw.teacher.YTO.ByItem.EnterItem.ADD.button")
    private WebElement TCOD_YTO_ByItem_ADD_button;
    
    @FindBy(locator="dw.teacher.YTO.ByItem.item.table.list")
    private WebElement TCOD_YTO_ByItem_item_table;
    
    @FindBy(locator="dw.teacher.YTO.ByItem.table.SAVE")
    private WebElement TCOD_YTO_ByItem_SAVE_button;
    
    @FindBy(locator="dw.teacher.YTO.ByItem.table.REVIEW.CART")
    private WebElement TCOD_YTO_ByItem_REVIEW_CART_button;
    
    @FindBy(locator="dw.teacher.YTO.ByItem.table.first.item.quantity.input")
    private WebElement TCOD_YTO_ByItem_table_first_item_quantity;
    
    @FindBy(locator="dw.teacher.YTO.ByItem.table.first.item.delete.X.button")
    private WebElement TCOD_YTO_ByItem_table_first_item_X_icon;
    
    @FindBy(locator="dw.teacher.YTO.ByItem.EnterItem.textbox.dropdown")
    private WebElement TCOD_YTO_ByItem_EnterItem_textbox_dropdown;
    
    @FindBy(locator="dw.teacher.YTO.ByItem.EnterItem.textbox.dropdown.first.item")
    private WebElement TCOD_YTO_ByItem_EnterItem_textbox_dropdown_first_item;
    
    @FindBy(locator="dw.teacher.YTO.ByItem.shopping.cart.amt")
    private WebElement TCOD_YTO_ByItem_Shopping_Cart_amount;
    
    @FindBy(locator="dw.teacher.YTO.ByItem.table.first.item.delete.modal")
    private WebElement TCOD_YTO_ByItem_first_item_delete_modal;
    
    @FindBy(locator="dw.teacher.YTO.ByItem.table.first.item.delete.YES.button")
    private WebElement TCOD_YTO_ByItem_first_item_delete_YES_button;
    
    @FindBy(locator="dw.teacher.YTO.ByItem.table.first.item.item.number")
    private WebElement TCOD_YTO_ByItem_first_item_item_number;
    
    @FindBy(locator="dw.teacher.YTO.ByItem.EnterItem.textbox.error.msg.tooltip")
    private WebElement TCOD_YTO_ByItem_textbox_error_message;
    
    @FindBy(locator = "dw.header.checkout.readingclub.DontShowThisAgainClassRoomOrders_Button")
	private WebElement DontShowThisAgainClassRoomOrders_Button;
    
    public WebElement DontShowThisAgainClassRoomOrders_Button(){
    	return DontShowThisAgainClassRoomOrders_Button;
    }
    
    public WebElement TCOD_YTO_ByItem_textbox_error_message(){
    	return TCOD_YTO_ByItem_textbox_error_message;
    }
    
    public WebElement TCOD_YTO_ByItem_first_item_item_number(){
    	return TCOD_YTO_ByItem_first_item_item_number;
    }
    
    public WebElement TCOD_YTO_ByItem_first_item_delete_modal(){
    	return TCOD_YTO_ByItem_first_item_delete_modal;
    }
    
    public WebElement TCOD_YTO_ByItem_first_item_delete_YES_button(){
    	return TCOD_YTO_ByItem_first_item_delete_YES_button;
    }
    
    public WebElement TCOD_YTO_ByItem_Shopping_Cart_amount(){
    	return TCOD_YTO_ByItem_Shopping_Cart_amount;
    }
    
    public WebElement TCOD_YTO_ByItem_EnterItem_textbox_dropdown_first_item(){
    	return TCOD_YTO_ByItem_EnterItem_textbox_dropdown_first_item;
    }
    
    public WebElement TCOD_YTO_ByItem_EnterItem_textbox_dropdown(){
    	return TCOD_YTO_ByItem_EnterItem_textbox_dropdown;
    }
    
    public WebElement TCOD_YTO_ByItem_table_first_item_X_icon(){
    	return TCOD_YTO_ByItem_table_first_item_X_icon;
    }
    
    public WebElement TCOD_YTO_ByItem_table_first_item_quantity(){
    	return TCOD_YTO_ByItem_table_first_item_quantity;
    }
    
    public WebElement TCOD_YTO_ByItem_REVIEW_CART_button(){
    	return TCOD_YTO_ByItem_REVIEW_CART_button;
    }
    
    public WebElement TCOD_YTO_ByItem_link(){
    	return TCOD_YTO_ByItem_link;
    }
    
    public WebElement TCOD_YTO_ByItem_EnterItem_textbox(){
    	return TCOD_YTO_ByItem_EnterItem_textbox;
    }
    
    public WebElement TCOD_YTO_ByItem_ADD_button(){
    	return TCOD_YTO_ByItem_ADD_button;
    }
    
    public WebElement TCOD_YTO_ByItem_item_table(){
    	return TCOD_YTO_ByItem_item_table;
    }
    
    public WebElement TCOD_YTO_ByItem_SAVE_button(){
    	return TCOD_YTO_ByItem_SAVE_button;
    }
    
    @Override
    public void Teacher_click_YTO_ByItem_link(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        try{
        	DontShowThisAgainClassRoomOrders_Button().click();
        	System.out.println("Classroom helper was showing; selected the 'Don't show again' link");
        	PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(2000);
        } catch(Exception e){
        	System.out.println("Classroom helper not showing");
        }
        
        TCOD_YTO_ByItem_link().click();
        System.out.println("Teacher can click the YTO 'By Item #' hyperlink");
    }
    
    @Override
    public void Teacher_add_items_to_cart_via_YTO_ByItem(boolean multipleItems){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        if(multipleItems == false){
        	try{
        		TCOD_YTO_ByItem_EnterItem_textbox().clear();
        		TCOD_YTO_ByItem_EnterItem_textbox().click();
        		TCOD_YTO_ByItem_EnterItem_textbox().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("UniqueItemNum"));
        		
            	System.out.println("Added this item successfully in the textbox: " + TestBaseProvider.getTestBase().getTestData().getString("UniqueItemNum"));
            } catch(Exception e){
            	System.out.println("Issues adding the item: " + TestBaseProvider.getTestBase().getTestData().getString("UniqueItemNum"));
            }
        	
        } else {
        	int numOfItems = Integer.parseInt(TestBaseProvider.getTestBase().getTestData().getString("NumOfItems"));
        	
	        for(int i = 1; i <= numOfItems; i++){
	        	String itemNumStr = String.valueOf(i);
	        	PauseUtil.waitForAjaxToComplete(2500);
	            PauseUtil.pause(2000);
	            
	        	try{
	        		TCOD_YTO_ByItem_EnterItem_textbox().clear();
	        		TCOD_YTO_ByItem_EnterItem_textbox().click();
	        		TCOD_YTO_ByItem_EnterItem_textbox().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("UniqueItemNum"+itemNumStr));
	        		
	        		Teacher_clicks_ADD_button_YTO_ByItem();
	            	System.out.println("Added this item successfully: " + TestBaseProvider.getTestBase().getTestData().getString("UniqueItemNum"+itemNumStr));
	            } catch(Exception e){
	            	System.out.println("Issues adding the item: " + TestBaseProvider.getTestBase().getTestData().getString("UniqueItemNum"+itemNumStr));
	            }
	        	
	        }
        }
        
    }
    
    @Override
    public void Teacher_clicks_ADD_button_YTO_ByItem(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
    	TCOD_YTO_ByItem_ADD_button().click();
        System.out.println("Teacher clicked on the 'ADD' button");
    }
    
    @Override
    public void Teacher_edit_quantity_of_first_item_YTO_ByItem(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
    	TCOD_YTO_ByItem_table_first_item_quantity().clear();
    	TCOD_YTO_ByItem_table_first_item_quantity().click();
    	TCOD_YTO_ByItem_table_first_item_quantity().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("FirstItemQuantity"));
    	TCOD_YTO_ByItem_table_first_item_quantity().sendKeys(Keys.TAB);
    	
    	System.out.println("Teacher edited the quantity of the first item");
    }
    
    @Override
    public void Teacher_sees_entered_quantity_first_item_YTO_ByItem(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        String exp_result = TestBaseProvider.getTestBase().getTestData().getString("FirstItemQuantity");
        String act_result = TCOD_YTO_ByItem_table_first_item_quantity().getAttribute("value");
        
        Assert.assertEquals(act_result, exp_result, "The edited quantity is not the same as entered");
        System.out.println("The edited quantity is the same as entered");
    }
    
    @Override
    public void Teacher_selects_X_icon_on_first_item_YTO_ByItem(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
    	TCOD_YTO_ByItem_table_first_item_X_icon().click();
        System.out.println("Teacher clicked on the 'X' icon for first item");
    }
    
    @Override
    public void Teacher_selects_YES_on_delete_modal_first_item_YTO_ByItem(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
    	TCOD_YTO_ByItem_first_item_delete_YES_button().click();
        System.out.println("Teacher clicked 'YES' on delete modal for first item");
    }
    
    @Override
    public void Teacher_does_not_see_deleted_item_first_row_YTO_ByItem(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        String exp_result = TestBaseProvider.getTestBase().getTestData().getString("UniqueItemNum2");
        String act_result = TCOD_YTO_ByItem_first_item_item_number().getText();
        
        Assert.assertEquals(act_result, exp_result,"The item number was not deleted");
    	System.out.println("The item number '" + exp_result + "' is deleted");
    }
    
    @Override
    public void Teacher_sees_delete_modal_first_item_YTO_ByItem(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
    	TCOD_YTO_ByItem_first_item_delete_modal().isDisplayed();
        System.out.println("Delete modal for first item is displayed");
    }
    
    @Override
    public void Teacher_does_not_see_table_under_YTO_ByItem_layer(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        Boolean table_is_displayed = TCOD_YTO_ByItem_item_table().isDisplayed();
        
        Assert.assertFalse(table_is_displayed, "The item table under the YTO By Item # layer is displayed");
        System.out.println("The item table under the YTO By Item # layer is not displayed");
    }
    
    @Override
    public void ADD_button_enabled_YTO_ByItem(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        String act_ADD_button_is_enabled = TCOD_YTO_ByItem_ADD_button().getAttribute("disabled");
        String exp_ADD_button_is_enabled = "false";
        
        Assert.assertEquals(act_ADD_button_is_enabled, exp_ADD_button_is_enabled, "The ADD button is disabled");
        System.out.println("The ADD button is enabled");
    }
    
    @Override
    public void Teacher_sees_does_not_exist_error_msg_YTO_ByItem(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        Boolean err_msg_is_displayed = TCOD_YTO_ByItem_textbox_error_message().isDisplayed();
        
        Assert.assertTrue(err_msg_is_displayed, "The error message tooltip for item that does not exist is displayed");
        System.out.println("The error message tooltip for item that does not exist is not displayed");
    }
    
    @Override
    public void ItemNum_textbox_is_empty_YTO_ByItem(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        String exp_result = "";
        String act_result = TCOD_YTO_ByItem_EnterItem_textbox().getText();
        
        Assert.assertEquals(act_result, exp_result,"The 'Enter ITEM #' textbox is not empty");
    	System.out.println("The 'Enter ITEM #' textbox is empty");
    }
    
    @Override
    public void ADD_button_disabled_YTO_ByItem(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        String act_ADD_button_is_disabled = TCOD_YTO_ByItem_ADD_button().getAttribute("disabled");
        String exp_ADD_button_is_disabled = "true";
        
        Assert.assertEquals(act_ADD_button_is_disabled, exp_ADD_button_is_disabled, "The ADD button is enabled");
        System.out.println("The ADD button is disabled");
    }
    
    @Override
    public void Teacher_sees_entered_item_number_YTO_ByItem(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        String act_result = TCOD_YTO_ByItem_EnterItem_textbox().getText();
        String exp_result = TestBaseProvider.getTestBase().getTestData().getString("UniqueItemNum");
        
        Assert.assertEquals(act_result, exp_result, "The Item # entered is not the same");
        System.out.println("The Item # entered is the same");
    }
    
    @Override
    public void Teacher_does_not_see_entered_item_number_YTO_ByItem(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        String act_result = TCOD_YTO_ByItem_EnterItem_textbox().getAttribute("value");
        String exp_result = TestBaseProvider.getTestBase().getTestData().getString("UniqueItemNum");
        
        Assert.assertNotEquals(act_result, exp_result, "The Item # entered is the same");
        System.out.println("The Item # entered is not the same");
    }
    
    @Override
    public void Teacher_sees_incorrect_error_msg_YTO_ByItem(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        Boolean err_msg_is_displayed = TCOD_YTO_ByItem_textbox_error_message().isDisplayed();
        
        Assert.assertTrue(err_msg_is_displayed, "The error message tooltip for item that does not exist is displayed");
        System.out.println("The error message tooltip for item that does not exist is not displayed");
        
        String act_err_msg = TCOD_YTO_ByItem_textbox_error_message().getText();
        String exp_err_msg = "Please enter a valid item number.";
        
        Assert.assertEquals(act_err_msg, exp_err_msg, "The error message is not the same");
        System.out.println("The error message is not the same");
    }
    
    @Override
    public void Teacher_sees_shopping_cart_updated_YTO_ByItem(int arg1){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        int exp_result = arg1;
        int act_result = Integer.parseInt(TCOD_YTO_ByItem_Shopping_Cart_amount().getText());
        
        Assert.assertEquals(act_result, exp_result, "The shopping cart amount is not the same");
        System.out.println("The shopping cart amount is " + act_result);
    }
    
    @Override
    public void Teacher_clicks_in_the_ItemNum_textbox_YTO_ByItem(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
    	TCOD_YTO_ByItem_EnterItem_textbox().click();
        System.out.println("Teacher clicked the 'Enter Item #' textbox");
    }
    
    @Override
    public void Teacher_sees_dropdown_menu_YTO_ByItem(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
    	Boolean dropdown_is_displayed = TCOD_YTO_ByItem_EnterItem_textbox_dropdown().isDisplayed();
        
    	Assert.assertTrue(dropdown_is_displayed, "The drop-down is not displayed under the 'ITEM #' textbox");
    	System.out.println("The drop-down is displayed under the 'ITEM #' textbox");
    }
    
    @Override
    public void Teacher_sees_previously_added_item_in_dropdown_YTO_ByItem(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        String act_result = TCOD_YTO_ByItem_EnterItem_textbox_dropdown_first_item().getText();
        String exp_result = TestBaseProvider.getTestBase().getTestData().getString("UniqueItemNum");
        
        Assert.assertEquals(act_result, exp_result, "The first Item # in the drop-down menu is not the same");
        System.out.println("The first Item # in the drop-down menu is the same");
    }
    
    @Override
    public void Teacher_sees_recent_added_item_YTO_ByItem(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        String exp_result = TestBaseProvider.getTestBase().getTestData().getString("UniqueItemNum");
        String act_result = TCOD_YTO_ByItem_first_item_item_number().getText();
        
        Assert.assertEquals(act_result, exp_result,"The item number is not added or is not at the top of the list");
    	System.out.println("The item number is added and on top of the list");
    }
    
    @Override
    public void Teacher_adds_previous_item_from_dropdown_YTO_ByItem(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
    	TCOD_YTO_ByItem_EnterItem_textbox_dropdown_first_item().click();
        System.out.println("Teacher selects the item from dropdown");
    }
    
    @Override
    public void Teacher_sees_item_from_dropdown_in_ItemNumtextbox_YTO_ByItem(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        String exp_result = TCOD_YTO_ByItem_EnterItem_textbox_dropdown_first_item().getText();
        String act_result = TCOD_YTO_ByItem_EnterItem_textbox().getAttribute("value");
        
        Assert.assertEquals(act_result, exp_result,"The item number is not the same");
    	System.out.println("The item number is the same");
    }
  //######################################### SCSCOD-7064 ##################################################################
    
    @Override
    public void freepick_modal_confirmSelectionGrid() {
        String title = getFreepick_modal_confirmselection_title().getText();
        PauseUtil.pause(2000);
        if(!title.equals("Your Current Selection")){
            Assert.fail("Confirm Selection Modal Not Displayed");
        }
    }

    @Override
    public void freepickItemselected() {
        if (getfreepickItemselected().getText().equals("") || getfreepickItemselected().getText().equals(null)) {
            Assert.fail("Free Pick Item is not displayed in FreePick Confirmation Grid");
        }
    }

    @Override
    public void closeFreepickmodal_crossicon() {
    	PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
        get_closecross_freepickmodal().click();
    }
    
    
    @Override
    public void payment_cc_and_savedcreditcard(){
    	ShippingAndPayment shippingAndPaymentPage =
				getFactory().getICheckoutPage().getShippingAndPaymentSection();
		
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        checkoutPage.unCheckPOP();
	        PauseUtil.pause(3000);
	        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
				ConstantUtils.CCANDCHECKPAYMENTMETHOD);
		PauseUtil.pause(3000);

		WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
		PauseUtil.pause(3000);
		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
				TestBaseProvider.getTestBase().getTestData().getString("cctype"));
		PauseUtil.pause(3000);
		checkoutPage.fillCCAndCheckAmount_PaymentPage();
    }
    
    
    @Override
    public void payment_select_savedcreditcard(){
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
		SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
				TestBaseProvider.getTestBase().getTestData().getString("cctype"));
		PauseUtil.pause(3000);
    }
    
    @Override
    public void passwordSet_in_BM_TCOD() throws InterruptedException{
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        WebDriver driver=TestBaseProvider.getTestBase().getDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        
        By fld_Login=By.xpath("//input[@name='LoginForm_Login']");
    	By fld_Password=By.xpath("//input[@name='LoginForm_Password']");
    	By btn_Login=By.xpath("//button[@name='login']");
    	By select_dropdown=By.xpath("//div[@id='SelectedSiteID-wrap']/span");
    	By select_Option_Canada=By.xpath("//span[text()='Scholastic Canada RCO']");
    	By select_Customers=By.xpath("//a[text()='Customers']");
    	By fld_CustNum=By.xpath("//input[@name='WFCustomerSimpleSearch_SearchTerm']");
    	By btn_Find=By.xpath("//button[@id='searchFocus']");
    	By select_AcNum=By.xpath("(//a[@class='table_detail_link'])[2]");
    	By fld_not_match_Cust=By.xpath("//td[@class='table_title_description aldi']/p");
    	By chkBox_Enabled=By.xpath("//tr[td[text()='Enabled:']]/td[2]/input");
    	By fld_Password_to_set=By.xpath("//input[@name='CredentialsPassword']");
    	By fld_Password_to_confirm=By.xpath("//input[@name='CredentialsPasswordConfirm']");
    	By btn_Apply=By.xpath("//button[text()='Apply']");
    	By section_ManageCustomers=By.xpath("//a[text()='Manage Customers']");
    	
    	
    	String Username="bmekala";
    	String Password="Aug2018!";
    	String SetPassword="passw0rd";
    	
    	Thread.sleep(5000);
    	
    	driver.findElement(fld_Login).click();
    	Thread.sleep(1000);
    	driver.findElement(fld_Login).sendKeys(Username);
    	Thread.sleep(1000);
    	driver.findElement(fld_Password).click();
    	Thread.sleep(1000);
    	driver.findElement(fld_Password).sendKeys(Password);
    	Thread.sleep(1000);
    	driver.findElement(btn_Login).click();
    	Thread.sleep(5000);
    	
    	driver.findElement(select_dropdown).click();
    	Thread.sleep(2000);
    	driver.findElement(select_Option_Canada).click();
    	Thread.sleep(3000);
    	driver.findElement(select_Customers).click();
    	Thread.sleep(4000);
    	driver.findElement(select_Customers).click();
    	Thread.sleep(3000);
    	
    	List<String> str = new ArrayList<String>();
    	/*String[] str2 = {"3272987","3258060","4980810","5013876","5016250","5072260","5489960","5075868","5079216","5089067","5093331","5107471","3290575","3315878","3316454","3338581","3344273","3354412","5494985","5162061","2908434","2910942","2954784","2963743","2970813","2979302","2984442","2986133","2990019","2995374","2999160","3000263","3015337","3033412","3189067","3044063","3085843","3087914","3102324","3110252","3117761","3134020","3135284","3273836","2159368","2159409","5247376","5249322","3140811","3141249","3156264","3161099","3162732","3167865","3193456","2159467","3261659","3261782","3262540","3270155","3366558","3371812","3372802","3455369","284464"};
		str.addAll(Arrays.asList(str2));
		*/
    	try{
	    	FileInputStream fileInput = new FileInputStream(new File("src/test/resources/BM_TCODAccounts.properties"));
	        Properties prop = new Properties();
	        prop.load(fileInput);
	        
	        int numOfCustomers = Integer.parseInt(prop.getProperty("numOfCustomers").replaceAll("\\s", ""));
	        System.out.println("There are " + numOfCustomers + " customers available in file.");
	        
	        for (int i = 1; i <= numOfCustomers; i++){
	        	String customerId = prop.getProperty("u" + i);
                String customerId1 = customerId.replaceAll("\\s", "");
                
                str.add(customerId1);
                System.out.println("Added customer " + customerId1 + " to array");
                
	        }
	        System.out.println("Finished loading all customers");
	        
    	} catch (Exception e){
    		System.out.println("Issue loading the Staging customers. Loading regular array");
    		String[] str2 = {"3272987","3258060","4980810","5013876","5016250","5072260","5489960","5075868","5079216","5089067","5093331","5107471","3290575","3315878","3316454","3338581","3344273","3354412","5494985","5162061","2908434","2910942","2954784","2963743","2970813","2979302","2984442","2986133","2990019","2995374","2999160","3000263","3015337","3033412","3189067","3044063","3085843","3087914","3102324","3110252","3117761","3134020","3135284","3273836","2159368","2159409","5247376","5249322","3140811","3141249","3156264","3161099","3162732","3167865","3193456","2159467","3261659","3261782","3262540","3270155","3366558","3371812","3372802","3455369","284464"};
    		str.addAll(Arrays.asList(str2));
    	}
    	
    	for (int i = 0; i < str.size(); i++) {
    		String val=str.get(i);
    		
    		driver.findElement(fld_CustNum).click();
    		Thread.sleep(1000);
    		driver.findElement(fld_CustNum).clear();
    		Thread.sleep(1000);
    		driver.findElement(fld_CustNum).sendKeys(val);
    		Thread.sleep(1000);
    		driver.findElement(btn_Find).click();
    		Thread.sleep(3000);
    		
    		try {
    			driver.findElement(select_AcNum).isDisplayed();	
    	
    		driver.findElement(select_AcNum).click();
    		Thread.sleep(3000);
    		
    		if (driver.findElement(chkBox_Enabled).isSelected()) {
    			System.out.println("CheckBox is selected already");
    		} else {
    			driver.findElement(chkBox_Enabled).click();
    		}
    		
    		Thread.sleep(1500);
    		driver.findElement(fld_Password_to_set).click();
    		driver.findElement(fld_Password_to_set).clear();
    		Thread.sleep(1000);
    		driver.findElement(fld_Password_to_set).sendKeys(SetPassword);
    		Thread.sleep(1000);
    		driver.findElement(fld_Password_to_confirm).click();
    		driver.findElement(fld_Password_to_confirm).clear();
    		Thread.sleep(1000);
    		driver.findElement(fld_Password_to_confirm).sendKeys(SetPassword);
    		PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(2000);
            SCHUtils.clickUsingJavaScript(driver.findElement(btn_Apply));
    		//driver.findElement(btn_Apply).click();
    		PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(2000);
    		System.out.println("Password is set for the account :"+val);
    		SCHUtils.clickUsingJavaScript(driver.findElement(section_ManageCustomers));
    		Thread.sleep(5000);
    		
    		} catch (Exception e) {
    			continue;
    		}
    	}
    	
    	//driver.close();
    	}
    
    @Override
    public void updateParentSiteAttributesBM() throws InterruptedException{
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        WebDriver driver=TestBaseProvider.getTestBase().getDriver();
        
        driver.get("https://dev35-rco-scholastic.demandware.net/on/demandware.store/Sites-Site/default");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        
        By fld_Login=By.xpath("//input[@name='LoginForm_Login']");
    	By fld_Password=By.xpath("//input[@name='LoginForm_Password']");
    	By btn_Login=By.xpath("//button[@name='login']");
    	By select_dropdown=By.xpath("//div[@id='SelectedSiteID-wrap']/span");
    	By select_Option_Canada=By.xpath("//span[text()='Scholastic Canada RCO']");
    	By select_Customers=By.xpath("//a[text()='Customers']");
    	By fld_CustNum=By.xpath("//input[@name='WFCustomerSimpleSearch_SearchTerm']");
    	By btn_Find=By.xpath("//button[@id='searchFocus']");
    	By select_AcNum=By.xpath("(//a[@class='table_detail_link'])[2]");
    	By fld_not_match_Cust=By.xpath("//td[@class='table_title_description aldi']/p");
    	By chkBox_Enabled=By.xpath("//tr[td[text()='Enabled:']]/td[2]/input");
    	By fld_Password_to_set=By.xpath("//input[@name='CredentialsPassword']");
    	By fld_Password_to_confirm=By.xpath("//input[@name='CredentialsPasswordConfirm']");
    	By btn_Apply=By.xpath("//button[text()='Apply']");
    	By section_ManageCustomers=By.xpath("//a[text()='Manage Customers']");
    	By parentite_popup_attr = By.xpath("//input[@name='Meta7dc8e6432eaf0aae16bab34b4a'][1]");
    	By parentsite_enrollment_attr = By.xpath("//input[@name='Metaed5554803ac192f682b2fb9214'][1]");
    	By parentpay_optin_attr = By.xpath("//input[@name='MetabdJDQiaaicZY6aaadneyJiMDtb'][1]");
    			
    	String Username=TestBaseProvider.getTestBase().getTestData().getString("BMUser");
    	String Password=TestBaseProvider.getTestBase().getTestData().getString("BMpassword");
    	
    	Thread.sleep(5000);
    	
    	driver.findElement(fld_Login).click();
    	Thread.sleep(1000);
    	driver.findElement(fld_Login).sendKeys(Username);
    	Thread.sleep(1000);
    	driver.findElement(fld_Password).click();
    	Thread.sleep(1000);
    	driver.findElement(fld_Password).sendKeys(Password);
    	Thread.sleep(1000);
    	driver.findElement(btn_Login).click();
    	Thread.sleep(5000);
    	
    	driver.findElement(select_dropdown).click();
    	Thread.sleep(2000);
    	driver.findElement(select_Option_Canada).click();
    	Thread.sleep(3000);
    	driver.findElement(select_Customers).click();
    	Thread.sleep(4000);
    	driver.findElement(select_Customers).click();
    	Thread.sleep(3000);
    	
    		String val = TestBaseProvider.getTestBase().getTestData().getString("userid");
    		boolean isParentPay = TestBaseProvider.getTestBase().getTestData().getBoolean("optinParentPay");
    				
    		driver.findElement(fld_CustNum).click();
    		Thread.sleep(1000);
    		driver.findElement(fld_CustNum).clear();
    		Thread.sleep(1000);
    		driver.findElement(fld_CustNum).sendKeys(val);
    		Thread.sleep(1000);
    		driver.findElement(btn_Find).click();
    		Thread.sleep(3000);
    		
    		try {
    			driver.findElement(select_AcNum).isDisplayed();	
    	
    			driver.findElement(select_AcNum).click();
    			
    			Thread.sleep(3000);
    			
    			if(isParentPay){
    				if(driver.findElement(parentpay_optin_attr).isSelected()){
    					System.out.println("The parent pay attribute is already selected.");
    				} else {
    					System.out.println("The parent pay attribute is not selected. Selecting it....");
    					SCHUtils.clickUsingJavaScript(driver.findElement(parentpay_optin_attr));
    				}
    			} else {
    				if(!driver.findElement(parentpay_optin_attr).isSelected()){
    					System.out.println("The parent pay attribute is already deselected.");
    				} else {
    					System.out.println("The parent pay attribute is not deselected. Deselecting it....");
    					SCHUtils.clickUsingJavaScript(driver.findElement(parentpay_optin_attr));
    				}
    			}
    			
    			Thread.sleep(3000);
    			
    			if(driver.findElement(parentite_popup_attr).isSelected()){
    				System.out.println("The parent site pop up is already selected. Deselecting it....");
    				SCHUtils.clickUsingJavaScript(driver.findElement(parentite_popup_attr));
    			} else {
    				System.out.println("The parent site pop up is already deselected.");
    			}
    			
    			Thread.sleep(3000);
    			
    			if(driver.findElement(parentsite_enrollment_attr).isSelected()){
    				System.out.println("The parent site enrollment is already selected. Deselecting it....");
    				SCHUtils.clickUsingJavaScript(driver.findElement(parentsite_enrollment_attr));
    			} else {
    				System.out.println("The parent site enrollment is already deselected.");
    			}
    			
    			Thread.sleep(1500);
    			PauseUtil.pause(2000);
                SCHUtils.clickUsingJavaScript(driver.findElement(btn_Apply));
                
                Thread.sleep(1500);
                
                driver.get("https://dev35-rco-scholastic.demandware.net/s/rco-ca/en/home");
    		} catch (Exception e) {
    			e.printStackTrace();
    			Assert.fail("Cannot update the attributes for user");
    		}
    }
    
  //######################################### SCSCOD-6993 ##################################################################
    @FindBy(locator="dw.CSR.checkout.rewards.redemptions.RESET.button")
    private WebElement CSR_rewards_RESET_button;
    
    @FindBy(locator="dw.CSR.checkout.rewards.redemptions.RESET.YES.button")
    private WebElement CSR_rewards_RESET_YES_button;
    
    @FindBy(locator="dw.CSR.checkout.rewards.redemptions.RESET.NO.button")
    private WebElement CSR_rewards_RESET_NO_button;
    
    public WebElement CSR_rewards_RESET_NO_button(){
    	return CSR_rewards_RESET_NO_button;
    }
    
    public WebElement CSR_rewards_RESET_YES_button(){
    	return CSR_rewards_RESET_YES_button;
    }
    
    public WebElement CSR_rewards_RESET_button(){
    	return CSR_rewards_RESET_button;
    }
    
    @Override
    public void CSR_selects_Reset_button(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        CSR_rewards_RESET_button().click();
    }
    
    @Override
    public void CSR_selects_YES_on_Reset_modal(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        CSR_rewards_RESET_YES_button().click();
    }
    
    @Override
    public void CSR_sees_empty_bonus_bank_txtbox_YTO(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        String act_result = fld_StudentClub_BonusBank().getAttribute("value");
        String exp_result = "";
        
        Assert.assertEquals(act_result, exp_result, "The YTO bonus bank has not been cleared!");
    }

    @Override
    public void CSR_sees_empty_paper_coupons_txtbox_YTO(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        String act_result = fld_StudentClub_PaperBonus().getAttribute("value");
        String exp_result = "";
        
        Assert.assertEquals(act_result, exp_result, "The YTO paper coupon has not been cleared!");
    }
    
    @Override
    public void CSR_does_not_see_coupons_in_Rewards_page(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        try{
        	fld_applied_coupon_Section1_RewardsPage().isDisplayed();
        	Assert.fail("The applied coupons are still showing on the Rewards page.");
        } catch(Exception e){
        	System.out.println("The applied coupons are not showing on the Rewards page.");
        }	
    }
    
    @Override
    public void CSR_sees_empty_bonus_bank_txtbox_Teacher_Exclusive(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        String act_result = fld_TeacherCat_BonusBank().getAttribute("value");
        String exp_result = "";
        
        Assert.assertEquals(act_result, exp_result, "The Teacher Exclusive bonus bank has not been cleared!");
    }

    @Override
    public void CSR_sees_empty_paper_coupons_txtbox_Teacher_Exclusive(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        String act_result = fld_TeacherCat_PaperBonus().getAttribute("value");
        String exp_result = "";
        
        Assert.assertEquals(act_result, exp_result, "The Teacher Exclusive paper coupon has not been cleared!");
	}
    
    @Override
    public void CSR_sees_empty_bonus_bank_txtbox_Paid_Shipping(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        String act_result = fld_Shipping_BonusBank().getAttribute("value");
        String exp_result = "";
        
        Assert.assertEquals(act_result, exp_result, "The Paid Shipping bonus bank has not been cleared!");
    }
    
    @Override
    public void CSR_sees_empty_paper_coupons_txtbox_Paid_Shipping(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        String act_result = fld_Shipping_PaperBonus().getAttribute("value");
        String exp_result = "";
        
        Assert.assertEquals(act_result, exp_result, "The Paid Shipping paper coupon has not been cleared!");
    }
	
    @Override
    public void CSR_selects_NO_on_Reset_modal(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        CSR_rewards_RESET_NO_button().click();
    }
    
    @Override
    public void CSR_sees_the_same_applied_bonus_bank_txtbox_YTO(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        String act_result = fld_StudentClub_BonusBank().getAttribute("value");
        String exp_result = TestBaseProvider.getTestBase().getTestData().getString("sBonusBank");
        
        Assert.assertEquals(act_result, exp_result, "The YTO bonus bank has been cleared!");
    }

    @Override
    public void CSR_sees_the_same_applied_paper_coupons_txtbox_YTO(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        String act_result = fld_StudentClub_PaperBonus().getAttribute("value");
        String exp_result = TestBaseProvider.getTestBase().getTestData().getString("sPaperBank");
        
        Assert.assertEquals(act_result, exp_result, "The YTO paper coupon has been cleared!");
    }
    
    @Override
    public void CSR_sees_the_same_applied_bonus_bank_txtbox_Teacher_Exclusive(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        String act_result = fld_TeacherCat_BonusBank().getAttribute("value");
        String exp_result = TestBaseProvider.getTestBase().getTestData().getString("tBonusBank");
        
        Assert.assertEquals(act_result, exp_result, "The Teacher Exclusive bonus bank has been cleared!");
    }

    @Override
    public void CSR_sees_the_same_applied_paper_coupons_txtbox_Teacher_Exclusive(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        String act_result = fld_TeacherCat_PaperBonus().getAttribute("value");
        String exp_result = TestBaseProvider.getTestBase().getTestData().getString("tPaperBank");
        
        Assert.assertEquals(act_result, exp_result, "The Teacher Exclusive paper coupon has been cleared!");
    }
    
    @Override
    public void CSR_sees_the_same_applied_bonus_bank_txtbox_Paid_Shipping(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        String act_result = fld_Shipping_BonusBank().getAttribute("value");
        String exp_result = TestBaseProvider.getTestBase().getTestData().getString("shipBonusBank");
        
        Assert.assertEquals(act_result, exp_result, "The Paid Shipping bonus bank has been cleared!");
    }
    
    @Override
    public void CSR_sees_the_same_applied_paper_coupons_txtbox_Paid_Shipping(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
        String act_result = fld_Shipping_PaperBonus().getAttribute("value");
        String exp_result = TestBaseProvider.getTestBase().getTestData().getString("shipPaperBank");
        
        Assert.assertEquals(act_result, exp_result, "The Paid Shipping paper coupon has been cleared!");
    }
    
    @Override
    public void CSR_sees_coupon_in_Rewards_section(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(1000);
        
    	Boolean applied_coupon_container_is_displayed = fld_applied_coupon_Section1_RewardsPage().isDisplayed();
    	
    	Assert.assertTrue(applied_coupon_container_is_displayed, "The applied coupons are not showing on the Rewards page.");
    }
    //######################################### SCSCOD-6993 ##################################################################
    
    @Override
    public double Selects_first_item_from_Make_Selection_window_And_get_Exceeded_amt() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(5000);
        
        select_item1_MakeYourSelection().click();

        String Exeecded_Val=Exeeded_Amt_MakeYourSelection_Window().getText();
        double Exeecded_Val_is=Double.parseDouble(Exeecded_Val);
        return Exeecded_Val_is;
    }
    
    @Override
    public void Selects_first_item_from_Make_Selection_window() {
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(3000);
        
        select_item1_MakeYourSelection().click();
    }
    
    public double Total_DTS_exceeded_payable_amt_with_taxes(){
    	PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(2000);
        
    	String Payable_Amt=Payable_amt_Rewards_Coupons().getText();
        String[] value = Payable_Amt.split("\\|");

        String[] value2=value[0].split(":");
        System.out.println("*******************:"+value2[1]);

        String value3=value2[1].toString().trim();
        value3=value3.substring(1);
        double payableAmt_act=Double.parseDouble(value3);
        System.out.println("@@@@@@@@@@@@@@:"+payableAmt_act);
        
		return payableAmt_act;
    }
    
    @Override
    public void BM_Password_reset_after_expiry_for_BM_users(){
    	WebDriver driver=TestBaseProvider.getTestBase().getDriver();
    	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        PauseUtil.pause(2000);
        
        String OldPwd="Scholastic@1234";
        String NewPwd="Csrtest@123";
        
        int LastRow=ExLib.getLaRow("Sheet2");
    	System.out.println("Rows in Excel sheet are:"+LastRow);
    	
    	for (int i = 2; i <= LastRow; i++) {
    		String Column1Data=ExLib.getExcelData("Sheet2", i, 0);
    		
    		
    		BM_fld_Login().click();
            BM_fld_Login().sendKeys(Column1Data);
            PauseUtil.pause(2000);
            
            BM_fld_Password().click();
            BM_fld_Password().sendKeys(OldPwd);
            PauseUtil.pause(2000);
            
            BM_btn_LogIn().click();
            //PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(5000);
            
            SCHUtils.clickUsingJavaScript(BM_fld_OldPwd_ToSet());
            //BM_fld_OldPwd_ToSet().click();
            BM_fld_OldPwd_ToSet().sendKeys(OldPwd);
            PauseUtil.pause(2000);
            
            SCHUtils.clickUsingJavaScript(BM_fld_OriginalPwd_ToSet());
            //BM_fld_OriginalPwd_ToSet().click();
            BM_fld_OriginalPwd_ToSet().sendKeys(NewPwd);
            PauseUtil.pause(2000);
            
            SCHUtils.clickUsingJavaScript(BM_fld_Original_Pwd_confirm_ToSet());
            //BM_fld_Original_Pwd_confirm_ToSet().click();
            BM_fld_Original_Pwd_confirm_ToSet().sendKeys(NewPwd);
            PauseUtil.pause(2000);
            
            SCHUtils.clickUsingJavaScript(BM_btn_Apply_in_NewUserPage());
            //BM_btn_Apply_in_NewUserPage().click();
        	//PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(5000);
            
            SCHUtils.clickUsingJavaScript(BM_btn_LogOff());
            //BM_btn_LogOff().click();
            //PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(5000);
    		
            System.out.println("Password is set for the account :"+Column1Data);
    	}
    }
    
    @Override
    public void TCOD_delete_applied_coupon_Rewards_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        delete_coupon_in_RewardsPage().click();
        PauseUtil.pause(1000);
        TCOD_YES_to_delete_applied_coupon().click();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
    }
    
    @Override
    public void verify_ManualFreePick_coupon_Details_ConfirmSubmitPage() {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        String act_text=fld_coupon_val_in_ConfirmSubmit_Coupons_section().getText().trim();
        String exp_text=TestBaseProvider.getTestBase().getTestData().getString("couponnumber");
        Assert.assertEquals(act_text,exp_text,"Incorrect coupon value is displayed in COUPONS section Confirm & Submit page");
    }
    
    @Override
    public void verify_selected_FreePick_item_info_Rewards_Page() {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        String act_text=fld_selected_FreePick_item_num_YourSelection_Window().getText().trim();
        System.out.println("############:"+act_text);
        String exp_text=TestBaseProvider.getTestBase().getTestData().getString("couponsearch");
        Assert.assertEquals(act_text,exp_text,"Incorrect selected FreePick item is displayed in Modal window");
    }
    
    @Override
    public void CSR_verify_Free_TeacherKit_Promotion_displayed_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
        	fld_Free_TeacherKit_Promotion_in_RedemptionsRewardsPage().isDisplayed();
            System.out.println("Free Teacher Kit promotion is displayed in Redemptions & Rewards Page");
        } catch (Exception e) {
            Assert.fail("Free Teacher Kit promotion is not displayed in Redemptions & Rewards Page");
        }
    }
    
    @Override
    public void CSR_verify_fld_Free_TeacherKit_Promotion_not_displayed_in_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
        	fld_Free_TeacherKit_Promotion_in_RedemptionsRewardsPage().isDisplayed();
            Assert.fail("Free Teacher Kit promotion is displayed in Redemptions & Rewards Page");
        } catch (Exception e) {
            System.out.println("Free Teacher Kit promotion is not displayed in Redemptions & Rewards Page");
        }
    }
    
    @Override
    public void CSR_selects_second_item_in_FreePick_window_Redemptions_Rewards_Page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
	    StudentFlyerOrdersPage SFOpage=new StudentFlyerOrdersPage();
		SFOpage.teacher_select_second_FreePick_item_from_the_list_SFO_section();
    }
    
    @Override
    public void CSR_apply_a_same_coupon_Rewards_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        fld_Enter_CouponCode_RewardsPage().click();
        fld_Enter_CouponCode_RewardsPage().clear();
        fld_Enter_CouponCode_RewardsPage().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("CouponCode"));
        PauseUtil.pause(4000);
        btn_Apply_for_Coupon_RewardsPage().click();
    }
    
    @Override
    public void verify_Searched_FreePick_Item_displayed_in_results_list() {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        String act_text=first_item_search_results_SFO_modal_section().getText().trim();
        System.out.println("###########:"+act_text);
        String exp_text=TestBaseProvider.getTestBase().getTestData().getString("couponsearch");
        Assert.assertEquals(act_text,exp_text,"Not displayed correct item in SFO search results");
    }
    
    @Override
    public void apply_TGAT_coupon_second_time_in_Rewards_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
      
        fld_Enter_CouponCode_RewardsPage().click();
        fld_Enter_CouponCode_RewardsPage().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("TGATcoupon"));
        PauseUtil.pause(4000);
        btn_Apply_for_Coupon_RewardsPage().click();
    }
    
    @Override
    public void verify_TGAT_couon_info_Coupons_applied_section() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        String act_text=fld_applied_TGAT_Coupons_section().getText().trim();
        String exp_text=TestBaseProvider.getTestBase().getTestData().getString("TGATcoupon");
        
        Assert.assertEquals(act_text, exp_text, "Incorrect TGAT coupon info displayed in coupons section");
    }
    
    @Override
    public void navigatesfo_clickapplycoupon_entercoupon_applybutton(){
    	IStudentFlyerOrdersPage studentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
    	StudentFlyerOrdersPage spage = new StudentFlyerOrdersPage();
    	LoginPage login = new LoginPage();
    	if(login.sizeEnter_ClassRoom_Order().size()!=0){
        	login.teacher_navigate_to_SFO();
    		}
    	 PauseUtil.pause(4000);
    	List<WebElement> ele = spage.sizesfofreepickitemquantities();
 		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
 		for(int i=0;i<ele.size();i++){
 			spage.removesfofreepickitem().click();
 			spage.YES_to_delete_item1_reviewcart().click();
			PauseUtil.pause(6000);
 		}
 		}
		 studentFlyerOrdersPage.clicklink_sfoapplyCoupon();
		 PauseUtil.waitForAjaxToComplete(2500);
		 PauseUtil.pause(6000);
		 spage.getinputbox_sfocoupon_sname().click();
		 PauseUtil.pause(1500);
		 spage.getinputbox_sfocoupon_sname().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("sname"));
		 PauseUtil.pause(1000);
		 spage.getinputbox_sfocoupon_sname().sendKeys(Keys.TAB);
		 PauseUtil.pause(1000);
		 spage.getinputbox_sfocoupon_couponCode().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("sfofreepick"));
		PauseUtil.waitForAjaxToComplete(2500);
		studentFlyerOrdersPage.click_sfo_coupon_ApplyButton_State();
		PauseUtil.waitForAjaxToComplete(2500);
    }
    
    @Override
    public void verify_no_search_results_display_in_makeyourselection_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
       // Assert.assertTrue(empty_data_search_results_MakeYourSelection_window().isDisplayed(), "Search results are displayed");
        boolean found = empty_data_search_results_MakeYourSelection_window().isDisplayed();
        System.out.println("displayed or not?:"+found);
        String text_exp=empty_data_search_results_MakeYourSelection_window().getText();
        System.out.println("no results text is------------>>>>>>>>>>>>>>>>"+text_exp);
        String text_act="No search results found";

        Assert.assertEquals(text_act, text_exp, "Search results are displayed");

    }


    @Override
    public void verify_rewardsPage_spellScholasticMsgdisplay() {
        boolean found =spellScholastic_sectionDisplay().isDisplayed();
        if(!found){
            Assert.fail("Spell Scholastic not displayed");
        }


    }

    
    @Override
    public void teacher_verify_BonusFlat_desc_displayed() {
    	PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(2000);
    	
    	try {
    		section_BonusFlat_description_rewards_page().isDisplayed();
    		System.out.println("Bonus Flat description is displayed");
		} catch (Exception e) {
			Assert.fail("Bonus Flat description is not displayed");
		}
    }
    
    @Override
    public void CSR_verify_BonusFlat_amt_section_is_displayed_RedeemRewards_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            earned_BonusBank_amt_for_coupon_RewardsPage().isDisplayed();
            System.out.println("Bonus Flat amount and section is displayed");
        } catch (Exception e) {
            Assert.fail("Bonus Flat amount and section is not displayed");
        }
    }
    
    @Override
    public void verify_applied_coupon_is_displayed_in_coupons_section_Rewards_page() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        try {
            TGAT_coupon_in_Coupons_Applied_section().isDisplayed();
            System.out.println("Applied coupon is present in Coupons section");
        } catch (Exception e) {
            Assert.fail("Applied coupon is not present in Coupons section");
        }
    }
    
    @Override
    public void CSR_selects_TGAT_delete_button_and_click_YES() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        btn_close_TGAT_coupon().click();
        PauseUtil.pause(1500);
        SCHUtils.clickUsingJavaScript(btn_YES_to_delete_TGAT_coupon_CSR());
    }
    
    @Override
    public void CSR_selects_TGAT_delete_button_and_click_NO() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        btn_close_TGAT_coupon().click();
        PauseUtil.pause(1500);
        SCHUtils.clickUsingJavaScript(btn_NO_to_delete_TGAT_coupon_CSR());
    }
    
    //######################################### SCSCOD-2324 ##################################################################
    @Override
    public void bonus_flat_bonus_percentage_promotion_displays_Rewards_page(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        try{
        	getCheckoutRewardBonusFlatBonusPercPromo().isDisplayed();
        	System.out.println("The bonus flat/percentage promotion is displayed");
        } catch(Exception e){
        	Assert.fail("The bonus flat/percentage promotion is not displayed");
        }
    }
    
    @Override
	public void free_item_promotion_displays_Rewards_page() {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        int numFreeItemPromo = getCheckoutRewardFreeItemPromoList().size();
        
        if(numFreeItemPromo == 0)
        	Assert.fail("The free item promotion(s) is(are) not displayed");
        else
        	System.out.println("The free item promotion(s) is(are) displayed");
	}

	@Override
	public void Spell_Scholastic_promotion_displays_Rewards_page() {
		PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        try{
        	getCheckoutRewardSpellScholasticPromo().isDisplayed();
        	System.out.println("The Spell SCHOLASTIC promotion is displayed");
        } catch(Exception e){
        	Assert.fail("The Spell SCHOLASTIC promotion is not displayed");
        }
	}

	@Override
	public void student_incentive_promotion_displays_Rewards_page() {
		PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        try{
        	getCheckoutRewardStudentIncentivePromo().isDisplayed();
        	System.out.println("The Student Incentive promotion is displayed");
        } catch(Exception e){
        	Assert.fail("The Student Incentive promotion is not displayed");
        }
	}

	@Override
	public void bonus_flat_bonus_percentage_promotion_not_displayed_Rewards_page() {
		PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        try{
        	getCheckoutRewardBonusFlatBonusPercPromo().isDisplayed();
        	Assert.fail("The bonus flat/percentage promotion is displayed");
        } catch(Exception e){
        	System.out.println("The bonus flat/percentage promotion is not displayed");
        }
	}
	
	//######################################### SCSCOD-2324 ##################################################################
	
	public void verifyfreeshipping(String shippingCharge) {
    	PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(3000);
        System.out.println("================> "
                + getlblCouponsandRewardsShippingandHandlingBlueBar().getText());
        System.out.println("Expected Shipping Charge:" + shippingCharge);
        for(int i=0;i<sizelblShippingandHandlingBlueBar().size();i++){
        	 System.out.println("Actual Shipping Charge:" + shippingCharge);
        if(!sizelblShippingandHandlingBlueBar().get(i).getText().trim().contains(shippingCharge))
        {
            Assert.fail("Shipping charge should be FREE for Items eligible for Free Shipping");
        }
        }
    }
	
	//######################################### SCSCOD-151 ##################################################################
	@FindBy(locator = "dw.checkout.free.pick.coupon.itemnumber.list")
    private List<WebElement> checkout_freepickcoupon_item_number_list;
	
	@FindBy(locator = "dw.checkout.free.pick.coupon.itemtitle.list")
    private List<WebElement> checkout_freepickcoupon_item_title_list;

	@FindBy(locator = "dw.checkout.free.pick.coupon.flyertitle.list")
    private List<WebElement> checkout_freepickcoupon_item_flyer_list;
	
	@FindBy(locator = "dw.checkout.free.pick.coupon.itemprice.list")
    private List<WebElement> checkout_freepickcoupon_item_price_list;
	
	@FindBy(locator = "dw.checkout.free.pick.coupon.itemquantity.list")
    private List<WebElement> checkout_freepickcoupon_item_quantity_list;
	
	@FindBy(locator = "dw.checkout.SFO.free.pick.item.number.list")
    private List<WebElement> checkout_SFO_freepickcoupon_item_number_list;
	
	@FindBy(locator = "dw.checkout.SFO.free.pick.item.title.list")
    private List<WebElement> checkout_SFO_freepickcoupon_item_title_list;

	@FindBy(locator = "dw.checkout.SFO.free.pick.item.flyer.list")
    private List<WebElement> checkout_SFO_freepickcoupon_item_flyer_list;
	
	@FindBy(locator = "dw.checkout.SFO.free.pick.item.couponcode.list")
    private List<WebElement> checkout_SFO_freepickcoupon_item_couponcode_list;
	
	@FindBy(locator = "dw.checkout.SFO.free.pick.item.price.list")
    private List<WebElement> checkout_SFO_freepickcoupon_item_price_list;
	
	@FindBy(locator = "dw.checkout.SFO.free.pick.item.quantity.list")
    private List<WebElement> checkout_SFO_freepickcoupon_item_quantity_list;
	
	@FindBy(locator = "dw.checkout.section.coupon.list.section")
    private List<WebElement> checkout_coupon_section_list;
	
	@FindBy(locator = "dw.checkout.section.payment.section.no.payment.message")
    private WebElement checkout_coupon_section_payment_section_no_payment_msg;
			
	@FindBy(locator = "dw.checkout.section.payment.section.SOO.paid.order.summary")
    private WebElement checkout_order_summary_section_SOO_paid;
	
	@FindBy(locator = "dw.checkout.section.rewards.section.bonus.rewards.desc")
    private WebElement checkout_rewards_section_bonus_rewards;

	@FindBy(locator = "dw.checkout.section.rewards.section.free.item.rewards.desc.list")
    private List<WebElement> checkout_rewards_section_free_item_rewards;
	
	@FindBy(locator = "dw.checkout.section.rewards.section.free.student.incentives.desc")
    private WebElement checkout_rewards_section_free_student_incentives;
	
	@FindBy(locator = "dw.checkout.section.rewards.section.spell.scholastic.desc")
    private WebElement checkout_rewards_section_spell_scholastic;
	
	@FindBy(locator = "dw.checkout.btn.APPLY.SFO.section.Rewards.page")
	private WebElement btn_APPLY_SFO_section_Rewards_page;
	
	@FindBy(locator = "dw.checkout.btn.EDIT.SFO.section.Rewards.page")
	private WebElement btn_EDIT_SFO_section_Rewards_page;
	
	public WebElement btn_APPLY_SFO_section_Rewards_page() {
        return btn_APPLY_SFO_section_Rewards_page;
    }
	
	public WebElement btn_EDIT_SFO_section_Rewards_page() {
        return btn_EDIT_SFO_section_Rewards_page;
    }
	
    public WebElement getRewardsSectionStudentIncentives() {
        return checkout_rewards_section_free_student_incentives;
    }
    
    public WebElement getRewardsSectionSpellScholastic() {
        return checkout_rewards_section_spell_scholastic;
    }
    
    public List<WebElement> getRewardsSectionFreeItemRewardsList() {
        return checkout_rewards_section_free_item_rewards;
    }
    
    public WebElement getRewardsSectionBonusRewards() {
        return checkout_rewards_section_bonus_rewards;
    }
    
    public WebElement getOrderSummarySectionSOOPaid() {
        return checkout_order_summary_section_SOO_paid;
    }
    
    public WebElement getPaymentSectionNoPaymentMsgconfirmSubmitPage() {
        return checkout_coupon_section_payment_section_no_payment_msg;
    }
    
    public List<WebElement> getCouponSectionListconfirmSubmitPage() {
        return checkout_coupon_section_list;
    }
    
    public List<WebElement> getSFOFreePickItemNumberListconfirmSubmitPage() {
        return checkout_SFO_freepickcoupon_item_number_list;
    }
    
    public List<WebElement> getSFOFreePickItemTitleListconfirmSubmitPage() {
        return checkout_SFO_freepickcoupon_item_title_list;
    }
    
    public List<WebElement> getSFOFreePickItemFlyerListconfirmSubmitPage() {
        return checkout_SFO_freepickcoupon_item_flyer_list;
    }
    
    public List<WebElement> getSFOFreePickItemPriceListconfirmSubmitPage() {
        return checkout_SFO_freepickcoupon_item_price_list;
    }
    
    public List<WebElement> getSFOFreePickItemCouponCodeListconfirmSubmitPage() {
        return checkout_SFO_freepickcoupon_item_couponcode_list;
    }
    
    public List<WebElement> getSFOFreePickItemQuantityListconfirmSubmitPage() {
        return checkout_SFO_freepickcoupon_item_quantity_list;
    }
    
    public List<WebElement> getFreePickCouponItemNumberListconfirmSubmitPage() {
        return checkout_freepickcoupon_item_number_list;
    }
    
    public List<WebElement> getFreePickCouponItemTitleListconfirmSubmitPage() {
        return checkout_freepickcoupon_item_title_list;
    }
    
    public List<WebElement> getFreePickCouponItemFlyerListconfirmSubmitPage() {
        return checkout_freepickcoupon_item_flyer_list;
    }
    
    public List<WebElement> getFreePickCouponItemPriceListconfirmSubmitPage() {
        return checkout_freepickcoupon_item_price_list;
    }
    
    public List<WebElement> getFreePickCouponItemQuantityListconfirmSubmitPage() {
        return checkout_freepickcoupon_item_quantity_list;
    }
    
    @Override
    public void verify_free_pick_item_Confirm_Submit_page(){
    	PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(3000);
        
        int numItems = getFreePickCouponItemNumberListconfirmSubmitPage().size();
        
        for(int i = 0; i < numItems; i++){
        	String act_num = getFreePickCouponItemNumberListconfirmSubmitPage().get(i).getText().trim();
        	String exp_num = TestBaseProvider.getTestBase().getTestData().getString("freepickitemnum" + (i + 1));
        	
        	Assert.assertEquals(act_num, exp_num, "The free pick coupon item's number is incorrect on Confirm and Submit page");
        	
        	PauseUtil.pause(3000);
        	
        	String act_title = getFreePickCouponItemTitleListconfirmSubmitPage().get(i).getText().trim();
        	String exp_title = TestBaseProvider.getTestBase().getTestData().getString("freepickitemtitle" + (i + 1));
        	
        	Assert.assertEquals(act_title, exp_title, "The free pick coupon item's title is incorrect on Confirm and Submit page");
        	
        	PauseUtil.pause(3000);
        	
        	String act_flyer = getFreePickCouponItemFlyerListconfirmSubmitPage().get(i).getText().trim();
        	String exp_flyer = TestBaseProvider.getTestBase().getTestData().getString("freepickitemflyer" + (i + 1));
        	
        	Assert.assertEquals(act_flyer, exp_flyer, "The free pick coupon item's flyer is incorrect on Confirm and Submit page");
        	
        	PauseUtil.pause(3000);
        	
        	String act_price = getFreePickCouponItemPriceListconfirmSubmitPage().get(i).getText().trim();
        	String exp_price = TestBaseProvider.getTestBase().getTestData().getString("freepickitemprice" + (i + 1));
        	
        	Assert.assertEquals(act_price, exp_price, "The free pick coupon item's price is incorrect on Confirm and Submit page");
        	
        	PauseUtil.pause(3000);
        	
        	String act_quantity = getFreePickCouponItemQuantityListconfirmSubmitPage().get(i).getText().trim();
        	String exp_quantity = TestBaseProvider.getTestBase().getTestData().getString("freepickitemquantity" + (i + 1));
        	
        	Assert.assertEquals(act_quantity, exp_quantity, "The free pick coupon item's quantity is incorrect on Confirm and Submit page");
        }
    }
	
    @Override
    public void verify_SFO_free_pick_item_Confirm_Submit_page(){
    	PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(3000);
        
        int numItems = getSFOFreePickItemNumberListconfirmSubmitPage().size();
        
        for(int i = 0; i < numItems; i++){
        	String act_num = getSFOFreePickItemNumberListconfirmSubmitPage().get(i).getText().trim();
        	String exp_num = TestBaseProvider.getTestBase().getTestData().getString("SFOfreepickitemnum" + (i + 1));
        	
        	Assert.assertEquals(act_num, exp_num, "The SFO free pick item's number is incorrect on Confirm and Submit page");
        	
        	PauseUtil.pause(3000);
        	
        	String act_title = getSFOFreePickItemTitleListconfirmSubmitPage().get(i).getText().trim();
        	String exp_title = TestBaseProvider.getTestBase().getTestData().getString("SFOfreepickitemtitle" + (i + 1));
        	
        	Assert.assertEquals(act_title, exp_title, "The SFO free pick item's title is incorrect on Confirm and Submit page");
        	
        	PauseUtil.pause(3000);
        	
        	String act_flyer = getSFOFreePickItemFlyerListconfirmSubmitPage().get(i).getText().trim();
        	String exp_flyer = TestBaseProvider.getTestBase().getTestData().getString("SFOfreepickitemflyer" + (i + 1));
        	
        	Assert.assertEquals(act_flyer, exp_flyer, "The SFO free pick item's flyer is incorrect on Confirm and Submit page");
        	
        	PauseUtil.pause(3000);
        	
        	String act_price = getSFOFreePickItemPriceListconfirmSubmitPage().get(i).getText().trim();
        	String exp_price = TestBaseProvider.getTestBase().getTestData().getString("SFOfreepickitemprice" + (i + 1));
        	
        	Assert.assertEquals(act_price, exp_price, "The SFO free pick item's price is incorrect on Confirm and Submit page");
        	
        	PauseUtil.pause(3000);
        	
        	String act_coupon = getSFOFreePickItemCouponCodeListconfirmSubmitPage().get(i).getText().trim();
        	String exp_coupon = TestBaseProvider.getTestBase().getTestData().getString("SFOfreepickitemcoupon" + (i + 1));
        	
        	Assert.assertEquals(act_coupon, exp_coupon, "The SFO free pick item's coupon is incorrect on Confirm and Submit page");
        	
        	PauseUtil.pause(3000);
        	
        	String act_quantity = getSFOFreePickItemQuantityListconfirmSubmitPage().get(i).getText().trim();
        	String exp_quantity = TestBaseProvider.getTestBase().getTestData().getString("SFOfreepickitemquantity" + (i + 1));
        	
        	Assert.assertEquals(act_quantity, exp_quantity, "The SFO free pick item's quantity is incorrect on Confirm and Submit page");
        }
    }
	
    @Override
    public void verify_coupon_list_section_is_displayed(){
    	PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(3000);
        
        try{
        	for(WebElement element: getCouponSectionListconfirmSubmitPage()){
        		element.isDisplayed();
        		System.out.println("One of the coupons is present on Confirm and submit page");
        	}
        } catch(Exception e){
        	e.printStackTrace();
        	Assert.fail("Something went wrong on the coupon section");
        }
    }
    
    @Override
    public void verify_payment_section_display_no_payment_Confirm_andSubmit(){
    	PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(3000);
        
        String exp_msg = ConstantUtils.NOBALANCEMSG_PAYMENTSECTION_CONFIRMATIONPAGES;
        String act_msg = getPaymentSectionNoPaymentMsgconfirmSubmitPage().getText().trim();
        
        Assert.assertEquals(act_msg, exp_msg, "The displayed message for no payment is not correct.");
    }
    
    @Override
    public void verify_SOO_Paid_amount_is_zero_Order_Summary(){
    	PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(3000);
        
        double exp_amount = 0.00;
        double act_amount = SCHUtils.convertDollarsToDouble(getOrderSummarySectionSOOPaid(), 1);
        
        Assert.assertEquals(act_amount, exp_amount, "The displayed amount for SOO paid under the Order Summary is not $0.");
    }
    
    @Override
    public void verify_bonus_rewards_displayed_Confirm_andSubmit(){
    	PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(3000);
        
        try{
        	getRewardsSectionBonusRewards().isDisplayed();
        	System.out.println("Bonus Rewards is displayed in the Rewards section");
        } catch(Exception e){
        	e.printStackTrace();
        	Assert.fail("Bonus Rewards is not displayed in the Rewards section");
        }
    }
    
    @Override
    public void verify_free_item_rewards_displayed_Confirm_andSubmit(){
    	PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(3000);
        
        try{
        	for(WebElement element: getRewardsSectionFreeItemRewardsList()){
        		element.isDisplayed();
        		System.out.println("One of the free item rewards is present on Confirm and submit page");
        	}
        } catch(Exception e){
        	e.printStackTrace();
        	Assert.fail("Something went wrong on the rewards section for free items");
        }
    }
    
    @Override
    public void verify_student_incentives_displayed_Confirm_andSubmit(){
    	PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(3000);
        
        try{
        	getRewardsSectionStudentIncentives().isDisplayed();
        	System.out.println("Student Incentive section is displayed in the Rewards section");
        } catch(Exception e){
        	e.printStackTrace();
        	Assert.fail("Student Incentive section is not displayed in the Rewards section");
        }
    }
    
    @Override
    public void verify_spell_scholastic_displayed_Confirm_andSubmit(){
    	PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(3000);
        
        try{
        	getRewardsSectionSpellScholastic().isDisplayed();
        	System.out.println("Spell Scholastic is displayed in the Rewards section");
        } catch(Exception e){
        	e.printStackTrace();
        	Assert.fail("Spell Scholastic is not displayed in the Rewards section");
        }
    }
    
    @Override
    public void enter_number_students_student_incentives_Rewards_Page(){
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        tossinQty().click();
        tossinQty().clear();
        tossinQty().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("NumOfStudents"));
        tossinQty().sendKeys(Keys.TAB);
    }
    
    @Override
    public void enter_entire_amount_with_bonus_bank_paper_coupon_TE(){
    	SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double teachclubtotal = TeacherClub_BlueBarTotal();

        double bonusbanktoEnter1 = Math.round( (teachclubtotal/2) * 100.0 ) / 100.0;
        String bonusbanktoEnter = Double.toString(bonusbanktoEnter1);
        
        double papercoupontoEnter1 = teachclubtotal - bonusbanktoEnter1;
        String papercoupontoEnter = Double.toString(papercoupontoEnter1);


        try {
            fld_TeacherCat_btn_EDIT().isDisplayed();
            fld_TeacherCat_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        fld_TeacherCat_BonusBank().click();
        fld_TeacherCat_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_TeacherCat_BonusBank().sendKeys(bonusbanktoEnter);
        PauseUtil.pause(2000);
        btnSkip3().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        try {
            fld_TeacherCat_btn_EDIT().isDisplayed();
            fld_TeacherCat_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        
        fld_TeacherCat_PaperBonus().click();
        fld_TeacherCat_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_TeacherCat_PaperBonus().sendKeys(papercoupontoEnter);
        PauseUtil.pause(2000);
        btnSkip3().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
    }
    
    @Override
    public void enter_entire_amount_with_bonus_bank_paper_coupon_YTO(){
    	SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        double studclubtotal = StudentClub_BlueBarTotal();

        double bonusbanktoEnter1 = Math.round( (studclubtotal/2) * 100.0 ) / 100.0;
        String bonusbanktoEnter = Double.toString(bonusbanktoEnter1);
        
        double papercoupontoEnter1 = studclubtotal - bonusbanktoEnter1;
        String papercoupontoEnter = Double.toString(papercoupontoEnter1);

        try {
            fld_StudentClub_btn_EDIT().isDisplayed();
            fld_StudentClub_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        
        fld_StudentClub_BonusBank().click();
        fld_StudentClub_BonusBank().clear();
        PauseUtil.pause(2000);
        fld_StudentClub_BonusBank().sendKeys(bonusbanktoEnter);
        PauseUtil.pause(2000);
        btnSkip1().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        
        try {
            fld_StudentClub_btn_EDIT().isDisplayed();
            fld_StudentClub_btn_EDIT().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        
        fld_StudentClub_PaperBonus().click();
        fld_StudentClub_PaperBonus().clear();
        PauseUtil.pause(2000);
        fld_StudentClub_PaperBonus().sendKeys(papercoupontoEnter);
        PauseUtil.pause(2000);
        btnSkip1().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
    }
    
    @Override
    public void enter_entire_amount_with_paper_coupon_SFO(){
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(1000);
    	
    	double SFOtotal = SFO_BlueBarTotal();
        String SFOtoEnter = Double.toString(SFOtotal);

        try {
        	btn_EDIT_SFO_section_Rewards_page().isDisplayed();
        	btn_EDIT_SFO_section_Rewards_page().click();
        } catch (Exception e) {
            System.out.println("Edit button is not shown");
        }
        getCreditNotesSFO().click();
        getCreditNotesSFO().clear();
        PauseUtil.pause(2000);
        
        getCreditNotesSFO().sendKeys(SFOtoEnter);
        PauseUtil.pause(2000);
        btn_APPLY_SFO_section_Rewards_page().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
    }
}





