package AnkurWebDriverClasses;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
public class Druganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		//driver.manage().window().maximize();
		//Thread.sleep(3000);
		
		WebElement source_element=driver.findElement(By.id("box6"));
		WebElement target_element= driver.findElement(By.id("box106"));
		 Actions act = new Actions(driver);
		 act.dragAndDrop(source_element, target_element).build().perform();
		 /////////////////////////////////////////////////////////////////
		 WebElement source_element1=driver.findElement(By.id("box1"));
		 WebElement target_element1=driver.findElement(By.id("box101"));
		 Actions act1=new Actions(driver);
		 act1.dragAndDrop(source_element1, target_element1).build().perform();
		 /////////////////////////////////////////////////////////////////
		 WebElement source_element2=driver.findElement(By.id("box3"));
		 WebElement target_element2=driver.findElement(By.id("box103"));
		 Actions act2=new Actions(driver);
		 act1.dragAndDrop(source_element2, target_element2).build().perform();
		//////////////////////////////////////////////////////////////////////
		 WebElement source_element3=driver.findElement(By.id("box5"));
		 WebElement target_element3=driver.findElement(By.id("box105"));
		 Actions act3=new Actions(driver);
		 act1.dragAndDrop(source_element3, target_element3).build().perform();
		 

	}

}
