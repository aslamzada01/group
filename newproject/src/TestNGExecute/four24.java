package TestNGExecute;

import org.testng.annotations.Test;

import FirstMaven.mavenfacebook;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class four24 {
	public WebDriver driver ;
	
	
  @Test
  public void f() {
	  mavenfacebook face= new mavenfacebook(driver);
	  face.emillocation1("email");
	  face.passwordlocation1("pass");
	  face.loginbutton();
	 
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
  }

}
