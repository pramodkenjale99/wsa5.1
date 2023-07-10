package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		
		driver.findElement(By.id("id_userLoginId")).sendKeys("Zgod@9120");
		
		driver.findElement(By.id("id_password")).sendKeys("9876543210");
		
		driver.findElement(By.className("btn login-button btn-submit btn-small")).click();


	}

}
