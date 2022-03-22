package SiteAdmin;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Browsers.Browser;
import Login.Login;

public class BL_TC_03_Site extends Browser
{
	public static void defaultsite_and_selectedsite() throws Exception 
	{
		Login.siteAdminLogintuffandepson();
		System.out.println("***************************BL_TC_03****************************************");
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//a[text()='Companies']")).click();

		Thread.sleep(2000);
		driver.findElement(SiteAdminLocatores.Company_Card_View).click();

		List<WebElement> allcompanys = driver.findElements(By.xpath("//div[@class='row row-cols-1 row-cols-xl-4 row-cols-lg-4 row-cols-md-3 row-cols-sm-2']"));

		for(WebElement d:allcompanys)
		{
			System.out.println(d.getText());
		}
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("--------tufts----------");
		Thread.sleep(2000);
		//Select Dropdown in site
		WebElement site_dropdown=driver.findElement(SiteAdminLocatores.Site_drop);
         Select select=new Select(site_dropdown);
         WebElement ss= select.getFirstSelectedOption();
         System.out.println("Default selected companys  :- "+ss.getText());
         Actions act=new Actions(driver);
		
		act.click(site_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(6000);
          
		
		driver.findElement(SiteAdminLocatores.Company_Card_View).click();
		
		List<WebElement> demo1=driver.findElements(By.xpath("//div[@class='row row-cols-1 row-cols-xl-4 row-cols-lg-4 row-cols-md-3 row-cols-sm-2']"));
         
		Thread.sleep(4000);
		for(WebElement e:demo1)
		{
			System.out.println(e.getText());
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@title='Log Out']")).click();
		 



	}
}
