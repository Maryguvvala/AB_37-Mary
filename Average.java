package arraysprogram; //Assignment 66

public class Average 
{

	public static void main(String[] args) 
	{
	int num[]=new int[4];
	num[0]=15;
	num[1]=22;
	num[2]=70;
	num[3]=26;
	int sum=0;
	for (int i=0;i<num.length;i++)
	{
		sum = sum+num[i];
	}
	System.out.println("Sum is: " +sum);
	double average= (double)sum/num.length;
	System.out.println("Average is: " +average);
	double remainder= (double)sum % num.length;
	System.out.println("Remainder is: " +remainder);
	}

}
