package executeJUnit;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.home2;



public class facebook2home {
public static WebDriver driver;
 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	
	
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		home2 homepage2 = new home2 (driver);
		homepage2.inputemail("khan@gmail.com");
		homepage2.inputepassword("khanjan");
		homepage2.enterloginbutton(); 
	
	
	}

}
