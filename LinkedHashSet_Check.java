package collectionprograms;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSet_Check 
{

   public static void main(String[] args) 
	{
	LinkedHashSet l1=new LinkedHashSet();
	l1.add("Mary");
	l1.add('G');
	l1.add(true);
	l1.add(null);
	l1.add(null);
	l1.add("Mary");
	l1.add(27);
	l1.add(20);
	l1.add(88);
	l1.add(null);
    //Collections.sort(l1);
	System.out.println(l1);
	System.out.println("Accepts :- Heterogeneous,Index,Null,Dynamic");
    System.out.println("Doesnot accept :- Duplicate,Sort");

	}

}
