package arraysprogram;//Assignment 71

import java.util.Date;

public class Date_Time 
{

	public static void main(String[] args) 
	{
	Date d1=new Date();
	System.out.println(d1.getTime());
	Date d2=new Date (d1.getTime()+(1000*60*60*24*1));
	System.out.println(d2);
	String mydate=d2.toString();
	System.out.println(mydate);
	String day=mydate.substring(0, 4);
	System.out.println("Day: "+day);
	String month=mydate.substring(4, 7);
	System.out.println("Month: " +month);
	String date=mydate.substring(8, 10);
	System.out.println("Date: "+date);
	String time=mydate.substring(11, 19);
	System.out.println("Time: "+time);
	String year=mydate.substring(24);
	System.out.println("Year: "+year);
	System.out.println(date.concat("/").concat(month).concat("/").concat(year));
	
	
	
	}

}
