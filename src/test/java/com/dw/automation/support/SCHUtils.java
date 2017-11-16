package com.dw.automation.support;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.configuration.Configuration;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dw.automation.beans.ProductInfoBean;
import com.dw.automation.beans.UserProfileBean;
import com.dw.automation.pages.IProfilePage;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.LocatorUtils;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;
public class SCHUtils extends BaseTestPage<TestPage> {

	private static final String CURRENCY_SYMBOLS = "\\p{Sc}\u0024\u060B";

	public static String changeTradeMark(String s) {
		if (s.contains("&#")) {
			return s.replaceAll("&#8482;", "\u2122");

		}
		return s;
	}
	@Override
	protected void openPage() {
	}

	/**
	 * this method will return WebElement for dynamic locators which needs
	 * String format
	 *
	 * @param loc
	 *            -Locator
	 */
	public static WebElement findElement(String loc, String... value) {
		switch (value.length) {
			case 0 :
				return TestBaseProvider.getTestBase().getDriver()
						.findElement(LocatorUtils.getBy(loc));
			case 1 :
				try {
					return TestBaseProvider.getTestBase().getDriver()
							.findElement(LocatorUtils.getBy(String.format(
									TestBaseProvider.getTestBase().getString(loc),
									value[0])));

				} catch (Exception e) {
					return TestBaseProvider.getTestBase().getDriver()
							.findElement(LocatorUtils.getBy(String
									.format(TestBaseProvider.getTestBase().getString(loc),
											value[0].toUpperCase(Locale.ENGLISH))));
				}

			case 2 :
				return TestBaseProvider.getTestBase().getDriver()
						.findElement(LocatorUtils.getBy(String.format(
								TestBaseProvider.getTestBase().getString(loc), value[0],
								value[1])));

			case 3 :
				return TestBaseProvider.getTestBase().getDriver()
						.findElement(LocatorUtils.getBy(String.format(
								TestBaseProvider.getTestBase().getString(loc), value[0],
								value[1], value[2])));

			default :
				return null;
		}

	}

	/**
	 * @param item
	 *            : item to be selected
	 * @param ele
	 *            : if dropDown needs to be clicked before selecting item
	 */
	public static void selectItemByText(String item, WebElement... ele) {
		if (ele.length == 1) {
			SCHUtils.waitForLoaderToDismiss();
			clickUsingJavaScript(ele[0]);
		}
		// PauseUtil.waitForAjaxToComplete(5000);
		WebElement subEle =
				TestBaseProvider.getTestBase().getDriver().findElement(LocatorUtils.getBy(String.format(
						TestBaseProvider.getTestBase().getString("dw.schutils.lst.specificitem"),item)));
		clickUsingJavaScript(subEle);
	}

	/**
	 * @param item
	 *            : item to be selected
	 * @param ele
	 *            : if dropDown needs to be clicked before selecting item
	 */
	public static void selectItemByTextCheckBox(String item, WebElement... ele) {
		if (ele.length == 1) {
			clickUsingJavaScript(ele[0]);
		}
		PauseUtil.pause(5000);
		WebElement subEle =
				TestBaseProvider.getTestBase().getDriver()
						.findElement(
								LocatorUtils
										.getBy(String.format(
												TestBaseProvider.getTestBase().getString(
														"dw.schutils.lst.specificitem1"),
												item)));
		clickUsingJavaScript(subEle);
	}

	/**
	 * @param data
	 *            :string array containing comma separated items
	 * @param ele
	 *            :if dropDown needs to be clicked before selecting item
	 */
	public static void selectItemsByText(String data, WebElement... ele) {
		String[] items = data.split(",");
		if (ele.length == 1) {
			clickUsingJavaScript(ele[0]);
		}
		for (String item : items) {
			selectItemByText(item);
		}
	}

	public static void clickUsingJavaScript(WebElement ele) {
		
		if (TestBaseProvider.getTestBase().getContext().getString("driver.name")
				.equals("Remote")
				|| TestBaseProvider.getTestBase().getContext().getString("driver.name")
						.equals("Chrome")) {
			try {
				waitForElementToBeClickable(ele, 30);
				ele.click();
			} catch (Exception e) {
				((JavascriptExecutor) TestBaseProvider.getTestBase().getDriver())
						.executeScript("arguments[0].click()", ele);
			}
		} else {
			((JavascriptExecutor) TestBaseProvider.getTestBase().getDriver())
					.executeScript("arguments[0].click()", ele);
		}
	}

	public static void selectOptionByIndex(WebElement selectEle, int index) {
		Select select = new Select(selectEle);
		select.selectByIndex(index);
	}

	/**
	 * @param selectEle
	 *            :select tag element
	 * @param text
	 *            :item to be selected
	 */
	public static void selectOptionByVisibleText(WebElement selectEle, String text) {
		Select select = new Select(selectEle);
		select.selectByVisibleText(text);
	}

	public static void selectOptionByvalue(WebElement selectEle, String text) {
		Select select = new Select(selectEle);
		select.selectByValue(text);		
	}

	/**
	 * @param data
	 *            :string array containing comma separated items
	 * @param ele
	 *            :select tag element
	 */
	public static void selectOptionsByVisibleText(WebElement ele, String data) {
		String[] options = data.split(",");
		for (String option : options) {
			SCHUtils.selectOptionByVisibleText(ele, option);
		}
	}

	public static List<WebElement> findElements(String loc, String... value) {
		switch (value.length) {
			case 1 :
				return TestBaseProvider.getTestBase().getDriver()
						.findElements(LocatorUtils.getBy(String.format(
								TestBaseProvider.getTestBase().getString(loc),
								value[0])));
			case 2 :
				return TestBaseProvider.getTestBase().getDriver()
						.findElements(LocatorUtils.getBy(String.format(
								TestBaseProvider.getTestBase().getString(loc), value[0],
								value[1])));

			case 3 :
				return TestBaseProvider.getTestBase().getDriver()
						.findElements(LocatorUtils.getBy(String.format(
								TestBaseProvider.getTestBase().getString(loc), value[0],
								value[1], value[2])));

			default :
				return null;
		}

	}

