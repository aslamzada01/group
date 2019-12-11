 package AnJUnit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnjUnit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this is befor class method");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is after class method");
	}

	@Test
	public void test() {
		
	System.out.println("this is my test mehtod");
	}

}
