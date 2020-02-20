package PractiseTestcase;

import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestcase {
	
	public static void main(String[] args) {
		
	System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
		
		
		
	}

}
