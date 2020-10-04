package com.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Trying {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		   
			driver=new ChromeDriver();
			driver.get("https://classic.freecrm.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//	------------------login--------------------------
			driver.findElement(By.xpath("//input[@class='form-control'][1]")).sendKeys("batchautomation");
			driver.findElement(By.xpath("//input[@class='form-control'][2]")).sendKeys("Test@12345");
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
		 
		 driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Ramya");
		 driver.findElement(By.xpath("//input[@name='middle_initial']")).sendKeys(" ");
		 driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("Gajjala");
		 
		 WebElement suffix =driver.findElement(By.xpath("//select[@name='suffix']"));
		 Select suffixvalues=new Select(suffix);
		 suffixvalues.selectByValue("Jr.");
		 
		 
		 driver.findElement(By.xpath("//input[@name='nickname']")).sendKeys("Ramya");
		 driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[4]")).click();
		
		 String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
	         driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Accenture");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.partialLinkText("Accenture")).click();
		Thread.sleep(2000);
		//driver.close();
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
		
		
		//div[@class='calendar'][3]/table[1]/tbody[1]/tr/td[contains(text),25]
		
		
		//----------------------------------------------------------------------------------------------------------------------------------
		driver.findElement(By.xpath("//*[@id='f_trigger_c_birthday']")).click();
		
		String expectedmonth = "May, 2020";
		String day = "20";
		String beforexpath = "(//body[1]/div[7]/table[1]/tbody[1]/tr/td[contains(text(),'";
		String afterxpath = "')])[2]";
		boolean flag = false;

		while (true) {
			

			
				WebElement actualMonth = driver.findElement(By.xpath("//div[@class='calendar']//table/thead/tr/td[@class='title']"));
				System.out.println(actualMonth.getText());
			
				if (actualMonth.getText().equalsIgnoreCase(expectedmonth)) {
					
					String dayval=driver.findElement(By.xpath(beforexpath+day+afterxpath)).getText();
					System.out.println(dayval);
					WebElement dayele=driver.findElement(By.xpath(beforexpath+day+afterxpath));
					System.out.println(dayele);
					dayele.click();
					break;
				
				}
				else {
				driver.findElement(By.xpath("//tr[@class='headrow']//td[2]/div")).click();
				}
		
			
		
		
				
		}
		WebElement timebox=driver.findElement(By.xpath("//select[@id='timezone']"));
		Select timevalues=new Select(timebox);
		timevalues.selectByValue("Asia/Singapore");
		
		WebElement countrybox=driver.findElement(By.xpath("//select[@name='country']"));
		Select countryvalues=new Select (countrybox);
		countryvalues.selectByValue("IN");
		
		
		driver.findElement(By.xpath("//input[@type='submit'][1]")).click();	

		
		
		
	}
		
		//driver.close();
		
		
	
	
	


}
	

