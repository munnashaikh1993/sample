package SiteAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Browsers.Browser;

public class BL_TC_27_Site extends Browser{
	////tr[contains(@class,'ng-star-inserted')]//span[text()=' Room 4']/../..//td[@class='ng-star-inserted']//span[contains(@class,'margin-right ')]

	public static void Configuration() throws Exception  
	{
		System.out.println("***************************BL_TC_27_Site****************************************");
		driver.manage().timeouts().implicitlyWait(25000, TimeUnit.SECONDS);
		Thread.sleep(4000);
		Actions act=new Actions(driver);
		//Configuration
		WebElement Con=driver.findElement(SiteAdminLocatores.Configuration); 
		act.moveToElement(Con).perform();
		Thread.sleep(1000);
		act.click(Con).build().perform();
		driver.manage().timeouts().implicitlyWait(25000, TimeUnit.SECONDS);
		Thread.sleep(2000);

		//Add row
		driver.findElement(SiteAdminLocatores.Add_row).click();
		Thread.sleep(2000);

		//Name
		String name="Room 1";
		driver.findElement(SiteAdminLocatores.Name).sendKeys(name);
		Thread.sleep(2000);

		//Capacity
		driver.findElement(SiteAdminLocatores.Capacity).sendKeys("20");
		Thread.sleep(2000);

		//Space
		driver.findElement(SiteAdminLocatores.Space).sendKeys("1500");
		Thread.sleep(2000);

		//Notes
		driver.findElement(SiteAdminLocatores.Notes).sendKeys("Test Test Test");
		Thread.sleep(2000);

		driver.findElement(SiteAdminLocatores.right_tick_mark1).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'"+name+"')]/../..//li[@class='fa fa-edit']")).click();
		Thread.sleep(2000);

		name="Hall 1";
		driver.findElement(SiteAdminLocatores.Name).clear();
		driver.findElement(SiteAdminLocatores.Name).sendKeys(name);
		Thread.sleep(2000);

		//Capacity
		driver.findElement(SiteAdminLocatores.Capacity).clear();
		driver.findElement(SiteAdminLocatores.Capacity).sendKeys("15");
		Thread.sleep(2000);

		//Space
		driver.findElement(SiteAdminLocatores.Space).clear();
		driver.findElement(SiteAdminLocatores.Space).sendKeys("2000");
		Thread.sleep(2000);

		//Notes
		driver.findElement(SiteAdminLocatores.Notes).clear();
		driver.findElement(SiteAdminLocatores.Notes).sendKeys("Demo Demo Demo");
		Thread.sleep(2000);


		driver.findElement(SiteAdminLocatores.Edit_right_tick_mark).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[ contains(text(),'"+name+"')]/../..//li[@class='fa fa-trash']")).click();
		Thread.sleep(2000);

		WebElement del=  driver.findElement(By.xpath("//button[text()='Delete']"));
		Thread.sleep(2000);
		
		act.moveToElement(del).perform();
		act.click(del).perform();
		Thread.sleep(4000);


		//add row
		driver.findElement(By.xpath("//button[@class='btn biolabBtn float-right add-raw']")).click();
		Thread.sleep(1000);
		String name1="Demo";
		driver.findElement(By.xpath("//th[text()='Total Quantity']/../../..//input[@formcontrolname='name']")).sendKeys(name1);

		driver.findElement(By.xpath("//textarea[@formcontrolname='description']")).sendKeys("full time employee");
		Thread.sleep(3000);
		WebElement type_dropdown= driver.findElement(By.xpath("//select[@formcontrolname='productTypeId']"));
		Select select=new Select(type_dropdown);
		select.selectByVisibleText("Retainer Fee");

		driver.findElement(By.xpath("//input[@formcontrolname='sqFootage']")).sendKeys("1500");

		driver.findElement(By.xpath("//input[@formcontrolname='totalQuantity']")).sendKeys("500");

		driver.findElement(By.xpath("//input[@formcontrolname='cost']")).sendKeys("750");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='margin-right cursor-pointer submit']//i[@class='fa fa-check']")).click();
		Thread.sleep(2000);


		//edit all input

		//click on edit button
		driver.findElement(By.xpath("//span[text()=' "+name1+"']/../..//li[@class='fa fa-edit']")).click();
		Thread.sleep(2000);

		Thread.sleep(1000);
		name1="Test";

		driver.findElement(By.xpath("//th[text()='Total Quantity']/../../..//input[@formcontrolname='name']")).clear();
		driver.findElement(By.xpath("//th[text()='Total Quantity']/../../..//input[@formcontrolname='name']")).sendKeys(name1);

		driver.findElement(By.xpath("//textarea[@formcontrolname='description']")).clear();
		driver.findElement(By.xpath("//textarea[@formcontrolname='description']")).sendKeys("full time employee");
		Thread.sleep(3000);
		WebElement type_dropdown1= driver.findElement(By.xpath("//select[@formcontrolname='productTypeId']"));
		Select select1=new Select(type_dropdown1);
		select1.selectByVisibleText("Retainer Fee");

		driver.findElement(By.xpath("//input[@formcontrolname='sqFootage']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='sqFootage']")).sendKeys("2000");

		driver.findElement(By.xpath("//input[@formcontrolname='totalQuantity']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='totalQuantity']")).sendKeys("700");

		driver.findElement(By.xpath("//input[@formcontrolname='cost']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='cost']")).sendKeys("850");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[@class='fa fa-check']")).click();
		Thread.sleep(2000);
		WebElement UB=driver.findElement(By.xpath("//button[text()='Update']"));
		act.moveToElement(UB).perform();
		act.click(UB).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()=' "+name1+"']/../..//li[@class='fa fa-trash']")).click();
		Thread.sleep(2000);

		WebElement D=driver.findElement(By.xpath("//button[text()='Delete']"));
		act.moveToElement(D).perform();
		act.click(D).perform();
	}
}
