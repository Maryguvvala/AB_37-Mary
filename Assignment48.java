package inheritance;
class Concreteclass //concrete class
{
  static void add() 
    {
    	System.out.println("Add");
    }
    void sub()
    {
    	System.out.println("Subtraction");
    }
}
abstract class Program extends Concreteclass //abstract class
{
	abstract void multiplication();
	abstract void division();
}
public class Assignment48 extends Program //main class
{
    static void area() 
    {
    	System.out.println("Area");
    }
    static void length()
    {
    	System.out.println("Length");
    }
	public static void main(String[] args) 
	{
		area();
		length();
		add();
		Assignment48 a1=new Assignment48();
		a1.multiplication();
		a1.division();
		a1.sub();
	}
	void multiplication() 
	{
		System.out.println("Multiplication");
	}
	void division() 
	{
		System.out.println("Division");
	}
}
