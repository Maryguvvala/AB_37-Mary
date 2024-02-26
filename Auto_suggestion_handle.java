package selenium.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestion_handle
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement search=driver.findElement(By.name("q"));
        search.sendKeys("india");
        Thread.sleep(2000);
        List<WebElement> results=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
        int auto_count=results.size();
        System.out.println(auto_count);
        results.get(auto_count-5).click();
	
	
	}

}
