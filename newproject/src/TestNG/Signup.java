package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {

	public WebDriver driver;
	@FindBy(id="firstname")
	WebElement Firstnameopt;
	@FindBy(id="lastname")
	WebElement lastname;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="PASSWORD")
	WebElement psswd;
	@FindBy(id="ppaFormsbtBtn")
	WebElement Signup;
	
	public Signup(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	public Signup() {
	
}
}
