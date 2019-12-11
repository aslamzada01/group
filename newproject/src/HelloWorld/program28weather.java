package HelloWorld;
//fahrenheit to celsius degree
import java.util.Scanner;
public class program28weather {

	public static void main(String[]args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print(" input a degree in fahrenheit: ");
		
		double fahrenheit= input.nextDouble();
		
		double celsius =((5*(fahrenheit-32))/9.0);
		 
		System.out.println(fahrenheit+" degree fahrenheit is equal to "+celsius+" in celsius ");
		
		

	}

}
