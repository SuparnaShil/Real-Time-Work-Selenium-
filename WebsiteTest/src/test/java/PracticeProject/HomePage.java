package PracticeProject;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base{

	@Test(dataProvider="getData")
	public void basePageNavigation(String username, String password, String text) throws IOException
	{
		driver =InitializeDriver();
		driver.get("http://www.qaclickacademy.com/"); //Data provider annotation
		LandingPage land =new LandingPage(driver);
		land.SignIn().click();
		LoginPage log =new LoginPage(driver);
		log.getEmail().sendKeys(username);
		log.getPass().sendKeys(password);
		log.loginBtn().click();
		System.out.println(text);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//column means how many types of data like restricted/ not restricted
		//row stands for how many different data types test should run
		//like username,pass,text etc
		//Object[][] data=new Object[1][2]; //array index out of bound 
		Object[][] data=new Object[2][3];
		
		data[0][0]="suparnashil@gmail.com";
		data[0][1]="1234567";
		data[0][2]="Restricted";
	    
		data[1][0]="chaity@gmail.com";
		data[1][1]="11111";
		data[1][2]="Not Restricted"; 
		
		return data;
	}
}
