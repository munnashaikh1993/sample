package SiteAdmin;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browsers.Browser;

public class BL_TC_13_Site extends Browser{
	public static void menubaritems() throws Exception 
	{
		System.out.println("***************************BL_TC_13_Site****************************************");
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		WebElement sitedropdown	=driver.findElement(SiteAdminLocatores.Site_drop);
		Select select=new Select(sitedropdown);
		select.selectByVisibleText("Ipsen");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		//Companies
		driver.findElement(By.xpath("//a[text()='Companies']")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(4000);

		//Company Card View
		driver.findElement(SiteAdminLocatores.Company_Card_View).click();
		Thread.sleep(2000);

		//Click on learn more button
		driver.findElement(By.xpath("//h5[text()='Cashew Owner']/../..//button[text()=' LEARN MORE ']")).click();
		Thread.sleep(4000);

		//Company profile 
		WebElement Company_Profile_tab= driver.findElement(SiteAdminLocatores.Company_Profile);

		String s122 = Company_Profile_tab.getCssValue("color");
		String c122 = Color.fromString(s122).asHex();
		if (c122.equals("#ee7d31")) {
			System.out.println("Company profile tab is Default selected");
		}
		Thread.sleep(2000);
		
		//Admin
		WebElement Admin_tab= driver.findElement(SiteAdminLocatores.Admin);
		
		String s = Admin_tab.getCssValue("color");
		String c = Color.fromString(s).asHex();

		Admin_tab.click();
		
		String s1 = Admin_tab.getCssValue("color");
		String c1 = Color.fromString(s1).asHex();

		if (c.equals(c1)) {

		}else {
			System.out.println("Admin tab is clickble");
		}
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
         Thread.sleep(2000);
		
		//Company_Profile
		
		String s2 = Company_Profile_tab.getCssValue("color");
		String c2= Color.fromString(s2).asHex();

		Company_Profile_tab.click();
		
		String s12 = Company_Profile_tab.getCssValue("color");
		String c12 = Color.fromString(s12).asHex();
		

		if (c2.equals(c12)) {

		}else {
			System.out.println("Company Profile tab is clickble");
		}
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(2000);

		//Onboarding_Information
		WebElement Onboarding_Information_tab= driver.findElement(SiteAdminLocatores.Company_Data);
		String s3 = Onboarding_Information_tab.getCssValue("color");
		String c3= Color.fromString(s3).asHex();

		Onboarding_Information_tab.click();
		
		String s13 = Onboarding_Information_tab.getCssValue("color");
		String c13 = Color.fromString(s13).asHex();

		if (c3.equals(c13)) {

		}else {
			System.out.println("Onboarding Information tab is clickble");
		}
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(4000);


		//Company_Growth
		WebElement Company_Growth_tab= driver.findElement(SiteAdminLocatores.Company_Growth);
		String s4 = Company_Growth_tab.getCssValue("color");
		String c4= Color.fromString(s4).asHex();
        
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(3000);
		Company_Growth_tab.click();
		
		String s14 = Company_Growth_tab.getCssValue("color");
		String c14 = Color.fromString(s14).asHex();

		if (c4.equals(c14)) {

		}else {
			System.out.println("Company Growth tab is clickble");
		}
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
         Thread.sleep(2000);

		//Invoicing
		WebElement Invoicing_tab= driver.findElement(SiteAdminLocatores.Invoicing);
		String s5 = Invoicing_tab.getCssValue("color");
		String c5= Color.fromString(s5).asHex();

		Invoicing_tab.click();
		
		String s15 = Invoicing_tab.getCssValue("color");
		String c15 = Color.fromString(s15).asHex();

		if (c5.equals(c15)) {

		}else {
			System.out.println("Invoicing tab is clickble");
		}
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(2000);


		//Change_Request
		WebElement Change_Request_tab= driver.findElement(SiteAdminLocatores.Change_Request);
		String s6 = Change_Request_tab.getCssValue("color");
		String c6= Color.fromString(s6).asHex();

		Change_Request_tab.click();
		
		String s16 = Change_Request_tab.getCssValue("color");
		String c16 = Color.fromString(s16).asHex();

		if (c6.equals(c16)) {

		}else {
			System.out.println("Change Request tab is clickble");
		}
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(2000);


		//Privacy

		WebElement Privacy_tab= driver.findElement(SiteAdminLocatores.Privacy);
		String s7 = Privacy_tab.getCssValue("color");
		String c7= Color.fromString(s7).asHex();

		Privacy_tab.click();
		
		String s17 = Privacy_tab.getCssValue("color");
		String c17 = Color.fromString(s17).asHex();

		if (c7.equals(c17)) {

		}else {
			System.out.println("Privacy tab is clickble");
		}
		Thread.sleep(2000);





	}

}
