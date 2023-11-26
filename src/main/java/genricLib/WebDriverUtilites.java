package genricLib;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverUtilites 
{

	public void dropDown(WebElement ele, String text)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void mouseHover(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void doubleClick(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void switchFrame(WebDriver driver)
	{
		driver.switchTo().frame(0);
	}
	
	public void switchBackFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	public void alertPopUpOk(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void alertPopUpCancel(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public void switchTab(WebDriver driver)
	{
		Set<String> ele1 = driver.getWindowHandles();
		for(String tab:ele1)
		{
			driver.switchTo().window(tab);
		}
		
	}
	
	public void scrollBar(WebDriver driver, int x,int y)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");		
	}
	
	
	
}
