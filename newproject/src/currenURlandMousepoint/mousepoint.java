package currenURlandMousepoint;

 import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class mousepoint {    //// it will help us to andle the muse and keybord

   //// it will help us to andle the muse and keybord( out keybord and mouse work by helpig of action)
	static WebDriver driver;
		public static void main(String[] args) throws InterruptedException  {
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\thedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.navigate().to("https://www.facebook.com");
			Thread.sleep(5000);
			Actions point = new Actions(driver);
			
		WebElement forgot =driver.findElement(By.linkText("Forgot account?")); // the mouse point on something and then click
			// forgot.click();
			Thread.sleep(5000);
		point.keyDown(Keys.SHIFT).click(forgot).build().perform(); 
			
			//driver.findElement(By.linkText("Forgot account?")).click(); // same task but with the help of click
		//driver.quit();
			
			
	}

}
