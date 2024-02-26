package programs;

import java.util.Scanner;

public class Scanner_age
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the age");
		Scanner s1=new Scanner(System.in);
		int age=s1.nextInt();
		System.out.println("Result is:");
	
		if(age>=18)
		{
			System.out.println("I am Adult");
		}
		else
		{
			System.out.println("I am still Young");
		}

	}

}