	/**
	 * This Method Verify Whether Element is present or not
	 */
	public static boolean isSize(List<WebElement> element) {
		if(element.size()!=0)
		{
		return true;	
		}
		else
		{
		return false;	
		}
	}
	
	
	public static boolean isPresent(WebElement element) {
		boolean flag = false;
		try {
			flag = element.isDisplayed();
		} catch (Exception e) {
		}
		return flag;
	}
	
	

	public static boolean isElementPresent(String loc, String... value) {
		try {
			SCHUtils.findElement(loc, value);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/* This method is used to return array of comma separated data string */
	public static String[] getArrayFromStringData(String key) {
		String[] data = key.split(",");
		return data;
	}

	/**
	 * @param ele
	 *            : checkBox element
	 * @param select
	 *            :true or false
	 */
	public static void selectCheckBox(WebElement ele, String select) {
		if (select != null && !select.equalsIgnoreCase("")) {
			if (select.equalsIgnoreCase("true") && !ele.isSelected()) {
				clickUsingJavaScript(ele);
			} else if (select.equalsIgnoreCase("false") && ele.isSelected()) {
				clickUsingJavaScript(ele);
			}
		}
	}

	public static void clickBrowserBackButton() {
		waitForLoaderToDismiss();
		TestBaseProvider.getTestBase().getDriver().navigate().back();
		PauseUtil.pause(2000);
	}

	@SuppressWarnings("unchecked")
	public static HashMap<String, ProductInfoBean> getSFOProductItems() {
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.SFO_CART_PRODUCTS)) {
			productsList =
					((HashMap<String, ProductInfoBean>) TestBaseProvider.getTestBase()
							.getContext().getProperty(ConstantUtils.SFO_CART_PRODUCTS));

		} else {
			productsList = new HashMap<String, ProductInfoBean>();
			TestBaseProvider.getTestBase().getContext()
					.setProperty(ConstantUtils.SFO_CART_PRODUCTS, productsList);
		}
		return productsList;
	}

