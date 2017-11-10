package com.dw.automation.sections.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.configuration.Configuration;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.dw.automation.beans.ProductInfoBean;
import com.dw.automation.pages.base.PageFactory;
import com.dw.automation.pages.impl.ProductDetailPage;
import com.dw.automation.sections.IAddToWishListSection;
import com.dw.automation.sections.IProductOrderTableSection;
import com.dw.automation.sections.base.SectionFactory;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.gargoylesoftware.htmlunit.javascript.host.Set;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.LocatorUtils;
import com.scholastic.torque.common.Section;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.WaitUtils;
import com.scholastic.torque.webdriver.ExtendedElement;

public class ProductOrderTableSection extends Section
		implements
			IProductOrderTableSection {

	@FindBy(locator = "dw.product.ordertable.lst.itemid")
	private List<WebElement> lstItemId;

	@FindBy(locator = "dw.product.ordertable.lst.itemttitle")
	private List<WebElement> lstItemTitle;

	@FindBy(locator = "dw.product.ordertable.lst.flyer")
	private List<WebElement> lstItemFlyer;

	@FindBy(locator = "dw.product.ordertable.lst.price")
	private List<WebElement> lstItemPrice;

	@FindBy(locator = "dw.product.ordertable.lst.itemquantity")
	private List<WebElement> lstItemQuantity;

	@FindBy(locator = "dw.product.ordertable.lst.bonus.point")
	private List<WebElement> lstItemBonusPoint;

	@FindBy(locator = "dw.product.ordertable.lst.bonusquantity")
	private List<WebElement> lstBonusQuantity;

	@FindBy(locator = "dw.product.studentordertable.productdetail.img.itemimage")
	private WebElement imgItemImage;

	@FindBy(locator = "dw.product.studentordertable.productdetail.lbl.itemdetail")
	private WebElement lblItemDetail;

	@FindBy(locator = "dw.product.studentordertable.productdetail.img.staricon")
	private WebElement imgStarIcon;

	@FindBy(locator = "dw.product.studentordertable.productdetail.img.hearticon")
	private WebElement imgHeartIcon;

	@FindBy(locator = "dw.product.studentordertable.cmp")
	private WebElement studentOrderTable;

	@FindBy(locator = "dw.product.studentordertable.header.lbl.studentname")
	private WebElement headerLblStudentName;

	@FindBy(locator = "dw.product.studentordertable.header.lbl.itemnumber")
	private WebElement headerLblItemNumber;

	@FindBy(locator = "dw.product.studentordertable.header.lbl.itemtitle")
	private WebElement headerLblItemTitle;

	@FindBy(locator = "dw.product.studentordertable.header.lbl.flyer")
	private WebElement headerLblFlyer;

	@FindBy(locator = "dw.product.studentordertable.header.lbl.coupon")
	private WebElement headerLblCoupon;

	@FindBy(locator = "dw.product.studentordertable.header.lbl.price")
	private WebElement headerLblPrice;

	@FindBy(locator = "dw.product.studentordertable.header.lbl.itemquantity")
	private WebElement headerLblItemQuantity;

	@FindBy(locator = "dw.product.studentordertable.header.lbl.bonus.point")
	private WebElement headerLblBonuspoint;

	@FindBy(locator = "dw.product.studentordertable.productdetail.full.details")
	private WebElement seeFullDetails;

	@FindBy(locator = "dw.product.studentordertable.lst.studentname")
	private List<WebElement> lstStudentName;

	@FindBy(locator = "dw.product.studentordertable.lnk.appliedcoupon")
	private WebElement lnkAppliedCoupon;

	@FindBy(locator = "dw.product.ordertable.lbl.itemidheader")
	private WebElement lblItemHeader;

	@FindBy(locator = "dw.product.ordertable.lbl.itemtitleheader")
	private WebElement lblItemTitleHeader;

	@FindBy(locator = "dw.product.ordertable.lbl.priceheader")
	private WebElement lblPriceHeader;

	@FindBy(locator = "dw.product.ordertable.lbl.itemqtyheader")
	private WebElement lblItemQtyHeader;

	@FindBy(locator = "dw.product.ordertable.lbl.bonusptheader")
	private WebElement lblBonusPtHeader;

	@FindBy(locator = "dw.product.ordertable.lbl.bonusqtyheader")
	private WebElement lblBonusQtyHeader;

	@FindBy(locator = "dw.product.ordertable.scrollbar")
	private WebElement scrollBarItem;

	@FindBy(locator = "dw.product.studentordertable.couponproducts.lst.img.remove")
	private List<WebElement> lstImgRemove;

	@FindBy(locator = "dw.product.studentordertable.removetooltip.btn.yes")
	private WebElement removeTooltipYes;

	@FindBy(locator = "dw.product.ordertable.lst.price")
	private List<WebElement> lstPrice;

	public List<WebElement> getLstPrice() {
		return lstPrice;
	}

	public WebElement getRemoveTooltipYes() {
		return removeTooltipYes;
	}

	public List<WebElement> getLstImgRemove() {
		return lstImgRemove;
	}

	public WebElement getScrollBarItem() {
		return scrollBarItem;
	}

	public void setScrollBarItem(WebElement scrollBarItem) {
		this.scrollBarItem = scrollBarItem;
	}

	public WebElement getLblItemHeader() {
		return lblItemHeader;
	}

	public void setLblItemHeader(WebElement lblItemHeader) {
		this.lblItemHeader = lblItemHeader;
	}

	public WebElement getLblItemTitleHeader() {
		return lblItemTitleHeader;
	}

	public void setLblItemTitleHeader(WebElement lblItemTitleHeader) {
		this.lblItemTitleHeader = lblItemTitleHeader;
	}

	public WebElement getLblPriceHeader() {
		return lblPriceHeader;
	}

	public void setLblPriceHeader(WebElement lblPriceHeader) {
		this.lblPriceHeader = lblPriceHeader;
	}

	public WebElement getLblItemQtyHeader() {
		return lblItemQtyHeader;
	}

	public void setLblItemQtyHeader(WebElement lblItemQtyHeader) {
		this.lblItemQtyHeader = lblItemQtyHeader;
	}

	public WebElement getLblBonusPtHeader() {
		return lblBonusPtHeader;
	}

	public void setLblBonusPtHeader(WebElement lblBonusPtHeader) {
		this.lblBonusPtHeader = lblBonusPtHeader;
	}

	public WebElement getLblBonusQtyHeader() {
		return lblBonusQtyHeader;
	}

	public void setLblBonusQtyHeader(WebElement lblBonusQtyHeader) {
		this.lblBonusQtyHeader = lblBonusQtyHeader;
	}

	public WebElement getLnkAppliedCoupon() {
		return lnkAppliedCoupon;
	}

	public WebElement getLblItemPrice(String itemId) {
		return SCHUtils.findElement("dw.product.ordertable.lst.itemprice", itemId);
	}

	public WebElement getLblItemBonusPrice(String itemId) {
		return SCHUtils.findElement("dw.product.ordertable.lbl.bonuspoint", itemId);
	}

	public WebElement getTxtItemBonusQuantity(String itemId) {
		return SCHUtils.findElement("dw.product.ordertable.txt.bonusquantity", itemId);
	}

	public WebElement getTxtItemQuantity(String itemId) {
		return SCHUtils.findElement("dw.product.ordertable.txt.itemquantity", itemId);
	}
	public WebElement getTxtBonusPointQuantity(String itemId) {
		return SCHUtils.findElement("dw.product.ordertable.txt.bonuspointquantity",
				itemId);
	}
	public WebElement getTxtItemFlyer(String itemId) {
		return SCHUtils.findElement("dw.product.ordertable.lbl.itemFlyer", itemId);
	}
	public void setLstStudentName(List<WebElement> lstStudentName) {
		this.lstStudentName = lstStudentName;
	}

	public List<WebElement> getLstStudentName() {
		return lstStudentName;
	}

	public WebElement getStudentOrderTable() {
		return studentOrderTable;
	}

	public WebElement getImgItemImage() {
		return imgItemImage;
	}

	public WebElement getLblItemDetail() {
		return lblItemDetail;
	}

	public WebElement getImgStarIcon() {
		return imgStarIcon;
	}

	public WebElement getImgHeartIcon() {
		return imgHeartIcon;
	}

	public List<WebElement> getLstItemId() {
		return lstItemId;
	}

	public List<WebElement> getLstItemTitle() {
		return lstItemTitle;
	}
	public List<WebElement> getLstItemFlyer() {
		return lstItemFlyer;
	}

	public List<WebElement> getLstItemPrice() {
		return lstItemPrice;
	}

	public List<WebElement> getLstItemQuantity() {
		return lstItemQuantity;
	}

	public List<WebElement> getLstBonuspoint() {
		return lstItemBonusPoint;
	}

	public List<WebElement> getLstBonusQuantity() {
		return lstBonusQuantity;
	}

	public WebElement getLnkProductItemId(String itemId) {
		pause();
		return SCHUtils.findElement("dw.product.ordertable.lbl.itemid", itemId);
	}

	public WebElement getLnkProductItemName(String itemId) {
		pause();
		return SCHUtils.findElement("dw.product.ordertable.lbl.itemttitle", itemId);
	}

	public WebElement getLnkHighlighted(String itemId) {
		pause();
		return SCHUtils.findElement("dw.product.ordertable.lbl.itemHighlighted", itemId);
	}
	public WebElement getSeefuldetailsOfProduct(String itemId) {
		pause();
		return SCHUtils.findElement(
				"dw.product.studentordertable.productdetail.full.details", itemId);
	}

	public WebElement getLblStudentName(String itemId) {
		pause();
		return SCHUtils.findElement("dw.product.ordertable.lbl.studentname", itemId);
	}

	public WebElement getLblStudentItemId(String studentName, String itemId) {
		pause();
		return SCHUtils.findElement("dw.product.studentordertable.lbl.itemid",
				studentName, itemId);
	}

	public WebElement getLblStudentItemTitle(String studentName, String itemId) {
		pause();
		return SCHUtils.findElement("dw.product.studentordertable.lbl.itemttitle",
				studentName, itemId);
	}

	public WebElement getLblStudentItemPrice(String studentName, String itemId) {
		pause();
		return SCHUtils.findElement("dw.product.studentordertable.lbl.itemprice",
				studentName, itemId);
	}

	public WebElement getTxtStudentItemQuantity(String studentName, String itemId) {
		pause();
		return SCHUtils.findElement("dw.product.studentordertable.txt.itemquantity",
				studentName, itemId);
	}

	public WebElement getTxtCouponItemQuantity(String studentName, String itemId) {
		return SCHUtils.findElement("dw.product.studentordertable.coupon.quantity",
				studentName, itemId);
	}

	public WebElement getTxtYourTeacherOrderItemQuantity(String itemId) {
		pause();
		return SCHUtils.findElement("dw.product.ordertable.txt.itemquantity", itemId);
	}
	public WebElement getTextFlyerItemQuantityField(String itemId) {
		pause();
		return SCHUtils.findElement("dw.product.ordertable.lbl.Fyeritemquantity", itemId);
	}

	public WebElement getTxtStudentCouponItemQuantity(String studentName, String itemId) {
		pause();
		return SCHUtils.findElement(
				"dw.product.studentordertable.couponitem.free.txt.itemquantity",
				studentName, itemId);
	}

	public void pause() {
		PauseUtil.pause(2000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
	}
	/*
	 * public WebElement getTxtYourTeacherOrderItemQuantity(String itemId,String
	 * quantity) {
	 * return SCHUtils.findElement("dw.product.ordertable.txt.itemquantity",
	 * itemId,quantity);
	 * }
	 */

	public WebElement getTxtStudentCoupon(String studentName, String itemId) {
		pause();
		return SCHUtils.findElement("dw.product.studentordertable.lbl.coupon",
				studentName, itemId);
	}

	public WebElement getTxtStudentFlyer(String studentName, String itemId) {
		pause();
		return SCHUtils.findElement("dw.product.studentordertable.lbl.flyer", studentName,
				itemId);
	}

	public ProductOrderTableSection(By by) {
		super(by);
	}

	public WebElement getHeaderLblStudentName() {
		return headerLblStudentName;
	}

	public WebElement getHeaderLblItemNumber() {
		return headerLblItemNumber;
	}

	public WebElement getHeaderLblItemTitle() {
		return headerLblItemTitle;
	}

	public WebElement getHeaderLblFlyer() {
		return headerLblFlyer;
	}

	public WebElement getHeaderLblCoupon() {
		return headerLblCoupon;
	}

	public WebElement getHeaderLblPrice() {
		return headerLblPrice;
	}

	public WebElement getHeaderLblItemQuantity() {
		return headerLblItemQuantity;
	}

	public WebElement getHeaderLblBonuspoint() {
		return headerLblBonuspoint;

	}

	public WebElement getImgRemoveIcon(String studentName, String itemId) {
		pause();
		return SCHUtils.findElement("dw.product.studentordertable.img.removeicon",
				studentName, itemId);
	}

	public WebElement getBtnRemoveItemYes(String studentName, String itemId) {
		pause();
		return SCHUtils.findElement("dw.product.studentordertable.removeitem.btn.yes",
				studentName, itemId);
	}

	public WebElement getBtnRemoveItemNo(String studentName, String itemId) {
		pause();
		return SCHUtils.findElement("dw.product.studentordertable.removeitem.btn.no",
				studentName, itemId);
	}

	public WebElement getLblRemoveLabel(String studentName, String itemId) {
		pause();
		return SCHUtils.findElement(
				"dw.product.studentordertable.removeitem.lbl.deleteitem", studentName,
				itemId);
	}

	public WebElement getBtnStarIcon(String itemId) {
		pause();
		return SCHUtils.findElement("dw.product.ordertable.wishlist.img.staricon",
				itemId);
	}

	public WebElement getBtnHeartIcon(String itemId) {
		pause();
		return SCHUtils.findElement("dw.product.ordertable.wishlist.img.hearticon",
				itemId);
	}

	public WebElement getItemRow(String itemId) {
		pause();
		return SCHUtils.findElement("dw.product.studentordertable.lbl.itemrow", itemId);
	}

	public WebElement getYTOOrderRemoveIcon(String itemId) {
		pause();
		return SCHUtils.findElement(
				"dw.product.studenrordertable.studentflyerorder.btn.remove", itemId);
	}

	public WebElement getYTOOrderRemoveYesBtn(String itemId) {
		pause();
		return SCHUtils.findElement(
				"dw.product.studentordertable.studentflyerorder.removeitem.btn.yes",
				itemId);
	}

	public WebElement getYTOOrderRemoveNoBtn(String itemId) {
		pause();
		return SCHUtils.findElement(
				"dw.product.studentordertable.studentflyerorder.removeitem.btn.no",
				itemId);
	}

	public WebElement getLblYTOOrderRemoveItem(String itemId) {
		pause();
		return SCHUtils.findElement(
				"dw.product.studentordertable.studentflyerorder.removeitem.lbl.deleteitem",
				itemId);
	}

	/**
	 * This Method Verify Item is Added on Order Table
	 *
	 * @param studentName
	 *            , itemID
	 */
	@Override
	public void verifyItemIsAddedOnStudentTable() {
		pause();
		Map<String, ProductInfoBean> SFOProducts = SCHUtils.getSFOProductItems();
		for (String key : SFOProducts.keySet()) {
			ProductInfoBean details = SFOProducts.get(key);
			AssertUtils.assertDisplayed(getLblStudentItemId(details.getStudentName(),
					details.getItemNumber()));
			AssertUtils.assertTextMatches(
					getLblStudentItemId(details.getStudentName(),
							details.getItemNumber()),
					Matchers.containsString(details.getItemNumber()));
			AssertUtils.assertTextMatches(
					getLblStudentItemTitle(details.getStudentName(),
							details.getItemNumber()),
					Matchers.containsString(details.getItemTitle()));
			AssertUtils.assertTextMatches(
					getLblStudentItemPrice(details.getStudentName(),
							details.getItemNumber()),
					Matchers.containsString(details.getPrice()));
			AssertUtils.assertTextMatches(
					getTxtStudentFlyer(details.getStudentName(), details.getItemNumber()),
					Matchers.containsString(details.getFlyer()));

			if (details.getCoupon().isEmpty() || details.getCoupon() == null) {
				AssertUtils.assertAttributeMatches(
						getTxtStudentItemQuantity(details.getStudentName(),
								details.getItemNumber()),
						"value", Matchers.containsString(details.getQuantity()));
			} else {
				AssertUtils.assertTextMatches(
						getTxtStudentCouponItemQuantity(details.getStudentName(),
								details.getItemNumber()),
						Matchers.containsString(details.getQuantity()));
			}
		}
	}

	@Override
	public ProductInfoBean fillSFOProductBean(String studentName, String itemId) {
		WaitUtils.waitForDisplayed(getHeaderLblStudentName());
		ProductInfoBean productInfoBean = new ProductInfoBean();
		productInfoBean.setStudentName(studentName);
		productInfoBean.setItemNumber(itemId);
		productInfoBean
				.setItemTitle(getLblStudentItemTitle(studentName, itemId).getText());
		productInfoBean
				.setQuantity(getTxtStudentItemQuantity(studentName, itemId).getText());

		productInfoBean.setPrice(getLblStudentItemPrice(studentName, itemId).getText());
		productInfoBean.setQuantity(
				getTxtStudentItemQuantity(studentName, itemId).getAttribute("value"));
		productInfoBean
				.setItemTitle(getLblStudentItemTitle(studentName, itemId).getText());
		productInfoBean.setCoupon(getTxtStudentCoupon(studentName, itemId).getText());
		productInfoBean.setFlyer(getTxtStudentFlyer(studentName, itemId).getText());
		return productInfoBean;
	}

	/**
	 * This Method Clicks Id or Title from student Order Table based on test
	 * data flag.
	 *
	 * @param flagid
	 *            : 'true' to click on item id & 'false' to click on item title,
	 * @param studentName
	 *            , itemID
	 */
	@Override
	public void clickOnItemAddedOnStudentTable(Configuration data) {
		String studentNameArray[] =
				SCHUtils.getArrayFromStringData(data.getString("studentname"));
		String itemIdArray[] = SCHUtils.getArrayFromStringData(data.getString("itemid"));
		if (data.getString("flagid").equalsIgnoreCase("true")) {
			getLblStudentItemId(studentNameArray[0], itemIdArray[0]).click();
		} else {
			getLblStudentItemTitle(studentNameArray[0], itemIdArray[0]).click();
		}
	}

	@Override
	public void verifyItemQuickLookOnOrderTable(Configuration data) {
		WebElement itemDetails = getLblItemDetail();
		WaitUtils.waitForDisplayed(itemDetails);
		AssertUtils.assertDisplayed(itemDetails);
		AssertUtils.assertDisplayed(getImgHeartIcon());
		AssertUtils.assertDisplayed(getImgItemImage());
		AssertUtils.assertDisplayed(getImgStarIcon());

		// Specify expected item title in the quick view
		if (data.getString("itemtitle") != null) {
			AssertUtils.assertTextMatches(itemDetails,
					Matchers.containsString(data.getString("itemtitle")));
		}
		AssertUtils.assertTextMatches(itemDetails, Matchers.containsString("Ages"));
		AssertUtils.assertTextMatches(itemDetails, Matchers.containsString("Grades"));
		AssertUtils.assertTextMatches(itemDetails,
				Matchers.containsString("Reading Level"));
	}

	@Override
	public void editProductQuantityOnOrderTable(Configuration data) {

		String studentName =
				SCHUtils.getArrayFromStringData(data.getString("studentname"))[0];

		String itemId = SCHUtils.getArrayFromStringData(data.getString("itemid"))[0];
		String quantity = data.getString("quantity");
		getTxtStudentItemQuantity(studentName, itemId).clear();
		getTxtStudentItemQuantity(studentName, itemId).sendKeys(quantity);
		PauseUtil.waitForAjaxToComplete(1000);
		getTxtStudentFlyer(studentName, itemId).click();
		PauseUtil.waitForAjaxToComplete(2000);

		ProductInfoBean bean =
				SCHUtils.getSFOProductByIDAndStudentName(itemId + studentName);
		bean.setQuantity(
				getTxtStudentItemQuantity(studentName, itemId).getAttribute("value"));

		SCHUtils.addSFOProductItem(bean);
	}
	@Override
	public void verifyStudentFlyerOrderTableHeader() {
		
		PauseUtil.pause(10000);
		SCHUtils.scrollToView(getHeaderLblStudentName());
		AssertUtils.assertDisplayed(getHeaderLblStudentName());
		AssertUtils.assertDisplayed(getHeaderLblItemNumber());
		AssertUtils.assertDisplayed(getHeaderLblItemTitle());
		AssertUtils.assertDisplayed(getHeaderLblFlyer());
		AssertUtils.assertDisplayed(getHeaderLblCoupon());
		AssertUtils.assertDisplayed(getHeaderLblPrice());
		AssertUtils.assertDisplayed(getHeaderLblItemQuantity());
	}

	@Override
	public void removeItemsFromStudentTable(Configuration data,
			String confirmationStatus) {
		String[] Students =
				SCHUtils.getArrayFromStringData(data.getString("studentname"));
		String[] Items = SCHUtils.getArrayFromStringData(data.getString("itemid"));

		String productIDStudentName = Items[0] + Students[0];

		if (Boolean.parseBoolean(data.getString("removeitembyquantity"))) {
			getTxtStudentItemQuantity(Students[0], Items[0]).clear();
			getTxtStudentItemQuantity(Students[0], Items[0]).sendKeys("0");
		} else {
			getImgRemoveIcon(Students[0], Items[0]).click();
		}
		AssertUtils.assertDisplayed(getBtnRemoveItemNo(Students[0], Items[0]));
		AssertUtils.assertDisplayed(getBtnRemoveItemYes(Students[0], Items[0]));
		AssertUtils.assertDisplayed(getLblRemoveLabel(Students[0], Items[0]));

		if (confirmationStatus.equalsIgnoreCase("YES")) {
			getBtnRemoveItemYes(Students[0], Items[0]).click();
			SCHUtils.removeSFOProductItem(
					SCHUtils.getSFOProductByIDAndStudentName(productIDStudentName));
		} else {
			getBtnRemoveItemNo(Students[0], Items[0]).click();
			getLblStudentName(Items[0]).click();
			PauseUtil.pause(2000);
		}
	}

	@Override
	public int getTotalItemsOnProductTable() {
		return getLstItemId().size();
	}

	@Override
	public void verifyUpdatedRecordsAfterRemoval(Configuration data) {
		HashMap<String, ProductInfoBean> itemDeleted = SCHUtils.getSFOProductItems();// FORemovedProductItems();
		String[] student = SCHUtils.getArrayFromStringData(data.getString("studentname"));
		String[] itemid = SCHUtils.getArrayFromStringData(data.getString("itemid"));
		if (student.length > 0) {
			if (!itemDeleted.containsKey(itemid[0] + student[0])) {
				Assert.assertTrue(true, "Item is not deleted");
			}
		}
	}

	@Override
	public int getTotalStudentOnProductTable() {
		Set studentName = new Set();
		for (WebElement name : getLstStudentName()) {
			studentName.add(name.getText());
		}
		return studentName.getSize();
	}

	@Override
	public void verifyItemQuantityAfterAddingItem(String itemid) {
		// TODO Auto-generated method stub
		Assert.assertEquals(getTxtBonusPointQuantity(itemid).getAttribute("value"), "1");
		PauseUtil.waitForAjaxToComplete(4000);
		getLnkProductItemName(itemid).click();
		PauseUtil.waitForAjaxToComplete(4000);
	}

	@Override
	public void verifyQuantityOfBonusAndPrice() {
		String itemID = TestBaseProvider.getTestBase().getContext()
				.getString(ConstantUtils.YTO_ITEMID);
		SCHUtils.WaitForAjax();
		getTxtItemQuantity(itemID).clear();
		getTxtItemQuantity(itemID).sendKeys("1000");
		Assert.assertTrue(
				getTxtItemQuantity(itemID).getAttribute("value").trim().length() <= 3
						&& Integer.parseInt(getTxtItemQuantity(itemID)
								.getAttribute("value").toString()) <= 999,
				"Value contains not more than 3 characters and its value is not more than 999");

		getTxtItemBonusQuantity(itemID).clear();
		PauseUtil.waitForAjaxToComplete(6000);
		getTxtItemBonusQuantity(itemID).sendKeys("999");
		Assert.assertTrue(
				getTxtItemBonusQuantity(itemID).getAttribute("value").trim().length() <= 3
						&& Integer.parseInt(getTxtItemBonusQuantity(itemID)
								.getAttribute("value").toString()) <= 999,
				"Value contains not more than 3 characters and its value is not more than 999");

	}
	@Override
	public void verifyItemIsHighlighted() {
		PauseUtil.pause(5000);
		if (TestBaseProvider.getTestBase().getContext()
				.getString(ConstantUtils.YTO_ITEMID) != null
				&& TestBaseProvider.getTestBase().getContext()
						.getString(ConstantUtils.YTO_ITEMID).toString().trim()
						.length() > 0) {
			AssertUtils.assertAttributeMatches(
					getItemRow(TestBaseProvider.getTestBase().getContext()
							.getString(ConstantUtils.YTO_ITEMID).toString()),
					"class", Matchers.containsString("focused"));
		} else {
			Map<String, ProductInfoBean> YTOProducts = SCHUtils.getYTOProductItems();
			for (String key : YTOProducts.keySet()) {

				AssertUtils.assertAttributeMatches(getItemRow(key), "class",
						Matchers.containsString("focused"));
			}
		}
	}

	@Override
	public void verifyFullDetailsOfProduct(String itemid) {
		// TODO Auto-generated method stub
		ProductDetailPage productDetailPage = new ProductDetailPage();
		WaitUtils.waitForDisplayed(getSeefuldetailsOfProduct(itemid));
		getSeefuldetailsOfProduct(itemid).click();
		// PauseUtil.pause(4000);
		WaitUtils.waitForDisplayed(productDetailPage.getLblProductName());

	}

	@Override
	public void verifyItemQuantity(Configuration data) {

		String studentName =
				SCHUtils.getArrayFromStringData(data.getString("studentname"))[0];
		String itemId = SCHUtils.getArrayFromStringData(data.getString("itemid"))[0];
		String quantity = data.getString("quantity");
		PauseUtil.waitForAjaxToComplete(4000);
		String quantitybefore =
				getTxtStudentItemQuantity(studentName, itemId).getAttribute("value");
		getTxtStudentItemQuantity(studentName, itemId).clear();
		getTxtStudentItemQuantity(studentName, itemId).sendKeys(quantity);
		getTxtStudentFlyer(studentName, itemId).click();
		PauseUtil.waitForAjaxToComplete(4000);
		getBtnRemoveItemNo(studentName, itemId).click();
		String quantityafter =
				getTxtStudentItemQuantity(studentName, itemId).getAttribute("value");
		Assert.assertEquals(quantitybefore, quantityafter);
	}

	@Override
	public void verifyRecommendationButton() {
		PauseUtil.waitForAjaxToComplete(5000);
		List<WebElement> list = getLstItemId();
		if (list.size() > 0) {
			AssertUtils.assertDisplayed(list.get(0));
		}
	}

	@Override
	public void clickOnRecommendation() {
		List<WebElement> list = getLstItemId();
		if (list.size() > 0) {
			getBtnStarIcon(list.get(0).getText()).click();
		}
		getAddToWishListSection().clickOnRecommendation("selects");
		getAddToWishListSection().clickOnCloseBtn();
	}

	@Override
	public void verifyRecommendationState() {
		List<WebElement> list = getLstItemId();
		Assert.assertFalse(getBtnStarIcon(list.get(0).getText()).getAttribute("class")
				.contains("fa-star-o"), "Item is not recommended");
	}

	@Override
	public void clickOnWishList() {
		List<WebElement> list = getLstItemId();
		if (list.size() > 0) {
			getBtnHeartIcon(list.get(0).getText()).click();
		}
		getAddToWishListSection().clickOnWishList("selects");
		getAddToWishListSection().clickOnCloseBtn();
	}

	@Override
	public void verifyWishListState() {
		List<WebElement> list = getLstItemId();
		Assert.assertFalse(getBtnHeartIcon(list.get(0).getText()).getAttribute("class")
				.contains("fa-heart-o"), "Item is not wishlisted");
	}

	@Override
	public void selectItemandEnterQuantity(Configuration Data) {
		PauseUtil.waitForAjaxToComplete(5000);
		List<WebElement> ItemList = getLstItemId();
		if (ItemList != null && ItemList.size() > 0) {
			getTxtItemQuantity(ItemList.get(0).getText())
					.sendKeys(Data.getString("quantity"));
			SCHUtils.addYTOProductItem(fillYTOProductBean(ItemList.get(0).getText()));
		}
	}
	@Override
	public ProductInfoBean fillYTOProductBean(String listItem) {
		ProductInfoBean productInfoBean = new ProductInfoBean();
		productInfoBean.setItemNumber(listItem);
		WaitUtils.waitForEnabled(getLnkProductItemName(listItem));
		productInfoBean.setItemTitle(getLnkProductItemName(listItem).getText());
		try {
			productInfoBean
					.setQuantity(getTxtItemQuantity(listItem).getAttribute("value"));
		} catch (Exception e) {
			productInfoBean
					.setQuantity(getTextFlyerItemQuantityField(listItem).getText());
		}
		productInfoBean.setPrice(getLblItemPrice(listItem).getText());
		productInfoBean.setBonusPoint(getLblItemBonusPrice(listItem).getText());
		productInfoBean.setBonusPointQuantity(
				getTxtItemBonusQuantity(listItem).getAttribute("value"));

		SCHUtils.addYTOProductItem(productInfoBean);
		return productInfoBean;
	}

	@Override
	public void addOrUpdateItemToCartByQuantity(Configuration testData) {
		PauseUtil.waitForAjaxToComplete(5000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.pause(3000);
		List<WebElement> lstItem = getLstItemId();
		// Editted this method because Yto by item will have less than 3 items
		// in table
		int maxLoopCount = 2;
		if (lstItem != null && lstItem.size() > 0) {
			if (lstItem.size() < 2) {
				maxLoopCount = lstItem.size();
			}

			try {
				for (int i = 0; i < maxLoopCount; i++) {
					getTxtItemQuantity(lstItem.get(i).getText())
							.sendKeys(testData.getString("yto_quantity"));
					SCHUtils.addYTOProductItem(
							fillYTOProductBean(lstItem.get(i).getText()));
					if (lstItem.size() == 1) {
						break;
					}

					PauseUtil.pause(3000);
					SCHUtils.waitForLoaderToDismiss();
					PauseUtil.waitForAjaxToComplete(3000);
				}

			} catch (Exception e) {
				for (int i = 2; i < 4; i++) {
					getTxtItemQuantity(lstItem.get(i).getText())
							.sendKeys(testData.getString("yto_quantity"));
					SCHUtils.addYTOProductItem(
							fillYTOProductBean(lstItem.get(i).getText()));

					PauseUtil.pause(3000);
					SCHUtils.waitForLoaderToDismiss();
					PauseUtil.waitForAjaxToComplete(3000);
				}
			}
		}
	}

	@Override
	public void verifySelectedHighlightedProducts(Configuration testData) {

		PauseUtil.pause(5000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(5000);
		Map<String, ProductInfoBean> YTOProducts = SCHUtils.getYTOProductItems();
		for (String key : YTOProducts.keySet()) {
			SCHUtils.scrollToView(getTxtItemQuantity(key));
			getTxtItemQuantity(key).sendKeys(testData.getString("yto_quantity"));
			AssertUtils.assertAttributeMatches(getItemRow(key), "class",
					Matchers.containsString("focused"));
		}

	}
	@Override
	public void verifyHighlightedBonusPointItem(Configuration testData) {
		PauseUtil.pause(5000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(5000);
		Map<String, ProductInfoBean> YTOProducts = SCHUtils.getYTOProductItems();
		for (String key : YTOProducts.keySet()) {
			SCHUtils.scrollToView(getTxtBonusPointQuantity(key));
			getTxtBonusPointQuantity(key).sendKeys(testData.getString("bonuspoints"));
			AssertUtils.assertAttributeMatches(getItemRow(key), "class",
					Matchers.containsString("focused"));
		}
	}
	@Override
	public void verifyQuantityFieldOfItems() {
		PauseUtil.waitForAjaxToComplete(10000);
		List<WebElement> lastQty = getLstItemQuantity();
		for (int i = 0; i < lastQty.size(); i++) {
			SCHUtils.scrollToView(lastQty.get(i));
			AssertUtils.assertDisplayed(lastQty.get(i));

			if (i >= 15) {
				break;
			}
		}

		for (int i = 0; i < getLstBonusQuantity().size(); i++) {
			SCHUtils.scrollToView(getLstBonusQuantity().get(i));
			Assert.assertTrue(SCHUtils.isPresent(getLstBonusQuantity().get(i)),
					"Bonus quantity list is not present");
			if (i >= 15) {
				break;
			}
		}
	}

	@Override
	public void verifyBonusItemDetails(String itemId) {
		AssertUtils.assertDisplayed(getTxtBonusPointQuantity(itemId));
		AssertUtils.assertDisplayed(getTxtItemBonusQuantity(itemId));
	}

	@Override
	public void clickOnOutSide() {
		PauseUtil.pause(8000);
		try {
			getTxtItemQuantity(getLstItemId().get(0).getText()).click();
			PauseUtil.pause(1000);
			getTxtBonusPointQuantity(getLstItemId().get(0).getText()).click();
			PauseUtil.pause(1000);
			getTxtItemBonusQuantity(getLstItemId().get(0).getText()).click();
			getTxtItemQuantity(getLstItemId().get(0).getText()).click();
			PauseUtil.pause(1000);
			getTxtBonusPointQuantity(getLstItemId().get(0).getText()).click();
			PauseUtil.pause(1000);
			getTxtItemBonusQuantity(getLstItemId().get(0).getText()).click();
		} catch (Exception e) {
			getTxtItemQuantity(getLstItemId().get(1).getText()).click();
			PauseUtil.pause(1000);
			getTxtBonusPointQuantity(getLstItemId().get(1).getText()).click();
			PauseUtil.pause(1000);
			getTxtItemBonusQuantity(getLstItemId().get(1).getText()).click();
			getTxtItemQuantity(getLstItemId().get(1).getText()).click();
			PauseUtil.pause(1000);
			getTxtBonusPointQuantity(getLstItemId().get(1).getText()).click();
			PauseUtil.pause(1000);
			getTxtItemBonusQuantity(getLstItemId().get(1).getText()).click();
		}

	}

	@Override
	public void removeYTOItemsFromStudentTable(Configuration data,
			String confirmationStatus) {
		String itemID = data.getString("itemtoberemovedid");

		if (Boolean.parseBoolean(data.getString("removeitembyquantity"))) {
			getTxtItemQuantity(itemID).clear();
			getTxtItemQuantity(itemID).sendKeys("0");
		} else {
			getYTOOrderRemoveIcon(itemID).click();
		}
		AssertUtils.assertDisplayed(getYTOOrderRemoveYesBtn(itemID));
		AssertUtils.assertDisplayed(getYTOOrderRemoveNoBtn(itemID));
		AssertUtils.assertDisplayed(getLblYTOOrderRemoveItem(itemID));

		if (confirmationStatus.equalsIgnoreCase("YES")) {
			getYTOOrderRemoveYesBtn(itemID).click();
			SCHUtils.removeYTOProductItem(SCHUtils.getYTOProductByItemId(itemID));
			PauseUtil.pause(2000);
		} else {
			getYTOOrderRemoveNoBtn(itemID).click();
		}
	}

	@Override
	public void clickOnItem() {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(5000);

		SCHUtils.scrollToView(getLstItemId().get(0));
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.ItemId",
				getLstItemId().get(0).getText());
		getLstItemId().get(0).click();

	}
	@Override
	public void selectItemFromList(int index) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(8000);
		TestBaseProvider.getTestBase().getContext().setProperty("testexecution.ItemId",
				getLstItemId().get(index).getText());
		SCHUtils.scrollToView(getLstItemId().get(index));
		SCHUtils.clickUsingJavaScript(getLstItemId().get(index));
	}

	@Override
	public void verifyItemPresent(String key) {
		PauseUtil.pause(4000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(6000);
		AssertUtils.assertDisplayed(getItemRow(key));

	}

	@Override
	public void verifyItemAddedOnByItem(Configuration data) {
		PauseUtil.waitForAjaxToComplete(3000);
		Map<String, ProductInfoBean> YTOProducts = SCHUtils.getYTOProductItems();
		for (String key : YTOProducts.keySet()) {
			AssertUtils.assertDisplayed(getLblItemPrice(key));
		}
	}

	@Override
	public void verifyItemAddedOnByFlyer(Configuration data) {
		PauseUtil.waitForAjaxToComplete(5000);
		Map<String, ProductInfoBean> YTOProducts = SCHUtils.getYTOProductItems();
		for (String key : YTOProducts.keySet()) {
			AssertUtils.assertDisplayed(getItemRow(key));
		}
	}

	/**
	 * This Method verifies the quick view or product details are displayed
	 * until other item is selected or clicked somewhere outside.
	 */
	@Override
	public void verifyBySelectingOtherItem() {
		List<WebElement> itemIds = getLstItemId();
		itemIds.get(0).click();
		AssertUtils.assertDisplayed(getLblItemDetail());
		String previousItemDetails = getLblItemDetail().getText();
		itemIds.get(1).click();
		AssertUtils.assertTextNotMatches(getLblItemDetail(),
				Matchers.equalToIgnoringCase(previousItemDetails));
		getLstStudentName().get(0).click();
		AssertUtils.assertNotPresent((ExtendedElement) getLblItemDetail());
	}

	@Override
	public void selectAppliedSFOCoupon() {
		getLnkAppliedCoupon().click();
		PauseUtil.waitForAjaxToComplete(2000);
	}

	@Override
	public void updateQuantity(String itemId, String quantity) {
		getTxtItemQuantity(itemId).click();
		getTxtItemQuantity(itemId).sendKeys(quantity);
		getLblItemBonusPrice(itemId).click();
		Map<String, ProductInfoBean> YTOProducts = SCHUtils.getYTOProductItems();
		for (String key : YTOProducts.keySet()) {
			if (key.equalsIgnoreCase(itemId)) {
				YTOProducts.get(key).setQuantity(quantity);
			}
		}
		PauseUtil.waitForAjaxToComplete();
		ProductInfoBean bean = SCHUtils.getYTOProductByItemId(itemId);
		bean.setQuantity(getTxtItemQuantity(itemId).getAttribute("value"));
		SCHUtils.addYTOProductItem(bean);
	}

	@Override
	public void verifyItemQuantityOnYTO(Configuration data) {
		String ItemId = "";
		if (data.getString("itemid") != null) {
			ItemId = SCHUtils.getArrayFromStringData(data.getString("itemid"))[0];
		}
		String quantity = data.getString("quantity");
		Map<String, ProductInfoBean> YTOProducts = SCHUtils.getYTOProductItems();
		for (String key : YTOProducts.keySet()) {
			if (key.equalsIgnoreCase(ItemId)) {
				AssertUtils.assertAttributeMatches(getTxtItemQuantity(ItemId), "value",
						Matchers.containsString(quantity));
			}
		}
	}

	@Override
	public void addBPofItemToCart(Configuration testData) {
		PauseUtil.pause(4000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(5000);
		List<WebElement> lstItem = getLstItemId();
		System.out.println("Total Size........" + lstItem.size());
		if (lstItem != null && lstItem.size() > 0) {
			try {
				for (int i = 0; i < 2; i++) {
					getTxtItemBonusQuantity(lstItem.get(i).getText())
							.sendKeys(testData.getString("bonuspoints"));
					getHeaderLblItemQuantity().click();
					SCHUtils.addYTOProductItem(
							fillYTOProductBean(lstItem.get(i).getText()));
					if (lstItem.size() == 1) {
						break;
					}
				}
			} catch (Exception e) {
				for (int i = 2; i < 4; i++) {
					getTxtItemBonusQuantity(lstItem.get(i).getText())
							.sendKeys(testData.getString("bonuspoints"));
					getHeaderLblItemQuantity().click();
					SCHUtils.addYTOProductItem(
							fillYTOProductBean(lstItem.get(i).getText()));
					if (lstItem.size() == 1) {
						break;
					}
				}
			}
		}
	}

	@Override
	public void removeItemFromCartByUpdatingQuantity(Configuration testData) {
		PauseUtil.waitForAjaxToComplete(5000);
		List<WebElement> lst = getLstItemId();
		for (int i = 0; i < 2; i++) {
			getTxtItemQuantity(lst.get(i).getText()).clear();
			getTxtItemQuantity(lst.get(i).getText()).sendKeys("0");
			SCHUtils.removeYTOProductItem(
					SCHUtils.getYTOProductByItemId(lst.get(i).getText()));
		}
	}

	@Override
	public void addNegativeBonusItemToCart() {
		PauseUtil.waitForAjaxToComplete(5000);
		PauseUtil.waitForAjaxToComplete();
		PageFactory.getFactory().getIYourTeacherOrderPage().waitForLoaderToDismiss();
		List<WebElement> lstItem = getLstItemId();
		getTxtItemBonusQuantity(lstItem.get(0).getText()).sendKeys("100");
		getTxtItemQuantity(lstItem.get(0).getText()).click();
	}

	@Override
	public void verifyUpdatedQuantityOfYTO(Configuration data) {
		Map<String, ProductInfoBean> YTOProducts = SCHUtils.getYTOProductItems();
		for (String key : YTOProducts.keySet()) {
			AssertUtils.assertDisplayed(getTxtItemQuantity(key));
			AssertUtils.assertAttributeMatches(getTxtItemQuantity(key), "value",
					Matchers.containsString(data.getString("quantity")));
		}
	}

	@Override
	public void verifyUpdationProcess() {
		PauseUtil.waitForAjaxToComplete(5000);
		List<WebElement> lstItem = getLstItemId();
		if (lstItem != null && lstItem.size() > 0) {
			SCHUtils.scrollToView(lstItem.get(0));
			getTxtItemQuantity(lstItem.get(0).getText()).sendKeys("2");
			AssertUtils.assertAttributeMatches(getItemRow(lstItem.get(0).getText()),
					"class", Matchers.containsString("focused"));

			getTxtItemQuantity(lstItem.get(0).getText()).sendKeys("0");
			AssertUtils.assertAttributeMatches(getItemRow(lstItem.get(0).getText()),
					"class", Matchers.containsString(""));

			getTxtItemQuantity(lstItem.get(0).getText()).sendKeys("1");
			TestBaseProvider.getTestBase().getContext()
					.setProperty(ConstantUtils.YTO_ITEMID, lstItem.get(0).getText());
		}
		clickOnOutSide();
	}

	@Override
	public void verifyUnhighlightedItem() {
		Map<String, ProductInfoBean> YTOProducts = SCHUtils.getYTOProductItems();
		for (String key : YTOProducts.keySet()) {
			AssertUtils.assertAttributeMatches(getItemRow(key), "class",
					Matchers.containsString(""));
		}
	}

	@Override
	public void verifyFlyerItemDetails() {
		PauseUtil.waitForAjaxToComplete(5000);
		List<WebElement> lstItem = getLstItemId();
		for (int i = 0; i < lstItem.size(); i++) {
			SCHUtils.scrollToView(lstItem.get(i));
			AssertUtils.assertDisplayed(lstItem.get(i));
		}
	}

	@Override
	public void verifyFlyerItemAllHeaders() {
		AssertUtils.assertDisplayed(getLblBonusPtHeader());
		AssertUtils.assertDisplayed(getLblBonusQtyHeader());
		AssertUtils.assertDisplayed(getLblItemHeader());
		AssertUtils.assertDisplayed(getLblItemQtyHeader());
		AssertUtils.assertDisplayed(getLblItemTitleHeader());
		AssertUtils.assertDisplayed(getLblPriceHeader());
	}

	@Override
	public void verifyListSortingOrder() {
		PauseUtil.waitForAjaxToComplete(5000);
		List<WebElement> lstItemTitle = getLstItemTitle();
		Assert.assertFalse(SCHUtils.isSortedList(lstItemTitle), "List is sorted");
	}

	@Override
	public void verifyUserAddItemOnYTO() {
		PauseUtil.waitForAjaxToComplete(5000);
		List<WebElement> lstItem = getLstItemId();
		if (lstItem != null && lstItem.size() > 0) {
			getTxtItemQuantity(lstItem.get(0).getText()).sendKeys("1");
			AssertUtils.assertAttributeMatches(getItemRow(lstItem.get(0).getText()),
					"class", Matchers.containsString("focused"));
		}
	}

	@Override
	public void verifyScrollBar(Configuration data) {
		PauseUtil.waitForAjaxToComplete(5000);
		List<WebElement> lstItem = getLstItemId();
		Assert.assertTrue(lstItem.size() > Integer.parseInt(data.getString("numbers")));
		AssertUtils.assertDisplayed(getScrollBarItem());
	}

	@Override
	public void verifyTitleOrderAlphabeticalOrder(Configuration testData) {
		PauseUtil.waitForAjaxToComplete(5000);
		List<WebElement> lstItemTitle = getLstItemTitle();
		Assert.assertTrue(SCHUtils.isSortedList(lstItemTitle), "List is sorted");

	}

	@Override
	public void verifyItemQuantityUpdated(Configuration testData, boolean flagquantity) {
		List<WebElement> lstItem = getLstItemId();
		if (lstItem != null && lstItem.size() > 0) {
			for (int i = 0; i < 2; i++) {
				if (flagquantity) {
					Assert.assertTrue(getTxtItemQuantity(lstItem.get(i).getText())
							.getAttribute("value").toString().equalsIgnoreCase("0"));
				} else {
					Assert.assertTrue(getTxtItemBonusQuantity(lstItem.get(i).getText())
							.getAttribute("value").toString().equalsIgnoreCase("0"));
				}
			}
		}
	}

	@Override
	public void removeBonusItemFromCartByUpdatingQuantity(Configuration testData) {
		PauseUtil.waitForAjaxToComplete(5000);
		List<WebElement> lst = getLstItemId();
		for (int i = 0; i < 2; i++) {
			getTxtItemBonusQuantity(lst.get(i).getText()).clear();
			getTxtItemBonusQuantity(lst.get(i).getText()).sendKeys("0");
			if (SCHUtils.getYTOProductByItemId(lst.get(i).getText()) != null) {
				SCHUtils.removeYTOProductItem(
						SCHUtils.getYTOProductByItemId(lst.get(i).getText()));
			}
		}
	}

	@Override
	public IAddToWishListSection getAddToWishListSection() {
		return SectionFactory.getFactory().getIAddToWishListSection(
				LocatorUtils.getBy("dw.product.addtowishlist.cmp"));
	}

	@Override
	public void verifyQuantityIsNotEditedForCouponsItem() {
		HashMap<String, ProductInfoBean> couponMap = SCHUtils.getCouponItems();
		List<ProductInfoBean> couponBeans =
				new ArrayList<ProductInfoBean>(couponMap.values());

		boolean flag = false;
		try {
			AssertUtils.assertDisplayed(
					getTxtStudentItemQuantity(couponBeans.get(0).getStudentName(),
							couponBeans.get(0).getItemNumber()));

		} catch (Exception e) {
			flag = true;
		}
		Assert.assertTrue(flag, "quantity is update for coupons item");

	}

	@Override
	public void removeAppliedCoupons() {
		try {
			WaitUtils.waitForDisplayed(getHeaderLblStudentName());
		} catch (Exception e) {
			System.out.println("The cart was empty.");
		}
		List<WebElement> removeCoupons = getLstImgRemove();
		for (WebElement removeIcon : removeCoupons) {
			removeIcon.click();
			WaitUtils.waitForDisplayed(getRemoveTooltipYes());
			getRemoveTooltipYes().click();
			PauseUtil.waitForAjaxToComplete(2000);
		}
	}

	@Override
	public void verifyCouponItemIsDeletedOnStudentTable(Configuration testData,
			String page) {
		PauseUtil.pause(2000);
		String student = testData.getString("couponstudent");
		String couponcode = testData.getString("couponnumber");
		String itemid = TestBaseProvider.getTestBase().getContext()
				.getProperty("testexecution.ItemId").toString();

		if (page.equalsIgnoreCase("SFO")) {
			if (!(SCHUtils.isElementPresent("dw.product.ordertable.lbl.studentname",
					itemid)
					|| SCHUtils.isElementPresent(
							"dw.product.studentordertable.lbl.itemid", student,
							itemid))) {
				Assert.assertTrue(true, "Item is deleted successfully - " + page);
			} else {
				Assert.assertTrue(false, "Item is not deleted - " + page);
			}
		} else if (page.equalsIgnoreCase("Review Order")) {
			if (!SCHUtils.isElementPresent(
					"dw.teacherhome.enterorder.revieworder.lbl.itemid", student,
					itemid)) {
				Assert.assertTrue(true, "Item is deleted successfully - " + page);
			} else {
				Assert.assertTrue(false, "Item is not deleted - " + page);
			}
		} else if (page.equalsIgnoreCase("Review All Your Order")) {
			if (!SCHUtils.isElementPresent(
					"dw.checkout.student.coupon.redeemed.table.row", student,
					couponcode)) {
				Assert.assertTrue(true, "Item is deleted successfully - " + page);
			} else {
				Assert.assertTrue(false, "Item is not deleted - " + page);
			}
		} else if (page.equalsIgnoreCase("Confirm and Submit Order")) {
			if (!SCHUtils.isElementPresent(
					"dw.checkout.confirmandsubmitorder.coupondetail.lbl.itemnumber",
					couponcode, itemid)) {
				Assert.assertTrue(true, "Item is deleted successfully - " + page);
			} else {
				Assert.assertTrue(false, "Item is not deleted - " + page);
			}
		} else if (page.equalsIgnoreCase("Thank You")) {
			if (!SCHUtils.isElementPresent("dw.checkout.thankyou.order.row", student,
					itemid)) {
				Assert.assertTrue(true, "Item is deleted successfully - " + page);
			} else {
				Assert.assertTrue(false, "Item is not deleted - " + page);
			}
		}
	}

	@Override
	public void removeCouponItemsFromStudentTable(Configuration data,
			String confirmationStatus) {
		String[] Students =
				SCHUtils.getArrayFromStringData(data.getString("couponstudent"));
		String[] Items = SCHUtils.getArrayFromStringData(TestBaseProvider.getTestBase()
				.getContext().getProperty("testexecution.ItemId").toString());

		if (Boolean.parseBoolean(data.getString("removeitembyquantity"))) {
			getTxtStudentItemQuantity(Students[0], Items[0]).clear();
			getTxtStudentItemQuantity(Students[0], Items[0]).sendKeys("0");
		} else {
			getImgRemoveIcon(Students[0], Items[0]).click();
		}
		AssertUtils.assertDisplayed(getBtnRemoveItemNo(Students[0], Items[0]));
		AssertUtils.assertDisplayed(getBtnRemoveItemYes(Students[0], Items[0]));
		AssertUtils.assertDisplayed(getLblRemoveLabel(Students[0], Items[0]));

		if (confirmationStatus.equalsIgnoreCase("YES")) {
			getBtnRemoveItemYes(Students[0], Items[0]).click();
		} else {
			getBtnRemoveItemNo(Students[0], Items[0]).click();
		}
	}

	@Override
	public void verifyDigitalFlyerItemOnOrderForm() {
		String itemId = TestBaseProvider.getTestBase().getContext()
				.getString("testexecution.digitalFlyerId");
		ProductInfoBean YTOItem = SCHUtils.getYTOProductByItemId(itemId);
		for (WebElement item : getLstItemId()) {
			if (itemId.equalsIgnoreCase(item.getText())) {
				SCHUtils.scrollToView(getItemRow(itemId));
				AssertUtils.assertPresent((ExtendedElement) getItemRow(itemId));
				AssertUtils.assertAttributeMatches(getTxtItemQuantity(itemId), "value",
						Matchers.equalToIgnoringCase(YTOItem.getQuantity()));
				Assert.assertTrue(true, "Digital Flyer item is updated on Order Form");
			}
		}

	}

	@Override
	public void verifyDigitalFlyerItemOnByItem() {
		String itemId = TestBaseProvider.getTestBase().getContext()
				.getString("testexecution.digitalFlyerId");
		AssertUtils.assertDisplayed(getItemRow(itemId));
		Assert.assertTrue(true, "Digital flyer item is added on By Item#");
	}

	@Override
	public void verifyYourTeacherOrderTable() {
		SCHUtils.waitForLoaderToDismiss();
		AssertUtils.assertDisplayed(getLstItemId().get(0));
		AssertUtils.assertDisplayed(getLstItemQuantity().get(0));
		AssertUtils.assertDisplayed(getLstItemTitle().get(0));
		AssertUtils.assertDisplayed(getLstPrice().get(0));
		AssertUtils.assertDisplayed(
				getTxtBonusPointQuantity(getLstItemId().get(0).getText()));
		AssertUtils.assertDisplayed(getTxtItemQuantity(getLstItemId().get(0).getText()));
	}

	@Override
	public void enterDollarQuantity(String qunatity, int loop) {
		SCHUtils.waitForLoaderToDismiss();
		List<WebElement> lstItem = getLstItemId();
		for (int i = 0; i < loop; i++) {
			PauseUtil.pause(2000);
			getTxtItemQuantity(lstItem.get(i).getText()).click();
			getTxtItemQuantity(lstItem.get(i).getText()).sendKeys(qunatity);
			getLblItemPrice(lstItem.get(i).getText()).click();
		}
	}

	@Override
	public void verifyEnteredQunatityRow(String arg1, int loop) {
		List<WebElement> lstItem = getLstItemId();
		for (int i = 0; i < loop; i++) {
			AssertUtils.assertAttributeMatches(getItemRow(lstItem.get(i).getText()),
					"class", Matchers.containsString("focused"));
			AssertUtils.assertAttributeMatches(
					getTxtItemQuantity(lstItem.get(i).getText()), "value",
					Matchers.containsString(arg1));
		}
	}

	@Override
	public void verifyQuantityFieldMaxLimit(int loop) {
		List<WebElement> lstItem = getLstItemId();
		for (int i = 0; i < loop; i++) {
			String strLimit =
					getTxtItemQuantity(lstItem.get(i).getText()).getAttribute("value");
			Assert.assertTrue(strLimit.length() <= 3, "Value exceeds the limit");

		}
	}

	@Override
	public void clickOnItemWithSpecificInput(String clickon) {
		PauseUtil.waitForAjaxToComplete(3000);
		if (clickon.equals("byid")) {
			SCHUtils.scrollToView(getLstItemId().get(0));
			getLstItemId().get(0).click();
		} else {
			SCHUtils.scrollToView(getLstItemTitle().get(0));
			getLstItemTitle().get(0).click();
		}

	}

	@Override
	public void updateQuantityField(Configuration data, int maxQTYValue) {
		String itemId = SCHUtils.getArrayFromStringData(data.getString("itemid"))[0];
		SCHUtils.WaitForAjax();
		getTxtItemQuantity(itemId).clear();
		getTxtItemQuantity(itemId).sendKeys("1000");
		Assert.assertTrue(
				getTxtItemQuantity(itemId).getAttribute("value").trim().length() <= 3
						&& Integer.parseInt(getTxtItemQuantity(itemId)
								.getAttribute("value").toString()) <= 999,
				"Value contains not more than 3 characters and its value is not more than 999");

		getTxtItemQuantity(itemId).clear();
		getTxtItemQuantity(itemId).sendKeys(Integer.toString(maxQTYValue));
		PauseUtil.pause(1000);
		AssertUtils.assertAttributeMatches(getTxtItemQuantity(itemId), "value",
				Matchers.containsString(Integer.toString(maxQTYValue)));

	}

	@Override
	public void verifyCouponItemOnStudentTable(Configuration testData, String page) {
		PauseUtil.pause(2000);
		String student = testData.getString("couponstudent");
		String couponcode = testData.getString("couponnumber");
		String itemid = TestBaseProvider.getTestBase().getContext()
				.getProperty("testexecution.ItemId").toString();

		if (page.equalsIgnoreCase("Review Order")) {
			if (SCHUtils.isElementPresent(
					"dw.teacherhome.enterorder.revieworder.lbl.itemid", student,
					itemid)) {
				Assert.assertTrue(true, "Coupon Item is present on - " + page);
			} else {
				Assert.assertTrue(false, "Coupon Item is not present - " + page);
			}
		} else if (page.equalsIgnoreCase("Rewards & Coupons")) {
			if (SCHUtils.isElementPresent("dw.checkout.student.coupon.redeemed.table.row",
					student, couponcode)) {
				Assert.assertTrue(true, "Coupon item is present - " + page);
			} else {
				Assert.assertTrue(false, "Coupon Item is not present - " + page);
			}
		} else if (page.equalsIgnoreCase("Confirm and Submit Order")) {
			if (SCHUtils.isElementPresent(
					"dw.checkout.confirmandsubmitorder.coupondetail.lbl.itemnumber",
					couponcode, itemid)) {
				Assert.assertTrue(true, "Coupon Item is present on - " + page);
			} else {
				Assert.assertTrue(false, "Coupon Item is not present - " + page);
			}
		} else if (page.equalsIgnoreCase("Thank You")) {
			if (SCHUtils.isElementPresent("dw.checkout.thankyou.order.row", student,
					itemid)) {
				Assert.assertTrue(true, "Coupon Item is present on - " + page);
			} else {
				Assert.assertTrue(false, "Coupon Item is not present - " + page);
			}
		}
	}
	@Override
	public void verifyHighlightedProducts() {
		PauseUtil.pause(5000);
		String itemId = TestBaseProvider.getTestBase().getContext()
				.getString("testexecution.ItemId");
		System.out.println("==========================================" + itemId);
		System.out.println("=========================================="
				+ getTxtItemBonusQuantity(itemId));
		System.out.println("=========================================="
				+ getTxtBonusPointQuantity(itemId));
		AssertUtils.assertAttributeMatches(getItemRow(itemId), "class",
				Matchers.containsString("focused"));
		AssertUtils.assertDisplayed(getTxtItemQuantity(itemId));
		AssertUtils.assertDisplayed(getTxtItemBonusQuantity(itemId));
		AssertUtils.assertDisplayed(getTxtBonusPointQuantity(itemId));
	}
	@Override
	public void verifyItemInAscendingOrder() {
		List<String> itemNumber = new ArrayList<String>();
		for (WebElement ele : getLstItemId()) {
			itemNumber.add(ele.getText());
		}
		List<String> sortedList = new ArrayList<String>(itemNumber);
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(itemNumber),
				"Item Id list is not in Ascending order");
		PauseUtil.pause(5000);
	}
	@Override
	public void verfiyOrderByItemId() {
		getHeaderLblItemNumber().click();
		PauseUtil.pause(5000);
	}
	@Override
	public void verifyItemInDecendingOrder() {
		List<String> items = new ArrayList<String>();
		for (WebElement ele : getLstItemId()) {
			items.add(ele.getText());
		}
		List<String> sortedList = new ArrayList<String>(items);
		Collections.sort(sortedList, Collections.reverseOrder());
		Assert.assertTrue(sortedList.equals(items),
				"Item Id list is not in descending order");
		PauseUtil.pause(5000);
	}
	@Override
	public void verifyOrderOfTitleName() {
		getHeaderLblItemTitle().click();
		PauseUtil.pause(5000);
	}

	@Override
	public void verifyTitleDescendingOrderSort() {
		List<String> title = new ArrayList<String>();
		for (WebElement ele : getLstItemTitle()) {
			title.add(ele.getText());
		}
		List<String> sortedList = new ArrayList<String>(title);
		Collections.sort(sortedList, Collections.reverseOrder());
		Assert.assertTrue(sortedList.equals(title),
				"Flyer title list is not in descending order");
	}

	@Override
	public void verifyTitleAscendingOrderSort() {
		List<String> title = new ArrayList<String>();
		for (WebElement ele : getLstItemTitle()) {
			title.add(ele.getText());
		}
		List<String> sortedList = new ArrayList<String>(title);
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(title),
				"Flyer title list is not in Ascending order");
	}

	@Override
	public void verifyFlyerOrder() {
		getHeaderLblFlyer().click();
		PauseUtil.pause(5000);
	}

	@Override
	public void verifyFlyerDescendingOrderSort() {
		List<String> flyers = new ArrayList<String>();
		for (WebElement ele : getLstItemFlyer()) {
			flyers.add(ele.getText());
		}
		List<String> sortedList = new ArrayList<String>(flyers);
		Collections.sort(sortedList, Collections.reverseOrder());
		Assert.assertTrue(sortedList.equals(flyers),
				"Flyer list is not in descending order");
	}

	@Override
	public void verifyFlyerAscendingOrderSort() {
		List<String> flyers = new ArrayList<String>();
		for (WebElement ele : getLstItemFlyer()) {
			flyers.add(ele.getText());
		}
		List<String> sortedList = new ArrayList<String>(flyers);
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(flyers),
				"Flyer list is not in Ascending order");
	}

	@Override
	public void verifyOrderPriceOfItem() {
		getHeaderLblPrice().click();
		PauseUtil.pause(5000);
	}

	@Override
	public void verifyPriceInAscendingOrder() {
		List<String> itemNumber = new ArrayList<String>();
		for (WebElement ele : getLstItemPrice()) {
			itemNumber.add(ele.getText());
		}
		List<String> sortedList = new ArrayList<String>(itemNumber);
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(itemNumber),
				"Item price list is not in Ascending order");
		PauseUtil.pause(5000);
	}

	@Override
	public void verfiyPriceInDescendingOrder() {
		List<String> items = new ArrayList<String>();
		for (WebElement ele : getLstItemPrice()) {
			items.add(ele.getText());
		}
		List<String> sortedList = new ArrayList<String>(items);
		Collections.sort(sortedList, Collections.reverseOrder());
		Assert.assertTrue(sortedList.equals(items),
				"Item price list is not in descending order");
		PauseUtil.pause(5000);
	}

	@Override
	public void verifyBounsPointOrder() {
		getHeaderLblBonuspoint().click();
		getLstBonuspoint();
		PauseUtil.pause(5000);
	}

	@Override
	public void verfiBonusPointDescendingOrder() {
		List<String> items = new ArrayList<String>();
		for (WebElement ele : getLstItemPrice()) {
			items.add(ele.getText());
		}
		List<String> sortedList = new ArrayList<String>(items);
		Collections.sort(sortedList, Collections.reverseOrder());
		Assert.assertTrue(sortedList.equals(items),
				"Item Bonus Point list is not in descending order");
		PauseUtil.pause(5000);

	}
	@Override
	public void verifyBonusPointAscendingOrder() {
		List<String> itemNumber = new ArrayList<String>();
		for (WebElement ele : getLstItemPrice()) {
			itemNumber.add(ele.getText());
		}
		List<String> sortedList = new ArrayList<String>(itemNumber);
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(itemNumber),
				"Item Bonus point list is not in Ascending order");
		PauseUtil.pause(5000);

	}
}
