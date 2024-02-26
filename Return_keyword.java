package collectionprograms;

public class Return_keyword 
{
    int add(int a, int b)
    {
    	int sum=a+b;
    	return sum;
    }
    double subtract(int a, double b)
    {
    	double subtract=a-b;
    	return subtract;
    }
	public static void main(String[] args)
	{
		Return_keyword r1=new Return_keyword();
		System.out.println(r1.add(10, 20));
		System.out.println(r1.subtract(54, 88.55));
	}

}
