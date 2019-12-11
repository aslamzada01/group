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

public class amazonjunit {
	
static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		
		driver.get("https://www.walmart.com");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//driver.close();
	}

	@Before
	public void setUp() throws Exception {
		//Thread.sleep(6000);
		
	}

	@After
	public void tearDown() throws Exception {
		
		//Thread.sleep(5000);
	}

	@Test
	public void test() {
		
		driver.findElement(By.xpath("//button[@id='header-account-toggle']")).click();
		driver.findElement(By.xpath("//div[text()='Sign In']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jamalkhan");
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys("kabuljan");
		
		
		
	
	}

}
