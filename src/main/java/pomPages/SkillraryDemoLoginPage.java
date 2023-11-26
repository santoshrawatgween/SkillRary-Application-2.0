package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage 
{
	
	@FindBy(xpath="//a[text()='COURSE']")
	private WebElement courcesButton;
	
	public WebElement getCourcesButton() {
		return courcesButton;
	}




	@FindBy(xpath="//a[text()='Selenium Training ']")
	private WebElement seleniumTraining;
	
	public SkillraryDemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void seleniumTraining()
	{
		seleniumTraining.click();
	}

}
