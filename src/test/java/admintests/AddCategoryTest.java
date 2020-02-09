package admintests;

import org.testng.Assert;
import org.testng.annotations.Test;

import adminpages.CategoriesPage;
import adminpages.Dashboard;
import adminpages.LoginPage;

public class AddCategoryTest extends TestBase {
	LoginPage loginObject;
	Dashboard dashboardObject;
	CategoriesPage categoryObject;
	String username="AhmedElshal";
	String password="12345678";
	
	String Categoryname="Testing Automation";
	
	@Test(priority=1)
	public void adminCanLoginSuccessfully()
	{
		loginObject=new LoginPage(driver);
		loginObject.login(username, password);
		Assert.assertTrue(loginObject.MessageText.getText().contains("Welcome AhmedElshal"));
	}

	@Test(priority=2)
	public void adminCanAddCategory() throws InterruptedException
	{
		dashboardObject=new Dashboard(driver);
		dashboardObject.clickCategory();
		categoryObject=new CategoriesPage(driver);
		categoryObject.addCatogory(Categoryname);
		Assert.assertTrue(categoryObject.sucessMessageCateogory.getText().contains("Successfully"));
		Thread.sleep(7000);
		categoryObject.deleteCategory();
		Assert.assertTrue(categoryObject.deleteSuccessfully.getText().contains("Deleted"));
	}
			

}
