package selenium.jan26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_rightclick
{

	public static void main(String[] args) 
	{
	 ChromeDriver driver = new ChromeDriver ();
	 driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	 driver.manage().window().maximize();
	 WebElement login= driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]"));
	 login.click();
	 WebElement username=driver.findElement(By.id("username"));
     username.sendKeys("Mary");
     WebElement password=driver.findElement(By.name("password"));
	 password.sendKeys("mary@123");
	 WebElement captcha=driver.findElement(By.id("loginCaptchaValue"));
	 captcha.sendKeys("dxpth");
	 
	}

}
