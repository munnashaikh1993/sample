package ResidentUser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Browsers.Browser;

public class BL_TC_10_ResidentUser extends Browser
{

public static void profile() throws InterruptedException {

	System.out.println("***************************BL_TC_10_Resident_User****************************************");
		
		//click on myprofile
	driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(8000);
		driver.findElement(By.xpath("//i[@title='My Profile']")).click();
		Thread.sleep(2000);

		//click on edit profile
		driver.findElement(By.xpath("//button[text()='Edit Profile']")).click();
		Thread.sleep(2000);

		//click on first name
		driver.findElement( By.xpath("//input[@formcontrolname='fName']")).clear();
		driver.findElement( By.xpath("//input[@formcontrolname='fName']")).sendKeys("priyanka");
		Thread.sleep(2000);

		//Click on lastname	
		driver.findElement(By.xpath("//input[@formcontrolname='lName']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='lName']")).sendKeys("Malviya prasad");
		Thread.sleep(2000);

		//Click on title
		driver.findElement(By.xpath("//input[@formcontrolname='title']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='title']")).sendKeys("QA");
		Thread.sleep(2000);

		//Click on Phone number
		driver.findElement( By.xpath("//input[@formcontrolname='phone']")).clear();
		driver.findElement( By.xpath("//input[@formcontrolname='phone']")).sendKeys("9876543210");
		Thread.sleep(2000);
		
		
		//Click on "Update" Button
	     driver.findElement(By.xpath("//button[@class='btn biolabBtn float-right mr-2']")).click();
	     Thread.sleep(2000);
		
		
	}
}
