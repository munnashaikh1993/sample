package SiteAdmin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Browsers.Browser;

public class BL_TC_07_Site extends Browser{
	public static void filterCompanys() throws Exception 
	{
		System.out.println("***************************BL_TC_07_Site****************************************");
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		Thread.sleep(3000);
		Actions act=new Actions(driver);

		WebElement sitee=driver.findElement(SiteAdminLocatores.Site_drop);
		
		
		Select select=new Select(sitee);
		select.selectByVisibleText("Ipsen");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(4000);
		//click on companies tab
		driver.findElement(By.xpath("//a[text()='Companies']")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(3000);

		//Company Status
		WebElement Company_Status_dropdown=driver.findElement(SiteAdminLocatores.Company_Status);
		act.moveToElement(Company_Status_dropdown).perform();
		act.click(Company_Status_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(1000);

		//Committee Status
		WebElement Committee_Status_dropdown=driver.findElement(SiteAdminLocatores.Committee_Status);
		act.moveToElement(Committee_Status_dropdown).perform();
		act.click(Committee_Status_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(1000);


		//Company Onboarding
		WebElement Company_Onboarding1_dropdown=driver.findElement(SiteAdminLocatores.Company_Onboarding);
		act.moveToElement(Company_Onboarding1_dropdown);
		act.click(Company_Onboarding1_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(2000);

		//Company Visibility
		WebElement Company_Visibility_dropdown=driver.findElement(SiteAdminLocatores.Company_Visibility);
		act.click(Company_Visibility_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		driver.findElement(SiteAdminLocatores.Invoicing_Waitlist).click();
		Thread.sleep(2000);
		
		//click on companies tab
		driver.findElement(By.xpath("//a[text()='Companies']")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		//Clear Button
		driver.findElement(SiteAdminLocatores.Clear).click();
		Thread.sleep(1000);

		//Click on Company card view Icon
		driver.findElement(SiteAdminLocatores.Company_Card_View).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(1000);

		//Company Status
		WebElement Company_Status_dropdown1=driver.findElement(SiteAdminLocatores.Company_Status);
		act.click(Company_Status_dropdown1).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(1000);

		//Committee Status
		WebElement Committee_Status_dropdown1=driver.findElement(SiteAdminLocatores.Committee_Status);
		act.click(Committee_Status_dropdown1).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(1000);


		//Company Onboarding
		WebElement Company_Onboarding1_dropdown1=driver.findElement(SiteAdminLocatores.Company_Onboarding);


		act.click(Company_Onboarding1_dropdown1).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(1000);

		//Company Visibility
		WebElement Company_Visibility_dropdown1=driver.findElement(SiteAdminLocatores.Company_Visibility);

		act.click(Company_Visibility_dropdown1).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		driver.findElement(SiteAdminLocatores.Invoicing_Waitlist).click();
		Thread.sleep(1000);
		
		//click on companies tab
		driver.findElement(By.xpath("//a[text()='Companies']")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(1000);

		//Clear Button
		driver.findElement(SiteAdminLocatores.Clear).click();
		Thread.sleep(1000);

		//Click on Resident Table view Icon
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(SiteAdminLocatores.Resident_Table_View).click();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		Thread.sleep(2000);
		System.out.println("When selected Resident Table view");
		
		WebElement Company_Status_dropdown3=driver.findElement(SiteAdminLocatores.Company_Status);
		
		if (Company_Status_dropdown3.isEnabled()) 
		{
			System.out.println("Company Status dropdown is enables");
		}
		else {
			System.out.println("Company Status dropdown is deseble");
		}
		
		WebElement Committee_Status_dropdown3=driver.findElement(SiteAdminLocatores.Committee_Status);
		
		if (Committee_Status_dropdown3.isEnabled()) 
		{
			System.out.println("Committee Status dropdown is enabled");
		}else {
			System.out.println("Committee Status dropdown is deseble");
		}
		
		WebElement Company_Visibility_dropdown3=driver.findElement(SiteAdminLocatores.Company_Visibility);
		
		if (Company_Visibility_dropdown3.isEnabled()) 
		{
			System.out.println("Company Visibility dropdown is enabled");
		}else {
			System.out.println("Company Visibility dropdown is deseble");
		}
		
		WebElement Company_Onboarding1_dropdown3=driver.findElement(SiteAdminLocatores.Company_Onboarding);


		if (Company_Onboarding1_dropdown3.isDisplayed()) 
		{
			System.out.println("Company Onboarding1 dropdown is enabled");
		}else {
			System.out.println("Company Onboarding1 dropdown is deseble");
		}






	}
}
