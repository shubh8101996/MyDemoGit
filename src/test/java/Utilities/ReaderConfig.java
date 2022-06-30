package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReaderConfig {
	
	
   Properties prop;
	
	String path="C:\\Users\\Unique Web System\\eclipse-workspace\\PageObjectModel\\Configuration\\config.properties";
	
	public ReaderConfig()  {
		
		
		try {
			prop=new Properties();
			FileInputStream fr=new FileInputStream(path);
			prop.load(fr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public String getBaseUrl() {
		
		String value=prop.getProperty("baseUrl");
		
		if (value!=null) {
			
			return value;
		}
		
		else {
			throw new RuntimeException("url not specified in config file");
		}
	}
	
   public String getBrowser() {
		
		String value=prop.getProperty("browser");
		
		if (value!=null) {
			
			return value;
		}
		
		else {
			throw new RuntimeException("browser not specified in config file");
		}
	}
	
	
	


}
