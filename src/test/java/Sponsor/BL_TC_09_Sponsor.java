package Sponsor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import Browsers.Browser;

public class BL_TC_09_Sponsor extends Browser{

	public static void searchpage() throws InterruptedException {
		 System.out.println("***************************BL_TC_09_Sponsor****************************************");
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);  
		Thread.sleep(2000); 
		
		//membership status
		WebElement dd= driver.findElement(By.xpath("//strong[text()='Membership Status']/..//select[contains(@class,'form-control dropbox')]"));

		Actions act=new Actions(driver);
		act.click(dd).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);


		//Company Size
		WebElement dd2= driver.findElement(By.xpath("//strong[text()='Company Size']/..//select[@class='form-control dropbox ng-untouched ng-pristine ng-valid']"));


		act.click(dd2).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();        
		Thread.sleep(2000);


		//funding amount
		WebElement dd3= driver.findElement(By.xpath("//strong[text()='Funding Amount']/..//select[@class='form-control dropbox ng-untouched ng-pristine ng-valid']"));


		act.click(dd3).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform(); 
		Thread.sleep(2000);

		//funding source
 		driver.findElement(By.xpath("//strong[text()='Funding Source']/..//button[@class='dropdown-toggle btn']")).click();//open location
 		driver.findElement(By.xpath("//label[text()=' Self-funded ']/..//input[@type='checkbox']")).click();
		

		
		
	
	}
	




}
