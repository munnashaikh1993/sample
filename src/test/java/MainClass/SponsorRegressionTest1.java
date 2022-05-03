package MainClass;

import org.testng.annotations.Test;

import Application.Biolab;
import Browsers.Browser;
import Home.HomePage;
import Login.Login;
import LogoutAndClose.Logout;
import Sponsor.BL_TC_03_Sponsor;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SponsorRegressionTest1 
{
	@BeforeTest
	public void beforeTest() 
	{
		//Launch Browser
		Browser.chromeBrowser();

		//Method for validate Biolab application method
		Biolab.launchBiolabApplication();

		//Method for validate Biolabs member login method
		HomePage.clickBioLabsMemberLogIn();

		Login.sponsorLogin();
		
	}


	@Test(priority = 0)
	public void recentJoin_Test() throws Exception 
	{
		BL_TC_03_Sponsor.findAvalablesite();
	}


	@AfterTest
	public void afterTest() throws Exception 
	{
		Logout.logoutApplication();
		
	}

}
