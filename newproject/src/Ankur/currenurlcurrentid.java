 package Ankur;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class currenurlcurrentid {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		
		driver.get("https://www.facebook.com");
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		String windows = driver.getWindowHandle();
		System.out.println(windows);
		// TODO Auto-generated method stub

	}


	
}