package TestNGExecute;

import org.testng.annotations.Test;


import POM.HomeA;
import POM.Signup;
import POM.try_prime;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AmazonTestNG {
	
	public WebDriver driver ;

	
  @Test
  public void f() {
	  
	  HomeA home = new HomeA(driver);
	  try_prime amaz = new try_prime(driver);
	  Signup signup = new Signup(driver);

	  home.prime();
	  amaz.amazo();
	  signup.creatacc();
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https:www.amazon.com");
	  driver.manage().window().maximize();
  }
  

  @AfterClass
  public void afterClass() {
  }

}
