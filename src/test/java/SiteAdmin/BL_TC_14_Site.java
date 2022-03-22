package SiteAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



import Browsers.Browser;

public class BL_TC_14_Site extends Browser{
////tr[contains(@class,'ng-star-inserted')]//span[text()=' Room 4']/../..//td[@class='ng-star-inserted']//span[contains(@class,'margin-right ')]

  public static void Configuration() throws Exception  
         {
	           System.out.println("***************************BL_TC_14****************************************");
	           driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
	           Thread.sleep(4000);
	           
	           //Configuration
	           driver.findElement(SiteAdminLocatores.Configuration).click(); 
	           Thread.sleep(2000);
	           
	           //Add row
	           driver.findElement(SiteAdminLocatores.Add_row).click();
	           Thread.sleep(2000);
	           
	           //Name
	           String name="Room 1";
	           driver.findElement(SiteAdminLocatores.Name).sendKeys(name);
	           Thread.sleep(2000);
	           
	           //Capacity
	           driver.findElement(SiteAdminLocatores.Capacity).sendKeys("20");
	           Thread.sleep(2000);
	           
	           //Space
	           driver.findElement(SiteAdminLocatores.Space).sendKeys("1500");
	           Thread.sleep(2000);
	           
	           //Notes
	           driver.findElement(SiteAdminLocatores.Notes).sendKeys("Test Test Test");
	           Thread.sleep(2000);
	           
	           driver.findElement(SiteAdminLocatores.right_tick_mark1).click();
	           Thread.sleep(2000);
	           
	           driver.findElement(By.xpath("//span[contains(text(),'"+name+"')]/../..//li[@class='fa fa-edit']")).click();
	           Thread.sleep(2000);
	           
	            name="Hall 1";
	            driver.findElement(SiteAdminLocatores.Name).clear();
	           driver.findElement(SiteAdminLocatores.Name).sendKeys(name);
	           Thread.sleep(2000);
	           
	           //Capacity
	           driver.findElement(SiteAdminLocatores.Capacity).clear();
	           driver.findElement(SiteAdminLocatores.Capacity).sendKeys("15");
	           Thread.sleep(2000);
	           
	           //Space
	           driver.findElement(SiteAdminLocatores.Space).clear();
	           driver.findElement(SiteAdminLocatores.Space).sendKeys("2000");
	           Thread.sleep(2000);
	           
	           //Notes
	           driver.findElement(SiteAdminLocatores.Notes).clear();
	           driver.findElement(SiteAdminLocatores.Notes).sendKeys("Demo Demo Demo");
	           Thread.sleep(2000);
	           
	           
	           driver.findElement(SiteAdminLocatores.Edit_right_tick_mark).click();
	           Thread.sleep(2000);
	           
	           driver.findElement(By.xpath("//span[ contains(text(),'"+name+"')]/../..//li[@class='fa fa-trash']")).click();
	           Thread.sleep(2000);
	           
	         WebElement del=  driver.findElement(By.xpath("//button[text()='Delete']"));
	          Thread.sleep(2000);
	         Actions act=new Actions(driver);
	         act.moveToElement(del).perform();
	         act.click(del).perform();
	           
         }
}
