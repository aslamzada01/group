package AnkurSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class navigate {

	
	//it mean navigat the our page to any website
	public static void main(String[] args) {
		
 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\test1\\drivers123\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 // navigate it will record on the server( but the driver.get dont)
		driver.navigate().to("http://www.google.com");
		
		String currentURL = driver.getCurrentUrl();
		
		System.out.println(currentURL);
		
		//driver.quit();
		driver.close();
	}

}
