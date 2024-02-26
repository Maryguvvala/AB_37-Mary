package typecasting;
class Grandparent
{
	void num()
	{
		System.out.println("0");
	}
}
class Parent extends Grandparent
{
	void num1() 
	{
		System.out.println("1");
	}
}
public class Problem_2 extends Parent
{
	void num2()
	{
		System.out.println("2");
	}
	public static void main(String[] args)
	{
	Grandparent g1=new	Problem_2();//upcatsing
	g1.num();
    Problem_2 p1=(Problem_2)g1;//downcasting
    p1.num();
    p1.num1();
    p1.num2();
	}
}
