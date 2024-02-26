package practice_feb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Goibiobo_test 
{
	public static void main(String[] args) 
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.goibibo.com/");
	driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
	driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    WebElement from_box =  driver.findElement(By.xpath("(//p[.='Enter city or airport'])[1]"));
    from_box.click();
    WebElement type = driver.findElement(By.xpath("//input[@type='text']"));
    type.sendKeys("bengaluru");
	List<WebElement> auto = driver.findElements(By.xpath("//div[@class='sc-12foipm-37 lfkrPI']/ul/li"));
	int count = auto.size();
	System.out.println(count);
	auto.get(count-10).click();
    WebElement typenext = driver.findElement(By.xpath("//input[@type='text']"));
    typenext.sendKeys("del");
    List<WebElement> auto1 = driver.findElements(By.xpath("//div[@class='sc-12foipm-37 lfkrPI']/ul/li"));
    int count1=auto1.size();
    auto1.get(count1-10).click();
    WebElement date = driver.findElement(By.xpath("(//p[@class='fsw__date'])[10]"));
	date.click();
	WebElement done1 = driver.findElement(By.xpath("//span[@class='fswTrvl__done']"));
    done1.click();
    WebElement done2 = driver.findElement(By.xpath("//a[@class='sc-12foipm-77 jYnAuG']"));
    done2.click();
    WebElement search = driver.findElement(By.xpath("//span[.='SEARCH FLIGHTS']"));
    search.click();
	}

}
