package datadraven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datadrivertest {

	public static void main(String[] args) {
		
		 Xls_Reader1 reader=new  Xls_Reader1("C:\\Users\\ahmad\\eclipse-workspace\\GroupExcersise\\src\\com\\testdata\\HalfEbayTestData.xlsx");
		 
		  
		 String firstname = reader.getCellData("Sheet1", "firstname", 2);
		  System.out.println(firstname);
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace\\newproject\\Drivers\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru="); // enter url

		  
		 
	}

}
