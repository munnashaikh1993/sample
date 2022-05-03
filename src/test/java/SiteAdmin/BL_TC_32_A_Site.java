package SiteAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Browsers.Browser;

public class BL_TC_32_A_Site extends Browser
{
	public static void  Partners_and_Sponsors() throws Exception 
	{
		System.out.println("***************************BL_TC_33_Site****************************************");

		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(4000);
		Actions act =new Actions(driver);
		//Configuration
		driver.findElement(SiteAdminLocatores.Configuration).click(); 
		Thread.sleep(2000);  	

		driver.findElement(By.xpath("//a[text()=' Partners and Sponsors']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Add Row']")).click();
		Thread.sleep(1000);

		//add Partners

		String name="salman";
		driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys(name);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@formcontrolname='industryType']")).sendKeys("Clean Tech");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@formcontrolname='websiteLink']")).sendKeys("www.biolab.com");
		Thread.sleep(1000);

		//Open Date button
		driver.findElement(By.xpath("(//button[@class='btn btn-outline-secondary fa fa-calendar'])[1]")).click();

		//Month
		WebElement month=driver.findElement(By.xpath("//select[@title='Select month']"));
		Select select3=new Select(month);
		select3.selectByVisibleText("Apr");

		//year

		WebElement year=driver.findElement(By.xpath("//select[@title='Select year']"));
		Select select4=new Select(year);
		select4.selectByVisibleText("2024");

		//date
		driver.findElement(By.xpath("//div[text()='17']")).click();


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

		String	day="19";
		driver.findElement(By.xpath("//div[contains(@class,'btn-light') and text()='"+day+"']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@formcontrolname='linkToAggrement']")).sendKeys("www.biolab.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//i[@class='fa fa-check']")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='"+name+"']/../..//li[@class='fa fa-edit']")).click();

		Thread.sleep(1000);

		//edit Partners
		name="sham";
		driver.findElement(By.xpath("//input[@formcontrolname='name']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys(name);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@formcontrolname='industryType']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='industryType']")).sendKeys("Clean Tech");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@formcontrolname='websiteLink']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='websiteLink']")).sendKeys("www.biolab.com");
		Thread.sleep(1000);

		//Open Date button
		driver.findElement(By.xpath("(//button[@class='btn btn-outline-secondary fa fa-calendar'])[1]")).click();

		//Month
		WebElement month11=driver.findElement(By.xpath("//select[@title='Select month']"));
		Select select33=new Select(month11);
		select33.selectByVisibleText("Apr");

		//year

		WebElement year11=driver.findElement(By.xpath("//select[@title='Select year']"));
		Select select44=new Select(year11);
		select44.selectByVisibleText("2024");

		//date
		driver.findElement(By.xpath("//div[text()='17']")).click();


		driver.findElement(SiteAdminLocatores.end_date_button).click();
		Thread.sleep(1000);

		WebElement month111=driver.findElement(SiteAdminLocatores.Month_dropdown);
		act.click(month111).perform();
		//	    act.sendKeys(Keys.ARROW_DOWN).perform();
		//	    act.sendKeys(Keys.ARROW_DOWN).perform();
		//	    act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		//year
		WebElement year111=driver.findElement(SiteAdminLocatores.Year_dropdown);
		act.click(year111).perform();
		//	    act.sendKeys(Keys.ARROW_DOWN).perform();
		//	    act.sendKeys(Keys.ARROW_DOWN).perform();
		//	    act.sendKeys(Keys.ARROW_DOWN).perform();
		//	    act.sendKeys(Keys.ARROW_DOWN).perform();
		//	    act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

		day="20";
		driver.findElement(By.xpath("//div[contains(@class,'btn-light') and text()='"+day+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@formcontrolname='linkToAggrement']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='linkToAggrement']")).sendKeys("www.biolab.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[@class='fa fa-check']")).click();
		Thread.sleep(2000);


		//delete Partners
		driver.findElement(By.xpath("//span[text()='"+name+"']/../..//li[@class='fa fa-trash ml-2']")).click();
		Thread.sleep(2000);

		WebElement del=driver.findElement(By.xpath("//button[text()='Delete']"));
		act.moveToElement(del).perform();
		act.click(del).perform();
		Thread.sleep(2000);

		//edit Sponsors
		driver.findElement(By.xpath("//span[text()='Test Demo']/../..//li[@class='fa fa-edit']")).click();
         Thread.sleep(2000);

		//websiteLink
		driver.findElement(By.xpath("//input[@formcontrolname='websiteLink']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='websiteLink']")).sendKeys("www.bio.com");
		Thread.sleep(2000);

		//value
		driver.findElement(By.xpath("//input[@formcontrolname='value']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='value']")).sendKeys("46");
		Thread.sleep(2000);

		//localPOC
		driver.findElement(By.xpath("//input[@formcontrolname='localPOC']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='localPOC']")).sendKeys("FFF");
		Thread.sleep(2000);

		//title
		driver.findElement(By.xpath("//input[@formcontrolname='title']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='title']")).sendKeys("TestDemo");
		Thread.sleep(2000);

		//phoneNumber
		driver.findElement(By.xpath("//input[@formcontrolname='phoneNumber']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='phoneNumber']")).sendKeys("9856321262");
		Thread.sleep(2000);

		//email
		driver.findElement(By.xpath("//input[@formcontrolname='email']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("sam12345@gmail.com");
		Thread.sleep(2000);

		//email
		driver.findElement(By.xpath("//input[@formcontrolname='notes']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='notes']")).sendKeys("www.flipcart.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@class='fa fa-check']")).click();





	}
}
