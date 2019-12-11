package HelloWorld;
import java.util.Iterator;
import java.util.LinkedList;
public class prg40 {
	public static void main(String[]args) {
		LinkedList<String> l_list = new LinkedList<>();
		l_list.add("hello");
		l_list.add("hi");
		l_list.add("fairfax");
		l_list.add("rahul");
		l_list.add("ali");
		
		Iterator p = l_list.listIterator(1);
		
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		
	}

}
