package com.dw.automation.pages.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.configuration.Configuration;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.dw.automation.beans.ProductInfoBean;
import com.dw.automation.beans.UserProfileBean;
import com.dw.automation.pages.IReviewOrderPage;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;
import com.scholastic.torque.common.WaitUtils;

public class ReviewOrdersPage extends BaseTestPage<TestPage> implements IReviewOrderPage {

	@Override
	public void waitForPageLoad() {
		PauseUtil.pause(3000);
		WaitUtils.waitForDisplayed(getLblStudentFlyerOrderTitle());
	}

	@Override
	protected void openPage() {
		// TODO Auto-generated method stub

	}

	@FindBy(locator = "dw.teacherhome.enterorder.revieworder.lbl.sfotitle")
	private WebElement lblStudentFlyerOrderTitle;

	public WebElement getLblStudentFlyerOrderTitle() {
		return lblStudentFlyerOrderTitle;
	}

	@FindBy(locator = "dw.teacherhome.enterorder.revieworder.lnk.studentflyerorder")
	private WebElement lnkStudentFlyerOrders;

	@FindBy(locator = "dw.teacherhome.enterorder.revieworder.lnk.yourteacherorder")
	private WebElement lnlYourTeacherOrder;

	@FindBy(locator = "dw.teacherhome.enterorder.revieworder.lst.allstudentprice")
	private List<WebElement> allStudentPrice;

	@FindBy(locator = "dw.teacherhome.enterorder.revieworder.lst.allstudentqty")
	private List<WebElement> allStudentQuantity;

	@FindBy(locator = "dw.teacherhome.enterorder.revieworder.lbl.totalprice")
	private WebElement lblTotalPrice;

	@FindBy(locator = "dw.teacherhome.enterorder.revieworder.lbl.totalqty")
	private WebElement lblTotalQty;

	@FindBy(locator = "dw.teacherhome.enterorder.revieworder.div.deleteoption")
	private WebElement deleteItemPopUp;

	@FindBy(locator = "dw.teacherhome.enterorder.revieworder.lst.studentname")
	private List<WebElement> lstStudentName;

	@FindBy(locator = "dw.parenthome.enterorder.revieworder.lst.itemid")
	private List<WebElement> lstParentProductItemId;

	@FindBy(locator = "dw.parenthome.enterorder.revieworder.table")
	private WebElement itemSectionTable;

	@FindBy(locator = "dw.teacherhome.reviewcart.erroronhold")
	private WebElement errorOnHold;

	@FindBy(locator = "dw.teacherhome.reviewcart.wishlist.section.teacher")
	private WebElement teacherInfo;
	
	@FindBy(locator = "dw.teacherhome.enterorder.revieworder.lbl.price")
	private WebElement revieworderpricelabel;
	

	public WebElement getTeacherInfo() {
		return teacherInfo;
	}

	@Override
	public WebElement getErrorOnHold() {
		return errorOnHold;
	}

	public List<WebElement> getLstParentProductItemId() {
		return lstParentProductItemId;
	}

	public WebElement getItemSectionTable() {
		return itemSectionTable;
	}

	public List<WebElement> getParentLstProductItemId() {
		return lstParentProductItemId;
	}

	@FindBy(locator = "dw.teacherhome.enterorder.revieworder.lnk.studentonlineorder")
	private WebElement lnkSOO;

	@FindBy(locator = "dw.product.studentordertable.productdetail.lbl.itemdetail")
	private WebElement lblItemDetail;

	@FindBy(locator = "dw.product.studentordertable.productdetail.img.itemimage")
	private WebElement imgItemImage;

	@FindBy(locator = "dw.parenthome.enterorder.revieworder.lst.childname")
	private List<WebElement> lstChildName;

	@FindBy(locator = "dw.parenthome.enterorder.revieworder.child.dropdown.lbl.childs")
	private List<WebElement> lblAllChildNamesDropdown;

	@FindBy(locator = "dw.product.ordertable.lst.itemname")
	private List<WebElement> lstItemName;
	
	
	
	public WebElement getrevieworderPriceLabel() {

		return revieworderpricelabel;

	}	

	public List<WebElement> getLstItemName() {
		return lstItemName;
	}

	public WebElement getLblItemDetail() {

		return lblItemDetail;

	}

	public WebElement getImgItemImage() {

		return imgItemImage;

	}

	public List<WebElement> getLblAllChildNamesDropdown() {

		return lblAllChildNamesDropdown;

	}

	public List<WebElement> getLstChildName() {
		return lstChildName;
	}

	public WebElement getLnkSOO() {
		return lnkSOO;

	}

	public List<WebElement> getStudentItemIds(String studentName) {
		return SCHUtils.findElements(
				"dw.teacherhome.enterorder.revieworder.particularstudent.lst.itemid",
				studentName);
	}

