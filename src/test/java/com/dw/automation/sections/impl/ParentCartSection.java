package com.dw.automation.sections.impl;

import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.dw.automation.beans.ProductInfoBean;
import com.dw.automation.sections.IParentCartSection;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.LocatorUtils;
import com.scholastic.torque.common.Section;
import com.scholastic.torque.common.TestBaseProvider;

public class ParentCartSection extends Section implements IParentCartSection {

	public ParentCartSection(By by) {
		super(by);
	}

	public ParentCartSection(String locator) {
		super(LocatorUtils.getBy(locator));
	}

	public WebElement getLblItemId(String itemId, String childName) {
		return SCHUtils.findElement("dw.parentcart.lbl.itemid", itemId, childName);
	}

	public WebElement getLblItemName(String itemId, String childName) {
		return SCHUtils.findElement("dw.parentcart.lbl.productname", itemId, childName);
	}

	public WebElement getTxtItemQuantity(String itemId, String childName) {
		return SCHUtils.findElement("dw.parentcart.txt.quantity", itemId, childName);
	}

	public WebElement getLblItemQuantity(String itemId, String childName) {
		return SCHUtils.findElement("dw.parentcart.lbl.quantity", itemId, childName);

	}
	public WebElement getLblItemPrice(String itemId, String childName) {
		return SCHUtils.findElement("dw.parentcart.lbl.productprice", itemId, childName);
	}

	public WebElement getLblTotalItemPrice(String itemId, String childName) {
		return SCHUtils.findElement("dw.parentcart.lbl.totalprice", itemId, childName);
	}

	public WebElement getLblClassroomItemId(String itemId) {
		return SCHUtils.findElement("dw.parentcart.classroom.item.lbl.itemid", itemId);
	}

	public WebElement getLblClassroomItemName(String itemId) {
		return SCHUtils.findElement("dw.parentcart.classroom.item.lbl.productname",
				itemId);
	}

	public WebElement getTxtClassroomItemQuantity(String itemId) {
		return SCHUtils.findElement("dw.parentcart.classroom.item.txt.quantity", itemId);
	}

	public WebElement getLblClassroomItemQuantity(String itemId) {
		return SCHUtils.findElement("dw.parentcart.classroom.item.lbl.quantity", itemId);

	}
	public WebElement getLblClassroomItemPrice(String itemId) {
		return SCHUtils.findElement("dw.parentcart.classroom.item.lbl.totalprice",
				itemId);
	}

	public WebElement getLblTotalClassroomItemPrice(String itemId) {
		return SCHUtils.findElement("dw.parentcart.lbl.totalprice", itemId);
	}

	@FindBy(locator = "dw.studentonlineorders.total")
	private List<WebElement> totalStudentonlineorders;

	@FindBy(locator = "dw.studentonlineorders.totalPrice")
	private WebElement totalPrice;

	@FindBy(locator = "dw.studentonlineorders.totalTotalQty")
	private WebElement itemTotalQty;

	@FindBy(locator = "dw.parentcart.cartSubSection")
	private List<WebElement> parentCartSubSection;

	@FindBy(locator = "dw.parentcart.cartTotalAmount")
	private WebElement parentCartTotalAmount;

	@FindBy(locator = "dw.parent.cart.lbl.recommendedteachername")
	private WebElement lblRecommendedTeacherName;

	@FindBy(locator = "dw.parentcart.lst.product.name")
	private List<WebElement> lstProductTitle;

	public WebElement getLblRecommendedTeacherName() {
		return lblRecommendedTeacherName;
	}

	public List<WebElement> getLstProductTitle() {
		return lstProductTitle;
	}

	public List<WebElement> getParentCartSubSection() {
		return parentCartSubSection;
	}

	public WebElement getParentCartTotalAmount() {
		return parentCartTotalAmount;
	}

	public WebElement getItemTotalQty() {
		return itemTotalQty;
	}

	public WebElement getTotalPrice() {
		return totalPrice;
	}

	public List<WebElement> getTotalStudentonlineorders() {
		return totalStudentonlineorders;
	}

	public WebElement getPOAddChildDropDown(String itemId) {
		return SCHUtils.findElement(
				"dw.parenthome.enterorder.revieworder.select.childname", itemId);
	}

