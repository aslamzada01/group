package DataProvider_tesNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class exapleDataProvider {
	public WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String first, String second) throws InterruptedException {
	  driver.findElement(By.id("email")).sendKeys(first);
	  driver.findElement(By.id("pass")).sendKeys(second);
	  driver.findElement(By.xpath("//*[@aria-label='Log In']")).click();
	  
	  driver.navigate().back();
	  
	  driver.findElement(By.id("email")).clear();
	  Thread.sleep(5000);
	  
	  driver.findElement(By.id("pass")).clear();
	  Thread.sleep(5000);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	
      new Object[] { "khan@gmail.com", "a" },
      new Object[] { "jan@gmail.com", "b" },
      new Object[] { "khanjan", "c" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	  driver.get("https://www.facebook.com");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();   
  }

}
