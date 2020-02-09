package adminpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(name="Username")
	WebElement usernameTxt;
	
	@FindBy(name="Password")
	WebElement passwordTxt;
	
	@FindBy(name="Submit")
	WebElement loginBtn;
	
	@FindBy(css="div.alert.alert-success")
	public WebElement MessageText;
	
	@FindBy(tagName="h2")
	public WebElement welcometxt;
	
	public void login(String username,String Password)
	{
		TextValue(usernameTxt, username);
		TextValue(passwordTxt, Password);
		clickButton(loginBtn);
	}

}
