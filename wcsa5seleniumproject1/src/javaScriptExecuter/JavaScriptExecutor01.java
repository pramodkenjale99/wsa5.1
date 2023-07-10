package javaScriptExecuter;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor01 {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Pramod/Desktop/Wcsa5/Login.html");
		driver.findElement(By.xpath("//input[@id='n1']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@id='n2']")).sendKeys("manager");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("alert('hello there')");
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	
		
		
		
		
	}

}
