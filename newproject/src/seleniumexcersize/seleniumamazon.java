package seleniumexcersize;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class seleniumamazon {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	{
		
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
	 driver= new ChromeDriver();
	 
	 driver.get("https://www.amazon.com");
	 
	 driver.findElement(By.id("nav-link-accountList")).click(); 
	 
	 
	 driver.findElement(By.className("nav-action-inner")).click(); 
	 
	
	 driver.findElement(By.id("ap_email")).sendKeys("aslamzada5@gmail.com");
	 
	
	 driver.findElement(By.id("continue")).click();
	Thread.sleep(600);
	driver.close();
	}

}
