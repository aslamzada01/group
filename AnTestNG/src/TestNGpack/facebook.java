package TestNGpack;

import java.time.Month;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class facebook {
	
static WebDriver driver;

	
	@BeforeClass
	public  void setUpBeforeClass() throws Exception {
		//System.out.println("this is login");
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe"); 
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	@Test (priority = 0)
	void LogIn() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("khangul@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("khan");
	
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.navigate().back();
		driver.findElement(By.id("email")).clear();
	//	driver.close();
		
	}
@Test (priority= 1)
void CreatNA() {
	driver.findElement(By.name("firstname")).sendKeys("khan");
	driver.findElement(By.name("lastname")).sendKeys("jan");
	driver.findElement(By.name("reg_email__")).sendKeys("5989565665");
	driver.findElement(By.name("reg_passwd__")).sendKeys("absdfads");
	Select month = new Select (driver.findElement(By.id("month")));
	month.selectByVisibleText("May");
	Select day = new Select(driver.findElement(By.id("day")));
	day.selectByVisibleText("3");
	Select year = new Select(driver.findElement(By.id("year")));
	year.selectByVisibleText("1958");
	driver.findElement(By.name("sex")).click();
	driver.findElement(By.name("websubmit")).click();
	driver.close();
}
/*@AfterMethod
void logout() {
	driver.close();

}*/
	
}
