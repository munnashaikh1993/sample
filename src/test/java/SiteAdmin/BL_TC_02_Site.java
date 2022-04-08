package SiteAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Browsers.Browser;

public class BL_TC_02_Site extends Browser 
{
      public static void SortByColumn() throws Exception 
      {
    	  System.out.println("***************************BL_TC_02_Site****************************************");
    	  driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
  		Thread.sleep(2000);
//  		//Companies
//  		driver.findElement(By.xpath("//a[text()='Companies']")).click();
//  		Thread.sleep(4000);
  		
  		
  		
  		//Company Status sorting
  		driver.findElement(By.xpath("//th[@class='cStatus sorting']")).click();
  		Thread.sleep(1000);
  		
  		//On Waitlist sorting
  		driver.findElement(By.xpath("//th[@class='onWaitlist sorting']")).click();
  		Thread.sleep(1000);
  		
  		//Application Date sorting
  		driver.findElement(By.xpath("//th[@class='appDate sorting']")).click();
  		Thread.sleep(1000);
  		
  	    //CompanyName sorting
  		driver.findElement(By.xpath("//th[@class='CompanyName sorting']")).click();
  		Thread.sleep(1000);
  		
  		//click on company name
  		driver.findElement(By.xpath("//a[text()='LASE Innovation']")).click();
  		Thread.sleep(1000);
  		
  		driver.navigate().back();
  		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
  		Thread.sleep(2000);
  		
  		//click on company status
  		driver.findElement(By.xpath("//a[text()='LASE Innovation']/../..//a[text()='Current Member']")).click();
  		Thread.sleep(1000);
  		
  		driver.navigate().back();
  		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
  		Thread.sleep(3000);
  		
  		//CLick on Resident Table View
  		driver.findElement(SiteAdminLocatores.Resident_Table_View).click();
  		Thread.sleep(1000);
  		
  		driver.findElement(By.xpath("//th[text()='Company Name' and @aria-controls='idDataTable']")).click();
  		Thread.sleep(1000);
  		
  		driver.findElement(By.xpath("//th[text()='Resident First Name' and @aria-controls='idDataTable']")).click();
  		Thread.sleep(1000);
  		
  		driver.findElement(By.xpath("//th[text()='Resident Last Name' and @aria-controls='idDataTable']")).click();
  		Thread.sleep(1000);
  		
  		driver.findElement(By.xpath("//th[text()='Title' and @aria-controls='idDataTable']")).click();
  		Thread.sleep(1000);
  		
  		driver.findElement(By.xpath("//th[text()='Company Name' and @aria-controls='idDataTable']")).click();
  		Thread.sleep(1000);
  		
  		driver.findElement(By.xpath("//a[text()='NextRNA ']")).click();
  		Thread.sleep(5000);
  		
  		driver.navigate().back();
  		Thread.sleep(1000);
  		
  		
  		
      }
}
