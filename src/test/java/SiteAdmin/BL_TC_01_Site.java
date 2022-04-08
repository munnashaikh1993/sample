package SiteAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import Browsers.Browser;

public class BL_TC_01_Site extends Browser{
	public static void validateSiteAdminApplications() throws Exception {
		System.out.println("***************************BL_TC_01_Site****************************************");
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS); 
		Thread.sleep(2000);
		//Companies
		WebElement Companies_Header=driver.findElement(ApplicationLocatores.Companies);
		if (Companies_Header.isEnabled()) {
			System.out.println("Companies text visible in header");
		}
		Thread.sleep(1000);

		//Manage Users
		WebElement Manage_Users_Header=driver.findElement(ApplicationLocatores.Manage_Users);
		if (Manage_Users_Header.isEnabled()) {
			System.out.println("Manage Users text visible in header");
		}
		Thread.sleep(1000);

		//Invoicing/Waitlist
		WebElement Invoicing_Waitlist_Header=driver.findElement(ApplicationLocatores.Invoicing_Waitlist);
		if (Invoicing_Waitlist_Header.isEnabled()) {
			System.out.println("Invoicing waitlist text visible in header");
		}
		Thread.sleep(1000);

		//Metrics
		WebElement Metrics_Header=driver.findElement(ApplicationLocatores.Metrics);
		if (Metrics_Header.isEnabled()) {
			System.out.println("Metrics text visible in header");
		}
		Thread.sleep(1000);

		//Icons Validation

		//Directory
		WebElement Directory_Icon=driver.findElement(ApplicationLocatores.Directory);
		if (Directory_Icon.isEnabled()) {
			System.out.println("Directory Icon visible in header");
		}
		Thread.sleep(1000);

		//Sponsor View
		WebElement Sponsor_View_Icon=driver.findElement(ApplicationLocatores.Sponsor_View);
		if (Sponsor_View_Icon.isEnabled()) {
			System.out.println("Sponsor View Icon visible in header");
		}
		Thread.sleep(1000);

		//Application Form
		WebElement Application_Form_Icon=driver.findElement(ApplicationLocatores.Application_Form);
		if (Application_Form_Icon.isEnabled()) {
			System.out.println("Application Form Icon visible in header");
		}
		Thread.sleep(1000);

		//Configuration
		WebElement Configuration_Icon=driver.findElement(ApplicationLocatores.Configuration);
		if (Configuration_Icon.isEnabled()) {
			System.out.println("Configuration Icon visible in header");
		}
		Thread.sleep(1000);

		//My Profile
		WebElement My_Profile_Icon=driver.findElement(ApplicationLocatores.My_Profile);
		if (My_Profile_Icon.isEnabled()) {
			System.out.println("My Profile Icon visible in header");
		}
		Thread.sleep(2000);

		//Log Out
		WebElement Log_Out_Icon=driver.findElement(ApplicationLocatores.Log_Out);
		if (Log_Out_Icon.isEnabled()) {
			System.out.println("Log Out Icon visible in header");
		}


	}
}
