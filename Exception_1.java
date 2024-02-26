package exception_handling;

public class Exception_1
{
	public static void main(String[] args) 
	{
		/*try
		{
			int c=1/0;
			System.out.println(c);
		}*/
		try
		{
			int c=1/1;
			System.out.println(c);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Catch Block");
		}
		
	}

}
