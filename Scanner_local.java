package programs;

import java.util.Scanner;

public class Scanner_local
{
	static void addition()
	{
		System.out.println("Addition of two numbers");
    	Scanner s1=new Scanner(System.in);
    	int a = s1.nextInt();
    	int b = s1.nextInt();
    	int sum = a+b;
    	System.out.println(sum);
	}
	static void subtraction()
	{
	 	System.out.println("Subtraction of two numbers");
	  	Scanner s1=new Scanner(System.in);
	  	int a = s1.nextInt();
    	int b = s1.nextInt();
    	int subtraction = a-b;
    	System.out.println(subtraction);
	}
    static void multiplication()
    {
    	System.out.println("Multiplication of two numbers");
      	Scanner s1=new Scanner(System.in);
      	int a = s1.nextInt();
    	int b = s1.nextInt();
    	int multiplication = a*b;
    	System.out.println(multiplication);

    }
    static void division()
    {
     	System.out.println("Division of two numbers");
      	Scanner s1=new Scanner(System.in);
      	int a = s1.nextInt();
    	int b = s1.nextInt();
    	double division = a/b;
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
