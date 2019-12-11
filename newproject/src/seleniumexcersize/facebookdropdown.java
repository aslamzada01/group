package seleniumexcersize;		


	import org.openqa.selenium.By;


	  
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;



	public class facebookdropdown {
	public static WebDriver driver; 

		public static void main(String[] args) throws InterruptedException
		{
			
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver(); 
	// two whays to open the site in the browser

	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("jamal khan");
	
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("jankhan");
	
	driver.findElement(By.xpath("//input[@id='u_0_k']")).sendKeys("767656543");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("asdfghjkl");
	
	Select  month = new Select(driver.findElement(By.id("month")));
	month.selectByVisibleText("May");
	
	Select day =  new Select(driver.findElement(By.id("day")));
	day.selectByVisibleText("24");
	Select year = new Select(driver.findElement(By.id("year")));
	year.selectByVisibleText("2000");
	driver.findElement(By.name("sex")).click();
	driver.findElement(By.name("websubmit")).click();
	

	}

}
