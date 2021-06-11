
import java.util.Iterator;
import java.util.PriorityQueue;


public class QueueDemo2X {

	public static void main(String[] args) {
		
		PriorityQueue<String> p1 = new PriorityQueue<>();
		p1.offer("joy");
		p1.offer("happy");
		p1.offer("delightful");
		p1.offer("sad");
		System.out.println(p1);
		System.out.println(p1.isEmpty());
		System.out.println(p1.contains("joyful"));
		System.out.println(p1.toString());
		System.out.println(p1.getClass().getName());
		
		
	
		
		PriorityQueue<Integer> q1 = new PriorityQueue<>();
		q1.offer(6);
		q1.offer(67);
		q1.offer(69);
		q1.offer(10);
		System.out.println(q1);
		Iterator<Integer> itr  = q1.iterator();
		while (itr.hasNext()) {
			 System.out.println(itr.next());
		}
		System.out.println(q1.poll());
		System.out.println(q1.peek());
 	}
}
