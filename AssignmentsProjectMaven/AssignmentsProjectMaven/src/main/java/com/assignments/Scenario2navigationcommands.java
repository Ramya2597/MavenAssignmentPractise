package com.assignments;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario2navigationcommands {

	public static void main(String[] args) {
		
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya gajjala\\Downloads\\Java Downloads\\browsers\\chromedriver.exe");
		driver= new FirefoxDriver();
		driver.get("https://portal.accenture.com");
		driver.manage().window().maximize();
		driver.manage().window().getSize();
		driver.manage().window().getPosition();
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.navigate().to("https://github.com");
		driver.quit();
		

	}

}