package com.dw.automation.pages.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.dw.automation.pages.PCOD_ISubmitYourOrderPage;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;
import com.scholastic.torque.common.WaitUtils;

public class PCOD_SubmitYourOrderPage extends BaseTestPage<TestPage> implements PCOD_ISubmitYourOrderPage{
	
@FindBy(locator = "dw.pcod.submityourorder.section.header")
private WebElement headersubmityourorderpage;

@FindBy(locator = "dw.pcod.submityourorder.section.header")
private List<WebElement> sizeheadersubmityourorderpage;

@FindBy(locator = "dw.pcod.submityourorder.stepheader.submityourorder")
private WebElement headersubmityourordersubmityourorderpage;

@FindBy(locator = "dw.pcod.submityourorder.stepheader.shippingandpayment")
private WebElement headershippingandpaymentsubmityourorderpage;

@FindBy(locator = "dw.pcod.submityourorder.titleofpage.belowstepheader")
private WebElement headerbelowstepheadersubmityourorderpage;

@FindBy(locator = "dw.pcod.pagetitle.confirmSubmit")
private WebElement pagetitleconfirmsubmit;

@FindBy(locator = "dw.pcod.conifrmsubmitpage.button.submitorder")
private WebElement buttonSubmitOrder;

@FindBy(locator = "dw.pcod.orderconfirmationpage.title")
private WebElement pagetitleorderconfirmpage;

@FindBy(locator = "dw.pcod.submityourorder.paymentsection")
private WebElement paymentsectionsubmityourorderpage;

@FindBy(locator = "dw.pcod.submityourorder.paymentsection.credicardnumber")
private WebElement paymentsectioncreditcardnumbersubmityourorderpage;

@FindBy(locator = "dw.pcod.submityourorder.paymentsection.totalamount")
private WebElement paymentsectiontotalamountsubmityourorderpage;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.child.header.size")
private List<WebElement> sizeheaderchildorderdetailsubmityourorderpage;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.child1.header")
private WebElement headerchild1orderdetailsubmityourorderpage;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.child2.header")
private WebElement headerchild2orderdetailsubmityourorderpage;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.child3.header")
private WebElement headerchild3orderdetailsubmityourorderpage;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.child4.header")
private WebElement headerchild4orderdetailsubmityourorderpage;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.tablesize")
private List<WebElement> sizetableorderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.trsize")
private List<WebElement> sizetrtableorderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table1.trsize")
private List<WebElement> sizetable1trsizeorderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table2.trsize")
private List<WebElement> sizetable2trsizeorderdetailsubmityourorder;



@FindBy(locator="dw.pcod.submityourorder.orderdetail.table1.item1.image")
private WebElement imagetable1item1orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table1.item2.image")
private WebElement imagetable1item2orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table1.item3.image")
private WebElement imagetable1item3orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table1.item4.image")
private WebElement imagetable1item4orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table2.item1.image")
private WebElement imagetable2item1orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table2.item2.image")
private WebElement imagetable2item2orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table2.item3.image")
private WebElement imagetable2item3orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table2.item4.image")
private WebElement imagetable2item4orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table3.item1.image")
private WebElement imagetable3item1orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table3.item2.image")
private WebElement imagetable3item2orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table3.item3.image")
private WebElement imagetable3item3orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table3.item4.image")
private WebElement imagetable3item4orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table4.item1.image")
private WebElement imagetable4item1orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table4.item2.image")
private WebElement imagetable4item2orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table4.item3.image")
private WebElement imagetable4item3orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table4.item4.image")
private WebElement imagetable4item4orderdetailsubmityourorder;



@FindBy(locator="dw.pcod.submityourorder.orderdetail.table1.item1.itemdetails")
private WebElement itemdetailstable1item1orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table1.item2.itemdetails")
private WebElement itemdetailstable1item2orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table1.item3.itemdetails")
private WebElement itemdetailstable1item3orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table1.item4.itemdetails")
private WebElement itemdetailstable1item4orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table2.item1.itemdetails")
private WebElement itemdetailstable2item1orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table2.item2.itemdetails")
private WebElement itemdetailstable2item2orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table2.item3.itemdetails")
private WebElement itemdetailstable2item3orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table2.item4.itemdetails")
private WebElement itemdetailstable2item4orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table3.item1.itemdetails")
private WebElement itemdetailstable3item1orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table3.item2.itemdetails")
private WebElement itemdetailstable3item2orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table3.item3.itemdetails")
private WebElement itemdetailstable3item3orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table3.item4.itemdetails")
private WebElement itemdetailstable3item4orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table4.item1.itemdetails")
private WebElement itemdetailstable4item1orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table4.item2.itemdetails")
private WebElement itemdetailstable4item2orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table4.item3.itemdetails")
private WebElement itemdetailstable4item3orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table4.item4.itemdetails")
private WebElement itemdetailstable4item4orderdetailsubmityourorder;



@FindBy(locator="dw.pcod.submityourorder.orderdetail.table1.item1.qty")
private WebElement qtytable1item1orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table1.item2.qty")
private WebElement qtytable1item2orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table1.item3.qty")
private WebElement qtytable1item3orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table1.item4.qty")
private WebElement qtytable1item4orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table2.item1.qty")
private WebElement qtytable2item1orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table2.item2.qty")
private WebElement qtytable2item2orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table2.item3.qty")
private WebElement qtytable2item3orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table2.item4.qty")
private WebElement qtytable2item4orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table3.item1.qty")
private WebElement qtytable3item1orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table3.item2.qty")
private WebElement qtytable3item2orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table3.item3.qty")
private WebElement qtytable3item3orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table3.item4.qty")
private WebElement qtytable3item4orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table4.item1.qty")
private WebElement qtytable4item1orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table4.item2.qty")
private WebElement qtytable4item2orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table4.item3.qty")
private WebElement qtytable4item3orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table4.item4.qty")
private WebElement qtytable4item4orderdetailsubmityourorder;


@FindBy(locator="dw.pcod.submityourorder.orderdetail.table1.item1.total")
private WebElement totaltable1item1orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table1.item2.total")
private WebElement totaltable1item2orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table1.item3.total")
private WebElement totaltable1item3orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table1.item4.total")
private WebElement totaltable1item4orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table2.item1.total")
private WebElement totaltable2item1orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table2.item2.total")
private WebElement totaltable2item2orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table2.item3.total")
private WebElement totaltable2item3orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table2.item4.total")
private WebElement totaltable2item4orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table3.item1.total")
private WebElement totaltable3item1orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table3.item2.total")
private WebElement totaltable3item2orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table3.item3.total")
private WebElement totaltable3item3orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table3.item4.total")
private WebElement totaltable3item4orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table4.item1.total")
private WebElement totaltable4item1orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table4.item2.total")
private WebElement totaltable4item2orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table4.item3.total")
private WebElement totaltable4item3orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.orderdetail.table4.item4.total")
private WebElement totaltable4item4orderdetailsubmityourorder;

@FindBy(locator="dw.pcod.submityourorder.totalitems")
private WebElement totalitemssubmityourorderpage;

@FindBy(locator="dw.pcod.orderconfirmationpage.contentasset")
private WebElement contentassetconfirmationpage;

@FindBy(locator="dw.pcod.confirmationpage.ordernumber")
private WebElement ordernumberconfirmationpage;

@FindBy(locator="dw.pcod.confirmationpage.homeicon")
private WebElement homeiconconfirmationpage;

@FindBy(locator="dw.pcod.confirmationpage.myaccount.dropdown")
private WebElement confirmpagemyaccountdrpdown;

@FindBy(locator="dw.pcod.confirmationpage.myaccount.dropdown.logout")
private WebElement confirmpagemyaccountdrpdownlogout;

public WebElement getheadersubmityourorderpage() {
	return headersubmityourorderpage;
}

public WebElement geconfirmpagemyaccountdrpdown() {
	return confirmpagemyaccountdrpdown;
}

public WebElement getconfirmpagemyaccountdrpdownlogout() {
	return confirmpagemyaccountdrpdownlogout;
}

public List<WebElement> sizeheadersubmityourorderpage() {
	return sizeheadersubmityourorderpage;
}

public WebElement getheadersubmityourordersubmityourorderpage(){
	return headersubmityourordersubmityourorderpage;
}

public WebElement getheadershippingandpaymentsubmityourorderpage(){
	return headershippingandpaymentsubmityourorderpage;
}

public WebElement getheaderbelowstepheadersubmityourorderpage(){
	return headerbelowstepheadersubmityourorderpage;
}

public WebElement getpaymentsectionsubmityourorderpage(){
	return paymentsectionsubmityourorderpage;
}

public WebElement getpaymentsectioncreditcardnumbersubmityourorderpage(){
	return paymentsectioncreditcardnumbersubmityourorderpage;
}

public WebElement getpaymentsectiontotalamountsubmityourorderpage(){
	return paymentsectiontotalamountsubmityourorderpage;
}

public WebElement getheaderchild1orderdetailsubmityourorderpage(){
	return headerchild1orderdetailsubmityourorderpage;
}

public WebElement getheaderchild2orderdetailsubmityourorderpage(){
	return headerchild2orderdetailsubmityourorderpage;
}

public WebElement getheaderchild3orderdetailsubmityourorderpage(){
	return headerchild3orderdetailsubmityourorderpage;
}

public WebElement getheaderchild4orderdetailsubmityourorderpage(){
	return headerchild4orderdetailsubmityourorderpage;
}

public List<WebElement> sizeheaderchildorderdetailsubmityourorderpage(){
	return sizeheaderchildorderdetailsubmityourorderpage;
}

public List<WebElement> sizetableorderdetailsubmityourorder(){
	return sizetableorderdetailsubmityourorder;
}

public List<WebElement> sizetrtableorderdetailsubmityourorder(){
	return sizetrtableorderdetailsubmityourorder;
}

public List<WebElement> table1rowsizeorderdetailsubmityourorder(){
	return sizetable1trsizeorderdetailsubmityourorder;
}

public List<WebElement> table2rowsizeorderdetailsubmityourorder(){
	return sizetable2trsizeorderdetailsubmityourorder;
}

public WebElement getimagetable1item1orderdetailsubmityourorder(){
	return imagetable1item1orderdetailsubmityourorder;
}

public WebElement getimagetable1item2orderdetailsubmityourorder(){
	return imagetable1item2orderdetailsubmityourorder;
}

public WebElement getimagetable1item3orderdetailsubmityourorder(){
	return imagetable1item3orderdetailsubmityourorder;
}

public WebElement getimagetable1item4orderdetailsubmityourorder(){
	return imagetable1item4orderdetailsubmityourorder;
}

public WebElement getimagetable2item1orderdetailsubmityourorder(){
	return imagetable2item1orderdetailsubmityourorder;
}

public WebElement getimagetable2item2orderdetailsubmityourorder(){
	return imagetable2item2orderdetailsubmityourorder;
}

public WebElement getimagetable2item3orderdetailsubmityourorder(){
	return imagetable2item3orderdetailsubmityourorder;
}

public WebElement getimagetable2item4orderdetailsubmityourorder(){
	return imagetable2item4orderdetailsubmityourorder;
}

public WebElement getimagetable3item1orderdetailsubmityourorder(){
	return imagetable3item1orderdetailsubmityourorder;
}

public WebElement getimagetable3item2orderdetailsubmityourorder(){
	return imagetable3item2orderdetailsubmityourorder;
}

public WebElement getimagetable3item3orderdetailsubmityourorder(){
	return imagetable3item3orderdetailsubmityourorder;
}

public WebElement getimagetable3item4orderdetailsubmityourorder(){
	return imagetable3item4orderdetailsubmityourorder;
}

public WebElement getimagetable4item1orderdetailsubmityourorder(){
	return imagetable4item1orderdetailsubmityourorder;
}

public WebElement getimagetable4item2orderdetailsubmityourorder(){
	return imagetable4item2orderdetailsubmityourorder;
}

public WebElement getimagetable4item3orderdetailsubmityourorder(){
	return imagetable4item3orderdetailsubmityourorder;
}

public WebElement getimagetable4item4orderdetailsubmityourorder(){
	return imagetable4item4orderdetailsubmityourorder;
}


public WebElement getitemdetailstable1item1orderdetailsubmityourorder(){
	return itemdetailstable1item1orderdetailsubmityourorder;
}

public WebElement getitemdetailstable1item2orderdetailsubmityourorder(){
	return itemdetailstable1item2orderdetailsubmityourorder;
}

public WebElement getitemdetailstable1item3orderdetailsubmityourorder(){
	return itemdetailstable1item3orderdetailsubmityourorder;
}

public WebElement getitemdetailstable1item4orderdetailsubmityourorder(){
	return itemdetailstable1item4orderdetailsubmityourorder;
}

public WebElement getitemdetailstable2item1orderdetailsubmityourorder(){
	return itemdetailstable2item1orderdetailsubmityourorder;
}

public WebElement getitemdetailstable2item2orderdetailsubmityourorder(){
	return itemdetailstable2item2orderdetailsubmityourorder;
}

public WebElement getitemdetailstable2item3orderdetailsubmityourorder(){
	return itemdetailstable2item3orderdetailsubmityourorder;
}

public WebElement getitemdetailstable2item4orderdetailsubmityourorder(){
	return itemdetailstable2item4orderdetailsubmityourorder;
}

public WebElement getitemdetailstable3item1orderdetailsubmityourorder(){
	return itemdetailstable3item1orderdetailsubmityourorder;
}

public WebElement getitemdetailstable3item2orderdetailsubmityourorder(){
	return itemdetailstable3item2orderdetailsubmityourorder;
}

public WebElement getitemdetailstable3item3orderdetailsubmityourorder(){
	return itemdetailstable3item3orderdetailsubmityourorder;
}

public WebElement getitemdetailstable3item4orderdetailsubmityourorder(){
	return itemdetailstable3item4orderdetailsubmityourorder;
}

public WebElement getitemdetailstable4item1orderdetailsubmityourorder(){
	return itemdetailstable4item1orderdetailsubmityourorder;
}

public WebElement getitemdetailstable4item2orderdetailsubmityourorder(){
	return itemdetailstable4item2orderdetailsubmityourorder;
}

public WebElement getitemdetailstable4item3orderdetailsubmityourorder(){
	return itemdetailstable4item3orderdetailsubmityourorder;
}

public WebElement getitemdetailstable4item4orderdetailsubmityourorder(){
	return itemdetailstable4item4orderdetailsubmityourorder;
}


public WebElement getqtytable1item1orderdetailsubmityourorder(){
	return qtytable1item1orderdetailsubmityourorder;
}

public WebElement getqtytable1item2orderdetailsubmityourorder(){
	return qtytable1item2orderdetailsubmityourorder;
}

public WebElement getqtytable1item3orderdetailsubmityourorder(){
	return qtytable1item3orderdetailsubmityourorder;
}

public WebElement getqtytable1item4orderdetailsubmityourorder(){
	return qtytable1item4orderdetailsubmityourorder;
}

public WebElement getqtytable2item1orderdetailsubmityourorder(){
	return qtytable2item1orderdetailsubmityourorder;
}

public WebElement getqtytable2item2orderdetailsubmityourorder(){
	return qtytable2item2orderdetailsubmityourorder;
}

public WebElement getqtytable2item3orderdetailsubmityourorder(){
	return qtytable2item3orderdetailsubmityourorder;
}

public WebElement getqtytable2item4orderdetailsubmityourorder(){
	return qtytable2item4orderdetailsubmityourorder;
}

public WebElement getqtytable3item1orderdetailsubmityourorder(){
	return qtytable3item1orderdetailsubmityourorder;
}

public WebElement getqtytable3item2orderdetailsubmityourorder(){
	return qtytable3item2orderdetailsubmityourorder;
}

public WebElement getqtytable3item3orderdetailsubmityourorder(){
	return qtytable3item3orderdetailsubmityourorder;
}

public WebElement getqtytable3item4orderdetailsubmityourorder(){
	return qtytable3item4orderdetailsubmityourorder;
}

public WebElement getqtytable4item1orderdetailsubmityourorder(){
	return qtytable4item1orderdetailsubmityourorder;
}

public WebElement getqtytable4item2orderdetailsubmityourorder(){
	return qtytable4item2orderdetailsubmityourorder;
}

public WebElement getqtytable4item3orderdetailsubmityourorder(){
	return qtytable4item3orderdetailsubmityourorder;
}

public WebElement getqtytable4item4orderdetailsubmityourorder(){
	return qtytable4item4orderdetailsubmityourorder;
}



public WebElement gettotaltable1item1orderdetailsubmityourorder(){
	return totaltable1item1orderdetailsubmityourorder;
}

public WebElement gettotaltable1item2orderdetailsubmityourorder(){
	return totaltable1item2orderdetailsubmityourorder;
}

public WebElement gettotaltable1item3orderdetailsubmityourorder(){
	return totaltable1item3orderdetailsubmityourorder;
}

public WebElement gettotaltable1item4orderdetailsubmityourorder(){
	return totaltable1item4orderdetailsubmityourorder;
}

public WebElement gettotaltable2item1orderdetailsubmityourorder(){
	return totaltable2item1orderdetailsubmityourorder;
}

public WebElement gettotaltable2item2orderdetailsubmityourorder(){
	return totaltable2item2orderdetailsubmityourorder;
}

public WebElement gettotaltable2item3orderdetailsubmityourorder(){
	return totaltable2item3orderdetailsubmityourorder;
}

public WebElement gettotaltable2item4orderdetailsubmityourorder(){
	return totaltable2item4orderdetailsubmityourorder;
}

public WebElement gettotaltable3item1orderdetailsubmityourorder(){
	return totaltable3item1orderdetailsubmityourorder;
}

public WebElement gettotaltable3item2orderdetailsubmityourorder(){
	return totaltable3item2orderdetailsubmityourorder;
}

public WebElement gettotaltable3item3orderdetailsubmityourorder(){
	return totaltable3item3orderdetailsubmityourorder;
}

public WebElement gettotaltable3item4orderdetailsubmityourorder(){
	return totaltable3item4orderdetailsubmityourorder;
}

public WebElement gettotaltable4item1orderdetailsubmityourorder(){
	return totaltable4item1orderdetailsubmityourorder;
}

public WebElement gettotaltable4item2orderdetailsubmityourorder(){
	return totaltable4item2orderdetailsubmityourorder;
}

public WebElement gettotaltable4item3orderdetailsubmityourorder(){
	return totaltable4item3orderdetailsubmityourorder;
}

public WebElement gettotaltable4item4orderdetailsubmityourorder(){
	return totaltable4item4orderdetailsubmityourorder;
}

public WebElement gettotalitemssubmityourorderpage(){
	return totalitemssubmityourorderpage;
}

public WebElement getordernumberconfirmationpage(){
	return ordernumberconfirmationpage;
}

public WebElement gethomeiconconfirmationpage(){
	return homeiconconfirmationpage;
}

public WebElement getcontentassetconfirmationpage(){
	return contentassetconfirmationpage;
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



//############################################################################################################################
//##############################		METHODS				##################################################################
//############################################################################################################################


@Override
public void pcod_verify_submityourorderpage_stepheader(){
	
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(2500);
	String stepheader = getheadersubmityourorderpage().getText().trim().replace("br/","").replace("\n"," ").replace("\r"," ");
	
	System.out.println("options are: "+stepheader);
	for(int i=0;i<ConstantUtils.PCOD_SUBMITYOURORDERSTEPHEADER[i].length();i++){
		if(!stepheader.contains(ConstantUtils.PCOD_SUBMITYOURORDERSTEPHEADER[i])){
			Assert.fail("Step heaer is not present in submit your order page. i.e. :"+ConstantUtils.PCOD_SUBMITYOURORDERSTEPHEADER[i]);
			
			
		}	
	}	
}


@Override
public void pcod_verify_element_highlighted(WebElement element){
	if(!getheadersubmityourordersubmityourorderpage().getAttribute("class").contains("active")){
		Assert.fail("Element is not highlighted. i.e. :"+getheadersubmityourordersubmityourorderpage().getText());
	}
}


@Override
public void pcod_verify_element_notclickbale(List<WebElement> element){
	getheadersubmityourordersubmityourorderpage().click();
	PauseUtil.waitForAjaxToComplete(2500);
	PauseUtil.pause(2500);
	Assert.assertFalse(element.size() > 0);
}

    @Override
    public void clickheaderpayment() {
        headershippingandpaymentsubmityourorderpage.click();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2500);

    }

