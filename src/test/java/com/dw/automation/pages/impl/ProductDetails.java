package com.dw.automation.pages.impl;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.dw.automation.pages.ICheckoutPage;
import com.dw.automation.pages.ICheckoutPage_2;
import com.dw.automation.pages.ILoginPage;
import com.dw.automation.pages.IStudentFlyerOrdersPage;
import com.dw.automation.pages.impl.CheckoutPage.ShippingAndPayment;
import com.dw.automation.support.ConstantUtils;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.WaitUtils;

public class ProductDetails {
	
	LoginPage login = new LoginPage();
	Pcod_ExcelLibrary ExLib=new Pcod_ExcelLibrary();
	StudentOnlineOrdersPage studonlinepage = new StudentOnlineOrdersPage();
	CartPage cartpage = new CartPage();
	
	List<ProductDetails> productList_sfo = null;
	List<ProductDetails> productList_reviewcart = null;
	List<ProductDetails> productList_yto = null;
	List<ProductDetails> productList_reviewcart_yto = null;
	List<ProductDetails> productList_reviewcart_te = null;
	List<ProductDetails> productList_te = null;
	List<ProductDetails> productList_soo = null;
	List<ProductDetails> SubTotal = null;
	List<ProductDetails> productList_excel=null;
	
	public String studentname;
	public String itemnumber;
	public String itemtitle;
	public String itemflyer;
	public String itemprice;
	public String itemqty;
	public Double subtotal;
	public String dateordered;
	
	
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getItemnumber() {
		return itemnumber;
	}
	public void setItemnumber(String itemnumber) {
		this.itemnumber = itemnumber;
	}
	public String getItemtitle() {
		return itemtitle;
	}
	public void setItemtitle(String itemtitle) {
		this.itemtitle = itemtitle;
	}
	public String getItemflyer() {
		return itemflyer;
	}
	public void setItemflyer(String itemflyer) {
		this.itemflyer = itemflyer;
	}
	public String getItemprice() {
		return itemprice;
	}
	public void setItemprice(String itemprice) {
		this.itemprice = itemprice;
	}
	public String getItemqty() {
		return itemqty;
	}
	public void setItemqty(String itemqty) {
		this.itemqty = itemqty;
	}
	
	public Double getsubtotal() {
		return subtotal;
	}
	public void setsubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	
	public String getDateOrdered() {
		return dateordered;
	}
	
	public void setDateOrdered(String dateordered) {
		this.dateordered = dateordered;
	}
	
	
	public List<ProductDetails> getProductList(String studentName, List<WebElement> cartTableBodyList, String cartSection){ 
		List<ProductDetails> product = new ArrayList<>();
		for(WebElement cartTableBody:cartTableBodyList){
			List<ProductDetails> interimProductList = getProductList(studentName, cartTableBody, cartSection);
			product.addAll( interimProductList);
		}
		
		return product;
	}
	
	public List<ProductDetails> getProductList(String dateordered, String studentName, List<WebElement> cartTableBodyList, String cartSection){ 
		List<ProductDetails> product = new ArrayList<>();
		for(WebElement cartTableBody:cartTableBodyList){
			List<ProductDetails> interimProductList = getProductList(dateordered, studentName, cartTableBody, cartSection);
			product.addAll( interimProductList);
		}
		
		return product;
	}
	
	public List<ProductDetails> getProductList(String studentName, WebElement reviewCartTabletr, String cartSection){
		List<ProductDetails> productList = new ArrayList<ProductDetails>();
		System.out.println("cart table row :   "+reviewCartTabletr.getText());
		List<WebElement> reviewCartTableTr = reviewCartTabletr.findElements(By.tagName("tr"));
		ProductDetails product = null;
    	for(WebElement reviewcarttable : reviewCartTableTr){
    		String section = reviewcarttable.getAttribute("data-month");
    		System.out.println("section is----->>>>>>>"+section);
    		List<WebElement> tabletd = reviewcarttable.findElements(By.tagName("td"));
    		if( !tabletd.isEmpty()){
	    		switch(String.valueOf(section)){
	    			case "sfo":
	    				if(null != cartSection && (cartSection.equals("YTOItems") || cartSection.equals("TEItems")))
	    					break;
	    				// SFO section in review cart page
	    				if(null != studentName && !studentName.isEmpty() ){
	    					System.out.println("coming to SFO in Review cart");
	    					product = new ProductDetails();
	    		    		product.setStudentname(studentName);
	    		    		product.setItemnumber(tabletd.get(0).getText());
	    		    		product.setItemtitle(tabletd.get(1).getText());
	    		    		product.setItemflyer(tabletd.get(2).getText());
	    		    		product.setItemprice(tabletd.get(4).getText());
	    		    		if(tabletd.get(5).findElements(By.tagName("input")).size()==0){
	    		    		product.setItemqty(tabletd.get(5).getText());
	    		    		}
	    		    		else{
	    		    			product.setItemqty(tabletd.get(5).findElement(By.tagName("input")).getAttribute("value"));
	    		    		}
	    				}
	    				break;
	    			case "student":
	    				if(null != cartSection && (cartSection.equals("SFOItems") || cartSection.equals("TEItems")))
	    					break;
	    				// YTO section in review cart page
	    				System.out.println("coming to YTO in REview cart if combination of SFO and YTO");
	    					System.out.println("Item id of yto in review cart is22222:"+tabletd.get(0).getText());
	    					product = new ProductDetails();
		    				product.setItemnumber(tabletd.get(0).getText());
				    		product.setItemtitle(tabletd.get(1).getText());
				    		product.setItemflyer(tabletd.get(2).getText());
				    		product.setItemprice(tabletd.get(3).getText());
	    		    		if(tabletd.get(4).findElements(By.tagName("input")).size()==0){
	    		    		product.setItemqty(tabletd.get(4).getText());
	    		    		}
	    		    		else{
	    		    			product.setItemqty(tabletd.get(4).findElement(By.tagName("input")).getAttribute("value"));
	    		    		}
	    		    		
	    		    		/*System.out.println("Item title of yto in review cart is:"+tabletd.get(1).getText());
	    		    		System.out.println("Item flyer of yto in review cart is:"+tabletd.get(2).getText());
	    		    		System.out.println("Item price of yto in review cart is:"+tabletd.get(3).getText());
	    		    		System.out.println("Item qty of yto in review cart is:"+tabletd.get(4).findElement(By.tagName("input")).getAttribute("value"));*/
	    				break;
	    				
	    			case "teacher":
	    				if(null != cartSection && (cartSection.equals("YTOItems") || cartSection.equals("SFOItems")))
	    					break;
	    				// Teacher section in review cart page
	    				System.out.println("coming to TE in Review cart");
	    					System.out.println("Item id of te in review cart is22222:"+tabletd.get(0).getText());
	    					product = new ProductDetails();
		    				product.setItemnumber(tabletd.get(0).getText());
				    		product.setItemtitle(tabletd.get(1).getText());
				    		product.setItemflyer(tabletd.get(2).getText());
				    		product.setItemprice(tabletd.get(3).getText());
	    		    		if(tabletd.get(4).findElements(By.tagName("input")).size()==0){
	    		    		product.setItemqty(tabletd.get(4).getText());
	    		    		}
	    		    		else{
	    		    			product.setItemqty(tabletd.get(4).findElement(By.tagName("input")).getAttribute("value"));
	    		    		}
	    		    		System.out.println("Item id of te in review cart is:"+tabletd.get(0).getText());
	    		    		System.out.println("Item title of te in review cart is:"+tabletd.get(1).getText());
	    		    		System.out.println("Item flyer of te in review cart is:"+tabletd.get(2).getText());
	    		    		System.out.println("Item price of te in review cart is:"+tabletd.get(3).getText());
	    		    		//System.out.println("Item qty of te in review cart is:"+tabletd.get(4).findElement(By.tagName("input")).getAttribute("value"));
	    				break;
	    				
	    			case "null":
	    				String studentname = tabletd.get(1).getAttribute("class");
	    				
	    				if(studentname.trim().equals("title")){
	    					//SOO Page
	    					product = new ProductDetails();
	    					product.setStudentname(studentName);
	    					product.setDateOrdered(dateordered);
	    		    		product.setItemnumber (tabletd.get(0).getText());
	    		    		product.setItemtitle  (tabletd.get(1).getText());
	    		    		product.setItemflyer  (tabletd.get(2).getText());
	    		    		product.setItemprice  (tabletd.get(3).getText());
	    		    		if(tabletd.get(4).findElements(By.tagName("input")).size()==0){
	    		    		product.setItemqty(tabletd.get(4).getText());
	    		    		}
	    		    		else{
	    		    			product.setItemqty(tabletd.get(4).findElement(By.tagName("input")).getAttribute("value"));
	    		    		}
	    		    		
	    		    		//System.out.println("student name is:"+tabletd.get(1).getText());
	    		    		System.out.println("Item id in soo is:"+tabletd.get(0).getText());
	    		    		System.out.println("Item title in soo is:"+tabletd.get(1).getText());
	    		    		System.out.println("Item flyer in soo is:"+tabletd.get(2).getText());
	    		    		System.out.println("Item price in soo is:"+tabletd.get(3).getText());
	    		    		System.out.println("Item qty in soo is:"+tabletd.get(4).getText());
	    		    		
	    				}
	    				
	    				
	    				else if(studentname.trim().equals("studentName")){
	    					//SFO Page
	    					product = new ProductDetails();
	    		    		product.setStudentname(tabletd.get(1).getText());
	    		    		product.setItemnumber (tabletd.get(2).getText());
	    		    		product.setItemtitle  (tabletd.get(3).getText());
	    		    		product.setItemflyer  (tabletd.get(4).getText());
	    		    		product.setItemprice  (tabletd.get(6).getText());
	    		    		if(tabletd.get(7).findElements(By.tagName("input")).size()==0){
	    		    		product.setItemqty(tabletd.get(7).getText());
	    		    		}
	    		    		else{
	    		    			product.setItemqty(tabletd.get(7).findElement(By.tagName("input")).getAttribute("value"));
	    		    		}
	    		    		
	    		    		/*System.out.println("student name is:"+tabletd.get(1).getText());
	    		    		System.out.println("Item id in yto is:"+tabletd.get(2).getText());
	    		    		System.out.println("Item title in yto is:"+tabletd.get(3).getText());
	    		    		System.out.println("Item flyer in yto is:"+tabletd.get(4).getText());
	    		    		System.out.println("Item price in yto is:"+tabletd.get(6).getText());
	    		    		System.out.println("Item qty in yto is:"+tabletd.get(7).findElement(By.tagName("input")).getAttribute("value"));
	    		    		*/
	    				}else{
	    					//YTO By Item
	    					if(!tabletd.get(3).getText().equals("FREE"))
	    					{
	    					product = new ProductDetails();
	    					product.setStudentname(studentName);
	    		    		product.setItemnumber (tabletd.get(1).getText());
	    		    		product.setItemtitle  (tabletd.get(2).getText());
	    		    		product.setItemflyer  (tabletd.get(3).getText());
	    		    		product.setItemprice  (tabletd.get(4).getText());
	    		    		if(tabletd.get(5).findElements(By.tagName("input")).size()==0){
	    		    		product.setItemqty(tabletd.get(5).getText());
	    		    		}
	    		    		else{
	    		    			product.setItemqty(tabletd.get(5).findElement(By.tagName("input")).getAttribute("value"));
	    		    		}
	    					
	    		    		System.out.println("Item id in yto is:"+tabletd.get(1).getText());
	    		    		System.out.println("Item title in yto is:"+tabletd.get(2).getText());
	    		    		System.out.println("Item flyer in yto is:"+tabletd.get(3).getText());
	    		    		System.out.println("Item price in yto is:"+tabletd.get(4).getText());
	    		    		System.out.println("Item qty in yto is:"+tabletd.get(5).findElement(By.tagName("input")).getAttribute("value"));
	    					}
	    		    		
	    				}
	    				break;
	    			default:
	    				// Teacher Exclusive section in review cart page
	    					if(null != cartSection && (cartSection.equals("YTOItems") || cartSection.equals("SFOItems")))
	    						break;
	    					product = new ProductDetails();
		    				product.setItemnumber(tabletd.get(0).getText());
				    		product.setItemtitle(tabletd.get(1).getText());
				    		product.setItemflyer(tabletd.get(2).getText());
				    		product.setItemprice(tabletd.get(3).getText());
	    		    		if(tabletd.get(4).findElements(By.tagName("input")).size()==0){
	    		    		product.setItemqty(tabletd.get(4).getText());
	    		    		}
	    		    		else{
	    		    			product.setItemqty(tabletd.get(4).findElement(By.tagName("input")).getAttribute("value"));
	    		    		}
	    				break;
	    		}
		    	if( null != product){
		    		productList.add(product);
		    		product = null;
		    	}
    		}
    	}
		return productList;
    }
	
	
	
