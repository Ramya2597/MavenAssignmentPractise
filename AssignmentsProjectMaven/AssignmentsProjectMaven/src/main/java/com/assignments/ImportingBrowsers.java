package com.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ImportingBrowsers {
	 
 
	  
		public static WebDriver drivers(String browser) {
			
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramya gajjala\\Downloads\\Java Downloads\\browsers\\chromedriver.exe" );
			return new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\Ramya gajjala\\Downloads\\Java Downloads\\browsers\\geckodriver.exe" );
			return new FirefoxDriver();
		}
		
		else if (browser.equalsIgnoreCase("Internetexplorer")) 
		{
		System.setProperty("webdriver.ie.driver","C:\\Users\\Ramya gajjala\\Downloads\\Java Downloads\\browsers\\IEDriverServer.exe" );
		return new InternetExplorerDriver();
		}
		return null;
	
}

		
		}

	
	
	



		