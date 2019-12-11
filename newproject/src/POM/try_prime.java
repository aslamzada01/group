package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class try_prime {

	
		WebDriver driver;

		@FindBy(xpath = "(//*[@type=\"submit\"])[4]")
		WebElement Try;



		public try_prime(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}

		public void amazo() {
		Try.click();
		}
		}


