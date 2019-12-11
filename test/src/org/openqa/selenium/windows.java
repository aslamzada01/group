package org.openqa.selenium;

 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class windows {    //// it will help us to andle the muse and keybord

   //// it will help us to andle the muse and keybord( out keybord and mouse work by helpig of action)
	static WebDriver driver;
		public static void main(String[] args) {
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\thedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.navigate().to("https://www.facebook.com");
			Actions point = new Actions(driver);
			
		WebElement forgot =driver.findElement(By.linktest("Forgot account"));//));
			// forgot.click();
			
		point.keyDown(Keys.SHIFT).click(forgot).build().perform();
			
			
	}

}
