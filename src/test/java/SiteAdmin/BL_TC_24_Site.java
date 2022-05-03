package SiteAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import Browsers.Browser;

public class BL_TC_24_Site extends Browser
{
	public static void Waitlist() throws Exception 
	{
		System.out.println("***************************BL_TC_24_Site****************************************");
		driver.manage().timeouts().implicitlyWait(35000, TimeUnit.SECONDS);
		Thread.sleep(5000);

		//Invoicing Waitlist
		driver.findElement(SiteAdminLocatores.Invoicing_Waitlist).click();
		Thread.sleep(2000);

		//Invoicing_Waitlist
		driver.findElement(SiteAdminLocatores.Waitlist).click();
		Thread.sleep(2000);

		WebElement div1=driver.findElement(By.xpath("(//tr[@class='cdk-drag ng-star-inserted'])[1]"));
		WebElement div2=driver.findElement(By.xpath("(//tr[@class='cdk-drag ng-star-inserted'])[3]"));

		Actions act=new Actions(driver);

		//drag and drop
		act.dragAndDrop(div1, div2).build().perform();

		//Filter By Company Status
		WebElement companyStatus=driver.findElement(By.xpath("//select[@formcontrolname='companyStatus']"));
		Select select=new Select(companyStatus);
		select.selectByVisibleText("Current Member");

		//Filter By Request
		WebElement productName=driver.findElement(By.xpath("//select[@formcontrolname='productName']"));
		Select select1=new Select(productName);
		select1.selectByVisibleText("Private Office");

		div1.click();

		//status
		WebElement status=driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		//    	 Select select2=new Select(status);
		//    	 select2.selectByVisibleText("Approved-Completed");
		act.moveToElement(status).perform();
		act.click(status).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		//Fulfilled on date
		//Calendar button
		driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary fa fa-calendar']")).click();

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

		//Site Notes:
		driver.findElement(By.xpath("//textarea[@formcontrolname='siteNotes']")).clear();
		driver.findElement(By.xpath("//textarea[@formcontrolname='siteNotes']")).sendKeys("Demo Test Demo Test");

		//Internal Notes:
		driver.findElement(By.xpath("//textarea[@formcontrolname='internalNotes']")).clear();
		driver.findElement(By.xpath("//textarea[@formcontrolname='internalNotes']")).sendKeys("Test Demo Test Demo");

		//Update button
		driver.findElement(By.xpath("//button[text()='Update']")).click();

		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		Thread.sleep(3000);

		//Completed Requests
		driver.findElement(By.xpath("//button[text()='Completed Requests']")).click();

		//click on row
		driver.findElement(By.xpath("(//tr[@class='cursor-pointer ng-star-inserted'])[1]")).click();



		//status
		WebElement status1=driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		Select select5=new Select(status1);
		select5.selectByVisibleText("Approved - In Progress");

		//Fulfilled on date
		//Calendar button
		driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary fa fa-calendar']")).click();

		//Month
		WebElement month1=driver.findElement(By.xpath("//select[@title='Select month']"));
		Select select6=new Select(month1);
		select6.selectByVisibleText("Apr");

		//year

		WebElement year1=driver.findElement(By.xpath("//select[@title='Select year']"));
		Select select7=new Select(year1);
		select7.selectByVisibleText("2024");

		//date
		driver.findElement(By.xpath("//div[text()='17']")).click();

		//Site Notes:
		driver.findElement(By.xpath("//textarea[@formcontrolname='siteNotes']")).clear();
		driver.findElement(By.xpath("//textarea[@formcontrolname='siteNotes']")).sendKeys("Demo Test Demo Test");

		//Internal Notes:
		driver.findElement(By.xpath("//textarea[@formcontrolname='internalNotes']")).clear();
		driver.findElement(By.xpath("//textarea[@formcontrolname='internalNotes']")).sendKeys("Test Demo Test Demo");

		//Update button
		driver.findElement(By.xpath("//button[text()='Update']")).click();















	}
}
