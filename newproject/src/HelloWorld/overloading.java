package HelloWorld;

public class overloading {

		   public static void main(String args[]) {
		      overloading tester = new overloading();
		      System.out.println(tester.add(1, 2));
		      System.out.println(tester.add(1, 2,3));
		   }
		   public int add(int a, int b) {
		      return a + b;
		   }
		   public int add(int a, int b, int c) {
		      return a + b + c;
		   }
		}