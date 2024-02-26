package collectionprograms;

//import java.util.Collections;
import java.util.TreeSet;

public class TreeSet_Check 
{

	public static void main(String[] args) 
	{
	TreeSet t1=new TreeSet();
	t1.add(27);
	t1.add(5);
	t1.add(10);
	t1.add(27);
	//t1.add("Mary");
	//.add('G');
	//t1.add(null);
	System.out.println(t1);
	System.out.println("Accepts :- only Dynamic");
	System.out.println("Doesnot accept :- Heterogeneous,Duplicate,Index,Null,Sort");
	}

}
