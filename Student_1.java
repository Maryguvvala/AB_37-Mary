package inheritance;

class Teacher_1
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
public class Student_1 extends Teacher_1
{
	  void gk()
	    {
	    	System.out.println("General Knowledge");
	    }

	public static void main(String[] args) 
	{
		Student_1 s1=new Student_1();
		s1.gk();
		s1.selenium();
		s1.java();
	}
}
