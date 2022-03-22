package Sponsor;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import Browsers.Browser;

public class BL_TC_01 extends Browser{
	public static void titleVisibility() throws Exception {
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		System.out.println("***************************BL_TC_01****************************************");

		//BioLabs Network
		WebElement bionetwork= driver.findElement(SponsorLocators.BioLabsNetworklink);

		if (bionetwork.isEnabled()) {
			System.out.println(bionetwork.getText());
		}
		
		
		//Resident Companies
		WebElement ResidentCompanies= driver.findElement(SponsorLocators.ResidentCompanieslink);
		
		if (ResidentCompanies.isEnabled()) {
			System.out.println(ResidentCompanies.getText());
		}
		
		Thread.sleep(5000);
		
		//BioLabs Global Network
		WebElement BioLabsGlobal=driver.findElement(SponsorLocators.BioLabsGlobalNetwork);
		
		if (BioLabsGlobal.isEnabled()) {
			System.out.println(BioLabsGlobal.getText());
		}
		
		//BioLabs By Site
		WebElement BioLabs_By_Site=driver.findElement(SponsorLocators.BioLabsBySite);
		
		if (BioLabs_By_Site.isEnabled()) {
			System.out.println(BioLabs_By_Site.getText());
		}
		
		
		
		//Recently joined BioLabs
		WebElement Recentlyjoined=driver.findElement(SponsorLocators.RecentlyjoinedBioLabs);
		
		if (Recentlyjoined.isEnabled()) {
			System.out.println(Recentlyjoined.getText());
		}
		
		System.out.println();
		
		
	}  
}
