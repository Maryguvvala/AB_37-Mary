package multiple_level; // Assignment 50
interface state_tax
{
	void state_ittax();
	void state_gsttax();
}
interface country_tax
{
	void country_ittax();
	void country_gsttax();
}
public class Assignment_50 implements country_tax, state_tax
{
	public static void main(String[] args) 
	{
		Assignment_50 a1=new Assignment_50();
		a1.state_ittax();
		a1.state_gsttax();
		a1.country_ittax();
		a1.country_gsttax();
	}
	public void state_ittax() 
	{
		System.out.println("State IT");
	}
	public void state_gsttax() 
	{
		System.out.println("State GST");
	}
	public void country_ittax() 
	{
		System.out.println("Country IT");
	}
	public void country_gsttax() 
	{
		System.out.println("Country GST");
	}
}
