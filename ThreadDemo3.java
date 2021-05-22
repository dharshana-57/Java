package miraculousgod;

//  MULTITHREADING -> Join | isAlive METHOD :
// threadName.join() -> it will wait for the thread to complete its execution and will join with main thread.
//  threadName.isAlive() -> checks if a thread is alive or not and if it is given after join() method means it returns false.
/*
										main thread
												|
											   \/
						---------------------------------
						|												|
					   \/											   \/
						|												|
						----------------------------------
						t1.join()			|						t2.join()
											   \/
												|
										main thread

 */
public class ThreadDemo3 {

	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++)
			{
				System.out.println("hi");
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
			});
		
		t1.start();
		try 
		{
			Thread.sleep(10);
		} catch (Exception e) {}
		
		t2.start();
		
		System.out.println(t2.isAlive());
		
		t1.join();
		t2.join();
		
		System.out.println(t2.isAlive());
		
		System.out.println("Bye");
	}

}
