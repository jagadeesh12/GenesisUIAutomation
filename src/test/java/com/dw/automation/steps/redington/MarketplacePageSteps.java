package com.dw.automation.steps.redington;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import com.dw.automation.pages.MarketPlacePage;
import com.dw.automation.pages.impl.PartnerUserPageImpl;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class MarketplacePageSteps {
	
	MarketPlacePage mpp = getFactory().getMarketPlacePage();
	public static String orderNumber;
	public static String status;
	public static String orderStatus;
	
	
	@Given("^I launch the application as a Partner Manager\\[UserInformation\\]$")
	public void i_launch_the_application_as_a_Partner_Manager_UserInformation() throws Throwable {
		mpp.loginApplicationAsPM();
	}

	@Then("^I should see Login Page$")
	public void i_should_see_Login_Page() throws Throwable {
	}

	@Then("^I add a product to the cart$")
	public void i_add_a_product_to_the_cart() throws Throwable {
		mpp.addProductToCart();
		orderNumber =  mpp.getOrderNumber();
	}

	@Then("^I logout from the application$")
	public void i_logout_from_the_application() throws Throwable {
		mpp.logout();
	}

	@Given("^I launch the application as a Finance Manager$")
	public void i_launch_the_application_as_a_Finance_Manager() throws Throwable {
		mpp.loginApplicationAsFM();
	}

	@Then("^I approve the product that has been ordered$")
	public void i_approve_the_product_that_has_been_ordered() throws Throwable {
		status = "Approved";
		Assert.assertTrue("Order not approved ",mpp.order(orderNumber,status).contains("Approved"));
	}

	@Given("^I launch the application as a Partner Manager$")
	public void i_launch_the_application_as_a_Partner_Manager() throws Throwable {
		mpp.loginApplicationAsPM();
	}

	@Then("^I should see the Product that has been ordered is approved$")
	public void i_should_see_the_Product_that_has_been_ordered_is_approved() throws Throwable {
		String user = "orderId";
		String pass = "ord";
		String p="";
		//RUtils.update_xml(1,user ,pass, email, resetPassword);
		System.out.println("Writing data to xml");
		PartnerUserPageImpl.writeXML(user,pass,orderNumber,p);
		Assert.assertTrue("Order not approved ",mpp.orderStatus(orderNumber).contains("Approved"));
	}
	
	@Then("^I reject the product that has been ordered$")
	public void i_reject_the_product_that_has_been_ordered() throws Throwable {
		status = "Rejected";
		Assert.assertTrue("Order not approved ",mpp.order(orderNumber,status).contains("Rejected"));
	}

	@Then("^I should see the Product that has been ordered is rejected$")
	public void i_should_see_the_Product_that_has_been_ordered_is_rejected() throws Throwable {
		Assert.assertTrue("Order not approved ",mpp.orderStatus(orderNumber).contains("Rejected"));

	}
	
	
    @Then("^I add base products to the cart$")
    public void i_add_base_products_to_the_cart() throws Throwable {
    	mpp.addBaseProducts();
    }


    @Then("^I add addon products to the cart$")
    public void i_add_addon_products_to_the_cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	mpp.addAddOnProducts();
    	orderNumber =  mpp.getOrderNumber();
    }
    

    @And("^I do provisioning for products$")
    public void i_do_provisioning_for_products() throws Throwable {
    	mpp.provisionProducts();
    }

    @Then("^I go to orders page and search for the approved product $")
    public void i_go_to_orders_page_and_search_for_the_approved_product() throws Throwable {
    	mpp.goToApprovedProduct();
    }

}
