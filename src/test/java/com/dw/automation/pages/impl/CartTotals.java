package com.dw.automation.pages.impl;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.scholastic.torque.common.TestBaseProvider;

import cucumber.api.java.eo.Do;
import junit.framework.Assert;


public class CartTotals {
	
	StudentFlyerOrdersPage studflyerpage = new StudentFlyerOrdersPage();
	CartPage crtpage = new CartPage();
	CheckoutPage chkpage = new CheckoutPage();
	CheckoutPage_2 chkpage2 = new CheckoutPage_2();
	private double sfoSubTotal;
	private double ytoSubTotal;
	private double teSubTotal;
	private double sfoSubTotal_reviewcart;
	private double ytoSubTotal_reviewcart;
	private double teSubTotal_reviewcart;
	private double sfoSubTotal_ConfirmSubmit;
	private double sfoSubTotal_Confirm;
	private double ytoSubTotal_checkout;
	private double teSubTotal_checkout;


	public void get_totals_sfo_yto(WebElement sfoytotable){
		List<WebElement> sfoytotableTr = sfoytotable.findElements(By.tagName("tr"));
    	for(WebElement reviewcarttable : sfoytotableTr){
    		String section = reviewcarttable.getAttribute("data-month");
    		List<WebElement> tabletd = reviewcarttable.findElements(By.tagName("td"));
    		//String section = tabletd.get(1).getAttribute("class");
    		System.out.println("section is----->>>>>>>"+section);
    		if( !tabletd.isEmpty()){
    		switch(String.valueOf(section).trim()){
			case "null":
    		String studentname = tabletd.get(1).getAttribute("class");
			if(studentname.trim().equals("studentName")){
				System.out.println("COMING TO NULL & SFO ##################");
	    			String price1 = tabletd.get(6).getText();
	    			if(!price1.equals("FREE")){
	    			price1 = price1.substring(1);
	    	        double price =Double.parseDouble(price1);
	    			
	    	        String qty1 = tabletd.get(7).findElement(By.tagName("input")).getAttribute("value");
	    	        double qty =Double.parseDouble(qty1);
	    	        double subtotal1 = price*qty;
	    	        sfoSubTotal += subtotal1;
	    	        System.out.println("sfo subtotal is--->>>>: "+sfoSubTotal);
	    	        }
			       }
			else{
				System.out.println("COMING TO NULL & YTO ##################");
				String price1 = tabletd.get(4).getText();
    			price1 = price1.substring(1);
    	        double price =Double.parseDouble(price1);
    	        
    	        String qty1 = tabletd.get(5).findElement(By.tagName("input")).getAttribute("value");
    	        double qty =Double.parseDouble(qty1);
    	        
    	        double subtotal2 = price*qty;
    	        ytoSubTotal += subtotal2;
    	        System.out.println("yto subtotal is--->>>>: "+ytoSubTotal);
			}
			break;
			
			default:
				System.out.println("COMING TO DEFAULT ##################");
				String price1 = tabletd.get(4).getText();
    			price1 = price1.substring(1);
    	        double price =Double.parseDouble(price1);
    	        
    	        String qty1 = tabletd.get(5).findElement(By.tagName("input")).getAttribute("value");
    	        double qty =Double.parseDouble(qty1);
    	        double subtotal2 = price*qty;
    	        ytoSubTotal += subtotal2;
    	        System.out.println("yto subtotal is--->>>>: "+ytoSubTotal);
	    	    break;       
	    	    
    		}
	}
    	}
    	System.out.println("default sfo subtotal is--->>>>: "+sfoSubTotal);
    	System.out.println("default yto subtotal is--->>>>: "+ytoSubTotal);
	}
	
	
	
