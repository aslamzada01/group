package class7seleniumsaleem;



	  
		import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;

		public class iframesselenium {
		public static WebDriver driver; 

			public static void main(String[] args) throws InterruptedException
			{
				//// iframe mean a webpage inside another webpage it mean there is two html open and close
				// in logek first we have to inspect the frame next we have to send an value on it.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\Automation\\Automation\\chromedriver.exe");
		driver=new ChromeDriver(); 
		
		driver.navigate().to("http://demo.automationtesting.in/Frames.html"); /// Iframe it mean a webpage inside another webpage
		driver.switchTo().frame(driver.findElement(By.name("SingleFrame")));    // we use from parants and child method relative xpath 
		
		driver.findElement(By.xpath("//*[@class='col-xs-6 col-xs-offset-5']/input")).sendKeys("bashir");
	}

}
