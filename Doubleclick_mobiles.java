package selenium.jan26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick_mobiles 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement mobiles= driver.findElement(By.linkText("Mobiles"));
        Actions a1 = new Actions(driver);
        a1.doubleClick(mobiles).perform();

	}

}
