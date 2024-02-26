package get_set_methods;

public class Char_datatype 
{
	private char Letter = 'M';
	
	public char getLetter()
	{
		return Letter;
	}
	
	public void setLetter(char Letter)
	{
		this.Letter=Letter;
	}

	public static void main(String[] args) 
	{
		Char_datatype c1=new Char_datatype();
		System.out.println("Original Letter - "+ c1.Letter);
		c1.setLetter('G');
		System.out.println("Modified Letter - "+ c1.getLetter());

	}

}
