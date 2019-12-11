package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newa {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com");
	
	driver.findElement(By.xpath("//*[@class='nav-line-2 '])[2]")).click();
	//driver.findElement(By.xpath(".//a[@id='createAccountSubmit']")).click();
	
	

	}

}
 