package arraysprogram;
//"Find out number of char and number of
//digits in below string Mary123"
public class Assignment_81 
{
	public static void main(String[] args) 
	{
	    String name = "mary123";
	
	    int characterCount = 0;
	    int digitCount = 0;
	
	    for (int i = 0; i <name.length(); i++)
	    {
	        char c1 = name.charAt(i);
	
	        if (Character.isDigit(c1)) 
	        {
	            digitCount++;
	        }
	        else 
	        {
	            characterCount++;
	        }
	    }
	
	    System.out.println("Number of characters: " + characterCount);
	    System.out.println("Number of digits: " + digitCount);
	}
}
