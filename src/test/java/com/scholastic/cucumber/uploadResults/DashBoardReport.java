package com.scholastic.cucumber.uploadResults;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;


/*************************************
 * @author Rashid
 *
 ************************************/
public class DashBoardReport {

	static DashBoardModel model = new DashBoardModel();

	public static void main(String[] args) throws FilloException {
		insertIntoSheet();
		/*DashBoardReport.setEndResult();
		new DashBoardReport().insertResultsToGoogleSheet(model);*/
	}

	public static void setEndResult() {

		File fXmlFile = new File(System.getProperty("user.dir")+"/target/surefire-reports/testng-results.xml");
		Document doc = null;

		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();

			int totalScenarios = Integer.parseInt(doc.getDocumentElement().getAttribute("total"));
			int passeddScenarios = Integer.parseInt(doc.getDocumentElement().getAttribute("passed"));
			int failedScenarios = Integer.parseInt(doc.getDocumentElement().getAttribute("failed"));
			int skippedScenarios = Integer.parseInt(doc.getDocumentElement().getAttribute("skipped"));

			DashBoardModel.setWeek(getCurrentWeek());
			DashBoardModel.setTcTotal(totalScenarios);
			DashBoardModel.setTcPassed(passeddScenarios);
			DashBoardModel.setTcFailed(failedScenarios);
			DashBoardModel.setTcSkipped(skippedScenarios);		
		} catch (IOException e) {
			System.out.println("###########################################################################");
			System.out.println("Testng-resutls.xml file not found");
			System.out.println("###########################################################################");
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
	}

	/*public void insertResultsToGoogleSheet(DashBoardModel model) {
		DashBoardReport.setEndResult();
		List<List<Object>> rows = readFromSheet("DashboardResult", "!A1:A1000");
		System.out.println("Rows: " + rows.size());
		int rowCount = rows.size()+1;
		//Write to Google Sheet
		Object[] obj = new Object[]{getDateAndTime(), DashBoardModel.getTcTotal(),DashBoardModel.getTcPassed(),DashBoardModel.getTcFailed(),DashBoardModel.getTcSkipped()};
		System.out.println("range:     "+"DashboardResult!A"+rowCount+":E"+rowCount);
		writeToSheet("DashboardResult!A"+rowCount+":E"+rowCount, obj);
	}*/

	public static String getCurrentWeek() {
		String[] monthName = { "January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December" };
		Calendar cal = Calendar.getInstance();
		String month = monthName[cal.get(Calendar.MONTH)];
		LocalDate date = LocalDate.now();
		WeekFields weekFields = WeekFields.of(Locale.getDefault());
		int week =date.get(weekFields.weekOfMonth()); 
		System.out.println("Month name - Week: " + month+" "+week);
		return month+" "+week;
	}

	/**
	 * This method is to insert the execution results to excel sheet
	 * @throws FilloException
	 */
	public static void insertIntoSheet() throws FilloException {
		DashBoardReport.setEndResult();
		int id = getRownCount();
		Fillo fillo=new Fillo();
		Connection connection=fillo.getConnection(System.getProperty("user.dir")+"/src/test/java/com/scholastic/cucumber/uploadResults/Results.xlsx");
		String strQuery="INSERT INTO Result(time, id,AutomationScripts, Pass, Fail, Skipped)"
				+ " VALUES('"+getDateAndTime()+"','"+id+"','"+DashBoardModel.getTcTotal()+"','"+DashBoardModel.getTcPassed()+"','"+DashBoardModel.getTcFailed()+"','"+DashBoardModel.getTcSkipped()+"')";
		System.out.println(strQuery);
		connection.executeUpdate(strQuery);
		connection.close();
	}

	/**
	 * This method is to get the lastrow+1 count
	 * @return
	 * @throws FilloException
	 */
	public static int getRownCount() throws FilloException {
		Fillo fillo=new Fillo();
		Connection connection=fillo.getConnection(System.getProperty("user.dir")+"/src/test/java/com/scholastic/cucumber/uploadResults/Results.xlsx");
		String strQuery="Select * from Result";
		int rowCount = 0;
		try {
			rowCount=connection.executeQuery(strQuery).getCount();
			System.out.println(rowCount);
		} catch (Exception e) {
			
		}
		connection.close();
		return rowCount+1;
	}
	
	public static String getDateAndTime() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd h:mm:ss a");
		Date today = new Date();
		return simpleDateFormat.format(today);
	}

}
