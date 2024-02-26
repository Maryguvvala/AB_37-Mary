package selenium.jan26;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copypaste_form 
{

 public static void main(String[] args)
  {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	WebElement first_name=driver.findElement(By.id("fname"));
	first_name.sendKeys("Manish kumar tiwari");
	first_name.sendKeys(Keys.CONTROL+"a");
	first_name.sendKeys(Keys.CONTROL+"c");
	WebElement last_name=driver.findElement(By.id("lname"));
	last_name.sendKeys(Keys.CONTROL+"v");
	WebElement username=driver.findElement(By.id("Username"));
	username.sendKeys(Keys.CONTROL+"v");
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys(Keys.CONTROL+"v");
  }

}
