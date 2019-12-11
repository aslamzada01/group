package seleniumexcersize;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class selenium3walmartexcersize {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\Automation\\Automation\\chromedriver.exe" );
    
		driver= new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.name("email")).sendKeys("bashiraslamzada");
        Thread.sleep(600);
		driver.findElement(By.name("pass")).sendKeys("password");
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(600);
		driver.navigate().forward();
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(700);
		driver.findElement(By.linkText("Help")).click();
		driver.quit();
		
		
		
		
		}

}