	public List<ProductDetails> getProductList(String dateordered, String studentName, WebElement reviewCartTabletr, String cartSection){
		List<ProductDetails> productList = new ArrayList<ProductDetails>();
		System.out.println("cart table row :   "+reviewCartTabletr.getText());
		List<WebElement> reviewCartTableTr = reviewCartTabletr.findElements(By.tagName("tr"));
		ProductDetails product = null;
    	for(WebElement reviewcarttable : reviewCartTableTr){
    		String section = reviewcarttable.getAttribute("data-month");
    		System.out.println("section is----->>>>>>>"+section);
    		List<WebElement> tabletd = reviewcarttable.findElements(By.tagName("td"));
    		if( !tabletd.isEmpty()){
	    		switch(String.valueOf(section)){
	    			case "sfo":
	    				if(null != cartSection && (cartSection.equals("YTOItems") || cartSection.equals("TEItems")))
	    					break;
	    				// SFO section in review cart page
	    				if(null != studentName && !studentName.isEmpty() ){
	    					System.out.println("coming to SFO in Review cart");
	    					product = new ProductDetails();
	    		    		product.setStudentname(studentName);
	    		    		product.setItemnumber(tabletd.get(0).getText());
	    		    		product.setItemtitle(tabletd.get(1).getText());
	    		    		product.setItemflyer(tabletd.get(2).getText());
	    		    		product.setItemprice(tabletd.get(4).getText());
	    		    		if(tabletd.get(5).findElements(By.tagName("input")).size()==0){
	    		    		product.setItemqty(tabletd.get(5).getText());
	    		    		}
	    		    		else{
	    		    			product.setItemqty(tabletd.get(5).findElement(By.tagName("input")).getAttribute("value"));
	    		    		}
	    				}
	    				break;
	    			case "student":
	    				if(null != cartSection && (cartSection.equals("SFOItems") || cartSection.equals("TEItems")))
	    					break;
	    				// YTO section in review cart page
	    				System.out.println("coming to YTO in REview cart if combination of SFO and YTO");
	    					System.out.println("Item id of yto in review cart is22222:"+tabletd.get(0).getText());
	    					product = new ProductDetails();
		    				product.setItemnumber(tabletd.get(0).getText());
				    		product.setItemtitle(tabletd.get(1).getText());
				    		product.setItemflyer(tabletd.get(2).getText());
				    		product.setItemprice(tabletd.get(3).getText());
	    		    		if(tabletd.get(4).findElements(By.tagName("input")).size()==0){
	    		    		product.setItemqty(tabletd.get(4).getText());
	    		    		}
	    		    		else{
	    		    			product.setItemqty(tabletd.get(4).findElement(By.tagName("input")).getAttribute("value"));
	    		    		}
	    		    		
	    		    		/*System.out.println("Item title of yto in review cart is:"+tabletd.get(1).getText());
	    		    		System.out.println("Item flyer of yto in review cart is:"+tabletd.get(2).getText());
	    		    		System.out.println("Item price of yto in review cart is:"+tabletd.get(3).getText());
	    		    		System.out.println("Item qty of yto in review cart is:"+tabletd.get(4).findElement(By.tagName("input")).getAttribute("value"));*/
	    				break;
	    				
	    			case "teacher":
	    				if(null != cartSection && (cartSection.equals("YTOItems") || cartSection.equals("SFOItems")))
	    					break;
	    				// Teacher section in review cart page
	    				System.out.println("coming to TE in Review cart");
	    					System.out.println("Item id of te in review cart is22222:"+tabletd.get(0).getText());
	    					product = new ProductDetails();
		    				product.setItemnumber(tabletd.get(0).getText());
				    		product.setItemtitle(tabletd.get(1).getText());
				    		product.setItemflyer(tabletd.get(2).getText());
				    		product.setItemprice(tabletd.get(3).getText());
	    		    		if(tabletd.get(4).findElements(By.tagName("input")).size()==0){
	    		    		product.setItemqty(tabletd.get(4).getText());
	    		    		}
	    		    		else{
	    		    			product.setItemqty(tabletd.get(4).findElement(By.tagName("input")).getAttribute("value"));
	    		    		}
	    		    		System.out.println("Item id of te in review cart is:"+tabletd.get(0).getText());
	    		    		System.out.println("Item title of te in review cart is:"+tabletd.get(1).getText());
	    		    		System.out.println("Item flyer of te in review cart is:"+tabletd.get(2).getText());
	    		    		System.out.println("Item price of te in review cart is:"+tabletd.get(3).getText());
	    		    		//System.out.println("Item qty of te in review cart is:"+tabletd.get(4).findElement(By.tagName("input")).getAttribute("value"));
	    				break;
	    				
	    			case "null":
	    				String studentname = tabletd.get(1).getAttribute("class");
	    				
	    				if(studentname.trim().equals("title")){
	    					//SOO Page
	    					product = new ProductDetails();
	    					product.setStudentname(studentName);
	    					String dateordered1 = dateordered;
	    					dateordered = dateordered1.replaceAll("Date Placed ", "");
	    					System.out.println("Date ordered from soo is:"+dateordered);
	    					
	    					product.setDateOrdered(dateordered);
	    		    		product.setItemnumber (tabletd.get(0).getText());
	    		    		product.setItemtitle  (tabletd.get(1).getText());
	    		    		product.setItemflyer  (tabletd.get(2).getText());
	    		    		product.setItemprice  (tabletd.get(3).getText());
	    		    		if(tabletd.get(4).findElements(By.tagName("input")).size()==0){
	    		    		product.setItemqty(tabletd.get(4).getText());
	    		    		}
	    		    		else{
	    		    			product.setItemqty(tabletd.get(4).findElement(By.tagName("input")).getAttribute("value"));
	    		    		}
	    		    		
	    		    		//System.out.println("student name is:"+tabletd.get(1).getText());
	    		    		System.out.println("Item id in soo is:"+tabletd.get(0).getText());
	    		    		System.out.println("Item title in soo is:"+tabletd.get(1).getText());
	    		    		System.out.println("Item flyer in soo is:"+tabletd.get(2).getText());
	    		    		System.out.println("Item price in soo is:"+tabletd.get(3).getText());
	    		    		System.out.println("Item qty in soo is:"+tabletd.get(4).getText());
	    		    		
	    				}
	    				
	    				
	    				else if(studentname.trim().equals("studentName")){
	    					//SFO Page
	    					product = new ProductDetails();
	    		    		product.setStudentname(tabletd.get(1).getText());
	    		    		product.setItemnumber (tabletd.get(2).getText());
	    		    		product.setItemtitle  (tabletd.get(3).getText());
	    		    		product.setItemflyer  (tabletd.get(4).getText());
	    		    		product.setItemprice  (tabletd.get(6).getText());
	    		    		if(tabletd.get(7).findElements(By.tagName("input")).size()==0){
	    		    		product.setItemqty(tabletd.get(7).getText());
	    		    		}
	    		    		else{
	    		    			product.setItemqty(tabletd.get(7).findElement(By.tagName("input")).getAttribute("value"));
	    		    		}
	    		    		
	    		    		/*System.out.println("student name is:"+tabletd.get(1).getText());
	    		    		System.out.println("Item id in yto is:"+tabletd.get(2).getText());
	    		    		System.out.println("Item title in yto is:"+tabletd.get(3).getText());
	    		    		System.out.println("Item flyer in yto is:"+tabletd.get(4).getText());
	    		    		System.out.println("Item price in yto is:"+tabletd.get(6).getText());
	    		    		System.out.println("Item qty in yto is:"+tabletd.get(7).findElement(By.tagName("input")).getAttribute("value"));
	    		    		*/
	    				}else{
	    					//YTO By Item
	    					if(!tabletd.get(3).getText().equals("FREE"))
	    					{
	    					product = new ProductDetails();
	    					product.setStudentname(studentName);
	    		    		product.setItemnumber (tabletd.get(1).getText());
	    		    		product.setItemtitle  (tabletd.get(2).getText());
	    		    		product.setItemflyer  (tabletd.get(3).getText());
	    		    		product.setItemprice  (tabletd.get(4).getText());
	    		    		if(tabletd.get(5).findElements(By.tagName("input")).size()==0){
	    		    		product.setItemqty(tabletd.get(5).getText());
	    		    		}
	    		    		else{
	    		    			product.setItemqty(tabletd.get(5).findElement(By.tagName("input")).getAttribute("value"));
	    		    		}
	    					
	    		    		System.out.println("Item id in yto is:"+tabletd.get(1).getText());
	    		    		System.out.println("Item title in yto is:"+tabletd.get(2).getText());
	    		    		System.out.println("Item flyer in yto is:"+tabletd.get(3).getText());
	    		    		System.out.println("Item price in yto is:"+tabletd.get(4).getText());
	    		    		System.out.println("Item qty in yto is:"+tabletd.get(5).findElement(By.tagName("input")).getAttribute("value"));
	    					}
	    		    		
	    				}
	    				break;
	    			default:
	    				// Teacher Exclusive section in review cart page
	    					if(null != cartSection && (cartSection.equals("YTOItems") || cartSection.equals("SFOItems")))
	    						break;
	    					product = new ProductDetails();
		    				product.setItemnumber(tabletd.get(0).getText());
				    		product.setItemtitle(tabletd.get(1).getText());
				    		product.setItemflyer(tabletd.get(2).getText());
				    		product.setItemprice(tabletd.get(3).getText());
	    		    		if(tabletd.get(4).findElements(By.tagName("input")).size()==0){
	    		    		product.setItemqty(tabletd.get(4).getText());
	    		    		}
	    		    		else{
	    		    			product.setItemqty(tabletd.get(4).findElement(By.tagName("input")).getAttribute("value"));
	    		    		}
	    				break;
	    		}
		    	if( null != product){
		    		productList.add(product);
		    		product = null;
		    	}
    		}
    	}
		return productList;
    }
	
	
	
