package mypackage;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchDemo01 {

	public static void main(String[] args) {
		ArrayList<String> t	= new ArrayList<>();
		t.add("Z");
		t.add("A");
		t.add("M");
		t.add("K");
		t.add("a");
		System.out.println(t);
		Collections.sort(t);
		System.out.println(t); 
		System.out.println(Collections.binarySearch(t, "Z"));
		System.out.println(Collections.binarySearch(t, "J"));
	}

}
