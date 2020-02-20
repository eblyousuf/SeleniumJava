package day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Launch the chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		//maximize
		driver.manage().window().maximize();
		
		
		// Load Url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		
	driver.findElementById("username").sendKeys("DemoSalesManager");
	
	driver.findElementById("password").sendKeys("crmsfa");
	
	driver.findElementByClassName("decorativeSubmit").click();
	
	driver.findElementByLinkText("CRM/SFA").click();
	
	driver.findElementByLinkText("Leads").click();
	
	driver.findElementByLinkText("Merge Leads").click();
	
	driver.findElementByLinkText("Merge").click();
	
	
	String text = driver.switchTo().alert().getText();
	
	System.out.println(text);
	
	
	driver.switchTo().alert().accept();
	
	
	
	
	
	
		
		Thread.sleep(10000);
		
		
	}
	
	
	

}
