package inheritance;
class One1
{
	One1()
	{
		System.out.println("1");
	}
}
class Two1 extends One1
{
	Two1()
	{
		System.out.println("2");
	}
}

public class Super_calling extends Two1
{
	Super_calling()
	{
		System.out.println("3");
	}

	public static void main(String[] args) 
	{
		new Super_calling();
		//new One1();
	    //new Two1();
	}
	

}
