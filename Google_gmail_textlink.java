package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_gmail_textlink 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.partialLinkText("Gma")).click();
	}

}
