package class7seleniumsaleem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class expediadropdown {
	public static WebDriver driver;

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\Desktop\\selenium IDE\\all selenium export file\\Automation\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		
		//driver.get("https://www.facebook.com");
	}

}
