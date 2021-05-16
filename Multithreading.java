package miraculousgod;

import java.util.Iterator;

/*APPLICATIONS OF MULTITHREADING:
 * use all different cores =>use threads so that it uses all cores to execute faster than normal execution without threads
 * android application ->asynctask in android
 * web application => multiple client access single servlet
 * gaming => shooting games
 
 thread  using :
 * extending thread class
 * using ruunnable interface
 * */

class Hi extends Thread
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
class Hello extends Thread // making cls thread
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
public  class Multithreading 
{
	static public void main(String[] args)
	{
//		everytime when a class extends thread it becomes thread and object also becomes thread
		Hi ob1 =new Hi();
		Hello ob2 = new Hello();
		
//		start calls run automatically
		ob1.start();
		try 
		{
			Thread.sleep(10);
		} catch (Exception e) {}
		ob2.start();
		
	}
}
