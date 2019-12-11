package AnkurWebDriverClasses;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class impalicitwaitfacebook {

	public static void main(String[] args) {
		
		//An implicit wait is to tell WebDriver to poll the DOM for a certain amount of time when trying to find an element 
		//or elements if they are not immediately available.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("jamalkhan");

	}

}
