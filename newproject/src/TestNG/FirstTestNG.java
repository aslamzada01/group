package TestNG;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class FirstTestNG {
	
  @Test(priority =1) // the priority option it will help us to to execute which test case you like to run first
  public void f() {
	  
	 System.out.println("Hello");
  }
  
  @Test
  public void secondtestcase() {
	  System.out.println("googbye"); // since this test is 0 then this is this is going to run first
  }
  @BeforeClass
  public void beforeClass() {
	  
	 
  }

  @AfterClass
  public void afterClass() {
  }

}


