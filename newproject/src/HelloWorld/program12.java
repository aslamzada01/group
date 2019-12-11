package HelloWorld;
import java.util.Scanner;
public class program12 {
	public static void main(String[]args) 
	{
		Scanner input = new Scanner (System.in);
		int number1;
		int number2;
		System.out.print("Input frist integer:");
		number1 = input.nextInt();
		System.out.print("Input second integer:");
		number2 = input.nextInt();
		
		if (number1 == number2)
		System.out.printf("%d == %d\n",number1, number2);
		
		if (number1 != number2)
		System.out.printf("%d != %d\n", number1, number2);
		
		if (number1 < number2)
		System.out.printf("%d < %d\n",number1,number2);
		
		if (number1 > number2)
		System.out.printf("%d > %d\n",number1,number2);
		
		if (number1 <= number2)
		System.out.printf("%d <= %d\n",number1,number2);
		
		if (number1 >= number2)
		System.out.printf("%d => %d\n",number1,number2);
		
	}

}




/////   camparing the numbers in  deferent formate
////  equal to not equal to
// grater than not grater than