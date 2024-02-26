package programs;

import java.util.Scanner;

public class CheckScanner 
{
	Scanner s1=new Scanner(System.in);
	int a = s1.nextInt();
	int b = s1.nextInt();
	void add()
	{
		int sum = a+b;
		System.out.println(sum);
	}

	public static void main(String[] args)
{
	CheckScanner c1=new CheckScanner();
	c1.add();

	}

}
