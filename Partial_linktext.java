package selenium.programs;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_linktext 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
        String link[]= new String[3];
               link[0]="Arab";
               link[1]="United Kingd";
               link[2]="States";
               for (int i=0;i<3;i++)
               {
            	driver.get("https://www.amazon.in");
		        driver.findElement(By.partialLinkText(link[i])).click();
               }
		
	}

}
