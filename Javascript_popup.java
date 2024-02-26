package selenium.jan26;


import org.openqa.selenium.chrome.ChromeDriver;


public class Javascript_popup 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
	    driver.switchTo().alert().accept();
	    driver.manage().window().maximize();
	    System.out.println(driver.getTitle());	
	}

}
