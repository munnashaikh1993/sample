package ResidentAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


import Browsers.Browser;


public class BL_TC_01_Resident extends Browser{

	public static void Dashboard() throws InterruptedException {
		System.out.println("***************************BL_TC_01****************************************");
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		Thread.sleep(4000);


		//click on my company
		driver.findElement(locators.comapny).click();

		Thread.sleep(5000);


		//onboarding information
		driver.findElement(By.xpath("//a[text()= 'Onboarding Information']")).click();
		Thread.sleep(4000);


		//invoicing
		driver.findElement(By.xpath("//a[text()= 'Invoicing']")).click();
		Thread.sleep(4000);

		//change request
		driver.findElement(By.xpath("//a[text()= 'Change Request']")).click();
		Thread.sleep(4000);

		//privacy
		driver.findElement(By.xpath("//a[text()= 'Privacy']")).click();
		Thread.sleep(4000);

		// Directory
		driver.findElement(By.xpath("//a[text()= 'Directory']")).click();
		Thread.sleep(4000);

		//site members
		driver.findElement(By.xpath("//a[text()= 'Site Members']")).click();
		Thread.sleep(4000);

		//learn more 
		driver.findElement(By.xpath("(//button[text() = ' LEARN MORE '])[1]")).click();
		Thread.sleep(4000);

		// Directory
		driver.findElement(By.xpath("//a[text()= 'Directory']")).click();
		Thread.sleep(4000);

		//Biolabs Site Staff
		driver.findElement(By.xpath("	//a[text()= 'BioLabs Site Staff']")).click();
		Thread.sleep(4000);

		//site companies
		driver.findElement(By.xpath("	//a[text()= 'Site Companies']")).click();
		Thread.sleep(4000);

		//				//learn more 
		//				driver.findElement(By.xpath("(//button[text() = ' LEARN MORE '])[1]")).click();
		//				Thread.sleep(4000);

		//				//my profile
		//				driver.findElement(By.xpath("//a[text()= 'My Profile']")).click();
		//				Thread.sleep(4000);
	}
}
