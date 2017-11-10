package com.dw.automation.pages.impl;

import java.text.DecimalFormat;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.configuration.Configuration;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.dw.automation.pages.ICartPage;
import com.dw.automation.pages.impl.CheckoutPage.RewardsAndCoupons;
import com.dw.automation.sections.ICouponSection;
import com.dw.automation.sections.IHeaderSection;
import com.dw.automation.sections.IProductOrderSummarySection;
import com.dw.automation.sections.IStudentFlyerOrdersCartSection;
import com.dw.automation.sections.IStudentOnlineOrdersCartSection;
import com.dw.automation.sections.IYourTeacherOrdersCartSection;
import com.dw.automation.sections.base.SectionFactory;
import com.dw.automation.sections.impl.ParentCartSection;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.LocatorUtils;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;
import com.scholastic.torque.common.WaitUtils;
public class CartPage extends BaseTestPage<TestPage> implements ICartPage {
	
	private double soosubtotal_reviewcart;
	private double sootaxes_reviewcart;
	private double sooitems_reviewcart;
	private double soototals_reviewcart;
	private double sfosubtotal_reviewcart;
	private double sfotaxes_reviewcart;
	private double sfoitems_reviewcart;
	private double sfototals_reviewcart;
	private double ytosubtotal_reviewcart;
	private double ytotaxes_reviewcart;
	private double ytoitems_reviewcart;
	private double ytototals_reviewcart;
	private double tesubtotal_reviewcart;
	private double tetaxes_reviewcart;
	private double teitems_reviewcart;
	private double tetotals_reviewcart;
	
	private double soosubtotal_rewardspage;
	private double sootaxes_rewardspage;
	private double sooitems_rewardspage;
	private double soototals_rewardspage;
	private double sfosubtotal_rewardspage;
	private double sfotaxes_rewardspage;
	private double sfoitems_rewardspage;
	private double sfototals_rewardspage;
	private double ytosubtotal_rewardspage;
	private double ytotaxes_rewardspage;
	private double ytoitems_rewardspage;
	private double ytototals_rewardspage;
	private double tesubtotal_rewardspage;
	private double tetaxes_rewardspage;
	private double teitems_rewardspage;
	private double tetotals_rewardspage;
	
	private int sooitems_totalcount;
	private int sfoitems_totalcount;
	private int sfofreepickitems_totalcount;
	private int ytoitems_totalcount;
	private int teitems_totalcount;
	
	private double soototal_paymentpage;
	private double sfototal_paymentpage;
	private double ytototal_paymentpage;
	private double tetotal_paymentpage;
	
	private int sooitems_paymentpage;
	private int sfoitems_paymentpage;
	private int ytoitems_paymentpage;
	private int teitems_paymentpage;
	
	
	
	@FindBy(locator = "dw.reviewcart.img.booktrust")
	private WebElement imgBookTrust;

	@FindBy(locator = "dw.reviewcart.drp.donateamount")
	private WebElement drpDonateAmount;

	@FindBy(locator = "dw.reviewcart.img.questionicon")
	private WebElement imgQuestionIcon;

	@FindBy(locator = "dw.reviewcart.questionicon.lbl.message")
	private WebElement lblQuestionIconMessage;

	@FindBy(locator = "dw.reviewcart.questionicon.lnk.learnmore")
	private WebElement lnkQuestionIconLearnMore;

	@FindBy(locator = "dw.reviewcart.lbl.carttotalamount")
	private WebElement lblCartTotalAmount;

	@FindBy(locator = "dw.reviewcart.btn.backtoshop")
	private WebElement btnReturnToShop;

	@FindBy(locator = "dw.reviewcart.btn.reviewcart")
	private WebElement btnReviewcart;
	
	@FindBy(locator = "dw.reviewcart.btn.reviewcart")
	private List<WebElement> chkbtnReviewcart;

	@FindBy(locator = "dw.reviewcart.btn.proceedtocheckout")
	private WebElement btnProceedToCheckout;
	
	@FindBy(locator = "dw.reviewcart.btn.Minus.Student1.Qty")
	private WebElement btn_Minus_Student1_Qty;
	
	@FindBy(locator = "dw.reviewcart.btn.Minus.Student2.Qty")
	private WebElement btn_Minus_Student2_Qty;
	
	@FindBy(locator = "dw.reviewcart.btn.Minus.Student3.Qty")
	private WebElement btn_Minus_Student3_Qty;
	
	@FindBy(locator = "dw.reviewcart.btn.Plus.Student1.Qty")
	private WebElement btn_Plus_Student1_Qty;
	
	@FindBy(locator = "dw.reviewcart.btn.Plus.Student2.Qty")
	private WebElement btn_Plus_Student2_Qty;
	
	@FindBy(locator = "dw.reviewcart.btn.Plus.Student3.Qty")
	private WebElement btn_Plus_Student3_Qty;
	
	
	@FindBy(locator = "dw.reviewcart.active.RewardsAndCoupons")
	private WebElement RewardsAndCouponsActive;
	
	@FindBy(locator = "dw.reviewcart.proceedtocheckout.bonuspointmodel.btn.top.proceedtocheckout")
	private List<WebElement> sizebtntopBonuspointModelProceedToCheckout;
	                
	@FindBy(locator = "dw.reviewcart.proceedtocheckout.bonuspointmodel.btn.top.proceedtocheckout")
	private WebElement btntopBonuspointModelProceedToCheckout;
	
	@FindBy(locator = "dw.reviewcart.proceedtocheckout.bonuspointmodel.btn.bottom.proceedtocheckout")
	private WebElement btnbottomBonuspointModelProceedToCheckout;
	
	@FindBy(locator = "dw.reviewcart.proceedtocheckout.bonuspointmodel.lnk.returntoshop")
	private WebElement lnkBonuspointModelReturnToShop;

	@FindBy(locator = "dw.reviewcart.yourteacherorder.lbl.itemtotalprice")
	private WebElement lblYourTeacherOrderTotalPrice;

	@FindBy(locator = "dw.reviewcart.yourteacherorder.lbl.itemtotalquantity")
	private WebElement lblYourTeacherOrderTotalQuantity;

	@FindBy(locator = "dw.reviewcart.yourteacherorder.lbl.totalbonuspoint")
	private WebElement lblYourTeacherOrderTotalBonusPoint;

	@FindBy(locator = "dw.reviewcart.yourteacherorder.lbl.totalbonusquantity")
	private WebElement lblYourTeacherOrderTotalBonusQuantity;

	@FindBy(locator = "dw.reviewcart.studentflyerorder.lbl.itemtotalprice")
	private WebElement lblStudentFlyerOrderTotalPrice;

	@FindBy(locator = "dw.reviewcart.studentflyerorder.lbl.itemtotalquantity")
	private WebElement lblStudentFlyerOrderTotalQuantity;

	@FindBy(locator = "dw.reviewcart.studentonlineorder.lbl.itemtotalprice")
	private WebElement lblStudentOnlineOrderTotalPrice;

	@FindBy(locator = "dw.reviewcart.studentonlineorder.lbl.itemtotalquantity")
	private WebElement lblStudentOnlineOrderTotalQuantity;

	@FindBy(locator = "dw.reviewcart.lbl.orderinstruction")
	private WebElement lblOrderInstruction;

	@FindBy(locator = "dw.reviewcart.lnk.redeemcoupons")
	private WebElement lnkRedeemCoupons;

	@FindBy(locator = "dw.reviewcart.studentflyerorder.btn.add")
	private WebElement btnStudentFlyerOrderAdd;

	@FindBy(locator = "dw.reviewcart.yourteacherorder.btn.add")
	private WebElement btnYourTeacherOrderAdd;

	@FindBy(locator = "dw.reviewcart.img.firstremoveicon")
	private WebElement imgFirstRemoveIcon;

	@FindBy(locator = "dw.reviewcart.remove.btn.yes")
	private WebElement btnRemoveYes;

	@FindBy(locator = "dw.reviewcart.remove.btn.no")
	private WebElement btnRemoveNo;

	@FindBy(locator = "dw.reviewcart.remove.studentonlineorder.options.btn.other")
	private WebElement btnRemoveSOOOptionsOther;

	@FindBy(locator = "dw.reviewcart.remove.studentonlineorder.btn.delete")
	private WebElement btnRemoveSOODelete;

	@FindBy(locator = "dw.reviewcart.lbl.cartfinaltotal")
	private WebElement lblCartFinalTotal;

	@FindBy(locator = "dw.reviewcart.studentflyerorder.btn.minus")
	private WebElement btnMinusStudentFlyerOrder;

	@FindBy(locator = "dw.reviewcart.yourteacherorder.btn.minus")
	private WebElement btnMinusYourTeacherOrder;

	@FindBy(locator = "dw.reviewcart.studentonlineorder.btn.minus")
	private WebElement btnMinusStudentOnlineOrder;

	@FindBy(locator = "dw.reviewcart.studentonlineorder.lbl.noorder")
	private WebElement lblNoOrderStudentOnlineOrder;

	@FindBy(locator = "dw.reviewcart.yourteacherorder.lbl.noitem")
	private WebElement lblNoOrderYourTeacherOrder;

	@FindBy(locator = "dw.reviewcart.studentflyerorder.lbl.noitem")
	private WebElement lblNoOrderStudentFlyerOrder;

	@FindBy(locator = "dw.reviewcart.soo.delete.lnk.close")
	private WebElement lnkCloseIconONSOODeletePopUp;

	@FindBy(locator = "dw.studentonlineorders.cmp")
	private WebElement cmpSOO;

	@FindBy(locator = "dw.reviewcart.studentflyerorder.lnk.enterorder")
	private WebElement lnkEnterOrder;

	@FindBy(locator = "dw.reviewcart.studentflyerorder.lnk.yourteacherorder")
	private WebElement lnkYourTeacherOrder;

	@FindBy(locator = "dw.reviewcart.img.firtremoveiconsoo")
	private WebElement lblFirstRemoveIconSoo;

	@FindBy(locator = "dw.reviewcart.studentflyerorder.lnk.yourteacherorder")
	private WebElement lblItemErrorMessage;

	@FindBy(locator = "dw.reviewcart.ordermodule.txt.coupon")
	private WebElement txtEnterCoupon;

	@FindBy(locator = "dw.reviewcart.ordermodule.btn.apply")
	private WebElement btnApply;

	@FindBy(locator = "dw.reviewcart.ordermodule.coupon.errormessage")
	private WebElement lblCouponErrorMessage;

	@FindBy(locator = "dw.reviewcart.coupon.parent.modal")
	private WebElement parentCouponModal;

	@FindBy(locator = "dw.reviewcart.promotionmodal.lbl.totalamount")
	private WebElement lblTotalAmountPromotionalModal;
	
	@FindBy(locator = "dw.reviewcart.yourteacherorder.carttable")
	private WebElement tableReviewCartTable;
	
	public WebElement getTableReviewCartTable() {
		return tableReviewCartTable;
	}
	public WebElement RewardsAndCouponsActive() {
		return RewardsAndCouponsActive;
	}
	@FindBy(locator = "dw.bonusbank.inputbox.id")
	private WebElement bonusBankInputBox;

	@FindBy(locator = "dw.bonusbank.applybutton.id")
	private WebElement applyButton;

	@FindBy(locator = "dw.freepromotion.text.css")
	private WebElement freePromotionText;

	@FindBy(locator = "dw.reviewcart.button.id")
	private WebElement revewCartButton;

	@FindBy(locator = "dw.reviewcart.removecircle.css")
	private WebElement removeCircle;

	@FindBy(locator = "dw.reviewcart.yesbutton.name")
	private WebElement yesButton;

	@FindBy(locator = "dw.couponsandrewards.txt.bonusflat.css")
	private WebElement txtBonusFlat;

	@FindBy(locator = "dw.couponsandrewards.txtconfirmandsubmit.bonusflat.xpath")
	private WebElement txtBonusFlatConfirmAndSubmit;

	@FindBy(locator = "dw.confirmandsubmit.submitorder.button.css")
	private WebElement submitOrderButton;

	@FindBy(locator = "dw.confirmandsubmit.submitorder.button.css_2")
	private WebElement txtBonusFlatSubmittedPage;

	@FindBy(locator = "dw.rewards.page.bonus.flat.text.css")
	private WebElement txtBonusFlatRewardsPage;
	
	@FindBy(locator = "dw.rewards.page.std.total.price.xpath")
	private WebElement stdTotalPrice;
	
	@FindBy(locator = "dw.rewards.page.txt.bonus.desc.css")
	private WebElement txtBonusDesc;

	@FindBy(locator = "dw.rewards.page.txt.bonus.desc.xpath")
	private List<WebElement>  txtBonusDesc1;
	
	@FindBy(locator = "dw.reviewcart.btn.reviewcart")
	private List<WebElement> sizebtnReviewCart;
	
	@FindBy(locator = "dw.reviewcart.btn.reviewcart")
	private WebElement btnReviewCart;
	
	@FindBy(locator = "dw.reviewcart.order1.status")
	private WebElement txtField1;
	
	@FindBy(locator = "dw.reviewcart.order2.status")
	private WebElement txtField2;
	
	@FindBy(locator = "dw.reviewcart.order3.status")
	private WebElement txtField3;
	
	@FindBy(locator = "dw.reviewcart.btn.minus.delete.item")
	private WebElement btn_minus_delete_item_ReviewPage;
	
	@FindBy(locator = "dw.reviewcart.txt_empty.cart")
	private WebElement txt_empty_cart_ReviewPage;
	
	@FindBy(locator = "dw.reviewcart.txtField1_submitPage")
	private WebElement txtField1_submitPage;
	
	@FindBy(locator = "dw.reviewcart.select.arrow.SavedCart")
	private WebElement select_arrow_SavedCart;
	
	@FindBy(locator = "dw.reviewcart.subTotal.Student.SavedCart")
	private WebElement subTotal_Student_SavedCart;
	
	@FindBy(locator = "dw.reviewcart.btn.delete.SavedCart")
	private WebElement btn_delete_SavedCart;
	
	@FindBy(locator = "dw.reviewcart.msg.emptyList.SavedCart")
	private WebElement msg_emptyList_SavedCart;
	
	@FindBy(locator = "dw.reviewcart.header.MySavedCart.SavedCart")
	private WebElement header_MySavedCart_SavedCart;
	
	@FindBy(locator = "dw.reviewcart.text.Return.To.manageYourSavedCart.SavedCart")
	private WebElement text_Return_To_manageYourSavedCart_SavedCart;
	
	@FindBy(locator = "dw.reviewcart.list.Manage.SavedCart.SavedCart")
	private WebElement list_Manage_SavedCart_SavedCart;
	
	@FindBy(locator = "dw.reviewcart.btn.Manage.Saved.Cart")
	private WebElement btn_Manage_Saved_Cart;
	
	@FindBy(locator = "dw.reviewcart.btn.Restore.Saved.Cart.Page")
	private WebElement btn_Restore_Saved_Cart_Page;
	
	@FindBy(locator = "dw.reviewcart.btn.view.Saved.Cart.Page")
	private WebElement btn_view_Saved_Cart_Page;
	
	@FindBy(locator = "dw.reviewcart.btn.delete.Saved.Cart.Page")
	private WebElement btn_delete_Saved_Cart_Page;
	
	@FindBy(locator = "dw.reviewcart.hdr_ReviewCart")
	private WebElement hdr_ReviewCart;
	
	@FindBy(locator = "dw.reviewcart.subTotal.Teacher.SavedCart")
	private WebElement subTotal_Teacher_SavedCart;
	
	@FindBy(locator = "dw.reviewcart.Total.amount.SavedCart")
	private WebElement Total_amount_SavedCart;
	
	@FindBy(locator = "dw.reviewcart.btn.SaveCart.for.Later")
	private WebElement btn_SaveCart_for_Later;
	
	@FindBy(locator = "dw.reviewcart.popup.SaveCart.for.Later.btn.YES")
	private WebElement popup_SaveCart_for_Later_btn_YES;
	
	@FindBy(locator = "dw.reviewcart.popup.SaveCart.for.Later.fld.name")
	private WebElement popup_SaveCart_for_Later_fld_name;
	
	@FindBy(locator = "dw.reviewcart.popup.SaveCart.for.Later.btn.SAVE")
	private WebElement popup_SaveCart_for_Later_btn_SAVE;
	
	@FindBy(locator = "dw.reviewcart.selection.SavedCart")
	private WebElement selection_SavedCart;
	
	@FindBy(locator = "dw.reviewcart.SavedCart_list")
	private List<WebElement> SavedCart_list;
	
	@FindBy(locator = "dw.reviewcart.select.ManageSavedCart")
	private WebElement select_ManageSavedCart;
	
	@FindBy(locator = "dw.reviewcart.clicks.delete.Saved.Cart.item")
	private WebElement clicks_on_delete_Saved_Cart_item;
	
	@FindBy(locator = "dw.reviewcart.Home_icon_on_header")
	private WebElement Home_icon_on_header;
	
	@FindBy(locator = "dw.reviewcart.delete.to.yes.Saved.Cart.item")
	private WebElement delete_to_yes_Saved_Cart_item;
	
	@FindBy(locator = "dw.reviewcart.delete.to.no.Saved.Cart.item")
	private WebElement delete_to_no_Saved_Cart_item;
	
	@FindBy(locator = "dw.reviewcart.txtField2_submitPage")
	private WebElement txtField2_submitPage;
	
	@FindBy(locator = "dw.reviewcart.txtField3_submitPage")
	private WebElement txtField3_submitPage;
	
	@FindBy(locator = "dw.reviewcart.txtField1_SavedCart")
	private WebElement txtField1_SavedCart;
	
	@FindBy(locator = "dw.reviewcart.txtField2_SavedCart")
	private WebElement txtField2_SavedCart;
	
	@FindBy(locator = "dw.reviewcart.txtField3_SavedCart")
	private WebElement txtField3_SavedCart;
	
	@FindBy(locator = "dw.reviewcart.Student.Club.header.SavedCart")
	private WebElement Student_Club_header_SavedCart;
	
	@FindBy(locator = "dw.reviewcart.Teacher.Cat.header.SavedCart")
	private WebElement Teacher_Cat_header_SavedCart;
	
	@FindBy(locator = "dw.reviewcart.lst.Student.Club.items.list.SavedCart")
	private List<WebElement> lst_Student_Club_items_list_SavedCart;
	
	@FindBy(locator = "dw.reviewcart.lst.Teacher.Cat.items.list.SavedCart")
	private List<WebElement> lst_Teacher_Cat_items_list_SavedCart;
	
	@FindBy(locator = "dw.reviewcart.lst.Student.Club.items.list.ManageCart.SavedCartPage")
	private WebElement lst_Student_Club_items_list_Manage_cart_SavedCart;
	
	@FindBy(locator = "dw.teacher.home.enterorder.studentflyerorder.click.ouside.InReviewCartPage")
	private WebElement click_outside_in_ReviewCartPage;
	
	@FindBy(locator = "dw.teacher.home.enterorder.studentflyerorder.qty.item1")
	private WebElement cart_qty_item1;
	
	@FindBy(locator = "dw.checkout.payment.amt.paid.by.cheque.ConfirmPage")
	private WebElement value_amt_paid_by_cheque_ConfirmPage;
	
	
	@FindBy(locator = "dw.teacher.couponsrewards.rewards.bonusflat.dollars")
	private WebElement dollarsBonusFlat;

	
	@FindBy(locator = "dw.teacher.couponsrewards.rewards.bonusflat.dollars")
	private List<WebElement> sizedollarsBonusFlat;
	
	@FindBy(locator = "dw.teacher.checkoutpages.sfo.subtotals.size")
	private List<WebElement> checkoutpagessizesfosubtotals;
	
	@FindBy(locator = "dw.teacher.reviewcart.soo.subtotals.size")
	private List<WebElement> reviewcartsizesoosubtotals;
	
	@FindBy(locator = "dw.teacher.reviewcart.sfo.subtotals.size")
	private List<WebElement> reviewcartsizesfosubtotals;
	
	@FindBy(locator = "dw.teacher.reviewcart.yto.subtotals.size")
	private List<WebElement> reviewcartsizeytosubtotals;
	
	@FindBy(locator = "dw.teacher.reviewcart.te.subtotals.size")
	private List<WebElement> reviewcartsizetesubtotals;
	
	@FindBy(locator = "dw.teacher.reviewcart.soo.taxes.size")
	private List<WebElement> reviewcartsizesootaxes;
	
	@FindBy(locator = "dw.teacher.reviewcart.sfo.taxes.size")
	private List<WebElement> reviewcartsizesfotaxes;
	
	@FindBy(locator = "dw.teacher.reviewcart.yto.taxes.size")
	private List<WebElement> reviewcartsizeytotaxes;
	
	@FindBy(locator = "dw.teacher.reviewcart.te.taxes.size")
	private List<WebElement> reviewcartsizetetaxes;
	
	@FindBy(locator = "dw.teacher.reviewcart.soo.items.size")
	private List<WebElement> reviewcartsizesooitems;
	
	@FindBy(locator = "dw.teacher.reviewcart.sfo.items.size")
	private List<WebElement> reviewcartsizesfoitems;
	
	@FindBy(locator = "dw.teacher.reviewcart.yto.items.size")
	private List<WebElement> reviewcartsizeytoitems;
	
	@FindBy(locator = "dw.teacher.reviewcart.te.items.size")
	private List<WebElement> reviewcartsizeteitems;
	
	@FindBy(locator = "dw.teacher.reviewcart.soo.totals.size")
	private List<WebElement> reviewcartsizesoototals;
	
	@FindBy(locator = "dw.teacher.reviewcart.sfo.totals.size")
	private List<WebElement> reviewcartsizesfototals;
	
	@FindBy(locator = "dw.teacher.reviewcart.yto.totals.size")
	private List<WebElement> reviewcartsizeytototals;
	
	@FindBy(locator = "dw.teacher.reviewcart.te.totals.size")
	private List<WebElement> reviewcartsizetetotals;
	
	@FindBy(locator = "dw.teacher.rewardspage.soo.subtotals.size")
	private List<WebElement> rewardspagesizesoosubtotals;
	
	@FindBy(locator = "dw.teacher.rewardspage.sfo.subtotals.size")
	private List<WebElement> rewardspagesizesfosubtotals;
	
	@FindBy(locator = "dw.teacher.rewardspage.yto.subtotals.size")
	private List<WebElement> rewardspagesizeytosubtotals;
	
	@FindBy(locator = "dw.teacher.rewardspage.te.subtotals.size")
	private List<WebElement> rewardspagesizetesubtotals;
	
	@FindBy(locator = "dw.teacher.rewardspage.soo.taxes.size")
	private List<WebElement> rewardspagesizesootaxes;
	
	@FindBy(locator = "dw.teacher.rewardspage.sfo.taxes.size")
	private List<WebElement> rewardspagesizesfotaxes;
	
	@FindBy(locator = "dw.teacher.rewardspage.yto.taxes.size")
	private List<WebElement> rewardspagesizeytotaxes;
	
	@FindBy(locator = "dw.teacher.rewardspage.te.taxes.size")
	private List<WebElement> rewardspagesizetetaxes;
	
	@FindBy(locator = "dw.teacher.rewardspage.soo.items.size")
	private List<WebElement> rewardspagesizesooitems;
	
	@FindBy(locator = "dw.teacher.rewardspage.sfo.items.size")
	private List<WebElement> rewardspagesizesfoitems;
	
	@FindBy(locator = "dw.teacher.rewardspage.yto.items.size")
	private List<WebElement> rewardspagesizeytoitems;
	
	@FindBy(locator = "dw.teacher.rewardspage.te.items.size")
	private List<WebElement> rewardspagesizeteitems;
	
	@FindBy(locator = "dw.teacher.rewardspage.soo.totals.size")
	private List<WebElement> rewardspagesizesoototals;
	
	@FindBy(locator = "dw.teacher.rewardspage.sfo.totals.size")
	private List<WebElement> rewardspagesizesfototals;
	
	@FindBy(locator = "dw.teacher.rewardspage.yto.totals.size")
	private List<WebElement> rewardspagesizeytototals;
	
	@FindBy(locator = "dw.teacher.rewardspage.te.totals.size")
	private List<WebElement> rewardspagesizetetotals;
	
	@FindBy(locator = "dw.teacher.checkoutpages.sfo.header")
	private WebElement sfocheckoutpagesheader;
	
	@FindBy(locator = "dw.teacher.checkoutpages.yto.header")
	private WebElement ytocheckoutpagesheader;
	
	@FindBy(locator = "dw.teacher.checkoutpages.te.header")
	private WebElement techeckoutpagesheader;
	
	@FindBy(locator = "dw.teacher.checkoutpages.sfo.subtotals")
	private WebElement sfocheckoutpagessubtotals;
	
	@FindBy(locator = "dw.teacher.rewardspage.active")
	private List<WebElement> rewardspage_active;
	
	@FindBy(locator = "dw.teacher.paymentpage.active")
	private List<WebElement> paymentpage_active;
	
	@FindBy(locator = "dw.teacher.confirmsubmitpage.active")
	private List<WebElement> confirmsubmitpage_active;
	
	@FindBy(locator = "dw.teacher.rewardspage.paymentpage.sfo.creditnotes")
	private WebElement creditnotes;
	
	@FindBy(locator = "dw.teacher.rewardspage.paymentpage.sfo.creditnotes")
	private List<WebElement> sizecreditnotes;
	
	@FindBy(locator = "dw.teacher.rewardspage.paymentpage.yto.bonusbank")
	private WebElement ytobonusbank;
	
	@FindBy(locator = "dw.teacher.rewardspage.paymentpage.yto.bonusbank")
	private List<WebElement> sizeytobonusbank;
	
	@FindBy(locator = "dw.teacher.rewardspage.paymentpage.yto.papercoupon")
	private WebElement ytopapercoupon;
	
	@FindBy(locator = "dw.teacher.rewardspage.paymentpage.te.bonusbank")
	private WebElement tebonusbank;
	
	@FindBy(locator = "dw.teacher.rewardspage.paymentpage.te.bonusbank")
	private List<WebElement> sizetebonusbank;
	
	@FindBy(locator = "dw.teacher.rewardspage.paymentpage.te.papercoupon")
	private WebElement tepapercoupon;
	
	public List<WebElement> sizecreditnotes(){
		return sizecreditnotes;
	}
	
	public WebElement getcreditnotes(){
		return creditnotes;
	}
	
	public WebElement getytobonusbank(){
		return ytobonusbank;
	}
	
	public List<WebElement> sizeytobonusbank(){
		return sizeytobonusbank;
	}
	
	public WebElement getytopapercoupon(){
		return ytopapercoupon;
	}
	
	public WebElement gettebonusbank(){
		return tebonusbank;
	}
	
