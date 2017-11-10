package com.dw.automation.pages.impl;


import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PasswordAndEnabledChkBoxSet {
	WebDriver driver;
	
	
	By fld_Login=By.xpath("//input[@name='LoginForm_Login']");
	By fld_Password=By.xpath("//input[@name='LoginForm_Password']");
	By btn_Login=By.xpath("//button[@name='login']");
	By select_dropdown=By.xpath("//div[@id='SelectedSiteID-wrap']/span");
	By select_Option_Canada=By.xpath("//span[text()='Scholastic Canada RCO']");
	By select_Customers=By.xpath("//a[text()='Customers']");
	By fld_CustNum=By.xpath("//input[@name='WFCustomerSimpleSearch_SearchTerm']");
	By btn_Find=By.xpath("//button[@id='searchFocus']");
	By select_AcNum=By.xpath("(//a[@class='table_detail_link'])[2]");
	
	By chkBox_Enabled=By.xpath("//tr[td[text()='Enabled:']]/td[2]/input");
	By fld_Password_to_set=By.xpath("//input[@name='CredentialsPassword']");
	By fld_Password_to_confirm=By.xpath("//input[@name='CredentialsPasswordConfirm']");
	By btn_Apply=By.xpath("//button[text()='Apply']");
	By section_ManageCustomers=By.xpath("//a[text()='Manage Customers']");
	

	@Test
	public void User_Creation() throws InterruptedException{
	
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//driver.get("https://clubs3qa1.scholastic.com/home");
	//driver.get("https://development-rco-scholastic.demandware.net/on/demandware.store/Sites-Site/default/ViewApplication-Logout");
	driver.get("https://dev35-rco-scholastic.demandware.net/on/demandware.store/Sites-Site/default/ViewApplication-Logout");
	
	String Username="bmekala";
	String Password="July2018!";
	String SetPassword="passw0rd";
	
	Thread.sleep(5000);
	
	driver.findElement(fld_Login).click();
	Thread.sleep(1000);
	driver.findElement(fld_Login).sendKeys(Username);
	Thread.sleep(1000);
	driver.findElement(fld_Password).click();
	Thread.sleep(1000);
	driver.findElement(fld_Password).sendKeys(Password);
	Thread.sleep(1000);
	driver.findElement(btn_Login).click();
	Thread.sleep(5000);
	
	driver.findElement(select_dropdown).click();
	Thread.sleep(2000);
	driver.findElement(select_Option_Canada).click();
	Thread.sleep(3000);
	driver.findElement(select_Customers).click();
	Thread.sleep(4000);
	driver.findElement(select_Customers).click();
	Thread.sleep(3000);
	
	
	String[] str = {"226523","226367"};
	for (int i = 0; i <= str.length; i++) {
		String val=str[i];
		
		driver.findElement(fld_CustNum).click();
		Thread.sleep(1000);
		driver.findElement(fld_CustNum).sendKeys(val);
		Thread.sleep(1000);
		driver.findElement(btn_Find).click();
		Thread.sleep(3000);
		driver.findElement(select_AcNum).click();
		Thread.sleep(3000);
		
		if (driver.findElement(chkBox_Enabled).isSelected()) {
			System.out.println("CheckBox is selected already");
		} else {
			driver.findElement(chkBox_Enabled).click();
		}
		
		Thread.sleep(1500);
		driver.findElement(fld_Password_to_set).click();
		driver.findElement(fld_Password_to_set).clear();
		Thread.sleep(1000);
		driver.findElement(fld_Password_to_set).sendKeys(SetPassword);
		Thread.sleep(1000);
		driver.findElement(fld_Password_to_confirm).click();
		driver.findElement(fld_Password_to_confirm).clear();
		Thread.sleep(1000);
		driver.findElement(fld_Password_to_confirm).sendKeys(SetPassword);
		Thread.sleep(1000);
		driver.findElement(btn_Apply).click();
		Thread.sleep(4000);
		System.out.println("Password is set for the account :"+val);
		driver.findElement(section_ManageCustomers).click();
		Thread.sleep(5000);
	}
	
	//driver.close();
	}

}
