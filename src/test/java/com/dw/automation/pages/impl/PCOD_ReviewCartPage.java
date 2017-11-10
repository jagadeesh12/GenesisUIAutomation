package com.dw.automation.pages.impl;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import java.text.DecimalFormat;
import java.util.List;

import com.dw.automation.pages.ICheckoutPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.dw.automation.pages.PCOD_IReviewCartPage;
import com.dw.automation.pages.impl.CheckoutPage.ShippingAndPayment;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;
import com.scholastic.torque.common.WaitUtils;

public class PCOD_ReviewCartPage extends BaseTestPage<TestPage> implements PCOD_IReviewCartPage{
	StudentFlyerOrdersPage stud_page = new StudentFlyerOrdersPage();
    PCOD_ShippingAndPaymentPage pcod_shippage = new PCOD_ShippingAndPaymentPage();

    @Override
    public void openPage() {
        PCOD_LoginPage pcodlogpage= new PCOD_LoginPage();
        if (TestBaseProvider.getTestBase().getContext().getString("driver.name")
                .equals("Android")) {
            PauseUtil.pause(10000);
            WebElement el = TestBaseProvider.getTestBase().getDriver()
                    .findElement(By.xpath("//button[@title='Close']"));
            PauseUtil.pause(15000);
            if (el.isDisplayed()) {
                el.click();
                WaitUtils.waitForEnabled(pcodlogpage.getTxtUsername());
            }
        }

    }



//################################################################################################


    @FindBy(locator = "dw.pcod.reviewcart.item1.totalprice")
    private WebElement lblitem1totalpricereviewcartpage;

    @FindBy(locator = "dw.pcod.reviewcart.item2.totalprice")
    private WebElement lblitem2totalpricereviewcartpage;

    @FindBy(locator = "dw.pcod.reviewcart.item3.totalprice")
    private WebElement lblitem3totalpricereviewcartpage;

    @FindBy(locator = "dw.pcod.reviewcart.item4.totalprice")
    private WebElement lblitem4totalpricereviewcartpage;

    @FindBy(locator = "dw.pcod.reviewcart.item1.unitprice")
    private WebElement lblitem1unitpricereviewcartpage;

    @FindBy(locator = "dw.pcod.reviewcart.item2.unitprice")
    private WebElement lblitem2unitpricereviewcartpage;

    @FindBy(locator = "dw.pcod.reviewcart.item3.unitprice")
    private WebElement lblitem3unitpricereviewcartpage;

    @FindBy(locator = "dw.pcod.reviewcart.item4.unitprice")
    private WebElement lblitem4unitpricereviewcartpage;

    @FindBy(locator = "dw.pcod.reviewcart.totalitems")
    private WebElement lbltotalitemsqtyreviewcartpage;

    @FindBy(locator = "dw.pcod.reviewcart.ordertotal")
    private WebElement lblordertotalreviewcartpage;

    @FindBy(locator = "dw.pcod.reviewcart.page")
    private WebElement pagereviewcartpage;
    
    
    @FindBy(locator = "dw.pcod.reviewcart.page.emptymessage")
    private WebElement reviewcartpageemptymessage;
    
    
    @FindBy(locator = "dw.pcod.reviewcart.page.table.items")
    private WebElement reviewcartpagetableitems;

    @FindBy(locator = "dw.pcod.reviewcart.btn.proceedtocheckout.disabled")
    private List<WebElement> btnproceedtocheckoutdisabledreviewcart;

    
    @FindBy(locator = "dw.pcod.reviewcart.item.deleteconfirm")
    private List<WebElement> reviewcartitemdeleteconfirm;
    
    @FindBy(locator = "dw.pcod.reviewcart.btn.proceedtocheckout")
    private WebElement btnproceedtocheckoutreviewcart;

    @FindBy(locator = "dw.pcod.reviewcart.lnk.backtoshop")
    private List<WebElement> sizelnkbacktoshopreviewcart;


    @FindBy(locator = "dw.pcod.reviewcart.lnk.backtoshop")
    private WebElement lnkbacktoshopreviewcart;

    @FindBy(locator = "dw.pcod.reviewcart.section.couponcode")
    private WebElement sectioncouponcodereviewcart;

    @FindBy(locator = "dw.pcod.reviewcart.txt.couponcode")
    private WebElement txtcouponcodereviewcart;

    @FindBy(locator = "dw.pcod.reviewcart.couponcode.btn.apply")
    private WebElement btnapplycouponcodereviewcart;

    @FindBy(locator ="dw.pcod.reviewcart.couponcode.btn.apply.disabled")
    private List<WebElement> btnapplydisabledcouponcodereviewcart;

    @FindBy(locator ="dw.pcod.reviewcart.freepickmodalwindow.pagelinks")
    private WebElement lnkpagesfreepickmodalwindowreviewcart;

    @FindBy(locator ="dw.pcod.reviewcart.freepickmodalwindow.pagelinks")
    private List<WebElement> sizepagelinksfreepickmodalwindowreviewcart;

    @FindBy(locator ="dw.pcod.reviewcart.freepickmodalwindow.pagelink1")
    private WebElement lnkpage1freepickmodalwindowreviewcart;

    @FindBy(locator ="dw.pcod.reviewcart.freepickmodalwindow.pagelink1")
    private List<WebElement> sizepage1freepickmodalwindowreviewcart;

    @FindBy(locator ="dw.pcod.reviewcart.freepickmodalwindow.pagelink2")
    private WebElement lnkpage2freepickmodalwindowreviewcart;

    @FindBy(locator ="dw.pcod.reviewcart.freepickmodalwindow.pagelink2")
    private List<WebElement> sizepage2freepickmodalwindowreviewcart;

    @FindBy(locator ="dw.pcod.reviewcart.freepickmodalwindow.pagelink3")
    private WebElement lnkpage3freepickmodalwindowreviewcart;

    @FindBy(locator ="dw.pcod.reviewcart.freepickmodalwindow.pagelink3")
    private List<WebElement> sizepage3freepickmodalwindowreviewcart;

    @FindBy(locator = "dw.pcod.reviewcart.freepickmodalwindow.table")
    private WebElement tablefreepickmodalwindowreviewcart;

    @FindBy(locator = "dw.pcod.reviewcart.freepickmodalwindow.table.result.size")
    private List<WebElement> sizeresultsizefreepickmodalwindowreviewcart;

    @FindBy(locator = "dw.pcod.grade.names.Modal.Window.dropDown")
    private List<WebElement> lstgradenamesmodalwindowdropdown;

    @FindBy(locator = "dw.pcod.reviewCart.coupon.list.ReviewCart")
    private List<WebElement> coupon_list_ReviewCart;

    @FindBy(locator ="dw.pcod.reviewcart.freepickcoupon.removebutton")
    private WebElement btnremovefreepickcouponreviewcart;

    @FindBy(locator ="dw.pcod.reviewcart.freepickcoupon.removebutton")
    private List<WebElement> sizebtnremovefreepickcouponreviewcart;

    @FindBy(locator="dw.pcod.reviewcart.dropdown.childname1")
    private List<WebElement> sizedrpdownchildname1reviewcart;

    @FindBy(locator="dw.pcod.reviewcart.dropdown.childname1")
    private WebElement drpdownchildname1reviewcart;
    
    @FindBy(locator="dw.pcod.reviewcart.dropdown.childname1.name")
    private WebElement drpdownchild1namereviewcart;

    @FindBy(locator="dw.pcod.reviewcart.dropdown.childname2")
    private List<WebElement> sizedrpdownchildname2reviewcart;
    
    @FindBy(locator="dw.pcod.reviewcart.item.delete")
    private List<WebElement> reviewcartitemdelete;
    
    @FindBy(locator="dw.pcod.reviewcart.dropdown.childname2")
    private WebElement drpdownchildname2reviewcart;
    
    @FindBy(locator="dw.pcod.reviewcart.dropdown.childname2.name")
    private WebElement drpdownchild2namereviewcart;

    @FindBy(locator="dw.pcod.reviewcart.dropdown.childname3")
    private List<WebElement> sizedrpdownchildname3reviewcart;

    @FindBy(locator="dw.pcod.reviewcart.dropdown.childname4")
    private List<WebElement> sizedrpdownchildname4reviewcart;

    @FindBy(locator="dw.pcod.reviewcart.dropdown.childname3")
    private WebElement drpdownchildname3reviewcart;

    @FindBy(locator="dw.pcod.reviewcart.dropdown.childname4")
    private WebElement drpdownchildname4reviewcart;

    @FindBy(locator="dw.pcod.reviewcart.drpdwn.childname1")
    private WebElement drpdwnchildname1reviewcart;

    @FindBy(locator="dw.pcod.reviewcart.drpdwn.childname2")
    private WebElement drpdwnchildname2reviewcart;

    @FindBy(locator="dw.pcod.reviewcart.drpdwn.childname3")
    private WebElement drpdwnchildname3reviewcart;

    @FindBy(locator="dw.pcod.reviewcart.drpdwn.childname4")
    private WebElement drpdwnchildname4reviewcart;

    @FindBy(locator="dw.pcod.footer.lnk.scholasticca")
    private WebElement lnkscholasticcapcodfooter;

    @FindBy(locator="dw.pcod.footer.lnk.aboutscholastic")
    private WebElement lnkaboutscholasticpcodfooter;

    @FindBy(locator="dw.pcod.footer.lnk.careers")
    private WebElement lnkcareerspcodfooter;

    @FindBy(locator="dw.pcod.footer.lnk.international")
    private WebElement lnkinternationalpcodfooter;

    @FindBy(locator="dw.pcod.footer.lnk.privacypolicy")
    private WebElement lnkprivacypolicypcodfooter;

    @FindBy(locator="dw.pcod.footer.lnk.webprivacypolicy")
    private WebElement lnkwebprivacypolicypcodfooter;

    @FindBy(locator="dw.pcod.footer.lnk.termsofuse")
    private WebElement lnktermsofusepcodfooter;

    @FindBy(locator = "dw.pcod.popup.delete.confirmation.title")
    private WebElement popup_removefreeitemCoupon;

    @FindBy(locator="dw.pcod.reviewcart.itemstable.trsize")
    private List<WebElement> sizetablerowsizereviewcart;

    @FindBy(locator="dw.pcod.editFreePick.webtable")
    private List<WebElement> sizetableMakeyourSelection;



    @FindBy(locator = "dw.pcod.reviewcart.item_qty")
    private WebElement reviewcartitemqty;

    @FindBy(locator = "dw.pcod.reveiwcart.button.chkout")
    private WebElement reviewcart_buttonChkOut;

    @FindBy(locator="dw.pcod.reviewcart.minusqty")
    private WebElement clickminus_qty;
    @FindBy(locator="dw.pcod.reviewcart.itemstable.tbody")
    private List<WebElement> sizetablesizereviewcart;

    @FindBy(locator="dw.pcod.reviewcart.item1.image")
    private WebElement item1imagereviewcart;

    @FindBy(locator="dw.pcod.reviewcart.item2.image")
    private WebElement item2imagereviewcart;

    @FindBy(locator="dw.pcod.reviewcart.item3.image")
    private WebElement item3imagereviewcart;

    @FindBy(locator="dw.pcod.reviewcart.item4.image")
    private WebElement item4imagereviewcart;

    @FindBy(locator="dw.pcod.reviewcart.item1.itemdetails")
    private WebElement item1detailsreviewcart;

    @FindBy(locator="dw.pcod.reviewcart.item2.itemdetails")
    private WebElement item2detailsreviewcart;

    @FindBy(locator="dw.pcod.reviewcart.item3.itemdetails")
    private WebElement item3detailsreviewcart;

    @FindBy(locator="dw.pcod.reviewcart.item4.itemdetails")
    private WebElement item4detailsreviewcart;

    @FindBy(locator="dw.pcod.reviewcart.item1.qty")
    private WebElement item1qtyreviewcart;

    @FindBy(locator="dw.pcod.reviewcart.item2.qty")
    private WebElement item2qtyreviewcart;

    @FindBy(locator="dw.pcod.reviewcart.item3.qty")
    private WebElement item3qtyreviewcart;

    @FindBy(locator="dw.pcod.reviewcart.item4.qty")
    private WebElement item4qtyreviewcart;

    @FindBy(locator="dw.pcod.reviewcart.item1.total")
    private WebElement item1totalreviewcart;

    @FindBy(locator="dw.pcod.reviewcart.item2.total")
    private WebElement item2totalreviewcart;

    @FindBy(locator="dw.pcod.reviewcart.item3.total")
    private WebElement item3totalreviewcart;

    @FindBy(locator="dw.pcod.reviewcart.item4.total")
    private WebElement item4totalreviewcart;

    @FindBy(locator = "dw.pcod.reviewCart.withCoupon")
    private List<WebElement> tableReviewCartwithCoupon;

    @FindBy(locator="dw.pcod.button.deleteconfirmationpopup.buttonYES")
    private WebElement buttonDeletePopupYes;

    @FindBy(locator="dw.pcod.button.deleteconfirmationpopup.buttonNO")
    private WebElement buttonDeletePopupNO;


