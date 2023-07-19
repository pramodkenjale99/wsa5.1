package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	static WebDriver driver;
  @Test
  @Parameters({"Browser","Url","Vusername","Vpassword"})
  public void chromeMehtod(String browservalue,String Url,String Vusername,String Vpassword) {
	  
	  if (browservalue.equalsIgnoreCase("chrome")) {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get(Url);
	  driver.findElement(By.name("username")).sendKeys(Vusername);
	  driver.findElement(By.name("pwd")).sendKeys(Vpassword);
	  driver.findElement(By.id("loginButton")).click();
	  driver.quit();
	  }
	  
	  else if (browservalue.equalsIgnoreCase("Firefox")) {
	
		//  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get(Url);
		  driver.findElement(By.name("username")).sendKeys(Vusername);
		  driver.findElement(By.name("pwd")).sendKeys(Vpassword);
		  driver.findElement(By.id("loginButton")).click();
		  driver.quit();
	  }
	  else if (browservalue.equalsIgnoreCase("Edge")) {
		  System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		  driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get(Url);
		  driver.findElement(By.name("username")).sendKeys(Vusername);
		  driver.findElement(By.name("pwd")).sendKeys(Vpassword);
		  driver.findElement(By.id("loginButton")).click();
		  driver.quit();
		  
	  }
	  else {
		  System.out.println("!!! Enter Valid Browser Value -!!!!");
	  }
  }
}
