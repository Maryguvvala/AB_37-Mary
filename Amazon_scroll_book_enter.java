package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_scroll_book_enter 
{

	public static void main(String[] args)
	{
		ChromeDriver driver =new ChromeDriver ();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchDropdownBox")).click();
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Software");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		
	}

}
