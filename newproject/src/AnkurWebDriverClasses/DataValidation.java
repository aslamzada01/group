package AnkurWebDriverClasses;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class DataValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("http://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		// login 
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Admin ---> usermanagement --> users
		
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click(); 
		 driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();
		 driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();
		 
		 int rows =driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
		 System.out.println(rows);
		// driver.close();
		 
		 // it will show the status of the employees how many employees are enable
		 int count =0;
		 for (int r=1; r<=rows;r++)
		 {
			 String status= driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+r+"]/td[5]")).getText();
			 if(status.equals("Enabled"))
			 {
				 count++;
		 }
		
	}
		 System.out.println("Number of enable employees:"+ count);
		 System.out.println("Number of disabled employees:"+(rows-count));
	}
}
