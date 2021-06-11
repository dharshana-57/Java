import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemoX {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
//		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(7);
		list1.add(5);
		list1.add(9);
		list1.add(2);
		System.out.println(list1);
		list1.add(3,8);
		System.out.println(list1);
		list1.remove(4);
		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println(list1.contains(9));
		
		Iterator<Integer> itr = list1.iterator();
		while (itr.hasNext()) {
			Integer it = itr.next() ;
			System.out.println( it + " : " + list1.indexOf(it) );
		}
		
		
		list1.clear();
		System.out.println(list1);
	}

}
