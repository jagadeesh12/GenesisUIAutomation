package com.dw.automation.pages.impl;

import java.awt.AWTException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.dw.automation.pages.PCOD_IShippingAndPaymentPage;
import com.dw.automation.sections.ICreditCardAndBillingInfoSection;
import com.dw.automation.sections.base.SectionFactory;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;
import com.scholastic.torque.common.WaitUtils;

public class PCOD_ShippingAndPaymentPage extends BaseTestPage<TestPage> implements PCOD_IShippingAndPaymentPage{
	
	StudentFlyerOrdersPage stud_page = new StudentFlyerOrdersPage();
	
@FindBy(locator = "dw.pcod.payment.dropdown.paymentmethod")
private WebElement drpdownpaymentmethodpaymentpage;

@FindBy(locator = "dw.pcod.payment.section.shipping")
private WebElement sectionshippingpaymentpage;

@FindBy(locator="dw.pcod.payment.section.shipping.child2.info")
private WebElement sectionchild2infoshippingpaymentpage;

@FindBy(locator="dw.pcod.payment.section.footer")
private WebElement sectionfootorshippingpaymentpage;

@FindBy(locator = "dw.pcod.payment.section.payment")
private WebElement sectionpaymentpaymentpage;

@FindBy(locator="dw.pcod.payment.section.item1.price")
private WebElement item1pricepaymentpaymentpage;

@FindBy(locator="dw.pcod.payment.section.item1.price")
private List<WebElement> sizeitem1pricepaymentpaymentpage;

@FindBy(locator="dw.pcod.payment.section.item2.price")
private WebElement item2pricepaymentpaymentpage;

@FindBy(locator="dw.pcod.payment.section.item2.price")
private List<WebElement> sizeitem2pricepaymentpaymentpage;

@FindBy(locator="dw.pcod.payment.section.item3.price")
private WebElement item3pricepaymentpaymentpage;

@FindBy(locator="dw.pcod.payment.section.item3.price")
private List<WebElement> sizeitem3pricepaymentpaymentpage;

@FindBy(locator="dw.pcod.payment.section.item4.price")
private WebElement item4pricepaymentpaymentpage;

@FindBy(locator="dw.pcod.payment.section.item4.price")
private List<WebElement> sizeitem4pricepaymentpaymentpage;

@FindBy(locator="dw.pcod.payment.section.subtotal")
private WebElement subtotalpaymentpaymentpage;

@FindBy(locator="dw.pcod.payment.section.tax.subtotal")
private WebElement taxsubtotalpaymentpaymentpage;

@FindBy(locator="dw.pcod.payment.section.totalamountdue")
private WebElement totalamountduepaymentpaymentpage;

@FindBy(locator="dw.pcod.payment.title.paymentmethod")
private WebElement titlepaymentmehtodpaymentpage;

@FindBy(locator="dw.pcod.payment.page.savecreditcard")
private WebElement selectsavecreditcard;

@FindBy(locator="dw.pcod.payment.selectcard.dropdown.value")
private WebElement creditcarddropdownpayment;


public WebElement getdrpdownpaymentmethodpaymentpage() {
	return drpdownpaymentmethodpaymentpage;
}

public WebElement getsectionshippingpaymentpage() {
	return sectionshippingpaymentpage;
}

public WebElement getsectionchild2infoshippingpaymentpage() {
	return sectionchild2infoshippingpaymentpage;
}

public WebElement getsectionfootorshippingpaymentpage() {
	return sectionfootorshippingpaymentpage;
}

public WebElement getsectionpaymentpaymentpage() {
	return sectionpaymentpaymentpage;
}

public WebElement getselectionsaveCreditCard()
{
    return selectsavecreditcard;
}

public WebElement getitem1pricepaymentpaymentpage(){
	return item1pricepaymentpaymentpage;
}

public List<WebElement> sizeitem1pricepaymentpaymentpage(){
	return sizeitem1pricepaymentpaymentpage;
}

public WebElement getitem2pricepaymentpaymentpage(){
	return item2pricepaymentpaymentpage;
}

public List<WebElement> sizeitem2pricepaymentpaymentpage(){
	return sizeitem2pricepaymentpaymentpage;
}

public WebElement getitem3pricepaymentpaymentpage(){
	return item3pricepaymentpaymentpage;
}

public List<WebElement> sizeitem3pricepaymentpaymentpage(){
	return sizeitem3pricepaymentpaymentpage;
}

public WebElement getitem4pricepaymentpaymentpage(){
	return item4pricepaymentpaymentpage;
}

public List<WebElement> sizeitem4pricepaymentpaymentpage(){
	return sizeitem4pricepaymentpaymentpage;
}

public WebElement getsubtotalpaymentpaymentpage(){
	return subtotalpaymentpaymentpage;
}

public WebElement gettaxsubtotalpaymentpaymentpage(){
	return taxsubtotalpaymentpaymentpage;
}

public WebElement gettotalamountduepaymentpaymentpage(){
	return totalamountduepaymentpaymentpage;
}

public WebElement gettitlepaymentmehtodpaymentpage(){
	return titlepaymentmehtodpaymentpage;
}

public WebElement getcreditcarddropdownpayment(){
	return creditcarddropdownpayment;
}



@Override
public void verify_childinfo_shippingpage(Configuration testData) {
	SCHUtils.waitForLoaderToDismiss();
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(1500);
	String teach_firstname = testData.getString("teach_firstname");
	String teach_lastname = testData.getString("teach_lastname");
	String school = testData.getString("schoolname");
	String street = testData.getString("street");
	String city = testData.getString("city");
	String province = testData.getString("province");
	String postalcode = testData.getString("postalcode");
	
	String exp_schooldetails []= {teach_firstname, teach_lastname, school, street, city, province, postalcode};
	
	String schooldetails_shippingpage = getsectionshippingpaymentpage().getText();
	for(int i=0;i<exp_schooldetails.length;i++)
	{
	if(!schooldetails_shippingpage.contains(exp_schooldetails[i])){
		Assert.fail("Application Issue."+exp_schooldetails[i]+ "details is wrong in shipping & payement page");	
	}
	}
	
}

@Override
public void verify_child2info_shippingpage(Configuration testData) {
	SCHUtils.waitForLoaderToDismiss();
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(1500);
	String teach_firstname = testData.getString("child2_teach_firstname");
	String teach_lastname = testData.getString("child2_teach_lastname");
	String school = testData.getString("child2_schoolname");
	String street = testData.getString("child2_street");
	String city = testData.getString("child2_city");
	String province = testData.getString("child2_province");
	String postalcode = testData.getString("child2_postalcode");
	
	String exp_schooldetails []= {teach_firstname, teach_lastname, school, street, city, province, postalcode};
	
	String schooldetails_shippingpage1 = getsectionchild2infoshippingpaymentpage().getText();
	String schooldetails_shippingpage = schooldetails_shippingpage1.replaceAll("\\r\\n|\\r|\\n", " ");
	System.out.println("child2 info: "+schooldetails_shippingpage);
	for(int i=0;i<exp_schooldetails.length;i++)
	{
	if(!schooldetails_shippingpage.contains(exp_schooldetails[i])){
		Assert.fail("Application Issue."+exp_schooldetails[i]+ "details is wrong in shipping & payement page");	
	}
	}
	
}

@Override
public void verify_child3info_shippingpage(Configuration testData) {
	SCHUtils.waitForLoaderToDismiss();
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(1500);
	String teach_firstname = testData.getString("child3_teach_firstname");
	String teach_lastname = testData.getString("child3_teach_lastname");
	String school = testData.getString("child3_schoolname");
	String street = testData.getString("child3_street");
	String city = testData.getString("child3_city");
	String province = testData.getString("child3_province");
	String postalcode = testData.getString("child3_postalcode");
	
	String exp_schooldetails []= {teach_firstname, teach_lastname, school, street, city, province, postalcode};
	
	String schooldetails_shippingpage = getsectionshippingpaymentpage().getText();
	for(int i=0;i<exp_schooldetails.length;i++)
	{
	if(!schooldetails_shippingpage.contains(exp_schooldetails[i])){
		Assert.fail("Application Issue."+exp_schooldetails[i]+ "details is wrong in shipping & payement page");	
	}
	}
	
}



@Override
public void verify_pcod_footersection(){
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(2500);
	System.out.println("options in footer are: "+getsectionfootorshippingpaymentpage().getText().trim());
	for(int i=0;i<ConstantUtils.PCOD_FOOTERSECTION.length;i++){
		if(!getsectionfootorshippingpaymentpage().getText().trim().contains(ConstantUtils.PCOD_FOOTERSECTION[i])){
			Assert.fail("Option in the PCOD payment footer section. i.e.:" +ConstantUtils.PCOD_FOOTERSECTION[i]);
		}
	}
	
	
}


@Override
public void verify_shippingpayment_details_remainsame(){
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(2500);
	String details_shippingsection = getsectionshippingpaymentpage().getText();
	String details_paymentsection = getsectionpaymentpaymentpage().getText();
	
	String actual_details_shippingsection = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.shippingandpayment.shippingsection.info").toString();
	String actual_details_paymentsection = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.shippingandpayment.paymentsection.info").toString();
	
	Assert.assertEquals(details_shippingsection, actual_details_shippingsection, "Shipping details not remaining same");
	Assert.assertEquals(details_paymentsection, actual_details_paymentsection, "Payment details not remaining same");
}



@Override
public void pcod_addNewCreditCard(Configuration data) throws AWTException {

    ICreditCardAndBillingInfoSection fillfornewcreditcard =
            SectionFactory.getFactory().getICreditCardAndBillingInfoSection(
                    "dw.checkout.shippingandpayment.payment.creditcard.addnewcard.form");

    ICreditCardAndBillingInfoSection fillfornewcreditcardaddr =
            SectionFactory.getFactory().getICreditCardAndBillingInfoSection(
                    "dw.checkout.shippingandpayment.payment.creditcard.addnewcard.address");


    fillfornewcreditcard.fillCreditCardAndBillingInfoSection(data);
    fillfornewcreditcardaddr.fillCreditCardAddressInfoSection(data);
    PauseUtil.waitForAjaxToComplete(2000);

}

@Override
public void pcod_addNewCreditCard(Configuration data, int parentNumber) throws AWTException {

    ICreditCardAndBillingInfoSection fillfornewcreditcard =
            SectionFactory.getFactory().getICreditCardAndBillingInfoSection(
                    "dw.checkout.shippingandpayment.payment.creditcard.addnewcard.form");

    ICreditCardAndBillingInfoSection fillfornewcreditcardaddr =
            SectionFactory.getFactory().getICreditCardAndBillingInfoSection(
                    "dw.checkout.shippingandpayment.payment.creditcard.addnewcard.address");


    fillfornewcreditcard.fillCreditCardAndBillingInfoSection(data, parentNumber);
    fillfornewcreditcardaddr.fillCreditCardAddressInfoSection(data, parentNumber);
    PauseUtil.waitForAjaxToComplete(2000);

}
//this code is to not select expiry month and year
@Override
public void pcod_addNewCreditCard_ExceptExpiryMonthYear(Configuration data) throws AWTException {

    ICreditCardAndBillingInfoSection fillfornewcreditcard =
            SectionFactory.getFactory().getICreditCardAndBillingInfoSection(
                    "dw.checkout.shippingandpayment.payment.creditcard.addnewcard.form");

    ICreditCardAndBillingInfoSection fillfornewcreditcardaddr =
            SectionFactory.getFactory().getICreditCardAndBillingInfoSection(
                    "dw.checkout.shippingandpayment.payment.creditcard.addnewcard.address");


    fillfornewcreditcard.fillCreditCardAndBilling1InfoSection(data);
    fillfornewcreditcardaddr.fillCreditCardAddressInfoSection(data);
    PauseUtil.waitForAjaxToComplete(2000);

}



@Override
public void pcod_singlechild_teacherdetails(String child) throws IOException{
	
	
	String str2 = getsectionshippingpaymentpage().getText();
	String childinfo = StringUtils.substring(str2, 0);
	System.out.println("----------------------->>>>>>>>>>>>>>>>" +childinfo);
			for(int i=0;i<ConstantUtils.PCOD_CHILD1_TEACHERDETAILS.length;i++){
					if(!childinfo.contains(ConstantUtils.PCOD_CHILD1_TEACHERDETAILS[i])){
						Assert.fail("Child1 Teacher details are incorrect. i.e.:" +ConstantUtils.PCOD_CHILD1_TEACHERDETAILS[i]);
					}
				}	
}


@Override
public void pcod_child1_teacherdetails(String child) throws IOException{
	
	
	String str2 = getsectionshippingpaymentpage().getText();
	System.out.println("child1 details are:"+str2);
	String childinfo = StringUtils.substring(str2, 0);
	//String childinfo = StringUtils.substring(str2, 0, str2.indexOf(child));
	
	String PCOD_CHILD1_TEACHERDETAILS [] = 
    	{TestBaseProvider.getTestBase().getTestData().getString("teach_firstname"),
    		TestBaseProvider.getTestBase().getTestData().getString("teach_lastname"),
    		TestBaseProvider.getTestBase().getTestData().getString("schoolname"), 
    		TestBaseProvider.getTestBase().getTestData().getString("street"), 
    		TestBaseProvider.getTestBase().getTestData().getString("city"), 
    		TestBaseProvider.getTestBase().getTestData().getString("province"), 
    		TestBaseProvider.getTestBase().getTestData().getString("postalcode")};
	System.out.println("----------------------->>>>>>>>>>>>>>>>" +childinfo);
			for(int i=0;i<PCOD_CHILD1_TEACHERDETAILS.length;i++){
					if(!childinfo.contains(PCOD_CHILD1_TEACHERDETAILS[i])){
						Assert.fail("Child1 Teacher details are incorrect. i.e.:" +PCOD_CHILD1_TEACHERDETAILS[i]);
					}
				}	
}

@Override
public void pcod_child2_teacherdetails(String child) throws IOException{
	
	
	String str2 = getsectionshippingpaymentpage().getText();
	String childinfo = StringUtils.substring(str2, str2.indexOf(child),str2.length());
	String PCOD_CHILD2_TEACHERDETAILS [] = 
    	{TestBaseProvider.getTestBase().getTestData().getString("child2_teach_firstname"),
    		TestBaseProvider.getTestBase().getTestData().getString("child2_teach_lastname"),
    		TestBaseProvider.getTestBase().getTestData().getString("child2_schoolname"), 
    		TestBaseProvider.getTestBase().getTestData().getString("child2_street"),
    		TestBaseProvider.getTestBase().getTestData().getString("child2_city"), 
    		TestBaseProvider.getTestBase().getTestData().getString("child2_province"), 
    		TestBaseProvider.getTestBase().getTestData().getString("child2_postalcode")}; 
		for(int i=0;i<PCOD_CHILD2_TEACHERDETAILS.length;i++){
				if(!childinfo.contains(PCOD_CHILD2_TEACHERDETAILS[i])){
					Assert.fail("Child2 Teacher details are incorrect. i.e.:" +PCOD_CHILD2_TEACHERDETAILS[i]);
				}	
		    }	
}

@Override
public void pcod_child3_teacherdetails(String child) throws IOException{
	
	
	String str2 = getsectionshippingpaymentpage().getText();
	String childinfo = StringUtils.substring(str2, str2.indexOf(child),str2.length());
	String PCOD_CHILD3_TEACHERDETAILS [] = 
    	{TestBaseProvider.getTestBase().getTestData().getString("child23teach_firstname"),
    		TestBaseProvider.getTestBase().getTestData().getString("child3_teach_lastname"),
    		TestBaseProvider.getTestBase().getTestData().getString("child3_schoolname"), 
    		TestBaseProvider.getTestBase().getTestData().getString("child3_street"),
    		TestBaseProvider.getTestBase().getTestData().getString("child3_city"), 
    		TestBaseProvider.getTestBase().getTestData().getString("child3_province"), 
    		TestBaseProvider.getTestBase().getTestData().getString("child3_postalcode")};
	for(int i=0;i<PCOD_CHILD3_TEACHERDETAILS.length;i++){
		if(!childinfo.contains(PCOD_CHILD3_TEACHERDETAILS[i])){
			Assert.fail("Child3 Teacher details are incorrect. i.e.:" +PCOD_CHILD3_TEACHERDETAILS[i]);
		}	
    }
	
}

