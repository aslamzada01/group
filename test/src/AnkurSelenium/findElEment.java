package AnkurSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class findElEment {

	public static void main(String[] args) throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\test1\\drivers123\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.facebook.com");
		
 Thread.sleep(500);
 
 driver.findElement(By.id("email")).sendKeys("Ahmad");
 driver.findElement(By.id("pass")).sendKeys("theking");
		
		
	}

}
