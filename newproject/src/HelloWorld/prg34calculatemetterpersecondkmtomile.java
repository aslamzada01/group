package HelloWorld;
import java.util.Scanner;
public class prg34calculatemetterpersecondkmtomile {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner (System.in);
		
		float timeSeconds;
		float mps,kph,mph;
		
		System.out.print("enter distance in meters");
		float distance = Scanner.nextFloat();
		
		System.out.print("enter hour");
		
		float hr =  Scanner.nextFloat();
		
		System.out.print("enter minutes");
		float min =  Scanner.nextFloat();
		
		System.out.print("enter seconds");
		float Sec =  Scanner.nextFloat();
		
		
		timeSeconds = (hr*3600) + (min*60) +Sec;
		mps = hr/timeSeconds;
		kph = (hr/1000.0f) / (timeSeconds/3600.0f);
		mph = kph/1.609f;
		
		System.out.println("your speed in meter/second is " +mps);
		System.out.println("yuour speed in km/h is" +kph);
		System.out.println("your speed in miles/h is " +mph);
		
		Scanner.close();
		

	}

}