	/*public List<ProductDetails> getProductList(String studentName, WebElement reviewCartTabletr, String cartSection){
		List<ProductDetails> productList = new ArrayList<ProductDetails>();
		System.out.println("cart table row :   "+reviewCartTabletr.getText());
		List<WebElement> reviewCartTableTr = reviewCartTabletr.findElements(By.tagName("tr"));
		ProductDetails product = null;
    	for(WebElement reviewcarttable : reviewCartTableTr){
    		String section = reviewcarttable.getAttribute("data-month");
    		System.out.println("section is----->>>>>>>"+section);
    		List<WebElement> tabletd = reviewcarttable.findElements(By.tagName("td"));
    		if( !tabletd.isEmpty()){
	    		switch(String.valueOf(section)){
	    			case "sfo":
	    				if(null != cartSection && (cartSection.equals("YTOItems") || cartSection.equals("TEItems")))
	    					break;
	    				// SFO section in review cart page
	    				if(null != studentName && !studentName.isEmpty() ){
	    					System.out.println("coming to SFO in Review cart");
	    					product = new ProductDetails();
	    		    		product.setStudentname(studentName);
	    		    		product.setItemnumber(tabletd.get(0).getText());
	    		    		product.setItemtitle(tabletd.get(1).getText());
	    		    		product.setItemflyer(tabletd.get(2).getText());
	    		    		product.setItemprice(tabletd.get(4).getText());
	    		    		if(tabletd.get(5).findElements(By.tagName("input")).size()==0){
	    		    		product.setItemqty(tabletd.get(5).getText());
	    		    		}
	    		    		else{
	    		    			product.setItemqty(tabletd.get(5).findElement(By.tagName("input")).getAttribute("value"));
	    		    		}
	    				}
	    				break;
	    			case "student":
	    				if(null != cartSection && (cartSection.equals("SFOItems") || cartSection.equals("TEItems")))
	    					break;
	    				// YTO section in review cart page
	    				System.out.println("coming to YTO in REview cart if combination of SFO and YTO");
	    					System.out.println("Item id of yto in review cart is22222:"+tabletd.get(0).getText());
	    					product = new ProductDetails();
		    				product.setItemnumber(tabletd.get(0).getText());
				    		product.setItemtitle(tabletd.get(1).getText());
				    		product.setItemflyer(tabletd.get(2).getText());
				    		product.setItemprice(tabletd.get(3).getText());
	    		    		if(tabletd.get(4).findElements(By.tagName("input")).size()==0){
	    		    		product.setItemqty(tabletd.get(4).getText());
	    		    		}
	    		    		else{
	    		    			product.setItemqty(tabletd.get(4).findElement(By.tagName("input")).getAttribute("value"));
	    		    		}
	    		    		
	    		    		System.out.println("Item title of yto in review cart is:"+tabletd.get(1).getText());
	    		    		System.out.println("Item flyer of yto in review cart is:"+tabletd.get(2).getText());
	    		    		System.out.println("Item price of yto in review cart is:"+tabletd.get(3).getText());
	    		    		System.out.println("Item qty of yto in review cart is:"+tabletd.get(4).findElement(By.tagName("input")).getAttribute("value"));
	    				break;
	    				
	    			case "teacher":
	    				if(null != cartSection && (cartSection.equals("YTOItems") || cartSection.equals("SFOItems")))
	    					break;
	    				// Teacher section in review cart page
	    				System.out.println("coming to TE in Review cart");
	    					System.out.println("Item id of te in review cart is22222:"+tabletd.get(0).getText());
	    					product = new ProductDetails();
		    				product.setItemnumber(tabletd.get(0).getText());
				    		product.setItemtitle(tabletd.get(1).getText());
				    		product.setItemflyer(tabletd.get(2).getText());
				    		product.setItemprice(tabletd.get(3).getText());
	    		    		if(tabletd.get(4).findElements(By.tagName("input")).size()==0){
	    		    		product.setItemqty(tabletd.get(4).getText());
	    		    		}
	    		    		else{
	    		    			product.setItemqty(tabletd.get(4).findElement(By.tagName("input")).getAttribute("value"));
	    		    		}
	    		    		System.out.println("Item id of te in review cart is:"+tabletd.get(0).getText());
	    		    		System.out.println("Item title of te in review cart is:"+tabletd.get(1).getText());
	    		    		System.out.println("Item flyer of te in review cart is:"+tabletd.get(2).getText());
	    		    		System.out.println("Item price of te in review cart is:"+tabletd.get(3).getText());
	    		    		//System.out.println("Item qty of te in review cart is:"+tabletd.get(4).findElement(By.tagName("input")).getAttribute("value"));
	    				break;
	    				
	    			case "null":
	    				String studentname = tabletd.get(1).getAttribute("class");
	    				if(studentname.trim().equals("studentName")){
	    					//SFO Page
	    					product = new ProductDetails();
	    		    		product.setStudentname(tabletd.get(1).getText());
	    		    		product.setItemnumber (tabletd.get(2).getText());
	    		    		product.setItemtitle  (tabletd.get(3).getText());
	    		    		product.setItemflyer  (tabletd.get(4).getText());
	    		    		product.setItemprice  (tabletd.get(6).getText());
	    		    		if(tabletd.get(7).findElements(By.tagName("input")).size()==0){
	    		    		product.setItemqty(tabletd.get(7).getText());
	    		    		}
	    		    		else{
	    		    			product.setItemqty(tabletd.get(7).findElement(By.tagName("input")).getAttribute("value"));
	    		    		}
	    		    		
	    		    		System.out.println("student name is:"+tabletd.get(1).getText());
	    		    		System.out.println("Item id in yto is:"+tabletd.get(2).getText());
	    		    		System.out.println("Item title in yto is:"+tabletd.get(3).getText());
	    		    		System.out.println("Item flyer in yto is:"+tabletd.get(4).getText());
	    		    		System.out.println("Item price in yto is:"+tabletd.get(6).getText());
	    		    		System.out.println("Item qty in yto is:"+tabletd.get(7).findElement(By.tagName("input")).getAttribute("value"));
	    		    		
	    				}else{
	    					//YTO By Item
	    					if(!tabletd.get(3).getText().equals("FREE"))
	    					{
	    					product = new ProductDetails();
	    					product.setStudentname(studentName);
	    		    		product.setItemnumber (tabletd.get(1).getText());
	    		    		product.setItemtitle  (tabletd.get(2).getText());
	    		    		product.setItemflyer  (tabletd.get(3).getText());
	    		    		product.setItemprice  (tabletd.get(4).getText());
	    		    		if(tabletd.get(5).findElements(By.tagName("input")).size()==0){
	    		    		product.setItemqty(tabletd.get(5).getText());
	    		    		}
	    		    		else{
	    		    			product.setItemqty(tabletd.get(5).findElement(By.tagName("input")).getAttribute("value"));
	    		    		}
	    					
	    		    		System.out.println("Item id in yto is:"+tabletd.get(1).getText());
	    		    		System.out.println("Item title in yto is:"+tabletd.get(2).getText());
	    		    		System.out.println("Item flyer in yto is:"+tabletd.get(3).getText());
	    		    		System.out.println("Item price in yto is:"+tabletd.get(4).getText());
	    		    		System.out.println("Item qty in yto is:"+tabletd.get(5).findElement(By.tagName("input")).getAttribute("value"));
	    					}
	    		    		
	    				}
	    				break;
	    			default:
	    				// Teacher Exclusive section in review cart page
	    					if(null != cartSection && (cartSection.equals("YTOItems") || cartSection.equals("SFOItems")))
	    						break;
	    					product = new ProductDetails();
		    				product.setItemnumber(tabletd.get(0).getText());
				    		product.setItemtitle(tabletd.get(1).getText());
				    		product.setItemflyer(tabletd.get(2).getText());
				    		product.setItemprice(tabletd.get(3).getText());
	    		    		if(tabletd.get(4).findElements(By.tagName("input")).size()==0){
	    		    		product.setItemqty(tabletd.get(4).getText());
	    		    		}
	    		    		else{
	    		    			product.setItemqty(tabletd.get(4).findElement(By.tagName("input")).getAttribute("value"));
	    		    		}
	    				break;
	    		}
		    	if( null != product){
		    		productList.add(product);
		    		product = null;
		    	}
    		}
    	}
		return productList;
    }*/
	
