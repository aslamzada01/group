package TestNGpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG3 {

	@BeforeClass
	void login() {
		System.out.println("this is login");

	}

	@AfterClass
	void logout() {
		System.out.println("this is logout");

	}

	@Test
	void search() {
		System.out.println("this is search");
	}

	@Test
	void advsearch() {
		System.out.println("this is advsearch");
	}

	@Test
	void recharge() {
		System.out.println("this is recharge");
	}

}
