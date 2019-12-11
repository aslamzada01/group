package AnkurSelenium;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;
public class scrolldowntoend {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\test1\\drivers123\\chromedriver.exe");
				
				WebDriver driver = new  ChromeDriver();
		
		driver.get("https://www.wikipedia.org");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(6000);
		js.executeScript("scrollBy(0,2500)");
		Thread.sleep(6000);
		driver.quit();

	}

	}