	public static void setYTOProductItems(HashMap<String, ProductInfoBean> productsList) {
		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.YTO_CART_PRODUCTS, productsList);
	}

	public static void setParentProductItems(
			HashMap<String, ProductInfoBean> productsList) {
		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.PRODUCT_DETAIL_PAGE, productsList);
	}

	@SuppressWarnings("unchecked")
	public static HashMap<String, ProductInfoBean> getYTOProductItems() {
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.YTO_CART_PRODUCTS)) {

			productsList =
					((HashMap<String, ProductInfoBean>) TestBaseProvider.getTestBase()
							.getContext().getProperty(ConstantUtils.YTO_CART_PRODUCTS));

		} else {
			productsList = new HashMap<String, ProductInfoBean>();
			TestBaseProvider.getTestBase().getContext()
					.setProperty(ConstantUtils.YTO_CART_PRODUCTS, productsList);
		}
		return productsList;
	}

	@SuppressWarnings("unchecked")
	public static HashMap<String, ProductInfoBean> getParentProductItems() {
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.PRODUCT_DETAIL_PAGE)) {

			productsList =
					((HashMap<String, ProductInfoBean>) TestBaseProvider.getTestBase()
							.getContext().getProperty(ConstantUtils.PRODUCT_DETAIL_PAGE));

		} else {
			productsList = new HashMap<String, ProductInfoBean>();
			TestBaseProvider.getTestBase().getContext()
					.setProperty(ConstantUtils.PRODUCT_DETAIL_PAGE, productsList);
		}
		return productsList;
	}

	@SuppressWarnings("unchecked")
	public static HashMap<String, ProductInfoBean> getPOProductItems() {
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.PO_CART_PRODUCTS)) {

			productsList =
					((HashMap<String, ProductInfoBean>) TestBaseProvider.getTestBase()
							.getContext().getProperty(ConstantUtils.PO_CART_PRODUCTS));

		} else {
			productsList = new HashMap<String, ProductInfoBean>();
			TestBaseProvider.getTestBase().getContext()
					.setProperty(ConstantUtils.PO_CART_PRODUCTS, productsList);
		}
		return productsList;
	}

	@SuppressWarnings("unchecked")
	public static HashMap<String, UserProfileBean> getChildTeacherDetails() {
		HashMap<String, UserProfileBean> userProfileBean;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.CHILDTEACHERINFO)) {

			userProfileBean =
					((HashMap<String, UserProfileBean>) TestBaseProvider.getTestBase()
							.getContext().getProperty(ConstantUtils.CHILDTEACHERINFO));

		} else {
			userProfileBean = new HashMap<String, UserProfileBean>();
			TestBaseProvider.getTestBase().getContext()
					.setProperty(ConstantUtils.CHILDTEACHERINFO, userProfileBean);
			System.out.println("in set 1 ......");
		}
		return userProfileBean;
	}

	public static void setSFOProductItems(HashMap<String, ProductInfoBean> productsList) {
		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.SFO_CART_PRODUCTS, productsList);
	}

	public static void setPOProductItems(HashMap<String, ProductInfoBean> productsList) {
		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.PO_CART_PRODUCTS, productsList);
	}

	public static void setChildTeacherDetails(
			HashMap<String, UserProfileBean> userProfileBean) {
		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.CHILDTEACHERINFO, userProfileBean);
		System.out.println("in set 2 ........");
	}

	public static void setSFORemoveProductItems(
			HashMap<String, ProductInfoBean> productsList) {
		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.SFO_REMOVED_CART_PRODUCTS, productsList);
	}

	@SuppressWarnings("unchecked")
	public static HashMap<String, ProductInfoBean> getSFORemovedProductItems() {
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.SFO_REMOVED_CART_PRODUCTS)) {

			productsList = ((HashMap<String, ProductInfoBean>) TestBaseProvider
					.getTestBase().getContext()
					.getProperty(ConstantUtils.SFO_REMOVED_CART_PRODUCTS));

		} else {
			productsList = new HashMap<String, ProductInfoBean>();
			TestBaseProvider.getTestBase().getContext()
					.setProperty(ConstantUtils.SFO_REMOVED_CART_PRODUCTS, productsList);
		}
		return productsList;
	}
	public static void setSFORemovedProductItems(
			HashMap<String, ProductInfoBean> productsList) {
		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.SFO_REMOVED_CART_PRODUCTS, productsList);
	}

	public static void setWishListProductInfoBean(
			HashMap<String, ProductInfoBean> productsList) {
		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.WISHLIST_PRODUCT_ITEMS, productsList);
	}

	@SuppressWarnings("unchecked")
	public static ProductInfoBean getSFOProductByIDAndStudentName(
			String productIDStudentName) {
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.SFO_CART_PRODUCTS)) {

			productsList =
					((HashMap<String, ProductInfoBean>) TestBaseProvider.getTestBase()
							.getContext().getProperty(ConstantUtils.SFO_CART_PRODUCTS));

			for (String key : productsList.keySet()) {
				ProductInfoBean details = productsList.get(key);
				if (productIDStudentName.equalsIgnoreCase(
						details.getItemNumber() + details.getStudentName())) {
					return details;
				}
			}
		} else {
			return null;
		}
		return null;
	}
	public static void addSFOProductItem(ProductInfoBean productDetails) {
		HashMap<String, ProductInfoBean> items = getSFOProductItems();
		items.put(productDetails.getItemNumber() + productDetails.getStudentName(),
				productDetails);
		setSFOProductItems(items);
	}

	public static void addUserProfile(UserProfileBean userProfileBean) {
		addUserProfileBean(userProfileBean);
		setUserProfileBean(userProfileBean);
	}

	public static void setUserProfileBean(UserProfileBean userProfileBean) {
		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.USER_PROFILE, userProfileBean);
	}

	private static void addUserProfileBean(UserProfileBean userProfileBean) {
		IProfilePage profilePage = getFactory().getIProfilePage();
		userProfileBean = profilePage.fillUserProfileBean();

	}

	public static void addYTOProductItem(ProductInfoBean productDetails) {
		HashMap<String, ProductInfoBean> items = getYTOProductItems();
		if (productDetails.getItemNumber() != null
				&& productDetails.getItemNumber().trim().length() > 0) {
			items.put(productDetails.getItemNumber(), productDetails);
		} else {
			items.put(productDetails.getItemTitle(), productDetails);
		}

		setYTOProductItems(items);
	}

	public static void addParentroductItem(ProductInfoBean productDetails) {
		System.out.println("#############################going to fill  : "
				+ productDetails.toString());
		HashMap<String, ProductInfoBean> items = getParentProductItems();
		System.out.println("################################### KEY "
				+ productDetails.getItemTitle());
		items.put(productDetails.getItemTitle(), productDetails);
		setParentProductItems(items);
	}

	public static void addPOProductItem(ProductInfoBean productDetails) {
		HashMap<String, ProductInfoBean> items = getPOProductItems();
		items.put(productDetails.getItemNumber() + productDetails.getStudentName(),
				productDetails);
		setPOProductItems(items);
	}

	public static void addChildTeacherDetails(UserProfileBean userProfileBean) {
		HashMap<String, UserProfileBean> childTeacherBean = getChildTeacherDetails();
		childTeacherBean.put(userProfileBean.getChildName(), userProfileBean);
		System.out.println("add child teacher details...");
		setChildTeacherDetails(childTeacherBean);
	}

	public static void addSFORemovedProductItem(ProductInfoBean productDetails) {
		HashMap<String, ProductInfoBean> items = getSFORemovedProductItems();
		items.put(productDetails.getItemNumber() + productDetails.getStudentName(),
				productDetails);
		setSFORemoveProductItems(items);
	}

	public static void removeSFOProductItem(ProductInfoBean productDetails) {
		HashMap<String, ProductInfoBean> items = getSFOProductItems();
		addSFORemovedProductItem(productDetails);
		items.remove(productDetails.getItemNumber() + productDetails.getStudentName());
		setSFOProductItems(items);
	}

	/**
	 * @param :String
	 * @return select :true or false
	 */
	public static boolean isAlphaNumeric(String s) {
		String pattern = "^[a-zA-Z0-9]*$";
		if (s.matches(pattern)) {
			return true;
		}
		return false;
	}

	/**
	 * This Method Return price Without Currency
	 *
	 * @param text
	 * @return
	 */
	public static Double getPriceWithOutCurrency(String text) {

		String textDouble = getPriceWithCurrency(text);
		System.out.println("Parameter passed ->" + text);
		Pattern pattern = Pattern.compile("[\\d{0,9}[,\\.]?(\\d{1,2})?]+");
		Matcher matcher = pattern.matcher(textDouble);
		if (matcher.find()) {

			try {
				return Double.parseDouble(matcher.group(0).replaceAll(",", ""));
			} catch (NumberFormatException e) {
				return Double.parseDouble(
						matcher.group(0).replaceAll(",", "").replaceAll("[^0-9]", ""));
			}
		}

		return 0.0;
	}

	public static String getPriceWithCurrency(String text) {
		System.out.println("para pass ->" + text);
		Pattern p = Pattern
				.compile("[" + CURRENCY_SYMBOLS + "][\\d{0,9}[,\\.]?(\\d{1,2})?]+");
		Matcher m = p.matcher(text);
		while (m.find()) {
			return m.group();
		}
		return text;
	}

	@SuppressWarnings("unchecked")
	public static HashMap<String, ProductInfoBean> getSOOProductItems() {
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.SOO_CART_PRODUCTS)) {

			productsList =
					((HashMap<String, ProductInfoBean>) TestBaseProvider.getTestBase()
							.getContext().getProperty(ConstantUtils.SOO_CART_PRODUCTS));

		} else {
			productsList = new HashMap<String, ProductInfoBean>();
			TestBaseProvider.getTestBase().getContext()
					.setProperty(ConstantUtils.SOO_CART_PRODUCTS, productsList);
		}
		return productsList;
	}
	public static void setSOOProductItems(HashMap<String, ProductInfoBean> productsList) {
		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.SOO_CART_PRODUCTS, productsList);
	}

	public static void addSOOProductItem(String key, ProductInfoBean productDetails) {
		HashMap<String, ProductInfoBean> items = getSOOProductItems();
		items.put(key, productDetails);
		setSOOProductItems(items);
	}

	public static double getProductItemTotal(Map<String, ProductInfoBean> Products) {
		double totalAmount = 0;
		for (String key : Products.keySet()) {
			ProductInfoBean details = Products.get(key);
			String quantity = "1";
			if (details.getQuantity() != null) {
				quantity = details.getQuantity();
			}
			totalAmount =
					totalAmount + SCHUtils.getPriceWithOutCurrency(details.getPrice())
							* SCHUtils.getPriceWithOutCurrency(quantity);
		}
		return totalAmount;
	}
	@SuppressWarnings("unchecked")
	public static ProductInfoBean getSOOProductByKeyValue(String key) {
		ProductInfoBean details = null;
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.SOO_CART_PRODUCTS)) {

			productsList =
					((HashMap<String, ProductInfoBean>) TestBaseProvider.getTestBase()
							.getContext().getProperty(ConstantUtils.SOO_CART_PRODUCTS));

			details = productsList.get(key);

		}
		return details;
	}
	public static UserProfileBean getChildTeacherInfoByChildName(String childName) {
		UserProfileBean teacherDetails = null;
		HashMap<String, UserProfileBean> childTeacherInfo;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.CHILDTEACHERINFO)) {
			System.out.println("in get..............");
			childTeacherInfo = getChildTeacherDetails();
			teacherDetails = childTeacherInfo.get(childName);
			System.out.println("teacherDetails===" + teacherDetails);
		}
		return teacherDetails;
	}

	public static void removeSOOProductItem(ProductInfoBean productDetails,
			String keyValue) {
		HashMap<String, ProductInfoBean> items = getSOOProductItems();
		Set<String> keyset = new HashSet<String>();
		for (String key : items.keySet()) {
			String keyAfterSplit = key.substring(0, key.indexOf("."));
			if (keyAfterSplit.equals(keyValue)) {
				addSOORemovedProductItem(productDetails, key);
				keyset.add(key);
			}
		}
		for (String key : keyset) {
			items.remove(key);
		}
		setSOOProductItems(items);

	}
	public static void addSOORemovedProductItem(ProductInfoBean productDetails,
			String Key) {
		HashMap<String, ProductInfoBean> items = getSOORemovedProductItems();
		items.put(Key, productDetails);
		setSOORemoveProductItems(items);
	}
	@SuppressWarnings("unchecked")
	public static HashMap<String, ProductInfoBean> getSOORemovedProductItems() {
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.SOO_REMOVED_CART_PRODUCTS)) {

			productsList = ((HashMap<String, ProductInfoBean>) TestBaseProvider
					.getTestBase().getContext()
					.getProperty(ConstantUtils.SOO_REMOVED_CART_PRODUCTS));

		} else {
			productsList = new HashMap<String, ProductInfoBean>();
			TestBaseProvider.getTestBase().getContext()
					.setProperty(ConstantUtils.SOO_REMOVED_CART_PRODUCTS, productsList);
		}
		return productsList;
	}
	public static void setSOORemoveProductItems(
			HashMap<String, ProductInfoBean> productsList) {
		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.SOO_REMOVED_CART_PRODUCTS, productsList);
	}

	/**
	 * This Method Returns The Total No Of Order Amount From Sfo Order Bean
	 *
	 * @return
	 */
	public static Double getSFOOrderTotal() {
		Map<String, ProductInfoBean> SFOProducts = SCHUtils.getSFOProductItems();
		String quantity, price;
		double orderTotal = 0;
		for (String key : SFOProducts.keySet()) {
			quantity = SFOProducts.get(key).getQuantity();
			price = SFOProducts.get(key).getPrice();
			System.out.println("SFO key->" + key);
			System.out.println("SFO Quantity ->" + quantity);
			System.out.println("SFO Price ->" + price);
			orderTotal += (Integer.parseInt(quantity)
					* (SCHUtils.getPriceWithOutCurrency(price)));
		}
		return orderTotal;
	}
	/**
	 * This Method Return Total No Of Student From Sfo order bean
	 *
	 * @return
	 */
	public static int getSFOStudentTotal() {
		Map<String, ProductInfoBean> SFOProducts = SCHUtils.getSFOProductItems();
		Set<String> studentName = new HashSet<String>();
		for (String key : SFOProducts.keySet()) {
			studentName.add(SFOProducts.get(key).getStudentName());
		}
		return studentName.size();
	}

	/**
	 * This method return total no of amount due from yto
	 *
	 * @return
	 */
	public static Double getYTOOrderTotal() {
		Map<String, ProductInfoBean> YTOProducts = SCHUtils.getYTOProductItems();
		String quantity;
		double price;
		double orderTotal = 0;
		for (String key : YTOProducts.keySet()) {
			quantity = YTOProducts.get(key).getQuantity();
			price = SCHUtils.getPriceWithOutCurrency(YTOProducts.get(key).getPrice());
			orderTotal += ((Integer.parseInt(quantity) * price));
		}
		return orderTotal;
	}
	/**
	 * this method return total no of Bonus Point earned from yto
	 *
	 * @return
	 */
	public static int getYTOBPTotal() {
		Map<String, ProductInfoBean> YTOProducts = SCHUtils.getYTOProductItems();
		String bonusprice, bonusQty;
		int BPTotal = 0;
		for (String key : YTOProducts.keySet()) {
			bonusprice = YTOProducts.get(key).getBonusPoint();
			if (bonusprice != null) {
				bonusQty = YTOProducts.get(key).getBonusPointQuantity();

				BPTotal += Integer.parseInt(bonusQty) * Integer.parseInt(bonusprice);
			}
		}
		return BPTotal;
	}

	/**
	 * this method return total no of soo order amount paid
	 *
	 * @return
	 */
	public static Double getSOOOrderTotal() {
		Map<String, ProductInfoBean> SOOProducts = SCHUtils.getSOOProductItems();
		String price;
		double orderTotal = 0;
		for (String key : SOOProducts.keySet()) {
			// ProductInfoBean productInfoBean = SOOProducts.get(key);
			price = SOOProducts.get(key).getPrice();
			orderTotal += SCHUtils.getPriceWithOutCurrency(price);
		}
		return orderTotal;
	}

	public static int getPOOOrderTotal() {
		Map<String, ProductInfoBean> SOOProducts = SCHUtils.getPOProductItems();
		String price;
		int orderTotal = 0;
		for (String key : SOOProducts.keySet()) {
			ProductInfoBean productInfoBean = SOOProducts.get(key);
			price = SOOProducts.get(key).getPrice();
			orderTotal += SCHUtils.getPriceWithOutCurrency(price).intValue();
		}
		return orderTotal;
	}

	/**
	 * this method return total no of SOO Student
	 *
	 * @return
	 */
	public static int getSOOOrderCount() {
		Map<String, ProductInfoBean> SOOProducts = SCHUtils.getSOOProductItems();
		Set<String> orderNames = new HashSet<String>();
		for (String key : SOOProducts.keySet()) {
			System.out.println("Key Split....." + key.split("\\.")[0]);
			orderNames.add(key.split("\\.")[0]);
		}
		System.out.println("Total order Size......." + orderNames.size());
		return orderNames.size();
	}

	@SuppressWarnings("unchecked")
	public static ProductInfoBean getYTOProductByItemId(String itemNumber) {
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.YTO_CART_PRODUCTS)) {
			productsList =
					((HashMap<String, ProductInfoBean>) TestBaseProvider.getTestBase()
							.getContext().getProperty(ConstantUtils.YTO_CART_PRODUCTS));
			for (String key : productsList.keySet()) {
				ProductInfoBean details = productsList.get(key);
				if (itemNumber.equalsIgnoreCase(details.getItemNumber())
						|| itemNumber.contains(details.getItemTitle())) {
					return details;
				}
			}
		} else {
			return null;
		}
		return null;
	}

	public static void removeYTOProductItem(ProductInfoBean productDetails) {
		HashMap<String, ProductInfoBean> items = getYTOProductItems();
		addYTORemovedProductItem(productDetails);
		items.remove(productDetails.getItemNumber());
		setYTOProductItems(items);
	}

	public static void addYTORemovedProductItem(ProductInfoBean productDetails) {
		HashMap<String, ProductInfoBean> items = getYTORemovedProductItems();
		items.put(productDetails.getItemNumber(), productDetails);
		setYTORemoveProductItems(items);
	}

	public static void setYTORemoveProductItems(
			HashMap<String, ProductInfoBean> productsList) {
		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.YTO_REMOVED_CART_PRODUCTS, productsList);
	}

	@SuppressWarnings("unchecked")
	public static HashMap<String, ProductInfoBean> getYTORemovedProductItems() {
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.YTO_REMOVED_CART_PRODUCTS)) {
			productsList = ((HashMap<String, ProductInfoBean>) TestBaseProvider
					.getTestBase().getContext()
					.getProperty(ConstantUtils.YTO_REMOVED_CART_PRODUCTS));
		} else {
			productsList = new HashMap<String, ProductInfoBean>();
			TestBaseProvider.getTestBase().getContext()
					.setProperty(ConstantUtils.YTO_REMOVED_CART_PRODUCTS, productsList);
		}
		return productsList;
	}
	/**
	 * This method return standard format price let say if you pass 6060 then it
	 * returns 6,060
	 *
	 * @param value
	 * @return
	 */
	public static String getStandardPriceFormat(double value) {
		return NumberFormat.getNumberInstance(Locale.US).format(value);
	}

	public static void waitForLoaderToDismiss() {
		WebDriverWait wait = new WebDriverWait(TestBaseProvider.getTestBase().getDriver(),
				Integer.parseInt(TestBaseProvider.getTestBase().getContext()
						.getString("wait.timeout.sec")));
		try {
			wait.until(new ExpectedCondition<Boolean>() {
				@Override
				public Boolean apply(WebDriver wdriver) {
					return ((JavascriptExecutor) TestBaseProvider.getTestBase()
							.getDriver()).executeScript("return document.readyState")
									.equals("complete");
				}
			});
		} catch (Exception e) {
			System.out.println("Waiting for Loader to dismiss timed out");
		}
	}

	public static void scrollToView(Object data) {
		try {
			JavascriptExecutor js =
					(JavascriptExecutor) TestBaseProvider.getTestBase().getDriver();
			js.executeScript("arguments[0].scrollIntoView();", (WebElement) data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static long getRandomNumber() {
		return Math.round(Math.random() * 10000);
	}

	@SuppressWarnings("unchecked")
	public static HashMap<String, ProductInfoBean> getCouponItems() {
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.COUPONS_PRODUCTS)) {

			productsList =
					((HashMap<String, ProductInfoBean>) TestBaseProvider.getTestBase()
							.getContext().getProperty(ConstantUtils.COUPONS_PRODUCTS));
		} else {
			productsList = new HashMap<String, ProductInfoBean>();
			TestBaseProvider.getTestBase().getContext()
					.setProperty(ConstantUtils.COUPONS_PRODUCTS, productsList);
		}
		return productsList;
	}
	public static void addCouponItem(ProductInfoBean productDetails) {

		HashMap<String, ProductInfoBean> items = getCouponItems();
		items.put(productDetails.getCoupon() + productDetails.getItemNumber(),
				productDetails);
		setCoupounItems(items);
	}

	public static void setCoupounItems(HashMap<String, ProductInfoBean> productsList) {
		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.COUPONS_PRODUCTS, productsList);
	}

	public static boolean isNumeric(String s) {
		return s.matches("[-+]?\\d*\\.?\\d+");
	}

	public static boolean isSortedList(List<WebElement> lstItem) {
		boolean flag = false;
		List<String> studentNames = new ArrayList<String>();
		for (WebElement ele : lstItem) {
			studentNames.add(ele.getText());
		}
		List<String> sortedList = new ArrayList<String>(studentNames);
		Collections.sort(sortedList);
		flag = sortedList.equals(studentNames);
		return flag;
	}

	/**
	 * @param productIDStudentName
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static ProductInfoBean getPOProductByIDAndStudentName(
			String productIDStudentName) {
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.PO_CART_PRODUCTS)) {

			productsList =
					((HashMap<String, ProductInfoBean>) TestBaseProvider.getTestBase()
							.getContext().getProperty(ConstantUtils.PO_CART_PRODUCTS));

			for (String key : productsList.keySet()) {
				ProductInfoBean details = productsList.get(key);
				if (productIDStudentName.equalsIgnoreCase(
						details.getItemNumber() + details.getStudentName())) {
					return details;
				}
			}
		} else {
			return null;
		}
		return null;
	}

	// public static void addOrderDetailsOnSubmitOrderPage(String childName) {
	// UserProfileBean userProfileBean =
	// getChildTeacherInfoByChildName(childName);
	// Map<String, UserProfileBean> teachername;
	// HashMap<String, Map<String, UserProfileBean>> childInfo;
	// for() {
	//
	// }
	//
	// }

	/**
	 * This method return the Hashmap which contains teacher order information
	 * for all the childs
	 */
	@SuppressWarnings("unchecked")
	public static HashMap<String, ProductInfoBean> getPOSOOMap() {
		HashMap<String, ProductInfoBean> teacherOrderMap;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.POSOO_CART_PRODUCTS)) {

			teacherOrderMap =
					((HashMap<String, ProductInfoBean>) TestBaseProvider.getTestBase()
							.getContext().getProperty(ConstantUtils.POSOO_CART_PRODUCTS));

		} else {
			teacherOrderMap = new HashMap<String, ProductInfoBean>();
			setPOSOOProductItems(teacherOrderMap);
		}
		return teacherOrderMap;
	}

	public static void setPOSOOProductItems(
			HashMap<String, ProductInfoBean> teacherOrderMap) {
		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.POSOO_CART_PRODUCTS, teacherOrderMap);
	}

	public static void addPOSOOProduct(String teacherName, String childName,
			String itemNumber, ProductInfoBean productDetails) {
		HashMap<String, ProductInfoBean> teacherOrderMap = getPOSOOMap();
		teacherOrderMap.put(teacherName + "." + childName + "." + itemNumber,
				productDetails);
		setPOSOOProductItems(teacherOrderMap);
	}

	/**
	 * This Method Return Total No of coupon Items
	 *
	 * @return
	 */
	public static int getTotalCouponItems(Configuration data) {
		Map<String, ProductInfoBean> CoupnItems = SCHUtils.getCouponItems();
		int totalQuantity = 0;
		for (String key : CoupnItems.keySet()) {

			if (key.contains(data.getString("couponnumber"))) {
				totalQuantity = totalQuantity
						+ Integer.parseInt(CoupnItems.get(key).getQuantity());
			}

		}
		return totalQuantity;
	}

	/**
	 * This Method Return Total price of all Items applied by same coupon
	 *
	 * @return
	 */
	public static double getTotalCouponItemsPrice(Configuration data) {
		Map<String, ProductInfoBean> CoupnItems = SCHUtils.getCouponItems();
		Double totalPrice = 0.0;
		for (String key : CoupnItems.keySet()) {
			if (key.contains(data.getString("couponnumber"))) {
				totalPrice = totalPrice + SCHUtils.getPriceWithOutCurrency(
						CoupnItems.get(key).getCouponItemPrice());
			}

		}
		return totalPrice;
	}

	public static void mouseHoverOnElement(WebElement ele) {
		Actions hover = new Actions(TestBaseProvider.getTestBase().getDriver());
		hover.moveToElement(ele).build().perform();
	}

	@SuppressWarnings("unchecked")
	public static ProductInfoBean getCouponItemByIdAndName(String CouponIdAndItemname) {
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.COUPONS_PRODUCTS)) {

			productsList =
					((HashMap<String, ProductInfoBean>) TestBaseProvider.getTestBase()
							.getContext().getProperty(ConstantUtils.COUPONS_PRODUCTS));

			for (String key : productsList.keySet()) {
				ProductInfoBean details = productsList.get(key);
				if ((details.getCoupon() + details.getItemNumber())
						.contains(CouponIdAndItemname)) {
					return details;
				}
			}
		} else {
			return null;
		}
		return null;
	}

	public static void removeCouponItem(ProductInfoBean productDetails) {
		HashMap<String, ProductInfoBean> items = getCouponItems();
		addRemovedCouponItem(productDetails);
		items.remove(productDetails.getCoupon() + productDetails.getItemNumber());
		setCoupounItems(items);
	}

	public static void addRemovedCouponItem(ProductInfoBean productDetails) {
		HashMap<String, ProductInfoBean> items = getCouponRemovedItems();
		items.put(productDetails.getCoupon() + productDetails.getItemNumber(),
				productDetails);
		setCouponRemovedProductItems(items);
	}

	public static void removeParentItem(ProductInfoBean productDetails) {
		HashMap<String, ProductInfoBean> items = getPOProductItems();
		addRemovedParentItem(productDetails);
		items.remove(productDetails.getItemNumber() + productDetails.getStudentName());
		setPOProductItems(items);
	}

	public static void addRemovedParentItem(ProductInfoBean productDetails) {
		HashMap<String, ProductInfoBean> items = getParentRemovedItems();
		items.put(productDetails.getItemNumber() + productDetails.getStudentName(),
				productDetails);
		setParentRemovedItems(items);
	}

	@SuppressWarnings("unchecked")
	public static HashMap<String, ProductInfoBean> getCouponRemovedItems() {
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.COUPON_REMOVED_ITEMS)) {

			productsList = ((HashMap<String, ProductInfoBean>) TestBaseProvider
					.getTestBase().getContext()
					.getProperty(ConstantUtils.COUPON_REMOVED_ITEMS));

		} else {
			productsList = new HashMap<String, ProductInfoBean>();
			TestBaseProvider.getTestBase().getContext()
					.setProperty(ConstantUtils.COUPON_REMOVED_ITEMS, productsList);
		}
		return productsList;
	}

	@SuppressWarnings("unchecked")
	public static HashMap<String, ProductInfoBean> getParentRemovedItems() {
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.PARENT_REMOVED_ITEMS)) {

			productsList = ((HashMap<String, ProductInfoBean>) TestBaseProvider
					.getTestBase().getContext()
					.getProperty(ConstantUtils.PARENT_REMOVED_ITEMS));

		} else {
			productsList = new HashMap<String, ProductInfoBean>();
			TestBaseProvider.getTestBase().getContext()
					.setProperty(ConstantUtils.PARENT_REMOVED_ITEMS, productsList);
		}
		return productsList;
	}

	public static void setParentRemovedItems(
			HashMap<String, ProductInfoBean> productsList) {
		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.PARENT_REMOVED_ITEMS, productsList);

	}

	public static void setCouponRemovedProductItems(
			HashMap<String, ProductInfoBean> productsList) {
		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.COUPON_REMOVED_ITEMS, productsList);
	}

	/**
	 * This Method Returns The Total Order Amount of particular child from
	 * Parent Order bean
	 *
	 * @author rahul.suthar
	 * @return
	 */
	public static double getIndividualChildTotal(String childName) {
		HashMap<String, ProductInfoBean> POProducts = getPOProductItems();
		String quantity, price;

		Double orderTotal = 0.0;
		for (String key : POProducts.keySet()) {
			if (POProducts.get(key).getStudentName().equalsIgnoreCase(childName)) {
				quantity = POProducts.get(key).getQuantity();
				price = POProducts.get(key).getPrice();
				orderTotal += (Integer.parseInt(quantity)
						* (SCHUtils.getPriceWithOutCurrency(price)).intValue());
			}

		}
		return orderTotal;
	}

	public static String getPriceWithDollar(Double value) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		return formatter.format(value);
	}

	public static WebElement waitForElementToBeClickable(WebElement element,
			long timeOut) {
		try {
			WebDriverWait wait = new WebDriverWait(
					TestBaseProvider.getTestBase().getDriver(), timeOut);
			element = wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
		}
		return element;
	}
	public static WebElement waitForElementToBeDisplayed(WebElement element,
														 long timeOut) {
		try {
			WebDriverWait wait = new WebDriverWait(
					TestBaseProvider.getTestBase().getDriver(), timeOut);
			element = wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
		}
		return element;
	}
	public static void WaitForAjax() {
		try {
			(new WebDriverWait(TestBaseProvider.getTestBase().getDriver(), 60))
					.until(new ExpectedCondition<Boolean>() {
						@Override
						public Boolean apply(WebDriver d) {
							JavascriptExecutor js = (JavascriptExecutor) TestBaseProvider
									.getTestBase().getDriver();
							return (Boolean) js.executeScript(
									"return !!window.jQuery && window.jQuery.active == 0");

						}
					});
		} catch (Exception e) {
		}
	}

	public static void refreshPage() {
		TestBaseProvider.getTestBase().getDriver().navigate().refresh();
	}

	@SuppressWarnings("unchecked")
	public static HashMap<String, ProductInfoBean> getWishListProductItems() {
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.WISHLIST_PRODUCT_ITEMS)) {

			productsList = ((HashMap<String, ProductInfoBean>) TestBaseProvider
					.getTestBase().getContext()
					.getProperty(ConstantUtils.WISHLIST_PRODUCT_ITEMS));

		} else {
			productsList = new HashMap<String, ProductInfoBean>();
			TestBaseProvider.getTestBase().getContext()
					.setProperty(ConstantUtils.WISHLIST_PRODUCT_ITEMS, productsList);
		}
		return productsList;
	}

	@SuppressWarnings("unchecked")
	public static HashMap<String, ProductInfoBean> getRemovedWishListProductItems() {
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.WISHLIST_REMOVED_PRODUCT_ITEMS)) {

			productsList = ((HashMap<String, ProductInfoBean>) TestBaseProvider
					.getTestBase().getContext()
					.getProperty(ConstantUtils.WISHLIST_REMOVED_PRODUCT_ITEMS));

		} else {
			productsList = new HashMap<String, ProductInfoBean>();
			TestBaseProvider.getTestBase().getContext().setProperty(
					ConstantUtils.WISHLIST_REMOVED_PRODUCT_ITEMS, productsList);
		}
		return productsList;
	}

	@SuppressWarnings("unchecked")
	public static ProductInfoBean getWishListProductInfoBeanByKey(String infokey) {
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.WISHLIST_PRODUCT_ITEMS)) {
			productsList = ((HashMap<String, ProductInfoBean>) TestBaseProvider
					.getTestBase().getContext()
					.getProperty(ConstantUtils.WISHLIST_PRODUCT_ITEMS));
			for (String key : productsList.keySet()) {
				ProductInfoBean details = productsList.get(key);
				if (infokey.contains(details.getItemNumber())
						&& infokey.contains(details.getStudentName())) {
					return details;
				}
			}
		} else {
			return null;
		}
		return null;
	}

	public static void addWishListProductInfoBean(
			ProductInfoBean fillWishListProductInfoBean) {
		HashMap<String, ProductInfoBean> items = getWishListProductItems();
		items.put(
				fillWishListProductInfoBean.getItemNumber()
						+ fillWishListProductInfoBean.getStudentName(),
				fillWishListProductInfoBean);
		setWishListProductInfoBean(items);
	}

	public static void addWishListRemovedProductItem(ProductInfoBean productDetails) {
		HashMap<String, ProductInfoBean> items = getRemovedWishListProductItems();
		items.put(productDetails.getItemNumber() + productDetails.getStudentName(),
				productDetails);
		setSFORemoveProductItems(items);
	}

	public static void removeWishListProductItem(ProductInfoBean productDetails) {
		HashMap<String, ProductInfoBean> items = getWishListProductItems();
		addWishListRemovedProductItem(productDetails);
		items.remove(productDetails.getItemNumber() + productDetails.getStudentName());
		setWishListProductInfoBean(items);
	}

	public static void switchToNewWindow(String currentWindow) {
		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		PauseUtil.pause(2000);
		if (driver.getWindowHandles().size() > 1) {
			for (String window : driver.getWindowHandles()) {
				if (!window.equals(currentWindow)) {
					driver.switchTo().window(window);
					driver.manage().window().maximize();
				}
			}
		}
	}

	public static boolean verifyElementIsClickable(WebElement webe) {
		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(webe));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// Method to switch to old window and close current one
	public static boolean closeAndSwitchToOldWindow(String oldWindow) {
		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		if (driver.getWindowHandles().size() > 1) {
			for (String window : driver.getWindowHandles()) {
				if (!window.equals(oldWindow)) {
					driver.switchTo().window(window);
					driver.close();
				}
			}
			driver.switchTo().window(oldWindow);
			PauseUtil.pause(1000);
			return true;
		}
		return false;
	}
	public static void addTeacherMyListItems(
			List<ProductInfoBean> fillTeacherMyListItems) {
		HashMap<String, ProductInfoBean> items = getTeacherMyListItems();
		for (int i = 0; i < fillTeacherMyListItems.size(); i++) {
			ProductInfoBean productDetails = fillTeacherMyListItems.get(i);
			items.put(productDetails.getListType() + productDetails.getItemTitle(),
					productDetails);
		}
		setTeacherMyListItems(items);
	}

	public static void addParentMyListItems(List<ProductInfoBean> fillParentMyListItems) {
		HashMap<String, ProductInfoBean> items = getParentMyListItems();
		for (int i = 0; i < fillParentMyListItems.size(); i++) {
			ProductInfoBean productDetails = fillParentMyListItems.get(i);
			items.put(productDetails.getListType() + productDetails.getItemTitle(),
					productDetails);
		}
		setParentMyListItems(items);
	}

	public static void setParentMyListItems(
			HashMap<String, ProductInfoBean> productsList) {
		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.PARENT_MY_LIST, productsList);
	}

	public static void setTeacherMyListItems(
			HashMap<String, ProductInfoBean> productsList) {
		TestBaseProvider.getTestBase().getContext()
				.setProperty(ConstantUtils.TEACHER_MY_LIST, productsList);
	}

	@SuppressWarnings("unchecked")
	public static HashMap<String, ProductInfoBean> getTeacherMyListItems() {
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.TEACHER_MY_LIST)) {
			productsList =
					((HashMap<String, ProductInfoBean>) TestBaseProvider.getTestBase()
							.getContext().getProperty(ConstantUtils.TEACHER_MY_LIST));
		} else {
			productsList = new HashMap<String, ProductInfoBean>();
			TestBaseProvider.getTestBase().getContext()
					.setProperty(ConstantUtils.TEACHER_MY_LIST, productsList);
		}
		return productsList;
	}

	@SuppressWarnings("unchecked")
	public static HashMap<String, ProductInfoBean> getParentMyListItems() {
		HashMap<String, ProductInfoBean> productsList;
		if (TestBaseProvider.getTestBase().getContext()
				.containsKey(ConstantUtils.PARENT_MY_LIST)) {
			productsList =
					((HashMap<String, ProductInfoBean>) TestBaseProvider.getTestBase()
							.getContext().getProperty(ConstantUtils.PARENT_MY_LIST));
		} else {
			productsList = new HashMap<String, ProductInfoBean>();
			TestBaseProvider.getTestBase().getContext()
					.setProperty(ConstantUtils.PARENT_MY_LIST, productsList);
		}
		return productsList;
	}

	public static String removeSpecialCharacterFromString(String str) {
		return str.replaceAll("[^\\x00-\\x7F]", "");
	}

	/**
	 * this method returns products suggestion list length from business manager
	 * 
	 * @param searchText
	 *            : pass searching keyword
	 * @param count
	 *            : is default value for suggestion list
	 * @return total no of suggestion list as per search text
	 */
	public int getProductSuggestionListFromBM(String searchText, int count) {

		JSONObject obj = DWClient.getProducts(searchText, count);
		System.out.println(obj.length());
		return obj.length();
	}

	public static void mouseHoverJScript(WebElement HoverElement) {
		WebDriver driver = TestBaseProvider.getTestBase().getDriver();
		try {
			if (SCHUtils.isPresent(HoverElement)) {

				String mouseOverScript =
						"if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
				((JavascriptExecutor) driver).executeScript(mouseOverScript,
						HoverElement);

			} else {
				System.out.println("Element was not visible to hover " + "\n");

			}
		} catch (StaleElementReferenceException e) {
			System.out.println("Element with " + HoverElement
					+ "is not attached to the page document" + e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element " + HoverElement + " was not found in DOM"
					+ e.getStackTrace());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error occurred while hovering" + e.getStackTrace());
		}
	}

	public static boolean isAttribtuePresent(WebElement element, String attribute) {
		Boolean result = false;
		try {
			String value = element.getAttribute(attribute);
			if (value != null) {
				result = true;
			}
		} catch (Exception e) {
		}

		return result;
	}

