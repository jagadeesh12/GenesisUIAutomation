package com.dw.automation.support;

import static com.dw.automation.pages.base.PageFactory.getFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.configuration.Configuration;
import org.json.JSONObject;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dw.automation.beans.ProductInfoBean;
import com.dw.automation.beans.UserProfileBean;
import com.dw.automation.pages.IProfilePage;
import com.dw.automation.pages.impl.Pcod_ExcelLibrary;
import com.scholastic.torque.common.BaseTestPage;
import com.scholastic.torque.common.LocatorUtils;
import com.scholastic.torque.common.TestBaseProvider;
import com.scholastic.torque.common.TestPage;

public class DataCreation {
//	static Pcod_ExcelLibrary objExcelFile = new Pcod_ExcelLibrary();
//	static String pareninfo_directory = "src/ExcelFile/pcod.xlsx";
//	static Random rand = new Random();
	
	public static void generate_parent_end_to_end_data(int startRow, int numData, String scenarioValue) throws IOException{
		PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(System.getProperty("user.home") + "/Desktop/data.xml", true)));
		
		Pcod_ExcelLibrary objExcelFile = new Pcod_ExcelLibrary();
		String pareninfo_directory = "src/ExcelFile/pcod.xlsx";
		Random rand = new Random();
		
		String sheetname = "";
		int startval = 0;
		
		if(scenarioValue.equals("1Parent1Child1Teacher"))
			sheetname = "Parent1child";
		else if(scenarioValue.equals("1Parent2Children1Teacher"))
			sheetname = "Parent2childs";
		else if(scenarioValue.equals("1Parent2Children2Teachers"))
			sheetname = "Parent2childs2teachers";
		else{
			sheetname = "2Parents1child";
			startval = 1;
		}
		
		if(sheetname.equals("Parent1child")){
			for(int i = startRow, k = 1; i < (startRow + numData); i++, k++){
				int randomNumItems = rand.nextInt(5) + 1;
				
				String parent_firstname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 0);
				String parent_lastname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 1);
				String parent_email = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 2);
				String parent_password = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 3);
				String parent_number = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 4);
				String parent_child_firstname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 5);
				String parent_child_lastname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 6);
				String parent_teacherAccount = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 7);
				
					writer.println("<testcase id=\"ParentE2E:1Parent_1Child_1Teacher:Parent_" + (k < 10 ? "0" : "") + k +"\">");
					writer.println("\t<acc_no>" + parent_email + "</acc_no>");
					writer.println("\t<password>" + parent_password + "</password>");
					writer.println("\t<teacherAccount>" + parent_teacherAccount + "</teacherAccount>");
					writer.println("\t<childFirstName>" + parent_child_firstname + "</childFirstName>");
					writer.println("\t<childLastName>" + parent_child_lastname + "</childLastName>");
					writer.println("\t<numItems>" + randomNumItems + "</numItems>");
					
					for(int j = 1; j <= randomNumItems; j++){
						int randomItemQty = rand.nextInt(3) + 1;
						
						writer.println("\t<itemNum" + j + ">${item" + j + "Number}</itemNum" + j + ">");
						writer.println("\t<itemQty" + j + ">" + randomItemQty + "</itemQty" + j + ">");
					}
					
					writer.println("\t<cardname>" + parent_firstname + " " + parent_lastname + "</cardname>");
					writer.println("\t<cardnumber>4111111111111111</cardnumber>");
					writer.println("\t<expmonth>April</expmonth>");
					writer.println("\t<expyear>2020</expyear>");
					writer.println("\t<securitycode>344</securitycode>");
					writer.println("\t<firstname>" + parent_firstname + "</firstname>");
					writer.println("\t<lastname>" + parent_lastname + "</lastname>");
					writer.println("\t<address1>175 Hillmount Road</address1>");
					writer.println("\t<address2></address2>");
					writer.println("\t<zip>L6C 1Z7</zip>");
					writer.println("\t<city>Markham</city>");
					writer.println("\t<country>Canada</country>");
					writer.println("\t<state>Ontario</state>");
					writer.println("\t<phone>" + parent_number + "</phone>");
					writer.println("</testcase>");
					
					
			}
			
			writer.close();
		
		} else if (sheetname.equals("Parent2childs")){
			for(int i = startRow, k = 1; i < (startRow + numData); i++, k++){
				int randomNumItems1 = rand.nextInt(5) + 1;
				int randomNumItems2 = rand.nextInt(5) + 1;
				
				String parent_firstname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 0);
				String parent_lastname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 1);
				String parent_email = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 2);
				String parent_password = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 3);
				String parent_number = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 4);
				String parent_child_firstname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 5);
				String parent_child_lastname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 6);
				String parent_child2_firstname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 7);
				String parent_child2_lastname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 8);
				String parent_teacherAccount = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 9);
				
					writer.println("<testcase id=\"ParentE2E:1Parent_2Children_1Teacher:Parent_" + (k < 10 ? "0" : "") + k +"\">");
					writer.println("\t<acc_no>" + parent_email + "</acc_no>");
					writer.println("\t<password>" + parent_password + "</password>");
					writer.println("\t<teacherAccount>" + parent_teacherAccount + "</teacherAccount>");
					writer.println("\t<child1FirstName>" + parent_child_firstname + "</child1FirstName>");
					writer.println("\t<child1LastName>" + parent_child_lastname + "</child1LastName>");
					writer.println("\t<child2FirstName>" + parent_child2_firstname + "</child2FirstName>");
					writer.println("\t<child2LastName>" + parent_child2_lastname + "</child2LastName>");
					writer.println("\t<child1numItems>" + randomNumItems1 + "</child1numItems>");
					
					for(int j = 1; j <= randomNumItems1; j++){
						int randomItemQty = rand.nextInt(3) + 1;
						
						writer.println("\t<child1itemNum" + j + ">${item" + j + "Number}</child1itemNum" + j + ">");
						writer.println("\t<child1itemQty" + j + ">" + randomItemQty + "</child1itemQty" + j + ">");
					}
					
					writer.println("\t<child2numItems>" + randomNumItems2 + "</child2numItems>");
					
					for(int j = 1; j <= randomNumItems2; j++){
						int randomItemQty = rand.nextInt(3) + 1;
						
						writer.println("\t<child2itemNum" + j + ">${item" + j + "Number}</child2itemNum" + j + ">");
						writer.println("\t<child2itemQty" + j + ">" + randomItemQty + "</child2itemQty" + j + ">");
					}
					
					writer.println("\t<cardname>" + parent_firstname + " " + parent_lastname + "</cardname>");
					writer.println("\t<cardnumber>4111111111111111</cardnumber>");
					writer.println("\t<expmonth>April</expmonth>");
					writer.println("\t<expyear>2020</expyear>");
					writer.println("\t<securitycode>344</securitycode>");
					writer.println("\t<firstname>" + parent_firstname + "</firstname>");
					writer.println("\t<lastname>" + parent_lastname + "</lastname>");
					writer.println("\t<address1>175 Hillmount Road</address1>");
					writer.println("\t<address2></address2>");
					writer.println("\t<zip>L6C 1Z7</zip>");
					writer.println("\t<city>Markham</city>");
					writer.println("\t<country>Canada</country>");
					writer.println("\t<state>Ontario</state>");
					writer.println("\t<phone>" + parent_number + "</phone>");
					writer.println("</testcase>");
					
					
			}
			
			writer.close();
			
		} else if (sheetname.equals("Parent2childs2teachers")){
			for(int i = startRow, k = 1; i < (startRow + numData); i++, k++){
				int randomNumItems1 = rand.nextInt(5) + 1;
				int randomNumItems2 = rand.nextInt(5) + 1;
				
				String parent_firstname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 0);
				String parent_lastname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 1);
				String parent_email = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 2);
				String parent_password = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 3);
				String parent_number = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 4);
				String parent_child_firstname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 5);
				String parent_child_lastname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 6);
				String parent_child2_firstname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 7);
				String parent_child2_lastname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 8);
				String parent_teacherAccount = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 9);
				String parent_teacher2Account = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 16);
				
					writer.println("<testcase id=\"ParentE2E:1Parent_2Children_2Teachers:Parent_" + (k < 10 ? "0" : "") + k +"\">");
					writer.println("\t<acc_no>" + parent_email + "</acc_no>");
					writer.println("\t<password>" + parent_password + "</password>");
					writer.println("\t<teacher1Account>" + parent_teacherAccount + "</teacher1Account>");
					writer.println("\t<teacher2Account>" + parent_teacher2Account + "</teacher2Account>");
					writer.println("\t<child1FirstName>" + parent_child_firstname + "</child1FirstName>");
					writer.println("\t<child1LastName>" + parent_child_lastname + "</child1LastName>");
					writer.println("\t<child2FirstName>" + parent_child2_firstname + "</child2FirstName>");
					writer.println("\t<child2LastName>" + parent_child2_lastname + "</child2LastName>");
					writer.println("\t<child1numItems>" + randomNumItems1 + "</child1numItems>");
					
					for(int j = 1; j <= randomNumItems1; j++){
						int randomItemQty = rand.nextInt(3) + 1;
						
						writer.println("\t<child1itemNum" + j + ">${item" + j + "Number}</child1itemNum" + j + ">");
						writer.println("\t<child1itemQty" + j + ">" + randomItemQty + "</child1itemQty" + j + ">");
					}
					
					writer.println("\t<child2numItems>" + randomNumItems2 + "</child2numItems>");
					
					for(int j = 1; j <= randomNumItems2; j++){
						int randomItemQty = rand.nextInt(3) + 1;
						
						writer.println("\t<child2itemNum" + j + ">${item" + j + "Number}</child2itemNum" + j + ">");
						writer.println("\t<child2itemQty" + j + ">" + randomItemQty + "</child2itemQty" + j + ">");
					}
					
					writer.println("\t<cardname>" + parent_firstname + " " + parent_lastname + "</cardname>");
					writer.println("\t<cardnumber>4111111111111111</cardnumber>");
					writer.println("\t<expmonth>April</expmonth>");
					writer.println("\t<expyear>2020</expyear>");
					writer.println("\t<securitycode>344</securitycode>");
					writer.println("\t<firstname>" + parent_firstname + "</firstname>");
					writer.println("\t<lastname>" + parent_lastname + "</lastname>");
					writer.println("\t<address1>175 Hillmount Road</address1>");
					writer.println("\t<address2></address2>");
					writer.println("\t<zip>L6C 1Z7</zip>");
					writer.println("\t<city>Markham</city>");
					writer.println("\t<country>Canada</country>");
					writer.println("\t<state>Ontario</state>");
					writer.println("\t<phone>" + parent_number + "</phone>");
					writer.println("</testcase>");
					
					
			}
			
			writer.close();
			
		} else if (sheetname.equals("2Parents1child")){
			for(int i = startRow, k = 1; i < (startRow + numData); i++, k++){
				int randomNumItems1 = rand.nextInt(5) + 1;
				int randomNumItems2 = rand.nextInt(5) + 1;
				
				String parent_firstname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 1);
				String parent_lastname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 2);
				String parent_email = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 3);
				String parent_password = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 4);
				String parent_number = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 5);
				String parent_child_firstname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 6);
				String parent_child_lastname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 7);
				String parent_teacherAccount = objExcelFile.getExcelData(pareninfo_directory, sheetname, i, 8);
				
				String parent2_firstname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i+1, 1);
				String parent2_lastname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i+1, 2);
				String parent2_email = objExcelFile.getExcelData(pareninfo_directory, sheetname, i+1, 3);
				String parent2_password = objExcelFile.getExcelData(pareninfo_directory, sheetname, i+1, 4);
				String parent2_number = objExcelFile.getExcelData(pareninfo_directory, sheetname, i+1, 5);
				String parent2_child_firstname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i+1, 6);
				String parent2_child_lastname = objExcelFile.getExcelData(pareninfo_directory, sheetname, i+1, 7);
				
					writer.println("<testcase id=\"ParentE2E:2Parent_1Child_1Teacher:Parent_" + (k < 10 ? "0" : "") + k +"\">");
					writer.println("\t<acc_no1>" + parent_email + "</acc_no1>");
					writer.println("\t<password1>" + parent_password + "</password1>");
					writer.println("\t<acc_no2>" + parent2_email + "</acc_no2>");
					writer.println("\t<password2>" + parent2_password + "</password2>");
					writer.println("\t<teacherAccount>" + parent_teacherAccount + "</teacherAccount>");
					writer.println("\t<child1FirstName>" + parent_child_firstname + "</child1FirstName>");
					writer.println("\t<child1LastName>" + parent_child_lastname + "</child1LastName>");
					writer.println("\t<child2FirstName>" + parent2_child_firstname + "</child2FirstName>");
					writer.println("\t<child2LastName>" + parent2_child_lastname + "</child2LastName>");
					writer.println("\t<child1numItems>" + randomNumItems1 + "</child1numItems>");
					
					for(int j = 1; j <= randomNumItems1; j++){
						int randomItemQty = rand.nextInt(3) + 1;
						
						writer.println("\t<child1itemNum" + j + ">${item" + j + "Number}</child1itemNum" + j + ">");
						writer.println("\t<child1itemQty" + j + ">" + randomItemQty + "</child1itemQty" + j + ">");
					}
					
					writer.println("\t<child2numItems>" + randomNumItems2 + "</child2numItems>");
					
					for(int j = 1; j <= randomNumItems2; j++){
						int randomItemQty = rand.nextInt(3) + 1;
						
						writer.println("\t<child2itemNum" + j + ">${item" + j + "Number}</child2itemNum" + j + ">");
						writer.println("\t<child2itemQty" + j + ">" + randomItemQty + "</child2itemQty" + j + ">");
					}
					
					writer.println("\t<cardname1>" + parent_firstname + " " + parent_lastname + "</cardname1>");
					writer.println("\t<cardnumber1>4111111111111111</cardnumber1>");
					writer.println("\t<expmonth1>April</expmonth1>");
					writer.println("\t<expyear1>2020</expyear1>");
					writer.println("\t<securitycode1>344</securitycode1>");
					writer.println("\t<firstname1>" + parent_firstname + "</firstname1>");
					writer.println("\t<lastname1>" + parent_lastname + "</lastname1>");
					writer.println("\t<address1parent1>175 Hillmount Road</address1parent1>");
					writer.println("\t<address2parent1></address2parent1>");
					writer.println("\t<zip1>L6C 1Z7</zip1>");
					writer.println("\t<city1>Markham</city1>");
					writer.println("\t<country1>Canada</country1>");
					writer.println("\t<state1>Ontario</state1>");
					writer.println("\t<phone1>" + parent_number + "</phone1>");
					
					writer.println("\t<cardname2>" + parent2_firstname + " " + parent2_lastname + "</cardname2>");
					writer.println("\t<cardnumber2>4111111111111111</cardnumber2>");
					writer.println("\t<expmonth2>April</expmonth2>");
					writer.println("\t<expyear2>2020</expyear2>");
					writer.println("\t<securitycode2>344</securitycode2>");
					writer.println("\t<firstname2>" + parent2_firstname + "</firstname2>");
					writer.println("\t<lastname2>" + parent2_lastname + "</lastname2>");
					writer.println("\t<address1parent2>175 Hillmount Road</address1parent2>");
					writer.println("\t<address2parent2></address2parent2>");
					writer.println("\t<zip2>L6C 1Z7</zip2>");
					writer.println("\t<city2>Markham</city2>");
					writer.println("\t<country2>Canada</country2>");
					writer.println("\t<state2>Ontario</state2>");
					writer.println("\t<phone2>" + parent2_number + "</phone2>");
					writer.println("</testcase>");
					
					
			}
			
			writer.close();
		}
		
		
	}

}
