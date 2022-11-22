package mypackage;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortDemo1 {

	public static void main(String[] args) {
		int[] a = {10,5,20,11,6};
		System.out.println("Primitive Array before sorting");
		for(int a1:a) {
			System.out.println(a1);
		}
		Arrays.sort(a);
		System.out.println("Primitive Array after sorting");
		for(int a1:a) {
			System.out.println(a1);
		}
		String[] s = {"A","Z","B"};
		System.out.println("Object Array before sorting");
		for(String s1:s) {
			System.out.println(s1);
		}
		Arrays.sort(s);
		System.out.println("Object Array after sorting");
		for(String s1:s) {
			System.out.println(s1);
		}
		Arrays.sort(s,new MyComparator());
		System.out.println("Object Array after sorting by Comparator");
		for(String a1:s) {
			System.out.println(a1);
		}
		
	}

}
class MyComparator implements Comparator<Object>{
	public int compare(Object obj1, Object obj2) {
	String s1 = (String)obj1;
	String s2 = (String)obj2;
	return s2.compareTo(s1);
	}			
}
