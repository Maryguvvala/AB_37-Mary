package collectionprograms;

import java.util.Scanner;

public class Return_string 
{   String input(String name)
	{
	 return name;
	}


	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Name");
		String name= s1.next();
		
		Return_string r1=new Return_string();
		r1.input(name);
		System.out.println("Input: "+ name);
				

	}

}
