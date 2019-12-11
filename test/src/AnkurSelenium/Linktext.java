package AnkurSelenium;

 
	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.*;
	public class Linktext {

		public static void main(String[] args) throws InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\test1\\drivers123\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com");
			
			
			driver.findElement(By.linkText("Data Policy")).click();
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.navigate().forward();
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Sign Up")).click();
			
			
			
			
			
			
			
			
	}
		

}
