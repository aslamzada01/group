package AnkurSelenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class demo12 {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\test1\\drivers123\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		String currentURL= driver.getCurrentUrl();
		System.out.println(currentURL);
		Thread.sleep(5000);
		driver.quit();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\test1\\drivers123\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com");
		Thread.sleep(6000);
		String currentUR = driver1.getCurrentUrl();
		System.out.println(currentURL);
		Thread.sleep(6000);
		driver1.navigate().refresh();
		Thread.sleep(6000);
		driver1.navigate().back();
		Thread.sleep(6000);
		driver1.navigate().forward();
		Thread.sleep(6000);
		driver1.manage().window().maximize();
		Thread.sleep(6000);
		driver1.navigate().refresh();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver1;
		js.executeScript("scrollBy(0,2500)");
		Thread.sleep(6000);
		driver1.navigate().refresh();
		Thread.sleep(6000);
		driver1.quit();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\test1\\drivers123\\chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.walmart.com");
		Thread.sleep(6000);
		driver2.navigate().back();
		Thread.sleep(6000);
		driver2.navigate().forward();
		Thread.sleep(6000);
		driver2.navigate().refresh();
		driver2.manage().window().maximize();
		driver2.navigate().refresh();
		System.out.println(driver2.manage().window().getSize());
		
		Dimension d = new Dimension (640,480);
		 
		driver2.manage().window().setSize(d);
		 System.out.println(driver2.manage().window());
		 Thread.sleep(6000);
		 driver2  .close();
		
		
		
		

	}

}
