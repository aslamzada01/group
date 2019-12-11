package class7seleniumsaleem;

import org.openqa.selenium.By;
  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class firstselenium {
public static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException
	{
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Desktop\\selenium IDE\\all selenium export file\\Automation\\Automation\\chromedriver.exe");
driver=new ChromeDriver(); 
// two whays to open the site in the browser

driver.get("https://www.facebook.com   ");//by this command you can open other
                                         // websites, we can enter any webstes over here
//driver. navigate().to("\"https://www.facebook.com"); // thisis another way to open a webpage
//driver.navigate().refresh();  //  this way we can refresh the page the opened page liek facebook
// thread.sleep(600);  if we use this it waill delay to open whatever time we get
//Thread.sleep(6000);
//driver.navigate().back(); //it will take back the page
//Thread.sleep(6000);

//driver.navigate().forward(); // bring back
//Thread.sleep(600);
//driver.manage().window().maximize(); // by this commend we can maxemix the browser
//Thread.sleep(6000);

//driver.close();   // this option it will close our program

//driver.findElement(By.id("email")).sendKeys("salim");   // by heloping of driver findElement we can put the elent of any website
//driver.findElement(By.id("pass")).sendKeys("sjaf;lsjdfl;"); // here we can put our element id in password section
//driver.findElement(By.id("loginbutton")).click();   // here we click the loginbutton on log in page
//driver.findElement(By.linkText("Data Policy")).click();
//driver.findElement(By.linkText("Cookies Policy")).click();
 //driver.findElement(By.linkText("Apply now")).click();
 
//driver.findElement(By.partialLinkText("Deals")).click(); // if the link is too long we can use from partial link
//driver.findElement(By.name("firstname")).sendKeys("khan"); // by this command we can go and use the long in a new account
//driver.findElement(By.name("firstname")).sendKeys("khan");
//driver.findElement(By.name("lastname")).sendKeys("jan");

// write script which enters value for id and password fields and click login button for facebook page
//use xpath locator ot locate each element?
//driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input")).sendKeys("jkadfskjladfskjl;");
//Thread.sleep(600);
//driver.findElement(By.id("pass")).sendKeys("kamalkhan");
//Thread.sleep(700);

//driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/label/input")).click();
 //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jamalkhan");  // <<<<<relative xpath
//Thread.sleep(2000);

//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("jamalkhan");  this is relative xpath
//Thread.sleep(1000);
//driver.findElement(By.xpath("//input[@value='Log In']")).click();

// (//input[contains(@aria-label,'Mobile')])[1]  /// to make unige our contain xpath 
//input[contains(@aria-label,'Mobile')]          // contain xpath is that to take parcail of the value of element
//driver.findElement(By.xpath((//input[contains(@class,'input')])[1]
//driver.findElement(By.xpath(("//input[contains(@class,'input'")])[1]
	//)(//input[contains(@class,'input')])[1])) //  grouping mean it make uniqe we chose any  number [ 0 to 100]

   //  //*starts-with(@aria-label,N
		//>>>>>>>>>>   //*[@class='mbm_br-_a4')[     parnts and child xpath
		////*[text()='Sign In']  /// relativ text xpath its used when we have only log in nothing else
	//river.findElement(By.xpath()
	//elect dropdo=new Select(driver.findElement(By.id("month")));//this will work for the dropdown method

  //    Select lect(driver.findElement(By.id("day")));
      //  Select day = new Select (driver.findElement(By.id("day"))); // this is how you drop down the day 
       // day.selectByVisibleText("2");
        
      //  Select month = new Select (driver.findElement(By.id("month"))); // this is how you drop down the day 
      //  month.selectByVisibleText("3");
        
      // Select year = new Select (driver.findElement(By.id("year"))); // this is how you drop down the day 
       // year.selectByVisibleText("2018");
		
        
     //  Select sex = new Select(driver.findElement(By.name("sex");
        
       // driver.findElement(By.xpath("//*[input[@type='text']")).sendKeys("7000659991");
        
       // List<WebElement> links=driver.findElement(By.tagName("a"));  ?
        
	}                                    

}
