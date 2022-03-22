package SiteAdmin;

import java.util.Iterator;

import java.util.Set;
import java.util.concurrent.TimeUnit;



import Browsers.Browser;

public class BL_TC_09_Site extends Browser
{
       public static void VISIT_WEBSITE() throws Exception 
       {
    	   System.out.println("***************************BL_TC_09****************************************");
    	   driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS); 
    	    
    	    String currentwindow= driver.getWindowHandle();
    	   //VISIT WEBSITE button
    	    Thread.sleep(5000);
    	   driver.findElement(SiteAdminLocatores.VISIT_WEBSITE).click();
    	   
    	 Set<String> ss= driver.getWindowHandles();
    	 
    	   Iterator<String> d= ss.iterator();
    	   
    	   while (d.hasNext()) {
			String g =  d.next();
			
			driver.switchTo().window(g);
			
			if(driver.getTitle().equals("biolabs")) {
				
			}else {
				driver.close();
			}
			
		}
    	   
    	   driver.switchTo().window(currentwindow);
    	   
    	   Thread.sleep(2000);
    	   //Pitch Deck
    	   driver.findElement(SiteAdminLocatores.Pitch_Deck).click();
    	
    	 
	   }
}
