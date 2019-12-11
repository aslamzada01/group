package AnkurSelenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class howtogoback {

	public static void main(String[] args)  throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\test1\\drivers123\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().back(); // back option
		Thread.sleep(5000);
		driver.navigate().forward(); // forward back to main page
		driver.quit();
		
		

	}

}
