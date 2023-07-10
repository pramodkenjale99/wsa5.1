package keywordDrivernFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidTestCase extends BaseTest {
	
	public static void main(String[] args) throws IOException {
		
		BaseTest Bt = new BaseTest();
		Bt.openBrowser();
		
		Flib flib = new Flib();
		int rc = flib.getLastRowCount(Excel_Path, "Invalidcreds");
		for(int i=1;i<=rc;i++)
		{
		driver.findElement(By.name("username")).sendKeys(flib.readExcelData(Excel_Path, "Invalidcreds", i, 0));
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(Excel_Path, "Invalidcreds", i, 1));
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.name("username")).clear();
		}
		Bt.closeBrowser();
	}

}
