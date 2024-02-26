package practice_feb;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube_scroll
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/");
		driver.manage().window().maximize();
		JavascriptExecutor jse = driver;
		for (int i=0; i<2; i--)
		{
			jse.executeScript("window.scrollBy(0,2000)");
			Thread.sleep(5000);
		}

	}

}
