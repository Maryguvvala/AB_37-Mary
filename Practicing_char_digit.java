package arraysprogram;

public class Practicing_char_digit 
{

	public static void main(String[] args)
	{
		int count_char=0;
		int count_digit=0;
		String name= "Mary123";
		char[]c1=name.toCharArray();
	
		/*for (int i=0;i<c1.length;i++) //for finding the index 
		
		{
			System.out.println("Index of "+c1[i]+" is "+ i);
		}*/
		for (int i=0;i<c1.length;i++)
		{
			boolean answer=Character.isDigit(c1[i]);
			if(answer==true)
		{
			//System.out.println(c1[i]+" It is a digit");
			count_digit++;
		}
		else
		{
			//System.out.println(c1[i]+" It is a char");
			count_char++;
		}
	    }
			System.out.println("Number of char present: "+count_char++);
			System.out.println("Number of digit present: "+count_digit++);
	

	}

	}
