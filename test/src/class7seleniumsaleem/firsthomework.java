package class7seleniumsaleem;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsthomework {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Desktop\\selenium IDE\\all selenium export file\\Automation\\src\\drivers\\chromedriver.exe");
	
	driver =new ChromeDriver();
	driver.get("https://www.amazon.com");
	 driver.manage().window().maximize();
	Thread.sleep(600);
	driver.navigate().refresh();
    driver.navigate().back();
    Thread.sleep(600);
    driver.navigate().forward();
   
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
    Thread.sleep(600);
    driver.findElement(By.xpath("html/body/div/header/div/div/div/div/form/div/div/input")).click();
    Thread.sleep(500);
	driver.findElement(By.id("pdagDesktopSparkleHeadline")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("html/body/div/div/div/span/div/a/div")).click();
	driver.close();
	
	
	}


	}


