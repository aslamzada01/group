package AnkurSelenium;


	 import org.openqa.selenium.WebDriver;

	 import org.openqa.selenium.chrome.ChromeDriver;
	 
	 public class windows1 {    //// it will help us to andle the muse and keybord( out keybord and mouse work by helpig of action)
	static WebDriver driver;
		public static void main(String[] args) {
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\test\\src\\thedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.navigate().to("https://www.facebook.com");
			Actions point = new Actions(driver);
			
			WebElement forgot = driver.findElement(by.linkText("forgot account?"));
			// forgot.click();
			
			point.keyDown(keys.SHIFT).click(forgot).buld().perform();
			
			