    @Override
    public void clickpcod_shippingpayment_saveCreditCard() {
        selectsavecreditcard.click();
    }
    
@Override
public void verify_itemwise_totalprice_paymentpage(List<WebElement> item1size, WebElement item1, 
		List<WebElement> item2size, WebElement item2, List<WebElement> item3size, WebElement item3,
		List<WebElement> item4size, WebElement item4) {
	
	//verifying item1 price in payment page
	if(item1size.size()!=0){
	String actual_item1price12 = TestBaseProvider.getTestBase().getContext()
            .getProperty("testexecution.reviewcart.item1.totalprice").toString();
    double actual_item1price = Double.parseDouble(actual_item1price12);
    System.out.println("item1 total in review cart page is: "+actual_item1price);
    
    String exp_item1price12 = item1.getText();
    String exp_item1price1 = exp_item1price12.substring(1);
    double exp_item1price = Double.parseDouble(exp_item1price1);
    System.out.println("item1 total in payment page is: "+exp_item1price);
    Assert.assertEquals(actual_item1price, exp_item1price,"Item1 Price in Payment page is not correct");
	}
	
	
	//verifying item2 price in payment page
	if(item2size.size()!=0){
	String actual_item2price12 = TestBaseProvider.getTestBase().getContext()
            .getProperty("testexecution.reviewcart.item2.totalprice").toString();
    double actual_item2price = Double.parseDouble(actual_item2price12);
    System.out.println("item2 total in review cart page is: "+actual_item2price);
    
    String exp_item2price12 = item2.getText();
    String exp_item2price1 = exp_item2price12.substring(1);
    double exp_item2price = Double.parseDouble(exp_item2price1);
    System.out.println("item2 total in payment page is: "+exp_item2price);
    Assert.assertEquals(actual_item2price, exp_item2price,"Item2 Price in Payment page is not correct");
	}
	
	
	//verifying item3 price in payment page
	if(item3size.size()!=0){
	String actual_item3price12 = TestBaseProvider.getTestBase().getContext()
            .getProperty("testexecution.reviewcart.item3.totalprice").toString();
    double actual_item3price = Double.parseDouble(actual_item3price12);
    
    String exp_item3price12 = item3.getText();
    String exp_item3price1 = exp_item3price12.substring(1);
    double exp_item3price = Double.parseDouble(exp_item3price1);
    Assert.assertEquals(actual_item3price, exp_item3price,"Item3 Price in Payment page is not correct");
	}
	
	
	//verifying item4 price in payment page
	if(item4size.size()!=0){
	String actual_item4price12 = TestBaseProvider.getTestBase().getContext()
            .getProperty("testexecution.reviewcart.item4.totalprice").toString();
    double actual_item4price = Double.parseDouble(actual_item4price12);
    
    String exp_item4price12 = item4.getText();
    String exp_item4price1 = exp_item4price12.substring(1);
    double exp_item4price = Double.parseDouble(exp_item4price1);
    Assert.assertEquals(actual_item4price, exp_item4price,"Item4 Price in Payment page is not correct");
	}
	
	
}



@Override
public void verify_items_subtotal_paymentpage(List<WebElement> item1size, WebElement item1, 
		List<WebElement> item2size, WebElement item2, List<WebElement> item3size, WebElement item3,
		List<WebElement> item4size, WebElement item4, WebElement items_subtotal) {
	
	
	//verifying subtotal if there are 4 childs in payment page
		if(item4size.size()!=0){
			
		String exp_item1price12 = item1.getText();
	    String exp_item1price1 = exp_item1price12.substring(1);
	    double exp_item1price = Double.parseDouble(exp_item1price1);	
	    
	    String exp_item2price12 = item2.getText();
	    String exp_item2price1 = exp_item2price12.substring(1);
	    double exp_item2price = Double.parseDouble(exp_item2price1);
	    
	    String exp_item3price12 = item3.getText();
	    String exp_item3price1 = exp_item3price12.substring(1);
	    double exp_item3price = Double.parseDouble(exp_item3price1);
			
		String exp_item4price12 = item4.getText();
	    String exp_item4price1 = exp_item4price12.substring(1);
	    double exp_item4price = Double.parseDouble(exp_item4price1);
	    
	    double exp_items_subtotal = exp_item1price+exp_item2price+exp_item3price+exp_item4price;
	    exp_items_subtotal = Double.parseDouble(new DecimalFormat("##.##").format(exp_items_subtotal));
	    
	    String act_items_subtotal12 = items_subtotal.getText();
	    String act_items_subtotal1 = act_items_subtotal12.substring(1);
	    double act_items_subtotal = Double.parseDouble(act_items_subtotal1);
	    
	    
	    
	    Assert.assertEquals(act_items_subtotal, exp_items_subtotal,"Subtotal in Payment page is not correct");
		}
		
		
		
		//verifying subtotal if there are 3 childs in payment page
		else if(item3size.size()!=0){
					
				String exp_item1price12 = item1.getText();
			    String exp_item1price1 = exp_item1price12.substring(1);
			    double exp_item1price = Double.parseDouble(exp_item1price1);
			    System.out.println("child1 price:"+ exp_item1price);
			    
			    String exp_item2price12 = item2.getText();
			    String exp_item2price1 = exp_item2price12.substring(1);
			    double exp_item2price = Double.parseDouble(exp_item2price1);
			    System.out.println("child1 price:"+ exp_item2price);
			    
			    String exp_item3price12 = item3.getText();
			    String exp_item3price1 = exp_item3price12.substring(1);
			    double exp_item3price = Double.parseDouble(exp_item3price1);
			    System.out.println("child1 price:"+ exp_item3price);
			    
			    double exp_items_subtotal = exp_item1price+exp_item2price+exp_item3price;
			    exp_items_subtotal = Double.parseDouble(new DecimalFormat("##.##").format(exp_items_subtotal));
			    System.out.println("expected price for childs is:"+ exp_items_subtotal);
			    
			    
			    String act_items_subtotal12 = items_subtotal.getText();
			    String act_items_subtotal1 = act_items_subtotal12.substring(1);
			    double act_items_subtotal = Double.parseDouble(act_items_subtotal1);
			    
			    
			    
			    Assert.assertEquals(act_items_subtotal, exp_items_subtotal,"Subtotal in Payment page is not correct");
				}
		
		
		//verifying subtotal if there are 2 childs in payment page
				else if(item2size.size()!=0){
							
						String exp_item1price12 = item1.getText();
					    String exp_item1price1 = exp_item1price12.substring(1);
					    double exp_item1price = Double.parseDouble(exp_item1price1);	
					    
					    String exp_item2price12 = item2.getText();
					    String exp_item2price1 = exp_item2price12.substring(1);
					    double exp_item2price = Double.parseDouble(exp_item2price1);
					    
					    double exp_items_subtotal = exp_item1price+exp_item2price;
					    exp_items_subtotal = Double.parseDouble(new DecimalFormat("##.##").format(exp_items_subtotal));
					    
					    
					    String act_items_subtotal12 = items_subtotal.getText();
					    String act_items_subtotal1 = act_items_subtotal12.substring(1);
					    double act_items_subtotal = Double.parseDouble(act_items_subtotal1);
					    
					    
					    
					    Assert.assertEquals(act_items_subtotal, exp_items_subtotal,"Subtotal in Payment page is not correct");
						}
		
		//verifying subtotal if there are 1 child in payment page
				else if(item1size.size()!=0){
							
						String exp_item1price12 = item1.getText();
					    String exp_item1price1 = exp_item1price12.substring(1);
					    double exp_item1price = Double.parseDouble(exp_item1price1);
					    
					    double exp_items_subtotal = exp_item1price;
					    exp_items_subtotal = Double.parseDouble(new DecimalFormat("##.##").format(exp_items_subtotal));
					    
					    
					    String act_items_subtotal12 = items_subtotal.getText();
					    String act_items_subtotal1 = act_items_subtotal12.substring(1);
					    double act_items_subtotal = Double.parseDouble(act_items_subtotal1);
					    
					    
					    
					    Assert.assertEquals(act_items_subtotal, exp_items_subtotal,"Subtotal in Payment page is not correct");
						}	
	
          }


@Override
public void verify_items_GST_taxes_shoppingcart(List<WebElement> item1size, WebElement item1,WebElement qty1, 
		List<WebElement> item2size, WebElement item2,WebElement qty2, List<WebElement> item3size, WebElement item3,WebElement qty3,
		List<WebElement> item4size, WebElement item4, WebElement qty4){
	
	       //verifying tax for GST if there are 4 childs in payment page
			if(item4size.size()!=0){
				
			int stateTax=TestBaseProvider.getTestBase().getTestData().getInt("tax");
			
			String value1=item1.getText();
			value1=value1.trim();
			String ele1=qty1.getText();
			ele1=ele1.trim();
			value1 = value1.substring(1);
			double d1=Double.parseDouble(value1);
			System.out.println("#############>"+d1);
			int a1=Integer.parseInt(ele1);
			System.out.println("%%%%%%%%%%%%>"+a1);
			
			String value2=item2.getText();
			value2=value2.trim();
			String ele2=qty2.getText();
			ele2=ele2.trim();
			value2 = value2.substring(1);
			double d2=Double.parseDouble(value2);
			System.out.println("#############>"+d2);
			int a2=Integer.parseInt(ele2);
			System.out.println("%%%%%%%%%%%%>"+a2);

			String value3=item3.getText();
			value3=value3.trim();
			String ele3=qty3.getText();
			ele3=ele3.trim();
			value3 = value3.substring(1);
			double d3=Double.parseDouble(value3);
			System.out.println("#############>"+d3);
			int a3=Integer.parseInt(ele3);
			System.out.println("%%%%%%%%%%%%>"+a3);
			
			
			String value4=item4.getText();
			value4=value4.trim();
			String ele4=qty4.getText();
			ele4=ele4.trim();
			value4 = value4.substring(1);
			double d4=Double.parseDouble(value4);
			System.out.println("#############>"+d4);
			int a4=Integer.parseInt(ele4);
			System.out.println("%%%%%%%%%%%%>"+a4);
			
			
			
			double tax_gst_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2)+
					stud_page.TaxRoundOff_item_3_Tax(stateTax, d3, a3) + stud_page.TaxRoundOff_item_4_Tax(stateTax, d4, a4);
			tax_gst_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_gst_exp));
			
			TestBaseProvider.getTestBase().getContext()
			.setProperty("testexecution.reviewcart.freepick.resultsize.page1", tax_gst_exp);
			
			
			
			}
			
			
			
			 //verifying tax for GST if there are 3 childs in payment page
			else if(item3size.size()!=0){
				int stateTax=TestBaseProvider.getTestBase().getTestData().getInt("tax");
				
				String value1=item1.getText();
				value1=value1.trim();
				String ele1=qty1.getText();
				ele1=ele1.trim();
				value1 = value1.substring(1);
				double d1=Double.parseDouble(value1);
				System.out.println("#############>"+d1);
				int a1=Integer.parseInt(ele1);
				System.out.println("%%%%%%%%%%%%>"+a1);
				
				String value2=item2.getText();
				value2=value2.trim();
				String ele2=qty2.getText();
				ele2=ele2.trim();
				value2 = value2.substring(1);
				double d2=Double.parseDouble(value2);
				System.out.println("#############>"+d2);
				int a2=Integer.parseInt(ele2);
				System.out.println("%%%%%%%%%%%%>"+a2);

				String value3=item3.getText();
				value3=value3.trim();
				String ele3=qty3.getText();
				ele3=ele3.trim();
				value3 = value3.substring(1);
				double d3=Double.parseDouble(value3);
				System.out.println("#############>"+d3);
				int a3=Integer.parseInt(ele3);
				System.out.println("%%%%%%%%%%%%>"+a3);
				
				
				
				double tax_gst_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2)+
						stud_page.TaxRoundOff_item_3_Tax(stateTax, d3, a3);
				tax_gst_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_gst_exp));
					}
			
			
		//verifying tax for GST if there are 2 childs in payment page
	    else if(item2size.size()!=0){
								
		int stateTax=TestBaseProvider.getTestBase().getTestData().getInt("tax");
		
		String value1=item1.getText();
		value1=value1.trim();
		String ele1=qty1.getText();
		ele1=ele1.trim();
		value1 = value1.substring(1);
		double d1=Double.parseDouble(value1);
		System.out.println("#############>"+d1);
		int a1=Integer.parseInt(ele1);
		System.out.println("%%%%%%%%%%%%>"+a1);
		
		String value2=item2.getText();
		value2=value2.trim();
		String ele2=qty2.getText();
		ele2=ele2.trim();
		value2 = value2.substring(1);
		double d2=Double.parseDouble(value2);
		System.out.println("#############>"+d2);
		int a2=Integer.parseInt(ele2);
		System.out.println("%%%%%%%%%%%%>"+a2);
		
		
		
		double tax_gst_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1)+stud_page.TaxRoundOff_item_2_Tax(stateTax, d2, a2);
		tax_gst_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_gst_exp));
							}
			
	    //verifying tax for GST if there are 1 child in payment page
		else if(item1size.size()!=0){
								
	    int stateTax=TestBaseProvider.getTestBase().getTestData().getInt("tax");
							
		String value1=item1.getText();
		value1=value1.trim();
		String ele1=qty1.getText();
		ele1=ele1.trim();
		value1 = value1.substring(1);
		double d1=Double.parseDouble(value1);
		System.out.println("#############>"+d1);
		int a1=Integer.parseInt(ele1);
		System.out.println("%%%%%%%%%%%%>"+a1);
	
	
	
	double tax_gst_exp=stud_page.TaxRoundOff_item_1_Tax(stateTax, d1, a1);
	tax_gst_exp =Double.parseDouble(new DecimalFormat("##.##").format(tax_gst_exp));
							}	
	
	
	
	
}



