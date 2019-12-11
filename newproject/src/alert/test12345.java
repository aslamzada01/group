 package alert;


	import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class test12345 {
	public static WebDriver driver; 

		public static void main(String[] args) throws InterruptedException
		{
			
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver(); 
	
	driver.navigate().to("http://www.expedia.com/");
	//driver.manage().window().maximize();
	
	//driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS); //emplicit wait this is like thread.sleep option(its just says wait)))
	
	 WebDriverWait ui = new WebDriverWait(driver,10);
	 //this is explicit wiat
	 //ui.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@data-day='10'])[1]")));
	                                                                // wait until spacific time according the {condation}
	//calendar pup up
	driver.findElement(By.xpath("//input[@id='package-departing-hp-package']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@data-day='10'])[1]")).click();
	}

}
