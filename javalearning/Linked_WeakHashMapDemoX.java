package firewall;

import java.util.LinkedHashMap;
import java.util.WeakHashMap;

public class Linked_WeakHashMapDemoX {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lmap1 = new LinkedHashMap<>();
		WeakHashMap<String, Integer> lmap2 = new WeakHashMap<>();
		
		String Two = new String("Twenty");
		Integer TwoValue = 20;
		
		String keyString = new String("Eighty");
		Integer keyValue = 80;
		
		lmap1.put("Ten", 10);
		lmap1.put(keyString, keyValue);
		lmap1.put("Thirty", 30);
		
		lmap2.put("Forty", 40);
		lmap2.put(Two, TwoValue);
		lmap2.put("ten", 10);
		
		System.out.println(lmap1);
		System.out.println(lmap2);
		
		Two = null;
		
//		performing garbage collection in JVM
		System.gc();
		
		System.out.println(lmap1);
		System.out.println(lmap2);
		
		
	}

}
