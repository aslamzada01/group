package AnkurSelenium;


	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.*;


	public class Amazon {

		public static void main(String[] args)  throws InterruptedException{
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\test1\\drivers123\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.com");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
			driver.findElement(By.className("nav-input")).click();
			driver.findElement(By.linkText("32 GB")).click();
			driver.findElement(By.linkText("Simple Mobile Prepaid - Apple iPhone 6s (32GB) - Space Gray")).click();
			
			driver.findElement(By.id("add-to-cart-button")).click();
			driver.findElement(By.className("a-button-text")).click();
			
			
			
	}

}