	//storing TE item details in PDP
	public ProductDetails getProductList_te(){
		ProductDetails product = null;
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		ProductDetailPage pdppage = new ProductDetailPage();
	    					product = new ProductDetails();
	    					PauseUtil.waitForAjaxToComplete(2500);
	    			        PauseUtil.pause(2000);
	    					String itemnumber1 = studentFlyerOrdersPage.readitemNo_PDPpage().getText();
	    					int i = itemnumber1.indexOf(' ');
	    					String itemnumber12 = itemnumber1.substring(0, i);
	    					String itemnumber = itemnumber12.substring(1);
	    					product.setItemnumber(itemnumber);
	    					product.setItemtitle(pdppage.getLblProductName().getText());
	    		    		product.setItemflyer(pdppage.getItemValue().getText());
	    		    		product.setItemprice(pdppage.getLblProductPrice().getText());
	    		    		product.setItemqty(pdppage.getTxtQuantity().getAttribute("value"));
	    		    		
	    		    		System.out.println("Item id in TE is:"+itemnumber);
	    		    		System.out.println("Item title in TE is:"+pdppage.getLblProductName().getText());
	    		    		System.out.println("Item flyer in TE is:"+pdppage.getItemValue().getText());
	    		    		System.out.println("Item price in TE is:"+pdppage.getLblProductPrice().getText());
	    		    		System.out.println("Item qty in TE is:"+pdppage.getTxtQuantity().getAttribute("value"));
		    	return product;
		    	
    	}
	
	
	//storing SOO item details from excel
		public List<ProductDetails> getProductList_excel(String Sheet){
			List<ProductDetails> productList = new ArrayList<ProductDetails>();
			ProductDetails product =  null;
			PauseUtil.waitForAjaxToComplete(2500);
	        PauseUtil.pause(2000);
	       try {
	        	int LastRow=ExLib.getLaRow(Sheet);
	        	System.out.println("Last row in the excel is:"+LastRow);
	        	
	        	for (int i = 1; i <= LastRow; i++) {
	        		product =  new ProductDetails();
	        		
	        		product.setStudentname(ExLib.getExcelData_2(Sheet, i, 0));
	        		product.setDateOrdered(ExLib.getExcelData_2(Sheet, i, 1));
	        		product.setItemnumber(ExLib.getExcelData_2(Sheet, i, 2));
					product.setItemtitle(ExLib.getExcelData_2(Sheet, i, 3));
		    		product.setItemflyer(ExLib.getExcelData_2(Sheet, i, 4));
		    		product.setItemprice(ExLib.getExcelData_2(Sheet, i, 5));
		    		product.setItemqty(ExLib.getExcelData_2(Sheet, i, 6));
		    		
		    		System.out.println("Childname is:"+ExLib.getExcelData_2(Sheet, i, 0));
		    		System.out.println("Date Ordered is:"+ExLib.getExcelData_2(Sheet, i, 1));
		    		System.out.println("Item id in TE is:"+ExLib.getExcelData_2(Sheet, i, 2));
		    		System.out.println("Item title in TE is:"+ExLib.getExcelData_2(Sheet, i, 3));
		    		System.out.println("Item flyer in TE is:"+ExLib.getExcelData_2(Sheet, i, 4));
		    		System.out.println("Item price in TE is:"+ExLib.getExcelData_2(Sheet, i, 5));
		    		System.out.println("Item qty in TE is:"+ExLib.getExcelData_2(Sheet, i, 6));

		    		if( null != product){
		    			productList.add(product);
		    			product = null;
		    		}		
	        	}
				} catch (Exception e) {
					// TODO: handle exception
				}
    	return productList;
    	}
		
		
		
