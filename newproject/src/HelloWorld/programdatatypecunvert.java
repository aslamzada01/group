package HelloWorld;
import java.util.Scanner;
public class programdatatypecunvert {

	public static void main(String[] Strings) {
		
		double minuteInyear = 60 * 24 *365;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("input the  number of minutes");
		
		double min = input.nextDouble();
		
		long years = (long)(min/minuteInyear);
		
		int days = (int)(min/60/24 ) % 365;
		
		System.out.println((int)min + " minutes is approximately " +year+ " Year and " + days + " days ");
		

	}

}
