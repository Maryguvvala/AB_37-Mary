package arraysprogram; //Assignment 65

import java.util.Arrays;

public class Copy_Array 
{

	public static void main(String[] args)
	{
     int original []=new int [4];
     original[0]=5;
     original[1]=6;
     original[2]=7;
     original[3]=8;
     int copy[]=new int[4];
     for(int i=0;i<copy.length;i++)
     {
    	 copy[i]=original[i];
     }
     System.out.println("Original Array is: " +  Arrays.toString(original));
     System.out.println("Copied Array is: " + Arrays.toString(copy));
	}

}
