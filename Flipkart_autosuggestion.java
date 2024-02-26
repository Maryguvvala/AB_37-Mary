package practice_feb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_autosuggestion 
{
  public static void main(String[] args) throws InterruptedException 
   {
	ChromeDriver driver=new ChromeDriver ();
	driver.navigate().to("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement search= driver.findElement(By.xpath("//input[@class='Pke_EE']"));
    search.sendKeys("books");
    Thread.sleep(2000);
    List<WebElement> total= driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
    int auto_count= total.size();
    System.out.println(auto_count);
    total.get(auto_count-7).click();
   }

}