    @Override
    public void clicksubmitOrder_SubmitOrderPage() {
        String pageTitle = pagetitleconfirmsubmit.getText();
        //System.out.println("Test the page title"+pageTitle.trim());
        if(pageTitle.trim().equalsIgnoreCase("Submit Your Order")){
            buttonSubmitOrder.click();
            //System.out.println("clicked>> to test");
            PauseUtil.waitForAjaxToComplete(2500);
            PauseUtil.pause(2500);
        }
    }

    @Override
    public WebElement getpagetitleconfirmSubmit() {
        return pagetitleconfirmsubmit;
    }

    @Override
    public WebElement getButtonsubmitOrder() {
        return buttonSubmitOrder;
    }

    @Override
    public void verifypagetitleOrderconfirmationpage() {

        SCHUtils.WaitForAjax();
        String pagetitleorderconfirpage = getpagetitleorderconfirmationpage().getText();
        //System.out.println("To test page tilte order confirm page"+pagetitleorderconfirpage.trim());
        if(!pagetitleorderconfirpage.contains("Thank You for Your Order")){
            Assert.fail("Order Confirmation page is not displayed");
        }
    }
    
    @Override
    public void verifycontentassetOrderconfirmationpage() {

        SCHUtils.WaitForAjax();
        String pagetitleorderconfirpage = getcontentassetconfirmationpage().getText();
        if(!pagetitleorderconfirpage.contains(ConstantUtils.PCOD_CONFIRMATIONPAGE_CONTENTASSET)){
            Assert.fail("Content Asset in Order Confirmation page is not displayed");
        }
    }
    
