package com.dw.automation.pages;

import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.openqa.selenium.WebElement;

public interface IBooksAndResourcesPage {

	void verifyBookAndResourcePage();

	void verifyBubblesShopsBooksResources();

	void controlBubblesshopsBooksResources(String option);

	void controlarrowShopBooksResources(String arg1);

	void verifyShopsBooksResources();

	void waitForPageToLoad();

	void selectItemFromList(Configuration testData);

	int verifyBubbleCount();

	void verifySearchedItems(Configuration testData);

	void searchItemsNotDuplicated();

	List<WebElement> getLstItems();

	void emptySearchList();

	void selectItemForQuickViewFromSearchResult(Configuration testData);

	void verifyBooksAndResourcesPage();

	void clickGridViewSearchResult();

	void verfiyAvailableFormat();

	void verifyFlyerMonthInSearchResult();

	void verifyTogglingFilterSectionIsDisplayed();

	void verifyTogglingFilterSectionNotDisplayed();

}