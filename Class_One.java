package inheritance;
// multi level inheritance with all non static
class Two extends Three 
{
	 void add()
	{
	System.out.println("Add");	
	}
     
}
class Three
{
	 void subtract()
	{
		System.out.println("Subtract");
	}
}

public class Class_One extends Two
{
     void multiply()
    {
    	System.out.println("Multiply");
    }
	public static void main(String[] args) 
	{
		Class_One c1=new Class_One();
		c1.multiply();
		c1.add();
		c1.subtract();
	}
}
