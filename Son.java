package hierarchical1;

class Daughter extends Parent
{
     static void add()
     {
	 System.out.println("Add");
     }
}

class Parent
{
	 static void subtract()
	 {
		 System.out.println("Subtract");
	 }
}

public class Son extends Parent
{

	 static void multiply()
	 {
		 System.out.println("Multiply");
	 }
	public static void main(String[] args) 
	{
	subtract();
	multiply();
	}
}
