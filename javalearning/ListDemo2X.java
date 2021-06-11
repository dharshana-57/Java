import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2X {

	public static void main(String[] args) {
		
		List<Integer> list2 = new LinkedList<>();
		list2.add(50);
		list2.add(55);
		list2.add(59);
		list2.add(52);
		list2.add(57);
		list2.add(1, 60);
		System.out.println(list2);
		list2.set(1, 51);
		System.out.println(list2);
		System.out.println("(5): " +list2.get(5));
		System.out.println("59 is in " + (list2.indexOf(59)+1));
		System.out.println(list2);
		
		ListIterator<Integer> listItr = list2.listIterator();
		
		while (listItr.hasNext()) {
			Integer integer = (Integer) listItr.next();
			System.out.println(integer);
		}
	}

}
