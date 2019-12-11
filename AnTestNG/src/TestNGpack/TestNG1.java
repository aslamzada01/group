package TestNGpack;

import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test (priority = 0)
	void openURL(){
		System.out.println("this is URL");
		
	}
	@Test  (priority = 1)
	void Login() {
		System.out.println("this is login");
		
	}
	
	@Test  (priority = 2) 
	void logout() {
		System.out.println("this is logout");
	}

}
