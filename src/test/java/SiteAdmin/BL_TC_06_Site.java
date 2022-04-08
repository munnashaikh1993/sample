package SiteAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Browsers.Browser;

public class BL_TC_06_Site extends Browser
{
	public static void Sort_By_Column() throws Exception 
	{
		System.out.println("***************************BL_TC_06_Site****************************************");
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		Thread.sleep(5000);

		//click on companies tab
		driver.findElement(By.xpath("//a[text()='Companies']")).click();
		Thread.sleep(1000);

		//Resident Table View
		driver.findElement(SiteAdminLocatores.Resident_Table_View).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(1000);

		//Resident First Name column
		driver.findElement(By.xpath("//th[text()='Resident First Name']")).click();
		Thread.sleep(1000);

		//Resident Last Name column
		driver.findElement(By.xpath("//th[text()='Resident Last Name']")).click();
		Thread.sleep(1000);

		//Title column
		driver.findElement(By.xpath("//th[text()='Title']")).click();
		Thread.sleep(1000);

		//Email Id column
		driver.findElement(By.xpath("//th[text()='Email ID']")).click();
		Thread.sleep(1000);

		//Phone Number column
		driver.findElement(By.xpath("//th[text()='Phone Number']")).click();
		Thread.sleep(2000);
		
		//Company Name column
		driver.findElement(By.xpath("(//th[text()='Company Name'])[2]")).click();
		Thread.sleep(1000);

		
	}
}
