package seleniumexcersize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class selenium4excersize {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");

		driver= new ChromeDriver();
		driver.get("https://www.gmail.com");
		
	driver.findElement(By.id("identifierId")).sendKeys("johnbrown0048");
	driver.findElement(By.id("identifierNext")).click();
	driver.findElement(By.name("Enter your password")).sendKeys("THEbrown");  // why the class name is not working?
	}

}
