package AnkurSelenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class demo2 {

	public static void main(String[] args) {
		
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\test1\\drivers123\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com");
		System.out.println("facebook working");
		driver.quit(); 
		

	}
}
