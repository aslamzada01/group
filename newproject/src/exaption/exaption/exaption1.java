package exaption.exaption;

public class exaption1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		
		int a= 60;
		int d = 0;
		int r = a/d;
		System.out.println(r);
		
		} catch (ArithmeticException e) {
			System.out.println("please it have change from zero to some other number");
		}

	}

}
