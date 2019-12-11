package JUnitExcersize;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayJUnit {

	public static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
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
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.linkText("Start here.")).click();
		driver.findElement(By.name("customerName")).sendKeys("Ahmad");
		driver.findElement(By.name("email")).sendKeys("jamalkhan@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("34535453535");
		driver.findElement(By.id("ap_password_check")).sendKeys("34535453535");
		driver.findElement(By.id("continue")).click();
	}

}
