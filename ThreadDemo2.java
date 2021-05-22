package miraculousgod;

// MULTITHREADING - LAMBDA EXPRESSION
/*
 * Here since a cls is created to override a method we can use anonymous class.
 * we are using anonymous cls to create Runnable interface object.
 * since we are using anonymous class we can use lambda expression to reduce the codes of line.
 * again we can reduce further by directly passing the method as parameter in thread constructor.
 * here using anonymous cls and lambda expression -> reduce lines of code and makes code more efficient.
 */
public class ThreadDemo2 
{

	public static void main(String[] args) 
	{
		Runnable ob2 = () -> {
				for (int i = 0; i < 5; i++) 
				{
					System.out.println("hello");
					try 
					{
						Thread.sleep(1000);
					} catch (Exception e) {}
				}
				};
				
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
		
		Thread t2  =  new Thread(ob2);
		
		t1.start();
		try 
		{
			Thread.sleep(10);
		} catch (Exception e) {}
		
		t2.start();
	}
}
