package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Mary@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Mary@123");
		driver.findElement(By.name("login")).click();

	}

}
