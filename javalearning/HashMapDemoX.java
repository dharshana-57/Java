package firewall;

import java.util.HashMap;

public class HashMapDemoX {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map1 = new HashMap<>();
		map1.put(1, 10);
		map1.put(2, 20);
		map1.put(3, 30);
		map1.put(4, 40);
		map1.put(5, 50);
		map1.put(6, 10);
		System.out.println(map1);
		map1.replace(6, 10, 60);
		System.out.println(map1);
		System.out.println(map1.compute(2, (k,v)-> v*20 ));
		System.out.println(map1);
		map1.merge(2, 400, (s,t)-> t/20 );
		System.out.println("Map1:" + map1);
		
		@SuppressWarnings("unchecked")
		HashMap<Integer, Integer> map2 = (HashMap<Integer, Integer>) map1.clone();
		map2.remove(3);
		map2.put(8, 80);
		map2.put(10, 100);
		System.out.println("Map2:" + map2);
		map1.putAll(map2);
		System.out.println("Map1:" + map1);
		
	}

}
