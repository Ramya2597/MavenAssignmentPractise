package com.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya gajjala\\Downloads\\Java Downloads\\browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ascsubtag%3D_k_CjwKCAjw74b7BRA_EiwAF8yHFI0BkfUfeKaIVOKRsAjqvNTXrKFqxZXfLO13YmeDl0_eAB5VYU1C_RoCPQUQAvD_BwE_k_%26ext_vrnc%3Dhi%26gclid%3DCjwKCAjw74b7BRA_EiwAF8yHFI0BkfUfeKaIVOKRsAjqvNTXrKFqxZXfLO13YmeDl0_eAB5VYU1C_RoCPQUQAvD_BwE%26tag%3Dgooghydrabk-21%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		/*driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		driver.findElement(By.className("nav-icon nav-arrow")).click();
		driver.findElement(By.className("nav-a")).click();*/
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Ramya");
		Thread.sleep(1000);
		driver.findElement(By.id("ap_phone_number")).sendKeys("98765467210");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("9876543210");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[6]/span[1]/span[1]/input[1]")).click();	 
	    driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);
	    driver.quit();
}
}
