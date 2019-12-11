package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	

	public WebDriver driver;
	
	@FindBy(linkText="create an account")
	WebElement Signin;
	
	public Signin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
		public Signin() {
			Signin.click();
			
		}
	}
	