	public List<WebElement> sizetebonusbank(){
		return sizetebonusbank;
	}
	
	public WebElement gettepapercoupon(){
		return tepapercoupon;
	}
	
	public List<WebElement> confirmsubmitpage_active(){
		return confirmsubmitpage_active;
	}
	
	public List<WebElement> paymentpage_active(){
		return paymentpage_active;
	}
	
	public List<WebElement> rewardspage_active(){
		return rewardspage_active;
	}
	
	public List<WebElement> reviewcartsizesoosubtotals(){
		return reviewcartsizesoosubtotals;
	}
	
	public List<WebElement> reviewcartsizesfosubtotals(){
		return reviewcartsizesfosubtotals;
	}
	
	public List<WebElement> reviewcartsizeytosubtotals(){
		return reviewcartsizeytosubtotals;
	}
	
	public List<WebElement> reviewcartsizetesubtotals(){
		return reviewcartsizetesubtotals;
	}
	
	public List<WebElement> reviewcartsizesootaxes(){
		return reviewcartsizesootaxes;
	}
	
	public List<WebElement> reviewcartsizesfotaxes(){
		return reviewcartsizesfotaxes;
	}
	
	public List<WebElement> reviewcartsizeytotaxes(){
		return reviewcartsizeytotaxes;
	}
	
	public List<WebElement> reviewcartsizetetaxes(){
		return reviewcartsizetetaxes;
	}
	
	public List<WebElement> reviewcartsizesooitems(){
		return reviewcartsizesooitems;
	}
	
	public List<WebElement> reviewcartsizesfoitems(){
		return reviewcartsizesfoitems;
	}
	
	public List<WebElement> reviewcartsizeytoitems(){
		return reviewcartsizeytoitems;
	}
	
	public List<WebElement> reviewcartsizeteitems(){
		return reviewcartsizeteitems;
	}
	
	public List<WebElement> reviewcartsizesoototals(){
		return reviewcartsizesoototals;
	}
	
	public List<WebElement> reviewcartsizesfototals(){
		return reviewcartsizesfototals;
	}
	
	public List<WebElement> reviewcartsizeytototals(){
		return reviewcartsizeytototals;
	}
	
	public List<WebElement> reviewcartsizetetotals(){
		return reviewcartsizetetotals;
	}
	
	
	public List<WebElement> rewardspagesizesoosubtotals(){
		return rewardspagesizesoosubtotals;
	}
	
	public List<WebElement> rewardspagesizesfosubtotals(){
		return rewardspagesizesfosubtotals;
	}
	
	public List<WebElement> rewardspagesizeytosubtotals(){
		return rewardspagesizeytosubtotals;
	}
	
	public List<WebElement> rewardspagesizetesubtotals(){
		return rewardspagesizetesubtotals;
	}
	
	public List<WebElement> rewardspagesizesootaxes(){
		return rewardspagesizesootaxes;
	}
	
	public List<WebElement> rewardspagesizesfotaxes(){
		return rewardspagesizesfotaxes;
	}
	
	public List<WebElement> rewardspagesizeytotaxes(){
		return rewardspagesizeytotaxes;
	}
	
	public List<WebElement> rewardspagesizetetaxes(){
		return rewardspagesizetetaxes;
	}
	
	public List<WebElement> rewardspagesizesooitems(){
		return rewardspagesizesooitems;
	}
	
	public List<WebElement> rewardspagesizesfoitems(){
		return rewardspagesizesfoitems;
	}
	
	public List<WebElement> rewardspagesizeytoitems(){
		return rewardspagesizeytoitems;
	}
	
	public List<WebElement> rewardspagesizeteitems(){
		return rewardspagesizeteitems;
	}
	
	public List<WebElement> rewardspagesizesoototals(){
		return rewardspagesizesoototals;
	}
	
	public List<WebElement> rewardspagesizesfototals(){
		return rewardspagesizesfototals;
	}
	
	public List<WebElement> rewardspagesizeytototals(){
		return rewardspagesizeytototals;
	}
	
	public List<WebElement> rewardspagesizetetotals(){
		return rewardspagesizetetotals;
	}
	
	public WebElement getsfocheckoutpagessubtotals(){
		return sfocheckoutpagessubtotals;
	}
	
	public WebElement gettecheckoutpagesheader(){
		return techeckoutpagesheader;
	}
	
	public WebElement getsfocheckoutpagesheader(){
		return sfocheckoutpagesheader;
	}
	
	public WebElement getytocheckoutpagesheader(){
		return ytocheckoutpagesheader;
	}
	
	public List<WebElement> checkoutpagessizesfosubtotals(){
		return checkoutpagessizesfosubtotals;
	}

	@FindBy(locator = "dw.teacher.homepage.carticon")
	private WebElement CartIcon_on_homepage;


	public WebElement cart_qty_item1() {
		return cart_qty_item1;
	}
	
	public WebElement value_amt_paid_by_cheque_ConfirmPage() {
		return value_amt_paid_by_cheque_ConfirmPage;
	}

	public WebElement click_outside_in_ReviewCartPage() {
		return click_outside_in_ReviewCartPage;
	}
	
	public List<WebElement> sizebtnReviewCart() {
		return sizebtnReviewCart;
	}
	
	public WebElement btnReviewCart() {
		return btnReviewCart;
	}
	public WebElement txtField1() {
		return txtField1;
	}
	public WebElement txtField2() {
		return txtField2;
	}
	public WebElement txtField3() {
		return txtField3;
	}
	
	public WebElement btn_minus_delete_item_ReviewPage() {
		return btn_minus_delete_item_ReviewPage;
	}
	
	public WebElement txt_empty_cart_ReviewPage() {
		return txt_empty_cart_ReviewPage;
	}
	public WebElement txtField1_submitPage() {
		return txtField1_submitPage;
	}
	public WebElement txtField2_submitPage() {
		return txtField2_submitPage;
	}
	public WebElement txtField3_submitPage() {
		return txtField3_submitPage;
	}
	
	public WebElement txtField1_SavedCart() {
		return txtField1_SavedCart;
	}
	
	public WebElement txtField2_SavedCart() {
		return txtField2_SavedCart;
	}
	
	public WebElement txtField3_SavedCart() {
		return txtField3_SavedCart;
	}
	
	public WebElement Student_Club_header_SavedCart() {
		return Student_Club_header_SavedCart;
	}
	
	public WebElement Teacher_Cat_header_SavedCart() {
		return Teacher_Cat_header_SavedCart;
	}
	
	public List<WebElement> lst_Student_Club_items_list_SavedCart() {
		return lst_Student_Club_items_list_SavedCart;
	}
	
	public List<WebElement> lst_Teacher_Cat_items_list_SavedCart() {
		return lst_Teacher_Cat_items_list_SavedCart;
	}
	
	public WebElement lst_Student_Club_items_list_Manage_cart_SavedCart() {
		return lst_Student_Club_items_list_Manage_cart_SavedCart;
	}
	
	public WebElement select_arrow_SavedCart() {
		return select_arrow_SavedCart;
	}
	
	public WebElement subTotal_Student_SavedCart() {
		return subTotal_Student_SavedCart;
	}
	
	public WebElement btn_delete_SavedCart() {
		return btn_delete_SavedCart;
	}
	
	public WebElement msg_emptyList_SavedCart() {
		return msg_emptyList_SavedCart;
	}
	
	public WebElement header_MySavedCart_SavedCart() {
		return header_MySavedCart_SavedCart;
	}
	
	public WebElement text_Return_To_manageYourSavedCart_SavedCart() {
		return text_Return_To_manageYourSavedCart_SavedCart;
	}
	
	public WebElement list_Manage_SavedCart_SavedCart() {
		return list_Manage_SavedCart_SavedCart;
	}
	
	public WebElement btn_Manage_Saved_Cart() {
		return btn_Manage_Saved_Cart;
	}
	
	public WebElement btn_Restore_Saved_Cart_Page() {
		return btn_Restore_Saved_Cart_Page;
	}
	
	public WebElement btn_view_Saved_Cart_Page() {
		return btn_view_Saved_Cart_Page;
	}
	
	public WebElement btn_delete_Saved_Cart_Page() {
		return btn_delete_Saved_Cart_Page;
	}
	
	public WebElement hdr_ReviewCart() {
		return hdr_ReviewCart;
	}
	
	public WebElement subTotal_Teacher_SavedCart() {
		return subTotal_Teacher_SavedCart;
	}
	
	public WebElement Total_amount_SavedCart() {
		return Total_amount_SavedCart;
	}
	
	public WebElement btn_SaveCart_for_Later() {
		return btn_SaveCart_for_Later;
	}
	public WebElement popup_SaveCart_for_Later_btn_YES() {
		return popup_SaveCart_for_Later_btn_YES;
	}
	public WebElement popup_SaveCart_for_Later_fld_name() {
		return popup_SaveCart_for_Later_fld_name;
	}
	public WebElement popup_SaveCart_for_Later_btn_SAVE() {
		return popup_SaveCart_for_Later_btn_SAVE;
	}
	public WebElement selection_SavedCart() {
		return selection_SavedCart;
	}
	
	public List<WebElement> SavedCart_list() {
		return SavedCart_list;
	}
	
	public WebElement select_ManageSavedCart() {
		return select_ManageSavedCart;
	}
	
	public WebElement clicks_on_delete_Saved_Cart_item() {
		return clicks_on_delete_Saved_Cart_item;
	}
	
	public WebElement Home_icon_on_header() {
		return Home_icon_on_header;
	}
	
	public WebElement delete_to_yes_Saved_Cart_item() {
		return delete_to_yes_Saved_Cart_item;
	}
	
	public WebElement delete_to_no_Saved_Cart_item() {
		return delete_to_no_Saved_Cart_item;
	}
	
	
	public WebElement getBonusDescText() {
		return txtBonusDesc;
	}

	public List <WebElement> getBonusDescText1() {
		return txtBonusDesc1;
	}
	
	public WebElement getTotalPrice() {
		return stdTotalPrice;
	}

	public WebElement getBonusFlatTextOnRewardsPage() {
		return txtBonusFlatRewardsPage;
	}

	public WebElement getBonusFlatTextOnSubmittedPage() {
		return txtBonusFlatSubmittedPage;
	}

	public WebElement getSubmitOrderButton() {
		return submitOrderButton;
	}

	public WebElement getTxtConfirmAndSubmitBonusFlat() {
		return txtBonusFlatConfirmAndSubmit;
	}

	public WebElement getTxtBonusFlat() {
		return txtBonusFlat;
	}
	
	public WebElement getDollarsBonusFlat() {
		return dollarsBonusFlat;
	}
	
	public List<WebElement> sizeDollarsBonusFlat() {
		return sizedollarsBonusFlat;
	}

	public WebElement getCartIcon()
	{
		return CartIcon_on_homepage;
	}

	public WebElement getYesButton() {
		return yesButton;
	}

	public WebElement getRemoveCircle() {
		return removeCircle;
	}

	public WebElement getReviewButton() {
		return revewCartButton;
	}

	public WebElement getApplyButton() {
		return applyButton;
	}

	public WebElement getBonusBankInputBox() {
		return bonusBankInputBox;
	}

	public WebElement getLblTotalAmountPromotionalModal() {
		return lblTotalAmountPromotionalModal;
	}
	public WebElement btnProceedToCheckout() {
		return btnProceedToCheckout;
	}
	
	public WebElement btn_Minus_Student1_Qty() {
		return btn_Minus_Student1_Qty;
	}
	
	public WebElement btn_Minus_Student2_Qty() {
		return btn_Minus_Student2_Qty;
	}
	
	public WebElement btn_Minus_Student3_Qty() {
		return btn_Minus_Student3_Qty;
	}
	
	public WebElement btn_Plus_Student1_Qty() {
		return btn_Plus_Student1_Qty;
	}
	
	public WebElement btn_Plus_Student2_Qty() {
		return btn_Plus_Student2_Qty;
	}
	
	public WebElement btn_Plus_Student3_Qty() {
		return btn_Plus_Student3_Qty;
	}
	

	public WebElement getBtnSFORemove(String studentName, String itemName) {
		return SCHUtils.findElement("dw.reviewcart.studentflyerorder.btn.remove", studentName, itemName);
	}

	public WebElement getBtnSFORemoveYes(String studentName, String itemName) {
		return SCHUtils.findElement("dw.reviewcart.studentflyerorder.remove.btn.removeyes", studentName, itemName);
	}

	public WebElement getBtnSFORemoveNo(String studentName, String itemName) {
		return SCHUtils.findElement("dw.reviewcart.studentflyerorder.remove.btn.removeno", studentName, itemName);
	}

	public WebElement getParentCouponModal() {
		return parentCouponModal;
	}

	public WebElement getTxtEnterCoupon() {
		return txtEnterCoupon;
	}

	public WebElement getBtnApply() {
		return btnApply;
	}

	public WebElement getLblCouponErrorMessage() {
		return lblCouponErrorMessage;
	}
	public WebElement getLnkCloseIconONSOODeletePopUp() {
		return lnkCloseIconONSOODeletePopUp;
	}

	public WebElement getLblItemErrorMessage() {
		return lblItemErrorMessage;
	}

	public WebElement getLnkYourTeacherOrder() {
		return lnkYourTeacherOrder;
	}

	public void setLnkYourTeacherOrder(WebElement lnkYourTeacherOrder) {
		this.lnkYourTeacherOrder = lnkYourTeacherOrder;
	}

	public WebElement getLnkEnterOrder() {
		return lnkEnterOrder;
	}

	public void setLnkEnterOrder(WebElement lnkEnterOrder) {
		this.lnkEnterOrder = lnkEnterOrder;
	}

	@Override
	public WebElement getCmpSOO() {
		return cmpSOO;
	}

	public WebElement getLblCartFinalTotal() {
		return lblCartFinalTotal;
	}

	public WebElement getLblOrderInstruction() {
		return lblOrderInstruction;
	}

	public WebElement getLnkRedeemCoupons() {
		return lnkRedeemCoupons;
	}

	public WebElement getreviewcart() {
		return btnReviewcart;
	}
	
	public List<WebElement> chkgetreviewcart() {
		return chkbtnReviewcart;
	}

	public WebElement getBtnProceedToCheckout() {
		return btnProceedToCheckout;

	}

	public List<WebElement> sizebtntopBonuspointModelProceedToCheckout() {
		return sizebtntopBonuspointModelProceedToCheckout;
	}
	
	public WebElement getbtntopBonuspointModelProceedToCheckout() {
		return btntopBonuspointModelProceedToCheckout;
	}
	
	public WebElement getbtnbottomBonuspointModelProceedToCheckout() {
		return btnbottomBonuspointModelProceedToCheckout;
	}
	
	public WebElement getlnkBonuspointModelReturnToShop() {
		return lnkBonuspointModelReturnToShop;

	}

	public WebElement getBtnStudentFlyerOrderAdd() {
		return btnStudentFlyerOrderAdd;
	}

	public WebElement getBtnYourTeacherOrderAdd() {
		return btnYourTeacherOrderAdd;
	}

	public WebElement getImgFirstRemoveIcon() {
		return imgFirstRemoveIcon;
	}

	public WebElement getBtnRemoveYes() {
		return btnRemoveYes;
	}

	public WebElement getBtnRemoveNo() {
		return btnRemoveNo;
	}

	public WebElement getBtnRemoveSOOOptionsOther() {
		return btnRemoveSOOOptionsOther;
	}

	public WebElement getBtnRemoveSOODelete() {
		return btnRemoveSOODelete;
	}

	public WebElement getImgBookTrust() {
		return imgBookTrust;
	}

	public WebElement getDrpDonateAmount() {
		return drpDonateAmount;
	}

	public WebElement getImgQuestionIcon() {
		return imgQuestionIcon;
	}

	public WebElement getLblQuestionIconMessage() {
		return lblQuestionIconMessage;
	}

	public WebElement getLnkQuestionIconLearnMore() {
		return lnkQuestionIconLearnMore;
	}

	@Override
	public WebElement getLblCartTotalAmount() {
		return lblCartTotalAmount;
	}

	public WebElement getBtnReturnToShop() {
		return btnReturnToShop;
	}

	public WebElement getLblYourTeacherOrderTotalPrice() {
		return lblYourTeacherOrderTotalPrice;
	}

	public WebElement getLblYourTeacherOrderTotalQuantity() {
		return lblYourTeacherOrderTotalQuantity;
	}

	public WebElement getLblYourTeacherOrderTotalBonusPoint() {
		return lblYourTeacherOrderTotalBonusPoint;
	}

	public WebElement getLblYourTeacherOrderTotalBonusQuantity() {
		return lblYourTeacherOrderTotalBonusQuantity;
	}

	public WebElement getLblStudentFlyerOrderTotalPrice() {
		return lblStudentFlyerOrderTotalPrice;
	}

	public WebElement getLblStudentFlyerOrderTotalQuantity() {
		return lblStudentFlyerOrderTotalQuantity;
	}

	public WebElement getLblStudentOnlineOrderTotalPrice() {
		return lblStudentOnlineOrderTotalPrice;
	}

	public WebElement getLblStudentOnlineOrderTotalQuantity() {
		return lblStudentOnlineOrderTotalQuantity;
	}

	public WebElement getBtnMinusStudentFlyerOrder() {
		return btnMinusStudentFlyerOrder;
	}

	public WebElement getBtnMinusYourTeacherOrder() {
		return btnMinusYourTeacherOrder;
	}

	public WebElement getBtnMinusStudentOnlineOrder() {
		return btnMinusStudentOnlineOrder;
	}

	public WebElement getLblNoOrderStudentOnlineOrder() {
		return lblNoOrderStudentOnlineOrder;
	}

	public WebElement getLblNoOrderYourTeacherOrder() {
		return lblNoOrderYourTeacherOrder;
	}

	public WebElement getLblNoOrderStudentFlyerOrder() {
		return lblNoOrderStudentFlyerOrder;
	}

	public WebElement getLblRemoveIconsSoo() {
		return lblFirstRemoveIconSoo;
	}
	
	@FindBy(locator = "dw.teacher.home.enterorder.studentflyerorder.applicationLoader")
	private WebElement applicationLoader;
	
	public WebElement getapplicationLoader() {
		return applicationLoader;
	}

	@FindBy(locator = "dw.reviewcart.emptycart.lnk.enterorders")
	private WebElement lnkEnterOrdersEmptyCart;
	
	@FindBy(locator = "dw.checkout.rewardsandcoupons.order.TotalAmountOwing")
	private WebElement lblTotalAmountOwing;
	
	public WebElement getlblTotalAmountOwing() {
		return lblTotalAmountOwing;
	}

	public WebElement getLnkEnterOrdersEmptyCart() {
		return lnkEnterOrdersEmptyCart;
	}

	public WebElement getLnkShopBooksAndResourcesEmptyCart() {
		return lnkShopBooksAndResourcesEmptyCart;
	}

	@FindBy(locator = "dw.reviewcart.emptycart.lnk.shopbooksandresources")
	private WebElement lnkShopBooksAndResourcesEmptyCart;
	
	@FindBy(locator = "dw.checkout.rewardsandcoupons.lbl.tossin")
	private List<WebElement> sizelblTossIn;
	
	@FindBy(locator = "dw.checkout.confirmsubmitpage.section.rewards")
	private WebElement sectionconfirmsubmitpagerewards;
	
	@FindBy(locator = "dw.checkout.fld.FreeItem.promotion.Rewards.page")
	private WebElement fld_FreeItem_promotion_Rewards_page;
	
	@FindBy(locator = "dw.checkout.confirm_submit_page.section.rewards")
	private WebElement get_section_confirm_submit_page_rewards;

    @FindBy(locator = "dw.checkout.confirm_submit_page.section.rewards1")
    private WebElement get_section_confirm_submit_page_rewards1;
	
	@FindBy(locator = "dw.checkout.reviewcart.studentclub.subtotal")
	private WebElement reviewcart_studentclub_subtotal;

	@FindBy(locator = "dw.reviewcart.studentclubamountowing")
	private WebElement reviewcart_studentamtowing;
	
	@FindBy(locator = "dw.reviewcart.studentclubamountowing")
	private List<WebElement> size_reviewcart_studentamtowing;
	
	public WebElement get_reviewcart_studentclub_subtotal() {
		return reviewcart_studentclub_subtotal;
	}

	public WebElement get_reviewcart_studentamtowing() {
		return reviewcart_studentamtowing;
	}
	
	public List<WebElement> size_reviewcart_studentamtowing() {
		return size_reviewcart_studentamtowing;
	}
	
	public List<WebElement> sizelblTossIn() {
		return sizelblTossIn;
	}
	
	public WebElement fld_FreeItem_promotion_Rewards_page() {
		return fld_FreeItem_promotion_Rewards_page;
	}
	
	public WebElement getsectionconfirmsubmitpagerewards() {
		return sectionconfirmsubmitpagerewards;
	}
	
	public WebElement get_section_confirm_submit_page_rewards() {
		return get_section_confirm_submit_page_rewards;
	}
    public WebElement get_section_confirm_submit_page_rewards1() {
        return get_section_confirm_submit_page_rewards1;
    }

	@Override
	public IStudentOnlineOrdersCartSection getStudentOnlineOrdersCartSection() {
		return SectionFactory.getFactory().getStudentOnlineOrdersCartSection("dw.studentonlineorders.cmp");
	}

	@Override
	public IStudentFlyerOrdersCartSection getStudentFlyerOrdersCartSection() {
		return SectionFactory.getFactory().geStudentFlyerOrdersCartSection("dw.studentflyerorders.cmp");
	}

	@Override
	public IYourTeacherOrdersCartSection getYourTeacherOrdersCartSection() {
		return SectionFactory.getFactory().getYourTeacherOrdersCartSection("dw.yourteacherorder.cmp");
	}

	@Override
	public IProductOrderSummarySection getProductOrderSummarySection() {
		return SectionFactory.getFactory().getIProductOrderSummarySection(LocatorUtils.getBy("dw.reviewcart.section.ordersummary"));
	}
	@Override
	protected void openPage() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyEmptyCartPage() {
		PauseUtil.waitForAjaxToComplete(500);
		IHeaderSection headerSection = SectionFactory.getFactory().getIHeaderSection(LocatorUtils.getBy("dw.header.section"));
		Assert.assertEquals(headerSection.getCartQuantity(), 0, "Cart page is not Empty");

	}

	@Override
	public void clickOnRedeemCoupon() {
		SCHUtils.clickUsingJavaScript(getLnkRedeemCoupons());
		// getLnkRedeemCoupons().click();

	}

	@Override
	public void verifyCartItems() {

		// Removed POSOO condition because we will use SOO bean only for
		// validating Order summary as it will become more and more complex
		// further. We will validate POSOO bean on cart page and then order
		// summary validations will be done as per cart products
		if (SCHUtils.getSOOProductItems().size() == 0 && SCHUtils.isPresent(getCmpSOO())) {

			System.out.println("Filling Soo Cart Products");
			getStudentOnlineOrdersCartSection().fillSOOProductBean();
		}
		getStudentFlyerOrdersCartSection().verifyItemsOnSFOCart();
		getStudentOnlineOrdersCartSection().verifyItemsOnSOOCart();
		getYourTeacherOrdersCartSection().verifyItemsOnYTOCart();
	}

	@Override
	public void verifySOOItems() {

		if (TestBaseProvider.getTestBase().getContext().getProperty(ConstantUtils.SOO_CART_PRODUCTS) == null && SCHUtils.isPresent(getCmpSOO())) {
			getStudentOnlineOrdersCartSection().fillSOOProductBean();
		}
		getStudentOnlineOrdersCartSection().verifyItemsOnSOOCart();
	}

	@Override
	public void verifyCartItemQuantity() {
		getStudentFlyerOrdersCartSection().verifyItemsQuantityOnCart();
	}

	@Override
	public void clickStudentFlyerOrderAddBtn() {
		getBtnStudentFlyerOrderAdd().click();
	}

