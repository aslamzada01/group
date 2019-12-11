package AnkurSelenium;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;
public class manualdimensionpagesize {

	public static void main(String[] args) throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\test1\\drivers123\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	
		// this option manualy change the size of our page
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		System.out.println(driver.manage().window().getSize());
		
		Dimension d = new Dimension (640,480);
		 
		driver.manage().window().setSize(d);
		 System.out.println(driver.manage().window());
		
		
		
	}

}
