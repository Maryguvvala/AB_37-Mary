package selenium.jan26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobiles_xpath
{

  public static void main(String[] args) throws InterruptedException 
   {
	  ChromeDriver driver=new ChromeDriver ();
		driver.get("https://grotechminds.com/x-path/#1");
		driver.manage().window().maximize();
		WebElement product=driver.findElement(By.xpath("//span[@class='folder']"));
		product.click();
		Thread.sleep(1000);
		WebElement mobiles= driver.findElement(By.xpath("(//span[@class='folder'])[16]"));
		mobiles.click();
		Thread.sleep(1000);
		WebElement brands= driver.findElement(By.xpath("(//span[@class='folder'])[16]"));
		brands.click();
		Thread.sleep(1000);
		WebElement samsung= driver.findElement(By.xpath("(//span[@class='folder'])[16]"));
		samsung.click();
		Thread.sleep(1000);
		WebElement cost= driver.findElement(By.xpath("(//span[@class='folder'])[16]"));
		cost.click();
   }

}
