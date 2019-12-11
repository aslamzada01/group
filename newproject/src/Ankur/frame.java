package Ankur;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium.condition")).click();
		//driver.switchTo().frame(driver.findElement(By.linkText("com.thoughtworks.selenium.condition")));
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("ActiveSession")).click();
		

	}

}
