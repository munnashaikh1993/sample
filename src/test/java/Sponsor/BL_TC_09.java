package Sponsor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import Browsers.Browser;

public class BL_TC_09 extends Browser{

	public static void searchpage() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS); 

		System.out.println("***************************BL_TC_09****************************************");


		//membership status
		WebElement dd= driver.findElement(By.xpath("(//div[@class='dropgap'])[1]"));

		Actions act=new Actions(driver);
		act.click(dd).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);


		//employees
		WebElement dd2= driver.findElement(By.xpath("(//div[@class='dropgap'])[2]"));


		act.click(dd2).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();        
		Thread.sleep(5000);


		//funding amount
		WebElement dd3= driver.findElement(By.xpath("(//div[@class='dropgap'])[3]"));


		act.click(dd3).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform(); 


		//funding source
		driver.findElement(By.xpath("(//button[text()=' Select options '])[1]")).click();//open location
		driver.findElement(By.xpath("(//label[text()=' Grant funded '])")).click();

		//clear
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//button[text()='Clear'])[2]")).click();

		
		
	
	}
	




}
