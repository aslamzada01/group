package seleniumexcersize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframexcersize2 {
	static WebDriver driver;

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\Automation\\Automation\\chromedriver.exe");
driver = new ChromeDriver ();

driver.get("http://demo.automationtesting.in/Frames.html");
driver.switchTo().frame(driver.findElement(By.id("singleframe")));
 
driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("hello");

	}

}
