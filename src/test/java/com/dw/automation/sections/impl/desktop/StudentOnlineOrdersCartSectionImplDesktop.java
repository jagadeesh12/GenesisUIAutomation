package com.dw.automation.sections.impl.desktop;

import org.openqa.selenium.By;

import com.dw.automation.sections.impl.StudentOnlineOrdersCartSection;
import com.scholastic.torque.common.LocatorUtils;

public class StudentOnlineOrdersCartSectionImplDesktop
		extends
			StudentOnlineOrdersCartSection {

	public StudentOnlineOrdersCartSectionImplDesktop(By by) {
		super(by);
	}

	public StudentOnlineOrdersCartSectionImplDesktop(String locator) {
		super(LocatorUtils.getBy(locator));
	}
}