    @Override
    public void verifyordernumberOrderconfirmationpage() {

        SCHUtils.WaitForAjax();
        String pagetitleorderconfirpage = getordernumberconfirmationpage().getText();
        if(pagetitleorderconfirpage==null){
            Assert.fail("Order Number in Confirmation page is not displayed");
        }
    }
    
    
    @Override
    public void verifyhomeicon_confirmationpage(){
    	SCHUtils.WaitForAjax();
    	if(!gethomeiconconfirmationpage().getAttribute("class").equals("icon-home")){
    		Assert.fail("Home Icon in Confirmation page is not displayed");
    	}
    }

    @Override
    public WebElement getpagetitleorderconfirmationpage() {
       return pagetitleorderconfirmpage;
    }
    
    @Override
    public void verify_childname_teachername_orderdetail(){
    	PauseUtil.pause(4500);
    	
    	int header_size = sizeheaderchildorderdetailsubmityourorderpage().size();
    	
    	if(header_size==4){
    		System.out.println("No of Childs in submit page is:"+header_size);
    		String child1_header = getheaderchild1orderdetailsubmityourorderpage().getText();
    		System.out.println("Child1 name in submit page is:"+child1_header);
        	if(!child1_header.contains("testchild1 in "+TestBaseProvider.getTestBase().getTestData().getString("teachername1")+"'s Class")){
				Assert.fail(child1_header+ "is not correct");	
				}
        	String child2_header = getheaderchild2orderdetailsubmityourorderpage().getText();
        	System.out.println("Child2 name in submit page is:"+child2_header);
        	if(!child2_header.contains("testchild2 in "+TestBaseProvider.getTestBase().getTestData().getString("teachername2")+"'s Class")){
				Assert.fail(child2_header+ "is not correct");	
				}
        	String child3_header = getheaderchild3orderdetailsubmityourorderpage().getText();
        	System.out.println("Child3 name in submit page is:"+child3_header);
        	if(!child3_header.contains("testchild3 in "+TestBaseProvider.getTestBase().getTestData().getString("teachername3")+"'s Class")){
				Assert.fail(child2_header+ "is not correct");	
				}
    	String child4_header = getheaderchild4orderdetailsubmityourorderpage().getText();
    	System.out.println("Child4 name in submit page is:"+child4_header);
    	if(!child4_header.contains("testchild4 in "+TestBaseProvider.getTestBase().getTestData().getString("teachername4")+"'s Class")){
			Assert.fail(child2_header+ "is not correct");	
			}
    	
    }
    	
    	else if(header_size==3){
    		System.out.println("No of Childs in submit page is:"+header_size);
        	String child1_header = getheaderchild1orderdetailsubmityourorderpage().getText();
        	System.out.println("Child1 name in submit page is:"+child1_header);
        	if(!child1_header.contains("testchild1 in "+TestBaseProvider.getTestBase().getTestData().getString("teachername1")+"'s Class")){
				Assert.fail(child1_header+ "is not correct");	
				}
        	String child2_header = getheaderchild2orderdetailsubmityourorderpage().getText();
        	System.out.println("Child2 name in submit page is:"+child2_header);
        	if(!child2_header.contains("testchild2 in "+TestBaseProvider.getTestBase().getTestData().getString("teachername2")+"'s Class")){
				Assert.fail(child2_header+ "is not correct");	
				}
        	String child3_header = getheaderchild3orderdetailsubmityourorderpage().getText();
        	System.out.println("Child3 name in submit page is:"+child3_header);
        	if(!child3_header.contains("testchild3 in "+TestBaseProvider.getTestBase().getTestData().getString("teachername3")+"'s Class")){
				Assert.fail(child2_header+ "is not correct");	
				}
        	
        }
    	
				else if(header_size==2){
					        System.out.println("No of Childs in submit page is:"+header_size);
				        	String child1_header = getheaderchild1orderdetailsubmityourorderpage().getText();
				        	System.out.println("Child1 name in submit page is:"+child1_header);
				        	if(!child1_header.contains("testchild1 in "+TestBaseProvider.getTestBase().getTestData().getString("teachername1")+"'s Class")){
								Assert.fail(child1_header+ "is not correct");	
								}
				        	
				        	String child2_header = getheaderchild2orderdetailsubmityourorderpage().getText();
				        	System.out.println("Child2 name in submit page is:"+child2_header);
				        	if(!child2_header.contains("testchild2 in "+TestBaseProvider.getTestBase().getTestData().getString("teachername2")+"'s Class")){
								Assert.fail(child2_header+ "is not correct");	
								}
				        	
				        }
    	
							else if(header_size==1){
								
							    System.out.println("No of Childs in submit page is:"+header_size);
								String child1_header = getheaderchild1orderdetailsubmityourorderpage().getText();
								if(!child1_header.contains("testchild1 in null "+TestBaseProvider.getTestBase().getTestData().getString("teachername1")+"'s Class")){
								Assert.fail(child1_header+ "is not correct");	
								}
								
                             }
    }
    	
    	
        @Override
    	public void verify_totalqty_submitorder_orderdetail(){
    		
    		String act_totalitems12 = gettotalitemssubmityourorderpage().getText();
    		String[] act_totalitems123 = act_totalitems12.split(" ");
    		String act_totalitems1 = act_totalitems123[2];
    		int act_totalitems = Integer.parseInt(act_totalitems1);
    		
    		String exp_totalitems1 = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.total.items").toString();
    		int exp_totalitems = Integer.parseInt(exp_totalitems1);
    		
    		Assert.assertEquals(act_totalitems, exp_totalitems,"Total Items not matching in Submit page");
    	
    		
    	}
    
    
 @Override   
 public void verify_alldata_iteminformation_submitpage(){
	 
	 
	 List<WebElement> items_table = sizetableorderdetailsubmityourorder();
	 List<WebElement> items_rows  = sizetrtableorderdetailsubmityourorder();
	 List<WebElement> table2_rows  = table2rowsizeorderdetailsubmityourorder();
	 List<WebElement> table1_rows  = table1rowsizeorderdetailsubmityourorder();
	 
	 
	 
	     //checking items if there is 4 childs and combination of 1 item	
		 if(items_table.size()==4){
			 System.out.println("Entering into 4 childs");
				if(table1_rows.size()==1){
					System.out.println("Entering into 4 childs having 1 item having for each child");
	       
					String table1item1image      = getimagetable1item1orderdetailsubmityourorder().getAttribute("alt");
					String table1item1itemdetails= getitemdetailstable1item1orderdetailsubmityourorder().getText();
					String table1item1qty        = getqtytable1item1orderdetailsubmityourorder().getText();
					String table1item1total      = gettotaltable1item1orderdetailsubmityourorder().getText();
					
					String table2item1image      = getimagetable2item1orderdetailsubmityourorder().getAttribute("alt");
					String table2item1itemdetails= getitemdetailstable2item1orderdetailsubmityourorder().getText();
					String table2item1qty        = getqtytable2item1orderdetailsubmityourorder().getText();
					String table2item1total      = gettotaltable2item1orderdetailsubmityourorder().getText();
					
					String table3item1image      = getimagetable3item1orderdetailsubmityourorder().getAttribute("alt");
					String table3item1itemdetails= getitemdetailstable3item1orderdetailsubmityourorder().getText();
					String table3item1qty        = getqtytable3item1orderdetailsubmityourorder().getText();
					String table3item1total      = gettotaltable3item1orderdetailsubmityourorder().getText();
					
					String table4item1image      = getimagetable4item1orderdetailsubmityourorder().getAttribute("alt");
					String table4item1itemdetails= getitemdetailstable4item1orderdetailsubmityourorder().getText();
					String table4item1qty        = getqtytable4item1orderdetailsubmityourorder().getText();
					String table4item1total      = gettotaltable4item1orderdetailsubmityourorder().getText();
					
					String exp_item1image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.img").toString();
					String exp_item1itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.details").toString();
					String exp_item1qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.qty").toString();
					String exp_item1total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.total").toString();
					
					String exp_item2image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.img").toString();
					String exp_item2itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.details").toString();
					String exp_item2qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.qty").toString();
					String exp_item2total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.total").toString();
					
					String exp_item3image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.img").toString();
					String exp_item3itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.details").toString();
					String exp_item3qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.qty").toString();
					String exp_item3total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.total").toString();
					
					String exp_item4image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item4.img").toString();
					String exp_item4itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item4.details").toString();
					String exp_item4qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item4.qty").toString();
					String exp_item4total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item4.total").toString();
					
					
					Assert.assertEquals(table1item1image, exp_item1image,"Item1 in table1 is incorrect");
					Assert.assertEquals(table1item1itemdetails, exp_item1itemdetails,"Itemdetails1 in table1 is incorrect");
					Assert.assertEquals(table1item1qty, exp_item1qty,"Item1 qty in table1 is incorrect");
					Assert.assertEquals(table1item1total, exp_item1total,"Item1 total in table1 is incorrect");
					
					Assert.assertEquals(table2item1image, exp_item2image,"Item1 in table2 is incorrect");
					Assert.assertEquals(table2item1itemdetails, exp_item2itemdetails,"Itemdetails1 in table2 is incorrect");
					Assert.assertEquals(table2item1qty, exp_item2qty,"Item1 qty in table2 is incorrect");
					Assert.assertEquals(table2item1total, exp_item2total,"Item1 total in table2 is incorrect");
					
					Assert.assertEquals(table3item1image, exp_item3image,"Item1 in table3 is incorrect");
					Assert.assertEquals(table3item1itemdetails, exp_item3itemdetails,"Itemdetails1 in table3 is incorrect");
					Assert.assertEquals(table3item1qty, exp_item3qty,"Item1 qty in table3 is incorrect");
					Assert.assertEquals(table3item1total, exp_item3total,"Item1 total in table3 is incorrect");
					
					Assert.assertEquals(table4item1image, exp_item4image,"Item1 in table4 is incorrect");
					Assert.assertEquals(table4item1itemdetails, exp_item4itemdetails,"Itemdetails1 in table4 is incorrect");
					Assert.assertEquals(table4item1qty, exp_item4qty,"Item1 qty in table4 is incorrect");
					Assert.assertEquals(table4item1total, exp_item4total,"Item1 total in table4 is incorrect");
			
			}
				}	
		 
		 
		//checking items if there is only 3 childs and combination of 1 to 3 items	
		 else if(items_table.size()==3){
		 System.out.println("Entering into 3 childs");
			if(table1_rows.size()==1){
				System.out.println("Entering into 3 childs having 1 item having for each child");
       
				String table1item1image      = getimagetable1item1orderdetailsubmityourorder().getAttribute("alt");
				String table1item1itemdetails= getitemdetailstable1item1orderdetailsubmityourorder().getText();
				String table1item1qty        = getqtytable1item1orderdetailsubmityourorder().getText();
				String table1item1total      = gettotaltable1item1orderdetailsubmityourorder().getText();
				
				String table2item1image      = getimagetable2item1orderdetailsubmityourorder().getAttribute("alt");
				String table2item1itemdetails= getitemdetailstable2item1orderdetailsubmityourorder().getText();
				String table2item1qty        = getqtytable2item1orderdetailsubmityourorder().getText();
				String table2item1total      = gettotaltable2item1orderdetailsubmityourorder().getText();
				
				String table3item1image      = getimagetable3item1orderdetailsubmityourorder().getAttribute("alt");
				String table3item1itemdetails= getitemdetailstable3item1orderdetailsubmityourorder().getText();
				String table3item1qty        = getqtytable3item1orderdetailsubmityourorder().getText();
				String table3item1total      = gettotaltable3item1orderdetailsubmityourorder().getText();
				
				
				
				String exp_item1image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.img").toString();
				String exp_item1itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.details").toString();
				String exp_item1qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.qty").toString();
				String exp_item1total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.total").toString();
				
				String exp_item2image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.img").toString();
				String exp_item2itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.details").toString();
				String exp_item2qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.qty").toString();
				String exp_item2total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.total").toString();
				
				String exp_item3image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.img").toString();
				String exp_item3itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.details").toString();
				String exp_item3qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.qty").toString();
				String exp_item3total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.total").toString();
				
				
				Assert.assertEquals(table1item1image, exp_item1image,"Item1 in table1 is incorrect");
				Assert.assertEquals(table1item1itemdetails, exp_item1itemdetails,"Itemdetails1 in table1 is incorrect");
				Assert.assertEquals(table1item1qty, exp_item1qty,"Item1 qty in table1 is incorrect");
				Assert.assertEquals(table1item1total, exp_item1total,"Item1 total in table1 is incorrect");
				
				Assert.assertEquals(table2item1image, exp_item2image,"Item1 in table2 is incorrect");
				Assert.assertEquals(table2item1itemdetails, exp_item2itemdetails,"Itemdetails1 in table2 is incorrect");
				Assert.assertEquals(table2item1qty, exp_item2qty,"Item1 qty in table2 is incorrect");
				Assert.assertEquals(table2item1total, exp_item2total,"Item1 total in table2 is incorrect");
				
				Assert.assertEquals(table3item1image, exp_item3image,"Item1 in table3 is incorrect");
				Assert.assertEquals(table3item1itemdetails, exp_item3itemdetails,"Itemdetails1 in table3 is incorrect");
				Assert.assertEquals(table3item1qty, exp_item3qty,"Item1 qty in table3 is incorrect");
				Assert.assertEquals(table3item1total, exp_item3total,"Item1 total in table3 is incorrect");
		
		}	
		 }
		 
				     
	 
	//checking items if there is only 2 child and combination of 1 to 3 items	
		 else if(items_table.size()==2){
		 System.out.println("Entering into 2 childs");
			if(table1_rows.size()==3){
				System.out.println("Entering into 2 childs having 3 items having for each child");
       
				String table1item1image      = getimagetable1item1orderdetailsubmityourorder().getAttribute("alt");
				String table1item1itemdetails= getitemdetailstable1item1orderdetailsubmityourorder().getText();
				String table1item1qty        = getqtytable1item1orderdetailsubmityourorder().getText();
				String table1item1total      = gettotaltable1item1orderdetailsubmityourorder().getText();
				
				String table1item2image      = getimagetable1item2orderdetailsubmityourorder().getAttribute("alt");
				String table1item2itemdetails= getitemdetailstable1item2orderdetailsubmityourorder().getText();
				String table1item2qty        = getqtytable1item2orderdetailsubmityourorder().getText();
				String table1item2total      = gettotaltable1item2orderdetailsubmityourorder().getText();
				
				String table1item3image      = getimagetable1item3orderdetailsubmityourorder().getAttribute("alt");
				String table1item3itemdetails= getitemdetailstable1item3orderdetailsubmityourorder().getText();
				String table1item3qty        = getqtytable1item3orderdetailsubmityourorder().getText();
				String table1item3total      = gettotaltable1item3orderdetailsubmityourorder().getText();
				
				String table2item1image      = getimagetable2item1orderdetailsubmityourorder().getAttribute("alt");
				String table2item1itemdetails= getitemdetailstable2item1orderdetailsubmityourorder().getText();
				String table2item1qty        = getqtytable2item1orderdetailsubmityourorder().getText();
				String table2item1total      = gettotaltable2item1orderdetailsubmityourorder().getText();
				
				String exp_item1image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.img").toString();
				String exp_item1itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.details").toString();
				String exp_item1qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.qty").toString();
				String exp_item1total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.total").toString();
				
				String exp_item2image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.img").toString();
				String exp_item2itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.details").toString();
				String exp_item2qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.qty").toString();
				String exp_item2total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.total").toString();
				
				String exp_item3image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.img").toString();
				String exp_item3itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.details").toString();
				String exp_item3qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.qty").toString();
				String exp_item3total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.total").toString();
				
				String exp_item4image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item4.img").toString();
				String exp_item4itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item4.details").toString();
				String exp_item4qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item4.qty").toString();
				String exp_item4total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item4.total").toString();
				
				
				Assert.assertEquals(table1item1image, exp_item1image,"Item1 in table1 is incorrect");
				Assert.assertEquals(table1item1itemdetails, exp_item1itemdetails,"Itemdetails1 in table1 is incorrect");
				Assert.assertEquals(table1item1qty, exp_item1qty,"Item1 qty in table1 is incorrect");
				Assert.assertEquals(table1item1total, exp_item1total,"Item1 total in table1 is incorrect");
				
				Assert.assertEquals(table1item2image, exp_item2image,"Item2 in table1 is incorrect");
				Assert.assertEquals(table1item2itemdetails, exp_item2itemdetails,"Itemdetails2 in table1 is incorrect");
				Assert.assertEquals(table1item2qty, exp_item2qty,"Item2 qty in table1 is incorrect");
				Assert.assertEquals(table1item2total, exp_item2total,"Item2 total in table1 is incorrect");
				
				Assert.assertEquals(table1item3image, exp_item3image,"Item4 in table1 is incorrect");
				Assert.assertEquals(table1item3itemdetails, exp_item3itemdetails,"Itemdetails3 in table1 is incorrect");
				Assert.assertEquals(table1item3qty, exp_item3qty,"Item3 qty in table1 is incorrect");
				Assert.assertEquals(table1item3total, exp_item3total,"Item3 total in table1 is incorrect");
				
				Assert.assertEquals(table2item1image, exp_item4image,"Item1 in table2 is incorrect");
				Assert.assertEquals(table2item1itemdetails, exp_item4itemdetails,"Itemdetails1 in table2 is incorrect");
				Assert.assertEquals(table2item1qty, exp_item4qty,"Item1 qty in table2 is incorrect");
				Assert.assertEquals(table2item1total, exp_item4total,"Item1 total in table2 is incorrect");
		
		}	
	 
			     else if(table1_rows.size()==2){
			    	 System.out.println("Entering into 2 childs having 2 items having for each child");
          
				String table1item1image      = getimagetable1item1orderdetailsubmityourorder().getAttribute("alt");
				String table1item1itemdetails= getitemdetailstable1item1orderdetailsubmityourorder().getText();
				String table1item1qty        = getqtytable1item1orderdetailsubmityourorder().getText();
				String table1item1total      = gettotaltable1item1orderdetailsubmityourorder().getText();
				
				String table1item2image      = getimagetable1item2orderdetailsubmityourorder().getAttribute("alt");
				String table1item2itemdetails= getitemdetailstable1item2orderdetailsubmityourorder().getText();
				String table1item2qty        = getqtytable1item2orderdetailsubmityourorder().getText();
				String table1item2total      = gettotaltable1item2orderdetailsubmityourorder().getText();
				
				String table2item1image      = getimagetable2item1orderdetailsubmityourorder().getAttribute("alt");
				String table2item1itemdetails= getitemdetailstable2item1orderdetailsubmityourorder().getText();
				String table2item1qty        = getqtytable2item1orderdetailsubmityourorder().getText();
				String table2item1total      = gettotaltable2item1orderdetailsubmityourorder().getText();
				
				String exp_item1image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.img").toString();
				String exp_item1itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.details").toString();
				String exp_item1qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.qty").toString();
				String exp_item1total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.total").toString();
				
				String exp_item2image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.img").toString();
				String exp_item2itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.details").toString();
				String exp_item2qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.qty").toString();
				String exp_item2total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.total").toString();
				
				String exp_item3image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.img").toString();
				String exp_item3itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.details").toString();
				String exp_item3qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.qty").toString();
				String exp_item3total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.total").toString();
				
				
				Assert.assertEquals(table1item1image, exp_item1image,"Item1 in table1 is incorrect");
				Assert.assertEquals(table1item1itemdetails, exp_item1itemdetails,"Itemdetails1 in table1 is incorrect");
				Assert.assertEquals(table1item1qty, exp_item1qty,"Item1 qty in table1 is incorrect");
				Assert.assertEquals(table1item1total, exp_item1total,"Item1 total in table1 is incorrect");
				
				Assert.assertEquals(table1item2image, exp_item2image,"Item2 in table1 is incorrect");
				Assert.assertEquals(table1item2itemdetails, exp_item2itemdetails,"Itemdetails2 in table1 is incorrect");
				Assert.assertEquals(table1item2qty, exp_item2qty,"Item2 qty in table1 is incorrect");
				Assert.assertEquals(table1item2total, exp_item2total,"Item2 total in table1 is incorrect");
				
				Assert.assertEquals(table2item1image, exp_item3image,"Item1 in table2 is incorrect");
				Assert.assertEquals(table2item1itemdetails, exp_item3itemdetails,"Itemdetails1 in table2 is incorrect");
				Assert.assertEquals(table2item1qty, exp_item3qty,"Item1 qty in table2 is incorrect");
				Assert.assertEquals(table2item1total, exp_item3total,"Item1 total in table2 is incorrect");
		
		}
	 
	 
			     else if(table1_rows.size()==1){
			    	 System.out.println("Entering into 2 childs having 1 item for each child");
       
				String table1item1image      = getimagetable1item1orderdetailsubmityourorder().getAttribute("alt");
				String table1item1itemdetails= getitemdetailstable1item1orderdetailsubmityourorder().getText();
				String table1item1qty        = getqtytable1item1orderdetailsubmityourorder().getText();
				String table1item1total      = gettotaltable1item1orderdetailsubmityourorder().getText();
				
				
				String table2item1image      = getimagetable2item1orderdetailsubmityourorder().getAttribute("alt");
				String table2item1itemdetails= getitemdetailstable2item1orderdetailsubmityourorder().getText();
				String table2item1qty        = getqtytable2item1orderdetailsubmityourorder().getText();
				String table2item1total      = gettotaltable2item1orderdetailsubmityourorder().getText();
				
				String exp_item1image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.img").toString();
				String exp_item1itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.details").toString();
				String exp_item1qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.qty").toString();
				String exp_item1total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.total").toString();
				
				String exp_item2image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.img").toString();
				String exp_item2itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.details").toString();
				String exp_item2qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.qty").toString();
				String exp_item2total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.total").toString();
				
				
				Assert.assertEquals(table1item1image, exp_item1image,"Item1 in table1 is incorrect");
				Assert.assertEquals(table1item1itemdetails, exp_item1itemdetails,"Itemdetails1 in table1 is incorrect");
				Assert.assertEquals(table1item1qty, exp_item1qty,"Item1 qty in table1 is incorrect");
				Assert.assertEquals(table1item1total, exp_item1total,"Item1 total in table1 is incorrect");
				
				
				Assert.assertEquals(table2item1image, exp_item2image,"Item1 in table2 is incorrect");
				Assert.assertEquals(table2item1itemdetails, exp_item2itemdetails,"Itemdetails1 in table2 is incorrect");
				Assert.assertEquals(table2item1qty, exp_item2qty,"Item1 qty in table2 is incorrect");
				Assert.assertEquals(table2item1total, exp_item2total,"Item1 total in table2 is incorrect");
		
		
		}
		}
	 
	 
	
	 //checking items if there is only 1 child and combination of 1 to 4 items
	 else if(items_table.size()==1){
		 System.out.println("Entering into 1 child");
			if(table1_rows.size()==4){
				System.out.println("Entering into 1 childs having 4 items");
 
				String table1item1image      = getimagetable1item1orderdetailsubmityourorder().getAttribute("alt");
				String table1item1itemdetails= getitemdetailstable1item1orderdetailsubmityourorder().getText();
				String table1item1qty        = getqtytable1item1orderdetailsubmityourorder().getText();
				String table1item1total      = gettotaltable1item1orderdetailsubmityourorder().getText();
				
				String table1item2image      = getimagetable1item2orderdetailsubmityourorder().getAttribute("alt");
				String table1item2itemdetails= getitemdetailstable1item2orderdetailsubmityourorder().getText();
				String table1item2qty        = getqtytable1item2orderdetailsubmityourorder().getText();
				String table1item2total      = gettotaltable1item2orderdetailsubmityourorder().getText();
				
				String table1item3image      = getimagetable1item3orderdetailsubmityourorder().getAttribute("alt");
				String table1item3itemdetails= getitemdetailstable1item3orderdetailsubmityourorder().getText();
				String table1item3qty        = getqtytable1item3orderdetailsubmityourorder().getText();
				String table1item3total      = gettotaltable1item3orderdetailsubmityourorder().getText();
				
				String table1item4image      = getimagetable1item4orderdetailsubmityourorder().getAttribute("alt");
				String table1item4itemdetails= getitemdetailstable1item4orderdetailsubmityourorder().getText();
				String table1item4qty        = getqtytable1item4orderdetailsubmityourorder().getText();
				String table1item4total      = gettotaltable1item4orderdetailsubmityourorder().getText();
				
				String exp_item1image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.img").toString();
				String exp_item1itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.details").toString();
				String exp_item1qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.qty").toString();
				String exp_item1total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.total").toString();
				
				String exp_item2image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.img").toString();
				String exp_item2itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.details").toString();
				String exp_item2qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.qty").toString();
				String exp_item2total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.total").toString();
				
				String exp_item3image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.img").toString();
				String exp_item3itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.details").toString();
				String exp_item3qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.qty").toString();
				String exp_item3total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.total").toString();
				
				String exp_item4image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item4.img").toString();
				String exp_item4itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item4.details").toString();
				String exp_item4qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item4.qty").toString();
				String exp_item4total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item4.total").toString();
				
				
				Assert.assertEquals(table1item1image, exp_item1image,"Item1 in table1 is incorrect");
				Assert.assertEquals(table1item1itemdetails, exp_item1itemdetails,"Itemdetails in table1 is incorrect");
				Assert.assertEquals(table1item1qty, exp_item1qty,"Item1 qty in table1 is incorrect");
				Assert.assertEquals(table1item1total, exp_item1total,"Item1 total in table1 is incorrect");	
				
				Assert.assertEquals(table1item2image, exp_item2image,"Item2 in table1 is incorrect");
				Assert.assertEquals(table1item2itemdetails, exp_item2itemdetails,"Itemdetails2 in table1 is incorrect");
				Assert.assertEquals(table1item2qty, exp_item2qty,"Item2 qty in table1 is incorrect");
				Assert.assertEquals(table1item2total, exp_item2total,"Item2 total in table1 is incorrect");
				
				Assert.assertEquals(table1item3image, exp_item3image,"Item3 in table1 is incorrect");
				Assert.assertEquals(table1item3itemdetails, exp_item3itemdetails,"Itemdetails3 in table1 is incorrect");
				Assert.assertEquals(table1item3qty, exp_item3qty,"Item3 qty in table1 is incorrect");
				Assert.assertEquals(table1item3total, exp_item3total,"Item3 total in table1 is incorrect");
				
				Assert.assertEquals(table1item4image, exp_item4image,"Item4 in table1 is incorrect");
				Assert.assertEquals(table1item4itemdetails, exp_item4itemdetails,"Itemdetails4 in table1 is incorrect");
				Assert.assertEquals(table1item4qty, exp_item4qty,"Item4 qty in table1 is incorrect");
				Assert.assertEquals(table1item4total, exp_item4total,"Item4 total in table1 is incorrect");
		
		
		}
		
			else if(table1_rows.size()==3){
				System.out.println("Entering into 1 childs having 3 items");
    
				String table1item1image      = getimagetable1item1orderdetailsubmityourorder().getAttribute("alt");
				String table1item1itemdetails= getitemdetailstable1item1orderdetailsubmityourorder().getText();
				String table1item1qty        = getqtytable1item1orderdetailsubmityourorder().getText();
				String table1item1total      = gettotaltable1item1orderdetailsubmityourorder().getText();
				
				String table1item2image      = getimagetable1item2orderdetailsubmityourorder().getAttribute("alt");
				String table1item2itemdetails= getitemdetailstable1item2orderdetailsubmityourorder().getText();
				String table1item2qty        = getqtytable1item2orderdetailsubmityourorder().getText();
				String table1item2total      = gettotaltable1item2orderdetailsubmityourorder().getText();
				
				String table1item3image      = getimagetable1item3orderdetailsubmityourorder().getAttribute("alt");
				String table1item3itemdetails= getitemdetailstable1item3orderdetailsubmityourorder().getText();
				String table1item3qty        = getqtytable1item3orderdetailsubmityourorder().getText();
				String table1item3total      = gettotaltable1item3orderdetailsubmityourorder().getText();
				
				String exp_item1image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.img").toString();
				String exp_item1itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.details").toString();
				String exp_item1qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.qty").toString();
				String exp_item1total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.total").toString();
				
				String exp_item2image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.img").toString();
				String exp_item2itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.details").toString();
				String exp_item2qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.qty").toString();
				String exp_item2total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.total").toString();
				
				String exp_item3image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.img").toString();
				String exp_item3itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.details").toString();
				String exp_item3qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.qty").toString();
				String exp_item3total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item3.total").toString();
				
				
				Assert.assertEquals(table1item1image, exp_item1image,"Item1 in table1 is incorrect");
				Assert.assertEquals(table1item1itemdetails, exp_item1itemdetails,"Itemdetails in table1 is incorrect");
				Assert.assertEquals(table1item1qty, exp_item1qty,"Item1 qty in table1 is incorrect");
				Assert.assertEquals(table1item1total, exp_item1total,"Item1 total in table1 is incorrect");	
				
				Assert.assertEquals(table1item2image, exp_item2image,"Item2 in table1 is incorrect");
				Assert.assertEquals(table1item2itemdetails, exp_item2itemdetails,"Itemdetails2 in table1 is incorrect");
				Assert.assertEquals(table1item2qty, exp_item2qty,"Item2 qty in table1 is incorrect");
				Assert.assertEquals(table1item2total, exp_item2total,"Item2 total in table1 is incorrect");
				
				Assert.assertEquals(table1item3image, exp_item3image,"Item3 in table1 is incorrect");
				Assert.assertEquals(table1item3itemdetails, exp_item3itemdetails,"Itemdetails3 in table1 is incorrect");
				Assert.assertEquals(table1item3qty, exp_item3qty,"Item3 qty in table1 is incorrect");
				Assert.assertEquals(table1item3total, exp_item3total,"Item3 total in table1 is incorrect");
		
		}
	 
	
			else if(table1_rows.size()==2){
				System.out.println("Entering into 1 childs having 2 items");
       
				String table1item1image      = getimagetable1item1orderdetailsubmityourorder().getAttribute("alt");
				String table1item1itemdetails= getitemdetailstable1item1orderdetailsubmityourorder().getText();
				String table1item1qty        = getqtytable1item1orderdetailsubmityourorder().getText();
				String table1item1total      = gettotaltable1item1orderdetailsubmityourorder().getText();
				
				String table1item2image      = getimagetable1item2orderdetailsubmityourorder().getAttribute("alt");
				String table1item2itemdetails= getitemdetailstable1item2orderdetailsubmityourorder().getText();
				String table1item2qty        = getqtytable1item2orderdetailsubmityourorder().getText();
				String table1item2total      = gettotaltable1item2orderdetailsubmityourorder().getText();
				
				String exp_item1image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.img").toString();
				String exp_item1itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.details").toString();
				String exp_item1qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.qty").toString();
				String exp_item1total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.total").toString();
				
				String exp_item2image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.img").toString();
				String exp_item2itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.details").toString();
				String exp_item2qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.qty").toString();
				String exp_item2total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.total").toString();
				
				
				Assert.assertEquals(table1item1image, exp_item1image,"Item1 in table1 is incorrect");
				Assert.assertEquals(table1item1itemdetails, exp_item1itemdetails,"Itemdetails in table1 is incorrect");
				Assert.assertEquals(table1item1qty, exp_item1qty,"Item1 qty in table1 is incorrect");
				Assert.assertEquals(table1item1total, exp_item1total,"Item1 total in table1 is incorrect");	
				
				Assert.assertEquals(table1item2image, exp_item2image,"Item2 in table1 is incorrect");
				Assert.assertEquals(table1item2itemdetails, exp_item2itemdetails,"Itemdetails2 in table1 is incorrect");
				Assert.assertEquals(table1item2qty, exp_item2qty,"Item2 qty in table1 is incorrect");
				Assert.assertEquals(table1item2total, exp_item2total,"Item2 total in table1 is incorrect");	
	
		}
			        
			        
			     
			else if(table1_rows.size()==1){
				System.out.println("Entering into 1 childs having 1 item1");
          
				String table1item1image      = getimagetable1item1orderdetailsubmityourorder().getAttribute("alt");
				String table1item1itemdetails= getitemdetailstable1item1orderdetailsubmityourorder().getText();
				String table1item1qty        = getqtytable1item1orderdetailsubmityourorder().getText();
				String table1item1total      = gettotaltable1item1orderdetailsubmityourorder().getText();
				
				String exp_item1image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.img").toString();
				String exp_item1itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.details").toString();
				String exp_item1qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.qty").toString();
				String exp_item1total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.total").toString();
				
				
				Assert.assertEquals(table1item1image, exp_item1image,"Item1 in table1 is incorrect");
				Assert.assertEquals(table1item1itemdetails, exp_item1itemdetails,"Itemdetails in table1 is incorrect");
				Assert.assertEquals(table1item1qty, exp_item1qty,"Item1 qty in table1 is incorrect");
				Assert.assertEquals(table1item1total, exp_item1total,"Item1 total in table1 is incorrect");	
		
		
		}
	 }
					
		
		
		
	 else if(items_table.size()==2){
			if(items_rows.size()==1){
             
				String table1item1image      = getimagetable1item1orderdetailsubmityourorder().getAttribute("alt");
				String table1item1itemdetails= getitemdetailstable1item1orderdetailsubmityourorder().getText();
				String table1item1qty        = getqtytable1item1orderdetailsubmityourorder().getText();
				String table1item1total      = gettotaltable1item1orderdetailsubmityourorder().getText();
				
				String table2item1image      = getimagetable2item1orderdetailsubmityourorder().getAttribute("alt");
				String table2item1itemdetails= getitemdetailstable2item1orderdetailsubmityourorder().getText();
				String table2item1qty        = getqtytable2item1orderdetailsubmityourorder().getText();
				String table2item1total      = gettotaltable2item1orderdetailsubmityourorder().getText();
				
				String exp_item1image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.img").toString();
				String exp_item1itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.details").toString();
				String exp_item1qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.qty").toString();
				String exp_item1total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.total").toString();
				
				String exp_item2image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.img").toString();
				String exp_item2itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.details").toString();
				String exp_item2qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.qty").toString();
				String exp_item2total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item2.total").toString();
				
				
				Assert.assertEquals(table1item1image, exp_item1image,"Item1 in table1 is incorrect");
				Assert.assertEquals(table1item1itemdetails, exp_item1itemdetails,"Itemdetails in table1 is incorrect");
				Assert.assertEquals(table1item1qty, exp_item1qty,"Item1 qty in table1 is incorrect");
				Assert.assertEquals(table1item1total, exp_item1total,"Item1 total in table1 is incorrect");
				
				Assert.assertEquals(table2item1image, exp_item2image,"Item1 in table2 is incorrect");
				Assert.assertEquals(table2item1itemdetails, exp_item2itemdetails,"Itemdetails in table2 is incorrect");
				Assert.assertEquals(table2item1qty, exp_item2qty,"Item1 qty in table2 is incorrect");
				Assert.assertEquals(table2item1total, exp_item2total,"Item1 total in table2 is incorrect");
		
		
		}
		}
		
		
			
 }
 
 
 
