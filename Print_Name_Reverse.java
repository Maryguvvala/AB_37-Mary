package arraysprogram;

public class Print_Name_Reverse 
{

	public static void main(String[] args)
	{
	/*String name="mary";//vertical
	for (int i=name.indexOf("y");i>=0;i--)// can also write i=3
	{
		System.out.println(name.charAt(i));
	}
	for (int i=name.indexOf("y");i>=0;i--)//one way
	{
		System.out.print(name.charAt(i));
	}*/
	String input="mary";//second and practical way
	String output="";
	for (int i=input.length()-1;i>=0;i--)
	{
		char reverse=input.charAt(i);
		output=output+reverse;
	}
	System.out.println(output);
	}

}
