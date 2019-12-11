package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home2 {
	public  WebDriver driver;
	
	@FindBy(id= "email")
	WebElement inputemail;
	
	@FindBy(id="pass")
	WebElement inputpassword;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement enterloginbutton1;
	
	
	
	public home2 (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	
	public void inputemail(String email) {
		inputemail.sendKeys(email);
	}
	
	public void inputepassword(String pass) {
	inputpassword.sendKeys(pass);
	
}
	public void enterloginbutton() {
		enterloginbutton1.click();
	}
}
