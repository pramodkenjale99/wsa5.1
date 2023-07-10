package methodsofwebelement;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetRectMethod {

	public static void main(String[] args) {
		 System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		 
 		       WebDriver driver =new ChromeDriver();
 		       
 		       driver.manage().window().maximize();
 		       
 		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 		       
 		       driver.get("https://www.selenium.dev/");
 		       
 		       org.openqa.selenium.Rectangle Elements = driver.findElement(By.xpath("//h2[@class='selenium']")).getRect();
 		       
 		       int width = Elements.width;
 		       int height = Elements.height;
 		       int xaxis = Elements.x;
 		       int yaxis = Elements.y;
 		       
 		       System.out.println("Width : "+ width+" Heigth : "+height);
		   
		;
		    
		     
  		
  		  

		   

	}

}
