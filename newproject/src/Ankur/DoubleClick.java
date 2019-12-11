package Ankur;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		
		
		WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
		Actions act = new Actions(driver);
		act.doubleClick(button).build().perform();
		
	}

}
