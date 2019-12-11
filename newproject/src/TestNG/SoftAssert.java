package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class SoftAssert {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  int a=10;
	  int b=20;
	  int c=a+b;
	  System.out.println(c);
	  
	  Assert.assertEquals(c, 30);
	    
  } 
  
  
	  @Test
	  public void r () {
		  int e=5;
		  int p=30;
		  int s=e+p;
		  System.out.println(s);
	  
  }
	  
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
