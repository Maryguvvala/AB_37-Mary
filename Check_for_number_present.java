package arraysprogram;

public class Check_for_number_present 
{

	public static void main(String[] args) 
	{
		/*int number[]= {78,89,100,41};
		int tocheck=41;
		for (int i=0;i<=3;i++)
		{
			if (tocheck==number[i])
			{
				System.out.println("number is present at index " +i);
			}
			else
			{
				System.out.println("number is not present at index " +i);
			}
		}*/
		
       int number1[]= {18,58,94,41};
       int a= 0;
       int b=40;
       for (int i=0; i<number1.length;i++)
       {
    	   if (b==number1[i])
    	   {
    		   System.out.println(number1[i]+" Number is present at index "+i);
    	       a++;
    	   }
       }
       
    	   if(a==0)
    	   {
    		System.out.println("Number is not present");   
    	   }
       

	}
}


