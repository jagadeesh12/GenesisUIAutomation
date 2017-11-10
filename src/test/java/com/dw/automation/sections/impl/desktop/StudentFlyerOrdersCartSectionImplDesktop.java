package com.dw.automation.sections.impl.desktop;

import org.openqa.selenium.By;

import com.dw.automation.sections.impl.StudentFlyerOrdersCartSection;
import com.scholastic.torque.common.LocatorUtils;

public class StudentFlyerOrdersCartSectionImplDesktop
		extends
			StudentFlyerOrdersCartSection {

	public StudentFlyerOrdersCartSectionImplDesktop(By by) {
		super(by);
	}

	public StudentFlyerOrdersCartSectionImplDesktop(String locator) {
		super(LocatorUtils.getBy(locator));
	}
}
