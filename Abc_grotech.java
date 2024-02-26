package get_set_methods;

public class Abc_grotech 
{
  
	private String Username = "abc@grotechminds.com";
	
	public String getUsername()
	{
		return Username;
	}
	
	public void setUsername(String Username)
	{
		this.Username=Username;
	}
	public static void main(String[] args) 
	{
		Abc_grotech a1=new Abc_grotech();
		System.out.println("Original Username - "+a1.Username);
		a1.setUsername("mary@gmail.com");
		System.out.println("Modified Username - "+ a1.getUsername());
	}

}
