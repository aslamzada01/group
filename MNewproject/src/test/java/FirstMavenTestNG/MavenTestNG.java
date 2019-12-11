package FirstMavenTestNG;

import org.testng.annotations.Test;

import FirstMaven.firstmavenjan;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class MavenTestNG {
	public WebDriver driver;
	
	
  @Test
  public void f() {
	  firstmavenjan face= new firstmavenjan(driver);
	  face.emillocation1("ahmakkhan@gmail.com");
	  face.passwordlocation1("oewiuroweiur");
	  face.loginbutton();
	 
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