	/**
	 * this method verify parent cart according to different child
	 * modified this method this is for PO Item Verification
	 */
	@Override
	public void verifyParentCartItems() {
		SCHUtils.waitForLoaderToDismiss();
		Map<String, ProductInfoBean> POProducts = SCHUtils.getPOProductItems();
		PauseUtil.pause(3000);
		for (String key : POProducts.keySet()) {
			ProductInfoBean details = POProducts.get(key);

			System.out.println("key.................................." + key);
			System.out.println("ProductInfoBean................" + details);
			if (details.getItemNumber().contains("donation")) {
				details.setItemNumber(ConstantUtils.FREE_BOOKTRUST_ITEMID);
				details.setStudentName("Donation");
			}
			// added condition for wishlist item , as wishlist item do not have
			// child
			if (key.contains("wishlist")) {
				AssertUtils
						.assertDisplayed(getLblClassroomItemId(details.getItemNumber()));
				AssertUtils.assertTextMatches(
						getLblClassroomItemName(details.getItemNumber()),
						Matchers.containsString(details.getItemTitle()));

				AssertUtils.assertTextMatches(
						getLblClassroomItemPrice(details.getItemNumber()),
						Matchers.containsString(details.getPrice()));

				AssertUtils.assertAttributeMatches(
						getTxtClassroomItemQuantity(details.getItemNumber()), "value",
						Matchers.containsString(details.getQuantity()));

			} else {
				AssertUtils.assertAttributeMatches(
						getLblItemId(details.getItemNumber(), details.getStudentName()),
						"data-product-id",
						Matchers.containsString(details.getItemNumber()));

				AssertUtils.assertTextMatches(
						getLblItemName(details.getItemNumber(), details.getStudentName()),
						Matchers.containsString(details.getItemTitle()));

				AssertUtils.assertTextMatches(
						getLblItemPrice(details.getItemNumber(),
								details.getStudentName()),
						Matchers.containsString(details.getPrice()));

				try {
					Assert.assertTrue(getTxtItemQuantity(details.getItemNumber(),
							details.getStudentName()).getAttribute("value")
									.contains(details.getQuantity()));
				} catch (Exception e) {
					Assert.assertTrue(getLblItemQuantity(details.getItemNumber(),
							details.getStudentName()).getText()
									.contains(details.getQuantity()));
				}
			}

		}
	}

	@Override
	public void verifySubOrderTotal() {
		int totalPrice = 0;
		int subTotal = 0;

		for (WebElement webElement : getTotalStudentonlineorders()) {
			List<WebElement> itemPriceList = webElement
					.findElements(LocatorUtils.getBy("dw.studentonlineorders.itemPrice"));
			WebElement subTotalElement = webElement
					.findElement(LocatorUtils.getBy("dw.studentonlineorders.subtotal"));

			for (WebElement price : itemPriceList) {
				String itemPrice = price.getText().trim();
				itemPrice = itemPrice.substring(itemPrice.indexOf("$") + 1,
						itemPrice.indexOf("."));
				totalPrice = totalPrice + Integer.parseInt(itemPrice);
			}

			String subTotal_ = subTotalElement.getText().trim();
			subTotal_ = subTotal_.substring(subTotal_.indexOf("$") + 1,
					subTotal_.indexOf("."));
			subTotal = Integer.parseInt(subTotal_);
			Assert.assertEquals(totalPrice, subTotal);
			totalPrice = 0;
			subTotal = 0;
		}
	}

	@Override
	public void verifySubQuentityTotal() {
		int totalPrice = 0;
		int subTotal = 0;

		for (WebElement webElement : getTotalStudentonlineorders()) {
			List<WebElement> itemPriceList = webElement
					.findElements(LocatorUtils.getBy("dw.studentonlineorders.itemQty"));
			WebElement subTotalElement = webElement.findElement(
					LocatorUtils.getBy("dw.studentonlineorders.itemSubTotalQty"));

			for (WebElement price : itemPriceList) {
				String itemPrice = price.getText().trim();
				totalPrice = totalPrice + Integer.parseInt(itemPrice);
			}

			String subTotal_ = subTotalElement.getText().trim();
			subTotal = Integer.parseInt(subTotal_);
			Assert.assertEquals(totalPrice, subTotal);
			totalPrice = 0;
			subTotal = 0;
		}

	}

	@Override
	public void verifyItemTotalQuentity() {
		int totalPrice = 0;
		int subTotal = 0;

		for (WebElement webElement : getTotalStudentonlineorders()) {
			List<WebElement> itemPriceList = webElement.findElements(
					LocatorUtils.getBy("dw.studentonlineorders.itemSubTotalQty"));

			for (WebElement price : itemPriceList) {
				String itemPrice = price.getText().trim();
				totalPrice = totalPrice + Integer.parseInt(itemPrice);
			}

			String subTotal_ = getItemTotalQty().getText().trim();
			subTotal = Integer.parseInt(subTotal_);
			Assert.assertEquals(totalPrice, subTotal);
			totalPrice = 0;
			subTotal = 0;
		}

	}

