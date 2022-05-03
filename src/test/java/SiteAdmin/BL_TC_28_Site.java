package SiteAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Browsers.Browser;

public class BL_TC_28_Site extends Browser
{
	public static void Site_Configuration() throws Exception 
	{
    	System.out.println("***************************BL_TC_28_Site****************************************");

		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(4000);
        Actions act=new Actions(driver);
		//Configuration
		WebElement Con= driver.findElement(SiteAdminLocatores.Configuration); 
		act.moveToElement(Con).build().perform();
		act.click(Con).build().perform();
		Thread.sleep(2000);

		//Site Configuration
		driver.findElement(By.xpath("//a[text()=' Site Configuration']")).click();

		//Open Date button
		driver.findElement(By.xpath("(//button[@class='btn btn-outline-secondary fa fa-calendar'])[1]")).click();

		//Month
		WebElement month=driver.findElement(By.xpath("//select[@title='Select month']"));
		Select select3=new Select(month);
		select3.selectByVisibleText("Apr");

		//year

		WebElement year=driver.findElement(By.xpath("//select[@title='Select year']"));
		Select select4=new Select(year);
		select4.selectByVisibleText("2024");

		//date
		driver.findElement(By.xpath("//div[text()='17']")).click();

		//close Date button
		driver.findElement(By.xpath("(//button[@class='btn btn-outline-secondary fa fa-calendar'])[2]")).click();

		//Month
		WebElement month1=driver.findElement(By.xpath("//select[@title='Select month']"));
		Select select1=new Select(month1);
		select1.selectByVisibleText("Feb");

		//year

		WebElement year1=driver.findElement(By.xpath("//select[@title='Select year']"));
		Select select5=new Select(year1);
		select5.selectByVisibleText("2027");

		//date
		driver.findElement(By.xpath("//div[text()='17']")).click();

		//Space

//		//Total Square Ft:
//		driver.findElement(By.xpath("(//label[text()='Total Square Ft:']/../..//input[@class='form-control inpwidth logo ng-untouched ng-pristine ng-valid'])[1]")).sendKeys("5000");
//        Thread.sleep(2000);    
//		
//		//Total Office Square Ft:
//		driver.findElement(By.xpath("(//label[text()='Total Square Ft:']/../..//input[@class='form-control inpwidth logo ng-untouched ng-pristine ng-valid'])[2]")).sendKeys("35000");
//        Thread.sleep(2000);
//        
//		//Total Lab Square Ft:
//		driver.findElement(By.xpath("(//label[text()='Total Square Ft:']/../..//input[@class='form-control inpwidth logo ng-untouched ng-pristine ng-valid'])[3]")).sendKeys("3000");
//		Thread.sleep(2000);
//		
//		//Total Workstation Square Ft:
//		driver.findElement(By.xpath("(//div[@class='row mt-2 g-3 align-items-center']//input[@class='form-control inpwidth logo ng-untouched ng-pristine ng-valid'])[1]")).sendKeys("1500");
//		Thread.sleep(2000);
//		
//		//Total Public Lab Bench Square Ft
//		driver.findElement(By.xpath("(//div[@class='row mt-2 g-3 align-items-center']//input[@class='form-control inpwidth logo ng-untouched ng-pristine ng-valid'])[2]")).sendKeys("3000");
//		Thread.sleep(2000);
		
		 //Add row
        driver.findElement(SiteAdminLocatores.Add_row).click();
        Thread.sleep(2000);
        
        //Manufacturer
        String Manufacturer="Demo";
        driver.findElement(By.xpath("//input[@formcontrolname='manufacturer']")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname='manufacturer']")).sendKeys(Manufacturer);
        
        //Model
        driver.findElement(By.xpath("//input[@formcontrolname='model']")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname='model']")).sendKeys("B4- 32/1 New");
        
        //Quantity
        driver.findElement(By.xpath("//input[@formcontrolname='quantity']")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname='quantity']")).sendKeys("55");
        
        //value
        driver.findElement(By.xpath("//input[@formcontrolname='value']")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname='value']")).sendKeys("12556");
        
        //notes
        driver.findElement(By.xpath("//textarea[@formcontrolname='notes']")).clear();
        driver.findElement(By.xpath("//textarea[@formcontrolname='notes']")).sendKeys("Demo Test Demo Test");
        
        //
        driver.findElement(By.xpath("//span[@class='margin-right cursor-pointer submit']//i[@class='fa fa-check']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//span[text()=' "+Manufacturer+"']/../..//li[@class='fa fa-edit']")).click();
        Thread.sleep(2000);
        Manufacturer="Test";
        driver.findElement(By.xpath("//input[@formcontrolname='manufacturer']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@formcontrolname='manufacturer']")).sendKeys(Manufacturer);
        
        //Model
        driver.findElement(By.xpath("//input[@formcontrolname='model']")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname='model']")).sendKeys("B4- 32/1/44/33 New");
        
        //Quantity
        driver.findElement(By.xpath("//input[@formcontrolname='quantity']")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname='quantity']")).sendKeys("66");
        
        //value
        driver.findElement(By.xpath("//input[@formcontrolname='value']")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname='value']")).sendKeys("13566");
        
        //notes
        driver.findElement(By.xpath("//textarea[@formcontrolname='notes']")).clear();
        driver.findElement(By.xpath("//textarea[@formcontrolname='notes']")).sendKeys("Test Demo Test Demo");
        
        //right icon
        driver.findElement(By.xpath("//span[@class='margin-right cursor-pointer submit ng-star-inserted']//li[@class='fa fa-check']")).click();
        Thread.sleep(2000);
        
        //delete
        driver.findElement(By.xpath("//span[text()=' "+Manufacturer+"']/../..//li[@class='fa fa-trash ml-2']")).click();
	     Thread.sleep(2000);
        //delete button
       WebElement delete= driver.findElement(By.xpath("//button[text()='Delete']"));
       
       act.moveToElement(delete).perform();
       act.click(delete).perform();
       
	
	
	
	
	}
}
