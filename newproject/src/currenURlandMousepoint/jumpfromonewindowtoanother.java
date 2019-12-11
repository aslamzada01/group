 package currenURlandMousepoint;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
	 
	public class jumpfromonewindowtoanother {    //// it will open new windows like parents and child

	   //// 
		static WebDriver driver;
			public static void main(String[] args) {
				 // it will take you to forgot account page but not in same page it will take you in seprate page
				
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();  // if we want we can use ChromeDriver to use chrome browser
				
				driver.navigate().to("https://www.facebook.com");
				 
				String currentwindow = driver.getCurrentUrl();  /// it show in consol the page version the two page
				System.out.println(currentwindow);
				
				//String currentwindowhandles = driver.getWindowHandle();// << this is anotheway to take current window id <<
						//System.out.println(currentwindowhandles);
			   Actions point = new Actions(driver);
				
			WebElement forgot = driver.findElement(By.linkText("Forgot account?"));//));
				// forgot.click();
				
			     point.keyDown(Keys.SHIFT).click(forgot).build().perform();
			//Set <String> ids = driver.getWindowHandles();
			//System.out.println(ids);
			//System.out.println(ids.size());
		
				
		}

	}