package adminpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	public Select select;


	//Create Constructor 
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	protected static void clickButton(WebElement button)
	{
		button.click();
	}
	protected static void TextValue(WebElement textvalue, String value)
	{
		textvalue.sendKeys(value);
	}
}
