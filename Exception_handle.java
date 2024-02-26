package selenium.jan26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception_handle
{

	public static void main(String[] args) 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/KING/Desktop/xpath.html");
		driver.manage().window().maximize();
		WebElement disabled=driver.findElement(By.id("121"));//disabled
		disabled.sendKeys("Mary");
	}

}
