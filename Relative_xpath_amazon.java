package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpath_amazon 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		//syntax //tagname[AN='Av']
		
		/*driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("twinklemary07@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("mary123");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();*/
		
        //using //
		
		driver.findElement(By.xpath("(//input)[7]")).sendKeys("twinklemary07@gmail.com");
		driver.findElement(By.xpath("(//input)[10]")).click();
		driver.findElement(By.xpath("(//input)[9]")).sendKeys("mary123");
		driver.findElement(By.xpath("(//input)[11]")).click();
	
	
	}
	
	

}
