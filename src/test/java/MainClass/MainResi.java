package MainClass;

import Application.Biolab;
import ApplicationForm.ApplicationForm;
import Browsers.Browser;
import Home.HomePage;
import Login.Login;
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
import ResidentUser.BL_TC_08_ResidentUser;
import ResidentUser.BL_TC_09_ResidentUser;
import ResidentUser.BL_TC_10_ResidentUser;
import ResidentUser.BL_TC_11_ResidentUser;
import SiteAdmin.BL_TC_09_Site;
import SiteAdmin.BL_TC_10_Site;
import SiteAdmin.BL_TC_11_Site;
import SiteAdmin.BL_TC_12_Site;
import SiteAdmin.BL_TC_18_Site;
import SiteAdmin.BL_TC_19_Site;
import SiteAdmin.BL_TC_20_Site;
import SiteAdmin.BL_TC_21_Site;
import SiteAdmin.BL_TC_22_Site;
import SiteAdmin.BL_TC_17_Site;
import SiteAdmin.BL_TC_13_Site;
import SiteAdmin.BL_TC_16_Site;
import SiteAdmin.BL_TC_32_Site;
import SiteAdmin.BL_TC_32_A_Site;
import SiteAdmin.BL_TC_01_Site;
import SiteAdmin.BL_TC_02_Site;
import SiteAdmin.BL_TC_03_Site;
import SiteAdmin.BL_TC_04_Site;
import SiteAdmin.BL_TC_05_Site;
import SiteAdmin.BL_TC_06_Site;
import SiteAdmin.BL_TC_08_Site;
import SiteAdmin.BL_TC_09_A_Site;
import SiteAdmin.BL_TC_07_Site;
import SiteAdmin.BL_TC_08_A_Site;
import SiteAdmin.BL_TC_14_Site;
import SiteAdmin.BL_TC_15_Site;
import SiteAdmin.BL_TC_23_Site;
import SiteAdmin.BL_TC_24_Site;
import SiteAdmin.BL_TC_27_Site;
import SiteAdmin.BL_TC_28_Site;
import SiteAdmin.BL_TC_29_Site;
import SiteAdmin.BL_TC_30_Site;
import SiteAdmin.BL_TC_31_Site;
import Sponsor.BL_TC_01_Sponsor;
import Sponsor.BL_TC_02_Sponsor;
import Sponsor.BL_TC_03_Sponsor;
import Sponsor.BL_TC_06_Sponsor;
import Sponsor.BL_TC_08_Sponsor;
import Sponsor.BL_TC_09_Sponsor;
import Sponsor.BL_TC_10_Sponsor;
import Sponsor.BL_TC_11_Sponsor;
import Sponsor.BL_TC_04_Sponsor;
import Sponsor.BL_TC_05_Sponsor;
import Sponsor.BL_TC_07_Sponsor;
import Sponsor.BL_TC_12_Sponsor;
import Sponsor.BL_TC_13_Sponsor;
import Sponsor.BL_TC_15_Sponsor;
import Sponsor.BL_TC_14_Sponsor;

public class MainResi {

	

