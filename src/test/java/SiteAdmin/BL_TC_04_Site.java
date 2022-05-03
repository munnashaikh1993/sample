package SiteAdmin;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Browsers.Browser;

public class BL_TC_04_Site extends Browser
{
	   public static void Cpompany_table_view() throws Exception 
	       {
		   System.out.println("***************************BL_TC_04_Site****************************************");
		   driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
			Thread.sleep(3000);

			//driver.findElement(By.xpath("//a[text()='Companies']")).click();



			Thread.sleep(1000);
			//Select Dropdown in site
			WebElement site_dropdown=driver.findElement(SiteAdminLocatores.Site_drop);
			Select select=new Select(site_dropdown);
			WebElement ss= select.getFirstSelectedOption();
			System.out.println("Default selected companys  :- "+ss.getText());
			Thread.sleep(1000);

			WebElement Com_Name=driver.findElement(By.xpath("//a[text()='Renegade']"));


			if((Com_Name.getAttribute("title")).isEmpty()) 
			{
				System.out.println("name block is not clickble");
			}else 
			{
				System.out.println("name block is clickble");
			}

			WebElement Com_status=driver.findElement(By.xpath("//a[text()='Renegade']/../..//a[text()='Applied-New']"));

			if((Com_status.getAttribute("title")).isEmpty()) 
			{
				System.out.println("Company status block is not clickble");
			}else 
			{
				System.out.println("Company status block is clickble");
			}


			Actions act=new Actions(driver);

			act.click(site_dropdown).perform();
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(3000);

			WebElement site_dropdown1=driver.findElement(SiteAdminLocatores.Site_drop); 
			Select select1=new Select(site_dropdown1);
			WebElement ss1= select1.getFirstSelectedOption();
			System.out.println("User selected companys  :- "+ss1.getText());
	        Thread.sleep(1000);

			WebElement Com_Name1=driver.findElement(By.xpath("//a[text()='Biolab']"));


			if((Com_Name1.getAttribute("title")).isEmpty()) 
			{
				System.out.println("name block is not clickble");
			}else 
			{
				System.out.println("name block is clickble");
			}

			WebElement Com_status1=driver.findElement(By.xpath("//a[text()='Biolab']/../..//label[text()='Applied-New']"));


			if((Com_status1.getAttribute("title")).isEmpty()) 
			{
				System.out.println("company block is not clickble");
			}else 
			{
				System.out.println("company block is clickble");
			}
            
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
            Thread.sleep(2000);
			//select site 
            WebElement site_dropdown11=driver.findElement(SiteAdminLocatores.Site_drop);
			Select select11=new Select(site_dropdown11);
			select11.selectByVisibleText("Ipsen");
			Thread.sleep(3000);
			
			//Companies
			driver.findElement(By.xpath("//a[text()='Companies']")).click();
			Thread.sleep(4000);
			
			//Company Card View icon
			driver.findElement(SiteAdminLocatores.Company_Card_View).click();
			Thread.sleep(2000);

			//LEARN MORE
			driver.findElement(By.xpath("//h5[text()='Cashew Owner']/../..//button[text()=' LEARN MORE ']")).click();
			driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println("Company card View");
		    
            List<WebElement> taglist=driver.findElements(By.xpath("//ul[@class='nav nav-tabs flex-row cus-tab tab-bar child-menu']"));
			
			for(WebElement d:taglist)
			{
				System.out.println(d.getText());
			}
			System.out.println();
			System.out.println();
		    
		    /////
		    WebElement site_dropdown111=driver.findElement(SiteAdminLocatores.Site_drop);
			Select select111=new Select(site_dropdown111);
			select111.selectByVisibleText("North Texas");
			Thread.sleep(2000);
			
			//Company Card View icon
			driver.findElement(SiteAdminLocatores.Company_Card_View).click();
			Thread.sleep(2000);

			//LEARN MORE
			driver.findElement(By.xpath("//h5[text()='Cashew Owner']/../..//button[text()=' LEARN MORE ']")).click();
			driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
			Thread.sleep(2000);
			
			List<WebElement> taglist1=driver.findElements(By.xpath("//ul[@class='nav nav-tabs flex-row cus-tab tab-bar child-menu']"));
			
			for(WebElement d:taglist1)
			{
				System.out.println(d.getText());
			}	       
		        
	       }

}
