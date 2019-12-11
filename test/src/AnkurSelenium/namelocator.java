package AnkurSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


public class namelocator {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\test1\\drivers123\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("firstname")).sendKeys("Ahmad");
		driver.findElement(By.name("lastname")).sendKeys("jamal");
		driver.findElement(By.name("reg_email__")).sendKeys("5145487876");
		driver.findElement(By.name("reg_passwd__")).sendKeys("khan");
		driver.findElement(By.id("month")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("websubmit")).click();
	}

}