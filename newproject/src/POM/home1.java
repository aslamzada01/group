package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home1 {
	public WebDriver driver;
	
	@FindBy(id="email")
	WebElement emaillocation;
	
	@FindBy(id="pass")
	WebElement passwordlocation;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbutton;
	
	
	public home1 (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void writeemail(String email) {
		emaillocation.sendKeys(email);
	}
	
	public void writepassword (String pass) {
		passwordlocation.sendKeys(pass);
	}
	
	public void clickloginbutton() {
		loginbutton.click();
	}
 
	}
	


