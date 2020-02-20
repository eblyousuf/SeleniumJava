package com.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium3 {
	static WebDriver driver;//web driver call

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/driver/geckodriver.exe");
		//driver connect with selenium.
		
		WebDriver driver = new FirefoxDriver();//firefox launch
		driver.get("https://www.ups.com/us/en/Home.page");// ups url copy from google
		
		
		driver.findElement(By.xpath("//*[@id='ups-navItems']/ul[2]/li[1]/a")).click();//xpath of login under ups 
		//driver.findElement(By.id("email")).sendKeys("yousuf@gmail.com");
		//driver.findElement(By.id("password")).sendKeys(keysToSend);
		driver.findElement(By.id("email")).sendKeys("munira13");
		driver.findElement(By.id("pwd")).sendKeys("Automation123");
		driver.findElement(By.id("submitBtn")).click();
	
			
		
	}

}
