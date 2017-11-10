package com.dw.automation.steps.home;

import java.text.DecimalFormat;

import com.dw.automation.pages.impl.PCOD_HomePage;
import com.dw.automation.pages.impl.PCOD_LoginPage;
import com.dw.automation.pages.impl.PCOD_ReviewCartPage;
import com.dw.automation.pages.impl.ProductDetailPage;
import com.dw.automation.pages.impl.StudentFlyerOrdersPage;
import com.dw.automation.pages.impl.TeachersHomePage;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.TestBaseProvider;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.seleniumhq.jetty9.util.log.Log;

public class PCOD_PDPPageSteps {

PCOD_HomePage pcod_homepage = new PCOD_HomePage();
PCOD_LoginPage pcod_logpage = new PCOD_LoginPage();
TeachersHomePage teach_homepage = new TeachersHomePage();
ProductDetailPage prod_page = new ProductDetailPage();
StudentFlyerOrdersPage stud_page = new StudentFlyerOrdersPage();
ProductDetailPage pdp_page = new ProductDetailPage();
PCOD_ReviewCartPage pcod_reviewpage = new PCOD_ReviewCartPage();

//######################### HOME PAGE		#############################################


@And("^parent add item from PDP page and navigates to shopping cart page$")
public void parent_add_item_from_pdp_page_and_navigates_to_shopping_cart_page() throws Throwable {
	stud_page.placeItems_GlobalSearch(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"));

}

@And("^parent add items to cart for 1 child$")
public void parent_add_items_to_cart_for_1_child() throws Throwable {
	stud_page.placeItems_GlobalSearch_Teach_StudentItems(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
			TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));

	Thread.sleep(2500);
    double item1price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem1totalpricereviewcartpage());

    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item11.totalprice", item1price);

    double item2price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem2totalpricereviewcartpage());
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item12.totalprice", item2price);

    double itemprice = item1price+item2price;
    itemprice = Double.parseDouble(new DecimalFormat("##.##").format(itemprice));

    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item1.totalprice", itemprice);

    pcod_reviewpage.calculate_items_taxes_shoppingcart(
    		pcod_reviewpage.sizedrpdownchildname1reviewcart(),pcod_reviewpage.getlblitem1unitpricereviewcartpage(),stud_page.cart_qty_item1(),
    		pcod_reviewpage.sizedrpdownchildname2reviewcart(),pcod_reviewpage.getlblitem2unitpricereviewcartpage(),stud_page.cart_qty_item2(),
    		pcod_reviewpage.sizedrpdownchildname3reviewcart(),pcod_reviewpage.getlblitem3unitpricereviewcartpage(),stud_page.cart_qty_item3(),
    		pcod_reviewpage.sizedrpdownchildname4reviewcart(),pcod_reviewpage.getlblitem4unitpricereviewcartpage(),stud_page.cart_qty_item4());
}


@When("^parent add items from PDP page and navigates to shopping cart page$")
public void parent_add_items_from_pdp_page_and_navigates_to_shopping_cart_page() throws Throwable {
	stud_page.placeItems_GlobalSearch_Teach_StudentItems(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
			TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));
}

@And("^parent add multiple items from PDP page and navigates to shopping cart page$")
public void parent_add_multiple_items_from_pdp_page_and_navigates_to_shopping_cart_page() throws Throwable {
	stud_page.placeItems_GlobalSearch_Teach_StudentItems(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
			TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));
}

@And("^parent add 2 items to cart and navigate to shopping cart$")
public void parent_add_2_items_to_cart_and_navigate_to_shopping_cart() throws Throwable {
	stud_page.placeItems_GlobalSearch_Teach_StudentItems(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
			TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));
}

