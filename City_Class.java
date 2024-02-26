package inheritance;
//multiple level inheritance from interface 
interface State_tax
{
	void state_ittax();
	void state_gsttax();
}
interface Country_tax
{
	void country_ittax();
	void country_gsttax();
}
public class City_Class implements State_tax,Country_tax
{

	public static void main(String[] args) 
	{
		City_Class c1=new City_Class();
		c1.country_gsttax();
		c1.country_ittax();
		c1.state_gsttax();
		c1.state_ittax();
	}

	
	public void country_ittax() 
	{
     System.out.println("1");	
	}

	public void country_gsttax() 
	{
     System.out.println("2");		
	}
	
	public void state_ittax()
	{
	 System.out.println("3");
	}

	public void state_gsttax()
	{
     System.out.println("4");		
	}

}
