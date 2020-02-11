package adminpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends PageBase {

	public Dashboard(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="/html/body/div[3]/div/div[1]/ul/li[1]/a")
	WebElement clickDashboard;
	
	@FindBy(xpath="//*[@id=\"Side_Menu\"]/li[3]/a")
	WebElement categoriesLink;
	
	@FindBy(xpath="//*[@id=\"Side_Menu\"]/li[2]/a")
	WebElement AddNewPostLink;
	
	@FindBy(xpath="//*[@id=\"Side_Menu\"]/li[4]/a")
	WebElement manageadminlink;
	
	@FindBy(xpath="//*[@id=\"Side_Menu\"]/li[7]/a")
	WebElement logoutClick;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div[2]/table/tbody/tr[2]/td[8]/a[1]/span")
	WebElement editBtn;
	
	@FindBy(css="div.alert.alert-success")
	public WebElement assertMessage;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div[2]/table/tbody/tr[2]/td[9]/a/span")
	WebElement livePreview;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div[2]/table/tbody/tr[2]/td[8]/a[2]/span")
	WebElement deletePost;
	
	@FindBy(name="Submit")
	WebElement confirmdeletepost;
	
	public void dasboardPage()
	{
		clickButton(clickDashboard);
	}
	public void clickCategory()
	{
		clickButton(categoriesLink);
	}
	public void clickAddNewPost()
	{
		clickButton(AddNewPostLink);
	}
	public void logout()
	{
		clickButton(logoutClick);
	}
	public void manageadmin()
	{
		clickButton(manageadminlink);
	}
	public void editPost()
	{
		clickButton(editBtn);
	}
	public void livePerviewPost()
	{
		clickButton(livePreview);
	}
	public void deletePostAdded()
	{
		clickButton(deletePost);
	}
	public void confirmdelete()
	{
		clickButton(confirmdeletepost);
	}
}
