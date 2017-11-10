package com.dw.automation.pages.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.dw.automation.pages.IBooksAndResourcesPage;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.WaitUtils;

public class BooksAndResourcesPage extends BaseTestPage<StudentOnlineOrdersPage>
		implements
			IBooksAndResourcesPage {

	@FindBy(locator = "dw.booksandresources.img.booksandresources")
	private WebElement imgBooksAndResources;

	@FindBy(locator = "dw.teachers.shopbooksandresources.lst.controlbubbles")
	private List<WebElement> lstControlBubblesShopBooksResources;

	@FindBy(locator = "dw.teachers.shopbooksandresources.lst.controlbubbles.items")
	private List<WebElement> lstControlBubbleItems;

	@FindBy(locator = "dw.teachers.shopbooksandresources.lst.controlarrows.next")
	private WebElement controlArrowNext;

	@FindBy(locator = "dw.teachers.shopbooksandresources.lst.controlarrows.previos")
	private WebElement controlArrowPrevious;

	@FindBy(locator = "dw.teachers.shopbooksandresources.validate.label")
	private WebElement validateShopBooksResources;

	@FindBy(locator = "dw.teachers.shopbooksandresources.lst.items")
	private List<WebElement> lstItems;

	@FindBy(locator = "dw.teachers.shopbooksandresources.lst.price")
	private List<WebElement> lstPrices;

	// @FindBy(locator =
	// "dw.teachers.shopbooksandresources.searchlist.specific.itemname")
	// private WebElement itemNameSearchList;

	@FindBy(locator = "dw.teachers.shopbooksandresources.header")
	private WebElement headerBooksAndResouces;

	public WebElement getHeaderBooksAndResouces() {
		return headerBooksAndResouces;
	}
	@FindBy(locator = "dw.searchresultpage.btn.gridview")
	private WebElement searchResultGridView;

	@FindBy(locator = "dw.searchresultpage.list.quickviewbtnlist")
	private List<WebElement> listQuickViewbtn;

	@FindBy(locator = "dw.searchresultpage.filer.toggle.button")
	private WebElement toggleButton;

	public WebElement getToggleButton() {
		return toggleButton;
	}
	public WebElement getFilterText(String filterText) {
		return SCHUtils.findElement("dw.searchresultpage.filter.search.by.toggle",
				filterText);
	}

	public List<WebElement> getListQuickViewbtn() {
		return listQuickViewbtn;
	}

	public WebElement getSearchResultGridView() {
		return searchResultGridView;
	}
	public WebElement getImageTile(String itemName) {
		return SCHUtils.findElement(
				"dw.teachers.shopbooksandresources.searchlist.specific.itemtile",
				itemName);
	}

	public WebElement getBtnQuickView(String itemName) {
		return SCHUtils.findElement(
				"dw.teachers.shopbooksandresources.searchlist.specific.quickview",
				itemName);
	}

	public List<WebElement> getLstPrices() {
		return lstPrices;
	}

	@Override
	public List<WebElement> getLstItems() {
		return lstItems;
	}

	public WebElement getValidateShopBooksResources() {
		return validateShopBooksResources;
	}

	public WebElement getControlArrowNext() {
		return controlArrowNext;
	}

	public WebElement getControlArrowPrevious() {
		return controlArrowPrevious;
	}

	public List<WebElement> getLstControlBubbleItems() {
		return lstControlBubbleItems;
	}

	public List<WebElement> getLstControlBubblesShopBooksResources() {
		return lstControlBubblesShopBooksResources;
	}

	public WebElement getItemNameSearchList(String item) {
		return SCHUtils.findElement(
				"dw.teachers.shopbooksandresources.searchlist.specific.itemname", item);
		// return itemNameSearchList;
	}

	@Override
	protected void openPage() {
		// TODO Auto-generated method stub

	}

	public WebElement getImgBooksAndResources() {
		return imgBooksAndResources;
	}

	@Override
	public void verifyBookAndResourcePage() {
		AssertUtils.assertDisplayed(getImgBooksAndResources());
	}

	@Override
	public void verifyShopsBooksResources() {

		AssertUtils.assertDisplayed(getValidateShopBooksResources());
	}

	@Override
	public void verifyBubblesShopsBooksResources() {

		Assert.assertFalse(getLstControlBubblesShopBooksResources().isEmpty());
	}

	@Override
	public void controlBubblesshopsBooksResources(String option) {
		PauseUtil.waitForAjaxToComplete(3000);
		Assert.assertTrue(getLstControlBubblesShopBooksResources().size() > 1,
				"There are not sufficient items to enable multiple Bubbles");
		List<String> previousItems = new ArrayList<String>();
		List<String> nextItems = new ArrayList<String>();
		if (option.equals("next")) {
			for (WebElement previous : getLstControlBubbleItems()) {
				previousItems.add(previous.getAttribute("src"));
			}
			getLstControlBubblesShopBooksResources().get(1).click();
			PauseUtil.waitForAjaxToComplete(3000);
			for (WebElement next : getLstControlBubbleItems()) {
				nextItems.add(next.getAttribute("src"));
			}
			Assert.assertFalse(previousItems.equals(nextItems));
			// for (int size = 2; size <=
			// getLstControlBubblesShopBooksResources().size(); size++) {
			// for (WebElement previous : getLstControlBubbleItems()) {
			// previousItems.add(previous.getAttribute("src"));
			// }
			// getLstControlBubblesShopBooksResources().get(size).click();
			// PauseUtil.pause(3000);
			// for (WebElement next : getLstControlBubbleItems()) {
			// nextItems.add(next.getAttribute("src"));
			// }
			// Assert.assertFalse(previousItems.equals(nextItems));
			// }
		}
		if (option.equals("previous")) {
			for (WebElement previous : getLstControlBubbleItems()) {
				previousItems.add(previous.getAttribute("src"));
			}
			getLstControlBubblesShopBooksResources().get(0).click();
			PauseUtil.waitForAjaxToComplete(3000);
			for (WebElement next : getLstControlBubbleItems()) {
				nextItems.add(next.getAttribute("src"));
			}
			Assert.assertFalse(previousItems.equals(nextItems));
			// for (int size = getLstControlBubblesShopBooksResources().size();
			// size > 1; size--) {
			// for (WebElement previous : getLstControlBubbleItems()) {
			// previousItems.add(previous.getAttribute("src"));
			// }
			// getLstControlBubblesShopBooksResources().get(size - 2).click();
			// for (WebElement next : getLstControlBubbleItems()) {
			// nextItems.add(next.getAttribute("src"));
			// }
			// Assert.assertFalse(nextItems.equals(previousItems));
			// }
		}
	}

	@Override
	public void waitForPageToLoad() {
		WaitUtils.waitForDisplayed(getImgBooksAndResources());
	}

	@Override
	public void verifySearchedItems(Configuration data) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(5000);
		List<WebElement> searched_items = getLstItems();
		if (searched_items.size() != 0) {
			for (int i = 0; i < searched_items.size(); i++) {
				if (searched_items.get(i).getText().trim()
						.contains(data.getString("item"))) {

				} else {
					// need to implement(query) : related item should be present
				}
			}
			// for finding duplicates in single list
			for (int i = 0; i < searched_items.size(); i++) {
				for (int j = 0; j < searched_items.size(); j++) {
					if (i != j) {
						if (searched_items.get(i).getText().trim().equalsIgnoreCase(
								searched_items.get(j).getText().trim())) {
							if (SCHUtils.isPresent(getLstPrices().get(i))
									&& SCHUtils.isPresent(getLstPrices().get(j))) {
								// if duplicate then price should be different
								Assert.assertFalse(
										getLstPrices().get(i).getText().equalsIgnoreCase(
												getLstPrices().get(j).getText()));
							}
						}
					}
				}
			}
		}
	}

	@Override
	public void controlarrowShopBooksResources(String option) {
		PauseUtil.waitForAjaxToComplete(3000);
		Assert.assertTrue(getLstControlBubblesShopBooksResources().size() > 1,
				"There are not sufficient items to enable multiple Bubbles");
		List<String> previousItems = new ArrayList<String>();
		List<String> nextItems = new ArrayList<String>();
		if (option.equals("next")) {
			for (WebElement previous : getLstControlBubbleItems()) {
				previousItems.add(previous.getAttribute("src"));
			}
			System.out.println("size :" + getLstControlBubbleItems().size());
			SCHUtils.mouseHoverOnElement(getLstControlBubbleItems()
					.get(getLstControlBubbleItems().size() - 1));
			// Actions hover = new
			// Actions(TestBaseProvider.getTestBase().getDriver());
			// System.out.println("size :" + getLstControlBubbleItems().size());
			// hover.moveToElement(
			// getLstControlBubbleItems().get(getLstControlBubbleItems().size()
			// - 1))
			// .perform();
			SCHUtils.clickUsingJavaScript(getControlArrowNext());
			// getControlArrowNext().click();
			PauseUtil.waitForAjaxToComplete(3000);
			for (WebElement next : getLstControlBubbleItems()) {
				nextItems.add(next.getAttribute("src"));
			}
			Assert.assertFalse(nextItems.equals(previousItems));
		}
		if (option.equals("previous")) {
			for (WebElement previous : getLstControlBubbleItems()) {
				previousItems.add(previous.getAttribute("src"));
			}
			System.out.println("size :" + getLstControlBubbleItems().size());
			SCHUtils.mouseHoverOnElement(getLstControlBubbleItems()
					.get(getLstControlBubbleItems().size() - 1));
			// getControlArrowPrevious().click();
			SCHUtils.clickUsingJavaScript(getControlArrowPrevious());
			PauseUtil.waitForAjaxToComplete(3000);
			for (WebElement next : getLstControlBubbleItems()) {
				nextItems.add(next.getAttribute("src"));
			}
			Assert.assertFalse(nextItems.equals(previousItems));
		}
	}

	@Override
	public void selectItemFromList(Configuration testData) {
		PauseUtil.waitForAjaxToComplete(5000);
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(3000);
		getLstItems().get(Integer.parseInt(testData.getString("itemindex"))).click();
	}
	@Override
	public int verifyBubbleCount() {
		return getLstControlBubblesShopBooksResources().size();
	}

	@Override
	public void searchItemsNotDuplicated() {
		PauseUtil.waitForAjaxToComplete(5000);
		List<WebElement> searched_items = getLstItems();
		if (searched_items.size() != 0) {
			// for finding duplicates in single list
			for (int i = 0; i < searched_items.size(); i++) {
				for (int j = 0; j < searched_items.size(); j++) {
					if (i != j) {
						if (searched_items.get(i).getText().trim().equalsIgnoreCase(
								searched_items.get(j).getText().trim())) {
							if (SCHUtils.isPresent(getLstPrices().get(i))
									&& SCHUtils.isPresent(getLstPrices().get(j))) {
								// if duplicate then price should be different
								Assert.assertFalse(
										getLstPrices().get(i).getText().equalsIgnoreCase(
												getLstPrices().get(j).getText()));
							}
						}
					}
				}
			}
		}
	}

	@Override
	public void emptySearchList() {
		SCHUtils.waitForLoaderToDismiss();
		List<WebElement> searched_items = getLstItems();
		Assert.assertTrue(searched_items.size() == 0);
	}

	@Override
	public void selectItemForQuickViewFromSearchResult(Configuration data) {
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.pause(5000);
		SCHUtils.mouseHoverOnElement(
				getImageTile(getTestBase().getTestData().getString("item")));
		SCHUtils.clickUsingJavaScript(
				getBtnQuickView(getTestBase().getTestData().getString("item")));
		// getBtnQuickView(getTestBase().getTestData().getString("item")).click();
		PauseUtil.pause(5000);
	}

	@Override
	public void verifyBooksAndResourcesPage() {
		AssertUtils.assertDisplayed(getHeaderBooksAndResouces());
	}

	@Override
	public void clickGridViewSearchResult() {
		PauseUtil.pause(5000);
		SCHUtils.clickUsingJavaScript(getSearchResultGridView());
		// getSearchResultGridView().click();
	}

	@Override
	public void verfiyAvailableFormat() {
		PauseUtil.pause(5000);
		AssertUtils.assertDisplayed(
				getItemNameSearchList(getTestBase().getTestData().getString("item")));
		PauseUtil.pause(2000);
		AssertUtils.assertDisplayed(getLstPrices().get(0));
		AssertUtils.assertDisplayed(getLstItems().get(0));

	}

	@Override
	public void verifyFlyerMonthInSearchResult() {
		PauseUtil.pause(5000);
		try {
			if (SCHUtils.isPresent(getListQuickViewbtn().get(0))) {
				getListQuickViewbtn().get(0).click();
				PauseUtil.pause(5000);
				AssertUtils.assertDisplayed(getItemNameSearchList(
						getTestBase().getTestData().getString("item")));
				AssertUtils.assertDisplayed(getLstPrices().get(0));
				AssertUtils.assertDisplayed(getLstItems().get(0));
			}
		} catch (Exception e) {
		}
	}
	@Override
	public void verifyTogglingFilterSectionIsDisplayed() {
		SCHUtils.waitForLoaderToDismiss();
		if (!getFilterText("Language").isDisplayed())
			SCHUtils.clickUsingJavaScript(getToggleButton());
		AssertUtils.assertDisplayed(getFilterText("Language"));
		AssertUtils.assertDisplayed(getFilterText("Price"));
		AssertUtils.assertDisplayed(getFilterText("Book Type"));
		AssertUtils.assertDisplayed(getFilterText("Reading Level -  GRL"));
		AssertUtils.assertDisplayed(getFilterText("Genre"));
		AssertUtils.assertDisplayed(getFilterText("Reading Level - AR"));
		AssertUtils.assertDisplayed(getFilterText("Reading Level - DRA"));
		AssertUtils.assertDisplayed(getFilterText("Skills"));
	}
	@Override
	public void verifyTogglingFilterSectionNotDisplayed() {
		SCHUtils.waitForLoaderToDismiss();
		if (getFilterText("Language").isDisplayed())
			SCHUtils.clickUsingJavaScript(getToggleButton());
		// getToggleButton().click();

		AssertUtils.assertNotDisplayed(getFilterText("Language"));
		AssertUtils.assertNotDisplayed(getFilterText("Price"));
		AssertUtils.assertNotDisplayed(getFilterText("Book Type"));
		AssertUtils.assertNotDisplayed(getFilterText("Reading Level -  GRL"));
		AssertUtils.assertNotDisplayed(getFilterText("Genre"));
		AssertUtils.assertNotDisplayed(getFilterText("Reading Level - AR"));
		AssertUtils.assertNotDisplayed(getFilterText("Reading Level - DRA"));
		AssertUtils.assertNotDisplayed(getFilterText("Skills"));

	}

}