 @Override   
 public void verify_alldata_iteminformation_1item_2freeitems_submitpage(){
	       
	String table1item1image      = getimagetable1item1orderdetailsubmityourorder().getAttribute("alt");
	String table1item1itemdetails= getitemdetailstable1item1orderdetailsubmityourorder().getText();
	String table1item1qty        = getqtytable1item1orderdetailsubmityourorder().getText();
	String table1item1total      = gettotaltable1item1orderdetailsubmityourorder().getText();
	
	
	String exp_item1image = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.img").toString();
	String exp_item1itemdetails = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.details").toString();
	String exp_item1qty = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.qty").toString();
	String exp_item1total = TestBaseProvider.getTestBase().getContext().getProperty("testexecution.reviewcart.item1.total").toString();
	
	
	Assert.assertEquals(table1item1image, exp_item1image,"Item1 in table1 is incorrect");
	Assert.assertEquals(table1item1itemdetails, exp_item1itemdetails,"Itemdetails1 in table1 is incorrect");
	Assert.assertEquals(table1item1qty, exp_item1qty,"Item1 qty in table1 is incorrect");
	Assert.assertEquals(table1item1total, exp_item1total,"Item1 total in table1 is incorrect");
 }
 
 
 
 
    @Override
	public void verify_alldata_freeiteminformation_submitpage(){
		 
		 List<WebElement> items_table = sizetableorderdetailsubmityourorder();
		 List<WebElement> items_rows = sizetrtableorderdetailsubmityourorder();
		 
			    for(WebElement tabletr:items_table){
			        List<WebElement> tdtable = tabletr.findElements(By.tagName("tr"));
			        for(WebElement tabletd:tdtable){
				        List<WebElement> value = tabletd.findElements(By.tagName("td"));
				        if(value.size()>=3){
			                    String val = value.get(3).getText();
					            if(val.contains("FREEPICK")){
								
								String freeitem_pricestrike  =  value.get(1).findElement(By.className("strike-data")).getText();
								String freeitem_total        =  value.get(3).findElement(By.className("value")).getText();
								String freeitem_itemqty      =  value.get(2).findElement(By.tagName("span")).getText();
								String freeitem_coupon       =  value.get(3).getText();
								
								if(freeitem_pricestrike==null){
									Assert.fail("Item value is not striked off");
									}
								
								if(!freeitem_total.equals("FREE")){
									Assert.fail("Freepick Item value is not free");
								}
								
								if(!freeitem_itemqty.equals("1")){
									Assert.fail("Freepick Item quantity is incorrect");
								}
								
								if(!freeitem_coupon.contains(TestBaseProvider.getTestBase().getTestData().getString("couponcode"))){
									Assert.fail("Freepick Item coupon code is incorrect");
								}
								
						
				         }
			      }
			    }
	}



	}
    
    
    @Override
    public void pcod_confirmpage_logout(){
    	confirmpagemyaccountdrpdown.click();
    	confirmpagemyaccountdrpdownlogout.click();
    	PauseUtil.pause(2000);
    }
    
