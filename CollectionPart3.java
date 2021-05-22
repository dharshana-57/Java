package miraculousgod;

//Collections and Generics => Comparator Interface

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class Mycomparator implements Comparator<Integer>
//{
//	
//}

@SuppressWarnings("unused")
public class CollectionPart3 {

	public static void main(String[] args) {
		
		List<Integer> value = new ArrayList<>();
//		we want to sort based on last no. in 3 digit  number
		value.add(404);  
		value.add(908);
		value.add(639);
		value.add(265);
		
// 		using our own method logic and applying it to method
		Collections.sort(value,  (i,  j) ->  i % 10 > j % 10? 1 : -1);
		
		for (Integer ob : value) 
		{
			System.out.println(ob);
		}
		
	}

}

//  Comparator<Integer> c = new Comparator<Integer>() {
//	@Override
//  public int compare(Integer o1, Integer o2)
//	 {
// //		we can also use ternary operator
//		if (o1 % 10 > o2 % 10)
//		{
//			return 1;
//		}
//		return -1;
//	  }
// };

// changed to

// lambda expression
// Comparator<Integer> c = (i,  j) ->  i % 10 > j% 10?-1:1 ;

// which is further changed as..
