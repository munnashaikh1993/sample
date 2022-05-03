package Sponsor;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browsers.Browser;

public class BL_TC_14_Sponsor extends Browser{

	    public static void companyProfile() throws Exception {
			System.out.println("***************************BL_TC_14_Sponsor****************************************");

			driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
			Thread.sleep(1000);
			
			List<WebElement> div2=driver.findElements(By.xpath("//div[@class='col-md-9 col-sm-6 pl-0 pr-0 pb-0 bg-light']"));
			for(WebElement d2:div2)
			{
				System.out.println(d2.getText());
			}
		
		}
	
	
}
