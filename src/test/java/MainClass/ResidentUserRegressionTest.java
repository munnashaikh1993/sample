package MainClass;

import org.testng.annotations.Test;

import Application.Biolab;
import Browsers.Browser;
import Home.HomePage;
import Login.Login;
import LogoutAndClose.Logout;
import ResidentUser.BL_TC_01_ResidentUser;
import ResidentUser.BL_TC_02_ResidentUser;
import ResidentUser.BL_TC_03_ResidentUser;
import ResidentUser.BL_TC_04_ResidentUser;
import ResidentUser.BL_TC_05_ResidentUser;
import ResidentUser.BL_TC_06_ResidentUser;
import ResidentUser.BL_TC_07_ResidentUser;
import ResidentUser.BL_TC_08_ResidentUser;
import ResidentUser.BL_TC_09_ResidentUser;
import ResidentUser.BL_TC_10_ResidentUser;
import ResidentUser.BL_TC_11_ResidentUser;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ResidentUserRegressionTest {

	@BeforeTest
	public void beforeTest() 
	{
		Browser.chromeBrowser();

		//Method for validate Biolab application method
		Biolab.launchBiolabApplication();

		//Method for validate Biolabs member login method
		HomePage.clickBioLabsMemberLogIn();
		
		Login.ResidentUserLogin();
	}

	@Test (priority = 0)
	public void dashboard_Test() throws Exception 
	{
		BL_TC_01_ResidentUser.dashboard();
	}
	
	@Test (priority = 1)
	public void site_members_Test() throws Exception 
	{
		BL_TC_02_ResidentUser.site_members();
	}
	
	@Test (priority = 2)
	public void sitestaff_Test() throws Exception 
	{
		BL_TC_03_ResidentUser.sitestaff();
	}
	
	@Test (priority = 3)
	public void sitecompanies_Test() throws Exception 
	{
		BL_TC_04_ResidentUser.sitecompanies();
	}
	
	@Test (priority = 4)
	public void CompanyInformation_Test() throws Exception 
	{
		BL_TC_05_ResidentUser.CompanyInformation();
	}
	
	@Test (priority = 5)
	public void SponsorProfile_Test() throws Exception 
	{
		BL_TC_06_ResidentUser.SponsorProfile();
	}
	
	@Test (priority = 6)
	public void Company_Profile_Test() throws Exception
	{
		BL_TC_07_ResidentUser.Company_Profile();
	}
	
	@Test (priority = 7)
	public void invoice_Test() throws Exception 
	{
		BL_TC_08_ResidentUser.invoice();
	}
	
	@Test (priority = 8)
	public void change_Test() throws Exception 
	{
		BL_TC_09_ResidentUser.change();
	}
	
	@Test (priority = 9)
	public void profile_Test() throws Exception 
	{
		BL_TC_10_ResidentUser.profile();
	}
	
	@Test (priority = 10)
	public void companydata_Test() throws Exception 
	{
		BL_TC_11_ResidentUser.companydata();
	}


	@AfterTest
	public void afterTest() throws Exception 
	{
		Logout.logoutApplication();
	}

}
