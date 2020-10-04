package com.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/test/delete_customer.php");
			driver.manage().window().maximize();
		//	driver.manage().deleteAllCookies();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("578476906");
			driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			Alert alert=driver.switchTo().alert();
			alert.accept();
			System.out.println("sucessfully deleted");
			alert.dismiss();
	}

}
