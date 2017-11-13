package com.dw.automation.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.scholastic.torque.common.TestBaseProvider;

public class RUtils {
	static WebDriver driver=TestBaseProvider.getTestBase().getDriver();
	public static int TimeOut = 10;
	
    public static void Wait(int timeout) {
        long t1, t2;
        t1 = System.currentTimeMillis();

        do {
            t2 = System.currentTimeMillis();
        }
        while ((t2 - t1) < (timeout * 1000));

    }
	
    public static void waitForObjectToLoad(WebElement ele) throws InterruptedException {
        boolean isExist = false;
        int cntr = 0;
        while (!isExist) {
            if (ele.isDisplayed()) {
                isExist = true;
            } else {
                Wait(1);
                cntr++;
                if (cntr >= 240) {  // Maximum wait time is for 120 seconds i.e. 2 minutes
                    //fail
                    isExist = true;
                }
            }
        }
    }
    public static void moveToElement(WebElement ele, int timeout) throws Exception {
        
        waitForObjectToLoad(ele);
        Wait(timeout);
        if (ele.isDisplayed()) {
            Actions builder = new Actions(driver);
            builder.moveToElement(ele);
//            builder.sendKeys("");
            builder.build().perform();
            ele.sendKeys("");
            //Log.info("Clicking element ''" + locator + "=" + element + "'");
        } else {
            Exception error = new Exception();
            //Log.error("Current page does not contain element  '" + locator + "=" + element + "'");
            String Str = new String(error.getMessage());
            //Log.error("Error Message :" + Str.substring(1, 240));
            throw error;
        }

    }

}
