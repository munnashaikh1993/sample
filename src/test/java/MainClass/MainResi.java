package MainClass;

import Application.Biolab;
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
import SiteAdmin.BL_TC_11_Site;
import Sponsor.BL_TC_11;

public class MainResi {

	public static void main(String[] args) throws Exception {
		Browser.chromeBrowser();

		//Method for validate Biolab application method
		Biolab.launchBiolabApplication();

		//Method for validate Biolabs member login method
		HomePage.clickBioLabsMemberLogIn();

		Login.residentLogin();
		
		BL_TC_07_Resident.dd();

	}

}
