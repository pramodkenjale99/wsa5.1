package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageNetflix {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		driver.findElement(By.id("id_userLoginId")).sendKeys("roshanbhosale20@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("Vivo@02a");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
	}

}
