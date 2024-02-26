package collectionprograms;

import java.util.HashSet;

public class HashSet_Check 
{

	public static void main(String[] args) 
	{
	HashSet h1=new HashSet();
	h1.add(45);
	h1.add(27);
	h1.add(40);
	h1.add(51);
	h1.add(28);
	h1.add("Mary");
	h1.add('G');
	h1.add(28);
	h1.add(null);
	h1.add(null);
    System.out.println(h1);	
    System.out.println("Accepts :- Heterogeneous,Null,Dynamic");
    System.out.println("Doesnot accept :- Duplicate,Index,Sort");
	}

}
