package TestNGpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googleTestNG {
	static WebDriver driver;
	
	
 @BeforeMethod
public void google() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe"); 
	driver = new ChromeDriver();
	driver.get("https://www.google.com"); 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
}

/*@Test
void googletitle() throws InterruptedException {
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.name("q")).sendKeys("iphone");
	Thread.sleep(5000);
}*/

@Test
void search() throws InterruptedException {
	driver.findElement(By.name("q")).sendKeys("iphone");
	Thread.sleep(5000);
	driver.findElement(By.name("btnK")).click();
}

/*@AfterMethod
void teardown() {
	driver.quit();
}*/
} 
