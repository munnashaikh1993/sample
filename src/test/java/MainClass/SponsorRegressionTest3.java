package MainClass;

import org.testng.annotations.Test;

import Application.Biolab;
import Browsers.Browser;
import Home.HomePage;
import Login.Login;
import LogoutAndClose.Logout;
import Sponsor.BL_TC_06;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SponsorRegressionTest3 {

	@BeforeTest
	public void beforeTest() 
	{
		//Launch Browser
				
		Login.sponsorLogin();
		
	}

	@Test
	public void recentjoin_Test() throws Exception
	{
		BL_TC_06.recentjoin();
		
	}


	@AfterTest
	public void afterTest() throws Exception 
	{
		Logout.logoutApplication();
		
	}

}
