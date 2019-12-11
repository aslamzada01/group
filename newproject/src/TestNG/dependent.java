package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class dependent {
	public WebDriver driver;
	
  @Test
  public void f() {
	  int a=10;
	  int b=80;
	  int c=a+b;
	  System.out.println(c);                           // this mean one method depend on each other
	 // Assert.assertEquals(c, 9000);              //if the parents fail the child will be fail dependent fail the other 
	 SoftAssert ui = new SoftAssert();           
	                
       ui.assertEquals(c,9000);
	   System.out.println("this is after assertion");   
      ui.assertAll();
  }
  

  @Test (dependsOnMethods = "f" )
  public void ui() {
	  System.out.println("this is third method");
	   
  }
  @Test 
  public void upd() {
	  System.out.println("this is sd method");
	  
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
