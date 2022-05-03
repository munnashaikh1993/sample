package Sponsor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import Browsers.Browser;

public class BL_TC_05_Sponsor extends Browser {
	
	public static void sponsorsrchpag() throws InterruptedException {
		System.out.println("***************************BL_TC_05_Sponsor****************************************");
          
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("tufts");
		driver.findElement(By.xpath("//button[@routerlinkactive='active' and text()='Search']")).click();
        Thread.sleep(2000);
        
        WebElement RC=driver.findElement(SponsorLocators.ResidentCompanieslink);
        String color= RC.getCssValue("color");
        String col= Color.fromString(color).asHex();
        System.out.println(col);
           if (col.equals("#ee7d31")) 
           {
			  System.out.println(RC.getText()+" Page is visible");
		   }                  
        
        
        
	
		
	}




}

	
	

