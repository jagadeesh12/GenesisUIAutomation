package com.dw.automation.pages.impl.desktop;

import org.testng.Assert;

import com.dw.automation.pages.impl.TeachersDeskPage;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.AssertUtils;

public class TeachersDeskPageImplDesktop extends TeachersDeskPage {

	@Override
	public void verifyPreviewFunctionalityOnlineNoteToParent() {
		AssertUtils.assertDisplayed(getLnkOnlineNotePreview());
		String oldhandle = getDriver().getWindowHandle();
		getLnkOnlineNotePreview().click();
		PauseUtil.pause(5000);
		for (String handle : getDriver().getWindowHandles()) {
			if (!handle.equals(oldhandle)) {
				getDriver().switchTo().window(handle);
				break;
			}
		}
		getDriver().manage().window().maximize();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getDriver().switchTo().window(oldhandle);
		Assert.assertTrue(SCHUtils.isPresent(getLnkOnlineNotePreview()));
	}

}
