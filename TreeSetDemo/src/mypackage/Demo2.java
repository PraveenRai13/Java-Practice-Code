package mypackage;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>(new NComparator());
		t.add(10);
		t.add(0);
		t.add(5);
		t.add(15);
		t.add(20);
		t.add(20);
		System.out.println(t);

	}
	

}
class NComparator implements Comparator<Object>{
public int compare(Object obj1 , Object obj2) {
	Integer I1 = (Integer)obj1;
	Integer I2 = (Integer)obj2;
	return -I1.compareTo(I2);
	//return +1;
}
}