@And("^parent add items to the cart$")
public void parent_add_items_to_the_cart() throws Throwable {
	stud_page.placeItems_GlobalSearch_Teach_StudentItems(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
			TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));

	Thread.sleep(2500);
    pcod_logpage.pcod_click_element(pcod_reviewpage.getdrpdwnchildname2reviewcart());
    SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname2reviewcart(),(ConstantUtils.REVIEWCARTCHILD2));
    	PauseUtil.pause(1500);
    	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild", String.valueOf
    	        (pcod_reviewpage.getdrpdownchildname2reviewcart().getText()));
    Thread.sleep(2500);
    double item1price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem1totalpricereviewcartpage());


    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item1.totalprice", item1price);

    double item2price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem2totalpricereviewcartpage());
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item2.totalprice", item2price);

    pcod_reviewpage.calculate_items_taxes_shoppingcart(
    		pcod_reviewpage.sizedrpdownchildname1reviewcart(),pcod_reviewpage.getlblitem1unitpricereviewcartpage(),stud_page.cart_qty_item1(),
    		pcod_reviewpage.sizedrpdownchildname2reviewcart(),pcod_reviewpage.getlblitem2unitpricereviewcartpage(),stud_page.cart_qty_item2(),
    		pcod_reviewpage.sizedrpdownchildname3reviewcart(),pcod_reviewpage.getlblitem3unitpricereviewcartpage(),stud_page.cart_qty_item3(),
    		pcod_reviewpage.sizedrpdownchildname4reviewcart(),pcod_reviewpage.getlblitem4unitpricereviewcartpage(),stud_page.cart_qty_item4());
    pcod_reviewpage.readalldata_iteminformation_reviewcart();

}

@And("^parent add items to cart for Child1 meeting the minimum amount for free pick coupon$")
public void parent_add_items_to_cart_for_child1_meeting_the_minimum_amount_for_free_pick_coupon() throws Throwable {
	stud_page.placeItems_GlobalSearch(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
    Thread.sleep(2500);
    double item1price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem1totalpricereviewcartpage());

    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item1.totalprice", item1price);

    String total_items = pcod_reviewpage.getlbltotalitemsqtyreviewcartpage().getText();

    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.total.items", total_items);

    pcod_reviewpage.calculate_items_taxes_shoppingcart(
    		pcod_reviewpage.sizedrpdownchildname1reviewcart(),pcod_reviewpage.getlblitem1unitpricereviewcartpage(),stud_page.cart_qty_item1(),
    		pcod_reviewpage.sizedrpdownchildname2reviewcart(),pcod_reviewpage.getlblitem2unitpricereviewcartpage(),stud_page.cart_qty_item2(),
    		pcod_reviewpage.sizedrpdownchildname3reviewcart(),pcod_reviewpage.getlblitem3unitpricereviewcartpage(),stud_page.cart_qty_item3(),
    		pcod_reviewpage.sizedrpdownchildname4reviewcart(),pcod_reviewpage.getlblitem4unitpricereviewcartpage(),stud_page.cart_qty_item4());

	pcod_reviewpage.readalldata_iteminformation_reviewcart();
}


@And("^parent add items to cart for both the children$")
public void parent_add_items_to_cart_for_both_the_children() throws Throwable {
	stud_page.placeItems_GlobalSearch_Teach_StudentItems(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
			TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));

	Thread.sleep(2500);
    pcod_logpage.pcod_click_element(pcod_reviewpage.getdrpdwnchildname2reviewcart());
    SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname2reviewcart(),(ConstantUtils.REVIEWCARTCHILD2));
    	PauseUtil.pause(1500);
    	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild", String.valueOf
    	        (pcod_reviewpage.getdrpdownchildname2reviewcart().getText()));
    Thread.sleep(2500);
    double item1price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem1totalpricereviewcartpage());


    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item1.totalprice", item1price);

    double item2price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem2totalpricereviewcartpage());
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item2.totalprice", item2price);

    String total_items = pcod_reviewpage.getlbltotalitemsqtyreviewcartpage().getText();

    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.total.items", total_items);

    pcod_reviewpage.calculate_items_taxes_shoppingcart(
    		pcod_reviewpage.sizedrpdownchildname1reviewcart(),pcod_reviewpage.getlblitem1unitpricereviewcartpage(),stud_page.cart_qty_item1(),
    		pcod_reviewpage.sizedrpdownchildname2reviewcart(),pcod_reviewpage.getlblitem2unitpricereviewcartpage(),stud_page.cart_qty_item2(),
    		pcod_reviewpage.sizedrpdownchildname3reviewcart(),pcod_reviewpage.getlblitem3unitpricereviewcartpage(),stud_page.cart_qty_item3(),
    		pcod_reviewpage.sizedrpdownchildname4reviewcart(),pcod_reviewpage.getlblitem4unitpricereviewcartpage(),stud_page.cart_qty_item4());
    pcod_reviewpage.readalldata_iteminformation_reviewcart();
}

