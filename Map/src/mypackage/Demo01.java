package mypackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo01 {

	public static void main(String[] args) {
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("Praveen", 700);
		m.put("Pranav", 800);
		m.put("Adarsh", 200);
		m.put("Harsh", 500);
		System.out.println(m);
		System.out.println(m.put("Adarsh", 1000));
		Set<String> s =m.keySet();
		System.out.println(s);
		Collection<Integer> c = m.values();
		System.out.println(c);
		Set<Entry<String, Integer>> s1 = m.entrySet();
		System.out.println(s1);
		Iterator<Entry<String, Integer>> itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> m1 = (Map.Entry<String, Integer>)itr.next();
			System.out.println(m1.getKey()+"....."+m1.getValue());
			if(m1.getKey().equals("Praveen")) {
				m1.setValue(10000);
			}
		}
		System.out.println(m);
	}

}
