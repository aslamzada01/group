package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class SoftAssertTestNG {
	public WebDriver driver;
	
	  @Test
	  public void f() {
		  int a=10;
		  int b=80;
		  int c=a+b;
		  System.out.println(c);
		//Assert.assertEquals(c, 90); 
		                                               // this is also like a check point
		                                             // SoftAssert in TestNG helps to collect all the assertions throughout the @Test method. ... 
		                                            //The test execution will continue with the next step after the assert statement.
		         
		 SoftAssert ui = new SoftAssert();           
		                
	       ui.assertEquals(c,900);
		   System.out.println("this is after assertion");   
	      ui.assertAll();
	  }
	  

	  @Test //(dependsOnMethods = "f" )
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

