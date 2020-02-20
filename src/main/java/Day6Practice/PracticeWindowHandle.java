package Day6Practice;

public class PracticeWindowHandle {
	
	public static void main(String[] args) {
		
	}
	
	System.setProperty ("webdriver.chrome.driver",  "./drivers/chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElementByLinkText("Try it Yourself »").click();
	//driver.findElementByXPath("//button[text()='Try it']").click();
	
	Set<String> allWin = driver.getWindowHandles();
	System.out.println(allWin);
	
	for(String eachWin:allWin) {
		System.out.println(eachWin);
…
	
	}
	
	}	

}
