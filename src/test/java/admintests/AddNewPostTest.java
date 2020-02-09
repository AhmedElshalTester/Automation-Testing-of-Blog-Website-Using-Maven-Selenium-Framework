package admintests;

import org.testng.Assert;
import org.testng.annotations.Test;

import adminpages.AddNewPost;
import adminpages.CategoriesPage;
import adminpages.Dashboard;
import adminpages.LoginPage;

public class AddNewPostTest extends TestBase {
	
	LoginPage loginObject;
	Dashboard dashboardObject;
	AddNewPost addnewpostPage;
	CategoriesPage categoryObject;
	String username="AhmedElshal";
	String password="12345678";
	String Title="Test Automation FrameWork";
	String Categoryname="Test Automation";
	String post="we using selenium test framework";
			
	
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
		Thread.sleep(2000);
		categoryObject=new CategoriesPage(driver);
		categoryObject.addCatogory(Categoryname);
		Assert.assertTrue(categoryObject.sucessMessageCateogory.getText().contains("Successfully"));
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void addnewPost() throws InterruptedException
	{
		dashboardObject=new Dashboard(driver);
		dashboardObject.clickAddNewPost();
		addnewpostPage=new AddNewPost(driver);
		addnewpostPage.AddNewPostPage(Title, Categoryname, post);
		Thread.sleep(3000);
		Assert.assertTrue(addnewpostPage.addSucessfully.getText().contains("Added"));

	}
	@Test(priority=4)
	public void logoutBlog()
	{
		dashboardObject.logout();
		loginObject=new LoginPage(driver);
		Assert.assertTrue(loginObject.welcometxt.getText().contains("Welcome"));
	}

}
