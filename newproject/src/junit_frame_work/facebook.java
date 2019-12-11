package junit_frame_work;

import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import class9selenium.selectClass;

public class facebook {
	
 static WebDriver driver;
 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://facebook.com/");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//driver.close();
		
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	 
 
     driver.findElement(By.xpath("//input[@id='u_0_f']")).sendKeys("ahmad");
     driver.findElement(By.name("lastname")).sendKeys("khan");
     driver.findElement(By.id("u_0_k")).sendKeys("5753166459");
     driver.findElement(By.id("u_0_r")).sendKeys("iouer98w45hj");
     
     Select month = new Select(driver.findElement(By.id("month")));
     month.selectByVisibleText("Feb");
     
     Select day = new Select(driver.findElement(By.id("day")));
     day.selectByVisibleText("2");
     
     Select year = new Select(driver.findElement(By.id("year")));
     year.selectByVisibleText("1985");
     
     driver.findElement(By.xpath("//input[@value='2']")).click();
     driver.findElement(By.id("u_0_y")).click();
     //driver.quit();
     
  
	}

}