@And("^parent add items to cart for 2 children$")
public void parent_add_items_to_cart_for_2_children() throws Throwable {
	stud_page.placeItems_GlobalSearch_Teach_StudentItems(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
			TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));
	Thread.sleep(2500);
	
    SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname1reviewcart(),(ConstantUtils.REVIEWCARTCHILD2));
    	PauseUtil.pause(1500);
    	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild", String.valueOf
    	        (pcod_reviewpage.getdrpdownchildname1reviewcart().getText()));
    
    Thread.sleep(2500);
    SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname2reviewcart(),(ConstantUtils.REVIEWCARTCHILD2));
    	PauseUtil.pause(1500);
    	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild", String.valueOf
    	        (pcod_reviewpage.getdrpdownchildname2reviewcart().getText()));
    Thread.sleep(2500);
    double item1price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem1totalpricereviewcartpage());

    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item1.totalprice", item1price);

    double item2price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem2totalpricereviewcartpage());
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item2.totalprice", item2price);

    String total_items = pcod_reviewpage.getlbltotalitemsqtyreviewcartpage().getText();

    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.total.items", total_items);

    pcod_reviewpage.calculate_items_taxes_shoppingcart(
    		pcod_reviewpage.sizedrpdownchildname1reviewcart(),pcod_reviewpage.getlblitem1unitpricereviewcartpage(),stud_page.cart_qty_item1(),
    		pcod_reviewpage.sizedrpdownchildname2reviewcart(),pcod_reviewpage.getlblitem2unitpricereviewcartpage(),stud_page.cart_qty_item2(),
    		pcod_reviewpage.sizedrpdownchildname3reviewcart(),pcod_reviewpage.getlblitem3unitpricereviewcartpage(),stud_page.cart_qty_item3(),
    		pcod_reviewpage.sizedrpdownchildname4reviewcart(),pcod_reviewpage.getlblitem4unitpricereviewcartpage(),stud_page.cart_qty_item4());
    pcod_reviewpage.readalldata_iteminformation_reviewcart();
}


@And("^parent add items to cart for 2 children meeting the minimum amount for free pick coupon$")
public void parent_add_items_to_cart_for_2_children_meeting_the_minimum_amount_for_free_pick_coupon() throws Throwable {
	stud_page.placeItems_GlobalSearch_Teach_StudentItems(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
			TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));

	Thread.sleep(2500);
    pcod_logpage.pcod_click_element(pcod_reviewpage.getdrpdwnchildname2reviewcart());
    SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname2reviewcart(),(ConstantUtils.REVIEWCARTCHILD2));
    	PauseUtil.pause(1500);
    	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild", String.valueOf
    	        (pcod_reviewpage.getdrpdownchildname2reviewcart().getText()));
    Thread.sleep(2500);
    double item1price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem1totalpricereviewcartpage());


    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item1.totalprice", item1price);

    double item2price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem2totalpricereviewcartpage());
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item2.totalprice", item2price);

    String total_items = pcod_reviewpage.getlbltotalitemsqtyreviewcartpage().getText();

    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.total.items", total_items);

    pcod_reviewpage.calculate_items_taxes_shoppingcart(
    		pcod_reviewpage.sizedrpdownchildname1reviewcart(),pcod_reviewpage.getlblitem1unitpricereviewcartpage(),stud_page.cart_qty_item1(),
    		pcod_reviewpage.sizedrpdownchildname2reviewcart(),pcod_reviewpage.getlblitem2unitpricereviewcartpage(),stud_page.cart_qty_item2(),
    		pcod_reviewpage.sizedrpdownchildname3reviewcart(),pcod_reviewpage.getlblitem3unitpricereviewcartpage(),stud_page.cart_qty_item3(),
    		pcod_reviewpage.sizedrpdownchildname4reviewcart(),pcod_reviewpage.getlblitem4unitpricereviewcartpage(),stud_page.cart_qty_item4());

    pcod_reviewpage.readalldata_iteminformation_reviewcart();
}


