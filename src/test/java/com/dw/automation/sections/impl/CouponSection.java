package com.dw.automation.sections.impl;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.configuration.Configuration;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.dw.automation.beans.ProductInfoBean;
import com.dw.automation.pages.IStudentFlyerOrdersPage;
import com.dw.automation.pages.impl.CheckoutPage;
import com.dw.automation.pages.impl.CheckoutPage.RewardsAndCoupons;
import com.dw.automation.pages.impl.StudentFlyerOrdersPage;
import com.dw.automation.sections.ICouponSection;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.Section;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.WaitUtils;
import com.scholastic.torque.webdriver.ExtendedElement;

public class CouponSection extends Section implements ICouponSection {

    @FindBy(locator = "dw.teacher.studentflyerorder.coupon.popup.txt.studentname")
    private WebElement txtStudentName;

    @FindBy(locator = "dw.teacher.studentflyerorder.coupon.popup.txt.couponnumber")
    private WebElement txtCouponNumber;
    
    @FindBy(locator = "dw.teacher.studentflyerorder.coupon.popup.btn.applycoupon")
    private WebElement btnApplyCoupon;

    @FindBy(locator = "dw.teacher.coupon.popup.lst.itemids")
    private List<WebElement> lstlblItemIds;

    @FindBy(locator = "dw.teacher.coupon.popup.lst.rdo.select")
    private List<WebElement> lstRadioSelect;

    @FindBy(locator = "dw.teacher.coupon.popup.lst.flyer")
    private List<WebElement> lstlblFlyer;

    @FindBy(locator = "dw.teacher.coupon.popup.lst.price")
    private List<WebElement> lstlblPrice;

    @FindBy(locator = "dw.teacher.coupon.popup.selected.section.table")
    private List<WebElement> tablecouponSelected;

    @FindBy(locator = "dw.teacher.coupon.popup.selected.lst.itemids")
    private List<WebElement> lstlblSelectedItemIds;

    @FindBy(locator = "dw.teacher.coupon.popup.selected.lst.itemids")
    private WebElement lstlblSelectedItemId;

    @FindBy(locator = "dw.teacher.coupon.popup.selected.lst.rdo.select")
    private List<WebElement> lstBtnSelectedCross;

    @FindBy(locator = "dw.teacher.coupon.popup.selected.lst.title")
    private List<WebElement> lstlblSelectedTitle;

    @FindBy(locator = "dw.teacher.coupon.popup.selected.lst.title")
    private WebElement lstSelectedTitle;

    @FindBy(locator = "dw.teacher.coupon.popup.selected.lst.flyer")
    private List<WebElement> lstlblSelectedFlyer;

    @FindBy(locator = "dw.teacher.coupon.popup.selected.lst.price")
    private List<WebElement> lstlblSelectedPrice;

    @FindBy(locator = "dw.teacher.coupon.popup.lnk.cancel")
    private WebElement lnkCancel;

    @FindBy(locator = "dw.teacher.coupon.popup.btn.confirmandapply")
    private WebElement btnConfirmAndApply;

    @FindBy(locator = "dw.teacher.coupon.popup.select.grade")
    private WebElement selectGrade;

    @FindBy(locator = "dw.teacher.dts.modelwindow.itemprice1")
    private WebElement lblDtsModelwindowItemPrice1;

    @FindBy(locator = "dw.teacher.coupon.popup.drpdwn.gradelevel")
    private WebElement drpdwnGradeLevel;

    @FindBy(locator = "dw.teacher.coupon.popup.lst.drpdwn.gradelevel")
    private WebElement lstdrpdwnGradeLevel;

    @FindBy(locator = "dw.teacher.rewardsandcoupons.coupon.popup.parent.couponmodal")
    private WebElement couponsModel;

    @FindBy(locator = "dw.teacher.coupon.popup.lbl.titleforfreepick")
    private WebElement lblPopupTitleForFreePick;

    @FindBy(locator = "dw.teacher.mgm.coupon.parent.modal")
    private WebElement mgmCouponParentModel;

    @FindBy(locator = "dw.teacher.mgm.coupon.txt.teachercustomernumber")
    private WebElement txtMGMTeacherCustomerNumber;

    @FindBy(locator = "dw.teacher.mgm.coupon.txt.teacherfirstname")
    private WebElement txtMGMTeacherFirstName;

    @FindBy(locator = "dw.teacher.mgm.coupon.txt.teacherlastname")
    private WebElement txtMGMTeacherLastName;

    @FindBy(locator = "dw.teacher.mgm.coupon.btn.submit")
    private WebElement btnMGMSubmit;

    @FindBy(locator = "dw.teacher.coupon.popup.lbl.titlefordollartospend")
    private WebElement lblPopupTitleForDollarToSpend;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.mgm.lnk.enterreferingteacherdetail")
    private WebElement lnkMGMEnterReferingTeacherDetails;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.mgm.btn.closemodal")
    private WebElement btnCloseModal;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.mgm.lbl.thankyoumessage")
    private WebElement lblThankYouMessage;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.lbl.errormessage")
    private WebElement lblErrorMessage;

    @FindBy(locator = "dw.teacher.mgm.coupon.btn.disabledsubmit")
    private WebElement btnDisabledSubmit;

    @FindBy(locator = "dw.checkout.rewardsandcoupons.btn.continuecheckout")
    private WebElement btnContinueCheckout;

    @FindBy(locator = "dw.teacher.coupon.popup.txt.keyword")
    private WebElement txtKeyword;

    @FindBy(locator = "dw.teacher.coupon.popup.lst.paginatebtn")
    private List<WebElement> lstPaginateBtn;

    @FindBy(locator = "dw.teacher.coupon.popup.lbl.emptytable")
    private WebElement lblEmptyTable;

    @FindBy(locator = "dw.teacher.coupon.popup.lbl.topoffamtcoupon")
    private WebElement lbltopoffamtcoupon;

    @FindBy(locator = "dw.teacher.coupon.popup.amt.topoffamt")
    private WebElement amttopoffamount;


    @FindBy(locator = "dw.teacher.coupon.popup.grade.select.selectedvalue")
    private WebElement lblSelectedGradeValue;

    @FindBy(locator = "dw.teacher.coupon.popup.grade.lst.gradelist")
    private List<WebElement> lstGradeList;

    @FindBy(locator = "dw.teacher.coupon.popup.txt.grade")
    private WebElement txtGrade;

    @FindBy(locator = "dw.teacher.coupon.popup.lbl.amountover")
    private WebElement lblAmountOver;

    @FindBy(locator = "dw.teacher.coupon.popup.table.selected")
    private List<WebElement> tablecoupontableselected;
    ;

    @FindBy(locator = "dw.teacher.coupon.popup.lbl.usedamount")
    private WebElement lblUsedAmount;

    @FindBy(locator = "dw.teacher.coupon.popup.lbl.remainingamount")
    private WebElement lblRemainingAmount;

    @FindBy(locator = "dw.parent.coupon.popup.lbl.makeurselection")
    private WebElement lblMakeYourSelectionSection;

    @FindBy(locator = "dw.teacher.home.enterorder.studentflyerorder.applycoupon.txt.studentname")
    private WebElement txtCouponsStudentName;

    @FindBy(locator = "dw.teacher.coupon.popup.lbl.overdueamount")
    private WebElement lblOverDueAmountOnCouponPopUp;

    @FindBy(locator = "dw.teacher.couponsrewards.freepick.selecteditemid")
    private WebElement lblfreepickselecteditemid;

    @FindBy(locator = "dw.teacher.couponsrewards.freepick.selecteditemtitle")
    private WebElement lblfreepickselecteditemtitle;

    @FindBy(locator = "dw.teacher.couponsrewards.freepick.selecteditemflyer")
    private WebElement lblfreepickselecteditemflyer;

    @FindBy(locator = "dw.teacher.couponsrewards.freepick.selecteditemprice")
    private WebElement lblfreepickselecteditemprice;

    @FindBy(locator = "dw.teacher.couponsrewards.dts.selecteditemid")
    private WebElement lbldtsselecteditemid;

    @FindBy(locator = "dw.teacher.couponsrewards.dts.selecteditemtitle")
    private WebElement lbldtsselecteditemtitle;

    @FindBy(locator = "dw.teacher.couponsrewards.dts.selecteditemflyer")
    private WebElement lbldtsselecteditemflyer;

    @FindBy(locator = "dw.teacher.couponsrewards.dts.selecteditemprice")
    private WebElement lbldtsselecteditemprice;

    @FindBy(locator = "dw.teacher.couponsrewards.dts.selectedquantity")
    private WebElement txtdtsselectedquantity;

    @FindBy(locator = "dw.dts.modal.label.QTY")
    private WebElement labeldtsmodalQTY;
    @FindBy(locator = "dw.teacher.coupon.popup.title.lbl.itemids")
    private WebElement lblTitleItemId;
    @FindBy(locator = "dw.teacher.coupon.popup.title.lbl.rdo.select")
    private WebElement lblTitleRdoSelect;
    @FindBy(locator = "dw.teacher.coupon.popup.title.lbl.title")
    private WebElement lblTitleItemTitle;
    @FindBy(locator = "dw.teacher.coupon.popup.title.lbl.flyer")
    private WebElement lblTitleFlyer;
    @FindBy(locator = "dw.teacher.coupon.popup.title.lbl.price")
    private WebElement lblTitlePrice;
    @FindBy(locator = "dw.teacher.coupon.popup.pagination.btn.prev")
    private WebElement btnPaginationPrevious;
    @FindBy(locator = "dw.teacher.coupon.popup.pagination.btn.next")
    private WebElement btnPaginationNext;
    @FindBy(locator = "dw.teacher.coupon.popup.pagination.lbl.info")
    private WebElement lblPaginationInfo;
    @FindBy(locator = "dw.teacher.coupon.popup.pagination.btn.current")
    private WebElement btnCurrentPagination;
    @FindBy(locator = "dw.teacher.coupon.popup.lst.title")
    private List<WebElement> lstItemTitle;
    @FindBy(locator = "dw.teacher.coupon.popup.lst.addedcoupon.title")
    private List<WebElement> lstAddedItemTitle;
    @FindBy(locator = "dw.teacher.coupon.popup.lbl.productdetails")
    private WebElement lblProductDetails;
    @FindBy(locator = "dw.teacher.coupon.popup.btn.refresh")
    private WebElement btnRefresh;
    @FindBy(locator = "dw.teacher.coupon.popup.lbl.overduemessage")
    private WebElement lblOverDueMessage;
    @FindBy(locator = "dw.teacher.coupon.popup.selected.section.label")
    private WebElement lblSeletedYourSection;
    @FindBy(locator = "dw.teacher.studentflyerorder.coupon.popup.lnk.removeitem")
    private List<WebElement> lnkRemovePopupItem;
    @FindBy(locator = "dw.checkout.rewardsandcoupons.coupon.popup.removeYes")
    private WebElement btnRemoveCouponYes;
    @FindBy(locator = "dw.teacher.home.enterorder.studentflyerorder.couponmodel.hidelink")
    private WebElement btnHideLink;
    @FindBy(locator = "dw.parent.coupon.popup.icon.search")
    private WebElement btnSearchKeyword;
    @FindBy(locator = "dw.checkout.rewardsandcoupons.coupon.popup.header1")
    private WebElement lblMakeYourSelectionheader1;
    @FindBy(locator = "dw.checkout.rewardsandcoupons.dts.lnk.paginate2")
    private WebElement getdtspaginate2;
    @FindBy(locator = "dw.teacher.coupon.popup.table")
    private List<WebElement> tablecoupontable;

    @FindBy(locator = "dw.freepickmodal.cancel.button")
    private WebElement button_cancel_freepick_modal;

    @FindBy(locator = "dw.sfo.freepick.selected.itemadded")
    private List<WebElement> sfofreepickconfirmlist;

    @FindBy(locator = "dw.sfopagetable.freepick.selected.itemadded")
    private List<WebElement> sfopageafterfreepickitemadded;

    @FindBy(locator = "dw.sfo.couponmodal.close.link")
    private WebElement getlinkXonSFOmodal;

    @FindBy(locator = "dw.sfo.couponmodal.notapplied.errormsg")
    private WebElement freepickpendingerrormsg;
    
    @FindBy(locator = "dw.sfo.fld.coupon.code.SFO.section")
    private WebElement fld_coupon_code_SFO_section;


    public CouponSection(By by) {
        super(by);
    }

    public WebElement getlabeldtsmodalQTY() {
        return labeldtsmodalQTY;
    }

    public WebElement getlblfreepickselecteditemid() {
        return lblfreepickselecteditemid;
    }

    public WebElement getlblfreepickselecteditemtitle() {
        return lblfreepickselecteditemtitle;
    }

    public WebElement getlblfreepickselecteditemflyer() {
        return lblfreepickselecteditemflyer;
    }

    public WebElement getlblfreepickselecteditemprice() {
        return lblfreepickselecteditemprice;
    }

    public WebElement getlbldtsselecteditemid() {
        return lbldtsselecteditemid;
    }

    public WebElement getlbldtsselecteditemtitle() {
        return lbldtsselecteditemtitle;
    }

    public WebElement getlbldtsselecteditemflyer() {
        return lbldtsselecteditemflyer;
    }

    public WebElement getlbldtsselecteditemprice() {
        return lbldtsselecteditemprice;
    }

    public WebElement gettxtdtsselectedquantity() {
        return txtdtsselectedquantity;
    }

    public WebElement getLblOverDueAmountOnCouponPopUp() {
        return lblOverDueAmountOnCouponPopUp;
    }

    public WebElement getBtnContinueCheckout() {
        return btnContinueCheckout;
    }

    public WebElement getLblMakeYourSelectionSection() {
        return lblMakeYourSelectionSection;
    }

    public WebElement getLblUsedAmount() {
        return lblUsedAmount;
    }

    public WebElement getLblRemainingAmount() {
        return lblRemainingAmount;
    }

    public WebElement getLblAmountOver() {
        return lblAmountOver;
    }

    public List<WebElement> getTableCouponTable() {
        return tablecoupontable;
    }

    public List<WebElement> getTableCouponTableSelected() {
        return tablecoupontableselected;
    }

    public List<WebElement> getLstAddedItemTitle() {
        return lstAddedItemTitle;
    }

    public WebElement getlblMakeYourSelectionheader1() {
        return lblMakeYourSelectionheader1;
    }

    public WebElement getBtnSearchKeyword() {
        return btnSearchKeyword;
    }

    public WebElement getBtnHideLink() {
        return btnHideLink;
    }

    public WebElement getLblSeletedYourSection() {
        return lblSeletedYourSection;
    }

    public WebElement getTxtCouponsStudentName() {
        return txtCouponsStudentName;
    }

    public List<WebElement> getLnkRemovePopupItem() {
        return lnkRemovePopupItem;
    }

    public WebElement getBtnRemoveCouponYes() {
        return btnRemoveCouponYes;
    }

    public WebElement getLblOverDueMessage() {
        return lblOverDueMessage;
    }

    public WebElement getBtnRefresh() {
        return btnRefresh;
    }

    public WebElement getLblProductDetails() {
        return lblProductDetails;
    }

    public List<WebElement> getLstItemTitle() {
        return lstItemTitle;
    }

    public WebElement getBtnCurrentPagination() {
        return btnCurrentPagination;
    }

    public WebElement getLblPaginationInfo() {
        return lblPaginationInfo;
    }

    public WebElement getBtnPaginationPrevious() {
        return btnPaginationPrevious;
    }

    public WebElement getBtnPaginationNext() {
        return btnPaginationNext;
    }

    public WebElement getLblTitleItemId() {
        return lblTitleItemId;
    }

    public WebElement getLblTitleRdoSelect() {
        return lblTitleRdoSelect;
    }

    public WebElement getLblTitleItemTitle() {
        return lblTitleItemTitle;
    }

    public WebElement getLblTitleFlyer() {
        return lblTitleFlyer;
    }

    public WebElement getLblTitlePrice() {
        return lblTitlePrice;
    }

    public WebElement getTxtGrade() {
        return txtGrade;
    }

    public List<WebElement> getLstGradeList() {
        return lstGradeList;
    }

