package seleniumcgroupexcirsize;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
	
	public class classexcersize2ifram {
	public static WebDriver driver; 

		public static void main(String[] args) throws InterruptedException
		{
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver(); // we can use chrome driver too instead of FirefoxDriver to ChromeDriver and chnge the path of the driver
	
	driver.navigate().to("http://demo.automationtesting.in/Frames.html"); /// Iframe it mean a webpage inside another webpage
	driver.switchTo().frame(driver.findElement(By.name("SingleFrame")));    // we use from parants and child method relative xpath 
	
	driver.findElement(By.xpath("//*[@class='col-xs-6 col-xs-offset-5']/input")).sendKeys("bashir");
	driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("jamal");
}
}