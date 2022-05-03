package Sponsor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.github.dockerjava.api.model.Driver;

import Browsers.Browser;

public class BL_TC_10_Sponsor extends Browser
{
     public static void CheckChangesRefresh() throws Exception 
     {
		 System.out.println("***************************BL_TC_10_Sponsor****************************************");    	 
    	 Thread.sleep(2000);
		 driver.navigate().back();
    	 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    	 Thread.sleep(2000);
    	 driver.navigate().forward();
    	 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
    	 Thread.sleep(4000);
    	

 		//clear
 		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
 		driver.findElement(By.xpath("//button[@class='btn biolabBtn btn-font text-center']")).click();
	 }
}
