package mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortingDemo {

	public static void main(String[] args) {
		ArrayList<String> l	= new ArrayList<>();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		System.out.println("Before sorting:" +l);
		Collections.sort(l, new MyComparator());
		System.out.println("After sorting:" +l);
	}

}
class MyComparator implements Comparator<Object>{
	public int compare(Object obj1, Object obj2) {
		String s1 = (String)obj1;
		String s2 = (String)obj2;
		return s2.compareTo(s1);
		
	}
}
