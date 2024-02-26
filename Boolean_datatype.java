package get_set_methods;

public class Boolean_datatype
{

	private boolean Answer = true;
	
	public boolean getAnswer()
	{
		return Answer;
	}
	
	public void setAnswer(boolean Answer)
	{
		this.Answer=Answer;
	}
	public static void main(String[] args) 
	{
		Boolean_datatype b1=new Boolean_datatype();
		System.out.println("Original Answer - "+ b1.Answer);
		b1.setAnswer(false);
		System.out.println("Modified Answer - "+ b1.getAnswer());
	}

}