	public static void main(String[] args) throws Exception {
		Browser.chromeBrowser();

		//Method for validate Biolab application method
		Biolab.launchBiolabApplication();

		//Method for validate Biolabs member login method
		HomePage.clickBioLabsMemberLogIn();
		
		//ApplicationForm.createApplication();
		

		Login.siteAdminLogintuffandepson();
		
		

		//Login.sponsorLogin();

		/*BL_TC_01_Site.validateSiteAdminApplications();  //Done

		BL_TC_02_Site.SortByColumn();  //Done

		BL_TC_03_Site.defaultsite_and_selectedsite();  //Done

		BL_TC_04_Site.Cpompany_card_table_view();;  //Done

		BL_TC_05_Site.Tile_View();  //Done

	    BL_TC_06_Site.Sort_By_Column();  //Done

		BL_TC_07_Site.filterCompanys();  //Done

		BL_TC_08_Site.Add_edit_Delete();  //Done

		BL_TC_09_Site.Add_Edit_Delete_Resident_Admin();  //Done

		BL_TC_10_Site.Add_Edit_Delete_Resident_User();  //Done

		BL_TC_11_Site.Site_accesible();  //Not Done

		BL_TC_12_Site.ReadWriteaccess();  //Done

		BL_TC_13_Site.menubaritems();  //Done

		BL_TC_14_Site.Update_all_status();  //Done

		BL_TC_16_Site.VISIT_WEBSITE();  //Done

		BL_TC_17_Site.Onboarding_Information_tab();  //Done

		BL_TC_18_Site.Company_Growth();  //Done

		BL_TC_19_Site.Invoicing();  //Done

		BL_TC_23_Site.invoicing_Waitlist(); //Done

		BL_TC_27_Site.Configuration();  //Done

		BL_TC_32_Site.Profile();  //Done
		 */


		//Sponsor
		/*
//		BL_TC_01_Sponsor.titleVisibility();
//
//		BL_TC_02_Sponsor.BioLabs_Global_Network();
//
//		//BL_TC_03_Sponsor.findAvalablesite();
//
//		BL_TC_04_Sponsor.visibilityMap();
//
//		BL_TC_05_Sponsor.sponsorsrchpag();
//
//		// BL_TC_06_Sponsor.recentJoin();
//
//		// BL_TC_07_Sponsor.recentjoin();
//
//		BL_TC_08_Sponsor.LocationSelection();
//
//		 BL_TC_09_Sponsor.searchpage();
//
//		 BL_TC_10_Sponsor.CheckChangesRefresh();
//
//		BL_TC_11_Sponsor.search();
//
//		BL_TC_12_Sponsor.visiblity();
//
//		BL_TC_13_Sponsor.All_Summary(); //13 and 14 together
//
//		BL_TC_14_Sponsor.companyProfile();    
//
//		BL_TC_15_Sponsor.verifyCompanyGrowth();
//
//		 */
		//


		
//		BL_TC_27_Site.Configuration();
//		BL_TC_28_Site.Site_Configuration();
//		BL_TC_01_Site.validateSiteAdminApplications();
//		BL_TC_02_Site.SortByColumn();
//		BL_TC_03_Site.defaultsite_and_selectedsite();
//		BL_TC_04_Site.Cpompany_table_view();
//		BL_TC_05_Site.Tile_View();
//		BL_TC_06_Site.Sort_By_Column();
//		BL_TC_07_Site.filterCompanys();
//		BL_TC_08_A_Site.Onbording();
//		BL_TC_09_A_Site.Resident_Table_View_onboarding_offboarding();
//		BL_TC_08_Site.Add_edit_Delete();
//		BL_TC_09_Site.Add_Edit_Delete_Resident_Admin();
//		BL_TC_10_Site.Add_Edit_Delete_Resident_User();
//		BL_TC_11_Site.Site_accesible();
//		BL_TC_12_Site.ReadWriteaccess();
//		BL_TC_13_Site.menubaritems();
//		BL_TC_14_Site.Update_all_status();
//		BL_TC_15_Site.Forword_Application();
//		BL_TC_16_Site.VISIT_WEBSITE();
//		BL_TC_17_Site.Onboarding_Information_tab();
//		BL_TC_18_Site.Company_Growth();
//		BL_TC_19_Site.Invoicing();
//		BL_TC_20_Site.Retainer_Paid_Date();
//		BL_TC_21_Site.Change_Request();
//		BL_TC_22_Site.name();
//		BL_TC_23_Site.invoicing_Waitlist();
//		BL_TC_24_Site.Waitlist();
//		
//		BL_TC_29_Site.Events_and_Training();
//		BL_TC_30_Site.Onboarding();
//		BL_TC_31_Site.Offboarding();
//		BL_TC_32_A_Site.Partners_and_Sponsors();
//		BL_TC_32_Site.Profile();
		
		BL_TC_02_Site.SortByColumn();
		
		
		
		
		
		
		
		
		
		
		
		



		











	}

}
