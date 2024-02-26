package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_2 
{
	public static void main(String[] args) 
	{
		try 
		{
			int c=1/0;
			System.out.println(c);
			
			//Scanner s1=new Scanner(System.in);
			//boolean statement=s1.nextBoolean();
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Arithmetic Catch Block");
		}
		catch(NullPointerException a1)
		{
			System.out.println("Null Pointer Catch Block");
		}
		catch(InputMismatchException a3)
		{
			System.out.println("Input Mismatch Catch Block");
		}
		
	}
	

}
