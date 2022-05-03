package SiteAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Browsers.Browser;

public class BL_TC_08_A_Site extends Browser
{
	public static void Onbording() throws Exception 
	{
		System.out.println("***************************BL_TC_08_A_Site****************************************");
		
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);

		//click on companies tab
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Companies']"))).perform();
		act.click(driver.findElement(By.xpath("//a[text()='Companies']"))).perform();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//i[@title='Company Table View']")).click();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(1000);

		//onbording
		driver.findElement(By.xpath("//a[text()='Atliogo_Ipsen']/../..//a[text()='Incomplete' and @title='Go to Onboarding Checklist']")).click();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(1000);

		//step 3 row
		driver.findElement(By.xpath("//td[text()=' Step 3 ']")).click();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(1000);

		//status drop down
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

		//click on companies tab
		driver.findElement(By.xpath("//a[text()='Companies']")).click();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(1000);

         //click on off boarding
		 driver.findElement(By.xpath("//a[text()='Atliogo_Ipsen']/../..//a[text()='Incomplete' and @title='Go to Offboarding Checklist']")).click();
         Thread.sleep(1000);
         
         //select on row step I
         driver.findElement(By.xpath("//td[text()=' Step I ']")).click();
         driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
         Thread.sleep(1000);
         
         
       //status drop down
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
