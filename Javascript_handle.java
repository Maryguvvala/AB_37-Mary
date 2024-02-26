package selenium.jan26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_handle 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/KING/Desktop/xpath.html");
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.manage().window().maximize();
		WebElement firstname=	driver.findElement(By.id("1"));
		firstname.sendKeys("Manish");
	
	}

}
