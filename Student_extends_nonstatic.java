package inheritance;

class Teacher_nonstatic 
{
	 void selenium()
	   {
		   System.out.println("Selenium");
	   }
	 void java()
	   {
		   System.out.println("Java");
	   }
}

public class Student_extends_nonstatic extends Teacher_nonstatic
{
	 static void gk()
	    {
	    	System.out.println("General Knowledge");
	    }
	public static void main(String[] args) 
	{
	 Student_extends_nonstatic s1=new Student_extends_nonstatic();
	  s1.selenium();
	  s1.java();
	  gk();
	}
}
