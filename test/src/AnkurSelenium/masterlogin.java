package AnkurSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class masterlogin {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\test1\\drivers123\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		
		driver.findElement(By.id("email")).sendKeys("peoplentech");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("peoplentech");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("loginbutton")).click();
	}

}
