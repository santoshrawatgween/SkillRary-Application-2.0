package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage
{
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsButton;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillraryDemoApp;
	
	@FindBy(name="q")
	private WebElement searchTextField;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement goButton;
	
	
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gearsButton()
	{
		gearsButton.click();
	}
	
	public void skillraryDemoApp()
	{
		skillraryDemoApp.click();
	}
	
	public void searchTextField(String name)
	{
		searchTextField.sendKeys(name);
	}
	
	public void goButton()
	{
		goButton.click();
	}

}
