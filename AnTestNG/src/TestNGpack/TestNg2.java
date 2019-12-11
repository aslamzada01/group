package TestNGpack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg2 {

	@BeforeMethod
	void login() {

		System.out.println("this is login");
	}

	@AfterMethod
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
