package adminpages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LivePreviewPost extends PageBase {

	public LivePreviewPost(WebDriver driver) {
		super(driver);
		jse=(JavascriptExecutor) driver;
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="/html/body/div[3]/div[2]/div[1]/div[2]/form/fieldset/div[1]/input")
	WebElement nameTxt;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div[1]/div[2]/form/fieldset/div[2]/input")
	WebElement emailTxt;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div[1]/div[2]/form/fieldset/div[3]/textarea")
	WebElement commentTxt;
	
	@FindBy(name="Submit")
	WebElement submitBtn;
	@FindBy(css="div.alert.alert-success")
	public WebElement assertcomment;
	
	public void addreview(String name, String email, String comment)
	{
		TextValue(nameTxt, name);
		TextValue(emailTxt, email);
		TextValue(commentTxt, comment);
		clickButton(submitBtn);
	}
}
