package Ankur;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class frame0 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("packageListFrame"); // first frame
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame"); // second frame
		driver.findElement(By.linkText("WebDriver.ImeHandler")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Instance Methods"));

	}

}
