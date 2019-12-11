package arrays;

public class globalvariable {
	static int t=20;    // <global varible almwys should use with static
	static int b=30;    // <global variable always should use with static

	public static void main(String[] args) {
		int c=10;  // any variable inside the main method is local variable
		int k=60;
		int q=15;
		
		method1();     // here i add the name of other method on our main method if we share the global variable with
	
		
	}
		public static void method1() {
			int h=25;
			int y=5;
			int sum= t+b+h;     // here we add global variable   (t,b) with other method
			System.out.println(sum);
		
		

	}

}
