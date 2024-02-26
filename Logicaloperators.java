package ifstatements;

public class Logicaloperators //both conditions should be true

{

	public static void main(String[] args) 
	{
		int a=6;
		int b=10;
		if (a>10 && b==10)
		{
			System.out.println("logical operator");
		}
		if (a>5 && b>11)
		{
			System.out.println("not logical operator");
		}
		if (a>5 && b==10)
		{
			System.out.println("correct logical operator");
		}
		if (a>5 || b!=10)// Any of the condition is true
		{
			System.out.println("print OR operator");
		}
		if (a!=6 || b!=10)
		{
			System.out.println("dont print or operator");
		}
		if (!(a>7 && b>9))//will get reverse answer
		{
			System.out.println("And with NOT operator");
		}
		if (!(a<5 || b<12))
		{
			System.out.println("OR with NOT operator");
		}
		
		
	

	}

}
