package AnkurSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class waittime {

	public static void main(String[] args)  throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\test1\\drivers123\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://google.com");
		//Thread.sleep(6000);
		//driver.quit();
		
		//driver.get("https//www.facebook.com");
		//Thread.sleep(20000);
		//driver.quit();
		
		//*driver.get("https://www.amazon.com");
		//Thread.sleep(1000);
		//driver.quit();
		
		driver.navigate().to("https://www.walmart.com");
		Thread.sleep(5000);
		 driver.close();
		
		

	}

}
