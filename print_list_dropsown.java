package practice_feb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class print_list_dropsown 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement skill=driver.findElement(By.id("Skills"));
		String printnames=skill.getText();
		System.out.println("options in skill list are:");
		System.out.println(printnames);
		/*Select s1= new Select(skill);
		List<WebElement> list=s1.getOptions(); //to get total num
		System.out.println("number of skill list- "+list.size());*/
		
		WebElement country=driver.findElement(By.id("Country"));
		String countrynames=country.getText();
		System.out.println("options in country list are:");
		System.out.println(countrynames);
		/*Select s2= new Select(country);
		List<WebElement> list1=s2.getOptions();//to get total num
		System.out.println(list1.size());*/

	}

}
