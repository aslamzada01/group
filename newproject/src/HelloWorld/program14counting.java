package HelloWorld;
import java.util.Scanner;
public class program14counting {


	public static void main(String[]args)
	{
		String test = "Aa Kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		Count(test);
	}
		
	
		public static void Count(String x) {
			
			char[] ch=x.toCharArray();
			int letter = 0;
			int space = 0;
			int num = 0;
			int other = 0; 
			for(int i = 0;i<x.length(); i++) {
				
				if((Character.isLetter(ch[i]))){
					letter ++;
				}
					else if ((Character.isSpaceChar(ch[i]))){
						space ++;
					}
					else if ((Character.isDigit(ch[i]))) {
						num ++;
					}
					else {
						other ++;
						
							
						}
						
			System.out.println("Aa Kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
			System.out.println("letter:"+letter);
			System.out.println("space:"+space);
			System.out.println("number:"+num);
			System.out.println("other:"+other);
			
				}
			}
}


/// here we can find how many letter number space and other on top line