    @FindBy(locator="dw.pcod.edit.FreePick.modal.itemTitle")
    private WebElement freeItem_Title_EditFreePickWindow;

    @FindBy(locator="dw.pcod.edit.FreePick.modal.itemDelete")
    private WebElement freeitemselectedToDelete;

    @FindBy(locator="dw.pcod.edit.FreePick.modal.buttonCancel")
    private WebElement buttonCancelFreepickEditModal;

    @FindBy(locator="dw2.pcod.edit.FreePick.modal.buttonCancel")
    private List<WebElement> button2CancelFreepickEditModal;
    
	@FindBy(locator="dw.pcod.reviewCart.item1.childdropdown")
	private WebElement pcod_reviewCart_item1_childdrpdown;
	
	@FindBy(locator="dw.pcod.reviewCart.item1.childdropdown.list")
	private List<WebElement> pcod_reviewCart_item1_childdrpdown_list;

    @FindBy(locator="dw.pcod.reviewCart.added.childname")
    private WebElement pcod_reviewcart_addedchildname;

	
	@FindBy(locator="dw.pcod.reviewCart.item1.childdropdown.childnotconnected")
	private WebElement pcod_reviewCart_item1_childdrpdown_childnotconnected;
	
	@FindBy(locator="dw.pcod.reviewCart.item1.childdropdown.childnotconnected.link")
	private WebElement pcod_reviewCart_item1_childdrpdown_childnotconnected_link;
    
	@FindBy(locator="dw.pcod.reviewCart.item1.childdropdown.addachild.link")
	private WebElement pcod_reviewCart_item1_childdrpdown_addAChid_link;

    @FindBy(locator="dw.pcod.reviewCart.addchild.section")
    private WebElement pcod_reviewcart_addchild_section;

    @FindBy(locator="dw.pcod.reviewCart.dropdownselect.addchild")
    private WebElement pcod_reviewcart_drpdown_Addchild_Select;

    @FindBy(locator="dw.teacher.home.reviewcart.shoppingcart.link")
    private WebElement pcod_reviewcart_shoppingcart_icon;
    
    public WebElement getShoppingCartIcon(){
    	return pcod_reviewcart_shoppingcart_icon;
    }
    
    public WebElement getAddAChildReviewcartItem1(){
    	return pcod_reviewCart_item1_childdrpdown_addAChid_link;
    }
    
    public WebElement getChildDropdownReviewcartItem1(){
    	return pcod_reviewCart_item1_childdrpdown;
    }
    
    public WebElement getChildNotconnectedReviewcartItem1(){
    	return pcod_reviewCart_item1_childdrpdown_childnotconnected;
    }
    
    public List<WebElement> getChildDropdownListReviewcartItem1(){
    	return pcod_reviewCart_item1_childdrpdown_list;
    }
    public WebElement getreviewcart_addedchildname(){
        return pcod_reviewcart_addedchildname;
    }

    public WebElement getChildDropdownLinkReviewcartItem1(){
    	return pcod_reviewCart_item1_childdrpdown_childnotconnected_link;
    }
    
    public WebElement getFreeitemselectedToDelete() {
        return freeitemselectedToDelete;
    }

    public WebElement getbuttonCancelFreepickEditModal() {
        return buttonCancelFreepickEditModal;
    }

    public List<WebElement> getbutton2CancelFreepickEditModal() {
        return button2CancelFreepickEditModal;
    }

    public List<WebElement> gettableReviewCartwithCoupon() {
        return tableReviewCartwithCoupon;
    }

    
    public List<WebElement> reviewcartitemdelete() {
        return reviewcartitemdelete;
    }
    
    public WebElement getbuttonDeletePopupYes() {
        return buttonDeletePopupYes;
    }

    public WebElement getbuttonDeletePopupNO() {
        return buttonDeletePopupNO;
    }
    public WebElement getpopup_removefreeitemCoupon() {
        return popup_removefreeitemCoupon;
    }

    public WebElement getlblitem1totalpricereviewcartpage() {
        return lblitem1totalpricereviewcartpage;
    }

    public WebElement getlblitem2totalpricereviewcartpage() {
        return lblitem2totalpricereviewcartpage;
    }

    public WebElement getlblitem3totalpricereviewcartpage() {
        return lblitem3totalpricereviewcartpage;
    }

    public WebElement getlblitem4totalpricereviewcartpage() {
        return lblitem4totalpricereviewcartpage;
    }

    public WebElement getlblitem1unitpricereviewcartpage() {
        return lblitem1unitpricereviewcartpage;
    }
    
    

    public WebElement getlblitem2unitpricereviewcartpage() {
        return lblitem2unitpricereviewcartpage;
    }

    public WebElement getlblitem3unitpricereviewcartpage() {
        return lblitem3unitpricereviewcartpage;
    }

    public WebElement getlblitem4unitpricereviewcartpage() {
        return lblitem4unitpricereviewcartpage;
    }

    public WebElement getlbltotalitemsqtyreviewcartpage() {
        return lbltotalitemsqtyreviewcartpage;
    }

    public WebElement getlblordertotalreviewcartpage() {
        return lblordertotalreviewcartpage;
    }

    public WebElement getpagereviewcartpage() {
        return pagereviewcartpage;
    }

    public List<WebElement> sizebtnproceedtocheckoutdisabledreviewcart() {
        return btnproceedtocheckoutdisabledreviewcart;
    }
    
    
    public WebElement reviewcartpagetableitems(String string) {
        return SCHUtils.findElement("dw.pcod.reviewcart.page.table.items", string);
    }

    public WebElement getbtnproceedtocheckoutreviewcart() {
        return btnproceedtocheckoutreviewcart;
    }
    
    
    public WebElement reviewcartpageemptymessage() {
        return reviewcartpageemptymessage;
    }

    public List<WebElement> sizelnkbacktoshopreviewcart() {
        return sizelnkbacktoshopreviewcart;
    }

    public WebElement getlnkbacktoshopreviewcart() {
        return lnkbacktoshopreviewcart;
    }

    public WebElement getsectioncouponcodereviewcart() {
        return sectioncouponcodereviewcart;
    }

    public WebElement gettxtcouponcodereviewcart() {
        return txtcouponcodereviewcart;
    }

    public WebElement getbtnapplycouponcodereviewcart() {
        return btnapplycouponcodereviewcart;
    }

    public List<WebElement> getbtnapplydisabledcouponcodereviewcart() {
        return btnapplydisabledcouponcodereviewcart;
    }

    public List<WebElement> sizepagelinksfreepickmodalwindowreviewcart() {
        return sizepagelinksfreepickmodalwindowreviewcart;
    }

    public WebElement getlnkpagesfreepickmodalwindowreviewcart() {
        return lnkpagesfreepickmodalwindowreviewcart;
    }

    public List<WebElement> sizepage1freepickmodalwindowreviewcart() {
        return sizepage1freepickmodalwindowreviewcart;
    }

    public WebElement getlnkpage1freepickmodalwindowreviewcart() {
        return lnkpage1freepickmodalwindowreviewcart;
    }

    public List<WebElement> sizepage2freepickmodalwindowreviewcart() {
        return sizepage2freepickmodalwindowreviewcart;
    }

    public WebElement getlnkpage2freepickmodalwindowreviewcart() {
        return lnkpage2freepickmodalwindowreviewcart;
    }

    public List<WebElement> sizepage3freepickmodalwindowreviewcart() {
        return sizepage3freepickmodalwindowreviewcart;
    }

    public WebElement getlnkpage3freepickmodalwindowreviewcart() {
        return lnkpage3freepickmodalwindowreviewcart;
    }

    public WebElement gettablefreepickmodalwindowreviewcart() {
        return tablefreepickmodalwindowreviewcart;
    }

    public List<WebElement> sizeresultsizefreepickmodalwindowreviewcart() {
        return sizeresultsizefreepickmodalwindowreviewcart;
    }

    public List<WebElement> sizelstgradenamesmodalwindowdropdown() {
        return lstgradenamesmodalwindowdropdown;
    }

    public List<WebElement> coupon_list_ReviewCart() {
        return coupon_list_ReviewCart;
    }

    public List<WebElement> sizebtnremovefreepickcouponreviewcart() {
        return sizebtnremovefreepickcouponreviewcart;
    }

    public WebElement getbtnremovefreepickcouponreviewcart() {
        return btnremovefreepickcouponreviewcart;
    }

    public List<WebElement> sizedrpdownchildname1reviewcart() {
        return sizedrpdownchildname1reviewcart;
    }

    public WebElement getdrpdownchildname1reviewcart() {
        return drpdownchildname1reviewcart;
    }
    
    public WebElement getdrpdownchild1namereviewcart() {
        return drpdownchild1namereviewcart;
    }

    public List<WebElement> sizedrpdownchildname2reviewcart() {
        return sizedrpdownchildname2reviewcart;
    }

    public WebElement getdrpdownchildname2reviewcart() {
        return drpdownchildname2reviewcart;
    }
    
    public WebElement getdrpdownchild2namereviewcart() {
        return drpdownchild2namereviewcart;
    }

    public List<WebElement> sizedrpdownchildname3reviewcart() {
        return sizedrpdownchildname3reviewcart;
    }

    public List<WebElement> sizedrpdownchildname4reviewcart() {
        return sizedrpdownchildname4reviewcart;
    }

    public WebElement getdrpdownchildname3reviewcart() {
        return drpdownchildname3reviewcart;
    }

    public WebElement getdrpdownchildname4reviewcart() {
        return drpdownchildname4reviewcart;
    }

    public WebElement getdrpdwnchildname1reviewcart() {
        return drpdwnchildname1reviewcart;
    }

    public WebElement getdrpdwnchildname2reviewcart() {
        return drpdwnchildname2reviewcart;
    }

    public WebElement getdrpdwnchildname3reviewcart() {
        return drpdwnchildname3reviewcart;
    }

    public WebElement getdrpdwnchildname4reviewcart() {
        return drpdwnchildname4reviewcart;
    }

    public WebElement getlnkscholasticcapcodfooter() {
        return lnkscholasticcapcodfooter;
    }

    public WebElement getlnkaboutscholasticpcodfooter() {
        return lnkaboutscholasticpcodfooter;
    }

    public WebElement getlnkcareerspcodfooter() {
        return lnkcareerspcodfooter;
    }

    public WebElement getlnkinternationalpcodfooter() {
        return lnkinternationalpcodfooter;
    }

    public WebElement getlnkprivacypolicypcodfooter() {
        return lnkprivacypolicypcodfooter;
    }

    public WebElement getlnktermsofusepcodfooter() {
        return lnktermsofusepcodfooter;
    }

    public WebElement getlnkwebprivacypolicypcodfooter(){
        return lnkwebprivacypolicypcodfooter;
    }

    public List<WebElement> sizetablesizereviewcart(){
        return sizetablesizereviewcart;

    }

    public List<WebElement> sizetablerowsizereviewcart(){
        return sizetablerowsizereviewcart;
    }

    public List<WebElement> tableMakeyourSelection(){
        return sizetableMakeyourSelection;
    }
    
    
    public List<WebElement> reviewcartitemdeleteconfirm(){
        return reviewcartitemdeleteconfirm;
    }

    public WebElement getreviewcartitemqty() {
        return reviewcartitemqty;
    }

    public WebElement getreviewcart_buttonContinueChkout() {
        return reviewcart_buttonChkOut;
    }

    public WebElement getclickminus_qty() {
        return clickminus_qty;
    }

    public WebElement getitem1imagereviewcart(){
        return item1imagereviewcart;
    }

    public WebElement getitem2imagereviewcart(){
        return item2imagereviewcart;
    }

    public WebElement getitem3imagereviewcart(){
        return item3imagereviewcart;
    }

    public WebElement getitem4imagereviewcart(){
        return item4imagereviewcart;
    }

    public WebElement getitem1detailsreviewcart(){
        return item1detailsreviewcart;
    }

    public WebElement getitem2detailsreviewcart(){
        return item2detailsreviewcart;
    }

    public WebElement getitem3detailsreviewcart(){
        return item3detailsreviewcart;
    }

    public WebElement getitem4detailsreviewcart(){
        return item4detailsreviewcart;
    }

    public WebElement getitem1qtyreviewcart(){
        return item1qtyreviewcart;
    }

    public WebElement getitem2qtyreviewcart(){
        return item2qtyreviewcart;
    }

    public WebElement getitem3qtyreviewcart(){
        return item3qtyreviewcart;
    }

    public WebElement getitem4qtyreviewcart(){
        return item4qtyreviewcart;
    }

    public WebElement getitem1totalreviewcart(){
        return item1totalreviewcart;
    }

    public WebElement getitem2totalreviewcart(){
        return item2totalreviewcart;
    }

    public WebElement getitem3totalreviewcart(){
        return item3totalreviewcart;
    }

    public WebElement getitem4totalreviewcart(){
        return item4totalreviewcart;
    }

    public WebElement getfreeItem_Title_EditFreePickWindow(){
        return freeItem_Title_EditFreePickWindow;
    }

    public WebElement get_pcod_reviewcart_addchild_section(){
        return pcod_reviewcart_addchild_section;
    }

