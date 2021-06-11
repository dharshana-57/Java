import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemoX {

	public static void main(String[] args) {
		
		Deque<Integer> d1 = new ArrayDeque<>();
//		System.out.println(d1.pollFirst());
//		System.out.println(d1.peek());
//		System.out.println(d1.element());
//		System.out.println(d1.removeFirst());
		d1.addFirst(8);
		d1.add(82);
		d1.addLast(45);
		d1.add(60);
		d1.addLast(90);
		System.out.println(d1);
		System.out.println(d1.removeLast());
		System.out.println(d1);
		System.out.println(d1.pollLast());
		System.out.println(d1.pollFirst());
		System.out.println(d1);
		System.out.println(d1.peek());
	}

}
