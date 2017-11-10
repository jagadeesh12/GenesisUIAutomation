package com.dw.automation.pages.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.commons.configuration.Configuration;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.dw.automation.beans.ProductInfoBean;
import com.dw.automation.beans.UserProfileBean;
import com.dw.automation.pages.IProductDetailPage;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.DWClient;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;
import com.scholastic.torque.common.WaitUtils;
import com.scholastic.torque.webdriver.ExtendedElement;

import cucumber.api.java.en.Then;

public class ProductDetailPage extends BaseTestPage<TestPage>
		implements
			IProductDetailPage {

	@FindBy(locator = "dw.productdetail.lbl.productname")
	private WebElement lblProductName;
	
	@FindBy(locator = "dw.productdetail.pdp.miniattribute")
	private WebElement lblpdpproductminiattribute;
	
	@FindBy(locator = "dw.productdetail.pdp.shortdescription")
	private WebElement descshortdescpdp;
	
	@FindBy(locator = "dw.productdetail.pdp.longdescription")
	private WebElement desclongdescpdp;
	
	@FindBy(locator = "dw.productdetail.lbl.mrktcontainer")
	private List<WebElement> lblMrktContainer;
	
	@FindBy(locator = "dw.category.header.text")
	private WebElement lblCategoryName;

	@FindBy(locator = "dw.productdetail.lnk.productattribution")
	private WebElement lnkProductAttribution;

	@FindBy(locator = "dw.productdetail.lnk.authorname")
	private WebElement lnkAuthorName;

	@FindBy(locator = "dw.productdetail.lnk.facebookicon")
	private WebElement lnkFacebookIcon;

	@FindBy(locator = "dw.productdetail.lnk.pinteresticon")
	private WebElement lnkPinterestIcon;

	@FindBy(locator = "dw.productdetails.pdp.icon.award")
	private WebElement iconAward;

	@FindBy(locator = "dw.productdetails.pdp.img.badgeoverlay")
	private WebElement imgBadgeOverlay;

	public WebElement getImgBadgeOverlay() {
		return imgBadgeOverlay;
	}

	public WebElement getIconAward() {
		return iconAward;
	}
	private WebElement lnkBreadCrumbLink;

	@FindBy(locator = "dw.productdetail.img.productimage")
	private WebElement imgProduct;

	@FindBy(locator = "dw.productdetails.pdp.icon.pcoolmessage.lnk.buyforclass")
	private WebElement pcoolLnkBuyForClass;

	@FindBy(locator = "dw.productdetails.pdp.wishlist.teachername")
	private WebElement LblClassroomTeaherName;

	public WebElement getLblClassroomTeaherName() {
		return LblClassroomTeaherName;
	}

	public WebElement getPcoolLnkBuyForClass() {
		return pcoolLnkBuyForClass;
	}

	public WebElement getIconPcool() {
		return iconPcool;
	}
	@FindBy(locator = "dw.productdetails.pdp.icon.pcoolmessage")
	private WebElement iconPcool;

	@FindBy(locator = "dw.productdetail.search.bundlepack.book.lbl.item")
	private List<WebElement> lblBundlePackProducts;

	@FindBy(locator = "dw.productdetail.bundle.pack.lbl.item")
	private List<WebElement> lblBundlePackSeeItemsInPack;

	@FindBy(locator = "dw.productdetail.bundlepack.productattribute.onlyavailableinpack.title.item")
	private List<WebElement> lblItemBundlePackItemOnlyAvailableInPack;

	@FindBy(locator = "dw.productdetail.bundlepack.purchasableproduct.title.item")
	public List<WebElement> lblTitleBundlePackPurchasableItem;

	@FindBy(locator = "dw.productdetail.about.this.series.section.text")
	private List<WebElement> aboutThisSeriesSection;

	
	
	
	public List<WebElement> getAboutThisSeriesSection() {
		return aboutThisSeriesSection;
	}
	@FindBy(locator = "dw.productdetails.pdp.hovercatalog")
	public WebElement hoverCatalog;

	public WebElement getHoverCatalog() {
		return hoverCatalog;
	}
	
	

	public List<WebElement> getCatalogToolTip() {
		return catalogToolTip;
	}

	@FindBy(locator = "dw.productdetails.pdp.catalogtooltip")
	public List<WebElement> catalogToolTip;

	public List<WebElement> getLblTitleBundlePackPurchasableItem() {
		return lblTitleBundlePackPurchasableItem;
	}

	public List<WebElement> getLblBundlePackSeeItemsInPack() {
		return lblBundlePackSeeItemsInPack;
	}

	public List<WebElement> getLblItemBundlePackItemOnlyAvailableInPack() {
		return lblItemBundlePackItemOnlyAvailableInPack;
	}

	public List<WebElement> getLblBundlePackProducts() {
		return lblBundlePackProducts;
	}

	@FindBy(locator = "dw.productdetail.thumbnail.img.productimage")
	private WebElement imgProductThumbnail;

	private WebElement lblMiniProductAttribute;

	private WebElement lblMiniProductAttributeValue;

	@FindBy(locator = "dw.productdetail.lnk.writefirstreview")
	private WebElement lnkWriteFirstReview;

	@FindBy(locator = "dw.productdetail.img.reviewstarimage")
	private WebElement imgReviewStarImage;

	@FindBy(locator = "dw.productdetail.lnk.readreview")
	private WebElement lnkReadReview;

	@FindBy(locator = "dw.productdetail.lbl.shortproductdescription")
	private WebElement lblShortProductDescription;

	@FindBy(locator = "dw.productdetail.lbl.warningmessage")
	private WebElement lblWarningMessage;

	@FindBy(locator = "dw.productdetail.img.warningicon")
	private WebElement imgWarningIcon;

	@FindBy(locator = "dw.productdetail.lbl.productpoints")
	private WebElement lblProductPoints;

	@FindBy(locator = "dw.productdetail.lbl.quantity")
	private WebElement lblQuantity;

	@FindBy(locator = "dw.productdetail.txt.quantity")
	private WebElement txtQuantity;

	@FindBy(locator = "dw.productdetail.btn.addtocart")
	private WebElement btnAddToCart;

	@FindBy(locator = "dw.productdetail.lbl.recommend")
	private WebElement lblRecommend;

	@FindBy(locator = "dw.productdetail.lbl.addtowishlist")
	private WebElement lblAddToWishList;

	@FindBy(locator = "dw.productdetail.lbl.save.for.later")
	private WebElement lblSaveForLater;

	@FindBy(locator = "dw.productdetail.lbl.availableinvaluepack")
	private WebElement lblAvailableInValuePack;

	@FindBy(locator = "dw.productdetail.lnk.productbundlename")
	private List<WebElement> lstProductBundleName;

	@FindBy(locator = "dw.productdetail.lbl.productbundleprice")
	private List<WebElement> lstProductBundlePrice;

	@FindBy(locator = "dw.productdetail.lnk.seeiteminthispack")
	private WebElement lnkSeeItemsInThisPack;

	@FindBy(locator = "dw.productdetail.bundlepack.productattribute.lbl.onlyavailableinpack")
	private List<WebElement> lblOnlyAvailableInPack;

	@FindBy(locator = "dw.productdetail.reading.level.modal.about.lnk")
	private WebElement lnkAboutReadingLevel;

	@FindBy(locator = "dw.productdetail.reading.level.modal.plus.lnk")
	private List<WebElement> lnkPlusAboutReadingModal;

	@FindBy(locator = "dw.productdetail.pdp.reading.level.contains")
	private WebElement lblReadingLevelContains;

	@FindBy(locator = "dw.productdetails.pdp.reading.level.inner.contains")
	private WebElement readingLevelPopUp;

	@FindBy(locator = "dw.productdetails.pdp.reading.level.popup.close.lnk")
	private WebElement closePopUpReadingLevel;

	public WebElement getClosePopUpReadingLevel() {
		return closePopUpReadingLevel;
	}

	public WebElement getReadingLevelPopUp() {
		return readingLevelPopUp;
	}

	public WebElement getLblReadingLevelContains() {
		return lblReadingLevelContains;
	}
	public WebElement getLnkAboutReadingLevel() {
		return lnkAboutReadingLevel;
	}

	public List<WebElement> getLnkPlusAboutReadingModal() {
		return lnkPlusAboutReadingModal;
	}

	public WebElement getLblSearchBundlPackItem(String itenLbl) {
		return SCHUtils.findElement("dw.productdetail.bundlepack.search.title.lbl.item",
				itenLbl);
	}

	public WebElement getLblItemInBundlePack(String itemId) {
		return SCHUtils.findElement("dw.productdetail.bundlepack.lbl.itemid", itemId);
	}

	@FindBy(locator = "dw.productdetail.bundlepack.search.title.lbl.item")
	private List<WebElement> lblSearchBundlPackItem;

	/*
	 * public WebElement getLblSearchBundlPackItem(String itenLbl) {
	 * return
	 * SCHUtils.findElement("dw.productdetail.bundlepack.search.title.lbl.item",
	 * itenLbl);
	 * }
	 */

	public WebElement getLblOnlyAvailableInPackSearchResult(String itenLbl) {
		return SCHUtils.findElement(
				"dw.productdetail.bundlepack.search.title.lbl.onlyavailableinpack",
				itenLbl);
	}

	public List<WebElement> getLblSearchBundlPackItem() {
		return lblSearchBundlPackItem;
	}

	public WebElement getLblitemType() {
		return lblitemType;
	}

	public WebElement getLblitemvalue() {
		return lblitemvalue;
	}

	public WebElement getLnkSeeItemsInThisPack() {
		return lnkSeeItemsInThisPack;
	}

	public List<WebElement> getLblOnlyAvailableInPack() {
		return lblOnlyAvailableInPack;
	}

	private WebElement lblMainProductAttribute;

	private WebElement lblMainProductAttributeValue;

	@FindBy(locator = "dw.productdetail.lbl.summary")
	private WebElement lblSummary;

	@FindBy(locator = "dw.quickview.lnk.seefulldetails")
	private WebElement lnkSeeFullDetails;

	@FindBy(locator = "dw.parent.home.shopbycollection.lst.quickviewbtn")
	private List<WebElement> lstQuickViewBtn;

	public List<WebElement> getLstQuickViewBtn() {
		return lstQuickViewBtn;
	}

	public WebElement getItempack() {
		return itempack;
	}

	public WebElement getAboutreadinglevellink() {
		return aboutreadinglevellink;
	}
	
	public WebElement Aboutreadinglevellink() {
		return aaboutreadinglevellink;
	}

	public WebElement getSerieslablevalue() {
		return serieslablevalue;
	}
	@FindBy(locator = "dw.productdetail.model.btn.gotocheckout")
	private WebElement btnModelGoToCheckout;

	@FindBy(locator = "dw.productdetail.model.btn.continueshopping")
	private WebElement btnModelContinueShopping;

	@FindBy(locator = "dw.productdetail.model.lbl.readinglevel")
	private WebElement lblReadingLevel;

	@FindBy(locator = "dw.productdetail.modal.digitalflyer")
	private WebElement digitalFlyerPopup;

	@FindBy(locator = "dw.productdetail.model.lnk.createaccount")
	private WebElement lnkCreateAccount;

	@FindBy(locator = "dw.productdetail.icon.note")
	private WebElement iconNote;

	@FindBy(locator = "dw.productdetail.addtowishlist.model.lnk.close")
	private WebElement lnkWishListClose;

	@FindBy(locator = "dw.productdetail.lbl.addtowishlist.teacher")
	private WebElement lblTeacherAddToWishList;

	@FindBy(locator = "dw.productdetail.pdp.wishlist.txt.addtolist")
	private WebElement txtAddToList;

	@FindBy(locator = "dw.productdetail.lbl.productprice")
	private WebElement lblProductPrice;

	@FindBy(locator = "dw.productdetails.pdp.itemtype")
	private WebElement lblitemType;

	@FindBy(locator = "dw.productdetails.pdp.item.value")
	private WebElement lblitemvalue;

	public WebElement getItemType() {
		return lblitemType;
	}
	public WebElement getItemValue() {
		return lblitemvalue;
	}

	public WebElement getLblProductPrice() {
		return lblProductPrice;
	}

	public WebElement getTxtAddToList() {
		return txtAddToList;
	}

	@FindBy(locator = "dw.productdetail.note.model")
	private WebElement noteModel;

	@FindBy(locator = "dw.productdetail.note.model.icon.close")
	private WebElement lnkCloseNoteModel;

	@FindBy(locator = "dw.parentCart.pdp.wishlist")
	private WebElement saveForLater;

	public WebElement getSaveForLater() {
		return saveForLater;
	}

	@FindBy(locator = "dw.productdetail.pdp.wishlist.popup")
	private WebElement popUpWishListModel;

	public WebElement getPopUpWishListModel() {
		return popUpWishListModel;
	}

	public WebElement getLnkCloseNoteModel() {
		return lnkCloseNoteModel;
	}

	public WebElement getNoteModel() {
		return noteModel;
	}

	public WebElement getLblTeacherAddToWishList() {
		return lblTeacherAddToWishList;
	}

	public WebElement getLnkWishListClose() {
		return lnkWishListClose;
	}

	@FindBy(locator = "dw.productdetail.addtowishlist.model.lbl.title")
	private WebElement lblWishListTitle;

	public WebElement getLblWishListTitle() {
		return lblWishListTitle;
	}

	@FindBy(locator = "dw.productdetail.addtowishlist.model.input.createnewlist")
	private WebElement inputCreateNewWishList;

	public WebElement getinputCreateNewWishList() {
		return inputCreateNewWishList;
	}

	@FindBy(locator = "dw.productdetail.addtowishlist.model.btn.create")
	private WebElement btnCreateNewWishList;

	@FindBy(locator = "dw.productdetail.pdp.wishlist.input")
	private WebElement wishlistInputOnPDP;

	public WebElement getWishlistInputOnPDP() {
		return wishlistInputOnPDP;
	}

	public WebElement getBtnCreateNewWishList() {
		return btnCreateNewWishList;
	}

	@FindBy(locator = "dw.productdetail.addtowishlist.model.chklist.student")
	private List<WebElement> checkBoxesWishList;

	public List<WebElement> getCheckBoxesWishList() {
		return checkBoxesWishList;
	}

	@FindBy(locator = "dw.productdetail.addtowishlist.model.lbl.students")
	private List<WebElement> lblStudentNameWishList;

	public List<WebElement> getChildNameWishList() {
		return lblStudentNameWishList;
	}

	public WebElement getProductTileImgOnSearchResultPage(String itemName) {
		return SCHUtils.findElement("dw.parent.searchresult.itemImage", itemName);
	}

	@FindBy(locator = "dw.productdetail.addtowishlist.model.body")
	private WebElement bodyWishList;

	@FindBy(locator = "dw.parent.modal.window")
	private WebElement modalWindow;

	@FindBy(locator = "dw.pdp.wishlistORRecommand.model")
	private WebElement wishlistOrRecommandModel;

	@FindBy(locator = "dw.product.lnk.name")
	private WebElement lnkName;

	@FindBy(locator = "dw.pdp.itemInPack.active")
	private WebElement itemInPackActive;

	@FindBy(locator = "dw.pdp.itemInPack.plus")
	private WebElement plusExpand;

	@FindBy(locator = "dw.pdp.itemInPack.minus")
	private WebElement minusCollapses;

	@FindBy(locator = "dw.product.lbl.points")
	private WebElement lblPoints;

	@FindBy(locator = "dw.product.addtowishlist.recommendations.lnk.close")
	private WebElement clostListPopup;

	@FindBy(locator = "dw.productdetail.miniattribute.productattribute.lbl.readinglevel")
	private WebElement lblReadingLevelProductAttriute;

	@FindBy(locator = "dw.productdetail.search.section.noresultfound")
	private WebElement searchNoResultFoundSection;

	public WebElement getSearchNoResultFoundSection() {
		return searchNoResultFoundSection;
	}

	@FindBy(locator = "dw.productdetail.bundlepack.img.item")
	private List<WebElement> imgBundlePackAttribute;

	public List<WebElement> getImgBundlePackAttribute() {
		return imgBundlePackAttribute;
	}

	public List<WebElement> getLblTitleBundlePackAttribute() {
		return lblTitleBundlePackAttribute;
	}

	public List<WebElement> getLblGradesBundlePackAttribute() {
		return lblGradesBundlePackAttribute;
	}

	public List<WebElement> getLblAgesBundlePackAttribute() {
		return lblAgesBundlePackAttribute;
	}

	public List<WebElement> getLblReadingLevelBundlePackAttribute() {
		return lblReadingLevelBundlePackAttribute;
	}

	@FindBy(locator = "dw.productdetail.bundlepack.title.item")
	private List<WebElement> lblTitleBundlePackAttribute;

	@FindBy(locator = "dw.productdetail.bundlepack.productattribute.lbl.grades")
	private List<WebElement> lblGradesBundlePackAttribute;

	@FindBy(locator = "dw.productdetail.bundlepack.productattribute.lbl.ages")
	private List<WebElement> lblAgesBundlePackAttribute;

	@FindBy(locator = "dw.productdetail.bundlepack.productattribute.lbl.readinglevel")
	private List<WebElement> lblReadingLevelBundlePackAttribute;

	@FindBy(locator = "dw.productdetail.lbl.recommend.icon")
	private WebElement iconRecommend;

	@FindBy(locator = "dw.productdetail.lbl.addtowishlist.teacher.icon")
	private WebElement iconWishList;

	@FindBy(locator = "dw.productdetail.pdp.items.pack.section")
	private WebElement itemSection;

	@FindBy(locator = "dw.productdetail.pdp.product.bundle")
	private WebElement itempack;

	@FindBy(locator = "dw.productdetail.pdp.product.about.reading.level")
	private WebElement aboutreadinglevellink;
	
	@FindBy(locator = "dw.productdetail.pdp.product.about.reading.level")
	private WebElement aaboutreadinglevellink;

	@FindBy(locator = "dw.productdetails.pdp.online.only")
	private WebElement lnkOnlineOnly;

	@FindBy(locator = "dw.productdetails.pdp.multiple.flyer.pop.up")
	private WebElement multipleFlyerPopUp;

	@FindBy(locator = "dw.productdetails.pdp.series.value")
	private WebElement serieslablevalue;
	
	@FindBy(locator = "dw.productdetail.pdp.addtocart.modal.window")
	private WebElement windowaddtocartpdppage;
	
	@FindBy(locator = "dw.productdetail.pdp.addtocart.modal.window")
	private List<WebElement> sizewindowaddtocartpdppage;
	
	@FindBy(locator = "dw.header.headercart.txt.cartquantity")
	private WebElement txtCartQuantity;
	
	public WebElement getTxtCartQuantity() {
		return txtCartQuantity;
	}
	
	public WebElement getwindowaddtocartpdppage() {
		return windowaddtocartpdppage;
	}
	
	public List<WebElement> sizewindowaddtocartpdppage() {
		return sizewindowaddtocartpdppage;
	}

	public WebElement getLnkOnlineOnly() {
		return lnkOnlineOnly;
	}

	public WebElement getMultipleFlyerPopUp() {
		return multipleFlyerPopUp;
	}

	public WebElement getSeriesValue() {
		return serieslablevalue;
	}

	public WebElement getItemSection() {
		return itemSection;
	}

	public WebElement getItemPack() {
		return itempack;
	}

	public WebElement getAboutReadingLevelLink() {
		return aboutreadinglevellink;
	}

	public WebElement getIconRecommend() {
		return iconRecommend;
	}

	public WebElement getIconWishList() {
		return iconWishList;
	}

	public WebElement getLblReadingLevelProductAttriute() {
		return lblReadingLevelProductAttriute;
	}

	public WebElement getClostListPopup() {
		return clostListPopup;
	}

	public WebElement getPlusExpand() {
		return plusExpand;
	}

	public WebElement getMinusCollapses() {
		return minusCollapses;
	}

	public WebElement getItemInPackActive() {
		return itemInPackActive;
	}

	public WebElement getLnkName() {
		return lnkName;
	}

	public WebElement getWishlistOrRecommandModel() {
		return wishlistOrRecommandModel;
	}

	public WebElement getModalWindow() {
		return modalWindow;
	}

	public WebElement getBodyWishList() {
		return bodyWishList;
	}

	public WebElement getIconNote() {
		return iconNote;
	}

	public WebElement getLnkCreateAccount() {
		return lnkCreateAccount;
	}

	public WebElement getLblProductName() {
		return lblProductName;
	}
	
	public WebElement getlblpdpproductminiattribute() {
		return lblpdpproductminiattribute;
	}
	
	public WebElement getdescshortdescpdp() {
		return descshortdescpdp;
	}
	
	public WebElement getdesclongdescpdp() {
		return desclongdescpdp;
	}
	
	public List<WebElement> sizelblMrktContainer() {
		return lblMrktContainer;
	}
	
	public WebElement getLblCategoryName() {
		return lblCategoryName;
	}

	public WebElement getDigitalFlyerPopup() {
		return digitalFlyerPopup;
	}

	public WebElement getLnkProductAttribution() {
		return lnkProductAttribution;
	}

	public WebElement getLnkAuthorName() {
		return lnkAuthorName;
	}

	public WebElement getLnkFacebookIcon() {
		return lnkFacebookIcon;
	}

	public WebElement getLnkPinterestIcon() {
		return lnkPinterestIcon;
	}

	public WebElement getLnkBreadCrumbLink(String breadCrumbLink) {
		lnkBreadCrumbLink = SCHUtils.findElement("dw.productdetail.lnk.breadcrumblink",
				breadCrumbLink);
		return lnkBreadCrumbLink;
	}

	public WebElement getImgProduct() {
		return imgProduct;
	}

	public WebElement getImgProductThumbnail() {
		return imgProductThumbnail;
	}

	public WebElement getLblMiniProductAttribute(String productAttribute) {
		lblMiniProductAttribute = SCHUtils.findElement(
				"dw.productdetail.miniattribute.lbl.productattribute", productAttribute);
		return lblMiniProductAttribute;
	}

	public WebElement getLblMiniProductAttributeValue(String productAttributeValue) {
		lblMiniProductAttributeValue = SCHUtils.findElement(
				"dw.productdetail.miniattribute.lbl.productattributevalue",
				productAttributeValue);
		return lblMiniProductAttributeValue;
	}

	public WebElement getLnkWriteFirstReview() {
		return lnkWriteFirstReview;
	}

	public WebElement getImgReviewStarImage() {
		return imgReviewStarImage;
	}

	public WebElement getLnkReadReview() {
		return lnkReadReview;
	}

	public WebElement getLblShortProductDescription() {
		return lblShortProductDescription;
	}

	public WebElement getLblWarningMessage() {
		return lblWarningMessage;
	}

	public WebElement getImgWarningIcon() {
		return imgWarningIcon;
	}

	public WebElement getLblProductPoints() {
		return lblProductPoints;
	}

	public WebElement getLblQuantity() {
		return lblQuantity;
	}

	public WebElement getTxtQuantity() {
		return txtQuantity;
	}

	public WebElement getBtnAddToCart() {
		return btnAddToCart;
	}

	public WebElement getLblRecommend() {
		return lblRecommend;
	}

	public WebElement getLblAddToWishList() {
		return lblAddToWishList;
	}
	public WebElement getLblSaveForLater() {
		return lblSaveForLater;
	}

	public WebElement getLblAvailableInValuePack() {
		return lblAvailableInValuePack;
	}

	public List<WebElement> getLstProductBundleName() {
		return lstProductBundleName;
	}

	public List<WebElement> getLstProductBundlePrice() {
		return lstProductBundlePrice;
	}

	public WebElement getBtnModelGoToCheckout() {
		return btnModelGoToCheckout;
	}

	public WebElement getBtnModelContinueShopping() {
		return btnModelContinueShopping;
	}

	public WebElement getProductDetails(String detail) {
		return SCHUtils.findElement("dw.productdetails.pdp.product.details", detail);
	}

	public WebElement getProductType(String producttype) {
		return SCHUtils.findElement("dw.productdetails.pdp.product.type", producttype);
	}

	public WebElement getProductInformationNearImage(String information) {
		return SCHUtils.findElement("dw.productdetail.pdp.product.information",
				information);
	}

	public WebElement getReadingLevel(String level) {
		return SCHUtils.findElement("dw.productdetail.pdp.reading.level", level);
	}
	public WebElement getAwards(String award) {
		return SCHUtils.findElement("dw.productdetail.pdp.award", award);
	}

	public WebElement getLblMainProductAttribute(String productAttribute) {
		try {
			lblMainProductAttribute = SCHUtils.findElement(
					"dw.productdetail.mainattribute.lbl.productattribute",
					productAttribute);
		} catch (Exception e) {
		}
		return lblMainProductAttribute;
	}

	public WebElement getLblMainProductAttributeValue(String productAttributeValue) {
		try {
			lblMainProductAttributeValue = SCHUtils.findElement(
					"dw.productdetail.mainattribute.lbl.productattributevalue",
					productAttributeValue);
		} catch (Exception e) {
		}
		return lblMainProductAttributeValue;
	}

	public WebElement getLblSummary() {
		return lblSummary;
	}

	public WebElement getLnkSeeFullDetails() {
		return lnkSeeFullDetails;
	}

	public WebElement getLnkBreadCrumbLink() {
		return lnkBreadCrumbLink;
	}

	public WebElement getLblMiniProductAttribute() {
		return lblMiniProductAttribute;
	}

	public WebElement getLblMiniProductAttributeValue() {
		return lblMiniProductAttributeValue;
	}

	public WebElement getLblMainProductAttribute() {
		return lblMainProductAttribute;
	}

	public WebElement getLblMainProductAttributeValue() {
		return lblMainProductAttributeValue;
	}

	public WebElement getInputCreateNewWishList() {
		return inputCreateNewWishList;
	}

	public List<WebElement> getLblStudentNameWishList() {
		return lblStudentNameWishList;
	}

	public WebElement getLblPoints() {
		return lblPoints;
	}
	
	@FindBy(locator = "dw.studentflyerorder.yto.firstitem.itemno")
	private WebElement lblytofirstitemitemno;
	
	public WebElement getlblytofirstitemitemno() {
		return lblytofirstitemitemno;
	}

	@Override
	public void openPage() {
		// Code To open Forgot Account Page
	}

	@Override
	protected void initParent() {

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
		WaitUtils.waitForEnabled(getBtnAddToCart());
		WaitUtils.waitForDisplayed(getBtnAddToCart());
	}

	@Override
	public void verifyAddToCartBtn() {
		AssertUtils.assertDisplayed(getBtnAddToCart());
	}

	@Override
	public void selectProductFromSearchPage() {
		getLnkName().click();
		PauseUtil.pause(2000);
	}

	@Override
	public void selectAddToCartBtn() {
		getBtnAddToCart().click();
	}

	@Override
	public void verifyModalWindow() {
		AssertUtils.assertDisplayed(getModalWindow());
	}

	@Override
	public void checkQuentity(String qty) {
		SCHUtils.clickUsingJavaScript(getLblQuantity());
		getTxtQuantity().click();
		new ProductDetailPage();
		AssertUtils.assertAttributeMatches(getTxtQuantity(), "value",
				Matchers.equalToIgnoringCase(qty));
	}

	@Override
	public void addQuentity(String qty) {
		getTxtQuantity().clear();
		getTxtQuantity().sendKeys(qty);
	}

	@Override
	public void verifyContinueShoppingBtn() {
		AssertUtils.assertDisplayed(getBtnModelContinueShopping());
	}

	@Override
	public void selectContinueShoppingBtn() {
		getBtnModelContinueShopping().click();
	}

	@Override
	public void checkQuentityAsTextBox() {
		AssertUtils.assertAttributeMatches(getTxtQuantity(), "type",
				Matchers.equalToIgnoringCase("text"));
	}

	@Override
	public void checkItemInPackAreaNotActive() {
		try {
			AssertUtils.assertDisplayed(getItemInPackActive());
			Assert.assertTrue(false, "Element present");
		} catch (Exception e) {
			// Default collapses
			Assert.assertTrue(true, "Element not present");
		}
	}

	@Override
	public void clickOnExpand() {
		getPlusExpand().click();
		PauseUtil.pause(1000);
		new ProductDetailPage();
		AssertUtils.assertDisplayed(getItemInPackActive());
	}

	@Override
	public void clickOnCollapses() {
		getMinusCollapses().click();
		PauseUtil.pause(1000);
		new ProductDetailPage();
		try {
			AssertUtils.assertDisplayed(getItemInPackActive());
			Assert.assertTrue(false, "Element present");
		} catch (Exception e) {
			// Default collapses
			Assert.assertTrue(true, "Element not present");
		}
	}

	@Override
	public void verifyRecommandedAndWishlistButton() {
		SCHUtils.scrollToView(getLblRecommend());
		AssertUtils.assertDisplayed(getLblRecommend());
		SCHUtils.scrollToView(getLblTeacherAddToWishList());
		AssertUtils.assertDisplayed(getLblTeacherAddToWishList());
	}

	@Override
	public void verifyRecommandedAndWishlistButtonNotDisplay() {

		try {
			AssertUtils.assertDisplayed(getLblRecommend());
			Assert.assertTrue(false, "Recommended Element Display");
		} catch (Exception e) {
			Assert.assertTrue(true, "Recommended Element not Display");
		}

		try {
			AssertUtils.assertDisplayed(getLblTeacherAddToWishList());
			Assert.assertTrue(false, "Wishlist Element Display");
		} catch (Exception e) {
			Assert.assertTrue(true, "Wishlist Element not Display");
		}

	}

	@Override
	public void verifySaveForLaterButton() {
		AssertUtils.assertDisplayed(getSaveForLater());
		AssertUtils.assertTextMatches(getSaveForLater(),
				Matchers.containsString("Save for Later"));
	}

	@Override
	public void verifyPointSelectedView() {
		SCHUtils.clickUsingJavaScript(getLblProductPoints());
		PauseUtil.pause(2000);
		new ProductDetailPage();
		AssertUtils.assertAttributeMatches(getLblProductPoints(), "class",
				Matchers.containsString("pricepoints-toggled"));
	}

	@Override
	public void verifyWishListModel() {
		PauseUtil.pause(2000);
		SCHUtils.clickUsingJavaScript(getLblTeacherAddToWishList());
		if (!SCHUtils.isPresent(getWishlistOrRecommandModel())) {
			getLblTeacherAddToWishList().click();
		}
		AssertUtils.assertDisplayed(getWishlistOrRecommandModel());
	}

	@Override
	public void verifyRecommendedModel() {
		PauseUtil.pause(2000);
		SCHUtils.clickUsingJavaScript(getLblRecommend());
		getLblRecommend().click();
		AssertUtils.assertDisplayed(getWishlistOrRecommandModel());
	}

	@Override
	public void addPOProductDetails(String childname) {
		SCHUtils.addPOProductItem(fillDonationProductInfoBean(childname));
	}

	public ProductInfoBean fillDonationProductInfoBean(String childname) {
		ProductInfoBean product = new ProductInfoBean();
		product.setItemNumber("donation");

		product.setStudentName(childname);

		if (SCHUtils.isPresent(getLblMainProductAttributeValue("Grades"))) {
			product.setGrades(getLblMainProductAttributeValue("Grades").getText());
		}
		if (SCHUtils.isPresent(getLblMainProductAttributeValue("Ages"))) {
			product.setAges(getLblMainProductAttributeValue("Ages").getText());
		}

		if (SCHUtils.isPresent(getLblReadingLevel())) {
			product.setReadingLevel(getLblReadingLevel().getText());
		}
		if (SCHUtils.isPresent(getLblProductName())) {
			product.setItemTitle(getLblProductName().getText());
		}
		if (SCHUtils.isPresent(getLblProductPrice())) {
			product.setPrice(getLblProductPrice().getText());
		}
		if (SCHUtils.isPresent(getLblProductPoints())) {
			product.setPoints(getLblProductPoints().getText());
		}
		if (SCHUtils.isPresent(getLnkAuthorName())) {
			product.setAuthor(getLnkAuthorName().getText());
		}
		if (SCHUtils.isPresent(getTxtQuantity())) {
			product.setQuantity(getTxtQuantity().getAttribute("value"));
		}
		return product;
	}

	/**
	 * @author harshit.trivedi
	 *         modified
	 *         create separate method to fill bean for parent and teacher.
	 */
	@Override
	public void addYTOProductDetails() {
		ProductInfoBean product = fillproductInfoBean();
		SCHUtils.addYTOProductItem(product);
	}

	@Override
	public void addParentProductDetails() {
		ProductInfoBean product = fillproductInfoBeanFORWishList();
		SCHUtils.addParentroductItem(product);
	}

	public ProductInfoBean fillproductInfoBean() {
		ProductInfoBean product = new ProductInfoBean();
		PauseUtil.pause(500);
		if (SCHUtils.isPresent(getLblMainProductAttributeValue("Item"))) {
			if (getTestBase().getContext()
					.getProperty("testexecution.ytorecommendetion") != null
					&& getTestBase().getContext()
							.getProperty("testexecution.ytorecommendetion").toString()
							.equalsIgnoreCase("true")) {
				getTestBase().getContext().setProperty(
						"testexecution.ytorecommendeditemid",
						getLblMainProductAttributeValue("Item").getText().split(" ")[0]
								.replace("#", "").trim());

			}
			product.setItemNumber(
					getLblMainProductAttributeValue("Item").getText().split(" ")[0]
							.replace("#", "").trim());

		}
		if (SCHUtils.isPresent(getLblMainProductAttributeValue("Grades"))) {
			product.setGrades(getLblMainProductAttributeValue("Grades").getText().trim());
		}
		if (SCHUtils.isPresent(getLblMainProductAttributeValue("Ages"))) {
			product.setAges(getLblMainProductAttributeValue("Ages").getText().trim());
		}

		if (SCHUtils.isPresent(getLblReadingLevel())) {
			product.setReadingLevel(getLblReadingLevel().getText().trim());
		}
		/*
		 * System.out.println("True or false"
		 * +
		 * SCHUtils.isPresent(getLblMainProductAttributeValue("In this Pack")));
		 * if
		 * (SCHUtils.isPresent(getLblMainProductAttributeValue("In this Pack")))
		 * {
		 * product.setInThisPack(getLblMainProductAttributeValue("In this Pack")
		 * .getText());
		 * }
		 * if (SCHUtils.isPresent(getLblMainProductAttributeValue("Series"))) {
		 * product.setSeries(getLblMainProductAttributeValue("Series").getText()
		 * )
		 * ;
		 * }
		 */
		if (SCHUtils.isPresent(getLblProductName())) {
			product.setItemTitle(getLblProductName().getText().trim());
		}
		if (SCHUtils.isPresent(getLblProductPrice())) {
			product.setPrice(getLblProductPrice().getText().trim());
		}
		if (SCHUtils.isPresent(getLblProductPoints())) {
			product.setPoints(getLblProductPoints().getText().trim());
		}
		if (SCHUtils.isPresent(getLnkAuthorName())) {
			product.setAuthor(getLnkAuthorName().getText().trim());
		}
		if (SCHUtils.isPresent(getTxtQuantity())) {
			product.setQuantity(getTxtQuantity().getAttribute("value").trim());
		}
		return product;
	}

	public ProductInfoBean fillproductInfoBeanFORWishList() {
		ProductInfoBean product = new ProductInfoBean();
		if (SCHUtils.isPresent(getLblMainProductAttributeValue("Item"))) {
			product.setItemNumber(
					getLblMainProductAttributeValue("Item").getText().split(" ")[0]
							.replace("#", "").trim());
		}
		if (SCHUtils.isPresent(getLblMainProductAttributeValue("Grades"))) {
			product.setGrades(getLblMainProductAttributeValue("Grades").getText().trim());
		}
		if (SCHUtils.isPresent(getLblMainProductAttributeValue("Ages"))) {
			product.setAges(getLblMainProductAttributeValue("Ages").getText().trim());
		}

		if (SCHUtils.isPresent(getLblReadingLevel())) {
			product.setReadingLevel(getLblReadingLevel().getText().trim());
		}
		if (SCHUtils.isPresent(getLblProductName())) {
			String productName = getLblProductName().getText().trim();
			if (productName.contains(":")) {
				productName = productName.substring(productName.indexOf(":") + 1,
						productName.length());
			}
			product.setItemTitle(productName);
		}
		if (SCHUtils.isPresent(getLblProductPrice())) {
			product.setPrice(getLblProductPrice().getText().trim());
		}
		if (SCHUtils.isPresent(getLblProductPoints())) {
			product.setPoints(getLblProductPoints().getText().trim());
		}
		if (SCHUtils.isPresent(getLnkAuthorName())) {
			product.setAuthor(getLnkAuthorName().getText().trim());
		}
		if (SCHUtils.isPresent(getTxtQuantity())) {
			product.setQuantity(getTxtQuantity().getAttribute("value").trim());
		}
		return product;
	}

	private WebElement getLblReadingLevel() {
		return lblReadingLevel;
	}

	public void updateQuantityAsPerOrderPrice() {
		if (TestBaseProvider.getTestBase().getTestData()
				.getString("specificAmttOrder") != null
				&& TestBaseProvider.getTestBase().getTestData()
						.getString("specificAmttOrder").equalsIgnoreCase("true")) {
			Configuration data = TestBaseProvider.getTestBase().getTestData();
			String orderPrice = data.getString("orderprice");
			String productPrice = getLblProductPrice().getText();

			Double intorderPrice = Double.parseDouble(orderPrice);
			Double intproductPrice = SCHUtils.getPriceWithOutCurrency(productPrice);
			if (intorderPrice > intproductPrice) {
				Double quantity = intorderPrice / intproductPrice;
				Integer intQuantity = quantity.intValue() + 5;
				System.out.println(intQuantity);
				getTxtQuantity().clear();
				getTxtQuantity().sendKeys(intQuantity.toString());

			}
		}
	}

	@Override
	public void verifyPDPPage() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.pause(2000);
		// new ProductDetailPage();
		AssertUtils.assertDisplayed(getImgProduct());
		AssertUtils.assertDisplayed(getImgProductThumbnail());
		AssertUtils.assertDisplayed(getLblProductName());
	}

	@Override
	public void clickOnAddToCartandCheckout() {
		getBtnAddToCart().click();
		if (TestBaseProvider.getTestBase().getTestData().getString("module") != null
				&& TestBaseProvider.getTestBase().getTestData().getString("module")
						.equalsIgnoreCase("teacher")) {
			addYTOProductDetails();
		}
		// If require add condition for filling parent order bean
		WaitUtils.waitForDisplayed(getBtnModelGoToCheckout());
		PauseUtil.pause(5000);
		getBtnModelGoToCheckout().click();

	}

	@Override
	public String getItemNumber() {
		System.out.println(
				"item id....." + getLblMainProductAttributeValue("Item").getText());
		return getLblMainProductAttributeValue("Item").getText().split(" ")[0]
				.replace("#", "");
	}

	/**
	 * This method
	 * add item information
	 * to Product bean for parent
	 */
	@Override
	public ProductInfoBean fillProductInfoBean(String childName) {
		PauseUtil.waitForAjaxToComplete(5000);
		ProductInfoBean productInfoBean = fillproductInfoBean();
		productInfoBean.setStudentName(childName);

		return productInfoBean;
	}

	@Override
	public void verifyDigitalFlyerProductPopup() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.pause(8000);
		AssertUtils.assertDisplayed(getDigitalFlyerPopup());
	}

	@Override
	public void addDigitalFlyerItemToCart() {
		String itemID = getLblMainProductAttributeValue("Item").getText().split(" ")[0]
				.replace("#", "");
		TestBaseProvider.getTestBase().getContext()
				.setProperty("testexecution.digitalFlyerId", itemID);
		ProductInfoBean product = fillproductInfoBean();
		SCHUtils.addYTOProductItem(product);
		getBtnAddToCart().click();
		WaitUtils.waitForDisplayed(getBtnModelContinueShopping());
		getBtnModelContinueShopping().click();

	}

	@Override
	public void verifyProductPriceInDollarsOnly() {
		WaitUtils.waitForDisplayed(getLblProductPrice());
		String productPrice = getLblProductPrice().getText().trim();
		Assert.assertTrue(productPrice.contains("$"));
		Double intproductPrice = SCHUtils.getPriceWithOutCurrency(productPrice);
		Assert.assertTrue(intproductPrice > 0.0);
	}

	public ProductInfoBean fillWishListProductInfoBean(String childname) {
		ProductInfoBean product = new ProductInfoBean();
		product.setItemNumber(getItemNumber());
		product.setStudentName(childname);

		if (SCHUtils.isPresent(getLblMainProductAttributeValue("Grades"))) {
			product.setGrades(getLblMainProductAttributeValue("Grades").getText());
		}
		if (SCHUtils.isPresent(getLblMainProductAttributeValue("Ages"))) {
			product.setAges(getLblMainProductAttributeValue("Ages").getText());
		}

		if (SCHUtils.isPresent(getLblReadingLevel())) {
			product.setReadingLevel(getLblReadingLevel().getText());
		}
		if (SCHUtils.isPresent(getLblProductName())) {
			product.setItemTitle(getLblProductName().getText());
		}
		if (SCHUtils.isPresent(getLblProductPrice())) {
			product.setPrice(getLblProductPrice().getText());
		}
		if (SCHUtils.isPresent(getLblProductPoints())) {
			product.setPoints(getLblProductPoints().getText());
		}
		if (SCHUtils.isPresent(getLnkAuthorName())) {
			product.setAuthor(getLnkAuthorName().getText());
		}
		if (SCHUtils.isPresent(getTxtQuantity())) {
			product.setQuantity(getTxtQuantity().getAttribute("value"));
		}

		return product;
	}

	public void addWishListProductDetails(String childname) {
		SCHUtils.addWishListProductInfoBean(fillWishListProductInfoBean(childname));
	}
	@Override
	public void verifySignInFunctionality() {
		LoginPage loginPage = new LoginPage();
		Assert.assertTrue(SCHUtils.isPresent(loginPage.getTxtUsername()));
		Assert.assertTrue(SCHUtils.isPresent(loginPage.getTxtPassword()));
		Assert.assertTrue(SCHUtils.isPresent(loginPage.getLnkForgotAccount()));
		loginPage.getTxtUsername().clear();
		loginPage.getTxtUsername()
				.sendKeys(getTestBase().getTestData().getString("userid"));
		loginPage.getTxtPassword().clear();
		loginPage.getTxtPassword()
				.sendKeys(getTestBase().getTestData().getString("password"));
		WaitUtils.waitForDisplayed(loginPage.getBtnSignOn());
		Assert.assertTrue(SCHUtils.isPresent(loginPage.getBtnSignOn()));
		loginPage.getTxtUsername().clear();
		loginPage.getTxtPassword().clear();
	}

	

	@Override
	public void verifyWishListSection() {
		WaitUtils.waitForDisplayed(getLblAddToWishList());
		Actions actions = new Actions(getDriver());
		actions.moveToElement(getLblAddToWishList()).click().build().perform();
		// SCHUtils.clickUsingJavaScript(getLblAddToWishList());
		getinputCreateNewWishList().click();
		Assert.assertTrue(SCHUtils.isPresent(getBodyWishList()));
		Assert.assertTrue(SCHUtils.isPresent(getBtnCreateNewWishList()));
		Assert.assertTrue(SCHUtils.isPresent(getinputCreateNewWishList()));
		Assert.assertTrue(getLblWishListTitle().getText().trim()
				.equalsIgnoreCase(ConstantUtils.ADD_TO_MY_LIST));
		Assert.assertTrue(SCHUtils.isPresent(getLnkWishListClose()));
		Map<String, UserProfileBean> product_info = SCHUtils.getChildTeacherDetails();
		List<WebElement> childname_wishlist = getChildNameWishList();
		for (String key : product_info.keySet()) {
			UserProfileBean details = product_info.get(key);
			System.out.println("---------------------" + details.getChildName());
			// Assert.assertTrue(childname_wishlist.get(0).getText().contains(details.getChildName()));
		}
		Assert.assertTrue(childname_wishlist.size() == product_info.size());
		// getLnkWishListClose().click();
		SCHUtils.clickUsingJavaScript(getLnkWishListClose());
	}

	@Override
	public void addItemToClassRoomWishList(boolean isRecommendation,
			boolean isClassroomWishlist, boolean isSaveForLater) {
		WaitUtils.waitForDisplayed(getLblProductPrice());
		SCHUtils.scrollToView(getLblProductPrice());
		System.out.println("going to add item to wishlist");
		getLblTeacherAddToWishList().click();
		PauseUtil.pause(10000);
		List<WebElement> checkbox_list = getCheckBoxesWishList();
		List<WebElement> checkbox_name = getChildNameWishList();
		for (int i = 0; i < checkbox_name.size(); i++) {
			if (isRecommendation && checkbox_name.get(i).getText().trim()
					.equalsIgnoreCase("Recommendations to Students")) {
				if (!checkbox_list.get(i).isSelected()) {
					new ProductDetailPage();
					SCHUtils.clickUsingJavaScript(checkbox_list.get(i));
					// checkbox_list.get(i).click();
				}
			}
			if (isClassroomWishlist && checkbox_name.get(i).getText().trim()
					.equalsIgnoreCase("Classroom Wish list")) {
				if (!checkbox_list.get(i).isSelected()) {
					checkbox_list.get(i).click();
				}
			}
			if (isClassroomWishlist && checkbox_name.get(i).getText().trim()
					.equalsIgnoreCase("Save for Later")) {
				if (!checkbox_list.get(i).isSelected()) {
					checkbox_list.get(i).click();
				}
			}
		}
		// update quantity as per requirement
	}

	@Override
	public void verifyNoteSection() {
		WaitUtils.waitForDisplayed(getIconNote());
		Assert.assertTrue(SCHUtils.isPresent(getIconNote()));
		getIconNote().click();
		Assert.assertTrue(SCHUtils.isPresent(getNoteModel()));
		Assert.assertTrue(SCHUtils.isPresent(getLnkCloseNoteModel()));

	}

	public void verifyCreateNewListOptionAndFunctionality() {
		PauseUtil.pause(5000);
		WaitUtils.waitForDisplayed(getLblTeacherAddToWishList());
		// SCHUtils.clickUsingJavaScript(getLblAddToWishList());
		Actions action = new Actions(getDriver());
		action.moveToElement(getLblTeacherAddToWishList()).click().build().perform();
		PauseUtil.pause(2000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		getinputCreateNewWishList().click();
		Assert.assertTrue(SCHUtils.isPresent(getBodyWishList()));
		Assert.assertTrue(SCHUtils.isPresent(getBtnCreateNewWishList()));
		Assert.assertTrue(SCHUtils.isPresent(getinputCreateNewWishList()));
		// Assert.assertTrue(getLblWishListTitle().getText().trim()
		// .equalsIgnoreCase(ConstantUtils.ADD_TO_MY_LIST));
		// getLblProductName().click();
		// Assert.assertTrue(SCHUtils.isPresent(getLnkWishListClose()));
		SCHUtils.clickUsingJavaScript(lnkWishListClose);
		// getLnkWishListClose().click();

	}

	public void verifyMaximumNumberOfListAdded(Configuration testData, int arg1) {
		SCHUtils.clickUsingJavaScript(getLblAddToWishList());
		Map<String, UserProfileBean> product_info = SCHUtils.getChildTeacherDetails();
		int childcount = 0;
		for (String key : product_info.keySet()) {
			// UserProfileBean details = product_info.get(key);
			childcount = childcount + 1;
		}
		System.out.println("childcount--" + childcount);
		int max_limit = childcount + arg1;
		System.out.println("max_limit---" + max_limit);
		for (int i = 0; i < arg1; i++) {
			PauseUtil.pause(3000);
			SCHUtils.clickUsingJavaScript(getLblAddToWishList());
			String strListName = "TEST-PDP" + i;
			getWishlistInputOnPDP().click();
			getWishlistInputOnPDP().sendKeys(strListName);
			getBtnCreateNewWishList().click();
			SCHUtils.clickUsingJavaScript(getLblShortProductDescription());
		}
		SCHUtils.clickUsingJavaScript(getLblAddToWishList());
		PauseUtil.pause(5000);
		int intAfterlist = getCheckBoxesWishList().size();
		System.out.println("intAfterlist--" + intAfterlist);
		Assert.assertTrue(max_limit == intAfterlist);
	}

	public void verifyHoveringActionOnAddToWishList() {
		PauseUtil.pause(3000);
		Actions action = new Actions(getDriver());
		action.moveToElement(getTxtAddToList());
		SCHUtils.mouseHoverJScript(getTxtAddToList());
		PauseUtil.pause(500);

		SCHUtils.clickUsingJavaScript(getTxtAddToList());
		AssertUtils.assertDisplayed(getPopUpWishListModel());
	}

	public void verifyChildrenSortedByGradeOrder() {
		PauseUtil.pause(10000);
		SCHUtils.clickUsingJavaScript(getTxtAddToList());
		Map<String, UserProfileBean> product_info = SCHUtils.getChildTeacherDetails();
		boolean flag = false;

		List<String> gradelist = new ArrayList<String>();
		for (String key : product_info.keySet()) {
			for (int i = 0; i < getChildNameWishList().size(); i++) {
				if (getChildNameWishList().get(i).getText()
						.equals(product_info.get(key).getChildGrade())) {
					gradelist.add(product_info.get(key).getChildGrade());
				}
			}
		}
		List<String> sortedList = new ArrayList<String>(gradelist);
		Collections.sort(sortedList);
		flag = sortedList.equals(gradelist);
		Assert.assertTrue(flag, "List is not sorted");

	}

	public void verifyCreateNewListLabel() {
		SCHUtils.clickUsingJavaScript(getTxtAddToList());
		AssertUtils.assertDisplayed(getBtnCreateNewWishList());
	}

	public void verifyAfterChildrenListAreinAlphabeticalOrder() {
		SCHUtils.clickUsingJavaScript(getTxtAddToList());
		Map<String, UserProfileBean> product_info = SCHUtils.getChildTeacherDetails();
		boolean flag = false;
		List<String> wishlist = new ArrayList<String>();
		for (int i = 0; i < getChildNameWishList().size(); i++) {
			for (String key : product_info.keySet()) {
				if (!getChildNameWishList().get(i).getText()
						.contains(product_info.get(key).getChildName().split(" ")[0])) {
					wishlist.add(product_info.get(key).getChildName().split(" ")[0]);
				}
			}
		}
		List<String> sortedList = new ArrayList<String>(wishlist);
		Collections.sort(sortedList);
		flag = sortedList.equals(wishlist);
		Assert.assertTrue(flag, "List is not sorted");
	}

	public void addItemBySelectingCheckBox() {
		WaitUtils.waitForDisplayed(getTxtAddToList());
		Actions action = new Actions(getDriver());
		action.moveToElement(getTxtAddToList());
		List<WebElement> checkbox_list = getCheckBoxesWishList();
		List<WebElement> checkbox_name = getChildNameWishList();
		int count = 0;
		for (int i = 0; i < checkbox_name.size(); i++) {
			checkbox_list.get(i).click();
			count = count + 1;
		}

		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.SELECTED_LIST_SIZE, count);
	}

	@Override
	public void verifyProductPriceAndPoints() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyPriceSelectedDefault() {
		AssertUtils.assertAttributeMatches(getLblProductPrice(), "class",
				Matchers.containsString("pricepoints-toggled"));

	}

	@Override
	public void verifyPriceSelectedView() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyModelWindowInformation() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyMostRecommended() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyRecommandedORWishlistBox() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectProductForMultipleList() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyQuentityInput() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyDefaultQuentityInput() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyProductInList(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deSelectProductForMultipleList() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyDefaultStarAndHeartIcon() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifySelectedHeartAndStarIcon() {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyAddingIlligalOptionsInQTYField() {
		getTxtQuantity().clear();
		getTxtQuantity().sendKeys("#2@");
		System.out.println(getTxtQuantity().getText().isEmpty());
		Assert.assertTrue(getTxtQuantity().getText().isEmpty());
		PauseUtil.pause(1000);
		getTxtQuantity().sendKeys("ABC");
		Assert.assertTrue(getTxtQuantity().getText().isEmpty());
		PauseUtil.pause(1000);
		getTxtQuantity().sendKeys("-10");
		Assert.assertTrue(getTxtQuantity().getText().isEmpty());

	}

	@Override
	public void verifyQuntityFieldDefaultValue(int defaultQTYValue) {

		System.out.println("****************" + getTxtQuantity().getAttribute("value"));
		AssertUtils.assertAttributeMatches(getTxtQuantity(), "value",
				Matchers.containsString(Integer.toString(defaultQTYValue)));

	}

	@Override
	public void verifyAddCartButtonIsActive() {
		AssertUtils.assertEnabled(getBtnAddToCart());

	}

	@Override
	public void verifyAddingMaxValueInQTYField(int maxQTYValue) {
		PauseUtil.pause(2000);
		getTxtQuantity().clear();
		getTxtQuantity().sendKeys(Integer.toString(maxQTYValue));
		PauseUtil.pause(1000);
		AssertUtils.assertAttributeMatches(getTxtQuantity(), "value",
				Matchers.containsString(Integer.toString(maxQTYValue)));
	}

	@Override
	public void verifyFourDigitValueInQTY() {
		AssertUtils.assertAttributeMatches(getTxtQuantity(), "maxlength",
				Matchers.containsString("3"));

	}

	@Override
	public void selectBundlePackItem() {
		PauseUtil.pause(2000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		getLblBundlePackProducts().get(0).click();
		PauseUtil.pause(2000);
	}

	@Override
	public void clickOnSearchItemPackDrawer() {
		PauseUtil.pause(2000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		((JavascriptExecutor) getDriver()).executeScript(
				"arguments[0].scrollIntoView(true);", getLnkSeeItemsInThisPack());
		getLnkSeeItemsInThisPack().click();
		PauseUtil.pause(5000);

		((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(0,800)");
		PauseUtil.pause(5000);

	}

	@Override
	public void verifyItemCountInBundlePack() {
		PauseUtil.pause(2000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		Assert.assertTrue(getLblBundlePackSeeItemsInPack().size() >= 3);

	}

	@Override
	public void VerifyItemAttributes() {
		waitForPageLoad();
		AssertUtils.assertDisplayed(getImgBundlePackAttribute().get(0));
		AssertUtils.assertDisplayed(getLblTitleBundlePackAttribute().get(0));
		AssertUtils.assertDisplayed(getLblGradesBundlePackAttribute().get(0));
		AssertUtils.assertDisplayed(getLblAgesBundlePackAttribute().get(0));
		AssertUtils.assertDisplayed(getLblReadingLevelBundlePackAttribute().get(0));
		System.out.println("product attribute verified.....");
	}

	@Override
	public void verifySEEItemsInThisPackIsNotPresent() {
		waitForPageLoad();
		PauseUtil.pause(2000);
		try {
			AssertUtils.assertNotDisplayed(getLnkSeeItemsInThisPack());

		} catch (Exception e) {
			System.out.println(
					"See Item In this pack link is not present as expected.........");
		}

	}

	@Override
	public void verifyIsNotBundlePackItem() {
		waitForPageLoad();
		try {
			AssertUtils.assertNotDisplayed(getLblMiniProductAttribute("In this Pack"));
		} catch (Exception e) {
			System.out.println(
					"This is not a bundle pack Item as Items in this pack attribute is not present");
		}

	}

	@Override
	public void verifyPackBundleOnlyAvailableItemNotClickable() {

		int size = getLblItemBundlePackItemOnlyAvailableInPack().size();

		for (int i = 0; i < size; i++) {

			WebElement itemContentBundlePack =
					getLblItemBundlePackItemOnlyAvailableInPack().get(i);
			System.out.println(
					getLblItemBundlePackItemOnlyAvailableInPack().get(i).getText());
			AssertUtils.assertDisplayed(itemContentBundlePack);
		}
		System.out.println(
				"verify that not available to shop items Content is not clickable");
	}

	@Override
	public void verifyOnlyAvailableInBundlePackItemAttributes() {
		waitForPageLoad();
		AssertUtils.assertDisplayed(getImgBundlePackAttribute().get(0));
		AssertUtils.assertDisplayed(getLblTitleBundlePackAttribute().get(0));
		AssertUtils.assertDisplayed(getLblGradesBundlePackAttribute().get(0));
		AssertUtils.assertDisplayed(getLblAgesBundlePackAttribute().get(0));
		AssertUtils.assertDisplayed(getLblReadingLevelBundlePackAttribute().get(0));

		int size = getLblItemBundlePackItemOnlyAvailableInPack().size();

		if (size != 0) {
			for (int i = 0; i < size; i++) {

				AssertUtils.assertDisplayed(getLblOnlyAvailableInPack().get(i));

			}
		} else {
			for (int i = 0; i < size; i++) {
				AssertUtils.assertNotDisplayed(getLblOnlyAvailableInPack().get(i));
			}
		}
		System.out.println("product attribute verified.....");
	}

	@Override
	public void verifyProductDetails() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.pause(5000);
		AssertUtils.assertDisplayed(getProductDetails("Grades"));
		AssertUtils.assertDisplayed(getProductDetails("Ages"));
		AssertUtils.assertDisplayed(getProductType("Subject"));
		AssertUtils.assertDisplayed(getProductType("Page Count"));
		// AssertUtils.assertDisplayed(getProductType("Dimensions"));
		AssertUtils.assertDisplayed(getProductType("ISBN"));
		AssertUtils.assertDisplayed(getProductType("Product Type"));
	}
	@Override
	public void verifySaveForLaterLbl() {
		AssertUtils.assertDisplayed(getLblSaveForLater());
		try {
			AssertUtils.assertNotDisplayed(getLblAddToWishList());
			AssertUtils.assertNotDisplayed(getLblRecommend());
		} catch (Exception e) {

		}
	}
	@Override
	public void verifyItemFlyer() {
		AssertUtils.assertDisplayed(getItemType());

		getItemValue().click();
	}

	@Override
	public void verifyReccomendAndWishListInFillState() {
		SCHUtils.waitForLoaderToDismiss();
		Assert.assertFalse(getIconRecommend().getAttribute("class").contains("o"),
				"Class Name Should Not Contains 'o' to be Selected"
						+ getIconRecommend().getAttribute("class"));
		Assert.assertFalse(getIconWishList().getAttribute("class").contains("o"),
				"Class Name Should Not Contains 'o' to be Selected"
						+ getIconRecommend().getAttribute("class"));
	}

	@Override
	public void verifyBundlePackItems(Configuration testData) {

		String bundleItems[] =
				SCHUtils.getArrayFromStringData(testData.getString("bundlepackitems"));
		int size = bundleItems.length;
		List<String> listBundleItems = new ArrayList<String>();

		listBundleItems.addAll(Arrays.asList(bundleItems));

		for (int i = 0; i < listBundleItems.size(); i++) {
			System.out.println(listBundleItems.get(i));
			System.out.println(getLblTitleBundlePackAttribute().get(i).getText());
			Assert.assertEquals(listBundleItems.get(i),
					getLblTitleBundlePackAttribute().get(i).getText());

		}

		/*
		 * Iterator itr = listBundleItems.iterator();
		 * int i = 0;
		 * while (itr.hasNext()) {
		 * System.out.println(itr.next());
		 * System.out.println(getLblTitleBundlePackAttribute().get(i).getText())
		 * ;
		 * Assert.assertEquals(itr.next(),
		 * getLblTitleBundlePackAttribute().get(i).getText());
		 * AssertUtils.assertTextMatches(getLblTitleBundlePackAttribute().
		 * get(i),
		 * Matchers.containsString((String) itr.next()));
		 * i++;
		 * }
		 */

	}

	@Override
	public void clickOnMinusSearchItemPackDrawer() {
		WaitUtils.waitForDisplayed(getMinusCollapses());
		getMinusCollapses().click();
		PauseUtil.pause(2000);

	}

	@Override
	public void verifyBundleItemsDrawerPack() {

		AssertUtils.assertDisplayed(getImgBundlePackAttribute().get(0));
		AssertUtils.assertDisplayed(getLblTitleBundlePackAttribute().get(0));
		AssertUtils.assertDisplayed(getLblGradesBundlePackAttribute().get(0));
		AssertUtils.assertDisplayed(getLblAgesBundlePackAttribute().get(0));
		AssertUtils.assertDisplayed(getLblReadingLevelBundlePackAttribute().get(0));
	}

	@Override
	public void verifyPreOrderButton() {
		Assert.assertEquals(getBtnAddToCart().getText(), ConstantUtils.PRE_ORDER);
		getBtnAddToCart().click();
	}

	@Override
	public void hoverReadingLevel() {
		Actions action = new Actions(getDriver());
		action.moveToElement(getLblReadingLevel()).click().build().perform();
		PauseUtil.pause(5000);

	}
	/* author Nikhil */
	@Override
	public void verifyProductInformation() {
		SCHUtils.waitForLoaderToDismiss();

		PauseUtil.pause(5000);

		getProductInformationNearImage("Item");

		getProductInformationNearImage("Grades");

		getProductInformationNearImage("Ages");

		getProductInformationNearImage("In this Pack");

		getProductInformationNearImage("Series");

		getReadingLevel("Reading Level");

		// getAwards("Award");

		SCHUtils.mouseHoverOnElement(getLnkOnlineOnly());

		PauseUtil.pause(4000);
		PauseUtil.waitForAjaxToComplete();

		AssertUtils.assertPresent((ExtendedElement) getMultipleFlyerPopUp());
		if (!TestBaseProvider.getTestBase().getContext().getString("driver.name")
				.equals("IE")) {
			SCHUtils.mouseHoverOnElement(getReadingLevel("Reading Level"));
		} else {
			System.out.println("in IE....");
			SCHUtils.mouseHoverJScript(getReadingLevel("Reading Level"));
		}
		PauseUtil.pause(2000);
		AssertUtils.assertDisplayed(getReadingLevelPopUp());

		SCHUtils.mouseHoverOnElement(getProductInformationNearImage("Ages"));
		PauseUtil.pause(2000);
		getItemPack().click();
		AssertUtils.assertDisplayed(getItemSection());
		AssertUtils.assertAttributeMatches(getSeriesValue(), "href",
				Matchers.containsString("Series"));

	}

	@Override
	public void verifySeeItemPackSectionDisplayed() {
		waitForPageLoad();
		AssertUtils.assertDisplayed(getLnkSeeItemsInThisPack());

	}

	@Override
	public void clickOnBundlePackPurchasableItem() {
		getContext().setProperty("bundlepack.purchasableitem",
				getLblTitleBundlePackPurchasableItem().get(0).getText());
		getLblTitleBundlePackPurchasableItem().get(0).click();
		PauseUtil.pause(2000);

	}

	@Override
	public void verifyBundlePackItemOnPDP() {
		waitForPageLoad();
		WaitUtils.waitForDisplayed(getLblProductName());
		String bundlePackItem =
				(String) getContext().getProperty("bundlepack.purchasableitem");
		System.out.println(bundlePackItem);
		AssertUtils.assertTextMatches(getLblProductName(), Matchers.containsString(
				(String) getContext().getProperty("bundlepack.purchasableitem")));

	}

	@Override
	public void verifyBundlePackItemSearchPage(String itemName) {

		System.out.println("*******************" + itemName);
		PauseUtil.pause(3000);
		WaitUtils.waitForDisplayed(getLblSearchBundlPackItem().get(0));
		if (getLblSearchBundlPackItem().get(0).isDisplayed()) {
			AssertUtils.assertDisplayed(getLblOnlyAvailableInPackSearchResult(itemName));
		} else {
			try {
				AssertUtils.assertDisplayed(getSearchNoResultFoundSection());
			} catch (Exception e) {
				System.out.println("no result found");
			}
		}

	}
	@Override
	public void verifyRecommendAndWishListNotDisplayed() {
		try {
			AssertUtils.assertNotDisplayed(getLblAddToWishList());
			AssertUtils.assertNotDisplayed(getLblRecommend());
		} catch (Exception e) {

		}
	}

	@Override
	public void verifyBonusPointsSelectedDefault() {
		AssertUtils.assertAttributeMatches(getLblProductPoints(), "class",
				Matchers.containsString("product-points"));

	}
	@Override
	public void verifyReadingLevelModal() {
		SCHUtils.clickUsingJavaScript(getLnkAboutReadingLevel());
		PauseUtil.pause(6000);

		for (WebElement plusIcon : getLnkPlusAboutReadingModal()) {
			Assert.assertFalse(plusIcon.getAttribute("class").contains("expanded"),
					"Needed Not be Expanded / does not contain expanded class name:"
							+ plusIcon.getAttribute("class"));
		}
		for (WebElement plusIcon : getLnkPlusAboutReadingModal()) {
			if (!plusIcon.getAttribute("class").contains("expanded"))

			{
				plusIcon.click();

			}
		}
		getClosePopUpReadingLevel().click();
	}
	@Override
	public void clickOnBundlePackNorPurchasableItem() {
		getLblOnlyAvailableInPack().get(0).click();
	}

	@Override
	public void verifyAttributeForSeperateSoldItem() {

		for (int i = 0; i < getLblTitleBundlePackPurchasableItem().size(); i++) {
			AssertUtils.assertDisplayed(getImgBundlePackAttribute().get(i));
			AssertUtils.assertDisplayed(getLblTitleBundlePackAttribute().get(i));
			AssertUtils.assertDisplayed(getLblGradesBundlePackAttribute().get(i));
			AssertUtils.assertDisplayed(getLblAgesBundlePackAttribute().get(i));
			AssertUtils.assertDisplayed(getLblReadingLevelBundlePackAttribute().get(i));
		}

		for (int i = 0; i < getLblItemBundlePackItemOnlyAvailableInPack().size(); i++) {
			AssertUtils.assertDisplayed(getImgBundlePackAttribute().get(i));
			AssertUtils.assertDisplayed(getLblTitleBundlePackAttribute().get(i));
			AssertUtils.assertDisplayed(getLblGradesBundlePackAttribute().get(i));
			AssertUtils.assertDisplayed(getLblAgesBundlePackAttribute().get(i));
			AssertUtils.assertDisplayed(getLblReadingLevelBundlePackAttribute().get(i));
		}

	}

	@Override
	public void changeRecommendationStat() {
		SCHUtils.clickUsingJavaScript(getLblRecommend());
		PauseUtil.pause(2000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		if (!SCHUtils.isPresent(getWishlistOrRecommandModel())) {
			getLblRecommend().click();
			PauseUtil.pause(2000);
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete();
		}
		getWishlistOrRecommandModel().click();

	}

	@Override
	public void changeWishListStat() {
		WaitUtils.waitForDisplayed(getLblTeacherAddToWishList());
		SCHUtils.waitForElementToBeClickable(getLblTeacherAddToWishList(), 30);
		SCHUtils.clickUsingJavaScript(getLblTeacherAddToWishList());
		if (!SCHUtils.isPresent(getWishlistOrRecommandModel())) {
			getLblTeacherAddToWishList().click();
		}
		PauseUtil.pause(2000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		getWishlistOrRecommandModel().click();

	}

	@Override
	public void verifyBundlePackProductDetails() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.pause(8000);
		AssertUtils.assertDisplayed(getProductDetails("Grades"));
		AssertUtils.assertDisplayed(getProductDetails("Ages"));
		AssertUtils.assertDisplayed(getProductType("Subject"));
		AssertUtils.assertDisplayed(getProductType("Genre"));
		AssertUtils.assertDisplayed(getProductType("Page Count"));
		AssertUtils.assertDisplayed(getProductType("ISBN"));
		AssertUtils.assertDisplayed(getProductType("Product Type"));

	}

	@Override
	public void verifyAboutThisSeries() {
		boolean flag = false;

		for (WebElement ele : getAboutThisSeriesSection()) {
			if (ele.getText().equalsIgnoreCase("About this Series")) {
				flag = true;
				break;
			}
		}
		Assert.assertTrue(flag,
				"Need to find About This series Section On PDP page but not found");

	}

	@Override
	public void verifyAuthorContentAssets() {
		String author;
		SCHUtils.waitForLoaderToDismiss();
		author = DWClient.getAssetProductAttribute("9780545885553-rco-us", "c_author");

		AssertUtils.assertTextMatches(getLnkProductAttribution(),
				Matchers.containsString(author));

	}

	@Override
	public void verifyAwardsContentAssets() {
		String award;
		SCHUtils.waitForLoaderToDismiss();
		award = DWClient
				.getAssetProductArrayAttributes("9780545885553-rco-us", "c_awards")
				.toString();
		award = (award.split("\"")[1]).split("\"")[0];

		AssertUtils.assertTextMatches(
				getDriver().findElement(By.cssSelector(".bold-text")),
				Matchers.containsString(award));

	}
	@Override
	public void verifyShortDescriptionContentAssets() {
		String shortDesc;
		SCHUtils.waitForLoaderToDismiss();
		shortDesc = DWClient
				.getAssetProductAttribute("9780545885553-rco-us", "c_searchResultTag")
				.split("&")[0];

		AssertUtils.assertTextMatches(getLblShortProductDescription(),
				Matchers.containsString(shortDesc));

	}

	@Override
	public void verifyLongDescriptionContentAssets() {
		String longDesc;
		SCHUtils.waitForLoaderToDismiss();
		longDesc =
				DWClient.getAssetProductAttribute("9780545885553-rco-us", "c_seriesText");
		System.out.println("Value long DESc= " + longDesc);
		List<WebElement> elements =
				getDriver().findElements(By.cssSelector(".product-row.product-row-pad"));

		AssertUtils.assertTextMatches(elements.get(0), Matchers.containsString(longDesc));

	}

	@Override
	public void verifyProductNameContentAssets() {
		String productName;
		SCHUtils.waitForLoaderToDismiss();
		productName = DWClient.getAssetProductAttribute("9780545885553-rco-us", "name");

		AssertUtils.assertTextMatches(getLblProductName(),
				Matchers.containsString(productName));

	}
	@Override
	public void createNewListInAddToWishListModal() {

	}
	@Override
	public void verifysnapShotTextContentAssets() {
		String snapshot;
		SCHUtils.waitForLoaderToDismiss();
		snapshot = DWClient.getAssetProductAttribute("9780545885553-rco-us",
				"c_snapshotText");

		AssertUtils.assertTextMatches(getLblShortProductDescription(),
				Matchers.containsString(snapshot));
	}
	@Override
	public void verifyIllustratorContentAssets() {
		String illustrator;
		SCHUtils.waitForLoaderToDismiss();
		illustrator =
				DWClient.getAssetProductAttribute("9780545885553-rco-us", "c_illustrator")
						.split("&")[0];
		AssertUtils.assertTextMatches(getLnkProductAttribution(),
				Matchers.containsString(illustrator));
	}

	

	@Override
	public void verifyDisplayOfChildNameWithGradeAddToListModal() {
		WaitUtils.waitForDisplayed(getLblTeacherAddToWishList());
		Map<String, UserProfileBean> product_info = SCHUtils.getChildTeacherDetails();
		SCHUtils.mouseHoverOnElement(getLblTeacherAddToWishList());
		getLblTeacherAddToWishList().click();
		PauseUtil.pause(5000);
		List<WebElement> childname_wishlist = getChildNameWishList();
		List<String> childname_from_bean = new ArrayList<>();
		List<String> child_grade = new ArrayList<>();
		for (String key : product_info.keySet()) {
			UserProfileBean details = product_info.get(key);
			childname_from_bean.add(details.getChildName());
			child_grade.add(details.getChildGrade());
		}
		if (childname_from_bean.size() == 2) {
			int child1_grade = Integer.parseInt(child_grade.get(0).substring(0, 1));
			int child2_grade = Integer.parseInt(child_grade.get(1).substring(0, 1));
			String child1_name = childname_from_bean.get(0);
			if (childname_wishlist.get(0).getText().contains(child1_name)) {
				Assert.assertTrue(child1_grade > child2_grade);
			} else {
				Assert.assertTrue(child2_grade > child1_grade);
			}
		}
	}
	@Override
	public void hoverOverCatalog() {
		SCHUtils.mouseHoverJScript(getHoverCatalog());
		// SCHUtils.mouseHoverOnElement(getHoverCatalog());
	}

	@Override
	public void verifyNearestCatalog() {
		SCHUtils.waitForLoaderToDismiss();
		String catalog_base = getLblProductName().getText();
		PauseUtil.pause(5000);
		AssertUtils.assertDisplayed(getCatalogToolTip().get(0));
		getCatalogToolTip().get(0).click();
		SCHUtils.waitForLoaderToDismiss();
		AssertUtils.assertTextMatches(getLblProductName(),
				Matchers.containsString(catalog_base));
	}

	@Override
	public void verifyQuantityNotUpdated() {
		AssertUtils.assertTextMatches(getTxtQuantity(), Matchers.containsString("1"));
	}

	@Override
	public void verifyValuePackSection() {
		AssertUtils.assertDisplayed(getLblAvailableInValuePack());
		System.out.println("Total value pack -" + getLstProductBundleName().size());
		for (int i = 0; i < getLstProductBundleName().size(); i++) {
			AssertUtils.assertDisplayed(getLstProductBundleName().get(i));
			AssertUtils.assertDisplayed(getLstProductBundlePrice().get(i));

		}
	}

	@Override
	public void selectValuePackItem() {
		getLstProductBundleName().get(0).click();
		SCHUtils.waitForLoaderToDismiss();
	}

	@Override
	public void verifyItemInBundlePack(Configuration data) {
		System.out.println("Item Id-" + getLblItemInBundlePack(data.getString("item")));
		AssertUtils.assertDisplayed(getLblItemInBundlePack(data.getString("item")));
	}

	@Override
	public void selectQuickLookOfItemOnSearchResultPage(String itemLabel) {

		SCHUtils.mouseHoverOnElement(getProductTileImgOnSearchResultPage(itemLabel));
		PauseUtil.pause(2000);
		SCHUtils.clickUsingJavaScript(getLstQuickViewBtn().get(1));

		PauseUtil.pause(2000);

	}
	@Override
	public void clickGoToCheckOutWishListItem() {
		PauseUtil.pause(3000);
		getBtnModelGoToCheckout().click();
	}

	public void clickOnBuyClassroomItemLink() {
		WaitUtils.waitForDisplayed(getIconPcool());
		getIconPcool().click();
		// SCHUtils.clickUsingJavaScript();
		PauseUtil.pause(1000);
		SCHUtils.clickUsingJavaScript(getPcoolLnkBuyForClass());
		try {
			SCHUtils.clickUsingJavaScript(getPcoolLnkBuyForClass());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void saveTeacherInfoOnPDPPage() {
		String teacherName = getLblClassroomTeaherName().getText();

		System.out.println(teacherName);
		TestBaseProvider.getTestBase().getContext().setProperty("execution.teachername",
				teacherName);
		PauseUtil.pause(2000);

	}

	@Override
	public void verifyAwardImageOnPDPPage() {
		waitForPageLoad();
		AssertUtils.assertDisplayed(getIconAward());

	}

	@Override
	public void verifyNewBadgeImageOnPDPPage() {
		waitForPageLoad();
		AssertUtils.assertDisplayed(getImgBadgeOverlay());
	}

	@Override
	public void verifyUserRegistrationFunctionality() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addItemToParentMyList(Configuration configuration) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void teacher_lands_on_pdp_of_the_item_the_teacher_clicked_through() {
    	
        
        /*String checkProdPDP = TestBaseProvider.getTestBase().getContext()
				.getProperty("testexecution.homepage.marketurl_prodname").toString();*/
        
        String actual_productPDPPage = getLblProductName().getText().toLowerCase();
        System.out.println("Product Name is "+actual_productPDPPage);
        String checkProdPDP = TestBaseProvider.getTestBase().getTestData().getString("uniqueid").toLowerCase();
        
        if(!actual_productPDPPage.contains(checkProdPDP))
		{
		Assert.fail("Product in PDP page is different from Market URL. It should have been : "+checkProdPDP);	
		}
        
        
        
    }
	
	

	
	
	@Override
	public void verify_pdp_product_uniqueitemid() {
    	
        String actual_productPDPPage = getlblpdpproductminiattribute().getText();
        String checkProdPDP = TestBaseProvider.getTestBase().getTestData().getString("uniqueid");
        
        if(!actual_productPDPPage.contains(checkProdPDP))
		{
		Assert.fail("Unique item id is not showing in PDP page : "+checkProdPDP);	
		}
        
        
        
    }
	
	
	

	
	@Override
	public void verify_yto_product_uniqueitemid() {
    	
        String actual_yto_uniqueitemid = getlblytofirstitemitemno().getText();
        String checkuniqueid = TestBaseProvider.getTestBase().getTestData().getString("uniqueid");
        
        if(!actual_yto_uniqueitemid.contains(checkuniqueid))
		{
		Assert.fail("Unique item id is not showing correctly in YTO page : "+checkuniqueid);	
		}
           
    }
	
	@Override
	public void verify_confirmSubmitpage_product_uniqueitemid() {
    	
        String actual_yto_uniqueitemid = getlblytofirstitemitemno().getText();
        String checkuniqueid = TestBaseProvider.getTestBase().getTestData().getString("uniqueid");
        
        if(!actual_yto_uniqueitemid.contains(checkuniqueid))
		{
		Assert.fail("Unique item id is not showing correctly in YTO page : "+checkuniqueid);	
		}
           
    }
	
	@Override
	public void teacher_lands_on_category_page_item_the_teacher_clicked_through() {
    	
        
        /*String checkcategoryPage = TestBaseProvider.getTestBase().getContext()
				.getProperty("testexecution.homepage.category.marketurl_prodname").toString();*/
		
		
        
        String actual_categoryPDPPage = getLblCategoryName().getText().toLowerCase().trim();
        System.out.println("Actual category name is: "+actual_categoryPDPPage);
        String checkCategorypage = TestBaseProvider.getTestBase().getTestData().getString("link_marketing").toLowerCase();
        
        if(!actual_categoryPDPPage.contains(checkCategorypage))
		{
		Assert.fail("teacher did not land on Category page the teacher clicked through. It should have been : "+checkCategorypage);	
		}
        
        
        
    }
	
	
	
	@Override
	public void teacher_lands_on_content_page_item_the_teacher_clicked_through() {
    	
        
        /*String checkcontentPage = TestBaseProvider.getTestBase().getContext()
				.getProperty("testexecution.homepage.content.marketurl_prodname").toString();*/
		
		Assert.assertEquals(sizelblMrktContainer().size() > 0, true);
        
        
        
    }

}
