package com.dw.automation.sections.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dw.automation.sections.ICalendarSection;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.Section;

public class CalendarSection extends Section implements ICalendarSection {

	@FindBy(locator = "dw.datepicker.lbl.monthtitle")
	private WebElement lblMonthTitle;

	@FindBy(locator = "dw.datepicker.lnk.previous")
	private WebElement lnkPrevious;

	@FindBy(locator = "dw.datepicker.lnk.next")
	private WebElement lnkNext;

	private WebElement lnkSelectDay;

	public WebElement getLblMonthTitle() {
		return lblMonthTitle;
	}

	public WebElement getLnkPrevious() {
		return lnkPrevious;
	}

	public WebElement getLnkNext() {
		return lnkNext;
	}

	public WebElement getLnkSelectDay(String day) {
		lnkSelectDay = SCHUtils.findElement("dw.datepicker.lnk.selectday", day);
		return lnkSelectDay;
	}

	public CalendarSection(By by) {
		super(by);
	}

	@Override
	public void selectDateOnCalender(String date, String month, String year) {
		String monthYear = month + " " + year;

		while (!getLblMonthTitle().getText().equalsIgnoreCase(monthYear)) {
			SCHUtils.clickUsingJavaScript(getLnkNext());
		}
		if (getLblMonthTitle().getText().equalsIgnoreCase(monthYear)) {
			PauseUtil.waitForAjaxToComplete(1000);
			SCHUtils.clickUsingJavaScript(getLnkSelectDay(date));
			PauseUtil.waitForAjaxToComplete(2000);
		}

	}

	@Override
	public void selectDayOnCalender() {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		// getTime() returns the current date in default time zone
		Date date = calendar.getTime();
		int day = calendar.get(Calendar.DATE);
		SCHUtils.clickUsingJavaScript(getLnkSelectDay(Integer.toString(day)));
		PauseUtil.pause(2000);

	}

}
