package SiteAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Browsers.Browser;

public class BL_TC_09_A_Site extends Browser
{
   public static void Resident_Table_View_onboarding_offboarding() throws Exception 
   {
	   System.out.println("***************************BL_TC_09_A_Site****************************************");
		
	   driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);

		//click on companies tab
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Companies']"))).perform();
		act.click(driver.findElement(By.xpath("//a[text()='Companies']"))).perform();
		Thread.sleep(1000);
		
		driver.findElement(SiteAdminLocatores.Resident_Table_View).click();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='StemCellerant ']/../..//a[@title='Go to Onboarding Checklist' and text()='Incomplete'] ")).click();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//td[text()=' Step A ']")).click();
		Thread.sleep(2000);
		
        WebElement status= driver.findElement(By.xpath("//select[@formcontrolname='status']"));
		
		act.moveToElement(status).perform();
		act.click(status).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		//notes
		driver.findElement(By.xpath("//textarea[@formcontrolname='notes']")).clear();
		driver.findElement(By.xpath("//textarea[@formcontrolname='notes']")).sendKeys("Demo Demo Demo");
		Thread.sleep(1000);

		//completedFileLink
		driver.findElement(By.xpath("//textarea[@formcontrolname='completedFileLink']")).clear();
		driver.findElement(By.xpath("//textarea[@formcontrolname='completedFileLink']")).sendKeys("www.biolab.com");
		Thread.sleep(1000);

		//Update button
		driver.findElement(By.xpath("//button[text()=' Update ']")).click();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		//off boarding
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Companies']"))).perform();
		act.click(driver.findElement(By.xpath("//a[text()='Companies']"))).perform();
		Thread.sleep(1000);
		
		
		driver.findElement(SiteAdminLocatores.Resident_Table_View).click();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='StemCellerant ']/../..//a[@title='Go to Offboarding Checklist' and text()='Incomplete'] ")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//td[text()=' A-1 ']")).click();
		Thread.sleep(1000);
		
        WebElement status1= driver.findElement(By.xpath("//select[@formcontrolname='status']"));
		
		act.moveToElement(status1).perform();
		act.click(status1).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		//notes
		driver.findElement(By.xpath("//textarea[@formcontrolname='notes']")).clear();
		driver.findElement(By.xpath("//textarea[@formcontrolname='notes']")).sendKeys("Demo Demo Demo");
		Thread.sleep(1000);

		//completedFileLink
		driver.findElement(By.xpath("//textarea[@formcontrolname='completedFileLink']")).clear();
		driver.findElement(By.xpath("//textarea[@formcontrolname='completedFileLink']")).sendKeys("www.biolab.com");
		Thread.sleep(1000);

		//Update button
		driver.findElement(By.xpath("//button[text()=' Update ']")).click();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		
		
		
   }
}
