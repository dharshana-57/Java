import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeDemo2X {

	public static void main(String[] args) {

		Deque<String> d2 = new LinkedList<>();
		d2.addFirst("Sad");
		d2.add("Sorrow");
		d2.addLast("Grim");
		d2.addFirst("Upset");
		d2.addLast("Mood out");
		System.out.println(d2);
		System.out.println(d2.peekFirst());
		System.out.println(d2.pollFirst());
		System.out.println(d2);
		System.out.println(d2.removeLast());
		System.out.println(d2.isEmpty());
		System.out.println(d2.offerFirst("Tears"));
		System.out.println(d2);
		System.out.println(d2.size());
		System.out.println(d2.contains("Tears"));
		Iterator<String> itr1 = d2.descendingIterator();
		while (itr1.hasNext()) {
			 System.out.println(itr1.next());
		}
		System.out.println(d2.getLast());
	}

}
