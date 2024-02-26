package selenium.jan26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_popup
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
        WebElement choosefile=driver.findElement(By.id("Resume"));
	    choosefile.sendKeys("C:\\Users\\KING\\Desktop\\windows pop up handling.pdf");
	
	}

}
