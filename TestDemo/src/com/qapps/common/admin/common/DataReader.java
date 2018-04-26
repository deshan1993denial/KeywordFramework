package com.qapps.common.admin.common;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import com.qapps.usrmnu.admin.master.login.UI_Operation_Login;

public class DataReader extends ExcelRead
{

	static Logger log = Logger.getLogger(DataReader.class.getName());
	
	
 WebDriver driver1;	
/*@BeforeTest
public void setup() throws Exception  
{
		log.info("chromeset Reached1..");
    	 //System.setProperty("webdriver.chrome.driver","./lib"+File.separator+"chromedriver.exe");
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\deshanr\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		log.info("After set property1..");
    		driver1 = new ChromeDriver();
    		log.info("chromeset Reached1..");
    		driver1.manage().window().maximize();

    		driver1.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    		System.out.println("hai this is ReadExcel calling.....");
    		ReadExcel file = new ReadExcel();
    		System.out.println("hai this is ReadExcel calling>>>>>>>");
    		ReadProperty object = new ReadProperty();
    		
    		Properties allObjects =object.getObjectRepository();
    		
    		log.info("Propertyfile Reached1..>>>>>>>>>>");
    		allObjects.list(System.out);
    		
    		UI_Operation_Login operation = new UI_Operation_Login(driver1);
    		log.info("Before Excel Reading");
    		//Sheet WSheet = file.readExcel(System.getProperty("user.dir")+"\\","LOGIN.xls","LOGIN");
    		Sheet WSheet = file.readExcel(System.getProperty("user.dir")+"\\","LOGIN2.xls","LOGIN");
    		log.info("Sheet  Reached1..>>>>>>>>>>");
    		log.info("Excel Reading");
    		int rowCount = WSheet.getLastRowNum()-WSheet.getFirstRowNum();
    		log.info("Excel Reading:rowCount"+rowCount);
    		for (int i = 1; i < rowCount+1; i++)
    		{
    			log.info("Enter For Reached1..>>>>>>>>>>");
    			Row row = WSheet.getRow(i);
    				if((row.getCell(0).toString().length()!=0))
    				{
    					log.info("Enter if Reached1..>>>>>>>>>>");
    					operation.perform(allObjects, row.getCell(1).toString(), row.getCell(2).toString(),
    			                row.getCell(3).toString(), row.getCell(4).toString(),row.getCell(5).toString(),row.getCell(6).toString());
    				}
    		}
    		
    		

    }*/
	
	@Test
	public void Test1()  throws Exception 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\deshanr\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			/*log.info("After set property1..");*/
	    		driver1 = new ChromeDriver();
	    		/*log.info("chromeset Reached1..");*/
	    		driver1.manage().window().maximize();

	    		driver1.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		
	ReadExcel file = new ReadExcel();
	log.info("ReadExcel Reached2..");
	ReadProperty object = new ReadProperty();
	log.info("Propertyfile Reached2..");
	Properties allObjects =object.getObjectRepository();
	UI_Operation_Login operation = new UI_Operation_Login(driver1);
	Sheet WSheet = file.readExcel(System.getProperty("user.dir")+"\\","LOGIN2.xls","CountryMaster");
	int rowCount = WSheet.getLastRowNum()-WSheet.getFirstRowNum();
	for (int i = 1; i < rowCount+1; i++)
	{
		log.info("Enter For Reached2..>>>>>>>>>>");
		Row row = WSheet.getRow(i);
			if((row.getCell(0).toString().length()!=0))
			{
				log.info("Enter if Reached2..>>>>>>>>>>");
				operation.perform(allObjects, row.getCell(1).toString(), row.getCell(2).toString(),
		                row.getCell(3).toString(), row.getCell(4).toString(),row.getCell(5).toString(),row.getCell(6).toString());
			}
	}
	
	
	}
	
	
	
	
	
	@Test
	public void Test2()  throws Exception 
	{
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\deshanr\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			/*log.info("After set property1..");*/
	    		driver1 = new ChromeDriver();
	    		/*log.info("chromeset Reached1..");*/
	    		driver1.manage().window().maximize();

	    		driver1.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	ReadExcel file = new ReadExcel();
	
	ReadProperty object = new ReadProperty();
	Properties allObjects =object.getObjectRepository();
	UI_Operation_Login operation = new UI_Operation_Login(driver1);
	Sheet WSheet = file.readExcel(System.getProperty("user.dir")+"\\","LOGIN2.xls","RegionMaster");
	int rowCount = WSheet.getLastRowNum()-WSheet.getFirstRowNum();
	for (int i = 1; i < rowCount+1; i++)
	{
		Row row = WSheet.getRow(i);
			if((row.getCell(0).toString().length()!=0))
			{
				operation.perform(allObjects, row.getCell(1).toString(), row.getCell(2).toString(),
		                row.getCell(3).toString(), row.getCell(4).toString(),row.getCell(5).toString(),row.getCell(6).toString());
			}
	}
	
	
	}
	
	
	


}
