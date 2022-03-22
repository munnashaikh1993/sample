package Login;
import Browsers.Browser;

public class Login extends Browser {

	//Super Admin Login
	public static void superAdminLogin() 
	{
		//Email
		driver.findElement(LoginPageLocators.Email).sendKeys(LoginPageLocators.superAdminUsername);

		//password
		driver.findElement(LoginPageLocators.Password).sendKeys(LoginPageLocators.superAdminPassword);

		//login button
		driver.findElement(LoginPageLocators.Loginbutton).click();

	}

	//Sponsor Login
	public static void sponsorLogin() 
	{
		//Email
		driver.findElement(LoginPageLocators.Email).sendKeys(LoginPageLocators.SponsorUserUsername);

		//password
		driver.findElement(LoginPageLocators.Password).sendKeys(LoginPageLocators.SponsorUserPassword);

		//login button
		driver.findElement(LoginPageLocators.Loginbutton).click();

	}

	//ResidentLogin
	public static void residentLogin() 
	{
		//Email
		driver.findElement(LoginPageLocators.Email).sendKeys(LoginPageLocators.ResidentAdminUsername);

		//password
		driver.findElement(LoginPageLocators.Password).sendKeys(LoginPageLocators.ResidentAdminPassword);

		//login button
		driver.findElement(LoginPageLocators.Loginbutton).click();
	}

	//Site Admin Login
	public static void siteAdminLogin() 
	{
		//Email
		driver.findElement(LoginPageLocators.Email).sendKeys(LoginPageLocators.siteAdminUsername);

		//password
		driver.findElement(LoginPageLocators.Password).sendKeys(LoginPageLocators.siteAdminPassword);

		//login button
		driver.findElement(LoginPageLocators.Loginbutton).click();
	}
	
	public static void siteAdminLogintuffandepson() 
	{
		//Email
		driver.findElement(LoginPageLocators.Email).sendKeys("salman.site@mailinator.com");

		//password
		driver.findElement(LoginPageLocators.Password).sendKeys(LoginPageLocators.siteAdminPassword);

		//login button
		driver.findElement(LoginPageLocators.Loginbutton).click();
	}
}