		//storing SOO item details from excel first row
		public List<ProductDetails> getProductList_firstrow_excel(String Sheet){
			List<ProductDetails> productList = new ArrayList<ProductDetails>();
			ProductDetails product =  null;
			PauseUtil.waitForAjaxToComplete(2500);
	        PauseUtil.pause(2000);
	       try {
	        	int LastRow=ExLib.getLaRow(Sheet);
	        	System.out.println("Last row in the excel is:"+LastRow);
	        	
	        	for (int i = 1; i<2; i++) {
	        		product =  new ProductDetails();
	        		
	        		product.setStudentname(ExLib.getExcelData_2(Sheet, i, 0));
	        		product.setDateOrdered(ExLib.getExcelData_2(Sheet, i, 1));
	        		product.setItemnumber(ExLib.getExcelData_2(Sheet, i, 2));
					product.setItemtitle(ExLib.getExcelData_2(Sheet, i, 3));
		    		product.setItemflyer(ExLib.getExcelData_2(Sheet, i, 4));
		    		product.setItemprice(ExLib.getExcelData_2(Sheet, i, 5));
		    		product.setItemqty(ExLib.getExcelData_2(Sheet, i, 6));
		    		
		    		System.out.println("Childname is:"+ExLib.getExcelData_2(Sheet, i, 0));
		    		System.out.println("Date Ordered is:"+ExLib.getExcelData_2(Sheet, i, 1));
		    		System.out.println("Item id in TE is:"+ExLib.getExcelData_2(Sheet, i, 2));
		    		System.out.println("Item title in TE is:"+ExLib.getExcelData_2(Sheet, i, 3));
		    		System.out.println("Item flyer in TE is:"+ExLib.getExcelData_2(Sheet, i, 4));
		    		System.out.println("Item price in TE is:"+ExLib.getExcelData_2(Sheet, i, 5));
		    		System.out.println("Item qty in TE is:"+ExLib.getExcelData_2(Sheet, i, 6));

		    		if( null != product){
		    			productList.add(product);
		    			product = null;
		    		}		
	        	}
				} catch (Exception e) {
					// TODO: handle exception
				}
    	return productList;
    	}
				
				
		//storing SOO item details from excel first row
		public List<ProductDetails> getProductList_secondrow_excel(String Sheet){
			List<ProductDetails> productList = new ArrayList<ProductDetails>();
			ProductDetails product =  null;
			PauseUtil.waitForAjaxToComplete(2500);
	        PauseUtil.pause(2000);
	       try {
	        	int LastRow=ExLib.getLaRow(Sheet);
	        	System.out.println("Last row in the excel is:"+LastRow);
	        	
	        	for (int i = 2; i<3; i++) {
	        		product =  new ProductDetails();
	        		
	        		product.setStudentname(ExLib.getExcelData_2(Sheet, i, 0));
	        		product.setDateOrdered(ExLib.getExcelData_2(Sheet, i, 1));
	        		product.setItemnumber(ExLib.getExcelData_2(Sheet, i, 2));
					product.setItemtitle(ExLib.getExcelData_2(Sheet, i, 3));
		    		product.setItemflyer(ExLib.getExcelData_2(Sheet, i, 4));
		    		product.setItemprice(ExLib.getExcelData_2(Sheet, i, 5));
		    		product.setItemqty(ExLib.getExcelData_2(Sheet, i, 6));
		    		
		    		System.out.println("Childname is:"+ExLib.getExcelData_2(Sheet, i, 0));
		    		System.out.println("Date Ordered is:"+ExLib.getExcelData_2(Sheet, i, 1));
		    		System.out.println("Item id in TE is:"+ExLib.getExcelData_2(Sheet, i, 2));
		    		System.out.println("Item title in TE is:"+ExLib.getExcelData_2(Sheet, i, 3));
		    		System.out.println("Item flyer in TE is:"+ExLib.getExcelData_2(Sheet, i, 4));
		    		System.out.println("Item price in TE is:"+ExLib.getExcelData_2(Sheet, i, 5));
		    		System.out.println("Item qty in TE is:"+ExLib.getExcelData_2(Sheet, i, 6));

		    		if( null != product){
		    			productList.add(product);
		    			product = null;
		    		}		
	        	}
				} catch (Exception e) {
					// TODO: handle exception
				}
    	return productList;
    	}
	
	
		public Boolean compareLists(List<ProductDetails> reviewcartpagelist, List<ProductDetails> pagelist){
			Boolean listMatch = false; 
			if(pagelist.isEmpty()){
				System.out.println("page list is empty");
				return listMatch;
			}
			
			System.out.println("reviewcartpagelist size: "+reviewcartpagelist.size() +" ::pagelist:: "+pagelist.size());
			for (ProductDetails pageProductDetails : pagelist) {
				
				if(null != pageProductDetails.dateordered && !pageProductDetails.dateordered.isEmpty())
				{
					System.out.println("coming inside the SOO review cart page>>>>>>>>>");
					for (ProductDetails reviewcartproductlist : reviewcartpagelist) {
						if(reviewcartproductlist.studentname.equalsIgnoreCase(pageProductDetails.studentname) 
								&& reviewcartproductlist.itemnumber.equalsIgnoreCase(pageProductDetails.itemnumber)
								&& reviewcartproductlist.itemflyer.contains(pageProductDetails.itemflyer) 
								&& reviewcartproductlist.itemprice.equalsIgnoreCase(pageProductDetails.itemprice) 
								&& reviewcartproductlist.itemqty.equalsIgnoreCase(pageProductDetails.itemqty) 
								&& reviewcartproductlist.itemtitle.equalsIgnoreCase(pageProductDetails.itemtitle)
							    && reviewcartproductlist.dateordered.equalsIgnoreCase(pageProductDetails.dateordered))
						{
							listMatch = true;
							break;
						}/*else
							continue;*/
					}
				}
				
				else if(null != pageProductDetails.studentname && !pageProductDetails.studentname.isEmpty())
				{
					System.out.println("coming inside the SFO review cart page>>>>>>>>>");
					for (ProductDetails reviewcartproductlist : reviewcartpagelist) {
						if(reviewcartproductlist.studentname.equalsIgnoreCase(pageProductDetails.studentname) 
								&& reviewcartproductlist.itemnumber.equalsIgnoreCase(pageProductDetails.itemnumber)
								&& reviewcartproductlist.itemflyer.contains(pageProductDetails.itemflyer) 
								&& reviewcartproductlist.itemprice.equalsIgnoreCase(pageProductDetails.itemprice) 
								&& reviewcartproductlist.itemqty.equalsIgnoreCase(pageProductDetails.itemqty) 
								&& reviewcartproductlist.itemtitle.equalsIgnoreCase(pageProductDetails.itemtitle))
						{
							listMatch = true;
							break;
						}/*else
							continue;*/
					}
				}else{
					System.out.println("coming inside the YTO/TE review cart page>>>>>>>>>");
					for (ProductDetails reviewcartproductlist : reviewcartpagelist) {
						System.out.println("Item number for reviewcart in compare list yto:"+reviewcartproductlist.getItemnumber());
						System.out.println("Item number for yto in compare list yto:"+pageProductDetails.getItemnumber());
						if(reviewcartproductlist.itemnumber.equalsIgnoreCase(pageProductDetails.itemnumber) 
								&& reviewcartproductlist.itemflyer.contains(pageProductDetails.itemflyer)
								&& reviewcartproductlist.itemprice.equalsIgnoreCase(pageProductDetails.itemprice) 
								&& reviewcartproductlist.itemqty.equalsIgnoreCase(pageProductDetails.itemqty)
								&& reviewcartproductlist.itemtitle.equalsIgnoreCase(pageProductDetails.itemtitle))
						{
							listMatch = true;
							break;
						}/*else
							continue;*/
					}
				}
			}
			return listMatch;
		}
		
		
		
