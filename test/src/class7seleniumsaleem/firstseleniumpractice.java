package class7seleniumsaleem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstseleniumpractice {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	{
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\test1\\drivers123\\chromedriver.exe");
driver=new ChromeDriver(); 

// two whays to open the site in the browser  

driver.get("https://www.google.com ");
driver.findElement(By.xpath("html/body/div/div/form/div/div/div/div/div/input")).sendKeys("iphone");
Thread.sleep(900);
driver.findElement(By.name("btnK")).click();
driver.close();  

	}
}