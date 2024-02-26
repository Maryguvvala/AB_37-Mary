package selenium.programs;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Webelement_file_dropdown
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement skill=driver.findElement(By.id("Skills"));
		Select s1= new Select(skill);
		List<WebElement> list=s1.getOptions();
		System.out.println(list.size());
		
		//s1.selectByValue("select1");
		//s1.selectByVisibleText("Non-Technical Skills");
		WebElement country=driver.findElement(By.id("Country"));
		Select s2= new Select(country);
		List<WebElement> list1=s2.getOptions();
		System.out.println(list1.size());
		
		/*s2.selectByValue("Afganistan");
		s2.selectByValue("Bangladesh");
		s2.selectByValue("Bhutan");
		s2.selectByValue("Combodia");
		s2.selectByValue("China");
		s2.selectByVisibleText("France ");
		s2.selectByVisibleText("Germany ");
		s2.selectByVisibleText("India ");
		s2.selectByVisibleText("Isreal ");
		s2.selectByVisibleText("Italy ");
		s2.selectByIndex(11);
		s2.selectByIndex(12);
		s2.selectByIndex(13);
		s2.selectByIndex(14);
		s2.selectByIndex(15);
		s2.selectByIndex(16);
		s2.selectByIndex(17);
		s2.selectByIndex(18);
		s2.selectByIndex(19);
		s2.selectByIndex(20);
		s2.selectByIndex(21);
		s2.selectByIndex(22);
		s2.selectByIndex(23);
		s2.selectByIndex(24);
		s2.selectByIndex(25);
		s2.selectByIndex(26);
		s2.selectByIndex(27);
		WebElement religion=driver.findElement(By.id("Relegion"));
		Select s3= new Select(religion);
		s3.selectByValue("Hindu");
		s3.selectByValue("Muslim");
		s3.selectByValue("Sikh");
		s3.selectByValue("Jain");
		s3.selectByVisibleText("Adherent");
		s3.selectByVisibleText("Jews");
		s3.selectByVisibleText("Parsis");
		s3.selectByIndex(8);
		s3.selectByIndex(9);*/
	}

}
