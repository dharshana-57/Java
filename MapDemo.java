package miraculousgod;

import java.util.HashMap;  // not synchronized
import java.util.Hashtable; // synchronized
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();  // mostly used
//		Map<String, String> map = new HashTable<>();
		map.put("Name", "Gorgera");
		map.put("Color", "Green");
		map.put("Food", "GolGappi");
		map.put("Color", "Grey");
	
		
//		System.out.println(map);
		
		Set<String> keys = map.keySet();
		
		for (String k : keys) {
			System.out.println(k + " : " + map.get(k));
		}
	}

}
