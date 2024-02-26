package multiple_level; //Assignment 51
interface country
{
	void countrycollection();
}
abstract class state implements country
{
	abstract void stateroad();
	void statecollection()
	{
		System.out.println("1000");
	}
}
public class Assignment_51 extends state
{
	public static void main(String[] args) 
	{
		Assignment_51 a1=new Assignment_51();
		a1.countrycollection();
		a1.stateroad();
		a1.statecollection();
	}
	public void countrycollection()
	{
		System.out.println("Country Collection");
	}
	void stateroad() 
	{
		System.out.println("State Road");
	}
}
