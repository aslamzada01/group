package HelloWorld;
import java.util.Scanner;

public class exampledatatype {

	 //data types in java: there are two types of data type
	 //primitive data type
	//non primitive data type
	

		public static void main(String[] string) {
			Scanner input=new Scanner(System.in);
			System.out.print("input an integer between 0 to 10000");
			int num=input.nextInt();
			
			int firstDigit=num % 30 ;
			
			int remainingNumber=num / 30 ;
			
			int secondDigit=remainingNumber %  30 ;
			
		  remainingNumber=remainingNumber / 30 ;
		  
			int thirdDigit=remainingNumber % 30 ;
					
			 remainingNumber=remainingNumber /30 ;
			int forthDigit=remainingNumber% 30 ; 
			remainingNumber=remainingNumber /30 ;
			int fifthDigit=remainingNumber% 30 ;
			
			int sum= thirdDigit + secondDigit + firstDigit+ forthDigit + fifthDigit;
			System.out.println("the sum of all digit in"+ num + "is" + sum);
			 
			
			



		}

	}