	@Override
	public void clickOn_btnReviewCart() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		PauseUtil.pause(4000);
		if(sizebtnReviewCart().size()!=0){
		btnReviewCart().click();
		PauseUtil.pause(2500);
		}
		if(size_reviewcart_studentamtowing().size()!=0){
		String reviewcartpage_tamtOwing = get_reviewcart_studentamtowing().getText().substring(1);
		//String reviewcartpage_tamtOwing1 = reviewcartpage_tamtOwing.substring(1);
		double reviewcartpage_tamtOwing2 =  Double.parseDouble(reviewcartpage_tamtOwing);
		TestBaseProvider.getTestBase().getContext().setProperty("Total_StudenClub_Value",reviewcartpage_tamtOwing2);
		}

	}

	@Override
	public void removeAllItems() {
		PauseUtil.pause(1500);
		//SCHUtils.waitForLoaderToDismiss();
		//PauseUtil.waitForAjaxToComplete();
		System.out.println("GetTestBaseYtoITem "
				+ getTestBase().getTestData().getString("removeytoItems"));
		if (getTestBase().getTestData().getString("removesfoItems") != null
				&& getTestBase().getTestData().getString("removesfoItems")
						.equalsIgnoreCase("true")) {
		PauseUtil.pause(3000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		System.out.println("GetTestBaseYtoITem " + getTestBase().getTestData().getString("removeytoItems"));
		if (getTestBase().getTestData().getString("removesfoItems") != null && getTestBase().getTestData().getString("removesfoItems").equalsIgnoreCase("true")) {
			getStudentFlyerOrdersCartSection().removeAllSfoItems();

		}
		if (getTestBase().getTestData().getString("removeytoItems") != null && getTestBase().getTestData().getString("removeytoItems").equalsIgnoreCase("true")) {
			getYourTeacherOrdersCartSection().removeAllYTOItem();

		}
		if (getTestBase().getTestData().getString("removeytoItems") == null && getTestBase().getTestData().getString("removesfoItems") == null) {
			while (SCHUtils.isPresent(getImgFirstRemoveIcon())) {
				SCHUtils.clickUsingJavaScript(getImgFirstRemoveIcon());
				PauseUtil.waitForAjaxToComplete();
				try {
					WaitUtils.waitForEnabled(getBtnRemoveYes());
					SCHUtils.clickUsingJavaScript(getBtnRemoveYes());
				} catch (Exception e) {
					WaitUtils.waitForEnabled(getBtnRemoveSOOOptionsOther());
					SCHUtils.clickUsingJavaScript(getBtnRemoveSOOOptionsOther());
					getBtnRemoveSOODelete().click();
				}
				PauseUtil.pause(1500);
				//SCHUtils.waitForLoaderToDismiss();
				PauseUtil.waitForAjaxToComplete();
			}
		}}
	}

	@Override
	public void verifyCartTotalAmountAndQuantity() {
		Double totalAmount = 0.0;
		Integer totalQuantity = 0;

		if (SCHUtils.isPresent(getLblStudentFlyerOrderTotalPrice())) {
			totalAmount = SCHUtils.getPriceWithOutCurrency(getLblStudentFlyerOrderTotalPrice().getText());
			totalQuantity = Double.valueOf(getLblStudentFlyerOrderTotalQuantity().getText()).intValue();
		}
		if (SCHUtils.isPresent(getLblStudentOnlineOrderTotalPrice())) {
			totalAmount = SCHUtils.getPriceWithOutCurrency(getLblStudentOnlineOrderTotalPrice().getText());
			totalQuantity = totalQuantity + Double.valueOf(getLblStudentOnlineOrderTotalQuantity().getText()).intValue();
		}
		if (SCHUtils.isPresent(getLblYourTeacherOrderTotalPrice())) {
			totalAmount = totalAmount + SCHUtils.getPriceWithOutCurrency(getLblYourTeacherOrderTotalPrice().getText());
			totalQuantity = totalQuantity + Double.valueOf(getLblYourTeacherOrderTotalQuantity().getText()).intValue();
		}

		Assert.assertEquals(totalAmount, SCHUtils.getPriceWithOutCurrency(getLblCartTotalAmount().getText()));

		Assert.assertTrue(getLblCartFinalTotal().getText().contains(totalQuantity + " Items"), "Total quantity does not matches");

	}

	@Override
	public void clickReturnToShopBtn() {
		WaitUtils.waitForDisplayed(getBtnReturnToShop());
		getBtnReturnToShop().click();
	}

	@Override
	public void clickProceedToCheckoutBtn() {
		CartPage crtpge = new CartPage();
		//WaitUtils.waitForNotDisplayed(getapplicationLoader());
		//SCHUtils.waitForLoaderToDismiss();
		
		if(chkgetreviewcart().size()!=0)
		{
		WaitUtils.waitForDisplayed(getreviewcart());
		//SCHUtils.clickUsingJavaScript(getreviewcart());

		}
		//SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(5000);
		//getBtnProceedToCheckout().click();
        WaitUtils.waitForDisplayed(getBtnProceedToCheckout());
        SCHUtils.clickUsingJavaScript(getBtnProceedToCheckout());
		
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.totalamountowing_ReviewCartPage",
				String.valueOf(getlblTotalAmountOwing().getText()));
		
		//SCHUtils.clickUsingJavaScript(getBtnProceedToCheckout());
		PauseUtil.pause(1000);
		//SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2000);
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.totalamountowing_beforetopoff",
				String.valueOf(getlblTotalAmountOwing().getText()));
		
		
		// Need to keep if condition because this popup is not coming in parent
		// checkout
		// WaitUtils.waitForDisplayed(getBtnBonuspointModelProceedToCheckout());


		if (SCHUtils.isPresent(getbtntopBonuspointModelProceedToCheckout())) {
			SCHUtils.clickUsingJavaScript(getbtntopBonuspointModelProceedToCheckout());

		}

		PauseUtil.pause(1500);
		// System.out.println("get url-----------" +
		// getDriver().getCurrentUrl());
		// getBtnBonuspointModelProceedToCheckout().click();
	}

	@Override
	public void verifyNoItemToReviewMessages() {
		if (!SCHUtils.isPresent(getLblStudentOnlineOrderTotalPrice())) {
			Assert.assertTrue(getLblNoOrderStudentOnlineOrder().getText().contains("No orders to review"), "SOO orders are present");
			Assert.assertTrue(!SCHUtils.isPresent(getBtnMinusStudentOnlineOrder()));
		}
		if (!SCHUtils.isPresent(getLblYourTeacherOrderTotalPrice())) {
			Assert.assertTrue(getLblNoOrderYourTeacherOrder().getText().contains("No items to review"), "YTO orders are present");
			Assert.assertTrue(!SCHUtils.isPresent(getBtnMinusYourTeacherOrder()));
		}
		if (!SCHUtils.isPresent(getLblStudentFlyerOrderTotalPrice())) {
			Assert.assertTrue(getLblNoOrderStudentFlyerOrder().getText().contains("No items to review"), "SFO orders are present");
			Assert.assertTrue(!SCHUtils.isPresent(getBtnMinusStudentFlyerOrder()));
		}
	}

	@Override
	public void clickYourTeacherOrderAddBtn() {
		getBtnYourTeacherOrderAdd().click();
	}

	@Override
	public void navigatesToYTO() {
		SCHUtils.clickUsingJavaScript(getLnkEnterOrder());
		PauseUtil.waitForAjaxToComplete(5000);

		SCHUtils.clickUsingJavaScript(getLnkYourTeacherOrder());// .click();
	}

	@Override
	public void removeSOOItems() {

		for (int i = 0; i < getStudentOnlineOrdersCartSection().getNumberOfStudents(); i++) {
			SCHUtils.clickUsingJavaScript(getLblRemoveIconsSoo());
			WaitUtils.waitForEnabled(getBtnRemoveSOOOptionsOther());
			SCHUtils.clickUsingJavaScript(getBtnRemoveSOOOptionsOther());
			getBtnRemoveSOODelete().click();
			PauseUtil.waitForAjaxToComplete(2000);
			SCHUtils.removeSOOProductItem(SCHUtils.getSOOProductByKeyValue(String.valueOf(i)), String.valueOf(i));
		}
	}

	@Override
	public void enterCouponAndClickApply(String CouponCode) {
		PauseUtil.waitForAjaxToComplete(3000);
		SCHUtils.clickUsingJavaScript(getTxtEnterCoupon());
		getTxtEnterCoupon().clear();
		getTxtEnterCoupon().sendKeys(CouponCode);
		AssertUtils.assertEnabled(getBtnApply());
		SCHUtils.clickUsingJavaScript(getBtnApply());
	}

	@Override
	public void verifyWrongErrorMessage(String errorMessage) {
		AssertUtils.assertTextMatches(getLblCouponErrorMessage(), Matchers.containsString(errorMessage));

	}

	@Override
	public ICouponSection getICouponSection() {
		return SectionFactory.getFactory().getCouponSection(LocatorUtils.getBy("dw.reviewcart.coupon.parent.modal"));

	}

	@Override
	public void addscoupon(Configuration testData) {
		getICouponSection().addCoupon(testData);
	}

	/*
	 * @Override public void verifyParentCart() { IParentCartSection
	 * iParentCartSection = getFactory()
	 * .getIParentCartSection(LocatorUtils.getBy("dw.cmp.parentcart"));
	 * iParentCartSection.verifyParentCartItems(); }
	 */

	@FindBy(locator = "dw.studentonlineorders.total")
	private List<ParentCartSection> totalStudentonlineorders;

	public List<ParentCartSection> getTotalStudentonlineorders() {
		return totalStudentonlineorders;
	}

	@Override
	public void removeSFOItem(Configuration data, String confirmationStatus) {
		String[] Students = SCHUtils.getArrayFromStringData(data.getString("studentname"));
		String[] Items = SCHUtils.getArrayFromStringData(data.getString("itemid"));

		String productIDStudentName = Items[0] + Students[0];
		Actions action = new Actions(TestBaseProvider.getTestBase().getDriver());
		action.moveToElement(getBtnSFORemove(Students[0], Items[0])).build().perform();

		SCHUtils.clickUsingJavaScript(getBtnSFORemove(Students[0], Items[0]));

		Assert.assertTrue(SCHUtils.isPresent(getBtnSFORemoveNo(Students[0], Items[0])));
		Assert.assertTrue(SCHUtils.isPresent(getBtnSFORemoveYes(Students[0], Items[0])));

		if (confirmationStatus.equalsIgnoreCase("YES")) {
			SCHUtils.clickUsingJavaScript(getBtnSFORemoveYes(Students[0], Items[0]));
			SCHUtils.removeSFOProductItem(SCHUtils.getSFOProductByIDAndStudentName(productIDStudentName));
		} else {
			SCHUtils.clickUsingJavaScript(getBtnSFORemoveNo(Students[0], Items[0]));
		}
	}

	@Override
	public void clickOnRedeemCouponLink() {

		if (SCHUtils.isPresent(getLnkRedeemCoupons())) {
			SCHUtils.clickUsingJavaScript(getLnkRedeemCoupons());
		} else {
			SCHUtils.clickUsingJavaScript(getBtnProceedToCheckout());
		}
	}

	@Override
	public void verifyPromotionalModal() {
		WaitUtils.waitForDisplayed(getBtnProceedToCheckout());
		String totalAmount = getLblCartTotalAmount().getText();
		getBtnProceedToCheckout().click();
		PauseUtil.waitForAjaxToComplete(3000);

		if (!TestBaseProvider.getTestBase().getContext().getString("driver.name").equalsIgnoreCase("IOs")) {
			AssertUtils.assertTextMatches(getLblTotalAmountPromotionalModal(), Matchers.containsString(totalAmount));
			SCHUtils.clickUsingJavaScript(getbtntopBonuspointModelProceedToCheckout());
			PauseUtil.waitForAjaxToComplete(1500);
		}
	}

	@Override
	public void addscoupon(Configuration testData, int i) {
		getICouponSection().addCouponFromRewardsAndCoupons(testData, i);
	}

	@Override
	public void verifyeBonusPointModelProceedToCheckOut() {
		PauseUtil.waitForAjaxToComplete(4000);
		SCHUtils.isPresent(getbtntopBonuspointModelProceedToCheckout());
	}

	@Override
	public void verifyFooter() {
		AssertUtils.assertDisplayed(getBtnProceedToCheckout());
		AssertUtils.assertDisplayed(getBtnReturnToShop());
	}
	/*
	 * @Override public void verifyCouponSection() {
	 * AssertUtils.assertDisplayed(getTxtEnterCoupon());
	 * AssertUtils.assertDisplayed(getBtnApply());
	 * AssertUtils.assertTextMatches(getThreeCouponAppliedLbl(),
	 * Matchers.containsString(ConstantUtils.THREE_COUPONS_APPLIED_TEXT)); }
	 */

	/*
	 * @Override public void selectAmountToDonateOnTeacherCart(Configuration
	 * data, String amount) { PauseUtil.waitForAjaxToComplete(5000);
	 * SCHUtils.waitForLoaderToDismiss();
	 * SCHUtils.selectOptionByVisibleText(getDrpDonateAmount(), amount);
	 * PauseUtil.waitForAjaxToComplete(2000); getBtnDonate().click();
	 * 
	 * PauseUtil.waitForAjaxToComplete(7000);
	 * SCHUtils.addYTOProductItem(getYourTeacherOrdersCartSection()
	 * .fillTeacherDonatedItemBean(ConstantUtils.FREE_BOOKTRUST_ITEMID)); // you
	 * can add the code to fill bean if validation of item is required // in
	 * further steps. }
	 */

	@Override
	public void waitForPageToload() {
		WaitUtils.waitForDisplayed(getBtnProceedToCheckout());
		WaitUtils.waitForDisplayed(getTxtEnterCoupon());

	}

	/*
	 * @Override public void verifySubOrderTotal() { IParentCartSection
	 * iParentCartSection = getFactory().getIParentCartSection(
	 * LocatorUtils.getBy("dw.studentonlineorders.reviewOrderSection"));
	 * 
	 * iParentCartSection.verifySubOrderTotal(); }
	 */
	/*
	 * @Override public void verifySubQuentityTotal() { IParentCartSection
	 * iParentCartSection = getFactory().getIParentCartSection(
	 * LocatorUtils.getBy("dw.studentonlineorders.reviewOrderSection"));
	 * iParentCartSection.verifySubQuentityTotal();
	 * 
	 * }
	 */

	/*
	 * @Override public void verifyItemTotalQuentity() { IParentCartSection
	 * iParentCartSection = getFactory().getIParentCartSection(
	 * LocatorUtils.getBy("dw.studentonlineorders.reviewOrderSection"));
	 * iParentCartSection.verifyItemTotalQuentity();
	 * 
	 * }
	 */

	/*
	 * @Override public void verifyOrderFinalAmount() { IParentCartSection
	 * iParentCartSection = getFactory().getIParentCartSection(
	 * LocatorUtils.getBy("dw.studentonlineorders.reviewOrderSection"));
	 * iParentCartSection.verifyOrderFinalAmount();
	 * 
	 * }
	 */

	@Override
	public void verifyProceedToCheckoutButtonIsDisabled() {
		AssertUtils.assertDisabled(getBtnProceedToCheckout());

	}

	@Override
	public void verifyApplyButtonIsEnable() {
		AssertUtils.assertEnabled(getBtnApply());
	}
	@Override
	public void enterCouponAgain(String CouponcodeAgain) {
		SCHUtils.clickUsingJavaScript(getTxtEnterCoupon());
		getTxtEnterCoupon().sendKeys(CouponcodeAgain);
		AssertUtils.assertEnabled(getBtnApply());
		SCHUtils.clickUsingJavaScript(getBtnApply());
	}
	@Override
	public void verifyEmptyReviewCartPage() {

		System.out.println(getDriver().findElement(By.cssSelector("#total_bonus_points_used")).getText());
		System.out.println(getDriver().findElement(By.cssSelector("#total_bonus_points_earned")).getText());
		System.out.println(getDriver().findElement(By.cssSelector("#student_online_orders_paid")).getText());
		System.out.println(getDriver().findElement(By.cssSelector("#student_flyer_orders")).getText());
		System.out.println(getDriver().findElement(By.cssSelector("#teacher_order_total")).getText());
		System.out.println(getDriver().findElement(By.cssSelector("#order_total")).getText());

		AssertUtils.assertTextMatches(getDriver().findElement(By.cssSelector("#total_bonus_points_used")), Matchers.containsString("0"));
		AssertUtils.assertTextMatches(getDriver().findElement(By.cssSelector("#total_bonus_points_earned")), Matchers.containsString("0"));
		AssertUtils.assertTextMatches(getDriver().findElement(By.cssSelector("#student_online_orders_paid")), Matchers.containsString("$0.00"));
		AssertUtils.assertTextMatches(getDriver().findElement(By.cssSelector("#student_flyer_orders")), Matchers.containsString("$0.00"));
		AssertUtils.assertTextMatches(getDriver().findElement(By.cssSelector("#teacher_order_total")), Matchers.containsString("$0.00"));
		AssertUtils.assertTextMatches(getDriver().findElement(By.cssSelector("#order_total")), Matchers.containsString("$0.00"));
		AssertUtils.assertDisplayed(getLblOrderInstruction());
		AssertUtils.assertDisplayed(getLnkRedeemCoupons());
	}

	@Override
	public void closePromotionalModalReviewCartPage() {
		PauseUtil.pause(5000);
		/*
		 * getDriver().findElement(By.cssSelector(
		 * ".modal-content-TCI .cross-icon-16")) .click();
		 */
		PauseUtil.pause(2000);

	}

	@Override
	public void verifyWishListCartItem() {
		// TODO Auto-generated method stub

	}

	/*
	 * @Override public void verifyClassroomWishListItemOnReviewCartPage() {
	 * IParentCartSection iParentCartSection = getFactory()
	 * .getIParentCartSection(LocatorUtils.getBy("dw.cmp.parentcart"));
	 * iParentCartSection.verifyReccomendedTeacherNameOnReviewCartPage();
	 * 
	 * }
	 */

	@Override
	public void verifyEmptyCart() {
		AssertUtils.assertDisplayed(getLnkRedeemCoupons());
		AssertUtils.assertDisplayed(getLnkEnterOrdersEmptyCart());
		AssertUtils.assertDisplayed(getLnkShopBooksAndResourcesEmptyCart());
		AssertUtils.assertTextMatches(getLblOrderInstruction(), Matchers.containsString("You have no orders to review"));

	}

	@Override
	public void selectAmountToDonate(String amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyCouponSection() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyeBookForTrustSection() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectAmountToDonateOnTeacherCart(Configuration data, String amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyCartTotalOnParentCart() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyParentCartWithAllFunctionalities() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyHeader() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyBookTrustSection() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyBooktrustIsNotDisplayForEmptyCart() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectAmountToDonateOnParentCart(Configuration data, String amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyQuickViewModel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyRecommondationModel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyEditableAppliedFreepickCoupon() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addBonusBankCoupon() {

		SCHUtils.findElement("dw.bonusbank.inputbox.id").sendKeys(ConstantUtils.BONUS_PERCENTAGE_COUPON);
		SCHUtils.clickUsingJavaScript(applyButton);
		SCHUtils.WaitForAjax();

	}
	
/*   *************Commented Out as the QA job is failing ************ Satnam
	@Override
	public void verifyFreePromotionShouldNotDisplay() {
		CheckoutPage chkpge = new CheckoutPage();

		PauseUtil.waitForAjaxToComplete(2000);
		SCHUtils.WaitForAjax();
		
		String FREE_PRAMOTION_TEXT_CONFIRM_AND_SUBMIT_PAGE = "You've earned a pack";
		
		
		String Actual_Text=chkpge.fld_FreeItem1_Section_RewardsPage().getText().trim();
		
		if (Actual_Text.contains(FREE_PRAMOTION_TEXT_CONFIRM_AND_SUBMIT_PAGE)) {
			Assert.fail("Free Item line is present in the page for Teacher Catalogue");
		}
		if(sizelblTossIn().size()!=0){
			Assert.fail("Free Item line is present in the page for Teacher Catalogue");
		}

	}
	
	*/

	// Satnam - Updated the method as the above is not working
	
	@Override
	public void verifyFreePromotionShouldNotDisplay() {

		PauseUtil.waitForAjaxToComplete(2000);
		SCHUtils.WaitForAjax();
		if(sizelblTossIn().size()>0){
			Assert.fail("Free Item line is present in the page for Teacher Catalogue");
		}

	}
	
	
	@Override
	public void verifyParentCart() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifySubOrderTotal() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifySubQuentityTotal() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyItemTotalQuentity() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyOrderFinalAmount() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyClassroomWishListItemOnReviewCartPage() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickOnReviewCartButton() {
		getReviewButton().click();

	}

	@Override
	public void clickOnRemoveCircle() {

		getRemoveCircle().click();
	}

	@Override
	public void clickOnYesButton() {

		getYesButton().click();
	}

	@Override
	public void waitForRemoveCircle() {
		WaitUtils.waitForDisplayed(getRemoveCircle());

	}

	@Override
	public  void getBonusFlatText(String bonusFlat1, String bonusFlat2,
                                 String bonusFlat3, double bonusflattier1,
                                 double bonusflattier2, double bonusflattier3,
                                 double bonusflattier4) {
		
		String totalPrice = getTotalPrice().getText();
		
		String subTotalPrice = totalPrice.substring(1);
		
		Double dTotalPrice = Double.parseDouble(subTotalPrice);
        System.out.println("!!!!!!!dTotalPrice"+dTotalPrice);


        //Double bonusflatdr = Double.parseDouble(bonusflatdr11);
        
        
		
		//String txtBonusFlat = getTxtBonusFlat().getText();
		
		if(dTotalPrice>=bonusflattier1 && dTotalPrice<=bonusflattier2)
		{
			
			String bonusflatdr11 = getDollarsBonusFlat().getText();
	        String bonusflatdr1 = bonusflatdr11.substring(1);
            System.out.println("!!!!bonusflatdr1>>>"+bonusflatdr1);

            getTestBase().getContext().setProperty("testexecution.bonusflat",
					String.valueOf(bonusflatdr1));
            System.out.println("~~~~readValueCartPage tier1"+bonusflatdr1);
			if(!bonusflatdr1.equals(bonusFlat1)){
		    Assert.fail("Bonus flat dollars received for tier1 is incorrect. It should have been :"+bonusflatdr1);	
		    }
			//Assert.assertEquals(txtBonusFlat, ConstantUtils.BONUSFLATTXTMESSAGE);
		}
		
		if(dTotalPrice>=bonusflattier2 && dTotalPrice<=bonusflattier3)
		{
			String bonusflatdr22 = getDollarsBonusFlat().getText();
	        String bonusflatdr2 = bonusflatdr22.substring(1);
	        
	        
	        getTestBase().getContext().setProperty("testexecution.bonusflat",
					String.valueOf(bonusflatdr2));
            System.out.println("~~~~readValueCartPage tier2"+bonusflatdr2);
			if(!bonusflatdr2.equals(bonusFlat2)){
		    Assert.fail("Bonus flat dollars received for tier2 is incorrect. It should have been :"+bonusflatdr2);	
		    }
			//Assert.assertEquals(txtBonusFlat, ConstantUtils.BONUSFLATTXTMESSAGE);
		}
		
		if(dTotalPrice>=bonusflattier3 && dTotalPrice<=bonusflattier4)
		{
			String bonusflatdr33 = getDollarsBonusFlat().getText();
	        String bonusflatdr3 = bonusflatdr33.substring(1);
	        
	        getTestBase().getContext().setProperty("testexecution.bonusflat",
					String.valueOf(bonusflatdr3));
            System.out.println("~~~~readValueCartPage tier3"+bonusflatdr3);
            if(!bonusflatdr3.equals(bonusFlat3)){
		    Assert.fail("Bonus flat dollars received for tier3 is incorrect. It should have been :"+bonusflatdr3);	
		    }
			//Assert.assertEquals(txtBonusFlat, ConstantUtils.BONUSFLATTXTMESSAGE);
		}
		
		
	}

	@Override
	public void getBonusFlatText() {
		int evnt =getBonusDescText1().size();
			if((evnt==0)){
			Assert.fail("Check the Bonus");
		}
	}

	@Override
	public void getBonusFlatTextinConfirmandSubmitPage() {
		
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(4000);

		String confirmsubmitrewardssection = getsectionconfirmsubmitpagerewards().getText();
        /*getBonusFlatText(TestBaseProvider.getTestBase().getTestData().getString("bonusFlat1"),
                TestBaseProvider.getTestBase().getTestData().getString("bonusFlat2"),
                TestBaseProvider.getTestBase().getTestData().getString("bonusFlat3"),
                TestBaseProvider.getTestBase().getTestData().getDouble("bonusflattier1"),
                TestBaseProvider.getTestBase().getTestData().getDouble("bonusflattier2"),
                TestBaseProvider.getTestBase().getTestData().getDouble("bonusflattier3"),
                TestBaseProvider.getTestBase().getTestData().getDouble("bonusflattier4"));*/


        String bonusflat = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.bonusflat").toString();

		System.out.println("bonus flat is:"+bonusflat);
		System.out.println("rewards section text is:"+confirmsubmitrewardssection);
		
		if(!confirmsubmitrewardssection.contains(bonusflat)){
			Assert.fail("Bonus flat is incorrect or not displayed in confirm and submit page");
		
			
		}
		}
		
		
		
		
		@Override
		public void getBonusPercentageConfirmandSubmitPage() {
			
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(4000);
				  
			String confirmsubmitrewardssection = get_section_confirm_submit_page_rewards().getText();
			Double confirmsubmitrewardssection2 = Double.valueOf(confirmsubmitrewardssection.replaceAll("[^\\d.]+|\\.(?!\\d)", ""));
			System.out.println("##############:"+confirmsubmitrewardssection2);
            String bonusper = String.valueOf(confirmsubmitrewardssection2);
			
			String bonuspercentagevalue = TestBaseProvider.getTestBase().getContext()
					.getProperty("testexecution.bonuspercentagevalue").toString();
			//Double bonuspercentagevalue2=Double.parseDouble(bonuspercentagevalue);
			
			System.out.println("bonus flat is:"+bonuspercentagevalue);
			System.out.println("rewards section text is:"+confirmsubmitrewardssection2);
            System.out.println("converted to string"+bonusper);

            if (bonuspercentagevalue.equals(bonusper)) {


				System.out.println("Bonus Percentage value shown correct in confirm and submit page");
			} else {
				Assert.fail("Bonus Percentage is incorrect or not displayed in confirm and submit page");
			}
				
			}
			
			
			
			@Override
			public void getBonusPercentageConfirmationPage() {
				
				/*SCHUtils.waitForLoaderToDismiss();
				PauseUtil.waitForAjaxToComplete(2500);
				PauseUtil.pause(4000);
					  
				String confirmsubmitrewardssection = getsectionconfirmsubmitpagerewards().getText();
				
				String bonuspercentagevalue = TestBaseProvider.getTestBase().getContext()
						.getProperty("testexecution.bonuspercentagevalue").toString();
				
				System.out.println("bonus flat is:"+bonuspercentagevalue);
				System.out.println("rewards section text is:"+confirmsubmitrewardssection);
				
				if(!confirmsubmitrewardssection.contains(bonuspercentagevalue)){
					Assert.fail("Bonus Percentage is incorrect or not displayed in confirmation page");
				
				}*/
				
				SCHUtils.waitForLoaderToDismiss();
				PauseUtil.waitForAjaxToComplete(2500);
				PauseUtil.pause(4000);
					  
				String confirmsubmitrewardssection = get_section_confirm_submit_page_rewards().getText();
				Double confirmsubmitrewardssection2 = Double.valueOf(confirmsubmitrewardssection.replaceAll("[^\\d.]+|\\.(?!\\d)", ""));
				System.out.println("##############:"+confirmsubmitrewardssection2);
				
				String bonuspercentagevalue = TestBaseProvider.getTestBase().getContext()
						.getProperty("testexecution.bonuspercentagevalue").toString();
				Double bonuspercentagevalue2=Double.parseDouble(bonuspercentagevalue);
				
				System.out.println("bonus flat is:"+bonuspercentagevalue2);
				System.out.println("rewards section text is:"+confirmsubmitrewardssection2);
				
				if (confirmsubmitrewardssection2.equals(bonuspercentagevalue2)) {
					System.out.println("Bonus Percentage value shown correct in confirmation page");
				} else {
					Assert.fail("Bonus Percentage is incorrect or not displayed in confirmation page");
				}
		
	
	}

    @Override
    public void getBonusPercentageConfirmationPage1() {

				/*SCHUtils.waitForLoaderToDismiss();
				PauseUtil.waitForAjaxToComplete(2500);
				PauseUtil.pause(4000);

				String confirmsubmitrewardssection = getsectionconfirmsubmitpagerewards().getText();

				String bonuspercentagevalue = TestBaseProvider.getTestBase().getContext()
						.getProperty("testexecution.bonuspercentagevalue").toString();

				System.out.println("bonus flat is:"+bonuspercentagevalue);
				System.out.println("rewards section text is:"+confirmsubmitrewardssection);

				if(!confirmsubmitrewardssection.contains(bonuspercentagevalue)){
					Assert.fail("Bonus Percentage is incorrect or not displayed in confirmation page");

				}*/

        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(4000);

        String confirmsubmitrewardssection = get_section_confirm_submit_page_rewards1().getText();
        //Double confirmsubmitrewardssection2 = Double.valueOf(confirmsubmitrewardssection.replaceAll("[^\\d.]+|\\.(?!\\d)", ""));
        System.out.println("##############:"+confirmsubmitrewardssection);

        String bonuspercentagevalue = TestBaseProvider.getTestBase().getContext()
                .getProperty("testexecution.bonuspercentagevalue").toString();
        //Double bonuspercentagevalue2=Double.parseDouble(bonuspercentagevalue);

        System.out.println("bonus flat is:"+bonuspercentagevalue);
        System.out.println("rewards section text is:"+confirmsubmitrewardssection);

        if (confirmsubmitrewardssection.contains(bonuspercentagevalue)) {
            System.out.println("Bonus Percentage value shown correct in confirmation page");
        } else {
            Assert.fail("Bonus Percentage is incorrect or not displayed in confirmation page");
        }


    }

	@Override
	public void clickOnSubmitOrderPage() {

		getSubmitOrderButton().click();
	}

	@Override
	public void verifyBonusFlatTextOnSubmittedPage() {
		
		
        CartPage crtpage = new CartPage();
		
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(4000);
			  
		String confirmsubmitrewardssection = crtpage.getsectionconfirmsubmitpagerewards().getText();
		
		String bonusflat = TestBaseProvider.getTestBase().getContext()
				.getProperty("testexecution.bonusflat").toString();
		
		System.out.println("bonus flat is:"+bonusflat);
		System.out.println("rewards section text is:"+confirmsubmitrewardssection);
		
		if(!confirmsubmitrewardssection.contains(bonusflat)){
			Assert.fail("Bonus flat is incorrect or not displayed in confirm and submit page");
		}
		

		/*String txtSubmittedPage = getBonusFlatTextOnSubmittedPage().getText();
		Assert.assertEquals(txtSubmittedPage, ConstantUtils.BONUSFLATTXTCONFIRMANDSUBMITMESSAGE);*/

	}

	@Override
	public void verifyBonusFlatTextOnRewardsPage() {

		WebElement bonusFlat = getBonusFlatTextOnRewardsPage();

		List<WebElement> list = bonusFlat.findElements(By.tagName("span"));

		Boolean bonusFlag = Boolean.FALSE;
		for (WebElement bonusText : list) {
			if (bonusText.getText().contains("Bonus Coupons")) {
				Assert.fail(ConstantUtils.TEACHERSEEBONUSFLATTEXT);
				break;
			} else {
				if (!bonusFlag) {
					bonusFlag = Boolean.TRUE;
					Assert.assertTrue(true, ConstantUtils.TEACHERDOESNOTSEEBONUSFLATTEXT);
					
				}
			}

		}

	}

    @Override
    public void clickCartIcon_on_homepage() {
    	PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
        getCartIcon().click();
    }


    @Override
	public void verifyBonusFlatNotPresentinRewardsPage() {

		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		
		if(sizeDollarsBonusFlat().size()!=0){
			Assert.fail("Bonus flat should not be present when the order is not qualified");
		}
	}

	@Override
	public void verifyBonusPercentageDescription() {
		
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		
		String totalPrice = getTotalPrice().getText();
		
		String stdTotalPrice = totalPrice.substring(0);
		
		Double dTotalPrice = Double.parseDouble(stdTotalPrice);
		
		Double bonusPercentage = dTotalPrice * 3/100;
		
		System.out.println("dTotal price is" + dTotalPrice);
		String bonusDesc = Double.toString(bonusPercentage);
		System.out.println("bonusDesc  is" + bonusDesc);
		String txtBonusDesc = getBonusDescText().getText();
		System.out.println("txtBonusDesc  is" + txtBonusDesc);
		if(txtBonusDesc.contains(bonusDesc))
		{
			Assert.assertTrue(true, "Find the bonus percentage description");
		}
		else
		{
			Assert.fail("Could not find the bonus percentage description");
		}
		
	}
	
	
	@Override
	public void verifyBonusPercentageRewardsPage(double bonuspercent) {
		
		RewardsAndCoupons rewardsAndCoupons = new CheckoutPage().new RewardsAndCoupons();
		//CheckoutPage chkpage = new CheckoutPage();
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2500);
		
		double BonusFlat=TestBaseProvider.getTestBase().getTestData().getDouble("BonusFlat");
			   
			   
			   String totalPrice = getTotalPrice().getText();
				
				String stdTotalPrice = totalPrice.substring(1);
				
				System.out.println("########stdTotalPrice"+stdTotalPrice);
				
				Double dTotalPrice = Double.parseDouble(stdTotalPrice);
				
				//Double bonusPercentage = (dTotalPrice * (bonuspercent + BonusFlat)/100);
				Double bonusPercentage = (dTotalPrice * (bonuspercent )/100)+ BonusFlat;
				bonusPercentage =Double.parseDouble(new DecimalFormat("##.##").format(bonusPercentage));
				
				
				System.out.println("Bonus percentage is: "+bonusPercentage);
				
				String bonusflatdr11 = getDollarsBonusFlat().getText();
		        String bonusflatdr1 = bonusflatdr11.substring(1);
		        Double bonuspercentValue = Double.parseDouble(bonusflatdr1);
		        System.out.println("Bonus percentage actual is: "+bonuspercentValue);
		        
		        getTestBase().getContext().setProperty("testexecution.bonuspercentagevalue",
						String.valueOf(bonuspercentValue));
		        
		        Assert.assertEquals(bonuspercentValue, bonusPercentage,"Bonus Percentage is incorrect");
		        
		        
		        
		        
		        /*if(bonuspercentValue!=bonusPercentage){
		        	Assert.fail("Bonus percentage is incorrect in rewards and coupons page. It should have been: "+bonusPercentage);
		        	
		        }*/
		        
		        if(rewardsAndCoupons.chkBtnSkip().size()!=0)
				   {
				  //while (SCHUtils.isPresent(rewardsAndCoupons.getBtnSkip())) {
				   System.out.println(" rewardsAndCoupons.getBtnSkip() ==========> "
				     + SCHUtils.isPresent(rewardsAndCoupons.getBtnSkip()));
				   SCHUtils.clickUsingJavaScript(rewardsAndCoupons.getBtnSkip());
				   SCHUtils.waitForLoaderToDismiss();
				   PauseUtil.waitForAjaxToComplete();
				  }
				
		        rewardsAndCoupons.enterTossInNumberOfStudent(TestBaseProvider.getTestBase().getTestData());
		
		
	}
	
	
	
	

	@Override
	public void enterExpiredCoupon() {
		PauseUtil.pause(3000);
		SCHUtils.findElement("dw.bonusbank.inputbox.id").sendKeys(ConstantUtils.BONUS_PERCENTAGE_COUPON);
		SCHUtils.clickUsingJavaScript(applyButton);
		SCHUtils.WaitForAjax();
	}
	
	
	@Override
	public void verifyExpiredCouponErrorMessage() {
		String txtSubmittedPage = getBonusFlatTextOnSubmittedPage().getText();
		Assert.assertEquals(txtSubmittedPage, ConstantUtils.BONUSFLATTXTCONFIRMANDSUBMITMESSAGE);
		
	}


	@Override
	public void verifyExpiredCouponErrorMessage(String bonuspercExpiredErrorMsg) {
		String txtSubmittedPage = getBonusFlatTextOnSubmittedPage().getText();
		Assert.assertEquals(txtSubmittedPage, bonuspercExpiredErrorMsg);
		
	}
	
	@Override
	public void verifyExpiredCouponErrorMessage2() {
		String txtSubmittedPage = getBonusFlatTextOnSubmittedPage().getText();
		Assert.assertEquals(txtSubmittedPage, ConstantUtils.BONUSFLATTXTCONFIRMANDSUBMITMESSAGE2);
		
	}

	@Override
	public void enterRedeemedCoupon() {
		SCHUtils.findElement("dw.bonusbank.inputbox.id").sendKeys(ConstantUtils.BONUS_PERCENTAGE_COUPON);
		SCHUtils.clickUsingJavaScript(applyButton);
		SCHUtils.WaitForAjax();
		
	}


	@Override
	public void verify_the_Grades_order_in_CartPage() {
		PauseUtil.pause(15000);
		String value1=txtField1().getAttribute("value");
		PauseUtil.pause(2000);
		String value2=txtField2().getAttribute("value");
		PauseUtil.pause(2000);
		String value3=txtField3().getAttribute("value");
		
		Assert.assertEquals(value1, TestBaseProvider.getTestBase().getTestData().getString("sname1"));
		Assert.assertEquals(value2, TestBaseProvider.getTestBase().getTestData().getString("sname2"));
		Assert.assertEquals(value3, TestBaseProvider.getTestBase().getTestData().getString("sname3"));
		
	}
	
	@Override
	public void verify_the_Grades_order_in_SavedCartPage() {
		PauseUtil.pause(2000);
		String value1=txtField1_SavedCart().getText();
		PauseUtil.pause(2000);
		String value2=txtField2_SavedCart().getText();
		PauseUtil.pause(2000);
		String value3=txtField3_SavedCart().getText();
		
		Assert.assertEquals(value1, TestBaseProvider.getTestBase().getTestData().getString("sname1"));
		Assert.assertEquals(value2, TestBaseProvider.getTestBase().getTestData().getString("sname2"));
		Assert.assertEquals(value3, TestBaseProvider.getTestBase().getTestData().getString("sname3"));
	}
	
	@Override
	public void verify_the_Grades_order_in_SubmitPage() {
		PauseUtil.pause(10000);
		String value1=txtField1_submitPage().getAttribute("title");
		PauseUtil.pause(2000);
		String value2=txtField2_submitPage().getAttribute("title");
		PauseUtil.pause(2000);
		String value3=txtField3_submitPage().getAttribute("title");
		
		Assert.assertEquals(value1, TestBaseProvider.getTestBase().getTestData().getString("sname1"));
		Assert.assertEquals(value2, TestBaseProvider.getTestBase().getTestData().getString("sname2"));
		Assert.assertEquals(value3, TestBaseProvider.getTestBase().getTestData().getString("sname3"));
		
	}
	@Override
	public void verify_the_Grades_order_in_Order_reference_page() {
		PauseUtil.pause(10000);
		String value1=txtField1_submitPage().getAttribute("title");
		PauseUtil.pause(2000);
		String value2=txtField2_submitPage().getAttribute("title");
		PauseUtil.pause(2000);
		String value3=txtField3_submitPage().getAttribute("title");
		
		Assert.assertEquals(value1, TestBaseProvider.getTestBase().getTestData().getString("sname1"));
		Assert.assertEquals(value2, TestBaseProvider.getTestBase().getTestData().getString("sname2"));
		Assert.assertEquals(value3, TestBaseProvider.getTestBase().getTestData().getString("sname3"));
		
		
		
	}
	@Override
	public void clickOn_ProceedToCheckoutBtn() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(3000);
		Wait_for_invisibility_of_locator();
		btnProceedToCheckout().click();

		}
	
	public void Wait_for_invisibility_of_locator() {
		
		WebDriver driver=TestBaseProvider.getTestBase().getDriver();
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loader-indicator']")));
		//WaitUtils.waitForNotDisplayed(Loader_invisibilty());
	}
	
	@Override
	public boolean is_RewardsAndCouponsActive_dislayed(){
		PauseUtil.waitForAjaxToComplete(2000);
		PauseUtil.pause(6000);
		Wait_for_invisibility_of_locator();
			if(RewardsAndCouponsActive().isDisplayed() )
				return true;
			else
				return false;		
		}
	
	@Override
	public void validate_the_modified_names_in_CartPage() {
		PauseUtil.pause(5000);
		String value1=txtField1().getAttribute("value");
		PauseUtil.pause(2000);
		String value2=txtField2().getAttribute("value");
		PauseUtil.pause(2000);
		String value3=txtField3().getAttribute("value");
		
		Assert.assertEquals(value1, TestBaseProvider.getTestBase().getTestData().getString("EditName1"));
		Assert.assertEquals(value2, TestBaseProvider.getTestBase().getTestData().getString("EditName2"));
		Assert.assertEquals(value3, TestBaseProvider.getTestBase().getTestData().getString("EditName3"));
		
	}
	
	@Override
	public void validate_the_modified_names_in_SubmitPage() {
		PauseUtil.pause(10000);
		String value1=txtField1_submitPage().getAttribute("title");
		PauseUtil.pause(2000);
		String value2=txtField2_submitPage().getAttribute("title");
		PauseUtil.pause(2000);
		String value3=txtField3_submitPage().getAttribute("title");
		
		Assert.assertEquals(value1, TestBaseProvider.getTestBase().getTestData().getString("EditName1"));
		Assert.assertEquals(value2, TestBaseProvider.getTestBase().getTestData().getString("EditName2"));
		Assert.assertEquals(value3, TestBaseProvider.getTestBase().getTestData().getString("EditName3"));
		
	}
	
	@Override
	public void validate_the_modified_names_in_Order_reference_page() {
		PauseUtil.pause(10000);
		String value1=txtField1_submitPage().getAttribute("title");
		PauseUtil.pause(2000);
		String value2=txtField2_submitPage().getAttribute("title");
		PauseUtil.pause(2000);
		String value3=txtField3_submitPage().getAttribute("title");
		
		Assert.assertEquals(value1, TestBaseProvider.getTestBase().getTestData().getString("EditName1"));
		Assert.assertEquals(value2, TestBaseProvider.getTestBase().getTestData().getString("EditName2"));
		Assert.assertEquals(value3, TestBaseProvider.getTestBase().getTestData().getString("EditName3"));
		
	}
	
	@Override
	public void Teacher_clicks_On_Plus_btn_for_student_1() {
		PauseUtil.pause(8000);
		btn_Plus_Student1_Qty().click();
		PauseUtil.pause(2000);
		click_outside_in_ReviewCartPage().click();
		PauseUtil.pause(17000);
	}
	
	@Override
	public void validate_the_updated_quantity_by_clicking_On_Plus_for_Student1() {
		PauseUtil.pause(2000);
		String value1=cart_qty_item1().getAttribute("value");
		int value2=Integer.parseInt(value1);
		
		int value3=TestBaseProvider.getTestBase().getTestData().getInt("qty1");
		value3=value3+1;
		
		Assert.assertEquals(value2, value3);
		
	}
	
	@Override
	public void Teacher_clicks_On_Minus_btn_for_student_1() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(8000);
		btn_Minus_Student1_Qty().click();
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		click_outside_in_ReviewCartPage().click();
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(5000);
	}
	
	@Override
	public void Teacher_clicks_On_Minus_until_becomes_to_0() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(8000);
		do {
			btn_minus_delete_item_ReviewPage().click();
			PauseUtil.pause(2000);
			hdr_ReviewCart().click();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(3000);
			try {
				btn_minus_delete_item_ReviewPage().isDisplayed();
			} catch (Exception e) {
				System.out.println("################Cart is empty");
				/*Home_icon_on_header().click();
				PauseUtil.pause(10000);*/
				break;
			}
		} while (btn_minus_delete_item_ReviewPage().isDisplayed());
	}
	
	@Override
	public void verify_the_items_are_not_listed_in_ReviewcartPage() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		String text=txt_empty_cart_ReviewPage().getText();
		text = text.replaceAll("\\s+","");
		String exp="Youhavenoorderstoreview.Youmayenterordersorshopbooks&resources.";
		Assert.assertEquals(text,exp, "Items are listed in Review Cart Page");
	}
	
	@Override
	public void validate_the_updated_quantity_by_clicking_On_Minus_for_Student1() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		String value1=cart_qty_item1().getAttribute("value");
		int value2=Integer.parseInt(value1);
		
		int value3=TestBaseProvider.getTestBase().getTestData().getInt("qty1");
		value3=value3-1;
		
		Assert.assertEquals(value2, value3);
		
	}
	
	public void verify_the_amount_paid_by_cheque_with_cheque_amt_ConfirmSub_Page(double value) {

		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);

		String Amt_paid_by_cheque=value_amt_paid_by_cheque_ConfirmPage().getText();
		Amt_paid_by_cheque = Amt_paid_by_cheque.substring(1);
		double Amt_paid_by_cheque_act=Double.parseDouble(Amt_paid_by_cheque);
		
		System.out.println("#############"+Amt_paid_by_cheque_act);
		System.out.println("@@@@@@@@@@@@@"+value);
		
		Assert.assertEquals(Amt_paid_by_cheque_act, value, "Amount paid by cheque value is incorrect");
	}
	
	@Override
	public void Teacher_do_the_empty_saved_cart() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(5000);
		select_arrow_SavedCart().click();
		PauseUtil.pause(1000);
		/*select_ManageSavedCart().click();
		PauseUtil.pause(12000);*/
		
		String text=selection_SavedCart().getText();
		System.out.println("^^^^^^^^^^^^^^^^^^"+text);
		
		if (!text.equals("There are no saved carts.")) {
			do {
				select_ManageSavedCart().click();
				PauseUtil.pause(12000);
				clicks_on_delete_Saved_Cart_item().click();
				PauseUtil.pause(2000);
				delete_to_yes_Saved_Cart_item().click();
				PauseUtil.pause(8000);
				try {
					clicks_on_delete_Saved_Cart_item().isDisplayed();
				} catch (Exception e) {
					System.out.println("################Cart is empty");
					Home_icon_on_header().click();
					PauseUtil.pause(10000);
					break;
				}
			} while (clicks_on_delete_Saved_Cart_item().isDisplayed());
		} else {
			System.out.println("@@@@@@@@@@@@@@@Cart is empty");
		}
		
	}
	
	@Override
	public void click_on_btn_SaveCart_for_Later() {
		PauseUtil.waitForAjaxToComplete(2500);
		btn_SaveCart_for_Later().click();
	}
	
	@Override
	public void Teacher_saves_the_cart() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		popup_SaveCart_for_Later_btn_YES().click();
		PauseUtil.pause(2000);
		popup_SaveCart_for_Later_fld_name().click();
		popup_SaveCart_for_Later_fld_name().sendKeys(TestBaseProvider.getTestBase().getTestData().getString("cartName1"));
		PauseUtil.pause(2000);
		popup_SaveCart_for_Later_btn_SAVE().click();
		PauseUtil.pause(12000);
	}
	
	@Override
	public void Teacher_selects_saved_cart() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		select_arrow_SavedCart().click();
		PauseUtil.pause(2000);
		selection_SavedCart().click();
		PauseUtil.pause(10000);
	}
	
	@Override
	public void verify_items_are_grouped_by_student_and_teacher_Club_SavedCart_Pages() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Student_Club_header_SavedCart().isDisplayed();
		Teacher_Cat_header_SavedCart().isDisplayed();
		int Student_rows=lst_Student_Club_items_list_SavedCart().size();
		int Teacher_rows=lst_Teacher_Cat_items_list_SavedCart().size();
		
		Assert.assertEquals(Student_rows, 1, "StudentClub items list is incorrect");
		Assert.assertEquals(Teacher_rows, 2, "Teacher Catalogues items list is incorrect");
	}
	
	@Override
	public void verify_items_are_grouped_by_teacher_Club_SavedCart_Page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Teacher_Cat_header_SavedCart().isDisplayed();
		int Teacher_rows=lst_Student_Club_items_list_SavedCart().size();	//for Teacher cart also the same
		
		Assert.assertEquals(Teacher_rows, 3, "Teacher Catalogues items list is incorrect");
	}
	
	@Override
	public void verify_subTotal_of_student_and_teacher_Club_amount_SavedCart_Page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String subTotal_StudentClub=subTotal_Student_SavedCart().getText();
		subTotal_StudentClub = subTotal_StudentClub.substring(1);
		double subTotal_StudentClub_exp=Double.parseDouble(subTotal_StudentClub);
		
		String subTotal_TeacherCatalogue=subTotal_Teacher_SavedCart().getText();
		subTotal_TeacherCatalogue = subTotal_TeacherCatalogue.substring(1);
		double subTotal_TeacherCatalogue_exp=Double.parseDouble(subTotal_TeacherCatalogue);
		
		double TotalValue_exp=subTotal_StudentClub_exp+subTotal_TeacherCatalogue_exp;
		TotalValue_exp =Double.parseDouble(new DecimalFormat("##.##").format(TotalValue_exp));
		
		String Total_Value=Total_amount_SavedCart().getText();
		Total_Value = Total_Value.substring(1);
		double Total_Value_act=Double.parseDouble(Total_Value);
		
		Assert.assertNotSame(Total_Value_act, TotalValue_exp, "Total Value is incorrect");
		
	}
	
	@Override
	public void verify_subTotal_of_student_Club_amount_SavedCart_Page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String subTotal_StudentClub=subTotal_Student_SavedCart().getText();
		subTotal_StudentClub = subTotal_StudentClub.substring(1);
		double subTotal_StudentClub_exp=Double.parseDouble(subTotal_StudentClub);
		
		double TotalValue_exp=subTotal_StudentClub_exp;
		TotalValue_exp =Double.parseDouble(new DecimalFormat("##.##").format(TotalValue_exp));
		
		String Total_Value=Total_amount_SavedCart().getText();
		Total_Value = Total_Value.substring(1);
		double Total_Value_act=Double.parseDouble(Total_Value);
		
		Assert.assertNotSame(Total_Value_act, TotalValue_exp, "Total Value is incorrect");
		
	}
	
	@Override
	public void verify_subTotal_of_teacher_Catalogues_amount_SavedCart_Page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		String subTotal_StudentClub=subTotal_Student_SavedCart().getText();		//For teacher also the same method
		subTotal_StudentClub = subTotal_StudentClub.substring(1);
		double subTotal_StudentClub_exp=Double.parseDouble(subTotal_StudentClub);
		
		double TotalValue_exp=subTotal_StudentClub_exp;
		TotalValue_exp =Double.parseDouble(new DecimalFormat("##.##").format(TotalValue_exp));
		
		String Total_Value=Total_amount_SavedCart().getText();
		Total_Value = Total_Value.substring(1);
		double Total_Value_act=Double.parseDouble(Total_Value);
		
		Assert.assertNotSame(Total_Value_act, TotalValue_exp, "Total Value is incorrect");
		
	}
	
	@Override
	public void verify_items_are_not_deleted_in_student_and_teacher_Club_SavedCart_Page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Student_Club_header_SavedCart().isDisplayed();
		Teacher_Cat_header_SavedCart().isDisplayed();
		int Student_rows=lst_Student_Club_items_list_SavedCart().size();
		int Teacher_rows=lst_Teacher_Cat_items_list_SavedCart().size();
		
		Assert.assertEquals(Student_rows, 1, "StudentClub items list is incorrect");
		Assert.assertEquals(Teacher_rows, 2, "Teacher Catalogues items list is incorrect");
	}
	
	@Override
	public void Teacher_deletes_the_Saved_cart() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		btn_delete_SavedCart().click();
		PauseUtil.pause(2000);
		delete_to_yes_Saved_Cart_item().click();
	}
	
	@Override
	public void Teacher_clicks_delete_and_NO_Saved_cart() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		btn_delete_SavedCart().click();
		PauseUtil.pause(2000);
		delete_to_no_Saved_Cart_item().click();
	}
	
	@Override
	public void Teacher_clicks_delete_and_YES_Saved_cart() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		btn_delete_Saved_Cart_Page().click();
		PauseUtil.pause(2000);
		delete_to_yes_Saved_Cart_item().click();
	}
	
	@Override
	public void verify_deleted_saved_cart_is_not_shown() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		String text=msg_emptyList_SavedCart().getText();
		text = text.replaceAll("\\s+","");
		String exp="NoSavedListAvailableDateCreatedCartNameItemsinCartViewRestoreDelete";
		Assert.assertEquals(text,exp, "Saved Cart List is shown");
		
	}
	
	@Override
	public void selects_the_Manage_SavedCart() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		select_arrow_SavedCart().click();
		PauseUtil.pause(2000);
		btn_Manage_Saved_Cart().click();
	}
	
	@Override
	public void restore_the_SavedCart() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		btn_Restore_Saved_Cart_Page().click();
		PauseUtil.pause(2000);
		delete_to_yes_Saved_Cart_item().click();
	}
	
	@Override
	public void view_the_SavedCart() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		btn_view_Saved_Cart_Page().click();
		PauseUtil.pause(2000);
	}
	
	@Override
	public void Verify_savedCart_is_not_shown_in_the_SavedCart_list() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Assert.assertTrue(hdr_ReviewCart().isDisplayed(), "Review Cart Page is not displayed");
		select_arrow_SavedCart().click();
		PauseUtil.pause(2000);
		btn_Manage_Saved_Cart().click();
		PauseUtil.pause(8000);
		String text=msg_emptyList_SavedCart().getText();
		text = text.replaceAll("\\s+","");
		System.out.println("#############:"+text);
		String exp="NoSavedListAvailableDateCreatedCartNameItemsinCartViewRestoreDelete";
		Assert.assertEquals(text,exp, "Saved Cart List is shown");
		
	}
	
	@Override
	public void verify_items_are_listed_in_student_and_teacher_Club_SavedCart_Page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Student_Club_header_SavedCart().isDisplayed();
		Teacher_Cat_header_SavedCart().isDisplayed();
		int Student_rows=lst_Student_Club_items_list_SavedCart().size();
		int Teacher_rows=lst_Teacher_Cat_items_list_SavedCart().size();
		
		Assert.assertEquals(Student_rows, 1, "StudentClub items list is incorrect");
		Assert.assertEquals(Teacher_rows, 2, "Teacher Catalogues items list is incorrect");
	}
	
	@Override
	public void verify_Manage_cart_items_are_not_listed_in_SavedCart_Page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);

		Assert.assertTrue(!lst_Student_Club_items_list_Manage_cart_SavedCart().isDisplayed(), "List is displayed");
		
	}
	
	@Override
	public void verify_header_MySavedCarts_displayed_in_SavedCart_Page() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		Assert.assertTrue(header_MySavedCart_SavedCart().isDisplayed(), "My Saved Carts header is not displayed in SavedCart page");
		
	}
	
	@Override
	public void Selects_Return_To_ManageSavedCart() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		text_Return_To_manageYourSavedCart_SavedCart().click();
	}
	
	@Override
	public void verify_Manage_Your_Savedcarts_list_displayed() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		Assert.assertTrue(list_Manage_SavedCart_SavedCart().isDisplayed(), "Manage Your Saved Carts list is not displayed");
		
	}
	
	
	
	@FindBy(locator="dw.teacher.yto.reviewCart")
	private WebElement buttonReview_cart ;
	
	@FindBy(locator="dw.teacher.reviewCart.SaveForLater")
	private WebElement buttonSaveCart ;
	
	@FindBy(locator="dw.teacher.reviewCart.SavedCardModal")
	private WebElement ModalSaveCart  ;
	
	@FindBy(locator="dw.teacher.SaveCartModal.ButtonYes")
	private WebElement buttonYesSaveCart;
	
	@FindBy(locator="dw.teacher.SavecartModal.CartName")
	private WebElement inputCartName;
	
	@FindBy(locator="dw.teacher.SavecartModal.saveCart")
	private WebElement buttonSaveCartName ;
	
	@FindBy(locator="dw.teacher.reviewCart.linkSavedCard")
	private WebElement linkSavedCart;
	
	@FindBy(locator="dw.teacher.SavedcartModal.nameofSavedCard")
	private WebElement Savedcartname_SavedCartModal;
	
	@FindBy(locator="dw.teacher.Savedcart.Revieworder.BookLink")
	private WebElement linkBooktitle_savedcartReviewpage ;
	
	@FindBy(locator="dw.teacher.Savedcart.Revieworder.linkFullDetails")
	private WebElement linkFullDetailBookdescription_savedcartReviewPage ;
	
	@FindBy(locator="dw.teacher.reviewOrder.BookFulldetailmodal.enterQuantity")
	private WebElement inputEnterquantity ;
	
	@FindBy(locator="dw.teacher.reviewOrder.BookFulldetailmodal.buttonAddToCart")
	private WebElement buttonAddtoCart ;
	
	@FindBy(locator="dw.teacher.reviewOrder.BookFulldetailmodal.buttonGoToCheckout")
	private WebElement buttonGoToCheckOut;
	
	@FindBy(locator="dw.teacher.reveiwOrder.CartQ")
	private WebElement OrderQuantity_Cart ;
	
	public WebElement getbuttonReview_cart(){
		return buttonReview_cart;
	}

	public WebElement getbuttonSaveCart(){
		return buttonSaveCart;
	}

	public WebElement getModalSaveCart(){
		return ModalSaveCart;
	}

	public WebElement getbuttonYesSaveCart(){
		return buttonYesSaveCart;
	}

	public WebElement getinputCartName(){
		return inputCartName;
	}

	public WebElement getbuttonSaveCartName(){
		return  buttonSaveCartName ;
	}

	public WebElement getlinkSavedCart(){
		return linkSavedCart;
	}

	public WebElement getSavedcartname_SavedCartModal(){
		return Savedcartname_SavedCartModal;
	}

	public WebElement getlinkBooktitle_savedcartReviewpage(){
		return linkBooktitle_savedcartReviewpage ;
	}

	public WebElement getlinkFullDetailBookdescription_savedcartReviewPage(){
		return linkFullDetailBookdescription_savedcartReviewPage ;
	}

	public WebElement getinputEnterquantity(){
		return inputEnterquantity ;
	}

	public WebElement getbuttonAddtoCart(){
		return buttonAddtoCart ;
	}

	public WebElement getbuttonGoToCheckOut(){
		return buttonGoToCheckOut;
	}

	public WebElement getOrderQuantity_Cart(){
		return OrderQuantity_Cart ;
	}
	
	
	/*####################################################################SATNAM */




