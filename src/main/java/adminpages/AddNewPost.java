package adminpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddNewPost extends PageBase {

	public AddNewPost(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name="Title")
	WebElement titleTxt;

	@FindBy(name="Category")
	WebElement selectCategory;


	@FindBy(name="Post")
	WebElement postText;

	@FindBy(name="Image")
	WebElement ImageSelect;

	@FindBy(name="Submit")
	WebElement submitBtn;
	@FindBy(css="div.alert.alert-success")
	public WebElement addSucessfully;

	public void AddNewPostPage(String Title,String category,String post) 
	{
		TextValue(titleTxt, Title);
		select=new Select(selectCategory);
		select.selectByVisibleText(category);
		String img="Summer.jpg";
		String filePath = System.getProperty("user.dir") + "\\images\\"+img;
		TextValue(ImageSelect, filePath);
		TextValue(postText, post);
		clickButton(submitBtn);
	}

}
