package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetLoginPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://spiceclub.spicejet.com/signup");
		driver.findElement(By.xpath("//select[@class='form-control form-select'] ")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='MR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("jonathan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Amral");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class='form-control form-select']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='IN']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dobDate']")).sendKeys("21/12/2000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=' form-control']")).sendKeys("9579671592");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys("jonathan16@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='new-password']")).sendKeys("Zgod@2112");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='c-password']")).sendKeys("Zgod@2112");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='defaultCheck1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-red']")).click();
		Thread.sleep(2000);
	}

}
