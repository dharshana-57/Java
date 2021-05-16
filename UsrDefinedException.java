package miraculousgod;

public class UsrDefinedException 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,j;
		i = 8;
		j = 9;
		try 
		{
			int k = i/j;
			
			//throwing our own exception
//			if (k == 0) 
//			{
//				throw new Exception();
//			}
			
			if (k == 0) 
			{
				throw new MineException("This is impossible");
			}
			System.out.println(k);
		} 
		
		catch (MineException e) 
		{
			// TODO: handle exception
			System.out.println("Error " + e.getMessage());
		}
	}

}
