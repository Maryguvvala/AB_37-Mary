package multiple_level; // Assignment 49

interface Amazon
{
	void login();
	void logout();
}

public class Assignment_49 implements Amazon
{

	public static void main(String[] args)
	{
		Assignment_49 a1=new Assignment_49();
		a1.login();
		a1.logout();

	}

	public void login() 
	{
	System.out.println("Login Page");
	}

	public void logout()
	{
	System.out.println("Logout Page");
	}

}
