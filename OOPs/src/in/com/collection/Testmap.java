package in.com.collection;

import java.util.HashMap;
import java.util.Map;

public class Testmap {
public static void main(String[] args) {
	Map map = new HashMap();
	
	map.put(1, "shiva");
	map.put(2, "mahadev");
	map.put(3, "gagan");
	map.put(4, "dhoni");
	
	System.out.println(map);
	System.out.println(map.get(1));
	System.out.println(map.get(2));
	System.out.println(map.get(3));
	System.out.println(map.get(4));
	System.out.println(map.keySet());
	System.out.println(map.values());
	System.out.println(map.size());
}
}