	@Override
	public void verifyOrderFinalAmount() {
		int totalPrice = 0;
		int subTotal = 0;

		for (WebElement webElement : getTotalStudentonlineorders()) {
			List<WebElement> subTotalPriceList = webElement
					.findElements(LocatorUtils.getBy("dw.studentonlineorders.subtotal"));

			for (WebElement price : subTotalPriceList) {
				String itemPrice = price.getText().trim();
				itemPrice = itemPrice.substring(itemPrice.indexOf("$") + 1,
						itemPrice.indexOf("."));
				totalPrice = totalPrice + Integer.parseInt(itemPrice);
			}

			String subTotal_ = getTotalPrice().getText().trim();
			subTotal_ = subTotal_.substring(subTotal_.indexOf("$") + 1,
					subTotal_.indexOf("."));
			subTotal = Integer.parseInt(subTotal_);
			Assert.assertEquals(totalPrice, subTotal);
			totalPrice = 0;
			subTotal = 0;
		}

	}

	@Override
	public void verifyParentCartTotalAmount() {
		double totalPrice = 0;
		double subTotal = 0;

		for (WebElement webElement : getParentCartSubSection()) {
			WebElement subTotalPrice = webElement
					.findElement(LocatorUtils.getBy("dw.parentcart.cartItemPrice"));

			String itemPrice = subTotalPrice.getText().trim();
			itemPrice =
					itemPrice.substring(itemPrice.indexOf("$") + 1, itemPrice.length());
			totalPrice = totalPrice + Double.parseDouble(itemPrice);

		}
		String subTotal_ = getParentCartTotalAmount().getText().trim();

		subTotal_ = subTotal_.substring(subTotal_.indexOf("$") + 1, subTotal_.length());
		subTotal = Double.parseDouble(subTotal_);
		Assert.assertEquals(totalPrice, subTotal);
		totalPrice = 0;
		subTotal = 0;

	}

	@Override
	public void verifyParentCartTotalQuentity() {
		double totalItemQuenty = 0;
		double subTotal = 0;

		for (WebElement webElement : getParentCartSubSection()) {

			WebElement itemQuentity_ = webElement
					.findElement(LocatorUtils.getBy("dw.parentcart.cartItemQuentity"));

			// for (WebElement quentity : itemQuentityList) {
			AssertUtils.assertDisplayed(itemQuentity_);
			String itemQuentity = "0";

			if (itemQuentity_.getTagName().equalsIgnoreCase("input")) {
				itemQuentity = itemQuentity_.getAttribute("value").trim();
			} else {
				itemQuentity = itemQuentity_.getText().trim();
			}
			totalItemQuenty = totalItemQuenty + Double.parseDouble(itemQuentity);
			// }

		}

		String subTotal_ = getParentCartTotalAmount().getText().trim();
		System.out.println("Total item Quantity...." + totalItemQuenty);

		subTotal_ = subTotal_
				.substring(subTotal_.indexOf("Items") + 6, subTotal_.indexOf("Order"))
				.trim();
		subTotal = Double.parseDouble(subTotal_);
		Assert.assertEquals(totalItemQuenty, subTotal);
		totalItemQuenty = 0;
		subTotal = 0;

	}

	@Override
	public void verifyParentCartDeleteLink() {

		for (WebElement webElement : getParentCartSubSection()) {
			WebElement deleteLink = webElement
					.findElement(LocatorUtils.getBy("dw.parentcart.delectLink"));
			// Assert.assertTrue(deleteLink.isDisplayed());
			AssertUtils.assertDisplayed(deleteLink);
			System.out.println("delte link .......");
		}
	}

	@Override
	public void verifyParentCartWishListLink() {
		PauseUtil.pause(6000);
		for (WebElement webElement : getParentCartSubSection()) {
			WebElement deleteLink = webElement
					.findElement(LocatorUtils.getBy("dw.parentcart.wishlistLink"));
			Assert.assertTrue(deleteLink.isDisplayed());
		}

	}

	@Override
	public void verifyParentCartItenImage() {
		PauseUtil.pause(3000);
		for (WebElement webElement : getParentCartSubSection()) {
			WebElement img =
					webElement.findElement(LocatorUtils.getBy("dw.parentcart.itemImg"));
			Assert.assertTrue(img.isDisplayed());
		}
	}

