package arraysprogram;//Take any alphanumeric String and find out
//which are numeric values and characters and print it

public class Assignment_79 
{

	public static void main(String[] args) 
	{
	String name="Mary123";
	char[] c1=name.toCharArray();
	for (int i=0;i<name.length();i++)
	{
		boolean answer=Character.isDigit(c1[i]);
		if(answer==true)
		{
			System.out.println(c1[i]+ "- It is a numeric value");
		}
		else
		{
			System.out.println(c1[i]+ "- It is a char");
		}
	}

	}

}
