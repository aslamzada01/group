package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public WebDriver driver;
	
	@FindBy(id="email")
	WebElement emailak;
	@FindBy(id="pass")
	WebElement passwordak;
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginak;
	
	
	
	public Home(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void emailak(String email) {
		emailak.sendKeys("khanjan");
	}
	public void passwordak(String pass) {
		passwordak.sendKeys("khangulkhan");
	}
	public void loginak() {
		loginak.click();
	}

		
	}
	
