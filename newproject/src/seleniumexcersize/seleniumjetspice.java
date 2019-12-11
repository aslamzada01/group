package seleniumexcersize;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class seleniumjetspice {

	public static WebDriver driver;
	public static void main(String[] args)  throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");

		driver= new ChromeDriver();
		driver.get("https://www.spicejet.com");
		Select s = new Select(driver.findElement(By.className("adult-popup")));
	
		s.selectByValue("2");
	}

}
