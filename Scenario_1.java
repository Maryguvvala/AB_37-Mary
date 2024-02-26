package scenarios.project;//Test if a new user can successfully register.

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_1 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream f1= new FileInputStream("C:\\Users\\KING\\eclipse-workspace\\Selenium\\excelsheet\\mary.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		String name=wb.getSheet("register").getRow(0).getCell(0).getStringCellValue();
		String number= NumberToTextConverter.toText(wb.getSheet("register").getRow(1).getCell(0).getNumericCellValue());
		String pw = wb.getSheet("register").getRow(2).getCell(0).getStringCellValue();
		ChromeDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement hover=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions a1 = new Actions (driver);
        a1.moveToElement(hover).perform();
        WebElement starthere=driver.findElement(By.linkText("Start here."));
        starthere.click();
        WebElement name1=driver.findElement(By.id("ap_customer_name"));
        name1.sendKeys(name);
        WebElement number1=driver.findElement(By.id("ap_phone_number"));
        number1.sendKeys(number);
        WebElement pw1=driver.findElement(By.id("ap_password"));
        pw1.sendKeys(pw);
        WebElement verify=driver.findElement(By.id("continue"));
        verify.click();
        
        
	}

}
