package seleniumcgroupexcirsize;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class firstgroupselenium {
public static WebDriver driver;
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\Automation\\Automation\\chromedriver.exe");
	driver = new ChromeDriver ();
  
	//driver.get("https://www.capitalonebank.com");
	//driver.findElement(By.xpath("(//*[text()='Sign In'])[1]")).click();  // 
	
	driver.get("https://www.walmart.com");
	driver.findElement(By.id("global-search-input")).sendKeys("iphone XR");
	driver.findElement(By.xpath("(//*[@class='g_a g_f'])[2]")).click();
	// driver.findElements(By.xpath("(//*[@class='product-title-link line-clamp line-clamp-2'])[1]")).click();
	
	
	
	}

}
