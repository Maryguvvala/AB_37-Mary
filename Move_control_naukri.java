package selenium.jan26;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Move_control_naukri 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
	    WebElement googlelink=driver.findElement(By.xpath("//span[.='Google']"));
	    googlelink.click();
        Set<String> parentandchild_id= driver.getWindowHandles();
        //System.out.println(parentandchild_id);
        Iterator<String> pc_id= parentandchild_id.iterator();
        String p_id= pc_id.next();
        String c_id =pc_id.next();
        //System.out.println(p_id);
        //System.out.println(c_id);
        driver.switchTo().window(c_id);
        Thread.sleep(2000);
        driver.close();
	}

}
