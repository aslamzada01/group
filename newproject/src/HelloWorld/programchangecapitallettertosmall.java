package HelloWorld;
import java.util.*;
public class programchangecapitallettertosmall {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("input a string:");
		String line = in.nextLine();
		line= line.toLowerCase();
		System.out.println(line);
	}

}
