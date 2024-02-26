package access_specifier;

public class AS_2 
{
	public void add()
	{
		System.out.println("AS- Public");
	}
	protected void subtract()
	{
		System.out.println("AS-Protected");
	}
	private void multiply()
	{
		System.out.println("AS-Private");
	}
    void divide()
	{
	    System.out.println("AS-Package/default");
	}
}

