package in.com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		
		c1.add(100);
		c1.add(101);
		c1.add(103);
		c1.add(104);
		c1.add("ten");
		c1.add("ram");
		c1.add("ramji");
		System.out.println("c1 = "+ c1);
		
		Collection c2 = new ArrayList();
		c2.add(105);
		c2.add("shivam");
		c2.add("naman");
		System.out.println("c2 ="+ c2);
		
		c1.addAll(c2);
		System.out.println("c1 = "+ c1);
		System.out.println("collections =" + c2.contains("shivam"));
		System.out.println("collections ="+ c1.contains("ramji"));
		System.out.println("collections ="+ c2.contains("ravan"));
		System.out.println("collection ="+ c1.containsAll(c1));
		System.out.println("collection ="+ c1.isEmpty());
		c1.remove("ramji");
		System.out.println("collection ="+ c1);
		c1.remove("shivam");
		System.out.println("collection ="+ c1);
		c1.removeAll(c2);
		System.out.println("collection ="+ c1);
		c1.retainAll(c2);
		System.out.println("collection ="+ c1);
		
	}
}