	/*public Boolean compareLists(List<ProductDetails> reviewcartpagelist, List<ProductDetails> pagelist){
		Boolean listMatch = false; 
		if(pagelist.isEmpty()){
			System.out.println("page list is empty");
			return listMatch;
		}
		
		System.out.println("reviewcartpagelist size: "+reviewcartpagelist.size() +" ::pagelist:: "+pagelist.size());
		for (ProductDetails pageProductDetails : pagelist) {
			if(null != pageProductDetails.studentname && !pageProductDetails.studentname.isEmpty())
			{
				System.out.println("coming inside the SFO review cart page>>>>>>>>>");
				for (ProductDetails reviewcartproductlist : reviewcartpagelist) {
					if(reviewcartproductlist.studentname.equalsIgnoreCase(pageProductDetails.studentname) 
							&& reviewcartproductlist.itemnumber.equalsIgnoreCase(pageProductDetails.itemnumber)
							&& reviewcartproductlist.itemflyer.contains(pageProductDetails.itemflyer) 
							&& reviewcartproductlist.itemprice.equalsIgnoreCase(pageProductDetails.itemprice) 
							&& reviewcartproductlist.itemqty.equalsIgnoreCase(pageProductDetails.itemqty) 
							&& reviewcartproductlist.itemtitle.equalsIgnoreCase(pageProductDetails.itemtitle))
					{
						listMatch = true;
						break;
					}else
						continue;
				}
			}else{
				System.out.println("coming inside the YTO/TE review cart page>>>>>>>>>");
				for (ProductDetails reviewcartproductlist : reviewcartpagelist) {
					System.out.println("Item number for reviewcart in compare list yto:"+reviewcartproductlist.getItemnumber());
					System.out.println("Item number for yto in compare list yto:"+pageProductDetails.getItemnumber());
					if(reviewcartproductlist.itemnumber.equalsIgnoreCase(pageProductDetails.itemnumber) 
							&& reviewcartproductlist.itemflyer.contains(pageProductDetails.itemflyer)
							&& reviewcartproductlist.itemprice.equalsIgnoreCase(pageProductDetails.itemprice) 
							&& reviewcartproductlist.itemqty.equalsIgnoreCase(pageProductDetails.itemqty)
							&& reviewcartproductlist.itemtitle.equalsIgnoreCase(pageProductDetails.itemtitle))
					{
						listMatch = true;
						break;
					}else
						continue;
				}
			}
		}
		return listMatch;
	}*/
	
	
	public void add_store_sfoitems_singlestudent(){
		productList_sfo = new ArrayList<ProductDetails>();
		if(login.sizeEnter_ClassRoom_Order().size()!=0){
    	login.teacher_navigate_to_SFO();
		}
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_adds_multiple_SFO_items_multipleflyers_for_single_student();
        productList_sfo = getProductList(null, studentFlyerOrdersPage.getsfohometable(), null);
        
        
	}
	
	/*public void add_store_sfoitem_singlestudent(){
		productList_sfo = new ArrayList<ProductDetails>();
		LoginPage login = new LoginPage();
		if(login.sizeEnter_ClassRoom_Order().size()!=0){
    	login.teacher_navigate_to_SFO();
		}
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_adds_SFO_item_for_single_student_free_shipping();
        productList_sfo = getProductList(null, studentFlyerOrdersPage.getsfohometable(), null);
        
        
	}*/
	
	
	public void add_store_sfoitem_singlestudent_another_student(){
		productList_sfo = new ArrayList<ProductDetails>();
		if(login.sizeEnter_ClassRoom_Order().size()!=0){
    	login.teacher_navigate_to_SFO();
		}
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_adds_single_SFO_item_for_single_student_another_student();
        productList_sfo = getProductList(null, studentFlyerOrdersPage.getsfohometable(), null);
        
        
	}
	
	
	public void add_store_sfoitem_singlestudent(){
		productList_sfo = new ArrayList<ProductDetails>();
		if(login.sizeEnter_ClassRoom_Order().size()!=0){
    	login.teacher_navigate_to_SFO();
		}
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_adds_sfo_item_for_single_student();
        productList_sfo = getProductList(null, studentFlyerOrdersPage.getsfohometable(), null);
        
        
	}
	
	
	public void add_store_sfo_freeitem_singlestudent(){
		productList_sfo = new ArrayList<ProductDetails>();
		if(login.sizeEnter_ClassRoom_Order().size()!=0){
    	login.teacher_navigate_to_SFO();
		}
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
    	studentFlyerOrdersPage.teacher_applies_freepick_item_for_single_student_in_sfo_section();
        studentFlyerOrdersPage.teacher_search_select_freePick_item_from_the_list_sfo_section();
        PauseUtil.pause(4000);
        productList_sfo = getProductList(null, studentFlyerOrdersPage.getsfohometable(), null);
        
        
	}
	
	public void teacher_apply_freepick_coupon(){
		if(login.sizeEnter_ClassRoom_Order().size()!=0){
    	login.teacher_navigate_to_SFO();
		}
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
    	studentFlyerOrdersPage.teacher_applies_freepick_item_for_single_student_in_sfo_section();
        PauseUtil.pause(4000);
        
	}
	
	
	public void teacher_select_item_from_sfo_coupon_modal(){
		productList_sfo = new ArrayList<ProductDetails>();
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_search_select_freePick_item_from_the_list_sfo_section();
        PauseUtil.pause(4000);
        productList_sfo = getProductList(null, studentFlyerOrdersPage.getsfohometable(), null);
        
        
	}
	
	public void add_store_sfoitems_multiplestudents(){
		productList_sfo = new ArrayList<ProductDetails>();
		if(login.sizeEnter_ClassRoom_Order().size()!=0){
    	login.teacher_navigate_to_SFO();
		}
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        //studentFlyerOrdersPage.teacher_adds_multiple_SFO_items_multipleflyers_for_multiple_students();
    	//created this method to call details from xml file instead of constant file
        studentFlyerOrdersPage.teacher_adds_multiple_sfo_items_multipleflyers_for_multiple_students_xml();
        PauseUtil.pause(2500);
        productList_sfo = getProductList(null, studentFlyerOrdersPage.getsfohometable(), null);
        
        
	}
	
	
	public void add_store_ytoitems_differentflyers(){
		productList_yto = new ArrayList<ProductDetails>();
		BasePageImpl bp = new BasePageImpl();
		bp.home_button_HomePage().click();
    	login.teacher_navigates_to_YTO();
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_adds_multiple_YTO_items();
        productList_yto = getProductList(null, studentFlyerOrdersPage.getsfohometable(), null);
        
	}
	
