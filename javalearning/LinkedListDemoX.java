import java.util.LinkedList;

public class LinkedListDemoX {

	public static void main(String[] args) {
		LinkedList<Integer> list3 = new LinkedList<>();
		list3.add(23);
		list3.add(20);
		list3.add(25);
		list3.add(2, 60);
		System.out.println(list3);
		list3.set(1, 40);
		System.out.println(list3.get(1));
		System.out.println(list3.remove(0));
		System.out.println(list3);
	}

}
