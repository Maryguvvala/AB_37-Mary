package variables;

public class This_Key //this keyword assigns local variable to global variable
{
    int age;
    String name;
    double salary;
    
    void details(int age, String name, double salary)
    {
    	this.age=age;
    	this.name=name;
    	this.salary=salary;
    	System.out.println("Details are:");
    }
    
	public static void main(String[] args) 
	{
		This_Key t1=new This_Key();
		t1.details(27,"Mary" , 10000.86);
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.salary);

	}

}
