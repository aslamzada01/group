package HelloWorld;
import java.util.Scanner;
public class minutetohour {

	public static void main(String[] args) {
		  
		long minutes;
		Scanner in = new Scanner(System.in);
		System.out.print("enter the minutes");
		 minutes = in.nextLong();
		 long hour = minutes/60;
		 System.out.println(hour + "  hour");

	}

}
