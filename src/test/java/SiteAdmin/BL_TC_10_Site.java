package SiteAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Browsers.Browser;

public class BL_TC_10_Site extends Browser{
	public static void Onboarding_Information_tab() throws Exception 
	{
		System.out.println("***************************BL_TC_10****************************************");
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		Thread.sleep(4000);
	 
		//Onboarding Information
		driver.findElement(SiteAdminLocatores.Onboarding_Information).click();
		Thread.sleep(6000);

		//uplode companies logo and pitch dech
		driver.findElement(SiteAdminLocatores.uplode_logo_and_pitch_dech).click();
		Thread.sleep(4000);

		WebElement fileupled_Logo=	driver.findElement(SiteAdminLocatores.uplode_button_company_logo);
		Thread.sleep(2000);

		Actions act=new Actions(driver);
		act.click(fileupled_Logo).perform();
		Thread.sleep(2000);
           //act.sendKeys("C:\\Users\\salman.shaikh\\Pictures\\1627377451_nature-1200x800.jpg").perform();
		
		Runtime.getRuntime().exec("D:\\Biolab\\Biolab\\AutoIt\\Uplode_Company_logo.exe");

		Thread.sleep(5000);

		WebElement fileuplode_file=	driver.findElement(SiteAdminLocatores.uplode_button_pitch_dech);
		fileuplode_file.sendKeys("C:\\Users\\salman.shaikh\\Pictures\\Demo.pdf");

		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@class='btn biolabBtn mt-3']")).click();
	}
}
