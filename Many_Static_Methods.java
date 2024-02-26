package ifstatements;

public class Many_Static_Methods 
{
    static void letter()
    {
    	char a='Y';
    	System.out.println(a);
    }
    static void letter1()
    {
    	char a='A';
    	System.out.println(a);
    }
	public static void main(String[] args) 
	{
     letter3();
     letter1();
     letter4();
     letter();

	}
    static void letter3()
    {
    	char a='M';
    	System.out.println(a);
    }
    static void letter4()
    {
    	char a='R';
    	System.out.println(a);
    }
}
