package ResidentAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import Browsers.Browser;

public class BL_TC_11_Resident extends Browser {

	public static void onboardinginformation() throws InterruptedException {
		System.out.println("***************************BL_TC_11_Resident_Admin****************************************");
		Thread.sleep(4000);

		//Click on My Company
		driver.findElement(By.xpath("//a[text()='My Company']")).click();
		Thread.sleep(6000);




		//Click on Privacy
		driver.findElement(By.xpath("//a[text()='Privacy']")).click();
		Thread.sleep(6000);



		//click on Clinical trail
		driver.findElement(By.id("exampleCheck9")).click();
		Thread.sleep(6000);




		//Click funding source
		driver.findElement(By.id("exampleCheck3")).click();
		Thread.sleep(6000);



		//Click funding amount
		driver.findElement(By.id("exampleCheck4")).click();
		Thread.sleep(6000);



		//Click Employees
		driver.findElement(By.id("exampleCheck5")).click();
		Thread.sleep(6000);



		//Click Advisory board
		driver.findElement(By.id("exampleCheck6")).click();
		Thread.sleep(6000);



		//Click Advisory board
		driver.findElement(By.id("exampleCheck7")).click();
		Thread.sleep(6000);

		//Click Advisory board
		driver.findElement(By.id("exampleCheck8")).click();
		Thread.sleep(6000);
		}

}
