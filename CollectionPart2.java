package miraculousgod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Collection -> Interface
 * Collections -> Class
 * Collection [<Integer>]----> Generics = indicates collections of type integer
 * */

public class CollectionPart2 {

	public static void main(String[] args) {
		
//		List is mutable
		List<Integer> value = new ArrayList<>();
		value.add(4);  // Wrapper cls Integer object = 4 -> Integer v = new Integer(4);
		value.add(8);
		value.add(2);
		value.add(2, 7);
		
		
//		Iterator  interface can also be used
//		for (int i = 0; i < value.size(); i++) 
//		{
//			System.out.println(value.get(i));
//		}
		Collections.sort(value);
		Collections.reverse(value);
		Collections.shuffle(value);
		
		for (Integer ob : value) 
		{
			System.out.println(ob);
		}
		
	}
}
