package Ankur;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class actionpupop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.expedia.com//");
		
		driver.findElement(By.id("package-departing-hp-package")).click();
		driver.findElement(By.xpath("//button[@data-day='17'][1]")).click();

	}
	

}
