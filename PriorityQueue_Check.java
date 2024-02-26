package collectionprograms;

import java.util.PriorityQueue;

public class PriorityQueue_Check 
{

	public static void main(String[] args) 
	{
	PriorityQueue p1=new PriorityQueue();
	p1.add(27);
	p1.add(28);
	p1.add(27);
	p1.add(27);
	p1.add(30);
	p1.add(27);
	p1.add(28);
	p1.add(27);
	//p1.add(true);
	//p1.add(null);
	p1.add(27);
	p1.add(27);
	p1.add(27);
	System.out.println(p1);
	System.out.println("Accepts :- only Duplicate and Dynanmic");
	System.out.println("Doesnot accept :- Heterogeneous,Index,Null,Sort");
	
	}
}
