
package day6.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");

		driver.manage().window().maximize();

		//wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementByLinkText("Try it Yourself »").click();
		
		
	   /*
	  	//getWindowHandle(); returns unique address of current active window and Data type is String
		String currentWindow = driver.getWindowHandle();
		System.out.println(currentWindow);
		
		*/
		//Collection(Set) of String
		Set<String> allWin = driver.getWindowHandles();    // allWin  variable contains all reference
		
		
		
		// for each window one by one iterator we use foreach iterator
		// String eachWin - for each window reference
		// allWin - contains all window references because of getWindowHandles() method.
		for (String eachWin : allWin) {								
			driver.switchTo().window(eachWin);	// Switching window			
		}
		
		
		
		
		
		
	
		
		


	}

}
