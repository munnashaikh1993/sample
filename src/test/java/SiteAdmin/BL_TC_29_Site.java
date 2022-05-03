package SiteAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Browsers.Browser;

public class BL_TC_29_Site extends Browser
{
         public static void  Events_and_Training() throws InterruptedException 
         {
         	System.out.println("***************************BL_TC_29_Site****************************************");

        	 driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
        	 Thread.sleep(6000);
        	//Configuration
     		driver.findElement(SiteAdminLocatores.Configuration).click(); 
     		Thread.sleep(2000);
     		
     		driver.findElement(By.xpath("//a[text()=' Events and Training']")).click();
     		Thread.sleep(2000);
     		
     		//Add row
    		driver.findElement(SiteAdminLocatores.Add_row).click();
    		Thread.sleep(2000);

    		String name="Test";
    		
    		driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys(name);
    		
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
    		
    		driver.findElement(By.xpath("//input[@formcontrolname='eventLink']")).sendKeys("www.linkin.com");
    		Thread.sleep(1000);
    		
    		driver.findElement(By.xpath("//input[@formcontrolname='sponsor']")).sendKeys("Demo");
    		Thread.sleep(1000);
    		
    		driver.findElement(By.xpath("//input[@formcontrolname='registrationCount']")).sendKeys("12365");
    		Thread.sleep(1000);
    		
    		driver.findElement(By.xpath("//input[@formcontrolname='numberAttended']")).sendKeys("6");
    		Thread.sleep(1000);
    		
    		driver.findElement(By.xpath("//input[@formcontrolname='cost']")).sendKeys("15000");
    		Thread.sleep(1000);
    		
    		driver.findElement(By.xpath("//input[@formcontrolname='notes']")).sendKeys("Demo Test demo Test");
    		Thread.sleep(1000);
    		
    		//save date
    		driver.findElement(By.xpath("//i[@class='fa fa-check']")).click();
    		Thread.sleep(2000);
    		
    		//edit buttin
    		driver.findElement(By.xpath(" //span[text()=' "+name+"']/../..//li[@class='fa fa-edit']")).click();
    		Thread.sleep(1000);
     		name="Demo";
    		//edit name
     		driver.findElement(By.xpath("//input[@formcontrolname='name']")).clear();
            driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys(name);
    		Thread.sleep(1000);
    		
    		//Open Date button
    		driver.findElement(By.xpath("(//button[@class='btn btn-outline-secondary fa fa-calendar'])[1]")).click();

    		//Month
    		 month=driver.findElement(By.xpath("//select[@title='Select month']"));
    		Select select2=new Select(month);
    		select2.selectByVisibleText("Apr");

    		//year

    		 year=driver.findElement(By.xpath("//select[@title='Select year']"));
    		Select select1=new Select(year);
    		select1.selectByVisibleText("2025");

    		//date
    		driver.findElement(By.xpath("//div[text()='17']")).click();
    		
    		//edit eventLink
    		driver.findElement(By.xpath("//input[@formcontrolname='eventLink']")).clear();
    		driver.findElement(By.xpath("//input[@formcontrolname='eventLink']")).sendKeys("www.demo.com");
    		Thread.sleep(1000);
    		
    		//edit sponsor
    		driver.findElement(By.xpath("//input[@formcontrolname='sponsor']")).clear();
    		driver.findElement(By.xpath("//input[@formcontrolname='sponsor']")).sendKeys("Test");
    		Thread.sleep(1000);
    		
    		//edit registrationCount
    		driver.findElement(By.xpath("//input[@formcontrolname='registrationCount']")).clear();
    		driver.findElement(By.xpath("//input[@formcontrolname='registrationCount']")).sendKeys("45621");
    		Thread.sleep(1000);
    		
    		//
    		driver.findElement(By.xpath("//input[@formcontrolname='numberAttended']")).clear();
    		driver.findElement(By.xpath("//input[@formcontrolname='numberAttended']")).sendKeys("6");
    		Thread.sleep(1000);
    		
    		//
    		driver.findElement(By.xpath("//input[@formcontrolname='cost']")).clear();
    		driver.findElement(By.xpath("//input[@formcontrolname='cost']")).sendKeys("15000");
    		Thread.sleep(1000);
    		
    		//
    		driver.findElement(By.xpath("//textarea[@formcontrolname='notes']")).clear();
    		driver.findElement(By.xpath("//textarea[@formcontrolname='notes']")).sendKeys("Test Demo Test Demo");
    		Thread.sleep(1000);
    		
    		//
    		driver.findElement(By.xpath("//li[@class='fa fa-check']")).click();
    		Thread.sleep(2000);
    		
    		//delete 
    		driver.findElement(By.xpath("//li[@class='fa fa-trash ml-2']")).click();
    		Thread.sleep(2000);
    		
    		WebElement delete=driver.findElement(By.xpath("//button[text()='Delete']"));
    		
    		Actions act=new Actions(driver);
    		act.moveToElement(delete).perform();
    		act.click(delete).perform();
     		
		 }
}
