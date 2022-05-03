package ResidentAdmin;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Browsers.Browser;


public class BL_TC_06_Resident extends Browser {

	public static void SponsorProfile() throws Exception {

		System.out.println("***************************BL_TC_06_Resident_Admin****************************************");
		//click on directory
		  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//a[text()='Directory']")).click();
		
		
		        //click on Site Sponsor button
		        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		        Thread.sleep(2000);
				driver.findElement(By.xpath("//a[text()='Site Sponsors']")).click();
				  driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
				
				
		        //click on learn more button	
				  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
				  Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[text()=' LEARN MORE '])[1]")).click();
				  driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
				
				
				
				
}
}
