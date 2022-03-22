package Home;

import java.util.concurrent.TimeUnit;

import Browsers.Browser;

public class HomePage extends Browser{
	public static void clickBioLabsMemberLogIn() {
		
		driver.manage().timeouts().implicitlyWait(15000,TimeUnit.SECONDS);
		
		//BioLabs Member Log In button click
		driver.findElement(HomepageLocatores.BioLabsMemberLogInButton).click();
	}
	
	public static void ApplytoBioLabsButton() {
		
		driver.manage().timeouts().implicitlyWait(15000,TimeUnit.SECONDS);
		
		//Apply to BioLabs Button click
		driver.findElement(HomepageLocatores.ApplytoBioLabsButton).click();
	}
}
