package admintests;

import org.testng.Assert;
import org.testng.annotations.Test;

import adminpages.AddNewPost;
import adminpages.CategoriesPage;
import adminpages.Dashboard;
import adminpages.LoginPage;

public class AdminCanUpdatePost extends TestBase {
	LoginPage loginObject;
	Dashboard dashboardObject;
	AddNewPost addnewpostPage;
	CategoriesPage categoryObject;
	String username="AhmedElshal";
	String password="12345678";
	String Title="Test Selenium FrameWork";
	String Categoryname="Test Automation";
	String post="we using selenium test framework with testng and page object model";
	String updateTitle="Test Robot FrameWork";
	String updateCategoryname="Test Automation";
	String updatepost="we using robot test framework to automate web, mobile and desktop";
			
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
	public void AdminCanEditpost() throws InterruptedException
	{
		dashboardObject=new Dashboard(driver);
		dashboardObject.dasboardPage();
		Thread.sleep(2000);
		dashboardObject.editPost();
		addnewpostPage=new AddNewPost(driver);
		addnewpostPage.UpdatePostPage(updateTitle, updateCategoryname, updatepost);
		Thread.sleep(2000);
		Assert.assertTrue(dashboardObject.assertMessage.getText().contains("Updated"));
	}
	@Test(priority=5)
	public void AdminCanDeletePost() throws InterruptedException
	{
		dashboardObject.deletePostAdded();
		Thread.sleep(2000);
		dashboardObject.confirmdelete();
		Assert.assertTrue(dashboardObject.assertMessage.getText().contains("Deleted"));
		Thread.sleep(3000);
	}
	@Test(priority=6)
	public void logoutBlog() throws InterruptedException
	{
		dashboardObject.logout();
		Thread.sleep(2000);
		loginObject=new LoginPage(driver);
		Assert.assertTrue(loginObject.welcometxt.getText().contains("Welcome"));
	}


}
