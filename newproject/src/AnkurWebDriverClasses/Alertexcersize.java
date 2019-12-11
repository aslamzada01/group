package AnkurWebDriverClasses;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertexcersize {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();

	}

}
