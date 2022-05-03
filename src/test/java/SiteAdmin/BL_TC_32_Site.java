package SiteAdmin;

import java.util.concurrent.TimeUnit;

import Browsers.Browser;

public class BL_TC_32_Site extends Browser
{
    public static void Profile() throws Exception 
    {
		
    	System.out.println("***************************BL_TC_32_Site****************************************");
    	driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
    	Thread.sleep(4000);
    	
    	//Profile Button
    	driver.findElement(SiteAdminLocatores.Profile).click();
    	Thread.sleep(2000);
    	
    	//Edit button
    	driver.findElement(SiteAdminLocatores.Edit_button).click();
    	Thread.sleep(2000);
    	
    	//First name
    	driver.findElement(SiteAdminLocatores.First_name).clear();
    	driver.findElement(SiteAdminLocatores.First_name).sendKeys("Sham");
    	Thread.sleep(2000);
    	
    	//Last Name
    	driver.findElement(SiteAdminLocatores.Last_Name).clear();
    	driver.findElement(SiteAdminLocatores.Last_Name).sendKeys("Patil");
    	Thread.sleep(2000);
    	
    	//Title
    	driver.findElement(SiteAdminLocatores.Title).clear();
    	driver.findElement(SiteAdminLocatores.Title).sendKeys("Tester");
    	Thread.sleep(2000);
    	
    	//Phone no
    	driver.findElement(SiteAdminLocatores.Phone_no).clear();
    	driver.findElement(SiteAdminLocatores.Phone_no).sendKeys("8855223366");
    	Thread.sleep(2000);
    	
    	driver.findElement(SiteAdminLocatores.update_photo).click();
    	Thread.sleep(1000);
    	
    	Runtime.getRuntime().exec("D:\\Biolab\\Biolab_Sprint_3\\AutoIt\\updatePhoto.exe");
    	Thread.sleep(2000);
    	
    	driver.findElement(SiteAdminLocatores.Update_profile_button).click();
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}  
}
