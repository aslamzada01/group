package AnJUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnJUnit2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this is after class method");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		System.out.println("this is after class method");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is befor methods");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is after method ");
	}

	@Test
	public void test() {
		System.out.println("this is test method");
	}

}
