package arraysprogram;

public class Assignment_76 
{
	public static void main(String[] args)
	{
	    int[] numbers = {10, 20, 30, 41, 50};
	    int a = 41;
	    int index = -1; 
	    for (int i = 0; i < numbers.length; i++) 
	    {
	        if (a==numbers[i])
	        {
	            index = i;
	        }
	    }
	
	    if (index != -1)
	    {
	        System.out.println("Index of " + a + ": " + index);
	    } 
	    else 
	    {
	        System.out.println(a + " not found in the array.");
	    }
	}
}	




