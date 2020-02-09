package admintests;

import org.testng.Assert;
import org.testng.annotations.Test;

import adminpages.Dashboard;
import adminpages.LoginPage;
import adminpages.ManageAdmin;

public class AddAdminTest extends TestBase {
	LoginPage loginObject;
	Dashboard dashboardObject;
	ManageAdmin adminObject;
	String username="AhmedElshal";
	String password="12345678";
	String Newusername="test";
	String Newpassword="123456";

	@Test(priority=1)
	public void adminCanLoginSuccessfully() throws InterruptedException
	{
		loginObject=new LoginPage(driver);
		loginObject.login(username, password);
		Assert.assertTrue(loginObject.MessageText.getText().contains("Welcome AhmedElshal"));
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void addNewAdmin() throws InterruptedException
	{
		dashboardObject=new Dashboard(driver);
		dashboardObject.manageadmin();
		adminObject=new ManageAdmin(driver);
		adminObject.addAdmin(Newusername, Newpassword);
		Assert.assertTrue(adminObject.addadminmessage.getText().contains("Added"));
		Thread.sleep(2000);	
	}
	@Test(priority=3)
	public void Adminlogout() throws InterruptedException
	{
		dashboardObject.logout();
		loginObject=new LoginPage(driver);
		Assert.assertTrue(loginObject.welcometxt.getText().contains("Welcome"));
		Thread.sleep(2000);

	}
	@Test(priority=4)
	public void LoginPageNewAdmin() throws InterruptedException
	{
		loginObject=new LoginPage(driver);
		loginObject.login(Newusername, Newpassword);
		Assert.assertTrue(loginObject.MessageText.getText().contains("test"));
		Thread.sleep(2000);

	}
	@Test(priority=5)
	public void deleteNewAdmin() throws InterruptedException
	{
		dashboardObject=new Dashboard(driver);
		dashboardObject.manageadmin();
		adminObject=new ManageAdmin(driver);
		adminObject.deleteAdmin();
		Thread.sleep(3000);
		Assert.assertTrue(adminObject.deleteadminmessage.getText().contains("Deleted"));
		dashboardObject.logout();
		Thread.sleep(4000);
		loginObject=new LoginPage(driver);
		Assert.assertTrue(loginObject.welcometxt.getText().contains("Welcome"));
	}
	
}