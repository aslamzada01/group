package HelloWorld;
import java.util.Scanner;

public class program21changallfromsmlltocapitalletter {

	
		public static void main(String[]args) {
			Scanner in = new Scanner(System.in);
			System.out.print("input a string:");
			String line = in.nextLine();
			line= line.toUpperCase();
			System.out.println(line);
	}
}
