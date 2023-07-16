package pom2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IautoConstant{
	
	public static void main(String[] args) throws IOException  {
		
	Flib flib = new Flib();
	String browserValue = flib.readPropertyData(Prop_Path, "Browser");
	String UrlValue = flib.readPropertyData(Prop_Path, "Url");
		
	if (browserValue.equalsIgnoreCase("chrome")) {
		
		System.setProperty(Chrome_Key, Chrome_Path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(UrlValue);
		
	}
	else if (browserValue.equalsIgnoreCase("edge")) {
		System.setProperty(Edge_Key, Edge_Path);
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(UrlValue);
	}
	else if (browserValue.equalsIgnoreCase("firefox")) {
		System.setProperty(Firefox_Key, FireFox_Path);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(UrlValue);
		
	}
	
		
	}

}
