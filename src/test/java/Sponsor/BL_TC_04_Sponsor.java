package Sponsor;

import org.openqa.selenium.WebElement;

import Browsers.Browser;

public class BL_TC_04_Sponsor extends Browser{
          
	public static void visibilityMap() throws Exception {
		Thread.sleep(5000);
		System.out.println("***************************BL_TC_04_Sponsor****************************************");

	//map image 	
	WebElement map=driver.findElement(SponsorLocators.Map_image);
	
	if (map.isEnabled()) {
		
		System.out.println("Map is visible");
		
	}
	}
}
