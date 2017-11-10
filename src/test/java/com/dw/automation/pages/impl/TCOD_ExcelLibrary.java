package com.dw.automation.pages.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TCOD_ExcelLibrary {

	public String getExcelData(String sheetname, int rowNum, int cellNum) {
		String retVal=null;
		try {
			FileInputStream fis=new FileInputStream("src/ExcelFile/teacher_info.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetname);
			Row r = s.getRow(rowNum);
			Cell c = r.getCell(cellNum);
			retVal = c.getStringCellValue();
			
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
	
	public int getLaRow(String sheetname) {
		int laRow=0;
		try {
			FileInputStream fis=new FileInputStream("src/ExcelFile/teacher_info.xlsx");
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
	
	public void readExcel(String filePath, String fileName, String sheetName) throws IOException{

	    File file = new File(filePath+"\\"+fileName);

	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook guru99Workbook = null;

	    String fileExtensionName = fileName.substring(fileName.indexOf("."));

	    if(fileExtensionName.equals(".xlsx")){

	    guru99Workbook = new XSSFWorkbook(inputStream);

	    }

	    else if(fileExtensionName.equals(".xls")){

	        guru99Workbook = new HSSFWorkbook(inputStream);

	    }

	    Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);

	    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

	    for (int i = 1; i < rowCount+1; i++) {

	        Row row = guru99Sheet.getRow(i);

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

	        }

	        System.out.println();

	    }

	    

	    }
	
	
	public void overwriteExcel(String filePath,String fileName,String sheetName,String[] dataArr) throws IOException{
          System.out.println("calling excel method to write");
        //Create an object of File class to open xlsx file

        File file = new File(filePath + File.separator + fileName);

        //Create an object of FileInputStream class to read excel file

        FileInputStream inputStream = new FileInputStream(file);

        Workbook guru99Workbook = null;

        //Find the file extension by splitting  file name in substring and getting only extension name

        String fileExtensionName = fileName.substring(fileName.indexOf("."));

        //Check condition if the file is xlsx file

        if(fileExtensionName.equals(".xlsx")){

        //If it is xlsx file then create object of XSSFWorkbook class
        	System.out.println("entering to xlsx");

        guru99Workbook = new XSSFWorkbook(inputStream);

        }

        //Check condition if the file is xls file

        else if(fileExtensionName.equals(".xls")){
        	System.out.println("entering to xls");
            //If it is xls file then create object of XSSFWorkbook class

            guru99Workbook = new HSSFWorkbook(inputStream);

        }

        

    //Read excel sheet by sheet name    

    Sheet sheet = guru99Workbook.getSheet(sheetName);
    
    for (int i = sheet.getLastRowNum(); i >= 1; i--) {
    	  sheet.removeRow(sheet.getRow(i));
    }
    //Get the current count of rows in excel file

    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
    
    //Get the first row from the sheet

    Row row = sheet.getRow(0);

    //Create a new row and append it at last of sheet

    Row newRow = sheet.createRow(rowCount+1);

    //Create a loop over the cell of newly created Row

    for(int j = 0; j < row.getLastCellNum(); j++){

        //Fill data in row

        Cell cell = newRow.createCell(j);

        cell.setCellValue(dataArr[j]);

    }

    //Close input stream

    inputStream.close();

    //Create an object of FileOutputStream class to create write data in excel file

    FileOutputStream outputStream = new FileOutputStream(file);

    //write data in the excel file

    guru99Workbook.write(outputStream);

    //close output stream

    outputStream.close();

    

    }
	
	public void appendExcel(String filePath,String fileName,String sheetName,String[] dataArr) throws IOException{
        System.out.println("calling excel method to write");
      //Create an object of File class to open xlsx file

      File file = new File(filePath + File.separator + fileName);

      //Create an object of FileInputStream class to read excel file

      FileInputStream inputStream = new FileInputStream(file);

      Workbook guru99Workbook = null;

      //Find the file extension by splitting  file name in substring and getting only extension name

      String fileExtensionName = fileName.substring(fileName.indexOf("."));

      //Check condition if the file is xlsx file

      if(fileExtensionName.equals(".xlsx")){

      //If it is xlsx file then create object of XSSFWorkbook class
      	System.out.println("entering to xlsx");

      guru99Workbook = new XSSFWorkbook(inputStream);

      }

      //Check condition if the file is xls file

      else if(fileExtensionName.equals(".xls")){
      	System.out.println("entering to xls");
          //If it is xls file then create object of XSSFWorkbook class

          guru99Workbook = new HSSFWorkbook(inputStream);

      }

      

  //Read excel sheet by sheet name    

  Sheet sheet = guru99Workbook.getSheet(sheetName);

  //Get the current count of rows in excel file

  int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

  //Get the first row from the sheet

  Row row = sheet.getRow(0);

  //Create a new row and append it at last of sheet

  Row newRow = sheet.createRow(rowCount+1);

  //Create a loop over the cell of newly created Row

  for(int j = 0; j < row.getLastCellNum(); j++){

      //Fill data in row

      Cell cell = newRow.createCell(j);

      cell.setCellValue(dataArr[j]);

  }

  //Close input stream

  inputStream.close();

  //Create an object of FileOutputStream class to create write data in excel file

  FileOutputStream outputStream = new FileOutputStream(file);

  //write data in the excel file

  guru99Workbook.write(outputStream);

  //close output stream

  outputStream.close();

  

  }
	
	
	/*public void setExcelData(String sheetname, int rowNum, int cellNum) {
		synchronized (this) {
			
		try {
			FileInputStream fis=new FileInputStream("src/ExcelFile/pcod_parent_creation.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheetname);
			Row r=s.getRow(rowNum);
			Cell c=r.getCell(cellNum);
			c.setCellValue("Used");
			FileOutputStream fos=new FileOutputStream("src/ExcelFile/pcod_parent_creation.xlsx");
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
	}*/
}
