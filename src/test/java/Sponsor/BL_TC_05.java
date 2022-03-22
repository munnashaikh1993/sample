package Sponsor;

import org.openqa.selenium.By;

import Browsers.Browser;

public class BL_TC_05 extends Browser {
	
	public static void sponsorsrchpag() throws InterruptedException {
		System.out.println("***************************BL_TC_5****************************************");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("tufts");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
        Thread.sleep(4000);
        
        
	
		
	}




}

	
	

