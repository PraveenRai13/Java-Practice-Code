package mypackage;

import java.util.TreeSet;

public class Demo4 {

	public static void main(String[] args) {
		TreeSet<Object> t = new TreeSet<>();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("X"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("M"));
		System.out.println(t);
	}

}
