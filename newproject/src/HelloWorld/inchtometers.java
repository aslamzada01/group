package HelloWorld;
import java.util.Scanner;
public class inchtometers {
	public static void main(String[]args) {
		Scanner input= new Scanner(System.in);
		System.out.print("input a value for inch");
		double inch = input.nextDouble();
		double meters =  inch *0.0254;
		System.out.println(inch+"inch is"+meters+"meters");
	}

}
