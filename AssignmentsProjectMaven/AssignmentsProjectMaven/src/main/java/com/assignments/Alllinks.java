package com.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		List <WebElement> links=  driver.findElements(By.tagName("a"));
		 System.out.println(links.size());
		 for(int i=0;i<links.size();i++)
	 {
			 System.out.println(links.get(i).getText());
		 }
	
	}

}
