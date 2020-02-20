package day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();


		driver.manage().window().maximize();


		driver.get("https://jqueryui.com/selectable/");


		//Option 1 (id or name)
		//  driver.switchTo().frame("id or name value"); // id or name locator value


		//Option 2(Index)
		// 	driver.switchTo().frame(0); // using index	(if frame or iframe tag contains only one then use index(0))


		//Option 3(WebElement)
		driver.switchTo().frame(driver.findElementByClassName("demo-frame")); //Webelement



		driver.findElementByXPath("//ol[@id='selectable']/li").click();		


	}


}
