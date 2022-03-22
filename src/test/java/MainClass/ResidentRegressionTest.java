package MainClass;

import org.testng.annotations.Test;

import Application.Biolab;
import Browsers.Browser;
import Home.HomePage;
import Login.Login;
import LogoutAndClose.Logout;
import ResidentAdmin.BL_TC_01_Resident;
import ResidentAdmin.BL_TC_02_Resident;
import ResidentAdmin.BL_TC_03_Resident;
import ResidentAdmin.BL_TC_04_Resident;
import ResidentAdmin.BL_TC_05_Resident;
import ResidentAdmin.BL_TC_06_Resident;
import ResidentAdmin.BL_TC_07_Resident;
import ResidentAdmin.BL_TC_08_Resident;
import ResidentAdmin.BL_TC_09_Resident;
import ResidentAdmin.BL_TC_10_Resident;
import ResidentAdmin.BL_TC_11_Resident;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ResidentRegressionTest {
	@BeforeTest
	public void beforeTest() 
	{
////		//Launch Browser
//		Browser.chromeBrowser();
//
//		//Method for validate Biolab application method
//		Biolab.launchBiolabApplication();
//
//		//Method for validate Biolabs member login method
//		HomePage.clickBioLabsMemberLogIn();

		Login.residentLogin();
	}


	@Test(priority = 0)
	public void CompanyInformation_Test () throws Exception 
	{
		System.out.println("**************************RESIDENT ADMIN**************************");
		BL_TC_01_Resident.Dashboard();
	}

	@Test(priority = 1)
	public void onboarding_Test() throws Exception 
	{
		BL_TC_02_Resident.sitemembers();
	}

	@Test(priority = 2)
	public void onboardinginformation_Test() throws Exception 
	{
		BL_TC_03_Resident.ResidentStaff();
	}

	@Test(priority = 3)
	public void invoice_Test() throws Exception 
	{
		BL_TC_04_Resident.sitecompanies();
	}


	@Test(priority = 4)
	public void change_Test() throws Exception 
	{
		BL_TC_05_Resident.LearnMore();
	}


	@Test(priority = 5)
	public void Dashboard_Test() throws Exception 
	{
		BL_TC_06_Resident.myprofile();
	}

	@Test(priority = 6)
	public void sitemembers_Test() throws Exception 
	{
		BL_TC_08_Resident.CompanyInformation();
	}

	@Test(priority = 7)
	public void ResidentStaff_Test() throws Exception 
	{
		BL_TC_09_Resident.onboarding();
	}

	@Test(priority = 8)
	public void sitecompanies_Test() throws Exception 
	{
		BL_TC_10_Resident.invoice();
	}

	@Test(priority = 9)
	public void LearnMore_Test() throws Exception 
	{
		BL_TC_11_Resident.change();
	}

//	@Test(priority = 10)
//	public void myprofile_Test() throws Exception 
//	{
//		BL_TC_06_Resident.myprofile();
//	}




	@AfterTest
	public void afterTest() throws Exception 
	{
		Logout.logoutApplication();
		Logout.Close();
	}

}
