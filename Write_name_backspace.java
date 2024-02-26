package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write_name_backspace 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.id("fname")).sendKeys("Mary kumari"); 
		//driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("fname")).sendKeys(Keys.DELETE);

	}

}
