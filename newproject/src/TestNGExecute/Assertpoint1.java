package TestNGExecute;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class Assertpoint1 {
	public WebDriver driver;
	
  @Test
  public void f() {
	  int a=10;
	  int b=80;
	  int c=a+b;
	  System.out.println(c);
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}

