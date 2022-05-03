package ResidentUser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Browsers.Browser;

public class BL_TC_01_ResidentUser extends Browser
{
	

	public static void dashboard() throws InterruptedException {
		System.out.println("***************************BL_TC_01_Resident_User****************************************");
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(4000);

		//click on my sitemembers
		driver.findElement(By.xpath("//a[text()='Site Members']")).click();
		Thread.sleep(4000);

		//click on my biolabs_site_staff
		driver.findElement(By.xpath("//a[text()='BioLabs Site Staff']")).click();
		Thread.sleep(4000);

		//click on my sitesponsors
		driver.findElement(By.xpath("//a[text()='Site Sponsors']")).click();
		Thread.sleep(4000);


		//click on my company
		driver.findElement(By.xpath("//a[text()='My Company']")).click();
		Thread.sleep(4000);


		//click on invoicing
		driver.findElement(By.xpath("//a[text()='Invoicing']")).click();
		Thread.sleep(4000);


		//click on change Request
		driver.findElement(By.xpath("//a[text()='Change Request']")).click();
		Thread.sleep(4000);



	}
}
