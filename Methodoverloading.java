package ifstatements;
public class Methodoverloading //3static & 2static 
{	
	static void add(int a)
	{
		System.out.println(a+7);
	}
    static void add(double a)
    {
    	System.out.println(a);
    }
    static void add(char a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		add (100);
		add (54.45);
		add('M');
		Methodoverloading m1= new Methodoverloading();
		m1.add(true);
		m1.add("Mary");
	}
	void add(boolean a)
	{
		System.out.println(a);
	}
    void add(String a)
    {
    	System.out.println(a);
    }
}
