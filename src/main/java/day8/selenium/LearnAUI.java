package day8.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI { //Advance User Interations---> Keyboard and mouse action

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		
		WebElement src = driver.findElementById("draggable");		
		WebElement dest = driver.findElementById("droppable");
		
		// Any AUIneraction we should choose Actions class:- 
		Actions builder = new Actions(driver);
		builder.dragAndDrop(src, dest).perform();
		
		
		
		

	}

}



















