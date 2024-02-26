package get_set_methods;

public class Double_datatype 
{

	private double Weight=50.55;
	
	public double getWeight()
	{
		return Weight;
	}
	
	public void setWeight(double Weight)
	{
		this.Weight=Weight;
	}
	public static void main(String[] args)
	{
	    Double_datatype d1= new  Double_datatype();
		System.out.println("Original Weight - "+ d1.Weight);
		d1.setWeight(99.55);
		System.out.println("Modified Weight - "+ d1.getWeight());

	}

}
