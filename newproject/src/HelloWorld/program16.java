package HelloWorld;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
public class program16 {
	
	
	public static void main(String args [])
	{
		
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("EST")));
		
		System.out.println("\nNow:" +cdt.format(System.currentTimeMillis()));
	}

}






//// this one show is the current date and time










// simple date farmat like time zome