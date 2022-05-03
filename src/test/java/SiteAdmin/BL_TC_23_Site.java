package SiteAdmin;

import java.util.concurrent.TimeUnit;

import Browsers.Browser;

public class BL_TC_23_Site extends Browser 
{
	public static void invoicing_Waitlist() throws Exception 
	{
		   System.out.println("***************************BL_TC_23_Site****************************************");
           driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
           Thread.sleep(4000);
           
           //Invoicing Waitlist
           driver.findElement(SiteAdminLocatores.Invoicing_Waitlist).click();
           Thread.sleep(5000);
           
           //Month
           driver.findElement(SiteAdminLocatores.Month).sendKeys("June");
           Thread.sleep(2000);
           
           //CSV
           driver.findElement(SiteAdminLocatores.CSV_button).click();
           Thread.sleep(2000);
           
	}

}