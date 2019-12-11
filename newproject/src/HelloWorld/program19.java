package HelloWorld;
// print numbers between 1 to 100 which are divisible by 3, 5& both
public class program19 {
	public static void main(String[]args)
	{
		System.out.println("n\nDivided by 3:");
		
		for (int i=1; i<100; i++) {
			if (i%3==0)
				System.out.print(i +",");
		}
		
		System.out.println("\n");
		
		
		
		System.out.println("\nDivided by 5:");
		
		for (int x=1; x<100;x++) {
			if (x%5==0) {
				System.out.print(x+",");
		}
		} 
			System.out.println("\nDivided by 3&5:");
			for (int a=1; a<=100; a++) {
			if (a%3==0&&a%5==0) {
				System.out.print(a+",");
			}
	
	}
	}
}















/// devide in deferent kind of format