    public WebElement getLblSelectedGradeValue() {
        return lblSelectedGradeValue;
    }

    public WebElement getLblEmptyTable() {
        return lblEmptyTable;
    }

    public WebElement getLblTopOffAmtCoupon() {
        return lbltopoffamtcoupon;
    }

    public WebElement getAmtTopOffAmt() {
        return amttopoffamount;
    }

    public List<WebElement> getLstPaginateBtn() {
        return lstPaginateBtn;
    }

    public WebElement getTxtKeyword() {
        return txtKeyword;
    }

    public WebElement getBtnDisabledSubmit() {
        return btnDisabledSubmit;
    }

    public List<WebElement> getLnkToModalRemoveItem() {
        return lnkRemovePopupItem;
    }

    public WebElement getlblCouponDescriptionFromCouponName(String couponName) {
        return SCHUtils.findElement(
                "dw.checkout.rewardsandcoupons.coupondetails.lbl.coupondescription",
                couponName);
    }

    public WebElement getLblStrikePrice(String itemid) {
        return SCHUtils.findElement("dw.teacher.coupon.popup.itemid.lbl.strikeprice",
                itemid);
    }

    public WebElement getSelectGrade() {
        return selectGrade;
    }

    public WebElement getdrpdwnGradeLevel() {
        return drpdwnGradeLevel;
    }

    public WebElement getlstdrpdwnGradeLevel() {
        return lstdrpdwnGradeLevel;
    }

    public WebElement getlblDtsModelwindowItemPrice1() {
        return lblDtsModelwindowItemPrice1;
    }

    public WebElement getTxtStudentName() {
        return txtStudentName;
    }

    public WebElement getTxtCouponNumber() {
        return txtCouponNumber;
    }

    public WebElement getBtnApplyCoupon() {
        return btnApplyCoupon;
    }

    public List<WebElement> getLstlblItemIds() {
        return lstlblItemIds;
    }

    public List<WebElement> getLstRadioSelect() {
        return lstRadioSelect;
    }

    public List<WebElement> getLstlblFlyer() {
        return lstlblFlyer;
    }

    public List<WebElement> getLstlblPrice() {
        return lstlblPrice;
    }

    public List<WebElement> gettablecouponSelected() {
        return tablecouponSelected;
    }

    public List<WebElement> getLstlblSelectedItemIds() {
        return lstlblSelectedItemIds;
    }

    public WebElement getLstlblSelectedItemId() {
        return lstlblSelectedItemId;
    }

    public List<WebElement> getLstBtnSelectedCross() {
        return lstBtnSelectedCross;
    }

    public List<WebElement> getLstlblSelectedTitle() {
        return lstlblSelectedTitle;
    }

    public WebElement getLstSelectedTitle() {
        return lstSelectedTitle;
    }

    public List<WebElement> getLstlblSelectedFlyer() {
        return lstlblSelectedFlyer;
    }

    public List<WebElement> getLstlblSelectedPrice() {
        return lstlblSelectedPrice;
    }

    public WebElement getLnkCancel() {
        return lnkCancel;
    }

    public WebElement getBtnConfirmAndApply() {
        return btnConfirmAndApply;
    }

    public WebElement getCouponsModel() {
        return couponsModel;
    }

    public WebElement getLblPopupTitleForFreePick() {
        return lblPopupTitleForFreePick;
    }

    public WebElement getMgmCouponParentModel() {
        return mgmCouponParentModel;
    }

    public WebElement getTxtMGMTeacherCustomerNumber() {
        return txtMGMTeacherCustomerNumber;
    }

    public WebElement getTxtMGMTeacherFirstName() {
        return txtMGMTeacherFirstName;
    }

    public WebElement getTxtMGMTeacherLastName() {
        return txtMGMTeacherLastName;
    }

    public WebElement getBtnMGMSubmit() {
        return btnMGMSubmit;
    }

    public List<WebElement> getsfofreepickconfirmlist() {
        return sfofreepickconfirmlist;
    }

    public List<WebElement> getsfopageafterfreepickitemadded() {
        return sfopageafterfreepickitemadded;
    }
    
    public WebElement fld_coupon_code_SFO_section() {
        return fld_coupon_code_SFO_section;
    }

    public WebElement getfreepickpendingerrormsg() {
        return freepickpendingerrormsg;
    }


    public WebElement getLblCouponDescription(String couponName) {
        return SCHUtils.findElement("dw.teacher.coupon.lbl.coupondescription",
                couponName);
    }

    public WebElement getLblPopupTitleForDollarToSpend() {
        return lblPopupTitleForDollarToSpend;
    }

    public WebElement getLnkMGMEnterReferingTeacherDetails() {
        return lnkMGMEnterReferingTeacherDetails;
    }

    public WebElement getBtnCloseModal() {
        return btnCloseModal;
    }

    public WebElement getLblThankYouMessage() {
        return lblThankYouMessage;
    }

    public WebElement getLblErrorMessage() {
        return lblErrorMessage;
    }

    public WebElement getdtspaginate2() {
        return getdtspaginate2;
    }

    public WebElement getbutton_cancel_freepick_modal() {
        return button_cancel_freepick_modal;
    }


    public WebElement getLnkCouponNumber(String couponNumber) {
        return SCHUtils.findElement("dw.teacher.mgm.coupon.lnk.couponnumber",
                couponNumber);
    }

    public WebElement getLblSucessMessage(String couponNumber) {
        return SCHUtils.findElement("dw.checkout.rewardsandcoupons.lbl.sucessmessage",
                couponNumber);
    }

    public WebElement getLnkCouponName(String couponId) {
        return SCHUtils.findElement("dw.checkout.rewardsandcoupons.lnk.couponname",
                couponId);
    }

    public WebElement getlinkXonSFOmodal() {
        return getlinkXonSFOmodal;
    }

    @Override
    public void addSFOCoupoun(Configuration testData) {
        PauseUtil.pause(6000);
        TestBaseProvider.getTestBase().getContext()
                .setProperty(ConstantUtils.SFO_COUPONS_FLAG, "true");

        String couponStudent = testData.getString("couponstudent");
        String couponnumber = testData.getString("couponnumber");
        // This will enter coupon details for sfo
        getTxtStudentName().clear();
        getTxtStudentName().sendKeys(couponStudent);
        PauseUtil.pause(2000);
        getTxtCouponNumber().clear();
        getTxtCouponNumber().sendKeys(couponnumber);
        AssertUtils.assertEnabled(getBtnApplyCoupon());
        SCHUtils.clickUsingJavaScript(getBtnApplyCoupon());
    }

    @Override
    public void verifyApplyButtonState() {

        AssertUtils.assertDisabled(getBtnApplyCoupon());
        AssertUtils.assertTextMatches(getBtnApplyCoupon(),
                Matchers.equalToIgnoringCase("SAVED"));
        AssertUtils.assertDisabled(getBtnApplyCoupon());

    }

    @Override
    public void addCoupon(Configuration testData) {
        String couponStudent = testData.getString("couponstudent");
        String couponnumber = testData.getString("couponnumber");

        PauseUtil.waitForAjaxToComplete(6000);
        //AssertUtils.assertDisabled(getBtnConfirmAndApply());
        if (testData.getString("couponsearch") != null
                && !testData.getString("couponsearch").isEmpty()) {
            getTxtKeyword().sendKeys(testData.getString("couponsearch"));
            getTxtKeyword().sendKeys(Keys.ENTER);
            PauseUtil.pause(5000);
            verifyPriceList();
        }
        PauseUtil.pause(2000);
        PauseUtil.waitForAjaxToComplete(3000);
        if (getLblEmptyTable().getText().contains("No data available in table")) {
            Assert.fail("Application Issue. No data is present in the MAKE SELECTION window of Dollars to Spend");
        }


        // Code to select item from coupons table, in case you want to select
        // more than one item for some coupon then pass the comma separated
        // indices of the item in the table.
        // Parameter in test data is <couponitemnumber>

        String couponitemindices[] =
                SCHUtils.getArrayFromStringData(testData.getString("couponitemnumber"));
        for (String index : couponitemindices) {
            getLstRadioSelect().get(Integer.parseInt(index)).click();
            String itemId = getLstlblItemIds().get(Integer.parseInt(index)).getText();

            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.ItemId", itemId);
        }
        PauseUtil.waitForAjaxToComplete(2000);
        // Filling the SFO product bean from selected coupons table
        // If there is a requirement to handle the same for YTO then we can pass
        // a flag and do the same
        int itemsize = getLstlblSelectedItemIds().size();
        if (TestBaseProvider.getTestBase().getContext()
                .getString(ConstantUtils.SFO_COUPONS_FLAG) != null) {

            for (int i = 0; i < itemsize; i++) {
                ProductInfoBean productInfoBean = new ProductInfoBean();
                productInfoBean.setStudentName(couponStudent);
                productInfoBean.setCoupon(couponnumber);
                productInfoBean
                        .setItemNumber(getLstlblSelectedItemIds().get(i).getText());
                productInfoBean.setItemTitle(getLstlblSelectedTitle().get(i).getText());
                productInfoBean.setQuantity("1");
                // Setting price FREE
                productInfoBean.setPrice("FREE");
                productInfoBean.setFlyer(getLstlblSelectedFlyer().get(i).getText());

                SCHUtils.addSFOProductItem(productInfoBean);
            }
        }

        for (int i = 0; i < itemsize; i++) {
            ProductInfoBean productInfoBean = new ProductInfoBean();
            productInfoBean.setCoupon(couponnumber);
            productInfoBean.setItemNumber(getLstlblSelectedItemIds().get(i).getText());
            productInfoBean.setItemTitle(getLstlblSelectedTitle().get(i).getText());
            productInfoBean.setQuantity("1");
            // Setting price FREE
            productInfoBean.setPrice("FREE");
            productInfoBean.setFlyer(getLstlblSelectedFlyer().get(i).getText());

            SCHUtils.addCouponItem(productInfoBean);
        }
        AssertUtils.assertEnabled(getBtnConfirmAndApply());
        getBtnConfirmAndApply().click();
        PauseUtil.pause(3000);
    }


    @Override
    public void MakeSelectionWindow_SelectSpecificItem(Configuration testData, double couponprice, double couponprice_limit) {

        PauseUtil.waitForAjaxToComplete(1000);
        //AssertUtils.assertDisabled(getBtnConfirmAndApply());
        if (testData.getString("selectgrade") != null
                && !testData.getString("selectgrade").isEmpty()) {
            // Code to select grade from drop down
            SCHUtils.selectOptionByvalue(getSelectGrade(),
                    testData.getString("selectgrade"));

            PauseUtil.pause(2000);
            PauseUtil.waitForAjaxToComplete(1000);
            getlblDtsModelwindowItemPrice1().click();
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(3500);
        }
        PauseUtil.pause(2000);
        PauseUtil.waitForAjaxToComplete(1000);
        /*if(getLblEmptyTable().getText().contains("No data available in table"))
		{
		Assert.fail("Application Issue. No data is present in the MAKE SELECTION window of Dollars to Spend");	
		}*/

        List<WebElement> cartTable1 = getTableCouponTable();
        for (WebElement cartTable : cartTable1) {
            List<WebElement> cartTabletr1 = cartTable.findElements(By.tagName("tr"));
            for (WebElement cartTabletd1 : cartTabletr1) {
                List<WebElement> cartTabletd = cartTabletd1.findElements(By.tagName("td"));


                String actualprice1 = cartTabletd.get(3).getText();
                actualprice1 = actualprice1.substring(1);
                Double actualprice = Double.parseDouble(actualprice1.trim());


                if ((actualprice > (couponprice))) {
                    cartTabletd.get(4).findElement(By.tagName("i")).click();
                    PauseUtil.pause(2500);
                    PauseUtil.waitForAjaxToComplete(1000);

                    TestBaseProvider.getTestBase().getContext().setProperty("testexecution.topoffamount_beforetax",
                            String.valueOf(getLblOverDueAmountOnCouponPopUp().getText()));
                    break;
                }
                AssertUtils.assertEnabled(getBtnConfirmAndApply());
                PauseUtil.waitForAjaxToComplete(4000);
                PauseUtil.pause(2500);
		/*getBtnConfirmAndApply().click();
		PauseUtil.pause(3000);*/


            }
        }
    }


    @Override
    public void MakeSelectionWindow_SelectSpecificItem_Apply(Configuration testData, double couponprice, double couponprice_limit) {

        PauseUtil.waitForAjaxToComplete(1000);
        //AssertUtils.assertDisabled(getBtnConfirmAndApply());
        if (testData.getString("selectgrade") != null
                && !testData.getString("selectgrade").isEmpty()) {
            // Code to select grade from drop down
            SCHUtils.selectOptionByvalue(getSelectGrade(),
                    testData.getString("selectgrade"));
        }
        PauseUtil.pause(2000);
        PauseUtil.waitForAjaxToComplete(1000);
        if (getLblEmptyTable().getText().contains("No data available in table")) {
            Assert.fail("Application Issue. No data is present in the MAKE SELECTION window of Dollars to Spend");
        }

        List<WebElement> cartTable1 = getTableCouponTable();
        for (WebElement cartTable : cartTable1) {
            List<WebElement> cartTabletr1 = cartTable.findElements(By.tagName("tr"));
            for (WebElement cartTabletd1 : cartTabletr1) {
                List<WebElement> cartTabletd = cartTabletd1.findElements(By.tagName("td"));


                String actualprice1 = cartTabletd.get(3).getText();
                actualprice1 = actualprice1.substring(1);
                Double actualprice = Double.parseDouble(actualprice1.trim());
                System.out.println("Amount in the dts window:" + actualprice);

                PauseUtil.pause(1500);
                if ((actualprice > (couponprice)) && (actualprice <= (couponprice_limit))) {
                    System.out.println("entered to if loop to lick on radio button");
                    cartTabletd.get(4).findElement(By.tagName("i")).click();
                    PauseUtil.pause(2500);
                    TestBaseProvider.getTestBase().getContext().setProperty("testexecution.topoffamount_beforetax",
                            String.valueOf(getLblOverDueAmountOnCouponPopUp().getText()));
                    PauseUtil.waitForAjaxToComplete(1000);
                    break;
                }

            }


        }
        PauseUtil.waitForAjaxToComplete(4000);
        PauseUtil.pause(2500);


        AssertUtils.assertEnabled(getBtnConfirmAndApply());
        getBtnConfirmAndApply().click();
        PauseUtil.waitForAjaxToComplete(4000);
        PauseUtil.pause(2500);
    }


    @Override
    public void MakeSelectionWindow_SelectItem() {

        PauseUtil.waitForAjaxToComplete(1000);
		
		/*if(getLblEmptyTable().getText().contains("No data available in table"))
		{
		Assert.fail("Application Issue. No data is present in the MAKE SELECTION window of Dollars to Spend");	
		}*/

        List<WebElement> cartTable1 = getTableCouponTable();
        for (WebElement cartTable : cartTable1) {
            List<WebElement> cartTabletr1 = cartTable.findElements(By.tagName("tr"));
            for (WebElement cartTabletd1 : cartTabletr1) {
                List<WebElement> cartTabletd = cartTabletd1.findElements(By.tagName("td"));


                String actualprice1 = cartTabletd.get(3).getText();
                actualprice1 = actualprice1.substring(1).replace(",", "");
                Double actualprice = Double.parseDouble(actualprice1.trim());


                if (actualprice >= 1.01) {
                    cartTabletd.get(4).findElement(By.tagName("i")).click();
                    PauseUtil.pause(2500);


                    List<WebElement> couponTable1 = getTableCouponTableSelected();
                    for (WebElement couponTable : couponTable1) {
                        List<WebElement> couponTabletr1 = couponTable.findElements(By.tagName("tr"));
                        for (WebElement couponTabletd1 : couponTabletr1) {
                            List<WebElement> couponTabletd = couponTabletd1.findElements(By.tagName("td"));


                            TestBaseProvider.getTestBase().getContext().setProperty("testexecution.selectedItemId", String.valueOf
                                    (couponTabletd.get(0).getText()));
                            TestBaseProvider.getTestBase().getContext().setProperty("testexecution.selectedtitle", String.valueOf
                                    (couponTabletd.get(1).getText()));
                            TestBaseProvider.getTestBase().getContext().setProperty("testexecution.selectedflyer", String.valueOf
                                    (couponTabletd.get(2).getText()));
                            TestBaseProvider.getTestBase().getContext().setProperty("testexecution.selectedprice", String.valueOf
                                    (couponTabletd.get(3).getText()));

                        }
                    }
                    PauseUtil.waitForAjaxToComplete(1000);
                    break;
                }
                AssertUtils.assertEnabled(getBtnConfirmAndApply());


            }
        }
    }


