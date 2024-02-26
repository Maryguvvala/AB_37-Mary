package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xpath 
{

	public static void main(String[] args) 
	{
	ChromeDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/KING/Desktop/xpath.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(html/body/input)[1]")).sendKeys("Mary");
	driver.findElement(By.xpath("(html/body/input)[2]")).sendKeys("Hello");
	driver.findElement(By.xpath("(html/body/input)[3]")).sendKeys("Mary@123");
	driver.findElement(By.xpath("((html/body/form)[1]/input)[1]")).sendKeys("Mary");
	//driver.findElement(By.xpath("((html/body/form)[1]/input)[2]")).sendKeys("Kumari");//disabled
	//driver.findElement(By.xpath("((html/body/form)[1]/input)[3]")).click();//submit
	driver.findElement(By.xpath("((html/body/form)[2]/input)[1]")).click();
	driver.findElement(By.xpath("((html/body/form)[2]/input)[2]")).click();
	driver.findElement(By.xpath("((html/body/form)[2]/input)[3]")).click();
	//driver.findElement(By.xpath("((html/body/form)[2]/input)[4]")).click();//submit
	driver.findElement(By.xpath("(html/body/input)[4]")).click();
	driver.findElement(By.xpath("(html/body/input)[5]")).click();
	driver.findElement(By.xpath("(html/body/input)[6]")).click();
	//driver.findElement(By.tagName("a")).click();
		
	}

}
