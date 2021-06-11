package firewall;

import java.util.HashMap;
import java.util.Map;

public class MapDemoX {

	public static void main(String[] args) {
		
//		Map<Integer, String> m1 = new HashMap<>();
		Map<Integer, String> m1 = new HashMap<>(4, 0.50f);
		m1.put(1, "One");
		m1.put(2, "Two");
		m1.put(3, "Three");
		m1.put(4, "Four");
		System.out.println(m1);
		System.out.println("Keys: " + m1.keySet());
		System.out.println("Values: " + m1.values());
		System.out.println("Entries: " + m1.entrySet());
		System.out.println(m1.remove(2));
		System.out.println(m1);
		m1.putIfAbsent(7, "Seven");
		System.out.println(m1);
		System.out.println(m1.getOrDefault(3, "Default"));
		System.out.println(m1.containsValue("Six"));
		
	}

}
