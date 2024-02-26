package ifstatements;

public class Many_Non_Static_Methods 
{
	 void multiply()
     {
    	 int a=5;
    	 int b=10;
    	 int multiply=a*b;
    	 System.out.println(multiply);
     }
     void divide()
     {
    	 int a=100;
    	 int b=40;
    	 float divide= (float)a/b;
    	 System.out.println(divide);
     }
	public static void main(String[] args) 
	{
		Many_Non_Static_Methods m1 = new Many_Non_Static_Methods();
		m1.multiply();
		m1.divide();
		m1.add();
		m1.subtract();
	}
	void add()
	{
		int a=100;
		int b=200;
		int sum=a+b;
		System.out.println(sum);
	}
    void subtract()
	{
		int a=1000;
		int b=2000;
		int subtract=a-b;
		System.out.println(subtract);
	}
	
}
