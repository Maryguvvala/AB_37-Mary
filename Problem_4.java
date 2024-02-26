package typecasting;
class Name3{
	void num3(){
		System.out.println("3");
	}
}
class Name2 extends Name3{
	void num2(){
		System.out.println("2");
	}
}
class Name1 extends Name2{
	void num1(){
		System.out.println("1");
	}
}
public class Problem_4 extends Name1{
	void num4()
	{
		System.out.println("4");
	}
	public static void main(String[] args) 
	{
	Name2 n1=new Name1();//upcasting
	n1.num2();
	n1.num3();
	Name1 n2=(Name1)n1;//downcasting
	n2.num1();
	n2.num2();
	n2.num3();
	}
}
