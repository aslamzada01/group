package org.openqa.selenium;

import java.util.Set;

import org.openqa.selenium.By;
	 import org.openqa.selenium.WebDriver;
	 import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	 
	public class jumpfromonewindowtoanother {    //// it will open new windows like parents and child

	   //// 
		static WebDriver driver;
			public static void main(String[] args) {
				
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\thedriver\\chromedriver.exe");
				driver = new ChromeDriver();
				
				driver.navigate().to("https://www.facebook.com");
				
				String currentwindow = driver.getCurrentUrl();
				System.out.println(currentwindow);
				
				Actions point = new Actions(driver);
				
			WebElement forgot = driver.findElement(By.linktest("Forgot account?"));//));
				// forgot.click();
				
			point.keyDown(Keys.SHIFT).click(forgot).build().perform();
			Set <String> ids = driver.getWindowHandles();
			System.out.println(ids);
			System.out.println(ids.size());
				
		}

	}