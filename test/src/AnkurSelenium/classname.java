package AnkurSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class classname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\test1\\drivers123\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.className("gb_e")).click();
	}

}
