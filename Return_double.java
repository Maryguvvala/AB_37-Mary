package collectionprograms;

import java.util.Scanner;

public class Return_double
{

	 double Add(double a, double b)
	    {
	    	double Add=a+b;
	    	return Add;
	    }
	public static void main(String[] args)
	{
		Scanner s1=new Scanner (System.in);
		System.out.println("Enter the value of a");
	    double a=s1.nextDouble();
	    
	    System.out.println("Enter the value of b");
	    double b=s1.nextDouble();
	    
	    Return_double r1=new Return_double();
	    r1.Add(a, b);
	    System.out.println(a + " + "+ b + " = " +r1.Add(a, b));
	    		
	}

}
