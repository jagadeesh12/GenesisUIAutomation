package com.dw.automation.steps.home;

import static com.dw.automation.pages.base.PageFactory.getFactory;
import static com.scholastic.torque.common.TestBaseProvider.getTestBase;

import java.util.List;
import java.util.Map;

import com.dw.automation.pages.impl.PCOD_HomePage;
import org.testng.Assert;

import com.dw.automation.pages.ICheckoutPage;
import com.dw.automation.pages.ICheckoutPage_2;
import com.dw.automation.pages.ILoginPage;
import com.dw.automation.pages.IStudentFlyerOrdersPage;
import com.dw.automation.pages.ITeachersHomePage;
import com.dw.automation.pages.impl.ProductDetailPage;
import com.dw.automation.pages.impl.StudentFlyerOrdersPage;
import com.dw.automation.sections.IHeaderSection;
import com.dw.automation.sections.base.SectionFactory;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.LocatorUtils;
import com.scholastic.torque.common.TestBaseProvider;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TeacherHomePageSteps {
	
	ProductDetailPage pdppage =  new ProductDetailPage();

	@Given("^user should see teacher home page$")
	public void user_should_see_teacher_home_page() {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage
				.verifyUserName(getTestBase().getTestData().getString("username"));
	}

	/*@Given("^teacher selects enter classroom order from home page$")
	public void teacher_selects_enter_classroom_order_from_home_page() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(1000);
		//teachersHomePage.verifyPage();
		teachersHomePage.selectOptionFromTeacherHomePage(ConstantUtils.ENTERORDER);
		
<<<<<<< a1b16f5cbc79fdf7a0d566d3792121d6df421def
=======

	}
	
	@Given("^Teacher adds teacher club items to cart with minimum amount$")
	public void teacher_adds_teacher_club_items_to_cart_with_minimum_amount() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		
		teachersHomePage.clickOnTeacherCatalgoues();
		teachersHomePage.clickOnClassroomRewardCataloguesFlyer();
		PauseUtil.pause(2000);
		teachersHomePage.waitForPageLoad();
		PauseUtil.pause(2000);
		
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillStudentFlyerOrder_Eligible_Promotions(
				TestBaseProvider.getTestBase().getTestData().getDouble("titemprice"),
				TestBaseProvider.getTestBase().getTestData().getString("tstudentname"),
				TestBaseProvider.getTestBase().getTestData().getString("titemQty"));
>>>>>>> Updated with latest code

	}*/
	
	@Given("^Teacher adds teacher club items to cart with minimum amount$")
	public void teacher_adds_teacher_club_items_to_cart_with_minimum_amount() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
		iStudentFlyerOrdersPage.fillTeacherCatalogueFlyerOrder(
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice"),
				TestBaseProvider.getTestBase().getTestData().getDouble("itemprice_limit"),
				TestBaseProvider.getTestBase().getTestData().getString("studentname"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));

	}
	
	
	
	@Given("^teacher adds teacher club items to cart with minimum amount for bonus flat$")
	public void teacher_adds_teacher_club_items_to_cart_with_minimum_amount_for_bonus_flat() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
	 iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));

	}
	
	
	@Given("^teacher adds teacher club items to cart with minimum amount for bonus percentage$")
	public void teacher_adds_teacher_club_items_to_cart_with_minimum_amount_for_bonus_percentage() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		//iStudentFlyerOrdersPage.verifyDefaultValueOfStudentFlyerOrder();
	 iStudentFlyerOrdersPage.placeItems_GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"),
				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));

	}
	
	
	@And("^teacher selects “enter classroom order” from home page$")
    public void teacher_selects_enter_classroom_order_from_home_page() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(1000);
		//teachersHomePage.verifyPage();
		
		teachersHomePage.selectOptionFromTeacherHomePage(ConstantUtils.ENTERORDER);
    }
	
	
	
	@When("^teacher clicks on Teacher's desk$")
    public void teacher_clicks_on_teachers_desk() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(1000);
		//teachersHomePage.verifyPage();
		
		
		ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		
		teachersHomePage.selectOptionFromTeacherHomePage(ConstantUtils.TEACHER_DESK);
		checkoutPage.user_select_MyAccount_in_HomePage();
		teachersHomePage.ReadTeacherDetailsFromMyAccountPage();
		teachersHomePage.SelectOptionFromTeacherHomePage();
		
		
		
    }
	
	@And("^teacher reads details and navigate back to home page$")
    public void teacher_reads_details_and_navigate_back_to_home_page() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(1000);
		teachersHomePage.ReadTeacherDetailsFromMyAccountPage();
    }
	
	
	
	@And("^teacher navigate to My Account page and make sure expired card is present$")
    public void teacher_navigate_to_my_account_page_and_make_sure_expired_card_is_present() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(1000);
		
		ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		checkoutPage.user_select_MyAccount_in_HomePage();
		teachersHomePage.teacher_check_expired_creditcard();
    }
	
	
	@And("^teacher navigates to home page$")
    public void teacher_navigates_to_home_page() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(1000);
		
		teachersHomePage.teacher_navigates_to_homepage_from_myaccountpage();
    }
	
	
	
	@Then("^correct teacher name, school and grade displays$")
    public void correct_teacher_name_school_and_grade_displays() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		
		teachersHomePage.ReadTeacherDetailsFromTeacherDesk();
    }
	
	@Then("^hold status message \"([^\"]*)\" displays$")
    public void hold_status_message_something_displays(String strArg1) throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.verify_hold_status_msg_T_displayed_TeacherDesk();
    }
	
	@Then("^hold status message \"([^\"]*)\" is displays$")
    public void hold_status_message_something_is_displays(String strArg2) throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.verify_hold_status_msg_P_displayed_TeacherDesk();
    }
	
	//SIVA CODE TO HANDLE ENTER CLASS ROOM ORDER. IF BELOW ONE DOES NOT WORK, WE NEED TO USE THIS
	/*@When("^teacher selects \\[enter classroom order\\] from home page$")
    public void teacher_selects_enter1_classroom_order_from_home_page() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.clickOn_Enter_ClassRoom_Order();
		homePage.closeButton_in_LoginPage();
    }*/
	
	
	@When("^teacher selects \\[enter classroom order\\] from home page$")
    public void teacher_selects_enter1_classroom_order_from_home_page() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		StudentFlyerOrdersPage stdpage = new StudentFlyerOrdersPage();
		PauseUtil.pause(1000);
		//teachersHomePage.verifyPage();
		PauseUtil.waitForAjaxToComplete(2000);
		teachersHomePage.selectOptionFromTeacherHomePage(ConstantUtils.ENTERORDER);
		for(int i=0;i<=3;i++){
		if(stdpage.sizegrade_Seesaw().size()==0){
		teachersHomePage.selectOptionFromTeacherHomePage(ConstantUtils.ENTERORDER);	
	    Thread.sleep(4000);
		}
			
		}
		
    }
	
	
	@When("^teacher clicks on “ENTER ORDER” option present in main menu on top of the page$")
    public void teacher_clicks_on_enter_order_option_present_in_main_menu_on_top_of_the_page() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		StudentFlyerOrdersPage stdpage = new StudentFlyerOrdersPage();
		PauseUtil.pause(1000);
		//teachersHomePage.verifyPage();
		PauseUtil.waitForAjaxToComplete(2000);
		teachersHomePage.selectOptionFromTeacherHomePage1(ConstantUtils.ENTERORDER);
		for(int i=0;i<=3;i++){
		if(stdpage.sizegrade_Seesaw().size()==0){
		teachersHomePage.selectOptionFromTeacherHomePage1(ConstantUtils.ENTERORDER);	
	    Thread.sleep(4000);
		}
			
		}
    }
	
	
	 @When("^teacher clicks on “BOOKS & RESOURCES” option present in main menu on top of the page$")
	    public void teacher_clicks_on_books_resources_option_present_in_main_menu_on_top_of_the_page() throws Throwable {
		 ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
			PauseUtil.pause(1000);
			PauseUtil.waitForAjaxToComplete(2000);
			SCHUtils.waitForElementToBeClickable(teachersHomePage.getmainmenulnkbooksresources(), 10);
			SCHUtils.clickUsingJavaScript(teachersHomePage.getmainmenulnkbooksresources());
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(2000);
	    }
	 
	 
	 @When("^teacher clicks on “TEACHER'S DESK” option present in main menu on top of the page$")
	    public void teacher_clicks_on_teachers_desk_option_present_in_main_menu_on_top_of_the_page() throws Throwable {
		 ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
			PauseUtil.pause(1000);
			PauseUtil.waitForAjaxToComplete(2000);
			SCHUtils.waitForElementToBeClickable(teachersHomePage.getsizemainmenulnkteacherdesk(), 10);
			SCHUtils.clickUsingJavaScript(teachersHomePage.getsizemainmenulnkteacherdesk());
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(2000);
	    }
	 
	 
	 @When("^teacher clicks on “ALL FLYERS” option present in main menu on top of the page$")
	    public void teacher_clicks_on_all_flyers_option_present_in_main_menu_on_top_of_the_page() throws Throwable {
		 ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
			PauseUtil.pause(1000);
			PauseUtil.waitForAjaxToComplete(2000);
			SCHUtils.waitForElementToBeClickable(teachersHomePage.getmainmenulnkallflyers(), 10);
			SCHUtils.clickUsingJavaScript(teachersHomePage.getmainmenulnkallflyers());
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(2000);
	    }
	 
	 @And("^teacher selects “ALL FLYERS” option present in main menu on top of the page$")
	    public void teacher_selects_all_flyers_option_present_in_main_menu_on_top_of_the_page() throws Throwable {
		 ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
			PauseUtil.pause(1000);
			PauseUtil.waitForAjaxToComplete(2000);
			SCHUtils.waitForElementToBeClickable(teachersHomePage.getmainmenulnkallflyers(), 10);
			SCHUtils.clickUsingJavaScript(teachersHomePage.getmainmenulnkallflyers());
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(2000);
	    }
	 
	 @When("^teacher clicks on Early Childhood Elf flyer present under Grade section$")
	    public void teacher_clicks_on_early_childhood_elf_flyer_present_under_grade_section() throws Throwable {
		 ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		 
			PauseUtil.pause(1000);
			PauseUtil.waitForAjaxToComplete(2000);
			String Highlighted_Grade = teachersHomePage.getflyerallflyersgradeelf().getText().trim();
			TestBaseProvider.getTestBase().getContext()
			.setProperty("testexecution.yto.highlightedgrade", Highlighted_Grade);
			System.out.println("flyer name in all flyers is:" +Highlighted_Grade);
			
			SCHUtils.waitForElementToBeClickable(teachersHomePage.getflyerallflyersgradeelf(), 10);
			SCHUtils.clickUsingJavaScript(teachersHomePage.getflyerallflyersgradeelf());
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(2000);
	    }
	 
	 
	 @When("^teacher clicks on Special Offers flyer present under Grade section$")
	    public void teacher_clicks_on_special_offers_flyer_present_under_grade_section() throws Throwable {
		 ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		 
			PauseUtil.pause(1000);
			PauseUtil.waitForAjaxToComplete(2000);
			String Highlighted_Grade = teachersHomePage.getflyerallflyerssplofferssploffers().getText().trim();
			TestBaseProvider.getTestBase().getContext()
			.setProperty("testexecution.yto.highlightedgrade", Highlighted_Grade);
			System.out.println("flyer name in all flyers is:" +Highlighted_Grade);
			
			SCHUtils.waitForElementToBeClickable(teachersHomePage.getflyerallflyerssplofferssploffers(), 10);
			SCHUtils.clickUsingJavaScript(teachersHomePage.getflyerallflyerssplofferssploffers());
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(2000);
	    }
	 
	 @And("^teacher clicks on flyer in special collection which was selected for the first time$")
	    public void teacher_clicks_on_flyer_in_special_collection_which_was_selected_for_the_first_time() throws Throwable {
		 ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		 
			PauseUtil.pause(1000);
			PauseUtil.waitForAjaxToComplete(2000);
			String Highlighted_Grade = teachersHomePage.getflyerallflyerssplofferssploffers().getText().trim();
			TestBaseProvider.getTestBase().getContext()
			.setProperty("testexecution.yto.highlightedgrade", Highlighted_Grade);
			System.out.println("flyer name in all flyers is:" +Highlighted_Grade);
			
			SCHUtils.waitForElementToBeClickable(teachersHomePage.getflyerallflyerssplofferssploffers(), 10);
			SCHUtils.clickUsingJavaScript(teachersHomePage.getflyerallflyerssplofferssploffers());
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(2000);
	    }
	 
	 @And("^teacher clicks on other Special Offers flyer present under Grade section$")
	    public void teacher_clicks_on_other_special_offers_flyer_present_under_grade_section() throws Throwable {
		 ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		 
			PauseUtil.pause(1000);
			PauseUtil.waitForAjaxToComplete(2000);
			String Highlighted_Grade = teachersHomePage.getflyerallflyerssplofferssploffers2().getText().trim();
			TestBaseProvider.getTestBase().getContext()
			.setProperty("testexecution.yto.highlightedgrade", Highlighted_Grade);
			System.out.println("flyer name in all flyers is:" +Highlighted_Grade);
			
			SCHUtils.waitForElementToBeClickable(teachersHomePage.getflyerallflyerssplofferssploffers2(), 10);
			SCHUtils.clickUsingJavaScript(teachersHomePage.getflyerallflyerssplofferssploffers2());
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(2000);
	    }
	 
	 
	 @When("^teacher clicks on French Club flyer present under French section$")
	    public void teacher_clicks_on_french_club_flyer_present_under_french_section() throws Throwable {
		 ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		 
			PauseUtil.pause(1000);
			PauseUtil.waitForAjaxToComplete(2000);
			String Highlighted_Grade = teachersHomePage.getflyerallflyersfrenchclubdelecture().getText().trim();
			TestBaseProvider.getTestBase().getContext()
			.setProperty("testexecution.yto.highlightedgrade", Highlighted_Grade);
			System.out.println("flyer name in all flyers is:" +Highlighted_Grade);
			
			SCHUtils.waitForElementToBeClickable(teachersHomePage.getflyerallflyersfrenchclubdelecture(), 10);
			SCHUtils.clickUsingJavaScript(teachersHomePage.getflyerallflyersfrenchclubdelecture());
			SCHUtils.waitForLoaderToDismiss();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(2000);
	    }
	 
	 
	 @Then("^teacher is navigated to Early Childhood Elf flyer for current month in YTO page$")
	    public void teacher_is_navigated_to_early_childhood_elf_flyer_for_current_month_in_yto_page() throws Throwable {
		 IStudentFlyerOrdersPage studentFlyerOrdersPage =
					getFactory().getIStudentFlyerOrdersPage();

			studentFlyerOrdersPage.verify_the_grade_flyer_month_displayed(TestBaseProvider.getTestBase().getTestData());
	    }
	 
	 @Then("^teacher is navigated to special Offers flyer for current month in YTO page$")
	    public void teacher_is_navigated_to_special_offers_flyer_for_current_month_in_yto_page() throws Throwable {
		 IStudentFlyerOrdersPage studentFlyerOrdersPage =
					getFactory().getIStudentFlyerOrdersPage();

			studentFlyerOrdersPage.verify_the_grade_flyer_month_displayed(TestBaseProvider.getTestBase().getTestData());
	    }
	 
	 
	 @Then("^teacher is navigated to Club de lecture flyer for current month in YTO page$")
	    public void teacher_is_navigated_to_club_de_lecture_flyer_for_current_month_in_yto_page() throws Throwable {
		 IStudentFlyerOrdersPage studentFlyerOrdersPage =
					getFactory().getIStudentFlyerOrdersPage();

			studentFlyerOrdersPage.verify_the_grade_flyer_month_displayed(TestBaseProvider.getTestBase().getTestData());
	    }
	
	
	/*@And("^teacher navigates to YTO page$")
    public void teacher_navigates_to_yto_page() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		StudentFlyerOrdersPage stdpage = new StudentFlyerOrdersPage();
		PauseUtil.pause(1000);
		//teachersHomePage.verifyPage();
		PauseUtil.waitForAjaxToComplete(2000);
		teachersHomePage.selectOptionFromTeacherHomePage(ConstantUtils.ENTERORDER);
		for(int i=0;i<=3;i++){
		if(stdpage.sizegrade_Seesaw().size()==0){
		teachersHomePage.selectOptionFromTeacherHomePage(ConstantUtils.ENTERORDER);	
	    Thread.sleep(4000);
		}
			
		}
    }*/
	
	@When("^Teacher navigates to YTO$")
    public void teacher_navigates_to_yto() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.clickOn_Enter_ClassRoom_Order();
    }

    @Then("^Teacher lands on YTO on default flyer current month$")
    public void teacher_lands_on_yto_on_default_flyer_current_month() throws Throwable {
    	IStudentFlyerOrdersPage studentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();

		studentFlyerOrdersPage.verify_the_default_flyer_displayed();
    }
	
	@When("^teacher clicks mini cart from home page$")
    public void teacher_clicks_mini_cart_from_home_page() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.closeButton_in_LoginPage();
		
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.user_clicks_on_mini_Reviewcart();
    }
	
	@When("^teacher selects \\[Teacher's Desk\\] from home page$")
    public void teacher_selects_teachers_desk_from_home_page() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.closeButton_in_LoginPage();
		homePage.clickOn_TeacherDesk_HomePage();
		homePage.closeButton_in_LoginPage();
    }
	
	@When("^teacher clicks on Envelope on Home page$")
    public void teacher_clicks_on_envelope_on_home_page() throws Throwable {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.closeButton_in_LoginPage();
		homePage.clickOn_Envelope_in_HomePage();
		homePage.closeButton_in_LoginPage();
    }
	
	@Then("^teacher lands on teacher's desk with alert message$")
    public void teacher_lands_on_teachers_desk_with_alert_message() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.verify_alert_message_displayed_TeacherDesk();
    }

	@Given("^teacher is on unauthenticated home page$")
	public void user_is_on_unauthenticated_home_page() {
		ILoginPage homePage = getFactory().getILoginPage();
		homePage.verifyUnauthenticatedHomePage();
	}

	@When("^user searches for an item\\[OrderInformation\\]$")
	public void user_searches_for_an_item_OrderInformation() throws Throwable {
		ITeachersHomePage teacherHomePage = getFactory().getITeachersHomePage();
		teacherHomePage.searchForItem(
				TestBaseProvider.getTestBase().getTestData().getString("item"));
		PauseUtil.pause(3000);

	}


	@Given("^user selects teacher desk from teacher home page$")
	public void user_selects_teacher_desk_from_teacher_home_page() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.selectOptionFromTeacherHomePage(ConstantUtils.TEACHER_DESK);
	}

	

	@When("^user select mini cart$")
	public void user_select_mini_cart() throws Throwable {
		SCHUtils.waitForLoaderToDismiss();
		IHeaderSection headerSection = SectionFactory.getFactory()
				.getIHeaderSection(LocatorUtils.getBy("dw.header.section"));
		headerSection.clickMiniCartIcon();

	}

	

	@Then("^user should see \\[HighlightedTabs\\] in menu$")
	public void user_should_see_HighlightedTabs_in_menu() {
		IHeaderSection headerSection = SectionFactory.getFactory()
				.getIHeaderSection(LocatorUtils.getBy("dw.header.section"));
		headerSection.verifyHighlightedTab(TestBaseProvider.getTestBase().getTestData());
	}


	@And("^Teacher navigates to classroom orders$")
	public void Teacher_navigates_to_classroom_orders() throws Throwable {
		teacher_selects_enter_classroom_order_from_home_page();
	}
	
	// Story SCSCOD-3919
	
	@And("^teacher have entered search query for a product that does not match any items in the database$")
    public void teacher_have_entered_search_query_for_a_product_that_does_not_match_any_items_in_the_database() throws Throwable {
    	IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("nitemName"));
    	
		
    }
	
	
    @When("^search results are displayed \\[UserInformation\\]$")
    public void search_results_are_displayed() throws Throwable {
    	ITeachersHomePage homepage = getFactory().getITeachersHomePage();
    	 homepage.verifySearchResultPage();
    	
    	
    	

    }

    @Then("^the search result page displays Sorry no results page is displayed$")
    public void the_search_result_page_displays_sorry_no_results_page_is_displayed() throws Throwable {
    	ITeachersHomePage homepage = getFactory().getITeachersHomePage();
    	homepage.valdiate0searchPg();
    }

     
    @And("^Teacher have entered search query in the search field which return search result$")
    public void teacher_have_entered_search_query_in_the_search_field_which_return_search_result() throws Throwable {
        ITeachersHomePage homepage = getFactory().getITeachersHomePage();
        homepage.search_with_sec_searchBar(TestBaseProvider.getTestBase().getTestData().getString("itemName"));
    }

    @Then("^Search result page should display the searched item$")
    public void search_result_page_should_display_the_searched_item() throws Throwable {
    	 ITeachersHomePage homepage = getFactory().getITeachersHomePage();
         homepage.getsecondSearchResultPg();
    } 
    
    
    @And("^teacher navigates to Teacher's Desk$")
    public void teacher_navigates_to_teachers_desk() throws Throwable {
    	ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(1000);
		ICheckoutPage chkkpage = getFactory().getICheckoutPage();
		chkkpage.clickhomeIcon_ConfirmationPage();
		
		ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		
		teachersHomePage.selectOptionFromTeacherHomePage(ConstantUtils.TEACHER_DESK);
		checkoutPage.user_select_MyAccount_in_HomePage();
		teachersHomePage.ReadTeacherDetailsFromMyAccountPage();
		teachersHomePage.SelectOptionFromTeacherHomePage();
    }
    
    
    @And("^teacher navigates to Teachers Desk$")
    public void teacher_navigates_to_teacher_desk() throws Throwable {
    	ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(1000);
		ICheckoutPage chkkpage = getFactory().getICheckoutPage();
		chkkpage.clickhomeIcon_ConfirmationPage();
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(4000);
		teachersHomePage.SelectOptionFromTeacherHomePage();
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(4000);
    }
    
    
    @And("^teacher navigates to Teacher's Desk from home page$")
    public void teacher_navigates_to_teachers_desk_from_home_page() throws Throwable {
    	ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(1000);
		teachersHomePage.SelectOptionFromTeacherHomePage();
		SCHUtils.waitForLoaderToDismiss();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(4000);
		
    }
    
    
    @When("^teacher clicks on View link$")
    public void teacher_clicks_on_view_link() throws Throwable {
    	ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(1000);
		teachersHomePage.selectviewteacherdesk();
    }
    
    @Then("^teacher should navigate to order details page for recent booking$")
    public void teacher_should_navigate_to_order_details_page_for_recent_booking() throws Throwable {
    	ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(1000);
		teachersHomePage.teacherdesk_view_orderdetailspage();
    }
    
    @Then("^no information should be displayed under \"([^\"]*)\" section$")
    public void no_information_should_be_displayed_under_something_section(String strArg1) throws Throwable {
    	ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(1000);
		teachersHomePage.check_for_no_viewlink_teacherdeskpage();
    }
    
    @And("^Submitted to Scholastic and Shipped options should not be highlighted$")
    public void submitted_to_scholastic_and_shipped_options_should_not_be_highlighted() throws Throwable {
    	ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(1000);
		teachersHomePage.check_for_nosubmit_noship_teacherdeskpage();
    }
    
    @Then("^referenec number and submitted date should be displayed under \"([^\"]*)\" section for recent order$")
    public void referenec_number_and_submitted_date_should_be_displayed_under_something_section_for_recent_order(String strArg1) throws Throwable {
    	ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(1000);
		teachersHomePage.verify_orderrefno_teacherdesk_orderstatus();
    }
    
    @And("^Submitted to Scholastic option should be highlighted$")
    public void submitted_to_scholastic_option_should_be_highlighted() throws Throwable {
    	ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(1000);
		teachersHomePage.check_for_submit_noship_teacherdeskpage();
    }
    
    @And("^Shipped option should not be highlighted$")
    public void shipped_option_should_not_be_highlighted() throws Throwable {
    	ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(1000);
		teachersHomePage.check_for_submit_noship_teacherdeskpage();
    }
    
    @And("^Submitted to Scholastic option should not be highlighted$")
    public void submitted_to_scholastic_option_should_not_be_highlighted() throws Throwable {
        throw new PendingException();
    }
    
    @And("^Shipped option should be highlighted$")
    public void shipped_option_should_be_highlighted() throws Throwable {
    	ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(1000);
		teachersHomePage.check_for_submit_ship_teacherdeskpage();
    }
    
    @And("^Submitted to Scholastic and Shipped options should be highlighted$")
    public void submitted_to_scholastic_and_shipped_options_should_be_highlighted() throws Throwable {
    	ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(1000);
		teachersHomePage.check_for_submit_ship_teacherdeskpage();
    }
    
    
    @When("^teacher is in home page$")
    public void teacher_is_in_home_page() throws Throwable {
    	ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(1000);
		teachersHomePage.verify_homepage();
    }
    
    @Then("^teacher is navigated to home page$")
    public void teacher_is_navigated_to_home_page() throws Throwable {
    	ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
    	teachersHomePage.handleBack2SchoolPopup("English");
		teachersHomePage.verify_homepage();
    }
    
    
    @Then("^Home icon, ENTER ORDERS, BOOKS & RESOURCES, ALL FLYERS and TEACHER'S DESK options should be present$")
    public void home_icon_enter_classroom_order_shop_books_option_resources_teachers_desk_options_should_be_present() throws Throwable {
    	ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		PauseUtil.pause(1000);
		teachersHomePage.verify_globalmainmenu();
    }
    
    
    
    @When("^teacher search with valid item having unique item id from global search$")
    public void teacher_search_with_valid_item_having_unique_item_id_from_global_search() throws Throwable {
    	IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"));
    }
    
    
    @When("^teacher navigates to PDP of an item$")
    public void teacher_navigates_to_pdp_of_an_item() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.GlobalSearch(
				TestBaseProvider.getTestBase().getTestData().getString("itemName"));
    }
	
	@Then("^teacher should see short description in “What makes this special”$")
    public void teacher_should_see_short_description_in_what_makes_this_special() throws Throwable {
	ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
	PauseUtil.pause(1000);
	teachersHomePage.verify_pdp_longAndShortDescription();
	}
	
	 @And("^teacher should see long description in “About” section$")
    public void teacher_should_see_long_description_in_about_section() throws Throwable {
	ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
	PauseUtil.pause(1000);
	teachersHomePage.verify_pdp_longAndShortDescription();
	    }
		
	 @When("^teacher adds more items to cart such that the cart is eligible for free shipping$")
	    public void teacher_adds_more_items_to_cart_such_that_the_cart_is_eligible_for_free_shipping() throws Throwable {
		 IStudentFlyerOrdersPage studentflyerpage = getFactory().getIStudentFlyerOrdersPage();
		 studentflyerpage.addmoreItemstoCartforFreeship();
		 IStudentFlyerOrdersPage iStudentFlyerOrdersPage =getFactory().getIStudentFlyerOrdersPage();
			iStudentFlyerOrdersPage.placeItems_GlobalSearch(
					TestBaseProvider.getTestBase().getTestData().getString("itemName"),
					TestBaseProvider.getTestBase().getTestData().getString("itemQty1"));

	    }

	@And("^the Free Pick item is not selected$")
	public void theFreePickItemIsNotSelected() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^teacher can see Class List section below the Order Status Section and above the Parent Online Payments section$")
	public void teacherCanSeeClassListSectionBelowTheOrderStatusSectionAndAboveTheParentOnlinePaymentsSection() throws Throwable {
		IStudentFlyerOrdersPage iStudentFlyerOrdersPage =
				getFactory().getIStudentFlyerOrdersPage();
		iStudentFlyerOrdersPage.verify_teacherDesk_Classlist();

	}
	
	
	@Then("^teacher should be navigated to PDP page with correct unique item id$")
    public void teacher_should_be_navigated_to_pdp_page_with_correct_unique_item_id() throws Throwable {
		String actual_productPDPPage = pdppage.getlblpdpproductminiattribute().getText();
        String checkProdPDP = TestBaseProvider.getTestBase().getTestData().getString("uniqueid");
        
        if(!actual_productPDPPage.contains(checkProdPDP))
		{
		Assert.fail("Unique item id is not showing in PDP page : "+checkProdPDP);	
		}
    }
	
	@Then("^teacher sees grade related to logged in teacher for item in PDP page$")
    public void teacher_sees_grade_related_to_logged_in_teacher_for_item_in_PDP_page() throws Throwable {
		String actual_productPDPPage = pdppage.getlblpdpproductminiattribute().getText();
        String checkProdPDP = TestBaseProvider.getTestBase().getTestData().getString("item_grade");
        
        if(!actual_productPDPPage.contains(checkProdPDP))
		{
		Assert.fail("Item is not as per the teacher grade: "+checkProdPDP);	
		}
    }
	
	
	@Then("^teacher do not see any item id in PDP page$")
    public void teacher_do_not_see_any_item_id_in_pdp_page() throws Throwable {
		String actual_productPDPPage = pdppage.getlblpdpproductminiattribute().getText();
        String checkProdPDP = TestBaseProvider.getTestBase().getTestData().getString("item_grade");
        
        if(!actual_productPDPPage.contains(checkProdPDP))
		{
		Assert.fail("Item is not as per the teacher grade: "+checkProdPDP);	
		}
    }
	
	
	@Then("^teacher sees default grade or according to search ranking rule to teacher’s grade in PDP page$")
    public void teacher_sees_default_grade_or_according_to_search_ranking_rule_to_teachers_grade_in_pdp_page() throws Throwable {
		String actual_productPDPPage = pdppage.getlblpdpproductminiattribute().getText();
        String checkProdPDP = TestBaseProvider.getTestBase().getTestData().getString("item_grade");
        
        if(!actual_productPDPPage.contains(checkProdPDP))
		{
		Assert.fail("Item is not as per the teacher grade: "+checkProdPDP);	
		}
    }
	
	
	@Then("^teacher sees correct order of item id's and grades$")
    public void teacher_sees_correct_order_of_item_ids_and_grades() throws Throwable {
		System.out.println("yet to implement this");
    }
	
	@When("^teacher clicks \"([^\"]*)\" from SOO section$")
	public void teacher_clicks_from_SOO_section(String arg1) throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.clicks_View_Submit_link_TeachersDesk();
	}
	
	@Given("^teachers log in, and their profile information are stored$")
	public void teachers_log_in_and_their_profile_information_are_stored() throws Throwable {
		ITeachersHomePage teacherHomePage = getFactory().getITeachersHomePage();
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		ILoginPage homePage = getFactory().getILoginPage();
		
		String dir = TestBaseProvider.getTestBase().getTestData().getString("teacherDir");
		String teacherAccount = teacherHomePage.get_teacher_account_from_properties(TestBaseProvider.getTestBase().getTestData().getInt("teacherAssociation"), dir);
		int idx = TestBaseProvider.getTestBase().getTestData().getInt("teacherAssociation");
		
		String password = "passw0rd";
		
		//Set the current index for each unique teacher and parent association and set teacher account
		TestBaseProvider.getTestBase().getContext().setProperty("ID"+idx, teacherHomePage.get_starting_idx_from_properties(dir) + idx);
		TestBaseProvider.getTestBase().getContext().setProperty("teacherAccount"+idx, teacherAccount);
		
		//Login
		homePage.doLogin2(teacherAccount, password, false);
		
		// Go to Profile Page
		teacherHomePage.selectOptionFromTeacherHomePage(ConstantUtils.PROFILE);
        checkoutPage.user_selects_MyAccount_DropDown_in_ConfirmationPage();
        
        // Get teacher info and set to property
        teacherHomePage.get_teacher_information(idx);
        
        //Teacher logs out
        System.out.println("Logging out account " + teacherAccount);
        teacherHomePage.doLogout();
	}
	
	@When("^both teachers log in, and their profile information are stored$")
	public void both_teachers_log_in_and_their_profile_information_are_stored() throws Throwable {
		ITeachersHomePage teacherHomePage = getFactory().getITeachersHomePage();
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		ILoginPage homePage = getFactory().getILoginPage();
		String dir = TestBaseProvider.getTestBase().getTestData().getString("teacherDir");
		
		for (int i = 1; i <= 2; i++){
			String teacherAccount = teacherHomePage.get_teacher_account_from_properties(TestBaseProvider.getTestBase().getTestData().getInt("teacherAssociation"+i), dir);
			String password = "passw0rd";
			int idx = TestBaseProvider.getTestBase().getTestData().getInt("teacherAssociation"+i);
			
			//Set the current index for each unique teacher and parent association and set teacher account
			TestBaseProvider.getTestBase().getContext().setProperty("ID"+idx, teacherHomePage.get_starting_idx_from_properties(dir) + idx);
			TestBaseProvider.getTestBase().getContext().setProperty("teacherAccount"+idx, teacherAccount);
			
			//Login
			homePage.doLogin2(teacherAccount, password, false);
			
			// Go to Profile Page
			teacherHomePage.selectOptionFromTeacherHomePage(ConstantUtils.PROFILE);
	        checkoutPage.user_selects_MyAccount_DropDown_in_ConfirmationPage();
	        
	        // Get teacher info and set to property
	        teacherHomePage.get_teacher_information(idx);
	        
	        //Teacher logs out
	        System.out.println("Logging out account " + teacherAccount);
	        teacherHomePage.doLogout();
	        
	        PauseUtil.pause(2000);
		}
		
	}
	
	@When("^teacher clicks Edit in the \"([^\"]*)\" section$")
	public void teacher_clicks_Edit_in_the_section(String arg1) throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.restore_default_msg_language();
		teachersHomePage.clicks_edit_button_on_Send_Letter_to_Parents_section();	
	}

	@When("^teacher selects a different language$")
	public void teacher_selects_a_different_language() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.select_different_language_on_Send_Letter_to_Parents_modal_dropdown();
	}

	@When("^teacher edits the letter$")
	public void teacher_edits_the_letter() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.edit_letter_in_Send_Letter_to_Parents_modal();
	}

	@When("^teacher clicks Save$")
	public void teacher_clicks_Save() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.click_save_button_in_Send_Letter_to_Parents_modal();
	}

	@Then("^edited version of the letter is saved and displays on \"([^\"]*)\" modal$")
	public void edited_version_of_the_letter_is_saved_and_displays_on_modal(String arg1) throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.verify_edited_letter_is_saved();
	}
	
	@Given("^teacher clicks \"([^\"]*)\" link from \"([^\"]*)\" section$")
	public void teacher_clicks_link_from_section(String arg1, String arg2) throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.restore_default_msg_language();
		teachersHomePage.click_view_on_Send_Letter_to_Parents_section();
	}

	@When("^teacher clicks \"([^\"]*)\" in the \"([^\"]*)\" modal$")
	public void teacher_clicks_in_the_modal(String arg1, String arg2) throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.click_restore_deafult_in_Send_Letter_to_Parents_modal();
	}

	@Then("^the default message is restored and saved$")
	public void the_default_message_is_restored_and_saved() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.verify_deafult_message_is_displayed();
	}
	
	@When("^teacher clicks on close$")
	public void teacher_clicks_on_close() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.click_close_button_on_Send_Letter_to_Parents_modal();
	}

	@Then("^the modal is closed$")
	public void the_modal_is_closed() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.verify_Send_Letter_to_Parents_modal_not_displayed();
	}

	@Then("^the changes are not saved$")
	public void the_changes_are_not_saved() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.click_view_on_Send_Letter_to_Parents_section();
		teachersHomePage.verify_deafult_message_is_displayed();
	}
	
	@When("^teacher selects a language and clicks Download$")
	public void teacher_selects_a_language_and_clicks_Download() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.select_different_language_on_Send_Letter_to_Parents_modal_dropdown();
		teachersHomePage.click_download_on_Send_Letter_to_Parents_modal();
	}

	@Then("^the download pdf format of the letter displays with appropriate selected language$")
	public void the_download_pdf_format_of_the_letter_displays_with_appropriate_selected_language() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.verify_letter_displays_in_selected_language();
	}
	
	@When("^teacher selects a language and clicks Print$")
	public void teacher_selects_a_language_and_clicks_Print() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.select_different_language_on_Send_Letter_to_Parents_modal_dropdown();
		teachersHomePage.click_print_on_Send_Letter_to_Parents_modal();
	}
	
	@When("^teacher clicks Facebook icon$")
	public void teacher_clicks_Facebook_icon() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.click_facebook_icon_on_Send_Letter_to_Parents_modal();
	}

	@Then("^teacher is redirected to the scholastic canada reading club facebook page in new tab$")
	public void teacher_is_redirected_to_the_scholastic_canada_reading_club_facebook_page_in_new_tab() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.verify_facebook_page_is_displayed();
	}
	
	@When("^teacher clicks on Download$")
	public void teacher_clicks_on_Download() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.click_download_on_Send_Letter_to_Parents_modal();
	}
	
	@When("^teacher clicks on Print$")
	public void teacher_clicks_on_Print() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.click_print_on_Send_Letter_to_Parents_modal();
	}
	
	@And("^teacher clicks \"([^\"]*)\" link on View Mode")
	public void teacher_clicks_link_on_View_Mode(String arg1) throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.click_edit_link_view_mode_Send_Letter_to_Parents_modal();
	}

	@Then("^the download pdf format of the letter displays with edited version of the letter$")
	public void the_download_pdf_format_of_the_letter_displays_with_edited_version_of_the_letter() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.verify_letter_displays_in_selected_language();
	}
	
	@And("^teacher deletes one of the parent order making the pre\\-tax subtotal less than the min\\. amount$")
    public void teacher_deletes_one_of_the_parent_order_making_the_pretax_subtotal_less_than_the_min_amount() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.teacher_deletes_first_SOO_item_in_Cart_page();
	}
	
	@Given("^teacher clicks on Profile from My Account dropdown$")
	public void teacher_clicks_on_Profile_from_My_Account_dropdown() throws Throwable {
		ITeachersHomePage teacherHomePage = getFactory().getITeachersHomePage();
		ICheckoutPage checkoutPage = getFactory().getICheckoutPage();
		
		teacherHomePage.selectOptionFromTeacherHomePage(ConstantUtils.PROFILE);
        checkoutPage.user_selects_MyAccount_DropDown_in_ConfirmationPage();
	}
	
	//################################################ DWCAPCOD - 1456 #################################################################
	@When("^teacher clicks on Edit next to Parent Site$")
	public void teacher_clicks_on_Edit_next_to_Parent_Site() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.teacher_clicks_edit_link_parent_site();
	}
	
	@When("^teacher checks the parent site option$")
	public void teacher_checks_the_parent_site_option() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.teacher_checks_parent_site_option();
	}
	
	@Then("^Edit Parent Site modal closes$")
	public void edit_Parent_Site_modal_closes() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.teacher_edit_parent_site_modal_not_displayed();
	}
	
	@When("^teacher unchecks the parent site option$")
	public void teacher_unchecks_the_parent_site_option() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.teacher_unchecks_parent_site_option();
	}

	@When("^teacher clicks on Save on Parent Site Modal$")
	public void teacher_clicks_on_Save_on_Parent_Site_Modal() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.teacher_clicks_save_parent_site_modal();
	}

	@Then("^Parent Site displays without any selected options displayed under it$")
	public void parent_Site_displays_without_any_selected_options_displayed_under_it() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.teacher_does_not_see_anything_parent_site_opted_out();
	}
	
	@When("^teacher clicks on Next from Welcome to Reading clubs modal$")
	public void teacher_clicks_on_Next_from_Welcome_to_Reading_clubs_modal() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.teacher_clicks_next_parent_site_launch_modal();
	}

	@Then("^Homepage displays with Edit parent site modal$")
	public void Homepage_displays_with_Edit_parent_site_modal() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		ILoginPage login = getFactory().getILoginPage();
        login.verifyTCODHomepgae();
		//teachersHomePage.teacher_my_account_page_is_displayed();
		teachersHomePage.teacher_edit_parent_site_modal_is_displayed();
	}

	@Then("^checkbox to opt in for parent site is not checked by default$")
	public void checkbox_to_opt_in_for_parent_site_is_not_checked_by_default() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.teacher_checkbox_not_selected_edit_parent_site_modal();
	}
	
	@Then("^checkbox to opt in for parent site is checked by default$")
	public void checkbox_to_opt_in_for_parent_site_is_checked_by_default() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.teacher_checkbox_selected_edit_parent_site_modal();
	}

    @And("^teacher did not set a due date yet$")
    public void teacherDidNotSetADueDateYet() throws Throwable {
		System.out.println("try to run");
	}

    @Then("^\"([^\"]*)\" modal displays$")
    public void modalDisplays(String arg0) throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.modalforSetDueDateReminder();


    }

    @And("^teacher has already set a due date$")
    public void teacherHasAlreadySetADueDate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
		System.out.println("no implementation required for this");
	}

    @Then("^the reminder letter is downloaded in pdf format with the set duedate$")
    public void theReminderLetterIsDownloadedInPdfFormatWithTheSetDuedate() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.newbrowserTabforpdf();

    }

    @And("^teacher clicks \"([^\"]*)\" link from \"([^\"]*)\" section \"([^\"]*)\" section$")
    public void teacherClicksLinkFromSectionSection(String arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the pdf format of the reminder ready to print displays with the set due date$")
    public void thePdfFormatOfTheReminderReadyToPrintDisplaysWithTheSetDueDate() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.newbrowserTabforpdf();
    }

    @When("^teacher clicks on Email$")
    public void teacherClicksOnEmail() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the default email client displays with the reminder letter with the set duedate$")
    public void theDefaultEmailClientDisplaysWithTheReminderLetterWithTheSetDuedate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^teacher clicks on Edit$")
    public void teacherClicksOnEdit() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.reminderLetterclickEdit();


    }

    @And("^edits the reminder letter$")
    public void editsTheReminderLetter() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.updatereminderLetter();

    }

    @Then("^Send Reminder modal displays with edited and saved$")
    public void sendReminderModalDisplaysWithEditedAndSaved() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.updatereminderLettersaved();
    }

    @And("^Reminder modal displays with the edited message$")
    public void reminderModalDisplaysWithTheEditedMessage() throws Throwable {
		System.out.println("No need ");
	}

    @And("^teacher edits the reminder letter$")
    public void teacherEditsTheReminderLetter() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^teacher clicks \"([^\"]*)\"$")
    public void teacherClicks(String arg0) throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.restoredefault_remindLetter();



    }

    @Then("^default reminder letter is restored and saved$")
    public void defaultReminderLetterIsRestoredAndSaved() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.defultletterdisplay();


	}

    @And("^teacher edits the reminder$")
    public void teacherEditsTheReminder() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the reminder letter is downloaded in pdf format with the edited reminder$")
    public void theReminderLetterIsDownloadedInPdfFormatWithTheEditedReminder() throws Throwable {

		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.newbrowserTabforpdf();

    }

    @Then("^the pdf format of the reminder ready to print displays with the edited reminder$")
    public void thePdfFormatOfTheReminderReadyToPrintDisplaysWithTheEditedReminder() throws Throwable {

		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.newbrowserTabforpdf();

    }

    @Then("^the default email client displays with the reminder letter with the edited reminder$")
    public void theDefaultEmailClientDisplaysWithTheReminderLetterWithTheEditedReminder() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

	@When("^teacher clicks on \"([^\"]*)\" link from \"([^\"]*)\" section$")
	public void teacherClicksOnLinkFromSection(String arg0, String arg1) throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.select_sendRemider_fromNextdueDatesection();;
	}

	@Then("^\"([^\"]*)\" modal displays with calender displayed next to Order Due Date on the reminder$")
	public void modalDisplaysWithCalenderDisplayedNextToOrderDueDateOnTheReminder(String arg0) throws Throwable {
		PCOD_HomePage pcod_homepage = new PCOD_HomePage();
		pcod_homepage.pcod_due_date_calendar_displays();
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.modalforSetDueDateReminder();
	}

	@And("^clicks on Save on reminder letter$")
	public void clicksOnSaveOnReminderLetter() throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.savebuttononletterDuedateReminder();

	}

	@And("^“Allow parents to find me and place orders online” displays with green tick mark under parent(\\d+) site$")
	public void allowParentsToFindMeAndPlaceOrdersOnlineDisplaysWithGreenTickMarkUnderParentSite(int arg0) throws Throwable {
		ITeachersHomePage teachersHomePage = getFactory().getITeachersHomePage();
		teachersHomePage.teacher_selected_option_displays_parent_site_opted_in();
	}


}
