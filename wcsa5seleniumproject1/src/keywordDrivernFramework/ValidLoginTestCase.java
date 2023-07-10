package keywordDrivernFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest {
	
	public static void main(String[] args) throws IOException {
		
		BaseTest Bt = new BaseTest();
		Bt.openBrowser();
		
		Flib flib = new Flib();
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(Prop_path, "Username"));
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(Prop_path, "Password"));
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
	}

}
