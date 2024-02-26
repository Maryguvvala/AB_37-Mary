package practice_feb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_132 
{

	public static void main(String[] args) throws InterruptedException 
	{
	    ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement drag=driver.findElement(By.id("drag7"));
        WebElement drop=driver.findElement(By.id("div2"));
        Actions a1=new Actions(driver);
        a1.dragAndDrop(drag, drop).perform();
	}

}
