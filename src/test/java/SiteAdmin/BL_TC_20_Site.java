package SiteAdmin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browsers.Browser;

public class BL_TC_20_Site extends Browser
{
	 public static void Retainer_Paid_Date() throws Exception 
	 {
			System.out.println("***************************BL_TC_20_Site****************************************");
		 driver.manage().timeouts().implicitlyWait(15000,TimeUnit.SECONDS);
			Thread.sleep(5000);

			//Companies
			driver.findElement(By.xpath("//a[text()='Companies']")).click();
			Thread.sleep(2000);

			//Company Card View icon
			driver.findElement(SiteAdminLocatores.Company_Card_View).click();
			Thread.sleep(4000);

			//LEARN MORE
			driver.findElement(By.xpath("//h5[text()='Cashew Owner']/../..//button[text()=' LEARN MORE ']")).click();
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			Thread.sleep(2000);
			
			//Invoicing
			driver.findElement(SiteAdminLocatores.Invoicing).click();
			Thread.sleep(1000);
			
			//Retainer Paid To Date:
		WebElement Retainer_Paid_To_Date=driver.findElement(By.xpath("//input[@class='lenght ng-untouched ng-pristine ng-valid']"));
		Retainer_Paid_To_Date.clear();
		Retainer_Paid_To_Date.sendKeys("15");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' Invoice Lock Date:']")).click();
		Thread.sleep(1000);
		System.out.println("Value is :-- "+Retainer_Paid_To_Date.getAttribute("value"));
		System.out.println();
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='lockDateList']"));
		for(WebElement d:list)
		{
			System.out.println(d.getText());
		}
			
			
			
			
	 }

}
