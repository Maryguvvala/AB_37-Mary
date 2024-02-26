package collectionprograms;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist_Check 
{

	public static void main(String[] args) 
	{
	LinkedList l1=new LinkedList();
	l1.add("Mary");
	l1.add("Kumari");
	l1.add(27);
	l1.add('G');
	l1.add(true);
	l1.add(null);
	l1.add(null);
	l1.add(null);
	l1.add(29);
	l1.add(27);
	l1.add(8);
	l1.add(2);
	l1.add(207);
	//Collections.sort(l1);
	System.out.println(l1);
	System.out.println("Accepts :- Heterogeneous,Duplicate,Index,Null,Dynamic&Sort");
	}

}
