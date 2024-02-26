package arraysprogram;//number is not present

public class Assignment_75 
{

	public static void main(String[] args) 
	{
     int number[]= {78,85,41,45};
     int a=0;
     int b=40;
     for(int i=0;i<4;i++)
      {
       if(b==number[i])
        {
         System.out.println(number[i]+" Number is present at index " + i);
         break;
        }
      }
    	 if(a==0)
    	 {
    		 System.out.println("Number is not present");
    	 }
     
	}

}
