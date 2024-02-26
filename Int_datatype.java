package get_set_methods;

public class Int_datatype 
{
    private int age = 16;
    
    public int getAge()
    {
    	return age;
    }
    
    public void setAge(int age)
    {
    	this.age=age;
    }
    
	public static void main(String[] args)
	{
		Int_datatype i1=new Int_datatype();
		System.out.println("Original Age - "+i1.age);
		i1.setAge(27);
		i1.getAge();
		System.out.println("Modified Age - "+i1.getAge());

	}

}
