package trueorfalseandifels;

import classsixthobjectconstructor.modifiers;

public class whiledoloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// the only deferent betwwn while loop and do loop 
		// in while loop we can put the system.out.print line at 
		// the end of condation, but in do whileloop we put
		// the condation at the end example
		// big deferent between them is the exsecution
		// while loop exsecute the condation first and then the code
		// but the do whil loop first the cod then to condation
		
		
		int d=0;
		do {

			System.out.println("this is the mumber d "+d);
			d++;
			
		}while(d<=10);
		
		modifiers tt= new modifiers();  // this is acces modifiers from class of modifier then we give them a name of tt
		System.out.println(tt.rt); // here we print the new jublect name. our modifiers object name. now we can see
		                              // the value of our modifiers is shown on consol.
	}

}
