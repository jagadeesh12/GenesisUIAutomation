package com.dw.automation.sections.base;

import static com.scholastic.torque.common.TestBaseProvider.getTestBase;

import org.openqa.selenium.By;


import com.dw.automation.sections.IAddToWishListSection;
import com.dw.automation.sections.ICalendarSection;
import com.dw.automation.sections.ICouponSection;
import com.dw.automation.sections.ICreditCardAndBillingInfoSection;
import com.dw.automation.sections.IFooterSection;
import com.dw.automation.sections.IHeaderSection;
import com.dw.automation.sections.IParentCartSection;
import com.dw.automation.sections.IProductOrderSummarySection;
import com.dw.automation.sections.IProductOrderTableSection;
import com.dw.automation.sections.IStudentFlyerOrdersCartSection;
import com.dw.automation.sections.IStudentOnlineOrdersCartSection;
import com.dw.automation.sections.IYourTeacherOrdersCartSection;
import com.dw.automation.sections.impl.desktop.AddToWishListSectionImplDesktop;
import com.dw.automation.sections.impl.desktop.CalendarSectionImplDesktop;
import com.dw.automation.sections.impl.desktop.CouponSectionImplDesktop;
import com.dw.automation.sections.impl.desktop.CreditCardAndBillingInfoSectionImplDesktop;
import com.dw.automation.sections.impl.desktop.FooterSectionImplDesktop;
import com.dw.automation.sections.impl.desktop.HeaderSectionImplDesktop;
import com.dw.automation.sections.impl.desktop.ParentCartSectionImplDesktop;
import com.dw.automation.sections.impl.desktop.ProductOrderSummarySectionImplDesktop;
import com.dw.automation.sections.impl.desktop.ProductOrderTableSectionImplDesktop;
import com.dw.automation.sections.impl.desktop.StudentFlyerOrdersCartSectionImplDesktop;
import com.dw.automation.sections.impl.desktop.StudentOnlineOrdersCartSectionImplDesktop;
import com.dw.automation.sections.impl.desktop.YourTeacherOrdersCartSectionImplDesktop;

public abstract class SectionFactory {

	public static SectionFactory getFactory() {
		String platform = getTestBase().getContext().getString("platform", "");
		if (platform.equalsIgnoreCase("desktop")) {
			return new BrowserSectionFactory();
		}
		return null; 
	}
	public abstract IParentCartSection getIParentCartSection(By by);

	

	public abstract ICalendarSection getICalendarSection(By by);

	public abstract IHeaderSection getIHeaderSection(By by);

	public abstract IFooterSection getIFooterSection(By by);

	public abstract IAddToWishListSection getIAddToWishListSection(By by);

	public abstract IProductOrderSummarySection getIProductOrderSummarySection(By by);

	public abstract IProductOrderTableSection getIProductOrderTableSection(By by);
	public abstract ICreditCardAndBillingInfoSection getICreditCardAndBillingInfoSection(
			String loc);

	

	public abstract IStudentFlyerOrdersCartSection geStudentFlyerOrdersCartSection(By by);

	public abstract IStudentOnlineOrdersCartSection getStudentOnlineOrdersCartSection(
			By by);

	public abstract IYourTeacherOrdersCartSection getYourTeacherOrdersCartSection(By by);

	public abstract IStudentFlyerOrdersCartSection geStudentFlyerOrdersCartSection(
			String locator);

	public abstract IStudentOnlineOrdersCartSection getStudentOnlineOrdersCartSection(
			String locator);

	public abstract IYourTeacherOrdersCartSection getYourTeacherOrdersCartSection(
			String locator);

	public abstract ICouponSection getCouponSection(By by);

	
	

	

	public static class BrowserSectionFactory extends SectionFactory {
		

		

		@Override
		public ICalendarSection getICalendarSection(By by) {
			return new CalendarSectionImplDesktop(by);
		}

		@Override
		public IHeaderSection getIHeaderSection(By by) {
			return new HeaderSectionImplDesktop(by);
		}

		@Override
		public IFooterSection getIFooterSection(By by) {
			return new FooterSectionImplDesktop(by);
		}

		@Override
		public IAddToWishListSection getIAddToWishListSection(By by) {
			return new AddToWishListSectionImplDesktop(by);
		}

		@Override
		public IProductOrderSummarySection getIProductOrderSummarySection(By by) {
			return new ProductOrderSummarySectionImplDesktop(by);
		}

		@Override
		public IProductOrderTableSection getIProductOrderTableSection(By by) {
			return new ProductOrderTableSectionImplDesktop(by);
		}

		
		@Override
		public IStudentFlyerOrdersCartSection geStudentFlyerOrdersCartSection(By by) {
			return new StudentFlyerOrdersCartSectionImplDesktop(by);
		}

		@Override
		public IStudentOnlineOrdersCartSection getStudentOnlineOrdersCartSection(By by) {
			return new StudentOnlineOrdersCartSectionImplDesktop(by);
		}

		@Override
		public IYourTeacherOrdersCartSection getYourTeacherOrdersCartSection(By by) {
			return new YourTeacherOrdersCartSectionImplDesktop(by);
		}

		@Override
		public IStudentFlyerOrdersCartSection geStudentFlyerOrdersCartSection(
				String locator) {
			return new StudentFlyerOrdersCartSectionImplDesktop(locator);
		}

		@Override
		public IStudentOnlineOrdersCartSection getStudentOnlineOrdersCartSection(
				String locator) {
			return new StudentOnlineOrdersCartSectionImplDesktop(locator);
		}

		@Override
		public IYourTeacherOrdersCartSection getYourTeacherOrdersCartSection(
				String locator) {
			return new YourTeacherOrdersCartSectionImplDesktop(locator);
		}

		

		@Override
		public ICouponSection getCouponSection(By by) {
			return new CouponSectionImplDesktop(by);
		}

		

		@Override
		public IParentCartSection getIParentCartSection(By by) {
			return new ParentCartSectionImplDesktop(by);
		}

		@Override
		public ICreditCardAndBillingInfoSection getICreditCardAndBillingInfoSection(String loc) {
			return new CreditCardAndBillingInfoSectionImplDesktop(loc);
		}

		

	}

}
