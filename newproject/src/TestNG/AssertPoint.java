package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class AssertPoint {
	                                                 // this is a kind of check point for your test to fail or pass
	                                                 //Assert to verify something
	public WebDriver driver;
  @Test(priority =1)
  public void f() {
	  
	  int a=10;
	  int b=80;
	  int c=a+b;
	  System.out.println(c);
	 // Assert.assertEquals(c,9000);                  //this will be pass becoust it true if we put rong value it will be faild
	 SoftAssert ui = new SoftAssert();                 // in order to use softassert we must to creat object first like ui name
	                                                   //assert.assertequals 9000 like deferent value 900000
      ui.assertEquals(c, 0);                           // there is two kind of assert regular and soft assert with regular if ther is a problem 
	   System.out.println("this is after assertion");   // test stop excution but if we use soft assert it will pass but it will show the error
      ui.assertAll();                                     //>>>>>>> Assertall it will show wich text case was fail excatly
  }
  
  @Test(priority = 2)
  public void uw() {
	  System.out.println("this is second method");
  }
  @Test (priority = 0)
  public void update() {
  System.out.println("this is third method");
  }
  @BeforeClass
  public void beforeClass() {                              //by option of priority we can chose which test case run first
  }

  @AfterClass
  public void afterClass() {
  }

}

