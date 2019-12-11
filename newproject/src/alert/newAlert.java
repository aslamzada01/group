package alert;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.chrome.ChromeDriver;
			import org.openqa.selenium.support.ui.Select;

			public class newAlert {
			public static WebDriver driver;

				public static void main(String[] args) throws InterruptedException
				{
					
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver(); 
			
			//driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
			//driver.manage().window().maximize();
			
			//driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		 	//driver.findElement(By.linkText("Alert with OK & Cancel")).click();
			
			
			//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			//Thread.sleep(2000);
			//driver.switchTo().alert().dismiss();
			
			
			//*driver.findElement(By.linkText("Alert with textbox")).click();
			//Thread.sleep(2000);
			
			//*driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			//Thread.sleep(2000);
			
			//driver.switchTo().alert().sendKeys("Hello Ahmad");
			//Thread.sleep(2000);
			 //driver.switchTo().alert().accept();/*
			
			// driver.get("https://www.bestbuy.com");
			 //driver.manage().window().maximize();
			 //driver.findElement(By.xpath("//button[@class='close']")).click();
			 //driver.findElement(By.id("gh-search-input")).sendKeys("iphone xr");
			 //driver.findElement(By.xpath("//button[@class='header-search-button']")).click();
			
			driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
			driver.manage().window().maximize();
			 
			driver.findElement(By.className("btn-danger")).click();
			driver.switchTo().alert().dismiss();
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Alert with OK & Cancel")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(1000);
			driver.switchTo().alert().dismiss();
			driver.findElement(By.linkText("Alert with Textbox")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			Thread.sleep(1000);
			driver.switchTo().alert().sendKeys("Ahmadkhan");
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			driver.close();
				}
			}
			