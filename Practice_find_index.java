package arraysprogram;

import java.util.Scanner;

public class Practice_find_index 
{

	public static void main(String[] args) 
	{
		int numgiven[]= {41,71,85,64};
		int assume = 0;
		Scanner s1=new Scanner(System.in);
		int findnum= s1.nextInt();
		for (int i=0;i<numgiven.length;i++)
		{
			if (findnum==numgiven[i])
			{
				System.out.println("num is present at index "+ i);
				assume++;
			}
			
		}
		
		if (assume==0)
			{
				System.out.println("num is not present");
			}
		
		
	}

}
 