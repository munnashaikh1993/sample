package Sponsor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Browsers.Browser;

public class BL_TC_11 extends Browser {
	
	public static void visiblity() throws InterruptedException {
		System.out.println("***************************BL_TC_11****************************************");

//		//resident companies
//	     driver.findElement(By.xpath("//a[text()='Resident Companies']")).click();
//        Thread.sleep(3000);
        
        //Learn More
        driver.findElement(By.xpath(" (//button[text()='Learn More'])[1]")).click();
        
        //company profile
        WebElement companyprofile = driver.findElement(By.xpath("(//a[text()='Company Profile'])"));
        
       if(companyprofile.isEnabled()) {
    	   System.out.println("Company Profile is Visible");
    	   
       }
       
     //company Growth
             
      if(companyprofile.isEnabled()) {
   	   System.out.println("Company growth is Visible");
   	   
      } 
		
		
		
		
		
		
	}
	

}