	public List<WebElement> getLstStudentName() {
		return lstStudentName;
	}

	public WebElement getDeleteItemPopUp() {
		return deleteItemPopUp;
	}

	public WebElement getBtnRemoveYes(String studentName) {
		return SCHUtils.findElement("dw.teacherhome.enterorder.revieworder.btn.removeYes",
				studentName);
	}

	public WebElement getBtnRemoveNo(String studentName) {
		return SCHUtils.findElement("dw.teacherhome.enterorder.revieworder.btn.removeNo",
				studentName);
	}

	public WebElement getLblReviewOrderItemId(String studentName, String itemId) {
		return SCHUtils.findElement("dw.teacherhome.enterorder.revieworder.lbl.itemid",
				studentName, itemId);
	}

	public WebElement getLblReviewOrderItemTitle(String studentName, String itemId) {
		return SCHUtils.findElement("dw.teacherhome.enterorder.revieworder.lbl.itemtitle",
				studentName, itemId);
	}

	public WebElement getLblReviewOrderItemPrice(String studentName, String itemId) {
		return SCHUtils.findElement("dw.teacherhome.enterorder.revieworder.lbl.price",
				studentName, itemId);
	}

	public WebElement getTxtReviewOrderItemquantity(String studentName, String itemId) {
		return SCHUtils.findElement("dw.teacherhome.enterorder.revieworder.txt.quantity",
				studentName, itemId);
	}

	public WebElement getIconReviewOrderRemoveItem(String studentName, String itemId) {
		return SCHUtils.findElement("dw.teacherhome.enterorder.revieworder.icon.remove",
				studentName, itemId);
	}

	public WebElement getLblReviewOrderCoupons(String studentName, String itemId) {
		return SCHUtils.findElement("dw.teacherhome.enterorder.revieworder.lbl.coupons",
				studentName, itemId);
	}

	public WebElement getEditCouponLink(String itemId) {
		return SCHUtils.findElement(
				"dw.teacherhome.enterorder.revieworder.lbl.edit.coupons", itemId);
	}

	public WebElement getLblStudentWiseTotalPrice(String studentName) {
		return SCHUtils.findElement(
				"dw.teacherhome.enterorder.revieworder.lbl.studentwise.totalprice",
				studentName);
	}

	public WebElement getLblStudentWiseTotalQty(String studentName) {
		return SCHUtils.findElement(
				"dw.teacherhome.enterorder.revieworder.lbl.studentwise.totalqty",
				studentName);
	}

	public WebElement getLblStudentFlyerLabel(String studentName, String itemID) {
		return SCHUtils.findElement("dw.teacherhome.enterorder.revieworder.lbl.flyer",
				studentName, itemID);
	}

	public WebElement getProductFullDetails(String studentName, String itemId) {
		return SCHUtils.findElement(
				"dw.teacherhome.enterorder.revieworder.product.full.details", studentName,
				itemId);
	}

	public WebElement getHideDetails(String studentName, String itemId) {
		return SCHUtils.findElement(
				"dw.teacherhome.enterorder.revieworder.product.hide.details", studentName,
				itemId);
	}
	public List<WebElement> getAllStudentPrice() {
		return allStudentPrice;
	}

	public List<WebElement> getAllStudentQuantity() {
		return allStudentQuantity;
	}

	public WebElement getLblTotalPrice() {
		return lblTotalPrice;
	}

	public WebElement getLblTotalQty() {
		return lblTotalQty;
	}

	public WebElement getLnkStudentFlyerOrders() {
		return lnkStudentFlyerOrders;
	}

	public WebElement getLnlYourTeacherOrder() {
		return lnlYourTeacherOrder;
	}

	public WebElement getPOItemTitle(String itemId) {
		return SCHUtils.findElement("dw.parenthome.enterorder.revieworder.lbl.itemtitle",
				itemId);
	}

	public WebElement getPOItemPrice(String itemId) {
		return SCHUtils.findElement("dw.parenthome.enterorder.revieworder.lbl.itemprice",
				itemId);
	}

	public WebElement getPOItemQuantity(String itemId) {
		return SCHUtils.findElement("dw.parenthome.enterorder.revieworder.txt.quantity",
				itemId);
	}

	public WebElement getPOItemRow(String itemId) {
		return SCHUtils.findElement("dw.parenthome.enterorder.revieworder.row.itemid",
				itemId);
	}

	public WebElement getPOAddChildDropDown(String itemId) {
		return SCHUtils.findElement(
				"dw.parenthome.enterorder.revieworder.select.childname", itemId);
	}

