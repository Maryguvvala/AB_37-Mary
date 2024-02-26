package multiple_level; //Assignment 55
// child class -> abstract class ---> interface2 -> interface1
interface yes //interface 1
{
	void num1();
}
interface no extends yes // interface 2
{
	void num2();
}
abstract class right implements no // abstract class
{
	abstract void num3();
	void num4()
	{
		System.out.println("This is non static - concrete method");
	}
	static void num5()
	{
		System.out.println("This is static - concrete method");
	}
}
public class Interface_2_Class_2 extends right //child class
{
	public static void main(String[] args) 
	{
		Interface_2_Class_2 i1=new Interface_2_Class_2();
		i1.num1();
		i1.num2();
		i1.num3();
		i1.num4();
		num5();
	}
	public void num2()
	{
		System.out.println("This is interface 2");
	}
	public void num1()
	{
		System.out.println("This is interface 1");
	}
	void num3()
	{
	    System.out.println("This is abstract class");
	}
}
