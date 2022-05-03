package SiteAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

import Browsers.Browser;
import io.github.bonigarcia.wdm.config.DriverManagerType;

public class BL_TC_19_Site extends Browser 
{
	public static void Invoicing() throws Exception 
	{

		System.out.println("***************************BL_TC_19_Site****************************************");
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		Thread.sleep(4000);
		//Companies
		driver.findElement(By.xpath("//a[text()='Companies']")).click();
		Thread.sleep(2000);

		//Company Card View icon
		driver.findElement(SiteAdminLocatores.Company_Card_View).click();
		Thread.sleep(4000);

		//LEARN MORE
		driver.findElement(By.xpath("//h5[text()='Cashew Owner']/../..//button[text()=' LEARN MORE ']")).click();
		Thread.sleep(2000);

		//Invoicing
		driver.findElement(SiteAdminLocatores.Invoicing).click();
		Thread.sleep(2000);
//		for(int i=1;i<=2;i++)
//		{
			//add row
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			Thread.sleep(1000);
			driver.findElement(SiteAdminLocatores.Add_row).click();
			Thread.sleep(2000);

			//product Name
			String name="salman";
			driver.findElement(SiteAdminLocatores.productName).sendKeys(name);
			Thread.sleep(1000);

			//product Description
			driver.findElement(SiteAdminLocatores.productDescription).sendKeys("Demo Test");
			Thread.sleep(1000);

			//div[contains(@class,'btn-light') and text()='13']

			//start date button
			driver.findElement(SiteAdminLocatores.start_date_button).click();
			Thread.sleep(1000);

			Actions act=new Actions(driver);

			//month
			WebElement month=driver.findElement(SiteAdminLocatores.Month_dropdown);
			act.click(month).perform();
			//	    act.sendKeys(Keys.ARROW_DOWN).perform();
			//	    act.sendKeys(Keys.ARROW_DOWN).perform();
			//	    act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			//year
			WebElement year=driver.findElement(SiteAdminLocatores.Year_dropdown);
			act.click(year).perform();
			//	    act.sendKeys(Keys.ARROW_DOWN).perform();
			//	    act.sendKeys(Keys.ARROW_DOWN).perform();
			//	    act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ENTER).perform();


			//date
			int day=4;
			driver.findElement(By.xpath("//div[contains(@class,'btn-light') and text()='"+day+"']")).click();

			Thread.sleep(1000);
			//end date
			driver.findElement(SiteAdminLocatores.end_date_button).click();
			Thread.sleep(1000);

			WebElement month1=driver.findElement(SiteAdminLocatores.Month_dropdown);
			act.click(month1).perform();
			//	    act.sendKeys(Keys.ARROW_DOWN).perform();
			//	    act.sendKeys(Keys.ARROW_DOWN).perform();
			//	    act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);

			//year
			WebElement year1=driver.findElement(SiteAdminLocatores.Year_dropdown);
			act.click(year1).perform();
			//	    act.sendKeys(Keys.ARROW_DOWN).perform();
			//	    act.sendKeys(Keys.ARROW_DOWN).perform();
			//	    act.sendKeys(Keys.ARROW_DOWN).perform();
			//	    act.sendKeys(Keys.ARROW_DOWN).perform();
			//	    act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ENTER).perform();

			day=19;
			driver.findElement(By.xpath("//div[contains(@class,'btn-light') and text()='"+day+"']")).click();
			Thread.sleep(1000);

			//qty
			driver.findElement(SiteAdminLocatores.qty).sendKeys("5");
			Thread.sleep(1000);

			//cost
			driver.findElement(SiteAdminLocatores.cost).sendKeys("9");
			Thread.sleep(1000);

			driver.findElement(SiteAdminLocatores.right_tick_mark).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//span[contains(text(),'"+name+"')]/../..//li[@class='fa fa-edit']")).click();
			Thread.sleep(2000);

			name="sham";
			//productName
			driver.findElement(SiteAdminLocatores.productName).clear();
			driver.findElement(SiteAdminLocatores.productName).sendKeys(name);
			Thread.sleep(1000);

			//productDescription
			driver.findElement(SiteAdminLocatores.productDescription).clear();
			driver.findElement(SiteAdminLocatores.productDescription).sendKeys("Test Test Test");
			Thread.sleep(1000);

			//qty
			driver.findElement(SiteAdminLocatores.qty).clear();
			driver.findElement(SiteAdminLocatores.qty).sendKeys("5");
			Thread.sleep(1000);

			//cost
			driver.findElement(SiteAdminLocatores.cost).clear();
			driver.findElement(SiteAdminLocatores.cost).sendKeys("9");
			Thread.sleep(1000);


			driver.findElement(By.xpath("//li[@class='fa fa-check ng-star-inserted']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//span[contains(text(),'"+name+"')]/../..//li[@class='fa fa-trash']")).click();
			Thread.sleep(2000);

			WebElement delete=driver.findElement(By.xpath("//button[text()='Delete']"));
			act.moveToElement(delete).perform();
			act.click(delete).perform();
			
			driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
			

			System.out.println("Company name is :-- "+driver.findElement(By.xpath("//span[@class='pl-3 pr-3 size']")).getText());
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			Thread.sleep(4000);
			//click on next arrow
			driver.findElement(By.xpath("//i[@title='Go to next company']")).click();
			Thread.sleep(2000);


		//}
	}
}
