package com.dw.automation.steps.testfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.scholastic.torque.common.TestBaseProvider;

import cucumber.api.java.en.Given;

public class MyStepdefs {




    @Given("^teacher sets the password$")
    public void teacher_sets_the_password() throws Throwable {
        MyStepdefs step = new MyStepdefs();
        step.setPasswordBM();


    }


    public void setPasswordBM() throws InterruptedException {
        System.out.println("here inside my");
        WebDriver d = TestBaseProvider.getTestBase().getDriver();
        WebDriverWait wait;
        wait = new WebDriverWait(d, 20);
        d.findElement(By.xpath("//*[@id='login']/div[3]/input[1]")).sendKeys("ssingh");
        d.findElement(By.xpath("//*[@id='login']/div[3]/input[2]")).sendKeys("Scholastic@1");
        d.findElement(By.xpath("//*[@id='login']/div[3]/div[3]/button")).click();
        wait.until(ExpectedConditions.attributeContains(By.xpath("//div[@id='SelectedSiteID-wrap']/span/span[1]"), "title", "Select a Site"));

        d.findElement(By.xpath("//span[@class='sod_label']")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("//span[@class='sod_list']/span[3]")).click();

        //======================================================//
        wait.until(ExpectedConditions.attributeToBe(By.xpath("//td[text()='Merchant Tools']"), "class", "overview_title"));
        System.out.println("1st wait");
        List<WebElement> el = d.findElements(By.xpath("(//a[@class='overview_subtitle'])[5]"));
        System.out.println("get size" + el.size());
        Thread.sleep(2000);
        d.findElement(By.xpath("(//a[@class='overview_subtitle'])[5]")).click();
        System.out.println("1st Cust");

        //click again customers

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//td[text()='Customers']")));


        try {
            // Create FileInputStream Object
            FileInputStream fileInput = new FileInputStream(new File("src/test/resources/AccountNo.properties"));
            // Create Properties object
            Properties prop = new Properties();
            //load properties file
            prop.load(fileInput);

            //Print Properties Values
            Thread.sleep(2000);
            d.findElement(By.xpath("//a[text()='Customers']")).click();
//      update the no of data here
            for (int i = 1; i < 8; i++) {
                System.out.println("value " + i + " >>> " + prop.getProperty("u" + i));

                String customerId = prop.getProperty("u" + i);
                String customerId1 = customerId.replaceAll("\\s", "");
                System.out.println(customerId1);
                System.out.println("customer");
                System.out.println("<<>>>" + i);

                d.findElement(By.name("WFCustomerSimpleSearch_SearchTerm")).sendKeys(customerId1);

                Thread.sleep(2000);
                d.findElement(By.xpath("//button[@id='searchFocus']")).click();
                Thread.sleep(2000);
                d.findElement(By.xpath("(//td[@class='table_detail e s'])[1]/a")).click();
                Thread.sleep(2000);

                // set password


                String xpathpasswrdfield = "//input[@name='CredentialsPassword']";
                d.findElement(By.xpath(xpathpasswrdfield)).sendKeys("passw0rd");
                Thread.sleep(2000);
                String xpathconfirmpasswrdfield = "//input[@name='CredentialsPasswordConfirm']";
                d.findElement(By.xpath(xpathconfirmpasswrdfield)).sendKeys("passw0rd");
                Thread.sleep(2000);


                d.findElement(By.xpath("//button[text()='Apply']")).click();

                //go back Back to List
                Thread.sleep(2000);
                d.findElement(By.xpath("//button[contains(text(),'Back to List')]")).click();

                Thread.sleep(2000);


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }


    //==================================================================================================================================================//
    // ================================================================================================================================================//


    @Given("^teacher logs in to create profile$")
    public void teacher_logs_in_to_create_profile() throws Throwable {
        MyStepdefs step = new MyStepdefs();
        // step.setPasswordBM();
        step.teacherProfile_RCO();

    }

    public void  teacherProfile_RCO() throws InterruptedException {




        //System.out.println("here inside my");

        // read file and start t

        // Create FileInputStream Object
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(new File("src/test/resources/AccountNo.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // Create Properties object
        Properties prop = new Properties();
        //load properties file
        try {
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //################################ update here as per the data count##############################################

        for (int i=443; i<460; i++) {
            System.out.println("value " + prop.getProperty("u" + i));

            String customerId = prop.getProperty("u" + i);

            customerId = customerId.replaceAll("\\s", "");
            customerId = customerId.replaceAll(" ", "");
            System.out.println("customerIdToEnter" + customerId +"<<>>>"+i);


            //intiateTest();

            // close guide tutorial

            Thread.sleep(2000);

            closeguideNav();

            loginRCO(customerId);

            try {
                checkUserRole();
            } catch (Exception e) {
                e.printStackTrace();
            }


        }


    }


    private static void clickAddARole() throws Exception {
        WebDriver d = TestBaseProvider.getTestBase().getDriver();
        WebDriverWait wait;
        //WebDriver d = null;
        wait = new WebDriverWait(d, 20);
        Thread.sleep(4000);

        String  addaRole = "//button[@class='button-text edit-role']";
        d.findElement(By.xpath(addaRole)).click();
        Thread.sleep(6000);
        System.out.println("Edit clicked on ROle POPUP");
        //click Save
        Thread.sleep(6000);
        String xpathSave= "//button[@class='button-continue save']";
        d.findElement(By.xpath(xpathSave)).click();
        Thread.sleep(6000);

        // click on continueToSite

        String xpathContinueSite = "//*[@id='btsProfileContinue']";
        d.findElement(By.xpath(xpathContinueSite)).click();
        System.out.println("done");
        Thread.sleep(4000);
        System.out.println("click arrow my accont");
        d.findElement(By.xpath("(//span[@class='toggle-item fa-arrowdown'])[2]")).click();
        Thread.sleep(6000);
        //a[@class='user-logout bold']
        d.findElement(By.xpath("(//a[@class='user-logout bold'])[3]")).click();
        System.out.println("click signout");
        Thread.sleep(4000);
    }





    public static void intiateTest(){
        /*ILoginPage homePage = getFactory().getILoginPage();
        homePage.launchPage();*/
        WebDriver d = TestBaseProvider.getTestBase().getDriver();
        WebDriverWait wait;
        //WebDriver d = null;
        wait = new WebDriverWait(d, 20);

        d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //d.get(url);

    }

    public static void closeguideNav(){
        String xpathTutorialClose="//a[@class='close dialog-close']/span";
        WebDriver d = TestBaseProvider.getTestBase().getDriver();
        List<WebElement> tutorialClose = d.findElements(By.xpath(xpathTutorialClose));
        if(tutorialClose.size()>0){
            tutorialClose.get(0).click();
        }

    }

    public static void loginRCO(String custNo) throws InterruptedException
    {
        WebDriver d = TestBaseProvider.getTestBase().getDriver();
        WebDriverWait wait;
        //WebDriver d = null;
        wait = new WebDriverWait(d, 20);

        String u1=custNo;
        u1=u1.replaceAll(" ","");
        u1=u1.replaceAll("\\s", "");
        System.out.println(u1);
        Thread.sleep(2000);
        d.findElement(By.cssSelector("input[placeholder='Scholastic Account Number']")).click();
        d.findElement(By.cssSelector("input[placeholder='Scholastic Account Number']")).sendKeys(Keys.HOME);
        d.findElement(By.cssSelector("input[placeholder='Scholastic Account Number']")).sendKeys(u1);
        d.findElement(By.cssSelector("input[placeholder='Scholastic Account Password']")).sendKeys("passw0rd");
        System.out.println("passwordTyped");
        d.findElement(By.cssSelector(".home-page-login-btn")).click();
        Thread.sleep(6000);


        try {
            List<WebElement> noSchool = d.findElements(By.xpath("//div[contains(text(),'Sorry')]"));
            if(noSchool.size()>0){
                System.out.println("Inside No School");
                d.findElement(By.xpath("//*[@id='selectSchoolModal']/div[2]/div[3]/a")).click();
                System.out.println("Logout from NoSchool Popup");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        closeguideNav();


    }

    private static void checkUserRole() throws Exception {
        WebDriver d = TestBaseProvider.getTestBase().getDriver();
        WebDriverWait wait;
        // WebDriver d = null;
        wait = new WebDriverWait(d, 20);

        String xpathWelcomeBack = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front registration-flow ui-draggable']";
        List<WebElement> popup = d.findElements(By.xpath(xpathWelcomeBack));
        System.out.println("inside checkUserRole"+popup.size());
        if(popup.size()!=0){
            System.out.println("Account Role Not Exists");
            clickAddARole();
        }

        if (d.findElements(By.xpath("(//span[@class='toggle-item fa-arrowdown'])[2]")).size()!=0)
        {

            System.out.println("click arrow >>My Account");
            d.findElement(By.xpath("(//span[@class='toggle-item fa-arrowdown'])[2]")).click();

            d.findElement(By.xpath("(//a[@class='user-logout bold'])[3]")).click();
            System.out.println("click signout");
            Thread.sleep(4000);

        }

        //d.close();
    }
}