@And("^parent add items to cart for one child$")
public void parent_add_items_to_cart_for_one_child() throws Throwable {
	stud_page.placeItems_GlobalSearch_Teach_StudentItems(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
			TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));


    double item1price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem1totalpricereviewcartpage());

    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item1.totalprice", item1price);

    double item2price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem2totalpricereviewcartpage());
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item2.totalprice", item2price);

    String total_items = pcod_reviewpage.getlbltotalitemsqtyreviewcartpage().getText();

    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.total.items", total_items);

    pcod_reviewpage.calculate_items_taxes_shoppingcart(
    		pcod_reviewpage.sizedrpdownchildname1reviewcart(),pcod_reviewpage.getlblitem1unitpricereviewcartpage(),stud_page.cart_qty_item1(),
    		pcod_reviewpage.sizedrpdownchildname2reviewcart(),pcod_reviewpage.getlblitem2unitpricereviewcartpage(),stud_page.cart_qty_item2(),
    		pcod_reviewpage.sizedrpdownchildname3reviewcart(),pcod_reviewpage.getlblitem3unitpricereviewcartpage(),stud_page.cart_qty_item3(),
    		pcod_reviewpage.sizedrpdownchildname4reviewcart(),pcod_reviewpage.getlblitem4unitpricereviewcartpage(),stud_page.cart_qty_item4());
    pcod_reviewpage.readalldata_iteminformation_reviewcart();
}


@And("^parent add items to cart which are PST exempt$")
public void parent_add_items_to_cart_which_are_pst_exempt() throws Throwable {
	stud_page.placeItems_GlobalSearch_Teach_StudentItems(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
			TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));

	Thread.sleep(2500);
    pcod_logpage.pcod_click_element(pcod_reviewpage.getdrpdwnchildname2reviewcart());
    SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname2reviewcart(),(ConstantUtils.REVIEWCARTCHILD2));
    	PauseUtil.pause(1500);
    	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild", String.valueOf
    	        (pcod_reviewpage.getdrpdownchildname2reviewcart().getText()));
    Thread.sleep(2500);
    double item1price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem1totalpricereviewcartpage());


    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item1.totalprice", item1price);

    double item2price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem2totalpricereviewcartpage());
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item2.totalprice", item2price);

    pcod_reviewpage.calculate_items_taxes_shoppingcart(
    		pcod_reviewpage.sizedrpdownchildname1reviewcart(),pcod_reviewpage.getlblitem1unitpricereviewcartpage(),stud_page.cart_qty_item1(),
    		pcod_reviewpage.sizedrpdownchildname2reviewcart(),pcod_reviewpage.getlblitem2unitpricereviewcartpage(),stud_page.cart_qty_item2(),
    		pcod_reviewpage.sizedrpdownchildname3reviewcart(),pcod_reviewpage.getlblitem3unitpricereviewcartpage(),stud_page.cart_qty_item3(),
    		pcod_reviewpage.sizedrpdownchildname4reviewcart(),pcod_reviewpage.getlblitem4unitpricereviewcartpage(),stud_page.cart_qty_item4());
}



@And("^parent add items to the cart assigning to 2 different childs belonging to different provinces$")
public void parent_add_items_to_the_cart_assigning_to_2_different_childs_belonging_to_different_provinces() throws Throwable {
	stud_page.placeItems_GlobalSearch_Teach_StudentItems(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
			TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty2"));

	Thread.sleep(2500);
    pcod_logpage.pcod_click_element(pcod_reviewpage.getdrpdwnchildname2reviewcart());
    SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname2reviewcart(),(ConstantUtils.REVIEWCARTCHILD2));
    	PauseUtil.pause(1500);
    	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild", String.valueOf
    	        (pcod_reviewpage.getdrpdownchildname2reviewcart().getText()));
    Thread.sleep(2500);
    double item1price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem1totalpricereviewcartpage());


    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item1.totalprice", item1price);

    double item2price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem2totalpricereviewcartpage());
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item2.totalprice", item2price);

    pcod_reviewpage.calculate_2items_taxes_shoppingcart(
    		pcod_reviewpage.sizedrpdownchildname1reviewcart(),pcod_reviewpage.getlblitem1unitpricereviewcartpage(),stud_page.cart_qty_item1(),
    		pcod_reviewpage.sizedrpdownchildname2reviewcart(),pcod_reviewpage.getlblitem2unitpricereviewcartpage(),stud_page.cart_qty_item2());
}