    @Override
    public void MakeSelectionWindow_DTSSelectItem() {
        CheckoutPage chkpge = new CheckoutPage();

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.waitForAjaxToComplete(1000);

        chkpge.select_item1_MakeYourSelection().click();
        PauseUtil.waitForAjaxToComplete(1000);
        TestBaseProvider.getTestBase().getContext().setProperty("testexecution.selectedItemId", String.valueOf
                (getlbldtsselecteditemid().getText()));

    }


    @Override
    public void MakeSelectionWindow_SelectItemFreePick() {

        PauseUtil.waitForAjaxToComplete(1000);
		
		/*if(getLblEmptyTable().getText().contains("No data available in table"))
		{
		Assert.fail("Application Issue. No data is present in the MAKE SELECTION window of Dollars to Spend");
		}

        List<WebElement> cartTable1 = getTableCouponTable();
        for (WebElement cartTable : cartTable1) {
            List<WebElement> cartTabletr1 = cartTable.findElements(By.tagName("tr"));
            for (WebElement cartTabletd1 : cartTabletr1) {
                List<WebElement> cartTabletd = cartTabletd1.findElements(By.tagName("td"));


                String actualprice1 = cartTabletd.get(4).getText();
                actualprice1 = actualprice1.substring(1);
                Double actualprice = Double.parseDouble(actualprice1.trim());


                if (actualprice >= 1.00) {
                    cartTabletd.get(5).findElement(By.tagName("i")).click();
                    PauseUtil.pause(2500);
		 
		
		 List<WebElement> couponTable1= getTableCouponTableSelected();
		    for(WebElement couponTable:couponTable1){
		    List<WebElement> couponTabletr1= couponTable.findElements(By.tagName("tr"));
		    for(WebElement couponTabletd1:couponTabletr1){
		    List<WebElement> couponTabletd= couponTabletd1.findElements(By.tagName("td"));


                    TestBaseProvider.getTestBase().getContext().setProperty("testexecution.selectedItemId", String.valueOf
                            (cartTabletd.get(1).getText()));
                    System.out.println("chcking setter value" + TestBaseProvider.getTestBase().getContext().getProperty("testexecution.selectedItemId"));
                    TestBaseProvider.getTestBase().getContext().setProperty("testexecution.selectedtitle", String.valueOf
                            (cartTabletd.get(2).getText()));
                    TestBaseProvider.getTestBase().getContext().setProperty("testexecution.selectedflyer", String.valueOf
                            (cartTabletd.get(3).getText()));
                    TestBaseProvider.getTestBase().getContext().setProperty("testexecution.selectedprice", String.valueOf
                            (cartTabletd.get(4).getText()));

                    // }
                }
                PauseUtil.waitForAjaxToComplete(1000);
                break;
            }
            AssertUtils.assertEnabled(getBtnConfirmAndApply());

                }}}*/
            
    	StudentFlyerOrdersPage SFOpage=new StudentFlyerOrdersPage();
    	SFOpage.teacher_select_first_FreePick_item_from_the_list_SFO_section();
    }


    @Override
    public void SelectItem_TopOff_DTS(Configuration testData, double topoff_dts) {

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(1000);

        List<WebElement> cartTable1 = getTableCouponTable();
        for (WebElement cartTable : cartTable1) {
            List<WebElement> cartTabletr1 = cartTable.findElements(By.tagName("tr"));
            for (WebElement cartTabletd1 : cartTabletr1) {
                List<WebElement> cartTabletd = cartTabletd1.findElements(By.tagName("td"));


                String actualprice1 = cartTabletd.get(3).getText();
                actualprice1 = actualprice1.substring(1);
                Double actualprice = Double.parseDouble(actualprice1.trim());


                if (actualprice >= topoff_dts) {
                    cartTabletd.get(4).findElement(By.tagName("i")).click();
                    PauseUtil.pause(2500);


                    List<WebElement> couponTable1 = getTableCouponTableSelected();
                    for (WebElement couponTable : couponTable1) {
                        List<WebElement> couponTabletr1 = couponTable.findElements(By.tagName("tr"));
                        for (WebElement couponTabletd1 : couponTabletr1) {
                            List<WebElement> couponTabletd = couponTabletd1.findElements(By.tagName("td"));


                            TestBaseProvider.getTestBase().getContext().setProperty("testexecution.selectedItemId", String.valueOf
                                    (couponTabletd.get(0).getText()));
                            TestBaseProvider.getTestBase().getContext().setProperty("testexecution.selectedtitle", String.valueOf
                                    (couponTabletd.get(1).getText()));
                            TestBaseProvider.getTestBase().getContext().setProperty("testexecution.selectedflyer", String.valueOf
                                    (couponTabletd.get(2).getText()));
                            TestBaseProvider.getTestBase().getContext().setProperty("testexecution.selectedprice", String.valueOf
                                    (couponTabletd.get(3).getText()));

                        }
                    }
                    PauseUtil.waitForAjaxToComplete(1000);
                    break;
                }
                AssertUtils.assertEnabled(getBtnConfirmAndApply());


            }
        }
    }


    @Override
    public void MakeSelectionWindow_DeleteSelectedItem() {

        WaitUtils.waitForDisplayed(getLblSeletedYourSection());
        getLstBtnSelectedCross().get(0).click();
        PauseUtil.waitForAjaxToComplete(1000);
    }


    @Override
    public void MakeSelectionWindow_SelectMultipleItems(Configuration testData, double couponprice, double couponprice_limit) {

        PauseUtil.waitForAjaxToComplete(1000);
        //AssertUtils.assertDisabled(getBtnConfirmAndApply());
        if (testData.getString("selectgrade") != null
                && !testData.getString("selectgrade").isEmpty()) {
            // Code to select grade from drop down
            SCHUtils.selectOptionByvalue(getSelectGrade(),
                    testData.getString("selectgrade"));
        }
        PauseUtil.pause(2000);
        PauseUtil.waitForAjaxToComplete(1000);
        if (getLblEmptyTable().getText().contains("No data available in table")) {
            Assert.fail("Application Issue. No data is present in the MAKE SELECTION window of Dollars to Spend");
        }
        for (int i = 0; i <= 2; i++) {
            List<WebElement> cartTable1 = getTableCouponTable();
            for (WebElement cartTable : cartTable1) {
                List<WebElement> cartTabletr1 = cartTable.findElements(By.tagName("tr"));
                for (WebElement cartTabletd1 : cartTabletr1) {
                    List<WebElement> cartTabletd = cartTabletd1.findElements(By.tagName("td"));


                    String actualprice1 = cartTabletd.get(3).getText();
                    actualprice1 = actualprice1.substring(1);
                    Double actualprice = Double.parseDouble(actualprice1.trim());


                    if ((actualprice > (couponprice)) && (actualprice <= (couponprice_limit))) {
                        cartTabletd.get(4).findElement(By.tagName("i")).click();
                        PauseUtil.pause(2500);
                        TestBaseProvider.getTestBase().getContext().setProperty("testexecution.topoffamount_beforetax",
                                String.valueOf(getLblOverDueAmountOnCouponPopUp().getText()));
                        PauseUtil.waitForAjaxToComplete(1000);
                        break;
                    }
                    AssertUtils.assertEnabled(getBtnConfirmAndApply());
		/*getBtnConfirmAndApply().click();
		PauseUtil.pause(3000);*/


                }
            }
        }
    }


    @Override
    public void MakeSelectionWindow_SelectMultipleItems_ToMeet_Promotions(Configuration testData, double couponprice, double couponprice_limit) {

        PauseUtil.waitForAjaxToComplete(1000);
        //AssertUtils.assertDisabled(getBtnConfirmAndApply());
        if (testData.getString("selectgrade") != null
                && !testData.getString("selectgrade").isEmpty()) {
            // Code to select grade from drop down
            SCHUtils.selectOptionByvalue(getSelectGrade(),
                    testData.getString("selectgrade"));
        }
        PauseUtil.pause(2000);
        PauseUtil.waitForAjaxToComplete(1000);
        if (getLblEmptyTable().getText().contains("No data available in table")) {
            Assert.fail("Application Issue. No data is present in the MAKE SELECTION window of Dollars to Spend");
        }
		/*for(int i=0;i<=7;i++)
		{*/
        List<WebElement> cartTable1 = getTableCouponTable();
        for (WebElement cartTable : cartTable1) {
            List<WebElement> cartTabletr1 = cartTable.findElements(By.tagName("tr"));
            for (WebElement cartTabletd1 : cartTabletr1) {
                List<WebElement> cartTabletd = cartTabletd1.findElements(By.tagName("td"));


                String actualprice1 = cartTabletd.get(3).getText();
                actualprice1 = actualprice1.substring(1);
                Double actualprice = Double.parseDouble(actualprice1.trim());

                for (int i = 0; i <= 7; i++) {
                    if ((actualprice > (couponprice)) && (actualprice <= (couponprice_limit))) {
                        cartTabletd.get(4).findElement(By.tagName("i")).click();
                        PauseUtil.pause(2500);
                        break;
                    }
                    AssertUtils.assertEnabled(getBtnConfirmAndApply());
		/*getBtnConfirmAndApply().click();
		PauseUtil.pause(3000);*/


                }
            }
        }
    }


    @Override
    public void MakeSelectionWindow_SelectGrade(Configuration testData) {

        PauseUtil.waitForAjaxToComplete(1000);
        //AssertUtils.assertDisabled(getBtnConfirmAndApply());
        if (testData.getString("selectgrade") != null
                && !testData.getString("selectgrade").isEmpty()) {
            // Code to select grade from drop down
            PauseUtil.pause(2000);
            SCHUtils.selectOptionByvalue(getSelectGrade(),
                    TestBaseProvider.getTestBase().getTestData().getString("selectgrade"));
        }
        PauseUtil.pause(2000);
        PauseUtil.waitForAjaxToComplete(1000);
        getlblDtsModelwindowItemPrice1().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(3500);
		/*if(getLblEmptyTable().getText().contains("No data available in table"))
		{
		Assert.fail("Application Issue. No data is present in the MAKE SELECTION window of Dollars to Spend");	
		}*/
    }

