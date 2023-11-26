package scripts;

import org.testng.annotations.Test;

import genricLib.BaseClass;
import pomPages.AddToCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1()
	{
		SkillraryLoginPage s1= new SkillraryLoginPage(driver);
		s1.gearsButton();
		s1.skillraryDemoApp();
		utilities.switchTab(driver);
		
		SkillraryDemoLoginPage s2= new SkillraryDemoLoginPage(driver);
		utilities.mouseHover(driver, s2.getCourcesButton());
		s2.seleniumTraining();
		
		AddToCartPage a1 = new AddToCartPage(driver);
		utilities.doubleClick(driver, a1.getPlusButton());
		a1.addToCartButton();
		
		utilities.alertPopUpOk(driver);
		
		
		
	}

}
