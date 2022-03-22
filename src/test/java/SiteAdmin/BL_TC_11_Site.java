package SiteAdmin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Browsers.Browser;

public class BL_TC_11_Site extends Browser{
	public static void Update_all_status() throws Exception 
	{
		System.out.println("***************************BL_TC_11****************************************");
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		//
		driver.findElement(By.xpath("//a[text()='Companies']")).click();
		Thread.sleep(2000);
		
		//Company Card View icon
		driver.findElement(SiteAdminLocatores.Company_Card_View).click();
		Thread.sleep(4000);
		
		//LEARN MORE
		driver.findElement(By.xpath("//h5[text()='Cashew Owner']/../..//button[text()=' LEARN MORE ']")).click();
		Thread.sleep(2000);
		
		//status
		List<WebElement> curentstatus=driver.findElements(SiteAdminLocatores.status);
		
		for(WebElement ss:curentstatus) 
		{
			System.out.println(ss.getText());
		}
		Thread.sleep(2000);
		
		//Click on Admin
		driver.findElement(SiteAdminLocatores.Admin).click();
		Thread.sleep(3000);
		
		//company status
		WebElement company_status_dopdown=driver.findElement(SiteAdminLocatores.company_status);
		
		Actions act=new Actions(driver);
		
		act.click(company_status_dopdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		//Add note button
		driver.findElement(SiteAdminLocatores.Add_Notes).click();
		Thread.sleep(2000);
		
		//text area
		driver.findElement(SiteAdminLocatores.text_area).sendKeys("Demo Test Demo Test Demo Test");
		Thread.sleep(2000);
		
		//click on save button
		driver.findElement(SiteAdminLocatores.Save_button).click();
		Thread.sleep(2000);
		
		//click on update button
		driver.findElement(SiteAdminLocatores.update_button).click();
		
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		Thread.sleep(5000);
		List<WebElement> afterstatus=driver.findElements(SiteAdminLocatores.status);
		System.out.println();
		System.out.println();
		for(WebElement dd:afterstatus) 
		{
		
			System.out.println(dd.getText());
		}
		
		
		

	}
}
