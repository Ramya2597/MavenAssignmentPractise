package com.assignments;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Scenarios {
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
	//	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramya gajjala\\Downloads\\Java Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver.get("https://portal.accenture.com");
			driver.manage().window().maximize();
			String gettitle=  driver.getTitle();
			System.out.println(gettitle);
			String cururl=  driver.getCurrentUrl();
			System.out.println(cururl);
			Set<String> windowhandles=driver.getWindowHandles();
			System.out.println(windowhandles);
			driver.close();
			driver.quit();

		
	}

}
