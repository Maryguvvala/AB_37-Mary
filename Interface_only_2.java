package multiple_level; //Assignment 52

    interface one
    {
    	void add();
    }
    interface two
    {
    	void subtract();
    }
public class Interface_only_2 implements two,one
    {
	public static void main(String[] args) 
	{
		Interface_only_2 i1=new Interface_only_2();
		i1.add();
		i1.subtract();
	}

	public void subtract() 
	{
     System.out.println("Subtraction");
		
	}

	public void add()
	{
		System.out.println("Addition");
	}
}