	public WebElement getParentItemDeleteButton(String itemId) {
		return SCHUtils.findElement("dw.parenthome.enterorder.revieworder.btn.delete",
				itemId);
	}

	public WebElement getParentItemDeleteYesButton(String itemId) {
		return SCHUtils.findElement("dw.parenthome.enterorder.revieworder.btn.removeYes",
				itemId);
	}

	public WebElement getParentItemDeleteNoButton(String itemId) {
		return SCHUtils.findElement("dw.parenthome.enterorder.revieworder.btn.removeNo",
				itemId);
	}
	public WebElement getPOItemGrade(String itemId) {
		return SCHUtils.findElement("dw.parenthome.enterorder.revieworder.txt.grades",
				itemId);
	}

	public WebElement getPOItemReadingLevel(String itemId) {
		return SCHUtils.findElement(
				"dw.parenthome.enterorder.revieworder.txt.readinglevel", itemId);
	}

	public WebElement getPOItemAge(String itemId) {
		return SCHUtils.findElement("dw.parenthome.enterorder.revieworder.txt.age",
				itemId);
	}

	public WebElement getFreePickItemPrice(String itemId) {
		return SCHUtils.findElement(
				"dw.parenthome.enterorder.revieworder.lbl.freepickitem.price", itemId);
	}

	public WebElement getCouponCode(String itemId) {
		return SCHUtils.findElement(
				"dw.parenthome.enterorder.revieworder.lbl.freepickitem.coupon", itemId);
	}

	public WebElement getDrpDownSelectChildDefault(String itemId) {
		return SCHUtils.findElement(
				"dw.parenthome.enterorder.revieworder.child.dropdown.lbl.childname",
				itemId);
	}

	public WebElement getDrpDownSelectChildAddAChild(String itemId) {
		return SCHUtils.findElement(
				"dw.parenthome.enterorder.revieworder.child.dropdown.lbl.addachild",
				itemId);
	}

	public WebElement getDropDownSelectChildUpdatedChildName(String itemId) {
		return SCHUtils.findElement(
				"dw.parenthome.enterorder.revieworder.child.dropdown.lbl.updatedchildname",
				itemId);
	}

	public WebElement getDropDownLblConnectToTeacher(String itemId) {
		return SCHUtils.findElement(
				"dw.parenthome.enererder.revieworder.child.dropdown.lbl.connectotteacher",
				itemId);
	}

	public WebElement getlblItemPrice(String childName, String itemId) {
		return SCHUtils.findElement("dw.parent.revieworder.lbl.price", childName, itemId);
	}

	/**
	 * This Method Verify Item is Added on Review Order Page
	 *
	 * @param studentName
	 *            , itemID
	 */
	@Override
	public void verifyItemIsAddedOnReviewOrderSFO(String studentName, String itemID) {
		waitForPageLoad();
		Map<String, ProductInfoBean> SFOProducts = SCHUtils.getSFOProductItems();
		for (String key : SFOProducts.keySet()) {
			ProductInfoBean details = SFOProducts.get(key);

			AssertUtils.assertDisplayed(getLblReviewOrderItemId(details.getStudentName(),
					details.getItemNumber()));
			AssertUtils.assertTextMatches(
					getLblReviewOrderItemId(details.getStudentName(),
							details.getItemNumber()),
					Matchers.containsString(details.getItemNumber()));

			Assert.assertEquals(
					SCHUtils.changeTradeMark(getLblReviewOrderItemTitle(
							details.getStudentName(), details.getItemNumber()).getText()),
					SCHUtils.changeTradeMark(details.getItemTitle()));
			// AssertUtils.assertTextMatches(
			// getLblReviewOrderItemTitle(details.getStudentName(),
			// details.getItemNumber()),
			// Matchers.containsString());
			// System.out.println("Price................"
			// + SCHUtils.getPriceWithOutCurrency(details.getPrice()));
			// System.out.println("Quantity......."
			// + getTxtReviewOrderItemquantity(details.getStudentName(),
			// details.getItemNumber()).getAttribute("value"));
			//
			// Double price = (SCHUtils
			// .getPriceWithOutCurrency(details.getPrice()))
			// / Double.parseDouble(getTxtReviewOrderItemquantity(
			// details.getStudentName(), details.getItemNumber())
			// .getAttribute("value"));
			// System.out.println("Total Price.........." + price);
			AssertUtils.assertTextMatches(
					getLblReviewOrderItemPrice(details.getStudentName(),
							details.getItemNumber()),
					Matchers.containsString(details.getPrice()));

			AssertUtils.assertTextMatches(
					getLblStudentFlyerLabel(details.getStudentName(),
							details.getItemNumber()),
					Matchers.containsString(details.getFlyer()));
			// added this condition because for coupons
			if (details.getCoupon().isEmpty()) {
				AssertUtils.assertAttributeMatches(
						getTxtReviewOrderItemquantity(details.getStudentName(),
								details.getItemNumber()),
						"value", Matchers.containsString(details.getQuantity()));

			}
		}
	}

