package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_india_enter 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//driver.findElement(By.className("gLFyf")).sendKeys("india");
		//driver.findElement(By.name("q")).sendKeys("India");
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		WebElement googlesearch_tf=driver.findElement(By.name("q"));
		googlesearch_tf.sendKeys("india");
		googlesearch_tf.sendKeys(Keys.ENTER);
	}

}
