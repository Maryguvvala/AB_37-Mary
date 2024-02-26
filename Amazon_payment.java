package practice_feb;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_payment 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\KING\\eclipse-workspace\\Selenium\\excelsheet\\mary.xlsx");
		Workbook wb= WorkbookFactory.create(f1);
		String un =  wb.getSheet("login").getRow(0).getCell(0).getStringCellValue();
	    String pw =  wb.getSheet("login").getRow(0).getCell(1).getStringCellValue();
	    ChromeDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement hover=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions a1 = new Actions (driver);
        a1.moveToElement(hover).perform();
        WebElement sign_in = driver.findElement(By.linkText("Sign in"));
        sign_in.click();
        WebElement email = driver.findElement(By.id("ap_email"));
        email.sendKeys(un);
        WebElement button = driver.findElement(By.id("continue"));
        button.click();
        WebElement password = driver.findElement(By.id("ap_password"));
        password.sendKeys(pw);
        WebElement submit = driver.findElement(By.id("signInSubmit"));
        submit.click();
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("shoes");
        List<WebElement> results= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
       // results.get(results.size()-8).click(); 
        int auto_count = results.size();
        results.get(auto_count-8).click();
        WebElement selectshoe = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
        selectshoe.click();
        Set<String> id = driver.getWindowHandles();
        Iterator<String> pc_id=id.iterator();
        String p_id = pc_id.next();
        String c_id = pc_id.next();
        driver.switchTo().window(c_id);
        WebElement buynow = driver.findElement(By.id("buy-now-button"));
        buynow.click();
        WebElement radiobutton = driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
        radiobutton.click();
        WebElement enter = driver.findElement(By.xpath("//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link']"));
        enter.click();
        WebElement framehandle = driver.findElement(By.name("ApxSecureIframe"));
        driver.switchTo().frame(framehandle);
        WebElement carddetails = driver.findElement(By.name("addCreditCardNumber"));
        carddetails.sendKeys("14059876452");
        
        
        
        
        
	}

}
