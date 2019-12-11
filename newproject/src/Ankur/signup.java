package Ankur;



	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.*;
	
	public class signup {

		
		WebDriver driver;
		public static void main(String[] args) {
			
			
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver ();
			
			driver.get("https://www.facebook.com");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		}
	}