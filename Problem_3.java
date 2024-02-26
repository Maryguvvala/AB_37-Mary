package typecasting;
class Grandparent1
{
	void num() 
	{
		System.out.println("0");
	}
}
class Parent1 extends Grandparent1
{
	void num1()
	{
		System.out.println("1");
	}
}
public class Problem_3 extends Parent1
{
	void num2()
	{
		System.out.println("2");
	}
	public static void main(String[] args) 
	{
		Parent1 g1=new Problem_3();//upcasting
		g1.num1();
		g1.num();
		Problem_3 p1=(Problem_3)g1;//downcasting
		p1.num();
		p1.num1();
		p1.num2();
	}
}