@Override
public void verify_items_totalamountdue_paymentpage(WebElement items_subtotal, WebElement items_tax_subtotal, WebElement items_totalamtdue) {
	
	String exp_subtotal12 = items_subtotal.getText();
    String exp_subtotal1 = exp_subtotal12.substring(1);
    double exp_subtotal = Double.parseDouble(exp_subtotal1);
    
    String exp_tax_subtotal12 = items_tax_subtotal.getText();
    String exp_tax_subtotal1 = exp_tax_subtotal12.substring(1);
    double exp_tax_subtotal = Double.parseDouble(exp_tax_subtotal1);
    
    
    double exp_total_amt_due = exp_subtotal+exp_tax_subtotal;
    exp_total_amt_due = Double.parseDouble(new DecimalFormat("##.##").format(exp_total_amt_due));
    
    
    String act_items_totalamtdue12 = items_totalamtdue.getText();
    String act_items_totalamtdue1 = act_items_totalamtdue12.substring(1);
    double act_items_totalamtdue = Double.parseDouble(act_items_totalamtdue1);
    
    Assert.assertEquals(act_items_totalamtdue, exp_total_amt_due,"Total Amount Due in Payment page is not correct");
	
	
          }


public double totalamountdue_paymentpage(WebElement items_subtotal, WebElement items_tax_subtotal, WebElement items_totalamtdue) {
	
	String exp_subtotal12 = items_subtotal.getText();
    String exp_subtotal1 = exp_subtotal12.substring(1);
    double exp_subtotal = Double.parseDouble(exp_subtotal1);
    
    String exp_tax_subtotal12 = items_tax_subtotal.getText();
    String exp_tax_subtotal1 = exp_tax_subtotal12.substring(1);
    double exp_tax_subtotal = Double.parseDouble(exp_tax_subtotal1);
    
    
    double exp_total_amt_due = exp_subtotal+exp_tax_subtotal;
    exp_total_amt_due = Double.parseDouble(new DecimalFormat("##.##").format(exp_total_amt_due));
    
    
    String act_items_totalamtdue12 = items_totalamtdue.getText();
    String act_items_totalamtdue1 = act_items_totalamtdue12.substring(1);
    double act_items_totalamtdue = Double.parseDouble(act_items_totalamtdue1);
    
    return act_items_totalamtdue;
	
	
          }


