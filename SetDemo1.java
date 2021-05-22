package miraculousgod;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		Set<Integer> values = new HashSet<>();  // prints random order
//		Set<Integer> values = new TreeSet<>();   // prints in sorted order
		values.add(9);
		values.add(7);
		values.add(8);
		values.add(2);
		values.add(9);
		
		for (Integer integer : values) {
			System.out.println(integer);
		}
	}

}
