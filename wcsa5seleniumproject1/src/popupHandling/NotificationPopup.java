package popupHandling;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopup {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the BrowserValue : ");
		String BrowserValue= obj.nextLine();
		if (BrowserValue.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			Thread.sleep(2000);
			driver.get("https://www.easemytrip.com/");
		}
		
		else if (BrowserValue.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("Webdriver.gecko.driver", "./drivers/geckodriver.exe");
			FirefoxOptions fo = new FirefoxOptions();
			fo.addArguments("--disable-notifications");
			driver=new FirefoxDriver(fo);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			Thread.sleep(2000);
			driver.get("https://www.easemytrip.com/");
			
		}
		else if(BrowserValue.equalsIgnoreCase("Edge")) {
			System.setProperty("Webdriver.edge.driver", "./drivers/Msedgedriver.exe");
			EdgeOptions eo = new EdgeOptions();
			eo.addArguments("--disable-notifications");
			driver=new EdgeDriver(eo);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			Thread.sleep(2000);
			driver.get("https://www.easemytrip.com/");	
		}
		
	}
}
