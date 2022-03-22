package Login;

import org.openqa.selenium.By;

public class LoginPageLocators {

	//Super Admin credencial
	//Email
	public static String superAdminUsername="superadmin@biolabs.io";
	//password
	public static String superAdminPassword="Test&123";

	//Site Admin 
	//Email
	public static String siteAdminUsername="Salman123@mailinator.com";
	//password
	public static String siteAdminPassword="test@123";

	//Resident Admin 
	//Email
	public static String ResidentAdminUsername="prinres@mailinator.com";
	//password
	public static String ResidentAdminPassword="test@123";
	
	//Sponsor User
	//Email
		public static String SponsorUserUsername="salman.sponsor@mailinator.com";
		//password
		public static String SponsorUserPassword="test@123";
		
	//Locators	
	//Email text box
	public static By Email=By.xpath("//input[@formcontrolname='email']");

	//Password text box
	public static By Password=By.xpath("//input[@formcontrolname='password']");

	//Login button
	public static By Loginbutton=By.xpath("//button[text()=' Login ']");

	//Forget Password
	public static By ForgotPassword=By.xpath("//a[text()='Forgot Password?']");
}
