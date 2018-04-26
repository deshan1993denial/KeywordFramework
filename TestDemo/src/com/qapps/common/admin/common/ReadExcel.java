package com.qapps.common.admin.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadExcel 
{static Logger log = Logger.getLogger(ReadExcel.class.getName());

public Sheet readExcel(String filePath,String fileName,String sheetName) throws IOException {
	//File file =	new File(filePath+"\\"+fileName);
			
	File file =	new File(fileName);
	
	log.info("Inside Excel Reading >>>>>>>");
	log.info("Inside Excel Reading >>>>>>>"+fileName);
			//Create an object of FileInputStream class to read excel file
	
	//InputStream inputStream = this.getClass().getResourceAsStream("/"+file);
	
			FileInputStream inputStream = new FileInputStream(file);
		
			log.info("1 >>>>>>>:"+inputStream);
			
			HSSFWorkbook WorkB = null;
			
			//Find the file extension by spliting file name in substring and getting only extension name
			String fileExtensionName = fileName.substring(fileName.indexOf("."));
			log.info("2 >>>>>>>:"+fileExtensionName);
			//Check condition if the file is xlsx file
			if(fileExtensionName.equals(".xls"))
			{
				
			//If it is xlsx file then create object of XSSFWorkbook class
				WorkB = new HSSFWorkbook(inputStream);
			}
			
			//Check condition if the file is xls file
			else if(fileExtensionName.equals(".xlsx"))
			{
				
				//If it is xls file then create object of XSSFWorkbook class
				WorkB = new HSSFWorkbook(inputStream);
			}
			
			//Read sheet inside the workbook by its name
			Sheet  WSheet = WorkB.getSheet(sheetName);
			log.info("3 >>>>>>>:"+WSheet);
			 return WSheet;
		}



}
