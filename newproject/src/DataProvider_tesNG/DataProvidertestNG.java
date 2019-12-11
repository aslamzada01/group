package DataProvider_tesNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class DataProvidertestNG {
	
	public static WebDriver driver;
	                                   // with the help of dataprovider we can put multi value or we can use multitpal value
	                                   // whith the help of data anotaion
	                                   // dp mean data provider(( we can put nigative and positave value
  @Test(dataProvider = "dp")
  public void f(String first,String second)   throws InterruptedException{

	  driver.findElement(By.id("email")).sendKeys(first);
	  driver.findElement(By.id("pass")).sendKeys(second);
	  driver.findElement(By.xpath("//*[@aria-label='Log In']")).click();
	  Thread.sleep(6000);
	  
	  driver.navigate().back();
	  
	  driver.findElement(By.id("email")).clear();
	  Thread.sleep(5000);
	  driver.findElement(By.id("pass")).clear();
	  Thread.sleep(5000);  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	
      new Object[] { "ahmadkhan@gmail.com", "a" }, // here we can write how many times we run ans try deferent email and password
      new Object[] { "khan@gmail.com", "b" },      // here we have used 4 time but you can put as much as you can
      new Object[] { "jan@gmail.com", "c" },  //Parameterized tests allow developers to run the same test over and over again using different values
      new Object[] { "65465465464", "d" },
      new Object[] { "iuwefkjbdfskj","e"},
      
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
				 driver.get("https://www.facebook.com");
				 driver.manage().window().maximize();
				 
				
				
  }

  @AfterClass
  public void afterClass() {
  }

}


