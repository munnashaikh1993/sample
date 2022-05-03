package MainClass;

import org.testng.annotations.Test;

import Application.Biolab;
import Browsers.Browser;
import Home.HomePage;
import Login.Login;
import LogoutAndClose.Logout;
import SiteAdmin.BL_TC_01_Site;
import SiteAdmin.BL_TC_02_Site;
import SiteAdmin.BL_TC_07_Site;
import SiteAdmin.BL_TC_08_A_Site;
import SiteAdmin.BL_TC_03_Site;
import SiteAdmin.BL_TC_04_Site;
import SiteAdmin.BL_TC_05_Site;
import SiteAdmin.BL_TC_06_Site;
import SiteAdmin.BL_TC_08_Site;
import SiteAdmin.BL_TC_09_A_Site;
import SiteAdmin.BL_TC_09_Site;
import SiteAdmin.BL_TC_10_Site;
import SiteAdmin.BL_TC_11_Site;
import SiteAdmin.BL_TC_12_Site;
import SiteAdmin.BL_TC_13_Site;
import SiteAdmin.BL_TC_14_Site;
import SiteAdmin.BL_TC_15_Site;
import SiteAdmin.BL_TC_16_Site;
import SiteAdmin.BL_TC_17_Site;
import SiteAdmin.BL_TC_18_Site;
import SiteAdmin.BL_TC_19_Site;
import SiteAdmin.BL_TC_20_Site;
import SiteAdmin.BL_TC_21_Site;
import SiteAdmin.BL_TC_22_Site;
import SiteAdmin.BL_TC_27_Site;
import SiteAdmin.BL_TC_28_Site;
import SiteAdmin.BL_TC_29_Site;
import SiteAdmin.BL_TC_30_Site;
import SiteAdmin.BL_TC_31_Site;
import SiteAdmin.BL_TC_23_Site;
import SiteAdmin.BL_TC_24_Site;
import SiteAdmin.BL_TC_32_Site;
import SiteAdmin.BL_TC_32_A_Site;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SiteRegressionTest {
	@BeforeTest
	public void beforeTest() throws Throwable {
	
		Browser.chromeBrowser();

		//Method for validate Biolab application method
		Biolab.launchBiolabApplication();

		//Method for validate Biolabs member login method
		HomePage.clickBioLabsMemberLogIn();

		Login.siteAdminLogintuffandepson();
		
		
	}
	
	@Test (priority = 0)
	public void Configuration_Test() throws Exception 
	{
		System.out.println("**************************SITE ADMIN**************************");
		BL_TC_27_Site.Configuration();

	}
	
	@Test (priority = 1)
	public void Site_Configuration_Test() throws Exception 
	{
		BL_TC_28_Site.Site_Configuration();
	}

	@Test (priority = 2)
	public void validateSiteAdminApplications_Test() throws Exception 
	{
		BL_TC_01_Site.validateSiteAdminApplications();
	}

	@Test (priority = 3)
	public void SortByColumn_Test() throws Exception 
	{
		BL_TC_02_Site.SortByColumn();
	}

	@Test (priority = 4)
	public void defaultsite_and_selectedsite_Test() throws Exception 
	{
		BL_TC_03_Site.defaultsite_and_selectedsite();
	}

	@Test (priority = 5)
	public void Cpompany_table_view_Test() throws Exception 
	{
		BL_TC_04_Site.Cpompany_table_view();
	}
	
	@Test (priority = 6)
	public void Tile_View_Test() throws Exception 
	{
		BL_TC_05_Site.Tile_View();
	}

	@Test (priority = 7)
	public void Sort_By_Column_Test() throws Exception 
	{
		BL_TC_06_Site.Sort_By_Column();
	}
	
	@Test (priority = 8)
	public void filterCompanys_Test() throws Exception 
	{
		BL_TC_07_Site.filterCompanys();
	}

	@Test (priority = 9)
	public void Onbording_Test() throws Exception 
	{
		BL_TC_08_A_Site.Onbording();
	}

	@Test (priority = 10)
	public void Resident_Table_View_onboarding_offboarding_Test() throws Exception 
	{
		BL_TC_09_A_Site.Resident_Table_View_onboarding_offboarding();
	}

	@Test (priority = 11)
	public void Add_edit_Delete_Test() throws Exception 
	{
		BL_TC_08_Site.Add_edit_Delete();
	}

	@Test (priority = 12)
	public void Add_Edit_Delete_Resident_Admin_Test() throws Exception 
	{
		BL_TC_09_Site.Add_Edit_Delete_Resident_Admin();
	}
	
	@Test (priority = 13)
	public void Add_Edit_Delete_Resident_User_Test() throws Exception 
	{
		BL_TC_10_Site.Add_Edit_Delete_Resident_User();
	}

	@Test (priority = 14)
	public void Site_accesible_Test() throws Exception 
	{
		BL_TC_11_Site.Site_accesible();
	}
	
	@Test (priority = 15)
	public void ReadWriteaccess_Test() throws Exception 
	{
		BL_TC_12_Site.ReadWriteaccess();
	}

	@Test (priority = 16)
	public void menubaritems_Test() throws Exception 
	{
		BL_TC_13_Site.menubaritems();
	}
	
	@Test (priority = 17)
	public void Update_all_status_Test() throws Exception 
	{
		BL_TC_14_Site.Update_all_status();
	}

	@Test (priority = 18)
	public void Forword_Application_Test() throws Exception 
	{
		BL_TC_15_Site.Forword_Application();
	}
	
	@Test (priority = 19)
	public void VISIT_WEBSITE_Test() throws Exception 
	{
		BL_TC_16_Site.VISIT_WEBSITE();
	}

	@Test (priority = 20)
	public void Onboarding_Information_tab_Test() throws Exception 
	{
		BL_TC_17_Site.Onboarding_Information_tab();
	}
	
	@Test (priority = 21)
	public void Company_Growth_Test() throws Exception 
	{
		BL_TC_18_Site.Company_Growth();
	}

	@Test (priority = 22)
	public void Invoicing_Test() throws Exception 
	{
		BL_TC_19_Site.Invoicing();
	}
	
	@Test (priority = 23)
	public void Retainer_Paid_Date_Test() throws Exception 
	{
		BL_TC_20_Site.Retainer_Paid_Date();
	}

	@Test (priority = 24)
	public void Change_Request_Test() throws Exception 
	{
		BL_TC_21_Site.Change_Request();
	}
	
	@Test (priority = 25)
	public void name_Test() throws Exception 
	{
		BL_TC_22_Site.name();
	}
	
	@Test (priority = 26)
	public void invoicing_Waitlist_Test() throws Exception 
	{
		BL_TC_23_Site.invoicing_Waitlist();
	}

	@Test (priority = 27)
	public void Waitlist_Test() throws Exception 
	{
		BL_TC_24_Site.Waitlist();
	}
	
	@Test (priority = 28)
	public void Events_and_Training_Test() throws Exception 
	{
		BL_TC_29_Site.Events_and_Training();
	}

	@Test (priority = 29)
	public void Onboarding() throws Exception 
	{
		BL_TC_30_Site.Onboarding();
	}
	
	@Test (priority = 30)
	public void Offboarding_Test() throws Exception 
	{
		BL_TC_31_Site.Offboarding();
	}
	
	@Test (priority = 31)
	public void Partners_and_Sponsors_Test() throws Exception 
	{
		BL_TC_32_A_Site.Partners_and_Sponsors();
	}
	
	
	@Test (priority = 32)
	public void Profile_Test() throws Exception 
	{
		BL_TC_32_Site.Profile();
	}
	
	


	@AfterTest
	public void afterTest() throws Exception {
	    Logout.logoutApplication();

	}

}