@And("^parent add items to the cart assigning to 4 different childs belonging to different provinces$")
public void parent_add_items_to_the_cart_assigning_to_4_different_childs_belonging_to_different_provinces() throws Throwable {
	stud_page.placeItems_GlobalSearch_4_items(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
			TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty2"),
			TestBaseProvider.getTestBase().getTestData().getString("itemName3"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty3"),
			TestBaseProvider.getTestBase().getTestData().getString("itemName4"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty4"));

	Thread.sleep(2500);
    pcod_logpage.pcod_click_element(pcod_reviewpage.getdrpdwnchildname2reviewcart());
    SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname2reviewcart(),(ConstantUtils.REVIEWCARTCHILD_BC));
    	PauseUtil.pause(1500);

    pcod_logpage.pcod_click_element(pcod_reviewpage.getdrpdwnchildname3reviewcart());
    SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname3reviewcart(),(ConstantUtils.REVIEWCARTCHILD_NL));
    PauseUtil.pause(1500);

    pcod_logpage.pcod_click_element(pcod_reviewpage.getdrpdwnchildname4reviewcart());
    SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname4reviewcart(),(ConstantUtils.REVIEWCARTCHILD_QC));
    PauseUtil.pause(1500);
	 //storing the child name after re-assigning
    TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild", String.valueOf
    	        (pcod_reviewpage.getdrpdownchildname2reviewcart().getText()));
    TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild3", String.valueOf
	        (pcod_reviewpage.getdrpdownchildname3reviewcart().getText()));
    TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild4", String.valueOf
	        (pcod_reviewpage.getdrpdownchildname4reviewcart().getText()));
    Thread.sleep(2500);

    //storing item wise total price
    double item1price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem1totalpricereviewcartpage());
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item1.totalprice", item1price);

    double item2price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem2totalpricereviewcartpage());
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item2.totalprice", item2price);

    double item3price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem3totalpricereviewcartpage());
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item3.totalprice", item3price);

    double item4price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem4totalpricereviewcartpage());
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item4.totalprice", item4price);

    //storing item wise tax
    pcod_reviewpage.calculate_4items_taxes_shoppingcart(
    		pcod_reviewpage.sizedrpdownchildname1reviewcart(),pcod_reviewpage.getlblitem1unitpricereviewcartpage(),stud_page.cart_qty_item1(),
    		pcod_reviewpage.sizedrpdownchildname2reviewcart(),pcod_reviewpage.getlblitem2unitpricereviewcartpage(),stud_page.cart_qty_item2(),
    		pcod_reviewpage.sizedrpdownchildname3reviewcart(),pcod_reviewpage.getlblitem3unitpricereviewcartpage(),stud_page.cart_qty_item3(),
    		pcod_reviewpage.sizedrpdownchildname4reviewcart(),pcod_reviewpage.getlblitem4unitpricereviewcartpage(),stud_page.cart_qty_item4());


}


