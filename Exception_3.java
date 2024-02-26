package exception_handling; //Assignment 61

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_3 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner s1=new Scanner(System.in);
			//int c=1/0;
			int a = s1.nextInt();
			System.out.println("There is no exception ");
		}
	    catch(ArithmeticException a1)
		{
	    	System.out.println("Arithmetic Exception Catch Block");
		}
	    catch(InputMismatchException a2)
		{
	    	System.out.println("InputMismatch Exception Catch Block");
		}
	    finally
	    {
	    	System.out.println("Precaution Block");
	    }
	
	}
	

}
