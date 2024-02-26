package typecasting;

public class Assignment_94 
{

	public static void main(String[] args)
	{
	double pi=Math.PI;
	for (int i=1;i<=10;i++)
	{
	double r=Math.random();
	double areaofcircle = pi*r*r;
	System.out.println(i+ " r= "+r+ "  Area= "+areaofcircle);
	}

	}
}
