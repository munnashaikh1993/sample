package SiteAdmin;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browsers.Browser;

public class BL_TC_08_Site extends Browser{
	public static void menubaritems() throws Exception 
	{
		System.out.println("***************************BL_TC_08****************************************");
		 driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		 Thread.sleep(6000);
		 //
		 driver.findElement(By.xpath("//a[text()='Companies']")).click();
		 Thread.sleep(4000);
		 
		 //Company Card View
		 driver.findElement(SiteAdminLocatores.Company_Card_View).click();
		 Thread.sleep(2000);
		 
		 //Click on learn more button
		 driver.findElement(By.xpath("//h5[text()='Cashew Owner']/../..//button[text()=' LEARN MORE ']")).click();
		 Thread.sleep(2000);
		 
		List<WebElement> menuitems= driver.findElements(SiteAdminLocatores.All_menubar_items);
		
		for(WebElement ss:menuitems)
		{
			System.out.println(ss.getText());
		}
		 
	}

}
