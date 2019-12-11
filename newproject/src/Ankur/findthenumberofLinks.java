package Ankur;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class findthenumberofLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		
		driver.get("http://www.newtours.demoaut.com/");
	
		
		List <WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
				
		for (WebElement e:links)
		{
			System.out.println(e.getText());
		}

	}

	
}
