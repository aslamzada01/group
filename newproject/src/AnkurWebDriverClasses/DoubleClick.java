package AnkurWebDriverClasses;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://api.jquery.com/dblclick/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0); // the box is on the frame so we need to go to frame first
		
		WebElement click= driver.findElement(By.xpath("//html//body//div"));
		
		Actions act = new Actions(driver);
		act.doubleClick(click).build().perform();
		Thread.sleep(3000);
		act.doubleClick(click).build().perform();
		Thread.sleep(3000);
		act.doubleClick(click).build().perform();
		Thread.sleep(3000);
		act.doubleClick(click).build().perform();
		Thread.sleep(3000);
		act.doubleClick(click).build().perform();
		Thread.sleep(3000);
		act.doubleClick(click).build().perform();
		
		
		

	}

}
