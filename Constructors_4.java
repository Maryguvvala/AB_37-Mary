package ifstatements;

public class Constructors_4 
{
	Constructors_4()
	{
		this(5,5.5);
		System.out.println("Constructor 1");
	}
	Constructors_4(int a)
	{
		System.out.println("Constructor 2");
	}
	Constructors_4(int a, int b)
	{
		this();
		System.out.println("Constructor 3");
	}
	Constructors_4(int b, double a)
	{
		this(5);
		System.out.println("Constructor 4");
	}
	//{
	//	System.out.println("IIB");
	//}
	public static void main(String[] args) 
	{
		//new Constructors_4();
		//new Constructors_4(5);
		new Constructors_4(5,6);
		//new Constructors_4(5, 5.5);
	}
}