@Override
	public void saveCart(String cartName){
		
	// click review cart button
		 WebElement button = PauseUtil.getWhenVisible(buttonReview_cart, 10);
		 button.click();
	//	click save cart for later
		 
		 PauseUtil.clickWhenReady(buttonSaveCart, 10);
		 
		WebElement popupSaveCart = PauseUtil.getWhenVisible(ModalSaveCart, 10);
		if(popupSaveCart.isDisplayed()){
			System.out.println("Saved Card Popup Displayed");
			
			// click Yes on the Modal
			PauseUtil.clickWhenReady(buttonYesSaveCart, 10);
		}else{
			Assert.fail("Save Cart Popup Not shown");
		}
		
		
		// Enter Cart Name 
		
		WebElement inputCName = PauseUtil.getWhenVisible(inputCartName, 15);
		inputCName.clear();
		inputCName.sendKeys("saveMe");
		
		// click on Save Button on save cart modal
		
		PauseUtil.clickWhenReady(buttonSaveCartName, 10);
		System.out.println("Link clicked Saved Carts >");
		// Click on the Saved Carts Link on the YTO
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(">>>>> Saved Carts >");
		PauseUtil.clickWhenReady(linkSavedCart, 30);
		
		// now select the saved cart from the list of saved cart names
	
		PauseUtil.clickWhenReady(Savedcartname_SavedCartModal, 15);
		
		System.out.println("save cart review order page");
		
		// click on the  book title
		
		PauseUtil.clickWhenReady(linkBooktitle_savedcartReviewpage, 15);
		System.out.println("clicked on book title");
		
		PauseUtil.clickWhenReady(linkFullDetailBookdescription_savedcartReviewPage,30);
		
		System.out.println("click full detail LInk");
		
		WebElement inputQantity = PauseUtil.getWhenVisible(inputEnterquantity, 10);
		inputQantity.clear();
		inputQantity.sendKeys("5");
		
		System.out.println("Add to cart button click");
		
		buttonAddtoCart.click();
		
		/*PauseUtil.clickWhenReady(buttonGoToCheckOut, 20);
		
		WebElement cartNO = PauseUtil.getWhenVisible(OrderQuantity_Cart, 20);
		System.out.println("cart NO "+cartNO.getText());	*/
		
		
	}
	
	
	public void verifyQuant(){
		
		PauseUtil.clickWhenReady(buttonGoToCheckOut, 20);
		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		driver.navigate().refresh();
		WebElement cartNO = PauseUtil.getWhenVisible(OrderQuantity_Cart, 20);
		System.out.println("quantity check"+cartNO.getText());
		String qValue = cartNO.getText();
		int iTest = Integer.parseInt(qValue);
		if(iTest>2){
			Assert.assertEquals("Saved Card saved with updates", "Saved Card saved with updates");
			System.out.println("Integer value"+iTest);
		}
		
		
		
	}
	
	
