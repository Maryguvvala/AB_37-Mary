package get_set_methods;

public class String_datatype 
{
	private String Username ="Mary";
	

	public String getUsername() 
	{
		return Username;
	}


	public void setUsername(String username)
	{
		this.Username = username;
	}

	public static void main(String[] args) 
	{
	String_datatype s1=new String_datatype();
	System.out.println("Original Username - "+ s1.Username);
	s1.setUsername("Mary Kumari");
	s1.getUsername();
    System.out.println("Modified Username - "+s1.getUsername());
	}

}
