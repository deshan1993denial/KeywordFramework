package com.qapps.common.admin.common;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class ReadProperty 
{
	
	public Properties getObjectRepository() throws IOException {
		Properties p = new Properties();
	
		
		//InputStream stream = new FileInputStream(new File(System.getProperty("user.dir")+"//DataProperty"));
		//InputStream stream = new FileInputStream(new File("DataProperty.txt"));
		//InputStream stream = getClass().getResourceAsStream("/DataProperty.txt"); 
		//BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
		InputStream stream = this.getClass().getResourceAsStream("/DataProperty");
		//load all objects
		
			p.load(stream);
		
		
		 return p;
	}

}
