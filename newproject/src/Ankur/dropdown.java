package Ankur;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	
	WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		
		driver.get("https://www.facebook.com/");
		
		Select dropdo = new Select(driver.findElement(By.id("month")));
		
		dropdo.selectByVisibleText("Jan");
		
        Select dropdo1 = new Select(driver.findElement(By.id("day")));
		
		dropdo1.selectByVisibleText("14");
		
		
        Select dropdo2 = new Select(driver.findElement(By.id("year")));
		
		dropdo2.selectByVisibleText("2019");
		
		



	}

}