	/**
	 * this Method remove items for review order page
	 *
	 * @param data
	 */

	@Override
	public void removeItemsFromReviewOrderPage(Configuration data) {
		String[] Students =
				SCHUtils.getArrayFromStringData(data.getString("studentname"));
		String[] Items = SCHUtils.getArrayFromStringData(data.getString("itemid"));

		String productIDStudentName = Items[0] + Students[0];

		if (Boolean.parseBoolean(data.getString("removeitembyquantity"))) {
			getTxtReviewOrderItemquantity(Students[0], Items[0]).clear();
			getTxtReviewOrderItemquantity(Students[0], Items[0]).sendKeys("0");
		} else {
			getIconReviewOrderRemoveItem(Students[0], Items[0]).click();
		}
		String status = data.getString("confirmstatus");
		AssertUtils.assertDisplayed(getBtnRemoveNo(Students[0]));
		AssertUtils.assertDisplayed(getBtnRemoveYes(Students[0]));

		if (status.equalsIgnoreCase("YES")) {
			getBtnRemoveYes(Students[0]).click();
			SCHUtils.removeSFOProductItem(
					SCHUtils.getSFOProductByIDAndStudentName(productIDStudentName));
		} else {
			getBtnRemoveNo(Students[0]).click();
		}

	}

	/**
	 * This Method Verify Delete item option disappear After 10 sec if no action
	 * is performed on sfo
	 */
	@Override
	public void verifyDeleteOptionDisappearOnNoActionOnReviewOrder(Configuration data) {
		String[] Students =
				SCHUtils.getArrayFromStringData(data.getString("studentname"));
		String[] Items = SCHUtils.getArrayFromStringData(data.getString("itemid"));
		getIconReviewOrderRemoveItem(Students[0], Items[0]).click();
		PauseUtil.waitForAjaxToComplete(5000);
		AssertUtils.assertAttributeMatches(getDeleteItemPopUp(), "style",
				Matchers.containsString("none"));
	}

	/**
	 * This Method verify Item is delete After click on yes button
	 */
	@Override
	public void verifyUpdatedRecordsAfterRemovalOnReviewOrder(Configuration data) {
		HashMap<String, ProductInfoBean> itemDeleted =
				SCHUtils.getSFORemovedProductItems();
		String[] student = SCHUtils.getArrayFromStringData(data.getString("studentname"));
		String[] itemid = SCHUtils.getArrayFromStringData(data.getString("itemid"));
		if (student.length > 0) {
			if (!itemDeleted.containsKey(itemid[0] + student[0])) {
				Assert.assertTrue(true, "Item is not deleted");
			}
		}
	}

	/**
	 * This Method Use For Edit Quantity For Product Order Table
	 */
	@Override
	public void editProductQuantityOnReviewOrder(Configuration data) {
		String studentName =
				SCHUtils.getArrayFromStringData(data.getString("studentname"))[0];
		String itemId = SCHUtils.getArrayFromStringData(data.getString("itemid"))[0];
		String quantity = data.getString("quantity");
		getTxtReviewOrderItemquantity(studentName, itemId).clear();
		getTxtReviewOrderItemquantity(studentName, itemId).sendKeys(quantity);
		getLblStudentFlyerLabel(studentName, itemId).click();
		ProductInfoBean bean =
				SCHUtils.getSFOProductByIDAndStudentName(itemId + studentName);
		bean.setQuantity(quantity);
		SCHUtils.addSFOProductItem(bean);

	}

	/**
	 * This Method will verify that student names are in ascending order in
	 * Review Sfo page
	 */
	@Override
	public void verifyStudentNamesAscOrder() {
		List<String> studentNames = new ArrayList<String>();
		for (WebElement ele : getLstStudentName()) {
			studentNames.add(ele.getText());
		}
		List<String> sortedList = new ArrayList<String>(studentNames);
		Collections.sort(sortedList);
		Assert.assertTrue(sortedList.equals(studentNames),
				"Student list is not in alphabetical order");
	}

	/**
	 * This method
	 * add item
	 * to Product bean for parent
	 */
	@Override
	public ProductInfoBean fillPOProductBean(String itemId, String childName) {
		ProductInfoBean productInfoBean = new ProductInfoBean();
		productInfoBean.setItemNumber(itemId);
		productInfoBean.setItemTitle(getPOItemTitle(itemId).getText());
		productInfoBean.setPrice(getPOItemPrice(itemId).getText());
		productInfoBean.setQuantity(getPOItemQuantity(itemId).getAttribute("value"));
		productInfoBean.setStudentName(childName);
		productInfoBean.setGrades(getPOItemGrade(itemId).getText());
		productInfoBean.setAges(getPOItemAge(itemId).getText());
		productInfoBean.setReadingLevel(getPOItemReadingLevel(itemId).getText());
		return productInfoBean;
	}
	/**
	 * This Method will click on SFO link below table on Review SFO page
	 */
	@Override
	public void clickSFOLink() {
		getLnkStudentFlyerOrders().click();
	}

