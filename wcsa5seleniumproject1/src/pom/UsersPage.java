package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v112.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class UsersPage {
	
	@FindBy(xpath = "//input[@value='Create New User']") private WebElement createNewUserButton;
	@FindBy (name = "username")private WebElement usernameTb;
	@FindBy (name = "passwordText")private WebElement passTb;
	@FindBy (name = "passwordTextRetype")private WebElement reTypeTb;
	@FindBy (name = "firstName")private WebElement firstNameTb;
	@FindBy (name = "lastName")private WebElement lastNameTb;
	@FindBy (xpath = "//*[@id='right12']") private WebElement Modify_Time_track;
	@FindBy (xpath = "//*[@id='right2']")private WebElement Manage_cust_proj;
	@FindBy (xpath = "//*[@id='right1']")private WebElement Generate_Reports;
	@FindBy (xpath = "//*[@id='right5']") private WebElement Manage_user;
	@FindBy (xpath = "//*[@id='right7']") private WebElement  Manage_Billing_Types;
	@FindBy (xpath = "//input[@type='submit']")private WebElement CreateUserbt;
	@FindBy (xpath = "//input[@onclick=\"cancelForm(messageResource.getMessage('user.add.cancel_button_confirm'), '/administration/userlist.do')\"]") private WebElement CancelButton;
	@FindBy (linkText = "Amral, Jonathan (testEngg)") private WebElement userLink;
	@FindBy (xpath = "//input[@value='Delete This User']") private WebElement deleteThisUserButton;
	
	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getCreateNewUserButton() {
		return createNewUserButton;
	}

	public WebElement getUsernameTb() {
		return usernameTb;
	}

	public WebElement getPassTb() {
		return passTb;
	}

	public WebElement getReTypeTb() {
		return reTypeTb;
	}

	public WebElement getFirstNameTb() {
		return firstNameTb;
	}

	public WebElement getLastNameTb() {
		return lastNameTb;
	}

	public WebElement getCreateUserbt() {
		return CreateUserbt;
	}
	
	public WebElement getModify_Time_track() {
		return Modify_Time_track;
	}

	public WebElement getManage_cust_proj() {
		return Manage_cust_proj;
	}

	public WebElement getGenerate_Reports() {
		return Generate_Reports;
	}

	public WebElement getManage_user() {
		return Manage_user;
	}

	public WebElement getManage_Billing_Types() {
		return Manage_Billing_Types;
	}

	public WebElement getCancelButton() {
		return CancelButton;
	}
	

	public void validUserCred(String validUsername,String validPassword,String validRetypePassword, String validfirstName,String validlastName)
	{
		createNewUserButton.click();
		usernameTb.sendKeys(validUsername);
		passTb.sendKeys(validPassword);
		reTypeTb.sendKeys(validRetypePassword);
		firstNameTb.sendKeys(validfirstName);
		lastNameTb.sendKeys(validlastName);
		Modify_Time_track.click();
		Manage_cust_proj.click();
		Generate_Reports.click();
		Manage_user.click();
		Manage_Billing_Types.click();
		CreateUserbt.click();
	}
	public void deleteManager()
	{
		userLink.click();
		deleteThisUserButton.click();
	}
}
