package class7seleniumsaleem;



	import org.openqa.selenium.By;

	  
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class getcurrenURL {
	public static WebDriver driver; 

		public static void main(String[] args) throws InterruptedException
		{
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\Automation\\Automation\\chromedriver.exe");
	driver=new ChromeDriver(); 
	
	//driver.navigate().to("https://www.facebook.com");
	//String url= driver.getCurrentUrl();            // this is getting current URL
	//System.out.println(url);
	
	  // this is getting current id session
	// whenever you go to open a new prowser it give each time new id for that page. every computer open a page it give new id
	//String windows= driver.getWindowHandle();
	//System.out.println(windows);
	
	
	
	
	driver.get("https://www.ariatickets.com");
	String url= driver.getCurrentUrl();
	System.out.println(url);
	
	String window= driver.getWindowHandle();
	System.out.println(window);

	}

}
