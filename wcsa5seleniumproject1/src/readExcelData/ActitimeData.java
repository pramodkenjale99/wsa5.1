package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		

		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://desktop-5kus9ue/login.do");
			FileInputStream fis = new FileInputStream("./data/ActitimeTestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("Validcreds");
			Row row = sheet.getRow(1);
			Cell cell = row.getCell(0);
			String validUsername = cell.getStringCellValue();
			
			Row row1 = sheet.getRow(1);
			Cell cell1 = row1.getCell(1);
			String validPassword = cell1.getStringCellValue();
			
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(validUsername);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(validPassword);
		 driver.findElement(By.xpath("//a[text()='Login']")).click();
		 
		
	}

}
