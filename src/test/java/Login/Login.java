package Login;
import java.util.concurrent.TimeUnit;

import Browsers.Browser;

public class Login extends Browser {
	
	public static void ResidentUserLogin () 
	{
		driver.findElement(LoginPageLocators.Email).sendKeys("pri.RU@mailinator.com");

		//password
		driver.findElement(LoginPageLocators.Password).sendKeys("test@123");

		//login button
		driver.findElement(LoginPageLocators.Loginbutton).click();
	}

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
	public static void residentAdminLogin() 
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
	
	public static void siteAdminLogintuffandepson() throws Exception 
	
	{
		//Email
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(LoginPageLocators.Email).sendKeys("salman.sa@mailinator.com");

		//password
		driver.findElement(LoginPageLocators.Password).sendKeys(LoginPageLocators.siteAdminPassword);

		//login button
		driver.findElement(LoginPageLocators.Loginbutton).click();
	}
}
