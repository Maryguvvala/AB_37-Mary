package exception_handling;//Assignment 62

public class Exception_4 
{

	public static void main(String[] args) throws ArithmeticException
    {
	int a=16;
	if (a>=18)
	{
		System.out.println("Allow him to access google");
	}
	else
	{
		throw new ArithmeticException();
	}
    }
}