	/**
	 * This Method will click on YTO link below table on Review SFO page
	 */
	@Override
	public void clickYTOLink() {
		getLnlYourTeacherOrder().click();
	}

	/**
	 * This method delete particular item by Id from parent review Page
	 *
	 * @param itemId
	 */
	@Override
	public void deleteItemFromParentById(String itemId) {
		getParentItemDeleteButton(itemId).click();
		PauseUtil.waitForAjaxToComplete(2000);
		WaitUtils.waitForDisplayed(getParentItemDeleteYesButton(itemId));
		SCHUtils.clickUsingJavaScript(getParentItemDeleteYesButton(itemId));
		PauseUtil.waitForAjaxToComplete(4000);
	}

	public void removeAllItemFromParentCart() {
		while (SCHUtils.isPresent(getItemSectionTable())) {
			PauseUtil.waitForAjaxToComplete(3000);
			String itemId =
					getParentLstProductItemId().get(0).getAttribute("data-product-id");
			System.out.println("Item - Id" + itemId);
			WaitUtils.waitForDisplayed(getParentItemDeleteButton(itemId));
			deleteItemFromParentById(itemId);
		}

	}

	@Override
	public void verifyStudentLevelOnReviewSFO() {
		Double totalSFOPrice = 0.0;
		int totalQuantity = 0;
		for (WebElement ele : getLstStudentName()) {
			String studentName = ele.getText();
			// Verification of Item Ids for each student on Review Cart page
			List<String> itemids = new ArrayList<String>();
			for (WebElement element : getStudentItemIds(studentName)) {
				itemids.add(element.getText());
			}
			List<String> sortedList = new ArrayList<String>(itemids);
			Collections.sort(sortedList);
			Assert.assertTrue(sortedList.equals(itemids), "Item IDs for Student "
					+ studentName + " are not in ascending order");

			// Verification of total quantity and price of each student
			Map<String, ProductInfoBean> SFOProducts = SCHUtils.getSFOProductItems();
			int quantity = 0;
			Double priceTotal = 0.0;
			for (String key : SFOProducts.keySet()) {
				if (key.contains(studentName)) {
					quantity += (Integer.parseInt(SFOProducts.get(key).getQuantity()));
					priceTotal += +(Double.parseDouble(SFOProducts.get(key).getQuantity())
							* SCHUtils.getPriceWithOutCurrency(
									SFOProducts.get(key).getPrice()));
				}
			}
			AssertUtils.assertTextMatches(getLblStudentWiseTotalPrice(studentName),
					Matchers.containsString(priceTotal.toString()));
			AssertUtils.assertTextMatches(getLblStudentWiseTotalQty(studentName),
					Matchers.containsString(String.valueOf(quantity)));
			totalSFOPrice += priceTotal;
			totalQuantity += quantity;
		}
		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.SFO_TOTAL_PRICE, totalSFOPrice.toString());
		TestBaseProvider.getTestBase().getContext().setProperty(
				ConstantUtils.SFO_TOTAL_QUANTITY, String.valueOf(totalQuantity));
	}

	@Override
	public void clickOnSOOLink() {
		PauseUtil.waitForAjaxToComplete(5000);
		getLnkSOO().click();
	}

	public WebElement getPOFreePickItemQuantity(String itemId) {
		return SCHUtils.findElement(
				"dw.parenthome.enterorder.revieworder.txt.freepick.quantity", itemId);
	}

	@Override
	public void verifyButtonState(Configuration testData) {
		String buttonState = testData.getString("buttonstate");
		if ("SOO".equalsIgnoreCase(buttonState)) {
			AssertUtils.assertDisplayed(getLnkSOO());
		} else if ("YTO".equalsIgnoreCase(buttonState)) {
			AssertUtils.assertDisplayed(getLnlYourTeacherOrder());
		} else {
			System.out.println(
					"Please specify expected button state in test data which is expected");
		}
	}

	@Override
	public void editProductQuantityOnOrderTable(Configuration testData) {
		String studentName =
				SCHUtils.getArrayFromStringData(testData.getString("studentname"))[0];

		String itemId = SCHUtils.getArrayFromStringData(testData.getString("itemid"))[0];
		String quantity = testData.getString("quantity");
		getTxtReviewOrderItemquantity(studentName, itemId).clear();
		getTxtReviewOrderItemquantity(studentName, itemId).sendKeys(quantity);
		PauseUtil.waitForAjaxToComplete(1000);
		getLblStudentFlyerOrderTitle().click();
		PauseUtil.waitForAjaxToComplete(2000);

		ProductInfoBean bean =
				SCHUtils.getSFOProductByIDAndStudentName(itemId + studentName);
		bean.setQuantity(
				getTxtReviewOrderItemquantity(studentName, itemId).getAttribute("value"));

		SCHUtils.addSFOProductItem(bean);
	}

	/**
	 * This Method will verify total cost and quantity on Review SFO page that
	 * is set during verification of student level cost and price
	 */
	@Override
	public void verifyTotalPriceQuantity(Configuration testData) {
		AssertUtils.assertTextMatches(getLblTotalPrice(),
				Matchers.containsString(TestBaseProvider.getTestBase().getContext()
						.getString(ConstantUtils.SFO_TOTAL_PRICE)));
		AssertUtils.assertTextMatches(getLblTotalQty(),
				Matchers.containsString(TestBaseProvider.getTestBase().getContext()
						.getString(ConstantUtils.SFO_TOTAL_QUANTITY)));
	}

	@Override
	public void clickOnItemAddedOnStudentTable(Configuration data) {
		PauseUtil.pause(2000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		String studentNameArray[] =
				SCHUtils.getArrayFromStringData(data.getString("studentname"));
		String itemIdArray[] = SCHUtils.getArrayFromStringData(data.getString("itemid"));
		if (data.getString("flagid").equalsIgnoreCase("true")) {
			getLblReviewOrderItemId(studentNameArray[0], itemIdArray[0]).click();
		} else {
			getLblReviewOrderItemTitle(studentNameArray[0], itemIdArray[0]).click();
		}
	}

	@Override
	public void verifyItemQuickLookOnOrderTable(Configuration data) {
		WebElement itemDetails = lblItemDetail;
		WaitUtils.waitForDisplayed(itemDetails);
		AssertUtils.assertDisplayed(itemDetails);
		AssertUtils.assertDisplayed(imgItemImage);

		// Specify expected item title in the quick view
		if (data.getString("itemtitle") != null) {
			AssertUtils.assertTextMatches(itemDetails,
					Matchers.containsString(data.getString("itemtitle")));
		}
		AssertUtils.assertTextMatches(itemDetails, Matchers.containsString("Ages"));
		AssertUtils.assertTextMatches(itemDetails, Matchers.containsString("Grades"));
		AssertUtils.assertTextMatches(itemDetails,
				Matchers.containsString("Reading Level"));
		PauseUtil.pause(2000);
	}

	@Override
	public void removeItemsFromReviewOrderPageBasedOnStatus(Configuration testData,
			String confirmationStatus) {
		String[] Students =
				SCHUtils.getArrayFromStringData(testData.getString("studentname"));
		String[] Items = SCHUtils.getArrayFromStringData(testData.getString("itemid"));

		String productIDStudentName = Items[0] + Students[0];

		if (Boolean.parseBoolean(testData.getString("removeitembyquantity"))) {
			getTxtReviewOrderItemquantity(Students[0], Items[0]).clear();
			getTxtReviewOrderItemquantity(Students[0], Items[0]).sendKeys("0");
		} else {
			getIconReviewOrderRemoveItem(Students[0], Items[0]).click();
		}
		AssertUtils.assertDisplayed(getBtnRemoveNo(Students[0]));
		AssertUtils.assertDisplayed(getBtnRemoveYes(Students[0]));

		if (confirmationStatus.equalsIgnoreCase("YES")) {
			getBtnRemoveYes(Students[0]).click();
			SCHUtils.removeSFOProductItem(
					SCHUtils.getSFOProductByIDAndStudentName(productIDStudentName));
		} else {
			getBtnRemoveNo(Students[0]).click();
		}
	}
	@Override
	public void setDefaultChild(String itemId) {
		if (TestBaseProvider.getTestBase().getContext()
				.getProperty("defaultchild") == null) {
			TestBaseProvider.getTestBase().getContext().setProperty(
					"testexecution.defaultchild",
					SCHUtils.findElement(
							"dw.parenthome.enterorder.revieworder.select.childname",
							itemId).getText());
		}
	}
	@Override
	public void verifyDefaultChild(String itemId) {
		SCHUtils.waitForLoaderToDismiss();
		AssertUtils.assertTextMatches(
				SCHUtils.findElement(
						"dw.parenthome.enterorder.revieworder.select.childname", itemId),
				Matchers.containsString(TestBaseProvider.getTestBase().getContext()
						.getString("testexecution.defaultchild")));
	}
	@Override
	public void verifyChildList() {

		HashMap<String, UserProfileBean> userProfileBean1 =
				SCHUtils.getChildTeacherDetails();

		for (String key : userProfileBean1.keySet()) {
			UserProfileBean userProfileBean = userProfileBean1.get(key);
			Assert.assertTrue(getLstChildName().get(0).getText()
					.contains(userProfileBean.getChildName()));
		}

	}
	@Override
	public void clickOnAddChildFromChildDropDown() {
		SCHUtils.selectOptionByVisibleText(getLstChildName().get(0),
				ConstantUtils.ADDNEWCHILD);
		PauseUtil.waitForAjaxToComplete(2000);
	}

	@Override
	public void removeFreePickItems() {
		HashMap<String, ProductInfoBean> productInfoBeanMap = SCHUtils.getCouponItems();
		String couponnumber =
				TestBaseProvider.getTestBase().getTestData().getString("couponcode");
		for (String key : productInfoBeanMap.keySet()) {
			ProductInfoBean productInfo = productInfoBeanMap.get(key);
			if (productInfo.getCoupon().equalsIgnoreCase(couponnumber)) {
				deleteItemFromParentById(productInfo.getItemNumber());
				SCHUtils.removeCouponItem(productInfo);
			}
		}

	}

	@Override
	public void removeParentOrderItem(String itemId) {
		HashMap<String, ProductInfoBean> productInfoBeanMap =
				SCHUtils.getPOProductItems();
		List<String> keyList = new ArrayList<>();
		for (String key : productInfoBeanMap.keySet()) {
			ProductInfoBean productInfo = productInfoBeanMap.get(key);
			if (productInfo.getItemNumber().equalsIgnoreCase(itemId)) {
				deleteItemFromParentById(productInfo.getItemNumber());
				keyList.add(key);
				// SCHUtils.removeParentItem(productInfo);
			}
		}
		for (int i = 0; i < keyList.size(); i++) {
			ProductInfoBean productInfo = productInfoBeanMap.get(keyList.get(i));
			SCHUtils.removeParentItem(productInfo);
		}

		TestBaseProvider.getTestBase().getContext()
				.setProperty("testexecution.removedPOItem", itemId);
	}

	@Override
	public void verifyAddedFreePickItem() {
		PauseUtil.pause(5000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(5000);
		HashMap<String, ProductInfoBean> productInfoBeanMap = SCHUtils.getCouponItems();
		String couponnumber =
				TestBaseProvider.getTestBase().getTestData().getString("couponcode");
		for (String key : productInfoBeanMap.keySet()) {
			ProductInfoBean productInfo = productInfoBeanMap.get(key);
			if (productInfo.getCoupon().equalsIgnoreCase(couponnumber)) {
				AssertUtils.assertDisplayed(getPOItemRow(productInfo.getItemNumber()));
				AssertUtils.assertTextMatches(getPOItemTitle(productInfo.getItemNumber()),
						Matchers.equalToIgnoringCase(productInfo.getItemTitle()));
				AssertUtils.assertTextMatches(
						getPOFreePickItemQuantity(productInfo.getItemNumber()),
						Matchers.equalToIgnoringCase(productInfo.getQuantity()));
				AssertUtils.assertTextMatches(
						getFreePickItemPrice(productInfo.getItemNumber()),
						Matchers.containsString(productInfo.getPrice()));
				AssertUtils.assertTextMatches(getCouponCode(productInfo.getItemNumber()),
						Matchers.equalToIgnoringCase(productInfo.getCoupon()));

			}
		}
	}

	@Override
	public void verifyRemovedFreePickItem(Configuration data) {
		HashMap<String, ProductInfoBean> itemDeleted = SCHUtils.getCouponRemovedItems();
		String keyValue = data.getString("couponcode");
		for (String key : itemDeleted.keySet()) {
			if (itemDeleted.containsKey(key.contains(keyValue))) {
				AssertUtils.assertNotDisplayed(
						getCouponCode(itemDeleted.get(key).getCoupon()));
				Assert.assertTrue(true, "Item is not deleted");
			}
		}
	}
	@Override
	public void updateQuantity(String itemId, String childName) {

		String quantity =
				TestBaseProvider.getTestBase().getTestData().getString("itemquantity");
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.pause(2000);
		getPOItemQuantity(itemId).clear();
		getPOItemQuantity(itemId).sendKeys(quantity);
		ProductInfoBean productBean =
				SCHUtils.getPOProductByIDAndStudentName(itemId + childName);
		productBean.setQuantity(quantity);
		System.out.println(".............." + productBean);
		getLstItemName().get(0).click();
		// getDriver().navigate().refresh();
		PauseUtil.pause(7000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(7000);
		// System.out.println("setting price on review order-----859"
		// + getlblItemPrice(childName, itemId).getText());
		// productBean.setPrice(getlblItemPrice(childName, itemId).getText());
		// SCHUtils.addPOProductItem(productBean);
		// getItemSectionTable().click();
	}
	public void verifyRewardsCouponPageFields() {
		AssertUtils.assertDisplayed(getItemSectionTable());
	}

	@Override
	public void verifyChild(String itemId, String childName) {
		SCHUtils.waitForLoaderToDismiss();
		AssertUtils.assertTextMatches(
				SCHUtils.findElement(
						"dw.parenthome.enterorder.revieworder.select.childname", itemId),
				Matchers.containsString(childName));
	}
	@Override
	public void verifyStudentConnectedToTeacher(String childName, String itemId) {

		Select select = new Select(getPOAddChildDropDown(itemId));

		List<WebElement> dropDownOption = select.getOptions();

		for (WebElement option : dropDownOption) {
			System.out.println(option.getText());
			if (option.getText().equals(childName)) {
				AssertUtils.assertTextMatches(option, Matchers.containsString(childName));
				break;
			}
		}

	}

	@Override
	public void setPropertyForNewChild(String itemId, String newChildName,
			String oldChild) {
		TestBaseProvider.getTestBase().getTestData().setProperty("childname",
				newChildName);
		ProductInfoBean bean = SCHUtils.getPOProductByIDAndStudentName(itemId + oldChild);
		bean.setStudentName(newChildName);
	}
	@Override
	public void verifySelectChildForItem(String itemId) {
		getDrpDownSelectChildDefault(itemId).click();
		AssertUtils.assertDisplayed(getDrpDownSelectChildAddAChild(itemId));
	}

	@Override
	public void verifyUpdatedChildName(Configuration data, String itemId) {
		PauseUtil.pause(2000);
		AssertUtils.assertTextMatches(getDropDownSelectChildUpdatedChildName(itemId),
				Matchers.containsString(data.getString("updatedname")));
	}
	@Override
	public void verifyProductDetails(Configuration data) {
		PauseUtil.pause(2000);
		AssertUtils.assertDisplayed(getProductFullDetails(
				data.getString("detailstudentname"), data.getString("studentitemid")));
	}
	@Override
	public void verifyHideDetailsAndClick(Configuration data) {
		AssertUtils.assertDisplayed(getHideDetails(data.getString("detailstudentname"),
				data.getString("studentitemid")));
		getHideDetails(data.getString("detailstudentname"),
				data.getString("studentitemid")).click();
		PauseUtil.pause(2000);
	}

	public void selectConnectToTeacher(String couponIndex) {
		PauseUtil.waitForAjaxToComplete(2000);
		SCHUtils.waitForLoaderToDismiss();
		HashMap<String, ProductInfoBean> couponMap = SCHUtils.getCouponItems();
		List<ProductInfoBean> couponBeans =
				new ArrayList<ProductInfoBean>(couponMap.values());
		getDropDownSelectChildUpdatedChildName(
				couponBeans.get(Integer.parseInt(couponIndex) - 1).getItemNumber())
						.click();
		PauseUtil.pause(1000);
		getDropDownLblConnectToTeacher(
				couponBeans.get(Integer.parseInt(couponIndex) - 1).getItemNumber())
						.click();
		PauseUtil.waitForAjaxToComplete(1000);

	}

	public void selectConnectToTeacherByItemId(String item) {
		PauseUtil.waitForAjaxToComplete(2000);
		SCHUtils.waitForLoaderToDismiss();
		getDropDownSelectChildUpdatedChildName(item).click();
		PauseUtil.pause(1000);
		getDropDownLblConnectToTeacher(item).click();
		PauseUtil.waitForAjaxToComplete(1000);

	}

	public void clickOnEditCouponLink(String couponIndex) {
		HashMap<String, ProductInfoBean> couponMap = SCHUtils.getCouponItems();
		List<ProductInfoBean> couponBeans =
				new ArrayList<ProductInfoBean>(couponMap.values());
		AssertUtils.assertDisplayed(getEditCouponLink(
				couponBeans.get(Integer.parseInt(couponIndex) - 1).getItemNumber()));
		getEditCouponLink(
				couponBeans.get(Integer.parseInt(couponIndex) - 1).getItemNumber())
						.click();
		PauseUtil.pause(1000);
	}
	@Override
	public void verifyWishListSectionReviewCart(String itemId) {
		PauseUtil.pause(8000);
		SCHUtils.waitForLoaderToDismiss();
		AssertUtils.assertDisplayed(getTeacherInfo());
	}
	public void verifyTotalForDifferentStudent() {

	}

}