	public void add_store_teacherresource_items_ytosection(){
		productList_yto = new ArrayList<ProductDetails>();
		BasePageImpl bp = new BasePageImpl();
		bp.home_button_HomePage().click();
    	login.teacher_navigates_to_YTO();
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_adds_teacherresourceitems_in_ytosection();
        productList_yto = getProductList(null, studentFlyerOrdersPage.getsfohometable(), null);
        
	}
	
	public void add_store_classroomtitle_items_ytosection(){
		productList_yto = new ArrayList<ProductDetails>();
		BasePageImpl bp = new BasePageImpl();
		bp.home_button_HomePage().click();
    	login.teacher_navigates_to_YTO();
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_adds_classroomtitleitems_in_ytosection();
        productList_yto = getProductList(null, studentFlyerOrdersPage.getsfohometable(), null);
        
	}
	
	public void add_store_teacherresource_items_sfosection(){
		productList_sfo = new ArrayList<ProductDetails>();
		if(login.sizeEnter_ClassRoom_Order().size()!=0){
    	login.teacher_navigate_to_SFO();
		}
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_adds_teacherresourceitems_in_sfosection();
        
        
	}
	
	public void add_store_teitems_differentflyers(){
		productList_te = new ArrayList<ProductDetails>();/*
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_add_multiple_teacherExclusive_items_to_cart();*/
		
		PCOD_LoginPage pcod_logpage = new PCOD_LoginPage();
		TeachersHomePage teach_homepage = new TeachersHomePage();
		StudentFlyerOrdersPage stud_page = new StudentFlyerOrdersPage();
		pcod_logpage.pcod_entervalue_textfield(teach_homepage.getTxtTeacherHomeSearch(),
                TestBaseProvider.getTestBase().getTestData().getString("te_itemName1"));
        pcod_logpage.pcod_click_element(teach_homepage.getbtnTeacherHomeSearch());
        PauseUtil.pause(4000);
        //get_teitems_count();
        cartpage.getitem_count_sfo_yto_soo_te_pages("TE");
        productList_te.add(getProductList_te());
		pcod_logpage.pcod_click_element(stud_page.getteacherSearchQuantityAddBtn());
		PauseUtil.pause(1000);
		stud_page.btn_Continue_Shopping_in_popup_search_results_page().click();
		PauseUtil.pause(4000);
		pcod_logpage.pcod_entervalue_textfield(teach_homepage.getTxtTeacherHomeSearch(),
		        TestBaseProvider.getTestBase().getTestData().getString("te_itemName2"));
		pcod_logpage.pcod_click_element(teach_homepage.getbtnTeacherHomeSearch());
		PauseUtil.pause(4000);
		//get_teitems_count();
		cartpage.getitem_count_sfo_yto_soo_te_pages("TE");
		productList_te.add(getProductList_te());
		stud_page.getteacherSearchQuantityAddBtn().click();
		PauseUtil.pause(2500);
        stud_page.getteacherSearchCheckOut().click();
		PauseUtil.pause(4000);
        
	}
	
public void retrieve_data_excel(String Sheet){
	productList_excel = new ArrayList<ProductDetails>();
	
	productList_excel = getProductList_excel(Sheet);
	
}

public void retrieve_firstrow_data_excel(String Sheet){
	productList_excel = new ArrayList<ProductDetails>();
	
	productList_excel = getProductList_firstrow_excel(Sheet);
	
}

public void retrieve_secondrow_data_excel(String Sheet){
	productList_excel = new ArrayList<ProductDetails>();
	
	productList_excel = getProductList_secondrow_excel(Sheet);
	
}
	
	
	public void verify_sfo_iteminformation_checkoutpages(){
		productList_reviewcart = new ArrayList<ProductDetails>();
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		//productList_reviewcart = getProductList(studentFlyerOrdersPage.getreviewcartstudentname().getText(), studentFlyerOrdersPage.CSR_table_StudentClubs_items());
		productList_reviewcart = getProductList(studentFlyerOrdersPage.getreviewcartstudentname().getText(), studentFlyerOrdersPage.CSR_table_StudentClubs_items_list(), "SFOItems");
		Boolean listmatches = compareLists(productList_reviewcart, productList_sfo);
        if(!listmatches){
        Assert.fail("Item details are not matching in ReviewCart page");	
        }
	}
	
	
	public void verify_soo_iteminformation_checkoutpages(){
		productList_soo = new ArrayList<ProductDetails>();
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		//productList_reviewcart = getProductList(studentFlyerOrdersPage.getreviewcartstudentname().getText(), studentFlyerOrdersPage.CSR_table_StudentClubs_items());
		productList_soo = getProductList(studonlinepage.getsooDateOfOrder().getText(),studentFlyerOrdersPage.getreviewcartstudentname().getText(), 
				studentFlyerOrdersPage.CSR_table_StudentClubs_items_list(), "SOOItems");
		Boolean listmatches = compareLists(productList_soo, productList_excel);
        if(!listmatches){
        Assert.fail("Item details are not matching in for SOO");	
        }
	}
	
	public void verify_soo_iteminformation1_checkoutpages(){
		productList_reviewcart = new ArrayList<ProductDetails>();
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		//productList_reviewcart = getProductList(studentFlyerOrdersPage.getreviewcartstudentname().getText(), studentFlyerOrdersPage.CSR_table_StudentClubs_items());
		productList_reviewcart = getProductList(studonlinepage.getsooDateOfOrder().getText(),studentFlyerOrdersPage.getreviewcartstudentname().getText(), studentFlyerOrdersPage.CSR_table_StudentClubs_items_list(), "SFOItems");
		Boolean listmatches = compareLists(productList_reviewcart, productList_soo);
        if(!listmatches){
        Assert.fail("Item details are not matching in ReviewCart page");	
        }
	}
	
	 
	public void verify_yto_iteminformation_checkoutpages(){
		productList_reviewcart_yto = new ArrayList<ProductDetails>();
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		productList_reviewcart_yto = getProductList(null, studentFlyerOrdersPage.CSR_table_StudentClubs_items_list(),"YTOItems");
        //ProductDetails sfoproductdetails = getProduct(null, studentFlyerOrdersPage.CSR_table_StudentClubs_items_list());
        Boolean listmatches = compareLists(productList_reviewcart_yto, productList_yto);
        if(!listmatches){
        Assert.fail("Item details are not matching in ReviewCart page");	
        }
		
	}
	
	
	public void verify_te_iteminformation_checkoutpages(){
		productList_reviewcart_te = new ArrayList<ProductDetails>();
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		productList_reviewcart_te = getProductList(null, studentFlyerOrdersPage.CSR_table_StudentClubs_items_list(),"TEItems");
        Boolean listmatches = compareLists(productList_reviewcart_te, productList_te);
        if(!listmatches){
        Assert.fail("Item details are not matching for TE items in ReviewCart page");	
        }
		
	}
	
	
	
	public List<ProductDetails> get_totals_sfo_yto_te(WebElement sfoytotable){
		List<ProductDetails> subtotal = new ArrayList<ProductDetails>();
		List<WebElement> sfoytotableTr = sfoytotable.findElements(By.tagName("tr"));
		ProductDetails product = null;
    	for(WebElement reviewcarttable : sfoytotableTr){
    		String section = reviewcarttable.getAttribute("data-month");
    		System.out.println("section is----->>>>>>>"+section);
    		List<WebElement> tabletd = reviewcarttable.findElements(By.tagName("td"));
    		
    		switch(String.valueOf(section)){
			case "sfo":
    		String studentname = tabletd.get(1).getAttribute("class");
			if(studentname.trim().equals("studentName")){
				
	    			String price1 = tabletd.get(6).getText();
	    			price1 = price1.substring(1);
	    	        double price =Double.parseDouble(price1);
	    	        
	    	        String qty1 = tabletd.get(7).findElement(By.tagName("input")).getAttribute("value");
	    	        double qty =Double.parseDouble(qty1);
	    	        double subtotal1 = price*qty;
	    	        product.setsubtotal(subtotal1);
	    	        }
			else{
				String price1 = tabletd.get(4).getText();
    			price1 = price1.substring(2);
    	        double price =Double.parseDouble(price1);
    	        
    	        String qty1 = tabletd.get(5).findElement(By.tagName("input")).getAttribute("value");
    	        double qty =Double.parseDouble(qty1);
    	        
    	        double subtotal2 = price*qty;
    	        product.setsubtotal(subtotal2);
			}
			break;
			
			default:
				String price1 = tabletd.get(4).getText();
    			price1 = price1.substring(2);
    	        double price =Double.parseDouble(price1);
    	        
    	        String qty1 = tabletd.get(5).findElement(By.tagName("input")).getAttribute("value");
    	        double qty =Double.parseDouble(qty1);
    	        
    	        double subtotal3 = price*qty;
    	        product.setsubtotal(subtotal3);
	    	    break;     
    		}
	}
    	subtotal.add(product);
		return subtotal;
		
	}
	
