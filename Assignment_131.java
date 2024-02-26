package practice_feb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_131 
{

	public static void main(String[] args) 
	{

		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        WebElement search=driver.findElement(By.xpath("//div[.='Fashion']"));
        Actions a1=new Actions(driver);
        a1.moveToElement(search).perform();
        WebElement tshirt=driver.findElement(By.linkText("Men's T-Shirts"));
        tshirt.click();
	}

}