    public WebElement getpcod_reviewcart_drpdown_Addchild_Select(){
        return pcod_reviewcart_drpdown_Addchild_Select;
    }






//#######################################################################################################	
//#########################      METHODS              ###################################################	
//#######################################################################################################


    @Override
    public void verify_item1_totalprice_reviewcartpage() {

        double exp_item1price = reviewcart_item1_totalprice(getlblitem1totalpricereviewcartpage());
        double act_item1price = reviewcart_item1_price(stud_page.cart_qty_item1(),
                getlblitem1unitpricereviewcartpage());
        Assert.assertEquals(exp_item1price, act_item1price, "Total Item Price is not matching in Review Cart Page");


    }


    @Override
    public void verify_item1_ordertotal_reviewcartpage(){

        double exp_item1_ordertotal = reviewcart_item1_price(stud_page.cart_qty_item1(),getlblitem1unitpricereviewcartpage());
/*double exp_item1_ordertotal = reviewcart_item1_totalprice(getlblitem1totalpricereviewcartpage()) + 
reviewcart_item1_price(stud_page.cart_qty_item1(),getlblitem1unitpricereviewcartpage());*/
        double act_item1_ordertotal = reviewcart_item1_ordertotal(getlblordertotalreviewcartpage());
        Assert.assertEquals(exp_item1_ordertotal, act_item1_ordertotal, "Order Total is not matching in Review Cart Page");

    }


    @Override
    public void verify_item1_totalitems_reviewcartpage(){

        int exp_item1_totalitems1 = get_item1_quantity_reviewcart(stud_page.cart_qty_item1());
        int act_item1_totalitems1 = reviewcart_item1_totalitems(getlbltotalitemsqtyreviewcartpage());
        Assert.assertEquals(exp_item1_totalitems1, act_item1_totalitems1, "Total items is not matching in Review Cart Page");

    }



/*@Override
public void verify_item2_ordertotal_reviewcartpage(){
	
	
	
}*/




    public double reviewcart_item1_totalprice(WebElement element)
    {
        String item1totalprice1= element.getText();
        String item1totalprice2 = item1totalprice1.substring(1);
        double item1totalprice=Double.parseDouble(item1totalprice2);
        System.out.println("Item1 total price is:###########" + item1totalprice);
        return item1totalprice;
    }

    public double reviewcart_item1_ordertotal(WebElement element)
    {
        String item1ordertotal1= element.getText();
        String item1ordertotal2 = item1ordertotal1.substring(1);
        double item1ordertotal=Double.parseDouble(item1ordertotal2);
        System.out.println(" Order total for item1 is:###########" + item1ordertotal);
        return item1ordertotal;
    }


    public int reviewcart_item1_totalitems(WebElement element)
    {
        String item1totalitems1= element.getText();
        //String item1totalitems2 = item1totalitems1.substring(1);
        int item1totalitems=Integer.parseInt(item1totalitems1);
        System.out.println("TotalItems for item1 is:###########" + item1totalitems);
        return item1totalitems;
    }


    public double reviewcart_item1_price(WebElement element1, WebElement element2)
    {
        String item1qty1= element1.getAttribute("value");
        double item1qty = Double.parseDouble(item1qty1);

        String item1unitprice1= element2.getText();
        String item1unitprice2 = item1unitprice1.substring(1);
        double item1unitprice=Double.parseDouble(item1unitprice2);

        double itemprice = item1qty*item1unitprice;
        System.out.println("Item1 price is:" +itemprice);

        return itemprice;
    }


    public int get_item1_quantity_reviewcart(WebElement element)
    {
        String item1qty1= element.getAttribute("value");
        int item1qty = Integer.parseInt(item1qty1);
        return item1qty;

    }



    @Override
    public void edit_item_qty1_clickoutside_in_reviewcartPage(String value) {
    	PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
        stud_page.cart_qty_item1().click();
        stud_page.cart_qty_item1().clear();
        PauseUtil.pause(2000);
        stud_page.cart_qty_item1().sendKeys(value);
        PauseUtil.pause(1500);
        getlblitem1unitpricereviewcartpage().click();
        PauseUtil.pause(15000);
    }


    @Override
    public void click_paginationlinks_freepick_modalwindow() {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        if(sizepage1freepickmodalwindowreviewcart().size()!=0){
            getlnkpage1freepickmodalwindowreviewcart().click();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(2500);
            int resultsizepage1 = sizeresultsizefreepickmodalwindowreviewcart().size();
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.freepick.resultsize.page1", resultsizepage1);
        }

        if(sizepage2freepickmodalwindowreviewcart().size()!=0){
            getlnkpage2freepickmodalwindowreviewcart().click();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(2500);
            int resultsizepage2 = sizeresultsizefreepickmodalwindowreviewcart().size();
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.freepick.resultsize.page2", resultsizepage2);
        }

        if(sizepage3freepickmodalwindowreviewcart().size()!=0){
            getlnkpage3freepickmodalwindowreviewcart().click();
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(2500);
            int resultsizepage3 = sizeresultsizefreepickmodalwindowreviewcart().size();
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.freepick.resultsize.page3", resultsizepage3);
        }


    }


    @Override
    public void result_paginationlinks_freepick_modalwindow(String actualresult) {
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);

        int exp_result = Integer.parseInt(actualresult);

        String resultsizepage11 = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.freepick.resultsize.page1").toString();
        int resultsizepage1 = Integer.parseInt(resultsizepage11);

        String resultsizepage12 = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.freepick.resultsize.page2").toString();
        int resultsizepage2 = Integer.parseInt(resultsizepage12);
        String resultsizepage13 = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.freepick.resultsize.page3").toString();
        int resultsizepage3 = Integer.parseInt(resultsizepage13);


        Assert.assertEquals(resultsizepage1, exp_result, "10 results are not displayed in page");

        Assert.assertEquals(resultsizepage2, exp_result, "10 results are not displayed in page");

        Assert.assertEquals(resultsizepage3, exp_result, "10 results are not displayed in page");

    }

@Override
 public void Verify_defaultchildnames_FreePick_items_reviewcart(){

        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        String exp_defaultChild = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.parenthomepage.defaultchild").toString();


        List<WebElement> tableReviewcart = sizetablerowsizereviewcart() ;
        for(WebElement tabletr:tableReviewcart){
            List<WebElement> tdtable = tabletr.findElements(By.tagName("td"));
            String val = tdtable.get(4).getText();
            if(val.contains("FREEPICK")){
                String act_defaultChild = tdtable.get(2).findElement(By.className("selected-option")).getText();
                System.out.println("child name is:"+act_defaultChild);
                if(!act_defaultChild.contains(exp_defaultChild)){
                    Assert.fail("Default child is not present in Free Pick item by default");
                }
            }
        }
    }


@Override
public void verify_freepick_itemdetails_reviewcartpage(){
	
	PauseUtil.waitForAjaxToComplete(2500);
    PauseUtil.pause(2500);
    String exp_defaultChild = TestBaseProvider.getTestBase().getContext().
    		getProperty("testexecution.parenthomepage.defaultchild").toString();
    
    
    List<WebElement> tableReviewcart = sizetablerowsizereviewcart() ;
    for(WebElement tabletr:tableReviewcart){
        List<WebElement> tdtable = tabletr.findElements(By.tagName("td"));
        String val = tdtable.get(4).getText();
            if(val.contains("FREEPICK")){
                String act_itemname   = tdtable.get(1).findElement(By.className("name")).getText();
                String act_itemqty    = tdtable.get(3).findElement(By.tagName("span")).getText();
                String act_itemvalue  = tdtable.get(4).findElement(By.className("value")).getText();
                
                String exp_itemname = TestBaseProvider.getTestBase().getContext().getProperty(
		    			"testexecution.selectedtitle").toString();
                String exp_itemqty = "1";
                String exp_itemprice = "FREE";
                
                Assert.assertEquals(act_itemname, exp_itemname,"Freepick item title is incorrect");
                Assert.assertEquals(act_itemqty, exp_itemqty,"Freepick item qty is incorrect");
                Assert.assertEquals(act_itemvalue, exp_itemprice,"Freepick item value is incorrect");
                
                String itemalldetails = tdtable.get(1).getText();
                System.out.println("item details"+tdtable.get(1).getText().trim());
                
                
                if(!itemalldetails.contains(TestBaseProvider.getTestBase().getTestData().getString("freepick_grade"))){
                	Assert.fail("Freepick item's grade is not correct");
                }
                if(!itemalldetails.contains(TestBaseProvider.getTestBase().getTestData().getString("freepick_age"))){
                	Assert.fail("Freepick item's grade is not correct");
                }
                if(!itemalldetails.contains(TestBaseProvider.getTestBase().getTestData().getString("freepick_readinglevel"))){
                	Assert.fail("Freepick item's grade is not correct");
                }

            }
    }	
	
}



@Override
public void verify_freepick_itemelements_reviewcartpage(){
	
	PauseUtil.waitForAjaxToComplete(2500);
    PauseUtil.pause(2500);
    String exp_defaultChild = TestBaseProvider.getTestBase().getContext().
    		getProperty("testexecution.parenthomepage.defaultchild").toString();
    
    
    List<WebElement> tableReviewcart = sizetablerowsizereviewcart() ;
    for(WebElement tabletr:tableReviewcart){
        List<WebElement> tdtable = tabletr.findElements(By.tagName("td"));
        String val = tdtable.get(4).getText();
            if(val.contains("FREEPICK")){
                String item_free            = tdtable.get(1).getText();
                String act_child12          = tdtable.get(2).findElement(By.className("selected-option")).getText();
                String[] act_child1         = act_child12.split(" ", 2);
                String act_child            = act_child1[0];
                
                String act_itemqty        = tdtable.get(3).findElement(By.tagName("span")).getText();
                String itemqty_disabled  = tdtable.get(3).findElement(By.tagName("span")).getAttribute("value");
                String itemqty_delete     = tdtable.get(3).findElement(By.className("remove")).getText();
                String item_coupon        = tdtable.get(4).getText();
                
                String exp_child = TestBaseProvider.getTestBase().getContext().getProperty(
		    			"testexecution.parenthomepage.defaultchild").toString();
                String exp_itemqty = "1";
               
                Assert.assertEquals(act_child, exp_child,"Freepick item default child is incorrect");
                Assert.assertEquals(act_itemqty, exp_itemqty,"Free item quantity is incorrect");
                
                
                if(itemqty_disabled!=null){
                	Assert.fail("Freeitem quantity field is enabled");
                }
                
                if(!item_free.contains("FREE")){
                	Assert.fail("FREE is not displayed in item details for freepick item");
                }
                
                if(!itemqty_delete.equals("Delete")){
                	Assert.fail("Delete option for Freepick item is not present");
                }
                if(!item_coupon.contains(TestBaseProvider.getTestBase().getTestData().getString("couponcode"))){
                	Assert.fail("Coupon code is not displaying for Freepick item");
                }
                
                if(!item_coupon.contains("FREE")){
                	Assert.fail("Freepick item total is not displaying as FREE");
                }
                
                if(!item_coupon.contains("Edit")){
                	Assert.fail("Edit link is not present beside freepick coupon");
                }
                
                
            }
    }	
	
}


@Override
public void verify_freepick_items_reviewcart(){
	
	 PauseUtil.waitForAjaxToComplete(2500);
	    PauseUtil.pause(2500);
	    Boolean found =false;  
	    List<WebElement> tableReviewcart = sizetablerowsizereviewcart() ;
        for(WebElement tabletr:tableReviewcart){
            List<WebElement> tdtable = tabletr.findElements(By.tagName("td"));
            String val = tdtable.get(4).getText();
                if(val.contains("FREEPICK")){
                	 found=true;
                	 break;
                }
                }
        
        if(!found){
        	Assert.fail("Freepick item is not present");
        }
}


