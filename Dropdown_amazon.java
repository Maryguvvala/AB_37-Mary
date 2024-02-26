package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_amazon
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement category_dd=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(category_dd);
		s1.selectByValue("search-alias=amazon-pharmacy");
		s1.selectByValue("search-alias=collectibles");
		s1.selectByVisibleText("Computers & Accessories");
		s1.selectByVisibleText("Home & Kitchen");
		s1.selectByIndex(1);
		s1.selectByIndex(4);
	}

}
