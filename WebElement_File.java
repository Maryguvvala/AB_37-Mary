package selenium.programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class WebElement_File 
{
	public static void main(String[] args) 
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	WebElement first_name=driver.findElement(By.id("fname"));
	first_name.sendKeys("Mary");
	WebElement last_name=driver.findElement(By.id("lname"));
	last_name.sendKeys("Kumari");
	WebElement username=driver.findElement(By.id("Username"));
	username.sendKeys("mary123");
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("mary@123");
	WebElement male=driver.findElement(By.id("Male"));
	male.click();
	WebElement female=driver.findElement(By.id("FeMale"));
	female.click();
	WebElement address=driver.findElement(By.id("w3review"));
	address.sendKeys("hyderabad");
	WebElement permanent_address=driver.findElement(By.id("Address"));
	permanent_address.sendKeys("hyderabad");
	WebElement pincode=driver.findElement(By.id("Pincode"));
	pincode.sendKeys("50025");
	WebElement agree=driver.findElement(By.id("Agree"));
	agree.click();
	WebElement submit=driver.findElement(By.xpath("(//input)[46]"));
	submit.click();
	}
}
