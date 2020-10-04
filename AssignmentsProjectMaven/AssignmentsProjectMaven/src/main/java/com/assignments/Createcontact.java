package com.assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Createcontact {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver;
		driver=new ChromeDriver();
		FileInputStream fis = null;
		Properties prop = null;
		
		
	
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
		} catch (IOException e) {
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
		driver.findElement(By.xpath("//input[@class='form-control'][2]")).sendKeys(prop.getProperty("psword"));
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
	//	--------------create contact----------------------

	driver.switchTo().frame("mainpanel");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//ul[@class='mlddm']/li[4]"))).perform();
	 //   Thread.sleep(4000);
	driver.findElement(By.linkText("New Contact")).click();
	//Thread.sleep(2000);
	driver.switchTo().defaultContent();
//----------------------entering values------------------------------
	
	driver.switchTo().frame("mainpanel");
	 WebElement drp=driver.findElement(By.xpath("//select[@name='title']"));
	 Select drpvalues=new Select(drp);
	 drpvalues.selectByValue("Miss");
	 
	 driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(prop.getProperty("firstname"));
	 driver.findElement(By.xpath("//input[@name='middle_initial']")).sendKeys(prop.getProperty("Middlename"));
	 driver.findElement(By.xpath("//input[@name='surname']")).sendKeys(prop.getProperty("surname"));
	 
	 WebElement suffix =driver.findElement(By.xpath("//select[@name='suffix']"));
	 Select suffixvalues=new Select(suffix);
	 suffixvalues.selectByValue(prop.getProperty("suffixvalue"));
	 
	 
	 driver.findElement(By.xpath("//input[@name='nickname']")).sendKeys(prop.getProperty("nickname"));
	 driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[4]")).click();
	
	 String winHandleBefore = driver.getWindowHandle();
	for(String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);
	}
         driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys(prop.getProperty("company"));
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.partialLinkText("Accenture")).click();
	//Thread.sleep(2000);
	
	driver.switchTo().window(winHandleBefore);
	driver.switchTo().frame("mainpanel");
	
	
	driver.findElement(By.xpath("//tbody/tr[11]/td[2]/input[4]")).click();
	for(String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);
	}
	  driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys(prop.getProperty("supervisorname"));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//tbody/tr[2]/td[1]/form[1]/input[4]")).click();
	driver.findElement(By.partialLinkText("Rajesh Kumar")).click();
	driver.switchTo().window(winHandleBefore);
	driver.switchTo().frame("mainpanel");
	
	driver.findElement(By.xpath("//*[@name='receive_email'][2]")).click();
	//--------------------date---------------------------------------------
	
/*	String month="March, 2020";
	String date="25";
	driver.findElement(By.xpath("//*[@id='f_trigger_c_birthday']")).click();
	
	
	
	
	while(true) {

		try {
			String text=driver.findElement(By.xpath("/html[1]/body[1]/div[6]/table[1]/thead[1]/tr[1]/td[2]")).getText().trim();
			System.out.println(text);
		if(text.equalsIgnoreCase(month))
			
		{
			driver.findElement(By.xpath("/html[1]/body[1]/div[8]//table[1]/tbody[1]/tr[5]/td[2]")).click();
				
			break;
		}
		
		
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//thead/tr[2]/td[2]")).click();
			System.out.println("checking for March Month");
		}
	
	
		//Thread.sleep(3000);
		
	}

	*/
	
	
	//div[@class='calendar'][3]/table[1]/tbody[1]/tr/td[contains(text),]
	
	
	//----------------------------------------------------------------------------------------------------------------------------------
	driver.findElement(By.xpath("//*[@id='f_trigger_c_birthday']")).click();
	
	String expectedmonth = "May, 2020";
	String day = "20";
	String beforexpath = "//div[@class='calendar']//table/tbody/tr[";
	String afterxpath = "]/td[";

	while (true) {
		WebElement actualMonth = driver.findElement(By.xpath("//div[@class='calendar']//table/thead/tr/td[@class='title']"));
		//System.out.println(actualMonth.getText());
		if (actualMonth.getText().equalsIgnoreCase(expectedmonth)) {

			boolean flag = false;
			
			//iterate for calender dates
			for (int rowNum = 1; rowNum <= 5; rowNum++) {
				for (int colNum = 2; colNum <= 8; colNum++) {
					WebElement dayval = driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colNum+"]"));
					//System.out.println(dayval.getText());
					if (day.equalsIgnoreCase(dayval.getText())) {
						dayval.click();
						flag = true;
						break;
					}							
				}
			}

			//driver.findElement(By.xpath("//div[@class='calendar']/table[1]/tbody/tr/td[contains(text(),"+day+"]")).click();
			
			if (flag) {
				break;
			}

		} else {
			
			driver.findElement(By.xpath("//tr[@class='headrow']//td[2]/div")).click();

		}

	}
	
	//----------------------------------------------------------------------
	
	
	WebElement timebox=driver.findElement(By.xpath("//select[@id='timezone']"));
	Select timevalues=new Select (timebox);
	timevalues.selectByValue(prop.getProperty("timevalue"));
	
	WebElement countrybox=driver.findElement(By.xpath("//select[@name='country']"));
	Select countryvalues=new Select (countrybox);
	countryvalues.selectByValue(prop.getProperty("countryvalue"));
	
	
	driver.findElement(By.xpath("//input[@type='submit'][1]")).submit();
	//driver.close();
	}
	}
	
