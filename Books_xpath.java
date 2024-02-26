package selenium.jan26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Books_xpath {
 public static void main(String[] args) throws InterruptedException
 {
	ChromeDriver driver=new ChromeDriver ();
	driver.get("https://grotechminds.com/x-path/#1");
	driver.manage().window().maximize();
    WebElement product=driver.findElement(By.xpath("//span[@class='folder']"));
    product.click();
    WebElement books=driver.findElement(By.xpath("(//span[@class='folder'])[1]"));
    books.click();
    Thread.sleep(1000);
    WebElement engineernbooks=driver.findElement(By.xpath("(//span[@class='folder'])[1]"));
    engineernbooks.click();
    Thread.sleep(1000);
    WebElement computerscience=driver.findElement(By.xpath("(//span[@class='folder'])[2]"));
    computerscience.click();
    Thread.sleep(1000);
    WebElement software=driver.findElement(By.xpath("(//span[@class='folder'])[2]"));
    software.click(); 
    Thread.sleep(1000);
    WebElement frontend=driver.findElement(By.xpath("(//span[@class='folder'])[2]"));
    frontend.click();
    Thread.sleep(1000);
    WebElement automation=driver.findElement(By.xpath("(//span[@class='folder'])[2]"));
    automation.click();
    Thread.sleep(1000);
    WebElement using_selenium=driver.findElement(By.xpath("(//span[@class='folder'])[2]"));
    using_selenium.click();
 }

}
