package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Username_ID 
{

	public static void main(String[] args)
	{
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://grotechminds.com/registration/");
        c1.findElement(By.id("Username")).sendKeys("Mary@123");
        c1.findElement(By.id("fname")).sendKeys("Mary");
        c1.findElement(By.id("lname")).sendKeys("Kumari");
	}

}
