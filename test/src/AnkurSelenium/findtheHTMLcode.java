package AnkurSelenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class findtheHTMLcode {
// HTML Source Code
	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\test1\\drivers123\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 
 driver.get("https://www.ariatickets.com");
 Thread.sleep(2000);
 driver.manage().window().maximize();
 Thread.sleep(1000);
 String pagesource = driver.getPageSource();
 System.out.println(pagesource);
 driver.close();
 
 
	}

}
