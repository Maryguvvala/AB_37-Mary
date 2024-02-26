package multiple_level;//Assignment 54
// 2 interface, 1 abstract class, 1 child class
interface levela
{
   void add();
}
interface levelb
{
   void subtract();
}
abstract class levelc implements levela,levelb
{
	abstract void multiply();
}
public class Interface_2 extends levelc
{
	public static void main(String[] args)
    {
		Interface_2 i1=new Interface_2();
		i1.add();
		i1.subtract();
		i1.multiply();
	}
	public void add() 
	{
		System.out.println("This is add - interface");
	}
	public void subtract() 
	{
		System.out.println("This is subtracr - interface");
	}
	void multiply() 
	{
		System.out.println("This is multiply - abtract class");
	}
}
