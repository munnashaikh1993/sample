package SiteAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Browsers.Browser;

public class BL_TC_15_Site extends Browser
{
	public static void Forword_Application() throws Exception 
	{
		System.out.println("***************************BL_TC_15_Site****************************************");

		driver.manage().timeouts().implicitlyWait(30000,TimeUnit.SECONDS);
		Thread.sleep(4000);
	
		//Companies
		driver.findElement(By.xpath("//a[text()='Companies']")).click();
		Thread.sleep(2000);

		//Company Card View icon
		driver.findElement(SiteAdminLocatores.Company_Card_View).click();
		Thread.sleep(3000);

		//LEARN MORE
		driver.findElement(By.xpath("//h5[text()='Sporos Test']/../..//button[text()=' LEARN MORE ']")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		//Admin
		driver.findElement(SiteAdminLocatores.Admin).click();
		Thread.sleep(2000);
		
		//forward application button
		try {
			WebElement FAB= driver.findElement(SiteAdminLocatores.forwar_application_button);
			FAB.click();
			Thread.sleep(2000);
			//Site dropdown
			WebElement SD= driver.findElement(By.xpath("//select[@id='dropdownOption']"));
			
			Actions act=new Actions(driver);
			act.moveToElement(SD).perform();
			act.click(SD).perform();
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ENTER).perform();	
			Thread.sleep(1000);
			
			//Forward button
			driver.findElement(By.xpath("//button[text()='Forward']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[text()='OK']")).click();
			
		} catch (Exception e) {
			if (true) {
				System.out.println("This button is not visible");
			}
			
		
		}
		Thread.sleep(1000);
		
		
	}
}
