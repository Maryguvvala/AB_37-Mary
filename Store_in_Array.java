package selenium.programs;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;

public class Store_in_Array 
{

    public static void main(String[] args) 
    {
    	ChromeDriver c1=new ChromeDriver();
    	c1.get("https://www.flipkart.com");
    	c1.manage().window().maximize();
    	String title = c1.getTitle();
    	System.out.println("Title - "+title);
    	
    	String words [] = title.split(" ");
    	 // System.out.println(Arrays.toString(words));
    	for (int i=0;i<words.length;i++)
    	{
    	System.out.println("word "+i+ " - "+words[i]);
    	
    	}
    
     }  
}
    		
 	
		
	
   
  

