package seleniumexcersize;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumCapitalone {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	{
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\Automation\\Automation\\chromedriver.exe ");
	driver= new ChromeDriver();
	
	driver.get("https://capitalonebank.com");
	driver.findElement(By.xpath("//a[@id='unav-l1-signin']//span")).click();// i used the parent anc child xpath method
	driver.findElement(By.id("ods-input-0")).sendKeys("bashiraslamzada"); ////*[@id=\"ods-input-0\"]
	driver.findElement(By.id("ods-input-1")).sendKeys("THEbestoneyyyyyyyyyy");
	//driver.findElement(By.xpath("//button[@class='sign-in-button ods-button ods-button--action']")).click();
	//driver.findElement(By.xpath("//img[@class='ci-header--logo']")).click();
	driver.findElement(By.xpath("//a[@class='sign-in-supporting-links']")).click();
	}

}
