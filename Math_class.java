package typecasting;

public class Math_class 
{

	public static void main(String[] args) 
	{
	
	int answer=Math.addExact(10, 20);
	System.out.println(answer);
    int answer1=Math.subtractExact(10, 20);
    System.out.println(answer1);
    int a=Math.multiplyExact(answer, answer1);
    System.out.println(a);
    double a1=Math.PI;
    System.out.println(a1);
    System.out.println(Math.random());
    {
    for(int i=0;i<=10;i++)
    {
    	System.out.println(Math.random());
    }
    }
	}

}
