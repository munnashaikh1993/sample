package Sponsor;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browsers.Browser;

public class BL_TC_13_Sponsor extends Browser
{
	public static void All_Summary() throws Exception 
	{
		System.out.println("***************************BL_TC_13_Sponsor****************************************");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS); 
		Thread.sleep(1000);	
		
		List<WebElement> div1=driver.findElements(By.xpath("//div[@class='col-md-3 col-sm-6 border']"));
		for(WebElement d1:div1)
		{
			System.out.println(d1.getText());
		}
		
		System.out.println();
		System.out.println();
		
		
	}
}
