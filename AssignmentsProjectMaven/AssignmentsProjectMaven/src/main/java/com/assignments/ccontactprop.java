package com.assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ccontactprop {

	public static void main(String[] args) throws IOException  {
		
		WebDriver driver;
		driver=new ChromeDriver();
		FileInputStream fis;
		Properties prop = null ;
		
		
	
		try {
			String path=System.getProperty("user.dir");
			System.out.println(path);
			fis=new FileInputStream(path+"\\src\\main\\java\\com\\assignments\\config.properties\\");
			prop=new Properties();
			prop.load(fis);
		
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		String url=prop.getProperty("url");
		System.out.println(url);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	------------------login--------------------------
		driver.findElement(By.xpath("//input[@class='form-control'][1]")).sendKeys(prop.getProperty("username"));
		System.out.println(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@class='form-control'][2]")).sendKeys(prop.getProperty("psword"));
		System.out.println(prop.getProperty("pswrod"));
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
	
	}
}
