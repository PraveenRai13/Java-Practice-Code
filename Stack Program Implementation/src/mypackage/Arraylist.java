package mypackage;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		//add operation
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		// get operation
		int element = list.get(1);
		System.out.println(element);
		
		// add in between 
		list.add(0, 0);
		System.out.println(list);
		
		// Delete 
		list.remove(0);
		System.out.println(list);
		
		// size
		int size =list.size();
		System.out.println(size);
		//loops
		for (int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		//sorting
		Collections.sort(list);
		System.out.println(list);
	}

}
