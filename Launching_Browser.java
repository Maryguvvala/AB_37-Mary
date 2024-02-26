package selenium.programs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launching_Browser 
{
	public static void main(String[] args) 
	{
		//ChromeDriver c1=new ChromeDriver();
		//c1.get("https://www.google.com");
		FirefoxDriver c2=new FirefoxDriver ();
		c2.get("https://www.google.com");
		//EdgeDriver c3=new EdgeDriver();
		//InternetExplorerDriver c4=new InternetExplorerDriver ();
		//System.out.println(c1.getWindowHandle());
		//System.out.println(c1.getWindowHandles());
	}

}
