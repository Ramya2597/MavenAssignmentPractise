package com.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scenario5and6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
	//-------------------------------------------------------------------------------------------------------//	
		//dropbox
	WebElement skillsdbox= driver.findElement(By.id("Skills"));
		Select skillsvalues=new Select(skillsdbox);
		//skillsvalues.selectByIndex(1)
	skillsvalues.selectByValue("Adobe Photoshop");
	skillsvalues.selectByIndex(7);
	System.out.println(skillsvalues.getAllSelectedOptions());
	System.out.println(skillsvalues.getOptions().size());
	System.out.println(skillsdbox.getText());
	//-------------------------------------------------------------------------------------------------------//
	
	//radio button
	
	WebElement radiobtn=driver.findElement(By.xpath("//*[@class='col-md-4 col-xs-4 col-sm-4']/label[1]"));
	if(radiobtn.isSelected()==true)
	{
		System.out.println("radio");
	}
	else
		radiobtn.click();
	if(radiobtn.isEnabled()==true)
	{
		System.out.println("button is enabled");
	}
	//-------------------------------------------------------------------------------------------------------------//
	
	
	//driver.close();


}}