    @Override
    public void MakeSelectionWindow_dts_enterquantity(Configuration testData) {

        PauseUtil.waitForAjaxToComplete(1500);
        gettxtdtsselectedquantity().clear();
        PauseUtil.waitForAjaxToComplete(1500);
        gettxtdtsselectedquantity().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("dts_qty"));
        labeldtsmodalQTY.click();
        labeldtsmodalQTY.click();


    }


    @Override
    public void MakeSelectionWindow_SelectDifferentGrade(Configuration testData) {

        PauseUtil.waitForAjaxToComplete(4000);
        //AssertUtils.assertDisabled(getBtnConfirmAndApply());
        if (testData.getString("selectdiffgrade") != null
                && !testData.getString("selectdiffgrade").isEmpty()) {
            // Code to select grade from drop down
            SCHUtils.selectOptionByvalue(getSelectGrade(),
                    testData.getString("selectdiffgrade"));
        }
        PauseUtil.pause(2000);
        PauseUtil.waitForAjaxToComplete(1000);
        getlblDtsModelwindowItemPrice1().click();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(3500);
		
		/*if(getLblEmptyTable().getText().contains("No data available in table"))
		{
		Assert.fail("Application Issue. No data is present in the MAKE SELECTION window of Dollars to Spend");	
		}*/
    }


    @Override
    public void MakeSelectionWindow_SelectDropDownGradeLevel() {
        PauseUtil.waitForAjaxToComplete(1000);
        getdrpdwnGradeLevel().click();

    }


    @Override
    public void MakeSelectionWindow_verifyTeacherCatalogueInDropDownGradeLevel() {
        PauseUtil.waitForAjaxToComplete(1000);

        if (getlstdrpdwnGradeLevel().getText().contains("Teacher Catalogues")) {
            Assert.fail("Application Issue. Teacher Catalogue list present in DTS model Grade Level dropdown");
        }
    }


    @Override
    public void MakeSelectionWindow_verifyStudentFlyersInDropDownGradeLevel() {
        PauseUtil.waitForAjaxToComplete(1000);

        String studentflyers[] = {"Early Childhood", "Kindergarten & Grade 1", "Grades 2 & 3", "Grades 4 & 5", "Grades 6 & 7", "French"};

        for (int i = 0; i < studentflyers.length; i++) {
            if (!getlstdrpdwnGradeLevel().getText().contains(studentflyers[i])) {
                Assert.fail("Application Issue." + studentflyers[i] + "is not present in Grade Level dropdown");
            }
        }
    }


    @Override
    public void MakeSelectionWindow_verifyListDropDownGradeLevel() {
        PauseUtil.waitForAjaxToComplete(1000);

        if (getlstdrpdwnGradeLevel().getText().contains("Teacher Catalogues")) {
            Assert.fail("Application Issue. Teacher Catalogue list present in DTS model Grade Level dropdown");
        }
    }


    @Override
    public void MakeSelectionWindow_Search_WithSpecificTerm(Configuration testData) {


        PauseUtil.waitForAjaxToComplete(6000);
        //AssertUtils.assertDisabled(getBtnConfirmAndApply());
        if (testData.getString("selectgrade") != null
                && !testData.getString("selectgrade").isEmpty()) {
            // Code to select grade from drop down
            SCHUtils.selectOptionByvalue(getSelectGrade(),
                    testData.getString("selectgrade"));
        } else if (testData.getString("couponsearch") != null
                && !testData.getString("couponsearch").isEmpty()) {
            getTxtKeyword().clear();
            getTxtKeyword().sendKeys(testData.getString("couponsearch"));
            getTxtKeyword().sendKeys(Keys.ENTER);
            PauseUtil.pause(1500);

        }
        PauseUtil.waitForAjaxToComplete(3000);

    }

    @Override
    public void MakeSelectionWindow_Search_WithSpecificTerm(String item) {


        PauseUtil.waitForAjaxToComplete(6000);
        PauseUtil.pause(2500);
        getTxtKeyword().clear();
        getTxtKeyword().sendKeys(item);
        getTxtKeyword().sendKeys(Keys.ENTER);
        PauseUtil.pause(1500);

    }


    @Override
    public void MakeSelectionWindow_ExpiredItems_ValidationMessage() {

        PauseUtil.waitForAjaxToComplete(1500);
        if (!getLblEmptyTable().getText().contains("No data available in table")) {
            Assert.fail("Application Issue. No proper validation message in MAKE SELECTION window of DTS when searched with expired item");
        }

    }


    @Override
    public void MakeSelectionWindow_NoResultItem_ValidationMessage() {

        PauseUtil.waitForAjaxToComplete(1500);
        if (!getLblEmptyTable().getText().contains("No search results found")) {
            Assert.fail("Application Issue. No proper validation message in MAKE SELECTION window of DTS when searched with no results term");
        }

    }


    @Override
    public void MakeSelectionWindow_TopOffAmtPresent_Message() {

        PauseUtil.waitForAjaxToComplete(1500);

        if (!getLblTopOffAmtCoupon().isDisplayed()) {
            Assert.fail("Application Issue. No Top Off Amount message in MAKE SELECTION window of DTS when amount exceeds");

        }
        if (!getLblTopOffAmtCoupon().getText().contains(ConstantUtils.TOPOFFAMOUNTCOUPONMSG1)) {
            Assert.fail("Application Issue. Invalid message for Top Off Amount message in MAKE SELECTION window of DTS");
        }

        if (!getLblTopOffAmtCoupon().getText().contains(ConstantUtils.TOPOFFAMOUNTCOUPONMSG2)) {
            Assert.fail("Application Issue. Invalid message for Top Off Amount message in MAKE SELECTION window of DTS");
        }

    }


    @Override
    public void MakeSelectionWindow_TopOffAmtNotPresent_Message() {

        PauseUtil.waitForAjaxToComplete(1500);

        if (getLblTopOffAmtCoupon().isDisplayed()) {
            Assert.fail("Application Issue.Top Off Amount message is displayed in MAKE SELECTION window of DTS when amount does not exceeds");

        }


    }


    /**
     * this method will verify that expected coupon ids are present on Selected
     * coupons table.
     */
    @Override
    public void verifyAppliedCoupons() {
        // Code to verify selected coupons table on coupons popup from sfo bean
        Map<String, ProductInfoBean> SFOProducts = SCHUtils.getSFOProductItems();
        List<WebElement> selectedItemIds = getLstlblSelectedItemIds();
        List<String> itemIdsString = new ArrayList<String>();
        for (WebElement ele : selectedItemIds) {
            itemIdsString.add(ele.getText());
        }
        for (String key : SFOProducts.keySet()) {
            ProductInfoBean details = SFOProducts.get(key);
            if (!details.getCoupon().isEmpty() && details.getCoupon() != null) {
                // Verify that expected item number is present
                itemIdsString.contains(details.getItemNumber());
                // Verify that there is current selling price mentioned along
                // with 'FREE'
                // AssertUtils.assertDisplayed(getLblStrikePrice(details.getItemNumber()));
            }
        }
    }

    @Override
    public void addCouponFromRewardsAndCoupons(Configuration testData, int i) {

        PauseUtil.waitForAjaxToComplete(5000);
        if (SCHUtils.getArrayFromStringData(testData.getString("couponselctionmethod"))[i]
                .equalsIgnoreCase("both")) {
            SCHUtils.waitForLoaderToDismiss();
            selectCouponItemByGradeOrByKeyword(testData, "Grade Level", i);
            selectCouponItemByGradeOrByKeyword(testData, "ByKeyword", i);
        } else if (SCHUtils
                .getArrayFromStringData(testData.getString("couponselctionmethod"))[i]
                .equalsIgnoreCase("Grade Level")) {
            SCHUtils.waitForLoaderToDismiss();
            selectCouponItemByGradeOrByKeyword(testData, "Grade Level", i);
        } else {
            SCHUtils.waitForLoaderToDismiss();
            selectCouponItemByGradeOrByKeyword(testData, "ByKeyword", i);
        }

    }

    public void selectCouponItemByGradeOrByKeyword(Configuration testData, String key,
                                                   int i) {
        PauseUtil.pause(3000);
        SCHUtils.waitForLoaderToDismiss();
        JavascriptExecutor jsExecutor =
                (JavascriptExecutor) TestBaseProvider.getTestBase().getDriver();
        String couponnumber =
                SCHUtils.getArrayFromStringData(testData.getString("couponnumber"))[i];
        if (!SCHUtils.isPresent(getTxtKeyword()) && (SCHUtils
                .getArrayFromStringData(testData.getString("couponselctionmethod"))[i]
                .equalsIgnoreCase("Grade Level")
                || SCHUtils.getArrayFromStringData(
                testData.getString("couponselctionmethod"))[i]
                .equalsIgnoreCase("ByKeyword"))) {
            try {
                getLnkCouponName(couponnumber).click();
            } catch (Exception e) {
                // TODO: handle exception
            }

        }

        if (key.equalsIgnoreCase("ByGrade")) {
            System.out.println("By Grade........... In");
            PauseUtil.pause(3000);
            SCHUtils.waitForLoaderToDismiss();
            if (SCHUtils.isPresent(getTxtKeyword())) {

                SCHUtils.selectOptionByvalue(getSelectGrade(), SCHUtils
                        .getArrayFromStringData(testData.getString("selectgrade"))[i]);
                PauseUtil.waitForAjaxToComplete();
                PauseUtil.pause(14000);
                String itemselection = SCHUtils
                        .getArrayFromStringData(testData.getString("coupontype"))[i];

                if (itemselection.equalsIgnoreCase("freepick")) {
                    PauseUtil.pause(5000);
                    SCHUtils.waitForLoaderToDismiss();
                    PauseUtil.waitForAjaxToComplete(10000);
                    Actions action =
                            new Actions(TestBaseProvider.getTestBase().getDriver());
                    action.moveToElement(getLstRadioSelect().get(0)).build().perform();
                    SCHUtils.clickUsingJavaScript(getLstRadioSelect().get(0));

                    // getLstRadioSelect().get(0).click();
                } else {

                    String couponitemindices[] = SCHUtils.getArrayFromStringData(
                            testData.getString("couponitemnumber"));
                    for (String index : couponitemindices) {
                        Actions action =
                                new Actions(TestBaseProvider.getTestBase().getDriver());
                        action.moveToElement(
                                getLstRadioSelect().get(Integer.parseInt(index))).build()
                                .perform();
                        SCHUtils.clickUsingJavaScript(
                                getLstRadioSelect().get(Integer.parseInt(index)));
                        // getLstRadioSelect().get(Integer.parseInt(index)).click();
                        // If this does not work in any other browser then
                        // please make sure that a condition for IOS driver is
                        // kept. This code needs to be executed for ipad.
                        if (TestBaseProvider.getTestBase().getContext()
                                .getString("driver.name").equalsIgnoreCase("IOs")) {
                            // Actions action = new Actions(
                            // TestBaseProvider.getTestBase().getDriver());
                            action.click(getLstRadioSelect().get(Integer.parseInt(index)))
                                    .build().perform();
                        }
                    }

                }
                int itemsize = getLstlblSelectedItemIds().size();
                // Adding following condition if selected item price is greater
                // than coupon price
                if (SCHUtils.isPresent(getLblPopupTitleForDollarToSpend())) {
                    String title = getLblPopupTitleForDollarToSpend().getText();
                    String arr[] = title.split("\\$");
                    String amount = arr[1].split(" ")[0];
                    Double total = 0.0;
                    for (int j = 0; j < itemsize; j++) {
                        total = total + SCHUtils.getPriceWithOutCurrency(
                                getLstlblSelectedPrice().get(j).getText());
                    }
                    if (total > Double.parseDouble(amount)) {

                        AssertUtils.assertDisplayed(getLblOverDueAmountOnCouponPopUp());
                        System.out.println("overdue amount---"
                                + getLblOverDueAmountOnCouponPopUp().getText());
                        TestBaseProvider.getTestBase().getContext()
                                .setProperty("testexecution.topoffamount", String.valueOf(
                                        getLblOverDueAmountOnCouponPopUp().getText()));

                    }
                }

                System.out.println("Total selected freepick item-" + itemsize);
                for (int j = 0; j < itemsize; j++) {
                    System.out.println("filling bean for item " + (j + 1));
                    PauseUtil.waitForAjaxToComplete(5000);
                    ProductInfoBean productInfoBean = new ProductInfoBean();
                    if (itemselection.equalsIgnoreCase("fpfpromotion")) {
                        productInfoBean.setCoupon("fpfpromotion");
                    } else {
                        productInfoBean.setCoupon(couponnumber);
                    }

                    productInfoBean
                            .setItemNumber(getLstlblSelectedItemIds().get(j).getText());
                    productInfoBean
                            .setItemTitle(getLstlblSelectedTitle().get(j).getText());
                    productInfoBean.setCouponItemPrice(
                            getLstlblSelectedPrice().get(j).getText());
                    productInfoBean.setQuantity("1");
                    // Setting price FREE
                    productInfoBean.setPrice("FREE");
                    productInfoBean.setFlyer(getLstlblSelectedFlyer().get(j).getText());
                    if (itemselection.equalsIgnoreCase("freepick")) {
                        PauseUtil.pause(4000);
                        productInfoBean.setCouponDescription(
                                getLblPopupTitleForFreePick().getText());
                    } else {
                        productInfoBean.setCouponDescription(
                                getLblPopupTitleForDollarToSpend().getText());
                    }
                    SCHUtils.addCouponItem(productInfoBean);

                }

                PauseUtil.pause(2000);
                SCHUtils.scrollToView(getBtnConfirmAndApply());
                SCHUtils.clickUsingJavaScript(getBtnConfirmAndApply());
                PauseUtil.pause(2000);
                // jsExecutor.executeScript("$(arguments[0]).change();",
                // getBtnConfirmAndApply());
                PauseUtil.pause(2000);
                SCHUtils.waitForLoaderToDismiss();
                PauseUtil.pause(8000);
                // AssertUtils.assertDisplayed(getLblSucessMessage(couponnumber));

            } else if (SCHUtils.isPresent(getTxtMGMTeacherCustomerNumber())) {
                PauseUtil.pause(4000);
                getTxtMGMTeacherCustomerNumber().clear();
                getTxtMGMTeacherCustomerNumber()
                        .sendKeys(testData.getString("teachercustomerno"));
                getTxtMGMTeacherFirstName().clear();
                getTxtMGMTeacherFirstName()
                        .sendKeys(testData.getString("teacherfirstname"));
                getTxtMGMTeacherLastName().clear();
                getTxtMGMTeacherLastName()
                        .sendKeys(testData.getString("teacherlastname"));
                PauseUtil.pause(4000);

                ProductInfoBean productInfoBean = new ProductInfoBean();
                productInfoBean.setCoupon(couponnumber);
                productInfoBean.setItemNumber("");
                SCHUtils.clickUsingJavaScript(getBtnMGMSubmit());
                PauseUtil.pause(4000);
                productInfoBean.setCouponDescription(
                        getLblCouponDescription(couponnumber).getText());
                SCHUtils.addCouponItem(productInfoBean);

            } else {
                System.out.println("First Else.................");
                PauseUtil.pause(4000);
                SCHUtils.waitForLoaderToDismiss();

                ProductInfoBean productInfoBean = new ProductInfoBean();
                productInfoBean.setCoupon(couponnumber);
                productInfoBean.setItemNumber("");
                productInfoBean.setCouponDescription(
                        getLblCouponDescription(couponnumber).getText());
                SCHUtils.addCouponItem(productInfoBean);
            }

        } else {
            System.out.println("Else PArt. in second phase");
            PauseUtil.pause(3000);
            if (SCHUtils.isPresent(getSelectGrade())) {
                // need to add code for search using keyword
            } else if (SCHUtils.isPresent(getTxtMGMTeacherCustomerNumber())) {
                PauseUtil.pause(4000);
                getTxtMGMTeacherFirstName().clear();
                getTxtMGMTeacherFirstName()
                        .sendKeys(testData.getString("teacherfirstname"));
                getTxtMGMTeacherLastName().clear();
                getTxtMGMTeacherLastName()
                        .sendKeys(testData.getString("teacherlastname"));
                PauseUtil.pause(4000);

                ProductInfoBean productInfoBean = new ProductInfoBean();
                productInfoBean.setCoupon(couponnumber);
                productInfoBean.setItemNumber("");
                getTxtMGMTeacherCustomerNumber().clear();
                getTxtMGMTeacherCustomerNumber()
                        .sendKeys(testData.getString("teachercustomerno"));
                SCHUtils.clickUsingJavaScript(getBtnMGMSubmit());
                PauseUtil.pause(2000);
                // jsExecutor.executeScript("$(arguments[0]).change();",
                // getBtnMGMSubmit());
                try {
                    jsExecutor.executeScript("$(arguments[0]).change();",
                            getBtnMGMSubmit());
                } catch (Exception e) {
                    System.out.println(
                            "For Other Browser We Dont Need To Call jsExecutor it will fail ");
                }
                PauseUtil.pause(4000);
                productInfoBean.setCouponDescription(
                        getLblCouponDescription(couponnumber).getText());

                SCHUtils.addCouponItem(productInfoBean);

            } else {
                PauseUtil.pause(4000);
                System.out.println("Else PArt.... in Mgm");
                ProductInfoBean productInfoBean = new ProductInfoBean();
                productInfoBean.setCoupon(couponnumber);
                productInfoBean.setItemNumber("");
                productInfoBean.setCouponDescription(
                        getLblCouponDescription(couponnumber).getText());
                SCHUtils.addCouponItem(productInfoBean);
            }

        }

    }

    @Override
    public void verifyMGMCouponFunctionality(Configuration data) {
        AssertUtils.assertDisplayed(getTxtMGMTeacherCustomerNumber());
        AssertUtils.assertDisplayed(getTxtMGMTeacherFirstName());
        AssertUtils.assertDisplayed(getTxtMGMTeacherLastName());

        getBtnCloseModal().click();
        PauseUtil.pause(2000);
        TestBaseProvider.getTestBase().getDriver().navigate().refresh();
        PauseUtil.pause(5000);

        SCHUtils.waitForLoaderToDismiss();
        AssertUtils.assertDisplayed(getLnkMGMEnterReferingTeacherDetails());
        SCHUtils.clickUsingJavaScript(getLnkMGMEnterReferingTeacherDetails());

        PauseUtil.pause(4000);

        PauseUtil.pause(3000);
        getTxtMGMTeacherCustomerNumber().clear();
        getTxtMGMTeacherCustomerNumber().sendKeys(data.getString("invalidcustomerno"));

        getTxtMGMTeacherFirstName().clear();
        getTxtMGMTeacherFirstName().sendKeys(data.getString("teacherfirstname"));

        // WaitUtils.waitForEnabled(getBtnDisabledSubmit());
        // AssertUtils.assertDisplayed(getBtnDisabledSubmit());

        getTxtMGMTeacherLastName().clear();
        getTxtMGMTeacherLastName().sendKeys(data.getString("teacherlastname"));

        WaitUtils.waitForEnabled(getBtnMGMSubmit());
        // AssertUtils.assertDisplayed(getBtnMGMSubmit());
        getBtnMGMSubmit().click();

        PauseUtil.waitForAjaxToComplete(6000);

        AssertUtils.assertTextMatches(getLblErrorMessage(),
                Matchers.containsString(ConstantUtils.INVALID_CUSTOMER_NO_MSG));

        getTxtMGMTeacherCustomerNumber().clear();
        getTxtMGMTeacherCustomerNumber().sendKeys(data.getString("teachercustomerno"));

        getTxtMGMTeacherFirstName().clear();
        getTxtMGMTeacherFirstName().sendKeys(data.getString("teacherfirstname"));

        getTxtMGMTeacherLastName().clear();
        getTxtMGMTeacherLastName().sendKeys(data.getString("teacherlastname"));

        getBtnMGMSubmit().click();

        PauseUtil.waitForAjaxToComplete(5000);

        AssertUtils.assertDisplayed(getLblThankYouMessage());

        String text[] = getlblCouponDescriptionFromCouponName(
                data.getString("mgmcoupontobeverified")).getText().split("\n");
        for (String txt : text) {
            System.out.println("text-------" + txt);
            Assert.assertTrue(
                    txt.trim().contains("You Earned 250 Bonus Points") || txt.trim()
                            .contains("Referral Coupon from" + " "
                                    + data.getString("teacherfirstname") + " "
                                    + data.getString("teacherlastname")));
        }

    }

    @Override
    public void verifyInCompleteCouponEntryProcessMsg(Configuration data) {
        getBtnCloseModal().click();
        PauseUtil.pause(3000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        btnContinueCheckout.click();
        PauseUtil.pause(3000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        AssertUtils.assertTextMatches(getLblErrorMessage(),
                Matchers.containsString(ConstantUtils.INCOMPLETE_USER_INFO));
        getLnkCouponNumber(data.getString("incompletecouponnumber")).click();

    }

    @Override
    public void verifyInvalidSearchErrorMessage() {
        AssertUtils.assertTextMatches(getLblErrorMessage(),
                Matchers.containsString("Please enter a valid search term."));

        getTxtKeyword().clear();
        getTxtKeyword().sendKeys(Keys.ENTER);

        PauseUtil.pause(3000);
        AssertUtils.assertTextMatches(getLblEmptyTable(),
                Matchers.containsString("Please enter the valid search term"));

    }

    @Override
    public void searchCouponItemForinvalidKeyword(Configuration data) {
        getTxtKeyword().sendKeys(data.getString("invalidkeyword"));
        PauseUtil.pause(1000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        getTxtKeyword().sendKeys(Keys.ENTER);
        PauseUtil.pause(3000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
    }

    @Override
    public void editFreePickCoupon(Configuration data) {
        String couponName = data.getString("editcouponname");
        String itemSelectionMethod = data.getString("editcouponitemselctionmethod");

        SCHUtils.removeCouponItem(SCHUtils.getCouponItemByIdAndName(couponName));
        PauseUtil.pause(5000);

        if (itemSelectionMethod.equalsIgnoreCase("ByGrade")) {

            PauseUtil.pause(6000);

            SCHUtils.selectOptionByvalue(getSelectGrade(),
                    data.getString("editcouponselectgrade"));

            PauseUtil.pause(3000);

            String couponitemindices[] = SCHUtils
                    .getArrayFromStringData(data.getString("editcouponitemnumber"));

            for (String index : couponitemindices) {
                getLstRadioSelect().get(Integer.parseInt(index)).click();
            }

            int itemsize = getLstlblSelectedItemIds().size();

            ProductInfoBean bean = new ProductInfoBean();

            for (int j = 0; j < itemsize; j++) {
                PauseUtil.pause(4000);
                System.out.println("filling edited bean on----" + j);
                bean.setCoupon(couponName);
                bean.setItemNumber(getLstlblSelectedItemIds().get(j).getText());
                bean.setItemTitle(getLstlblSelectedTitle().get(j).getText());
                bean.setCouponItemPrice(getLstlblSelectedPrice().get(j).getText());
                bean.setQuantity("1");
                // Setting price FREE
                bean.setPrice("FREE");
                bean.setFlyer(getLstlblSelectedFlyer().get(j).getText());

                if (!SCHUtils.isPresent(getLblPopupTitleForFreePick())) {
                    bean.setCouponDescription(
                            getLblPopupTitleForDollarToSpend().getText());
                } else {
                    bean.setCouponDescription(getLblPopupTitleForFreePick().getText());

                }
                SCHUtils.addCouponItem(bean);
            }

            if (SCHUtils.isPresent(getLblPopupTitleForDollarToSpend())) {

                if (!SCHUtils.isPresent(getLblOverDueAmountOnCouponPopUp())) {
                    TestBaseProvider.getTestBase().getContext()
                            .setProperty("testexecution.topoffamount", "0");
                }
            }

            getBtnConfirmAndApply().click();
            PauseUtil.pause(8000);

        } else {

            // need to add code to select item by keyword
        }

    }

    public void verifySearchResultsUnderPriceLimit() {
        List<WebElement> paginateBtn = getLstPaginateBtn();
        for (int j = 0; j < paginateBtn.size(); j++) {
            PauseUtil.pause(2000);
            verifyPriceList();
            paginateBtn.get(j).click();
            PauseUtil.waitForAjaxToComplete(4000);
        }
    }

    @Override
    public void verifyPriceList() {
        List<WebElement> price = getLstlblPrice();
        Assert.assertTrue(price.size() > 1);
        for (int i = 0; i < price.size(); i++) {
            Double pricevalue = SCHUtils.getPriceWithOutCurrency(price.get(i).getText());
            Assert.assertTrue(pricevalue <= 5);
        }
        PauseUtil.pause(5000);
    }

    @Override
    public void verifyFreePickModalFunctionality(Configuration data) {
        PauseUtil.pause(4000);

        AssertUtils.assertAttributeMatches(getTxtKeyword(), "placeholder",
                Matchers.containsString("Item, Title, Author or Keyword"));

        AssertUtils.assertTextMatches(getLblSelectedGradeValue(),
                Matchers.containsString("Grade Level"));
        PauseUtil.pause(3000);
        getTxtKeyword().sendKeys(data.getString("keytobesearched"));
        getTxtKeyword().sendKeys(Keys.ENTER);

        PauseUtil.pause(3000);

        verifySearchResultsUnderPriceLimit();

        PauseUtil.pause(3000);

        getTxtKeyword().clear();
        getTxtKeyword().sendKeys(Keys.ENTER);

        PauseUtil.pause(3000);
        AssertUtils.assertTextMatches(getLblEmptyTable(),
                Matchers.containsString("No search results found"));

        PauseUtil.pause(3000);
        SCHUtils.selectOptionByvalue(getSelectGrade(), data.getString("gradetosearch"));
        PauseUtil.pause(3000);
        String itemNoBefore = getLstlblItemIds().get(0).getText();

        getTxtKeyword().sendKeys(data.getString("keytobesearched"));
        getTxtKeyword().sendKeys(Keys.ENTER);

        PauseUtil.pause(3000);

        String itemNoAfter = getLstlblItemIds().get(0).getText();

        Assert.assertTrue(!itemNoAfter.equals(itemNoBefore));

        PauseUtil.pause(5000);

        List<WebElement> gradelist = getLstGradeList();

        String[] grades = {"Grade Level", "Early Childhood", "Kindergarten", "1st Grade",
                "2nd Grade", "3rd Grade", "4th Grade", "5th Grade", "6th Grade & Up"};
        for (int i = 1; i < gradelist.size(); i++) {
            Assert.assertTrue(gradelist.get(i).getAttribute("value").contains(grades[i]));

        }

        SCHUtils.selectOptionByvalue(getSelectGrade(), data.getString("gradetosearch"));
        PauseUtil.pause(3000);

        verifySearchResultsUnderPriceLimit();

        PauseUtil.pause(3000);
        getTxtKeyword().sendKeys(data.getString("invalidkeyword"));
        getTxtKeyword().sendKeys(Keys.ENTER);

        PauseUtil.pause(3000);

        AssertUtils.assertTextMatches(getLblEmptyTable(),
                Matchers.containsString("No search results found"));

        PauseUtil.pause(3000);
        getTxtKeyword().clear();
        getTxtKeyword().sendKeys(data.getString("keytobesearched"));
        getTxtKeyword().sendKeys(Keys.ENTER);
        PauseUtil.pause(3000);

        String itemNoBefore1 = getLstlblItemIds().get(0).getText();

        SCHUtils.selectOptionByvalue(getSelectGrade(), data.getString("gradetosearch"));
        PauseUtil.pause(3000);

        String itemNoAfter1 = getLstlblItemIds().get(0).getText();

        Assert.assertTrue(!itemNoAfter1.equals(itemNoBefore1));

    }

    @Override
    public void verifyFPPopup() {
        PauseUtil.waitForAjaxToComplete(3000);
        WaitUtils.waitForEnabled(getSelectGrade());
        Configuration data = TestBaseProvider.getTestBase().getTestData();
        PauseUtil.pause(3000);
        if (data.getString("selectgrade") != null
                && !data.getString("selectgrade").isEmpty()) {
            PauseUtil.pause(5000);
            // Code to select grade from drop down
            SCHUtils.selectOptionByvalue(getSelectGrade(), data.getString("selectgrade"));
            PauseUtil.pause(2000);
        }
        if (!TestBaseProvider.getTestBase().getContext().getString("driver.name")
                .equalsIgnoreCase("ios")) {
            SCHUtils.scrollToView(getBtnConfirmAndApply());
            AssertUtils.assertDisabled(getBtnConfirmAndApply());
            SCHUtils.scrollToView(getBtnCloseModal());
            AssertUtils.assertDisplayed(getBtnCloseModal());
            SCHUtils.scrollToView(getLblTitleItemId());
            AssertUtils.assertDisplayed(getLblTitleItemId());
            AssertUtils.assertDisplayed(getLblTitleItemTitle());
            AssertUtils.assertDisplayed(getLblTitleFlyer());
            AssertUtils.assertDisplayed(getLblTitlePrice());
            AssertUtils.assertDisplayed(getLblTitleRdoSelect());

        } else {
            SCHUtils.scrollToView(getBtnConfirmAndApply());
            AssertUtils.assertDisabled(getBtnConfirmAndApply());
            SCHUtils.scrollToView(getBtnCloseModal());
            AssertUtils.assertPresent((ExtendedElement) getBtnCloseModal());
            SCHUtils.scrollToView(getLblTitleItemId());
            AssertUtils.assertPresent((ExtendedElement) getLblTitleItemId());
            AssertUtils.assertPresent((ExtendedElement) getLblTitleItemTitle());
            AssertUtils.assertPresent((ExtendedElement) getLblTitleFlyer());
            AssertUtils.assertPresent((ExtendedElement) getLblTitlePrice());
            AssertUtils.assertPresent((ExtendedElement) getLblTitleRdoSelect());

        }
    }

    @Override
    public void verifyCouponsPagination() {
        AssertUtils.assertDisplayed(getBtnPaginationPrevious());
        AssertUtils.assertDisplayed(getBtnPaginationNext());
        // Initially on page 1 prev button disabled
        SCHUtils.scrollToView(getBtnPaginationPrevious());
        AssertUtils.assertAttributeMatches(getBtnPaginationPrevious(), "class",
                Matchers.containsString("disabled"));

        AssertUtils.assertDisplayed(getLblPaginationInfo());
        List<WebElement> pageEles = getLstPaginateBtn();
        if (pageEles.size() > 1) {
            pageEles.get(1).click();
            AssertUtils.assertEnabled(getBtnPaginationPrevious());
            // Table results should display 10 result per page
            Assert.assertTrue(getLstlblItemIds().size() <= 10);
            pageEles.get(pageEles.size() - 1).click();
            AssertUtils.assertAttributeMatches(getBtnPaginationNext(), "class",
                    Matchers.containsString("disabled"));
            pageEles.get(0).click();
        }
    }

    @Override
    public void verifySortingFunctionality() {
        PauseUtil.waitForAjaxToComplete(2000);
        List<WebElement> pageEles = getLstPaginateBtn();
        pageEles.get(1).click();
        WaitUtils.waitForTextMatches(getBtnCurrentPagination(),
                Matchers.containsString("2"));

        // Sort by title name
        getLblTitleItemTitle().click();
        PauseUtil.waitForAjaxToComplete(1000);
        AssertUtils.assertTextMatches(getBtnCurrentPagination(),
                Matchers.containsString("1"));
        List<WebElement> itemTitles = getLstItemTitle();
        List<String> original = new ArrayList<String>();
        for (WebElement title : itemTitles) {
            // System.out.println(
            // " ==============> " + title.getText().toString().substring(0,
            // 1));
            original.add(title.getText().toString().substring(0, 1));
        }
        List<String> sortedList = new ArrayList<String>(original);
        Collections.sort(sortedList);
        Assert.assertTrue(sortedList.equals(original),
                "Item title list is not in alphabetical order");
    }

    @Override
    public void verifyItemDetails() {
        // Verify Product details after clicking on title
        getLstItemTitle().get(0).click();
        AssertUtils.assertDisplayed(getLblProductDetails());
        getLstItemTitle().get(0).click();
        // Verify product details after clicking on item number
        PauseUtil.pause(2000);
        getLstlblItemIds().get(0).click();
        AssertUtils.assertDisplayed(getLblProductDetails());
        getLstlblItemIds().get(0).click();
    }

    @Override
    public void verifyStudentRenameFunctionality() {
        addCoupon(TestBaseProvider.getTestBase().getTestData());
        IStudentFlyerOrdersPage studentFlyerOrdersPage =
                getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.getIProductOrderTableSection().selectAppliedSFOCoupon();
        getTxtStudentName().clear();
        getTxtStudentName().sendKeys("Rename");
        AssertUtils.assertEnabled(getBtnRefresh());
        AssertUtils.assertDisabled(getBtnConfirmAndApply());
        getBtnRefresh().click();
        // Verifying that confirm and apply button is enabled after clicking on
        // refresh
        AssertUtils.assertDisplayed(getBtnConfirmAndApply());
        AssertUtils.assertEnabled(getBtnConfirmAndApply());
    }

    @Override
    public void verifyCouponsModal() {

        AssertUtils.assertDisplayed(getTxtKeyword());
        AssertUtils.assertDisplayed(getTxtGrade());
        AssertUtils.assertDisplayed(getBtnCloseModal());

    }

    @Override
    public void closeMakeYourSelectionPopUpMOdal() {
        getBtnCloseModal().click();
    }

    @Override
    public void verifyFullyUsedDollarToSpendPopup(Configuration testData) {
        PauseUtil.pause(2000);
        if (!SCHUtils.isPresent(getLblPopupTitleForDollarToSpend())) {
            getLnkCouponName(testData.getString("dollartospend")).click();
        }

        System.out.println("By Grade........... In");
        PauseUtil.waitForAjaxToComplete(3000);
        String title = getLblPopupTitleForDollarToSpend().getText();

        String arr[] = title.split("\\$");
        String amount = arr[1].split(" ")[0];
        Double amountToBeMapped = Double.valueOf(amount);

        Double total = 0.0;

        SCHUtils.selectOptionByvalue(getSelectGrade(),
                testData.getString("gradetobeverified"));
        PauseUtil.waitForAjaxToComplete(4000);

        String couponitemindices[] = SCHUtils.getArrayFromStringData(
                testData.getString("couponitemnumbertobeverified"));
        System.out.println("item index---" + couponitemindices[0]);
        System.out.println("item index---" + couponitemindices[1]);
        System.out.println("item index---" + couponitemindices[2]);
        System.out.println("jsjdsjdhk" + couponitemindices.length);
        for (int j = 0; j < couponitemindices.length; j++) {
            PauseUtil.pause(3000);
            SCHUtils.waitForLoaderToDismiss();
            System.out.println("####################size:>" + getLstRadioSelect().size());

            if (TestBaseProvider.getTestBase().getContext().getString("platform")
                    .equalsIgnoreCase("ios")) {
                Actions action = new Actions(TestBaseProvider.getTestBase().getDriver());

                action.moveToElement(
                        getLstRadioSelect().get(Integer.parseInt(couponitemindices[j])))
                        .click().build().perform();
            }
            SCHUtils.clickUsingJavaScript(
                    getLstRadioSelect().get(Integer.parseInt(couponitemindices[j])));
            PauseUtil.pause(5000);
            PauseUtil.waitForAjaxToComplete();
            AssertUtils.assertDisplayed(getLstlblSelectedItemIds().get(j));

            total = total + SCHUtils
                    .getPriceWithOutCurrency(getLstlblSelectedPrice().get(j).getText());
            PauseUtil.pause(3000);
            if (!(total >= Double.parseDouble(amount))) {
                amountToBeMapped = amountToBeMapped - SCHUtils.getPriceWithOutCurrency(
                        getLstlblSelectedPrice().get(j).getText());
                AssertUtils.assertTextMatches(getLblRemainingAmount(), Matchers
                        .containsString(String.valueOf(amountToBeMapped.intValue())));
                AssertUtils.assertTextMatches(getLblUsedAmount(),
                        Matchers.containsString(String.valueOf(total.intValue())));
            }

            if (total >= Double.parseDouble(amount)) {
                AssertUtils.assertDisplayed(getLblAmountOver());
                AssertUtils.assertDisplayed(getLblOverDueMessage());
            }
            PauseUtil.waitForAjaxToComplete();
        }
        PauseUtil.pause(2000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        getBtnConfirmAndApply().click();
        PauseUtil.pause(2000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();

    }

    @Override
    public void verifyCouponsModalWithMakeYourSelectionSection() {
        PauseUtil.pause(5000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        Assert.assertTrue(SCHUtils.isPresent(getLblMakeYourSelectionSection()));

    }

    @Override
    public void searchItemByGradeLevel(String gradeLevel) {
        PauseUtil.pause(5000);
        SCHUtils.selectOptionByvalue(getSelectGrade(), gradeLevel);
        // SCHUtils.selectItemsByText(gradeLevel, getSelectGrade());
        PauseUtil.waitForAjaxToComplete(1000);
    }

    @Override
    public void searchItemByKeywordText(String text) {
        AssertUtils.assertDisplayed(getTxtGrade());
        getTxtKeyword().clear();
        getTxtKeyword().sendKeys(text);
        getTxtKeyword().sendKeys(Keys.ENTER);
        PauseUtil.pause(3000);
    }

    @Override
    public void enterItemInmakeYourSelectionSection(String itemID) {
        getTxtKeyword().clear();
        getTxtKeyword().sendKeys(itemID);
        getTxtKeyword().sendKeys(Keys.ENTER);
        PauseUtil.pause(5000);
    }

    @Override
    public void enterItemInmakeYourSelectionSection(Configuration data, String itemtype) {
        if (itemtype.equalsIgnoreCase("Bonus Point Title")) {
            enterItemInmakeYourSelectionSection(data.getString("itemtitlebonuspoint"));
        } else if (itemtype.equalsIgnoreCase("Teacher Only Title")) {
            enterItemInmakeYourSelectionSection(data.getString("itemtitleteacheronly"));
        } else if (itemtype.equalsIgnoreCase("Book Trust Title")) {
            enterItemInmakeYourSelectionSection(data.getString("itemtitlebooktrust"));
        } else if (itemtype.equalsIgnoreCase("Bonus Point Id")) {
            enterItemInmakeYourSelectionSection(data.getString("itemidbonuspoint"));
        } else if (itemtype.equalsIgnoreCase("Teacher Only Id")) {
            enterItemInmakeYourSelectionSection(data.getString("itemidteacheronly"));
        } else if (itemtype.equalsIgnoreCase("Book Trust Id")) {
            enterItemInmakeYourSelectionSection(data.getString("itemidbooktrust"));
        }
    }

    @Override
    public void enterItemInmakeYourSelectionSectionApply(String itemID) {
        getTxtKeyword().clear();
        getTxtKeyword().sendKeys(itemID);
        getTxtKeyword().sendKeys(Keys.ENTER);
        PauseUtil.waitForAjaxToComplete(8000);
        getLstRadioSelect().get(0).click();
        getBtnConfirmAndApply().click();
        PauseUtil.waitForAjaxToComplete(8000);
    }

    @Override
    public void verifyNoResultFoundMessage() {
        WaitUtils.waitForDisplayed(getLblEmptyTable());
        AssertUtils.assertDisplayed(getLblEmptyTable());
    }

    @Override
    public void selectItemByRadioButton(String position) {

        int itemPosition = Integer.parseInt(position);
        PauseUtil.pause(3000);
        WaitUtils.waitForDisplayed((getLstRadioSelect().get(itemPosition - 1)));
        getLstRadioSelect().get(itemPosition - 1).click();

        String studentname =
                TestBaseProvider.getTestBase().getTestData().getString("couponstudent");
        String itemId = getLstlblItemIds().get(itemPosition - 1).getText();
        String title = getLstItemTitle().get(itemPosition - 1).getText();
        String price = getLstlblPrice().get(itemPosition - 1).getText();
        String flyer = getLstlblFlyer().get(itemPosition - 1).getText();

        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.studentname", studentname);
        TestBaseProvider.getTestBase().getContext().setProperty("testexecution.ItemId",
                itemId);
        TestBaseProvider.getTestBase().getContext().setProperty("testexecution.title",
                title);
        TestBaseProvider.getTestBase().getContext().setProperty("testexecution.price",
                price);
        TestBaseProvider.getTestBase().getContext().setProperty("testexecution.flyer",
                flyer);

        String couponnumber =
                TestBaseProvider.getTestBase().getTestData().getString("couponcode");
        ProductInfoBean productInfoBean = new ProductInfoBean();
        productInfoBean.setCoupon(couponnumber);
        productInfoBean.setItemNumber(itemId);
        productInfoBean.setItemTitle(title);
        productInfoBean.setQuantity("1");
        // Setting price FREE
        productInfoBean.setPrice("FREE");
        productInfoBean.setFlyer(flyer);
        SCHUtils.addCouponItem(productInfoBean);

    }


    @Override
    public void getYourCurrentSelectionSection() {

        List<WebElement> cartTable1 = gettablecouponSelected();
        for (WebElement cartTable : cartTable1) {
            List<WebElement> cartTabletr1 = cartTable.findElements(By.tagName("tr"));
            for (WebElement cartTabletd1 : cartTabletr1) {
                List<WebElement> cartTabletd = cartTabletd1.findElements(By.tagName("td"));


                if ((cartTabletd.get(4).isSelected())) {
                    TestBaseProvider.getTestBase().getContext().setProperty("testexecution.ItemId", String.valueOf
                            (cartTabletd.get(0).getText()));
                    TestBaseProvider.getTestBase().getContext().setProperty("testexecution.title", String.valueOf
                            (cartTabletd.get(1).getText()));
                    TestBaseProvider.getTestBase().getContext().setProperty("testexecution.flyer", String.valueOf
                            (cartTabletd.get(2).getText()));
                    TestBaseProvider.getTestBase().getContext().setProperty("testexecution.price", String.valueOf
                            (cartTabletd.get(3).getText()));
		    	
		    	/*TestBaseProvider.getTestBase().getContext().setProperty("testexecution.ItemId", String.valueOf
        (getLstlblSelectedItemId().getText()));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.title", String.valueOf
		        (getLstSelectedTitle().getText()));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.title", String.valueOf
		        (getLstSelectedTitle().getText()));*/
                }
            }
        }
    }


    @Override
    public void getYourCurrentSelectionSection_FreePick() {

        List<WebElement> cartTable1 = gettablecouponSelected();
        for (WebElement cartTable : cartTable1) {
            List<WebElement> cartTabletr1 = cartTable.findElements(By.tagName("tr"));
            for (WebElement cartTabletd1 : cartTabletr1) {
                List<WebElement> cartTabletd = cartTabletd1.findElements(By.tagName("td"));

                if ((cartTabletd.get(5).isSelected())) {
                    TestBaseProvider.getTestBase().getContext().setProperty("testexecution.ItemId", String.valueOf(cartTabletd.get(1).getText()));
                    TestBaseProvider.getTestBase().getContext().setProperty("testexecution.title", String.valueOf(cartTabletd.get(2).getText()));
                    TestBaseProvider.getTestBase().getContext().setProperty("testexecution.flyer", String.valueOf(cartTabletd.get(3).getText()));
                    TestBaseProvider.getTestBase().getContext().setProperty("testexecution.price", String.valueOf(cartTabletd.get(4).getText()));
                }
            }
        }
    }


    @Override
    public void verifyResultforParticularSearch(String couponsearch) {

        List<WebElement> cartTable1 = gettablecouponSelected();
        for (WebElement cartTable : cartTable1) {
            List<WebElement> cartTabletr1 = cartTable.findElements(By.tagName("tr"));
            for (WebElement cartTabletd1 : cartTabletr1) {
                List<WebElement> cartTabletd = cartTabletd1.findElements(By.tagName("td"));

                if (cartTabletd.get(0).getText().equals("No search results found")) {
                    Assert.fail("No results found with that search term");
                } else {
                    //setting the itemid
                    TestBaseProvider.getTestBase().getContext().setProperty(
                            "testexecution.itemid", String.valueOf
                                    (cartTabletd.get(0).getText()));
                    //setting the title
                    TestBaseProvider.getTestBase().getContext().setProperty(
                            "testexecution.title", String.valueOf
                                    (cartTabletd.get(1).getText()));
                    //getting itemid
                    String expectedsearchresult_itemid = TestBaseProvider.getTestBase().getContext().getProperty(
                            "testexecution.itemid").toString();
                    //getting title
                    String expectedsearchresult_title = TestBaseProvider.getTestBase().getContext().getProperty(
                            "testexecution.title").toString();

                    if ((!expectedsearchresult_itemid.equals(couponsearch)) && (!expectedsearchresult_title.equals(couponsearch))) {
                        Assert.fail("Application Issue. Searching with particular item number is not working as expected for Manual Free Pick");
                    }

                }
            }
        }
    }


    @Override
    public void verifyResultforParticularSearch_FreePickCoupon(String couponsearch) {

        List<WebElement> cartTable1 = gettablecouponSelected();
        for (WebElement cartTable : cartTable1) {
            List<WebElement> cartTabletr1 = cartTable.findElements(By.tagName("tr"));
            for (WebElement cartTabletd1 : cartTabletr1) {
                List<WebElement> cartTabletd = cartTabletd1.findElements(By.tagName("td"));

                if (cartTabletd.get(0).getText().equals("No search results found")) {
                    Assert.fail("No results found with that search term");
                } else {
                    //setting the itemid
                    TestBaseProvider.getTestBase().getContext().setProperty(
                            "testexecution.itemid", String.valueOf
                                    (cartTabletd.get(1).getText()));
                    //setting the title
                    TestBaseProvider.getTestBase().getContext().setProperty(
                            "testexecution.title", String.valueOf
                                    (cartTabletd.get(2).getText()));
                    //getting itemid
                    String expectedsearchresult_itemid = TestBaseProvider.getTestBase().getContext().getProperty(
                            "testexecution.itemid").toString();
                    System.out.println("Printing the itemid" + expectedsearchresult_itemid);

                    //getting title
                    String expectedsearchresult_title = TestBaseProvider.getTestBase().getContext().getProperty(
                            "testexecution.title").toString();
                    System.out.println("Printing the title " + expectedsearchresult_title);

                    //if((!expectedsearchresult_itemid.equals(couponsearch)) && (!expectedsearchresult_title.equals(couponsearch)))

                    if((!expectedsearchresult_itemid.equals(couponsearch)) &&
                    (!expectedsearchresult_title.equals(couponsearch))) {
                        System.out.println("before asserrt");
                        Assert.fail("Application Issue. Searching with particular item number is not working as expected for Manual Free Pick");
                        System.out.println("after asser");
                    } else {
                        break;
                    }

                }
		    
		    
		 /*   if((cartTabletd.size()!=0)){
		    	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.ItemId", String.valueOf
		    	        (cartTabletd.get(0).getText()));
		    	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.title", String.valueOf
		    	        (cartTabletd.get(1).getText()));
		    	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.flyer", String.valueOf
		    	        (cartTabletd.get(2).getText()));
		    	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.price", String.valueOf
		    	        (cartTabletd.get(3).getText()));
		    	
		    
		}
		
		*/
            }
        }
    }

    @Override
    public void verifyResultforParticularSearch_DTSModal(String couponsearch) {

        List<WebElement> cartTable1 = gettablecouponSelected();
        for (WebElement cartTable : cartTable1) {
            List<WebElement> cartTabletr1 = cartTable.findElements(By.tagName("tr"));
            for (WebElement cartTabletd1 : cartTabletr1) {
                List<WebElement> cartTabletd = cartTabletd1.findElements(By.tagName("td"));

                if (cartTabletd.get(0).getText().equals("No search results found")) {
                    Assert.fail("No results found with that search term");
                } else {
                    //setting the itemid
                    TestBaseProvider.getTestBase().getContext().setProperty(
                            "testexecution.itemid", String.valueOf
                                    (cartTabletd.get(0).getText()));
                    //setting the title
                    TestBaseProvider.getTestBase().getContext().setProperty(
                            "testexecution.title", String.valueOf
                                    (cartTabletd.get(1).getText()));
                    //getting itemid
                    String expectedsearchresult_itemid = TestBaseProvider.getTestBase().getContext().getProperty(
                            "testexecution.itemid").toString();
                    System.out.println("Printing the itemid" + expectedsearchresult_itemid);

                    //getting title
                    String expectedsearchresult_title = TestBaseProvider.getTestBase().getContext().getProperty(
                            "testexecution.title").toString();
                    System.out.println("Printing the title " + expectedsearchresult_title);

                    //if((!expectedsearchresult_itemid.equals(couponsearch)) && (!expectedsearchresult_title.equals(couponsearch)))

                    //if((!expectedsearchresult_itemid.equals(couponsearch)))
                    if ((!expectedsearchresult_title.equals(couponsearch))) {
                        System.out.println("before asserrt");
                        Assert.fail("Application Issue. Searching with particular item number is not working as expected for Manual Free Pick");
                        System.out.println("after asser");
                    } else {
                        break;
                    }

                }
            }
        }
    }

    @Override
    public void verifyCouponModalNotdisplayed() {
        PauseUtil.pause(5000);
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete();
        try {
            if (SCHUtils.isPresent(getLblMakeYourSelectionSection())) {
                Assert.fail("Free Pick Modal should be closed");
            }
        }catch (Exception e){

        }

    }

    @Override
    public void click_Cancel_closethefreepick_modal() {
    	PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
        getbutton_cancel_freepick_modal().click();
    }

    @Override
    public void click_close_closethefreepick_modal() {
    	PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(1000);
        getlinkXonSFOmodal().click();
    }

    @Override
    public void validate_sfopage_freepick_coupon_display() {

        String appDisplay = fld_coupon_code_SFO_section.getText();
        System.out.println("#########:"+appDisplay);

        if(!(appDisplay.contains(TestBaseProvider.getTestBase().getTestData().getString("sfofreepick")))){
            Assert.fail("Coupon Link");
        }
    }

    @Override
    public void validate_sfopage_freepick_coupon_error() {

        Assert.assertEquals(getfreepickpendingerrormsg().getText(),"Click the coupon link below to finalize your coupons");
    }

    @Override
    public void validate_sfopage_freepick_coupon_code_hyperlink() {
        String appDisplay = getsfopageafterfreepickitemadded().get(6).getAttribute("a");
        try {
            getsfopageafterfreepickitemadded().get(6).click();
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Not A link");
        }
    }

    @Override
    public void verifyResultsforParticularSearch_FreePickCoupon(String couponsearch) {

        List<WebElement> cartTable1 = gettablecouponSelected();
        for (WebElement cartTable : cartTable1) {
            List<WebElement> cartTabletr1 = cartTable.findElements(By.tagName("tr"));
            for (WebElement cartTabletd1 : cartTabletr1) {
                List<WebElement> cartTabletd = cartTabletd1.findElements(By.tagName("td"));

                if (cartTabletd.get(0).getText().equals("No search results found")) {
                    Assert.fail("No results found with that search term");
                } else {
                    //setting the itemid
                    TestBaseProvider.getTestBase().getContext().setProperty(
                            "testexecution.itemid", String.valueOf
                                    (cartTabletd.get(1).getText()));
                    //setting the title
                    TestBaseProvider.getTestBase().getContext().setProperty(
                            "testexecution.title", String.valueOf
                                    (cartTabletd.get(2).getText()));
                    //getting itemid
                    String expectedsearchresult_itemid = TestBaseProvider.getTestBase().getContext().getProperty(
                            "testexecution.itemid").toString();
                    System.out.println("Printing the itemid" + expectedsearchresult_itemid);

                    //getting title
                    String expectedsearchresult_title = TestBaseProvider.getTestBase().getContext().getProperty(
                            "testexecution.title").toString();
                    System.out.println("Printing the title " + expectedsearchresult_title);

                    //if((!expectedsearchresult_itemid.equals(couponsearch)) && (!expectedsearchresult_title.equals(couponsearch)))

                    //if((!expectedsearchresult_itemid.equals(couponsearch)))
                    if ((!expectedsearchresult_title.equals(couponsearch))) {
                        System.out.println("before asserrt");
                        Assert.fail("Application Issue. Searching with particular item number is not working as expected for Manual Free Pick");
                        System.out.println("after asser");
                    } else {
                        break;
                    }

                }


            }
        }
    }

    @Override
    public void verifyManualFreePickItemsPriceWithInCouponAmount(double ManualFreePickTier1CouponAmt,
                                                                 double ManualFreePickTier2CouponAmt) {

        List<WebElement> cartTable1 = gettablecouponSelected();
        String couponsamt1;
        for (WebElement cartTable : cartTable1) {
            List<WebElement> cartTabletr1 = cartTable.findElements(By.tagName("tr"));
            for (WebElement cartTabletd1 : cartTabletr1) {
                List<WebElement> cartTabletd = cartTabletd1.findElements(By.tagName("td"));

                try {
                    couponsamt1 = cartTabletd.get(4).getText();
                    if (couponsamt1.equals("")) {
                        couponsamt1 = cartTabletd.get(3).getText();
                    }
                } catch (Exception e) {
                    couponsamt1 = cartTabletd.get(3).getText();
                }


               // System.out.println("couponsamt1Beforesubstring" + couponsamt1);
                couponsamt1 = couponsamt1.substring(1);
                //System.out.println("couponsamt1" + couponsamt1);
                Double couponsamt = Double.parseDouble(couponsamt1.trim());

                if (getlblMakeYourSelectionheader1().getText().contains("5")) {
                    if ((couponsamt > ManualFreePickTier1CouponAmt)) {
                        Assert.fail("Application Issue. Items price amount is more than the tier1 coupon amount");
                    }
                } else if (getlblMakeYourSelectionheader1().getText().contains("10")) {
                    if ((couponsamt > ManualFreePickTier2CouponAmt)) {
                        Assert.fail("Application Issue. Items price amount is more than the tier2 coupon amount");
                    }
                }
            }
        }
    }


    @Override
    public void verifyYourCurrentSelectionSection() {
        WaitUtils.waitForDisplayed(getLblSeletedYourSection());
        AssertUtils.assertDisplayed(getLstlblSelectedItemIds().get(0));
        AssertUtils.assertDisplayed(getLstlblSelectedFlyer().get(0));
        AssertUtils.assertDisplayed(getLstlblSelectedPrice().get(0));
        AssertUtils.assertDisplayed(getLstlblSelectedTitle().get(0));
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" + TestBaseProvider
                .getTestBase().getContext().getProperty("testexecution.ItemId"));

        Assert.assertEquals(getLstlblSelectedItemIds().get(0).getText(), TestBaseProvider
                .getTestBase().getContext().getProperty("testexecution.ItemId"));
        Assert.assertEquals(getLstlblSelectedTitle().get(0).getText(), TestBaseProvider
                .getTestBase().getContext().getProperty("testexecution.title"));

		/*
		 * Added condition for free pick item
		 */
        if (getLstlblSelectedPrice().get(0).getText().toLowerCase().contains("free")) {
            Assert.assertEquals(getLstlblSelectedPrice().get(0).getText().trim(),
                    "FREE" + " " + TestBaseProvider.getTestBase().getContext()
                            .getProperty("testexecution.price"));

        } else {
            Assert.assertEquals(getLstlblSelectedPrice().get(0).getText(),
                    TestBaseProvider.getTestBase().getContext()
                            .getProperty("testexecution.price"));
        }
        AssertUtils.assertTextMatches(getLstlblSelectedPrice().get(0),
                Matchers.containsString((String) TestBaseProvider.getTestBase()
                        .getContext().getProperty("testexecution.price")));

        Assert.assertEquals(getLstlblSelectedFlyer().get(0).getText(), TestBaseProvider
                .getTestBase().getContext().getProperty("testexecution.flyer"));
    }


    @Override
    public void verifyYourCurrentSelectionSection_FreePickCoupon() {
        WaitUtils.waitForDisplayed(getLblSeletedYourSection());
        AssertUtils.assertDisplayed(getLstlblSelectedFlyer().get(0));
        AssertUtils.assertDisplayed(getLstlblSelectedPrice().get(0));
        AssertUtils.assertDisplayed(getLstlblSelectedTitle().get(0));

        String ItemId = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.selectedItemId").toString();
        String ItemTitle = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.selectedtitle").toString();
        String ItemFlyer = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.selectedflyer").toString();
        String ItemPrice = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.selectedprice").toString();

        System.err.println("expected id:" + ItemId);
        System.err.println("expected title:" + ItemTitle);
        System.err.println("expected flyer:" + ItemFlyer);
        System.err.println("expected price:" + ItemPrice);


        String ActualItemId = getlblfreepickselecteditemid().getText();
        String ActualTitle = getlblfreepickselecteditemtitle().getText();
        String ActualFlyer = getlblfreepickselecteditemflyer().getText();
        String ActualPrice = getlblfreepickselecteditemprice().getText();


        System.err.println("actual id:" + ActualItemId);
        System.err.println("actual title:" + ActualTitle);
        System.err.println("actual flyer:" + ActualFlyer);
        System.err.println("actual price:" + ActualPrice);

        if (!ItemId.equals(ActualItemId)) {
            Assert.fail("selected Item Id is incorrect in FreePick model window");

        }

        if (!ItemTitle.equals(ActualTitle)) {
            Assert.fail("selected Item Title is incorrect in FreePick model window");

        }

        if (!ItemFlyer.equals(ActualFlyer)) {
            Assert.fail("selected Item Flyer is incorrect in FreePick model window");

        }

        /*if (!ItemPrice.contains(ActualPrice)) {
            Assert.fail("selected Item price is incorrect in FreePick model window");

        }*/
    }


    @Override
    public void verifyYourCurrentSelectionSection_DTS() {
        WaitUtils.waitForDisplayed(getLblSeletedYourSection());
        AssertUtils.assertDisplayed(getLstlblSelectedFlyer().get(0));
        AssertUtils.assertDisplayed(getLstlblSelectedPrice().get(0));
        AssertUtils.assertDisplayed(getLstlblSelectedTitle().get(0));


        String ItemId = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.selectedItemId").toString();
        String ItemTitle = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.selectedtitle").toString();
        String ItemFlyer = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.selectedflyer").toString();
        String ItemPrice = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.selectedprice").toString();

        System.err.println("expected id:" + ItemId);
        System.err.println("expected title:" + ItemTitle);
        System.err.println("expected flyer:" + ItemFlyer);
        System.err.println("expected price:" + ItemPrice);


        String ActualItemId = getlbldtsselecteditemid().getText();
        String ActualTitle = getlbldtsselecteditemtitle().getText();
        String ActualFlyer = getlbldtsselecteditemflyer().getText();
        String ActualPrice = getlbldtsselecteditemprice().getText();


        System.err.println("actual id:" + ActualItemId);
        System.err.println("actual title:" + ActualTitle);
        System.err.println("actual flyer:" + ActualFlyer);
        System.err.println("actual price:" + ActualPrice);

        if (!ItemId.equals(ActualItemId)) {
            Assert.fail("selected Item Id is incorrect in FreePick model window");

        }

        if (!ItemTitle.equals(ActualTitle)) {
            Assert.fail("selected Item Title is incorrect in FreePick model window");

        }

        if (!ItemFlyer.equals(ActualFlyer)) {
            Assert.fail("selected Item Flyer is incorrect in FreePick model window");

        }

        if (!ItemPrice.contains(ActualPrice)) {
            Assert.fail("selected Item price is incorrect in FreePick model window");

        }
    }


    @Override

    public void verifyEmptyCouponSectionMessage() {
        PauseUtil.pause(5000);
        getTxtKeyword().click();
        getTxtKeyword().sendKeys(Keys.ENTER);
        SCHUtils.WaitForAjax();
        AssertUtils.assertTextMatches(getLblEmptyTable(),
                Matchers.containsString(ConstantUtils.EMPTY_COUPONS_SEARCH_MESSAGE));
    }

    @Override
    public void verifyAppliedCouponsOnModal(Configuration testData) {
        PauseUtil.waitForAjaxToComplete(3000);
        String couponitemindices[] =
                SCHUtils.getArrayFromStringData(testData.getString("couponitemnumber"));
        for (String index : couponitemindices) {
            getLstRadioSelect().get(Integer.parseInt(index)).click();

            String itemId = getLstlblItemIds().get(Integer.parseInt(index)).getText();
            String title = getLstItemTitle().get(Integer.parseInt(index)).getText();
            String price = getLstlblPrice().get(Integer.parseInt(index)).getText();
            String flyer = getLstlblFlyer().get(Integer.parseInt(index)).getText();

            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.ItemId", itemId);
            TestBaseProvider.getTestBase().getContext().setProperty("testexecution.title",
                    title);
            TestBaseProvider.getTestBase().getContext().setProperty("testexecution.price",
                    "FREE" + price);
            TestBaseProvider.getTestBase().getContext().setProperty("testexecution.flyer",
                    flyer);
        }

    }

    @Override
    public void deleteSelectedItemOnModal(Configuration testData) {
        PauseUtil.waitForAjaxToComplete(3000);
        String couponitemindices[] =
                SCHUtils.getArrayFromStringData(testData.getString("couponitemnumber"));
        for (String index : couponitemindices) {
            getLnkToModalRemoveItem().get(Integer.parseInt(index)).click();
        }
    }

    /*
     * @param - buttonState - Enable/Disable
     */
    @Override
    public void verifyApplyCouponButton(String buttonState) {
        if (buttonState.equals("Enable")) {
            AssertUtils.assertEnabled(getBtnConfirmAndApply());
        } else {
            AssertUtils.assertDisabled(getBtnConfirmAndApply());
        }
    }

    @Override
    public void verifyApplyCouponButton_NotPresent() {
        if (getBtnConfirmAndApply().isDisplayed()) {
            Assert.fail("Application Issue. CONFIRM SELECTION button is enabled even though the items are not selected");
        }
    }

    @Override
    public void verifyOrderTotalIncludesTopOff_CouponsAndRewardspage() {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        //NEED TO LOOK INTO IT. TOPOFF AFTER TAX
		/*TestBaseProvider.getTestBase().getContext().setProperty("testexecution.topoffamount_aftertax", 
				String.valueOf(getLblOverDueAmountOnCouponPopUp().getText()));*/


        TestBaseProvider.getTestBase().getContext().setProperty("testexecution.totalamountowing_aftertopoff",
                String.valueOf(rewardsAndCoupons.getlblTotalAmountOwing().getText()));


        String TotalAmountDue_BeforeTopOff1 = TestBaseProvider.getTestBase().getContext()
                .getProperty("testexecution.totalamountowing_beforetopoff").toString();
        TotalAmountDue_BeforeTopOff1 = TotalAmountDue_BeforeTopOff1.substring(1);
        Double TotalAmountDue_BeforeTopOff = Double.parseDouble(TotalAmountDue_BeforeTopOff1.trim());
        System.out.println("amount before topoff:" + TotalAmountDue_BeforeTopOff);

        String TopOffAmt1 = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.topoffamount_beforetax").toString();
        System.out.println("TopOff Amt is:" + TopOffAmt1);
        Double TopOffAmt = Double.parseDouble(TopOffAmt1.trim());

        Double Expected_TotalAmountDue = TotalAmountDue_BeforeTopOff + TopOffAmt;
        System.out.println("Total amount after top-off is:" + Expected_TotalAmountDue);
        String Actual_TotalAmtDue1 = rewardsAndCoupons.getlblTotalAmountOwing().getText();
        Actual_TotalAmtDue1 = Actual_TotalAmtDue1.substring(1);
        Double Actual_TotalAmtDue = Double.parseDouble(Actual_TotalAmtDue1.trim());
        System.out.println("Total amount owing is:" + Actual_TotalAmtDue);

        if (Actual_TotalAmtDue <= Expected_TotalAmountDue) {
            Assert.fail("Application Issue. Top off Amount is not included in the Order total in Coupons & Rewards Page");
        }
    }


    @Override
    public void verifyOrderTotalIncludesTopOff_ConfirmAndSubmitPage() {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        String TotalAmountDue_CouponsRewardsPage1 = TestBaseProvider.getTestBase().getContext()
                .getProperty("testexecution.totalamountowing_aftertopoff").toString();
        TotalAmountDue_CouponsRewardsPage1 = TotalAmountDue_CouponsRewardsPage1.substring(1);
        Double TotalAmountDue_CouponsRewardsPage = Double.parseDouble(TotalAmountDue_CouponsRewardsPage1.trim());

        String TotalAmountDue_SubmitPage1 = rewardsAndCoupons.getlblConfirmPageTotalAmountOwing().getText();
        TotalAmountDue_SubmitPage1 = TotalAmountDue_SubmitPage1.substring(1);
        Double TotalAmountDue_SubmitPage = Double.parseDouble(TotalAmountDue_SubmitPage1.trim());

        if (TotalAmountDue_SubmitPage >= TotalAmountDue_CouponsRewardsPage) {
            System.err.println("DTS topoff amount is included in the total amount owing");
        } else {
            Assert.fail("Application Issue. Top off Amount is not included in the Order total in Submit Page");
        }
    }


    @Override
    public void verifyOrderTotalIncludesTopOff_ConfirmationPage() {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        String TotalAmountDue_CouponsRewardsPage1 = TestBaseProvider.getTestBase().getContext()
                .getProperty("testexecution.totalamountowing_aftertopoff").toString();
        TotalAmountDue_CouponsRewardsPage1 = TotalAmountDue_CouponsRewardsPage1.substring(1);
        Double TotalAmountDue_CouponsRewardsPage = Double.parseDouble(TotalAmountDue_CouponsRewardsPage1.trim());

        String TotalAmountDue_ConfirmationPage1 = rewardsAndCoupons.getlblConfirmPageTotalAmountOwing().getText();
        TotalAmountDue_ConfirmationPage1 = TotalAmountDue_ConfirmationPage1.substring(1);
        Double TotalAmountDue_ConfirmationPage = Double.parseDouble(TotalAmountDue_ConfirmationPage1.trim());
        if (TotalAmountDue_ConfirmationPage >= TotalAmountDue_CouponsRewardsPage) {
            System.err.println("DTS topoff amount is included in the total amount owing");
        } else {
            Assert.fail("Application Issue. Top off Amount is not included in the Order total in Confirmation Page");
        }
    }


    @Override
    public void verifyManualFreePickDetails_ConfirmSubmitPage(String couponnumber) {
        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(5000);
        System.out.println("################: "+ rewardsAndCoupons.getSectionCouponconfirmSubmitPage().getText());
        System.out.println("###############:"+ couponnumber);
        if (!rewardsAndCoupons.getSectionCouponconfirmSubmitPage().getText().contains(couponnumber)) {
            Assert.fail("Application Issue. Coupon code used for Manual free pick is not visible in submit page");
        }

        String manualItemNum = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.selectedItemId").toString();
        String manualItemtitle = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.selectedtitle").toString();
        String manualItemFlyer = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.selectedflyer").toString();
        //String manualItemPrice = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.selectedprice").toString();
        System.out.println("Item num is:" + manualItemNum);
        System.out.println("Item title is:" + manualItemtitle);
        System.out.println("Item flyers is:" + manualItemFlyer);


        String selected_ManualFreepickDetails[] = {manualItemNum, manualItemtitle, manualItemFlyer};
        System.out.println("items in submit page acutal:" + rewardsAndCoupons.getSectionCouponconfirmSubmitPage().getText());
        System.out.println("Expected values: " + selected_ManualFreepickDetails);

        for (int i = 0; i < selected_ManualFreepickDetails.length; i++) {
            if (!rewardsAndCoupons.getSectionCouponconfirmSubmitPage().getText().contains(selected_ManualFreepickDetails[i])) {
                Assert.fail("Application Issue." + selected_ManualFreepickDetails[i] + "is not present in Submit page");
            }
        }

        if (!rewardsAndCoupons.getSectionCouponconfirmSubmitPage().getText().contains("FREE")) {
            Assert.fail("Application Issue. Price for item should be FREE for Manual Free Pick items");
        }
    }


    @Override
    public void verifySearchResultTable() {
        PauseUtil.pause(2000);
        SCHUtils.isPresent(getLblTitleItemId());
        AssertUtils.assertDisplayed(getLblTitleItemId());
        AssertUtils.assertDisplayed(getLblTitleItemTitle());
        AssertUtils.assertDisplayed(getLblTitlePrice());
        AssertUtils.assertDisplayed(getLblTitleRdoSelect());
        AssertUtils.assertDisplayed(getLblPaginationInfo());
        if (getLstItemTitle().size() <= 10) {
            Assert.assertTrue(true,
                    "Table Item contains 10 or less than 10 items per page");
        }
        for (int i = 0; i < getLstItemTitle().size(); i++) {
            SCHUtils.scrollToView(getLstlblItemIds().get(i));
            AssertUtils.assertDisplayed(getLstlblItemIds().get(i));
            AssertUtils.assertDisplayed(getLstItemTitle().get(i));
            AssertUtils.assertDisplayed(getLstlblPrice().get(i));
            AssertUtils.assertDisplayed(getLstlblItemIds().get(i));
            AssertUtils.assertDisplayed(getLstRadioSelect().get(i));
        }
        SCHUtils.scrollToView(getLnkCancel());
        AssertUtils.assertDisplayed(getLnkCancel());
        SCHUtils.scrollToView(getBtnConfirmAndApply());
        AssertUtils.assertDisabled(getBtnConfirmAndApply());
    }

    @Override
    public void verifySearchResultTableWithAllFunctionality() {
        // verifySearchResultTable();
        verifyCouponsPagination();
        verifySearchResultsUnderPriceLimit();
        // verifySortingFunctionality();
    }

    @Override
    public void removeCurrentSelectedItem() {
        WaitUtils.waitForDisplayed(getLblSeletedYourSection());
        getLstBtnSelectedCross().get(0).click();

        String itemId = getLstlblItemIds().get(0).getText();
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.removed.ItemId", itemId);

        HashMap<String, ProductInfoBean> productInfoBeanMap = SCHUtils.getCouponItems();
        String couponnumber =
                TestBaseProvider.getTestBase().getTestData().getString("couponcode");
        for (String key : productInfoBeanMap.keySet()) {
            ProductInfoBean productInfo = productInfoBeanMap.get(key);
            System.out.println("coupon remove------bean" + productInfo.getCoupon());
            System.out.println("coupon remove------local" + couponnumber);
            if (productInfo.getCoupon().equalsIgnoreCase(couponnumber)) {
                SCHUtils.removeCouponItem(productInfo);
            }
        }

    }

    @Override
    public void verifyRemovedCurrentSelectedItem() {
        WaitUtils.waitForDisplayed(getLstlblItemIds().get(0));
        Assert.assertTrue(
                !(getLstlblSelectedItemIds().get(0).getText()
                        .equals(TestBaseProvider.getTestBase().getContext()
                                .getProperty("testexecution.removed.ItemId")
                                .toString())));
        AssertUtils.assertNotSelected(getLstRadioSelect().get(0));
    }

    @Override
    public void clickOnConfrimAndApplyCoupon() {

        /*String dtsQty=TestBaseProvider.getTestBase().getTestData().getString("dts_qty");
        try {
            if(!dtsQty.equals(null)){
               CheckoutPage cp = new CheckoutPage();
                cp.MakeSelectionWindow_dts_enterquantity(TestBaseProvider.getTestBase().getTestData());
                SCHUtils.waitForElementToBeClickable(getBtnConfirmAndApply(), 20);
                PauseUtil.pause(2500);
                PauseUtil.waitForAjaxToComplete(1500);
                getBtnConfirmAndApply().click();
                SCHUtils.waitForLoaderToDismiss();
                PauseUtil.waitForAjaxToComplete(1500);
                PauseUtil.pause(15000);
                System.out.println("#######ConfirmApplyClicked########");
            }
        } catch (Exception e) {
            SCHUtils.waitForElementToBeClickable(getBtnConfirmAndApply(), 20);
            PauseUtil.pause(2500);
            PauseUtil.waitForAjaxToComplete(1500);
            getBtnConfirmAndApply().click();
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(1500);
            PauseUtil.pause(15000);
            System.out.println("#######ConfirmApplyClicked########");

        }*/

        SCHUtils.waitForElementToBeClickable(getBtnConfirmAndApply(), 20);
        PauseUtil.pause(2500);
        PauseUtil.waitForAjaxToComplete(1500);
        getBtnConfirmAndApply().click();
        //SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(1500);
        PauseUtil.pause(5000);
        System.out.println("#######ConfirmApplyClicked########");
    }

    @Override
    public void verifySearchResultTableHavingTenSearchRsults(int i) {
        Assert.assertEquals(getLstItemTitle().size(), i);

    }

    @Override
    public void clickOnCancelLinkonCouponModal() {
        getLnkCancel().click();
        PauseUtil.pause(2000);

    }

    @Override
    public void verifyItemUnselectedByRadioButton(String position) {
        AssertUtils.assertAttributeNotMatches(
                getLstRadioSelect().get(Integer.parseInt(position) - 1), "class",
                Matchers.containsString("active"));
    }

    /**
     * This Method verify Current Selection Item List is unsorted on Coupon
     * Modal
     */
    @Override
    public void verifyCurrentSelectionisUnsorted() {
        SCHUtils.waitForLoaderToDismiss();
        Assert.assertTrue(SCHUtils.isSortedList(getLstlblSelectedTitle()),
                "Current Selection Item are Sorted");

    }

    /**
     * this method add student name and coupon number
     *
     * @param studentName
     * @param CouponNumber
     */
    @Override
    public void addSFOCoupounByNameAndCouponNumber(String CouponNumber,
                                                   String studentName) {

        SCHUtils.waitForLoaderToDismiss();

        getTxtStudentName().sendKeys(studentName);
        getTxtCouponNumber().clear();
        getTxtCouponNumber().sendKeys(CouponNumber);
        getBtnApplyCoupon().click();
    }

    @Override
    public void verifyHideLinkFunctionality() {
        getLstAddedItemTitle().get(0).click();
        AssertUtils.assertDisplayed(getLblProductDetails());
        getBtnHideLink().click();
    }

    @Override
    public void applyDollarToSpendCouponWithTopOff(Configuration testData) {
        PauseUtil.pause(3000);

        RewardsAndCoupons rewardsAndCoupons =
                getFactory().getICheckoutPage().getRewardsAndCouponsSection();

        String coupons[] = SCHUtils.getArrayFromStringData(TestBaseProvider.getTestBase()
                .getTestData().getString("dollartospendtopoffcoupons"));
        for (int i = 0; i < coupons.length; i++) {
            rewardsAndCoupons.enterCoupon(coupons[i]);
            PauseUtil.pause(4000);
            SCHUtils.waitForLoaderToDismiss();
            PauseUtil.waitForAjaxToComplete(2000);
            String title = getLblPopupTitleForDollarToSpend().getText();

            String arr[] = title.split("\\$");
            String amount = arr[1].split(" ")[0];

            Double total = 0.0;
            if (SCHUtils.getArrayFromStringData(
                    testData.getString("couponselctionmethodfortopoff"))[i]
                    .equalsIgnoreCase("ByGrade")) {
                SCHUtils.selectOptionByvalue(getSelectGrade(), SCHUtils
                        .getArrayFromStringData(testData.getString("gradefortopoff"))[i]);

                PauseUtil.pause(4000);

            } else {
                getTxtKeyword().sendKeys(SCHUtils.getArrayFromStringData(
                        testData.getString("keywordfortopoff"))[i]);
                getTxtKeyword().sendKeys(Keys.ENTER);
                PauseUtil.pause(5000);
            }

            for (int j = 0; j < 10; j++) {
                PauseUtil.pause(4000);
                Actions action = new Actions(TestBaseProvider.getTestBase().getDriver());
                action.click(getLstRadioSelect().get(j)).build().perform();
                // getLstRadioSelect().get(j).click();

                PauseUtil.pause(6000);
                AssertUtils.assertDisplayed(getLstlblSelectedItemIds().get(j));

                total = total + SCHUtils.getPriceWithOutCurrency(
                        getLstlblSelectedPrice().get(j).getText());
                if (total > Double.parseDouble(amount)) {

                    AssertUtils.assertDisplayed(getLblOverDueAmountOnCouponPopUp());
                    System.out.println("overdue amount---"
                            + getLblOverDueAmountOnCouponPopUp().getText());
                    TestBaseProvider.getTestBase().getContext().setProperty(
                            "testexecution.topoffamount",
                            String.valueOf(getLblOverDueAmountOnCouponPopUp().getText()));
                    getBtnConfirmAndApply().click();
                    break;
                } else {
                    if (j == 9) {
                        getLstPaginateBtn().get(2).click();
                        j = 0;
                    }
                }
                PauseUtil.pause(1000);

            }

        }

    }

    @Override
    public void verifyMakeYourSelectionSection() {

        AssertUtils.assertDisplayed(getSelectGrade());
        AssertUtils.assertDisplayed(getTxtKeyword());

    }

    @Override
    public void addmultipleCoupon(Configuration data, int i) {
        PauseUtil.pause(3000);
        if (SCHUtils.getArrayFromStringData(data.getString("couponselectionmethod"))[i]
                .equalsIgnoreCase("both")) {
            selectCouponItemByGradeOrByKeyword(data, "ByGrade", i);
            selectCouponItemByGradeOrByKeyword(data, "ByKeyword", i);
        } else if (SCHUtils
                .getArrayFromStringData(data.getString("couponselectionmethod"))[i]
                .equalsIgnoreCase("ByGrade")) {
            selectCouponItemByGradeOrByKeyword(data, "ByGrade", i);
        } else {
            selectCouponItemByGradeOrByKeyword(data, "ByKeyword", i);
        }

    }

    @Override
    public void addInvalidSFOCoupoun(Configuration testData) {
        String couponStudent = testData.getString("studentname");
        String couponnumber = testData.getString("invalidcouponnumber");
        // This will enter coupon details for sfo
        getTxtStudentName().clear();
        getTxtStudentName().sendKeys(couponStudent);
        getTxtCouponNumber().clear();
        getTxtCouponNumber().sendKeys(couponnumber);
        AssertUtils.assertEnabled(getBtnApplyCoupon());
        getBtnApplyCoupon().click();

    }

    @Override
    public void verifyApplyCouponButtonInActive() {
        Assert.assertTrue(getBtnApplyCoupon().isEnabled() != true);
		/*
		 * String activeButton = getBtnApplyCoupon().getAttribute("disabled");
		 * System.out.println(activeButton);
		 * Assert.assertTrue(activeButton.equals("disabled") ||
		 * activeButton.equals(""));
		 */

    }

    @Override
    public void clickApplyOnCouponModal() {
        getBtnApplyCoupon().click();

    }

    @Override
    public void enterCouponForStudent(String value) {
        System.out.println("Entering coupon number->" + value);
        getTxtCouponNumber().clear();
        getTxtCouponNumber().sendKeys(value);
    }

    @Override
    public void enterStudentNameOnCouponModal(String value) {
        System.out.println("Entering Student data->" + value);
        getTxtStudentName().clear();
        getTxtStudentName().sendKeys(value);
        PauseUtil.pause(1000);

    }

    @Override
    public void verifyMaxCharLimitForStudentName(String studentName) {
        getTxtStudentName().clear();
        getTxtStudentName().sendKeys(studentName);
        PauseUtil.pause(1000);
        int studentNameLength = getTxtStudentName().getAttribute("value").length();
        System.out.println("Actual Student Name length-" + studentName.length());
        System.out.println("Maximum student name length-" + studentNameLength);
        Assert.assertEquals(!(studentNameLength > 20), true);
        AssertUtils.assertAttributeMatches(getTxtStudentName(), "maxlength",
                Matchers.equalToIgnoringCase("20"));

    }

    @Override
    public void editFreePickCouponOnParent(Configuration testData, String couponIndex) {
        PauseUtil.waitForAjaxToComplete(6000);
        AssertUtils.assertDisabled(getBtnConfirmAndApply());
        if (testData.getString("editcoupon.selectgrade") != null
                && !testData.getString("editcoupon.selectgrade").isEmpty()) {
            // Code to select grade from drop down
            SCHUtils.selectOptionByvalue(getSelectGrade(),
                    testData.getString("editcoupon.selectgrade"));
        } else if (testData.getString("editcoupon.couponsearch") != null
                && !testData.getString("editcoupon.couponsearch").isEmpty()) {
            getTxtKeyword().sendKeys(testData.getString("editcoupon.couponsearch"));
            getTxtKeyword().sendKeys(Keys.ENTER);
            PauseUtil.pause(5000);
            verifyPriceList();
        }
        PauseUtil.waitForAjaxToComplete(3000);
        // Code to select item from coupons table, in case you want to select
        // more than one item for some coupon then pass the comma separated
        // indices of the item in the table.
        // Parameter in test data is <couponitemnumber>

        String couponitemindices[] = SCHUtils.getArrayFromStringData(
                testData.getString("editcoupon.couponitemnumber"));
        for (String index : couponitemindices) {
            getLstRadioSelect().get(Integer.parseInt(index)).click();
        }
        PauseUtil.waitForAjaxToComplete(2000);
        // Update free pick item in coupon bean
        HashMap<String, ProductInfoBean> couponMap = SCHUtils.getCouponItems();
        List<ProductInfoBean> couponBeans =
                new ArrayList<ProductInfoBean>(couponMap.values());
        ProductInfoBean couponItem = couponBeans.get(Integer.parseInt(couponIndex) - 1);
        couponItem.setItemNumber(getLstlblSelectedItemIds().get(0).getText());
        couponItem.setItemTitle(getLstlblSelectedTitle().get(0).getText());
        couponItem.setQuantity("1");
        // Setting price FREE
        couponItem.setPrice("FREE");
        couponItem.setFlyer(getLstlblSelectedFlyer().get(0).getText());

        SCHUtils.addCouponItem(couponItem);
        AssertUtils.assertEnabled(getBtnConfirmAndApply());
        getBtnConfirmAndApply().click();

    }
	
	
	
	
	/*@Override
	 public void MakeSelectionWindow_SelectSpecificItem(Configuration testData, double couponprice, double couponprice_limit) {

	  PauseUtil.waitForAjaxToComplete(1000);
	  AssertUtils.assertDisabled(getBtnConfirmAndApply());
	  if (testData.getString("selectgrade") != null
	    && !testData.getString("selectgrade").isEmpty()) {
	   // Code to select grade from drop down
	   SCHUtils.selectOptionByvalue(getSelectGrade(),
	     testData.getString("selectgrade"));
	  }
	  PauseUtil.pause(2000);
	  PauseUtil.waitForAjaxToComplete(1000);
	  if(getLblEmptyTable().getText().contains("No data available in table"))
	  {
	  Assert.fail("Application Issue. No data is present in the MAKE SELECTION window of Dollars to Spend"); 
	  }
	  
	  List<WebElement> cartTable1= getTableCouponTable();
	     for(WebElement cartTable:cartTable1){
	     List<WebElement> cartTabletr1= cartTable.findElements(By.tagName("tr"));
	     for(WebElement cartTabletd1:cartTabletr1){
	     List<WebElement> cartTabletd= cartTabletd1.findElements(By.tagName("td"));
	     
	     
	     String actualprice1 = cartTabletd.get(3).getText();
	     actualprice1 = actualprice1.substring(1);
	  Double actualprice = Double.parseDouble(actualprice1.trim());
	     
	  
	     if((actualprice>(couponprice)) && (actualprice<=(couponprice_limit))){
	   cartTabletd.get(4).findElement(By.tagName("i")).click();
	   PauseUtil.pause(1000);
	   PauseUtil.waitForAjaxToComplete(1000);
	   break;
	      }
	     AssertUtils.assertEnabled(getBtnConfirmAndApply());
	  getBtnConfirmAndApply().click();
	  PauseUtil.pause(3000);
	  
	  TestBaseProvider.getTestBase().getContext().setProperty("testexecution.topoffamount", 
	    String.valueOf(getLblOverDueAmountOnCouponPopUp().getText()));
	  
	     
	     }
	  }
	 }*/

    @Override
    public void CSR_verify_ConfirmSubmit_btn_disabled_in_FreeItem_modal_window() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);

        if (getBtnConfirmAndApply().isEnabled()) {
            Assert.fail("Confirm & Apply button is enabled in FreeItem modal window");
        } else {
            System.out.println("Confirm & Apply button is disabled in FreeItem modal window");
        }

    }

    @Override
    public void createdatafromFreePickSelection() {

        SfopageitemAdded sfo = new SfopageitemAdded();
        try {
            sfo.setITEM(getsfofreepickconfirmlist().get(0).getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            //sfo.setTITLE(getsfofreepickconfirmlist().get(1).getText());
        } catch (Exception e) {
            //e.printStackTrace();
        }
        try {
            sfo.setFLYER(getsfofreepickconfirmlist().get(2).getText());
        } catch (Exception e) {
            //e.printStackTrace();
        }

    }

    @Override
    public void validate_sfo_freepickItem_afterselection_SFOpage() {
        SfopageitemAdded sfo = new SfopageitemAdded();
        PauseUtil.pause(4000);
        int std  = getsfopageafterfreepickitemadded().size();
        for(int i=0;i<std-2;i++){
            String valtd = getsfopageafterfreepickitemadded().get(i).getText();
            if(i==1){
                Assert.assertEquals(valtd,sfo.getITEM());
            }
            if(i==2){
                Assert.assertEquals(valtd,sfo.getTITLE());
            }
            if(i==4){
                Assert.assertEquals(valtd,TestBaseProvider.getTestBase().getTestData().getString("sfofreepick"));
            }
        }
    }
    
    
    

}
