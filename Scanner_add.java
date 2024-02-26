package arraysprogram;//exam

import java.util.Scanner;

public class Scanner_add 
{
    Scanner s1=new Scanner(System.in);
    int a= s1.nextInt();
    int b=s1.nextInt();
    
    void add()
    {
    	System.out.println("Addition");
    int	sum = a+b;
    System.out.println(sum);
    }
    void subtract()
    {
    	System.out.println("Subtraction");
    	int sub=a-b;
    	System.out.println(sub);
    }
    void multiply()
    {
    	System.out.println("Multiplication");
    	int multiplication =a*b;
    	System.out.println(multiplication);
    }
    void division()
    {
    	System.out.println("Division");
    	double division = a/b;
    	System.out.println(division);
    }
	public static void main(String[] args) 
	{
		Scanner_add s2=new Scanner_add();
		s2.add();
		s2.subtract();
		s2.multiply();
		s2.division();

	}

}
