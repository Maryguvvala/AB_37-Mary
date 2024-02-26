package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_syntax_fb_login 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("twinklemary07@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("mary123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
