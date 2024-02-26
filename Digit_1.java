package arraysprogram;

public class Digit_1 
{

	public static void main(String[] args) 
	{
	String name="Mary123";
	char c1[]=name.toCharArray();
    for (int i=0;i<name.length();i++)
    {
    	boolean answer= Character.isDigit(c1[i]);
    	System.out.println(answer);
    }
    for (int i=0;i<name.length();i++)
    {
    	boolean answer= Character.isDigit(c1[i]);
    	if(answer==true)
    	{
    		System.out.println(c1[i]+ " - It is a Digit:"+answer);
    	}
    	else
    	{
    	System.out.println(c1[i]+ " - It is a Char:"+answer);
    	}
    
    }
               
    for (int i=0;i<name.length();i++)
    {
    	boolean answer= Character.isDigit(c1[i]);
    	if(answer==true)
    	{
    		System.out.println(c1[i]+ " - It is a Digit");
    	}
    	else
    	{
    	System.out.println(c1[i]+ " - It is a Char");
    	}
    
    }
	}

}
