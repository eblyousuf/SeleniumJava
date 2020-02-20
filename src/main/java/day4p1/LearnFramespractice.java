package day4p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFramespractice {
	

	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    
    
	driver.manage().window().maximize();
	
	driver.get("https://jqueryui.com/selectable/");
		
	//option one id or name
	
	//driver.switchTo().frame("id or name value");
	
	//option two index
	
	//driver.switchTo().frame(0);
	
	//option three webElement 
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.switchTo().frame(driver.findElementByClassName("demo-frame"));//webElement
	
	driver.findElementByXPath("//ol[@id='selectable']/li[1]").click();
	
	driver.findElementByXPath("//ol[@id='selectable']/li[2]").click();
	
	driver.findElementByXPath("//ol[@id='selectable']/li[3]").click();
	
	driver.findElementByXPath("//ol[@id='selectable']/li[4]").click();
	
	driver.findElementByXPath("//ol[@id='selectable']/li[5]").click();
	
	driver.findElementByXPath("//ol[@id='selectable']/li[6]").click();
	
	driver.findElementByXPath("//ol[@id='selectable']/li[7]").click();
	
	
	    
	
    
	
	}

}
