package popupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopup {

	public static void main(String[] args) throws AWTException, InterruptedException  {
		System.setProperty("Webdriver.edge.driver", "./drivers/msedgeriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Pramod/Desktop/Wcsa5/AlertPopupHTML.html");
		driver.findElement(By.xpath("//button[text()='Click Here']")).click();
		
//		Robot robot = new Robot();
//		
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
		
		Alert alt = driver.switchTo().alert();
		
		//alt.accept();   for accept the alert popup
		Thread.sleep(2000); 
		//alt.dismiss();   //for dismiss the alert popup
		
		System.out.println(alt.getText()); // to get the text of the popup
	}

}
