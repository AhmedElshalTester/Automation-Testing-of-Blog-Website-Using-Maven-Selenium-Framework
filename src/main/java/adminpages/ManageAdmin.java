package adminpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageAdmin extends PageBase {

	public ManageAdmin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(name="Username")
	WebElement usernameTxt;
	
	@FindBy(name="Password")
	WebElement passwordTxt;
	
	@FindBy(name="ConfirmPassword")
	WebElement confirmPasswordTxt;
	
	@FindBy(name="Submit")
	WebElement submitBtn;
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div[2]/table/tbody/tr[2]/td[5]/a/span")
	WebElement deleteAdminAdded;
	
	@FindBy(css="div.alert.alert-success")
	public WebElement addadminmessage;
	
	@FindBy(css="div.alert.alert-success")
	public WebElement deleteadminmessage;
	
	public void addAdmin(String usernameNew, String NewPassword)
	{
		TextValue(usernameTxt, usernameNew);
		TextValue(passwordTxt, NewPassword);
		TextValue(confirmPasswordTxt, NewPassword);
		clickButton(submitBtn);
	}
	public void deleteAdmin()
	{
		clickButton(deleteAdminAdded);
	}
	

}
