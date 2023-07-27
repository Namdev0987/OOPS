package in.com.collection;


import java.util.ArrayList;
import java.util.List;

public class Listmethods1 {
public static void main(String[] args) {
	List list = new ArrayList();
	list.add("shivam");
	list.add("gun");
	list.add(11);
	list.add(45);
	list.add(101);
	
	System.out.println("list="+ list);
	System.out.println("get ="+ list.get(0));
	System.out.println("get="+ list.get(2));
	System.out.println("index of="+ list.indexOf("shivam"));
	System.out.println("index of="+ list.indexOf(11));
	System.out.println("last index of ="+ list.lastIndexOf("shivam"));
	System.out.println("last index of="+list.lastIndexOf(11));
	System.out.println("last index of="+ list.lastIndexOf(101));
	System.out.println("sub list="+ list.subList(0, 5));
	
}
}
