package admintests;

import org.testng.Assert;
import org.testng.annotations.Test;

import adminpages.LoginPage;

public class LoginTest extends TestBase {
	
	LoginPage loginObject;
	String username="AhmedElshal";
	String password="12345678";
			
	@Test
	public void adminCanLoginSuccessfully()
	{
		loginObject=new LoginPage(driver);
		loginObject.login(username, password);
		Assert.assertTrue(loginObject.MessageText.getText().contains("Welcome AhmedElshal"));
	}

}
