import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemoX {
	public static void main(String[] args) {
		
		Queue<Integer> q1 = new ArrayDeque<>();
		q1.offer(6);
		q1.offer(67);
		q1.offer(69);
		q1.offer(10);
		System.out.println(q1);
		System.out.println(q1.peek());
		System.out.println(q1.poll());
		System.out.println(q1);
		q1.add(89);
		System.out.println(q1.element());
		System.out.println(q1.remove(67));
		System.out.println(q1);
		q1.clear();
		System.out.println(q1);
		
	}

}
