package mypackage;

import java.util.LinkedList;

public class LL {

	public static void main(String[] args) {
		/*LinkedList<String> list = new LinkedList<String>();
		list.addFirst("a");
		list.addFirst("is");
		System.out.println(list);
		list.addFirst("this");
		list.addLast("LinkedList");
		System.out.println(list);
		System.out.println(list.size());
		for (int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" -> ");
		}
		System.out.println("null");
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);*/
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(8);
		list.add(2);
		list.add(3);
		
		
		int element = 5;
		int ans = -1;
		for (int i = 0; i < list.size(); i++) {
			int listElement = list.get(i);
			if (listElement == element) {
				ans = i;
				break;
				
			}
		}
		if (ans == -1) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element is not found in linkedList" +ans);
		}
		/*LinkedList<Integer> ll = new LinkedList<>();
		 
        // Adding elements to the Linked List
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
 
        // Element to be searched
        int element = 4;
 
        // Initializing the answer to the index -1
        int ans = -1;
 
        // Traversing through the Linked List
        for (int i = 0; i < ll.size(); i++) {
 
            // Eztracting each element in
            // the Linked List
            int llElement = ll.get(i);
 
            // Checking if the extracted element is equal to
            // the element to be searched
            if (llElement == element) {
 
                // Assigning the index of the
                // element to answer
                ans = i;
                break;
            }
        }
        // Checking if the element is present in the Linked
        // List
        if (ans == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println(
                "Element found in Linked List at " + ans);
        }*/
    }
	}

