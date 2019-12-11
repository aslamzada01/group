package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class HardAssert {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  int a=10;
	  int b= 20;
	  int c= a+b;
	  System.out.println(c);
	 
	
  }
  
  
  @Test
  public void q() {
	  int e=40;                      //TestNG, @Test Method will immediately fail after any of the Asserts fails
	  int f=50;
	  int g=e+f;
	  System.out.println(g);
	  Assert.assertEquals(g,900);   //   << i have question here why its still run event here is problem <<<
  }
  
  @Test
  public void r() {
	  int s=10;
	  int w=60;
	  int z=s+w;
	  System.out.println(z);
  }
  
  

 
}
