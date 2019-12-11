package AnkurWebDriverClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class taptonewwindow {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com");
		
		//String currentwindow= driver.getWindowHandle();
		//    System.out.println(currentwindow);
		
		Actions point= new Actions(driver);
		WebElement forgot=driver.findElement(By.linkText("Forgot account?"));
		point.keyDown(Keys.SHIFT).click(forgot).build().perform();
		
		
		

	}

}
