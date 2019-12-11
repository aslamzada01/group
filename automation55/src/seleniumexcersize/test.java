package seleniumexcersize;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test{
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Desktop\\selenium IDE\\all selenium export file\\Automation\\src\\drivers1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div[2]")).clear();

	}

}
