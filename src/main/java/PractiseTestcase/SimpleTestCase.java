package PractiseTestcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SimpleTestCase {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://acme-test.uipath.com/account/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElementById("password").sendKeys("leaf@12");
		
		driver.findElementById("buttonLogin").click();
		   
	    WebElement vendor = driver.findElementByXPath("(//button[@type='button'])[6]");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(vendor).perform();
	    
	    	    
	    driver.findElementByLinkText("Search for Vendor").click();//click on search for vendor
	    
	    driver.findElementById("vendorName").sendKeys("Blue Lagoon");
	    
	    driver.findElementByXPath("//button[@id='buttonSearch']").click();
	    
	    
	    
	    
	    
	   
	    
	    
	    
	    
	    
	    
	    
	   
	    
	    
		
		
	}
	

}
