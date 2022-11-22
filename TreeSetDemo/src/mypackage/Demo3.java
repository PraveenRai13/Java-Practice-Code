package mypackage;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo3 {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>(new OComparator());
		t.add("Praveen");
		t.add("Pranav");
		t.add("Adarsh");
		t.add("Harsh");
		t.add("Pratik");
		System.out.println(t);

	}

}

class OComparator implements Comparator<Object> {
	public int compare(Object obj1, Object obj2) {
		String s1 = (String) obj1;
		String s2 = (String) obj2;
		return -s1.compareTo(s2);
	}
}
