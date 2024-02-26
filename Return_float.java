package collectionprograms;

import java.util.Scanner;

public class Return_float 
{
	 float subtract(float a, float b)
	    {
	    	float subtract=a-b;
	    	return subtract;
	    }

	 public static void main(String[] args) 
	 {
	 
       Scanner s1=new Scanner (System.in);
       System.out.println("Enter the First number");
       float a = s1.nextFloat();
   
       System.out.println("Enter Second number");
       float b = s1.nextFloat();
       
       Return_float r1=new Return_float();
       r1.subtract(a, b);
       System.out.println(a+ "-"+ b + " : "+r1.subtract(a, b));
	 }

}
