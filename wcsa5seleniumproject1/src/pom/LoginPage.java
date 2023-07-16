package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

		//It is a webelement repository
	
		@FindBy(xpath="//*[@name='username']") private WebElement usnTB;
		@FindBy(xpath="//*[@name='pwd']") private WebElement passTB;
		@FindBy(xpath="//*[contains(@class,'initial')]") private WebElement loginButton;
		@FindBy(id="keepLoggedInCheckBox") private WebElement checkBox;
		@FindBy(partialLinkText = "Actimind Inc.") private WebElement actiMindLink;
		@FindBy(linkText = "Logout")private WebElement LogoutButton;
		
		//intialization
		
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		public WebElement getLogoutButton() {
			return LogoutButton;
		}

		public WebElement getUsnTB() {
			return usnTB;
		}

		public WebElement getPassTB() {
			return passTB;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}

		public WebElement getCheckBox() {
			return checkBox;
		}

		public WebElement getActiMindLink() {
			return actiMindLink;
		}
		
	public void validLoginMethod(String validUsername, String validPassword)
	{
		usnTB.sendKeys(validUsername);
		passTB.sendKeys(validPassword);
		loginButton.click();
		
	}
	public void InvalidLoginMethod(String InvalidUsername, String InvalidPassword) throws InterruptedException 
	{
		usnTB.sendKeys(InvalidUsername);
		passTB.sendKeys(InvalidPassword);
		loginButton.click();
		Thread.sleep(2000);
		usnTB.clear();
	}
	
	

}
