package AnkurWebDriverClasses;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		// Log in
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		                  
		                  // 
		
		WebElement admin=driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));
		
		Thread.sleep(5000);
		WebElement usermgt=driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		Thread.sleep(5000);
		WebElement users=driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		Thread.sleep(5000);
		 
		 Actions act = new Actions(driver);
		 act.moveToElement(admin).moveToElement(usermgt).moveToElement(users).click().build().perform();
		 
		 Thread.sleep(3000);

	}

}
