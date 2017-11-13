package com.scholastic.cucumber.uploadResults;

import static com.scholastic.torque.common.TestBaseProvider.getTestBase;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.UpdateValuesResponse;
import com.google.api.services.sheets.v4.model.ValueRange;

/*************************************
 * @author Rashid
 *
 ************************************/
public class WrapperFunctions extends Schemas {
	public boolean writeToSheet(String cellRange, Object[] obj) {
		try {
			Sheets service = getSheetsService();
			String valueInputOption = "RAW";
			String spreadsheetId = getTestBase().getContext().getString("spreadsheetId");
			
			List<List<Object>> values = Arrays.asList(
					Arrays.asList(obj)
					);
			ValueRange body = new ValueRange()
			.setValues(values);
			UpdateValuesResponse result =
					service.spreadsheets().values().update(spreadsheetId, cellRange, body)
					.setValueInputOption(valueInputOption)
					.execute();
			return true;
		}
		catch(Exception ex) {
			org.testng.Assert.fail("Exception occurred while writing to the sheet. Exception = " + ex.getMessage());
			return false;
		}
	}

	public List<List<Object>> readFromSheet(String sheetName, String cellRange) {
		try {
			Sheets service = getSheetsService();

			String spreadsheetId = getTestBase().getContext().getString("spreadsheetId");

			ValueRange result = service.spreadsheets().values().get(spreadsheetId, sheetName+cellRange).execute();
			int size = result.getValues().size();
			int numRows = result.getValues() != null ? result.getValues().size() : 0;
			System.out.println("Total Number of Rows are: " +numRows);
			Iterator<List<Object>> it = result.getValues().iterator();
			while(it.hasNext()) {
				System.out.println("###: "+it.next());
			}
			return result.getValues();
		}
		catch(Exception ex) {
			org.testng.Assert.fail("Exception occurred while reading from sheet. Exception = " + ex.getMessage());
		}
		return null;
	}
	
	public static String getDateAndTime() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd h:mm:ss a");
		Date today = new Date();
		return simpleDateFormat.format(today);
	}
	
	public static void main(String[] args) throws Exception {
		Object[] obj = new Object[]{"1", "TC_Login","Login with valid cred", "Passed", "NA"};
		WrapperFunctions schmObj = new WrapperFunctions();
		schmObj.writeToSheet("DummySheet!A2:E2", obj);
		List<List<Object>> totalRows = schmObj.readFromSheet("DummySheet", "!A2:E1000" );
		System.out.println("TotalNumber of rows: "+totalRows);
		Iterator<List<Object>> it = totalRows.iterator();
		for (int i = 0; i < totalRows.size(); i++) {
			System.out.println("TCID: "+totalRows.get(i).get(0));
		}
	}
	
	public void click_element(WebElement element) {

		SCHUtils.waitForElementToBeClickable(element, 30);
		try {
			element.click();
		}catch(Exception e) {
		SCHUtils.clickUsingJavaScript(element);
		e.printStackTrace();
		}
	}
	

}
