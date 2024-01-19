import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.List;


public class ListIteratorDemo {


public static void main(String[] args) {
	// TODO Auto-generated method stub
	LinkedList<String> l = new LinkedList<String>();
	
	l.add("piya");
	l.add("prashasti");
	l.add("Ketan");
	l.add("anushka");
	System.out.println(l);

	ListIterator<String> i = l.listIterator();
	while(i.hasNext()) {
		String str = i.next();
		if(str.equals("piya")) {
			i.set("diya");
		}
		if(str.equals("prashasti")) {
			i.set("ankit");
		}
		if(str.equals("anushka")) {
			i.set("ketan");
		}
		
	
		
	}
	System.out.println(l);

}

}