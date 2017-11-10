package com.dw.automation.pages.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pcod_ExcelLibrary {

	public String getExcelData(String directory, String sheetname, int rowNum, int cellNum) {
		String retVal=null;
		try {
			FileInputStream fis=new FileInputStream(directory);
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
	
	// Get the data map for a specific data in one of the cells
	public static Map<String, String> find_get_ExcelData_SpecificCell(String filepath, String filename, String sheetname, String searchTerm) {
		Map<String, String> data = new HashMap<String, String>();
		String sep = File.separator;
		
		try {
			File file = new File (filepath + sep + filename);
			FileInputStream fis = new FileInputStream(file);
			
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetname);
			
			for(Row row: s){
				for(Cell cell: row){
					if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
		                if (cell.getRichStringCellValue().getString().trim().equals(searchTerm)) {
		                	int rowNum = row.getRowNum();  
		                	Row r = s.getRow(rowNum);
		                	Row heading = s.getRow(0);
		                	
		                	for (int j = 0; j < r.getLastCellNum(); j++) {
		                		if(r.getCell(j) == null)
		        					continue;
		                		
		                		data.put(heading.getCell(j).getStringCellValue(), r.getCell(j).getStringCellValue());
		        	        }
		                	
		                	return data;
		                }
		            }
				}
			}
			
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
		return null;
	}
	
	// Get a data map of the specific row
	public static Map<String, String> find_get_ExcelData_SpecificRow(String filepath, String filename, String sheetname, int rowNum) {
		Map<String, String> data = new HashMap<String, String>();
		String sep = File.separator;
		
		try {
			File file = new File (filepath + sep + filename);
			FileInputStream fis = new FileInputStream(file);
			
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetname);
			
			Row heading = s.getRow(0);
			Row r = s.getRow(rowNum);
			
			if(r == null)
				return null;
			
			for (int j = 0; j < heading.getLastCellNum(); j++) {
				if(r.getCell(j) == null){
					data.put(heading.getCell(j).getStringCellValue(), "");
					continue;
				}
				//System.out.println(r.getCell(j).getStringCellValue());
        		data.put(heading.getCell(j).getStringCellValue(), r.getCell(j).getStringCellValue());
	        }
			
			return data;
			
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
		return data;
	}
	
	// Get a data list for a specific row
	public static List<String> find_get_ExcelData_Row(String filepath, String filename, String sheetname, int rowNum) {
		List<String> data = new ArrayList<String>();
		String sep = File.separator;
        
		try {
			File file = new File(filepath + sep + filename);
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetname);
			
			Row r = s.getRow(rowNum);
        	
			for (int j = 0; j < r.getLastCellNum(); j++) {
        		data.add(r.getCell(j).getStringCellValue());
	        }
			
			return data;
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
		return null;
	}
	
	public String getExcelData_2(String sheetname, int rowNum, int cellNum) {
		String retVal=null;
		try {
			FileInputStream fis=new FileInputStream("src/ExcelFile/tcodpcoditeminfo.xlsx");
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
	
	public int getLaRow(String sheetname) {
		int laRow=0;
		try {
			FileInputStream fis=new FileInputStream("src/ExcelFile/tcodpcoditeminfo.xlsx");
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
	
	// Get the row number for a specific data in one of the cells
	public static int getRow_SpecificCell(String filepath, String filename, String sheetname, String searchTerm){
		String sep = File.separator;
		
		try {
			File file = new File (filepath + sep + filename);
			FileInputStream fis = new FileInputStream(file);
			
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetname);
			
			for(Row row: s){
				for(Cell cell: row){
					if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
		                if (cell.getRichStringCellValue().getString().trim().equals(searchTerm)) {
		                	return row.getRowNum();  
		                }
		            }
				}
			}
			
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
		return -1;
		
	}
	
	public void readExcel(String filePath,String fileName,String sheetName) throws IOException{

	    File file =    new File(filePath+"\\"+fileName);

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
	
	// Append the data in an array to a new row
	public static synchronized void writeExcel(String filePath,String fileName,String sheetName,String[] dataToWrite) throws IOException{
        System.out.println("calling excel method to write");
        //Create an object of File class to open xlsx file
        String sep = File.separator;
          
        File file = new File(filePath + sep + fileName);

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

        cell.setCellValue(dataToWrite[j]);

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
	
	//Remove the specified row and move all rows below it upwards
	public static void removeAndShiftRowsUp_ExcelData_SpecificRow(String filepath, String filename, String sheetname, int rowNum) {
		String sep = File.separator;
        
		try {
			File file = new File(filepath + sep + filename);
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetname);

			Row heading = s.getRow(0);

        	int lastRowIdx = heading.getLastCellNum();
        	s.shiftRows(rowNum + 1, lastRowIdx, -1);
        	
        	FileOutputStream fos=new FileOutputStream(filepath + sep + filename);
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
	
	//Set the data at the specified cell
	public static void setExcelData_SpecificCell(String filepath, String filename, String sheetname, int rowNum, int cellNum, String valueToSet){
		String sep = File.separator;
		
		try {
			File file = new File(filepath + sep + filename);
			FileInputStream fis = new FileInputStream(file);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheetname);
			Row r = s.getRow(rowNum);
			Cell c = r.getCell(cellNum);
			
			c.setCellValue(valueToSet);
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
