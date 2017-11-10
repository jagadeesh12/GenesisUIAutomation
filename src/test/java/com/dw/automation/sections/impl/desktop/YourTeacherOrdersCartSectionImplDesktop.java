package com.dw.automation.sections.impl.desktop;

import org.openqa.selenium.By;

import com.dw.automation.sections.impl.YourTeacherOrdersCartSection;
import com.scholastic.torque.common.LocatorUtils;

public class YourTeacherOrdersCartSectionImplDesktop extends YourTeacherOrdersCartSection {

	public YourTeacherOrdersCartSectionImplDesktop(By by) {
		super(by);
	}

	public YourTeacherOrdersCartSectionImplDesktop(String locator) {
		super(LocatorUtils.getBy(locator));
	}
}
