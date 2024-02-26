package arraysprogram; //Assignment 63

import java.util.Scanner;

public class Assignment_63 //array of length 5 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int rollno[]= new int [5];
		for (int i=0; i<=4; i++)
		{
		   System.out.println("Enter the value of index " +i);
		   rollno[i]=s1.nextInt();

		}
		System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);
		System.out.println(rollno[3]);
		System.out.println(rollno[4]);
		
		
	
	}
	

}