@Override
public void ReassignChild1_FreePick_items_reviewcart(){
	
	 PauseUtil.waitForAjaxToComplete(2500);
	    PauseUtil.pause(2500);
	    
	    
	    List<WebElement> tableReviewcart = sizetablerowsizereviewcart() ;
        for(WebElement tabletr:tableReviewcart){
            List<WebElement> tdtable = tabletr.findElements(By.tagName("td"));
            String val = tdtable.get(4).getText();
                if(val.contains("FREEPICK")){
                    //String act_defaultChild = tdtable.get(2).findElement(By.tagName("selected-option")).getText();
                	tdtable.get(2).findElement(By.className("selected-option")).click();
                	SCHUtils.selectOptionByVisibleText(tdtable.get(2).findElement(By.tagName("select")),(ConstantUtils.REVIEWCARTCHILD1));
                	PauseUtil.pause(1500);
                	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild", String.valueOf
                	        (tdtable.get(2).findElement(By.className("selected-option")).getText()));
                    
                }
}
}






    @Override
    public void verify_Teacher_catalogue_is_not_displayed_in_Modal_window_dropDown() {
        PauseUtil.waitForAjaxToComplete(2000);
        PauseUtil.pause(5000);
        List<WebElement> names = sizelstgradenamesmodalwindowdropdown();

        int value=names.size();
        System.out.println("list size is: "+ value);

        String TeacherCat="teachercatalogues";
        WebDriver driver=TestBaseProvider.getTestBase().getDriver();
        for (int i=1; i<value; i++) {

            String path="(//ul[@class='content-scrollbar'])[2]/li["+i+"]";

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
    public void Verify_defaultChild_items_reviewcart(List<WebElement> elementsize, WebElement element){

        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        String exp_defaultChild = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.parenthomepage.defaultchild").toString();
        if(elementsize.size()!=0){
            String act_defaultChild = element.getText();
            if(!act_defaultChild.contains(exp_defaultChild)){
                Assert.fail("Default child is not present in Free Pick item by default");
            }
        }
    }




    @Override
    public void ReassignChild2_FreePick_items_reviewcart(){

        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);


        List<WebElement> tableReviewcart = sizetablerowsizereviewcart() ;
        for(WebElement tabletr:tableReviewcart){
            List<WebElement> tdtable = tabletr.findElements(By.tagName("td"));
            String val = tdtable.get(4).getText();
            if(val.contains("FREEPICK")){
                //String act_defaultChild = tdtable.get(2).findElement(By.tagName("selected-option")).getText();
                tdtable.get(2).findElement(By.className("selected-option")).click();
                SCHUtils.selectOptionByVisibleText(tdtable.get(2).findElement(By.tagName("select")),(ConstantUtils.REVIEWCARTCHILD2));
                PauseUtil.pause(1500);
                TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild", String.valueOf
                        (tdtable.get(2).findElement(By.className("selected-option")).getText()));

            }
        }
    }

    
    @Override
    public void verify_FREEPICKRemoved_whenItemsDeleted(){
    	int tablesize = sizetablerowsizereviewcart().size();
    	if(tablesize!=0){
    		List<WebElement> tableReviewcart = gettableReviewCartwithCoupon() ;
            for(WebElement tabletr:tableReviewcart){
                List<WebElement> tdtable = tabletr.findElements(By.tagName("td"));
                String val = tdtable.get(4).getText();
                if(val.contains("FREEPICK")){
                    Assert.fail("FREEPICK coupon is not deleted");
                }

            }
    	}
    	else if(tablesize==0){
    		if(tablesize!=0){
    			Assert.fail("Free Item is not deleted when items are deleted");
    		}
    	}
    	
    }




    @Override
    public void Verify_reassignedChild_items_reviewcart(WebElement element){

        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        String exp_reassignedChild = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.parenthomepage.reassignedchild").toString();
        String act_reassignedChild = element.getText();
        if(!act_reassignedChild.contains(exp_reassignedChild)){
            Assert.fail("Reassigned child is not present in Free Pick item");


        }
    }



    @Override
    public void Verify_reassigned_childnames_FreePick_items_reviewcart(){

        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        String exp_defaultChild = TestBaseProvider.getTestBase().getContext().
                getProperty("testexecution.parenthomepage.reassignedchild").toString();


        List<WebElement> tableReviewcart = sizetablesizereviewcart() ;
        for(WebElement tabletr:tableReviewcart){
            List<WebElement> tdtable = tabletr.findElements(By.tagName("td"));
            String val = tdtable.get(4).getText();
            if(val.contains("FREEPICK")){
                String act_defaultChild = tdtable.get(2).findElement(By.tagName("selected-option")).getText();
                System.out.println("child name is:"+act_defaultChild);
                if(!act_defaultChild.contains(exp_defaultChild)){
                    Assert.fail("Default child is not present in Free Pick item by default");
                }
            }
        }
    }

    @Override
    public void clickNOdeletecouponModal() {
                    getbuttonDeletePopupNO().click();


    }

    @Override
    public void frepickItemnotremoved() {
        List<WebElement> tableReviewcart = gettableReviewCartwithCoupon();
        //System.out.println("totalrow"+tableReviewcart.size());
        for (WebElement tabletr : tableReviewcart) {
            List<WebElement> tdtable = tabletr.findElements(By.tagName("td"));
            String val = tdtable.get(4).getText();
            // System.out.println("val from celc"+val);
            if (val.contains("FREEPICK")) {
                //System.out.println("SSSSS"+val);
                String fitem = tdtable.get(1).getText();
                System.out.println("FreeItem Book is " + fitem);
                if (fitem.equals(null)) {
                    Assert.fail("FreeItem is removed");
                }
            }
        }
    }

    @Override
    public void verify_freepickItemdeleted() {
        WebDriver driver = TestBaseProvider.getTestBase().getDriver();
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='sec-review-order cart-table-content']/div/table/tbody/tr")));
        List<WebElement> tableReviewcart = gettableReviewCartwithCoupon() ;
        //System.out.println("totalrow"+tableReviewcart.size());
        for(WebElement tabletr:tableReviewcart){
            List<WebElement> tdtable = tabletr.findElements(By.tagName("td"));
            String val = tdtable.get(4).getText();
            // System.out.println("val from celc"+val);
            if(val.contains("FREEPICK")){
                Assert.fail("FREEPICK coupon is not deleted");
            }

        }
    }

    @Override
    public void verify_freeItemRemoved() {

            List<WebElement> tableReviewcart = gettableReviewCartwithCoupon() ;
            for(WebElement tabletr:tableReviewcart){
                List<WebElement> tdtable = tabletr.findElements(By.tagName("td"));
                String val = tdtable.get(1).getText();
                System.out.println("val from Free Item"+val);
                if(val.contains("FREE")){
                    Assert.fail("Free Item is not removed");
                }

            }
        }


    @Override
    public void verify_childs_childdropdown_reviewcart(WebElement dropdown){
        WebDriver driver=TestBaseProvider.getTestBase().getDriver();
        WebElement ele = driver.findElement(By.xpath("//*[@id='cart-items-form']/div/div/table/tbody/tr/td[3]/div/div[1]"));

        if(!ele.getText().equals(ConstantUtils.CHILD3NAMES)){
            Assert.fail("Child names not present in dropdown i.e. "+ConstantUtils.CHILD3NAMES);

        }

        for(int i=2;i<=3;i++){
            String path="//div[@class='selection-list visible']/div/ul/li["+i+"]/span";
            String el1 = driver.findElement(By.xpath(path)).getText().trim();
            System.out.println("options are:"+el1 +   "childs actual"+ConstantUtils.CHILDNAMES[i-2]);


            if(!el1.equals(ConstantUtils.CHILDNAMES[i-2])){
                Assert.fail("Child names not present in dropdown i.e. "+ConstantUtils.CHILDNAMES[i-2]);
            }
        }
    }



    @Override
    public void navigate_from_shoppingcart_to_submitorderpage(){

        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        getbtnproceedtocheckoutreviewcart().click();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        PauseUtil.pause(3000);
        //save the data present in payment page
        String shippingsection =  pcod_shippage.getsectionshippingpaymentpage().getText();
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.shippingandpayment.shippingsection.info", shippingsection);

        String paymentsection =  pcod_shippage.getsectionpaymentpaymentpage().getText();
        TestBaseProvider.getTestBase().getContext()
                .setProperty("testexecution.shippingandpayment.paymentsection.info", paymentsection);
        //#####################
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());
        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CREDITCARD);
        PauseUtil.pause(3000);
        WaitUtils.waitForEnabled(shippingAndPaymentPage.drpSelectaCard());
        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.drpSelectaCard(),
                ConstantUtils.CCVISCARD);
        PauseUtil.pause(3000);

        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
        SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);

    }

    @Override
    public void remove_FREEPICK_coupon() {

        List<WebElement> tableReviewcart = gettableReviewCartwithCoupon();
        //System.out.println("totalrow"+tableReviewcart.size());
        for (WebElement tabletr : tableReviewcart) {
            List<WebElement> tdtable = tabletr.findElements(By.tagName("td"));
            String val = tdtable.get(4).getText();
            // System.out.println("val from celc"+val);
            if (val.contains("FREEPICK")) {
                //System.out.println("SSSSS"+val);
                tdtable.get(3).findElement(By.linkText("Delete")).click();
            }
        }
    }

    @Override
    public void verify_MakeSelection_Modal_FreePick() {
        List<WebElement> popup = sizetablerowsizereviewcart();
        if(sizetablerowsizereviewcart().size()!=0)
        {
            veirfy_editFreePick_itemselected();
        }else{
            Assert.fail("Make Selection Window is not displayed");
        }

    }

    @Override
    public void verifyItem_editFreePick_shoppingCart() {
        String ItemTitle = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.selectedtitle").toString();
        String Screenval="";
        System.out.println("TestingValue Set value"+ItemTitle);
        List<WebElement> tableReviewcart = gettableReviewCartwithCoupon();
        //System.out.println("totalrow"+tableReviewcart.size());
        for (WebElement tabletr : tableReviewcart) {
            List<WebElement> tdtable = tabletr.findElements(By.tagName("td"));
            String val = tdtable.get(4).getText();
            // System.out.println("val from celc"+val);
            if (val.contains("FREEPICK")) {
                //System.out.println("SSSSS"+val);
                 Screenval = tdtable.get(1).getText();


            }

        }
        System.out.println("Screen Val before Assert"+Screenval);
        if(!Screenval.contains(ItemTitle)){
            Assert.fail("Message item not Updated");
        }

    }

    @Override
    public void deleteFreeitem_FreePick() {
        freeitemselectedToDelete.click();
    }

    @Override
    public void click_Cancel_FreePick_CurrentSelection() {

        getbuttonCancelFreepickEditModal().click();
    }

    @Override
    public void veirfy_editFreePick_itemselected() {

        String editFreePickvalue = freeItem_Title_EditFreePickWindow.getText();
        String ItemTitle = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.selectedtitle").toString();
        System.out.println("value from getter"+ItemTitle);
        System.out.println("value from application"+editFreePickvalue);
        Assert.assertEquals(editFreePickvalue,ItemTitle);

    }

    @Override
    public void editFreePick_selectGrade() {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(5000);
        PauseUtil.pause(6000);
        WaitUtils.waitForEnabled(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards());
        SCHUtils.selectOptionsByVisibleText(checkoutPage.Selection_Grade_level_inPopUp_Coupons_Rewards(),
                TestBaseProvider.getTestBase().getTestData().getString("newgrade"));
        PauseUtil.pause(5000);
    }

    @Override
    public void editFreePick_selectItem() {
        ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
        PauseUtil.waitForAjaxToComplete(1500);
        checkoutPage.MakeSelectionWindow_SelectItemFreePick();
    }



    public void readalldata_iteminformation_reviewcart(){

        List<WebElement> items_rows = sizetablerowsizereviewcart();



        if(items_rows.size()==4){

            String item4image   = getitem4imagereviewcart().getAttribute("alt");
            String item4details = getitem4detailsreviewcart().getText();
            String item4qty     = getitem4qtyreviewcart().getAttribute("value");
            String item4total   = getitem4totalreviewcart().getText();

            String item3image   = getitem3imagereviewcart().getAttribute("alt");
            String item3details = getitem3detailsreviewcart().getText();
            String item3qty     = getitem3qtyreviewcart().getAttribute("value");
            String item3total   = getitem3totalreviewcart().getText();

            String item2image   = getitem2imagereviewcart().getAttribute("alt");
            String item2details = getitem2detailsreviewcart().getText();
            String item2qty     = getitem2qtyreviewcart().getAttribute("value");
            String item2total   = getitem2totalreviewcart().getText();

            String item1image   = getitem1imagereviewcart().getAttribute("alt");
            String item1details = getitem1detailsreviewcart().getText();
            String item1qty     = getitem1qtyreviewcart().getAttribute("value");
            String item1total   = getitem1totalreviewcart().getText();

            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item4.img", item4image);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item4.details", item4details);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item4.qty", item4qty);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item4.total", item4total);

            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item3.img", item3image);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item3.details", item3details);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item3.qty", item3qty);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item3.total", item3total);

            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item2.img", item2image);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item2.details", item2details);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item2.qty", item2qty);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item2.total", item2total);

            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item1.img", item1image);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item1.details", item1details);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item1.qty", item1qty);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item1.total", item1total);

        }

        else if(items_rows.size()==3){


            String item3image   = getitem3imagereviewcart().getAttribute("alt");
            String item3details = getitem3detailsreviewcart().getText();
            String item3qty     = getitem3qtyreviewcart().getAttribute("value");
            String item3total   = getitem3totalreviewcart().getText();

            String item2image   = getitem2imagereviewcart().getAttribute("alt");
            String item2details = getitem2detailsreviewcart().getText();
            String item2qty     = getitem2qtyreviewcart().getAttribute("value");
            String item2total   = getitem2totalreviewcart().getText();

            String item1image   = getitem1imagereviewcart().getAttribute("alt");
            String item1details = getitem1detailsreviewcart().getText();
            String item1qty     = getitem1qtyreviewcart().getAttribute("value");
            String item1total   = getitem1totalreviewcart().getText();


            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item3.img", item3image);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item3.details", item3details);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item3.qty", item3qty);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item3.total", item3total);

            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item2.img", item2image);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item2.details", item2details);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item2.qty", item2qty);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item2.total", item2total);

            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item1.img", item1image);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item1.details", item1details);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item1.qty", item1qty);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item1.total", item1total);

        }


        if(items_rows.size()==2){

            String item2image   = getitem2imagereviewcart().getAttribute("alt");
            String item2details = getitem2detailsreviewcart().getText();
            String item2qty     = getitem2qtyreviewcart().getAttribute("value");
            String item2total   = getitem2totalreviewcart().getText();

            String item1image   = getitem1imagereviewcart().getAttribute("alt");
            String item1details = getitem1detailsreviewcart().getText();
            String item1qty     = getitem1qtyreviewcart().getAttribute("value");
            String item1total   = getitem1totalreviewcart().getText();


            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item2.img", item2image);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item2.details", item2details);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item2.qty", item2qty);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item2.total", item2total);

            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item1.img", item1image);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item1.details", item1details);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item1.qty", item1qty);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item1.total", item1total);

        }

        else if(items_rows.size()==1){

            String item1image   = getitem1imagereviewcart().getAttribute("alt");
            String item1details = getitem1detailsreviewcart().getText();
            String item1qty     = getitem1qtyreviewcart().getAttribute("value");
            String item1total   = getitem1totalreviewcart().getText();

            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item1.img", item1image);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item1.details", item1details);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item1.qty", item1qty);
            TestBaseProvider.getTestBase().getContext()
                    .setProperty("testexecution.reviewcart.item1.total", item1total);

        }



	
	 
	/*List<WebElement> TotalRowCount=items_table.findElements(By.tagName("tr"));
	System.out.println("No. of Rows in the WebTable: "+TotalRowCount.size());
	// Now we will Iterate the Table and print the Values   
	int RowIndex=1;
	// declare obj of setter/getter class
	// array [name,naumber,]
	for(WebElement rowElement:TotalRowCount)
	{
	List<WebElement> TotalColumnCount=rowElement.findElements(By.xpath("td"));
	int ColumnIndex=1;
	for(WebElement colElement:TotalColumnCount)
	{
	System.out.println("Row "+RowIndex+" Column "+ColumnIndex+" Data "+colElement.getText());
	ColumnIndex=ColumnIndex+1;
	//obj[array[i]] = 
	}
	RowIndex=RowIndex+1;
	}*/
    }




    @Override
    public void calculate_items_taxes_shoppingcart(List<WebElement> item1size, WebElement item1,WebElement qty1,
                                                   List<WebElement> item2size, WebElement item2,WebElement qty2, List<WebElement> item3size, WebElement item3,WebElement qty3,
                                                   List<WebElement> item4size, WebElement item4, WebElement qty4){


        String province_tax = TestBaseProvider.getTestBase().getTestData().getString("tax_province");

        int stateTax=TestBaseProvider.getTestBase().getTestData().getInt("tax");
        int stateTax2=TestBaseProvider.getTestBase().getTestData().getInt("tax2");
        int state_notax=TestBaseProvider.getTestBase().getTestData().getInt("state_notax");



        if(province_tax.equals("GST")){
            //verifying tax for GST if there are 4 items in payment page
            if(item4size.size()!=0){


                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                String value3=item3.getText();
                value3=value3.trim();
                String ele3=qty3.getAttribute("value");
                ele3=ele3.trim();
                value3 = value3.substring(1);
                double d3=Double.parseDouble(value3);
                System.out.println("#############>"+d3);
                int a3=Integer.parseInt(ele3);
                System.out.println("%%%%%%%%%%%%>"+a3);

                String value4=item4.getText();
                value4=value4.trim();
                String ele4=qty4.getAttribute("value");
                ele4=ele4.trim();
                value4 = value4.substring(1);
                double d4=Double.parseDouble(value4);
                System.out.println("#############>"+d4);
                int a4=Integer.parseInt(ele4);
                System.out.println("%%%%%%%%%%%%>"+a4);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2)+
                        stud_page.TaxRoundOff_item_3_Tax(stateTax, d3, a3) + stud_page.TaxRoundOff_item_4_Tax(stateTax, d4, a4);
                tax1_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax1_exp));

                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.items.taxes", tax1_exp);



            }



            //verifying tax for GST if there are 3 items in payment page
            else if(item3size.size()!=0){

                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                String value3=item3.getText();
                value3=value3.trim();
                String ele3=qty3.getAttribute("value");
                ele3=ele3.trim();
                value3 = value3.substring(1);
                double d3=Double.parseDouble(value3);
                System.out.println("#############>"+d3);
                int a3=Integer.parseInt(ele3);
                System.out.println("%%%%%%%%%%%%>"+a3);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2)+
                        stud_page.TaxRoundOff_item_3_Tax(stateTax, d3, a3);
                tax1_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax1_exp));

                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.items.taxes", tax1_exp);
            }


            //verifying tax for GST if there are 2 items in payment page
            else if(item2size.size()!=0){

                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2);
                tax1_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax1_exp));

                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.items.taxes", tax1_exp);
            }

            //verifying tax for GST if there are 1 item in payment page
            else if(item1size.size()!=0){

                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1);
                tax1_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax1_exp));

                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.items.taxes", tax1_exp);
            }



        }




        else if(province_tax.equals("GSTPST")){

            //verifying tax for GSTand PST if there are 4 items in payment page
            System.out.println("Entered to GSTPST--------------------->>>>>>>>>>>>>>>>>>>>>>>");
            if(item4size.size()!=0){

                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                String value3=item3.getText();
                value3=value3.trim();
                String ele3=qty3.getAttribute("value");
                ele3=ele3.trim();
                value3 = value3.substring(1);
                double d3=Double.parseDouble(value3);
                System.out.println("#############>"+d3);
                int a3=Integer.parseInt(ele3);
                System.out.println("%%%%%%%%%%%%>"+a3);

                String value4=item4.getText();
                value4=value4.trim();
                String ele4=qty4.getAttribute("value");
                ele4=ele4.trim();
                value4 = value4.substring(1);
                double d4=Double.parseDouble(value4);
                System.out.println("#############>"+d4);
                int a4=Integer.parseInt(ele4);
                System.out.println("%%%%%%%%%%%%>"+a4);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2)+
                        stud_page.TaxRoundOff_item_3_Tax(stateTax, d3, a3) + stud_page.TaxRoundOff_item_4_Tax(stateTax, d4, a4);

                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax2, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax2, d2, a2)+
                        stud_page.TaxRoundOff_item_3_Tax(stateTax2, d3, a3) + stud_page.TaxRoundOff_item_4_Tax(stateTax2, d4, a4);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.items.taxes", tax_exp);



            }



            //verifying tax for GSTand PST if there are 3 items in payment page
            else if(item3size.size()!=0){

                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                String value3=item3.getText();
                value3=value3.trim();
                String ele3=qty3.getAttribute("value");
                ele3=ele3.trim();
                value3 = value3.substring(1);
                double d3=Double.parseDouble(value3);
                System.out.println("#############>"+d3);
                int a3=Integer.parseInt(ele3);
                System.out.println("%%%%%%%%%%%%>"+a3);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2)+
                        stud_page.TaxRoundOff_item_3_Tax(stateTax, d3, a3);

                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax2, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax2, d2, a2)+
                        stud_page.TaxRoundOff_item_3_Tax(stateTax2, d3, a3);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.items.taxes", tax_exp);
            }


            //verifying tax for GSTand PST if there are 2 items in payment page
            else if(item2size.size()!=0){

                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2);

                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax2, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax2, d2, a2);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.items.taxes", tax_exp);
            }


            //verifying tax for GSTand PST if there is 1 item in payment page
            else if(item1size.size()!=0){

                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1);

                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax2, d1, a1);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.items.taxes", tax_exp);
            }


        }


        else if(province_tax.equals("GSTPST_Exempt")){

            //verifying tax for GSTand PST if there are 4 items in payment page
            System.out.println("Entered to GSTPST--------------------->>>>>>>>>>>>>>>>>>>>>>>");
            if(item4size.size()!=0){

                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                String value3=item3.getText();
                value3=value3.trim();
                String ele3=qty3.getAttribute("value");
                ele3=ele3.trim();
                value3 = value3.substring(1);
                double d3=Double.parseDouble(value3);
                System.out.println("#############>"+d3);
                int a3=Integer.parseInt(ele3);
                System.out.println("%%%%%%%%%%%%>"+a3);

                String value4=item4.getText();
                value4=value4.trim();
                String ele4=qty4.getAttribute("value");
                ele4=ele4.trim();
                value4 = value4.substring(1);
                double d4=Double.parseDouble(value4);
                System.out.println("#############>"+d4);
                int a4=Integer.parseInt(ele4);
                System.out.println("%%%%%%%%%%%%>"+a4);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2)+
                        stud_page.TaxRoundOff_item_3_Tax(stateTax, d3, a3) + stud_page.TaxRoundOff_item_4_Tax(stateTax, d4, a4);

                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(state_notax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(state_notax, d2, a2)+
                        stud_page.TaxRoundOff_item_3_Tax(state_notax, d3, a3) + stud_page.TaxRoundOff_item_4_Tax(state_notax, d4, a4);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.items.taxes", tax_exp);



            }



            //verifying tax for GSTand PST if there are 3 items in payment page
            else if(item3size.size()!=0){

                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                String value3=item3.getText();
                value3=value3.trim();
                String ele3=qty3.getAttribute("value");
                ele3=ele3.trim();
                value3 = value3.substring(1);
                double d3=Double.parseDouble(value3);
                System.out.println("#############>"+d3);
                int a3=Integer.parseInt(ele3);
                System.out.println("%%%%%%%%%%%%>"+a3);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2)+
                        stud_page.TaxRoundOff_item_3_Tax(stateTax, d3, a3);

                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(state_notax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(state_notax, d2, a2)+
                        stud_page.TaxRoundOff_item_3_Tax(state_notax, d3, a3);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.items.taxes", tax_exp);
            }


            //verifying tax for GSTand PST if there are 2 items in payment page
            else if(item2size.size()!=0){

                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2);

                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(state_notax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(state_notax, d2, a2);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.items.taxes", tax_exp);
            }


            //verifying tax for GSTand PST if there is 1 item in payment page
            else if(item1size.size()!=0){

                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1);

                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(state_notax, d1, a1);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.items.taxes", tax_exp);
            }


        }



        else if(province_tax.equals("GSTQST")){
            //verifying tax for GST and QST if there are 4 items in payment page
            if(item4size.size()!=0){
            	double stateTax2_qst=TestBaseProvider.getTestBase().getTestData().getDouble("tax_qst");

                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                String value3=item3.getText();
                value3=value3.trim();
                String ele3=qty3.getAttribute("value");
                ele3=ele3.trim();
                value3 = value3.substring(1);
                double d3=Double.parseDouble(value3);
                System.out.println("#############>"+d3);
                int a3=Integer.parseInt(ele3);
                System.out.println("%%%%%%%%%%%%>"+a3);

                String value4=item4.getText();
                value4=value4.trim();
                String ele4=qty4.getAttribute("value");
                ele4=ele4.trim();
                value4 = value4.substring(1);
                double d4=Double.parseDouble(value4);
                System.out.println("#############>"+d4);
                int a4=Integer.parseInt(ele4);
                System.out.println("%%%%%%%%%%%%>"+a4);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2)+
                        stud_page.TaxRoundOff_item_3_Tax(stateTax, d3, a3) + stud_page.TaxRoundOff_item_4_Tax(stateTax, d4, a4);

                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax2_qst, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax2_qst, d2, a2)+
                        stud_page.TaxRoundOff_item_3_Tax(stateTax2_qst, d3, a3) + stud_page.TaxRoundOff_item_4_Tax(stateTax2_qst, d4, a4);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.items.taxes", tax_exp);



            }



            //verifying tax for GST and QST if there are 3 items in payment page
            else if(item3size.size()!=0){
            	double stateTax2_qst=TestBaseProvider.getTestBase().getTestData().getDouble("tax_qst");

                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                String value3=item3.getText();
                value3=value3.trim();
                String ele3=qty3.getAttribute("value");
                ele3=ele3.trim();
                value3 = value3.substring(1);
                double d3=Double.parseDouble(value3);
                System.out.println("#############>"+d3);
                int a3=Integer.parseInt(ele3);
                System.out.println("%%%%%%%%%%%%>"+a3);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2)+
                        stud_page.TaxRoundOff_item_3_Tax(stateTax, d3, a3);

                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax2_qst, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax2_qst, d2, a2)+
                        stud_page.TaxRoundOff_item_3_Tax(stateTax2_qst, d3, a3);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.items.taxes", tax_exp);
            }


            //verifying tax for GST and QST if there are 2 items in payment page
            else if(item2size.size()!=0){
            	double stateTax2_qst=TestBaseProvider.getTestBase().getTestData().getDouble("tax_qst");
                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2);

                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax2_qst, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax2_qst, d2, a2);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.items.taxes", tax_exp);
            }


            //verifying tax for GST and QST if there is 1 item in payment page
            else if(item1size.size()!=0){
            	double stateTax2_qst=TestBaseProvider.getTestBase().getTestData().getDouble("tax_qst");
                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1);

                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax2_qst, d1, a1);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.items.taxes", tax_exp);
            }


        }


        else if(province_tax.equals("HST")){
            //verifying tax for HST if there are 4 items in payment page
            if(item4size.size()!=0){

                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                String value3=item3.getText();
                value3=value3.trim();
                String ele3=qty3.getAttribute("value");
                ele3=ele3.trim();
                value3 = value3.substring(1);
                double d3=Double.parseDouble(value3);
                System.out.println("#############>"+d3);
                int a3=Integer.parseInt(ele3);
                System.out.println("%%%%%%%%%%%%>"+a3);

                String value4=item4.getText();
                value4=value4.trim();
                String ele4=qty4.getAttribute("value");
                ele4=ele4.trim();
                value4 = value4.substring(1);
                double d4=Double.parseDouble(value4);
                System.out.println("#############>"+d4);
                int a4=Integer.parseInt(ele4);
                System.out.println("%%%%%%%%%%%%>"+a4);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2)+
                        stud_page.TaxRoundOff_item_3_Tax(stateTax, d3, a3) + stud_page.TaxRoundOff_item_4_Tax(stateTax, d4, a4);

                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax2, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax2, d2, a2)+
                        stud_page.TaxRoundOff_item_3_Tax(stateTax2, d3, a3) + stud_page.TaxRoundOff_item_4_Tax(stateTax2, d4, a4);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.items.taxes", tax_exp);



            }



            //verifying tax for HST if there are 3 items in payment page
            else if(item3size.size()!=0){

                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                String value3=item3.getText();
                value3=value3.trim();
                String ele3=qty3.getAttribute("value");
                ele3=ele3.trim();
                value3 = value3.substring(1);
                double d3=Double.parseDouble(value3);
                System.out.println("#############>"+d3);
                int a3=Integer.parseInt(ele3);
                System.out.println("%%%%%%%%%%%%>"+a3);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2)+
                        stud_page.TaxRoundOff_item_3_Tax(stateTax, d3, a3);

                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax2, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax2, d2, a2)+
                        stud_page.TaxRoundOff_item_3_Tax(stateTax2, d3, a3);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.items.taxes", tax_exp);
            }


            //verifying tax for HST if there are 2 items in payment page
            else if(item2size.size()!=0){

                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2);

                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax2, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax2, d2, a2);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.items.taxes", tax_exp);
            }


            //verifying tax for HST if there is 1 item in payment page
            else if(item1size.size()!=0){

                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1);

                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax2, d1, a1);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.items.taxes", tax_exp);
            }


        }
    }



    @Override
    public void calculate_2items_taxes_shoppingcart(List<WebElement> item1size, WebElement item1,WebElement qty1,
                                                    List<WebElement> item2size, WebElement item2,WebElement qty2){


        String item1_no =   TestBaseProvider.getTestBase().getTestData().getString("item1_no");
        String item2_no =   TestBaseProvider.getTestBase().getTestData().getString("item2_no");
        String item1_tax = TestBaseProvider.getTestBase().getTestData().getString("item1_tax");
        String item2_tax = TestBaseProvider.getTestBase().getTestData().getString("item2_tax");


        int stateTax=TestBaseProvider.getTestBase().getTestData().getInt("tax");
        int stateTax2=TestBaseProvider.getTestBase().getTestData().getInt("tax2");
        int state_notax=TestBaseProvider.getTestBase().getTestData().getInt("state_notax");
        int stateTax1_hst = TestBaseProvider.getTestBase().getTestData().getInt("stateTax1_hst");
        int stateTax2_hst = TestBaseProvider.getTestBase().getTestData().getInt("stateTax2_hst");


        if(item1_no.equals("item1")){
            if(item1_tax.equals("GST")){

                System.out.println("Coming to GST for item1 to validate taxes ------>>>>>>>>>>>>");
                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);


                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1);
                tax1_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax1_exp));

                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.item1.taxes", tax1_exp);
            }




            else if(item1_tax.equals("GSTPST")){

                //verifying tax for GSTand PST if there are 4 items in payment page


                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1);
                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax2, d1, a1);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.item1.taxes", tax_exp);
                System.out.println("GSTPST tax is: "+tax_exp);



            }

            else if(item1_tax.equals("GSTPST_Exempt")){

                //verifying tax for GSTand PSTExempt  if there are 4 items in payment page


                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1);
                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(state_notax, d1, a1);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.item1.taxes", tax_exp);
                System.out.println("GSTPST tax is: "+tax_exp);



            }

            else if(item1_tax.equals("GSTPST_BothExempt")){

                //verifying tax for GSTand PSTExempt  if there are 4 items in payment page


                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(state_notax, d1, a1);
                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(state_notax, d1, a1);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.item1.taxes", tax_exp);
                System.out.println("GSTPST tax is: "+tax_exp);



            }


            else if(item1_tax.equals("GSTQST")){
                //verifying tax for GST and QST if there are 4 items in payment page


                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1);

                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax2, d1, a1);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.item1.taxes", tax_exp);
            }





            else if(item1_tax.equals("HST")){
                //verifying tax for HST if there are 4 items in payment page


                String value1=item1.getText();
                value1=value1.trim();
                String ele1=qty1.getAttribute("value");
                ele1=ele1.trim();
                value1 = value1.substring(1);
                double d1=Double.parseDouble(value1);
                System.out.println("#############>"+d1);
                int a1=Integer.parseInt(ele1);
                System.out.println("%%%%%%%%%%%%>"+a1);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax1_hst, d1, a1);
                double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax2_hst, d1, a1);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.item1.taxes", tax_exp);
            }

        }

        if(item2_no.equals("item2")){
            if(item2_tax.equals("GST")){

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d2, a2);
                tax1_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax1_exp));

                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.item2.taxes", tax1_exp);
            }




            else if(item2_tax.equals("GSTPST")){

                //verifying tax for GSTand PST if there are 4 items in payment page
                System.out.println("Coming to GSTPST for item2 to validate taxes ------>>>>>>>>>>>>");

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                double tax1_exp=stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2);

                double tax2_exp=stud_page.TaxRoundOff_item_2_Tax(stateTax2, d2, a2);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.item2.taxes", tax_exp);



            }



            else if(item2_tax.equals("GSTPST_Exempt")){

                //verifying tax for GSTand PST if there are 4 items in payment page
                System.out.println("Coming to GSTPST for item2 to validate taxes ------>>>>>>>>>>>>");

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                double tax1_exp=stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2);

                double tax2_exp=stud_page.TaxRoundOff_item_2_Tax(state_notax, d2, a2);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.item2.taxes", tax_exp);



            }


            else if(item2_tax.equals("GSTPST_BothExempt")){

                //verifying tax for GSTand PST if there are 4 items in payment page
                System.out.println("Coming to GSTPST for item2 to validate taxes ------>>>>>>>>>>>>");

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                double tax1_exp=stud_page.TaxRoundOff_item_2_Tax(state_notax, d2, a2);

                double tax2_exp=stud_page.TaxRoundOff_item_2_Tax(state_notax, d2, a2);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.item2.taxes", tax_exp);



            }


            else if(item2_tax.equals("GSTQST")){
//verifying tax for GST and QST if there are 4 items in payment page

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                double tax1_exp=stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2);

                double tax2_exp=stud_page.TaxRoundOff_item_2_Tax(stateTax2, d2, a2);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.item2.taxes", tax_exp);
            }





            else if(item2_tax.equals("HST")){
//verifying tax for HST if there are 4 items in payment page

                String value2=item2.getText();
                value2=value2.trim();
                String ele2=qty2.getAttribute("value");
                ele2=ele2.trim();
                value2 = value2.substring(1);
                double d2=Double.parseDouble(value2);
                System.out.println("#############>"+d2);
                int a2=Integer.parseInt(ele2);
                System.out.println("%%%%%%%%%%%%>"+a2);

                double tax1_exp=stud_page.TaxRoundOff_item_2_Tax(stateTax1_hst, d2, a2);

                double tax2_exp=stud_page.TaxRoundOff_item_2_Tax(stateTax2_hst, d2, a2);

                double tax_exp = tax1_exp+tax2_exp;
                tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));


                TestBaseProvider.getTestBase().getContext()
                        .setProperty("testexecution.reviewcart.item2.taxes", tax_exp);
            }

        }

    }



    @Override
    public void calculate_4items_taxes_shoppingcart(List<WebElement> item1size, WebElement item1,WebElement qty1, 
    		List<WebElement> item2size, WebElement item2,WebElement qty2,
    		List<WebElement> item3size, WebElement item3,WebElement qty3,
    		List<WebElement> item4size, WebElement item4,WebElement qty4){
    	
    	
    	       String item1_no =   TestBaseProvider.getTestBase().getTestData().getString("item1_no");
    	       String item2_no =   TestBaseProvider.getTestBase().getTestData().getString("item2_no");
    	       String item3_no =   TestBaseProvider.getTestBase().getTestData().getString("item3_no");
    	       String item4_no =   TestBaseProvider.getTestBase().getTestData().getString("item4_no");
    	       
    	       String item1_tax = TestBaseProvider.getTestBase().getTestData().getString("item1_tax");
    	       String item2_tax = TestBaseProvider.getTestBase().getTestData().getString("item2_tax");
    	       String item3_tax = TestBaseProvider.getTestBase().getTestData().getString("item3_tax");
    	       String item4_tax = TestBaseProvider.getTestBase().getTestData().getString("item4_tax");
    	       
    	       
    	       int state_item1_tax1=TestBaseProvider.getTestBase().getTestData().getInt("state_item1_tax1");
    	       int state_item1_tax2=TestBaseProvider.getTestBase().getTestData().getInt("state_item1_tax2");
    	       
    	       int state_item2_tax1=TestBaseProvider.getTestBase().getTestData().getInt("state_item2_tax1");
    	       int state_item2_tax2=TestBaseProvider.getTestBase().getTestData().getInt("state_item2_tax2");
    	       
    	       int state_item3_tax1=TestBaseProvider.getTestBase().getTestData().getInt("state_item3_tax1");
    	       int state_item3_tax2=TestBaseProvider.getTestBase().getTestData().getInt("state_item3_tax2");
    	       
    	       int state_item4_tax1=TestBaseProvider.getTestBase().getTestData().getInt("state_item4_tax1");
    	       double state_item4_tax2=TestBaseProvider.getTestBase().getTestData().getDouble("state_item4_tax2");
    	       
    	      
    	 if(item1_no.equals("item1")){      
              if(item1_tax.equals("GST")){
    	       
            	  System.out.println("Coming to GST for item1 to validate taxes ------>>>>>>>>>>>>");
    	    	String value1=item1.getText();
    			value1=value1.trim();
    			String ele1=qty1.getAttribute("value");
    			ele1=ele1.trim();
    			value1 = value1.substring(1);
    			double d1=Double.parseDouble(value1);
    			System.out.println("#############>"+d1);
    			int a1=Integer.parseInt(ele1);
    			System.out.println("%%%%%%%%%%%%>"+a1);
    			
    		
    		double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(state_item1_tax1, d1, a1);
    		tax1_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax1_exp));
    		
    		TestBaseProvider.getTestBase().getContext()
    		.setProperty("testexecution.reviewcart.item1.taxes", tax1_exp);
    							}	




    else if(item1_tax.equals("GSTPST")){
        
    	    //verifying tax for GSTand PST if there are 4 items in payment page
    		
    			
    			String value1=item1.getText();
    			value1=value1.trim();
    			String ele1=qty1.getAttribute("value");
    			ele1=ele1.trim();
    			value1 = value1.substring(1);
    			double d1=Double.parseDouble(value1);
    			System.out.println("#############>"+d1);
    			int a1=Integer.parseInt(ele1);
    			System.out.println("%%%%%%%%%%%%>"+a1);
    			
    		double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(state_item1_tax1, d1, a1);
    		double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(state_item1_tax2, d1, a1);
    		
    		double tax_exp = tax1_exp+tax2_exp;
    		tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));
    		
    		
    		TestBaseProvider.getTestBase().getContext()
    		.setProperty("testexecution.reviewcart.item1.taxes", tax_exp);
    		
    		
    		
    		}
    		
    		
         else if(item1_tax.equals("GSTQST")){
        //verifying tax for GST and QST if there are 4 items in payment page
    		
    	 
    	 String value1=item1.getText();
    		value1=value1.trim();
    		String ele1=qty1.getAttribute("value");
    		ele1=ele1.trim();
    		value1 = value1.substring(1);
    		double d1=Double.parseDouble(value1);
    		System.out.println("#############>"+d1);
    		int a1=Integer.parseInt(ele1);
    		System.out.println("%%%%%%%%%%%%>"+a1);
    	
    	 double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(state_item1_tax1, d1, a1);
    		
    		double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(state_item1_tax2, d1, a1);
    		
    		double tax_exp = tax1_exp+tax2_exp;
    		tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));
    		
    		
    		TestBaseProvider.getTestBase().getContext()
    		.setProperty("testexecution.reviewcart.item1.taxes", tax_exp);
    								}	

    		
    	

           
    else if(item1_tax.equals("HST")){
        //verifying tax for HST if there are 4 items in payment page
    		
    	 
    	 String value1=item1.getText();
    		value1=value1.trim();
    		String ele1=qty1.getAttribute("value");
    		ele1=ele1.trim();
    		value1 = value1.substring(1);
    		double d1=Double.parseDouble(value1);
    		System.out.println("#############>"+d1);
    		int a1=Integer.parseInt(ele1);
    		System.out.println("%%%%%%%%%%%%>"+a1);
    	
    	    double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(state_item1_tax1, d1, a1);
    		double tax2_exp=stud_page.TaxRoundOff_item_1_Tax(state_item1_tax2, d1, a1);
    		
    		double tax_exp = tax1_exp+tax2_exp;
    		tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));
    		
    		
    		TestBaseProvider.getTestBase().getContext()
    		.setProperty("testexecution.reviewcart.item1.taxes", tax_exp);
    								}	

    }

    if(item2_no.equals("item2")){
        if(item2_tax.equals("GST")){
         
      	String value2=item2.getText();
    		value2=value2.trim();
    		String ele2=qty2.getAttribute("value");
    		ele2=ele2.trim();
    		value2 = value2.substring(1);
    		double d2=Double.parseDouble(value2);
    		System.out.println("#############>"+d2);
    		int a2=Integer.parseInt(ele2);
    		System.out.println("%%%%%%%%%%%%>"+a2);
    	
    	double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(state_item2_tax1, d2, a2);
    	tax1_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax1_exp));
    	
    	TestBaseProvider.getTestBase().getContext()
    	.setProperty("testexecution.reviewcart.item2.taxes", tax1_exp);
    						}	




    else if(item2_tax.equals("GSTPST")){

      //verifying tax for GSTand PST if there are 4 items in payment page
    	System.out.println("Coming to GSTPST for item2 to validate taxes ------>>>>>>>>>>>>");
    		
    		String value2=item2.getText();
    		value2=value2.trim();
    		String ele2=qty2.getAttribute("value");
    		ele2=ele2.trim();
    		value2 = value2.substring(1);
    		double d2=Double.parseDouble(value2);
    		System.out.println("#############>"+d2);
    		int a2=Integer.parseInt(ele2);
    		System.out.println("%%%%%%%%%%%%>"+a2);
    		
    	double tax1_exp=stud_page.TaxRoundOff_item_2_Tax(state_item2_tax1, d2, a2);
    	
    	double tax2_exp=stud_page.TaxRoundOff_item_2_Tax(state_item2_tax2, d2, a2);
    	
    	double tax_exp = tax1_exp+tax2_exp;
    	tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));
    	
    	
    	TestBaseProvider.getTestBase().getContext()
    	.setProperty("testexecution.reviewcart.item2.taxes", tax_exp);
    	
    	
    	
    	}
    	
    	
    else if(item2_tax.equals("GSTQST")){
    //verifying tax for GST and QST if there are 4 items in payment page
    	
    	String value2=item2.getText();
    	value2=value2.trim();
    	String ele2=qty2.getAttribute("value");
    	ele2=ele2.trim();
    	value2 = value2.substring(1);
    	double d2=Double.parseDouble(value2);
    	System.out.println("#############>"+d2);
    	int a2=Integer.parseInt(ele2);
    	System.out.println("%%%%%%%%%%%%>"+a2);

    double tax1_exp=stud_page.TaxRoundOff_item_2_Tax(state_item2_tax1, d2, a2);
    	
    	double tax2_exp=stud_page.TaxRoundOff_item_2_Tax(state_item2_tax2, d2, a2);
    	
    	double tax_exp = tax1_exp+tax2_exp;
    	tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));
    	
    	
    	TestBaseProvider.getTestBase().getContext()
    	.setProperty("testexecution.reviewcart.item2.taxes", tax_exp);
    							}	

    	


     
    else if(item2_tax.equals("HST")){
    //verifying tax for HST if there are 4 items in payment page
    	
    	String value2=item2.getText();
    	value2=value2.trim();
    	String ele2=qty2.getAttribute("value");
    	ele2=ele2.trim();
    	value2 = value2.substring(1);
    	double d2=Double.parseDouble(value2);
    	System.out.println("#############>"+d2);
    	int a2=Integer.parseInt(ele2);
    	System.out.println("%%%%%%%%%%%%>"+a2);

    double tax1_exp=stud_page.TaxRoundOff_item_2_Tax(state_item2_tax1, d2, a2);
    	
    	double tax2_exp=stud_page.TaxRoundOff_item_2_Tax(state_item2_tax2, d2, a2);
    	
    	double tax_exp = tax1_exp+tax2_exp;
    	tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));
    	
    	
    	TestBaseProvider.getTestBase().getContext()
    	.setProperty("testexecution.reviewcart.item2.taxes", tax_exp);
    							}	

    }


    if(item3_no.equals("item3")){
        if(item3_tax.equals("GST")){
         
      	String value2=item3.getText();
    		value2=value2.trim();
    		String ele2=qty3.getAttribute("value");
    		ele2=ele2.trim();
    		value2 = value2.substring(1);
    		double d2=Double.parseDouble(value2);
    		System.out.println("#############>"+d2);
    		int a2=Integer.parseInt(ele2);
    		System.out.println("%%%%%%%%%%%%>"+a2);
    	
    	double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(state_item3_tax1, d2, a2);
    	tax1_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax1_exp));
    	
    	TestBaseProvider.getTestBase().getContext()
    	.setProperty("testexecution.reviewcart.item3.taxes", tax1_exp);
    						}	




    else if(item3_tax.equals("GSTPST")){

      //verifying tax for GSTand PST if there are 4 items in payment page
    	System.out.println("Coming to GSTPST for item3 to validate taxes ------>>>>>>>>>>>>");
    		
    		String value2=item3.getText();
    		value2=value2.trim();
    		String ele2=qty3.getAttribute("value");
    		ele2=ele2.trim();
    		value2 = value2.substring(1);
    		double d2=Double.parseDouble(value2);
    		System.out.println("#############>"+d2);
    		int a2=Integer.parseInt(ele2);
    		System.out.println("%%%%%%%%%%%%>"+a2);
    		
    	double tax1_exp=stud_page.TaxRoundOff_item_2_Tax(state_item3_tax1, d2, a2);
    	
    	double tax2_exp=stud_page.TaxRoundOff_item_2_Tax(state_item3_tax2, d2, a2);
    	
    	double tax_exp = tax1_exp+tax2_exp;
    	tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));
    	
    	
    	TestBaseProvider.getTestBase().getContext()
    	.setProperty("testexecution.reviewcart.item3.taxes", tax_exp);
    	
    	
    	
    	}
    	
    	
    else if(item3_tax.equals("GSTQST")){
    //verifying tax for GST and QST if there are 4 items in payment page
    	
    	String value2=item3.getText();
    	value2=value2.trim();
    	String ele2=qty3.getAttribute("value");
    	ele2=ele2.trim();
    	value2 = value2.substring(1);
    	double d2=Double.parseDouble(value2);
    	System.out.println("#############>"+d2);
    	int a2=Integer.parseInt(ele2);
    	System.out.println("%%%%%%%%%%%%>"+a2);

        double tax1_exp=stud_page.TaxRoundOff_item_2_Tax(state_item3_tax1, d2, a2);
    	double tax2_exp=stud_page.TaxRoundOff_item_2_Tax(state_item3_tax2, d2, a2);
    	
    	double tax_exp = tax1_exp+tax2_exp;
    	tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));
    	
    	
    	TestBaseProvider.getTestBase().getContext()
    	.setProperty("testexecution.reviewcart.item3.taxes", tax_exp);
    							}	

    	


     
    else if(item3_tax.equals("HST")){
    //verifying tax for HST if there are 4 items in payment page
    	
    	String value2=item3.getText();
    	value2=value2.trim();
    	String ele2=qty3.getAttribute("value");
    	ele2=ele2.trim();
    	value2 = value2.substring(1);
    	double d2=Double.parseDouble(value2);
    	System.out.println("#############>"+d2);
    	int a2=Integer.parseInt(ele2);
    	System.out.println("%%%%%%%%%%%%>"+a2);

        double tax1_exp=stud_page.TaxRoundOff_item_2_Tax(state_item3_tax1, d2, a2);
    	double tax2_exp=stud_page.TaxRoundOff_item_2_Tax(state_item3_tax2, d2, a2);
    	
    	double tax_exp = tax1_exp+tax2_exp;
    	tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));
    	
    	
    	TestBaseProvider.getTestBase().getContext()
    	.setProperty("testexecution.reviewcart.item3.taxes", tax_exp);
    							}	

    }  

    if(item4_no.equals("item4")){
        if(item4_tax.equals("GST")){
         
      	String value2=item4.getText();
    		value2=value2.trim();
    		String ele2=qty4.getAttribute("value");
    		ele2=ele2.trim();
    		value2 = value2.substring(1);
    		double d2=Double.parseDouble(value2);
    		System.out.println("#############>"+d2);
    		int a2=Integer.parseInt(ele2);
    		System.out.println("%%%%%%%%%%%%>"+a2);
    	
    	double tax1_exp=stud_page.TaxRoundOff_item_1_Tax(state_item4_tax1, d2, a2);
    	tax1_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax1_exp));
    	
    	TestBaseProvider.getTestBase().getContext()
    	.setProperty("testexecution.reviewcart.item4.taxes", tax1_exp);
    						}	




    else if(item4_tax.equals("GSTPST")){

      //verifying tax for GSTand PST if there are 4 items in payment page
    	System.out.println("Coming to GSTPST for item4 to validate taxes ------>>>>>>>>>>>>");
    		
    		String value2=item4.getText();
    		value2=value2.trim();
    		String ele2=qty4.getAttribute("value");
    		ele2=ele2.trim();
    		value2 = value2.substring(1);
    		double d2=Double.parseDouble(value2);
    		System.out.println("#############>"+d2);
    		int a2=Integer.parseInt(ele2);
    		System.out.println("%%%%%%%%%%%%>"+a2);
    		
    	double tax1_exp=stud_page.TaxRoundOff_item_2_Tax(state_item4_tax1, d2, a2);
    	double tax2_exp=stud_page.TaxRoundOff_item_2_Tax(state_item4_tax2, d2, a2);
    	
    	double tax_exp = tax1_exp+tax2_exp;
    	tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));
    	
    	
    	TestBaseProvider.getTestBase().getContext()
    	.setProperty("testexecution.reviewcart.item4.taxes", tax_exp);
    	
    	
    	
    	}
    	
    	
    else if(item4_tax.equals("GSTQST")){
    //verifying tax for GST and QST if there are 4 items in payment page
    	
    	String value2=item4.getText();
    	value2=value2.trim();
    	String ele2=qty4.getAttribute("value");
    	ele2=ele2.trim();
    	value2 = value2.substring(1);
    	double d2=Double.parseDouble(value2);
    	System.out.println("#############>"+d2);
    	int a2=Integer.parseInt(ele2);
    	System.out.println("%%%%%%%%%%%%>"+a2);

        double tax1_exp=stud_page.TaxRoundOff_item_2_Tax(state_item4_tax1, d2, a2);
    	double tax2_exp=stud_page.TaxRoundOff_item_2_Tax(state_item4_tax2, d2, a2);
    	
    	double tax_exp = tax1_exp+tax2_exp;
    	tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));
    	
    	
    	TestBaseProvider.getTestBase().getContext()
    	.setProperty("testexecution.reviewcart.item4.taxes", tax_exp);
    							}	

    	


     
    else if(item4_tax.equals("HST")){
    //verifying tax for HST if there are 4 items in payment page
    	
    	String value2=item4.getText();
    	value2=value2.trim();
    	String ele2=qty4.getAttribute("value");
    	ele2=ele2.trim();
    	value2 = value2.substring(1);
    	double d2=Double.parseDouble(value2);
    	System.out.println("#############>"+d2);
    	int a2=Integer.parseInt(ele2);
    	System.out.println("%%%%%%%%%%%%>"+a2);

        double tax1_exp=stud_page.TaxRoundOff_item_2_Tax(state_item4_tax1, d2, a2);
    	double tax2_exp=stud_page.TaxRoundOff_item_2_Tax(state_item4_tax2, d2, a2);
    	
    	double tax_exp = tax1_exp+tax2_exp;
    	tax_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_exp));
    	
    	
    	TestBaseProvider.getTestBase().getContext()
    	.setProperty("testexecution.reviewcart.item4.taxes", tax_exp);
    							}	

    }


    }
    
    @Override
    public void reveiwpageUpdateqty( String cartValue) {
        if(!getreviewcartitemqty().isDisplayed())
        {
            Assert.fail("Review Cart Page is not displayed OR there are no items in the cart");
            
        }
        getreviewcartitemqty().clear();
        getreviewcartitemqty().sendKeys(cartValue);

    }

    @Override
    public void reviewcartpage_Tabfromqty() {
        getreviewcartitemqty().sendKeys(Keys.TAB);
    }

    @Override
    public void reviewcartpage_clickButton_continueChkout() {

        getreviewcart_buttonContinueChkout().click();
    }

    @Override
    public void click_reduceitemqty() {
        do{
            getclickminus_qty().click();
    }while(!getreviewcartitemqty().getText().isEmpty());
    }

    @Override
    public void getItemqtycount() {
        String getitemv=getreviewcartitemqty().getAttribute("value");
        if(getitemv.contains("-"))
        {
            Assert.fail("Item Qty can not be -ve values");
        }
    }


    @Override
    public void click_edit_FREEPICK() {
        List<WebElement> tableReviewcart = gettableReviewCartwithCoupon();
        //System.out.println("totalrow"+tableReviewcart.size());
        for (WebElement tabletr : tableReviewcart) {
            List<WebElement> tdtable = tabletr.findElements(By.tagName("td"));
            String val = tdtable.get(4).getText();
            // System.out.println("val from celc"+val);
            if (val.contains("FREEPICK")) {
                //System.out.println("SSSSS"+val);
                tdtable.get(4).findElement(By.linkText("Edit")).click();
            }
        }
    }



    @Override
    public void verify_popup_removeFreeitem() {
        SCHUtils.waitForLoaderToDismiss();

        // System.out.println("title to test "+getpopup_removefreeitemCoupon().getText());
        if (!(getpopup_removefreeitemCoupon().getText().equalsIgnoreCase("Delete this item")))

        {
            Assert.fail("Remove FreeItem Coupon Dialogue is not displayed");
        } else {
            boolean b = getbuttonDeletePopupYes().isDisplayed() && getbuttonDeletePopupNO().isDisplayed();
            if (!b) {
                Assert.fail("The Delete confirmation Dialogue is displayed but the YES / NO button is not displayed.");
            }
        }

    }

    @Override
    public void editFreePick_Modal_Cancel_NotDisplayed() {
        try {
            int value = getbutton2CancelFreepickEditModal().size();
            if(value>0){
                Assert.fail("Modal should not be displayed after deletion");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void pcod_firstChild_not_in_dropdown_after_remove_ReviewCart() {
		String act_result = getdrpdwnchildname1reviewcart().getText().trim();
		String exp_result = "Add a Child";

        boolean validateresult = act_result.contains(exp_result);
		if(!validateresult){
		    Assert.fail("Name should not be displayed"+act_result);
        }
	}

	public void pcod_firstChild_exists_in_dropdown_after_remove_ReviewCart() {
		String act_result = getdrpdwnchildname1reviewcart().getText().trim();
        System.out.println("act_result---review cart child"+act_result);
        String exp_result = TestBaseProvider.getTestBase().getTestData().
                getString("childlastname");
        boolean tovalidate = act_result.contains(exp_result);
		if(!tovalidate){
		    Assert.fail("Child Name in Review Cart Page Please check");
        }
	}
    
	public Boolean pcod_check_child_not_connected_to_teacher_reviewpage() {
		try{
			try{
				getChildDropdownReviewcartItem1().click();
			} catch(Exception e){
				System.out.println("No child dropdown available on the review cart(Possibly child with no connected teacher is the only option(s))");
			}
			
			getChildDropdownLinkReviewcartItem1().isDisplayed();
			System.out.println("A child not connected to teacher is available");
			
			String[] childInfo= getChildNotconnectedReviewcartItem1().getText().split(" ");
			String childFirstName = childInfo[0];
			
			TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_firstname_reviewCart", String.valueOf
	                (childFirstName));
			TestBaseProvider.getTestBase().getContext().setProperty("testexecution.child_firstname_Homepage", String.valueOf
	                (childFirstName));
			
			getChildDropdownLinkReviewcartItem1().click();
			
		} catch(Exception e){
			
			System.out.println("There are no children connected to a teacher. Creating one child not connected to teacher...");
			
			getAddAChildReviewcartItem1().click();
			
			return false;
		}
		
		return true;
	}

	public void pcod_check_connectedchild_in_dropdown_reviewCart() {
		String childName = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.child_firstname_reviewCart").toString();
		String childLastName = TestBaseProvider.getTestBase().getTestData().getString("lastname");
		
		String childFullName = childName + " " + childLastName;
		
		for(WebElement element: getChildDropdownListReviewcartItem1()){
			String act_childName = element.getAttribute("innerText").trim();
			
			if(childFullName.equals(act_childName)){
				System.out.println("<<<<<<<<<<< GOT IT!: " + act_childName + " exists in the Review cart dropdown for Item 1 as expected");
				return;
			} else {
				System.out.println("<<<<<<<<<<< NOT IT!: " + act_childName);
			}
		}
		
		Assert.fail(childFullName + " does not exist in the Review cart dropdown for Item 1");
        /*System.out.println("We R comparing with"+childFullName);

        if(!(getreviewcart_addedchildname().getText().trim().contains(childFullName))){

        for(WebElement element: getChildDropdownListReviewcartItem1()){
			if(childFullName.equals(element.getAttribute("innerText"))){
                System.out.println("we r matching with read value"+element.getAttribute("innerText"));
                System.out.println(childFullName + " exists in the Review cart dropdown for Item 1 as expected");
			}
		}
		
	    }*/
    }
	public void pcod_verify_reviewpage_displays() {
		try{
			getpagereviewcartpage().isDisplayed();
			System.out.println("Review Cart page is displayed");
		} catch(Exception e){
			Assert.fail("Review Cart page is not displayed");
			e.printStackTrace();
		}
	}
    @Override
    public void PCOD_ReviewCart_Addchild_SectionClick() {
        SCHUtils.waitForElementToBeDisplayed(get_pcod_reviewcart_addchild_section(),10);
        get_pcod_reviewcart_addchild_section().click();
        SCHUtils.selectOptionsByVisibleText(getpcod_reviewcart_drpdown_Addchild_Select(),"Add a Child");
        System.out.println("<<>>>SELECTADDCHILD");
    }

	public void pcod_go_to_review_cart_page() {
		PauseUtil.pause(2500);
		getShoppingCartIcon().click();
	}
	
	@FindBy(locator="dw.pcod.reviewcart.freepickmodalwindow.searchbar")
	private WebElement pcod_reviewcart_freepickmodal_searchbar;
	
	@FindBy(locator="dw.pcod.reviewcart.freepickmodalwindow.searchbutton")
	private WebElement pcod_reviewcart_freepickmodal_searchbutton;
	
	@FindBy(locator="dw.pcod.reviewcart.freepickmodalwindow.search.noresults")
	private WebElement pcod_reviewcart_freepickmodal_search_noresults;
	
	@FindBy(locator="dw.pcod.reviewcart.freepickmodalwindow.grade.dropdown")
	private WebElement pcod_reviewcart_freepickmodal_grade_dropdown;
	
	@FindBy(locator="dw.pcod.reviewcart.freepickmodalwindow.results.itemnumber.list")
	private List<WebElement> pcod_reviewcart_freepickmodal_results_itemnumber_list;
	
	@FindBy(locator="dw.pcod.reviewcart.freepickmodalwindow.results.nextbutton")
	private WebElement pcod_reviewcart_freepickmodal_results_next_button;
	
	public WebElement getPCODReviewCartFreePickModalResultsNextButton(){
		return pcod_reviewcart_freepickmodal_results_next_button;
	}
	
	public List<WebElement> getPCODReviewCartFreePickModalResultsItemNumberList(){
		return pcod_reviewcart_freepickmodal_results_itemnumber_list;
	}
	
	public WebElement getPCODReviewCartFreePickModalGradeDropdown(){
		return pcod_reviewcart_freepickmodal_grade_dropdown;
	}
	
	public WebElement getPCODReviewCartFreePickModalSearchNoResults(){
		return pcod_reviewcart_freepickmodal_search_noresults;
	}
	
	public WebElement getPCODReviewCartFreePickModalSearchBar(){
		return pcod_reviewcart_freepickmodal_searchbar;
	}
	
	public WebElement getPCODReviewCartFreePickModalSearchButton(){
		return pcod_reviewcart_freepickmodal_searchbutton;
	}
	
	public void pcod_apply_free_pick_coupon() {
		PauseUtil.pause(2500);
		String coupon = TestBaseProvider.getTestBase().getTestData().getString("couponCode");
		
		gettxtcouponcodereviewcart().clear();
		gettxtcouponcodereviewcart().click();
		gettxtcouponcodereviewcart().sendKeys(coupon);
		
		System.out.println("Added coupon code: " + coupon);
		getbtnapplycouponcodereviewcart().click();
	}

	public void pcod_search_for_item_free_pick_modal() {
		PauseUtil.pause(2500);
		String search = TestBaseProvider.getTestBase().getTestData().getString("searchTerm");
		
		getPCODReviewCartFreePickModalSearchBar().clear();
		getPCODReviewCartFreePickModalSearchBar().click();
		getPCODReviewCartFreePickModalSearchBar().sendKeys(search);
		
		System.out.println("Searching for item: " + search);
		
		PauseUtil.pause(2500);
		getPCODReviewCartFreePickModalSearchButton().click();
	}

	public void pcod_no_results_displayed_free_pick_modal() {
		PauseUtil.pause(2500);
		String exp_msg = ConstantUtils.EMPTY_COUPONS_SEARCH_MESSAGE;
		String act_msg = getPCODReviewCartFreePickModalSearchNoResults().getText().trim();
		
		Assert.assertEquals(act_msg, exp_msg, "The 'no results' message is not displayed (maybe item is not a teacher resource item)");
	}

	public void pcod_click_and_select_grade_level_dropdown() {
		PauseUtil.pause(2500);
		String selectedGrade = TestBaseProvider.getTestBase().getTestData().getString("grade");
		
		SCHUtils.selectOptionByVisibleText(getPCODReviewCartFreePickModalGradeDropdown(), selectedGrade);
	}

	public void pcod_item_not_available_in_free_pick_modal() {
		PauseUtil.pause(2500);
		
		Boolean nextEnabled = false;
		String exp_itemNumberVal = TestBaseProvider.getTestBase().getTestData().getString("searchTerm");
		do{
			PauseUtil.pause(2500);
			for(WebElement element: getPCODReviewCartFreePickModalResultsItemNumberList()){
				String act_itemNumberVal = element.getText().trim();
				
				if(exp_itemNumberVal.equals(act_itemNumberVal)){
					Assert.fail(exp_itemNumberVal + " exists in the search results");
				} else {
					System.out.println(act_itemNumberVal + " does not matched the teacher resource item " +  exp_itemNumberVal);
				}
			}
			
			PauseUtil.pause(2500);
			try{
				getPCODReviewCartFreePickModalResultsNextButton().click();
				System.out.println("Going to the next page" );
				nextEnabled = true;
			} catch (Exception e){
				System.out.println("On the last page");
				nextEnabled = false;
			}
			
		} while(nextEnabled);
	}

	public void added_item_is_deleted_from_the_cart() {
		int ttl_items_in_cart=reviewcartitemdelete().size();
		int i=0;
		while(ttl_items_in_cart>0)
		{
			System.out.println("ttl_items_in_cart :"+ttl_items_in_cart);
			reviewcartitemdelete().get(0).click();
			reviewcartitemdeleteconfirm().get(0).click();
			ttl_items_in_cart=reviewcartitemdelete().size();
			
		}
		
	}
	
	@FindBy(locator="dw.pcod.reviewcart.ordertable.item.list")
	private List<WebElement> pcod_reviewcart_ordertable_item_list;
	
	public List<WebElement> getPCODReviewCartItemList(){
		return pcod_reviewcart_ordertable_item_list;
	}
	
	public void pcod_assign_last_item_to_specific_child(int childNumber) {
		PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        
        WebDriver driver = TestBaseProvider.getTestBase().getDriver();
        int numOfOrders = getPCODReviewCartItemList().size();
        WebElement selectChildLastItem = driver.findElement(By.xpath("//*[@id='cart-items-form']/div/div/table/tbody/tr[" + numOfOrders + "]/td[3]/div/select"));

        String childName = TestBaseProvider.getTestBase().getTestData().getString("child" + childNumber + "FirstName") + " " + 
        						TestBaseProvider.getTestBase().getTestData().getString("child" + childNumber + "LastName");
        
        
        PauseUtil.pause(2500);
        SCHUtils.selectOptionByVisibleText(selectChildLastItem, childName);
        
        System.out.println("Assigned item to child " + childName);
	}
	
	public void pcod_assign_item_to_specific_child(String childName) {
		PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);
        
        WebDriver driver = TestBaseProvider.getTestBase().getDriver();
        int numOfOrders = getPCODReviewCartItemList().size();
        WebElement selectChildLastItem = driver.findElement(By.xpath("//*[@id='cart-items-form']/div/div/table/tbody/tr[" + numOfOrders + "]/td[3]/div/select"));

        PauseUtil.pause(2500);
        SCHUtils.selectOptionByVisibleText(selectChildLastItem, childName);
        
        System.out.println("Assigned item to child " + childName);
	}
}


