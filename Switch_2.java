package programs;

import java.util.Scanner;

public class Switch_2 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the required Switch");
		Scanner a1=new Scanner(System.in);
		int a = a1.nextInt();
		switch(a)
		{
		case 1: System.out.println("Addition");
		        break;
		case 2: System.out.println("Subtraction");
		        break;
		case 3: System.out.println("Multiplication");
		        break;
		case 4: System.out.println("Division");
		        break;
		default: System.out.println("None of the above");
		}

	}

}
