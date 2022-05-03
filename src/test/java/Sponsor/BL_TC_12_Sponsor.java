package Sponsor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Browsers.Browser;

public class BL_TC_12_Sponsor extends Browser {
	
	public static void visiblity() throws InterruptedException {
		System.out.println("***************************BL_TC_12_Sponsor****************************************");
        
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS); 
		Thread.sleep(2000);		
        
        //Learn More
        driver.findElement(By.xpath("//h5[text()=' Newvision ']/..//button[text()='Learn More']")).click();
        Thread.sleep(2000);
        //company profile
        WebElement companyprofile = driver.findElement(By.xpath("(//a[text()='Company Profile'])"));
        
       if(companyprofile.isEnabled()) {
    	   System.out.println("Company Profile is Visible");
    	   
       }
       
     //company Growth
       WebElement CG=driver.findElement(SponsorLocators.CompanyGrowth);
             
      if(CG.isEnabled()) {
   	   System.out.println("Company growth is Visible");
   	   
      } 
		
		
		
		
		
		
	}
	

}
