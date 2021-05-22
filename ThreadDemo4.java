package miraculousgod;

//  MULTITHREADING - THREAD PRIORITY

public class ThreadDemo4 {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++)
			{
				System.out.println("hi " + Thread.currentThread().getPriority());
				try 
				{
					Thread.sleep(1000);
				} catch (Exception e) {}
			}
			});
		
		Thread t2  =  new Thread(() -> {
			for (int i = 0; i < 5; i++) 
			{
				System.out.println("hello");
				try 
				{
					Thread.sleep(1000);
				} catch (Exception e) {}
			}
			}, "Hello Thread"); // set thread name as Thread(RunnableObject, String)
		
//		setting and getting thread name
//		t1.setName("Hi Thread");
//		System.out.println(t1.getName());
//		System.out.println(t2.getName());
		
		
//		range of priority: (1 to 10)
//		1 -> least priority, 10 -> highest priority, 5 ->normal priority
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(10);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		try 
		{
			Thread.sleep(10);
		} catch (Exception e) {}
		
		t2.start();
		

	}

}
