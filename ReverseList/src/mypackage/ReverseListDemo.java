package mypackage;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		l.add(5);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
	}

}
