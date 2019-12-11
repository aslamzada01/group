package AnkurWebDriverClasses;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
public class MouseHover1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ariatickets.com");
		
		WebElement Events=driver.findElement(By.xpath("//a[contains(text(),'Events')]")); // ////*[@id=\"menu-item-21\"]/a
		
		Actions act = new Actions(driver);
		act.moveToElement(Events).build().perform();
 
	}

}
