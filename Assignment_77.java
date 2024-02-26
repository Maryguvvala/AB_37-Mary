package arraysprogram;

import java.util.Arrays;

public class Assignment_77
{

	public static void main(String[] args) 
	{
		String name[]= {"guvvala","mary","kumari"};
		String stundent[]= {"guvvala","mary","kumari"};
		System.out.println(Arrays.equals(name, stundent));
		String name1[]= {"guvvala","mary","kumari"};
		String stundent1[]= {"mary","kumari","guvvala"};
		System.out.println(Arrays.equals(name1, stundent1));

	}

}
