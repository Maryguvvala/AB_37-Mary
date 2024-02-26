package practice_feb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_up_down
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    /*WebElement country_canada = driver.findElement(By.linkText("Canada"));
	    Point location = country_canada.getLocation();
	    int x = location.getX();
        int y = location.getY();*/
        JavascriptExecutor jse = driver;
        //jse.executeScript("window.scrollBy(0,"+y+")");
        jse.executeScript("window.scrollBy(0,5000)");
        Thread.sleep(5000);
        jse.executeScript("window.scrollBy(0,-5000)");
        
        
        
	}

}
