package SiteAdmin;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Browsers.Browser;
import Login.Login;

public class BL_TC_08_Site extends Browser{
	public static void Add_edit_Delete() throws Exception 
	{
		
		System.out.println("***************************BL_TC_08_Site****************************************");
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		
		Thread.sleep(4000);
		//Manage Users header
		driver.findElement(SiteAdminLocatores.Manage_Users_header).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(4000);

		//ADD NEW ADMIN button
		driver.findElement(SiteAdminLocatores.ADD_NEW_ADMIN_button).click();
		Thread.sleep(1000);
		String name="salman";
		//First Name
		driver.findElement(SiteAdminLocatores.First_name).sendKeys(name);
		Thread.sleep(1000);

		//Last Name
		driver.findElement(SiteAdminLocatores.Last_Name).sendKeys("Shaikh");
		Thread.sleep(1000);
		String emailid="salman1133@gmail.com";
		//Email
		driver.findElement(SiteAdminLocatores.Email).sendKeys(emailid);
		Thread.sleep(1000);

		//Phone no
		driver.findElement(SiteAdminLocatores.Phone_no).sendKeys("9856234152");
		Thread.sleep(1000);

		//Title
		driver.findElement(SiteAdminLocatores.Title).sendKeys("QA tester");
		Thread.sleep(1000);

		//Sites
		driver.findElement(SiteAdminLocatores.Sites).click();

		//check box
		driver.findElement(SiteAdminLocatores.check_Box).click();

		Actions act=new Actions(driver);

		//User Type
		WebElement user_type=driver.findElement(SiteAdminLocatores.User_Type);

		act.click(user_type).perform();

		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();


		//click on add user
		driver.findElement(SiteAdminLocatores.Add_User).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(3000);

		//Update
		driver.findElement(By.xpath("//h5[contains(text(),'"+name+"')]/..//button[text()='Edit']")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(1000);
		name="sham";
		
		//First Name
		driver.findElement(SiteAdminLocatores.First_name).clear();
		driver.findElement(SiteAdminLocatores.First_name).sendKeys(name);
		Thread.sleep(1000);

		//Last Name
		driver.findElement(SiteAdminLocatores.Last_Name).clear();
		driver.findElement(SiteAdminLocatores.Last_Name).sendKeys("Patil");
		Thread.sleep(1000);


		//Phone no
		driver.findElement(SiteAdminLocatores.Phone_no).clear();
		driver.findElement(SiteAdminLocatores.Phone_no).sendKeys("7854112363");
		Thread.sleep(1000);

		//Title
		driver.findElement(SiteAdminLocatores.Title).clear();
		driver.findElement(SiteAdminLocatores.Title).sendKeys("Test Automation");
		Thread.sleep(1000);


		//User type
		WebElement user_type1=driver.findElement(SiteAdminLocatores.User_Type);
		act.click(user_type1).perform();

		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();


		driver.findElement(By.xpath("//button[text()=' Update User ']")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		//Delete
        driver.findElement(By.xpath("//h5[contains(text(),'"+name+"')]/..//button[text()='Delete']")).click();
        
        WebElement delete=driver.findElement(By.xpath("//button[text()=' YES, DELETE']"));
        
        act.moveToElement(delete).perform();
        act.click(delete).perform();



	}
}
