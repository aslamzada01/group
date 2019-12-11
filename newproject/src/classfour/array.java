package classfour;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]students;
		students=new int[60];  // the length of our array is 60 and the and the value of student 0 is 600
		students[0]=600;
		students[1]=700;
		students[2]=800;
		//System.out.println(students[0]);  //the value of student 0 is 600
        //System.out.println(students.length);  //the length of our array is 60 and the and
		khan();
		jan();
		kaka();
	}   
	
public static void khan() {
	int []teachers;
	teachers = new int[50];
	teachers[0]=500;
	teachers[1]=600;
	teachers[2]=700;
	
	 System.out.println(teachers[0]);
	//System.out.println(teachers.length);
	
}
public static  void jan() {
	int[]managers;
	managers=new int[40];
	managers[0]=200;
	managers[1]=300;
	managers[3]=400;
	//System.out.println(managers[0]);
	//System.out.println(managers.length);
	
	
}
public static void kaka() {
	String[]papa;
	papa=new String[20];
	papa[0]=("ahmad");
	papa[1]=("jamal");
	papa[2]=("kamal");
	System.out.println(papa[0]);
	System.out.println(papa.length);
	
	
	
	
}


}
