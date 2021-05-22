package miraculousgod;


// MULTITHREADING - SYNCHRONIZED KEYWORD
//  t1 is executing means t2 has to wait and viceversa
// not used means it is not thread safe => more threads access a single function at same time.

class Counter
{
	int count;
//	synchronized -> allows only one thread to use this function at a time, after thread1 finishes it allows next thread to use this function.
	public synchronized void increment() {
		count++;
	}
}
public class ThreadDemo5 {

	public static void main(String[] args) throws Exception{
		
		Counter cnt = new Counter();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() 
			{
				for (int i = 0; i < 1000; i++) 
				{
					cnt.increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() 
			{
				for (int i = 0; i < 1000; i++) 
				{
					cnt.increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("count : " + cnt.count);

	}

}
