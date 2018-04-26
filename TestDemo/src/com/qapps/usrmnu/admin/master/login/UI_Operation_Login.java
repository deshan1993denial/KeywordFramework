package com.qapps.usrmnu.admin.master.login;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class UI_Operation_Login 
{

WebDriver driver;
    
	

	public UI_Operation_Login(WebDriver driver) 
	{
		this.driver=driver;
	
	}




	public void perform(Properties p,String operation,String Object,String SubObject,String ObjectType,String SubObjectType , String value) throws Exception{
      
        switch (operation.toUpperCase()) 
        {
        
        case "CLICK":
        	
        	driver.findElement(this.getObject(p, Object, ObjectType)).click();
        	break;
        	
            
        case "SETTEXT":
        	 driver.findElement(this.getObject(p,Object,ObjectType)).sendKeys(value);
        	 break;
        	
        case "GOTOURL":	
        	driver.get(p.getProperty(value));
            break;
       
            
           
               
        
           
            
      
        	
        	
        
        
        
	 
  	      default:
  	    	  break;
          
        
        }
    }
    
    private By getObject(Properties p,String Object,String ObjectType) throws Exception{
        //Find by xpath
        if(ObjectType.equalsIgnoreCase("XPATH")){
            
            return By.xpath(p.getProperty(Object));
        }
        //find by class
        else if(ObjectType.equalsIgnoreCase("CLASSNAME")){
            
            return By.className(p.getProperty(Object));
            
        }
        //find by name
        else if(ObjectType.equalsIgnoreCase("NAME")){
            
            return By.name(p.getProperty(Object));
            
        }
        //Find by css
        else if(ObjectType.equalsIgnoreCase("CSS")){
            
            return By.cssSelector(p.getProperty(Object));
            
        }
        //find by link
        else if(ObjectType.equalsIgnoreCase("LINK")){
            
            return By.linkText(p.getProperty(Object));
            
        }
        //find by partial link
        else if(ObjectType.equalsIgnoreCase("PARTIALLINK")){
            
            return By.partialLinkText(p.getProperty(Object));
            
        }
        else if(ObjectType.equalsIgnoreCase("ID")){
        	 
         
        	 return By.id(p.getProperty(Object));
            
          
        }
       
        
        else
        {
            throw new Exception("Wrong object type");
        }

}

	


}
