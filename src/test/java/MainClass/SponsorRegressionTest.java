package MainClass;

import org.testng.annotations.Test;

import Application.Biolab;
import Browsers.Browser;

import Home.HomePage;
import Login.Login;
import LogoutAndClose.Logout;
import Sponsor.BL_TC_01_Sponsor;
import Sponsor.BL_TC_02_Sponsor;
import Sponsor.BL_TC_04_Sponsor;
import Sponsor.BL_TC_05_Sponsor;
import Sponsor.BL_TC_06_Sponsor;
import Sponsor.BL_TC_08_Sponsor;
import Sponsor.BL_TC_09_Sponsor;
import Sponsor.BL_TC_10_Sponsor;
import Sponsor.BL_TC_11_Sponsor;
import Sponsor.BL_TC_12_Sponsor;
import Sponsor.BL_TC_13_Sponsor;
import Sponsor.BL_TC_14_Sponsor;
import Sponsor.BL_TC_15_Sponsor;
import org.testng.annotations.BeforeTest;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class SponsorRegressionTest {

	@BeforeTest
	public void bforeterTest() throws Throwable {
//		System.out.println("inside Login page");

		//Launch Browser
//		Browser.chromeBrowser();
//
//		//Method for validate Biolab application method
//		Biolab.launchBiolabApplication();
//
//		//Method for validate Biolabs member login method
//		HomePage.clickBioLabsMemberLogIn();

		//Method for validate sponsor Login method
		Login.sponsorLogin();     


	}
	@Test(priority = 0, groups = "test1")
	public void recentJoinTest() throws Exception {
		System.out.println("**************************SPONSOR ADMIN**************************");

		//Reporter.log("BL_TC_06_Sponsor",true);
		BL_TC_06_Sponsor.recentJoin();

	}

	@Test(priority = 1, groups = "test2")
	public void titleVisibilityTest() throws Exception {
		 
		BL_TC_01_Sponsor.titleVisibility();
	}

	@Test (priority = 2)
	public void BioLabs_Global_NetworkTest() throws Exception
	{
		
		BL_TC_02_Sponsor.BioLabs_Global_Network();
	}


	@Test (priority = 3)
	public void visibilityMapTest() throws Exception
	{
		
		BL_TC_04_Sponsor.visibilityMap();
	}

	@Test (priority = 4)
	public void sponsorsrchpagTest() throws Exception
	{
		
		BL_TC_05_Sponsor.sponsorsrchpag();
	}



	@Test (priority = 5)
	public void LocationSelectionTest() throws Exception
	{

		
		BL_TC_08_Sponsor.LocationSelection();


	}

	@Test (priority = 6)
	public void searchpageTest() throws Exception
	{

		
		BL_TC_09_Sponsor.searchpage();


	}

	@Test (priority = 7)
	public void CheckChangesRefreshTest() throws Exception
	{

		
		BL_TC_10_Sponsor.CheckChangesRefresh();


	}

	@Test (priority = 8)
	public void searchTest() throws Exception
	{

		
		BL_TC_11_Sponsor.search();


	}

	@Test (priority = 9)
	public void visiblityTest() throws Exception
	{

		Reporter.log("BL_TC_12_Sponsor",true);
		BL_TC_12_Sponsor.visiblity();


	}


	@Test (priority = 10)
	public void All_SummaryTest() throws Exception
	{

		
		BL_TC_13_Sponsor.All_Summary();


	}

	@Test (priority = 11)
	public void companyProfileTest() throws Exception
	{

		
		BL_TC_14_Sponsor.companyProfile();


	}
	
	
	@Test (priority = 12)
	public void verifyCompanyGrowthTest() throws Exception
	{

		
		BL_TC_15_Sponsor.verifyCompanyGrowth();


	}
	


	@AfterTest
	public  void closeactivity() throws Exception
	{
		Logout.logoutApplication();
		Logout.Close();
	}



}
