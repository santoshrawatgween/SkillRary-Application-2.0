package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage 
{
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement plusButton;
	//Whenever we are performing the typing or clicking we will create the methods
	//For other actions we need to generate the WebElement address by generating getters 

	
	public WebElement getPlusButton() 
	{
		return plusButton;
	}

	@FindBy(xpath="(//i[@class='fa fa-shopping-cart'])[2]")
	private WebElement addToCartButton;
	
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addToCartButton()
	{
		addToCartButton.click();
	}
	
	
	

}
