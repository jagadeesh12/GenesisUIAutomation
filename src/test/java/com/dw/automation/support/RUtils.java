package com.dw.automation.support;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.dw.automation.pages.impl.PartnerUserPageImpl;
import com.scholastic.torque.common.TestBaseProvider;

public class RUtils {
	static WebDriver driver=TestBaseProvider.getTestBase().getDriver();
	public static int TimeOut = 10;
	static PartnerUserPageImpl pupi = new PartnerUserPageImpl();
	
    public static void Wait(int timeout) {
        long t1, t2;
        t1 = System.currentTimeMillis();

        do {
            t2 = System.currentTimeMillis();
        }
        while ((t2 - t1) < (timeout * 1000));

    }
	
    public static void waitForObjectToLoad(WebElement ele) throws InterruptedException {
        boolean isExist = false;
        int cntr = 0;
        while (!isExist) {
            if (ele.isDisplayed()) {
                isExist = true;
            } else {
                Wait(1);
                cntr++;
                if (cntr >= 240) {  // Maximum wait time is for 120 seconds i.e. 2 minutes
                    //fail
                    isExist = true;
                }
            }
        }
    }
    public static void moveToElement(WebElement ele, int timeout) throws Exception {
        
        waitForObjectToLoad(ele);
        Wait(timeout);
        if (ele.isDisplayed()) {
            Actions builder = new Actions(driver);
            builder.moveToElement(ele);
//            builder.sendKeys("");
            builder.build().perform();
            ele.sendKeys("");
            //Log.info("Clicking element ''" + locator + "=" + element + "'");
        } else {
            Exception error = new Exception();
            //Log.error("Current page does not contain element  '" + locator + "=" + element + "'");
            String Str = new String(error.getMessage());
            //Log.error("Error Message :" + Str.substring(1, 240));
            throw error;
        }

    }
    
	public static String generateName() {
        DateFormat dateFormat = new SimpleDateFormat("ddMMHHmm");
        Date date = new Date();
        String name = dateFormat.format(date);
        
        String firstName = "PMFN"+name;
        System.out.println("FirstName :"+firstName);
        return firstName;

	}
	
	public static Boolean waitforloadingtodissappear(){
		 WebDriverWait wait = new WebDriverWait(driver, 180);
		 Boolean element2 = wait.until(ExpectedConditions.invisibilityOfElementLocated((By.xpath(".//*[@class='fa fa-refresh fa-spin fa-3x fa-fw']"))));
		return element2;																			
	}
	
	public static void login(String username,String password) {
		System.out.println("Login started===========================================");
		pupi.getUsername().sendKeys(username);
		pupi.getPassword().sendKeys(password);
		pupi.captureCaptcha();
		pupi.getSignInBtn().click();
	}



	public static String generateSpecificName(String username) {
        DateFormat dateFormat = new SimpleDateFormat("ddMMHHmm");
        Date date = new Date();
        String name = dateFormat.format(date);
        
        String firstName = username+"_"+name;
        System.out.println("FirstName :"+firstName);
        return firstName;

	}
	//RuLib Method No:019 
	//UPLOADING DOCUMENTS USING JAVA ROBOT API/ 
	public static void upload_Documents(String filedoc) throws AWTException { 
	 StringSelection fileloc = new StringSelection(filedoc);  
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileloc, null);
	Robot robot = new Robot();  
	robot.keyPress(KeyEvent.VK_ENTER); 
	robot.keyRelease(KeyEvent.VK_ENTER);  
	robot.keyPress(KeyEvent.VK_CONTROL);  
	robot.keyPress(KeyEvent.VK_V); 
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL); 
	robot.keyPress(KeyEvent.VK_ENTER); 
	robot.keyRelease(KeyEvent.VK_ENTER); 

	}
	
	public static void update_xml(int id,String userTagName,String passTagName, String username, String password) {
		   try {

			    
			    String filepath = "/home/rle0502/Documents/code/genesis-auto/schl-rco-test-ca/src/test/resources/qa/data/redington.xml";
				System.out.println(filepath);
				DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
				Document doc = docBuilder.parse(filepath);

				// Get the root element
				Node company = doc.getFirstChild();

				// Get the testcase element , it may not working if tag has spaces, or
				// whatever weird characters in front...it's better to use
				// getElementsByTagName() to get it directly.
				// Node staff = company.getFirstChild();

				// Get the staff element by tag name directly
				Node staff = doc.getElementsByTagName("testcase").item(id);


				// loop the staff child node
				NodeList list = staff.getChildNodes();

				for (int i = 0; i < list.getLength(); i++) {

		                   Node node = list.item(i);

				   // get the salary element, and update the value
				   if (userTagName.equals(node.getNodeName())) {
					node.setTextContent(username);
				   }

		                   
				   if (passTagName.equals(node.getNodeName())) {
					staff.setTextContent(password);
				   }

				}

				// write the content into xml file
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(new File(filepath));
				transformer.transform(source, result);

				System.out.println("Done");

			   } catch (ParserConfigurationException pce) {
				pce.printStackTrace();
			   } catch (TransformerException tfe) {
				tfe.printStackTrace();
			   } catch (IOException ioe) {
				ioe.printStackTrace();
			   } catch (SAXException sae) {
				sae.printStackTrace();
			   }
			}
	}


