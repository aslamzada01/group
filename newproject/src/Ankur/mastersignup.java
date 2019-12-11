package Ankur;

	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
	
	public class mastersignup {

		
		WebDriver driver;
		public static void main(String[] args) {
			
			
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver ();
			
			driver.get("https://www.facebook.com");
			
			driver.findElement(By.name("firstname")).sendKeys("Ahmad");
			driver.findElement(By.name("lastname")).sendKeys("kamal");
			driver.findElement(By.name("reg_email__")).sendKeys("5793155791");
			driver.findElement(By.name("reg_passwd__")).sendKeys("sdiuyfiwery");
			
			Select dropdo = new Select(driver.findElement(By.id("month"))); // dropdown menue it will mostly use in buying airline ticket
			
			dropdo.selectByVisibleText("Jan");
			
	        Select dropdo1 = new Select(driver.findElement(By.id("day")));
			
			dropdo1.selectByVisibleText("14");
			
			
	        Select dropdo2 = new Select(driver.findElement(By.id("year")));
			
			dropdo2.selectByVisibleText("1989");
			driver.findElement(By.name("sex")).click();
			driver.findElement(By.xpath("//button[@id='u_0_y']")).click();
			
			
		}
	}
	