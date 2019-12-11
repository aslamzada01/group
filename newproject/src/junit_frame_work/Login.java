package junit_frame_work;

import static org.junit.Assert.*;


import java.sql.Driver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

	static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("https://www.facebook.com");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
	}

	@Before
	public void setUp() throws Exception {
		
		Thread.sleep(4000);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(6000);
	}

	@Test
	public void test() {
	
		driver.findElement(By.id("email")).sendKeys(" jamal");
		driver.findElement(By.id("pass")).sendKeys("khan");
		driver.findElement(By.id("loginbutton")).click();
	}

}
