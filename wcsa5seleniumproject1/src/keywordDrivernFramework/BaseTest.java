package keywordDrivernFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IautoConstant{
	
	static WebDriver driver;
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(Prop_path, "Browser");
		String urlValue = flib.readPropertyData(Prop_path, "Url");
		
		if (browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(Chrome_Key, Chrome_Path);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(urlValue);
		}
		else if (browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(Firfox_Key, Firefox_Path);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(urlValue);	
		}
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			System.setProperty(Edge_Key, Edge_Path);
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(urlValue);
		}
		
	}
	public void closeBrowser()
	{
		driver.quit();
	}
}
