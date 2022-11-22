package mypackage;

import java.util.Arrays;

public class ArraySearch {

	public static void main(String[] args) {
		int[] a = {10,5,20,11,6};
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 6));
		System.out.println(Arrays.binarySearch(a, 17));
		
		String[] s = {"A","Z","B"};
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s, "Z"));
		System.out.println(Arrays.binarySearch(s, "C"));
	}

}

