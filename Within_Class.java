package access_specifier;//Assignment 57

public class Within_Class 
{

	public static void add()
	{
		System.out.println("Access Specifier - Public");
	}
	private static void subtract()
	{
		System.out.println("Access Specifier - Private");
	}
	protected static void multiply()
	{
		System.out.println("Access Specifier - Protected");
	}
	static void divide()
	{
		System.out.println("Access Specifier - Package/Default");
	}
		
	public static void main(String[] args) 
	{
	add();
	subtract();
	multiply();
	divide();
	}
}
