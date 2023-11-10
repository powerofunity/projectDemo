package com.mv.dataproviders;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.apache.xmlbeans.Filer;
import org.testng.annotations.DataProvider;
import org.testng.reporters.Files;


	public class DataSet{
	
	@DataProvider(name="pincode data")
	 public String[][]pinCodesData() throws IOException {
		//Read Excel and load data intp@d Array
		//Apache:POI
		String dir= System.getProperty("user.dir");
	  System.out.println(dir);
		String filepath=("C:\\Demo\\pincode.xlsx");
		String filePath= dir+"/src/test/resources/pincode.xlsx";
		
		FileInputStream fis= new FileInputStream(filePath);
		Workbook book;
		String[] parts =filepath.split(" ");
		if (parts[1].equalsIgnoreCase("xlsx")) {
			book = new HSSFWorkbook(fis);
		}else if(parts[1].equalsIgnoreCase("xlsx")) {
			book = new XSSFWorkbook(fis);
			HSSFSheet sheet = (HSSFSheet) book.getSheet("pincodes");
			String[][] pincodes = new String[sheet.getLastRowNum()][1];
			for(int i=1;i<=sheet.getLastRowNum();i++) {
				HSSFRow row = sheet.getRow(i);
				HSSFCell cell = row.getCell(1);
				 String pincode =  cell.getStringCellValue();
				pincodes[i-1][0]=pincode;
			}
		}
				
		
		
		
		
		//FileInputStream fis= new FileInputStream("C:\\Demo\\pincode.xlsx");
		//XSSFWorkbook book=new XSSFWorkbook(fis);
		//XSSFSheet sheet = book.getSheet("pincodes");
		//String[][] pincodes = new String[sheet.getLastRowNum()][1];
		//for(int i=1;i<=sheet.getLastRowNum();i++) {
			//XSSFRow row = sheet.getRow(i);
			//XSSFCell cell = row.getCell(1);
			 //String pincode =  cell.getStringCellValue();
			//pincodes[i-1][0]=pincode;
		//}
		// return pincodes;
		
	 }

}