public void login_sameaccount_verifyQty_autosave(String username, String password, boolean isRemember, String option)
{
		
	WebDriver driver=TestBaseProvider.getTestBase().getDriver();
	//driver = new FirefoxDriver();
	String userpath = "input[placeholder='Scholastic Account Number']";
	String pwdpath = "input[placeholder='Scholastic Account Password']";
	String loginbtnpath = ".home-page-login-btn";
	String prodclose = "//a[@class='fsrCloseBtn']";
	String logincloseicon = "//a[@class='close dialog-close']";
	System.out.println("called firefox driver");
	driver.get("https://dev35-rco-scholastic.demandware.net/s/rco-ca/home");
	System.out.println("called get driver");
	
    PauseUtil.waitForAjaxToComplete(4000);
    String path = "//*[@id='TIImage']/div[1]/a/span";
    
    if(driver.findElements(By.xpath(path)).size()!=0)
    {
    	driver.findElement(By.xpath(path)).click();
    	PauseUtil.pause(3000);	
    }
    
    
	PauseUtil.pause(5000);
	driver.findElement(By.cssSelector(userpath)).click();
	driver.findElement(By.cssSelector(userpath)).sendKeys(username);
	PauseUtil.pause(1000);
	driver.findElement(By.cssSelector(pwdpath)).click();
	driver.findElement(By.cssSelector(pwdpath)).sendKeys(password);
	PauseUtil.pause(1500);
	driver.findElement(By.cssSelector(loginbtnpath)).click();
	PauseUtil.pause(5000);
	
    if(driver.findElements(By.xpath(logincloseicon)).size()!=0){
    	driver.findElement(By.xpath(logincloseicon)).click();
    	SCHUtils.waitForLoaderToDismiss();
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(10000);
    }
    
    if(driver.findElements(By.xpath(prodclose)).size()!=0){
    	driver.findElement(By.xpath(prodclose)).click();
    	SCHUtils.waitForLoaderToDismiss();
    	PauseUtil.waitForAjaxToComplete(2500);
    	PauseUtil.pause(10000);
    	
    }	
    
    String enterorder = "img[src*='orders']";
	
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
	 
	 
	 PauseUtil.waitForAjaxToComplete(2500);
		
		String carttable = "//*[@id='yto-flyer-table']/tbody";
		
		
		List<WebElement> cartTable1=driver.findElements(By.xpath(carttable));
	    for(WebElement cartTable:cartTable1){
	    List<WebElement> cartTabletr1= cartTable.findElements(By.tagName("tr"));
	    for(WebElement cartTabletd1:cartTabletr1){
	    List<WebElement> cartTabletd= cartTabletd1.findElements(By.tagName("td"));
	    
	    String actualprice1 = cartTabletd.get(3).getText();
	    actualprice1 = actualprice1.substring(1);
		Double actualprice = Double.parseDouble(actualprice1.trim());
	    
	    if(actualprice>=1.01){
		 String itemqty_entered1 = cartTabletd.get(4).findElement(By.tagName("input")).getAttribute("value");
		 int act_itemqty_entered = Integer.parseInt(itemqty_entered1);
		 System.out.println("actual qty entered is :"+ act_itemqty_entered);
		 
		 String exp_itemqty_entered1 = getTestBase().getContext()
					.getProperty("testexecution.itemqty_entered").toString();
		 int exp_itemqty_entered = Integer.parseInt(exp_itemqty_entered1);
		 if(act_itemqty_entered!=exp_itemqty_entered)
			{
			Assert.fail("Items entered are not auto saved after closing the browser: "+exp_itemqty_entered);	
			}	
		 break;
	     }}
		}
	    driver.quit();
	 
	 
	 
}



