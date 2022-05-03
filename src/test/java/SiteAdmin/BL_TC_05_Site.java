package SiteAdmin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browsers.Browser;

public class BL_TC_05_Site extends Browser
{
      public static void Tile_View() throws Exception 
         {
    	  System.out.println("***************************BL_TC_05_Site****************************************");
    	   driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
    	   Thread.sleep(4000);
    	      
    	       //click on companies tab
  		       driver.findElement(By.xpath("//a[text()='Companies']")).click();
               Thread.sleep(2000);
               
               //Company Card View
       		   driver.findElement(SiteAdminLocatores.Company_Card_View).click();
       		   Thread.sleep(2000);
       		   
       		   //
       		List<WebElement> div=  driver.findElements(By.xpath("//div[@class='row row-cols-1 row-cols-xl-4 row-cols-lg-4 row-cols-md-3 row-cols-sm-2']"));
       		   
       		for(WebElement d:div)
       		{
       			System.out.println();
       			System.out.println(d.getText());
       		}
    	  
	     }
}
