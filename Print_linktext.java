package selenium.jan26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_linktext 
{

	public static void main(String[] args) 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		List<WebElement> links= driver.findElements(By.tagName("a"));
        //System.out.println("Number of links present are: "+links.size());
        for (int i=0; i<links.size();i++)
        {
        	WebElement a   =  links.get(i);
            String linktext=a.getText();
        	System.out.println(linktext);
        }
	}

}
