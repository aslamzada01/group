package AnkurWebDriverClasses;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class iFrame2example {
	
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		
		
		WebElement outerframe = driver.findElement(By.xpath("//div[@id='Multiple']//iframe[contains(text(),'<p>Your browser does not support iframes.</p>')]"));
		driver.switchTo().frame(outerframe);
		Thread.sleep(5000);
		
		WebElement innerframe = driver.findElement(By.xpath("//iframe[contains(text(),'<p>Your browser does not support iframes.</p>')]"));
		driver.switchTo().frame(innerframe);
		
		driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("welcome");
		driver.close();
	}

}