    @FindBy(locator="dw.pcod.confirmationpage.ordersubtotal")
    private WebElement confirmpageordersubtotal;
    
    @FindBy(locator="dw.pcod.confirmationpage.taxtotal")
    private WebElement confirmpageordertaxtotal;
    
    @FindBy(locator="dw.pcod.confirmationpage.ordertotal")
    private WebElement confirmpageordertotal;
    
    @FindBy(locator="dw.pcod.confirmationpage.orderreferencenumber")
    private WebElement confirmpageorderreferencenumber;

    public WebElement getorderreferencenumberConfirmSubmit() {
    	return confirmpageorderreferencenumber;
    }
    
    public WebElement getordertotalConfirmSubmit() {
    	return confirmpageordertotal;
    }
    
    public WebElement getordertaxtotalConfirmSubmit() {
    	return confirmpageordertaxtotal;
    }
    
    public WebElement getordersubtotalConfirmSubmit() {
    	return confirmpageordersubtotal;
    }
    
	public void record_order_information_in_Excel() {
		List<String> data = new ArrayList<String>();
		
		String parentEmail = TestBaseProvider.getTestBase().getTestData().getString("acc_no");
		String teacherAcc = TestBaseProvider.getTestBase().getTestData().getString("teacherAccount");
		String childName = TestBaseProvider.getTestBase().getTestData().getString("childFirstName") + " " + TestBaseProvider.getTestBase().getTestData().getString("childLastName");

		//String orderRef = getorderreferencenumberConfirmSubmit().getText().trim();
		String orderSubTotal = getordersubtotalConfirmSubmit().getText().trim().substring(1);
		String taxTotal = getordertaxtotalConfirmSubmit().getText().trim().substring(1);
		String orderTotal = getordertotalConfirmSubmit().getText().trim().substring(1);
		
		//data.add(orderRef);
		data.add(parentEmail);
		data.add(teacherAcc);
		data.add(orderSubTotal);
		data.add(taxTotal);
		data.add(orderTotal);
		data.add(childName);
		
		for (int i = 1; i <= 5; i++){
			data.add(TestBaseProvider.getTestBase().getTestData().getString("itemNum"+i));
			data.add(TestBaseProvider.getTestBase().getTestData().getString("itemQty"+i));
		}
		
		String[] valueToWrite = data.toArray(new String[data.size()]);
		
		//Write the file using file name, sheet name and the data to be filled
		try {
			String sep = File.separator;
			String excelDirectory = System.getProperty("user.dir") + sep + "src" + sep + "ExcelFile";
			Pcod_ExcelLibrary.writeExcel(excelDirectory, "pcodorders.xlsx", "Parent1child1teacher", valueToWrite);
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail("Something went wrong");
		}
	}

