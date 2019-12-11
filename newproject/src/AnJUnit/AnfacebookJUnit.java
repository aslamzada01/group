package AnJUnit;

import static org.junit.Assert.*;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnfacebookJUnit {
	public static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
	}

	@Before
	public void setUp() throws Exception {
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);
	}

	@Test
	public void test() {
		driver.findElement(By.id("email")).sendKeys("khangul@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("khan");
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
		
	}
	
	}

 
