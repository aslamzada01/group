package HelloWorld;


// minutes to hours
//
import java.util.Scanner;

public class datatypeminutetohour {

	public static void main(String[]args){

long minutes;
Scanner in = new Scanner(System.in);
System.out.print("Enter the  minutes:");

minutes = in.nextLong();
long hours = minutes/60;
System.out.println(hours+"hours");

}

}
