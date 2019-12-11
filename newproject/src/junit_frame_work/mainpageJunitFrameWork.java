 package junit_frame_work;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class mainpageJunitFrameWork {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {  // this is run at the beginig of the class method
		System.out.println("this is befor class method");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {   /// this will run one time at the end of class
		System.out.println(" this is after class method");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println(" this is befor method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println(" this is after mehtod");
	}

	@Test
	public void test() {
		System.out.println(" this is test method");
	
	}
	
	@Test
	public void test2() {
		System.out.println(" this is test method");
	
	}

}