@Override
public void verify_items_subtotal_tax_paymentpage(WebElement tax_subtotal) {
    
	String exp_items_tax_subtotal12 = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.items.taxes").toString();
	
    double exp_items_tax_subtotal = Double.parseDouble(exp_items_tax_subtotal12);
    
    
    String act_items_tax_subtotal12 = tax_subtotal.getText();
    String act_items_tax_subtotal1 = act_items_tax_subtotal12.substring(1);
    double act_items_tax_subtotal = Double.parseDouble(act_items_tax_subtotal1);
    System.out.println("exp_items_tax_subtotal is : "+exp_items_tax_subtotal);
    System.out.println("act_items_tax_subtotal is : "+act_items_tax_subtotal);
    Assert.assertEquals(act_items_tax_subtotal, exp_items_tax_subtotal,"Taxes are not correct in Payment page");
	
	
          }



@Override
public void verify_items_subtotal_tax_2Provinces_paymentpage(WebElement tax_subtotal) {
    
	String exp_item1_tax_subtotal12 = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.taxes").toString();
	
    double exp_item1_tax_subtotal = Double.parseDouble(exp_item1_tax_subtotal12);
    
    
String exp_item2_tax_subtotal12 = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.taxes").toString();
	
    double exp_item2_tax_subtotal = Double.parseDouble(exp_item2_tax_subtotal12);
    
    double exp_items_tax_subtotal = exp_item1_tax_subtotal+exp_item2_tax_subtotal;
    
    
    String act_items_tax_subtotal12 = tax_subtotal.getText();
    String act_items_tax_subtotal1 = act_items_tax_subtotal12.substring(1);
    double act_items_tax_subtotal = Double.parseDouble(act_items_tax_subtotal1);
    
    Assert.assertEquals(act_items_tax_subtotal, exp_items_tax_subtotal,"Taxes are not correct in Payment page");
	
	
          }


