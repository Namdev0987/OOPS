package in.com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmploye {
public static void main(String[] args) {
	Employe c1 = new Employe(1,"shivam",30000);
	Employe c2 = new Employe(2,"kamal",46000);
	Employe c3 = new Employe (3,"ram",58990);
	Employe c4 = new Employe (4,"krishna",90000);
	Employe c5 = new Employe (5, "ronu",78990);
	
	
	List list = new ArrayList();
	list.add(c1);
	list.add(c2);
	list.add(c3);
	list.add(c4);
	list.add(c5);
	
	Iterator it = list.iterator();
	while(it.hasNext()) {
		Object object = it.next();
		Employe e = (Employe) object;
		System.out.println(e.getId());
		System.out.println("\t" + e.getId());
		System.out.println("\t" + e.getName()); 
		System.out.println("\t" + e.getSalary());
		
	}
}
}
