package class7seleniumsaleem;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class alertexcersize {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\test1\\drivers123\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		 
		driver.findElement(By.className("btn-danger")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Ahmadkhan");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

	}

}
