package adminpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriesPage extends PageBase {

	public CategoriesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(name="Category")
	WebElement categoryTxt;
	
	@FindBy(name="Submit")
	WebElement submitBtn;
	
	@FindBy(css="div.alert.alert-success")
	public WebElement sucessMessageCateogory;
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div[3]/table/tbody/tr[2]/td[5]/a/span")
	WebElement deleteBtn;
	@FindBy(css="div.alert.alert-success")
	public WebElement deleteSuccessfully;
	public void addCatogory(String categoryname) 
	{
		TextValue(categoryTxt, categoryname);
		clickButton(submitBtn);
	}
	public void deleteCategory()
	{
		clickButton(deleteBtn);
	}

}
