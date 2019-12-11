package AnkurSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class partiallinks {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\test1\\drivers123\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.partialLinkText("Data")).click();  /// partial link is the same fo linktext but in partial we make it short just take firs later of it
	}

}
