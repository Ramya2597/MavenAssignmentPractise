package com.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario15 {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().deleteAllCookies();
		
	
	//driver.switchTo().frame(iframes).size();
		Actions act=new Actions(driver);
		act.build().perform();
		Thread.sleep(4000);
		driver.close();

	}

}
