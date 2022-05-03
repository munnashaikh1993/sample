package SiteAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Browsers.Browser;

public class BL_TC_21_Site extends Browser
{
	public static void Change_Request() throws Exception 
	{
		System.out.println("***************************BL_TC_21_Site****************************************");
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		Thread.sleep(5000);
		//Companies
		driver.findElement(By.xpath("//a[text()='Companies']")).click();
		Thread.sleep(2000);

		//Company Card View icon
		driver.findElement(SiteAdminLocatores.Company_Card_View).click();
		Thread.sleep(4000);

		//LEARN MORE
		driver.findElement(By.xpath("//h5[text()='Cashew Owner']/../..//button[text()=' LEARN MORE ']")).click();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		Thread.sleep(4000);
            Actions act=new Actions(driver);
            
		//Change Request
		WebElement CR= driver.findElement(SiteAdminLocatores.Change_Request);
		act.moveToElement(CR).perform();
		act.click(CR).perform();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(3000);

		//CREATE CHANGE REQUEST Button
		driver.findElement(SiteAdminLocatores.CREATE_CHANGE_REQUEST_Button).click();
		Thread.sleep(1000);

		//Members
		driver.findElement(By.xpath("//td[text()='Members']/..//input[@formcontrolname='desiredQty']")).clear();
		driver.findElement(By.xpath("//td[text()='Members']/..//input[@formcontrolname='desiredQty']")).sendKeys("12");

		//Lab Bench
		driver.findElement(By.xpath("//td[text()='Lab Bench']/..//input[@formcontrolname='desiredQty']")).clear();
		driver.findElement(By.xpath("//td[text()='Lab Bench']/..//input[@formcontrolname='desiredQty']")).sendKeys("6");

		//Workstation
		driver.findElement(By.xpath("//td[text()='Workstation']/..//input[@formcontrolname='desiredQty']")).clear();
		driver.findElement(By.xpath("//td[text()='Workstation']/..//input[@formcontrolname='desiredQty']")).sendKeys("8");

		//Private Office
		driver.findElement(By.xpath("//td[text()='Private Office']/..//input[@formcontrolname='desiredQty']")).clear();
		driver.findElement(By.xpath("//td[text()='Private Office']/..//input[@formcontrolname='desiredQty']")).sendKeys("7");

		//Private Lab
		driver.findElement(By.xpath("//td[text()='Private Lab']/..//input[@formcontrolname='desiredQty']")).clear();
		driver.findElement(By.xpath("//td[text()='Private Lab']/..//input[@formcontrolname='desiredQty']")).sendKeys("10");

		//Please briefly describe your request and add any important details
		driver.findElement(By.xpath("//textarea[@id='exampleFormControlTextarea1']")).clear();
		driver.findElement(By.xpath("//textarea[@id='exampleFormControlTextarea1']")).sendKeys("Demo Test Demo Test");

		//click on calendar button
		driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary fa fa-calendar']")).click();

		//month
		WebElement month= driver.findElement(By.xpath("//select[@title='Select month']"));
		Select select=new Select(month);
		select.selectByVisibleText("Jun");

		//year
		WebElement year= driver.findElement(By.xpath("//select[@title='Select year']"));
		Select select1=new Select(year);
		select1.selectByVisibleText("2023");

		//date
		String date="17";
		driver.findElement(By.xpath("//div[text()='"+date+"']")).click();

		//next button
		driver.findElement(By.xpath("//div[@class='form-group']//button[text()='Next']")).click();

		Thread.sleep(2000);

		//Funding raised to-date:*
		driver.findElement(By.xpath("//input[@formcontrolname='funding']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='funding']")).sendKeys("15000");

		//Funding source:*
		driver.findElement(By.xpath("//button[@class='dropdown-toggle btn']")).click();
		driver.findElement(By.xpath("//label[text()=' Seed-Funding ']/..//input[@type='checkbox']")).click();

		//Company stage of development:*
		WebElement stage_development =driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		
		act.click(stage_development).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

		//Total Employees:*
		driver.findElement(By.xpath("//input[@formcontrolname='companySize']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='companySize']")).sendKeys("40");

		//next button
		driver.findElement(By.xpath("//div[@class='form-group mt-4 mb-5']//button[text()='Next']")).click();
		Thread.sleep(3000);

		//Submit Request
		driver.findElement(By.xpath("//button[text()=' Submit Request ']")).click();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		Thread.sleep(3000);

		//TAKE ME TO UPDATE MY COMPANY INFORMATION
		driver.findElement(By.xpath("//a[text()='TAKE ME TO UPDATE MY COMPANY INFORMATION']")).click();
		Thread.sleep(3000);

		//Change Request
		driver.findElement(SiteAdminLocatores.Change_Request).click();
		Thread.sleep(3000);

		//
		driver.findElement(By.xpath("//td[text()='Sham Patil']/..//i[@class='fa fa-edit']")).click();

		
		//Members
				driver.findElement(By.xpath("//td[text()='Members']/..//input[@formcontrolname='desiredQty']")).clear();
				driver.findElement(By.xpath("//td[text()='Members']/..//input[@formcontrolname='desiredQty']")).sendKeys("15");
                Thread.sleep(1000);
                
				//Lab Bench
				driver.findElement(By.xpath("//td[text()='Lab Bench']/..//input[@formcontrolname='desiredQty']")).clear();
				driver.findElement(By.xpath("//td[text()='Lab Bench']/..//input[@formcontrolname='desiredQty']")).sendKeys("9");
				Thread.sleep(1000);
				
				//Workstation
				driver.findElement(By.xpath("//td[text()='Workstation']/..//input[@formcontrolname='desiredQty']")).clear();
				driver.findElement(By.xpath("//td[text()='Workstation']/..//input[@formcontrolname='desiredQty']")).sendKeys("12");
				Thread.sleep(1000);
				
				//Private Office
				driver.findElement(By.xpath("//td[text()='Private Office']/..//input[@formcontrolname='desiredQty']")).clear();
				driver.findElement(By.xpath("//td[text()='Private Office']/..//input[@formcontrolname='desiredQty']")).sendKeys("15");
				Thread.sleep(1000);
				
				//Private Lab
				driver.findElement(By.xpath("//td[text()='Private Lab']/..//input[@formcontrolname='desiredQty']")).clear();
				driver.findElement(By.xpath("//td[text()='Private Lab']/..//input[@formcontrolname='desiredQty']")).sendKeys("15");
				Thread.sleep(1000);
				
				//Please briefly describe your request and add any important details
				driver.findElement(By.xpath("//textarea[@id='exampleFormControlTextarea1']")).clear();
				driver.findElement(By.xpath("//textarea[@id='exampleFormControlTextarea1']")).sendKeys("Demo Test Demo Test Demo Test Demo Test");
				Thread.sleep(1000);
				
				//click on calendar button
				driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary fa fa-calendar']")).click();
				Thread.sleep(1000);
				
				//month
				WebElement month1= driver.findElement(By.xpath("//select[@title='Select month']"));
				Select select0=new Select(month1);
				select0.selectByVisibleText("Jun");

				
				//year
				WebElement year1= driver.findElement(By.xpath("//select[@title='Select year']"));
				Select select12=new Select(year1);
				select12.selectByVisibleText("2023");

				//date
				String date1="14";
				driver.findElement(By.xpath("//div[text()='"+date1+"']")).click();
				Thread.sleep(1000);
				
				//next button
				driver.findElement(By.xpath("//div[@class='form-group']//button[text()='Next']")).click();

				Thread.sleep(2000);

				//Funding raised to-date:*
				driver.findElement(By.xpath("//input[@formcontrolname='funding']")).clear();
				driver.findElement(By.xpath("//input[@formcontrolname='funding']")).sendKeys("14000");

				//Funding source:*
				driver.findElement(By.xpath("//button[@class='dropdown-toggle btn']")).click();
				driver.findElement(By.xpath("//label[text()=' Seed-Funding ']/..//input[@type='checkbox']")).click();

				//Company stage of development:*
				WebElement stage_development1 =driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
				act.click(stage_development1).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ARROW_DOWN).perform();
				act.sendKeys(Keys.ENTER).perform();

				//Total Employees:*
				driver.findElement(By.xpath("//input[@formcontrolname='companySize']")).clear();
				driver.findElement(By.xpath("//input[@formcontrolname='companySize']")).sendKeys("60");
				Thread.sleep(1000);
				
				//next button
				driver.findElement(By.xpath("//div[@class='form-group mt-4 mb-5']//button[text()='Next']")).click();
				Thread.sleep(3000);

				//Update Request
				driver.findElement(By.xpath("//button[text()=' Update Request ']")).click();
				driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
				Thread.sleep(3000);

				//cancel request
				driver.findElement(By.xpath("//td[text()='Sham Patil']/..//li[@class='fa fa-times']")).click();
				Thread.sleep(2000);
				
				WebElement cancel_req=driver.findElement(By.xpath("//button[text()='Cancel request']"));
				act.moveToElement(cancel_req).perform();
				act.click(cancel_req).perform();

	}
}
