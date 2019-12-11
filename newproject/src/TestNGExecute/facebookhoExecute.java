package TestNGExecute;

import org.testng.annotations.Test;

import TestNG.Home;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class facebookhoExecute {
	public static WebDriver driver;
	
  @Test
  public void f() {
	  Home home = new Home(driver);
			  home.emailak("email");
	  home.passwordak("pass");
	  home.loginak();
	  Reporter.log("this is all about the the log in"); // it will show up to the report ((emaillable-report))
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.get("https://www.facebook.com");
	 
  }

  @AfterClass
  public void afterClass() {
  }

}
 
