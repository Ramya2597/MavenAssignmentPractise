package com.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
	Thread.sleep(2000);
	
	
//driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item'][contains(text(),'Action')]")).click();

//System.out.println("Clicked");
	List <WebElement> drp =driver.findElements(By.xpath("//div[@class='dropdown-menu show']"));
		//System.out.println(drp.size());
	 for(int i=0;i<drp.size();i++)
	 {
			 System.out.println(drp.get(i).getText());
			 
			 if( drp.get(i).getText().equals("Action")){
				 
				 Thread.sleep(3000);
				 drp.get(i).click();
		 }
	
	
		driver.close();
		
	}

}}
