package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	@FindBy(xpath = "//A[@class='content tt_selected selected']/descendant::IMG") private WebElement timetrackModule;
	@FindBy(xpath = "//A[@class='content tasks']/descendant::IMG[@class='sizer']") private WebElement taskModule;
	@FindBy(xpath = "//A[@class='content reports']/descendant::IMG[@class='sizer']") private WebElement reportsModule;
	@FindBy(xpath = "//A[@class='content users']/descendant::IMG[@class='sizer']") private WebElement usersModule;
	@FindBy(xpath = "//A[@class='content calendar']/descendant::IMG[@class='sizer']") private WebElement workSheduleModule;
	@FindBy(xpath = "//A[@class='content administration']/descendant::IMG[@class='sizer']") private WebElement settingsModule;
	@FindBy(linkText = "Logout")private WebElement LogoutLink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getTimetrackModule() {
		return timetrackModule;
	}

	public WebElement getTaskModule() {
		return taskModule;
	}

	public WebElement getReportsModule() {
		return reportsModule;
	}

	public WebElement getUsersModule() {
		return usersModule;
	}

	public WebElement getWorkSheduleModule() {
		return workSheduleModule;
	}

	public WebElement getSettingsModule() {
		return settingsModule;
	}

	public WebElement getLogoutLink() {
		return LogoutLink;
	}
	
	public void clickonTimeTrackModule()
	{
		timetrackModule.click();
	}
	public void clickonTaskModule()
	{
		taskModule.click();
	}
	public void clickonReportModule()
	{
		reportsModule.click();
	}
	public void clickonUserModule()
	{
		usersModule.click();
	}
	public void clickonWorkScheduleModule()
	{
		workSheduleModule.click();
	}
	public void clickonSettingModule()
	{
		settingsModule.click();
	}
	public void clickonLogoutLink()
	{
		LogoutLink.click();
	}
	
	
}
