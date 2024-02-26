package multiple_level;//Assignment 56
//child class ---> interface 3 -> interface 2 -> interface 1 
interface L1
{
	void level1();
}
interface L2 extends L1
{
	void level2();
}
interface L3 extends L2
{
	void level3();
}
public class Interface_3 implements L3
{
	public static void main(String[] args) 
	{
		Interface_3 i1=new Interface_3();
		i1.level1();
		i1.level2();
		i1.level3();
	}
	public void level3() 
	{
		System.out.println("interface 3");
	}
	public void level2() 
	{
		System.out.println("interface 2");
	}
	public void level1() 
	{
		System.out.println("interface 1");
	}
}