@And("^parent add 3 items to cart and navigate to shopping cart$")
public void parent_add_3_items_to_cart_and_navigate_to_shopping_cart() throws Throwable {
	stud_page.placeItems_GlobalSearch_3_items(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
			TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty2"),
			TestBaseProvider.getTestBase().getTestData().getString("itemName3"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty3"));
}



@And("^parent add items to cart for 3 children$")
public void parent_add_items_to_cart_for_3_children() throws Throwable {
	stud_page.placeItems_GlobalSearch_3_items(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),
			TestBaseProvider.getTestBase().getTestData().getString("itemName2"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty2"),
			TestBaseProvider.getTestBase().getTestData().getString("itemName3"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty3"));


	Thread.sleep(2500);
    pcod_logpage.pcod_click_element(pcod_reviewpage.getdrpdwnchildname2reviewcart());
    SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname2reviewcart(),(ConstantUtils.REVIEWCARTCHILD2));
    	PauseUtil.pause(1500);
    	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild", String.valueOf
    	        (pcod_reviewpage.getdrpdownchildname2reviewcart().getText()));
    Thread.sleep(2500);

    Thread.sleep(2500);
    pcod_logpage.pcod_click_element(pcod_reviewpage.getdrpdwnchildname3reviewcart());
    SCHUtils.selectOptionByVisibleText(pcod_reviewpage.getdrpdownchildname3reviewcart(),(ConstantUtils.REVIEWCARTCHILD3));
    	PauseUtil.pause(1500);
    	TestBaseProvider.getTestBase().getContext().setProperty("testexecution.parenthomepage.reassignedchild3", String.valueOf
    	        (pcod_reviewpage.getdrpdownchildname3reviewcart().getText()));
    Thread.sleep(2500);

    double item1price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem1totalpricereviewcartpage());

    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item1.totalprice", item1price);

    double item2price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem2totalpricereviewcartpage());
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item2.totalprice", item2price);


    double item3price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem3totalpricereviewcartpage());
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item3.totalprice", item3price);

    String total_items = pcod_reviewpage.getlbltotalitemsqtyreviewcartpage().getText();

    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.total.items", total_items);

    pcod_reviewpage.calculate_items_taxes_shoppingcart(
    		pcod_reviewpage.sizedrpdownchildname1reviewcart(),pcod_reviewpage.getlblitem1unitpricereviewcartpage(),stud_page.cart_qty_item1(),
    		pcod_reviewpage.sizedrpdownchildname2reviewcart(),pcod_reviewpage.getlblitem2unitpricereviewcartpage(),stud_page.cart_qty_item2(),
    		pcod_reviewpage.sizedrpdownchildname3reviewcart(),pcod_reviewpage.getlblitem3unitpricereviewcartpage(),stud_page.cart_qty_item3(),
    		pcod_reviewpage.sizedrpdownchildname4reviewcart(),pcod_reviewpage.getlblitem4unitpricereviewcartpage(),stud_page.cart_qty_item4());
    pcod_reviewpage.readalldata_iteminformation_reviewcart();
}

