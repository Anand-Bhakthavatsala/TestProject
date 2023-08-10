package JavaPrograms;

public class JavaDemo1 {
	
	public static void main(String args[])
	{
		try
		{
			System.out.println(100/0);
			/*
			 * String cars[]= {"merc","Audi"}; System.out.println(cars[2]);
			 */
		}
		catch(IndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		try
		{			
			String cars[]= {"merc","Audi"};
			System.out.println(cars[1]);
		}
		catch(IndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}

}
