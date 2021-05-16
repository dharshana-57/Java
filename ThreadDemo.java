package miraculousgod;


class Hii  implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("hi");
			try 
			{
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}
class Helloo implements Runnable // making cls thread
{
	public void run()
	{
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("hello");
			try 
			{
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable ob1 =new Hii();
		Runnable ob2 = new Helloo();
		
		Thread t1 = new Thread(ob1);
		Thread t2  =  new Thread(ob2);
		
		t1.start();
		try 
		{
			Thread.sleep(10);
		} catch (Exception e) {}
		
		t2.start();
		
		
		
	}

}
