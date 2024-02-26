package get_set_methods;

public class Float_datatype
{
 
	private float Number = 45.6f;
	
	public float getNumber()
	{
		return Number;
	}
	
	public void setNumber (float Number)
	{
		this.Number=Number;
	}
	
	public static void main(String[] args) 
	{
		Float_datatype f1=new Float_datatype();
		System.out.println("Original Number - "+ f1.Number);
        f1.setNumber(100.5f);
        System.out.println("Modified Number - "+ f1.getNumber());
	}

}
