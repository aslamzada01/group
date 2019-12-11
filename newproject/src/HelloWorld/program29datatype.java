package HelloWorld;
 //data types in java: there are two types of data type
 //primitive data type
//non primitive data type
import java.util.Scanner;
public class program29datatype {

	public static void main(String[] string) {
		Scanner input=new Scanner(System.in);
		System.out.print("input an integer between 000 to 1000");
		int num=input.nextInt();		
		int firstDigit=num % 10;
		int remainingNumber=num / 10;
		
		int secondDigit=remainingNumber %  10;
		
	  remainingNumber=remainingNumber / 10;
	  
		int thirdDigit=remainingNumber % 10;
				
		 remainingNumber=remainingNumber /10;
		int forthDigit=remainingNumber% 10;
		
		int sum= thirdDigit+secondDigit+firstDigit+forthDigit;
		System.out.println(" the sum of all digit in "+num+" is "+sum);
		 
		
		



	}

}