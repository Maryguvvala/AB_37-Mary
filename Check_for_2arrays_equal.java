package arraysprogram;

import java.util.Arrays;

public class Check_for_2arrays_equal 
{

	public static void main(String[] args) 
	{
		String name[]= {"guvvala","mary","kumari"};
		String stundent[]= {"guvvala","mary","kumari"};
		System.out.println(Arrays.equals(name, stundent));
		String name1[]= {"guvvala","mary","kumari"};
		String student1[]= {"mary","kumari","guvvala"};
		System.out.println(Arrays.equals(name1, student1));
		/*int num[]= {58,78,97,64};
		int num1[]= {78,58,67,95};
		System.out.println(Arrays.equals(num, num1));*/

	}

}
