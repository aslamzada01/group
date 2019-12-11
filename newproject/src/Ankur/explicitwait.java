package Ankur;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	
	public class explicitwait {

		public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//An explicit wait makes WebDriver wait for a certain condition to occur before proceeding further with execution.
	driver.get("http://www.newtours.demoaut.com");
	
	WebDriverWait mywait= new WebDriverWait(driver,1000);
	
	WebElement username = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
	username.sendKeys("Ahmad");
	 
	
		}
		
			
	}