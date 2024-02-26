package typecasting;

class Up_casting
{
	void datafetching()
	{
		System.out.println("1");
	}
}

public class Problem_1 extends Up_casting
{
	void logintologout()
	{
		System.out.println("2");
	}
	public static void main(String[] args) 
	{
      Up_casting u1 =new Problem_1();//Upcasting
      u1.datafetching();
      Problem_1 p1=(Problem_1)u1;//downcasting
      p1.logintologout();
    
	}

}
