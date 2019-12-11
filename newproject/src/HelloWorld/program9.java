package HelloWorld;
import java.util.Scanner;
public class program9 {
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("input your first name");
		String fname = input.next();
		
		System.out.println("input your last name");
		String lname = input.next();
		
		System.out.println("hello\n"+fname+" "+lname);
		
		
	}

}


//    input like hello then they will ask your name and last name