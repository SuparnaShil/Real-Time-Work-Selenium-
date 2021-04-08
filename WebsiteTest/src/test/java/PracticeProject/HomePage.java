package PracticeProject;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class HomePage extends Base{

	@Test
	public void basePageNavigation() throws IOException
	{
		driver =InitializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		LandingPage land =new LandingPage(driver);
		land.SignIn().click();
	}
}
