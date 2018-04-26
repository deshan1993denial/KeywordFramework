package com.qapps.common.admin.common;

import org.automationtesting.excelreport.Xl;
import org.testng.annotations.Test;



public class ExcelRead 
{
  @Test
  public void f() throws Exception 
  {
	 // extent=new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentScreenshot.html");
	Xl.generateReport("D:/Report","Report2.xls");
	 
	 
  }
}
