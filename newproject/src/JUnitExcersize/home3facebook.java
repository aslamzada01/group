package JUnitExcersize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home3facebook {
public static WebDriver driver;
	
	@FindBy(id="email")
	WebElement putemail;
	@FindBy (id="pass")
	WebElement putpassword;
	@FindBy(xpath= "//input[@value='Log In']")
	WebElement pushenter;
	
	
     public home3facebook (WebDriver driver) {
    	 this.driver= driver;
    	 PageFactory.initElements(driver, this);
	
		
	}
	
	public void putemail(String email) {
		putemail.sendKeys("khangul@gmail.com");
	}
	
	public void putpassword(String pass) {
		putpassword.sendKeys("khankhan");
	}
	
	public void pushenter() {
		pushenter.click();
	}
	
	
}