	public void record_order_information_in_Excel(String scenario) {
		List<String> data = new ArrayList<String>();
		String scenarioName = "";
		
		if(scenario.equals("1Parent1Child1Teacher")){
			scenarioName = "Parent1child1teacher";
			
			String parentEmail = TestBaseProvider.getTestBase().getTestData().getString("acc_no");
			String teacherAcc = TestBaseProvider.getTestBase().getTestData().getString("teacherAccount");
			String childName = TestBaseProvider.getTestBase().getTestData().getString("childFirstName") + " " + TestBaseProvider.getTestBase().getTestData().getString("childLastName");

			//String orderRef = getorderreferencenumberConfirmSubmit().getText().trim();
			String orderSubTotal = getordersubtotalConfirmSubmit().getText().trim().substring(1);
			String taxTotal = getordertaxtotalConfirmSubmit().getText().trim().substring(1);
			String orderTotal = getordertotalConfirmSubmit().getText().trim().substring(1);
			
			//data.add(orderRef);
			data.add(parentEmail);
			data.add(teacherAcc);
			data.add(orderSubTotal);
			data.add(taxTotal);
			data.add(orderTotal);
			
			data.add(childName);
			for (int i = 1; i <= 5; i++){
				data.add(TestBaseProvider.getTestBase().getTestData().getString("itemNum"+i));
				data.add(TestBaseProvider.getTestBase().getTestData().getString("itemQty"+i));
			}
			
		} else if(scenario.equals("1Parent2Children1Teacher")){
			scenarioName = "Parent2children1teacher";
			
			String parentEmail = TestBaseProvider.getTestBase().getTestData().getString("acc_no");
			String teacherAcc = TestBaseProvider.getTestBase().getTestData().getString("teacherAccount");
			String childName1 = TestBaseProvider.getTestBase().getTestData().getString("child1FirstName") + " " + TestBaseProvider.getTestBase().getTestData().getString("child1LastName");
			String childName2 = TestBaseProvider.getTestBase().getTestData().getString("child2FirstName") + " " + TestBaseProvider.getTestBase().getTestData().getString("child2LastName");

			//String orderRef = getorderreferencenumberConfirmSubmit().getText().trim();
			String orderSubTotal = getordersubtotalConfirmSubmit().getText().trim().substring(1);
			String taxTotal = getordertaxtotalConfirmSubmit().getText().trim().substring(1);
			String orderTotal = getordertotalConfirmSubmit().getText().trim().substring(1);

			//data.add(orderRef);
			data.add(parentEmail);
			data.add(teacherAcc);
			data.add(orderSubTotal);
			data.add(taxTotal);
			data.add(orderTotal);
			
			data.add(childName1);
			for (int i = 1; i <= 5; i++){
				data.add(TestBaseProvider.getTestBase().getTestData().getString("child1itemNum"+i));
				data.add(TestBaseProvider.getTestBase().getTestData().getString("child1itemQty"+i));
			}
			
			data.add(childName2);
			for (int i = 1; i <= 5; i++){
				data.add(TestBaseProvider.getTestBase().getTestData().getString("child2itemNum"+i));
				data.add(TestBaseProvider.getTestBase().getTestData().getString("child2itemQty"+i));
			}
		
		} else if (scenario.equals("1Parent2Children2Teachers")){
			scenarioName = "Parent2children2teachers";
					
			String parentEmail = TestBaseProvider.getTestBase().getTestData().getString("acc_no");
			String teacherAcc1 = TestBaseProvider.getTestBase().getTestData().getString("teacher1Account");
			String teacherAcc2 = TestBaseProvider.getTestBase().getTestData().getString("teacher2Account");
			String childName1 = TestBaseProvider.getTestBase().getTestData().getString("child1FirstName") + " " + TestBaseProvider.getTestBase().getTestData().getString("child1LastName");
			String childName2 = TestBaseProvider.getTestBase().getTestData().getString("child2FirstName") + " " + TestBaseProvider.getTestBase().getTestData().getString("child2LastName");

			//String orderRef = getorderreferencenumberConfirmSubmit().getText().trim();
			String orderSubTotal = getordersubtotalConfirmSubmit().getText().trim().substring(1);
			String taxTotal = getordertaxtotalConfirmSubmit().getText().trim().substring(1);
			String orderTotal = getordertotalConfirmSubmit().getText().trim().substring(1);

			//data.add(orderRef);
			data.add(parentEmail);
			data.add(teacherAcc1);
			data.add(teacherAcc2);
			data.add(orderSubTotal);
			data.add(taxTotal);
			data.add(orderTotal);
			
			data.add(childName1);
			for (int i = 1; i <= 5; i++){
				data.add(TestBaseProvider.getTestBase().getTestData().getString("child1itemNum"+i));
				data.add(TestBaseProvider.getTestBase().getTestData().getString("child1itemQty"+i));
			}
			
			data.add(childName2);
			for (int i = 1; i <= 5; i++){
				data.add(TestBaseProvider.getTestBase().getTestData().getString("child2itemNum"+i));
				data.add(TestBaseProvider.getTestBase().getTestData().getString("child2itemQty"+i));
			}
		} else if (scenario.equals("2Parents1Child1Teacher")){
			scenarioName = "2Parents1child1teacher";
			
			String parentEmail1 = TestBaseProvider.getTestBase().getTestData().getString("acc_no1");
			String parentEmail2 = TestBaseProvider.getTestBase().getTestData().getString("acc_no2");
			String teacherAcc = TestBaseProvider.getTestBase().getTestData().getString("teacherAccount");
			String childName1 = TestBaseProvider.getTestBase().getTestData().getString("child1FirstName") + " " + TestBaseProvider.getTestBase().getTestData().getString("child1LastName");
			String childName2 = TestBaseProvider.getTestBase().getTestData().getString("child2FirstName") + " " + TestBaseProvider.getTestBase().getTestData().getString("child2LastName");

			//String orderRef = getorderreferencenumberConfirmSubmit().getText().trim();
			String parent1orderSubTotal = (String) TestBaseProvider.getTestBase().getContext().getProperty("test.execution.parent1.orderSubTotal");
			String parent1taxTotal = (String) TestBaseProvider.getTestBase().getContext().getProperty("test.execution.parent1.taxTotal");
			String parent1orderTotal = (String) TestBaseProvider.getTestBase().getContext().getProperty("test.execution.parent1.orderTotal");
			String parent2orderSubTotal = (String) TestBaseProvider.getTestBase().getContext().getProperty("test.execution.parent2.orderSubTotal");
			String parent2taxTotal = (String) TestBaseProvider.getTestBase().getContext().getProperty("test.execution.parent2.taxTotal");
			String parent2orderTotal = (String) TestBaseProvider.getTestBase().getContext().getProperty("test.execution.parent2.orderTotal");
			
			//data.add(orderRef);
			data.add(teacherAcc);
			data.add(parentEmail1);
			data.add(parent1orderSubTotal);
			data.add(parent1taxTotal);
			data.add(parent1orderTotal);
			
			data.add(childName1);
			for (int i = 1; i <= 5; i++){
				data.add(TestBaseProvider.getTestBase().getTestData().getString("child1itemNum"+i));
				data.add(TestBaseProvider.getTestBase().getTestData().getString("child1itemQty"+i));
			}
			
			data.add(parentEmail2);
			data.add(parent2orderSubTotal);
			data.add(parent2taxTotal);
			data.add(parent2orderTotal);

			data.add(childName2);
			for (int i = 1; i <= 5; i++){
				data.add(TestBaseProvider.getTestBase().getTestData().getString("child2itemNum"+i));
				data.add(TestBaseProvider.getTestBase().getTestData().getString("child2itemQty"+i));
			}
		}
		
		String[] valueToWrite = data.toArray(new String[data.size()]);
		
		//Write the file using file name, sheet name and the data to be filled
		try {
			String sep = File.separator;
			String excelDirectory = System.getProperty("user.dir") + sep + "src" + sep + "ExcelFile";
			Pcod_ExcelLibrary.writeExcel(excelDirectory, "pcodorders.xlsx", scenarioName, valueToWrite);
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail("Something went wrong");
		}
	}

