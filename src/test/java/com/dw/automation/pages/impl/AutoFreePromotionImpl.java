package com.dw.automation.pages.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.dw.automation.pages.AutoFreePromotion;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestPage;

public class AutoFreePromotionImpl extends BaseTestPage<TestPage> implements AutoFreePromotion {
	
	WebDriver driver;
	
	@FindBy(locator = "dw.payment.combo.id")
	private String paymentComboboxId;
	
	public String paymentComboboxId() {
		return paymentComboboxId;
	}
	@Override
	protected void openPage() {
		// TODO Auto-generated method stub		
	}

	@Override
	public void user_Clicks_on_Payment_Method() {
		WebElement element = driver.findElement(By.id(paymentComboboxId));
		Select select = new Select (element);
		select.selectByVisibleText("Cheques");
	}
}