public static void clickOnCenterOfElement(WebElement ele) {
		Actions action = new Actions(TestBaseProvider.getTestBase().getDriver());
		Dimension d = ele.getSize();
		Point p = ele.getLocation();
		System.out.println("#############X:>" + ((p.getX() + d.getWidth()) / 2));
		System.out.println("#############X1:>" + p.getX());
		System.out.println("#############Y:>" + p.getY());
		System.out.println("#############Y1:>" + ((p.getY() + d.getHeight()) / 2));
		action.moveToElement(ele, (p.getX() + d.getWidth()) / 2,
				(p.getY() + d.getHeight()) / 2).click().build().perform();
	}

public static double convertDollarsToDouble(WebElement element_dollar_amt, int substringVal){
	String dollar_amt_str = element_dollar_amt.getText();
	dollar_amt_str = dollar_amt_str.trim();
	dollar_amt_str = dollar_amt_str.substring(substringVal);
	
	return (Double.parseDouble(dollar_amt_str));
}

public static void changeValueUsingJavaScript(WebElement element, String attribute, String value) {
	PauseUtil.pause(3000);
	WebDriver driver = TestBaseProvider.getTestBase().getDriver();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", element, attribute, value);
	
	System.out.println("changed the attribute " + attribute + " to " + value);
	//PauseUtil.pause(1000);
	//SCHUtils.clickUsingJavaScript(driver.findElement(By.xpath("//*[@id='CreditCardForm']")));

}

}
