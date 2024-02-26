package multiple_level;//Assignment 53
// 4 interface and 1 class
interface level1
{
	void add();
}
interface level2
{
	void subtract();
}
interface level3
{
	void multiply();
}
interface level4
{
	void divide();
}
public class Interface_4 implements level1,level2,level3,level4
{
	public static void main(String[] args) 
	{
		Interface_4 i1=new Interface_4();
		i1.add();
		i1.subtract();
		i1.multiply();
		i1.divide();
	}
	public void divide() 
	{
	System.out.println("Divide");
	}
	public void multiply() 
	{
		System.out.println("multiply");
	}
	public void subtract() 
	{
		System.out.println("Subtract");
	}
	public void add() 
	{
		System.out.println("Add");
	}
}
