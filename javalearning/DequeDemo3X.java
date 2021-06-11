import java.util.ArrayDeque;

public class DequeDemo3X {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad1 = new ArrayDeque<>();
		ad1.push(78);
		ad1.push(70);
		ad1.push(75);
		ad1.push(72);
		ad1.push(78);
		ad1.push(75);
		System.out.println(ad1);
		System.out.println(ad1.pop());
		System.out.println(ad1.pop());
		System.out.println(ad1);
		System.out.println(ad1.peek());
		System.out.println(ad1.getClass());
	}

}
