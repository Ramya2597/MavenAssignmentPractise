package com.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario17 {
public static void main(String[] args) throws InterruptedException  {
	
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	WebElement switchto=driver.findElement(By.cssSelector("#header > nav > div > div.navbar-collapse.collapse.navbar-right > ul > li:nth-child(4) > a"));
	act.moveToElement(switchto).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[2]/a")).click();
	driver.manage().deleteAllCookies();
	System.out.println(driver.getTitle());
	if(driver.getTitle().contains("Frames & windows")==true)
	{
		System.out.println("landed to Succesful page");
		
	}
	driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
	System.out.println(driver.getTitle());
	driver.navigate().back();
	System.out.println("navigated to "+driver.getTitle()+" ie parent window");
	Thread.sleep(1000);
	driver.quit();
}
}
