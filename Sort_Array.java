package arraysprogram; // Assignment 64

import java.util.Arrays;

public class Sort_Array 
{

	public static void main(String[] args) 
	{
	String name[]=new String[3];
	name [0]="Guvvala";
	name[1]="Mary";
	name[2]="Kumari";
	System.out.println(Arrays.toString(name));
    Arrays.sort(name);
    System.out.println(Arrays.toString(name));
	int rn [] = new int[4];
	rn[0]=89;
	rn[1]=75;
	rn[2]=94;
	rn[3]=55;
	System.out.println(Arrays.toString(rn));
	Arrays.sort(rn);
	System.out.println(Arrays.toString(rn));
	}

}
