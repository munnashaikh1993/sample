package SiteAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Browsers.Browser;

public class BL_TC_10_Site extends Browser
{
	public static void Add_Edit_Delete_Resident_User() throws Exception 
	{
		System.out.println("***************************BL_TC_10_Site****************************************");
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		Thread.sleep(4000);
		//Manage Users header
		driver.findElement(SiteAdminLocatores.Manage_Users_header).click();
		Thread.sleep(2000);

		//Resident Admin button
		driver.findElement(SiteAdminLocatores.Resident_User).click();
		Thread.sleep(1000);

		//ADD NEW RESIDENT ADMIN button
		driver.findElement(SiteAdminLocatores.ADD_NEW_RESIDENT_USER).click();

		String name="salman";
		//First Name
		driver.findElement(SiteAdminLocatores.First_name).sendKeys(name);
		Thread.sleep(1000);

		//Last Name
		driver.findElement(SiteAdminLocatores.Last_Name).sendKeys("Shaikh");
		Thread.sleep(1000);
		String emailid="salman12345@gmail.com";
		//Email
		driver.findElement(SiteAdminLocatores.Email).sendKeys(emailid);
		Thread.sleep(1000);

		//Phone no
		driver.findElement(SiteAdminLocatores.Phone_no).sendKeys("9856234152");
		Thread.sleep(1000);

		//Title
		driver.findElement(SiteAdminLocatores.Title).sendKeys("QA tester");
		Thread.sleep(1000);

		Actions act=new Actions(driver);

		//Company
		WebElement companydropdown=driver.findElement(SiteAdminLocatores.company);

		act.click(companydropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

		//User Type
		WebElement user_type=driver.findElement(SiteAdminLocatores.User_Type);

		act.click(user_type).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();


		//click on add user
		driver.findElement(SiteAdminLocatores.Add_User).click();
		Thread.sleep(2000);

		//Edit

		//Edit button
		driver.findElement(By.xpath("//h5[contains(text(),'"+name+"')]/..//button[text()='Edit']")).click();
		Thread.sleep(2000);

		name="omkar";
		//First Name
		driver.findElement(SiteAdminLocatores.First_name).clear();
		driver.findElement(SiteAdminLocatores.First_name).sendKeys(name);
		Thread.sleep(1000);

		//Last Name
		driver.findElement(SiteAdminLocatores.Last_Name).clear();
		driver.findElement(SiteAdminLocatores.Last_Name).sendKeys("patil");
		Thread.sleep(1000);

		//Phone no
		driver.findElement(SiteAdminLocatores.Phone_no).clear();
		driver.findElement(SiteAdminLocatores.Phone_no).sendKeys("9856234152");
		Thread.sleep(2000);

		//Title
		driver.findElement(SiteAdminLocatores.Title).clear();
		driver.findElement(SiteAdminLocatores.Title).sendKeys("test Automantion");
		Thread.sleep(1000);



		//Company
		WebElement companydropdown1=driver.findElement(SiteAdminLocatores.company);

		act.click(companydropdown1).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

		//User Type
		WebElement user_type1=driver.findElement(SiteAdminLocatores.User_Type);

		act.click(user_type1).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();


		//click on add user
		driver.findElement(By.xpath("//button[text()=' Update User ']")).click();
		Thread.sleep(2000);


		//Delete
		driver.findElement(By.xpath("//h5[contains(text(),'"+name+"')]/..//button[text()='Delete']")).click();

		WebElement delete=driver.findElement(By.xpath("//button[text()='YES, DELETE']"));

		act.moveToElement(delete).perform();
		act.click(delete).perform();

	}
}
