package programs;

import java.util.Scanner;

public class Area_of_triangle 
{
	
	public static void main(String[] args) 
	{
     Scanner s1=new Scanner(System.in);
     System.out.println("Enter the value of Breadth");
     int b= s1.nextInt();
     System.out.println("Enter the value of Height");
     int h = s1.nextInt();
     System.out.println("Area of Triangle");
     double areaoftriangle = (double)1/2*b*h;
     System.out.println(areaoftriangle);
    }
	
}
