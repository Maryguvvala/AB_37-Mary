package ifstatements;

public class One_Non_Static_Method 
{
	void add()
	{
		int a=5;
		int b=10;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		One_Non_Static_Method o1 = new One_Non_Static_Method();
		o1.add();
	}

}
