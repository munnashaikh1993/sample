package Sponsor;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browsers.Browser;

public class BL_TC_13 extends Browser{

	    public static void companyProfile() throws Exception {
			System.out.println("***************************BL_TC_13****************************************");

			driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
			Thread.sleep(4000);
//			driver.findElement(By.xpath("//a[text()='Resident Companies']")).click();
//			Thread.sleep(2000);
			
//			driver.findElement(SponsorLocators.NirvanaTheraputicsLearnMore).click();
//			Thread.sleep(3000);
			
			//driver.findElement(By.xpath("//a[text()='Company Profile']")).click();
			
			java.util.List<WebElement>  ss=driver.findElements(By.xpath("//div[@class='status']"));
			for(WebElement d:ss) {
				System.out.println(d.getText());
			}
			
			
		java.util.List<WebElement>	s2=driver.findElements(By.xpath("//div[@class='col-md-3 col-sm-6 border']"));
		          
		           for(WebElement d1:s2)
		           {
		        	   System.out.println(d1.getText());
		           }
		           
		         java.util.List<WebElement> s3= driver.findElements(By.xpath("//div[@class='border-secondar text-dark text']"));
		         
		         for(WebElement d2:s3) {
		        	 System.out.println(d2.getText());
		         }
		
		}
	
	
}
