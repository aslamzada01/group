package HelloWorld;
import java.io.Console;
public class program15 {
	public static void main(String[]args)
	{
		Console cons;
		if((cons = System.console()) !=null)
		{
			
			char[]pass_ward = null;
			try
			{
				pass_ward = cons.readPassword("Input your password:");
				System.out.println("your password was:" +new String(pass_ward));
			}
			finally
			{
				if (pass_ward != null)
				{
					java.util.Arrays.fill(pass_ward, ' ');
				}
			}
			
			}
				else
				{
					throw new RuntimeException("Cant get password ... No conlsole");
				}
		} 

}