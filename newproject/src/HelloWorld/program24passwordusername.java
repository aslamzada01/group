package HelloWorld;
 
import java.util.Scanner;

public class program24passwordusername {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		String user, pass;
		
		System.out.print("enter your username");
		user=input.nextLine();
		
		System.out.print("enter your password");
		pass =input.nextLine();
		
		
		if(user.equals("ahmad") && (pass.equals("bashir"))) {
			System.out.println("welcome to facebook");
		}else {
			System.out.println("Incorrect login");
			
		}
		
		
	}

}