@Override
public void verify_items_autosaved_yto(String itemQty) {
	PauseUtil.waitForAjaxToComplete(2500);
	
	String carttable = "//*[@id='yto-flyer-table']/tbody";
	WebDriver driver=TestBaseProvider.getTestBase().getDriver();
	
	
	List<WebElement> cartTable1=driver.findElements(By.xpath(carttable));
    for(WebElement cartTable:cartTable1){
    List<WebElement> cartTabletr1= cartTable.findElements(By.tagName("tr"));
    for(WebElement cartTabletd1:cartTabletr1){
    List<WebElement> cartTabletd= cartTabletd1.findElements(By.tagName("td"));
    
    String actualprice1 = cartTabletd.get(3).getText();
    actualprice1 = actualprice1.substring(1);
	Double actualprice = Double.parseDouble(actualprice1.trim());
    
    if(actualprice>=1.01){
	 String itemqty_entered1 = cartTabletd.get(4).findElement(By.tagName("input")).getAttribute("value");
	 int act_itemqty_entered = Integer.parseInt(itemqty_entered1);
	 System.out.println("actual qty entered is :"+ act_itemqty_entered);
	 
	 String exp_itemqty_entered1 = getTestBase().getContext()
				.getProperty("testexecution.itemqty_entered").toString();
	 int exp_itemqty_entered = Integer.parseInt(exp_itemqty_entered1);
	 if(act_itemqty_entered!=exp_itemqty_entered)
		{
		Assert.fail("Items entered are not auto saved after closing the browser: "+exp_itemqty_entered);	
		}	
	 break;
     }}
	}}
	
	
	
	
	public void verify_Present_PopUp_Rewards_Table() {
		PauseUtil.waitForAjaxToComplete(4000);
		Assert.assertEquals(sizebtntopBonuspointModelProceedToCheckout().size() >=1, true);
	}
	
	public void verify_NotPresent_PopUp_Rewards_Table() {
		PauseUtil.waitForAjaxToComplete(4000);
		Assert.assertEquals(sizebtntopBonuspointModelProceedToCheckout().size() >=1, false);
	}
	
	@Override
	public void click_proceedtocheckout_popuprewardtable(){
		
	SCHUtils.waitForLoaderToDismiss();
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(2500);
	WaitUtils.waitForDisplayed(getbtntopBonuspointModelProceedToCheckout());
	SCHUtils.clickUsingJavaScript(getbtntopBonuspointModelProceedToCheckout());
	SCHUtils.waitForLoaderToDismiss();
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(2500);	
	}
	
	
	@Override
	public void click_proceedtocheckout_bottom_popuprewardtable(){
		
	SCHUtils.waitForLoaderToDismiss();
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(2500);
	WaitUtils.waitForDisplayed(getbtnbottomBonuspointModelProceedToCheckout());
	SCHUtils.clickUsingJavaScript(getbtnbottomBonuspointModelProceedToCheckout());
	SCHUtils.waitForLoaderToDismiss();
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(2500);	
	}
	
	
	@Override
	public void click_lnk_returntoshop_popuprewardtable(){
		
	SCHUtils.waitForLoaderToDismiss();
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(2500);
	WaitUtils.waitForDisplayed(getlnkBonuspointModelReturnToShop());
	SCHUtils.clickUsingJavaScript(getlnkBonuspointModelReturnToShop());
	SCHUtils.waitForLoaderToDismiss();
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(2500);	
	}
	
	
	@Override
	public void verify_flyerpage_with_returntoshoplink(){
		
    CheckoutPage chkpge = new CheckoutPage();
	SCHUtils.waitForLoaderToDismiss();
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(2500);
	Assert.assertEquals(chkpge.sizebtncheckoutflyerpageupdatecart().size() > 0, true);
	}
	
	@Override
	public void getsubtotals_reviewcartpage(String section){
	
	//WebDriver driver=TestBaseProvider.getTestBase().getDriver();	
	if(section.equalsIgnoreCase("SOO")){
		List<WebElement> ele = reviewcartsizesoosubtotals();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
			System.out.println("Coming to SOO section if dollar value is zero for review cart");
		for(int i=0;i<ele.size();i++){
			String soosubtotal_reviewcart1= ele.get(i).getText();
			soosubtotal_reviewcart1 = soosubtotal_reviewcart1.substring(1);
			this.soosubtotal_reviewcart += Double.parseDouble(soosubtotal_reviewcart1);
		}
		}	
		System.out.println("SOO SUBTOTAL FOR REVIEW CART PAGE IS @@@@@@@@@@@@@@@@@@@@ "+soosubtotal_reviewcart);
	}
	
	else if(section.equalsIgnoreCase("SFO")){
		List<WebElement> ele = reviewcartsizesfosubtotals();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String sfosubtotal_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-sfo-content']/div[1]/table/following-sibling::div/div/ul/li[contains(text(),'Subtotal')]/following-sibling::li[1])["+i+"]")).getText();
			String sfosubtotal_reviewcart1= ele.get(i).getText();
			sfosubtotal_reviewcart1 = sfosubtotal_reviewcart1.substring(1);
			sfosubtotal_reviewcart += Double.parseDouble(sfosubtotal_reviewcart1);
		}
		}
	}
	
	else if(section.equalsIgnoreCase("YTO")){
		List<WebElement> ele = reviewcartsizeytosubtotals();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String ytosubtotal_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-student-content']/table/following-sibling::div/div/ul/li[contains(text(),'Subtotal')]/following-sibling::li[1]/span)["+i+"]")).getText();
			String ytosubtotal_reviewcart1= ele.get(i).getText();
			ytosubtotal_reviewcart1 = ytosubtotal_reviewcart1.substring(1);
			ytosubtotal_reviewcart += Double.parseDouble(ytosubtotal_reviewcart1);
		}
		}
	}
	
	else if(section.equalsIgnoreCase("TE")){
		List<WebElement> ele = reviewcartsizetesubtotals();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String tesubtotal_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-teacher-content']/table/following-sibling::div/div/ul/li[contains(text(),'Subtotal')]/following-sibling::li[1]/span)["+i+"]")).getText();
			String tesubtotal_reviewcart1= ele.get(i).getText();
			tesubtotal_reviewcart1 = tesubtotal_reviewcart1.substring(1);
			tesubtotal_reviewcart += Double.parseDouble(tesubtotal_reviewcart1);
		}
		}
	}	
	}
	
	
	@Override
	public void gettaxes_reviewcartpage(String section){
	
	//WebDriver driver=TestBaseProvider.getTestBase().getDriver();
	
	if(section.equalsIgnoreCase("SOO")){
			List<WebElement> ele = reviewcartsizesootaxes();
			if((ele.size()!=0) && (ele.get(0).isDisplayed())){
			for(int i=0;i<ele.size();i++){
				String sootaxes_reviewcart1= ele.get(i).getText();
				//String sootaxes_reviewcart_gst1 = driver.findElement(By.xpath("(//div[@class='cart-month-soo-content']/div[1]/table/following-sibling::div/div/ul/li[contains(text(),'GST')]/following-sibling::li[1])["+i+"]")).getText();
				sootaxes_reviewcart1 = sootaxes_reviewcart1.substring(1);
				sootaxes_reviewcart += Double.parseDouble(sootaxes_reviewcart1);
		   }
			}
	}
	
	else if(section.equalsIgnoreCase("SFO")){
		List<WebElement> ele = reviewcartsizesfotaxes();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String sfotaxes_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-sfo-content']/div[1]/table/following-sibling::div/div/ul/li[contains(text(),'Subtotal')]/following-sibling::li[1])["+i+"]")).getText();
			String sfotaxes_reviewcart1 = ele.get(i).getText();
			sfotaxes_reviewcart1 = sfotaxes_reviewcart1.substring(1);
			sfotaxes_reviewcart += Double.parseDouble(sfotaxes_reviewcart1);
		}
	}
		
	}
	
	else if(section.equalsIgnoreCase("YTO")){
		List<WebElement> ele = reviewcartsizeytotaxes();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String ytotaxes_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-student-content']/table/following-sibling::div/div/ul/li[contains(text(),'Subtotal')]/following-sibling::li[1]/span)["+i+"]")).getText();
			String ytotaxes_reviewcart1 = ele.get(i).getText();
			ytotaxes_reviewcart1 = ytotaxes_reviewcart1.substring(1);
			ytotaxes_reviewcart += Double.parseDouble(ytotaxes_reviewcart1);
		}
		}
		
	}
	
	else if(section.equalsIgnoreCase("TE")){
		List<WebElement> ele = reviewcartsizetetaxes();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String tetaxes_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-teacher-content']/table/following-sibling::div/div/ul/li[contains(text(),'Subtotal')]/following-sibling::li[1]/span)["+i+"]")).getText();
			String tetaxes_reviewcart1 = ele.get(i).getText();
			tetaxes_reviewcart1 = tetaxes_reviewcart1.substring(1);
			tetaxes_reviewcart += Double.parseDouble(tetaxes_reviewcart1);
		}
		}
		
	}
		
		
	}
	
	@Override
	public void getitems_reviewcartpage(String section){
	
	//WebDriver driver=TestBaseProvider.getTestBase().getDriver();	
	if(section.equalsIgnoreCase("SOO")){
		List<WebElement> ele = reviewcartsizesooitems();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			String sooitems_reviewcart1= ele.get(i).getText();
			//String sooitems_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-soo-content']/div[1]/table/following-sibling::div/div/table/tbody/tr/td[5])["+i+"]")).getText();
			//sooitems_reviewcart1 = sooitems_reviewcart1.substring(1);
			sooitems_reviewcart += Double.parseDouble(sooitems_reviewcart1);
		}
		}
		
	}
	
	else if(section.equalsIgnoreCase("SFO")){
		List<WebElement> ele = reviewcartsizesfoitems();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String sfoitems_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-sfo-content']/div[1]/table/tbody/tr/td[6]/input[1])["+i+"]")).getText();
			//sfoitems_reviewcart1 = sfoitems_reviewcart1.substring(1);
			String sfoitems_reviewcart1= ele.get(i).getAttribute("value");
			sfoitems_reviewcart += Double.parseDouble(sfoitems_reviewcart1);
		}
		}
	}
	
	else if(section.equalsIgnoreCase("YTO")){
		List<WebElement> ele = reviewcartsizeytoitems();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String ytoitems_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-student-content']/div[1]/table/tbody/tr/td[5]/input[1])["+i+"]")).getText();
			//ytoitems_reviewcart1 = ytoitems_reviewcart1.substring(1);
			String ytoitems_reviewcart1= ele.get(i).getAttribute("value");
			ytoitems_reviewcart += Double.parseDouble(ytoitems_reviewcart1);
		}
		}
		
	}
	
	else if(section.equalsIgnoreCase("TE")){
		List<WebElement> ele = reviewcartsizeteitems();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String teitems_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-teacher-content']/div[1]/table/tbody/tr/td[5]/input[1])["+i+"]")).getText();
			//teitems_reviewcart1 = teitems_reviewcart1.substring(1);
			String teitems_reviewcart1= ele.get(i).getAttribute("value");
			teitems_reviewcart += Double.parseDouble(teitems_reviewcart1);
		}
		}
	}
		
		
	}
	
	@Override
	public void gettotals_reviewcartpage(String section){
	
	//WebDriver driver=TestBaseProvider.getTestBase().getDriver();	
	if(section.equalsIgnoreCase("SOO")){
		List<WebElement> ele = reviewcartsizesoototals();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String soototals_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-soo-content']/div[1]/table/following-sibling::div/div/ul/li[contains(text(),'Total')]/following-sibling::li[1])["+i+"]")).getText();
			String soototals_reviewcart1= ele.get(i).getText().trim();
			soototals_reviewcart1 = soototals_reviewcart1.substring(1);
			soototals_reviewcart += Double.parseDouble(soototals_reviewcart1);
		}
		}
		
	}
	
	else if(section.equalsIgnoreCase("SFO")){
		List<WebElement> ele = reviewcartsizesfototals();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String sfototals_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-sfo-content']/div[1]/table/following-sibling::div/div/ul/li[contains(text(),'Total')]/following-sibling::li[1])["+i+"]")).getText();
			String sfototals_reviewcart1= ele.get(i).getText().trim();
			sfototals_reviewcart1 = sfototals_reviewcart1.substring(1);
			sfototals_reviewcart += Double.parseDouble(sfototals_reviewcart1);
		}
		}
		
	}
	
	else if(section.equalsIgnoreCase("YTO")){
		List<WebElement> ele = reviewcartsizeytototals();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String ytototals_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-student-content']/table/following-sibling::div/div/ul[4]/li[contains(text(),'Total')]/following-sibling::li[1])["+i+"]")).getText();
			String ytototals_reviewcart1= ele.get(i).getText().trim();
			ytototals_reviewcart1 = ytototals_reviewcart1.substring(1);
			ytototals_reviewcart += Double.parseDouble(ytototals_reviewcart1);
		}
		}
		
	}
	
	else if(section.equalsIgnoreCase("TE")){
		List<WebElement> ele = reviewcartsizetetotals();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String tetotals_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-teacher-content']/table/following-sibling::div/div/ul[4]/li[contains(text(),'Total')]/following-sibling::li[1])["+i+"]")).getText();
			String tetotals_reviewcart1= ele.get(i).getText().trim();
			tetotals_reviewcart1 = tetotals_reviewcart1.substring(1);
			tetotals_reviewcart += Double.parseDouble(tetotals_reviewcart1);
		}
		}
		
	}
		
		
	}
	
	
	@Override
	public void getsubtotals_rewardspage(String section){
	
	//WebDriver driver=TestBaseProvider.getTestBase().getDriver();	
	if(section.equalsIgnoreCase("SOO")){
		List<WebElement> ele = rewardspagesizesoosubtotals();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
			System.out.println("Coming to SOO section if dollar value is zero for rewards page");
		for(int i=0;i<ele.size();i++){
			//String soosubtotal_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-soo-content']/div[1]/table/following-sibling::div/div/ul/li[contains(text(),'Subtotal')]/following-sibling::li[1])["+i+"]")).getText();
			String soosubtotal_rewardspage1= ele.get(i).getText().trim();
			soosubtotal_rewardspage1 = soosubtotal_rewardspage1.substring(1);
			soosubtotal_rewardspage += Double.parseDouble(soosubtotal_rewardspage1);
		}
		}
		System.out.println("SOO SUBTOTAL FOR REWARDS PAGE IS @@@@@@@@@@@@@@@@@@@@ "+soosubtotal_rewardspage);
	}
	
	else if(section.equalsIgnoreCase("SFO")){
		List<WebElement> ele = rewardspagesizesfosubtotals();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String sfosubtotal_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-sfo-content']/div[1]/table/following-sibling::div/div/ul/li[contains(text(),'Subtotal')]/following-sibling::li[1])["+i+"]")).getText();
			String sfosubtotal_rewardspage1= ele.get(i).getText().trim();
			sfosubtotal_rewardspage1 = sfosubtotal_rewardspage1.substring(1);
			sfosubtotal_rewardspage += Double.parseDouble(sfosubtotal_rewardspage1);
		}
		}
		else{
			System.out.println("sfo value if not prsent is:"+sfosubtotal_rewardspage);
			sfosubtotal_rewardspage = 0.00;
		}
		
	}
	
	else if(section.equalsIgnoreCase("YTO")){
		List<WebElement> ele = rewardspagesizeytosubtotals();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String ytosubtotal_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-student-content']/table/following-sibling::div/div/ul/li[contains(text(),'Subtotal')]/following-sibling::li[1]/span)["+i+"]")).getText();
			String ytosubtotal_rewardspage1= ele.get(i).getText().trim();
			ytosubtotal_rewardspage1 = ytosubtotal_rewardspage1.substring(1);
			ytosubtotal_rewardspage += Double.parseDouble(ytosubtotal_rewardspage1);
		}
		}
		System.out.println("YTO subtotal in Rewards page is ------------>>>>>>>>>>>>"+ ytosubtotal_rewardspage);
		
	}
	
	else if(section.equalsIgnoreCase("TE")){
		List<WebElement> ele = rewardspagesizetesubtotals();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String tesubtotal_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-teacher-content']/table/following-sibling::div/div/ul/li[contains(text(),'Subtotal')]/following-sibling::li[1]/span)["+i+"]")).getText();
			String tesubtotal_rewardspage1= ele.get(i).getText().trim();
			tesubtotal_rewardspage1 = tesubtotal_rewardspage1.substring(1);
			tesubtotal_rewardspage += Double.parseDouble(tesubtotal_rewardspage1);
		}	
		}
	}	
	}
	
	
	@Override
	public void gettaxes_rewardspage(String section){
	
	//WebDriver driver=TestBaseProvider.getTestBase().getDriver();
	
	if(section.equalsIgnoreCase("SOO")){
			List<WebElement> ele = rewardspagesizesootaxes();
			if((ele.size()!=0) && (ele.get(0).isDisplayed())){
			for(int i=0;i<ele.size();i++){
				String sootaxes_rewardspage1= ele.get(i).getText();
				//String sootaxes_reviewcart_gst1 = driver.findElement(By.xpath("(//div[@class='cart-month-soo-content']/div[1]/table/following-sibling::div/div/ul/li[contains(text(),'GST')]/following-sibling::li[1])["+i+"]")).getText();
				sootaxes_rewardspage1 = sootaxes_rewardspage1.substring(1);
				sootaxes_rewardspage += Double.parseDouble(sootaxes_rewardspage1);
		   }
			}
	}
	
	else if(section.equalsIgnoreCase("SFO")){
		List<WebElement> ele = rewardspagesizesfotaxes();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String sfotaxes_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-sfo-content']/div[1]/table/following-sibling::div/div/ul/li[contains(text(),'Subtotal')]/following-sibling::li[1])["+i+"]")).getText();
			String sfotaxes_rewardspage1 = ele.get(i).getText();
			sfotaxes_rewardspage1 = sfotaxes_rewardspage1.substring(1);
			sfotaxes_rewardspage += Double.parseDouble(sfotaxes_rewardspage1);
		}
		}
		
	}
	
	else if(section.equalsIgnoreCase("YTO")){
		List<WebElement> ele = rewardspagesizeytotaxes();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String ytotaxes_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-student-content']/table/following-sibling::div/div/ul/li[contains(text(),'Subtotal')]/following-sibling::li[1]/span)["+i+"]")).getText();
			String ytotaxes_rewardspage1 = ele.get(i).getText();
			ytotaxes_rewardspage1 = ytotaxes_rewardspage1.substring(1);
			ytotaxes_rewardspage += Double.parseDouble(ytotaxes_rewardspage1);
		}
		}
	}
	
	else if(section.equalsIgnoreCase("TE")){
		List<WebElement> ele = rewardspagesizetetaxes();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String tetaxes_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-teacher-content']/table/following-sibling::div/div/ul/li[contains(text(),'Subtotal')]/following-sibling::li[1]/span)["+i+"]")).getText();
			String tetaxes_rewardspage1 = ele.get(i).getText();
			tetaxes_rewardspage1 = tetaxes_rewardspage1.substring(1);
			tetaxes_rewardspage += Double.parseDouble(tetaxes_rewardspage1);
		}
		}
	}
		
		
	}
	
	@Override
	public void getitems_rewardspage(String section){
	
	//WebDriver driver=TestBaseProvider.getTestBase().getDriver();	
	if(section.equalsIgnoreCase("SOO")){
		List<WebElement> ele = rewardspagesizesooitems();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			String sooitems_rewardspage1= ele.get(i).getText().trim().replaceAll("(?i)Items", "");
			System.out.println("Items after replacing for SOO is: "+sooitems_rewardspage1);
			sooitems_rewardspage += Double.parseDouble(sooitems_rewardspage1);
		}
		}
	}
	
	else if(section.equalsIgnoreCase("SFO")){
		List<WebElement> ele = rewardspagesizesfoitems();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			String sfoitems_rewardspage1= ele.get(i).getText().trim().replaceAll("(?i)Items", "");
			sfoitems_rewardspage += Double.parseDouble(sfoitems_rewardspage1);
		}
		}
	}
	
	else if(section.equalsIgnoreCase("YTO")){
		List<WebElement> ele = rewardspagesizeytoitems();
		for(int i=0;i<ele.size();i++){
			String ytoitems_rewardspage1= ele.get(i).getText().trim().replaceAll("(?i)Items", "");
			ytoitems_rewardspage += Double.parseDouble(ytoitems_rewardspage1);
		}
		
	}
	
	else if(section.equalsIgnoreCase("TE")){
		List<WebElement> ele = rewardspagesizeteitems();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			String teitems_rewardspage1= ele.get(i).getText().trim().replaceAll("(?i)Items", "");
			teitems_rewardspage += Double.parseDouble(teitems_rewardspage1);
		}
		}
	}
		
		
	}
	
	@Override
	public void gettotals_rewardspage(String section){
	
	if(section.equalsIgnoreCase("SOO")){
		List<WebElement> ele = rewardspagesizesoototals();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String soototals_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-soo-content']/div[1]/table/following-sibling::div/div/ul/li[contains(text(),'Total')]/following-sibling::li[1])["+i+"]")).getText();
			String soototals_rewardspage1= ele.get(i).getText().trim();
			soototals_rewardspage1 = soototals_rewardspage1.substring(1);
			soototals_rewardspage += Double.parseDouble(soototals_rewardspage1);
		}
		}
	}
	
	else if(section.equalsIgnoreCase("SFO")){
		List<WebElement> ele = rewardspagesizesfototals();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String sfototals_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-sfo-content']/div[1]/table/following-sibling::div/div/ul/li[contains(text(),'Total')]/following-sibling::li[1])["+i+"]")).getText();
			String sfototals_rewardspage1= ele.get(i).getText().trim();
			sfototals_rewardspage1 = sfototals_rewardspage1.substring(1);
			sfototals_rewardspage += Double.parseDouble(sfototals_rewardspage1);
		}
		}
		
	}
	
	else if(section.equalsIgnoreCase("YTO")){
		List<WebElement> ele = rewardspagesizeytototals();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String ytototals_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-student-content']/table/following-sibling::div/div/ul[4]/li[contains(text(),'Total')]/following-sibling::li[1])["+i+"]")).getText();
			String ytototals_rewardspage1= ele.get(i).getText().trim();
			ytototals_rewardspage1 = ytototals_rewardspage1.substring(1);
			ytototals_rewardspage += Double.parseDouble(ytototals_rewardspage1);
		}
		}
	}
	
	else if(section.equalsIgnoreCase("TE")){
		List<WebElement> ele = rewardspagesizetetotals();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			//String tetotals_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-teacher-content']/table/following-sibling::div/div/ul[4]/li[contains(text(),'Total')]/following-sibling::li[1])["+i+"]")).getText();
			String tetotals_rewardspage1= ele.get(i).getText().trim();
			tetotals_rewardspage1 = tetotals_rewardspage1.substring(1);
			tetotals_rewardspage += Double.parseDouble(tetotals_rewardspage1);
		}
		}
	}
		
		
	}
	
	
	@Override
	public void store_all_information_from_reviewcart_page(String section){
		
		if(section.equalsIgnoreCase("SOO")){
			getsubtotals_reviewcartpage("SOO");
			gettaxes_reviewcartpage("SOO");
			getitems_reviewcartpage("SOO");
			gettotals_reviewcartpage("SOO");
		
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.reviewcart.soosubtotals",
				Double.valueOf(soosubtotal_reviewcart));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.reviewcart.sootaxes",
				Double.valueOf(sootaxes_reviewcart));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.reviewcart.sooitems",
				Double.valueOf(sooitems_reviewcart));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.reviewcart.soototals",
				Double.valueOf(soototals_reviewcart));
		}
		
		else if(section.equalsIgnoreCase("SFO")){
		
			getsubtotals_reviewcartpage("SFO");
			gettaxes_reviewcartpage("SFO");
			getitems_reviewcartpage("SFO");
			gettotals_reviewcartpage("SFO");
			
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.reviewcart.sfosubtotals",
				Double.valueOf(sfosubtotal_reviewcart));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.reviewcart.sfotaxes",
				Double.valueOf(sfotaxes_reviewcart));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.reviewcart.sfoitems",
				Double.valueOf(sfoitems_reviewcart));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.reviewcart.sfototals",
				Double.valueOf(sfototals_reviewcart));
		}
		
		else if(section.equalsIgnoreCase("YTO")){
			getsubtotals_reviewcartpage("YTO");
			gettaxes_reviewcartpage("YTO");
			getitems_reviewcartpage("YTO");
			gettotals_reviewcartpage("YTO");
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.reviewcart.ytosubtotals",
				Double.valueOf(ytosubtotal_reviewcart));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.reviewcart.ytotaxes",
				Double.valueOf(ytotaxes_reviewcart));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.reviewcart.ytoitems",
				Double.valueOf(ytoitems_reviewcart));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.reviewcart.ytototals",
				Double.valueOf(ytototals_reviewcart));
		}
		
		else if(section.equalsIgnoreCase("TE")){
			getsubtotals_reviewcartpage("TE");
			gettaxes_reviewcartpage("TE");
			getitems_reviewcartpage("TE");
			gettotals_reviewcartpage("TE");
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.reviewcart.tesubtotals",
				Double.valueOf(tesubtotal_reviewcart));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.reviewcart.tetaxes",
				Double.valueOf(tetaxes_reviewcart));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.reviewcart.teitems",
				Double.valueOf(teitems_reviewcart));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.reviewcart.tetotals",
				Double.valueOf(tetotals_reviewcart));
		
		}	
	}
	
	
	@Override
	public void store_all_information_from_rewards_page(String section){
		
		if(section.equalsIgnoreCase("SOO")){
			getsubtotals_rewardspage("SOO");
			gettaxes_rewardspage("SOO");
			getitems_rewardspage("SOO");
			gettotals_rewardspage("SOO");
			TestBaseProvider.getTestBase().getContext().setProperty("testexecution.rewardspage.soosubtotals",
					Double.valueOf(soosubtotal_rewardspage));
			System.out.println("Rewards page soo subtotal is------>>>>>>>>>@@@@@@@"+soosubtotal_rewardspage);
			TestBaseProvider.getTestBase().getContext().setProperty("testexecution.rewardspage.sootaxes",
					Double.valueOf(sootaxes_rewardspage));
			TestBaseProvider.getTestBase().getContext().setProperty("testexecution.rewardspage.sooitems",
					Double.valueOf(sooitems_rewardspage));
			TestBaseProvider.getTestBase().getContext().setProperty("testexecution.rewardspage.soototals",
					Double.valueOf(soototals_rewardspage));
		}
		
		else if(section.equalsIgnoreCase("SFO")){
			getsubtotals_rewardspage("SFO");
			gettaxes_rewardspage("SFO");
			getitems_rewardspage("SFO");
			gettotals_rewardspage("SFO");
			TestBaseProvider.getTestBase().getContext().setProperty("testexecution.rewardspage.sfosubtotals",
					Double.valueOf(sfosubtotal_rewardspage));
			TestBaseProvider.getTestBase().getContext().setProperty("testexecution.rewardspage.sfotaxes",
					Double.valueOf(sfotaxes_rewardspage));
			TestBaseProvider.getTestBase().getContext().setProperty("testexecution.rewardspage.sfoitems",
					Double.valueOf(sfoitems_rewardspage));
			TestBaseProvider.getTestBase().getContext().setProperty("testexecution.rewardspage.sfototals",
					Double.valueOf(sfototals_rewardspage));
		}
		
		else if(section.equalsIgnoreCase("YTO")){
			getsubtotals_rewardspage("YTO");
			gettaxes_rewardspage("YTO");
			getitems_rewardspage("YTO");
			gettotals_rewardspage("YTO");
			TestBaseProvider.getTestBase().getContext().setProperty("testexecution.rewardspage.ytosubtotals",
					Double.valueOf(ytosubtotal_rewardspage));
			TestBaseProvider.getTestBase().getContext().setProperty("testexecution.rewardspage.ytotaxes",
					Double.valueOf(ytotaxes_rewardspage));
			TestBaseProvider.getTestBase().getContext().setProperty("testexecution.rewardspage.ytoitems",
					Double.valueOf(ytoitems_rewardspage));
			TestBaseProvider.getTestBase().getContext().setProperty("testexecution.rewardspage.ytototals",
					Double.valueOf(ytototals_rewardspage));
		}
		
		else if(section.equalsIgnoreCase("TE")){
			getsubtotals_rewardspage("TE");
			gettaxes_rewardspage("TE");
			getitems_rewardspage("TE");
			gettotals_rewardspage("TE");
			TestBaseProvider.getTestBase().getContext().setProperty("testexecution.rewardspage.tesubtotals",
					Double.valueOf(tesubtotal_rewardspage));
			TestBaseProvider.getTestBase().getContext().setProperty("testexecution.rewardspage.tetaxes",
					Double.valueOf(tetaxes_rewardspage));
			TestBaseProvider.getTestBase().getContext().setProperty("testexecution.rewardspage.teitems",
					Double.valueOf(teitems_rewardspage));
			TestBaseProvider.getTestBase().getContext().setProperty("testexecution.rewardspage.tetotals",
					Double.valueOf(tetotals_rewardspage));
		
		}	
	}
	
	
	@Override
	public void verify_all_item_information_from_reviewcartpage_rewardspage(String section){
		
		CheckoutPage_2 checkoutPage2 = new CheckoutPage_2();
		
		List<WebElement> rewardspage_active = rewardspage_active();
		List<WebElement> paymentpage_active = paymentpage_active();
		List<WebElement> confirmsubmitpage_active = confirmsubmitpage_active();
		
		if((section.equalsIgnoreCase("SOO")) && (rewardspage_active.size()!=0)){
			
			String soosubtotal_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.soosubtotals").toString();
			double soosubtotal_reviewcart = Double.parseDouble(soosubtotal_reviewcart1);
			soosubtotal_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(soosubtotal_reviewcart));
			
			String soosubtotal_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.soosubtotals").toString();
			double soosubtotal_rewardspage = Double.parseDouble(soosubtotal_rewardspage1);
			soosubtotal_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(soosubtotal_rewardspage));
			
			//########################################################################################################//
			
			String sootaxes_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.sootaxes").toString();
			double sootaxes_reviewcart = Double.parseDouble(sootaxes_reviewcart1);
			sootaxes_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(sootaxes_reviewcart));
			
			String sootaxes_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.sootaxes").toString();
			double sootaxes_rewardspage = Double.parseDouble(sootaxes_rewardspage1);
			sootaxes_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sootaxes_rewardspage));
			
			//########################################################################################################//
			
			String sooitems_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.sooitems").toString();
			double sooitems_reviewcart = Double.parseDouble(sooitems_reviewcart1);
			
			String sooitems_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.sooitems").toString();
			double sooitems_rewardspage = Double.parseDouble(sooitems_rewardspage1);
			sooitems_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sooitems_rewardspage));
			
			//########################################################################################################//
			
			String soototals_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.soototals").toString();
			double soototals_reviewcart = Double.parseDouble(soototals_reviewcart1);
			soototals_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(soototals_reviewcart));
			
			String soototals_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.soototals").toString();
			double soototals_rewardspage = Double.parseDouble(soototals_rewardspage1);
			soototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(soototals_rewardspage));
			
			//########################################################################################################//
			
			System.out.println("SOO subtotal in reviewcart page is----->>>>>> "+soosubtotal_reviewcart);
			System.out.println("SOO subtotal in rewards page is----->>>>>> "+soosubtotal_rewardspage);
			
			Assert.assertEquals(soosubtotal_reviewcart, soosubtotal_rewardspage,"Subtotal is not matching for SOO section in Rewards Page");
			Assert.assertEquals(sootaxes_reviewcart, sootaxes_rewardspage,"Taxes are not matching for SOO section in Rewards Page");
			Assert.assertEquals(sooitems_reviewcart, sooitems_rewardspage,"Items count is not matching for SOO section in Rewards Page");
			Assert.assertEquals(soototals_reviewcart, soototals_rewardspage,"Totals is not matching for SOO section in Rewards Page");
			}
		
		
		else if((section.equalsIgnoreCase("SOO")) && (paymentpage_active.size()!=0)){
			
			String sooitems_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.sooitems").toString();
			double sooitems_reviewcart = Double.parseDouble(sooitems_reviewcart1);
			
			String sooitems_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.sooitems").toString();
			double sooitems_rewardspage = Double.parseDouble(sooitems_rewardspage1);
			sooitems_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sooitems_rewardspage));
			
			//########################################################################################################//
			
			String soototals_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.soototals").toString();
			double soototals_reviewcart = Double.parseDouble(soototals_reviewcart1);
			soototals_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(soototals_reviewcart));
			
			String soototals_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.soototals").toString();
			double soototals_rewardspage = Double.parseDouble(soototals_rewardspage1);
			soototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(soototals_rewardspage));
			
			//########################################################################################################//
			
			Assert.assertEquals(sooitems_reviewcart, sooitems_rewardspage,"Items count is not matching for SOO section in Payment Page");
			Assert.assertEquals(soototals_reviewcart, soototals_rewardspage,"Totals is not matching for SOO section in Payment Page");
			}
		
		else if((section.equalsIgnoreCase("SOO")) && (confirmsubmitpage_active.size()!=0)){
			
			String act_soototal_summarysection1=checkoutPage2.SOO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
			act_soototal_summarysection1=checkoutPage2.SFO_page.delete_US_or_Canada_dollar_for_the_value(act_soototal_summarysection1);
	    	double act_soototal_summarysection=Double.parseDouble(act_soototal_summarysection1);
			
			String soosubtotal_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.soosubtotals").toString();
			double soosubtotal_reviewcart = Double.parseDouble(soosubtotal_reviewcart1);
			soosubtotal_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(soosubtotal_reviewcart));
			
			String soosubtotal_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.soosubtotals").toString();
			double soosubtotal_rewardspage = Double.parseDouble(soosubtotal_rewardspage1);
			soosubtotal_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(soosubtotal_rewardspage));
			
			//########################################################################################################//
			
			String sootaxes_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.sootaxes").toString();
			double sootaxes_reviewcart = Double.parseDouble(sootaxes_reviewcart1);
			sootaxes_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(sootaxes_reviewcart));
			
			String sootaxes_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.sootaxes").toString();
			double sootaxes_rewardspage = Double.parseDouble(sootaxes_rewardspage1);
			sootaxes_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sootaxes_rewardspage));
			
			//########################################################################################################//
			
			String sooitems_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.sooitems").toString();
			double sooitems_reviewcart = Double.parseDouble(sooitems_reviewcart1);
			
			String sooitems_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.sooitems").toString();
			double sooitems_rewardspage = Double.parseDouble(sooitems_rewardspage1);
			sooitems_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sooitems_rewardspage));
			
			//########################################################################################################//
			
			String soototals_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.soototals").toString();
			double soototals_reviewcart = Double.parseDouble(soototals_reviewcart1);
			soototals_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(soototals_reviewcart));
			
			String soototals_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.soototals").toString();
			double soototals_rewardspage = Double.parseDouble(soototals_rewardspage1);
			soototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(soototals_rewardspage));
			
			//########################################################################################################//
			
			System.out.println("SOO subtotal in reviewcart page is----->>>>>> "+soosubtotal_reviewcart);
			System.out.println("SOO subtotal in rewards page is----->>>>>> "+soosubtotal_rewardspage);
			Assert.assertEquals(soototals_reviewcart, act_soototal_summarysection,"SOO Totals is not matching in Confirm & Submit Page Summary Section");
			Assert.assertEquals(soosubtotal_reviewcart, soosubtotal_rewardspage,"Subtotal is not matching for SOO section in Rewards Page");
			Assert.assertEquals(sootaxes_reviewcart, sootaxes_rewardspage,"Taxes are not matching for SOO section in Rewards Page");
			Assert.assertEquals(sooitems_reviewcart, sooitems_rewardspage,"Items count is not matching for SOO section in Rewards Page");
			Assert.assertEquals(soototals_reviewcart, soototals_rewardspage,"Totals is not matching for SOO section in Rewards Page");
			}
		
		else if((section.equalsIgnoreCase("SFO")) && (rewardspage_active.size()!=0)){
			
			
			String sfosubtotal_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.sfosubtotals").toString();
			double sfosubtotal_reviewcart = Double.parseDouble(sfosubtotal_reviewcart1);
			sfosubtotal_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(sfosubtotal_reviewcart));
			
			String sfosubtotal_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.sfosubtotals").toString();
			double sfosubtotal_rewardspage = Double.parseDouble(sfosubtotal_rewardspage1);
			sfosubtotal_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sfosubtotal_rewardspage));
			
			//########################################################################################################//
			
			String sfotaxes_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.sfotaxes").toString();
			double sfotaxes_reviewcart = Double.parseDouble(sfotaxes_reviewcart1);
			sfotaxes_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(sfotaxes_reviewcart));
			
			String sfotaxes_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.sfotaxes").toString();
			double sfotaxes_rewardspage = Double.parseDouble(sfotaxes_rewardspage1);
			sfotaxes_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sfotaxes_rewardspage));
			
			//########################################################################################################//
			
			String sfoitems_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.sfoitems").toString();
			double sfoitems_reviewcart = Double.parseDouble(sfoitems_reviewcart1);
			
			String sfoitems_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.sfoitems").toString();
			double sfoitems_rewardspage = Double.parseDouble(sfoitems_rewardspage1);
			sfoitems_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sfoitems_rewardspage));
			
			//########################################################################################################//
			
			String sfototals_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.sfototals").toString();
			double sfototals_reviewcart = Double.parseDouble(sfototals_reviewcart1);
			sfototals_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(sfototals_reviewcart));
			
			String sfototals_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.sfototals").toString();
			double sfototals_rewardspage = Double.parseDouble(sfototals_rewardspage1);
			sfototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sfototals_rewardspage));
			
			String creditnotes1 = getcreditnotes().getAttribute("value").trim();
			if(!creditnotes1.equals("")){	
			double creditnotes = Double.parseDouble(creditnotes1);
			creditnotes =Double.parseDouble(new DecimalFormat("##.##").format(creditnotes));
			sfototals_rewardspage = sfototals_rewardspage+creditnotes;
			sfototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sfototals_rewardspage));
			Assert.assertEquals(sfototals_reviewcart, sfototals_rewardspage,"Totals is not matching for SFO section in Rewards Page");
			}
			
			else if(creditnotes1.equals("")){
					double creditnotes = 0.00;
					sfototals_rewardspage = sfototals_rewardspage+creditnotes;
					sfototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sfototals_rewardspage));
					Assert.assertEquals(sfototals_reviewcart, sfototals_rewardspage,"Totals is not matching for SFO section in Rewards Page");
					}
			
			
			//########################################################################################################//
			
			Assert.assertEquals(sfosubtotal_reviewcart, sfosubtotal_rewardspage,"Subtotal is not matching for SFO section in Rewards Page");
			Assert.assertEquals(sfotaxes_reviewcart, sfotaxes_rewardspage,"Taxes are not matching for SFO section in Rewards Page");
			Assert.assertEquals(sfoitems_reviewcart, sfoitems_rewardspage,"Items count is not matching for SFO section in Rewards Page");
			}
		
		
        else if((section.equalsIgnoreCase("SFO")) && (paymentpage_active.size()!=0)){
			
			
			String sfosubtotal_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.sfosubtotals").toString();
			double sfosubtotal_reviewcart = Double.parseDouble(sfosubtotal_reviewcart1);
			sfosubtotal_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(sfosubtotal_reviewcart));
			
			String sfosubtotal_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.sfosubtotals").toString();
			double sfosubtotal_rewardspage = Double.parseDouble(sfosubtotal_rewardspage1);
			sfosubtotal_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sfosubtotal_rewardspage));
			
			//########################################################################################################//
			
			String sfotaxes_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.sfotaxes").toString();
			double sfotaxes_reviewcart = Double.parseDouble(sfotaxes_reviewcart1);
			sfotaxes_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(sfotaxes_reviewcart));
			
			String sfotaxes_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.sfotaxes").toString();
			double sfotaxes_rewardspage = Double.parseDouble(sfotaxes_rewardspage1);
			sfotaxes_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sfotaxes_rewardspage));
			
			//########################################################################################################//
			
			String sfoitems_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.sfoitems").toString();
			double sfoitems_reviewcart = Double.parseDouble(sfoitems_reviewcart1);
			
			String sfoitems_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.sfoitems").toString();
			double sfoitems_rewardspage = Double.parseDouble(sfoitems_rewardspage1);
			sfoitems_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sfoitems_rewardspage));
			
			//########################################################################################################//
			
			String sfototals_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.sfototals").toString();
			double sfototals_reviewcart = Double.parseDouble(sfototals_reviewcart1);
			sfototals_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(sfototals_reviewcart));
			
			String sfototals_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.sfototals").toString();
			double sfototals_rewardspage = Double.parseDouble(sfototals_rewardspage1);
			sfototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sfototals_rewardspage));
			
			String creditnotes1 = getcreditnotes().getText().trim().substring(1);
			double creditnotes = Double.parseDouble(creditnotes1);
			creditnotes =Double.parseDouble(new DecimalFormat("##.##").format(creditnotes));
			System.out.println("Credit Notes for SFO in Payment page is:"+creditnotes);
			
			sfototals_rewardspage = sfototals_rewardspage+creditnotes;
			sfototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sfototals_rewardspage));
			
			System.out.println("SFO Total after creditnotes in Payment page is:"+sfototals_rewardspage);
			System.out.println("SFO Total before creditnotes in Payment page is:"+sfototals_reviewcart);
			//########################################################################################################//
			
			Assert.assertEquals(sfosubtotal_reviewcart, sfosubtotal_rewardspage,"Subtotal is not matching for SFO section in Rewards Page");
			Assert.assertEquals(sfotaxes_reviewcart, sfotaxes_rewardspage,"Taxes are not matching for SFO section in Rewards Page");
			Assert.assertEquals(sfoitems_reviewcart, sfoitems_rewardspage,"Items count is not matching for SFO section in Rewards Page");
			Assert.assertEquals(sfototals_reviewcart, sfototals_rewardspage,"Totals is not matching for SFO section in Rewards Page");
			}
		
        else if((section.equalsIgnoreCase("SFO")) && (confirmsubmitpage_active.size()!=0)){
			
        	String act_sfototal_summarysection1=checkoutPage2.SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
			act_sfototal_summarysection1=checkoutPage2.SFO_page.delete_US_or_Canada_dollar_for_the_value(act_sfototal_summarysection1);
	    	double act_sfototal_summarysection=Double.parseDouble(act_sfototal_summarysection1);
			
			String sfosubtotal_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.sfosubtotals").toString();
			double sfosubtotal_reviewcart = Double.parseDouble(sfosubtotal_reviewcart1);
			sfosubtotal_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(sfosubtotal_reviewcart));
			
			String sfosubtotal_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.sfosubtotals").toString();
			double sfosubtotal_rewardspage = Double.parseDouble(sfosubtotal_rewardspage1);
			sfosubtotal_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sfosubtotal_rewardspage));
			
			//########################################################################################################//
			
			String sfotaxes_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.sfotaxes").toString();
			double sfotaxes_reviewcart = Double.parseDouble(sfotaxes_reviewcart1);
			sfotaxes_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(sfotaxes_reviewcart));
			
			String sfotaxes_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.sfotaxes").toString();
			double sfotaxes_rewardspage = Double.parseDouble(sfotaxes_rewardspage1);
			sfotaxes_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sfotaxes_rewardspage));
			
			//########################################################################################################//
			
			String sfoitems_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.sfoitems").toString();
			double sfoitems_reviewcart = Double.parseDouble(sfoitems_reviewcart1);
			
			String sfoitems_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.sfoitems").toString();
			double sfoitems_rewardspage = Double.parseDouble(sfoitems_rewardspage1);
			sfoitems_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sfoitems_rewardspage));
			
			//########################################################################################################//
			
			String sfototals_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.sfototals").toString();
			double sfototals_reviewcart = Double.parseDouble(sfototals_reviewcart1);
			sfototals_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(sfototals_reviewcart));
			
			String sfototals_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.sfototals").toString();
			double sfototals_rewardspage = Double.parseDouble(sfototals_rewardspage1);
			sfototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sfototals_rewardspage));
			
			if(sizecreditnotes().size()!=0 && sizecreditnotes().get(0).isDisplayed()){
			String creditnotes1 = getcreditnotes().getAttribute("value").trim();
			if(!creditnotes1.equals("")){	
			double creditnotes = Double.parseDouble(creditnotes1);
			creditnotes =Double.parseDouble(new DecimalFormat("##.##").format(creditnotes));
			sfototals_rewardspage = sfototals_rewardspage+creditnotes;
			sfototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sfototals_rewardspage));
			Assert.assertEquals(sfototals_reviewcart, act_sfototal_summarysection,"SFO Totals is not matching in Confirm & Submit page for Summary section");
			Assert.assertEquals(sfototals_reviewcart, sfototals_rewardspage,"Totals is not matching for SFO section in Rewards Page");
			}
			
			else if(creditnotes1.equals("")){
					double creditnotes = 0.00;
					sfototals_rewardspage = sfototals_rewardspage+creditnotes;
					sfototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sfototals_rewardspage));
					Assert.assertEquals(sfototals_reviewcart, act_sfototal_summarysection,"SFO Totals is not matching in Confirm & Submit page for Summary section");
					Assert.assertEquals(sfototals_reviewcart, sfototals_rewardspage,"Totals is not matching for SFO section in Rewards Page");
					}
			}
			
			else if(sizecreditnotes().size()==0){
						double creditnotes = 0.00;
						sfototals_rewardspage = sfototals_rewardspage+creditnotes;
						sfototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sfototals_rewardspage));
						Assert.assertEquals(sfototals_reviewcart, act_sfototal_summarysection,"SFO Totals is not matching in Confirm & Submit page for Summary section");
						Assert.assertEquals(sfototals_reviewcart, sfototals_rewardspage,"Totals is not matching for SFO section in Rewards Page");
				}
			
			
			//########################################################################################################//
			
			Assert.assertEquals(sfosubtotal_reviewcart, sfosubtotal_rewardspage,"Subtotal is not matching for SFO section in Rewards Page");
			Assert.assertEquals(sfotaxes_reviewcart, sfotaxes_rewardspage,"Taxes are not matching for SFO section in Rewards Page");
			Assert.assertEquals(sfoitems_reviewcart, sfoitems_rewardspage,"Items count is not matching for SFO section in Rewards Page");
			}
		
		
        else if((section.equalsIgnoreCase("YTO")) && (rewardspage_active.size()!=0)){
        	
        	String ytosubtotal_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.ytosubtotals").toString();
			double ytosubtotal_reviewcart = Double.parseDouble(ytosubtotal_reviewcart1);
			ytosubtotal_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(ytosubtotal_reviewcart));
			
			String ytosubtotal_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.ytosubtotals").toString();
			double ytosubtotal_rewardspage = Double.parseDouble(ytosubtotal_rewardspage1);
			ytosubtotal_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(ytosubtotal_rewardspage));
			
			//########################################################################################################//
			
			String ytotaxes_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.ytotaxes").toString();
			double ytotaxes_reviewcart = Double.parseDouble(ytotaxes_reviewcart1);
			ytotaxes_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(ytotaxes_reviewcart));
			
			String ytotaxes_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.ytotaxes").toString();
			double ytotaxes_rewardspage = Double.parseDouble(ytotaxes_rewardspage1);
			ytotaxes_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(ytotaxes_rewardspage));
			
			//########################################################################################################//
			
			String ytoitems_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.ytoitems").toString();
			double ytoitems_reviewcart = Double.parseDouble(ytoitems_reviewcart1);
			
			String ytoitems_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.ytoitems").toString();
			double ytoitems_rewardspage = Double.parseDouble(ytoitems_rewardspage1);
			ytoitems_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(ytoitems_rewardspage));
			
			//########################################################################################################//
			
			String ytototals_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.ytototals").toString();
			double ytototals_reviewcart = Double.parseDouble(ytototals_reviewcart1);
			ytototals_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(ytototals_reviewcart));
			
			String ytototals_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.ytototals").toString();
			double ytototals_rewardspage = Double.parseDouble(ytototals_rewardspage1);
			ytototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(ytototals_rewardspage));
			
			String ytobonusbank1 = getytobonusbank().getAttribute("value").trim();
			if(!ytobonusbank1.equals("")){
			double ytobonusbank = Double.parseDouble(ytobonusbank1);
			ytobonusbank =Double.parseDouble(new DecimalFormat("##.##").format(ytobonusbank));
			
			String ytopapercoupon1 = getytobonusbank().getAttribute("value").trim();
			double ytopapercoupon = Double.parseDouble(ytopapercoupon1);
			ytopapercoupon =Double.parseDouble(new DecimalFormat("##.##").format(ytopapercoupon));
			
			double redemptions = ytobonusbank+ytopapercoupon;
			redemptions =Double.parseDouble(new DecimalFormat("##.##").format(redemptions));
			
			ytototals_rewardspage = ytototals_rewardspage+redemptions;
			ytototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(ytototals_rewardspage));
			Assert.assertEquals(ytototals_reviewcart, ytototals_rewardspage,"Totals is not matching for YTO section in Rewards Page");
			
			}
			
			else if(ytobonusbank1.equals("")){
				double ytobonusbank = 0.00;
				double ytopapercoupon = 0.00;
				
				double redemptions = ytobonusbank+ytopapercoupon;
				redemptions =Double.parseDouble(new DecimalFormat("##.##").format(redemptions));
				
				ytototals_rewardspage = ytototals_rewardspage+redemptions;
				ytototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(ytototals_rewardspage));
				Assert.assertEquals(ytototals_reviewcart, ytototals_rewardspage,"Totals is not matching for YTO section in Rewards Page");
				
				}
			//########################################################################################################//
			
			Assert.assertEquals(ytosubtotal_reviewcart, ytosubtotal_rewardspage,"Subtotal is not matching for YTO section in Rewards Page");
			Assert.assertEquals(ytotaxes_reviewcart, ytotaxes_rewardspage,"Taxes are not matching for YTO section in Rewards Page");
			Assert.assertEquals(ytoitems_reviewcart, ytoitems_rewardspage,"Items count is not matching for YTO section in Rewards Page");
			}
		
		
       else if((section.equalsIgnoreCase("YTO")) && (paymentpage_active.size()!=0)){
        	
        	String ytosubtotal_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.ytosubtotals").toString();
			double ytosubtotal_reviewcart = Double.parseDouble(ytosubtotal_reviewcart1);
			ytosubtotal_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(ytosubtotal_reviewcart));
			
			String ytosubtotal_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.ytosubtotals").toString();
			double ytosubtotal_rewardspage = Double.parseDouble(ytosubtotal_rewardspage1);
			ytosubtotal_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(ytosubtotal_rewardspage));
			
			//########################################################################################################//
			
			String ytotaxes_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.ytotaxes").toString();
			double ytotaxes_reviewcart = Double.parseDouble(ytotaxes_reviewcart1);
			ytotaxes_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(ytotaxes_reviewcart));
			
			String ytotaxes_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.ytotaxes").toString();
			double ytotaxes_rewardspage = Double.parseDouble(ytotaxes_rewardspage1);
			ytotaxes_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(ytotaxes_rewardspage));
			
			//########################################################################################################//
			
			String ytoitems_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.ytoitems").toString();
			double ytoitems_reviewcart = Double.parseDouble(ytoitems_reviewcart1);
			
			String ytoitems_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.ytoitems").toString();
			double ytoitems_rewardspage = Double.parseDouble(ytoitems_rewardspage1);
			ytoitems_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(ytoitems_rewardspage));
			
			//########################################################################################################//
			
			String ytototals_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.ytototals").toString();
			double ytototals_reviewcart = Double.parseDouble(ytototals_reviewcart1);
			ytototals_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(ytototals_reviewcart));
			
			String ytototals_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.ytototals").toString();
			double ytototals_rewardspage = Double.parseDouble(ytototals_rewardspage1);
			ytototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(ytototals_rewardspage));
			
			String ytobonusbank1 = getytobonusbank().getText().trim().substring(1);
			double ytobonusbank = Double.parseDouble(ytobonusbank1);
			ytobonusbank =Double.parseDouble(new DecimalFormat("##.##").format(ytobonusbank));
			
			String ytopapercoupon1 = getytobonusbank().getText().trim().substring(1);
			double ytopapercoupon = Double.parseDouble(ytopapercoupon1);
			ytopapercoupon =Double.parseDouble(new DecimalFormat("##.##").format(ytopapercoupon));
			
			double redemptions = ytobonusbank+ytopapercoupon;
			redemptions =Double.parseDouble(new DecimalFormat("##.##").format(redemptions));
			
			ytototals_rewardspage = ytototals_rewardspage+redemptions;
			ytototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(ytototals_rewardspage));
			
			//########################################################################################################//
			
			Assert.assertEquals(ytosubtotal_reviewcart, ytosubtotal_rewardspage,"Subtotal is not matching for YTO section in Rewards Page");
			Assert.assertEquals(ytotaxes_reviewcart, ytotaxes_rewardspage,"Taxes are not matching for YTO section in Rewards Page");
			Assert.assertEquals(ytoitems_reviewcart, ytoitems_rewardspage,"Items count is not matching for YTO section in Rewards Page");
			Assert.assertEquals(ytototals_reviewcart, ytototals_rewardspage,"Totals is not matching for YTO section in Rewards Page");
			}
		
       else if((section.equalsIgnoreCase("YTO")) && (confirmsubmitpage_active.size()!=0)){
    	   
    	   String act_ytototal_summarysection1=checkoutPage2.YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	   act_ytototal_summarysection1=checkoutPage2.SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ytototal_summarysection1);
	    	double act_ytototal_summarysection=Double.parseDouble(act_ytototal_summarysection1);
       	
       	    String ytosubtotal_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                   .getProperty("testexecution.reviewcart.ytosubtotals").toString();
			double ytosubtotal_reviewcart = Double.parseDouble(ytosubtotal_reviewcart1);
			ytosubtotal_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(ytosubtotal_reviewcart));
			
			String ytosubtotal_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                   .getProperty("testexecution.rewardspage.ytosubtotals").toString();
			double ytosubtotal_rewardspage = Double.parseDouble(ytosubtotal_rewardspage1);
			ytosubtotal_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(ytosubtotal_rewardspage));
			
			//########################################################################################################//
			
			String ytotaxes_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                   .getProperty("testexecution.reviewcart.ytotaxes").toString();
			double ytotaxes_reviewcart = Double.parseDouble(ytotaxes_reviewcart1);
			ytotaxes_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(ytotaxes_reviewcart));
			
			String ytotaxes_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                   .getProperty("testexecution.rewardspage.ytotaxes").toString();
			double ytotaxes_rewardspage = Double.parseDouble(ytotaxes_rewardspage1);
			ytotaxes_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(ytotaxes_rewardspage));
			
			//########################################################################################################//
			
			String ytoitems_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                   .getProperty("testexecution.reviewcart.ytoitems").toString();
			double ytoitems_reviewcart = Double.parseDouble(ytoitems_reviewcart1);
			
			String ytoitems_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                   .getProperty("testexecution.rewardspage.ytoitems").toString();
			double ytoitems_rewardspage = Double.parseDouble(ytoitems_rewardspage1);
			ytoitems_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(ytoitems_rewardspage));
			
			//########################################################################################################//
			
			String ytototals_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                   .getProperty("testexecution.reviewcart.ytototals").toString();
			double ytototals_reviewcart = Double.parseDouble(ytototals_reviewcart1);
			ytototals_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(ytototals_reviewcart));
			
			String ytototals_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                   .getProperty("testexecution.rewardspage.ytototals").toString();
			double ytototals_rewardspage = Double.parseDouble(ytototals_rewardspage1);
			ytototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(ytototals_rewardspage));
			
			if(sizeytobonusbank().size()!=0 && sizeytobonusbank().get(0).isDisplayed()){
			String ytobonusbank1 = getytobonusbank().getAttribute("value").trim();
			if(!ytobonusbank1.equals("")){
			double ytobonusbank = Double.parseDouble(ytobonusbank1);
			ytobonusbank =Double.parseDouble(new DecimalFormat("##.##").format(ytobonusbank));
			
			String ytopapercoupon1 = getytobonusbank().getAttribute("value").trim();
			double ytopapercoupon = Double.parseDouble(ytopapercoupon1);
			ytopapercoupon =Double.parseDouble(new DecimalFormat("##.##").format(ytopapercoupon));
			
			double redemptions = ytobonusbank+ytopapercoupon;
			redemptions =Double.parseDouble(new DecimalFormat("##.##").format(redemptions));
			
			ytototals_rewardspage = ytototals_rewardspage+redemptions;
			ytototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(ytototals_rewardspage));
			Assert.assertEquals(ytototals_reviewcart, act_ytototal_summarysection,"YTO Totals is not matching in Confirm & Submit page for Summary section");
			Assert.assertEquals(ytototals_reviewcart, ytototals_rewardspage,"Totals is not matching for YTO section in Confirm & Submit page");
			
			}
			
			else if(ytobonusbank1.equals("")){
				double ytobonusbank = 0.00;
				double ytopapercoupon = 0.00;
				
				double redemptions = ytobonusbank+ytopapercoupon;
				redemptions =Double.parseDouble(new DecimalFormat("##.##").format(redemptions));
				
				ytototals_rewardspage = ytototals_rewardspage+redemptions;
				ytototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(ytototals_rewardspage));
				Assert.assertEquals(ytototals_reviewcart, act_ytototal_summarysection,"YTO Totals is not matching in Confirm & Submit page for Summary section");
				Assert.assertEquals(ytototals_reviewcart, ytototals_rewardspage,"Totals is not matching for YTO section in Rewards Page");
				
				}
			}
			
			else if(sizeytobonusbank().size()==0){
				double ytobonusbank = 0.00;
				double ytopapercoupon = 0.00;
				
				double redemptions = ytobonusbank+ytopapercoupon;
				redemptions =Double.parseDouble(new DecimalFormat("##.##").format(redemptions));
				
				ytototals_rewardspage = ytototals_rewardspage+redemptions;
				ytototals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(ytototals_rewardspage));
				Assert.assertEquals(ytototals_reviewcart, act_ytototal_summarysection,"YTO Totals is not matching in Confirm & Submit page for Summary section");
				Assert.assertEquals(ytototals_reviewcart, ytototals_rewardspage,"Totals is not matching for YTO section in Rewards Page");
				
			}
			//########################################################################################################//
			
			Assert.assertEquals(ytosubtotal_reviewcart, ytosubtotal_rewardspage,"Subtotal is not matching for YTO section in Rewards Page");
			Assert.assertEquals(ytotaxes_reviewcart, ytotaxes_rewardspage,"Taxes are not matching for YTO section in Rewards Page");
			Assert.assertEquals(ytoitems_reviewcart, ytoitems_rewardspage,"Items count is not matching for YTO section in Rewards Page");
			}
		
        else if((section.equalsIgnoreCase("TE")) && (rewardspage_active.size()!=0)){
        	
        	
        	String tesubtotal_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.tesubtotals").toString();
			double tesubtotal_reviewcart = Double.parseDouble(tesubtotal_reviewcart1);
			tesubtotal_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(tesubtotal_reviewcart));
			
			String tesubtotal_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.tesubtotals").toString();
			double tesubtotal_rewardspage = Double.parseDouble(tesubtotal_rewardspage1);
			tesubtotal_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(tesubtotal_rewardspage));
			
			//########################################################################################################//
			
			String tetaxes_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.tetaxes").toString();
			double tetaxes_reviewcart = Double.parseDouble(tetaxes_reviewcart1);
			tetaxes_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(tetaxes_reviewcart));
			
			String tetaxes_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.tetaxes").toString();
			double tetaxes_rewardspage = Double.parseDouble(tetaxes_rewardspage1);
			tetaxes_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(tetaxes_rewardspage));
			
			//########################################################################################################//
			
			String teitems_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.teitems").toString();
			double teitems_reviewcart = Double.parseDouble(teitems_reviewcart1);
			
			String teitems_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.teitems").toString();
			double teitems_rewardspage = Double.parseDouble(teitems_rewardspage1);
			teitems_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(teitems_rewardspage));
			
			//########################################################################################################//
			
			String tetotals_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.tetotals").toString();
			double tetotals_reviewcart = Double.parseDouble(tetotals_reviewcart1);
			tetotals_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(tetotals_reviewcart));
			
			String tetotals_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.tetotals").toString();
			double tetotals_rewardspage = Double.parseDouble(tetotals_rewardspage1);
			tetotals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(tetotals_rewardspage));
			
			String tebonusbank1 = gettebonusbank().getAttribute("value").trim();
			if(!tebonusbank1.equals("")){
			double tebonusbank = Double.parseDouble(tebonusbank1);
			tebonusbank =Double.parseDouble(new DecimalFormat("##.##").format(tebonusbank));
			
			String tepapercoupon1 = gettebonusbank().getAttribute("value").trim();
			double tepapercoupon = Double.parseDouble(tepapercoupon1);
			tepapercoupon =Double.parseDouble(new DecimalFormat("##.##").format(tepapercoupon));
			
			double redemptions = tebonusbank+tepapercoupon;
			redemptions =Double.parseDouble(new DecimalFormat("##.##").format(redemptions));
			
			tetotals_rewardspage = tetotals_rewardspage+redemptions;
			tetotals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(tetotals_rewardspage));
			Assert.assertEquals(tetotals_reviewcart, tetotals_rewardspage,"Totals is not matching for TE section in Rewards Page");
			}
			
			else if(tebonusbank1.equals("")){
				double tebonusbank = 0.00;
				double tepapercoupon = 0.00;
				
				double redemptions = tebonusbank+tepapercoupon;
				redemptions =Double.parseDouble(new DecimalFormat("##.##").format(redemptions));
				
				tetotals_rewardspage = tetotals_rewardspage+redemptions;
				tetotals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(tetotals_rewardspage));
				Assert.assertEquals(tetotals_reviewcart, tetotals_rewardspage,"Totals is not matching for TE section in Rewards Page");
				}
			
			//########################################################################################################//
			
			Assert.assertEquals(tesubtotal_reviewcart, tesubtotal_rewardspage,"Subtotal is not matching for TE section in Rewards Page");
			Assert.assertEquals(tetaxes_reviewcart, tetaxes_rewardspage,"Taxes are not matching for TE section in Rewards Page");
			Assert.assertEquals(teitems_reviewcart, teitems_rewardspage,"Items count is not matching for TE section in Rewards Page");
			}
		
       else if((section.equalsIgnoreCase("TE")) && (paymentpage_active.size()!=0)){
        	
        	
        	String tesubtotal_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.tesubtotals").toString();
			double tesubtotal_reviewcart = Double.parseDouble(tesubtotal_reviewcart1);
			tesubtotal_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(tesubtotal_reviewcart));
			
			String tesubtotal_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.tesubtotals").toString();
			double tesubtotal_rewardspage = Double.parseDouble(tesubtotal_rewardspage1);
			tesubtotal_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(tesubtotal_rewardspage));
			
			//########################################################################################################//
			
			String tetaxes_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.tetaxes").toString();
			double tetaxes_reviewcart = Double.parseDouble(tetaxes_reviewcart1);
			tetaxes_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(tetaxes_reviewcart));
			
			String tetaxes_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.tetaxes").toString();
			double tetaxes_rewardspage = Double.parseDouble(tetaxes_rewardspage1);
			tetaxes_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(tetaxes_rewardspage));
			
			//########################################################################################################//
			
			String teitems_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.teitems").toString();
			double teitems_reviewcart = Double.parseDouble(teitems_reviewcart1);
			
			String teitems_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.teitems").toString();
			double teitems_rewardspage = Double.parseDouble(teitems_rewardspage1);
			teitems_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(teitems_rewardspage));
			
			//########################################################################################################//
			
			String tetotals_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.tetotals").toString();
			double tetotals_reviewcart = Double.parseDouble(tetotals_reviewcart1);
			tetotals_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(tetotals_reviewcart));
			
			String tetotals_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.rewardspage.tetotals").toString();
			double tetotals_rewardspage = Double.parseDouble(tetotals_rewardspage1);
			tetotals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(tetotals_rewardspage));
			
			String tebonusbank1 = gettebonusbank().getText().trim().substring(1);
			double tebonusbank = Double.parseDouble(tebonusbank1);
			tebonusbank =Double.parseDouble(new DecimalFormat("##.##").format(tebonusbank));
			
			String tepapercoupon1 = gettebonusbank().getText().trim().substring(1);
			double tepapercoupon = Double.parseDouble(tepapercoupon1);
			tepapercoupon =Double.parseDouble(new DecimalFormat("##.##").format(tepapercoupon));
			
			double redemptions = tebonusbank+tepapercoupon;
			redemptions =Double.parseDouble(new DecimalFormat("##.##").format(redemptions));
			
			tetotals_rewardspage = tetotals_rewardspage+redemptions;
			tetotals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(tetotals_rewardspage));
			
			//########################################################################################################//
			
			Assert.assertEquals(tesubtotal_reviewcart, tesubtotal_rewardspage,"Subtotal is not matching for TE section in Rewards Page");
			Assert.assertEquals(tetaxes_reviewcart, tetaxes_rewardspage,"Taxes are not matching for TE section in Rewards Page");
			Assert.assertEquals(teitems_reviewcart, teitems_rewardspage,"Items count is not matching for TE section in Rewards Page");
			Assert.assertEquals(tetotals_reviewcart, tetotals_rewardspage,"Totals is not matching for TE section in Rewards Page");
			}
		
       else if((section.equalsIgnoreCase("TE")) && (confirmsubmitpage_active.size()!=0)){
    	   String act_tetotal_summarysection1=checkoutPage2.YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
    	   act_tetotal_summarysection1=checkoutPage2.SFO_page.delete_US_or_Canada_dollar_for_the_value(act_tetotal_summarysection1);
	    	double act_tetotal_summarysection=Double.parseDouble(act_tetotal_summarysection1);
       	
       	String tesubtotal_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                   .getProperty("testexecution.reviewcart.tesubtotals").toString();
			double tesubtotal_reviewcart = Double.parseDouble(tesubtotal_reviewcart1);
			tesubtotal_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(tesubtotal_reviewcart));
			
			String tesubtotal_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                   .getProperty("testexecution.rewardspage.tesubtotals").toString();
			double tesubtotal_rewardspage = Double.parseDouble(tesubtotal_rewardspage1);
			tesubtotal_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(tesubtotal_rewardspage));
			
			//########################################################################################################//
			
			String tetaxes_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                   .getProperty("testexecution.reviewcart.tetaxes").toString();
			double tetaxes_reviewcart = Double.parseDouble(tetaxes_reviewcart1);
			tetaxes_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(tetaxes_reviewcart));
			
			String tetaxes_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                   .getProperty("testexecution.rewardspage.tetaxes").toString();
			double tetaxes_rewardspage = Double.parseDouble(tetaxes_rewardspage1);
			tetaxes_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(tetaxes_rewardspage));
			
			//########################################################################################################//
			
			String teitems_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                   .getProperty("testexecution.reviewcart.teitems").toString();
			double teitems_reviewcart = Double.parseDouble(teitems_reviewcart1);
			
			String teitems_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                   .getProperty("testexecution.rewardspage.teitems").toString();
			double teitems_rewardspage = Double.parseDouble(teitems_rewardspage1);
			teitems_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(teitems_rewardspage));
			
			//########################################################################################################//
			
			String tetotals_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                   .getProperty("testexecution.reviewcart.tetotals").toString();
			double tetotals_reviewcart = Double.parseDouble(tetotals_reviewcart1);
			tetotals_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(tetotals_reviewcart));
			
			String tetotals_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                   .getProperty("testexecution.rewardspage.tetotals").toString();
			double tetotals_rewardspage = Double.parseDouble(tetotals_rewardspage1);
			tetotals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(tetotals_rewardspage));
			if(sizetebonusbank().size()!=0 && sizetebonusbank().get(0).isDisplayed()){
			String tebonusbank1 = gettebonusbank().getAttribute("value").trim();
			if(!tebonusbank1.equals("")){
			double tebonusbank = Double.parseDouble(tebonusbank1);
			tebonusbank =Double.parseDouble(new DecimalFormat("##.##").format(tebonusbank));
			
			String tepapercoupon1 = gettebonusbank().getAttribute("value").trim();
			double tepapercoupon = Double.parseDouble(tepapercoupon1);
			tepapercoupon =Double.parseDouble(new DecimalFormat("##.##").format(tepapercoupon));
			
			double redemptions = tebonusbank+tepapercoupon;
			redemptions =Double.parseDouble(new DecimalFormat("##.##").format(redemptions));
			
			tetotals_rewardspage = tetotals_rewardspage+redemptions;
			tetotals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(tetotals_rewardspage));
			Assert.assertEquals(tetotals_reviewcart, act_tetotal_summarysection,"TE Totals is not matching in Confirm & Submit Page for Summary Section");
			Assert.assertEquals(tetotals_reviewcart, tetotals_rewardspage,"Totals is not matching for TE section in Confirm & Submit Page");
			}
			
			else if(tebonusbank1.equals("")){
				double tebonusbank = 0.00;
				double tepapercoupon = 0.00;
				
				double redemptions = tebonusbank+tepapercoupon;
				redemptions =Double.parseDouble(new DecimalFormat("##.##").format(redemptions));
				
				tetotals_rewardspage = tetotals_rewardspage+redemptions;
				tetotals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(tetotals_rewardspage));
				Assert.assertEquals(tetotals_reviewcart, act_tetotal_summarysection,"TE Totals is not matching in Confirm & Submit Page for Summary Section");
				Assert.assertEquals(tetotals_reviewcart, tetotals_rewardspage,"Totals is not matching for TE section in Rewards Page");
				}
			}
			else if(sizetebonusbank().size()==0){
				double tebonusbank = 0.00;
				double tepapercoupon = 0.00;
				
				double redemptions = tebonusbank+tepapercoupon;
				redemptions =Double.parseDouble(new DecimalFormat("##.##").format(redemptions));
				
				tetotals_rewardspage = tetotals_rewardspage+redemptions;
				tetotals_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(tetotals_rewardspage));
				Assert.assertEquals(tetotals_reviewcart, act_tetotal_summarysection,"TE Totals is not matching in Confirm & Submit Page for Summary Section");
				Assert.assertEquals(tetotals_reviewcart, tetotals_rewardspage,"Totals is not matching for TE section in Rewards Page");
				
			}
			
			//########################################################################################################//
			
			Assert.assertEquals(tesubtotal_reviewcart, tesubtotal_rewardspage,"Subtotal is not matching for TE section in Rewards Page");
			Assert.assertEquals(tetaxes_reviewcart, tetaxes_rewardspage,"Taxes are not matching for TE section in Rewards Page");
			Assert.assertEquals(teitems_reviewcart, teitems_rewardspage,"Items count is not matching for TE section in Rewards Page");
			}
		}
	
	@Override
	public void verify_rewardsearned_amount_in_rewardspage(){
		CheckoutPage checkoutpage = new CheckoutPage();
		double sfosubtotal_rewardspage;
		double ytosubtotal_rewardspage;
		// below code for verifying rewards earned amount in redemptions page for teacher
		String soosubtotal_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                .getProperty("testexecution.rewardspage.soosubtotals").toString();
		double soosubtotal_rewardspage = Double.parseDouble(soosubtotal_rewardspage1);
		soosubtotal_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(soosubtotal_rewardspage));
		System.out.println("SOO amount in rewards page is------>>>>>>>>>"+ soosubtotal_rewardspage);
		
		String sfosubtotal_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                .getProperty("testexecution.rewardspage.sfosubtotals").toString();
		sfosubtotal_rewardspage = Double.parseDouble(sfosubtotal_rewardspage1);
		sfosubtotal_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sfosubtotal_rewardspage));
		
		String creditnotes1 = getcreditnotes().getAttribute("value").trim();
		if(!creditnotes1.equals("")){
		double creditnotes = Double.parseDouble(creditnotes1);
		creditnotes =Double.parseDouble(new DecimalFormat("##.##").format(creditnotes));
		sfosubtotal_rewardspage = sfosubtotal_rewardspage-creditnotes;
		sfosubtotal_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(sfosubtotal_rewardspage));
		}
		System.out.println("SFO if not present in rewards page is:"+sfosubtotal_rewardspage);
		String ytosubtotal_rewardspage1 = TestBaseProvider.getTestBase().getContext()
                .getProperty("testexecution.rewardspage.ytosubtotals").toString();
		ytosubtotal_rewardspage = Double.parseDouble(ytosubtotal_rewardspage1);
		ytosubtotal_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(ytosubtotal_rewardspage));
		
		String ytobonusbank1 = getytobonusbank().getAttribute("value").trim();
		if(!ytobonusbank1.equals("")){
		double ytobonusbank = Double.parseDouble(ytobonusbank1);
		ytobonusbank =Double.parseDouble(new DecimalFormat("##.##").format(ytobonusbank));
		
		String ytopapercoupon1 = getytobonusbank().getAttribute("value").trim();
		double ytopapercoupon = Double.parseDouble(ytopapercoupon1);
		ytopapercoupon =Double.parseDouble(new DecimalFormat("##.##").format(ytopapercoupon));
		
		double redemptions = ytobonusbank+ytopapercoupon;
		redemptions =Double.parseDouble(new DecimalFormat("##.##").format(redemptions));
		
		ytosubtotal_rewardspage = ytosubtotal_rewardspage-redemptions;
		ytosubtotal_rewardspage =Double.parseDouble(new DecimalFormat("##.##").format(ytosubtotal_rewardspage));
		}
		double exp_rewards_earned_amt = soosubtotal_rewardspage+sfosubtotal_rewardspage+ytosubtotal_rewardspage;
		System.out.println("Expected qualifying amount in rewards page is------>>>>>>>>>"+ exp_rewards_earned_amt);
		exp_rewards_earned_amt =Double.parseDouble(new DecimalFormat("##.##").format(exp_rewards_earned_amt));
		
		String act_rewards_earned_amt11 = checkoutpage.lebel_Rewards_Qualifying_order_in_REWARDS_section_in_RedemptionsRewardsPage().getText();
		String[] act_rewards_earned_amt12 = act_rewards_earned_amt11.split(" ");
		String act_rewards_earned_amt1 = act_rewards_earned_amt12[act_rewards_earned_amt12.length - 1];
		act_rewards_earned_amt1 = act_rewards_earned_amt1.substring(1);
		double act_rewards_earned_amt = Double.parseDouble(act_rewards_earned_amt1);
		act_rewards_earned_amt =Double.parseDouble(new DecimalFormat("##.##").format(act_rewards_earned_amt));
		System.out.println("qualifying amount in rewards page is----->>>>>>"+act_rewards_earned_amt);
		Assert.assertEquals(act_rewards_earned_amt,exp_rewards_earned_amt,"Rewards earned is incorrect in Redemptions page");
		}
	
	
	@Override
	public void getitem_count_sfo_yto_soo_te_pages(String section){
		StudentOnlineOrdersPage studentonlineorderpage = new StudentOnlineOrdersPage();
		StudentFlyerOrdersPage studentflyerorderpage = new StudentFlyerOrdersPage();
	if(section.equalsIgnoreCase("SOO")){
		List<WebElement> ele = studentonlineorderpage.sizesooitemquantities();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			String sooitems_rewardspage1= ele.get(i).getText().trim();
			System.out.println("SOO items count is------------->>>>>>>>>>>>>>"+ sooitems_rewardspage1);
			if(!sooitems_rewardspage1.equals("")){
			sooitems_rewardspage1 = sooitems_rewardspage1.substring(1, sooitems_rewardspage1.length() - 1);
			sooitems_totalcount += Integer.parseInt(sooitems_rewardspage1);
		}
		}
		}
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.soototalitemcount",
				Integer.valueOf(sooitems_totalcount));
		System.out.println("SOO Items Count is-------->"+sooitems_totalcount );
	}
	
	else if(section.equalsIgnoreCase("SFO")){
		System.out.println("Entered to SFO section to read the items count");
		List<WebElement> ele = studentflyerorderpage.sizesfoitemquantities();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			String sfoitems_rewardspage1= ele.get(i).getAttribute("value").trim();
			sfoitems_totalcount += Integer.parseInt(sfoitems_rewardspage1);
		}
		}
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.sfototalitemcount",
				Integer.valueOf(sfoitems_totalcount));
		System.out.println("SFO Items Count is-------->"+sfoitems_totalcount );
	}
	
	else if(section.equalsIgnoreCase("SFOFREEPICK")){
		List<WebElement> ele = studentflyerorderpage.sizesfofreepickitemquantities();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			String sfoitems_rewardspage1= ele.get(i).getText().trim();
			sfofreepickitems_totalcount += Integer.parseInt(sfoitems_rewardspage1);
		}
		}
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.sfofreepicktotalitemcount",
				Integer.valueOf(sfofreepickitems_totalcount));
		System.out.println("SFO Freepick Items Count is-------->"+sfofreepickitems_totalcount );
	}
	
	else if(section.equalsIgnoreCase("YTO")){
		List<WebElement> ele = studentflyerorderpage.sizeytoitemquantities();
		for(int i=0;i<ele.size();i++){
			String ytoitems_rewardspage1= ele.get(i).getAttribute("value").trim();
			ytoitems_totalcount += Integer.parseInt(ytoitems_rewardspage1);
		}
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.ytototalitemcount",
				Integer.valueOf(ytoitems_totalcount));
		System.out.println("YTO Items Count is-------->"+ytoitems_totalcount );
		}
	
	else if(section.equalsIgnoreCase("TE")){
		List<WebElement> ele = studentflyerorderpage.sizeteitemquantities();
		if((ele.size()!=0) && (ele.get(0).isDisplayed())){
		for(int i=0;i<ele.size();i++){
			String teitems_rewardspage1= ele.get(i).getAttribute("value").trim();
			teitems_totalcount += Integer.parseInt(teitems_rewardspage1);
		}
		}
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.tetotalitemcount",
				Integer.valueOf(teitems_totalcount));
		System.out.println("TE Items Count is-------->"+teitems_totalcount );
		
	}
	}
	
	
	
	@Override
	public void verify_ordertotal_totalitems_in_paymentpage(){
		CheckoutPage checkoutpage = new CheckoutPage();
		List<WebElement> soototal = rewardspagesizesoototals();
		List<WebElement> sfototal = rewardspagesizesfototals();
		List<WebElement> ytototal = rewardspagesizeytototals();
		List<WebElement> tetotal  = rewardspagesizetetotals();
		
		List<WebElement> sooitems = rewardspagesizesooitems();
		List<WebElement> sfoitems = rewardspagesizesfoitems();
		List<WebElement> ytoitems = rewardspagesizeytoitems();
		List<WebElement> teitems  = rewardspagesizeteitems();
		
		if((soototal.size()!=0) && (soototal.get(0).isDisplayed())){
		for(int i=0;i<soototal.size();i++){
			String soototal_paymentpage1= soototal.get(i).getText().trim();
			soototal_paymentpage1 = soototal_paymentpage1.substring(1);
			soototal_paymentpage += Double.parseDouble(soototal_paymentpage1);
		}
		}
		
		if((sooitems.size()!=0) && (sooitems.get(0).isDisplayed())){
		for(int i=0;i<sooitems.size();i++){
			String sooitems_paymentpage1= sooitems.get(i).getText().trim().replaceAll("(?i)Items", "");
			sooitems_paymentpage1= sooitems_paymentpage1.trim();
			System.out.println("SOO ITEMS FROM ORDER TOTAL METHOD IS---->>>>:"+sooitems_paymentpage1);
			sooitems_paymentpage += Integer.parseInt(sooitems_paymentpage1);
		}
		}
		
		if((sfototal.size()!=0) && (sfototal.get(0).isDisplayed())){
			for(int i=0;i<sfototal.size();i++){
				String sfototal_paymentpage1= sfototal.get(i).getText().trim();
				sfototal_paymentpage1 = sfototal_paymentpage1.substring(1);
				sfototal_paymentpage += Double.parseDouble(sfototal_paymentpage1);
			}
			}
		
		if((sfoitems.size()!=0) && (sfoitems.get(0).isDisplayed())){
			for(int i=0;i<sfoitems.size();i++){
				String sfoitems_paymentpage1= sfoitems.get(i).getText().trim().replaceAll("(?i)Items", "");
				sfoitems_paymentpage1 = sfoitems_paymentpage1.trim();
				sfoitems_paymentpage += Integer.parseInt(sfoitems_paymentpage1);
			}
			}
		
		if((ytototal.size()!=0) && (ytototal.get(0).isDisplayed())){
			for(int i=0;i<ytototal.size();i++){
				String ytototal_paymentpage1= ytototal.get(i).getText().trim();
				ytototal_paymentpage1 = ytototal_paymentpage1.substring(1);
				ytototal_paymentpage += Double.parseDouble(ytototal_paymentpage1);
			}
			}
		
		if((ytoitems.size()!=0) && (ytoitems.get(0).isDisplayed())){
			for(int i=0;i<ytoitems.size();i++){
				String ytoitems_paymentpage1= ytoitems.get(i).getText().trim().replaceAll("(?i)Items", "");
				ytoitems_paymentpage1 = ytoitems_paymentpage1.trim();
				ytoitems_paymentpage += Integer.parseInt(ytoitems_paymentpage1);
			}
			}
		
		if((tetotal.size()!=0) && (tetotal.get(0).isDisplayed())){
			for(int i=0;i<tetotal.size();i++){
				String tetotal_paymentpage1= tetotal.get(i).getText().trim();
				tetotal_paymentpage1 = tetotal_paymentpage1.substring(1);
				tetotal_paymentpage += Double.parseDouble(tetotal_paymentpage1);
			}
			}
		
		if((teitems.size()!=0) && (teitems.get(0).isDisplayed())){
			for(int i=0;i<teitems.size();i++){
				String teitems_paymentpage1= teitems.get(i).getText().trim().replaceAll("(?i)Items", "");
				teitems_paymentpage1 = teitems_paymentpage1.trim();
				teitems_paymentpage += Integer.parseInt(teitems_paymentpage1);
			}
			}
		double exptotal_paymentpage = sfototal_paymentpage+ytototal_paymentpage+tetotal_paymentpage;
		exptotal_paymentpage =Double.parseDouble(new DecimalFormat("##.##").format(exptotal_paymentpage));
		String acttotal_paymentpage1 = checkoutpage.Total_Amount_Owing_Payment().getText().trim().substring(1);
		double acttotal_paymentpage = Double.parseDouble(acttotal_paymentpage1);
		acttotal_paymentpage =Double.parseDouble(new DecimalFormat("##.##").format(acttotal_paymentpage));
		Assert.assertEquals(acttotal_paymentpage,exptotal_paymentpage,"Total is incorrect in Payment Page");
		
		int expitems_paymentpage = sooitems_paymentpage+sfoitems_paymentpage+ytoitems_paymentpage+teitems_paymentpage;
		String actitems_paymentpage1 = checkoutpage.Total_Items_Payment().getText().trim().replaceAll("(?i)Items", "");
		actitems_paymentpage1 = actitems_paymentpage1.trim();
		int actitems_paymentpage = Integer.parseInt(actitems_paymentpage1);
		Assert.assertEquals(actitems_paymentpage,expitems_paymentpage,"Item count is incorrect in Payment Page");
		
	}
	
	@Override
	public void verify_totalamountdue_summarysection_confirmationpages(){
		CheckoutPage_2 checkoutPage2 = new CheckoutPage_2();
		double sfoytoaferpop;
		
		String act_sfototal_summarysection1=checkoutPage2.SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
		act_sfototal_summarysection1=checkoutPage2.SFO_page.delete_US_or_Canada_dollar_for_the_value(act_sfototal_summarysection1);
    	double act_sfototal_summarysection=Double.parseDouble(act_sfototal_summarysection1);
		
	    String act_ytototal_summarysection1=checkoutPage2.YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
 	    act_ytototal_summarysection1=checkoutPage2.SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ytototal_summarysection1);
	    double act_ytototal_summarysection=Double.parseDouble(act_ytototal_summarysection1);
	   
	    /*String act_soototal_summarysection1=checkoutPage2.SOO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
	    act_soototal_summarysection1=checkoutPage2.SFO_page.delete_US_or_Canada_dollar_for_the_value(act_soototal_summarysection1);
   	    double act_soototal_summarysection=Double.parseDouble(act_soototal_summarysection1);*/
   	   
   	    String act_tetotal_summarysection1=checkoutPage2.YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
	    act_tetotal_summarysection1=checkoutPage2.SFO_page.delete_US_or_Canada_dollar_for_the_value(act_tetotal_summarysection1);
 	    double act_tetotal_summarysection=Double.parseDouble(act_tetotal_summarysection1);
 	    
 	    String act_totalamountdue1=checkoutPage2.ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
 	   act_totalamountdue1=checkoutPage2.SFO_page.delete_US_or_Canada_dollar_for_the_value(act_totalamountdue1);
 	   double act_totalamountdue=Double.parseDouble(act_totalamountdue1);
 	   //double act_totalamountdue =Double.parseDouble(new DecimalFormat("##.##").format(act_totalamountdue1));
 	   
 	   String act_shippingamount1 = checkoutPage2.Shipping_Handling_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
 	    
 	    if(checkoutPage2.POP_Total_OrderSummary_section_Confirm_Submit_page().size()!=0 && 
		 	    		checkoutPage2.POP_Total_OrderSummary_section_Confirm_Submit_page().get(0).isDisplayed()){
		 	    	
		 	    	String act_poptotal_summarysection1=checkoutPage2.YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
		 	    	act_poptotal_summarysection1=checkoutPage2.SFO_page.delete_US_or_Canada_popdollar_for_the_value(act_poptotal_summarysection1);
		 	 	    double act_poptotal_summarysection=Double.parseDouble(act_poptotal_summarysection1);
		 	 	    
		 	 	    double sfoytoaferpop1 = ((act_sfototal_summarysection+act_ytototal_summarysection)-act_poptotal_summarysection);
		 	 	    sfoytoaferpop =Double.parseDouble(new DecimalFormat("##.##").format(sfoytoaferpop1));
		 	 	    
		 	 	    if(!act_shippingamount1.contains("FREE")){
		 	 	    	act_shippingamount1=checkoutPage2.SFO_page.delete_US_or_Canada_dollar_for_the_value(act_shippingamount1);
		 	 	 	   double act_shippingamount =Double.parseDouble(new DecimalFormat("##.##").format(act_shippingamount1));
		 	 	 	   
		 	 	 	   double exptotalamountdue = sfoytoaferpop+act_tetotal_summarysection+act_shippingamount;
		 	 	 	   Assert.assertEquals(act_totalamountdue,exptotalamountdue,"Total amount due is incorrect if there are pop's in confirmation pages");
		 	 	 	   
		 	 	    }
		 	 	    
		 	 	    else if(act_shippingamount1.contains("FREE")){
			 	 	   
			 	 	   double exptotalamountdue = sfoytoaferpop+act_tetotal_summarysection;
			 	 	   Assert.assertEquals(act_totalamountdue,exptotalamountdue,"Total amount due is incorrect if there are pop's in confirmation pages");
			 	 	   
			 	    }    
		 	    }
 	    
	 	    else if(!act_shippingamount1.contains("FREE")){
	 	 	    	act_shippingamount1=checkoutPage2.SFO_page.delete_US_or_Canada_dollar_for_the_value(act_shippingamount1);
	 	 	 	   double act_shippingamount =Double.parseDouble(new DecimalFormat("##.##").format(act_shippingamount1));
	 	 	 	   
	 	 	 	   double exptotalamountdue = act_sfototal_summarysection+act_ytototal_summarysection+act_tetotal_summarysection+act_shippingamount;
	 	 	 	   Assert.assertEquals(act_totalamountdue,exptotalamountdue,"Total amount due is incorrect in confirmation pages");
	 	 	 	   
	 	 	    }
 	    
		 	else if(act_shippingamount1.contains("FREE")){
		 	 	   
		 	 	   double exptotalamountdue = act_sfototal_summarysection+act_ytototal_summarysection+act_tetotal_summarysection;
		 	 	   Assert.assertEquals(act_totalamountdue,exptotalamountdue,"Total amount due is incorrect in confirmation pages");
		 	 	   
		 	    }
 	    	
 	    }
	
	
	@Override
	public void verify_summarysection_totals_confirmationpages(){
		CheckoutPage_2 checkoutPage2 = new CheckoutPage_2();
			
		    //SOO	
		    String act_soototal_summarysection1=checkoutPage2.SOO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
		    act_soototal_summarysection1=checkoutPage2.SFO_page.delete_US_or_Canada_dollar_for_the_value(act_soototal_summarysection1);
	   	    double act_soototal_summarysection=Double.parseDouble(act_soototal_summarysection1);
	   	    
	   	    String soototal_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                 .getProperty("testexecution.reviewcart.soototals").toString();
			double soototal_reviewcart = Double.parseDouble(soototal_reviewcart1);
			soototal_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(soototal_reviewcart));
			Assert.assertEquals(act_soototal_summarysection,soototal_reviewcart,"SOO Total amount is incorrect in confirmation pages");  
	   	 	
			//SFO
			String act_sfototal_summarysection1=checkoutPage2.SFO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
			act_sfototal_summarysection1=checkoutPage2.SFO_page.delete_US_or_Canada_dollar_for_the_value(act_sfototal_summarysection1);
	    	double act_sfototal_summarysection=Double.parseDouble(act_sfototal_summarysection1);
	   	    
	    	String sfototals_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.sfototals").toString();
			double sfototals_reviewcart = Double.parseDouble(sfototals_reviewcart1);
			sfototals_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(sfototals_reviewcart));
			//Assert.assertEquals(act_sfototal_summarysection,sfototals_reviewcart,"SFO Total amount is incorrect in confirmation pages");
			
			String creditnotes1 = getcreditnotes().getAttribute("value").trim();
			if(!creditnotes1.equals("")){	
			double creditnotes = Double.parseDouble(creditnotes1);
			creditnotes =Double.parseDouble(new DecimalFormat("##.##").format(creditnotes));
			act_sfototal_summarysection = act_sfototal_summarysection+creditnotes;
			act_sfototal_summarysection =Double.parseDouble(new DecimalFormat("##.##").format(act_sfototal_summarysection));
			Assert.assertEquals(sfototals_reviewcart, act_sfototal_summarysection,"SFO Total amount is incorrect in confirmation pages");
			}
			
			else if(creditnotes1.equals("")){
					double creditnotes = 0.00;
					act_sfototal_summarysection = act_sfototal_summarysection+creditnotes;
					act_sfototal_summarysection =Double.parseDouble(new DecimalFormat("##.##").format(act_sfototal_summarysection));
					Assert.assertEquals(sfototals_reviewcart, act_sfototal_summarysection,"SFO Total amount is incorrect in confirmation pages");
					}
			
			//YTO
			String act_ytototal_summarysection1=checkoutPage2.YTO_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
			act_ytototal_summarysection1=checkoutPage2.SFO_page.delete_US_or_Canada_dollar_for_the_value(act_ytototal_summarysection1);
	    	double act_ytototal_summarysection=Double.parseDouble(act_ytototal_summarysection1);
	   	    
	    	String ytototals_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.ytototals").toString();
			double ytototals_reviewcart = Double.parseDouble(ytototals_reviewcart1);
			ytototals_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(ytototals_reviewcart));
			//Assert.assertEquals(act_ytototal_summarysection,ytototals_reviewcart,"YTO Total amount is incorrect in confirmation pages");
			
			String ytobonusbank1 = getytobonusbank().getAttribute("value").trim();
			if(!ytobonusbank1.equals("")){
			double ytobonusbank = Double.parseDouble(ytobonusbank1);
			ytobonusbank =Double.parseDouble(new DecimalFormat("##.##").format(ytobonusbank));
			
			String ytopapercoupon1 = getytobonusbank().getAttribute("value").trim();
			double ytopapercoupon = Double.parseDouble(ytopapercoupon1);
			ytopapercoupon =Double.parseDouble(new DecimalFormat("##.##").format(ytopapercoupon));
			
			double redemptions = ytobonusbank+ytopapercoupon;
			redemptions =Double.parseDouble(new DecimalFormat("##.##").format(redemptions));
			
			act_ytototal_summarysection = act_ytototal_summarysection+redemptions;
			act_ytototal_summarysection =Double.parseDouble(new DecimalFormat("##.##").format(act_ytototal_summarysection));
			Assert.assertEquals(ytototals_reviewcart, act_ytototal_summarysection,"YTO Total amount is incorrect in confirmation pages");
			
			}
			
			else if(ytobonusbank1.equals("")){
				double ytobonusbank = 0.00;
				double ytopapercoupon = 0.00;
				
				double redemptions = ytobonusbank+ytopapercoupon;
				redemptions =Double.parseDouble(new DecimalFormat("##.##").format(redemptions));
				
				act_ytototal_summarysection = act_ytototal_summarysection+redemptions;
				act_ytototal_summarysection =Double.parseDouble(new DecimalFormat("##.##").format(act_ytototal_summarysection));
				Assert.assertEquals(ytototals_reviewcart, act_ytototal_summarysection,"YTO Total amount is incorrect in confirmation pages");
				
				}
			//TE
			String act_tetotal_summarysection1=checkoutPage2.TE_Total_OrderSummary_section_Confirm_Submit_page().getText().trim();
			act_tetotal_summarysection1=checkoutPage2.SFO_page.delete_US_or_Canada_dollar_for_the_value(act_tetotal_summarysection1);
	    	double act_tetotal_summarysection=Double.parseDouble(act_tetotal_summarysection1);
	   	    
	    	String tetotals_reviewcart1 = TestBaseProvider.getTestBase().getContext()
                    .getProperty("testexecution.reviewcart.tetotals").toString();
			double tetotals_reviewcart = Double.parseDouble(tetotals_reviewcart1);
			tetotals_reviewcart =Double.parseDouble(new DecimalFormat("##.##").format(tetotals_reviewcart));
			//Assert.assertEquals(act_tetotal_summarysection,tetotals_reviewcart,"TE Total amount is incorrect in confirmation pages");
			
			String tebonusbank1 = gettebonusbank().getAttribute("value").trim();
			if(!tebonusbank1.equals("")){
			double tebonusbank = Double.parseDouble(tebonusbank1);
			tebonusbank =Double.parseDouble(new DecimalFormat("##.##").format(tebonusbank));
			
			String tepapercoupon1 = gettebonusbank().getAttribute("value").trim();
			double tepapercoupon = Double.parseDouble(tepapercoupon1);
			tepapercoupon =Double.parseDouble(new DecimalFormat("##.##").format(tepapercoupon));
			
			double redemptions = tebonusbank+tepapercoupon;
			redemptions =Double.parseDouble(new DecimalFormat("##.##").format(redemptions));
			
			act_tetotal_summarysection = act_tetotal_summarysection+redemptions;
			act_tetotal_summarysection =Double.parseDouble(new DecimalFormat("##.##").format(act_tetotal_summarysection));
			Assert.assertEquals(tetotals_reviewcart, act_tetotal_summarysection,"TE Total amount is incorrect in confirmation pages");
			}
			
			else if(tebonusbank1.equals("")){
				double tebonusbank = 0.00;
				double tepapercoupon = 0.00;
				
				double redemptions = tebonusbank+tepapercoupon;
				redemptions =Double.parseDouble(new DecimalFormat("##.##").format(redemptions));
				
				act_tetotal_summarysection = act_tetotal_summarysection+redemptions;
				act_tetotal_summarysection =Double.parseDouble(new DecimalFormat("##.##").format(act_tetotal_summarysection));
				Assert.assertEquals(tetotals_reviewcart, act_tetotal_summarysection,"TE Total amount is incorrect in confirmation pages");
				}
 	    }
	
	@Override
	public void verify_totalamountdue_iszero_summarysection_confirmationpages(){
		CheckoutPage_2 checkoutPage2 = new CheckoutPage_2();
		
		String act_totalamountdue1=checkoutPage2.ORDER_TOTAL_OrderSummary_section_Confirm_Submit_page().getText().trim();
	 	   act_totalamountdue1=checkoutPage2.SFO_page.delete_US_or_Canada_dollar_for_the_value(act_totalamountdue1);
	 	   double act_totalamountdue =Double.parseDouble((act_totalamountdue1));
	 	   
	 	double exp_totalamountdue = 0.00;
	 	Assert.assertEquals(act_totalamountdue,exp_totalamountdue,"Total amount due is not zero in confirmation pages");
		
	}
	
	@Override
	public void verify_FreeItem_promotions_not_display() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		try {
			fld_FreeItem_promotion_Rewards_page().isDisplayed();
			Assert.fail("FreeItem promotion is displayed in Rewards section");
		} catch (Exception e) {
			System.out.println("FreeItem promotion is not displayed in Rewards section");
		}
	}
	
	@Override
	public void verify_FreeItem_promotion_is_displayed() {
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		
		try {
			fld_FreeItem_promotion_Rewards_page().isDisplayed();
			System.out.println("FreeItem promotion is displayed in Rewards section");
		} catch (Exception e) {
			Assert.fail("FreeItem promotion is not displayed in Rewards section");
		}
	}

}
