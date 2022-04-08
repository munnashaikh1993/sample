package SiteAdmin;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.JsrInstruction;
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

		System.out.println("***************************BL_TC_03_Site****************************************");
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		//click on companies tab
		driver.findElement(By.xpath("//a[text()='Companies']")).click();
        Thread.sleep(1000); 
        
        //Company Table View
        driver.findElement(By.xpath("//i[@title='Company Table View']")).click();
        Thread.sleep(1000);
        
        //Click on CSV
        driver.findElement(SiteAdminLocatores.csv_button1).click();
		Thread.sleep(1000);
		
		//click on company status
		driver.findElement(By.xpath("//th[text()='Company Status']")).click();
		Thread.sleep(1000);
		
		//Click on CSV
        driver.findElement(SiteAdminLocatores.csv_button1).click();
		Thread.sleep(1000);
		
		//click on committee status
		driver.findElement(By.xpath("//th[text()='Committee Status']")).click();
		Thread.sleep(1000);
		
		driver.findElement(SiteAdminLocatores.Print_button).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		 Thread.sleep(2000);
		 
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_ESCAPE);
		 r.keyRelease(KeyEvent.VK_ESCAPE);
		 
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        Thread.sleep(2000);

	}
}
