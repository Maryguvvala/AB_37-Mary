package scenarios.project;//Verify that searching with filters(e.g.,category,price rage) gives accurate result.

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_6 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\KING\\eclipse-workspace\\Selenium\\excelsheet\\mary.xlsx");
		Workbook wb = WorkbookFactory.create(f1);
		String username = wb.getSheet("login").getRow(0).getCell(0).getStringCellValue();
		String password = wb.getSheet("login").getRow(0).getCell(1).getStringCellValue();
		ChromeDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement hover = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions a1 = new Actions (driver);
        a1.moveToElement(hover).perform();
        WebElement sign_in = driver.findElement(By.linkText("Sign in"));
        sign_in.click();
        WebElement email = driver.findElement(By.id("ap_email"));
        email.sendKeys(username);
        WebElement button = driver.findElement(By.id("continue"));
        button.click();
        WebElement pw = driver.findElement(By.id("ap_password"));
        pw.sendKeys(password);
        WebElement submit = driver.findElement(By.id("signInSubmit"));
        submit.click();
        WebElement search =  driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("shoes");
        search.sendKeys(Keys.ENTER);
        WebElement womensneakers = driver.findElement(By.linkText("Women's Sneakers"));
        womensneakers.click();
        WebElement brand = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[7]"));
        brand.click();
        WebElement pricerange = driver.findElement(By.linkText("₹1,000 - ₹2,500"));
        pricerange.click();
        WebElement size = driver.findElement(By.xpath("(//button[@class='a-button-text a-text-center'])[10]"));
        size.click();
        WebElement color = driver.findElement(By.xpath("(//div[@class='colorsprite aok-float-left'])[3]"));
        color.click();
      
	}

}
