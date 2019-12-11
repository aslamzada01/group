package Ankur;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class implicitlyWait {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
  
//An implicit wait is to tell WebDriver to poll the DOM for a certain amount of time when trying to find an element 
//or elements if they are not immediately available.
 
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);// we use this because if there is need of wait it will wait 10 second other
                                                                   //wise it will go fast
driver.findElement(By.name("userName")).sendKeys("Ahmad");
//Thread.sleep(5000);
driver.findElement(By.name("password")).sendKeys(" jamal");


	}

}
