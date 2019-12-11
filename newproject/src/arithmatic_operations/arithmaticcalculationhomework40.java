package arithmatic_operations;

public class arithmaticcalculationhomework40 {
static int khan=500;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=4;
		int c=a+b;
		System.out.println(c);
	
		multiplication();
		devision();
		subtraction();
		System.out.println("this is static global variable "+ khan);

	}

	public static void multiplication() {
		
		int a=5;
		int b=4;
		int c=a*b;
		System.out.println(c);
		System.out.println("this is the global variable multification " + khan);
	}
	
	public static void devision() {
		int a=5;
		int b=4;
		int c=a/b;
		System.out.println(c);
		System.out.println("this is the global variable devision " + khan);
		
	}
	
	public static void subtraction(){
		
		int a=5;
		int b=4;
		int c=a-b;
		System.out.println(c);
		System.out.println("this is the global variable subtraction " + khan);
	}
	
	
}
