package collectionprograms;

import java.util.Collections;
import java.util.Vector;

public class Vector_Check
{

  public static void main(String[] args) 
   {
	Vector v1=new Vector();
	v1.add("Mary");
	v1.add('M');
	//v1.add(true);
	v1.add(55);
	v1.add(null);
	v1.add(27);
	v1.add(24);
	v1.add(20);
	v1.add(20.5);
	v1.add("Mary");
	v1.add("Mary");
	v1.add(null);
    v1.add(null);
    //Collections.sort(v1);
	System.out.println(v1);
	System.out.println("Accepts :- Heterogeneous,Duplicate,Index,Null,Dynamic&Sort");

	}

}
