package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataDrivenFramework.Flib;

public class validCredActiTime {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=4wzh61rcr6e5");
		
		
		Flib data =new Flib();
//		data.writeExceldata("./data/ActitimeTestData.xlsx", "validcreds",1,0,"admin");
		
		Thread.sleep(2000);
//		driver.findElement(By.name("username")).sendKeys(data.ReadExcelData("./data/ActitimeTestData.xlsx", "validcreds", 1, 0));
		Thread.sleep(1000);
//		driver.findElement(By.name("pwd")).sendKeys(data.ReadExcelData("./data/ActitimeTestData.xlsx", "validcreds", 1, 1));
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}
	

}
