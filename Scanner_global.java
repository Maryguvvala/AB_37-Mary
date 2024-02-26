package programs;

import java.util.Scanner;

public class Scanner_global 
{
    static Scanner s1=new Scanner(System.in);
    static int a = s1.nextInt();
    static int b = s1.nextInt();
    
    static void addition()
    {
    	System.out.println("Addition");
    	int sum = a+b;
    	System.out.println(sum);
    }
    static void subtraction()
    {
    	System.out.println("Subtraction");
    	int subtraction = a-b;
    	System.out.println(subtraction);
    }
    static void multiplication()
    {
    	System.out.println("Multiplication");
    	int multiplication = a*b;
    	System.out.println(multiplication);
    }
    static void division()
    {
    	System.out.println("division");
    	double division= a/b;
    	System.out.println(division);
    }
    
	public static void main(String[] args) 
	{
		addition();
		subtraction();
		multiplication();
		division();

	}

}