	public void storeorderinformation_specificteacher(int parentNumber) {
		String orderSubTotal = getordersubtotalConfirmSubmit().getText().trim().substring(1);
		String taxTotal = getordertaxtotalConfirmSubmit().getText().trim().substring(1);
		String orderTotal = getordertotalConfirmSubmit().getText().trim().substring(1);
		
		TestBaseProvider.getTestBase().getContext().setProperty("test.execution.parent" + parentNumber + ".orderSubTotal", orderSubTotal);
		System.out.println("Set the order subtotal for parent" + parentNumber + ": $" + orderSubTotal);
		
		TestBaseProvider.getTestBase().getContext().setProperty("test.execution.parent" + parentNumber + ".taxTotal", taxTotal);
		System.out.println("Set the order tax total for parent" + parentNumber + ": $" + taxTotal);
		
		TestBaseProvider.getTestBase().getContext().setProperty("test.execution.parent" + parentNumber + ".orderTotal", orderTotal);
		System.out.println("Set the order total for parent" + parentNumber + ": $" + orderTotal);
	}

	public void add_deleted_submitted_SOO_order_to_excel() {
		String sheetnames[] = {"Parent1child1teacher", "Parent2children1teacher", "Parent2children2teachers", "2Parents1child1teacher"};
		String foundSheet = "";
		String teacherAcc = TestBaseProvider.getTestBase().getTestData().getString("userid");
		
		Map<String, String> map = new HashMap<String, String>();
		
		List<String> heading, data = new ArrayList<String>();
		
		String sep = File.separator;
		String excelDirectory = System.getProperty("user.dir") + sep + "src" + sep + "ExcelFile";
		
		heading = Pcod_ExcelLibrary.find_get_ExcelData_Row(excelDirectory, "pcodorders.xlsx", "DeleteSubmittedSOO", 0);

		for(int i = 0; i < sheetnames.length; i++){
			map = Pcod_ExcelLibrary.find_get_ExcelData_SpecificCell(excelDirectory, "pcodorders.xlsx", sheetnames[i], teacherAcc);
			
			if(map != null){
				System.out.println("Found the teacher account " + teacherAcc + " in sheet " + sheetnames[i]);
				foundSheet = sheetnames[i];
				break;
			}
		}
		
		if(map == null){
			Assert.fail("Could find the teacher account " + teacherAcc + " in 'pcodorders.xlxs'");
		}
		
		
		for(String val: heading){
			if(val.equals("scenario"))
				data.add(foundSheet);
			else if (val.equals("order redid?"))
				data.add("no"); 
			else{
				if(map.containsKey(val))
					data.add(map.get(val));
				else
					data.add(map.get(""));
			}
			
		}
		
		String[] valueToWrite = data.toArray(new String[data.size()]);
		
		//Write the file using file name, sheet name and the data to be filled
		try {
			Pcod_ExcelLibrary.writeExcel(excelDirectory, "pcodorders.xlsx", "DeleteSubmittedSOO", valueToWrite);
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail("Something went wrong");
		}
		/*
		for(String key : map.keySet()){
			   System.out.println(key + " => " + map.get(key));
		}
		
		for(String val: heading){
			System.out.println(val);
		}*/
	}
}
    
    
    
   
