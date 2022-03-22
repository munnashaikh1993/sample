package MainClass;

import org.testng.annotations.Test;

import Application.Biolab;
import Browsers.Browser;

import Home.HomePage;
import Login.Login;
import LogoutAndClose.Logout;
import Sponsor.BL_TC_01;
import Sponsor.BL_TC_02;
import Sponsor.BL_TC_03;
import Sponsor.BL_TC_05;
import Sponsor.BL_TC_07;
import Sponsor.BL_TC_09;
import Sponsor.BL_TC_10;
import Sponsor.BL_TC_11;
import Sponsor.BL_TC_13;
import Sponsor.BL_TC_14;
import org.testng.annotations.BeforeTest;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class SponsorRegressionTest {

	@BeforeTest
	public void afterTest() throws Throwable {
		System.out.println("inside Login page");

		//Launch Browser
		Browser.chromeBrowser();

		//Method for validate Biolab application method
		Biolab.launchBiolabApplication();

		//Method for validate Biolabs member login method
		HomePage.clickBioLabsMemberLogIn();

		//Method for validate sponsor Login method
		Login.sponsorLogin();     


	}
	@Test(priority = 0, groups = "test1")
	public void biolabBysite() throws Exception {
		System.out.println("**************************SPONSOR ADMIN**************************");

		Reporter.log("BL_TC_02",true);

		System.out.println("inside Biolab site");

		System.out.println("BL_TC_02");   
		BL_TC_02.BioLabsBySite();

	}

	@Test(priority = 1, groups = "test2")
	public void bioLabs_global_network() throws Exception {
		Reporter.log("BL_TC_02",true);  
		System.out.println("inside Biolab Global network");
		System.out.println("BL_TC_02");
		BL_TC_02.BioLabs_Global_Network();
	}

	@Test (priority = 2)
	public void titleVisibility() throws Exception
	{
		Reporter.log("BL_TC_01",true);
		System.out.println("BL_TC_01");
		BL_TC_01.titleVisibility();
	}


	@Test (priority = 3)
	public void mapvisibility() throws Exception
	{
		Reporter.log("BL_TC_03",true);
		System.out.println("BL_TC_03");
		BL_TC_03.visibilityMap();
	}

	@Test (priority = 4)
	public void locationTab() throws Exception
	{
		Reporter.log("BL_TC_07",true);
		System.out.println("BL_TC_07");
		BL_TC_07.LocationSelection();
	}



	@Test (priority = 6)
	public void companyGrowth() throws Exception
	{

		//Biolabnetwork.biolnetwork();
		System.out.println("BL_TC_09");
		BL_TC_09.searchpage();


	}

	@Test (priority = 7)
	public void sponsorsearchTest() throws Exception
	{

		//Biolabnetwork.biolnetwork();
		System.out.println("BL_TC_05");
		BL_TC_05.sponsorsrchpag();


	}

	@Test (priority = 8)
	public void Search() throws Exception
	{

		//Biolabnetwork.biolnetwork();
		System.out.println("BL_TC_10");
		BL_TC_10.search();


	}

	@Test (priority = 9)
	public void visibilityTest() throws Exception
	{

		//Biolabnetwork.biolnetwork();
		System.out.println("BL_TC_11");
		BL_TC_11.visiblity();


	}

	@Test (priority = 10)
	public void companyprofileTest() throws Exception
	{

		//Biolabnetwork.biolnetwork();
		System.out.println("BL_TC_13");
		BL_TC_13.companyProfile();


	}


	@Test (priority = 11)
	public void verifyCompanyGrowthTest() throws Exception
	{

		//Biolabnetwork.biolnetwork();
		System.out.println("BL_TC_14");
		BL_TC_14.verifyCompanyGrowth();


	}




	@AfterTest
	public  void closeactivity() throws Exception
	{
		Logout.logoutApplication();
	}



}
