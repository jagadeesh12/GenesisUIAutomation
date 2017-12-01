package com.dw.automation.steps.redington;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import com.dw.automation.pages.CouponCreatePage;
import com.dw.automation.pages.OrgCreateAndApprovePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CouponCreateSteps {

	OrgCreateAndApprovePage oca = getFactory().getOrgCreateAndApprovePage();
	CouponCreatePage ccp = getFactory().getCouponCreateImpl();
	
	@Given("^I launch the application as a BAM\\[UserInformation\\]$")
	public void i_launch_the_application_as_a_BAM_UserInformation() throws Throwable {
		oca.loginApplicationAsBAM();
	}

	@Given("^I go to coupon page$")
	public void i_go_to_coupon_page() throws Throwable {
		ccp.goToCouponPage();
	}

	@Given("^I add a new coupon$")
	public void i_add_a_new_coupon() throws Throwable {
		ccp.addCoupon();
	}

	@Then("^I get coupon number$")
	public void i_get_coupon_number() throws Throwable {

	}
}
