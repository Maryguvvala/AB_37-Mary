package arraysprogram;
//Take any alphanumeric String and check at 
//which position there is numeric value
public class Assignment_80 
{

	public static void main(String[] args) 
	{
     String name="Mary123";
     char [] c1=name.toCharArray();
     for(int i=0;i<name.length();i++)
     {
    	 boolean answer=Character.isDigit(c1[i]);
    	 if (answer==true)
    	 {
    		 System.out.println("The numeric value is at index: "+i);
    	 }
     }
	}

}