@Override
public void verify_items_subtotal_tax_4Provinces_paymentpage(WebElement tax_subtotal) {
    
	String exp_item1_tax_subtotal12 = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.taxes").toString();
	double exp_item1_tax_subtotal = Double.parseDouble(exp_item1_tax_subtotal12);
    
    String exp_item2_tax_subtotal12 = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.taxes").toString();
	double exp_item2_tax_subtotal = Double.parseDouble(exp_item2_tax_subtotal12);
    
    String exp_item3_tax_subtotal12 = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.taxes").toString();
	double exp_item3_tax_subtotal = Double.parseDouble(exp_item3_tax_subtotal12);
	
	String exp_item4_tax_subtotal12 = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item4.taxes").toString();
	double exp_item4_tax_subtotal = Double.parseDouble(exp_item4_tax_subtotal12);
    
    double exp_items_tax_subtotal = exp_item1_tax_subtotal+exp_item2_tax_subtotal+exp_item3_tax_subtotal+exp_item4_tax_subtotal;
    
    
    String act_items_tax_subtotal12 = tax_subtotal.getText();
    String act_items_tax_subtotal1 = act_items_tax_subtotal12.substring(1);
    double act_items_tax_subtotal = Double.parseDouble(act_items_tax_subtotal1);
    
    Assert.assertEquals(act_items_tax_subtotal, exp_items_tax_subtotal,"Taxes are not correct in Payment page");
	
	
          }


       @Override
