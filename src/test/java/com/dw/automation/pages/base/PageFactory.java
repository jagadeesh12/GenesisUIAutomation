package com.dw.automation.pages.base;

import static com.scholastic.torque.common.TestBaseProvider.getTestBase;

import com.dw.automation.pages.AutoFreePromotion;
import com.dw.automation.pages.BasePage;
import com.dw.automation.pages.IBooksAndResourcesPage;
import com.dw.automation.pages.ICartPage;
import com.dw.automation.pages.ICheckoutPage;
import com.dw.automation.pages.ICheckoutPage_2;
import com.dw.automation.pages.ICouponsandRewards;
import com.dw.automation.pages.ILoginPage;
import com.dw.automation.pages.IProductDetailPage;
import com.dw.automation.pages.IProfilePage;
import com.dw.automation.pages.IReviewOrderPage;
import com.dw.automation.pages.IStudentFlyerOrdersPage;
import com.dw.automation.pages.IStudentOnlineOrdersPage;
import com.dw.automation.pages.ITeachersDeskPage;
import com.dw.automation.pages.ITeachersHomePage;
import com.dw.automation.pages.IYourTeacherOrderPage;
import com.dw.automation.pages.PCOD_ILoginPage;
import com.dw.automation.pages.PCOD_IShippingAndPaymentPage;
import com.dw.automation.pages.impl.MarketPlacePageImpl;
import com.dw.automation.pages.impl.PCOD_ShippingAndPaymentPage;
import com.dw.automation.pages.impl.PartnerUserPageImpl;
import com.dw.automation.pages.impl.ReLoginPage;
import com.dw.automation.pages.impl.desktop.BookaAndResourcesPageImplDesktop;
import com.dw.automation.pages.impl.desktop.CartPageImplDesktop;
import com.dw.automation.pages.impl.desktop.CheckoutPageImplDesktop;
import com.dw.automation.pages.impl.desktop.CheckoutPage_2ImplDesktop;
import com.dw.automation.pages.impl.desktop.CouponsandRewardsPageImplDesktop;
import com.dw.automation.pages.impl.desktop.LoginPageImplDesktop;
import com.dw.automation.pages.impl.desktop.PCOD_LoginPageImplDesktop;
import com.dw.automation.pages.impl.desktop.ProductDetailPageImplDesktop;
import com.dw.automation.pages.impl.desktop.ProfilePageImplDesktop;
import com.dw.automation.pages.impl.desktop.RLoginPageImpl;
import com.dw.automation.pages.impl.desktop.ReviewOrdersPageImplDesktop;
import com.dw.automation.pages.impl.desktop.StudentFlyerOrdersImplDesktop;
import com.dw.automation.pages.impl.desktop.StudentOnlineOrdersPageImplDesktop;
import com.dw.automation.pages.impl.desktop.TeachersDeskPageImplDesktop;
import com.dw.automation.pages.impl.desktop.TeachersHomePageImplDesktop;
import com.dw.automation.pages.impl.desktop.YourTeacherOrderPageImplDesktop;
import com.dw.automation.sections.impl.desktop.BasePageImplDesktop;

public abstract class PageFactory {

	public static PageFactory getFactory() {
		String platform = getTestBase().getContext().getString("platform", "");
		if (platform.equalsIgnoreCase("desktop")) {
			return new BrowserPageFactory();
		}
		return null; 
	}

	public abstract MarketPlacePageImpl getMarketPlacePage();
	
	public abstract PartnerUserPageImpl getPartnerUserPage() ;

	public abstract ReLoginPage getRLoginPage() ;
	
	public abstract ILoginPage getILoginPage();
	
	public abstract PCOD_ILoginPage getPCOD_ILoginPage();

    public abstract PCOD_IShippingAndPaymentPage getPCOD_IShipPage();
	
	public abstract ICheckoutPage_2 getICheckoutPage_2();
	
	public abstract BasePage getBasePage();
	
	public abstract AutoFreePromotion getAutoFreePromotionPage();

	

