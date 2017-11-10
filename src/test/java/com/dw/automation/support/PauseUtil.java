package com.dw.automation.support;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.scholastic.torque.common.TestBaseProvider;

public class PauseUtil {

	public static void waitForAjaxToComplete(long... second) {
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

	public static void pause(long ms) {
		try {
			Thread.sleep(ms);
		} catch (Exception e) {

		}
	}

	/*public static WebElement getWhenVisible(By locator, int timeout) {

	WebElement element = null;

	WebDriverWait wait = new WebDriverWait(TestBaseProvider.getTestBase().getDriver(), timeout);

	element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	return element;

	}*/

	/*public static void clickWhenReady(By locator, int timeout) {

	WebElement element = null;

	WebDriverWait wait = new WebDriverWait(TestBaseProvider.getTestBase().getDriver(), timeout);

	element = wait.until(ExpectedConditions.elementToBeClickable(locator));

	element.click();

	 }*/


	public static WebElement getWhenVisible(WebElement element, int timeout) {
		//WebElement element = null;

		WebDriverWait wait = new WebDriverWait(TestBaseProvider.getTestBase().getDriver(), timeout);

		element = wait.until(ExpectedConditions.visibilityOf(element));

		return element;

	}
	
	

	public static void clickWhenReady(WebElement element, int timeout) {

		//WebElement element = null;

		WebDriverWait wait = new WebDriverWait(TestBaseProvider.getTestBase().getDriver(), timeout);

		element = wait.until(ExpectedConditions.elementToBeClickable(element));




		element.click();
	}
	
    public static boolean waitTillDisappear(WebElement element, int timeout) {
        boolean disAppeared = false;
        WebDriverWait wait = new WebDriverWait(TestBaseProvider.getTestBase().getDriver(), timeout);
        wait.until(ExpectedConditions.invisibilityOf(element));
        wait.ignoring(NoSuchElementException.class);
        return disAppeared;
       
       
}
}
