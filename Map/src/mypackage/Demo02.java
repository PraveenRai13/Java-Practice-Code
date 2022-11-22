package mypackage;

import java.util.TreeMap;

public class Demo02 {

	public static void main(String[] args) {
		TreeMap<Integer, String> m = new TreeMap<>();
		m.put(100, "AAA");
		m.put(103, "BBB");
		m.put(101, "XXX");
		m.put(104, "106");
		System.out.println(m);
	}

}
