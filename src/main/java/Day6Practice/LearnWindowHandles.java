package Day6Practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

public static void main(String[] args) {
		
		//Open /navigate browser
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
        driver.get("https://www.irctc.co.in/nget/train-search");
		
		//maximise windows
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("(//span[text()='AGENT LOGIN'])[1]").click();
		
	    driver.findElementByLinkText("Contact Us").click();
		//driver.findElementsByXPath("(//a[text()='Contact Us'])[1]")/ not a appropiate Xpath for Contact us.
		
	    //switch one window to another window
	      //get window handle(),return unique address of active window and data type is string.
		   
	    String currentWindow = driver.getWindowHandle();
		 System.out.println(currentWindow);
		    
		    //Collection(Set) of String
		    
		   Set<String> allWin = driver.getWindowHandles(); //allWin variable contains all window references. driver.getWindowHandles() stored all Window references in allWin variable.
		   System.out.println(allWin);//Please print all windows reference which were stored in allWin variable.
		    
		    
		 // for each window one by one iterator we use for each iterator
		 		// String eachWin - for each window reference
		 		// allWin - contains all window references because of getWindowHandles() method.
		    
		   
		   for(String eachWin:allWin) { 
			   
			System.out.println(eachWin);   
		   driver.switchTo().window(eachWin);	// Switching window	
		   System.out.println(driver.getTitle());
		   
		
	
}

}

	
}
