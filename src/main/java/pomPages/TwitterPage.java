package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterPage 
{
	@FindBy(xpath="//div[@class='PlayButton_module_playButtonWrapper__fc6bec57']'")
	private WebElement playButton;
	
	@FindBy(xpath="//div[@class='PlayButton_module_pauseIcon__fc6bec57']'")
	private WebElement pauseButton;
	
	@FindBy(xpath="//span[text()='Share via Twitter']")
	private WebElement shareViaTwitter;
	
	public TwitterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void playButton()
	{
		playButton.click();
	}
	
	public void pauseButton()
	{
		pauseButton.click();
	}
	
	public void shareViaTwitter()
	{
		shareViaTwitter.click();
	}
}
