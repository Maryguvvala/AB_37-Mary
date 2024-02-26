package selenium.jan26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clothes_xpath {

  public static void main(String[] args) throws InterruptedException
   {
	ChromeDriver driver=new ChromeDriver ();
	driver.get("https://grotechminds.com/x-path/#1");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement product=driver.findElement(By.xpath("//span[@class='folder']"));
	product.click();
	Thread.sleep(1000);
	WebElement clothes=driver.findElement(By.xpath("(//span[@class='folder'])[24]"));
	Thread.sleep(5000);
	clothes.click();
	Thread.sleep(1000);
	WebElement tshirt=driver.findElement(By.xpath("(//span[@class='folder'])[28]]"));
	tshirt.click();
	Thread.sleep(1000);
	WebElement women=driver.findElement(By.xpath("(//span[@class='folder'])[29]"));
	women.click();
	
   }

}
