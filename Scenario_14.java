package scenarios.project;//done
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//Go to orders page and click on your last ordered product and give 5 star rating.
public class Scenario_14
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\KING\\eclipse-workspace\\Selenium\\excelsheet\\mary.xlsx");
		Workbook wb = WorkbookFactory.create(f1);
		String username = wb.getSheet("login").getRow(0).getCell(0).getStringCellValue();
        String password = wb.getSheet("login").getRow(0).getCell(1).getStringCellValue();
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement hover=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
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
        WebElement orders = driver.findElement(By.id("nav-orders"));
        orders.click();
        WebElement leave_feedback = driver.findElement(By.id("Leave-seller-feedback_2"));
        leave_feedback.click();
        WebElement rating = driver.findElement(By.name("star5"));
        rating.click();
		
	}

}
