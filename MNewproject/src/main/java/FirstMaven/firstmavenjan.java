package FirstMaven;



	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class firstmavenjan {
		
		public  WebDriver drivere;

		@FindBy(id="email")
		WebElement Singin;
		
		
		@FindBy(id="pass")
		WebElement password;
		
		@FindBy(id="loginbutton")
		WebElement Login1;

		private WebDriver driver;


	public firstmavenjan(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public void emillocation1(String email) {
		Singin.sendKeys("ahmakkhan@gmail.com");
	}
	public void passwordlocation1(String pass) {
		password.sendKeys("oewiuroweiur");
	}
	public void loginbutton() {
		Login1.click();
		
	}

	}

