package scenarios.project;//done

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Reach till cart page without login in amazon application.
public class Scenario_15
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("shoes");
        search.sendKeys(Keys.ENTER);
        WebElement selectshoe = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
        selectshoe.click();
        Set<String> id = driver.getWindowHandles();
        Iterator<String> pc_id=id.iterator();
        String p_id = pc_id.next();
        String c_id = pc_id.next();
        driver.switchTo().window(c_id);
        WebElement add_to_cart = driver.findElement(By.id("add-to-cart-button"));
        add_to_cart.click();
        WebElement go_to_cart = driver.findElement(By.linkText("Go to Cart"));
        go_to_cart.click();
	}

}
