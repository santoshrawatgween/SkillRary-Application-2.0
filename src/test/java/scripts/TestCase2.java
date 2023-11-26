package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genricLib.BaseClass;
import pomPages.CoursePage;
import pomPages.SkillraryLoginPage;
import pomPages.TwitterPage;

public class TestCase2 extends BaseClass
{
	@Test
	public void tc2() throws FileNotFoundException, IOException, InterruptedException
	{
		SkillraryLoginPage sl1 = new SkillraryLoginPage(driver);
		sl1.searchTextField(pdata.getData("search"));
		sl1.goButton();
		
		CoursePage cp1 = new CoursePage(driver);
		cp1.CoursePage();
		
		TwitterPage pw1= new TwitterPage(driver);
		utilities.switchFrame(driver);
		pw1.playButton();
		Thread.sleep(3000);
		pw1.pauseButton();
		utilities.switchBackFrame(driver);
		pw1.shareViaTwitter();
		
		
		
	}
	

}