	public void get_totals_checkoutpages_sfo_yto(String section, String page){
		WebDriver driver=TestBaseProvider.getTestBase().getDriver();
		
		String title_sfo = crtpage.getsfocheckoutpagesheader().getText();
		String title_yto = crtpage.getytocheckoutpagesheader().getText();
		
			if((title_sfo.contains("STUDENT FLYER ORDERS")) && (section.equals("SFOItems")) && (page.equals("ReviewCart"))){
				System.out.println("entering to sfo if condition in get totals in review cart");
	    		
					//List<WebElement> ele = driver.findElements(By.xpath("//div[@class='cart-month-sfo-content']/div[1]/table/following-sibling::div/div/ul/li[2]/span"));
					List<WebElement> ele = crtpage.reviewcartsizesfosubtotals();
					for(int i=1;i<=ele.size();i++){
						
						String sfoSubTotal_reviewcart1 = driver.findElement(By.xpath("(//div[@class='cart-month-sfo-content']/div[1]/table/following-sibling::div/div/ul/li[2]/span)["+i+"]")).getText();
						//String sfoSubTotal_reviewcart1 = crtpage.getsfocheckoutpagessubtotals().getText();
						sfoSubTotal_reviewcart1 = sfoSubTotal_reviewcart1.substring(1);
						sfoSubTotal_reviewcart += Double.parseDouble(sfoSubTotal_reviewcart1);
					}
					
				
	    		}
			
			
			else if((title_sfo.contains("STUDENT FLYER ORDERS")) && (section.equals("SFOItems")) && (page.equals("ConfirmSubmitpage"))){
				System.out.println("entering to sfo if condition in get totals in confirmation page");
	    		
					//List<WebElement> ele = driver.findElements(By.xpath("//div[@class='cart-month-sfo-content']/div[1]/table/following-sibling::div/div/ul/li[2]/span"));
					List<WebElement> ele = crtpage.checkoutpagessizesfosubtotals();
					for(int i=1;i<=ele.size();i++){
						
						String sfoSubTotal_checkout1 = driver.findElement(By.xpath("(//table[@class='cell-border dataTable']/following-sibling::div/div/ul/li[2]/span)["+i+"]")).getText();
						//String sfoSubTotal_reviewcart1 = crtpage.getsfocheckoutpagessubtotals().getText();
						sfoSubTotal_checkout1 = sfoSubTotal_checkout1.substring(1);
						sfoSubTotal_ConfirmSubmit += Double.parseDouble(sfoSubTotal_checkout1);
					}
					
				
	    		}
			
			
			else if((title_sfo.contains("STUDENT FLYER ORDERS")) && (section.equals("SFOItems")) && (page.equals("Confirmpage"))){
				System.out.println("entering to sfo if condition in get totals in confirmation page");
	    		
					//List<WebElement> ele = driver.findElements(By.xpath("//div[@class='cart-month-sfo-content']/div[1]/table/following-sibling::div/div/ul/li[2]/span"));
					List<WebElement> ele = crtpage.checkoutpagessizesfosubtotals();
					for(int i=1;i<=ele.size();i++){
						
						String sfoSubTotal_checkout1 = driver.findElement(By.xpath("(//table[@class='cell-border dataTable']/following-sibling::div/div/ul/li[2]/span)["+i+"]")).getText();
						//String sfoSubTotal_reviewcart1 = crtpage.getsfocheckoutpagessubtotals().getText();
						sfoSubTotal_checkout1 = sfoSubTotal_checkout1.substring(1);
						sfoSubTotal_Confirm += Double.parseDouble(sfoSubTotal_checkout1);
					}
					
				
	    		}
		
				else if((title_yto.contains("YOUR TEACHER ORDER")) && (section.equals("YTOItems")) && (page.equals("ReviewCart"))){
					System.out.println("entering to yto if condition in get totals in review cart");
					
					String ytoSubTotal_reviewcart1 = studflyerpage.subTotal_StudentClubs().getText();
					ytoSubTotal_reviewcart1 = ytoSubTotal_reviewcart1.substring(1);
					ytoSubTotal_reviewcart = Double.parseDouble(ytoSubTotal_reviewcart1);
					}
			
				else if((title_yto.contains("YOUR TEACHER ORDER")) && (section.equals("YTOItems")) && (page.equals("Confirmpage"))){
					System.out.println("entering to yto if condition in get totals in confirmation page");
					
					String ytoSubTotal_checkout1 = studflyerpage.subTotal_StudentClubs().getText();
					ytoSubTotal_checkout1 = ytoSubTotal_checkout1.substring(1);
					ytoSubTotal_checkout = Double.parseDouble(ytoSubTotal_checkout1);
					}
		
		System.out.println("Reviewcart sfo subtotal is--->>>>: "+sfoSubTotal_reviewcart);
    	System.out.println("Reviewcart yto subtotal is--->>>>: "+ytoSubTotal_reviewcart);
    	System.out.println("ConfirmSubmit page sfo subtotal is--->>>>: "+sfoSubTotal_ConfirmSubmit);
    	System.out.println("ConfirmSubmit yto subtotal is--->>>>: "+ytoSubTotal_checkout);
    	System.out.println("Confirmpage sfo subtotal is--->>>>: "+sfoSubTotal_Confirm);
    	System.out.println("Confirmpage yto subtotal is--->>>>: "+ytoSubTotal_checkout);
		
	}
	
	
	public void compare_totals_reviewcart(String section, String page){
		
		//WebDriver driver=TestBaseProvider.getTestBase().getDriver();
		//List<WebElement> size = driver.findElements(By.xpath("//li[@class='title']"));
		
		//String title_sfo = driver.findElement(By.xpath("(//li[@class='title'])[1]")).getText();
		//String title_yto = driver.findElement(By.xpath("(//li[@class='title'])[2]")).getText();
		String title_sfo = crtpage.getsfocheckoutpagesheader().getText();
		String title_yto = crtpage.getytocheckoutpagesheader().getText();
		
		System.out.println("Final sfo subtotal is: "+sfoSubTotal);
		System.out.println("Final yto subtotal is :"+ytoSubTotal);
		System.out.println("Final Review Cart sfo subtotal is :"+sfoSubTotal_reviewcart);
		System.out.println("Final Review Cart yto subtotal is :"+ytoSubTotal_reviewcart);
		System.out.println("Final ConfirmSubmit page Cart sfo subtotal is :"+sfoSubTotal_ConfirmSubmit);
		System.out.println("Final ConfirmSubmit page yto subtotal is :"+ytoSubTotal_checkout);
		System.out.println("Final Confirmpage Cart sfo subtotal is :"+sfoSubTotal_Confirm);
		System.out.println("Final Confirmpage Cart yto subtotal is :"+ytoSubTotal_checkout);
		
			//for(i=1;i<=size.size();i++){
				//String title = driver.findElement(By.xpath("(//li[@class='title'])["+i+"]")).getText();
			
					if((title_sfo.contains("STUDENT FLYER ORDERS")) && (section.equals("SFOItems")) && (page.equals("ReviewCart"))){
						System.out.println("VALIDATING SFO TOTALS");
						if(sfoSubTotal != sfoSubTotal_reviewcart){
							Assert.fail("Totals are not correct for SFO in Review cart page");
						   }
					}
					
					else if((title_sfo.contains("STUDENT FLYER ORDERS")) && (section.equals("SFOItems")) && (page.equals("ConfirmSubmitpage"))){
						System.out.println("VALIDATING SFO TOTALS");
						if(sfoSubTotal != sfoSubTotal_ConfirmSubmit){
							Assert.fail("Totals are not correct for SFO in Confirmation & Submit page");
						   }
					}
					
					else if((title_sfo.contains("STUDENT FLYER ORDERS")) && (section.equals("SFOItems")) && (page.equals("Confirmpage"))){
						System.out.println("VALIDATING SFO TOTALS");
						if(sfoSubTotal != sfoSubTotal_Confirm){
							Assert.fail("Totals are not correct for SFO in Confirmation page");
						   }
					}
			
							else if((title_yto.contains("YOUR TEACHER ORDER")) && (section.equals("YTOItems")) && (page.equals("ReviewCart"))){
								System.out.println("VALIDATING YTO TOTALS");
								if(ytoSubTotal != ytoSubTotal_reviewcart){
									Assert.fail("Totals are not correct for YTO in Review cart page");
								   }
							}
					
					
							else if((title_yto.contains("YOUR TEACHER ORDER")) && (section.equals("YTOItems")) && (page.equals("Confirmpage"))){
								System.out.println("VALIDATING YTO TOTALS");
								if(ytoSubTotal != ytoSubTotal_checkout){
									Assert.fail("Totals are not correct for YTO in Confirmation page");
								   }
							}
		}
	
	
	
	
	public double get_total_reviewcartpage(){
		
		double reviewcart_carttotal = chkpage.ReviewCart_Total_Amt_Owing();
	    TestBaseProvider.getTestBase().getContext()
		.setProperty("testexecution.reviewcart_carttotal", reviewcart_carttotal);
	    System.out.println("Review Cart Total Amt Owing is: "+reviewcart_carttotal);
		return reviewcart_carttotal;
		
	}
	
	
	
public double get_total_redemptionsandrewardspage_preshipping(){
		
		double rewards_ytototal = chkpage.StudentClub_BlueBarTotal();
		double rewards_sfototal = chkpage.SFO_BlueBarTotal();
		double rewards_tetotal = chkpage.TeacherClub_BlueBarTotal();
		
		double rewardspage_totalAmt = rewards_ytototal+rewards_sfototal+rewards_tetotal;
		
		TestBaseProvider.getTestBase().getContext()
		.setProperty("testexecution.rewardspage_totalamt", rewardspage_totalAmt);
	    System.out.println("Rewards page Total Amt Owing is: "+rewardspage_totalAmt);
		return rewardspage_totalAmt;
		
	}
	
	
public double get_total_redemptionsandrewardspage(){
	CheckoutPage checkoutpage = new CheckoutPage();
		
		double rewards_sfototal;
	    double rewards_ytototal = chkpage.StudentClub_BlueBarTotal();
		//double rewards_sfototal = chkpage.SFO_BlueBarTotal();
		double rewards_tetotal = chkpage.TeacherClub_BlueBarTotal();
		if(checkoutpage.sizelblrewardscouponssfobluebartotal().size()!=0){
			rewards_sfototal = chkpage.SFO_BlueBarTotal();
		}
		else{
			rewards_sfototal = 0.00;
		}
		
        if(chkpage.sizelblrewardscouponsshippingfeebluebartotal().size()!=0){
		double rewards_shipping = chkpage.ShippingFee_BlueBarTotal();
        double rewardspage_totalAmt = rewards_ytototal+rewards_sfototal+rewards_tetotal+rewards_shipping;
		
		TestBaseProvider.getTestBase().getContext()
		.setProperty("testexecution.rewardspage_totalamt", rewardspage_totalAmt);
	    System.out.println("Rewards page Total Amt Owing is: "+rewardspage_totalAmt);
		return rewardspage_totalAmt;
        }
        else{
		double rewardspage_totalAmt = rewards_ytototal+rewards_sfototal+rewards_tetotal;
		
		TestBaseProvider.getTestBase().getContext()
		.setProperty("testexecution.rewardspage_totalamt", rewardspage_totalAmt);
	    System.out.println("Rewards page Total Amt Owing is: "+rewardspage_totalAmt);
		return rewardspage_totalAmt;
        }
		
	}


public double get_total_paymentpage(){
	String TotalAmtOwing1=chkpage.Total_Amount_Owing_Payment().getText();
    TotalAmtOwing1 = TotalAmtOwing1.substring(1);
    double payment_carttotal = Double.parseDouble(TotalAmtOwing1);
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.paymentpage_carttotal", payment_carttotal);
    System.out.println("Payment page Total Amt Owing is: "+payment_carttotal);
	return payment_carttotal;
	
}


public double get_total_confirmsubmitpage(){
	String TotalAmtOwing1=chkpage.Total_Amount_Owing_Payment().getText();
    TotalAmtOwing1 = TotalAmtOwing1.substring(1);
    double confirmsubmitpage_carttotal = Double.parseDouble(TotalAmtOwing1);
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.confirmsubmitpage_carttotal", confirmsubmitpage_carttotal);
    System.out.println("ConfirmSubmit page Total Amt Owing is: "+confirmsubmitpage_carttotal);
	return confirmsubmitpage_carttotal;
	
}


public double get_total_confirmationpage(){
	String TotalAmtOwing1=chkpage.Total_Amount_Owing_Payment().getText();
    TotalAmtOwing1 = TotalAmtOwing1.substring(1);
    double confirmationpage_carttotal = Double.parseDouble(TotalAmtOwing1);
    TestBaseProvider.getTestBase().getContext()
	.setProperty("testexecution.confirmationpage_carttotal", confirmationpage_carttotal);
    System.out.println("Confirmation page Total Amt Owing is: "+confirmationpage_carttotal);
	return confirmationpage_carttotal;
	
}



public void compare_reviewcarttotal_rewardspagetotal(){
	
	String reviewcart_carttotal1 = TestBaseProvider.getTestBase().getContext().
            getProperty("testexecution.reviewcart_carttotal").toString();
	double reviewcart_carttotal = Double.parseDouble(reviewcart_carttotal1);
	
	String rewardspage_totalAmt1 = TestBaseProvider.getTestBase().getContext().
            getProperty("testexecution.rewardspage_totalamt").toString();
	double rewardspage_totalAmt = Double.parseDouble(rewardspage_totalAmt1);
	
	Assert.assertEquals(reviewcart_carttotal, rewardspage_totalAmt);
	
}


public void compare_rewardspagetotal_Paymentpagetotal(){
	
	String rewardspage_totalAmt1 = TestBaseProvider.getTestBase().getContext().
            getProperty("testexecution.rewardspage_totalamt").toString();
	double rewardspage_totalAmt = Double.parseDouble(rewardspage_totalAmt1);
	
	
	String paymentpage_carttotal1 = TestBaseProvider.getTestBase().getContext().
            getProperty("testexecution.paymentpage_carttotal").toString();
	double paymentpage_carttotal = Double.parseDouble(paymentpage_carttotal1);
	
	Assert.assertEquals(rewardspage_totalAmt,paymentpage_carttotal);
	
}


public void compare_Paymentpagetotal_confirmsubmitpage(){
	
	String paymentpage_carttotal1 = TestBaseProvider.getTestBase().getContext().
            getProperty("testexecution.paymentpage_carttotal").toString();
	double paymentpage_carttotal = Double.parseDouble(paymentpage_carttotal1);
	
	
	String rewardspage_totalAmt1 = TestBaseProvider.getTestBase().getContext().
            getProperty("testexecution.confirmsubmitpage_carttotal").toString();
	double confirmsubmitpage_totalAmt = Double.parseDouble(rewardspage_totalAmt1);
	
	
	
	Assert.assertEquals(confirmsubmitpage_totalAmt,paymentpage_carttotal);
	
}


public void compare_confirmsubmitpage_confirmationpage(){
	
	String paymentpage_carttotal1 = TestBaseProvider.getTestBase().getContext().
            getProperty("testexecution.confirmationpage_carttotal").toString();
	double confirmationpage_carttotal = Double.parseDouble(paymentpage_carttotal1);
	
	
	String rewardspage_totalAmt1 = TestBaseProvider.getTestBase().getContext().
            getProperty("testexecution.confirmsubmitpage_carttotal").toString();
	double confirmsubmitpage_totalAmt = Double.parseDouble(rewardspage_totalAmt1);
	
	Assert.assertEquals(confirmsubmitpage_totalAmt,confirmationpage_carttotal);
	
}


public void verify_shippingfree_in_confirmpage(){
	
	String act_Shipping_Handling_Value_is=chkpage2.Shipping_value_BlueBar_Confirm_Submit_page().getText().trim();
	Assert.assertEquals(act_Shipping_Handling_Value_is, "FREE!");
	}


public void verify_shippingpaid_in_confirmpage(){
	
	String act_Shipping_Handling_Value_is=chkpage2.Shipping_value_BlueBar_Confirm_Submit_page().getText().trim();
	Assert.assertNotSame(act_Shipping_Handling_Value_is, "FREE!");
	}
	
	
	
	
	
	
	
}
