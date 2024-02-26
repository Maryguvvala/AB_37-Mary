package selenium.jan26;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Move_control_amazon
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("shoes");	
        search.sendKeys(Keys.ENTER);
        WebElement shoes= driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
        shoes.click();
        Set<String> id=driver.getWindowHandles();
        Iterator<String> pcid=id.iterator();
        String p_id=pcid.next();
        String c_id=pcid.next();
        System.out.println(p_id);
        System.out.println(c_id);
        driver.switchTo().window(c_id);
        WebElement addtocart=driver.findElement(By.id("add-to-cart-button"));
        addtocart.click();
        
	}

}
