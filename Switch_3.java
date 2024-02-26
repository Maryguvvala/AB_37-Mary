package programs;

import java.util.Scanner;

public class Switch_3 
{
	public static void main(String[] args) 
	{
	System.out.println("Enter switch number");
	Scanner s1=new Scanner (System.in);
	int a = s1.nextInt();
	System.out.println("Enter b value");
	int b = s1.nextInt();
	System.out.println("Enter c value");
	int c = s1.nextInt();

	switch(a)
	{
	case 1: System.out.println("Addition");
		    int sum = b+c;
	        System.out.println(sum);
	        break;
	case 2: System.out.println("Subtraction");
	        int subtraction = b-c;
	        System.out.println(subtraction);
	        break;
	case 3: System.out.println("Multiplication");
	        int multiplication = b*c;
	        System.out.println(multiplication);
	        break;
	case 4: System.out.println("Division");
	        double division = (double) b/c;
	        System.out.println(division);
	        break;
	}
	}
}
