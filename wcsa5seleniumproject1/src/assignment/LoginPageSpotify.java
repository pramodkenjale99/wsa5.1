package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageSpotify {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://accounts.spotify.com/en/login?continue=https");
			driver.findElement(By.id("login-username")).sendKeys("Zgod@91290");
			Thread.sleep(2000);
			driver.findElement(By.id("login-password")).sendKeys("123456");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("span[class='ButtonInner-sc-14ud5tc-0 cJdEzG encore-bright-accent-set']")).click();
			

	}

}
                             //////////////////////////////////////////////////////////////////////////////////////////Z