package seleniumexcersize;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium5exsersize {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		
		
	driver.get("https://www.walmart.com");
	driver.findElement(By.linkText("CCTileStore-putTitle")).click();
	
   //driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]/div/div[3]/div/div/div[2]/div[2]/button/span/span/span[2]")).click();
   //driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[3]/div[2]/div/div[1]/div[2]/div/a[1]/div/span/div")).click();

   driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("aslamzada5@gmail.com");
   driver.findElement(By.name("password")).sendKeys("THEbestone");
   driver.findElement(By.xpath("/html/body/div/div/div/form/button ")).click();
	
	}
}
