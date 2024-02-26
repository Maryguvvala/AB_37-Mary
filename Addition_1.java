package ifstatements;

public class Addition_1 
{
	Addition_1(int a,double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	Addition_1(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	Addition_1(double a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		new Addition_1(10, 4.54);
		new Addition_1(100,200);
		new Addition_1(1.1,1.5);
	}

}
