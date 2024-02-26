package arraysprogram;//exam

public class Check_my_name
{

	public static void main(String[] args) 
	{
		String input = "mary";
		String output="";
		char [] c1= input.toCharArray();
		for (int i=input.length()-1; i>=0;i--)
		{
			char reverse =input.charAt(i);
			output = output+reverse;
			
		}
			System.out.println(output);	

		if(input.equals(output))	
		{
			System.out.println("it is a palindrome");
		}
		else
		{
			System.out.println("it is not a Palindrome");
		}
			
	}

}
