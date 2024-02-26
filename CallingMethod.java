package ifstatements;

public class CallingMethod 
{
	static void add()// static method
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	static void subtract()// static method
	{
		int a=10;
		int b=20;
		int subtract=a-b;
		System.out.println(subtract);
	}
	public static void main(String[] args) 
	{
       add();
       subtract();
       CallingMethod c1= new CallingMethod();
       c1.multiply();
       c1.divide();
	}
     void multiply()// non static method
     {
    	 int a=10;
    	 int b=30;
    	 int multiply=a*b;
    	 System.out.println(multiply);
     }
     void divide()// non static method
     {
    	 int a=30;
    	 int b=40;
    	 double divide= (double)a/b;
    	 System.out.println(divide);
     }
}
