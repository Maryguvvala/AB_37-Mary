package practice_feb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_mouse_autosuggestion 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver ();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
	    search.sendKeys("mouse");
	    Thread.sleep(2000);
	    List<WebElement> mouse=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	    int count=mouse.size();
	    System.out.println(count);
	    mouse.get(count-6).click();
	}

}
