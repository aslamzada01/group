package HelloWorld;

// hour to minutes

import java.util.Scanner;
public class cunvertfromhourtominuts {

	public static void main(String[] args) {
		long hours;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the  hours:");
		
		hours = in.nextLong();
		long minutes = hours*60;
		System.out.println(minutes+"minutes");

	}

}
