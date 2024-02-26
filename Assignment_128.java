package practice_feb;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_128
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("shoes");	
        search.sendKeys(Keys.ENTER);
        WebElement shoe=driver.findElement(By.xpath("(//img[@class='s-image'])[30]"));
        shoe.click();
        Set<String> id=driver.getWindowHandles();
        Iterator<String> pcid= id.iterator();
        String p_id =pcid.next();
        String c_id=pcid.next();
        driver.switchTo().window(c_id);
        WebElement addtocart=driver.findElement(By.id("add-to-cart-button"));
        addtocart.click();

	}

}
