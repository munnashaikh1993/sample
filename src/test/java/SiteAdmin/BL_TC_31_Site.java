package SiteAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Browsers.Browser;

public class BL_TC_31_Site extends Browser
{
	public static void Offboarding() throws Exception 
    {
    	System.out.println("***************************BL_TC_31_Site****************************************");

    	 driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
    	 Thread.sleep(5000);
    	//Configuration
 		driver.findElement(SiteAdminLocatores.Configuration).click(); 
 		Thread.sleep(2000);
 		
 		//Onboarding
 		driver.findElement(By.xpath("//a[text()='Offboarding']")).click();
 		Thread.sleep(2000);
 		
 		driver.findElement(By.xpath("(//button[text()='Add Row'])[1]")).click();
 		Thread.sleep(1000);
 		
 		String step="step 7";
 		//stepName
 		driver.findElement(By.xpath("//input[@formcontrolname='stepName']")).sendKeys(step);
 		Thread.sleep(1000);
 		
 		//description
 		driver.findElement(By.xpath("//input[@formcontrolname='description']")).sendKeys("Demo Demo");
 		Thread.sleep(1000);
 		
 		//templatelink
 		driver.findElement(By.xpath("//input[@formcontrolname='templateLink']")).sendKeys("www.biolab.com");
 		Thread.sleep(1000);
 		
 		
 		
 		//add
 		driver.findElement(By.xpath("//i[@class='fa fa-check']")).click();
 		Thread.sleep(1000);
 		
 		
 		//edit
 		driver.findElement(By.xpath("//span[text()='"+step+"']/../..//li[@class='fa fa-edit']")).click();
 		Thread.sleep(1000);
 		
 		
 		step="step 9";
 		//stepname
 		driver.findElement(By.xpath("//input[@formcontrolname='stepName']")).clear();
 		driver.findElement(By.xpath("//input[@formcontrolname='stepName']")).sendKeys(step);
 		Thread.sleep(1000);
 		
 		//description
 		driver.findElement(By.xpath("//input[@formcontrolname='description']")).clear();
 		driver.findElement(By.xpath("//input[@formcontrolname='description']")).sendKeys("Test Test");
 		Thread.sleep(1000);
 		
 		//templatelink
 		driver.findElement(By.xpath("//input[@formcontrolname='templateLink']")).clear();
 		driver.findElement(By.xpath("//input[@formcontrolname='templateLink']")).sendKeys("www.biolabDemo.com");
 		Thread.sleep(1000);
 		
 		//click on right check box
 		driver.findElement(By.xpath("//li[@class='fa fa-check']")).click();
 		
 		//delete
 		driver.findElement(By.xpath("//span[text()='"+step+"']/../..//li[@class='fa fa-trash ml-2']")).click();
 		Thread.sleep(3000);
 		
 		WebElement delete=driver.findElement(By.xpath("(//button[text()='Delete'])[1]"));
 		Actions act=new Actions(driver);
 		act.moveToElement(delete).perform();
 		act.click(delete).perform();
 		Thread.sleep(4000);
 		
 
 		
 		//
 		//add row
 		driver.findElement(By.xpath("(//button[text()='Add Row'])[2]")).click();
 		Thread.sleep(1000);
 		
 		
 		String step11="A-45";
 		//
 		driver.findElement(By.xpath("//input[@formcontrolname='stepName']")).sendKeys(step11);
 		Thread.sleep(1000);
 		
 		//
 		driver.findElement(By.xpath("//input[@formcontrolname='description']")).sendKeys("Demo Demo");
 		Thread.sleep(1000);
 		
 		//
 		driver.findElement(By.xpath("//input[@formcontrolname='templateLink']")).sendKeys("www.biolab.com");
 		Thread.sleep(1000);
 		
 		//add
 		driver.findElement(By.xpath("//i[@class='fa fa-check']")).click();
 		Thread.sleep(1000);
 		
 		
 		//edit
 		driver.findElement(By.xpath("//span[text()='"+step11+"']/../..//li[@class='fa fa-edit']")).click();
 		Thread.sleep(1000);
 		
 		
 		step11="A-56";
 		//
 		driver.findElement(By.xpath("//input[@formcontrolname='stepName']")).clear();
 		driver.findElement(By.xpath("//input[@formcontrolname='stepName']")).sendKeys(step11);
 		Thread.sleep(1000);
 		
 		//
 		driver.findElement(By.xpath("//input[@formcontrolname='description']")).clear();
 		driver.findElement(By.xpath("//input[@formcontrolname='description']")).sendKeys("Test Test");
 		Thread.sleep(1000);
 		
 		//
 		driver.findElement(By.xpath("//input[@formcontrolname='templateLink']")).clear();
 		driver.findElement(By.xpath("//input[@formcontrolname='templateLink']")).sendKeys("www.biolabDemo.com");
 		Thread.sleep(1000);
 		
 		//
 		driver.findElement(By.xpath("//li[@class='fa fa-check']")).click();
 		
 		//delete
 		driver.findElement(By.xpath("//span[text()='"+step11+"']/../..//li[@class='fa fa-trash ml-2']")).click();
 		Thread.sleep(2000);
 		
 		WebElement delete1=driver.findElement(By.xpath("(//button[text()='Delete'])[2]"));
 		
 		act.moveToElement(delete1).perform();
 		act.click(delete1).perform();
 		
 		
 		
 		
 		
	}
}