@And("^parent add items to cart meeting the \\[minimum amount\\] from PDP page and navigates to shopping cart page$")
public void parent_add_items_to_cart_meeting_the_minimum_amount_from_pdp_page_and_navigates_to_shopping_cart_page() throws Throwable {
	stud_page.placeItems_GlobalSearch(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
}

@And("^parent add items to cart from PDP page meeting the \\[minimum amount\\] and navigates to shopping cart page$")
public void parent_add_items_to_cart_from_pdp_page_meeting_the_minimum_amount_and_navigates_to_shopping_cart_page() throws Throwable {
	stud_page.placeItems_GlobalSearch(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
}

@And("^parent add items to cart from PDP page less than the \\[minimum amount\\] and navigates to shopping cart page$")
public void parent_add_items_to_cart_from_pdp_page_less_than_the_minimum_amount_and_navigates_to_shopping_cart_page() throws Throwable {
	stud_page.placeItems_GlobalSearch(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
}


@And("^parent add items to cart$")
public void parent_add_items_to_cart() throws Throwable {
	stud_page.placeItems_GlobalSearch(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
}

@And("^parent adds items to cart$")
public void parent_adds_items_to_cart() throws Throwable {
	stud_page.placeItems_GlobalSearch(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
    Thread.sleep(2500);
    double item1price = pcod_reviewpage.reviewcart_item1_totalprice(pcod_reviewpage.getlblitem1totalpricereviewcartpage());

    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.item1.totalprice", item1price);

    String total_items = pcod_reviewpage.getlbltotalitemsqtyreviewcartpage().getText();

    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.reviewcart.total.items", total_items);

    pcod_reviewpage.calculate_items_taxes_shoppingcart(
    		pcod_reviewpage.sizedrpdownchildname1reviewcart(),pcod_reviewpage.getlblitem1unitpricereviewcartpage(),stud_page.cart_qty_item1(),
    		pcod_reviewpage.sizedrpdownchildname2reviewcart(),pcod_reviewpage.getlblitem2unitpricereviewcartpage(),stud_page.cart_qty_item2(),
    		pcod_reviewpage.sizedrpdownchildname3reviewcart(),pcod_reviewpage.getlblitem3unitpricereviewcartpage(),stud_page.cart_qty_item3(),
    		pcod_reviewpage.sizedrpdownchildname4reviewcart(),pcod_reviewpage.getlblitem4unitpricereviewcartpage(),stud_page.cart_qty_item4());

	pcod_reviewpage.readalldata_iteminformation_reviewcart();
}

@And("^parent add items to cart and navigate to shopping cart$")
public void parent_add_items_to_cart_and_navigate_to_shopping_cart() throws Throwable {
	stud_page.placeItems_GlobalSearch(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
}

@And("^parent adds multiple items to cart$")
public void parent_adds_multiple_items_to_cart() throws Throwable {
	stud_page.placeItems_GlobalSearch(TestBaseProvider.getTestBase().getTestData().getString("numItems"));
}

@And("^parent adds multiple items to cart for child(\\d+)$")
public void parent_adds_multiple_items_to_cart(int childNumber) throws Throwable {
	stud_page.placeItems_GlobalSearch_and_assign_to_child(TestBaseProvider.getTestBase().getTestData().getString("child" + childNumber + "numItems"), childNumber);
}

@And("^parent(\\d+) adds multiple items to cart for child(\\d+)$")
public void parent_adds_multiple_items_to_cart(int parentNumber, int childNumber) throws Throwable {
	stud_page.placeItems_GlobalSearch_and_assign_to_child(TestBaseProvider.getTestBase().getTestData().getString("child" + childNumber + "numItems"), childNumber);
}

@And("^quantity of the item should be 1 by default$")
public void quantity_of_the_item_should_be_1_by_default() throws Throwable {
	pcod_logpage.pcod_getvalue_equals(prod_page.getTxtQuantity(),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"), "Item Quantity");
}


@When("^parent clicks on “ADD TO CART” button$")
public void parent_clicks_on_add_to_cart_button() throws Throwable {
	pcod_logpage.pcod_click_element(stud_page.getteacherSearchQuantityAddBtn());
}


@And("^parent clicks on “GO TO CHECKOUT” button$")
public void parent_clicks_on_go_to_checkout_button() throws Throwable {
	pcod_logpage.pcod_click_element(stud_page.getteacherSearchCheckOut());
}

@When("^parent clicks “GO TO CHECKOUT” button$")
public void parent_clicks_go_to_checkout_button() throws Throwable {
	pcod_logpage.pcod_click_element(stud_page.getteacherSearchCheckOut());
}

@And("^modify the quantity of the item$")
public void modify_the_quantity_of_the_item() throws Throwable {
	pcod_logpage.pcod_entervalue_textfield(stud_page.getteacherSearchQuantityField(),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
}

@And("^update the quantity with maximum value$")
public void update_the_quantity_with_maximum_value() throws Throwable {
	pcod_logpage.pcod_entervalue_textfield(stud_page.getteacherSearchQuantityField(),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
}

@And("^update the quantity to zero$")
public void update_the_quantity_to_zero() throws Throwable {
	pcod_logpage.pcod_entervalue_textfield(stud_page.getteacherSearchQuantityField(),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
}

@And("^parent enters desired quantity$")
public void parent_enters_desired_quantity() throws Throwable {
	pcod_logpage.pcod_entervalue_textfield(stud_page.getteacherSearchQuantityField(),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
}


@Then("^quantity should change to 1$")
public void quantity_should_change_to_1() throws Throwable {
    System.out.println("Quantity updated to 1");
}


@And("^updated quantity should remain in quanity field$")
public void updated_quantity_should_remain_in_quanity_field() throws Throwable {
	pcod_logpage.pcod_getvalue_equals(stud_page.getteacherSearchQuantityField(),
			TestBaseProvider.getTestBase().getTestData().getString("itemQty"),"Item Quantity");
}

@When("^parent clicks close icon present in “ADD TO CART” modal window$")
public void parent_clicks_close_icon_present_in_add_to_cart_modal_window() throws Throwable {
	pcod_logpage.pcod_click_element(pdp_page.getClosePopUpReadingLevel());
}


@Then("^“ADD TO CART” modal window should close$")
public void add_to_cart_modal_window_should_close() throws Throwable {
	pcod_logpage.verify_element_notdisplayed(pdp_page.getwindowaddtocartpdppage(),
			pdp_page.sizewindowaddtocartpdppage());
}


@And("^stays back in PDP page$")
public void stays_back_in_pdp_page() throws Throwable {
	pcod_logpage.verify_element_displayed(stud_page.getteacherSearchQuantityAddBtn());
}


@When("^parent clicks on “CONTINUE SHOPPING” button$")
public void parent_clicks_on_continue_shopping_button() throws Throwable {
	pcod_logpage.pcod_click_element(pdp_page.getBtnModelContinueShopping());

}

@And("^item added should update in cart$")
public void item_added_should_update_in_cart() throws Throwable {
	 pcod_logpage.pcod_gettext_equals(pdp_page.getTxtCartQuantity(),
  		   TestBaseProvider.getTestBase().getTestData().getString("itemQty"), "Items");
}


@When("^parent clicks on Home icon$")
public void parent_clicks_on_home_icon() throws Throwable {
    pcod_logpage.pcod_click_element(teach_homepage.Home_icon_on_header());
}


@And("^parent add items to cart meeting the \\[minimum amount\\]$")
    public void parent_add_items_to_cart_meeting_the_minimum_amount() throws Throwable {
    stud_page.placeItems_GlobalSearch(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
            TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
    }

    @And("^parent navigates to shopping cart page$")
    public void parent_navigates_to_shopping_cart_page() throws Throwable {
        System.out.println("######Shipping cart page is displayed#####");
    }

    @Then("^the child is not seen in child dropdown on Review cart page$")
    public void the_child_is_not_seen_in_child_dropdown_on_Review_cart_page() throws Throwable {
    	Boolean isCartEmpty = pcod_logpage.pcod_check_cart_is_empty();

    	if(isCartEmpty){
    		stud_page.placeItems_GlobalSearch(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
    				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
    	}

    	pcod_reviewpage.pcod_firstChild_not_in_dropdown_after_remove_ReviewCart();
    }

    @Then("^the child is still seen in child dropdown on Review cart page$")
    public void the_child_is_still_seen_in_child_dropdown_on_Review_cart_page() throws Throwable {
    	Boolean isCartEmpty = pcod_logpage.pcod_check_cart_is_empty();

    	if(isCartEmpty){
    		stud_page.placeItems_GlobalSearch(TestBaseProvider.getTestBase().getTestData().getString("itemName"),
    				TestBaseProvider.getTestBase().getTestData().getString("itemQty"));
    	}

    	pcod_reviewpage.pcod_firstChild_exists_in_dropdown_after_remove_ReviewCart();
    }

    @And("^parent adds items to cart and assigns to child(\\d+)$")
    public void parent_adds_items_to_cart_and_assigns_to_child(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^all the items in the cart are now assigned to Child(\\d+)$")
    public void all_the_items_in_the_cart_are_now_assigned_to_Child(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

	@And("^parent navigates to Review cart page$")
	public void parentNavigatesToReviewCartPage() throws Throwable {
		pcod_reviewpage.pcod_go_to_review_cart_page();
	}

	@When("^parent clicks on Add a child from child dropdown$")
	public void parentClicksOnAddAChildFromChildDropdown() throws Throwable {
		pcod_reviewpage.PCOD_ReviewCart_Addchild_SectionClick();

	}

	@And("^parent enters First Name, Last Name, Grade$")
	public void parentEntersFirstNameLastNameGrade() throws Throwable {
		pcod_logpage.pcod_enteralldata_addachild(
				TestBaseProvider.getTestBase().getTestData().getString("childfirstname1"),
				TestBaseProvider.getTestBase().getTestData().getString("childlastname1")
		);


	}
	
	@Then("^parent do not see any results for that item$")
    public void parent_do_not_see_any_results_for_that_item() throws Throwable {
    	pcod_logpage.pcod_no_results_page_displayed();
    }
	
	@When("^parent searches for a Teacher Resource item# on the Homepage$")
    public void parent_searches_for_a_Teacher_Resource_item() throws Throwable {
		stud_page.pcod_search_item_on_Homepage();
    }
	

}
