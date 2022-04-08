package SiteAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Browsers.Browser;

public class BL_TC_12_Site extends Browser
{
	public static void ReadWriteaccess() throws Exception 
	{  
		System.out.println("***************************BL_TC_12_Site****************************************");
		driver.manage().timeouts().implicitlyWait(15000,TimeUnit.SECONDS);
		Thread.sleep(3000);
		//Site dropdown
		WebElement sitedropdown= driver.findElement(SiteAdminLocatores.Site_drop);
		

		//Manage Users
		WebElement MU= driver.findElement(SiteAdminLocatores.Manage_Users);

		//Invoicing Waitlist
		WebElement IW=driver.findElement(SiteAdminLocatores.Invoicing_Waitlist);

		//Metrics
		WebElement M=driver.findElement(SiteAdminLocatores.Metrics);
		
		Select select=new Select(sitedropdown);
		select.selectByVisibleText("Ipsen");
		
//		WebElement ss= select.getFirstSelectedOption();
//		System.out.println("selected dropdown is :-"+ss.getText());
		
		Actions act=new Actions(driver);
//		act.click(sitedropdown).perform();
//		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		

		

		if((driver.getPageSource().contains("Manage Users")) && (driver.getPageSource().contains("Invoicing/Waitlist")) && (driver.getPageSource().contains("Metrics"))){
			System.out.println("This site access to read and write opretion");
		}else{
			System.out.println("This site access only read opretion");
		}

		//Company Card View
		driver.findElement(SiteAdminLocatores.Company_Card_View).click();
		Thread.sleep(2000);

		//Click on learn more button
		driver.findElement(By.xpath("//h5[text()='Cashew Owner']/../..//button[text()=' LEARN MORE ']")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(2000);

		if ((driver.getPageSource().contains("Admin")) && (driver.getPageSource().contains("Company Data")) && (driver.getPageSource().contains("Company Growth"))  && (driver.getPageSource().contains("Invoicing")) && (driver.getPageSource().contains("Change Request")) && (driver.getPageSource().contains("Privacy"))) {
			System.out.println("This Page access to read and write opretion ");
		} else {
			System.out.println("This Page not access to read and write opretion ");
		}
          
		Thread.sleep(2000);
		WebElement sitedropdown1= driver.findElement(By.id("mainSiteDropdown"));
		act.click(sitedropdown1).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		
		try {

			if ((MU.isEnabled()) && (IW.isEnabled()) && (M.isEnabled())) 
			{
				System.out.println("This site access to read and write opretion");
			}
			else 
			{
				System.out.println("This site access only read opretion");
			}
		}
		catch (Exception e) {


			driver.navigate().refresh();
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			Thread.sleep(3000);


			if((driver.getPageSource().contains("Manage Users")) && (driver.getPageSource().contains("Invoicing/Waitlist")) && (driver.getPageSource().contains("Metrics"))){
				System.out.println("This site access to read and write opretion");
			}else{
				System.out.println("This site access only read opretion");
			}

			//Company Card View
			driver.findElement(SiteAdminLocatores.Company_Card_View).click();
			Thread.sleep(2000);

			//Click on learn more button
			driver.findElement(By.xpath("//h5[text()='Cashew Owner']/../..//button[text()=' LEARN MORE ']")).click();
			Thread.sleep(4000);

			if ((driver.getPageSource().contains("Admin")) && (driver.getPageSource().contains("Company Data")) && (driver.getPageSource().contains("Company Growth"))  && (driver.getPageSource().contains("Invoicing")) && (driver.getPageSource().contains("Change Request")) && (driver.getPageSource().contains("Privacy"))) {
				System.out.println("This Page access to read and write opretion ");
			} else {
				System.out.println("This Page access only read and write opretion ");
			} 


		}


	}

}
