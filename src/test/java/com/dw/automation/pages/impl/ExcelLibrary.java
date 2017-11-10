package com.dw.automation.pages.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary {

	public String getExcelData(String sheetname, int rowNum, int cellNum) {
		String retVal=null;
		try {
			FileInputStream fis=new FileInputStream("src/ExcelFile/data.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheetname);
			Row r=s.getRow(rowNum);
			Cell c=r.getCell(cellNum);
			retVal=c.getStringCellValue();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retVal;
	}
	
	public void setExcelData(String sheetname, int rowNum, int cellNum) {
		synchronized (this) {
			
		try {
			FileInputStream fis=new FileInputStream("src/ExcelFile/data.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheetname);
			Row r=s.getRow(rowNum);
			Cell c=r.getCell(cellNum);
			c.setCellValue("Used");
			FileOutputStream fos=new FileOutputStream("src/ExcelFile/data.xlsx");
			wb.write(fos);
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	public int getLaRow(String sheetname) {
		int laRow=0;
		try {
			FileInputStream fis=new FileInputStream("src/ExcelFile/data.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheetname);
			laRow=s.getLastRowNum();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return laRow;
	}
}