	@Override
	public void verifyParentCartItemName() {
		for (WebElement webElement : getParentCartSubSection()) {
			WebElement itemName =
					webElement.findElement(LocatorUtils.getBy("dw.parentcart.itemName"));
			Assert.assertTrue(itemName.isDisplayed());
			System.out.println("Item Name......." + itemName);
		}
	}

	@Override
	public void verifyProductSequenceInCart(String itemId1, String itemId2) {

		// for (WebElement webElement : getParentCartSubSection()) {
		WebElement name = getParentCartSubSection().get(0)
				.findElement(LocatorUtils.getBy("dw.parentcart.itemName"));

		ProductInfoBean bean =
				SCHUtils.getPOProductByIDAndStudentName(itemId1 + "ETEChild ETEChild");

		System.out.println("BEAN 1: " + bean.toString());

		AssertUtils.assertTextMatches(name, Matchers.containsString(bean.getItemTitle()));

		name = getParentCartSubSection().get(1)
				.findElement(LocatorUtils.getBy("dw.parentcart.itemName"));

		bean = SCHUtils.getPOProductByIDAndStudentName(itemId2 + "ETEChild ETEChild");

		System.out.println("BEAN 2: " + bean.toString());

		AssertUtils.assertTextMatches(name, Matchers.containsString(bean.getItemTitle()));

		// }
	}

	@Override
	public void verifyParentCartItemReadingLevel() {
		for (WebElement webElement : getParentCartSubSection()) {
			WebElement readingLevel = webElement
					.findElement(LocatorUtils.getBy("dw.parentcart.readingLevel"));
			Assert.assertTrue(readingLevel.isDisplayed());
		}
	}

	@Override
	public void verifyParentCartItemPrice() {
		for (WebElement webElement : getParentCartSubSection()) {
			WebElement price =
					webElement.findElement(LocatorUtils.getBy("dw.parentcart.itemPrice"));
			Assert.assertTrue(price.isDisplayed());
		}
	}

	@Override
	public void verifyParentCartItemQuentity() {
		for (WebElement webElement : getParentCartSubSection()) {
			WebElement quantity = webElement
					.findElement(LocatorUtils.getBy("dw.parentcart.cartItemQuentity"));
			Assert.assertTrue(quantity.isDisplayed());
		}
	}

	@Override
	public void verifyParentCartItemAge() {
		SCHUtils.waitForLoaderToDismiss();
		for (WebElement webElement : getParentCartSubSection()) {
			WebElement age =
					webElement.findElement(LocatorUtils.getBy("dw.parentcart.itemAge"));
			Assert.assertTrue(age.isDisplayed());
		}
	}

	@Override
	public void verifyParentCartItemGrade() {
		for (WebElement webElement : getParentCartSubSection()) {
			WebElement grade = webElement
					.findElement(LocatorUtils.getBy("dw.parentcart.itemGrades"));
			Assert.assertTrue(grade.isDisplayed());
		}
	}

	@Override
	public void verifySortedItemListOnParentCartPage() {
		SCHUtils.waitForLoaderToDismiss();
		Assert.assertTrue(SCHUtils.isSortedList(lstProductTitle),
				"Item list is not sorted on parent cart page");
	}

	@Override
	public void verifyReccomendedTeacherNameOnReviewCartPage() {

		Map<String, ProductInfoBean> POProducts = SCHUtils.getPOProductItems();
		PauseUtil.pause(4000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		for (String key : POProducts.keySet()) {
			ProductInfoBean details = POProducts.get(key);
			PauseUtil.pause(2000);
			System.out.println(details.getItemNumber());
			AssertUtils.assertTextMatches(
					getLblClassroomItemName(details.getItemNumber()),
					Matchers.containsString(details.getItemTitle()));

			AssertUtils.assertTextMatches(
					getLblClassroomItemPrice(details.getItemNumber()),
					Matchers.containsString(details.getPrice()));

		}

		PauseUtil.pause(5000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete();
		String classroomTeacherSalutation =
				getLblRecommendedTeacherName().getText().split(". ")[0];
		String classroomTeacherName =
				getLblRecommendedTeacherName().getText().split(" ")[1].split("'")[0];

		String teachername = TestBaseProvider.getTestBase().getContext()
				.getProperty("execution.teachername").toString();

		Assert.assertEquals(teachername.split(" ")[1].toUpperCase(),
				classroomTeacherSalutation.toUpperCase());

		Assert.assertEquals(teachername.split(" ")[2], classroomTeacherName);
	}

}
