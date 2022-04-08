package SiteAdmin;

import java.util.Iterator;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Browsers.Browser;

public class BL_TC_16_Site extends Browser
{
	public static void VISIT_WEBSITE() throws Exception 
	{
		System.out.println("***************************BL_TC_16_Site****************************************");
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS); 
		Thread.sleep(4000);

		//Companies
		driver.findElement(By.xpath("//a[text()='Companies']")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(2000);

		//Company Card View
		driver.findElement(SiteAdminLocatores.Company_Card_View).click();
		Thread.sleep(2000);

		//Click on learn more button
		driver.findElement(By.xpath("//h5[text()='Cashew Owner']/../..//button[text()=' LEARN MORE ']")).click();
		Thread.sleep(4000);

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
