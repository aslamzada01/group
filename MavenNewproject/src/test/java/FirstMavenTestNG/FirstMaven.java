package FirstMavenTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import FirstMaven.mavenfacebook;

public class FirstMaven {
	public static WebDriver driver;
	
	
	  @Test
	  public void f() {
		  mavenfacebook maven6 = new mavenfacebook(driver);
		  maven6.emillocation1("email");
		  maven6.passwordlocation1("pass");
		  maven6.loginbutton();
		 
		  
	 
	  }
	  @BeforeClass
	  public void beforeClass() {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://www.facebook.com");
	  }

	  @AfterClass
	  public void afterClass() {
	  }

	}

