package practice_feb;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_DDT_shrtcut 
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
	
	
	}

}
