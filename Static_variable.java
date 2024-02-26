package variables;

public class Static_variable 
{
	static int a;
	static int b;
	static void add()
	{
		a=100;
		b=150;
		int sum =a+b;
		System.out.println(sum);
	}
	static void subtract()
	{
		a=500;
		b=200;
		int subtract=a-b;
		System.out.println(subtract);
	}

	public static void main(String[] args)
	{
	add();
	subtract();

	}

}
