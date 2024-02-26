package variables;

public class Non_Static_Variable 
{
     int a;
     int b;
     void add()
     {
    	 a=10;
    	 b=20;
    	 int sum=a+b;
    	 System.out.println(sum);
     }
    void subtract()
    {
    	a=100;
    	b=50;
    	int subtract=a-b;
    	System.out.println(subtract);
    }
	public static void main(String[] args)
	{
		Non_Static_Variable n1 = new Non_Static_Variable();
		n1.add();
		n1.subtract();
	}

}