	public abstract ITeachersHomePage getITeachersHomePage();

	

	public abstract ITeachersDeskPage getITeachersDeskPage();

	public abstract IProductDetailPage getIProductDetailPage();

	public abstract IStudentFlyerOrdersPage getIStudentFlyerOrdersPage();

	public abstract IStudentOnlineOrdersPage getIStudentOnlineOrdersPage();

	public abstract IYourTeacherOrderPage getIYourTeacherOrderPage();

	public abstract ICheckoutPage getICheckoutPage();
	
	

	public abstract ICartPage getICartPage();
	
	public abstract ICouponsandRewards getICouponandRewardsPage();

	public abstract IReviewOrderPage getIReviewOrderPage();

	

	public abstract IProfilePage getIProfilePage();

	public abstract IBooksAndResourcesPage getIBooksAndResourcesPage();
	

	

	

	public static class BrowserPageFactory extends PageFactory {
		
		@Override
		public MarketPlacePageImpl getMarketPlacePage() {
			return new MarketPlacePageImpl();
		}
		
		@Override
		public PartnerUserPageImpl getPartnerUserPage() {
			return new PartnerUserPageImpl();
		}
		
		@Override
		public ReLoginPage getRLoginPage() {
			return new RLoginPageImpl();
		}

		@Override
		public ILoginPage getILoginPage() {
			return new LoginPageImplDesktop();
		}

		@Override
		public PCOD_ILoginPage getPCOD_ILoginPage() {
			return new PCOD_LoginPageImplDesktop();
		}


        @Override
        public PCOD_IShippingAndPaymentPage getPCOD_IShipPage(){
            return new PCOD_ShippingAndPaymentPage();
        }

		@Override
		public ITeachersHomePage getITeachersHomePage() {
			return new TeachersHomePageImplDesktop();
		}

		

		@Override
		public ITeachersDeskPage getITeachersDeskPage() {
			return new TeachersDeskPageImplDesktop();
		}

		@Override
		public IProductDetailPage getIProductDetailPage() {
			return new ProductDetailPageImplDesktop();
		}

		@Override
		public IStudentFlyerOrdersPage getIStudentFlyerOrdersPage() {
			return new StudentFlyerOrdersImplDesktop();
		}

		@Override
		public IStudentOnlineOrdersPage getIStudentOnlineOrdersPage() {
			return new StudentOnlineOrdersPageImplDesktop();
		}

		@Override
		public IYourTeacherOrderPage getIYourTeacherOrderPage() {
			return new YourTeacherOrderPageImplDesktop();
		}

		@Override
		public ICheckoutPage getICheckoutPage() {
			return new CheckoutPageImplDesktop();
		}
		
		
		/*@Override
		public IConfirmAndSubmitOrder getIConfirmAndSubmitOrder() {
			
			return new ConfirmAndSubmitOrderImplDesktop();
		}*/
		

		@Override
		public IReviewOrderPage getIReviewOrderPage() {
			return new ReviewOrdersPageImplDesktop();
		}

		@Override
		public ICartPage getICartPage() {
			return new CartPageImplDesktop();
		}

		

		@Override
		public IProfilePage getIProfilePage() {
			return new ProfilePageImplDesktop();
		}

		@Override
		public IBooksAndResourcesPage getIBooksAndResourcesPage() {
			// TODO Auto-generated method stub
			return new BookaAndResourcesPageImplDesktop();
		}

		

		@Override
		public BasePage getBasePage() {
			return new BasePageImplDesktop();
		}


		@Override
		public AutoFreePromotion getAutoFreePromotionPage() {
			// TODO Auto-generated method stub
			return null;
		}

		

		@Override
		public ICouponsandRewards getICouponandRewardsPage() {
			// TODO Auto-generated method stub
			return new CouponsandRewardsPageImplDesktop();
		}



		@Override
		public ICheckoutPage_2 getICheckoutPage_2() {
			return new CheckoutPage_2ImplDesktop();
		}






	}




}
