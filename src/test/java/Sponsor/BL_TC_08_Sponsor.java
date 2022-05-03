package Sponsor;

import java.util.concurrent.TimeUnit;


import Browsers.Browser;

public class BL_TC_08_Sponsor extends Browser{
	public static void LocationSelection() throws Exception {
		System.out.println("***************************BL_TC_08_Sponsor****************************************");

		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		Thread.sleep(2000);

		//click on Location
		driver.findElement(SponsorLocators.Location).click();
		Thread.sleep(2000);
		//click on check box
		driver.findElement(SponsorLocators.checkbox).click();
		Thread.sleep(2000);
		//click on Location title 
		driver.findElement(SponsorLocators.Location).click();
		
		
		
	}

}
