package collectionprograms;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_check 
{

	public static void main(String[] args) 
	{
	ArrayList a1=new ArrayList();
	/*a1.add("Mary");
	a1.add("Kumari");
	a1.add("Guvvala");*/
	a1.add(27);
	a1.add(28);
	a1.add(30);
	a1.add(10);
	//Collections.sort(a1);
	a1.add('M');
	a1.add(true);
	a1.add(false);
	a1.add(56.66);
	a1.add("Mary");
	a1.add(null);
	a1.add(null);
	a1.add(null);
	a1.add("Mary");
	System.out.println(a1);
	System.out.println("Accepts :- Heterogeneous,Duplicate,Index,Null,Dynamic&Sort");

	}
}