	public void add_store_single_ytoitem(){
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		productList_yto = new ArrayList<ProductDetails>();
		BasePageImpl bp = new BasePageImpl();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		//bp.home_button_HomePage().click();
		SCHUtils.clickUsingJavaScript(bp.home_button_HomePage());
    	login.teacher_navigates_to_YTO();
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_adds_single_YTO_item();
        productList_yto = getProductList(null, studentFlyerOrdersPage.getsfohometable(), null);
        
	}
	
	public void add_store_single_ytoitem_from_xml(){
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		productList_yto = new ArrayList<ProductDetails>();
		BasePageImpl bp = new BasePageImpl();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		SCHUtils.clickUsingJavaScript(bp.home_button_HomePage());
		//bp.home_button_HomePage().click();
    	login.teacher_navigates_to_YTO();
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_adds_single_YTO_item_from_xml();
        productList_yto = getProductList(null, studentFlyerOrdersPage.getsfohometable(), null);
        
	}
	
	public void add_store_sfoitems_paid_shiiping_multiplestudents(){
		productList_sfo = new ArrayList<ProductDetails>();
		if(login.sizeEnter_ClassRoom_Order().size()!=0){
    	login.teacher_navigate_to_SFO();
		}
    	IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.teacher_adds_SFO_item_for_Paid_Shipping();
        productList_sfo = getProductList(null, studentFlyerOrdersPage.getsfohometable(), null);

	}
	
	public void add_store_yto_items_different_flyers(){
		productList_yto = new ArrayList<ProductDetails>();
		BasePageImpl bp = new BasePageImpl();
		bp.home_button_HomePage().click();
    	login.teacher_navigates_to_YTO();
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
        studentFlyerOrdersPage.Teacher_adds_multiple_YTO_items_to_cart();
        productList_yto = getProductList(null, studentFlyerOrdersPage.getsfohometable(), null);
        
	}
	
	public void get_sooitems_count(){
		BasePageImpl bp = new BasePageImpl();
		bp.home_button_HomePage().click();
		if(login.sizeEnter_ClassRoom_Order().size()!=0){
    	login.teacher_navigate_to_SOO();
		}
		cartpage.getitem_count_sfo_yto_soo_te_pages("SOO");   
	}
	
	public void get_sfoitems_count(){
		BasePageImpl bp = new BasePageImpl();
		bp.home_button_HomePage().click();
		if(login.sizeEnter_ClassRoom_Order().size()!=0){
    	login.teacher_navigate_to_SFO();
		}
		cartpage.getitem_count_sfo_yto_soo_te_pages("SFO");   
	}
	
	public void get_sfofreepickitems_count(){
		BasePageImpl bp = new BasePageImpl();
		bp.home_button_HomePage().click();
		if(login.sizeEnter_ClassRoom_Order().size()!=0){
    	login.teacher_navigate_to_SFO();
		}
		cartpage.getitem_count_sfo_yto_soo_te_pages("SFOFREEPICK");   
	}
	
	
	public void get_ytoitems_count(){
		BasePageImpl bp = new BasePageImpl();
		bp.home_button_HomePage().click();
		if(login.sizeEnter_ClassRoom_Order().size()!=0){
    	login.teacher_navigates_to_YTO();
		}
		PauseUtil.pause(2500);
		cartpage.getitem_count_sfo_yto_soo_te_pages("YTO");   
	}
	
	
	public void get_teitems_count(){
		
		if(TestBaseProvider.getTestBase().getContext()
				.getProperty("testexecution.tetotalitemcount") != null){
		String exp_teitems_totalcount1 = TestBaseProvider.getTestBase().getContext()
                .getProperty("testexecution.tetotalitemcount").toString();
		int exp_teitems_totalcount = Integer.parseInt(exp_teitems_totalcount1);
		System.out.println("TE items count is --------->>>>>>>>>>>>>>>>>@@@@@@@"+exp_teitems_totalcount);
		}else{
			int exp_teitems_totalcount = 0;
			TestBaseProvider.getTestBase().getContext().setProperty("testexecution.tetotalitemcount",
					Integer.valueOf(exp_teitems_totalcount));
		} 
	}
	
	
	public void teacher_navigates_to_confirm_submitpage_from_homepage() {
		CartPage cartpage = new CartPage();
		TeachersHomePage teacherhomepage = new TeachersHomePage();
		ICheckoutPage_2 checkoutPage = getFactory().getICheckoutPage_2();
		ShippingAndPayment shippingAndPaymentPage =
                getFactory().getICheckoutPage().getShippingAndPaymentSection();
        ICheckoutPage checkoutPage1 = getFactory().getICheckoutPage();
        StudentFlyerOrdersPage studentflyerpage = new StudentFlyerOrdersPage();
        LoginPage loginPage = new LoginPage();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		//if it is in home page, it will click on review cart icon
		if(loginPage.sizeEnter_ClassRoom_Order().size()!=0){
			teacherhomepage.btn_mini_reviewCart().click();
			PauseUtil.waitForAjaxToComplete(2500);
			PauseUtil.pause(2500);
		}
		if(cartpage.sizebtnReviewCart().size()!=0){
			cartpage.btnReviewCart().click();
			PauseUtil.pause(2500);
			}
		productList_soo = new ArrayList<ProductDetails>();
		IStudentFlyerOrdersPage studentFlyerOrdersPage = getFactory().getIStudentFlyerOrdersPage();
		productList_soo = getProductList(studonlinepage.getsooDateOfOrder().getText(),studentFlyerOrdersPage.getreviewcartstudentname().getText(), 
				studentFlyerOrdersPage.CSR_table_StudentClubs_items_list(), "SOOItems");
		cartpage.store_all_information_from_reviewcart_page("SOO");
		cartpage.store_all_information_from_reviewcart_page("SFO");
		cartpage.store_all_information_from_reviewcart_page("YTO");
		cartpage.store_all_information_from_reviewcart_page("TE");
		
		if(studentflyerpage.size_btn_Continue_checkout_ReviewCart_page().size()!=0){
			studentflyerpage.btn_Continue_checkout_ReviewCart_page().click();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		studentflyerpage.btn_Proceed_to_checkout_Promotion_popup().click();
		PauseUtil.pause(2000);
		}
		else{
		cartpage.getLnkRedeemCoupons().click();
		PauseUtil.waitForAjaxToComplete(2500);
		PauseUtil.pause(2000);
		}
        checkoutPage.teacher_clicks_on_ContinueCheckout_Rewards_page();
        checkoutPage1.unCheckPOP();
        PauseUtil.pause(3000);
        if(shippingAndPaymentPage.chkDrpPaymentMethod().size()!=0){
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getDrpPaymentMethod());

        SCHUtils.selectOptionsByVisibleText(shippingAndPaymentPage.getDrpPaymentMethod(),
                ConstantUtils.CHECKPAYMENTMETHOD);
        PauseUtil.pause(2000);
        }
        WaitUtils.waitForEnabled(shippingAndPaymentPage.getBtnContinueCheckout());
        SCHUtils.clickUsingJavaScript(shippingAndPaymentPage.getBtnContinueCheckout());
        SCHUtils.waitForLoaderToDismiss();
        PauseUtil.waitForAjaxToComplete(2500);
        PauseUtil.pause(2000);
	}
	
	
	
}
