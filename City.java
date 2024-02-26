package inheritance;
interface Country
{
	void countrycollection();//abstract method
}
abstract class State implements Country
{
	abstract void state_roads();//abstract method
	void statecollection()////concrete method
	{
		System.out.println("State collection for this month is :987");
	}
	static void statecollection1()////concrete method
	{
		System.out.println("State collection for this month is :988");
	}
}
public class City extends State //this class can only have concrete methods
{

	public static void main(String[] args) 
	{
		City c1=new City();
		c1.state_roads();
		c1.countrycollection();
		c1.statecollection();
		statecollection1();
	}
	public void countrycollection() 
	{
	System.out.println("Logic 1");	
	}
	void state_roads() {
		System.out.println("Logic 2");	
		
	}

}
