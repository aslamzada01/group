package classsixthobjectconstructor;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             // this is the formula for accesing from deferent class and method
		B obj= new B();  //this is the formula calass name and new name= new aganin calass name ();
		obj.maclean();  // then have to write the new name . enter then you will see the class or method to acces
		obj.subtract();
		obj.adition(5000, 5000, 555);
		
		modifiers mdf= new modifiers();  // we bring the modifiers class to this class and give them a name mdf
		System.out.println(mdf.rt);   // whe print out the in the name of mdf. then the modifier class appear.
		
		
	}

}
