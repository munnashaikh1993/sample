package MainClass;

import org.testng.annotations.Test;

import Application.Biolab;
import Browsers.Browser;
import Home.HomePage;
import Login.Login;
import LogoutAndClose.Logout;
import SiteAdmin.BL_TC_01_Site;
import SiteAdmin.BL_TC_02_Site;
import SiteAdmin.BL_TC_03_Site;
import SiteAdmin.BL_TC_06_Site;
import SiteAdmin.BL_TC_07_Site;
import SiteAdmin.BL_TC_08_Site;
import SiteAdmin.BL_TC_09_Site;
import SiteAdmin.BL_TC_10_Site;
import SiteAdmin.BL_TC_12_Site;
import SiteAdmin.BL_TC_13_Site;
import SiteAdmin.BL_TC_14_Site;
import SiteAdmin.BL_TC_15_Site;
import SiteAdmin.BL_TC_16_Site;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SiteRegressionTest {
	@BeforeTest
	public void beforeTest() {
	
//		Browser.chromeBrowser();
//
//		//Method for validate Biolab application method
//		Biolab.launchBiolabApplication();
//
//		//Method for validate Biolabs member login method
//		HomePage.clickBioLabsMemberLogIn();

		Login.siteAdminLogin();
		
		
	}
	
	@Test (priority = 0)
	public void validateSiteAdminApplications_Test() throws Exception 
	{
		System.out.println("**************************SITE ADMIN**************************");
		BL_TC_01_Site.validateSiteAdminApplications();

	}
	
	@Test (priority = 1)
	public void filterCompanys() throws Exception 
	{
		BL_TC_02_Site.filterCompanys();
	}

	@Test (priority = 2)
	public void defaultsite_and_selectedsite() throws Exception 
	{
		BL_TC_03_Site.defaultsite_and_selectedsite();
	}

	@Test (priority = 3)
	public void Add_edit_Delete_Test() throws Exception 
	{
		BL_TC_06_Site.Add_edit_Delete();
	}

	@Test (priority = 4)
	public void Add_Edit_Delete_Resident_Admin_Test() throws Exception 
	{
		BL_TC_07_Site.Add_Edit_Delete_Resident_Admin();
	}

	@Test (priority = 5)
	public void menubaritems_Test() throws Exception 
	{
		BL_TC_08_Site.menubaritems();
	}
	
	@Test (priority = 6)
	public void VISIT_WEBSITE_Test() throws Exception 
	{
		BL_TC_09_Site.VISIT_WEBSITE();
	}

	@Test (priority = 7)
	public void Onboarding_Information_tab_Test() throws Exception 
	{
		BL_TC_10_Site.Onboarding_Information_tab();
	}
	
	@Test (priority = 8)
	public void Company_Growth_Test() throws Exception 
	{
		BL_TC_12_Site.Company_Growth();
	}

	@Test (priority = 9)
	public void Invoicing_Test() throws Exception 
	{
		BL_TC_13_Site.Invoicing();
	}

	@Test (priority = 10)
	public void Configuration_Test() throws Exception 
	{
		BL_TC_14_Site.Configuration();
	}

	@Test (priority = 11)
	public void invoicing_Waitlist_Test() throws Exception 
	{
		BL_TC_15_Site.invoicing_Waitlist();
	}

	@Test (priority = 12)
	public void Profile_Test() throws Exception 
	{
		BL_TC_16_Site.Profile();
	}
	
	


	@AfterTest
	public void afterTest() throws Exception {
	    Logout.logoutApplication();

	}

}