public void openPage() {
	PCOD_LoginPage pcodlogpage= new PCOD_LoginPage();
	if (TestBaseProvider.getTestBase().getContext().getString("driver.name")
			.equals("Android")) {
		PauseUtil.pause(10000);
		WebElement el = TestBaseProvider.getTestBase().getDriver()
				.findElement(By.xpath("//button[@title='Close']"));
		PauseUtil.pause(15000);
		if (el.isDisplayed()) {
			el.click();
			WaitUtils.waitForEnabled(pcodlogpage.getTxtUsername());
		}
	}

}
    @FindBy(locator="dw.paymentpage.selectacard")
    private WebElement savedcardlist;

    @Override
    public WebElement getsavedcardlist() {
        return savedcardlist;
    }

    @Override
    public void verifysavedCard_paymentpage(String card){
        Select select = new Select (getsavedcardlist());
        String flag = "False";
        List<WebElement> allcards = select.getOptions();
        for(int i=0;i<allcards.size();i++){
            String cardvalue = allcards.get(i).getText();
            System.out.println(">>>>>>value"+cardvalue);
            if(cardvalue.contains(card))
            {
                System.out.println(card);
                Assert.assertEquals(true,true,"Credit Card is saved");
                flag = "True";
                break;
            }
        }
        if(flag.equals("False")){
            Assert.fail("Credit Card not saved");
        }
    }


}
