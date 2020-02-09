package adminpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends PageBase {

	public Dashboard(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@id=\"Side_Menu\"]/li[3]/a")
	WebElement categoriesLink;
	
	@FindBy(xpath="//*[@id=\"Side_Menu\"]/li[2]/a")
	WebElement AddNewPostLink;
	
	@FindBy(xpath="//*[@id=\"Side_Menu\"]/li[4]/a")
	WebElement manageadminlink;
	
	@FindBy(xpath="//*[@id=\"Side_Menu\"]/li[7]/a")
	WebElement logoutClick;
	
	
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
}
