package pom;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	 public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://127.0.0.1/login.do;jsessionid=4wzh61rcr6e5");
		 
		 WebElement usnTB = driver.findElement(By.name("username"));
		 //usnTB.sendKeys("admin");
		 WebElement pssTB = driver.findElement(By.name("pwd"));
		 
		 driver.navigate().refresh();
		 usnTB.sendKeys("admin");
	}
}
