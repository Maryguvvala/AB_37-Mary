package collectionprograms;

import java.util.Scanner;

public class Return_boolean 
{ 

	 boolean answer(int a, int b)
	{
		return a > b;
	}
	
    public static void main(String[] args) 
    {
       Scanner s1=new Scanner (System.in);//scanner object
       
       System.out.println("Enter the First number");
       int a =s1.nextInt();
       
       System.out.println("Enter the Second number");
       int b=s1.nextInt();
       
       Return_boolean r1=new Return_boolean();//class object
       r1.answer(a, b);
       System.out.println(a + " > " + b + " : "+r1.answer(a,b));
     
       
     
    }
}



